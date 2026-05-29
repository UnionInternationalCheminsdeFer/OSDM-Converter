package Gtm.actions;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.osgi.service.prefs.BackingStoreException;

import Gtm.GTMTool;
import Gtm.converter.Osdm2excelConverter;
import Gtm.presentation.GtmEditor;
import Gtm.presentation.GtmEditorPlugin;
import Gtm.utils.GtmUtils;



public class ExportExcelAction extends BasicGtmAction {
	
		
		protected IEditingDomainProvider editingDomainProvider = null;
		
		public ExportExcelAction(IEditingDomainProvider editingDomainProvider) {
			super("Export to Excel", editingDomainProvider);
			this.editingDomainProvider = editingDomainProvider;
			this.setToolTipText(this.getText());
			setImageDescriptor(GtmUtils.getImageDescriptor("/icons/48px-Crystal_Clear_action_playlist.png")); //$NON-NLS-1$
		}
		
		public ExportExcelAction(String text, IEditingDomainProvider editingDomainProvider) {
			super(text, editingDomainProvider);
			this.setToolTipText(this.getText());
			setImageDescriptor(GtmUtils.getImageDescriptor("/icons/48px-Crystal_Clear_action_playlist.png")); //$NON-NLS-1$
			this.editingDomainProvider = editingDomainProvider;
		}

		
		protected void run (IStructuredSelection structuredSelection) {
			
			final GTMTool tool = GtmUtils.getGtmTool();
			
			final GtmEditor editor = GtmUtils.getActiveEditor();
			
			if (tool == null) {
				MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
				dialog.setText(this.getText());
				dialog.setMessage(dialog.getText());
				dialog.open(); 
				return;
			}
			
			if (tool.getGeneralTariffModel() == null || 
				tool.getGeneralTariffModel().getDelivery() == null ) {
				MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
				dialog.setText("Delivery Data are missing");
				dialog.setMessage(dialog.getText());
				dialog.open(); 
				return;
			}
			
			if (tool.getGeneralTariffModel() == null || 
				tool.getGeneralTariffModel().getDelivery() == null || 
				tool.getGeneralTariffModel().getDelivery().getProvider() == null || 
				tool.getGeneralTariffModel().getDelivery().getProvider().getCode() == null 	) {
				
				MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
				dialog.setText("Fare Provider is missing in the Delivery Data");
				dialog.setMessage(dialog.getText());
				dialog.open(); 
				return;
			}
			
			if (tool.getGeneralTariffModel() == null || 
				tool.getGeneralTariffModel().getDelivery() == null || 
				tool.getGeneralTariffModel().getDelivery().getId()== null || 
				tool.getGeneralTariffModel().getDelivery().getId().length() < 1	) {	
				MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
				dialog.setText("Delivery ID is missing in the Delivery Data");
				dialog.setMessage(dialog.getText());
				dialog.open(); 
				return;
			}

			
			final String name = tool.getGeneralTariffModel().getDelivery().getProvider().getCode().trim() 
					+ "_" + tool.getGeneralTariffModel().getDelivery().getId().trim()+".xls"; //$NON-NLS-1$ //$NON-NLS-2$
            final String path = getFilePath(name);
			if (path == null || path.length() == 0) {
				return;
			}
			
			Osdm2excelConverter converter = new Osdm2excelConverter(tool);
			
			
			IRunnableWithProgress operation =	new IRunnableWithProgress() {
				// This is the method that gets invoked when the operation runs.

				public void run(IProgressMonitor monitor) {
					
					try {
						
						monitor.beginTask("Export to Excel file: " + path, 31); 

						GtmUtils.addWorkflowStep("Export started to Excel file: " + path, editor);
											
						monitor.subTask("Converting to Excel");

						monitor.subTask("Formatting Excel");	
						Workbook workbook =  converter.convert(monitor);
						
						FileOutputStream outputStream = new FileOutputStream(path);
						monitor.subTask("Writing Excel");	
						workbook.write(outputStream);
						workbook.close();
						outputStream.close();
						
						
						monitor.worked(1);
						
						GtmUtils.addWorkflowStep("Export completed to Excel file: " + path, editor);
						
					} catch (Exception e) {
						GtmUtils.addWorkflowStep("Export abandoned to Excel file: " + path, editor);
						GtmUtils.writeConsoleError("Export failed", editor);
						GtmUtils.writeConsoleStackTrace(e, editor);
						
					}  finally {
											
						monitor.done();
					}
				}
			};

			try {
				// This runs the operation, and shows progress.
				editor.disconnectViews();
				
				new ProgressMonitorDialog(editor.getSite().getShell()).run(true, false, operation);
			
				
			} catch (Exception e) {
				MessageBox dialog =  new MessageBox(editor.getSite().getShell(), SWT.ICON_ERROR | SWT.OK);
				dialog.setText("Export to Excel");
				if (e.getMessage()!= null) {
					dialog.setMessage(e.getMessage());
				} else {
					dialog.setMessage("Export to Excel Error");
					GtmUtils.writeConsoleStackTrace(e, editor);
				}
				dialog.open(); 
				GtmEditorPlugin.INSTANCE.log(e);
			} finally {
				editor.reconnectViews();
			}
		}		
		
		

		public String getText() {
			return "export Excel format (experimental)";
		}
  


		private String getFilePath(String name) {
		    Shell shell = Display.getDefault().getActiveShell();
		    shell.open();
		    FileDialog dialog = new FileDialog(shell, SWT.SAVE);
		    dialog.setFilterExtensions(new String[] { "*.xls"});  //$NON-NLS-1$
		    
		    String lastPath = getLastPath();
			dialog.setFilterPath(lastPath); 
			
			dialog.setOverwrite(true);
			
			dialog.setFileName(name);
			
		    String path = dialog.open();
		    
		    String directory = path.substring(0, path.lastIndexOf("."));

		    storeLastPath(directory);
		    
		    return path;
	    
		}

		private void storeLastPath(String path) {

			// saves plugin preferences at the workspace level
			 IEclipsePreferences prefs =  InstanceScope.INSTANCE.getNode(GtmEditorPlugin.PLUGIN_ID); // does all the above behind the scenes

			 if (path == null || path.isEmpty()) return;
			 
			  prefs.put("LAST_PATH_EXCEL", path); //$NON-NLS-1$
			  try {
			    // prefs are automatically flushed during a plugin's "super.stop()".
			    prefs.flush();
			  } catch(BackingStoreException e) {
			    // not important
			  }

		}

		private String getLastPath() {

		  IEclipsePreferences prefs = InstanceScope.INSTANCE.getNode(GtmEditorPlugin.PLUGIN_ID);
		  // you might want to call prefs.sync() if you're worried about others changing your settings
		  return prefs.get("LAST_PATH_EXCEL","c:\\"); //$NON-NLS-1$ //$NON-NLS-2$
		}

		
		

}

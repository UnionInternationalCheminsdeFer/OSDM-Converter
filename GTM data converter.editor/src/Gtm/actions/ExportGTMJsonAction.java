package Gtm.actions;

import java.io.File;
import java.io.IOException;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
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
import Gtm.SchemaVersion;
import Gtm.jsonImportExport.GtmJsonExporter;
import Gtm.jsonImportExport.GtmJsonExporterV14;
import Gtm.nls.NationalLanguageSupport;
import Gtm.presentation.DirtyCommand;
import Gtm.presentation.GtmEditor;
import Gtm.presentation.GtmEditorPlugin;
import Gtm.utils.GtmUtils;
import export.ExportFareDelivery;
import export.ExportFareDeliveryV14;



public class ExportGTMJsonAction extends BasicGtmAction {
	
		
		protected IEditingDomainProvider editingDomainProvider = null;
		
		public ExportGTMJsonAction(IEditingDomainProvider editingDomainProvider) {
			super(NationalLanguageSupport.ExportGTMJsonAction_0, editingDomainProvider);
			this.editingDomainProvider = editingDomainProvider;
			this.setToolTipText(this.getText());
			setImageDescriptor(GtmUtils.getImageDescriptor("/icons/exportGtm.png")); //$NON-NLS-1$
		}
		
		public ExportGTMJsonAction(String text, IEditingDomainProvider editingDomainProvider) {
			super(text, editingDomainProvider);
			this.setToolTipText(this.getText());
			setImageDescriptor(GtmUtils.getImageDescriptor("/icons/exportGtm.png")); //$NON-NLS-1$
			this.editingDomainProvider = editingDomainProvider;
		}

		
		protected void run (IStructuredSelection structuredSelection) {
			
			GTMTool tool = GtmUtils.getGtmTool();
			
			EditingDomain domain = GtmUtils.getActiveDomain();
			
			GtmEditor editor = GtmUtils.getActiveEditor();
			
			if (tool == null) {
				MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
				dialog.setText(NationalLanguageSupport.ExportGTMJsonAction_1);
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

			
			String name = tool.getGeneralTariffModel().getDelivery().getProvider().getCode().trim() 
					+ "_" + tool.getGeneralTariffModel().getDelivery().getId().trim()+".gtm.json"; //$NON-NLS-1$ //$NON-NLS-2$
            File file = getFile(name);
			if (file == null) {
				return;
			}
			
			GtmJsonExporter jsonModelExporterV12 = new GtmJsonExporter();
			GtmJsonExporterV14 jsonModelExporterV14 = new GtmJsonExporterV14();
	
			IRunnableWithProgress operation =	new IRunnableWithProgress() {
				// This is the method that gets invoked when the operation runs.

				public void run(IProgressMonitor monitor) {
					
					try {
						
						monitor.beginTask(NationalLanguageSupport.ExportGTMJsonAction_4, 31); 

						GtmUtils.addWorkflowStep("Export started to OSDM file: " + name, editor);
						
						monitor.subTask(NationalLanguageSupport.ExportGTMJsonAction_5);
						GtmUtils.deleteOrphanedObjects(domain, tool);
						prepareStructure(tool,domain);
						monitor.worked(1);
					
						monitor.subTask(NationalLanguageSupport.ExportGTMJsonAction_6);
						insertIds(tool,domain,editor);
						monitor.worked(1);
							
						gtm.FareDelivery faresV12 = null;
						gtmV14.FareDelivery faresV14 = null;
						monitor.subTask(NationalLanguageSupport.ExportGTMJsonAction_7);		
						if (tool.getGeneralTariffModel().getDelivery().getSchemaVersion().equals(SchemaVersion.V12)
						|| tool.getGeneralTariffModel().getDelivery().getSchemaVersion().equals(SchemaVersion.V00)
						|| tool.getGeneralTariffModel().getDelivery().getSchemaVersion().equals(SchemaVersion.V10)) {
							faresV12 = jsonModelExporterV12.convertToJson(tool.getGeneralTariffModel(), monitor);
							GtmUtils.writeConsoleInfo("Export to OSDM version 1.2", editor);
						} else if (tool.getGeneralTariffModel().getDelivery().getSchemaVersion().equals(SchemaVersion.V14)){
							faresV14 = jsonModelExporterV14.convertToJson(tool.getGeneralTariffModel(), monitor);						
							GtmUtils.writeConsoleInfo("Export to OSDM version 1.4", editor);
						}						
						monitor.worked(1);	 	
						monitor.subTask(NationalLanguageSupport.ExportGTMJsonAction_8);
						try {
							if (faresV12 != null) {
								ExportFareDelivery.exportFareDelivery(faresV12, file);
							} else if (faresV14 != null) {
								ExportFareDeliveryV14.exportFareDelivery(faresV14, file);
							}
						} catch (IOException ioe){
							GtmUtils.displayAsyncErrorMessage(ioe,"format error");
						} catch (Exception e) {
							GtmUtils.displayAsyncErrorMessage(e," file error");
						}
						monitor.worked(1);
						
						GtmUtils.addWorkflowStep("Export completed to OSDM file: " + name, editor);
						
					} catch (Exception e) {
						GtmUtils.addWorkflowStep("Export abandoned to OSDM file: " + name, editor);
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
			
				//workaround for wrong dirty indication
				domain.getCommandStack().execute(new DirtyCommand());
				
			} catch (Exception e) {
				MessageBox dialog =  new MessageBox(editor.getSite().getShell(), SWT.ICON_ERROR | SWT.OK);
				dialog.setText(NationalLanguageSupport.ExportGTMJsonAction_9);
				if (e.getMessage()!= null) {
					dialog.setMessage(e.getMessage());
				} else {
					dialog.setMessage(NationalLanguageSupport.ExportGTMJsonAction_10);
					GtmUtils.writeConsoleStackTrace(e, editor);
				}
				dialog.open(); 
				GtmEditorPlugin.INSTANCE.log(e);
			} finally {
				editor.reconnectViews();
			}
		}		
		
		


  
		private void insertIds(GTMTool tool,EditingDomain domain, GtmEditor editor) {
			
			GtmUtils.clearCommandStack(domain);
			
			CompoundCommand command =  GtmUtils.setIds(tool,domain);
			
			if (command != null && !command.isEmpty()) {
       	
				if (!command.canExecute()) {
					MessageBox dialog =  new MessageBox(editor.getSite().getShell(), SWT.ICON_ERROR | SWT.OK);
					dialog.setText(NationalLanguageSupport.ExportGTMJsonAction_12);
					dialog.open(); 
					return;
				}
	        	
	        	domain.getCommandStack().execute(command);
	        	
				GtmUtils.clearCommandStack(domain);
	        }
			
			command =  GtmUtils.setFareIds(tool,domain);
			
			if (command != null && !command.isEmpty()) {
	        	
				if (!command.canExecute()) {
					MessageBox dialog =  new MessageBox(editor.getSite().getShell(), SWT.ICON_ERROR | SWT.OK);
					dialog.setText(NationalLanguageSupport.ExportGTMJsonAction_12);
					dialog.open(); 
					return;
				}
	        	
	        	domain.getCommandStack().execute(command);
	        	
				GtmUtils.clearCommandStack(domain);
	        }

		}


		private File getFile(String name) {
		    Shell shell = Display.getDefault().getActiveShell();
		    shell.open();
		    FileDialog dialog = new FileDialog(shell, SWT.SAVE);
		    dialog.setFilterExtensions(new String[] { "*.json"});  //$NON-NLS-1$
		    
		    String lastPath = getLastPath();
			dialog.setFilterPath(lastPath); 
			
			dialog.setFileName(name);
			
		    String path = dialog.open();

		    storeLastPath(path);
		    File file = new File(path);
		    
		    return file;
	    
		}

		private void storeLastPath(String path) {

			// saves plugin preferences at the workspace level
			 IEclipsePreferences prefs =  InstanceScope.INSTANCE.getNode(GtmEditorPlugin.PLUGIN_ID); // does all the above behind the scenes

			 if (path == null || path.isEmpty()) return;
			 
			  prefs.put("LAST_PATH", path); //$NON-NLS-1$
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
		  return prefs.get("LAST_PATH","c:\\"); //$NON-NLS-1$ //$NON-NLS-2$
		}

		
		

}

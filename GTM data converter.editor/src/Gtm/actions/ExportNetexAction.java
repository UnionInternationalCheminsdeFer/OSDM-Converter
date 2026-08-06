package Gtm.actions;

import java.io.File;
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
import Gtm.preferences.PreferenceConstants;
import Gtm.preferences.PreferencesAccess;
import Gtm.presentation.GtmEditor;
import Gtm.presentation.GtmEditorPlugin;
import Gtm.utils.GtmUtils;
import osdm2netex.Osdm2netexConverter;
import uk.org.netex.netex.PublicationDeliveryStructure;



public class ExportNetexAction extends BasicGtmAction {
	
		
		protected IEditingDomainProvider editingDomainProvider = null;
		
		public ExportNetexAction(IEditingDomainProvider editingDomainProvider) {
			super("Export NeTEx Data (experimental)", editingDomainProvider);
			this.editingDomainProvider = editingDomainProvider;
			this.setToolTipText(this.getText());
			setImageDescriptor(GtmUtils.getImageDescriptor("/icons/icons8-biohazard-symbol-48.png")); //$NON-NLS-1$
		}
		
		public ExportNetexAction(String text, IEditingDomainProvider editingDomainProvider) {
			super(text, editingDomainProvider);
			this.setToolTipText(this.getText());
			setImageDescriptor(GtmUtils.getImageDescriptor("/icons/icons8-biohazard-symbol-48.png")); //$NON-NLS-1$
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
					+ "_" + tool.getGeneralTariffModel().getDelivery().getId().trim()+".netex.xml"; //$NON-NLS-1$ //$NON-NLS-2$
            final String path = getFilePath(name);
			if (path == null ) {
				return;
			}
			
			IRunnableWithProgress operation =	new IRunnableWithProgress() {
				// This is the method that gets invoked when the operation runs.

				public void run(IProgressMonitor monitor) {
					
					try {
						
						String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
						
						if (PreferencesAccess.getBoolFromPreferenceStore(PreferenceConstants.P_NETEX_SPLIT_EXPORT)) {
						
							monitor.beginTask("Export NeTEx", 79); 
							
							for (int i = 0; i < alpha.length() ; i++) {
								
								if (monitor.isCanceled()) {
									monitor.subTask("Cancel Export");	
									GtmUtils.addWorkflowStep("Export cancelled", editor);
				                } else {								
								
									String filterLetter = alpha.substring(i, i +1 );
									
									GtmUtils.addWorkflowStep("Converting ODs: " + filterLetter + "...", editor);
	
									monitor.subTask("Converting to NeTEx");	
									Osdm2netexConverter converter = new Osdm2netexConverter(tool);
									PublicationDeliveryStructure netex =  converter.convert(monitor, filterLetter);
									
									if (netex != null) {

										if (!monitor.isCanceled()) {
										
											int index = path.indexOf(".netex.xml");
											
											String name = path.substring(0,index) + "_" + filterLetter + "_" + ".netex.xml";
											File file = new File(name);
											
											GtmUtils.addWorkflowStep("Export started to Netex file: " + file.getName(), editor);
										
											monitor.subTask("Formatting XML");							
											converter.writeNeTexFile(netex, file, monitor);
										
											GtmUtils.addWorkflowStep("Export completed to NeTEx file: " + file.getName(), editor);
										}
									} else {
										monitor.worked(3);
									}
				                }
							}
													
						} else {

							monitor.beginTask("Export NeTEx", 3); 
							
							File file = new File(path);
							
							GtmUtils.addWorkflowStep("Export started to Netex file: " + file.getName(), editor);
							
							monitor.subTask("Converting to NeTEx");	
							Osdm2netexConverter converter = new Osdm2netexConverter(tool);
							PublicationDeliveryStructure netex =  converter.convert(monitor, null);
							
							monitor.subTask("Formatting XML");							
							converter.writeNeTexFile(netex, file, monitor);
						
							GtmUtils.addWorkflowStep("Export completed to NeTEx file: " + file.getName(), editor);
						}
							
					} catch (Exception e) {
						GtmUtils.addWorkflowStep("NeTEx Export abandoned", editor);
					}  finally {
											
						monitor.done();
					}
				}
			};

			try {
				// This runs the operation, and shows progress.
				editor.disconnectViews();
				
				new ProgressMonitorDialog(editor.getSite().getShell()).run(true, true, operation);
			
				
			} catch (Exception e) {
				GtmUtils.writeConsoleError("Export failed", editor);
				GtmUtils.writeConsoleStackTrace(e, editor);
				
				MessageBox dialog =  new MessageBox(editor.getSite().getShell(), SWT.ICON_ERROR | SWT.OK);
				dialog.setText("Export NeTEx");
				if (e.getMessage()!= null) {
					dialog.setMessage(e.getMessage());
				} else {
					dialog.setMessage("Export NeTEx Error");
					GtmUtils.writeConsoleStackTrace(e, editor);
				}
				dialog.open(); 
				GtmEditorPlugin.INSTANCE.log(e);
			} finally {
				editor.reconnectViews();
			}
		}		
		
		

		public String getText() {
			return "export NeTEx format (experimental)";
		}
  


		private String getFilePath(String name) {
		    Shell shell = Display.getDefault().getActiveShell();
		    shell.open();
		    FileDialog dialog = new FileDialog(shell, SWT.SAVE);
		    dialog.setFilterExtensions(new String[] { "*.xml"});  //$NON-NLS-1$
		    
		    String lastPath = getLastPath();
			dialog.setFilterPath(lastPath); 
			
			dialog.setFileName(name);
			
		    String path = dialog.open();

		    storeLastPath(path);
		    if (path == null) {
		    	path = lastPath;
		    }

		    return path;
	    
		}

		private void storeLastPath(String path) {

			// saves plugin preferences at the workspace level
			 IEclipsePreferences prefs =  InstanceScope.INSTANCE.getNode(GtmEditorPlugin.PLUGIN_ID); // does all the above behind the scenes

			 if (path == null || path.isEmpty()) return;
			 
			  prefs.put("LAST_PATH_NETEX", path); //$NON-NLS-1$
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
		  return prefs.get("LAST_PATH_NETEX","c:\\"); //$NON-NLS-1$ //$NON-NLS-2$
		}

		
		

}

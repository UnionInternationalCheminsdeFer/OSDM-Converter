package Gtm.actions;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;

import Gtm.GTMTool;
import Gtm.legacyImportExport.LegacyExporter;
import Gtm.nls.NationalLanguageSupport;
import Gtm.presentation.GtmEditor;
import Gtm.utils.GtmUtils;


public class ExportLegacyAction extends BasicGtmAction {
	
		
		protected IEditingDomainProvider editingDomainProvider = null;
	
		public ExportLegacyAction(IEditingDomainProvider editingDomainProvider) {
			super(NationalLanguageSupport.ExportLegacyAction_0, editingDomainProvider);
			this.setToolTipText(this.getText());
			setImageDescriptor(GtmUtils.getImageDescriptor("/icons/exportLegacy.png")); //$NON-NLS-1$
			this.editingDomainProvider = editingDomainProvider;
		}
		
		public ExportLegacyAction(String text, IEditingDomainProvider editingDomainProvider) {
			super(text, editingDomainProvider);
			this.setToolTipText(this.getText());
			setImageDescriptor(GtmUtils.getImageDescriptor("/icons/exportLegacy.png")); //$NON-NLS-1$
			this.editingDomainProvider = editingDomainProvider;
		}
	
	    
		protected Path getPath(String text){
			
	        DirectoryDialog fd = new DirectoryDialog(Display.getDefault().getActiveShell(), SWT.SAVE);
	        fd.setText(text);
	        String path = fd.open();
	        
	        if (path == null || path.length() < 1 ) return null;
	        
	        return Paths.get(path);
	        
			
		}
		
		
		protected void run (IStructuredSelection structuredSelection) {
			
			GTMTool tool = GtmUtils.getGtmTool();
			
			GtmEditor editor = GtmUtils.getActiveEditor();
			
			if (tool == null) {
				MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
				dialog.setText(NationalLanguageSupport.ExportLegacyAction_1);
				dialog.open(); 
				return;
			}
			
			if (tool.getConversionFromLegacy().getLegacy108().getCarrier() == null) {
				MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
				dialog.setText("Carrier is missing");
				dialog.open(); 
				return;
			}
			
			Path path =  getPath(NationalLanguageSupport.ExportLegacyAction_2);
			if (path == null) return;
			
			LegacyExporter exporter = new LegacyExporter(tool, path, editor);

			
			IRunnableWithProgress operation =	new IRunnableWithProgress() {
				// This is the method that gets invoked when the operation runs.

				public void run(IProgressMonitor monitor) {
					
					monitor.beginTask(NationalLanguageSupport.ExportLegacyAction_3, exporter.getMonitorTasks()); 
					
					GtmUtils.addWorkflowStep("Export to 108 started for carrier: " + tool.getConversionFromLegacy().getLegacy108().getCarrier().getName(), editor);
					
					exporter.export(monitor);
					
					GtmUtils.addWorkflowStep("Export to 108 completed for carrier: " + tool.getConversionFromLegacy().getLegacy108().getCarrier().getName(), editor);

					monitor.done();
				}
			};	
			try {
				// This runs the operation, and shows progress.
				editor.disconnectViews();
		
				new ProgressMonitorDialog(editor.getSite().getShell()).run(true, false, operation);

			} catch (Exception e) {
					// Something went wrong that shouldn't.
					GtmUtils.addWorkflowStep("Export to 108 abandoned for carrier: " + tool.getConversionFromLegacy().getLegacy108().getCarrier().getName(), editor);
					GtmUtils.writeConsoleStackTrace(e, editor);
					GtmUtils.writeConsoleError("Export to 108 files failed", editor);
			} finally {
					editor.reconnectViews();
			}			

			return;

		}

	

}

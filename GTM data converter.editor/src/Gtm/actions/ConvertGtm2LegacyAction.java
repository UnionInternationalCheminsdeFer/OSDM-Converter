package Gtm.actions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.SetCommand;
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

import Gtm.Country;
import Gtm.GTMTool;
import Gtm.GtmPackage;
import Gtm.converter.ConverterToLegacy;
import Gtm.nls.NationalLanguageSupport;
import Gtm.presentation.GtmEditor;
import Gtm.utils.GtmUtils;


public class ConvertGtm2LegacyAction extends BasicGtmAction {
	
		
		protected IEditingDomainProvider editingDomainProvider = null;
		
		public ConvertGtm2LegacyAction(IEditingDomainProvider editingDomainProvider) {
			super(NationalLanguageSupport.ConvertGtm2LegacyAction_0, editingDomainProvider);
			setImageDescriptor(GtmUtils.getImageDescriptor("/icons/convertToLegacy.png")); //$NON-NLS-1$
			this.setToolTipText(this.getText());
			this.editingDomainProvider = editingDomainProvider;
		}
		
		public ConvertGtm2LegacyAction(String text, IEditingDomainProvider editingDomainProvider) {
			super(text, editingDomainProvider);
			this.setToolTipText(this.getText());
			setImageDescriptor(GtmUtils.getImageDescriptor("/icons/convertToLegacy.png")); //$NON-NLS-1$
			this.editingDomainProvider = editingDomainProvider;
		}

    
		protected BufferedReader getReader(String text){
			
	        FileDialog fd = new FileDialog( Display.getDefault().getActiveShell(), SWT.READ_ONLY);
	        fd.setText(text);
	        String[] filterExt = { "*.txt" }; //$NON-NLS-1$
	        fd.setFilterExtensions(filterExt);
	        String path = fd.open();
	        
	        if (path == null || path.length() < 1 ) return null;
	        
	        File file = new File(path);
	        
	        BufferedReader br;
			try {
				br = new BufferedReader(new FileReader(file));
			} catch (FileNotFoundException e) {
				MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
				dialog.setText(NationalLanguageSupport.ConvertGtm2LegacyAction_2);
				dialog.setMessage(e.getMessage());
				dialog.open(); 
				e.printStackTrace();
				return null;
			} 
	        
	        return br;

			
		}
		
		protected void run (IStructuredSelection structuredSelection) {
			
			final GTMTool tool = GtmUtils.getGtmTool();
			
			final GtmEditor editor = GtmUtils.getActiveEditor();
			
			if (tool == null) {
				MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
				dialog.setText(NationalLanguageSupport.ConvertGtm2LegacyAction_3);
				dialog.open(); 
				return;
			}
			
			
			Country recommendedCountry = GtmUtils.getRecommendedCountry(tool);		
			Country country = tool.getConversionFromLegacy().getParams().getCountry();
			final EditingDomain domain = GtmUtils.getActiveDomain();

			if (country == null) {
				Command com = SetCommand.create(domain,tool.getConversionFromLegacy().getParams(), GtmPackage.Literals.CONVERSION_PARAMS__COUNTRY, recommendedCountry);
				if (com.canExecute()) {
					domain.getCommandStack().execute(com);
					country = recommendedCountry;
				}
			}
			
			if (country != null && recommendedCountry != null && !(country.equals(recommendedCountry)) ) {
				MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_QUESTION | SWT.OK| SWT.CANCEL);
				StringBuilder sb = new StringBuilder();
				String recommended = GtmUtils.getLabelText(recommendedCountry);
				sb.append("The main country in the data is ").append(recommended);
				dialog.setText(sb.toString());
				dialog.setMessage("Do you want to change your parameters to " + recommended + "?");
				int returnCode = dialog.open(); 
				if (returnCode == SWT.CANCEL) {
					//do nothing
				} else {
					Command com = SetCommand.create(domain,tool.getConversionFromLegacy().getParams(), GtmPackage.Literals.CONVERSION_PARAMS__COUNTRY, recommendedCountry);
					if (com.canExecute()) {
						domain.getCommandStack().execute(com);
						country = recommendedCountry;
					}
				}
			}
			
			
			if (country == null) {
				String message = NationalLanguageSupport.ConvertGtm2LegacyAction_CountryMissing;
				GtmUtils.writeConsoleWarning(message, null);
				MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
				dialog.setText(message);
				dialog.open(); 
				return;
			}
			
			final Country finalCountry = country;
			
			if (domain == null) return;
			
			
			final ConverterToLegacy converter = new ConverterToLegacy(tool,editor,domain);
			
			
			IRunnableWithProgress operation =	new IRunnableWithProgress() {
				// This is the method that gets invoked when the operation runs.

				public void run(IProgressMonitor monitor) {
					
					monitor.beginTask(NationalLanguageSupport.ConvertGtm2LegacyAction_6, converter.getMonitorTasks() + 1); 

					GtmUtils.addWorkflowStep("Conversion to 108 started for country: " + finalCountry.getName(), editor);
					
					monitor.subTask(NationalLanguageSupport.ConvertGtm2LegacyAction_7);
					prepareStructure(tool,domain);
					monitor.worked(1);
					
					int created = converter.convert(monitor);
					String message = NationalLanguageSupport.ConvertGtm2LegacyAction_8 + Integer.toString(created);
					GtmUtils.writeConsoleInfo(message, editor);
					
					GtmUtils.addWorkflowStep("Conversion to 108 completed for country: " + finalCountry.getName(), editor);

					monitor.done();
				}
			};	
			try {
				// This runs the operation, and shows progress.
				editor.disconnectViews();
				
				Shell shell = editor.getSite().getShell();
		
				new ProgressMonitorDialog(shell).run(true, false, operation);

			} catch (Exception exception) {
				// Something went wrong that shouldn't.
				GtmUtils.addWorkflowStep("Conversion to 108 abandoned for country: " + finalCountry.getName(), editor);

				GtmUtils.displayAsyncErrorMessage(exception, "unknown error");	
				GtmUtils.writeConsoleStackTrace(exception, editor);
			} finally {
				editor.reconnectViews();
			}			

			return;

		}

}

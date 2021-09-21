package Gtm.actions;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;

import Gtm.Country;
import Gtm.FareTemplate;
import Gtm.GTMTool;
import Gtm.LegacyFareTemplates;
import Gtm.TravelerType;
import Gtm.converter.ConverterFromLegacy;
import Gtm.nls.NationalLanguageSupport;
import Gtm.presentation.GtmEditor;
import Gtm.utils.GtmUtils;


/**
 * The Class ConvertLegacy2GtmAction.
 * 
 * conversion from legacy 108 data to OSDM 
 */
public class ConvertLegacy2GtmAction extends BasicGtmAction {
	
		
		/** The editing domain provider. */
		protected IEditingDomainProvider editingDomainProvider = null;
		
		/**
		 * Instantiates a new convert legacy 2 gtm action.
		 *
		 * @param editingDomainProvider the editing domain provider
		 */
		public ConvertLegacy2GtmAction(IEditingDomainProvider editingDomainProvider) {
			super(NationalLanguageSupport.ConvertLegacy2GtmAction_0, editingDomainProvider);
			this.setToolTipText(this.getText());
			setImageDescriptor(GtmUtils.getImageDescriptor("/icons/convertFromLegacy.png")); //$NON-NLS-1$
			this.editingDomainProvider = editingDomainProvider;
		}
			
		
		/**
		 * Instantiates a new convert legacy 2 gtm action.
		 *
		 * @param text the text
		 * @param editingDomainProvider the editing domain provider
		 */
		public ConvertLegacy2GtmAction(String text, IEditingDomainProvider editingDomainProvider) {
			super(text, editingDomainProvider);
			setImageDescriptor(GtmUtils.getImageDescriptor("/icons/convertFromLegacy.png")); //$NON-NLS-1$
			this.editingDomainProvider = editingDomainProvider;
			this.setToolTipText(this.getText());
		}

		
		
		/**
		 * Run.
		 *
		 * @param structuredSelection the structured selection
		 */
		protected void run (IStructuredSelection structuredSelection) {
			
			EditingDomain domain = GtmUtils.getActiveDomain();
			if (domain == null) return;
			
			GtmEditor editor = GtmUtils.getActiveEditor(); 
			
			GTMTool tool = GtmUtils.getGtmTool();
			
			if (tool == null) {
				MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
				dialog.setText(NationalLanguageSupport.ConvertLegacy2GtmAction_1);
				dialog.open(); 
				return;
			}
			
			Country country = tool.getConversionFromLegacy().getParams().getCountry();
			if (country == null) {
				String message = NationalLanguageSupport.ConvertGtm2LegacyAction_CountryMissing;
				GtmUtils.writeConsoleError(message, editor);
				MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
				dialog.setText(message);
				dialog.open(); 
				return;
			}
			
			if (tool.getConversionFromLegacy().getParams().getLegacyFareTemplates() == null || 
				tool.getConversionFromLegacy().getParams().getLegacyFareTemplates().getFareTemplates().isEmpty()	) {
				String message = NationalLanguageSupport.ConvertLegacy2GtmAction_FareTemplatesMissing;
				GtmUtils.writeConsoleError(message, editor);
				MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
				dialog.setText(NationalLanguageSupport.ConvertLegacy2GtmAction_FareTemplatesMissing);
				dialog.open(); 
				return;
			}
			
			if (noKids(tool.getConversionFromLegacy().getParams().getLegacyFareTemplates())) {
				String message = "The fare templates don't include child fares!";
				String question = "Do you want to continue with incomplete data?";		
				boolean result = MessageDialog.openQuestion(Display.getDefault().getActiveShell(), message, question);
				if (!result) {
					return;
				}
				GtmUtils.writeConsoleError(message, editor);
			}
			
			if (noAdults(tool.getConversionFromLegacy().getParams().getLegacyFareTemplates())) {
				String message = "The fare templates don't include adult fares!";
				String question = "Do you want to continue with incomplete data?";		
				boolean result = MessageDialog.openQuestion(Display.getDefault().getActiveShell(), message, question);
				if (!result) {
					return;
				}
				GtmUtils.writeConsoleError(message, editor);
			}
			
			ConverterFromLegacy converter = new ConverterFromLegacy(tool,domain,editor);
			
			IRunnableWithProgress operation =	new IRunnableWithProgress() {
				// This is the method that gets invoked when the operation runs.

				public void run(IProgressMonitor monitor) {
					
					monitor.beginTask(NationalLanguageSupport.ConvertLegacy2GtmAction_4, 107); 
					
					GtmUtils.addWorkflowStep("Conversion to OSDM started for country: " + country.getName(), editor);

					monitor.subTask(NationalLanguageSupport.ConvertLegacy2GtmAction_5);
					prepareStructure(tool, domain);
					monitor.worked(1);
						
					monitor.subTask(NationalLanguageSupport.ConvertLegacy2GtmAction_6);						
					int deleted = converter.deleteOldConversionResults();
					GtmUtils.writeConsoleInfo(NationalLanguageSupport.ConvertLegacy2GtmAction_7 + Integer.toString(deleted),editor);
					monitor.worked(1);
					
					converter.initializeConverter();
								
					monitor.subTask(NationalLanguageSupport.ConvertLegacy2GtmAction_16);
					int added = converter.convertToGtm(monitor);
					GtmUtils.writeConsoleInfo(NationalLanguageSupport.ConvertLegacy2GtmAction_17 + Integer.toString(added),editor);
					monitor.worked(1);

					GtmUtils.addWorkflowStep("Conversion to OSDM completed for country: " + country.getName(), editor);
					
					monitor.done();
				}
			};
			try {
				// This runs the operation, and shows progress.
				editor.disconnectViews();

				new ProgressMonitorDialog(editor.getSite().getShell()).run(true, false, operation);

			} catch (Exception e) {
				
				GtmUtils.addWorkflowStep("Conversion to OSDM abandoned for country: " + country.getName(), editor);
				
				MessageBox dialog =  new MessageBox(editor.getSite().getShell(), SWT.ICON_ERROR | SWT.OK);
				dialog.setText(NationalLanguageSupport.ExportGTMJsonAction_9);
				if (e.getMessage()!= null) {
					dialog.setMessage(e.getMessage());
				} else {
					dialog.setMessage(NationalLanguageSupport.ExportGTMJsonAction_10);
					GtmUtils.writeConsoleStackTrace(e, editor);
				}
				dialog.open(); 
			} finally {
				editor.reconnectViews();
			}

				
		}


		private boolean noAdults(LegacyFareTemplates legacyFareTemplates) {
			for (FareTemplate t: legacyFareTemplates.getFareTemplates()) {
				
				if (t.getPassengerConstraint() != null && 
					t.getPassengerConstraint().getTravelerType().equals(TravelerType.ADULT)) {
					return false;
				}
			}
			return true;
		}


		private boolean noKids(LegacyFareTemplates legacyFareTemplates) {

			for (FareTemplate t: legacyFareTemplates.getFareTemplates()) {
				
				if (t.getPassengerConstraint() != null && 
					t.getPassengerConstraint().getTravelerType().equals(TravelerType.CHILD)) {
					return false;
				}
			}
			return true;
		}


}

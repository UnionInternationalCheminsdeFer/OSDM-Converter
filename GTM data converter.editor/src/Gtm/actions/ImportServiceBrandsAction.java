package Gtm.actions;

import java.io.BufferedReader;
import java.io.IOException;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;

import Gtm.GTMTool;
import Gtm.GtmFactory;
import Gtm.GtmPackage;
import Gtm.ServiceBrand;
import Gtm.ServiceBrands;
import Gtm.TransportMode;
import Gtm.converter.ServiceBrandComparator;
import Gtm.nls.NationalLanguageSupport;
import Gtm.presentation.GtmEditor;
import Gtm.utils.GtmUtils;

public class ImportServiceBrandsAction extends ImportCsvDataAction {


	public ImportServiceBrandsAction(IEditingDomainProvider editingDomainProvider) {
		super(NationalLanguageSupport.ImportServiceBrandsAction_0, editingDomainProvider);
		this.setToolTipText(this.getText());
		setImageDescriptor(GtmUtils.getImageDescriptor("/icons/importBrands.png")); //$NON-NLS-1$
	}

	protected void run (IStructuredSelection structuredSelection) {
		
		GTMTool tool = GtmUtils.getGtmTool();
		
		GtmEditor editor = GtmUtils.getActiveEditor(); 
		
		EditingDomain domain = GtmUtils.getActiveDomain();
		if (domain == null) return;
		
		if (tool == null) {
			MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
			dialog.setText(NationalLanguageSupport.ImportServiceBrandsAction_1);
			dialog.open(); 
			return;
		}
		
		BufferedReader br = super.getReader(NationalLanguageSupport.ImportServiceBrandsAction_4);

		if (br == null) return;
		
		IRunnableWithProgress operation =	new IRunnableWithProgress() {
			// This is the method that gets invoked when the operation runs.

			public void run(IProgressMonitor monitor) {
				
				try {
					
					monitor.beginTask(NationalLanguageSupport.ImportServiceBrandsAction_5, 250); 
					
					GtmUtils.addWorkflowStep("Import of service brands started", editor);
							
					monitor.subTask(NationalLanguageSupport.ImportServiceBrandsAction_6);
					prepareStructure(tool, domain);
					monitor.worked(10);

					monitor.subTask(NationalLanguageSupport.ImportServiceBrandsAction_7);
			    	
			    	ServiceBrands newBrands = GtmFactory.eINSTANCE.createServiceBrands();

			        String st; 
			        boolean isFirstLine = true;
					CompoundCommand command =  new CompoundCommand();
					
					while ((st = br.readLine()) != null) {
						
						ServiceBrand brand = decodeLine(st);
						
						if (!isFirstLine) {
							if (brand != null) {
								newBrands.getServiceBrands().add(brand);	
							}
						} else {
							isFirstLine = false;
						}
					}

			        
			        int added = 0;
			        int updated = 0;

			        
					monitor.subTask(NationalLanguageSupport.ImportServiceBrandsAction_8);
					for (ServiceBrand newBrand : newBrands.getServiceBrands()) {
				       	
			        	ServiceBrand brand = tool.getCodeLists().getServiceBrands().findServiceBRand(newBrand.getCode());
			        	
			        	if (brand == null) {
			        		Command cmd2 = new AddCommand(domain, tool.getCodeLists().getServiceBrands().getServiceBrands(), newBrand);
			        		command.append(cmd2);
			        		added++;
			        	} else {
			        		Command cmd2 = new SetCommand(domain, brand, GtmPackage.Literals.SERVICE_BRAND__NAME, newBrand.getName());
			                command.append(cmd2);
			        		Command cmd3 = new SetCommand(domain, brand, GtmPackage.Literals.SERVICE_BRAND__ABBREVIATION, newBrand.getAbbreviation());
			                command.append(cmd3);        	
			        		Command cmd4 = new SetCommand(domain, brand, GtmPackage.Literals.SERVICE_BRAND__DESCRIPTION, newBrand.getDescription());
			                command.append(cmd4);   
			        		Command cmd5 = new SetCommand(domain, brand, GtmPackage.Literals.SERVICE_BRAND__TRANSPORT_MODE, newBrand.getTransportMode());
			                command.append(cmd5);   			                
			                updated++;
			           	}
			        			
			        }
			        
			        if (command != null && !command.isEmpty()) {
			        	domain.getCommandStack().execute(command);
						GtmUtils.writeConsoleInfo(NationalLanguageSupport.ImportServiceBrandsAction_9 + Integer.toString(added), editor ); //$NON-NLS-2$
						GtmUtils.writeConsoleInfo(NationalLanguageSupport.ImportServiceBrandsAction_11 + Integer.toString(updated), editor ); //$NON-NLS-2$
			        }	
					monitor.worked(10);
					
					ECollections.sort(tool.getCodeLists().getServiceBrands().getServiceBrands(), new ServiceBrandComparator());			
					
					GtmUtils.addWorkflowStep("Import of service brands completed", editor);
					
					monitor.done();
					
				} catch (IOException e) {
					GtmUtils.addWorkflowStep("Import of service brands abandoned", editor);
					GtmUtils.writeConsoleStackTrace(e, editor);
					return;			
				} finally {
					monitor.done();
				}
			}
		};
		try {
			// This runs the operation, and shows progress.
			editor.disconnectViews();
			new ProgressMonitorDialog(editor.getSite().getShell()).run(true, false, operation);
		} catch (Exception exception) {
			GtmUtils.displayAsyncErrorMessage(exception, NationalLanguageSupport.ImportServiceBrandsAction_13);
		} finally {
		editor.reconnectViews();
		}

		
	}


	private ServiceBrand decodeLine(String st) {
		String[] strings = splitCsv(st);
		
		if (strings.length < 3) return null;
		
		try {
			if (strings[0].length() < 4) {
				ServiceBrand brand = GtmFactory.eINSTANCE.createServiceBrand();
				brand.setCode(Integer.parseInt(strings[0]));
				brand.setAbbreviation(strings[1].trim());
				brand.setName(strings[2].trim());
				brand.setDescription(strings[3].trim());
				
				try {
					if (strings.length > 4) {
						int tm = Integer.parseInt(strings[4]);
						TransportMode mode = TransportMode.get(tm);
						if (mode != null) {
							brand.setTransportMode(mode);
						}
					}
				} catch (Exception e) {
					GtmUtils.writeConsoleError("service brand transport mode not recognized in " + GtmUtils.getLabelText(brand), null);
				}
				return brand;
			}
		} catch (Exception e){
			return null;
		}
		return null;

	}

}

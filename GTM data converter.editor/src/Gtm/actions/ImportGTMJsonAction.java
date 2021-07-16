package Gtm.actions;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
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

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import Gtm.GTMTool;
import Gtm.GeneralTariffModel;
import Gtm.GtmFactory;
import Gtm.GtmPackage;
import Gtm.Station;
import Gtm.converter.StationNameMerger;
import Gtm.jsonImportExport.GTMJsonImporter;
import Gtm.nls.NationalLanguageSupport;
import Gtm.presentation.GtmEditor;
import Gtm.presentation.GtmEditorPlugin;
import Gtm.utils.GtmUtils;
import export.ImportFareDelivery;
import gtm.FareDef;
import gtm.FareDelivery;
import gtm.StationNamesDef;


public class ImportGTMJsonAction extends BasicGtmAction {
	
		
		protected IEditingDomainProvider editingDomainProvider = null;
		
		public ImportGTMJsonAction(IEditingDomainProvider editingDomainProvider) {
			super(NationalLanguageSupport.ImportGTMJsonAction_0, editingDomainProvider);
			this.setToolTipText(this.getText());
			setImageDescriptor(GtmUtils.getImageDescriptor("/icons/importGtm.png")); //$NON-NLS-1$
			this.editingDomainProvider = editingDomainProvider;
		}
		
		public ImportGTMJsonAction(String text, IEditingDomainProvider editingDomainProvider) {
			super(text, editingDomainProvider);
			this.setToolTipText(this.getText());
			setImageDescriptor(GtmUtils.getImageDescriptor("/icons/importGtm.png")); //$NON-NLS-1$
			this.editingDomainProvider = editingDomainProvider;
		}

   
		protected File getFile(){
			
	        FileDialog fd = new FileDialog( Display.getDefault().getActiveShell(), SWT.READ_ONLY);
	        fd.setText(NationalLanguageSupport.ImportGTMJsonAction_1);
	        String[] filterExt = { "*.json" }; //$NON-NLS-1$
	        fd.setFilterExtensions(filterExt);
	        String path = fd.open();
	        
	        if (path == null || path.length() < 1 ) return null;
	        
	        return new File(path);
			
		}
		
		
		protected void run (IStructuredSelection structuredSelection) {
			
			GTMTool tool = GtmUtils.getGtmTool();
			
			GtmEditor editor = GtmUtils.getActiveEditor();
			
			EditingDomain domain = GtmUtils.getActiveDomain();
			
			if (tool == null) {
				MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
				dialog.setText(NationalLanguageSupport.ImportGTMJsonAction_3);
				dialog.open(); 
				return;
			}
			
			if (tool.getCodeLists() == null ||
				tool.getCodeLists().getStations() == null ||
				tool.getCodeLists().getStations().getStations() == null ||
				tool.getCodeLists().getStations().getStations().isEmpty()
				) {
				MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
				dialog.setText(NationalLanguageSupport.ImportGTMJsonAction_10);
				dialog.open(); 
				return;
			}
			
			if (tool.getCodeLists() == null ||
				tool.getCodeLists().getCarriers() == null ||
				tool.getCodeLists().getCarriers().getCarriers() == null ||
				tool.getCodeLists().getCarriers().getCarriers().isEmpty()
				) {
				MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
				dialog.setText(NationalLanguageSupport.ImportGTMJsonAction_11);
				dialog.open(); 
				return;
			}
			
			if (tool.getCodeLists() == null ||
				tool.getCodeLists().getServiceBrands() == null ||
				tool.getCodeLists().getServiceBrands().getServiceBrands() == null ||
				tool.getCodeLists().getServiceBrands().getServiceBrands().isEmpty()
				) {
				MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
				dialog.setText(NationalLanguageSupport.ImportGTMJsonAction_12);
				dialog.open(); 
				return;
			}
			
			if (tool.getCodeLists() == null ||
				tool.getConversionFromLegacy() == null ||
				tool.getConversionFromLegacy().getLegacy108() == null ||
				tool.getConversionFromLegacy().getLegacy108().getLegacyBorderPoints() == null ||
				tool.getConversionFromLegacy().getLegacy108().getLegacyBorderPoints().getLegacyBorderPoints() == null ||
				tool.getConversionFromLegacy().getLegacy108().getLegacyBorderPoints().getLegacyBorderPoints().isEmpty()
				) {
				MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
				dialog.setText(NationalLanguageSupport.ImportGTMJsonAction_13);
				dialog.open(); 
				return;
			}			
			
			if (tool.getCodeLists() != null &&
				tool.getConversionFromLegacy() != null &&
				tool.getConversionFromLegacy().getParams() != null &&
				(
				 tool.getConversionFromLegacy().getParams().getLegacyFareTemplates() != null &&
  				 !tool.getConversionFromLegacy().getParams().getLegacyFareTemplates().getFareTemplates().isEmpty()
				) || (
				 tool.getConversionFromLegacy().getParams().getLegacyStationToServiceBrandMappings() != null &&
				 !tool.getConversionFromLegacy().getParams().getLegacyStationToServiceBrandMappings().getLegacyStationToServiceBrandMappings().isEmpty()	
				)		
				) {
				MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_QUESTION | SWT.OK| SWT.CANCEL);
				dialog.setText("Importing OSDM fares will delete fare templates and station to service constraint mappings.");
				dialog.setMessage("Do you want to continue?");
				int returnCode = dialog.open(); 
				if (returnCode == SWT.CANCEL) {
					return;
				} else {
					
					SetCommand command = new SetCommand(domain, tool, GtmPackage.Literals.CONVERSION_PARAMS__LEGACY_FARE_TEMPLATES, GtmFactory.eINSTANCE.createLegacyFareTemplates());
					if (command.canExecute()) {
						domain.getCommandStack().execute(command);
					}	
					Command command2 = new SetCommand(domain, tool, GtmPackage.Literals.CONVERSION_PARAMS__LEGACY_STATION_TO_SERVICE_BRAND_MAPPINGS, GtmFactory.eINSTANCE.createLegacyStationToServiceConstraintMappings());
					if (command2.canExecute()) {
						domain.getCommandStack().execute(command2);
					}
				}
			}	
			
			
			
			
			File file = getFile();
			if (file == null) return;
			
			GTMJsonImporter importer = new GTMJsonImporter(tool, domain, editor);
			
			IRunnableWithProgress operation =	new IRunnableWithProgress() {
				// This is the method that gets invoked when the operation runs.

				public void run(IProgressMonitor monitor) {
					
					try {
					
						monitor.beginTask(NationalLanguageSupport.ImportGTMJsonAction_4, 5); 
						
						GtmUtils.addWorkflowStep("Import started for OSDM file: " + file.getName(), editor);
						
						
						monitor.subTask(NationalLanguageSupport.ImportGTMJsonAction_5);
						GtmUtils.deleteOrphanedObjects(domain, tool);
						prepareStructure(tool,domain);
						monitor.worked(1);
					
						monitor.subTask(NationalLanguageSupport.ImportGTMJsonAction_6);
						FareDelivery fareDelivery = ImportFareDelivery.importFareDelivery(file);
						monitor.worked(1);
					
						int deliveredFares = 0;
						if (fareDelivery != null &&
							fareDelivery.getFareStructureDelivery() != null &&
							fareDelivery.getFareStructureDelivery().getFareStructure() != null &&
							fareDelivery.getFareStructureDelivery().getFareStructure().getFares() != null) {
							deliveredFares = fareDelivery.getFareStructureDelivery().getFareStructure().getFares().size();						
						}
						int importedFares = 0;
						
						//check fare constraint bundles
						int errors = 0;
						for (FareDef dFare: fareDelivery.getFareStructureDelivery().getFareStructure().getFares()) {
							if( dFare.getBundleRef() == null || dFare.getBundleRef().length() < 1) {
								errors++;
								GtmUtils.writeConsoleError("Fare without fare constraint bundle: " + dFare.getId(), editor);
							}
							if (errors > 100) {
								GtmUtils.writeConsoleError("Too many errors", editor);	
								return;
							}
						}
						
						if (fareDelivery.getFareStructureDelivery().getFareStructure().getFareConstraintBundles() == null ||
							fareDelivery.getFareStructureDelivery().getFareStructure().getFareConstraintBundles().size() == 0) {
							GtmUtils.writeConsoleError("Fare constraint bundles missing", editor);	
							return;
						}
						
						
						if (fareDelivery != null) {

							monitor.subTask(NationalLanguageSupport.ImportGTMJsonAction_7);
							GeneralTariffModel model = importer.convertFromJson(fareDelivery);
							if (model != null &&
								model.getFareStructure() != null &&
								model.getFareStructure().getFareElements() != null && 
								model.getFareStructure().getFareElements().getFareElements() != null) {
								importedFares = model.getFareStructure().getFareElements().getFareElements().size();
							}
							monitor.worked(1);

							monitor.subTask(NationalLanguageSupport.ImportGTMJsonAction_8);
							SetCommand command = new SetCommand(domain, tool, GtmPackage.Literals.GTM_TOOL__GENERAL_TARIFF_MODEL, model);
							if (command.canExecute()) {
								domain.getCommandStack().execute(command);
							}	
							monitor.worked(1);
						} 
						
						monitor.subTask(NationalLanguageSupport.ImportGTMJsonAction_9);					
						updateMERITSStations(domain,importer.getStations(), fareDelivery.getFareStructureDelivery().getFareStructure().getStationNames(), editor);
						//reset fare templates
						SetCommand command = new SetCommand(domain, tool.getConversionFromLegacy().getParams().getLegacyFareTemplates(), GtmPackage.Literals.CONVERSION_PARAMS__LEGACY_FARE_TEMPLATES, GtmFactory.eINSTANCE.createLegacyFareTemplates());
						if (command.canExecute()) {
							domain.getCommandStack().execute(command);
						}	
						
						Command com = GtmUtils.getLinkReductionCardClassesCommand(tool.getGeneralTariffModel().getFareStructure(), editor.getEditingDomain());
						if (com != null && com.canExecute()) {
							editor.getEditingDomain().getCommandStack().execute(com);
						}

						GtmUtils.deleteOrphanedObjects(domain, tool);
					
						monitor.worked(1);
						
						StringBuilder sb = new StringBuilder();
						sb.append("OSDM Import Completed: ");
						sb.append("Fares delivered: ");
						sb.append(deliveredFares);
						sb.append(" / Fares imported: ");
						sb.append(importedFares);
						
						GtmUtils.writeConsoleInfo(sb.toString(), editor);
						
						GtmUtils.addWorkflowStep("Import completed for OSDM file: " + file.getName(), editor);


					} catch (JsonParseException e) {
						GtmUtils.displayAsyncErrorMessage(e,"json parsing error");
						return;
					} catch (JsonMappingException e) {
						GtmUtils.displayAsyncErrorMessage(e,"json mapping error");
					} catch (IOException e) {
						GtmUtils.displayAsyncErrorMessage(e,"file error");
					} catch (Exception e) {
						GtmUtils.displayAsyncErrorMessage(e,"unknown error");
					} finally {
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
				dialog.setText("Export to JSON failed");
				if (e.getMessage()!= null) {
					dialog.setMessage(e.getMessage());
					GtmUtils.writeConsoleStackTrace(e, editor);
				} else {
					dialog.setMessage("no details available");
					GtmUtils.writeConsoleStackTrace(e, editor);
				}
				GtmUtils.addWorkflowStep("Import abandoned for OSDM file: " + file.getName(), editor);

				dialog.open(); 				
				
				
				e.printStackTrace();
				// Something went wrong that shouldn't.
				GtmEditorPlugin.INSTANCE.log(e);
			} finally {
				editor.reconnectViews();
			}			

			return;

		}


		private void updateMERITSStations(EditingDomain domain, HashMap<Integer,Station> stations, List<StationNamesDef> list, GtmEditor editor) {

			//correcting merits data using OSDM data			
			CompoundCommand command = new CompoundCommand();
							
			for (StationNamesDef lStation : list ) {
				
				Station station = stations.get(lStation.getCountry() * 100000 + lStation.getLocalCode());
			
				if (station != null) {
				
					if (lStation.getLegacyBorderPointCode() > 0) {
					
						if (station != null && station.isBorderStation() == false){
							
							Command com = SetCommand.create(domain, station, GtmPackage.Literals.STATION__BORDER_STATION, true);
							if (com != null && com.canExecute()) {
								command.append(com);	
							}
							Command comm2 = SetCommand.create(domain, station, GtmPackage.Literals.STATION__LEGACY_BORDER_POINT_CODE, lStation.getLegacyBorderPointCode());
							if (comm2 != null && comm2.canExecute()) {
								command.append(comm2);	
							}				
						}
					
					}
					
					CompoundCommand com = StationNameMerger.createMergeStationNamesCommand(domain,lStation,station, editor);
					if (!com.isEmpty() && com.canExecute()) {
						command.append(com);					
					}
					
				}
			}
			
			if (command != null && !command.isEmpty()) {
				domain.getCommandStack().execute(command);
				command = new CompoundCommand();
			}

		}

	

}

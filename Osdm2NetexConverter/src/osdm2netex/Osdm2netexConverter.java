package osdm2netex;


import java.io.File;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.ValidationEvent;
import jakarta.xml.bind.ValidationEventHandler;
import jakarta.xml.bind.ValidationEventLocator;
import org.eclipse.core.runtime.IProgressMonitor;

import Gtm.GTMTool;
import uk.org.netex.netex.ObjectFactory;
import uk.org.netex.netex.PublicationDeliveryStructure;

public class Osdm2netexConverter {
	
	/** The tool. */
	private GTMTool tool = null;
	
	private Gtm.GeneralTariffModel osdm = null;
	

	
	
	public Osdm2netexConverter(GTMTool tool) {
		this.tool = tool;
		
		osdm = tool.getGeneralTariffModel();
	
	}
	
	public void writeNeTexFile(PublicationDeliveryStructure data, File file, IProgressMonitor monitor) throws Exception {
		
		//TestMinimalExport.writeNeTexFile(osdm, file, monitor);
		
		monitor.subTask("Formatting XML");	
        // Create JAXB context for the Person class
		try {
			
			StringBuilder validationResults = new StringBuilder(); 
			
			ObjectFactory factory = new ObjectFactory();
			JAXBElement<PublicationDeliveryStructure> rootelement = factory.createPublicationDelivery(data);
			
			// Create a marshaller
			monitor.subTask("creating NeTEx context (this might take some time)");	        	
			JAXBContext jc = JAXBContext.newInstance(PublicationDeliveryStructure.class, ObjectFactory.class);

        	
        	
        	Marshaller marshaller = jc.createMarshaller();
           	marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			
			marshaller.setEventHandler(new ValidationEventHandler() {
			    @Override
			    public boolean handleEvent(ValidationEvent event) {
			    	validationResults.append("Error: " + event.getMessage()).append('\n');
			        validationResults.append("Severity: " + event.getSeverity()).append('\n');
			        
			        ValidationEventLocator locator = event.getLocator();
			        validationResults.append("Location: " + locator.getObject()).append('\n');
			        validationResults.append("--------------------------------------------------- ").append('\n');
			        
			        return true; 
			    }
			});
			
        	// Write to XML file
			monitor.subTask("Write XML file");	
			try {
				marshaller.marshal(rootelement, file);
				marshaller.marshal(rootelement, System.out);
			} catch (Exception e){
				String errors = validationResults.toString();
				System.out.println(errors);
				if (errors != null && errors.length() > 0) {
					monitor.subTask(errors);
				}
	        
			}

		} catch (JAXBException e){
			e.printStackTrace();
			Exception e2 = new Exception("XML Export failed");
			throw e2;
		}
	}
	
	/**
	 * Convert.
	 *
	 * @param monitor the monitor
	 */
	public PublicationDeliveryStructure convert(IProgressMonitor monitor) {
		
		
		PublicationDeliveryStructure delivery = Osdm2Delivery.convert(monitor, osdm);
		
		return delivery;
		
		
	}

	    

}

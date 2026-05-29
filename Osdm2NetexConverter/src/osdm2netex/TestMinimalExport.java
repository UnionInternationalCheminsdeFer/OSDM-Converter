package osdm2netex;

import java.io.File;
import java.util.Calendar;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.ValidationEvent;
import jakarta.xml.bind.ValidationEventHandler;
import jakarta.xml.bind.ValidationEventLocator;

import org.eclipse.core.runtime.IProgressMonitor;

import Gtm.GeneralTariffModel;
import uk.org.netex.netex.CommonVersionFrameStructure;
import uk.org.netex.netex.CompositeFrame;
import uk.org.netex.netex.DataObjectsRelStructure;
import uk.org.netex.netex.ObjectFactory;
import uk.org.netex.netex.PublicationDeliveryStructure;
import uk.org.netex.netex.PublicationRequestStructure;
import uk.org.netex.netex.SiteFrame;

public class TestMinimalExport {
	
	public static void writeNeTexFile(GeneralTariffModel osdm, File file, IProgressMonitor monitor) throws Exception {
		
		ObjectFactory factory = new ObjectFactory();
		
		PublicationDeliveryStructure delivery = factory.createPublicationDeliveryStructure();
		delivery.setVersion("test");
		delivery.setParticipantRef("XX");
		delivery.setPublicationTimestamp(DateUtils.toXMLGregorianCalendar(Calendar.getInstance().getTime()));		
	
		SiteFrame siteFrame = factory.createSiteFrame();
		siteFrame.setId("site1");
		siteFrame.setVersion("1");
		siteFrame.setNameOfClass("SiteFrame");
		siteFrame.setCreated(DateUtils.toXMLGregorianCalendar(Calendar.getInstance().getTime()));
		siteFrame.setStopPlaces(factory.createStopPlacesInFrameRelStructure());
        
		siteFrame.setStopPlaces(factory.createStopPlacesInFrameRelStructure());
		siteFrame.getStopPlaces().setId("id");
		
		JAXBElement<SiteFrame> jSiteFrame = factory.createSiteFrame(siteFrame);
		
		DataObjectsRelStructure dos = factory.createDataObjectsRelStructure();
		dos.getCompositeFrameOrCommonFrame().add(jSiteFrame);
		delivery.setDataObjects(dos);
		
		
		PublicationRequestStructure pr = factory.createPublicationRequestStructure();
		pr.setParticipantRef("none");
		pr.setVersion("0");
		delivery.setPublicationRequest(pr);

		JAXBElement<PublicationDeliveryStructure> root = factory.createPublicationDelivery(delivery);

	    JAXBContext ctx = JAXBContext.newInstance(PublicationDeliveryStructure.class);

		Marshaller m = ctx.createMarshaller();
		StringBuilder validationResults = new StringBuilder(); 
		m.setEventHandler(new ValidationEventHandler() {
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
		
		try {
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			m.marshal(root, System.out);
		} catch (Exception e){
			System.out.println(validationResults.toString());
		    throw e;
		}
		System.out.println(validationResults.toString());

	}


}

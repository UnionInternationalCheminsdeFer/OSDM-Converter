package Gtm.utils;

import java.util.ArrayList;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import Gtm.AfterSalesRule;
import Gtm.Calendar;
import Gtm.CarrierConstraint;
import Gtm.ConnectionPoint;
import Gtm.DataSource;
import Gtm.FareConstraintBundle;
import Gtm.FareElement;
import Gtm.FareElements;
import Gtm.FareStationSetDefinition;
import Gtm.GTMTool;
import Gtm.GtmFactory;
import Gtm.GtmPackage;
import Gtm.LegacyStationMap;
import Gtm.Price;
import Gtm.Prices;
import Gtm.RegionalConstraint;
import Gtm.RegionalConstraints;
import Gtm.SalesAvailabilityConstraint;
import Gtm.Text;
import Gtm.presentation.GtmEditor;

// TODO: Auto-generated Javadoc
/**
 * The Class ConversionCleaner.
 */
public class ConversionCleaner {
	
	/**
	 * Clean conversion result from the tool data set.
	 *
	 * @param tool the data set to work on
	 * @param domain the domain of the data set
	 * @param editor the editor
	 * @return the number of deleted items
	 */
	public static int cleanConversionResult(GTMTool tool, EditingDomain domain, GtmEditor editor) {
		int deleted = 0;

		CompoundCommand command = new CompoundCommand();
		
		//delete fares
		ArrayList<FareElement> fares = new ArrayList<FareElement>();
		for (FareElement fare : tool.getGeneralTariffModel().getFareStructure().getFareElements().getFareElements()) {
			if (fare.getDataSource() == DataSource.CONVERTED || fare.getDataSource() == DataSource.IMPORTED) {
				fares.add(fare);
			}
		}
		if (fares.size() == tool.getGeneralTariffModel().getFareStructure().getFareElements().getFareElements().size()) {
			FareElements fareElements = GtmFactory.eINSTANCE.createFareElements();
			Command com = SetCommand.create(domain,tool.getGeneralTariffModel().getFareStructure(), GtmPackage.Literals.FARE_STRUCTURE__FARE_ELEMENTS, fareElements);
			command.append(com);
			GtmUtils.executeAndFlush(command,domain,editor);	
		} else {
			command.append(DeleteCommand.create(domain, fares));
			GtmUtils.executeAndFlush(command,domain,editor);
		}
		fares.clear();	
		
		//delete regional validities
		command = new CompoundCommand();
		ArrayList<RegionalConstraint> regions = new ArrayList<RegionalConstraint>();
		for (RegionalConstraint region : tool.getGeneralTariffModel().getFareStructure().getRegionalConstraints().getRegionalConstraints()) {
			if (region.getDataSource() == DataSource.CONVERTED || region.getDataSource() == DataSource.IMPORTED) {
				regions.add(region);	
			}
		}
		if (regions.size() == tool.getGeneralTariffModel().getFareStructure().getRegionalConstraints().getRegionalConstraints().size()) {
			RegionalConstraints regionalConstraints = GtmFactory.eINSTANCE.createRegionalConstraints();
			Command com = SetCommand.create(domain,tool.getGeneralTariffModel().getFareStructure(), GtmPackage.Literals.FARE_STRUCTURE__REGIONAL_CONSTRAINTS,  regionalConstraints);
			command.append(com);
			GtmUtils.executeAndFlush(command,domain,editor);			
		} else {
			command.append(DeleteCommand.create(domain, regions));
			GtmUtils.executeAndFlush(command,domain,editor);
		}
		deleted = regions.size();
		regions.clear();
		
		//delete prices
		command = new CompoundCommand();
		ArrayList<Price> prices = new ArrayList<Price>();
		for (Price price : tool.getGeneralTariffModel().getFareStructure().getPrices().getPrices()) {
			if (price.getDataSource() == DataSource.CONVERTED || price.getDataSource() == DataSource.IMPORTED) {
				prices.add(price);
			}
		}	
		if (prices.size() == tool.getGeneralTariffModel().getFareStructure().getPrices().getPrices().size()) {
			Prices priceList = GtmFactory.eINSTANCE.createPrices();
			command.append(SetCommand.create(domain, tool.getGeneralTariffModel().getFareStructure(), GtmPackage.Literals.FARE_STRUCTURE__PRICES, priceList));
			GtmUtils.executeAndFlush(command,domain,editor);
		} else {
			command.append(DeleteCommand.create(domain, prices));
			GtmUtils.executeAndFlush(command,domain,editor);
		}
		prices.clear();
		
		//connection points
		command = new CompoundCommand();		
		for (ConnectionPoint point : tool.getGeneralTariffModel().getFareStructure().getConnectionPoints().getConnectionPoints()) {
			if (point.getDataSource() == DataSource.CONVERTED || point.getDataSource() == DataSource.IMPORTED) {
				command.append(DeleteCommand.create(domain, point) );
			}
		}		
		GtmUtils.executeAndFlush(command,domain,editor);
		
		//delete sales availabilities
		command = new CompoundCommand();
		for (SalesAvailabilityConstraint sa : tool.getGeneralTariffModel().getFareStructure().getSalesAvailabilityConstraints().getSalesAvailabilityConstraints()) {
			if (sa.getDataSource() == DataSource.CONVERTED || sa.getDataSource() == DataSource.IMPORTED) {
				command.append(DeleteCommand.create(domain, sa) );
			}
		}		
		GtmUtils.executeAndFlush(command,domain,editor);
		
		//delete fare constraint bundles
		command = new CompoundCommand();
		for (FareConstraintBundle sa : tool.getGeneralTariffModel().getFareStructure().getFareConstraintBundles().getFareConstraintBundles()) {
			if (sa.getDataSource() == DataSource.CONVERTED || sa.getDataSource() == DataSource.IMPORTED) {
				command.append(DeleteCommand.create(domain, sa) );
			}
		}		
		GtmUtils.executeAndFlush(command,domain,editor);

		
		//delete Carrier Constraints
		command = new CompoundCommand();
		for (CarrierConstraint cc : tool.getGeneralTariffModel().getFareStructure().getCarrierConstraints().getCarrierConstraints()) {
			if (cc.getDataSource() == DataSource.CONVERTED || cc.getDataSource() == DataSource.IMPORTED) {
				command.append(DeleteCommand.create(domain, cc) );
			}
		}		
		GtmUtils.executeAndFlush(command,domain,editor);
		
		//delete calendars
		command = new CompoundCommand();		
		for (Calendar sa : tool.getGeneralTariffModel().getFareStructure().getCalendars().getCalendars()) {
			if (sa.getDataSource() == DataSource.CONVERTED || sa.getDataSource() == DataSource.IMPORTED) {
				command.append(DeleteCommand.create(domain, sa) );
			}
		}	
		GtmUtils.executeAndFlush(command,domain,editor);
		
		//Delete fare station sets
		command = new CompoundCommand();		
		for (FareStationSetDefinition sa : tool.getGeneralTariffModel().getFareStructure().getFareStationSetDefinitions().getFareStationSetDefinitions()) {
			if (sa.getDataSource() == DataSource.CONVERTED || sa.getDataSource() == DataSource.IMPORTED) {
				command.append(DeleteCommand.create(domain, sa) );
			}
		}
		GtmUtils.executeAndFlush(command,domain,editor);

		//delete After sales rules
		command = new CompoundCommand();		
		for (AfterSalesRule sa : tool.getGeneralTariffModel().getFareStructure().getAfterSalesRules().getAfterSalesRules()) {
			if (sa.getDataSource() == DataSource.CONVERTED || sa.getDataSource() == DataSource.IMPORTED) {
				command.append(DeleteCommand.create(domain, sa) );
			}
		}
		GtmUtils.executeAndFlush(command,domain,editor);
		
		//delete fare constraint bundles
		command = new CompoundCommand();		
		for (FareConstraintBundle sa : tool.getGeneralTariffModel().getFareStructure().getFareConstraintBundles().getFareConstraintBundles()) {
			if (sa.getDataSource() == DataSource.CONVERTED || sa.getDataSource() == DataSource.IMPORTED) {
				command.append(DeleteCommand.create(domain, sa) );
			}
		}
		GtmUtils.executeAndFlush(command,domain,editor);
		
		//delete station mappings  (obsolete)
		if ( tool.getConversionFromLegacy().getParams() != null && 
			 tool.getConversionFromLegacy().getParams().getLegacyStationMappings() != null) {
			command = new CompoundCommand();		
			for (LegacyStationMap m : tool.getConversionFromLegacy().getParams().getLegacyStationMappings().getStationMappings()) {
				if (m.getDataSource() == DataSource.CONVERTED || m.getDataSource() == DataSource.IMPORTED) {
					command.append(DeleteCommand.create(domain,m) );
				}
			}
			GtmUtils.executeAndFlush(command,domain,editor);
		}
		
		//delete texts
		command = new CompoundCommand();		
		for (Text sa : tool.getGeneralTariffModel().getFareStructure().getTexts().getTexts()) {
			if (sa.getDataSource() == DataSource.CONVERTED || sa.getDataSource() == DataSource.IMPORTED) {
				command.append(DeleteCommand.create(domain, sa) );
			}
		}
		GtmUtils.executeAndFlush(command,domain,editor);
		
		GtmUtils.deleteOrphanedObjects(domain,tool);

		GtmUtils.resetBorderPointCodes(domain, tool);

		return deleted;
	}

}

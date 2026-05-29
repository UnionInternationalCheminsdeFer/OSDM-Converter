package Gtm.converter;

import java.util.ArrayList;
import java.util.HashSet;
import Gtm.FareElement;
import Gtm.GTMTool;
import Gtm.PassengerCombinationConstraint;
import Gtm.PassengerConstraint;
import Gtm.ReductionConstraint;
import Gtm.ServiceClass;
import Gtm.TravelerType;

public class ExcelFareTypes {
	
	GTMTool tool = null;
	
	ArrayList<FareType> fareTypes = new ArrayList<FareType>();
	
	private class FareType {
		
		ServiceClass serviceClass = null;
		PassengerConstraint passengerConstraint = null;
		ReductionConstraint reductionConstraint = null;
		
		public FareType (ServiceClass serviceClass, PassengerConstraint passengerConstraint, ReductionConstraint reductionConstraint){
			this.serviceClass=  serviceClass;
			this.passengerConstraint = passengerConstraint;
			this.reductionConstraint = reductionConstraint;			
			
		}
	}
	
	 
	public ExcelFareTypes(GTMTool tool) {
		
		this.tool = tool;
		
		for (ServiceClass scd : getClasses()) {

			for (PassengerConstraint pc : tool.getGeneralTariffModel().getFareStructure().getPassengerConstraints().getPassengerConstraints()) {
					
				for (ReductionConstraint rc : tool.getGeneralTariffModel().getFareStructure().getReductionConstraints().getReductionConstraints()) {
								
					fareTypes.add(new FareType(scd,pc,rc));
				
				}
	
				fareTypes.add(new FareType(scd,pc,null));
					
			}
		}
	}

	
	private HashSet<ServiceClass> getClasses() {
		
		HashSet<ServiceClass> scs = new HashSet<ServiceClass>();
		
		for (FareElement fe : tool.getGeneralTariffModel().getFareStructure().getFareElements().getFareElements()) {
			
			if (fe.getServiceClass() != null) {
				scs.add(fe.getServiceClass());
			}
		}
		
		return scs;
		
		
	}





	public int getColumn (FareElement fare) {
		
		for (FareType type : fareTypes) {
			
			if (   fare.getServiceClass() == type.serviceClass
			    && fare.getPassengerConstraint() == type.passengerConstraint
			    && fare.getReductionConstraint() == type.reductionConstraint){
			    return fareTypes.indexOf(type);
			}
		}
		
		
		return 0;
	};
	
	public ArrayList<String> getColumnNames(){
		
		ArrayList<String> names = new ArrayList<String>();
		
		StringBuilder sb = null;

		for (FareType type : fareTypes) {
			
			sb = new StringBuilder();
			sb.append(type.serviceClass.getId()).append(" - ");
			try {
				sb.append(getPassengerConstraintText(type.passengerConstraint)).append(" - ");
			} catch (Exception e) {
				//
			}
			try {
				sb.append(type.reductionConstraint.getRequiredReductionCards().getFirst().getName());
			} catch (Exception e) {
				//
			}
			
			names.add(sb.toString());
		}
		
		
		return names;
		
	}
	
	
	private String getPassengerConstraintText(PassengerConstraint pc) {
		
		StringBuilder sb = new StringBuilder();
		sb.append(pc.getTravelerType().getLiteral()).append(" ");
		if (pc.getMinTotalPassengerWeight() > 0) {
			sb.append("min ").append(pc.getMinTotalPassengerWeight());
		}
		
		int min = findMin(pc, pc.getTravelerType());
		if (min != 0) {
			sb.append("min ").append(min - 1);
		}
		
		return sb.toString();
	}


	private int findMin(PassengerConstraint pc, TravelerType travelerType) {
		int min = 0;
		for (PassengerCombinationConstraint pcc : pc.getExcludedPassengerCombinations()) {
			
			if (pcc.getPassengerType().equals(travelerType)) {
				min = pcc.getMinNumber();
			}
			
		}
		
		return min;
	}
	
	
}

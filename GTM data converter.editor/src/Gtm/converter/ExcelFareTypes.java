package Gtm.converter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

import Gtm.FareElement;
import Gtm.GTMTool;
import Gtm.GeneralTariffModel;
import Gtm.PassengerCombinationConstraint;
import Gtm.PassengerConstraint;
import Gtm.ReductionConstraint;
import Gtm.ServiceClass;
import Gtm.TotalPassengerCombinationConstraint;
import Gtm.TravelerType;

public class ExcelFareTypes {
	
	GTMTool tool = null;
	GeneralTariffModel tariff = null;
	
	
	public ArrayList<FareType> fareTypes = new ArrayList<FareType>();
	
	public HashMap<FareType,String> fareTypeColumnNames = new HashMap<FareType,String>();
	
	private class FareType {
		
		public ServiceClass serviceClass = null;
		public PassengerConstraint passengerConstraint = null;
		public ReductionConstraint reductionConstraint = null;
		public TotalPassengerCombinationConstraint passengerLimits = null;
		
		public FareType (ServiceClass serviceClass, PassengerConstraint passengerConstraint, ReductionConstraint reductionConstraint, TotalPassengerCombinationConstraint passengerLimits){
			this.serviceClass=  serviceClass;
			this.passengerConstraint = passengerConstraint;
			this.reductionConstraint = reductionConstraint;			
			this.passengerLimits = passengerLimits;
			
		}
		
	    @Override
	    public int hashCode() {
	        return Objects.hash(serviceClass,passengerConstraint,reductionConstraint,passengerLimits);
	    }
		
		@Override
		public boolean equals(Object o) {
			
			FareType ft2 = (FareType) o;
			
			if ( (this.serviceClass != null && ft2.serviceClass == null)    ||
				 (this.serviceClass == null && ft2.serviceClass != null)    ||
				 (this.serviceClass != null && ft2.serviceClass != null  &&
				   !this.serviceClass.equals(ft2.serviceClass) )            ||
				 
				 (this.passengerConstraint != null && ft2.passengerConstraint == null) ||
				 (this.passengerConstraint == null && ft2.passengerConstraint != null) ||
				 (this.passengerConstraint != null && ft2.passengerConstraint != null &&
				  !this.passengerConstraint.equals(ft2.passengerConstraint) )          ||
				 
				 (this.reductionConstraint != null && ft2.reductionConstraint == null) ||
				 (this.reductionConstraint == null && ft2.reductionConstraint != null) ||
				 (this.reductionConstraint != null && ft2.reductionConstraint != null && 
				   !this.reductionConstraint.equals(ft2.reductionConstraint))          ||
				 
				 (this.passengerLimits != null && ft2.passengerLimits == null) ||
				 (this.passengerLimits == null && ft2.passengerLimits != null) ||
				 (this.passengerLimits != null && ft2.passengerLimits != null &&
				  !this.passengerLimits.equals(ft2.passengerLimits))) {
				return false;
			}
			return true;
		}

	}
	
	 
	public ExcelFareTypes(GTMTool tool) {
		
		this.tool = tool;
		
		this.tariff = tool.getGeneralTariffModel();
		
		for (ServiceClass scd : getClasses()) {

			for (PassengerConstraint pc : tariff.getFareStructure().getPassengerConstraints().getPassengerConstraints()) {

				
				for (TotalPassengerCombinationConstraint pl : tariff.getFareStructure().getTotalPassengerCombinationConstraints().getTotalPassengerCombinationConstraint()) {

					for (ReductionConstraint rc : tariff.getFareStructure().getReductionConstraints().getReductionConstraints()) {

						fareTypes.add(new FareType(scd,pc,rc, pl));
					}
				
					fareTypes.add(new FareType(scd,pc,null, pl));
				}	
			}
		}
	}

	public ExcelFareTypes(GeneralTariffModel tariff) {

		this.tariff = tariff;
		
		HashSet<FareType> uniqueFareTypes = new HashSet<FareType>();
		
		for (FareElement fe : tariff.getFareStructure().getFareElements().getFareElements()) {
			
			uniqueFareTypes.add(new FareType(
								fe.getServiceClass(),
								fe.getPassengerConstraint(),
								fe.getReductionConstraint(), 
								fe.getFareConstraintBundle().getTotalPassengerConstraint()
								));
		}
		
		fareTypes.addAll(uniqueFareTypes);
		
		buildNames(fareTypes);
		
		fareTypes.sort(new Comparator<FareType>(){

			@Override
			public int compare(FareType o1, FareType o2) {
				
				return (fareTypeColumnNames.get(o1).compareTo(fareTypeColumnNames.get(o2)));

			}
			
		});
		
	}
		
	
	
	private void buildNames(ArrayList<FareType> fareTypes) {
		
		
		for (FareType fareType: fareTypes) {
			
			fareTypeColumnNames.put(fareType, getColumnName(fareType));
			
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
				&& fare.getFareConstraintBundle().getTotalPassengerConstraint() == type.passengerLimits
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
			//group size limits
			try {
				sb.append(type.passengerLimits.getMinTotalPassengerWeight()).append("-").append(type.passengerLimits.getMaxTotalPassengerWeight()).append(" - ");
			} catch (Exception e) {
				//
			}			 
			// reduction cards
			try {
				sb.append(type.reductionConstraint.getRequiredReductionCards().getFirst().getName());
			} catch (Exception e) {
				//
			}
			
			names.add(sb.toString());
		}
		
		
		return names;
		
	}
	
	private String getColumnName(FareType type) {
		
		
		StringBuilder sb = new StringBuilder();
		sb.append(type.serviceClass.getId()).append(" - ");
		try {
			sb.append(getPassengerConstraintText(type.passengerConstraint)).append(" - ");
		} catch (Exception e) {
			//
		}
		//group size limits
		try {
			sb.append(type.passengerLimits.getMinTotalPassengerWeight()).append("-").append(type.passengerLimits.getMaxTotalPassengerWeight()).append(" - ");
		} catch (Exception e) {
			//
		}			 
		// reduction cards
		try {
			sb.append(type.reductionConstraint.getRequiredReductionCards().getFirst().getName());
		} catch (Exception e) {
			//
		}		
		
		return sb.toString();
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

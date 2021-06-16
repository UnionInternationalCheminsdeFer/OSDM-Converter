package Gtm.converter;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import Gtm.GtmPackage;
import Gtm.Station;
import Gtm.presentation.GtmEditor;
import Gtm.util.StringFormatValidator;
import Gtm.utils.GtmUtils;
import gtm.StationNamesDef;

public class StationNameMerger {
	
	public static CompoundCommand createMergeStationNamesCommand(EditingDomain domain, StationNamesDef lStation, Station station, GtmEditor editor) {
		
		CompoundCommand command = new CompoundCommand();
		

		
		String longU = lStation.getNameUtf8();
		String longA = lStation.getName();
		String shortU = lStation.getShortNameUtf8();
		String shortA = lStation.getShortName();
		
		if (!StringFormatValidator.isStationASCII(lStation.getName())) {
			String asc = GtmUtils.utf2ascii(lStation.getName());
			GtmUtils.writeConsoleWarning("Station Name not in ASCII Format " + lStation.getName() + " changed to " + asc, editor);
			lStation.setName(asc);
		}
		
		if (!StringFormatValidator.isStationASCII(lStation.getShortName())) {
			String asc = GtmUtils.utf2ascii(lStation.getShortName());
			GtmUtils.writeConsoleWarning("Station Short Name not in ASCII Format " + lStation.getShortName() + " changed to " + asc, editor);
			lStation.setShortName(asc);
		}
		
		if (longU == null || longU.length() == 0 ) {
			longU = longA;
		}
		if (shortA == null || shortA.length() == 0 ) {
			shortA = longA;
		}
		if (shortU == null || shortU.length() == 0 ) {
			shortU = shortA;
		}
		if (shortU == null || shortU.length() == 0 ) {
			shortU = longA;
		}
		
		//set station name long ASCII
		if (longA.length() > 1 &&
			(station.getNameCaseASCII() == null || station.getNameCaseASCII().length() == 0 )) {
			Command com = SetCommand.create(domain, station, GtmPackage.Literals.STATION__NAME_CASE_ASCII, longA);
			if (com.canExecute()) {
				command.append(com);
			}
		}
		
		//set station name long UTF8
		if (longU.length() > 1 &&
			(station.getNameCaseUTF8() == null || station.getNameCaseUTF8().length() == 0 )) {
			Command com = SetCommand.create(domain, station, GtmPackage.Literals.STATION__NAME_CASE_UTF8, longU);
			if (com.canExecute()) {
				command.append(com);					
			}
		}

		//set station name short ASCII
		if (shortA.length() > 1 &&
			(station.getShortNameCaseASCII() == null || station.getShortNameCaseASCII().length() == 0 )) {
			Command com = SetCommand.create(domain, station, GtmPackage.Literals.STATION__SHORT_NAME_CASE_ASCII, shortA);
			if (com.canExecute()) {
				command.append(com);					
			}
		}
			
		//set station name short UTF8
		if (shortU.length() > 1 &&
			(station.getShortNameCaseUTF8() == null || station.getShortNameCaseUTF8().length() == 0 )) {
			Command com2 = SetCommand.create(domain, station, GtmPackage.Literals.STATION__SHORT_NAME_CASE_UTF8, shortU);
			if (com2.canExecute()) {
				command.append(com2);					
			}
		}
		return command;
	}
	
	public static CompoundCommand createUpdateStationNamesCommand(EditingDomain domain, StationNamesDef lStation, Station station) {
		
		CompoundCommand command = new CompoundCommand();
		
		String longU = lStation.getNameUtf8();
		String longA = lStation.getName();
		String shortU = lStation.getShortNameUtf8();
		String shortA = lStation.getShortName();
		
		if (longU == null || longU.length() == 0 ) {
			longU = longA;
		}
		if (shortA == null || shortA.length() == 0 ) {
			shortA = longA;
		}
		if (shortU == null || shortU.length() == 0 ) {
			shortU = shortA;
		}
		if (shortU == null || shortU.length() == 0 ) {
			shortU = longA;
		}

		//set station name long ASCII
		if (longA.length() > 1 &&
			(station.getNameCaseASCII() == null || station.getNameCaseASCII().length() == 0 || !longA.equals(station.getNameCaseASCII()))) {
			Command com = SetCommand.create(domain, station, GtmPackage.Literals.STATION__NAME_CASE_ASCII, longA);
			if (com.canExecute()) {
				command.append(com);
			}
		}
		
		//set station name long UTF8
		if (longU.length() > 1 &&
			(station.getNameCaseUTF8() == null || station.getNameCaseUTF8().length() == 0 || !longU.equals(station.getNameCaseUTF8())) ) {
			Command com = SetCommand.create(domain, station, GtmPackage.Literals.STATION__NAME_CASE_UTF8, longU);
			if (com.canExecute()) {
				command.append(com);					
			}
		}

		//set station name short ASCII
		if (shortA.length() > 1 &&
			(station.getShortNameCaseASCII() == null || station.getShortNameCaseASCII().length() == 0 || !shortA.equals(station.getShortNameCaseASCII()))) {
			Command com = SetCommand.create(domain, station, GtmPackage.Literals.STATION__SHORT_NAME_CASE_ASCII, shortA);
			if (com.canExecute()) {
				command.append(com);					
			}
		}	
			
		//set station name short UTF8
		if (shortU.length() > 1 &&
			(station.getShortNameCaseUTF8() == null || station.getShortNameCaseUTF8().length() == 0 || !shortU.equals(station.getShortNameCaseUTF8()))) {
			Command com2 = SetCommand.create(domain, station, GtmPackage.Literals.STATION__SHORT_NAME_CASE_UTF8, shortU);
			if (com2.canExecute()) {
				command.append(com2);					
			}
		}

		return command;
	}


}

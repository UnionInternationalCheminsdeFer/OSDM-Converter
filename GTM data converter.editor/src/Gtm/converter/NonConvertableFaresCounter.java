package Gtm.converter;

import Gtm.presentation.GtmEditor;
import Gtm.utils.GtmUtils;

public class NonConvertableFaresCounter {
	
	public static int tooManyVias = 0;
	public static int nonConvertableFare = 0;
	public static int classNotConvertable = 0;
	public static int regionalVaidityTooComplex = 0;
	public static int nonAdult = 0;
	public static int nonFullFlex = 0;
	public static int withReduction = 0;
	public static int otherReason = 0;
	public static int returnDirection = 0;
	
	public static void addTooManyViasError() {
		tooManyVias++;
	}
	
	public static void createConsoleEntry(GtmEditor editor) {
		String message = "Fares Marked as Non-Convertable: " + Integer.toString(nonConvertableFare);
		GtmUtils.writeConsoleInfo(message, editor);
		message = "Fares not converted due to too many via stations: " + Integer.toString(tooManyVias);
		GtmUtils.writeConsoleInfo(message, editor);	
		message = "Fares not converted due to non-convertable class: " + Integer.toString(classNotConvertable);
		GtmUtils.writeConsoleInfo(message, editor);		
		message = "Fares not converted due to route description too complex: " + Integer.toString(regionalVaidityTooComplex);
		GtmUtils.writeConsoleInfo(message, editor);	
		message = "Fares not converted due to Non-Adult passenger type: " + Integer.toString(nonAdult);
		GtmUtils.writeConsoleInfo(message, editor);
		message = "Fares not converted due to Reduction: " + Integer.toString(withReduction);
		GtmUtils.writeConsoleInfo(message, editor);
		message = "Fares not converted due to Non-Fullflex Type: " + Integer.toString(nonFullFlex);
		GtmUtils.writeConsoleInfo(message, editor);
		message = "Fares not converted due to Return direction: " + Integer.toString(returnDirection);
		GtmUtils.writeConsoleInfo(message, editor);
		message = "Fares not converted due to other reasons: " + Integer.toString(otherReason);
		GtmUtils.writeConsoleInfo(message, null);
	}
	
	public static void reset() {
		tooManyVias = 0;
		nonConvertableFare = 0;
		classNotConvertable = 0;
		regionalVaidityTooComplex = 0;
		nonAdult = 0;
		nonFullFlex = 0;
		withReduction = 0;
		otherReason = 0;
		returnDirection = 0;
	}

	public static void addNotConvertable() {
		nonConvertableFare++;
	}
	

	public static void addRouteTooComplex() {
		regionalVaidityTooComplex++;
	}
	
	public static void addNonAdult() {
		nonAdult++;
	}
	
	public static void addNonFullFlex() {
		nonFullFlex++;
	}
	
	public static void addWithReduction() {
		withReduction++;
	}
	
	public static void addOtherReason() {
		otherReason++;
	}

	public static void addClassNotConvertable() {
		classNotConvertable++;
	}
	
	public static void addReturnDirection() {
		returnDirection++;
	}
}

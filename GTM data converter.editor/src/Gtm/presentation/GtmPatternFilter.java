package Gtm.presentation;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.dialogs.PatternFilter;

import Gtm.ViaStation;

public class GtmPatternFilter extends PatternFilter {
	
	boolean isVisible(Viewer viewer,Object element) {
		
		if (element instanceof ViaStation) {	
			if (((ViaStation) element).getStation() != null) {
				return super.wordMatches(((ViaStation) element).getStation().getCode());
			}
		}
		return false;
		
	}

}

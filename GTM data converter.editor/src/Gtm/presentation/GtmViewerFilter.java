package Gtm.presentation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;

import Gtm.ConnectionPoint;
import Gtm.FareElement;
import Gtm.FareStationSetDefinition;
import Gtm.PassengerConstraint;
import Gtm.ReductionCard;
import Gtm.ReductionConstraint;
import Gtm.RegionalConstraint;
import Gtm.ServiceBrand;
import Gtm.ServiceConstraint;
import Gtm.Station;
import Gtm.StationNames;
import Gtm.Text;

public class GtmViewerFilter extends ViewerFilter {
	
	private String pattern = null;
	
	private Viewer viewer = null;
	
	public GtmViewerFilter() {
		super();
		
		pattern = SearchControlContribution.getInstance().getPattern();
		
		SearchControlContribution.getInstance().addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent arg0) {
				pattern = SearchControlContribution.getInstance().getPattern();
				if (viewer != null) {
					viewer.refresh();
				}
			}
			
		});
	}
	
	
	@Override
	public boolean select(Viewer viewer, Object parentElement,	Object element) {
		
		this.viewer = viewer;
			
		if (pattern == null || pattern.length() == 0) return true;
		
		if (!(element instanceof EObject)) {
			
			if (element instanceof VirtualFolderItemProvider) {
				for (Object o: ((VirtualFolderItemProvider) element).getFolderContent() ) {
					if (o instanceof EObject){
						if (isIncluded(pattern, (EObject) o)) {
							return true;
						}
					}
				}
				return false;
			}
			
			
			return true;
		}

		if (element instanceof EObject) {
			
			return isIncluded(pattern, (EObject) element);
			
		}
			
		return true;

	}
	
	private boolean isIncluded(String pattern , EObject eo) {
		
		if (eo instanceof StationNames) {
			return true;
		}
		
		EClass cls = eo.eClass();
		EList<EAttribute> attributes = cls.getEAttributes();
		for (EAttribute attr : attributes) {
			Object o = eo.eGet(attr);
			if (o != null && o.toString().contains(pattern)) {
				return true;
			};
		}
		
		EList<EObject>	content = eo.eContents();
		for (EObject eoo : content) {
			if (isIncluded(pattern, eoo)) {
				return true;
			}
		}
		
		//include some referenced objects
		EList<EObject>	referenced = eo.eCrossReferences();
		for (EObject eoo : referenced) {
			if (eoo instanceof Text ||
				eoo instanceof Station ||
				eoo instanceof FareStationSetDefinition ||
				eoo instanceof ConnectionPoint || 
				eoo instanceof ServiceBrand || 
				eoo instanceof ServiceConstraint ||
				eoo instanceof ReductionConstraint || 
				//eoo instanceof RegionalConstraint || performance issue
				eoo instanceof ReductionCard ) {
				if (isIncluded(pattern, eoo)) {
					return true;
				}
			}
				
			//avoid loops as passenger constraint can reference passenger constraints
			if (eoo instanceof PassengerConstraint && eo.eContainer() instanceof FareElement) {
				if (isIncluded(pattern, eoo)) {
					return true;
				}
			}	
		}
	
		
		return false;
		
	}


	@Override
	public boolean isFilterProperty(Object element, String property) {

		if((element.getClass().toString()).contains("TypeOfElement")) {
			return true;
		}

		if (property.equals("status"))
			return true;
		else
			return super.isFilterProperty(element, property);
	}
}
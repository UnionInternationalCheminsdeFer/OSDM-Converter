package Gtm.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.provider.EcoreItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;

import Gtm.FareStructure;


public class GtmUtils {
	
	
	public static FareStructure getFareStructure(EObject object) {
		
		if (object instanceof FareStructure) return (FareStructure)object;
		
		EObject o = object;
		
		while (!(o instanceof FareStructure)) {
			
			if (o.eContainer() instanceof FareStructure) {
				return (FareStructure) o.eContainer();
			} else if (o.eContainer() == null) {
				return null;
			} else {
				o = o.eContainer();
			}
		}
		
		return null;
	}
	

	
	
	
	public static boolean isReferenced(EObject object, EObject tree) {
		
		if (object == null || tree == null) return false;
		
		TreeIterator<EObject> it = tree.eAllContents();
		
		while (it.hasNext()) {
			EObject next = it.next();
			
			if (next.eCrossReferences().contains(object)) {
				return true;
			}
		}
		return false;
	}
	
	public static String getLabelText(EObject object) {
		
		if (object == null) return "";
		
		for (Adapter a :  object.eAdapters()) {
			if ( a instanceof ItemProviderAdapter) {
				return ((ItemProviderAdapter)a).getText(object);
			}
		}
		
		EcoreItemProviderAdapterFactory factory = new EcoreItemProviderAdapterFactory();
		if(factory.isFactoryForType(IItemLabelProvider.class)){
			IItemLabelProvider labelProvider = (IItemLabelProvider)	factory.adapt(object, IItemLabelProvider.class);
			if(labelProvider != null){
				return labelProvider.getText(object);
			}
		}
	
		return null;
	}

	public static String toPrintableAscII(String text) {
        // strips off all non-ASCII characters
        text = text.replaceAll("[^\\x00-\\x7F]", ""); //$NON-NLS-1$ //$NON-NLS-2$
 
        // erases all the ASCII control characters
        text = text.replaceAll("[\\p{Cntrl}&&[^\r\n\t]]", ""); //$NON-NLS-1$ //$NON-NLS-2$
         
        // removes non-printable characters from Unicode
        return text.replaceAll("\\p{C}", ""); //$NON-NLS-1$ //$NON-NLS-2$

	}
	
	public static String limitStringLength(String s, int maxChar) {
		if (s == null) return " "; //$NON-NLS-1$
		return s.substring(0, Math.min(maxChar, s.length()));
	}
	

	
}

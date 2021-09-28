package Gtm;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.IItemLabelProvider;

import Gtm.provider.GtmEditPlugin;
import Gtm.provider.GtmItemProviderAdapterFactory;

public class LabelProvider {
	
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
	
	/**
	 * Gets the label text for an eObject.
	 *
	 * @param object the object
	 * @return the label text
	 */
	public static String getLabelText(EObject object) {
		
		if (object == null) return "";
		
		GtmItemProviderAdapterFactory factory = new GtmItemProviderAdapterFactory();
		if(factory.isFactoryForType(IItemLabelProvider.class)){
			IItemLabelProvider labelProvider = (IItemLabelProvider)	factory.adapt(object, IItemLabelProvider.class);
			if(labelProvider != null){
				return labelProvider.getText(object);
			}
		}
	
		return null;
	}
	
	public static String getEnumerationLabel(Enumerator enumerator) {
		
		if (enumerator == null) return "";
		
		return GtmEditPlugin.INSTANCE.getString("_UI_" + enumerator.getClass().getSimpleName() + "_" + enumerator.getName() + "_literal", true );
	}

	public static String getTime(int minutesOfDay) {
		
		int hours = minutesOfDay / 60;
		int minutes = minutesOfDay - hours * 60;
		try {
			return String.format("%02d:%02d", hours, minutes);
		} catch (Exception e) {
			return "";
		}
		
	}

	public static Object getListLabel(Object[] objects) {
		if (objects == null || objects.length == 0) {
			return "";
		}
		StringBuilder sb = new StringBuilder();
		for (Object e : objects) {
			if (sb.length() > 0) {
				sb.append(",");
			}
			if (e instanceof Enumerator) {
				sb.append(LabelProvider.getEnumerationLabel((Enumerator) e));
			} else if (e instanceof EObject) {
				sb.append(LabelProvider.getLabelText((EObject) e));
			}
		}
		return sb.toString();
		
	}
	

}

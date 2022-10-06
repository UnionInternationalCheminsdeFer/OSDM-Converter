package Gtm;

import org.eclipse.jface.preference.IPreferenceStore;

public class PropertyAdapter {
	
	static PropertyAdapter me = null;
	
	IPreferenceStore store = null;
	
	boolean supressStationLabel = false;
	
	public static PropertyAdapter getInstance() {
		if (me == null) {
			me = new PropertyAdapter();
		}
		return me;
	}
	
	

	public void setStore(IPreferenceStore store) {
		this.store = store;
	}

	public boolean isSupressStationLabel() {
		if (store != null) {
			return store.getBoolean("SUPRESS_STATION_LABEL");
		}
		return false;
	}

	public boolean isSupressCountryLabel() {
		if (store != null) {
			return store.getBoolean("SUPRESS_COUNTRY_LABEL");
		}
		return false;
	}	
}

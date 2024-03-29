package Gtm.preferences;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IntegerFieldEditor;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.preferences.ScopedPreferenceStore;

import Gtm.PropertyAdapter;
import Gtm.nls.NationalLanguageSupport;
import Gtm.presentation.GtmEditorPlugin;

public class PreferencePage
	extends FieldEditorPreferencePage
	implements IWorkbenchPreferencePage
{


	public PreferencePage()
	{
		super(GRID);
		setPreferenceStore(GtmEditorPlugin.getPreferenceStore());
		this.setTitle(NationalLanguageSupport.PreferencePage_0);
	}

	/**
	 * Creates the field editors. Field editors are abstractions of
	 * the common GUI blocks needed to manipulate various types
	 * of preferences. Each field editor knows how to save and
	 * restore itself.
	 */
	public void createFieldEditors()
	{

        addField(
					new BooleanFieldEditor(
						PreferenceConstants.P_IMPORT_CONVERABLE_ONLY,
						NationalLanguageSupport.PreferencePage_1,
						getFieldEditorParent()));

    	addField(
					new StringFieldEditor(
							PreferenceConstants.P_IMPORT_CONTRY_FILTER,
							NationalLanguageSupport.PreferencePage_2,
							getFieldEditorParent()));
        /*
        addField(
					new BooleanFieldEditor(
						PreferenceConstants.P_LINK_STATIONS_BY_GEO,
						NationalLanguageSupport.PreferencePage_3,
						getFieldEditorParent()));
	   	
    	addField(
					new IntegerFieldEditor(
							PreferenceConstants.P_LINK_STATIONS_BY_GEO_ACCURACY,
							NationalLanguageSupport.PreferencePage_accuracy,
							getFieldEditorParent()));
    	*/
        addField(
					new BooleanFieldEditor(
						PreferenceConstants.P_REMOVE_OPTIONAL_VIAS,
						NationalLanguageSupport.PreferencePage_optional_vias,
						getFieldEditorParent()));
    	
        
    	addField(
					new IntegerFieldEditor(
							PreferenceConstants.P_LIST_FOLDER_SIZE,
							NationalLanguageSupport.PreferencePage_folder_size,
							getFieldEditorParent()));
        
        addField(
					new BooleanFieldEditor(
						PreferenceConstants.P_SUPRESS_STATION_LABEL,
						NationalLanguageSupport.Preference_supress_station_label,
						getFieldEditorParent()));
        
        addField(
					new BooleanFieldEditor(
						PreferenceConstants.P_SUPRESS_COUNTRY_LABEL,
						NationalLanguageSupport.Preference_supress_country_label,
						getFieldEditorParent()));
    	
	};


	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench)	{

		// second parameter is typically the plug-in id
	    setPreferenceStore(new ScopedPreferenceStore(InstanceScope.INSTANCE, "GTM_data_converter.editor")); //$NON-NLS-1$
	    setDescription(NationalLanguageSupport.PreferencePage_4);
	    //provide access to the edit module
	    PropertyAdapter.getInstance().setStore(GtmEditorPlugin.getPreferenceStore());

	}
}


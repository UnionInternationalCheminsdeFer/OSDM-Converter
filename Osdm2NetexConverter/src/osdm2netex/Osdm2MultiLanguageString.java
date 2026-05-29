package osdm2netex;

import Gtm.Text;
import Gtm.Texts;
import uk.org.netex.netex.AlternativeText;
import uk.org.netex.netex.FareFrame;
import uk.org.netex.netex.MultilingualString;
import uk.org.netex.netex.ObjectFactory;

public class Osdm2MultiLanguageString {
	
	public static MultilingualString getMultiLanguageString(Text osdmText) {
		ObjectFactory factory = new ObjectFactory();
		
		MultilingualString mls = factory.createMultilingualString();
		mls.setTextIdType(osdmText.getId());	
        return mls;
	}

	
	public static MultilingualString getMultiLanguageString(String string) {
		ObjectFactory factory = new ObjectFactory();
		
		MultilingualString mls = factory.createMultilingualString();
		mls.getContent().add(string);
		return mls;
	}

	public static MultilingualString getMultiLanguageString(Gtm.Translation tr) {
		
		MultilingualString mls = new MultilingualString();
		mls.setLang(tr.getLanguage().getCode());
		mls.getContent().add(tr.getTextUTF8());
		return mls;
	}
	
	public static void convertTexts(Texts texts, FareFrame frame) {
		
		ObjectFactory factory = new ObjectFactory();
		
		for (Gtm.Text t : texts.getTexts()) {
			
			AlternativeText at = factory.createAlternativeText();
			at.setId(t.getId());

			at.setText(Osdm2MultiLanguageString.getMultiLanguageString(t.getTextUTF8()));
			if (t.getTranslations() != null && !t.getTranslations().isEmpty()) {
				at.setAlternativeTexts(factory.createAlternativeTextsRelStructure());
				
				for (Gtm.Translation tr :    t.getTranslations()) {
					AlternativeText at2 = factory.createAlternativeText();
					at2.setText(Osdm2MultiLanguageString.getMultiLanguageString(tr));					
					at.getAlternativeTexts().getAlternativeText().add(at2);
				}
			}

			frame.getAlternativeTexts().getAlternativeText().add(at);
		}
		
	}	
	
}

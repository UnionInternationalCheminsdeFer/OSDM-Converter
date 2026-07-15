package osdm2netex;

import Gtm.Text;
import Gtm.Texts;
import Gtm.Translation;
import uk.org.netex.netex.AlternativeText;
import uk.org.netex.netex.FareFrame;
import uk.org.netex.netex.MultilingualString;
import uk.org.netex.netex.ObjectFactory;
import uk.org.netex.netex.TextType;

public class Osdm2MultiLanguageString {
	
	public static MultilingualString getMultiLanguageString(Text osdmText) {
		ObjectFactory factory = new ObjectFactory();
		
		MultilingualString mls = factory.createMultilingualString();
		mls.setTextIdType(osdmText.getId());	
		
		TextType t1 = factory.createTextType();
		t1.setValue(osdmText.getTextUTF8());
		t1.setTextIdType( IdFactory.getTextId(osdmText) + "_l");
		mls.getContent().add(factory.createMultilingualStringText(t1));
		if (osdmText.getShortTextUTF8() != null && 
				!osdmText.getShortTextUTF8().equals(osdmText.getTextUTF8())) {
			TextType t2 = factory.createTextType();
			t2.setValue(osdmText.getShortTextUTF8());
			t1.setTextIdType( IdFactory.getTextId(osdmText) + "_s");
			mls.getContent().add(factory.createMultilingualStringText(t2));
		}
		
		for (Translation t :  osdmText.getTranslations()) {
			
			TextType tr1 = factory.createTextType();
			tr1.setValue(t.getTextUTF8());
			tr1.setLang(t.getLanguage().getCode());
			tr1.setTextIdType( IdFactory.getTextId(osdmText) + "_l_" + t.getLanguage().getCode());
			mls.getContent().add(factory.createMultilingualStringText(tr1));
			if (t.getShortTextUTF8() != null && 
					!t.getShortTextUTF8().equals(t.getTextUTF8())) {
				TextType tr2 = factory.createTextType();
				tr2.setLang(t.getLanguage().getCode());			
				tr2.setValue(t.getShortTextUTF8());		
				tr2.setTextIdType( IdFactory.getTextId(osdmText) + "_s_" + t.getLanguage().getCode());
				mls.getContent().add(factory.createMultilingualStringText(tr2));
			}
			
		}
        return mls;
	}

	
	public static MultilingualString getMultiLanguageString(String string) {
		ObjectFactory factory = new ObjectFactory();
		
		MultilingualString mls = factory.createMultilingualString();
		mls.getContent().add(string);
		return mls;
	}

	public static void convertTexts(Texts texts, FareFrame frame) {
		
		ObjectFactory factory = new ObjectFactory();
		
		if (frame.getAlternativeTexts() == null) {
			frame.setAlternativeTexts(factory.createAlternativeTextsRelStructure());
		}
		
		for (Gtm.Text t : texts.getTexts()) {
						
			MultilingualString mls =  getMultiLanguageString(t);
						
			AlternativeText at = factory.createAlternativeText();
			at.setId(t.getId());
			at.setText(mls);
			
			frame.getAlternativeTexts().getAlternativeText().add(at);
		}
		
	}	
	
}

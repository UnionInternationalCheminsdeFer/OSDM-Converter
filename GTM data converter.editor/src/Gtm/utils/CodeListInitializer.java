package Gtm.utils;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import Gtm.Carrier;
import Gtm.CharacterSet;
import Gtm.CodeLists;
import Gtm.Countries;
import Gtm.Country;
import Gtm.Currencies;
import Gtm.Currency;
import Gtm.FareStructure;
import Gtm.GTMTool;
import Gtm.GenericReductionCards;
import Gtm.GtmFactory;
import Gtm.GtmPackage;
import Gtm.Language;
import Gtm.Languages;
import Gtm.ReductionCard;
import Gtm.ServiceBrands;
import Gtm.Text;
import Gtm.nls.NationalLanguageSupport;

public class CodeListInitializer {
	
	public static void createGenericReductionCards(FareStructure fareStructure, GTMTool tool) {
		createReductionCard(fareStructure,GenericReductionCards.UIC_EURAIL_1.getName(),"Eurail Pass 1st Class", GtmUtils.findCarrier(tool,"9902")); //$NON-NLS-1$ //$NON-NLS-2$
		createReductionCard(fareStructure,GenericReductionCards.UIC_INTERRAIL_1.getName(),"Interrail Pass 1st Class", GtmUtils.findCarrier(tool,"9902"));		 //$NON-NLS-1$ //$NON-NLS-2$
		createReductionCard(fareStructure,GenericReductionCards.UIC_FIP_DUTY_1.getName(),"FIP duty 1st Class", null);			 //$NON-NLS-1$
		createReductionCard(fareStructure,GenericReductionCards.UIC_FIP_LEISURE_FREE_1.getName(),"FIP leasure 1st Class", null);	 //$NON-NLS-1$
		createReductionCard(fareStructure,GenericReductionCards.UIC_FIP_LEISURE_REDU_1.getName(),"FIP leasure reduction 1st Class", null); //$NON-NLS-1$
		createReductionCard(fareStructure,GenericReductionCards.UIC_RAILPLUS_1.getName(),"RailPlus 1st Class", null);	 //$NON-NLS-1$
		createReductionCard(fareStructure,GenericReductionCards.UIC_RIT_11.getName(),"Rail Inclusive Tours 1 1st Class", null);	 //$NON-NLS-1$
		createReductionCard(fareStructure,GenericReductionCards.UIC_RIT_21.getName(),"Rail Inclusive Tours 2 1st Class", null);	 //$NON-NLS-1$
		createReductionCard(fareStructure,GenericReductionCards.UIC_RIT_31.getName(),"Rail Inclusive Tours 3 1st Class", null);	 //$NON-NLS-1$
	
		createReductionCard(fareStructure,GenericReductionCards.UIC_EURAIL_2.getName(),"Eurail Pass 2nd Class", GtmUtils.findCarrier(tool,"9902")); //$NON-NLS-1$ //$NON-NLS-2$
		createReductionCard(fareStructure,GenericReductionCards.UIC_INTERRAIL_2.getName(),"Interrail Pass 2nd Class", GtmUtils.findCarrier(tool,"9902"));		 //$NON-NLS-1$ //$NON-NLS-2$
		createReductionCard(fareStructure,GenericReductionCards.UIC_FIP_DUTY_2.getName(),"FIP duty 2nd Class", null);			 //$NON-NLS-1$
		createReductionCard(fareStructure,GenericReductionCards.UIC_FIP_LEISURE_FREE_2.getName(),"FIP leasure 2nd Class", null);	 //$NON-NLS-1$
		createReductionCard(fareStructure,GenericReductionCards.UIC_FIP_LEISURE_REDU_2.getName(),"FIP leasure reduction 2nd Class", null); //$NON-NLS-1$
		createReductionCard(fareStructure,GenericReductionCards.UIC_RAILPLUS_2.getName(),"RailPlus 2nd Class", null);	 //$NON-NLS-1$
		createReductionCard(fareStructure,GenericReductionCards.UIC_RIT_12.getName(),"Rail Inclusive Tours 1 2nd Class", null);	 //$NON-NLS-1$
		createReductionCard(fareStructure,GenericReductionCards.UIC_RIT_22.getName(),"Rail Inclusive Tours 2 2nd Class", null);	 //$NON-NLS-1$
		createReductionCard(fareStructure,GenericReductionCards.UIC_RIT_32.getName(),"Rail Inclusive Tours 3 2nd Class", null);	 //$NON-NLS-1$

		ReductionCard eu = createReductionCard(fareStructure,GenericReductionCards.UIC_EU_DISABILITY_CARD.getName(),"EU Disability Card", null);	 //$NON-NLS-1$
		ReductionCard c = createReductionCard(fareStructure,GenericReductionCards.UIC_INT_DISABILITY_CARD.getName(),"International Disability Card", null);	 //$NON-NLS-1$
		c.getIncludedReductionCards().add(eu);
		
		createReductionCard(fareStructure,GenericReductionCards.UIC_EURAIL.getName(),"Eurail Pass - deprecated-use class specific cards", GtmUtils.findCarrier(tool,"9902")); //$NON-NLS-1$ //$NON-NLS-2$
		createReductionCard(fareStructure,GenericReductionCards.UIC_INTERRAIL.getName(),"Interrail Pass - deprecated-use class specific cards", GtmUtils.findCarrier(tool,"9902"));		 //$NON-NLS-1$ //$NON-NLS-2$
		createReductionCard(fareStructure,GenericReductionCards.UIC_FIP_DUTY.getName(),"FIP duty - deprecated-use class specific cards", null);			 //$NON-NLS-1$
		createReductionCard(fareStructure,GenericReductionCards.UIC_FIP_LEISURE_FREE.getName(),"FIP leasure - deprecated-use class specific cards", null);	 //$NON-NLS-1$
		createReductionCard(fareStructure,GenericReductionCards.UIC_FIP_LEISURE_REDU.getName(),"FIP leasure reduction - deprecated-use class specific cards", null); //$NON-NLS-1$
		createReductionCard(fareStructure,GenericReductionCards.UIC_RAILPLUS.getName(),"RailPlus - deprecated-use class specific cards", null);	 //$NON-NLS-1$
		createReductionCard(fareStructure,GenericReductionCards.UIC_RIT_1.getName(),"Rail Inclusive Tours 1 - deprecated-use class specific cards", null);	 //$NON-NLS-1$
		createReductionCard(fareStructure,GenericReductionCards.UIC_RIT_2.getName(),"Rail Inclusive Tours 2 - deprecated-use class specific cards", null);	 //$NON-NLS-1$
		createReductionCard(fareStructure,GenericReductionCards.UIC_RIT_3.getName(),"Rail Inclusive Tours 3 - deprecated-use class specific cards", null);	 //$NON-NLS-1$

	}

	/**
	 * Creates the reduction card.
	 *
	 * @param fareStructure the fare structure
	 * @param id the id
	 * @param name the name
	 * @param carrier the carrier
	 */
	private static ReductionCard createReductionCard(FareStructure fareStructure, String id, String name, Carrier carrier) {
		
		Text text =  GtmFactory.eINSTANCE.createText();
		ReductionCard card =  GtmFactory.eINSTANCE.createReductionCard();
		text.setTextUTF8(name);
		text.setShortTextUTF8(name);
		text.setTextICAO(name);
		text.setShortTextICAO(name);
		text.setStandardText(true);
		//no export of the text
		card.setCardIssuer(carrier);
		card.setId(id);
		card.setName(text);
		//no export of the card
		card.setUicCode(true);
		if (fareStructure.getTexts() == null) {
			fareStructure.setTexts(GtmFactory.eINSTANCE.createTexts());
		}
		fareStructure.getTexts().getTexts().add(text);
		if (fareStructure.getReductionCards() == null) {
			fareStructure.setReductionCards(GtmFactory.eINSTANCE.createReductionCards());
		}
		fareStructure.getReductionCards().getReductionCards().add(card);
		
		return card;
	}



	/**
	 * Creates the populate countries command.
	 *
	 * @param domain the domain
	 * @param codeLists the code lists
	 * @return the command
	 */
	public Command createPopulateCountriesCommand(EditingDomain domain, CodeLists codeLists) {

		
		Countries countries = GtmFactory.eINSTANCE.createCountries();
		populateUICcountries(countries);
		
		SetCommand command = new SetCommand(domain, countries, GtmPackage.Literals.CODE_LISTS__COUNTRIES, countries);
		
		
		return command;
	}
	
	/**
	 * Populate UI ccountries.
	 *
	 * @param countries the countries
	 */
	public static void populateUICcountries(Countries countries){ 
		
		countries.getCountries().add(createCountry(10,"Finland","FI",CharacterSet.LATIN1_ISO88591)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(20,"Russian Federation","RU",CharacterSet.LATINKYRILLIC_ISO88595)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(21,"Belarus","BY",CharacterSet.LATIN5_ISO88599)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(22,"Ukraine","UA",CharacterSet.LATIN5_ISO88599)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(23,"Moldova, Republic of","MD",CharacterSet.LATIN5_ISO88599)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(24,"Lithuania","LT",CharacterSet.LATIN4_ISO88594)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(25,"Latvia","LV",CharacterSet.LATIN4_ISO88594)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(26,"Estonia","EE",CharacterSet.LATIN4_ISO88594)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(27,"Kazakhstan"," KZ",CharacterSet.LATINKYRILLIC_ISO88595)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(28,"Georgia","GE",CharacterSet.LATINKYRILLIC_ISO88595)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(29,"Uzbekistan","UZ",CharacterSet.LATINKYRILLIC_ISO88595)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(30,"Korea, Democratic People's Republic of","KP",CharacterSet.LATIN1_ISO88591)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(31,"Mongolia","MN",CharacterSet.LATIN1_ISO88591)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(32,"Vietnam","VN",CharacterSet.LATIN1_ISO88591)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(33,"China","CN",CharacterSet.LATIN1_ISO88591)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(40,"Cuba","CU",CharacterSet.LATIN1_ISO88591)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(41,"Albania","AL",CharacterSet.LATIN2_ISO88592)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(42,"Japan","JP",CharacterSet.LATIN1_ISO88591)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(43,"GYSEV temporary irregular code not to be used beyond mid 2022","HU",CharacterSet.LATIN2_ISO88592)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(44,"Bosnia and Herzegovina, Serb Republic of ","BA",CharacterSet.LATIN2_ISO88592)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(50,"Bosnia and Herzegovina, Muslim-Croat Federation of","BA",CharacterSet.LATIN2_ISO88592)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(51,"Poland","PL",CharacterSet.LATIN2_ISO88592)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(52,"Bulgaria"," BG",CharacterSet.LATINKYRILLIC_ISO88595)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(53,"Romania","RO",CharacterSet.LATIN2_ISO88592)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(54,"Czech Republic","CZ",CharacterSet.LATIN2_ISO88592)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(55,"Hungary","HU",CharacterSet.LATIN2_ISO88592)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(56,"Slovakia","SK",CharacterSet.LATIN2_ISO88592)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(57,"Azerbaijan","AZ",CharacterSet.LATINKYRILLIC_ISO88595)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(58,"Armenia","AM",CharacterSet.LATINKYRILLIC_ISO88595)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(59,"Kyrgyzstan","KG",CharacterSet.LATINKYRILLIC_ISO88595)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(60,"Ireland","IE",CharacterSet.LATIN1_ISO88591)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(61,"Korea, Republic of","KR",CharacterSet.LATIN1_ISO88591)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(62,"Montenegro","ME",CharacterSet.LATIN2_ISO88592)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(65,"Macedonia, The former Yugoslav Republic of","MD",CharacterSet.LATIN2_ISO88592)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(66,"Tajikistan","TJ",CharacterSet.LATINKYRILLIC_ISO88595)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(67,"Turkmenistan","TM",CharacterSet.LATINKYRILLIC_ISO88595)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(70,"United Kingdom of Great Britain and Northern Ireland","GB",CharacterSet.LATIN1_ISO88591)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(71,"Spain","ES",CharacterSet.LATIN1_ISO88591)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(72,"Serbia","RS",CharacterSet.LATIN2_ISO88592));	 //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(73,"Greece","GR",CharacterSet.LATIN7_ISO885913)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(74,"Sweden","SE",CharacterSet.LATIN1_ISO88591)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(75,"Turkey","TR",CharacterSet.LATIN5_ISO88599));	 //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(76,"Norway","NO",CharacterSet.LATIN1_ISO88591)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(78,"Croatia","HR",CharacterSet.LATIN2_ISO88592));	 //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(79,"Slovenia","SI",CharacterSet.LATIN2_ISO88592)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(80,"Germany","DE",CharacterSet.LATIN1_ISO88591)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(81,"Austria","AT",CharacterSet.LATIN1_ISO88591));	 //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(82,"Luxemburg","LU",CharacterSet.LATIN1_ISO88591)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(83,"Italy","IT",CharacterSet.LATIN1_ISO88591)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(84,"Netherlands","NL",CharacterSet.LATIN1_ISO88591));	 //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(85,"Switzerland","CH",CharacterSet.LATIN1_ISO88591)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(86,"Denmark","DK",CharacterSet.LATIN1_ISO88591));	 //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(87,"France","FR",CharacterSet.LATIN1_ISO88591)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(88,"Belgium","BE",CharacterSet.LATIN1_ISO88591)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(90,"Egypt","EG",CharacterSet.LATINARABIC_ISO88596)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(91,"Tunesia","TN",CharacterSet.LATINARABIC_ISO88596)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(92,"Algeria","DZ",CharacterSet.LATINARABIC_ISO88596)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(93,"Morocco","MA",CharacterSet.LATINARABIC_ISO88596)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(94,"Portugal","PT",CharacterSet.LATIN1_ISO88591)); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(95,"Israel","IL",CharacterSet.LATINHEBREW_ISO88598));			 //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(96,"Iran, Islamic Republic of","IR",CharacterSet.LATINARABIC_ISO88596));	 //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(97,"Syrian Arab Republic","SY",CharacterSet.LATINARABIC_ISO88596));	 //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(98,"Lebanon","LB",CharacterSet.LATINARABIC_ISO88596));	 //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(99,"Iraq","IQ",CharacterSet.LATINARABIC_ISO88596));	 //$NON-NLS-1$ //$NON-NLS-2$
		
	}
	
	/**
	 * Populate UIC laguages.
	 *
	 * @param languages the languages
	 */
	public static void populateUICLaguages(Languages languages){
		
		languages.getLanguages().add(createLanguage("de", "German")); //$NON-NLS-1$ //$NON-NLS-2$
		languages.getLanguages().add(createLanguage("ru", "Russian")); //$NON-NLS-1$ //$NON-NLS-2$
		languages.getLanguages().add(createLanguage("fr", "French"));  //$NON-NLS-1$ //$NON-NLS-2$
		languages.getLanguages().add(createLanguage("it", "Italian")); //$NON-NLS-1$ //$NON-NLS-2$
		languages.getLanguages().add(createLanguage("en", "English"));	//$NON-NLS-1$ //$NON-NLS-2$
		
	}
	
	/**
	 * Creates the language.
	 *
	 * @param code the code
	 * @param name the name
	 * @return the language
	 */
	public static Language createLanguage(String code, String name) {
		Language language = GtmFactory.eINSTANCE.createLanguage();
		language.setCode(code);
		language.setName(name);
		return language;
	}


	/**
	 * Creates the country.
	 *
	 * @param code the code
	 * @param name the name
	 * @param ISOcodeA2 the IS ocode A 2
	 * @param latin1Iso88591 
	 * @return the country
	 */
	public static Country createCountry(int code, String name, String ISOcodeA2, CharacterSet charSet) {		
		Country country = GtmFactory.eINSTANCE.createCountry();
		country.setCode(code);
		country.setName(name);
		country.setISOcode(ISOcodeA2);
		country.setDefaultCharacterSet(charSet);
		return country;
	}
	
	/**
	 * Populate currencies.
	 *
	 * @param currencies the currencies
	 */
	public static void populateCurrencies(Currencies currencies) {
		
		Currency currency = GtmFactory.eINSTANCE.createCurrency();
		currency.setIsoCode("EUR"); //$NON-NLS-1$
		currency.setName(NationalLanguageSupport.GtmUtils_149);		
		currencies.getCurrencies().add(currency);
	}
	
	/**
	 * Populate service brands.
	 *
	 * @param brands the brands
	 */
	public static void populateServiceBrands(ServiceBrands brands) {
		
	}

}

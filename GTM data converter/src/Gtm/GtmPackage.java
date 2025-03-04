/**
 */
package Gtm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Gtm.GtmFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore conversionDelegates='http:///org/eclipse/emf/ecore/util/DateConversionDelegate'"
 * @generated
 */
public interface GtmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Gtm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/GTM%20data%20converter/model/gtm.xsd";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Gtm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GtmPackage eINSTANCE = Gtm.impl.GtmPackageImpl.init();

	/**
	 * The meta object id for the '{@link Gtm.impl.GTMToolImpl <em>GTM Tool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.GTMToolImpl
	 * @see Gtm.impl.GtmPackageImpl#getGTMTool()
	 * @generated
	 */
	int GTM_TOOL = 0;

	/**
	 * The feature id for the '<em><b>Conversion From Legacy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTM_TOOL__CONVERSION_FROM_LEGACY = 0;

	/**
	 * The feature id for the '<em><b>Code Lists</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTM_TOOL__CODE_LISTS = 1;

	/**
	 * The feature id for the '<em><b>General Tariff Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTM_TOOL__GENERAL_TARIFF_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Workflow History</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTM_TOOL__WORKFLOW_HISTORY = 3;

	/**
	 * The number of structural features of the '<em>GTM Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTM_TOOL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>GTM Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTM_TOOL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.CodeListsImpl <em>Code Lists</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.CodeListsImpl
	 * @see Gtm.impl.GtmPackageImpl#getCodeLists()
	 * @generated
	 */
	int CODE_LISTS = 1;

	/**
	 * The feature id for the '<em><b>Carriers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LISTS__CARRIERS = 0;

	/**
	 * The feature id for the '<em><b>Stations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LISTS__STATIONS = 1;

	/**
	 * The feature id for the '<em><b>Countries</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LISTS__COUNTRIES = 2;

	/**
	 * The feature id for the '<em><b>Languages</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LISTS__LANGUAGES = 3;

	/**
	 * The feature id for the '<em><b>Currencies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LISTS__CURRENCIES = 4;

	/**
	 * The feature id for the '<em><b>Service Brands</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LISTS__SERVICE_BRANDS = 5;

	/**
	 * The feature id for the '<em><b>Nuts Codes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LISTS__NUTS_CODES = 6;

	/**
	 * The number of structural features of the '<em>Code Lists</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LISTS_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Code Lists</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LISTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.WorkflowHistoryImpl <em>Workflow History</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.WorkflowHistoryImpl
	 * @see Gtm.impl.GtmPackageImpl#getWorkflowHistory()
	 * @generated
	 */
	int WORKFLOW_HISTORY = 2;

	/**
	 * The feature id for the '<em><b>Workflow Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_HISTORY__WORKFLOW_STEPS = 0;

	/**
	 * The number of structural features of the '<em>Workflow History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_HISTORY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Workflow History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_HISTORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.WorkflowStepImpl <em>Workflow Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.WorkflowStepImpl
	 * @see Gtm.impl.GtmPackageImpl#getWorkflowStep()
	 * @generated
	 */
	int WORKFLOW_STEP = 3;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_STEP__TIME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_STEP__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Workflow Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_STEP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Workflow Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.NUTSCodesImpl <em>NUTS Codes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.NUTSCodesImpl
	 * @see Gtm.impl.GtmPackageImpl#getNUTSCodes()
	 * @generated
	 */
	int NUTS_CODES = 4;

	/**
	 * The feature id for the '<em><b>Nuts Codes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUTS_CODES__NUTS_CODES = 0;

	/**
	 * The number of structural features of the '<em>NUTS Codes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUTS_CODES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>NUTS Codes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUTS_CODES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.NutsCodeImpl <em>Nuts Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.NutsCodeImpl
	 * @see Gtm.impl.GtmPackageImpl#getNutsCode()
	 * @generated
	 */
	int NUTS_CODE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUTS_CODE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUTS_CODE__CODE = 1;

	/**
	 * The number of structural features of the '<em>Nuts Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUTS_CODE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Nuts Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUTS_CODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.ServiceBrandsImpl <em>Service Brands</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.ServiceBrandsImpl
	 * @see Gtm.impl.GtmPackageImpl#getServiceBrands()
	 * @generated
	 */
	int SERVICE_BRANDS = 6;

	/**
	 * The feature id for the '<em><b>Service Brands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BRANDS__SERVICE_BRANDS = 0;

	/**
	 * The number of structural features of the '<em>Service Brands</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BRANDS_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Find Service BRand</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BRANDS___FIND_SERVICE_BRAND__INT = 0;

	/**
	 * The number of operations of the '<em>Service Brands</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BRANDS_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link Gtm.impl.ServiceBrandImpl <em>Service Brand</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.ServiceBrandImpl
	 * @see Gtm.impl.GtmPackageImpl#getServiceBrand()
	 * @generated
	 */
	int SERVICE_BRAND = 7;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BRAND__CODE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BRAND__NAME = 1;

	/**
	 * The feature id for the '<em><b>Abbreviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BRAND__ABBREVIATION = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BRAND__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Transport Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BRAND__TRANSPORT_MODE = 4;

	/**
	 * The feature id for the '<em><b>Local Language Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BRAND__LOCAL_LANGUAGE_NAME = 5;

	/**
	 * The number of structural features of the '<em>Service Brand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BRAND_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Service Brand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BRAND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.CountriesImpl <em>Countries</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.CountriesImpl
	 * @see Gtm.impl.GtmPackageImpl#getCountries()
	 * @generated
	 */
	int COUNTRIES = 8;

	/**
	 * The feature id for the '<em><b>Countries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRIES__COUNTRIES = 0;

	/**
	 * The number of structural features of the '<em>Countries</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRIES_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Find Country</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRIES___FIND_COUNTRY__INT = 0;

	/**
	 * The number of operations of the '<em>Countries</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRIES_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link Gtm.impl.CountryImpl <em>Country</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.CountryImpl
	 * @see Gtm.impl.GtmPackageImpl#getCountry()
	 * @generated
	 */
	int COUNTRY = 9;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__CODE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__NAME = 1;

	/**
	 * The feature id for the '<em><b>IS Ocode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__IS_OCODE = 2;

	/**
	 * The feature id for the '<em><b>Default Character Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__DEFAULT_CHARACTER_SET = 3;

	/**
	 * The number of structural features of the '<em>Country</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Country</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.LanguagesImpl <em>Languages</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.LanguagesImpl
	 * @see Gtm.impl.GtmPackageImpl#getLanguages()
	 * @generated
	 */
	int LANGUAGES = 10;

	/**
	 * The feature id for the '<em><b>Languages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGES__LANGUAGES = 0;

	/**
	 * The number of structural features of the '<em>Languages</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Languages</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.LanguageImpl <em>Language</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.LanguageImpl
	 * @see Gtm.impl.GtmPackageImpl#getLanguage()
	 * @generated
	 */
	int LANGUAGE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__CODE = 1;

	/**
	 * The number of structural features of the '<em>Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.CurrenciesImpl <em>Currencies</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.CurrenciesImpl
	 * @see Gtm.impl.GtmPackageImpl#getCurrencies()
	 * @generated
	 */
	int CURRENCIES = 12;

	/**
	 * The feature id for the '<em><b>Currencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCIES__CURRENCIES = 0;

	/**
	 * The number of structural features of the '<em>Currencies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCIES_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Find Currency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCIES___FIND_CURRENCY__STRING = 0;

	/**
	 * The number of operations of the '<em>Currencies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCIES_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link Gtm.impl.CurrencyImpl <em>Currency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.CurrencyImpl
	 * @see Gtm.impl.GtmPackageImpl#getCurrency()
	 * @generated
	 */
	int CURRENCY = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Iso Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY__ISO_CODE = 1;

	/**
	 * The number of structural features of the '<em>Currency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Currency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.StationsImpl <em>Stations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.StationsImpl
	 * @see Gtm.impl.GtmPackageImpl#getStations()
	 * @generated
	 */
	int STATIONS = 14;

	/**
	 * The feature id for the '<em><b>Stations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIONS__STATIONS = 0;

	/**
	 * The number of structural features of the '<em>Stations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIONS_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Find Station</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIONS___FIND_STATION__INT_INT = 0;

	/**
	 * The operation id for the '<em>Find Station</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIONS___FIND_STATION__INT_STRING = 1;

	/**
	 * The number of operations of the '<em>Stations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIONS_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link Gtm.impl.StationImpl <em>Station</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.StationImpl
	 * @see Gtm.impl.GtmPackageImpl#getStation()
	 * @generated
	 */
	int STATION = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Country</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__COUNTRY = 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__CODE = 2;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__LONGITUDE = 3;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__LATITUDE = 4;

	/**
	 * The feature id for the '<em><b>Timetable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__TIMETABLE_NAME = 5;

	/**
	 * The feature id for the '<em><b>Border Station</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__BORDER_STATION = 6;

	/**
	 * The feature id for the '<em><b>Name Case UTF8</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__NAME_CASE_UTF8 = 7;

	/**
	 * The feature id for the '<em><b>Name Case ASCII</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__NAME_CASE_ASCII = 8;

	/**
	 * The feature id for the '<em><b>Short Name Case ASCII</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__SHORT_NAME_CASE_ASCII = 9;

	/**
	 * The feature id for the '<em><b>Short Name Case UTF8</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__SHORT_NAME_CASE_UTF8 = 10;

	/**
	 * The feature id for the '<em><b>Legacy Border Point Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__LEGACY_BORDER_POINT_CODE = 11;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__RELATIONS = 12;

	/**
	 * The feature id for the '<em><b>Station Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__STATION_CODE = 13;

	/**
	 * The number of structural features of the '<em>Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.StationRelationImpl <em>Station Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.StationRelationImpl
	 * @see Gtm.impl.GtmPackageImpl#getStationRelation()
	 * @generated
	 */
	int STATION_RELATION = 16;

	/**
	 * The feature id for the '<em><b>Relation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_RELATION__RELATION_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Station</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_RELATION__STATION = 1;

	/**
	 * The number of structural features of the '<em>Station Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_RELATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Station Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_RELATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.CarrierImpl <em>Carrier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.CarrierImpl
	 * @see Gtm.impl.GtmPackageImpl#getCarrier()
	 * @generated
	 */
	int CARRIER = 17;

	/**
	 * The meta object id for the '{@link Gtm.impl.CarriersImpl <em>Carriers</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.CarriersImpl
	 * @see Gtm.impl.GtmPackageImpl#getCarriers()
	 * @generated
	 */
	int CARRIERS = 18;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER__CODE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER__NAME = 1;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER__SHORT_NAME = 2;

	/**
	 * The number of structural features of the '<em>Carrier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Carrier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Carriers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIERS__CARRIERS = 0;

	/**
	 * The number of structural features of the '<em>Carriers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIERS_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Find Carrier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIERS___FIND_CARRIER__STRING = 0;

	/**
	 * The number of operations of the '<em>Carriers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIERS_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link Gtm.impl.StationSetImpl <em>Station Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.StationSetImpl
	 * @see Gtm.impl.GtmPackageImpl#getStationSet()
	 * @generated
	 */
	int STATION_SET = 19;

	/**
	 * The feature id for the '<em><b>Stations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SET__STATIONS = 0;

	/**
	 * The number of structural features of the '<em>Station Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SET_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Station Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.GeneralTariffModelImpl <em>General Tariff Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.GeneralTariffModelImpl
	 * @see Gtm.impl.GtmPackageImpl#getGeneralTariffModel()
	 * @generated
	 */
	int GENERAL_TARIFF_MODEL = 20;

	/**
	 * The feature id for the '<em><b>Delivery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_TARIFF_MODEL__DELIVERY = 0;

	/**
	 * The feature id for the '<em><b>Fare Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_TARIFF_MODEL__FARE_STRUCTURE = 1;

	/**
	 * The number of structural features of the '<em>General Tariff Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_TARIFF_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>General Tariff Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_TARIFF_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.DeliveryImpl <em>Delivery</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.DeliveryImpl
	 * @see Gtm.impl.GtmPackageImpl#getDelivery()
	 * @generated
	 */
	int DELIVERY = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY__ID = 0;

	/**
	 * The feature id for the '<em><b>Previous Delivery Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY__PREVIOUS_DELIVERY_ID = 1;

	/**
	 * The feature id for the '<em><b>Replaced Delivery Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY__REPLACED_DELIVERY_ID = 2;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY__OPTIONAL = 3;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY__PROVIDER = 4;

	/**
	 * The feature id for the '<em><b>Schema Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY__SCHEMA_VERSION = 5;

	/**
	 * The feature id for the '<em><b>Accepted Schema Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY__ACCEPTED_SCHEMA_VERSION = 6;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY__USAGE = 7;

	/**
	 * The number of structural features of the '<em>Delivery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Delivery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.AfterSalesRulesImpl <em>After Sales Rules</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.AfterSalesRulesImpl
	 * @see Gtm.impl.GtmPackageImpl#getAfterSalesRules()
	 * @generated
	 */
	int AFTER_SALES_RULES = 22;

	/**
	 * The feature id for the '<em><b>After Sales Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_SALES_RULES__AFTER_SALES_RULES = 0;

	/**
	 * The number of structural features of the '<em>After Sales Rules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_SALES_RULES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>After Sales Rules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_SALES_RULES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.AfterSalesRuleImpl <em>After Sales Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.AfterSalesRuleImpl
	 * @see Gtm.impl.GtmPackageImpl#getAfterSalesRule()
	 * @generated
	 */
	int AFTER_SALES_RULE = 23;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_SALES_RULE__ID = 0;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_SALES_RULE__DATA_SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_SALES_RULE__CONDITIONS = 2;

	/**
	 * The number of structural features of the '<em>After Sales Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_SALES_RULE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>After Sales Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_SALES_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.AfterSalesConditionImpl <em>After Sales Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.AfterSalesConditionImpl
	 * @see Gtm.impl.GtmPackageImpl#getAfterSalesCondition()
	 * @generated
	 */
	int AFTER_SALES_CONDITION = 24;

	/**
	 * The feature id for the '<em><b>Transaction Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_SALES_CONDITION__TRANSACTION_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Individual Contracts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_SALES_CONDITION__INDIVIDUAL_CONTRACTS = 1;

	/**
	 * The feature id for the '<em><b>Carrier Fee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_SALES_CONDITION__CARRIER_FEE = 2;

	/**
	 * The feature id for the '<em><b>Fee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_SALES_CONDITION__FEE = 3;

	/**
	 * The feature id for the '<em><b>Application Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_SALES_CONDITION__APPLICATION_TIME = 4;

	/**
	 * The number of structural features of the '<em>After Sales Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_SALES_CONDITION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>After Sales Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_SALES_CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.RelativeTimeImpl <em>Relative Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.RelativeTimeImpl
	 * @see Gtm.impl.GtmPackageImpl#getRelativeTime()
	 * @generated
	 */
	int RELATIVE_TIME = 100;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_TIME__UNIT = 0;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_TIME__REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_TIME__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Relative Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_TIME_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Relative Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_TIME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.ApplicationTimeImpl <em>Application Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.ApplicationTimeImpl
	 * @see Gtm.impl.GtmPackageImpl#getApplicationTime()
	 * @generated
	 */
	int APPLICATION_TIME = 25;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_TIME__UNIT = RELATIVE_TIME__UNIT;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_TIME__REFERENCE = RELATIVE_TIME__REFERENCE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_TIME__VALUE = RELATIVE_TIME__VALUE;

	/**
	 * The number of structural features of the '<em>Application Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_TIME_FEATURE_COUNT = RELATIVE_TIME_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Application Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_TIME_OPERATION_COUNT = RELATIVE_TIME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.FareStructureImpl <em>Fare Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.FareStructureImpl
	 * @see Gtm.impl.GtmPackageImpl#getFareStructure()
	 * @generated
	 */
	int FARE_STRUCTURE = 26;

	/**
	 * The feature id for the '<em><b>Service Class Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__SERVICE_CLASS_DEFINITIONS = 0;

	/**
	 * The feature id for the '<em><b>Service Level Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__SERVICE_LEVEL_DEFINITIONS = 1;

	/**
	 * The feature id for the '<em><b>Station Names</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__STATION_NAMES = 2;

	/**
	 * The feature id for the '<em><b>Fare Station Set Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__FARE_STATION_SET_DEFINITIONS = 3;

	/**
	 * The feature id for the '<em><b>Calendars</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__CALENDARS = 4;

	/**
	 * The feature id for the '<em><b>Texts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__TEXTS = 5;

	/**
	 * The feature id for the '<em><b>Reduction Cards</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__REDUCTION_CARDS = 6;

	/**
	 * The feature id for the '<em><b>Fare Constraint Bundles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__FARE_CONSTRAINT_BUNDLES = 7;

	/**
	 * The feature id for the '<em><b>Fare Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__FARE_ELEMENTS = 8;

	/**
	 * The feature id for the '<em><b>Combination Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__COMBINATION_CONSTRAINTS = 9;

	/**
	 * The feature id for the '<em><b>Sales Availability Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__SALES_AVAILABILITY_CONSTRAINTS = 10;

	/**
	 * The feature id for the '<em><b>Travel Validity Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__TRAVEL_VALIDITY_CONSTRAINTS = 11;

	/**
	 * The feature id for the '<em><b>Regional Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__REGIONAL_CONSTRAINTS = 12;

	/**
	 * The feature id for the '<em><b>Connection Points</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__CONNECTION_POINTS = 13;

	/**
	 * The feature id for the '<em><b>Carrier Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__CARRIER_CONSTRAINTS = 14;

	/**
	 * The feature id for the '<em><b>Service Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__SERVICE_CONSTRAINTS = 15;

	/**
	 * The feature id for the '<em><b>Passenger Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__PASSENGER_CONSTRAINTS = 16;

	/**
	 * The feature id for the '<em><b>Total Passenger Combination Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__TOTAL_PASSENGER_COMBINATION_CONSTRAINTS = 17;

	/**
	 * The feature id for the '<em><b>Reduction Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__REDUCTION_CONSTRAINTS = 18;

	/**
	 * The feature id for the '<em><b>Personal Data Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__PERSONAL_DATA_CONSTRAINTS = 19;

	/**
	 * The feature id for the '<em><b>After Sales Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__AFTER_SALES_RULES = 20;

	/**
	 * The feature id for the '<em><b>Prices</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__PRICES = 21;

	/**
	 * The feature id for the '<em><b>Fulfillment Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__FULFILLMENT_CONSTRAINTS = 22;

	/**
	 * The feature id for the '<em><b>Reservation Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__RESERVATION_PARAMETERS = 23;

	/**
	 * The feature id for the '<em><b>Supported Online Services</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__SUPPORTED_ONLINE_SERVICES = 24;

	/**
	 * The feature id for the '<em><b>Fare Resource Locations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__FARE_RESOURCE_LOCATIONS = 25;

	/**
	 * The feature id for the '<em><b>Zone Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__ZONE_DEFINITIONS = 26;

	/**
	 * The feature id for the '<em><b>Luggage Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__LUGGAGE_CONSTRAINTS = 27;

	/**
	 * The feature id for the '<em><b>Products</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__PRODUCTS = 28;

	/**
	 * The feature id for the '<em><b>Carrier Groups</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE__CARRIER_GROUPS = 29;

	/**
	 * The number of structural features of the '<em>Fare Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE_FEATURE_COUNT = 30;

	/**
	 * The number of operations of the '<em>Fare Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.ConnectionPointsImpl <em>Connection Points</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.ConnectionPointsImpl
	 * @see Gtm.impl.GtmPackageImpl#getConnectionPoints()
	 * @generated
	 */
	int CONNECTION_POINTS = 27;

	/**
	 * The feature id for the '<em><b>Connection Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINTS__CONNECTION_POINTS = 0;

	/**
	 * The number of structural features of the '<em>Connection Points</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINTS_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Find Simple Connection Point</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINTS___FIND_SIMPLE_CONNECTION_POINT__STATION = 0;

	/**
	 * The number of operations of the '<em>Connection Points</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINTS_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link Gtm.impl.ConnectionPointImpl <em>Connection Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.ConnectionPointImpl
	 * @see Gtm.impl.GtmPackageImpl#getConnectionPoint()
	 * @generated
	 */
	int CONNECTION_POINT = 28;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Legacy Border Point Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT__LEGACY_BORDER_POINT_CODE = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Connected Station Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT__CONNECTED_STATION_SETS = 4;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT__DATA_SOURCE = 5;

	/**
	 * The feature id for the '<em><b>Name Utf8</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT__NAME_UTF8 = 6;

	/**
	 * The number of structural features of the '<em>Connection Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Connection Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.FareResourceLocationsImpl <em>Fare Resource Locations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.FareResourceLocationsImpl
	 * @see Gtm.impl.GtmPackageImpl#getFareResourceLocations()
	 * @generated
	 */
	int FARE_RESOURCE_LOCATIONS = 29;

	/**
	 * The feature id for the '<em><b>Train Resource Locations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_RESOURCE_LOCATIONS__TRAIN_RESOURCE_LOCATIONS = 0;

	/**
	 * The feature id for the '<em><b>Station Resource Locations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_RESOURCE_LOCATIONS__STATION_RESOURCE_LOCATIONS = 1;

	/**
	 * The feature id for the '<em><b>Carrier Resource Locations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_RESOURCE_LOCATIONS__CARRIER_RESOURCE_LOCATIONS = 2;

	/**
	 * The number of structural features of the '<em>Fare Resource Locations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_RESOURCE_LOCATIONS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Fare Resource Locations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_RESOURCE_LOCATIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.TrainResourceLocationsImpl <em>Train Resource Locations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.TrainResourceLocationsImpl
	 * @see Gtm.impl.GtmPackageImpl#getTrainResourceLocations()
	 * @generated
	 */
	int TRAIN_RESOURCE_LOCATIONS = 30;

	/**
	 * The feature id for the '<em><b>Train Resource Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_RESOURCE_LOCATIONS__TRAIN_RESOURCE_LOCATIONS = 0;

	/**
	 * The number of structural features of the '<em>Train Resource Locations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_RESOURCE_LOCATIONS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Train Resource Locations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_RESOURCE_LOCATIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.StationResourceLocationsImpl <em>Station Resource Locations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.StationResourceLocationsImpl
	 * @see Gtm.impl.GtmPackageImpl#getStationResourceLocations()
	 * @generated
	 */
	int STATION_RESOURCE_LOCATIONS = 31;

	/**
	 * The feature id for the '<em><b>Station Resource Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_RESOURCE_LOCATIONS__STATION_RESOURCE_LOCATIONS = 0;

	/**
	 * The number of structural features of the '<em>Station Resource Locations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_RESOURCE_LOCATIONS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Station Resource Locations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_RESOURCE_LOCATIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.CarrierResourceLocationsImpl <em>Carrier Resource Locations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.CarrierResourceLocationsImpl
	 * @see Gtm.impl.GtmPackageImpl#getCarrierResourceLocations()
	 * @generated
	 */
	int CARRIER_RESOURCE_LOCATIONS = 32;

	/**
	 * The feature id for the '<em><b>Carrier Resource Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_RESOURCE_LOCATIONS__CARRIER_RESOURCE_LOCATIONS = 0;

	/**
	 * The number of structural features of the '<em>Carrier Resource Locations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_RESOURCE_LOCATIONS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Carrier Resource Locations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_RESOURCE_LOCATIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.TrainResourceLocationImpl <em>Train Resource Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.TrainResourceLocationImpl
	 * @see Gtm.impl.GtmPackageImpl#getTrainResourceLocation()
	 * @generated
	 */
	int TRAIN_RESOURCE_LOCATION = 33;

	/**
	 * The feature id for the '<em><b>Carrier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_RESOURCE_LOCATION__CARRIER = 0;

	/**
	 * The feature id for the '<em><b>Online Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_RESOURCE_LOCATION__ONLINE_RESOURCES = 1;

	/**
	 * The feature id for the '<em><b>Train Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_RESOURCE_LOCATION__TRAIN_ID = 2;

	/**
	 * The number of structural features of the '<em>Train Resource Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_RESOURCE_LOCATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Train Resource Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_RESOURCE_LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.StationResourceLocationImpl <em>Station Resource Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.StationResourceLocationImpl
	 * @see Gtm.impl.GtmPackageImpl#getStationResourceLocation()
	 * @generated
	 */
	int STATION_RESOURCE_LOCATION = 34;

	/**
	 * The feature id for the '<em><b>Online Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_RESOURCE_LOCATION__ONLINE_RESOURCES = 0;

	/**
	 * The feature id for the '<em><b>Stations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_RESOURCE_LOCATION__STATIONS = 1;

	/**
	 * The feature id for the '<em><b>Connection Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_RESOURCE_LOCATION__CONNECTION_POINTS = 2;

	/**
	 * The number of structural features of the '<em>Station Resource Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_RESOURCE_LOCATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Station Resource Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_RESOURCE_LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.OnlineResourceImpl <em>Online Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.OnlineResourceImpl
	 * @see Gtm.impl.GtmPackageImpl#getOnlineResource()
	 * @generated
	 */
	int ONLINE_RESOURCE = 36;

	/**
	 * The meta object id for the '{@link Gtm.impl.FulfillmentConstraintsImpl <em>Fulfillment Constraints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.FulfillmentConstraintsImpl
	 * @see Gtm.impl.GtmPackageImpl#getFulfillmentConstraints()
	 * @generated
	 */
	int FULFILLMENT_CONSTRAINTS = 37;

	/**
	 * The meta object id for the '{@link Gtm.impl.FulfillmentConstraintImpl <em>Fulfillment Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.FulfillmentConstraintImpl
	 * @see Gtm.impl.GtmPackageImpl#getFulfillmentConstraint()
	 * @generated
	 */
	int FULFILLMENT_CONSTRAINT = 38;

	/**
	 * The meta object id for the '{@link Gtm.impl.RequiredBarcodesImpl <em>Required Barcodes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.RequiredBarcodesImpl
	 * @see Gtm.impl.GtmPackageImpl#getRequiredBarcodes()
	 * @generated
	 */
	int REQUIRED_BARCODES = 39;

	/**
	 * The meta object id for the '{@link Gtm.impl.AcceptedBarcodesImpl <em>Accepted Barcodes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.AcceptedBarcodesImpl
	 * @see Gtm.impl.GtmPackageImpl#getAcceptedBarcodes()
	 * @generated
	 */
	int ACCEPTED_BARCODES = 40;

	/**
	 * The meta object id for the '{@link Gtm.impl.SupportedOnlineServicesImpl <em>Supported Online Services</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.SupportedOnlineServicesImpl
	 * @see Gtm.impl.GtmPackageImpl#getSupportedOnlineServices()
	 * @generated
	 */
	int SUPPORTED_ONLINE_SERVICES = 41;

	/**
	 * The meta object id for the '{@link Gtm.impl.StationNamesImpl <em>Station Names</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.StationNamesImpl
	 * @see Gtm.impl.GtmPackageImpl#getStationNames()
	 * @generated
	 */
	int STATION_NAMES = 42;

	/**
	 * The meta object id for the '{@link Gtm.impl.FareElementsImpl <em>Fare Elements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.FareElementsImpl
	 * @see Gtm.impl.GtmPackageImpl#getFareElements()
	 * @generated
	 */
	int FARE_ELEMENTS = 43;

	/**
	 * The meta object id for the '{@link Gtm.impl.FareElementImpl <em>Fare Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.FareElementImpl
	 * @see Gtm.impl.GtmPackageImpl#getFareElement()
	 * @generated
	 */
	int FARE_ELEMENT = 44;

	/**
	 * The meta object id for the '{@link Gtm.impl.TotalPassengerCombinationConstraintsImpl <em>Total Passenger Combination Constraints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.TotalPassengerCombinationConstraintsImpl
	 * @see Gtm.impl.GtmPackageImpl#getTotalPassengerCombinationConstraints()
	 * @generated
	 */
	int TOTAL_PASSENGER_COMBINATION_CONSTRAINTS = 45;

	/**
	 * The meta object id for the '{@link Gtm.impl.TotalPassengerCombinationConstraintImpl <em>Total Passenger Combination Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.TotalPassengerCombinationConstraintImpl
	 * @see Gtm.impl.GtmPackageImpl#getTotalPassengerCombinationConstraint()
	 * @generated
	 */
	int TOTAL_PASSENGER_COMBINATION_CONSTRAINT = 46;

	/**
	 * The meta object id for the '{@link Gtm.impl.FareConstraintBundlesImpl <em>Fare Constraint Bundles</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.FareConstraintBundlesImpl
	 * @see Gtm.impl.GtmPackageImpl#getFareConstraintBundles()
	 * @generated
	 */
	int FARE_CONSTRAINT_BUNDLES = 47;

	/**
	 * The meta object id for the '{@link Gtm.impl.FareConstraintBundleImpl <em>Fare Constraint Bundle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.FareConstraintBundleImpl
	 * @see Gtm.impl.GtmPackageImpl#getFareConstraintBundle()
	 * @generated
	 */
	int FARE_CONSTRAINT_BUNDLE = 48;

	/**
	 * The meta object id for the '{@link Gtm.impl.FareStationSetDefinitionsImpl <em>Fare Station Set Definitions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.FareStationSetDefinitionsImpl
	 * @see Gtm.impl.GtmPackageImpl#getFareStationSetDefinitions()
	 * @generated
	 */
	int FARE_STATION_SET_DEFINITIONS = 49;

	/**
	 * The meta object id for the '{@link Gtm.impl.FareStationSetDefinitionImpl <em>Fare Station Set Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.FareStationSetDefinitionImpl
	 * @see Gtm.impl.GtmPackageImpl#getFareStationSetDefinition()
	 * @generated
	 */
	int FARE_STATION_SET_DEFINITION = 50;

	/**
	 * The meta object id for the '{@link Gtm.impl.LegacyAccountingIdentifierImpl <em>Legacy Accounting Identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.LegacyAccountingIdentifierImpl
	 * @see Gtm.impl.GtmPackageImpl#getLegacyAccountingIdentifier()
	 * @generated
	 */
	int LEGACY_ACCOUNTING_IDENTIFIER = 51;

	/**
	 * The meta object id for the '{@link Gtm.impl.ReductionConstraintsImpl <em>Reduction Constraints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.ReductionConstraintsImpl
	 * @see Gtm.impl.GtmPackageImpl#getReductionConstraints()
	 * @generated
	 */
	int REDUCTION_CONSTRAINTS = 118;

	/**
	 * The meta object id for the '{@link Gtm.impl.PersonalDataConstraintsImpl <em>Personal Data Constraints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.PersonalDataConstraintsImpl
	 * @see Gtm.impl.GtmPackageImpl#getPersonalDataConstraints()
	 * @generated
	 */
	int PERSONAL_DATA_CONSTRAINTS = 52;

	/**
	 * The meta object id for the '{@link Gtm.impl.PersonalDataConstraintImpl <em>Personal Data Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.PersonalDataConstraintImpl
	 * @see Gtm.impl.GtmPackageImpl#getPersonalDataConstraint()
	 * @generated
	 */
	int PERSONAL_DATA_CONSTRAINT = 53;

	/**
	 * The meta object id for the '{@link Gtm.impl.RequiredPersonalDataImpl <em>Required Personal Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.RequiredPersonalDataImpl
	 * @see Gtm.impl.GtmPackageImpl#getRequiredPersonalData()
	 * @generated
	 */
	int REQUIRED_PERSONAL_DATA = 54;

	/**
	 * The meta object id for the '{@link Gtm.impl.AllowedPersonalDataChangesImpl <em>Allowed Personal Data Changes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.AllowedPersonalDataChangesImpl
	 * @see Gtm.impl.GtmPackageImpl#getAllowedPersonalDataChanges()
	 * @generated
	 */
	int ALLOWED_PERSONAL_DATA_CHANGES = 55;

	/**
	 * The meta object id for the '{@link Gtm.impl.PassengerConstraintsImpl <em>Passenger Constraints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.PassengerConstraintsImpl
	 * @see Gtm.impl.GtmPackageImpl#getPassengerConstraints()
	 * @generated
	 */
	int PASSENGER_CONSTRAINTS = 56;

	/**
	 * The meta object id for the '{@link Gtm.impl.PassengerConstraintImpl <em>Passenger Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.PassengerConstraintImpl
	 * @see Gtm.impl.GtmPackageImpl#getPassengerConstraint()
	 * @generated
	 */
	int PASSENGER_CONSTRAINT = 57;

	/**
	 * The meta object id for the '{@link Gtm.impl.PassengerCombinationConstraintImpl <em>Passenger Combination Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.PassengerCombinationConstraintImpl
	 * @see Gtm.impl.GtmPackageImpl#getPassengerCombinationConstraint()
	 * @generated
	 */
	int PASSENGER_COMBINATION_CONSTRAINT = 58;

	/**
	 * The meta object id for the '{@link Gtm.impl.IncludedFreePassengerLimitImpl <em>Included Free Passenger Limit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.IncludedFreePassengerLimitImpl
	 * @see Gtm.impl.GtmPackageImpl#getIncludedFreePassengerLimit()
	 * @generated
	 */
	int INCLUDED_FREE_PASSENGER_LIMIT = 59;

	/**
	 * The meta object id for the '{@link Gtm.impl.CombinationConstraintsImpl <em>Combination Constraints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.CombinationConstraintsImpl
	 * @see Gtm.impl.GtmPackageImpl#getCombinationConstraints()
	 * @generated
	 */
	int COMBINATION_CONSTRAINTS = 60;

	/**
	 * The meta object id for the '{@link Gtm.impl.CombinationConstraintImpl <em>Combination Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.CombinationConstraintImpl
	 * @see Gtm.impl.GtmPackageImpl#getCombinationConstraint()
	 * @generated
	 */
	int COMBINATION_CONSTRAINT = 61;

	/**
	 * The meta object id for the '{@link Gtm.impl.TravelValidityConstraintsImpl <em>Travel Validity Constraints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.TravelValidityConstraintsImpl
	 * @see Gtm.impl.GtmPackageImpl#getTravelValidityConstraints()
	 * @generated
	 */
	int TRAVEL_VALIDITY_CONSTRAINTS = 62;

	/**
	 * The meta object id for the '{@link Gtm.impl.TravelValidityConstraintImpl <em>Travel Validity Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.TravelValidityConstraintImpl
	 * @see Gtm.impl.GtmPackageImpl#getTravelValidityConstraint()
	 * @generated
	 */
	int TRAVEL_VALIDITY_CONSTRAINT = 63;

	/**
	 * The meta object id for the '{@link Gtm.impl.SalesAvailabilityConstraintsImpl <em>Sales Availability Constraints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.SalesAvailabilityConstraintsImpl
	 * @see Gtm.impl.GtmPackageImpl#getSalesAvailabilityConstraints()
	 * @generated
	 */
	int SALES_AVAILABILITY_CONSTRAINTS = 65;

	/**
	 * The meta object id for the '{@link Gtm.impl.SalesAvailabilityConstraintImpl <em>Sales Availability Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.SalesAvailabilityConstraintImpl
	 * @see Gtm.impl.GtmPackageImpl#getSalesAvailabilityConstraint()
	 * @generated
	 */
	int SALES_AVAILABILITY_CONSTRAINT = 66;

	/**
	 * The meta object id for the '{@link Gtm.impl.SalesRestrictionImpl <em>Sales Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.SalesRestrictionImpl
	 * @see Gtm.impl.GtmPackageImpl#getSalesRestriction()
	 * @generated
	 */
	int SALES_RESTRICTION = 67;

	/**
	 * The meta object id for the '{@link Gtm.impl.EndOfSaleImpl <em>End Of Sale</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.EndOfSaleImpl
	 * @see Gtm.impl.GtmPackageImpl#getEndOfSale()
	 * @generated
	 */
	int END_OF_SALE = 68;

	/**
	 * The meta object id for the '{@link Gtm.impl.StartOfSaleImpl <em>Start Of Sale</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.StartOfSaleImpl
	 * @see Gtm.impl.GtmPackageImpl#getStartOfSale()
	 * @generated
	 */
	int START_OF_SALE = 69;

	/**
	 * The meta object id for the '{@link Gtm.impl.ReductionCardsImpl <em>Reduction Cards</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.ReductionCardsImpl
	 * @see Gtm.impl.GtmPackageImpl#getReductionCards()
	 * @generated
	 */
	int REDUCTION_CARDS = 120;

	/**
	 * The meta object id for the '{@link Gtm.impl.ReductionCardImpl <em>Reduction Card</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.ReductionCardImpl
	 * @see Gtm.impl.GtmPackageImpl#getReductionCard()
	 * @generated
	 */
	int REDUCTION_CARD = 121;

	/**
	 * The meta object id for the '{@link Gtm.impl.CarrierConstraintsImpl <em>Carrier Constraints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.CarrierConstraintsImpl
	 * @see Gtm.impl.GtmPackageImpl#getCarrierConstraints()
	 * @generated
	 */
	int CARRIER_CONSTRAINTS = 72;

	/**
	 * The meta object id for the '{@link Gtm.impl.CarrierConstraintImpl <em>Carrier Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.CarrierConstraintImpl
	 * @see Gtm.impl.GtmPackageImpl#getCarrierConstraint()
	 * @generated
	 */
	int CARRIER_CONSTRAINT = 73;

	/**
	 * The meta object id for the '{@link Gtm.impl.ServiceConstraintsImpl <em>Service Constraints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.ServiceConstraintsImpl
	 * @see Gtm.impl.GtmPackageImpl#getServiceConstraints()
	 * @generated
	 */
	int SERVICE_CONSTRAINTS = 74;

	/**
	 * The meta object id for the '{@link Gtm.impl.ServiceConstraintImpl <em>Service Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.ServiceConstraintImpl
	 * @see Gtm.impl.GtmPackageImpl#getServiceConstraint()
	 * @generated
	 */
	int SERVICE_CONSTRAINT = 75;

	/**
	 * The meta object id for the '{@link Gtm.impl.RegionalConstraintsImpl <em>Regional Constraints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.RegionalConstraintsImpl
	 * @see Gtm.impl.GtmPackageImpl#getRegionalConstraints()
	 * @generated
	 */
	int REGIONAL_CONSTRAINTS = 76;

	/**
	 * The meta object id for the '{@link Gtm.impl.RegionalConstraintImpl <em>Regional Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.RegionalConstraintImpl
	 * @see Gtm.impl.GtmPackageImpl#getRegionalConstraint()
	 * @generated
	 */
	int REGIONAL_CONSTRAINT = 77;

	/**
	 * The meta object id for the '{@link Gtm.impl.RegionalValidityImpl <em>Regional Validity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.RegionalValidityImpl
	 * @see Gtm.impl.GtmPackageImpl#getRegionalValidity()
	 * @generated
	 */
	int REGIONAL_VALIDITY = 78;

	/**
	 * The meta object id for the '{@link Gtm.impl.ServiceLevelDefinitionsImpl <em>Service Level Definitions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.ServiceLevelDefinitionsImpl
	 * @see Gtm.impl.GtmPackageImpl#getServiceLevelDefinitions()
	 * @generated
	 */
	int SERVICE_LEVEL_DEFINITIONS = 79;

	/**
	 * The meta object id for the '{@link Gtm.impl.TextsImpl <em>Texts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.TextsImpl
	 * @see Gtm.impl.GtmPackageImpl#getTexts()
	 * @generated
	 */
	int TEXTS = 80;

	/**
	 * The meta object id for the '{@link Gtm.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.TextImpl
	 * @see Gtm.impl.GtmPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 81;

	/**
	 * The meta object id for the '{@link Gtm.impl.TranslationImpl <em>Translation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.TranslationImpl
	 * @see Gtm.impl.GtmPackageImpl#getTranslation()
	 * @generated
	 */
	int TRANSLATION = 82;

	/**
	 * The meta object id for the '{@link Gtm.impl.PricesImpl <em>Prices</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.PricesImpl
	 * @see Gtm.impl.GtmPackageImpl#getPrices()
	 * @generated
	 */
	int PRICES = 83;

	/**
	 * The meta object id for the '{@link Gtm.impl.PriceImpl <em>Price</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.PriceImpl
	 * @see Gtm.impl.GtmPackageImpl#getPrice()
	 * @generated
	 */
	int PRICE = 84;

	/**
	 * The meta object id for the '{@link Gtm.impl.VATDetailImpl <em>VAT Detail</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.VATDetailImpl
	 * @see Gtm.impl.GtmPackageImpl#getVATDetail()
	 * @generated
	 */
	int VAT_DETAIL = 85;

	/**
	 * The meta object id for the '{@link Gtm.impl.CurrencyPriceImpl <em>Currency Price</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.CurrencyPriceImpl
	 * @see Gtm.impl.GtmPackageImpl#getCurrencyPrice()
	 * @generated
	 */
	int CURRENCY_PRICE = 86;

	/**
	 * The meta object id for the '{@link Gtm.impl.ServiceClassDefinitionsImpl <em>Service Class Definitions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.ServiceClassDefinitionsImpl
	 * @see Gtm.impl.GtmPackageImpl#getServiceClassDefinitions()
	 * @generated
	 */
	int SERVICE_CLASS_DEFINITIONS = 87;

	/**
	 * The meta object id for the '{@link Gtm.impl.CalendarsImpl <em>Calendars</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.CalendarsImpl
	 * @see Gtm.impl.GtmPackageImpl#getCalendars()
	 * @generated
	 */
	int CALENDARS = 88;

	/**
	 * The meta object id for the '{@link Gtm.impl.CalendarImpl <em>Calendar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.CalendarImpl
	 * @see Gtm.impl.GtmPackageImpl#getCalendar()
	 * @generated
	 */
	int CALENDAR = 89;

	/**
	 * The meta object id for the '{@link Gtm.impl.ReservationParametersImpl <em>Reservation Parameters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.ReservationParametersImpl
	 * @see Gtm.impl.GtmPackageImpl#getReservationParameters()
	 * @generated
	 */
	int RESERVATION_PARAMETERS = 90;

	/**
	 * The meta object id for the '{@link Gtm.impl.ReservationParameterImpl <em>Reservation Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.ReservationParameterImpl
	 * @see Gtm.impl.GtmPackageImpl#getReservationParameter()
	 * @generated
	 */
	int RESERVATION_PARAMETER = 91;

	/**
	 * The meta object id for the '{@link Gtm.impl.ReservationParams9181Impl <em>Reservation Params9181</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.ReservationParams9181Impl
	 * @see Gtm.impl.GtmPackageImpl#getReservationParams9181()
	 * @generated
	 */
	int RESERVATION_PARAMS9181 = 92;

	/**
	 * The meta object id for the '{@link Gtm.impl.ReservationOptionsImpl <em>Reservation Options</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.ReservationOptionsImpl
	 * @see Gtm.impl.GtmPackageImpl#getReservationOptions()
	 * @generated
	 */
	int RESERVATION_OPTIONS = 93;

	/**
	 * The meta object id for the '{@link Gtm.impl.ReservationPreferenceGroupImpl <em>Reservation Preference Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.ReservationPreferenceGroupImpl
	 * @see Gtm.impl.GtmPackageImpl#getReservationPreferenceGroup()
	 * @generated
	 */
	int RESERVATION_PREFERENCE_GROUP = 94;

	/**
	 * The meta object id for the '{@link Gtm.impl.ServiceClassImpl <em>Service Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.ServiceClassImpl
	 * @see Gtm.impl.GtmPackageImpl#getServiceClass()
	 * @generated
	 */
	int SERVICE_CLASS = 95;

	/**
	 * The meta object id for the '{@link Gtm.impl.ServiceLevelImpl <em>Service Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.ServiceLevelImpl
	 * @see Gtm.impl.GtmPackageImpl#getServiceLevel()
	 * @generated
	 */
	int SERVICE_LEVEL = 96;

	/**
	 * The meta object id for the '{@link Gtm.impl.TimeRangeImpl <em>Time Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.TimeRangeImpl
	 * @see Gtm.impl.GtmPackageImpl#getTimeRange()
	 * @generated
	 */
	int TIME_RANGE = 97;

	/**
	 * The meta object id for the '{@link Gtm.impl.ExcludedTimeRangeImpl <em>Excluded Time Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.ExcludedTimeRangeImpl
	 * @see Gtm.impl.GtmPackageImpl#getExcludedTimeRange()
	 * @generated
	 */
	int EXCLUDED_TIME_RANGE = 98;

	/**
	 * The meta object id for the '{@link Gtm.impl.ValidityRangeImpl <em>Validity Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.ValidityRangeImpl
	 * @see Gtm.impl.GtmPackageImpl#getValidityRange()
	 * @generated
	 */
	int VALIDITY_RANGE = 99;

	/**
	 * The meta object id for the '{@link Gtm.impl.ReturnValidityConstraintImpl <em>Return Validity Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.ReturnValidityConstraintImpl
	 * @see Gtm.impl.GtmPackageImpl#getReturnValidityConstraint()
	 * @generated
	 */
	int RETURN_VALIDITY_CONSTRAINT = 101;

	/**
	 * The meta object id for the '{@link Gtm.impl.ViaStationImpl <em>Via Station</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.ViaStationImpl
	 * @see Gtm.impl.GtmPackageImpl#getViaStation()
	 * @generated
	 */
	int VIA_STATION = 104;

	/**
	 * The meta object id for the '{@link Gtm.impl.AlternativeRouteImpl <em>Alternative Route</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.AlternativeRouteImpl
	 * @see Gtm.impl.GtmPackageImpl#getAlternativeRoute()
	 * @generated
	 */
	int ALTERNATIVE_ROUTE = 105;

	/**
	 * The meta object id for the '{@link Gtm.impl.RouteImpl <em>Route</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.RouteImpl
	 * @see Gtm.impl.GtmPackageImpl#getRoute()
	 * @generated
	 */
	int ROUTE = 106;

	/**
	 * The meta object id for the '{@link Gtm.impl.ZoneImpl <em>Zone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.ZoneImpl
	 * @see Gtm.impl.GtmPackageImpl#getZone()
	 * @generated
	 */
	int ZONE = 107;

	/**
	 * The meta object id for the '{@link Gtm.impl.LineImpl <em>Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.LineImpl
	 * @see Gtm.impl.GtmPackageImpl#getLine()
	 * @generated
	 */
	int LINE = 108;

	/**
	 * The meta object id for the '{@link Gtm.impl.PolygoneImpl <em>Polygone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.PolygoneImpl
	 * @see Gtm.impl.GtmPackageImpl#getPolygone()
	 * @generated
	 */
	int POLYGONE = 109;

	/**
	 * The meta object id for the '{@link Gtm.impl.EdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.EdgeImpl
	 * @see Gtm.impl.GtmPackageImpl#getEdge()
	 * @generated
	 */
	int EDGE = 110;

	/**
	 * The meta object id for the '{@link Gtm.impl.ZoneDefinitionsImpl <em>Zone Definitions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.ZoneDefinitionsImpl
	 * @see Gtm.impl.GtmPackageImpl#getZoneDefinitions()
	 * @generated
	 */
	int ZONE_DEFINITIONS = 111;

	/**
	 * The meta object id for the '{@link Gtm.impl.ZoneDefinitionImpl <em>Zone Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.ZoneDefinitionImpl
	 * @see Gtm.impl.GtmPackageImpl#getZoneDefinition()
	 * @generated
	 */
	int ZONE_DEFINITION = 112;

	/**
	 * The meta object id for the '{@link Gtm.impl.CarrierResourceLocationImpl <em>Carrier Resource Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.CarrierResourceLocationImpl
	 * @see Gtm.impl.GtmPackageImpl#getCarrierResourceLocation()
	 * @generated
	 */
	int CARRIER_RESOURCE_LOCATION = 35;

	/**
	 * The feature id for the '<em><b>Carrier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_RESOURCE_LOCATION__CARRIER = 0;

	/**
	 * The feature id for the '<em><b>Service Brand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_RESOURCE_LOCATION__SERVICE_BRAND = 1;

	/**
	 * The feature id for the '<em><b>Online Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_RESOURCE_LOCATION__ONLINE_RESOURCES = 2;

	/**
	 * The number of structural features of the '<em>Carrier Resource Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_RESOURCE_LOCATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Carrier Resource Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_RESOURCE_LOCATION_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Offer Request Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_RESOURCE__OFFER_REQUEST_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Interface Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_RESOURCE__INTERFACE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_RESOURCE__VERSION = 2;

	/**
	 * The feature id for the '<em><b>System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_RESOURCE__SYSTEM = 3;

	/**
	 * The number of structural features of the '<em>Online Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_RESOURCE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Online Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Fulfillment Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULFILLMENT_CONSTRAINTS__FULFILLMENT_CONSTRAINTS = 0;

	/**
	 * The number of structural features of the '<em>Fulfillment Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULFILLMENT_CONSTRAINTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Fulfillment Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULFILLMENT_CONSTRAINTS_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULFILLMENT_CONSTRAINT__ID = 0;

	/**
	 * The feature id for the '<em><b>Accepted Fulfilment Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULFILLMENT_CONSTRAINT__ACCEPTED_FULFILMENT_TYPES = 1;

	/**
	 * The feature id for the '<em><b>Required Control Data Exchange</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULFILLMENT_CONSTRAINT__REQUIRED_CONTROL_DATA_EXCHANGE = 2;

	/**
	 * The feature id for the '<em><b>Individual Ticketing Permitted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULFILLMENT_CONSTRAINT__INDIVIDUAL_TICKETING_PERMITTED = 3;

	/**
	 * The feature id for the '<em><b>Separate Ful Fillment Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULFILLMENT_CONSTRAINT__SEPARATE_FUL_FILLMENT_REQUIRED = 4;

	/**
	 * The feature id for the '<em><b>Accepted Barcodes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULFILLMENT_CONSTRAINT__ACCEPTED_BARCODES = 5;

	/**
	 * The feature id for the '<em><b>Required Barcodes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULFILLMENT_CONSTRAINT__REQUIRED_BARCODES = 6;

	/**
	 * The feature id for the '<em><b>Data Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULFILLMENT_CONSTRAINT__DATA_DESCRIPTION = 7;

	/**
	 * The feature id for the '<em><b>Accepted Barcode Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULFILLMENT_CONSTRAINT__ACCEPTED_BARCODE_TYPES = 8;

	/**
	 * The feature id for the '<em><b>Required Barcode Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULFILLMENT_CONSTRAINT__REQUIRED_BARCODE_TYPES = 9;

	/**
	 * The number of structural features of the '<em>Fulfillment Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULFILLMENT_CONSTRAINT_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Fulfillment Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULFILLMENT_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Required Barcodes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_BARCODES__REQUIRED_BARCODES = 0;

	/**
	 * The number of structural features of the '<em>Required Barcodes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_BARCODES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Required Barcodes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_BARCODES_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Accepted Barcodes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTED_BARCODES__ACCEPTED_BARCODES = 0;

	/**
	 * The number of structural features of the '<em>Accepted Barcodes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTED_BARCODES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Accepted Barcodes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTED_BARCODES_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Supported Online Services</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_ONLINE_SERVICES__SUPPORTED_ONLINE_SERVICES = 0;

	/**
	 * The number of structural features of the '<em>Supported Online Services</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_ONLINE_SERVICES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Supported Online Services</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_ONLINE_SERVICES_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Station Name</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_NAMES__STATION_NAME = 0;

	/**
	 * The number of structural features of the '<em>Station Names</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_NAMES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Station Names</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_NAMES_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Fare Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENTS__FARE_ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Fare Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Fare Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENTS_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Data Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__DATA_DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Fare Constraint Bundle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__FARE_CONSTRAINT_BUNDLE = 3;

	/**
	 * The feature id for the '<em><b>Text</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__TEXT = 4;

	/**
	 * The feature id for the '<em><b>Price</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__PRICE = 5;

	/**
	 * The feature id for the '<em><b>Regional Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__REGIONAL_CONSTRAINT = 6;

	/**
	 * The feature id for the '<em><b>Service Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__SERVICE_CONSTRAINT = 7;

	/**
	 * The feature id for the '<em><b>Carrier Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__CARRIER_CONSTRAINT = 8;

	/**
	 * The feature id for the '<em><b>Service Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__SERVICE_CLASS = 9;

	/**
	 * The feature id for the '<em><b>Service Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__SERVICE_LEVEL = 10;

	/**
	 * The feature id for the '<em><b>Sales Availability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__SALES_AVAILABILITY = 11;

	/**
	 * The feature id for the '<em><b>Travel Validity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__TRAVEL_VALIDITY = 12;

	/**
	 * The feature id for the '<em><b>Combination Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__COMBINATION_CONSTRAINT = 13;

	/**
	 * The feature id for the '<em><b>Fare Detail Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__FARE_DETAIL_DESCRIPTION = 14;

	/**
	 * The feature id for the '<em><b>Personal Data Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__PERSONAL_DATA_CONSTRAINT = 15;

	/**
	 * The feature id for the '<em><b>Reservation Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__RESERVATION_PARAMETER = 16;

	/**
	 * The feature id for the '<em><b>Reduction Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__REDUCTION_CONSTRAINT = 17;

	/**
	 * The feature id for the '<em><b>Fulfillment Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__FULFILLMENT_CONSTRAINT = 18;

	/**
	 * The feature id for the '<em><b>Passenger Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__PASSENGER_CONSTRAINT = 19;

	/**
	 * The feature id for the '<em><b>Regulatory Conditions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__REGULATORY_CONDITIONS = 20;

	/**
	 * The feature id for the '<em><b>After Sales Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__AFTER_SALES_RULE = 21;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__DATA_SOURCE = 22;

	/**
	 * The feature id for the '<em><b>Legacy Accounting Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__LEGACY_ACCOUNTING_IDENTIFIER = 23;

	/**
	 * The feature id for the '<em><b>Legacy Conversion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__LEGACY_CONVERSION = 24;

	/**
	 * The feature id for the '<em><b>Individual Contracts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__INDIVIDUAL_CONTRACTS = 25;

	/**
	 * The feature id for the '<em><b>Involved Tcos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__INVOLVED_TCOS = 26;

	/**
	 * The feature id for the '<em><b>Luggage Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT__LUGGAGE_CONSTRAINT = 27;

	/**
	 * The number of structural features of the '<em>Fare Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT_FEATURE_COUNT = 28;

	/**
	 * The number of operations of the '<em>Fare Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Total Passenger Combination Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_PASSENGER_COMBINATION_CONSTRAINTS__TOTAL_PASSENGER_COMBINATION_CONSTRAINT = 0;

	/**
	 * The number of structural features of the '<em>Total Passenger Combination Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_PASSENGER_COMBINATION_CONSTRAINTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Total Passenger Combination Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_PASSENGER_COMBINATION_CONSTRAINTS_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_PASSENGER_COMBINATION_CONSTRAINT__ID = 0;

	/**
	 * The feature id for the '<em><b>Data Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_PASSENGER_COMBINATION_CONSTRAINT__DATA_DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Max Total Passenger Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_PASSENGER_COMBINATION_CONSTRAINT__MAX_TOTAL_PASSENGER_WEIGHT = 2;

	/**
	 * The feature id for the '<em><b>Min Total Passenger Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_PASSENGER_COMBINATION_CONSTRAINT__MIN_TOTAL_PASSENGER_WEIGHT = 3;

	/**
	 * The number of structural features of the '<em>Total Passenger Combination Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_PASSENGER_COMBINATION_CONSTRAINT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Total Passenger Combination Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_PASSENGER_COMBINATION_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Fare Constraint Bundles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_CONSTRAINT_BUNDLES__FARE_CONSTRAINT_BUNDLES = 0;

	/**
	 * The number of structural features of the '<em>Fare Constraint Bundles</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_CONSTRAINT_BUNDLES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Fare Constraint Bundles</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_CONSTRAINT_BUNDLES_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_CONSTRAINT_BUNDLE__ID = 0;

	/**
	 * The feature id for the '<em><b>Default Fare Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_CONSTRAINT_BUNDLE__DEFAULT_FARE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Data Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_CONSTRAINT_BUNDLE__DATA_DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Carrier Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_CONSTRAINT_BUNDLE__CARRIER_CONSTRAINT = 3;

	/**
	 * The feature id for the '<em><b>Sales Availability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_CONSTRAINT_BUNDLE__SALES_AVAILABILITY = 4;

	/**
	 * The feature id for the '<em><b>Travel Validity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_CONSTRAINT_BUNDLE__TRAVEL_VALIDITY = 5;

	/**
	 * The feature id for the '<em><b>Combination Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_CONSTRAINT_BUNDLE__COMBINATION_CONSTRAINT = 6;

	/**
	 * The feature id for the '<em><b>Personal Data Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_CONSTRAINT_BUNDLE__PERSONAL_DATA_CONSTRAINT = 7;

	/**
	 * The feature id for the '<em><b>Fulfillment Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_CONSTRAINT_BUNDLE__FULFILLMENT_CONSTRAINT = 8;

	/**
	 * The feature id for the '<em><b>Total Passenger Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_CONSTRAINT_BUNDLE__TOTAL_PASSENGER_CONSTRAINT = 9;

	/**
	 * The feature id for the '<em><b>Default Regulatory Conditions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_CONSTRAINT_BUNDLE__DEFAULT_REGULATORY_CONDITIONS = 10;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_CONSTRAINT_BUNDLE__DATA_SOURCE = 11;

	/**
	 * The feature id for the '<em><b>Converted Bundles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_CONSTRAINT_BUNDLE__CONVERTED_BUNDLES = 12;

	/**
	 * The feature id for the '<em><b>Luggage Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_CONSTRAINT_BUNDLE__LUGGAGE_CONSTRAINT = 13;

	/**
	 * The feature id for the '<em><b>Products</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_CONSTRAINT_BUNDLE__PRODUCTS = 14;

	/**
	 * The number of structural features of the '<em>Fare Constraint Bundle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_CONSTRAINT_BUNDLE_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>Fare Constraint Bundle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_CONSTRAINT_BUNDLE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Fare Station Set Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STATION_SET_DEFINITIONS__FARE_STATION_SET_DEFINITIONS = 0;

	/**
	 * The number of structural features of the '<em>Fare Station Set Definitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STATION_SET_DEFINITIONS_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Find Fare Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STATION_SET_DEFINITIONS___FIND_FARE_SET__CARRIER_INT = 0;

	/**
	 * The number of operations of the '<em>Fare Station Set Definitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STATION_SET_DEFINITIONS_OPERATION_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STATION_SET_DEFINITION__DATA_SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Carrier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STATION_SET_DEFINITION__CARRIER = 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STATION_SET_DEFINITION__CODE = 2;

	/**
	 * The feature id for the '<em><b>Legacy Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STATION_SET_DEFINITION__LEGACY_CODE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STATION_SET_DEFINITION__ID = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STATION_SET_DEFINITION__NAME = 5;

	/**
	 * The feature id for the '<em><b>Name Utf8</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STATION_SET_DEFINITION__NAME_UTF8 = 6;

	/**
	 * The feature id for the '<em><b>Stations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STATION_SET_DEFINITION__STATIONS = 7;

	/**
	 * The number of structural features of the '<em>Fare Station Set Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STATION_SET_DEFINITION_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Fare Station Set Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_STATION_SET_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Series Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_ACCOUNTING_IDENTIFIER__SERIES_ID = 0;

	/**
	 * The feature id for the '<em><b>Tariff Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_ACCOUNTING_IDENTIFIER__TARIFF_ID = 1;

	/**
	 * The feature id for the '<em><b>Add Series Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_ACCOUNTING_IDENTIFIER__ADD_SERIES_ID = 2;

	/**
	 * The number of structural features of the '<em>Legacy Accounting Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_ACCOUNTING_IDENTIFIER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Legacy Accounting Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_ACCOUNTING_IDENTIFIER_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Personal Data Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_DATA_CONSTRAINTS__PERSONAL_DATA_CONSTRAINTS = 0;

	/**
	 * The number of structural features of the '<em>Personal Data Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_DATA_CONSTRAINTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Personal Data Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_DATA_CONSTRAINTS_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_DATA_CONSTRAINT__ID = 0;

	/**
	 * The feature id for the '<em><b>Required Personal Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_DATA_CONSTRAINT__REQUIRED_PERSONAL_DATA = 1;

	/**
	 * The feature id for the '<em><b>Allowed Changes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_DATA_CONSTRAINT__ALLOWED_CHANGES = 2;

	/**
	 * The number of structural features of the '<em>Personal Data Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_DATA_CONSTRAINT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Personal Data Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_DATA_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Ticket Holder Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PERSONAL_DATA__TICKET_HOLDER_ONLY = 0;

	/**
	 * The feature id for the '<em><b>Data Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PERSONAL_DATA__DATA_ITEM = 1;

	/**
	 * The feature id for the '<em><b>Transfer</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PERSONAL_DATA__TRANSFER = 2;

	/**
	 * The feature id for the '<em><b>Fulfillment Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PERSONAL_DATA__FULFILLMENT_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Cross Border</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PERSONAL_DATA__CROSS_BORDER = 4;

	/**
	 * The number of structural features of the '<em>Required Personal Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PERSONAL_DATA_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Required Personal Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PERSONAL_DATA_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Time Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOWED_PERSONAL_DATA_CHANGES__TIME_LIMIT = 0;

	/**
	 * The feature id for the '<em><b>Accepted Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOWED_PERSONAL_DATA_CHANGES__ACCEPTED_REASON = 1;

	/**
	 * The number of structural features of the '<em>Allowed Personal Data Changes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOWED_PERSONAL_DATA_CHANGES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Allowed Personal Data Changes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOWED_PERSONAL_DATA_CHANGES_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Passenger Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_CONSTRAINTS__PASSENGER_CONSTRAINTS = 0;

	/**
	 * The number of structural features of the '<em>Passenger Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_CONSTRAINTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Passenger Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_CONSTRAINTS_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_CONSTRAINT__ID = 0;

	/**
	 * The feature id for the '<em><b>Traveler Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_CONSTRAINT__TRAVELER_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Text</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_CONSTRAINT__TEXT = 2;

	/**
	 * The feature id for the '<em><b>Upper Age Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_CONSTRAINT__UPPER_AGE_LIMIT = 3;

	/**
	 * The feature id for the '<em><b>Lower Age Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_CONSTRAINT__LOWER_AGE_LIMIT = 4;

	/**
	 * The feature id for the '<em><b>Travel Alone Age Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_CONSTRAINT__TRAVEL_ALONE_AGE_LIMIT = 5;

	/**
	 * The feature id for the '<em><b>Reservation Age Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_CONSTRAINT__RESERVATION_AGE_LIMIT = 6;

	/**
	 * The feature id for the '<em><b>Is Ancilliary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_CONSTRAINT__IS_ANCILLIARY = 7;

	/**
	 * The feature id for the '<em><b>Passenger Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_CONSTRAINT__PASSENGER_WEIGHT = 8;

	/**
	 * The feature id for the '<em><b>Max Total Passenger Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_CONSTRAINT__MAX_TOTAL_PASSENGER_WEIGHT = 9;

	/**
	 * The feature id for the '<em><b>Min Total Passenger Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_CONSTRAINT__MIN_TOTAL_PASSENGER_WEIGHT = 10;

	/**
	 * The feature id for the '<em><b>Included Free Passengers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_CONSTRAINT__INCLUDED_FREE_PASSENGERS = 11;

	/**
	 * The feature id for the '<em><b>Excluded Passenger Combinations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_CONSTRAINT__EXCLUDED_PASSENGER_COMBINATIONS = 12;

	/**
	 * The feature id for the '<em><b>Data Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_CONSTRAINT__DATA_DESCRIPTION = 13;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_CONSTRAINT__DATA_SOURCE = 14;

	/**
	 * The number of structural features of the '<em>Passenger Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_CONSTRAINT_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>Passenger Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Max Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_COMBINATION_CONSTRAINT__MAX_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Min Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_COMBINATION_CONSTRAINT__MIN_NUMBER = 1;

	/**
	 * The feature id for the '<em><b>Passenger Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_COMBINATION_CONSTRAINT__PASSENGER_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Passenger Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_COMBINATION_CONSTRAINT__PASSENGER_CONSTRAINT = 3;

	/**
	 * The number of structural features of the '<em>Passenger Combination Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_COMBINATION_CONSTRAINT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Passenger Combination Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_COMBINATION_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_FREE_PASSENGER_LIMIT__NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Passenger Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_FREE_PASSENGER_LIMIT__PASSENGER_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Passenger Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_FREE_PASSENGER_LIMIT__PASSENGER_CONSTRAINT = 2;

	/**
	 * The number of structural features of the '<em>Included Free Passenger Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_FREE_PASSENGER_LIMIT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Included Free Passenger Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_FREE_PASSENGER_LIMIT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Combination Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION_CONSTRAINTS__COMBINATION_CONSTRAINTS = 0;

	/**
	 * The number of structural features of the '<em>Combination Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION_CONSTRAINTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Combination Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION_CONSTRAINTS_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION_CONSTRAINT__ID = 0;

	/**
	 * The feature id for the '<em><b>Data Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION_CONSTRAINT__DATA_DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Combination Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION_CONSTRAINT__COMBINATION_MODELS = 2;

	/**
	 * The number of structural features of the '<em>Combination Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION_CONSTRAINT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Combination Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Travel Validity Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_VALIDITY_CONSTRAINTS__TRAVEL_VALIDITY_CONSTRAINTS = 0;

	/**
	 * The number of structural features of the '<em>Travel Validity Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_VALIDITY_CONSTRAINTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Travel Validity Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_VALIDITY_CONSTRAINTS_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_VALIDITY_CONSTRAINT__ID = 0;

	/**
	 * The feature id for the '<em><b>Data Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_VALIDITY_CONSTRAINT__DATA_DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Valid Days</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_VALIDITY_CONSTRAINT__VALID_DAYS = 2;

	/**
	 * The feature id for the '<em><b>Travel Days</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_VALIDITY_CONSTRAINT__TRAVEL_DAYS = 3;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_VALIDITY_CONSTRAINT__RANGE = 4;

	/**
	 * The feature id for the '<em><b>Return Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_VALIDITY_CONSTRAINT__RETURN_CONSTRAINT = 5;

	/**
	 * The feature id for the '<em><b>Excluded Time Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_VALIDITY_CONSTRAINT__EXCLUDED_TIME_RANGE = 6;

	/**
	 * The feature id for the '<em><b>Train Validity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_VALIDITY_CONSTRAINT__TRAIN_VALIDITY = 7;

	/**
	 * The feature id for the '<em><b>Validity Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_VALIDITY_CONSTRAINT__VALIDITY_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Trip Interruption Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_VALIDITY_CONSTRAINT__TRIP_INTERRUPTION_CONSTRAINT = 9;

	/**
	 * The feature id for the '<em><b>Trip Allocation Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_VALIDITY_CONSTRAINT__TRIP_ALLOCATION_CONSTRAINT = 10;

	/**
	 * The number of structural features of the '<em>Travel Validity Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_VALIDITY_CONSTRAINT_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Travel Validity Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_VALIDITY_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.TrainValidityImpl <em>Train Validity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.TrainValidityImpl
	 * @see Gtm.impl.GtmPackageImpl#getTrainValidity()
	 * @generated
	 */
	int TRAIN_VALIDITY = 64;

	/**
	 * The feature id for the '<em><b>Carrier Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_VALIDITY__CARRIER_CONSTRAINT = 0;

	/**
	 * The feature id for the '<em><b>Serrvice Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_VALIDITY__SERRVICE_CONSTRAINT = 1;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_VALIDITY__SCOPE = 2;

	/**
	 * The number of structural features of the '<em>Train Validity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_VALIDITY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Train Validity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_VALIDITY_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Sales Availability Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_AVAILABILITY_CONSTRAINTS__SALES_AVAILABILITY_CONSTRAINTS = 0;

	/**
	 * The number of structural features of the '<em>Sales Availability Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_AVAILABILITY_CONSTRAINTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Sales Availability Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_AVAILABILITY_CONSTRAINTS_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_AVAILABILITY_CONSTRAINT__ID = 0;

	/**
	 * The feature id for the '<em><b>Data Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_AVAILABILITY_CONSTRAINT__DATA_DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Restrictions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_AVAILABILITY_CONSTRAINT__RESTRICTIONS = 2;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_AVAILABILITY_CONSTRAINT__DATA_SOURCE = 3;

	/**
	 * The number of structural features of the '<em>Sales Availability Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_AVAILABILITY_CONSTRAINT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Sales Availability Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_AVAILABILITY_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Sales Dates</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_RESTRICTION__SALES_DATES = 0;

	/**
	 * The feature id for the '<em><b>Start Of Sale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_RESTRICTION__START_OF_SALE = 1;

	/**
	 * The feature id for the '<em><b>End Of Sale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_RESTRICTION__END_OF_SALE = 2;

	/**
	 * The number of structural features of the '<em>Sales Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_RESTRICTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Sales Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_RESTRICTION_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_OF_SALE__UNIT = RELATIVE_TIME__UNIT;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_OF_SALE__REFERENCE = RELATIVE_TIME__REFERENCE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_OF_SALE__VALUE = RELATIVE_TIME__VALUE;

	/**
	 * The number of structural features of the '<em>End Of Sale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_OF_SALE_FEATURE_COUNT = RELATIVE_TIME_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>End Of Sale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_OF_SALE_OPERATION_COUNT = RELATIVE_TIME_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OF_SALE__UNIT = RELATIVE_TIME__UNIT;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OF_SALE__REFERENCE = RELATIVE_TIME__REFERENCE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OF_SALE__VALUE = RELATIVE_TIME__VALUE;

	/**
	 * The number of structural features of the '<em>Start Of Sale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OF_SALE_FEATURE_COUNT = RELATIVE_TIME_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Start Of Sale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OF_SALE_OPERATION_COUNT = RELATIVE_TIME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.CarrierGroupImpl <em>Carrier Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.CarrierGroupImpl
	 * @see Gtm.impl.GtmPackageImpl#getCarrierGroup()
	 * @generated
	 */
	int CARRIER_GROUP = 71;

	/**
	 * The meta object id for the '{@link Gtm.impl.CarrierGroupsImpl <em>Carrier Groups</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.CarrierGroupsImpl
	 * @see Gtm.impl.GtmPackageImpl#getCarrierGroups()
	 * @generated
	 */
	int CARRIER_GROUPS = 70;

	/**
	 * The feature id for the '<em><b>Carrier Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_GROUPS__CARRIER_GROUPS = 0;

	/**
	 * The number of structural features of the '<em>Carrier Groups</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_GROUPS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Carrier Groups</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_GROUPS_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_GROUP__DATA_SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_GROUP__ID = 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_GROUP__CODE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_GROUP__NAME = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_GROUP__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Legacy Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_GROUP__LEGACY_CODE = 5;

	/**
	 * The feature id for the '<em><b>Companies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_GROUP__COMPANIES = 6;

	/**
	 * The number of structural features of the '<em>Carrier Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_GROUP_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Carrier Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_GROUP_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Carrier Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_CONSTRAINTS__CARRIER_CONSTRAINTS = 0;

	/**
	 * The number of structural features of the '<em>Carrier Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_CONSTRAINTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Carrier Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_CONSTRAINTS_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_CONSTRAINT__ID = 0;

	/**
	 * The feature id for the '<em><b>Included Carriers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_CONSTRAINT__INCLUDED_CARRIERS = 1;

	/**
	 * The feature id for the '<em><b>Excluded Carriers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_CONSTRAINT__EXCLUDED_CARRIERS = 2;

	/**
	 * The feature id for the '<em><b>Data Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_CONSTRAINT__DATA_DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_CONSTRAINT__DATA_SOURCE = 4;

	/**
	 * The feature id for the '<em><b>Included Carrier Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_CONSTRAINT__INCLUDED_CARRIER_GROUP = 5;

	/**
	 * The number of structural features of the '<em>Carrier Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_CONSTRAINT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Carrier Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Service Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONSTRAINTS__SERVICE_CONSTRAINTS = 0;

	/**
	 * The number of structural features of the '<em>Service Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONSTRAINTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Service Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONSTRAINTS_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONSTRAINT__ID = 0;

	/**
	 * The feature id for the '<em><b>Included Service Brands</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONSTRAINT__INCLUDED_SERVICE_BRANDS = 1;

	/**
	 * The feature id for the '<em><b>Excluded Service Brands</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONSTRAINT__EXCLUDED_SERVICE_BRANDS = 2;

	/**
	 * The feature id for the '<em><b>Data Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONSTRAINT__DATA_DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Legacy108 Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONSTRAINT__LEGACY108_CODE = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONSTRAINT__DESCRIPTION = 5;

	/**
	 * The number of structural features of the '<em>Service Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONSTRAINT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Service Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Regional Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_CONSTRAINTS__REGIONAL_CONSTRAINTS = 0;

	/**
	 * The number of structural features of the '<em>Regional Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_CONSTRAINTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Regional Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_CONSTRAINTS_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_CONSTRAINT__ID = 0;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_CONSTRAINT__DISTANCE = 1;

	/**
	 * The feature id for the '<em><b>Entry Connection Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_CONSTRAINT__ENTRY_CONNECTION_POINT = 2;

	/**
	 * The feature id for the '<em><b>Exit Connection Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_CONSTRAINT__EXIT_CONNECTION_POINT = 3;

	/**
	 * The feature id for the '<em><b>Regional Validity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_CONSTRAINT__REGIONAL_VALIDITY = 4;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_CONSTRAINT__DATA_SOURCE = 5;

	/**
	 * The feature id for the '<em><b>Data Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_CONSTRAINT__DATA_DESCRIPTION = 6;

	/**
	 * The feature id for the '<em><b>Linked Fares</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_CONSTRAINT__LINKED_FARES = 7;

	/**
	 * The number of structural features of the '<em>Regional Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_CONSTRAINT_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Regional Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Seq Nb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_VALIDITY__SEQ_NB = 0;

	/**
	 * The feature id for the '<em><b>Via Station</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_VALIDITY__VIA_STATION = 1;

	/**
	 * The feature id for the '<em><b>Zone</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_VALIDITY__ZONE = 2;

	/**
	 * The feature id for the '<em><b>Line</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_VALIDITY__LINE = 3;

	/**
	 * The feature id for the '<em><b>Polygone</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_VALIDITY__POLYGONE = 4;

	/**
	 * The feature id for the '<em><b>Carrier Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_VALIDITY__CARRIER_CONSTRAINT = 5;

	/**
	 * The feature id for the '<em><b>Service Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_VALIDITY__SERVICE_CONSTRAINT = 6;

	/**
	 * The number of structural features of the '<em>Regional Validity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_VALIDITY_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Regional Validity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_VALIDITY_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Service Level Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_DEFINITIONS__SERVICE_LEVEL_DEFINITION = 0;

	/**
	 * The number of structural features of the '<em>Service Level Definitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_DEFINITIONS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Service Level Definitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_DEFINITIONS_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Texts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTS__TEXTS = 0;

	/**
	 * The number of structural features of the '<em>Texts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Texts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTS_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__ID = 0;

	/**
	 * The feature id for the '<em><b>Text UTF8</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__TEXT_UTF8 = 1;

	/**
	 * The feature id for the '<em><b>Text ICAO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__TEXT_ICAO = 2;

	/**
	 * The feature id for the '<em><b>Short Text UTF8</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__SHORT_TEXT_UTF8 = 3;

	/**
	 * The feature id for the '<em><b>Short Text ICAO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__SHORT_TEXT_ICAO = 4;

	/**
	 * The feature id for the '<em><b>Translations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__TRANSLATIONS = 5;

	/**
	 * The feature id for the '<em><b>Standard Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__STANDARD_TEXT = 6;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__DATA_SOURCE = 7;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Language</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION__LANGUAGE = 0;

	/**
	 * The feature id for the '<em><b>Text UTF8</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION__TEXT_UTF8 = 1;

	/**
	 * The feature id for the '<em><b>Text ICAO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION__TEXT_ICAO = 2;

	/**
	 * The feature id for the '<em><b>Short Text UTF8</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION__SHORT_TEXT_UTF8 = 3;

	/**
	 * The feature id for the '<em><b>Short Text ICAO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION__SHORT_TEXT_ICAO = 4;

	/**
	 * The number of structural features of the '<em>Translation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Translation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Prices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICES__PRICES = 0;

	/**
	 * The number of structural features of the '<em>Prices</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Prices</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICES_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICE__ID = 0;

	/**
	 * The feature id for the '<em><b>Currencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICE__CURRENCIES = 1;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICE__DATA_SOURCE = 2;

	/**
	 * The number of structural features of the '<em>Price</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Price</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAT_DETAIL__AMOUNT = 0;

	/**
	 * The feature id for the '<em><b>Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAT_DETAIL__PERCENTAGE = 1;

	/**
	 * The feature id for the '<em><b>Country</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAT_DETAIL__COUNTRY = 2;

	/**
	 * The feature id for the '<em><b>Tax Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAT_DETAIL__TAX_ID = 3;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAT_DETAIL__SCOPE = 4;

	/**
	 * The number of structural features of the '<em>VAT Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAT_DETAIL_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>VAT Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAT_DETAIL_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Currency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_PRICE__CURRENCY = 0;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_PRICE__AMOUNT = 1;

	/**
	 * The feature id for the '<em><b>VA Tdetails</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_PRICE__VA_TDETAILS = 2;

	/**
	 * The number of structural features of the '<em>Currency Price</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_PRICE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Currency Price</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_PRICE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Service Class Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CLASS_DEFINITIONS__SERVICE_CLASS_DEFINITIONS = 0;

	/**
	 * The number of structural features of the '<em>Service Class Definitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CLASS_DEFINITIONS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Service Class Definitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CLASS_DEFINITIONS_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Calendars</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDARS__CALENDARS = 0;

	/**
	 * The number of structural features of the '<em>Calendars</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDARS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Calendars</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDARS_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR__ID = 1;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR__FROM_DATE = 2;

	/**
	 * The feature id for the '<em><b>Until Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR__UNTIL_DATE = 3;

	/**
	 * The feature id for the '<em><b>Utc Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR__UTC_OFFSET = 4;

	/**
	 * The feature id for the '<em><b>Dates</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR__DATES = 5;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR__DATA_SOURCE = 6;

	/**
	 * The feature id for the '<em><b>From Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR__FROM_DATE_TIME = 7;

	/**
	 * The feature id for the '<em><b>Until Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR__UNTIL_DATE_TIME = 8;

	/**
	 * The number of structural features of the '<em>Calendar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Calendar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Reservation Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_PARAMETERS__RESERVATION_PARAMETERS = 0;

	/**
	 * The number of structural features of the '<em>Reservation Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_PARAMETERS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Reservation Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_PARAMETERS_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Mandatory Reservation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_PARAMETER__MANDATORY_RESERVATION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_PARAMETER__ID = 1;

	/**
	 * The feature id for the '<em><b>Params9181</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_PARAMETER__PARAMS9181 = 2;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_PARAMETER__OPTIONS = 3;

	/**
	 * The feature id for the '<em><b>Mandatory Reservation For Brands</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_PARAMETER__MANDATORY_RESERVATION_FOR_BRANDS = 4;

	/**
	 * The feature id for the '<em><b>Mandatory Reservations For Mode</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_PARAMETER__MANDATORY_RESERVATIONS_FOR_MODE = 5;

	/**
	 * The number of structural features of the '<em>Reservation Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_PARAMETER_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Reservation Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Travel Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_PARAMS9181__TRAVEL_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Service Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_PARAMS9181__SERVICE_LEVEL = 1;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_PARAMS9181__SERVICE = 2;

	/**
	 * The feature id for the '<em><b>Berth Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_PARAMS9181__BERTH_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Coach Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_PARAMS9181__COACH_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Compartment Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_PARAMS9181__COMPARTMENT_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Tariff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_PARAMS9181__TARIFF = 6;

	/**
	 * The number of structural features of the '<em>Reservation Params9181</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_PARAMS9181_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Reservation Params9181</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_PARAMS9181_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Preferences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_OPTIONS__PREFERENCES = 0;

	/**
	 * The feature id for the '<em><b>Service Brands</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_OPTIONS__SERVICE_BRANDS = 1;

	/**
	 * The feature id for the '<em><b>Graphical Reservation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_OPTIONS__GRAPHICAL_RESERVATION = 2;

	/**
	 * The number of structural features of the '<em>Reservation Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_OPTIONS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Reservation Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_OPTIONS_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Preference</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_PREFERENCE_GROUP__PREFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_PREFERENCE_GROUP__GROUP = 1;

	/**
	 * The number of structural features of the '<em>Reservation Preference Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_PREFERENCE_GROUP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Reservation Preference Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_PREFERENCE_GROUP_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CLASS__ID = 0;

	/**
	 * The feature id for the '<em><b>Classic Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CLASS__CLASSIC_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Text</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CLASS__TEXT = 2;

	/**
	 * The number of structural features of the '<em>Service Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CLASS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Service Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CLASS_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL__ID = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL__TEXT = 1;

	/**
	 * The feature id for the '<em><b>Combining Service Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL__COMBINING_SERVICE_CLASSES = 2;

	/**
	 * The feature id for the '<em><b>Reservation Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL__RESERVATION_PARAMETER = 3;

	/**
	 * The feature id for the '<em><b>Includes Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL__INCLUDES_CLASS_NAME = 4;

	/**
	 * The number of structural features of the '<em>Service Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Service Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_RANGE__SCOPE = 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_RANGE__FROM = 1;

	/**
	 * The feature id for the '<em><b>Until</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_RANGE__UNTIL = 2;

	/**
	 * The number of structural features of the '<em>Time Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_RANGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Time Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_RANGE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDED_TIME_RANGE__SCOPE = TIME_RANGE__SCOPE;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDED_TIME_RANGE__FROM = TIME_RANGE__FROM;

	/**
	 * The feature id for the '<em><b>Until</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDED_TIME_RANGE__UNTIL = TIME_RANGE__UNTIL;

	/**
	 * The number of structural features of the '<em>Excluded Time Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDED_TIME_RANGE_FEATURE_COUNT = TIME_RANGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Excluded Time Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDED_TIME_RANGE_OPERATION_COUNT = TIME_RANGE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDITY_RANGE__UNIT = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDITY_RANGE__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Hours After Midnight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDITY_RANGE__HOURS_AFTER_MIDNIGHT = 2;

	/**
	 * The number of structural features of the '<em>Validity Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDITY_RANGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Validity Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDITY_RANGE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Excluded Weekdays</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_VALIDITY_CONSTRAINT__EXCLUDED_WEEKDAYS = 0;

	/**
	 * The feature id for the '<em><b>Latest Return</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_VALIDITY_CONSTRAINT__LATEST_RETURN = 1;

	/**
	 * The feature id for the '<em><b>Earliest Return</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_VALIDITY_CONSTRAINT__EARLIEST_RETURN = 2;

	/**
	 * The number of structural features of the '<em>Return Validity Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_VALIDITY_CONSTRAINT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Return Validity Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_VALIDITY_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.TripAllocationConstraintImpl <em>Trip Allocation Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.TripAllocationConstraintImpl
	 * @see Gtm.impl.GtmPackageImpl#getTripAllocationConstraint()
	 * @generated
	 */
	int TRIP_ALLOCATION_CONSTRAINT = 102;

	/**
	 * The feature id for the '<em><b>Allocation Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_ALLOCATION_CONSTRAINT__ALLOCATION_UNIT = 0;

	/**
	 * The feature id for the '<em><b>Max Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_ALLOCATION_CONSTRAINT__MAX_UNITS = 1;

	/**
	 * The feature id for the '<em><b>Duration Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_ALLOCATION_CONSTRAINT__DURATION_UNIT = 2;

	/**
	 * The feature id for the '<em><b>Required Processes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_ALLOCATION_CONSTRAINT__REQUIRED_PROCESSES = 3;

	/**
	 * The number of structural features of the '<em>Trip Allocation Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_ALLOCATION_CONSTRAINT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Trip Allocation Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_ALLOCATION_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.TripInterruptionConstraintImpl <em>Trip Interruption Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.TripInterruptionConstraintImpl
	 * @see Gtm.impl.GtmPackageImpl#getTripInterruptionConstraint()
	 * @generated
	 */
	int TRIP_INTERRUPTION_CONSTRAINT = 103;

	/**
	 * The feature id for the '<em><b>Max Interruptions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_INTERRUPTION_CONSTRAINT__MAX_INTERRUPTIONS = 0;

	/**
	 * The feature id for the '<em><b>Max Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_INTERRUPTION_CONSTRAINT__MAX_DURATION = 1;

	/**
	 * The feature id for the '<em><b>Total Max Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_INTERRUPTION_CONSTRAINT__TOTAL_MAX_DURATION = 2;

	/**
	 * The feature id for the '<em><b>Required Processes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_INTERRUPTION_CONSTRAINT__REQUIRED_PROCESSES = 3;

	/**
	 * The number of structural features of the '<em>Trip Interruption Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_INTERRUPTION_CONSTRAINT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Trip Interruption Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_INTERRUPTION_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Station</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIA_STATION__STATION = 0;

	/**
	 * The feature id for the '<em><b>Carrier Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIA_STATION__CARRIER_CONSTRAINT = 1;

	/**
	 * The feature id for the '<em><b>Carrier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIA_STATION__CARRIER = 2;

	/**
	 * The feature id for the '<em><b>Route</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIA_STATION__ROUTE = 3;

	/**
	 * The feature id for the '<em><b>Alternative Routes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIA_STATION__ALTERNATIVE_ROUTES = 4;

	/**
	 * The feature id for the '<em><b>Data Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIA_STATION__DATA_DESCRIPTION = 5;

	/**
	 * The feature id for the '<em><b>Fare Station Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIA_STATION__FARE_STATION_SET = 6;

	/**
	 * The feature id for the '<em><b>Service Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIA_STATION__SERVICE_CONSTRAINT = 7;

	/**
	 * The feature id for the '<em><b>Technical Via Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIA_STATION__TECHNICAL_VIA_ONLY = 8;

	/**
	 * The feature id for the '<em><b>Real Stop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIA_STATION__REAL_STOP = 9;

	/**
	 * The number of structural features of the '<em>Via Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIA_STATION_FEATURE_COUNT = 10;

	/**
	 * The operation id for the '<em>Get Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIA_STATION___GET_DESCRIPTION = 0;

	/**
	 * The number of operations of the '<em>Via Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIA_STATION_OPERATION_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Stations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_ROUTE__STATIONS = 0;

	/**
	 * The number of structural features of the '<em>Alternative Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_ROUTE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Alternative Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_ROUTE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Stations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__STATIONS = 0;

	/**
	 * The number of structural features of the '<em>Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Binary Zone Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__BINARY_ZONE_ID = 0;

	/**
	 * The feature id for the '<em><b>Zone Id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__ZONE_ID = 1;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__CITY = 2;

	/**
	 * The feature id for the '<em><b>Carrier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__CARRIER = 3;

	/**
	 * The feature id for the '<em><b>Entry Station</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__ENTRY_STATION = 4;

	/**
	 * The feature id for the '<em><b>Terminal Station</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__TERMINAL_STATION = 5;

	/**
	 * The feature id for the '<em><b>Nuts Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__NUTS_CODE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__NAME = 7;

	/**
	 * The number of structural features of the '<em>Zone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Zone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Binary Zone Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__BINARY_ZONE_ID = 0;

	/**
	 * The feature id for the '<em><b>Line Id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__LINE_ID = 1;

	/**
	 * The feature id for the '<em><b>Carrier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__CARRIER = 2;

	/**
	 * The feature id for the '<em><b>Entry Station</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__ENTRY_STATION = 3;

	/**
	 * The feature id for the '<em><b>Terminal Station</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__TERMINAL_STATION = 4;

	/**
	 * The feature id for the '<em><b>Nuts Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__NUTS_CODE = 5;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__CITY = 6;

	/**
	 * The number of structural features of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Edge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGONE__EDGE = 0;

	/**
	 * The number of structural features of the '<em>Polygone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGONE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Polygone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGONE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Accuracy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__ACCURACY = 1;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__LONGITUDE = 2;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__LATITUDE = 3;

	/**
	 * The number of structural features of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Zone Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_DEFINITIONS__ZONE_DEFINITION = 0;

	/**
	 * The number of structural features of the '<em>Zone Definitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_DEFINITIONS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Zone Definitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_DEFINITIONS_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_DEFINITION__PROVIDER = 0;

	/**
	 * The feature id for the '<em><b>Zone Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_DEFINITION__ZONE_ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_DEFINITION__NAME = 2;

	/**
	 * The feature id for the '<em><b>Polygone</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_DEFINITION__POLYGONE = 3;

	/**
	 * The feature id for the '<em><b>Name Utf8</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_DEFINITION__NAME_UTF8 = 4;

	/**
	 * The feature id for the '<em><b>Station Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_DEFINITION__STATION_SET = 5;

	/**
	 * The feature id for the '<em><b>Nuts Codes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_DEFINITION__NUTS_CODES = 6;

	/**
	 * The number of structural features of the '<em>Zone Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_DEFINITION_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Zone Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.CrossBorderConditionImpl <em>Cross Border Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.CrossBorderConditionImpl
	 * @see Gtm.impl.GtmPackageImpl#getCrossBorderCondition()
	 * @generated
	 */
	int CROSS_BORDER_CONDITION = 113;

	/**
	 * The feature id for the '<em><b>From Country</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_BORDER_CONDITION__FROM_COUNTRY = 0;

	/**
	 * The feature id for the '<em><b>To Country</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_BORDER_CONDITION__TO_COUNTRY = 1;

	/**
	 * The feature id for the '<em><b>Affected Service Brands</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_BORDER_CONDITION__AFFECTED_SERVICE_BRANDS = 2;

	/**
	 * The number of structural features of the '<em>Cross Border Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_BORDER_CONDITION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Cross Border Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_BORDER_CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.FareCombinationModelImpl <em>Fare Combination Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.FareCombinationModelImpl
	 * @see Gtm.impl.GtmPackageImpl#getFareCombinationModel()
	 * @generated
	 */
	int FARE_COMBINATION_MODEL = 114;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_COMBINATION_MODEL__MODEL = 0;

	/**
	 * The feature id for the '<em><b>Combinable Carriers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_COMBINATION_MODEL__COMBINABLE_CARRIERS = 1;

	/**
	 * The feature id for the '<em><b>Only When Combined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_COMBINATION_MODEL__ONLY_WHEN_COMBINED = 2;

	/**
	 * The feature id for the '<em><b>Allowed Allocators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_COMBINATION_MODEL__ALLOWED_ALLOCATORS = 3;

	/**
	 * The feature id for the '<em><b>Reference Cluster</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_COMBINATION_MODEL__REFERENCE_CLUSTER = 4;

	/**
	 * The feature id for the '<em><b>Allowed Clusters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_COMBINATION_MODEL__ALLOWED_CLUSTERS = 5;

	/**
	 * The feature id for the '<em><b>Allowed Common Contracts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_COMBINATION_MODEL__ALLOWED_COMMON_CONTRACTS = 6;

	/**
	 * The number of structural features of the '<em>Fare Combination Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_COMBINATION_MODEL_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Fare Combination Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_COMBINATION_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.ProductsImpl <em>Products</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.ProductsImpl
	 * @see Gtm.impl.GtmPackageImpl#getProducts()
	 * @generated
	 */
	int PRODUCTS = 115;

	/**
	 * The feature id for the '<em><b>Products</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTS__PRODUCTS = 0;

	/**
	 * The number of structural features of the '<em>Products</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Products</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.ProductImpl
	 * @see Gtm.impl.GtmPackageImpl#getProduct()
	 * @generated
	 */
	int PRODUCT = 116;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__DATA_SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__ID = 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__CODE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__NAME = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__TYPE = 4;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__SUMMARY = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__DESCRIPTION = 6;

	/**
	 * The feature id for the '<em><b>Travel Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__TRAVEL_CLASS = 7;

	/**
	 * The feature id for the '<em><b>Service Constraint Text</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__SERVICE_CONSTRAINT_TEXT = 8;

	/**
	 * The feature id for the '<em><b>Carrier Constraint Text</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__CARRIER_CONSTRAINT_TEXT = 9;

	/**
	 * The feature id for the '<em><b>Condition Texts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__CONDITION_TEXTS = 10;

	/**
	 * The feature id for the '<em><b>Return Product</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__RETURN_PRODUCT = 11;

	/**
	 * The feature id for the '<em><b>Train Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__TRAIN_BOUND = 12;

	/**
	 * The feature id for the '<em><b>Refundable After Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__REFUNDABLE_AFTER_VALIDITY = 13;

	/**
	 * The feature id for the '<em><b>Refundable Before Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__REFUNDABLE_BEFORE_VALIDITY = 14;

	/**
	 * The feature id for the '<em><b>Exchangeable After Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__EXCHANGEABLE_AFTER_VALIDITY = 15;

	/**
	 * The feature id for the '<em><b>Exchangeable Before Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__EXCHANGEABLE_BEFORE_VALIDITY = 16;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__TYPE = 15;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */

	int PRODUCT_FEATURE_COUNT = 17;


	/**
	 * The number of operations of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.ConditionTextImpl <em>Condition Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.ConditionTextImpl
	 * @see Gtm.impl.GtmPackageImpl#getConditionText()
	 * @generated
	 */
	int CONDITION_TEXT = 117;

	/**
	 * The feature id for the '<em><b>Text</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_TEXT__TEXT = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_TEXT__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Condition Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_TEXT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Condition Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_TEXT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Reduction Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION_CONSTRAINTS__REDUCTION_CONSTRAINTS = 0;

	/**
	 * The number of structural features of the '<em>Reduction Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION_CONSTRAINTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Reduction Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION_CONSTRAINTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.ReductionConstraintImpl <em>Reduction Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.ReductionConstraintImpl
	 * @see Gtm.impl.GtmPackageImpl#getReductionConstraint()
	 * @generated
	 */
	int REDUCTION_CONSTRAINT = 119;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION_CONSTRAINT__ID = 0;

	/**
	 * The feature id for the '<em><b>Required Reduction Cards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION_CONSTRAINT__REQUIRED_REDUCTION_CARDS = 1;

	/**
	 * The number of structural features of the '<em>Reduction Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION_CONSTRAINT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Reduction Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Reduction Cards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION_CARDS__REDUCTION_CARDS = 0;

	/**
	 * The number of structural features of the '<em>Reduction Cards</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION_CARDS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Reduction Cards</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION_CARDS_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION_CARD__ID = 0;

	/**
	 * The feature id for the '<em><b>Short Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION_CARD__SHORT_CODE = 1;

	/**
	 * The feature id for the '<em><b>Card Issuer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION_CARD__CARD_ISSUER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION_CARD__NAME = 3;

	/**
	 * The feature id for the '<em><b>Service Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION_CARD__SERVICE_CLASSES = 4;

	/**
	 * The feature id for the '<em><b>Id Required For Booking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION_CARD__ID_REQUIRED_FOR_BOOKING = 5;

	/**
	 * The feature id for the '<em><b>Included Reduction Cards</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION_CARD__INCLUDED_REDUCTION_CARDS = 6;

	/**
	 * The feature id for the '<em><b>Uic Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION_CARD__UIC_CODE = 7;

	/**
	 * The number of structural features of the '<em>Reduction Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION_CARD_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Reduction Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCTION_CARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.RequiredReductionCardImpl <em>Required Reduction Card</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.RequiredReductionCardImpl
	 * @see Gtm.impl.GtmPackageImpl#getRequiredReductionCard()
	 * @generated
	 */
	int REQUIRED_REDUCTION_CARD = 122;

	/**
	 * The feature id for the '<em><b>Card Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_REDUCTION_CARD__CARD_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Card</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_REDUCTION_CARD__CARD = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_REDUCTION_CARD__NAME = 2;

	/**
	 * The number of structural features of the '<em>Required Reduction Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_REDUCTION_CARD_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Required Reduction Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_REDUCTION_CARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.LuggageConstraintsImpl <em>Luggage Constraints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.LuggageConstraintsImpl
	 * @see Gtm.impl.GtmPackageImpl#getLuggageConstraints()
	 * @generated
	 */
	int LUGGAGE_CONSTRAINTS = 123;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_CONSTRAINTS__CONSTRAINTS = 0;

	/**
	 * The number of structural features of the '<em>Luggage Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_CONSTRAINTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Luggage Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_CONSTRAINTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.LuggageConstraintImpl <em>Luggage Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.LuggageConstraintImpl
	 * @see Gtm.impl.GtmPackageImpl#getLuggageConstraint()
	 * @generated
	 */
	int LUGGAGE_CONSTRAINT = 124;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_CONSTRAINT__ID = 0;

	/**
	 * The feature id for the '<em><b>Max Hand Luggage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_CONSTRAINT__MAX_HAND_LUGGAGE = 1;

	/**
	 * The feature id for the '<em><b>Max Large Luggage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_CONSTRAINT__MAX_LARGE_LUGGAGE = 2;

	/**
	 * The feature id for the '<em><b>Restricted Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_CONSTRAINT__RESTRICTED_ITEMS = 3;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_CONSTRAINT__RULES = 4;

	/**
	 * The feature id for the '<em><b>Data Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_CONSTRAINT__DATA_DESCRIPTION = 5;

	/**
	 * The number of structural features of the '<em>Luggage Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_CONSTRAINT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Luggage Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.LuggageItemsRestrictionImpl <em>Luggage Items Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.LuggageItemsRestrictionImpl
	 * @see Gtm.impl.GtmPackageImpl#getLuggageItemsRestriction()
	 * @generated
	 */
	int LUGGAGE_ITEMS_RESTRICTION = 125;

	/**
	 * The feature id for the '<em><b>Number Of Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_ITEMS_RESTRICTION__NUMBER_OF_ITEMS = 0;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_ITEMS_RESTRICTION__DIMENSION = 1;

	/**
	 * The number of structural features of the '<em>Luggage Items Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_ITEMS_RESTRICTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Luggage Items Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_ITEMS_RESTRICTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.LuggageDimensionImpl <em>Luggage Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.LuggageDimensionImpl
	 * @see Gtm.impl.GtmPackageImpl#getLuggageDimension()
	 * @generated
	 */
	int LUGGAGE_DIMENSION = 126;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_DIMENSION__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_DIMENSION__DIMENSION = 1;

	/**
	 * The number of structural features of the '<em>Luggage Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_DIMENSION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Luggage Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_DIMENSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.ConversionFromLegacyImpl <em>Conversion From Legacy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.ConversionFromLegacyImpl
	 * @see Gtm.impl.GtmPackageImpl#getConversionFromLegacy()
	 * @generated
	 */
	int CONVERSION_FROM_LEGACY = 127;

	/**
	 * The feature id for the '<em><b>Legacy108</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_FROM_LEGACY__LEGACY108 = 0;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_FROM_LEGACY__PARAMS = 1;

	/**
	 * The number of structural features of the '<em>Conversion From Legacy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_FROM_LEGACY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Conversion From Legacy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_FROM_LEGACY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.ConversionParamsImpl <em>Conversion Params</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.ConversionParamsImpl
	 * @see Gtm.impl.GtmPackageImpl#getConversionParams()
	 * @generated
	 */
	int CONVERSION_PARAMS = 128;

	/**
	 * The feature id for the '<em><b>Tax Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_PARAMS__TAX_ID = 0;

	/**
	 * The feature id for the '<em><b>VA Tpercentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_PARAMS__VA_TPERCENTAGE = 1;

	/**
	 * The feature id for the '<em><b>Country</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_PARAMS__COUNTRY = 2;

	/**
	 * The feature id for the '<em><b>Legacy Border Point Mappings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_PARAMS__LEGACY_BORDER_POINT_MAPPINGS = 3;

	/**
	 * The feature id for the '<em><b>Legacy Station Mappings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_PARAMS__LEGACY_STATION_MAPPINGS = 4;

	/**
	 * The feature id for the '<em><b>Legacy Fare Templates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_PARAMS__LEGACY_FARE_TEMPLATES = 5;

	/**
	 * The feature id for the '<em><b>Legacy Fare Station Mappings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_PARAMS__LEGACY_FARE_STATION_MAPPINGS = 6;

	/**
	 * The feature id for the '<em><b>Legacy Station To Service Brand Mappings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_PARAMS__LEGACY_STATION_TO_SERVICE_BRAND_MAPPINGS = 7;

	/**
	 * The feature id for the '<em><b>Legacy Station To Fare Detail Mappings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_PARAMS__LEGACY_STATION_TO_FARE_DETAIL_MAPPINGS = 8;

	/**
	 * The feature id for the '<em><b>End Of Sale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_PARAMS__END_OF_SALE = 9;

	/**
	 * The feature id for the '<em><b>Start Of Sale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_PARAMS__START_OF_SALE = 10;

	/**
	 * The feature id for the '<em><b>Station Import Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_PARAMS__STATION_IMPORT_FILTER = 11;

	/**
	 * The feature id for the '<em><b>Convert Fare Descriptions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_PARAMS__CONVERT_FARE_DESCRIPTIONS = 12;

	/**
	 * The feature id for the '<em><b>Convert Service Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_PARAMS__CONVERT_SERVICE_CONSTRAINTS = 13;

	/**
	 * The feature id for the '<em><b>Vat Templates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_PARAMS__VAT_TEMPLATES = 14;

	/**
	 * The feature id for the '<em><b>Bus Ferry Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_PARAMS__BUS_FERRY_MAPPING = 15;

	/**
	 * The feature id for the '<em><b>Legacy Border Indication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_PARAMS__LEGACY_BORDER_INDICATION = 16;

	/**
	 * The feature id for the '<em><b>Remove Unused Legacy Stations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_PARAMS__REMOVE_UNUSED_LEGACY_STATIONS = 17;

	/**
	 * The feature id for the '<em><b>Add Carrier Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_PARAMS__ADD_CARRIER_RULES = 18;

	/**
	 * The feature id for the '<em><b>Named Carrier Lists</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_PARAMS__NAMED_CARRIER_LISTS = 19;

	/**
	 * The number of structural features of the '<em>Conversion Params</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_PARAMS_FEATURE_COUNT = 20;

	/**
	 * The number of operations of the '<em>Conversion Params</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_PARAMS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.NamedCarrierListsImpl <em>Named Carrier Lists</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.NamedCarrierListsImpl
	 * @see Gtm.impl.GtmPackageImpl#getNamedCarrierLists()
	 * @generated
	 */
	int NAMED_CARRIER_LISTS = 129;

	/**
	 * The feature id for the '<em><b>Named Carrier List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_CARRIER_LISTS__NAMED_CARRIER_LIST = 0;

	/**
	 * The number of structural features of the '<em>Named Carrier Lists</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_CARRIER_LISTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Carrier Lists</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_CARRIER_LISTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.NamedCarrierListImpl <em>Named Carrier List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.NamedCarrierListImpl
	 * @see Gtm.impl.GtmPackageImpl#getNamedCarrierList()
	 * @generated
	 */
	int NAMED_CARRIER_LIST = 130;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_CARRIER_LIST__NAME = 0;

	/**
	 * The feature id for the '<em><b>Carriers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_CARRIER_LIST__CARRIERS = 1;

	/**
	 * The feature id for the '<em><b>Replacement Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_CARRIER_LIST__REPLACEMENT_CODE = 2;

	/**
	 * The feature id for the '<em><b>Carrier Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_CARRIER_LIST__CARRIER_GROUP = 3;

	/**
	 * The number of structural features of the '<em>Named Carrier List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_CARRIER_LIST_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Named Carrier List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_CARRIER_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.AddCarrierRulesImpl <em>Add Carrier Rules</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.AddCarrierRulesImpl
	 * @see Gtm.impl.GtmPackageImpl#getAddCarrierRules()
	 * @generated
	 */
	int ADD_CARRIER_RULES = 131;

	/**
	 * The feature id for the '<em><b>Add Carrier Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_CARRIER_RULES__ADD_CARRIER_RULE = 0;

	/**
	 * The number of structural features of the '<em>Add Carrier Rules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_CARRIER_RULES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Add Carrier Rules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_CARRIER_RULES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.AddCarrierRuleImpl <em>Add Carrier Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.AddCarrierRuleImpl
	 * @see Gtm.impl.GtmPackageImpl#getAddCarrierRule()
	 * @generated
	 */
	int ADD_CARRIER_RULE = 132;

	/**
	 * The feature id for the '<em><b>Carrier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_CARRIER_RULE__CARRIER = 0;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_CARRIER_RULE__SCOPE = 1;

	/**
	 * The feature id for the '<em><b>Stations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_CARRIER_RULE__STATIONS = 2;

	/**
	 * The number of structural features of the '<em>Add Carrier Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_CARRIER_RULE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Add Carrier Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_CARRIER_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.VatTemplatesImpl <em>Vat Templates</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.VatTemplatesImpl
	 * @see Gtm.impl.GtmPackageImpl#getVatTemplates()
	 * @generated
	 */
	int VAT_TEMPLATES = 133;

	/**
	 * The feature id for the '<em><b>Vat Templates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAT_TEMPLATES__VAT_TEMPLATES = 0;

	/**
	 * The number of structural features of the '<em>Vat Templates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAT_TEMPLATES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Vat Templates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAT_TEMPLATES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.VatTemplateImpl <em>Vat Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.VatTemplateImpl
	 * @see Gtm.impl.GtmPackageImpl#getVatTemplate()
	 * @generated
	 */
	int VAT_TEMPLATE = 134;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAT_TEMPLATE__SCOPE = 0;

	/**
	 * The feature id for the '<em><b>Country</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAT_TEMPLATE__COUNTRY = 1;

	/**
	 * The feature id for the '<em><b>Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAT_TEMPLATE__PERCENTAGE = 2;

	/**
	 * The feature id for the '<em><b>Tax Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAT_TEMPLATE__TAX_ID = 3;

	/**
	 * The number of structural features of the '<em>Vat Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAT_TEMPLATE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Vat Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAT_TEMPLATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.FareTemplateImpl <em>Fare Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.FareTemplateImpl
	 * @see Gtm.impl.GtmPackageImpl#getFareTemplate()
	 * @generated
	 */
	int FARE_TEMPLATE = 136;

	/**
	 * The meta object id for the '{@link Gtm.impl.AfterSalesTemplateImpl <em>After Sales Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.AfterSalesTemplateImpl
	 * @see Gtm.impl.GtmPackageImpl#getAfterSalesTemplate()
	 * @generated
	 */
	int AFTER_SALES_TEMPLATE = 138;

	/**
	 * The meta object id for the '{@link Gtm.impl.LegacyStationToServiceConstraintMappingsImpl <em>Legacy Station To Service Constraint Mappings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.LegacyStationToServiceConstraintMappingsImpl
	 * @see Gtm.impl.GtmPackageImpl#getLegacyStationToServiceConstraintMappings()
	 * @generated
	 */

	int LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPINGS = 140;


	/**
	 * The meta object id for the '{@link Gtm.impl.LegacyBorderPointImpl <em>Legacy Border Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.LegacyBorderPointImpl
	 * @see Gtm.impl.GtmPackageImpl#getLegacyBorderPoint()
	 * @generated
	 */
	int LEGACY_BORDER_POINT = 141;

	/**
	 * The meta object id for the '{@link Gtm.impl.OnBorderStationsImpl <em>On Border Stations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.OnBorderStationsImpl
	 * @see Gtm.impl.GtmPackageImpl#getOnBorderStations()
	 * @generated
	 */
	int ON_BORDER_STATIONS = 139;

	/**
	 * The meta object id for the '{@link Gtm.impl.LegacyFakeBorderStationsImpl <em>Legacy Fake Border Stations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.LegacyFakeBorderStationsImpl
	 * @see Gtm.impl.GtmPackageImpl#getLegacyFakeBorderStations()
	 * @generated
	 */
	int LEGACY_FAKE_BORDER_STATIONS = 142;

	/**
	 * The meta object id for the '{@link Gtm.impl.LegacyBorderSideImpl <em>Legacy Border Side</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.LegacyBorderSideImpl
	 * @see Gtm.impl.GtmPackageImpl#getLegacyBorderSide()
	 * @generated
	 */

	int LEGACY_BORDER_SIDE = 143;
  
	/**
	 * The meta object id for the '{@link Gtm.impl.LegacyBorderPointsImpl <em>Legacy Border Points</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.LegacyBorderPointsImpl
	 * @see Gtm.impl.GtmPackageImpl#getLegacyBorderPoints()
	 * @generated
	 */
	int LEGACY_BORDER_POINTS = 144;

	/**
	 * The meta object id for the '{@link Gtm.impl.LegacyStationToServiceConstraintMappingImpl <em>Legacy Station To Service Constraint Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.LegacyStationToServiceConstraintMappingImpl
	 * @see Gtm.impl.GtmPackageImpl#getLegacyStationToServiceConstraintMapping()
	 * @generated
	 */
	int LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPING = 145;


	/**
	 * The meta object id for the '{@link Gtm.impl.LegacyStationMappingsImpl <em>Legacy Station Mappings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.LegacyStationMappingsImpl
	 * @see Gtm.impl.GtmPackageImpl#getLegacyStationMappings()
	 * @generated
	 */
	int LEGACY_STATION_MAPPINGS = 146;

	/**
	 * The meta object id for the '{@link Gtm.impl.LegacyStationMapImpl <em>Legacy Station Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.LegacyStationMapImpl
	 * @see Gtm.impl.GtmPackageImpl#getLegacyStationMap()
	 * @generated
	 */
	int LEGACY_STATION_MAP = 147;

	/**
	 * The meta object id for the '{@link Gtm.impl.LegacyFareDetailMapsImpl <em>Legacy Fare Detail Maps</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.LegacyFareDetailMapsImpl
	 * @see Gtm.impl.GtmPackageImpl#getLegacyFareDetailMaps()
	 * @generated
	 */
	int LEGACY_FARE_DETAIL_MAPS = 148;

	/**
	 * The meta object id for the '{@link Gtm.impl.LegacyFareDetailMapImpl <em>Legacy Fare Detail Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.LegacyFareDetailMapImpl
	 * @see Gtm.impl.GtmPackageImpl#getLegacyFareDetailMap()
	 * @generated
	 */
	int LEGACY_FARE_DETAIL_MAP = 149;

	/**
	 * The meta object id for the '{@link Gtm.impl.LegacyStationImpl <em>Legacy Station</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.LegacyStationImpl
	 * @see Gtm.impl.GtmPackageImpl#getLegacyStation()
	 * @generated
	 */
	int LEGACY_STATION = 150;

	/**
	 * The meta object id for the '{@link Gtm.impl.LegacyBoderPointMappingsImpl <em>Legacy Boder Point Mappings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.LegacyBoderPointMappingsImpl
	 * @see Gtm.impl.GtmPackageImpl#getLegacyBoderPointMappings()
	 * @generated
	 */
	int LEGACY_BODER_POINT_MAPPINGS = 151;

	/**
	 * The meta object id for the '{@link Gtm.impl.LegacyBorderPointMappingImpl <em>Legacy Border Point Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.LegacyBorderPointMappingImpl
	 * @see Gtm.impl.GtmPackageImpl#getLegacyBorderPointMapping()
	 * @generated
	 */
	int LEGACY_BORDER_POINT_MAPPING = 152;

	/**
	 * The meta object id for the '{@link Gtm.impl.LegacyFareStationSetMappingsImpl <em>Legacy Fare Station Set Mappings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.LegacyFareStationSetMappingsImpl
	 * @see Gtm.impl.GtmPackageImpl#getLegacyFareStationSetMappings()
	 * @generated
	 */
	int LEGACY_FARE_STATION_SET_MAPPINGS = 153;

	/**
	 * The meta object id for the '{@link Gtm.impl.LegacyFareStationSetMapImpl <em>Legacy Fare Station Set Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.LegacyFareStationSetMapImpl
	 * @see Gtm.impl.GtmPackageImpl#getLegacyFareStationSetMap()
	 * @generated
	 */
	int LEGACY_FARE_STATION_SET_MAP = 154;

	/**
	 * The meta object id for the '{@link Gtm.impl.Legacy108Impl <em>Legacy108</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.Legacy108Impl
	 * @see Gtm.impl.GtmPackageImpl#getLegacy108()
	 * @generated
	 */
	int LEGACY108 = 156;

	/**
	 * The meta object id for the '{@link Gtm.impl.Legacy108FareDescriptionImpl <em>Legacy108 Fare Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.Legacy108FareDescriptionImpl
	 * @see Gtm.impl.GtmPackageImpl#getLegacy108FareDescription()
	 * @generated
	 */
	int LEGACY108_FARE_DESCRIPTION = 159;

	/**
	 * The meta object id for the '{@link Gtm.impl.Legacy108FaresDescriptionsImpl <em>Legacy108 Fares Descriptions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.Legacy108FaresDescriptionsImpl
	 * @see Gtm.impl.GtmPackageImpl#getLegacy108FaresDescriptions()
	 * @generated
	 */
	int LEGACY108_FARES_DESCRIPTIONS = 160;

	/**
	 * The meta object id for the '{@link Gtm.impl.Legacy108StationsImpl <em>Legacy108 Stations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.Legacy108StationsImpl
	 * @see Gtm.impl.GtmPackageImpl#getLegacy108Stations()
	 * @generated
	 */
	int LEGACY108_STATIONS = 161;

	/**
	 * The meta object id for the '{@link Gtm.impl.Legacy108StationImpl <em>Legacy108 Station</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.Legacy108StationImpl
	 * @see Gtm.impl.GtmPackageImpl#getLegacy108Station()
	 * @generated
	 */
	int LEGACY108_STATION = 162;

	/**
	 * The meta object id for the '{@link Gtm.impl.LegacyRouteFaresImpl <em>Legacy Route Fares</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.LegacyRouteFaresImpl
	 * @see Gtm.impl.GtmPackageImpl#getLegacyRouteFares()
	 * @generated
	 */
	int LEGACY_ROUTE_FARES = 163;

	/**
	 * The meta object id for the '{@link Gtm.impl.LegacyRouteFareImpl <em>Legacy Route Fare</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.LegacyRouteFareImpl
	 * @see Gtm.impl.GtmPackageImpl#getLegacyRouteFare()
	 * @generated
	 */
	int LEGACY_ROUTE_FARE = 164;

	/**
	 * The meta object id for the '{@link Gtm.impl.LegacySeriesListImpl <em>Legacy Series List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.LegacySeriesListImpl
	 * @see Gtm.impl.GtmPackageImpl#getLegacySeriesList()
	 * @generated
	 */
	int LEGACY_SERIES_LIST = 165;

	/**
	 * The meta object id for the '{@link Gtm.impl.LegacySeriesImpl <em>Legacy Series</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.LegacySeriesImpl
	 * @see Gtm.impl.GtmPackageImpl#getLegacySeries()
	 * @generated
	 */
	int LEGACY_SERIES = 166;

	/**
	 * The meta object id for the '{@link Gtm.impl.LegacySeparateContractSeriesListImpl <em>Legacy Separate Contract Series List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.LegacySeparateContractSeriesListImpl
	 * @see Gtm.impl.GtmPackageImpl#getLegacySeparateContractSeriesList()
	 * @generated
	 */
	int LEGACY_SEPARATE_CONTRACT_SERIES_LIST = 169;

	/**
	 * The meta object id for the '{@link Gtm.impl.LegacySeparateContractSeriesImpl <em>Legacy Separate Contract Series</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.LegacySeparateContractSeriesImpl
	 * @see Gtm.impl.GtmPackageImpl#getLegacySeparateContractSeries()
	 * @generated
	 */
	int LEGACY_SEPARATE_CONTRACT_SERIES = 170;

	/**
	 * The meta object id for the '{@link Gtm.impl.LegacyDistanceFaresImpl <em>Legacy Distance Fares</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.LegacyDistanceFaresImpl
	 * @see Gtm.impl.GtmPackageImpl#getLegacyDistanceFares()
	 * @generated
	 */
	int LEGACY_DISTANCE_FARES = 171;

	/**
	 * The meta object id for the '{@link Gtm.impl.LegacyDistanceFareImpl <em>Legacy Distance Fare</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.LegacyDistanceFareImpl
	 * @see Gtm.impl.GtmPackageImpl#getLegacyDistanceFare()
	 * @generated
	 */
	int LEGACY_DISTANCE_FARE = 172;

	/**
	 * The meta object id for the '{@link Gtm.impl.LegacyViastationImpl <em>Legacy Viastation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.LegacyViastationImpl
	 * @see Gtm.impl.GtmPackageImpl#getLegacyViastation()
	 * @generated
	 */
	int LEGACY_VIASTATION = 173;

	/**
	 * The meta object id for the '{@link Gtm.impl.LegacyFareTemplatesImpl <em>Legacy Fare Templates</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.LegacyFareTemplatesImpl
	 * @see Gtm.impl.GtmPackageImpl#getLegacyFareTemplates()
	 * @generated
	 */
	int LEGACY_FARE_TEMPLATES = 135;

	/**
	 * The feature id for the '<em><b>Fare Templates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_FARE_TEMPLATES__FARE_TEMPLATES = 0;

	/**
	 * The number of structural features of the '<em>Legacy Fare Templates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_FARE_TEMPLATES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Legacy Fare Templates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_FARE_TEMPLATES_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Price Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_TEMPLATE__PRICE_FACTOR = 0;

	/**
	 * The feature id for the '<em><b>Price</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_TEMPLATE__PRICE = 1;

	/**
	 * The feature id for the '<em><b>Minimal Price</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_TEMPLATE__MINIMAL_PRICE = 2;

	/**
	 * The feature id for the '<em><b>Maximal Price</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_TEMPLATE__MAXIMAL_PRICE = 3;

	/**
	 * The feature id for the '<em><b>Rounding Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_TEMPLATE__ROUNDING_MODE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_TEMPLATE__ID = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_TEMPLATE__TYPE = 6;

	/**
	 * The feature id for the '<em><b>After Sales Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_TEMPLATE__AFTER_SALES_TEMPLATE = 7;

	/**
	 * The feature id for the '<em><b>Data Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_TEMPLATE__DATA_DESCRIPTION = 8;

	/**
	 * The feature id for the '<em><b>Text</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_TEMPLATE__TEXT = 9;

	/**
	 * The feature id for the '<em><b>Fare Constraint Bundle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_TEMPLATE__FARE_CONSTRAINT_BUNDLE = 10;

	/**
	 * The feature id for the '<em><b>Separate Contract Fare Constraint Bundle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_TEMPLATE__SEPARATE_CONTRACT_FARE_CONSTRAINT_BUNDLE = 11;

	/**
	 * The feature id for the '<em><b>Service Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_TEMPLATE__SERVICE_CONSTRAINT = 12;

	/**
	 * The feature id for the '<em><b>Carrier Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_TEMPLATE__CARRIER_CONSTRAINT = 13;

	/**
	 * The feature id for the '<em><b>Service Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_TEMPLATE__SERVICE_CLASS = 14;

	/**
	 * The feature id for the '<em><b>Service Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_TEMPLATE__SERVICE_LEVEL = 15;

	/**
	 * The feature id for the '<em><b>Sales Availability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_TEMPLATE__SALES_AVAILABILITY = 16;

	/**
	 * The feature id for the '<em><b>Travel Validity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_TEMPLATE__TRAVEL_VALIDITY = 17;

	/**
	 * The feature id for the '<em><b>Combination Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_TEMPLATE__COMBINATION_CONSTRAINT = 18;

	/**
	 * The feature id for the '<em><b>Separate Contract Combination Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_TEMPLATE__SEPARATE_CONTRACT_COMBINATION_CONSTRAINT = 19;

	/**
	 * The feature id for the '<em><b>Fare Detail Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_TEMPLATE__FARE_DETAIL_DESCRIPTION = 20;

	/**
	 * The feature id for the '<em><b>Legacy Accounting Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_TEMPLATE__LEGACY_ACCOUNTING_IDENTIFIER = 21;

	/**
	 * The feature id for the '<em><b>Personal Data Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_TEMPLATE__PERSONAL_DATA_CONSTRAINT = 22;

	/**
	 * The feature id for the '<em><b>Reservation Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_TEMPLATE__RESERVATION_PARAMETER = 23;

	/**
	 * The feature id for the '<em><b>Reduction Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_TEMPLATE__REDUCTION_CONSTRAINT = 24;

	/**
	 * The feature id for the '<em><b>Fulfillment Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_TEMPLATE__FULFILLMENT_CONSTRAINT = 25;

	/**
	 * The feature id for the '<em><b>Passenger Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_TEMPLATE__PASSENGER_CONSTRAINT = 26;

	/**
	 * The feature id for the '<em><b>Legacy Conversion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_TEMPLATE__LEGACY_CONVERSION = 27;

	/**
	 * The feature id for the '<em><b>Individual Contracts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_TEMPLATE__INDIVIDUAL_CONTRACTS = 28;

	/**
	 * The feature id for the '<em><b>Regulatory Conditions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_TEMPLATE__REGULATORY_CONDITIONS = 29;

	/**
	 * The feature id for the '<em><b>Legacy Accounting Tariff Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_TEMPLATE__LEGACY_ACCOUNTING_TARIFF_ID = 30;

	/**
	 * The feature id for the '<em><b>Series Filter</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_TEMPLATE__SERIES_FILTER = 31;

	/**
	 * The feature id for the '<em><b>Base Price Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_TEMPLATE__BASE_PRICE_CLASS = 32;

	/**
	 * The feature id for the '<em><b>Carrier Filter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_TEMPLATE__CARRIER_FILTER = 33;

	/**
	 * The feature id for the '<em><b>Luggage Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_TEMPLATE__LUGGAGE_CONSTRAINT = 34;

	/**
	 * The number of structural features of the '<em>Fare Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_TEMPLATE_FEATURE_COUNT = 35;

	/**
	 * The number of operations of the '<em>Fare Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARE_TEMPLATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.MaximalPriceImpl <em>Maximal Price</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.MaximalPriceImpl
	 * @see Gtm.impl.GtmPackageImpl#getMaximalPrice()
	 * @generated
	 */
	int MAXIMAL_PRICE = 133;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAXIMAL_PRICE__ID = PRICE__ID;

	/**
	 * The feature id for the '<em><b>Currencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAXIMAL_PRICE__CURRENCIES = PRICE__CURRENCIES;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAXIMAL_PRICE__DATA_SOURCE = PRICE__DATA_SOURCE;

	/**
	 * The number of structural features of the '<em>Maximal Price</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAXIMAL_PRICE_FEATURE_COUNT = PRICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Maximal Price</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAXIMAL_PRICE_OPERATION_COUNT = PRICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.MinimalPriceImpl <em>Minimal Price</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.MinimalPriceImpl
	 * @see Gtm.impl.GtmPackageImpl#getMinimalPrice()
	 * @generated
	 */
	int MINIMAL_PRICE = 137;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMAL_PRICE__ID = PRICE__ID;

	/**
	 * The feature id for the '<em><b>Currencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMAL_PRICE__CURRENCIES = PRICE__CURRENCIES;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMAL_PRICE__DATA_SOURCE = PRICE__DATA_SOURCE;

	/**
	 * The number of structural features of the '<em>Minimal Price</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMAL_PRICE_FEATURE_COUNT = PRICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Minimal Price</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMAL_PRICE_OPERATION_COUNT = PRICE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transaction Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_SALES_TEMPLATE__TRANSACTION_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Carrier Fee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_SALES_TEMPLATE__CARRIER_FEE = 1;

	/**
	 * The feature id for the '<em><b>Application Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_SALES_TEMPLATE__APPLICATION_TIME = 2;

	/**
	 * The feature id for the '<em><b>Fee Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_SALES_TEMPLATE__FEE_FACTOR = 3;

	/**
	 * The feature id for the '<em><b>Rounding Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_SALES_TEMPLATE__ROUNDING_MODE = 4;

	/**
	 * The number of structural features of the '<em>After Sales Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_SALES_TEMPLATE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>After Sales Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_SALES_TEMPLATE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Stations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_BORDER_STATIONS__STATIONS = 0;

	/**
	 * The number of structural features of the '<em>On Border Stations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_BORDER_STATIONS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>On Border Stations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_BORDER_STATIONS_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Legacy Station To Service Brand Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPINGS__LEGACY_STATION_TO_SERVICE_BRAND_MAPPINGS = 0;

	/**
	 * The number of structural features of the '<em>Legacy Station To Service Constraint Mappings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPINGS_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Find Service Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPINGS___FIND_SERVICE_CONSTRAINT__INT = 0;

	/**
	 * The number of operations of the '<em>Legacy Station To Service Constraint Mappings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPINGS_OPERATION_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Border Point Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_BORDER_POINT__BORDER_POINT_CODE = 0;

	/**
	 * The feature id for the '<em><b>Fake Border Stations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_BORDER_POINT__FAKE_BORDER_STATIONS = 1;

	/**
	 * The feature id for the '<em><b>On Border Stations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_BORDER_POINT__ON_BORDER_STATIONS = 2;

	/**
	 * The feature id for the '<em><b>Border Sides</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_BORDER_POINT__BORDER_SIDES = 3;

	/**
	 * The feature id for the '<em><b>Incomplete Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_BORDER_POINT__INCOMPLETE_DATA = 4;

	/**
	 * The feature id for the '<em><b>Data Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_BORDER_POINT__DATA_DESCRIPTION = 5;

	/**
	 * The number of structural features of the '<em>Legacy Border Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_BORDER_POINT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Legacy Border Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_BORDER_POINT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Stations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_FAKE_BORDER_STATIONS__STATIONS = 0;

	/**
	 * The number of structural features of the '<em>Legacy Fake Border Stations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_FAKE_BORDER_STATIONS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Legacy Fake Border Stations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_FAKE_BORDER_STATIONS_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Carrier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_BORDER_SIDE__CARRIER = 0;

	/**
	 * The feature id for the '<em><b>Stations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_BORDER_SIDE__STATIONS = 1;

	/**
	 * The feature id for the '<em><b>Legacy Station Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_BORDER_SIDE__LEGACY_STATION_CODE = 2;

	/**
	 * The number of structural features of the '<em>Legacy Border Side</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_BORDER_SIDE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Legacy Border Side</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_BORDER_SIDE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Legacy Border Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_BORDER_POINTS__LEGACY_BORDER_POINTS = 0;

	/**
	 * The number of structural features of the '<em>Legacy Border Points</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_BORDER_POINTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Legacy Border Points</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_BORDER_POINTS_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPING__CODE = 0;

	/**
	 * The feature id for the '<em><b>Service Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPING__SERVICE_CONSTRAINT = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPING__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Legacy Station To Service Constraint Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPING_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Legacy Station To Service Constraint Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPING_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Station Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_STATION_MAPPINGS__STATION_MAPPINGS = 0;

	/**
	 * The number of structural features of the '<em>Legacy Station Mappings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_STATION_MAPPINGS_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Find Mapped Station</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_STATION_MAPPINGS___FIND_MAPPED_STATION__INT = 0;

	/**
	 * The number of operations of the '<em>Legacy Station Mappings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_STATION_MAPPINGS_OPERATION_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Legacy Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_STATION_MAP__LEGACY_CODE = 0;

	/**
	 * The feature id for the '<em><b>Station</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_STATION_MAP__STATION = 1;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_STATION_MAP__DATA_SOURCE = 2;

	/**
	 * The number of structural features of the '<em>Legacy Station Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_STATION_MAP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Legacy Station Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_STATION_MAP_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Legacy Fare Detail Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_FARE_DETAIL_MAPS__LEGACY_FARE_DETAIL_MAPS = 0;

	/**
	 * The number of structural features of the '<em>Legacy Fare Detail Maps</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_FARE_DETAIL_MAPS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Legacy Fare Detail Maps</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_FARE_DETAIL_MAPS_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Legacy Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_FARE_DETAIL_MAP__LEGACY_CODE = 0;

	/**
	 * The feature id for the '<em><b>Fare Detail Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_FARE_DETAIL_MAP__FARE_DETAIL_DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Fare Detail Mapping Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_FARE_DETAIL_MAP__FARE_DETAIL_MAPPING_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Legacy Fare Detail Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_FARE_DETAIL_MAP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Legacy Fare Detail Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_FARE_DETAIL_MAP_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_STATION__CODE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_STATION__NAME = 1;

	/**
	 * The number of structural features of the '<em>Legacy Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_STATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Legacy Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_STATION_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Border Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_BODER_POINT_MAPPINGS__BORDER_POINTS = 0;

	/**
	 * The number of structural features of the '<em>Legacy Boder Point Mappings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_BODER_POINT_MAPPINGS_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Mapping By Border Point Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_BODER_POINT_MAPPINGS___GET_MAPPING_BY_BORDER_POINT_CODE__INT = 0;

	/**
	 * The number of operations of the '<em>Legacy Boder Point Mappings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_BODER_POINT_MAPPINGS_OPERATION_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_BORDER_POINT_MAPPING__CODE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_BORDER_POINT_MAPPING__NAME = 1;

	/**
	 * The feature id for the '<em><b>Station</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_BORDER_POINT_MAPPING__STATION = 2;

	/**
	 * The feature id for the '<em><b>Connection Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_BORDER_POINT_MAPPING__CONNECTION_POINT = 3;

	/**
	 * The number of structural features of the '<em>Legacy Border Point Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_BORDER_POINT_MAPPING_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Legacy Border Point Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_BORDER_POINT_MAPPING_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Legacy Fare Station Set Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_FARE_STATION_SET_MAPPINGS__LEGACY_FARE_STATION_SET_MAP = 0;

	/**
	 * The number of structural features of the '<em>Legacy Fare Station Set Mappings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_FARE_STATION_SET_MAPPINGS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Legacy Fare Station Set Mappings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_FARE_STATION_SET_MAPPINGS_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Legacy Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_FARE_STATION_SET_MAP__LEGACY_CODE = 0;

	/**
	 * The feature id for the '<em><b>Station Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_FARE_STATION_SET_MAP__STATION_SET = 1;

	/**
	 * The number of structural features of the '<em>Legacy Fare Station Set Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_FARE_STATION_SET_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Legacy Fare Station Set Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_FARE_STATION_SET_MAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.LegacyBusFerryMappingImpl <em>Legacy Bus Ferry Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.LegacyBusFerryMappingImpl
	 * @see Gtm.impl.GtmPackageImpl#getLegacyBusFerryMapping()
	 * @generated
	 */
	int LEGACY_BUS_FERRY_MAPPING = 155;

	/**
	 * The feature id for the '<em><b>Bus Service Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_BUS_FERRY_MAPPING__BUS_SERVICE_CONSTRAINT = 0;

	/**
	 * The feature id for the '<em><b>Ferry Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_BUS_FERRY_MAPPING__FERRY_CONSTRAINT = 1;

	/**
	 * The feature id for the '<em><b>Bus Ferry Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_BUS_FERRY_MAPPING__BUS_FERRY_CONSTRAINT = 2;

	/**
	 * The number of structural features of the '<em>Legacy Bus Ferry Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_BUS_FERRY_MAPPING_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Legacy Bus Ferry Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_BUS_FERRY_MAPPING_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Character Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108__CHARACTER_SET = 0;

	/**
	 * The feature id for the '<em><b>Legacy Series List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108__LEGACY_SERIES_LIST = 1;

	/**
	 * The feature id for the '<em><b>Legacy Separate Contract Series</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108__LEGACY_SEPARATE_CONTRACT_SERIES = 2;

	/**
	 * The feature id for the '<em><b>Legacy Distance Fares</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108__LEGACY_DISTANCE_FARES = 3;

	/**
	 * The feature id for the '<em><b>Legacy Route Fares</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108__LEGACY_ROUTE_FARES = 4;

	/**
	 * The feature id for the '<em><b>Legacy Stations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108__LEGACY_STATIONS = 5;

	/**
	 * The feature id for the '<em><b>Legacy Fare Descriptions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108__LEGACY_FARE_DESCRIPTIONS = 6;

	/**
	 * The feature id for the '<em><b>Time Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108__TIME_ZONE = 7;

	/**
	 * The feature id for the '<em><b>Carrier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108__CARRIER = 8;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108__START_DATE = 9;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108__END_DATE = 10;

	/**
	 * The feature id for the '<em><b>Legacy Border Points</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108__LEGACY_BORDER_POINTS = 11;

	/**
	 * The feature id for the '<em><b>Legacy Memos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108__LEGACY_MEMOS = 12;

	/**
	 * The feature id for the '<em><b>Legacy Carriers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108__LEGACY_CARRIERS = 13;

	/**
	 * The number of structural features of the '<em>Legacy108</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Legacy108</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.Legacy108MemosImpl <em>Legacy108 Memos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.Legacy108MemosImpl
	 * @see Gtm.impl.GtmPackageImpl#getLegacy108Memos()
	 * @generated
	 */
	int LEGACY108_MEMOS = 157;

	/**
	 * The feature id for the '<em><b>Legacy Memos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108_MEMOS__LEGACY_MEMOS = 0;

	/**
	 * The number of structural features of the '<em>Legacy108 Memos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108_MEMOS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Legacy108 Memos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108_MEMOS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.Legacy108MemoImpl <em>Legacy108 Memo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.Legacy108MemoImpl
	 * @see Gtm.impl.GtmPackageImpl#getLegacy108Memo()
	 * @generated
	 */
	int LEGACY108_MEMO = 158;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108_MEMO__NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Local</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108_MEMO__LOCAL = 1;

	/**
	 * The feature id for the '<em><b>English</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108_MEMO__ENGLISH = 2;

	/**
	 * The feature id for the '<em><b>French</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108_MEMO__FRENCH = 3;

	/**
	 * The feature id for the '<em><b>German</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108_MEMO__GERMAN = 4;

	/**
	 * The number of structural features of the '<em>Legacy108 Memo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108_MEMO_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Legacy108 Memo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108_MEMO_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Table Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108_FARE_DESCRIPTION__TABLE_ID = 0;

	/**
	 * The feature id for the '<em><b>Description Fr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108_FARE_DESCRIPTION__DESCRIPTION_FR = 1;

	/**
	 * The feature id for the '<em><b>Description Ge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108_FARE_DESCRIPTION__DESCRIPTION_GE = 2;

	/**
	 * The feature id for the '<em><b>Description En</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108_FARE_DESCRIPTION__DESCRIPTION_EN = 3;

	/**
	 * The feature id for the '<em><b>Description Local</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108_FARE_DESCRIPTION__DESCRIPTION_LOCAL = 4;

	/**
	 * The feature id for the '<em><b>Calculation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108_FARE_DESCRIPTION__CALCULATION_TYPE = 5;

	/**
	 * The number of structural features of the '<em>Legacy108 Fare Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108_FARE_DESCRIPTION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Legacy108 Fare Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108_FARE_DESCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Legacy Fares</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108_FARES_DESCRIPTIONS__LEGACY_FARES = 0;

	/**
	 * The number of structural features of the '<em>Legacy108 Fares Descriptions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108_FARES_DESCRIPTIONS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Legacy108 Fares Descriptions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108_FARES_DESCRIPTIONS_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Legacy Stations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108_STATIONS__LEGACY_STATIONS = 0;

	/**
	 * The number of structural features of the '<em>Legacy108 Stations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108_STATIONS_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Find Station</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108_STATIONS___FIND_STATION__INT = 0;

	/**
	 * The operation id for the '<em>Find By Border Point</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108_STATIONS___FIND_BY_BORDER_POINT__INT = 1;

	/**
	 * The number of operations of the '<em>Legacy108 Stations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108_STATIONS_OPERATION_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108_STATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Border Point Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108_STATION__BORDER_POINT_CODE = 1;

	/**
	 * The feature id for the '<em><b>Name UTF8</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108_STATION__NAME_UTF8 = 2;

	/**
	 * The feature id for the '<em><b>Station Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108_STATION__STATION_CODE = 3;

	/**
	 * The feature id for the '<em><b>Fare Reference Station Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108_STATION__FARE_REFERENCE_STATION_CODE = 4;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108_STATION__SHORT_NAME = 5;

	/**
	 * The feature id for the '<em><b>Short Name Utf8</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108_STATION__SHORT_NAME_UTF8 = 6;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108_STATION__LONGITUDE = 7;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108_STATION__LATITUDE = 8;

	/**
	 * The number of structural features of the '<em>Legacy108 Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108_STATION_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Legacy108 Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY108_STATION_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Route Fare</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_ROUTE_FARES__ROUTE_FARE = 0;

	/**
	 * The number of structural features of the '<em>Legacy Route Fares</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_ROUTE_FARES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Legacy Route Fares</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_ROUTE_FARES_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Fare Table Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_ROUTE_FARE__FARE_TABLE_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Series Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_ROUTE_FARE__SERIES_NUMBER = 1;

	/**
	 * The feature id for the '<em><b>Fare2nd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_ROUTE_FARE__FARE2ND = 2;

	/**
	 * The feature id for the '<em><b>Fare1st</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_ROUTE_FARE__FARE1ST = 3;

	/**
	 * The feature id for the '<em><b>Return Fare1st</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_ROUTE_FARE__RETURN_FARE1ST = 4;

	/**
	 * The feature id for the '<em><b>Return Fare2nd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_ROUTE_FARE__RETURN_FARE2ND = 5;

	/**
	 * The feature id for the '<em><b>Valid From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_ROUTE_FARE__VALID_FROM = 6;

	/**
	 * The feature id for the '<em><b>Valid Until</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_ROUTE_FARE__VALID_UNTIL = 7;

	/**
	 * The feature id for the '<em><b>Series</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_ROUTE_FARE__SERIES = 8;

	/**
	 * The number of structural features of the '<em>Legacy Route Fare</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_ROUTE_FARE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Legacy Route Fare</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_ROUTE_FARE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Series</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERIES_LIST__SERIES = 0;

	/**
	 * The number of structural features of the '<em>Legacy Series List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERIES_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Legacy Series List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERIES_LIST_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Supplying Carrier Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERIES__SUPPLYING_CARRIER_CODE = 0;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERIES__NUMBER = 1;

	/**
	 * The feature id for the '<em><b>Fare Table Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERIES__FARE_TABLE_NUMBER = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERIES__TYPE = 3;

	/**
	 * The feature id for the '<em><b>From Station</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERIES__FROM_STATION = 4;

	/**
	 * The feature id for the '<em><b>From Station Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERIES__FROM_STATION_NAME = 5;

	/**
	 * The feature id for the '<em><b>To Station</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERIES__TO_STATION = 6;

	/**
	 * The feature id for the '<em><b>To Station Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERIES__TO_STATION_NAME = 7;

	/**
	 * The feature id for the '<em><b>Route Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERIES__ROUTE_NUMBER = 8;

	/**
	 * The feature id for the '<em><b>Carrier Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERIES__CARRIER_CODE = 9;

	/**
	 * The feature id for the '<em><b>Route Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERIES__ROUTE_DESCRIPTION = 10;

	/**
	 * The feature id for the '<em><b>Pricetype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERIES__PRICETYPE = 11;

	/**
	 * The feature id for the '<em><b>Distance1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERIES__DISTANCE1 = 12;

	/**
	 * The feature id for the '<em><b>Distance2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERIES__DISTANCE2 = 13;

	/**
	 * The feature id for the '<em><b>Viastations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERIES__VIASTATIONS = 14;

	/**
	 * The feature id for the '<em><b>Valid From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERIES__VALID_FROM = 15;

	/**
	 * The feature id for the '<em><b>Valid Until</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERIES__VALID_UNTIL = 16;

	/**
	 * The feature id for the '<em><b>Bus Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERIES__BUS_CODE = 17;

	/**
	 * The feature id for the '<em><b>Ferry Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERIES__FERRY_CODE = 18;

	/**
	 * The feature id for the '<em><b>Memo Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERIES__MEMO_NUMBER = 19;

	/**
	 * The number of structural features of the '<em>Legacy Series</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERIES_FEATURE_COUNT = 20;

	/**
	 * The number of operations of the '<em>Legacy Series</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SERIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.LegacyCarriersImpl <em>Legacy Carriers</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.LegacyCarriersImpl
	 * @see Gtm.impl.GtmPackageImpl#getLegacyCarriers()
	 * @generated
	 */
	int LEGACY_CARRIERS = 167;

	/**
	 * The feature id for the '<em><b>Legacy Carrier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_CARRIERS__LEGACY_CARRIER = 0;

	/**
	 * The number of structural features of the '<em>Legacy Carriers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_CARRIERS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Legacy Carriers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_CARRIERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.impl.LegacyCarrierImpl <em>Legacy Carrier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.impl.LegacyCarrierImpl
	 * @see Gtm.impl.GtmPackageImpl#getLegacyCarrier()
	 * @generated
	 */
	int LEGACY_CARRIER = 168;

	/**
	 * The feature id for the '<em><b>Carrier Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_CARRIER__CARRIER_CODE = 0;

	/**
	 * The feature id for the '<em><b>Carrier Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_CARRIER__CARRIER_SHORT_NAME = 1;

	/**
	 * The feature id for the '<em><b>Carrier Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_CARRIER__CARRIER_NAME = 2;

	/**
	 * The number of structural features of the '<em>Legacy Carrier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_CARRIER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Legacy Carrier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_CARRIER_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Separate Contract Series</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SEPARATE_CONTRACT_SERIES_LIST__SEPARATE_CONTRACT_SERIES = 0;

	/**
	 * The number of structural features of the '<em>Legacy Separate Contract Series List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SEPARATE_CONTRACT_SERIES_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Legacy Separate Contract Series List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SEPARATE_CONTRACT_SERIES_LIST_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Series Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SEPARATE_CONTRACT_SERIES__SERIES_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Valid From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SEPARATE_CONTRACT_SERIES__VALID_FROM = 1;

	/**
	 * The feature id for the '<em><b>Valid Until</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SEPARATE_CONTRACT_SERIES__VALID_UNTIL = 2;

	/**
	 * The feature id for the '<em><b>Series</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SEPARATE_CONTRACT_SERIES__SERIES = 3;

	/**
	 * The number of structural features of the '<em>Legacy Separate Contract Series</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SEPARATE_CONTRACT_SERIES_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Legacy Separate Contract Series</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_SEPARATE_CONTRACT_SERIES_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Distance Fare</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_DISTANCE_FARES__DISTANCE_FARE = 0;

	/**
	 * The number of structural features of the '<em>Legacy Distance Fares</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_DISTANCE_FARES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Legacy Distance Fares</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_DISTANCE_FARES_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_DISTANCE_FARE__DISTANCE = 0;

	/**
	 * The feature id for the '<em><b>Fare2nd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_DISTANCE_FARE__FARE2ND = 1;

	/**
	 * The feature id for the '<em><b>Fare1st</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_DISTANCE_FARE__FARE1ST = 2;

	/**
	 * The feature id for the '<em><b>Fare Table Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_DISTANCE_FARE__FARE_TABLE_NUMBER = 3;

	/**
	 * The feature id for the '<em><b>Return Fare1st</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_DISTANCE_FARE__RETURN_FARE1ST = 4;

	/**
	 * The feature id for the '<em><b>Return Fare2nd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_DISTANCE_FARE__RETURN_FARE2ND = 5;

	/**
	 * The feature id for the '<em><b>Valid From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_DISTANCE_FARE__VALID_FROM = 6;

	/**
	 * The feature id for the '<em><b>Valid Until</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_DISTANCE_FARE__VALID_UNTIL = 7;

	/**
	 * The number of structural features of the '<em>Legacy Distance Fare</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_DISTANCE_FARE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Legacy Distance Fare</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_DISTANCE_FARE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_VIASTATION__POSITION = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_VIASTATION__CODE = 1;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_VIASTATION__OPTIONAL = 2;

	/**
	 * The number of structural features of the '<em>Legacy Viastation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_VIASTATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Legacy Viastation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_VIASTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gtm.BoardingOrArrival <em>Boarding Or Arrival</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.BoardingOrArrival
	 * @see Gtm.impl.GtmPackageImpl#getBoardingOrArrival()
	 * @generated
	 */
	int BOARDING_OR_ARRIVAL = 177;

	/**
	 * The meta object id for the '{@link Gtm.ConditionType <em>Condition Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.ConditionType
	 * @see Gtm.impl.GtmPackageImpl#getConditionType()
	 * @generated
	 */
	int CONDITION_TYPE = 178;

	/**
	 * The meta object id for the '{@link Gtm.LuggageRule <em>Luggage Rule</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.LuggageRule
	 * @see Gtm.impl.GtmPackageImpl#getLuggageRule()
	 * @generated
	 */
	int LUGGAGE_RULE = 175;

	/**
	 * The meta object id for the '{@link Gtm.Dimension <em>Dimension</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.Dimension
	 * @see Gtm.impl.GtmPackageImpl#getDimension()
	 * @generated
	 */
	int DIMENSION = 176;

	/**
	 * The meta object id for the '{@link Gtm.AddCarrierScope <em>Add Carrier Scope</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.AddCarrierScope
	 * @see Gtm.impl.GtmPackageImpl#getAddCarrierScope()
	 * @generated
	 */
	int ADD_CARRIER_SCOPE = 174;

	/**
	 * The meta object id for the '{@link Gtm.TransportMode <em>Transport Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.TransportMode
	 * @see Gtm.impl.GtmPackageImpl#getTransportMode()
	 * @generated
	 */
	int TRANSPORT_MODE = 179;

	/**
	 * The meta object id for the '{@link Gtm.StationRelationType <em>Station Relation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.StationRelationType
	 * @see Gtm.impl.GtmPackageImpl#getStationRelationType()
	 * @generated
	 */
	int STATION_RELATION_TYPE = 216;

	/**
	 * The meta object id for the '{@link Gtm.StationFareDetailType <em>Station Fare Detail Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.StationFareDetailType
	 * @see Gtm.impl.GtmPackageImpl#getStationFareDetailType()
	 * @generated
	 */
	int STATION_FARE_DETAIL_TYPE = 217;

	/**
	 * The meta object id for the '{@link Gtm.RegulatoryCondition <em>Regulatory Condition</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.RegulatoryCondition
	 * @see Gtm.impl.GtmPackageImpl#getRegulatoryCondition()
	 * @generated
	 */
	int REGULATORY_CONDITION = 180;

	/**
	 * The meta object id for the '{@link Gtm.AfterSalesTransactionType <em>After Sales Transaction Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.AfterSalesTransactionType
	 * @see Gtm.impl.GtmPackageImpl#getAfterSalesTransactionType()
	 * @generated
	 */
	int AFTER_SALES_TRANSACTION_TYPE = 181;

	/**
	 * The meta object id for the '{@link Gtm.BarcodeTypes <em>Barcode Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.BarcodeTypes
	 * @see Gtm.impl.GtmPackageImpl#getBarcodeTypes()
	 * @generated
	 */
	int BARCODE_TYPES = 182;

	/**
	 * The meta object id for the '{@link Gtm.ClassicClassType <em>Classic Class Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.ClassicClassType
	 * @see Gtm.impl.GtmPackageImpl#getClassicClassType()
	 * @generated
	 */
	int CLASSIC_CLASS_TYPE = 184;

  /**
	 * The meta object id for the '{@link Gtm.CharacterSet <em>Character Set</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.CharacterSet
	 * @see Gtm.impl.GtmPackageImpl#getCharacterSet()
	 * @generated
	 */
	int CHARACTER_SET = 186;


	/**
	 * The meta object id for the '{@link Gtm.Clusters <em>Clusters</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.Clusters
	 * @see Gtm.impl.GtmPackageImpl#getClusters()
	 * @generated
	 */
	int CLUSTERS = 187;


	/**
	 * The meta object id for the '{@link Gtm.CombinationModel <em>Combination Model</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.CombinationModel
	 * @see Gtm.impl.GtmPackageImpl#getCombinationModel()
	 * @generated
	 */
	int COMBINATION_MODEL = 188;


	/**
	 * The meta object id for the '{@link Gtm.ControlDataExchangeTypes <em>Control Data Exchange Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.ControlDataExchangeTypes
	 * @see Gtm.impl.GtmPackageImpl#getControlDataExchangeTypes()
	 * @generated
	 */
	int CONTROL_DATA_EXCHANGE_TYPES = 189;

	/**
	 * The meta object id for the '{@link Gtm.FareType <em>Fare Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.FareType
	 * @see Gtm.impl.GtmPackageImpl#getFareType()
	 * @generated
	 */
	int FARE_TYPE = 192;

	/**
	 * The meta object id for the '{@link Gtm.FulfillmentType <em>Fulfillment Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.FulfillmentType
	 * @see Gtm.impl.GtmPackageImpl#getFulfillmentType()
	 * @generated
	 */
	int FULFILLMENT_TYPE = 193;

	/**
	 * The meta object id for the '{@link Gtm.GeoSystem <em>Geo System</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.GeoSystem
	 * @see Gtm.impl.GtmPackageImpl#getGeoSystem()
	 * @generated
	 */
	int GEO_SYSTEM = 194;

	/**
	 * The meta object id for the '{@link Gtm.GeoUnit <em>Geo Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.GeoUnit
	 * @see Gtm.impl.GtmPackageImpl#getGeoUnit()
	 * @generated
	 */
	int GEO_UNIT = 195;

	/**
	 * The meta object id for the '{@link Gtm.GraphicalReservationType <em>Graphical Reservation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.GraphicalReservationType
	 * @see Gtm.impl.GtmPackageImpl#getGraphicalReservationType()
	 * @generated
	 */
	int GRAPHICAL_RESERVATION_TYPE = 196;

	/**
	 * The meta object id for the '{@link Gtm.HemisphereEW <em>Hemisphere EW</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.HemisphereEW
	 * @see Gtm.impl.GtmPackageImpl#getHemisphereEW()
	 * @generated
	 */
	int HEMISPHERE_EW = 198;

	/**
	 * The meta object id for the '{@link Gtm.HemisphereNS <em>Hemisphere NS</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.HemisphereNS
	 * @see Gtm.impl.GtmPackageImpl#getHemisphereNS()
	 * @generated
	 */
	int HEMISPHERE_NS = 199;

	/**
	 * The meta object id for the '{@link Gtm.InterfaceType <em>Interface Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.InterfaceType
	 * @see Gtm.impl.GtmPackageImpl#getInterfaceType()
	 * @generated
	 */
	int INTERFACE_TYPE = 200;

	/**
	 * The meta object id for the '{@link Gtm.LegacyCalculationType <em>Legacy Calculation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.LegacyCalculationType
	 * @see Gtm.impl.GtmPackageImpl#getLegacyCalculationType()
	 * @generated
	 */
	int LEGACY_CALCULATION_TYPE = 201;

	/**
	 * The meta object id for the '{@link Gtm.LegacyPassengerType <em>Legacy Passenger Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.LegacyPassengerType
	 * @see Gtm.impl.GtmPackageImpl#getLegacyPassengerType()
	 * @generated
	 */
	int LEGACY_PASSENGER_TYPE = 202;

	/**
	 * The meta object id for the '{@link Gtm.LegacySeriesType <em>Legacy Series Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.LegacySeriesType
	 * @see Gtm.impl.GtmPackageImpl#getLegacySeriesType()
	 * @generated
	 */
	int LEGACY_SERIES_TYPE = 203;

	/**
	 * The meta object id for the '{@link Gtm.LegacyConversionType <em>Legacy Conversion Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.LegacyConversionType
	 * @see Gtm.impl.GtmPackageImpl#getLegacyConversionType()
	 * @generated
	 */
	int LEGACY_CONVERSION_TYPE = 204;

	/**
	 * The meta object id for the '{@link Gtm.OfferRequestType <em>Offer Request Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.OfferRequestType
	 * @see Gtm.impl.GtmPackageImpl#getOfferRequestType()
	 * @generated
	 */
	int OFFER_REQUEST_TYPE = 205;

	/**
	 * The meta object id for the '{@link Gtm.OnlineServiceType <em>Online Service Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.OnlineServiceType
	 * @see Gtm.impl.GtmPackageImpl#getOnlineServiceType()
	 * @generated
	 */
	int ONLINE_SERVICE_TYPE = 206;

	/**
	 * The meta object id for the '{@link Gtm.PersonalDataItemsType <em>Personal Data Items Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.PersonalDataItemsType
	 * @see Gtm.impl.GtmPackageImpl#getPersonalDataItemsType()
	 * @generated
	 */
	int PERSONAL_DATA_ITEMS_TYPE = 207;

	/**
	 * The meta object id for the '{@link Gtm.PersonalDataTransferType <em>Personal Data Transfer Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.PersonalDataTransferType
	 * @see Gtm.impl.GtmPackageImpl#getPersonalDataTransferType()
	 * @generated
	 */
	int PERSONAL_DATA_TRANSFER_TYPE = 208;

	/**
	 * The meta object id for the '{@link Gtm.PersonalDataChangeReason <em>Personal Data Change Reason</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.PersonalDataChangeReason
	 * @see Gtm.impl.GtmPackageImpl#getPersonalDataChangeReason()
	 * @generated
	 */
	int PERSONAL_DATA_CHANGE_REASON = 209;

	/**
	 * The meta object id for the '{@link Gtm.ProductType <em>Product Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.ProductType
	 * @see Gtm.impl.GtmPackageImpl#getProductType()
	 * @generated
	 */
	int PRODUCT_TYPE = 210;

	/**
	 * The meta object id for the '{@link Gtm.ReservationTravelClass <em>Reservation Travel Class</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.ReservationTravelClass
	 * @see Gtm.impl.GtmPackageImpl#getReservationTravelClass()
	 * @generated
	 */
	int RESERVATION_TRAVEL_CLASS = 211;

	/**
	 * The meta object id for the '{@link Gtm.ReservationServiceLevel <em>Reservation Service Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.ReservationServiceLevel
	 * @see Gtm.impl.GtmPackageImpl#getReservationServiceLevel()
	 * @generated
	 */
	int RESERVATION_SERVICE_LEVEL = 212;

	/**
	 * The meta object id for the '{@link Gtm.ReservationService <em>Reservation Service</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.ReservationService
	 * @see Gtm.impl.GtmPackageImpl#getReservationService()
	 * @generated
	 */
	int RESERVATION_SERVICE = 213;

	/**
	 * The meta object id for the '{@link Gtm.ReservationBerthType <em>Reservation Berth Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.ReservationBerthType
	 * @see Gtm.impl.GtmPackageImpl#getReservationBerthType()
	 * @generated
	 */
	int RESERVATION_BERTH_TYPE = 214;

	/**
	 * The meta object id for the '{@link Gtm.SchemaVersion <em>Schema Version</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.SchemaVersion
	 * @see Gtm.impl.GtmPackageImpl#getSchemaVersion()
	 * @generated
	 */
	int SCHEMA_VERSION = 218;

	/**
	 * The meta object id for the '{@link Gtm.TimeZone <em>Time Zone</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.TimeZone
	 * @see Gtm.impl.GtmPackageImpl#getTimeZone()
	 * @generated
	 */
	int TIME_ZONE = 220;

	/**
	 * The meta object id for the '{@link Gtm.TaxScope <em>Tax Scope</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.TaxScope
	 * @see Gtm.impl.GtmPackageImpl#getTaxScope()
	 * @generated
	 */
	int TAX_SCOPE = 221;

	/**
	 * The meta object id for the '{@link Gtm.TimeReferenceType <em>Time Reference Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.TimeReferenceType
	 * @see Gtm.impl.GtmPackageImpl#getTimeReferenceType()
	 * @generated
	 */
	int TIME_REFERENCE_TYPE = 222;

	/**
	 * The meta object id for the '{@link Gtm.TimeRangeScope <em>Time Range Scope</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.TimeRangeScope
	 * @see Gtm.impl.GtmPackageImpl#getTimeRangeScope()
	 * @generated
	 */
	int TIME_RANGE_SCOPE = 223;

	/**
	 * The meta object id for the '{@link Gtm.TimeUnit <em>Time Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.TimeUnit
	 * @see Gtm.impl.GtmPackageImpl#getTimeUnit()
	 * @generated
	 */
	int TIME_UNIT = 224;

	/**
	 * The meta object id for the '{@link Gtm.TravelerType <em>Traveler Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.TravelerType
	 * @see Gtm.impl.GtmPackageImpl#getTravelerType()
	 * @generated
	 */
	int TRAVELER_TYPE = 225;

	/**
	 * The meta object id for the '{@link Gtm.TripAllocationProcess <em>Trip Allocation Process</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.TripAllocationProcess
	 * @see Gtm.impl.GtmPackageImpl#getTripAllocationProcess()
	 * @generated
	 */
	int TRIP_ALLOCATION_PROCESS = 226;

	/**
	 * The meta object id for the '{@link Gtm.TripAllocationUnit <em>Trip Allocation Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.TripAllocationUnit
	 * @see Gtm.impl.GtmPackageImpl#getTripAllocationUnit()
	 * @generated
	 */
	int TRIP_ALLOCATION_UNIT = 227;

	/**
	 * The meta object id for the '{@link Gtm.TripInterruptionProcess <em>Trip Interruption Process</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.TripInterruptionProcess
	 * @see Gtm.impl.GtmPackageImpl#getTripInterruptionProcess()
	 * @generated
	 */
	int TRIP_INTERRUPTION_PROCESS = 228;

	/**
	 * The meta object id for the '{@link Gtm.TravelValidityType <em>Travel Validity Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.TravelValidityType
	 * @see Gtm.impl.GtmPackageImpl#getTravelValidityType()
	 * @generated
	 */
	int TRAVEL_VALIDITY_TYPE = 229;

	/**
	 * The meta object id for the '{@link Gtm.WeekDay <em>Week Day</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.WeekDay
	 * @see Gtm.impl.GtmPackageImpl#getWeekDay()
	 * @generated
	 */
	int WEEK_DAY = 230;

	/**
	 * The meta object id for the '{@link Gtm.BasePriceClassType <em>Base Price Class Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.BasePriceClassType
	 * @see Gtm.impl.GtmPackageImpl#getBasePriceClassType()
	 * @generated
	 */
	int BASE_PRICE_CLASS_TYPE = 183;

	/**
	 * The meta object id for the '<em>Date As Date</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Date
	 * @see Gtm.impl.GtmPackageImpl#getDateAsDate()
	 * @generated
	 */
	int DATE_AS_DATE = 231;

	/**
	 * The meta object id for the '<em>Date As Date Time</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Date
	 * @see Gtm.impl.GtmPackageImpl#getDateAsDateTime()
	 * @generated
	 */
	int DATE_AS_DATE_TIME = 232;

	/**
	 * The meta object id for the '{@link Gtm.DataSource <em>Data Source</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.DataSource
	 * @see Gtm.impl.GtmPackageImpl#getDataSource()
	 * @generated
	 */
	int DATA_SOURCE = 190;

	/**
	 * The meta object id for the '{@link Gtm.DataType <em>Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.DataType
	 * @see Gtm.impl.GtmPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 191;

	/**
	 * The meta object id for the '{@link Gtm.ClassId <em>Class Id</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.ClassId
	 * @see Gtm.impl.GtmPackageImpl#getClassId()
	 * @generated
	 */
	int CLASS_ID = 185;

  /**
	 * The meta object id for the '{@link Gtm.GenericReductionCards <em>Generic Reduction Cards</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.GenericReductionCards
	 * @see Gtm.impl.GtmPackageImpl#getGenericReductionCards()
	 * @generated
	 */
	int GENERIC_REDUCTION_CARDS = 197;


	/**
	 * The meta object id for the '{@link Gtm.ServiceMode <em>Service Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.ServiceMode
	 * @see Gtm.impl.GtmPackageImpl#getServiceMode()
	 * @generated
	 */
	int SERVICE_MODE = 219;


	/**
	 * The meta object id for the '{@link Gtm.RoundingType <em>Rounding Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gtm.RoundingType
	 * @see Gtm.impl.GtmPackageImpl#getRoundingType()
	 * @generated
	 */
	int ROUNDING_TYPE = 215;

	/**
	 * Returns the meta object for class '{@link Gtm.GTMTool <em>GTM Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GTM Tool</em>'.
	 * @see Gtm.GTMTool
	 * @generated
	 */
	EClass getGTMTool();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.GTMTool#getConversionFromLegacy <em>Conversion From Legacy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conversion From Legacy</em>'.
	 * @see Gtm.GTMTool#getConversionFromLegacy()
	 * @see #getGTMTool()
	 * @generated
	 */
	EReference getGTMTool_ConversionFromLegacy();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.GTMTool#getCodeLists <em>Code Lists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code Lists</em>'.
	 * @see Gtm.GTMTool#getCodeLists()
	 * @see #getGTMTool()
	 * @generated
	 */
	EReference getGTMTool_CodeLists();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.GTMTool#getGeneralTariffModel <em>General Tariff Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>General Tariff Model</em>'.
	 * @see Gtm.GTMTool#getGeneralTariffModel()
	 * @see #getGTMTool()
	 * @generated
	 */
	EReference getGTMTool_GeneralTariffModel();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.GTMTool#getWorkflowHistory <em>Workflow History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Workflow History</em>'.
	 * @see Gtm.GTMTool#getWorkflowHistory()
	 * @see #getGTMTool()
	 * @generated
	 */
	EReference getGTMTool_WorkflowHistory();

	/**
	 * Returns the meta object for class '{@link Gtm.CodeLists <em>Code Lists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Lists</em>'.
	 * @see Gtm.CodeLists
	 * @generated
	 */
	EClass getCodeLists();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.CodeLists#getCarriers <em>Carriers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Carriers</em>'.
	 * @see Gtm.CodeLists#getCarriers()
	 * @see #getCodeLists()
	 * @generated
	 */
	EReference getCodeLists_Carriers();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.CodeLists#getStations <em>Stations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stations</em>'.
	 * @see Gtm.CodeLists#getStations()
	 * @see #getCodeLists()
	 * @generated
	 */
	EReference getCodeLists_Stations();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.CodeLists#getCountries <em>Countries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Countries</em>'.
	 * @see Gtm.CodeLists#getCountries()
	 * @see #getCodeLists()
	 * @generated
	 */
	EReference getCodeLists_Countries();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.CodeLists#getLanguages <em>Languages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Languages</em>'.
	 * @see Gtm.CodeLists#getLanguages()
	 * @see #getCodeLists()
	 * @generated
	 */
	EReference getCodeLists_Languages();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.CodeLists#getCurrencies <em>Currencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Currencies</em>'.
	 * @see Gtm.CodeLists#getCurrencies()
	 * @see #getCodeLists()
	 * @generated
	 */
	EReference getCodeLists_Currencies();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.CodeLists#getServiceBrands <em>Service Brands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Brands</em>'.
	 * @see Gtm.CodeLists#getServiceBrands()
	 * @see #getCodeLists()
	 * @generated
	 */
	EReference getCodeLists_ServiceBrands();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.CodeLists#getNutsCodes <em>Nuts Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nuts Codes</em>'.
	 * @see Gtm.CodeLists#getNutsCodes()
	 * @see #getCodeLists()
	 * @generated
	 */
	EReference getCodeLists_NutsCodes();

	/**
	 * Returns the meta object for class '{@link Gtm.WorkflowHistory <em>Workflow History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow History</em>'.
	 * @see Gtm.WorkflowHistory
	 * @generated
	 */
	EClass getWorkflowHistory();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.WorkflowHistory#getWorkflowSteps <em>Workflow Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Workflow Steps</em>'.
	 * @see Gtm.WorkflowHistory#getWorkflowSteps()
	 * @see #getWorkflowHistory()
	 * @generated
	 */
	EReference getWorkflowHistory_WorkflowSteps();

	/**
	 * Returns the meta object for class '{@link Gtm.WorkflowStep <em>Workflow Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Step</em>'.
	 * @see Gtm.WorkflowStep
	 * @generated
	 */
	EClass getWorkflowStep();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.WorkflowStep#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see Gtm.WorkflowStep#getTime()
	 * @see #getWorkflowStep()
	 * @generated
	 */
	EAttribute getWorkflowStep_Time();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.WorkflowStep#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see Gtm.WorkflowStep#getDescription()
	 * @see #getWorkflowStep()
	 * @generated
	 */
	EAttribute getWorkflowStep_Description();

	/**
	 * Returns the meta object for class '{@link Gtm.NUTSCodes <em>NUTS Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NUTS Codes</em>'.
	 * @see Gtm.NUTSCodes
	 * @generated
	 */
	EClass getNUTSCodes();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.NUTSCodes#getNutsCodes <em>Nuts Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nuts Codes</em>'.
	 * @see Gtm.NUTSCodes#getNutsCodes()
	 * @see #getNUTSCodes()
	 * @generated
	 */
	EReference getNUTSCodes_NutsCodes();

	/**
	 * Returns the meta object for class '{@link Gtm.NutsCode <em>Nuts Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nuts Code</em>'.
	 * @see Gtm.NutsCode
	 * @generated
	 */
	EClass getNutsCode();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.NutsCode#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Gtm.NutsCode#getName()
	 * @see #getNutsCode()
	 * @generated
	 */
	EAttribute getNutsCode_Name();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.NutsCode#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see Gtm.NutsCode#getCode()
	 * @see #getNutsCode()
	 * @generated
	 */
	EAttribute getNutsCode_Code();

	/**
	 * Returns the meta object for class '{@link Gtm.ServiceBrands <em>Service Brands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Brands</em>'.
	 * @see Gtm.ServiceBrands
	 * @generated
	 */
	EClass getServiceBrands();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.ServiceBrands#getServiceBrands <em>Service Brands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Brands</em>'.
	 * @see Gtm.ServiceBrands#getServiceBrands()
	 * @see #getServiceBrands()
	 * @generated
	 */
	EReference getServiceBrands_ServiceBrands();

	/**
	 * Returns the meta object for the '{@link Gtm.ServiceBrands#findServiceBRand(int) <em>Find Service BRand</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Service BRand</em>' operation.
	 * @see Gtm.ServiceBrands#findServiceBRand(int)
	 * @generated
	 */
	EOperation getServiceBrands__FindServiceBRand__int();

	/**
	 * Returns the meta object for class '{@link Gtm.ServiceBrand <em>Service Brand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Brand</em>'.
	 * @see Gtm.ServiceBrand
	 * @generated
	 */
	EClass getServiceBrand();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ServiceBrand#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see Gtm.ServiceBrand#getCode()
	 * @see #getServiceBrand()
	 * @generated
	 */
	EAttribute getServiceBrand_Code();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ServiceBrand#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Gtm.ServiceBrand#getName()
	 * @see #getServiceBrand()
	 * @generated
	 */
	EAttribute getServiceBrand_Name();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ServiceBrand#getAbbreviation <em>Abbreviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abbreviation</em>'.
	 * @see Gtm.ServiceBrand#getAbbreviation()
	 * @see #getServiceBrand()
	 * @generated
	 */
	EAttribute getServiceBrand_Abbreviation();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ServiceBrand#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see Gtm.ServiceBrand#getDescription()
	 * @see #getServiceBrand()
	 * @generated
	 */
	EAttribute getServiceBrand_Description();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ServiceBrand#getTransportMode <em>Transport Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transport Mode</em>'.
	 * @see Gtm.ServiceBrand#getTransportMode()
	 * @see #getServiceBrand()
	 * @generated
	 */
	EAttribute getServiceBrand_TransportMode();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ServiceBrand#getLocalLanguageName <em>Local Language Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Language Name</em>'.
	 * @see Gtm.ServiceBrand#getLocalLanguageName()
	 * @see #getServiceBrand()
	 * @generated
	 */
	EAttribute getServiceBrand_LocalLanguageName();

	/**
	 * Returns the meta object for class '{@link Gtm.Countries <em>Countries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Countries</em>'.
	 * @see Gtm.Countries
	 * @generated
	 */
	EClass getCountries();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.Countries#getCountries <em>Countries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Countries</em>'.
	 * @see Gtm.Countries#getCountries()
	 * @see #getCountries()
	 * @generated
	 */
	EReference getCountries_Countries();

	/**
	 * Returns the meta object for the '{@link Gtm.Countries#findCountry(int) <em>Find Country</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Country</em>' operation.
	 * @see Gtm.Countries#findCountry(int)
	 * @generated
	 */
	EOperation getCountries__FindCountry__int();

	/**
	 * Returns the meta object for class '{@link Gtm.Country <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Country</em>'.
	 * @see Gtm.Country
	 * @generated
	 */
	EClass getCountry();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Country#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see Gtm.Country#getCode()
	 * @see #getCountry()
	 * @generated
	 */
	EAttribute getCountry_Code();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Country#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Gtm.Country#getName()
	 * @see #getCountry()
	 * @generated
	 */
	EAttribute getCountry_Name();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Country#getISOcode <em>IS Ocode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IS Ocode</em>'.
	 * @see Gtm.Country#getISOcode()
	 * @see #getCountry()
	 * @generated
	 */
	EAttribute getCountry_ISOcode();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Country#getDefaultCharacterSet <em>Default Character Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Character Set</em>'.
	 * @see Gtm.Country#getDefaultCharacterSet()
	 * @see #getCountry()
	 * @generated
	 */
	EAttribute getCountry_DefaultCharacterSet();

	/**
	 * Returns the meta object for class '{@link Gtm.Languages <em>Languages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Languages</em>'.
	 * @see Gtm.Languages
	 * @generated
	 */
	EClass getLanguages();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.Languages#getLanguages <em>Languages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Languages</em>'.
	 * @see Gtm.Languages#getLanguages()
	 * @see #getLanguages()
	 * @generated
	 */
	EReference getLanguages_Languages();

	/**
	 * Returns the meta object for class '{@link Gtm.Language <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Language</em>'.
	 * @see Gtm.Language
	 * @generated
	 */
	EClass getLanguage();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Language#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Gtm.Language#getName()
	 * @see #getLanguage()
	 * @generated
	 */
	EAttribute getLanguage_Name();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Language#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see Gtm.Language#getCode()
	 * @see #getLanguage()
	 * @generated
	 */
	EAttribute getLanguage_Code();

	/**
	 * Returns the meta object for class '{@link Gtm.Currencies <em>Currencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Currencies</em>'.
	 * @see Gtm.Currencies
	 * @generated
	 */
	EClass getCurrencies();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.Currencies#getCurrencies <em>Currencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Currencies</em>'.
	 * @see Gtm.Currencies#getCurrencies()
	 * @see #getCurrencies()
	 * @generated
	 */
	EReference getCurrencies_Currencies();

	/**
	 * Returns the meta object for the '{@link Gtm.Currencies#findCurrency(java.lang.String) <em>Find Currency</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Currency</em>' operation.
	 * @see Gtm.Currencies#findCurrency(java.lang.String)
	 * @generated
	 */
	EOperation getCurrencies__FindCurrency__String();

	/**
	 * Returns the meta object for class '{@link Gtm.Currency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Currency</em>'.
	 * @see Gtm.Currency
	 * @generated
	 */
	EClass getCurrency();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Currency#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Gtm.Currency#getName()
	 * @see #getCurrency()
	 * @generated
	 */
	EAttribute getCurrency_Name();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Currency#getIsoCode <em>Iso Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iso Code</em>'.
	 * @see Gtm.Currency#getIsoCode()
	 * @see #getCurrency()
	 * @generated
	 */
	EAttribute getCurrency_IsoCode();

	/**
	 * Returns the meta object for class '{@link Gtm.Stations <em>Stations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stations</em>'.
	 * @see Gtm.Stations
	 * @generated
	 */
	EClass getStations();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.Stations#getStations <em>Stations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stations</em>'.
	 * @see Gtm.Stations#getStations()
	 * @see #getStations()
	 * @generated
	 */
	EReference getStations_Stations();

	/**
	 * Returns the meta object for the '{@link Gtm.Stations#findStation(int, int) <em>Find Station</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Station</em>' operation.
	 * @see Gtm.Stations#findStation(int, int)
	 * @generated
	 */
	EOperation getStations__FindStation__int_int();

	/**
	 * Returns the meta object for the '{@link Gtm.Stations#findStation(int, java.lang.String) <em>Find Station</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Station</em>' operation.
	 * @see Gtm.Stations#findStation(int, java.lang.String)
	 * @generated
	 */
	EOperation getStations__FindStation__int_String();

	/**
	 * Returns the meta object for class '{@link Gtm.Station <em>Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Station</em>'.
	 * @see Gtm.Station
	 * @generated
	 */
	EClass getStation();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Station#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Gtm.Station#getName()
	 * @see #getStation()
	 * @generated
	 */
	EAttribute getStation_Name();

	/**
	 * Returns the meta object for the reference '{@link Gtm.Station#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Country</em>'.
	 * @see Gtm.Station#getCountry()
	 * @see #getStation()
	 * @generated
	 */
	EReference getStation_Country();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Station#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see Gtm.Station#getCode()
	 * @see #getStation()
	 * @generated
	 */
	EAttribute getStation_Code();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Station#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longitude</em>'.
	 * @see Gtm.Station#getLongitude()
	 * @see #getStation()
	 * @generated
	 */
	EAttribute getStation_Longitude();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Station#getLatitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latitude</em>'.
	 * @see Gtm.Station#getLatitude()
	 * @see #getStation()
	 * @generated
	 */
	EAttribute getStation_Latitude();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Station#getTimetableName <em>Timetable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timetable Name</em>'.
	 * @see Gtm.Station#getTimetableName()
	 * @see #getStation()
	 * @generated
	 */
	EAttribute getStation_TimetableName();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Station#isBorderStation <em>Border Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border Station</em>'.
	 * @see Gtm.Station#isBorderStation()
	 * @see #getStation()
	 * @generated
	 */
	EAttribute getStation_BorderStation();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Station#getNameCaseUTF8 <em>Name Case UTF8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Case UTF8</em>'.
	 * @see Gtm.Station#getNameCaseUTF8()
	 * @see #getStation()
	 * @generated
	 */
	EAttribute getStation_NameCaseUTF8();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Station#getNameCaseASCII <em>Name Case ASCII</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Case ASCII</em>'.
	 * @see Gtm.Station#getNameCaseASCII()
	 * @see #getStation()
	 * @generated
	 */
	EAttribute getStation_NameCaseASCII();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Station#getShortNameCaseASCII <em>Short Name Case ASCII</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Name Case ASCII</em>'.
	 * @see Gtm.Station#getShortNameCaseASCII()
	 * @see #getStation()
	 * @generated
	 */
	EAttribute getStation_ShortNameCaseASCII();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Station#getShortNameCaseUTF8 <em>Short Name Case UTF8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Name Case UTF8</em>'.
	 * @see Gtm.Station#getShortNameCaseUTF8()
	 * @see #getStation()
	 * @generated
	 */
	EAttribute getStation_ShortNameCaseUTF8();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Station#getLegacyBorderPointCode <em>Legacy Border Point Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Legacy Border Point Code</em>'.
	 * @see Gtm.Station#getLegacyBorderPointCode()
	 * @see #getStation()
	 * @generated
	 */
	EAttribute getStation_LegacyBorderPointCode();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.Station#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relations</em>'.
	 * @see Gtm.Station#getRelations()
	 * @see #getStation()
	 * @generated
	 */
	EReference getStation_Relations();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Station#getStationCode <em>Station Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Station Code</em>'.
	 * @see Gtm.Station#getStationCode()
	 * @see #getStation()
	 * @generated
	 */
	EAttribute getStation_StationCode();

	/**
	 * Returns the meta object for class '{@link Gtm.StationRelation <em>Station Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Station Relation</em>'.
	 * @see Gtm.StationRelation
	 * @generated
	 */
	EClass getStationRelation();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.StationRelation#getRelationType <em>Relation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relation Type</em>'.
	 * @see Gtm.StationRelation#getRelationType()
	 * @see #getStationRelation()
	 * @generated
	 */
	EAttribute getStationRelation_RelationType();

	/**
	 * Returns the meta object for the reference '{@link Gtm.StationRelation#getStation <em>Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Station</em>'.
	 * @see Gtm.StationRelation#getStation()
	 * @see #getStationRelation()
	 * @generated
	 */
	EReference getStationRelation_Station();

	/**
	 * Returns the meta object for class '{@link Gtm.Carrier <em>Carrier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Carrier</em>'.
	 * @see Gtm.Carrier
	 * @generated
	 */
	EClass getCarrier();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Carrier#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see Gtm.Carrier#getCode()
	 * @see #getCarrier()
	 * @generated
	 */
	EAttribute getCarrier_Code();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Carrier#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Gtm.Carrier#getName()
	 * @see #getCarrier()
	 * @generated
	 */
	EAttribute getCarrier_Name();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Carrier#getShortName <em>Short Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Name</em>'.
	 * @see Gtm.Carrier#getShortName()
	 * @see #getCarrier()
	 * @generated
	 */
	EAttribute getCarrier_ShortName();

	/**
	 * Returns the meta object for class '{@link Gtm.Carriers <em>Carriers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Carriers</em>'.
	 * @see Gtm.Carriers
	 * @generated
	 */
	EClass getCarriers();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.Carriers#getCarriers <em>Carriers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Carriers</em>'.
	 * @see Gtm.Carriers#getCarriers()
	 * @see #getCarriers()
	 * @generated
	 */
	EReference getCarriers_Carriers();

	/**
	 * Returns the meta object for the '{@link Gtm.Carriers#findCarrier(java.lang.String) <em>Find Carrier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Carrier</em>' operation.
	 * @see Gtm.Carriers#findCarrier(java.lang.String)
	 * @generated
	 */
	EOperation getCarriers__FindCarrier__String();

	/**
	 * Returns the meta object for class '{@link Gtm.StationSet <em>Station Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Station Set</em>'.
	 * @see Gtm.StationSet
	 * @generated
	 */
	EClass getStationSet();

	/**
	 * Returns the meta object for the reference list '{@link Gtm.StationSet#getStations <em>Stations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Stations</em>'.
	 * @see Gtm.StationSet#getStations()
	 * @see #getStationSet()
	 * @generated
	 */
	EReference getStationSet_Stations();

	/**
	 * Returns the meta object for class '{@link Gtm.GeneralTariffModel <em>General Tariff Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>General Tariff Model</em>'.
	 * @see Gtm.GeneralTariffModel
	 * @generated
	 */
	EClass getGeneralTariffModel();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.GeneralTariffModel#getDelivery <em>Delivery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Delivery</em>'.
	 * @see Gtm.GeneralTariffModel#getDelivery()
	 * @see #getGeneralTariffModel()
	 * @generated
	 */
	EReference getGeneralTariffModel_Delivery();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.GeneralTariffModel#getFareStructure <em>Fare Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fare Structure</em>'.
	 * @see Gtm.GeneralTariffModel#getFareStructure()
	 * @see #getGeneralTariffModel()
	 * @generated
	 */
	EReference getGeneralTariffModel_FareStructure();

	/**
	 * Returns the meta object for class '{@link Gtm.Delivery <em>Delivery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delivery</em>'.
	 * @see Gtm.Delivery
	 * @generated
	 */
	EClass getDelivery();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Delivery#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Gtm.Delivery#getId()
	 * @see #getDelivery()
	 * @generated
	 */
	EAttribute getDelivery_Id();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Delivery#getPreviousDeliveryId <em>Previous Delivery Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Previous Delivery Id</em>'.
	 * @see Gtm.Delivery#getPreviousDeliveryId()
	 * @see #getDelivery()
	 * @generated
	 */
	EAttribute getDelivery_PreviousDeliveryId();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Delivery#getReplacedDeliveryId <em>Replaced Delivery Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replaced Delivery Id</em>'.
	 * @see Gtm.Delivery#getReplacedDeliveryId()
	 * @see #getDelivery()
	 * @generated
	 */
	EAttribute getDelivery_ReplacedDeliveryId();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Delivery#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see Gtm.Delivery#isOptional()
	 * @see #getDelivery()
	 * @generated
	 */
	EAttribute getDelivery_Optional();

	/**
	 * Returns the meta object for the reference '{@link Gtm.Delivery#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provider</em>'.
	 * @see Gtm.Delivery#getProvider()
	 * @see #getDelivery()
	 * @generated
	 */
	EReference getDelivery_Provider();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Delivery#getSchemaVersion <em>Schema Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Version</em>'.
	 * @see Gtm.Delivery#getSchemaVersion()
	 * @see #getDelivery()
	 * @generated
	 */
	EAttribute getDelivery_SchemaVersion();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Delivery#getAcceptedSchemaVersion <em>Accepted Schema Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accepted Schema Version</em>'.
	 * @see Gtm.Delivery#getAcceptedSchemaVersion()
	 * @see #getDelivery()
	 * @generated
	 */
	EAttribute getDelivery_AcceptedSchemaVersion();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Delivery#getUsage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage</em>'.
	 * @see Gtm.Delivery#getUsage()
	 * @see #getDelivery()
	 * @generated
	 */
	EAttribute getDelivery_Usage();

	/**
	 * Returns the meta object for class '{@link Gtm.AfterSalesRules <em>After Sales Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>After Sales Rules</em>'.
	 * @see Gtm.AfterSalesRules
	 * @generated
	 */
	EClass getAfterSalesRules();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.AfterSalesRules#getAfterSalesRules <em>After Sales Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>After Sales Rules</em>'.
	 * @see Gtm.AfterSalesRules#getAfterSalesRules()
	 * @see #getAfterSalesRules()
	 * @generated
	 */
	EReference getAfterSalesRules_AfterSalesRules();

	/**
	 * Returns the meta object for class '{@link Gtm.AfterSalesRule <em>After Sales Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>After Sales Rule</em>'.
	 * @see Gtm.AfterSalesRule
	 * @generated
	 */
	EClass getAfterSalesRule();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.AfterSalesRule#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Gtm.AfterSalesRule#getId()
	 * @see #getAfterSalesRule()
	 * @generated
	 */
	EAttribute getAfterSalesRule_Id();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.AfterSalesRule#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Source</em>'.
	 * @see Gtm.AfterSalesRule#getDataSource()
	 * @see #getAfterSalesRule()
	 * @generated
	 */
	EAttribute getAfterSalesRule_DataSource();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.AfterSalesRule#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see Gtm.AfterSalesRule#getConditions()
	 * @see #getAfterSalesRule()
	 * @generated
	 */
	EReference getAfterSalesRule_Conditions();

	/**
	 * Returns the meta object for class '{@link Gtm.AfterSalesCondition <em>After Sales Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>After Sales Condition</em>'.
	 * @see Gtm.AfterSalesCondition
	 * @generated
	 */
	EClass getAfterSalesCondition();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.AfterSalesCondition#getTransactionType <em>Transaction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction Type</em>'.
	 * @see Gtm.AfterSalesCondition#getTransactionType()
	 * @see #getAfterSalesCondition()
	 * @generated
	 */
	EAttribute getAfterSalesCondition_TransactionType();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.AfterSalesCondition#isIndividualContracts <em>Individual Contracts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Individual Contracts</em>'.
	 * @see Gtm.AfterSalesCondition#isIndividualContracts()
	 * @see #getAfterSalesCondition()
	 * @generated
	 */
	EAttribute getAfterSalesCondition_IndividualContracts();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.AfterSalesCondition#isCarrierFee <em>Carrier Fee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Carrier Fee</em>'.
	 * @see Gtm.AfterSalesCondition#isCarrierFee()
	 * @see #getAfterSalesCondition()
	 * @generated
	 */
	EAttribute getAfterSalesCondition_CarrierFee();

	/**
	 * Returns the meta object for the reference '{@link Gtm.AfterSalesCondition#getFee <em>Fee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fee</em>'.
	 * @see Gtm.AfterSalesCondition#getFee()
	 * @see #getAfterSalesCondition()
	 * @generated
	 */
	EReference getAfterSalesCondition_Fee();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.AfterSalesCondition#getApplicationTime <em>Application Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Application Time</em>'.
	 * @see Gtm.AfterSalesCondition#getApplicationTime()
	 * @see #getAfterSalesCondition()
	 * @generated
	 */
	EReference getAfterSalesCondition_ApplicationTime();

	/**
	 * Returns the meta object for class '{@link Gtm.ApplicationTime <em>Application Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Time</em>'.
	 * @see Gtm.ApplicationTime
	 * @generated
	 */
	EClass getApplicationTime();

	/**
	 * Returns the meta object for class '{@link Gtm.FareStructure <em>Fare Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fare Structure</em>'.
	 * @see Gtm.FareStructure
	 * @generated
	 */
	EClass getFareStructure();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.FareStructure#getServiceClassDefinitions <em>Service Class Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Class Definitions</em>'.
	 * @see Gtm.FareStructure#getServiceClassDefinitions()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_ServiceClassDefinitions();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.FareStructure#getServiceLevelDefinitions <em>Service Level Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Level Definitions</em>'.
	 * @see Gtm.FareStructure#getServiceLevelDefinitions()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_ServiceLevelDefinitions();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.FareStructure#getStationNames <em>Station Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Station Names</em>'.
	 * @see Gtm.FareStructure#getStationNames()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_StationNames();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.FareStructure#getFareStationSetDefinitions <em>Fare Station Set Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fare Station Set Definitions</em>'.
	 * @see Gtm.FareStructure#getFareStationSetDefinitions()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_FareStationSetDefinitions();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.FareStructure#getCalendars <em>Calendars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Calendars</em>'.
	 * @see Gtm.FareStructure#getCalendars()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_Calendars();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.FareStructure#getTexts <em>Texts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Texts</em>'.
	 * @see Gtm.FareStructure#getTexts()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_Texts();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.FareStructure#getReductionCards <em>Reduction Cards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reduction Cards</em>'.
	 * @see Gtm.FareStructure#getReductionCards()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_ReductionCards();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.FareStructure#getFareConstraintBundles <em>Fare Constraint Bundles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fare Constraint Bundles</em>'.
	 * @see Gtm.FareStructure#getFareConstraintBundles()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_FareConstraintBundles();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.FareStructure#getFareElements <em>Fare Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fare Elements</em>'.
	 * @see Gtm.FareStructure#getFareElements()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_FareElements();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.FareStructure#getCombinationConstraints <em>Combination Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Combination Constraints</em>'.
	 * @see Gtm.FareStructure#getCombinationConstraints()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_CombinationConstraints();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.FareStructure#getSalesAvailabilityConstraints <em>Sales Availability Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sales Availability Constraints</em>'.
	 * @see Gtm.FareStructure#getSalesAvailabilityConstraints()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_SalesAvailabilityConstraints();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.FareStructure#getTravelValidityConstraints <em>Travel Validity Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Travel Validity Constraints</em>'.
	 * @see Gtm.FareStructure#getTravelValidityConstraints()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_TravelValidityConstraints();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.FareStructure#getRegionalConstraints <em>Regional Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Regional Constraints</em>'.
	 * @see Gtm.FareStructure#getRegionalConstraints()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_RegionalConstraints();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.FareStructure#getConnectionPoints <em>Connection Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connection Points</em>'.
	 * @see Gtm.FareStructure#getConnectionPoints()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_ConnectionPoints();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.FareStructure#getCarrierConstraints <em>Carrier Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Carrier Constraints</em>'.
	 * @see Gtm.FareStructure#getCarrierConstraints()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_CarrierConstraints();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.FareStructure#getServiceConstraints <em>Service Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Constraints</em>'.
	 * @see Gtm.FareStructure#getServiceConstraints()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_ServiceConstraints();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.FareStructure#getPassengerConstraints <em>Passenger Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Passenger Constraints</em>'.
	 * @see Gtm.FareStructure#getPassengerConstraints()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_PassengerConstraints();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.FareStructure#getTotalPassengerCombinationConstraints <em>Total Passenger Combination Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Total Passenger Combination Constraints</em>'.
	 * @see Gtm.FareStructure#getTotalPassengerCombinationConstraints()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_TotalPassengerCombinationConstraints();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.FareStructure#getReductionConstraints <em>Reduction Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reduction Constraints</em>'.
	 * @see Gtm.FareStructure#getReductionConstraints()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_ReductionConstraints();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.FareStructure#getPersonalDataConstraints <em>Personal Data Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Personal Data Constraints</em>'.
	 * @see Gtm.FareStructure#getPersonalDataConstraints()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_PersonalDataConstraints();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.FareStructure#getAfterSalesRules <em>After Sales Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>After Sales Rules</em>'.
	 * @see Gtm.FareStructure#getAfterSalesRules()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_AfterSalesRules();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.FareStructure#getPrices <em>Prices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Prices</em>'.
	 * @see Gtm.FareStructure#getPrices()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_Prices();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.FareStructure#getFulfillmentConstraints <em>Fulfillment Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fulfillment Constraints</em>'.
	 * @see Gtm.FareStructure#getFulfillmentConstraints()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_FulfillmentConstraints();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.FareStructure#getReservationParameters <em>Reservation Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reservation Parameters</em>'.
	 * @see Gtm.FareStructure#getReservationParameters()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_ReservationParameters();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.FareStructure#getSupportedOnlineServices <em>Supported Online Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Supported Online Services</em>'.
	 * @see Gtm.FareStructure#getSupportedOnlineServices()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_SupportedOnlineServices();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.FareStructure#getFareResourceLocations <em>Fare Resource Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fare Resource Locations</em>'.
	 * @see Gtm.FareStructure#getFareResourceLocations()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_FareResourceLocations();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.FareStructure#getZoneDefinitions <em>Zone Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Zone Definitions</em>'.
	 * @see Gtm.FareStructure#getZoneDefinitions()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_ZoneDefinitions();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.FareStructure#getLuggageConstraints <em>Luggage Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Luggage Constraints</em>'.
	 * @see Gtm.FareStructure#getLuggageConstraints()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_LuggageConstraints();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.FareStructure#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Products</em>'.
	 * @see Gtm.FareStructure#getProducts()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_Products();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.FareStructure#getCarrierGroups <em>Carrier Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Carrier Groups</em>'.
	 * @see Gtm.FareStructure#getCarrierGroups()
	 * @see #getFareStructure()
	 * @generated
	 */
	EReference getFareStructure_CarrierGroups();

	/**
	 * Returns the meta object for class '{@link Gtm.ConnectionPoints <em>Connection Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Points</em>'.
	 * @see Gtm.ConnectionPoints
	 * @generated
	 */
	EClass getConnectionPoints();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.ConnectionPoints#getConnectionPoints <em>Connection Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connection Points</em>'.
	 * @see Gtm.ConnectionPoints#getConnectionPoints()
	 * @see #getConnectionPoints()
	 * @generated
	 */
	EReference getConnectionPoints_ConnectionPoints();

	/**
	 * Returns the meta object for the '{@link Gtm.ConnectionPoints#findSimpleConnectionPoint(Gtm.Station) <em>Find Simple Connection Point</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Simple Connection Point</em>' operation.
	 * @see Gtm.ConnectionPoints#findSimpleConnectionPoint(Gtm.Station)
	 * @generated
	 */
	EOperation getConnectionPoints__FindSimpleConnectionPoint__Station();

	/**
	 * Returns the meta object for class '{@link Gtm.ConnectionPoint <em>Connection Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Point</em>'.
	 * @see Gtm.ConnectionPoint
	 * @generated
	 */
	EClass getConnectionPoint();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ConnectionPoint#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Gtm.ConnectionPoint#getId()
	 * @see #getConnectionPoint()
	 * @generated
	 */
	EAttribute getConnectionPoint_Id();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ConnectionPoint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Gtm.ConnectionPoint#getName()
	 * @see #getConnectionPoint()
	 * @generated
	 */
	EAttribute getConnectionPoint_Name();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ConnectionPoint#getLegacyBorderPointCode <em>Legacy Border Point Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Legacy Border Point Code</em>'.
	 * @see Gtm.ConnectionPoint#getLegacyBorderPointCode()
	 * @see #getConnectionPoint()
	 * @generated
	 */
	EAttribute getConnectionPoint_LegacyBorderPointCode();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ConnectionPoint#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see Gtm.ConnectionPoint#getDescription()
	 * @see #getConnectionPoint()
	 * @generated
	 */
	EAttribute getConnectionPoint_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.ConnectionPoint#getConnectedStationSets <em>Connected Station Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connected Station Sets</em>'.
	 * @see Gtm.ConnectionPoint#getConnectedStationSets()
	 * @see #getConnectionPoint()
	 * @generated
	 */
	EReference getConnectionPoint_ConnectedStationSets();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ConnectionPoint#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Source</em>'.
	 * @see Gtm.ConnectionPoint#getDataSource()
	 * @see #getConnectionPoint()
	 * @generated
	 */
	EAttribute getConnectionPoint_DataSource();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ConnectionPoint#getNameUtf8 <em>Name Utf8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Utf8</em>'.
	 * @see Gtm.ConnectionPoint#getNameUtf8()
	 * @see #getConnectionPoint()
	 * @generated
	 */
	EAttribute getConnectionPoint_NameUtf8();

	/**
	 * Returns the meta object for class '{@link Gtm.FareResourceLocations <em>Fare Resource Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fare Resource Locations</em>'.
	 * @see Gtm.FareResourceLocations
	 * @generated
	 */
	EClass getFareResourceLocations();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.FareResourceLocations#getTrainResourceLocations <em>Train Resource Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Train Resource Locations</em>'.
	 * @see Gtm.FareResourceLocations#getTrainResourceLocations()
	 * @see #getFareResourceLocations()
	 * @generated
	 */
	EReference getFareResourceLocations_TrainResourceLocations();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.FareResourceLocations#getStationResourceLocations <em>Station Resource Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Station Resource Locations</em>'.
	 * @see Gtm.FareResourceLocations#getStationResourceLocations()
	 * @see #getFareResourceLocations()
	 * @generated
	 */
	EReference getFareResourceLocations_StationResourceLocations();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.FareResourceLocations#getCarrierResourceLocations <em>Carrier Resource Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Carrier Resource Locations</em>'.
	 * @see Gtm.FareResourceLocations#getCarrierResourceLocations()
	 * @see #getFareResourceLocations()
	 * @generated
	 */
	EReference getFareResourceLocations_CarrierResourceLocations();

	/**
	 * Returns the meta object for class '{@link Gtm.TrainResourceLocations <em>Train Resource Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Train Resource Locations</em>'.
	 * @see Gtm.TrainResourceLocations
	 * @generated
	 */
	EClass getTrainResourceLocations();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.TrainResourceLocations#getTrainResourceLocations <em>Train Resource Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Train Resource Locations</em>'.
	 * @see Gtm.TrainResourceLocations#getTrainResourceLocations()
	 * @see #getTrainResourceLocations()
	 * @generated
	 */
	EReference getTrainResourceLocations_TrainResourceLocations();

	/**
	 * Returns the meta object for class '{@link Gtm.StationResourceLocations <em>Station Resource Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Station Resource Locations</em>'.
	 * @see Gtm.StationResourceLocations
	 * @generated
	 */
	EClass getStationResourceLocations();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.StationResourceLocations#getStationResourceLocations <em>Station Resource Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Station Resource Locations</em>'.
	 * @see Gtm.StationResourceLocations#getStationResourceLocations()
	 * @see #getStationResourceLocations()
	 * @generated
	 */
	EReference getStationResourceLocations_StationResourceLocations();

	/**
	 * Returns the meta object for class '{@link Gtm.CarrierResourceLocations <em>Carrier Resource Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Carrier Resource Locations</em>'.
	 * @see Gtm.CarrierResourceLocations
	 * @generated
	 */
	EClass getCarrierResourceLocations();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.CarrierResourceLocations#getCarrierResourceLocations <em>Carrier Resource Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Carrier Resource Locations</em>'.
	 * @see Gtm.CarrierResourceLocations#getCarrierResourceLocations()
	 * @see #getCarrierResourceLocations()
	 * @generated
	 */
	EReference getCarrierResourceLocations_CarrierResourceLocations();

	/**
	 * Returns the meta object for class '{@link Gtm.TrainResourceLocation <em>Train Resource Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Train Resource Location</em>'.
	 * @see Gtm.TrainResourceLocation
	 * @generated
	 */
	EClass getTrainResourceLocation();

	/**
	 * Returns the meta object for the reference '{@link Gtm.TrainResourceLocation#getCarrier <em>Carrier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Carrier</em>'.
	 * @see Gtm.TrainResourceLocation#getCarrier()
	 * @see #getTrainResourceLocation()
	 * @generated
	 */
	EReference getTrainResourceLocation_Carrier();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.TrainResourceLocation#getOnlineResources <em>Online Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Online Resources</em>'.
	 * @see Gtm.TrainResourceLocation#getOnlineResources()
	 * @see #getTrainResourceLocation()
	 * @generated
	 */
	EReference getTrainResourceLocation_OnlineResources();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.TrainResourceLocation#getTrainId <em>Train Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Train Id</em>'.
	 * @see Gtm.TrainResourceLocation#getTrainId()
	 * @see #getTrainResourceLocation()
	 * @generated
	 */
	EAttribute getTrainResourceLocation_TrainId();

	/**
	 * Returns the meta object for class '{@link Gtm.StationResourceLocation <em>Station Resource Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Station Resource Location</em>'.
	 * @see Gtm.StationResourceLocation
	 * @generated
	 */
	EClass getStationResourceLocation();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.StationResourceLocation#getOnlineResources <em>Online Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Online Resources</em>'.
	 * @see Gtm.StationResourceLocation#getOnlineResources()
	 * @see #getStationResourceLocation()
	 * @generated
	 */
	EReference getStationResourceLocation_OnlineResources();

	/**
	 * Returns the meta object for the reference list '{@link Gtm.StationResourceLocation#getStations <em>Stations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Stations</em>'.
	 * @see Gtm.StationResourceLocation#getStations()
	 * @see #getStationResourceLocation()
	 * @generated
	 */
	EReference getStationResourceLocation_Stations();

	/**
	 * Returns the meta object for the reference list '{@link Gtm.StationResourceLocation#getConnectionPoints <em>Connection Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connection Points</em>'.
	 * @see Gtm.StationResourceLocation#getConnectionPoints()
	 * @see #getStationResourceLocation()
	 * @generated
	 */
	EReference getStationResourceLocation_ConnectionPoints();

	/**
	 * Returns the meta object for class '{@link Gtm.OnlineResource <em>Online Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Online Resource</em>'.
	 * @see Gtm.OnlineResource
	 * @generated
	 */
	EClass getOnlineResource();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.OnlineResource#getOfferRequestType <em>Offer Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offer Request Type</em>'.
	 * @see Gtm.OnlineResource#getOfferRequestType()
	 * @see #getOnlineResource()
	 * @generated
	 */
	EAttribute getOnlineResource_OfferRequestType();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.OnlineResource#getInterfaceType <em>Interface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface Type</em>'.
	 * @see Gtm.OnlineResource#getInterfaceType()
	 * @see #getOnlineResource()
	 * @generated
	 */
	EAttribute getOnlineResource_InterfaceType();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.OnlineResource#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see Gtm.OnlineResource#getVersion()
	 * @see #getOnlineResource()
	 * @generated
	 */
	EAttribute getOnlineResource_Version();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.OnlineResource#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System</em>'.
	 * @see Gtm.OnlineResource#getSystem()
	 * @see #getOnlineResource()
	 * @generated
	 */
	EAttribute getOnlineResource_System();

	/**
	 * Returns the meta object for class '{@link Gtm.FulfillmentConstraints <em>Fulfillment Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fulfillment Constraints</em>'.
	 * @see Gtm.FulfillmentConstraints
	 * @generated
	 */
	EClass getFulfillmentConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.FulfillmentConstraints#getFulfillmentConstraints <em>Fulfillment Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fulfillment Constraints</em>'.
	 * @see Gtm.FulfillmentConstraints#getFulfillmentConstraints()
	 * @see #getFulfillmentConstraints()
	 * @generated
	 */
	EReference getFulfillmentConstraints_FulfillmentConstraints();

	/**
	 * Returns the meta object for class '{@link Gtm.FulfillmentConstraint <em>Fulfillment Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fulfillment Constraint</em>'.
	 * @see Gtm.FulfillmentConstraint
	 * @generated
	 */
	EClass getFulfillmentConstraint();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.FulfillmentConstraint#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Gtm.FulfillmentConstraint#getId()
	 * @see #getFulfillmentConstraint()
	 * @generated
	 */
	EAttribute getFulfillmentConstraint_Id();

	/**
	 * Returns the meta object for the attribute list '{@link Gtm.FulfillmentConstraint#getAcceptedFulfilmentTypes <em>Accepted Fulfilment Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Accepted Fulfilment Types</em>'.
	 * @see Gtm.FulfillmentConstraint#getAcceptedFulfilmentTypes()
	 * @see #getFulfillmentConstraint()
	 * @generated
	 */
	EAttribute getFulfillmentConstraint_AcceptedFulfilmentTypes();

	/**
	 * Returns the meta object for the attribute list '{@link Gtm.FulfillmentConstraint#getRequiredControlDataExchange <em>Required Control Data Exchange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Required Control Data Exchange</em>'.
	 * @see Gtm.FulfillmentConstraint#getRequiredControlDataExchange()
	 * @see #getFulfillmentConstraint()
	 * @generated
	 */
	EAttribute getFulfillmentConstraint_RequiredControlDataExchange();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.FulfillmentConstraint#isIndividualTicketingPermitted <em>Individual Ticketing Permitted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Individual Ticketing Permitted</em>'.
	 * @see Gtm.FulfillmentConstraint#isIndividualTicketingPermitted()
	 * @see #getFulfillmentConstraint()
	 * @generated
	 */
	EAttribute getFulfillmentConstraint_IndividualTicketingPermitted();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.FulfillmentConstraint#isSeparateFulFillmentRequired <em>Separate Ful Fillment Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Separate Ful Fillment Required</em>'.
	 * @see Gtm.FulfillmentConstraint#isSeparateFulFillmentRequired()
	 * @see #getFulfillmentConstraint()
	 * @generated
	 */
	EAttribute getFulfillmentConstraint_SeparateFulFillmentRequired();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.FulfillmentConstraint#getAcceptedBarcodes <em>Accepted Barcodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Accepted Barcodes</em>'.
	 * @see Gtm.FulfillmentConstraint#getAcceptedBarcodes()
	 * @see #getFulfillmentConstraint()
	 * @generated
	 */
	EReference getFulfillmentConstraint_AcceptedBarcodes();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.FulfillmentConstraint <em>Required Barcodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Required Barcodes</em>'.
	 * @see Gtm.FulfillmentConstraint
	 * @see #getFulfillmentConstraint()
	 * @generated
	 */
	EReference getFulfillmentConstraint_RequiredBarcodes();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.FulfillmentConstraint#getDataDescription <em>Data Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Description</em>'.
	 * @see Gtm.FulfillmentConstraint#getDataDescription()
	 * @see #getFulfillmentConstraint()
	 * @generated
	 */
	EAttribute getFulfillmentConstraint_DataDescription();

	/**
	 * Returns the meta object for the attribute list '{@link Gtm.FulfillmentConstraint#getAcceptedBarcodeTypes <em>Accepted Barcode Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Accepted Barcode Types</em>'.
	 * @see Gtm.FulfillmentConstraint#getAcceptedBarcodeTypes()
	 * @see #getFulfillmentConstraint()
	 * @generated
	 */
	EAttribute getFulfillmentConstraint_AcceptedBarcodeTypes();

	/**
	 * Returns the meta object for the attribute list '{@link Gtm.FulfillmentConstraint#getRequiredBarcodeTypes <em>Required Barcode Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Required Barcode Types</em>'.
	 * @see Gtm.FulfillmentConstraint#getRequiredBarcodeTypes()
	 * @see #getFulfillmentConstraint()
	 * @generated
	 */
	EAttribute getFulfillmentConstraint_RequiredBarcodeTypes();

	/**
	 * Returns the meta object for class '{@link Gtm.RequiredBarcodes <em>Required Barcodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Barcodes</em>'.
	 * @see Gtm.RequiredBarcodes
	 * @generated
	 */
	EClass getRequiredBarcodes();

	/**
	 * Returns the meta object for the attribute list '{@link Gtm.RequiredBarcodes#getRequiredBarcodes <em>Required Barcodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Required Barcodes</em>'.
	 * @see Gtm.RequiredBarcodes#getRequiredBarcodes()
	 * @see #getRequiredBarcodes()
	 * @generated
	 */
	EAttribute getRequiredBarcodes_RequiredBarcodes();

	/**
	 * Returns the meta object for class '{@link Gtm.AcceptedBarcodes <em>Accepted Barcodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accepted Barcodes</em>'.
	 * @see Gtm.AcceptedBarcodes
	 * @generated
	 */
	EClass getAcceptedBarcodes();

	/**
	 * Returns the meta object for the attribute list '{@link Gtm.AcceptedBarcodes#getAcceptedBarcodes <em>Accepted Barcodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Accepted Barcodes</em>'.
	 * @see Gtm.AcceptedBarcodes#getAcceptedBarcodes()
	 * @see #getAcceptedBarcodes()
	 * @generated
	 */
	EAttribute getAcceptedBarcodes_AcceptedBarcodes();

	/**
	 * Returns the meta object for class '{@link Gtm.SupportedOnlineServices <em>Supported Online Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supported Online Services</em>'.
	 * @see Gtm.SupportedOnlineServices
	 * @generated
	 */
	EClass getSupportedOnlineServices();

	/**
	 * Returns the meta object for the attribute list '{@link Gtm.SupportedOnlineServices#getSupportedOnlineServices <em>Supported Online Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Supported Online Services</em>'.
	 * @see Gtm.SupportedOnlineServices#getSupportedOnlineServices()
	 * @see #getSupportedOnlineServices()
	 * @generated
	 */
	EAttribute getSupportedOnlineServices_SupportedOnlineServices();

	/**
	 * Returns the meta object for class '{@link Gtm.StationNames <em>Station Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Station Names</em>'.
	 * @see Gtm.StationNames
	 * @generated
	 */
	EClass getStationNames();

	/**
	 * Returns the meta object for the reference list '{@link Gtm.StationNames#getStationName <em>Station Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Station Name</em>'.
	 * @see Gtm.StationNames#getStationName()
	 * @see #getStationNames()
	 * @generated
	 */
	EReference getStationNames_StationName();

	/**
	 * Returns the meta object for class '{@link Gtm.FareElements <em>Fare Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fare Elements</em>'.
	 * @see Gtm.FareElements
	 * @generated
	 */
	EClass getFareElements();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.FareElements#getFareElements <em>Fare Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fare Elements</em>'.
	 * @see Gtm.FareElements#getFareElements()
	 * @see #getFareElements()
	 * @generated
	 */
	EReference getFareElements_FareElements();

	/**
	 * Returns the meta object for class '{@link Gtm.FareElement <em>Fare Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fare Element</em>'.
	 * @see Gtm.FareElement
	 * @generated
	 */
	EClass getFareElement();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.FareElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Gtm.FareElement#getId()
	 * @see #getFareElement()
	 * @generated
	 */
	EAttribute getFareElement_Id();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.FareElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see Gtm.FareElement#getType()
	 * @see #getFareElement()
	 * @generated
	 */
	EAttribute getFareElement_Type();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.FareElement#getDataDescription <em>Data Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Description</em>'.
	 * @see Gtm.FareElement#getDataDescription()
	 * @see #getFareElement()
	 * @generated
	 */
	EAttribute getFareElement_DataDescription();

	/**
	 * Returns the meta object for the reference '{@link Gtm.FareElement#getFareConstraintBundle <em>Fare Constraint Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fare Constraint Bundle</em>'.
	 * @see Gtm.FareElement#getFareConstraintBundle()
	 * @see #getFareElement()
	 * @generated
	 */
	EReference getFareElement_FareConstraintBundle();

	/**
	 * Returns the meta object for the reference '{@link Gtm.FareElement#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Text</em>'.
	 * @see Gtm.FareElement#getText()
	 * @see #getFareElement()
	 * @generated
	 */
	EReference getFareElement_Text();

	/**
	 * Returns the meta object for the reference '{@link Gtm.FareElement#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Price</em>'.
	 * @see Gtm.FareElement#getPrice()
	 * @see #getFareElement()
	 * @generated
	 */
	EReference getFareElement_Price();

	/**
	 * Returns the meta object for the reference '{@link Gtm.FareElement#getRegionalConstraint <em>Regional Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Regional Constraint</em>'.
	 * @see Gtm.FareElement#getRegionalConstraint()
	 * @see #getFareElement()
	 * @generated
	 */
	EReference getFareElement_RegionalConstraint();

	/**
	 * Returns the meta object for the reference '{@link Gtm.FareElement#getServiceConstraint <em>Service Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Constraint</em>'.
	 * @see Gtm.FareElement#getServiceConstraint()
	 * @see #getFareElement()
	 * @generated
	 */
	EReference getFareElement_ServiceConstraint();

	/**
	 * Returns the meta object for the reference '{@link Gtm.FareElement#getCarrierConstraint <em>Carrier Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Carrier Constraint</em>'.
	 * @see Gtm.FareElement#getCarrierConstraint()
	 * @see #getFareElement()
	 * @generated
	 */
	EReference getFareElement_CarrierConstraint();

	/**
	 * Returns the meta object for the reference '{@link Gtm.FareElement#getServiceClass <em>Service Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Class</em>'.
	 * @see Gtm.FareElement#getServiceClass()
	 * @see #getFareElement()
	 * @generated
	 */
	EReference getFareElement_ServiceClass();

	/**
	 * Returns the meta object for the reference '{@link Gtm.FareElement#getServiceLevel <em>Service Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Level</em>'.
	 * @see Gtm.FareElement#getServiceLevel()
	 * @see #getFareElement()
	 * @generated
	 */
	EReference getFareElement_ServiceLevel();

	/**
	 * Returns the meta object for the reference '{@link Gtm.FareElement#getSalesAvailability <em>Sales Availability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sales Availability</em>'.
	 * @see Gtm.FareElement#getSalesAvailability()
	 * @see #getFareElement()
	 * @generated
	 */
	EReference getFareElement_SalesAvailability();

	/**
	 * Returns the meta object for the reference '{@link Gtm.FareElement#getTravelValidity <em>Travel Validity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Travel Validity</em>'.
	 * @see Gtm.FareElement#getTravelValidity()
	 * @see #getFareElement()
	 * @generated
	 */
	EReference getFareElement_TravelValidity();

	/**
	 * Returns the meta object for the reference '{@link Gtm.FareElement#getCombinationConstraint <em>Combination Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Combination Constraint</em>'.
	 * @see Gtm.FareElement#getCombinationConstraint()
	 * @see #getFareElement()
	 * @generated
	 */
	EReference getFareElement_CombinationConstraint();

	/**
	 * Returns the meta object for the reference '{@link Gtm.FareElement#getFareDetailDescription <em>Fare Detail Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fare Detail Description</em>'.
	 * @see Gtm.FareElement#getFareDetailDescription()
	 * @see #getFareElement()
	 * @generated
	 */
	EReference getFareElement_FareDetailDescription();

	/**
	 * Returns the meta object for the reference '{@link Gtm.FareElement#getPersonalDataConstraint <em>Personal Data Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Personal Data Constraint</em>'.
	 * @see Gtm.FareElement#getPersonalDataConstraint()
	 * @see #getFareElement()
	 * @generated
	 */
	EReference getFareElement_PersonalDataConstraint();

	/**
	 * Returns the meta object for the reference '{@link Gtm.FareElement#getReservationParameter <em>Reservation Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reservation Parameter</em>'.
	 * @see Gtm.FareElement#getReservationParameter()
	 * @see #getFareElement()
	 * @generated
	 */
	EReference getFareElement_ReservationParameter();

	/**
	 * Returns the meta object for the reference '{@link Gtm.FareElement#getReductionConstraint <em>Reduction Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reduction Constraint</em>'.
	 * @see Gtm.FareElement#getReductionConstraint()
	 * @see #getFareElement()
	 * @generated
	 */
	EReference getFareElement_ReductionConstraint();

	/**
	 * Returns the meta object for the reference '{@link Gtm.FareElement#getFulfillmentConstraint <em>Fulfillment Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fulfillment Constraint</em>'.
	 * @see Gtm.FareElement#getFulfillmentConstraint()
	 * @see #getFareElement()
	 * @generated
	 */
	EReference getFareElement_FulfillmentConstraint();

	/**
	 * Returns the meta object for the reference '{@link Gtm.FareElement#getPassengerConstraint <em>Passenger Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Passenger Constraint</em>'.
	 * @see Gtm.FareElement#getPassengerConstraint()
	 * @see #getFareElement()
	 * @generated
	 */
	EReference getFareElement_PassengerConstraint();

	/**
	 * Returns the meta object for the attribute list '{@link Gtm.FareElement#getRegulatoryConditions <em>Regulatory Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Regulatory Conditions</em>'.
	 * @see Gtm.FareElement#getRegulatoryConditions()
	 * @see #getFareElement()
	 * @generated
	 */
	EAttribute getFareElement_RegulatoryConditions();

	/**
	 * Returns the meta object for the reference '{@link Gtm.FareElement#getAfterSalesRule <em>After Sales Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>After Sales Rule</em>'.
	 * @see Gtm.FareElement#getAfterSalesRule()
	 * @see #getFareElement()
	 * @generated
	 */
	EReference getFareElement_AfterSalesRule();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.FareElement#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Source</em>'.
	 * @see Gtm.FareElement#getDataSource()
	 * @see #getFareElement()
	 * @generated
	 */
	EAttribute getFareElement_DataSource();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.FareElement#getLegacyAccountingIdentifier <em>Legacy Accounting Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Legacy Accounting Identifier</em>'.
	 * @see Gtm.FareElement#getLegacyAccountingIdentifier()
	 * @see #getFareElement()
	 * @generated
	 */
	EReference getFareElement_LegacyAccountingIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.FareElement#getLegacyConversion <em>Legacy Conversion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Legacy Conversion</em>'.
	 * @see Gtm.FareElement#getLegacyConversion()
	 * @see #getFareElement()
	 * @generated
	 */
	EAttribute getFareElement_LegacyConversion();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.FareElement#isIndividualContracts <em>Individual Contracts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Individual Contracts</em>'.
	 * @see Gtm.FareElement#isIndividualContracts()
	 * @see #getFareElement()
	 * @generated
	 */
	EAttribute getFareElement_IndividualContracts();

	/**
	 * Returns the meta object for the reference list '{@link Gtm.FareElement#getInvolvedTcos <em>Involved Tcos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Involved Tcos</em>'.
	 * @see Gtm.FareElement#getInvolvedTcos()
	 * @see #getFareElement()
	 * @generated
	 */
	EReference getFareElement_InvolvedTcos();

	/**
	 * Returns the meta object for the reference '{@link Gtm.FareElement#getLuggageConstraint <em>Luggage Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Luggage Constraint</em>'.
	 * @see Gtm.FareElement#getLuggageConstraint()
	 * @see #getFareElement()
	 * @generated
	 */
	EReference getFareElement_LuggageConstraint();

	/**
	 * Returns the meta object for class '{@link Gtm.TotalPassengerCombinationConstraints <em>Total Passenger Combination Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Total Passenger Combination Constraints</em>'.
	 * @see Gtm.TotalPassengerCombinationConstraints
	 * @generated
	 */
	EClass getTotalPassengerCombinationConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.TotalPassengerCombinationConstraints#getTotalPassengerCombinationConstraint <em>Total Passenger Combination Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Total Passenger Combination Constraint</em>'.
	 * @see Gtm.TotalPassengerCombinationConstraints#getTotalPassengerCombinationConstraint()
	 * @see #getTotalPassengerCombinationConstraints()
	 * @generated
	 */
	EReference getTotalPassengerCombinationConstraints_TotalPassengerCombinationConstraint();

	/**
	 * Returns the meta object for class '{@link Gtm.TotalPassengerCombinationConstraint <em>Total Passenger Combination Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Total Passenger Combination Constraint</em>'.
	 * @see Gtm.TotalPassengerCombinationConstraint
	 * @generated
	 */
	EClass getTotalPassengerCombinationConstraint();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.TotalPassengerCombinationConstraint#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Gtm.TotalPassengerCombinationConstraint#getId()
	 * @see #getTotalPassengerCombinationConstraint()
	 * @generated
	 */
	EAttribute getTotalPassengerCombinationConstraint_Id();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.TotalPassengerCombinationConstraint#getDataDescription <em>Data Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Description</em>'.
	 * @see Gtm.TotalPassengerCombinationConstraint#getDataDescription()
	 * @see #getTotalPassengerCombinationConstraint()
	 * @generated
	 */
	EAttribute getTotalPassengerCombinationConstraint_DataDescription();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.TotalPassengerCombinationConstraint#getMaxTotalPassengerWeight <em>Max Total Passenger Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Total Passenger Weight</em>'.
	 * @see Gtm.TotalPassengerCombinationConstraint#getMaxTotalPassengerWeight()
	 * @see #getTotalPassengerCombinationConstraint()
	 * @generated
	 */
	EAttribute getTotalPassengerCombinationConstraint_MaxTotalPassengerWeight();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.TotalPassengerCombinationConstraint#getMinTotalPassengerWeight <em>Min Total Passenger Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Total Passenger Weight</em>'.
	 * @see Gtm.TotalPassengerCombinationConstraint#getMinTotalPassengerWeight()
	 * @see #getTotalPassengerCombinationConstraint()
	 * @generated
	 */
	EAttribute getTotalPassengerCombinationConstraint_MinTotalPassengerWeight();

	/**
	 * Returns the meta object for class '{@link Gtm.FareConstraintBundles <em>Fare Constraint Bundles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fare Constraint Bundles</em>'.
	 * @see Gtm.FareConstraintBundles
	 * @generated
	 */
	EClass getFareConstraintBundles();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.FareConstraintBundles#getFareConstraintBundles <em>Fare Constraint Bundles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fare Constraint Bundles</em>'.
	 * @see Gtm.FareConstraintBundles#getFareConstraintBundles()
	 * @see #getFareConstraintBundles()
	 * @generated
	 */
	EReference getFareConstraintBundles_FareConstraintBundles();

	/**
	 * Returns the meta object for class '{@link Gtm.FareConstraintBundle <em>Fare Constraint Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fare Constraint Bundle</em>'.
	 * @see Gtm.FareConstraintBundle
	 * @generated
	 */
	EClass getFareConstraintBundle();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.FareConstraintBundle#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Gtm.FareConstraintBundle#getId()
	 * @see #getFareConstraintBundle()
	 * @generated
	 */
	EAttribute getFareConstraintBundle_Id();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.FareConstraintBundle#getDefaultFareType <em>Default Fare Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Fare Type</em>'.
	 * @see Gtm.FareConstraintBundle#getDefaultFareType()
	 * @see #getFareConstraintBundle()
	 * @generated
	 */
	EAttribute getFareConstraintBundle_DefaultFareType();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.FareConstraintBundle#getDataDescription <em>Data Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Description</em>'.
	 * @see Gtm.FareConstraintBundle#getDataDescription()
	 * @see #getFareConstraintBundle()
	 * @generated
	 */
	EAttribute getFareConstraintBundle_DataDescription();

	/**
	 * Returns the meta object for the reference '{@link Gtm.FareConstraintBundle#getCarrierConstraint <em>Carrier Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Carrier Constraint</em>'.
	 * @see Gtm.FareConstraintBundle#getCarrierConstraint()
	 * @see #getFareConstraintBundle()
	 * @generated
	 */
	EReference getFareConstraintBundle_CarrierConstraint();

	/**
	 * Returns the meta object for the reference '{@link Gtm.FareConstraintBundle#getSalesAvailability <em>Sales Availability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sales Availability</em>'.
	 * @see Gtm.FareConstraintBundle#getSalesAvailability()
	 * @see #getFareConstraintBundle()
	 * @generated
	 */
	EReference getFareConstraintBundle_SalesAvailability();

	/**
	 * Returns the meta object for the reference '{@link Gtm.FareConstraintBundle#getTravelValidity <em>Travel Validity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Travel Validity</em>'.
	 * @see Gtm.FareConstraintBundle#getTravelValidity()
	 * @see #getFareConstraintBundle()
	 * @generated
	 */
	EReference getFareConstraintBundle_TravelValidity();

	/**
	 * Returns the meta object for the reference '{@link Gtm.FareConstraintBundle#getCombinationConstraint <em>Combination Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Combination Constraint</em>'.
	 * @see Gtm.FareConstraintBundle#getCombinationConstraint()
	 * @see #getFareConstraintBundle()
	 * @generated
	 */
	EReference getFareConstraintBundle_CombinationConstraint();

	/**
	 * Returns the meta object for the reference '{@link Gtm.FareConstraintBundle#getPersonalDataConstraint <em>Personal Data Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Personal Data Constraint</em>'.
	 * @see Gtm.FareConstraintBundle#getPersonalDataConstraint()
	 * @see #getFareConstraintBundle()
	 * @generated
	 */
	EReference getFareConstraintBundle_PersonalDataConstraint();

	/**
	 * Returns the meta object for the reference '{@link Gtm.FareConstraintBundle#getFulfillmentConstraint <em>Fulfillment Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fulfillment Constraint</em>'.
	 * @see Gtm.FareConstraintBundle#getFulfillmentConstraint()
	 * @see #getFareConstraintBundle()
	 * @generated
	 */
	EReference getFareConstraintBundle_FulfillmentConstraint();

	/**
	 * Returns the meta object for the reference '{@link Gtm.FareConstraintBundle#getTotalPassengerConstraint <em>Total Passenger Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Total Passenger Constraint</em>'.
	 * @see Gtm.FareConstraintBundle#getTotalPassengerConstraint()
	 * @see #getFareConstraintBundle()
	 * @generated
	 */
	EReference getFareConstraintBundle_TotalPassengerConstraint();

	/**
	 * Returns the meta object for the attribute list '{@link Gtm.FareConstraintBundle#getDefaultRegulatoryConditions <em>Default Regulatory Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Default Regulatory Conditions</em>'.
	 * @see Gtm.FareConstraintBundle#getDefaultRegulatoryConditions()
	 * @see #getFareConstraintBundle()
	 * @generated
	 */
	EAttribute getFareConstraintBundle_DefaultRegulatoryConditions();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.FareConstraintBundle#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Source</em>'.
	 * @see Gtm.FareConstraintBundle#getDataSource()
	 * @see #getFareConstraintBundle()
	 * @generated
	 */
	EAttribute getFareConstraintBundle_DataSource();

	/**
	 * Returns the meta object for the reference list '{@link Gtm.FareConstraintBundle#getConvertedBundles <em>Converted Bundles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Converted Bundles</em>'.
	 * @see Gtm.FareConstraintBundle#getConvertedBundles()
	 * @see #getFareConstraintBundle()
	 * @generated
	 */
	EReference getFareConstraintBundle_ConvertedBundles();

	/**
	 * Returns the meta object for the reference '{@link Gtm.FareConstraintBundle#getLuggageConstraint <em>Luggage Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Luggage Constraint</em>'.
	 * @see Gtm.FareConstraintBundle#getLuggageConstraint()
	 * @see #getFareConstraintBundle()
	 * @generated
	 */
	EReference getFareConstraintBundle_LuggageConstraint();

	/**
	 * Returns the meta object for the reference list '{@link Gtm.FareConstraintBundle#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Products</em>'.
	 * @see Gtm.FareConstraintBundle#getProducts()
	 * @see #getFareConstraintBundle()
	 * @generated
	 */
	EReference getFareConstraintBundle_Products();

	/**
	 * Returns the meta object for class '{@link Gtm.FareStationSetDefinitions <em>Fare Station Set Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fare Station Set Definitions</em>'.
	 * @see Gtm.FareStationSetDefinitions
	 * @generated
	 */
	EClass getFareStationSetDefinitions();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.FareStationSetDefinitions#getFareStationSetDefinitions <em>Fare Station Set Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fare Station Set Definitions</em>'.
	 * @see Gtm.FareStationSetDefinitions#getFareStationSetDefinitions()
	 * @see #getFareStationSetDefinitions()
	 * @generated
	 */
	EReference getFareStationSetDefinitions_FareStationSetDefinitions();

	/**
	 * Returns the meta object for the '{@link Gtm.FareStationSetDefinitions#findFareSet(Gtm.Carrier, int) <em>Find Fare Set</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Fare Set</em>' operation.
	 * @see Gtm.FareStationSetDefinitions#findFareSet(Gtm.Carrier, int)
	 * @generated
	 */
	EOperation getFareStationSetDefinitions__FindFareSet__Carrier_int();

	/**
	 * Returns the meta object for class '{@link Gtm.FareStationSetDefinition <em>Fare Station Set Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fare Station Set Definition</em>'.
	 * @see Gtm.FareStationSetDefinition
	 * @generated
	 */
	EClass getFareStationSetDefinition();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.FareStationSetDefinition#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Source</em>'.
	 * @see Gtm.FareStationSetDefinition#getDataSource()
	 * @see #getFareStationSetDefinition()
	 * @generated
	 */
	EAttribute getFareStationSetDefinition_DataSource();

	/**
	 * Returns the meta object for the reference '{@link Gtm.FareStationSetDefinition#getCarrier <em>Carrier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Carrier</em>'.
	 * @see Gtm.FareStationSetDefinition#getCarrier()
	 * @see #getFareStationSetDefinition()
	 * @generated
	 */
	EReference getFareStationSetDefinition_Carrier();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.FareStationSetDefinition#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see Gtm.FareStationSetDefinition#getCode()
	 * @see #getFareStationSetDefinition()
	 * @generated
	 */
	EAttribute getFareStationSetDefinition_Code();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.FareStationSetDefinition#getLegacyCode <em>Legacy Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Legacy Code</em>'.
	 * @see Gtm.FareStationSetDefinition#getLegacyCode()
	 * @see #getFareStationSetDefinition()
	 * @generated
	 */
	EAttribute getFareStationSetDefinition_LegacyCode();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.FareStationSetDefinition#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Gtm.FareStationSetDefinition#getId()
	 * @see #getFareStationSetDefinition()
	 * @generated
	 */
	EAttribute getFareStationSetDefinition_Id();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.FareStationSetDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Gtm.FareStationSetDefinition#getName()
	 * @see #getFareStationSetDefinition()
	 * @generated
	 */
	EAttribute getFareStationSetDefinition_Name();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.FareStationSetDefinition#getNameUtf8 <em>Name Utf8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Utf8</em>'.
	 * @see Gtm.FareStationSetDefinition#getNameUtf8()
	 * @see #getFareStationSetDefinition()
	 * @generated
	 */
	EAttribute getFareStationSetDefinition_NameUtf8();

	/**
	 * Returns the meta object for the reference list '{@link Gtm.FareStationSetDefinition#getStations <em>Stations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Stations</em>'.
	 * @see Gtm.FareStationSetDefinition#getStations()
	 * @see #getFareStationSetDefinition()
	 * @generated
	 */
	EReference getFareStationSetDefinition_Stations();

	/**
	 * Returns the meta object for class '{@link Gtm.LegacyAccountingIdentifier <em>Legacy Accounting Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legacy Accounting Identifier</em>'.
	 * @see Gtm.LegacyAccountingIdentifier
	 * @generated
	 */
	EClass getLegacyAccountingIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacyAccountingIdentifier#getSeriesId <em>Series Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Series Id</em>'.
	 * @see Gtm.LegacyAccountingIdentifier#getSeriesId()
	 * @see #getLegacyAccountingIdentifier()
	 * @generated
	 */
	EAttribute getLegacyAccountingIdentifier_SeriesId();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacyAccountingIdentifier#getTariffId <em>Tariff Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tariff Id</em>'.
	 * @see Gtm.LegacyAccountingIdentifier#getTariffId()
	 * @see #getLegacyAccountingIdentifier()
	 * @generated
	 */
	EAttribute getLegacyAccountingIdentifier_TariffId();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacyAccountingIdentifier#getAddSeriesId <em>Add Series Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Add Series Id</em>'.
	 * @see Gtm.LegacyAccountingIdentifier#getAddSeriesId()
	 * @see #getLegacyAccountingIdentifier()
	 * @generated
	 */
	EAttribute getLegacyAccountingIdentifier_AddSeriesId();

	/**
	 * Returns the meta object for class '{@link Gtm.ReductionConstraints <em>Reduction Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reduction Constraints</em>'.
	 * @see Gtm.ReductionConstraints
	 * @generated
	 */
	EClass getReductionConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.ReductionConstraints#getReductionConstraints <em>Reduction Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reduction Constraints</em>'.
	 * @see Gtm.ReductionConstraints#getReductionConstraints()
	 * @see #getReductionConstraints()
	 * @generated
	 */
	EReference getReductionConstraints_ReductionConstraints();

	/**
	 * Returns the meta object for class '{@link Gtm.PersonalDataConstraints <em>Personal Data Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Personal Data Constraints</em>'.
	 * @see Gtm.PersonalDataConstraints
	 * @generated
	 */
	EClass getPersonalDataConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.PersonalDataConstraints#getPersonalDataConstraints <em>Personal Data Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Personal Data Constraints</em>'.
	 * @see Gtm.PersonalDataConstraints#getPersonalDataConstraints()
	 * @see #getPersonalDataConstraints()
	 * @generated
	 */
	EReference getPersonalDataConstraints_PersonalDataConstraints();

	/**
	 * Returns the meta object for class '{@link Gtm.PersonalDataConstraint <em>Personal Data Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Personal Data Constraint</em>'.
	 * @see Gtm.PersonalDataConstraint
	 * @generated
	 */
	EClass getPersonalDataConstraint();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.PersonalDataConstraint#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Gtm.PersonalDataConstraint#getId()
	 * @see #getPersonalDataConstraint()
	 * @generated
	 */
	EAttribute getPersonalDataConstraint_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.PersonalDataConstraint#getRequiredPersonalData <em>Required Personal Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Required Personal Data</em>'.
	 * @see Gtm.PersonalDataConstraint#getRequiredPersonalData()
	 * @see #getPersonalDataConstraint()
	 * @generated
	 */
	EReference getPersonalDataConstraint_RequiredPersonalData();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.PersonalDataConstraint#getAllowedChanges <em>Allowed Changes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Allowed Changes</em>'.
	 * @see Gtm.PersonalDataConstraint#getAllowedChanges()
	 * @see #getPersonalDataConstraint()
	 * @generated
	 */
	EReference getPersonalDataConstraint_AllowedChanges();

	/**
	 * Returns the meta object for class '{@link Gtm.RequiredPersonalData <em>Required Personal Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Personal Data</em>'.
	 * @see Gtm.RequiredPersonalData
	 * @generated
	 */
	EClass getRequiredPersonalData();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.RequiredPersonalData#isTicketHolderOnly <em>Ticket Holder Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ticket Holder Only</em>'.
	 * @see Gtm.RequiredPersonalData#isTicketHolderOnly()
	 * @see #getRequiredPersonalData()
	 * @generated
	 */
	EAttribute getRequiredPersonalData_TicketHolderOnly();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.RequiredPersonalData#getDataItem <em>Data Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Item</em>'.
	 * @see Gtm.RequiredPersonalData#getDataItem()
	 * @see #getRequiredPersonalData()
	 * @generated
	 */
	EAttribute getRequiredPersonalData_DataItem();

	/**
	 * Returns the meta object for the attribute list '{@link Gtm.RequiredPersonalData#getTransfer <em>Transfer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Transfer</em>'.
	 * @see Gtm.RequiredPersonalData#getTransfer()
	 * @see #getRequiredPersonalData()
	 * @generated
	 */
	EAttribute getRequiredPersonalData_Transfer();

	/**
	 * Returns the meta object for the attribute list '{@link Gtm.RequiredPersonalData#getFulfillmentType <em>Fulfillment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Fulfillment Type</em>'.
	 * @see Gtm.RequiredPersonalData#getFulfillmentType()
	 * @see #getRequiredPersonalData()
	 * @generated
	 */
	EAttribute getRequiredPersonalData_FulfillmentType();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.RequiredPersonalData#getCrossBorder <em>Cross Border</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cross Border</em>'.
	 * @see Gtm.RequiredPersonalData#getCrossBorder()
	 * @see #getRequiredPersonalData()
	 * @generated
	 */
	EReference getRequiredPersonalData_CrossBorder();

	/**
	 * Returns the meta object for class '{@link Gtm.AllowedPersonalDataChanges <em>Allowed Personal Data Changes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allowed Personal Data Changes</em>'.
	 * @see Gtm.AllowedPersonalDataChanges
	 * @generated
	 */
	EClass getAllowedPersonalDataChanges();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.AllowedPersonalDataChanges#getTimeLimit <em>Time Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Limit</em>'.
	 * @see Gtm.AllowedPersonalDataChanges#getTimeLimit()
	 * @see #getAllowedPersonalDataChanges()
	 * @generated
	 */
	EAttribute getAllowedPersonalDataChanges_TimeLimit();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.AllowedPersonalDataChanges#getAcceptedReason <em>Accepted Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accepted Reason</em>'.
	 * @see Gtm.AllowedPersonalDataChanges#getAcceptedReason()
	 * @see #getAllowedPersonalDataChanges()
	 * @generated
	 */
	EAttribute getAllowedPersonalDataChanges_AcceptedReason();

	/**
	 * Returns the meta object for class '{@link Gtm.PassengerConstraints <em>Passenger Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Passenger Constraints</em>'.
	 * @see Gtm.PassengerConstraints
	 * @generated
	 */
	EClass getPassengerConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.PassengerConstraints#getPassengerConstraints <em>Passenger Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Passenger Constraints</em>'.
	 * @see Gtm.PassengerConstraints#getPassengerConstraints()
	 * @see #getPassengerConstraints()
	 * @generated
	 */
	EReference getPassengerConstraints_PassengerConstraints();

	/**
	 * Returns the meta object for class '{@link Gtm.PassengerConstraint <em>Passenger Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Passenger Constraint</em>'.
	 * @see Gtm.PassengerConstraint
	 * @generated
	 */
	EClass getPassengerConstraint();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.PassengerConstraint#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Gtm.PassengerConstraint#getId()
	 * @see #getPassengerConstraint()
	 * @generated
	 */
	EAttribute getPassengerConstraint_Id();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.PassengerConstraint#getTravelerType <em>Traveler Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Traveler Type</em>'.
	 * @see Gtm.PassengerConstraint#getTravelerType()
	 * @see #getPassengerConstraint()
	 * @generated
	 */
	EAttribute getPassengerConstraint_TravelerType();

	/**
	 * Returns the meta object for the reference '{@link Gtm.PassengerConstraint#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Text</em>'.
	 * @see Gtm.PassengerConstraint#getText()
	 * @see #getPassengerConstraint()
	 * @generated
	 */
	EReference getPassengerConstraint_Text();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.PassengerConstraint#getUpperAgeLimit <em>Upper Age Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Age Limit</em>'.
	 * @see Gtm.PassengerConstraint#getUpperAgeLimit()
	 * @see #getPassengerConstraint()
	 * @generated
	 */
	EAttribute getPassengerConstraint_UpperAgeLimit();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.PassengerConstraint#getLowerAgeLimit <em>Lower Age Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Age Limit</em>'.
	 * @see Gtm.PassengerConstraint#getLowerAgeLimit()
	 * @see #getPassengerConstraint()
	 * @generated
	 */
	EAttribute getPassengerConstraint_LowerAgeLimit();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.PassengerConstraint#getTravelAloneAgeLimit <em>Travel Alone Age Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Travel Alone Age Limit</em>'.
	 * @see Gtm.PassengerConstraint#getTravelAloneAgeLimit()
	 * @see #getPassengerConstraint()
	 * @generated
	 */
	EAttribute getPassengerConstraint_TravelAloneAgeLimit();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.PassengerConstraint#getReservationAgeLimit <em>Reservation Age Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reservation Age Limit</em>'.
	 * @see Gtm.PassengerConstraint#getReservationAgeLimit()
	 * @see #getPassengerConstraint()
	 * @generated
	 */
	EAttribute getPassengerConstraint_ReservationAgeLimit();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.PassengerConstraint#isIsAncilliary <em>Is Ancilliary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Ancilliary</em>'.
	 * @see Gtm.PassengerConstraint#isIsAncilliary()
	 * @see #getPassengerConstraint()
	 * @generated
	 */
	EAttribute getPassengerConstraint_IsAncilliary();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.PassengerConstraint#getPassengerWeight <em>Passenger Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Weight</em>'.
	 * @see Gtm.PassengerConstraint#getPassengerWeight()
	 * @see #getPassengerConstraint()
	 * @generated
	 */
	EAttribute getPassengerConstraint_PassengerWeight();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.PassengerConstraint#getMaxTotalPassengerWeight <em>Max Total Passenger Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Total Passenger Weight</em>'.
	 * @see Gtm.PassengerConstraint#getMaxTotalPassengerWeight()
	 * @see #getPassengerConstraint()
	 * @generated
	 */
	EAttribute getPassengerConstraint_MaxTotalPassengerWeight();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.PassengerConstraint#getMinTotalPassengerWeight <em>Min Total Passenger Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Total Passenger Weight</em>'.
	 * @see Gtm.PassengerConstraint#getMinTotalPassengerWeight()
	 * @see #getPassengerConstraint()
	 * @generated
	 */
	EAttribute getPassengerConstraint_MinTotalPassengerWeight();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.PassengerConstraint#getIncludedFreePassengers <em>Included Free Passengers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Included Free Passengers</em>'.
	 * @see Gtm.PassengerConstraint#getIncludedFreePassengers()
	 * @see #getPassengerConstraint()
	 * @generated
	 */
	EReference getPassengerConstraint_IncludedFreePassengers();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.PassengerConstraint#getExcludedPassengerCombinations <em>Excluded Passenger Combinations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Excluded Passenger Combinations</em>'.
	 * @see Gtm.PassengerConstraint#getExcludedPassengerCombinations()
	 * @see #getPassengerConstraint()
	 * @generated
	 */
	EReference getPassengerConstraint_ExcludedPassengerCombinations();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.PassengerConstraint#getDataDescription <em>Data Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Description</em>'.
	 * @see Gtm.PassengerConstraint#getDataDescription()
	 * @see #getPassengerConstraint()
	 * @generated
	 */
	EAttribute getPassengerConstraint_DataDescription();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.PassengerConstraint#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Source</em>'.
	 * @see Gtm.PassengerConstraint#getDataSource()
	 * @see #getPassengerConstraint()
	 * @generated
	 */
	EAttribute getPassengerConstraint_DataSource();

	/**
	 * Returns the meta object for class '{@link Gtm.PassengerCombinationConstraint <em>Passenger Combination Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Passenger Combination Constraint</em>'.
	 * @see Gtm.PassengerCombinationConstraint
	 * @generated
	 */
	EClass getPassengerCombinationConstraint();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.PassengerCombinationConstraint#getMaxNumber <em>Max Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Number</em>'.
	 * @see Gtm.PassengerCombinationConstraint#getMaxNumber()
	 * @see #getPassengerCombinationConstraint()
	 * @generated
	 */
	EAttribute getPassengerCombinationConstraint_MaxNumber();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.PassengerCombinationConstraint#getMinNumber <em>Min Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Number</em>'.
	 * @see Gtm.PassengerCombinationConstraint#getMinNumber()
	 * @see #getPassengerCombinationConstraint()
	 * @generated
	 */
	EAttribute getPassengerCombinationConstraint_MinNumber();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.PassengerCombinationConstraint#getPassengerType <em>Passenger Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Type</em>'.
	 * @see Gtm.PassengerCombinationConstraint#getPassengerType()
	 * @see #getPassengerCombinationConstraint()
	 * @generated
	 */
	EAttribute getPassengerCombinationConstraint_PassengerType();

	/**
	 * Returns the meta object for the reference '{@link Gtm.PassengerCombinationConstraint#getPassengerConstraint <em>Passenger Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Passenger Constraint</em>'.
	 * @see Gtm.PassengerCombinationConstraint#getPassengerConstraint()
	 * @see #getPassengerCombinationConstraint()
	 * @generated
	 */
	EReference getPassengerCombinationConstraint_PassengerConstraint();

	/**
	 * Returns the meta object for class '{@link Gtm.IncludedFreePassengerLimit <em>Included Free Passenger Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Included Free Passenger Limit</em>'.
	 * @see Gtm.IncludedFreePassengerLimit
	 * @generated
	 */
	EClass getIncludedFreePassengerLimit();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.IncludedFreePassengerLimit#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see Gtm.IncludedFreePassengerLimit#getNumber()
	 * @see #getIncludedFreePassengerLimit()
	 * @generated
	 */
	EAttribute getIncludedFreePassengerLimit_Number();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.IncludedFreePassengerLimit#getPassengerType <em>Passenger Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Type</em>'.
	 * @see Gtm.IncludedFreePassengerLimit#getPassengerType()
	 * @see #getIncludedFreePassengerLimit()
	 * @generated
	 */
	EAttribute getIncludedFreePassengerLimit_PassengerType();

	/**
	 * Returns the meta object for the reference '{@link Gtm.IncludedFreePassengerLimit#getPassengerConstraint <em>Passenger Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Passenger Constraint</em>'.
	 * @see Gtm.IncludedFreePassengerLimit#getPassengerConstraint()
	 * @see #getIncludedFreePassengerLimit()
	 * @generated
	 */
	EReference getIncludedFreePassengerLimit_PassengerConstraint();

	/**
	 * Returns the meta object for class '{@link Gtm.CombinationConstraints <em>Combination Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Combination Constraints</em>'.
	 * @see Gtm.CombinationConstraints
	 * @generated
	 */
	EClass getCombinationConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.CombinationConstraints#getCombinationConstraints <em>Combination Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Combination Constraints</em>'.
	 * @see Gtm.CombinationConstraints#getCombinationConstraints()
	 * @see #getCombinationConstraints()
	 * @generated
	 */
	EReference getCombinationConstraints_CombinationConstraints();

	/**
	 * Returns the meta object for class '{@link Gtm.CombinationConstraint <em>Combination Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Combination Constraint</em>'.
	 * @see Gtm.CombinationConstraint
	 * @generated
	 */
	EClass getCombinationConstraint();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.CombinationConstraint#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Gtm.CombinationConstraint#getId()
	 * @see #getCombinationConstraint()
	 * @generated
	 */
	EAttribute getCombinationConstraint_Id();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.CombinationConstraint#getDataDescription <em>Data Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Description</em>'.
	 * @see Gtm.CombinationConstraint#getDataDescription()
	 * @see #getCombinationConstraint()
	 * @generated
	 */
	EAttribute getCombinationConstraint_DataDescription();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.CombinationConstraint#getCombinationModels <em>Combination Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Combination Models</em>'.
	 * @see Gtm.CombinationConstraint#getCombinationModels()
	 * @see #getCombinationConstraint()
	 * @generated
	 */
	EReference getCombinationConstraint_CombinationModels();

	/**
	 * Returns the meta object for class '{@link Gtm.TravelValidityConstraints <em>Travel Validity Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Travel Validity Constraints</em>'.
	 * @see Gtm.TravelValidityConstraints
	 * @generated
	 */
	EClass getTravelValidityConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.TravelValidityConstraints#getTravelValidityConstraints <em>Travel Validity Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Travel Validity Constraints</em>'.
	 * @see Gtm.TravelValidityConstraints#getTravelValidityConstraints()
	 * @see #getTravelValidityConstraints()
	 * @generated
	 */
	EReference getTravelValidityConstraints_TravelValidityConstraints();

	/**
	 * Returns the meta object for class '{@link Gtm.TravelValidityConstraint <em>Travel Validity Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Travel Validity Constraint</em>'.
	 * @see Gtm.TravelValidityConstraint
	 * @generated
	 */
	EClass getTravelValidityConstraint();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.TravelValidityConstraint#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Gtm.TravelValidityConstraint#getId()
	 * @see #getTravelValidityConstraint()
	 * @generated
	 */
	EAttribute getTravelValidityConstraint_Id();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.TravelValidityConstraint#getDataDescription <em>Data Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Description</em>'.
	 * @see Gtm.TravelValidityConstraint#getDataDescription()
	 * @see #getTravelValidityConstraint()
	 * @generated
	 */
	EAttribute getTravelValidityConstraint_DataDescription();

	/**
	 * Returns the meta object for the reference '{@link Gtm.TravelValidityConstraint#getValidDays <em>Valid Days</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Valid Days</em>'.
	 * @see Gtm.TravelValidityConstraint#getValidDays()
	 * @see #getTravelValidityConstraint()
	 * @generated
	 */
	EReference getTravelValidityConstraint_ValidDays();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.TravelValidityConstraint#getTravelDays <em>Travel Days</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Travel Days</em>'.
	 * @see Gtm.TravelValidityConstraint#getTravelDays()
	 * @see #getTravelValidityConstraint()
	 * @generated
	 */
	EAttribute getTravelValidityConstraint_TravelDays();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.TravelValidityConstraint#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see Gtm.TravelValidityConstraint#getRange()
	 * @see #getTravelValidityConstraint()
	 * @generated
	 */
	EReference getTravelValidityConstraint_Range();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.TravelValidityConstraint#getReturnConstraint <em>Return Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Constraint</em>'.
	 * @see Gtm.TravelValidityConstraint#getReturnConstraint()
	 * @see #getTravelValidityConstraint()
	 * @generated
	 */
	EReference getTravelValidityConstraint_ReturnConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.TravelValidityConstraint#getExcludedTimeRange <em>Excluded Time Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Excluded Time Range</em>'.
	 * @see Gtm.TravelValidityConstraint#getExcludedTimeRange()
	 * @see #getTravelValidityConstraint()
	 * @generated
	 */
	EReference getTravelValidityConstraint_ExcludedTimeRange();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.TravelValidityConstraint#getTrainValidity <em>Train Validity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Train Validity</em>'.
	 * @see Gtm.TravelValidityConstraint#getTrainValidity()
	 * @see #getTravelValidityConstraint()
	 * @generated
	 */
	EReference getTravelValidityConstraint_TrainValidity();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.TravelValidityConstraint#getValidityType <em>Validity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validity Type</em>'.
	 * @see Gtm.TravelValidityConstraint#getValidityType()
	 * @see #getTravelValidityConstraint()
	 * @generated
	 */
	EAttribute getTravelValidityConstraint_ValidityType();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.TravelValidityConstraint#getTripInterruptionConstraint <em>Trip Interruption Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trip Interruption Constraint</em>'.
	 * @see Gtm.TravelValidityConstraint#getTripInterruptionConstraint()
	 * @see #getTravelValidityConstraint()
	 * @generated
	 */
	EReference getTravelValidityConstraint_TripInterruptionConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.TravelValidityConstraint#getTripAllocationConstraint <em>Trip Allocation Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trip Allocation Constraint</em>'.
	 * @see Gtm.TravelValidityConstraint#getTripAllocationConstraint()
	 * @see #getTravelValidityConstraint()
	 * @generated
	 */
	EReference getTravelValidityConstraint_TripAllocationConstraint();

	/**
	 * Returns the meta object for class '{@link Gtm.TrainValidity <em>Train Validity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Train Validity</em>'.
	 * @see Gtm.TrainValidity
	 * @generated
	 */
	EClass getTrainValidity();

	/**
	 * Returns the meta object for the reference '{@link Gtm.TrainValidity#getCarrierConstraint <em>Carrier Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Carrier Constraint</em>'.
	 * @see Gtm.TrainValidity#getCarrierConstraint()
	 * @see #getTrainValidity()
	 * @generated
	 */
	EReference getTrainValidity_CarrierConstraint();

	/**
	 * Returns the meta object for the reference '{@link Gtm.TrainValidity#getSerrviceConstraint <em>Serrvice Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Serrvice Constraint</em>'.
	 * @see Gtm.TrainValidity#getSerrviceConstraint()
	 * @see #getTrainValidity()
	 * @generated
	 */
	EReference getTrainValidity_SerrviceConstraint();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.TrainValidity#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see Gtm.TrainValidity#getScope()
	 * @see #getTrainValidity()
	 * @generated
	 */
	EAttribute getTrainValidity_Scope();

	/**
	 * Returns the meta object for class '{@link Gtm.SalesAvailabilityConstraints <em>Sales Availability Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sales Availability Constraints</em>'.
	 * @see Gtm.SalesAvailabilityConstraints
	 * @generated
	 */
	EClass getSalesAvailabilityConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.SalesAvailabilityConstraints#getSalesAvailabilityConstraints <em>Sales Availability Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sales Availability Constraints</em>'.
	 * @see Gtm.SalesAvailabilityConstraints#getSalesAvailabilityConstraints()
	 * @see #getSalesAvailabilityConstraints()
	 * @generated
	 */
	EReference getSalesAvailabilityConstraints_SalesAvailabilityConstraints();

	/**
	 * Returns the meta object for class '{@link Gtm.SalesAvailabilityConstraint <em>Sales Availability Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sales Availability Constraint</em>'.
	 * @see Gtm.SalesAvailabilityConstraint
	 * @generated
	 */
	EClass getSalesAvailabilityConstraint();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.SalesAvailabilityConstraint#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Gtm.SalesAvailabilityConstraint#getId()
	 * @see #getSalesAvailabilityConstraint()
	 * @generated
	 */
	EAttribute getSalesAvailabilityConstraint_Id();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.SalesAvailabilityConstraint#getDataDescription <em>Data Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Description</em>'.
	 * @see Gtm.SalesAvailabilityConstraint#getDataDescription()
	 * @see #getSalesAvailabilityConstraint()
	 * @generated
	 */
	EAttribute getSalesAvailabilityConstraint_DataDescription();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.SalesAvailabilityConstraint#getRestrictions <em>Restrictions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Restrictions</em>'.
	 * @see Gtm.SalesAvailabilityConstraint#getRestrictions()
	 * @see #getSalesAvailabilityConstraint()
	 * @generated
	 */
	EReference getSalesAvailabilityConstraint_Restrictions();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.SalesAvailabilityConstraint#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Source</em>'.
	 * @see Gtm.SalesAvailabilityConstraint#getDataSource()
	 * @see #getSalesAvailabilityConstraint()
	 * @generated
	 */
	EAttribute getSalesAvailabilityConstraint_DataSource();

	/**
	 * Returns the meta object for class '{@link Gtm.SalesRestriction <em>Sales Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sales Restriction</em>'.
	 * @see Gtm.SalesRestriction
	 * @generated
	 */
	EClass getSalesRestriction();

	/**
	 * Returns the meta object for the reference '{@link Gtm.SalesRestriction#getSalesDates <em>Sales Dates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sales Dates</em>'.
	 * @see Gtm.SalesRestriction#getSalesDates()
	 * @see #getSalesRestriction()
	 * @generated
	 */
	EReference getSalesRestriction_SalesDates();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.SalesRestriction#getStartOfSale <em>Start Of Sale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start Of Sale</em>'.
	 * @see Gtm.SalesRestriction#getStartOfSale()
	 * @see #getSalesRestriction()
	 * @generated
	 */
	EReference getSalesRestriction_StartOfSale();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.SalesRestriction#getEndOfSale <em>End Of Sale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End Of Sale</em>'.
	 * @see Gtm.SalesRestriction#getEndOfSale()
	 * @see #getSalesRestriction()
	 * @generated
	 */
	EReference getSalesRestriction_EndOfSale();

	/**
	 * Returns the meta object for class '{@link Gtm.EndOfSale <em>End Of Sale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Of Sale</em>'.
	 * @see Gtm.EndOfSale
	 * @generated
	 */
	EClass getEndOfSale();

	/**
	 * Returns the meta object for class '{@link Gtm.StartOfSale <em>Start Of Sale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Of Sale</em>'.
	 * @see Gtm.StartOfSale
	 * @generated
	 */
	EClass getStartOfSale();

	/**
	 * Returns the meta object for class '{@link Gtm.CarrierGroup <em>Carrier Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Carrier Group</em>'.
	 * @see Gtm.CarrierGroup
	 * @generated
	 */
	EClass getCarrierGroup();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.CarrierGroup#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Source</em>'.
	 * @see Gtm.CarrierGroup#getDataSource()
	 * @see #getCarrierGroup()
	 * @generated
	 */
	EAttribute getCarrierGroup_DataSource();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.CarrierGroup#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Gtm.CarrierGroup#getId()
	 * @see #getCarrierGroup()
	 * @generated
	 */
	EAttribute getCarrierGroup_Id();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.CarrierGroup#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see Gtm.CarrierGroup#getCode()
	 * @see #getCarrierGroup()
	 * @generated
	 */
	EAttribute getCarrierGroup_Code();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.CarrierGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Gtm.CarrierGroup#getName()
	 * @see #getCarrierGroup()
	 * @generated
	 */
	EAttribute getCarrierGroup_Name();

	/**
	 * Returns the meta object for the reference '{@link Gtm.CarrierGroup#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Description</em>'.
	 * @see Gtm.CarrierGroup#getDescription()
	 * @see #getCarrierGroup()
	 * @generated
	 */
	EReference getCarrierGroup_Description();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.CarrierGroup#getLegacyCode <em>Legacy Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Legacy Code</em>'.
	 * @see Gtm.CarrierGroup#getLegacyCode()
	 * @see #getCarrierGroup()
	 * @generated
	 */
	EAttribute getCarrierGroup_LegacyCode();

	/**
	 * Returns the meta object for the reference list '{@link Gtm.CarrierGroup#getCompanies <em>Companies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Companies</em>'.
	 * @see Gtm.CarrierGroup#getCompanies()
	 * @see #getCarrierGroup()
	 * @generated
	 */
	EReference getCarrierGroup_Companies();

	/**
	 * Returns the meta object for class '{@link Gtm.CarrierGroups <em>Carrier Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Carrier Groups</em>'.
	 * @see Gtm.CarrierGroups
	 * @generated
	 */
	EClass getCarrierGroups();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.CarrierGroups#getCarrierGroups <em>Carrier Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Carrier Groups</em>'.
	 * @see Gtm.CarrierGroups#getCarrierGroups()
	 * @see #getCarrierGroups()
	 * @generated
	 */
	EReference getCarrierGroups_CarrierGroups();

	/**
	 * Returns the meta object for class '{@link Gtm.ReductionCards <em>Reduction Cards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reduction Cards</em>'.
	 * @see Gtm.ReductionCards
	 * @generated
	 */
	EClass getReductionCards();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.ReductionCards#getReductionCards <em>Reduction Cards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reduction Cards</em>'.
	 * @see Gtm.ReductionCards#getReductionCards()
	 * @see #getReductionCards()
	 * @generated
	 */
	EReference getReductionCards_ReductionCards();

	/**
	 * Returns the meta object for class '{@link Gtm.ReductionCard <em>Reduction Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reduction Card</em>'.
	 * @see Gtm.ReductionCard
	 * @generated
	 */
	EClass getReductionCard();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ReductionCard#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Gtm.ReductionCard#getId()
	 * @see #getReductionCard()
	 * @generated
	 */
	EAttribute getReductionCard_Id();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ReductionCard#getShortCode <em>Short Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Code</em>'.
	 * @see Gtm.ReductionCard#getShortCode()
	 * @see #getReductionCard()
	 * @generated
	 */
	EAttribute getReductionCard_ShortCode();

	/**
	 * Returns the meta object for the reference '{@link Gtm.ReductionCard#getCardIssuer <em>Card Issuer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Card Issuer</em>'.
	 * @see Gtm.ReductionCard#getCardIssuer()
	 * @see #getReductionCard()
	 * @generated
	 */
	EReference getReductionCard_CardIssuer();

	/**
	 * Returns the meta object for the reference '{@link Gtm.ReductionCard#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Name</em>'.
	 * @see Gtm.ReductionCard#getName()
	 * @see #getReductionCard()
	 * @generated
	 */
	EReference getReductionCard_Name();

	/**
	 * Returns the meta object for the reference list '{@link Gtm.ReductionCard#getServiceClasses <em>Service Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Service Classes</em>'.
	 * @see Gtm.ReductionCard#getServiceClasses()
	 * @see #getReductionCard()
	 * @generated
	 */
	EReference getReductionCard_ServiceClasses();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ReductionCard#isIdRequiredForBooking <em>Id Required For Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Required For Booking</em>'.
	 * @see Gtm.ReductionCard#isIdRequiredForBooking()
	 * @see #getReductionCard()
	 * @generated
	 */
	EAttribute getReductionCard_IdRequiredForBooking();

	/**
	 * Returns the meta object for the reference list '{@link Gtm.ReductionCard#getIncludedReductionCards <em>Included Reduction Cards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Included Reduction Cards</em>'.
	 * @see Gtm.ReductionCard#getIncludedReductionCards()
	 * @see #getReductionCard()
	 * @generated
	 */
	EReference getReductionCard_IncludedReductionCards();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ReductionCard#isUicCode <em>Uic Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uic Code</em>'.
	 * @see Gtm.ReductionCard#isUicCode()
	 * @see #getReductionCard()
	 * @generated
	 */
	EAttribute getReductionCard_UicCode();

	/**
	 * Returns the meta object for class '{@link Gtm.CarrierConstraints <em>Carrier Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Carrier Constraints</em>'.
	 * @see Gtm.CarrierConstraints
	 * @generated
	 */
	EClass getCarrierConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.CarrierConstraints#getCarrierConstraints <em>Carrier Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Carrier Constraints</em>'.
	 * @see Gtm.CarrierConstraints#getCarrierConstraints()
	 * @see #getCarrierConstraints()
	 * @generated
	 */
	EReference getCarrierConstraints_CarrierConstraints();

	/**
	 * Returns the meta object for class '{@link Gtm.CarrierConstraint <em>Carrier Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Carrier Constraint</em>'.
	 * @see Gtm.CarrierConstraint
	 * @generated
	 */
	EClass getCarrierConstraint();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.CarrierConstraint#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Gtm.CarrierConstraint#getId()
	 * @see #getCarrierConstraint()
	 * @generated
	 */
	EAttribute getCarrierConstraint_Id();

	/**
	 * Returns the meta object for the reference list '{@link Gtm.CarrierConstraint#getIncludedCarriers <em>Included Carriers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Included Carriers</em>'.
	 * @see Gtm.CarrierConstraint#getIncludedCarriers()
	 * @see #getCarrierConstraint()
	 * @generated
	 */
	EReference getCarrierConstraint_IncludedCarriers();

	/**
	 * Returns the meta object for the reference list '{@link Gtm.CarrierConstraint#getExcludedCarriers <em>Excluded Carriers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Excluded Carriers</em>'.
	 * @see Gtm.CarrierConstraint#getExcludedCarriers()
	 * @see #getCarrierConstraint()
	 * @generated
	 */
	EReference getCarrierConstraint_ExcludedCarriers();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.CarrierConstraint#getDataDescription <em>Data Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Description</em>'.
	 * @see Gtm.CarrierConstraint#getDataDescription()
	 * @see #getCarrierConstraint()
	 * @generated
	 */
	EAttribute getCarrierConstraint_DataDescription();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.CarrierConstraint#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Source</em>'.
	 * @see Gtm.CarrierConstraint#getDataSource()
	 * @see #getCarrierConstraint()
	 * @generated
	 */
	EAttribute getCarrierConstraint_DataSource();

	/**
	 * Returns the meta object for the reference '{@link Gtm.CarrierConstraint#getIncludedCarrierGroup <em>Included Carrier Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Included Carrier Group</em>'.
	 * @see Gtm.CarrierConstraint#getIncludedCarrierGroup()
	 * @see #getCarrierConstraint()
	 * @generated
	 */
	EReference getCarrierConstraint_IncludedCarrierGroup();

	/**
	 * Returns the meta object for class '{@link Gtm.ServiceConstraints <em>Service Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Constraints</em>'.
	 * @see Gtm.ServiceConstraints
	 * @generated
	 */
	EClass getServiceConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.ServiceConstraints#getServiceConstraints <em>Service Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Constraints</em>'.
	 * @see Gtm.ServiceConstraints#getServiceConstraints()
	 * @see #getServiceConstraints()
	 * @generated
	 */
	EReference getServiceConstraints_ServiceConstraints();

	/**
	 * Returns the meta object for class '{@link Gtm.ServiceConstraint <em>Service Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Constraint</em>'.
	 * @see Gtm.ServiceConstraint
	 * @generated
	 */
	EClass getServiceConstraint();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ServiceConstraint#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Gtm.ServiceConstraint#getId()
	 * @see #getServiceConstraint()
	 * @generated
	 */
	EAttribute getServiceConstraint_Id();

	/**
	 * Returns the meta object for the reference list '{@link Gtm.ServiceConstraint#getIncludedServiceBrands <em>Included Service Brands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Included Service Brands</em>'.
	 * @see Gtm.ServiceConstraint#getIncludedServiceBrands()
	 * @see #getServiceConstraint()
	 * @generated
	 */
	EReference getServiceConstraint_IncludedServiceBrands();

	/**
	 * Returns the meta object for the reference list '{@link Gtm.ServiceConstraint#getExcludedServiceBrands <em>Excluded Service Brands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Excluded Service Brands</em>'.
	 * @see Gtm.ServiceConstraint#getExcludedServiceBrands()
	 * @see #getServiceConstraint()
	 * @generated
	 */
	EReference getServiceConstraint_ExcludedServiceBrands();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ServiceConstraint#getDataDescription <em>Data Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Description</em>'.
	 * @see Gtm.ServiceConstraint#getDataDescription()
	 * @see #getServiceConstraint()
	 * @generated
	 */
	EAttribute getServiceConstraint_DataDescription();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ServiceConstraint#getLegacy108Code <em>Legacy108 Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Legacy108 Code</em>'.
	 * @see Gtm.ServiceConstraint#getLegacy108Code()
	 * @see #getServiceConstraint()
	 * @generated
	 */
	EAttribute getServiceConstraint_Legacy108Code();

	/**
	 * Returns the meta object for the reference '{@link Gtm.ServiceConstraint#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Description</em>'.
	 * @see Gtm.ServiceConstraint#getDescription()
	 * @see #getServiceConstraint()
	 * @generated
	 */
	EReference getServiceConstraint_Description();

	/**
	 * Returns the meta object for class '{@link Gtm.RegionalConstraints <em>Regional Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regional Constraints</em>'.
	 * @see Gtm.RegionalConstraints
	 * @generated
	 */
	EClass getRegionalConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.RegionalConstraints#getRegionalConstraints <em>Regional Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Regional Constraints</em>'.
	 * @see Gtm.RegionalConstraints#getRegionalConstraints()
	 * @see #getRegionalConstraints()
	 * @generated
	 */
	EReference getRegionalConstraints_RegionalConstraints();

	/**
	 * Returns the meta object for class '{@link Gtm.RegionalConstraint <em>Regional Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regional Constraint</em>'.
	 * @see Gtm.RegionalConstraint
	 * @generated
	 */
	EClass getRegionalConstraint();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.RegionalConstraint#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Gtm.RegionalConstraint#getId()
	 * @see #getRegionalConstraint()
	 * @generated
	 */
	EAttribute getRegionalConstraint_Id();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.RegionalConstraint#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance</em>'.
	 * @see Gtm.RegionalConstraint#getDistance()
	 * @see #getRegionalConstraint()
	 * @generated
	 */
	EAttribute getRegionalConstraint_Distance();

	/**
	 * Returns the meta object for the reference '{@link Gtm.RegionalConstraint#getEntryConnectionPoint <em>Entry Connection Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entry Connection Point</em>'.
	 * @see Gtm.RegionalConstraint#getEntryConnectionPoint()
	 * @see #getRegionalConstraint()
	 * @generated
	 */
	EReference getRegionalConstraint_EntryConnectionPoint();

	/**
	 * Returns the meta object for the reference '{@link Gtm.RegionalConstraint#getExitConnectionPoint <em>Exit Connection Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Exit Connection Point</em>'.
	 * @see Gtm.RegionalConstraint#getExitConnectionPoint()
	 * @see #getRegionalConstraint()
	 * @generated
	 */
	EReference getRegionalConstraint_ExitConnectionPoint();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.RegionalConstraint#getRegionalValidity <em>Regional Validity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Regional Validity</em>'.
	 * @see Gtm.RegionalConstraint#getRegionalValidity()
	 * @see #getRegionalConstraint()
	 * @generated
	 */
	EReference getRegionalConstraint_RegionalValidity();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.RegionalConstraint#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Source</em>'.
	 * @see Gtm.RegionalConstraint#getDataSource()
	 * @see #getRegionalConstraint()
	 * @generated
	 */
	EAttribute getRegionalConstraint_DataSource();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.RegionalConstraint#getDataDescription <em>Data Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Description</em>'.
	 * @see Gtm.RegionalConstraint#getDataDescription()
	 * @see #getRegionalConstraint()
	 * @generated
	 */
	EAttribute getRegionalConstraint_DataDescription();

	/**
	 * Returns the meta object for the reference list '{@link Gtm.RegionalConstraint#getLinkedFares <em>Linked Fares</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Linked Fares</em>'.
	 * @see Gtm.RegionalConstraint#getLinkedFares()
	 * @see #getRegionalConstraint()
	 * @generated
	 */
	EReference getRegionalConstraint_LinkedFares();

	/**
	 * Returns the meta object for class '{@link Gtm.RegionalValidity <em>Regional Validity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regional Validity</em>'.
	 * @see Gtm.RegionalValidity
	 * @generated
	 */
	EClass getRegionalValidity();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.RegionalValidity#getSeqNb <em>Seq Nb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seq Nb</em>'.
	 * @see Gtm.RegionalValidity#getSeqNb()
	 * @see #getRegionalValidity()
	 * @generated
	 */
	EAttribute getRegionalValidity_SeqNb();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.RegionalValidity#getViaStation <em>Via Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Via Station</em>'.
	 * @see Gtm.RegionalValidity#getViaStation()
	 * @see #getRegionalValidity()
	 * @generated
	 */
	EReference getRegionalValidity_ViaStation();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.RegionalValidity#getZone <em>Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Zone</em>'.
	 * @see Gtm.RegionalValidity#getZone()
	 * @see #getRegionalValidity()
	 * @generated
	 */
	EReference getRegionalValidity_Zone();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.RegionalValidity#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Line</em>'.
	 * @see Gtm.RegionalValidity#getLine()
	 * @see #getRegionalValidity()
	 * @generated
	 */
	EReference getRegionalValidity_Line();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.RegionalValidity#getPolygone <em>Polygone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Polygone</em>'.
	 * @see Gtm.RegionalValidity#getPolygone()
	 * @see #getRegionalValidity()
	 * @generated
	 */
	EReference getRegionalValidity_Polygone();

	/**
	 * Returns the meta object for the reference '{@link Gtm.RegionalValidity#getCarrierConstraint <em>Carrier Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Carrier Constraint</em>'.
	 * @see Gtm.RegionalValidity#getCarrierConstraint()
	 * @see #getRegionalValidity()
	 * @generated
	 */
	EReference getRegionalValidity_CarrierConstraint();

	/**
	 * Returns the meta object for the reference '{@link Gtm.RegionalValidity#getServiceConstraint <em>Service Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Constraint</em>'.
	 * @see Gtm.RegionalValidity#getServiceConstraint()
	 * @see #getRegionalValidity()
	 * @generated
	 */
	EReference getRegionalValidity_ServiceConstraint();

	/**
	 * Returns the meta object for class '{@link Gtm.ServiceLevelDefinitions <em>Service Level Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Level Definitions</em>'.
	 * @see Gtm.ServiceLevelDefinitions
	 * @generated
	 */
	EClass getServiceLevelDefinitions();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.ServiceLevelDefinitions#getServiceLevelDefinition <em>Service Level Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Level Definition</em>'.
	 * @see Gtm.ServiceLevelDefinitions#getServiceLevelDefinition()
	 * @see #getServiceLevelDefinitions()
	 * @generated
	 */
	EReference getServiceLevelDefinitions_ServiceLevelDefinition();

	/**
	 * Returns the meta object for class '{@link Gtm.Texts <em>Texts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Texts</em>'.
	 * @see Gtm.Texts
	 * @generated
	 */
	EClass getTexts();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.Texts#getTexts <em>Texts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Texts</em>'.
	 * @see Gtm.Texts#getTexts()
	 * @see #getTexts()
	 * @generated
	 */
	EReference getTexts_Texts();

	/**
	 * Returns the meta object for class '{@link Gtm.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see Gtm.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Text#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Gtm.Text#getId()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Id();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Text#getTextUTF8 <em>Text UTF8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text UTF8</em>'.
	 * @see Gtm.Text#getTextUTF8()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_TextUTF8();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Text#getTextICAO <em>Text ICAO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text ICAO</em>'.
	 * @see Gtm.Text#getTextICAO()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_TextICAO();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Text#getShortTextUTF8 <em>Short Text UTF8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Text UTF8</em>'.
	 * @see Gtm.Text#getShortTextUTF8()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_ShortTextUTF8();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Text#getShortTextICAO <em>Short Text ICAO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Text ICAO</em>'.
	 * @see Gtm.Text#getShortTextICAO()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_ShortTextICAO();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.Text#getTranslations <em>Translations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Translations</em>'.
	 * @see Gtm.Text#getTranslations()
	 * @see #getText()
	 * @generated
	 */
	EReference getText_Translations();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Text#isStandardText <em>Standard Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standard Text</em>'.
	 * @see Gtm.Text#isStandardText()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_StandardText();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Text#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Source</em>'.
	 * @see Gtm.Text#getDataSource()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_DataSource();

	/**
	 * Returns the meta object for class '{@link Gtm.Translation <em>Translation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Translation</em>'.
	 * @see Gtm.Translation
	 * @generated
	 */
	EClass getTranslation();

	/**
	 * Returns the meta object for the reference '{@link Gtm.Translation#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Language</em>'.
	 * @see Gtm.Translation#getLanguage()
	 * @see #getTranslation()
	 * @generated
	 */
	EReference getTranslation_Language();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Translation#getTextUTF8 <em>Text UTF8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text UTF8</em>'.
	 * @see Gtm.Translation#getTextUTF8()
	 * @see #getTranslation()
	 * @generated
	 */
	EAttribute getTranslation_TextUTF8();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Translation#getTextICAO <em>Text ICAO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text ICAO</em>'.
	 * @see Gtm.Translation#getTextICAO()
	 * @see #getTranslation()
	 * @generated
	 */
	EAttribute getTranslation_TextICAO();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Translation#getShortTextUTF8 <em>Short Text UTF8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Text UTF8</em>'.
	 * @see Gtm.Translation#getShortTextUTF8()
	 * @see #getTranslation()
	 * @generated
	 */
	EAttribute getTranslation_ShortTextUTF8();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Translation#getShortTextICAO <em>Short Text ICAO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Text ICAO</em>'.
	 * @see Gtm.Translation#getShortTextICAO()
	 * @see #getTranslation()
	 * @generated
	 */
	EAttribute getTranslation_ShortTextICAO();

	/**
	 * Returns the meta object for class '{@link Gtm.Prices <em>Prices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prices</em>'.
	 * @see Gtm.Prices
	 * @generated
	 */
	EClass getPrices();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.Prices#getPrices <em>Prices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prices</em>'.
	 * @see Gtm.Prices#getPrices()
	 * @see #getPrices()
	 * @generated
	 */
	EReference getPrices_Prices();

	/**
	 * Returns the meta object for class '{@link Gtm.Price <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Price</em>'.
	 * @see Gtm.Price
	 * @generated
	 */
	EClass getPrice();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Price#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Gtm.Price#getId()
	 * @see #getPrice()
	 * @generated
	 */
	EAttribute getPrice_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.Price#getCurrencies <em>Currencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Currencies</em>'.
	 * @see Gtm.Price#getCurrencies()
	 * @see #getPrice()
	 * @generated
	 */
	EReference getPrice_Currencies();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Price#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Source</em>'.
	 * @see Gtm.Price#getDataSource()
	 * @see #getPrice()
	 * @generated
	 */
	EAttribute getPrice_DataSource();

	/**
	 * Returns the meta object for class '{@link Gtm.VATDetail <em>VAT Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VAT Detail</em>'.
	 * @see Gtm.VATDetail
	 * @generated
	 */
	EClass getVATDetail();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.VATDetail#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see Gtm.VATDetail#getAmount()
	 * @see #getVATDetail()
	 * @generated
	 */
	EAttribute getVATDetail_Amount();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.VATDetail#getPercentage <em>Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage</em>'.
	 * @see Gtm.VATDetail#getPercentage()
	 * @see #getVATDetail()
	 * @generated
	 */
	EAttribute getVATDetail_Percentage();

	/**
	 * Returns the meta object for the reference '{@link Gtm.VATDetail#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Country</em>'.
	 * @see Gtm.VATDetail#getCountry()
	 * @see #getVATDetail()
	 * @generated
	 */
	EReference getVATDetail_Country();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.VATDetail#getTaxId <em>Tax Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Id</em>'.
	 * @see Gtm.VATDetail#getTaxId()
	 * @see #getVATDetail()
	 * @generated
	 */
	EAttribute getVATDetail_TaxId();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.VATDetail#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see Gtm.VATDetail#getScope()
	 * @see #getVATDetail()
	 * @generated
	 */
	EAttribute getVATDetail_Scope();

	/**
	 * Returns the meta object for class '{@link Gtm.CurrencyPrice <em>Currency Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Currency Price</em>'.
	 * @see Gtm.CurrencyPrice
	 * @generated
	 */
	EClass getCurrencyPrice();

	/**
	 * Returns the meta object for the reference '{@link Gtm.CurrencyPrice#getCurrency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Currency</em>'.
	 * @see Gtm.CurrencyPrice#getCurrency()
	 * @see #getCurrencyPrice()
	 * @generated
	 */
	EReference getCurrencyPrice_Currency();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.CurrencyPrice#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see Gtm.CurrencyPrice#getAmount()
	 * @see #getCurrencyPrice()
	 * @generated
	 */
	EAttribute getCurrencyPrice_Amount();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.CurrencyPrice#getVATdetails <em>VA Tdetails</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>VA Tdetails</em>'.
	 * @see Gtm.CurrencyPrice#getVATdetails()
	 * @see #getCurrencyPrice()
	 * @generated
	 */
	EReference getCurrencyPrice_VATdetails();

	/**
	 * Returns the meta object for class '{@link Gtm.ServiceClassDefinitions <em>Service Class Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Class Definitions</em>'.
	 * @see Gtm.ServiceClassDefinitions
	 * @generated
	 */
	EClass getServiceClassDefinitions();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.ServiceClassDefinitions#getServiceClassDefinitions <em>Service Class Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Class Definitions</em>'.
	 * @see Gtm.ServiceClassDefinitions#getServiceClassDefinitions()
	 * @see #getServiceClassDefinitions()
	 * @generated
	 */
	EReference getServiceClassDefinitions_ServiceClassDefinitions();

	/**
	 * Returns the meta object for class '{@link Gtm.Calendars <em>Calendars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calendars</em>'.
	 * @see Gtm.Calendars
	 * @generated
	 */
	EClass getCalendars();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.Calendars#getCalendars <em>Calendars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Calendars</em>'.
	 * @see Gtm.Calendars#getCalendars()
	 * @see #getCalendars()
	 * @generated
	 */
	EReference getCalendars_Calendars();

	/**
	 * Returns the meta object for class '{@link Gtm.Calendar <em>Calendar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calendar</em>'.
	 * @see Gtm.Calendar
	 * @generated
	 */
	EClass getCalendar();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Calendar#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Gtm.Calendar#getName()
	 * @see #getCalendar()
	 * @generated
	 */
	EAttribute getCalendar_Name();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Calendar#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Gtm.Calendar#getId()
	 * @see #getCalendar()
	 * @generated
	 */
	EAttribute getCalendar_Id();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Calendar#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see Gtm.Calendar#getFromDate()
	 * @see #getCalendar()
	 * @generated
	 */
	EAttribute getCalendar_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Calendar#getUntilDate <em>Until Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Until Date</em>'.
	 * @see Gtm.Calendar#getUntilDate()
	 * @see #getCalendar()
	 * @generated
	 */
	EAttribute getCalendar_UntilDate();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Calendar#getUtcOffset <em>Utc Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Utc Offset</em>'.
	 * @see Gtm.Calendar#getUtcOffset()
	 * @see #getCalendar()
	 * @generated
	 */
	EAttribute getCalendar_UtcOffset();

	/**
	 * Returns the meta object for the attribute list '{@link Gtm.Calendar#getDates <em>Dates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Dates</em>'.
	 * @see Gtm.Calendar#getDates()
	 * @see #getCalendar()
	 * @generated
	 */
	EAttribute getCalendar_Dates();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Calendar#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Source</em>'.
	 * @see Gtm.Calendar#getDataSource()
	 * @see #getCalendar()
	 * @generated
	 */
	EAttribute getCalendar_DataSource();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Calendar#getFromDateTime <em>From Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date Time</em>'.
	 * @see Gtm.Calendar#getFromDateTime()
	 * @see #getCalendar()
	 * @generated
	 */
	EAttribute getCalendar_FromDateTime();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Calendar#getUntilDateTime <em>Until Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Until Date Time</em>'.
	 * @see Gtm.Calendar#getUntilDateTime()
	 * @see #getCalendar()
	 * @generated
	 */
	EAttribute getCalendar_UntilDateTime();

	/**
	 * Returns the meta object for class '{@link Gtm.ReservationParameters <em>Reservation Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reservation Parameters</em>'.
	 * @see Gtm.ReservationParameters
	 * @generated
	 */
	EClass getReservationParameters();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.ReservationParameters#getReservationParameters <em>Reservation Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reservation Parameters</em>'.
	 * @see Gtm.ReservationParameters#getReservationParameters()
	 * @see #getReservationParameters()
	 * @generated
	 */
	EReference getReservationParameters_ReservationParameters();

	/**
	 * Returns the meta object for class '{@link Gtm.ReservationParameter <em>Reservation Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reservation Parameter</em>'.
	 * @see Gtm.ReservationParameter
	 * @generated
	 */
	EClass getReservationParameter();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ReservationParameter#isMandatoryReservation <em>Mandatory Reservation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mandatory Reservation</em>'.
	 * @see Gtm.ReservationParameter#isMandatoryReservation()
	 * @see #getReservationParameter()
	 * @generated
	 */
	EAttribute getReservationParameter_MandatoryReservation();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ReservationParameter#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Gtm.ReservationParameter#getId()
	 * @see #getReservationParameter()
	 * @generated
	 */
	EAttribute getReservationParameter_Id();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.ReservationParameter#getParams9181 <em>Params9181</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Params9181</em>'.
	 * @see Gtm.ReservationParameter#getParams9181()
	 * @see #getReservationParameter()
	 * @generated
	 */
	EReference getReservationParameter_Params9181();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.ReservationParameter#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Options</em>'.
	 * @see Gtm.ReservationParameter#getOptions()
	 * @see #getReservationParameter()
	 * @generated
	 */
	EReference getReservationParameter_Options();

	/**
	 * Returns the meta object for the reference list '{@link Gtm.ReservationParameter#getMandatoryReservationForBrands <em>Mandatory Reservation For Brands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mandatory Reservation For Brands</em>'.
	 * @see Gtm.ReservationParameter#getMandatoryReservationForBrands()
	 * @see #getReservationParameter()
	 * @generated
	 */
	EReference getReservationParameter_MandatoryReservationForBrands();

	/**
	 * Returns the meta object for the attribute list '{@link Gtm.ReservationParameter#getMandatoryReservationsForMode <em>Mandatory Reservations For Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mandatory Reservations For Mode</em>'.
	 * @see Gtm.ReservationParameter#getMandatoryReservationsForMode()
	 * @see #getReservationParameter()
	 * @generated
	 */
	EAttribute getReservationParameter_MandatoryReservationsForMode();

	/**
	 * Returns the meta object for class '{@link Gtm.ReservationParams9181 <em>Reservation Params9181</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reservation Params9181</em>'.
	 * @see Gtm.ReservationParams9181
	 * @generated
	 */
	EClass getReservationParams9181();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ReservationParams9181#getTravelClass <em>Travel Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Travel Class</em>'.
	 * @see Gtm.ReservationParams9181#getTravelClass()
	 * @see #getReservationParams9181()
	 * @generated
	 */
	EAttribute getReservationParams9181_TravelClass();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ReservationParams9181#getServiceLevel <em>Service Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Level</em>'.
	 * @see Gtm.ReservationParams9181#getServiceLevel()
	 * @see #getReservationParams9181()
	 * @generated
	 */
	EAttribute getReservationParams9181_ServiceLevel();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ReservationParams9181#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service</em>'.
	 * @see Gtm.ReservationParams9181#getService()
	 * @see #getReservationParams9181()
	 * @generated
	 */
	EAttribute getReservationParams9181_Service();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ReservationParams9181#getBerthType <em>Berth Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Berth Type</em>'.
	 * @see Gtm.ReservationParams9181#getBerthType()
	 * @see #getReservationParams9181()
	 * @generated
	 */
	EAttribute getReservationParams9181_BerthType();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ReservationParams9181#getCoachType <em>Coach Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coach Type</em>'.
	 * @see Gtm.ReservationParams9181#getCoachType()
	 * @see #getReservationParams9181()
	 * @generated
	 */
	EAttribute getReservationParams9181_CoachType();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ReservationParams9181#getCompartmentType <em>Compartment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compartment Type</em>'.
	 * @see Gtm.ReservationParams9181#getCompartmentType()
	 * @see #getReservationParams9181()
	 * @generated
	 */
	EAttribute getReservationParams9181_CompartmentType();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ReservationParams9181#getTariff <em>Tariff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tariff</em>'.
	 * @see Gtm.ReservationParams9181#getTariff()
	 * @see #getReservationParams9181()
	 * @generated
	 */
	EAttribute getReservationParams9181_Tariff();

	/**
	 * Returns the meta object for class '{@link Gtm.ReservationOptions <em>Reservation Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reservation Options</em>'.
	 * @see Gtm.ReservationOptions
	 * @generated
	 */
	EClass getReservationOptions();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.ReservationOptions#getPreferences <em>Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Preferences</em>'.
	 * @see Gtm.ReservationOptions#getPreferences()
	 * @see #getReservationOptions()
	 * @generated
	 */
	EReference getReservationOptions_Preferences();

	/**
	 * Returns the meta object for the reference list '{@link Gtm.ReservationOptions#getServiceBrands <em>Service Brands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Service Brands</em>'.
	 * @see Gtm.ReservationOptions#getServiceBrands()
	 * @see #getReservationOptions()
	 * @generated
	 */
	EReference getReservationOptions_ServiceBrands();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ReservationOptions#getGraphicalReservation <em>Graphical Reservation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Graphical Reservation</em>'.
	 * @see Gtm.ReservationOptions#getGraphicalReservation()
	 * @see #getReservationOptions()
	 * @generated
	 */
	EAttribute getReservationOptions_GraphicalReservation();

	/**
	 * Returns the meta object for class '{@link Gtm.ReservationPreferenceGroup <em>Reservation Preference Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reservation Preference Group</em>'.
	 * @see Gtm.ReservationPreferenceGroup
	 * @generated
	 */
	EClass getReservationPreferenceGroup();

	/**
	 * Returns the meta object for the attribute list '{@link Gtm.ReservationPreferenceGroup#getPreference <em>Preference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Preference</em>'.
	 * @see Gtm.ReservationPreferenceGroup#getPreference()
	 * @see #getReservationPreferenceGroup()
	 * @generated
	 */
	EAttribute getReservationPreferenceGroup_Preference();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ReservationPreferenceGroup#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group</em>'.
	 * @see Gtm.ReservationPreferenceGroup#getGroup()
	 * @see #getReservationPreferenceGroup()
	 * @generated
	 */
	EAttribute getReservationPreferenceGroup_Group();

	/**
	 * Returns the meta object for class '{@link Gtm.ServiceClass <em>Service Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Class</em>'.
	 * @see Gtm.ServiceClass
	 * @generated
	 */
	EClass getServiceClass();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ServiceClass#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Gtm.ServiceClass#getId()
	 * @see #getServiceClass()
	 * @generated
	 */
	EAttribute getServiceClass_Id();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ServiceClass#getClassicClass <em>Classic Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classic Class</em>'.
	 * @see Gtm.ServiceClass#getClassicClass()
	 * @see #getServiceClass()
	 * @generated
	 */
	EAttribute getServiceClass_ClassicClass();

	/**
	 * Returns the meta object for the reference '{@link Gtm.ServiceClass#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Text</em>'.
	 * @see Gtm.ServiceClass#getText()
	 * @see #getServiceClass()
	 * @generated
	 */
	EReference getServiceClass_Text();

	/**
	 * Returns the meta object for class '{@link Gtm.ServiceLevel <em>Service Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Level</em>'.
	 * @see Gtm.ServiceLevel
	 * @generated
	 */
	EClass getServiceLevel();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ServiceLevel#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Gtm.ServiceLevel#getId()
	 * @see #getServiceLevel()
	 * @generated
	 */
	EAttribute getServiceLevel_Id();

	/**
	 * Returns the meta object for the reference '{@link Gtm.ServiceLevel#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Text</em>'.
	 * @see Gtm.ServiceLevel#getText()
	 * @see #getServiceLevel()
	 * @generated
	 */
	EReference getServiceLevel_Text();

	/**
	 * Returns the meta object for the reference list '{@link Gtm.ServiceLevel#getCombiningServiceClasses <em>Combining Service Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Combining Service Classes</em>'.
	 * @see Gtm.ServiceLevel#getCombiningServiceClasses()
	 * @see #getServiceLevel()
	 * @generated
	 */
	EReference getServiceLevel_CombiningServiceClasses();

	/**
	 * Returns the meta object for the reference '{@link Gtm.ServiceLevel#getReservationParameter <em>Reservation Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reservation Parameter</em>'.
	 * @see Gtm.ServiceLevel#getReservationParameter()
	 * @see #getServiceLevel()
	 * @generated
	 */
	EReference getServiceLevel_ReservationParameter();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ServiceLevel#isIncludesClassName <em>Includes Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Includes Class Name</em>'.
	 * @see Gtm.ServiceLevel#isIncludesClassName()
	 * @see #getServiceLevel()
	 * @generated
	 */
	EAttribute getServiceLevel_IncludesClassName();

	/**
	 * Returns the meta object for class '{@link Gtm.TimeRange <em>Time Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Range</em>'.
	 * @see Gtm.TimeRange
	 * @generated
	 */
	EClass getTimeRange();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.TimeRange#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see Gtm.TimeRange#getScope()
	 * @see #getTimeRange()
	 * @generated
	 */
	EAttribute getTimeRange_Scope();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.TimeRange#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see Gtm.TimeRange#getFrom()
	 * @see #getTimeRange()
	 * @generated
	 */
	EAttribute getTimeRange_From();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.TimeRange#getUntil <em>Until</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Until</em>'.
	 * @see Gtm.TimeRange#getUntil()
	 * @see #getTimeRange()
	 * @generated
	 */
	EAttribute getTimeRange_Until();

	/**
	 * Returns the meta object for class '{@link Gtm.ExcludedTimeRange <em>Excluded Time Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Excluded Time Range</em>'.
	 * @see Gtm.ExcludedTimeRange
	 * @generated
	 */
	EClass getExcludedTimeRange();

	/**
	 * Returns the meta object for class '{@link Gtm.ValidityRange <em>Validity Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Validity Range</em>'.
	 * @see Gtm.ValidityRange
	 * @generated
	 */
	EClass getValidityRange();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ValidityRange#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see Gtm.ValidityRange#getUnit()
	 * @see #getValidityRange()
	 * @generated
	 */
	EAttribute getValidityRange_Unit();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ValidityRange#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see Gtm.ValidityRange#getValue()
	 * @see #getValidityRange()
	 * @generated
	 */
	EAttribute getValidityRange_Value();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ValidityRange#getHoursAfterMidnight <em>Hours After Midnight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hours After Midnight</em>'.
	 * @see Gtm.ValidityRange#getHoursAfterMidnight()
	 * @see #getValidityRange()
	 * @generated
	 */
	EAttribute getValidityRange_HoursAfterMidnight();

	/**
	 * Returns the meta object for class '{@link Gtm.RelativeTime <em>Relative Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relative Time</em>'.
	 * @see Gtm.RelativeTime
	 * @generated
	 */
	EClass getRelativeTime();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.RelativeTime#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see Gtm.RelativeTime#getUnit()
	 * @see #getRelativeTime()
	 * @generated
	 */
	EAttribute getRelativeTime_Unit();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.RelativeTime#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see Gtm.RelativeTime#getReference()
	 * @see #getRelativeTime()
	 * @generated
	 */
	EAttribute getRelativeTime_Reference();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.RelativeTime#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see Gtm.RelativeTime#getValue()
	 * @see #getRelativeTime()
	 * @generated
	 */
	EAttribute getRelativeTime_Value();

	/**
	 * Returns the meta object for class '{@link Gtm.ReturnValidityConstraint <em>Return Validity Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Validity Constraint</em>'.
	 * @see Gtm.ReturnValidityConstraint
	 * @generated
	 */
	EClass getReturnValidityConstraint();

	/**
	 * Returns the meta object for the attribute list '{@link Gtm.ReturnValidityConstraint#getExcludedWeekdays <em>Excluded Weekdays</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Excluded Weekdays</em>'.
	 * @see Gtm.ReturnValidityConstraint#getExcludedWeekdays()
	 * @see #getReturnValidityConstraint()
	 * @generated
	 */
	EAttribute getReturnValidityConstraint_ExcludedWeekdays();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ReturnValidityConstraint#getLatestReturn <em>Latest Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latest Return</em>'.
	 * @see Gtm.ReturnValidityConstraint#getLatestReturn()
	 * @see #getReturnValidityConstraint()
	 * @generated
	 */
	EAttribute getReturnValidityConstraint_LatestReturn();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ReturnValidityConstraint#getEarliestReturn <em>Earliest Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Earliest Return</em>'.
	 * @see Gtm.ReturnValidityConstraint#getEarliestReturn()
	 * @see #getReturnValidityConstraint()
	 * @generated
	 */
	EAttribute getReturnValidityConstraint_EarliestReturn();

	/**
	 * Returns the meta object for class '{@link Gtm.TripAllocationConstraint <em>Trip Allocation Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trip Allocation Constraint</em>'.
	 * @see Gtm.TripAllocationConstraint
	 * @generated
	 */
	EClass getTripAllocationConstraint();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.TripAllocationConstraint#getAllocationUnit <em>Allocation Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allocation Unit</em>'.
	 * @see Gtm.TripAllocationConstraint#getAllocationUnit()
	 * @see #getTripAllocationConstraint()
	 * @generated
	 */
	EAttribute getTripAllocationConstraint_AllocationUnit();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.TripAllocationConstraint#getMaxUnits <em>Max Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Units</em>'.
	 * @see Gtm.TripAllocationConstraint#getMaxUnits()
	 * @see #getTripAllocationConstraint()
	 * @generated
	 */
	EAttribute getTripAllocationConstraint_MaxUnits();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.TripAllocationConstraint#getDurationUnit <em>Duration Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration Unit</em>'.
	 * @see Gtm.TripAllocationConstraint#getDurationUnit()
	 * @see #getTripAllocationConstraint()
	 * @generated
	 */
	EAttribute getTripAllocationConstraint_DurationUnit();

	/**
	 * Returns the meta object for the attribute list '{@link Gtm.TripAllocationConstraint#getRequiredProcesses <em>Required Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Required Processes</em>'.
	 * @see Gtm.TripAllocationConstraint#getRequiredProcesses()
	 * @see #getTripAllocationConstraint()
	 * @generated
	 */
	EAttribute getTripAllocationConstraint_RequiredProcesses();

	/**
	 * Returns the meta object for class '{@link Gtm.TripInterruptionConstraint <em>Trip Interruption Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trip Interruption Constraint</em>'.
	 * @see Gtm.TripInterruptionConstraint
	 * @generated
	 */
	EClass getTripInterruptionConstraint();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.TripInterruptionConstraint#getMaxInterruptions <em>Max Interruptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Interruptions</em>'.
	 * @see Gtm.TripInterruptionConstraint#getMaxInterruptions()
	 * @see #getTripInterruptionConstraint()
	 * @generated
	 */
	EAttribute getTripInterruptionConstraint_MaxInterruptions();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.TripInterruptionConstraint#getMaxDuration <em>Max Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Duration</em>'.
	 * @see Gtm.TripInterruptionConstraint#getMaxDuration()
	 * @see #getTripInterruptionConstraint()
	 * @generated
	 */
	EAttribute getTripInterruptionConstraint_MaxDuration();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.TripInterruptionConstraint#getTotalMaxDuration <em>Total Max Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Max Duration</em>'.
	 * @see Gtm.TripInterruptionConstraint#getTotalMaxDuration()
	 * @see #getTripInterruptionConstraint()
	 * @generated
	 */
	EAttribute getTripInterruptionConstraint_TotalMaxDuration();

	/**
	 * Returns the meta object for the attribute list '{@link Gtm.TripInterruptionConstraint#getRequiredProcesses <em>Required Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Required Processes</em>'.
	 * @see Gtm.TripInterruptionConstraint#getRequiredProcesses()
	 * @see #getTripInterruptionConstraint()
	 * @generated
	 */
	EAttribute getTripInterruptionConstraint_RequiredProcesses();

	/**
	 * Returns the meta object for class '{@link Gtm.ViaStation <em>Via Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Via Station</em>'.
	 * @see Gtm.ViaStation
	 * @generated
	 */
	EClass getViaStation();

	/**
	 * Returns the meta object for the reference '{@link Gtm.ViaStation#getStation <em>Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Station</em>'.
	 * @see Gtm.ViaStation#getStation()
	 * @see #getViaStation()
	 * @generated
	 */
	EReference getViaStation_Station();

	/**
	 * Returns the meta object for the reference '{@link Gtm.ViaStation#getCarrierConstraint <em>Carrier Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Carrier Constraint</em>'.
	 * @see Gtm.ViaStation#getCarrierConstraint()
	 * @see #getViaStation()
	 * @generated
	 */
	EReference getViaStation_CarrierConstraint();

	/**
	 * Returns the meta object for the reference '{@link Gtm.ViaStation#getCarrier <em>Carrier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Carrier</em>'.
	 * @see Gtm.ViaStation#getCarrier()
	 * @see #getViaStation()
	 * @generated
	 */
	EReference getViaStation_Carrier();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.ViaStation#getRoute <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Route</em>'.
	 * @see Gtm.ViaStation#getRoute()
	 * @see #getViaStation()
	 * @generated
	 */
	EReference getViaStation_Route();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.ViaStation#getAlternativeRoutes <em>Alternative Routes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alternative Routes</em>'.
	 * @see Gtm.ViaStation#getAlternativeRoutes()
	 * @see #getViaStation()
	 * @generated
	 */
	EReference getViaStation_AlternativeRoutes();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ViaStation#getDataDescription <em>Data Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Description</em>'.
	 * @see Gtm.ViaStation#getDataDescription()
	 * @see #getViaStation()
	 * @generated
	 */
	EAttribute getViaStation_DataDescription();

	/**
	 * Returns the meta object for the reference '{@link Gtm.ViaStation#getFareStationSet <em>Fare Station Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fare Station Set</em>'.
	 * @see Gtm.ViaStation#getFareStationSet()
	 * @see #getViaStation()
	 * @generated
	 */
	EReference getViaStation_FareStationSet();

	/**
	 * Returns the meta object for the reference '{@link Gtm.ViaStation#getServiceConstraint <em>Service Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Constraint</em>'.
	 * @see Gtm.ViaStation#getServiceConstraint()
	 * @see #getViaStation()
	 * @generated
	 */
	EReference getViaStation_ServiceConstraint();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ViaStation#isTechnicalViaOnly <em>Technical Via Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Technical Via Only</em>'.
	 * @see Gtm.ViaStation#isTechnicalViaOnly()
	 * @see #getViaStation()
	 * @generated
	 */
	EAttribute getViaStation_TechnicalViaOnly();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ViaStation#isRealStop <em>Real Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Real Stop</em>'.
	 * @see Gtm.ViaStation#isRealStop()
	 * @see #getViaStation()
	 * @generated
	 */
	EAttribute getViaStation_RealStop();

	/**
	 * Returns the meta object for the '{@link Gtm.ViaStation#getDescription() <em>Get Description</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Description</em>' operation.
	 * @see Gtm.ViaStation#getDescription()
	 * @generated
	 */
	EOperation getViaStation__GetDescription();

	/**
	 * Returns the meta object for class '{@link Gtm.AlternativeRoute <em>Alternative Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alternative Route</em>'.
	 * @see Gtm.AlternativeRoute
	 * @generated
	 */
	EClass getAlternativeRoute();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.AlternativeRoute#getStations <em>Stations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stations</em>'.
	 * @see Gtm.AlternativeRoute#getStations()
	 * @see #getAlternativeRoute()
	 * @generated
	 */
	EReference getAlternativeRoute_Stations();

	/**
	 * Returns the meta object for class '{@link Gtm.Route <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route</em>'.
	 * @see Gtm.Route
	 * @generated
	 */
	EClass getRoute();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.Route#getStations <em>Stations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stations</em>'.
	 * @see Gtm.Route#getStations()
	 * @see #getRoute()
	 * @generated
	 */
	EReference getRoute_Stations();

	/**
	 * Returns the meta object for class '{@link Gtm.Zone <em>Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zone</em>'.
	 * @see Gtm.Zone
	 * @generated
	 */
	EClass getZone();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Zone#getBinaryZoneId <em>Binary Zone Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binary Zone Id</em>'.
	 * @see Gtm.Zone#getBinaryZoneId()
	 * @see #getZone()
	 * @generated
	 */
	EAttribute getZone_BinaryZoneId();

	/**
	 * Returns the meta object for the attribute list '{@link Gtm.Zone#getZoneId <em>Zone Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Zone Id</em>'.
	 * @see Gtm.Zone#getZoneId()
	 * @see #getZone()
	 * @generated
	 */
	EAttribute getZone_ZoneId();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Zone#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see Gtm.Zone#getCity()
	 * @see #getZone()
	 * @generated
	 */
	EAttribute getZone_City();

	/**
	 * Returns the meta object for the reference '{@link Gtm.Zone#getCarrier <em>Carrier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Carrier</em>'.
	 * @see Gtm.Zone#getCarrier()
	 * @see #getZone()
	 * @generated
	 */
	EReference getZone_Carrier();

	/**
	 * Returns the meta object for the reference '{@link Gtm.Zone#getEntryStation <em>Entry Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entry Station</em>'.
	 * @see Gtm.Zone#getEntryStation()
	 * @see #getZone()
	 * @generated
	 */
	EReference getZone_EntryStation();

	/**
	 * Returns the meta object for the reference '{@link Gtm.Zone#getTerminalStation <em>Terminal Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Terminal Station</em>'.
	 * @see Gtm.Zone#getTerminalStation()
	 * @see #getZone()
	 * @generated
	 */
	EReference getZone_TerminalStation();

	/**
	 * Returns the meta object for the reference '{@link Gtm.Zone#getNutsCode <em>Nuts Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Nuts Code</em>'.
	 * @see Gtm.Zone#getNutsCode()
	 * @see #getZone()
	 * @generated
	 */
	EReference getZone_NutsCode();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Zone#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Gtm.Zone#getName()
	 * @see #getZone()
	 * @generated
	 */
	EAttribute getZone_Name();

	/**
	 * Returns the meta object for class '{@link Gtm.Line <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line</em>'.
	 * @see Gtm.Line
	 * @generated
	 */
	EClass getLine();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Line#getBinaryZoneId <em>Binary Zone Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binary Zone Id</em>'.
	 * @see Gtm.Line#getBinaryZoneId()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_BinaryZoneId();

	/**
	 * Returns the meta object for the attribute list '{@link Gtm.Line#getLineId <em>Line Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Line Id</em>'.
	 * @see Gtm.Line#getLineId()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_LineId();

	/**
	 * Returns the meta object for the reference '{@link Gtm.Line#getCarrier <em>Carrier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Carrier</em>'.
	 * @see Gtm.Line#getCarrier()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_Carrier();

	/**
	 * Returns the meta object for the reference '{@link Gtm.Line#getEntryStation <em>Entry Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entry Station</em>'.
	 * @see Gtm.Line#getEntryStation()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_EntryStation();

	/**
	 * Returns the meta object for the reference '{@link Gtm.Line#getTerminalStation <em>Terminal Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Terminal Station</em>'.
	 * @see Gtm.Line#getTerminalStation()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_TerminalStation();

	/**
	 * Returns the meta object for the reference '{@link Gtm.Line#getNutsCode <em>Nuts Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Nuts Code</em>'.
	 * @see Gtm.Line#getNutsCode()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_NutsCode();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Line#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see Gtm.Line#getCity()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_City();

	/**
	 * Returns the meta object for class '{@link Gtm.Polygone <em>Polygone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polygone</em>'.
	 * @see Gtm.Polygone
	 * @generated
	 */
	EClass getPolygone();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.Polygone#getEdge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Edge</em>'.
	 * @see Gtm.Polygone#getEdge()
	 * @see #getPolygone()
	 * @generated
	 */
	EReference getPolygone_Edge();

	/**
	 * Returns the meta object for class '{@link Gtm.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see Gtm.Edge
	 * @generated
	 */
	EClass getEdge();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Edge#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System</em>'.
	 * @see Gtm.Edge#getSystem()
	 * @see #getEdge()
	 * @generated
	 */
	EAttribute getEdge_System();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Edge#getAccuracy <em>Accuracy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accuracy</em>'.
	 * @see Gtm.Edge#getAccuracy()
	 * @see #getEdge()
	 * @generated
	 */
	EAttribute getEdge_Accuracy();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Edge#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longitude</em>'.
	 * @see Gtm.Edge#getLongitude()
	 * @see #getEdge()
	 * @generated
	 */
	EAttribute getEdge_Longitude();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Edge#getLatitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latitude</em>'.
	 * @see Gtm.Edge#getLatitude()
	 * @see #getEdge()
	 * @generated
	 */
	EAttribute getEdge_Latitude();

	/**
	 * Returns the meta object for class '{@link Gtm.ZoneDefinitions <em>Zone Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zone Definitions</em>'.
	 * @see Gtm.ZoneDefinitions
	 * @generated
	 */
	EClass getZoneDefinitions();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.ZoneDefinitions#getZoneDefinition <em>Zone Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Zone Definition</em>'.
	 * @see Gtm.ZoneDefinitions#getZoneDefinition()
	 * @see #getZoneDefinitions()
	 * @generated
	 */
	EReference getZoneDefinitions_ZoneDefinition();

	/**
	 * Returns the meta object for class '{@link Gtm.ZoneDefinition <em>Zone Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zone Definition</em>'.
	 * @see Gtm.ZoneDefinition
	 * @generated
	 */
	EClass getZoneDefinition();

	/**
	 * Returns the meta object for the reference '{@link Gtm.ZoneDefinition#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provider</em>'.
	 * @see Gtm.ZoneDefinition#getProvider()
	 * @see #getZoneDefinition()
	 * @generated
	 */
	EReference getZoneDefinition_Provider();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ZoneDefinition#getZoneId <em>Zone Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zone Id</em>'.
	 * @see Gtm.ZoneDefinition#getZoneId()
	 * @see #getZoneDefinition()
	 * @generated
	 */
	EAttribute getZoneDefinition_ZoneId();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ZoneDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Gtm.ZoneDefinition#getName()
	 * @see #getZoneDefinition()
	 * @generated
	 */
	EAttribute getZoneDefinition_Name();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.ZoneDefinition#getPolygone <em>Polygone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Polygone</em>'.
	 * @see Gtm.ZoneDefinition#getPolygone()
	 * @see #getZoneDefinition()
	 * @generated
	 */
	EReference getZoneDefinition_Polygone();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ZoneDefinition#getNameUtf8 <em>Name Utf8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Utf8</em>'.
	 * @see Gtm.ZoneDefinition#getNameUtf8()
	 * @see #getZoneDefinition()
	 * @generated
	 */
	EAttribute getZoneDefinition_NameUtf8();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.ZoneDefinition#getStationSet <em>Station Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Station Set</em>'.
	 * @see Gtm.ZoneDefinition#getStationSet()
	 * @see #getZoneDefinition()
	 * @generated
	 */
	EReference getZoneDefinition_StationSet();

	/**
	 * Returns the meta object for the reference list '{@link Gtm.ZoneDefinition#getNutsCodes <em>Nuts Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Nuts Codes</em>'.
	 * @see Gtm.ZoneDefinition#getNutsCodes()
	 * @see #getZoneDefinition()
	 * @generated
	 */
	EReference getZoneDefinition_NutsCodes();

	/**
	 * Returns the meta object for class '{@link Gtm.CarrierResourceLocation <em>Carrier Resource Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Carrier Resource Location</em>'.
	 * @see Gtm.CarrierResourceLocation
	 * @generated
	 */
	EClass getCarrierResourceLocation();

	/**
	 * Returns the meta object for the reference '{@link Gtm.CarrierResourceLocation#getCarrier <em>Carrier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Carrier</em>'.
	 * @see Gtm.CarrierResourceLocation#getCarrier()
	 * @see #getCarrierResourceLocation()
	 * @generated
	 */
	EReference getCarrierResourceLocation_Carrier();

	/**
	 * Returns the meta object for the reference '{@link Gtm.CarrierResourceLocation#getServiceBrand <em>Service Brand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Brand</em>'.
	 * @see Gtm.CarrierResourceLocation#getServiceBrand()
	 * @see #getCarrierResourceLocation()
	 * @generated
	 */
	EReference getCarrierResourceLocation_ServiceBrand();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.CarrierResourceLocation#getOnlineResources <em>Online Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Online Resources</em>'.
	 * @see Gtm.CarrierResourceLocation#getOnlineResources()
	 * @see #getCarrierResourceLocation()
	 * @generated
	 */
	EReference getCarrierResourceLocation_OnlineResources();

	/**
	 * Returns the meta object for class '{@link Gtm.CrossBorderCondition <em>Cross Border Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cross Border Condition</em>'.
	 * @see Gtm.CrossBorderCondition
	 * @generated
	 */
	EClass getCrossBorderCondition();

	/**
	 * Returns the meta object for the reference '{@link Gtm.CrossBorderCondition#getFromCountry <em>From Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Country</em>'.
	 * @see Gtm.CrossBorderCondition#getFromCountry()
	 * @see #getCrossBorderCondition()
	 * @generated
	 */
	EReference getCrossBorderCondition_FromCountry();

	/**
	 * Returns the meta object for the reference '{@link Gtm.CrossBorderCondition#getToCountry <em>To Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Country</em>'.
	 * @see Gtm.CrossBorderCondition#getToCountry()
	 * @see #getCrossBorderCondition()
	 * @generated
	 */
	EReference getCrossBorderCondition_ToCountry();

	/**
	 * Returns the meta object for the reference list '{@link Gtm.CrossBorderCondition#getAffectedServiceBrands <em>Affected Service Brands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Affected Service Brands</em>'.
	 * @see Gtm.CrossBorderCondition#getAffectedServiceBrands()
	 * @see #getCrossBorderCondition()
	 * @generated
	 */
	EReference getCrossBorderCondition_AffectedServiceBrands();

	/**
	 * Returns the meta object for class '{@link Gtm.FareCombinationModel <em>Fare Combination Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fare Combination Model</em>'.
	 * @see Gtm.FareCombinationModel
	 * @generated
	 */
	EClass getFareCombinationModel();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.FareCombinationModel#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model</em>'.
	 * @see Gtm.FareCombinationModel#getModel()
	 * @see #getFareCombinationModel()
	 * @generated
	 */
	EAttribute getFareCombinationModel_Model();

	/**
	 * Returns the meta object for the reference list '{@link Gtm.FareCombinationModel#getCombinableCarriers <em>Combinable Carriers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Combinable Carriers</em>'.
	 * @see Gtm.FareCombinationModel#getCombinableCarriers()
	 * @see #getFareCombinationModel()
	 * @generated
	 */
	EReference getFareCombinationModel_CombinableCarriers();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.FareCombinationModel#isOnlyWhenCombined <em>Only When Combined</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Only When Combined</em>'.
	 * @see Gtm.FareCombinationModel#isOnlyWhenCombined()
	 * @see #getFareCombinationModel()
	 * @generated
	 */
	EAttribute getFareCombinationModel_OnlyWhenCombined();

	/**
	 * Returns the meta object for the reference list '{@link Gtm.FareCombinationModel#getAllowedAllocators <em>Allowed Allocators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allowed Allocators</em>'.
	 * @see Gtm.FareCombinationModel#getAllowedAllocators()
	 * @see #getFareCombinationModel()
	 * @generated
	 */
	EReference getFareCombinationModel_AllowedAllocators();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.FareCombinationModel#getReferenceCluster <em>Reference Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Cluster</em>'.
	 * @see Gtm.FareCombinationModel#getReferenceCluster()
	 * @see #getFareCombinationModel()
	 * @generated
	 */
	EAttribute getFareCombinationModel_ReferenceCluster();

	/**
	 * Returns the meta object for the attribute list '{@link Gtm.FareCombinationModel#getAllowedClusters <em>Allowed Clusters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Allowed Clusters</em>'.
	 * @see Gtm.FareCombinationModel#getAllowedClusters()
	 * @see #getFareCombinationModel()
	 * @generated
	 */
	EAttribute getFareCombinationModel_AllowedClusters();

	/**
	 * Returns the meta object for the reference list '{@link Gtm.FareCombinationModel#getAllowedCommonContracts <em>Allowed Common Contracts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allowed Common Contracts</em>'.
	 * @see Gtm.FareCombinationModel#getAllowedCommonContracts()
	 * @see #getFareCombinationModel()
	 * @generated
	 */
	EReference getFareCombinationModel_AllowedCommonContracts();

	/**
	 * Returns the meta object for class '{@link Gtm.Products <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Products</em>'.
	 * @see Gtm.Products
	 * @generated
	 */
	EClass getProducts();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.Products#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Products</em>'.
	 * @see Gtm.Products#getProducts()
	 * @see #getProducts()
	 * @generated
	 */
	EReference getProducts_Products();

	/**
	 * Returns the meta object for class '{@link Gtm.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see Gtm.Product
	 * @generated
	 */
	EClass getProduct();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Product#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Source</em>'.
	 * @see Gtm.Product#getDataSource()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_DataSource();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Product#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Gtm.Product#getId()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Id();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Product#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see Gtm.Product#getCode()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Code();

	/**
	 * Returns the meta object for the reference '{@link Gtm.Product#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Name</em>'.
	 * @see Gtm.Product#getName()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_Name();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Product#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see Gtm.Product#getType()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Type();

	/**
	 * Returns the meta object for the reference '{@link Gtm.Product#getSummary <em>Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Summary</em>'.
	 * @see Gtm.Product#getSummary()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_Summary();

	/**
	 * Returns the meta object for the reference '{@link Gtm.Product#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Description</em>'.
	 * @see Gtm.Product#getDescription()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_Description();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Product#getTravelClass <em>Travel Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Travel Class</em>'.
	 * @see Gtm.Product#getTravelClass()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_TravelClass();

	/**
	 * Returns the meta object for the reference '{@link Gtm.Product#getServiceConstraintText <em>Service Constraint Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Constraint Text</em>'.
	 * @see Gtm.Product#getServiceConstraintText()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_ServiceConstraintText();

	/**
	 * Returns the meta object for the reference '{@link Gtm.Product#getCarrierConstraintText <em>Carrier Constraint Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Carrier Constraint Text</em>'.
	 * @see Gtm.Product#getCarrierConstraintText()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_CarrierConstraintText();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.Product#getConditionTexts <em>Condition Texts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Condition Texts</em>'.
	 * @see Gtm.Product#getConditionTexts()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_ConditionTexts();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Product#getReturnProduct <em>Return Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Product</em>'.
	 * @see Gtm.Product#getReturnProduct()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_ReturnProduct();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Product#getTrainBound <em>Train Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Train Bound</em>'.
	 * @see Gtm.Product#getTrainBound()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_TrainBound();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Product#getRefundableAfterValidity <em>Refundable After Validity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refundable After Validity</em>'.
	 * @see Gtm.Product#getRefundableAfterValidity()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_RefundableAfterValidity();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Product#getRefundableBeforeValidity <em>Refundable Before Validity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refundable Before Validity</em>'.
	 * @see Gtm.Product#getRefundableBeforeValidity()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_RefundableBeforeValidity();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Product#getExchangeableAfterValidity <em>Exchangeable After Validity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exchangeable After Validity</em>'.
	 * @see Gtm.Product#getExchangeableAfterValidity()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_ExchangeableAfterValidity();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Product#getExchangeableBeforeValidity <em>Exchangeable Before Validity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exchangeable Before Validity</em>'.
	 * @see Gtm.Product#getExchangeableBeforeValidity()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_ExchangeableBeforeValidity();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Product#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see Gtm.Product#getType()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Type();

	/**
	 * Returns the meta object for class '{@link Gtm.ConditionText <em>Condition Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Text</em>'.
	 * @see Gtm.ConditionText
	 * @generated
	 */
	EClass getConditionText();

	/**
	 * Returns the meta object for the reference '{@link Gtm.ConditionText#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Text</em>'.
	 * @see Gtm.ConditionText#getText()
	 * @see #getConditionText()
	 * @generated
	 */
	EReference getConditionText_Text();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ConditionText#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see Gtm.ConditionText#getType()
	 * @see #getConditionText()
	 * @generated
	 */
	EAttribute getConditionText_Type();

	/**
	 * Returns the meta object for class '{@link Gtm.ReductionConstraint <em>Reduction Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reduction Constraint</em>'.
	 * @see Gtm.ReductionConstraint
	 * @generated
	 */
	EClass getReductionConstraint();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ReductionConstraint#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Gtm.ReductionConstraint#getId()
	 * @see #getReductionConstraint()
	 * @generated
	 */
	EAttribute getReductionConstraint_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.ReductionConstraint#getRequiredReductionCards <em>Required Reduction Cards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Required Reduction Cards</em>'.
	 * @see Gtm.ReductionConstraint#getRequiredReductionCards()
	 * @see #getReductionConstraint()
	 * @generated
	 */
	EReference getReductionConstraint_RequiredReductionCards();

	/**
	 * Returns the meta object for class '{@link Gtm.RequiredReductionCard <em>Required Reduction Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Reduction Card</em>'.
	 * @see Gtm.RequiredReductionCard
	 * @generated
	 */
	EClass getRequiredReductionCard();

	/**
	 * Returns the meta object for the reference '{@link Gtm.RequiredReductionCard#getCardClass <em>Card Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Card Class</em>'.
	 * @see Gtm.RequiredReductionCard#getCardClass()
	 * @see #getRequiredReductionCard()
	 * @generated
	 */
	EReference getRequiredReductionCard_CardClass();

	/**
	 * Returns the meta object for the reference '{@link Gtm.RequiredReductionCard#getCard <em>Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Card</em>'.
	 * @see Gtm.RequiredReductionCard#getCard()
	 * @see #getRequiredReductionCard()
	 * @generated
	 */
	EReference getRequiredReductionCard_Card();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.RequiredReductionCard#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Gtm.RequiredReductionCard#getName()
	 * @see #getRequiredReductionCard()
	 * @generated
	 */
	EAttribute getRequiredReductionCard_Name();

	/**
	 * Returns the meta object for class '{@link Gtm.LuggageConstraints <em>Luggage Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Luggage Constraints</em>'.
	 * @see Gtm.LuggageConstraints
	 * @generated
	 */
	EClass getLuggageConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.LuggageConstraints#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see Gtm.LuggageConstraints#getConstraints()
	 * @see #getLuggageConstraints()
	 * @generated
	 */
	EReference getLuggageConstraints_Constraints();

	/**
	 * Returns the meta object for class '{@link Gtm.LuggageConstraint <em>Luggage Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Luggage Constraint</em>'.
	 * @see Gtm.LuggageConstraint
	 * @generated
	 */
	EClass getLuggageConstraint();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LuggageConstraint#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Gtm.LuggageConstraint#getId()
	 * @see #getLuggageConstraint()
	 * @generated
	 */
	EAttribute getLuggageConstraint_Id();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LuggageConstraint#getMaxHandLuggage <em>Max Hand Luggage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Hand Luggage</em>'.
	 * @see Gtm.LuggageConstraint#getMaxHandLuggage()
	 * @see #getLuggageConstraint()
	 * @generated
	 */
	EAttribute getLuggageConstraint_MaxHandLuggage();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LuggageConstraint#getMaxLargeLuggage <em>Max Large Luggage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Large Luggage</em>'.
	 * @see Gtm.LuggageConstraint#getMaxLargeLuggage()
	 * @see #getLuggageConstraint()
	 * @generated
	 */
	EAttribute getLuggageConstraint_MaxLargeLuggage();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.LuggageConstraint#getRestrictedItems <em>Restricted Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Restricted Items</em>'.
	 * @see Gtm.LuggageConstraint#getRestrictedItems()
	 * @see #getLuggageConstraint()
	 * @generated
	 */
	EReference getLuggageConstraint_RestrictedItems();

	/**
	 * Returns the meta object for the attribute list '{@link Gtm.LuggageConstraint#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Rules</em>'.
	 * @see Gtm.LuggageConstraint#getRules()
	 * @see #getLuggageConstraint()
	 * @generated
	 */
	EAttribute getLuggageConstraint_Rules();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LuggageConstraint#getDataDescription <em>Data Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Description</em>'.
	 * @see Gtm.LuggageConstraint#getDataDescription()
	 * @see #getLuggageConstraint()
	 * @generated
	 */
	EAttribute getLuggageConstraint_DataDescription();

	/**
	 * Returns the meta object for class '{@link Gtm.LuggageItemsRestriction <em>Luggage Items Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Luggage Items Restriction</em>'.
	 * @see Gtm.LuggageItemsRestriction
	 * @generated
	 */
	EClass getLuggageItemsRestriction();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LuggageItemsRestriction#getNumberOfItems <em>Number Of Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Items</em>'.
	 * @see Gtm.LuggageItemsRestriction#getNumberOfItems()
	 * @see #getLuggageItemsRestriction()
	 * @generated
	 */
	EAttribute getLuggageItemsRestriction_NumberOfItems();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.LuggageItemsRestriction#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dimension</em>'.
	 * @see Gtm.LuggageItemsRestriction#getDimension()
	 * @see #getLuggageItemsRestriction()
	 * @generated
	 */
	EReference getLuggageItemsRestriction_Dimension();

	/**
	 * Returns the meta object for class '{@link Gtm.LuggageDimension <em>Luggage Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Luggage Dimension</em>'.
	 * @see Gtm.LuggageDimension
	 * @generated
	 */
	EClass getLuggageDimension();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LuggageDimension#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see Gtm.LuggageDimension#getValue()
	 * @see #getLuggageDimension()
	 * @generated
	 */
	EAttribute getLuggageDimension_Value();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LuggageDimension#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dimension</em>'.
	 * @see Gtm.LuggageDimension#getDimension()
	 * @see #getLuggageDimension()
	 * @generated
	 */
	EAttribute getLuggageDimension_Dimension();

	/**
	 * Returns the meta object for class '{@link Gtm.ConversionFromLegacy <em>Conversion From Legacy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conversion From Legacy</em>'.
	 * @see Gtm.ConversionFromLegacy
	 * @generated
	 */
	EClass getConversionFromLegacy();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.ConversionFromLegacy#getLegacy108 <em>Legacy108</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Legacy108</em>'.
	 * @see Gtm.ConversionFromLegacy#getLegacy108()
	 * @see #getConversionFromLegacy()
	 * @generated
	 */
	EReference getConversionFromLegacy_Legacy108();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.ConversionFromLegacy#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Params</em>'.
	 * @see Gtm.ConversionFromLegacy#getParams()
	 * @see #getConversionFromLegacy()
	 * @generated
	 */
	EReference getConversionFromLegacy_Params();

	/**
	 * Returns the meta object for class '{@link Gtm.ConversionParams <em>Conversion Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conversion Params</em>'.
	 * @see Gtm.ConversionParams
	 * @generated
	 */
	EClass getConversionParams();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ConversionParams#getTaxId <em>Tax Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Id</em>'.
	 * @see Gtm.ConversionParams#getTaxId()
	 * @see #getConversionParams()
	 * @generated
	 */
	EAttribute getConversionParams_TaxId();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ConversionParams#getVATpercentage <em>VA Tpercentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>VA Tpercentage</em>'.
	 * @see Gtm.ConversionParams#getVATpercentage()
	 * @see #getConversionParams()
	 * @generated
	 */
	EAttribute getConversionParams_VATpercentage();

	/**
	 * Returns the meta object for the reference '{@link Gtm.ConversionParams#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Country</em>'.
	 * @see Gtm.ConversionParams#getCountry()
	 * @see #getConversionParams()
	 * @generated
	 */
	EReference getConversionParams_Country();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.ConversionParams#getLegacyBorderPointMappings <em>Legacy Border Point Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Legacy Border Point Mappings</em>'.
	 * @see Gtm.ConversionParams#getLegacyBorderPointMappings()
	 * @see #getConversionParams()
	 * @generated
	 */
	EReference getConversionParams_LegacyBorderPointMappings();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.ConversionParams#getLegacyStationMappings <em>Legacy Station Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Legacy Station Mappings</em>'.
	 * @see Gtm.ConversionParams#getLegacyStationMappings()
	 * @see #getConversionParams()
	 * @generated
	 */
	EReference getConversionParams_LegacyStationMappings();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.ConversionParams#getLegacyFareTemplates <em>Legacy Fare Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Legacy Fare Templates</em>'.
	 * @see Gtm.ConversionParams#getLegacyFareTemplates()
	 * @see #getConversionParams()
	 * @generated
	 */
	EReference getConversionParams_LegacyFareTemplates();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.ConversionParams#getLegacyFareStationMappings <em>Legacy Fare Station Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Legacy Fare Station Mappings</em>'.
	 * @see Gtm.ConversionParams#getLegacyFareStationMappings()
	 * @see #getConversionParams()
	 * @generated
	 */
	EReference getConversionParams_LegacyFareStationMappings();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.ConversionParams#getLegacyStationToServiceBrandMappings <em>Legacy Station To Service Brand Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Legacy Station To Service Brand Mappings</em>'.
	 * @see Gtm.ConversionParams#getLegacyStationToServiceBrandMappings()
	 * @see #getConversionParams()
	 * @generated
	 */
	EReference getConversionParams_LegacyStationToServiceBrandMappings();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.ConversionParams#getLegacyStationToFareDetailMappings <em>Legacy Station To Fare Detail Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Legacy Station To Fare Detail Mappings</em>'.
	 * @see Gtm.ConversionParams#getLegacyStationToFareDetailMappings()
	 * @see #getConversionParams()
	 * @generated
	 */
	EReference getConversionParams_LegacyStationToFareDetailMappings();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.ConversionParams#getEndOfSale <em>End Of Sale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End Of Sale</em>'.
	 * @see Gtm.ConversionParams#getEndOfSale()
	 * @see #getConversionParams()
	 * @generated
	 */
	EReference getConversionParams_EndOfSale();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.ConversionParams#getStartOfSale <em>Start Of Sale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start Of Sale</em>'.
	 * @see Gtm.ConversionParams#getStartOfSale()
	 * @see #getConversionParams()
	 * @generated
	 */
	EReference getConversionParams_StartOfSale();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ConversionParams#getStationImportFilter <em>Station Import Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Station Import Filter</em>'.
	 * @see Gtm.ConversionParams#getStationImportFilter()
	 * @see #getConversionParams()
	 * @generated
	 */
	EAttribute getConversionParams_StationImportFilter();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ConversionParams#isConvertFareDescriptions <em>Convert Fare Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Convert Fare Descriptions</em>'.
	 * @see Gtm.ConversionParams#isConvertFareDescriptions()
	 * @see #getConversionParams()
	 * @generated
	 */
	EAttribute getConversionParams_ConvertFareDescriptions();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ConversionParams#isConvertServiceConstraints <em>Convert Service Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Convert Service Constraints</em>'.
	 * @see Gtm.ConversionParams#isConvertServiceConstraints()
	 * @see #getConversionParams()
	 * @generated
	 */
	EAttribute getConversionParams_ConvertServiceConstraints();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.ConversionParams#getVatTemplates <em>Vat Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vat Templates</em>'.
	 * @see Gtm.ConversionParams#getVatTemplates()
	 * @see #getConversionParams()
	 * @generated
	 */
	EReference getConversionParams_VatTemplates();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.ConversionParams#getBusFerryMapping <em>Bus Ferry Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bus Ferry Mapping</em>'.
	 * @see Gtm.ConversionParams#getBusFerryMapping()
	 * @see #getConversionParams()
	 * @generated
	 */
	EReference getConversionParams_BusFerryMapping();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ConversionParams#getLegacyBorderIndication <em>Legacy Border Indication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Legacy Border Indication</em>'.
	 * @see Gtm.ConversionParams#getLegacyBorderIndication()
	 * @see #getConversionParams()
	 * @generated
	 */
	EAttribute getConversionParams_LegacyBorderIndication();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.ConversionParams#isRemoveUnusedLegacyStations <em>Remove Unused Legacy Stations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remove Unused Legacy Stations</em>'.
	 * @see Gtm.ConversionParams#isRemoveUnusedLegacyStations()
	 * @see #getConversionParams()
	 * @generated
	 */
	EAttribute getConversionParams_RemoveUnusedLegacyStations();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.ConversionParams#getAddCarrierRules <em>Add Carrier Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Carrier Rules</em>'.
	 * @see Gtm.ConversionParams#getAddCarrierRules()
	 * @see #getConversionParams()
	 * @generated
	 */
	EReference getConversionParams_AddCarrierRules();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.ConversionParams#getNamedCarrierLists <em>Named Carrier Lists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Named Carrier Lists</em>'.
	 * @see Gtm.ConversionParams#getNamedCarrierLists()
	 * @see #getConversionParams()
	 * @generated
	 */
	EReference getConversionParams_NamedCarrierLists();

	/**
	 * Returns the meta object for class '{@link Gtm.NamedCarrierLists <em>Named Carrier Lists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Carrier Lists</em>'.
	 * @see Gtm.NamedCarrierLists
	 * @generated
	 */
	EClass getNamedCarrierLists();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.NamedCarrierLists#getNamedCarrierList <em>Named Carrier List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Named Carrier List</em>'.
	 * @see Gtm.NamedCarrierLists#getNamedCarrierList()
	 * @see #getNamedCarrierLists()
	 * @generated
	 */
	EReference getNamedCarrierLists_NamedCarrierList();

	/**
	 * Returns the meta object for class '{@link Gtm.NamedCarrierList <em>Named Carrier List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Carrier List</em>'.
	 * @see Gtm.NamedCarrierList
	 * @generated
	 */
	EClass getNamedCarrierList();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.NamedCarrierList#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Gtm.NamedCarrierList#getName()
	 * @see #getNamedCarrierList()
	 * @generated
	 */
	EAttribute getNamedCarrierList_Name();

	/**
	 * Returns the meta object for the reference list '{@link Gtm.NamedCarrierList#getCarriers <em>Carriers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Carriers</em>'.
	 * @see Gtm.NamedCarrierList#getCarriers()
	 * @see #getNamedCarrierList()
	 * @generated
	 */
	EReference getNamedCarrierList_Carriers();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.NamedCarrierList#getReplacementCode <em>Replacement Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replacement Code</em>'.
	 * @see Gtm.NamedCarrierList#getReplacementCode()
	 * @see #getNamedCarrierList()
	 * @generated
	 */
	EAttribute getNamedCarrierList_ReplacementCode();

	/**
	 * Returns the meta object for the reference '{@link Gtm.NamedCarrierList#getCarrierGroup <em>Carrier Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Carrier Group</em>'.
	 * @see Gtm.NamedCarrierList#getCarrierGroup()
	 * @see #getNamedCarrierList()
	 * @generated
	 */
	EReference getNamedCarrierList_CarrierGroup();

	/**
	 * Returns the meta object for class '{@link Gtm.AddCarrierRules <em>Add Carrier Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Carrier Rules</em>'.
	 * @see Gtm.AddCarrierRules
	 * @generated
	 */
	EClass getAddCarrierRules();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.AddCarrierRules#getAddCarrierRule <em>Add Carrier Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Add Carrier Rule</em>'.
	 * @see Gtm.AddCarrierRules#getAddCarrierRule()
	 * @see #getAddCarrierRules()
	 * @generated
	 */
	EReference getAddCarrierRules_AddCarrierRule();

	/**
	 * Returns the meta object for class '{@link Gtm.AddCarrierRule <em>Add Carrier Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Carrier Rule</em>'.
	 * @see Gtm.AddCarrierRule
	 * @generated
	 */
	EClass getAddCarrierRule();

	/**
	 * Returns the meta object for the reference '{@link Gtm.AddCarrierRule#getCarrier <em>Carrier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Carrier</em>'.
	 * @see Gtm.AddCarrierRule#getCarrier()
	 * @see #getAddCarrierRule()
	 * @generated
	 */
	EReference getAddCarrierRule_Carrier();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.AddCarrierRule#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see Gtm.AddCarrierRule#getScope()
	 * @see #getAddCarrierRule()
	 * @generated
	 */
	EAttribute getAddCarrierRule_Scope();

	/**
	 * Returns the meta object for the reference list '{@link Gtm.AddCarrierRule#getStations <em>Stations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Stations</em>'.
	 * @see Gtm.AddCarrierRule#getStations()
	 * @see #getAddCarrierRule()
	 * @generated
	 */
	EReference getAddCarrierRule_Stations();

	/**
	 * Returns the meta object for class '{@link Gtm.VatTemplates <em>Vat Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vat Templates</em>'.
	 * @see Gtm.VatTemplates
	 * @generated
	 */
	EClass getVatTemplates();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.VatTemplates#getVatTemplates <em>Vat Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vat Templates</em>'.
	 * @see Gtm.VatTemplates#getVatTemplates()
	 * @see #getVatTemplates()
	 * @generated
	 */
	EReference getVatTemplates_VatTemplates();

	/**
	 * Returns the meta object for class '{@link Gtm.VatTemplate <em>Vat Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vat Template</em>'.
	 * @see Gtm.VatTemplate
	 * @generated
	 */
	EClass getVatTemplate();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.VatTemplate#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see Gtm.VatTemplate#getScope()
	 * @see #getVatTemplate()
	 * @generated
	 */
	EAttribute getVatTemplate_Scope();

	/**
	 * Returns the meta object for the reference '{@link Gtm.VatTemplate#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Country</em>'.
	 * @see Gtm.VatTemplate#getCountry()
	 * @see #getVatTemplate()
	 * @generated
	 */
	EReference getVatTemplate_Country();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.VatTemplate#getPercentage <em>Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage</em>'.
	 * @see Gtm.VatTemplate#getPercentage()
	 * @see #getVatTemplate()
	 * @generated
	 */
	EAttribute getVatTemplate_Percentage();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.VatTemplate#getTaxId <em>Tax Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Id</em>'.
	 * @see Gtm.VatTemplate#getTaxId()
	 * @see #getVatTemplate()
	 * @generated
	 */
	EAttribute getVatTemplate_TaxId();

	/**
	 * Returns the meta object for class '{@link Gtm.FareTemplate <em>Fare Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fare Template</em>'.
	 * @see Gtm.FareTemplate
	 * @generated
	 */
	EClass getFareTemplate();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.FareTemplate#getPriceFactor <em>Price Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price Factor</em>'.
	 * @see Gtm.FareTemplate#getPriceFactor()
	 * @see #getFareTemplate()
	 * @generated
	 */
	EAttribute getFareTemplate_PriceFactor();

	/**
	 * Returns the meta object for the reference '{@link Gtm.FareTemplate#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Price</em>'.
	 * @see Gtm.FareTemplate#getPrice()
	 * @see #getFareTemplate()
	 * @generated
	 */
	EReference getFareTemplate_Price();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.FareTemplate#getMinimalPrice <em>Minimal Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Minimal Price</em>'.
	 * @see Gtm.FareTemplate#getMinimalPrice()
	 * @see #getFareTemplate()
	 * @generated
	 */
	EReference getFareTemplate_MinimalPrice();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.FareTemplate#getMaximalPrice <em>Maximal Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Maximal Price</em>'.
	 * @see Gtm.FareTemplate#getMaximalPrice()
	 * @see #getFareTemplate()
	 * @generated
	 */
	EReference getFareTemplate_MaximalPrice();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.FareTemplate#getRoundingMode <em>Rounding Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rounding Mode</em>'.
	 * @see Gtm.FareTemplate#getRoundingMode()
	 * @see #getFareTemplate()
	 * @generated
	 */
	EAttribute getFareTemplate_RoundingMode();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.FareTemplate#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Gtm.FareTemplate#getId()
	 * @see #getFareTemplate()
	 * @generated
	 */
	EAttribute getFareTemplate_Id();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.FareTemplate#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see Gtm.FareTemplate#getType()
	 * @see #getFareTemplate()
	 * @generated
	 */
	EAttribute getFareTemplate_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.FareTemplate#getAfterSalesTemplate <em>After Sales Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>After Sales Template</em>'.
	 * @see Gtm.FareTemplate#getAfterSalesTemplate()
	 * @see #getFareTemplate()
	 * @generated
	 */
	EReference getFareTemplate_AfterSalesTemplate();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.FareTemplate#getDataDescription <em>Data Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Description</em>'.
	 * @see Gtm.FareTemplate#getDataDescription()
	 * @see #getFareTemplate()
	 * @generated
	 */
	EAttribute getFareTemplate_DataDescription();

	/**
	 * Returns the meta object for the reference '{@link Gtm.FareTemplate#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Text</em>'.
	 * @see Gtm.FareTemplate#getText()
	 * @see #getFareTemplate()
	 * @generated
	 */
	EReference getFareTemplate_Text();

	/**
	 * Returns the meta object for the reference '{@link Gtm.FareTemplate#getFareConstraintBundle <em>Fare Constraint Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fare Constraint Bundle</em>'.
	 * @see Gtm.FareTemplate#getFareConstraintBundle()
	 * @see #getFareTemplate()
	 * @generated
	 */
	EReference getFareTemplate_FareConstraintBundle();

	/**
	 * Returns the meta object for the reference '{@link Gtm.FareTemplate#getSeparateContractFareConstraintBundle <em>Separate Contract Fare Constraint Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Separate Contract Fare Constraint Bundle</em>'.
	 * @see Gtm.FareTemplate#getSeparateContractFareConstraintBundle()
	 * @see #getFareTemplate()
	 * @generated
	 */
	EReference getFareTemplate_SeparateContractFareConstraintBundle();

	/**
	 * Returns the meta object for the reference '{@link Gtm.FareTemplate#getServiceConstraint <em>Service Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Constraint</em>'.
	 * @see Gtm.FareTemplate#getServiceConstraint()
	 * @see #getFareTemplate()
	 * @generated
	 */
	EReference getFareTemplate_ServiceConstraint();

	/**
	 * Returns the meta object for the reference '{@link Gtm.FareTemplate#getCarrierConstraint <em>Carrier Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Carrier Constraint</em>'.
	 * @see Gtm.FareTemplate#getCarrierConstraint()
	 * @see #getFareTemplate()
	 * @generated
	 */
	EReference getFareTemplate_CarrierConstraint();

	/**
	 * Returns the meta object for the reference '{@link Gtm.FareTemplate#getServiceClass <em>Service Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Class</em>'.
	 * @see Gtm.FareTemplate#getServiceClass()
	 * @see #getFareTemplate()
	 * @generated
	 */
	EReference getFareTemplate_ServiceClass();

	/**
	 * Returns the meta object for the reference '{@link Gtm.FareTemplate#getServiceLevel <em>Service Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Level</em>'.
	 * @see Gtm.FareTemplate#getServiceLevel()
	 * @see #getFareTemplate()
	 * @generated
	 */
	EReference getFareTemplate_ServiceLevel();

	/**
	 * Returns the meta object for the reference '{@link Gtm.FareTemplate#getSalesAvailability <em>Sales Availability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sales Availability</em>'.
	 * @see Gtm.FareTemplate#getSalesAvailability()
	 * @see #getFareTemplate()
	 * @generated
	 */
	EReference getFareTemplate_SalesAvailability();

	/**
	 * Returns the meta object for the reference '{@link Gtm.FareTemplate#getTravelValidity <em>Travel Validity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Travel Validity</em>'.
	 * @see Gtm.FareTemplate#getTravelValidity()
	 * @see #getFareTemplate()
	 * @generated
	 */
	EReference getFareTemplate_TravelValidity();

	/**
	 * Returns the meta object for the reference '{@link Gtm.FareTemplate#getCombinationConstraint <em>Combination Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Combination Constraint</em>'.
	 * @see Gtm.FareTemplate#getCombinationConstraint()
	 * @see #getFareTemplate()
	 * @generated
	 */
	EReference getFareTemplate_CombinationConstraint();

	/**
	 * Returns the meta object for the reference '{@link Gtm.FareTemplate#getSeparateContractCombinationConstraint <em>Separate Contract Combination Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Separate Contract Combination Constraint</em>'.
	 * @see Gtm.FareTemplate#getSeparateContractCombinationConstraint()
	 * @see #getFareTemplate()
	 * @generated
	 */
	EReference getFareTemplate_SeparateContractCombinationConstraint();

	/**
	 * Returns the meta object for the reference '{@link Gtm.FareTemplate#getFareDetailDescription <em>Fare Detail Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fare Detail Description</em>'.
	 * @see Gtm.FareTemplate#getFareDetailDescription()
	 * @see #getFareTemplate()
	 * @generated
	 */
	EReference getFareTemplate_FareDetailDescription();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.FareTemplate#getLegacyAccountingIdentifier <em>Legacy Accounting Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Legacy Accounting Identifier</em>'.
	 * @see Gtm.FareTemplate#getLegacyAccountingIdentifier()
	 * @see #getFareTemplate()
	 * @generated
	 */
	EReference getFareTemplate_LegacyAccountingIdentifier();

	/**
	 * Returns the meta object for the reference '{@link Gtm.FareTemplate#getPersonalDataConstraint <em>Personal Data Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Personal Data Constraint</em>'.
	 * @see Gtm.FareTemplate#getPersonalDataConstraint()
	 * @see #getFareTemplate()
	 * @generated
	 */
	EReference getFareTemplate_PersonalDataConstraint();

	/**
	 * Returns the meta object for the reference '{@link Gtm.FareTemplate#getReservationParameter <em>Reservation Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reservation Parameter</em>'.
	 * @see Gtm.FareTemplate#getReservationParameter()
	 * @see #getFareTemplate()
	 * @generated
	 */
	EReference getFareTemplate_ReservationParameter();

	/**
	 * Returns the meta object for the reference '{@link Gtm.FareTemplate#getReductionConstraint <em>Reduction Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reduction Constraint</em>'.
	 * @see Gtm.FareTemplate#getReductionConstraint()
	 * @see #getFareTemplate()
	 * @generated
	 */
	EReference getFareTemplate_ReductionConstraint();

	/**
	 * Returns the meta object for the reference '{@link Gtm.FareTemplate#getFulfillmentConstraint <em>Fulfillment Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fulfillment Constraint</em>'.
	 * @see Gtm.FareTemplate#getFulfillmentConstraint()
	 * @see #getFareTemplate()
	 * @generated
	 */
	EReference getFareTemplate_FulfillmentConstraint();

	/**
	 * Returns the meta object for the reference '{@link Gtm.FareTemplate#getPassengerConstraint <em>Passenger Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Passenger Constraint</em>'.
	 * @see Gtm.FareTemplate#getPassengerConstraint()
	 * @see #getFareTemplate()
	 * @generated
	 */
	EReference getFareTemplate_PassengerConstraint();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.FareTemplate#getLegacyConversion <em>Legacy Conversion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Legacy Conversion</em>'.
	 * @see Gtm.FareTemplate#getLegacyConversion()
	 * @see #getFareTemplate()
	 * @generated
	 */
	EAttribute getFareTemplate_LegacyConversion();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.FareTemplate#isIndividualContracts <em>Individual Contracts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Individual Contracts</em>'.
	 * @see Gtm.FareTemplate#isIndividualContracts()
	 * @see #getFareTemplate()
	 * @generated
	 */
	EAttribute getFareTemplate_IndividualContracts();

	/**
	 * Returns the meta object for the attribute list '{@link Gtm.FareTemplate#getRegulatoryConditions <em>Regulatory Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Regulatory Conditions</em>'.
	 * @see Gtm.FareTemplate#getRegulatoryConditions()
	 * @see #getFareTemplate()
	 * @generated
	 */
	EAttribute getFareTemplate_RegulatoryConditions();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.FareTemplate#getLegacyAccountingTariffId <em>Legacy Accounting Tariff Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Legacy Accounting Tariff Id</em>'.
	 * @see Gtm.FareTemplate#getLegacyAccountingTariffId()
	 * @see #getFareTemplate()
	 * @generated
	 */
	EAttribute getFareTemplate_LegacyAccountingTariffId();

	/**
	 * Returns the meta object for the attribute list '{@link Gtm.FareTemplate#getSeriesFilter <em>Series Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Series Filter</em>'.
	 * @see Gtm.FareTemplate#getSeriesFilter()
	 * @see #getFareTemplate()
	 * @generated
	 */
	EAttribute getFareTemplate_SeriesFilter();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.FareTemplate#getBasePriceClass <em>Base Price Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Price Class</em>'.
	 * @see Gtm.FareTemplate#getBasePriceClass()
	 * @see #getFareTemplate()
	 * @generated
	 */
	EAttribute getFareTemplate_BasePriceClass();

	/**
	 * Returns the meta object for the reference list '{@link Gtm.FareTemplate#getCarrierFilter <em>Carrier Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Carrier Filter</em>'.
	 * @see Gtm.FareTemplate#getCarrierFilter()
	 * @see #getFareTemplate()
	 * @generated
	 */
	EReference getFareTemplate_CarrierFilter();

	/**
	 * Returns the meta object for the reference '{@link Gtm.FareTemplate#getLuggageConstraint <em>Luggage Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Luggage Constraint</em>'.
	 * @see Gtm.FareTemplate#getLuggageConstraint()
	 * @see #getFareTemplate()
	 * @generated
	 */
	EReference getFareTemplate_LuggageConstraint();

	/**
	 * Returns the meta object for class '{@link Gtm.MaximalPrice <em>Maximal Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Maximal Price</em>'.
	 * @see Gtm.MaximalPrice
	 * @generated
	 */
	EClass getMaximalPrice();

	/**
	 * Returns the meta object for class '{@link Gtm.MinimalPrice <em>Minimal Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Minimal Price</em>'.
	 * @see Gtm.MinimalPrice
	 * @generated
	 */
	EClass getMinimalPrice();

	/**
	 * Returns the meta object for class '{@link Gtm.AfterSalesTemplate <em>After Sales Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>After Sales Template</em>'.
	 * @see Gtm.AfterSalesTemplate
	 * @generated
	 */
	EClass getAfterSalesTemplate();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.AfterSalesTemplate#getTransactionType <em>Transaction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction Type</em>'.
	 * @see Gtm.AfterSalesTemplate#getTransactionType()
	 * @see #getAfterSalesTemplate()
	 * @generated
	 */
	EAttribute getAfterSalesTemplate_TransactionType();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.AfterSalesTemplate#isCarrierFee <em>Carrier Fee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Carrier Fee</em>'.
	 * @see Gtm.AfterSalesTemplate#isCarrierFee()
	 * @see #getAfterSalesTemplate()
	 * @generated
	 */
	EAttribute getAfterSalesTemplate_CarrierFee();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.AfterSalesTemplate#getApplicationTime <em>Application Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Application Time</em>'.
	 * @see Gtm.AfterSalesTemplate#getApplicationTime()
	 * @see #getAfterSalesTemplate()
	 * @generated
	 */
	EReference getAfterSalesTemplate_ApplicationTime();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.AfterSalesTemplate#getFeeFactor <em>Fee Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fee Factor</em>'.
	 * @see Gtm.AfterSalesTemplate#getFeeFactor()
	 * @see #getAfterSalesTemplate()
	 * @generated
	 */
	EAttribute getAfterSalesTemplate_FeeFactor();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.AfterSalesTemplate#getRoundingMode <em>Rounding Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rounding Mode</em>'.
	 * @see Gtm.AfterSalesTemplate#getRoundingMode()
	 * @see #getAfterSalesTemplate()
	 * @generated
	 */
	EAttribute getAfterSalesTemplate_RoundingMode();

	/**
	 * Returns the meta object for class '{@link Gtm.LegacyStationToServiceConstraintMappings <em>Legacy Station To Service Constraint Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legacy Station To Service Constraint Mappings</em>'.
	 * @see Gtm.LegacyStationToServiceConstraintMappings
	 * @generated
	 */
	EClass getLegacyStationToServiceConstraintMappings();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.LegacyStationToServiceConstraintMappings#getLegacyStationToServiceBrandMappings <em>Legacy Station To Service Brand Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Legacy Station To Service Brand Mappings</em>'.
	 * @see Gtm.LegacyStationToServiceConstraintMappings#getLegacyStationToServiceBrandMappings()
	 * @see #getLegacyStationToServiceConstraintMappings()
	 * @generated
	 */
	EReference getLegacyStationToServiceConstraintMappings_LegacyStationToServiceBrandMappings();

	/**
	 * Returns the meta object for the '{@link Gtm.LegacyStationToServiceConstraintMappings#findServiceConstraint(int) <em>Find Service Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Service Constraint</em>' operation.
	 * @see Gtm.LegacyStationToServiceConstraintMappings#findServiceConstraint(int)
	 * @generated
	 */
	EOperation getLegacyStationToServiceConstraintMappings__FindServiceConstraint__int();

	/**
	 * Returns the meta object for class '{@link Gtm.LegacyBorderPoint <em>Legacy Border Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legacy Border Point</em>'.
	 * @see Gtm.LegacyBorderPoint
	 * @generated
	 */
	EClass getLegacyBorderPoint();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacyBorderPoint#getBorderPointCode <em>Border Point Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border Point Code</em>'.
	 * @see Gtm.LegacyBorderPoint#getBorderPointCode()
	 * @see #getLegacyBorderPoint()
	 * @generated
	 */
	EAttribute getLegacyBorderPoint_BorderPointCode();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.LegacyBorderPoint#getFakeBorderStations <em>Fake Border Stations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fake Border Stations</em>'.
	 * @see Gtm.LegacyBorderPoint#getFakeBorderStations()
	 * @see #getLegacyBorderPoint()
	 * @generated
	 */
	EReference getLegacyBorderPoint_FakeBorderStations();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.LegacyBorderPoint#getOnBorderStations <em>On Border Stations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>On Border Stations</em>'.
	 * @see Gtm.LegacyBorderPoint#getOnBorderStations()
	 * @see #getLegacyBorderPoint()
	 * @generated
	 */
	EReference getLegacyBorderPoint_OnBorderStations();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.LegacyBorderPoint#getBorderSides <em>Border Sides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Border Sides</em>'.
	 * @see Gtm.LegacyBorderPoint#getBorderSides()
	 * @see #getLegacyBorderPoint()
	 * @generated
	 */
	EReference getLegacyBorderPoint_BorderSides();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacyBorderPoint#isIncompleteData <em>Incomplete Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Incomplete Data</em>'.
	 * @see Gtm.LegacyBorderPoint#isIncompleteData()
	 * @see #getLegacyBorderPoint()
	 * @generated
	 */
	EAttribute getLegacyBorderPoint_IncompleteData();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacyBorderPoint#getDataDescription <em>Data Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Description</em>'.
	 * @see Gtm.LegacyBorderPoint#getDataDescription()
	 * @see #getLegacyBorderPoint()
	 * @generated
	 */
	EAttribute getLegacyBorderPoint_DataDescription();

	/**
	 * Returns the meta object for class '{@link Gtm.OnBorderStations <em>On Border Stations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>On Border Stations</em>'.
	 * @see Gtm.OnBorderStations
	 * @generated
	 */
	EClass getOnBorderStations();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.OnBorderStations#getStations <em>Stations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stations</em>'.
	 * @see Gtm.OnBorderStations#getStations()
	 * @see #getOnBorderStations()
	 * @generated
	 */
	EReference getOnBorderStations_Stations();

	/**
	 * Returns the meta object for class '{@link Gtm.LegacyFakeBorderStations <em>Legacy Fake Border Stations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legacy Fake Border Stations</em>'.
	 * @see Gtm.LegacyFakeBorderStations
	 * @generated
	 */
	EClass getLegacyFakeBorderStations();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.LegacyFakeBorderStations#getStations <em>Stations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stations</em>'.
	 * @see Gtm.LegacyFakeBorderStations#getStations()
	 * @see #getLegacyFakeBorderStations()
	 * @generated
	 */
	EReference getLegacyFakeBorderStations_Stations();

	/**
	 * Returns the meta object for class '{@link Gtm.LegacyBorderSide <em>Legacy Border Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legacy Border Side</em>'.
	 * @see Gtm.LegacyBorderSide
	 * @generated
	 */
	EClass getLegacyBorderSide();

	/**
	 * Returns the meta object for the reference '{@link Gtm.LegacyBorderSide#getCarrier <em>Carrier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Carrier</em>'.
	 * @see Gtm.LegacyBorderSide#getCarrier()
	 * @see #getLegacyBorderSide()
	 * @generated
	 */
	EReference getLegacyBorderSide_Carrier();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.LegacyBorderSide#getStations <em>Stations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stations</em>'.
	 * @see Gtm.LegacyBorderSide#getStations()
	 * @see #getLegacyBorderSide()
	 * @generated
	 */
	EReference getLegacyBorderSide_Stations();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacyBorderSide#getLegacyStationCode <em>Legacy Station Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Legacy Station Code</em>'.
	 * @see Gtm.LegacyBorderSide#getLegacyStationCode()
	 * @see #getLegacyBorderSide()
	 * @generated
	 */
	EAttribute getLegacyBorderSide_LegacyStationCode();

	/**
	 * Returns the meta object for class '{@link Gtm.LegacyBorderPoints <em>Legacy Border Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legacy Border Points</em>'.
	 * @see Gtm.LegacyBorderPoints
	 * @generated
	 */
	EClass getLegacyBorderPoints();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.LegacyBorderPoints#getLegacyBorderPoints <em>Legacy Border Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Legacy Border Points</em>'.
	 * @see Gtm.LegacyBorderPoints#getLegacyBorderPoints()
	 * @see #getLegacyBorderPoints()
	 * @generated
	 */
	EReference getLegacyBorderPoints_LegacyBorderPoints();

	/**
	 * Returns the meta object for class '{@link Gtm.LegacyStationToServiceConstraintMapping <em>Legacy Station To Service Constraint Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legacy Station To Service Constraint Mapping</em>'.
	 * @see Gtm.LegacyStationToServiceConstraintMapping
	 * @generated
	 */
	EClass getLegacyStationToServiceConstraintMapping();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacyStationToServiceConstraintMapping#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see Gtm.LegacyStationToServiceConstraintMapping#getCode()
	 * @see #getLegacyStationToServiceConstraintMapping()
	 * @generated
	 */
	EAttribute getLegacyStationToServiceConstraintMapping_Code();

	/**
	 * Returns the meta object for the reference '{@link Gtm.LegacyStationToServiceConstraintMapping#getServiceConstraint <em>Service Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Constraint</em>'.
	 * @see Gtm.LegacyStationToServiceConstraintMapping#getServiceConstraint()
	 * @see #getLegacyStationToServiceConstraintMapping()
	 * @generated
	 */
	EReference getLegacyStationToServiceConstraintMapping_ServiceConstraint();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacyStationToServiceConstraintMapping#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see Gtm.LegacyStationToServiceConstraintMapping#getDescription()
	 * @see #getLegacyStationToServiceConstraintMapping()
	 * @generated
	 */
	EAttribute getLegacyStationToServiceConstraintMapping_Description();

	/**
	 * Returns the meta object for class '{@link Gtm.LegacyStationMappings <em>Legacy Station Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legacy Station Mappings</em>'.
	 * @see Gtm.LegacyStationMappings
	 * @generated
	 */
	EClass getLegacyStationMappings();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.LegacyStationMappings#getStationMappings <em>Station Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Station Mappings</em>'.
	 * @see Gtm.LegacyStationMappings#getStationMappings()
	 * @see #getLegacyStationMappings()
	 * @generated
	 */
	EReference getLegacyStationMappings_StationMappings();

	/**
	 * Returns the meta object for the '{@link Gtm.LegacyStationMappings#findMappedStation(int) <em>Find Mapped Station</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Mapped Station</em>' operation.
	 * @see Gtm.LegacyStationMappings#findMappedStation(int)
	 * @generated
	 */
	EOperation getLegacyStationMappings__FindMappedStation__int();

	/**
	 * Returns the meta object for class '{@link Gtm.LegacyStationMap <em>Legacy Station Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legacy Station Map</em>'.
	 * @see Gtm.LegacyStationMap
	 * @generated
	 */
	EClass getLegacyStationMap();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacyStationMap#getLegacyCode <em>Legacy Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Legacy Code</em>'.
	 * @see Gtm.LegacyStationMap#getLegacyCode()
	 * @see #getLegacyStationMap()
	 * @generated
	 */
	EAttribute getLegacyStationMap_LegacyCode();

	/**
	 * Returns the meta object for the reference '{@link Gtm.LegacyStationMap#getStation <em>Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Station</em>'.
	 * @see Gtm.LegacyStationMap#getStation()
	 * @see #getLegacyStationMap()
	 * @generated
	 */
	EReference getLegacyStationMap_Station();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacyStationMap#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Source</em>'.
	 * @see Gtm.LegacyStationMap#getDataSource()
	 * @see #getLegacyStationMap()
	 * @generated
	 */
	EAttribute getLegacyStationMap_DataSource();

	/**
	 * Returns the meta object for class '{@link Gtm.LegacyFareDetailMaps <em>Legacy Fare Detail Maps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legacy Fare Detail Maps</em>'.
	 * @see Gtm.LegacyFareDetailMaps
	 * @generated
	 */
	EClass getLegacyFareDetailMaps();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.LegacyFareDetailMaps#getLegacyFareDetailMaps <em>Legacy Fare Detail Maps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Legacy Fare Detail Maps</em>'.
	 * @see Gtm.LegacyFareDetailMaps#getLegacyFareDetailMaps()
	 * @see #getLegacyFareDetailMaps()
	 * @generated
	 */
	EReference getLegacyFareDetailMaps_LegacyFareDetailMaps();

	/**
	 * Returns the meta object for class '{@link Gtm.LegacyFareDetailMap <em>Legacy Fare Detail Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legacy Fare Detail Map</em>'.
	 * @see Gtm.LegacyFareDetailMap
	 * @generated
	 */
	EClass getLegacyFareDetailMap();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacyFareDetailMap#getLegacyCode <em>Legacy Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Legacy Code</em>'.
	 * @see Gtm.LegacyFareDetailMap#getLegacyCode()
	 * @see #getLegacyFareDetailMap()
	 * @generated
	 */
	EAttribute getLegacyFareDetailMap_LegacyCode();

	/**
	 * Returns the meta object for the reference '{@link Gtm.LegacyFareDetailMap#getFareDetailDescription <em>Fare Detail Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fare Detail Description</em>'.
	 * @see Gtm.LegacyFareDetailMap#getFareDetailDescription()
	 * @see #getLegacyFareDetailMap()
	 * @generated
	 */
	EReference getLegacyFareDetailMap_FareDetailDescription();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacyFareDetailMap#getFareDetailMappingType <em>Fare Detail Mapping Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fare Detail Mapping Type</em>'.
	 * @see Gtm.LegacyFareDetailMap#getFareDetailMappingType()
	 * @see #getLegacyFareDetailMap()
	 * @generated
	 */
	EAttribute getLegacyFareDetailMap_FareDetailMappingType();

	/**
	 * Returns the meta object for class '{@link Gtm.LegacyStation <em>Legacy Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legacy Station</em>'.
	 * @see Gtm.LegacyStation
	 * @generated
	 */
	EClass getLegacyStation();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacyStation#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see Gtm.LegacyStation#getCode()
	 * @see #getLegacyStation()
	 * @generated
	 */
	EAttribute getLegacyStation_Code();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacyStation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Gtm.LegacyStation#getName()
	 * @see #getLegacyStation()
	 * @generated
	 */
	EAttribute getLegacyStation_Name();

	/**
	 * Returns the meta object for class '{@link Gtm.LegacyBoderPointMappings <em>Legacy Boder Point Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legacy Boder Point Mappings</em>'.
	 * @see Gtm.LegacyBoderPointMappings
	 * @generated
	 */
	EClass getLegacyBoderPointMappings();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.LegacyBoderPointMappings#getBorderPoints <em>Border Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Border Points</em>'.
	 * @see Gtm.LegacyBoderPointMappings#getBorderPoints()
	 * @see #getLegacyBoderPointMappings()
	 * @generated
	 */
	EReference getLegacyBoderPointMappings_BorderPoints();

	/**
	 * Returns the meta object for the '{@link Gtm.LegacyBoderPointMappings#getMappingByBorderPointCode(int) <em>Get Mapping By Border Point Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Mapping By Border Point Code</em>' operation.
	 * @see Gtm.LegacyBoderPointMappings#getMappingByBorderPointCode(int)
	 * @generated
	 */
	EOperation getLegacyBoderPointMappings__GetMappingByBorderPointCode__int();

	/**
	 * Returns the meta object for class '{@link Gtm.LegacyBorderPointMapping <em>Legacy Border Point Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legacy Border Point Mapping</em>'.
	 * @see Gtm.LegacyBorderPointMapping
	 * @generated
	 */
	EClass getLegacyBorderPointMapping();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacyBorderPointMapping#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see Gtm.LegacyBorderPointMapping#getCode()
	 * @see #getLegacyBorderPointMapping()
	 * @generated
	 */
	EAttribute getLegacyBorderPointMapping_Code();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacyBorderPointMapping#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Gtm.LegacyBorderPointMapping#getName()
	 * @see #getLegacyBorderPointMapping()
	 * @generated
	 */
	EAttribute getLegacyBorderPointMapping_Name();

	/**
	 * Returns the meta object for the reference '{@link Gtm.LegacyBorderPointMapping#getStation <em>Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Station</em>'.
	 * @see Gtm.LegacyBorderPointMapping#getStation()
	 * @see #getLegacyBorderPointMapping()
	 * @generated
	 */
	EReference getLegacyBorderPointMapping_Station();

	/**
	 * Returns the meta object for the reference '{@link Gtm.LegacyBorderPointMapping#getConnectionPoint <em>Connection Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connection Point</em>'.
	 * @see Gtm.LegacyBorderPointMapping#getConnectionPoint()
	 * @see #getLegacyBorderPointMapping()
	 * @generated
	 */
	EReference getLegacyBorderPointMapping_ConnectionPoint();

	/**
	 * Returns the meta object for class '{@link Gtm.LegacyFareStationSetMappings <em>Legacy Fare Station Set Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legacy Fare Station Set Mappings</em>'.
	 * @see Gtm.LegacyFareStationSetMappings
	 * @generated
	 */
	EClass getLegacyFareStationSetMappings();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.LegacyFareStationSetMappings#getLegacyFareStationSetMap <em>Legacy Fare Station Set Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Legacy Fare Station Set Map</em>'.
	 * @see Gtm.LegacyFareStationSetMappings#getLegacyFareStationSetMap()
	 * @see #getLegacyFareStationSetMappings()
	 * @generated
	 */
	EReference getLegacyFareStationSetMappings_LegacyFareStationSetMap();

	/**
	 * Returns the meta object for class '{@link Gtm.LegacyFareStationSetMap <em>Legacy Fare Station Set Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legacy Fare Station Set Map</em>'.
	 * @see Gtm.LegacyFareStationSetMap
	 * @generated
	 */
	EClass getLegacyFareStationSetMap();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacyFareStationSetMap#getLegacyCode <em>Legacy Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Legacy Code</em>'.
	 * @see Gtm.LegacyFareStationSetMap#getLegacyCode()
	 * @see #getLegacyFareStationSetMap()
	 * @generated
	 */
	EAttribute getLegacyFareStationSetMap_LegacyCode();

	/**
	 * Returns the meta object for the reference '{@link Gtm.LegacyFareStationSetMap#getStationSet <em>Station Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Station Set</em>'.
	 * @see Gtm.LegacyFareStationSetMap#getStationSet()
	 * @see #getLegacyFareStationSetMap()
	 * @generated
	 */
	EReference getLegacyFareStationSetMap_StationSet();

	/**
	 * Returns the meta object for class '{@link Gtm.LegacyBusFerryMapping <em>Legacy Bus Ferry Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legacy Bus Ferry Mapping</em>'.
	 * @see Gtm.LegacyBusFerryMapping
	 * @generated
	 */
	EClass getLegacyBusFerryMapping();

	/**
	 * Returns the meta object for the reference '{@link Gtm.LegacyBusFerryMapping#getBusServiceConstraint <em>Bus Service Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bus Service Constraint</em>'.
	 * @see Gtm.LegacyBusFerryMapping#getBusServiceConstraint()
	 * @see #getLegacyBusFerryMapping()
	 * @generated
	 */
	EReference getLegacyBusFerryMapping_BusServiceConstraint();

	/**
	 * Returns the meta object for the reference '{@link Gtm.LegacyBusFerryMapping#getFerryConstraint <em>Ferry Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ferry Constraint</em>'.
	 * @see Gtm.LegacyBusFerryMapping#getFerryConstraint()
	 * @see #getLegacyBusFerryMapping()
	 * @generated
	 */
	EReference getLegacyBusFerryMapping_FerryConstraint();

	/**
	 * Returns the meta object for the reference '{@link Gtm.LegacyBusFerryMapping#getBusFerryConstraint <em>Bus Ferry Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bus Ferry Constraint</em>'.
	 * @see Gtm.LegacyBusFerryMapping#getBusFerryConstraint()
	 * @see #getLegacyBusFerryMapping()
	 * @generated
	 */
	EReference getLegacyBusFerryMapping_BusFerryConstraint();

	/**
	 * Returns the meta object for class '{@link Gtm.Legacy108 <em>Legacy108</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legacy108</em>'.
	 * @see Gtm.Legacy108
	 * @generated
	 */
	EClass getLegacy108();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Legacy108#getCharacterSet <em>Character Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Character Set</em>'.
	 * @see Gtm.Legacy108#getCharacterSet()
	 * @see #getLegacy108()
	 * @generated
	 */
	EAttribute getLegacy108_CharacterSet();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.Legacy108#getLegacySeriesList <em>Legacy Series List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Legacy Series List</em>'.
	 * @see Gtm.Legacy108#getLegacySeriesList()
	 * @see #getLegacy108()
	 * @generated
	 */
	EReference getLegacy108_LegacySeriesList();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.Legacy108#getLegacySeparateContractSeries <em>Legacy Separate Contract Series</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Legacy Separate Contract Series</em>'.
	 * @see Gtm.Legacy108#getLegacySeparateContractSeries()
	 * @see #getLegacy108()
	 * @generated
	 */
	EReference getLegacy108_LegacySeparateContractSeries();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.Legacy108#getLegacyDistanceFares <em>Legacy Distance Fares</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Legacy Distance Fares</em>'.
	 * @see Gtm.Legacy108#getLegacyDistanceFares()
	 * @see #getLegacy108()
	 * @generated
	 */
	EReference getLegacy108_LegacyDistanceFares();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.Legacy108#getLegacyRouteFares <em>Legacy Route Fares</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Legacy Route Fares</em>'.
	 * @see Gtm.Legacy108#getLegacyRouteFares()
	 * @see #getLegacy108()
	 * @generated
	 */
	EReference getLegacy108_LegacyRouteFares();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.Legacy108#getLegacyStations <em>Legacy Stations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Legacy Stations</em>'.
	 * @see Gtm.Legacy108#getLegacyStations()
	 * @see #getLegacy108()
	 * @generated
	 */
	EReference getLegacy108_LegacyStations();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.Legacy108#getLegacyFareDescriptions <em>Legacy Fare Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Legacy Fare Descriptions</em>'.
	 * @see Gtm.Legacy108#getLegacyFareDescriptions()
	 * @see #getLegacy108()
	 * @generated
	 */
	EReference getLegacy108_LegacyFareDescriptions();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Legacy108#getTimeZone <em>Time Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Zone</em>'.
	 * @see Gtm.Legacy108#getTimeZone()
	 * @see #getLegacy108()
	 * @generated
	 */
	EAttribute getLegacy108_TimeZone();

	/**
	 * Returns the meta object for the reference '{@link Gtm.Legacy108#getCarrier <em>Carrier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Carrier</em>'.
	 * @see Gtm.Legacy108#getCarrier()
	 * @see #getLegacy108()
	 * @generated
	 */
	EReference getLegacy108_Carrier();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Legacy108#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see Gtm.Legacy108#getStartDate()
	 * @see #getLegacy108()
	 * @generated
	 */
	EAttribute getLegacy108_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Legacy108#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see Gtm.Legacy108#getEndDate()
	 * @see #getLegacy108()
	 * @generated
	 */
	EAttribute getLegacy108_EndDate();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.Legacy108#getLegacyBorderPoints <em>Legacy Border Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Legacy Border Points</em>'.
	 * @see Gtm.Legacy108#getLegacyBorderPoints()
	 * @see #getLegacy108()
	 * @generated
	 */
	EReference getLegacy108_LegacyBorderPoints();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.Legacy108#getLegacyMemos <em>Legacy Memos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Legacy Memos</em>'.
	 * @see Gtm.Legacy108#getLegacyMemos()
	 * @see #getLegacy108()
	 * @generated
	 */
	EReference getLegacy108_LegacyMemos();

	/**
	 * Returns the meta object for the containment reference '{@link Gtm.Legacy108#getLegacyCarriers <em>Legacy Carriers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Legacy Carriers</em>'.
	 * @see Gtm.Legacy108#getLegacyCarriers()
	 * @see #getLegacy108()
	 * @generated
	 */
	EReference getLegacy108_LegacyCarriers();

	/**
	 * Returns the meta object for class '{@link Gtm.Legacy108Memos <em>Legacy108 Memos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legacy108 Memos</em>'.
	 * @see Gtm.Legacy108Memos
	 * @generated
	 */
	EClass getLegacy108Memos();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.Legacy108Memos#getLegacyMemos <em>Legacy Memos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Legacy Memos</em>'.
	 * @see Gtm.Legacy108Memos#getLegacyMemos()
	 * @see #getLegacy108Memos()
	 * @generated
	 */
	EReference getLegacy108Memos_LegacyMemos();

	/**
	 * Returns the meta object for class '{@link Gtm.Legacy108Memo <em>Legacy108 Memo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legacy108 Memo</em>'.
	 * @see Gtm.Legacy108Memo
	 * @generated
	 */
	EClass getLegacy108Memo();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Legacy108Memo#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see Gtm.Legacy108Memo#getNumber()
	 * @see #getLegacy108Memo()
	 * @generated
	 */
	EAttribute getLegacy108Memo_Number();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Legacy108Memo#getLocal <em>Local</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local</em>'.
	 * @see Gtm.Legacy108Memo#getLocal()
	 * @see #getLegacy108Memo()
	 * @generated
	 */
	EAttribute getLegacy108Memo_Local();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Legacy108Memo#getEnglish <em>English</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>English</em>'.
	 * @see Gtm.Legacy108Memo#getEnglish()
	 * @see #getLegacy108Memo()
	 * @generated
	 */
	EAttribute getLegacy108Memo_English();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Legacy108Memo#getFrench <em>French</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>French</em>'.
	 * @see Gtm.Legacy108Memo#getFrench()
	 * @see #getLegacy108Memo()
	 * @generated
	 */
	EAttribute getLegacy108Memo_French();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Legacy108Memo#getGerman <em>German</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>German</em>'.
	 * @see Gtm.Legacy108Memo#getGerman()
	 * @see #getLegacy108Memo()
	 * @generated
	 */
	EAttribute getLegacy108Memo_German();

	/**
	 * Returns the meta object for class '{@link Gtm.Legacy108FareDescription <em>Legacy108 Fare Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legacy108 Fare Description</em>'.
	 * @see Gtm.Legacy108FareDescription
	 * @generated
	 */
	EClass getLegacy108FareDescription();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Legacy108FareDescription#getTableId <em>Table Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Id</em>'.
	 * @see Gtm.Legacy108FareDescription#getTableId()
	 * @see #getLegacy108FareDescription()
	 * @generated
	 */
	EAttribute getLegacy108FareDescription_TableId();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Legacy108FareDescription#getDescriptionFr <em>Description Fr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description Fr</em>'.
	 * @see Gtm.Legacy108FareDescription#getDescriptionFr()
	 * @see #getLegacy108FareDescription()
	 * @generated
	 */
	EAttribute getLegacy108FareDescription_DescriptionFr();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Legacy108FareDescription#getDescriptionGe <em>Description Ge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description Ge</em>'.
	 * @see Gtm.Legacy108FareDescription#getDescriptionGe()
	 * @see #getLegacy108FareDescription()
	 * @generated
	 */
	EAttribute getLegacy108FareDescription_DescriptionGe();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Legacy108FareDescription#getDescriptionEn <em>Description En</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description En</em>'.
	 * @see Gtm.Legacy108FareDescription#getDescriptionEn()
	 * @see #getLegacy108FareDescription()
	 * @generated
	 */
	EAttribute getLegacy108FareDescription_DescriptionEn();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Legacy108FareDescription#getDescriptionLocal <em>Description Local</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description Local</em>'.
	 * @see Gtm.Legacy108FareDescription#getDescriptionLocal()
	 * @see #getLegacy108FareDescription()
	 * @generated
	 */
	EAttribute getLegacy108FareDescription_DescriptionLocal();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Legacy108FareDescription#getCalculationType <em>Calculation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Calculation Type</em>'.
	 * @see Gtm.Legacy108FareDescription#getCalculationType()
	 * @see #getLegacy108FareDescription()
	 * @generated
	 */
	EAttribute getLegacy108FareDescription_CalculationType();

	/**
	 * Returns the meta object for class '{@link Gtm.Legacy108FaresDescriptions <em>Legacy108 Fares Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legacy108 Fares Descriptions</em>'.
	 * @see Gtm.Legacy108FaresDescriptions
	 * @generated
	 */
	EClass getLegacy108FaresDescriptions();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.Legacy108FaresDescriptions#getLegacyFares <em>Legacy Fares</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Legacy Fares</em>'.
	 * @see Gtm.Legacy108FaresDescriptions#getLegacyFares()
	 * @see #getLegacy108FaresDescriptions()
	 * @generated
	 */
	EReference getLegacy108FaresDescriptions_LegacyFares();

	/**
	 * Returns the meta object for class '{@link Gtm.Legacy108Stations <em>Legacy108 Stations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legacy108 Stations</em>'.
	 * @see Gtm.Legacy108Stations
	 * @generated
	 */
	EClass getLegacy108Stations();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.Legacy108Stations#getLegacyStations <em>Legacy Stations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Legacy Stations</em>'.
	 * @see Gtm.Legacy108Stations#getLegacyStations()
	 * @see #getLegacy108Stations()
	 * @generated
	 */
	EReference getLegacy108Stations_LegacyStations();

	/**
	 * Returns the meta object for the '{@link Gtm.Legacy108Stations#findStation(int) <em>Find Station</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Station</em>' operation.
	 * @see Gtm.Legacy108Stations#findStation(int)
	 * @generated
	 */
	EOperation getLegacy108Stations__FindStation__int();

	/**
	 * Returns the meta object for the '{@link Gtm.Legacy108Stations#findByBorderPoint(int) <em>Find By Border Point</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find By Border Point</em>' operation.
	 * @see Gtm.Legacy108Stations#findByBorderPoint(int)
	 * @generated
	 */
	EOperation getLegacy108Stations__FindByBorderPoint__int();

	/**
	 * Returns the meta object for class '{@link Gtm.Legacy108Station <em>Legacy108 Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legacy108 Station</em>'.
	 * @see Gtm.Legacy108Station
	 * @generated
	 */
	EClass getLegacy108Station();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Legacy108Station#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Gtm.Legacy108Station#getName()
	 * @see #getLegacy108Station()
	 * @generated
	 */
	EAttribute getLegacy108Station_Name();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Legacy108Station#getBorderPointCode <em>Border Point Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border Point Code</em>'.
	 * @see Gtm.Legacy108Station#getBorderPointCode()
	 * @see #getLegacy108Station()
	 * @generated
	 */
	EAttribute getLegacy108Station_BorderPointCode();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Legacy108Station#getNameUTF8 <em>Name UTF8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name UTF8</em>'.
	 * @see Gtm.Legacy108Station#getNameUTF8()
	 * @see #getLegacy108Station()
	 * @generated
	 */
	EAttribute getLegacy108Station_NameUTF8();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Legacy108Station#getStationCode <em>Station Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Station Code</em>'.
	 * @see Gtm.Legacy108Station#getStationCode()
	 * @see #getLegacy108Station()
	 * @generated
	 */
	EAttribute getLegacy108Station_StationCode();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Legacy108Station#getFareReferenceStationCode <em>Fare Reference Station Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fare Reference Station Code</em>'.
	 * @see Gtm.Legacy108Station#getFareReferenceStationCode()
	 * @see #getLegacy108Station()
	 * @generated
	 */
	EAttribute getLegacy108Station_FareReferenceStationCode();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Legacy108Station#getShortName <em>Short Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Name</em>'.
	 * @see Gtm.Legacy108Station#getShortName()
	 * @see #getLegacy108Station()
	 * @generated
	 */
	EAttribute getLegacy108Station_ShortName();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Legacy108Station#getShortNameUtf8 <em>Short Name Utf8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Name Utf8</em>'.
	 * @see Gtm.Legacy108Station#getShortNameUtf8()
	 * @see #getLegacy108Station()
	 * @generated
	 */
	EAttribute getLegacy108Station_ShortNameUtf8();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Legacy108Station#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longitude</em>'.
	 * @see Gtm.Legacy108Station#getLongitude()
	 * @see #getLegacy108Station()
	 * @generated
	 */
	EAttribute getLegacy108Station_Longitude();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.Legacy108Station#getLatitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latitude</em>'.
	 * @see Gtm.Legacy108Station#getLatitude()
	 * @see #getLegacy108Station()
	 * @generated
	 */
	EAttribute getLegacy108Station_Latitude();

	/**
	 * Returns the meta object for class '{@link Gtm.LegacyRouteFares <em>Legacy Route Fares</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legacy Route Fares</em>'.
	 * @see Gtm.LegacyRouteFares
	 * @generated
	 */
	EClass getLegacyRouteFares();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.LegacyRouteFares#getRouteFare <em>Route Fare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Route Fare</em>'.
	 * @see Gtm.LegacyRouteFares#getRouteFare()
	 * @see #getLegacyRouteFares()
	 * @generated
	 */
	EReference getLegacyRouteFares_RouteFare();

	/**
	 * Returns the meta object for class '{@link Gtm.LegacyRouteFare <em>Legacy Route Fare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legacy Route Fare</em>'.
	 * @see Gtm.LegacyRouteFare
	 * @generated
	 */
	EClass getLegacyRouteFare();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacyRouteFare#getFareTableNumber <em>Fare Table Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fare Table Number</em>'.
	 * @see Gtm.LegacyRouteFare#getFareTableNumber()
	 * @see #getLegacyRouteFare()
	 * @generated
	 */
	EAttribute getLegacyRouteFare_FareTableNumber();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacyRouteFare#getSeriesNumber <em>Series Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Series Number</em>'.
	 * @see Gtm.LegacyRouteFare#getSeriesNumber()
	 * @see #getLegacyRouteFare()
	 * @generated
	 */
	EAttribute getLegacyRouteFare_SeriesNumber();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacyRouteFare#getFare2nd <em>Fare2nd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fare2nd</em>'.
	 * @see Gtm.LegacyRouteFare#getFare2nd()
	 * @see #getLegacyRouteFare()
	 * @generated
	 */
	EAttribute getLegacyRouteFare_Fare2nd();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacyRouteFare#getFare1st <em>Fare1st</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fare1st</em>'.
	 * @see Gtm.LegacyRouteFare#getFare1st()
	 * @see #getLegacyRouteFare()
	 * @generated
	 */
	EAttribute getLegacyRouteFare_Fare1st();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacyRouteFare#getReturnFare1st <em>Return Fare1st</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Fare1st</em>'.
	 * @see Gtm.LegacyRouteFare#getReturnFare1st()
	 * @see #getLegacyRouteFare()
	 * @generated
	 */
	EAttribute getLegacyRouteFare_ReturnFare1st();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacyRouteFare#getReturnFare2nd <em>Return Fare2nd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Fare2nd</em>'.
	 * @see Gtm.LegacyRouteFare#getReturnFare2nd()
	 * @see #getLegacyRouteFare()
	 * @generated
	 */
	EAttribute getLegacyRouteFare_ReturnFare2nd();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacyRouteFare#getValidFrom <em>Valid From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid From</em>'.
	 * @see Gtm.LegacyRouteFare#getValidFrom()
	 * @see #getLegacyRouteFare()
	 * @generated
	 */
	EAttribute getLegacyRouteFare_ValidFrom();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacyRouteFare#getValidUntil <em>Valid Until</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid Until</em>'.
	 * @see Gtm.LegacyRouteFare#getValidUntil()
	 * @see #getLegacyRouteFare()
	 * @generated
	 */
	EAttribute getLegacyRouteFare_ValidUntil();

	/**
	 * Returns the meta object for the reference '{@link Gtm.LegacyRouteFare#getSeries <em>Series</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Series</em>'.
	 * @see Gtm.LegacyRouteFare#getSeries()
	 * @see #getLegacyRouteFare()
	 * @generated
	 */
	EReference getLegacyRouteFare_Series();

	/**
	 * Returns the meta object for class '{@link Gtm.LegacySeriesList <em>Legacy Series List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legacy Series List</em>'.
	 * @see Gtm.LegacySeriesList
	 * @generated
	 */
	EClass getLegacySeriesList();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.LegacySeriesList#getSeries <em>Series</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Series</em>'.
	 * @see Gtm.LegacySeriesList#getSeries()
	 * @see #getLegacySeriesList()
	 * @generated
	 */
	EReference getLegacySeriesList_Series();

	/**
	 * Returns the meta object for class '{@link Gtm.LegacySeries <em>Legacy Series</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legacy Series</em>'.
	 * @see Gtm.LegacySeries
	 * @generated
	 */
	EClass getLegacySeries();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacySeries#getSupplyingCarrierCode <em>Supplying Carrier Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supplying Carrier Code</em>'.
	 * @see Gtm.LegacySeries#getSupplyingCarrierCode()
	 * @see #getLegacySeries()
	 * @generated
	 */
	EAttribute getLegacySeries_SupplyingCarrierCode();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacySeries#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see Gtm.LegacySeries#getNumber()
	 * @see #getLegacySeries()
	 * @generated
	 */
	EAttribute getLegacySeries_Number();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacySeries#getFareTableNumber <em>Fare Table Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fare Table Number</em>'.
	 * @see Gtm.LegacySeries#getFareTableNumber()
	 * @see #getLegacySeries()
	 * @generated
	 */
	EAttribute getLegacySeries_FareTableNumber();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacySeries#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see Gtm.LegacySeries#getType()
	 * @see #getLegacySeries()
	 * @generated
	 */
	EAttribute getLegacySeries_Type();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacySeries#getFromStation <em>From Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Station</em>'.
	 * @see Gtm.LegacySeries#getFromStation()
	 * @see #getLegacySeries()
	 * @generated
	 */
	EAttribute getLegacySeries_FromStation();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacySeries#getFromStationName <em>From Station Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Station Name</em>'.
	 * @see Gtm.LegacySeries#getFromStationName()
	 * @see #getLegacySeries()
	 * @generated
	 */
	EAttribute getLegacySeries_FromStationName();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacySeries#getToStation <em>To Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Station</em>'.
	 * @see Gtm.LegacySeries#getToStation()
	 * @see #getLegacySeries()
	 * @generated
	 */
	EAttribute getLegacySeries_ToStation();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacySeries#getToStationName <em>To Station Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Station Name</em>'.
	 * @see Gtm.LegacySeries#getToStationName()
	 * @see #getLegacySeries()
	 * @generated
	 */
	EAttribute getLegacySeries_ToStationName();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacySeries#getRouteNumber <em>Route Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Route Number</em>'.
	 * @see Gtm.LegacySeries#getRouteNumber()
	 * @see #getLegacySeries()
	 * @generated
	 */
	EAttribute getLegacySeries_RouteNumber();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacySeries#getCarrierCode <em>Carrier Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Carrier Code</em>'.
	 * @see Gtm.LegacySeries#getCarrierCode()
	 * @see #getLegacySeries()
	 * @generated
	 */
	EAttribute getLegacySeries_CarrierCode();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacySeries#getRouteDescription <em>Route Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Route Description</em>'.
	 * @see Gtm.LegacySeries#getRouteDescription()
	 * @see #getLegacySeries()
	 * @generated
	 */
	EAttribute getLegacySeries_RouteDescription();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacySeries#getPricetype <em>Pricetype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pricetype</em>'.
	 * @see Gtm.LegacySeries#getPricetype()
	 * @see #getLegacySeries()
	 * @generated
	 */
	EAttribute getLegacySeries_Pricetype();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacySeries#getDistance1 <em>Distance1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance1</em>'.
	 * @see Gtm.LegacySeries#getDistance1()
	 * @see #getLegacySeries()
	 * @generated
	 */
	EAttribute getLegacySeries_Distance1();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacySeries#getDistance2 <em>Distance2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance2</em>'.
	 * @see Gtm.LegacySeries#getDistance2()
	 * @see #getLegacySeries()
	 * @generated
	 */
	EAttribute getLegacySeries_Distance2();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.LegacySeries#getViastations <em>Viastations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Viastations</em>'.
	 * @see Gtm.LegacySeries#getViastations()
	 * @see #getLegacySeries()
	 * @generated
	 */
	EReference getLegacySeries_Viastations();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacySeries#getValidFrom <em>Valid From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid From</em>'.
	 * @see Gtm.LegacySeries#getValidFrom()
	 * @see #getLegacySeries()
	 * @generated
	 */
	EAttribute getLegacySeries_ValidFrom();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacySeries#getValidUntil <em>Valid Until</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid Until</em>'.
	 * @see Gtm.LegacySeries#getValidUntil()
	 * @see #getLegacySeries()
	 * @generated
	 */
	EAttribute getLegacySeries_ValidUntil();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacySeries#getBusCode <em>Bus Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bus Code</em>'.
	 * @see Gtm.LegacySeries#getBusCode()
	 * @see #getLegacySeries()
	 * @generated
	 */
	EAttribute getLegacySeries_BusCode();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacySeries#getFerryCode <em>Ferry Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ferry Code</em>'.
	 * @see Gtm.LegacySeries#getFerryCode()
	 * @see #getLegacySeries()
	 * @generated
	 */
	EAttribute getLegacySeries_FerryCode();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacySeries#getMemoNumber <em>Memo Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memo Number</em>'.
	 * @see Gtm.LegacySeries#getMemoNumber()
	 * @see #getLegacySeries()
	 * @generated
	 */
	EAttribute getLegacySeries_MemoNumber();

	/**
	 * Returns the meta object for class '{@link Gtm.LegacyCarriers <em>Legacy Carriers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legacy Carriers</em>'.
	 * @see Gtm.LegacyCarriers
	 * @generated
	 */
	EClass getLegacyCarriers();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.LegacyCarriers#getLegacyCarrier <em>Legacy Carrier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Legacy Carrier</em>'.
	 * @see Gtm.LegacyCarriers#getLegacyCarrier()
	 * @see #getLegacyCarriers()
	 * @generated
	 */
	EReference getLegacyCarriers_LegacyCarrier();

	/**
	 * Returns the meta object for class '{@link Gtm.LegacyCarrier <em>Legacy Carrier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legacy Carrier</em>'.
	 * @see Gtm.LegacyCarrier
	 * @generated
	 */
	EClass getLegacyCarrier();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacyCarrier#getCarrierCode <em>Carrier Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Carrier Code</em>'.
	 * @see Gtm.LegacyCarrier#getCarrierCode()
	 * @see #getLegacyCarrier()
	 * @generated
	 */
	EAttribute getLegacyCarrier_CarrierCode();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacyCarrier#getCarrierShortName <em>Carrier Short Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Carrier Short Name</em>'.
	 * @see Gtm.LegacyCarrier#getCarrierShortName()
	 * @see #getLegacyCarrier()
	 * @generated
	 */
	EAttribute getLegacyCarrier_CarrierShortName();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacyCarrier#getCarrierName <em>Carrier Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Carrier Name</em>'.
	 * @see Gtm.LegacyCarrier#getCarrierName()
	 * @see #getLegacyCarrier()
	 * @generated
	 */
	EAttribute getLegacyCarrier_CarrierName();

	/**
	 * Returns the meta object for class '{@link Gtm.LegacySeparateContractSeriesList <em>Legacy Separate Contract Series List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legacy Separate Contract Series List</em>'.
	 * @see Gtm.LegacySeparateContractSeriesList
	 * @generated
	 */
	EClass getLegacySeparateContractSeriesList();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.LegacySeparateContractSeriesList#getSeparateContractSeries <em>Separate Contract Series</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Separate Contract Series</em>'.
	 * @see Gtm.LegacySeparateContractSeriesList#getSeparateContractSeries()
	 * @see #getLegacySeparateContractSeriesList()
	 * @generated
	 */
	EReference getLegacySeparateContractSeriesList_SeparateContractSeries();

	/**
	 * Returns the meta object for class '{@link Gtm.LegacySeparateContractSeries <em>Legacy Separate Contract Series</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legacy Separate Contract Series</em>'.
	 * @see Gtm.LegacySeparateContractSeries
	 * @generated
	 */
	EClass getLegacySeparateContractSeries();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacySeparateContractSeries#getSeriesNumber <em>Series Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Series Number</em>'.
	 * @see Gtm.LegacySeparateContractSeries#getSeriesNumber()
	 * @see #getLegacySeparateContractSeries()
	 * @generated
	 */
	EAttribute getLegacySeparateContractSeries_SeriesNumber();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacySeparateContractSeries#getValidFrom <em>Valid From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid From</em>'.
	 * @see Gtm.LegacySeparateContractSeries#getValidFrom()
	 * @see #getLegacySeparateContractSeries()
	 * @generated
	 */
	EAttribute getLegacySeparateContractSeries_ValidFrom();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacySeparateContractSeries#getValidUntil <em>Valid Until</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid Until</em>'.
	 * @see Gtm.LegacySeparateContractSeries#getValidUntil()
	 * @see #getLegacySeparateContractSeries()
	 * @generated
	 */
	EAttribute getLegacySeparateContractSeries_ValidUntil();

	/**
	 * Returns the meta object for the reference '{@link Gtm.LegacySeparateContractSeries#getSeries <em>Series</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Series</em>'.
	 * @see Gtm.LegacySeparateContractSeries#getSeries()
	 * @see #getLegacySeparateContractSeries()
	 * @generated
	 */
	EReference getLegacySeparateContractSeries_Series();

	/**
	 * Returns the meta object for class '{@link Gtm.LegacyDistanceFares <em>Legacy Distance Fares</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legacy Distance Fares</em>'.
	 * @see Gtm.LegacyDistanceFares
	 * @generated
	 */
	EClass getLegacyDistanceFares();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.LegacyDistanceFares#getDistanceFare <em>Distance Fare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Distance Fare</em>'.
	 * @see Gtm.LegacyDistanceFares#getDistanceFare()
	 * @see #getLegacyDistanceFares()
	 * @generated
	 */
	EReference getLegacyDistanceFares_DistanceFare();

	/**
	 * Returns the meta object for class '{@link Gtm.LegacyDistanceFare <em>Legacy Distance Fare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legacy Distance Fare</em>'.
	 * @see Gtm.LegacyDistanceFare
	 * @generated
	 */
	EClass getLegacyDistanceFare();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacyDistanceFare#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance</em>'.
	 * @see Gtm.LegacyDistanceFare#getDistance()
	 * @see #getLegacyDistanceFare()
	 * @generated
	 */
	EAttribute getLegacyDistanceFare_Distance();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacyDistanceFare#getFare2nd <em>Fare2nd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fare2nd</em>'.
	 * @see Gtm.LegacyDistanceFare#getFare2nd()
	 * @see #getLegacyDistanceFare()
	 * @generated
	 */
	EAttribute getLegacyDistanceFare_Fare2nd();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacyDistanceFare#getFare1st <em>Fare1st</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fare1st</em>'.
	 * @see Gtm.LegacyDistanceFare#getFare1st()
	 * @see #getLegacyDistanceFare()
	 * @generated
	 */
	EAttribute getLegacyDistanceFare_Fare1st();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacyDistanceFare#getFareTableNumber <em>Fare Table Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fare Table Number</em>'.
	 * @see Gtm.LegacyDistanceFare#getFareTableNumber()
	 * @see #getLegacyDistanceFare()
	 * @generated
	 */
	EAttribute getLegacyDistanceFare_FareTableNumber();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacyDistanceFare#getReturnFare1st <em>Return Fare1st</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Fare1st</em>'.
	 * @see Gtm.LegacyDistanceFare#getReturnFare1st()
	 * @see #getLegacyDistanceFare()
	 * @generated
	 */
	EAttribute getLegacyDistanceFare_ReturnFare1st();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacyDistanceFare#getReturnFare2nd <em>Return Fare2nd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Fare2nd</em>'.
	 * @see Gtm.LegacyDistanceFare#getReturnFare2nd()
	 * @see #getLegacyDistanceFare()
	 * @generated
	 */
	EAttribute getLegacyDistanceFare_ReturnFare2nd();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacyDistanceFare#getValidFrom <em>Valid From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid From</em>'.
	 * @see Gtm.LegacyDistanceFare#getValidFrom()
	 * @see #getLegacyDistanceFare()
	 * @generated
	 */
	EAttribute getLegacyDistanceFare_ValidFrom();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacyDistanceFare#getValidUntil <em>Valid Until</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid Until</em>'.
	 * @see Gtm.LegacyDistanceFare#getValidUntil()
	 * @see #getLegacyDistanceFare()
	 * @generated
	 */
	EAttribute getLegacyDistanceFare_ValidUntil();

	/**
	 * Returns the meta object for class '{@link Gtm.LegacyViastation <em>Legacy Viastation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legacy Viastation</em>'.
	 * @see Gtm.LegacyViastation
	 * @generated
	 */
	EClass getLegacyViastation();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacyViastation#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see Gtm.LegacyViastation#getPosition()
	 * @see #getLegacyViastation()
	 * @generated
	 */
	EAttribute getLegacyViastation_Position();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacyViastation#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see Gtm.LegacyViastation#getCode()
	 * @see #getLegacyViastation()
	 * @generated
	 */
	EAttribute getLegacyViastation_Code();

	/**
	 * Returns the meta object for the attribute '{@link Gtm.LegacyViastation#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see Gtm.LegacyViastation#isOptional()
	 * @see #getLegacyViastation()
	 * @generated
	 */
	EAttribute getLegacyViastation_Optional();

	/**
	 * Returns the meta object for enum '{@link Gtm.BoardingOrArrival <em>Boarding Or Arrival</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Boarding Or Arrival</em>'.
	 * @see Gtm.BoardingOrArrival
	 * @generated
	 */
	EEnum getBoardingOrArrival();

	/**
	 * Returns the meta object for enum '{@link Gtm.ConditionType <em>Condition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Condition Type</em>'.
	 * @see Gtm.ConditionType
	 * @generated
	 */
	EEnum getConditionType();

	/**
	 * Returns the meta object for enum '{@link Gtm.LuggageRule <em>Luggage Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Luggage Rule</em>'.
	 * @see Gtm.LuggageRule
	 * @generated
	 */
	EEnum getLuggageRule();

	/**
	 * Returns the meta object for enum '{@link Gtm.Dimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Dimension</em>'.
	 * @see Gtm.Dimension
	 * @generated
	 */
	EEnum getDimension();

	/**
	 * Returns the meta object for enum '{@link Gtm.AddCarrierScope <em>Add Carrier Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Add Carrier Scope</em>'.
	 * @see Gtm.AddCarrierScope
	 * @generated
	 */
	EEnum getAddCarrierScope();

	/**
	 * Returns the meta object for enum '{@link Gtm.TransportMode <em>Transport Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transport Mode</em>'.
	 * @see Gtm.TransportMode
	 * @generated
	 */
	EEnum getTransportMode();

	/**
	 * Returns the meta object for class '{@link Gtm.LegacyFareTemplates <em>Legacy Fare Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legacy Fare Templates</em>'.
	 * @see Gtm.LegacyFareTemplates
	 * @generated
	 */
	EClass getLegacyFareTemplates();

	/**
	 * Returns the meta object for the containment reference list '{@link Gtm.LegacyFareTemplates#getFareTemplates <em>Fare Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fare Templates</em>'.
	 * @see Gtm.LegacyFareTemplates#getFareTemplates()
	 * @see #getLegacyFareTemplates()
	 * @generated
	 */
	EReference getLegacyFareTemplates_FareTemplates();

	/**
	 * Returns the meta object for enum '{@link Gtm.StationRelationType <em>Station Relation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Station Relation Type</em>'.
	 * @see Gtm.StationRelationType
	 * @generated
	 */
	EEnum getStationRelationType();

	/**
	 * Returns the meta object for enum '{@link Gtm.StationFareDetailType <em>Station Fare Detail Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Station Fare Detail Type</em>'.
	 * @see Gtm.StationFareDetailType
	 * @generated
	 */
	EEnum getStationFareDetailType();

	/**
	 * Returns the meta object for enum '{@link Gtm.RegulatoryCondition <em>Regulatory Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Regulatory Condition</em>'.
	 * @see Gtm.RegulatoryCondition
	 * @generated
	 */
	EEnum getRegulatoryCondition();

	/**
	 * Returns the meta object for enum '{@link Gtm.AfterSalesTransactionType <em>After Sales Transaction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>After Sales Transaction Type</em>'.
	 * @see Gtm.AfterSalesTransactionType
	 * @generated
	 */
	EEnum getAfterSalesTransactionType();

	/**
	 * Returns the meta object for enum '{@link Gtm.BarcodeTypes <em>Barcode Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Barcode Types</em>'.
	 * @see Gtm.BarcodeTypes
	 * @generated
	 */
	EEnum getBarcodeTypes();

	/**
	 * Returns the meta object for enum '{@link Gtm.ClassicClassType <em>Classic Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Classic Class Type</em>'.
	 * @see Gtm.ClassicClassType
	 * @generated
	 */
	EEnum getClassicClassType();

	/**
	 * Returns the meta object for enum '{@link Gtm.CharacterSet <em>Character Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Character Set</em>'.
	 * @see Gtm.CharacterSet
	 * @generated
	 */
	EEnum getCharacterSet();

	/**
	 * Returns the meta object for enum '{@link Gtm.Clusters <em>Clusters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Clusters</em>'.
	 * @see Gtm.Clusters
	 * @generated
	 */
	EEnum getClusters();

	/**
	 * Returns the meta object for enum '{@link Gtm.CombinationModel <em>Combination Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Combination Model</em>'.
	 * @see Gtm.CombinationModel
	 * @generated
	 */
	EEnum getCombinationModel();

	/**
	 * Returns the meta object for enum '{@link Gtm.ControlDataExchangeTypes <em>Control Data Exchange Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Control Data Exchange Types</em>'.
	 * @see Gtm.ControlDataExchangeTypes
	 * @generated
	 */
	EEnum getControlDataExchangeTypes();

	/**
	 * Returns the meta object for enum '{@link Gtm.FareType <em>Fare Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fare Type</em>'.
	 * @see Gtm.FareType
	 * @generated
	 */
	EEnum getFareType();

	/**
	 * Returns the meta object for enum '{@link Gtm.FulfillmentType <em>Fulfillment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fulfillment Type</em>'.
	 * @see Gtm.FulfillmentType
	 * @generated
	 */
	EEnum getFulfillmentType();

	/**
	 * Returns the meta object for enum '{@link Gtm.GeoSystem <em>Geo System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Geo System</em>'.
	 * @see Gtm.GeoSystem
	 * @generated
	 */
	EEnum getGeoSystem();

	/**
	 * Returns the meta object for enum '{@link Gtm.GeoUnit <em>Geo Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Geo Unit</em>'.
	 * @see Gtm.GeoUnit
	 * @generated
	 */
	EEnum getGeoUnit();

	/**
	 * Returns the meta object for enum '{@link Gtm.GraphicalReservationType <em>Graphical Reservation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Graphical Reservation Type</em>'.
	 * @see Gtm.GraphicalReservationType
	 * @generated
	 */
	EEnum getGraphicalReservationType();

	/**
	 * Returns the meta object for enum '{@link Gtm.HemisphereEW <em>Hemisphere EW</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Hemisphere EW</em>'.
	 * @see Gtm.HemisphereEW
	 * @generated
	 */
	EEnum getHemisphereEW();

	/**
	 * Returns the meta object for enum '{@link Gtm.HemisphereNS <em>Hemisphere NS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Hemisphere NS</em>'.
	 * @see Gtm.HemisphereNS
	 * @generated
	 */
	EEnum getHemisphereNS();

	/**
	 * Returns the meta object for enum '{@link Gtm.InterfaceType <em>Interface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Interface Type</em>'.
	 * @see Gtm.InterfaceType
	 * @generated
	 */
	EEnum getInterfaceType();

	/**
	 * Returns the meta object for enum '{@link Gtm.LegacyCalculationType <em>Legacy Calculation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Legacy Calculation Type</em>'.
	 * @see Gtm.LegacyCalculationType
	 * @generated
	 */
	EEnum getLegacyCalculationType();

	/**
	 * Returns the meta object for enum '{@link Gtm.LegacyPassengerType <em>Legacy Passenger Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Legacy Passenger Type</em>'.
	 * @see Gtm.LegacyPassengerType
	 * @generated
	 */
	EEnum getLegacyPassengerType();

	/**
	 * Returns the meta object for enum '{@link Gtm.LegacySeriesType <em>Legacy Series Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Legacy Series Type</em>'.
	 * @see Gtm.LegacySeriesType
	 * @generated
	 */
	EEnum getLegacySeriesType();

	/**
	 * Returns the meta object for enum '{@link Gtm.LegacyConversionType <em>Legacy Conversion Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Legacy Conversion Type</em>'.
	 * @see Gtm.LegacyConversionType
	 * @generated
	 */
	EEnum getLegacyConversionType();

	/**
	 * Returns the meta object for enum '{@link Gtm.OfferRequestType <em>Offer Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Offer Request Type</em>'.
	 * @see Gtm.OfferRequestType
	 * @generated
	 */
	EEnum getOfferRequestType();

	/**
	 * Returns the meta object for enum '{@link Gtm.OnlineServiceType <em>Online Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Online Service Type</em>'.
	 * @see Gtm.OnlineServiceType
	 * @generated
	 */
	EEnum getOnlineServiceType();

	/**
	 * Returns the meta object for enum '{@link Gtm.PersonalDataItemsType <em>Personal Data Items Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Personal Data Items Type</em>'.
	 * @see Gtm.PersonalDataItemsType
	 * @generated
	 */
	EEnum getPersonalDataItemsType();

	/**
	 * Returns the meta object for enum '{@link Gtm.PersonalDataTransferType <em>Personal Data Transfer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Personal Data Transfer Type</em>'.
	 * @see Gtm.PersonalDataTransferType
	 * @generated
	 */
	EEnum getPersonalDataTransferType();

	/**
	 * Returns the meta object for enum '{@link Gtm.PersonalDataChangeReason <em>Personal Data Change Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Personal Data Change Reason</em>'.
	 * @see Gtm.PersonalDataChangeReason
	 * @generated
	 */
	EEnum getPersonalDataChangeReason();

	/**
	 * Returns the meta object for enum '{@link Gtm.ProductType <em>Product Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Product Type</em>'.
	 * @see Gtm.ProductType
	 * @generated
	 */
	EEnum getProductType();

	/**
	 * Returns the meta object for enum '{@link Gtm.ReservationTravelClass <em>Reservation Travel Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reservation Travel Class</em>'.
	 * @see Gtm.ReservationTravelClass
	 * @generated
	 */
	EEnum getReservationTravelClass();

	/**
	 * Returns the meta object for enum '{@link Gtm.ReservationServiceLevel <em>Reservation Service Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reservation Service Level</em>'.
	 * @see Gtm.ReservationServiceLevel
	 * @generated
	 */
	EEnum getReservationServiceLevel();

	/**
	 * Returns the meta object for enum '{@link Gtm.ReservationService <em>Reservation Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reservation Service</em>'.
	 * @see Gtm.ReservationService
	 * @generated
	 */
	EEnum getReservationService();

	/**
	 * Returns the meta object for enum '{@link Gtm.ReservationBerthType <em>Reservation Berth Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reservation Berth Type</em>'.
	 * @see Gtm.ReservationBerthType
	 * @generated
	 */
	EEnum getReservationBerthType();

	/**
	 * Returns the meta object for enum '{@link Gtm.SchemaVersion <em>Schema Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Schema Version</em>'.
	 * @see Gtm.SchemaVersion
	 * @generated
	 */
	EEnum getSchemaVersion();

	/**
	 * Returns the meta object for enum '{@link Gtm.TimeZone <em>Time Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Time Zone</em>'.
	 * @see Gtm.TimeZone
	 * @generated
	 */
	EEnum getTimeZone();

	/**
	 * Returns the meta object for enum '{@link Gtm.TaxScope <em>Tax Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tax Scope</em>'.
	 * @see Gtm.TaxScope
	 * @generated
	 */
	EEnum getTaxScope();

	/**
	 * Returns the meta object for enum '{@link Gtm.TimeReferenceType <em>Time Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Time Reference Type</em>'.
	 * @see Gtm.TimeReferenceType
	 * @generated
	 */
	EEnum getTimeReferenceType();

	/**
	 * Returns the meta object for enum '{@link Gtm.TimeRangeScope <em>Time Range Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Time Range Scope</em>'.
	 * @see Gtm.TimeRangeScope
	 * @generated
	 */
	EEnum getTimeRangeScope();

	/**
	 * Returns the meta object for enum '{@link Gtm.TimeUnit <em>Time Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Time Unit</em>'.
	 * @see Gtm.TimeUnit
	 * @generated
	 */
	EEnum getTimeUnit();

	/**
	 * Returns the meta object for enum '{@link Gtm.TravelerType <em>Traveler Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Traveler Type</em>'.
	 * @see Gtm.TravelerType
	 * @generated
	 */
	EEnum getTravelerType();

	/**
	 * Returns the meta object for enum '{@link Gtm.TripAllocationProcess <em>Trip Allocation Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Trip Allocation Process</em>'.
	 * @see Gtm.TripAllocationProcess
	 * @generated
	 */
	EEnum getTripAllocationProcess();

	/**
	 * Returns the meta object for enum '{@link Gtm.TripAllocationUnit <em>Trip Allocation Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Trip Allocation Unit</em>'.
	 * @see Gtm.TripAllocationUnit
	 * @generated
	 */
	EEnum getTripAllocationUnit();

	/**
	 * Returns the meta object for enum '{@link Gtm.TripInterruptionProcess <em>Trip Interruption Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Trip Interruption Process</em>'.
	 * @see Gtm.TripInterruptionProcess
	 * @generated
	 */
	EEnum getTripInterruptionProcess();

	/**
	 * Returns the meta object for enum '{@link Gtm.TravelValidityType <em>Travel Validity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Travel Validity Type</em>'.
	 * @see Gtm.TravelValidityType
	 * @generated
	 */
	EEnum getTravelValidityType();

	/**
	 * Returns the meta object for enum '{@link Gtm.WeekDay <em>Week Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Week Day</em>'.
	 * @see Gtm.WeekDay
	 * @generated
	 */
	EEnum getWeekDay();

	/**
	 * Returns the meta object for enum '{@link Gtm.BasePriceClassType <em>Base Price Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Base Price Class Type</em>'.
	 * @see Gtm.BasePriceClassType
	 * @generated
	 */
	EEnum getBasePriceClassType();

	/**
	 * Returns the meta object for data type '{@link java.util.Date <em>Date As Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date As Date</em>'.
	 * @see java.util.Date
	 * @model instanceClass="java.util.Date"
	 *        annotation="http:///org/eclipse/emf/ecore/util/DateConversionDelegate format='//SimpleDateFormat/yyyy-MM-dd'"
	 * @generated
	 */
	EDataType getDateAsDate();

	/**
	 * Returns the meta object for data type '{@link java.util.Date <em>Date As Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date As Date Time</em>'.
	 * @see java.util.Date
	 * @model instanceClass="java.util.Date"
	 *        annotation="http:///org/eclipse/emf/ecore/util/DateConversionDelegate format='//SimpleDateFormat/yyyy-MM-dd\'T\'HH:mm:ss\'.\'SSSZ'"
	 * @generated
	 */
	EDataType getDateAsDateTime();

	/**
	 * Returns the meta object for enum '{@link Gtm.DataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Source</em>'.
	 * @see Gtm.DataSource
	 * @generated
	 */
	EEnum getDataSource();

	/**
	 * Returns the meta object for enum '{@link Gtm.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Type</em>'.
	 * @see Gtm.DataType
	 * @generated
	 */
	EEnum getDataType();

	/**
	 * Returns the meta object for enum '{@link Gtm.ClassId <em>Class Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Class Id</em>'.
	 * @see Gtm.ClassId
	 * @generated
	 */
	EEnum getClassId();

	/**
	 * Returns the meta object for enum '{@link Gtm.GenericReductionCards <em>Generic Reduction Cards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Generic Reduction Cards</em>'.
	 * @see Gtm.GenericReductionCards
	 * @generated
	 */
	EEnum getGenericReductionCards();

	/**
	 * Returns the meta object for enum '{@link Gtm.ServiceMode <em>Service Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Service Mode</em>'.
	 * @see Gtm.ServiceMode
	 * @generated
	 */
	EEnum getServiceMode();

	/**
	 * Returns the meta object for enum '{@link Gtm.RoundingType <em>Rounding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rounding Type</em>'.
	 * @see Gtm.RoundingType
	 * @generated
	 */
	EEnum getRoundingType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GtmFactory getGtmFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Gtm.impl.GTMToolImpl <em>GTM Tool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.GTMToolImpl
		 * @see Gtm.impl.GtmPackageImpl#getGTMTool()
		 * @generated
		 */
		EClass GTM_TOOL = eINSTANCE.getGTMTool();

		/**
		 * The meta object literal for the '<em><b>Conversion From Legacy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GTM_TOOL__CONVERSION_FROM_LEGACY = eINSTANCE.getGTMTool_ConversionFromLegacy();

		/**
		 * The meta object literal for the '<em><b>Code Lists</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GTM_TOOL__CODE_LISTS = eINSTANCE.getGTMTool_CodeLists();

		/**
		 * The meta object literal for the '<em><b>General Tariff Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GTM_TOOL__GENERAL_TARIFF_MODEL = eINSTANCE.getGTMTool_GeneralTariffModel();

		/**
		 * The meta object literal for the '<em><b>Workflow History</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GTM_TOOL__WORKFLOW_HISTORY = eINSTANCE.getGTMTool_WorkflowHistory();

		/**
		 * The meta object literal for the '{@link Gtm.impl.CodeListsImpl <em>Code Lists</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.CodeListsImpl
		 * @see Gtm.impl.GtmPackageImpl#getCodeLists()
		 * @generated
		 */
		EClass CODE_LISTS = eINSTANCE.getCodeLists();

		/**
		 * The meta object literal for the '<em><b>Carriers</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_LISTS__CARRIERS = eINSTANCE.getCodeLists_Carriers();

		/**
		 * The meta object literal for the '<em><b>Stations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_LISTS__STATIONS = eINSTANCE.getCodeLists_Stations();

		/**
		 * The meta object literal for the '<em><b>Countries</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_LISTS__COUNTRIES = eINSTANCE.getCodeLists_Countries();

		/**
		 * The meta object literal for the '<em><b>Languages</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_LISTS__LANGUAGES = eINSTANCE.getCodeLists_Languages();

		/**
		 * The meta object literal for the '<em><b>Currencies</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_LISTS__CURRENCIES = eINSTANCE.getCodeLists_Currencies();

		/**
		 * The meta object literal for the '<em><b>Service Brands</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_LISTS__SERVICE_BRANDS = eINSTANCE.getCodeLists_ServiceBrands();

		/**
		 * The meta object literal for the '<em><b>Nuts Codes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_LISTS__NUTS_CODES = eINSTANCE.getCodeLists_NutsCodes();

		/**
		 * The meta object literal for the '{@link Gtm.impl.WorkflowHistoryImpl <em>Workflow History</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.WorkflowHistoryImpl
		 * @see Gtm.impl.GtmPackageImpl#getWorkflowHistory()
		 * @generated
		 */
		EClass WORKFLOW_HISTORY = eINSTANCE.getWorkflowHistory();

		/**
		 * The meta object literal for the '<em><b>Workflow Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_HISTORY__WORKFLOW_STEPS = eINSTANCE.getWorkflowHistory_WorkflowSteps();

		/**
		 * The meta object literal for the '{@link Gtm.impl.WorkflowStepImpl <em>Workflow Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.WorkflowStepImpl
		 * @see Gtm.impl.GtmPackageImpl#getWorkflowStep()
		 * @generated
		 */
		EClass WORKFLOW_STEP = eINSTANCE.getWorkflowStep();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW_STEP__TIME = eINSTANCE.getWorkflowStep_Time();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW_STEP__DESCRIPTION = eINSTANCE.getWorkflowStep_Description();

		/**
		 * The meta object literal for the '{@link Gtm.impl.NUTSCodesImpl <em>NUTS Codes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.NUTSCodesImpl
		 * @see Gtm.impl.GtmPackageImpl#getNUTSCodes()
		 * @generated
		 */
		EClass NUTS_CODES = eINSTANCE.getNUTSCodes();

		/**
		 * The meta object literal for the '<em><b>Nuts Codes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUTS_CODES__NUTS_CODES = eINSTANCE.getNUTSCodes_NutsCodes();

		/**
		 * The meta object literal for the '{@link Gtm.impl.NutsCodeImpl <em>Nuts Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.NutsCodeImpl
		 * @see Gtm.impl.GtmPackageImpl#getNutsCode()
		 * @generated
		 */
		EClass NUTS_CODE = eINSTANCE.getNutsCode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUTS_CODE__NAME = eINSTANCE.getNutsCode_Name();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUTS_CODE__CODE = eINSTANCE.getNutsCode_Code();

		/**
		 * The meta object literal for the '{@link Gtm.impl.ServiceBrandsImpl <em>Service Brands</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.ServiceBrandsImpl
		 * @see Gtm.impl.GtmPackageImpl#getServiceBrands()
		 * @generated
		 */
		EClass SERVICE_BRANDS = eINSTANCE.getServiceBrands();

		/**
		 * The meta object literal for the '<em><b>Service Brands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_BRANDS__SERVICE_BRANDS = eINSTANCE.getServiceBrands_ServiceBrands();

		/**
		 * The meta object literal for the '<em><b>Find Service BRand</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SERVICE_BRANDS___FIND_SERVICE_BRAND__INT = eINSTANCE.getServiceBrands__FindServiceBRand__int();

		/**
		 * The meta object literal for the '{@link Gtm.impl.ServiceBrandImpl <em>Service Brand</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.ServiceBrandImpl
		 * @see Gtm.impl.GtmPackageImpl#getServiceBrand()
		 * @generated
		 */
		EClass SERVICE_BRAND = eINSTANCE.getServiceBrand();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_BRAND__CODE = eINSTANCE.getServiceBrand_Code();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_BRAND__NAME = eINSTANCE.getServiceBrand_Name();

		/**
		 * The meta object literal for the '<em><b>Abbreviation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_BRAND__ABBREVIATION = eINSTANCE.getServiceBrand_Abbreviation();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_BRAND__DESCRIPTION = eINSTANCE.getServiceBrand_Description();

		/**
		 * The meta object literal for the '<em><b>Transport Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_BRAND__TRANSPORT_MODE = eINSTANCE.getServiceBrand_TransportMode();

		/**
		 * The meta object literal for the '<em><b>Local Language Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_BRAND__LOCAL_LANGUAGE_NAME = eINSTANCE.getServiceBrand_LocalLanguageName();

		/**
		 * The meta object literal for the '{@link Gtm.impl.CountriesImpl <em>Countries</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.CountriesImpl
		 * @see Gtm.impl.GtmPackageImpl#getCountries()
		 * @generated
		 */
		EClass COUNTRIES = eINSTANCE.getCountries();

		/**
		 * The meta object literal for the '<em><b>Countries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNTRIES__COUNTRIES = eINSTANCE.getCountries_Countries();

		/**
		 * The meta object literal for the '<em><b>Find Country</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COUNTRIES___FIND_COUNTRY__INT = eINSTANCE.getCountries__FindCountry__int();

		/**
		 * The meta object literal for the '{@link Gtm.impl.CountryImpl <em>Country</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.CountryImpl
		 * @see Gtm.impl.GtmPackageImpl#getCountry()
		 * @generated
		 */
		EClass COUNTRY = eINSTANCE.getCountry();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTRY__CODE = eINSTANCE.getCountry_Code();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTRY__NAME = eINSTANCE.getCountry_Name();

		/**
		 * The meta object literal for the '<em><b>IS Ocode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTRY__IS_OCODE = eINSTANCE.getCountry_ISOcode();

		/**
		 * The meta object literal for the '<em><b>Default Character Set</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTRY__DEFAULT_CHARACTER_SET = eINSTANCE.getCountry_DefaultCharacterSet();

		/**
		 * The meta object literal for the '{@link Gtm.impl.LanguagesImpl <em>Languages</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.LanguagesImpl
		 * @see Gtm.impl.GtmPackageImpl#getLanguages()
		 * @generated
		 */
		EClass LANGUAGES = eINSTANCE.getLanguages();

		/**
		 * The meta object literal for the '<em><b>Languages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANGUAGES__LANGUAGES = eINSTANCE.getLanguages_Languages();

		/**
		 * The meta object literal for the '{@link Gtm.impl.LanguageImpl <em>Language</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.LanguageImpl
		 * @see Gtm.impl.GtmPackageImpl#getLanguage()
		 * @generated
		 */
		EClass LANGUAGE = eINSTANCE.getLanguage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE__NAME = eINSTANCE.getLanguage_Name();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE__CODE = eINSTANCE.getLanguage_Code();

		/**
		 * The meta object literal for the '{@link Gtm.impl.CurrenciesImpl <em>Currencies</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.CurrenciesImpl
		 * @see Gtm.impl.GtmPackageImpl#getCurrencies()
		 * @generated
		 */
		EClass CURRENCIES = eINSTANCE.getCurrencies();

		/**
		 * The meta object literal for the '<em><b>Currencies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURRENCIES__CURRENCIES = eINSTANCE.getCurrencies_Currencies();

		/**
		 * The meta object literal for the '<em><b>Find Currency</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CURRENCIES___FIND_CURRENCY__STRING = eINSTANCE.getCurrencies__FindCurrency__String();

		/**
		 * The meta object literal for the '{@link Gtm.impl.CurrencyImpl <em>Currency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.CurrencyImpl
		 * @see Gtm.impl.GtmPackageImpl#getCurrency()
		 * @generated
		 */
		EClass CURRENCY = eINSTANCE.getCurrency();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENCY__NAME = eINSTANCE.getCurrency_Name();

		/**
		 * The meta object literal for the '<em><b>Iso Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENCY__ISO_CODE = eINSTANCE.getCurrency_IsoCode();

		/**
		 * The meta object literal for the '{@link Gtm.impl.StationsImpl <em>Stations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.StationsImpl
		 * @see Gtm.impl.GtmPackageImpl#getStations()
		 * @generated
		 */
		EClass STATIONS = eINSTANCE.getStations();

		/**
		 * The meta object literal for the '<em><b>Stations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATIONS__STATIONS = eINSTANCE.getStations_Stations();

		/**
		 * The meta object literal for the '<em><b>Find Station</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATIONS___FIND_STATION__INT_INT = eINSTANCE.getStations__FindStation__int_int();

		/**
		 * The meta object literal for the '<em><b>Find Station</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATIONS___FIND_STATION__INT_STRING = eINSTANCE.getStations__FindStation__int_String();

		/**
		 * The meta object literal for the '{@link Gtm.impl.StationImpl <em>Station</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.StationImpl
		 * @see Gtm.impl.GtmPackageImpl#getStation()
		 * @generated
		 */
		EClass STATION = eINSTANCE.getStation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATION__NAME = eINSTANCE.getStation_Name();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATION__COUNTRY = eINSTANCE.getStation_Country();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATION__CODE = eINSTANCE.getStation_Code();

		/**
		 * The meta object literal for the '<em><b>Longitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATION__LONGITUDE = eINSTANCE.getStation_Longitude();

		/**
		 * The meta object literal for the '<em><b>Latitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATION__LATITUDE = eINSTANCE.getStation_Latitude();

		/**
		 * The meta object literal for the '<em><b>Timetable Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATION__TIMETABLE_NAME = eINSTANCE.getStation_TimetableName();

		/**
		 * The meta object literal for the '<em><b>Border Station</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATION__BORDER_STATION = eINSTANCE.getStation_BorderStation();

		/**
		 * The meta object literal for the '<em><b>Name Case UTF8</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATION__NAME_CASE_UTF8 = eINSTANCE.getStation_NameCaseUTF8();

		/**
		 * The meta object literal for the '<em><b>Name Case ASCII</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATION__NAME_CASE_ASCII = eINSTANCE.getStation_NameCaseASCII();

		/**
		 * The meta object literal for the '<em><b>Short Name Case ASCII</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATION__SHORT_NAME_CASE_ASCII = eINSTANCE.getStation_ShortNameCaseASCII();

		/**
		 * The meta object literal for the '<em><b>Short Name Case UTF8</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATION__SHORT_NAME_CASE_UTF8 = eINSTANCE.getStation_ShortNameCaseUTF8();

		/**
		 * The meta object literal for the '<em><b>Legacy Border Point Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATION__LEGACY_BORDER_POINT_CODE = eINSTANCE.getStation_LegacyBorderPointCode();

		/**
		 * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATION__RELATIONS = eINSTANCE.getStation_Relations();

		/**
		 * The meta object literal for the '<em><b>Station Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATION__STATION_CODE = eINSTANCE.getStation_StationCode();

		/**
		 * The meta object literal for the '{@link Gtm.impl.StationRelationImpl <em>Station Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.StationRelationImpl
		 * @see Gtm.impl.GtmPackageImpl#getStationRelation()
		 * @generated
		 */
		EClass STATION_RELATION = eINSTANCE.getStationRelation();

		/**
		 * The meta object literal for the '<em><b>Relation Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATION_RELATION__RELATION_TYPE = eINSTANCE.getStationRelation_RelationType();

		/**
		 * The meta object literal for the '<em><b>Station</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATION_RELATION__STATION = eINSTANCE.getStationRelation_Station();

		/**
		 * The meta object literal for the '{@link Gtm.impl.CarrierImpl <em>Carrier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.CarrierImpl
		 * @see Gtm.impl.GtmPackageImpl#getCarrier()
		 * @generated
		 */
		EClass CARRIER = eINSTANCE.getCarrier();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARRIER__CODE = eINSTANCE.getCarrier_Code();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARRIER__NAME = eINSTANCE.getCarrier_Name();

		/**
		 * The meta object literal for the '<em><b>Short Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARRIER__SHORT_NAME = eINSTANCE.getCarrier_ShortName();

		/**
		 * The meta object literal for the '{@link Gtm.impl.CarriersImpl <em>Carriers</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.CarriersImpl
		 * @see Gtm.impl.GtmPackageImpl#getCarriers()
		 * @generated
		 */
		EClass CARRIERS = eINSTANCE.getCarriers();

		/**
		 * The meta object literal for the '<em><b>Carriers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARRIERS__CARRIERS = eINSTANCE.getCarriers_Carriers();

		/**
		 * The meta object literal for the '<em><b>Find Carrier</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CARRIERS___FIND_CARRIER__STRING = eINSTANCE.getCarriers__FindCarrier__String();

		/**
		 * The meta object literal for the '{@link Gtm.impl.StationSetImpl <em>Station Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.StationSetImpl
		 * @see Gtm.impl.GtmPackageImpl#getStationSet()
		 * @generated
		 */
		EClass STATION_SET = eINSTANCE.getStationSet();

		/**
		 * The meta object literal for the '<em><b>Stations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATION_SET__STATIONS = eINSTANCE.getStationSet_Stations();

		/**
		 * The meta object literal for the '{@link Gtm.impl.GeneralTariffModelImpl <em>General Tariff Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.GeneralTariffModelImpl
		 * @see Gtm.impl.GtmPackageImpl#getGeneralTariffModel()
		 * @generated
		 */
		EClass GENERAL_TARIFF_MODEL = eINSTANCE.getGeneralTariffModel();

		/**
		 * The meta object literal for the '<em><b>Delivery</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERAL_TARIFF_MODEL__DELIVERY = eINSTANCE.getGeneralTariffModel_Delivery();

		/**
		 * The meta object literal for the '<em><b>Fare Structure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERAL_TARIFF_MODEL__FARE_STRUCTURE = eINSTANCE.getGeneralTariffModel_FareStructure();

		/**
		 * The meta object literal for the '{@link Gtm.impl.DeliveryImpl <em>Delivery</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.DeliveryImpl
		 * @see Gtm.impl.GtmPackageImpl#getDelivery()
		 * @generated
		 */
		EClass DELIVERY = eINSTANCE.getDelivery();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELIVERY__ID = eINSTANCE.getDelivery_Id();

		/**
		 * The meta object literal for the '<em><b>Previous Delivery Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELIVERY__PREVIOUS_DELIVERY_ID = eINSTANCE.getDelivery_PreviousDeliveryId();

		/**
		 * The meta object literal for the '<em><b>Replaced Delivery Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELIVERY__REPLACED_DELIVERY_ID = eINSTANCE.getDelivery_ReplacedDeliveryId();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELIVERY__OPTIONAL = eINSTANCE.getDelivery_Optional();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELIVERY__PROVIDER = eINSTANCE.getDelivery_Provider();

		/**
		 * The meta object literal for the '<em><b>Schema Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELIVERY__SCHEMA_VERSION = eINSTANCE.getDelivery_SchemaVersion();

		/**
		 * The meta object literal for the '<em><b>Accepted Schema Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELIVERY__ACCEPTED_SCHEMA_VERSION = eINSTANCE.getDelivery_AcceptedSchemaVersion();

		/**
		 * The meta object literal for the '<em><b>Usage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELIVERY__USAGE = eINSTANCE.getDelivery_Usage();

		/**
		 * The meta object literal for the '{@link Gtm.impl.AfterSalesRulesImpl <em>After Sales Rules</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.AfterSalesRulesImpl
		 * @see Gtm.impl.GtmPackageImpl#getAfterSalesRules()
		 * @generated
		 */
		EClass AFTER_SALES_RULES = eINSTANCE.getAfterSalesRules();

		/**
		 * The meta object literal for the '<em><b>After Sales Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AFTER_SALES_RULES__AFTER_SALES_RULES = eINSTANCE.getAfterSalesRules_AfterSalesRules();

		/**
		 * The meta object literal for the '{@link Gtm.impl.AfterSalesRuleImpl <em>After Sales Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.AfterSalesRuleImpl
		 * @see Gtm.impl.GtmPackageImpl#getAfterSalesRule()
		 * @generated
		 */
		EClass AFTER_SALES_RULE = eINSTANCE.getAfterSalesRule();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFTER_SALES_RULE__ID = eINSTANCE.getAfterSalesRule_Id();

		/**
		 * The meta object literal for the '<em><b>Data Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFTER_SALES_RULE__DATA_SOURCE = eINSTANCE.getAfterSalesRule_DataSource();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AFTER_SALES_RULE__CONDITIONS = eINSTANCE.getAfterSalesRule_Conditions();

		/**
		 * The meta object literal for the '{@link Gtm.impl.AfterSalesConditionImpl <em>After Sales Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.AfterSalesConditionImpl
		 * @see Gtm.impl.GtmPackageImpl#getAfterSalesCondition()
		 * @generated
		 */
		EClass AFTER_SALES_CONDITION = eINSTANCE.getAfterSalesCondition();

		/**
		 * The meta object literal for the '<em><b>Transaction Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFTER_SALES_CONDITION__TRANSACTION_TYPE = eINSTANCE.getAfterSalesCondition_TransactionType();

		/**
		 * The meta object literal for the '<em><b>Individual Contracts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFTER_SALES_CONDITION__INDIVIDUAL_CONTRACTS = eINSTANCE.getAfterSalesCondition_IndividualContracts();

		/**
		 * The meta object literal for the '<em><b>Carrier Fee</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFTER_SALES_CONDITION__CARRIER_FEE = eINSTANCE.getAfterSalesCondition_CarrierFee();

		/**
		 * The meta object literal for the '<em><b>Fee</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AFTER_SALES_CONDITION__FEE = eINSTANCE.getAfterSalesCondition_Fee();

		/**
		 * The meta object literal for the '<em><b>Application Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AFTER_SALES_CONDITION__APPLICATION_TIME = eINSTANCE.getAfterSalesCondition_ApplicationTime();

		/**
		 * The meta object literal for the '{@link Gtm.impl.ApplicationTimeImpl <em>Application Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.ApplicationTimeImpl
		 * @see Gtm.impl.GtmPackageImpl#getApplicationTime()
		 * @generated
		 */
		EClass APPLICATION_TIME = eINSTANCE.getApplicationTime();

		/**
		 * The meta object literal for the '{@link Gtm.impl.FareStructureImpl <em>Fare Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.FareStructureImpl
		 * @see Gtm.impl.GtmPackageImpl#getFareStructure()
		 * @generated
		 */
		EClass FARE_STRUCTURE = eINSTANCE.getFareStructure();

		/**
		 * The meta object literal for the '<em><b>Service Class Definitions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__SERVICE_CLASS_DEFINITIONS = eINSTANCE.getFareStructure_ServiceClassDefinitions();

		/**
		 * The meta object literal for the '<em><b>Service Level Definitions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__SERVICE_LEVEL_DEFINITIONS = eINSTANCE.getFareStructure_ServiceLevelDefinitions();

		/**
		 * The meta object literal for the '<em><b>Station Names</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__STATION_NAMES = eINSTANCE.getFareStructure_StationNames();

		/**
		 * The meta object literal for the '<em><b>Fare Station Set Definitions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__FARE_STATION_SET_DEFINITIONS = eINSTANCE.getFareStructure_FareStationSetDefinitions();

		/**
		 * The meta object literal for the '<em><b>Calendars</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__CALENDARS = eINSTANCE.getFareStructure_Calendars();

		/**
		 * The meta object literal for the '<em><b>Texts</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__TEXTS = eINSTANCE.getFareStructure_Texts();

		/**
		 * The meta object literal for the '<em><b>Reduction Cards</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__REDUCTION_CARDS = eINSTANCE.getFareStructure_ReductionCards();

		/**
		 * The meta object literal for the '<em><b>Fare Constraint Bundles</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__FARE_CONSTRAINT_BUNDLES = eINSTANCE.getFareStructure_FareConstraintBundles();

		/**
		 * The meta object literal for the '<em><b>Fare Elements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__FARE_ELEMENTS = eINSTANCE.getFareStructure_FareElements();

		/**
		 * The meta object literal for the '<em><b>Combination Constraints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__COMBINATION_CONSTRAINTS = eINSTANCE.getFareStructure_CombinationConstraints();

		/**
		 * The meta object literal for the '<em><b>Sales Availability Constraints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__SALES_AVAILABILITY_CONSTRAINTS = eINSTANCE.getFareStructure_SalesAvailabilityConstraints();

		/**
		 * The meta object literal for the '<em><b>Travel Validity Constraints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__TRAVEL_VALIDITY_CONSTRAINTS = eINSTANCE.getFareStructure_TravelValidityConstraints();

		/**
		 * The meta object literal for the '<em><b>Regional Constraints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__REGIONAL_CONSTRAINTS = eINSTANCE.getFareStructure_RegionalConstraints();

		/**
		 * The meta object literal for the '<em><b>Connection Points</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__CONNECTION_POINTS = eINSTANCE.getFareStructure_ConnectionPoints();

		/**
		 * The meta object literal for the '<em><b>Carrier Constraints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__CARRIER_CONSTRAINTS = eINSTANCE.getFareStructure_CarrierConstraints();

		/**
		 * The meta object literal for the '<em><b>Service Constraints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__SERVICE_CONSTRAINTS = eINSTANCE.getFareStructure_ServiceConstraints();

		/**
		 * The meta object literal for the '<em><b>Passenger Constraints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__PASSENGER_CONSTRAINTS = eINSTANCE.getFareStructure_PassengerConstraints();

		/**
		 * The meta object literal for the '<em><b>Total Passenger Combination Constraints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__TOTAL_PASSENGER_COMBINATION_CONSTRAINTS = eINSTANCE.getFareStructure_TotalPassengerCombinationConstraints();

		/**
		 * The meta object literal for the '<em><b>Reduction Constraints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__REDUCTION_CONSTRAINTS = eINSTANCE.getFareStructure_ReductionConstraints();

		/**
		 * The meta object literal for the '<em><b>Personal Data Constraints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__PERSONAL_DATA_CONSTRAINTS = eINSTANCE.getFareStructure_PersonalDataConstraints();

		/**
		 * The meta object literal for the '<em><b>After Sales Rules</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__AFTER_SALES_RULES = eINSTANCE.getFareStructure_AfterSalesRules();

		/**
		 * The meta object literal for the '<em><b>Prices</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__PRICES = eINSTANCE.getFareStructure_Prices();

		/**
		 * The meta object literal for the '<em><b>Fulfillment Constraints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__FULFILLMENT_CONSTRAINTS = eINSTANCE.getFareStructure_FulfillmentConstraints();

		/**
		 * The meta object literal for the '<em><b>Reservation Parameters</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__RESERVATION_PARAMETERS = eINSTANCE.getFareStructure_ReservationParameters();

		/**
		 * The meta object literal for the '<em><b>Supported Online Services</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__SUPPORTED_ONLINE_SERVICES = eINSTANCE.getFareStructure_SupportedOnlineServices();

		/**
		 * The meta object literal for the '<em><b>Fare Resource Locations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__FARE_RESOURCE_LOCATIONS = eINSTANCE.getFareStructure_FareResourceLocations();

		/**
		 * The meta object literal for the '<em><b>Zone Definitions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__ZONE_DEFINITIONS = eINSTANCE.getFareStructure_ZoneDefinitions();

		/**
		 * The meta object literal for the '<em><b>Luggage Constraints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__LUGGAGE_CONSTRAINTS = eINSTANCE.getFareStructure_LuggageConstraints();

		/**
		 * The meta object literal for the '<em><b>Products</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__PRODUCTS = eINSTANCE.getFareStructure_Products();

		/**
		 * The meta object literal for the '<em><b>Carrier Groups</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STRUCTURE__CARRIER_GROUPS = eINSTANCE.getFareStructure_CarrierGroups();

		/**
		 * The meta object literal for the '{@link Gtm.impl.ConnectionPointsImpl <em>Connection Points</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.ConnectionPointsImpl
		 * @see Gtm.impl.GtmPackageImpl#getConnectionPoints()
		 * @generated
		 */
		EClass CONNECTION_POINTS = eINSTANCE.getConnectionPoints();

		/**
		 * The meta object literal for the '<em><b>Connection Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_POINTS__CONNECTION_POINTS = eINSTANCE.getConnectionPoints_ConnectionPoints();

		/**
		 * The meta object literal for the '<em><b>Find Simple Connection Point</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONNECTION_POINTS___FIND_SIMPLE_CONNECTION_POINT__STATION = eINSTANCE.getConnectionPoints__FindSimpleConnectionPoint__Station();

		/**
		 * The meta object literal for the '{@link Gtm.impl.ConnectionPointImpl <em>Connection Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.ConnectionPointImpl
		 * @see Gtm.impl.GtmPackageImpl#getConnectionPoint()
		 * @generated
		 */
		EClass CONNECTION_POINT = eINSTANCE.getConnectionPoint();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_POINT__ID = eINSTANCE.getConnectionPoint_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_POINT__NAME = eINSTANCE.getConnectionPoint_Name();

		/**
		 * The meta object literal for the '<em><b>Legacy Border Point Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_POINT__LEGACY_BORDER_POINT_CODE = eINSTANCE.getConnectionPoint_LegacyBorderPointCode();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_POINT__DESCRIPTION = eINSTANCE.getConnectionPoint_Description();

		/**
		 * The meta object literal for the '<em><b>Connected Station Sets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_POINT__CONNECTED_STATION_SETS = eINSTANCE.getConnectionPoint_ConnectedStationSets();

		/**
		 * The meta object literal for the '<em><b>Data Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_POINT__DATA_SOURCE = eINSTANCE.getConnectionPoint_DataSource();

		/**
		 * The meta object literal for the '<em><b>Name Utf8</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_POINT__NAME_UTF8 = eINSTANCE.getConnectionPoint_NameUtf8();

		/**
		 * The meta object literal for the '{@link Gtm.impl.FareResourceLocationsImpl <em>Fare Resource Locations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.FareResourceLocationsImpl
		 * @see Gtm.impl.GtmPackageImpl#getFareResourceLocations()
		 * @generated
		 */
		EClass FARE_RESOURCE_LOCATIONS = eINSTANCE.getFareResourceLocations();

		/**
		 * The meta object literal for the '<em><b>Train Resource Locations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_RESOURCE_LOCATIONS__TRAIN_RESOURCE_LOCATIONS = eINSTANCE.getFareResourceLocations_TrainResourceLocations();

		/**
		 * The meta object literal for the '<em><b>Station Resource Locations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_RESOURCE_LOCATIONS__STATION_RESOURCE_LOCATIONS = eINSTANCE.getFareResourceLocations_StationResourceLocations();

		/**
		 * The meta object literal for the '<em><b>Carrier Resource Locations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_RESOURCE_LOCATIONS__CARRIER_RESOURCE_LOCATIONS = eINSTANCE.getFareResourceLocations_CarrierResourceLocations();

		/**
		 * The meta object literal for the '{@link Gtm.impl.TrainResourceLocationsImpl <em>Train Resource Locations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.TrainResourceLocationsImpl
		 * @see Gtm.impl.GtmPackageImpl#getTrainResourceLocations()
		 * @generated
		 */
		EClass TRAIN_RESOURCE_LOCATIONS = eINSTANCE.getTrainResourceLocations();

		/**
		 * The meta object literal for the '<em><b>Train Resource Locations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAIN_RESOURCE_LOCATIONS__TRAIN_RESOURCE_LOCATIONS = eINSTANCE.getTrainResourceLocations_TrainResourceLocations();

		/**
		 * The meta object literal for the '{@link Gtm.impl.StationResourceLocationsImpl <em>Station Resource Locations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.StationResourceLocationsImpl
		 * @see Gtm.impl.GtmPackageImpl#getStationResourceLocations()
		 * @generated
		 */
		EClass STATION_RESOURCE_LOCATIONS = eINSTANCE.getStationResourceLocations();

		/**
		 * The meta object literal for the '<em><b>Station Resource Locations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATION_RESOURCE_LOCATIONS__STATION_RESOURCE_LOCATIONS = eINSTANCE.getStationResourceLocations_StationResourceLocations();

		/**
		 * The meta object literal for the '{@link Gtm.impl.CarrierResourceLocationsImpl <em>Carrier Resource Locations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.CarrierResourceLocationsImpl
		 * @see Gtm.impl.GtmPackageImpl#getCarrierResourceLocations()
		 * @generated
		 */
		EClass CARRIER_RESOURCE_LOCATIONS = eINSTANCE.getCarrierResourceLocations();

		/**
		 * The meta object literal for the '<em><b>Carrier Resource Locations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARRIER_RESOURCE_LOCATIONS__CARRIER_RESOURCE_LOCATIONS = eINSTANCE.getCarrierResourceLocations_CarrierResourceLocations();

		/**
		 * The meta object literal for the '{@link Gtm.impl.TrainResourceLocationImpl <em>Train Resource Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.TrainResourceLocationImpl
		 * @see Gtm.impl.GtmPackageImpl#getTrainResourceLocation()
		 * @generated
		 */
		EClass TRAIN_RESOURCE_LOCATION = eINSTANCE.getTrainResourceLocation();

		/**
		 * The meta object literal for the '<em><b>Carrier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAIN_RESOURCE_LOCATION__CARRIER = eINSTANCE.getTrainResourceLocation_Carrier();

		/**
		 * The meta object literal for the '<em><b>Online Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAIN_RESOURCE_LOCATION__ONLINE_RESOURCES = eINSTANCE.getTrainResourceLocation_OnlineResources();

		/**
		 * The meta object literal for the '<em><b>Train Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN_RESOURCE_LOCATION__TRAIN_ID = eINSTANCE.getTrainResourceLocation_TrainId();

		/**
		 * The meta object literal for the '{@link Gtm.impl.StationResourceLocationImpl <em>Station Resource Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.StationResourceLocationImpl
		 * @see Gtm.impl.GtmPackageImpl#getStationResourceLocation()
		 * @generated
		 */
		EClass STATION_RESOURCE_LOCATION = eINSTANCE.getStationResourceLocation();

		/**
		 * The meta object literal for the '<em><b>Online Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATION_RESOURCE_LOCATION__ONLINE_RESOURCES = eINSTANCE.getStationResourceLocation_OnlineResources();

		/**
		 * The meta object literal for the '<em><b>Stations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATION_RESOURCE_LOCATION__STATIONS = eINSTANCE.getStationResourceLocation_Stations();

		/**
		 * The meta object literal for the '<em><b>Connection Points</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATION_RESOURCE_LOCATION__CONNECTION_POINTS = eINSTANCE.getStationResourceLocation_ConnectionPoints();

		/**
		 * The meta object literal for the '{@link Gtm.impl.OnlineResourceImpl <em>Online Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.OnlineResourceImpl
		 * @see Gtm.impl.GtmPackageImpl#getOnlineResource()
		 * @generated
		 */
		EClass ONLINE_RESOURCE = eINSTANCE.getOnlineResource();

		/**
		 * The meta object literal for the '<em><b>Offer Request Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONLINE_RESOURCE__OFFER_REQUEST_TYPE = eINSTANCE.getOnlineResource_OfferRequestType();

		/**
		 * The meta object literal for the '<em><b>Interface Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONLINE_RESOURCE__INTERFACE_TYPE = eINSTANCE.getOnlineResource_InterfaceType();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONLINE_RESOURCE__VERSION = eINSTANCE.getOnlineResource_Version();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONLINE_RESOURCE__SYSTEM = eINSTANCE.getOnlineResource_System();

		/**
		 * The meta object literal for the '{@link Gtm.impl.FulfillmentConstraintsImpl <em>Fulfillment Constraints</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.FulfillmentConstraintsImpl
		 * @see Gtm.impl.GtmPackageImpl#getFulfillmentConstraints()
		 * @generated
		 */
		EClass FULFILLMENT_CONSTRAINTS = eINSTANCE.getFulfillmentConstraints();

		/**
		 * The meta object literal for the '<em><b>Fulfillment Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FULFILLMENT_CONSTRAINTS__FULFILLMENT_CONSTRAINTS = eINSTANCE.getFulfillmentConstraints_FulfillmentConstraints();

		/**
		 * The meta object literal for the '{@link Gtm.impl.FulfillmentConstraintImpl <em>Fulfillment Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.FulfillmentConstraintImpl
		 * @see Gtm.impl.GtmPackageImpl#getFulfillmentConstraint()
		 * @generated
		 */
		EClass FULFILLMENT_CONSTRAINT = eINSTANCE.getFulfillmentConstraint();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FULFILLMENT_CONSTRAINT__ID = eINSTANCE.getFulfillmentConstraint_Id();

		/**
		 * The meta object literal for the '<em><b>Accepted Fulfilment Types</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FULFILLMENT_CONSTRAINT__ACCEPTED_FULFILMENT_TYPES = eINSTANCE.getFulfillmentConstraint_AcceptedFulfilmentTypes();

		/**
		 * The meta object literal for the '<em><b>Required Control Data Exchange</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FULFILLMENT_CONSTRAINT__REQUIRED_CONTROL_DATA_EXCHANGE = eINSTANCE.getFulfillmentConstraint_RequiredControlDataExchange();

		/**
		 * The meta object literal for the '<em><b>Individual Ticketing Permitted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FULFILLMENT_CONSTRAINT__INDIVIDUAL_TICKETING_PERMITTED = eINSTANCE.getFulfillmentConstraint_IndividualTicketingPermitted();

		/**
		 * The meta object literal for the '<em><b>Separate Ful Fillment Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FULFILLMENT_CONSTRAINT__SEPARATE_FUL_FILLMENT_REQUIRED = eINSTANCE.getFulfillmentConstraint_SeparateFulFillmentRequired();

		/**
		 * The meta object literal for the '<em><b>Accepted Barcodes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FULFILLMENT_CONSTRAINT__ACCEPTED_BARCODES = eINSTANCE.getFulfillmentConstraint_AcceptedBarcodes();

		/**
		 * The meta object literal for the '<em><b>Required Barcodes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FULFILLMENT_CONSTRAINT__REQUIRED_BARCODES = eINSTANCE.getFulfillmentConstraint_RequiredBarcodes();

		/**
		 * The meta object literal for the '<em><b>Data Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FULFILLMENT_CONSTRAINT__DATA_DESCRIPTION = eINSTANCE.getFulfillmentConstraint_DataDescription();

		/**
		 * The meta object literal for the '<em><b>Accepted Barcode Types</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FULFILLMENT_CONSTRAINT__ACCEPTED_BARCODE_TYPES = eINSTANCE.getFulfillmentConstraint_AcceptedBarcodeTypes();

		/**
		 * The meta object literal for the '<em><b>Required Barcode Types</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FULFILLMENT_CONSTRAINT__REQUIRED_BARCODE_TYPES = eINSTANCE.getFulfillmentConstraint_RequiredBarcodeTypes();

		/**
		 * The meta object literal for the '{@link Gtm.impl.RequiredBarcodesImpl <em>Required Barcodes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.RequiredBarcodesImpl
		 * @see Gtm.impl.GtmPackageImpl#getRequiredBarcodes()
		 * @generated
		 */
		EClass REQUIRED_BARCODES = eINSTANCE.getRequiredBarcodes();

		/**
		 * The meta object literal for the '<em><b>Required Barcodes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIRED_BARCODES__REQUIRED_BARCODES = eINSTANCE.getRequiredBarcodes_RequiredBarcodes();

		/**
		 * The meta object literal for the '{@link Gtm.impl.AcceptedBarcodesImpl <em>Accepted Barcodes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.AcceptedBarcodesImpl
		 * @see Gtm.impl.GtmPackageImpl#getAcceptedBarcodes()
		 * @generated
		 */
		EClass ACCEPTED_BARCODES = eINSTANCE.getAcceptedBarcodes();

		/**
		 * The meta object literal for the '<em><b>Accepted Barcodes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCEPTED_BARCODES__ACCEPTED_BARCODES = eINSTANCE.getAcceptedBarcodes_AcceptedBarcodes();

		/**
		 * The meta object literal for the '{@link Gtm.impl.SupportedOnlineServicesImpl <em>Supported Online Services</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.SupportedOnlineServicesImpl
		 * @see Gtm.impl.GtmPackageImpl#getSupportedOnlineServices()
		 * @generated
		 */
		EClass SUPPORTED_ONLINE_SERVICES = eINSTANCE.getSupportedOnlineServices();

		/**
		 * The meta object literal for the '<em><b>Supported Online Services</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPORTED_ONLINE_SERVICES__SUPPORTED_ONLINE_SERVICES = eINSTANCE.getSupportedOnlineServices_SupportedOnlineServices();

		/**
		 * The meta object literal for the '{@link Gtm.impl.StationNamesImpl <em>Station Names</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.StationNamesImpl
		 * @see Gtm.impl.GtmPackageImpl#getStationNames()
		 * @generated
		 */
		EClass STATION_NAMES = eINSTANCE.getStationNames();

		/**
		 * The meta object literal for the '<em><b>Station Name</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATION_NAMES__STATION_NAME = eINSTANCE.getStationNames_StationName();

		/**
		 * The meta object literal for the '{@link Gtm.impl.FareElementsImpl <em>Fare Elements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.FareElementsImpl
		 * @see Gtm.impl.GtmPackageImpl#getFareElements()
		 * @generated
		 */
		EClass FARE_ELEMENTS = eINSTANCE.getFareElements();

		/**
		 * The meta object literal for the '<em><b>Fare Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_ELEMENTS__FARE_ELEMENTS = eINSTANCE.getFareElements_FareElements();

		/**
		 * The meta object literal for the '{@link Gtm.impl.FareElementImpl <em>Fare Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.FareElementImpl
		 * @see Gtm.impl.GtmPackageImpl#getFareElement()
		 * @generated
		 */
		EClass FARE_ELEMENT = eINSTANCE.getFareElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARE_ELEMENT__ID = eINSTANCE.getFareElement_Id();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARE_ELEMENT__TYPE = eINSTANCE.getFareElement_Type();

		/**
		 * The meta object literal for the '<em><b>Data Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARE_ELEMENT__DATA_DESCRIPTION = eINSTANCE.getFareElement_DataDescription();

		/**
		 * The meta object literal for the '<em><b>Fare Constraint Bundle</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_ELEMENT__FARE_CONSTRAINT_BUNDLE = eINSTANCE.getFareElement_FareConstraintBundle();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_ELEMENT__TEXT = eINSTANCE.getFareElement_Text();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_ELEMENT__PRICE = eINSTANCE.getFareElement_Price();

		/**
		 * The meta object literal for the '<em><b>Regional Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_ELEMENT__REGIONAL_CONSTRAINT = eINSTANCE.getFareElement_RegionalConstraint();

		/**
		 * The meta object literal for the '<em><b>Service Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_ELEMENT__SERVICE_CONSTRAINT = eINSTANCE.getFareElement_ServiceConstraint();

		/**
		 * The meta object literal for the '<em><b>Carrier Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_ELEMENT__CARRIER_CONSTRAINT = eINSTANCE.getFareElement_CarrierConstraint();

		/**
		 * The meta object literal for the '<em><b>Service Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_ELEMENT__SERVICE_CLASS = eINSTANCE.getFareElement_ServiceClass();

		/**
		 * The meta object literal for the '<em><b>Service Level</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_ELEMENT__SERVICE_LEVEL = eINSTANCE.getFareElement_ServiceLevel();

		/**
		 * The meta object literal for the '<em><b>Sales Availability</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_ELEMENT__SALES_AVAILABILITY = eINSTANCE.getFareElement_SalesAvailability();

		/**
		 * The meta object literal for the '<em><b>Travel Validity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_ELEMENT__TRAVEL_VALIDITY = eINSTANCE.getFareElement_TravelValidity();

		/**
		 * The meta object literal for the '<em><b>Combination Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_ELEMENT__COMBINATION_CONSTRAINT = eINSTANCE.getFareElement_CombinationConstraint();

		/**
		 * The meta object literal for the '<em><b>Fare Detail Description</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_ELEMENT__FARE_DETAIL_DESCRIPTION = eINSTANCE.getFareElement_FareDetailDescription();

		/**
		 * The meta object literal for the '<em><b>Personal Data Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_ELEMENT__PERSONAL_DATA_CONSTRAINT = eINSTANCE.getFareElement_PersonalDataConstraint();

		/**
		 * The meta object literal for the '<em><b>Reservation Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_ELEMENT__RESERVATION_PARAMETER = eINSTANCE.getFareElement_ReservationParameter();

		/**
		 * The meta object literal for the '<em><b>Reduction Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_ELEMENT__REDUCTION_CONSTRAINT = eINSTANCE.getFareElement_ReductionConstraint();

		/**
		 * The meta object literal for the '<em><b>Fulfillment Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_ELEMENT__FULFILLMENT_CONSTRAINT = eINSTANCE.getFareElement_FulfillmentConstraint();

		/**
		 * The meta object literal for the '<em><b>Passenger Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_ELEMENT__PASSENGER_CONSTRAINT = eINSTANCE.getFareElement_PassengerConstraint();

		/**
		 * The meta object literal for the '<em><b>Regulatory Conditions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARE_ELEMENT__REGULATORY_CONDITIONS = eINSTANCE.getFareElement_RegulatoryConditions();

		/**
		 * The meta object literal for the '<em><b>After Sales Rule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_ELEMENT__AFTER_SALES_RULE = eINSTANCE.getFareElement_AfterSalesRule();

		/**
		 * The meta object literal for the '<em><b>Data Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARE_ELEMENT__DATA_SOURCE = eINSTANCE.getFareElement_DataSource();

		/**
		 * The meta object literal for the '<em><b>Legacy Accounting Identifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_ELEMENT__LEGACY_ACCOUNTING_IDENTIFIER = eINSTANCE.getFareElement_LegacyAccountingIdentifier();

		/**
		 * The meta object literal for the '<em><b>Legacy Conversion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARE_ELEMENT__LEGACY_CONVERSION = eINSTANCE.getFareElement_LegacyConversion();

		/**
		 * The meta object literal for the '<em><b>Individual Contracts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARE_ELEMENT__INDIVIDUAL_CONTRACTS = eINSTANCE.getFareElement_IndividualContracts();

		/**
		 * The meta object literal for the '<em><b>Involved Tcos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_ELEMENT__INVOLVED_TCOS = eINSTANCE.getFareElement_InvolvedTcos();

		/**
		 * The meta object literal for the '<em><b>Luggage Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_ELEMENT__LUGGAGE_CONSTRAINT = eINSTANCE.getFareElement_LuggageConstraint();

		/**
		 * The meta object literal for the '{@link Gtm.impl.TotalPassengerCombinationConstraintsImpl <em>Total Passenger Combination Constraints</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.TotalPassengerCombinationConstraintsImpl
		 * @see Gtm.impl.GtmPackageImpl#getTotalPassengerCombinationConstraints()
		 * @generated
		 */
		EClass TOTAL_PASSENGER_COMBINATION_CONSTRAINTS = eINSTANCE.getTotalPassengerCombinationConstraints();

		/**
		 * The meta object literal for the '<em><b>Total Passenger Combination Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOTAL_PASSENGER_COMBINATION_CONSTRAINTS__TOTAL_PASSENGER_COMBINATION_CONSTRAINT = eINSTANCE.getTotalPassengerCombinationConstraints_TotalPassengerCombinationConstraint();

		/**
		 * The meta object literal for the '{@link Gtm.impl.TotalPassengerCombinationConstraintImpl <em>Total Passenger Combination Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.TotalPassengerCombinationConstraintImpl
		 * @see Gtm.impl.GtmPackageImpl#getTotalPassengerCombinationConstraint()
		 * @generated
		 */
		EClass TOTAL_PASSENGER_COMBINATION_CONSTRAINT = eINSTANCE.getTotalPassengerCombinationConstraint();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOTAL_PASSENGER_COMBINATION_CONSTRAINT__ID = eINSTANCE.getTotalPassengerCombinationConstraint_Id();

		/**
		 * The meta object literal for the '<em><b>Data Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOTAL_PASSENGER_COMBINATION_CONSTRAINT__DATA_DESCRIPTION = eINSTANCE.getTotalPassengerCombinationConstraint_DataDescription();

		/**
		 * The meta object literal for the '<em><b>Max Total Passenger Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOTAL_PASSENGER_COMBINATION_CONSTRAINT__MAX_TOTAL_PASSENGER_WEIGHT = eINSTANCE.getTotalPassengerCombinationConstraint_MaxTotalPassengerWeight();

		/**
		 * The meta object literal for the '<em><b>Min Total Passenger Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOTAL_PASSENGER_COMBINATION_CONSTRAINT__MIN_TOTAL_PASSENGER_WEIGHT = eINSTANCE.getTotalPassengerCombinationConstraint_MinTotalPassengerWeight();

		/**
		 * The meta object literal for the '{@link Gtm.impl.FareConstraintBundlesImpl <em>Fare Constraint Bundles</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.FareConstraintBundlesImpl
		 * @see Gtm.impl.GtmPackageImpl#getFareConstraintBundles()
		 * @generated
		 */
		EClass FARE_CONSTRAINT_BUNDLES = eINSTANCE.getFareConstraintBundles();

		/**
		 * The meta object literal for the '<em><b>Fare Constraint Bundles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_CONSTRAINT_BUNDLES__FARE_CONSTRAINT_BUNDLES = eINSTANCE.getFareConstraintBundles_FareConstraintBundles();

		/**
		 * The meta object literal for the '{@link Gtm.impl.FareConstraintBundleImpl <em>Fare Constraint Bundle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.FareConstraintBundleImpl
		 * @see Gtm.impl.GtmPackageImpl#getFareConstraintBundle()
		 * @generated
		 */
		EClass FARE_CONSTRAINT_BUNDLE = eINSTANCE.getFareConstraintBundle();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARE_CONSTRAINT_BUNDLE__ID = eINSTANCE.getFareConstraintBundle_Id();

		/**
		 * The meta object literal for the '<em><b>Default Fare Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARE_CONSTRAINT_BUNDLE__DEFAULT_FARE_TYPE = eINSTANCE.getFareConstraintBundle_DefaultFareType();

		/**
		 * The meta object literal for the '<em><b>Data Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARE_CONSTRAINT_BUNDLE__DATA_DESCRIPTION = eINSTANCE.getFareConstraintBundle_DataDescription();

		/**
		 * The meta object literal for the '<em><b>Carrier Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_CONSTRAINT_BUNDLE__CARRIER_CONSTRAINT = eINSTANCE.getFareConstraintBundle_CarrierConstraint();

		/**
		 * The meta object literal for the '<em><b>Sales Availability</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_CONSTRAINT_BUNDLE__SALES_AVAILABILITY = eINSTANCE.getFareConstraintBundle_SalesAvailability();

		/**
		 * The meta object literal for the '<em><b>Travel Validity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_CONSTRAINT_BUNDLE__TRAVEL_VALIDITY = eINSTANCE.getFareConstraintBundle_TravelValidity();

		/**
		 * The meta object literal for the '<em><b>Combination Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_CONSTRAINT_BUNDLE__COMBINATION_CONSTRAINT = eINSTANCE.getFareConstraintBundle_CombinationConstraint();

		/**
		 * The meta object literal for the '<em><b>Personal Data Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_CONSTRAINT_BUNDLE__PERSONAL_DATA_CONSTRAINT = eINSTANCE.getFareConstraintBundle_PersonalDataConstraint();

		/**
		 * The meta object literal for the '<em><b>Fulfillment Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_CONSTRAINT_BUNDLE__FULFILLMENT_CONSTRAINT = eINSTANCE.getFareConstraintBundle_FulfillmentConstraint();

		/**
		 * The meta object literal for the '<em><b>Total Passenger Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_CONSTRAINT_BUNDLE__TOTAL_PASSENGER_CONSTRAINT = eINSTANCE.getFareConstraintBundle_TotalPassengerConstraint();

		/**
		 * The meta object literal for the '<em><b>Default Regulatory Conditions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARE_CONSTRAINT_BUNDLE__DEFAULT_REGULATORY_CONDITIONS = eINSTANCE.getFareConstraintBundle_DefaultRegulatoryConditions();

		/**
		 * The meta object literal for the '<em><b>Data Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARE_CONSTRAINT_BUNDLE__DATA_SOURCE = eINSTANCE.getFareConstraintBundle_DataSource();

		/**
		 * The meta object literal for the '<em><b>Converted Bundles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_CONSTRAINT_BUNDLE__CONVERTED_BUNDLES = eINSTANCE.getFareConstraintBundle_ConvertedBundles();

		/**
		 * The meta object literal for the '<em><b>Luggage Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_CONSTRAINT_BUNDLE__LUGGAGE_CONSTRAINT = eINSTANCE.getFareConstraintBundle_LuggageConstraint();

		/**
		 * The meta object literal for the '<em><b>Products</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_CONSTRAINT_BUNDLE__PRODUCTS = eINSTANCE.getFareConstraintBundle_Products();

		/**
		 * The meta object literal for the '{@link Gtm.impl.FareStationSetDefinitionsImpl <em>Fare Station Set Definitions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.FareStationSetDefinitionsImpl
		 * @see Gtm.impl.GtmPackageImpl#getFareStationSetDefinitions()
		 * @generated
		 */
		EClass FARE_STATION_SET_DEFINITIONS = eINSTANCE.getFareStationSetDefinitions();

		/**
		 * The meta object literal for the '<em><b>Fare Station Set Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STATION_SET_DEFINITIONS__FARE_STATION_SET_DEFINITIONS = eINSTANCE.getFareStationSetDefinitions_FareStationSetDefinitions();

		/**
		 * The meta object literal for the '<em><b>Find Fare Set</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FARE_STATION_SET_DEFINITIONS___FIND_FARE_SET__CARRIER_INT = eINSTANCE.getFareStationSetDefinitions__FindFareSet__Carrier_int();

		/**
		 * The meta object literal for the '{@link Gtm.impl.FareStationSetDefinitionImpl <em>Fare Station Set Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.FareStationSetDefinitionImpl
		 * @see Gtm.impl.GtmPackageImpl#getFareStationSetDefinition()
		 * @generated
		 */
		EClass FARE_STATION_SET_DEFINITION = eINSTANCE.getFareStationSetDefinition();

		/**
		 * The meta object literal for the '<em><b>Data Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARE_STATION_SET_DEFINITION__DATA_SOURCE = eINSTANCE.getFareStationSetDefinition_DataSource();

		/**
		 * The meta object literal for the '<em><b>Carrier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STATION_SET_DEFINITION__CARRIER = eINSTANCE.getFareStationSetDefinition_Carrier();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARE_STATION_SET_DEFINITION__CODE = eINSTANCE.getFareStationSetDefinition_Code();

		/**
		 * The meta object literal for the '<em><b>Legacy Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARE_STATION_SET_DEFINITION__LEGACY_CODE = eINSTANCE.getFareStationSetDefinition_LegacyCode();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARE_STATION_SET_DEFINITION__ID = eINSTANCE.getFareStationSetDefinition_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARE_STATION_SET_DEFINITION__NAME = eINSTANCE.getFareStationSetDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Name Utf8</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARE_STATION_SET_DEFINITION__NAME_UTF8 = eINSTANCE.getFareStationSetDefinition_NameUtf8();

		/**
		 * The meta object literal for the '<em><b>Stations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_STATION_SET_DEFINITION__STATIONS = eINSTANCE.getFareStationSetDefinition_Stations();

		/**
		 * The meta object literal for the '{@link Gtm.impl.LegacyAccountingIdentifierImpl <em>Legacy Accounting Identifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.LegacyAccountingIdentifierImpl
		 * @see Gtm.impl.GtmPackageImpl#getLegacyAccountingIdentifier()
		 * @generated
		 */
		EClass LEGACY_ACCOUNTING_IDENTIFIER = eINSTANCE.getLegacyAccountingIdentifier();

		/**
		 * The meta object literal for the '<em><b>Series Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_ACCOUNTING_IDENTIFIER__SERIES_ID = eINSTANCE.getLegacyAccountingIdentifier_SeriesId();

		/**
		 * The meta object literal for the '<em><b>Tariff Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_ACCOUNTING_IDENTIFIER__TARIFF_ID = eINSTANCE.getLegacyAccountingIdentifier_TariffId();

		/**
		 * The meta object literal for the '<em><b>Add Series Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_ACCOUNTING_IDENTIFIER__ADD_SERIES_ID = eINSTANCE.getLegacyAccountingIdentifier_AddSeriesId();

		/**
		 * The meta object literal for the '{@link Gtm.impl.ReductionConstraintsImpl <em>Reduction Constraints</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.ReductionConstraintsImpl
		 * @see Gtm.impl.GtmPackageImpl#getReductionConstraints()
		 * @generated
		 */
		EClass REDUCTION_CONSTRAINTS = eINSTANCE.getReductionConstraints();

		/**
		 * The meta object literal for the '<em><b>Reduction Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDUCTION_CONSTRAINTS__REDUCTION_CONSTRAINTS = eINSTANCE.getReductionConstraints_ReductionConstraints();

		/**
		 * The meta object literal for the '{@link Gtm.impl.PersonalDataConstraintsImpl <em>Personal Data Constraints</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.PersonalDataConstraintsImpl
		 * @see Gtm.impl.GtmPackageImpl#getPersonalDataConstraints()
		 * @generated
		 */
		EClass PERSONAL_DATA_CONSTRAINTS = eINSTANCE.getPersonalDataConstraints();

		/**
		 * The meta object literal for the '<em><b>Personal Data Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONAL_DATA_CONSTRAINTS__PERSONAL_DATA_CONSTRAINTS = eINSTANCE.getPersonalDataConstraints_PersonalDataConstraints();

		/**
		 * The meta object literal for the '{@link Gtm.impl.PersonalDataConstraintImpl <em>Personal Data Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.PersonalDataConstraintImpl
		 * @see Gtm.impl.GtmPackageImpl#getPersonalDataConstraint()
		 * @generated
		 */
		EClass PERSONAL_DATA_CONSTRAINT = eINSTANCE.getPersonalDataConstraint();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONAL_DATA_CONSTRAINT__ID = eINSTANCE.getPersonalDataConstraint_Id();

		/**
		 * The meta object literal for the '<em><b>Required Personal Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONAL_DATA_CONSTRAINT__REQUIRED_PERSONAL_DATA = eINSTANCE.getPersonalDataConstraint_RequiredPersonalData();

		/**
		 * The meta object literal for the '<em><b>Allowed Changes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONAL_DATA_CONSTRAINT__ALLOWED_CHANGES = eINSTANCE.getPersonalDataConstraint_AllowedChanges();

		/**
		 * The meta object literal for the '{@link Gtm.impl.RequiredPersonalDataImpl <em>Required Personal Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.RequiredPersonalDataImpl
		 * @see Gtm.impl.GtmPackageImpl#getRequiredPersonalData()
		 * @generated
		 */
		EClass REQUIRED_PERSONAL_DATA = eINSTANCE.getRequiredPersonalData();

		/**
		 * The meta object literal for the '<em><b>Ticket Holder Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIRED_PERSONAL_DATA__TICKET_HOLDER_ONLY = eINSTANCE.getRequiredPersonalData_TicketHolderOnly();

		/**
		 * The meta object literal for the '<em><b>Data Item</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIRED_PERSONAL_DATA__DATA_ITEM = eINSTANCE.getRequiredPersonalData_DataItem();

		/**
		 * The meta object literal for the '<em><b>Transfer</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIRED_PERSONAL_DATA__TRANSFER = eINSTANCE.getRequiredPersonalData_Transfer();

		/**
		 * The meta object literal for the '<em><b>Fulfillment Type</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIRED_PERSONAL_DATA__FULFILLMENT_TYPE = eINSTANCE.getRequiredPersonalData_FulfillmentType();

		/**
		 * The meta object literal for the '<em><b>Cross Border</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED_PERSONAL_DATA__CROSS_BORDER = eINSTANCE.getRequiredPersonalData_CrossBorder();

		/**
		 * The meta object literal for the '{@link Gtm.impl.AllowedPersonalDataChangesImpl <em>Allowed Personal Data Changes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.AllowedPersonalDataChangesImpl
		 * @see Gtm.impl.GtmPackageImpl#getAllowedPersonalDataChanges()
		 * @generated
		 */
		EClass ALLOWED_PERSONAL_DATA_CHANGES = eINSTANCE.getAllowedPersonalDataChanges();

		/**
		 * The meta object literal for the '<em><b>Time Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALLOWED_PERSONAL_DATA_CHANGES__TIME_LIMIT = eINSTANCE.getAllowedPersonalDataChanges_TimeLimit();

		/**
		 * The meta object literal for the '<em><b>Accepted Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALLOWED_PERSONAL_DATA_CHANGES__ACCEPTED_REASON = eINSTANCE.getAllowedPersonalDataChanges_AcceptedReason();

		/**
		 * The meta object literal for the '{@link Gtm.impl.PassengerConstraintsImpl <em>Passenger Constraints</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.PassengerConstraintsImpl
		 * @see Gtm.impl.GtmPackageImpl#getPassengerConstraints()
		 * @generated
		 */
		EClass PASSENGER_CONSTRAINTS = eINSTANCE.getPassengerConstraints();

		/**
		 * The meta object literal for the '<em><b>Passenger Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PASSENGER_CONSTRAINTS__PASSENGER_CONSTRAINTS = eINSTANCE.getPassengerConstraints_PassengerConstraints();

		/**
		 * The meta object literal for the '{@link Gtm.impl.PassengerConstraintImpl <em>Passenger Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.PassengerConstraintImpl
		 * @see Gtm.impl.GtmPackageImpl#getPassengerConstraint()
		 * @generated
		 */
		EClass PASSENGER_CONSTRAINT = eINSTANCE.getPassengerConstraint();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_CONSTRAINT__ID = eINSTANCE.getPassengerConstraint_Id();

		/**
		 * The meta object literal for the '<em><b>Traveler Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_CONSTRAINT__TRAVELER_TYPE = eINSTANCE.getPassengerConstraint_TravelerType();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PASSENGER_CONSTRAINT__TEXT = eINSTANCE.getPassengerConstraint_Text();

		/**
		 * The meta object literal for the '<em><b>Upper Age Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_CONSTRAINT__UPPER_AGE_LIMIT = eINSTANCE.getPassengerConstraint_UpperAgeLimit();

		/**
		 * The meta object literal for the '<em><b>Lower Age Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_CONSTRAINT__LOWER_AGE_LIMIT = eINSTANCE.getPassengerConstraint_LowerAgeLimit();

		/**
		 * The meta object literal for the '<em><b>Travel Alone Age Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_CONSTRAINT__TRAVEL_ALONE_AGE_LIMIT = eINSTANCE.getPassengerConstraint_TravelAloneAgeLimit();

		/**
		 * The meta object literal for the '<em><b>Reservation Age Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_CONSTRAINT__RESERVATION_AGE_LIMIT = eINSTANCE.getPassengerConstraint_ReservationAgeLimit();

		/**
		 * The meta object literal for the '<em><b>Is Ancilliary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_CONSTRAINT__IS_ANCILLIARY = eINSTANCE.getPassengerConstraint_IsAncilliary();

		/**
		 * The meta object literal for the '<em><b>Passenger Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_CONSTRAINT__PASSENGER_WEIGHT = eINSTANCE.getPassengerConstraint_PassengerWeight();

		/**
		 * The meta object literal for the '<em><b>Max Total Passenger Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_CONSTRAINT__MAX_TOTAL_PASSENGER_WEIGHT = eINSTANCE.getPassengerConstraint_MaxTotalPassengerWeight();

		/**
		 * The meta object literal for the '<em><b>Min Total Passenger Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_CONSTRAINT__MIN_TOTAL_PASSENGER_WEIGHT = eINSTANCE.getPassengerConstraint_MinTotalPassengerWeight();

		/**
		 * The meta object literal for the '<em><b>Included Free Passengers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PASSENGER_CONSTRAINT__INCLUDED_FREE_PASSENGERS = eINSTANCE.getPassengerConstraint_IncludedFreePassengers();

		/**
		 * The meta object literal for the '<em><b>Excluded Passenger Combinations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PASSENGER_CONSTRAINT__EXCLUDED_PASSENGER_COMBINATIONS = eINSTANCE.getPassengerConstraint_ExcludedPassengerCombinations();

		/**
		 * The meta object literal for the '<em><b>Data Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_CONSTRAINT__DATA_DESCRIPTION = eINSTANCE.getPassengerConstraint_DataDescription();

		/**
		 * The meta object literal for the '<em><b>Data Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_CONSTRAINT__DATA_SOURCE = eINSTANCE.getPassengerConstraint_DataSource();

		/**
		 * The meta object literal for the '{@link Gtm.impl.PassengerCombinationConstraintImpl <em>Passenger Combination Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.PassengerCombinationConstraintImpl
		 * @see Gtm.impl.GtmPackageImpl#getPassengerCombinationConstraint()
		 * @generated
		 */
		EClass PASSENGER_COMBINATION_CONSTRAINT = eINSTANCE.getPassengerCombinationConstraint();

		/**
		 * The meta object literal for the '<em><b>Max Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_COMBINATION_CONSTRAINT__MAX_NUMBER = eINSTANCE.getPassengerCombinationConstraint_MaxNumber();

		/**
		 * The meta object literal for the '<em><b>Min Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_COMBINATION_CONSTRAINT__MIN_NUMBER = eINSTANCE.getPassengerCombinationConstraint_MinNumber();

		/**
		 * The meta object literal for the '<em><b>Passenger Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_COMBINATION_CONSTRAINT__PASSENGER_TYPE = eINSTANCE.getPassengerCombinationConstraint_PassengerType();

		/**
		 * The meta object literal for the '<em><b>Passenger Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PASSENGER_COMBINATION_CONSTRAINT__PASSENGER_CONSTRAINT = eINSTANCE.getPassengerCombinationConstraint_PassengerConstraint();

		/**
		 * The meta object literal for the '{@link Gtm.impl.IncludedFreePassengerLimitImpl <em>Included Free Passenger Limit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.IncludedFreePassengerLimitImpl
		 * @see Gtm.impl.GtmPackageImpl#getIncludedFreePassengerLimit()
		 * @generated
		 */
		EClass INCLUDED_FREE_PASSENGER_LIMIT = eINSTANCE.getIncludedFreePassengerLimit();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCLUDED_FREE_PASSENGER_LIMIT__NUMBER = eINSTANCE.getIncludedFreePassengerLimit_Number();

		/**
		 * The meta object literal for the '<em><b>Passenger Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCLUDED_FREE_PASSENGER_LIMIT__PASSENGER_TYPE = eINSTANCE.getIncludedFreePassengerLimit_PassengerType();

		/**
		 * The meta object literal for the '<em><b>Passenger Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCLUDED_FREE_PASSENGER_LIMIT__PASSENGER_CONSTRAINT = eINSTANCE.getIncludedFreePassengerLimit_PassengerConstraint();

		/**
		 * The meta object literal for the '{@link Gtm.impl.CombinationConstraintsImpl <em>Combination Constraints</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.CombinationConstraintsImpl
		 * @see Gtm.impl.GtmPackageImpl#getCombinationConstraints()
		 * @generated
		 */
		EClass COMBINATION_CONSTRAINTS = eINSTANCE.getCombinationConstraints();

		/**
		 * The meta object literal for the '<em><b>Combination Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINATION_CONSTRAINTS__COMBINATION_CONSTRAINTS = eINSTANCE.getCombinationConstraints_CombinationConstraints();

		/**
		 * The meta object literal for the '{@link Gtm.impl.CombinationConstraintImpl <em>Combination Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.CombinationConstraintImpl
		 * @see Gtm.impl.GtmPackageImpl#getCombinationConstraint()
		 * @generated
		 */
		EClass COMBINATION_CONSTRAINT = eINSTANCE.getCombinationConstraint();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMBINATION_CONSTRAINT__ID = eINSTANCE.getCombinationConstraint_Id();

		/**
		 * The meta object literal for the '<em><b>Data Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMBINATION_CONSTRAINT__DATA_DESCRIPTION = eINSTANCE.getCombinationConstraint_DataDescription();

		/**
		 * The meta object literal for the '<em><b>Combination Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINATION_CONSTRAINT__COMBINATION_MODELS = eINSTANCE.getCombinationConstraint_CombinationModels();

		/**
		 * The meta object literal for the '{@link Gtm.impl.TravelValidityConstraintsImpl <em>Travel Validity Constraints</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.TravelValidityConstraintsImpl
		 * @see Gtm.impl.GtmPackageImpl#getTravelValidityConstraints()
		 * @generated
		 */
		EClass TRAVEL_VALIDITY_CONSTRAINTS = eINSTANCE.getTravelValidityConstraints();

		/**
		 * The meta object literal for the '<em><b>Travel Validity Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAVEL_VALIDITY_CONSTRAINTS__TRAVEL_VALIDITY_CONSTRAINTS = eINSTANCE.getTravelValidityConstraints_TravelValidityConstraints();

		/**
		 * The meta object literal for the '{@link Gtm.impl.TravelValidityConstraintImpl <em>Travel Validity Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.TravelValidityConstraintImpl
		 * @see Gtm.impl.GtmPackageImpl#getTravelValidityConstraint()
		 * @generated
		 */
		EClass TRAVEL_VALIDITY_CONSTRAINT = eINSTANCE.getTravelValidityConstraint();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAVEL_VALIDITY_CONSTRAINT__ID = eINSTANCE.getTravelValidityConstraint_Id();

		/**
		 * The meta object literal for the '<em><b>Data Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAVEL_VALIDITY_CONSTRAINT__DATA_DESCRIPTION = eINSTANCE.getTravelValidityConstraint_DataDescription();

		/**
		 * The meta object literal for the '<em><b>Valid Days</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAVEL_VALIDITY_CONSTRAINT__VALID_DAYS = eINSTANCE.getTravelValidityConstraint_ValidDays();

		/**
		 * The meta object literal for the '<em><b>Travel Days</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAVEL_VALIDITY_CONSTRAINT__TRAVEL_DAYS = eINSTANCE.getTravelValidityConstraint_TravelDays();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAVEL_VALIDITY_CONSTRAINT__RANGE = eINSTANCE.getTravelValidityConstraint_Range();

		/**
		 * The meta object literal for the '<em><b>Return Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAVEL_VALIDITY_CONSTRAINT__RETURN_CONSTRAINT = eINSTANCE.getTravelValidityConstraint_ReturnConstraint();

		/**
		 * The meta object literal for the '<em><b>Excluded Time Range</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAVEL_VALIDITY_CONSTRAINT__EXCLUDED_TIME_RANGE = eINSTANCE.getTravelValidityConstraint_ExcludedTimeRange();

		/**
		 * The meta object literal for the '<em><b>Train Validity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAVEL_VALIDITY_CONSTRAINT__TRAIN_VALIDITY = eINSTANCE.getTravelValidityConstraint_TrainValidity();

		/**
		 * The meta object literal for the '<em><b>Validity Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAVEL_VALIDITY_CONSTRAINT__VALIDITY_TYPE = eINSTANCE.getTravelValidityConstraint_ValidityType();

		/**
		 * The meta object literal for the '<em><b>Trip Interruption Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAVEL_VALIDITY_CONSTRAINT__TRIP_INTERRUPTION_CONSTRAINT = eINSTANCE.getTravelValidityConstraint_TripInterruptionConstraint();

		/**
		 * The meta object literal for the '<em><b>Trip Allocation Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAVEL_VALIDITY_CONSTRAINT__TRIP_ALLOCATION_CONSTRAINT = eINSTANCE.getTravelValidityConstraint_TripAllocationConstraint();

		/**
		 * The meta object literal for the '{@link Gtm.impl.TrainValidityImpl <em>Train Validity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.TrainValidityImpl
		 * @see Gtm.impl.GtmPackageImpl#getTrainValidity()
		 * @generated
		 */
		EClass TRAIN_VALIDITY = eINSTANCE.getTrainValidity();

		/**
		 * The meta object literal for the '<em><b>Carrier Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAIN_VALIDITY__CARRIER_CONSTRAINT = eINSTANCE.getTrainValidity_CarrierConstraint();

		/**
		 * The meta object literal for the '<em><b>Serrvice Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAIN_VALIDITY__SERRVICE_CONSTRAINT = eINSTANCE.getTrainValidity_SerrviceConstraint();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN_VALIDITY__SCOPE = eINSTANCE.getTrainValidity_Scope();

		/**
		 * The meta object literal for the '{@link Gtm.impl.SalesAvailabilityConstraintsImpl <em>Sales Availability Constraints</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.SalesAvailabilityConstraintsImpl
		 * @see Gtm.impl.GtmPackageImpl#getSalesAvailabilityConstraints()
		 * @generated
		 */
		EClass SALES_AVAILABILITY_CONSTRAINTS = eINSTANCE.getSalesAvailabilityConstraints();

		/**
		 * The meta object literal for the '<em><b>Sales Availability Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_AVAILABILITY_CONSTRAINTS__SALES_AVAILABILITY_CONSTRAINTS = eINSTANCE.getSalesAvailabilityConstraints_SalesAvailabilityConstraints();

		/**
		 * The meta object literal for the '{@link Gtm.impl.SalesAvailabilityConstraintImpl <em>Sales Availability Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.SalesAvailabilityConstraintImpl
		 * @see Gtm.impl.GtmPackageImpl#getSalesAvailabilityConstraint()
		 * @generated
		 */
		EClass SALES_AVAILABILITY_CONSTRAINT = eINSTANCE.getSalesAvailabilityConstraint();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_AVAILABILITY_CONSTRAINT__ID = eINSTANCE.getSalesAvailabilityConstraint_Id();

		/**
		 * The meta object literal for the '<em><b>Data Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_AVAILABILITY_CONSTRAINT__DATA_DESCRIPTION = eINSTANCE.getSalesAvailabilityConstraint_DataDescription();

		/**
		 * The meta object literal for the '<em><b>Restrictions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_AVAILABILITY_CONSTRAINT__RESTRICTIONS = eINSTANCE.getSalesAvailabilityConstraint_Restrictions();

		/**
		 * The meta object literal for the '<em><b>Data Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_AVAILABILITY_CONSTRAINT__DATA_SOURCE = eINSTANCE.getSalesAvailabilityConstraint_DataSource();

		/**
		 * The meta object literal for the '{@link Gtm.impl.SalesRestrictionImpl <em>Sales Restriction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.SalesRestrictionImpl
		 * @see Gtm.impl.GtmPackageImpl#getSalesRestriction()
		 * @generated
		 */
		EClass SALES_RESTRICTION = eINSTANCE.getSalesRestriction();

		/**
		 * The meta object literal for the '<em><b>Sales Dates</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_RESTRICTION__SALES_DATES = eINSTANCE.getSalesRestriction_SalesDates();

		/**
		 * The meta object literal for the '<em><b>Start Of Sale</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_RESTRICTION__START_OF_SALE = eINSTANCE.getSalesRestriction_StartOfSale();

		/**
		 * The meta object literal for the '<em><b>End Of Sale</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_RESTRICTION__END_OF_SALE = eINSTANCE.getSalesRestriction_EndOfSale();

		/**
		 * The meta object literal for the '{@link Gtm.impl.EndOfSaleImpl <em>End Of Sale</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.EndOfSaleImpl
		 * @see Gtm.impl.GtmPackageImpl#getEndOfSale()
		 * @generated
		 */
		EClass END_OF_SALE = eINSTANCE.getEndOfSale();

		/**
		 * The meta object literal for the '{@link Gtm.impl.StartOfSaleImpl <em>Start Of Sale</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.StartOfSaleImpl
		 * @see Gtm.impl.GtmPackageImpl#getStartOfSale()
		 * @generated
		 */
		EClass START_OF_SALE = eINSTANCE.getStartOfSale();

		/**
		 * The meta object literal for the '{@link Gtm.impl.CarrierGroupImpl <em>Carrier Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.CarrierGroupImpl
		 * @see Gtm.impl.GtmPackageImpl#getCarrierGroup()
		 * @generated
		 */
		EClass CARRIER_GROUP = eINSTANCE.getCarrierGroup();

		/**
		 * The meta object literal for the '<em><b>Data Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARRIER_GROUP__DATA_SOURCE = eINSTANCE.getCarrierGroup_DataSource();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARRIER_GROUP__ID = eINSTANCE.getCarrierGroup_Id();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARRIER_GROUP__CODE = eINSTANCE.getCarrierGroup_Code();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARRIER_GROUP__NAME = eINSTANCE.getCarrierGroup_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARRIER_GROUP__DESCRIPTION = eINSTANCE.getCarrierGroup_Description();

		/**
		 * The meta object literal for the '<em><b>Legacy Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARRIER_GROUP__LEGACY_CODE = eINSTANCE.getCarrierGroup_LegacyCode();

		/**
		 * The meta object literal for the '<em><b>Companies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARRIER_GROUP__COMPANIES = eINSTANCE.getCarrierGroup_Companies();

		/**
		 * The meta object literal for the '{@link Gtm.impl.CarrierGroupsImpl <em>Carrier Groups</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.CarrierGroupsImpl
		 * @see Gtm.impl.GtmPackageImpl#getCarrierGroups()
		 * @generated
		 */
		EClass CARRIER_GROUPS = eINSTANCE.getCarrierGroups();

		/**
		 * The meta object literal for the '<em><b>Carrier Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARRIER_GROUPS__CARRIER_GROUPS = eINSTANCE.getCarrierGroups_CarrierGroups();

		/**
		 * The meta object literal for the '{@link Gtm.impl.ReductionCardsImpl <em>Reduction Cards</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.ReductionCardsImpl
		 * @see Gtm.impl.GtmPackageImpl#getReductionCards()
		 * @generated
		 */
		EClass REDUCTION_CARDS = eINSTANCE.getReductionCards();

		/**
		 * The meta object literal for the '<em><b>Reduction Cards</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDUCTION_CARDS__REDUCTION_CARDS = eINSTANCE.getReductionCards_ReductionCards();

		/**
		 * The meta object literal for the '{@link Gtm.impl.ReductionCardImpl <em>Reduction Card</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.ReductionCardImpl
		 * @see Gtm.impl.GtmPackageImpl#getReductionCard()
		 * @generated
		 */
		EClass REDUCTION_CARD = eINSTANCE.getReductionCard();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REDUCTION_CARD__ID = eINSTANCE.getReductionCard_Id();

		/**
		 * The meta object literal for the '<em><b>Short Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REDUCTION_CARD__SHORT_CODE = eINSTANCE.getReductionCard_ShortCode();

		/**
		 * The meta object literal for the '<em><b>Card Issuer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDUCTION_CARD__CARD_ISSUER = eINSTANCE.getReductionCard_CardIssuer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDUCTION_CARD__NAME = eINSTANCE.getReductionCard_Name();

		/**
		 * The meta object literal for the '<em><b>Service Classes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDUCTION_CARD__SERVICE_CLASSES = eINSTANCE.getReductionCard_ServiceClasses();

		/**
		 * The meta object literal for the '<em><b>Id Required For Booking</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REDUCTION_CARD__ID_REQUIRED_FOR_BOOKING = eINSTANCE.getReductionCard_IdRequiredForBooking();

		/**
		 * The meta object literal for the '<em><b>Included Reduction Cards</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDUCTION_CARD__INCLUDED_REDUCTION_CARDS = eINSTANCE.getReductionCard_IncludedReductionCards();

		/**
		 * The meta object literal for the '<em><b>Uic Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REDUCTION_CARD__UIC_CODE = eINSTANCE.getReductionCard_UicCode();

		/**
		 * The meta object literal for the '{@link Gtm.impl.CarrierConstraintsImpl <em>Carrier Constraints</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.CarrierConstraintsImpl
		 * @see Gtm.impl.GtmPackageImpl#getCarrierConstraints()
		 * @generated
		 */
		EClass CARRIER_CONSTRAINTS = eINSTANCE.getCarrierConstraints();

		/**
		 * The meta object literal for the '<em><b>Carrier Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARRIER_CONSTRAINTS__CARRIER_CONSTRAINTS = eINSTANCE.getCarrierConstraints_CarrierConstraints();

		/**
		 * The meta object literal for the '{@link Gtm.impl.CarrierConstraintImpl <em>Carrier Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.CarrierConstraintImpl
		 * @see Gtm.impl.GtmPackageImpl#getCarrierConstraint()
		 * @generated
		 */
		EClass CARRIER_CONSTRAINT = eINSTANCE.getCarrierConstraint();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARRIER_CONSTRAINT__ID = eINSTANCE.getCarrierConstraint_Id();

		/**
		 * The meta object literal for the '<em><b>Included Carriers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARRIER_CONSTRAINT__INCLUDED_CARRIERS = eINSTANCE.getCarrierConstraint_IncludedCarriers();

		/**
		 * The meta object literal for the '<em><b>Excluded Carriers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARRIER_CONSTRAINT__EXCLUDED_CARRIERS = eINSTANCE.getCarrierConstraint_ExcludedCarriers();

		/**
		 * The meta object literal for the '<em><b>Data Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARRIER_CONSTRAINT__DATA_DESCRIPTION = eINSTANCE.getCarrierConstraint_DataDescription();

		/**
		 * The meta object literal for the '<em><b>Data Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARRIER_CONSTRAINT__DATA_SOURCE = eINSTANCE.getCarrierConstraint_DataSource();

		/**
		 * The meta object literal for the '<em><b>Included Carrier Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARRIER_CONSTRAINT__INCLUDED_CARRIER_GROUP = eINSTANCE.getCarrierConstraint_IncludedCarrierGroup();

		/**
		 * The meta object literal for the '{@link Gtm.impl.ServiceConstraintsImpl <em>Service Constraints</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.ServiceConstraintsImpl
		 * @see Gtm.impl.GtmPackageImpl#getServiceConstraints()
		 * @generated
		 */
		EClass SERVICE_CONSTRAINTS = eINSTANCE.getServiceConstraints();

		/**
		 * The meta object literal for the '<em><b>Service Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_CONSTRAINTS__SERVICE_CONSTRAINTS = eINSTANCE.getServiceConstraints_ServiceConstraints();

		/**
		 * The meta object literal for the '{@link Gtm.impl.ServiceConstraintImpl <em>Service Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.ServiceConstraintImpl
		 * @see Gtm.impl.GtmPackageImpl#getServiceConstraint()
		 * @generated
		 */
		EClass SERVICE_CONSTRAINT = eINSTANCE.getServiceConstraint();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_CONSTRAINT__ID = eINSTANCE.getServiceConstraint_Id();

		/**
		 * The meta object literal for the '<em><b>Included Service Brands</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_CONSTRAINT__INCLUDED_SERVICE_BRANDS = eINSTANCE.getServiceConstraint_IncludedServiceBrands();

		/**
		 * The meta object literal for the '<em><b>Excluded Service Brands</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_CONSTRAINT__EXCLUDED_SERVICE_BRANDS = eINSTANCE.getServiceConstraint_ExcludedServiceBrands();

		/**
		 * The meta object literal for the '<em><b>Data Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_CONSTRAINT__DATA_DESCRIPTION = eINSTANCE.getServiceConstraint_DataDescription();

		/**
		 * The meta object literal for the '<em><b>Legacy108 Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_CONSTRAINT__LEGACY108_CODE = eINSTANCE.getServiceConstraint_Legacy108Code();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_CONSTRAINT__DESCRIPTION = eINSTANCE.getServiceConstraint_Description();

		/**
		 * The meta object literal for the '{@link Gtm.impl.RegionalConstraintsImpl <em>Regional Constraints</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.RegionalConstraintsImpl
		 * @see Gtm.impl.GtmPackageImpl#getRegionalConstraints()
		 * @generated
		 */
		EClass REGIONAL_CONSTRAINTS = eINSTANCE.getRegionalConstraints();

		/**
		 * The meta object literal for the '<em><b>Regional Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGIONAL_CONSTRAINTS__REGIONAL_CONSTRAINTS = eINSTANCE.getRegionalConstraints_RegionalConstraints();

		/**
		 * The meta object literal for the '{@link Gtm.impl.RegionalConstraintImpl <em>Regional Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.RegionalConstraintImpl
		 * @see Gtm.impl.GtmPackageImpl#getRegionalConstraint()
		 * @generated
		 */
		EClass REGIONAL_CONSTRAINT = eINSTANCE.getRegionalConstraint();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGIONAL_CONSTRAINT__ID = eINSTANCE.getRegionalConstraint_Id();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGIONAL_CONSTRAINT__DISTANCE = eINSTANCE.getRegionalConstraint_Distance();

		/**
		 * The meta object literal for the '<em><b>Entry Connection Point</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGIONAL_CONSTRAINT__ENTRY_CONNECTION_POINT = eINSTANCE.getRegionalConstraint_EntryConnectionPoint();

		/**
		 * The meta object literal for the '<em><b>Exit Connection Point</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGIONAL_CONSTRAINT__EXIT_CONNECTION_POINT = eINSTANCE.getRegionalConstraint_ExitConnectionPoint();

		/**
		 * The meta object literal for the '<em><b>Regional Validity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGIONAL_CONSTRAINT__REGIONAL_VALIDITY = eINSTANCE.getRegionalConstraint_RegionalValidity();

		/**
		 * The meta object literal for the '<em><b>Data Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGIONAL_CONSTRAINT__DATA_SOURCE = eINSTANCE.getRegionalConstraint_DataSource();

		/**
		 * The meta object literal for the '<em><b>Data Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGIONAL_CONSTRAINT__DATA_DESCRIPTION = eINSTANCE.getRegionalConstraint_DataDescription();

		/**
		 * The meta object literal for the '<em><b>Linked Fares</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGIONAL_CONSTRAINT__LINKED_FARES = eINSTANCE.getRegionalConstraint_LinkedFares();

		/**
		 * The meta object literal for the '{@link Gtm.impl.RegionalValidityImpl <em>Regional Validity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.RegionalValidityImpl
		 * @see Gtm.impl.GtmPackageImpl#getRegionalValidity()
		 * @generated
		 */
		EClass REGIONAL_VALIDITY = eINSTANCE.getRegionalValidity();

		/**
		 * The meta object literal for the '<em><b>Seq Nb</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGIONAL_VALIDITY__SEQ_NB = eINSTANCE.getRegionalValidity_SeqNb();

		/**
		 * The meta object literal for the '<em><b>Via Station</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGIONAL_VALIDITY__VIA_STATION = eINSTANCE.getRegionalValidity_ViaStation();

		/**
		 * The meta object literal for the '<em><b>Zone</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGIONAL_VALIDITY__ZONE = eINSTANCE.getRegionalValidity_Zone();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGIONAL_VALIDITY__LINE = eINSTANCE.getRegionalValidity_Line();

		/**
		 * The meta object literal for the '<em><b>Polygone</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGIONAL_VALIDITY__POLYGONE = eINSTANCE.getRegionalValidity_Polygone();

		/**
		 * The meta object literal for the '<em><b>Carrier Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGIONAL_VALIDITY__CARRIER_CONSTRAINT = eINSTANCE.getRegionalValidity_CarrierConstraint();

		/**
		 * The meta object literal for the '<em><b>Service Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGIONAL_VALIDITY__SERVICE_CONSTRAINT = eINSTANCE.getRegionalValidity_ServiceConstraint();

		/**
		 * The meta object literal for the '{@link Gtm.impl.ServiceLevelDefinitionsImpl <em>Service Level Definitions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.ServiceLevelDefinitionsImpl
		 * @see Gtm.impl.GtmPackageImpl#getServiceLevelDefinitions()
		 * @generated
		 */
		EClass SERVICE_LEVEL_DEFINITIONS = eINSTANCE.getServiceLevelDefinitions();

		/**
		 * The meta object literal for the '<em><b>Service Level Definition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_LEVEL_DEFINITIONS__SERVICE_LEVEL_DEFINITION = eINSTANCE.getServiceLevelDefinitions_ServiceLevelDefinition();

		/**
		 * The meta object literal for the '{@link Gtm.impl.TextsImpl <em>Texts</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.TextsImpl
		 * @see Gtm.impl.GtmPackageImpl#getTexts()
		 * @generated
		 */
		EClass TEXTS = eINSTANCE.getTexts();

		/**
		 * The meta object literal for the '<em><b>Texts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXTS__TEXTS = eINSTANCE.getTexts_Texts();

		/**
		 * The meta object literal for the '{@link Gtm.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.TextImpl
		 * @see Gtm.impl.GtmPackageImpl#getText()
		 * @generated
		 */
		EClass TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__ID = eINSTANCE.getText_Id();

		/**
		 * The meta object literal for the '<em><b>Text UTF8</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__TEXT_UTF8 = eINSTANCE.getText_TextUTF8();

		/**
		 * The meta object literal for the '<em><b>Text ICAO</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__TEXT_ICAO = eINSTANCE.getText_TextICAO();

		/**
		 * The meta object literal for the '<em><b>Short Text UTF8</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__SHORT_TEXT_UTF8 = eINSTANCE.getText_ShortTextUTF8();

		/**
		 * The meta object literal for the '<em><b>Short Text ICAO</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__SHORT_TEXT_ICAO = eINSTANCE.getText_ShortTextICAO();

		/**
		 * The meta object literal for the '<em><b>Translations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT__TRANSLATIONS = eINSTANCE.getText_Translations();

		/**
		 * The meta object literal for the '<em><b>Standard Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__STANDARD_TEXT = eINSTANCE.getText_StandardText();

		/**
		 * The meta object literal for the '<em><b>Data Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__DATA_SOURCE = eINSTANCE.getText_DataSource();

		/**
		 * The meta object literal for the '{@link Gtm.impl.TranslationImpl <em>Translation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.TranslationImpl
		 * @see Gtm.impl.GtmPackageImpl#getTranslation()
		 * @generated
		 */
		EClass TRANSLATION = eINSTANCE.getTranslation();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSLATION__LANGUAGE = eINSTANCE.getTranslation_Language();

		/**
		 * The meta object literal for the '<em><b>Text UTF8</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSLATION__TEXT_UTF8 = eINSTANCE.getTranslation_TextUTF8();

		/**
		 * The meta object literal for the '<em><b>Text ICAO</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSLATION__TEXT_ICAO = eINSTANCE.getTranslation_TextICAO();

		/**
		 * The meta object literal for the '<em><b>Short Text UTF8</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSLATION__SHORT_TEXT_UTF8 = eINSTANCE.getTranslation_ShortTextUTF8();

		/**
		 * The meta object literal for the '<em><b>Short Text ICAO</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSLATION__SHORT_TEXT_ICAO = eINSTANCE.getTranslation_ShortTextICAO();

		/**
		 * The meta object literal for the '{@link Gtm.impl.PricesImpl <em>Prices</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.PricesImpl
		 * @see Gtm.impl.GtmPackageImpl#getPrices()
		 * @generated
		 */
		EClass PRICES = eINSTANCE.getPrices();

		/**
		 * The meta object literal for the '<em><b>Prices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRICES__PRICES = eINSTANCE.getPrices_Prices();

		/**
		 * The meta object literal for the '{@link Gtm.impl.PriceImpl <em>Price</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.PriceImpl
		 * @see Gtm.impl.GtmPackageImpl#getPrice()
		 * @generated
		 */
		EClass PRICE = eINSTANCE.getPrice();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRICE__ID = eINSTANCE.getPrice_Id();

		/**
		 * The meta object literal for the '<em><b>Currencies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRICE__CURRENCIES = eINSTANCE.getPrice_Currencies();

		/**
		 * The meta object literal for the '<em><b>Data Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRICE__DATA_SOURCE = eINSTANCE.getPrice_DataSource();

		/**
		 * The meta object literal for the '{@link Gtm.impl.VATDetailImpl <em>VAT Detail</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.VATDetailImpl
		 * @see Gtm.impl.GtmPackageImpl#getVATDetail()
		 * @generated
		 */
		EClass VAT_DETAIL = eINSTANCE.getVATDetail();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAT_DETAIL__AMOUNT = eINSTANCE.getVATDetail_Amount();

		/**
		 * The meta object literal for the '<em><b>Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAT_DETAIL__PERCENTAGE = eINSTANCE.getVATDetail_Percentage();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VAT_DETAIL__COUNTRY = eINSTANCE.getVATDetail_Country();

		/**
		 * The meta object literal for the '<em><b>Tax Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAT_DETAIL__TAX_ID = eINSTANCE.getVATDetail_TaxId();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAT_DETAIL__SCOPE = eINSTANCE.getVATDetail_Scope();

		/**
		 * The meta object literal for the '{@link Gtm.impl.CurrencyPriceImpl <em>Currency Price</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.CurrencyPriceImpl
		 * @see Gtm.impl.GtmPackageImpl#getCurrencyPrice()
		 * @generated
		 */
		EClass CURRENCY_PRICE = eINSTANCE.getCurrencyPrice();

		/**
		 * The meta object literal for the '<em><b>Currency</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURRENCY_PRICE__CURRENCY = eINSTANCE.getCurrencyPrice_Currency();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENCY_PRICE__AMOUNT = eINSTANCE.getCurrencyPrice_Amount();

		/**
		 * The meta object literal for the '<em><b>VA Tdetails</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURRENCY_PRICE__VA_TDETAILS = eINSTANCE.getCurrencyPrice_VATdetails();

		/**
		 * The meta object literal for the '{@link Gtm.impl.ServiceClassDefinitionsImpl <em>Service Class Definitions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.ServiceClassDefinitionsImpl
		 * @see Gtm.impl.GtmPackageImpl#getServiceClassDefinitions()
		 * @generated
		 */
		EClass SERVICE_CLASS_DEFINITIONS = eINSTANCE.getServiceClassDefinitions();

		/**
		 * The meta object literal for the '<em><b>Service Class Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_CLASS_DEFINITIONS__SERVICE_CLASS_DEFINITIONS = eINSTANCE.getServiceClassDefinitions_ServiceClassDefinitions();

		/**
		 * The meta object literal for the '{@link Gtm.impl.CalendarsImpl <em>Calendars</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.CalendarsImpl
		 * @see Gtm.impl.GtmPackageImpl#getCalendars()
		 * @generated
		 */
		EClass CALENDARS = eINSTANCE.getCalendars();

		/**
		 * The meta object literal for the '<em><b>Calendars</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALENDARS__CALENDARS = eINSTANCE.getCalendars_Calendars();

		/**
		 * The meta object literal for the '{@link Gtm.impl.CalendarImpl <em>Calendar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.CalendarImpl
		 * @see Gtm.impl.GtmPackageImpl#getCalendar()
		 * @generated
		 */
		EClass CALENDAR = eINSTANCE.getCalendar();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDAR__NAME = eINSTANCE.getCalendar_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDAR__ID = eINSTANCE.getCalendar_Id();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDAR__FROM_DATE = eINSTANCE.getCalendar_FromDate();

		/**
		 * The meta object literal for the '<em><b>Until Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDAR__UNTIL_DATE = eINSTANCE.getCalendar_UntilDate();

		/**
		 * The meta object literal for the '<em><b>Utc Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDAR__UTC_OFFSET = eINSTANCE.getCalendar_UtcOffset();

		/**
		 * The meta object literal for the '<em><b>Dates</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDAR__DATES = eINSTANCE.getCalendar_Dates();

		/**
		 * The meta object literal for the '<em><b>Data Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDAR__DATA_SOURCE = eINSTANCE.getCalendar_DataSource();

		/**
		 * The meta object literal for the '<em><b>From Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDAR__FROM_DATE_TIME = eINSTANCE.getCalendar_FromDateTime();

		/**
		 * The meta object literal for the '<em><b>Until Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDAR__UNTIL_DATE_TIME = eINSTANCE.getCalendar_UntilDateTime();

		/**
		 * The meta object literal for the '{@link Gtm.impl.ReservationParametersImpl <em>Reservation Parameters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.ReservationParametersImpl
		 * @see Gtm.impl.GtmPackageImpl#getReservationParameters()
		 * @generated
		 */
		EClass RESERVATION_PARAMETERS = eINSTANCE.getReservationParameters();

		/**
		 * The meta object literal for the '<em><b>Reservation Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVATION_PARAMETERS__RESERVATION_PARAMETERS = eINSTANCE.getReservationParameters_ReservationParameters();

		/**
		 * The meta object literal for the '{@link Gtm.impl.ReservationParameterImpl <em>Reservation Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.ReservationParameterImpl
		 * @see Gtm.impl.GtmPackageImpl#getReservationParameter()
		 * @generated
		 */
		EClass RESERVATION_PARAMETER = eINSTANCE.getReservationParameter();

		/**
		 * The meta object literal for the '<em><b>Mandatory Reservation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION_PARAMETER__MANDATORY_RESERVATION = eINSTANCE.getReservationParameter_MandatoryReservation();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION_PARAMETER__ID = eINSTANCE.getReservationParameter_Id();

		/**
		 * The meta object literal for the '<em><b>Params9181</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVATION_PARAMETER__PARAMS9181 = eINSTANCE.getReservationParameter_Params9181();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVATION_PARAMETER__OPTIONS = eINSTANCE.getReservationParameter_Options();

		/**
		 * The meta object literal for the '<em><b>Mandatory Reservation For Brands</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVATION_PARAMETER__MANDATORY_RESERVATION_FOR_BRANDS = eINSTANCE.getReservationParameter_MandatoryReservationForBrands();

		/**
		 * The meta object literal for the '<em><b>Mandatory Reservations For Mode</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION_PARAMETER__MANDATORY_RESERVATIONS_FOR_MODE = eINSTANCE.getReservationParameter_MandatoryReservationsForMode();

		/**
		 * The meta object literal for the '{@link Gtm.impl.ReservationParams9181Impl <em>Reservation Params9181</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.ReservationParams9181Impl
		 * @see Gtm.impl.GtmPackageImpl#getReservationParams9181()
		 * @generated
		 */
		EClass RESERVATION_PARAMS9181 = eINSTANCE.getReservationParams9181();

		/**
		 * The meta object literal for the '<em><b>Travel Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION_PARAMS9181__TRAVEL_CLASS = eINSTANCE.getReservationParams9181_TravelClass();

		/**
		 * The meta object literal for the '<em><b>Service Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION_PARAMS9181__SERVICE_LEVEL = eINSTANCE.getReservationParams9181_ServiceLevel();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION_PARAMS9181__SERVICE = eINSTANCE.getReservationParams9181_Service();

		/**
		 * The meta object literal for the '<em><b>Berth Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION_PARAMS9181__BERTH_TYPE = eINSTANCE.getReservationParams9181_BerthType();

		/**
		 * The meta object literal for the '<em><b>Coach Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION_PARAMS9181__COACH_TYPE = eINSTANCE.getReservationParams9181_CoachType();

		/**
		 * The meta object literal for the '<em><b>Compartment Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION_PARAMS9181__COMPARTMENT_TYPE = eINSTANCE.getReservationParams9181_CompartmentType();

		/**
		 * The meta object literal for the '<em><b>Tariff</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION_PARAMS9181__TARIFF = eINSTANCE.getReservationParams9181_Tariff();

		/**
		 * The meta object literal for the '{@link Gtm.impl.ReservationOptionsImpl <em>Reservation Options</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.ReservationOptionsImpl
		 * @see Gtm.impl.GtmPackageImpl#getReservationOptions()
		 * @generated
		 */
		EClass RESERVATION_OPTIONS = eINSTANCE.getReservationOptions();

		/**
		 * The meta object literal for the '<em><b>Preferences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVATION_OPTIONS__PREFERENCES = eINSTANCE.getReservationOptions_Preferences();

		/**
		 * The meta object literal for the '<em><b>Service Brands</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVATION_OPTIONS__SERVICE_BRANDS = eINSTANCE.getReservationOptions_ServiceBrands();

		/**
		 * The meta object literal for the '<em><b>Graphical Reservation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION_OPTIONS__GRAPHICAL_RESERVATION = eINSTANCE.getReservationOptions_GraphicalReservation();

		/**
		 * The meta object literal for the '{@link Gtm.impl.ReservationPreferenceGroupImpl <em>Reservation Preference Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.ReservationPreferenceGroupImpl
		 * @see Gtm.impl.GtmPackageImpl#getReservationPreferenceGroup()
		 * @generated
		 */
		EClass RESERVATION_PREFERENCE_GROUP = eINSTANCE.getReservationPreferenceGroup();

		/**
		 * The meta object literal for the '<em><b>Preference</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION_PREFERENCE_GROUP__PREFERENCE = eINSTANCE.getReservationPreferenceGroup_Preference();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION_PREFERENCE_GROUP__GROUP = eINSTANCE.getReservationPreferenceGroup_Group();

		/**
		 * The meta object literal for the '{@link Gtm.impl.ServiceClassImpl <em>Service Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.ServiceClassImpl
		 * @see Gtm.impl.GtmPackageImpl#getServiceClass()
		 * @generated
		 */
		EClass SERVICE_CLASS = eINSTANCE.getServiceClass();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_CLASS__ID = eINSTANCE.getServiceClass_Id();

		/**
		 * The meta object literal for the '<em><b>Classic Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_CLASS__CLASSIC_CLASS = eINSTANCE.getServiceClass_ClassicClass();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_CLASS__TEXT = eINSTANCE.getServiceClass_Text();

		/**
		 * The meta object literal for the '{@link Gtm.impl.ServiceLevelImpl <em>Service Level</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.ServiceLevelImpl
		 * @see Gtm.impl.GtmPackageImpl#getServiceLevel()
		 * @generated
		 */
		EClass SERVICE_LEVEL = eINSTANCE.getServiceLevel();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_LEVEL__ID = eINSTANCE.getServiceLevel_Id();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_LEVEL__TEXT = eINSTANCE.getServiceLevel_Text();

		/**
		 * The meta object literal for the '<em><b>Combining Service Classes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_LEVEL__COMBINING_SERVICE_CLASSES = eINSTANCE.getServiceLevel_CombiningServiceClasses();

		/**
		 * The meta object literal for the '<em><b>Reservation Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_LEVEL__RESERVATION_PARAMETER = eINSTANCE.getServiceLevel_ReservationParameter();

		/**
		 * The meta object literal for the '<em><b>Includes Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_LEVEL__INCLUDES_CLASS_NAME = eINSTANCE.getServiceLevel_IncludesClassName();

		/**
		 * The meta object literal for the '{@link Gtm.impl.TimeRangeImpl <em>Time Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.TimeRangeImpl
		 * @see Gtm.impl.GtmPackageImpl#getTimeRange()
		 * @generated
		 */
		EClass TIME_RANGE = eINSTANCE.getTimeRange();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_RANGE__SCOPE = eINSTANCE.getTimeRange_Scope();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_RANGE__FROM = eINSTANCE.getTimeRange_From();

		/**
		 * The meta object literal for the '<em><b>Until</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_RANGE__UNTIL = eINSTANCE.getTimeRange_Until();

		/**
		 * The meta object literal for the '{@link Gtm.impl.ExcludedTimeRangeImpl <em>Excluded Time Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.ExcludedTimeRangeImpl
		 * @see Gtm.impl.GtmPackageImpl#getExcludedTimeRange()
		 * @generated
		 */
		EClass EXCLUDED_TIME_RANGE = eINSTANCE.getExcludedTimeRange();

		/**
		 * The meta object literal for the '{@link Gtm.impl.ValidityRangeImpl <em>Validity Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.ValidityRangeImpl
		 * @see Gtm.impl.GtmPackageImpl#getValidityRange()
		 * @generated
		 */
		EClass VALIDITY_RANGE = eINSTANCE.getValidityRange();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDITY_RANGE__UNIT = eINSTANCE.getValidityRange_Unit();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDITY_RANGE__VALUE = eINSTANCE.getValidityRange_Value();

		/**
		 * The meta object literal for the '<em><b>Hours After Midnight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDITY_RANGE__HOURS_AFTER_MIDNIGHT = eINSTANCE.getValidityRange_HoursAfterMidnight();

		/**
		 * The meta object literal for the '{@link Gtm.impl.RelativeTimeImpl <em>Relative Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.RelativeTimeImpl
		 * @see Gtm.impl.GtmPackageImpl#getRelativeTime()
		 * @generated
		 */
		EClass RELATIVE_TIME = eINSTANCE.getRelativeTime();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIVE_TIME__UNIT = eINSTANCE.getRelativeTime_Unit();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIVE_TIME__REFERENCE = eINSTANCE.getRelativeTime_Reference();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIVE_TIME__VALUE = eINSTANCE.getRelativeTime_Value();

		/**
		 * The meta object literal for the '{@link Gtm.impl.ReturnValidityConstraintImpl <em>Return Validity Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.ReturnValidityConstraintImpl
		 * @see Gtm.impl.GtmPackageImpl#getReturnValidityConstraint()
		 * @generated
		 */
		EClass RETURN_VALIDITY_CONSTRAINT = eINSTANCE.getReturnValidityConstraint();

		/**
		 * The meta object literal for the '<em><b>Excluded Weekdays</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_VALIDITY_CONSTRAINT__EXCLUDED_WEEKDAYS = eINSTANCE.getReturnValidityConstraint_ExcludedWeekdays();

		/**
		 * The meta object literal for the '<em><b>Latest Return</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_VALIDITY_CONSTRAINT__LATEST_RETURN = eINSTANCE.getReturnValidityConstraint_LatestReturn();

		/**
		 * The meta object literal for the '<em><b>Earliest Return</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_VALIDITY_CONSTRAINT__EARLIEST_RETURN = eINSTANCE.getReturnValidityConstraint_EarliestReturn();

		/**
		 * The meta object literal for the '{@link Gtm.impl.TripAllocationConstraintImpl <em>Trip Allocation Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.TripAllocationConstraintImpl
		 * @see Gtm.impl.GtmPackageImpl#getTripAllocationConstraint()
		 * @generated
		 */
		EClass TRIP_ALLOCATION_CONSTRAINT = eINSTANCE.getTripAllocationConstraint();

		/**
		 * The meta object literal for the '<em><b>Allocation Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIP_ALLOCATION_CONSTRAINT__ALLOCATION_UNIT = eINSTANCE.getTripAllocationConstraint_AllocationUnit();

		/**
		 * The meta object literal for the '<em><b>Max Units</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIP_ALLOCATION_CONSTRAINT__MAX_UNITS = eINSTANCE.getTripAllocationConstraint_MaxUnits();

		/**
		 * The meta object literal for the '<em><b>Duration Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIP_ALLOCATION_CONSTRAINT__DURATION_UNIT = eINSTANCE.getTripAllocationConstraint_DurationUnit();

		/**
		 * The meta object literal for the '<em><b>Required Processes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIP_ALLOCATION_CONSTRAINT__REQUIRED_PROCESSES = eINSTANCE.getTripAllocationConstraint_RequiredProcesses();

		/**
		 * The meta object literal for the '{@link Gtm.impl.TripInterruptionConstraintImpl <em>Trip Interruption Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.TripInterruptionConstraintImpl
		 * @see Gtm.impl.GtmPackageImpl#getTripInterruptionConstraint()
		 * @generated
		 */
		EClass TRIP_INTERRUPTION_CONSTRAINT = eINSTANCE.getTripInterruptionConstraint();

		/**
		 * The meta object literal for the '<em><b>Max Interruptions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIP_INTERRUPTION_CONSTRAINT__MAX_INTERRUPTIONS = eINSTANCE.getTripInterruptionConstraint_MaxInterruptions();

		/**
		 * The meta object literal for the '<em><b>Max Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIP_INTERRUPTION_CONSTRAINT__MAX_DURATION = eINSTANCE.getTripInterruptionConstraint_MaxDuration();

		/**
		 * The meta object literal for the '<em><b>Total Max Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIP_INTERRUPTION_CONSTRAINT__TOTAL_MAX_DURATION = eINSTANCE.getTripInterruptionConstraint_TotalMaxDuration();

		/**
		 * The meta object literal for the '<em><b>Required Processes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIP_INTERRUPTION_CONSTRAINT__REQUIRED_PROCESSES = eINSTANCE.getTripInterruptionConstraint_RequiredProcesses();

		/**
		 * The meta object literal for the '{@link Gtm.impl.ViaStationImpl <em>Via Station</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.ViaStationImpl
		 * @see Gtm.impl.GtmPackageImpl#getViaStation()
		 * @generated
		 */
		EClass VIA_STATION = eINSTANCE.getViaStation();

		/**
		 * The meta object literal for the '<em><b>Station</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIA_STATION__STATION = eINSTANCE.getViaStation_Station();

		/**
		 * The meta object literal for the '<em><b>Carrier Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIA_STATION__CARRIER_CONSTRAINT = eINSTANCE.getViaStation_CarrierConstraint();

		/**
		 * The meta object literal for the '<em><b>Carrier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIA_STATION__CARRIER = eINSTANCE.getViaStation_Carrier();

		/**
		 * The meta object literal for the '<em><b>Route</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIA_STATION__ROUTE = eINSTANCE.getViaStation_Route();

		/**
		 * The meta object literal for the '<em><b>Alternative Routes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIA_STATION__ALTERNATIVE_ROUTES = eINSTANCE.getViaStation_AlternativeRoutes();

		/**
		 * The meta object literal for the '<em><b>Data Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIA_STATION__DATA_DESCRIPTION = eINSTANCE.getViaStation_DataDescription();

		/**
		 * The meta object literal for the '<em><b>Fare Station Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIA_STATION__FARE_STATION_SET = eINSTANCE.getViaStation_FareStationSet();

		/**
		 * The meta object literal for the '<em><b>Service Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIA_STATION__SERVICE_CONSTRAINT = eINSTANCE.getViaStation_ServiceConstraint();

		/**
		 * The meta object literal for the '<em><b>Technical Via Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIA_STATION__TECHNICAL_VIA_ONLY = eINSTANCE.getViaStation_TechnicalViaOnly();

		/**
		 * The meta object literal for the '<em><b>Real Stop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIA_STATION__REAL_STOP = eINSTANCE.getViaStation_RealStop();

		/**
		 * The meta object literal for the '<em><b>Get Description</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VIA_STATION___GET_DESCRIPTION = eINSTANCE.getViaStation__GetDescription();

		/**
		 * The meta object literal for the '{@link Gtm.impl.AlternativeRouteImpl <em>Alternative Route</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.AlternativeRouteImpl
		 * @see Gtm.impl.GtmPackageImpl#getAlternativeRoute()
		 * @generated
		 */
		EClass ALTERNATIVE_ROUTE = eINSTANCE.getAlternativeRoute();

		/**
		 * The meta object literal for the '<em><b>Stations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTERNATIVE_ROUTE__STATIONS = eINSTANCE.getAlternativeRoute_Stations();

		/**
		 * The meta object literal for the '{@link Gtm.impl.RouteImpl <em>Route</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.RouteImpl
		 * @see Gtm.impl.GtmPackageImpl#getRoute()
		 * @generated
		 */
		EClass ROUTE = eINSTANCE.getRoute();

		/**
		 * The meta object literal for the '<em><b>Stations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE__STATIONS = eINSTANCE.getRoute_Stations();

		/**
		 * The meta object literal for the '{@link Gtm.impl.ZoneImpl <em>Zone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.ZoneImpl
		 * @see Gtm.impl.GtmPackageImpl#getZone()
		 * @generated
		 */
		EClass ZONE = eINSTANCE.getZone();

		/**
		 * The meta object literal for the '<em><b>Binary Zone Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZONE__BINARY_ZONE_ID = eINSTANCE.getZone_BinaryZoneId();

		/**
		 * The meta object literal for the '<em><b>Zone Id</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZONE__ZONE_ID = eINSTANCE.getZone_ZoneId();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZONE__CITY = eINSTANCE.getZone_City();

		/**
		 * The meta object literal for the '<em><b>Carrier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZONE__CARRIER = eINSTANCE.getZone_Carrier();

		/**
		 * The meta object literal for the '<em><b>Entry Station</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZONE__ENTRY_STATION = eINSTANCE.getZone_EntryStation();

		/**
		 * The meta object literal for the '<em><b>Terminal Station</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZONE__TERMINAL_STATION = eINSTANCE.getZone_TerminalStation();

		/**
		 * The meta object literal for the '<em><b>Nuts Code</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZONE__NUTS_CODE = eINSTANCE.getZone_NutsCode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZONE__NAME = eINSTANCE.getZone_Name();

		/**
		 * The meta object literal for the '{@link Gtm.impl.LineImpl <em>Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.LineImpl
		 * @see Gtm.impl.GtmPackageImpl#getLine()
		 * @generated
		 */
		EClass LINE = eINSTANCE.getLine();

		/**
		 * The meta object literal for the '<em><b>Binary Zone Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE__BINARY_ZONE_ID = eINSTANCE.getLine_BinaryZoneId();

		/**
		 * The meta object literal for the '<em><b>Line Id</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE__LINE_ID = eINSTANCE.getLine_LineId();

		/**
		 * The meta object literal for the '<em><b>Carrier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE__CARRIER = eINSTANCE.getLine_Carrier();

		/**
		 * The meta object literal for the '<em><b>Entry Station</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE__ENTRY_STATION = eINSTANCE.getLine_EntryStation();

		/**
		 * The meta object literal for the '<em><b>Terminal Station</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE__TERMINAL_STATION = eINSTANCE.getLine_TerminalStation();

		/**
		 * The meta object literal for the '<em><b>Nuts Code</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE__NUTS_CODE = eINSTANCE.getLine_NutsCode();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE__CITY = eINSTANCE.getLine_City();

		/**
		 * The meta object literal for the '{@link Gtm.impl.PolygoneImpl <em>Polygone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.PolygoneImpl
		 * @see Gtm.impl.GtmPackageImpl#getPolygone()
		 * @generated
		 */
		EClass POLYGONE = eINSTANCE.getPolygone();

		/**
		 * The meta object literal for the '<em><b>Edge</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLYGONE__EDGE = eINSTANCE.getPolygone_Edge();

		/**
		 * The meta object literal for the '{@link Gtm.impl.EdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.EdgeImpl
		 * @see Gtm.impl.GtmPackageImpl#getEdge()
		 * @generated
		 */
		EClass EDGE = eINSTANCE.getEdge();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE__SYSTEM = eINSTANCE.getEdge_System();

		/**
		 * The meta object literal for the '<em><b>Accuracy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE__ACCURACY = eINSTANCE.getEdge_Accuracy();

		/**
		 * The meta object literal for the '<em><b>Longitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE__LONGITUDE = eINSTANCE.getEdge_Longitude();

		/**
		 * The meta object literal for the '<em><b>Latitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE__LATITUDE = eINSTANCE.getEdge_Latitude();

		/**
		 * The meta object literal for the '{@link Gtm.impl.ZoneDefinitionsImpl <em>Zone Definitions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.ZoneDefinitionsImpl
		 * @see Gtm.impl.GtmPackageImpl#getZoneDefinitions()
		 * @generated
		 */
		EClass ZONE_DEFINITIONS = eINSTANCE.getZoneDefinitions();

		/**
		 * The meta object literal for the '<em><b>Zone Definition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZONE_DEFINITIONS__ZONE_DEFINITION = eINSTANCE.getZoneDefinitions_ZoneDefinition();

		/**
		 * The meta object literal for the '{@link Gtm.impl.ZoneDefinitionImpl <em>Zone Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.ZoneDefinitionImpl
		 * @see Gtm.impl.GtmPackageImpl#getZoneDefinition()
		 * @generated
		 */
		EClass ZONE_DEFINITION = eINSTANCE.getZoneDefinition();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZONE_DEFINITION__PROVIDER = eINSTANCE.getZoneDefinition_Provider();

		/**
		 * The meta object literal for the '<em><b>Zone Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZONE_DEFINITION__ZONE_ID = eINSTANCE.getZoneDefinition_ZoneId();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZONE_DEFINITION__NAME = eINSTANCE.getZoneDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Polygone</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZONE_DEFINITION__POLYGONE = eINSTANCE.getZoneDefinition_Polygone();

		/**
		 * The meta object literal for the '<em><b>Name Utf8</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZONE_DEFINITION__NAME_UTF8 = eINSTANCE.getZoneDefinition_NameUtf8();

		/**
		 * The meta object literal for the '<em><b>Station Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZONE_DEFINITION__STATION_SET = eINSTANCE.getZoneDefinition_StationSet();

		/**
		 * The meta object literal for the '<em><b>Nuts Codes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZONE_DEFINITION__NUTS_CODES = eINSTANCE.getZoneDefinition_NutsCodes();

		/**
		 * The meta object literal for the '{@link Gtm.impl.CarrierResourceLocationImpl <em>Carrier Resource Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.CarrierResourceLocationImpl
		 * @see Gtm.impl.GtmPackageImpl#getCarrierResourceLocation()
		 * @generated
		 */
		EClass CARRIER_RESOURCE_LOCATION = eINSTANCE.getCarrierResourceLocation();

		/**
		 * The meta object literal for the '<em><b>Carrier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARRIER_RESOURCE_LOCATION__CARRIER = eINSTANCE.getCarrierResourceLocation_Carrier();

		/**
		 * The meta object literal for the '<em><b>Service Brand</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARRIER_RESOURCE_LOCATION__SERVICE_BRAND = eINSTANCE.getCarrierResourceLocation_ServiceBrand();

		/**
		 * The meta object literal for the '<em><b>Online Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARRIER_RESOURCE_LOCATION__ONLINE_RESOURCES = eINSTANCE.getCarrierResourceLocation_OnlineResources();

		/**
		 * The meta object literal for the '{@link Gtm.impl.CrossBorderConditionImpl <em>Cross Border Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.CrossBorderConditionImpl
		 * @see Gtm.impl.GtmPackageImpl#getCrossBorderCondition()
		 * @generated
		 */
		EClass CROSS_BORDER_CONDITION = eINSTANCE.getCrossBorderCondition();

		/**
		 * The meta object literal for the '<em><b>From Country</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CROSS_BORDER_CONDITION__FROM_COUNTRY = eINSTANCE.getCrossBorderCondition_FromCountry();

		/**
		 * The meta object literal for the '<em><b>To Country</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CROSS_BORDER_CONDITION__TO_COUNTRY = eINSTANCE.getCrossBorderCondition_ToCountry();

		/**
		 * The meta object literal for the '<em><b>Affected Service Brands</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CROSS_BORDER_CONDITION__AFFECTED_SERVICE_BRANDS = eINSTANCE.getCrossBorderCondition_AffectedServiceBrands();

		/**
		 * The meta object literal for the '{@link Gtm.impl.FareCombinationModelImpl <em>Fare Combination Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.FareCombinationModelImpl
		 * @see Gtm.impl.GtmPackageImpl#getFareCombinationModel()
		 * @generated
		 */
		EClass FARE_COMBINATION_MODEL = eINSTANCE.getFareCombinationModel();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARE_COMBINATION_MODEL__MODEL = eINSTANCE.getFareCombinationModel_Model();

		/**
		 * The meta object literal for the '<em><b>Combinable Carriers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_COMBINATION_MODEL__COMBINABLE_CARRIERS = eINSTANCE.getFareCombinationModel_CombinableCarriers();

		/**
		 * The meta object literal for the '<em><b>Only When Combined</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARE_COMBINATION_MODEL__ONLY_WHEN_COMBINED = eINSTANCE.getFareCombinationModel_OnlyWhenCombined();

		/**
		 * The meta object literal for the '<em><b>Allowed Allocators</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_COMBINATION_MODEL__ALLOWED_ALLOCATORS = eINSTANCE.getFareCombinationModel_AllowedAllocators();

		/**
		 * The meta object literal for the '<em><b>Reference Cluster</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARE_COMBINATION_MODEL__REFERENCE_CLUSTER = eINSTANCE.getFareCombinationModel_ReferenceCluster();

		/**
		 * The meta object literal for the '<em><b>Allowed Clusters</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARE_COMBINATION_MODEL__ALLOWED_CLUSTERS = eINSTANCE.getFareCombinationModel_AllowedClusters();

		/**
		 * The meta object literal for the '<em><b>Allowed Common Contracts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_COMBINATION_MODEL__ALLOWED_COMMON_CONTRACTS = eINSTANCE.getFareCombinationModel_AllowedCommonContracts();

		/**
		 * The meta object literal for the '{@link Gtm.impl.ProductsImpl <em>Products</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.ProductsImpl
		 * @see Gtm.impl.GtmPackageImpl#getProducts()
		 * @generated
		 */
		EClass PRODUCTS = eINSTANCE.getProducts();

		/**
		 * The meta object literal for the '<em><b>Products</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCTS__PRODUCTS = eINSTANCE.getProducts_Products();

		/**
		 * The meta object literal for the '{@link Gtm.impl.ProductImpl <em>Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.ProductImpl
		 * @see Gtm.impl.GtmPackageImpl#getProduct()
		 * @generated
		 */
		EClass PRODUCT = eINSTANCE.getProduct();

		/**
		 * The meta object literal for the '<em><b>Data Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__DATA_SOURCE = eINSTANCE.getProduct_DataSource();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__ID = eINSTANCE.getProduct_Id();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__CODE = eINSTANCE.getProduct_Code();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__NAME = eINSTANCE.getProduct_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__TYPE = eINSTANCE.getProduct_Type();

		/**
		 * The meta object literal for the '<em><b>Summary</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__SUMMARY = eINSTANCE.getProduct_Summary();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__DESCRIPTION = eINSTANCE.getProduct_Description();

		/**
		 * The meta object literal for the '<em><b>Travel Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__TRAVEL_CLASS = eINSTANCE.getProduct_TravelClass();

		/**
		 * The meta object literal for the '<em><b>Service Constraint Text</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__SERVICE_CONSTRAINT_TEXT = eINSTANCE.getProduct_ServiceConstraintText();

		/**
		 * The meta object literal for the '<em><b>Carrier Constraint Text</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__CARRIER_CONSTRAINT_TEXT = eINSTANCE.getProduct_CarrierConstraintText();

		/**
		 * The meta object literal for the '<em><b>Condition Texts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__CONDITION_TEXTS = eINSTANCE.getProduct_ConditionTexts();

		/**
		 * The meta object literal for the '<em><b>Return Product</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__RETURN_PRODUCT = eINSTANCE.getProduct_ReturnProduct();

		/**
		 * The meta object literal for the '<em><b>Train Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__TRAIN_BOUND = eINSTANCE.getProduct_TrainBound();

		/**
		 * The meta object literal for the '<em><b>Refundable After Validity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__REFUNDABLE_AFTER_VALIDITY = eINSTANCE.getProduct_RefundableAfterValidity();

		/**
		 * The meta object literal for the '<em><b>Refundable Before Validity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__REFUNDABLE_BEFORE_VALIDITY = eINSTANCE.getProduct_RefundableBeforeValidity();

		/**
		 * The meta object literal for the '<em><b>Exchangeable After Validity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__EXCHANGEABLE_AFTER_VALIDITY = eINSTANCE.getProduct_ExchangeableAfterValidity();

		/**
		 * The meta object literal for the '<em><b>Exchangeable Before Validity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__EXCHANGEABLE_BEFORE_VALIDITY = eINSTANCE.getProduct_ExchangeableBeforeValidity();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__TYPE = eINSTANCE.getProduct_Type();

		/**
		 * The meta object literal for the '{@link Gtm.impl.ConditionTextImpl <em>Condition Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.ConditionTextImpl
		 * @see Gtm.impl.GtmPackageImpl#getConditionText()
		 * @generated
		 */
		EClass CONDITION_TEXT = eINSTANCE.getConditionText();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_TEXT__TEXT = eINSTANCE.getConditionText_Text();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION_TEXT__TYPE = eINSTANCE.getConditionText_Type();

		/**
		 * The meta object literal for the '{@link Gtm.impl.ReductionConstraintImpl <em>Reduction Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.ReductionConstraintImpl
		 * @see Gtm.impl.GtmPackageImpl#getReductionConstraint()
		 * @generated
		 */
		EClass REDUCTION_CONSTRAINT = eINSTANCE.getReductionConstraint();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REDUCTION_CONSTRAINT__ID = eINSTANCE.getReductionConstraint_Id();

		/**
		 * The meta object literal for the '<em><b>Required Reduction Cards</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDUCTION_CONSTRAINT__REQUIRED_REDUCTION_CARDS = eINSTANCE.getReductionConstraint_RequiredReductionCards();

		/**
		 * The meta object literal for the '{@link Gtm.impl.RequiredReductionCardImpl <em>Required Reduction Card</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.RequiredReductionCardImpl
		 * @see Gtm.impl.GtmPackageImpl#getRequiredReductionCard()
		 * @generated
		 */
		EClass REQUIRED_REDUCTION_CARD = eINSTANCE.getRequiredReductionCard();

		/**
		 * The meta object literal for the '<em><b>Card Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED_REDUCTION_CARD__CARD_CLASS = eINSTANCE.getRequiredReductionCard_CardClass();

		/**
		 * The meta object literal for the '<em><b>Card</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED_REDUCTION_CARD__CARD = eINSTANCE.getRequiredReductionCard_Card();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIRED_REDUCTION_CARD__NAME = eINSTANCE.getRequiredReductionCard_Name();

		/**
		 * The meta object literal for the '{@link Gtm.impl.LuggageConstraintsImpl <em>Luggage Constraints</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.LuggageConstraintsImpl
		 * @see Gtm.impl.GtmPackageImpl#getLuggageConstraints()
		 * @generated
		 */
		EClass LUGGAGE_CONSTRAINTS = eINSTANCE.getLuggageConstraints();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LUGGAGE_CONSTRAINTS__CONSTRAINTS = eINSTANCE.getLuggageConstraints_Constraints();

		/**
		 * The meta object literal for the '{@link Gtm.impl.LuggageConstraintImpl <em>Luggage Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.LuggageConstraintImpl
		 * @see Gtm.impl.GtmPackageImpl#getLuggageConstraint()
		 * @generated
		 */
		EClass LUGGAGE_CONSTRAINT = eINSTANCE.getLuggageConstraint();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LUGGAGE_CONSTRAINT__ID = eINSTANCE.getLuggageConstraint_Id();

		/**
		 * The meta object literal for the '<em><b>Max Hand Luggage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LUGGAGE_CONSTRAINT__MAX_HAND_LUGGAGE = eINSTANCE.getLuggageConstraint_MaxHandLuggage();

		/**
		 * The meta object literal for the '<em><b>Max Large Luggage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LUGGAGE_CONSTRAINT__MAX_LARGE_LUGGAGE = eINSTANCE.getLuggageConstraint_MaxLargeLuggage();

		/**
		 * The meta object literal for the '<em><b>Restricted Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LUGGAGE_CONSTRAINT__RESTRICTED_ITEMS = eINSTANCE.getLuggageConstraint_RestrictedItems();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LUGGAGE_CONSTRAINT__RULES = eINSTANCE.getLuggageConstraint_Rules();

		/**
		 * The meta object literal for the '<em><b>Data Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LUGGAGE_CONSTRAINT__DATA_DESCRIPTION = eINSTANCE.getLuggageConstraint_DataDescription();

		/**
		 * The meta object literal for the '{@link Gtm.impl.LuggageItemsRestrictionImpl <em>Luggage Items Restriction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.LuggageItemsRestrictionImpl
		 * @see Gtm.impl.GtmPackageImpl#getLuggageItemsRestriction()
		 * @generated
		 */
		EClass LUGGAGE_ITEMS_RESTRICTION = eINSTANCE.getLuggageItemsRestriction();

		/**
		 * The meta object literal for the '<em><b>Number Of Items</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LUGGAGE_ITEMS_RESTRICTION__NUMBER_OF_ITEMS = eINSTANCE.getLuggageItemsRestriction_NumberOfItems();

		/**
		 * The meta object literal for the '<em><b>Dimension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LUGGAGE_ITEMS_RESTRICTION__DIMENSION = eINSTANCE.getLuggageItemsRestriction_Dimension();

		/**
		 * The meta object literal for the '{@link Gtm.impl.LuggageDimensionImpl <em>Luggage Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.LuggageDimensionImpl
		 * @see Gtm.impl.GtmPackageImpl#getLuggageDimension()
		 * @generated
		 */
		EClass LUGGAGE_DIMENSION = eINSTANCE.getLuggageDimension();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LUGGAGE_DIMENSION__VALUE = eINSTANCE.getLuggageDimension_Value();

		/**
		 * The meta object literal for the '<em><b>Dimension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LUGGAGE_DIMENSION__DIMENSION = eINSTANCE.getLuggageDimension_Dimension();

		/**
		 * The meta object literal for the '{@link Gtm.impl.ConversionFromLegacyImpl <em>Conversion From Legacy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.ConversionFromLegacyImpl
		 * @see Gtm.impl.GtmPackageImpl#getConversionFromLegacy()
		 * @generated
		 */
		EClass CONVERSION_FROM_LEGACY = eINSTANCE.getConversionFromLegacy();

		/**
		 * The meta object literal for the '<em><b>Legacy108</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVERSION_FROM_LEGACY__LEGACY108 = eINSTANCE.getConversionFromLegacy_Legacy108();

		/**
		 * The meta object literal for the '<em><b>Params</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVERSION_FROM_LEGACY__PARAMS = eINSTANCE.getConversionFromLegacy_Params();

		/**
		 * The meta object literal for the '{@link Gtm.impl.ConversionParamsImpl <em>Conversion Params</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.ConversionParamsImpl
		 * @see Gtm.impl.GtmPackageImpl#getConversionParams()
		 * @generated
		 */
		EClass CONVERSION_PARAMS = eINSTANCE.getConversionParams();

		/**
		 * The meta object literal for the '<em><b>Tax Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONVERSION_PARAMS__TAX_ID = eINSTANCE.getConversionParams_TaxId();

		/**
		 * The meta object literal for the '<em><b>VA Tpercentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONVERSION_PARAMS__VA_TPERCENTAGE = eINSTANCE.getConversionParams_VATpercentage();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVERSION_PARAMS__COUNTRY = eINSTANCE.getConversionParams_Country();

		/**
		 * The meta object literal for the '<em><b>Legacy Border Point Mappings</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVERSION_PARAMS__LEGACY_BORDER_POINT_MAPPINGS = eINSTANCE.getConversionParams_LegacyBorderPointMappings();

		/**
		 * The meta object literal for the '<em><b>Legacy Station Mappings</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVERSION_PARAMS__LEGACY_STATION_MAPPINGS = eINSTANCE.getConversionParams_LegacyStationMappings();

		/**
		 * The meta object literal for the '<em><b>Legacy Fare Templates</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVERSION_PARAMS__LEGACY_FARE_TEMPLATES = eINSTANCE.getConversionParams_LegacyFareTemplates();

		/**
		 * The meta object literal for the '<em><b>Legacy Fare Station Mappings</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVERSION_PARAMS__LEGACY_FARE_STATION_MAPPINGS = eINSTANCE.getConversionParams_LegacyFareStationMappings();

		/**
		 * The meta object literal for the '<em><b>Legacy Station To Service Brand Mappings</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVERSION_PARAMS__LEGACY_STATION_TO_SERVICE_BRAND_MAPPINGS = eINSTANCE.getConversionParams_LegacyStationToServiceBrandMappings();

		/**
		 * The meta object literal for the '<em><b>Legacy Station To Fare Detail Mappings</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVERSION_PARAMS__LEGACY_STATION_TO_FARE_DETAIL_MAPPINGS = eINSTANCE.getConversionParams_LegacyStationToFareDetailMappings();

		/**
		 * The meta object literal for the '<em><b>End Of Sale</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVERSION_PARAMS__END_OF_SALE = eINSTANCE.getConversionParams_EndOfSale();

		/**
		 * The meta object literal for the '<em><b>Start Of Sale</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVERSION_PARAMS__START_OF_SALE = eINSTANCE.getConversionParams_StartOfSale();

		/**
		 * The meta object literal for the '<em><b>Station Import Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONVERSION_PARAMS__STATION_IMPORT_FILTER = eINSTANCE.getConversionParams_StationImportFilter();

		/**
		 * The meta object literal for the '<em><b>Convert Fare Descriptions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONVERSION_PARAMS__CONVERT_FARE_DESCRIPTIONS = eINSTANCE.getConversionParams_ConvertFareDescriptions();

		/**
		 * The meta object literal for the '<em><b>Convert Service Constraints</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONVERSION_PARAMS__CONVERT_SERVICE_CONSTRAINTS = eINSTANCE.getConversionParams_ConvertServiceConstraints();

		/**
		 * The meta object literal for the '<em><b>Vat Templates</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVERSION_PARAMS__VAT_TEMPLATES = eINSTANCE.getConversionParams_VatTemplates();

		/**
		 * The meta object literal for the '<em><b>Bus Ferry Mapping</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVERSION_PARAMS__BUS_FERRY_MAPPING = eINSTANCE.getConversionParams_BusFerryMapping();

		/**
		 * The meta object literal for the '<em><b>Legacy Border Indication</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONVERSION_PARAMS__LEGACY_BORDER_INDICATION = eINSTANCE.getConversionParams_LegacyBorderIndication();

		/**
		 * The meta object literal for the '<em><b>Remove Unused Legacy Stations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONVERSION_PARAMS__REMOVE_UNUSED_LEGACY_STATIONS = eINSTANCE.getConversionParams_RemoveUnusedLegacyStations();

		/**
		 * The meta object literal for the '<em><b>Add Carrier Rules</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVERSION_PARAMS__ADD_CARRIER_RULES = eINSTANCE.getConversionParams_AddCarrierRules();

		/**
		 * The meta object literal for the '<em><b>Named Carrier Lists</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVERSION_PARAMS__NAMED_CARRIER_LISTS = eINSTANCE.getConversionParams_NamedCarrierLists();

		/**
		 * The meta object literal for the '{@link Gtm.impl.NamedCarrierListsImpl <em>Named Carrier Lists</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.NamedCarrierListsImpl
		 * @see Gtm.impl.GtmPackageImpl#getNamedCarrierLists()
		 * @generated
		 */
		EClass NAMED_CARRIER_LISTS = eINSTANCE.getNamedCarrierLists();

		/**
		 * The meta object literal for the '<em><b>Named Carrier List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_CARRIER_LISTS__NAMED_CARRIER_LIST = eINSTANCE.getNamedCarrierLists_NamedCarrierList();

		/**
		 * The meta object literal for the '{@link Gtm.impl.NamedCarrierListImpl <em>Named Carrier List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.NamedCarrierListImpl
		 * @see Gtm.impl.GtmPackageImpl#getNamedCarrierList()
		 * @generated
		 */
		EClass NAMED_CARRIER_LIST = eINSTANCE.getNamedCarrierList();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_CARRIER_LIST__NAME = eINSTANCE.getNamedCarrierList_Name();

		/**
		 * The meta object literal for the '<em><b>Carriers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_CARRIER_LIST__CARRIERS = eINSTANCE.getNamedCarrierList_Carriers();

		/**
		 * The meta object literal for the '<em><b>Replacement Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_CARRIER_LIST__REPLACEMENT_CODE = eINSTANCE.getNamedCarrierList_ReplacementCode();

		/**
		 * The meta object literal for the '<em><b>Carrier Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_CARRIER_LIST__CARRIER_GROUP = eINSTANCE.getNamedCarrierList_CarrierGroup();

		/**
		 * The meta object literal for the '{@link Gtm.impl.AddCarrierRulesImpl <em>Add Carrier Rules</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.AddCarrierRulesImpl
		 * @see Gtm.impl.GtmPackageImpl#getAddCarrierRules()
		 * @generated
		 */
		EClass ADD_CARRIER_RULES = eINSTANCE.getAddCarrierRules();

		/**
		 * The meta object literal for the '<em><b>Add Carrier Rule</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD_CARRIER_RULES__ADD_CARRIER_RULE = eINSTANCE.getAddCarrierRules_AddCarrierRule();

		/**
		 * The meta object literal for the '{@link Gtm.impl.AddCarrierRuleImpl <em>Add Carrier Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.AddCarrierRuleImpl
		 * @see Gtm.impl.GtmPackageImpl#getAddCarrierRule()
		 * @generated
		 */
		EClass ADD_CARRIER_RULE = eINSTANCE.getAddCarrierRule();

		/**
		 * The meta object literal for the '<em><b>Carrier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD_CARRIER_RULE__CARRIER = eINSTANCE.getAddCarrierRule_Carrier();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_CARRIER_RULE__SCOPE = eINSTANCE.getAddCarrierRule_Scope();

		/**
		 * The meta object literal for the '<em><b>Stations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD_CARRIER_RULE__STATIONS = eINSTANCE.getAddCarrierRule_Stations();

		/**
		 * The meta object literal for the '{@link Gtm.impl.VatTemplatesImpl <em>Vat Templates</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.VatTemplatesImpl
		 * @see Gtm.impl.GtmPackageImpl#getVatTemplates()
		 * @generated
		 */
		EClass VAT_TEMPLATES = eINSTANCE.getVatTemplates();

		/**
		 * The meta object literal for the '<em><b>Vat Templates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VAT_TEMPLATES__VAT_TEMPLATES = eINSTANCE.getVatTemplates_VatTemplates();

		/**
		 * The meta object literal for the '{@link Gtm.impl.VatTemplateImpl <em>Vat Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.VatTemplateImpl
		 * @see Gtm.impl.GtmPackageImpl#getVatTemplate()
		 * @generated
		 */
		EClass VAT_TEMPLATE = eINSTANCE.getVatTemplate();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAT_TEMPLATE__SCOPE = eINSTANCE.getVatTemplate_Scope();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VAT_TEMPLATE__COUNTRY = eINSTANCE.getVatTemplate_Country();

		/**
		 * The meta object literal for the '<em><b>Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAT_TEMPLATE__PERCENTAGE = eINSTANCE.getVatTemplate_Percentage();

		/**
		 * The meta object literal for the '<em><b>Tax Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAT_TEMPLATE__TAX_ID = eINSTANCE.getVatTemplate_TaxId();

		/**
		 * The meta object literal for the '{@link Gtm.impl.FareTemplateImpl <em>Fare Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.FareTemplateImpl
		 * @see Gtm.impl.GtmPackageImpl#getFareTemplate()
		 * @generated
		 */
		EClass FARE_TEMPLATE = eINSTANCE.getFareTemplate();

		/**
		 * The meta object literal for the '<em><b>Price Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARE_TEMPLATE__PRICE_FACTOR = eINSTANCE.getFareTemplate_PriceFactor();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_TEMPLATE__PRICE = eINSTANCE.getFareTemplate_Price();

		/**
		 * The meta object literal for the '<em><b>Minimal Price</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_TEMPLATE__MINIMAL_PRICE = eINSTANCE.getFareTemplate_MinimalPrice();

		/**
		 * The meta object literal for the '<em><b>Maximal Price</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_TEMPLATE__MAXIMAL_PRICE = eINSTANCE.getFareTemplate_MaximalPrice();

		/**
		 * The meta object literal for the '<em><b>Rounding Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARE_TEMPLATE__ROUNDING_MODE = eINSTANCE.getFareTemplate_RoundingMode();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARE_TEMPLATE__ID = eINSTANCE.getFareTemplate_Id();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARE_TEMPLATE__TYPE = eINSTANCE.getFareTemplate_Type();

		/**
		 * The meta object literal for the '<em><b>After Sales Template</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_TEMPLATE__AFTER_SALES_TEMPLATE = eINSTANCE.getFareTemplate_AfterSalesTemplate();

		/**
		 * The meta object literal for the '<em><b>Data Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARE_TEMPLATE__DATA_DESCRIPTION = eINSTANCE.getFareTemplate_DataDescription();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_TEMPLATE__TEXT = eINSTANCE.getFareTemplate_Text();

		/**
		 * The meta object literal for the '<em><b>Fare Constraint Bundle</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_TEMPLATE__FARE_CONSTRAINT_BUNDLE = eINSTANCE.getFareTemplate_FareConstraintBundle();

		/**
		 * The meta object literal for the '<em><b>Separate Contract Fare Constraint Bundle</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_TEMPLATE__SEPARATE_CONTRACT_FARE_CONSTRAINT_BUNDLE = eINSTANCE.getFareTemplate_SeparateContractFareConstraintBundle();

		/**
		 * The meta object literal for the '<em><b>Service Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_TEMPLATE__SERVICE_CONSTRAINT = eINSTANCE.getFareTemplate_ServiceConstraint();

		/**
		 * The meta object literal for the '<em><b>Carrier Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_TEMPLATE__CARRIER_CONSTRAINT = eINSTANCE.getFareTemplate_CarrierConstraint();

		/**
		 * The meta object literal for the '<em><b>Service Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_TEMPLATE__SERVICE_CLASS = eINSTANCE.getFareTemplate_ServiceClass();

		/**
		 * The meta object literal for the '<em><b>Service Level</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_TEMPLATE__SERVICE_LEVEL = eINSTANCE.getFareTemplate_ServiceLevel();

		/**
		 * The meta object literal for the '<em><b>Sales Availability</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_TEMPLATE__SALES_AVAILABILITY = eINSTANCE.getFareTemplate_SalesAvailability();

		/**
		 * The meta object literal for the '<em><b>Travel Validity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_TEMPLATE__TRAVEL_VALIDITY = eINSTANCE.getFareTemplate_TravelValidity();

		/**
		 * The meta object literal for the '<em><b>Combination Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_TEMPLATE__COMBINATION_CONSTRAINT = eINSTANCE.getFareTemplate_CombinationConstraint();

		/**
		 * The meta object literal for the '<em><b>Separate Contract Combination Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_TEMPLATE__SEPARATE_CONTRACT_COMBINATION_CONSTRAINT = eINSTANCE.getFareTemplate_SeparateContractCombinationConstraint();

		/**
		 * The meta object literal for the '<em><b>Fare Detail Description</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_TEMPLATE__FARE_DETAIL_DESCRIPTION = eINSTANCE.getFareTemplate_FareDetailDescription();

		/**
		 * The meta object literal for the '<em><b>Legacy Accounting Identifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_TEMPLATE__LEGACY_ACCOUNTING_IDENTIFIER = eINSTANCE.getFareTemplate_LegacyAccountingIdentifier();

		/**
		 * The meta object literal for the '<em><b>Personal Data Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_TEMPLATE__PERSONAL_DATA_CONSTRAINT = eINSTANCE.getFareTemplate_PersonalDataConstraint();

		/**
		 * The meta object literal for the '<em><b>Reservation Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_TEMPLATE__RESERVATION_PARAMETER = eINSTANCE.getFareTemplate_ReservationParameter();

		/**
		 * The meta object literal for the '<em><b>Reduction Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_TEMPLATE__REDUCTION_CONSTRAINT = eINSTANCE.getFareTemplate_ReductionConstraint();

		/**
		 * The meta object literal for the '<em><b>Fulfillment Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_TEMPLATE__FULFILLMENT_CONSTRAINT = eINSTANCE.getFareTemplate_FulfillmentConstraint();

		/**
		 * The meta object literal for the '<em><b>Passenger Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_TEMPLATE__PASSENGER_CONSTRAINT = eINSTANCE.getFareTemplate_PassengerConstraint();

		/**
		 * The meta object literal for the '<em><b>Legacy Conversion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARE_TEMPLATE__LEGACY_CONVERSION = eINSTANCE.getFareTemplate_LegacyConversion();

		/**
		 * The meta object literal for the '<em><b>Individual Contracts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARE_TEMPLATE__INDIVIDUAL_CONTRACTS = eINSTANCE.getFareTemplate_IndividualContracts();

		/**
		 * The meta object literal for the '<em><b>Regulatory Conditions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARE_TEMPLATE__REGULATORY_CONDITIONS = eINSTANCE.getFareTemplate_RegulatoryConditions();

		/**
		 * The meta object literal for the '<em><b>Legacy Accounting Tariff Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARE_TEMPLATE__LEGACY_ACCOUNTING_TARIFF_ID = eINSTANCE.getFareTemplate_LegacyAccountingTariffId();

		/**
		 * The meta object literal for the '<em><b>Series Filter</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARE_TEMPLATE__SERIES_FILTER = eINSTANCE.getFareTemplate_SeriesFilter();

		/**
		 * The meta object literal for the '<em><b>Base Price Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARE_TEMPLATE__BASE_PRICE_CLASS = eINSTANCE.getFareTemplate_BasePriceClass();

		/**
		 * The meta object literal for the '<em><b>Carrier Filter</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_TEMPLATE__CARRIER_FILTER = eINSTANCE.getFareTemplate_CarrierFilter();

		/**
		 * The meta object literal for the '<em><b>Luggage Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARE_TEMPLATE__LUGGAGE_CONSTRAINT = eINSTANCE.getFareTemplate_LuggageConstraint();

		/**
		 * The meta object literal for the '{@link Gtm.impl.MaximalPriceImpl <em>Maximal Price</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.MaximalPriceImpl
		 * @see Gtm.impl.GtmPackageImpl#getMaximalPrice()
		 * @generated
		 */
		EClass MAXIMAL_PRICE = eINSTANCE.getMaximalPrice();

		/**
		 * The meta object literal for the '{@link Gtm.impl.MinimalPriceImpl <em>Minimal Price</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.MinimalPriceImpl
		 * @see Gtm.impl.GtmPackageImpl#getMinimalPrice()
		 * @generated
		 */
		EClass MINIMAL_PRICE = eINSTANCE.getMinimalPrice();

		/**
		 * The meta object literal for the '{@link Gtm.impl.AfterSalesTemplateImpl <em>After Sales Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.AfterSalesTemplateImpl
		 * @see Gtm.impl.GtmPackageImpl#getAfterSalesTemplate()
		 * @generated
		 */
		EClass AFTER_SALES_TEMPLATE = eINSTANCE.getAfterSalesTemplate();

		/**
		 * The meta object literal for the '<em><b>Transaction Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFTER_SALES_TEMPLATE__TRANSACTION_TYPE = eINSTANCE.getAfterSalesTemplate_TransactionType();

		/**
		 * The meta object literal for the '<em><b>Carrier Fee</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFTER_SALES_TEMPLATE__CARRIER_FEE = eINSTANCE.getAfterSalesTemplate_CarrierFee();

		/**
		 * The meta object literal for the '<em><b>Application Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AFTER_SALES_TEMPLATE__APPLICATION_TIME = eINSTANCE.getAfterSalesTemplate_ApplicationTime();

		/**
		 * The meta object literal for the '<em><b>Fee Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFTER_SALES_TEMPLATE__FEE_FACTOR = eINSTANCE.getAfterSalesTemplate_FeeFactor();

		/**
		 * The meta object literal for the '<em><b>Rounding Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFTER_SALES_TEMPLATE__ROUNDING_MODE = eINSTANCE.getAfterSalesTemplate_RoundingMode();

		/**
		 * The meta object literal for the '{@link Gtm.impl.LegacyStationToServiceConstraintMappingsImpl <em>Legacy Station To Service Constraint Mappings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.LegacyStationToServiceConstraintMappingsImpl
		 * @see Gtm.impl.GtmPackageImpl#getLegacyStationToServiceConstraintMappings()
		 * @generated
		 */
		EClass LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPINGS = eINSTANCE.getLegacyStationToServiceConstraintMappings();

		/**
		 * The meta object literal for the '<em><b>Legacy Station To Service Brand Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPINGS__LEGACY_STATION_TO_SERVICE_BRAND_MAPPINGS = eINSTANCE.getLegacyStationToServiceConstraintMappings_LegacyStationToServiceBrandMappings();

		/**
		 * The meta object literal for the '<em><b>Find Service Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPINGS___FIND_SERVICE_CONSTRAINT__INT = eINSTANCE.getLegacyStationToServiceConstraintMappings__FindServiceConstraint__int();

		/**
		 * The meta object literal for the '{@link Gtm.impl.LegacyBorderPointImpl <em>Legacy Border Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.LegacyBorderPointImpl
		 * @see Gtm.impl.GtmPackageImpl#getLegacyBorderPoint()
		 * @generated
		 */
		EClass LEGACY_BORDER_POINT = eINSTANCE.getLegacyBorderPoint();

		/**
		 * The meta object literal for the '<em><b>Border Point Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_BORDER_POINT__BORDER_POINT_CODE = eINSTANCE.getLegacyBorderPoint_BorderPointCode();

		/**
		 * The meta object literal for the '<em><b>Fake Border Stations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGACY_BORDER_POINT__FAKE_BORDER_STATIONS = eINSTANCE.getLegacyBorderPoint_FakeBorderStations();

		/**
		 * The meta object literal for the '<em><b>On Border Stations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGACY_BORDER_POINT__ON_BORDER_STATIONS = eINSTANCE.getLegacyBorderPoint_OnBorderStations();

		/**
		 * The meta object literal for the '<em><b>Border Sides</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGACY_BORDER_POINT__BORDER_SIDES = eINSTANCE.getLegacyBorderPoint_BorderSides();

		/**
		 * The meta object literal for the '<em><b>Incomplete Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_BORDER_POINT__INCOMPLETE_DATA = eINSTANCE.getLegacyBorderPoint_IncompleteData();

		/**
		 * The meta object literal for the '<em><b>Data Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_BORDER_POINT__DATA_DESCRIPTION = eINSTANCE.getLegacyBorderPoint_DataDescription();

		/**
		 * The meta object literal for the '{@link Gtm.impl.OnBorderStationsImpl <em>On Border Stations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.OnBorderStationsImpl
		 * @see Gtm.impl.GtmPackageImpl#getOnBorderStations()
		 * @generated
		 */
		EClass ON_BORDER_STATIONS = eINSTANCE.getOnBorderStations();

		/**
		 * The meta object literal for the '<em><b>Stations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_BORDER_STATIONS__STATIONS = eINSTANCE.getOnBorderStations_Stations();

		/**
		 * The meta object literal for the '{@link Gtm.impl.LegacyFakeBorderStationsImpl <em>Legacy Fake Border Stations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.LegacyFakeBorderStationsImpl
		 * @see Gtm.impl.GtmPackageImpl#getLegacyFakeBorderStations()
		 * @generated
		 */
		EClass LEGACY_FAKE_BORDER_STATIONS = eINSTANCE.getLegacyFakeBorderStations();

		/**
		 * The meta object literal for the '<em><b>Stations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGACY_FAKE_BORDER_STATIONS__STATIONS = eINSTANCE.getLegacyFakeBorderStations_Stations();

		/**
		 * The meta object literal for the '{@link Gtm.impl.LegacyBorderSideImpl <em>Legacy Border Side</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.LegacyBorderSideImpl
		 * @see Gtm.impl.GtmPackageImpl#getLegacyBorderSide()
		 * @generated
		 */
		EClass LEGACY_BORDER_SIDE = eINSTANCE.getLegacyBorderSide();

		/**
		 * The meta object literal for the '<em><b>Carrier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGACY_BORDER_SIDE__CARRIER = eINSTANCE.getLegacyBorderSide_Carrier();

		/**
		 * The meta object literal for the '<em><b>Stations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGACY_BORDER_SIDE__STATIONS = eINSTANCE.getLegacyBorderSide_Stations();

		/**
		 * The meta object literal for the '<em><b>Legacy Station Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_BORDER_SIDE__LEGACY_STATION_CODE = eINSTANCE.getLegacyBorderSide_LegacyStationCode();

		/**
		 * The meta object literal for the '{@link Gtm.impl.LegacyBorderPointsImpl <em>Legacy Border Points</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.LegacyBorderPointsImpl
		 * @see Gtm.impl.GtmPackageImpl#getLegacyBorderPoints()
		 * @generated
		 */
		EClass LEGACY_BORDER_POINTS = eINSTANCE.getLegacyBorderPoints();

		/**
		 * The meta object literal for the '<em><b>Legacy Border Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGACY_BORDER_POINTS__LEGACY_BORDER_POINTS = eINSTANCE.getLegacyBorderPoints_LegacyBorderPoints();

		/**
		 * The meta object literal for the '{@link Gtm.impl.LegacyStationToServiceConstraintMappingImpl <em>Legacy Station To Service Constraint Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.LegacyStationToServiceConstraintMappingImpl
		 * @see Gtm.impl.GtmPackageImpl#getLegacyStationToServiceConstraintMapping()
		 * @generated
		 */
		EClass LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPING = eINSTANCE.getLegacyStationToServiceConstraintMapping();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPING__CODE = eINSTANCE.getLegacyStationToServiceConstraintMapping_Code();

		/**
		 * The meta object literal for the '<em><b>Service Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPING__SERVICE_CONSTRAINT = eINSTANCE.getLegacyStationToServiceConstraintMapping_ServiceConstraint();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_STATION_TO_SERVICE_CONSTRAINT_MAPPING__DESCRIPTION = eINSTANCE.getLegacyStationToServiceConstraintMapping_Description();

		/**
		 * The meta object literal for the '{@link Gtm.impl.LegacyStationMappingsImpl <em>Legacy Station Mappings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.LegacyStationMappingsImpl
		 * @see Gtm.impl.GtmPackageImpl#getLegacyStationMappings()
		 * @generated
		 */
		EClass LEGACY_STATION_MAPPINGS = eINSTANCE.getLegacyStationMappings();

		/**
		 * The meta object literal for the '<em><b>Station Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGACY_STATION_MAPPINGS__STATION_MAPPINGS = eINSTANCE.getLegacyStationMappings_StationMappings();

		/**
		 * The meta object literal for the '<em><b>Find Mapped Station</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEGACY_STATION_MAPPINGS___FIND_MAPPED_STATION__INT = eINSTANCE.getLegacyStationMappings__FindMappedStation__int();

		/**
		 * The meta object literal for the '{@link Gtm.impl.LegacyStationMapImpl <em>Legacy Station Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.LegacyStationMapImpl
		 * @see Gtm.impl.GtmPackageImpl#getLegacyStationMap()
		 * @generated
		 */
		EClass LEGACY_STATION_MAP = eINSTANCE.getLegacyStationMap();

		/**
		 * The meta object literal for the '<em><b>Legacy Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_STATION_MAP__LEGACY_CODE = eINSTANCE.getLegacyStationMap_LegacyCode();

		/**
		 * The meta object literal for the '<em><b>Station</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGACY_STATION_MAP__STATION = eINSTANCE.getLegacyStationMap_Station();

		/**
		 * The meta object literal for the '<em><b>Data Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_STATION_MAP__DATA_SOURCE = eINSTANCE.getLegacyStationMap_DataSource();

		/**
		 * The meta object literal for the '{@link Gtm.impl.LegacyFareDetailMapsImpl <em>Legacy Fare Detail Maps</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.LegacyFareDetailMapsImpl
		 * @see Gtm.impl.GtmPackageImpl#getLegacyFareDetailMaps()
		 * @generated
		 */
		EClass LEGACY_FARE_DETAIL_MAPS = eINSTANCE.getLegacyFareDetailMaps();

		/**
		 * The meta object literal for the '<em><b>Legacy Fare Detail Maps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGACY_FARE_DETAIL_MAPS__LEGACY_FARE_DETAIL_MAPS = eINSTANCE.getLegacyFareDetailMaps_LegacyFareDetailMaps();

		/**
		 * The meta object literal for the '{@link Gtm.impl.LegacyFareDetailMapImpl <em>Legacy Fare Detail Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.LegacyFareDetailMapImpl
		 * @see Gtm.impl.GtmPackageImpl#getLegacyFareDetailMap()
		 * @generated
		 */
		EClass LEGACY_FARE_DETAIL_MAP = eINSTANCE.getLegacyFareDetailMap();

		/**
		 * The meta object literal for the '<em><b>Legacy Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_FARE_DETAIL_MAP__LEGACY_CODE = eINSTANCE.getLegacyFareDetailMap_LegacyCode();

		/**
		 * The meta object literal for the '<em><b>Fare Detail Description</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGACY_FARE_DETAIL_MAP__FARE_DETAIL_DESCRIPTION = eINSTANCE.getLegacyFareDetailMap_FareDetailDescription();

		/**
		 * The meta object literal for the '<em><b>Fare Detail Mapping Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_FARE_DETAIL_MAP__FARE_DETAIL_MAPPING_TYPE = eINSTANCE.getLegacyFareDetailMap_FareDetailMappingType();

		/**
		 * The meta object literal for the '{@link Gtm.impl.LegacyStationImpl <em>Legacy Station</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.LegacyStationImpl
		 * @see Gtm.impl.GtmPackageImpl#getLegacyStation()
		 * @generated
		 */
		EClass LEGACY_STATION = eINSTANCE.getLegacyStation();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_STATION__CODE = eINSTANCE.getLegacyStation_Code();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_STATION__NAME = eINSTANCE.getLegacyStation_Name();

		/**
		 * The meta object literal for the '{@link Gtm.impl.LegacyBoderPointMappingsImpl <em>Legacy Boder Point Mappings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.LegacyBoderPointMappingsImpl
		 * @see Gtm.impl.GtmPackageImpl#getLegacyBoderPointMappings()
		 * @generated
		 */
		EClass LEGACY_BODER_POINT_MAPPINGS = eINSTANCE.getLegacyBoderPointMappings();

		/**
		 * The meta object literal for the '<em><b>Border Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGACY_BODER_POINT_MAPPINGS__BORDER_POINTS = eINSTANCE.getLegacyBoderPointMappings_BorderPoints();

		/**
		 * The meta object literal for the '<em><b>Get Mapping By Border Point Code</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEGACY_BODER_POINT_MAPPINGS___GET_MAPPING_BY_BORDER_POINT_CODE__INT = eINSTANCE.getLegacyBoderPointMappings__GetMappingByBorderPointCode__int();

		/**
		 * The meta object literal for the '{@link Gtm.impl.LegacyBorderPointMappingImpl <em>Legacy Border Point Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.LegacyBorderPointMappingImpl
		 * @see Gtm.impl.GtmPackageImpl#getLegacyBorderPointMapping()
		 * @generated
		 */
		EClass LEGACY_BORDER_POINT_MAPPING = eINSTANCE.getLegacyBorderPointMapping();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_BORDER_POINT_MAPPING__CODE = eINSTANCE.getLegacyBorderPointMapping_Code();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_BORDER_POINT_MAPPING__NAME = eINSTANCE.getLegacyBorderPointMapping_Name();

		/**
		 * The meta object literal for the '<em><b>Station</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGACY_BORDER_POINT_MAPPING__STATION = eINSTANCE.getLegacyBorderPointMapping_Station();

		/**
		 * The meta object literal for the '<em><b>Connection Point</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGACY_BORDER_POINT_MAPPING__CONNECTION_POINT = eINSTANCE.getLegacyBorderPointMapping_ConnectionPoint();

		/**
		 * The meta object literal for the '{@link Gtm.impl.LegacyFareStationSetMappingsImpl <em>Legacy Fare Station Set Mappings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.LegacyFareStationSetMappingsImpl
		 * @see Gtm.impl.GtmPackageImpl#getLegacyFareStationSetMappings()
		 * @generated
		 */
		EClass LEGACY_FARE_STATION_SET_MAPPINGS = eINSTANCE.getLegacyFareStationSetMappings();

		/**
		 * The meta object literal for the '<em><b>Legacy Fare Station Set Map</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGACY_FARE_STATION_SET_MAPPINGS__LEGACY_FARE_STATION_SET_MAP = eINSTANCE.getLegacyFareStationSetMappings_LegacyFareStationSetMap();

		/**
		 * The meta object literal for the '{@link Gtm.impl.LegacyFareStationSetMapImpl <em>Legacy Fare Station Set Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.LegacyFareStationSetMapImpl
		 * @see Gtm.impl.GtmPackageImpl#getLegacyFareStationSetMap()
		 * @generated
		 */
		EClass LEGACY_FARE_STATION_SET_MAP = eINSTANCE.getLegacyFareStationSetMap();

		/**
		 * The meta object literal for the '<em><b>Legacy Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_FARE_STATION_SET_MAP__LEGACY_CODE = eINSTANCE.getLegacyFareStationSetMap_LegacyCode();

		/**
		 * The meta object literal for the '<em><b>Station Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGACY_FARE_STATION_SET_MAP__STATION_SET = eINSTANCE.getLegacyFareStationSetMap_StationSet();

		/**
		 * The meta object literal for the '{@link Gtm.impl.LegacyBusFerryMappingImpl <em>Legacy Bus Ferry Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.LegacyBusFerryMappingImpl
		 * @see Gtm.impl.GtmPackageImpl#getLegacyBusFerryMapping()
		 * @generated
		 */
		EClass LEGACY_BUS_FERRY_MAPPING = eINSTANCE.getLegacyBusFerryMapping();

		/**
		 * The meta object literal for the '<em><b>Bus Service Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGACY_BUS_FERRY_MAPPING__BUS_SERVICE_CONSTRAINT = eINSTANCE.getLegacyBusFerryMapping_BusServiceConstraint();

		/**
		 * The meta object literal for the '<em><b>Ferry Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGACY_BUS_FERRY_MAPPING__FERRY_CONSTRAINT = eINSTANCE.getLegacyBusFerryMapping_FerryConstraint();

		/**
		 * The meta object literal for the '<em><b>Bus Ferry Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGACY_BUS_FERRY_MAPPING__BUS_FERRY_CONSTRAINT = eINSTANCE.getLegacyBusFerryMapping_BusFerryConstraint();

		/**
		 * The meta object literal for the '{@link Gtm.impl.Legacy108Impl <em>Legacy108</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.Legacy108Impl
		 * @see Gtm.impl.GtmPackageImpl#getLegacy108()
		 * @generated
		 */
		EClass LEGACY108 = eINSTANCE.getLegacy108();

		/**
		 * The meta object literal for the '<em><b>Character Set</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY108__CHARACTER_SET = eINSTANCE.getLegacy108_CharacterSet();

		/**
		 * The meta object literal for the '<em><b>Legacy Series List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGACY108__LEGACY_SERIES_LIST = eINSTANCE.getLegacy108_LegacySeriesList();

		/**
		 * The meta object literal for the '<em><b>Legacy Separate Contract Series</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGACY108__LEGACY_SEPARATE_CONTRACT_SERIES = eINSTANCE.getLegacy108_LegacySeparateContractSeries();

		/**
		 * The meta object literal for the '<em><b>Legacy Distance Fares</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGACY108__LEGACY_DISTANCE_FARES = eINSTANCE.getLegacy108_LegacyDistanceFares();

		/**
		 * The meta object literal for the '<em><b>Legacy Route Fares</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGACY108__LEGACY_ROUTE_FARES = eINSTANCE.getLegacy108_LegacyRouteFares();

		/**
		 * The meta object literal for the '<em><b>Legacy Stations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGACY108__LEGACY_STATIONS = eINSTANCE.getLegacy108_LegacyStations();

		/**
		 * The meta object literal for the '<em><b>Legacy Fare Descriptions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGACY108__LEGACY_FARE_DESCRIPTIONS = eINSTANCE.getLegacy108_LegacyFareDescriptions();

		/**
		 * The meta object literal for the '<em><b>Time Zone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY108__TIME_ZONE = eINSTANCE.getLegacy108_TimeZone();

		/**
		 * The meta object literal for the '<em><b>Carrier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGACY108__CARRIER = eINSTANCE.getLegacy108_Carrier();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY108__START_DATE = eINSTANCE.getLegacy108_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY108__END_DATE = eINSTANCE.getLegacy108_EndDate();

		/**
		 * The meta object literal for the '<em><b>Legacy Border Points</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGACY108__LEGACY_BORDER_POINTS = eINSTANCE.getLegacy108_LegacyBorderPoints();

		/**
		 * The meta object literal for the '<em><b>Legacy Memos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGACY108__LEGACY_MEMOS = eINSTANCE.getLegacy108_LegacyMemos();

		/**
		 * The meta object literal for the '<em><b>Legacy Carriers</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGACY108__LEGACY_CARRIERS = eINSTANCE.getLegacy108_LegacyCarriers();

		/**
		 * The meta object literal for the '{@link Gtm.impl.Legacy108MemosImpl <em>Legacy108 Memos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.Legacy108MemosImpl
		 * @see Gtm.impl.GtmPackageImpl#getLegacy108Memos()
		 * @generated
		 */
		EClass LEGACY108_MEMOS = eINSTANCE.getLegacy108Memos();

		/**
		 * The meta object literal for the '<em><b>Legacy Memos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGACY108_MEMOS__LEGACY_MEMOS = eINSTANCE.getLegacy108Memos_LegacyMemos();

		/**
		 * The meta object literal for the '{@link Gtm.impl.Legacy108MemoImpl <em>Legacy108 Memo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.Legacy108MemoImpl
		 * @see Gtm.impl.GtmPackageImpl#getLegacy108Memo()
		 * @generated
		 */
		EClass LEGACY108_MEMO = eINSTANCE.getLegacy108Memo();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY108_MEMO__NUMBER = eINSTANCE.getLegacy108Memo_Number();

		/**
		 * The meta object literal for the '<em><b>Local</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY108_MEMO__LOCAL = eINSTANCE.getLegacy108Memo_Local();

		/**
		 * The meta object literal for the '<em><b>English</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY108_MEMO__ENGLISH = eINSTANCE.getLegacy108Memo_English();

		/**
		 * The meta object literal for the '<em><b>French</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY108_MEMO__FRENCH = eINSTANCE.getLegacy108Memo_French();

		/**
		 * The meta object literal for the '<em><b>German</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY108_MEMO__GERMAN = eINSTANCE.getLegacy108Memo_German();

		/**
		 * The meta object literal for the '{@link Gtm.impl.Legacy108FareDescriptionImpl <em>Legacy108 Fare Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.Legacy108FareDescriptionImpl
		 * @see Gtm.impl.GtmPackageImpl#getLegacy108FareDescription()
		 * @generated
		 */
		EClass LEGACY108_FARE_DESCRIPTION = eINSTANCE.getLegacy108FareDescription();

		/**
		 * The meta object literal for the '<em><b>Table Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY108_FARE_DESCRIPTION__TABLE_ID = eINSTANCE.getLegacy108FareDescription_TableId();

		/**
		 * The meta object literal for the '<em><b>Description Fr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY108_FARE_DESCRIPTION__DESCRIPTION_FR = eINSTANCE.getLegacy108FareDescription_DescriptionFr();

		/**
		 * The meta object literal for the '<em><b>Description Ge</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY108_FARE_DESCRIPTION__DESCRIPTION_GE = eINSTANCE.getLegacy108FareDescription_DescriptionGe();

		/**
		 * The meta object literal for the '<em><b>Description En</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY108_FARE_DESCRIPTION__DESCRIPTION_EN = eINSTANCE.getLegacy108FareDescription_DescriptionEn();

		/**
		 * The meta object literal for the '<em><b>Description Local</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY108_FARE_DESCRIPTION__DESCRIPTION_LOCAL = eINSTANCE.getLegacy108FareDescription_DescriptionLocal();

		/**
		 * The meta object literal for the '<em><b>Calculation Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY108_FARE_DESCRIPTION__CALCULATION_TYPE = eINSTANCE.getLegacy108FareDescription_CalculationType();

		/**
		 * The meta object literal for the '{@link Gtm.impl.Legacy108FaresDescriptionsImpl <em>Legacy108 Fares Descriptions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.Legacy108FaresDescriptionsImpl
		 * @see Gtm.impl.GtmPackageImpl#getLegacy108FaresDescriptions()
		 * @generated
		 */
		EClass LEGACY108_FARES_DESCRIPTIONS = eINSTANCE.getLegacy108FaresDescriptions();

		/**
		 * The meta object literal for the '<em><b>Legacy Fares</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGACY108_FARES_DESCRIPTIONS__LEGACY_FARES = eINSTANCE.getLegacy108FaresDescriptions_LegacyFares();

		/**
		 * The meta object literal for the '{@link Gtm.impl.Legacy108StationsImpl <em>Legacy108 Stations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.Legacy108StationsImpl
		 * @see Gtm.impl.GtmPackageImpl#getLegacy108Stations()
		 * @generated
		 */
		EClass LEGACY108_STATIONS = eINSTANCE.getLegacy108Stations();

		/**
		 * The meta object literal for the '<em><b>Legacy Stations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGACY108_STATIONS__LEGACY_STATIONS = eINSTANCE.getLegacy108Stations_LegacyStations();

		/**
		 * The meta object literal for the '<em><b>Find Station</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEGACY108_STATIONS___FIND_STATION__INT = eINSTANCE.getLegacy108Stations__FindStation__int();

		/**
		 * The meta object literal for the '<em><b>Find By Border Point</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEGACY108_STATIONS___FIND_BY_BORDER_POINT__INT = eINSTANCE.getLegacy108Stations__FindByBorderPoint__int();

		/**
		 * The meta object literal for the '{@link Gtm.impl.Legacy108StationImpl <em>Legacy108 Station</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.Legacy108StationImpl
		 * @see Gtm.impl.GtmPackageImpl#getLegacy108Station()
		 * @generated
		 */
		EClass LEGACY108_STATION = eINSTANCE.getLegacy108Station();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY108_STATION__NAME = eINSTANCE.getLegacy108Station_Name();

		/**
		 * The meta object literal for the '<em><b>Border Point Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY108_STATION__BORDER_POINT_CODE = eINSTANCE.getLegacy108Station_BorderPointCode();

		/**
		 * The meta object literal for the '<em><b>Name UTF8</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY108_STATION__NAME_UTF8 = eINSTANCE.getLegacy108Station_NameUTF8();

		/**
		 * The meta object literal for the '<em><b>Station Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY108_STATION__STATION_CODE = eINSTANCE.getLegacy108Station_StationCode();

		/**
		 * The meta object literal for the '<em><b>Fare Reference Station Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY108_STATION__FARE_REFERENCE_STATION_CODE = eINSTANCE.getLegacy108Station_FareReferenceStationCode();

		/**
		 * The meta object literal for the '<em><b>Short Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY108_STATION__SHORT_NAME = eINSTANCE.getLegacy108Station_ShortName();

		/**
		 * The meta object literal for the '<em><b>Short Name Utf8</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY108_STATION__SHORT_NAME_UTF8 = eINSTANCE.getLegacy108Station_ShortNameUtf8();

		/**
		 * The meta object literal for the '<em><b>Longitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY108_STATION__LONGITUDE = eINSTANCE.getLegacy108Station_Longitude();

		/**
		 * The meta object literal for the '<em><b>Latitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY108_STATION__LATITUDE = eINSTANCE.getLegacy108Station_Latitude();

		/**
		 * The meta object literal for the '{@link Gtm.impl.LegacyRouteFaresImpl <em>Legacy Route Fares</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.LegacyRouteFaresImpl
		 * @see Gtm.impl.GtmPackageImpl#getLegacyRouteFares()
		 * @generated
		 */
		EClass LEGACY_ROUTE_FARES = eINSTANCE.getLegacyRouteFares();

		/**
		 * The meta object literal for the '<em><b>Route Fare</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGACY_ROUTE_FARES__ROUTE_FARE = eINSTANCE.getLegacyRouteFares_RouteFare();

		/**
		 * The meta object literal for the '{@link Gtm.impl.LegacyRouteFareImpl <em>Legacy Route Fare</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.LegacyRouteFareImpl
		 * @see Gtm.impl.GtmPackageImpl#getLegacyRouteFare()
		 * @generated
		 */
		EClass LEGACY_ROUTE_FARE = eINSTANCE.getLegacyRouteFare();

		/**
		 * The meta object literal for the '<em><b>Fare Table Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_ROUTE_FARE__FARE_TABLE_NUMBER = eINSTANCE.getLegacyRouteFare_FareTableNumber();

		/**
		 * The meta object literal for the '<em><b>Series Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_ROUTE_FARE__SERIES_NUMBER = eINSTANCE.getLegacyRouteFare_SeriesNumber();

		/**
		 * The meta object literal for the '<em><b>Fare2nd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_ROUTE_FARE__FARE2ND = eINSTANCE.getLegacyRouteFare_Fare2nd();

		/**
		 * The meta object literal for the '<em><b>Fare1st</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_ROUTE_FARE__FARE1ST = eINSTANCE.getLegacyRouteFare_Fare1st();

		/**
		 * The meta object literal for the '<em><b>Return Fare1st</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_ROUTE_FARE__RETURN_FARE1ST = eINSTANCE.getLegacyRouteFare_ReturnFare1st();

		/**
		 * The meta object literal for the '<em><b>Return Fare2nd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_ROUTE_FARE__RETURN_FARE2ND = eINSTANCE.getLegacyRouteFare_ReturnFare2nd();

		/**
		 * The meta object literal for the '<em><b>Valid From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_ROUTE_FARE__VALID_FROM = eINSTANCE.getLegacyRouteFare_ValidFrom();

		/**
		 * The meta object literal for the '<em><b>Valid Until</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_ROUTE_FARE__VALID_UNTIL = eINSTANCE.getLegacyRouteFare_ValidUntil();

		/**
		 * The meta object literal for the '<em><b>Series</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGACY_ROUTE_FARE__SERIES = eINSTANCE.getLegacyRouteFare_Series();

		/**
		 * The meta object literal for the '{@link Gtm.impl.LegacySeriesListImpl <em>Legacy Series List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.LegacySeriesListImpl
		 * @see Gtm.impl.GtmPackageImpl#getLegacySeriesList()
		 * @generated
		 */
		EClass LEGACY_SERIES_LIST = eINSTANCE.getLegacySeriesList();

		/**
		 * The meta object literal for the '<em><b>Series</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGACY_SERIES_LIST__SERIES = eINSTANCE.getLegacySeriesList_Series();

		/**
		 * The meta object literal for the '{@link Gtm.impl.LegacySeriesImpl <em>Legacy Series</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.LegacySeriesImpl
		 * @see Gtm.impl.GtmPackageImpl#getLegacySeries()
		 * @generated
		 */
		EClass LEGACY_SERIES = eINSTANCE.getLegacySeries();

		/**
		 * The meta object literal for the '<em><b>Supplying Carrier Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_SERIES__SUPPLYING_CARRIER_CODE = eINSTANCE.getLegacySeries_SupplyingCarrierCode();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_SERIES__NUMBER = eINSTANCE.getLegacySeries_Number();

		/**
		 * The meta object literal for the '<em><b>Fare Table Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_SERIES__FARE_TABLE_NUMBER = eINSTANCE.getLegacySeries_FareTableNumber();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_SERIES__TYPE = eINSTANCE.getLegacySeries_Type();

		/**
		 * The meta object literal for the '<em><b>From Station</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_SERIES__FROM_STATION = eINSTANCE.getLegacySeries_FromStation();

		/**
		 * The meta object literal for the '<em><b>From Station Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_SERIES__FROM_STATION_NAME = eINSTANCE.getLegacySeries_FromStationName();

		/**
		 * The meta object literal for the '<em><b>To Station</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_SERIES__TO_STATION = eINSTANCE.getLegacySeries_ToStation();

		/**
		 * The meta object literal for the '<em><b>To Station Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_SERIES__TO_STATION_NAME = eINSTANCE.getLegacySeries_ToStationName();

		/**
		 * The meta object literal for the '<em><b>Route Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_SERIES__ROUTE_NUMBER = eINSTANCE.getLegacySeries_RouteNumber();

		/**
		 * The meta object literal for the '<em><b>Carrier Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_SERIES__CARRIER_CODE = eINSTANCE.getLegacySeries_CarrierCode();

		/**
		 * The meta object literal for the '<em><b>Route Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_SERIES__ROUTE_DESCRIPTION = eINSTANCE.getLegacySeries_RouteDescription();

		/**
		 * The meta object literal for the '<em><b>Pricetype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_SERIES__PRICETYPE = eINSTANCE.getLegacySeries_Pricetype();

		/**
		 * The meta object literal for the '<em><b>Distance1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_SERIES__DISTANCE1 = eINSTANCE.getLegacySeries_Distance1();

		/**
		 * The meta object literal for the '<em><b>Distance2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_SERIES__DISTANCE2 = eINSTANCE.getLegacySeries_Distance2();

		/**
		 * The meta object literal for the '<em><b>Viastations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGACY_SERIES__VIASTATIONS = eINSTANCE.getLegacySeries_Viastations();

		/**
		 * The meta object literal for the '<em><b>Valid From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_SERIES__VALID_FROM = eINSTANCE.getLegacySeries_ValidFrom();

		/**
		 * The meta object literal for the '<em><b>Valid Until</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_SERIES__VALID_UNTIL = eINSTANCE.getLegacySeries_ValidUntil();

		/**
		 * The meta object literal for the '<em><b>Bus Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_SERIES__BUS_CODE = eINSTANCE.getLegacySeries_BusCode();

		/**
		 * The meta object literal for the '<em><b>Ferry Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_SERIES__FERRY_CODE = eINSTANCE.getLegacySeries_FerryCode();

		/**
		 * The meta object literal for the '<em><b>Memo Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_SERIES__MEMO_NUMBER = eINSTANCE.getLegacySeries_MemoNumber();

		/**
		 * The meta object literal for the '{@link Gtm.impl.LegacyCarriersImpl <em>Legacy Carriers</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.LegacyCarriersImpl
		 * @see Gtm.impl.GtmPackageImpl#getLegacyCarriers()
		 * @generated
		 */
		EClass LEGACY_CARRIERS = eINSTANCE.getLegacyCarriers();

		/**
		 * The meta object literal for the '<em><b>Legacy Carrier</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGACY_CARRIERS__LEGACY_CARRIER = eINSTANCE.getLegacyCarriers_LegacyCarrier();

		/**
		 * The meta object literal for the '{@link Gtm.impl.LegacyCarrierImpl <em>Legacy Carrier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.LegacyCarrierImpl
		 * @see Gtm.impl.GtmPackageImpl#getLegacyCarrier()
		 * @generated
		 */
		EClass LEGACY_CARRIER = eINSTANCE.getLegacyCarrier();

		/**
		 * The meta object literal for the '<em><b>Carrier Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_CARRIER__CARRIER_CODE = eINSTANCE.getLegacyCarrier_CarrierCode();

		/**
		 * The meta object literal for the '<em><b>Carrier Short Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_CARRIER__CARRIER_SHORT_NAME = eINSTANCE.getLegacyCarrier_CarrierShortName();

		/**
		 * The meta object literal for the '<em><b>Carrier Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_CARRIER__CARRIER_NAME = eINSTANCE.getLegacyCarrier_CarrierName();

		/**
		 * The meta object literal for the '{@link Gtm.impl.LegacySeparateContractSeriesListImpl <em>Legacy Separate Contract Series List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.LegacySeparateContractSeriesListImpl
		 * @see Gtm.impl.GtmPackageImpl#getLegacySeparateContractSeriesList()
		 * @generated
		 */
		EClass LEGACY_SEPARATE_CONTRACT_SERIES_LIST = eINSTANCE.getLegacySeparateContractSeriesList();

		/**
		 * The meta object literal for the '<em><b>Separate Contract Series</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGACY_SEPARATE_CONTRACT_SERIES_LIST__SEPARATE_CONTRACT_SERIES = eINSTANCE.getLegacySeparateContractSeriesList_SeparateContractSeries();

		/**
		 * The meta object literal for the '{@link Gtm.impl.LegacySeparateContractSeriesImpl <em>Legacy Separate Contract Series</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.LegacySeparateContractSeriesImpl
		 * @see Gtm.impl.GtmPackageImpl#getLegacySeparateContractSeries()
		 * @generated
		 */
		EClass LEGACY_SEPARATE_CONTRACT_SERIES = eINSTANCE.getLegacySeparateContractSeries();

		/**
		 * The meta object literal for the '<em><b>Series Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_SEPARATE_CONTRACT_SERIES__SERIES_NUMBER = eINSTANCE.getLegacySeparateContractSeries_SeriesNumber();

		/**
		 * The meta object literal for the '<em><b>Valid From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_SEPARATE_CONTRACT_SERIES__VALID_FROM = eINSTANCE.getLegacySeparateContractSeries_ValidFrom();

		/**
		 * The meta object literal for the '<em><b>Valid Until</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_SEPARATE_CONTRACT_SERIES__VALID_UNTIL = eINSTANCE.getLegacySeparateContractSeries_ValidUntil();

		/**
		 * The meta object literal for the '<em><b>Series</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGACY_SEPARATE_CONTRACT_SERIES__SERIES = eINSTANCE.getLegacySeparateContractSeries_Series();

		/**
		 * The meta object literal for the '{@link Gtm.impl.LegacyDistanceFaresImpl <em>Legacy Distance Fares</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.LegacyDistanceFaresImpl
		 * @see Gtm.impl.GtmPackageImpl#getLegacyDistanceFares()
		 * @generated
		 */
		EClass LEGACY_DISTANCE_FARES = eINSTANCE.getLegacyDistanceFares();

		/**
		 * The meta object literal for the '<em><b>Distance Fare</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGACY_DISTANCE_FARES__DISTANCE_FARE = eINSTANCE.getLegacyDistanceFares_DistanceFare();

		/**
		 * The meta object literal for the '{@link Gtm.impl.LegacyDistanceFareImpl <em>Legacy Distance Fare</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.LegacyDistanceFareImpl
		 * @see Gtm.impl.GtmPackageImpl#getLegacyDistanceFare()
		 * @generated
		 */
		EClass LEGACY_DISTANCE_FARE = eINSTANCE.getLegacyDistanceFare();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_DISTANCE_FARE__DISTANCE = eINSTANCE.getLegacyDistanceFare_Distance();

		/**
		 * The meta object literal for the '<em><b>Fare2nd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_DISTANCE_FARE__FARE2ND = eINSTANCE.getLegacyDistanceFare_Fare2nd();

		/**
		 * The meta object literal for the '<em><b>Fare1st</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_DISTANCE_FARE__FARE1ST = eINSTANCE.getLegacyDistanceFare_Fare1st();

		/**
		 * The meta object literal for the '<em><b>Fare Table Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_DISTANCE_FARE__FARE_TABLE_NUMBER = eINSTANCE.getLegacyDistanceFare_FareTableNumber();

		/**
		 * The meta object literal for the '<em><b>Return Fare1st</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_DISTANCE_FARE__RETURN_FARE1ST = eINSTANCE.getLegacyDistanceFare_ReturnFare1st();

		/**
		 * The meta object literal for the '<em><b>Return Fare2nd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_DISTANCE_FARE__RETURN_FARE2ND = eINSTANCE.getLegacyDistanceFare_ReturnFare2nd();

		/**
		 * The meta object literal for the '<em><b>Valid From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_DISTANCE_FARE__VALID_FROM = eINSTANCE.getLegacyDistanceFare_ValidFrom();

		/**
		 * The meta object literal for the '<em><b>Valid Until</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_DISTANCE_FARE__VALID_UNTIL = eINSTANCE.getLegacyDistanceFare_ValidUntil();

		/**
		 * The meta object literal for the '{@link Gtm.impl.LegacyViastationImpl <em>Legacy Viastation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.LegacyViastationImpl
		 * @see Gtm.impl.GtmPackageImpl#getLegacyViastation()
		 * @generated
		 */
		EClass LEGACY_VIASTATION = eINSTANCE.getLegacyViastation();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_VIASTATION__POSITION = eINSTANCE.getLegacyViastation_Position();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_VIASTATION__CODE = eINSTANCE.getLegacyViastation_Code();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_VIASTATION__OPTIONAL = eINSTANCE.getLegacyViastation_Optional();

		/**
		 * The meta object literal for the '{@link Gtm.BoardingOrArrival <em>Boarding Or Arrival</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.BoardingOrArrival
		 * @see Gtm.impl.GtmPackageImpl#getBoardingOrArrival()
		 * @generated
		 */
		EEnum BOARDING_OR_ARRIVAL = eINSTANCE.getBoardingOrArrival();

		/**
		 * The meta object literal for the '{@link Gtm.ConditionType <em>Condition Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.ConditionType
		 * @see Gtm.impl.GtmPackageImpl#getConditionType()
		 * @generated
		 */
		EEnum CONDITION_TYPE = eINSTANCE.getConditionType();

		/**
		 * The meta object literal for the '{@link Gtm.LuggageRule <em>Luggage Rule</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.LuggageRule
		 * @see Gtm.impl.GtmPackageImpl#getLuggageRule()
		 * @generated
		 */
		EEnum LUGGAGE_RULE = eINSTANCE.getLuggageRule();

		/**
		 * The meta object literal for the '{@link Gtm.Dimension <em>Dimension</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.Dimension
		 * @see Gtm.impl.GtmPackageImpl#getDimension()
		 * @generated
		 */
		EEnum DIMENSION = eINSTANCE.getDimension();

		/**
		 * The meta object literal for the '{@link Gtm.AddCarrierScope <em>Add Carrier Scope</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.AddCarrierScope
		 * @see Gtm.impl.GtmPackageImpl#getAddCarrierScope()
		 * @generated
		 */
		EEnum ADD_CARRIER_SCOPE = eINSTANCE.getAddCarrierScope();

		/**
		 * The meta object literal for the '{@link Gtm.TransportMode <em>Transport Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.TransportMode
		 * @see Gtm.impl.GtmPackageImpl#getTransportMode()
		 * @generated
		 */
		EEnum TRANSPORT_MODE = eINSTANCE.getTransportMode();

		/**
		 * The meta object literal for the '{@link Gtm.impl.LegacyFareTemplatesImpl <em>Legacy Fare Templates</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.impl.LegacyFareTemplatesImpl
		 * @see Gtm.impl.GtmPackageImpl#getLegacyFareTemplates()
		 * @generated
		 */
		EClass LEGACY_FARE_TEMPLATES = eINSTANCE.getLegacyFareTemplates();

		/**
		 * The meta object literal for the '<em><b>Fare Templates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGACY_FARE_TEMPLATES__FARE_TEMPLATES = eINSTANCE.getLegacyFareTemplates_FareTemplates();

		/**
		 * The meta object literal for the '{@link Gtm.StationRelationType <em>Station Relation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.StationRelationType
		 * @see Gtm.impl.GtmPackageImpl#getStationRelationType()
		 * @generated
		 */
		EEnum STATION_RELATION_TYPE = eINSTANCE.getStationRelationType();

		/**
		 * The meta object literal for the '{@link Gtm.StationFareDetailType <em>Station Fare Detail Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.StationFareDetailType
		 * @see Gtm.impl.GtmPackageImpl#getStationFareDetailType()
		 * @generated
		 */
		EEnum STATION_FARE_DETAIL_TYPE = eINSTANCE.getStationFareDetailType();

		/**
		 * The meta object literal for the '{@link Gtm.RegulatoryCondition <em>Regulatory Condition</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.RegulatoryCondition
		 * @see Gtm.impl.GtmPackageImpl#getRegulatoryCondition()
		 * @generated
		 */
		EEnum REGULATORY_CONDITION = eINSTANCE.getRegulatoryCondition();

		/**
		 * The meta object literal for the '{@link Gtm.AfterSalesTransactionType <em>After Sales Transaction Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.AfterSalesTransactionType
		 * @see Gtm.impl.GtmPackageImpl#getAfterSalesTransactionType()
		 * @generated
		 */
		EEnum AFTER_SALES_TRANSACTION_TYPE = eINSTANCE.getAfterSalesTransactionType();

		/**
		 * The meta object literal for the '{@link Gtm.BarcodeTypes <em>Barcode Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.BarcodeTypes
		 * @see Gtm.impl.GtmPackageImpl#getBarcodeTypes()
		 * @generated
		 */
		EEnum BARCODE_TYPES = eINSTANCE.getBarcodeTypes();

		/**
		 * The meta object literal for the '{@link Gtm.ClassicClassType <em>Classic Class Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.ClassicClassType
		 * @see Gtm.impl.GtmPackageImpl#getClassicClassType()
		 * @generated
		 */
		EEnum CLASSIC_CLASS_TYPE = eINSTANCE.getClassicClassType();

		/**
		 * The meta object literal for the '{@link Gtm.CharacterSet <em>Character Set</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.CharacterSet
		 * @see Gtm.impl.GtmPackageImpl#getCharacterSet()
		 * @generated
		 */
		EEnum CHARACTER_SET = eINSTANCE.getCharacterSet();

		/**
		 * The meta object literal for the '{@link Gtm.Clusters <em>Clusters</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.Clusters
		 * @see Gtm.impl.GtmPackageImpl#getClusters()
		 * @generated
		 */
		EEnum CLUSTERS = eINSTANCE.getClusters();

		/**
		 * The meta object literal for the '{@link Gtm.CombinationModel <em>Combination Model</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.CombinationModel
		 * @see Gtm.impl.GtmPackageImpl#getCombinationModel()
		 * @generated
		 */
		EEnum COMBINATION_MODEL = eINSTANCE.getCombinationModel();

		/**
		 * The meta object literal for the '{@link Gtm.ControlDataExchangeTypes <em>Control Data Exchange Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.ControlDataExchangeTypes
		 * @see Gtm.impl.GtmPackageImpl#getControlDataExchangeTypes()
		 * @generated
		 */
		EEnum CONTROL_DATA_EXCHANGE_TYPES = eINSTANCE.getControlDataExchangeTypes();

		/**
		 * The meta object literal for the '{@link Gtm.FareType <em>Fare Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.FareType
		 * @see Gtm.impl.GtmPackageImpl#getFareType()
		 * @generated
		 */
		EEnum FARE_TYPE = eINSTANCE.getFareType();

		/**
		 * The meta object literal for the '{@link Gtm.FulfillmentType <em>Fulfillment Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.FulfillmentType
		 * @see Gtm.impl.GtmPackageImpl#getFulfillmentType()
		 * @generated
		 */
		EEnum FULFILLMENT_TYPE = eINSTANCE.getFulfillmentType();

		/**
		 * The meta object literal for the '{@link Gtm.GeoSystem <em>Geo System</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.GeoSystem
		 * @see Gtm.impl.GtmPackageImpl#getGeoSystem()
		 * @generated
		 */
		EEnum GEO_SYSTEM = eINSTANCE.getGeoSystem();

		/**
		 * The meta object literal for the '{@link Gtm.GeoUnit <em>Geo Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.GeoUnit
		 * @see Gtm.impl.GtmPackageImpl#getGeoUnit()
		 * @generated
		 */
		EEnum GEO_UNIT = eINSTANCE.getGeoUnit();

		/**
		 * The meta object literal for the '{@link Gtm.GraphicalReservationType <em>Graphical Reservation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.GraphicalReservationType
		 * @see Gtm.impl.GtmPackageImpl#getGraphicalReservationType()
		 * @generated
		 */
		EEnum GRAPHICAL_RESERVATION_TYPE = eINSTANCE.getGraphicalReservationType();

		/**
		 * The meta object literal for the '{@link Gtm.HemisphereEW <em>Hemisphere EW</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.HemisphereEW
		 * @see Gtm.impl.GtmPackageImpl#getHemisphereEW()
		 * @generated
		 */
		EEnum HEMISPHERE_EW = eINSTANCE.getHemisphereEW();

		/**
		 * The meta object literal for the '{@link Gtm.HemisphereNS <em>Hemisphere NS</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.HemisphereNS
		 * @see Gtm.impl.GtmPackageImpl#getHemisphereNS()
		 * @generated
		 */
		EEnum HEMISPHERE_NS = eINSTANCE.getHemisphereNS();

		/**
		 * The meta object literal for the '{@link Gtm.InterfaceType <em>Interface Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.InterfaceType
		 * @see Gtm.impl.GtmPackageImpl#getInterfaceType()
		 * @generated
		 */
		EEnum INTERFACE_TYPE = eINSTANCE.getInterfaceType();

		/**
		 * The meta object literal for the '{@link Gtm.LegacyCalculationType <em>Legacy Calculation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.LegacyCalculationType
		 * @see Gtm.impl.GtmPackageImpl#getLegacyCalculationType()
		 * @generated
		 */
		EEnum LEGACY_CALCULATION_TYPE = eINSTANCE.getLegacyCalculationType();

		/**
		 * The meta object literal for the '{@link Gtm.LegacyPassengerType <em>Legacy Passenger Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.LegacyPassengerType
		 * @see Gtm.impl.GtmPackageImpl#getLegacyPassengerType()
		 * @generated
		 */
		EEnum LEGACY_PASSENGER_TYPE = eINSTANCE.getLegacyPassengerType();

		/**
		 * The meta object literal for the '{@link Gtm.LegacySeriesType <em>Legacy Series Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.LegacySeriesType
		 * @see Gtm.impl.GtmPackageImpl#getLegacySeriesType()
		 * @generated
		 */
		EEnum LEGACY_SERIES_TYPE = eINSTANCE.getLegacySeriesType();

		/**
		 * The meta object literal for the '{@link Gtm.LegacyConversionType <em>Legacy Conversion Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.LegacyConversionType
		 * @see Gtm.impl.GtmPackageImpl#getLegacyConversionType()
		 * @generated
		 */
		EEnum LEGACY_CONVERSION_TYPE = eINSTANCE.getLegacyConversionType();

		/**
		 * The meta object literal for the '{@link Gtm.OfferRequestType <em>Offer Request Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.OfferRequestType
		 * @see Gtm.impl.GtmPackageImpl#getOfferRequestType()
		 * @generated
		 */
		EEnum OFFER_REQUEST_TYPE = eINSTANCE.getOfferRequestType();

		/**
		 * The meta object literal for the '{@link Gtm.OnlineServiceType <em>Online Service Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.OnlineServiceType
		 * @see Gtm.impl.GtmPackageImpl#getOnlineServiceType()
		 * @generated
		 */
		EEnum ONLINE_SERVICE_TYPE = eINSTANCE.getOnlineServiceType();

		/**
		 * The meta object literal for the '{@link Gtm.PersonalDataItemsType <em>Personal Data Items Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.PersonalDataItemsType
		 * @see Gtm.impl.GtmPackageImpl#getPersonalDataItemsType()
		 * @generated
		 */
		EEnum PERSONAL_DATA_ITEMS_TYPE = eINSTANCE.getPersonalDataItemsType();

		/**
		 * The meta object literal for the '{@link Gtm.PersonalDataTransferType <em>Personal Data Transfer Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.PersonalDataTransferType
		 * @see Gtm.impl.GtmPackageImpl#getPersonalDataTransferType()
		 * @generated
		 */
		EEnum PERSONAL_DATA_TRANSFER_TYPE = eINSTANCE.getPersonalDataTransferType();

		/**
		 * The meta object literal for the '{@link Gtm.PersonalDataChangeReason <em>Personal Data Change Reason</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.PersonalDataChangeReason
		 * @see Gtm.impl.GtmPackageImpl#getPersonalDataChangeReason()
		 * @generated
		 */
		EEnum PERSONAL_DATA_CHANGE_REASON = eINSTANCE.getPersonalDataChangeReason();

		/**
		 * The meta object literal for the '{@link Gtm.ProductType <em>Product Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.ProductType
		 * @see Gtm.impl.GtmPackageImpl#getProductType()
		 * @generated
		 */
		EEnum PRODUCT_TYPE = eINSTANCE.getProductType();

		/**
		 * The meta object literal for the '{@link Gtm.ReservationTravelClass <em>Reservation Travel Class</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.ReservationTravelClass
		 * @see Gtm.impl.GtmPackageImpl#getReservationTravelClass()
		 * @generated
		 */
		EEnum RESERVATION_TRAVEL_CLASS = eINSTANCE.getReservationTravelClass();

		/**
		 * The meta object literal for the '{@link Gtm.ReservationServiceLevel <em>Reservation Service Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.ReservationServiceLevel
		 * @see Gtm.impl.GtmPackageImpl#getReservationServiceLevel()
		 * @generated
		 */
		EEnum RESERVATION_SERVICE_LEVEL = eINSTANCE.getReservationServiceLevel();

		/**
		 * The meta object literal for the '{@link Gtm.ReservationService <em>Reservation Service</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.ReservationService
		 * @see Gtm.impl.GtmPackageImpl#getReservationService()
		 * @generated
		 */
		EEnum RESERVATION_SERVICE = eINSTANCE.getReservationService();

		/**
		 * The meta object literal for the '{@link Gtm.ReservationBerthType <em>Reservation Berth Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.ReservationBerthType
		 * @see Gtm.impl.GtmPackageImpl#getReservationBerthType()
		 * @generated
		 */
		EEnum RESERVATION_BERTH_TYPE = eINSTANCE.getReservationBerthType();

		/**
		 * The meta object literal for the '{@link Gtm.SchemaVersion <em>Schema Version</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.SchemaVersion
		 * @see Gtm.impl.GtmPackageImpl#getSchemaVersion()
		 * @generated
		 */
		EEnum SCHEMA_VERSION = eINSTANCE.getSchemaVersion();

		/**
		 * The meta object literal for the '{@link Gtm.TimeZone <em>Time Zone</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.TimeZone
		 * @see Gtm.impl.GtmPackageImpl#getTimeZone()
		 * @generated
		 */
		EEnum TIME_ZONE = eINSTANCE.getTimeZone();

		/**
		 * The meta object literal for the '{@link Gtm.TaxScope <em>Tax Scope</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.TaxScope
		 * @see Gtm.impl.GtmPackageImpl#getTaxScope()
		 * @generated
		 */
		EEnum TAX_SCOPE = eINSTANCE.getTaxScope();

		/**
		 * The meta object literal for the '{@link Gtm.TimeReferenceType <em>Time Reference Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.TimeReferenceType
		 * @see Gtm.impl.GtmPackageImpl#getTimeReferenceType()
		 * @generated
		 */
		EEnum TIME_REFERENCE_TYPE = eINSTANCE.getTimeReferenceType();

		/**
		 * The meta object literal for the '{@link Gtm.TimeRangeScope <em>Time Range Scope</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.TimeRangeScope
		 * @see Gtm.impl.GtmPackageImpl#getTimeRangeScope()
		 * @generated
		 */
		EEnum TIME_RANGE_SCOPE = eINSTANCE.getTimeRangeScope();

		/**
		 * The meta object literal for the '{@link Gtm.TimeUnit <em>Time Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.TimeUnit
		 * @see Gtm.impl.GtmPackageImpl#getTimeUnit()
		 * @generated
		 */
		EEnum TIME_UNIT = eINSTANCE.getTimeUnit();

		/**
		 * The meta object literal for the '{@link Gtm.TravelerType <em>Traveler Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.TravelerType
		 * @see Gtm.impl.GtmPackageImpl#getTravelerType()
		 * @generated
		 */
		EEnum TRAVELER_TYPE = eINSTANCE.getTravelerType();

		/**
		 * The meta object literal for the '{@link Gtm.TripAllocationProcess <em>Trip Allocation Process</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.TripAllocationProcess
		 * @see Gtm.impl.GtmPackageImpl#getTripAllocationProcess()
		 * @generated
		 */
		EEnum TRIP_ALLOCATION_PROCESS = eINSTANCE.getTripAllocationProcess();

		/**
		 * The meta object literal for the '{@link Gtm.TripAllocationUnit <em>Trip Allocation Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.TripAllocationUnit
		 * @see Gtm.impl.GtmPackageImpl#getTripAllocationUnit()
		 * @generated
		 */
		EEnum TRIP_ALLOCATION_UNIT = eINSTANCE.getTripAllocationUnit();

		/**
		 * The meta object literal for the '{@link Gtm.TripInterruptionProcess <em>Trip Interruption Process</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.TripInterruptionProcess
		 * @see Gtm.impl.GtmPackageImpl#getTripInterruptionProcess()
		 * @generated
		 */
		EEnum TRIP_INTERRUPTION_PROCESS = eINSTANCE.getTripInterruptionProcess();

		/**
		 * The meta object literal for the '{@link Gtm.TravelValidityType <em>Travel Validity Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.TravelValidityType
		 * @see Gtm.impl.GtmPackageImpl#getTravelValidityType()
		 * @generated
		 */
		EEnum TRAVEL_VALIDITY_TYPE = eINSTANCE.getTravelValidityType();

		/**
		 * The meta object literal for the '{@link Gtm.WeekDay <em>Week Day</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.WeekDay
		 * @see Gtm.impl.GtmPackageImpl#getWeekDay()
		 * @generated
		 */
		EEnum WEEK_DAY = eINSTANCE.getWeekDay();

		/**
		 * The meta object literal for the '{@link Gtm.BasePriceClassType <em>Base Price Class Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.BasePriceClassType
		 * @see Gtm.impl.GtmPackageImpl#getBasePriceClassType()
		 * @generated
		 */
		EEnum BASE_PRICE_CLASS_TYPE = eINSTANCE.getBasePriceClassType();

		/**
		 * The meta object literal for the '<em>Date As Date</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Date
		 * @see Gtm.impl.GtmPackageImpl#getDateAsDate()
		 * @generated
		 */
		EDataType DATE_AS_DATE = eINSTANCE.getDateAsDate();

		/**
		 * The meta object literal for the '<em>Date As Date Time</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Date
		 * @see Gtm.impl.GtmPackageImpl#getDateAsDateTime()
		 * @generated
		 */
		EDataType DATE_AS_DATE_TIME = eINSTANCE.getDateAsDateTime();

		/**
		 * The meta object literal for the '{@link Gtm.DataSource <em>Data Source</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.DataSource
		 * @see Gtm.impl.GtmPackageImpl#getDataSource()
		 * @generated
		 */
		EEnum DATA_SOURCE = eINSTANCE.getDataSource();

		/**
		 * The meta object literal for the '{@link Gtm.DataType <em>Data Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.DataType
		 * @see Gtm.impl.GtmPackageImpl#getDataType()
		 * @generated
		 */
		EEnum DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '{@link Gtm.ClassId <em>Class Id</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.ClassId
		 * @see Gtm.impl.GtmPackageImpl#getClassId()
		 * @generated
		 */
		EEnum CLASS_ID = eINSTANCE.getClassId();

		/**
		 * The meta object literal for the '{@link Gtm.GenericReductionCards <em>Generic Reduction Cards</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.GenericReductionCards
		 * @see Gtm.impl.GtmPackageImpl#getGenericReductionCards()
		 * @generated
		 */
		EEnum GENERIC_REDUCTION_CARDS = eINSTANCE.getGenericReductionCards();

		/**
		 * The meta object literal for the '{@link Gtm.ServiceMode <em>Service Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.ServiceMode
		 * @see Gtm.impl.GtmPackageImpl#getServiceMode()
		 * @generated
		 */
		EEnum SERVICE_MODE = eINSTANCE.getServiceMode();

		/**
		 * The meta object literal for the '{@link Gtm.RoundingType <em>Rounding Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gtm.RoundingType
		 * @see Gtm.impl.GtmPackageImpl#getRoundingType()
		 * @generated
		 */
		EEnum ROUNDING_TYPE = eINSTANCE.getRoundingType();

	}

} //GtmPackage

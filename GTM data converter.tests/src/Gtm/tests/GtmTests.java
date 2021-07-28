/**
 */
package Gtm.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Gtm</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class GtmTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new GtmTests("Gtm Tests");
		suite.addTestSuite(ServiceBrandsTest.class);
		suite.addTestSuite(CountriesTest.class);
		suite.addTestSuite(CurrenciesTest.class);
		suite.addTestSuite(StationsTest.class);
		suite.addTestSuite(CarriersTest.class);
		suite.addTestSuite(ConnectionPointsTest.class);
		suite.addTestSuite(FareStationSetDefinitionsTest.class);
		suite.addTestSuite(ViaStationTest.class);
		suite.addTestSuite(LegacyStationToServiceConstraintMappingsTest.class);
		suite.addTestSuite(LegacyStationMappingsTest.class);
		suite.addTestSuite(LegacyBoderPointMappingsTest.class);
		suite.addTestSuite(Legacy108StationsTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GtmTests(String name) {
		super(name);
	}

} //GtmTests

/**
 */
package Gtm.tests;

import Gtm.FareResourceLocations;
import Gtm.GtmFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Fare Resource Locations</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FareResourceLocationsTest extends TestCase {

	/**
	 * The fixture for this Fare Resource Locations test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FareResourceLocations fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FareResourceLocationsTest.class);
	}

	/**
	 * Constructs a new Fare Resource Locations test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FareResourceLocationsTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Fare Resource Locations test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(FareResourceLocations fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Fare Resource Locations test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FareResourceLocations getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GtmFactory.eINSTANCE.createFareResourceLocations());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //FareResourceLocationsTest

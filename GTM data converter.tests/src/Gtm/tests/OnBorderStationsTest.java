/**
 */
package Gtm.tests;

import Gtm.GtmFactory;
import Gtm.OnBorderStations;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>On Border Stations</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OnBorderStationsTest extends TestCase {

	/**
	 * The fixture for this On Border Stations test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OnBorderStations fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OnBorderStationsTest.class);
	}

	/**
	 * Constructs a new On Border Stations test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnBorderStationsTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this On Border Stations test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(OnBorderStations fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this On Border Stations test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OnBorderStations getFixture() {
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
		setFixture(GtmFactory.eINSTANCE.createOnBorderStations());
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

} //OnBorderStationsTest

/**
 */
package Gtm.tests;

import Gtm.GtmFactory;
import Gtm.LegacyStationMap;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Legacy Station Map</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LegacyStationMapTest extends TestCase {

	/**
	 * The fixture for this Legacy Station Map test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LegacyStationMap fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LegacyStationMapTest.class);
	}

	/**
	 * Constructs a new Legacy Station Map test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegacyStationMapTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Legacy Station Map test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(LegacyStationMap fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Legacy Station Map test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LegacyStationMap getFixture() {
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
		setFixture(GtmFactory.eINSTANCE.createLegacyStationMap());
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

} //LegacyStationMapTest

/**
 */
package Gtm.tests;

import Gtm.GtmFactory;
import Gtm.LegacyRouteFares;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Legacy Route Fares</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LegacyRouteFaresTest extends TestCase {

	/**
	 * The fixture for this Legacy Route Fares test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LegacyRouteFares fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LegacyRouteFaresTest.class);
	}

	/**
	 * Constructs a new Legacy Route Fares test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegacyRouteFaresTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Legacy Route Fares test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(LegacyRouteFares fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Legacy Route Fares test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LegacyRouteFares getFixture() {
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
		setFixture(GtmFactory.eINSTANCE.createLegacyRouteFares());
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

} //LegacyRouteFaresTest

/**
 */
package Gtm.tests;

import Gtm.GtmFactory;
import Gtm.LegacyRouteFare;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Legacy Route Fare</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LegacyRouteFareTest extends TestCase {

	/**
	 * The fixture for this Legacy Route Fare test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LegacyRouteFare fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LegacyRouteFareTest.class);
	}

	/**
	 * Constructs a new Legacy Route Fare test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegacyRouteFareTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Legacy Route Fare test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(LegacyRouteFare fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Legacy Route Fare test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LegacyRouteFare getFixture() {
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
		setFixture(GtmFactory.eINSTANCE.createLegacyRouteFare());
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

} //LegacyRouteFareTest

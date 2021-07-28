/**
 */
package Gtm.tests;

import Gtm.GtmFactory;
import Gtm.LegacyCarriers;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Legacy Carriers</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LegacyCarriersTest extends TestCase {

	/**
	 * The fixture for this Legacy Carriers test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LegacyCarriers fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LegacyCarriersTest.class);
	}

	/**
	 * Constructs a new Legacy Carriers test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegacyCarriersTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Legacy Carriers test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(LegacyCarriers fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Legacy Carriers test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LegacyCarriers getFixture() {
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
		setFixture(GtmFactory.eINSTANCE.createLegacyCarriers());
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

} //LegacyCarriersTest

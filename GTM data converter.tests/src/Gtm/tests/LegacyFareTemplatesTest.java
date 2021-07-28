/**
 */
package Gtm.tests;

import Gtm.GtmFactory;
import Gtm.LegacyFareTemplates;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Legacy Fare Templates</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LegacyFareTemplatesTest extends TestCase {

	/**
	 * The fixture for this Legacy Fare Templates test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LegacyFareTemplates fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LegacyFareTemplatesTest.class);
	}

	/**
	 * Constructs a new Legacy Fare Templates test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegacyFareTemplatesTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Legacy Fare Templates test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(LegacyFareTemplates fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Legacy Fare Templates test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LegacyFareTemplates getFixture() {
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
		setFixture(GtmFactory.eINSTANCE.createLegacyFareTemplates());
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

} //LegacyFareTemplatesTest

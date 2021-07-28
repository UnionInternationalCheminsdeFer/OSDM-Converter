/**
 */
package Gtm.tests;

import Gtm.GtmFactory;
import Gtm.TravelValidityConstraints;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Travel Validity Constraints</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TravelValidityConstraintsTest extends TestCase {

	/**
	 * The fixture for this Travel Validity Constraints test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TravelValidityConstraints fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TravelValidityConstraintsTest.class);
	}

	/**
	 * Constructs a new Travel Validity Constraints test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TravelValidityConstraintsTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Travel Validity Constraints test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TravelValidityConstraints fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Travel Validity Constraints test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TravelValidityConstraints getFixture() {
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
		setFixture(GtmFactory.eINSTANCE.createTravelValidityConstraints());
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

} //TravelValidityConstraintsTest

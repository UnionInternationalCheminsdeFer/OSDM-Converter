/**
 */
package Gtm.tests;

import Gtm.GtmFactory;
import Gtm.TravelValidityConstraint;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Travel Validity Constraint</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TravelValidityConstraintTest extends TestCase {

	/**
	 * The fixture for this Travel Validity Constraint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TravelValidityConstraint fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TravelValidityConstraintTest.class);
	}

	/**
	 * Constructs a new Travel Validity Constraint test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TravelValidityConstraintTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Travel Validity Constraint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TravelValidityConstraint fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Travel Validity Constraint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TravelValidityConstraint getFixture() {
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
		setFixture(GtmFactory.eINSTANCE.createTravelValidityConstraint());
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

} //TravelValidityConstraintTest

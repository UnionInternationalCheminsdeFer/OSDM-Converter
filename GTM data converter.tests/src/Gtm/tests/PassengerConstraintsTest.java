/**
 */
package Gtm.tests;

import Gtm.GtmFactory;
import Gtm.PassengerConstraints;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Passenger Constraints</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PassengerConstraintsTest extends TestCase {

	/**
	 * The fixture for this Passenger Constraints test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PassengerConstraints fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PassengerConstraintsTest.class);
	}

	/**
	 * Constructs a new Passenger Constraints test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassengerConstraintsTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Passenger Constraints test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(PassengerConstraints fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Passenger Constraints test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PassengerConstraints getFixture() {
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
		setFixture(GtmFactory.eINSTANCE.createPassengerConstraints());
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

} //PassengerConstraintsTest

/**
 */
package Gtm.tests;

import Gtm.GtmFactory;
import Gtm.ReservationParameter;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Reservation Parameter</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReservationParameterTest extends TestCase {

	/**
	 * The fixture for this Reservation Parameter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReservationParameter fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ReservationParameterTest.class);
	}

	/**
	 * Constructs a new Reservation Parameter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReservationParameterTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Reservation Parameter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ReservationParameter fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Reservation Parameter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReservationParameter getFixture() {
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
		setFixture(GtmFactory.eINSTANCE.createReservationParameter());
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

} //ReservationParameterTest

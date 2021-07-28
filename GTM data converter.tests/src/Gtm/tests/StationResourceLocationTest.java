/**
 */
package Gtm.tests;

import Gtm.GtmFactory;
import Gtm.StationResourceLocation;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Station Resource Location</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StationResourceLocationTest extends TestCase {

	/**
	 * The fixture for this Station Resource Location test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StationResourceLocation fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StationResourceLocationTest.class);
	}

	/**
	 * Constructs a new Station Resource Location test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StationResourceLocationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Station Resource Location test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(StationResourceLocation fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Station Resource Location test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StationResourceLocation getFixture() {
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
		setFixture(GtmFactory.eINSTANCE.createStationResourceLocation());
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

} //StationResourceLocationTest

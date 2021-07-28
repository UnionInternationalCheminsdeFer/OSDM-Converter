/**
 */
package Gtm.tests;

import Gtm.GtmFactory;
import Gtm.Legacy108Station;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Legacy108 Station</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Legacy108StationTest extends TestCase {

	/**
	 * The fixture for this Legacy108 Station test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Legacy108Station fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(Legacy108StationTest.class);
	}

	/**
	 * Constructs a new Legacy108 Station test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Legacy108StationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Legacy108 Station test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Legacy108Station fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Legacy108 Station test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Legacy108Station getFixture() {
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
		setFixture(GtmFactory.eINSTANCE.createLegacy108Station());
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

} //Legacy108StationTest

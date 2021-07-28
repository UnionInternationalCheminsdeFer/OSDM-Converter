/**
 */
package Gtm.tests;

import Gtm.GtmFactory;
import Gtm.RelativeTime;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Relative Time</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RelativeTimeTest extends TestCase {

	/**
	 * The fixture for this Relative Time test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelativeTime fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RelativeTimeTest.class);
	}

	/**
	 * Constructs a new Relative Time test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelativeTimeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Relative Time test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(RelativeTime fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Relative Time test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelativeTime getFixture() {
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
		setFixture(GtmFactory.eINSTANCE.createRelativeTime());
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

} //RelativeTimeTest

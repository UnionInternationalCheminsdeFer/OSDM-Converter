/**
 */
package Gtm.tests;

import Gtm.GtmFactory;
import Gtm.RegionalConstraints;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Regional Constraints</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RegionalConstraintsTest extends TestCase {

	/**
	 * The fixture for this Regional Constraints test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegionalConstraints fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RegionalConstraintsTest.class);
	}

	/**
	 * Constructs a new Regional Constraints test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegionalConstraintsTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Regional Constraints test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(RegionalConstraints fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Regional Constraints test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegionalConstraints getFixture() {
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
		setFixture(GtmFactory.eINSTANCE.createRegionalConstraints());
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

} //RegionalConstraintsTest

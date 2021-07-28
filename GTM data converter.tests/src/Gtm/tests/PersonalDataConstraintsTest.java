/**
 */
package Gtm.tests;

import Gtm.GtmFactory;
import Gtm.PersonalDataConstraints;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Personal Data Constraints</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PersonalDataConstraintsTest extends TestCase {

	/**
	 * The fixture for this Personal Data Constraints test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonalDataConstraints fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PersonalDataConstraintsTest.class);
	}

	/**
	 * Constructs a new Personal Data Constraints test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonalDataConstraintsTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Personal Data Constraints test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(PersonalDataConstraints fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Personal Data Constraints test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonalDataConstraints getFixture() {
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
		setFixture(GtmFactory.eINSTANCE.createPersonalDataConstraints());
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

} //PersonalDataConstraintsTest

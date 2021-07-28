/**
 */
package Gtm.tests;

import Gtm.GtmFactory;
import Gtm.PersonalDataConstraint;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Personal Data Constraint</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PersonalDataConstraintTest extends TestCase {

	/**
	 * The fixture for this Personal Data Constraint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonalDataConstraint fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PersonalDataConstraintTest.class);
	}

	/**
	 * Constructs a new Personal Data Constraint test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonalDataConstraintTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Personal Data Constraint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(PersonalDataConstraint fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Personal Data Constraint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonalDataConstraint getFixture() {
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
		setFixture(GtmFactory.eINSTANCE.createPersonalDataConstraint());
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

} //PersonalDataConstraintTest

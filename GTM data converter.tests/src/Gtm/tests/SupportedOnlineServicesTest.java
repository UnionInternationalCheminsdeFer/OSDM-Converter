/**
 */
package Gtm.tests;

import Gtm.GtmFactory;
import Gtm.SupportedOnlineServices;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Supported Online Services</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SupportedOnlineServicesTest extends TestCase {

	/**
	 * The fixture for this Supported Online Services test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupportedOnlineServices fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SupportedOnlineServicesTest.class);
	}

	/**
	 * Constructs a new Supported Online Services test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupportedOnlineServicesTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Supported Online Services test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SupportedOnlineServices fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Supported Online Services test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupportedOnlineServices getFixture() {
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
		setFixture(GtmFactory.eINSTANCE.createSupportedOnlineServices());
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

} //SupportedOnlineServicesTest

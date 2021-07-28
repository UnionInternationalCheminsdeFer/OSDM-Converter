/**
 */
package Gtm.tests;

import Gtm.GtmFactory;
import Gtm.ServiceClassDefinitions;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Service Class Definitions</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceClassDefinitionsTest extends TestCase {

	/**
	 * The fixture for this Service Class Definitions test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceClassDefinitions fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ServiceClassDefinitionsTest.class);
	}

	/**
	 * Constructs a new Service Class Definitions test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceClassDefinitionsTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Service Class Definitions test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ServiceClassDefinitions fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Service Class Definitions test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceClassDefinitions getFixture() {
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
		setFixture(GtmFactory.eINSTANCE.createServiceClassDefinitions());
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

} //ServiceClassDefinitionsTest

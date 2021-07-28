/**
 */
package Gtm.tests;

import Gtm.GtmFactory;
import Gtm.ServiceLevelDefinitions;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Service Level Definitions</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceLevelDefinitionsTest extends TestCase {

	/**
	 * The fixture for this Service Level Definitions test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceLevelDefinitions fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ServiceLevelDefinitionsTest.class);
	}

	/**
	 * Constructs a new Service Level Definitions test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceLevelDefinitionsTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Service Level Definitions test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ServiceLevelDefinitions fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Service Level Definitions test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceLevelDefinitions getFixture() {
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
		setFixture(GtmFactory.eINSTANCE.createServiceLevelDefinitions());
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

} //ServiceLevelDefinitionsTest

/**
 */
package Gtm.tests;

import Gtm.GtmFactory;
import Gtm.LegacyAccountingIdentifier;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Legacy Accounting Identifier</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LegacyAccountingIdentifierTest extends TestCase {

	/**
	 * The fixture for this Legacy Accounting Identifier test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LegacyAccountingIdentifier fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LegacyAccountingIdentifierTest.class);
	}

	/**
	 * Constructs a new Legacy Accounting Identifier test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegacyAccountingIdentifierTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Legacy Accounting Identifier test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(LegacyAccountingIdentifier fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Legacy Accounting Identifier test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LegacyAccountingIdentifier getFixture() {
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
		setFixture(GtmFactory.eINSTANCE.createLegacyAccountingIdentifier());
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

} //LegacyAccountingIdentifierTest

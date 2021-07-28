/**
 */
package Gtm.tests;

import Gtm.GtmFactory;
import Gtm.RequiredBarcodes;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Required Barcodes</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RequiredBarcodesTest extends TestCase {

	/**
	 * The fixture for this Required Barcodes test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequiredBarcodes fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RequiredBarcodesTest.class);
	}

	/**
	 * Constructs a new Required Barcodes test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredBarcodesTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Required Barcodes test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(RequiredBarcodes fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Required Barcodes test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequiredBarcodes getFixture() {
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
		setFixture(GtmFactory.eINSTANCE.createRequiredBarcodes());
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

} //RequiredBarcodesTest

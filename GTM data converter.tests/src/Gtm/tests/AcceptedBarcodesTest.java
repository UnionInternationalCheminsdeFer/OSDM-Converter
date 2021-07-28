/**
 */
package Gtm.tests;

import Gtm.AcceptedBarcodes;
import Gtm.GtmFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Accepted Barcodes</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AcceptedBarcodesTest extends TestCase {

	/**
	 * The fixture for this Accepted Barcodes test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AcceptedBarcodes fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AcceptedBarcodesTest.class);
	}

	/**
	 * Constructs a new Accepted Barcodes test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptedBarcodesTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Accepted Barcodes test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(AcceptedBarcodes fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Accepted Barcodes test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AcceptedBarcodes getFixture() {
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
		setFixture(GtmFactory.eINSTANCE.createAcceptedBarcodes());
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

} //AcceptedBarcodesTest

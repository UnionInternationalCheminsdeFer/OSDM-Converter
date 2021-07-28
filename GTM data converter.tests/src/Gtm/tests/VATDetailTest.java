/**
 */
package Gtm.tests;

import Gtm.GtmFactory;
import Gtm.VATDetail;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>VAT Detail</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VATDetailTest extends TestCase {

	/**
	 * The fixture for this VAT Detail test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VATDetail fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VATDetailTest.class);
	}

	/**
	 * Constructs a new VAT Detail test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VATDetailTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this VAT Detail test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(VATDetail fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this VAT Detail test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VATDetail getFixture() {
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
		setFixture(GtmFactory.eINSTANCE.createVATDetail());
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

} //VATDetailTest

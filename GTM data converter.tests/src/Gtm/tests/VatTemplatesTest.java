/**
 */
package Gtm.tests;

import Gtm.GtmFactory;
import Gtm.VatTemplates;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Vat Templates</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VatTemplatesTest extends TestCase {

	/**
	 * The fixture for this Vat Templates test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VatTemplates fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VatTemplatesTest.class);
	}

	/**
	 * Constructs a new Vat Templates test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VatTemplatesTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Vat Templates test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(VatTemplates fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Vat Templates test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VatTemplates getFixture() {
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
		setFixture(GtmFactory.eINSTANCE.createVatTemplates());
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

} //VatTemplatesTest

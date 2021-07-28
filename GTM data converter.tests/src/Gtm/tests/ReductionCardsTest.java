/**
 */
package Gtm.tests;

import Gtm.GtmFactory;
import Gtm.ReductionCards;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Reduction Cards</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReductionCardsTest extends TestCase {

	/**
	 * The fixture for this Reduction Cards test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReductionCards fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ReductionCardsTest.class);
	}

	/**
	 * Constructs a new Reduction Cards test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReductionCardsTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Reduction Cards test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ReductionCards fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Reduction Cards test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReductionCards getFixture() {
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
		setFixture(GtmFactory.eINSTANCE.createReductionCards());
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

} //ReductionCardsTest

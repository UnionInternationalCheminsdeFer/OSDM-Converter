/**
 */
package Gtm.tests;

import Gtm.GtmFactory;
import Gtm.ReductionCard;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Reduction Card</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReductionCardTest extends TestCase {

	/**
	 * The fixture for this Reduction Card test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReductionCard fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ReductionCardTest.class);
	}

	/**
	 * Constructs a new Reduction Card test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReductionCardTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Reduction Card test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ReductionCard fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Reduction Card test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReductionCard getFixture() {
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
		setFixture(GtmFactory.eINSTANCE.createReductionCard());
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

} //ReductionCardTest

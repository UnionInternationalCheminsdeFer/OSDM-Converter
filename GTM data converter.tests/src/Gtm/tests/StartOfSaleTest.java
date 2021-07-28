/**
 */
package Gtm.tests;

import Gtm.GtmFactory;
import Gtm.StartOfSale;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Start Of Sale</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StartOfSaleTest extends RelativeTimeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StartOfSaleTest.class);
	}

	/**
	 * Constructs a new Start Of Sale test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartOfSaleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Start Of Sale test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StartOfSale getFixture() {
		return (StartOfSale)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GtmFactory.eINSTANCE.createStartOfSale());
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

} //StartOfSaleTest

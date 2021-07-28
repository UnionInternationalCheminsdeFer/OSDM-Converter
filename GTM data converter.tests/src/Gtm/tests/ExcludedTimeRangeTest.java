/**
 */
package Gtm.tests;

import Gtm.ExcludedTimeRange;
import Gtm.GtmFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Excluded Time Range</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExcludedTimeRangeTest extends TimeRangeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExcludedTimeRangeTest.class);
	}

	/**
	 * Constructs a new Excluded Time Range test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExcludedTimeRangeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Excluded Time Range test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ExcludedTimeRange getFixture() {
		return (ExcludedTimeRange)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GtmFactory.eINSTANCE.createExcludedTimeRange());
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

} //ExcludedTimeRangeTest

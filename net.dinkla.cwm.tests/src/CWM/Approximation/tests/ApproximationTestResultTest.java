/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Approximation.tests;

import CWM.Approximation.ApproximationFactory;
import CWM.Approximation.ApproximationTestResult;

import CWM.Supervised.tests.MiningTestResultTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Test Result</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApproximationTestResultTest extends MiningTestResultTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ApproximationTestResultTest.class);
	}

	/**
	 * Constructs a new Test Result test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApproximationTestResultTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Test Result test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ApproximationTestResult getFixture() {
		return (ApproximationTestResult)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ApproximationFactory.eINSTANCE.createApproximationTestResult());
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

} //ApproximationTestResultTest

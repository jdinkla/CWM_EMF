/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Approximation.tests;

import CWM.Approximation.ApproximationFactory;
import CWM.Approximation.ApproximationTestTask;

import CWM.Supervised.tests.MiningTestTaskTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Test Task</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApproximationTestTaskTest extends MiningTestTaskTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ApproximationTestTaskTest.class);
	}

	/**
	 * Constructs a new Test Task test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApproximationTestTaskTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Test Task test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ApproximationTestTask getFixture() {
		return (ApproximationTestTask)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ApproximationFactory.eINSTANCE.createApproximationTestTask());
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

} //ApproximationTestTaskTest

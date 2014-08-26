/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Supervised.tests;

import CWM.MiningCore.MiningTask.tests.MiningTaskTest;

import CWM.Supervised.MiningTestTask;
import CWM.Supervised.SupervisedFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Mining Test Task</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MiningTestTaskTest extends MiningTaskTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MiningTestTaskTest.class);
	}

	/**
	 * Constructs a new Mining Test Task test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiningTestTaskTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Mining Test Task test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MiningTestTask getFixture() {
		return (MiningTestTask)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SupervisedFactory.eINSTANCE.createMiningTestTask());
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

} //MiningTestTaskTest

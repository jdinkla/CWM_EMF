/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningTask.tests;

import CWM.MiningCore.MiningTask.MiningApplyTask;
import CWM.MiningCore.MiningTask.MiningTaskFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Mining Apply Task</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MiningApplyTaskTest extends MiningTaskTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MiningApplyTaskTest.class);
	}

	/**
	 * Constructs a new Mining Apply Task test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiningApplyTaskTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Mining Apply Task test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MiningApplyTask getFixture() {
		return (MiningApplyTask)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MiningTaskFactory.eINSTANCE.createMiningApplyTask());
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

} //MiningApplyTaskTest

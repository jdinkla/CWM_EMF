/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningTask.tests;

import CWM.MiningCore.MiningTask.MiningBuildTask;
import CWM.MiningCore.MiningTask.MiningTaskFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Mining Build Task</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MiningBuildTaskTest extends MiningTaskTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MiningBuildTaskTest.class);
	}

	/**
	 * Constructs a new Mining Build Task test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiningBuildTaskTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Mining Build Task test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MiningBuildTask getFixture() {
		return (MiningBuildTask)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MiningTaskFactory.eINSTANCE.createMiningBuildTask());
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

} //MiningBuildTaskTest

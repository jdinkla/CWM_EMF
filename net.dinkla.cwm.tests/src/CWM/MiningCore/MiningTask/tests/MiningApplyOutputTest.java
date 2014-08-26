/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningTask.tests;

import CWM.Core.tests.ModelElementTest;

import CWM.MiningCore.MiningTask.MiningApplyOutput;
import CWM.MiningCore.MiningTask.MiningTaskFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Mining Apply Output</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MiningApplyOutputTest extends ModelElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MiningApplyOutputTest.class);
	}

	/**
	 * Constructs a new Mining Apply Output test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiningApplyOutputTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Mining Apply Output test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MiningApplyOutput getFixture() {
		return (MiningApplyOutput)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MiningTaskFactory.eINSTANCE.createMiningApplyOutput());
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

} //MiningApplyOutputTest

/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Supervised.tests;

import CWM.MiningCore.MiningResult.tests.MiningResultTest;

import CWM.Supervised.MiningTestResult;
import CWM.Supervised.SupervisedFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Mining Test Result</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MiningTestResultTest extends MiningResultTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MiningTestResultTest.class);
	}

	/**
	 * Constructs a new Mining Test Result test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiningTestResultTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Mining Test Result test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MiningTestResult getFixture() {
		return (MiningTestResult)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SupervisedFactory.eINSTANCE.createMiningTestResult());
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

} //MiningTestResultTest

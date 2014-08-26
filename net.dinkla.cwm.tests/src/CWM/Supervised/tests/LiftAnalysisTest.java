/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Supervised.tests;

import CWM.Core.tests.ModelElementTest;

import CWM.Supervised.LiftAnalysis;
import CWM.Supervised.SupervisedFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Lift Analysis</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LiftAnalysisTest extends ModelElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LiftAnalysisTest.class);
	}

	/**
	 * Constructs a new Lift Analysis test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiftAnalysisTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Lift Analysis test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LiftAnalysis getFixture() {
		return (LiftAnalysis)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SupervisedFactory.eINSTANCE.createLiftAnalysis());
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

} //LiftAnalysisTest

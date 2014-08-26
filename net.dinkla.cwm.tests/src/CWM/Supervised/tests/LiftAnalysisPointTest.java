/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Supervised.tests;

import CWM.Core.tests.ModelElementTest;

import CWM.Supervised.LiftAnalysisPoint;
import CWM.Supervised.SupervisedFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Lift Analysis Point</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LiftAnalysisPointTest extends ModelElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LiftAnalysisPointTest.class);
	}

	/**
	 * Constructs a new Lift Analysis Point test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiftAnalysisPointTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Lift Analysis Point test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LiftAnalysisPoint getFixture() {
		return (LiftAnalysisPoint)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SupervisedFactory.eINSTANCE.createLiftAnalysisPoint());
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

} //LiftAnalysisPointTest

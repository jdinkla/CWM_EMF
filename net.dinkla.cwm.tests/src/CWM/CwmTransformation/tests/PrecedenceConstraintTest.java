/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.CwmTransformation.tests;

import CWM.Core.tests.ConstraintTest;

import CWM.CwmTransformation.CwmTransformationFactory;
import CWM.CwmTransformation.PrecedenceConstraint;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Precedence Constraint</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PrecedenceConstraintTest extends ConstraintTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PrecedenceConstraintTest.class);
	}

	/**
	 * Constructs a new Precedence Constraint test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrecedenceConstraintTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Precedence Constraint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PrecedenceConstraint getFixture() {
		return (PrecedenceConstraint)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CwmTransformationFactory.eINSTANCE.createPrecedenceConstraint());
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

} //PrecedenceConstraintTest

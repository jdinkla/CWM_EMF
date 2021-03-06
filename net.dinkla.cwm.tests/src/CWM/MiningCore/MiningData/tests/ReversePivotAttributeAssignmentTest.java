/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningData.tests;

import CWM.MiningCore.MiningData.MiningDataFactory;
import CWM.MiningCore.MiningData.ReversePivotAttributeAssignment;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Reverse Pivot Attribute Assignment</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReversePivotAttributeAssignmentTest extends AttributeAssignmentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ReversePivotAttributeAssignmentTest.class);
	}

	/**
	 * Constructs a new Reverse Pivot Attribute Assignment test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReversePivotAttributeAssignmentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Reverse Pivot Attribute Assignment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ReversePivotAttributeAssignment getFixture() {
		return (ReversePivotAttributeAssignment)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MiningDataFactory.eINSTANCE.createReversePivotAttributeAssignment());
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

} //ReversePivotAttributeAssignmentTest

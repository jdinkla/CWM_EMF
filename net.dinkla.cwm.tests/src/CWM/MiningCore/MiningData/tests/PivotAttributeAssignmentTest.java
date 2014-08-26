/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningData.tests;

import CWM.MiningCore.MiningData.MiningDataFactory;
import CWM.MiningCore.MiningData.PivotAttributeAssignment;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Pivot Attribute Assignment</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PivotAttributeAssignmentTest extends AttributeAssignmentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PivotAttributeAssignmentTest.class);
	}

	/**
	 * Constructs a new Pivot Attribute Assignment test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PivotAttributeAssignmentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Pivot Attribute Assignment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PivotAttributeAssignment getFixture() {
		return (PivotAttributeAssignment)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MiningDataFactory.eINSTANCE.createPivotAttributeAssignment());
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

} //PivotAttributeAssignmentTest

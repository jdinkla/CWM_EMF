/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.WarehouseOperation.tests;

import CWM.Core.tests.ModelElementTest;

import CWM.WarehouseOperation.TransformationExecution;
import CWM.WarehouseOperation.WarehouseOperationFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Transformation Execution</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TransformationExecutionTest extends ModelElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TransformationExecutionTest.class);
	}

	/**
	 * Constructs a new Transformation Execution test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationExecutionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Transformation Execution test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TransformationExecution getFixture() {
		return (TransformationExecution)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(WarehouseOperationFactory.eINSTANCE.createTransformationExecution());
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

} //TransformationExecutionTest

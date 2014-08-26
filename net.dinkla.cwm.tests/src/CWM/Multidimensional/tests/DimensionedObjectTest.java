/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Multidimensional.tests;

import CWM.Core.tests.AttributeTest;

import CWM.Multidimensional.DimensionedObject;
import CWM.Multidimensional.MultidimensionalFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Dimensioned Object</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DimensionedObjectTest extends AttributeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DimensionedObjectTest.class);
	}

	/**
	 * Constructs a new Dimensioned Object test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionedObjectTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Dimensioned Object test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DimensionedObject getFixture() {
		return (DimensionedObject)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MultidimensionalFactory.eINSTANCE.createDimensionedObject());
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

} //DimensionedObjectTest

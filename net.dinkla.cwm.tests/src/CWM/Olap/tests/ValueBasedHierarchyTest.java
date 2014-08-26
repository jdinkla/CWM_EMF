/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Olap.tests;

import CWM.Olap.OlapFactory;
import CWM.Olap.ValueBasedHierarchy;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Value Based Hierarchy</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ValueBasedHierarchyTest extends HierarchyTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ValueBasedHierarchyTest.class);
	}

	/**
	 * Constructs a new Value Based Hierarchy test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueBasedHierarchyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Value Based Hierarchy test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ValueBasedHierarchy getFixture() {
		return (ValueBasedHierarchy)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OlapFactory.eINSTANCE.createValueBasedHierarchy());
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

} //ValueBasedHierarchyTest

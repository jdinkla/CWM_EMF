/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Olap.tests;

import CWM.Olap.HierarchyMemberSelectionGroup;
import CWM.Olap.OlapFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Hierarchy Member Selection Group</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HierarchyMemberSelectionGroupTest extends MemberSelectionGroupTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HierarchyMemberSelectionGroupTest.class);
	}

	/**
	 * Constructs a new Hierarchy Member Selection Group test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HierarchyMemberSelectionGroupTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Hierarchy Member Selection Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected HierarchyMemberSelectionGroup getFixture() {
		return (HierarchyMemberSelectionGroup)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OlapFactory.eINSTANCE.createHierarchyMemberSelectionGroup());
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

} //HierarchyMemberSelectionGroupTest

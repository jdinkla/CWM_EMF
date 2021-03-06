/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningData.tests;

import CWM.Core.tests.ModelElementTest;

import CWM.MiningCore.MiningData.AttributeAssignmentSet;
import CWM.MiningCore.MiningData.MiningDataFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Attribute Assignment Set</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AttributeAssignmentSetTest extends ModelElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AttributeAssignmentSetTest.class);
	}

	/**
	 * Constructs a new Attribute Assignment Set test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeAssignmentSetTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Attribute Assignment Set test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AttributeAssignmentSet getFixture() {
		return (AttributeAssignmentSet)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MiningDataFactory.eINSTANCE.createAttributeAssignmentSet());
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

} //AttributeAssignmentSetTest

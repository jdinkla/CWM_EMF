/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningTask.tests;

import CWM.MiningCore.MiningTask.ApplyRuleIdItem;
import CWM.MiningCore.MiningTask.MiningTaskFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Apply Rule Id Item</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApplyRuleIdItemTest extends ApplyContentItemTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ApplyRuleIdItemTest.class);
	}

	/**
	 * Constructs a new Apply Rule Id Item test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplyRuleIdItemTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Apply Rule Id Item test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ApplyRuleIdItem getFixture() {
		return (ApplyRuleIdItem)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MiningTaskFactory.eINSTANCE.createApplyRuleIdItem());
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

} //ApplyRuleIdItemTest

/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Classification.tests;

import CWM.Classification.ApplyTargetValueItem;
import CWM.Classification.ClassificationFactory;

import CWM.MiningCore.MiningTask.tests.ApplyOutputItemTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Apply Target Value Item</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApplyTargetValueItemTest extends ApplyOutputItemTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ApplyTargetValueItemTest.class);
	}

	/**
	 * Constructs a new Apply Target Value Item test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplyTargetValueItemTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Apply Target Value Item test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ApplyTargetValueItem getFixture() {
		return (ApplyTargetValueItem)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ClassificationFactory.eINSTANCE.createApplyTargetValueItem());
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

} //ApplyTargetValueItemTest

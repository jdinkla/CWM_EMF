/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Classification.tests;

import CWM.Classification.ClassificationAttributeUsage;
import CWM.Classification.ClassificationFactory;

import CWM.MiningCore.MiningData.tests.AttributeUsageTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Attribute Usage</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClassificationAttributeUsageTest extends AttributeUsageTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ClassificationAttributeUsageTest.class);
	}

	/**
	 * Constructs a new Attribute Usage test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassificationAttributeUsageTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Attribute Usage test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ClassificationAttributeUsage getFixture() {
		return (ClassificationAttributeUsage)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ClassificationFactory.eINSTANCE.createClassificationAttributeUsage());
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

} //ClassificationAttributeUsageTest

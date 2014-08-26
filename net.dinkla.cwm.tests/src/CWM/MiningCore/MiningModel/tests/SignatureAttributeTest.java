/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningModel.tests;

import CWM.MiningCore.MiningData.tests.MiningAttributeTest;

import CWM.MiningCore.MiningModel.MiningModelFactory;
import CWM.MiningCore.MiningModel.SignatureAttribute;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Signature Attribute</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SignatureAttributeTest extends MiningAttributeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SignatureAttributeTest.class);
	}

	/**
	 * Constructs a new Signature Attribute test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignatureAttributeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Signature Attribute test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SignatureAttribute getFixture() {
		return (SignatureAttribute)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MiningModelFactory.eINSTANCE.createSignatureAttribute());
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

} //SignatureAttributeTest

/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningData.tests;

import CWM.Core.tests.ModelElementTest;

import CWM.MiningCore.MiningData.MiningDataFactory;
import CWM.MiningCore.MiningData.NumericalAttributeProperties;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Numerical Attribute Properties</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NumericalAttributePropertiesTest extends ModelElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NumericalAttributePropertiesTest.class);
	}

	/**
	 * Constructs a new Numerical Attribute Properties test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericalAttributePropertiesTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Numerical Attribute Properties test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NumericalAttributeProperties getFixture() {
		return (NumericalAttributeProperties)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MiningDataFactory.eINSTANCE.createNumericalAttributeProperties());
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

} //NumericalAttributePropertiesTest

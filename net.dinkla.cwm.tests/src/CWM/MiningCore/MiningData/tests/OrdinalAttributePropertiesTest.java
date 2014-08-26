/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningData.tests;

import CWM.MiningCore.MiningData.MiningDataFactory;
import CWM.MiningCore.MiningData.OrdinalAttributeProperties;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Ordinal Attribute Properties</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OrdinalAttributePropertiesTest extends CategoricalAttributePropertiesTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OrdinalAttributePropertiesTest.class);
	}

	/**
	 * Constructs a new Ordinal Attribute Properties test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrdinalAttributePropertiesTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Ordinal Attribute Properties test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OrdinalAttributeProperties getFixture() {
		return (OrdinalAttributeProperties)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MiningDataFactory.eINSTANCE.createOrdinalAttributeProperties());
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

} //OrdinalAttributePropertiesTest

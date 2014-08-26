/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.EntryPoint.tests;

import CWM.Core.tests.ModelElementTest;

import CWM.MiningCore.EntryPoint.AuxiliaryObject;
import CWM.MiningCore.EntryPoint.EntryPointFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Auxiliary Object</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AuxiliaryObjectTest extends ModelElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AuxiliaryObjectTest.class);
	}

	/**
	 * Constructs a new Auxiliary Object test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuxiliaryObjectTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Auxiliary Object test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AuxiliaryObject getFixture() {
		return (AuxiliaryObject)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EntryPointFactory.eINSTANCE.createAuxiliaryObject());
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

} //AuxiliaryObjectTest

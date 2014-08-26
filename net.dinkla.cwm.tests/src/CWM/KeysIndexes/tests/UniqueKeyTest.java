/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.KeysIndexes.tests;

import CWM.Core.tests.ModelElementTest;

import CWM.KeysIndexes.KeysIndexesFactory;
import CWM.KeysIndexes.UniqueKey;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Unique Key</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UniqueKeyTest extends ModelElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UniqueKeyTest.class);
	}

	/**
	 * Constructs a new Unique Key test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniqueKeyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Unique Key test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UniqueKey getFixture() {
		return (UniqueKey)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(KeysIndexesFactory.eINSTANCE.createUniqueKey());
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

} //UniqueKeyTest

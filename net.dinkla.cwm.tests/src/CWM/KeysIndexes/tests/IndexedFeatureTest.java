/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.KeysIndexes.tests;

import CWM.Core.tests.ModelElementTest;

import CWM.KeysIndexes.IndexedFeature;
import CWM.KeysIndexes.KeysIndexesFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Indexed Feature</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IndexedFeatureTest extends ModelElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IndexedFeatureTest.class);
	}

	/**
	 * Constructs a new Indexed Feature test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexedFeatureTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Indexed Feature test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected IndexedFeature getFixture() {
		return (IndexedFeature)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(KeysIndexesFactory.eINSTANCE.createIndexedFeature());
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

} //IndexedFeatureTest

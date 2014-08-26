/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.tests;

import CWM.MiningCore.MiningCoreFactory;
import CWM.MiningCore.MiningCore_container;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Mining Core container</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MiningCore_containerTest extends TestCase {

	/**
	 * The fixture for this Mining Core container test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MiningCore_container fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MiningCore_containerTest.class);
	}

	/**
	 * Constructs a new Mining Core container test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiningCore_containerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Mining Core container test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(MiningCore_container fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Mining Core container test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MiningCore_container getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MiningCoreFactory.eINSTANCE.createMiningCore_container());
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

} //MiningCore_containerTest

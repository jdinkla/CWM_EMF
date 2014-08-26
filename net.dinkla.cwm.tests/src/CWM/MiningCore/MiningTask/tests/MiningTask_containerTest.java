/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningTask.tests;

import CWM.MiningCore.MiningTask.MiningTaskFactory;
import CWM.MiningCore.MiningTask.MiningTask_container;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Mining Task container</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MiningTask_containerTest extends TestCase {

	/**
	 * The fixture for this Mining Task container test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MiningTask_container fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MiningTask_containerTest.class);
	}

	/**
	 * Constructs a new Mining Task container test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiningTask_containerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Mining Task container test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(MiningTask_container fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Mining Task container test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MiningTask_container getFixture() {
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
		setFixture(MiningTaskFactory.eINSTANCE.createMiningTask_container());
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

} //MiningTask_containerTest

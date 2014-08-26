/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.WarehouseProcess.tests;

import CWM.WarehouseProcess.WarehouseProcessFactory;
import CWM.WarehouseProcess.WarehouseProcess_container;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Warehouse Process container</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WarehouseProcess_containerTest extends TestCase {

	/**
	 * The fixture for this Warehouse Process container test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WarehouseProcess_container fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WarehouseProcess_containerTest.class);
	}

	/**
	 * Constructs a new Warehouse Process container test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WarehouseProcess_containerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Warehouse Process container test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(WarehouseProcess_container fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Warehouse Process container test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WarehouseProcess_container getFixture() {
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
		setFixture(WarehouseProcessFactory.eINSTANCE.createWarehouseProcess_container());
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

} //WarehouseProcess_containerTest

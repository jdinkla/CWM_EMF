/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.WarehouseOperation.tests;

import CWM.WarehouseOperation.WarehouseOperationFactory;
import CWM.WarehouseOperation.WarehouseOperation_container;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Warehouse Operation container</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WarehouseOperation_containerTest extends TestCase {

	/**
	 * The fixture for this Warehouse Operation container test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WarehouseOperation_container fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WarehouseOperation_containerTest.class);
	}

	/**
	 * Constructs a new Warehouse Operation container test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WarehouseOperation_containerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Warehouse Operation container test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(WarehouseOperation_container fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Warehouse Operation container test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WarehouseOperation_container getFixture() {
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
		setFixture(WarehouseOperationFactory.eINSTANCE.createWarehouseOperation_container());
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

} //WarehouseOperation_containerTest

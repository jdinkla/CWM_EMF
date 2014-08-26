/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.WarehouseProcess.tests;

import CWM.WarehouseProcess.WarehouseActivity;
import CWM.WarehouseProcess.WarehouseProcessFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Warehouse Activity</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WarehouseActivityTest extends WarehouseProcessTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WarehouseActivityTest.class);
	}

	/**
	 * Constructs a new Warehouse Activity test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WarehouseActivityTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Warehouse Activity test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected WarehouseActivity getFixture() {
		return (WarehouseActivity)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(WarehouseProcessFactory.eINSTANCE.createWarehouseActivity());
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

} //WarehouseActivityTest

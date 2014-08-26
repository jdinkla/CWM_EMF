/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.WarehouseProcess.tests;

import CWM.WarehouseProcess.WarehouseProcessFactory;
import CWM.WarehouseProcess.WarehouseStep;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Warehouse Step</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WarehouseStepTest extends WarehouseProcessTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WarehouseStepTest.class);
	}

	/**
	 * Constructs a new Warehouse Step test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WarehouseStepTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Warehouse Step test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected WarehouseStep getFixture() {
		return (WarehouseStep)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(WarehouseProcessFactory.eINSTANCE.createWarehouseStep());
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

} //WarehouseStepTest

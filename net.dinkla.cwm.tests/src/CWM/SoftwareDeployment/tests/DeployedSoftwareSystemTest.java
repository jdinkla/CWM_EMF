/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.SoftwareDeployment.tests;

import CWM.Core.tests.PackageTest;

import CWM.SoftwareDeployment.DeployedSoftwareSystem;
import CWM.SoftwareDeployment.SoftwareDeploymentFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Deployed Software System</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeployedSoftwareSystemTest extends PackageTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DeployedSoftwareSystemTest.class);
	}

	/**
	 * Constructs a new Deployed Software System test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeployedSoftwareSystemTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Deployed Software System test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DeployedSoftwareSystem getFixture() {
		return (DeployedSoftwareSystem)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SoftwareDeploymentFactory.eINSTANCE.createDeployedSoftwareSystem());
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

} //DeployedSoftwareSystemTest

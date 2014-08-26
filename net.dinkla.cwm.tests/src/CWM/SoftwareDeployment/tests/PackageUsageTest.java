/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.SoftwareDeployment.tests;

import CWM.Core.tests.DependencyTest;

import CWM.SoftwareDeployment.PackageUsage;
import CWM.SoftwareDeployment.SoftwareDeploymentFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Package Usage</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PackageUsageTest extends DependencyTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PackageUsageTest.class);
	}

	/**
	 * Constructs a new Package Usage test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageUsageTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Package Usage test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PackageUsage getFixture() {
		return (PackageUsage)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SoftwareDeploymentFactory.eINSTANCE.createPackageUsage());
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

} //PackageUsageTest

/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Olap.tests;

import CWM.Core.tests.ClassTest;

import CWM.Olap.CubeDeployment;
import CWM.Olap.OlapFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cube Deployment</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CubeDeploymentTest extends ClassTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CubeDeploymentTest.class);
	}

	/**
	 * Constructs a new Cube Deployment test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CubeDeploymentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Cube Deployment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CubeDeployment getFixture() {
		return (CubeDeployment)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OlapFactory.eINSTANCE.createCubeDeployment());
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

} //CubeDeploymentTest

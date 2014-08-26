/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.SoftwareDeployment.tests;

import CWM.SoftwareDeployment.SoftwareDeploymentFactory;
import CWM.SoftwareDeployment.SoftwareDeployment_container;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Software Deployment container</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SoftwareDeployment_containerTest extends TestCase {

	/**
	 * The fixture for this Software Deployment container test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwareDeployment_container fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SoftwareDeployment_containerTest.class);
	}

	/**
	 * Constructs a new Software Deployment container test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareDeployment_containerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Software Deployment container test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SoftwareDeployment_container fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Software Deployment container test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwareDeployment_container getFixture() {
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
		setFixture(SoftwareDeploymentFactory.eINSTANCE.createSoftwareDeployment_container());
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

} //SoftwareDeployment_containerTest

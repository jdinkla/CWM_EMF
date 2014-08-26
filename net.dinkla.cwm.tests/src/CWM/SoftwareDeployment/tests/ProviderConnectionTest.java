/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.SoftwareDeployment.tests;

import CWM.Core.tests.ModelElementTest;

import CWM.SoftwareDeployment.ProviderConnection;
import CWM.SoftwareDeployment.SoftwareDeploymentFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Provider Connection</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProviderConnectionTest extends ModelElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProviderConnectionTest.class);
	}

	/**
	 * Constructs a new Provider Connection test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProviderConnectionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Provider Connection test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ProviderConnection getFixture() {
		return (ProviderConnection)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SoftwareDeploymentFactory.eINSTANCE.createProviderConnection());
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

} //ProviderConnectionTest

/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Olap.tests;

import CWM.Core.tests.ClassTest;

import CWM.Olap.DimensionDeployment;
import CWM.Olap.OlapFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Dimension Deployment</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DimensionDeploymentTest extends ClassTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DimensionDeploymentTest.class);
	}

	/**
	 * Constructs a new Dimension Deployment test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionDeploymentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Dimension Deployment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DimensionDeployment getFixture() {
		return (DimensionDeployment)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OlapFactory.eINSTANCE.createDimensionDeployment());
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

} //DimensionDeploymentTest

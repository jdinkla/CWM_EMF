/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Approximation.tests;

import CWM.Approximation.ApproximationFactory;
import CWM.Approximation.ApproximationFunctionSettings;

import CWM.Supervised.tests.SupervisedFunctionSettingsTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Function Settings</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApproximationFunctionSettingsTest extends SupervisedFunctionSettingsTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ApproximationFunctionSettingsTest.class);
	}

	/**
	 * Constructs a new Function Settings test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApproximationFunctionSettingsTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Function Settings test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ApproximationFunctionSettings getFixture() {
		return (ApproximationFunctionSettings)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ApproximationFactory.eINSTANCE.createApproximationFunctionSettings());
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

} //ApproximationFunctionSettingsTest

/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Supervised.tests;

import CWM.MiningCore.MiningFunctionSettings.tests.MiningFunctionSettingsTest;

import CWM.Supervised.SupervisedFactory;
import CWM.Supervised.SupervisedFunctionSettings;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Function Settings</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SupervisedFunctionSettingsTest extends MiningFunctionSettingsTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SupervisedFunctionSettingsTest.class);
	}

	/**
	 * Constructs a new Function Settings test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupervisedFunctionSettingsTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Function Settings test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SupervisedFunctionSettings getFixture() {
		return (SupervisedFunctionSettings)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SupervisedFactory.eINSTANCE.createSupervisedFunctionSettings());
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

} //SupervisedFunctionSettingsTest

/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.AttributeImportance.tests;

import CWM.AttributeImportance.AttributeImportanceFactory;
import CWM.AttributeImportance.AttributeImportanceSettings;

import CWM.Supervised.tests.SupervisedFunctionSettingsTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Settings</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AttributeImportanceSettingsTest extends SupervisedFunctionSettingsTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AttributeImportanceSettingsTest.class);
	}

	/**
	 * Constructs a new Settings test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeImportanceSettingsTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Settings test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AttributeImportanceSettings getFixture() {
		return (AttributeImportanceSettings)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AttributeImportanceFactory.eINSTANCE.createAttributeImportanceSettings());
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

} //AttributeImportanceSettingsTest

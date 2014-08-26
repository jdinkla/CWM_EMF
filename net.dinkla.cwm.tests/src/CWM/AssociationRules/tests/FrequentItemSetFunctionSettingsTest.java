/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.AssociationRules.tests;

import CWM.AssociationRules.AssociationRulesFactory;
import CWM.AssociationRules.FrequentItemSetFunctionSettings;

import CWM.MiningCore.MiningFunctionSettings.tests.MiningFunctionSettingsTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Frequent Item Set Function Settings</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FrequentItemSetFunctionSettingsTest extends MiningFunctionSettingsTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FrequentItemSetFunctionSettingsTest.class);
	}

	/**
	 * Constructs a new Frequent Item Set Function Settings test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrequentItemSetFunctionSettingsTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Frequent Item Set Function Settings test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FrequentItemSetFunctionSettings getFixture() {
		return (FrequentItemSetFunctionSettings)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AssociationRulesFactory.eINSTANCE.createFrequentItemSetFunctionSettings());
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

} //FrequentItemSetFunctionSettingsTest

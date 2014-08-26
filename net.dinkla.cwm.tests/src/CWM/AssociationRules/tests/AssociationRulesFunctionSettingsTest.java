/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.AssociationRules.tests;

import CWM.AssociationRules.AssociationRulesFactory;
import CWM.AssociationRules.AssociationRulesFunctionSettings;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Function Settings</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AssociationRulesFunctionSettingsTest extends FrequentItemSetFunctionSettingsTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AssociationRulesFunctionSettingsTest.class);
	}

	/**
	 * Constructs a new Function Settings test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationRulesFunctionSettingsTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Function Settings test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AssociationRulesFunctionSettings getFixture() {
		return (AssociationRulesFunctionSettings)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AssociationRulesFactory.eINSTANCE.createAssociationRulesFunctionSettings());
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

} //AssociationRulesFunctionSettingsTest

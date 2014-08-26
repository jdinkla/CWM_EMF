/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.AssociationRules.tests;

import CWM.AssociationRules.AssociationRulesFactory;
import CWM.AssociationRules.SequenceFunctionSettings;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sequence Function Settings</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SequenceFunctionSettingsTest extends FrequentItemSetFunctionSettingsTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SequenceFunctionSettingsTest.class);
	}

	/**
	 * Constructs a new Sequence Function Settings test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceFunctionSettingsTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Sequence Function Settings test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SequenceFunctionSettings getFixture() {
		return (SequenceFunctionSettings)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AssociationRulesFactory.eINSTANCE.createSequenceFunctionSettings());
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

} //SequenceFunctionSettingsTest

/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.AssociationRules.impl;

import CWM.AssociationRules.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AssociationRulesFactoryImpl extends EFactoryImpl implements AssociationRulesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AssociationRulesFactory init() {
		try {
			AssociationRulesFactory theAssociationRulesFactory = (AssociationRulesFactory)EPackage.Registry.INSTANCE.getEFactory("AssociationRules"); 
			if (theAssociationRulesFactory != null) {
				return theAssociationRulesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AssociationRulesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationRulesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AssociationRulesPackage.ASSOCIATION_RULES_FUNCTION_SETTINGS: return createAssociationRulesFunctionSettings();
			case AssociationRulesPackage.FREQUENT_ITEM_SET_FUNCTION_SETTINGS: return createFrequentItemSetFunctionSettings();
			case AssociationRulesPackage.SEQUENCE_FUNCTION_SETTINGS: return createSequenceFunctionSettings();
			case AssociationRulesPackage.ASSOCIATION_RULES_CONTAINER: return createAssociationRules_container();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationRulesFunctionSettings createAssociationRulesFunctionSettings() {
		AssociationRulesFunctionSettingsImpl associationRulesFunctionSettings = new AssociationRulesFunctionSettingsImpl();
		return associationRulesFunctionSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrequentItemSetFunctionSettings createFrequentItemSetFunctionSettings() {
		FrequentItemSetFunctionSettingsImpl frequentItemSetFunctionSettings = new FrequentItemSetFunctionSettingsImpl();
		return frequentItemSetFunctionSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceFunctionSettings createSequenceFunctionSettings() {
		SequenceFunctionSettingsImpl sequenceFunctionSettings = new SequenceFunctionSettingsImpl();
		return sequenceFunctionSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationRules_container createAssociationRules_container() {
		AssociationRules_containerImpl associationRules_container = new AssociationRules_containerImpl();
		return associationRules_container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationRulesPackage getAssociationRulesPackage() {
		return (AssociationRulesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AssociationRulesPackage getPackage() {
		return AssociationRulesPackage.eINSTANCE;
	}

} //AssociationRulesFactoryImpl

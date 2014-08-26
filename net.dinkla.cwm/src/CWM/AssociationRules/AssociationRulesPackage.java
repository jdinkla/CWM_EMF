/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.AssociationRules;

import CWM.MiningCore.MiningFunctionSettings.MiningFunctionSettingsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see CWM.AssociationRules.AssociationRulesFactory
 * @model kind="package"
 * @generated
 */
public interface AssociationRulesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "AssociationRules";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "AssociationRules";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "AssociationRules";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AssociationRulesPackage eINSTANCE = CWM.AssociationRules.impl.AssociationRulesPackageImpl.init();

	/**
	 * The meta object id for the '{@link CWM.AssociationRules.impl.FrequentItemSetFunctionSettingsImpl <em>Frequent Item Set Function Settings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.AssociationRules.impl.FrequentItemSetFunctionSettingsImpl
	 * @see CWM.AssociationRules.impl.AssociationRulesPackageImpl#getFrequentItemSetFunctionSettings()
	 * @generated
	 */
	int FREQUENT_ITEM_SET_FUNCTION_SETTINGS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENT_ITEM_SET_FUNCTION_SETTINGS__NAME = MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENT_ITEM_SET_FUNCTION_SETTINGS__VISIBILITY = MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENT_ITEM_SET_FUNCTION_SETTINGS__CLIENT_DEPENDENCY = MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENT_ITEM_SET_FUNCTION_SETTINGS__CONSTRAINT = MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENT_ITEM_SET_FUNCTION_SETTINGS__IMPORTER = MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENT_ITEM_SET_FUNCTION_SETTINGS__NAMESPACE = MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENT_ITEM_SET_FUNCTION_SETTINGS__TAGGED_VALUE = MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Algorithm Settings</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENT_ITEM_SET_FUNCTION_SETTINGS__ALGORITHM_SETTINGS = MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS__ALGORITHM_SETTINGS;

	/**
	 * The feature id for the '<em><b>Desired Execution Time In Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENT_ITEM_SET_FUNCTION_SETTINGS__DESIRED_EXECUTION_TIME_IN_MINUTES = MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS__DESIRED_EXECUTION_TIME_IN_MINUTES;

	/**
	 * The feature id for the '<em><b>Attribute Usage Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENT_ITEM_SET_FUNCTION_SETTINGS__ATTRIBUTE_USAGE_SET = MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS__ATTRIBUTE_USAGE_SET;

	/**
	 * The feature id for the '<em><b>Logical Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENT_ITEM_SET_FUNCTION_SETTINGS__LOGICAL_DATA = MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS__LOGICAL_DATA;

	/**
	 * The feature id for the '<em><b>Minimum Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENT_ITEM_SET_FUNCTION_SETTINGS__MINIMUM_SUPPORT = MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Exclusion</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENT_ITEM_SET_FUNCTION_SETTINGS__EXCLUSION = MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Maximum Set Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENT_ITEM_SET_FUNCTION_SETTINGS__MAXIMUM_SET_SIZE = MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Frequent Item Set Function Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENT_ITEM_SET_FUNCTION_SETTINGS_FEATURE_COUNT = MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link CWM.AssociationRules.impl.AssociationRulesFunctionSettingsImpl <em>Function Settings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.AssociationRules.impl.AssociationRulesFunctionSettingsImpl
	 * @see CWM.AssociationRules.impl.AssociationRulesPackageImpl#getAssociationRulesFunctionSettings()
	 * @generated
	 */
	int ASSOCIATION_RULES_FUNCTION_SETTINGS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_RULES_FUNCTION_SETTINGS__NAME = FREQUENT_ITEM_SET_FUNCTION_SETTINGS__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_RULES_FUNCTION_SETTINGS__VISIBILITY = FREQUENT_ITEM_SET_FUNCTION_SETTINGS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_RULES_FUNCTION_SETTINGS__CLIENT_DEPENDENCY = FREQUENT_ITEM_SET_FUNCTION_SETTINGS__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_RULES_FUNCTION_SETTINGS__CONSTRAINT = FREQUENT_ITEM_SET_FUNCTION_SETTINGS__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_RULES_FUNCTION_SETTINGS__IMPORTER = FREQUENT_ITEM_SET_FUNCTION_SETTINGS__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_RULES_FUNCTION_SETTINGS__NAMESPACE = FREQUENT_ITEM_SET_FUNCTION_SETTINGS__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_RULES_FUNCTION_SETTINGS__TAGGED_VALUE = FREQUENT_ITEM_SET_FUNCTION_SETTINGS__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Algorithm Settings</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_RULES_FUNCTION_SETTINGS__ALGORITHM_SETTINGS = FREQUENT_ITEM_SET_FUNCTION_SETTINGS__ALGORITHM_SETTINGS;

	/**
	 * The feature id for the '<em><b>Desired Execution Time In Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_RULES_FUNCTION_SETTINGS__DESIRED_EXECUTION_TIME_IN_MINUTES = FREQUENT_ITEM_SET_FUNCTION_SETTINGS__DESIRED_EXECUTION_TIME_IN_MINUTES;

	/**
	 * The feature id for the '<em><b>Attribute Usage Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_RULES_FUNCTION_SETTINGS__ATTRIBUTE_USAGE_SET = FREQUENT_ITEM_SET_FUNCTION_SETTINGS__ATTRIBUTE_USAGE_SET;

	/**
	 * The feature id for the '<em><b>Logical Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_RULES_FUNCTION_SETTINGS__LOGICAL_DATA = FREQUENT_ITEM_SET_FUNCTION_SETTINGS__LOGICAL_DATA;

	/**
	 * The feature id for the '<em><b>Minimum Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_RULES_FUNCTION_SETTINGS__MINIMUM_SUPPORT = FREQUENT_ITEM_SET_FUNCTION_SETTINGS__MINIMUM_SUPPORT;

	/**
	 * The feature id for the '<em><b>Exclusion</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_RULES_FUNCTION_SETTINGS__EXCLUSION = FREQUENT_ITEM_SET_FUNCTION_SETTINGS__EXCLUSION;

	/**
	 * The feature id for the '<em><b>Maximum Set Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_RULES_FUNCTION_SETTINGS__MAXIMUM_SET_SIZE = FREQUENT_ITEM_SET_FUNCTION_SETTINGS__MAXIMUM_SET_SIZE;

	/**
	 * The feature id for the '<em><b>Minimum Confidence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_RULES_FUNCTION_SETTINGS__MINIMUM_CONFIDENCE = FREQUENT_ITEM_SET_FUNCTION_SETTINGS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Maximum Rule Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_RULES_FUNCTION_SETTINGS__MAXIMUM_RULE_LENGTH = FREQUENT_ITEM_SET_FUNCTION_SETTINGS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Function Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_RULES_FUNCTION_SETTINGS_FEATURE_COUNT = FREQUENT_ITEM_SET_FUNCTION_SETTINGS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link CWM.AssociationRules.impl.SequenceFunctionSettingsImpl <em>Sequence Function Settings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.AssociationRules.impl.SequenceFunctionSettingsImpl
	 * @see CWM.AssociationRules.impl.AssociationRulesPackageImpl#getSequenceFunctionSettings()
	 * @generated
	 */
	int SEQUENCE_FUNCTION_SETTINGS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FUNCTION_SETTINGS__NAME = FREQUENT_ITEM_SET_FUNCTION_SETTINGS__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FUNCTION_SETTINGS__VISIBILITY = FREQUENT_ITEM_SET_FUNCTION_SETTINGS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FUNCTION_SETTINGS__CLIENT_DEPENDENCY = FREQUENT_ITEM_SET_FUNCTION_SETTINGS__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FUNCTION_SETTINGS__CONSTRAINT = FREQUENT_ITEM_SET_FUNCTION_SETTINGS__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FUNCTION_SETTINGS__IMPORTER = FREQUENT_ITEM_SET_FUNCTION_SETTINGS__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FUNCTION_SETTINGS__NAMESPACE = FREQUENT_ITEM_SET_FUNCTION_SETTINGS__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FUNCTION_SETTINGS__TAGGED_VALUE = FREQUENT_ITEM_SET_FUNCTION_SETTINGS__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Algorithm Settings</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FUNCTION_SETTINGS__ALGORITHM_SETTINGS = FREQUENT_ITEM_SET_FUNCTION_SETTINGS__ALGORITHM_SETTINGS;

	/**
	 * The feature id for the '<em><b>Desired Execution Time In Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FUNCTION_SETTINGS__DESIRED_EXECUTION_TIME_IN_MINUTES = FREQUENT_ITEM_SET_FUNCTION_SETTINGS__DESIRED_EXECUTION_TIME_IN_MINUTES;

	/**
	 * The feature id for the '<em><b>Attribute Usage Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FUNCTION_SETTINGS__ATTRIBUTE_USAGE_SET = FREQUENT_ITEM_SET_FUNCTION_SETTINGS__ATTRIBUTE_USAGE_SET;

	/**
	 * The feature id for the '<em><b>Logical Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FUNCTION_SETTINGS__LOGICAL_DATA = FREQUENT_ITEM_SET_FUNCTION_SETTINGS__LOGICAL_DATA;

	/**
	 * The feature id for the '<em><b>Minimum Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FUNCTION_SETTINGS__MINIMUM_SUPPORT = FREQUENT_ITEM_SET_FUNCTION_SETTINGS__MINIMUM_SUPPORT;

	/**
	 * The feature id for the '<em><b>Exclusion</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FUNCTION_SETTINGS__EXCLUSION = FREQUENT_ITEM_SET_FUNCTION_SETTINGS__EXCLUSION;

	/**
	 * The feature id for the '<em><b>Maximum Set Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FUNCTION_SETTINGS__MAXIMUM_SET_SIZE = FREQUENT_ITEM_SET_FUNCTION_SETTINGS__MAXIMUM_SET_SIZE;

	/**
	 * The feature id for the '<em><b>Window Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FUNCTION_SETTINGS__WINDOW_SIZE = FREQUENT_ITEM_SET_FUNCTION_SETTINGS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sequence Function Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FUNCTION_SETTINGS_FEATURE_COUNT = FREQUENT_ITEM_SET_FUNCTION_SETTINGS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CWM.AssociationRules.impl.AssociationRules_containerImpl <em>Association Rules container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.AssociationRules.impl.AssociationRules_containerImpl
	 * @see CWM.AssociationRules.impl.AssociationRulesPackageImpl#getAssociationRules_container()
	 * @generated
	 */
	int ASSOCIATION_RULES_CONTAINER = 3;

	/**
	 * The feature id for the '<em><b>Association Rules Function Settings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_RULES_CONTAINER__ASSOCIATION_RULES_FUNCTION_SETTINGS = 0;

	/**
	 * The feature id for the '<em><b>Frequent Item Set Function Settings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_RULES_CONTAINER__FREQUENT_ITEM_SET_FUNCTION_SETTINGS = 1;

	/**
	 * The feature id for the '<em><b>Sequence Function Settings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_RULES_CONTAINER__SEQUENCE_FUNCTION_SETTINGS = 2;

	/**
	 * The number of structural features of the '<em>Association Rules container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_RULES_CONTAINER_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link CWM.AssociationRules.AssociationRulesFunctionSettings <em>Function Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Settings</em>'.
	 * @see CWM.AssociationRules.AssociationRulesFunctionSettings
	 * @generated
	 */
	EClass getAssociationRulesFunctionSettings();

	/**
	 * Returns the meta object for the attribute '{@link CWM.AssociationRules.AssociationRulesFunctionSettings#getMinimumConfidence <em>Minimum Confidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Confidence</em>'.
	 * @see CWM.AssociationRules.AssociationRulesFunctionSettings#getMinimumConfidence()
	 * @see #getAssociationRulesFunctionSettings()
	 * @generated
	 */
	EAttribute getAssociationRulesFunctionSettings_MinimumConfidence();

	/**
	 * Returns the meta object for the attribute '{@link CWM.AssociationRules.AssociationRulesFunctionSettings#getMaximumRuleLength <em>Maximum Rule Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Rule Length</em>'.
	 * @see CWM.AssociationRules.AssociationRulesFunctionSettings#getMaximumRuleLength()
	 * @see #getAssociationRulesFunctionSettings()
	 * @generated
	 */
	EAttribute getAssociationRulesFunctionSettings_MaximumRuleLength();

	/**
	 * Returns the meta object for class '{@link CWM.AssociationRules.FrequentItemSetFunctionSettings <em>Frequent Item Set Function Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Frequent Item Set Function Settings</em>'.
	 * @see CWM.AssociationRules.FrequentItemSetFunctionSettings
	 * @generated
	 */
	EClass getFrequentItemSetFunctionSettings();

	/**
	 * Returns the meta object for the attribute '{@link CWM.AssociationRules.FrequentItemSetFunctionSettings#getMinimumSupport <em>Minimum Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Support</em>'.
	 * @see CWM.AssociationRules.FrequentItemSetFunctionSettings#getMinimumSupport()
	 * @see #getFrequentItemSetFunctionSettings()
	 * @generated
	 */
	EAttribute getFrequentItemSetFunctionSettings_MinimumSupport();

	/**
	 * Returns the meta object for the reference list '{@link CWM.AssociationRules.FrequentItemSetFunctionSettings#getExclusion <em>Exclusion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Exclusion</em>'.
	 * @see CWM.AssociationRules.FrequentItemSetFunctionSettings#getExclusion()
	 * @see #getFrequentItemSetFunctionSettings()
	 * @generated
	 */
	EReference getFrequentItemSetFunctionSettings_Exclusion();

	/**
	 * Returns the meta object for the attribute '{@link CWM.AssociationRules.FrequentItemSetFunctionSettings#getMaximumSetSize <em>Maximum Set Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Set Size</em>'.
	 * @see CWM.AssociationRules.FrequentItemSetFunctionSettings#getMaximumSetSize()
	 * @see #getFrequentItemSetFunctionSettings()
	 * @generated
	 */
	EAttribute getFrequentItemSetFunctionSettings_MaximumSetSize();

	/**
	 * Returns the meta object for class '{@link CWM.AssociationRules.SequenceFunctionSettings <em>Sequence Function Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Function Settings</em>'.
	 * @see CWM.AssociationRules.SequenceFunctionSettings
	 * @generated
	 */
	EClass getSequenceFunctionSettings();

	/**
	 * Returns the meta object for the attribute '{@link CWM.AssociationRules.SequenceFunctionSettings#getWindowSize <em>Window Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Window Size</em>'.
	 * @see CWM.AssociationRules.SequenceFunctionSettings#getWindowSize()
	 * @see #getSequenceFunctionSettings()
	 * @generated
	 */
	EAttribute getSequenceFunctionSettings_WindowSize();

	/**
	 * Returns the meta object for class '{@link CWM.AssociationRules.AssociationRules_container <em>Association Rules container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association Rules container</em>'.
	 * @see CWM.AssociationRules.AssociationRules_container
	 * @generated
	 */
	EClass getAssociationRules_container();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.AssociationRules.AssociationRules_container#getAssociationRulesFunctionSettings <em>Association Rules Function Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Association Rules Function Settings</em>'.
	 * @see CWM.AssociationRules.AssociationRules_container#getAssociationRulesFunctionSettings()
	 * @see #getAssociationRules_container()
	 * @generated
	 */
	EReference getAssociationRules_container_AssociationRulesFunctionSettings();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.AssociationRules.AssociationRules_container#getFrequentItemSetFunctionSettings <em>Frequent Item Set Function Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Frequent Item Set Function Settings</em>'.
	 * @see CWM.AssociationRules.AssociationRules_container#getFrequentItemSetFunctionSettings()
	 * @see #getAssociationRules_container()
	 * @generated
	 */
	EReference getAssociationRules_container_FrequentItemSetFunctionSettings();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.AssociationRules.AssociationRules_container#getSequenceFunctionSettings <em>Sequence Function Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sequence Function Settings</em>'.
	 * @see CWM.AssociationRules.AssociationRules_container#getSequenceFunctionSettings()
	 * @see #getAssociationRules_container()
	 * @generated
	 */
	EReference getAssociationRules_container_SequenceFunctionSettings();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AssociationRulesFactory getAssociationRulesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link CWM.AssociationRules.impl.AssociationRulesFunctionSettingsImpl <em>Function Settings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.AssociationRules.impl.AssociationRulesFunctionSettingsImpl
		 * @see CWM.AssociationRules.impl.AssociationRulesPackageImpl#getAssociationRulesFunctionSettings()
		 * @generated
		 */
		EClass ASSOCIATION_RULES_FUNCTION_SETTINGS = eINSTANCE.getAssociationRulesFunctionSettings();

		/**
		 * The meta object literal for the '<em><b>Minimum Confidence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION_RULES_FUNCTION_SETTINGS__MINIMUM_CONFIDENCE = eINSTANCE.getAssociationRulesFunctionSettings_MinimumConfidence();

		/**
		 * The meta object literal for the '<em><b>Maximum Rule Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION_RULES_FUNCTION_SETTINGS__MAXIMUM_RULE_LENGTH = eINSTANCE.getAssociationRulesFunctionSettings_MaximumRuleLength();

		/**
		 * The meta object literal for the '{@link CWM.AssociationRules.impl.FrequentItemSetFunctionSettingsImpl <em>Frequent Item Set Function Settings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.AssociationRules.impl.FrequentItemSetFunctionSettingsImpl
		 * @see CWM.AssociationRules.impl.AssociationRulesPackageImpl#getFrequentItemSetFunctionSettings()
		 * @generated
		 */
		EClass FREQUENT_ITEM_SET_FUNCTION_SETTINGS = eINSTANCE.getFrequentItemSetFunctionSettings();

		/**
		 * The meta object literal for the '<em><b>Minimum Support</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FREQUENT_ITEM_SET_FUNCTION_SETTINGS__MINIMUM_SUPPORT = eINSTANCE.getFrequentItemSetFunctionSettings_MinimumSupport();

		/**
		 * The meta object literal for the '<em><b>Exclusion</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FREQUENT_ITEM_SET_FUNCTION_SETTINGS__EXCLUSION = eINSTANCE.getFrequentItemSetFunctionSettings_Exclusion();

		/**
		 * The meta object literal for the '<em><b>Maximum Set Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FREQUENT_ITEM_SET_FUNCTION_SETTINGS__MAXIMUM_SET_SIZE = eINSTANCE.getFrequentItemSetFunctionSettings_MaximumSetSize();

		/**
		 * The meta object literal for the '{@link CWM.AssociationRules.impl.SequenceFunctionSettingsImpl <em>Sequence Function Settings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.AssociationRules.impl.SequenceFunctionSettingsImpl
		 * @see CWM.AssociationRules.impl.AssociationRulesPackageImpl#getSequenceFunctionSettings()
		 * @generated
		 */
		EClass SEQUENCE_FUNCTION_SETTINGS = eINSTANCE.getSequenceFunctionSettings();

		/**
		 * The meta object literal for the '<em><b>Window Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE_FUNCTION_SETTINGS__WINDOW_SIZE = eINSTANCE.getSequenceFunctionSettings_WindowSize();

		/**
		 * The meta object literal for the '{@link CWM.AssociationRules.impl.AssociationRules_containerImpl <em>Association Rules container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.AssociationRules.impl.AssociationRules_containerImpl
		 * @see CWM.AssociationRules.impl.AssociationRulesPackageImpl#getAssociationRules_container()
		 * @generated
		 */
		EClass ASSOCIATION_RULES_CONTAINER = eINSTANCE.getAssociationRules_container();

		/**
		 * The meta object literal for the '<em><b>Association Rules Function Settings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_RULES_CONTAINER__ASSOCIATION_RULES_FUNCTION_SETTINGS = eINSTANCE.getAssociationRules_container_AssociationRulesFunctionSettings();

		/**
		 * The meta object literal for the '<em><b>Frequent Item Set Function Settings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_RULES_CONTAINER__FREQUENT_ITEM_SET_FUNCTION_SETTINGS = eINSTANCE.getAssociationRules_container_FrequentItemSetFunctionSettings();

		/**
		 * The meta object literal for the '<em><b>Sequence Function Settings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_RULES_CONTAINER__SEQUENCE_FUNCTION_SETTINGS = eINSTANCE.getAssociationRules_container_SequenceFunctionSettings();

	}

} //AssociationRulesPackage

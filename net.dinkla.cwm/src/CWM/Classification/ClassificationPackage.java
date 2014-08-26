/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Classification;

import CWM.Core.CorePackage;

import CWM.MiningCore.MiningData.MiningDataPackage;

import CWM.MiningCore.MiningTask.MiningTaskPackage;

import CWM.Supervised.SupervisedPackage;

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
 * @see CWM.Classification.ClassificationFactory
 * @model kind="package"
 * @generated
 */
public interface ClassificationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Classification";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "Classification";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Classification";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ClassificationPackage eINSTANCE = CWM.Classification.impl.ClassificationPackageImpl.init();

	/**
	 * The meta object id for the '{@link CWM.Classification.impl.ApplyTargetValueItemImpl <em>Apply Target Value Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Classification.impl.ApplyTargetValueItemImpl
	 * @see CWM.Classification.impl.ClassificationPackageImpl#getApplyTargetValueItem()
	 * @generated
	 */
	int APPLY_TARGET_VALUE_ITEM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_TARGET_VALUE_ITEM__NAME = MiningTaskPackage.APPLY_OUTPUT_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_TARGET_VALUE_ITEM__VISIBILITY = MiningTaskPackage.APPLY_OUTPUT_ITEM__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_TARGET_VALUE_ITEM__CLIENT_DEPENDENCY = MiningTaskPackage.APPLY_OUTPUT_ITEM__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_TARGET_VALUE_ITEM__CONSTRAINT = MiningTaskPackage.APPLY_OUTPUT_ITEM__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_TARGET_VALUE_ITEM__IMPORTER = MiningTaskPackage.APPLY_OUTPUT_ITEM__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_TARGET_VALUE_ITEM__NAMESPACE = MiningTaskPackage.APPLY_OUTPUT_ITEM__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_TARGET_VALUE_ITEM__TAGGED_VALUE = MiningTaskPackage.APPLY_OUTPUT_ITEM__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owner Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_TARGET_VALUE_ITEM__OWNER_SCOPE = MiningTaskPackage.APPLY_OUTPUT_ITEM__OWNER_SCOPE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_TARGET_VALUE_ITEM__OWNER = MiningTaskPackage.APPLY_OUTPUT_ITEM__OWNER;

	/**
	 * The feature id for the '<em><b>Changeability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_TARGET_VALUE_ITEM__CHANGEABILITY = MiningTaskPackage.APPLY_OUTPUT_ITEM__CHANGEABILITY;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_TARGET_VALUE_ITEM__MULTIPLICITY = MiningTaskPackage.APPLY_OUTPUT_ITEM__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_TARGET_VALUE_ITEM__ORDERING = MiningTaskPackage.APPLY_OUTPUT_ITEM__ORDERING;

	/**
	 * The feature id for the '<em><b>Target Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_TARGET_VALUE_ITEM__TARGET_SCOPE = MiningTaskPackage.APPLY_OUTPUT_ITEM__TARGET_SCOPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_TARGET_VALUE_ITEM__TYPE = MiningTaskPackage.APPLY_OUTPUT_ITEM__TYPE;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_TARGET_VALUE_ITEM__INITIAL_VALUE = MiningTaskPackage.APPLY_OUTPUT_ITEM__INITIAL_VALUE;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_TARGET_VALUE_ITEM__DISPLAY_NAME = MiningTaskPackage.APPLY_OUTPUT_ITEM__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Attribute Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_TARGET_VALUE_ITEM__ATTRIBUTE_TYPE = MiningTaskPackage.APPLY_OUTPUT_ITEM__ATTRIBUTE_TYPE;

	/**
	 * The feature id for the '<em><b>Target Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_TARGET_VALUE_ITEM__TARGET_VALUE = MiningTaskPackage.APPLY_OUTPUT_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Apply Target Value Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_TARGET_VALUE_ITEM_FEATURE_COUNT = MiningTaskPackage.APPLY_OUTPUT_ITEM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CWM.Classification.impl.ClassificationAttributeUsageImpl <em>Attribute Usage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Classification.impl.ClassificationAttributeUsageImpl
	 * @see CWM.Classification.impl.ClassificationPackageImpl#getClassificationAttributeUsage()
	 * @generated
	 */
	int CLASSIFICATION_ATTRIBUTE_USAGE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_ATTRIBUTE_USAGE__NAME = MiningDataPackage.ATTRIBUTE_USAGE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_ATTRIBUTE_USAGE__VISIBILITY = MiningDataPackage.ATTRIBUTE_USAGE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_ATTRIBUTE_USAGE__CLIENT_DEPENDENCY = MiningDataPackage.ATTRIBUTE_USAGE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_ATTRIBUTE_USAGE__CONSTRAINT = MiningDataPackage.ATTRIBUTE_USAGE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_ATTRIBUTE_USAGE__IMPORTER = MiningDataPackage.ATTRIBUTE_USAGE__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_ATTRIBUTE_USAGE__NAMESPACE = MiningDataPackage.ATTRIBUTE_USAGE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_ATTRIBUTE_USAGE__TAGGED_VALUE = MiningDataPackage.ATTRIBUTE_USAGE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owner Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_ATTRIBUTE_USAGE__OWNER_SCOPE = MiningDataPackage.ATTRIBUTE_USAGE__OWNER_SCOPE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_ATTRIBUTE_USAGE__OWNER = MiningDataPackage.ATTRIBUTE_USAGE__OWNER;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_ATTRIBUTE_USAGE__USAGE = MiningDataPackage.ATTRIBUTE_USAGE__USAGE;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_ATTRIBUTE_USAGE__WEIGHT = MiningDataPackage.ATTRIBUTE_USAGE__WEIGHT;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_ATTRIBUTE_USAGE__ATTRIBUTE = MiningDataPackage.ATTRIBUTE_USAGE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Suppress Discretization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_ATTRIBUTE_USAGE__SUPPRESS_DISCRETIZATION = MiningDataPackage.ATTRIBUTE_USAGE__SUPPRESS_DISCRETIZATION;

	/**
	 * The feature id for the '<em><b>Suppress Normalization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_ATTRIBUTE_USAGE__SUPPRESS_NORMALIZATION = MiningDataPackage.ATTRIBUTE_USAGE__SUPPRESS_NORMALIZATION;

	/**
	 * The feature id for the '<em><b>Positive Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_ATTRIBUTE_USAGE__POSITIVE_CATEGORY = MiningDataPackage.ATTRIBUTE_USAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Priors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_ATTRIBUTE_USAGE__PRIORS = MiningDataPackage.ATTRIBUTE_USAGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute Usage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_ATTRIBUTE_USAGE_FEATURE_COUNT = MiningDataPackage.ATTRIBUTE_USAGE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link CWM.Classification.impl.ClassificationFunctionSettingsImpl <em>Function Settings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Classification.impl.ClassificationFunctionSettingsImpl
	 * @see CWM.Classification.impl.ClassificationPackageImpl#getClassificationFunctionSettings()
	 * @generated
	 */
	int CLASSIFICATION_FUNCTION_SETTINGS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_FUNCTION_SETTINGS__NAME = SupervisedPackage.SUPERVISED_FUNCTION_SETTINGS__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_FUNCTION_SETTINGS__VISIBILITY = SupervisedPackage.SUPERVISED_FUNCTION_SETTINGS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_FUNCTION_SETTINGS__CLIENT_DEPENDENCY = SupervisedPackage.SUPERVISED_FUNCTION_SETTINGS__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_FUNCTION_SETTINGS__CONSTRAINT = SupervisedPackage.SUPERVISED_FUNCTION_SETTINGS__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_FUNCTION_SETTINGS__IMPORTER = SupervisedPackage.SUPERVISED_FUNCTION_SETTINGS__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_FUNCTION_SETTINGS__NAMESPACE = SupervisedPackage.SUPERVISED_FUNCTION_SETTINGS__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_FUNCTION_SETTINGS__TAGGED_VALUE = SupervisedPackage.SUPERVISED_FUNCTION_SETTINGS__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Algorithm Settings</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_FUNCTION_SETTINGS__ALGORITHM_SETTINGS = SupervisedPackage.SUPERVISED_FUNCTION_SETTINGS__ALGORITHM_SETTINGS;

	/**
	 * The feature id for the '<em><b>Desired Execution Time In Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_FUNCTION_SETTINGS__DESIRED_EXECUTION_TIME_IN_MINUTES = SupervisedPackage.SUPERVISED_FUNCTION_SETTINGS__DESIRED_EXECUTION_TIME_IN_MINUTES;

	/**
	 * The feature id for the '<em><b>Attribute Usage Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_FUNCTION_SETTINGS__ATTRIBUTE_USAGE_SET = SupervisedPackage.SUPERVISED_FUNCTION_SETTINGS__ATTRIBUTE_USAGE_SET;

	/**
	 * The feature id for the '<em><b>Logical Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_FUNCTION_SETTINGS__LOGICAL_DATA = SupervisedPackage.SUPERVISED_FUNCTION_SETTINGS__LOGICAL_DATA;

	/**
	 * The feature id for the '<em><b>Cost Matrix</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_FUNCTION_SETTINGS__COST_MATRIX = SupervisedPackage.SUPERVISED_FUNCTION_SETTINGS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Function Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_FUNCTION_SETTINGS_FEATURE_COUNT = SupervisedPackage.SUPERVISED_FUNCTION_SETTINGS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CWM.Classification.impl.ClassificationTestResultImpl <em>Test Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Classification.impl.ClassificationTestResultImpl
	 * @see CWM.Classification.impl.ClassificationPackageImpl#getClassificationTestResult()
	 * @generated
	 */
	int CLASSIFICATION_TEST_RESULT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_TEST_RESULT__NAME = SupervisedPackage.MINING_TEST_RESULT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_TEST_RESULT__VISIBILITY = SupervisedPackage.MINING_TEST_RESULT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_TEST_RESULT__CLIENT_DEPENDENCY = SupervisedPackage.MINING_TEST_RESULT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_TEST_RESULT__CONSTRAINT = SupervisedPackage.MINING_TEST_RESULT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_TEST_RESULT__IMPORTER = SupervisedPackage.MINING_TEST_RESULT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_TEST_RESULT__NAMESPACE = SupervisedPackage.MINING_TEST_RESULT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_TEST_RESULT__TAGGED_VALUE = SupervisedPackage.MINING_TEST_RESULT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Number Of Test Records</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_TEST_RESULT__NUMBER_OF_TEST_RECORDS = SupervisedPackage.MINING_TEST_RESULT__NUMBER_OF_TEST_RECORDS;

	/**
	 * The feature id for the '<em><b>Lift Analysis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_TEST_RESULT__LIFT_ANALYSIS = SupervisedPackage.MINING_TEST_RESULT__LIFT_ANALYSIS;

	/**
	 * The feature id for the '<em><b>Confusion Matrix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_TEST_RESULT__CONFUSION_MATRIX = SupervisedPackage.MINING_TEST_RESULT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Accuracy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_TEST_RESULT__ACCURACY = SupervisedPackage.MINING_TEST_RESULT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Test Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_TEST_RESULT_FEATURE_COUNT = SupervisedPackage.MINING_TEST_RESULT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link CWM.Classification.impl.ClassificationTestTaskImpl <em>Test Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Classification.impl.ClassificationTestTaskImpl
	 * @see CWM.Classification.impl.ClassificationPackageImpl#getClassificationTestTask()
	 * @generated
	 */
	int CLASSIFICATION_TEST_TASK = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_TEST_TASK__NAME = SupervisedPackage.MINING_TEST_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_TEST_TASK__VISIBILITY = SupervisedPackage.MINING_TEST_TASK__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_TEST_TASK__CLIENT_DEPENDENCY = SupervisedPackage.MINING_TEST_TASK__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_TEST_TASK__CONSTRAINT = SupervisedPackage.MINING_TEST_TASK__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_TEST_TASK__IMPORTER = SupervisedPackage.MINING_TEST_TASK__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_TEST_TASK__NAMESPACE = SupervisedPackage.MINING_TEST_TASK__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_TEST_TASK__TAGGED_VALUE = SupervisedPackage.MINING_TEST_TASK__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Input Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_TEST_TASK__INPUT_DATA = SupervisedPackage.MINING_TEST_TASK__INPUT_DATA;

	/**
	 * The feature id for the '<em><b>Model Assignment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_TEST_TASK__MODEL_ASSIGNMENT = SupervisedPackage.MINING_TEST_TASK__MODEL_ASSIGNMENT;

	/**
	 * The feature id for the '<em><b>Input Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_TEST_TASK__INPUT_MODEL = SupervisedPackage.MINING_TEST_TASK__INPUT_MODEL;

	/**
	 * The feature id for the '<em><b>Compute Lift</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_TEST_TASK__COMPUTE_LIFT = SupervisedPackage.MINING_TEST_TASK__COMPUTE_LIFT;

	/**
	 * The feature id for the '<em><b>Positive Target Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_TEST_TASK__POSITIVE_TARGET_CATEGORY = SupervisedPackage.MINING_TEST_TASK__POSITIVE_TARGET_CATEGORY;

	/**
	 * The feature id for the '<em><b>Test Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_TEST_TASK__TEST_RESULT = SupervisedPackage.MINING_TEST_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Test Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_TEST_TASK_FEATURE_COUNT = SupervisedPackage.MINING_TEST_TASK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CWM.Classification.impl.PriorProbabilitiesImpl <em>Prior Probabilities</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Classification.impl.PriorProbabilitiesImpl
	 * @see CWM.Classification.impl.ClassificationPackageImpl#getPriorProbabilities()
	 * @generated
	 */
	int PRIOR_PROBABILITIES = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIOR_PROBABILITIES__NAME = CorePackage.MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIOR_PROBABILITIES__VISIBILITY = CorePackage.MODEL_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIOR_PROBABILITIES__CLIENT_DEPENDENCY = CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIOR_PROBABILITIES__CONSTRAINT = CorePackage.MODEL_ELEMENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIOR_PROBABILITIES__IMPORTER = CorePackage.MODEL_ELEMENT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIOR_PROBABILITIES__NAMESPACE = CorePackage.MODEL_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIOR_PROBABILITIES__TAGGED_VALUE = CorePackage.MODEL_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Prior</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIOR_PROBABILITIES__PRIOR = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Prior Probabilities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIOR_PROBABILITIES_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CWM.Classification.impl.PriorProbabilitiesEntryImpl <em>Prior Probabilities Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Classification.impl.PriorProbabilitiesEntryImpl
	 * @see CWM.Classification.impl.ClassificationPackageImpl#getPriorProbabilitiesEntry()
	 * @generated
	 */
	int PRIOR_PROBABILITIES_ENTRY = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIOR_PROBABILITIES_ENTRY__NAME = CorePackage.MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIOR_PROBABILITIES_ENTRY__VISIBILITY = CorePackage.MODEL_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIOR_PROBABILITIES_ENTRY__CLIENT_DEPENDENCY = CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIOR_PROBABILITIES_ENTRY__CONSTRAINT = CorePackage.MODEL_ELEMENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIOR_PROBABILITIES_ENTRY__IMPORTER = CorePackage.MODEL_ELEMENT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIOR_PROBABILITIES_ENTRY__NAMESPACE = CorePackage.MODEL_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIOR_PROBABILITIES_ENTRY__TAGGED_VALUE = CorePackage.MODEL_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Target Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIOR_PROBABILITIES_ENTRY__TARGET_VALUE = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Prior Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIOR_PROBABILITIES_ENTRY__PRIOR_PROBABILITY = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Prior Probabilities Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIOR_PROBABILITIES_ENTRY_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link CWM.Classification.impl.Classification_containerImpl <em>Classification container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Classification.impl.Classification_containerImpl
	 * @see CWM.Classification.impl.ClassificationPackageImpl#getClassification_container()
	 * @generated
	 */
	int CLASSIFICATION_CONTAINER = 7;

	/**
	 * The feature id for the '<em><b>Apply Target Value Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_CONTAINER__APPLY_TARGET_VALUE_ITEM = 0;

	/**
	 * The feature id for the '<em><b>Classification Attribute Usage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_CONTAINER__CLASSIFICATION_ATTRIBUTE_USAGE = 1;

	/**
	 * The feature id for the '<em><b>Classification Function Settings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_CONTAINER__CLASSIFICATION_FUNCTION_SETTINGS = 2;

	/**
	 * The feature id for the '<em><b>Classification Test Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_CONTAINER__CLASSIFICATION_TEST_RESULT = 3;

	/**
	 * The feature id for the '<em><b>Classification Test Task</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_CONTAINER__CLASSIFICATION_TEST_TASK = 4;

	/**
	 * The feature id for the '<em><b>Prior Probabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_CONTAINER__PRIOR_PROBABILITIES = 5;

	/**
	 * The feature id for the '<em><b>Prior Probabilities Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_CONTAINER__PRIOR_PROBABILITIES_ENTRY = 6;

	/**
	 * The number of structural features of the '<em>Classification container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_CONTAINER_FEATURE_COUNT = 7;


	/**
	 * Returns the meta object for class '{@link CWM.Classification.ApplyTargetValueItem <em>Apply Target Value Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Apply Target Value Item</em>'.
	 * @see CWM.Classification.ApplyTargetValueItem
	 * @generated
	 */
	EClass getApplyTargetValueItem();

	/**
	 * Returns the meta object for the reference '{@link CWM.Classification.ApplyTargetValueItem#getTargetValue <em>Target Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Value</em>'.
	 * @see CWM.Classification.ApplyTargetValueItem#getTargetValue()
	 * @see #getApplyTargetValueItem()
	 * @generated
	 */
	EReference getApplyTargetValueItem_TargetValue();

	/**
	 * Returns the meta object for class '{@link CWM.Classification.ClassificationAttributeUsage <em>Attribute Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Usage</em>'.
	 * @see CWM.Classification.ClassificationAttributeUsage
	 * @generated
	 */
	EClass getClassificationAttributeUsage();

	/**
	 * Returns the meta object for the reference list '{@link CWM.Classification.ClassificationAttributeUsage#getPositiveCategory <em>Positive Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Positive Category</em>'.
	 * @see CWM.Classification.ClassificationAttributeUsage#getPositiveCategory()
	 * @see #getClassificationAttributeUsage()
	 * @generated
	 */
	EReference getClassificationAttributeUsage_PositiveCategory();

	/**
	 * Returns the meta object for the containment reference '{@link CWM.Classification.ClassificationAttributeUsage#getPriors <em>Priors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Priors</em>'.
	 * @see CWM.Classification.ClassificationAttributeUsage#getPriors()
	 * @see #getClassificationAttributeUsage()
	 * @generated
	 */
	EReference getClassificationAttributeUsage_Priors();

	/**
	 * Returns the meta object for class '{@link CWM.Classification.ClassificationFunctionSettings <em>Function Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Settings</em>'.
	 * @see CWM.Classification.ClassificationFunctionSettings
	 * @generated
	 */
	EClass getClassificationFunctionSettings();

	/**
	 * Returns the meta object for the reference '{@link CWM.Classification.ClassificationFunctionSettings#getCostMatrix <em>Cost Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cost Matrix</em>'.
	 * @see CWM.Classification.ClassificationFunctionSettings#getCostMatrix()
	 * @see #getClassificationFunctionSettings()
	 * @generated
	 */
	EReference getClassificationFunctionSettings_CostMatrix();

	/**
	 * Returns the meta object for class '{@link CWM.Classification.ClassificationTestResult <em>Test Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Result</em>'.
	 * @see CWM.Classification.ClassificationTestResult
	 * @generated
	 */
	EClass getClassificationTestResult();

	/**
	 * Returns the meta object for the containment reference '{@link CWM.Classification.ClassificationTestResult#getConfusionMatrix <em>Confusion Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Confusion Matrix</em>'.
	 * @see CWM.Classification.ClassificationTestResult#getConfusionMatrix()
	 * @see #getClassificationTestResult()
	 * @generated
	 */
	EReference getClassificationTestResult_ConfusionMatrix();

	/**
	 * Returns the meta object for the attribute '{@link CWM.Classification.ClassificationTestResult#getAccuracy <em>Accuracy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accuracy</em>'.
	 * @see CWM.Classification.ClassificationTestResult#getAccuracy()
	 * @see #getClassificationTestResult()
	 * @generated
	 */
	EAttribute getClassificationTestResult_Accuracy();

	/**
	 * Returns the meta object for class '{@link CWM.Classification.ClassificationTestTask <em>Test Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Task</em>'.
	 * @see CWM.Classification.ClassificationTestTask
	 * @generated
	 */
	EClass getClassificationTestTask();

	/**
	 * Returns the meta object for the containment reference '{@link CWM.Classification.ClassificationTestTask#getTestResult <em>Test Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Test Result</em>'.
	 * @see CWM.Classification.ClassificationTestTask#getTestResult()
	 * @see #getClassificationTestTask()
	 * @generated
	 */
	EReference getClassificationTestTask_TestResult();

	/**
	 * Returns the meta object for class '{@link CWM.Classification.PriorProbabilities <em>Prior Probabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prior Probabilities</em>'.
	 * @see CWM.Classification.PriorProbabilities
	 * @generated
	 */
	EClass getPriorProbabilities();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Classification.PriorProbabilities#getPrior <em>Prior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prior</em>'.
	 * @see CWM.Classification.PriorProbabilities#getPrior()
	 * @see #getPriorProbabilities()
	 * @generated
	 */
	EReference getPriorProbabilities_Prior();

	/**
	 * Returns the meta object for class '{@link CWM.Classification.PriorProbabilitiesEntry <em>Prior Probabilities Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prior Probabilities Entry</em>'.
	 * @see CWM.Classification.PriorProbabilitiesEntry
	 * @generated
	 */
	EClass getPriorProbabilitiesEntry();

	/**
	 * Returns the meta object for the reference '{@link CWM.Classification.PriorProbabilitiesEntry#getTargetValue <em>Target Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Value</em>'.
	 * @see CWM.Classification.PriorProbabilitiesEntry#getTargetValue()
	 * @see #getPriorProbabilitiesEntry()
	 * @generated
	 */
	EReference getPriorProbabilitiesEntry_TargetValue();

	/**
	 * Returns the meta object for the attribute '{@link CWM.Classification.PriorProbabilitiesEntry#getPriorProbability <em>Prior Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prior Probability</em>'.
	 * @see CWM.Classification.PriorProbabilitiesEntry#getPriorProbability()
	 * @see #getPriorProbabilitiesEntry()
	 * @generated
	 */
	EAttribute getPriorProbabilitiesEntry_PriorProbability();

	/**
	 * Returns the meta object for class '{@link CWM.Classification.Classification_container <em>Classification container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classification container</em>'.
	 * @see CWM.Classification.Classification_container
	 * @generated
	 */
	EClass getClassification_container();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Classification.Classification_container#getApplyTargetValueItem <em>Apply Target Value Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Apply Target Value Item</em>'.
	 * @see CWM.Classification.Classification_container#getApplyTargetValueItem()
	 * @see #getClassification_container()
	 * @generated
	 */
	EReference getClassification_container_ApplyTargetValueItem();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Classification.Classification_container#getClassificationAttributeUsage <em>Classification Attribute Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classification Attribute Usage</em>'.
	 * @see CWM.Classification.Classification_container#getClassificationAttributeUsage()
	 * @see #getClassification_container()
	 * @generated
	 */
	EReference getClassification_container_ClassificationAttributeUsage();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Classification.Classification_container#getClassificationFunctionSettings <em>Classification Function Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classification Function Settings</em>'.
	 * @see CWM.Classification.Classification_container#getClassificationFunctionSettings()
	 * @see #getClassification_container()
	 * @generated
	 */
	EReference getClassification_container_ClassificationFunctionSettings();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Classification.Classification_container#getClassificationTestResult <em>Classification Test Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classification Test Result</em>'.
	 * @see CWM.Classification.Classification_container#getClassificationTestResult()
	 * @see #getClassification_container()
	 * @generated
	 */
	EReference getClassification_container_ClassificationTestResult();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Classification.Classification_container#getClassificationTestTask <em>Classification Test Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classification Test Task</em>'.
	 * @see CWM.Classification.Classification_container#getClassificationTestTask()
	 * @see #getClassification_container()
	 * @generated
	 */
	EReference getClassification_container_ClassificationTestTask();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Classification.Classification_container#getPriorProbabilities <em>Prior Probabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prior Probabilities</em>'.
	 * @see CWM.Classification.Classification_container#getPriorProbabilities()
	 * @see #getClassification_container()
	 * @generated
	 */
	EReference getClassification_container_PriorProbabilities();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Classification.Classification_container#getPriorProbabilitiesEntry <em>Prior Probabilities Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prior Probabilities Entry</em>'.
	 * @see CWM.Classification.Classification_container#getPriorProbabilitiesEntry()
	 * @see #getClassification_container()
	 * @generated
	 */
	EReference getClassification_container_PriorProbabilitiesEntry();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ClassificationFactory getClassificationFactory();

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
		 * The meta object literal for the '{@link CWM.Classification.impl.ApplyTargetValueItemImpl <em>Apply Target Value Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Classification.impl.ApplyTargetValueItemImpl
		 * @see CWM.Classification.impl.ClassificationPackageImpl#getApplyTargetValueItem()
		 * @generated
		 */
		EClass APPLY_TARGET_VALUE_ITEM = eINSTANCE.getApplyTargetValueItem();

		/**
		 * The meta object literal for the '<em><b>Target Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLY_TARGET_VALUE_ITEM__TARGET_VALUE = eINSTANCE.getApplyTargetValueItem_TargetValue();

		/**
		 * The meta object literal for the '{@link CWM.Classification.impl.ClassificationAttributeUsageImpl <em>Attribute Usage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Classification.impl.ClassificationAttributeUsageImpl
		 * @see CWM.Classification.impl.ClassificationPackageImpl#getClassificationAttributeUsage()
		 * @generated
		 */
		EClass CLASSIFICATION_ATTRIBUTE_USAGE = eINSTANCE.getClassificationAttributeUsage();

		/**
		 * The meta object literal for the '<em><b>Positive Category</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFICATION_ATTRIBUTE_USAGE__POSITIVE_CATEGORY = eINSTANCE.getClassificationAttributeUsage_PositiveCategory();

		/**
		 * The meta object literal for the '<em><b>Priors</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFICATION_ATTRIBUTE_USAGE__PRIORS = eINSTANCE.getClassificationAttributeUsage_Priors();

		/**
		 * The meta object literal for the '{@link CWM.Classification.impl.ClassificationFunctionSettingsImpl <em>Function Settings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Classification.impl.ClassificationFunctionSettingsImpl
		 * @see CWM.Classification.impl.ClassificationPackageImpl#getClassificationFunctionSettings()
		 * @generated
		 */
		EClass CLASSIFICATION_FUNCTION_SETTINGS = eINSTANCE.getClassificationFunctionSettings();

		/**
		 * The meta object literal for the '<em><b>Cost Matrix</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFICATION_FUNCTION_SETTINGS__COST_MATRIX = eINSTANCE.getClassificationFunctionSettings_CostMatrix();

		/**
		 * The meta object literal for the '{@link CWM.Classification.impl.ClassificationTestResultImpl <em>Test Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Classification.impl.ClassificationTestResultImpl
		 * @see CWM.Classification.impl.ClassificationPackageImpl#getClassificationTestResult()
		 * @generated
		 */
		EClass CLASSIFICATION_TEST_RESULT = eINSTANCE.getClassificationTestResult();

		/**
		 * The meta object literal for the '<em><b>Confusion Matrix</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFICATION_TEST_RESULT__CONFUSION_MATRIX = eINSTANCE.getClassificationTestResult_ConfusionMatrix();

		/**
		 * The meta object literal for the '<em><b>Accuracy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFICATION_TEST_RESULT__ACCURACY = eINSTANCE.getClassificationTestResult_Accuracy();

		/**
		 * The meta object literal for the '{@link CWM.Classification.impl.ClassificationTestTaskImpl <em>Test Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Classification.impl.ClassificationTestTaskImpl
		 * @see CWM.Classification.impl.ClassificationPackageImpl#getClassificationTestTask()
		 * @generated
		 */
		EClass CLASSIFICATION_TEST_TASK = eINSTANCE.getClassificationTestTask();

		/**
		 * The meta object literal for the '<em><b>Test Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFICATION_TEST_TASK__TEST_RESULT = eINSTANCE.getClassificationTestTask_TestResult();

		/**
		 * The meta object literal for the '{@link CWM.Classification.impl.PriorProbabilitiesImpl <em>Prior Probabilities</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Classification.impl.PriorProbabilitiesImpl
		 * @see CWM.Classification.impl.ClassificationPackageImpl#getPriorProbabilities()
		 * @generated
		 */
		EClass PRIOR_PROBABILITIES = eINSTANCE.getPriorProbabilities();

		/**
		 * The meta object literal for the '<em><b>Prior</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIOR_PROBABILITIES__PRIOR = eINSTANCE.getPriorProbabilities_Prior();

		/**
		 * The meta object literal for the '{@link CWM.Classification.impl.PriorProbabilitiesEntryImpl <em>Prior Probabilities Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Classification.impl.PriorProbabilitiesEntryImpl
		 * @see CWM.Classification.impl.ClassificationPackageImpl#getPriorProbabilitiesEntry()
		 * @generated
		 */
		EClass PRIOR_PROBABILITIES_ENTRY = eINSTANCE.getPriorProbabilitiesEntry();

		/**
		 * The meta object literal for the '<em><b>Target Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIOR_PROBABILITIES_ENTRY__TARGET_VALUE = eINSTANCE.getPriorProbabilitiesEntry_TargetValue();

		/**
		 * The meta object literal for the '<em><b>Prior Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIOR_PROBABILITIES_ENTRY__PRIOR_PROBABILITY = eINSTANCE.getPriorProbabilitiesEntry_PriorProbability();

		/**
		 * The meta object literal for the '{@link CWM.Classification.impl.Classification_containerImpl <em>Classification container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Classification.impl.Classification_containerImpl
		 * @see CWM.Classification.impl.ClassificationPackageImpl#getClassification_container()
		 * @generated
		 */
		EClass CLASSIFICATION_CONTAINER = eINSTANCE.getClassification_container();

		/**
		 * The meta object literal for the '<em><b>Apply Target Value Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFICATION_CONTAINER__APPLY_TARGET_VALUE_ITEM = eINSTANCE.getClassification_container_ApplyTargetValueItem();

		/**
		 * The meta object literal for the '<em><b>Classification Attribute Usage</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFICATION_CONTAINER__CLASSIFICATION_ATTRIBUTE_USAGE = eINSTANCE.getClassification_container_ClassificationAttributeUsage();

		/**
		 * The meta object literal for the '<em><b>Classification Function Settings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFICATION_CONTAINER__CLASSIFICATION_FUNCTION_SETTINGS = eINSTANCE.getClassification_container_ClassificationFunctionSettings();

		/**
		 * The meta object literal for the '<em><b>Classification Test Result</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFICATION_CONTAINER__CLASSIFICATION_TEST_RESULT = eINSTANCE.getClassification_container_ClassificationTestResult();

		/**
		 * The meta object literal for the '<em><b>Classification Test Task</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFICATION_CONTAINER__CLASSIFICATION_TEST_TASK = eINSTANCE.getClassification_container_ClassificationTestTask();

		/**
		 * The meta object literal for the '<em><b>Prior Probabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFICATION_CONTAINER__PRIOR_PROBABILITIES = eINSTANCE.getClassification_container_PriorProbabilities();

		/**
		 * The meta object literal for the '<em><b>Prior Probabilities Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFICATION_CONTAINER__PRIOR_PROBABILITIES_ENTRY = eINSTANCE.getClassification_container_PriorProbabilitiesEntry();

	}

} //ClassificationPackage

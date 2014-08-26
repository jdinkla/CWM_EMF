/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Supervised;

import CWM.Core.CorePackage;

import CWM.MiningCore.MiningFunctionSettings.MiningFunctionSettingsPackage;

import CWM.MiningCore.MiningResult.MiningResultPackage;

import CWM.MiningCore.MiningTask.MiningTaskPackage;

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
 * @see CWM.Supervised.SupervisedFactory
 * @model kind="package"
 * @generated
 */
public interface SupervisedPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Supervised";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "Supervised";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Supervised";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SupervisedPackage eINSTANCE = CWM.Supervised.impl.SupervisedPackageImpl.init();

	/**
	 * The meta object id for the '{@link CWM.Supervised.impl.LiftAnalysisPointImpl <em>Lift Analysis Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Supervised.impl.LiftAnalysisPointImpl
	 * @see CWM.Supervised.impl.SupervisedPackageImpl#getLiftAnalysisPoint()
	 * @generated
	 */
	int LIFT_ANALYSIS_POINT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFT_ANALYSIS_POINT__NAME = CorePackage.MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFT_ANALYSIS_POINT__VISIBILITY = CorePackage.MODEL_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFT_ANALYSIS_POINT__CLIENT_DEPENDENCY = CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFT_ANALYSIS_POINT__CONSTRAINT = CorePackage.MODEL_ELEMENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFT_ANALYSIS_POINT__IMPORTER = CorePackage.MODEL_ELEMENT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFT_ANALYSIS_POINT__NAMESPACE = CorePackage.MODEL_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFT_ANALYSIS_POINT__TAGGED_VALUE = CorePackage.MODEL_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Subset Of Records</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFT_ANALYSIS_POINT__SUBSET_OF_RECORDS = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Aggregate Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFT_ANALYSIS_POINT__AGGREGATE_TARGET = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Lift Analysis Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFT_ANALYSIS_POINT_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link CWM.Supervised.impl.LiftAnalysisImpl <em>Lift Analysis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Supervised.impl.LiftAnalysisImpl
	 * @see CWM.Supervised.impl.SupervisedPackageImpl#getLiftAnalysis()
	 * @generated
	 */
	int LIFT_ANALYSIS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFT_ANALYSIS__NAME = CorePackage.MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFT_ANALYSIS__VISIBILITY = CorePackage.MODEL_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFT_ANALYSIS__CLIENT_DEPENDENCY = CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFT_ANALYSIS__CONSTRAINT = CorePackage.MODEL_ELEMENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFT_ANALYSIS__IMPORTER = CorePackage.MODEL_ELEMENT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFT_ANALYSIS__NAMESPACE = CorePackage.MODEL_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFT_ANALYSIS__TAGGED_VALUE = CorePackage.MODEL_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFT_ANALYSIS__POINT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFT_ANALYSIS__TARGET_ATTRIBUTE_NAME = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Positive Target Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFT_ANALYSIS__POSITIVE_TARGET_CATEGORY = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Lift Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFT_ANALYSIS_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link CWM.Supervised.impl.MiningTestTaskImpl <em>Mining Test Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Supervised.impl.MiningTestTaskImpl
	 * @see CWM.Supervised.impl.SupervisedPackageImpl#getMiningTestTask()
	 * @generated
	 */
	int MINING_TEST_TASK = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_TEST_TASK__NAME = MiningTaskPackage.MINING_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_TEST_TASK__VISIBILITY = MiningTaskPackage.MINING_TASK__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_TEST_TASK__CLIENT_DEPENDENCY = MiningTaskPackage.MINING_TASK__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_TEST_TASK__CONSTRAINT = MiningTaskPackage.MINING_TASK__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_TEST_TASK__IMPORTER = MiningTaskPackage.MINING_TASK__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_TEST_TASK__NAMESPACE = MiningTaskPackage.MINING_TASK__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_TEST_TASK__TAGGED_VALUE = MiningTaskPackage.MINING_TASK__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Input Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_TEST_TASK__INPUT_DATA = MiningTaskPackage.MINING_TASK__INPUT_DATA;

	/**
	 * The feature id for the '<em><b>Model Assignment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_TEST_TASK__MODEL_ASSIGNMENT = MiningTaskPackage.MINING_TASK__MODEL_ASSIGNMENT;

	/**
	 * The feature id for the '<em><b>Input Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_TEST_TASK__INPUT_MODEL = MiningTaskPackage.MINING_TASK__INPUT_MODEL;

	/**
	 * The feature id for the '<em><b>Compute Lift</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_TEST_TASK__COMPUTE_LIFT = MiningTaskPackage.MINING_TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Positive Target Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_TEST_TASK__POSITIVE_TARGET_CATEGORY = MiningTaskPackage.MINING_TASK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Mining Test Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_TEST_TASK_FEATURE_COUNT = MiningTaskPackage.MINING_TASK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link CWM.Supervised.impl.SupervisedFunctionSettingsImpl <em>Function Settings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Supervised.impl.SupervisedFunctionSettingsImpl
	 * @see CWM.Supervised.impl.SupervisedPackageImpl#getSupervisedFunctionSettings()
	 * @generated
	 */
	int SUPERVISED_FUNCTION_SETTINGS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERVISED_FUNCTION_SETTINGS__NAME = MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERVISED_FUNCTION_SETTINGS__VISIBILITY = MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERVISED_FUNCTION_SETTINGS__CLIENT_DEPENDENCY = MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERVISED_FUNCTION_SETTINGS__CONSTRAINT = MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERVISED_FUNCTION_SETTINGS__IMPORTER = MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERVISED_FUNCTION_SETTINGS__NAMESPACE = MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERVISED_FUNCTION_SETTINGS__TAGGED_VALUE = MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Algorithm Settings</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERVISED_FUNCTION_SETTINGS__ALGORITHM_SETTINGS = MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS__ALGORITHM_SETTINGS;

	/**
	 * The feature id for the '<em><b>Desired Execution Time In Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERVISED_FUNCTION_SETTINGS__DESIRED_EXECUTION_TIME_IN_MINUTES = MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS__DESIRED_EXECUTION_TIME_IN_MINUTES;

	/**
	 * The feature id for the '<em><b>Attribute Usage Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERVISED_FUNCTION_SETTINGS__ATTRIBUTE_USAGE_SET = MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS__ATTRIBUTE_USAGE_SET;

	/**
	 * The feature id for the '<em><b>Logical Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERVISED_FUNCTION_SETTINGS__LOGICAL_DATA = MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS__LOGICAL_DATA;

	/**
	 * The number of structural features of the '<em>Function Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERVISED_FUNCTION_SETTINGS_FEATURE_COUNT = MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CWM.Supervised.impl.MiningTestResultImpl <em>Mining Test Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Supervised.impl.MiningTestResultImpl
	 * @see CWM.Supervised.impl.SupervisedPackageImpl#getMiningTestResult()
	 * @generated
	 */
	int MINING_TEST_RESULT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_TEST_RESULT__NAME = MiningResultPackage.MINING_RESULT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_TEST_RESULT__VISIBILITY = MiningResultPackage.MINING_RESULT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_TEST_RESULT__CLIENT_DEPENDENCY = MiningResultPackage.MINING_RESULT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_TEST_RESULT__CONSTRAINT = MiningResultPackage.MINING_RESULT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_TEST_RESULT__IMPORTER = MiningResultPackage.MINING_RESULT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_TEST_RESULT__NAMESPACE = MiningResultPackage.MINING_RESULT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_TEST_RESULT__TAGGED_VALUE = MiningResultPackage.MINING_RESULT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Number Of Test Records</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_TEST_RESULT__NUMBER_OF_TEST_RECORDS = MiningResultPackage.MINING_RESULT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lift Analysis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_TEST_RESULT__LIFT_ANALYSIS = MiningResultPackage.MINING_RESULT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Mining Test Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_TEST_RESULT_FEATURE_COUNT = MiningResultPackage.MINING_RESULT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link CWM.Supervised.impl.Supervised_containerImpl <em>Supervised container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Supervised.impl.Supervised_containerImpl
	 * @see CWM.Supervised.impl.SupervisedPackageImpl#getSupervised_container()
	 * @generated
	 */
	int SUPERVISED_CONTAINER = 5;

	/**
	 * The feature id for the '<em><b>Lift Analysis Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERVISED_CONTAINER__LIFT_ANALYSIS_POINT = 0;

	/**
	 * The feature id for the '<em><b>Lift Analysis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERVISED_CONTAINER__LIFT_ANALYSIS = 1;

	/**
	 * The feature id for the '<em><b>Mining Test Task</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERVISED_CONTAINER__MINING_TEST_TASK = 2;

	/**
	 * The feature id for the '<em><b>Supervised Function Settings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERVISED_CONTAINER__SUPERVISED_FUNCTION_SETTINGS = 3;

	/**
	 * The feature id for the '<em><b>Mining Test Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERVISED_CONTAINER__MINING_TEST_RESULT = 4;

	/**
	 * The number of structural features of the '<em>Supervised container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERVISED_CONTAINER_FEATURE_COUNT = 5;


	/**
	 * Returns the meta object for class '{@link CWM.Supervised.LiftAnalysisPoint <em>Lift Analysis Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lift Analysis Point</em>'.
	 * @see CWM.Supervised.LiftAnalysisPoint
	 * @generated
	 */
	EClass getLiftAnalysisPoint();

	/**
	 * Returns the meta object for the attribute '{@link CWM.Supervised.LiftAnalysisPoint#getSubsetOfRecords <em>Subset Of Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subset Of Records</em>'.
	 * @see CWM.Supervised.LiftAnalysisPoint#getSubsetOfRecords()
	 * @see #getLiftAnalysisPoint()
	 * @generated
	 */
	EAttribute getLiftAnalysisPoint_SubsetOfRecords();

	/**
	 * Returns the meta object for the attribute '{@link CWM.Supervised.LiftAnalysisPoint#getAggregateTarget <em>Aggregate Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aggregate Target</em>'.
	 * @see CWM.Supervised.LiftAnalysisPoint#getAggregateTarget()
	 * @see #getLiftAnalysisPoint()
	 * @generated
	 */
	EAttribute getLiftAnalysisPoint_AggregateTarget();

	/**
	 * Returns the meta object for class '{@link CWM.Supervised.LiftAnalysis <em>Lift Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lift Analysis</em>'.
	 * @see CWM.Supervised.LiftAnalysis
	 * @generated
	 */
	EClass getLiftAnalysis();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Supervised.LiftAnalysis#getPoint <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Point</em>'.
	 * @see CWM.Supervised.LiftAnalysis#getPoint()
	 * @see #getLiftAnalysis()
	 * @generated
	 */
	EReference getLiftAnalysis_Point();

	/**
	 * Returns the meta object for the attribute '{@link CWM.Supervised.LiftAnalysis#getTargetAttributeName <em>Target Attribute Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Attribute Name</em>'.
	 * @see CWM.Supervised.LiftAnalysis#getTargetAttributeName()
	 * @see #getLiftAnalysis()
	 * @generated
	 */
	EAttribute getLiftAnalysis_TargetAttributeName();

	/**
	 * Returns the meta object for the reference list '{@link CWM.Supervised.LiftAnalysis#getPositiveTargetCategory <em>Positive Target Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Positive Target Category</em>'.
	 * @see CWM.Supervised.LiftAnalysis#getPositiveTargetCategory()
	 * @see #getLiftAnalysis()
	 * @generated
	 */
	EReference getLiftAnalysis_PositiveTargetCategory();

	/**
	 * Returns the meta object for class '{@link CWM.Supervised.MiningTestTask <em>Mining Test Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mining Test Task</em>'.
	 * @see CWM.Supervised.MiningTestTask
	 * @generated
	 */
	EClass getMiningTestTask();

	/**
	 * Returns the meta object for the attribute '{@link CWM.Supervised.MiningTestTask#getComputeLift <em>Compute Lift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compute Lift</em>'.
	 * @see CWM.Supervised.MiningTestTask#getComputeLift()
	 * @see #getMiningTestTask()
	 * @generated
	 */
	EAttribute getMiningTestTask_ComputeLift();

	/**
	 * Returns the meta object for the reference list '{@link CWM.Supervised.MiningTestTask#getPositiveTargetCategory <em>Positive Target Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Positive Target Category</em>'.
	 * @see CWM.Supervised.MiningTestTask#getPositiveTargetCategory()
	 * @see #getMiningTestTask()
	 * @generated
	 */
	EReference getMiningTestTask_PositiveTargetCategory();

	/**
	 * Returns the meta object for class '{@link CWM.Supervised.SupervisedFunctionSettings <em>Function Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Settings</em>'.
	 * @see CWM.Supervised.SupervisedFunctionSettings
	 * @generated
	 */
	EClass getSupervisedFunctionSettings();

	/**
	 * Returns the meta object for class '{@link CWM.Supervised.MiningTestResult <em>Mining Test Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mining Test Result</em>'.
	 * @see CWM.Supervised.MiningTestResult
	 * @generated
	 */
	EClass getMiningTestResult();

	/**
	 * Returns the meta object for the attribute '{@link CWM.Supervised.MiningTestResult#getNumberOfTestRecords <em>Number Of Test Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Test Records</em>'.
	 * @see CWM.Supervised.MiningTestResult#getNumberOfTestRecords()
	 * @see #getMiningTestResult()
	 * @generated
	 */
	EAttribute getMiningTestResult_NumberOfTestRecords();

	/**
	 * Returns the meta object for the containment reference '{@link CWM.Supervised.MiningTestResult#getLiftAnalysis <em>Lift Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lift Analysis</em>'.
	 * @see CWM.Supervised.MiningTestResult#getLiftAnalysis()
	 * @see #getMiningTestResult()
	 * @generated
	 */
	EReference getMiningTestResult_LiftAnalysis();

	/**
	 * Returns the meta object for class '{@link CWM.Supervised.Supervised_container <em>Supervised container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supervised container</em>'.
	 * @see CWM.Supervised.Supervised_container
	 * @generated
	 */
	EClass getSupervised_container();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Supervised.Supervised_container#getLiftAnalysisPoint <em>Lift Analysis Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lift Analysis Point</em>'.
	 * @see CWM.Supervised.Supervised_container#getLiftAnalysisPoint()
	 * @see #getSupervised_container()
	 * @generated
	 */
	EReference getSupervised_container_LiftAnalysisPoint();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Supervised.Supervised_container#getLiftAnalysis <em>Lift Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lift Analysis</em>'.
	 * @see CWM.Supervised.Supervised_container#getLiftAnalysis()
	 * @see #getSupervised_container()
	 * @generated
	 */
	EReference getSupervised_container_LiftAnalysis();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Supervised.Supervised_container#getMiningTestTask <em>Mining Test Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mining Test Task</em>'.
	 * @see CWM.Supervised.Supervised_container#getMiningTestTask()
	 * @see #getSupervised_container()
	 * @generated
	 */
	EReference getSupervised_container_MiningTestTask();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Supervised.Supervised_container#getSupervisedFunctionSettings <em>Supervised Function Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Supervised Function Settings</em>'.
	 * @see CWM.Supervised.Supervised_container#getSupervisedFunctionSettings()
	 * @see #getSupervised_container()
	 * @generated
	 */
	EReference getSupervised_container_SupervisedFunctionSettings();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Supervised.Supervised_container#getMiningTestResult <em>Mining Test Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mining Test Result</em>'.
	 * @see CWM.Supervised.Supervised_container#getMiningTestResult()
	 * @see #getSupervised_container()
	 * @generated
	 */
	EReference getSupervised_container_MiningTestResult();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SupervisedFactory getSupervisedFactory();

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
		 * The meta object literal for the '{@link CWM.Supervised.impl.LiftAnalysisPointImpl <em>Lift Analysis Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Supervised.impl.LiftAnalysisPointImpl
		 * @see CWM.Supervised.impl.SupervisedPackageImpl#getLiftAnalysisPoint()
		 * @generated
		 */
		EClass LIFT_ANALYSIS_POINT = eINSTANCE.getLiftAnalysisPoint();

		/**
		 * The meta object literal for the '<em><b>Subset Of Records</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIFT_ANALYSIS_POINT__SUBSET_OF_RECORDS = eINSTANCE.getLiftAnalysisPoint_SubsetOfRecords();

		/**
		 * The meta object literal for the '<em><b>Aggregate Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIFT_ANALYSIS_POINT__AGGREGATE_TARGET = eINSTANCE.getLiftAnalysisPoint_AggregateTarget();

		/**
		 * The meta object literal for the '{@link CWM.Supervised.impl.LiftAnalysisImpl <em>Lift Analysis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Supervised.impl.LiftAnalysisImpl
		 * @see CWM.Supervised.impl.SupervisedPackageImpl#getLiftAnalysis()
		 * @generated
		 */
		EClass LIFT_ANALYSIS = eINSTANCE.getLiftAnalysis();

		/**
		 * The meta object literal for the '<em><b>Point</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIFT_ANALYSIS__POINT = eINSTANCE.getLiftAnalysis_Point();

		/**
		 * The meta object literal for the '<em><b>Target Attribute Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIFT_ANALYSIS__TARGET_ATTRIBUTE_NAME = eINSTANCE.getLiftAnalysis_TargetAttributeName();

		/**
		 * The meta object literal for the '<em><b>Positive Target Category</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIFT_ANALYSIS__POSITIVE_TARGET_CATEGORY = eINSTANCE.getLiftAnalysis_PositiveTargetCategory();

		/**
		 * The meta object literal for the '{@link CWM.Supervised.impl.MiningTestTaskImpl <em>Mining Test Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Supervised.impl.MiningTestTaskImpl
		 * @see CWM.Supervised.impl.SupervisedPackageImpl#getMiningTestTask()
		 * @generated
		 */
		EClass MINING_TEST_TASK = eINSTANCE.getMiningTestTask();

		/**
		 * The meta object literal for the '<em><b>Compute Lift</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MINING_TEST_TASK__COMPUTE_LIFT = eINSTANCE.getMiningTestTask_ComputeLift();

		/**
		 * The meta object literal for the '<em><b>Positive Target Category</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINING_TEST_TASK__POSITIVE_TARGET_CATEGORY = eINSTANCE.getMiningTestTask_PositiveTargetCategory();

		/**
		 * The meta object literal for the '{@link CWM.Supervised.impl.SupervisedFunctionSettingsImpl <em>Function Settings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Supervised.impl.SupervisedFunctionSettingsImpl
		 * @see CWM.Supervised.impl.SupervisedPackageImpl#getSupervisedFunctionSettings()
		 * @generated
		 */
		EClass SUPERVISED_FUNCTION_SETTINGS = eINSTANCE.getSupervisedFunctionSettings();

		/**
		 * The meta object literal for the '{@link CWM.Supervised.impl.MiningTestResultImpl <em>Mining Test Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Supervised.impl.MiningTestResultImpl
		 * @see CWM.Supervised.impl.SupervisedPackageImpl#getMiningTestResult()
		 * @generated
		 */
		EClass MINING_TEST_RESULT = eINSTANCE.getMiningTestResult();

		/**
		 * The meta object literal for the '<em><b>Number Of Test Records</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MINING_TEST_RESULT__NUMBER_OF_TEST_RECORDS = eINSTANCE.getMiningTestResult_NumberOfTestRecords();

		/**
		 * The meta object literal for the '<em><b>Lift Analysis</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINING_TEST_RESULT__LIFT_ANALYSIS = eINSTANCE.getMiningTestResult_LiftAnalysis();

		/**
		 * The meta object literal for the '{@link CWM.Supervised.impl.Supervised_containerImpl <em>Supervised container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Supervised.impl.Supervised_containerImpl
		 * @see CWM.Supervised.impl.SupervisedPackageImpl#getSupervised_container()
		 * @generated
		 */
		EClass SUPERVISED_CONTAINER = eINSTANCE.getSupervised_container();

		/**
		 * The meta object literal for the '<em><b>Lift Analysis Point</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPERVISED_CONTAINER__LIFT_ANALYSIS_POINT = eINSTANCE.getSupervised_container_LiftAnalysisPoint();

		/**
		 * The meta object literal for the '<em><b>Lift Analysis</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPERVISED_CONTAINER__LIFT_ANALYSIS = eINSTANCE.getSupervised_container_LiftAnalysis();

		/**
		 * The meta object literal for the '<em><b>Mining Test Task</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPERVISED_CONTAINER__MINING_TEST_TASK = eINSTANCE.getSupervised_container_MiningTestTask();

		/**
		 * The meta object literal for the '<em><b>Supervised Function Settings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPERVISED_CONTAINER__SUPERVISED_FUNCTION_SETTINGS = eINSTANCE.getSupervised_container_SupervisedFunctionSettings();

		/**
		 * The meta object literal for the '<em><b>Mining Test Result</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPERVISED_CONTAINER__MINING_TEST_RESULT = eINSTANCE.getSupervised_container_MiningTestResult();

	}

} //SupervisedPackage

/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Approximation;

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
 * @see CWM.Approximation.ApproximationFactory
 * @model kind="package"
 * @generated
 */
public interface ApproximationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Approximation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "Approximation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Approximation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApproximationPackage eINSTANCE = CWM.Approximation.impl.ApproximationPackageImpl.init();

	/**
	 * The meta object id for the '{@link CWM.Approximation.impl.ApproximationFunctionSettingsImpl <em>Function Settings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Approximation.impl.ApproximationFunctionSettingsImpl
	 * @see CWM.Approximation.impl.ApproximationPackageImpl#getApproximationFunctionSettings()
	 * @generated
	 */
	int APPROXIMATION_FUNCTION_SETTINGS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROXIMATION_FUNCTION_SETTINGS__NAME = SupervisedPackage.SUPERVISED_FUNCTION_SETTINGS__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROXIMATION_FUNCTION_SETTINGS__VISIBILITY = SupervisedPackage.SUPERVISED_FUNCTION_SETTINGS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROXIMATION_FUNCTION_SETTINGS__CLIENT_DEPENDENCY = SupervisedPackage.SUPERVISED_FUNCTION_SETTINGS__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROXIMATION_FUNCTION_SETTINGS__CONSTRAINT = SupervisedPackage.SUPERVISED_FUNCTION_SETTINGS__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROXIMATION_FUNCTION_SETTINGS__IMPORTER = SupervisedPackage.SUPERVISED_FUNCTION_SETTINGS__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROXIMATION_FUNCTION_SETTINGS__NAMESPACE = SupervisedPackage.SUPERVISED_FUNCTION_SETTINGS__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROXIMATION_FUNCTION_SETTINGS__TAGGED_VALUE = SupervisedPackage.SUPERVISED_FUNCTION_SETTINGS__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Algorithm Settings</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROXIMATION_FUNCTION_SETTINGS__ALGORITHM_SETTINGS = SupervisedPackage.SUPERVISED_FUNCTION_SETTINGS__ALGORITHM_SETTINGS;

	/**
	 * The feature id for the '<em><b>Desired Execution Time In Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROXIMATION_FUNCTION_SETTINGS__DESIRED_EXECUTION_TIME_IN_MINUTES = SupervisedPackage.SUPERVISED_FUNCTION_SETTINGS__DESIRED_EXECUTION_TIME_IN_MINUTES;

	/**
	 * The feature id for the '<em><b>Attribute Usage Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROXIMATION_FUNCTION_SETTINGS__ATTRIBUTE_USAGE_SET = SupervisedPackage.SUPERVISED_FUNCTION_SETTINGS__ATTRIBUTE_USAGE_SET;

	/**
	 * The feature id for the '<em><b>Logical Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROXIMATION_FUNCTION_SETTINGS__LOGICAL_DATA = SupervisedPackage.SUPERVISED_FUNCTION_SETTINGS__LOGICAL_DATA;

	/**
	 * The feature id for the '<em><b>Tolerated Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROXIMATION_FUNCTION_SETTINGS__TOLERATED_ERROR = SupervisedPackage.SUPERVISED_FUNCTION_SETTINGS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Function Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROXIMATION_FUNCTION_SETTINGS_FEATURE_COUNT = SupervisedPackage.SUPERVISED_FUNCTION_SETTINGS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CWM.Approximation.impl.ApproximationTestResultImpl <em>Test Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Approximation.impl.ApproximationTestResultImpl
	 * @see CWM.Approximation.impl.ApproximationPackageImpl#getApproximationTestResult()
	 * @generated
	 */
	int APPROXIMATION_TEST_RESULT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROXIMATION_TEST_RESULT__NAME = SupervisedPackage.MINING_TEST_RESULT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROXIMATION_TEST_RESULT__VISIBILITY = SupervisedPackage.MINING_TEST_RESULT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROXIMATION_TEST_RESULT__CLIENT_DEPENDENCY = SupervisedPackage.MINING_TEST_RESULT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROXIMATION_TEST_RESULT__CONSTRAINT = SupervisedPackage.MINING_TEST_RESULT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROXIMATION_TEST_RESULT__IMPORTER = SupervisedPackage.MINING_TEST_RESULT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROXIMATION_TEST_RESULT__NAMESPACE = SupervisedPackage.MINING_TEST_RESULT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROXIMATION_TEST_RESULT__TAGGED_VALUE = SupervisedPackage.MINING_TEST_RESULT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Number Of Test Records</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROXIMATION_TEST_RESULT__NUMBER_OF_TEST_RECORDS = SupervisedPackage.MINING_TEST_RESULT__NUMBER_OF_TEST_RECORDS;

	/**
	 * The feature id for the '<em><b>Lift Analysis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROXIMATION_TEST_RESULT__LIFT_ANALYSIS = SupervisedPackage.MINING_TEST_RESULT__LIFT_ANALYSIS;

	/**
	 * The feature id for the '<em><b>Mean Predicted Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROXIMATION_TEST_RESULT__MEAN_PREDICTED_VALUE = SupervisedPackage.MINING_TEST_RESULT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mean Actual Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROXIMATION_TEST_RESULT__MEAN_ACTUAL_VALUE = SupervisedPackage.MINING_TEST_RESULT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mean Absolute Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROXIMATION_TEST_RESULT__MEAN_ABSOLUTE_ERROR = SupervisedPackage.MINING_TEST_RESULT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rms Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROXIMATION_TEST_RESULT__RMS_ERROR = SupervisedPackage.MINING_TEST_RESULT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>RSquared</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROXIMATION_TEST_RESULT__RSQUARED = SupervisedPackage.MINING_TEST_RESULT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Test Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROXIMATION_TEST_RESULT_FEATURE_COUNT = SupervisedPackage.MINING_TEST_RESULT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link CWM.Approximation.impl.ApproximationTestTaskImpl <em>Test Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Approximation.impl.ApproximationTestTaskImpl
	 * @see CWM.Approximation.impl.ApproximationPackageImpl#getApproximationTestTask()
	 * @generated
	 */
	int APPROXIMATION_TEST_TASK = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROXIMATION_TEST_TASK__NAME = SupervisedPackage.MINING_TEST_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROXIMATION_TEST_TASK__VISIBILITY = SupervisedPackage.MINING_TEST_TASK__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROXIMATION_TEST_TASK__CLIENT_DEPENDENCY = SupervisedPackage.MINING_TEST_TASK__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROXIMATION_TEST_TASK__CONSTRAINT = SupervisedPackage.MINING_TEST_TASK__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROXIMATION_TEST_TASK__IMPORTER = SupervisedPackage.MINING_TEST_TASK__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROXIMATION_TEST_TASK__NAMESPACE = SupervisedPackage.MINING_TEST_TASK__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROXIMATION_TEST_TASK__TAGGED_VALUE = SupervisedPackage.MINING_TEST_TASK__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Input Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROXIMATION_TEST_TASK__INPUT_DATA = SupervisedPackage.MINING_TEST_TASK__INPUT_DATA;

	/**
	 * The feature id for the '<em><b>Model Assignment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROXIMATION_TEST_TASK__MODEL_ASSIGNMENT = SupervisedPackage.MINING_TEST_TASK__MODEL_ASSIGNMENT;

	/**
	 * The feature id for the '<em><b>Input Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROXIMATION_TEST_TASK__INPUT_MODEL = SupervisedPackage.MINING_TEST_TASK__INPUT_MODEL;

	/**
	 * The feature id for the '<em><b>Compute Lift</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROXIMATION_TEST_TASK__COMPUTE_LIFT = SupervisedPackage.MINING_TEST_TASK__COMPUTE_LIFT;

	/**
	 * The feature id for the '<em><b>Positive Target Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROXIMATION_TEST_TASK__POSITIVE_TARGET_CATEGORY = SupervisedPackage.MINING_TEST_TASK__POSITIVE_TARGET_CATEGORY;

	/**
	 * The feature id for the '<em><b>Test Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROXIMATION_TEST_TASK__TEST_RESULT = SupervisedPackage.MINING_TEST_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Test Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROXIMATION_TEST_TASK_FEATURE_COUNT = SupervisedPackage.MINING_TEST_TASK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CWM.Approximation.impl.Approximation_containerImpl <em>Approximation container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Approximation.impl.Approximation_containerImpl
	 * @see CWM.Approximation.impl.ApproximationPackageImpl#getApproximation_container()
	 * @generated
	 */
	int APPROXIMATION_CONTAINER = 3;

	/**
	 * The feature id for the '<em><b>Approximation Function Settings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROXIMATION_CONTAINER__APPROXIMATION_FUNCTION_SETTINGS = 0;

	/**
	 * The feature id for the '<em><b>Approximation Test Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROXIMATION_CONTAINER__APPROXIMATION_TEST_RESULT = 1;

	/**
	 * The feature id for the '<em><b>Approximation Test Task</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROXIMATION_CONTAINER__APPROXIMATION_TEST_TASK = 2;

	/**
	 * The number of structural features of the '<em>Approximation container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROXIMATION_CONTAINER_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link CWM.Approximation.ApproximationFunctionSettings <em>Function Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Settings</em>'.
	 * @see CWM.Approximation.ApproximationFunctionSettings
	 * @generated
	 */
	EClass getApproximationFunctionSettings();

	/**
	 * Returns the meta object for the attribute '{@link CWM.Approximation.ApproximationFunctionSettings#getToleratedError <em>Tolerated Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tolerated Error</em>'.
	 * @see CWM.Approximation.ApproximationFunctionSettings#getToleratedError()
	 * @see #getApproximationFunctionSettings()
	 * @generated
	 */
	EAttribute getApproximationFunctionSettings_ToleratedError();

	/**
	 * Returns the meta object for class '{@link CWM.Approximation.ApproximationTestResult <em>Test Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Result</em>'.
	 * @see CWM.Approximation.ApproximationTestResult
	 * @generated
	 */
	EClass getApproximationTestResult();

	/**
	 * Returns the meta object for the attribute '{@link CWM.Approximation.ApproximationTestResult#getMeanPredictedValue <em>Mean Predicted Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mean Predicted Value</em>'.
	 * @see CWM.Approximation.ApproximationTestResult#getMeanPredictedValue()
	 * @see #getApproximationTestResult()
	 * @generated
	 */
	EAttribute getApproximationTestResult_MeanPredictedValue();

	/**
	 * Returns the meta object for the attribute '{@link CWM.Approximation.ApproximationTestResult#getMeanActualValue <em>Mean Actual Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mean Actual Value</em>'.
	 * @see CWM.Approximation.ApproximationTestResult#getMeanActualValue()
	 * @see #getApproximationTestResult()
	 * @generated
	 */
	EAttribute getApproximationTestResult_MeanActualValue();

	/**
	 * Returns the meta object for the attribute '{@link CWM.Approximation.ApproximationTestResult#getMeanAbsoluteError <em>Mean Absolute Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mean Absolute Error</em>'.
	 * @see CWM.Approximation.ApproximationTestResult#getMeanAbsoluteError()
	 * @see #getApproximationTestResult()
	 * @generated
	 */
	EAttribute getApproximationTestResult_MeanAbsoluteError();

	/**
	 * Returns the meta object for the attribute '{@link CWM.Approximation.ApproximationTestResult#getRmsError <em>Rms Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rms Error</em>'.
	 * @see CWM.Approximation.ApproximationTestResult#getRmsError()
	 * @see #getApproximationTestResult()
	 * @generated
	 */
	EAttribute getApproximationTestResult_RmsError();

	/**
	 * Returns the meta object for the attribute '{@link CWM.Approximation.ApproximationTestResult#getRSquared <em>RSquared</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>RSquared</em>'.
	 * @see CWM.Approximation.ApproximationTestResult#getRSquared()
	 * @see #getApproximationTestResult()
	 * @generated
	 */
	EAttribute getApproximationTestResult_RSquared();

	/**
	 * Returns the meta object for class '{@link CWM.Approximation.ApproximationTestTask <em>Test Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Task</em>'.
	 * @see CWM.Approximation.ApproximationTestTask
	 * @generated
	 */
	EClass getApproximationTestTask();

	/**
	 * Returns the meta object for the containment reference '{@link CWM.Approximation.ApproximationTestTask#getTestResult <em>Test Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Test Result</em>'.
	 * @see CWM.Approximation.ApproximationTestTask#getTestResult()
	 * @see #getApproximationTestTask()
	 * @generated
	 */
	EReference getApproximationTestTask_TestResult();

	/**
	 * Returns the meta object for class '{@link CWM.Approximation.Approximation_container <em>Approximation container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Approximation container</em>'.
	 * @see CWM.Approximation.Approximation_container
	 * @generated
	 */
	EClass getApproximation_container();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Approximation.Approximation_container#getApproximationFunctionSettings <em>Approximation Function Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Approximation Function Settings</em>'.
	 * @see CWM.Approximation.Approximation_container#getApproximationFunctionSettings()
	 * @see #getApproximation_container()
	 * @generated
	 */
	EReference getApproximation_container_ApproximationFunctionSettings();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Approximation.Approximation_container#getApproximationTestResult <em>Approximation Test Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Approximation Test Result</em>'.
	 * @see CWM.Approximation.Approximation_container#getApproximationTestResult()
	 * @see #getApproximation_container()
	 * @generated
	 */
	EReference getApproximation_container_ApproximationTestResult();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Approximation.Approximation_container#getApproximationTestTask <em>Approximation Test Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Approximation Test Task</em>'.
	 * @see CWM.Approximation.Approximation_container#getApproximationTestTask()
	 * @see #getApproximation_container()
	 * @generated
	 */
	EReference getApproximation_container_ApproximationTestTask();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApproximationFactory getApproximationFactory();

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
		 * The meta object literal for the '{@link CWM.Approximation.impl.ApproximationFunctionSettingsImpl <em>Function Settings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Approximation.impl.ApproximationFunctionSettingsImpl
		 * @see CWM.Approximation.impl.ApproximationPackageImpl#getApproximationFunctionSettings()
		 * @generated
		 */
		EClass APPROXIMATION_FUNCTION_SETTINGS = eINSTANCE.getApproximationFunctionSettings();

		/**
		 * The meta object literal for the '<em><b>Tolerated Error</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPROXIMATION_FUNCTION_SETTINGS__TOLERATED_ERROR = eINSTANCE.getApproximationFunctionSettings_ToleratedError();

		/**
		 * The meta object literal for the '{@link CWM.Approximation.impl.ApproximationTestResultImpl <em>Test Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Approximation.impl.ApproximationTestResultImpl
		 * @see CWM.Approximation.impl.ApproximationPackageImpl#getApproximationTestResult()
		 * @generated
		 */
		EClass APPROXIMATION_TEST_RESULT = eINSTANCE.getApproximationTestResult();

		/**
		 * The meta object literal for the '<em><b>Mean Predicted Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPROXIMATION_TEST_RESULT__MEAN_PREDICTED_VALUE = eINSTANCE.getApproximationTestResult_MeanPredictedValue();

		/**
		 * The meta object literal for the '<em><b>Mean Actual Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPROXIMATION_TEST_RESULT__MEAN_ACTUAL_VALUE = eINSTANCE.getApproximationTestResult_MeanActualValue();

		/**
		 * The meta object literal for the '<em><b>Mean Absolute Error</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPROXIMATION_TEST_RESULT__MEAN_ABSOLUTE_ERROR = eINSTANCE.getApproximationTestResult_MeanAbsoluteError();

		/**
		 * The meta object literal for the '<em><b>Rms Error</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPROXIMATION_TEST_RESULT__RMS_ERROR = eINSTANCE.getApproximationTestResult_RmsError();

		/**
		 * The meta object literal for the '<em><b>RSquared</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPROXIMATION_TEST_RESULT__RSQUARED = eINSTANCE.getApproximationTestResult_RSquared();

		/**
		 * The meta object literal for the '{@link CWM.Approximation.impl.ApproximationTestTaskImpl <em>Test Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Approximation.impl.ApproximationTestTaskImpl
		 * @see CWM.Approximation.impl.ApproximationPackageImpl#getApproximationTestTask()
		 * @generated
		 */
		EClass APPROXIMATION_TEST_TASK = eINSTANCE.getApproximationTestTask();

		/**
		 * The meta object literal for the '<em><b>Test Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPROXIMATION_TEST_TASK__TEST_RESULT = eINSTANCE.getApproximationTestTask_TestResult();

		/**
		 * The meta object literal for the '{@link CWM.Approximation.impl.Approximation_containerImpl <em>Approximation container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Approximation.impl.Approximation_containerImpl
		 * @see CWM.Approximation.impl.ApproximationPackageImpl#getApproximation_container()
		 * @generated
		 */
		EClass APPROXIMATION_CONTAINER = eINSTANCE.getApproximation_container();

		/**
		 * The meta object literal for the '<em><b>Approximation Function Settings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPROXIMATION_CONTAINER__APPROXIMATION_FUNCTION_SETTINGS = eINSTANCE.getApproximation_container_ApproximationFunctionSettings();

		/**
		 * The meta object literal for the '<em><b>Approximation Test Result</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPROXIMATION_CONTAINER__APPROXIMATION_TEST_RESULT = eINSTANCE.getApproximation_container_ApproximationTestResult();

		/**
		 * The meta object literal for the '<em><b>Approximation Test Task</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPROXIMATION_CONTAINER__APPROXIMATION_TEST_TASK = eINSTANCE.getApproximation_container_ApproximationTestTask();

	}

} //ApproximationPackage

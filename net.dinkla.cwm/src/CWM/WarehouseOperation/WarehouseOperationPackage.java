/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.WarehouseOperation;

import CWM.Core.CorePackage;

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
 * @see CWM.WarehouseOperation.WarehouseOperationFactory
 * @model kind="package"
 * @generated
 */
public interface WarehouseOperationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "WarehouseOperation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "WarehouseOperation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "WarehouseOperation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WarehouseOperationPackage eINSTANCE = CWM.WarehouseOperation.impl.WarehouseOperationPackageImpl.init();

	/**
	 * The meta object id for the '{@link CWM.WarehouseOperation.impl.MeasurementImpl <em>Measurement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.WarehouseOperation.impl.MeasurementImpl
	 * @see CWM.WarehouseOperation.impl.WarehouseOperationPackageImpl#getMeasurement()
	 * @generated
	 */
	int MEASUREMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__NAME = CorePackage.MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__VISIBILITY = CorePackage.MODEL_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__CLIENT_DEPENDENCY = CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__CONSTRAINT = CorePackage.MODEL_ELEMENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__IMPORTER = CorePackage.MODEL_ELEMENT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__NAMESPACE = CorePackage.MODEL_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__TAGGED_VALUE = CorePackage.MODEL_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__VALUE = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__UNIT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__TYPE = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__CREATION_DATE = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Effective Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__EFFECTIVE_DATE = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__MODEL_ELEMENT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link CWM.WarehouseOperation.impl.ChangeRequestImpl <em>Change Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.WarehouseOperation.impl.ChangeRequestImpl
	 * @see CWM.WarehouseOperation.impl.WarehouseOperationPackageImpl#getChangeRequest()
	 * @generated
	 */
	int CHANGE_REQUEST = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_REQUEST__NAME = CorePackage.MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_REQUEST__VISIBILITY = CorePackage.MODEL_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_REQUEST__CLIENT_DEPENDENCY = CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_REQUEST__CONSTRAINT = CorePackage.MODEL_ELEMENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_REQUEST__IMPORTER = CorePackage.MODEL_ELEMENT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_REQUEST__NAMESPACE = CorePackage.MODEL_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_REQUEST__TAGGED_VALUE = CorePackage.MODEL_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_REQUEST__CHANGE_DESCRIPTION = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Change Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_REQUEST__CHANGE_REASON = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_REQUEST__STATUS = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Completed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_REQUEST__COMPLETED = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Request Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_REQUEST__REQUEST_DATE = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Completion Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_REQUEST__COMPLETION_DATE = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_REQUEST__MODEL_ELEMENT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Change Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_REQUEST_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link CWM.WarehouseOperation.impl.TransformationExecutionImpl <em>Transformation Execution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.WarehouseOperation.impl.TransformationExecutionImpl
	 * @see CWM.WarehouseOperation.impl.WarehouseOperationPackageImpl#getTransformationExecution()
	 * @generated
	 */
	int TRANSFORMATION_EXECUTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_EXECUTION__NAME = CorePackage.MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_EXECUTION__VISIBILITY = CorePackage.MODEL_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_EXECUTION__CLIENT_DEPENDENCY = CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_EXECUTION__CONSTRAINT = CorePackage.MODEL_ELEMENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_EXECUTION__IMPORTER = CorePackage.MODEL_ELEMENT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_EXECUTION__NAMESPACE = CorePackage.MODEL_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_EXECUTION__TAGGED_VALUE = CorePackage.MODEL_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_EXECUTION__START_DATE = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_EXECUTION__END_DATE = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>In Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_EXECUTION__IN_PROGRESS = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Successful</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_EXECUTION__SUCCESSFUL = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_EXECUTION__STATUS = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Transformation Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_EXECUTION_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link CWM.WarehouseOperation.impl.ActivityExecutionImpl <em>Activity Execution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.WarehouseOperation.impl.ActivityExecutionImpl
	 * @see CWM.WarehouseOperation.impl.WarehouseOperationPackageImpl#getActivityExecution()
	 * @generated
	 */
	int ACTIVITY_EXECUTION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXECUTION__NAME = TRANSFORMATION_EXECUTION__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXECUTION__VISIBILITY = TRANSFORMATION_EXECUTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXECUTION__CLIENT_DEPENDENCY = TRANSFORMATION_EXECUTION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXECUTION__CONSTRAINT = TRANSFORMATION_EXECUTION__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXECUTION__IMPORTER = TRANSFORMATION_EXECUTION__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXECUTION__NAMESPACE = TRANSFORMATION_EXECUTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXECUTION__TAGGED_VALUE = TRANSFORMATION_EXECUTION__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXECUTION__START_DATE = TRANSFORMATION_EXECUTION__START_DATE;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXECUTION__END_DATE = TRANSFORMATION_EXECUTION__END_DATE;

	/**
	 * The feature id for the '<em><b>In Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXECUTION__IN_PROGRESS = TRANSFORMATION_EXECUTION__IN_PROGRESS;

	/**
	 * The feature id for the '<em><b>Successful</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXECUTION__SUCCESSFUL = TRANSFORMATION_EXECUTION__SUCCESSFUL;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXECUTION__STATUS = TRANSFORMATION_EXECUTION__STATUS;

	/**
	 * The feature id for the '<em><b>Transformation Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXECUTION__TRANSFORMATION_ACTIVITY = TRANSFORMATION_EXECUTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Step Execution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXECUTION__STEP_EXECUTION = TRANSFORMATION_EXECUTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Activity Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXECUTION_FEATURE_COUNT = TRANSFORMATION_EXECUTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link CWM.WarehouseOperation.impl.StepExecutionImpl <em>Step Execution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.WarehouseOperation.impl.StepExecutionImpl
	 * @see CWM.WarehouseOperation.impl.WarehouseOperationPackageImpl#getStepExecution()
	 * @generated
	 */
	int STEP_EXECUTION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_EXECUTION__NAME = TRANSFORMATION_EXECUTION__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_EXECUTION__VISIBILITY = TRANSFORMATION_EXECUTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_EXECUTION__CLIENT_DEPENDENCY = TRANSFORMATION_EXECUTION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_EXECUTION__CONSTRAINT = TRANSFORMATION_EXECUTION__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_EXECUTION__IMPORTER = TRANSFORMATION_EXECUTION__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_EXECUTION__NAMESPACE = TRANSFORMATION_EXECUTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_EXECUTION__TAGGED_VALUE = TRANSFORMATION_EXECUTION__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_EXECUTION__START_DATE = TRANSFORMATION_EXECUTION__START_DATE;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_EXECUTION__END_DATE = TRANSFORMATION_EXECUTION__END_DATE;

	/**
	 * The feature id for the '<em><b>In Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_EXECUTION__IN_PROGRESS = TRANSFORMATION_EXECUTION__IN_PROGRESS;

	/**
	 * The feature id for the '<em><b>Successful</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_EXECUTION__SUCCESSFUL = TRANSFORMATION_EXECUTION__SUCCESSFUL;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_EXECUTION__STATUS = TRANSFORMATION_EXECUTION__STATUS;

	/**
	 * The feature id for the '<em><b>Transformation Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_EXECUTION__TRANSFORMATION_STEP = TRANSFORMATION_EXECUTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Activity Execution</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_EXECUTION__ACTIVITY_EXECUTION = TRANSFORMATION_EXECUTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Call Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_EXECUTION__CALL_ACTION = TRANSFORMATION_EXECUTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Step Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_EXECUTION_FEATURE_COUNT = TRANSFORMATION_EXECUTION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link CWM.WarehouseOperation.impl.WarehouseOperation_containerImpl <em>Warehouse Operation container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.WarehouseOperation.impl.WarehouseOperation_containerImpl
	 * @see CWM.WarehouseOperation.impl.WarehouseOperationPackageImpl#getWarehouseOperation_container()
	 * @generated
	 */
	int WAREHOUSE_OPERATION_CONTAINER = 5;

	/**
	 * The feature id for the '<em><b>Measurement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE_OPERATION_CONTAINER__MEASUREMENT = 0;

	/**
	 * The feature id for the '<em><b>Change Request</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE_OPERATION_CONTAINER__CHANGE_REQUEST = 1;

	/**
	 * The feature id for the '<em><b>Transformation Execution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE_OPERATION_CONTAINER__TRANSFORMATION_EXECUTION = 2;

	/**
	 * The feature id for the '<em><b>Activity Execution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE_OPERATION_CONTAINER__ACTIVITY_EXECUTION = 3;

	/**
	 * The feature id for the '<em><b>Step Execution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE_OPERATION_CONTAINER__STEP_EXECUTION = 4;

	/**
	 * The number of structural features of the '<em>Warehouse Operation container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE_OPERATION_CONTAINER_FEATURE_COUNT = 5;


	/**
	 * Returns the meta object for class '{@link CWM.WarehouseOperation.Measurement <em>Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement</em>'.
	 * @see CWM.WarehouseOperation.Measurement
	 * @generated
	 */
	EClass getMeasurement();

	/**
	 * Returns the meta object for the attribute '{@link CWM.WarehouseOperation.Measurement#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see CWM.WarehouseOperation.Measurement#getValue()
	 * @see #getMeasurement()
	 * @generated
	 */
	EAttribute getMeasurement_Value();

	/**
	 * Returns the meta object for the attribute '{@link CWM.WarehouseOperation.Measurement#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see CWM.WarehouseOperation.Measurement#getUnit()
	 * @see #getMeasurement()
	 * @generated
	 */
	EAttribute getMeasurement_Unit();

	/**
	 * Returns the meta object for the attribute '{@link CWM.WarehouseOperation.Measurement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see CWM.WarehouseOperation.Measurement#getType()
	 * @see #getMeasurement()
	 * @generated
	 */
	EAttribute getMeasurement_Type();

	/**
	 * Returns the meta object for the attribute '{@link CWM.WarehouseOperation.Measurement#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see CWM.WarehouseOperation.Measurement#getCreationDate()
	 * @see #getMeasurement()
	 * @generated
	 */
	EAttribute getMeasurement_CreationDate();

	/**
	 * Returns the meta object for the attribute '{@link CWM.WarehouseOperation.Measurement#getEffectiveDate <em>Effective Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effective Date</em>'.
	 * @see CWM.WarehouseOperation.Measurement#getEffectiveDate()
	 * @see #getMeasurement()
	 * @generated
	 */
	EAttribute getMeasurement_EffectiveDate();

	/**
	 * Returns the meta object for the reference '{@link CWM.WarehouseOperation.Measurement#getModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model Element</em>'.
	 * @see CWM.WarehouseOperation.Measurement#getModelElement()
	 * @see #getMeasurement()
	 * @generated
	 */
	EReference getMeasurement_ModelElement();

	/**
	 * Returns the meta object for class '{@link CWM.WarehouseOperation.ChangeRequest <em>Change Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Request</em>'.
	 * @see CWM.WarehouseOperation.ChangeRequest
	 * @generated
	 */
	EClass getChangeRequest();

	/**
	 * Returns the meta object for the attribute '{@link CWM.WarehouseOperation.ChangeRequest#getChangeDescription <em>Change Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Description</em>'.
	 * @see CWM.WarehouseOperation.ChangeRequest#getChangeDescription()
	 * @see #getChangeRequest()
	 * @generated
	 */
	EAttribute getChangeRequest_ChangeDescription();

	/**
	 * Returns the meta object for the attribute '{@link CWM.WarehouseOperation.ChangeRequest#getChangeReason <em>Change Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Reason</em>'.
	 * @see CWM.WarehouseOperation.ChangeRequest#getChangeReason()
	 * @see #getChangeRequest()
	 * @generated
	 */
	EAttribute getChangeRequest_ChangeReason();

	/**
	 * Returns the meta object for the attribute '{@link CWM.WarehouseOperation.ChangeRequest#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see CWM.WarehouseOperation.ChangeRequest#getStatus()
	 * @see #getChangeRequest()
	 * @generated
	 */
	EAttribute getChangeRequest_Status();

	/**
	 * Returns the meta object for the attribute '{@link CWM.WarehouseOperation.ChangeRequest#getCompleted <em>Completed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Completed</em>'.
	 * @see CWM.WarehouseOperation.ChangeRequest#getCompleted()
	 * @see #getChangeRequest()
	 * @generated
	 */
	EAttribute getChangeRequest_Completed();

	/**
	 * Returns the meta object for the attribute '{@link CWM.WarehouseOperation.ChangeRequest#getRequestDate <em>Request Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Request Date</em>'.
	 * @see CWM.WarehouseOperation.ChangeRequest#getRequestDate()
	 * @see #getChangeRequest()
	 * @generated
	 */
	EAttribute getChangeRequest_RequestDate();

	/**
	 * Returns the meta object for the attribute '{@link CWM.WarehouseOperation.ChangeRequest#getCompletionDate <em>Completion Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Completion Date</em>'.
	 * @see CWM.WarehouseOperation.ChangeRequest#getCompletionDate()
	 * @see #getChangeRequest()
	 * @generated
	 */
	EAttribute getChangeRequest_CompletionDate();

	/**
	 * Returns the meta object for the reference list '{@link CWM.WarehouseOperation.ChangeRequest#getModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Model Element</em>'.
	 * @see CWM.WarehouseOperation.ChangeRequest#getModelElement()
	 * @see #getChangeRequest()
	 * @generated
	 */
	EReference getChangeRequest_ModelElement();

	/**
	 * Returns the meta object for class '{@link CWM.WarehouseOperation.TransformationExecution <em>Transformation Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation Execution</em>'.
	 * @see CWM.WarehouseOperation.TransformationExecution
	 * @generated
	 */
	EClass getTransformationExecution();

	/**
	 * Returns the meta object for the attribute '{@link CWM.WarehouseOperation.TransformationExecution#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see CWM.WarehouseOperation.TransformationExecution#getStartDate()
	 * @see #getTransformationExecution()
	 * @generated
	 */
	EAttribute getTransformationExecution_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link CWM.WarehouseOperation.TransformationExecution#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see CWM.WarehouseOperation.TransformationExecution#getEndDate()
	 * @see #getTransformationExecution()
	 * @generated
	 */
	EAttribute getTransformationExecution_EndDate();

	/**
	 * Returns the meta object for the attribute '{@link CWM.WarehouseOperation.TransformationExecution#getInProgress <em>In Progress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In Progress</em>'.
	 * @see CWM.WarehouseOperation.TransformationExecution#getInProgress()
	 * @see #getTransformationExecution()
	 * @generated
	 */
	EAttribute getTransformationExecution_InProgress();

	/**
	 * Returns the meta object for the attribute '{@link CWM.WarehouseOperation.TransformationExecution#getSuccessful <em>Successful</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Successful</em>'.
	 * @see CWM.WarehouseOperation.TransformationExecution#getSuccessful()
	 * @see #getTransformationExecution()
	 * @generated
	 */
	EAttribute getTransformationExecution_Successful();

	/**
	 * Returns the meta object for the containment reference '{@link CWM.WarehouseOperation.TransformationExecution#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see CWM.WarehouseOperation.TransformationExecution#getStatus()
	 * @see #getTransformationExecution()
	 * @generated
	 */
	EReference getTransformationExecution_Status();

	/**
	 * Returns the meta object for class '{@link CWM.WarehouseOperation.ActivityExecution <em>Activity Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Execution</em>'.
	 * @see CWM.WarehouseOperation.ActivityExecution
	 * @generated
	 */
	EClass getActivityExecution();

	/**
	 * Returns the meta object for the reference '{@link CWM.WarehouseOperation.ActivityExecution#getTransformationActivity <em>Transformation Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transformation Activity</em>'.
	 * @see CWM.WarehouseOperation.ActivityExecution#getTransformationActivity()
	 * @see #getActivityExecution()
	 * @generated
	 */
	EReference getActivityExecution_TransformationActivity();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.WarehouseOperation.ActivityExecution#getStepExecution <em>Step Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Step Execution</em>'.
	 * @see CWM.WarehouseOperation.ActivityExecution#getStepExecution()
	 * @see #getActivityExecution()
	 * @generated
	 */
	EReference getActivityExecution_StepExecution();

	/**
	 * Returns the meta object for class '{@link CWM.WarehouseOperation.StepExecution <em>Step Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step Execution</em>'.
	 * @see CWM.WarehouseOperation.StepExecution
	 * @generated
	 */
	EClass getStepExecution();

	/**
	 * Returns the meta object for the reference '{@link CWM.WarehouseOperation.StepExecution#getTransformationStep <em>Transformation Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transformation Step</em>'.
	 * @see CWM.WarehouseOperation.StepExecution#getTransformationStep()
	 * @see #getStepExecution()
	 * @generated
	 */
	EReference getStepExecution_TransformationStep();

	/**
	 * Returns the meta object for the container reference '{@link CWM.WarehouseOperation.StepExecution#getActivityExecution <em>Activity Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Activity Execution</em>'.
	 * @see CWM.WarehouseOperation.StepExecution#getActivityExecution()
	 * @see #getStepExecution()
	 * @generated
	 */
	EReference getStepExecution_ActivityExecution();

	/**
	 * Returns the meta object for the reference '{@link CWM.WarehouseOperation.StepExecution#getCallAction <em>Call Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Call Action</em>'.
	 * @see CWM.WarehouseOperation.StepExecution#getCallAction()
	 * @see #getStepExecution()
	 * @generated
	 */
	EReference getStepExecution_CallAction();

	/**
	 * Returns the meta object for class '{@link CWM.WarehouseOperation.WarehouseOperation_container <em>Warehouse Operation container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Warehouse Operation container</em>'.
	 * @see CWM.WarehouseOperation.WarehouseOperation_container
	 * @generated
	 */
	EClass getWarehouseOperation_container();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.WarehouseOperation.WarehouseOperation_container#getMeasurement <em>Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measurement</em>'.
	 * @see CWM.WarehouseOperation.WarehouseOperation_container#getMeasurement()
	 * @see #getWarehouseOperation_container()
	 * @generated
	 */
	EReference getWarehouseOperation_container_Measurement();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.WarehouseOperation.WarehouseOperation_container#getChangeRequest <em>Change Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Change Request</em>'.
	 * @see CWM.WarehouseOperation.WarehouseOperation_container#getChangeRequest()
	 * @see #getWarehouseOperation_container()
	 * @generated
	 */
	EReference getWarehouseOperation_container_ChangeRequest();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.WarehouseOperation.WarehouseOperation_container#getTransformationExecution <em>Transformation Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transformation Execution</em>'.
	 * @see CWM.WarehouseOperation.WarehouseOperation_container#getTransformationExecution()
	 * @see #getWarehouseOperation_container()
	 * @generated
	 */
	EReference getWarehouseOperation_container_TransformationExecution();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.WarehouseOperation.WarehouseOperation_container#getActivityExecution <em>Activity Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activity Execution</em>'.
	 * @see CWM.WarehouseOperation.WarehouseOperation_container#getActivityExecution()
	 * @see #getWarehouseOperation_container()
	 * @generated
	 */
	EReference getWarehouseOperation_container_ActivityExecution();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.WarehouseOperation.WarehouseOperation_container#getStepExecution <em>Step Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Step Execution</em>'.
	 * @see CWM.WarehouseOperation.WarehouseOperation_container#getStepExecution()
	 * @see #getWarehouseOperation_container()
	 * @generated
	 */
	EReference getWarehouseOperation_container_StepExecution();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WarehouseOperationFactory getWarehouseOperationFactory();

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
		 * The meta object literal for the '{@link CWM.WarehouseOperation.impl.MeasurementImpl <em>Measurement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.WarehouseOperation.impl.MeasurementImpl
		 * @see CWM.WarehouseOperation.impl.WarehouseOperationPackageImpl#getMeasurement()
		 * @generated
		 */
		EClass MEASUREMENT = eINSTANCE.getMeasurement();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT__VALUE = eINSTANCE.getMeasurement_Value();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT__UNIT = eINSTANCE.getMeasurement_Unit();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT__TYPE = eINSTANCE.getMeasurement_Type();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT__CREATION_DATE = eINSTANCE.getMeasurement_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Effective Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT__EFFECTIVE_DATE = eINSTANCE.getMeasurement_EffectiveDate();

		/**
		 * The meta object literal for the '<em><b>Model Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT__MODEL_ELEMENT = eINSTANCE.getMeasurement_ModelElement();

		/**
		 * The meta object literal for the '{@link CWM.WarehouseOperation.impl.ChangeRequestImpl <em>Change Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.WarehouseOperation.impl.ChangeRequestImpl
		 * @see CWM.WarehouseOperation.impl.WarehouseOperationPackageImpl#getChangeRequest()
		 * @generated
		 */
		EClass CHANGE_REQUEST = eINSTANCE.getChangeRequest();

		/**
		 * The meta object literal for the '<em><b>Change Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_REQUEST__CHANGE_DESCRIPTION = eINSTANCE.getChangeRequest_ChangeDescription();

		/**
		 * The meta object literal for the '<em><b>Change Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_REQUEST__CHANGE_REASON = eINSTANCE.getChangeRequest_ChangeReason();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_REQUEST__STATUS = eINSTANCE.getChangeRequest_Status();

		/**
		 * The meta object literal for the '<em><b>Completed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_REQUEST__COMPLETED = eINSTANCE.getChangeRequest_Completed();

		/**
		 * The meta object literal for the '<em><b>Request Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_REQUEST__REQUEST_DATE = eINSTANCE.getChangeRequest_RequestDate();

		/**
		 * The meta object literal for the '<em><b>Completion Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_REQUEST__COMPLETION_DATE = eINSTANCE.getChangeRequest_CompletionDate();

		/**
		 * The meta object literal for the '<em><b>Model Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_REQUEST__MODEL_ELEMENT = eINSTANCE.getChangeRequest_ModelElement();

		/**
		 * The meta object literal for the '{@link CWM.WarehouseOperation.impl.TransformationExecutionImpl <em>Transformation Execution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.WarehouseOperation.impl.TransformationExecutionImpl
		 * @see CWM.WarehouseOperation.impl.WarehouseOperationPackageImpl#getTransformationExecution()
		 * @generated
		 */
		EClass TRANSFORMATION_EXECUTION = eINSTANCE.getTransformationExecution();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION_EXECUTION__START_DATE = eINSTANCE.getTransformationExecution_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION_EXECUTION__END_DATE = eINSTANCE.getTransformationExecution_EndDate();

		/**
		 * The meta object literal for the '<em><b>In Progress</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION_EXECUTION__IN_PROGRESS = eINSTANCE.getTransformationExecution_InProgress();

		/**
		 * The meta object literal for the '<em><b>Successful</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION_EXECUTION__SUCCESSFUL = eINSTANCE.getTransformationExecution_Successful();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_EXECUTION__STATUS = eINSTANCE.getTransformationExecution_Status();

		/**
		 * The meta object literal for the '{@link CWM.WarehouseOperation.impl.ActivityExecutionImpl <em>Activity Execution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.WarehouseOperation.impl.ActivityExecutionImpl
		 * @see CWM.WarehouseOperation.impl.WarehouseOperationPackageImpl#getActivityExecution()
		 * @generated
		 */
		EClass ACTIVITY_EXECUTION = eINSTANCE.getActivityExecution();

		/**
		 * The meta object literal for the '<em><b>Transformation Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EXECUTION__TRANSFORMATION_ACTIVITY = eINSTANCE.getActivityExecution_TransformationActivity();

		/**
		 * The meta object literal for the '<em><b>Step Execution</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EXECUTION__STEP_EXECUTION = eINSTANCE.getActivityExecution_StepExecution();

		/**
		 * The meta object literal for the '{@link CWM.WarehouseOperation.impl.StepExecutionImpl <em>Step Execution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.WarehouseOperation.impl.StepExecutionImpl
		 * @see CWM.WarehouseOperation.impl.WarehouseOperationPackageImpl#getStepExecution()
		 * @generated
		 */
		EClass STEP_EXECUTION = eINSTANCE.getStepExecution();

		/**
		 * The meta object literal for the '<em><b>Transformation Step</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP_EXECUTION__TRANSFORMATION_STEP = eINSTANCE.getStepExecution_TransformationStep();

		/**
		 * The meta object literal for the '<em><b>Activity Execution</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP_EXECUTION__ACTIVITY_EXECUTION = eINSTANCE.getStepExecution_ActivityExecution();

		/**
		 * The meta object literal for the '<em><b>Call Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP_EXECUTION__CALL_ACTION = eINSTANCE.getStepExecution_CallAction();

		/**
		 * The meta object literal for the '{@link CWM.WarehouseOperation.impl.WarehouseOperation_containerImpl <em>Warehouse Operation container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.WarehouseOperation.impl.WarehouseOperation_containerImpl
		 * @see CWM.WarehouseOperation.impl.WarehouseOperationPackageImpl#getWarehouseOperation_container()
		 * @generated
		 */
		EClass WAREHOUSE_OPERATION_CONTAINER = eINSTANCE.getWarehouseOperation_container();

		/**
		 * The meta object literal for the '<em><b>Measurement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WAREHOUSE_OPERATION_CONTAINER__MEASUREMENT = eINSTANCE.getWarehouseOperation_container_Measurement();

		/**
		 * The meta object literal for the '<em><b>Change Request</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WAREHOUSE_OPERATION_CONTAINER__CHANGE_REQUEST = eINSTANCE.getWarehouseOperation_container_ChangeRequest();

		/**
		 * The meta object literal for the '<em><b>Transformation Execution</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WAREHOUSE_OPERATION_CONTAINER__TRANSFORMATION_EXECUTION = eINSTANCE.getWarehouseOperation_container_TransformationExecution();

		/**
		 * The meta object literal for the '<em><b>Activity Execution</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WAREHOUSE_OPERATION_CONTAINER__ACTIVITY_EXECUTION = eINSTANCE.getWarehouseOperation_container_ActivityExecution();

		/**
		 * The meta object literal for the '<em><b>Step Execution</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WAREHOUSE_OPERATION_CONTAINER__STEP_EXECUTION = eINSTANCE.getWarehouseOperation_container_StepExecution();

	}

} //WarehouseOperationPackage

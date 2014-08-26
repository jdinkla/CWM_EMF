/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.WarehouseOperation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Warehouse Operation container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.WarehouseOperation.WarehouseOperation_container#getMeasurement <em>Measurement</em>}</li>
 *   <li>{@link CWM.WarehouseOperation.WarehouseOperation_container#getChangeRequest <em>Change Request</em>}</li>
 *   <li>{@link CWM.WarehouseOperation.WarehouseOperation_container#getTransformationExecution <em>Transformation Execution</em>}</li>
 *   <li>{@link CWM.WarehouseOperation.WarehouseOperation_container#getActivityExecution <em>Activity Execution</em>}</li>
 *   <li>{@link CWM.WarehouseOperation.WarehouseOperation_container#getStepExecution <em>Step Execution</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.WarehouseOperation.WarehouseOperationPackage#getWarehouseOperation_container()
 * @model
 * @generated
 */
public interface WarehouseOperation_container extends EObject {
	/**
	 * Returns the value of the '<em><b>Measurement</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.WarehouseOperation.Measurement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurement</em>' containment reference list.
	 * @see CWM.WarehouseOperation.WarehouseOperationPackage#getWarehouseOperation_container_Measurement()
	 * @model containment="true"
	 * @generated
	 */
	EList<Measurement> getMeasurement();

	/**
	 * Returns the value of the '<em><b>Change Request</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.WarehouseOperation.ChangeRequest}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Request</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Request</em>' containment reference list.
	 * @see CWM.WarehouseOperation.WarehouseOperationPackage#getWarehouseOperation_container_ChangeRequest()
	 * @model containment="true"
	 * @generated
	 */
	EList<ChangeRequest> getChangeRequest();

	/**
	 * Returns the value of the '<em><b>Transformation Execution</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.WarehouseOperation.TransformationExecution}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformation Execution</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation Execution</em>' containment reference list.
	 * @see CWM.WarehouseOperation.WarehouseOperationPackage#getWarehouseOperation_container_TransformationExecution()
	 * @model containment="true"
	 * @generated
	 */
	EList<TransformationExecution> getTransformationExecution();

	/**
	 * Returns the value of the '<em><b>Activity Execution</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.WarehouseOperation.ActivityExecution}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Execution</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Execution</em>' containment reference list.
	 * @see CWM.WarehouseOperation.WarehouseOperationPackage#getWarehouseOperation_container_ActivityExecution()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActivityExecution> getActivityExecution();

	/**
	 * Returns the value of the '<em><b>Step Execution</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.WarehouseOperation.StepExecution}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step Execution</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step Execution</em>' containment reference list.
	 * @see CWM.WarehouseOperation.WarehouseOperationPackage#getWarehouseOperation_container_StepExecution()
	 * @model containment="true"
	 * @generated
	 */
	EList<StepExecution> getStepExecution();

} // WarehouseOperation_container

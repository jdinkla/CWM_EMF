/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.WarehouseOperation;

import CWM.Core.Expression;
import CWM.Core.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation Execution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.WarehouseOperation.TransformationExecution#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link CWM.WarehouseOperation.TransformationExecution#getEndDate <em>End Date</em>}</li>
 *   <li>{@link CWM.WarehouseOperation.TransformationExecution#getInProgress <em>In Progress</em>}</li>
 *   <li>{@link CWM.WarehouseOperation.TransformationExecution#getSuccessful <em>Successful</em>}</li>
 *   <li>{@link CWM.WarehouseOperation.TransformationExecution#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.WarehouseOperation.WarehouseOperationPackage#getTransformationExecution()
 * @model
 * @generated
 */
public interface TransformationExecution extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(String)
	 * @see CWM.WarehouseOperation.WarehouseOperationPackage#getTransformationExecution_StartDate()
	 * @model unique="false" dataType="CWM.Core.Time" required="true" ordered="false"
	 * @generated
	 */
	String getStartDate();

	/**
	 * Sets the value of the '{@link CWM.WarehouseOperation.TransformationExecution#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(String value);

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(String)
	 * @see CWM.WarehouseOperation.WarehouseOperationPackage#getTransformationExecution_EndDate()
	 * @model unique="false" dataType="CWM.Core.Time" ordered="false"
	 * @generated
	 */
	String getEndDate();

	/**
	 * Sets the value of the '{@link CWM.WarehouseOperation.TransformationExecution#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(String value);

	/**
	 * Returns the value of the '<em><b>In Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Progress</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Progress</em>' attribute.
	 * @see #setInProgress(Boolean)
	 * @see CWM.WarehouseOperation.WarehouseOperationPackage#getTransformationExecution_InProgress()
	 * @model unique="false" dataType="CWM.Core.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getInProgress();

	/**
	 * Sets the value of the '{@link CWM.WarehouseOperation.TransformationExecution#getInProgress <em>In Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Progress</em>' attribute.
	 * @see #getInProgress()
	 * @generated
	 */
	void setInProgress(Boolean value);

	/**
	 * Returns the value of the '<em><b>Successful</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Successful</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successful</em>' attribute.
	 * @see #setSuccessful(Boolean)
	 * @see CWM.WarehouseOperation.WarehouseOperationPackage#getTransformationExecution_Successful()
	 * @model unique="false" dataType="CWM.Core.Boolean" ordered="false"
	 * @generated
	 */
	Boolean getSuccessful();

	/**
	 * Sets the value of the '{@link CWM.WarehouseOperation.TransformationExecution#getSuccessful <em>Successful</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Successful</em>' attribute.
	 * @see #getSuccessful()
	 * @generated
	 */
	void setSuccessful(Boolean value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(Expression)
	 * @see CWM.WarehouseOperation.WarehouseOperationPackage#getTransformationExecution_Status()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Expression getStatus();

	/**
	 * Sets the value of the '{@link CWM.WarehouseOperation.TransformationExecution#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Expression value);

} // TransformationExecution

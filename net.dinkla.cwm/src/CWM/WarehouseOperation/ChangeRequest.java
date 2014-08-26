/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.WarehouseOperation;

import CWM.Core.ModelElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.WarehouseOperation.ChangeRequest#getChangeDescription <em>Change Description</em>}</li>
 *   <li>{@link CWM.WarehouseOperation.ChangeRequest#getChangeReason <em>Change Reason</em>}</li>
 *   <li>{@link CWM.WarehouseOperation.ChangeRequest#getStatus <em>Status</em>}</li>
 *   <li>{@link CWM.WarehouseOperation.ChangeRequest#getCompleted <em>Completed</em>}</li>
 *   <li>{@link CWM.WarehouseOperation.ChangeRequest#getRequestDate <em>Request Date</em>}</li>
 *   <li>{@link CWM.WarehouseOperation.ChangeRequest#getCompletionDate <em>Completion Date</em>}</li>
 *   <li>{@link CWM.WarehouseOperation.ChangeRequest#getModelElement <em>Model Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.WarehouseOperation.WarehouseOperationPackage#getChangeRequest()
 * @model
 * @generated
 */
public interface ChangeRequest extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Change Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Description</em>' attribute.
	 * @see #setChangeDescription(String)
	 * @see CWM.WarehouseOperation.WarehouseOperationPackage#getChangeRequest_ChangeDescription()
	 * @model unique="false" dataType="CWM.Core.String" required="true" ordered="false"
	 * @generated
	 */
	String getChangeDescription();

	/**
	 * Sets the value of the '{@link CWM.WarehouseOperation.ChangeRequest#getChangeDescription <em>Change Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Description</em>' attribute.
	 * @see #getChangeDescription()
	 * @generated
	 */
	void setChangeDescription(String value);

	/**
	 * Returns the value of the '<em><b>Change Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Reason</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Reason</em>' attribute.
	 * @see #setChangeReason(String)
	 * @see CWM.WarehouseOperation.WarehouseOperationPackage#getChangeRequest_ChangeReason()
	 * @model unique="false" dataType="CWM.Core.String" required="true" ordered="false"
	 * @generated
	 */
	String getChangeReason();

	/**
	 * Sets the value of the '{@link CWM.WarehouseOperation.ChangeRequest#getChangeReason <em>Change Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Reason</em>' attribute.
	 * @see #getChangeReason()
	 * @generated
	 */
	void setChangeReason(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(String)
	 * @see CWM.WarehouseOperation.WarehouseOperationPackage#getChangeRequest_Status()
	 * @model unique="false" dataType="CWM.Core.String" required="true" ordered="false"
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link CWM.WarehouseOperation.ChangeRequest#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

	/**
	 * Returns the value of the '<em><b>Completed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Completed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Completed</em>' attribute.
	 * @see #setCompleted(Boolean)
	 * @see CWM.WarehouseOperation.WarehouseOperationPackage#getChangeRequest_Completed()
	 * @model unique="false" dataType="CWM.Core.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getCompleted();

	/**
	 * Sets the value of the '{@link CWM.WarehouseOperation.ChangeRequest#getCompleted <em>Completed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Completed</em>' attribute.
	 * @see #getCompleted()
	 * @generated
	 */
	void setCompleted(Boolean value);

	/**
	 * Returns the value of the '<em><b>Request Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Date</em>' attribute.
	 * @see #setRequestDate(String)
	 * @see CWM.WarehouseOperation.WarehouseOperationPackage#getChangeRequest_RequestDate()
	 * @model unique="false" dataType="CWM.Core.Time" required="true" ordered="false"
	 * @generated
	 */
	String getRequestDate();

	/**
	 * Sets the value of the '{@link CWM.WarehouseOperation.ChangeRequest#getRequestDate <em>Request Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Date</em>' attribute.
	 * @see #getRequestDate()
	 * @generated
	 */
	void setRequestDate(String value);

	/**
	 * Returns the value of the '<em><b>Completion Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Completion Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Completion Date</em>' attribute.
	 * @see #setCompletionDate(String)
	 * @see CWM.WarehouseOperation.WarehouseOperationPackage#getChangeRequest_CompletionDate()
	 * @model unique="false" dataType="CWM.Core.Time" ordered="false"
	 * @generated
	 */
	String getCompletionDate();

	/**
	 * Sets the value of the '{@link CWM.WarehouseOperation.ChangeRequest#getCompletionDate <em>Completion Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Completion Date</em>' attribute.
	 * @see #getCompletionDate()
	 * @generated
	 */
	void setCompletionDate(String value);

	/**
	 * Returns the value of the '<em><b>Model Element</b></em>' reference list.
	 * The list contents are of type {@link CWM.Core.ModelElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Element</em>' reference list.
	 * @see CWM.WarehouseOperation.WarehouseOperationPackage#getChangeRequest_ModelElement()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<ModelElement> getModelElement();

} // ChangeRequest

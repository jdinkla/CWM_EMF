/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.WarehouseProcess;

import CWM.Core.ModelElement;

import CWM.WarehouseProcess.Events.InternalEvent;
import CWM.WarehouseProcess.Events.WarehouseEvent;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Warehouse Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.WarehouseProcess.WarehouseProcess#getStaticDefinition <em>Static Definition</em>}</li>
 *   <li>{@link CWM.WarehouseProcess.WarehouseProcess#getIsSequential <em>Is Sequential</em>}</li>
 *   <li>{@link CWM.WarehouseProcess.WarehouseProcess#getWarehouseEvent <em>Warehouse Event</em>}</li>
 *   <li>{@link CWM.WarehouseProcess.WarehouseProcess#getInternalEvent <em>Internal Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.WarehouseProcess.WarehouseProcessPackage#getWarehouseProcess()
 * @model abstract="true"
 * @generated
 */
public interface WarehouseProcess extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Static Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static Definition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static Definition</em>' attribute.
	 * @see #setStaticDefinition(Boolean)
	 * @see CWM.WarehouseProcess.WarehouseProcessPackage#getWarehouseProcess_StaticDefinition()
	 * @model unique="false" dataType="CWM.Core.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getStaticDefinition();

	/**
	 * Sets the value of the '{@link CWM.WarehouseProcess.WarehouseProcess#getStaticDefinition <em>Static Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static Definition</em>' attribute.
	 * @see #getStaticDefinition()
	 * @generated
	 */
	void setStaticDefinition(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Sequential</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Sequential</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Sequential</em>' attribute.
	 * @see #setIsSequential(Boolean)
	 * @see CWM.WarehouseProcess.WarehouseProcessPackage#getWarehouseProcess_IsSequential()
	 * @model unique="false" dataType="CWM.Core.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsSequential();

	/**
	 * Sets the value of the '{@link CWM.WarehouseProcess.WarehouseProcess#getIsSequential <em>Is Sequential</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Sequential</em>' attribute.
	 * @see #getIsSequential()
	 * @generated
	 */
	void setIsSequential(Boolean value);

	/**
	 * Returns the value of the '<em><b>Warehouse Event</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.WarehouseProcess.Events.WarehouseEvent}.
	 * It is bidirectional and its opposite is '{@link CWM.WarehouseProcess.Events.WarehouseEvent#getWarehouseProcess <em>Warehouse Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Warehouse Event</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Warehouse Event</em>' containment reference list.
	 * @see CWM.WarehouseProcess.WarehouseProcessPackage#getWarehouseProcess_WarehouseEvent()
	 * @see CWM.WarehouseProcess.Events.WarehouseEvent#getWarehouseProcess
	 * @model opposite="warehouseProcess" containment="true" ordered="false"
	 * @generated
	 */
	EList<WarehouseEvent> getWarehouseEvent();

	/**
	 * Returns the value of the '<em><b>Internal Event</b></em>' reference list.
	 * The list contents are of type {@link CWM.WarehouseProcess.Events.InternalEvent}.
	 * It is bidirectional and its opposite is '{@link CWM.WarehouseProcess.Events.InternalEvent#getTriggeringWP <em>Triggering WP</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal Event</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Event</em>' reference list.
	 * @see CWM.WarehouseProcess.WarehouseProcessPackage#getWarehouseProcess_InternalEvent()
	 * @see CWM.WarehouseProcess.Events.InternalEvent#getTriggeringWP
	 * @model opposite="triggeringWP" ordered="false"
	 * @generated
	 */
	EList<InternalEvent> getInternalEvent();

} // WarehouseProcess

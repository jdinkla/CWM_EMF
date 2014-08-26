/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.WarehouseProcess.Events;

import CWM.Behavioral.Event;

import CWM.WarehouseProcess.WarehouseProcess;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Warehouse Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.WarehouseProcess.Events.WarehouseEvent#getWarehouseProcess <em>Warehouse Process</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.WarehouseProcess.Events.EventsPackage#getWarehouseEvent()
 * @model abstract="true"
 * @generated
 */
public interface WarehouseEvent extends Event {
	/**
	 * Returns the value of the '<em><b>Warehouse Process</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link CWM.WarehouseProcess.WarehouseProcess#getWarehouseEvent <em>Warehouse Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Warehouse Process</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Warehouse Process</em>' container reference.
	 * @see #setWarehouseProcess(WarehouseProcess)
	 * @see CWM.WarehouseProcess.Events.EventsPackage#getWarehouseEvent_WarehouseProcess()
	 * @see CWM.WarehouseProcess.WarehouseProcess#getWarehouseEvent
	 * @model opposite="warehouseEvent" required="true" transient="false" ordered="false"
	 * @generated
	 */
	WarehouseProcess getWarehouseProcess();

	/**
	 * Sets the value of the '{@link CWM.WarehouseProcess.Events.WarehouseEvent#getWarehouseProcess <em>Warehouse Process</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Warehouse Process</em>' container reference.
	 * @see #getWarehouseProcess()
	 * @generated
	 */
	void setWarehouseProcess(WarehouseProcess value);

} // WarehouseEvent

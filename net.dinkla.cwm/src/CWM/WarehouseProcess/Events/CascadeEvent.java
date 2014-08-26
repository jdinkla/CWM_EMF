/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.WarehouseProcess.Events;

import CWM.WarehouseProcess.DataType.WaitRuleType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cascade Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.WarehouseProcess.Events.CascadeEvent#getWaitRule <em>Wait Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.WarehouseProcess.Events.EventsPackage#getCascadeEvent()
 * @model
 * @generated
 */
public interface CascadeEvent extends InternalEvent {
	/**
	 * Returns the value of the '<em><b>Wait Rule</b></em>' attribute.
	 * The literals are from the enumeration {@link CWM.WarehouseProcess.DataType.WaitRuleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wait Rule</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wait Rule</em>' attribute.
	 * @see CWM.WarehouseProcess.DataType.WaitRuleType
	 * @see #setWaitRule(WaitRuleType)
	 * @see CWM.WarehouseProcess.Events.EventsPackage#getCascadeEvent_WaitRule()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	WaitRuleType getWaitRule();

	/**
	 * Sets the value of the '{@link CWM.WarehouseProcess.Events.CascadeEvent#getWaitRule <em>Wait Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wait Rule</em>' attribute.
	 * @see CWM.WarehouseProcess.DataType.WaitRuleType
	 * @see #getWaitRule()
	 * @generated
	 */
	void setWaitRule(WaitRuleType value);

} // CascadeEvent

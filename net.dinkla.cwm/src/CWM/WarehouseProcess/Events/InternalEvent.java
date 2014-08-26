/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.WarehouseProcess.Events;

import CWM.Core.BooleanExpression;

import CWM.WarehouseProcess.WarehouseProcess;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Internal Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.WarehouseProcess.Events.InternalEvent#getCondition <em>Condition</em>}</li>
 *   <li>{@link CWM.WarehouseProcess.Events.InternalEvent#getTriggeringWP <em>Triggering WP</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.WarehouseProcess.Events.EventsPackage#getInternalEvent()
 * @model
 * @generated
 */
public interface InternalEvent extends WarehouseEvent {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(BooleanExpression)
	 * @see CWM.WarehouseProcess.Events.EventsPackage#getInternalEvent_Condition()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	BooleanExpression getCondition();

	/**
	 * Sets the value of the '{@link CWM.WarehouseProcess.Events.InternalEvent#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(BooleanExpression value);

	/**
	 * Returns the value of the '<em><b>Triggering WP</b></em>' reference list.
	 * The list contents are of type {@link CWM.WarehouseProcess.WarehouseProcess}.
	 * It is bidirectional and its opposite is '{@link CWM.WarehouseProcess.WarehouseProcess#getInternalEvent <em>Internal Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triggering WP</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggering WP</em>' reference list.
	 * @see CWM.WarehouseProcess.Events.EventsPackage#getInternalEvent_TriggeringWP()
	 * @see CWM.WarehouseProcess.WarehouseProcess#getInternalEvent
	 * @model opposite="internalEvent" required="true" ordered="false"
	 * @generated
	 */
	EList<WarehouseProcess> getTriggeringWP();

} // InternalEvent

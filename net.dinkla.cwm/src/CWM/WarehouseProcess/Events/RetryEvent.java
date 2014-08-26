/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.WarehouseProcess.Events;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Retry Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.WarehouseProcess.Events.RetryEvent#getWaitDuration <em>Wait Duration</em>}</li>
 *   <li>{@link CWM.WarehouseProcess.Events.RetryEvent#getMaxCount <em>Max Count</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.WarehouseProcess.Events.EventsPackage#getRetryEvent()
 * @model
 * @generated
 */
public interface RetryEvent extends InternalEvent {
	/**
	 * Returns the value of the '<em><b>Wait Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wait Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wait Duration</em>' attribute.
	 * @see #setWaitDuration(Float)
	 * @see CWM.WarehouseProcess.Events.EventsPackage#getRetryEvent_WaitDuration()
	 * @model unique="false" dataType="CWM.Core.Float" required="true" ordered="false"
	 * @generated
	 */
	Float getWaitDuration();

	/**
	 * Sets the value of the '{@link CWM.WarehouseProcess.Events.RetryEvent#getWaitDuration <em>Wait Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wait Duration</em>' attribute.
	 * @see #getWaitDuration()
	 * @generated
	 */
	void setWaitDuration(Float value);

	/**
	 * Returns the value of the '<em><b>Max Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Count</em>' attribute.
	 * @see #setMaxCount(Integer)
	 * @see CWM.WarehouseProcess.Events.EventsPackage#getRetryEvent_MaxCount()
	 * @model unique="false" dataType="CWM.Core.Integer" required="true" ordered="false"
	 * @generated
	 */
	Integer getMaxCount();

	/**
	 * Sets the value of the '{@link CWM.WarehouseProcess.Events.RetryEvent#getMaxCount <em>Max Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Count</em>' attribute.
	 * @see #getMaxCount()
	 * @generated
	 */
	void setMaxCount(Integer value);

} // RetryEvent

/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.WarehouseProcess.Events;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interval Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.WarehouseProcess.Events.IntervalEvent#getDuration <em>Duration</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.WarehouseProcess.Events.EventsPackage#getIntervalEvent()
 * @model
 * @generated
 */
public interface IntervalEvent extends ScheduleEvent {
	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(Float)
	 * @see CWM.WarehouseProcess.Events.EventsPackage#getIntervalEvent_Duration()
	 * @model unique="false" dataType="CWM.Core.Float" required="true" ordered="false"
	 * @generated
	 */
	Float getDuration();

	/**
	 * Sets the value of the '{@link CWM.WarehouseProcess.Events.IntervalEvent#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(Float value);

} // IntervalEvent

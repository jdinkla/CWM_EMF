/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.WarehouseProcess.Events;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Calendar Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.WarehouseProcess.Events.CustomCalendarEvent#getCustomCalendar <em>Custom Calendar</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.WarehouseProcess.Events.EventsPackage#getCustomCalendarEvent()
 * @model
 * @generated
 */
public interface CustomCalendarEvent extends PointInTimeEvent {
	/**
	 * Returns the value of the '<em><b>Custom Calendar</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CWM.WarehouseProcess.Events.CustomCalendar#getCustomCalendarEvent <em>Custom Calendar Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Calendar</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Calendar</em>' reference.
	 * @see #setCustomCalendar(CustomCalendar)
	 * @see CWM.WarehouseProcess.Events.EventsPackage#getCustomCalendarEvent_CustomCalendar()
	 * @see CWM.WarehouseProcess.Events.CustomCalendar#getCustomCalendarEvent
	 * @model opposite="customCalendarEvent" required="true" ordered="false"
	 * @generated
	 */
	CustomCalendar getCustomCalendar();

	/**
	 * Sets the value of the '{@link CWM.WarehouseProcess.Events.CustomCalendarEvent#getCustomCalendar <em>Custom Calendar</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Calendar</em>' reference.
	 * @see #getCustomCalendar()
	 * @generated
	 */
	void setCustomCalendar(CustomCalendar value);

} // CustomCalendarEvent

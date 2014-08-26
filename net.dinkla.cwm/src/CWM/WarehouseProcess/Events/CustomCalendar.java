/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.WarehouseProcess.Events;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Calendar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.WarehouseProcess.Events.CustomCalendar#getCustomCalendarEvent <em>Custom Calendar Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.WarehouseProcess.Events.EventsPackage#getCustomCalendar()
 * @model
 * @generated
 */
public interface CustomCalendar extends CWM.Core.Package {
	/**
	 * Returns the value of the '<em><b>Custom Calendar Event</b></em>' reference list.
	 * The list contents are of type {@link CWM.WarehouseProcess.Events.CustomCalendarEvent}.
	 * It is bidirectional and its opposite is '{@link CWM.WarehouseProcess.Events.CustomCalendarEvent#getCustomCalendar <em>Custom Calendar</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Calendar Event</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Calendar Event</em>' reference list.
	 * @see CWM.WarehouseProcess.Events.EventsPackage#getCustomCalendar_CustomCalendarEvent()
	 * @see CWM.WarehouseProcess.Events.CustomCalendarEvent#getCustomCalendar
	 * @model opposite="customCalendar" ordered="false"
	 * @generated
	 */
	EList<CustomCalendarEvent> getCustomCalendarEvent();

} // CustomCalendar

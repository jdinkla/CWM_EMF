/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.WarehouseProcess.Events;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Events container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.WarehouseProcess.Events.Events_container#getWarehouseEvent <em>Warehouse Event</em>}</li>
 *   <li>{@link CWM.WarehouseProcess.Events.Events_container#getScheduleEvent <em>Schedule Event</em>}</li>
 *   <li>{@link CWM.WarehouseProcess.Events.Events_container#getPointInTimeEvent <em>Point In Time Event</em>}</li>
 *   <li>{@link CWM.WarehouseProcess.Events.Events_container#getCustomCalendarEvent <em>Custom Calendar Event</em>}</li>
 *   <li>{@link CWM.WarehouseProcess.Events.Events_container#getCustomCalendar <em>Custom Calendar</em>}</li>
 *   <li>{@link CWM.WarehouseProcess.Events.Events_container#getCalendarDate <em>Calendar Date</em>}</li>
 *   <li>{@link CWM.WarehouseProcess.Events.Events_container#getIntervalEvent <em>Interval Event</em>}</li>
 *   <li>{@link CWM.WarehouseProcess.Events.Events_container#getExternalEvent <em>External Event</em>}</li>
 *   <li>{@link CWM.WarehouseProcess.Events.Events_container#getInternalEvent <em>Internal Event</em>}</li>
 *   <li>{@link CWM.WarehouseProcess.Events.Events_container#getCascadeEvent <em>Cascade Event</em>}</li>
 *   <li>{@link CWM.WarehouseProcess.Events.Events_container#getRetryEvent <em>Retry Event</em>}</li>
 *   <li>{@link CWM.WarehouseProcess.Events.Events_container#getRecurringPointInTimeEvent <em>Recurring Point In Time Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.WarehouseProcess.Events.EventsPackage#getEvents_container()
 * @model
 * @generated
 */
public interface Events_container extends EObject {
	/**
	 * Returns the value of the '<em><b>Warehouse Event</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.WarehouseProcess.Events.WarehouseEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Warehouse Event</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Warehouse Event</em>' containment reference list.
	 * @see CWM.WarehouseProcess.Events.EventsPackage#getEvents_container_WarehouseEvent()
	 * @model containment="true"
	 * @generated
	 */
	EList<WarehouseEvent> getWarehouseEvent();

	/**
	 * Returns the value of the '<em><b>Schedule Event</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.WarehouseProcess.Events.ScheduleEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedule Event</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule Event</em>' containment reference list.
	 * @see CWM.WarehouseProcess.Events.EventsPackage#getEvents_container_ScheduleEvent()
	 * @model containment="true"
	 * @generated
	 */
	EList<ScheduleEvent> getScheduleEvent();

	/**
	 * Returns the value of the '<em><b>Point In Time Event</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.WarehouseProcess.Events.PointInTimeEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point In Time Event</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point In Time Event</em>' containment reference list.
	 * @see CWM.WarehouseProcess.Events.EventsPackage#getEvents_container_PointInTimeEvent()
	 * @model containment="true"
	 * @generated
	 */
	EList<PointInTimeEvent> getPointInTimeEvent();

	/**
	 * Returns the value of the '<em><b>Custom Calendar Event</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.WarehouseProcess.Events.CustomCalendarEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Calendar Event</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Calendar Event</em>' containment reference list.
	 * @see CWM.WarehouseProcess.Events.EventsPackage#getEvents_container_CustomCalendarEvent()
	 * @model containment="true"
	 * @generated
	 */
	EList<CustomCalendarEvent> getCustomCalendarEvent();

	/**
	 * Returns the value of the '<em><b>Custom Calendar</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.WarehouseProcess.Events.CustomCalendar}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Calendar</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Calendar</em>' containment reference list.
	 * @see CWM.WarehouseProcess.Events.EventsPackage#getEvents_container_CustomCalendar()
	 * @model containment="true"
	 * @generated
	 */
	EList<CustomCalendar> getCustomCalendar();

	/**
	 * Returns the value of the '<em><b>Calendar Date</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.WarehouseProcess.Events.CalendarDate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calendar Date</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calendar Date</em>' containment reference list.
	 * @see CWM.WarehouseProcess.Events.EventsPackage#getEvents_container_CalendarDate()
	 * @model containment="true"
	 * @generated
	 */
	EList<CalendarDate> getCalendarDate();

	/**
	 * Returns the value of the '<em><b>Interval Event</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.WarehouseProcess.Events.IntervalEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interval Event</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval Event</em>' containment reference list.
	 * @see CWM.WarehouseProcess.Events.EventsPackage#getEvents_container_IntervalEvent()
	 * @model containment="true"
	 * @generated
	 */
	EList<IntervalEvent> getIntervalEvent();

	/**
	 * Returns the value of the '<em><b>External Event</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.WarehouseProcess.Events.ExternalEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Event</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Event</em>' containment reference list.
	 * @see CWM.WarehouseProcess.Events.EventsPackage#getEvents_container_ExternalEvent()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExternalEvent> getExternalEvent();

	/**
	 * Returns the value of the '<em><b>Internal Event</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.WarehouseProcess.Events.InternalEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal Event</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Event</em>' containment reference list.
	 * @see CWM.WarehouseProcess.Events.EventsPackage#getEvents_container_InternalEvent()
	 * @model containment="true"
	 * @generated
	 */
	EList<InternalEvent> getInternalEvent();

	/**
	 * Returns the value of the '<em><b>Cascade Event</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.WarehouseProcess.Events.CascadeEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cascade Event</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cascade Event</em>' containment reference list.
	 * @see CWM.WarehouseProcess.Events.EventsPackage#getEvents_container_CascadeEvent()
	 * @model containment="true"
	 * @generated
	 */
	EList<CascadeEvent> getCascadeEvent();

	/**
	 * Returns the value of the '<em><b>Retry Event</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.WarehouseProcess.Events.RetryEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Retry Event</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retry Event</em>' containment reference list.
	 * @see CWM.WarehouseProcess.Events.EventsPackage#getEvents_container_RetryEvent()
	 * @model containment="true"
	 * @generated
	 */
	EList<RetryEvent> getRetryEvent();

	/**
	 * Returns the value of the '<em><b>Recurring Point In Time Event</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.WarehouseProcess.Events.RecurringPointInTimeEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recurring Point In Time Event</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recurring Point In Time Event</em>' containment reference list.
	 * @see CWM.WarehouseProcess.Events.EventsPackage#getEvents_container_RecurringPointInTimeEvent()
	 * @model containment="true"
	 * @generated
	 */
	EList<RecurringPointInTimeEvent> getRecurringPointInTimeEvent();

} // Events_container

/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.WarehouseProcess.Events.impl;

import CWM.WarehouseProcess.Events.CalendarDate;
import CWM.WarehouseProcess.Events.CascadeEvent;
import CWM.WarehouseProcess.Events.CustomCalendar;
import CWM.WarehouseProcess.Events.CustomCalendarEvent;
import CWM.WarehouseProcess.Events.EventsPackage;
import CWM.WarehouseProcess.Events.Events_container;
import CWM.WarehouseProcess.Events.ExternalEvent;
import CWM.WarehouseProcess.Events.InternalEvent;
import CWM.WarehouseProcess.Events.IntervalEvent;
import CWM.WarehouseProcess.Events.PointInTimeEvent;
import CWM.WarehouseProcess.Events.RecurringPointInTimeEvent;
import CWM.WarehouseProcess.Events.RetryEvent;
import CWM.WarehouseProcess.Events.ScheduleEvent;
import CWM.WarehouseProcess.Events.WarehouseEvent;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Events container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.WarehouseProcess.Events.impl.Events_containerImpl#getWarehouseEvent <em>Warehouse Event</em>}</li>
 *   <li>{@link CWM.WarehouseProcess.Events.impl.Events_containerImpl#getScheduleEvent <em>Schedule Event</em>}</li>
 *   <li>{@link CWM.WarehouseProcess.Events.impl.Events_containerImpl#getPointInTimeEvent <em>Point In Time Event</em>}</li>
 *   <li>{@link CWM.WarehouseProcess.Events.impl.Events_containerImpl#getCustomCalendarEvent <em>Custom Calendar Event</em>}</li>
 *   <li>{@link CWM.WarehouseProcess.Events.impl.Events_containerImpl#getCustomCalendar <em>Custom Calendar</em>}</li>
 *   <li>{@link CWM.WarehouseProcess.Events.impl.Events_containerImpl#getCalendarDate <em>Calendar Date</em>}</li>
 *   <li>{@link CWM.WarehouseProcess.Events.impl.Events_containerImpl#getIntervalEvent <em>Interval Event</em>}</li>
 *   <li>{@link CWM.WarehouseProcess.Events.impl.Events_containerImpl#getExternalEvent <em>External Event</em>}</li>
 *   <li>{@link CWM.WarehouseProcess.Events.impl.Events_containerImpl#getInternalEvent <em>Internal Event</em>}</li>
 *   <li>{@link CWM.WarehouseProcess.Events.impl.Events_containerImpl#getCascadeEvent <em>Cascade Event</em>}</li>
 *   <li>{@link CWM.WarehouseProcess.Events.impl.Events_containerImpl#getRetryEvent <em>Retry Event</em>}</li>
 *   <li>{@link CWM.WarehouseProcess.Events.impl.Events_containerImpl#getRecurringPointInTimeEvent <em>Recurring Point In Time Event</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Events_containerImpl extends EObjectImpl implements Events_container {
	/**
	 * The cached value of the '{@link #getWarehouseEvent() <em>Warehouse Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarehouseEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<WarehouseEvent> warehouseEvent;

	/**
	 * The cached value of the '{@link #getScheduleEvent() <em>Schedule Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<ScheduleEvent> scheduleEvent;

	/**
	 * The cached value of the '{@link #getPointInTimeEvent() <em>Point In Time Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointInTimeEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<PointInTimeEvent> pointInTimeEvent;

	/**
	 * The cached value of the '{@link #getCustomCalendarEvent() <em>Custom Calendar Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomCalendarEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<CustomCalendarEvent> customCalendarEvent;

	/**
	 * The cached value of the '{@link #getCustomCalendar() <em>Custom Calendar</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomCalendar()
	 * @generated
	 * @ordered
	 */
	protected EList<CustomCalendar> customCalendar;

	/**
	 * The cached value of the '{@link #getCalendarDate() <em>Calendar Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalendarDate()
	 * @generated
	 * @ordered
	 */
	protected EList<CalendarDate> calendarDate;

	/**
	 * The cached value of the '{@link #getIntervalEvent() <em>Interval Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<IntervalEvent> intervalEvent;

	/**
	 * The cached value of the '{@link #getExternalEvent() <em>External Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<ExternalEvent> externalEvent;

	/**
	 * The cached value of the '{@link #getInternalEvent() <em>Internal Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<InternalEvent> internalEvent;

	/**
	 * The cached value of the '{@link #getCascadeEvent() <em>Cascade Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCascadeEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<CascadeEvent> cascadeEvent;

	/**
	 * The cached value of the '{@link #getRetryEvent() <em>Retry Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetryEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<RetryEvent> retryEvent;

	/**
	 * The cached value of the '{@link #getRecurringPointInTimeEvent() <em>Recurring Point In Time Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurringPointInTimeEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<RecurringPointInTimeEvent> recurringPointInTimeEvent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Events_containerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EventsPackage.Literals.EVENTS_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WarehouseEvent> getWarehouseEvent() {
		if (warehouseEvent == null) {
			warehouseEvent = new EObjectContainmentEList<WarehouseEvent>(WarehouseEvent.class, this, EventsPackage.EVENTS_CONTAINER__WAREHOUSE_EVENT);
		}
		return warehouseEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ScheduleEvent> getScheduleEvent() {
		if (scheduleEvent == null) {
			scheduleEvent = new EObjectContainmentEList<ScheduleEvent>(ScheduleEvent.class, this, EventsPackage.EVENTS_CONTAINER__SCHEDULE_EVENT);
		}
		return scheduleEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PointInTimeEvent> getPointInTimeEvent() {
		if (pointInTimeEvent == null) {
			pointInTimeEvent = new EObjectContainmentEList<PointInTimeEvent>(PointInTimeEvent.class, this, EventsPackage.EVENTS_CONTAINER__POINT_IN_TIME_EVENT);
		}
		return pointInTimeEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CustomCalendarEvent> getCustomCalendarEvent() {
		if (customCalendarEvent == null) {
			customCalendarEvent = new EObjectContainmentEList<CustomCalendarEvent>(CustomCalendarEvent.class, this, EventsPackage.EVENTS_CONTAINER__CUSTOM_CALENDAR_EVENT);
		}
		return customCalendarEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CustomCalendar> getCustomCalendar() {
		if (customCalendar == null) {
			customCalendar = new EObjectContainmentEList<CustomCalendar>(CustomCalendar.class, this, EventsPackage.EVENTS_CONTAINER__CUSTOM_CALENDAR);
		}
		return customCalendar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CalendarDate> getCalendarDate() {
		if (calendarDate == null) {
			calendarDate = new EObjectContainmentEList<CalendarDate>(CalendarDate.class, this, EventsPackage.EVENTS_CONTAINER__CALENDAR_DATE);
		}
		return calendarDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IntervalEvent> getIntervalEvent() {
		if (intervalEvent == null) {
			intervalEvent = new EObjectContainmentEList<IntervalEvent>(IntervalEvent.class, this, EventsPackage.EVENTS_CONTAINER__INTERVAL_EVENT);
		}
		return intervalEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExternalEvent> getExternalEvent() {
		if (externalEvent == null) {
			externalEvent = new EObjectContainmentEList<ExternalEvent>(ExternalEvent.class, this, EventsPackage.EVENTS_CONTAINER__EXTERNAL_EVENT);
		}
		return externalEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InternalEvent> getInternalEvent() {
		if (internalEvent == null) {
			internalEvent = new EObjectContainmentEList<InternalEvent>(InternalEvent.class, this, EventsPackage.EVENTS_CONTAINER__INTERNAL_EVENT);
		}
		return internalEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CascadeEvent> getCascadeEvent() {
		if (cascadeEvent == null) {
			cascadeEvent = new EObjectContainmentEList<CascadeEvent>(CascadeEvent.class, this, EventsPackage.EVENTS_CONTAINER__CASCADE_EVENT);
		}
		return cascadeEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RetryEvent> getRetryEvent() {
		if (retryEvent == null) {
			retryEvent = new EObjectContainmentEList<RetryEvent>(RetryEvent.class, this, EventsPackage.EVENTS_CONTAINER__RETRY_EVENT);
		}
		return retryEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RecurringPointInTimeEvent> getRecurringPointInTimeEvent() {
		if (recurringPointInTimeEvent == null) {
			recurringPointInTimeEvent = new EObjectContainmentEList<RecurringPointInTimeEvent>(RecurringPointInTimeEvent.class, this, EventsPackage.EVENTS_CONTAINER__RECURRING_POINT_IN_TIME_EVENT);
		}
		return recurringPointInTimeEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EventsPackage.EVENTS_CONTAINER__WAREHOUSE_EVENT:
				return ((InternalEList<?>)getWarehouseEvent()).basicRemove(otherEnd, msgs);
			case EventsPackage.EVENTS_CONTAINER__SCHEDULE_EVENT:
				return ((InternalEList<?>)getScheduleEvent()).basicRemove(otherEnd, msgs);
			case EventsPackage.EVENTS_CONTAINER__POINT_IN_TIME_EVENT:
				return ((InternalEList<?>)getPointInTimeEvent()).basicRemove(otherEnd, msgs);
			case EventsPackage.EVENTS_CONTAINER__CUSTOM_CALENDAR_EVENT:
				return ((InternalEList<?>)getCustomCalendarEvent()).basicRemove(otherEnd, msgs);
			case EventsPackage.EVENTS_CONTAINER__CUSTOM_CALENDAR:
				return ((InternalEList<?>)getCustomCalendar()).basicRemove(otherEnd, msgs);
			case EventsPackage.EVENTS_CONTAINER__CALENDAR_DATE:
				return ((InternalEList<?>)getCalendarDate()).basicRemove(otherEnd, msgs);
			case EventsPackage.EVENTS_CONTAINER__INTERVAL_EVENT:
				return ((InternalEList<?>)getIntervalEvent()).basicRemove(otherEnd, msgs);
			case EventsPackage.EVENTS_CONTAINER__EXTERNAL_EVENT:
				return ((InternalEList<?>)getExternalEvent()).basicRemove(otherEnd, msgs);
			case EventsPackage.EVENTS_CONTAINER__INTERNAL_EVENT:
				return ((InternalEList<?>)getInternalEvent()).basicRemove(otherEnd, msgs);
			case EventsPackage.EVENTS_CONTAINER__CASCADE_EVENT:
				return ((InternalEList<?>)getCascadeEvent()).basicRemove(otherEnd, msgs);
			case EventsPackage.EVENTS_CONTAINER__RETRY_EVENT:
				return ((InternalEList<?>)getRetryEvent()).basicRemove(otherEnd, msgs);
			case EventsPackage.EVENTS_CONTAINER__RECURRING_POINT_IN_TIME_EVENT:
				return ((InternalEList<?>)getRecurringPointInTimeEvent()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EventsPackage.EVENTS_CONTAINER__WAREHOUSE_EVENT:
				return getWarehouseEvent();
			case EventsPackage.EVENTS_CONTAINER__SCHEDULE_EVENT:
				return getScheduleEvent();
			case EventsPackage.EVENTS_CONTAINER__POINT_IN_TIME_EVENT:
				return getPointInTimeEvent();
			case EventsPackage.EVENTS_CONTAINER__CUSTOM_CALENDAR_EVENT:
				return getCustomCalendarEvent();
			case EventsPackage.EVENTS_CONTAINER__CUSTOM_CALENDAR:
				return getCustomCalendar();
			case EventsPackage.EVENTS_CONTAINER__CALENDAR_DATE:
				return getCalendarDate();
			case EventsPackage.EVENTS_CONTAINER__INTERVAL_EVENT:
				return getIntervalEvent();
			case EventsPackage.EVENTS_CONTAINER__EXTERNAL_EVENT:
				return getExternalEvent();
			case EventsPackage.EVENTS_CONTAINER__INTERNAL_EVENT:
				return getInternalEvent();
			case EventsPackage.EVENTS_CONTAINER__CASCADE_EVENT:
				return getCascadeEvent();
			case EventsPackage.EVENTS_CONTAINER__RETRY_EVENT:
				return getRetryEvent();
			case EventsPackage.EVENTS_CONTAINER__RECURRING_POINT_IN_TIME_EVENT:
				return getRecurringPointInTimeEvent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EventsPackage.EVENTS_CONTAINER__WAREHOUSE_EVENT:
				getWarehouseEvent().clear();
				getWarehouseEvent().addAll((Collection<? extends WarehouseEvent>)newValue);
				return;
			case EventsPackage.EVENTS_CONTAINER__SCHEDULE_EVENT:
				getScheduleEvent().clear();
				getScheduleEvent().addAll((Collection<? extends ScheduleEvent>)newValue);
				return;
			case EventsPackage.EVENTS_CONTAINER__POINT_IN_TIME_EVENT:
				getPointInTimeEvent().clear();
				getPointInTimeEvent().addAll((Collection<? extends PointInTimeEvent>)newValue);
				return;
			case EventsPackage.EVENTS_CONTAINER__CUSTOM_CALENDAR_EVENT:
				getCustomCalendarEvent().clear();
				getCustomCalendarEvent().addAll((Collection<? extends CustomCalendarEvent>)newValue);
				return;
			case EventsPackage.EVENTS_CONTAINER__CUSTOM_CALENDAR:
				getCustomCalendar().clear();
				getCustomCalendar().addAll((Collection<? extends CustomCalendar>)newValue);
				return;
			case EventsPackage.EVENTS_CONTAINER__CALENDAR_DATE:
				getCalendarDate().clear();
				getCalendarDate().addAll((Collection<? extends CalendarDate>)newValue);
				return;
			case EventsPackage.EVENTS_CONTAINER__INTERVAL_EVENT:
				getIntervalEvent().clear();
				getIntervalEvent().addAll((Collection<? extends IntervalEvent>)newValue);
				return;
			case EventsPackage.EVENTS_CONTAINER__EXTERNAL_EVENT:
				getExternalEvent().clear();
				getExternalEvent().addAll((Collection<? extends ExternalEvent>)newValue);
				return;
			case EventsPackage.EVENTS_CONTAINER__INTERNAL_EVENT:
				getInternalEvent().clear();
				getInternalEvent().addAll((Collection<? extends InternalEvent>)newValue);
				return;
			case EventsPackage.EVENTS_CONTAINER__CASCADE_EVENT:
				getCascadeEvent().clear();
				getCascadeEvent().addAll((Collection<? extends CascadeEvent>)newValue);
				return;
			case EventsPackage.EVENTS_CONTAINER__RETRY_EVENT:
				getRetryEvent().clear();
				getRetryEvent().addAll((Collection<? extends RetryEvent>)newValue);
				return;
			case EventsPackage.EVENTS_CONTAINER__RECURRING_POINT_IN_TIME_EVENT:
				getRecurringPointInTimeEvent().clear();
				getRecurringPointInTimeEvent().addAll((Collection<? extends RecurringPointInTimeEvent>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EventsPackage.EVENTS_CONTAINER__WAREHOUSE_EVENT:
				getWarehouseEvent().clear();
				return;
			case EventsPackage.EVENTS_CONTAINER__SCHEDULE_EVENT:
				getScheduleEvent().clear();
				return;
			case EventsPackage.EVENTS_CONTAINER__POINT_IN_TIME_EVENT:
				getPointInTimeEvent().clear();
				return;
			case EventsPackage.EVENTS_CONTAINER__CUSTOM_CALENDAR_EVENT:
				getCustomCalendarEvent().clear();
				return;
			case EventsPackage.EVENTS_CONTAINER__CUSTOM_CALENDAR:
				getCustomCalendar().clear();
				return;
			case EventsPackage.EVENTS_CONTAINER__CALENDAR_DATE:
				getCalendarDate().clear();
				return;
			case EventsPackage.EVENTS_CONTAINER__INTERVAL_EVENT:
				getIntervalEvent().clear();
				return;
			case EventsPackage.EVENTS_CONTAINER__EXTERNAL_EVENT:
				getExternalEvent().clear();
				return;
			case EventsPackage.EVENTS_CONTAINER__INTERNAL_EVENT:
				getInternalEvent().clear();
				return;
			case EventsPackage.EVENTS_CONTAINER__CASCADE_EVENT:
				getCascadeEvent().clear();
				return;
			case EventsPackage.EVENTS_CONTAINER__RETRY_EVENT:
				getRetryEvent().clear();
				return;
			case EventsPackage.EVENTS_CONTAINER__RECURRING_POINT_IN_TIME_EVENT:
				getRecurringPointInTimeEvent().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EventsPackage.EVENTS_CONTAINER__WAREHOUSE_EVENT:
				return warehouseEvent != null && !warehouseEvent.isEmpty();
			case EventsPackage.EVENTS_CONTAINER__SCHEDULE_EVENT:
				return scheduleEvent != null && !scheduleEvent.isEmpty();
			case EventsPackage.EVENTS_CONTAINER__POINT_IN_TIME_EVENT:
				return pointInTimeEvent != null && !pointInTimeEvent.isEmpty();
			case EventsPackage.EVENTS_CONTAINER__CUSTOM_CALENDAR_EVENT:
				return customCalendarEvent != null && !customCalendarEvent.isEmpty();
			case EventsPackage.EVENTS_CONTAINER__CUSTOM_CALENDAR:
				return customCalendar != null && !customCalendar.isEmpty();
			case EventsPackage.EVENTS_CONTAINER__CALENDAR_DATE:
				return calendarDate != null && !calendarDate.isEmpty();
			case EventsPackage.EVENTS_CONTAINER__INTERVAL_EVENT:
				return intervalEvent != null && !intervalEvent.isEmpty();
			case EventsPackage.EVENTS_CONTAINER__EXTERNAL_EVENT:
				return externalEvent != null && !externalEvent.isEmpty();
			case EventsPackage.EVENTS_CONTAINER__INTERNAL_EVENT:
				return internalEvent != null && !internalEvent.isEmpty();
			case EventsPackage.EVENTS_CONTAINER__CASCADE_EVENT:
				return cascadeEvent != null && !cascadeEvent.isEmpty();
			case EventsPackage.EVENTS_CONTAINER__RETRY_EVENT:
				return retryEvent != null && !retryEvent.isEmpty();
			case EventsPackage.EVENTS_CONTAINER__RECURRING_POINT_IN_TIME_EVENT:
				return recurringPointInTimeEvent != null && !recurringPointInTimeEvent.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Events_containerImpl

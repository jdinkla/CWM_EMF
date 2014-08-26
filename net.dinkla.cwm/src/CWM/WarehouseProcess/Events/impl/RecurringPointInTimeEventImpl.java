/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.WarehouseProcess.Events.impl;

import CWM.WarehouseProcess.DataType.DayOfWeek;
import CWM.WarehouseProcess.DataType.RecurringType;

import CWM.WarehouseProcess.Events.EventsPackage;
import CWM.WarehouseProcess.Events.RecurringPointInTimeEvent;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recurring Point In Time Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.WarehouseProcess.Events.impl.RecurringPointInTimeEventImpl#getRecurringType <em>Recurring Type</em>}</li>
 *   <li>{@link CWM.WarehouseProcess.Events.impl.RecurringPointInTimeEventImpl#getFrequencyFactor <em>Frequency Factor</em>}</li>
 *   <li>{@link CWM.WarehouseProcess.Events.impl.RecurringPointInTimeEventImpl#getMonth <em>Month</em>}</li>
 *   <li>{@link CWM.WarehouseProcess.Events.impl.RecurringPointInTimeEventImpl#getDayOfMonth <em>Day Of Month</em>}</li>
 *   <li>{@link CWM.WarehouseProcess.Events.impl.RecurringPointInTimeEventImpl#getDayOfWeek <em>Day Of Week</em>}</li>
 *   <li>{@link CWM.WarehouseProcess.Events.impl.RecurringPointInTimeEventImpl#getHour <em>Hour</em>}</li>
 *   <li>{@link CWM.WarehouseProcess.Events.impl.RecurringPointInTimeEventImpl#getMinute <em>Minute</em>}</li>
 *   <li>{@link CWM.WarehouseProcess.Events.impl.RecurringPointInTimeEventImpl#getSecond <em>Second</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RecurringPointInTimeEventImpl extends PointInTimeEventImpl implements RecurringPointInTimeEvent {
	/**
	 * The default value of the '{@link #getRecurringType() <em>Recurring Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurringType()
	 * @generated
	 * @ordered
	 */
	protected static final RecurringType RECURRING_TYPE_EDEFAULT = RecurringType.EVERY_YEAR;

	/**
	 * The cached value of the '{@link #getRecurringType() <em>Recurring Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurringType()
	 * @generated
	 * @ordered
	 */
	protected RecurringType recurringType = RECURRING_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFrequencyFactor() <em>Frequency Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequencyFactor()
	 * @generated
	 * @ordered
	 */
	protected static final Integer FREQUENCY_FACTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrequencyFactor() <em>Frequency Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequencyFactor()
	 * @generated
	 * @ordered
	 */
	protected Integer frequencyFactor = FREQUENCY_FACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getMonth() <em>Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonth()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MONTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMonth() <em>Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonth()
	 * @generated
	 * @ordered
	 */
	protected Integer month = MONTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getDayOfMonth() <em>Day Of Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDayOfMonth()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DAY_OF_MONTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDayOfMonth() <em>Day Of Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDayOfMonth()
	 * @generated
	 * @ordered
	 */
	protected Integer dayOfMonth = DAY_OF_MONTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getDayOfWeek() <em>Day Of Week</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDayOfWeek()
	 * @generated
	 * @ordered
	 */
	protected static final DayOfWeek DAY_OF_WEEK_EDEFAULT = DayOfWeek.MONDAY;

	/**
	 * The cached value of the '{@link #getDayOfWeek() <em>Day Of Week</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDayOfWeek()
	 * @generated
	 * @ordered
	 */
	protected DayOfWeek dayOfWeek = DAY_OF_WEEK_EDEFAULT;

	/**
	 * The default value of the '{@link #getHour() <em>Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHour()
	 * @generated
	 * @ordered
	 */
	protected static final Integer HOUR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHour() <em>Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHour()
	 * @generated
	 * @ordered
	 */
	protected Integer hour = HOUR_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinute() <em>Minute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinute()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MINUTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinute() <em>Minute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinute()
	 * @generated
	 * @ordered
	 */
	protected Integer minute = MINUTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecond() <em>Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecond()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SECOND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecond() <em>Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecond()
	 * @generated
	 * @ordered
	 */
	protected Integer second = SECOND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecurringPointInTimeEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EventsPackage.Literals.RECURRING_POINT_IN_TIME_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecurringType getRecurringType() {
		return recurringType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecurringType(RecurringType newRecurringType) {
		RecurringType oldRecurringType = recurringType;
		recurringType = newRecurringType == null ? RECURRING_TYPE_EDEFAULT : newRecurringType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.RECURRING_POINT_IN_TIME_EVENT__RECURRING_TYPE, oldRecurringType, recurringType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getFrequencyFactor() {
		return frequencyFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrequencyFactor(Integer newFrequencyFactor) {
		Integer oldFrequencyFactor = frequencyFactor;
		frequencyFactor = newFrequencyFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.RECURRING_POINT_IN_TIME_EVENT__FREQUENCY_FACTOR, oldFrequencyFactor, frequencyFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMonth() {
		return month;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonth(Integer newMonth) {
		Integer oldMonth = month;
		month = newMonth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.RECURRING_POINT_IN_TIME_EVENT__MONTH, oldMonth, month));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getDayOfMonth() {
		return dayOfMonth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDayOfMonth(Integer newDayOfMonth) {
		Integer oldDayOfMonth = dayOfMonth;
		dayOfMonth = newDayOfMonth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.RECURRING_POINT_IN_TIME_EVENT__DAY_OF_MONTH, oldDayOfMonth, dayOfMonth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DayOfWeek getDayOfWeek() {
		return dayOfWeek;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDayOfWeek(DayOfWeek newDayOfWeek) {
		DayOfWeek oldDayOfWeek = dayOfWeek;
		dayOfWeek = newDayOfWeek == null ? DAY_OF_WEEK_EDEFAULT : newDayOfWeek;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.RECURRING_POINT_IN_TIME_EVENT__DAY_OF_WEEK, oldDayOfWeek, dayOfWeek));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getHour() {
		return hour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHour(Integer newHour) {
		Integer oldHour = hour;
		hour = newHour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.RECURRING_POINT_IN_TIME_EVENT__HOUR, oldHour, hour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMinute() {
		return minute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinute(Integer newMinute) {
		Integer oldMinute = minute;
		minute = newMinute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.RECURRING_POINT_IN_TIME_EVENT__MINUTE, oldMinute, minute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getSecond() {
		return second;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecond(Integer newSecond) {
		Integer oldSecond = second;
		second = newSecond;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.RECURRING_POINT_IN_TIME_EVENT__SECOND, oldSecond, second));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EventsPackage.RECURRING_POINT_IN_TIME_EVENT__RECURRING_TYPE:
				return getRecurringType();
			case EventsPackage.RECURRING_POINT_IN_TIME_EVENT__FREQUENCY_FACTOR:
				return getFrequencyFactor();
			case EventsPackage.RECURRING_POINT_IN_TIME_EVENT__MONTH:
				return getMonth();
			case EventsPackage.RECURRING_POINT_IN_TIME_EVENT__DAY_OF_MONTH:
				return getDayOfMonth();
			case EventsPackage.RECURRING_POINT_IN_TIME_EVENT__DAY_OF_WEEK:
				return getDayOfWeek();
			case EventsPackage.RECURRING_POINT_IN_TIME_EVENT__HOUR:
				return getHour();
			case EventsPackage.RECURRING_POINT_IN_TIME_EVENT__MINUTE:
				return getMinute();
			case EventsPackage.RECURRING_POINT_IN_TIME_EVENT__SECOND:
				return getSecond();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EventsPackage.RECURRING_POINT_IN_TIME_EVENT__RECURRING_TYPE:
				setRecurringType((RecurringType)newValue);
				return;
			case EventsPackage.RECURRING_POINT_IN_TIME_EVENT__FREQUENCY_FACTOR:
				setFrequencyFactor((Integer)newValue);
				return;
			case EventsPackage.RECURRING_POINT_IN_TIME_EVENT__MONTH:
				setMonth((Integer)newValue);
				return;
			case EventsPackage.RECURRING_POINT_IN_TIME_EVENT__DAY_OF_MONTH:
				setDayOfMonth((Integer)newValue);
				return;
			case EventsPackage.RECURRING_POINT_IN_TIME_EVENT__DAY_OF_WEEK:
				setDayOfWeek((DayOfWeek)newValue);
				return;
			case EventsPackage.RECURRING_POINT_IN_TIME_EVENT__HOUR:
				setHour((Integer)newValue);
				return;
			case EventsPackage.RECURRING_POINT_IN_TIME_EVENT__MINUTE:
				setMinute((Integer)newValue);
				return;
			case EventsPackage.RECURRING_POINT_IN_TIME_EVENT__SECOND:
				setSecond((Integer)newValue);
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
			case EventsPackage.RECURRING_POINT_IN_TIME_EVENT__RECURRING_TYPE:
				setRecurringType(RECURRING_TYPE_EDEFAULT);
				return;
			case EventsPackage.RECURRING_POINT_IN_TIME_EVENT__FREQUENCY_FACTOR:
				setFrequencyFactor(FREQUENCY_FACTOR_EDEFAULT);
				return;
			case EventsPackage.RECURRING_POINT_IN_TIME_EVENT__MONTH:
				setMonth(MONTH_EDEFAULT);
				return;
			case EventsPackage.RECURRING_POINT_IN_TIME_EVENT__DAY_OF_MONTH:
				setDayOfMonth(DAY_OF_MONTH_EDEFAULT);
				return;
			case EventsPackage.RECURRING_POINT_IN_TIME_EVENT__DAY_OF_WEEK:
				setDayOfWeek(DAY_OF_WEEK_EDEFAULT);
				return;
			case EventsPackage.RECURRING_POINT_IN_TIME_EVENT__HOUR:
				setHour(HOUR_EDEFAULT);
				return;
			case EventsPackage.RECURRING_POINT_IN_TIME_EVENT__MINUTE:
				setMinute(MINUTE_EDEFAULT);
				return;
			case EventsPackage.RECURRING_POINT_IN_TIME_EVENT__SECOND:
				setSecond(SECOND_EDEFAULT);
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
			case EventsPackage.RECURRING_POINT_IN_TIME_EVENT__RECURRING_TYPE:
				return recurringType != RECURRING_TYPE_EDEFAULT;
			case EventsPackage.RECURRING_POINT_IN_TIME_EVENT__FREQUENCY_FACTOR:
				return FREQUENCY_FACTOR_EDEFAULT == null ? frequencyFactor != null : !FREQUENCY_FACTOR_EDEFAULT.equals(frequencyFactor);
			case EventsPackage.RECURRING_POINT_IN_TIME_EVENT__MONTH:
				return MONTH_EDEFAULT == null ? month != null : !MONTH_EDEFAULT.equals(month);
			case EventsPackage.RECURRING_POINT_IN_TIME_EVENT__DAY_OF_MONTH:
				return DAY_OF_MONTH_EDEFAULT == null ? dayOfMonth != null : !DAY_OF_MONTH_EDEFAULT.equals(dayOfMonth);
			case EventsPackage.RECURRING_POINT_IN_TIME_EVENT__DAY_OF_WEEK:
				return dayOfWeek != DAY_OF_WEEK_EDEFAULT;
			case EventsPackage.RECURRING_POINT_IN_TIME_EVENT__HOUR:
				return HOUR_EDEFAULT == null ? hour != null : !HOUR_EDEFAULT.equals(hour);
			case EventsPackage.RECURRING_POINT_IN_TIME_EVENT__MINUTE:
				return MINUTE_EDEFAULT == null ? minute != null : !MINUTE_EDEFAULT.equals(minute);
			case EventsPackage.RECURRING_POINT_IN_TIME_EVENT__SECOND:
				return SECOND_EDEFAULT == null ? second != null : !SECOND_EDEFAULT.equals(second);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (recurringType: ");
		result.append(recurringType);
		result.append(", frequencyFactor: ");
		result.append(frequencyFactor);
		result.append(", month: ");
		result.append(month);
		result.append(", dayOfMonth: ");
		result.append(dayOfMonth);
		result.append(", dayOfWeek: ");
		result.append(dayOfWeek);
		result.append(", hour: ");
		result.append(hour);
		result.append(", minute: ");
		result.append(minute);
		result.append(", second: ");
		result.append(second);
		result.append(')');
		return result.toString();
	}

} //RecurringPointInTimeEventImpl

/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.WarehouseProcess.Events;

import CWM.WarehouseProcess.DataType.DayOfWeek;
import CWM.WarehouseProcess.DataType.RecurringType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recurring Point In Time Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.WarehouseProcess.Events.RecurringPointInTimeEvent#getRecurringType <em>Recurring Type</em>}</li>
 *   <li>{@link CWM.WarehouseProcess.Events.RecurringPointInTimeEvent#getFrequencyFactor <em>Frequency Factor</em>}</li>
 *   <li>{@link CWM.WarehouseProcess.Events.RecurringPointInTimeEvent#getMonth <em>Month</em>}</li>
 *   <li>{@link CWM.WarehouseProcess.Events.RecurringPointInTimeEvent#getDayOfMonth <em>Day Of Month</em>}</li>
 *   <li>{@link CWM.WarehouseProcess.Events.RecurringPointInTimeEvent#getDayOfWeek <em>Day Of Week</em>}</li>
 *   <li>{@link CWM.WarehouseProcess.Events.RecurringPointInTimeEvent#getHour <em>Hour</em>}</li>
 *   <li>{@link CWM.WarehouseProcess.Events.RecurringPointInTimeEvent#getMinute <em>Minute</em>}</li>
 *   <li>{@link CWM.WarehouseProcess.Events.RecurringPointInTimeEvent#getSecond <em>Second</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.WarehouseProcess.Events.EventsPackage#getRecurringPointInTimeEvent()
 * @model
 * @generated
 */
public interface RecurringPointInTimeEvent extends PointInTimeEvent {
	/**
	 * Returns the value of the '<em><b>Recurring Type</b></em>' attribute.
	 * The literals are from the enumeration {@link CWM.WarehouseProcess.DataType.RecurringType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recurring Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recurring Type</em>' attribute.
	 * @see CWM.WarehouseProcess.DataType.RecurringType
	 * @see #setRecurringType(RecurringType)
	 * @see CWM.WarehouseProcess.Events.EventsPackage#getRecurringPointInTimeEvent_RecurringType()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	RecurringType getRecurringType();

	/**
	 * Sets the value of the '{@link CWM.WarehouseProcess.Events.RecurringPointInTimeEvent#getRecurringType <em>Recurring Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recurring Type</em>' attribute.
	 * @see CWM.WarehouseProcess.DataType.RecurringType
	 * @see #getRecurringType()
	 * @generated
	 */
	void setRecurringType(RecurringType value);

	/**
	 * Returns the value of the '<em><b>Frequency Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frequency Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency Factor</em>' attribute.
	 * @see #setFrequencyFactor(Integer)
	 * @see CWM.WarehouseProcess.Events.EventsPackage#getRecurringPointInTimeEvent_FrequencyFactor()
	 * @model unique="false" dataType="CWM.Core.Integer" required="true" ordered="false"
	 * @generated
	 */
	Integer getFrequencyFactor();

	/**
	 * Sets the value of the '{@link CWM.WarehouseProcess.Events.RecurringPointInTimeEvent#getFrequencyFactor <em>Frequency Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency Factor</em>' attribute.
	 * @see #getFrequencyFactor()
	 * @generated
	 */
	void setFrequencyFactor(Integer value);

	/**
	 * Returns the value of the '<em><b>Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Month</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Month</em>' attribute.
	 * @see #setMonth(Integer)
	 * @see CWM.WarehouseProcess.Events.EventsPackage#getRecurringPointInTimeEvent_Month()
	 * @model unique="false" dataType="CWM.Core.Integer" ordered="false"
	 * @generated
	 */
	Integer getMonth();

	/**
	 * Sets the value of the '{@link CWM.WarehouseProcess.Events.RecurringPointInTimeEvent#getMonth <em>Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Month</em>' attribute.
	 * @see #getMonth()
	 * @generated
	 */
	void setMonth(Integer value);

	/**
	 * Returns the value of the '<em><b>Day Of Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Day Of Month</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Day Of Month</em>' attribute.
	 * @see #setDayOfMonth(Integer)
	 * @see CWM.WarehouseProcess.Events.EventsPackage#getRecurringPointInTimeEvent_DayOfMonth()
	 * @model unique="false" dataType="CWM.Core.Integer" ordered="false"
	 * @generated
	 */
	Integer getDayOfMonth();

	/**
	 * Sets the value of the '{@link CWM.WarehouseProcess.Events.RecurringPointInTimeEvent#getDayOfMonth <em>Day Of Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Day Of Month</em>' attribute.
	 * @see #getDayOfMonth()
	 * @generated
	 */
	void setDayOfMonth(Integer value);

	/**
	 * Returns the value of the '<em><b>Day Of Week</b></em>' attribute.
	 * The literals are from the enumeration {@link CWM.WarehouseProcess.DataType.DayOfWeek}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Day Of Week</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Day Of Week</em>' attribute.
	 * @see CWM.WarehouseProcess.DataType.DayOfWeek
	 * @see #setDayOfWeek(DayOfWeek)
	 * @see CWM.WarehouseProcess.Events.EventsPackage#getRecurringPointInTimeEvent_DayOfWeek()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	DayOfWeek getDayOfWeek();

	/**
	 * Sets the value of the '{@link CWM.WarehouseProcess.Events.RecurringPointInTimeEvent#getDayOfWeek <em>Day Of Week</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Day Of Week</em>' attribute.
	 * @see CWM.WarehouseProcess.DataType.DayOfWeek
	 * @see #getDayOfWeek()
	 * @generated
	 */
	void setDayOfWeek(DayOfWeek value);

	/**
	 * Returns the value of the '<em><b>Hour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hour</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hour</em>' attribute.
	 * @see #setHour(Integer)
	 * @see CWM.WarehouseProcess.Events.EventsPackage#getRecurringPointInTimeEvent_Hour()
	 * @model unique="false" dataType="CWM.Core.Integer" ordered="false"
	 * @generated
	 */
	Integer getHour();

	/**
	 * Sets the value of the '{@link CWM.WarehouseProcess.Events.RecurringPointInTimeEvent#getHour <em>Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hour</em>' attribute.
	 * @see #getHour()
	 * @generated
	 */
	void setHour(Integer value);

	/**
	 * Returns the value of the '<em><b>Minute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minute</em>' attribute.
	 * @see #setMinute(Integer)
	 * @see CWM.WarehouseProcess.Events.EventsPackage#getRecurringPointInTimeEvent_Minute()
	 * @model unique="false" dataType="CWM.Core.Integer" ordered="false"
	 * @generated
	 */
	Integer getMinute();

	/**
	 * Sets the value of the '{@link CWM.WarehouseProcess.Events.RecurringPointInTimeEvent#getMinute <em>Minute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minute</em>' attribute.
	 * @see #getMinute()
	 * @generated
	 */
	void setMinute(Integer value);

	/**
	 * Returns the value of the '<em><b>Second</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second</em>' attribute.
	 * @see #setSecond(Integer)
	 * @see CWM.WarehouseProcess.Events.EventsPackage#getRecurringPointInTimeEvent_Second()
	 * @model unique="false" dataType="CWM.Core.Integer" required="true" ordered="false"
	 * @generated
	 */
	Integer getSecond();

	/**
	 * Sets the value of the '{@link CWM.WarehouseProcess.Events.RecurringPointInTimeEvent#getSecond <em>Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second</em>' attribute.
	 * @see #getSecond()
	 * @generated
	 */
	void setSecond(Integer value);

} // RecurringPointInTimeEvent

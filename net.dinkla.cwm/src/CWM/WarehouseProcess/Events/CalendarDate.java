/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.WarehouseProcess.Events;

import CWM.Core.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calendar Date</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.WarehouseProcess.Events.CalendarDate#getSpecificDate <em>Specific Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.WarehouseProcess.Events.EventsPackage#getCalendarDate()
 * @model
 * @generated
 */
public interface CalendarDate extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Specific Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specific Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specific Date</em>' attribute.
	 * @see #setSpecificDate(String)
	 * @see CWM.WarehouseProcess.Events.EventsPackage#getCalendarDate_SpecificDate()
	 * @model unique="false" dataType="CWM.Core.Time" required="true" ordered="false"
	 * @generated
	 */
	String getSpecificDate();

	/**
	 * Sets the value of the '{@link CWM.WarehouseProcess.Events.CalendarDate#getSpecificDate <em>Specific Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specific Date</em>' attribute.
	 * @see #getSpecificDate()
	 * @generated
	 */
	void setSpecificDate(String value);

} // CalendarDate

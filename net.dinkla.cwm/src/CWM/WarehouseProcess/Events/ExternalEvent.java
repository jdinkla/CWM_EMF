/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.WarehouseProcess.Events;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.WarehouseProcess.Events.ExternalEvent#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.WarehouseProcess.Events.EventsPackage#getExternalEvent()
 * @model
 * @generated
 */
public interface ExternalEvent extends WarehouseEvent {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see CWM.WarehouseProcess.Events.EventsPackage#getExternalEvent_Description()
	 * @model unique="false" dataType="CWM.Core.String" required="true" ordered="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link CWM.WarehouseProcess.Events.ExternalEvent#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // ExternalEvent

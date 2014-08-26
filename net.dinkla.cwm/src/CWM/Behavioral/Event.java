/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Behavioral;

import CWM.Core.ModelElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Behavioral.Event#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Behavioral.BehavioralPackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Behavioral.Parameter}.
	 * It is bidirectional and its opposite is '{@link CWM.Behavioral.Parameter#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see CWM.Behavioral.BehavioralPackage#getEvent_Parameter()
	 * @see CWM.Behavioral.Parameter#getEvent
	 * @model opposite="event" containment="true"
	 * @generated
	 */
	EList<Parameter> getParameter();

} // Event

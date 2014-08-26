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
 * A representation of the model object '<em><b>Call Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Behavioral.CallAction#getOperation <em>Operation</em>}</li>
 *   <li>{@link CWM.Behavioral.CallAction#getActualArgument <em>Actual Argument</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Behavioral.BehavioralPackage#getCallAction()
 * @model
 * @generated
 */
public interface CallAction extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' reference.
	 * @see #setOperation(Operation)
	 * @see CWM.Behavioral.BehavioralPackage#getCallAction_Operation()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Operation getOperation();

	/**
	 * Sets the value of the '{@link CWM.Behavioral.CallAction#getOperation <em>Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(Operation value);

	/**
	 * Returns the value of the '<em><b>Actual Argument</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Behavioral.Argument}.
	 * It is bidirectional and its opposite is '{@link CWM.Behavioral.Argument#getCallAction <em>Call Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Argument</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Argument</em>' containment reference list.
	 * @see CWM.Behavioral.BehavioralPackage#getCallAction_ActualArgument()
	 * @see CWM.Behavioral.Argument#getCallAction
	 * @model opposite="callAction" containment="true"
	 * @generated
	 */
	EList<Argument> getActualArgument();

} // CallAction

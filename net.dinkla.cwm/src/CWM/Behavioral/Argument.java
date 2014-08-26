/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Behavioral;

import CWM.Core.Expression;
import CWM.Core.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Behavioral.Argument#getValue <em>Value</em>}</li>
 *   <li>{@link CWM.Behavioral.Argument#getCallAction <em>Call Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Behavioral.BehavioralPackage#getArgument()
 * @model
 * @generated
 */
public interface Argument extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Expression)
	 * @see CWM.Behavioral.BehavioralPackage#getArgument_Value()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Expression getValue();

	/**
	 * Sets the value of the '{@link CWM.Behavioral.Argument#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Expression value);

	/**
	 * Returns the value of the '<em><b>Call Action</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link CWM.Behavioral.CallAction#getActualArgument <em>Actual Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Call Action</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call Action</em>' container reference.
	 * @see #setCallAction(CallAction)
	 * @see CWM.Behavioral.BehavioralPackage#getArgument_CallAction()
	 * @see CWM.Behavioral.CallAction#getActualArgument
	 * @model opposite="actualArgument" transient="false" ordered="false"
	 * @generated
	 */
	CallAction getCallAction();

	/**
	 * Sets the value of the '{@link CWM.Behavioral.Argument#getCallAction <em>Call Action</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Call Action</em>' container reference.
	 * @see #getCallAction()
	 * @generated
	 */
	void setCallAction(CallAction value);

} // Argument

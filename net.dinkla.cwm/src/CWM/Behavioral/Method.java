/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Behavioral;

import CWM.Core.ProcedureExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Behavioral.Method#getBody <em>Body</em>}</li>
 *   <li>{@link CWM.Behavioral.Method#getSpecification <em>Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Behavioral.BehavioralPackage#getMethod()
 * @model
 * @generated
 */
public interface Method extends BehavioralFeature {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(ProcedureExpression)
	 * @see CWM.Behavioral.BehavioralPackage#getMethod_Body()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ProcedureExpression getBody();

	/**
	 * Sets the value of the '{@link CWM.Behavioral.Method#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(ProcedureExpression value);

	/**
	 * Returns the value of the '<em><b>Specification</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CWM.Behavioral.Operation#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification</em>' reference.
	 * @see #setSpecification(Operation)
	 * @see CWM.Behavioral.BehavioralPackage#getMethod_Specification()
	 * @see CWM.Behavioral.Operation#getMethod
	 * @model opposite="method" required="true" ordered="false"
	 * @generated
	 */
	Operation getSpecification();

	/**
	 * Sets the value of the '{@link CWM.Behavioral.Method#getSpecification <em>Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' reference.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(Operation value);

} // Method

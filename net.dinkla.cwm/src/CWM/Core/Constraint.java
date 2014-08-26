/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Core.Constraint#getBody <em>Body</em>}</li>
 *   <li>{@link CWM.Core.Constraint#getConstrainedElement <em>Constrained Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Core.CorePackage#getConstraint()
 * @model
 * @generated
 */
public interface Constraint extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(BooleanExpression)
	 * @see CWM.Core.CorePackage#getConstraint_Body()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	BooleanExpression getBody();

	/**
	 * Sets the value of the '{@link CWM.Core.Constraint#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(BooleanExpression value);

	/**
	 * Returns the value of the '<em><b>Constrained Element</b></em>' reference list.
	 * The list contents are of type {@link CWM.Core.ModelElement}.
	 * It is bidirectional and its opposite is '{@link CWM.Core.ModelElement#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constrained Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constrained Element</em>' reference list.
	 * @see CWM.Core.CorePackage#getConstraint_ConstrainedElement()
	 * @see CWM.Core.ModelElement#getConstraint
	 * @model opposite="constraint"
	 * @generated
	 */
	EList<ModelElement> getConstrainedElement();

} // Constraint

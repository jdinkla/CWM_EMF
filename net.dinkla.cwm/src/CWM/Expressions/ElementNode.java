/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Expressions;

import CWM.Core.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Expressions.ElementNode#getModelElement <em>Model Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Expressions.ExpressionsPackage#getElementNode()
 * @model
 * @generated
 */
public interface ElementNode extends ExpressionNode {
	/**
	 * Returns the value of the '<em><b>Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Element</em>' reference.
	 * @see #setModelElement(ModelElement)
	 * @see CWM.Expressions.ExpressionsPackage#getElementNode_ModelElement()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ModelElement getModelElement();

	/**
	 * Sets the value of the '{@link CWM.Expressions.ElementNode#getModelElement <em>Model Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Element</em>' reference.
	 * @see #getModelElement()
	 * @generated
	 */
	void setModelElement(ModelElement value);

} // ElementNode

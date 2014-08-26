/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.CwmTransformation;

import CWM.Expressions.ExpressionNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation Tree</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.CwmTransformation.TransformationTree#getType <em>Type</em>}</li>
 *   <li>{@link CWM.CwmTransformation.TransformationTree#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.CwmTransformation.CwmTransformationPackage#getTransformationTree()
 * @model
 * @generated
 */
public interface TransformationTree extends Transformation {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link CWM.CwmTransformation.TreeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see CWM.CwmTransformation.TreeType
	 * @see #setType(TreeType)
	 * @see CWM.CwmTransformation.CwmTransformationPackage#getTransformationTree_Type()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	TreeType getType();

	/**
	 * Sets the value of the '{@link CWM.CwmTransformation.TransformationTree#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see CWM.CwmTransformation.TreeType
	 * @see #getType()
	 * @generated
	 */
	void setType(TreeType value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(ExpressionNode)
	 * @see CWM.CwmTransformation.CwmTransformationPackage#getTransformationTree_Body()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ExpressionNode getBody();

	/**
	 * Sets the value of the '{@link CWM.CwmTransformation.TransformationTree#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(ExpressionNode value);

} // TransformationTree

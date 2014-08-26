/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Expressions;

import CWM.Core.Classifier;
import CWM.Core.Element;
import CWM.Core.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Expressions.ExpressionNode#getExpression <em>Expression</em>}</li>
 *   <li>{@link CWM.Expressions.ExpressionNode#getFeatureNode <em>Feature Node</em>}</li>
 *   <li>{@link CWM.Expressions.ExpressionNode#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Expressions.ExpressionsPackage#getExpressionNode()
 * @model
 * @generated
 */
public interface ExpressionNode extends Element {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see CWM.Expressions.ExpressionsPackage#getExpressionNode_Expression()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link CWM.Expressions.ExpressionNode#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Feature Node</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link CWM.Expressions.FeatureNode#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Node</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Node</em>' container reference.
	 * @see #setFeatureNode(FeatureNode)
	 * @see CWM.Expressions.ExpressionsPackage#getExpressionNode_FeatureNode()
	 * @see CWM.Expressions.FeatureNode#getArgument
	 * @model opposite="argument" transient="false" ordered="false"
	 * @generated
	 */
	FeatureNode getFeatureNode();

	/**
	 * Sets the value of the '{@link CWM.Expressions.ExpressionNode#getFeatureNode <em>Feature Node</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Node</em>' container reference.
	 * @see #getFeatureNode()
	 * @generated
	 */
	void setFeatureNode(FeatureNode value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Classifier)
	 * @see CWM.Expressions.ExpressionsPackage#getExpressionNode_Type()
	 * @model ordered="false"
	 * @generated
	 */
	Classifier getType();

	/**
	 * Sets the value of the '{@link CWM.Expressions.ExpressionNode#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Classifier value);

} // ExpressionNode

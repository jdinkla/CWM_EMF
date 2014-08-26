/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Expressions;

import CWM.Core.Feature;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Expressions.FeatureNode#getArgument <em>Argument</em>}</li>
 *   <li>{@link CWM.Expressions.FeatureNode#getFeature <em>Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Expressions.ExpressionsPackage#getFeatureNode()
 * @model
 * @generated
 */
public interface FeatureNode extends ExpressionNode {
	/**
	 * Returns the value of the '<em><b>Argument</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Expressions.ExpressionNode}.
	 * It is bidirectional and its opposite is '{@link CWM.Expressions.ExpressionNode#getFeatureNode <em>Feature Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument</em>' containment reference list.
	 * @see CWM.Expressions.ExpressionsPackage#getFeatureNode_Argument()
	 * @see CWM.Expressions.ExpressionNode#getFeatureNode
	 * @model opposite="featureNode" containment="true"
	 * @generated
	 */
	EList<ExpressionNode> getArgument();

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(Feature)
	 * @see CWM.Expressions.ExpressionsPackage#getFeatureNode_Feature()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Feature getFeature();

	/**
	 * Sets the value of the '{@link CWM.Expressions.FeatureNode#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(Feature value);

} // FeatureNode

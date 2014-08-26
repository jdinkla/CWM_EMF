/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Expressions;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expressions container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Expressions.Expressions_container#getExpressionNode <em>Expression Node</em>}</li>
 *   <li>{@link CWM.Expressions.Expressions_container#getConstantNode <em>Constant Node</em>}</li>
 *   <li>{@link CWM.Expressions.Expressions_container#getElementNode <em>Element Node</em>}</li>
 *   <li>{@link CWM.Expressions.Expressions_container#getFeatureNode <em>Feature Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Expressions.ExpressionsPackage#getExpressions_container()
 * @model
 * @generated
 */
public interface Expressions_container extends EObject {
	/**
	 * Returns the value of the '<em><b>Expression Node</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Expressions.ExpressionNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression Node</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression Node</em>' containment reference list.
	 * @see CWM.Expressions.ExpressionsPackage#getExpressions_container_ExpressionNode()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExpressionNode> getExpressionNode();

	/**
	 * Returns the value of the '<em><b>Constant Node</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Expressions.ConstantNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant Node</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant Node</em>' containment reference list.
	 * @see CWM.Expressions.ExpressionsPackage#getExpressions_container_ConstantNode()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConstantNode> getConstantNode();

	/**
	 * Returns the value of the '<em><b>Element Node</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Expressions.ElementNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Node</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Node</em>' containment reference list.
	 * @see CWM.Expressions.ExpressionsPackage#getExpressions_container_ElementNode()
	 * @model containment="true"
	 * @generated
	 */
	EList<ElementNode> getElementNode();

	/**
	 * Returns the value of the '<em><b>Feature Node</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Expressions.FeatureNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Node</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Node</em>' containment reference list.
	 * @see CWM.Expressions.ExpressionsPackage#getExpressions_container_FeatureNode()
	 * @model containment="true"
	 * @generated
	 */
	EList<FeatureNode> getFeatureNode();

} // Expressions_container

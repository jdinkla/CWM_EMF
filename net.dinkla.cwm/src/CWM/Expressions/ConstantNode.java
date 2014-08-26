/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Expressions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Expressions.ConstantNode#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Expressions.ExpressionsPackage#getConstantNode()
 * @model
 * @generated
 */
public interface ConstantNode extends ExpressionNode {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Object)
	 * @see CWM.Expressions.ExpressionsPackage#getConstantNode_Value()
	 * @model unique="false" dataType="CWM.Core.Any" required="true" ordered="false"
	 * @generated
	 */
	Object getValue();

	/**
	 * Sets the value of the '{@link CWM.Expressions.ConstantNode#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Object value);

} // ConstantNode

/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Olap;

import CWM.Expressions.ExpressionNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coded Level</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Olap.CodedLevel#getEncoding <em>Encoding</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Olap.OlapPackage#getCodedLevel()
 * @model
 * @generated
 */
public interface CodedLevel extends Level {
	/**
	 * Returns the value of the '<em><b>Encoding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encoding</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encoding</em>' containment reference.
	 * @see #setEncoding(ExpressionNode)
	 * @see CWM.Olap.OlapPackage#getCodedLevel_Encoding()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ExpressionNode getEncoding();

	/**
	 * Sets the value of the '{@link CWM.Olap.CodedLevel#getEncoding <em>Encoding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encoding</em>' containment reference.
	 * @see #getEncoding()
	 * @generated
	 */
	void setEncoding(ExpressionNode value);

} // CodedLevel

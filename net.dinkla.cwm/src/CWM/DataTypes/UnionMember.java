/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.DataTypes;

import CWM.Core.Attribute;
import CWM.Core.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Union Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.DataTypes.UnionMember#getMemberCase <em>Member Case</em>}</li>
 *   <li>{@link CWM.DataTypes.UnionMember#getIsDefault <em>Is Default</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.DataTypes.DataTypesPackage#getUnionMember()
 * @model
 * @generated
 */
public interface UnionMember extends Attribute {
	/**
	 * Returns the value of the '<em><b>Member Case</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member Case</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Case</em>' containment reference.
	 * @see #setMemberCase(Expression)
	 * @see CWM.DataTypes.DataTypesPackage#getUnionMember_MemberCase()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Expression getMemberCase();

	/**
	 * Sets the value of the '{@link CWM.DataTypes.UnionMember#getMemberCase <em>Member Case</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member Case</em>' containment reference.
	 * @see #getMemberCase()
	 * @generated
	 */
	void setMemberCase(Expression value);

	/**
	 * Returns the value of the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Default</em>' attribute.
	 * @see #setIsDefault(Boolean)
	 * @see CWM.DataTypes.DataTypesPackage#getUnionMember_IsDefault()
	 * @model unique="false" dataType="CWM.Core.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsDefault();

	/**
	 * Sets the value of the '{@link CWM.DataTypes.UnionMember#getIsDefault <em>Is Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Default</em>' attribute.
	 * @see #getIsDefault()
	 * @generated
	 */
	void setIsDefault(Boolean value);

} // UnionMember

/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningData;

import CWM.Core.Attribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Attribute Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.MiningCore.MiningData.SetAttributeAssignment#getSetIdAttribute <em>Set Id Attribute</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.SetAttributeAssignment#getMemberAttribute <em>Member Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.MiningCore.MiningData.MiningDataPackage#getSetAttributeAssignment()
 * @model
 * @generated
 */
public interface SetAttributeAssignment extends AttributeAssignment {
	/**
	 * Returns the value of the '<em><b>Set Id Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Id Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Id Attribute</em>' reference.
	 * @see #setSetIdAttribute(Attribute)
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getSetAttributeAssignment_SetIdAttribute()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Attribute getSetIdAttribute();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.MiningData.SetAttributeAssignment#getSetIdAttribute <em>Set Id Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Id Attribute</em>' reference.
	 * @see #getSetIdAttribute()
	 * @generated
	 */
	void setSetIdAttribute(Attribute value);

	/**
	 * Returns the value of the '<em><b>Member Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Attribute</em>' reference.
	 * @see #setMemberAttribute(Attribute)
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getSetAttributeAssignment_MemberAttribute()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Attribute getMemberAttribute();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.MiningData.SetAttributeAssignment#getMemberAttribute <em>Member Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member Attribute</em>' reference.
	 * @see #getMemberAttribute()
	 * @generated
	 */
	void setMemberAttribute(Attribute value);

} // SetAttributeAssignment

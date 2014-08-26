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
 * A representation of the model object '<em><b>Pivot Attribute Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.MiningCore.MiningData.PivotAttributeAssignment#getSetIdAttribute <em>Set Id Attribute</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.PivotAttributeAssignment#getNameAttribute <em>Name Attribute</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.PivotAttributeAssignment#getValueAttribute <em>Value Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.MiningCore.MiningData.MiningDataPackage#getPivotAttributeAssignment()
 * @model
 * @generated
 */
public interface PivotAttributeAssignment extends AttributeAssignment {
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
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getPivotAttributeAssignment_SetIdAttribute()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Attribute getSetIdAttribute();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.MiningData.PivotAttributeAssignment#getSetIdAttribute <em>Set Id Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Id Attribute</em>' reference.
	 * @see #getSetIdAttribute()
	 * @generated
	 */
	void setSetIdAttribute(Attribute value);

	/**
	 * Returns the value of the '<em><b>Name Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Attribute</em>' reference.
	 * @see #setNameAttribute(Attribute)
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getPivotAttributeAssignment_NameAttribute()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Attribute getNameAttribute();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.MiningData.PivotAttributeAssignment#getNameAttribute <em>Name Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Attribute</em>' reference.
	 * @see #getNameAttribute()
	 * @generated
	 */
	void setNameAttribute(Attribute value);

	/**
	 * Returns the value of the '<em><b>Value Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Attribute</em>' reference.
	 * @see #setValueAttribute(Attribute)
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getPivotAttributeAssignment_ValueAttribute()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Attribute getValueAttribute();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.MiningData.PivotAttributeAssignment#getValueAttribute <em>Value Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Attribute</em>' reference.
	 * @see #getValueAttribute()
	 * @generated
	 */
	void setValueAttribute(Attribute value);

} // PivotAttributeAssignment

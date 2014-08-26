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
 * A representation of the model object '<em><b>Mining Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.MiningCore.MiningData.MiningAttribute#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.MiningAttribute#getAttributeType <em>Attribute Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.MiningCore.MiningData.MiningDataPackage#getMiningAttribute()
 * @model abstract="true"
 * @generated
 */
public interface MiningAttribute extends Attribute {
	/**
	 * Returns the value of the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Name</em>' attribute.
	 * @see #setDisplayName(String)
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getMiningAttribute_DisplayName()
	 * @model unique="false" dataType="CWM.Core.String" required="true" ordered="false"
	 * @generated
	 */
	String getDisplayName();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.MiningData.MiningAttribute#getDisplayName <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Name</em>' attribute.
	 * @see #getDisplayName()
	 * @generated
	 */
	void setDisplayName(String value);

	/**
	 * Returns the value of the '<em><b>Attribute Type</b></em>' attribute.
	 * The literals are from the enumeration {@link CWM.MiningCore.MiningData.AttributeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Type</em>' attribute.
	 * @see CWM.MiningCore.MiningData.AttributeType
	 * @see #setAttributeType(AttributeType)
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getMiningAttribute_AttributeType()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	AttributeType getAttributeType();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.MiningData.MiningAttribute#getAttributeType <em>Attribute Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Type</em>' attribute.
	 * @see CWM.MiningCore.MiningData.AttributeType
	 * @see #getAttributeType()
	 * @generated
	 */
	void setAttributeType(AttributeType value);

} // MiningAttribute

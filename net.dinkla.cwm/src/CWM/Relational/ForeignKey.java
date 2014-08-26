/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Relational;

import CWM.KeysIndexes.KeyRelationship;

import CWM.Relational.Enumerations.DeferrabilityType;
import CWM.Relational.Enumerations.ReferentialRuleType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Relational.ForeignKey#getDeleteRule <em>Delete Rule</em>}</li>
 *   <li>{@link CWM.Relational.ForeignKey#getUpdateRule <em>Update Rule</em>}</li>
 *   <li>{@link CWM.Relational.ForeignKey#getDeferrability <em>Deferrability</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Relational.RelationalPackage#getForeignKey()
 * @model
 * @generated
 */
public interface ForeignKey extends KeyRelationship {
	/**
	 * Returns the value of the '<em><b>Delete Rule</b></em>' attribute.
	 * The literals are from the enumeration {@link CWM.Relational.Enumerations.ReferentialRuleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delete Rule</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete Rule</em>' attribute.
	 * @see CWM.Relational.Enumerations.ReferentialRuleType
	 * @see #setDeleteRule(ReferentialRuleType)
	 * @see CWM.Relational.RelationalPackage#getForeignKey_DeleteRule()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	ReferentialRuleType getDeleteRule();

	/**
	 * Sets the value of the '{@link CWM.Relational.ForeignKey#getDeleteRule <em>Delete Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete Rule</em>' attribute.
	 * @see CWM.Relational.Enumerations.ReferentialRuleType
	 * @see #getDeleteRule()
	 * @generated
	 */
	void setDeleteRule(ReferentialRuleType value);

	/**
	 * Returns the value of the '<em><b>Update Rule</b></em>' attribute.
	 * The literals are from the enumeration {@link CWM.Relational.Enumerations.ReferentialRuleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Update Rule</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Rule</em>' attribute.
	 * @see CWM.Relational.Enumerations.ReferentialRuleType
	 * @see #setUpdateRule(ReferentialRuleType)
	 * @see CWM.Relational.RelationalPackage#getForeignKey_UpdateRule()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	ReferentialRuleType getUpdateRule();

	/**
	 * Sets the value of the '{@link CWM.Relational.ForeignKey#getUpdateRule <em>Update Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Rule</em>' attribute.
	 * @see CWM.Relational.Enumerations.ReferentialRuleType
	 * @see #getUpdateRule()
	 * @generated
	 */
	void setUpdateRule(ReferentialRuleType value);

	/**
	 * Returns the value of the '<em><b>Deferrability</b></em>' attribute.
	 * The literals are from the enumeration {@link CWM.Relational.Enumerations.DeferrabilityType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deferrability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deferrability</em>' attribute.
	 * @see CWM.Relational.Enumerations.DeferrabilityType
	 * @see #setDeferrability(DeferrabilityType)
	 * @see CWM.Relational.RelationalPackage#getForeignKey_Deferrability()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	DeferrabilityType getDeferrability();

	/**
	 * Sets the value of the '{@link CWM.Relational.ForeignKey#getDeferrability <em>Deferrability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deferrability</em>' attribute.
	 * @see CWM.Relational.Enumerations.DeferrabilityType
	 * @see #getDeferrability()
	 * @generated
	 */
	void setDeferrability(DeferrabilityType value);

} // ForeignKey

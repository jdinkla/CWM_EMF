/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Relational;

import CWM.Core.Attribute;

import CWM.Relational.Enumerations.NullableType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Relational.Column#getPrecision <em>Precision</em>}</li>
 *   <li>{@link CWM.Relational.Column#getScale <em>Scale</em>}</li>
 *   <li>{@link CWM.Relational.Column#getIsNullable <em>Is Nullable</em>}</li>
 *   <li>{@link CWM.Relational.Column#getLength <em>Length</em>}</li>
 *   <li>{@link CWM.Relational.Column#getCollationName <em>Collation Name</em>}</li>
 *   <li>{@link CWM.Relational.Column#getCharacterSetName <em>Character Set Name</em>}</li>
 *   <li>{@link CWM.Relational.Column#getOptionScopeColumnSet <em>Option Scope Column Set</em>}</li>
 *   <li>{@link CWM.Relational.Column#getReferencedTableType <em>Referenced Table Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Relational.RelationalPackage#getColumn()
 * @model
 * @generated
 */
public interface Column extends Attribute {
	/**
	 * Returns the value of the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precision</em>' attribute.
	 * @see #setPrecision(Integer)
	 * @see CWM.Relational.RelationalPackage#getColumn_Precision()
	 * @model unique="false" dataType="CWM.Core.Integer" ordered="false"
	 * @generated
	 */
	Integer getPrecision();

	/**
	 * Sets the value of the '{@link CWM.Relational.Column#getPrecision <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision</em>' attribute.
	 * @see #getPrecision()
	 * @generated
	 */
	void setPrecision(Integer value);

	/**
	 * Returns the value of the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale</em>' attribute.
	 * @see #setScale(Integer)
	 * @see CWM.Relational.RelationalPackage#getColumn_Scale()
	 * @model unique="false" dataType="CWM.Core.Integer" ordered="false"
	 * @generated
	 */
	Integer getScale();

	/**
	 * Sets the value of the '{@link CWM.Relational.Column#getScale <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale</em>' attribute.
	 * @see #getScale()
	 * @generated
	 */
	void setScale(Integer value);

	/**
	 * Returns the value of the '<em><b>Is Nullable</b></em>' attribute.
	 * The literals are from the enumeration {@link CWM.Relational.Enumerations.NullableType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Nullable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Nullable</em>' attribute.
	 * @see CWM.Relational.Enumerations.NullableType
	 * @see #setIsNullable(NullableType)
	 * @see CWM.Relational.RelationalPackage#getColumn_IsNullable()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	NullableType getIsNullable();

	/**
	 * Sets the value of the '{@link CWM.Relational.Column#getIsNullable <em>Is Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Nullable</em>' attribute.
	 * @see CWM.Relational.Enumerations.NullableType
	 * @see #getIsNullable()
	 * @generated
	 */
	void setIsNullable(NullableType value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(Integer)
	 * @see CWM.Relational.RelationalPackage#getColumn_Length()
	 * @model unique="false" dataType="CWM.Core.Integer" ordered="false"
	 * @generated
	 */
	Integer getLength();

	/**
	 * Sets the value of the '{@link CWM.Relational.Column#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(Integer value);

	/**
	 * Returns the value of the '<em><b>Collation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collation Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collation Name</em>' attribute.
	 * @see #setCollationName(String)
	 * @see CWM.Relational.RelationalPackage#getColumn_CollationName()
	 * @model unique="false" dataType="CWM.Core.String" required="true" ordered="false"
	 * @generated
	 */
	String getCollationName();

	/**
	 * Sets the value of the '{@link CWM.Relational.Column#getCollationName <em>Collation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collation Name</em>' attribute.
	 * @see #getCollationName()
	 * @generated
	 */
	void setCollationName(String value);

	/**
	 * Returns the value of the '<em><b>Character Set Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Character Set Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Character Set Name</em>' attribute.
	 * @see #setCharacterSetName(String)
	 * @see CWM.Relational.RelationalPackage#getColumn_CharacterSetName()
	 * @model unique="false" dataType="CWM.Core.String" required="true" ordered="false"
	 * @generated
	 */
	String getCharacterSetName();

	/**
	 * Sets the value of the '{@link CWM.Relational.Column#getCharacterSetName <em>Character Set Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Character Set Name</em>' attribute.
	 * @see #getCharacterSetName()
	 * @generated
	 */
	void setCharacterSetName(String value);

	/**
	 * Returns the value of the '<em><b>Option Scope Column Set</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CWM.Relational.NamedColumnSet#getOptionScopeColumn <em>Option Scope Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Option Scope Column Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option Scope Column Set</em>' reference.
	 * @see #setOptionScopeColumnSet(NamedColumnSet)
	 * @see CWM.Relational.RelationalPackage#getColumn_OptionScopeColumnSet()
	 * @see CWM.Relational.NamedColumnSet#getOptionScopeColumn
	 * @model opposite="optionScopeColumn" ordered="false"
	 * @generated
	 */
	NamedColumnSet getOptionScopeColumnSet();

	/**
	 * Sets the value of the '{@link CWM.Relational.Column#getOptionScopeColumnSet <em>Option Scope Column Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Option Scope Column Set</em>' reference.
	 * @see #getOptionScopeColumnSet()
	 * @generated
	 */
	void setOptionScopeColumnSet(NamedColumnSet value);

	/**
	 * Returns the value of the '<em><b>Referenced Table Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CWM.Relational.SQLStructuredType#getReferencingColumn <em>Referencing Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Table Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Table Type</em>' reference.
	 * @see #setReferencedTableType(SQLStructuredType)
	 * @see CWM.Relational.RelationalPackage#getColumn_ReferencedTableType()
	 * @see CWM.Relational.SQLStructuredType#getReferencingColumn
	 * @model opposite="referencingColumn" ordered="false"
	 * @generated
	 */
	SQLStructuredType getReferencedTableType();

	/**
	 * Sets the value of the '{@link CWM.Relational.Column#getReferencedTableType <em>Referenced Table Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Table Type</em>' reference.
	 * @see #getReferencedTableType()
	 * @generated
	 */
	void setReferencedTableType(SQLStructuredType value);

} // Column

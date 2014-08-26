/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Relational;

import CWM.Core.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SQL Simple Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Relational.SQLSimpleType#getCharacterMaximumLength <em>Character Maximum Length</em>}</li>
 *   <li>{@link CWM.Relational.SQLSimpleType#getCharacterOctetLength <em>Character Octet Length</em>}</li>
 *   <li>{@link CWM.Relational.SQLSimpleType#getNumericPrecision <em>Numeric Precision</em>}</li>
 *   <li>{@link CWM.Relational.SQLSimpleType#getNumericPrecisionRadix <em>Numeric Precision Radix</em>}</li>
 *   <li>{@link CWM.Relational.SQLSimpleType#getNumericScale <em>Numeric Scale</em>}</li>
 *   <li>{@link CWM.Relational.SQLSimpleType#getDateTimePrecision <em>Date Time Precision</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Relational.RelationalPackage#getSQLSimpleType()
 * @model
 * @generated
 */
public interface SQLSimpleType extends SQLDataType, DataType {
	/**
	 * Returns the value of the '<em><b>Character Maximum Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Character Maximum Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Character Maximum Length</em>' attribute.
	 * @see #setCharacterMaximumLength(Integer)
	 * @see CWM.Relational.RelationalPackage#getSQLSimpleType_CharacterMaximumLength()
	 * @model unique="false" dataType="CWM.Core.Integer" ordered="false"
	 * @generated
	 */
	Integer getCharacterMaximumLength();

	/**
	 * Sets the value of the '{@link CWM.Relational.SQLSimpleType#getCharacterMaximumLength <em>Character Maximum Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Character Maximum Length</em>' attribute.
	 * @see #getCharacterMaximumLength()
	 * @generated
	 */
	void setCharacterMaximumLength(Integer value);

	/**
	 * Returns the value of the '<em><b>Character Octet Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Character Octet Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Character Octet Length</em>' attribute.
	 * @see #setCharacterOctetLength(Integer)
	 * @see CWM.Relational.RelationalPackage#getSQLSimpleType_CharacterOctetLength()
	 * @model unique="false" dataType="CWM.Core.Integer" ordered="false"
	 * @generated
	 */
	Integer getCharacterOctetLength();

	/**
	 * Sets the value of the '{@link CWM.Relational.SQLSimpleType#getCharacterOctetLength <em>Character Octet Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Character Octet Length</em>' attribute.
	 * @see #getCharacterOctetLength()
	 * @generated
	 */
	void setCharacterOctetLength(Integer value);

	/**
	 * Returns the value of the '<em><b>Numeric Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numeric Precision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numeric Precision</em>' attribute.
	 * @see #setNumericPrecision(Integer)
	 * @see CWM.Relational.RelationalPackage#getSQLSimpleType_NumericPrecision()
	 * @model unique="false" dataType="CWM.Core.Integer" ordered="false"
	 * @generated
	 */
	Integer getNumericPrecision();

	/**
	 * Sets the value of the '{@link CWM.Relational.SQLSimpleType#getNumericPrecision <em>Numeric Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numeric Precision</em>' attribute.
	 * @see #getNumericPrecision()
	 * @generated
	 */
	void setNumericPrecision(Integer value);

	/**
	 * Returns the value of the '<em><b>Numeric Precision Radix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numeric Precision Radix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numeric Precision Radix</em>' attribute.
	 * @see #setNumericPrecisionRadix(Integer)
	 * @see CWM.Relational.RelationalPackage#getSQLSimpleType_NumericPrecisionRadix()
	 * @model unique="false" dataType="CWM.Core.Integer" ordered="false"
	 * @generated
	 */
	Integer getNumericPrecisionRadix();

	/**
	 * Sets the value of the '{@link CWM.Relational.SQLSimpleType#getNumericPrecisionRadix <em>Numeric Precision Radix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numeric Precision Radix</em>' attribute.
	 * @see #getNumericPrecisionRadix()
	 * @generated
	 */
	void setNumericPrecisionRadix(Integer value);

	/**
	 * Returns the value of the '<em><b>Numeric Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numeric Scale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numeric Scale</em>' attribute.
	 * @see #setNumericScale(Integer)
	 * @see CWM.Relational.RelationalPackage#getSQLSimpleType_NumericScale()
	 * @model unique="false" dataType="CWM.Core.Integer" ordered="false"
	 * @generated
	 */
	Integer getNumericScale();

	/**
	 * Sets the value of the '{@link CWM.Relational.SQLSimpleType#getNumericScale <em>Numeric Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numeric Scale</em>' attribute.
	 * @see #getNumericScale()
	 * @generated
	 */
	void setNumericScale(Integer value);

	/**
	 * Returns the value of the '<em><b>Date Time Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Time Precision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Time Precision</em>' attribute.
	 * @see #setDateTimePrecision(Integer)
	 * @see CWM.Relational.RelationalPackage#getSQLSimpleType_DateTimePrecision()
	 * @model unique="false" dataType="CWM.Core.Integer" ordered="false"
	 * @generated
	 */
	Integer getDateTimePrecision();

	/**
	 * Sets the value of the '{@link CWM.Relational.SQLSimpleType#getDateTimePrecision <em>Date Time Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Time Precision</em>' attribute.
	 * @see #getDateTimePrecision()
	 * @generated
	 */
	void setDateTimePrecision(Integer value);

} // SQLSimpleType

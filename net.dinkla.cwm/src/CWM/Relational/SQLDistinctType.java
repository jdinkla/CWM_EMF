/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Relational;

import CWM.DataTypes.TypeAlias;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SQL Distinct Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Relational.SQLDistinctType#getLength <em>Length</em>}</li>
 *   <li>{@link CWM.Relational.SQLDistinctType#getPrecision <em>Precision</em>}</li>
 *   <li>{@link CWM.Relational.SQLDistinctType#getScale <em>Scale</em>}</li>
 *   <li>{@link CWM.Relational.SQLDistinctType#getSqlSimpleType <em>Sql Simple Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Relational.RelationalPackage#getSQLDistinctType()
 * @model
 * @generated
 */
public interface SQLDistinctType extends SQLDataType, TypeAlias {
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
	 * @see CWM.Relational.RelationalPackage#getSQLDistinctType_Length()
	 * @model unique="false" dataType="CWM.Core.Integer" ordered="false"
	 * @generated
	 */
	Integer getLength();

	/**
	 * Sets the value of the '{@link CWM.Relational.SQLDistinctType#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(Integer value);

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
	 * @see CWM.Relational.RelationalPackage#getSQLDistinctType_Precision()
	 * @model unique="false" dataType="CWM.Core.Integer" ordered="false"
	 * @generated
	 */
	Integer getPrecision();

	/**
	 * Sets the value of the '{@link CWM.Relational.SQLDistinctType#getPrecision <em>Precision</em>}' attribute.
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
	 * @see CWM.Relational.RelationalPackage#getSQLDistinctType_Scale()
	 * @model unique="false" dataType="CWM.Core.Integer" ordered="false"
	 * @generated
	 */
	Integer getScale();

	/**
	 * Sets the value of the '{@link CWM.Relational.SQLDistinctType#getScale <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale</em>' attribute.
	 * @see #getScale()
	 * @generated
	 */
	void setScale(Integer value);

	/**
	 * Returns the value of the '<em><b>Sql Simple Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sql Simple Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sql Simple Type</em>' reference.
	 * @see #setSqlSimpleType(SQLSimpleType)
	 * @see CWM.Relational.RelationalPackage#getSQLDistinctType_SqlSimpleType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SQLSimpleType getSqlSimpleType();

	/**
	 * Sets the value of the '{@link CWM.Relational.SQLDistinctType#getSqlSimpleType <em>Sql Simple Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sql Simple Type</em>' reference.
	 * @see #getSqlSimpleType()
	 * @generated
	 */
	void setSqlSimpleType(SQLSimpleType value);

} // SQLDistinctType

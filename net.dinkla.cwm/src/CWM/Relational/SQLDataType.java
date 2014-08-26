/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Relational;

import CWM.Core.Classifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SQL Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Relational.SQLDataType#getTypeNumber <em>Type Number</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Relational.RelationalPackage#getSQLDataType()
 * @model abstract="true"
 * @generated
 */
public interface SQLDataType extends Classifier {
	/**
	 * Returns the value of the '<em><b>Type Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Number</em>' attribute.
	 * @see #setTypeNumber(Integer)
	 * @see CWM.Relational.RelationalPackage#getSQLDataType_TypeNumber()
	 * @model unique="false" dataType="CWM.Core.Integer" ordered="false"
	 * @generated
	 */
	Integer getTypeNumber();

	/**
	 * Sets the value of the '{@link CWM.Relational.SQLDataType#getTypeNumber <em>Type Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Number</em>' attribute.
	 * @see #getTypeNumber()
	 * @generated
	 */
	void setTypeNumber(Integer value);

} // SQLDataType

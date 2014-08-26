/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Relational;

import CWM.KeysIndexes.Index;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SQL Index</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Relational.SQLIndex#getFilterCondition <em>Filter Condition</em>}</li>
 *   <li>{@link CWM.Relational.SQLIndex#getIsNullable <em>Is Nullable</em>}</li>
 *   <li>{@link CWM.Relational.SQLIndex#getAutoUpdate <em>Auto Update</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Relational.RelationalPackage#getSQLIndex()
 * @model
 * @generated
 */
public interface SQLIndex extends Index {
	/**
	 * Returns the value of the '<em><b>Filter Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter Condition</em>' attribute.
	 * @see #setFilterCondition(String)
	 * @see CWM.Relational.RelationalPackage#getSQLIndex_FilterCondition()
	 * @model unique="false" dataType="CWM.Core.String" required="true" ordered="false"
	 * @generated
	 */
	String getFilterCondition();

	/**
	 * Sets the value of the '{@link CWM.Relational.SQLIndex#getFilterCondition <em>Filter Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Condition</em>' attribute.
	 * @see #getFilterCondition()
	 * @generated
	 */
	void setFilterCondition(String value);

	/**
	 * Returns the value of the '<em><b>Is Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Nullable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Nullable</em>' attribute.
	 * @see #setIsNullable(Boolean)
	 * @see CWM.Relational.RelationalPackage#getSQLIndex_IsNullable()
	 * @model unique="false" dataType="CWM.Core.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsNullable();

	/**
	 * Sets the value of the '{@link CWM.Relational.SQLIndex#getIsNullable <em>Is Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Nullable</em>' attribute.
	 * @see #getIsNullable()
	 * @generated
	 */
	void setIsNullable(Boolean value);

	/**
	 * Returns the value of the '<em><b>Auto Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Update</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Update</em>' attribute.
	 * @see #setAutoUpdate(Boolean)
	 * @see CWM.Relational.RelationalPackage#getSQLIndex_AutoUpdate()
	 * @model unique="false" dataType="CWM.Core.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getAutoUpdate();

	/**
	 * Sets the value of the '{@link CWM.Relational.SQLIndex#getAutoUpdate <em>Auto Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Update</em>' attribute.
	 * @see #getAutoUpdate()
	 * @generated
	 */
	void setAutoUpdate(Boolean value);

} // SQLIndex

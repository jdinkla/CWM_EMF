/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningData;

import CWM.Core.Attribute;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category Matrix Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.MiningCore.MiningData.CategoryMatrixTable#getRowAttribute <em>Row Attribute</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.CategoryMatrixTable#getColumnAttribute <em>Column Attribute</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.CategoryMatrixTable#getValueAttribute <em>Value Attribute</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.CategoryMatrixTable#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.MiningCore.MiningData.MiningDataPackage#getCategoryMatrixTable()
 * @model
 * @generated
 */
public interface CategoryMatrixTable extends CategoryMatrix {
	/**
	 * Returns the value of the '<em><b>Row Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Row Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row Attribute</em>' reference.
	 * @see #setRowAttribute(Attribute)
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getCategoryMatrixTable_RowAttribute()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Attribute getRowAttribute();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.MiningData.CategoryMatrixTable#getRowAttribute <em>Row Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row Attribute</em>' reference.
	 * @see #getRowAttribute()
	 * @generated
	 */
	void setRowAttribute(Attribute value);

	/**
	 * Returns the value of the '<em><b>Column Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Attribute</em>' reference.
	 * @see #setColumnAttribute(Attribute)
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getCategoryMatrixTable_ColumnAttribute()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Attribute getColumnAttribute();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.MiningData.CategoryMatrixTable#getColumnAttribute <em>Column Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Attribute</em>' reference.
	 * @see #getColumnAttribute()
	 * @generated
	 */
	void setColumnAttribute(Attribute value);

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
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getCategoryMatrixTable_ValueAttribute()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Attribute getValueAttribute();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.MiningData.CategoryMatrixTable#getValueAttribute <em>Value Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Attribute</em>' reference.
	 * @see #getValueAttribute()
	 * @generated
	 */
	void setValueAttribute(Attribute value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference list.
	 * The list contents are of type {@link CWM.Core.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference list.
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getCategoryMatrixTable_Source()
	 * @model ordered="false"
	 * @generated
	 */
	EList<CWM.Core.Class> getSource();

} // CategoryMatrixTable

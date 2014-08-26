/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningData;

import CWM.Core.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category Matrix Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.MiningCore.MiningData.CategoryMatrixEntry#getRowIndex <em>Row Index</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.CategoryMatrixEntry#getColumnIndex <em>Column Index</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.CategoryMatrixEntry#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.MiningCore.MiningData.MiningDataPackage#getCategoryMatrixEntry()
 * @model
 * @generated
 */
public interface CategoryMatrixEntry extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Row Index</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Row Index</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row Index</em>' reference.
	 * @see #setRowIndex(Category)
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getCategoryMatrixEntry_RowIndex()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Category getRowIndex();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.MiningData.CategoryMatrixEntry#getRowIndex <em>Row Index</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row Index</em>' reference.
	 * @see #getRowIndex()
	 * @generated
	 */
	void setRowIndex(Category value);

	/**
	 * Returns the value of the '<em><b>Column Index</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Index</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Index</em>' reference.
	 * @see #setColumnIndex(Category)
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getCategoryMatrixEntry_ColumnIndex()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Category getColumnIndex();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.MiningData.CategoryMatrixEntry#getColumnIndex <em>Column Index</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Index</em>' reference.
	 * @see #getColumnIndex()
	 * @generated
	 */
	void setColumnIndex(Category value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Double)
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getCategoryMatrixEntry_Value()
	 * @model unique="false" dataType="CWM.MiningCore.MiningData.Double" required="true" ordered="false"
	 * @generated
	 */
	Double getValue();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.MiningData.CategoryMatrixEntry#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Double value);

} // CategoryMatrixEntry

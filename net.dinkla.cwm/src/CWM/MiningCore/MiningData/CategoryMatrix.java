/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningData;

import CWM.Core.ModelElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category Matrix</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.MiningCore.MiningData.CategoryMatrix#getDiagonalDefault <em>Diagonal Default</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.CategoryMatrix#getOffDiagonalDefault <em>Off Diagonal Default</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.CategoryMatrix#getKind <em>Kind</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.CategoryMatrix#getCategory <em>Category</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.MiningCore.MiningData.MiningDataPackage#getCategoryMatrix()
 * @model
 * @generated
 */
public interface CategoryMatrix extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Diagonal Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagonal Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagonal Default</em>' attribute.
	 * @see #setDiagonalDefault(Double)
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getCategoryMatrix_DiagonalDefault()
	 * @model unique="false" dataType="CWM.MiningCore.MiningData.Double" required="true" ordered="false"
	 * @generated
	 */
	Double getDiagonalDefault();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.MiningData.CategoryMatrix#getDiagonalDefault <em>Diagonal Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagonal Default</em>' attribute.
	 * @see #getDiagonalDefault()
	 * @generated
	 */
	void setDiagonalDefault(Double value);

	/**
	 * Returns the value of the '<em><b>Off Diagonal Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Off Diagonal Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Off Diagonal Default</em>' attribute.
	 * @see #setOffDiagonalDefault(Double)
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getCategoryMatrix_OffDiagonalDefault()
	 * @model unique="false" dataType="CWM.MiningCore.MiningData.Double" required="true" ordered="false"
	 * @generated
	 */
	Double getOffDiagonalDefault();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.MiningData.CategoryMatrix#getOffDiagonalDefault <em>Off Diagonal Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Off Diagonal Default</em>' attribute.
	 * @see #getOffDiagonalDefault()
	 * @generated
	 */
	void setOffDiagonalDefault(Double value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CWM.MiningCore.MiningData.MatrixProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see CWM.MiningCore.MiningData.MatrixProperty
	 * @see #setKind(MatrixProperty)
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getCategoryMatrix_Kind()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	MatrixProperty getKind();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.MiningData.CategoryMatrix#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see CWM.MiningCore.MiningData.MatrixProperty
	 * @see #getKind()
	 * @generated
	 */
	void setKind(MatrixProperty value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' reference list.
	 * The list contents are of type {@link CWM.MiningCore.MiningData.Category}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' reference list.
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getCategoryMatrix_Category()
	 * @model lower="2" ordered="false"
	 * @generated
	 */
	EList<Category> getCategory();

} // CategoryMatrix

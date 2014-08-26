/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.KeysIndexes;

import CWM.Core.ModelElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Index</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.KeysIndexes.Index#getIsPartitioning <em>Is Partitioning</em>}</li>
 *   <li>{@link CWM.KeysIndexes.Index#getIsSorted <em>Is Sorted</em>}</li>
 *   <li>{@link CWM.KeysIndexes.Index#getIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link CWM.KeysIndexes.Index#getIndexedFeature <em>Indexed Feature</em>}</li>
 *   <li>{@link CWM.KeysIndexes.Index#getSpannedClass <em>Spanned Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.KeysIndexes.KeysIndexesPackage#getIndex()
 * @model
 * @generated
 */
public interface Index extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Is Partitioning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Partitioning</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Partitioning</em>' attribute.
	 * @see #setIsPartitioning(Boolean)
	 * @see CWM.KeysIndexes.KeysIndexesPackage#getIndex_IsPartitioning()
	 * @model unique="false" dataType="CWM.Core.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsPartitioning();

	/**
	 * Sets the value of the '{@link CWM.KeysIndexes.Index#getIsPartitioning <em>Is Partitioning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Partitioning</em>' attribute.
	 * @see #getIsPartitioning()
	 * @generated
	 */
	void setIsPartitioning(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Sorted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Sorted</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Sorted</em>' attribute.
	 * @see #setIsSorted(Boolean)
	 * @see CWM.KeysIndexes.KeysIndexesPackage#getIndex_IsSorted()
	 * @model unique="false" dataType="CWM.Core.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsSorted();

	/**
	 * Sets the value of the '{@link CWM.KeysIndexes.Index#getIsSorted <em>Is Sorted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Sorted</em>' attribute.
	 * @see #getIsSorted()
	 * @generated
	 */
	void setIsSorted(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Unique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Unique</em>' attribute.
	 * @see #setIsUnique(Boolean)
	 * @see CWM.KeysIndexes.KeysIndexesPackage#getIndex_IsUnique()
	 * @model unique="false" dataType="CWM.Core.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsUnique();

	/**
	 * Sets the value of the '{@link CWM.KeysIndexes.Index#getIsUnique <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Unique</em>' attribute.
	 * @see #getIsUnique()
	 * @generated
	 */
	void setIsUnique(Boolean value);

	/**
	 * Returns the value of the '<em><b>Indexed Feature</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.KeysIndexes.IndexedFeature}.
	 * It is bidirectional and its opposite is '{@link CWM.KeysIndexes.IndexedFeature#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indexed Feature</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indexed Feature</em>' containment reference list.
	 * @see CWM.KeysIndexes.KeysIndexesPackage#getIndex_IndexedFeature()
	 * @see CWM.KeysIndexes.IndexedFeature#getIndex
	 * @model opposite="index" containment="true"
	 * @generated
	 */
	EList<IndexedFeature> getIndexedFeature();

	/**
	 * Returns the value of the '<em><b>Spanned Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spanned Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spanned Class</em>' reference.
	 * @see #setSpannedClass(CWM.Core.Class)
	 * @see CWM.KeysIndexes.KeysIndexesPackage#getIndex_SpannedClass()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	CWM.Core.Class getSpannedClass();

	/**
	 * Sets the value of the '{@link CWM.KeysIndexes.Index#getSpannedClass <em>Spanned Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spanned Class</em>' reference.
	 * @see #getSpannedClass()
	 * @generated
	 */
	void setSpannedClass(CWM.Core.Class value);

} // Index

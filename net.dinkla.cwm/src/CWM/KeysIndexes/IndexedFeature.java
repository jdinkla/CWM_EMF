/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.KeysIndexes;

import CWM.Core.ModelElement;
import CWM.Core.StructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Indexed Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.KeysIndexes.IndexedFeature#getIsAscending <em>Is Ascending</em>}</li>
 *   <li>{@link CWM.KeysIndexes.IndexedFeature#getFeature <em>Feature</em>}</li>
 *   <li>{@link CWM.KeysIndexes.IndexedFeature#getIndex <em>Index</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.KeysIndexes.KeysIndexesPackage#getIndexedFeature()
 * @model
 * @generated
 */
public interface IndexedFeature extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Is Ascending</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Ascending</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Ascending</em>' attribute.
	 * @see #setIsAscending(Boolean)
	 * @see CWM.KeysIndexes.KeysIndexesPackage#getIndexedFeature_IsAscending()
	 * @model unique="false" dataType="CWM.Core.Boolean" ordered="false"
	 * @generated
	 */
	Boolean getIsAscending();

	/**
	 * Sets the value of the '{@link CWM.KeysIndexes.IndexedFeature#getIsAscending <em>Is Ascending</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Ascending</em>' attribute.
	 * @see #getIsAscending()
	 * @generated
	 */
	void setIsAscending(Boolean value);

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(StructuralFeature)
	 * @see CWM.KeysIndexes.KeysIndexesPackage#getIndexedFeature_Feature()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	StructuralFeature getFeature();

	/**
	 * Sets the value of the '{@link CWM.KeysIndexes.IndexedFeature#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(StructuralFeature value);

	/**
	 * Returns the value of the '<em><b>Index</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link CWM.KeysIndexes.Index#getIndexedFeature <em>Indexed Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' container reference.
	 * @see #setIndex(Index)
	 * @see CWM.KeysIndexes.KeysIndexesPackage#getIndexedFeature_Index()
	 * @see CWM.KeysIndexes.Index#getIndexedFeature
	 * @model opposite="indexedFeature" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Index getIndex();

	/**
	 * Sets the value of the '{@link CWM.KeysIndexes.IndexedFeature#getIndex <em>Index</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' container reference.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(Index value);

} // IndexedFeature

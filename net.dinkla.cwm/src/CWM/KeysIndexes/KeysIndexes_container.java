/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.KeysIndexes;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Keys Indexes container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.KeysIndexes.KeysIndexes_container#getUniqueKey <em>Unique Key</em>}</li>
 *   <li>{@link CWM.KeysIndexes.KeysIndexes_container#getIndex <em>Index</em>}</li>
 *   <li>{@link CWM.KeysIndexes.KeysIndexes_container#getKeyRelationship <em>Key Relationship</em>}</li>
 *   <li>{@link CWM.KeysIndexes.KeysIndexes_container#getIndexedFeature <em>Indexed Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.KeysIndexes.KeysIndexesPackage#getKeysIndexes_container()
 * @model
 * @generated
 */
public interface KeysIndexes_container extends EObject {
	/**
	 * Returns the value of the '<em><b>Unique Key</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.KeysIndexes.UniqueKey}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unique Key</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique Key</em>' containment reference list.
	 * @see CWM.KeysIndexes.KeysIndexesPackage#getKeysIndexes_container_UniqueKey()
	 * @model containment="true"
	 * @generated
	 */
	EList<UniqueKey> getUniqueKey();

	/**
	 * Returns the value of the '<em><b>Index</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.KeysIndexes.Index}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' containment reference list.
	 * @see CWM.KeysIndexes.KeysIndexesPackage#getKeysIndexes_container_Index()
	 * @model containment="true"
	 * @generated
	 */
	EList<Index> getIndex();

	/**
	 * Returns the value of the '<em><b>Key Relationship</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.KeysIndexes.KeyRelationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Relationship</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Relationship</em>' containment reference list.
	 * @see CWM.KeysIndexes.KeysIndexesPackage#getKeysIndexes_container_KeyRelationship()
	 * @model containment="true"
	 * @generated
	 */
	EList<KeyRelationship> getKeyRelationship();

	/**
	 * Returns the value of the '<em><b>Indexed Feature</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.KeysIndexes.IndexedFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indexed Feature</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indexed Feature</em>' containment reference list.
	 * @see CWM.KeysIndexes.KeysIndexesPackage#getKeysIndexes_container_IndexedFeature()
	 * @model containment="true"
	 * @generated
	 */
	EList<IndexedFeature> getIndexedFeature();

} // KeysIndexes_container

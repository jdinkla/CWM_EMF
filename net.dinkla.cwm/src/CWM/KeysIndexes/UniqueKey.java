/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.KeysIndexes;

import CWM.Core.ModelElement;
import CWM.Core.StructuralFeature;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unique Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.KeysIndexes.UniqueKey#getFeature <em>Feature</em>}</li>
 *   <li>{@link CWM.KeysIndexes.UniqueKey#getKeyRelationship <em>Key Relationship</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.KeysIndexes.KeysIndexesPackage#getUniqueKey()
 * @model
 * @generated
 */
public interface UniqueKey extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference list.
	 * The list contents are of type {@link CWM.Core.StructuralFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference list.
	 * @see CWM.KeysIndexes.KeysIndexesPackage#getUniqueKey_Feature()
	 * @model required="true"
	 * @generated
	 */
	EList<StructuralFeature> getFeature();

	/**
	 * Returns the value of the '<em><b>Key Relationship</b></em>' reference list.
	 * The list contents are of type {@link CWM.KeysIndexes.KeyRelationship}.
	 * It is bidirectional and its opposite is '{@link CWM.KeysIndexes.KeyRelationship#getUniqueKey <em>Unique Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Relationship</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Relationship</em>' reference list.
	 * @see CWM.KeysIndexes.KeysIndexesPackage#getUniqueKey_KeyRelationship()
	 * @see CWM.KeysIndexes.KeyRelationship#getUniqueKey
	 * @model opposite="uniqueKey" ordered="false"
	 * @generated
	 */
	EList<KeyRelationship> getKeyRelationship();

} // UniqueKey

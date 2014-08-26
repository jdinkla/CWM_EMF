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
 * A representation of the model object '<em><b>Key Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.KeysIndexes.KeyRelationship#getFeature <em>Feature</em>}</li>
 *   <li>{@link CWM.KeysIndexes.KeyRelationship#getUniqueKey <em>Unique Key</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.KeysIndexes.KeysIndexesPackage#getKeyRelationship()
 * @model
 * @generated
 */
public interface KeyRelationship extends ModelElement {
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
	 * @see CWM.KeysIndexes.KeysIndexesPackage#getKeyRelationship_Feature()
	 * @model required="true"
	 * @generated
	 */
	EList<StructuralFeature> getFeature();

	/**
	 * Returns the value of the '<em><b>Unique Key</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CWM.KeysIndexes.UniqueKey#getKeyRelationship <em>Key Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unique Key</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique Key</em>' reference.
	 * @see #setUniqueKey(UniqueKey)
	 * @see CWM.KeysIndexes.KeysIndexesPackage#getKeyRelationship_UniqueKey()
	 * @see CWM.KeysIndexes.UniqueKey#getKeyRelationship
	 * @model opposite="keyRelationship" required="true" ordered="false"
	 * @generated
	 */
	UniqueKey getUniqueKey();

	/**
	 * Sets the value of the '{@link CWM.KeysIndexes.KeyRelationship#getUniqueKey <em>Unique Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique Key</em>' reference.
	 * @see #getUniqueKey()
	 * @generated
	 */
	void setUniqueKey(UniqueKey value);

} // KeyRelationship

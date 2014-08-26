/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Relationships;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationships container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Relationships.Relationships_container#getAssociation <em>Association</em>}</li>
 *   <li>{@link CWM.Relationships.Relationships_container#getAssociationEnd <em>Association End</em>}</li>
 *   <li>{@link CWM.Relationships.Relationships_container#getGeneralization <em>Generalization</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Relationships.RelationshipsPackage#getRelationships_container()
 * @model
 * @generated
 */
public interface Relationships_container extends EObject {
	/**
	 * Returns the value of the '<em><b>Association</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Relationships.Association}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association</em>' containment reference list.
	 * @see CWM.Relationships.RelationshipsPackage#getRelationships_container_Association()
	 * @model containment="true"
	 * @generated
	 */
	EList<Association> getAssociation();

	/**
	 * Returns the value of the '<em><b>Association End</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Relationships.AssociationEnd}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association End</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association End</em>' containment reference list.
	 * @see CWM.Relationships.RelationshipsPackage#getRelationships_container_AssociationEnd()
	 * @model containment="true"
	 * @generated
	 */
	EList<AssociationEnd> getAssociationEnd();

	/**
	 * Returns the value of the '<em><b>Generalization</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Relationships.Generalization}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generalization</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generalization</em>' containment reference list.
	 * @see CWM.Relationships.RelationshipsPackage#getRelationships_container_Generalization()
	 * @model containment="true"
	 * @generated
	 */
	EList<Generalization> getGeneralization();

} // Relationships_container

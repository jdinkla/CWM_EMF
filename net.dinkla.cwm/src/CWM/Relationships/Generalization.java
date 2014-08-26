/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Relationships;

import CWM.Core.Classifier;
import CWM.Core.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generalization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Relationships.Generalization#getChild <em>Child</em>}</li>
 *   <li>{@link CWM.Relationships.Generalization#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Relationships.RelationshipsPackage#getGeneralization()
 * @model
 * @generated
 */
public interface Generalization extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Child</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' reference.
	 * @see #setChild(Classifier)
	 * @see CWM.Relationships.RelationshipsPackage#getGeneralization_Child()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Classifier getChild();

	/**
	 * Sets the value of the '{@link CWM.Relationships.Generalization#getChild <em>Child</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child</em>' reference.
	 * @see #getChild()
	 * @generated
	 */
	void setChild(Classifier value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(Classifier)
	 * @see CWM.Relationships.RelationshipsPackage#getGeneralization_Parent()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Classifier getParent();

	/**
	 * Sets the value of the '{@link CWM.Relationships.Generalization#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Classifier value);

} // Generalization

/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Core.Feature#getOwnerScope <em>Owner Scope</em>}</li>
 *   <li>{@link CWM.Core.Feature#getOwner <em>Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Core.CorePackage#getFeature()
 * @model abstract="true"
 * @generated
 */
public interface Feature extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Owner Scope</b></em>' attribute.
	 * The literals are from the enumeration {@link CWM.Core.ScopeKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner Scope</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner Scope</em>' attribute.
	 * @see CWM.Core.ScopeKind
	 * @see #setOwnerScope(ScopeKind)
	 * @see CWM.Core.CorePackage#getFeature_OwnerScope()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	ScopeKind getOwnerScope();

	/**
	 * Sets the value of the '{@link CWM.Core.Feature#getOwnerScope <em>Owner Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner Scope</em>' attribute.
	 * @see CWM.Core.ScopeKind
	 * @see #getOwnerScope()
	 * @generated
	 */
	void setOwnerScope(ScopeKind value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link CWM.Core.Classifier#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(Classifier)
	 * @see CWM.Core.CorePackage#getFeature_Owner()
	 * @see CWM.Core.Classifier#getFeature
	 * @model opposite="feature" transient="false" ordered="false"
	 * @generated
	 */
	Classifier getOwner();

	/**
	 * Sets the value of the '{@link CWM.Core.Feature#getOwner <em>Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Classifier value);

} // Feature

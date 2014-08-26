/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structural Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Core.StructuralFeature#getChangeability <em>Changeability</em>}</li>
 *   <li>{@link CWM.Core.StructuralFeature#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link CWM.Core.StructuralFeature#getOrdering <em>Ordering</em>}</li>
 *   <li>{@link CWM.Core.StructuralFeature#getTargetScope <em>Target Scope</em>}</li>
 *   <li>{@link CWM.Core.StructuralFeature#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Core.CorePackage#getStructuralFeature()
 * @model abstract="true"
 * @generated
 */
public interface StructuralFeature extends Feature {
	/**
	 * Returns the value of the '<em><b>Changeability</b></em>' attribute.
	 * The literals are from the enumeration {@link CWM.Core.ChangeableKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Changeability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Changeability</em>' attribute.
	 * @see CWM.Core.ChangeableKind
	 * @see #setChangeability(ChangeableKind)
	 * @see CWM.Core.CorePackage#getStructuralFeature_Changeability()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	ChangeableKind getChangeability();

	/**
	 * Sets the value of the '{@link CWM.Core.StructuralFeature#getChangeability <em>Changeability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Changeability</em>' attribute.
	 * @see CWM.Core.ChangeableKind
	 * @see #getChangeability()
	 * @generated
	 */
	void setChangeability(ChangeableKind value);

	/**
	 * Returns the value of the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity</em>' containment reference.
	 * @see #setMultiplicity(Multiplicity)
	 * @see CWM.Core.CorePackage#getStructuralFeature_Multiplicity()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Multiplicity getMultiplicity();

	/**
	 * Sets the value of the '{@link CWM.Core.StructuralFeature#getMultiplicity <em>Multiplicity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity</em>' containment reference.
	 * @see #getMultiplicity()
	 * @generated
	 */
	void setMultiplicity(Multiplicity value);

	/**
	 * Returns the value of the '<em><b>Ordering</b></em>' attribute.
	 * The literals are from the enumeration {@link CWM.Core.OrderingKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ordering</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ordering</em>' attribute.
	 * @see CWM.Core.OrderingKind
	 * @see #setOrdering(OrderingKind)
	 * @see CWM.Core.CorePackage#getStructuralFeature_Ordering()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	OrderingKind getOrdering();

	/**
	 * Sets the value of the '{@link CWM.Core.StructuralFeature#getOrdering <em>Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordering</em>' attribute.
	 * @see CWM.Core.OrderingKind
	 * @see #getOrdering()
	 * @generated
	 */
	void setOrdering(OrderingKind value);

	/**
	 * Returns the value of the '<em><b>Target Scope</b></em>' attribute.
	 * The literals are from the enumeration {@link CWM.Core.ScopeKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Scope</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Scope</em>' attribute.
	 * @see CWM.Core.ScopeKind
	 * @see #setTargetScope(ScopeKind)
	 * @see CWM.Core.CorePackage#getStructuralFeature_TargetScope()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	ScopeKind getTargetScope();

	/**
	 * Sets the value of the '{@link CWM.Core.StructuralFeature#getTargetScope <em>Target Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Scope</em>' attribute.
	 * @see CWM.Core.ScopeKind
	 * @see #getTargetScope()
	 * @generated
	 */
	void setTargetScope(ScopeKind value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Classifier)
	 * @see CWM.Core.CorePackage#getStructuralFeature_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Classifier getType();

	/**
	 * Sets the value of the '{@link CWM.Core.StructuralFeature#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Classifier value);

} // StructuralFeature

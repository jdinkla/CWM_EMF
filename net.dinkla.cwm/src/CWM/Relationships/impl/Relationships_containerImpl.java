/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Relationships.impl;

import CWM.Relationships.Association;
import CWM.Relationships.AssociationEnd;
import CWM.Relationships.Generalization;
import CWM.Relationships.RelationshipsPackage;
import CWM.Relationships.Relationships_container;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationships container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.Relationships.impl.Relationships_containerImpl#getAssociation <em>Association</em>}</li>
 *   <li>{@link CWM.Relationships.impl.Relationships_containerImpl#getAssociationEnd <em>Association End</em>}</li>
 *   <li>{@link CWM.Relationships.impl.Relationships_containerImpl#getGeneralization <em>Generalization</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Relationships_containerImpl extends EObjectImpl implements Relationships_container {
	/**
	 * The cached value of the '{@link #getAssociation() <em>Association</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociation()
	 * @generated
	 * @ordered
	 */
	protected EList<Association> association;

	/**
	 * The cached value of the '{@link #getAssociationEnd() <em>Association End</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationEnd()
	 * @generated
	 * @ordered
	 */
	protected EList<AssociationEnd> associationEnd;

	/**
	 * The cached value of the '{@link #getGeneralization() <em>Generalization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralization()
	 * @generated
	 * @ordered
	 */
	protected EList<Generalization> generalization;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Relationships_containerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RelationshipsPackage.Literals.RELATIONSHIPS_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Association> getAssociation() {
		if (association == null) {
			association = new EObjectContainmentEList<Association>(Association.class, this, RelationshipsPackage.RELATIONSHIPS_CONTAINER__ASSOCIATION);
		}
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssociationEnd> getAssociationEnd() {
		if (associationEnd == null) {
			associationEnd = new EObjectContainmentEList<AssociationEnd>(AssociationEnd.class, this, RelationshipsPackage.RELATIONSHIPS_CONTAINER__ASSOCIATION_END);
		}
		return associationEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Generalization> getGeneralization() {
		if (generalization == null) {
			generalization = new EObjectContainmentEList<Generalization>(Generalization.class, this, RelationshipsPackage.RELATIONSHIPS_CONTAINER__GENERALIZATION);
		}
		return generalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RelationshipsPackage.RELATIONSHIPS_CONTAINER__ASSOCIATION:
				return ((InternalEList<?>)getAssociation()).basicRemove(otherEnd, msgs);
			case RelationshipsPackage.RELATIONSHIPS_CONTAINER__ASSOCIATION_END:
				return ((InternalEList<?>)getAssociationEnd()).basicRemove(otherEnd, msgs);
			case RelationshipsPackage.RELATIONSHIPS_CONTAINER__GENERALIZATION:
				return ((InternalEList<?>)getGeneralization()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RelationshipsPackage.RELATIONSHIPS_CONTAINER__ASSOCIATION:
				return getAssociation();
			case RelationshipsPackage.RELATIONSHIPS_CONTAINER__ASSOCIATION_END:
				return getAssociationEnd();
			case RelationshipsPackage.RELATIONSHIPS_CONTAINER__GENERALIZATION:
				return getGeneralization();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RelationshipsPackage.RELATIONSHIPS_CONTAINER__ASSOCIATION:
				getAssociation().clear();
				getAssociation().addAll((Collection<? extends Association>)newValue);
				return;
			case RelationshipsPackage.RELATIONSHIPS_CONTAINER__ASSOCIATION_END:
				getAssociationEnd().clear();
				getAssociationEnd().addAll((Collection<? extends AssociationEnd>)newValue);
				return;
			case RelationshipsPackage.RELATIONSHIPS_CONTAINER__GENERALIZATION:
				getGeneralization().clear();
				getGeneralization().addAll((Collection<? extends Generalization>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RelationshipsPackage.RELATIONSHIPS_CONTAINER__ASSOCIATION:
				getAssociation().clear();
				return;
			case RelationshipsPackage.RELATIONSHIPS_CONTAINER__ASSOCIATION_END:
				getAssociationEnd().clear();
				return;
			case RelationshipsPackage.RELATIONSHIPS_CONTAINER__GENERALIZATION:
				getGeneralization().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RelationshipsPackage.RELATIONSHIPS_CONTAINER__ASSOCIATION:
				return association != null && !association.isEmpty();
			case RelationshipsPackage.RELATIONSHIPS_CONTAINER__ASSOCIATION_END:
				return associationEnd != null && !associationEnd.isEmpty();
			case RelationshipsPackage.RELATIONSHIPS_CONTAINER__GENERALIZATION:
				return generalization != null && !generalization.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Relationships_containerImpl

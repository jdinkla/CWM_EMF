/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.BusinessNomenclature.impl;

import CWM.BusinessNomenclature.BusinessNomenclaturePackage;
import CWM.BusinessNomenclature.Concept;

import CWM.Core.Namespace;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concept</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.BusinessNomenclature.impl.ConceptImpl#getTaxonomy <em>Taxonomy</em>}</li>
 *   <li>{@link CWM.BusinessNomenclature.impl.ConceptImpl#getRelatedConcept <em>Related Concept</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConceptImpl extends VocabularyElementImpl implements Concept {
	/**
	 * The cached value of the '{@link #getTaxonomy() <em>Taxonomy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxonomy()
	 * @generated
	 * @ordered
	 */
	protected Namespace taxonomy;

	/**
	 * The cached value of the '{@link #getRelatedConcept() <em>Related Concept</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedConcept()
	 * @generated
	 * @ordered
	 */
	protected EList<Concept> relatedConcept;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BusinessNomenclaturePackage.Literals.CONCEPT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace getTaxonomy() {
		if (taxonomy != null && taxonomy.eIsProxy()) {
			InternalEObject oldTaxonomy = (InternalEObject)taxonomy;
			taxonomy = (Namespace)eResolveProxy(oldTaxonomy);
			if (taxonomy != oldTaxonomy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BusinessNomenclaturePackage.CONCEPT__TAXONOMY, oldTaxonomy, taxonomy));
			}
		}
		return taxonomy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace basicGetTaxonomy() {
		return taxonomy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaxonomy(Namespace newTaxonomy) {
		Namespace oldTaxonomy = taxonomy;
		taxonomy = newTaxonomy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessNomenclaturePackage.CONCEPT__TAXONOMY, oldTaxonomy, taxonomy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Concept> getRelatedConcept() {
		if (relatedConcept == null) {
			relatedConcept = new EObjectResolvingEList<Concept>(Concept.class, this, BusinessNomenclaturePackage.CONCEPT__RELATED_CONCEPT);
		}
		return relatedConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BusinessNomenclaturePackage.CONCEPT__TAXONOMY:
				if (resolve) return getTaxonomy();
				return basicGetTaxonomy();
			case BusinessNomenclaturePackage.CONCEPT__RELATED_CONCEPT:
				return getRelatedConcept();
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
			case BusinessNomenclaturePackage.CONCEPT__TAXONOMY:
				setTaxonomy((Namespace)newValue);
				return;
			case BusinessNomenclaturePackage.CONCEPT__RELATED_CONCEPT:
				getRelatedConcept().clear();
				getRelatedConcept().addAll((Collection<? extends Concept>)newValue);
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
			case BusinessNomenclaturePackage.CONCEPT__TAXONOMY:
				setTaxonomy((Namespace)null);
				return;
			case BusinessNomenclaturePackage.CONCEPT__RELATED_CONCEPT:
				getRelatedConcept().clear();
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
			case BusinessNomenclaturePackage.CONCEPT__TAXONOMY:
				return taxonomy != null;
			case BusinessNomenclaturePackage.CONCEPT__RELATED_CONCEPT:
				return relatedConcept != null && !relatedConcept.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConceptImpl

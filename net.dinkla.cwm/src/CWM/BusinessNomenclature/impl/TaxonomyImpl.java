/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.BusinessNomenclature.impl;

import CWM.BusinessNomenclature.BusinessNomenclaturePackage;
import CWM.BusinessNomenclature.Nomenclature;
import CWM.BusinessNomenclature.Taxonomy;

import CWM.Core.ModelElement;
import CWM.Core.Namespace;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Taxonomy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.BusinessNomenclature.impl.TaxonomyImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link CWM.BusinessNomenclature.impl.TaxonomyImpl#getConcept <em>Concept</em>}</li>
 *   <li>{@link CWM.BusinessNomenclature.impl.TaxonomyImpl#getSubtaxonomy <em>Subtaxonomy</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaxonomyImpl extends NomenclatureImpl implements Taxonomy {
	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected Namespace domain;

	/**
	 * The cached value of the '{@link #getConcept() <em>Concept</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcept()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelElement> concept;

	/**
	 * The cached value of the '{@link #getSubtaxonomy() <em>Subtaxonomy</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtaxonomy()
	 * @generated
	 * @ordered
	 */
	protected EList<Nomenclature> subtaxonomy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaxonomyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BusinessNomenclaturePackage.Literals.TAXONOMY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace getDomain() {
		if (domain != null && domain.eIsProxy()) {
			InternalEObject oldDomain = (InternalEObject)domain;
			domain = (Namespace)eResolveProxy(oldDomain);
			if (domain != oldDomain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BusinessNomenclaturePackage.TAXONOMY__DOMAIN, oldDomain, domain));
			}
		}
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace basicGetDomain() {
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomain(Namespace newDomain) {
		Namespace oldDomain = domain;
		domain = newDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessNomenclaturePackage.TAXONOMY__DOMAIN, oldDomain, domain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelElement> getConcept() {
		if (concept == null) {
			concept = new EObjectContainmentEList<ModelElement>(ModelElement.class, this, BusinessNomenclaturePackage.TAXONOMY__CONCEPT);
		}
		return concept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Nomenclature> getSubtaxonomy() {
		if (subtaxonomy == null) {
			subtaxonomy = new EObjectContainmentEList<Nomenclature>(Nomenclature.class, this, BusinessNomenclaturePackage.TAXONOMY__SUBTAXONOMY);
		}
		return subtaxonomy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BusinessNomenclaturePackage.TAXONOMY__CONCEPT:
				return ((InternalEList<?>)getConcept()).basicRemove(otherEnd, msgs);
			case BusinessNomenclaturePackage.TAXONOMY__SUBTAXONOMY:
				return ((InternalEList<?>)getSubtaxonomy()).basicRemove(otherEnd, msgs);
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
			case BusinessNomenclaturePackage.TAXONOMY__DOMAIN:
				if (resolve) return getDomain();
				return basicGetDomain();
			case BusinessNomenclaturePackage.TAXONOMY__CONCEPT:
				return getConcept();
			case BusinessNomenclaturePackage.TAXONOMY__SUBTAXONOMY:
				return getSubtaxonomy();
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
			case BusinessNomenclaturePackage.TAXONOMY__DOMAIN:
				setDomain((Namespace)newValue);
				return;
			case BusinessNomenclaturePackage.TAXONOMY__CONCEPT:
				getConcept().clear();
				getConcept().addAll((Collection<? extends ModelElement>)newValue);
				return;
			case BusinessNomenclaturePackage.TAXONOMY__SUBTAXONOMY:
				getSubtaxonomy().clear();
				getSubtaxonomy().addAll((Collection<? extends Nomenclature>)newValue);
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
			case BusinessNomenclaturePackage.TAXONOMY__DOMAIN:
				setDomain((Namespace)null);
				return;
			case BusinessNomenclaturePackage.TAXONOMY__CONCEPT:
				getConcept().clear();
				return;
			case BusinessNomenclaturePackage.TAXONOMY__SUBTAXONOMY:
				getSubtaxonomy().clear();
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
			case BusinessNomenclaturePackage.TAXONOMY__DOMAIN:
				return domain != null;
			case BusinessNomenclaturePackage.TAXONOMY__CONCEPT:
				return concept != null && !concept.isEmpty();
			case BusinessNomenclaturePackage.TAXONOMY__SUBTAXONOMY:
				return subtaxonomy != null && !subtaxonomy.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TaxonomyImpl

/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.BusinessNomenclature.impl;

import CWM.BusinessNomenclature.BusinessDomain;
import CWM.BusinessNomenclature.BusinessNomenclaturePackage;
import CWM.BusinessNomenclature.BusinessNomenclature_container;
import CWM.BusinessNomenclature.Concept;
import CWM.BusinessNomenclature.Glossary;
import CWM.BusinessNomenclature.Nomenclature;
import CWM.BusinessNomenclature.Taxonomy;
import CWM.BusinessNomenclature.Term;
import CWM.BusinessNomenclature.VocabularyElement;

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
 * An implementation of the model object '<em><b>Business Nomenclature container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.BusinessNomenclature.impl.BusinessNomenclature_containerImpl#getVocabularyElement <em>Vocabulary Element</em>}</li>
 *   <li>{@link CWM.BusinessNomenclature.impl.BusinessNomenclature_containerImpl#getNomenclature <em>Nomenclature</em>}</li>
 *   <li>{@link CWM.BusinessNomenclature.impl.BusinessNomenclature_containerImpl#getTaxonomy <em>Taxonomy</em>}</li>
 *   <li>{@link CWM.BusinessNomenclature.impl.BusinessNomenclature_containerImpl#getGlossary <em>Glossary</em>}</li>
 *   <li>{@link CWM.BusinessNomenclature.impl.BusinessNomenclature_containerImpl#getBusinessDomain <em>Business Domain</em>}</li>
 *   <li>{@link CWM.BusinessNomenclature.impl.BusinessNomenclature_containerImpl#getConcept <em>Concept</em>}</li>
 *   <li>{@link CWM.BusinessNomenclature.impl.BusinessNomenclature_containerImpl#getTerm <em>Term</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BusinessNomenclature_containerImpl extends EObjectImpl implements BusinessNomenclature_container {
	/**
	 * The cached value of the '{@link #getVocabularyElement() <em>Vocabulary Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVocabularyElement()
	 * @generated
	 * @ordered
	 */
	protected EList<VocabularyElement> vocabularyElement;

	/**
	 * The cached value of the '{@link #getNomenclature() <em>Nomenclature</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomenclature()
	 * @generated
	 * @ordered
	 */
	protected EList<Nomenclature> nomenclature;

	/**
	 * The cached value of the '{@link #getTaxonomy() <em>Taxonomy</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxonomy()
	 * @generated
	 * @ordered
	 */
	protected EList<Taxonomy> taxonomy;

	/**
	 * The cached value of the '{@link #getGlossary() <em>Glossary</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlossary()
	 * @generated
	 * @ordered
	 */
	protected EList<Glossary> glossary;

	/**
	 * The cached value of the '{@link #getBusinessDomain() <em>Business Domain</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessDomain()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessDomain> businessDomain;

	/**
	 * The cached value of the '{@link #getConcept() <em>Concept</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcept()
	 * @generated
	 * @ordered
	 */
	protected EList<Concept> concept;

	/**
	 * The cached value of the '{@link #getTerm() <em>Term</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerm()
	 * @generated
	 * @ordered
	 */
	protected EList<Term> term;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessNomenclature_containerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BusinessNomenclaturePackage.Literals.BUSINESS_NOMENCLATURE_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VocabularyElement> getVocabularyElement() {
		if (vocabularyElement == null) {
			vocabularyElement = new EObjectContainmentEList<VocabularyElement>(VocabularyElement.class, this, BusinessNomenclaturePackage.BUSINESS_NOMENCLATURE_CONTAINER__VOCABULARY_ELEMENT);
		}
		return vocabularyElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Nomenclature> getNomenclature() {
		if (nomenclature == null) {
			nomenclature = new EObjectContainmentEList<Nomenclature>(Nomenclature.class, this, BusinessNomenclaturePackage.BUSINESS_NOMENCLATURE_CONTAINER__NOMENCLATURE);
		}
		return nomenclature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Taxonomy> getTaxonomy() {
		if (taxonomy == null) {
			taxonomy = new EObjectContainmentEList<Taxonomy>(Taxonomy.class, this, BusinessNomenclaturePackage.BUSINESS_NOMENCLATURE_CONTAINER__TAXONOMY);
		}
		return taxonomy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Glossary> getGlossary() {
		if (glossary == null) {
			glossary = new EObjectContainmentEList<Glossary>(Glossary.class, this, BusinessNomenclaturePackage.BUSINESS_NOMENCLATURE_CONTAINER__GLOSSARY);
		}
		return glossary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessDomain> getBusinessDomain() {
		if (businessDomain == null) {
			businessDomain = new EObjectContainmentEList<BusinessDomain>(BusinessDomain.class, this, BusinessNomenclaturePackage.BUSINESS_NOMENCLATURE_CONTAINER__BUSINESS_DOMAIN);
		}
		return businessDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Concept> getConcept() {
		if (concept == null) {
			concept = new EObjectContainmentEList<Concept>(Concept.class, this, BusinessNomenclaturePackage.BUSINESS_NOMENCLATURE_CONTAINER__CONCEPT);
		}
		return concept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Term> getTerm() {
		if (term == null) {
			term = new EObjectContainmentEList<Term>(Term.class, this, BusinessNomenclaturePackage.BUSINESS_NOMENCLATURE_CONTAINER__TERM);
		}
		return term;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BusinessNomenclaturePackage.BUSINESS_NOMENCLATURE_CONTAINER__VOCABULARY_ELEMENT:
				return ((InternalEList<?>)getVocabularyElement()).basicRemove(otherEnd, msgs);
			case BusinessNomenclaturePackage.BUSINESS_NOMENCLATURE_CONTAINER__NOMENCLATURE:
				return ((InternalEList<?>)getNomenclature()).basicRemove(otherEnd, msgs);
			case BusinessNomenclaturePackage.BUSINESS_NOMENCLATURE_CONTAINER__TAXONOMY:
				return ((InternalEList<?>)getTaxonomy()).basicRemove(otherEnd, msgs);
			case BusinessNomenclaturePackage.BUSINESS_NOMENCLATURE_CONTAINER__GLOSSARY:
				return ((InternalEList<?>)getGlossary()).basicRemove(otherEnd, msgs);
			case BusinessNomenclaturePackage.BUSINESS_NOMENCLATURE_CONTAINER__BUSINESS_DOMAIN:
				return ((InternalEList<?>)getBusinessDomain()).basicRemove(otherEnd, msgs);
			case BusinessNomenclaturePackage.BUSINESS_NOMENCLATURE_CONTAINER__CONCEPT:
				return ((InternalEList<?>)getConcept()).basicRemove(otherEnd, msgs);
			case BusinessNomenclaturePackage.BUSINESS_NOMENCLATURE_CONTAINER__TERM:
				return ((InternalEList<?>)getTerm()).basicRemove(otherEnd, msgs);
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
			case BusinessNomenclaturePackage.BUSINESS_NOMENCLATURE_CONTAINER__VOCABULARY_ELEMENT:
				return getVocabularyElement();
			case BusinessNomenclaturePackage.BUSINESS_NOMENCLATURE_CONTAINER__NOMENCLATURE:
				return getNomenclature();
			case BusinessNomenclaturePackage.BUSINESS_NOMENCLATURE_CONTAINER__TAXONOMY:
				return getTaxonomy();
			case BusinessNomenclaturePackage.BUSINESS_NOMENCLATURE_CONTAINER__GLOSSARY:
				return getGlossary();
			case BusinessNomenclaturePackage.BUSINESS_NOMENCLATURE_CONTAINER__BUSINESS_DOMAIN:
				return getBusinessDomain();
			case BusinessNomenclaturePackage.BUSINESS_NOMENCLATURE_CONTAINER__CONCEPT:
				return getConcept();
			case BusinessNomenclaturePackage.BUSINESS_NOMENCLATURE_CONTAINER__TERM:
				return getTerm();
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
			case BusinessNomenclaturePackage.BUSINESS_NOMENCLATURE_CONTAINER__VOCABULARY_ELEMENT:
				getVocabularyElement().clear();
				getVocabularyElement().addAll((Collection<? extends VocabularyElement>)newValue);
				return;
			case BusinessNomenclaturePackage.BUSINESS_NOMENCLATURE_CONTAINER__NOMENCLATURE:
				getNomenclature().clear();
				getNomenclature().addAll((Collection<? extends Nomenclature>)newValue);
				return;
			case BusinessNomenclaturePackage.BUSINESS_NOMENCLATURE_CONTAINER__TAXONOMY:
				getTaxonomy().clear();
				getTaxonomy().addAll((Collection<? extends Taxonomy>)newValue);
				return;
			case BusinessNomenclaturePackage.BUSINESS_NOMENCLATURE_CONTAINER__GLOSSARY:
				getGlossary().clear();
				getGlossary().addAll((Collection<? extends Glossary>)newValue);
				return;
			case BusinessNomenclaturePackage.BUSINESS_NOMENCLATURE_CONTAINER__BUSINESS_DOMAIN:
				getBusinessDomain().clear();
				getBusinessDomain().addAll((Collection<? extends BusinessDomain>)newValue);
				return;
			case BusinessNomenclaturePackage.BUSINESS_NOMENCLATURE_CONTAINER__CONCEPT:
				getConcept().clear();
				getConcept().addAll((Collection<? extends Concept>)newValue);
				return;
			case BusinessNomenclaturePackage.BUSINESS_NOMENCLATURE_CONTAINER__TERM:
				getTerm().clear();
				getTerm().addAll((Collection<? extends Term>)newValue);
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
			case BusinessNomenclaturePackage.BUSINESS_NOMENCLATURE_CONTAINER__VOCABULARY_ELEMENT:
				getVocabularyElement().clear();
				return;
			case BusinessNomenclaturePackage.BUSINESS_NOMENCLATURE_CONTAINER__NOMENCLATURE:
				getNomenclature().clear();
				return;
			case BusinessNomenclaturePackage.BUSINESS_NOMENCLATURE_CONTAINER__TAXONOMY:
				getTaxonomy().clear();
				return;
			case BusinessNomenclaturePackage.BUSINESS_NOMENCLATURE_CONTAINER__GLOSSARY:
				getGlossary().clear();
				return;
			case BusinessNomenclaturePackage.BUSINESS_NOMENCLATURE_CONTAINER__BUSINESS_DOMAIN:
				getBusinessDomain().clear();
				return;
			case BusinessNomenclaturePackage.BUSINESS_NOMENCLATURE_CONTAINER__CONCEPT:
				getConcept().clear();
				return;
			case BusinessNomenclaturePackage.BUSINESS_NOMENCLATURE_CONTAINER__TERM:
				getTerm().clear();
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
			case BusinessNomenclaturePackage.BUSINESS_NOMENCLATURE_CONTAINER__VOCABULARY_ELEMENT:
				return vocabularyElement != null && !vocabularyElement.isEmpty();
			case BusinessNomenclaturePackage.BUSINESS_NOMENCLATURE_CONTAINER__NOMENCLATURE:
				return nomenclature != null && !nomenclature.isEmpty();
			case BusinessNomenclaturePackage.BUSINESS_NOMENCLATURE_CONTAINER__TAXONOMY:
				return taxonomy != null && !taxonomy.isEmpty();
			case BusinessNomenclaturePackage.BUSINESS_NOMENCLATURE_CONTAINER__GLOSSARY:
				return glossary != null && !glossary.isEmpty();
			case BusinessNomenclaturePackage.BUSINESS_NOMENCLATURE_CONTAINER__BUSINESS_DOMAIN:
				return businessDomain != null && !businessDomain.isEmpty();
			case BusinessNomenclaturePackage.BUSINESS_NOMENCLATURE_CONTAINER__CONCEPT:
				return concept != null && !concept.isEmpty();
			case BusinessNomenclaturePackage.BUSINESS_NOMENCLATURE_CONTAINER__TERM:
				return term != null && !term.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BusinessNomenclature_containerImpl

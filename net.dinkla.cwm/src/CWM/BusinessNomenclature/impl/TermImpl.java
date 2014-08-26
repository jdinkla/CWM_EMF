/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.BusinessNomenclature.impl;

import CWM.BusinessNomenclature.BusinessNomenclaturePackage;
import CWM.BusinessNomenclature.Concept;
import CWM.BusinessNomenclature.Term;

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
 * An implementation of the model object '<em><b>Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.BusinessNomenclature.impl.TermImpl#getGlossary <em>Glossary</em>}</li>
 *   <li>{@link CWM.BusinessNomenclature.impl.TermImpl#getConcept <em>Concept</em>}</li>
 *   <li>{@link CWM.BusinessNomenclature.impl.TermImpl#getRelatedTerm <em>Related Term</em>}</li>
 *   <li>{@link CWM.BusinessNomenclature.impl.TermImpl#getPreferredTerm <em>Preferred Term</em>}</li>
 *   <li>{@link CWM.BusinessNomenclature.impl.TermImpl#getNarrowerTerm <em>Narrower Term</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TermImpl extends VocabularyElementImpl implements Term {
	/**
	 * The cached value of the '{@link #getGlossary() <em>Glossary</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlossary()
	 * @generated
	 * @ordered
	 */
	protected Namespace glossary;

	/**
	 * The cached value of the '{@link #getConcept() <em>Concept</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcept()
	 * @generated
	 * @ordered
	 */
	protected EList<Concept> concept;

	/**
	 * The cached value of the '{@link #getRelatedTerm() <em>Related Term</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedTerm()
	 * @generated
	 * @ordered
	 */
	protected EList<Term> relatedTerm;

	/**
	 * The cached value of the '{@link #getPreferredTerm() <em>Preferred Term</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferredTerm()
	 * @generated
	 * @ordered
	 */
	protected Term preferredTerm;

	/**
	 * The cached value of the '{@link #getNarrowerTerm() <em>Narrower Term</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNarrowerTerm()
	 * @generated
	 * @ordered
	 */
	protected EList<Term> narrowerTerm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TermImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BusinessNomenclaturePackage.Literals.TERM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace getGlossary() {
		if (glossary != null && glossary.eIsProxy()) {
			InternalEObject oldGlossary = (InternalEObject)glossary;
			glossary = (Namespace)eResolveProxy(oldGlossary);
			if (glossary != oldGlossary) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BusinessNomenclaturePackage.TERM__GLOSSARY, oldGlossary, glossary));
			}
		}
		return glossary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace basicGetGlossary() {
		return glossary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlossary(Namespace newGlossary) {
		Namespace oldGlossary = glossary;
		glossary = newGlossary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessNomenclaturePackage.TERM__GLOSSARY, oldGlossary, glossary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Concept> getConcept() {
		if (concept == null) {
			concept = new EObjectResolvingEList<Concept>(Concept.class, this, BusinessNomenclaturePackage.TERM__CONCEPT);
		}
		return concept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Term> getRelatedTerm() {
		if (relatedTerm == null) {
			relatedTerm = new EObjectResolvingEList<Term>(Term.class, this, BusinessNomenclaturePackage.TERM__RELATED_TERM);
		}
		return relatedTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Term getPreferredTerm() {
		if (preferredTerm != null && preferredTerm.eIsProxy()) {
			InternalEObject oldPreferredTerm = (InternalEObject)preferredTerm;
			preferredTerm = (Term)eResolveProxy(oldPreferredTerm);
			if (preferredTerm != oldPreferredTerm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BusinessNomenclaturePackage.TERM__PREFERRED_TERM, oldPreferredTerm, preferredTerm));
			}
		}
		return preferredTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Term basicGetPreferredTerm() {
		return preferredTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreferredTerm(Term newPreferredTerm) {
		Term oldPreferredTerm = preferredTerm;
		preferredTerm = newPreferredTerm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessNomenclaturePackage.TERM__PREFERRED_TERM, oldPreferredTerm, preferredTerm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Term> getNarrowerTerm() {
		if (narrowerTerm == null) {
			narrowerTerm = new EObjectResolvingEList<Term>(Term.class, this, BusinessNomenclaturePackage.TERM__NARROWER_TERM);
		}
		return narrowerTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BusinessNomenclaturePackage.TERM__GLOSSARY:
				if (resolve) return getGlossary();
				return basicGetGlossary();
			case BusinessNomenclaturePackage.TERM__CONCEPT:
				return getConcept();
			case BusinessNomenclaturePackage.TERM__RELATED_TERM:
				return getRelatedTerm();
			case BusinessNomenclaturePackage.TERM__PREFERRED_TERM:
				if (resolve) return getPreferredTerm();
				return basicGetPreferredTerm();
			case BusinessNomenclaturePackage.TERM__NARROWER_TERM:
				return getNarrowerTerm();
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
			case BusinessNomenclaturePackage.TERM__GLOSSARY:
				setGlossary((Namespace)newValue);
				return;
			case BusinessNomenclaturePackage.TERM__CONCEPT:
				getConcept().clear();
				getConcept().addAll((Collection<? extends Concept>)newValue);
				return;
			case BusinessNomenclaturePackage.TERM__RELATED_TERM:
				getRelatedTerm().clear();
				getRelatedTerm().addAll((Collection<? extends Term>)newValue);
				return;
			case BusinessNomenclaturePackage.TERM__PREFERRED_TERM:
				setPreferredTerm((Term)newValue);
				return;
			case BusinessNomenclaturePackage.TERM__NARROWER_TERM:
				getNarrowerTerm().clear();
				getNarrowerTerm().addAll((Collection<? extends Term>)newValue);
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
			case BusinessNomenclaturePackage.TERM__GLOSSARY:
				setGlossary((Namespace)null);
				return;
			case BusinessNomenclaturePackage.TERM__CONCEPT:
				getConcept().clear();
				return;
			case BusinessNomenclaturePackage.TERM__RELATED_TERM:
				getRelatedTerm().clear();
				return;
			case BusinessNomenclaturePackage.TERM__PREFERRED_TERM:
				setPreferredTerm((Term)null);
				return;
			case BusinessNomenclaturePackage.TERM__NARROWER_TERM:
				getNarrowerTerm().clear();
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
			case BusinessNomenclaturePackage.TERM__GLOSSARY:
				return glossary != null;
			case BusinessNomenclaturePackage.TERM__CONCEPT:
				return concept != null && !concept.isEmpty();
			case BusinessNomenclaturePackage.TERM__RELATED_TERM:
				return relatedTerm != null && !relatedTerm.isEmpty();
			case BusinessNomenclaturePackage.TERM__PREFERRED_TERM:
				return preferredTerm != null;
			case BusinessNomenclaturePackage.TERM__NARROWER_TERM:
				return narrowerTerm != null && !narrowerTerm.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TermImpl

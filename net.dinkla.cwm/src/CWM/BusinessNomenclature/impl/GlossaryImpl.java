/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.BusinessNomenclature.impl;

import CWM.BusinessNomenclature.BusinessNomenclaturePackage;
import CWM.BusinessNomenclature.Glossary;
import CWM.BusinessNomenclature.Nomenclature;
import CWM.BusinessNomenclature.Taxonomy;

import CWM.Core.ModelElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Glossary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.BusinessNomenclature.impl.GlossaryImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link CWM.BusinessNomenclature.impl.GlossaryImpl#getTaxonomy <em>Taxonomy</em>}</li>
 *   <li>{@link CWM.BusinessNomenclature.impl.GlossaryImpl#getTerm <em>Term</em>}</li>
 *   <li>{@link CWM.BusinessNomenclature.impl.GlossaryImpl#getSubglossary <em>Subglossary</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GlossaryImpl extends NomenclatureImpl implements Glossary {
	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected String language = LANGUAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTaxonomy() <em>Taxonomy</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxonomy()
	 * @generated
	 * @ordered
	 */
	protected EList<Taxonomy> taxonomy;

	/**
	 * The cached value of the '{@link #getTerm() <em>Term</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerm()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelElement> term;

	/**
	 * The cached value of the '{@link #getSubglossary() <em>Subglossary</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubglossary()
	 * @generated
	 * @ordered
	 */
	protected EList<Nomenclature> subglossary;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlossaryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BusinessNomenclaturePackage.Literals.GLOSSARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(String newLanguage) {
		String oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessNomenclaturePackage.GLOSSARY__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Taxonomy> getTaxonomy() {
		if (taxonomy == null) {
			taxonomy = new EObjectResolvingEList<Taxonomy>(Taxonomy.class, this, BusinessNomenclaturePackage.GLOSSARY__TAXONOMY);
		}
		return taxonomy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelElement> getTerm() {
		if (term == null) {
			term = new EObjectContainmentEList<ModelElement>(ModelElement.class, this, BusinessNomenclaturePackage.GLOSSARY__TERM);
		}
		return term;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Nomenclature> getSubglossary() {
		if (subglossary == null) {
			subglossary = new EObjectContainmentEList<Nomenclature>(Nomenclature.class, this, BusinessNomenclaturePackage.GLOSSARY__SUBGLOSSARY);
		}
		return subglossary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BusinessNomenclaturePackage.GLOSSARY__TERM:
				return ((InternalEList<?>)getTerm()).basicRemove(otherEnd, msgs);
			case BusinessNomenclaturePackage.GLOSSARY__SUBGLOSSARY:
				return ((InternalEList<?>)getSubglossary()).basicRemove(otherEnd, msgs);
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
			case BusinessNomenclaturePackage.GLOSSARY__LANGUAGE:
				return getLanguage();
			case BusinessNomenclaturePackage.GLOSSARY__TAXONOMY:
				return getTaxonomy();
			case BusinessNomenclaturePackage.GLOSSARY__TERM:
				return getTerm();
			case BusinessNomenclaturePackage.GLOSSARY__SUBGLOSSARY:
				return getSubglossary();
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
			case BusinessNomenclaturePackage.GLOSSARY__LANGUAGE:
				setLanguage((String)newValue);
				return;
			case BusinessNomenclaturePackage.GLOSSARY__TAXONOMY:
				getTaxonomy().clear();
				getTaxonomy().addAll((Collection<? extends Taxonomy>)newValue);
				return;
			case BusinessNomenclaturePackage.GLOSSARY__TERM:
				getTerm().clear();
				getTerm().addAll((Collection<? extends ModelElement>)newValue);
				return;
			case BusinessNomenclaturePackage.GLOSSARY__SUBGLOSSARY:
				getSubglossary().clear();
				getSubglossary().addAll((Collection<? extends Nomenclature>)newValue);
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
			case BusinessNomenclaturePackage.GLOSSARY__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case BusinessNomenclaturePackage.GLOSSARY__TAXONOMY:
				getTaxonomy().clear();
				return;
			case BusinessNomenclaturePackage.GLOSSARY__TERM:
				getTerm().clear();
				return;
			case BusinessNomenclaturePackage.GLOSSARY__SUBGLOSSARY:
				getSubglossary().clear();
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
			case BusinessNomenclaturePackage.GLOSSARY__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
			case BusinessNomenclaturePackage.GLOSSARY__TAXONOMY:
				return taxonomy != null && !taxonomy.isEmpty();
			case BusinessNomenclaturePackage.GLOSSARY__TERM:
				return term != null && !term.isEmpty();
			case BusinessNomenclaturePackage.GLOSSARY__SUBGLOSSARY:
				return subglossary != null && !subglossary.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (language: ");
		result.append(language);
		result.append(')');
		return result.toString();
	}

} //GlossaryImpl

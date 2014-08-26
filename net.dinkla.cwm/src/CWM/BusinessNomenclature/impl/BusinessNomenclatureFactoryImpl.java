/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.BusinessNomenclature.impl;

import CWM.BusinessNomenclature.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BusinessNomenclatureFactoryImpl extends EFactoryImpl implements BusinessNomenclatureFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BusinessNomenclatureFactory init() {
		try {
			BusinessNomenclatureFactory theBusinessNomenclatureFactory = (BusinessNomenclatureFactory)EPackage.Registry.INSTANCE.getEFactory("BusinessNomenclature"); 
			if (theBusinessNomenclatureFactory != null) {
				return theBusinessNomenclatureFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BusinessNomenclatureFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessNomenclatureFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BusinessNomenclaturePackage.VOCABULARY_ELEMENT: return createVocabularyElement();
			case BusinessNomenclaturePackage.NOMENCLATURE: return createNomenclature();
			case BusinessNomenclaturePackage.TAXONOMY: return createTaxonomy();
			case BusinessNomenclaturePackage.GLOSSARY: return createGlossary();
			case BusinessNomenclaturePackage.BUSINESS_DOMAIN: return createBusinessDomain();
			case BusinessNomenclaturePackage.CONCEPT: return createConcept();
			case BusinessNomenclaturePackage.TERM: return createTerm();
			case BusinessNomenclaturePackage.BUSINESS_NOMENCLATURE_CONTAINER: return createBusinessNomenclature_container();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocabularyElement createVocabularyElement() {
		VocabularyElementImpl vocabularyElement = new VocabularyElementImpl();
		return vocabularyElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nomenclature createNomenclature() {
		NomenclatureImpl nomenclature = new NomenclatureImpl();
		return nomenclature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Taxonomy createTaxonomy() {
		TaxonomyImpl taxonomy = new TaxonomyImpl();
		return taxonomy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Glossary createGlossary() {
		GlossaryImpl glossary = new GlossaryImpl();
		return glossary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessDomain createBusinessDomain() {
		BusinessDomainImpl businessDomain = new BusinessDomainImpl();
		return businessDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concept createConcept() {
		ConceptImpl concept = new ConceptImpl();
		return concept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Term createTerm() {
		TermImpl term = new TermImpl();
		return term;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessNomenclature_container createBusinessNomenclature_container() {
		BusinessNomenclature_containerImpl businessNomenclature_container = new BusinessNomenclature_containerImpl();
		return businessNomenclature_container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessNomenclaturePackage getBusinessNomenclaturePackage() {
		return (BusinessNomenclaturePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BusinessNomenclaturePackage getPackage() {
		return BusinessNomenclaturePackage.eINSTANCE;
	}

} //BusinessNomenclatureFactoryImpl

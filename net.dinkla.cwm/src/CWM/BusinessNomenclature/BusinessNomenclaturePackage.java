/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.BusinessNomenclature;

import CWM.Core.CorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see CWM.BusinessNomenclature.BusinessNomenclatureFactory
 * @model kind="package"
 * @generated
 */
public interface BusinessNomenclaturePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "BusinessNomenclature";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "BusinessNomenclature";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "BusinessNomenclature";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BusinessNomenclaturePackage eINSTANCE = CWM.BusinessNomenclature.impl.BusinessNomenclaturePackageImpl.init();

	/**
	 * The meta object id for the '{@link CWM.BusinessNomenclature.impl.VocabularyElementImpl <em>Vocabulary Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.BusinessNomenclature.impl.VocabularyElementImpl
	 * @see CWM.BusinessNomenclature.impl.BusinessNomenclaturePackageImpl#getVocabularyElement()
	 * @generated
	 */
	int VOCABULARY_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOCABULARY_ELEMENT__NAME = CorePackage.MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOCABULARY_ELEMENT__VISIBILITY = CorePackage.MODEL_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOCABULARY_ELEMENT__CLIENT_DEPENDENCY = CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOCABULARY_ELEMENT__CONSTRAINT = CorePackage.MODEL_ELEMENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOCABULARY_ELEMENT__IMPORTER = CorePackage.MODEL_ELEMENT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOCABULARY_ELEMENT__NAMESPACE = CorePackage.MODEL_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOCABULARY_ELEMENT__TAGGED_VALUE = CorePackage.MODEL_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOCABULARY_ELEMENT__DEFINITION = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOCABULARY_ELEMENT__EXAMPLE = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOCABULARY_ELEMENT__USAGE = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOCABULARY_ELEMENT__MODEL_ELEMENT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Vocabulary Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOCABULARY_ELEMENT_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link CWM.BusinessNomenclature.impl.NomenclatureImpl <em>Nomenclature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.BusinessNomenclature.impl.NomenclatureImpl
	 * @see CWM.BusinessNomenclature.impl.BusinessNomenclaturePackageImpl#getNomenclature()
	 * @generated
	 */
	int NOMENCLATURE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOMENCLATURE__NAME = CorePackage.PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOMENCLATURE__VISIBILITY = CorePackage.PACKAGE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOMENCLATURE__CLIENT_DEPENDENCY = CorePackage.PACKAGE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOMENCLATURE__CONSTRAINT = CorePackage.PACKAGE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOMENCLATURE__IMPORTER = CorePackage.PACKAGE__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOMENCLATURE__NAMESPACE = CorePackage.PACKAGE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOMENCLATURE__TAGGED_VALUE = CorePackage.PACKAGE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOMENCLATURE__OWNED_ELEMENT = CorePackage.PACKAGE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Imported Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOMENCLATURE__IMPORTED_ELEMENT = CorePackage.PACKAGE__IMPORTED_ELEMENT;

	/**
	 * The number of structural features of the '<em>Nomenclature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOMENCLATURE_FEATURE_COUNT = CorePackage.PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CWM.BusinessNomenclature.impl.TaxonomyImpl <em>Taxonomy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.BusinessNomenclature.impl.TaxonomyImpl
	 * @see CWM.BusinessNomenclature.impl.BusinessNomenclaturePackageImpl#getTaxonomy()
	 * @generated
	 */
	int TAXONOMY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAXONOMY__NAME = NOMENCLATURE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAXONOMY__VISIBILITY = NOMENCLATURE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAXONOMY__CLIENT_DEPENDENCY = NOMENCLATURE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAXONOMY__CONSTRAINT = NOMENCLATURE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAXONOMY__IMPORTER = NOMENCLATURE__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAXONOMY__NAMESPACE = NOMENCLATURE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAXONOMY__TAGGED_VALUE = NOMENCLATURE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAXONOMY__OWNED_ELEMENT = NOMENCLATURE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Imported Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAXONOMY__IMPORTED_ELEMENT = NOMENCLATURE__IMPORTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAXONOMY__DOMAIN = NOMENCLATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Concept</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAXONOMY__CONCEPT = NOMENCLATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Subtaxonomy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAXONOMY__SUBTAXONOMY = NOMENCLATURE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Taxonomy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAXONOMY_FEATURE_COUNT = NOMENCLATURE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link CWM.BusinessNomenclature.impl.GlossaryImpl <em>Glossary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.BusinessNomenclature.impl.GlossaryImpl
	 * @see CWM.BusinessNomenclature.impl.BusinessNomenclaturePackageImpl#getGlossary()
	 * @generated
	 */
	int GLOSSARY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY__NAME = NOMENCLATURE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY__VISIBILITY = NOMENCLATURE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY__CLIENT_DEPENDENCY = NOMENCLATURE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY__CONSTRAINT = NOMENCLATURE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY__IMPORTER = NOMENCLATURE__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY__NAMESPACE = NOMENCLATURE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY__TAGGED_VALUE = NOMENCLATURE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY__OWNED_ELEMENT = NOMENCLATURE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Imported Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY__IMPORTED_ELEMENT = NOMENCLATURE__IMPORTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY__LANGUAGE = NOMENCLATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Taxonomy</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY__TAXONOMY = NOMENCLATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Term</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY__TERM = NOMENCLATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Subglossary</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY__SUBGLOSSARY = NOMENCLATURE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Glossary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_FEATURE_COUNT = NOMENCLATURE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link CWM.BusinessNomenclature.impl.BusinessDomainImpl <em>Business Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.BusinessNomenclature.impl.BusinessDomainImpl
	 * @see CWM.BusinessNomenclature.impl.BusinessNomenclaturePackageImpl#getBusinessDomain()
	 * @generated
	 */
	int BUSINESS_DOMAIN = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_DOMAIN__NAME = CorePackage.PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_DOMAIN__VISIBILITY = CorePackage.PACKAGE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_DOMAIN__CLIENT_DEPENDENCY = CorePackage.PACKAGE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_DOMAIN__CONSTRAINT = CorePackage.PACKAGE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_DOMAIN__IMPORTER = CorePackage.PACKAGE__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_DOMAIN__NAMESPACE = CorePackage.PACKAGE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_DOMAIN__TAGGED_VALUE = CorePackage.PACKAGE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_DOMAIN__OWNED_ELEMENT = CorePackage.PACKAGE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Imported Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_DOMAIN__IMPORTED_ELEMENT = CorePackage.PACKAGE__IMPORTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Taxonomy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_DOMAIN__TAXONOMY = CorePackage.PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Business Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_DOMAIN_FEATURE_COUNT = CorePackage.PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CWM.BusinessNomenclature.impl.ConceptImpl <em>Concept</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.BusinessNomenclature.impl.ConceptImpl
	 * @see CWM.BusinessNomenclature.impl.BusinessNomenclaturePackageImpl#getConcept()
	 * @generated
	 */
	int CONCEPT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__NAME = VOCABULARY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__VISIBILITY = VOCABULARY_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__CLIENT_DEPENDENCY = VOCABULARY_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__CONSTRAINT = VOCABULARY_ELEMENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__IMPORTER = VOCABULARY_ELEMENT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__NAMESPACE = VOCABULARY_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__TAGGED_VALUE = VOCABULARY_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__DEFINITION = VOCABULARY_ELEMENT__DEFINITION;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__EXAMPLE = VOCABULARY_ELEMENT__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__USAGE = VOCABULARY_ELEMENT__USAGE;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__MODEL_ELEMENT = VOCABULARY_ELEMENT__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Taxonomy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__TAXONOMY = VOCABULARY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Related Concept</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__RELATED_CONCEPT = VOCABULARY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_FEATURE_COUNT = VOCABULARY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link CWM.BusinessNomenclature.impl.TermImpl <em>Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.BusinessNomenclature.impl.TermImpl
	 * @see CWM.BusinessNomenclature.impl.BusinessNomenclaturePackageImpl#getTerm()
	 * @generated
	 */
	int TERM = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__NAME = VOCABULARY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__VISIBILITY = VOCABULARY_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__CLIENT_DEPENDENCY = VOCABULARY_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__CONSTRAINT = VOCABULARY_ELEMENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__IMPORTER = VOCABULARY_ELEMENT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__NAMESPACE = VOCABULARY_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__TAGGED_VALUE = VOCABULARY_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__DEFINITION = VOCABULARY_ELEMENT__DEFINITION;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__EXAMPLE = VOCABULARY_ELEMENT__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__USAGE = VOCABULARY_ELEMENT__USAGE;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__MODEL_ELEMENT = VOCABULARY_ELEMENT__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Glossary</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__GLOSSARY = VOCABULARY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Concept</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__CONCEPT = VOCABULARY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Related Term</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__RELATED_TERM = VOCABULARY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Preferred Term</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__PREFERRED_TERM = VOCABULARY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Narrower Term</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__NARROWER_TERM = VOCABULARY_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_FEATURE_COUNT = VOCABULARY_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link CWM.BusinessNomenclature.impl.BusinessNomenclature_containerImpl <em>Business Nomenclature container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.BusinessNomenclature.impl.BusinessNomenclature_containerImpl
	 * @see CWM.BusinessNomenclature.impl.BusinessNomenclaturePackageImpl#getBusinessNomenclature_container()
	 * @generated
	 */
	int BUSINESS_NOMENCLATURE_CONTAINER = 7;

	/**
	 * The feature id for the '<em><b>Vocabulary Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_NOMENCLATURE_CONTAINER__VOCABULARY_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Nomenclature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_NOMENCLATURE_CONTAINER__NOMENCLATURE = 1;

	/**
	 * The feature id for the '<em><b>Taxonomy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_NOMENCLATURE_CONTAINER__TAXONOMY = 2;

	/**
	 * The feature id for the '<em><b>Glossary</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_NOMENCLATURE_CONTAINER__GLOSSARY = 3;

	/**
	 * The feature id for the '<em><b>Business Domain</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_NOMENCLATURE_CONTAINER__BUSINESS_DOMAIN = 4;

	/**
	 * The feature id for the '<em><b>Concept</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_NOMENCLATURE_CONTAINER__CONCEPT = 5;

	/**
	 * The feature id for the '<em><b>Term</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_NOMENCLATURE_CONTAINER__TERM = 6;

	/**
	 * The number of structural features of the '<em>Business Nomenclature container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_NOMENCLATURE_CONTAINER_FEATURE_COUNT = 7;


	/**
	 * Returns the meta object for class '{@link CWM.BusinessNomenclature.VocabularyElement <em>Vocabulary Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vocabulary Element</em>'.
	 * @see CWM.BusinessNomenclature.VocabularyElement
	 * @generated
	 */
	EClass getVocabularyElement();

	/**
	 * Returns the meta object for the attribute '{@link CWM.BusinessNomenclature.VocabularyElement#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Definition</em>'.
	 * @see CWM.BusinessNomenclature.VocabularyElement#getDefinition()
	 * @see #getVocabularyElement()
	 * @generated
	 */
	EAttribute getVocabularyElement_Definition();

	/**
	 * Returns the meta object for the attribute '{@link CWM.BusinessNomenclature.VocabularyElement#getExample <em>Example</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Example</em>'.
	 * @see CWM.BusinessNomenclature.VocabularyElement#getExample()
	 * @see #getVocabularyElement()
	 * @generated
	 */
	EAttribute getVocabularyElement_Example();

	/**
	 * Returns the meta object for the attribute '{@link CWM.BusinessNomenclature.VocabularyElement#getUsage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage</em>'.
	 * @see CWM.BusinessNomenclature.VocabularyElement#getUsage()
	 * @see #getVocabularyElement()
	 * @generated
	 */
	EAttribute getVocabularyElement_Usage();

	/**
	 * Returns the meta object for the reference list '{@link CWM.BusinessNomenclature.VocabularyElement#getModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Model Element</em>'.
	 * @see CWM.BusinessNomenclature.VocabularyElement#getModelElement()
	 * @see #getVocabularyElement()
	 * @generated
	 */
	EReference getVocabularyElement_ModelElement();

	/**
	 * Returns the meta object for class '{@link CWM.BusinessNomenclature.Nomenclature <em>Nomenclature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nomenclature</em>'.
	 * @see CWM.BusinessNomenclature.Nomenclature
	 * @generated
	 */
	EClass getNomenclature();

	/**
	 * Returns the meta object for class '{@link CWM.BusinessNomenclature.Taxonomy <em>Taxonomy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Taxonomy</em>'.
	 * @see CWM.BusinessNomenclature.Taxonomy
	 * @generated
	 */
	EClass getTaxonomy();

	/**
	 * Returns the meta object for the reference '{@link CWM.BusinessNomenclature.Taxonomy#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain</em>'.
	 * @see CWM.BusinessNomenclature.Taxonomy#getDomain()
	 * @see #getTaxonomy()
	 * @generated
	 */
	EReference getTaxonomy_Domain();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.BusinessNomenclature.Taxonomy#getConcept <em>Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Concept</em>'.
	 * @see CWM.BusinessNomenclature.Taxonomy#getConcept()
	 * @see #getTaxonomy()
	 * @generated
	 */
	EReference getTaxonomy_Concept();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.BusinessNomenclature.Taxonomy#getSubtaxonomy <em>Subtaxonomy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subtaxonomy</em>'.
	 * @see CWM.BusinessNomenclature.Taxonomy#getSubtaxonomy()
	 * @see #getTaxonomy()
	 * @generated
	 */
	EReference getTaxonomy_Subtaxonomy();

	/**
	 * Returns the meta object for class '{@link CWM.BusinessNomenclature.Glossary <em>Glossary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Glossary</em>'.
	 * @see CWM.BusinessNomenclature.Glossary
	 * @generated
	 */
	EClass getGlossary();

	/**
	 * Returns the meta object for the attribute '{@link CWM.BusinessNomenclature.Glossary#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see CWM.BusinessNomenclature.Glossary#getLanguage()
	 * @see #getGlossary()
	 * @generated
	 */
	EAttribute getGlossary_Language();

	/**
	 * Returns the meta object for the reference list '{@link CWM.BusinessNomenclature.Glossary#getTaxonomy <em>Taxonomy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Taxonomy</em>'.
	 * @see CWM.BusinessNomenclature.Glossary#getTaxonomy()
	 * @see #getGlossary()
	 * @generated
	 */
	EReference getGlossary_Taxonomy();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.BusinessNomenclature.Glossary#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Term</em>'.
	 * @see CWM.BusinessNomenclature.Glossary#getTerm()
	 * @see #getGlossary()
	 * @generated
	 */
	EReference getGlossary_Term();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.BusinessNomenclature.Glossary#getSubglossary <em>Subglossary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subglossary</em>'.
	 * @see CWM.BusinessNomenclature.Glossary#getSubglossary()
	 * @see #getGlossary()
	 * @generated
	 */
	EReference getGlossary_Subglossary();

	/**
	 * Returns the meta object for class '{@link CWM.BusinessNomenclature.BusinessDomain <em>Business Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Domain</em>'.
	 * @see CWM.BusinessNomenclature.BusinessDomain
	 * @generated
	 */
	EClass getBusinessDomain();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.BusinessNomenclature.BusinessDomain#getTaxonomy <em>Taxonomy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Taxonomy</em>'.
	 * @see CWM.BusinessNomenclature.BusinessDomain#getTaxonomy()
	 * @see #getBusinessDomain()
	 * @generated
	 */
	EReference getBusinessDomain_Taxonomy();

	/**
	 * Returns the meta object for class '{@link CWM.BusinessNomenclature.Concept <em>Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concept</em>'.
	 * @see CWM.BusinessNomenclature.Concept
	 * @generated
	 */
	EClass getConcept();

	/**
	 * Returns the meta object for the reference '{@link CWM.BusinessNomenclature.Concept#getTaxonomy <em>Taxonomy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Taxonomy</em>'.
	 * @see CWM.BusinessNomenclature.Concept#getTaxonomy()
	 * @see #getConcept()
	 * @generated
	 */
	EReference getConcept_Taxonomy();

	/**
	 * Returns the meta object for the reference list '{@link CWM.BusinessNomenclature.Concept#getRelatedConcept <em>Related Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Related Concept</em>'.
	 * @see CWM.BusinessNomenclature.Concept#getRelatedConcept()
	 * @see #getConcept()
	 * @generated
	 */
	EReference getConcept_RelatedConcept();

	/**
	 * Returns the meta object for class '{@link CWM.BusinessNomenclature.Term <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term</em>'.
	 * @see CWM.BusinessNomenclature.Term
	 * @generated
	 */
	EClass getTerm();

	/**
	 * Returns the meta object for the reference '{@link CWM.BusinessNomenclature.Term#getGlossary <em>Glossary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Glossary</em>'.
	 * @see CWM.BusinessNomenclature.Term#getGlossary()
	 * @see #getTerm()
	 * @generated
	 */
	EReference getTerm_Glossary();

	/**
	 * Returns the meta object for the reference list '{@link CWM.BusinessNomenclature.Term#getConcept <em>Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Concept</em>'.
	 * @see CWM.BusinessNomenclature.Term#getConcept()
	 * @see #getTerm()
	 * @generated
	 */
	EReference getTerm_Concept();

	/**
	 * Returns the meta object for the reference list '{@link CWM.BusinessNomenclature.Term#getRelatedTerm <em>Related Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Related Term</em>'.
	 * @see CWM.BusinessNomenclature.Term#getRelatedTerm()
	 * @see #getTerm()
	 * @generated
	 */
	EReference getTerm_RelatedTerm();

	/**
	 * Returns the meta object for the reference '{@link CWM.BusinessNomenclature.Term#getPreferredTerm <em>Preferred Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Preferred Term</em>'.
	 * @see CWM.BusinessNomenclature.Term#getPreferredTerm()
	 * @see #getTerm()
	 * @generated
	 */
	EReference getTerm_PreferredTerm();

	/**
	 * Returns the meta object for the reference list '{@link CWM.BusinessNomenclature.Term#getNarrowerTerm <em>Narrower Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Narrower Term</em>'.
	 * @see CWM.BusinessNomenclature.Term#getNarrowerTerm()
	 * @see #getTerm()
	 * @generated
	 */
	EReference getTerm_NarrowerTerm();

	/**
	 * Returns the meta object for class '{@link CWM.BusinessNomenclature.BusinessNomenclature_container <em>Business Nomenclature container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Nomenclature container</em>'.
	 * @see CWM.BusinessNomenclature.BusinessNomenclature_container
	 * @generated
	 */
	EClass getBusinessNomenclature_container();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.BusinessNomenclature.BusinessNomenclature_container#getVocabularyElement <em>Vocabulary Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vocabulary Element</em>'.
	 * @see CWM.BusinessNomenclature.BusinessNomenclature_container#getVocabularyElement()
	 * @see #getBusinessNomenclature_container()
	 * @generated
	 */
	EReference getBusinessNomenclature_container_VocabularyElement();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.BusinessNomenclature.BusinessNomenclature_container#getNomenclature <em>Nomenclature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nomenclature</em>'.
	 * @see CWM.BusinessNomenclature.BusinessNomenclature_container#getNomenclature()
	 * @see #getBusinessNomenclature_container()
	 * @generated
	 */
	EReference getBusinessNomenclature_container_Nomenclature();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.BusinessNomenclature.BusinessNomenclature_container#getTaxonomy <em>Taxonomy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Taxonomy</em>'.
	 * @see CWM.BusinessNomenclature.BusinessNomenclature_container#getTaxonomy()
	 * @see #getBusinessNomenclature_container()
	 * @generated
	 */
	EReference getBusinessNomenclature_container_Taxonomy();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.BusinessNomenclature.BusinessNomenclature_container#getGlossary <em>Glossary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Glossary</em>'.
	 * @see CWM.BusinessNomenclature.BusinessNomenclature_container#getGlossary()
	 * @see #getBusinessNomenclature_container()
	 * @generated
	 */
	EReference getBusinessNomenclature_container_Glossary();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.BusinessNomenclature.BusinessNomenclature_container#getBusinessDomain <em>Business Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Business Domain</em>'.
	 * @see CWM.BusinessNomenclature.BusinessNomenclature_container#getBusinessDomain()
	 * @see #getBusinessNomenclature_container()
	 * @generated
	 */
	EReference getBusinessNomenclature_container_BusinessDomain();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.BusinessNomenclature.BusinessNomenclature_container#getConcept <em>Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Concept</em>'.
	 * @see CWM.BusinessNomenclature.BusinessNomenclature_container#getConcept()
	 * @see #getBusinessNomenclature_container()
	 * @generated
	 */
	EReference getBusinessNomenclature_container_Concept();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.BusinessNomenclature.BusinessNomenclature_container#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Term</em>'.
	 * @see CWM.BusinessNomenclature.BusinessNomenclature_container#getTerm()
	 * @see #getBusinessNomenclature_container()
	 * @generated
	 */
	EReference getBusinessNomenclature_container_Term();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BusinessNomenclatureFactory getBusinessNomenclatureFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link CWM.BusinessNomenclature.impl.VocabularyElementImpl <em>Vocabulary Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.BusinessNomenclature.impl.VocabularyElementImpl
		 * @see CWM.BusinessNomenclature.impl.BusinessNomenclaturePackageImpl#getVocabularyElement()
		 * @generated
		 */
		EClass VOCABULARY_ELEMENT = eINSTANCE.getVocabularyElement();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOCABULARY_ELEMENT__DEFINITION = eINSTANCE.getVocabularyElement_Definition();

		/**
		 * The meta object literal for the '<em><b>Example</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOCABULARY_ELEMENT__EXAMPLE = eINSTANCE.getVocabularyElement_Example();

		/**
		 * The meta object literal for the '<em><b>Usage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOCABULARY_ELEMENT__USAGE = eINSTANCE.getVocabularyElement_Usage();

		/**
		 * The meta object literal for the '<em><b>Model Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOCABULARY_ELEMENT__MODEL_ELEMENT = eINSTANCE.getVocabularyElement_ModelElement();

		/**
		 * The meta object literal for the '{@link CWM.BusinessNomenclature.impl.NomenclatureImpl <em>Nomenclature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.BusinessNomenclature.impl.NomenclatureImpl
		 * @see CWM.BusinessNomenclature.impl.BusinessNomenclaturePackageImpl#getNomenclature()
		 * @generated
		 */
		EClass NOMENCLATURE = eINSTANCE.getNomenclature();

		/**
		 * The meta object literal for the '{@link CWM.BusinessNomenclature.impl.TaxonomyImpl <em>Taxonomy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.BusinessNomenclature.impl.TaxonomyImpl
		 * @see CWM.BusinessNomenclature.impl.BusinessNomenclaturePackageImpl#getTaxonomy()
		 * @generated
		 */
		EClass TAXONOMY = eINSTANCE.getTaxonomy();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAXONOMY__DOMAIN = eINSTANCE.getTaxonomy_Domain();

		/**
		 * The meta object literal for the '<em><b>Concept</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAXONOMY__CONCEPT = eINSTANCE.getTaxonomy_Concept();

		/**
		 * The meta object literal for the '<em><b>Subtaxonomy</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAXONOMY__SUBTAXONOMY = eINSTANCE.getTaxonomy_Subtaxonomy();

		/**
		 * The meta object literal for the '{@link CWM.BusinessNomenclature.impl.GlossaryImpl <em>Glossary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.BusinessNomenclature.impl.GlossaryImpl
		 * @see CWM.BusinessNomenclature.impl.BusinessNomenclaturePackageImpl#getGlossary()
		 * @generated
		 */
		EClass GLOSSARY = eINSTANCE.getGlossary();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOSSARY__LANGUAGE = eINSTANCE.getGlossary_Language();

		/**
		 * The meta object literal for the '<em><b>Taxonomy</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOSSARY__TAXONOMY = eINSTANCE.getGlossary_Taxonomy();

		/**
		 * The meta object literal for the '<em><b>Term</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOSSARY__TERM = eINSTANCE.getGlossary_Term();

		/**
		 * The meta object literal for the '<em><b>Subglossary</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOSSARY__SUBGLOSSARY = eINSTANCE.getGlossary_Subglossary();

		/**
		 * The meta object literal for the '{@link CWM.BusinessNomenclature.impl.BusinessDomainImpl <em>Business Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.BusinessNomenclature.impl.BusinessDomainImpl
		 * @see CWM.BusinessNomenclature.impl.BusinessNomenclaturePackageImpl#getBusinessDomain()
		 * @generated
		 */
		EClass BUSINESS_DOMAIN = eINSTANCE.getBusinessDomain();

		/**
		 * The meta object literal for the '<em><b>Taxonomy</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_DOMAIN__TAXONOMY = eINSTANCE.getBusinessDomain_Taxonomy();

		/**
		 * The meta object literal for the '{@link CWM.BusinessNomenclature.impl.ConceptImpl <em>Concept</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.BusinessNomenclature.impl.ConceptImpl
		 * @see CWM.BusinessNomenclature.impl.BusinessNomenclaturePackageImpl#getConcept()
		 * @generated
		 */
		EClass CONCEPT = eINSTANCE.getConcept();

		/**
		 * The meta object literal for the '<em><b>Taxonomy</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPT__TAXONOMY = eINSTANCE.getConcept_Taxonomy();

		/**
		 * The meta object literal for the '<em><b>Related Concept</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPT__RELATED_CONCEPT = eINSTANCE.getConcept_RelatedConcept();

		/**
		 * The meta object literal for the '{@link CWM.BusinessNomenclature.impl.TermImpl <em>Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.BusinessNomenclature.impl.TermImpl
		 * @see CWM.BusinessNomenclature.impl.BusinessNomenclaturePackageImpl#getTerm()
		 * @generated
		 */
		EClass TERM = eINSTANCE.getTerm();

		/**
		 * The meta object literal for the '<em><b>Glossary</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERM__GLOSSARY = eINSTANCE.getTerm_Glossary();

		/**
		 * The meta object literal for the '<em><b>Concept</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERM__CONCEPT = eINSTANCE.getTerm_Concept();

		/**
		 * The meta object literal for the '<em><b>Related Term</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERM__RELATED_TERM = eINSTANCE.getTerm_RelatedTerm();

		/**
		 * The meta object literal for the '<em><b>Preferred Term</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERM__PREFERRED_TERM = eINSTANCE.getTerm_PreferredTerm();

		/**
		 * The meta object literal for the '<em><b>Narrower Term</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERM__NARROWER_TERM = eINSTANCE.getTerm_NarrowerTerm();

		/**
		 * The meta object literal for the '{@link CWM.BusinessNomenclature.impl.BusinessNomenclature_containerImpl <em>Business Nomenclature container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.BusinessNomenclature.impl.BusinessNomenclature_containerImpl
		 * @see CWM.BusinessNomenclature.impl.BusinessNomenclaturePackageImpl#getBusinessNomenclature_container()
		 * @generated
		 */
		EClass BUSINESS_NOMENCLATURE_CONTAINER = eINSTANCE.getBusinessNomenclature_container();

		/**
		 * The meta object literal for the '<em><b>Vocabulary Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_NOMENCLATURE_CONTAINER__VOCABULARY_ELEMENT = eINSTANCE.getBusinessNomenclature_container_VocabularyElement();

		/**
		 * The meta object literal for the '<em><b>Nomenclature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_NOMENCLATURE_CONTAINER__NOMENCLATURE = eINSTANCE.getBusinessNomenclature_container_Nomenclature();

		/**
		 * The meta object literal for the '<em><b>Taxonomy</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_NOMENCLATURE_CONTAINER__TAXONOMY = eINSTANCE.getBusinessNomenclature_container_Taxonomy();

		/**
		 * The meta object literal for the '<em><b>Glossary</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_NOMENCLATURE_CONTAINER__GLOSSARY = eINSTANCE.getBusinessNomenclature_container_Glossary();

		/**
		 * The meta object literal for the '<em><b>Business Domain</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_NOMENCLATURE_CONTAINER__BUSINESS_DOMAIN = eINSTANCE.getBusinessNomenclature_container_BusinessDomain();

		/**
		 * The meta object literal for the '<em><b>Concept</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_NOMENCLATURE_CONTAINER__CONCEPT = eINSTANCE.getBusinessNomenclature_container_Concept();

		/**
		 * The meta object literal for the '<em><b>Term</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_NOMENCLATURE_CONTAINER__TERM = eINSTANCE.getBusinessNomenclature_container_Term();

	}

} //BusinessNomenclaturePackage

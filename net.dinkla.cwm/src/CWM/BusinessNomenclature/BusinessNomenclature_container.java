/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.BusinessNomenclature;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Nomenclature container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.BusinessNomenclature.BusinessNomenclature_container#getVocabularyElement <em>Vocabulary Element</em>}</li>
 *   <li>{@link CWM.BusinessNomenclature.BusinessNomenclature_container#getNomenclature <em>Nomenclature</em>}</li>
 *   <li>{@link CWM.BusinessNomenclature.BusinessNomenclature_container#getTaxonomy <em>Taxonomy</em>}</li>
 *   <li>{@link CWM.BusinessNomenclature.BusinessNomenclature_container#getGlossary <em>Glossary</em>}</li>
 *   <li>{@link CWM.BusinessNomenclature.BusinessNomenclature_container#getBusinessDomain <em>Business Domain</em>}</li>
 *   <li>{@link CWM.BusinessNomenclature.BusinessNomenclature_container#getConcept <em>Concept</em>}</li>
 *   <li>{@link CWM.BusinessNomenclature.BusinessNomenclature_container#getTerm <em>Term</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.BusinessNomenclature.BusinessNomenclaturePackage#getBusinessNomenclature_container()
 * @model
 * @generated
 */
public interface BusinessNomenclature_container extends EObject {
	/**
	 * Returns the value of the '<em><b>Vocabulary Element</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.BusinessNomenclature.VocabularyElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vocabulary Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vocabulary Element</em>' containment reference list.
	 * @see CWM.BusinessNomenclature.BusinessNomenclaturePackage#getBusinessNomenclature_container_VocabularyElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<VocabularyElement> getVocabularyElement();

	/**
	 * Returns the value of the '<em><b>Nomenclature</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.BusinessNomenclature.Nomenclature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nomenclature</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nomenclature</em>' containment reference list.
	 * @see CWM.BusinessNomenclature.BusinessNomenclaturePackage#getBusinessNomenclature_container_Nomenclature()
	 * @model containment="true"
	 * @generated
	 */
	EList<Nomenclature> getNomenclature();

	/**
	 * Returns the value of the '<em><b>Taxonomy</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.BusinessNomenclature.Taxonomy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Taxonomy</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Taxonomy</em>' containment reference list.
	 * @see CWM.BusinessNomenclature.BusinessNomenclaturePackage#getBusinessNomenclature_container_Taxonomy()
	 * @model containment="true"
	 * @generated
	 */
	EList<Taxonomy> getTaxonomy();

	/**
	 * Returns the value of the '<em><b>Glossary</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.BusinessNomenclature.Glossary}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Glossary</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glossary</em>' containment reference list.
	 * @see CWM.BusinessNomenclature.BusinessNomenclaturePackage#getBusinessNomenclature_container_Glossary()
	 * @model containment="true"
	 * @generated
	 */
	EList<Glossary> getGlossary();

	/**
	 * Returns the value of the '<em><b>Business Domain</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.BusinessNomenclature.BusinessDomain}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Domain</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Domain</em>' containment reference list.
	 * @see CWM.BusinessNomenclature.BusinessNomenclaturePackage#getBusinessNomenclature_container_BusinessDomain()
	 * @model containment="true"
	 * @generated
	 */
	EList<BusinessDomain> getBusinessDomain();

	/**
	 * Returns the value of the '<em><b>Concept</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.BusinessNomenclature.Concept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concept</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concept</em>' containment reference list.
	 * @see CWM.BusinessNomenclature.BusinessNomenclaturePackage#getBusinessNomenclature_container_Concept()
	 * @model containment="true"
	 * @generated
	 */
	EList<Concept> getConcept();

	/**
	 * Returns the value of the '<em><b>Term</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.BusinessNomenclature.Term}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Term</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Term</em>' containment reference list.
	 * @see CWM.BusinessNomenclature.BusinessNomenclaturePackage#getBusinessNomenclature_container_Term()
	 * @model containment="true"
	 * @generated
	 */
	EList<Term> getTerm();

} // BusinessNomenclature_container

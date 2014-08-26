/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.BusinessNomenclature;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see CWM.BusinessNomenclature.BusinessNomenclaturePackage
 * @generated
 */
public interface BusinessNomenclatureFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BusinessNomenclatureFactory eINSTANCE = CWM.BusinessNomenclature.impl.BusinessNomenclatureFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Vocabulary Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vocabulary Element</em>'.
	 * @generated
	 */
	VocabularyElement createVocabularyElement();

	/**
	 * Returns a new object of class '<em>Nomenclature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nomenclature</em>'.
	 * @generated
	 */
	Nomenclature createNomenclature();

	/**
	 * Returns a new object of class '<em>Taxonomy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Taxonomy</em>'.
	 * @generated
	 */
	Taxonomy createTaxonomy();

	/**
	 * Returns a new object of class '<em>Glossary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Glossary</em>'.
	 * @generated
	 */
	Glossary createGlossary();

	/**
	 * Returns a new object of class '<em>Business Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business Domain</em>'.
	 * @generated
	 */
	BusinessDomain createBusinessDomain();

	/**
	 * Returns a new object of class '<em>Concept</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concept</em>'.
	 * @generated
	 */
	Concept createConcept();

	/**
	 * Returns a new object of class '<em>Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Term</em>'.
	 * @generated
	 */
	Term createTerm();

	/**
	 * Returns a new object of class '<em>Business Nomenclature container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business Nomenclature container</em>'.
	 * @generated
	 */
	BusinessNomenclature_container createBusinessNomenclature_container();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BusinessNomenclaturePackage getBusinessNomenclaturePackage();

} //BusinessNomenclatureFactory

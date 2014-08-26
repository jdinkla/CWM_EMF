/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.BusinessNomenclature;

import CWM.Core.Namespace;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concept</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.BusinessNomenclature.Concept#getTaxonomy <em>Taxonomy</em>}</li>
 *   <li>{@link CWM.BusinessNomenclature.Concept#getRelatedConcept <em>Related Concept</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.BusinessNomenclature.BusinessNomenclaturePackage#getConcept()
 * @model
 * @generated
 */
public interface Concept extends VocabularyElement {
	/**
	 * Returns the value of the '<em><b>Taxonomy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Taxonomy</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Taxonomy</em>' reference.
	 * @see #setTaxonomy(Namespace)
	 * @see CWM.BusinessNomenclature.BusinessNomenclaturePackage#getConcept_Taxonomy()
	 * @model ordered="false"
	 * @generated
	 */
	Namespace getTaxonomy();

	/**
	 * Sets the value of the '{@link CWM.BusinessNomenclature.Concept#getTaxonomy <em>Taxonomy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taxonomy</em>' reference.
	 * @see #getTaxonomy()
	 * @generated
	 */
	void setTaxonomy(Namespace value);

	/**
	 * Returns the value of the '<em><b>Related Concept</b></em>' reference list.
	 * The list contents are of type {@link CWM.BusinessNomenclature.Concept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Concept</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Concept</em>' reference list.
	 * @see CWM.BusinessNomenclature.BusinessNomenclaturePackage#getConcept_RelatedConcept()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Concept> getRelatedConcept();

} // Concept

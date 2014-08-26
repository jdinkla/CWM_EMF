/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.BusinessNomenclature;

import CWM.Core.ModelElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Glossary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.BusinessNomenclature.Glossary#getLanguage <em>Language</em>}</li>
 *   <li>{@link CWM.BusinessNomenclature.Glossary#getTaxonomy <em>Taxonomy</em>}</li>
 *   <li>{@link CWM.BusinessNomenclature.Glossary#getTerm <em>Term</em>}</li>
 *   <li>{@link CWM.BusinessNomenclature.Glossary#getSubglossary <em>Subglossary</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.BusinessNomenclature.BusinessNomenclaturePackage#getGlossary()
 * @model
 * @generated
 */
public interface Glossary extends Nomenclature {
	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see CWM.BusinessNomenclature.BusinessNomenclaturePackage#getGlossary_Language()
	 * @model unique="false" dataType="CWM.Core.String" required="true" ordered="false"
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link CWM.BusinessNomenclature.Glossary#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Taxonomy</b></em>' reference list.
	 * The list contents are of type {@link CWM.BusinessNomenclature.Taxonomy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Taxonomy</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Taxonomy</em>' reference list.
	 * @see CWM.BusinessNomenclature.BusinessNomenclaturePackage#getGlossary_Taxonomy()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Taxonomy> getTaxonomy();

	/**
	 * Returns the value of the '<em><b>Term</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Core.ModelElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Term</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Term</em>' containment reference list.
	 * @see CWM.BusinessNomenclature.BusinessNomenclaturePackage#getGlossary_Term()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ModelElement> getTerm();

	/**
	 * Returns the value of the '<em><b>Subglossary</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.BusinessNomenclature.Nomenclature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subglossary</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subglossary</em>' containment reference list.
	 * @see CWM.BusinessNomenclature.BusinessNomenclaturePackage#getGlossary_Subglossary()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Nomenclature> getSubglossary();

} // Glossary

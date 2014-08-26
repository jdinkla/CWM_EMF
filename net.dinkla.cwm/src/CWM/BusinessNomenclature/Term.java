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
 * A representation of the model object '<em><b>Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.BusinessNomenclature.Term#getGlossary <em>Glossary</em>}</li>
 *   <li>{@link CWM.BusinessNomenclature.Term#getConcept <em>Concept</em>}</li>
 *   <li>{@link CWM.BusinessNomenclature.Term#getRelatedTerm <em>Related Term</em>}</li>
 *   <li>{@link CWM.BusinessNomenclature.Term#getPreferredTerm <em>Preferred Term</em>}</li>
 *   <li>{@link CWM.BusinessNomenclature.Term#getNarrowerTerm <em>Narrower Term</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.BusinessNomenclature.BusinessNomenclaturePackage#getTerm()
 * @model
 * @generated
 */
public interface Term extends VocabularyElement {
	/**
	 * Returns the value of the '<em><b>Glossary</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Glossary</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glossary</em>' reference.
	 * @see #setGlossary(Namespace)
	 * @see CWM.BusinessNomenclature.BusinessNomenclaturePackage#getTerm_Glossary()
	 * @model ordered="false"
	 * @generated
	 */
	Namespace getGlossary();

	/**
	 * Sets the value of the '{@link CWM.BusinessNomenclature.Term#getGlossary <em>Glossary</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Glossary</em>' reference.
	 * @see #getGlossary()
	 * @generated
	 */
	void setGlossary(Namespace value);

	/**
	 * Returns the value of the '<em><b>Concept</b></em>' reference list.
	 * The list contents are of type {@link CWM.BusinessNomenclature.Concept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concept</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concept</em>' reference list.
	 * @see CWM.BusinessNomenclature.BusinessNomenclaturePackage#getTerm_Concept()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Concept> getConcept();

	/**
	 * Returns the value of the '<em><b>Related Term</b></em>' reference list.
	 * The list contents are of type {@link CWM.BusinessNomenclature.Term}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Term</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Term</em>' reference list.
	 * @see CWM.BusinessNomenclature.BusinessNomenclaturePackage#getTerm_RelatedTerm()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Term> getRelatedTerm();

	/**
	 * Returns the value of the '<em><b>Preferred Term</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preferred Term</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preferred Term</em>' reference.
	 * @see #setPreferredTerm(Term)
	 * @see CWM.BusinessNomenclature.BusinessNomenclaturePackage#getTerm_PreferredTerm()
	 * @model ordered="false"
	 * @generated
	 */
	Term getPreferredTerm();

	/**
	 * Sets the value of the '{@link CWM.BusinessNomenclature.Term#getPreferredTerm <em>Preferred Term</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preferred Term</em>' reference.
	 * @see #getPreferredTerm()
	 * @generated
	 */
	void setPreferredTerm(Term value);

	/**
	 * Returns the value of the '<em><b>Narrower Term</b></em>' reference list.
	 * The list contents are of type {@link CWM.BusinessNomenclature.Term}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Narrower Term</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Narrower Term</em>' reference list.
	 * @see CWM.BusinessNomenclature.BusinessNomenclaturePackage#getTerm_NarrowerTerm()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Term> getNarrowerTerm();

} // Term

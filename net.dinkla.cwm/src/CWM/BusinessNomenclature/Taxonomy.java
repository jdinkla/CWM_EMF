/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.BusinessNomenclature;

import CWM.Core.ModelElement;
import CWM.Core.Namespace;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Taxonomy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.BusinessNomenclature.Taxonomy#getDomain <em>Domain</em>}</li>
 *   <li>{@link CWM.BusinessNomenclature.Taxonomy#getConcept <em>Concept</em>}</li>
 *   <li>{@link CWM.BusinessNomenclature.Taxonomy#getSubtaxonomy <em>Subtaxonomy</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.BusinessNomenclature.BusinessNomenclaturePackage#getTaxonomy()
 * @model
 * @generated
 */
public interface Taxonomy extends Nomenclature {
	/**
	 * Returns the value of the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' reference.
	 * @see #setDomain(Namespace)
	 * @see CWM.BusinessNomenclature.BusinessNomenclaturePackage#getTaxonomy_Domain()
	 * @model ordered="false"
	 * @generated
	 */
	Namespace getDomain();

	/**
	 * Sets the value of the '{@link CWM.BusinessNomenclature.Taxonomy#getDomain <em>Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(Namespace value);

	/**
	 * Returns the value of the '<em><b>Concept</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Core.ModelElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concept</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concept</em>' containment reference list.
	 * @see CWM.BusinessNomenclature.BusinessNomenclaturePackage#getTaxonomy_Concept()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ModelElement> getConcept();

	/**
	 * Returns the value of the '<em><b>Subtaxonomy</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.BusinessNomenclature.Nomenclature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subtaxonomy</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtaxonomy</em>' containment reference list.
	 * @see CWM.BusinessNomenclature.BusinessNomenclaturePackage#getTaxonomy_Subtaxonomy()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Nomenclature> getSubtaxonomy();

} // Taxonomy

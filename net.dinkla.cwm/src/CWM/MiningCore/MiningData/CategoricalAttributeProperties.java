/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningData;

import CWM.Core.ModelElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Categorical Attribute Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.MiningCore.MiningData.CategoricalAttributeProperties#getCategory <em>Category</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.CategoricalAttributeProperties#getTaxonomy <em>Taxonomy</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.MiningCore.MiningData.MiningDataPackage#getCategoricalAttributeProperties()
 * @model
 * @generated
 */
public interface CategoricalAttributeProperties extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.MiningCore.MiningData.Category}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' containment reference list.
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getCategoricalAttributeProperties_Category()
	 * @model containment="true"
	 * @generated
	 */
	EList<Category> getCategory();

	/**
	 * Returns the value of the '<em><b>Taxonomy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Taxonomy</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Taxonomy</em>' reference.
	 * @see #setTaxonomy(CategoryTaxonomy)
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getCategoricalAttributeProperties_Taxonomy()
	 * @model ordered="false"
	 * @generated
	 */
	CategoryTaxonomy getTaxonomy();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.MiningData.CategoricalAttributeProperties#getTaxonomy <em>Taxonomy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taxonomy</em>' reference.
	 * @see #getTaxonomy()
	 * @generated
	 */
	void setTaxonomy(CategoryTaxonomy value);

} // CategoricalAttributeProperties

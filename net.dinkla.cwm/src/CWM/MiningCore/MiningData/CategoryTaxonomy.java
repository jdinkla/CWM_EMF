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
 * A representation of the model object '<em><b>Category Taxonomy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.MiningCore.MiningData.CategoryTaxonomy#getCategoryMap <em>Category Map</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.CategoryTaxonomy#getRootCategory <em>Root Category</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.MiningCore.MiningData.MiningDataPackage#getCategoryTaxonomy()
 * @model
 * @generated
 */
public interface CategoryTaxonomy extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Category Map</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.MiningCore.MiningData.CategoryMap}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category Map</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category Map</em>' containment reference list.
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getCategoryTaxonomy_CategoryMap()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<CategoryMap> getCategoryMap();

	/**
	 * Returns the value of the '<em><b>Root Category</b></em>' reference list.
	 * The list contents are of type {@link CWM.MiningCore.MiningData.Category}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Category</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Category</em>' reference list.
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getCategoryTaxonomy_RootCategory()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Category> getRootCategory();

} // CategoryTaxonomy

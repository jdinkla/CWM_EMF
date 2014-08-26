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
 * A representation of the model object '<em><b>Category Map Object Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.MiningCore.MiningData.CategoryMapObjectEntry#getChild <em>Child</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.CategoryMapObjectEntry#getParent <em>Parent</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.CategoryMapObjectEntry#getGraphId <em>Graph Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.MiningCore.MiningData.MiningDataPackage#getCategoryMapObjectEntry()
 * @model
 * @generated
 */
public interface CategoryMapObjectEntry extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Child</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' reference.
	 * @see #setChild(Category)
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getCategoryMapObjectEntry_Child()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Category getChild();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.MiningData.CategoryMapObjectEntry#getChild <em>Child</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child</em>' reference.
	 * @see #getChild()
	 * @generated
	 */
	void setChild(Category value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference list.
	 * The list contents are of type {@link CWM.MiningCore.MiningData.Category}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference list.
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getCategoryMapObjectEntry_Parent()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Category> getParent();

	/**
	 * Returns the value of the '<em><b>Graph Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Graph Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph Id</em>' attribute.
	 * @see #setGraphId(Object)
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getCategoryMapObjectEntry_GraphId()
	 * @model unique="false" dataType="CWM.Core.Any" required="true" ordered="false"
	 * @generated
	 */
	Object getGraphId();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.MiningData.CategoryMapObjectEntry#getGraphId <em>Graph Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graph Id</em>' attribute.
	 * @see #getGraphId()
	 * @generated
	 */
	void setGraphId(Object value);

} // CategoryMapObjectEntry

/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningData;

import CWM.Core.Attribute;
import CWM.Core.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category Map Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.MiningCore.MiningData.CategoryMapTable#getChildAttribute <em>Child Attribute</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.CategoryMapTable#getParentAttribute <em>Parent Attribute</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.CategoryMapTable#getGraphIdAttribute <em>Graph Id Attribute</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.CategoryMapTable#getTable <em>Table</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.MiningCore.MiningData.MiningDataPackage#getCategoryMapTable()
 * @model
 * @generated
 */
public interface CategoryMapTable extends ModelElement, CategoryMap {
	/**
	 * Returns the value of the '<em><b>Child Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Attribute</em>' reference.
	 * @see #setChildAttribute(Attribute)
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getCategoryMapTable_ChildAttribute()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Attribute getChildAttribute();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.MiningData.CategoryMapTable#getChildAttribute <em>Child Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child Attribute</em>' reference.
	 * @see #getChildAttribute()
	 * @generated
	 */
	void setChildAttribute(Attribute value);

	/**
	 * Returns the value of the '<em><b>Parent Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Attribute</em>' reference.
	 * @see #setParentAttribute(Attribute)
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getCategoryMapTable_ParentAttribute()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Attribute getParentAttribute();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.MiningData.CategoryMapTable#getParentAttribute <em>Parent Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Attribute</em>' reference.
	 * @see #getParentAttribute()
	 * @generated
	 */
	void setParentAttribute(Attribute value);

	/**
	 * Returns the value of the '<em><b>Graph Id Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Graph Id Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph Id Attribute</em>' reference.
	 * @see #setGraphIdAttribute(Attribute)
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getCategoryMapTable_GraphIdAttribute()
	 * @model ordered="false"
	 * @generated
	 */
	Attribute getGraphIdAttribute();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.MiningData.CategoryMapTable#getGraphIdAttribute <em>Graph Id Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graph Id Attribute</em>' reference.
	 * @see #getGraphIdAttribute()
	 * @generated
	 */
	void setGraphIdAttribute(Attribute value);

	/**
	 * Returns the value of the '<em><b>Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' reference.
	 * @see #setTable(CWM.Core.Class)
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getCategoryMapTable_Table()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	CWM.Core.Class getTable();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.MiningData.CategoryMapTable#getTable <em>Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' reference.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(CWM.Core.Class value);

} // CategoryMapTable

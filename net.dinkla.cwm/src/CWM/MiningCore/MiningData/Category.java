/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningData;

import CWM.Core.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.MiningCore.MiningData.Category#getValue <em>Value</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.Category#getIsNullCategory <em>Is Null Category</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.Category#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.Category#getProperty <em>Property</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.Category#getPrior <em>Prior</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.MiningCore.MiningData.MiningDataPackage#getCategory()
 * @model
 * @generated
 */
public interface Category extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Object)
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getCategory_Value()
	 * @model unique="false" dataType="CWM.Core.Any" required="true" ordered="false"
	 * @generated
	 */
	Object getValue();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.MiningData.Category#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Object value);

	/**
	 * Returns the value of the '<em><b>Is Null Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Null Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Null Category</em>' attribute.
	 * @see #setIsNullCategory(Boolean)
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getCategory_IsNullCategory()
	 * @model unique="false" dataType="CWM.Core.Boolean" ordered="false"
	 * @generated
	 */
	Boolean getIsNullCategory();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.MiningData.Category#getIsNullCategory <em>Is Null Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Null Category</em>' attribute.
	 * @see #getIsNullCategory()
	 * @generated
	 */
	void setIsNullCategory(Boolean value);

	/**
	 * Returns the value of the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Name</em>' attribute.
	 * @see #setDisplayName(String)
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getCategory_DisplayName()
	 * @model unique="false" dataType="CWM.Core.String" ordered="false"
	 * @generated
	 */
	String getDisplayName();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.MiningData.Category#getDisplayName <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Name</em>' attribute.
	 * @see #getDisplayName()
	 * @generated
	 */
	void setDisplayName(String value);

	/**
	 * Returns the value of the '<em><b>Property</b></em>' attribute.
	 * The literals are from the enumeration {@link CWM.MiningCore.MiningData.CategoryProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' attribute.
	 * @see CWM.MiningCore.MiningData.CategoryProperty
	 * @see #setProperty(CategoryProperty)
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getCategory_Property()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	CategoryProperty getProperty();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.MiningData.Category#getProperty <em>Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' attribute.
	 * @see CWM.MiningCore.MiningData.CategoryProperty
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(CategoryProperty value);

	/**
	 * Returns the value of the '<em><b>Prior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prior</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prior</em>' attribute.
	 * @see #setPrior(Double)
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getCategory_Prior()
	 * @model unique="false" dataType="CWM.MiningCore.MiningData.Double" required="true" ordered="false"
	 * @generated
	 */
	Double getPrior();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.MiningData.Category#getPrior <em>Prior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prior</em>' attribute.
	 * @see #getPrior()
	 * @generated
	 */
	void setPrior(Double value);

} // Category

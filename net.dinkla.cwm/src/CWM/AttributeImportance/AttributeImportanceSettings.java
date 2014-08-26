/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.AttributeImportance;

import CWM.Supervised.SupervisedFunctionSettings;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.AttributeImportance.AttributeImportanceSettings#getMaximumResultSize <em>Maximum Result Size</em>}</li>
 *   <li>{@link CWM.AttributeImportance.AttributeImportanceSettings#getReturnTop <em>Return Top</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.AttributeImportance.AttributeImportancePackage#getAttributeImportanceSettings()
 * @model
 * @generated
 */
public interface AttributeImportanceSettings extends SupervisedFunctionSettings {
	/**
	 * Returns the value of the '<em><b>Maximum Result Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Result Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Result Size</em>' attribute.
	 * @see #setMaximumResultSize(Integer)
	 * @see CWM.AttributeImportance.AttributeImportancePackage#getAttributeImportanceSettings_MaximumResultSize()
	 * @model unique="false" dataType="CWM.Core.Integer" required="true" ordered="false"
	 * @generated
	 */
	Integer getMaximumResultSize();

	/**
	 * Sets the value of the '{@link CWM.AttributeImportance.AttributeImportanceSettings#getMaximumResultSize <em>Maximum Result Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Result Size</em>' attribute.
	 * @see #getMaximumResultSize()
	 * @generated
	 */
	void setMaximumResultSize(Integer value);

	/**
	 * Returns the value of the '<em><b>Return Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Top</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Top</em>' attribute.
	 * @see #setReturnTop(Boolean)
	 * @see CWM.AttributeImportance.AttributeImportancePackage#getAttributeImportanceSettings_ReturnTop()
	 * @model unique="false" dataType="CWM.Core.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getReturnTop();

	/**
	 * Sets the value of the '{@link CWM.AttributeImportance.AttributeImportanceSettings#getReturnTop <em>Return Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Top</em>' attribute.
	 * @see #getReturnTop()
	 * @generated
	 */
	void setReturnTop(Boolean value);

} // AttributeImportanceSettings

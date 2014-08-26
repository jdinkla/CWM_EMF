/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Classification;

import CWM.MiningCore.MiningData.Category;

import CWM.MiningCore.MiningTask.ApplyOutputItem;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Apply Target Value Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Classification.ApplyTargetValueItem#getTargetValue <em>Target Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Classification.ClassificationPackage#getApplyTargetValueItem()
 * @model
 * @generated
 */
public interface ApplyTargetValueItem extends ApplyOutputItem {
	/**
	 * Returns the value of the '<em><b>Target Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Value</em>' reference.
	 * @see #setTargetValue(Category)
	 * @see CWM.Classification.ClassificationPackage#getApplyTargetValueItem_TargetValue()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Category getTargetValue();

	/**
	 * Sets the value of the '{@link CWM.Classification.ApplyTargetValueItem#getTargetValue <em>Target Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Value</em>' reference.
	 * @see #getTargetValue()
	 * @generated
	 */
	void setTargetValue(Category value);

} // ApplyTargetValueItem

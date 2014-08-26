/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Classification;

import CWM.Core.ModelElement;

import CWM.MiningCore.MiningData.Category;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prior Probabilities Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Classification.PriorProbabilitiesEntry#getTargetValue <em>Target Value</em>}</li>
 *   <li>{@link CWM.Classification.PriorProbabilitiesEntry#getPriorProbability <em>Prior Probability</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Classification.ClassificationPackage#getPriorProbabilitiesEntry()
 * @model
 * @generated
 */
public interface PriorProbabilitiesEntry extends ModelElement {
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
	 * @see CWM.Classification.ClassificationPackage#getPriorProbabilitiesEntry_TargetValue()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Category getTargetValue();

	/**
	 * Sets the value of the '{@link CWM.Classification.PriorProbabilitiesEntry#getTargetValue <em>Target Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Value</em>' reference.
	 * @see #getTargetValue()
	 * @generated
	 */
	void setTargetValue(Category value);

	/**
	 * Returns the value of the '<em><b>Prior Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prior Probability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prior Probability</em>' attribute.
	 * @see #setPriorProbability(Double)
	 * @see CWM.Classification.ClassificationPackage#getPriorProbabilitiesEntry_PriorProbability()
	 * @model unique="false" dataType="CWM.MiningCore.MiningData.Double" required="true" ordered="false"
	 * @generated
	 */
	Double getPriorProbability();

	/**
	 * Sets the value of the '{@link CWM.Classification.PriorProbabilitiesEntry#getPriorProbability <em>Prior Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prior Probability</em>' attribute.
	 * @see #getPriorProbability()
	 * @generated
	 */
	void setPriorProbability(Double value);

} // PriorProbabilitiesEntry

/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Classification;

import CWM.MiningCore.MiningData.AttributeUsage;
import CWM.MiningCore.MiningData.Category;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Classification.ClassificationAttributeUsage#getPositiveCategory <em>Positive Category</em>}</li>
 *   <li>{@link CWM.Classification.ClassificationAttributeUsage#getPriors <em>Priors</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Classification.ClassificationPackage#getClassificationAttributeUsage()
 * @model
 * @generated
 */
public interface ClassificationAttributeUsage extends AttributeUsage {
	/**
	 * Returns the value of the '<em><b>Positive Category</b></em>' reference list.
	 * The list contents are of type {@link CWM.MiningCore.MiningData.Category}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Positive Category</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Positive Category</em>' reference list.
	 * @see CWM.Classification.ClassificationPackage#getClassificationAttributeUsage_PositiveCategory()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Category> getPositiveCategory();

	/**
	 * Returns the value of the '<em><b>Priors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priors</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priors</em>' containment reference.
	 * @see #setPriors(PriorProbabilities)
	 * @see CWM.Classification.ClassificationPackage#getClassificationAttributeUsage_Priors()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	PriorProbabilities getPriors();

	/**
	 * Sets the value of the '{@link CWM.Classification.ClassificationAttributeUsage#getPriors <em>Priors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priors</em>' containment reference.
	 * @see #getPriors()
	 * @generated
	 */
	void setPriors(PriorProbabilities value);

} // ClassificationAttributeUsage

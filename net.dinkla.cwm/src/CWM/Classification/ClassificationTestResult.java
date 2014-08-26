/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Classification;

import CWM.MiningCore.MiningData.CategoryMatrix;

import CWM.Supervised.MiningTestResult;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Classification.ClassificationTestResult#getConfusionMatrix <em>Confusion Matrix</em>}</li>
 *   <li>{@link CWM.Classification.ClassificationTestResult#getAccuracy <em>Accuracy</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Classification.ClassificationPackage#getClassificationTestResult()
 * @model
 * @generated
 */
public interface ClassificationTestResult extends MiningTestResult {
	/**
	 * Returns the value of the '<em><b>Confusion Matrix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Confusion Matrix</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confusion Matrix</em>' containment reference.
	 * @see #setConfusionMatrix(CategoryMatrix)
	 * @see CWM.Classification.ClassificationPackage#getClassificationTestResult_ConfusionMatrix()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	CategoryMatrix getConfusionMatrix();

	/**
	 * Sets the value of the '{@link CWM.Classification.ClassificationTestResult#getConfusionMatrix <em>Confusion Matrix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confusion Matrix</em>' containment reference.
	 * @see #getConfusionMatrix()
	 * @generated
	 */
	void setConfusionMatrix(CategoryMatrix value);

	/**
	 * Returns the value of the '<em><b>Accuracy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accuracy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accuracy</em>' attribute.
	 * @see #setAccuracy(Double)
	 * @see CWM.Classification.ClassificationPackage#getClassificationTestResult_Accuracy()
	 * @model unique="false" dataType="CWM.MiningCore.MiningData.Double" required="true" ordered="false"
	 * @generated
	 */
	Double getAccuracy();

	/**
	 * Sets the value of the '{@link CWM.Classification.ClassificationTestResult#getAccuracy <em>Accuracy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accuracy</em>' attribute.
	 * @see #getAccuracy()
	 * @generated
	 */
	void setAccuracy(Double value);

} // ClassificationTestResult

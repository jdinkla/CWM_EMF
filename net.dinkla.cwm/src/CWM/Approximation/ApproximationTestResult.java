/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Approximation;

import CWM.Supervised.MiningTestResult;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Approximation.ApproximationTestResult#getMeanPredictedValue <em>Mean Predicted Value</em>}</li>
 *   <li>{@link CWM.Approximation.ApproximationTestResult#getMeanActualValue <em>Mean Actual Value</em>}</li>
 *   <li>{@link CWM.Approximation.ApproximationTestResult#getMeanAbsoluteError <em>Mean Absolute Error</em>}</li>
 *   <li>{@link CWM.Approximation.ApproximationTestResult#getRmsError <em>Rms Error</em>}</li>
 *   <li>{@link CWM.Approximation.ApproximationTestResult#getRSquared <em>RSquared</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Approximation.ApproximationPackage#getApproximationTestResult()
 * @model
 * @generated
 */
public interface ApproximationTestResult extends MiningTestResult {
	/**
	 * Returns the value of the '<em><b>Mean Predicted Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mean Predicted Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mean Predicted Value</em>' attribute.
	 * @see #setMeanPredictedValue(Double)
	 * @see CWM.Approximation.ApproximationPackage#getApproximationTestResult_MeanPredictedValue()
	 * @model unique="false" dataType="CWM.MiningCore.MiningData.Double" required="true" ordered="false"
	 * @generated
	 */
	Double getMeanPredictedValue();

	/**
	 * Sets the value of the '{@link CWM.Approximation.ApproximationTestResult#getMeanPredictedValue <em>Mean Predicted Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mean Predicted Value</em>' attribute.
	 * @see #getMeanPredictedValue()
	 * @generated
	 */
	void setMeanPredictedValue(Double value);

	/**
	 * Returns the value of the '<em><b>Mean Actual Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mean Actual Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mean Actual Value</em>' attribute.
	 * @see #setMeanActualValue(Double)
	 * @see CWM.Approximation.ApproximationPackage#getApproximationTestResult_MeanActualValue()
	 * @model unique="false" dataType="CWM.MiningCore.MiningData.Double" required="true" ordered="false"
	 * @generated
	 */
	Double getMeanActualValue();

	/**
	 * Sets the value of the '{@link CWM.Approximation.ApproximationTestResult#getMeanActualValue <em>Mean Actual Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mean Actual Value</em>' attribute.
	 * @see #getMeanActualValue()
	 * @generated
	 */
	void setMeanActualValue(Double value);

	/**
	 * Returns the value of the '<em><b>Mean Absolute Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mean Absolute Error</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mean Absolute Error</em>' attribute.
	 * @see #setMeanAbsoluteError(Double)
	 * @see CWM.Approximation.ApproximationPackage#getApproximationTestResult_MeanAbsoluteError()
	 * @model unique="false" dataType="CWM.MiningCore.MiningData.Double" required="true" ordered="false"
	 * @generated
	 */
	Double getMeanAbsoluteError();

	/**
	 * Sets the value of the '{@link CWM.Approximation.ApproximationTestResult#getMeanAbsoluteError <em>Mean Absolute Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mean Absolute Error</em>' attribute.
	 * @see #getMeanAbsoluteError()
	 * @generated
	 */
	void setMeanAbsoluteError(Double value);

	/**
	 * Returns the value of the '<em><b>Rms Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rms Error</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rms Error</em>' attribute.
	 * @see #setRmsError(Double)
	 * @see CWM.Approximation.ApproximationPackage#getApproximationTestResult_RmsError()
	 * @model unique="false" dataType="CWM.MiningCore.MiningData.Double" required="true" ordered="false"
	 * @generated
	 */
	Double getRmsError();

	/**
	 * Sets the value of the '{@link CWM.Approximation.ApproximationTestResult#getRmsError <em>Rms Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rms Error</em>' attribute.
	 * @see #getRmsError()
	 * @generated
	 */
	void setRmsError(Double value);

	/**
	 * Returns the value of the '<em><b>RSquared</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RSquared</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RSquared</em>' attribute.
	 * @see #setRSquared(Double)
	 * @see CWM.Approximation.ApproximationPackage#getApproximationTestResult_RSquared()
	 * @model unique="false" dataType="CWM.MiningCore.MiningData.Double" required="true" ordered="false"
	 * @generated
	 */
	Double getRSquared();

	/**
	 * Sets the value of the '{@link CWM.Approximation.ApproximationTestResult#getRSquared <em>RSquared</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RSquared</em>' attribute.
	 * @see #getRSquared()
	 * @generated
	 */
	void setRSquared(Double value);

} // ApproximationTestResult

/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Approximation;

import CWM.Supervised.MiningTestTask;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Approximation.ApproximationTestTask#getTestResult <em>Test Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Approximation.ApproximationPackage#getApproximationTestTask()
 * @model
 * @generated
 */
public interface ApproximationTestTask extends MiningTestTask {
	/**
	 * Returns the value of the '<em><b>Test Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Result</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Result</em>' containment reference.
	 * @see #setTestResult(ApproximationTestResult)
	 * @see CWM.Approximation.ApproximationPackage#getApproximationTestTask_TestResult()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ApproximationTestResult getTestResult();

	/**
	 * Sets the value of the '{@link CWM.Approximation.ApproximationTestTask#getTestResult <em>Test Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Result</em>' containment reference.
	 * @see #getTestResult()
	 * @generated
	 */
	void setTestResult(ApproximationTestResult value);

} // ApproximationTestTask

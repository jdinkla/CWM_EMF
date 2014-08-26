/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Classification;

import CWM.Supervised.MiningTestTask;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Classification.ClassificationTestTask#getTestResult <em>Test Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Classification.ClassificationPackage#getClassificationTestTask()
 * @model
 * @generated
 */
public interface ClassificationTestTask extends MiningTestTask {
	/**
	 * Returns the value of the '<em><b>Test Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Result</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Result</em>' containment reference.
	 * @see #setTestResult(ClassificationTestResult)
	 * @see CWM.Classification.ClassificationPackage#getClassificationTestTask_TestResult()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ClassificationTestResult getTestResult();

	/**
	 * Sets the value of the '{@link CWM.Classification.ClassificationTestTask#getTestResult <em>Test Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Result</em>' containment reference.
	 * @see #getTestResult()
	 * @generated
	 */
	void setTestResult(ClassificationTestResult value);

} // ClassificationTestTask

/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningTask;

import CWM.MiningCore.MiningData.AttributeAssignmentSet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mining Apply Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.MiningCore.MiningTask.MiningApplyTask#getApplyOutput <em>Apply Output</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningTask.MiningApplyTask#getOutputAssignment <em>Output Assignment</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningTask.MiningApplyTask#getOutputOption <em>Output Option</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.MiningCore.MiningTask.MiningTaskPackage#getMiningApplyTask()
 * @model
 * @generated
 */
public interface MiningApplyTask extends MiningTask {
	/**
	 * Returns the value of the '<em><b>Apply Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Apply Output</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apply Output</em>' reference.
	 * @see #setApplyOutput(MiningApplyOutput)
	 * @see CWM.MiningCore.MiningTask.MiningTaskPackage#getMiningApplyTask_ApplyOutput()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	MiningApplyOutput getApplyOutput();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.MiningTask.MiningApplyTask#getApplyOutput <em>Apply Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Apply Output</em>' reference.
	 * @see #getApplyOutput()
	 * @generated
	 */
	void setApplyOutput(MiningApplyOutput value);

	/**
	 * Returns the value of the '<em><b>Output Assignment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Assignment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Assignment</em>' reference.
	 * @see #setOutputAssignment(AttributeAssignmentSet)
	 * @see CWM.MiningCore.MiningTask.MiningTaskPackage#getMiningApplyTask_OutputAssignment()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AttributeAssignmentSet getOutputAssignment();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.MiningTask.MiningApplyTask#getOutputAssignment <em>Output Assignment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Assignment</em>' reference.
	 * @see #getOutputAssignment()
	 * @generated
	 */
	void setOutputAssignment(AttributeAssignmentSet value);

	/**
	 * Returns the value of the '<em><b>Output Option</b></em>' attribute.
	 * The literals are from the enumeration {@link CWM.MiningCore.MiningTask.ApplyOutputOption}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Option</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Option</em>' attribute.
	 * @see CWM.MiningCore.MiningTask.ApplyOutputOption
	 * @see #setOutputOption(ApplyOutputOption)
	 * @see CWM.MiningCore.MiningTask.MiningTaskPackage#getMiningApplyTask_OutputOption()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	ApplyOutputOption getOutputOption();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.MiningTask.MiningApplyTask#getOutputOption <em>Output Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Option</em>' attribute.
	 * @see CWM.MiningCore.MiningTask.ApplyOutputOption
	 * @see #getOutputOption()
	 * @generated
	 */
	void setOutputOption(ApplyOutputOption value);

} // MiningApplyTask

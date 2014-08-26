/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningTask;

import CWM.MiningCore.MiningData.AttributeAssignmentSet;
import CWM.MiningCore.MiningData.PhysicalData;

import CWM.MiningCore.MiningFunctionSettings.MiningFunctionSettings;

import CWM.MiningCore.MiningModel.MiningModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mining Build Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.MiningCore.MiningTask.MiningBuildTask#getMiningSettings <em>Mining Settings</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningTask.MiningBuildTask#getSettingsAssignment <em>Settings Assignment</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningTask.MiningBuildTask#getValidationData <em>Validation Data</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningTask.MiningBuildTask#getValidationAssignment <em>Validation Assignment</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningTask.MiningBuildTask#getResultModel <em>Result Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.MiningCore.MiningTask.MiningTaskPackage#getMiningBuildTask()
 * @model
 * @generated
 */
public interface MiningBuildTask extends MiningTask {
	/**
	 * Returns the value of the '<em><b>Mining Settings</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mining Settings</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mining Settings</em>' reference.
	 * @see #setMiningSettings(MiningFunctionSettings)
	 * @see CWM.MiningCore.MiningTask.MiningTaskPackage#getMiningBuildTask_MiningSettings()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	MiningFunctionSettings getMiningSettings();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.MiningTask.MiningBuildTask#getMiningSettings <em>Mining Settings</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mining Settings</em>' reference.
	 * @see #getMiningSettings()
	 * @generated
	 */
	void setMiningSettings(MiningFunctionSettings value);

	/**
	 * Returns the value of the '<em><b>Settings Assignment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Settings Assignment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Settings Assignment</em>' reference.
	 * @see #setSettingsAssignment(AttributeAssignmentSet)
	 * @see CWM.MiningCore.MiningTask.MiningTaskPackage#getMiningBuildTask_SettingsAssignment()
	 * @model ordered="false"
	 * @generated
	 */
	AttributeAssignmentSet getSettingsAssignment();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.MiningTask.MiningBuildTask#getSettingsAssignment <em>Settings Assignment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Settings Assignment</em>' reference.
	 * @see #getSettingsAssignment()
	 * @generated
	 */
	void setSettingsAssignment(AttributeAssignmentSet value);

	/**
	 * Returns the value of the '<em><b>Validation Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validation Data</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validation Data</em>' reference.
	 * @see #setValidationData(PhysicalData)
	 * @see CWM.MiningCore.MiningTask.MiningTaskPackage#getMiningBuildTask_ValidationData()
	 * @model ordered="false"
	 * @generated
	 */
	PhysicalData getValidationData();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.MiningTask.MiningBuildTask#getValidationData <em>Validation Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validation Data</em>' reference.
	 * @see #getValidationData()
	 * @generated
	 */
	void setValidationData(PhysicalData value);

	/**
	 * Returns the value of the '<em><b>Validation Assignment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validation Assignment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validation Assignment</em>' reference.
	 * @see #setValidationAssignment(AttributeAssignmentSet)
	 * @see CWM.MiningCore.MiningTask.MiningTaskPackage#getMiningBuildTask_ValidationAssignment()
	 * @model ordered="false"
	 * @generated
	 */
	AttributeAssignmentSet getValidationAssignment();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.MiningTask.MiningBuildTask#getValidationAssignment <em>Validation Assignment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validation Assignment</em>' reference.
	 * @see #getValidationAssignment()
	 * @generated
	 */
	void setValidationAssignment(AttributeAssignmentSet value);

	/**
	 * Returns the value of the '<em><b>Result Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Model</em>' reference.
	 * @see #setResultModel(MiningModel)
	 * @see CWM.MiningCore.MiningTask.MiningTaskPackage#getMiningBuildTask_ResultModel()
	 * @model ordered="false"
	 * @generated
	 */
	MiningModel getResultModel();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.MiningTask.MiningBuildTask#getResultModel <em>Result Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Model</em>' reference.
	 * @see #getResultModel()
	 * @generated
	 */
	void setResultModel(MiningModel value);

} // MiningBuildTask

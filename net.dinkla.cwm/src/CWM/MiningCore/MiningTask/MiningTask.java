/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningTask;

import CWM.Core.ModelElement;

import CWM.MiningCore.MiningData.AttributeAssignmentSet;
import CWM.MiningCore.MiningData.PhysicalData;

import CWM.MiningCore.MiningModel.MiningModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mining Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.MiningCore.MiningTask.MiningTask#getInputData <em>Input Data</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningTask.MiningTask#getModelAssignment <em>Model Assignment</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningTask.MiningTask#getInputModel <em>Input Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.MiningCore.MiningTask.MiningTaskPackage#getMiningTask()
 * @model abstract="true"
 * @generated
 */
public interface MiningTask extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Input Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Data</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Data</em>' reference.
	 * @see #setInputData(PhysicalData)
	 * @see CWM.MiningCore.MiningTask.MiningTaskPackage#getMiningTask_InputData()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	PhysicalData getInputData();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.MiningTask.MiningTask#getInputData <em>Input Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Data</em>' reference.
	 * @see #getInputData()
	 * @generated
	 */
	void setInputData(PhysicalData value);

	/**
	 * Returns the value of the '<em><b>Model Assignment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Assignment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Assignment</em>' reference.
	 * @see #setModelAssignment(AttributeAssignmentSet)
	 * @see CWM.MiningCore.MiningTask.MiningTaskPackage#getMiningTask_ModelAssignment()
	 * @model ordered="false"
	 * @generated
	 */
	AttributeAssignmentSet getModelAssignment();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.MiningTask.MiningTask#getModelAssignment <em>Model Assignment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Assignment</em>' reference.
	 * @see #getModelAssignment()
	 * @generated
	 */
	void setModelAssignment(AttributeAssignmentSet value);

	/**
	 * Returns the value of the '<em><b>Input Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Model</em>' reference.
	 * @see #setInputModel(MiningModel)
	 * @see CWM.MiningCore.MiningTask.MiningTaskPackage#getMiningTask_InputModel()
	 * @model ordered="false"
	 * @generated
	 */
	MiningModel getInputModel();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.MiningTask.MiningTask#getInputModel <em>Input Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Model</em>' reference.
	 * @see #getInputModel()
	 * @generated
	 */
	void setInputModel(MiningModel value);

} // MiningTask

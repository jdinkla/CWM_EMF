/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.WarehouseOperation;

import CWM.Behavioral.CallAction;

import CWM.CwmTransformation.TransformationStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step Execution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.WarehouseOperation.StepExecution#getTransformationStep <em>Transformation Step</em>}</li>
 *   <li>{@link CWM.WarehouseOperation.StepExecution#getActivityExecution <em>Activity Execution</em>}</li>
 *   <li>{@link CWM.WarehouseOperation.StepExecution#getCallAction <em>Call Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.WarehouseOperation.WarehouseOperationPackage#getStepExecution()
 * @model
 * @generated
 */
public interface StepExecution extends TransformationExecution {
	/**
	 * Returns the value of the '<em><b>Transformation Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformation Step</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation Step</em>' reference.
	 * @see #setTransformationStep(TransformationStep)
	 * @see CWM.WarehouseOperation.WarehouseOperationPackage#getStepExecution_TransformationStep()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	TransformationStep getTransformationStep();

	/**
	 * Sets the value of the '{@link CWM.WarehouseOperation.StepExecution#getTransformationStep <em>Transformation Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation Step</em>' reference.
	 * @see #getTransformationStep()
	 * @generated
	 */
	void setTransformationStep(TransformationStep value);

	/**
	 * Returns the value of the '<em><b>Activity Execution</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link CWM.WarehouseOperation.ActivityExecution#getStepExecution <em>Step Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Execution</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Execution</em>' container reference.
	 * @see #setActivityExecution(ActivityExecution)
	 * @see CWM.WarehouseOperation.WarehouseOperationPackage#getStepExecution_ActivityExecution()
	 * @see CWM.WarehouseOperation.ActivityExecution#getStepExecution
	 * @model opposite="stepExecution" transient="false" ordered="false"
	 * @generated
	 */
	ActivityExecution getActivityExecution();

	/**
	 * Sets the value of the '{@link CWM.WarehouseOperation.StepExecution#getActivityExecution <em>Activity Execution</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity Execution</em>' container reference.
	 * @see #getActivityExecution()
	 * @generated
	 */
	void setActivityExecution(ActivityExecution value);

	/**
	 * Returns the value of the '<em><b>Call Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Call Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call Action</em>' reference.
	 * @see #setCallAction(CallAction)
	 * @see CWM.WarehouseOperation.WarehouseOperationPackage#getStepExecution_CallAction()
	 * @model ordered="false"
	 * @generated
	 */
	CallAction getCallAction();

	/**
	 * Sets the value of the '{@link CWM.WarehouseOperation.StepExecution#getCallAction <em>Call Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Call Action</em>' reference.
	 * @see #getCallAction()
	 * @generated
	 */
	void setCallAction(CallAction value);

} // StepExecution

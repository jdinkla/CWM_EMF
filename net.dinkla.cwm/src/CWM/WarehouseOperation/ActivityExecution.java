/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.WarehouseOperation;

import CWM.CwmTransformation.TransformationActivity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Execution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.WarehouseOperation.ActivityExecution#getTransformationActivity <em>Transformation Activity</em>}</li>
 *   <li>{@link CWM.WarehouseOperation.ActivityExecution#getStepExecution <em>Step Execution</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.WarehouseOperation.WarehouseOperationPackage#getActivityExecution()
 * @model
 * @generated
 */
public interface ActivityExecution extends TransformationExecution {
	/**
	 * Returns the value of the '<em><b>Transformation Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformation Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation Activity</em>' reference.
	 * @see #setTransformationActivity(TransformationActivity)
	 * @see CWM.WarehouseOperation.WarehouseOperationPackage#getActivityExecution_TransformationActivity()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	TransformationActivity getTransformationActivity();

	/**
	 * Sets the value of the '{@link CWM.WarehouseOperation.ActivityExecution#getTransformationActivity <em>Transformation Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation Activity</em>' reference.
	 * @see #getTransformationActivity()
	 * @generated
	 */
	void setTransformationActivity(TransformationActivity value);

	/**
	 * Returns the value of the '<em><b>Step Execution</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.WarehouseOperation.StepExecution}.
	 * It is bidirectional and its opposite is '{@link CWM.WarehouseOperation.StepExecution#getActivityExecution <em>Activity Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step Execution</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step Execution</em>' containment reference list.
	 * @see CWM.WarehouseOperation.WarehouseOperationPackage#getActivityExecution_StepExecution()
	 * @see CWM.WarehouseOperation.StepExecution#getActivityExecution
	 * @model opposite="activityExecution" containment="true" ordered="false"
	 * @generated
	 */
	EList<StepExecution> getStepExecution();

} // ActivityExecution

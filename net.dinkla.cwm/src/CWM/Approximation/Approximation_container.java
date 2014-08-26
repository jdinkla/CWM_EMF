/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Approximation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Approximation container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Approximation.Approximation_container#getApproximationFunctionSettings <em>Approximation Function Settings</em>}</li>
 *   <li>{@link CWM.Approximation.Approximation_container#getApproximationTestResult <em>Approximation Test Result</em>}</li>
 *   <li>{@link CWM.Approximation.Approximation_container#getApproximationTestTask <em>Approximation Test Task</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Approximation.ApproximationPackage#getApproximation_container()
 * @model
 * @generated
 */
public interface Approximation_container extends EObject {
	/**
	 * Returns the value of the '<em><b>Approximation Function Settings</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Approximation.ApproximationFunctionSettings}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Approximation Function Settings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Approximation Function Settings</em>' containment reference list.
	 * @see CWM.Approximation.ApproximationPackage#getApproximation_container_ApproximationFunctionSettings()
	 * @model containment="true"
	 * @generated
	 */
	EList<ApproximationFunctionSettings> getApproximationFunctionSettings();

	/**
	 * Returns the value of the '<em><b>Approximation Test Result</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Approximation.ApproximationTestResult}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Approximation Test Result</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Approximation Test Result</em>' containment reference list.
	 * @see CWM.Approximation.ApproximationPackage#getApproximation_container_ApproximationTestResult()
	 * @model containment="true"
	 * @generated
	 */
	EList<ApproximationTestResult> getApproximationTestResult();

	/**
	 * Returns the value of the '<em><b>Approximation Test Task</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Approximation.ApproximationTestTask}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Approximation Test Task</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Approximation Test Task</em>' containment reference list.
	 * @see CWM.Approximation.ApproximationPackage#getApproximation_container_ApproximationTestTask()
	 * @model containment="true"
	 * @generated
	 */
	EList<ApproximationTestTask> getApproximationTestTask();

} // Approximation_container

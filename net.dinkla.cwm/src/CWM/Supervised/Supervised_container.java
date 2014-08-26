/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Supervised;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supervised container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Supervised.Supervised_container#getLiftAnalysisPoint <em>Lift Analysis Point</em>}</li>
 *   <li>{@link CWM.Supervised.Supervised_container#getLiftAnalysis <em>Lift Analysis</em>}</li>
 *   <li>{@link CWM.Supervised.Supervised_container#getMiningTestTask <em>Mining Test Task</em>}</li>
 *   <li>{@link CWM.Supervised.Supervised_container#getSupervisedFunctionSettings <em>Supervised Function Settings</em>}</li>
 *   <li>{@link CWM.Supervised.Supervised_container#getMiningTestResult <em>Mining Test Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Supervised.SupervisedPackage#getSupervised_container()
 * @model
 * @generated
 */
public interface Supervised_container extends EObject {
	/**
	 * Returns the value of the '<em><b>Lift Analysis Point</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Supervised.LiftAnalysisPoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lift Analysis Point</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lift Analysis Point</em>' containment reference list.
	 * @see CWM.Supervised.SupervisedPackage#getSupervised_container_LiftAnalysisPoint()
	 * @model containment="true"
	 * @generated
	 */
	EList<LiftAnalysisPoint> getLiftAnalysisPoint();

	/**
	 * Returns the value of the '<em><b>Lift Analysis</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Supervised.LiftAnalysis}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lift Analysis</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lift Analysis</em>' containment reference list.
	 * @see CWM.Supervised.SupervisedPackage#getSupervised_container_LiftAnalysis()
	 * @model containment="true"
	 * @generated
	 */
	EList<LiftAnalysis> getLiftAnalysis();

	/**
	 * Returns the value of the '<em><b>Mining Test Task</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Supervised.MiningTestTask}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mining Test Task</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mining Test Task</em>' containment reference list.
	 * @see CWM.Supervised.SupervisedPackage#getSupervised_container_MiningTestTask()
	 * @model containment="true"
	 * @generated
	 */
	EList<MiningTestTask> getMiningTestTask();

	/**
	 * Returns the value of the '<em><b>Supervised Function Settings</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Supervised.SupervisedFunctionSettings}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supervised Function Settings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supervised Function Settings</em>' containment reference list.
	 * @see CWM.Supervised.SupervisedPackage#getSupervised_container_SupervisedFunctionSettings()
	 * @model containment="true"
	 * @generated
	 */
	EList<SupervisedFunctionSettings> getSupervisedFunctionSettings();

	/**
	 * Returns the value of the '<em><b>Mining Test Result</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Supervised.MiningTestResult}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mining Test Result</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mining Test Result</em>' containment reference list.
	 * @see CWM.Supervised.SupervisedPackage#getSupervised_container_MiningTestResult()
	 * @model containment="true"
	 * @generated
	 */
	EList<MiningTestResult> getMiningTestResult();

} // Supervised_container

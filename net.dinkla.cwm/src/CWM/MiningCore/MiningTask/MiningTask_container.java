/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningTask;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mining Task container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.MiningCore.MiningTask.MiningTask_container#getApplyContentItem <em>Apply Content Item</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningTask.MiningTask_container#getApplyOutputItem <em>Apply Output Item</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningTask.MiningTask_container#getApplyProbabilityItem <em>Apply Probability Item</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningTask.MiningTask_container#getApplyRuleIdItem <em>Apply Rule Id Item</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningTask.MiningTask_container#getApplyScoreItem <em>Apply Score Item</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningTask.MiningTask_container#getApplySourceItem <em>Apply Source Item</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningTask.MiningTask_container#getMiningApplyOutput <em>Mining Apply Output</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningTask.MiningTask_container#getMiningApplyTask <em>Mining Apply Task</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningTask.MiningTask_container#getMiningBuildTask <em>Mining Build Task</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningTask.MiningTask_container#getMiningTask <em>Mining Task</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningTask.MiningTask_container#getMiningTransformation <em>Mining Transformation</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.MiningCore.MiningTask.MiningTaskPackage#getMiningTask_container()
 * @model
 * @generated
 */
public interface MiningTask_container extends EObject {
	/**
	 * Returns the value of the '<em><b>Apply Content Item</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.MiningCore.MiningTask.ApplyContentItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Apply Content Item</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apply Content Item</em>' containment reference list.
	 * @see CWM.MiningCore.MiningTask.MiningTaskPackage#getMiningTask_container_ApplyContentItem()
	 * @model containment="true"
	 * @generated
	 */
	EList<ApplyContentItem> getApplyContentItem();

	/**
	 * Returns the value of the '<em><b>Apply Output Item</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.MiningCore.MiningTask.ApplyOutputItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Apply Output Item</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apply Output Item</em>' containment reference list.
	 * @see CWM.MiningCore.MiningTask.MiningTaskPackage#getMiningTask_container_ApplyOutputItem()
	 * @model containment="true"
	 * @generated
	 */
	EList<ApplyOutputItem> getApplyOutputItem();

	/**
	 * Returns the value of the '<em><b>Apply Probability Item</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.MiningCore.MiningTask.ApplyProbabilityItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Apply Probability Item</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apply Probability Item</em>' containment reference list.
	 * @see CWM.MiningCore.MiningTask.MiningTaskPackage#getMiningTask_container_ApplyProbabilityItem()
	 * @model containment="true"
	 * @generated
	 */
	EList<ApplyProbabilityItem> getApplyProbabilityItem();

	/**
	 * Returns the value of the '<em><b>Apply Rule Id Item</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.MiningCore.MiningTask.ApplyRuleIdItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Apply Rule Id Item</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apply Rule Id Item</em>' containment reference list.
	 * @see CWM.MiningCore.MiningTask.MiningTaskPackage#getMiningTask_container_ApplyRuleIdItem()
	 * @model containment="true"
	 * @generated
	 */
	EList<ApplyRuleIdItem> getApplyRuleIdItem();

	/**
	 * Returns the value of the '<em><b>Apply Score Item</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.MiningCore.MiningTask.ApplyScoreItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Apply Score Item</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apply Score Item</em>' containment reference list.
	 * @see CWM.MiningCore.MiningTask.MiningTaskPackage#getMiningTask_container_ApplyScoreItem()
	 * @model containment="true"
	 * @generated
	 */
	EList<ApplyScoreItem> getApplyScoreItem();

	/**
	 * Returns the value of the '<em><b>Apply Source Item</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.MiningCore.MiningTask.ApplySourceItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Apply Source Item</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apply Source Item</em>' containment reference list.
	 * @see CWM.MiningCore.MiningTask.MiningTaskPackage#getMiningTask_container_ApplySourceItem()
	 * @model containment="true"
	 * @generated
	 */
	EList<ApplySourceItem> getApplySourceItem();

	/**
	 * Returns the value of the '<em><b>Mining Apply Output</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.MiningCore.MiningTask.MiningApplyOutput}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mining Apply Output</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mining Apply Output</em>' containment reference list.
	 * @see CWM.MiningCore.MiningTask.MiningTaskPackage#getMiningTask_container_MiningApplyOutput()
	 * @model containment="true"
	 * @generated
	 */
	EList<MiningApplyOutput> getMiningApplyOutput();

	/**
	 * Returns the value of the '<em><b>Mining Apply Task</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.MiningCore.MiningTask.MiningApplyTask}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mining Apply Task</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mining Apply Task</em>' containment reference list.
	 * @see CWM.MiningCore.MiningTask.MiningTaskPackage#getMiningTask_container_MiningApplyTask()
	 * @model containment="true"
	 * @generated
	 */
	EList<MiningApplyTask> getMiningApplyTask();

	/**
	 * Returns the value of the '<em><b>Mining Build Task</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.MiningCore.MiningTask.MiningBuildTask}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mining Build Task</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mining Build Task</em>' containment reference list.
	 * @see CWM.MiningCore.MiningTask.MiningTaskPackage#getMiningTask_container_MiningBuildTask()
	 * @model containment="true"
	 * @generated
	 */
	EList<MiningBuildTask> getMiningBuildTask();

	/**
	 * Returns the value of the '<em><b>Mining Task</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.MiningCore.MiningTask.MiningTask}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mining Task</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mining Task</em>' containment reference list.
	 * @see CWM.MiningCore.MiningTask.MiningTaskPackage#getMiningTask_container_MiningTask()
	 * @model containment="true"
	 * @generated
	 */
	EList<MiningTask> getMiningTask();

	/**
	 * Returns the value of the '<em><b>Mining Transformation</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.MiningCore.MiningTask.MiningTransformation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mining Transformation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mining Transformation</em>' containment reference list.
	 * @see CWM.MiningCore.MiningTask.MiningTaskPackage#getMiningTask_container_MiningTransformation()
	 * @model containment="true"
	 * @generated
	 */
	EList<MiningTransformation> getMiningTransformation();

} // MiningTask_container

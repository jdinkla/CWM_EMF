/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Classification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classification container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Classification.Classification_container#getApplyTargetValueItem <em>Apply Target Value Item</em>}</li>
 *   <li>{@link CWM.Classification.Classification_container#getClassificationAttributeUsage <em>Classification Attribute Usage</em>}</li>
 *   <li>{@link CWM.Classification.Classification_container#getClassificationFunctionSettings <em>Classification Function Settings</em>}</li>
 *   <li>{@link CWM.Classification.Classification_container#getClassificationTestResult <em>Classification Test Result</em>}</li>
 *   <li>{@link CWM.Classification.Classification_container#getClassificationTestTask <em>Classification Test Task</em>}</li>
 *   <li>{@link CWM.Classification.Classification_container#getPriorProbabilities <em>Prior Probabilities</em>}</li>
 *   <li>{@link CWM.Classification.Classification_container#getPriorProbabilitiesEntry <em>Prior Probabilities Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Classification.ClassificationPackage#getClassification_container()
 * @model
 * @generated
 */
public interface Classification_container extends EObject {
	/**
	 * Returns the value of the '<em><b>Apply Target Value Item</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Classification.ApplyTargetValueItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Apply Target Value Item</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apply Target Value Item</em>' containment reference list.
	 * @see CWM.Classification.ClassificationPackage#getClassification_container_ApplyTargetValueItem()
	 * @model containment="true"
	 * @generated
	 */
	EList<ApplyTargetValueItem> getApplyTargetValueItem();

	/**
	 * Returns the value of the '<em><b>Classification Attribute Usage</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Classification.ClassificationAttributeUsage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classification Attribute Usage</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification Attribute Usage</em>' containment reference list.
	 * @see CWM.Classification.ClassificationPackage#getClassification_container_ClassificationAttributeUsage()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClassificationAttributeUsage> getClassificationAttributeUsage();

	/**
	 * Returns the value of the '<em><b>Classification Function Settings</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Classification.ClassificationFunctionSettings}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classification Function Settings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification Function Settings</em>' containment reference list.
	 * @see CWM.Classification.ClassificationPackage#getClassification_container_ClassificationFunctionSettings()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClassificationFunctionSettings> getClassificationFunctionSettings();

	/**
	 * Returns the value of the '<em><b>Classification Test Result</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Classification.ClassificationTestResult}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classification Test Result</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification Test Result</em>' containment reference list.
	 * @see CWM.Classification.ClassificationPackage#getClassification_container_ClassificationTestResult()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClassificationTestResult> getClassificationTestResult();

	/**
	 * Returns the value of the '<em><b>Classification Test Task</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Classification.ClassificationTestTask}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classification Test Task</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification Test Task</em>' containment reference list.
	 * @see CWM.Classification.ClassificationPackage#getClassification_container_ClassificationTestTask()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClassificationTestTask> getClassificationTestTask();

	/**
	 * Returns the value of the '<em><b>Prior Probabilities</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Classification.PriorProbabilities}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prior Probabilities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prior Probabilities</em>' containment reference list.
	 * @see CWM.Classification.ClassificationPackage#getClassification_container_PriorProbabilities()
	 * @model containment="true"
	 * @generated
	 */
	EList<PriorProbabilities> getPriorProbabilities();

	/**
	 * Returns the value of the '<em><b>Prior Probabilities Entry</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Classification.PriorProbabilitiesEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prior Probabilities Entry</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prior Probabilities Entry</em>' containment reference list.
	 * @see CWM.Classification.ClassificationPackage#getClassification_container_PriorProbabilitiesEntry()
	 * @model containment="true"
	 * @generated
	 */
	EList<PriorProbabilitiesEntry> getPriorProbabilitiesEntry();

} // Classification_container

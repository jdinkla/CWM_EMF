/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.CwmTransformation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.CwmTransformation.Transformation_container#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link CWM.CwmTransformation.Transformation_container#getDataObjectSet <em>Data Object Set</em>}</li>
 *   <li>{@link CWM.CwmTransformation.Transformation_container#getTransformationTask <em>Transformation Task</em>}</li>
 *   <li>{@link CWM.CwmTransformation.Transformation_container#getTransformationStep <em>Transformation Step</em>}</li>
 *   <li>{@link CWM.CwmTransformation.Transformation_container#getTransformationActivity <em>Transformation Activity</em>}</li>
 *   <li>{@link CWM.CwmTransformation.Transformation_container#getPrecedenceConstraint <em>Precedence Constraint</em>}</li>
 *   <li>{@link CWM.CwmTransformation.Transformation_container#getTransformationUse <em>Transformation Use</em>}</li>
 *   <li>{@link CWM.CwmTransformation.Transformation_container#getTransformationMap <em>Transformation Map</em>}</li>
 *   <li>{@link CWM.CwmTransformation.Transformation_container#getTransformationTree <em>Transformation Tree</em>}</li>
 *   <li>{@link CWM.CwmTransformation.Transformation_container#getClassifierMap <em>Classifier Map</em>}</li>
 *   <li>{@link CWM.CwmTransformation.Transformation_container#getFeatureMap <em>Feature Map</em>}</li>
 *   <li>{@link CWM.CwmTransformation.Transformation_container#getStepPrecedence <em>Step Precedence</em>}</li>
 *   <li>{@link CWM.CwmTransformation.Transformation_container#getClassifierFeatureMap <em>Classifier Feature Map</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.CwmTransformation.CwmTransformationPackage#getTransformation_container()
 * @model
 * @generated
 */
public interface Transformation_container extends EObject {
	/**
	 * Returns the value of the '<em><b>Transformation</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.CwmTransformation.Transformation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation</em>' containment reference list.
	 * @see CWM.CwmTransformation.CwmTransformationPackage#getTransformation_container_Transformation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transformation> getTransformation();

	/**
	 * Returns the value of the '<em><b>Data Object Set</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.CwmTransformation.DataObjectSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Object Set</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Object Set</em>' containment reference list.
	 * @see CWM.CwmTransformation.CwmTransformationPackage#getTransformation_container_DataObjectSet()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataObjectSet> getDataObjectSet();

	/**
	 * Returns the value of the '<em><b>Transformation Task</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.CwmTransformation.TransformationTask}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformation Task</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation Task</em>' containment reference list.
	 * @see CWM.CwmTransformation.CwmTransformationPackage#getTransformation_container_TransformationTask()
	 * @model containment="true"
	 * @generated
	 */
	EList<TransformationTask> getTransformationTask();

	/**
	 * Returns the value of the '<em><b>Transformation Step</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.CwmTransformation.TransformationStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformation Step</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation Step</em>' containment reference list.
	 * @see CWM.CwmTransformation.CwmTransformationPackage#getTransformation_container_TransformationStep()
	 * @model containment="true"
	 * @generated
	 */
	EList<TransformationStep> getTransformationStep();

	/**
	 * Returns the value of the '<em><b>Transformation Activity</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.CwmTransformation.TransformationActivity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformation Activity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation Activity</em>' containment reference list.
	 * @see CWM.CwmTransformation.CwmTransformationPackage#getTransformation_container_TransformationActivity()
	 * @model containment="true"
	 * @generated
	 */
	EList<TransformationActivity> getTransformationActivity();

	/**
	 * Returns the value of the '<em><b>Precedence Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.CwmTransformation.PrecedenceConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precedence Constraint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precedence Constraint</em>' containment reference list.
	 * @see CWM.CwmTransformation.CwmTransformationPackage#getTransformation_container_PrecedenceConstraint()
	 * @model containment="true"
	 * @generated
	 */
	EList<PrecedenceConstraint> getPrecedenceConstraint();

	/**
	 * Returns the value of the '<em><b>Transformation Use</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.CwmTransformation.TransformationUse}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformation Use</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation Use</em>' containment reference list.
	 * @see CWM.CwmTransformation.CwmTransformationPackage#getTransformation_container_TransformationUse()
	 * @model containment="true"
	 * @generated
	 */
	EList<TransformationUse> getTransformationUse();

	/**
	 * Returns the value of the '<em><b>Transformation Map</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.CwmTransformation.TransformationMap}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformation Map</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation Map</em>' containment reference list.
	 * @see CWM.CwmTransformation.CwmTransformationPackage#getTransformation_container_TransformationMap()
	 * @model containment="true"
	 * @generated
	 */
	EList<TransformationMap> getTransformationMap();

	/**
	 * Returns the value of the '<em><b>Transformation Tree</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.CwmTransformation.TransformationTree}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformation Tree</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation Tree</em>' containment reference list.
	 * @see CWM.CwmTransformation.CwmTransformationPackage#getTransformation_container_TransformationTree()
	 * @model containment="true"
	 * @generated
	 */
	EList<TransformationTree> getTransformationTree();

	/**
	 * Returns the value of the '<em><b>Classifier Map</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.CwmTransformation.ClassifierMap}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classifier Map</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifier Map</em>' containment reference list.
	 * @see CWM.CwmTransformation.CwmTransformationPackage#getTransformation_container_ClassifierMap()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClassifierMap> getClassifierMap();

	/**
	 * Returns the value of the '<em><b>Feature Map</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.CwmTransformation.FeatureMap}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Map</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Map</em>' containment reference list.
	 * @see CWM.CwmTransformation.CwmTransformationPackage#getTransformation_container_FeatureMap()
	 * @model containment="true"
	 * @generated
	 */
	EList<FeatureMap> getFeatureMap();

	/**
	 * Returns the value of the '<em><b>Step Precedence</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.CwmTransformation.StepPrecedence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step Precedence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step Precedence</em>' containment reference list.
	 * @see CWM.CwmTransformation.CwmTransformationPackage#getTransformation_container_StepPrecedence()
	 * @model containment="true"
	 * @generated
	 */
	EList<StepPrecedence> getStepPrecedence();

	/**
	 * Returns the value of the '<em><b>Classifier Feature Map</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.CwmTransformation.ClassifierFeatureMap}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classifier Feature Map</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifier Feature Map</em>' containment reference list.
	 * @see CWM.CwmTransformation.CwmTransformationPackage#getTransformation_container_ClassifierFeatureMap()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClassifierFeatureMap> getClassifierFeatureMap();

} // Transformation_container

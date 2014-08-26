/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.CwmTransformation.util;

import CWM.Core.Classifier;
import CWM.Core.Constraint;
import CWM.Core.Dependency;
import CWM.Core.Element;
import CWM.Core.ModelElement;
import CWM.Core.Namespace;
import CWM.Core.Subsystem;

import CWM.CwmTransformation.*;

import CWM.SoftwareDeployment.Component;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see CWM.CwmTransformation.CwmTransformationPackage
 * @generated
 */
public class CwmTransformationSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CwmTransformationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CwmTransformationSwitch() {
		if (modelPackage == null) {
			modelPackage = CwmTransformationPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CwmTransformationPackage.TRANSFORMATION: {
				Transformation transformation = (Transformation)theEObject;
				T result = caseTransformation(transformation);
				if (result == null) result = caseNamespace(transformation);
				if (result == null) result = caseModelElement(transformation);
				if (result == null) result = caseElement(transformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CwmTransformationPackage.DATA_OBJECT_SET: {
				DataObjectSet dataObjectSet = (DataObjectSet)theEObject;
				T result = caseDataObjectSet(dataObjectSet);
				if (result == null) result = caseModelElement(dataObjectSet);
				if (result == null) result = caseElement(dataObjectSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CwmTransformationPackage.TRANSFORMATION_TASK: {
				TransformationTask transformationTask = (TransformationTask)theEObject;
				T result = caseTransformationTask(transformationTask);
				if (result == null) result = caseComponent(transformationTask);
				if (result == null) result = caseClassifier(transformationTask);
				if (result == null) result = caseNamespace(transformationTask);
				if (result == null) result = caseModelElement(transformationTask);
				if (result == null) result = caseElement(transformationTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CwmTransformationPackage.TRANSFORMATION_STEP: {
				TransformationStep transformationStep = (TransformationStep)theEObject;
				T result = caseTransformationStep(transformationStep);
				if (result == null) result = caseModelElement(transformationStep);
				if (result == null) result = caseElement(transformationStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CwmTransformationPackage.TRANSFORMATION_ACTIVITY: {
				TransformationActivity transformationActivity = (TransformationActivity)theEObject;
				T result = caseTransformationActivity(transformationActivity);
				if (result == null) result = caseSubsystem(transformationActivity);
				if (result == null) result = casePackage(transformationActivity);
				if (result == null) result = caseClassifier(transformationActivity);
				if (result == null) result = caseNamespace(transformationActivity);
				if (result == null) result = caseModelElement(transformationActivity);
				if (result == null) result = caseElement(transformationActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CwmTransformationPackage.PRECEDENCE_CONSTRAINT: {
				PrecedenceConstraint precedenceConstraint = (PrecedenceConstraint)theEObject;
				T result = casePrecedenceConstraint(precedenceConstraint);
				if (result == null) result = caseConstraint(precedenceConstraint);
				if (result == null) result = caseModelElement(precedenceConstraint);
				if (result == null) result = caseElement(precedenceConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CwmTransformationPackage.TRANSFORMATION_USE: {
				TransformationUse transformationUse = (TransformationUse)theEObject;
				T result = caseTransformationUse(transformationUse);
				if (result == null) result = caseDependency(transformationUse);
				if (result == null) result = caseModelElement(transformationUse);
				if (result == null) result = caseElement(transformationUse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CwmTransformationPackage.TRANSFORMATION_MAP: {
				TransformationMap transformationMap = (TransformationMap)theEObject;
				T result = caseTransformationMap(transformationMap);
				if (result == null) result = caseTransformation(transformationMap);
				if (result == null) result = caseNamespace(transformationMap);
				if (result == null) result = caseModelElement(transformationMap);
				if (result == null) result = caseElement(transformationMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CwmTransformationPackage.TRANSFORMATION_TREE: {
				TransformationTree transformationTree = (TransformationTree)theEObject;
				T result = caseTransformationTree(transformationTree);
				if (result == null) result = caseTransformation(transformationTree);
				if (result == null) result = caseNamespace(transformationTree);
				if (result == null) result = caseModelElement(transformationTree);
				if (result == null) result = caseElement(transformationTree);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CwmTransformationPackage.CLASSIFIER_MAP: {
				ClassifierMap classifierMap = (ClassifierMap)theEObject;
				T result = caseClassifierMap(classifierMap);
				if (result == null) result = caseNamespace(classifierMap);
				if (result == null) result = caseModelElement(classifierMap);
				if (result == null) result = caseElement(classifierMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CwmTransformationPackage.FEATURE_MAP: {
				FeatureMap featureMap = (FeatureMap)theEObject;
				T result = caseFeatureMap(featureMap);
				if (result == null) result = caseModelElement(featureMap);
				if (result == null) result = caseElement(featureMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CwmTransformationPackage.STEP_PRECEDENCE: {
				StepPrecedence stepPrecedence = (StepPrecedence)theEObject;
				T result = caseStepPrecedence(stepPrecedence);
				if (result == null) result = caseDependency(stepPrecedence);
				if (result == null) result = caseModelElement(stepPrecedence);
				if (result == null) result = caseElement(stepPrecedence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CwmTransformationPackage.CLASSIFIER_FEATURE_MAP: {
				ClassifierFeatureMap classifierFeatureMap = (ClassifierFeatureMap)theEObject;
				T result = caseClassifierFeatureMap(classifierFeatureMap);
				if (result == null) result = caseModelElement(classifierFeatureMap);
				if (result == null) result = caseElement(classifierFeatureMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER: {
				Transformation_container transformation_container = (Transformation_container)theEObject;
				T result = caseTransformation_container(transformation_container);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformation(Transformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Object Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Object Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataObjectSet(DataObjectSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformation Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformation Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformationTask(TransformationTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformation Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformation Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformationStep(TransformationStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformation Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformation Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformationActivity(TransformationActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Precedence Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Precedence Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrecedenceConstraint(PrecedenceConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformation Use</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformation Use</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformationUse(TransformationUse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformation Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformation Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformationMap(TransformationMap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformation Tree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformation Tree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformationTree(TransformationTree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classifier Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classifier Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassifierMap(ClassifierMap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureMap(FeatureMap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step Precedence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step Precedence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStepPrecedence(StepPrecedence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classifier Feature Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classifier Feature Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassifierFeatureMap(ClassifierFeatureMap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformation container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformation container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformation_container(Transformation_container object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Namespace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamespace(Namespace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassifier(Classifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackage(CWM.Core.Package object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subsystem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subsystem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubsystem(Subsystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraint(Constraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependency(Dependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //CwmTransformationSwitch

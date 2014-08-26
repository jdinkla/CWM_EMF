/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Classification.util;

import CWM.Classification.*;

import CWM.Core.Attribute;
import CWM.Core.Element;
import CWM.Core.Feature;
import CWM.Core.ModelElement;
import CWM.Core.StructuralFeature;

import CWM.MiningCore.MiningData.AttributeUsage;
import CWM.MiningCore.MiningData.MiningAttribute;

import CWM.MiningCore.MiningFunctionSettings.MiningFunctionSettings;

import CWM.MiningCore.MiningResult.MiningResult;

import CWM.MiningCore.MiningTask.ApplyOutputItem;
import CWM.MiningCore.MiningTask.MiningTask;

import CWM.Supervised.MiningTestResult;
import CWM.Supervised.MiningTestTask;
import CWM.Supervised.SupervisedFunctionSettings;

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
 * @see CWM.Classification.ClassificationPackage
 * @generated
 */
public class ClassificationSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ClassificationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassificationSwitch() {
		if (modelPackage == null) {
			modelPackage = ClassificationPackage.eINSTANCE;
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
			case ClassificationPackage.APPLY_TARGET_VALUE_ITEM: {
				ApplyTargetValueItem applyTargetValueItem = (ApplyTargetValueItem)theEObject;
				T result = caseApplyTargetValueItem(applyTargetValueItem);
				if (result == null) result = caseApplyOutputItem(applyTargetValueItem);
				if (result == null) result = caseMiningAttribute(applyTargetValueItem);
				if (result == null) result = caseAttribute(applyTargetValueItem);
				if (result == null) result = caseStructuralFeature(applyTargetValueItem);
				if (result == null) result = caseFeature(applyTargetValueItem);
				if (result == null) result = caseModelElement(applyTargetValueItem);
				if (result == null) result = caseElement(applyTargetValueItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassificationPackage.CLASSIFICATION_ATTRIBUTE_USAGE: {
				ClassificationAttributeUsage classificationAttributeUsage = (ClassificationAttributeUsage)theEObject;
				T result = caseClassificationAttributeUsage(classificationAttributeUsage);
				if (result == null) result = caseAttributeUsage(classificationAttributeUsage);
				if (result == null) result = caseFeature(classificationAttributeUsage);
				if (result == null) result = caseModelElement(classificationAttributeUsage);
				if (result == null) result = caseElement(classificationAttributeUsage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassificationPackage.CLASSIFICATION_FUNCTION_SETTINGS: {
				ClassificationFunctionSettings classificationFunctionSettings = (ClassificationFunctionSettings)theEObject;
				T result = caseClassificationFunctionSettings(classificationFunctionSettings);
				if (result == null) result = caseSupervisedFunctionSettings(classificationFunctionSettings);
				if (result == null) result = caseMiningFunctionSettings(classificationFunctionSettings);
				if (result == null) result = caseModelElement(classificationFunctionSettings);
				if (result == null) result = caseElement(classificationFunctionSettings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassificationPackage.CLASSIFICATION_TEST_RESULT: {
				ClassificationTestResult classificationTestResult = (ClassificationTestResult)theEObject;
				T result = caseClassificationTestResult(classificationTestResult);
				if (result == null) result = caseMiningTestResult(classificationTestResult);
				if (result == null) result = caseMiningResult(classificationTestResult);
				if (result == null) result = caseModelElement(classificationTestResult);
				if (result == null) result = caseElement(classificationTestResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassificationPackage.CLASSIFICATION_TEST_TASK: {
				ClassificationTestTask classificationTestTask = (ClassificationTestTask)theEObject;
				T result = caseClassificationTestTask(classificationTestTask);
				if (result == null) result = caseMiningTestTask(classificationTestTask);
				if (result == null) result = caseMiningTask(classificationTestTask);
				if (result == null) result = caseModelElement(classificationTestTask);
				if (result == null) result = caseElement(classificationTestTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassificationPackage.PRIOR_PROBABILITIES: {
				PriorProbabilities priorProbabilities = (PriorProbabilities)theEObject;
				T result = casePriorProbabilities(priorProbabilities);
				if (result == null) result = caseModelElement(priorProbabilities);
				if (result == null) result = caseElement(priorProbabilities);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassificationPackage.PRIOR_PROBABILITIES_ENTRY: {
				PriorProbabilitiesEntry priorProbabilitiesEntry = (PriorProbabilitiesEntry)theEObject;
				T result = casePriorProbabilitiesEntry(priorProbabilitiesEntry);
				if (result == null) result = caseModelElement(priorProbabilitiesEntry);
				if (result == null) result = caseElement(priorProbabilitiesEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassificationPackage.CLASSIFICATION_CONTAINER: {
				Classification_container classification_container = (Classification_container)theEObject;
				T result = caseClassification_container(classification_container);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Apply Target Value Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Apply Target Value Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplyTargetValueItem(ApplyTargetValueItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Usage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Usage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassificationAttributeUsage(ClassificationAttributeUsage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Settings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Settings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassificationFunctionSettings(ClassificationFunctionSettings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassificationTestResult(ClassificationTestResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassificationTestTask(ClassificationTestTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prior Probabilities</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prior Probabilities</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePriorProbabilities(PriorProbabilities object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prior Probabilities Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prior Probabilities Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePriorProbabilitiesEntry(PriorProbabilitiesEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classification container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classification container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassification_container(Classification_container object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeature(Feature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structural Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structural Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuralFeature(StructuralFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mining Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mining Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMiningAttribute(MiningAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Apply Output Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Apply Output Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplyOutputItem(ApplyOutputItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Usage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Usage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeUsage(AttributeUsage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mining Function Settings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mining Function Settings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMiningFunctionSettings(MiningFunctionSettings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Settings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Settings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupervisedFunctionSettings(SupervisedFunctionSettings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mining Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mining Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMiningResult(MiningResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mining Test Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mining Test Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMiningTestResult(MiningTestResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mining Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mining Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMiningTask(MiningTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mining Test Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mining Test Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMiningTestTask(MiningTestTask object) {
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

} //ClassificationSwitch

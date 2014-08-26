/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningTask.util;

import CWM.Core.Attribute;
import CWM.Core.Element;
import CWM.Core.Feature;
import CWM.Core.ModelElement;
import CWM.Core.Namespace;
import CWM.Core.StructuralFeature;

import CWM.CwmTransformation.Transformation;

import CWM.MiningCore.MiningData.MiningAttribute;

import CWM.MiningCore.MiningTask.*;

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
 * @see CWM.MiningCore.MiningTask.MiningTaskPackage
 * @generated
 */
public class MiningTaskSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MiningTaskPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiningTaskSwitch() {
		if (modelPackage == null) {
			modelPackage = MiningTaskPackage.eINSTANCE;
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
			case MiningTaskPackage.APPLY_CONTENT_ITEM: {
				ApplyContentItem applyContentItem = (ApplyContentItem)theEObject;
				T result = caseApplyContentItem(applyContentItem);
				if (result == null) result = caseApplyOutputItem(applyContentItem);
				if (result == null) result = caseMiningAttribute(applyContentItem);
				if (result == null) result = caseAttribute(applyContentItem);
				if (result == null) result = caseStructuralFeature(applyContentItem);
				if (result == null) result = caseFeature(applyContentItem);
				if (result == null) result = caseModelElement(applyContentItem);
				if (result == null) result = caseElement(applyContentItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MiningTaskPackage.APPLY_OUTPUT_ITEM: {
				ApplyOutputItem applyOutputItem = (ApplyOutputItem)theEObject;
				T result = caseApplyOutputItem(applyOutputItem);
				if (result == null) result = caseMiningAttribute(applyOutputItem);
				if (result == null) result = caseAttribute(applyOutputItem);
				if (result == null) result = caseStructuralFeature(applyOutputItem);
				if (result == null) result = caseFeature(applyOutputItem);
				if (result == null) result = caseModelElement(applyOutputItem);
				if (result == null) result = caseElement(applyOutputItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MiningTaskPackage.APPLY_PROBABILITY_ITEM: {
				ApplyProbabilityItem applyProbabilityItem = (ApplyProbabilityItem)theEObject;
				T result = caseApplyProbabilityItem(applyProbabilityItem);
				if (result == null) result = caseApplyContentItem(applyProbabilityItem);
				if (result == null) result = caseApplyOutputItem(applyProbabilityItem);
				if (result == null) result = caseMiningAttribute(applyProbabilityItem);
				if (result == null) result = caseAttribute(applyProbabilityItem);
				if (result == null) result = caseStructuralFeature(applyProbabilityItem);
				if (result == null) result = caseFeature(applyProbabilityItem);
				if (result == null) result = caseModelElement(applyProbabilityItem);
				if (result == null) result = caseElement(applyProbabilityItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MiningTaskPackage.APPLY_RULE_ID_ITEM: {
				ApplyRuleIdItem applyRuleIdItem = (ApplyRuleIdItem)theEObject;
				T result = caseApplyRuleIdItem(applyRuleIdItem);
				if (result == null) result = caseApplyContentItem(applyRuleIdItem);
				if (result == null) result = caseApplyOutputItem(applyRuleIdItem);
				if (result == null) result = caseMiningAttribute(applyRuleIdItem);
				if (result == null) result = caseAttribute(applyRuleIdItem);
				if (result == null) result = caseStructuralFeature(applyRuleIdItem);
				if (result == null) result = caseFeature(applyRuleIdItem);
				if (result == null) result = caseModelElement(applyRuleIdItem);
				if (result == null) result = caseElement(applyRuleIdItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MiningTaskPackage.APPLY_SCORE_ITEM: {
				ApplyScoreItem applyScoreItem = (ApplyScoreItem)theEObject;
				T result = caseApplyScoreItem(applyScoreItem);
				if (result == null) result = caseApplyContentItem(applyScoreItem);
				if (result == null) result = caseApplyOutputItem(applyScoreItem);
				if (result == null) result = caseMiningAttribute(applyScoreItem);
				if (result == null) result = caseAttribute(applyScoreItem);
				if (result == null) result = caseStructuralFeature(applyScoreItem);
				if (result == null) result = caseFeature(applyScoreItem);
				if (result == null) result = caseModelElement(applyScoreItem);
				if (result == null) result = caseElement(applyScoreItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MiningTaskPackage.APPLY_SOURCE_ITEM: {
				ApplySourceItem applySourceItem = (ApplySourceItem)theEObject;
				T result = caseApplySourceItem(applySourceItem);
				if (result == null) result = caseApplyOutputItem(applySourceItem);
				if (result == null) result = caseMiningAttribute(applySourceItem);
				if (result == null) result = caseAttribute(applySourceItem);
				if (result == null) result = caseStructuralFeature(applySourceItem);
				if (result == null) result = caseFeature(applySourceItem);
				if (result == null) result = caseModelElement(applySourceItem);
				if (result == null) result = caseElement(applySourceItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MiningTaskPackage.MINING_APPLY_OUTPUT: {
				MiningApplyOutput miningApplyOutput = (MiningApplyOutput)theEObject;
				T result = caseMiningApplyOutput(miningApplyOutput);
				if (result == null) result = caseModelElement(miningApplyOutput);
				if (result == null) result = caseElement(miningApplyOutput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MiningTaskPackage.MINING_APPLY_TASK: {
				MiningApplyTask miningApplyTask = (MiningApplyTask)theEObject;
				T result = caseMiningApplyTask(miningApplyTask);
				if (result == null) result = caseMiningTask(miningApplyTask);
				if (result == null) result = caseModelElement(miningApplyTask);
				if (result == null) result = caseElement(miningApplyTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MiningTaskPackage.MINING_BUILD_TASK: {
				MiningBuildTask miningBuildTask = (MiningBuildTask)theEObject;
				T result = caseMiningBuildTask(miningBuildTask);
				if (result == null) result = caseMiningTask(miningBuildTask);
				if (result == null) result = caseModelElement(miningBuildTask);
				if (result == null) result = caseElement(miningBuildTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MiningTaskPackage.MINING_TASK: {
				MiningTask miningTask = (MiningTask)theEObject;
				T result = caseMiningTask(miningTask);
				if (result == null) result = caseModelElement(miningTask);
				if (result == null) result = caseElement(miningTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MiningTaskPackage.MINING_TRANSFORMATION: {
				MiningTransformation miningTransformation = (MiningTransformation)theEObject;
				T result = caseMiningTransformation(miningTransformation);
				if (result == null) result = caseTransformation(miningTransformation);
				if (result == null) result = caseNamespace(miningTransformation);
				if (result == null) result = caseModelElement(miningTransformation);
				if (result == null) result = caseElement(miningTransformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MiningTaskPackage.MINING_TASK_CONTAINER: {
				MiningTask_container miningTask_container = (MiningTask_container)theEObject;
				T result = caseMiningTask_container(miningTask_container);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Apply Content Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Apply Content Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplyContentItem(ApplyContentItem object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Apply Probability Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Apply Probability Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplyProbabilityItem(ApplyProbabilityItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Apply Rule Id Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Apply Rule Id Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplyRuleIdItem(ApplyRuleIdItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Apply Score Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Apply Score Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplyScoreItem(ApplyScoreItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Apply Source Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Apply Source Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplySourceItem(ApplySourceItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mining Apply Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mining Apply Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMiningApplyOutput(MiningApplyOutput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mining Apply Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mining Apply Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMiningApplyTask(MiningApplyTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mining Build Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mining Build Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMiningBuildTask(MiningBuildTask object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Mining Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mining Transformation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMiningTransformation(MiningTransformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mining Task container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mining Task container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMiningTask_container(MiningTask_container object) {
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

} //MiningTaskSwitch

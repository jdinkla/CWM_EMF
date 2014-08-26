/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.AssociationRules.util;

import CWM.AssociationRules.*;

import CWM.Core.Element;
import CWM.Core.ModelElement;

import CWM.MiningCore.MiningFunctionSettings.MiningFunctionSettings;

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
 * @see CWM.AssociationRules.AssociationRulesPackage
 * @generated
 */
public class AssociationRulesSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AssociationRulesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationRulesSwitch() {
		if (modelPackage == null) {
			modelPackage = AssociationRulesPackage.eINSTANCE;
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
			case AssociationRulesPackage.ASSOCIATION_RULES_FUNCTION_SETTINGS: {
				AssociationRulesFunctionSettings associationRulesFunctionSettings = (AssociationRulesFunctionSettings)theEObject;
				T result = caseAssociationRulesFunctionSettings(associationRulesFunctionSettings);
				if (result == null) result = caseFrequentItemSetFunctionSettings(associationRulesFunctionSettings);
				if (result == null) result = caseMiningFunctionSettings(associationRulesFunctionSettings);
				if (result == null) result = caseModelElement(associationRulesFunctionSettings);
				if (result == null) result = caseElement(associationRulesFunctionSettings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssociationRulesPackage.FREQUENT_ITEM_SET_FUNCTION_SETTINGS: {
				FrequentItemSetFunctionSettings frequentItemSetFunctionSettings = (FrequentItemSetFunctionSettings)theEObject;
				T result = caseFrequentItemSetFunctionSettings(frequentItemSetFunctionSettings);
				if (result == null) result = caseMiningFunctionSettings(frequentItemSetFunctionSettings);
				if (result == null) result = caseModelElement(frequentItemSetFunctionSettings);
				if (result == null) result = caseElement(frequentItemSetFunctionSettings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssociationRulesPackage.SEQUENCE_FUNCTION_SETTINGS: {
				SequenceFunctionSettings sequenceFunctionSettings = (SequenceFunctionSettings)theEObject;
				T result = caseSequenceFunctionSettings(sequenceFunctionSettings);
				if (result == null) result = caseFrequentItemSetFunctionSettings(sequenceFunctionSettings);
				if (result == null) result = caseMiningFunctionSettings(sequenceFunctionSettings);
				if (result == null) result = caseModelElement(sequenceFunctionSettings);
				if (result == null) result = caseElement(sequenceFunctionSettings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssociationRulesPackage.ASSOCIATION_RULES_CONTAINER: {
				AssociationRules_container associationRules_container = (AssociationRules_container)theEObject;
				T result = caseAssociationRules_container(associationRules_container);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	public T caseAssociationRulesFunctionSettings(AssociationRulesFunctionSettings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Frequent Item Set Function Settings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Frequent Item Set Function Settings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFrequentItemSetFunctionSettings(FrequentItemSetFunctionSettings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Function Settings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Function Settings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceFunctionSettings(SequenceFunctionSettings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association Rules container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association Rules container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociationRules_container(AssociationRules_container object) {
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

} //AssociationRulesSwitch

/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Supervised.util;

import CWM.Core.Element;
import CWM.Core.ModelElement;

import CWM.MiningCore.MiningFunctionSettings.MiningFunctionSettings;

import CWM.MiningCore.MiningResult.MiningResult;

import CWM.MiningCore.MiningTask.MiningTask;

import CWM.Supervised.*;

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
 * @see CWM.Supervised.SupervisedPackage
 * @generated
 */
public class SupervisedSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SupervisedPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupervisedSwitch() {
		if (modelPackage == null) {
			modelPackage = SupervisedPackage.eINSTANCE;
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
			case SupervisedPackage.LIFT_ANALYSIS_POINT: {
				LiftAnalysisPoint liftAnalysisPoint = (LiftAnalysisPoint)theEObject;
				T result = caseLiftAnalysisPoint(liftAnalysisPoint);
				if (result == null) result = caseModelElement(liftAnalysisPoint);
				if (result == null) result = caseElement(liftAnalysisPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SupervisedPackage.LIFT_ANALYSIS: {
				LiftAnalysis liftAnalysis = (LiftAnalysis)theEObject;
				T result = caseLiftAnalysis(liftAnalysis);
				if (result == null) result = caseModelElement(liftAnalysis);
				if (result == null) result = caseElement(liftAnalysis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SupervisedPackage.MINING_TEST_TASK: {
				MiningTestTask miningTestTask = (MiningTestTask)theEObject;
				T result = caseMiningTestTask(miningTestTask);
				if (result == null) result = caseMiningTask(miningTestTask);
				if (result == null) result = caseModelElement(miningTestTask);
				if (result == null) result = caseElement(miningTestTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SupervisedPackage.SUPERVISED_FUNCTION_SETTINGS: {
				SupervisedFunctionSettings supervisedFunctionSettings = (SupervisedFunctionSettings)theEObject;
				T result = caseSupervisedFunctionSettings(supervisedFunctionSettings);
				if (result == null) result = caseMiningFunctionSettings(supervisedFunctionSettings);
				if (result == null) result = caseModelElement(supervisedFunctionSettings);
				if (result == null) result = caseElement(supervisedFunctionSettings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SupervisedPackage.MINING_TEST_RESULT: {
				MiningTestResult miningTestResult = (MiningTestResult)theEObject;
				T result = caseMiningTestResult(miningTestResult);
				if (result == null) result = caseMiningResult(miningTestResult);
				if (result == null) result = caseModelElement(miningTestResult);
				if (result == null) result = caseElement(miningTestResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SupervisedPackage.SUPERVISED_CONTAINER: {
				Supervised_container supervised_container = (Supervised_container)theEObject;
				T result = caseSupervised_container(supervised_container);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lift Analysis Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lift Analysis Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiftAnalysisPoint(LiftAnalysisPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lift Analysis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lift Analysis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiftAnalysis(LiftAnalysis object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Supervised container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supervised container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupervised_container(Supervised_container object) {
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

} //SupervisedSwitch

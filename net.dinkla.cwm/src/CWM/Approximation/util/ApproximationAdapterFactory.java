/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Approximation.util;

import CWM.Approximation.*;

import CWM.Core.Element;
import CWM.Core.ModelElement;

import CWM.MiningCore.MiningFunctionSettings.MiningFunctionSettings;

import CWM.MiningCore.MiningResult.MiningResult;

import CWM.MiningCore.MiningTask.MiningTask;

import CWM.Supervised.MiningTestResult;
import CWM.Supervised.MiningTestTask;
import CWM.Supervised.SupervisedFunctionSettings;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see CWM.Approximation.ApproximationPackage
 * @generated
 */
public class ApproximationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ApproximationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApproximationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ApproximationPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch the delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApproximationSwitch<Adapter> modelSwitch =
		new ApproximationSwitch<Adapter>() {
			@Override
			public Adapter caseApproximationFunctionSettings(ApproximationFunctionSettings object) {
				return createApproximationFunctionSettingsAdapter();
			}
			@Override
			public Adapter caseApproximationTestResult(ApproximationTestResult object) {
				return createApproximationTestResultAdapter();
			}
			@Override
			public Adapter caseApproximationTestTask(ApproximationTestTask object) {
				return createApproximationTestTaskAdapter();
			}
			@Override
			public Adapter caseApproximation_container(Approximation_container object) {
				return createApproximation_containerAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseModelElement(ModelElement object) {
				return createModelElementAdapter();
			}
			@Override
			public Adapter caseMiningFunctionSettings(MiningFunctionSettings object) {
				return createMiningFunctionSettingsAdapter();
			}
			@Override
			public Adapter caseSupervisedFunctionSettings(SupervisedFunctionSettings object) {
				return createSupervisedFunctionSettingsAdapter();
			}
			@Override
			public Adapter caseMiningResult(MiningResult object) {
				return createMiningResultAdapter();
			}
			@Override
			public Adapter caseMiningTestResult(MiningTestResult object) {
				return createMiningTestResultAdapter();
			}
			@Override
			public Adapter caseMiningTask(MiningTask object) {
				return createMiningTaskAdapter();
			}
			@Override
			public Adapter caseMiningTestTask(MiningTestTask object) {
				return createMiningTestTaskAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link CWM.Approximation.ApproximationFunctionSettings <em>Function Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.Approximation.ApproximationFunctionSettings
	 * @generated
	 */
	public Adapter createApproximationFunctionSettingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.Approximation.ApproximationTestResult <em>Test Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.Approximation.ApproximationTestResult
	 * @generated
	 */
	public Adapter createApproximationTestResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.Approximation.ApproximationTestTask <em>Test Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.Approximation.ApproximationTestTask
	 * @generated
	 */
	public Adapter createApproximationTestTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.Approximation.Approximation_container <em>Approximation container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.Approximation.Approximation_container
	 * @generated
	 */
	public Adapter createApproximation_containerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.Core.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.Core.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.Core.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.Core.ModelElement
	 * @generated
	 */
	public Adapter createModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.MiningCore.MiningFunctionSettings.MiningFunctionSettings <em>Mining Function Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.MiningCore.MiningFunctionSettings.MiningFunctionSettings
	 * @generated
	 */
	public Adapter createMiningFunctionSettingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.Supervised.SupervisedFunctionSettings <em>Function Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.Supervised.SupervisedFunctionSettings
	 * @generated
	 */
	public Adapter createSupervisedFunctionSettingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.MiningCore.MiningResult.MiningResult <em>Mining Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.MiningCore.MiningResult.MiningResult
	 * @generated
	 */
	public Adapter createMiningResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.Supervised.MiningTestResult <em>Mining Test Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.Supervised.MiningTestResult
	 * @generated
	 */
	public Adapter createMiningTestResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.MiningCore.MiningTask.MiningTask <em>Mining Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.MiningCore.MiningTask.MiningTask
	 * @generated
	 */
	public Adapter createMiningTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.Supervised.MiningTestTask <em>Mining Test Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.Supervised.MiningTestTask
	 * @generated
	 */
	public Adapter createMiningTestTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ApproximationAdapterFactory

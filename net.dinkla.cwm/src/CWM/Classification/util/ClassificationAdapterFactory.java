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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see CWM.Classification.ClassificationPackage
 * @generated
 */
public class ClassificationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ClassificationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassificationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ClassificationPackage.eINSTANCE;
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
	protected ClassificationSwitch<Adapter> modelSwitch =
		new ClassificationSwitch<Adapter>() {
			@Override
			public Adapter caseApplyTargetValueItem(ApplyTargetValueItem object) {
				return createApplyTargetValueItemAdapter();
			}
			@Override
			public Adapter caseClassificationAttributeUsage(ClassificationAttributeUsage object) {
				return createClassificationAttributeUsageAdapter();
			}
			@Override
			public Adapter caseClassificationFunctionSettings(ClassificationFunctionSettings object) {
				return createClassificationFunctionSettingsAdapter();
			}
			@Override
			public Adapter caseClassificationTestResult(ClassificationTestResult object) {
				return createClassificationTestResultAdapter();
			}
			@Override
			public Adapter caseClassificationTestTask(ClassificationTestTask object) {
				return createClassificationTestTaskAdapter();
			}
			@Override
			public Adapter casePriorProbabilities(PriorProbabilities object) {
				return createPriorProbabilitiesAdapter();
			}
			@Override
			public Adapter casePriorProbabilitiesEntry(PriorProbabilitiesEntry object) {
				return createPriorProbabilitiesEntryAdapter();
			}
			@Override
			public Adapter caseClassification_container(Classification_container object) {
				return createClassification_containerAdapter();
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
			public Adapter caseFeature(Feature object) {
				return createFeatureAdapter();
			}
			@Override
			public Adapter caseStructuralFeature(StructuralFeature object) {
				return createStructuralFeatureAdapter();
			}
			@Override
			public Adapter caseAttribute(Attribute object) {
				return createAttributeAdapter();
			}
			@Override
			public Adapter caseMiningAttribute(MiningAttribute object) {
				return createMiningAttributeAdapter();
			}
			@Override
			public Adapter caseApplyOutputItem(ApplyOutputItem object) {
				return createApplyOutputItemAdapter();
			}
			@Override
			public Adapter caseAttributeUsage(AttributeUsage object) {
				return createAttributeUsageAdapter();
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
	 * Creates a new adapter for an object of class '{@link CWM.Classification.ApplyTargetValueItem <em>Apply Target Value Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.Classification.ApplyTargetValueItem
	 * @generated
	 */
	public Adapter createApplyTargetValueItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.Classification.ClassificationAttributeUsage <em>Attribute Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.Classification.ClassificationAttributeUsage
	 * @generated
	 */
	public Adapter createClassificationAttributeUsageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.Classification.ClassificationFunctionSettings <em>Function Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.Classification.ClassificationFunctionSettings
	 * @generated
	 */
	public Adapter createClassificationFunctionSettingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.Classification.ClassificationTestResult <em>Test Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.Classification.ClassificationTestResult
	 * @generated
	 */
	public Adapter createClassificationTestResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.Classification.ClassificationTestTask <em>Test Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.Classification.ClassificationTestTask
	 * @generated
	 */
	public Adapter createClassificationTestTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.Classification.PriorProbabilities <em>Prior Probabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.Classification.PriorProbabilities
	 * @generated
	 */
	public Adapter createPriorProbabilitiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.Classification.PriorProbabilitiesEntry <em>Prior Probabilities Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.Classification.PriorProbabilitiesEntry
	 * @generated
	 */
	public Adapter createPriorProbabilitiesEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.Classification.Classification_container <em>Classification container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.Classification.Classification_container
	 * @generated
	 */
	public Adapter createClassification_containerAdapter() {
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
	 * Creates a new adapter for an object of class '{@link CWM.Core.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.Core.Feature
	 * @generated
	 */
	public Adapter createFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.Core.StructuralFeature <em>Structural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.Core.StructuralFeature
	 * @generated
	 */
	public Adapter createStructuralFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.Core.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.Core.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.MiningCore.MiningData.MiningAttribute <em>Mining Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.MiningCore.MiningData.MiningAttribute
	 * @generated
	 */
	public Adapter createMiningAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.MiningCore.MiningTask.ApplyOutputItem <em>Apply Output Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.MiningCore.MiningTask.ApplyOutputItem
	 * @generated
	 */
	public Adapter createApplyOutputItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.MiningCore.MiningData.AttributeUsage <em>Attribute Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.MiningCore.MiningData.AttributeUsage
	 * @generated
	 */
	public Adapter createAttributeUsageAdapter() {
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

} //ClassificationAdapterFactory

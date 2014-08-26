/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Clustering.util;

import CWM.Clustering.*;

import CWM.Core.Element;
import CWM.Core.Feature;
import CWM.Core.ModelElement;

import CWM.MiningCore.MiningData.AttributeUsage;

import CWM.MiningCore.MiningFunctionSettings.MiningFunctionSettings;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see CWM.Clustering.ClusteringPackage
 * @generated
 */
public class ClusteringAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ClusteringPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClusteringAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ClusteringPackage.eINSTANCE;
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
	protected ClusteringSwitch<Adapter> modelSwitch =
		new ClusteringSwitch<Adapter>() {
			@Override
			public Adapter caseClusteringAttributeUsage(ClusteringAttributeUsage object) {
				return createClusteringAttributeUsageAdapter();
			}
			@Override
			public Adapter caseClusteringFunctionSettings(ClusteringFunctionSettings object) {
				return createClusteringFunctionSettingsAdapter();
			}
			@Override
			public Adapter caseClustering_container(Clustering_container object) {
				return createClustering_containerAdapter();
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
			public Adapter caseAttributeUsage(AttributeUsage object) {
				return createAttributeUsageAdapter();
			}
			@Override
			public Adapter caseMiningFunctionSettings(MiningFunctionSettings object) {
				return createMiningFunctionSettingsAdapter();
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
	 * Creates a new adapter for an object of class '{@link CWM.Clustering.ClusteringAttributeUsage <em>Attribute Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.Clustering.ClusteringAttributeUsage
	 * @generated
	 */
	public Adapter createClusteringAttributeUsageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.Clustering.ClusteringFunctionSettings <em>Function Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.Clustering.ClusteringFunctionSettings
	 * @generated
	 */
	public Adapter createClusteringFunctionSettingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.Clustering.Clustering_container <em>Clustering container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.Clustering.Clustering_container
	 * @generated
	 */
	public Adapter createClustering_containerAdapter() {
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

} //ClusteringAdapterFactory

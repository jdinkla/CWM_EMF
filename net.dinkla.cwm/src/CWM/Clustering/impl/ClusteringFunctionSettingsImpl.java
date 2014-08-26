/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Clustering.impl;

import CWM.Clustering.AggregationFunction;
import CWM.Clustering.ClusteringFunctionSettings;
import CWM.Clustering.ClusteringPackage;

import CWM.MiningCore.MiningFunctionSettings.impl.MiningFunctionSettingsImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.Clustering.impl.ClusteringFunctionSettingsImpl#getMaxNumberOfClusters <em>Max Number Of Clusters</em>}</li>
 *   <li>{@link CWM.Clustering.impl.ClusteringFunctionSettingsImpl#getMinClusterSize <em>Min Cluster Size</em>}</li>
 *   <li>{@link CWM.Clustering.impl.ClusteringFunctionSettingsImpl#getAggregationFunction <em>Aggregation Function</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClusteringFunctionSettingsImpl extends MiningFunctionSettingsImpl implements ClusteringFunctionSettings {
	/**
	 * The default value of the '{@link #getMaxNumberOfClusters() <em>Max Number Of Clusters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNumberOfClusters()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAX_NUMBER_OF_CLUSTERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxNumberOfClusters() <em>Max Number Of Clusters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNumberOfClusters()
	 * @generated
	 * @ordered
	 */
	protected Integer maxNumberOfClusters = MAX_NUMBER_OF_CLUSTERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinClusterSize() <em>Min Cluster Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinClusterSize()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MIN_CLUSTER_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinClusterSize() <em>Min Cluster Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinClusterSize()
	 * @generated
	 * @ordered
	 */
	protected Integer minClusterSize = MIN_CLUSTER_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAggregationFunction() <em>Aggregation Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregationFunction()
	 * @generated
	 * @ordered
	 */
	protected static final AggregationFunction AGGREGATION_FUNCTION_EDEFAULT = AggregationFunction.EUCLIDEAN;

	/**
	 * The cached value of the '{@link #getAggregationFunction() <em>Aggregation Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregationFunction()
	 * @generated
	 * @ordered
	 */
	protected AggregationFunction aggregationFunction = AGGREGATION_FUNCTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClusteringFunctionSettingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClusteringPackage.Literals.CLUSTERING_FUNCTION_SETTINGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMaxNumberOfClusters() {
		return maxNumberOfClusters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxNumberOfClusters(Integer newMaxNumberOfClusters) {
		Integer oldMaxNumberOfClusters = maxNumberOfClusters;
		maxNumberOfClusters = newMaxNumberOfClusters;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClusteringPackage.CLUSTERING_FUNCTION_SETTINGS__MAX_NUMBER_OF_CLUSTERS, oldMaxNumberOfClusters, maxNumberOfClusters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMinClusterSize() {
		return minClusterSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinClusterSize(Integer newMinClusterSize) {
		Integer oldMinClusterSize = minClusterSize;
		minClusterSize = newMinClusterSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClusteringPackage.CLUSTERING_FUNCTION_SETTINGS__MIN_CLUSTER_SIZE, oldMinClusterSize, minClusterSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationFunction getAggregationFunction() {
		return aggregationFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAggregationFunction(AggregationFunction newAggregationFunction) {
		AggregationFunction oldAggregationFunction = aggregationFunction;
		aggregationFunction = newAggregationFunction == null ? AGGREGATION_FUNCTION_EDEFAULT : newAggregationFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClusteringPackage.CLUSTERING_FUNCTION_SETTINGS__AGGREGATION_FUNCTION, oldAggregationFunction, aggregationFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClusteringPackage.CLUSTERING_FUNCTION_SETTINGS__MAX_NUMBER_OF_CLUSTERS:
				return getMaxNumberOfClusters();
			case ClusteringPackage.CLUSTERING_FUNCTION_SETTINGS__MIN_CLUSTER_SIZE:
				return getMinClusterSize();
			case ClusteringPackage.CLUSTERING_FUNCTION_SETTINGS__AGGREGATION_FUNCTION:
				return getAggregationFunction();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ClusteringPackage.CLUSTERING_FUNCTION_SETTINGS__MAX_NUMBER_OF_CLUSTERS:
				setMaxNumberOfClusters((Integer)newValue);
				return;
			case ClusteringPackage.CLUSTERING_FUNCTION_SETTINGS__MIN_CLUSTER_SIZE:
				setMinClusterSize((Integer)newValue);
				return;
			case ClusteringPackage.CLUSTERING_FUNCTION_SETTINGS__AGGREGATION_FUNCTION:
				setAggregationFunction((AggregationFunction)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ClusteringPackage.CLUSTERING_FUNCTION_SETTINGS__MAX_NUMBER_OF_CLUSTERS:
				setMaxNumberOfClusters(MAX_NUMBER_OF_CLUSTERS_EDEFAULT);
				return;
			case ClusteringPackage.CLUSTERING_FUNCTION_SETTINGS__MIN_CLUSTER_SIZE:
				setMinClusterSize(MIN_CLUSTER_SIZE_EDEFAULT);
				return;
			case ClusteringPackage.CLUSTERING_FUNCTION_SETTINGS__AGGREGATION_FUNCTION:
				setAggregationFunction(AGGREGATION_FUNCTION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ClusteringPackage.CLUSTERING_FUNCTION_SETTINGS__MAX_NUMBER_OF_CLUSTERS:
				return MAX_NUMBER_OF_CLUSTERS_EDEFAULT == null ? maxNumberOfClusters != null : !MAX_NUMBER_OF_CLUSTERS_EDEFAULT.equals(maxNumberOfClusters);
			case ClusteringPackage.CLUSTERING_FUNCTION_SETTINGS__MIN_CLUSTER_SIZE:
				return MIN_CLUSTER_SIZE_EDEFAULT == null ? minClusterSize != null : !MIN_CLUSTER_SIZE_EDEFAULT.equals(minClusterSize);
			case ClusteringPackage.CLUSTERING_FUNCTION_SETTINGS__AGGREGATION_FUNCTION:
				return aggregationFunction != AGGREGATION_FUNCTION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (maxNumberOfClusters: ");
		result.append(maxNumberOfClusters);
		result.append(", minClusterSize: ");
		result.append(minClusterSize);
		result.append(", aggregationFunction: ");
		result.append(aggregationFunction);
		result.append(')');
		return result.toString();
	}

} //ClusteringFunctionSettingsImpl

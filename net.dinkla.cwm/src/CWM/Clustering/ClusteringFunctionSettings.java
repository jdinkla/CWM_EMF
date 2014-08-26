/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Clustering;

import CWM.MiningCore.MiningFunctionSettings.MiningFunctionSettings;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Clustering.ClusteringFunctionSettings#getMaxNumberOfClusters <em>Max Number Of Clusters</em>}</li>
 *   <li>{@link CWM.Clustering.ClusteringFunctionSettings#getMinClusterSize <em>Min Cluster Size</em>}</li>
 *   <li>{@link CWM.Clustering.ClusteringFunctionSettings#getAggregationFunction <em>Aggregation Function</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Clustering.ClusteringPackage#getClusteringFunctionSettings()
 * @model
 * @generated
 */
public interface ClusteringFunctionSettings extends MiningFunctionSettings {
	/**
	 * Returns the value of the '<em><b>Max Number Of Clusters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Number Of Clusters</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Number Of Clusters</em>' attribute.
	 * @see #setMaxNumberOfClusters(Integer)
	 * @see CWM.Clustering.ClusteringPackage#getClusteringFunctionSettings_MaxNumberOfClusters()
	 * @model unique="false" dataType="CWM.Core.Integer" required="true" ordered="false"
	 * @generated
	 */
	Integer getMaxNumberOfClusters();

	/**
	 * Sets the value of the '{@link CWM.Clustering.ClusteringFunctionSettings#getMaxNumberOfClusters <em>Max Number Of Clusters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Number Of Clusters</em>' attribute.
	 * @see #getMaxNumberOfClusters()
	 * @generated
	 */
	void setMaxNumberOfClusters(Integer value);

	/**
	 * Returns the value of the '<em><b>Min Cluster Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Cluster Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Cluster Size</em>' attribute.
	 * @see #setMinClusterSize(Integer)
	 * @see CWM.Clustering.ClusteringPackage#getClusteringFunctionSettings_MinClusterSize()
	 * @model unique="false" dataType="CWM.Core.Integer" required="true" ordered="false"
	 * @generated
	 */
	Integer getMinClusterSize();

	/**
	 * Sets the value of the '{@link CWM.Clustering.ClusteringFunctionSettings#getMinClusterSize <em>Min Cluster Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Cluster Size</em>' attribute.
	 * @see #getMinClusterSize()
	 * @generated
	 */
	void setMinClusterSize(Integer value);

	/**
	 * Returns the value of the '<em><b>Aggregation Function</b></em>' attribute.
	 * The literals are from the enumeration {@link CWM.Clustering.AggregationFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregation Function</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregation Function</em>' attribute.
	 * @see CWM.Clustering.AggregationFunction
	 * @see #setAggregationFunction(AggregationFunction)
	 * @see CWM.Clustering.ClusteringPackage#getClusteringFunctionSettings_AggregationFunction()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	AggregationFunction getAggregationFunction();

	/**
	 * Sets the value of the '{@link CWM.Clustering.ClusteringFunctionSettings#getAggregationFunction <em>Aggregation Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregation Function</em>' attribute.
	 * @see CWM.Clustering.AggregationFunction
	 * @see #getAggregationFunction()
	 * @generated
	 */
	void setAggregationFunction(AggregationFunction value);

} // ClusteringFunctionSettings

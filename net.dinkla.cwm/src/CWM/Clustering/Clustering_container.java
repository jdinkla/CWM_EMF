/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Clustering;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clustering container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Clustering.Clustering_container#getClusteringAttributeUsage <em>Clustering Attribute Usage</em>}</li>
 *   <li>{@link CWM.Clustering.Clustering_container#getClusteringFunctionSettings <em>Clustering Function Settings</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Clustering.ClusteringPackage#getClustering_container()
 * @model
 * @generated
 */
public interface Clustering_container extends EObject {
	/**
	 * Returns the value of the '<em><b>Clustering Attribute Usage</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Clustering.ClusteringAttributeUsage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clustering Attribute Usage</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clustering Attribute Usage</em>' containment reference list.
	 * @see CWM.Clustering.ClusteringPackage#getClustering_container_ClusteringAttributeUsage()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClusteringAttributeUsage> getClusteringAttributeUsage();

	/**
	 * Returns the value of the '<em><b>Clustering Function Settings</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Clustering.ClusteringFunctionSettings}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clustering Function Settings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clustering Function Settings</em>' containment reference list.
	 * @see CWM.Clustering.ClusteringPackage#getClustering_container_ClusteringFunctionSettings()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClusteringFunctionSettings> getClusteringFunctionSettings();

} // Clustering_container

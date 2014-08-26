/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Clustering;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see CWM.Clustering.ClusteringPackage
 * @generated
 */
public interface ClusteringFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ClusteringFactory eINSTANCE = CWM.Clustering.impl.ClusteringFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Attribute Usage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Usage</em>'.
	 * @generated
	 */
	ClusteringAttributeUsage createClusteringAttributeUsage();

	/**
	 * Returns a new object of class '<em>Function Settings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Settings</em>'.
	 * @generated
	 */
	ClusteringFunctionSettings createClusteringFunctionSettings();

	/**
	 * Returns a new object of class '<em>Clustering container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clustering container</em>'.
	 * @generated
	 */
	Clustering_container createClustering_container();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ClusteringPackage getClusteringPackage();

} //ClusteringFactory

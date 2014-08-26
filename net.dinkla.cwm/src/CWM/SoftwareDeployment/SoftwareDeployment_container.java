/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.SoftwareDeployment;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Software Deployment container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.SoftwareDeployment.SoftwareDeployment_container#getSite <em>Site</em>}</li>
 *   <li>{@link CWM.SoftwareDeployment.SoftwareDeployment_container#getMachine <em>Machine</em>}</li>
 *   <li>{@link CWM.SoftwareDeployment.SoftwareDeployment_container#getSoftwareSystem <em>Software System</em>}</li>
 *   <li>{@link CWM.SoftwareDeployment.SoftwareDeployment_container#getDeployedComponent <em>Deployed Component</em>}</li>
 *   <li>{@link CWM.SoftwareDeployment.SoftwareDeployment_container#getDeployedSoftwareSystem <em>Deployed Software System</em>}</li>
 *   <li>{@link CWM.SoftwareDeployment.SoftwareDeployment_container#getDataManager <em>Data Manager</em>}</li>
 *   <li>{@link CWM.SoftwareDeployment.SoftwareDeployment_container#getDataProvider <em>Data Provider</em>}</li>
 *   <li>{@link CWM.SoftwareDeployment.SoftwareDeployment_container#getProviderConnection <em>Provider Connection</em>}</li>
 *   <li>{@link CWM.SoftwareDeployment.SoftwareDeployment_container#getComponent <em>Component</em>}</li>
 *   <li>{@link CWM.SoftwareDeployment.SoftwareDeployment_container#getPackageUsage <em>Package Usage</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.SoftwareDeployment.SoftwareDeploymentPackage#getSoftwareDeployment_container()
 * @model
 * @generated
 */
public interface SoftwareDeployment_container extends EObject {
	/**
	 * Returns the value of the '<em><b>Site</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.SoftwareDeployment.Site}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Site</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Site</em>' containment reference list.
	 * @see CWM.SoftwareDeployment.SoftwareDeploymentPackage#getSoftwareDeployment_container_Site()
	 * @model containment="true"
	 * @generated
	 */
	EList<Site> getSite();

	/**
	 * Returns the value of the '<em><b>Machine</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.SoftwareDeployment.Machine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Machine</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Machine</em>' containment reference list.
	 * @see CWM.SoftwareDeployment.SoftwareDeploymentPackage#getSoftwareDeployment_container_Machine()
	 * @model containment="true"
	 * @generated
	 */
	EList<Machine> getMachine();

	/**
	 * Returns the value of the '<em><b>Software System</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.SoftwareDeployment.SoftwareSystem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Software System</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Software System</em>' containment reference list.
	 * @see CWM.SoftwareDeployment.SoftwareDeploymentPackage#getSoftwareDeployment_container_SoftwareSystem()
	 * @model containment="true"
	 * @generated
	 */
	EList<SoftwareSystem> getSoftwareSystem();

	/**
	 * Returns the value of the '<em><b>Deployed Component</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.SoftwareDeployment.DeployedComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployed Component</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployed Component</em>' containment reference list.
	 * @see CWM.SoftwareDeployment.SoftwareDeploymentPackage#getSoftwareDeployment_container_DeployedComponent()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeployedComponent> getDeployedComponent();

	/**
	 * Returns the value of the '<em><b>Deployed Software System</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.SoftwareDeployment.DeployedSoftwareSystem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployed Software System</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployed Software System</em>' containment reference list.
	 * @see CWM.SoftwareDeployment.SoftwareDeploymentPackage#getSoftwareDeployment_container_DeployedSoftwareSystem()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeployedSoftwareSystem> getDeployedSoftwareSystem();

	/**
	 * Returns the value of the '<em><b>Data Manager</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.SoftwareDeployment.DataManager}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Manager</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Manager</em>' containment reference list.
	 * @see CWM.SoftwareDeployment.SoftwareDeploymentPackage#getSoftwareDeployment_container_DataManager()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataManager> getDataManager();

	/**
	 * Returns the value of the '<em><b>Data Provider</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.SoftwareDeployment.DataProvider}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Provider</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Provider</em>' containment reference list.
	 * @see CWM.SoftwareDeployment.SoftwareDeploymentPackage#getSoftwareDeployment_container_DataProvider()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataProvider> getDataProvider();

	/**
	 * Returns the value of the '<em><b>Provider Connection</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.SoftwareDeployment.ProviderConnection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provider Connection</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider Connection</em>' containment reference list.
	 * @see CWM.SoftwareDeployment.SoftwareDeploymentPackage#getSoftwareDeployment_container_ProviderConnection()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProviderConnection> getProviderConnection();

	/**
	 * Returns the value of the '<em><b>Component</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.SoftwareDeployment.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' containment reference list.
	 * @see CWM.SoftwareDeployment.SoftwareDeploymentPackage#getSoftwareDeployment_container_Component()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component> getComponent();

	/**
	 * Returns the value of the '<em><b>Package Usage</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.SoftwareDeployment.PackageUsage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Usage</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Usage</em>' containment reference list.
	 * @see CWM.SoftwareDeployment.SoftwareDeploymentPackage#getSoftwareDeployment_container_PackageUsage()
	 * @model containment="true"
	 * @generated
	 */
	EList<PackageUsage> getPackageUsage();

} // SoftwareDeployment_container

/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.SoftwareDeployment;

import CWM.Core.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provider Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.SoftwareDeployment.ProviderConnection#getIsReadOnly <em>Is Read Only</em>}</li>
 *   <li>{@link CWM.SoftwareDeployment.ProviderConnection#getDataProvider <em>Data Provider</em>}</li>
 *   <li>{@link CWM.SoftwareDeployment.ProviderConnection#getDataManager <em>Data Manager</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.SoftwareDeployment.SoftwareDeploymentPackage#getProviderConnection()
 * @model
 * @generated
 */
public interface ProviderConnection extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Is Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Read Only</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Read Only</em>' attribute.
	 * @see #setIsReadOnly(Boolean)
	 * @see CWM.SoftwareDeployment.SoftwareDeploymentPackage#getProviderConnection_IsReadOnly()
	 * @model unique="false" dataType="CWM.Core.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsReadOnly();

	/**
	 * Sets the value of the '{@link CWM.SoftwareDeployment.ProviderConnection#getIsReadOnly <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Read Only</em>' attribute.
	 * @see #getIsReadOnly()
	 * @generated
	 */
	void setIsReadOnly(Boolean value);

	/**
	 * Returns the value of the '<em><b>Data Provider</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link CWM.SoftwareDeployment.DataProvider#getResourceConnection <em>Resource Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Provider</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Provider</em>' container reference.
	 * @see #setDataProvider(DataProvider)
	 * @see CWM.SoftwareDeployment.SoftwareDeploymentPackage#getProviderConnection_DataProvider()
	 * @see CWM.SoftwareDeployment.DataProvider#getResourceConnection
	 * @model opposite="resourceConnection" required="true" transient="false" ordered="false"
	 * @generated
	 */
	DataProvider getDataProvider();

	/**
	 * Sets the value of the '{@link CWM.SoftwareDeployment.ProviderConnection#getDataProvider <em>Data Provider</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Provider</em>' container reference.
	 * @see #getDataProvider()
	 * @generated
	 */
	void setDataProvider(DataProvider value);

	/**
	 * Returns the value of the '<em><b>Data Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Manager</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Manager</em>' reference.
	 * @see #setDataManager(DataManager)
	 * @see CWM.SoftwareDeployment.SoftwareDeploymentPackage#getProviderConnection_DataManager()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DataManager getDataManager();

	/**
	 * Sets the value of the '{@link CWM.SoftwareDeployment.ProviderConnection#getDataManager <em>Data Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Manager</em>' reference.
	 * @see #getDataManager()
	 * @generated
	 */
	void setDataManager(DataManager value);

} // ProviderConnection

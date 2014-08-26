/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.SoftwareDeployment;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.SoftwareDeployment.DataProvider#getResourceConnection <em>Resource Connection</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.SoftwareDeployment.SoftwareDeploymentPackage#getDataProvider()
 * @model
 * @generated
 */
public interface DataProvider extends DataManager {
	/**
	 * Returns the value of the '<em><b>Resource Connection</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.SoftwareDeployment.ProviderConnection}.
	 * It is bidirectional and its opposite is '{@link CWM.SoftwareDeployment.ProviderConnection#getDataProvider <em>Data Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Connection</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Connection</em>' containment reference list.
	 * @see CWM.SoftwareDeployment.SoftwareDeploymentPackage#getDataProvider_ResourceConnection()
	 * @see CWM.SoftwareDeployment.ProviderConnection#getDataProvider
	 * @model opposite="dataProvider" containment="true" ordered="false"
	 * @generated
	 */
	EList<ProviderConnection> getResourceConnection();

} // DataProvider

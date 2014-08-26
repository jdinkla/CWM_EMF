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
 * A representation of the model object '<em><b>Data Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.SoftwareDeployment.DataManager#getIsCaseSensitive <em>Is Case Sensitive</em>}</li>
 *   <li>{@link CWM.SoftwareDeployment.DataManager#getDataPackage <em>Data Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.SoftwareDeployment.SoftwareDeploymentPackage#getDataManager()
 * @model
 * @generated
 */
public interface DataManager extends DeployedComponent {
	/**
	 * Returns the value of the '<em><b>Is Case Sensitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Case Sensitive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Case Sensitive</em>' attribute.
	 * @see #setIsCaseSensitive(Boolean)
	 * @see CWM.SoftwareDeployment.SoftwareDeploymentPackage#getDataManager_IsCaseSensitive()
	 * @model unique="false" dataType="CWM.Core.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsCaseSensitive();

	/**
	 * Sets the value of the '{@link CWM.SoftwareDeployment.DataManager#getIsCaseSensitive <em>Is Case Sensitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Case Sensitive</em>' attribute.
	 * @see #getIsCaseSensitive()
	 * @generated
	 */
	void setIsCaseSensitive(Boolean value);

	/**
	 * Returns the value of the '<em><b>Data Package</b></em>' reference list.
	 * The list contents are of type {@link CWM.Core.Package}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Package</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Package</em>' reference list.
	 * @see CWM.SoftwareDeployment.SoftwareDeploymentPackage#getDataManager_DataPackage()
	 * @model ordered="false"
	 * @generated
	 */
	EList<CWM.Core.Package> getDataPackage();

} // DataManager

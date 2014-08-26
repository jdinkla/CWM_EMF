/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.SoftwareDeployment;

import CWM.Core.Namespace;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.SoftwareDeployment.Machine#getIpAddress <em>Ip Address</em>}</li>
 *   <li>{@link CWM.SoftwareDeployment.Machine#getHostName <em>Host Name</em>}</li>
 *   <li>{@link CWM.SoftwareDeployment.Machine#getMachineID <em>Machine ID</em>}</li>
 *   <li>{@link CWM.SoftwareDeployment.Machine#getSite <em>Site</em>}</li>
 *   <li>{@link CWM.SoftwareDeployment.Machine#getDeployedComponent <em>Deployed Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.SoftwareDeployment.SoftwareDeploymentPackage#getMachine()
 * @model
 * @generated
 */
public interface Machine extends Namespace {
	/**
	 * Returns the value of the '<em><b>Ip Address</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ip Address</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ip Address</em>' attribute list.
	 * @see CWM.SoftwareDeployment.SoftwareDeploymentPackage#getMachine_IpAddress()
	 * @model unique="false" dataType="CWM.Core.String"
	 * @generated
	 */
	EList<String> getIpAddress();

	/**
	 * Returns the value of the '<em><b>Host Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Name</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Name</em>' attribute list.
	 * @see CWM.SoftwareDeployment.SoftwareDeploymentPackage#getMachine_HostName()
	 * @model unique="false" dataType="CWM.Core.String"
	 * @generated
	 */
	EList<String> getHostName();

	/**
	 * Returns the value of the '<em><b>Machine ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Machine ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Machine ID</em>' attribute.
	 * @see #setMachineID(String)
	 * @see CWM.SoftwareDeployment.SoftwareDeploymentPackage#getMachine_MachineID()
	 * @model unique="false" dataType="CWM.Core.String" ordered="false"
	 * @generated
	 */
	String getMachineID();

	/**
	 * Sets the value of the '{@link CWM.SoftwareDeployment.Machine#getMachineID <em>Machine ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Machine ID</em>' attribute.
	 * @see #getMachineID()
	 * @generated
	 */
	void setMachineID(String value);

	/**
	 * Returns the value of the '<em><b>Site</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Site</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Site</em>' reference.
	 * @see #setSite(Site)
	 * @see CWM.SoftwareDeployment.SoftwareDeploymentPackage#getMachine_Site()
	 * @model ordered="false"
	 * @generated
	 */
	Site getSite();

	/**
	 * Sets the value of the '{@link CWM.SoftwareDeployment.Machine#getSite <em>Site</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Site</em>' reference.
	 * @see #getSite()
	 * @generated
	 */
	void setSite(Site value);

	/**
	 * Returns the value of the '<em><b>Deployed Component</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.SoftwareDeployment.DeployedComponent}.
	 * It is bidirectional and its opposite is '{@link CWM.SoftwareDeployment.DeployedComponent#getMachine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployed Component</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployed Component</em>' containment reference list.
	 * @see CWM.SoftwareDeployment.SoftwareDeploymentPackage#getMachine_DeployedComponent()
	 * @see CWM.SoftwareDeployment.DeployedComponent#getMachine
	 * @model opposite="machine" containment="true" ordered="false"
	 * @generated
	 */
	EList<DeployedComponent> getDeployedComponent();

} // Machine

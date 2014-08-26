/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.SoftwareDeployment;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployed Software System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.SoftwareDeployment.DeployedSoftwareSystem#getFixLevel <em>Fix Level</em>}</li>
 *   <li>{@link CWM.SoftwareDeployment.DeployedSoftwareSystem#getSoftwareSystem <em>Software System</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.SoftwareDeployment.SoftwareDeploymentPackage#getDeployedSoftwareSystem()
 * @model
 * @generated
 */
public interface DeployedSoftwareSystem extends CWM.Core.Package {
	/**
	 * Returns the value of the '<em><b>Fix Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fix Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fix Level</em>' attribute.
	 * @see #setFixLevel(String)
	 * @see CWM.SoftwareDeployment.SoftwareDeploymentPackage#getDeployedSoftwareSystem_FixLevel()
	 * @model unique="false" dataType="CWM.Core.String" required="true" ordered="false"
	 * @generated
	 */
	String getFixLevel();

	/**
	 * Sets the value of the '{@link CWM.SoftwareDeployment.DeployedSoftwareSystem#getFixLevel <em>Fix Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fix Level</em>' attribute.
	 * @see #getFixLevel()
	 * @generated
	 */
	void setFixLevel(String value);

	/**
	 * Returns the value of the '<em><b>Software System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Software System</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Software System</em>' reference.
	 * @see #setSoftwareSystem(SoftwareSystem)
	 * @see CWM.SoftwareDeployment.SoftwareDeploymentPackage#getDeployedSoftwareSystem_SoftwareSystem()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SoftwareSystem getSoftwareSystem();

	/**
	 * Sets the value of the '{@link CWM.SoftwareDeployment.DeployedSoftwareSystem#getSoftwareSystem <em>Software System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Software System</em>' reference.
	 * @see #getSoftwareSystem()
	 * @generated
	 */
	void setSoftwareSystem(SoftwareSystem value);

} // DeployedSoftwareSystem

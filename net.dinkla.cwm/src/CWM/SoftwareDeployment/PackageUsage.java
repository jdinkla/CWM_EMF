/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.SoftwareDeployment;

import CWM.Core.Dependency;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.SoftwareDeployment.PackageUsage#getPackageAlias <em>Package Alias</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.SoftwareDeployment.SoftwareDeploymentPackage#getPackageUsage()
 * @model
 * @generated
 */
public interface PackageUsage extends Dependency {
	/**
	 * Returns the value of the '<em><b>Package Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Alias</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Alias</em>' attribute.
	 * @see #setPackageAlias(String)
	 * @see CWM.SoftwareDeployment.SoftwareDeploymentPackage#getPackageUsage_PackageAlias()
	 * @model unique="false" dataType="CWM.Core.Name" ordered="false"
	 * @generated
	 */
	String getPackageAlias();

	/**
	 * Sets the value of the '{@link CWM.SoftwareDeployment.PackageUsage#getPackageAlias <em>Package Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Alias</em>' attribute.
	 * @see #getPackageAlias()
	 * @generated
	 */
	void setPackageAlias(String value);

} // PackageUsage

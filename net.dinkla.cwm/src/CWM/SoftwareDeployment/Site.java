/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.SoftwareDeployment;

import CWM.BusinessInformation.Location;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Site</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.SoftwareDeployment.Site#getContainingSite <em>Containing Site</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.SoftwareDeployment.SoftwareDeploymentPackage#getSite()
 * @model
 * @generated
 */
public interface Site extends Location {
	/**
	 * Returns the value of the '<em><b>Containing Site</b></em>' reference list.
	 * The list contents are of type {@link CWM.SoftwareDeployment.Site}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containing Site</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containing Site</em>' reference list.
	 * @see CWM.SoftwareDeployment.SoftwareDeploymentPackage#getSite_ContainingSite()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Site> getContainingSite();

} // Site

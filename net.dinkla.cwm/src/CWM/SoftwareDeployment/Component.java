/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.SoftwareDeployment;

import CWM.Core.Classifier;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.SoftwareDeployment.Component#getDesignPackage <em>Design Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.SoftwareDeployment.SoftwareDeploymentPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends Classifier {
	/**
	 * Returns the value of the '<em><b>Design Package</b></em>' reference list.
	 * The list contents are of type {@link CWM.Core.Package}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Design Package</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design Package</em>' reference list.
	 * @see CWM.SoftwareDeployment.SoftwareDeploymentPackage#getComponent_DesignPackage()
	 * @model ordered="false"
	 * @generated
	 */
	EList<CWM.Core.Package> getDesignPackage();

} // Component

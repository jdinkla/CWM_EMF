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
 * A representation of the model object '<em><b>Deployed Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.SoftwareDeployment.DeployedComponent#getPathname <em>Pathname</em>}</li>
 *   <li>{@link CWM.SoftwareDeployment.DeployedComponent#getComponent <em>Component</em>}</li>
 *   <li>{@link CWM.SoftwareDeployment.DeployedComponent#getMachine <em>Machine</em>}</li>
 *   <li>{@link CWM.SoftwareDeployment.DeployedComponent#getUsingComponents <em>Using Components</em>}</li>
 *   <li>{@link CWM.SoftwareDeployment.DeployedComponent#getUsedComponents <em>Used Components</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.SoftwareDeployment.SoftwareDeploymentPackage#getDeployedComponent()
 * @model
 * @generated
 */
public interface DeployedComponent extends CWM.Core.Package {
	/**
	 * Returns the value of the '<em><b>Pathname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pathname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pathname</em>' attribute.
	 * @see #setPathname(String)
	 * @see CWM.SoftwareDeployment.SoftwareDeploymentPackage#getDeployedComponent_Pathname()
	 * @model unique="false" dataType="CWM.Core.String" required="true" ordered="false"
	 * @generated
	 */
	String getPathname();

	/**
	 * Sets the value of the '{@link CWM.SoftwareDeployment.DeployedComponent#getPathname <em>Pathname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pathname</em>' attribute.
	 * @see #getPathname()
	 * @generated
	 */
	void setPathname(String value);

	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' reference.
	 * @see #setComponent(Component)
	 * @see CWM.SoftwareDeployment.SoftwareDeploymentPackage#getDeployedComponent_Component()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Component getComponent();

	/**
	 * Sets the value of the '{@link CWM.SoftwareDeployment.DeployedComponent#getComponent <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(Component value);

	/**
	 * Returns the value of the '<em><b>Machine</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link CWM.SoftwareDeployment.Machine#getDeployedComponent <em>Deployed Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Machine</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Machine</em>' container reference.
	 * @see #setMachine(Machine)
	 * @see CWM.SoftwareDeployment.SoftwareDeploymentPackage#getDeployedComponent_Machine()
	 * @see CWM.SoftwareDeployment.Machine#getDeployedComponent
	 * @model opposite="deployedComponent" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Machine getMachine();

	/**
	 * Sets the value of the '{@link CWM.SoftwareDeployment.DeployedComponent#getMachine <em>Machine</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Machine</em>' container reference.
	 * @see #getMachine()
	 * @generated
	 */
	void setMachine(Machine value);

	/**
	 * Returns the value of the '<em><b>Using Components</b></em>' reference list.
	 * The list contents are of type {@link CWM.SoftwareDeployment.DeployedComponent}.
	 * It is bidirectional and its opposite is '{@link CWM.SoftwareDeployment.DeployedComponent#getUsedComponents <em>Used Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Using Components</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Using Components</em>' reference list.
	 * @see CWM.SoftwareDeployment.SoftwareDeploymentPackage#getDeployedComponent_UsingComponents()
	 * @see CWM.SoftwareDeployment.DeployedComponent#getUsedComponents
	 * @model opposite="usedComponents" ordered="false"
	 * @generated
	 */
	EList<DeployedComponent> getUsingComponents();

	/**
	 * Returns the value of the '<em><b>Used Components</b></em>' reference list.
	 * The list contents are of type {@link CWM.SoftwareDeployment.DeployedComponent}.
	 * It is bidirectional and its opposite is '{@link CWM.SoftwareDeployment.DeployedComponent#getUsingComponents <em>Using Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used Components</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used Components</em>' reference list.
	 * @see CWM.SoftwareDeployment.SoftwareDeploymentPackage#getDeployedComponent_UsedComponents()
	 * @see CWM.SoftwareDeployment.DeployedComponent#getUsingComponents
	 * @model opposite="usingComponents" ordered="false"
	 * @generated
	 */
	EList<DeployedComponent> getUsedComponents();

} // DeployedComponent

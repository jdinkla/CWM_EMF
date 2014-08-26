/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Olap;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cube Deployment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Olap.CubeDeployment#getCubeRegion <em>Cube Region</em>}</li>
 *   <li>{@link CWM.Olap.CubeDeployment#getDeploymentGroup <em>Deployment Group</em>}</li>
 *   <li>{@link CWM.Olap.CubeDeployment#getContentMap <em>Content Map</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Olap.OlapPackage#getCubeDeployment()
 * @model
 * @generated
 */
public interface CubeDeployment extends CWM.Core.Class {
	/**
	 * Returns the value of the '<em><b>Cube Region</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link CWM.Olap.CubeRegion#getCubeDeployment <em>Cube Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cube Region</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cube Region</em>' container reference.
	 * @see #setCubeRegion(CubeRegion)
	 * @see CWM.Olap.OlapPackage#getCubeDeployment_CubeRegion()
	 * @see CWM.Olap.CubeRegion#getCubeDeployment
	 * @model opposite="cubeDeployment" required="true" transient="false" ordered="false"
	 * @generated
	 */
	CubeRegion getCubeRegion();

	/**
	 * Sets the value of the '{@link CWM.Olap.CubeDeployment#getCubeRegion <em>Cube Region</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cube Region</em>' container reference.
	 * @see #getCubeRegion()
	 * @generated
	 */
	void setCubeRegion(CubeRegion value);

	/**
	 * Returns the value of the '<em><b>Deployment Group</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CWM.Olap.DeploymentGroup#getCubeDeployment <em>Cube Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployment Group</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment Group</em>' reference.
	 * @see #setDeploymentGroup(DeploymentGroup)
	 * @see CWM.Olap.OlapPackage#getCubeDeployment_DeploymentGroup()
	 * @see CWM.Olap.DeploymentGroup#getCubeDeployment
	 * @model opposite="cubeDeployment" required="true" ordered="false"
	 * @generated
	 */
	DeploymentGroup getDeploymentGroup();

	/**
	 * Sets the value of the '{@link CWM.Olap.CubeDeployment#getDeploymentGroup <em>Deployment Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployment Group</em>' reference.
	 * @see #getDeploymentGroup()
	 * @generated
	 */
	void setDeploymentGroup(DeploymentGroup value);

	/**
	 * Returns the value of the '<em><b>Content Map</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Olap.ContentMap}.
	 * It is bidirectional and its opposite is '{@link CWM.Olap.ContentMap#getCubeDeployment <em>Cube Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Map</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Map</em>' containment reference list.
	 * @see CWM.Olap.OlapPackage#getCubeDeployment_ContentMap()
	 * @see CWM.Olap.ContentMap#getCubeDeployment
	 * @model opposite="cubeDeployment" containment="true" ordered="false"
	 * @generated
	 */
	EList<ContentMap> getContentMap();

} // CubeDeployment

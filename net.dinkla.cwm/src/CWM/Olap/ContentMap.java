/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Olap;

import CWM.CwmTransformation.TransformationMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Olap.ContentMap#getCubeDeployment <em>Cube Deployment</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Olap.OlapPackage#getContentMap()
 * @model
 * @generated
 */
public interface ContentMap extends TransformationMap {
	/**
	 * Returns the value of the '<em><b>Cube Deployment</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link CWM.Olap.CubeDeployment#getContentMap <em>Content Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cube Deployment</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cube Deployment</em>' container reference.
	 * @see #setCubeDeployment(CubeDeployment)
	 * @see CWM.Olap.OlapPackage#getContentMap_CubeDeployment()
	 * @see CWM.Olap.CubeDeployment#getContentMap
	 * @model opposite="contentMap" required="true" transient="false" ordered="false"
	 * @generated
	 */
	CubeDeployment getCubeDeployment();

	/**
	 * Sets the value of the '{@link CWM.Olap.ContentMap#getCubeDeployment <em>Cube Deployment</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cube Deployment</em>' container reference.
	 * @see #getCubeDeployment()
	 * @generated
	 */
	void setCubeDeployment(CubeDeployment value);

} // ContentMap

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
 * A representation of the model object '<em><b>Deployment Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Olap.DeploymentGroup#getSchema <em>Schema</em>}</li>
 *   <li>{@link CWM.Olap.DeploymentGroup#getCubeDeployment <em>Cube Deployment</em>}</li>
 *   <li>{@link CWM.Olap.DeploymentGroup#getDimensionDeployment <em>Dimension Deployment</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Olap.OlapPackage#getDeploymentGroup()
 * @model
 * @generated
 */
public interface DeploymentGroup extends CWM.Core.Package {
	/**
	 * Returns the value of the '<em><b>Schema</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link CWM.Olap.Schema#getDeploymentGroup <em>Deployment Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' container reference.
	 * @see #setSchema(Schema)
	 * @see CWM.Olap.OlapPackage#getDeploymentGroup_Schema()
	 * @see CWM.Olap.Schema#getDeploymentGroup
	 * @model opposite="deploymentGroup" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Schema getSchema();

	/**
	 * Sets the value of the '{@link CWM.Olap.DeploymentGroup#getSchema <em>Schema</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema</em>' container reference.
	 * @see #getSchema()
	 * @generated
	 */
	void setSchema(Schema value);

	/**
	 * Returns the value of the '<em><b>Cube Deployment</b></em>' reference list.
	 * The list contents are of type {@link CWM.Olap.CubeDeployment}.
	 * It is bidirectional and its opposite is '{@link CWM.Olap.CubeDeployment#getDeploymentGroup <em>Deployment Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cube Deployment</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cube Deployment</em>' reference list.
	 * @see CWM.Olap.OlapPackage#getDeploymentGroup_CubeDeployment()
	 * @see CWM.Olap.CubeDeployment#getDeploymentGroup
	 * @model opposite="deploymentGroup" ordered="false"
	 * @generated
	 */
	EList<CubeDeployment> getCubeDeployment();

	/**
	 * Returns the value of the '<em><b>Dimension Deployment</b></em>' reference list.
	 * The list contents are of type {@link CWM.Olap.DimensionDeployment}.
	 * It is bidirectional and its opposite is '{@link CWM.Olap.DimensionDeployment#getDeploymentGroup <em>Deployment Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimension Deployment</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension Deployment</em>' reference list.
	 * @see CWM.Olap.OlapPackage#getDeploymentGroup_DimensionDeployment()
	 * @see CWM.Olap.DimensionDeployment#getDeploymentGroup
	 * @model opposite="deploymentGroup" ordered="false"
	 * @generated
	 */
	EList<DimensionDeployment> getDimensionDeployment();

} // DeploymentGroup

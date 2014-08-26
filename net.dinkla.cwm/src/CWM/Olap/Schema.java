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
 * A representation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Olap.Schema#getCube <em>Cube</em>}</li>
 *   <li>{@link CWM.Olap.Schema#getDimension <em>Dimension</em>}</li>
 *   <li>{@link CWM.Olap.Schema#getDeploymentGroup <em>Deployment Group</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Olap.OlapPackage#getSchema()
 * @model
 * @generated
 */
public interface Schema extends CWM.Core.Package {
	/**
	 * Returns the value of the '<em><b>Cube</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Olap.Cube}.
	 * It is bidirectional and its opposite is '{@link CWM.Olap.Cube#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cube</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cube</em>' containment reference list.
	 * @see CWM.Olap.OlapPackage#getSchema_Cube()
	 * @see CWM.Olap.Cube#getSchema
	 * @model opposite="schema" containment="true" ordered="false"
	 * @generated
	 */
	EList<Cube> getCube();

	/**
	 * Returns the value of the '<em><b>Dimension</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Olap.Dimension}.
	 * It is bidirectional and its opposite is '{@link CWM.Olap.Dimension#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimension</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension</em>' containment reference list.
	 * @see CWM.Olap.OlapPackage#getSchema_Dimension()
	 * @see CWM.Olap.Dimension#getSchema
	 * @model opposite="schema" containment="true" ordered="false"
	 * @generated
	 */
	EList<Dimension> getDimension();

	/**
	 * Returns the value of the '<em><b>Deployment Group</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Olap.DeploymentGroup}.
	 * It is bidirectional and its opposite is '{@link CWM.Olap.DeploymentGroup#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployment Group</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment Group</em>' containment reference list.
	 * @see CWM.Olap.OlapPackage#getSchema_DeploymentGroup()
	 * @see CWM.Olap.DeploymentGroup#getSchema
	 * @model opposite="schema" containment="true" ordered="false"
	 * @generated
	 */
	EList<DeploymentGroup> getDeploymentGroup();

} // Schema

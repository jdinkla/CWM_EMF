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
 * A representation of the model object '<em><b>Cube Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Olap.CubeRegion#getIsReadOnly <em>Is Read Only</em>}</li>
 *   <li>{@link CWM.Olap.CubeRegion#getIsFullyRealized <em>Is Fully Realized</em>}</li>
 *   <li>{@link CWM.Olap.CubeRegion#getMemberSelectionGroup <em>Member Selection Group</em>}</li>
 *   <li>{@link CWM.Olap.CubeRegion#getCube <em>Cube</em>}</li>
 *   <li>{@link CWM.Olap.CubeRegion#getCubeDeployment <em>Cube Deployment</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Olap.OlapPackage#getCubeRegion()
 * @model
 * @generated
 */
public interface CubeRegion extends CWM.Core.Class {
	/**
	 * Returns the value of the '<em><b>Is Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Read Only</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Read Only</em>' attribute.
	 * @see #setIsReadOnly(Boolean)
	 * @see CWM.Olap.OlapPackage#getCubeRegion_IsReadOnly()
	 * @model unique="false" dataType="CWM.Core.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsReadOnly();

	/**
	 * Sets the value of the '{@link CWM.Olap.CubeRegion#getIsReadOnly <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Read Only</em>' attribute.
	 * @see #getIsReadOnly()
	 * @generated
	 */
	void setIsReadOnly(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Fully Realized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Fully Realized</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Fully Realized</em>' attribute.
	 * @see #setIsFullyRealized(Boolean)
	 * @see CWM.Olap.OlapPackage#getCubeRegion_IsFullyRealized()
	 * @model unique="false" dataType="CWM.Core.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsFullyRealized();

	/**
	 * Sets the value of the '{@link CWM.Olap.CubeRegion#getIsFullyRealized <em>Is Fully Realized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Fully Realized</em>' attribute.
	 * @see #getIsFullyRealized()
	 * @generated
	 */
	void setIsFullyRealized(Boolean value);

	/**
	 * Returns the value of the '<em><b>Member Selection Group</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Olap.MemberSelectionGroup}.
	 * It is bidirectional and its opposite is '{@link CWM.Olap.MemberSelectionGroup#getCubeRegion <em>Cube Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member Selection Group</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Selection Group</em>' containment reference list.
	 * @see CWM.Olap.OlapPackage#getCubeRegion_MemberSelectionGroup()
	 * @see CWM.Olap.MemberSelectionGroup#getCubeRegion
	 * @model opposite="cubeRegion" containment="true" ordered="false"
	 * @generated
	 */
	EList<MemberSelectionGroup> getMemberSelectionGroup();

	/**
	 * Returns the value of the '<em><b>Cube</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link CWM.Olap.Cube#getCubeRegion <em>Cube Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cube</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cube</em>' container reference.
	 * @see #setCube(Cube)
	 * @see CWM.Olap.OlapPackage#getCubeRegion_Cube()
	 * @see CWM.Olap.Cube#getCubeRegion
	 * @model opposite="cubeRegion" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Cube getCube();

	/**
	 * Sets the value of the '{@link CWM.Olap.CubeRegion#getCube <em>Cube</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cube</em>' container reference.
	 * @see #getCube()
	 * @generated
	 */
	void setCube(Cube value);

	/**
	 * Returns the value of the '<em><b>Cube Deployment</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Olap.CubeDeployment}.
	 * It is bidirectional and its opposite is '{@link CWM.Olap.CubeDeployment#getCubeRegion <em>Cube Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cube Deployment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cube Deployment</em>' containment reference list.
	 * @see CWM.Olap.OlapPackage#getCubeRegion_CubeDeployment()
	 * @see CWM.Olap.CubeDeployment#getCubeRegion
	 * @model opposite="cubeRegion" containment="true"
	 * @generated
	 */
	EList<CubeDeployment> getCubeDeployment();

} // CubeRegion

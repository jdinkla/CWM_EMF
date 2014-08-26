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
 * A representation of the model object '<em><b>Structure Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Olap.StructureMap#getDimensionDeployment <em>Dimension Deployment</em>}</li>
 *   <li>{@link CWM.Olap.StructureMap#getDimensionDeploymentLV <em>Dimension Deployment LV</em>}</li>
 *   <li>{@link CWM.Olap.StructureMap#getDimensionDeploymentIP <em>Dimension Deployment IP</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Olap.OlapPackage#getStructureMap()
 * @model
 * @generated
 */
public interface StructureMap extends TransformationMap {
	/**
	 * Returns the value of the '<em><b>Dimension Deployment</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link CWM.Olap.DimensionDeployment#getStructureMap <em>Structure Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimension Deployment</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension Deployment</em>' container reference.
	 * @see #setDimensionDeployment(DimensionDeployment)
	 * @see CWM.Olap.OlapPackage#getStructureMap_DimensionDeployment()
	 * @see CWM.Olap.DimensionDeployment#getStructureMap
	 * @model opposite="structureMap" required="true" transient="false" ordered="false"
	 * @generated
	 */
	DimensionDeployment getDimensionDeployment();

	/**
	 * Sets the value of the '{@link CWM.Olap.StructureMap#getDimensionDeployment <em>Dimension Deployment</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimension Deployment</em>' container reference.
	 * @see #getDimensionDeployment()
	 * @generated
	 */
	void setDimensionDeployment(DimensionDeployment value);

	/**
	 * Returns the value of the '<em><b>Dimension Deployment LV</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CWM.Olap.DimensionDeployment#getListOfValues <em>List Of Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimension Deployment LV</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension Deployment LV</em>' reference.
	 * @see #setDimensionDeploymentLV(DimensionDeployment)
	 * @see CWM.Olap.OlapPackage#getStructureMap_DimensionDeploymentLV()
	 * @see CWM.Olap.DimensionDeployment#getListOfValues
	 * @model opposite="listOfValues" ordered="false"
	 * @generated
	 */
	DimensionDeployment getDimensionDeploymentLV();

	/**
	 * Sets the value of the '{@link CWM.Olap.StructureMap#getDimensionDeploymentLV <em>Dimension Deployment LV</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimension Deployment LV</em>' reference.
	 * @see #getDimensionDeploymentLV()
	 * @generated
	 */
	void setDimensionDeploymentLV(DimensionDeployment value);

	/**
	 * Returns the value of the '<em><b>Dimension Deployment IP</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CWM.Olap.DimensionDeployment#getImmediateParent <em>Immediate Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimension Deployment IP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension Deployment IP</em>' reference.
	 * @see #setDimensionDeploymentIP(DimensionDeployment)
	 * @see CWM.Olap.OlapPackage#getStructureMap_DimensionDeploymentIP()
	 * @see CWM.Olap.DimensionDeployment#getImmediateParent
	 * @model opposite="immediateParent" ordered="false"
	 * @generated
	 */
	DimensionDeployment getDimensionDeploymentIP();

	/**
	 * Sets the value of the '{@link CWM.Olap.StructureMap#getDimensionDeploymentIP <em>Dimension Deployment IP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimension Deployment IP</em>' reference.
	 * @see #getDimensionDeploymentIP()
	 * @generated
	 */
	void setDimensionDeploymentIP(DimensionDeployment value);

} // StructureMap

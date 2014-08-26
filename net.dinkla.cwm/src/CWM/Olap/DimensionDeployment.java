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
 * A representation of the model object '<em><b>Dimension Deployment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Olap.DimensionDeployment#getHierarchyLevelAssociation <em>Hierarchy Level Association</em>}</li>
 *   <li>{@link CWM.Olap.DimensionDeployment#getValueBasedHierarchy <em>Value Based Hierarchy</em>}</li>
 *   <li>{@link CWM.Olap.DimensionDeployment#getStructureMap <em>Structure Map</em>}</li>
 *   <li>{@link CWM.Olap.DimensionDeployment#getListOfValues <em>List Of Values</em>}</li>
 *   <li>{@link CWM.Olap.DimensionDeployment#getImmediateParent <em>Immediate Parent</em>}</li>
 *   <li>{@link CWM.Olap.DimensionDeployment#getDeploymentGroup <em>Deployment Group</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Olap.OlapPackage#getDimensionDeployment()
 * @model
 * @generated
 */
public interface DimensionDeployment extends CWM.Core.Class {
	/**
	 * Returns the value of the '<em><b>Hierarchy Level Association</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link CWM.Olap.HierarchyLevelAssociation#getDimensionDeployment <em>Dimension Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hierarchy Level Association</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hierarchy Level Association</em>' container reference.
	 * @see #setHierarchyLevelAssociation(HierarchyLevelAssociation)
	 * @see CWM.Olap.OlapPackage#getDimensionDeployment_HierarchyLevelAssociation()
	 * @see CWM.Olap.HierarchyLevelAssociation#getDimensionDeployment
	 * @model opposite="dimensionDeployment" transient="false" ordered="false"
	 * @generated
	 */
	HierarchyLevelAssociation getHierarchyLevelAssociation();

	/**
	 * Sets the value of the '{@link CWM.Olap.DimensionDeployment#getHierarchyLevelAssociation <em>Hierarchy Level Association</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hierarchy Level Association</em>' container reference.
	 * @see #getHierarchyLevelAssociation()
	 * @generated
	 */
	void setHierarchyLevelAssociation(HierarchyLevelAssociation value);

	/**
	 * Returns the value of the '<em><b>Value Based Hierarchy</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link CWM.Olap.ValueBasedHierarchy#getDimensionDeployment <em>Dimension Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Based Hierarchy</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Based Hierarchy</em>' container reference.
	 * @see #setValueBasedHierarchy(ValueBasedHierarchy)
	 * @see CWM.Olap.OlapPackage#getDimensionDeployment_ValueBasedHierarchy()
	 * @see CWM.Olap.ValueBasedHierarchy#getDimensionDeployment
	 * @model opposite="dimensionDeployment" transient="false" ordered="false"
	 * @generated
	 */
	ValueBasedHierarchy getValueBasedHierarchy();

	/**
	 * Sets the value of the '{@link CWM.Olap.DimensionDeployment#getValueBasedHierarchy <em>Value Based Hierarchy</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Based Hierarchy</em>' container reference.
	 * @see #getValueBasedHierarchy()
	 * @generated
	 */
	void setValueBasedHierarchy(ValueBasedHierarchy value);

	/**
	 * Returns the value of the '<em><b>Structure Map</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Olap.StructureMap}.
	 * It is bidirectional and its opposite is '{@link CWM.Olap.StructureMap#getDimensionDeployment <em>Dimension Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structure Map</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure Map</em>' containment reference list.
	 * @see CWM.Olap.OlapPackage#getDimensionDeployment_StructureMap()
	 * @see CWM.Olap.StructureMap#getDimensionDeployment
	 * @model opposite="dimensionDeployment" containment="true" ordered="false"
	 * @generated
	 */
	EList<StructureMap> getStructureMap();

	/**
	 * Returns the value of the '<em><b>List Of Values</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CWM.Olap.StructureMap#getDimensionDeploymentLV <em>Dimension Deployment LV</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Of Values</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Values</em>' reference.
	 * @see #setListOfValues(StructureMap)
	 * @see CWM.Olap.OlapPackage#getDimensionDeployment_ListOfValues()
	 * @see CWM.Olap.StructureMap#getDimensionDeploymentLV
	 * @model opposite="dimensionDeploymentLV" ordered="false"
	 * @generated
	 */
	StructureMap getListOfValues();

	/**
	 * Sets the value of the '{@link CWM.Olap.DimensionDeployment#getListOfValues <em>List Of Values</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Of Values</em>' reference.
	 * @see #getListOfValues()
	 * @generated
	 */
	void setListOfValues(StructureMap value);

	/**
	 * Returns the value of the '<em><b>Immediate Parent</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CWM.Olap.StructureMap#getDimensionDeploymentIP <em>Dimension Deployment IP</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Immediate Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Immediate Parent</em>' reference.
	 * @see #setImmediateParent(StructureMap)
	 * @see CWM.Olap.OlapPackage#getDimensionDeployment_ImmediateParent()
	 * @see CWM.Olap.StructureMap#getDimensionDeploymentIP
	 * @model opposite="dimensionDeploymentIP" ordered="false"
	 * @generated
	 */
	StructureMap getImmediateParent();

	/**
	 * Sets the value of the '{@link CWM.Olap.DimensionDeployment#getImmediateParent <em>Immediate Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Immediate Parent</em>' reference.
	 * @see #getImmediateParent()
	 * @generated
	 */
	void setImmediateParent(StructureMap value);

	/**
	 * Returns the value of the '<em><b>Deployment Group</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CWM.Olap.DeploymentGroup#getDimensionDeployment <em>Dimension Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployment Group</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment Group</em>' reference.
	 * @see #setDeploymentGroup(DeploymentGroup)
	 * @see CWM.Olap.OlapPackage#getDimensionDeployment_DeploymentGroup()
	 * @see CWM.Olap.DeploymentGroup#getDimensionDeployment
	 * @model opposite="dimensionDeployment" required="true" ordered="false"
	 * @generated
	 */
	DeploymentGroup getDeploymentGroup();

	/**
	 * Sets the value of the '{@link CWM.Olap.DimensionDeployment#getDeploymentGroup <em>Deployment Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployment Group</em>' reference.
	 * @see #getDeploymentGroup()
	 * @generated
	 */
	void setDeploymentGroup(DeploymentGroup value);

} // DimensionDeployment

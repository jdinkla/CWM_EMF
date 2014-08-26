/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Olap;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Olap container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Olap.Olap_container#getContentMap <em>Content Map</em>}</li>
 *   <li>{@link CWM.Olap.Olap_container#getCube <em>Cube</em>}</li>
 *   <li>{@link CWM.Olap.Olap_container#getCubeDeployment <em>Cube Deployment</em>}</li>
 *   <li>{@link CWM.Olap.Olap_container#getCubeDimensionAssociation <em>Cube Dimension Association</em>}</li>
 *   <li>{@link CWM.Olap.Olap_container#getCubeRegion <em>Cube Region</em>}</li>
 *   <li>{@link CWM.Olap.Olap_container#getDeploymentGroup <em>Deployment Group</em>}</li>
 *   <li>{@link CWM.Olap.Olap_container#getDimension <em>Dimension</em>}</li>
 *   <li>{@link CWM.Olap.Olap_container#getDimensionDeployment <em>Dimension Deployment</em>}</li>
 *   <li>{@link CWM.Olap.Olap_container#getHierarchy <em>Hierarchy</em>}</li>
 *   <li>{@link CWM.Olap.Olap_container#getHierarchyLevelAssociation <em>Hierarchy Level Association</em>}</li>
 *   <li>{@link CWM.Olap.Olap_container#getLevelBasedHierarchy <em>Level Based Hierarchy</em>}</li>
 *   <li>{@link CWM.Olap.Olap_container#getMemberSelectionGroup <em>Member Selection Group</em>}</li>
 *   <li>{@link CWM.Olap.Olap_container#getMemberSelection <em>Member Selection</em>}</li>
 *   <li>{@link CWM.Olap.Olap_container#getSchema <em>Schema</em>}</li>
 *   <li>{@link CWM.Olap.Olap_container#getValueBasedHierarchy <em>Value Based Hierarchy</em>}</li>
 *   <li>{@link CWM.Olap.Olap_container#getLevel <em>Level</em>}</li>
 *   <li>{@link CWM.Olap.Olap_container#getCodedLevel <em>Coded Level</em>}</li>
 *   <li>{@link CWM.Olap.Olap_container#getMeasure <em>Measure</em>}</li>
 *   <li>{@link CWM.Olap.Olap_container#getStructureMap <em>Structure Map</em>}</li>
 *   <li>{@link CWM.Olap.Olap_container#getHierarchyMemberSelectionGroup <em>Hierarchy Member Selection Group</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Olap.OlapPackage#getOlap_container()
 * @model
 * @generated
 */
public interface Olap_container extends EObject {
	/**
	 * Returns the value of the '<em><b>Content Map</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Olap.ContentMap}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Map</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Map</em>' containment reference list.
	 * @see CWM.Olap.OlapPackage#getOlap_container_ContentMap()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContentMap> getContentMap();

	/**
	 * Returns the value of the '<em><b>Cube</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Olap.Cube}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cube</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cube</em>' containment reference list.
	 * @see CWM.Olap.OlapPackage#getOlap_container_Cube()
	 * @model containment="true"
	 * @generated
	 */
	EList<Cube> getCube();

	/**
	 * Returns the value of the '<em><b>Cube Deployment</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Olap.CubeDeployment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cube Deployment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cube Deployment</em>' containment reference list.
	 * @see CWM.Olap.OlapPackage#getOlap_container_CubeDeployment()
	 * @model containment="true"
	 * @generated
	 */
	EList<CubeDeployment> getCubeDeployment();

	/**
	 * Returns the value of the '<em><b>Cube Dimension Association</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Olap.CubeDimensionAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cube Dimension Association</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cube Dimension Association</em>' containment reference list.
	 * @see CWM.Olap.OlapPackage#getOlap_container_CubeDimensionAssociation()
	 * @model containment="true"
	 * @generated
	 */
	EList<CubeDimensionAssociation> getCubeDimensionAssociation();

	/**
	 * Returns the value of the '<em><b>Cube Region</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Olap.CubeRegion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cube Region</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cube Region</em>' containment reference list.
	 * @see CWM.Olap.OlapPackage#getOlap_container_CubeRegion()
	 * @model containment="true"
	 * @generated
	 */
	EList<CubeRegion> getCubeRegion();

	/**
	 * Returns the value of the '<em><b>Deployment Group</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Olap.DeploymentGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployment Group</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment Group</em>' containment reference list.
	 * @see CWM.Olap.OlapPackage#getOlap_container_DeploymentGroup()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeploymentGroup> getDeploymentGroup();

	/**
	 * Returns the value of the '<em><b>Dimension</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Olap.Dimension}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimension</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension</em>' containment reference list.
	 * @see CWM.Olap.OlapPackage#getOlap_container_Dimension()
	 * @model containment="true"
	 * @generated
	 */
	EList<Dimension> getDimension();

	/**
	 * Returns the value of the '<em><b>Dimension Deployment</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Olap.DimensionDeployment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimension Deployment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension Deployment</em>' containment reference list.
	 * @see CWM.Olap.OlapPackage#getOlap_container_DimensionDeployment()
	 * @model containment="true"
	 * @generated
	 */
	EList<DimensionDeployment> getDimensionDeployment();

	/**
	 * Returns the value of the '<em><b>Hierarchy</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Olap.Hierarchy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hierarchy</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hierarchy</em>' containment reference list.
	 * @see CWM.Olap.OlapPackage#getOlap_container_Hierarchy()
	 * @model containment="true"
	 * @generated
	 */
	EList<Hierarchy> getHierarchy();

	/**
	 * Returns the value of the '<em><b>Hierarchy Level Association</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Olap.HierarchyLevelAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hierarchy Level Association</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hierarchy Level Association</em>' containment reference list.
	 * @see CWM.Olap.OlapPackage#getOlap_container_HierarchyLevelAssociation()
	 * @model containment="true"
	 * @generated
	 */
	EList<HierarchyLevelAssociation> getHierarchyLevelAssociation();

	/**
	 * Returns the value of the '<em><b>Level Based Hierarchy</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Olap.LevelBasedHierarchy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level Based Hierarchy</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level Based Hierarchy</em>' containment reference list.
	 * @see CWM.Olap.OlapPackage#getOlap_container_LevelBasedHierarchy()
	 * @model containment="true"
	 * @generated
	 */
	EList<LevelBasedHierarchy> getLevelBasedHierarchy();

	/**
	 * Returns the value of the '<em><b>Member Selection Group</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Olap.MemberSelectionGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member Selection Group</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Selection Group</em>' containment reference list.
	 * @see CWM.Olap.OlapPackage#getOlap_container_MemberSelectionGroup()
	 * @model containment="true"
	 * @generated
	 */
	EList<MemberSelectionGroup> getMemberSelectionGroup();

	/**
	 * Returns the value of the '<em><b>Member Selection</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Olap.MemberSelection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member Selection</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Selection</em>' containment reference list.
	 * @see CWM.Olap.OlapPackage#getOlap_container_MemberSelection()
	 * @model containment="true"
	 * @generated
	 */
	EList<MemberSelection> getMemberSelection();

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Olap.Schema}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' containment reference list.
	 * @see CWM.Olap.OlapPackage#getOlap_container_Schema()
	 * @model containment="true"
	 * @generated
	 */
	EList<Schema> getSchema();

	/**
	 * Returns the value of the '<em><b>Value Based Hierarchy</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Olap.ValueBasedHierarchy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Based Hierarchy</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Based Hierarchy</em>' containment reference list.
	 * @see CWM.Olap.OlapPackage#getOlap_container_ValueBasedHierarchy()
	 * @model containment="true"
	 * @generated
	 */
	EList<ValueBasedHierarchy> getValueBasedHierarchy();

	/**
	 * Returns the value of the '<em><b>Level</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Olap.Level}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' containment reference list.
	 * @see CWM.Olap.OlapPackage#getOlap_container_Level()
	 * @model containment="true"
	 * @generated
	 */
	EList<Level> getLevel();

	/**
	 * Returns the value of the '<em><b>Coded Level</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Olap.CodedLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coded Level</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coded Level</em>' containment reference list.
	 * @see CWM.Olap.OlapPackage#getOlap_container_CodedLevel()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodedLevel> getCodedLevel();

	/**
	 * Returns the value of the '<em><b>Measure</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Olap.Measure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measure</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure</em>' containment reference list.
	 * @see CWM.Olap.OlapPackage#getOlap_container_Measure()
	 * @model containment="true"
	 * @generated
	 */
	EList<Measure> getMeasure();

	/**
	 * Returns the value of the '<em><b>Structure Map</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Olap.StructureMap}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structure Map</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure Map</em>' containment reference list.
	 * @see CWM.Olap.OlapPackage#getOlap_container_StructureMap()
	 * @model containment="true"
	 * @generated
	 */
	EList<StructureMap> getStructureMap();

	/**
	 * Returns the value of the '<em><b>Hierarchy Member Selection Group</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Olap.HierarchyMemberSelectionGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hierarchy Member Selection Group</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hierarchy Member Selection Group</em>' containment reference list.
	 * @see CWM.Olap.OlapPackage#getOlap_container_HierarchyMemberSelectionGroup()
	 * @model containment="true"
	 * @generated
	 */
	EList<HierarchyMemberSelectionGroup> getHierarchyMemberSelectionGroup();

} // Olap_container

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
 * A representation of the model object '<em><b>Hierarchy Level Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Olap.HierarchyLevelAssociation#getLevelBasedHierarchy <em>Level Based Hierarchy</em>}</li>
 *   <li>{@link CWM.Olap.HierarchyLevelAssociation#getCurrentLevel <em>Current Level</em>}</li>
 *   <li>{@link CWM.Olap.HierarchyLevelAssociation#getDimensionDeployment <em>Dimension Deployment</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Olap.OlapPackage#getHierarchyLevelAssociation()
 * @model
 * @generated
 */
public interface HierarchyLevelAssociation extends CWM.Core.Class {
	/**
	 * Returns the value of the '<em><b>Level Based Hierarchy</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link CWM.Olap.LevelBasedHierarchy#getHierarchyLevelAssociation <em>Hierarchy Level Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level Based Hierarchy</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level Based Hierarchy</em>' container reference.
	 * @see #setLevelBasedHierarchy(LevelBasedHierarchy)
	 * @see CWM.Olap.OlapPackage#getHierarchyLevelAssociation_LevelBasedHierarchy()
	 * @see CWM.Olap.LevelBasedHierarchy#getHierarchyLevelAssociation
	 * @model opposite="hierarchyLevelAssociation" required="true" transient="false" ordered="false"
	 * @generated
	 */
	LevelBasedHierarchy getLevelBasedHierarchy();

	/**
	 * Sets the value of the '{@link CWM.Olap.HierarchyLevelAssociation#getLevelBasedHierarchy <em>Level Based Hierarchy</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level Based Hierarchy</em>' container reference.
	 * @see #getLevelBasedHierarchy()
	 * @generated
	 */
	void setLevelBasedHierarchy(LevelBasedHierarchy value);

	/**
	 * Returns the value of the '<em><b>Current Level</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CWM.Olap.Level#getHierarchyLevelAssociation <em>Hierarchy Level Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Level</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Level</em>' reference.
	 * @see #setCurrentLevel(Level)
	 * @see CWM.Olap.OlapPackage#getHierarchyLevelAssociation_CurrentLevel()
	 * @see CWM.Olap.Level#getHierarchyLevelAssociation
	 * @model opposite="hierarchyLevelAssociation" required="true" ordered="false"
	 * @generated
	 */
	Level getCurrentLevel();

	/**
	 * Sets the value of the '{@link CWM.Olap.HierarchyLevelAssociation#getCurrentLevel <em>Current Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Level</em>' reference.
	 * @see #getCurrentLevel()
	 * @generated
	 */
	void setCurrentLevel(Level value);

	/**
	 * Returns the value of the '<em><b>Dimension Deployment</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Olap.DimensionDeployment}.
	 * It is bidirectional and its opposite is '{@link CWM.Olap.DimensionDeployment#getHierarchyLevelAssociation <em>Hierarchy Level Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimension Deployment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension Deployment</em>' containment reference list.
	 * @see CWM.Olap.OlapPackage#getHierarchyLevelAssociation_DimensionDeployment()
	 * @see CWM.Olap.DimensionDeployment#getHierarchyLevelAssociation
	 * @model opposite="hierarchyLevelAssociation" containment="true"
	 * @generated
	 */
	EList<DimensionDeployment> getDimensionDeployment();

} // HierarchyLevelAssociation

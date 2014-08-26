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
 * A representation of the model object '<em><b>Level Based Hierarchy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Olap.LevelBasedHierarchy#getHierarchyLevelAssociation <em>Hierarchy Level Association</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Olap.OlapPackage#getLevelBasedHierarchy()
 * @model
 * @generated
 */
public interface LevelBasedHierarchy extends Hierarchy {
	/**
	 * Returns the value of the '<em><b>Hierarchy Level Association</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Olap.HierarchyLevelAssociation}.
	 * It is bidirectional and its opposite is '{@link CWM.Olap.HierarchyLevelAssociation#getLevelBasedHierarchy <em>Level Based Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hierarchy Level Association</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hierarchy Level Association</em>' containment reference list.
	 * @see CWM.Olap.OlapPackage#getLevelBasedHierarchy_HierarchyLevelAssociation()
	 * @see CWM.Olap.HierarchyLevelAssociation#getLevelBasedHierarchy
	 * @model opposite="levelBasedHierarchy" containment="true"
	 * @generated
	 */
	EList<HierarchyLevelAssociation> getHierarchyLevelAssociation();

} // LevelBasedHierarchy

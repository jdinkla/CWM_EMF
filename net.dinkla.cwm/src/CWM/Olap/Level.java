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
 * A representation of the model object '<em><b>Level</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Olap.Level#getHierarchyLevelAssociation <em>Hierarchy Level Association</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Olap.OlapPackage#getLevel()
 * @model
 * @generated
 */
public interface Level extends MemberSelection {
	/**
	 * Returns the value of the '<em><b>Hierarchy Level Association</b></em>' reference list.
	 * The list contents are of type {@link CWM.Olap.HierarchyLevelAssociation}.
	 * It is bidirectional and its opposite is '{@link CWM.Olap.HierarchyLevelAssociation#getCurrentLevel <em>Current Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hierarchy Level Association</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hierarchy Level Association</em>' reference list.
	 * @see CWM.Olap.OlapPackage#getLevel_HierarchyLevelAssociation()
	 * @see CWM.Olap.HierarchyLevelAssociation#getCurrentLevel
	 * @model opposite="currentLevel" ordered="false"
	 * @generated
	 */
	EList<HierarchyLevelAssociation> getHierarchyLevelAssociation();

} // Level

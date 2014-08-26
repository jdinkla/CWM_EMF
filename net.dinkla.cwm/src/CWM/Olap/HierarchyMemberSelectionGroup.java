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
 * A representation of the model object '<em><b>Hierarchy Member Selection Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Olap.HierarchyMemberSelectionGroup#getHierarchy <em>Hierarchy</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Olap.OlapPackage#getHierarchyMemberSelectionGroup()
 * @model
 * @generated
 */
public interface HierarchyMemberSelectionGroup extends MemberSelectionGroup {
	/**
	 * Returns the value of the '<em><b>Hierarchy</b></em>' reference list.
	 * The list contents are of type {@link CWM.Olap.Hierarchy}.
	 * It is bidirectional and its opposite is '{@link CWM.Olap.Hierarchy#getHierarchyMemberSelectionGroup <em>Hierarchy Member Selection Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hierarchy</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hierarchy</em>' reference list.
	 * @see CWM.Olap.OlapPackage#getHierarchyMemberSelectionGroup_Hierarchy()
	 * @see CWM.Olap.Hierarchy#getHierarchyMemberSelectionGroup
	 * @model opposite="hierarchyMemberSelectionGroup" required="true" ordered="false"
	 * @generated
	 */
	EList<Hierarchy> getHierarchy();

} // HierarchyMemberSelectionGroup

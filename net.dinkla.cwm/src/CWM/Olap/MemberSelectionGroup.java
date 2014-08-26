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
 * A representation of the model object '<em><b>Member Selection Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Olap.MemberSelectionGroup#getMemberSelection <em>Member Selection</em>}</li>
 *   <li>{@link CWM.Olap.MemberSelectionGroup#getCubeRegion <em>Cube Region</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Olap.OlapPackage#getMemberSelectionGroup()
 * @model
 * @generated
 */
public interface MemberSelectionGroup extends CWM.Core.Class {
	/**
	 * Returns the value of the '<em><b>Member Selection</b></em>' reference list.
	 * The list contents are of type {@link CWM.Olap.MemberSelection}.
	 * It is bidirectional and its opposite is '{@link CWM.Olap.MemberSelection#getMemberSelectionGroup <em>Member Selection Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member Selection</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Selection</em>' reference list.
	 * @see CWM.Olap.OlapPackage#getMemberSelectionGroup_MemberSelection()
	 * @see CWM.Olap.MemberSelection#getMemberSelectionGroup
	 * @model opposite="memberSelectionGroup" required="true" ordered="false"
	 * @generated
	 */
	EList<MemberSelection> getMemberSelection();

	/**
	 * Returns the value of the '<em><b>Cube Region</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link CWM.Olap.CubeRegion#getMemberSelectionGroup <em>Member Selection Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cube Region</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cube Region</em>' container reference.
	 * @see #setCubeRegion(CubeRegion)
	 * @see CWM.Olap.OlapPackage#getMemberSelectionGroup_CubeRegion()
	 * @see CWM.Olap.CubeRegion#getMemberSelectionGroup
	 * @model opposite="memberSelectionGroup" required="true" transient="false" ordered="false"
	 * @generated
	 */
	CubeRegion getCubeRegion();

	/**
	 * Sets the value of the '{@link CWM.Olap.MemberSelectionGroup#getCubeRegion <em>Cube Region</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cube Region</em>' container reference.
	 * @see #getCubeRegion()
	 * @generated
	 */
	void setCubeRegion(CubeRegion value);

} // MemberSelectionGroup

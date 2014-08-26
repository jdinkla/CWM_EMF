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
 * A representation of the model object '<em><b>Member Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Olap.MemberSelection#getDimension <em>Dimension</em>}</li>
 *   <li>{@link CWM.Olap.MemberSelection#getMemberSelectionGroup <em>Member Selection Group</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Olap.OlapPackage#getMemberSelection()
 * @model
 * @generated
 */
public interface MemberSelection extends CWM.Core.Class {
	/**
	 * Returns the value of the '<em><b>Dimension</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link CWM.Olap.Dimension#getMemberSelection <em>Member Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimension</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension</em>' container reference.
	 * @see #setDimension(Dimension)
	 * @see CWM.Olap.OlapPackage#getMemberSelection_Dimension()
	 * @see CWM.Olap.Dimension#getMemberSelection
	 * @model opposite="memberSelection" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Dimension getDimension();

	/**
	 * Sets the value of the '{@link CWM.Olap.MemberSelection#getDimension <em>Dimension</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimension</em>' container reference.
	 * @see #getDimension()
	 * @generated
	 */
	void setDimension(Dimension value);

	/**
	 * Returns the value of the '<em><b>Member Selection Group</b></em>' reference list.
	 * The list contents are of type {@link CWM.Olap.MemberSelectionGroup}.
	 * It is bidirectional and its opposite is '{@link CWM.Olap.MemberSelectionGroup#getMemberSelection <em>Member Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member Selection Group</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Selection Group</em>' reference list.
	 * @see CWM.Olap.OlapPackage#getMemberSelection_MemberSelectionGroup()
	 * @see CWM.Olap.MemberSelectionGroup#getMemberSelection
	 * @model opposite="memberSelection" ordered="false"
	 * @generated
	 */
	EList<MemberSelectionGroup> getMemberSelectionGroup();

} // MemberSelection

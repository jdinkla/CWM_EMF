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
 * A representation of the model object '<em><b>Hierarchy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Olap.Hierarchy#getDimension <em>Dimension</em>}</li>
 *   <li>{@link CWM.Olap.Hierarchy#getCubeDimensionAssociation <em>Cube Dimension Association</em>}</li>
 *   <li>{@link CWM.Olap.Hierarchy#getDefaultedDimension <em>Defaulted Dimension</em>}</li>
 *   <li>{@link CWM.Olap.Hierarchy#getHierarchyMemberSelectionGroup <em>Hierarchy Member Selection Group</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Olap.OlapPackage#getHierarchy()
 * @model abstract="true"
 * @generated
 */
public interface Hierarchy extends CWM.Core.Class {
	/**
	 * Returns the value of the '<em><b>Dimension</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link CWM.Olap.Dimension#getHierarchy <em>Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimension</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension</em>' container reference.
	 * @see #setDimension(Dimension)
	 * @see CWM.Olap.OlapPackage#getHierarchy_Dimension()
	 * @see CWM.Olap.Dimension#getHierarchy
	 * @model opposite="hierarchy" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Dimension getDimension();

	/**
	 * Sets the value of the '{@link CWM.Olap.Hierarchy#getDimension <em>Dimension</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimension</em>' container reference.
	 * @see #getDimension()
	 * @generated
	 */
	void setDimension(Dimension value);

	/**
	 * Returns the value of the '<em><b>Cube Dimension Association</b></em>' reference list.
	 * The list contents are of type {@link CWM.Olap.CubeDimensionAssociation}.
	 * It is bidirectional and its opposite is '{@link CWM.Olap.CubeDimensionAssociation#getCalcHierarchy <em>Calc Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cube Dimension Association</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cube Dimension Association</em>' reference list.
	 * @see CWM.Olap.OlapPackage#getHierarchy_CubeDimensionAssociation()
	 * @see CWM.Olap.CubeDimensionAssociation#getCalcHierarchy
	 * @model opposite="calcHierarchy" ordered="false"
	 * @generated
	 */
	EList<CubeDimensionAssociation> getCubeDimensionAssociation();

	/**
	 * Returns the value of the '<em><b>Defaulted Dimension</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CWM.Olap.Dimension#getDisplayDefault <em>Display Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defaulted Dimension</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defaulted Dimension</em>' reference.
	 * @see #setDefaultedDimension(Dimension)
	 * @see CWM.Olap.OlapPackage#getHierarchy_DefaultedDimension()
	 * @see CWM.Olap.Dimension#getDisplayDefault
	 * @model opposite="displayDefault" ordered="false"
	 * @generated
	 */
	Dimension getDefaultedDimension();

	/**
	 * Sets the value of the '{@link CWM.Olap.Hierarchy#getDefaultedDimension <em>Defaulted Dimension</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defaulted Dimension</em>' reference.
	 * @see #getDefaultedDimension()
	 * @generated
	 */
	void setDefaultedDimension(Dimension value);

	/**
	 * Returns the value of the '<em><b>Hierarchy Member Selection Group</b></em>' reference list.
	 * The list contents are of type {@link CWM.Olap.HierarchyMemberSelectionGroup}.
	 * It is bidirectional and its opposite is '{@link CWM.Olap.HierarchyMemberSelectionGroup#getHierarchy <em>Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hierarchy Member Selection Group</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hierarchy Member Selection Group</em>' reference list.
	 * @see CWM.Olap.OlapPackage#getHierarchy_HierarchyMemberSelectionGroup()
	 * @see CWM.Olap.HierarchyMemberSelectionGroup#getHierarchy
	 * @model opposite="hierarchy" ordered="false"
	 * @generated
	 */
	EList<HierarchyMemberSelectionGroup> getHierarchyMemberSelectionGroup();

} // Hierarchy

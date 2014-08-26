/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Multidimensional;

import CWM.CwmInstance.Extent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Member Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Multidimensional.MemberSet#getDimension <em>Dimension</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Multidimensional.MultidimensionalPackage#getMemberSet()
 * @model
 * @generated
 */
public interface MemberSet extends Extent {
	/**
	 * Returns the value of the '<em><b>Dimension</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link CWM.Multidimensional.Dimension#getMemberSet <em>Member Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimension</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension</em>' container reference.
	 * @see #setDimension(Dimension)
	 * @see CWM.Multidimensional.MultidimensionalPackage#getMemberSet_Dimension()
	 * @see CWM.Multidimensional.Dimension#getMemberSet
	 * @model opposite="memberSet" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Dimension getDimension();

	/**
	 * Sets the value of the '{@link CWM.Multidimensional.MemberSet#getDimension <em>Dimension</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimension</em>' container reference.
	 * @see #getDimension()
	 * @generated
	 */
	void setDimension(Dimension value);

} // MemberSet

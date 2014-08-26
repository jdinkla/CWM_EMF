/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplicity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Core.Multiplicity#getRange <em>Range</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Core.CorePackage#getMultiplicity()
 * @model
 * @generated
 */
public interface Multiplicity extends Element {
	/**
	 * Returns the value of the '<em><b>Range</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Core.MultiplicityRange}.
	 * It is bidirectional and its opposite is '{@link CWM.Core.MultiplicityRange#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' containment reference list.
	 * @see CWM.Core.CorePackage#getMultiplicity_Range()
	 * @see CWM.Core.MultiplicityRange#getMultiplicity
	 * @model opposite="multiplicity" containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<MultiplicityRange> getRange();

} // Multiplicity

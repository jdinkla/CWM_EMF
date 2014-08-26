/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.CwmInstance;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.CwmInstance.Object#getSlot <em>Slot</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.CwmInstance.CwmInstancePackage#getObject()
 * @model
 * @generated
 */
public interface Object extends Instance {
	/**
	 * Returns the value of the '<em><b>Slot</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.CwmInstance.Slot}.
	 * It is bidirectional and its opposite is '{@link CWM.CwmInstance.Slot#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slot</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slot</em>' containment reference list.
	 * @see CWM.CwmInstance.CwmInstancePackage#getObject_Slot()
	 * @see CWM.CwmInstance.Slot#getObject
	 * @model opposite="object" containment="true" ordered="false"
	 * @generated
	 */
	EList<Slot> getSlot();

} // Object

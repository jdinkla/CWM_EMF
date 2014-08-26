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
 * A representation of the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Core.Namespace#getOwnedElement <em>Owned Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Core.CorePackage#getNamespace()
 * @model abstract="true"
 * @generated
 */
public interface Namespace extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Owned Element</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Core.ModelElement}.
	 * It is bidirectional and its opposite is '{@link CWM.Core.ModelElement#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Element</em>' containment reference list.
	 * @see CWM.Core.CorePackage#getNamespace_OwnedElement()
	 * @see CWM.Core.ModelElement#getNamespace
	 * @model opposite="namespace" containment="true" ordered="false"
	 * @generated
	 */
	EList<ModelElement> getOwnedElement();

} // Namespace

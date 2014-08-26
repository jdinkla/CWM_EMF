/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.AttributeImportance;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Importance container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.AttributeImportance.AttributeImportance_container#getAttributeImportanceSettings <em>Attribute Importance Settings</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.AttributeImportance.AttributeImportancePackage#getAttributeImportance_container()
 * @model
 * @generated
 */
public interface AttributeImportance_container extends EObject {
	/**
	 * Returns the value of the '<em><b>Attribute Importance Settings</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.AttributeImportance.AttributeImportanceSettings}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Importance Settings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Importance Settings</em>' containment reference list.
	 * @see CWM.AttributeImportance.AttributeImportancePackage#getAttributeImportance_container_AttributeImportanceSettings()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeImportanceSettings> getAttributeImportanceSettings();

} // AttributeImportance_container

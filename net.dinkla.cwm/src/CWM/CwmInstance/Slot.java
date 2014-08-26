/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.CwmInstance;

import CWM.Core.ModelElement;
import CWM.Core.StructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.CwmInstance.Slot#getObject <em>Object</em>}</li>
 *   <li>{@link CWM.CwmInstance.Slot#getValue <em>Value</em>}</li>
 *   <li>{@link CWM.CwmInstance.Slot#getFeature <em>Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.CwmInstance.CwmInstancePackage#getSlot()
 * @model
 * @generated
 */
public interface Slot extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Object</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link CWM.CwmInstance.Object#getSlot <em>Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' container reference.
	 * @see #setObject(CWM.CwmInstance.Object)
	 * @see CWM.CwmInstance.CwmInstancePackage#getSlot_Object()
	 * @see CWM.CwmInstance.Object#getSlot
	 * @model opposite="slot" transient="false" ordered="false"
	 * @generated
	 */
	CWM.CwmInstance.Object getObject();

	/**
	 * Sets the value of the '{@link CWM.CwmInstance.Slot#getObject <em>Object</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' container reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(CWM.CwmInstance.Object value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(Instance)
	 * @see CWM.CwmInstance.CwmInstancePackage#getSlot_Value()
	 * @model ordered="false"
	 * @generated
	 */
	Instance getValue();

	/**
	 * Sets the value of the '{@link CWM.CwmInstance.Slot#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Instance value);

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(StructuralFeature)
	 * @see CWM.CwmInstance.CwmInstancePackage#getSlot_Feature()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	StructuralFeature getFeature();

	/**
	 * Sets the value of the '{@link CWM.CwmInstance.Slot#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(StructuralFeature value);

} // Slot

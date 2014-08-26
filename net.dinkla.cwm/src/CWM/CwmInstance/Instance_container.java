/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.CwmInstance;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.CwmInstance.Instance_container#getDataSlot <em>Data Slot</em>}</li>
 *   <li>{@link CWM.CwmInstance.Instance_container#getDataValue <em>Data Value</em>}</li>
 *   <li>{@link CWM.CwmInstance.Instance_container#getExtent <em>Extent</em>}</li>
 *   <li>{@link CWM.CwmInstance.Instance_container#getInstance <em>Instance</em>}</li>
 *   <li>{@link CWM.CwmInstance.Instance_container#getObject <em>Object</em>}</li>
 *   <li>{@link CWM.CwmInstance.Instance_container#getSlot <em>Slot</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.CwmInstance.CwmInstancePackage#getInstance_container()
 * @model
 * @generated
 */
public interface Instance_container extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Slot</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.CwmInstance.DataSlot}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Slot</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Slot</em>' containment reference list.
	 * @see CWM.CwmInstance.CwmInstancePackage#getInstance_container_DataSlot()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataSlot> getDataSlot();

	/**
	 * Returns the value of the '<em><b>Data Value</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.CwmInstance.DataValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Value</em>' containment reference list.
	 * @see CWM.CwmInstance.CwmInstancePackage#getInstance_container_DataValue()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataValue> getDataValue();

	/**
	 * Returns the value of the '<em><b>Extent</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.CwmInstance.Extent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extent</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extent</em>' containment reference list.
	 * @see CWM.CwmInstance.CwmInstancePackage#getInstance_container_Extent()
	 * @model containment="true"
	 * @generated
	 */
	EList<Extent> getExtent();

	/**
	 * Returns the value of the '<em><b>Instance</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.CwmInstance.Instance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance</em>' containment reference list.
	 * @see CWM.CwmInstance.CwmInstancePackage#getInstance_container_Instance()
	 * @model containment="true"
	 * @generated
	 */
	EList<Instance> getInstance();

	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.CwmInstance.Object}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' containment reference list.
	 * @see CWM.CwmInstance.CwmInstancePackage#getInstance_container_Object()
	 * @model containment="true"
	 * @generated
	 */
	EList<CWM.CwmInstance.Object> getObject();

	/**
	 * Returns the value of the '<em><b>Slot</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.CwmInstance.Slot}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slot</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slot</em>' containment reference list.
	 * @see CWM.CwmInstance.CwmInstancePackage#getInstance_container_Slot()
	 * @model containment="true"
	 * @generated
	 */
	EList<Slot> getSlot();

} // Instance_container

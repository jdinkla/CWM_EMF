/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.WarehouseProcess;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Warehouse Process container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.WarehouseProcess.WarehouseProcess_container#getWarehouseProcess <em>Warehouse Process</em>}</li>
 *   <li>{@link CWM.WarehouseProcess.WarehouseProcess_container#getWarehouseStep <em>Warehouse Step</em>}</li>
 *   <li>{@link CWM.WarehouseProcess.WarehouseProcess_container#getProcessPackage <em>Process Package</em>}</li>
 *   <li>{@link CWM.WarehouseProcess.WarehouseProcess_container#getWarehouseActivity <em>Warehouse Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.WarehouseProcess.WarehouseProcessPackage#getWarehouseProcess_container()
 * @model
 * @generated
 */
public interface WarehouseProcess_container extends EObject {
	/**
	 * Returns the value of the '<em><b>Warehouse Process</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.WarehouseProcess.WarehouseProcess}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Warehouse Process</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Warehouse Process</em>' containment reference list.
	 * @see CWM.WarehouseProcess.WarehouseProcessPackage#getWarehouseProcess_container_WarehouseProcess()
	 * @model containment="true"
	 * @generated
	 */
	EList<WarehouseProcess> getWarehouseProcess();

	/**
	 * Returns the value of the '<em><b>Warehouse Step</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.WarehouseProcess.WarehouseStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Warehouse Step</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Warehouse Step</em>' containment reference list.
	 * @see CWM.WarehouseProcess.WarehouseProcessPackage#getWarehouseProcess_container_WarehouseStep()
	 * @model containment="true"
	 * @generated
	 */
	EList<WarehouseStep> getWarehouseStep();

	/**
	 * Returns the value of the '<em><b>Process Package</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.WarehouseProcess.ProcessPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Package</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Package</em>' containment reference list.
	 * @see CWM.WarehouseProcess.WarehouseProcessPackage#getWarehouseProcess_container_ProcessPackage()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProcessPackage> getProcessPackage();

	/**
	 * Returns the value of the '<em><b>Warehouse Activity</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.WarehouseProcess.WarehouseActivity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Warehouse Activity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Warehouse Activity</em>' containment reference list.
	 * @see CWM.WarehouseProcess.WarehouseProcessPackage#getWarehouseProcess_container_WarehouseActivity()
	 * @model containment="true"
	 * @generated
	 */
	EList<WarehouseActivity> getWarehouseActivity();

} // WarehouseProcess_container

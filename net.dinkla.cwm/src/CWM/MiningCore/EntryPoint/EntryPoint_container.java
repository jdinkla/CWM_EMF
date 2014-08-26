/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.EntryPoint;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry Point container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.MiningCore.EntryPoint.EntryPoint_container#getAuxiliaryObject <em>Auxiliary Object</em>}</li>
 *   <li>{@link CWM.MiningCore.EntryPoint.EntryPoint_container#getCatalog <em>Catalog</em>}</li>
 *   <li>{@link CWM.MiningCore.EntryPoint.EntryPoint_container#getSchema <em>Schema</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.MiningCore.EntryPoint.EntryPointPackage#getEntryPoint_container()
 * @model
 * @generated
 */
public interface EntryPoint_container extends EObject {
	/**
	 * Returns the value of the '<em><b>Auxiliary Object</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.MiningCore.EntryPoint.AuxiliaryObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auxiliary Object</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auxiliary Object</em>' containment reference list.
	 * @see CWM.MiningCore.EntryPoint.EntryPointPackage#getEntryPoint_container_AuxiliaryObject()
	 * @model containment="true"
	 * @generated
	 */
	EList<AuxiliaryObject> getAuxiliaryObject();

	/**
	 * Returns the value of the '<em><b>Catalog</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.MiningCore.EntryPoint.Catalog}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Catalog</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catalog</em>' containment reference list.
	 * @see CWM.MiningCore.EntryPoint.EntryPointPackage#getEntryPoint_container_Catalog()
	 * @model containment="true"
	 * @generated
	 */
	EList<Catalog> getCatalog();

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.MiningCore.EntryPoint.Schema}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' containment reference list.
	 * @see CWM.MiningCore.EntryPoint.EntryPointPackage#getEntryPoint_container_Schema()
	 * @model containment="true"
	 * @generated
	 */
	EList<Schema> getSchema();

} // EntryPoint_container

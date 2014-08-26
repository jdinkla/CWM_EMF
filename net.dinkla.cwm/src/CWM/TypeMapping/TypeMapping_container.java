/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.TypeMapping;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Mapping container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.TypeMapping.TypeMapping_container#getTypeMapping <em>Type Mapping</em>}</li>
 *   <li>{@link CWM.TypeMapping.TypeMapping_container#getTypeSystem <em>Type System</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.TypeMapping.TypeMappingPackage#getTypeMapping_container()
 * @model
 * @generated
 */
public interface TypeMapping_container extends EObject {
	/**
	 * Returns the value of the '<em><b>Type Mapping</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.TypeMapping.TypeMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Mapping</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Mapping</em>' containment reference list.
	 * @see CWM.TypeMapping.TypeMappingPackage#getTypeMapping_container_TypeMapping()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeMapping> getTypeMapping();

	/**
	 * Returns the value of the '<em><b>Type System</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.TypeMapping.TypeSystem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type System</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type System</em>' containment reference list.
	 * @see CWM.TypeMapping.TypeMappingPackage#getTypeMapping_container_TypeSystem()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeSystem> getTypeSystem();

} // TypeMapping_container

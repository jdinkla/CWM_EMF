/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Multidimensional;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multidimensional container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Multidimensional.Multidimensional_container#getDimension <em>Dimension</em>}</li>
 *   <li>{@link CWM.Multidimensional.Multidimensional_container#getDimensionedObject <em>Dimensioned Object</em>}</li>
 *   <li>{@link CWM.Multidimensional.Multidimensional_container#getMember <em>Member</em>}</li>
 *   <li>{@link CWM.Multidimensional.Multidimensional_container#getMemberSet <em>Member Set</em>}</li>
 *   <li>{@link CWM.Multidimensional.Multidimensional_container#getMemberValue <em>Member Value</em>}</li>
 *   <li>{@link CWM.Multidimensional.Multidimensional_container#getSchema <em>Schema</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Multidimensional.MultidimensionalPackage#getMultidimensional_container()
 * @model
 * @generated
 */
public interface Multidimensional_container extends EObject {
	/**
	 * Returns the value of the '<em><b>Dimension</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Multidimensional.Dimension}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimension</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension</em>' containment reference list.
	 * @see CWM.Multidimensional.MultidimensionalPackage#getMultidimensional_container_Dimension()
	 * @model containment="true"
	 * @generated
	 */
	EList<Dimension> getDimension();

	/**
	 * Returns the value of the '<em><b>Dimensioned Object</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Multidimensional.DimensionedObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimensioned Object</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimensioned Object</em>' containment reference list.
	 * @see CWM.Multidimensional.MultidimensionalPackage#getMultidimensional_container_DimensionedObject()
	 * @model containment="true"
	 * @generated
	 */
	EList<DimensionedObject> getDimensionedObject();

	/**
	 * Returns the value of the '<em><b>Member</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Multidimensional.Member}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member</em>' containment reference list.
	 * @see CWM.Multidimensional.MultidimensionalPackage#getMultidimensional_container_Member()
	 * @model containment="true"
	 * @generated
	 */
	EList<Member> getMember();

	/**
	 * Returns the value of the '<em><b>Member Set</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Multidimensional.MemberSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member Set</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Set</em>' containment reference list.
	 * @see CWM.Multidimensional.MultidimensionalPackage#getMultidimensional_container_MemberSet()
	 * @model containment="true"
	 * @generated
	 */
	EList<MemberSet> getMemberSet();

	/**
	 * Returns the value of the '<em><b>Member Value</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Multidimensional.MemberValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Value</em>' containment reference list.
	 * @see CWM.Multidimensional.MultidimensionalPackage#getMultidimensional_container_MemberValue()
	 * @model containment="true"
	 * @generated
	 */
	EList<MemberValue> getMemberValue();

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Multidimensional.Schema}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' containment reference list.
	 * @see CWM.Multidimensional.MultidimensionalPackage#getMultidimensional_container_Schema()
	 * @model containment="true"
	 * @generated
	 */
	EList<Schema> getSchema();

} // Multidimensional_container

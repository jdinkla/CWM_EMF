/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.DataTypes;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Types container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.DataTypes.DataTypes_container#getEnumeration <em>Enumeration</em>}</li>
 *   <li>{@link CWM.DataTypes.DataTypes_container#getEnumerationLiteral <em>Enumeration Literal</em>}</li>
 *   <li>{@link CWM.DataTypes.DataTypes_container#getQueryExpression <em>Query Expression</em>}</li>
 *   <li>{@link CWM.DataTypes.DataTypes_container#getTypeAlias <em>Type Alias</em>}</li>
 *   <li>{@link CWM.DataTypes.DataTypes_container#getUnion <em>Union</em>}</li>
 *   <li>{@link CWM.DataTypes.DataTypes_container#getUnionMember <em>Union Member</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.DataTypes.DataTypesPackage#getDataTypes_container()
 * @model
 * @generated
 */
public interface DataTypes_container extends EObject {
	/**
	 * Returns the value of the '<em><b>Enumeration</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.DataTypes.Enumeration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumeration</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumeration</em>' containment reference list.
	 * @see CWM.DataTypes.DataTypesPackage#getDataTypes_container_Enumeration()
	 * @model containment="true"
	 * @generated
	 */
	EList<Enumeration> getEnumeration();

	/**
	 * Returns the value of the '<em><b>Enumeration Literal</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.DataTypes.EnumerationLiteral}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumeration Literal</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumeration Literal</em>' containment reference list.
	 * @see CWM.DataTypes.DataTypesPackage#getDataTypes_container_EnumerationLiteral()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnumerationLiteral> getEnumerationLiteral();

	/**
	 * Returns the value of the '<em><b>Query Expression</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.DataTypes.QueryExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query Expression</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Expression</em>' containment reference list.
	 * @see CWM.DataTypes.DataTypesPackage#getDataTypes_container_QueryExpression()
	 * @model containment="true"
	 * @generated
	 */
	EList<QueryExpression> getQueryExpression();

	/**
	 * Returns the value of the '<em><b>Type Alias</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.DataTypes.TypeAlias}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Alias</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Alias</em>' containment reference list.
	 * @see CWM.DataTypes.DataTypesPackage#getDataTypes_container_TypeAlias()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeAlias> getTypeAlias();

	/**
	 * Returns the value of the '<em><b>Union</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.DataTypes.Union}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Union</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Union</em>' containment reference list.
	 * @see CWM.DataTypes.DataTypesPackage#getDataTypes_container_Union()
	 * @model containment="true"
	 * @generated
	 */
	EList<Union> getUnion();

	/**
	 * Returns the value of the '<em><b>Union Member</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.DataTypes.UnionMember}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Union Member</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Union Member</em>' containment reference list.
	 * @see CWM.DataTypes.DataTypesPackage#getDataTypes_container_UnionMember()
	 * @model containment="true"
	 * @generated
	 */
	EList<UnionMember> getUnionMember();

} // DataTypes_container

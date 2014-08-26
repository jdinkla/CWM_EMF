/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.DataTypes;

import CWM.Core.DataType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.DataTypes.Enumeration#getIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link CWM.DataTypes.Enumeration#getLiteral <em>Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.DataTypes.DataTypesPackage#getEnumeration()
 * @model
 * @generated
 */
public interface Enumeration extends DataType {
	/**
	 * Returns the value of the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Ordered</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Ordered</em>' attribute.
	 * @see #setIsOrdered(Boolean)
	 * @see CWM.DataTypes.DataTypesPackage#getEnumeration_IsOrdered()
	 * @model unique="false" dataType="CWM.Core.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsOrdered();

	/**
	 * Sets the value of the '{@link CWM.DataTypes.Enumeration#getIsOrdered <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Ordered</em>' attribute.
	 * @see #getIsOrdered()
	 * @generated
	 */
	void setIsOrdered(Boolean value);

	/**
	 * Returns the value of the '<em><b>Literal</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.DataTypes.EnumerationLiteral}.
	 * It is bidirectional and its opposite is '{@link CWM.DataTypes.EnumerationLiteral#getEnumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literal</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal</em>' containment reference list.
	 * @see CWM.DataTypes.DataTypesPackage#getEnumeration_Literal()
	 * @see CWM.DataTypes.EnumerationLiteral#getEnumeration
	 * @model opposite="enumeration" containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<EnumerationLiteral> getLiteral();

} // Enumeration

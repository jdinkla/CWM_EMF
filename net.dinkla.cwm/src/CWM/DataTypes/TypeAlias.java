/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.DataTypes;

import CWM.Core.Classifier;
import CWM.Core.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Alias</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.DataTypes.TypeAlias#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.DataTypes.DataTypesPackage#getTypeAlias()
 * @model
 * @generated
 */
public interface TypeAlias extends DataType {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Classifier)
	 * @see CWM.DataTypes.DataTypesPackage#getTypeAlias_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Classifier getType();

	/**
	 * Sets the value of the '{@link CWM.DataTypes.TypeAlias#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Classifier value);

} // TypeAlias

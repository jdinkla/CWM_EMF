/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Relational;

import CWM.Behavioral.Method;

import CWM.Relational.Enumerations.ProcedureType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Relational.Procedure#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Relational.RelationalPackage#getProcedure()
 * @model
 * @generated
 */
public interface Procedure extends Method {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link CWM.Relational.Enumerations.ProcedureType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see CWM.Relational.Enumerations.ProcedureType
	 * @see #setType(ProcedureType)
	 * @see CWM.Relational.RelationalPackage#getProcedure_Type()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	ProcedureType getType();

	/**
	 * Sets the value of the '{@link CWM.Relational.Procedure#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see CWM.Relational.Enumerations.ProcedureType
	 * @see #getType()
	 * @generated
	 */
	void setType(ProcedureType value);

} // Procedure

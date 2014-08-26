/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Relational;

import CWM.Core.Constraint;

import CWM.Relational.Enumerations.DeferrabilityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Check Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Relational.CheckConstraint#getDeferrability <em>Deferrability</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Relational.RelationalPackage#getCheckConstraint()
 * @model
 * @generated
 */
public interface CheckConstraint extends Constraint {
	/**
	 * Returns the value of the '<em><b>Deferrability</b></em>' attribute.
	 * The literals are from the enumeration {@link CWM.Relational.Enumerations.DeferrabilityType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deferrability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deferrability</em>' attribute.
	 * @see CWM.Relational.Enumerations.DeferrabilityType
	 * @see #setDeferrability(DeferrabilityType)
	 * @see CWM.Relational.RelationalPackage#getCheckConstraint_Deferrability()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	DeferrabilityType getDeferrability();

	/**
	 * Sets the value of the '{@link CWM.Relational.CheckConstraint#getDeferrability <em>Deferrability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deferrability</em>' attribute.
	 * @see CWM.Relational.Enumerations.DeferrabilityType
	 * @see #getDeferrability()
	 * @generated
	 */
	void setDeferrability(DeferrabilityType value);

} // CheckConstraint

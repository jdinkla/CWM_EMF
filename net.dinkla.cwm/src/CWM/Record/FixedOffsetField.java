/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Record;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fixed Offset Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Record.FixedOffsetField#getOffset <em>Offset</em>}</li>
 *   <li>{@link CWM.Record.FixedOffsetField#getOffsetUnitBits <em>Offset Unit Bits</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Record.RecordPackage#getFixedOffsetField()
 * @model
 * @generated
 */
public interface FixedOffsetField extends Field {
	/**
	 * Returns the value of the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' attribute.
	 * @see #setOffset(Integer)
	 * @see CWM.Record.RecordPackage#getFixedOffsetField_Offset()
	 * @model unique="false" dataType="CWM.Core.Integer" required="true" ordered="false"
	 * @generated
	 */
	Integer getOffset();

	/**
	 * Sets the value of the '{@link CWM.Record.FixedOffsetField#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' attribute.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(Integer value);

	/**
	 * Returns the value of the '<em><b>Offset Unit Bits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset Unit Bits</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset Unit Bits</em>' attribute.
	 * @see #setOffsetUnitBits(Integer)
	 * @see CWM.Record.RecordPackage#getFixedOffsetField_OffsetUnitBits()
	 * @model unique="false" dataType="CWM.Core.Integer" required="true" ordered="false"
	 * @generated
	 */
	Integer getOffsetUnitBits();

	/**
	 * Sets the value of the '{@link CWM.Record.FixedOffsetField#getOffsetUnitBits <em>Offset Unit Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset Unit Bits</em>' attribute.
	 * @see #getOffsetUnitBits()
	 * @generated
	 */
	void setOffsetUnitBits(Integer value);

} // FixedOffsetField

/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Record.impl;

import CWM.Record.FixedOffsetField;
import CWM.Record.RecordPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fixed Offset Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.Record.impl.FixedOffsetFieldImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link CWM.Record.impl.FixedOffsetFieldImpl#getOffsetUnitBits <em>Offset Unit Bits</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FixedOffsetFieldImpl extends FieldImpl implements FixedOffsetField {
	/**
	 * The default value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected static final Integer OFFSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected Integer offset = OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getOffsetUnitBits() <em>Offset Unit Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffsetUnitBits()
	 * @generated
	 * @ordered
	 */
	protected static final Integer OFFSET_UNIT_BITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOffsetUnitBits() <em>Offset Unit Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffsetUnitBits()
	 * @generated
	 * @ordered
	 */
	protected Integer offsetUnitBits = OFFSET_UNIT_BITS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FixedOffsetFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RecordPackage.Literals.FIXED_OFFSET_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getOffset() {
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffset(Integer newOffset) {
		Integer oldOffset = offset;
		offset = newOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecordPackage.FIXED_OFFSET_FIELD__OFFSET, oldOffset, offset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getOffsetUnitBits() {
		return offsetUnitBits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffsetUnitBits(Integer newOffsetUnitBits) {
		Integer oldOffsetUnitBits = offsetUnitBits;
		offsetUnitBits = newOffsetUnitBits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecordPackage.FIXED_OFFSET_FIELD__OFFSET_UNIT_BITS, oldOffsetUnitBits, offsetUnitBits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RecordPackage.FIXED_OFFSET_FIELD__OFFSET:
				return getOffset();
			case RecordPackage.FIXED_OFFSET_FIELD__OFFSET_UNIT_BITS:
				return getOffsetUnitBits();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RecordPackage.FIXED_OFFSET_FIELD__OFFSET:
				setOffset((Integer)newValue);
				return;
			case RecordPackage.FIXED_OFFSET_FIELD__OFFSET_UNIT_BITS:
				setOffsetUnitBits((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RecordPackage.FIXED_OFFSET_FIELD__OFFSET:
				setOffset(OFFSET_EDEFAULT);
				return;
			case RecordPackage.FIXED_OFFSET_FIELD__OFFSET_UNIT_BITS:
				setOffsetUnitBits(OFFSET_UNIT_BITS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RecordPackage.FIXED_OFFSET_FIELD__OFFSET:
				return OFFSET_EDEFAULT == null ? offset != null : !OFFSET_EDEFAULT.equals(offset);
			case RecordPackage.FIXED_OFFSET_FIELD__OFFSET_UNIT_BITS:
				return OFFSET_UNIT_BITS_EDEFAULT == null ? offsetUnitBits != null : !OFFSET_UNIT_BITS_EDEFAULT.equals(offsetUnitBits);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (offset: ");
		result.append(offset);
		result.append(", offsetUnitBits: ");
		result.append(offsetUnitBits);
		result.append(')');
		return result.toString();
	}

} //FixedOffsetFieldImpl

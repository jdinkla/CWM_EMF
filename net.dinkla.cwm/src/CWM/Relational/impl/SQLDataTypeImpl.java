/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Relational.impl;

import CWM.Core.impl.ClassifierImpl;

import CWM.Relational.RelationalPackage;
import CWM.Relational.SQLDataType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SQL Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.Relational.impl.SQLDataTypeImpl#getTypeNumber <em>Type Number</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class SQLDataTypeImpl extends ClassifierImpl implements SQLDataType {
	/**
	 * The default value of the '{@link #getTypeNumber() <em>Type Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeNumber()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TYPE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeNumber() <em>Type Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeNumber()
	 * @generated
	 * @ordered
	 */
	protected Integer typeNumber = TYPE_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SQLDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RelationalPackage.Literals.SQL_DATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getTypeNumber() {
		return typeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeNumber(Integer newTypeNumber) {
		Integer oldTypeNumber = typeNumber;
		typeNumber = newTypeNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalPackage.SQL_DATA_TYPE__TYPE_NUMBER, oldTypeNumber, typeNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RelationalPackage.SQL_DATA_TYPE__TYPE_NUMBER:
				return getTypeNumber();
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
			case RelationalPackage.SQL_DATA_TYPE__TYPE_NUMBER:
				setTypeNumber((Integer)newValue);
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
			case RelationalPackage.SQL_DATA_TYPE__TYPE_NUMBER:
				setTypeNumber(TYPE_NUMBER_EDEFAULT);
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
			case RelationalPackage.SQL_DATA_TYPE__TYPE_NUMBER:
				return TYPE_NUMBER_EDEFAULT == null ? typeNumber != null : !TYPE_NUMBER_EDEFAULT.equals(typeNumber);
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
		result.append(" (typeNumber: ");
		result.append(typeNumber);
		result.append(')');
		return result.toString();
	}

} //SQLDataTypeImpl

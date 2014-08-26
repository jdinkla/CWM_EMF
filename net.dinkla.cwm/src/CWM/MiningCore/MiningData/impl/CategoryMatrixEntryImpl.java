/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningData.impl;

import CWM.Core.impl.ModelElementImpl;

import CWM.MiningCore.MiningData.Category;
import CWM.MiningCore.MiningData.CategoryMatrixEntry;
import CWM.MiningCore.MiningData.MiningDataPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Category Matrix Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.MiningCore.MiningData.impl.CategoryMatrixEntryImpl#getRowIndex <em>Row Index</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.impl.CategoryMatrixEntryImpl#getColumnIndex <em>Column Index</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.impl.CategoryMatrixEntryImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CategoryMatrixEntryImpl extends ModelElementImpl implements CategoryMatrixEntry {
	/**
	 * The cached value of the '{@link #getRowIndex() <em>Row Index</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowIndex()
	 * @generated
	 * @ordered
	 */
	protected Category rowIndex;

	/**
	 * The cached value of the '{@link #getColumnIndex() <em>Column Index</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnIndex()
	 * @generated
	 * @ordered
	 */
	protected Category columnIndex;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final Double VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Double value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CategoryMatrixEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MiningDataPackage.Literals.CATEGORY_MATRIX_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category getRowIndex() {
		if (rowIndex != null && rowIndex.eIsProxy()) {
			InternalEObject oldRowIndex = (InternalEObject)rowIndex;
			rowIndex = (Category)eResolveProxy(oldRowIndex);
			if (rowIndex != oldRowIndex) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MiningDataPackage.CATEGORY_MATRIX_ENTRY__ROW_INDEX, oldRowIndex, rowIndex));
			}
		}
		return rowIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category basicGetRowIndex() {
		return rowIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRowIndex(Category newRowIndex) {
		Category oldRowIndex = rowIndex;
		rowIndex = newRowIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiningDataPackage.CATEGORY_MATRIX_ENTRY__ROW_INDEX, oldRowIndex, rowIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category getColumnIndex() {
		if (columnIndex != null && columnIndex.eIsProxy()) {
			InternalEObject oldColumnIndex = (InternalEObject)columnIndex;
			columnIndex = (Category)eResolveProxy(oldColumnIndex);
			if (columnIndex != oldColumnIndex) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MiningDataPackage.CATEGORY_MATRIX_ENTRY__COLUMN_INDEX, oldColumnIndex, columnIndex));
			}
		}
		return columnIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category basicGetColumnIndex() {
		return columnIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnIndex(Category newColumnIndex) {
		Category oldColumnIndex = columnIndex;
		columnIndex = newColumnIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiningDataPackage.CATEGORY_MATRIX_ENTRY__COLUMN_INDEX, oldColumnIndex, columnIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Double newValue) {
		Double oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiningDataPackage.CATEGORY_MATRIX_ENTRY__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MiningDataPackage.CATEGORY_MATRIX_ENTRY__ROW_INDEX:
				if (resolve) return getRowIndex();
				return basicGetRowIndex();
			case MiningDataPackage.CATEGORY_MATRIX_ENTRY__COLUMN_INDEX:
				if (resolve) return getColumnIndex();
				return basicGetColumnIndex();
			case MiningDataPackage.CATEGORY_MATRIX_ENTRY__VALUE:
				return getValue();
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
			case MiningDataPackage.CATEGORY_MATRIX_ENTRY__ROW_INDEX:
				setRowIndex((Category)newValue);
				return;
			case MiningDataPackage.CATEGORY_MATRIX_ENTRY__COLUMN_INDEX:
				setColumnIndex((Category)newValue);
				return;
			case MiningDataPackage.CATEGORY_MATRIX_ENTRY__VALUE:
				setValue((Double)newValue);
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
			case MiningDataPackage.CATEGORY_MATRIX_ENTRY__ROW_INDEX:
				setRowIndex((Category)null);
				return;
			case MiningDataPackage.CATEGORY_MATRIX_ENTRY__COLUMN_INDEX:
				setColumnIndex((Category)null);
				return;
			case MiningDataPackage.CATEGORY_MATRIX_ENTRY__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case MiningDataPackage.CATEGORY_MATRIX_ENTRY__ROW_INDEX:
				return rowIndex != null;
			case MiningDataPackage.CATEGORY_MATRIX_ENTRY__COLUMN_INDEX:
				return columnIndex != null;
			case MiningDataPackage.CATEGORY_MATRIX_ENTRY__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
		result.append(" (value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //CategoryMatrixEntryImpl

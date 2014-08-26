/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningData.impl;

import CWM.Core.Attribute;

import CWM.MiningCore.MiningData.CategoryMatrixTable;
import CWM.MiningCore.MiningData.MiningDataPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Category Matrix Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.MiningCore.MiningData.impl.CategoryMatrixTableImpl#getRowAttribute <em>Row Attribute</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.impl.CategoryMatrixTableImpl#getColumnAttribute <em>Column Attribute</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.impl.CategoryMatrixTableImpl#getValueAttribute <em>Value Attribute</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.impl.CategoryMatrixTableImpl#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CategoryMatrixTableImpl extends CategoryMatrixImpl implements CategoryMatrixTable {
	/**
	 * The cached value of the '{@link #getRowAttribute() <em>Row Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowAttribute()
	 * @generated
	 * @ordered
	 */
	protected Attribute rowAttribute;

	/**
	 * The cached value of the '{@link #getColumnAttribute() <em>Column Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnAttribute()
	 * @generated
	 * @ordered
	 */
	protected Attribute columnAttribute;

	/**
	 * The cached value of the '{@link #getValueAttribute() <em>Value Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueAttribute()
	 * @generated
	 * @ordered
	 */
	protected Attribute valueAttribute;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EList<CWM.Core.Class> source;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CategoryMatrixTableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MiningDataPackage.Literals.CATEGORY_MATRIX_TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getRowAttribute() {
		if (rowAttribute != null && rowAttribute.eIsProxy()) {
			InternalEObject oldRowAttribute = (InternalEObject)rowAttribute;
			rowAttribute = (Attribute)eResolveProxy(oldRowAttribute);
			if (rowAttribute != oldRowAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MiningDataPackage.CATEGORY_MATRIX_TABLE__ROW_ATTRIBUTE, oldRowAttribute, rowAttribute));
			}
		}
		return rowAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetRowAttribute() {
		return rowAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRowAttribute(Attribute newRowAttribute) {
		Attribute oldRowAttribute = rowAttribute;
		rowAttribute = newRowAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiningDataPackage.CATEGORY_MATRIX_TABLE__ROW_ATTRIBUTE, oldRowAttribute, rowAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getColumnAttribute() {
		if (columnAttribute != null && columnAttribute.eIsProxy()) {
			InternalEObject oldColumnAttribute = (InternalEObject)columnAttribute;
			columnAttribute = (Attribute)eResolveProxy(oldColumnAttribute);
			if (columnAttribute != oldColumnAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MiningDataPackage.CATEGORY_MATRIX_TABLE__COLUMN_ATTRIBUTE, oldColumnAttribute, columnAttribute));
			}
		}
		return columnAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetColumnAttribute() {
		return columnAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnAttribute(Attribute newColumnAttribute) {
		Attribute oldColumnAttribute = columnAttribute;
		columnAttribute = newColumnAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiningDataPackage.CATEGORY_MATRIX_TABLE__COLUMN_ATTRIBUTE, oldColumnAttribute, columnAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getValueAttribute() {
		if (valueAttribute != null && valueAttribute.eIsProxy()) {
			InternalEObject oldValueAttribute = (InternalEObject)valueAttribute;
			valueAttribute = (Attribute)eResolveProxy(oldValueAttribute);
			if (valueAttribute != oldValueAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MiningDataPackage.CATEGORY_MATRIX_TABLE__VALUE_ATTRIBUTE, oldValueAttribute, valueAttribute));
			}
		}
		return valueAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetValueAttribute() {
		return valueAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueAttribute(Attribute newValueAttribute) {
		Attribute oldValueAttribute = valueAttribute;
		valueAttribute = newValueAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiningDataPackage.CATEGORY_MATRIX_TABLE__VALUE_ATTRIBUTE, oldValueAttribute, valueAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CWM.Core.Class> getSource() {
		if (source == null) {
			source = new EObjectResolvingEList<CWM.Core.Class>(CWM.Core.Class.class, this, MiningDataPackage.CATEGORY_MATRIX_TABLE__SOURCE);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MiningDataPackage.CATEGORY_MATRIX_TABLE__ROW_ATTRIBUTE:
				if (resolve) return getRowAttribute();
				return basicGetRowAttribute();
			case MiningDataPackage.CATEGORY_MATRIX_TABLE__COLUMN_ATTRIBUTE:
				if (resolve) return getColumnAttribute();
				return basicGetColumnAttribute();
			case MiningDataPackage.CATEGORY_MATRIX_TABLE__VALUE_ATTRIBUTE:
				if (resolve) return getValueAttribute();
				return basicGetValueAttribute();
			case MiningDataPackage.CATEGORY_MATRIX_TABLE__SOURCE:
				return getSource();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MiningDataPackage.CATEGORY_MATRIX_TABLE__ROW_ATTRIBUTE:
				setRowAttribute((Attribute)newValue);
				return;
			case MiningDataPackage.CATEGORY_MATRIX_TABLE__COLUMN_ATTRIBUTE:
				setColumnAttribute((Attribute)newValue);
				return;
			case MiningDataPackage.CATEGORY_MATRIX_TABLE__VALUE_ATTRIBUTE:
				setValueAttribute((Attribute)newValue);
				return;
			case MiningDataPackage.CATEGORY_MATRIX_TABLE__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends CWM.Core.Class>)newValue);
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
			case MiningDataPackage.CATEGORY_MATRIX_TABLE__ROW_ATTRIBUTE:
				setRowAttribute((Attribute)null);
				return;
			case MiningDataPackage.CATEGORY_MATRIX_TABLE__COLUMN_ATTRIBUTE:
				setColumnAttribute((Attribute)null);
				return;
			case MiningDataPackage.CATEGORY_MATRIX_TABLE__VALUE_ATTRIBUTE:
				setValueAttribute((Attribute)null);
				return;
			case MiningDataPackage.CATEGORY_MATRIX_TABLE__SOURCE:
				getSource().clear();
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
			case MiningDataPackage.CATEGORY_MATRIX_TABLE__ROW_ATTRIBUTE:
				return rowAttribute != null;
			case MiningDataPackage.CATEGORY_MATRIX_TABLE__COLUMN_ATTRIBUTE:
				return columnAttribute != null;
			case MiningDataPackage.CATEGORY_MATRIX_TABLE__VALUE_ATTRIBUTE:
				return valueAttribute != null;
			case MiningDataPackage.CATEGORY_MATRIX_TABLE__SOURCE:
				return source != null && !source.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CategoryMatrixTableImpl

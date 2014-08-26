/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningData.impl;

import CWM.Core.impl.ModelElementImpl;

import CWM.MiningCore.MiningData.CategoryMap;
import CWM.MiningCore.MiningData.MiningDataPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Category Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.MiningCore.MiningData.impl.CategoryMapImpl#getIsMultiLevel <em>Is Multi Level</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.impl.CategoryMapImpl#getIsItemMap <em>Is Item Map</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CategoryMapImpl extends ModelElementImpl implements CategoryMap {
	/**
	 * The default value of the '{@link #getIsMultiLevel() <em>Is Multi Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsMultiLevel()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_MULTI_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsMultiLevel() <em>Is Multi Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsMultiLevel()
	 * @generated
	 * @ordered
	 */
	protected Boolean isMultiLevel = IS_MULTI_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsItemMap() <em>Is Item Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsItemMap()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_ITEM_MAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsItemMap() <em>Is Item Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsItemMap()
	 * @generated
	 * @ordered
	 */
	protected Boolean isItemMap = IS_ITEM_MAP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CategoryMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MiningDataPackage.Literals.CATEGORY_MAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsMultiLevel() {
		return isMultiLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMultiLevel(Boolean newIsMultiLevel) {
		Boolean oldIsMultiLevel = isMultiLevel;
		isMultiLevel = newIsMultiLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiningDataPackage.CATEGORY_MAP__IS_MULTI_LEVEL, oldIsMultiLevel, isMultiLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsItemMap() {
		return isItemMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsItemMap(Boolean newIsItemMap) {
		Boolean oldIsItemMap = isItemMap;
		isItemMap = newIsItemMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiningDataPackage.CATEGORY_MAP__IS_ITEM_MAP, oldIsItemMap, isItemMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MiningDataPackage.CATEGORY_MAP__IS_MULTI_LEVEL:
				return getIsMultiLevel();
			case MiningDataPackage.CATEGORY_MAP__IS_ITEM_MAP:
				return getIsItemMap();
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
			case MiningDataPackage.CATEGORY_MAP__IS_MULTI_LEVEL:
				setIsMultiLevel((Boolean)newValue);
				return;
			case MiningDataPackage.CATEGORY_MAP__IS_ITEM_MAP:
				setIsItemMap((Boolean)newValue);
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
			case MiningDataPackage.CATEGORY_MAP__IS_MULTI_LEVEL:
				setIsMultiLevel(IS_MULTI_LEVEL_EDEFAULT);
				return;
			case MiningDataPackage.CATEGORY_MAP__IS_ITEM_MAP:
				setIsItemMap(IS_ITEM_MAP_EDEFAULT);
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
			case MiningDataPackage.CATEGORY_MAP__IS_MULTI_LEVEL:
				return IS_MULTI_LEVEL_EDEFAULT == null ? isMultiLevel != null : !IS_MULTI_LEVEL_EDEFAULT.equals(isMultiLevel);
			case MiningDataPackage.CATEGORY_MAP__IS_ITEM_MAP:
				return IS_ITEM_MAP_EDEFAULT == null ? isItemMap != null : !IS_ITEM_MAP_EDEFAULT.equals(isItemMap);
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
		result.append(" (isMultiLevel: ");
		result.append(isMultiLevel);
		result.append(", isItemMap: ");
		result.append(isItemMap);
		result.append(')');
		return result.toString();
	}

} //CategoryMapImpl

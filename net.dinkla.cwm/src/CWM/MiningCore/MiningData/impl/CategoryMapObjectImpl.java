/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningData.impl;

import CWM.Core.impl.ModelElementImpl;

import CWM.MiningCore.MiningData.CategoryMap;
import CWM.MiningCore.MiningData.CategoryMapObject;
import CWM.MiningCore.MiningData.CategoryMapObjectEntry;
import CWM.MiningCore.MiningData.MiningDataPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Category Map Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.MiningCore.MiningData.impl.CategoryMapObjectImpl#getIsMultiLevel <em>Is Multi Level</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.impl.CategoryMapObjectImpl#getIsItemMap <em>Is Item Map</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.impl.CategoryMapObjectImpl#getEntry <em>Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CategoryMapObjectImpl extends ModelElementImpl implements CategoryMapObject {
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
	 * The cached value of the '{@link #getEntry() <em>Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<CategoryMapObjectEntry> entry;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CategoryMapObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MiningDataPackage.Literals.CATEGORY_MAP_OBJECT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MiningDataPackage.CATEGORY_MAP_OBJECT__IS_MULTI_LEVEL, oldIsMultiLevel, isMultiLevel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MiningDataPackage.CATEGORY_MAP_OBJECT__IS_ITEM_MAP, oldIsItemMap, isItemMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CategoryMapObjectEntry> getEntry() {
		if (entry == null) {
			entry = new EObjectContainmentEList<CategoryMapObjectEntry>(CategoryMapObjectEntry.class, this, MiningDataPackage.CATEGORY_MAP_OBJECT__ENTRY);
		}
		return entry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MiningDataPackage.CATEGORY_MAP_OBJECT__ENTRY:
				return ((InternalEList<?>)getEntry()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MiningDataPackage.CATEGORY_MAP_OBJECT__IS_MULTI_LEVEL:
				return getIsMultiLevel();
			case MiningDataPackage.CATEGORY_MAP_OBJECT__IS_ITEM_MAP:
				return getIsItemMap();
			case MiningDataPackage.CATEGORY_MAP_OBJECT__ENTRY:
				return getEntry();
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
			case MiningDataPackage.CATEGORY_MAP_OBJECT__IS_MULTI_LEVEL:
				setIsMultiLevel((Boolean)newValue);
				return;
			case MiningDataPackage.CATEGORY_MAP_OBJECT__IS_ITEM_MAP:
				setIsItemMap((Boolean)newValue);
				return;
			case MiningDataPackage.CATEGORY_MAP_OBJECT__ENTRY:
				getEntry().clear();
				getEntry().addAll((Collection<? extends CategoryMapObjectEntry>)newValue);
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
			case MiningDataPackage.CATEGORY_MAP_OBJECT__IS_MULTI_LEVEL:
				setIsMultiLevel(IS_MULTI_LEVEL_EDEFAULT);
				return;
			case MiningDataPackage.CATEGORY_MAP_OBJECT__IS_ITEM_MAP:
				setIsItemMap(IS_ITEM_MAP_EDEFAULT);
				return;
			case MiningDataPackage.CATEGORY_MAP_OBJECT__ENTRY:
				getEntry().clear();
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
			case MiningDataPackage.CATEGORY_MAP_OBJECT__IS_MULTI_LEVEL:
				return IS_MULTI_LEVEL_EDEFAULT == null ? isMultiLevel != null : !IS_MULTI_LEVEL_EDEFAULT.equals(isMultiLevel);
			case MiningDataPackage.CATEGORY_MAP_OBJECT__IS_ITEM_MAP:
				return IS_ITEM_MAP_EDEFAULT == null ? isItemMap != null : !IS_ITEM_MAP_EDEFAULT.equals(isItemMap);
			case MiningDataPackage.CATEGORY_MAP_OBJECT__ENTRY:
				return entry != null && !entry.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == CategoryMap.class) {
			switch (derivedFeatureID) {
				case MiningDataPackage.CATEGORY_MAP_OBJECT__IS_MULTI_LEVEL: return MiningDataPackage.CATEGORY_MAP__IS_MULTI_LEVEL;
				case MiningDataPackage.CATEGORY_MAP_OBJECT__IS_ITEM_MAP: return MiningDataPackage.CATEGORY_MAP__IS_ITEM_MAP;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == CategoryMap.class) {
			switch (baseFeatureID) {
				case MiningDataPackage.CATEGORY_MAP__IS_MULTI_LEVEL: return MiningDataPackage.CATEGORY_MAP_OBJECT__IS_MULTI_LEVEL;
				case MiningDataPackage.CATEGORY_MAP__IS_ITEM_MAP: return MiningDataPackage.CATEGORY_MAP_OBJECT__IS_ITEM_MAP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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

} //CategoryMapObjectImpl

/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningData.impl;

import CWM.Core.Attribute;

import CWM.Core.impl.ModelElementImpl;

import CWM.MiningCore.MiningData.CategoryMap;
import CWM.MiningCore.MiningData.CategoryMapTable;
import CWM.MiningCore.MiningData.MiningDataPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Category Map Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.MiningCore.MiningData.impl.CategoryMapTableImpl#getIsMultiLevel <em>Is Multi Level</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.impl.CategoryMapTableImpl#getIsItemMap <em>Is Item Map</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.impl.CategoryMapTableImpl#getChildAttribute <em>Child Attribute</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.impl.CategoryMapTableImpl#getParentAttribute <em>Parent Attribute</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.impl.CategoryMapTableImpl#getGraphIdAttribute <em>Graph Id Attribute</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.impl.CategoryMapTableImpl#getTable <em>Table</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CategoryMapTableImpl extends ModelElementImpl implements CategoryMapTable {
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
	 * The cached value of the '{@link #getChildAttribute() <em>Child Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildAttribute()
	 * @generated
	 * @ordered
	 */
	protected Attribute childAttribute;

	/**
	 * The cached value of the '{@link #getParentAttribute() <em>Parent Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentAttribute()
	 * @generated
	 * @ordered
	 */
	protected Attribute parentAttribute;

	/**
	 * The cached value of the '{@link #getGraphIdAttribute() <em>Graph Id Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphIdAttribute()
	 * @generated
	 * @ordered
	 */
	protected Attribute graphIdAttribute;

	/**
	 * The cached value of the '{@link #getTable() <em>Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTable()
	 * @generated
	 * @ordered
	 */
	protected CWM.Core.Class table;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CategoryMapTableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MiningDataPackage.Literals.CATEGORY_MAP_TABLE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MiningDataPackage.CATEGORY_MAP_TABLE__IS_MULTI_LEVEL, oldIsMultiLevel, isMultiLevel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MiningDataPackage.CATEGORY_MAP_TABLE__IS_ITEM_MAP, oldIsItemMap, isItemMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getChildAttribute() {
		if (childAttribute != null && childAttribute.eIsProxy()) {
			InternalEObject oldChildAttribute = (InternalEObject)childAttribute;
			childAttribute = (Attribute)eResolveProxy(oldChildAttribute);
			if (childAttribute != oldChildAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MiningDataPackage.CATEGORY_MAP_TABLE__CHILD_ATTRIBUTE, oldChildAttribute, childAttribute));
			}
		}
		return childAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetChildAttribute() {
		return childAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChildAttribute(Attribute newChildAttribute) {
		Attribute oldChildAttribute = childAttribute;
		childAttribute = newChildAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiningDataPackage.CATEGORY_MAP_TABLE__CHILD_ATTRIBUTE, oldChildAttribute, childAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getParentAttribute() {
		if (parentAttribute != null && parentAttribute.eIsProxy()) {
			InternalEObject oldParentAttribute = (InternalEObject)parentAttribute;
			parentAttribute = (Attribute)eResolveProxy(oldParentAttribute);
			if (parentAttribute != oldParentAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MiningDataPackage.CATEGORY_MAP_TABLE__PARENT_ATTRIBUTE, oldParentAttribute, parentAttribute));
			}
		}
		return parentAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetParentAttribute() {
		return parentAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAttribute(Attribute newParentAttribute) {
		Attribute oldParentAttribute = parentAttribute;
		parentAttribute = newParentAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiningDataPackage.CATEGORY_MAP_TABLE__PARENT_ATTRIBUTE, oldParentAttribute, parentAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getGraphIdAttribute() {
		if (graphIdAttribute != null && graphIdAttribute.eIsProxy()) {
			InternalEObject oldGraphIdAttribute = (InternalEObject)graphIdAttribute;
			graphIdAttribute = (Attribute)eResolveProxy(oldGraphIdAttribute);
			if (graphIdAttribute != oldGraphIdAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MiningDataPackage.CATEGORY_MAP_TABLE__GRAPH_ID_ATTRIBUTE, oldGraphIdAttribute, graphIdAttribute));
			}
		}
		return graphIdAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetGraphIdAttribute() {
		return graphIdAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGraphIdAttribute(Attribute newGraphIdAttribute) {
		Attribute oldGraphIdAttribute = graphIdAttribute;
		graphIdAttribute = newGraphIdAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiningDataPackage.CATEGORY_MAP_TABLE__GRAPH_ID_ATTRIBUTE, oldGraphIdAttribute, graphIdAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CWM.Core.Class getTable() {
		if (table != null && table.eIsProxy()) {
			InternalEObject oldTable = (InternalEObject)table;
			table = (CWM.Core.Class)eResolveProxy(oldTable);
			if (table != oldTable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MiningDataPackage.CATEGORY_MAP_TABLE__TABLE, oldTable, table));
			}
		}
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CWM.Core.Class basicGetTable() {
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTable(CWM.Core.Class newTable) {
		CWM.Core.Class oldTable = table;
		table = newTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiningDataPackage.CATEGORY_MAP_TABLE__TABLE, oldTable, table));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MiningDataPackage.CATEGORY_MAP_TABLE__IS_MULTI_LEVEL:
				return getIsMultiLevel();
			case MiningDataPackage.CATEGORY_MAP_TABLE__IS_ITEM_MAP:
				return getIsItemMap();
			case MiningDataPackage.CATEGORY_MAP_TABLE__CHILD_ATTRIBUTE:
				if (resolve) return getChildAttribute();
				return basicGetChildAttribute();
			case MiningDataPackage.CATEGORY_MAP_TABLE__PARENT_ATTRIBUTE:
				if (resolve) return getParentAttribute();
				return basicGetParentAttribute();
			case MiningDataPackage.CATEGORY_MAP_TABLE__GRAPH_ID_ATTRIBUTE:
				if (resolve) return getGraphIdAttribute();
				return basicGetGraphIdAttribute();
			case MiningDataPackage.CATEGORY_MAP_TABLE__TABLE:
				if (resolve) return getTable();
				return basicGetTable();
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
			case MiningDataPackage.CATEGORY_MAP_TABLE__IS_MULTI_LEVEL:
				setIsMultiLevel((Boolean)newValue);
				return;
			case MiningDataPackage.CATEGORY_MAP_TABLE__IS_ITEM_MAP:
				setIsItemMap((Boolean)newValue);
				return;
			case MiningDataPackage.CATEGORY_MAP_TABLE__CHILD_ATTRIBUTE:
				setChildAttribute((Attribute)newValue);
				return;
			case MiningDataPackage.CATEGORY_MAP_TABLE__PARENT_ATTRIBUTE:
				setParentAttribute((Attribute)newValue);
				return;
			case MiningDataPackage.CATEGORY_MAP_TABLE__GRAPH_ID_ATTRIBUTE:
				setGraphIdAttribute((Attribute)newValue);
				return;
			case MiningDataPackage.CATEGORY_MAP_TABLE__TABLE:
				setTable((CWM.Core.Class)newValue);
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
			case MiningDataPackage.CATEGORY_MAP_TABLE__IS_MULTI_LEVEL:
				setIsMultiLevel(IS_MULTI_LEVEL_EDEFAULT);
				return;
			case MiningDataPackage.CATEGORY_MAP_TABLE__IS_ITEM_MAP:
				setIsItemMap(IS_ITEM_MAP_EDEFAULT);
				return;
			case MiningDataPackage.CATEGORY_MAP_TABLE__CHILD_ATTRIBUTE:
				setChildAttribute((Attribute)null);
				return;
			case MiningDataPackage.CATEGORY_MAP_TABLE__PARENT_ATTRIBUTE:
				setParentAttribute((Attribute)null);
				return;
			case MiningDataPackage.CATEGORY_MAP_TABLE__GRAPH_ID_ATTRIBUTE:
				setGraphIdAttribute((Attribute)null);
				return;
			case MiningDataPackage.CATEGORY_MAP_TABLE__TABLE:
				setTable((CWM.Core.Class)null);
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
			case MiningDataPackage.CATEGORY_MAP_TABLE__IS_MULTI_LEVEL:
				return IS_MULTI_LEVEL_EDEFAULT == null ? isMultiLevel != null : !IS_MULTI_LEVEL_EDEFAULT.equals(isMultiLevel);
			case MiningDataPackage.CATEGORY_MAP_TABLE__IS_ITEM_MAP:
				return IS_ITEM_MAP_EDEFAULT == null ? isItemMap != null : !IS_ITEM_MAP_EDEFAULT.equals(isItemMap);
			case MiningDataPackage.CATEGORY_MAP_TABLE__CHILD_ATTRIBUTE:
				return childAttribute != null;
			case MiningDataPackage.CATEGORY_MAP_TABLE__PARENT_ATTRIBUTE:
				return parentAttribute != null;
			case MiningDataPackage.CATEGORY_MAP_TABLE__GRAPH_ID_ATTRIBUTE:
				return graphIdAttribute != null;
			case MiningDataPackage.CATEGORY_MAP_TABLE__TABLE:
				return table != null;
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
				case MiningDataPackage.CATEGORY_MAP_TABLE__IS_MULTI_LEVEL: return MiningDataPackage.CATEGORY_MAP__IS_MULTI_LEVEL;
				case MiningDataPackage.CATEGORY_MAP_TABLE__IS_ITEM_MAP: return MiningDataPackage.CATEGORY_MAP__IS_ITEM_MAP;
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
				case MiningDataPackage.CATEGORY_MAP__IS_MULTI_LEVEL: return MiningDataPackage.CATEGORY_MAP_TABLE__IS_MULTI_LEVEL;
				case MiningDataPackage.CATEGORY_MAP__IS_ITEM_MAP: return MiningDataPackage.CATEGORY_MAP_TABLE__IS_ITEM_MAP;
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

} //CategoryMapTableImpl

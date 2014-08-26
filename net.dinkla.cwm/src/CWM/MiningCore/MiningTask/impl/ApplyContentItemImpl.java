/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningTask.impl;

import CWM.MiningCore.MiningTask.ApplyContentItem;
import CWM.MiningCore.MiningTask.MiningTaskPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Apply Content Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.MiningCore.MiningTask.impl.ApplyContentItemImpl#getTopNthIndex <em>Top Nth Index</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ApplyContentItemImpl extends ApplyOutputItemImpl implements ApplyContentItem {
	/**
	 * The default value of the '{@link #getTopNthIndex() <em>Top Nth Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopNthIndex()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TOP_NTH_INDEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTopNthIndex() <em>Top Nth Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopNthIndex()
	 * @generated
	 * @ordered
	 */
	protected Integer topNthIndex = TOP_NTH_INDEX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplyContentItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MiningTaskPackage.Literals.APPLY_CONTENT_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getTopNthIndex() {
		return topNthIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopNthIndex(Integer newTopNthIndex) {
		Integer oldTopNthIndex = topNthIndex;
		topNthIndex = newTopNthIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiningTaskPackage.APPLY_CONTENT_ITEM__TOP_NTH_INDEX, oldTopNthIndex, topNthIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MiningTaskPackage.APPLY_CONTENT_ITEM__TOP_NTH_INDEX:
				return getTopNthIndex();
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
			case MiningTaskPackage.APPLY_CONTENT_ITEM__TOP_NTH_INDEX:
				setTopNthIndex((Integer)newValue);
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
			case MiningTaskPackage.APPLY_CONTENT_ITEM__TOP_NTH_INDEX:
				setTopNthIndex(TOP_NTH_INDEX_EDEFAULT);
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
			case MiningTaskPackage.APPLY_CONTENT_ITEM__TOP_NTH_INDEX:
				return TOP_NTH_INDEX_EDEFAULT == null ? topNthIndex != null : !TOP_NTH_INDEX_EDEFAULT.equals(topNthIndex);
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
		result.append(" (topNthIndex: ");
		result.append(topNthIndex);
		result.append(')');
		return result.toString();
	}

} //ApplyContentItemImpl

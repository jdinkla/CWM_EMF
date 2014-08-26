/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Classification.impl;

import CWM.Classification.ApplyTargetValueItem;
import CWM.Classification.ClassificationPackage;

import CWM.MiningCore.MiningData.Category;

import CWM.MiningCore.MiningTask.impl.ApplyOutputItemImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Apply Target Value Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.Classification.impl.ApplyTargetValueItemImpl#getTargetValue <em>Target Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplyTargetValueItemImpl extends ApplyOutputItemImpl implements ApplyTargetValueItem {
	/**
	 * The cached value of the '{@link #getTargetValue() <em>Target Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetValue()
	 * @generated
	 * @ordered
	 */
	protected Category targetValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplyTargetValueItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassificationPackage.Literals.APPLY_TARGET_VALUE_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category getTargetValue() {
		if (targetValue != null && targetValue.eIsProxy()) {
			InternalEObject oldTargetValue = (InternalEObject)targetValue;
			targetValue = (Category)eResolveProxy(oldTargetValue);
			if (targetValue != oldTargetValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassificationPackage.APPLY_TARGET_VALUE_ITEM__TARGET_VALUE, oldTargetValue, targetValue));
			}
		}
		return targetValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category basicGetTargetValue() {
		return targetValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetValue(Category newTargetValue) {
		Category oldTargetValue = targetValue;
		targetValue = newTargetValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassificationPackage.APPLY_TARGET_VALUE_ITEM__TARGET_VALUE, oldTargetValue, targetValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassificationPackage.APPLY_TARGET_VALUE_ITEM__TARGET_VALUE:
				if (resolve) return getTargetValue();
				return basicGetTargetValue();
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
			case ClassificationPackage.APPLY_TARGET_VALUE_ITEM__TARGET_VALUE:
				setTargetValue((Category)newValue);
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
			case ClassificationPackage.APPLY_TARGET_VALUE_ITEM__TARGET_VALUE:
				setTargetValue((Category)null);
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
			case ClassificationPackage.APPLY_TARGET_VALUE_ITEM__TARGET_VALUE:
				return targetValue != null;
		}
		return super.eIsSet(featureID);
	}

} //ApplyTargetValueItemImpl

/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Classification.impl;

import CWM.Classification.ClassificationFunctionSettings;
import CWM.Classification.ClassificationPackage;

import CWM.MiningCore.MiningData.CategoryMatrix;

import CWM.Supervised.impl.SupervisedFunctionSettingsImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.Classification.impl.ClassificationFunctionSettingsImpl#getCostMatrix <em>Cost Matrix</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassificationFunctionSettingsImpl extends SupervisedFunctionSettingsImpl implements ClassificationFunctionSettings {
	/**
	 * The cached value of the '{@link #getCostMatrix() <em>Cost Matrix</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostMatrix()
	 * @generated
	 * @ordered
	 */
	protected CategoryMatrix costMatrix;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassificationFunctionSettingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassificationPackage.Literals.CLASSIFICATION_FUNCTION_SETTINGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategoryMatrix getCostMatrix() {
		if (costMatrix != null && costMatrix.eIsProxy()) {
			InternalEObject oldCostMatrix = (InternalEObject)costMatrix;
			costMatrix = (CategoryMatrix)eResolveProxy(oldCostMatrix);
			if (costMatrix != oldCostMatrix) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassificationPackage.CLASSIFICATION_FUNCTION_SETTINGS__COST_MATRIX, oldCostMatrix, costMatrix));
			}
		}
		return costMatrix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategoryMatrix basicGetCostMatrix() {
		return costMatrix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCostMatrix(CategoryMatrix newCostMatrix) {
		CategoryMatrix oldCostMatrix = costMatrix;
		costMatrix = newCostMatrix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassificationPackage.CLASSIFICATION_FUNCTION_SETTINGS__COST_MATRIX, oldCostMatrix, costMatrix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassificationPackage.CLASSIFICATION_FUNCTION_SETTINGS__COST_MATRIX:
				if (resolve) return getCostMatrix();
				return basicGetCostMatrix();
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
			case ClassificationPackage.CLASSIFICATION_FUNCTION_SETTINGS__COST_MATRIX:
				setCostMatrix((CategoryMatrix)newValue);
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
			case ClassificationPackage.CLASSIFICATION_FUNCTION_SETTINGS__COST_MATRIX:
				setCostMatrix((CategoryMatrix)null);
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
			case ClassificationPackage.CLASSIFICATION_FUNCTION_SETTINGS__COST_MATRIX:
				return costMatrix != null;
		}
		return super.eIsSet(featureID);
	}

} //ClassificationFunctionSettingsImpl

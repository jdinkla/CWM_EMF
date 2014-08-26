/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Approximation.impl;

import CWM.Approximation.ApproximationFunctionSettings;
import CWM.Approximation.ApproximationPackage;

import CWM.Supervised.impl.SupervisedFunctionSettingsImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.Approximation.impl.ApproximationFunctionSettingsImpl#getToleratedError <em>Tolerated Error</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApproximationFunctionSettingsImpl extends SupervisedFunctionSettingsImpl implements ApproximationFunctionSettings {
	/**
	 * The default value of the '{@link #getToleratedError() <em>Tolerated Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToleratedError()
	 * @generated
	 * @ordered
	 */
	protected static final Double TOLERATED_ERROR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToleratedError() <em>Tolerated Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToleratedError()
	 * @generated
	 * @ordered
	 */
	protected Double toleratedError = TOLERATED_ERROR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApproximationFunctionSettingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApproximationPackage.Literals.APPROXIMATION_FUNCTION_SETTINGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getToleratedError() {
		return toleratedError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToleratedError(Double newToleratedError) {
		Double oldToleratedError = toleratedError;
		toleratedError = newToleratedError;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApproximationPackage.APPROXIMATION_FUNCTION_SETTINGS__TOLERATED_ERROR, oldToleratedError, toleratedError));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApproximationPackage.APPROXIMATION_FUNCTION_SETTINGS__TOLERATED_ERROR:
				return getToleratedError();
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
			case ApproximationPackage.APPROXIMATION_FUNCTION_SETTINGS__TOLERATED_ERROR:
				setToleratedError((Double)newValue);
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
			case ApproximationPackage.APPROXIMATION_FUNCTION_SETTINGS__TOLERATED_ERROR:
				setToleratedError(TOLERATED_ERROR_EDEFAULT);
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
			case ApproximationPackage.APPROXIMATION_FUNCTION_SETTINGS__TOLERATED_ERROR:
				return TOLERATED_ERROR_EDEFAULT == null ? toleratedError != null : !TOLERATED_ERROR_EDEFAULT.equals(toleratedError);
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
		result.append(" (toleratedError: ");
		result.append(toleratedError);
		result.append(')');
		return result.toString();
	}

} //ApproximationFunctionSettingsImpl

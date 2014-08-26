/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Approximation.impl;

import CWM.Approximation.ApproximationPackage;
import CWM.Approximation.ApproximationTestResult;

import CWM.Supervised.impl.MiningTestResultImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.Approximation.impl.ApproximationTestResultImpl#getMeanPredictedValue <em>Mean Predicted Value</em>}</li>
 *   <li>{@link CWM.Approximation.impl.ApproximationTestResultImpl#getMeanActualValue <em>Mean Actual Value</em>}</li>
 *   <li>{@link CWM.Approximation.impl.ApproximationTestResultImpl#getMeanAbsoluteError <em>Mean Absolute Error</em>}</li>
 *   <li>{@link CWM.Approximation.impl.ApproximationTestResultImpl#getRmsError <em>Rms Error</em>}</li>
 *   <li>{@link CWM.Approximation.impl.ApproximationTestResultImpl#getRSquared <em>RSquared</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApproximationTestResultImpl extends MiningTestResultImpl implements ApproximationTestResult {
	/**
	 * The default value of the '{@link #getMeanPredictedValue() <em>Mean Predicted Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeanPredictedValue()
	 * @generated
	 * @ordered
	 */
	protected static final Double MEAN_PREDICTED_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMeanPredictedValue() <em>Mean Predicted Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeanPredictedValue()
	 * @generated
	 * @ordered
	 */
	protected Double meanPredictedValue = MEAN_PREDICTED_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMeanActualValue() <em>Mean Actual Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeanActualValue()
	 * @generated
	 * @ordered
	 */
	protected static final Double MEAN_ACTUAL_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMeanActualValue() <em>Mean Actual Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeanActualValue()
	 * @generated
	 * @ordered
	 */
	protected Double meanActualValue = MEAN_ACTUAL_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMeanAbsoluteError() <em>Mean Absolute Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeanAbsoluteError()
	 * @generated
	 * @ordered
	 */
	protected static final Double MEAN_ABSOLUTE_ERROR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMeanAbsoluteError() <em>Mean Absolute Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeanAbsoluteError()
	 * @generated
	 * @ordered
	 */
	protected Double meanAbsoluteError = MEAN_ABSOLUTE_ERROR_EDEFAULT;

	/**
	 * The default value of the '{@link #getRmsError() <em>Rms Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRmsError()
	 * @generated
	 * @ordered
	 */
	protected static final Double RMS_ERROR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRmsError() <em>Rms Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRmsError()
	 * @generated
	 * @ordered
	 */
	protected Double rmsError = RMS_ERROR_EDEFAULT;

	/**
	 * The default value of the '{@link #getRSquared() <em>RSquared</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRSquared()
	 * @generated
	 * @ordered
	 */
	protected static final Double RSQUARED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRSquared() <em>RSquared</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRSquared()
	 * @generated
	 * @ordered
	 */
	protected Double rSquared = RSQUARED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApproximationTestResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApproximationPackage.Literals.APPROXIMATION_TEST_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMeanPredictedValue() {
		return meanPredictedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeanPredictedValue(Double newMeanPredictedValue) {
		Double oldMeanPredictedValue = meanPredictedValue;
		meanPredictedValue = newMeanPredictedValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApproximationPackage.APPROXIMATION_TEST_RESULT__MEAN_PREDICTED_VALUE, oldMeanPredictedValue, meanPredictedValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMeanActualValue() {
		return meanActualValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeanActualValue(Double newMeanActualValue) {
		Double oldMeanActualValue = meanActualValue;
		meanActualValue = newMeanActualValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApproximationPackage.APPROXIMATION_TEST_RESULT__MEAN_ACTUAL_VALUE, oldMeanActualValue, meanActualValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMeanAbsoluteError() {
		return meanAbsoluteError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeanAbsoluteError(Double newMeanAbsoluteError) {
		Double oldMeanAbsoluteError = meanAbsoluteError;
		meanAbsoluteError = newMeanAbsoluteError;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApproximationPackage.APPROXIMATION_TEST_RESULT__MEAN_ABSOLUTE_ERROR, oldMeanAbsoluteError, meanAbsoluteError));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getRmsError() {
		return rmsError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRmsError(Double newRmsError) {
		Double oldRmsError = rmsError;
		rmsError = newRmsError;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApproximationPackage.APPROXIMATION_TEST_RESULT__RMS_ERROR, oldRmsError, rmsError));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getRSquared() {
		return rSquared;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRSquared(Double newRSquared) {
		Double oldRSquared = rSquared;
		rSquared = newRSquared;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApproximationPackage.APPROXIMATION_TEST_RESULT__RSQUARED, oldRSquared, rSquared));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApproximationPackage.APPROXIMATION_TEST_RESULT__MEAN_PREDICTED_VALUE:
				return getMeanPredictedValue();
			case ApproximationPackage.APPROXIMATION_TEST_RESULT__MEAN_ACTUAL_VALUE:
				return getMeanActualValue();
			case ApproximationPackage.APPROXIMATION_TEST_RESULT__MEAN_ABSOLUTE_ERROR:
				return getMeanAbsoluteError();
			case ApproximationPackage.APPROXIMATION_TEST_RESULT__RMS_ERROR:
				return getRmsError();
			case ApproximationPackage.APPROXIMATION_TEST_RESULT__RSQUARED:
				return getRSquared();
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
			case ApproximationPackage.APPROXIMATION_TEST_RESULT__MEAN_PREDICTED_VALUE:
				setMeanPredictedValue((Double)newValue);
				return;
			case ApproximationPackage.APPROXIMATION_TEST_RESULT__MEAN_ACTUAL_VALUE:
				setMeanActualValue((Double)newValue);
				return;
			case ApproximationPackage.APPROXIMATION_TEST_RESULT__MEAN_ABSOLUTE_ERROR:
				setMeanAbsoluteError((Double)newValue);
				return;
			case ApproximationPackage.APPROXIMATION_TEST_RESULT__RMS_ERROR:
				setRmsError((Double)newValue);
				return;
			case ApproximationPackage.APPROXIMATION_TEST_RESULT__RSQUARED:
				setRSquared((Double)newValue);
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
			case ApproximationPackage.APPROXIMATION_TEST_RESULT__MEAN_PREDICTED_VALUE:
				setMeanPredictedValue(MEAN_PREDICTED_VALUE_EDEFAULT);
				return;
			case ApproximationPackage.APPROXIMATION_TEST_RESULT__MEAN_ACTUAL_VALUE:
				setMeanActualValue(MEAN_ACTUAL_VALUE_EDEFAULT);
				return;
			case ApproximationPackage.APPROXIMATION_TEST_RESULT__MEAN_ABSOLUTE_ERROR:
				setMeanAbsoluteError(MEAN_ABSOLUTE_ERROR_EDEFAULT);
				return;
			case ApproximationPackage.APPROXIMATION_TEST_RESULT__RMS_ERROR:
				setRmsError(RMS_ERROR_EDEFAULT);
				return;
			case ApproximationPackage.APPROXIMATION_TEST_RESULT__RSQUARED:
				setRSquared(RSQUARED_EDEFAULT);
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
			case ApproximationPackage.APPROXIMATION_TEST_RESULT__MEAN_PREDICTED_VALUE:
				return MEAN_PREDICTED_VALUE_EDEFAULT == null ? meanPredictedValue != null : !MEAN_PREDICTED_VALUE_EDEFAULT.equals(meanPredictedValue);
			case ApproximationPackage.APPROXIMATION_TEST_RESULT__MEAN_ACTUAL_VALUE:
				return MEAN_ACTUAL_VALUE_EDEFAULT == null ? meanActualValue != null : !MEAN_ACTUAL_VALUE_EDEFAULT.equals(meanActualValue);
			case ApproximationPackage.APPROXIMATION_TEST_RESULT__MEAN_ABSOLUTE_ERROR:
				return MEAN_ABSOLUTE_ERROR_EDEFAULT == null ? meanAbsoluteError != null : !MEAN_ABSOLUTE_ERROR_EDEFAULT.equals(meanAbsoluteError);
			case ApproximationPackage.APPROXIMATION_TEST_RESULT__RMS_ERROR:
				return RMS_ERROR_EDEFAULT == null ? rmsError != null : !RMS_ERROR_EDEFAULT.equals(rmsError);
			case ApproximationPackage.APPROXIMATION_TEST_RESULT__RSQUARED:
				return RSQUARED_EDEFAULT == null ? rSquared != null : !RSQUARED_EDEFAULT.equals(rSquared);
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
		result.append(" (meanPredictedValue: ");
		result.append(meanPredictedValue);
		result.append(", meanActualValue: ");
		result.append(meanActualValue);
		result.append(", meanAbsoluteError: ");
		result.append(meanAbsoluteError);
		result.append(", rmsError: ");
		result.append(rmsError);
		result.append(", rSquared: ");
		result.append(rSquared);
		result.append(')');
		return result.toString();
	}

} //ApproximationTestResultImpl

/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.WarehouseProcess.Events.impl;

import CWM.WarehouseProcess.Events.EventsPackage;
import CWM.WarehouseProcess.Events.RetryEvent;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Retry Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.WarehouseProcess.Events.impl.RetryEventImpl#getWaitDuration <em>Wait Duration</em>}</li>
 *   <li>{@link CWM.WarehouseProcess.Events.impl.RetryEventImpl#getMaxCount <em>Max Count</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RetryEventImpl extends InternalEventImpl implements RetryEvent {
	/**
	 * The default value of the '{@link #getWaitDuration() <em>Wait Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaitDuration()
	 * @generated
	 * @ordered
	 */
	protected static final Float WAIT_DURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWaitDuration() <em>Wait Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaitDuration()
	 * @generated
	 * @ordered
	 */
	protected Float waitDuration = WAIT_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxCount() <em>Max Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxCount()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAX_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxCount() <em>Max Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxCount()
	 * @generated
	 * @ordered
	 */
	protected Integer maxCount = MAX_COUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RetryEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EventsPackage.Literals.RETRY_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float getWaitDuration() {
		return waitDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWaitDuration(Float newWaitDuration) {
		Float oldWaitDuration = waitDuration;
		waitDuration = newWaitDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.RETRY_EVENT__WAIT_DURATION, oldWaitDuration, waitDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMaxCount() {
		return maxCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxCount(Integer newMaxCount) {
		Integer oldMaxCount = maxCount;
		maxCount = newMaxCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventsPackage.RETRY_EVENT__MAX_COUNT, oldMaxCount, maxCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EventsPackage.RETRY_EVENT__WAIT_DURATION:
				return getWaitDuration();
			case EventsPackage.RETRY_EVENT__MAX_COUNT:
				return getMaxCount();
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
			case EventsPackage.RETRY_EVENT__WAIT_DURATION:
				setWaitDuration((Float)newValue);
				return;
			case EventsPackage.RETRY_EVENT__MAX_COUNT:
				setMaxCount((Integer)newValue);
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
			case EventsPackage.RETRY_EVENT__WAIT_DURATION:
				setWaitDuration(WAIT_DURATION_EDEFAULT);
				return;
			case EventsPackage.RETRY_EVENT__MAX_COUNT:
				setMaxCount(MAX_COUNT_EDEFAULT);
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
			case EventsPackage.RETRY_EVENT__WAIT_DURATION:
				return WAIT_DURATION_EDEFAULT == null ? waitDuration != null : !WAIT_DURATION_EDEFAULT.equals(waitDuration);
			case EventsPackage.RETRY_EVENT__MAX_COUNT:
				return MAX_COUNT_EDEFAULT == null ? maxCount != null : !MAX_COUNT_EDEFAULT.equals(maxCount);
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
		result.append(" (waitDuration: ");
		result.append(waitDuration);
		result.append(", maxCount: ");
		result.append(maxCount);
		result.append(')');
		return result.toString();
	}

} //RetryEventImpl

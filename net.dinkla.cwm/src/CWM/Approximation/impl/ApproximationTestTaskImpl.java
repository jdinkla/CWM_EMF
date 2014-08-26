/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Approximation.impl;

import CWM.Approximation.ApproximationPackage;
import CWM.Approximation.ApproximationTestResult;
import CWM.Approximation.ApproximationTestTask;

import CWM.Supervised.impl.MiningTestTaskImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.Approximation.impl.ApproximationTestTaskImpl#getTestResult <em>Test Result</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApproximationTestTaskImpl extends MiningTestTaskImpl implements ApproximationTestTask {
	/**
	 * The cached value of the '{@link #getTestResult() <em>Test Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestResult()
	 * @generated
	 * @ordered
	 */
	protected ApproximationTestResult testResult;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApproximationTestTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApproximationPackage.Literals.APPROXIMATION_TEST_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApproximationTestResult getTestResult() {
		return testResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTestResult(ApproximationTestResult newTestResult, NotificationChain msgs) {
		ApproximationTestResult oldTestResult = testResult;
		testResult = newTestResult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApproximationPackage.APPROXIMATION_TEST_TASK__TEST_RESULT, oldTestResult, newTestResult);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestResult(ApproximationTestResult newTestResult) {
		if (newTestResult != testResult) {
			NotificationChain msgs = null;
			if (testResult != null)
				msgs = ((InternalEObject)testResult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApproximationPackage.APPROXIMATION_TEST_TASK__TEST_RESULT, null, msgs);
			if (newTestResult != null)
				msgs = ((InternalEObject)newTestResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApproximationPackage.APPROXIMATION_TEST_TASK__TEST_RESULT, null, msgs);
			msgs = basicSetTestResult(newTestResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApproximationPackage.APPROXIMATION_TEST_TASK__TEST_RESULT, newTestResult, newTestResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApproximationPackage.APPROXIMATION_TEST_TASK__TEST_RESULT:
				return basicSetTestResult(null, msgs);
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
			case ApproximationPackage.APPROXIMATION_TEST_TASK__TEST_RESULT:
				return getTestResult();
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
			case ApproximationPackage.APPROXIMATION_TEST_TASK__TEST_RESULT:
				setTestResult((ApproximationTestResult)newValue);
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
			case ApproximationPackage.APPROXIMATION_TEST_TASK__TEST_RESULT:
				setTestResult((ApproximationTestResult)null);
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
			case ApproximationPackage.APPROXIMATION_TEST_TASK__TEST_RESULT:
				return testResult != null;
		}
		return super.eIsSet(featureID);
	}

} //ApproximationTestTaskImpl

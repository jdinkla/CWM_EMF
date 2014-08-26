/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Classification.impl;

import CWM.Classification.ClassificationPackage;
import CWM.Classification.ClassificationTestResult;
import CWM.Classification.ClassificationTestTask;

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
 *   <li>{@link CWM.Classification.impl.ClassificationTestTaskImpl#getTestResult <em>Test Result</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassificationTestTaskImpl extends MiningTestTaskImpl implements ClassificationTestTask {
	/**
	 * The cached value of the '{@link #getTestResult() <em>Test Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestResult()
	 * @generated
	 * @ordered
	 */
	protected ClassificationTestResult testResult;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassificationTestTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassificationPackage.Literals.CLASSIFICATION_TEST_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassificationTestResult getTestResult() {
		return testResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTestResult(ClassificationTestResult newTestResult, NotificationChain msgs) {
		ClassificationTestResult oldTestResult = testResult;
		testResult = newTestResult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ClassificationPackage.CLASSIFICATION_TEST_TASK__TEST_RESULT, oldTestResult, newTestResult);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestResult(ClassificationTestResult newTestResult) {
		if (newTestResult != testResult) {
			NotificationChain msgs = null;
			if (testResult != null)
				msgs = ((InternalEObject)testResult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ClassificationPackage.CLASSIFICATION_TEST_TASK__TEST_RESULT, null, msgs);
			if (newTestResult != null)
				msgs = ((InternalEObject)newTestResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ClassificationPackage.CLASSIFICATION_TEST_TASK__TEST_RESULT, null, msgs);
			msgs = basicSetTestResult(newTestResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassificationPackage.CLASSIFICATION_TEST_TASK__TEST_RESULT, newTestResult, newTestResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ClassificationPackage.CLASSIFICATION_TEST_TASK__TEST_RESULT:
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
			case ClassificationPackage.CLASSIFICATION_TEST_TASK__TEST_RESULT:
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
			case ClassificationPackage.CLASSIFICATION_TEST_TASK__TEST_RESULT:
				setTestResult((ClassificationTestResult)newValue);
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
			case ClassificationPackage.CLASSIFICATION_TEST_TASK__TEST_RESULT:
				setTestResult((ClassificationTestResult)null);
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
			case ClassificationPackage.CLASSIFICATION_TEST_TASK__TEST_RESULT:
				return testResult != null;
		}
		return super.eIsSet(featureID);
	}

} //ClassificationTestTaskImpl

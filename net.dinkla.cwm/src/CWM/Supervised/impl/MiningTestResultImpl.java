/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Supervised.impl;

import CWM.MiningCore.MiningResult.impl.MiningResultImpl;

import CWM.Supervised.LiftAnalysis;
import CWM.Supervised.MiningTestResult;
import CWM.Supervised.SupervisedPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mining Test Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.Supervised.impl.MiningTestResultImpl#getNumberOfTestRecords <em>Number Of Test Records</em>}</li>
 *   <li>{@link CWM.Supervised.impl.MiningTestResultImpl#getLiftAnalysis <em>Lift Analysis</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MiningTestResultImpl extends MiningResultImpl implements MiningTestResult {
	/**
	 * The default value of the '{@link #getNumberOfTestRecords() <em>Number Of Test Records</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfTestRecords()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NUMBER_OF_TEST_RECORDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberOfTestRecords() <em>Number Of Test Records</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfTestRecords()
	 * @generated
	 * @ordered
	 */
	protected Integer numberOfTestRecords = NUMBER_OF_TEST_RECORDS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLiftAnalysis() <em>Lift Analysis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiftAnalysis()
	 * @generated
	 * @ordered
	 */
	protected LiftAnalysis liftAnalysis;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MiningTestResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SupervisedPackage.Literals.MINING_TEST_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getNumberOfTestRecords() {
		return numberOfTestRecords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfTestRecords(Integer newNumberOfTestRecords) {
		Integer oldNumberOfTestRecords = numberOfTestRecords;
		numberOfTestRecords = newNumberOfTestRecords;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SupervisedPackage.MINING_TEST_RESULT__NUMBER_OF_TEST_RECORDS, oldNumberOfTestRecords, numberOfTestRecords));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiftAnalysis getLiftAnalysis() {
		return liftAnalysis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLiftAnalysis(LiftAnalysis newLiftAnalysis, NotificationChain msgs) {
		LiftAnalysis oldLiftAnalysis = liftAnalysis;
		liftAnalysis = newLiftAnalysis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SupervisedPackage.MINING_TEST_RESULT__LIFT_ANALYSIS, oldLiftAnalysis, newLiftAnalysis);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLiftAnalysis(LiftAnalysis newLiftAnalysis) {
		if (newLiftAnalysis != liftAnalysis) {
			NotificationChain msgs = null;
			if (liftAnalysis != null)
				msgs = ((InternalEObject)liftAnalysis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SupervisedPackage.MINING_TEST_RESULT__LIFT_ANALYSIS, null, msgs);
			if (newLiftAnalysis != null)
				msgs = ((InternalEObject)newLiftAnalysis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SupervisedPackage.MINING_TEST_RESULT__LIFT_ANALYSIS, null, msgs);
			msgs = basicSetLiftAnalysis(newLiftAnalysis, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SupervisedPackage.MINING_TEST_RESULT__LIFT_ANALYSIS, newLiftAnalysis, newLiftAnalysis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SupervisedPackage.MINING_TEST_RESULT__LIFT_ANALYSIS:
				return basicSetLiftAnalysis(null, msgs);
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
			case SupervisedPackage.MINING_TEST_RESULT__NUMBER_OF_TEST_RECORDS:
				return getNumberOfTestRecords();
			case SupervisedPackage.MINING_TEST_RESULT__LIFT_ANALYSIS:
				return getLiftAnalysis();
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
			case SupervisedPackage.MINING_TEST_RESULT__NUMBER_OF_TEST_RECORDS:
				setNumberOfTestRecords((Integer)newValue);
				return;
			case SupervisedPackage.MINING_TEST_RESULT__LIFT_ANALYSIS:
				setLiftAnalysis((LiftAnalysis)newValue);
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
			case SupervisedPackage.MINING_TEST_RESULT__NUMBER_OF_TEST_RECORDS:
				setNumberOfTestRecords(NUMBER_OF_TEST_RECORDS_EDEFAULT);
				return;
			case SupervisedPackage.MINING_TEST_RESULT__LIFT_ANALYSIS:
				setLiftAnalysis((LiftAnalysis)null);
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
			case SupervisedPackage.MINING_TEST_RESULT__NUMBER_OF_TEST_RECORDS:
				return NUMBER_OF_TEST_RECORDS_EDEFAULT == null ? numberOfTestRecords != null : !NUMBER_OF_TEST_RECORDS_EDEFAULT.equals(numberOfTestRecords);
			case SupervisedPackage.MINING_TEST_RESULT__LIFT_ANALYSIS:
				return liftAnalysis != null;
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
		result.append(" (numberOfTestRecords: ");
		result.append(numberOfTestRecords);
		result.append(')');
		return result.toString();
	}

} //MiningTestResultImpl

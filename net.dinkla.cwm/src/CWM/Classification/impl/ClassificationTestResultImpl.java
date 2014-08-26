/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Classification.impl;

import CWM.Classification.ClassificationPackage;
import CWM.Classification.ClassificationTestResult;

import CWM.MiningCore.MiningData.CategoryMatrix;

import CWM.Supervised.impl.MiningTestResultImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.Classification.impl.ClassificationTestResultImpl#getConfusionMatrix <em>Confusion Matrix</em>}</li>
 *   <li>{@link CWM.Classification.impl.ClassificationTestResultImpl#getAccuracy <em>Accuracy</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassificationTestResultImpl extends MiningTestResultImpl implements ClassificationTestResult {
	/**
	 * The cached value of the '{@link #getConfusionMatrix() <em>Confusion Matrix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfusionMatrix()
	 * @generated
	 * @ordered
	 */
	protected CategoryMatrix confusionMatrix;

	/**
	 * The default value of the '{@link #getAccuracy() <em>Accuracy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccuracy()
	 * @generated
	 * @ordered
	 */
	protected static final Double ACCURACY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccuracy() <em>Accuracy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccuracy()
	 * @generated
	 * @ordered
	 */
	protected Double accuracy = ACCURACY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassificationTestResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassificationPackage.Literals.CLASSIFICATION_TEST_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategoryMatrix getConfusionMatrix() {
		return confusionMatrix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfusionMatrix(CategoryMatrix newConfusionMatrix, NotificationChain msgs) {
		CategoryMatrix oldConfusionMatrix = confusionMatrix;
		confusionMatrix = newConfusionMatrix;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ClassificationPackage.CLASSIFICATION_TEST_RESULT__CONFUSION_MATRIX, oldConfusionMatrix, newConfusionMatrix);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfusionMatrix(CategoryMatrix newConfusionMatrix) {
		if (newConfusionMatrix != confusionMatrix) {
			NotificationChain msgs = null;
			if (confusionMatrix != null)
				msgs = ((InternalEObject)confusionMatrix).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ClassificationPackage.CLASSIFICATION_TEST_RESULT__CONFUSION_MATRIX, null, msgs);
			if (newConfusionMatrix != null)
				msgs = ((InternalEObject)newConfusionMatrix).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ClassificationPackage.CLASSIFICATION_TEST_RESULT__CONFUSION_MATRIX, null, msgs);
			msgs = basicSetConfusionMatrix(newConfusionMatrix, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassificationPackage.CLASSIFICATION_TEST_RESULT__CONFUSION_MATRIX, newConfusionMatrix, newConfusionMatrix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getAccuracy() {
		return accuracy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccuracy(Double newAccuracy) {
		Double oldAccuracy = accuracy;
		accuracy = newAccuracy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassificationPackage.CLASSIFICATION_TEST_RESULT__ACCURACY, oldAccuracy, accuracy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ClassificationPackage.CLASSIFICATION_TEST_RESULT__CONFUSION_MATRIX:
				return basicSetConfusionMatrix(null, msgs);
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
			case ClassificationPackage.CLASSIFICATION_TEST_RESULT__CONFUSION_MATRIX:
				return getConfusionMatrix();
			case ClassificationPackage.CLASSIFICATION_TEST_RESULT__ACCURACY:
				return getAccuracy();
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
			case ClassificationPackage.CLASSIFICATION_TEST_RESULT__CONFUSION_MATRIX:
				setConfusionMatrix((CategoryMatrix)newValue);
				return;
			case ClassificationPackage.CLASSIFICATION_TEST_RESULT__ACCURACY:
				setAccuracy((Double)newValue);
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
			case ClassificationPackage.CLASSIFICATION_TEST_RESULT__CONFUSION_MATRIX:
				setConfusionMatrix((CategoryMatrix)null);
				return;
			case ClassificationPackage.CLASSIFICATION_TEST_RESULT__ACCURACY:
				setAccuracy(ACCURACY_EDEFAULT);
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
			case ClassificationPackage.CLASSIFICATION_TEST_RESULT__CONFUSION_MATRIX:
				return confusionMatrix != null;
			case ClassificationPackage.CLASSIFICATION_TEST_RESULT__ACCURACY:
				return ACCURACY_EDEFAULT == null ? accuracy != null : !ACCURACY_EDEFAULT.equals(accuracy);
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
		result.append(" (accuracy: ");
		result.append(accuracy);
		result.append(')');
		return result.toString();
	}

} //ClassificationTestResultImpl

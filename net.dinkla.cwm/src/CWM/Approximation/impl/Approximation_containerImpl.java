/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Approximation.impl;

import CWM.Approximation.ApproximationFunctionSettings;
import CWM.Approximation.ApproximationPackage;
import CWM.Approximation.ApproximationTestResult;
import CWM.Approximation.ApproximationTestTask;
import CWM.Approximation.Approximation_container;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Approximation container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.Approximation.impl.Approximation_containerImpl#getApproximationFunctionSettings <em>Approximation Function Settings</em>}</li>
 *   <li>{@link CWM.Approximation.impl.Approximation_containerImpl#getApproximationTestResult <em>Approximation Test Result</em>}</li>
 *   <li>{@link CWM.Approximation.impl.Approximation_containerImpl#getApproximationTestTask <em>Approximation Test Task</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Approximation_containerImpl extends EObjectImpl implements Approximation_container {
	/**
	 * The cached value of the '{@link #getApproximationFunctionSettings() <em>Approximation Function Settings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApproximationFunctionSettings()
	 * @generated
	 * @ordered
	 */
	protected EList<ApproximationFunctionSettings> approximationFunctionSettings;

	/**
	 * The cached value of the '{@link #getApproximationTestResult() <em>Approximation Test Result</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApproximationTestResult()
	 * @generated
	 * @ordered
	 */
	protected EList<ApproximationTestResult> approximationTestResult;

	/**
	 * The cached value of the '{@link #getApproximationTestTask() <em>Approximation Test Task</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApproximationTestTask()
	 * @generated
	 * @ordered
	 */
	protected EList<ApproximationTestTask> approximationTestTask;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Approximation_containerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApproximationPackage.Literals.APPROXIMATION_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ApproximationFunctionSettings> getApproximationFunctionSettings() {
		if (approximationFunctionSettings == null) {
			approximationFunctionSettings = new EObjectContainmentEList<ApproximationFunctionSettings>(ApproximationFunctionSettings.class, this, ApproximationPackage.APPROXIMATION_CONTAINER__APPROXIMATION_FUNCTION_SETTINGS);
		}
		return approximationFunctionSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ApproximationTestResult> getApproximationTestResult() {
		if (approximationTestResult == null) {
			approximationTestResult = new EObjectContainmentEList<ApproximationTestResult>(ApproximationTestResult.class, this, ApproximationPackage.APPROXIMATION_CONTAINER__APPROXIMATION_TEST_RESULT);
		}
		return approximationTestResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ApproximationTestTask> getApproximationTestTask() {
		if (approximationTestTask == null) {
			approximationTestTask = new EObjectContainmentEList<ApproximationTestTask>(ApproximationTestTask.class, this, ApproximationPackage.APPROXIMATION_CONTAINER__APPROXIMATION_TEST_TASK);
		}
		return approximationTestTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApproximationPackage.APPROXIMATION_CONTAINER__APPROXIMATION_FUNCTION_SETTINGS:
				return ((InternalEList<?>)getApproximationFunctionSettings()).basicRemove(otherEnd, msgs);
			case ApproximationPackage.APPROXIMATION_CONTAINER__APPROXIMATION_TEST_RESULT:
				return ((InternalEList<?>)getApproximationTestResult()).basicRemove(otherEnd, msgs);
			case ApproximationPackage.APPROXIMATION_CONTAINER__APPROXIMATION_TEST_TASK:
				return ((InternalEList<?>)getApproximationTestTask()).basicRemove(otherEnd, msgs);
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
			case ApproximationPackage.APPROXIMATION_CONTAINER__APPROXIMATION_FUNCTION_SETTINGS:
				return getApproximationFunctionSettings();
			case ApproximationPackage.APPROXIMATION_CONTAINER__APPROXIMATION_TEST_RESULT:
				return getApproximationTestResult();
			case ApproximationPackage.APPROXIMATION_CONTAINER__APPROXIMATION_TEST_TASK:
				return getApproximationTestTask();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ApproximationPackage.APPROXIMATION_CONTAINER__APPROXIMATION_FUNCTION_SETTINGS:
				getApproximationFunctionSettings().clear();
				getApproximationFunctionSettings().addAll((Collection<? extends ApproximationFunctionSettings>)newValue);
				return;
			case ApproximationPackage.APPROXIMATION_CONTAINER__APPROXIMATION_TEST_RESULT:
				getApproximationTestResult().clear();
				getApproximationTestResult().addAll((Collection<? extends ApproximationTestResult>)newValue);
				return;
			case ApproximationPackage.APPROXIMATION_CONTAINER__APPROXIMATION_TEST_TASK:
				getApproximationTestTask().clear();
				getApproximationTestTask().addAll((Collection<? extends ApproximationTestTask>)newValue);
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
			case ApproximationPackage.APPROXIMATION_CONTAINER__APPROXIMATION_FUNCTION_SETTINGS:
				getApproximationFunctionSettings().clear();
				return;
			case ApproximationPackage.APPROXIMATION_CONTAINER__APPROXIMATION_TEST_RESULT:
				getApproximationTestResult().clear();
				return;
			case ApproximationPackage.APPROXIMATION_CONTAINER__APPROXIMATION_TEST_TASK:
				getApproximationTestTask().clear();
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
			case ApproximationPackage.APPROXIMATION_CONTAINER__APPROXIMATION_FUNCTION_SETTINGS:
				return approximationFunctionSettings != null && !approximationFunctionSettings.isEmpty();
			case ApproximationPackage.APPROXIMATION_CONTAINER__APPROXIMATION_TEST_RESULT:
				return approximationTestResult != null && !approximationTestResult.isEmpty();
			case ApproximationPackage.APPROXIMATION_CONTAINER__APPROXIMATION_TEST_TASK:
				return approximationTestTask != null && !approximationTestTask.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Approximation_containerImpl

/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.WarehouseOperation.impl;

import CWM.CwmTransformation.TransformationActivity;

import CWM.WarehouseOperation.ActivityExecution;
import CWM.WarehouseOperation.StepExecution;
import CWM.WarehouseOperation.WarehouseOperationPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Execution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.WarehouseOperation.impl.ActivityExecutionImpl#getTransformationActivity <em>Transformation Activity</em>}</li>
 *   <li>{@link CWM.WarehouseOperation.impl.ActivityExecutionImpl#getStepExecution <em>Step Execution</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityExecutionImpl extends TransformationExecutionImpl implements ActivityExecution {
	/**
	 * The cached value of the '{@link #getTransformationActivity() <em>Transformation Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformationActivity()
	 * @generated
	 * @ordered
	 */
	protected TransformationActivity transformationActivity;

	/**
	 * The cached value of the '{@link #getStepExecution() <em>Step Execution</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepExecution()
	 * @generated
	 * @ordered
	 */
	protected EList<StepExecution> stepExecution;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityExecutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WarehouseOperationPackage.Literals.ACTIVITY_EXECUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationActivity getTransformationActivity() {
		if (transformationActivity != null && transformationActivity.eIsProxy()) {
			InternalEObject oldTransformationActivity = (InternalEObject)transformationActivity;
			transformationActivity = (TransformationActivity)eResolveProxy(oldTransformationActivity);
			if (transformationActivity != oldTransformationActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WarehouseOperationPackage.ACTIVITY_EXECUTION__TRANSFORMATION_ACTIVITY, oldTransformationActivity, transformationActivity));
			}
		}
		return transformationActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationActivity basicGetTransformationActivity() {
		return transformationActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformationActivity(TransformationActivity newTransformationActivity) {
		TransformationActivity oldTransformationActivity = transformationActivity;
		transformationActivity = newTransformationActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WarehouseOperationPackage.ACTIVITY_EXECUTION__TRANSFORMATION_ACTIVITY, oldTransformationActivity, transformationActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StepExecution> getStepExecution() {
		if (stepExecution == null) {
			stepExecution = new EObjectContainmentWithInverseEList<StepExecution>(StepExecution.class, this, WarehouseOperationPackage.ACTIVITY_EXECUTION__STEP_EXECUTION, WarehouseOperationPackage.STEP_EXECUTION__ACTIVITY_EXECUTION);
		}
		return stepExecution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WarehouseOperationPackage.ACTIVITY_EXECUTION__STEP_EXECUTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStepExecution()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WarehouseOperationPackage.ACTIVITY_EXECUTION__STEP_EXECUTION:
				return ((InternalEList<?>)getStepExecution()).basicRemove(otherEnd, msgs);
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
			case WarehouseOperationPackage.ACTIVITY_EXECUTION__TRANSFORMATION_ACTIVITY:
				if (resolve) return getTransformationActivity();
				return basicGetTransformationActivity();
			case WarehouseOperationPackage.ACTIVITY_EXECUTION__STEP_EXECUTION:
				return getStepExecution();
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
			case WarehouseOperationPackage.ACTIVITY_EXECUTION__TRANSFORMATION_ACTIVITY:
				setTransformationActivity((TransformationActivity)newValue);
				return;
			case WarehouseOperationPackage.ACTIVITY_EXECUTION__STEP_EXECUTION:
				getStepExecution().clear();
				getStepExecution().addAll((Collection<? extends StepExecution>)newValue);
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
			case WarehouseOperationPackage.ACTIVITY_EXECUTION__TRANSFORMATION_ACTIVITY:
				setTransformationActivity((TransformationActivity)null);
				return;
			case WarehouseOperationPackage.ACTIVITY_EXECUTION__STEP_EXECUTION:
				getStepExecution().clear();
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
			case WarehouseOperationPackage.ACTIVITY_EXECUTION__TRANSFORMATION_ACTIVITY:
				return transformationActivity != null;
			case WarehouseOperationPackage.ACTIVITY_EXECUTION__STEP_EXECUTION:
				return stepExecution != null && !stepExecution.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActivityExecutionImpl

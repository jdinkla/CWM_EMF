/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.WarehouseOperation.impl;

import CWM.Behavioral.CallAction;

import CWM.CwmTransformation.TransformationStep;

import CWM.WarehouseOperation.ActivityExecution;
import CWM.WarehouseOperation.StepExecution;
import CWM.WarehouseOperation.WarehouseOperationPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Step Execution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.WarehouseOperation.impl.StepExecutionImpl#getTransformationStep <em>Transformation Step</em>}</li>
 *   <li>{@link CWM.WarehouseOperation.impl.StepExecutionImpl#getActivityExecution <em>Activity Execution</em>}</li>
 *   <li>{@link CWM.WarehouseOperation.impl.StepExecutionImpl#getCallAction <em>Call Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StepExecutionImpl extends TransformationExecutionImpl implements StepExecution {
	/**
	 * The cached value of the '{@link #getTransformationStep() <em>Transformation Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformationStep()
	 * @generated
	 * @ordered
	 */
	protected TransformationStep transformationStep;

	/**
	 * The cached value of the '{@link #getCallAction() <em>Call Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallAction()
	 * @generated
	 * @ordered
	 */
	protected CallAction callAction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StepExecutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WarehouseOperationPackage.Literals.STEP_EXECUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationStep getTransformationStep() {
		if (transformationStep != null && transformationStep.eIsProxy()) {
			InternalEObject oldTransformationStep = (InternalEObject)transformationStep;
			transformationStep = (TransformationStep)eResolveProxy(oldTransformationStep);
			if (transformationStep != oldTransformationStep) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WarehouseOperationPackage.STEP_EXECUTION__TRANSFORMATION_STEP, oldTransformationStep, transformationStep));
			}
		}
		return transformationStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationStep basicGetTransformationStep() {
		return transformationStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformationStep(TransformationStep newTransformationStep) {
		TransformationStep oldTransformationStep = transformationStep;
		transformationStep = newTransformationStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WarehouseOperationPackage.STEP_EXECUTION__TRANSFORMATION_STEP, oldTransformationStep, transformationStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityExecution getActivityExecution() {
		if (eContainerFeatureID != WarehouseOperationPackage.STEP_EXECUTION__ACTIVITY_EXECUTION) return null;
		return (ActivityExecution)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivityExecution(ActivityExecution newActivityExecution, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newActivityExecution, WarehouseOperationPackage.STEP_EXECUTION__ACTIVITY_EXECUTION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivityExecution(ActivityExecution newActivityExecution) {
		if (newActivityExecution != eInternalContainer() || (eContainerFeatureID != WarehouseOperationPackage.STEP_EXECUTION__ACTIVITY_EXECUTION && newActivityExecution != null)) {
			if (EcoreUtil.isAncestor(this, newActivityExecution))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newActivityExecution != null)
				msgs = ((InternalEObject)newActivityExecution).eInverseAdd(this, WarehouseOperationPackage.ACTIVITY_EXECUTION__STEP_EXECUTION, ActivityExecution.class, msgs);
			msgs = basicSetActivityExecution(newActivityExecution, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WarehouseOperationPackage.STEP_EXECUTION__ACTIVITY_EXECUTION, newActivityExecution, newActivityExecution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallAction getCallAction() {
		if (callAction != null && callAction.eIsProxy()) {
			InternalEObject oldCallAction = (InternalEObject)callAction;
			callAction = (CallAction)eResolveProxy(oldCallAction);
			if (callAction != oldCallAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WarehouseOperationPackage.STEP_EXECUTION__CALL_ACTION, oldCallAction, callAction));
			}
		}
		return callAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallAction basicGetCallAction() {
		return callAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallAction(CallAction newCallAction) {
		CallAction oldCallAction = callAction;
		callAction = newCallAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WarehouseOperationPackage.STEP_EXECUTION__CALL_ACTION, oldCallAction, callAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WarehouseOperationPackage.STEP_EXECUTION__ACTIVITY_EXECUTION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetActivityExecution((ActivityExecution)otherEnd, msgs);
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
			case WarehouseOperationPackage.STEP_EXECUTION__ACTIVITY_EXECUTION:
				return basicSetActivityExecution(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case WarehouseOperationPackage.STEP_EXECUTION__ACTIVITY_EXECUTION:
				return eInternalContainer().eInverseRemove(this, WarehouseOperationPackage.ACTIVITY_EXECUTION__STEP_EXECUTION, ActivityExecution.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WarehouseOperationPackage.STEP_EXECUTION__TRANSFORMATION_STEP:
				if (resolve) return getTransformationStep();
				return basicGetTransformationStep();
			case WarehouseOperationPackage.STEP_EXECUTION__ACTIVITY_EXECUTION:
				return getActivityExecution();
			case WarehouseOperationPackage.STEP_EXECUTION__CALL_ACTION:
				if (resolve) return getCallAction();
				return basicGetCallAction();
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
			case WarehouseOperationPackage.STEP_EXECUTION__TRANSFORMATION_STEP:
				setTransformationStep((TransformationStep)newValue);
				return;
			case WarehouseOperationPackage.STEP_EXECUTION__ACTIVITY_EXECUTION:
				setActivityExecution((ActivityExecution)newValue);
				return;
			case WarehouseOperationPackage.STEP_EXECUTION__CALL_ACTION:
				setCallAction((CallAction)newValue);
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
			case WarehouseOperationPackage.STEP_EXECUTION__TRANSFORMATION_STEP:
				setTransformationStep((TransformationStep)null);
				return;
			case WarehouseOperationPackage.STEP_EXECUTION__ACTIVITY_EXECUTION:
				setActivityExecution((ActivityExecution)null);
				return;
			case WarehouseOperationPackage.STEP_EXECUTION__CALL_ACTION:
				setCallAction((CallAction)null);
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
			case WarehouseOperationPackage.STEP_EXECUTION__TRANSFORMATION_STEP:
				return transformationStep != null;
			case WarehouseOperationPackage.STEP_EXECUTION__ACTIVITY_EXECUTION:
				return getActivityExecution() != null;
			case WarehouseOperationPackage.STEP_EXECUTION__CALL_ACTION:
				return callAction != null;
		}
		return super.eIsSet(featureID);
	}

} //StepExecutionImpl

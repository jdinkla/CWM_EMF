/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.WarehouseOperation.impl;

import CWM.WarehouseOperation.ActivityExecution;
import CWM.WarehouseOperation.ChangeRequest;
import CWM.WarehouseOperation.Measurement;
import CWM.WarehouseOperation.StepExecution;
import CWM.WarehouseOperation.TransformationExecution;
import CWM.WarehouseOperation.WarehouseOperationPackage;
import CWM.WarehouseOperation.WarehouseOperation_container;

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
 * An implementation of the model object '<em><b>Warehouse Operation container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.WarehouseOperation.impl.WarehouseOperation_containerImpl#getMeasurement <em>Measurement</em>}</li>
 *   <li>{@link CWM.WarehouseOperation.impl.WarehouseOperation_containerImpl#getChangeRequest <em>Change Request</em>}</li>
 *   <li>{@link CWM.WarehouseOperation.impl.WarehouseOperation_containerImpl#getTransformationExecution <em>Transformation Execution</em>}</li>
 *   <li>{@link CWM.WarehouseOperation.impl.WarehouseOperation_containerImpl#getActivityExecution <em>Activity Execution</em>}</li>
 *   <li>{@link CWM.WarehouseOperation.impl.WarehouseOperation_containerImpl#getStepExecution <em>Step Execution</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WarehouseOperation_containerImpl extends EObjectImpl implements WarehouseOperation_container {
	/**
	 * The cached value of the '{@link #getMeasurement() <em>Measurement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurement()
	 * @generated
	 * @ordered
	 */
	protected EList<Measurement> measurement;

	/**
	 * The cached value of the '{@link #getChangeRequest() <em>Change Request</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeRequest()
	 * @generated
	 * @ordered
	 */
	protected EList<ChangeRequest> changeRequest;

	/**
	 * The cached value of the '{@link #getTransformationExecution() <em>Transformation Execution</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformationExecution()
	 * @generated
	 * @ordered
	 */
	protected EList<TransformationExecution> transformationExecution;

	/**
	 * The cached value of the '{@link #getActivityExecution() <em>Activity Execution</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityExecution()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityExecution> activityExecution;

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
	protected WarehouseOperation_containerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WarehouseOperationPackage.Literals.WAREHOUSE_OPERATION_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Measurement> getMeasurement() {
		if (measurement == null) {
			measurement = new EObjectContainmentEList<Measurement>(Measurement.class, this, WarehouseOperationPackage.WAREHOUSE_OPERATION_CONTAINER__MEASUREMENT);
		}
		return measurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChangeRequest> getChangeRequest() {
		if (changeRequest == null) {
			changeRequest = new EObjectContainmentEList<ChangeRequest>(ChangeRequest.class, this, WarehouseOperationPackage.WAREHOUSE_OPERATION_CONTAINER__CHANGE_REQUEST);
		}
		return changeRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransformationExecution> getTransformationExecution() {
		if (transformationExecution == null) {
			transformationExecution = new EObjectContainmentEList<TransformationExecution>(TransformationExecution.class, this, WarehouseOperationPackage.WAREHOUSE_OPERATION_CONTAINER__TRANSFORMATION_EXECUTION);
		}
		return transformationExecution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityExecution> getActivityExecution() {
		if (activityExecution == null) {
			activityExecution = new EObjectContainmentEList<ActivityExecution>(ActivityExecution.class, this, WarehouseOperationPackage.WAREHOUSE_OPERATION_CONTAINER__ACTIVITY_EXECUTION);
		}
		return activityExecution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StepExecution> getStepExecution() {
		if (stepExecution == null) {
			stepExecution = new EObjectContainmentEList<StepExecution>(StepExecution.class, this, WarehouseOperationPackage.WAREHOUSE_OPERATION_CONTAINER__STEP_EXECUTION);
		}
		return stepExecution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WarehouseOperationPackage.WAREHOUSE_OPERATION_CONTAINER__MEASUREMENT:
				return ((InternalEList<?>)getMeasurement()).basicRemove(otherEnd, msgs);
			case WarehouseOperationPackage.WAREHOUSE_OPERATION_CONTAINER__CHANGE_REQUEST:
				return ((InternalEList<?>)getChangeRequest()).basicRemove(otherEnd, msgs);
			case WarehouseOperationPackage.WAREHOUSE_OPERATION_CONTAINER__TRANSFORMATION_EXECUTION:
				return ((InternalEList<?>)getTransformationExecution()).basicRemove(otherEnd, msgs);
			case WarehouseOperationPackage.WAREHOUSE_OPERATION_CONTAINER__ACTIVITY_EXECUTION:
				return ((InternalEList<?>)getActivityExecution()).basicRemove(otherEnd, msgs);
			case WarehouseOperationPackage.WAREHOUSE_OPERATION_CONTAINER__STEP_EXECUTION:
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
			case WarehouseOperationPackage.WAREHOUSE_OPERATION_CONTAINER__MEASUREMENT:
				return getMeasurement();
			case WarehouseOperationPackage.WAREHOUSE_OPERATION_CONTAINER__CHANGE_REQUEST:
				return getChangeRequest();
			case WarehouseOperationPackage.WAREHOUSE_OPERATION_CONTAINER__TRANSFORMATION_EXECUTION:
				return getTransformationExecution();
			case WarehouseOperationPackage.WAREHOUSE_OPERATION_CONTAINER__ACTIVITY_EXECUTION:
				return getActivityExecution();
			case WarehouseOperationPackage.WAREHOUSE_OPERATION_CONTAINER__STEP_EXECUTION:
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
			case WarehouseOperationPackage.WAREHOUSE_OPERATION_CONTAINER__MEASUREMENT:
				getMeasurement().clear();
				getMeasurement().addAll((Collection<? extends Measurement>)newValue);
				return;
			case WarehouseOperationPackage.WAREHOUSE_OPERATION_CONTAINER__CHANGE_REQUEST:
				getChangeRequest().clear();
				getChangeRequest().addAll((Collection<? extends ChangeRequest>)newValue);
				return;
			case WarehouseOperationPackage.WAREHOUSE_OPERATION_CONTAINER__TRANSFORMATION_EXECUTION:
				getTransformationExecution().clear();
				getTransformationExecution().addAll((Collection<? extends TransformationExecution>)newValue);
				return;
			case WarehouseOperationPackage.WAREHOUSE_OPERATION_CONTAINER__ACTIVITY_EXECUTION:
				getActivityExecution().clear();
				getActivityExecution().addAll((Collection<? extends ActivityExecution>)newValue);
				return;
			case WarehouseOperationPackage.WAREHOUSE_OPERATION_CONTAINER__STEP_EXECUTION:
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
			case WarehouseOperationPackage.WAREHOUSE_OPERATION_CONTAINER__MEASUREMENT:
				getMeasurement().clear();
				return;
			case WarehouseOperationPackage.WAREHOUSE_OPERATION_CONTAINER__CHANGE_REQUEST:
				getChangeRequest().clear();
				return;
			case WarehouseOperationPackage.WAREHOUSE_OPERATION_CONTAINER__TRANSFORMATION_EXECUTION:
				getTransformationExecution().clear();
				return;
			case WarehouseOperationPackage.WAREHOUSE_OPERATION_CONTAINER__ACTIVITY_EXECUTION:
				getActivityExecution().clear();
				return;
			case WarehouseOperationPackage.WAREHOUSE_OPERATION_CONTAINER__STEP_EXECUTION:
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
			case WarehouseOperationPackage.WAREHOUSE_OPERATION_CONTAINER__MEASUREMENT:
				return measurement != null && !measurement.isEmpty();
			case WarehouseOperationPackage.WAREHOUSE_OPERATION_CONTAINER__CHANGE_REQUEST:
				return changeRequest != null && !changeRequest.isEmpty();
			case WarehouseOperationPackage.WAREHOUSE_OPERATION_CONTAINER__TRANSFORMATION_EXECUTION:
				return transformationExecution != null && !transformationExecution.isEmpty();
			case WarehouseOperationPackage.WAREHOUSE_OPERATION_CONTAINER__ACTIVITY_EXECUTION:
				return activityExecution != null && !activityExecution.isEmpty();
			case WarehouseOperationPackage.WAREHOUSE_OPERATION_CONTAINER__STEP_EXECUTION:
				return stepExecution != null && !stepExecution.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WarehouseOperation_containerImpl

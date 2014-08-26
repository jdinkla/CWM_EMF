/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningTask.impl;

import CWM.Core.impl.ModelElementImpl;

import CWM.MiningCore.MiningData.AttributeAssignmentSet;
import CWM.MiningCore.MiningData.PhysicalData;

import CWM.MiningCore.MiningModel.MiningModel;

import CWM.MiningCore.MiningTask.MiningTask;
import CWM.MiningCore.MiningTask.MiningTaskPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mining Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.MiningCore.MiningTask.impl.MiningTaskImpl#getInputData <em>Input Data</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningTask.impl.MiningTaskImpl#getModelAssignment <em>Model Assignment</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningTask.impl.MiningTaskImpl#getInputModel <em>Input Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MiningTaskImpl extends ModelElementImpl implements MiningTask {
	/**
	 * The cached value of the '{@link #getInputData() <em>Input Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputData()
	 * @generated
	 * @ordered
	 */
	protected PhysicalData inputData;

	/**
	 * The cached value of the '{@link #getModelAssignment() <em>Model Assignment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelAssignment()
	 * @generated
	 * @ordered
	 */
	protected AttributeAssignmentSet modelAssignment;

	/**
	 * The cached value of the '{@link #getInputModel() <em>Input Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputModel()
	 * @generated
	 * @ordered
	 */
	protected MiningModel inputModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MiningTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MiningTaskPackage.Literals.MINING_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalData getInputData() {
		if (inputData != null && inputData.eIsProxy()) {
			InternalEObject oldInputData = (InternalEObject)inputData;
			inputData = (PhysicalData)eResolveProxy(oldInputData);
			if (inputData != oldInputData) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MiningTaskPackage.MINING_TASK__INPUT_DATA, oldInputData, inputData));
			}
		}
		return inputData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalData basicGetInputData() {
		return inputData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputData(PhysicalData newInputData) {
		PhysicalData oldInputData = inputData;
		inputData = newInputData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiningTaskPackage.MINING_TASK__INPUT_DATA, oldInputData, inputData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeAssignmentSet getModelAssignment() {
		if (modelAssignment != null && modelAssignment.eIsProxy()) {
			InternalEObject oldModelAssignment = (InternalEObject)modelAssignment;
			modelAssignment = (AttributeAssignmentSet)eResolveProxy(oldModelAssignment);
			if (modelAssignment != oldModelAssignment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MiningTaskPackage.MINING_TASK__MODEL_ASSIGNMENT, oldModelAssignment, modelAssignment));
			}
		}
		return modelAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeAssignmentSet basicGetModelAssignment() {
		return modelAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelAssignment(AttributeAssignmentSet newModelAssignment) {
		AttributeAssignmentSet oldModelAssignment = modelAssignment;
		modelAssignment = newModelAssignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiningTaskPackage.MINING_TASK__MODEL_ASSIGNMENT, oldModelAssignment, modelAssignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiningModel getInputModel() {
		if (inputModel != null && inputModel.eIsProxy()) {
			InternalEObject oldInputModel = (InternalEObject)inputModel;
			inputModel = (MiningModel)eResolveProxy(oldInputModel);
			if (inputModel != oldInputModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MiningTaskPackage.MINING_TASK__INPUT_MODEL, oldInputModel, inputModel));
			}
		}
		return inputModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiningModel basicGetInputModel() {
		return inputModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputModel(MiningModel newInputModel) {
		MiningModel oldInputModel = inputModel;
		inputModel = newInputModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiningTaskPackage.MINING_TASK__INPUT_MODEL, oldInputModel, inputModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MiningTaskPackage.MINING_TASK__INPUT_DATA:
				if (resolve) return getInputData();
				return basicGetInputData();
			case MiningTaskPackage.MINING_TASK__MODEL_ASSIGNMENT:
				if (resolve) return getModelAssignment();
				return basicGetModelAssignment();
			case MiningTaskPackage.MINING_TASK__INPUT_MODEL:
				if (resolve) return getInputModel();
				return basicGetInputModel();
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
			case MiningTaskPackage.MINING_TASK__INPUT_DATA:
				setInputData((PhysicalData)newValue);
				return;
			case MiningTaskPackage.MINING_TASK__MODEL_ASSIGNMENT:
				setModelAssignment((AttributeAssignmentSet)newValue);
				return;
			case MiningTaskPackage.MINING_TASK__INPUT_MODEL:
				setInputModel((MiningModel)newValue);
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
			case MiningTaskPackage.MINING_TASK__INPUT_DATA:
				setInputData((PhysicalData)null);
				return;
			case MiningTaskPackage.MINING_TASK__MODEL_ASSIGNMENT:
				setModelAssignment((AttributeAssignmentSet)null);
				return;
			case MiningTaskPackage.MINING_TASK__INPUT_MODEL:
				setInputModel((MiningModel)null);
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
			case MiningTaskPackage.MINING_TASK__INPUT_DATA:
				return inputData != null;
			case MiningTaskPackage.MINING_TASK__MODEL_ASSIGNMENT:
				return modelAssignment != null;
			case MiningTaskPackage.MINING_TASK__INPUT_MODEL:
				return inputModel != null;
		}
		return super.eIsSet(featureID);
	}

} //MiningTaskImpl

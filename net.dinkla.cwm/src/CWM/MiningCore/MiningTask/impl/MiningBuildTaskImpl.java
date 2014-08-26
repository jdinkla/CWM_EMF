/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningTask.impl;

import CWM.MiningCore.MiningData.AttributeAssignmentSet;
import CWM.MiningCore.MiningData.PhysicalData;

import CWM.MiningCore.MiningFunctionSettings.MiningFunctionSettings;

import CWM.MiningCore.MiningModel.MiningModel;

import CWM.MiningCore.MiningTask.MiningBuildTask;
import CWM.MiningCore.MiningTask.MiningTaskPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mining Build Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.MiningCore.MiningTask.impl.MiningBuildTaskImpl#getMiningSettings <em>Mining Settings</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningTask.impl.MiningBuildTaskImpl#getSettingsAssignment <em>Settings Assignment</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningTask.impl.MiningBuildTaskImpl#getValidationData <em>Validation Data</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningTask.impl.MiningBuildTaskImpl#getValidationAssignment <em>Validation Assignment</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningTask.impl.MiningBuildTaskImpl#getResultModel <em>Result Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MiningBuildTaskImpl extends MiningTaskImpl implements MiningBuildTask {
	/**
	 * The cached value of the '{@link #getMiningSettings() <em>Mining Settings</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiningSettings()
	 * @generated
	 * @ordered
	 */
	protected MiningFunctionSettings miningSettings;

	/**
	 * The cached value of the '{@link #getSettingsAssignment() <em>Settings Assignment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSettingsAssignment()
	 * @generated
	 * @ordered
	 */
	protected AttributeAssignmentSet settingsAssignment;

	/**
	 * The cached value of the '{@link #getValidationData() <em>Validation Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidationData()
	 * @generated
	 * @ordered
	 */
	protected PhysicalData validationData;

	/**
	 * The cached value of the '{@link #getValidationAssignment() <em>Validation Assignment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidationAssignment()
	 * @generated
	 * @ordered
	 */
	protected AttributeAssignmentSet validationAssignment;

	/**
	 * The cached value of the '{@link #getResultModel() <em>Result Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultModel()
	 * @generated
	 * @ordered
	 */
	protected MiningModel resultModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MiningBuildTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MiningTaskPackage.Literals.MINING_BUILD_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiningFunctionSettings getMiningSettings() {
		if (miningSettings != null && miningSettings.eIsProxy()) {
			InternalEObject oldMiningSettings = (InternalEObject)miningSettings;
			miningSettings = (MiningFunctionSettings)eResolveProxy(oldMiningSettings);
			if (miningSettings != oldMiningSettings) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MiningTaskPackage.MINING_BUILD_TASK__MINING_SETTINGS, oldMiningSettings, miningSettings));
			}
		}
		return miningSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiningFunctionSettings basicGetMiningSettings() {
		return miningSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMiningSettings(MiningFunctionSettings newMiningSettings) {
		MiningFunctionSettings oldMiningSettings = miningSettings;
		miningSettings = newMiningSettings;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiningTaskPackage.MINING_BUILD_TASK__MINING_SETTINGS, oldMiningSettings, miningSettings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeAssignmentSet getSettingsAssignment() {
		if (settingsAssignment != null && settingsAssignment.eIsProxy()) {
			InternalEObject oldSettingsAssignment = (InternalEObject)settingsAssignment;
			settingsAssignment = (AttributeAssignmentSet)eResolveProxy(oldSettingsAssignment);
			if (settingsAssignment != oldSettingsAssignment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MiningTaskPackage.MINING_BUILD_TASK__SETTINGS_ASSIGNMENT, oldSettingsAssignment, settingsAssignment));
			}
		}
		return settingsAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeAssignmentSet basicGetSettingsAssignment() {
		return settingsAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSettingsAssignment(AttributeAssignmentSet newSettingsAssignment) {
		AttributeAssignmentSet oldSettingsAssignment = settingsAssignment;
		settingsAssignment = newSettingsAssignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiningTaskPackage.MINING_BUILD_TASK__SETTINGS_ASSIGNMENT, oldSettingsAssignment, settingsAssignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalData getValidationData() {
		if (validationData != null && validationData.eIsProxy()) {
			InternalEObject oldValidationData = (InternalEObject)validationData;
			validationData = (PhysicalData)eResolveProxy(oldValidationData);
			if (validationData != oldValidationData) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MiningTaskPackage.MINING_BUILD_TASK__VALIDATION_DATA, oldValidationData, validationData));
			}
		}
		return validationData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalData basicGetValidationData() {
		return validationData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidationData(PhysicalData newValidationData) {
		PhysicalData oldValidationData = validationData;
		validationData = newValidationData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiningTaskPackage.MINING_BUILD_TASK__VALIDATION_DATA, oldValidationData, validationData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeAssignmentSet getValidationAssignment() {
		if (validationAssignment != null && validationAssignment.eIsProxy()) {
			InternalEObject oldValidationAssignment = (InternalEObject)validationAssignment;
			validationAssignment = (AttributeAssignmentSet)eResolveProxy(oldValidationAssignment);
			if (validationAssignment != oldValidationAssignment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MiningTaskPackage.MINING_BUILD_TASK__VALIDATION_ASSIGNMENT, oldValidationAssignment, validationAssignment));
			}
		}
		return validationAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeAssignmentSet basicGetValidationAssignment() {
		return validationAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidationAssignment(AttributeAssignmentSet newValidationAssignment) {
		AttributeAssignmentSet oldValidationAssignment = validationAssignment;
		validationAssignment = newValidationAssignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiningTaskPackage.MINING_BUILD_TASK__VALIDATION_ASSIGNMENT, oldValidationAssignment, validationAssignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiningModel getResultModel() {
		if (resultModel != null && resultModel.eIsProxy()) {
			InternalEObject oldResultModel = (InternalEObject)resultModel;
			resultModel = (MiningModel)eResolveProxy(oldResultModel);
			if (resultModel != oldResultModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MiningTaskPackage.MINING_BUILD_TASK__RESULT_MODEL, oldResultModel, resultModel));
			}
		}
		return resultModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiningModel basicGetResultModel() {
		return resultModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultModel(MiningModel newResultModel) {
		MiningModel oldResultModel = resultModel;
		resultModel = newResultModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiningTaskPackage.MINING_BUILD_TASK__RESULT_MODEL, oldResultModel, resultModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MiningTaskPackage.MINING_BUILD_TASK__MINING_SETTINGS:
				if (resolve) return getMiningSettings();
				return basicGetMiningSettings();
			case MiningTaskPackage.MINING_BUILD_TASK__SETTINGS_ASSIGNMENT:
				if (resolve) return getSettingsAssignment();
				return basicGetSettingsAssignment();
			case MiningTaskPackage.MINING_BUILD_TASK__VALIDATION_DATA:
				if (resolve) return getValidationData();
				return basicGetValidationData();
			case MiningTaskPackage.MINING_BUILD_TASK__VALIDATION_ASSIGNMENT:
				if (resolve) return getValidationAssignment();
				return basicGetValidationAssignment();
			case MiningTaskPackage.MINING_BUILD_TASK__RESULT_MODEL:
				if (resolve) return getResultModel();
				return basicGetResultModel();
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
			case MiningTaskPackage.MINING_BUILD_TASK__MINING_SETTINGS:
				setMiningSettings((MiningFunctionSettings)newValue);
				return;
			case MiningTaskPackage.MINING_BUILD_TASK__SETTINGS_ASSIGNMENT:
				setSettingsAssignment((AttributeAssignmentSet)newValue);
				return;
			case MiningTaskPackage.MINING_BUILD_TASK__VALIDATION_DATA:
				setValidationData((PhysicalData)newValue);
				return;
			case MiningTaskPackage.MINING_BUILD_TASK__VALIDATION_ASSIGNMENT:
				setValidationAssignment((AttributeAssignmentSet)newValue);
				return;
			case MiningTaskPackage.MINING_BUILD_TASK__RESULT_MODEL:
				setResultModel((MiningModel)newValue);
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
			case MiningTaskPackage.MINING_BUILD_TASK__MINING_SETTINGS:
				setMiningSettings((MiningFunctionSettings)null);
				return;
			case MiningTaskPackage.MINING_BUILD_TASK__SETTINGS_ASSIGNMENT:
				setSettingsAssignment((AttributeAssignmentSet)null);
				return;
			case MiningTaskPackage.MINING_BUILD_TASK__VALIDATION_DATA:
				setValidationData((PhysicalData)null);
				return;
			case MiningTaskPackage.MINING_BUILD_TASK__VALIDATION_ASSIGNMENT:
				setValidationAssignment((AttributeAssignmentSet)null);
				return;
			case MiningTaskPackage.MINING_BUILD_TASK__RESULT_MODEL:
				setResultModel((MiningModel)null);
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
			case MiningTaskPackage.MINING_BUILD_TASK__MINING_SETTINGS:
				return miningSettings != null;
			case MiningTaskPackage.MINING_BUILD_TASK__SETTINGS_ASSIGNMENT:
				return settingsAssignment != null;
			case MiningTaskPackage.MINING_BUILD_TASK__VALIDATION_DATA:
				return validationData != null;
			case MiningTaskPackage.MINING_BUILD_TASK__VALIDATION_ASSIGNMENT:
				return validationAssignment != null;
			case MiningTaskPackage.MINING_BUILD_TASK__RESULT_MODEL:
				return resultModel != null;
		}
		return super.eIsSet(featureID);
	}

} //MiningBuildTaskImpl

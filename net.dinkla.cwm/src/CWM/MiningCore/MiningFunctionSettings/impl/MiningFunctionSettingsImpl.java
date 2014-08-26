/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningFunctionSettings.impl;

import CWM.Core.impl.ModelElementImpl;

import CWM.MiningCore.MiningData.AttributeUsageSet;
import CWM.MiningCore.MiningData.LogicalData;

import CWM.MiningCore.MiningFunctionSettings.MiningAlgorithmSettings;
import CWM.MiningCore.MiningFunctionSettings.MiningFunctionSettings;
import CWM.MiningCore.MiningFunctionSettings.MiningFunctionSettingsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mining Function Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.MiningCore.MiningFunctionSettings.impl.MiningFunctionSettingsImpl#getAlgorithmSettings <em>Algorithm Settings</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningFunctionSettings.impl.MiningFunctionSettingsImpl#getDesiredExecutionTimeInMinutes <em>Desired Execution Time In Minutes</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningFunctionSettings.impl.MiningFunctionSettingsImpl#getAttributeUsageSet <em>Attribute Usage Set</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningFunctionSettings.impl.MiningFunctionSettingsImpl#getLogicalData <em>Logical Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MiningFunctionSettingsImpl extends ModelElementImpl implements MiningFunctionSettings {
	/**
	 * The cached value of the '{@link #getAlgorithmSettings() <em>Algorithm Settings</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithmSettings()
	 * @generated
	 * @ordered
	 */
	protected MiningAlgorithmSettings algorithmSettings;

	/**
	 * The default value of the '{@link #getDesiredExecutionTimeInMinutes() <em>Desired Execution Time In Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesiredExecutionTimeInMinutes()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DESIRED_EXECUTION_TIME_IN_MINUTES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDesiredExecutionTimeInMinutes() <em>Desired Execution Time In Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesiredExecutionTimeInMinutes()
	 * @generated
	 * @ordered
	 */
	protected Integer desiredExecutionTimeInMinutes = DESIRED_EXECUTION_TIME_IN_MINUTES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttributeUsageSet() <em>Attribute Usage Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeUsageSet()
	 * @generated
	 * @ordered
	 */
	protected AttributeUsageSet attributeUsageSet;

	/**
	 * The cached value of the '{@link #getLogicalData() <em>Logical Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalData()
	 * @generated
	 * @ordered
	 */
	protected LogicalData logicalData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MiningFunctionSettingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MiningFunctionSettingsPackage.Literals.MINING_FUNCTION_SETTINGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiningAlgorithmSettings getAlgorithmSettings() {
		if (algorithmSettings != null && algorithmSettings.eIsProxy()) {
			InternalEObject oldAlgorithmSettings = (InternalEObject)algorithmSettings;
			algorithmSettings = (MiningAlgorithmSettings)eResolveProxy(oldAlgorithmSettings);
			if (algorithmSettings != oldAlgorithmSettings) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS__ALGORITHM_SETTINGS, oldAlgorithmSettings, algorithmSettings));
			}
		}
		return algorithmSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiningAlgorithmSettings basicGetAlgorithmSettings() {
		return algorithmSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlgorithmSettings(MiningAlgorithmSettings newAlgorithmSettings) {
		MiningAlgorithmSettings oldAlgorithmSettings = algorithmSettings;
		algorithmSettings = newAlgorithmSettings;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS__ALGORITHM_SETTINGS, oldAlgorithmSettings, algorithmSettings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getDesiredExecutionTimeInMinutes() {
		return desiredExecutionTimeInMinutes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesiredExecutionTimeInMinutes(Integer newDesiredExecutionTimeInMinutes) {
		Integer oldDesiredExecutionTimeInMinutes = desiredExecutionTimeInMinutes;
		desiredExecutionTimeInMinutes = newDesiredExecutionTimeInMinutes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS__DESIRED_EXECUTION_TIME_IN_MINUTES, oldDesiredExecutionTimeInMinutes, desiredExecutionTimeInMinutes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeUsageSet getAttributeUsageSet() {
		return attributeUsageSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttributeUsageSet(AttributeUsageSet newAttributeUsageSet, NotificationChain msgs) {
		AttributeUsageSet oldAttributeUsageSet = attributeUsageSet;
		attributeUsageSet = newAttributeUsageSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS__ATTRIBUTE_USAGE_SET, oldAttributeUsageSet, newAttributeUsageSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeUsageSet(AttributeUsageSet newAttributeUsageSet) {
		if (newAttributeUsageSet != attributeUsageSet) {
			NotificationChain msgs = null;
			if (attributeUsageSet != null)
				msgs = ((InternalEObject)attributeUsageSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS__ATTRIBUTE_USAGE_SET, null, msgs);
			if (newAttributeUsageSet != null)
				msgs = ((InternalEObject)newAttributeUsageSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS__ATTRIBUTE_USAGE_SET, null, msgs);
			msgs = basicSetAttributeUsageSet(newAttributeUsageSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS__ATTRIBUTE_USAGE_SET, newAttributeUsageSet, newAttributeUsageSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalData getLogicalData() {
		if (logicalData != null && logicalData.eIsProxy()) {
			InternalEObject oldLogicalData = (InternalEObject)logicalData;
			logicalData = (LogicalData)eResolveProxy(oldLogicalData);
			if (logicalData != oldLogicalData) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS__LOGICAL_DATA, oldLogicalData, logicalData));
			}
		}
		return logicalData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalData basicGetLogicalData() {
		return logicalData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogicalData(LogicalData newLogicalData) {
		LogicalData oldLogicalData = logicalData;
		logicalData = newLogicalData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS__LOGICAL_DATA, oldLogicalData, logicalData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS__ATTRIBUTE_USAGE_SET:
				return basicSetAttributeUsageSet(null, msgs);
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
			case MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS__ALGORITHM_SETTINGS:
				if (resolve) return getAlgorithmSettings();
				return basicGetAlgorithmSettings();
			case MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS__DESIRED_EXECUTION_TIME_IN_MINUTES:
				return getDesiredExecutionTimeInMinutes();
			case MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS__ATTRIBUTE_USAGE_SET:
				return getAttributeUsageSet();
			case MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS__LOGICAL_DATA:
				if (resolve) return getLogicalData();
				return basicGetLogicalData();
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
			case MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS__ALGORITHM_SETTINGS:
				setAlgorithmSettings((MiningAlgorithmSettings)newValue);
				return;
			case MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS__DESIRED_EXECUTION_TIME_IN_MINUTES:
				setDesiredExecutionTimeInMinutes((Integer)newValue);
				return;
			case MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS__ATTRIBUTE_USAGE_SET:
				setAttributeUsageSet((AttributeUsageSet)newValue);
				return;
			case MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS__LOGICAL_DATA:
				setLogicalData((LogicalData)newValue);
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
			case MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS__ALGORITHM_SETTINGS:
				setAlgorithmSettings((MiningAlgorithmSettings)null);
				return;
			case MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS__DESIRED_EXECUTION_TIME_IN_MINUTES:
				setDesiredExecutionTimeInMinutes(DESIRED_EXECUTION_TIME_IN_MINUTES_EDEFAULT);
				return;
			case MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS__ATTRIBUTE_USAGE_SET:
				setAttributeUsageSet((AttributeUsageSet)null);
				return;
			case MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS__LOGICAL_DATA:
				setLogicalData((LogicalData)null);
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
			case MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS__ALGORITHM_SETTINGS:
				return algorithmSettings != null;
			case MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS__DESIRED_EXECUTION_TIME_IN_MINUTES:
				return DESIRED_EXECUTION_TIME_IN_MINUTES_EDEFAULT == null ? desiredExecutionTimeInMinutes != null : !DESIRED_EXECUTION_TIME_IN_MINUTES_EDEFAULT.equals(desiredExecutionTimeInMinutes);
			case MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS__ATTRIBUTE_USAGE_SET:
				return attributeUsageSet != null;
			case MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS__LOGICAL_DATA:
				return logicalData != null;
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
		result.append(" (desiredExecutionTimeInMinutes: ");
		result.append(desiredExecutionTimeInMinutes);
		result.append(')');
		return result.toString();
	}

} //MiningFunctionSettingsImpl

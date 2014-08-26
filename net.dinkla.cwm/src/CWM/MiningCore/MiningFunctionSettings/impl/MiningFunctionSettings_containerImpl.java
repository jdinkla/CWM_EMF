/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningFunctionSettings.impl;

import CWM.MiningCore.MiningFunctionSettings.MiningAlgorithmSettings;
import CWM.MiningCore.MiningFunctionSettings.MiningFunctionSettings;
import CWM.MiningCore.MiningFunctionSettings.MiningFunctionSettingsPackage;
import CWM.MiningCore.MiningFunctionSettings.MiningFunctionSettings_container;

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
 * An implementation of the model object '<em><b>Mining Function Settings container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.MiningCore.MiningFunctionSettings.impl.MiningFunctionSettings_containerImpl#getMiningAlgorithmSettings <em>Mining Algorithm Settings</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningFunctionSettings.impl.MiningFunctionSettings_containerImpl#getMiningFunctionSettings <em>Mining Function Settings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MiningFunctionSettings_containerImpl extends EObjectImpl implements MiningFunctionSettings_container {
	/**
	 * The cached value of the '{@link #getMiningAlgorithmSettings() <em>Mining Algorithm Settings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiningAlgorithmSettings()
	 * @generated
	 * @ordered
	 */
	protected EList<MiningAlgorithmSettings> miningAlgorithmSettings;

	/**
	 * The cached value of the '{@link #getMiningFunctionSettings() <em>Mining Function Settings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiningFunctionSettings()
	 * @generated
	 * @ordered
	 */
	protected EList<MiningFunctionSettings> miningFunctionSettings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MiningFunctionSettings_containerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MiningFunctionSettingsPackage.Literals.MINING_FUNCTION_SETTINGS_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MiningAlgorithmSettings> getMiningAlgorithmSettings() {
		if (miningAlgorithmSettings == null) {
			miningAlgorithmSettings = new EObjectContainmentEList<MiningAlgorithmSettings>(MiningAlgorithmSettings.class, this, MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS_CONTAINER__MINING_ALGORITHM_SETTINGS);
		}
		return miningAlgorithmSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MiningFunctionSettings> getMiningFunctionSettings() {
		if (miningFunctionSettings == null) {
			miningFunctionSettings = new EObjectContainmentEList<MiningFunctionSettings>(MiningFunctionSettings.class, this, MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS_CONTAINER__MINING_FUNCTION_SETTINGS);
		}
		return miningFunctionSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS_CONTAINER__MINING_ALGORITHM_SETTINGS:
				return ((InternalEList<?>)getMiningAlgorithmSettings()).basicRemove(otherEnd, msgs);
			case MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS_CONTAINER__MINING_FUNCTION_SETTINGS:
				return ((InternalEList<?>)getMiningFunctionSettings()).basicRemove(otherEnd, msgs);
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
			case MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS_CONTAINER__MINING_ALGORITHM_SETTINGS:
				return getMiningAlgorithmSettings();
			case MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS_CONTAINER__MINING_FUNCTION_SETTINGS:
				return getMiningFunctionSettings();
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
			case MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS_CONTAINER__MINING_ALGORITHM_SETTINGS:
				getMiningAlgorithmSettings().clear();
				getMiningAlgorithmSettings().addAll((Collection<? extends MiningAlgorithmSettings>)newValue);
				return;
			case MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS_CONTAINER__MINING_FUNCTION_SETTINGS:
				getMiningFunctionSettings().clear();
				getMiningFunctionSettings().addAll((Collection<? extends MiningFunctionSettings>)newValue);
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
			case MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS_CONTAINER__MINING_ALGORITHM_SETTINGS:
				getMiningAlgorithmSettings().clear();
				return;
			case MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS_CONTAINER__MINING_FUNCTION_SETTINGS:
				getMiningFunctionSettings().clear();
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
			case MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS_CONTAINER__MINING_ALGORITHM_SETTINGS:
				return miningAlgorithmSettings != null && !miningAlgorithmSettings.isEmpty();
			case MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS_CONTAINER__MINING_FUNCTION_SETTINGS:
				return miningFunctionSettings != null && !miningFunctionSettings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MiningFunctionSettings_containerImpl

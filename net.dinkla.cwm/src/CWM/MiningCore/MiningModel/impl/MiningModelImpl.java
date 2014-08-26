/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningModel.impl;

import CWM.Core.Attribute;

import CWM.Core.impl.ModelElementImpl;

import CWM.MiningCore.MiningFunctionSettings.MiningFunctionSettings;

import CWM.MiningCore.MiningModel.MiningFunction;
import CWM.MiningCore.MiningModel.MiningModel;
import CWM.MiningCore.MiningModel.MiningModelPackage;
import CWM.MiningCore.MiningModel.ModelSignature;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mining Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.MiningCore.MiningModel.impl.MiningModelImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningModel.impl.MiningModelImpl#getAlgorithmName <em>Algorithm Name</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningModel.impl.MiningModelImpl#getSettings <em>Settings</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningModel.impl.MiningModelImpl#getModelSignature <em>Model Signature</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningModel.impl.MiningModelImpl#getModelLocation <em>Model Location</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningModel.impl.MiningModelImpl#getKeyAttribute <em>Key Attribute</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningModel.impl.MiningModelImpl#getKeyValue <em>Key Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MiningModelImpl extends ModelElementImpl implements MiningModel {
	/**
	 * The default value of the '{@link #getFunction() <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected static final MiningFunction FUNCTION_EDEFAULT = MiningFunction.CLASSIFICATION;

	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected MiningFunction function = FUNCTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlgorithmName() <em>Algorithm Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithmName()
	 * @generated
	 * @ordered
	 */
	protected static final String ALGORITHM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlgorithmName() <em>Algorithm Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithmName()
	 * @generated
	 * @ordered
	 */
	protected String algorithmName = ALGORITHM_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSettings() <em>Settings</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSettings()
	 * @generated
	 * @ordered
	 */
	protected MiningFunctionSettings settings;

	/**
	 * The cached value of the '{@link #getModelSignature() <em>Model Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelSignature()
	 * @generated
	 * @ordered
	 */
	protected ModelSignature modelSignature;

	/**
	 * The cached value of the '{@link #getModelLocation() <em>Model Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelLocation()
	 * @generated
	 * @ordered
	 */
	protected CWM.Core.Class modelLocation;

	/**
	 * The cached value of the '{@link #getKeyAttribute() <em>Key Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyAttribute()
	 * @generated
	 * @ordered
	 */
	protected Attribute keyAttribute;

	/**
	 * The default value of the '{@link #getKeyValue() <em>Key Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyValue()
	 * @generated
	 * @ordered
	 */
	protected static final Object KEY_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeyValue() <em>Key Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyValue()
	 * @generated
	 * @ordered
	 */
	protected Object keyValue = KEY_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MiningModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MiningModelPackage.Literals.MINING_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiningFunction getFunction() {
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunction(MiningFunction newFunction) {
		MiningFunction oldFunction = function;
		function = newFunction == null ? FUNCTION_EDEFAULT : newFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiningModelPackage.MINING_MODEL__FUNCTION, oldFunction, function));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlgorithmName() {
		return algorithmName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlgorithmName(String newAlgorithmName) {
		String oldAlgorithmName = algorithmName;
		algorithmName = newAlgorithmName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiningModelPackage.MINING_MODEL__ALGORITHM_NAME, oldAlgorithmName, algorithmName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiningFunctionSettings getSettings() {
		if (settings != null && settings.eIsProxy()) {
			InternalEObject oldSettings = (InternalEObject)settings;
			settings = (MiningFunctionSettings)eResolveProxy(oldSettings);
			if (settings != oldSettings) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MiningModelPackage.MINING_MODEL__SETTINGS, oldSettings, settings));
			}
		}
		return settings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiningFunctionSettings basicGetSettings() {
		return settings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSettings(MiningFunctionSettings newSettings) {
		MiningFunctionSettings oldSettings = settings;
		settings = newSettings;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiningModelPackage.MINING_MODEL__SETTINGS, oldSettings, settings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelSignature getModelSignature() {
		return modelSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModelSignature(ModelSignature newModelSignature, NotificationChain msgs) {
		ModelSignature oldModelSignature = modelSignature;
		modelSignature = newModelSignature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MiningModelPackage.MINING_MODEL__MODEL_SIGNATURE, oldModelSignature, newModelSignature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelSignature(ModelSignature newModelSignature) {
		if (newModelSignature != modelSignature) {
			NotificationChain msgs = null;
			if (modelSignature != null)
				msgs = ((InternalEObject)modelSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MiningModelPackage.MINING_MODEL__MODEL_SIGNATURE, null, msgs);
			if (newModelSignature != null)
				msgs = ((InternalEObject)newModelSignature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MiningModelPackage.MINING_MODEL__MODEL_SIGNATURE, null, msgs);
			msgs = basicSetModelSignature(newModelSignature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiningModelPackage.MINING_MODEL__MODEL_SIGNATURE, newModelSignature, newModelSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CWM.Core.Class getModelLocation() {
		if (modelLocation != null && modelLocation.eIsProxy()) {
			InternalEObject oldModelLocation = (InternalEObject)modelLocation;
			modelLocation = (CWM.Core.Class)eResolveProxy(oldModelLocation);
			if (modelLocation != oldModelLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MiningModelPackage.MINING_MODEL__MODEL_LOCATION, oldModelLocation, modelLocation));
			}
		}
		return modelLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CWM.Core.Class basicGetModelLocation() {
		return modelLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelLocation(CWM.Core.Class newModelLocation) {
		CWM.Core.Class oldModelLocation = modelLocation;
		modelLocation = newModelLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiningModelPackage.MINING_MODEL__MODEL_LOCATION, oldModelLocation, modelLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getKeyAttribute() {
		if (keyAttribute != null && keyAttribute.eIsProxy()) {
			InternalEObject oldKeyAttribute = (InternalEObject)keyAttribute;
			keyAttribute = (Attribute)eResolveProxy(oldKeyAttribute);
			if (keyAttribute != oldKeyAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MiningModelPackage.MINING_MODEL__KEY_ATTRIBUTE, oldKeyAttribute, keyAttribute));
			}
		}
		return keyAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetKeyAttribute() {
		return keyAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyAttribute(Attribute newKeyAttribute) {
		Attribute oldKeyAttribute = keyAttribute;
		keyAttribute = newKeyAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiningModelPackage.MINING_MODEL__KEY_ATTRIBUTE, oldKeyAttribute, keyAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getKeyValue() {
		return keyValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyValue(Object newKeyValue) {
		Object oldKeyValue = keyValue;
		keyValue = newKeyValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiningModelPackage.MINING_MODEL__KEY_VALUE, oldKeyValue, keyValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MiningModelPackage.MINING_MODEL__MODEL_SIGNATURE:
				return basicSetModelSignature(null, msgs);
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
			case MiningModelPackage.MINING_MODEL__FUNCTION:
				return getFunction();
			case MiningModelPackage.MINING_MODEL__ALGORITHM_NAME:
				return getAlgorithmName();
			case MiningModelPackage.MINING_MODEL__SETTINGS:
				if (resolve) return getSettings();
				return basicGetSettings();
			case MiningModelPackage.MINING_MODEL__MODEL_SIGNATURE:
				return getModelSignature();
			case MiningModelPackage.MINING_MODEL__MODEL_LOCATION:
				if (resolve) return getModelLocation();
				return basicGetModelLocation();
			case MiningModelPackage.MINING_MODEL__KEY_ATTRIBUTE:
				if (resolve) return getKeyAttribute();
				return basicGetKeyAttribute();
			case MiningModelPackage.MINING_MODEL__KEY_VALUE:
				return getKeyValue();
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
			case MiningModelPackage.MINING_MODEL__FUNCTION:
				setFunction((MiningFunction)newValue);
				return;
			case MiningModelPackage.MINING_MODEL__ALGORITHM_NAME:
				setAlgorithmName((String)newValue);
				return;
			case MiningModelPackage.MINING_MODEL__SETTINGS:
				setSettings((MiningFunctionSettings)newValue);
				return;
			case MiningModelPackage.MINING_MODEL__MODEL_SIGNATURE:
				setModelSignature((ModelSignature)newValue);
				return;
			case MiningModelPackage.MINING_MODEL__MODEL_LOCATION:
				setModelLocation((CWM.Core.Class)newValue);
				return;
			case MiningModelPackage.MINING_MODEL__KEY_ATTRIBUTE:
				setKeyAttribute((Attribute)newValue);
				return;
			case MiningModelPackage.MINING_MODEL__KEY_VALUE:
				setKeyValue(newValue);
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
			case MiningModelPackage.MINING_MODEL__FUNCTION:
				setFunction(FUNCTION_EDEFAULT);
				return;
			case MiningModelPackage.MINING_MODEL__ALGORITHM_NAME:
				setAlgorithmName(ALGORITHM_NAME_EDEFAULT);
				return;
			case MiningModelPackage.MINING_MODEL__SETTINGS:
				setSettings((MiningFunctionSettings)null);
				return;
			case MiningModelPackage.MINING_MODEL__MODEL_SIGNATURE:
				setModelSignature((ModelSignature)null);
				return;
			case MiningModelPackage.MINING_MODEL__MODEL_LOCATION:
				setModelLocation((CWM.Core.Class)null);
				return;
			case MiningModelPackage.MINING_MODEL__KEY_ATTRIBUTE:
				setKeyAttribute((Attribute)null);
				return;
			case MiningModelPackage.MINING_MODEL__KEY_VALUE:
				setKeyValue(KEY_VALUE_EDEFAULT);
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
			case MiningModelPackage.MINING_MODEL__FUNCTION:
				return function != FUNCTION_EDEFAULT;
			case MiningModelPackage.MINING_MODEL__ALGORITHM_NAME:
				return ALGORITHM_NAME_EDEFAULT == null ? algorithmName != null : !ALGORITHM_NAME_EDEFAULT.equals(algorithmName);
			case MiningModelPackage.MINING_MODEL__SETTINGS:
				return settings != null;
			case MiningModelPackage.MINING_MODEL__MODEL_SIGNATURE:
				return modelSignature != null;
			case MiningModelPackage.MINING_MODEL__MODEL_LOCATION:
				return modelLocation != null;
			case MiningModelPackage.MINING_MODEL__KEY_ATTRIBUTE:
				return keyAttribute != null;
			case MiningModelPackage.MINING_MODEL__KEY_VALUE:
				return KEY_VALUE_EDEFAULT == null ? keyValue != null : !KEY_VALUE_EDEFAULT.equals(keyValue);
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
		result.append(" (function: ");
		result.append(function);
		result.append(", algorithmName: ");
		result.append(algorithmName);
		result.append(", keyValue: ");
		result.append(keyValue);
		result.append(')');
		return result.toString();
	}

} //MiningModelImpl

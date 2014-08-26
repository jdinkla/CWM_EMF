/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.SoftwareDeployment.impl;

import CWM.Core.impl.ModelElementImpl;

import CWM.SoftwareDeployment.DataManager;
import CWM.SoftwareDeployment.DataProvider;
import CWM.SoftwareDeployment.ProviderConnection;
import CWM.SoftwareDeployment.SoftwareDeploymentPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provider Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.SoftwareDeployment.impl.ProviderConnectionImpl#getIsReadOnly <em>Is Read Only</em>}</li>
 *   <li>{@link CWM.SoftwareDeployment.impl.ProviderConnectionImpl#getDataProvider <em>Data Provider</em>}</li>
 *   <li>{@link CWM.SoftwareDeployment.impl.ProviderConnectionImpl#getDataManager <em>Data Manager</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProviderConnectionImpl extends ModelElementImpl implements ProviderConnection {
	/**
	 * The default value of the '{@link #getIsReadOnly() <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_READ_ONLY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsReadOnly() <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsReadOnly()
	 * @generated
	 * @ordered
	 */
	protected Boolean isReadOnly = IS_READ_ONLY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDataManager() <em>Data Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataManager()
	 * @generated
	 * @ordered
	 */
	protected DataManager dataManager;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProviderConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoftwareDeploymentPackage.Literals.PROVIDER_CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsReadOnly() {
		return isReadOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsReadOnly(Boolean newIsReadOnly) {
		Boolean oldIsReadOnly = isReadOnly;
		isReadOnly = newIsReadOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwareDeploymentPackage.PROVIDER_CONNECTION__IS_READ_ONLY, oldIsReadOnly, isReadOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataProvider getDataProvider() {
		if (eContainerFeatureID != SoftwareDeploymentPackage.PROVIDER_CONNECTION__DATA_PROVIDER) return null;
		return (DataProvider)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataProvider(DataProvider newDataProvider, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDataProvider, SoftwareDeploymentPackage.PROVIDER_CONNECTION__DATA_PROVIDER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataProvider(DataProvider newDataProvider) {
		if (newDataProvider != eInternalContainer() || (eContainerFeatureID != SoftwareDeploymentPackage.PROVIDER_CONNECTION__DATA_PROVIDER && newDataProvider != null)) {
			if (EcoreUtil.isAncestor(this, newDataProvider))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDataProvider != null)
				msgs = ((InternalEObject)newDataProvider).eInverseAdd(this, SoftwareDeploymentPackage.DATA_PROVIDER__RESOURCE_CONNECTION, DataProvider.class, msgs);
			msgs = basicSetDataProvider(newDataProvider, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwareDeploymentPackage.PROVIDER_CONNECTION__DATA_PROVIDER, newDataProvider, newDataProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataManager getDataManager() {
		if (dataManager != null && dataManager.eIsProxy()) {
			InternalEObject oldDataManager = (InternalEObject)dataManager;
			dataManager = (DataManager)eResolveProxy(oldDataManager);
			if (dataManager != oldDataManager) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SoftwareDeploymentPackage.PROVIDER_CONNECTION__DATA_MANAGER, oldDataManager, dataManager));
			}
		}
		return dataManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataManager basicGetDataManager() {
		return dataManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataManager(DataManager newDataManager) {
		DataManager oldDataManager = dataManager;
		dataManager = newDataManager;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwareDeploymentPackage.PROVIDER_CONNECTION__DATA_MANAGER, oldDataManager, dataManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SoftwareDeploymentPackage.PROVIDER_CONNECTION__DATA_PROVIDER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDataProvider((DataProvider)otherEnd, msgs);
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
			case SoftwareDeploymentPackage.PROVIDER_CONNECTION__DATA_PROVIDER:
				return basicSetDataProvider(null, msgs);
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
			case SoftwareDeploymentPackage.PROVIDER_CONNECTION__DATA_PROVIDER:
				return eInternalContainer().eInverseRemove(this, SoftwareDeploymentPackage.DATA_PROVIDER__RESOURCE_CONNECTION, DataProvider.class, msgs);
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
			case SoftwareDeploymentPackage.PROVIDER_CONNECTION__IS_READ_ONLY:
				return getIsReadOnly();
			case SoftwareDeploymentPackage.PROVIDER_CONNECTION__DATA_PROVIDER:
				return getDataProvider();
			case SoftwareDeploymentPackage.PROVIDER_CONNECTION__DATA_MANAGER:
				if (resolve) return getDataManager();
				return basicGetDataManager();
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
			case SoftwareDeploymentPackage.PROVIDER_CONNECTION__IS_READ_ONLY:
				setIsReadOnly((Boolean)newValue);
				return;
			case SoftwareDeploymentPackage.PROVIDER_CONNECTION__DATA_PROVIDER:
				setDataProvider((DataProvider)newValue);
				return;
			case SoftwareDeploymentPackage.PROVIDER_CONNECTION__DATA_MANAGER:
				setDataManager((DataManager)newValue);
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
			case SoftwareDeploymentPackage.PROVIDER_CONNECTION__IS_READ_ONLY:
				setIsReadOnly(IS_READ_ONLY_EDEFAULT);
				return;
			case SoftwareDeploymentPackage.PROVIDER_CONNECTION__DATA_PROVIDER:
				setDataProvider((DataProvider)null);
				return;
			case SoftwareDeploymentPackage.PROVIDER_CONNECTION__DATA_MANAGER:
				setDataManager((DataManager)null);
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
			case SoftwareDeploymentPackage.PROVIDER_CONNECTION__IS_READ_ONLY:
				return IS_READ_ONLY_EDEFAULT == null ? isReadOnly != null : !IS_READ_ONLY_EDEFAULT.equals(isReadOnly);
			case SoftwareDeploymentPackage.PROVIDER_CONNECTION__DATA_PROVIDER:
				return getDataProvider() != null;
			case SoftwareDeploymentPackage.PROVIDER_CONNECTION__DATA_MANAGER:
				return dataManager != null;
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
		result.append(" (isReadOnly: ");
		result.append(isReadOnly);
		result.append(')');
		return result.toString();
	}

} //ProviderConnectionImpl

/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.SoftwareDeployment.impl;

import CWM.SoftwareDeployment.Component;
import CWM.SoftwareDeployment.DataManager;
import CWM.SoftwareDeployment.DataProvider;
import CWM.SoftwareDeployment.DeployedComponent;
import CWM.SoftwareDeployment.DeployedSoftwareSystem;
import CWM.SoftwareDeployment.Machine;
import CWM.SoftwareDeployment.PackageUsage;
import CWM.SoftwareDeployment.ProviderConnection;
import CWM.SoftwareDeployment.Site;
import CWM.SoftwareDeployment.SoftwareDeploymentPackage;
import CWM.SoftwareDeployment.SoftwareDeployment_container;
import CWM.SoftwareDeployment.SoftwareSystem;

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
 * An implementation of the model object '<em><b>Software Deployment container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.SoftwareDeployment.impl.SoftwareDeployment_containerImpl#getSite <em>Site</em>}</li>
 *   <li>{@link CWM.SoftwareDeployment.impl.SoftwareDeployment_containerImpl#getMachine <em>Machine</em>}</li>
 *   <li>{@link CWM.SoftwareDeployment.impl.SoftwareDeployment_containerImpl#getSoftwareSystem <em>Software System</em>}</li>
 *   <li>{@link CWM.SoftwareDeployment.impl.SoftwareDeployment_containerImpl#getDeployedComponent <em>Deployed Component</em>}</li>
 *   <li>{@link CWM.SoftwareDeployment.impl.SoftwareDeployment_containerImpl#getDeployedSoftwareSystem <em>Deployed Software System</em>}</li>
 *   <li>{@link CWM.SoftwareDeployment.impl.SoftwareDeployment_containerImpl#getDataManager <em>Data Manager</em>}</li>
 *   <li>{@link CWM.SoftwareDeployment.impl.SoftwareDeployment_containerImpl#getDataProvider <em>Data Provider</em>}</li>
 *   <li>{@link CWM.SoftwareDeployment.impl.SoftwareDeployment_containerImpl#getProviderConnection <em>Provider Connection</em>}</li>
 *   <li>{@link CWM.SoftwareDeployment.impl.SoftwareDeployment_containerImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link CWM.SoftwareDeployment.impl.SoftwareDeployment_containerImpl#getPackageUsage <em>Package Usage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SoftwareDeployment_containerImpl extends EObjectImpl implements SoftwareDeployment_container {
	/**
	 * The cached value of the '{@link #getSite() <em>Site</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSite()
	 * @generated
	 * @ordered
	 */
	protected EList<Site> site;

	/**
	 * The cached value of the '{@link #getMachine() <em>Machine</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachine()
	 * @generated
	 * @ordered
	 */
	protected EList<Machine> machine;

	/**
	 * The cached value of the '{@link #getSoftwareSystem() <em>Software System</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwareSystem()
	 * @generated
	 * @ordered
	 */
	protected EList<SoftwareSystem> softwareSystem;

	/**
	 * The cached value of the '{@link #getDeployedComponent() <em>Deployed Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployedComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<DeployedComponent> deployedComponent;

	/**
	 * The cached value of the '{@link #getDeployedSoftwareSystem() <em>Deployed Software System</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployedSoftwareSystem()
	 * @generated
	 * @ordered
	 */
	protected EList<DeployedSoftwareSystem> deployedSoftwareSystem;

	/**
	 * The cached value of the '{@link #getDataManager() <em>Data Manager</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataManager()
	 * @generated
	 * @ordered
	 */
	protected EList<DataManager> dataManager;

	/**
	 * The cached value of the '{@link #getDataProvider() <em>Data Provider</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataProvider()
	 * @generated
	 * @ordered
	 */
	protected EList<DataProvider> dataProvider;

	/**
	 * The cached value of the '{@link #getProviderConnection() <em>Provider Connection</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderConnection()
	 * @generated
	 * @ordered
	 */
	protected EList<ProviderConnection> providerConnection;

	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> component;

	/**
	 * The cached value of the '{@link #getPackageUsage() <em>Package Usage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageUsage()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageUsage> packageUsage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwareDeployment_containerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoftwareDeploymentPackage.Literals.SOFTWARE_DEPLOYMENT_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Site> getSite() {
		if (site == null) {
			site = new EObjectContainmentEList<Site>(Site.class, this, SoftwareDeploymentPackage.SOFTWARE_DEPLOYMENT_CONTAINER__SITE);
		}
		return site;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Machine> getMachine() {
		if (machine == null) {
			machine = new EObjectContainmentEList<Machine>(Machine.class, this, SoftwareDeploymentPackage.SOFTWARE_DEPLOYMENT_CONTAINER__MACHINE);
		}
		return machine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SoftwareSystem> getSoftwareSystem() {
		if (softwareSystem == null) {
			softwareSystem = new EObjectContainmentEList<SoftwareSystem>(SoftwareSystem.class, this, SoftwareDeploymentPackage.SOFTWARE_DEPLOYMENT_CONTAINER__SOFTWARE_SYSTEM);
		}
		return softwareSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeployedComponent> getDeployedComponent() {
		if (deployedComponent == null) {
			deployedComponent = new EObjectContainmentEList<DeployedComponent>(DeployedComponent.class, this, SoftwareDeploymentPackage.SOFTWARE_DEPLOYMENT_CONTAINER__DEPLOYED_COMPONENT);
		}
		return deployedComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeployedSoftwareSystem> getDeployedSoftwareSystem() {
		if (deployedSoftwareSystem == null) {
			deployedSoftwareSystem = new EObjectContainmentEList<DeployedSoftwareSystem>(DeployedSoftwareSystem.class, this, SoftwareDeploymentPackage.SOFTWARE_DEPLOYMENT_CONTAINER__DEPLOYED_SOFTWARE_SYSTEM);
		}
		return deployedSoftwareSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataManager> getDataManager() {
		if (dataManager == null) {
			dataManager = new EObjectContainmentEList<DataManager>(DataManager.class, this, SoftwareDeploymentPackage.SOFTWARE_DEPLOYMENT_CONTAINER__DATA_MANAGER);
		}
		return dataManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataProvider> getDataProvider() {
		if (dataProvider == null) {
			dataProvider = new EObjectContainmentEList<DataProvider>(DataProvider.class, this, SoftwareDeploymentPackage.SOFTWARE_DEPLOYMENT_CONTAINER__DATA_PROVIDER);
		}
		return dataProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProviderConnection> getProviderConnection() {
		if (providerConnection == null) {
			providerConnection = new EObjectContainmentEList<ProviderConnection>(ProviderConnection.class, this, SoftwareDeploymentPackage.SOFTWARE_DEPLOYMENT_CONTAINER__PROVIDER_CONNECTION);
		}
		return providerConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getComponent() {
		if (component == null) {
			component = new EObjectContainmentEList<Component>(Component.class, this, SoftwareDeploymentPackage.SOFTWARE_DEPLOYMENT_CONTAINER__COMPONENT);
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageUsage> getPackageUsage() {
		if (packageUsage == null) {
			packageUsage = new EObjectContainmentEList<PackageUsage>(PackageUsage.class, this, SoftwareDeploymentPackage.SOFTWARE_DEPLOYMENT_CONTAINER__PACKAGE_USAGE);
		}
		return packageUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SoftwareDeploymentPackage.SOFTWARE_DEPLOYMENT_CONTAINER__SITE:
				return ((InternalEList<?>)getSite()).basicRemove(otherEnd, msgs);
			case SoftwareDeploymentPackage.SOFTWARE_DEPLOYMENT_CONTAINER__MACHINE:
				return ((InternalEList<?>)getMachine()).basicRemove(otherEnd, msgs);
			case SoftwareDeploymentPackage.SOFTWARE_DEPLOYMENT_CONTAINER__SOFTWARE_SYSTEM:
				return ((InternalEList<?>)getSoftwareSystem()).basicRemove(otherEnd, msgs);
			case SoftwareDeploymentPackage.SOFTWARE_DEPLOYMENT_CONTAINER__DEPLOYED_COMPONENT:
				return ((InternalEList<?>)getDeployedComponent()).basicRemove(otherEnd, msgs);
			case SoftwareDeploymentPackage.SOFTWARE_DEPLOYMENT_CONTAINER__DEPLOYED_SOFTWARE_SYSTEM:
				return ((InternalEList<?>)getDeployedSoftwareSystem()).basicRemove(otherEnd, msgs);
			case SoftwareDeploymentPackage.SOFTWARE_DEPLOYMENT_CONTAINER__DATA_MANAGER:
				return ((InternalEList<?>)getDataManager()).basicRemove(otherEnd, msgs);
			case SoftwareDeploymentPackage.SOFTWARE_DEPLOYMENT_CONTAINER__DATA_PROVIDER:
				return ((InternalEList<?>)getDataProvider()).basicRemove(otherEnd, msgs);
			case SoftwareDeploymentPackage.SOFTWARE_DEPLOYMENT_CONTAINER__PROVIDER_CONNECTION:
				return ((InternalEList<?>)getProviderConnection()).basicRemove(otherEnd, msgs);
			case SoftwareDeploymentPackage.SOFTWARE_DEPLOYMENT_CONTAINER__COMPONENT:
				return ((InternalEList<?>)getComponent()).basicRemove(otherEnd, msgs);
			case SoftwareDeploymentPackage.SOFTWARE_DEPLOYMENT_CONTAINER__PACKAGE_USAGE:
				return ((InternalEList<?>)getPackageUsage()).basicRemove(otherEnd, msgs);
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
			case SoftwareDeploymentPackage.SOFTWARE_DEPLOYMENT_CONTAINER__SITE:
				return getSite();
			case SoftwareDeploymentPackage.SOFTWARE_DEPLOYMENT_CONTAINER__MACHINE:
				return getMachine();
			case SoftwareDeploymentPackage.SOFTWARE_DEPLOYMENT_CONTAINER__SOFTWARE_SYSTEM:
				return getSoftwareSystem();
			case SoftwareDeploymentPackage.SOFTWARE_DEPLOYMENT_CONTAINER__DEPLOYED_COMPONENT:
				return getDeployedComponent();
			case SoftwareDeploymentPackage.SOFTWARE_DEPLOYMENT_CONTAINER__DEPLOYED_SOFTWARE_SYSTEM:
				return getDeployedSoftwareSystem();
			case SoftwareDeploymentPackage.SOFTWARE_DEPLOYMENT_CONTAINER__DATA_MANAGER:
				return getDataManager();
			case SoftwareDeploymentPackage.SOFTWARE_DEPLOYMENT_CONTAINER__DATA_PROVIDER:
				return getDataProvider();
			case SoftwareDeploymentPackage.SOFTWARE_DEPLOYMENT_CONTAINER__PROVIDER_CONNECTION:
				return getProviderConnection();
			case SoftwareDeploymentPackage.SOFTWARE_DEPLOYMENT_CONTAINER__COMPONENT:
				return getComponent();
			case SoftwareDeploymentPackage.SOFTWARE_DEPLOYMENT_CONTAINER__PACKAGE_USAGE:
				return getPackageUsage();
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
			case SoftwareDeploymentPackage.SOFTWARE_DEPLOYMENT_CONTAINER__SITE:
				getSite().clear();
				getSite().addAll((Collection<? extends Site>)newValue);
				return;
			case SoftwareDeploymentPackage.SOFTWARE_DEPLOYMENT_CONTAINER__MACHINE:
				getMachine().clear();
				getMachine().addAll((Collection<? extends Machine>)newValue);
				return;
			case SoftwareDeploymentPackage.SOFTWARE_DEPLOYMENT_CONTAINER__SOFTWARE_SYSTEM:
				getSoftwareSystem().clear();
				getSoftwareSystem().addAll((Collection<? extends SoftwareSystem>)newValue);
				return;
			case SoftwareDeploymentPackage.SOFTWARE_DEPLOYMENT_CONTAINER__DEPLOYED_COMPONENT:
				getDeployedComponent().clear();
				getDeployedComponent().addAll((Collection<? extends DeployedComponent>)newValue);
				return;
			case SoftwareDeploymentPackage.SOFTWARE_DEPLOYMENT_CONTAINER__DEPLOYED_SOFTWARE_SYSTEM:
				getDeployedSoftwareSystem().clear();
				getDeployedSoftwareSystem().addAll((Collection<? extends DeployedSoftwareSystem>)newValue);
				return;
			case SoftwareDeploymentPackage.SOFTWARE_DEPLOYMENT_CONTAINER__DATA_MANAGER:
				getDataManager().clear();
				getDataManager().addAll((Collection<? extends DataManager>)newValue);
				return;
			case SoftwareDeploymentPackage.SOFTWARE_DEPLOYMENT_CONTAINER__DATA_PROVIDER:
				getDataProvider().clear();
				getDataProvider().addAll((Collection<? extends DataProvider>)newValue);
				return;
			case SoftwareDeploymentPackage.SOFTWARE_DEPLOYMENT_CONTAINER__PROVIDER_CONNECTION:
				getProviderConnection().clear();
				getProviderConnection().addAll((Collection<? extends ProviderConnection>)newValue);
				return;
			case SoftwareDeploymentPackage.SOFTWARE_DEPLOYMENT_CONTAINER__COMPONENT:
				getComponent().clear();
				getComponent().addAll((Collection<? extends Component>)newValue);
				return;
			case SoftwareDeploymentPackage.SOFTWARE_DEPLOYMENT_CONTAINER__PACKAGE_USAGE:
				getPackageUsage().clear();
				getPackageUsage().addAll((Collection<? extends PackageUsage>)newValue);
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
			case SoftwareDeploymentPackage.SOFTWARE_DEPLOYMENT_CONTAINER__SITE:
				getSite().clear();
				return;
			case SoftwareDeploymentPackage.SOFTWARE_DEPLOYMENT_CONTAINER__MACHINE:
				getMachine().clear();
				return;
			case SoftwareDeploymentPackage.SOFTWARE_DEPLOYMENT_CONTAINER__SOFTWARE_SYSTEM:
				getSoftwareSystem().clear();
				return;
			case SoftwareDeploymentPackage.SOFTWARE_DEPLOYMENT_CONTAINER__DEPLOYED_COMPONENT:
				getDeployedComponent().clear();
				return;
			case SoftwareDeploymentPackage.SOFTWARE_DEPLOYMENT_CONTAINER__DEPLOYED_SOFTWARE_SYSTEM:
				getDeployedSoftwareSystem().clear();
				return;
			case SoftwareDeploymentPackage.SOFTWARE_DEPLOYMENT_CONTAINER__DATA_MANAGER:
				getDataManager().clear();
				return;
			case SoftwareDeploymentPackage.SOFTWARE_DEPLOYMENT_CONTAINER__DATA_PROVIDER:
				getDataProvider().clear();
				return;
			case SoftwareDeploymentPackage.SOFTWARE_DEPLOYMENT_CONTAINER__PROVIDER_CONNECTION:
				getProviderConnection().clear();
				return;
			case SoftwareDeploymentPackage.SOFTWARE_DEPLOYMENT_CONTAINER__COMPONENT:
				getComponent().clear();
				return;
			case SoftwareDeploymentPackage.SOFTWARE_DEPLOYMENT_CONTAINER__PACKAGE_USAGE:
				getPackageUsage().clear();
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
			case SoftwareDeploymentPackage.SOFTWARE_DEPLOYMENT_CONTAINER__SITE:
				return site != null && !site.isEmpty();
			case SoftwareDeploymentPackage.SOFTWARE_DEPLOYMENT_CONTAINER__MACHINE:
				return machine != null && !machine.isEmpty();
			case SoftwareDeploymentPackage.SOFTWARE_DEPLOYMENT_CONTAINER__SOFTWARE_SYSTEM:
				return softwareSystem != null && !softwareSystem.isEmpty();
			case SoftwareDeploymentPackage.SOFTWARE_DEPLOYMENT_CONTAINER__DEPLOYED_COMPONENT:
				return deployedComponent != null && !deployedComponent.isEmpty();
			case SoftwareDeploymentPackage.SOFTWARE_DEPLOYMENT_CONTAINER__DEPLOYED_SOFTWARE_SYSTEM:
				return deployedSoftwareSystem != null && !deployedSoftwareSystem.isEmpty();
			case SoftwareDeploymentPackage.SOFTWARE_DEPLOYMENT_CONTAINER__DATA_MANAGER:
				return dataManager != null && !dataManager.isEmpty();
			case SoftwareDeploymentPackage.SOFTWARE_DEPLOYMENT_CONTAINER__DATA_PROVIDER:
				return dataProvider != null && !dataProvider.isEmpty();
			case SoftwareDeploymentPackage.SOFTWARE_DEPLOYMENT_CONTAINER__PROVIDER_CONNECTION:
				return providerConnection != null && !providerConnection.isEmpty();
			case SoftwareDeploymentPackage.SOFTWARE_DEPLOYMENT_CONTAINER__COMPONENT:
				return component != null && !component.isEmpty();
			case SoftwareDeploymentPackage.SOFTWARE_DEPLOYMENT_CONTAINER__PACKAGE_USAGE:
				return packageUsage != null && !packageUsage.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SoftwareDeployment_containerImpl

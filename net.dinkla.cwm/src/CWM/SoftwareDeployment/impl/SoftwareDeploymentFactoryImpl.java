/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.SoftwareDeployment.impl;

import CWM.SoftwareDeployment.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SoftwareDeploymentFactoryImpl extends EFactoryImpl implements SoftwareDeploymentFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SoftwareDeploymentFactory init() {
		try {
			SoftwareDeploymentFactory theSoftwareDeploymentFactory = (SoftwareDeploymentFactory)EPackage.Registry.INSTANCE.getEFactory("SoftwareDeployment"); 
			if (theSoftwareDeploymentFactory != null) {
				return theSoftwareDeploymentFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SoftwareDeploymentFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareDeploymentFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SoftwareDeploymentPackage.SITE: return createSite();
			case SoftwareDeploymentPackage.MACHINE: return createMachine();
			case SoftwareDeploymentPackage.SOFTWARE_SYSTEM: return createSoftwareSystem();
			case SoftwareDeploymentPackage.DEPLOYED_COMPONENT: return createDeployedComponent();
			case SoftwareDeploymentPackage.DEPLOYED_SOFTWARE_SYSTEM: return createDeployedSoftwareSystem();
			case SoftwareDeploymentPackage.DATA_MANAGER: return createDataManager();
			case SoftwareDeploymentPackage.DATA_PROVIDER: return createDataProvider();
			case SoftwareDeploymentPackage.PROVIDER_CONNECTION: return createProviderConnection();
			case SoftwareDeploymentPackage.COMPONENT: return createComponent();
			case SoftwareDeploymentPackage.PACKAGE_USAGE: return createPackageUsage();
			case SoftwareDeploymentPackage.SOFTWARE_DEPLOYMENT_CONTAINER: return createSoftwareDeployment_container();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Site createSite() {
		SiteImpl site = new SiteImpl();
		return site;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine createMachine() {
		MachineImpl machine = new MachineImpl();
		return machine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareSystem createSoftwareSystem() {
		SoftwareSystemImpl softwareSystem = new SoftwareSystemImpl();
		return softwareSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeployedComponent createDeployedComponent() {
		DeployedComponentImpl deployedComponent = new DeployedComponentImpl();
		return deployedComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeployedSoftwareSystem createDeployedSoftwareSystem() {
		DeployedSoftwareSystemImpl deployedSoftwareSystem = new DeployedSoftwareSystemImpl();
		return deployedSoftwareSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataManager createDataManager() {
		DataManagerImpl dataManager = new DataManagerImpl();
		return dataManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataProvider createDataProvider() {
		DataProviderImpl dataProvider = new DataProviderImpl();
		return dataProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProviderConnection createProviderConnection() {
		ProviderConnectionImpl providerConnection = new ProviderConnectionImpl();
		return providerConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageUsage createPackageUsage() {
		PackageUsageImpl packageUsage = new PackageUsageImpl();
		return packageUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareDeployment_container createSoftwareDeployment_container() {
		SoftwareDeployment_containerImpl softwareDeployment_container = new SoftwareDeployment_containerImpl();
		return softwareDeployment_container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareDeploymentPackage getSoftwareDeploymentPackage() {
		return (SoftwareDeploymentPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SoftwareDeploymentPackage getPackage() {
		return SoftwareDeploymentPackage.eINSTANCE;
	}

} //SoftwareDeploymentFactoryImpl

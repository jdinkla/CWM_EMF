/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.SoftwareDeployment;

import CWM.BusinessInformation.BusinessInformationPackage;

import CWM.Core.CorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see CWM.SoftwareDeployment.SoftwareDeploymentFactory
 * @model kind="package"
 * @generated
 */
public interface SoftwareDeploymentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "SoftwareDeployment";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "SoftwareDeployment";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "SoftwareDeployment";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SoftwareDeploymentPackage eINSTANCE = CWM.SoftwareDeployment.impl.SoftwareDeploymentPackageImpl.init();

	/**
	 * The meta object id for the '{@link CWM.SoftwareDeployment.impl.SiteImpl <em>Site</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.SoftwareDeployment.impl.SiteImpl
	 * @see CWM.SoftwareDeployment.impl.SoftwareDeploymentPackageImpl#getSite()
	 * @generated
	 */
	int SITE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__NAME = BusinessInformationPackage.LOCATION__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__VISIBILITY = BusinessInformationPackage.LOCATION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__CLIENT_DEPENDENCY = BusinessInformationPackage.LOCATION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__CONSTRAINT = BusinessInformationPackage.LOCATION__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__IMPORTER = BusinessInformationPackage.LOCATION__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__NAMESPACE = BusinessInformationPackage.LOCATION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__TAGGED_VALUE = BusinessInformationPackage.LOCATION__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Location Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__LOCATION_TYPE = BusinessInformationPackage.LOCATION__LOCATION_TYPE;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__ADDRESS = BusinessInformationPackage.LOCATION__ADDRESS;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__CITY = BusinessInformationPackage.LOCATION__CITY;

	/**
	 * The feature id for the '<em><b>Post Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__POST_CODE = BusinessInformationPackage.LOCATION__POST_CODE;

	/**
	 * The feature id for the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__AREA = BusinessInformationPackage.LOCATION__AREA;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__COUNTRY = BusinessInformationPackage.LOCATION__COUNTRY;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__CONTACT = BusinessInformationPackage.LOCATION__CONTACT;

	/**
	 * The feature id for the '<em><b>Containing Site</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__CONTAINING_SITE = BusinessInformationPackage.LOCATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Site</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_FEATURE_COUNT = BusinessInformationPackage.LOCATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CWM.SoftwareDeployment.impl.MachineImpl <em>Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.SoftwareDeployment.impl.MachineImpl
	 * @see CWM.SoftwareDeployment.impl.SoftwareDeploymentPackageImpl#getMachine()
	 * @generated
	 */
	int MACHINE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__NAME = CorePackage.NAMESPACE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__VISIBILITY = CorePackage.NAMESPACE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__CLIENT_DEPENDENCY = CorePackage.NAMESPACE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__CONSTRAINT = CorePackage.NAMESPACE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__IMPORTER = CorePackage.NAMESPACE__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__NAMESPACE = CorePackage.NAMESPACE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__TAGGED_VALUE = CorePackage.NAMESPACE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__OWNED_ELEMENT = CorePackage.NAMESPACE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Ip Address</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__IP_ADDRESS = CorePackage.NAMESPACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Host Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__HOST_NAME = CorePackage.NAMESPACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Machine ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__MACHINE_ID = CorePackage.NAMESPACE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Site</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__SITE = CorePackage.NAMESPACE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Deployed Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__DEPLOYED_COMPONENT = CorePackage.NAMESPACE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_FEATURE_COUNT = CorePackage.NAMESPACE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link CWM.SoftwareDeployment.impl.SoftwareSystemImpl <em>Software System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.SoftwareDeployment.impl.SoftwareSystemImpl
	 * @see CWM.SoftwareDeployment.impl.SoftwareDeploymentPackageImpl#getSoftwareSystem()
	 * @generated
	 */
	int SOFTWARE_SYSTEM = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYSTEM__NAME = CorePackage.SUBSYSTEM__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYSTEM__VISIBILITY = CorePackage.SUBSYSTEM__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYSTEM__CLIENT_DEPENDENCY = CorePackage.SUBSYSTEM__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYSTEM__CONSTRAINT = CorePackage.SUBSYSTEM__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYSTEM__IMPORTER = CorePackage.SUBSYSTEM__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYSTEM__NAMESPACE = CorePackage.SUBSYSTEM__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYSTEM__TAGGED_VALUE = CorePackage.SUBSYSTEM__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYSTEM__OWNED_ELEMENT = CorePackage.SUBSYSTEM__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Imported Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYSTEM__IMPORTED_ELEMENT = CorePackage.SUBSYSTEM__IMPORTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYSTEM__IS_ABSTRACT = CorePackage.SUBSYSTEM__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYSTEM__FEATURE = CorePackage.SUBSYSTEM__FEATURE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYSTEM__TYPE = CorePackage.SUBSYSTEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYSTEM__SUBTYPE = CorePackage.SUBSYSTEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Supplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYSTEM__SUPPLIER = CorePackage.SUBSYSTEM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYSTEM__VERSION = CorePackage.SUBSYSTEM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Typespace</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYSTEM__TYPESPACE = CorePackage.SUBSYSTEM_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Software System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYSTEM_FEATURE_COUNT = CorePackage.SUBSYSTEM_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link CWM.SoftwareDeployment.impl.DeployedComponentImpl <em>Deployed Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.SoftwareDeployment.impl.DeployedComponentImpl
	 * @see CWM.SoftwareDeployment.impl.SoftwareDeploymentPackageImpl#getDeployedComponent()
	 * @generated
	 */
	int DEPLOYED_COMPONENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_COMPONENT__NAME = CorePackage.PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_COMPONENT__VISIBILITY = CorePackage.PACKAGE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_COMPONENT__CLIENT_DEPENDENCY = CorePackage.PACKAGE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_COMPONENT__CONSTRAINT = CorePackage.PACKAGE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_COMPONENT__IMPORTER = CorePackage.PACKAGE__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_COMPONENT__NAMESPACE = CorePackage.PACKAGE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_COMPONENT__TAGGED_VALUE = CorePackage.PACKAGE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_COMPONENT__OWNED_ELEMENT = CorePackage.PACKAGE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Imported Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_COMPONENT__IMPORTED_ELEMENT = CorePackage.PACKAGE__IMPORTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Pathname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_COMPONENT__PATHNAME = CorePackage.PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_COMPONENT__COMPONENT = CorePackage.PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Machine</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_COMPONENT__MACHINE = CorePackage.PACKAGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Using Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_COMPONENT__USING_COMPONENTS = CorePackage.PACKAGE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Used Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_COMPONENT__USED_COMPONENTS = CorePackage.PACKAGE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Deployed Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_COMPONENT_FEATURE_COUNT = CorePackage.PACKAGE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link CWM.SoftwareDeployment.impl.DeployedSoftwareSystemImpl <em>Deployed Software System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.SoftwareDeployment.impl.DeployedSoftwareSystemImpl
	 * @see CWM.SoftwareDeployment.impl.SoftwareDeploymentPackageImpl#getDeployedSoftwareSystem()
	 * @generated
	 */
	int DEPLOYED_SOFTWARE_SYSTEM = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_SOFTWARE_SYSTEM__NAME = CorePackage.PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_SOFTWARE_SYSTEM__VISIBILITY = CorePackage.PACKAGE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_SOFTWARE_SYSTEM__CLIENT_DEPENDENCY = CorePackage.PACKAGE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_SOFTWARE_SYSTEM__CONSTRAINT = CorePackage.PACKAGE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_SOFTWARE_SYSTEM__IMPORTER = CorePackage.PACKAGE__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_SOFTWARE_SYSTEM__NAMESPACE = CorePackage.PACKAGE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_SOFTWARE_SYSTEM__TAGGED_VALUE = CorePackage.PACKAGE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_SOFTWARE_SYSTEM__OWNED_ELEMENT = CorePackage.PACKAGE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Imported Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_SOFTWARE_SYSTEM__IMPORTED_ELEMENT = CorePackage.PACKAGE__IMPORTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Fix Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_SOFTWARE_SYSTEM__FIX_LEVEL = CorePackage.PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Software System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_SOFTWARE_SYSTEM__SOFTWARE_SYSTEM = CorePackage.PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Deployed Software System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYED_SOFTWARE_SYSTEM_FEATURE_COUNT = CorePackage.PACKAGE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link CWM.SoftwareDeployment.impl.DataManagerImpl <em>Data Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.SoftwareDeployment.impl.DataManagerImpl
	 * @see CWM.SoftwareDeployment.impl.SoftwareDeploymentPackageImpl#getDataManager()
	 * @generated
	 */
	int DATA_MANAGER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MANAGER__NAME = DEPLOYED_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MANAGER__VISIBILITY = DEPLOYED_COMPONENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MANAGER__CLIENT_DEPENDENCY = DEPLOYED_COMPONENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MANAGER__CONSTRAINT = DEPLOYED_COMPONENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MANAGER__IMPORTER = DEPLOYED_COMPONENT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MANAGER__NAMESPACE = DEPLOYED_COMPONENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MANAGER__TAGGED_VALUE = DEPLOYED_COMPONENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MANAGER__OWNED_ELEMENT = DEPLOYED_COMPONENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Imported Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MANAGER__IMPORTED_ELEMENT = DEPLOYED_COMPONENT__IMPORTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Pathname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MANAGER__PATHNAME = DEPLOYED_COMPONENT__PATHNAME;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MANAGER__COMPONENT = DEPLOYED_COMPONENT__COMPONENT;

	/**
	 * The feature id for the '<em><b>Machine</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MANAGER__MACHINE = DEPLOYED_COMPONENT__MACHINE;

	/**
	 * The feature id for the '<em><b>Using Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MANAGER__USING_COMPONENTS = DEPLOYED_COMPONENT__USING_COMPONENTS;

	/**
	 * The feature id for the '<em><b>Used Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MANAGER__USED_COMPONENTS = DEPLOYED_COMPONENT__USED_COMPONENTS;

	/**
	 * The feature id for the '<em><b>Is Case Sensitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MANAGER__IS_CASE_SENSITIVE = DEPLOYED_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MANAGER__DATA_PACKAGE = DEPLOYED_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MANAGER_FEATURE_COUNT = DEPLOYED_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link CWM.SoftwareDeployment.impl.DataProviderImpl <em>Data Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.SoftwareDeployment.impl.DataProviderImpl
	 * @see CWM.SoftwareDeployment.impl.SoftwareDeploymentPackageImpl#getDataProvider()
	 * @generated
	 */
	int DATA_PROVIDER = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROVIDER__NAME = DATA_MANAGER__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROVIDER__VISIBILITY = DATA_MANAGER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROVIDER__CLIENT_DEPENDENCY = DATA_MANAGER__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROVIDER__CONSTRAINT = DATA_MANAGER__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROVIDER__IMPORTER = DATA_MANAGER__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROVIDER__NAMESPACE = DATA_MANAGER__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROVIDER__TAGGED_VALUE = DATA_MANAGER__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROVIDER__OWNED_ELEMENT = DATA_MANAGER__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Imported Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROVIDER__IMPORTED_ELEMENT = DATA_MANAGER__IMPORTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Pathname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROVIDER__PATHNAME = DATA_MANAGER__PATHNAME;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROVIDER__COMPONENT = DATA_MANAGER__COMPONENT;

	/**
	 * The feature id for the '<em><b>Machine</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROVIDER__MACHINE = DATA_MANAGER__MACHINE;

	/**
	 * The feature id for the '<em><b>Using Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROVIDER__USING_COMPONENTS = DATA_MANAGER__USING_COMPONENTS;

	/**
	 * The feature id for the '<em><b>Used Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROVIDER__USED_COMPONENTS = DATA_MANAGER__USED_COMPONENTS;

	/**
	 * The feature id for the '<em><b>Is Case Sensitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROVIDER__IS_CASE_SENSITIVE = DATA_MANAGER__IS_CASE_SENSITIVE;

	/**
	 * The feature id for the '<em><b>Data Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROVIDER__DATA_PACKAGE = DATA_MANAGER__DATA_PACKAGE;

	/**
	 * The feature id for the '<em><b>Resource Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROVIDER__RESOURCE_CONNECTION = DATA_MANAGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROVIDER_FEATURE_COUNT = DATA_MANAGER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CWM.SoftwareDeployment.impl.ProviderConnectionImpl <em>Provider Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.SoftwareDeployment.impl.ProviderConnectionImpl
	 * @see CWM.SoftwareDeployment.impl.SoftwareDeploymentPackageImpl#getProviderConnection()
	 * @generated
	 */
	int PROVIDER_CONNECTION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_CONNECTION__NAME = CorePackage.MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_CONNECTION__VISIBILITY = CorePackage.MODEL_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_CONNECTION__CLIENT_DEPENDENCY = CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_CONNECTION__CONSTRAINT = CorePackage.MODEL_ELEMENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_CONNECTION__IMPORTER = CorePackage.MODEL_ELEMENT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_CONNECTION__NAMESPACE = CorePackage.MODEL_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_CONNECTION__TAGGED_VALUE = CorePackage.MODEL_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Is Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_CONNECTION__IS_READ_ONLY = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Provider</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_CONNECTION__DATA_PROVIDER = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_CONNECTION__DATA_MANAGER = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Provider Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_CONNECTION_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link CWM.SoftwareDeployment.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.SoftwareDeployment.impl.ComponentImpl
	 * @see CWM.SoftwareDeployment.impl.SoftwareDeploymentPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = CorePackage.CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__VISIBILITY = CorePackage.CLASSIFIER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CLIENT_DEPENDENCY = CorePackage.CLASSIFIER__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CONSTRAINT = CorePackage.CLASSIFIER__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__IMPORTER = CorePackage.CLASSIFIER__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAMESPACE = CorePackage.CLASSIFIER__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__TAGGED_VALUE = CorePackage.CLASSIFIER__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__OWNED_ELEMENT = CorePackage.CLASSIFIER__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__IS_ABSTRACT = CorePackage.CLASSIFIER__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__FEATURE = CorePackage.CLASSIFIER__FEATURE;

	/**
	 * The feature id for the '<em><b>Design Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__DESIGN_PACKAGE = CorePackage.CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = CorePackage.CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CWM.SoftwareDeployment.impl.PackageUsageImpl <em>Package Usage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.SoftwareDeployment.impl.PackageUsageImpl
	 * @see CWM.SoftwareDeployment.impl.SoftwareDeploymentPackageImpl#getPackageUsage()
	 * @generated
	 */
	int PACKAGE_USAGE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_USAGE__NAME = CorePackage.DEPENDENCY__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_USAGE__VISIBILITY = CorePackage.DEPENDENCY__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_USAGE__CLIENT_DEPENDENCY = CorePackage.DEPENDENCY__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_USAGE__CONSTRAINT = CorePackage.DEPENDENCY__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_USAGE__IMPORTER = CorePackage.DEPENDENCY__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_USAGE__NAMESPACE = CorePackage.DEPENDENCY__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_USAGE__TAGGED_VALUE = CorePackage.DEPENDENCY__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_USAGE__KIND = CorePackage.DEPENDENCY__KIND;

	/**
	 * The feature id for the '<em><b>Client</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_USAGE__CLIENT = CorePackage.DEPENDENCY__CLIENT;

	/**
	 * The feature id for the '<em><b>Supplier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_USAGE__SUPPLIER = CorePackage.DEPENDENCY__SUPPLIER;

	/**
	 * The feature id for the '<em><b>Package Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_USAGE__PACKAGE_ALIAS = CorePackage.DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Package Usage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_USAGE_FEATURE_COUNT = CorePackage.DEPENDENCY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CWM.SoftwareDeployment.impl.SoftwareDeployment_containerImpl <em>Software Deployment container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.SoftwareDeployment.impl.SoftwareDeployment_containerImpl
	 * @see CWM.SoftwareDeployment.impl.SoftwareDeploymentPackageImpl#getSoftwareDeployment_container()
	 * @generated
	 */
	int SOFTWARE_DEPLOYMENT_CONTAINER = 10;

	/**
	 * The feature id for the '<em><b>Site</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_DEPLOYMENT_CONTAINER__SITE = 0;

	/**
	 * The feature id for the '<em><b>Machine</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_DEPLOYMENT_CONTAINER__MACHINE = 1;

	/**
	 * The feature id for the '<em><b>Software System</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_DEPLOYMENT_CONTAINER__SOFTWARE_SYSTEM = 2;

	/**
	 * The feature id for the '<em><b>Deployed Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_DEPLOYMENT_CONTAINER__DEPLOYED_COMPONENT = 3;

	/**
	 * The feature id for the '<em><b>Deployed Software System</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_DEPLOYMENT_CONTAINER__DEPLOYED_SOFTWARE_SYSTEM = 4;

	/**
	 * The feature id for the '<em><b>Data Manager</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_DEPLOYMENT_CONTAINER__DATA_MANAGER = 5;

	/**
	 * The feature id for the '<em><b>Data Provider</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_DEPLOYMENT_CONTAINER__DATA_PROVIDER = 6;

	/**
	 * The feature id for the '<em><b>Provider Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_DEPLOYMENT_CONTAINER__PROVIDER_CONNECTION = 7;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_DEPLOYMENT_CONTAINER__COMPONENT = 8;

	/**
	 * The feature id for the '<em><b>Package Usage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_DEPLOYMENT_CONTAINER__PACKAGE_USAGE = 9;

	/**
	 * The number of structural features of the '<em>Software Deployment container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_DEPLOYMENT_CONTAINER_FEATURE_COUNT = 10;


	/**
	 * Returns the meta object for class '{@link CWM.SoftwareDeployment.Site <em>Site</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Site</em>'.
	 * @see CWM.SoftwareDeployment.Site
	 * @generated
	 */
	EClass getSite();

	/**
	 * Returns the meta object for the reference list '{@link CWM.SoftwareDeployment.Site#getContainingSite <em>Containing Site</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Containing Site</em>'.
	 * @see CWM.SoftwareDeployment.Site#getContainingSite()
	 * @see #getSite()
	 * @generated
	 */
	EReference getSite_ContainingSite();

	/**
	 * Returns the meta object for class '{@link CWM.SoftwareDeployment.Machine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine</em>'.
	 * @see CWM.SoftwareDeployment.Machine
	 * @generated
	 */
	EClass getMachine();

	/**
	 * Returns the meta object for the attribute list '{@link CWM.SoftwareDeployment.Machine#getIpAddress <em>Ip Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ip Address</em>'.
	 * @see CWM.SoftwareDeployment.Machine#getIpAddress()
	 * @see #getMachine()
	 * @generated
	 */
	EAttribute getMachine_IpAddress();

	/**
	 * Returns the meta object for the attribute list '{@link CWM.SoftwareDeployment.Machine#getHostName <em>Host Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Host Name</em>'.
	 * @see CWM.SoftwareDeployment.Machine#getHostName()
	 * @see #getMachine()
	 * @generated
	 */
	EAttribute getMachine_HostName();

	/**
	 * Returns the meta object for the attribute '{@link CWM.SoftwareDeployment.Machine#getMachineID <em>Machine ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Machine ID</em>'.
	 * @see CWM.SoftwareDeployment.Machine#getMachineID()
	 * @see #getMachine()
	 * @generated
	 */
	EAttribute getMachine_MachineID();

	/**
	 * Returns the meta object for the reference '{@link CWM.SoftwareDeployment.Machine#getSite <em>Site</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Site</em>'.
	 * @see CWM.SoftwareDeployment.Machine#getSite()
	 * @see #getMachine()
	 * @generated
	 */
	EReference getMachine_Site();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.SoftwareDeployment.Machine#getDeployedComponent <em>Deployed Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deployed Component</em>'.
	 * @see CWM.SoftwareDeployment.Machine#getDeployedComponent()
	 * @see #getMachine()
	 * @generated
	 */
	EReference getMachine_DeployedComponent();

	/**
	 * Returns the meta object for class '{@link CWM.SoftwareDeployment.SoftwareSystem <em>Software System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software System</em>'.
	 * @see CWM.SoftwareDeployment.SoftwareSystem
	 * @generated
	 */
	EClass getSoftwareSystem();

	/**
	 * Returns the meta object for the attribute '{@link CWM.SoftwareDeployment.SoftwareSystem#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see CWM.SoftwareDeployment.SoftwareSystem#getType()
	 * @see #getSoftwareSystem()
	 * @generated
	 */
	EAttribute getSoftwareSystem_Type();

	/**
	 * Returns the meta object for the attribute '{@link CWM.SoftwareDeployment.SoftwareSystem#getSubtype <em>Subtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subtype</em>'.
	 * @see CWM.SoftwareDeployment.SoftwareSystem#getSubtype()
	 * @see #getSoftwareSystem()
	 * @generated
	 */
	EAttribute getSoftwareSystem_Subtype();

	/**
	 * Returns the meta object for the attribute '{@link CWM.SoftwareDeployment.SoftwareSystem#getSupplier <em>Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supplier</em>'.
	 * @see CWM.SoftwareDeployment.SoftwareSystem#getSupplier()
	 * @see #getSoftwareSystem()
	 * @generated
	 */
	EAttribute getSoftwareSystem_Supplier();

	/**
	 * Returns the meta object for the attribute '{@link CWM.SoftwareDeployment.SoftwareSystem#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see CWM.SoftwareDeployment.SoftwareSystem#getVersion()
	 * @see #getSoftwareSystem()
	 * @generated
	 */
	EAttribute getSoftwareSystem_Version();

	/**
	 * Returns the meta object for the reference list '{@link CWM.SoftwareDeployment.SoftwareSystem#getTypespace <em>Typespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Typespace</em>'.
	 * @see CWM.SoftwareDeployment.SoftwareSystem#getTypespace()
	 * @see #getSoftwareSystem()
	 * @generated
	 */
	EReference getSoftwareSystem_Typespace();

	/**
	 * Returns the meta object for class '{@link CWM.SoftwareDeployment.DeployedComponent <em>Deployed Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployed Component</em>'.
	 * @see CWM.SoftwareDeployment.DeployedComponent
	 * @generated
	 */
	EClass getDeployedComponent();

	/**
	 * Returns the meta object for the attribute '{@link CWM.SoftwareDeployment.DeployedComponent#getPathname <em>Pathname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pathname</em>'.
	 * @see CWM.SoftwareDeployment.DeployedComponent#getPathname()
	 * @see #getDeployedComponent()
	 * @generated
	 */
	EAttribute getDeployedComponent_Pathname();

	/**
	 * Returns the meta object for the reference '{@link CWM.SoftwareDeployment.DeployedComponent#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see CWM.SoftwareDeployment.DeployedComponent#getComponent()
	 * @see #getDeployedComponent()
	 * @generated
	 */
	EReference getDeployedComponent_Component();

	/**
	 * Returns the meta object for the container reference '{@link CWM.SoftwareDeployment.DeployedComponent#getMachine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Machine</em>'.
	 * @see CWM.SoftwareDeployment.DeployedComponent#getMachine()
	 * @see #getDeployedComponent()
	 * @generated
	 */
	EReference getDeployedComponent_Machine();

	/**
	 * Returns the meta object for the reference list '{@link CWM.SoftwareDeployment.DeployedComponent#getUsingComponents <em>Using Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Using Components</em>'.
	 * @see CWM.SoftwareDeployment.DeployedComponent#getUsingComponents()
	 * @see #getDeployedComponent()
	 * @generated
	 */
	EReference getDeployedComponent_UsingComponents();

	/**
	 * Returns the meta object for the reference list '{@link CWM.SoftwareDeployment.DeployedComponent#getUsedComponents <em>Used Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Used Components</em>'.
	 * @see CWM.SoftwareDeployment.DeployedComponent#getUsedComponents()
	 * @see #getDeployedComponent()
	 * @generated
	 */
	EReference getDeployedComponent_UsedComponents();

	/**
	 * Returns the meta object for class '{@link CWM.SoftwareDeployment.DeployedSoftwareSystem <em>Deployed Software System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployed Software System</em>'.
	 * @see CWM.SoftwareDeployment.DeployedSoftwareSystem
	 * @generated
	 */
	EClass getDeployedSoftwareSystem();

	/**
	 * Returns the meta object for the attribute '{@link CWM.SoftwareDeployment.DeployedSoftwareSystem#getFixLevel <em>Fix Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fix Level</em>'.
	 * @see CWM.SoftwareDeployment.DeployedSoftwareSystem#getFixLevel()
	 * @see #getDeployedSoftwareSystem()
	 * @generated
	 */
	EAttribute getDeployedSoftwareSystem_FixLevel();

	/**
	 * Returns the meta object for the reference '{@link CWM.SoftwareDeployment.DeployedSoftwareSystem#getSoftwareSystem <em>Software System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Software System</em>'.
	 * @see CWM.SoftwareDeployment.DeployedSoftwareSystem#getSoftwareSystem()
	 * @see #getDeployedSoftwareSystem()
	 * @generated
	 */
	EReference getDeployedSoftwareSystem_SoftwareSystem();

	/**
	 * Returns the meta object for class '{@link CWM.SoftwareDeployment.DataManager <em>Data Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Manager</em>'.
	 * @see CWM.SoftwareDeployment.DataManager
	 * @generated
	 */
	EClass getDataManager();

	/**
	 * Returns the meta object for the attribute '{@link CWM.SoftwareDeployment.DataManager#getIsCaseSensitive <em>Is Case Sensitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Case Sensitive</em>'.
	 * @see CWM.SoftwareDeployment.DataManager#getIsCaseSensitive()
	 * @see #getDataManager()
	 * @generated
	 */
	EAttribute getDataManager_IsCaseSensitive();

	/**
	 * Returns the meta object for the reference list '{@link CWM.SoftwareDeployment.DataManager#getDataPackage <em>Data Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Data Package</em>'.
	 * @see CWM.SoftwareDeployment.DataManager#getDataPackage()
	 * @see #getDataManager()
	 * @generated
	 */
	EReference getDataManager_DataPackage();

	/**
	 * Returns the meta object for class '{@link CWM.SoftwareDeployment.DataProvider <em>Data Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Provider</em>'.
	 * @see CWM.SoftwareDeployment.DataProvider
	 * @generated
	 */
	EClass getDataProvider();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.SoftwareDeployment.DataProvider#getResourceConnection <em>Resource Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Connection</em>'.
	 * @see CWM.SoftwareDeployment.DataProvider#getResourceConnection()
	 * @see #getDataProvider()
	 * @generated
	 */
	EReference getDataProvider_ResourceConnection();

	/**
	 * Returns the meta object for class '{@link CWM.SoftwareDeployment.ProviderConnection <em>Provider Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provider Connection</em>'.
	 * @see CWM.SoftwareDeployment.ProviderConnection
	 * @generated
	 */
	EClass getProviderConnection();

	/**
	 * Returns the meta object for the attribute '{@link CWM.SoftwareDeployment.ProviderConnection#getIsReadOnly <em>Is Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Read Only</em>'.
	 * @see CWM.SoftwareDeployment.ProviderConnection#getIsReadOnly()
	 * @see #getProviderConnection()
	 * @generated
	 */
	EAttribute getProviderConnection_IsReadOnly();

	/**
	 * Returns the meta object for the container reference '{@link CWM.SoftwareDeployment.ProviderConnection#getDataProvider <em>Data Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Data Provider</em>'.
	 * @see CWM.SoftwareDeployment.ProviderConnection#getDataProvider()
	 * @see #getProviderConnection()
	 * @generated
	 */
	EReference getProviderConnection_DataProvider();

	/**
	 * Returns the meta object for the reference '{@link CWM.SoftwareDeployment.ProviderConnection#getDataManager <em>Data Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Manager</em>'.
	 * @see CWM.SoftwareDeployment.ProviderConnection#getDataManager()
	 * @see #getProviderConnection()
	 * @generated
	 */
	EReference getProviderConnection_DataManager();

	/**
	 * Returns the meta object for class '{@link CWM.SoftwareDeployment.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see CWM.SoftwareDeployment.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the reference list '{@link CWM.SoftwareDeployment.Component#getDesignPackage <em>Design Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Design Package</em>'.
	 * @see CWM.SoftwareDeployment.Component#getDesignPackage()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_DesignPackage();

	/**
	 * Returns the meta object for class '{@link CWM.SoftwareDeployment.PackageUsage <em>Package Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Usage</em>'.
	 * @see CWM.SoftwareDeployment.PackageUsage
	 * @generated
	 */
	EClass getPackageUsage();

	/**
	 * Returns the meta object for the attribute '{@link CWM.SoftwareDeployment.PackageUsage#getPackageAlias <em>Package Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Alias</em>'.
	 * @see CWM.SoftwareDeployment.PackageUsage#getPackageAlias()
	 * @see #getPackageUsage()
	 * @generated
	 */
	EAttribute getPackageUsage_PackageAlias();

	/**
	 * Returns the meta object for class '{@link CWM.SoftwareDeployment.SoftwareDeployment_container <em>Software Deployment container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software Deployment container</em>'.
	 * @see CWM.SoftwareDeployment.SoftwareDeployment_container
	 * @generated
	 */
	EClass getSoftwareDeployment_container();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.SoftwareDeployment.SoftwareDeployment_container#getSite <em>Site</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Site</em>'.
	 * @see CWM.SoftwareDeployment.SoftwareDeployment_container#getSite()
	 * @see #getSoftwareDeployment_container()
	 * @generated
	 */
	EReference getSoftwareDeployment_container_Site();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.SoftwareDeployment.SoftwareDeployment_container#getMachine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Machine</em>'.
	 * @see CWM.SoftwareDeployment.SoftwareDeployment_container#getMachine()
	 * @see #getSoftwareDeployment_container()
	 * @generated
	 */
	EReference getSoftwareDeployment_container_Machine();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.SoftwareDeployment.SoftwareDeployment_container#getSoftwareSystem <em>Software System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Software System</em>'.
	 * @see CWM.SoftwareDeployment.SoftwareDeployment_container#getSoftwareSystem()
	 * @see #getSoftwareDeployment_container()
	 * @generated
	 */
	EReference getSoftwareDeployment_container_SoftwareSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.SoftwareDeployment.SoftwareDeployment_container#getDeployedComponent <em>Deployed Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deployed Component</em>'.
	 * @see CWM.SoftwareDeployment.SoftwareDeployment_container#getDeployedComponent()
	 * @see #getSoftwareDeployment_container()
	 * @generated
	 */
	EReference getSoftwareDeployment_container_DeployedComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.SoftwareDeployment.SoftwareDeployment_container#getDeployedSoftwareSystem <em>Deployed Software System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deployed Software System</em>'.
	 * @see CWM.SoftwareDeployment.SoftwareDeployment_container#getDeployedSoftwareSystem()
	 * @see #getSoftwareDeployment_container()
	 * @generated
	 */
	EReference getSoftwareDeployment_container_DeployedSoftwareSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.SoftwareDeployment.SoftwareDeployment_container#getDataManager <em>Data Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Manager</em>'.
	 * @see CWM.SoftwareDeployment.SoftwareDeployment_container#getDataManager()
	 * @see #getSoftwareDeployment_container()
	 * @generated
	 */
	EReference getSoftwareDeployment_container_DataManager();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.SoftwareDeployment.SoftwareDeployment_container#getDataProvider <em>Data Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Provider</em>'.
	 * @see CWM.SoftwareDeployment.SoftwareDeployment_container#getDataProvider()
	 * @see #getSoftwareDeployment_container()
	 * @generated
	 */
	EReference getSoftwareDeployment_container_DataProvider();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.SoftwareDeployment.SoftwareDeployment_container#getProviderConnection <em>Provider Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provider Connection</em>'.
	 * @see CWM.SoftwareDeployment.SoftwareDeployment_container#getProviderConnection()
	 * @see #getSoftwareDeployment_container()
	 * @generated
	 */
	EReference getSoftwareDeployment_container_ProviderConnection();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.SoftwareDeployment.SoftwareDeployment_container#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component</em>'.
	 * @see CWM.SoftwareDeployment.SoftwareDeployment_container#getComponent()
	 * @see #getSoftwareDeployment_container()
	 * @generated
	 */
	EReference getSoftwareDeployment_container_Component();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.SoftwareDeployment.SoftwareDeployment_container#getPackageUsage <em>Package Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Package Usage</em>'.
	 * @see CWM.SoftwareDeployment.SoftwareDeployment_container#getPackageUsage()
	 * @see #getSoftwareDeployment_container()
	 * @generated
	 */
	EReference getSoftwareDeployment_container_PackageUsage();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SoftwareDeploymentFactory getSoftwareDeploymentFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link CWM.SoftwareDeployment.impl.SiteImpl <em>Site</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.SoftwareDeployment.impl.SiteImpl
		 * @see CWM.SoftwareDeployment.impl.SoftwareDeploymentPackageImpl#getSite()
		 * @generated
		 */
		EClass SITE = eINSTANCE.getSite();

		/**
		 * The meta object literal for the '<em><b>Containing Site</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITE__CONTAINING_SITE = eINSTANCE.getSite_ContainingSite();

		/**
		 * The meta object literal for the '{@link CWM.SoftwareDeployment.impl.MachineImpl <em>Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.SoftwareDeployment.impl.MachineImpl
		 * @see CWM.SoftwareDeployment.impl.SoftwareDeploymentPackageImpl#getMachine()
		 * @generated
		 */
		EClass MACHINE = eINSTANCE.getMachine();

		/**
		 * The meta object literal for the '<em><b>Ip Address</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE__IP_ADDRESS = eINSTANCE.getMachine_IpAddress();

		/**
		 * The meta object literal for the '<em><b>Host Name</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE__HOST_NAME = eINSTANCE.getMachine_HostName();

		/**
		 * The meta object literal for the '<em><b>Machine ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE__MACHINE_ID = eINSTANCE.getMachine_MachineID();

		/**
		 * The meta object literal for the '<em><b>Site</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MACHINE__SITE = eINSTANCE.getMachine_Site();

		/**
		 * The meta object literal for the '<em><b>Deployed Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MACHINE__DEPLOYED_COMPONENT = eINSTANCE.getMachine_DeployedComponent();

		/**
		 * The meta object literal for the '{@link CWM.SoftwareDeployment.impl.SoftwareSystemImpl <em>Software System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.SoftwareDeployment.impl.SoftwareSystemImpl
		 * @see CWM.SoftwareDeployment.impl.SoftwareDeploymentPackageImpl#getSoftwareSystem()
		 * @generated
		 */
		EClass SOFTWARE_SYSTEM = eINSTANCE.getSoftwareSystem();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE_SYSTEM__TYPE = eINSTANCE.getSoftwareSystem_Type();

		/**
		 * The meta object literal for the '<em><b>Subtype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE_SYSTEM__SUBTYPE = eINSTANCE.getSoftwareSystem_Subtype();

		/**
		 * The meta object literal for the '<em><b>Supplier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE_SYSTEM__SUPPLIER = eINSTANCE.getSoftwareSystem_Supplier();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE_SYSTEM__VERSION = eINSTANCE.getSoftwareSystem_Version();

		/**
		 * The meta object literal for the '<em><b>Typespace</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_SYSTEM__TYPESPACE = eINSTANCE.getSoftwareSystem_Typespace();

		/**
		 * The meta object literal for the '{@link CWM.SoftwareDeployment.impl.DeployedComponentImpl <em>Deployed Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.SoftwareDeployment.impl.DeployedComponentImpl
		 * @see CWM.SoftwareDeployment.impl.SoftwareDeploymentPackageImpl#getDeployedComponent()
		 * @generated
		 */
		EClass DEPLOYED_COMPONENT = eINSTANCE.getDeployedComponent();

		/**
		 * The meta object literal for the '<em><b>Pathname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYED_COMPONENT__PATHNAME = eINSTANCE.getDeployedComponent_Pathname();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYED_COMPONENT__COMPONENT = eINSTANCE.getDeployedComponent_Component();

		/**
		 * The meta object literal for the '<em><b>Machine</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYED_COMPONENT__MACHINE = eINSTANCE.getDeployedComponent_Machine();

		/**
		 * The meta object literal for the '<em><b>Using Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYED_COMPONENT__USING_COMPONENTS = eINSTANCE.getDeployedComponent_UsingComponents();

		/**
		 * The meta object literal for the '<em><b>Used Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYED_COMPONENT__USED_COMPONENTS = eINSTANCE.getDeployedComponent_UsedComponents();

		/**
		 * The meta object literal for the '{@link CWM.SoftwareDeployment.impl.DeployedSoftwareSystemImpl <em>Deployed Software System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.SoftwareDeployment.impl.DeployedSoftwareSystemImpl
		 * @see CWM.SoftwareDeployment.impl.SoftwareDeploymentPackageImpl#getDeployedSoftwareSystem()
		 * @generated
		 */
		EClass DEPLOYED_SOFTWARE_SYSTEM = eINSTANCE.getDeployedSoftwareSystem();

		/**
		 * The meta object literal for the '<em><b>Fix Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYED_SOFTWARE_SYSTEM__FIX_LEVEL = eINSTANCE.getDeployedSoftwareSystem_FixLevel();

		/**
		 * The meta object literal for the '<em><b>Software System</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYED_SOFTWARE_SYSTEM__SOFTWARE_SYSTEM = eINSTANCE.getDeployedSoftwareSystem_SoftwareSystem();

		/**
		 * The meta object literal for the '{@link CWM.SoftwareDeployment.impl.DataManagerImpl <em>Data Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.SoftwareDeployment.impl.DataManagerImpl
		 * @see CWM.SoftwareDeployment.impl.SoftwareDeploymentPackageImpl#getDataManager()
		 * @generated
		 */
		EClass DATA_MANAGER = eINSTANCE.getDataManager();

		/**
		 * The meta object literal for the '<em><b>Is Case Sensitive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_MANAGER__IS_CASE_SENSITIVE = eINSTANCE.getDataManager_IsCaseSensitive();

		/**
		 * The meta object literal for the '<em><b>Data Package</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_MANAGER__DATA_PACKAGE = eINSTANCE.getDataManager_DataPackage();

		/**
		 * The meta object literal for the '{@link CWM.SoftwareDeployment.impl.DataProviderImpl <em>Data Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.SoftwareDeployment.impl.DataProviderImpl
		 * @see CWM.SoftwareDeployment.impl.SoftwareDeploymentPackageImpl#getDataProvider()
		 * @generated
		 */
		EClass DATA_PROVIDER = eINSTANCE.getDataProvider();

		/**
		 * The meta object literal for the '<em><b>Resource Connection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PROVIDER__RESOURCE_CONNECTION = eINSTANCE.getDataProvider_ResourceConnection();

		/**
		 * The meta object literal for the '{@link CWM.SoftwareDeployment.impl.ProviderConnectionImpl <em>Provider Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.SoftwareDeployment.impl.ProviderConnectionImpl
		 * @see CWM.SoftwareDeployment.impl.SoftwareDeploymentPackageImpl#getProviderConnection()
		 * @generated
		 */
		EClass PROVIDER_CONNECTION = eINSTANCE.getProviderConnection();

		/**
		 * The meta object literal for the '<em><b>Is Read Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVIDER_CONNECTION__IS_READ_ONLY = eINSTANCE.getProviderConnection_IsReadOnly();

		/**
		 * The meta object literal for the '<em><b>Data Provider</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDER_CONNECTION__DATA_PROVIDER = eINSTANCE.getProviderConnection_DataProvider();

		/**
		 * The meta object literal for the '<em><b>Data Manager</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDER_CONNECTION__DATA_MANAGER = eINSTANCE.getProviderConnection_DataManager();

		/**
		 * The meta object literal for the '{@link CWM.SoftwareDeployment.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.SoftwareDeployment.impl.ComponentImpl
		 * @see CWM.SoftwareDeployment.impl.SoftwareDeploymentPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Design Package</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__DESIGN_PACKAGE = eINSTANCE.getComponent_DesignPackage();

		/**
		 * The meta object literal for the '{@link CWM.SoftwareDeployment.impl.PackageUsageImpl <em>Package Usage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.SoftwareDeployment.impl.PackageUsageImpl
		 * @see CWM.SoftwareDeployment.impl.SoftwareDeploymentPackageImpl#getPackageUsage()
		 * @generated
		 */
		EClass PACKAGE_USAGE = eINSTANCE.getPackageUsage();

		/**
		 * The meta object literal for the '<em><b>Package Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE_USAGE__PACKAGE_ALIAS = eINSTANCE.getPackageUsage_PackageAlias();

		/**
		 * The meta object literal for the '{@link CWM.SoftwareDeployment.impl.SoftwareDeployment_containerImpl <em>Software Deployment container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.SoftwareDeployment.impl.SoftwareDeployment_containerImpl
		 * @see CWM.SoftwareDeployment.impl.SoftwareDeploymentPackageImpl#getSoftwareDeployment_container()
		 * @generated
		 */
		EClass SOFTWARE_DEPLOYMENT_CONTAINER = eINSTANCE.getSoftwareDeployment_container();

		/**
		 * The meta object literal for the '<em><b>Site</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_DEPLOYMENT_CONTAINER__SITE = eINSTANCE.getSoftwareDeployment_container_Site();

		/**
		 * The meta object literal for the '<em><b>Machine</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_DEPLOYMENT_CONTAINER__MACHINE = eINSTANCE.getSoftwareDeployment_container_Machine();

		/**
		 * The meta object literal for the '<em><b>Software System</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_DEPLOYMENT_CONTAINER__SOFTWARE_SYSTEM = eINSTANCE.getSoftwareDeployment_container_SoftwareSystem();

		/**
		 * The meta object literal for the '<em><b>Deployed Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_DEPLOYMENT_CONTAINER__DEPLOYED_COMPONENT = eINSTANCE.getSoftwareDeployment_container_DeployedComponent();

		/**
		 * The meta object literal for the '<em><b>Deployed Software System</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_DEPLOYMENT_CONTAINER__DEPLOYED_SOFTWARE_SYSTEM = eINSTANCE.getSoftwareDeployment_container_DeployedSoftwareSystem();

		/**
		 * The meta object literal for the '<em><b>Data Manager</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_DEPLOYMENT_CONTAINER__DATA_MANAGER = eINSTANCE.getSoftwareDeployment_container_DataManager();

		/**
		 * The meta object literal for the '<em><b>Data Provider</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_DEPLOYMENT_CONTAINER__DATA_PROVIDER = eINSTANCE.getSoftwareDeployment_container_DataProvider();

		/**
		 * The meta object literal for the '<em><b>Provider Connection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_DEPLOYMENT_CONTAINER__PROVIDER_CONNECTION = eINSTANCE.getSoftwareDeployment_container_ProviderConnection();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_DEPLOYMENT_CONTAINER__COMPONENT = eINSTANCE.getSoftwareDeployment_container_Component();

		/**
		 * The meta object literal for the '<em><b>Package Usage</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_DEPLOYMENT_CONTAINER__PACKAGE_USAGE = eINSTANCE.getSoftwareDeployment_container_PackageUsage();

	}

} //SoftwareDeploymentPackage

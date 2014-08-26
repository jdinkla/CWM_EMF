/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.BusinessInformation;

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
 * @see CWM.BusinessInformation.BusinessInformationFactory
 * @model kind="package"
 * @generated
 */
public interface BusinessInformationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "BusinessInformation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "BusinessInformation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "BusinessInformation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BusinessInformationPackage eINSTANCE = CWM.BusinessInformation.impl.BusinessInformationPackageImpl.init();

	/**
	 * The meta object id for the '{@link CWM.BusinessInformation.impl.ResponsiblePartyImpl <em>Responsible Party</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.BusinessInformation.impl.ResponsiblePartyImpl
	 * @see CWM.BusinessInformation.impl.BusinessInformationPackageImpl#getResponsibleParty()
	 * @generated
	 */
	int RESPONSIBLE_PARTY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_PARTY__NAME = CorePackage.NAMESPACE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_PARTY__VISIBILITY = CorePackage.NAMESPACE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_PARTY__CLIENT_DEPENDENCY = CorePackage.NAMESPACE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_PARTY__CONSTRAINT = CorePackage.NAMESPACE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_PARTY__IMPORTER = CorePackage.NAMESPACE__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_PARTY__NAMESPACE = CorePackage.NAMESPACE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_PARTY__TAGGED_VALUE = CorePackage.NAMESPACE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_PARTY__OWNED_ELEMENT = CorePackage.NAMESPACE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Responsibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_PARTY__RESPONSIBILITY = CorePackage.NAMESPACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_PARTY__CONTACT = CorePackage.NAMESPACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_PARTY__MODEL_ELEMENT = CorePackage.NAMESPACE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Responsible Party</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_PARTY_FEATURE_COUNT = CorePackage.NAMESPACE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link CWM.BusinessInformation.impl.TelephoneImpl <em>Telephone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.BusinessInformation.impl.TelephoneImpl
	 * @see CWM.BusinessInformation.impl.BusinessInformationPackageImpl#getTelephone()
	 * @generated
	 */
	int TELEPHONE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEPHONE__NAME = CorePackage.MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEPHONE__VISIBILITY = CorePackage.MODEL_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEPHONE__CLIENT_DEPENDENCY = CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEPHONE__CONSTRAINT = CorePackage.MODEL_ELEMENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEPHONE__IMPORTER = CorePackage.MODEL_ELEMENT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEPHONE__NAMESPACE = CorePackage.MODEL_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEPHONE__TAGGED_VALUE = CorePackage.MODEL_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEPHONE__PHONE_NUMBER = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Phone Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEPHONE__PHONE_TYPE = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEPHONE__CONTACT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Telephone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEPHONE_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link CWM.BusinessInformation.impl.EmailImpl <em>Email</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.BusinessInformation.impl.EmailImpl
	 * @see CWM.BusinessInformation.impl.BusinessInformationPackageImpl#getEmail()
	 * @generated
	 */
	int EMAIL = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL__NAME = CorePackage.MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL__VISIBILITY = CorePackage.MODEL_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL__CLIENT_DEPENDENCY = CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL__CONSTRAINT = CorePackage.MODEL_ELEMENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL__IMPORTER = CorePackage.MODEL_ELEMENT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL__NAMESPACE = CorePackage.MODEL_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL__TAGGED_VALUE = CorePackage.MODEL_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Email Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL__EMAIL_ADDRESS = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Email Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL__EMAIL_TYPE = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL__CONTACT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Email</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link CWM.BusinessInformation.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.BusinessInformation.impl.LocationImpl
	 * @see CWM.BusinessInformation.impl.BusinessInformationPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__NAME = CorePackage.MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__VISIBILITY = CorePackage.MODEL_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__CLIENT_DEPENDENCY = CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__CONSTRAINT = CorePackage.MODEL_ELEMENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__IMPORTER = CorePackage.MODEL_ELEMENT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__NAMESPACE = CorePackage.MODEL_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__TAGGED_VALUE = CorePackage.MODEL_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Location Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__LOCATION_TYPE = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__ADDRESS = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__CITY = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Post Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__POST_CODE = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__AREA = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__COUNTRY = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__CONTACT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link CWM.BusinessInformation.impl.ContactImpl <em>Contact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.BusinessInformation.impl.ContactImpl
	 * @see CWM.BusinessInformation.impl.BusinessInformationPackageImpl#getContact()
	 * @generated
	 */
	int CONTACT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__NAME = CorePackage.MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__VISIBILITY = CorePackage.MODEL_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__CLIENT_DEPENDENCY = CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__CONSTRAINT = CorePackage.MODEL_ELEMENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__IMPORTER = CorePackage.MODEL_ELEMENT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__NAMESPACE = CorePackage.MODEL_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__TAGGED_VALUE = CorePackage.MODEL_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Email</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__EMAIL = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__LOCATION = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__RESPONSIBLE_PARTY = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Telephone</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__TELEPHONE = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Url</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__URL = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Contact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link CWM.BusinessInformation.impl.DescriptionImpl <em>Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.BusinessInformation.impl.DescriptionImpl
	 * @see CWM.BusinessInformation.impl.BusinessInformationPackageImpl#getDescription()
	 * @generated
	 */
	int DESCRIPTION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__NAME = CorePackage.NAMESPACE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__VISIBILITY = CorePackage.NAMESPACE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__CLIENT_DEPENDENCY = CorePackage.NAMESPACE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__CONSTRAINT = CorePackage.NAMESPACE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__IMPORTER = CorePackage.NAMESPACE__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__NAMESPACE = CorePackage.NAMESPACE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__TAGGED_VALUE = CorePackage.NAMESPACE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__OWNED_ELEMENT = CorePackage.NAMESPACE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__BODY = CorePackage.NAMESPACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__LANGUAGE = CorePackage.NAMESPACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__TYPE = CorePackage.NAMESPACE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__MODEL_ELEMENT = CorePackage.NAMESPACE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_FEATURE_COUNT = CorePackage.NAMESPACE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link CWM.BusinessInformation.impl.DocumentImpl <em>Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.BusinessInformation.impl.DocumentImpl
	 * @see CWM.BusinessInformation.impl.BusinessInformationPackageImpl#getDocument()
	 * @generated
	 */
	int DOCUMENT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__NAME = CorePackage.NAMESPACE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__VISIBILITY = CorePackage.NAMESPACE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__CLIENT_DEPENDENCY = CorePackage.NAMESPACE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__CONSTRAINT = CorePackage.NAMESPACE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__IMPORTER = CorePackage.NAMESPACE__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__NAMESPACE = CorePackage.NAMESPACE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__TAGGED_VALUE = CorePackage.NAMESPACE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__OWNED_ELEMENT = CorePackage.NAMESPACE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__REFERENCE = CorePackage.NAMESPACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__TYPE = CorePackage.NAMESPACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__MODEL_ELEMENT = CorePackage.NAMESPACE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_FEATURE_COUNT = CorePackage.NAMESPACE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link CWM.BusinessInformation.impl.ResourceLocatorImpl <em>Resource Locator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.BusinessInformation.impl.ResourceLocatorImpl
	 * @see CWM.BusinessInformation.impl.BusinessInformationPackageImpl#getResourceLocator()
	 * @generated
	 */
	int RESOURCE_LOCATOR = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_LOCATOR__NAME = CorePackage.MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_LOCATOR__VISIBILITY = CorePackage.MODEL_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_LOCATOR__CLIENT_DEPENDENCY = CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_LOCATOR__CONSTRAINT = CorePackage.MODEL_ELEMENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_LOCATOR__IMPORTER = CorePackage.MODEL_ELEMENT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_LOCATOR__NAMESPACE = CorePackage.MODEL_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_LOCATOR__TAGGED_VALUE = CorePackage.MODEL_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_LOCATOR__URL = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_LOCATOR__CONTACT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Resource Locator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_LOCATOR_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link CWM.BusinessInformation.impl.BusinessInformation_containerImpl <em>Business Information container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.BusinessInformation.impl.BusinessInformation_containerImpl
	 * @see CWM.BusinessInformation.impl.BusinessInformationPackageImpl#getBusinessInformation_container()
	 * @generated
	 */
	int BUSINESS_INFORMATION_CONTAINER = 8;

	/**
	 * The feature id for the '<em><b>Responsible Party</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_INFORMATION_CONTAINER__RESPONSIBLE_PARTY = 0;

	/**
	 * The feature id for the '<em><b>Telephone</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_INFORMATION_CONTAINER__TELEPHONE = 1;

	/**
	 * The feature id for the '<em><b>Email</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_INFORMATION_CONTAINER__EMAIL = 2;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_INFORMATION_CONTAINER__LOCATION = 3;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_INFORMATION_CONTAINER__CONTACT = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_INFORMATION_CONTAINER__DESCRIPTION = 5;

	/**
	 * The feature id for the '<em><b>Document</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_INFORMATION_CONTAINER__DOCUMENT = 6;

	/**
	 * The feature id for the '<em><b>Resource Locator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_INFORMATION_CONTAINER__RESOURCE_LOCATOR = 7;

	/**
	 * The number of structural features of the '<em>Business Information container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_INFORMATION_CONTAINER_FEATURE_COUNT = 8;


	/**
	 * Returns the meta object for class '{@link CWM.BusinessInformation.ResponsibleParty <em>Responsible Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Responsible Party</em>'.
	 * @see CWM.BusinessInformation.ResponsibleParty
	 * @generated
	 */
	EClass getResponsibleParty();

	/**
	 * Returns the meta object for the attribute '{@link CWM.BusinessInformation.ResponsibleParty#getResponsibility <em>Responsibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Responsibility</em>'.
	 * @see CWM.BusinessInformation.ResponsibleParty#getResponsibility()
	 * @see #getResponsibleParty()
	 * @generated
	 */
	EAttribute getResponsibleParty_Responsibility();

	/**
	 * Returns the meta object for the reference list '{@link CWM.BusinessInformation.ResponsibleParty#getContact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contact</em>'.
	 * @see CWM.BusinessInformation.ResponsibleParty#getContact()
	 * @see #getResponsibleParty()
	 * @generated
	 */
	EReference getResponsibleParty_Contact();

	/**
	 * Returns the meta object for the reference list '{@link CWM.BusinessInformation.ResponsibleParty#getModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Model Element</em>'.
	 * @see CWM.BusinessInformation.ResponsibleParty#getModelElement()
	 * @see #getResponsibleParty()
	 * @generated
	 */
	EReference getResponsibleParty_ModelElement();

	/**
	 * Returns the meta object for class '{@link CWM.BusinessInformation.Telephone <em>Telephone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Telephone</em>'.
	 * @see CWM.BusinessInformation.Telephone
	 * @generated
	 */
	EClass getTelephone();

	/**
	 * Returns the meta object for the attribute '{@link CWM.BusinessInformation.Telephone#getPhoneNumber <em>Phone Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone Number</em>'.
	 * @see CWM.BusinessInformation.Telephone#getPhoneNumber()
	 * @see #getTelephone()
	 * @generated
	 */
	EAttribute getTelephone_PhoneNumber();

	/**
	 * Returns the meta object for the attribute '{@link CWM.BusinessInformation.Telephone#getPhoneType <em>Phone Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone Type</em>'.
	 * @see CWM.BusinessInformation.Telephone#getPhoneType()
	 * @see #getTelephone()
	 * @generated
	 */
	EAttribute getTelephone_PhoneType();

	/**
	 * Returns the meta object for the reference list '{@link CWM.BusinessInformation.Telephone#getContact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contact</em>'.
	 * @see CWM.BusinessInformation.Telephone#getContact()
	 * @see #getTelephone()
	 * @generated
	 */
	EReference getTelephone_Contact();

	/**
	 * Returns the meta object for class '{@link CWM.BusinessInformation.Email <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Email</em>'.
	 * @see CWM.BusinessInformation.Email
	 * @generated
	 */
	EClass getEmail();

	/**
	 * Returns the meta object for the attribute '{@link CWM.BusinessInformation.Email#getEmailAddress <em>Email Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email Address</em>'.
	 * @see CWM.BusinessInformation.Email#getEmailAddress()
	 * @see #getEmail()
	 * @generated
	 */
	EAttribute getEmail_EmailAddress();

	/**
	 * Returns the meta object for the attribute '{@link CWM.BusinessInformation.Email#getEmailType <em>Email Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email Type</em>'.
	 * @see CWM.BusinessInformation.Email#getEmailType()
	 * @see #getEmail()
	 * @generated
	 */
	EAttribute getEmail_EmailType();

	/**
	 * Returns the meta object for the reference list '{@link CWM.BusinessInformation.Email#getContact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contact</em>'.
	 * @see CWM.BusinessInformation.Email#getContact()
	 * @see #getEmail()
	 * @generated
	 */
	EReference getEmail_Contact();

	/**
	 * Returns the meta object for class '{@link CWM.BusinessInformation.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see CWM.BusinessInformation.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the attribute '{@link CWM.BusinessInformation.Location#getLocationType <em>Location Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location Type</em>'.
	 * @see CWM.BusinessInformation.Location#getLocationType()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_LocationType();

	/**
	 * Returns the meta object for the attribute '{@link CWM.BusinessInformation.Location#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see CWM.BusinessInformation.Location#getAddress()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Address();

	/**
	 * Returns the meta object for the attribute '{@link CWM.BusinessInformation.Location#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see CWM.BusinessInformation.Location#getCity()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_City();

	/**
	 * Returns the meta object for the attribute '{@link CWM.BusinessInformation.Location#getPostCode <em>Post Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Post Code</em>'.
	 * @see CWM.BusinessInformation.Location#getPostCode()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_PostCode();

	/**
	 * Returns the meta object for the attribute '{@link CWM.BusinessInformation.Location#getArea <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Area</em>'.
	 * @see CWM.BusinessInformation.Location#getArea()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Area();

	/**
	 * Returns the meta object for the attribute '{@link CWM.BusinessInformation.Location#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see CWM.BusinessInformation.Location#getCountry()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Country();

	/**
	 * Returns the meta object for the reference list '{@link CWM.BusinessInformation.Location#getContact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contact</em>'.
	 * @see CWM.BusinessInformation.Location#getContact()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_Contact();

	/**
	 * Returns the meta object for class '{@link CWM.BusinessInformation.Contact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contact</em>'.
	 * @see CWM.BusinessInformation.Contact
	 * @generated
	 */
	EClass getContact();

	/**
	 * Returns the meta object for the reference list '{@link CWM.BusinessInformation.Contact#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Email</em>'.
	 * @see CWM.BusinessInformation.Contact#getEmail()
	 * @see #getContact()
	 * @generated
	 */
	EReference getContact_Email();

	/**
	 * Returns the meta object for the reference list '{@link CWM.BusinessInformation.Contact#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Location</em>'.
	 * @see CWM.BusinessInformation.Contact#getLocation()
	 * @see #getContact()
	 * @generated
	 */
	EReference getContact_Location();

	/**
	 * Returns the meta object for the reference list '{@link CWM.BusinessInformation.Contact#getResponsibleParty <em>Responsible Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Responsible Party</em>'.
	 * @see CWM.BusinessInformation.Contact#getResponsibleParty()
	 * @see #getContact()
	 * @generated
	 */
	EReference getContact_ResponsibleParty();

	/**
	 * Returns the meta object for the reference list '{@link CWM.BusinessInformation.Contact#getTelephone <em>Telephone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Telephone</em>'.
	 * @see CWM.BusinessInformation.Contact#getTelephone()
	 * @see #getContact()
	 * @generated
	 */
	EReference getContact_Telephone();

	/**
	 * Returns the meta object for the reference list '{@link CWM.BusinessInformation.Contact#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Url</em>'.
	 * @see CWM.BusinessInformation.Contact#getUrl()
	 * @see #getContact()
	 * @generated
	 */
	EReference getContact_Url();

	/**
	 * Returns the meta object for class '{@link CWM.BusinessInformation.Description <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description</em>'.
	 * @see CWM.BusinessInformation.Description
	 * @generated
	 */
	EClass getDescription();

	/**
	 * Returns the meta object for the attribute '{@link CWM.BusinessInformation.Description#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see CWM.BusinessInformation.Description#getBody()
	 * @see #getDescription()
	 * @generated
	 */
	EAttribute getDescription_Body();

	/**
	 * Returns the meta object for the attribute '{@link CWM.BusinessInformation.Description#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see CWM.BusinessInformation.Description#getLanguage()
	 * @see #getDescription()
	 * @generated
	 */
	EAttribute getDescription_Language();

	/**
	 * Returns the meta object for the attribute '{@link CWM.BusinessInformation.Description#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see CWM.BusinessInformation.Description#getType()
	 * @see #getDescription()
	 * @generated
	 */
	EAttribute getDescription_Type();

	/**
	 * Returns the meta object for the reference list '{@link CWM.BusinessInformation.Description#getModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Model Element</em>'.
	 * @see CWM.BusinessInformation.Description#getModelElement()
	 * @see #getDescription()
	 * @generated
	 */
	EReference getDescription_ModelElement();

	/**
	 * Returns the meta object for class '{@link CWM.BusinessInformation.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document</em>'.
	 * @see CWM.BusinessInformation.Document
	 * @generated
	 */
	EClass getDocument();

	/**
	 * Returns the meta object for the attribute '{@link CWM.BusinessInformation.Document#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see CWM.BusinessInformation.Document#getReference()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_Reference();

	/**
	 * Returns the meta object for the attribute '{@link CWM.BusinessInformation.Document#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see CWM.BusinessInformation.Document#getType()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_Type();

	/**
	 * Returns the meta object for the reference list '{@link CWM.BusinessInformation.Document#getModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Model Element</em>'.
	 * @see CWM.BusinessInformation.Document#getModelElement()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_ModelElement();

	/**
	 * Returns the meta object for class '{@link CWM.BusinessInformation.ResourceLocator <em>Resource Locator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Locator</em>'.
	 * @see CWM.BusinessInformation.ResourceLocator
	 * @generated
	 */
	EClass getResourceLocator();

	/**
	 * Returns the meta object for the attribute '{@link CWM.BusinessInformation.ResourceLocator#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see CWM.BusinessInformation.ResourceLocator#getUrl()
	 * @see #getResourceLocator()
	 * @generated
	 */
	EAttribute getResourceLocator_Url();

	/**
	 * Returns the meta object for the reference list '{@link CWM.BusinessInformation.ResourceLocator#getContact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contact</em>'.
	 * @see CWM.BusinessInformation.ResourceLocator#getContact()
	 * @see #getResourceLocator()
	 * @generated
	 */
	EReference getResourceLocator_Contact();

	/**
	 * Returns the meta object for class '{@link CWM.BusinessInformation.BusinessInformation_container <em>Business Information container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Information container</em>'.
	 * @see CWM.BusinessInformation.BusinessInformation_container
	 * @generated
	 */
	EClass getBusinessInformation_container();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.BusinessInformation.BusinessInformation_container#getResponsibleParty <em>Responsible Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Responsible Party</em>'.
	 * @see CWM.BusinessInformation.BusinessInformation_container#getResponsibleParty()
	 * @see #getBusinessInformation_container()
	 * @generated
	 */
	EReference getBusinessInformation_container_ResponsibleParty();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.BusinessInformation.BusinessInformation_container#getTelephone <em>Telephone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Telephone</em>'.
	 * @see CWM.BusinessInformation.BusinessInformation_container#getTelephone()
	 * @see #getBusinessInformation_container()
	 * @generated
	 */
	EReference getBusinessInformation_container_Telephone();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.BusinessInformation.BusinessInformation_container#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Email</em>'.
	 * @see CWM.BusinessInformation.BusinessInformation_container#getEmail()
	 * @see #getBusinessInformation_container()
	 * @generated
	 */
	EReference getBusinessInformation_container_Email();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.BusinessInformation.BusinessInformation_container#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Location</em>'.
	 * @see CWM.BusinessInformation.BusinessInformation_container#getLocation()
	 * @see #getBusinessInformation_container()
	 * @generated
	 */
	EReference getBusinessInformation_container_Location();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.BusinessInformation.BusinessInformation_container#getContact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contact</em>'.
	 * @see CWM.BusinessInformation.BusinessInformation_container#getContact()
	 * @see #getBusinessInformation_container()
	 * @generated
	 */
	EReference getBusinessInformation_container_Contact();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.BusinessInformation.BusinessInformation_container#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see CWM.BusinessInformation.BusinessInformation_container#getDescription()
	 * @see #getBusinessInformation_container()
	 * @generated
	 */
	EReference getBusinessInformation_container_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.BusinessInformation.BusinessInformation_container#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Document</em>'.
	 * @see CWM.BusinessInformation.BusinessInformation_container#getDocument()
	 * @see #getBusinessInformation_container()
	 * @generated
	 */
	EReference getBusinessInformation_container_Document();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.BusinessInformation.BusinessInformation_container#getResourceLocator <em>Resource Locator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Locator</em>'.
	 * @see CWM.BusinessInformation.BusinessInformation_container#getResourceLocator()
	 * @see #getBusinessInformation_container()
	 * @generated
	 */
	EReference getBusinessInformation_container_ResourceLocator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BusinessInformationFactory getBusinessInformationFactory();

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
		 * The meta object literal for the '{@link CWM.BusinessInformation.impl.ResponsiblePartyImpl <em>Responsible Party</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.BusinessInformation.impl.ResponsiblePartyImpl
		 * @see CWM.BusinessInformation.impl.BusinessInformationPackageImpl#getResponsibleParty()
		 * @generated
		 */
		EClass RESPONSIBLE_PARTY = eINSTANCE.getResponsibleParty();

		/**
		 * The meta object literal for the '<em><b>Responsibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSIBLE_PARTY__RESPONSIBILITY = eINSTANCE.getResponsibleParty_Responsibility();

		/**
		 * The meta object literal for the '<em><b>Contact</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSIBLE_PARTY__CONTACT = eINSTANCE.getResponsibleParty_Contact();

		/**
		 * The meta object literal for the '<em><b>Model Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSIBLE_PARTY__MODEL_ELEMENT = eINSTANCE.getResponsibleParty_ModelElement();

		/**
		 * The meta object literal for the '{@link CWM.BusinessInformation.impl.TelephoneImpl <em>Telephone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.BusinessInformation.impl.TelephoneImpl
		 * @see CWM.BusinessInformation.impl.BusinessInformationPackageImpl#getTelephone()
		 * @generated
		 */
		EClass TELEPHONE = eINSTANCE.getTelephone();

		/**
		 * The meta object literal for the '<em><b>Phone Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TELEPHONE__PHONE_NUMBER = eINSTANCE.getTelephone_PhoneNumber();

		/**
		 * The meta object literal for the '<em><b>Phone Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TELEPHONE__PHONE_TYPE = eINSTANCE.getTelephone_PhoneType();

		/**
		 * The meta object literal for the '<em><b>Contact</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TELEPHONE__CONTACT = eINSTANCE.getTelephone_Contact();

		/**
		 * The meta object literal for the '{@link CWM.BusinessInformation.impl.EmailImpl <em>Email</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.BusinessInformation.impl.EmailImpl
		 * @see CWM.BusinessInformation.impl.BusinessInformationPackageImpl#getEmail()
		 * @generated
		 */
		EClass EMAIL = eINSTANCE.getEmail();

		/**
		 * The meta object literal for the '<em><b>Email Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMAIL__EMAIL_ADDRESS = eINSTANCE.getEmail_EmailAddress();

		/**
		 * The meta object literal for the '<em><b>Email Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMAIL__EMAIL_TYPE = eINSTANCE.getEmail_EmailType();

		/**
		 * The meta object literal for the '<em><b>Contact</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMAIL__CONTACT = eINSTANCE.getEmail_Contact();

		/**
		 * The meta object literal for the '{@link CWM.BusinessInformation.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.BusinessInformation.impl.LocationImpl
		 * @see CWM.BusinessInformation.impl.BusinessInformationPackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Location Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__LOCATION_TYPE = eINSTANCE.getLocation_LocationType();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__ADDRESS = eINSTANCE.getLocation_Address();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__CITY = eINSTANCE.getLocation_City();

		/**
		 * The meta object literal for the '<em><b>Post Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__POST_CODE = eINSTANCE.getLocation_PostCode();

		/**
		 * The meta object literal for the '<em><b>Area</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__AREA = eINSTANCE.getLocation_Area();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__COUNTRY = eINSTANCE.getLocation_Country();

		/**
		 * The meta object literal for the '<em><b>Contact</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__CONTACT = eINSTANCE.getLocation_Contact();

		/**
		 * The meta object literal for the '{@link CWM.BusinessInformation.impl.ContactImpl <em>Contact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.BusinessInformation.impl.ContactImpl
		 * @see CWM.BusinessInformation.impl.BusinessInformationPackageImpl#getContact()
		 * @generated
		 */
		EClass CONTACT = eINSTANCE.getContact();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT__EMAIL = eINSTANCE.getContact_Email();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT__LOCATION = eINSTANCE.getContact_Location();

		/**
		 * The meta object literal for the '<em><b>Responsible Party</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT__RESPONSIBLE_PARTY = eINSTANCE.getContact_ResponsibleParty();

		/**
		 * The meta object literal for the '<em><b>Telephone</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT__TELEPHONE = eINSTANCE.getContact_Telephone();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT__URL = eINSTANCE.getContact_Url();

		/**
		 * The meta object literal for the '{@link CWM.BusinessInformation.impl.DescriptionImpl <em>Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.BusinessInformation.impl.DescriptionImpl
		 * @see CWM.BusinessInformation.impl.BusinessInformationPackageImpl#getDescription()
		 * @generated
		 */
		EClass DESCRIPTION = eINSTANCE.getDescription();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION__BODY = eINSTANCE.getDescription_Body();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION__LANGUAGE = eINSTANCE.getDescription_Language();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION__TYPE = eINSTANCE.getDescription_Type();

		/**
		 * The meta object literal for the '<em><b>Model Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESCRIPTION__MODEL_ELEMENT = eINSTANCE.getDescription_ModelElement();

		/**
		 * The meta object literal for the '{@link CWM.BusinessInformation.impl.DocumentImpl <em>Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.BusinessInformation.impl.DocumentImpl
		 * @see CWM.BusinessInformation.impl.BusinessInformationPackageImpl#getDocument()
		 * @generated
		 */
		EClass DOCUMENT = eINSTANCE.getDocument();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__REFERENCE = eINSTANCE.getDocument_Reference();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__TYPE = eINSTANCE.getDocument_Type();

		/**
		 * The meta object literal for the '<em><b>Model Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__MODEL_ELEMENT = eINSTANCE.getDocument_ModelElement();

		/**
		 * The meta object literal for the '{@link CWM.BusinessInformation.impl.ResourceLocatorImpl <em>Resource Locator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.BusinessInformation.impl.ResourceLocatorImpl
		 * @see CWM.BusinessInformation.impl.BusinessInformationPackageImpl#getResourceLocator()
		 * @generated
		 */
		EClass RESOURCE_LOCATOR = eINSTANCE.getResourceLocator();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_LOCATOR__URL = eINSTANCE.getResourceLocator_Url();

		/**
		 * The meta object literal for the '<em><b>Contact</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_LOCATOR__CONTACT = eINSTANCE.getResourceLocator_Contact();

		/**
		 * The meta object literal for the '{@link CWM.BusinessInformation.impl.BusinessInformation_containerImpl <em>Business Information container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.BusinessInformation.impl.BusinessInformation_containerImpl
		 * @see CWM.BusinessInformation.impl.BusinessInformationPackageImpl#getBusinessInformation_container()
		 * @generated
		 */
		EClass BUSINESS_INFORMATION_CONTAINER = eINSTANCE.getBusinessInformation_container();

		/**
		 * The meta object literal for the '<em><b>Responsible Party</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_INFORMATION_CONTAINER__RESPONSIBLE_PARTY = eINSTANCE.getBusinessInformation_container_ResponsibleParty();

		/**
		 * The meta object literal for the '<em><b>Telephone</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_INFORMATION_CONTAINER__TELEPHONE = eINSTANCE.getBusinessInformation_container_Telephone();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_INFORMATION_CONTAINER__EMAIL = eINSTANCE.getBusinessInformation_container_Email();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_INFORMATION_CONTAINER__LOCATION = eINSTANCE.getBusinessInformation_container_Location();

		/**
		 * The meta object literal for the '<em><b>Contact</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_INFORMATION_CONTAINER__CONTACT = eINSTANCE.getBusinessInformation_container_Contact();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_INFORMATION_CONTAINER__DESCRIPTION = eINSTANCE.getBusinessInformation_container_Description();

		/**
		 * The meta object literal for the '<em><b>Document</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_INFORMATION_CONTAINER__DOCUMENT = eINSTANCE.getBusinessInformation_container_Document();

		/**
		 * The meta object literal for the '<em><b>Resource Locator</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_INFORMATION_CONTAINER__RESOURCE_LOCATOR = eINSTANCE.getBusinessInformation_container_ResourceLocator();

	}

} //BusinessInformationPackage

/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.BusinessInformation.impl;

import CWM.BusinessInformation.*;

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
public class BusinessInformationFactoryImpl extends EFactoryImpl implements BusinessInformationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BusinessInformationFactory init() {
		try {
			BusinessInformationFactory theBusinessInformationFactory = (BusinessInformationFactory)EPackage.Registry.INSTANCE.getEFactory("BusinessInformation"); 
			if (theBusinessInformationFactory != null) {
				return theBusinessInformationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BusinessInformationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessInformationFactoryImpl() {
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
			case BusinessInformationPackage.RESPONSIBLE_PARTY: return createResponsibleParty();
			case BusinessInformationPackage.TELEPHONE: return createTelephone();
			case BusinessInformationPackage.EMAIL: return createEmail();
			case BusinessInformationPackage.LOCATION: return createLocation();
			case BusinessInformationPackage.CONTACT: return createContact();
			case BusinessInformationPackage.DESCRIPTION: return createDescription();
			case BusinessInformationPackage.DOCUMENT: return createDocument();
			case BusinessInformationPackage.RESOURCE_LOCATOR: return createResourceLocator();
			case BusinessInformationPackage.BUSINESS_INFORMATION_CONTAINER: return createBusinessInformation_container();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponsibleParty createResponsibleParty() {
		ResponsiblePartyImpl responsibleParty = new ResponsiblePartyImpl();
		return responsibleParty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Telephone createTelephone() {
		TelephoneImpl telephone = new TelephoneImpl();
		return telephone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Email createEmail() {
		EmailImpl email = new EmailImpl();
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contact createContact() {
		ContactImpl contact = new ContactImpl();
		return contact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Description createDescription() {
		DescriptionImpl description = new DescriptionImpl();
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Document createDocument() {
		DocumentImpl document = new DocumentImpl();
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator createResourceLocator() {
		ResourceLocatorImpl resourceLocator = new ResourceLocatorImpl();
		return resourceLocator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessInformation_container createBusinessInformation_container() {
		BusinessInformation_containerImpl businessInformation_container = new BusinessInformation_containerImpl();
		return businessInformation_container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessInformationPackage getBusinessInformationPackage() {
		return (BusinessInformationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BusinessInformationPackage getPackage() {
		return BusinessInformationPackage.eINSTANCE;
	}

} //BusinessInformationFactoryImpl

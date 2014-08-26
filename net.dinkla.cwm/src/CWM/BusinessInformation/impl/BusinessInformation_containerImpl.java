/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.BusinessInformation.impl;

import CWM.BusinessInformation.BusinessInformationPackage;
import CWM.BusinessInformation.BusinessInformation_container;
import CWM.BusinessInformation.Contact;
import CWM.BusinessInformation.Description;
import CWM.BusinessInformation.Document;
import CWM.BusinessInformation.Email;
import CWM.BusinessInformation.Location;
import CWM.BusinessInformation.ResourceLocator;
import CWM.BusinessInformation.ResponsibleParty;
import CWM.BusinessInformation.Telephone;

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
 * An implementation of the model object '<em><b>Business Information container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.BusinessInformation.impl.BusinessInformation_containerImpl#getResponsibleParty <em>Responsible Party</em>}</li>
 *   <li>{@link CWM.BusinessInformation.impl.BusinessInformation_containerImpl#getTelephone <em>Telephone</em>}</li>
 *   <li>{@link CWM.BusinessInformation.impl.BusinessInformation_containerImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link CWM.BusinessInformation.impl.BusinessInformation_containerImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link CWM.BusinessInformation.impl.BusinessInformation_containerImpl#getContact <em>Contact</em>}</li>
 *   <li>{@link CWM.BusinessInformation.impl.BusinessInformation_containerImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link CWM.BusinessInformation.impl.BusinessInformation_containerImpl#getDocument <em>Document</em>}</li>
 *   <li>{@link CWM.BusinessInformation.impl.BusinessInformation_containerImpl#getResourceLocator <em>Resource Locator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BusinessInformation_containerImpl extends EObjectImpl implements BusinessInformation_container {
	/**
	 * The cached value of the '{@link #getResponsibleParty() <em>Responsible Party</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsibleParty()
	 * @generated
	 * @ordered
	 */
	protected EList<ResponsibleParty> responsibleParty;

	/**
	 * The cached value of the '{@link #getTelephone() <em>Telephone</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelephone()
	 * @generated
	 * @ordered
	 */
	protected EList<Telephone> telephone;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected EList<Email> email;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected EList<Location> location;

	/**
	 * The cached value of the '{@link #getContact() <em>Contact</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContact()
	 * @generated
	 * @ordered
	 */
	protected EList<Contact> contact;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected EList<Description> description;

	/**
	 * The cached value of the '{@link #getDocument() <em>Document</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocument()
	 * @generated
	 * @ordered
	 */
	protected EList<Document> document;

	/**
	 * The cached value of the '{@link #getResourceLocator() <em>Resource Locator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceLocator()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceLocator> resourceLocator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessInformation_containerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BusinessInformationPackage.Literals.BUSINESS_INFORMATION_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResponsibleParty> getResponsibleParty() {
		if (responsibleParty == null) {
			responsibleParty = new EObjectContainmentEList<ResponsibleParty>(ResponsibleParty.class, this, BusinessInformationPackage.BUSINESS_INFORMATION_CONTAINER__RESPONSIBLE_PARTY);
		}
		return responsibleParty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Telephone> getTelephone() {
		if (telephone == null) {
			telephone = new EObjectContainmentEList<Telephone>(Telephone.class, this, BusinessInformationPackage.BUSINESS_INFORMATION_CONTAINER__TELEPHONE);
		}
		return telephone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Email> getEmail() {
		if (email == null) {
			email = new EObjectContainmentEList<Email>(Email.class, this, BusinessInformationPackage.BUSINESS_INFORMATION_CONTAINER__EMAIL);
		}
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Location> getLocation() {
		if (location == null) {
			location = new EObjectContainmentEList<Location>(Location.class, this, BusinessInformationPackage.BUSINESS_INFORMATION_CONTAINER__LOCATION);
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Contact> getContact() {
		if (contact == null) {
			contact = new EObjectContainmentEList<Contact>(Contact.class, this, BusinessInformationPackage.BUSINESS_INFORMATION_CONTAINER__CONTACT);
		}
		return contact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Description> getDescription() {
		if (description == null) {
			description = new EObjectContainmentEList<Description>(Description.class, this, BusinessInformationPackage.BUSINESS_INFORMATION_CONTAINER__DESCRIPTION);
		}
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Document> getDocument() {
		if (document == null) {
			document = new EObjectContainmentEList<Document>(Document.class, this, BusinessInformationPackage.BUSINESS_INFORMATION_CONTAINER__DOCUMENT);
		}
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceLocator> getResourceLocator() {
		if (resourceLocator == null) {
			resourceLocator = new EObjectContainmentEList<ResourceLocator>(ResourceLocator.class, this, BusinessInformationPackage.BUSINESS_INFORMATION_CONTAINER__RESOURCE_LOCATOR);
		}
		return resourceLocator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BusinessInformationPackage.BUSINESS_INFORMATION_CONTAINER__RESPONSIBLE_PARTY:
				return ((InternalEList<?>)getResponsibleParty()).basicRemove(otherEnd, msgs);
			case BusinessInformationPackage.BUSINESS_INFORMATION_CONTAINER__TELEPHONE:
				return ((InternalEList<?>)getTelephone()).basicRemove(otherEnd, msgs);
			case BusinessInformationPackage.BUSINESS_INFORMATION_CONTAINER__EMAIL:
				return ((InternalEList<?>)getEmail()).basicRemove(otherEnd, msgs);
			case BusinessInformationPackage.BUSINESS_INFORMATION_CONTAINER__LOCATION:
				return ((InternalEList<?>)getLocation()).basicRemove(otherEnd, msgs);
			case BusinessInformationPackage.BUSINESS_INFORMATION_CONTAINER__CONTACT:
				return ((InternalEList<?>)getContact()).basicRemove(otherEnd, msgs);
			case BusinessInformationPackage.BUSINESS_INFORMATION_CONTAINER__DESCRIPTION:
				return ((InternalEList<?>)getDescription()).basicRemove(otherEnd, msgs);
			case BusinessInformationPackage.BUSINESS_INFORMATION_CONTAINER__DOCUMENT:
				return ((InternalEList<?>)getDocument()).basicRemove(otherEnd, msgs);
			case BusinessInformationPackage.BUSINESS_INFORMATION_CONTAINER__RESOURCE_LOCATOR:
				return ((InternalEList<?>)getResourceLocator()).basicRemove(otherEnd, msgs);
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
			case BusinessInformationPackage.BUSINESS_INFORMATION_CONTAINER__RESPONSIBLE_PARTY:
				return getResponsibleParty();
			case BusinessInformationPackage.BUSINESS_INFORMATION_CONTAINER__TELEPHONE:
				return getTelephone();
			case BusinessInformationPackage.BUSINESS_INFORMATION_CONTAINER__EMAIL:
				return getEmail();
			case BusinessInformationPackage.BUSINESS_INFORMATION_CONTAINER__LOCATION:
				return getLocation();
			case BusinessInformationPackage.BUSINESS_INFORMATION_CONTAINER__CONTACT:
				return getContact();
			case BusinessInformationPackage.BUSINESS_INFORMATION_CONTAINER__DESCRIPTION:
				return getDescription();
			case BusinessInformationPackage.BUSINESS_INFORMATION_CONTAINER__DOCUMENT:
				return getDocument();
			case BusinessInformationPackage.BUSINESS_INFORMATION_CONTAINER__RESOURCE_LOCATOR:
				return getResourceLocator();
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
			case BusinessInformationPackage.BUSINESS_INFORMATION_CONTAINER__RESPONSIBLE_PARTY:
				getResponsibleParty().clear();
				getResponsibleParty().addAll((Collection<? extends ResponsibleParty>)newValue);
				return;
			case BusinessInformationPackage.BUSINESS_INFORMATION_CONTAINER__TELEPHONE:
				getTelephone().clear();
				getTelephone().addAll((Collection<? extends Telephone>)newValue);
				return;
			case BusinessInformationPackage.BUSINESS_INFORMATION_CONTAINER__EMAIL:
				getEmail().clear();
				getEmail().addAll((Collection<? extends Email>)newValue);
				return;
			case BusinessInformationPackage.BUSINESS_INFORMATION_CONTAINER__LOCATION:
				getLocation().clear();
				getLocation().addAll((Collection<? extends Location>)newValue);
				return;
			case BusinessInformationPackage.BUSINESS_INFORMATION_CONTAINER__CONTACT:
				getContact().clear();
				getContact().addAll((Collection<? extends Contact>)newValue);
				return;
			case BusinessInformationPackage.BUSINESS_INFORMATION_CONTAINER__DESCRIPTION:
				getDescription().clear();
				getDescription().addAll((Collection<? extends Description>)newValue);
				return;
			case BusinessInformationPackage.BUSINESS_INFORMATION_CONTAINER__DOCUMENT:
				getDocument().clear();
				getDocument().addAll((Collection<? extends Document>)newValue);
				return;
			case BusinessInformationPackage.BUSINESS_INFORMATION_CONTAINER__RESOURCE_LOCATOR:
				getResourceLocator().clear();
				getResourceLocator().addAll((Collection<? extends ResourceLocator>)newValue);
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
			case BusinessInformationPackage.BUSINESS_INFORMATION_CONTAINER__RESPONSIBLE_PARTY:
				getResponsibleParty().clear();
				return;
			case BusinessInformationPackage.BUSINESS_INFORMATION_CONTAINER__TELEPHONE:
				getTelephone().clear();
				return;
			case BusinessInformationPackage.BUSINESS_INFORMATION_CONTAINER__EMAIL:
				getEmail().clear();
				return;
			case BusinessInformationPackage.BUSINESS_INFORMATION_CONTAINER__LOCATION:
				getLocation().clear();
				return;
			case BusinessInformationPackage.BUSINESS_INFORMATION_CONTAINER__CONTACT:
				getContact().clear();
				return;
			case BusinessInformationPackage.BUSINESS_INFORMATION_CONTAINER__DESCRIPTION:
				getDescription().clear();
				return;
			case BusinessInformationPackage.BUSINESS_INFORMATION_CONTAINER__DOCUMENT:
				getDocument().clear();
				return;
			case BusinessInformationPackage.BUSINESS_INFORMATION_CONTAINER__RESOURCE_LOCATOR:
				getResourceLocator().clear();
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
			case BusinessInformationPackage.BUSINESS_INFORMATION_CONTAINER__RESPONSIBLE_PARTY:
				return responsibleParty != null && !responsibleParty.isEmpty();
			case BusinessInformationPackage.BUSINESS_INFORMATION_CONTAINER__TELEPHONE:
				return telephone != null && !telephone.isEmpty();
			case BusinessInformationPackage.BUSINESS_INFORMATION_CONTAINER__EMAIL:
				return email != null && !email.isEmpty();
			case BusinessInformationPackage.BUSINESS_INFORMATION_CONTAINER__LOCATION:
				return location != null && !location.isEmpty();
			case BusinessInformationPackage.BUSINESS_INFORMATION_CONTAINER__CONTACT:
				return contact != null && !contact.isEmpty();
			case BusinessInformationPackage.BUSINESS_INFORMATION_CONTAINER__DESCRIPTION:
				return description != null && !description.isEmpty();
			case BusinessInformationPackage.BUSINESS_INFORMATION_CONTAINER__DOCUMENT:
				return document != null && !document.isEmpty();
			case BusinessInformationPackage.BUSINESS_INFORMATION_CONTAINER__RESOURCE_LOCATOR:
				return resourceLocator != null && !resourceLocator.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BusinessInformation_containerImpl

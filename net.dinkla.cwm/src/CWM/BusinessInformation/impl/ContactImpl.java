/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.BusinessInformation.impl;

import CWM.BusinessInformation.BusinessInformationPackage;
import CWM.BusinessInformation.Contact;
import CWM.BusinessInformation.Email;
import CWM.BusinessInformation.Location;
import CWM.BusinessInformation.ResourceLocator;
import CWM.BusinessInformation.ResponsibleParty;
import CWM.BusinessInformation.Telephone;

import CWM.Core.impl.ModelElementImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.BusinessInformation.impl.ContactImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link CWM.BusinessInformation.impl.ContactImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link CWM.BusinessInformation.impl.ContactImpl#getResponsibleParty <em>Responsible Party</em>}</li>
 *   <li>{@link CWM.BusinessInformation.impl.ContactImpl#getTelephone <em>Telephone</em>}</li>
 *   <li>{@link CWM.BusinessInformation.impl.ContactImpl#getUrl <em>Url</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContactImpl extends ModelElementImpl implements Contact {
	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected EList<Email> email;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected EList<Location> location;

	/**
	 * The cached value of the '{@link #getResponsibleParty() <em>Responsible Party</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsibleParty()
	 * @generated
	 * @ordered
	 */
	protected EList<ResponsibleParty> responsibleParty;

	/**
	 * The cached value of the '{@link #getTelephone() <em>Telephone</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelephone()
	 * @generated
	 * @ordered
	 */
	protected EList<Telephone> telephone;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceLocator> url;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BusinessInformationPackage.Literals.CONTACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Email> getEmail() {
		if (email == null) {
			email = new EObjectWithInverseResolvingEList.ManyInverse<Email>(Email.class, this, BusinessInformationPackage.CONTACT__EMAIL, BusinessInformationPackage.EMAIL__CONTACT);
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
			location = new EObjectWithInverseResolvingEList.ManyInverse<Location>(Location.class, this, BusinessInformationPackage.CONTACT__LOCATION, BusinessInformationPackage.LOCATION__CONTACT);
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResponsibleParty> getResponsibleParty() {
		if (responsibleParty == null) {
			responsibleParty = new EObjectWithInverseResolvingEList.ManyInverse<ResponsibleParty>(ResponsibleParty.class, this, BusinessInformationPackage.CONTACT__RESPONSIBLE_PARTY, BusinessInformationPackage.RESPONSIBLE_PARTY__CONTACT);
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
			telephone = new EObjectWithInverseResolvingEList.ManyInverse<Telephone>(Telephone.class, this, BusinessInformationPackage.CONTACT__TELEPHONE, BusinessInformationPackage.TELEPHONE__CONTACT);
		}
		return telephone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceLocator> getUrl() {
		if (url == null) {
			url = new EObjectWithInverseResolvingEList.ManyInverse<ResourceLocator>(ResourceLocator.class, this, BusinessInformationPackage.CONTACT__URL, BusinessInformationPackage.RESOURCE_LOCATOR__CONTACT);
		}
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BusinessInformationPackage.CONTACT__EMAIL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEmail()).basicAdd(otherEnd, msgs);
			case BusinessInformationPackage.CONTACT__LOCATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLocation()).basicAdd(otherEnd, msgs);
			case BusinessInformationPackage.CONTACT__RESPONSIBLE_PARTY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResponsibleParty()).basicAdd(otherEnd, msgs);
			case BusinessInformationPackage.CONTACT__TELEPHONE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTelephone()).basicAdd(otherEnd, msgs);
			case BusinessInformationPackage.CONTACT__URL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUrl()).basicAdd(otherEnd, msgs);
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
			case BusinessInformationPackage.CONTACT__EMAIL:
				return ((InternalEList<?>)getEmail()).basicRemove(otherEnd, msgs);
			case BusinessInformationPackage.CONTACT__LOCATION:
				return ((InternalEList<?>)getLocation()).basicRemove(otherEnd, msgs);
			case BusinessInformationPackage.CONTACT__RESPONSIBLE_PARTY:
				return ((InternalEList<?>)getResponsibleParty()).basicRemove(otherEnd, msgs);
			case BusinessInformationPackage.CONTACT__TELEPHONE:
				return ((InternalEList<?>)getTelephone()).basicRemove(otherEnd, msgs);
			case BusinessInformationPackage.CONTACT__URL:
				return ((InternalEList<?>)getUrl()).basicRemove(otherEnd, msgs);
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
			case BusinessInformationPackage.CONTACT__EMAIL:
				return getEmail();
			case BusinessInformationPackage.CONTACT__LOCATION:
				return getLocation();
			case BusinessInformationPackage.CONTACT__RESPONSIBLE_PARTY:
				return getResponsibleParty();
			case BusinessInformationPackage.CONTACT__TELEPHONE:
				return getTelephone();
			case BusinessInformationPackage.CONTACT__URL:
				return getUrl();
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
			case BusinessInformationPackage.CONTACT__EMAIL:
				getEmail().clear();
				getEmail().addAll((Collection<? extends Email>)newValue);
				return;
			case BusinessInformationPackage.CONTACT__LOCATION:
				getLocation().clear();
				getLocation().addAll((Collection<? extends Location>)newValue);
				return;
			case BusinessInformationPackage.CONTACT__RESPONSIBLE_PARTY:
				getResponsibleParty().clear();
				getResponsibleParty().addAll((Collection<? extends ResponsibleParty>)newValue);
				return;
			case BusinessInformationPackage.CONTACT__TELEPHONE:
				getTelephone().clear();
				getTelephone().addAll((Collection<? extends Telephone>)newValue);
				return;
			case BusinessInformationPackage.CONTACT__URL:
				getUrl().clear();
				getUrl().addAll((Collection<? extends ResourceLocator>)newValue);
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
			case BusinessInformationPackage.CONTACT__EMAIL:
				getEmail().clear();
				return;
			case BusinessInformationPackage.CONTACT__LOCATION:
				getLocation().clear();
				return;
			case BusinessInformationPackage.CONTACT__RESPONSIBLE_PARTY:
				getResponsibleParty().clear();
				return;
			case BusinessInformationPackage.CONTACT__TELEPHONE:
				getTelephone().clear();
				return;
			case BusinessInformationPackage.CONTACT__URL:
				getUrl().clear();
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
			case BusinessInformationPackage.CONTACT__EMAIL:
				return email != null && !email.isEmpty();
			case BusinessInformationPackage.CONTACT__LOCATION:
				return location != null && !location.isEmpty();
			case BusinessInformationPackage.CONTACT__RESPONSIBLE_PARTY:
				return responsibleParty != null && !responsibleParty.isEmpty();
			case BusinessInformationPackage.CONTACT__TELEPHONE:
				return telephone != null && !telephone.isEmpty();
			case BusinessInformationPackage.CONTACT__URL:
				return url != null && !url.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContactImpl

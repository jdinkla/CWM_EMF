/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.BusinessInformation.impl;

import CWM.BusinessInformation.BusinessInformationPackage;
import CWM.BusinessInformation.Contact;
import CWM.BusinessInformation.ResponsibleParty;

import CWM.Core.ModelElement;

import CWM.Core.impl.NamespaceImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Responsible Party</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.BusinessInformation.impl.ResponsiblePartyImpl#getResponsibility <em>Responsibility</em>}</li>
 *   <li>{@link CWM.BusinessInformation.impl.ResponsiblePartyImpl#getContact <em>Contact</em>}</li>
 *   <li>{@link CWM.BusinessInformation.impl.ResponsiblePartyImpl#getModelElement <em>Model Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResponsiblePartyImpl extends NamespaceImpl implements ResponsibleParty {
	/**
	 * The default value of the '{@link #getResponsibility() <em>Responsibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsibility()
	 * @generated
	 * @ordered
	 */
	protected static final String RESPONSIBILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResponsibility() <em>Responsibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsibility()
	 * @generated
	 * @ordered
	 */
	protected String responsibility = RESPONSIBILITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContact() <em>Contact</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContact()
	 * @generated
	 * @ordered
	 */
	protected EList<Contact> contact;

	/**
	 * The cached value of the '{@link #getModelElement() <em>Model Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelElement()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelElement> modelElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponsiblePartyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BusinessInformationPackage.Literals.RESPONSIBLE_PARTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResponsibility() {
		return responsibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponsibility(String newResponsibility) {
		String oldResponsibility = responsibility;
		responsibility = newResponsibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessInformationPackage.RESPONSIBLE_PARTY__RESPONSIBILITY, oldResponsibility, responsibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Contact> getContact() {
		if (contact == null) {
			contact = new EObjectWithInverseResolvingEList.ManyInverse<Contact>(Contact.class, this, BusinessInformationPackage.RESPONSIBLE_PARTY__CONTACT, BusinessInformationPackage.CONTACT__RESPONSIBLE_PARTY);
		}
		return contact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelElement> getModelElement() {
		if (modelElement == null) {
			modelElement = new EObjectResolvingEList<ModelElement>(ModelElement.class, this, BusinessInformationPackage.RESPONSIBLE_PARTY__MODEL_ELEMENT);
		}
		return modelElement;
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
			case BusinessInformationPackage.RESPONSIBLE_PARTY__CONTACT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContact()).basicAdd(otherEnd, msgs);
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
			case BusinessInformationPackage.RESPONSIBLE_PARTY__CONTACT:
				return ((InternalEList<?>)getContact()).basicRemove(otherEnd, msgs);
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
			case BusinessInformationPackage.RESPONSIBLE_PARTY__RESPONSIBILITY:
				return getResponsibility();
			case BusinessInformationPackage.RESPONSIBLE_PARTY__CONTACT:
				return getContact();
			case BusinessInformationPackage.RESPONSIBLE_PARTY__MODEL_ELEMENT:
				return getModelElement();
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
			case BusinessInformationPackage.RESPONSIBLE_PARTY__RESPONSIBILITY:
				setResponsibility((String)newValue);
				return;
			case BusinessInformationPackage.RESPONSIBLE_PARTY__CONTACT:
				getContact().clear();
				getContact().addAll((Collection<? extends Contact>)newValue);
				return;
			case BusinessInformationPackage.RESPONSIBLE_PARTY__MODEL_ELEMENT:
				getModelElement().clear();
				getModelElement().addAll((Collection<? extends ModelElement>)newValue);
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
			case BusinessInformationPackage.RESPONSIBLE_PARTY__RESPONSIBILITY:
				setResponsibility(RESPONSIBILITY_EDEFAULT);
				return;
			case BusinessInformationPackage.RESPONSIBLE_PARTY__CONTACT:
				getContact().clear();
				return;
			case BusinessInformationPackage.RESPONSIBLE_PARTY__MODEL_ELEMENT:
				getModelElement().clear();
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
			case BusinessInformationPackage.RESPONSIBLE_PARTY__RESPONSIBILITY:
				return RESPONSIBILITY_EDEFAULT == null ? responsibility != null : !RESPONSIBILITY_EDEFAULT.equals(responsibility);
			case BusinessInformationPackage.RESPONSIBLE_PARTY__CONTACT:
				return contact != null && !contact.isEmpty();
			case BusinessInformationPackage.RESPONSIBLE_PARTY__MODEL_ELEMENT:
				return modelElement != null && !modelElement.isEmpty();
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
		result.append(" (responsibility: ");
		result.append(responsibility);
		result.append(')');
		return result.toString();
	}

} //ResponsiblePartyImpl

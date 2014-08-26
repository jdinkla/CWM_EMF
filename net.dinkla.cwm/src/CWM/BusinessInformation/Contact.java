/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.BusinessInformation;

import CWM.Core.ModelElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.BusinessInformation.Contact#getEmail <em>Email</em>}</li>
 *   <li>{@link CWM.BusinessInformation.Contact#getLocation <em>Location</em>}</li>
 *   <li>{@link CWM.BusinessInformation.Contact#getResponsibleParty <em>Responsible Party</em>}</li>
 *   <li>{@link CWM.BusinessInformation.Contact#getTelephone <em>Telephone</em>}</li>
 *   <li>{@link CWM.BusinessInformation.Contact#getUrl <em>Url</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.BusinessInformation.BusinessInformationPackage#getContact()
 * @model
 * @generated
 */
public interface Contact extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Email</b></em>' reference list.
	 * The list contents are of type {@link CWM.BusinessInformation.Email}.
	 * It is bidirectional and its opposite is '{@link CWM.BusinessInformation.Email#getContact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' reference list.
	 * @see CWM.BusinessInformation.BusinessInformationPackage#getContact_Email()
	 * @see CWM.BusinessInformation.Email#getContact
	 * @model opposite="contact"
	 * @generated
	 */
	EList<Email> getEmail();

	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference list.
	 * The list contents are of type {@link CWM.BusinessInformation.Location}.
	 * It is bidirectional and its opposite is '{@link CWM.BusinessInformation.Location#getContact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference list.
	 * @see CWM.BusinessInformation.BusinessInformationPackage#getContact_Location()
	 * @see CWM.BusinessInformation.Location#getContact
	 * @model opposite="contact"
	 * @generated
	 */
	EList<Location> getLocation();

	/**
	 * Returns the value of the '<em><b>Responsible Party</b></em>' reference list.
	 * The list contents are of type {@link CWM.BusinessInformation.ResponsibleParty}.
	 * It is bidirectional and its opposite is '{@link CWM.BusinessInformation.ResponsibleParty#getContact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsible Party</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsible Party</em>' reference list.
	 * @see CWM.BusinessInformation.BusinessInformationPackage#getContact_ResponsibleParty()
	 * @see CWM.BusinessInformation.ResponsibleParty#getContact
	 * @model opposite="contact" ordered="false"
	 * @generated
	 */
	EList<ResponsibleParty> getResponsibleParty();

	/**
	 * Returns the value of the '<em><b>Telephone</b></em>' reference list.
	 * The list contents are of type {@link CWM.BusinessInformation.Telephone}.
	 * It is bidirectional and its opposite is '{@link CWM.BusinessInformation.Telephone#getContact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Telephone</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Telephone</em>' reference list.
	 * @see CWM.BusinessInformation.BusinessInformationPackage#getContact_Telephone()
	 * @see CWM.BusinessInformation.Telephone#getContact
	 * @model opposite="contact"
	 * @generated
	 */
	EList<Telephone> getTelephone();

	/**
	 * Returns the value of the '<em><b>Url</b></em>' reference list.
	 * The list contents are of type {@link CWM.BusinessInformation.ResourceLocator}.
	 * It is bidirectional and its opposite is '{@link CWM.BusinessInformation.ResourceLocator#getContact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' reference list.
	 * @see CWM.BusinessInformation.BusinessInformationPackage#getContact_Url()
	 * @see CWM.BusinessInformation.ResourceLocator#getContact
	 * @model opposite="contact"
	 * @generated
	 */
	EList<ResourceLocator> getUrl();

} // Contact

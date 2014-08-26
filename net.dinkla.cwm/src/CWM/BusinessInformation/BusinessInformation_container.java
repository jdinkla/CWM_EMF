/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.BusinessInformation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Information container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.BusinessInformation.BusinessInformation_container#getResponsibleParty <em>Responsible Party</em>}</li>
 *   <li>{@link CWM.BusinessInformation.BusinessInformation_container#getTelephone <em>Telephone</em>}</li>
 *   <li>{@link CWM.BusinessInformation.BusinessInformation_container#getEmail <em>Email</em>}</li>
 *   <li>{@link CWM.BusinessInformation.BusinessInformation_container#getLocation <em>Location</em>}</li>
 *   <li>{@link CWM.BusinessInformation.BusinessInformation_container#getContact <em>Contact</em>}</li>
 *   <li>{@link CWM.BusinessInformation.BusinessInformation_container#getDescription <em>Description</em>}</li>
 *   <li>{@link CWM.BusinessInformation.BusinessInformation_container#getDocument <em>Document</em>}</li>
 *   <li>{@link CWM.BusinessInformation.BusinessInformation_container#getResourceLocator <em>Resource Locator</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.BusinessInformation.BusinessInformationPackage#getBusinessInformation_container()
 * @model
 * @generated
 */
public interface BusinessInformation_container extends EObject {
	/**
	 * Returns the value of the '<em><b>Responsible Party</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.BusinessInformation.ResponsibleParty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsible Party</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsible Party</em>' containment reference list.
	 * @see CWM.BusinessInformation.BusinessInformationPackage#getBusinessInformation_container_ResponsibleParty()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResponsibleParty> getResponsibleParty();

	/**
	 * Returns the value of the '<em><b>Telephone</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.BusinessInformation.Telephone}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Telephone</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Telephone</em>' containment reference list.
	 * @see CWM.BusinessInformation.BusinessInformationPackage#getBusinessInformation_container_Telephone()
	 * @model containment="true"
	 * @generated
	 */
	EList<Telephone> getTelephone();

	/**
	 * Returns the value of the '<em><b>Email</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.BusinessInformation.Email}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' containment reference list.
	 * @see CWM.BusinessInformation.BusinessInformationPackage#getBusinessInformation_container_Email()
	 * @model containment="true"
	 * @generated
	 */
	EList<Email> getEmail();

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.BusinessInformation.Location}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference list.
	 * @see CWM.BusinessInformation.BusinessInformationPackage#getBusinessInformation_container_Location()
	 * @model containment="true"
	 * @generated
	 */
	EList<Location> getLocation();

	/**
	 * Returns the value of the '<em><b>Contact</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.BusinessInformation.Contact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact</em>' containment reference list.
	 * @see CWM.BusinessInformation.BusinessInformationPackage#getBusinessInformation_container_Contact()
	 * @model containment="true"
	 * @generated
	 */
	EList<Contact> getContact();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.BusinessInformation.Description}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference list.
	 * @see CWM.BusinessInformation.BusinessInformationPackage#getBusinessInformation_container_Description()
	 * @model containment="true"
	 * @generated
	 */
	EList<Description> getDescription();

	/**
	 * Returns the value of the '<em><b>Document</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.BusinessInformation.Document}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document</em>' containment reference list.
	 * @see CWM.BusinessInformation.BusinessInformationPackage#getBusinessInformation_container_Document()
	 * @model containment="true"
	 * @generated
	 */
	EList<Document> getDocument();

	/**
	 * Returns the value of the '<em><b>Resource Locator</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.BusinessInformation.ResourceLocator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Locator</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Locator</em>' containment reference list.
	 * @see CWM.BusinessInformation.BusinessInformationPackage#getBusinessInformation_container_ResourceLocator()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourceLocator> getResourceLocator();

} // BusinessInformation_container

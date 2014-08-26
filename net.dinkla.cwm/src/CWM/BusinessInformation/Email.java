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
 * A representation of the model object '<em><b>Email</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.BusinessInformation.Email#getEmailAddress <em>Email Address</em>}</li>
 *   <li>{@link CWM.BusinessInformation.Email#getEmailType <em>Email Type</em>}</li>
 *   <li>{@link CWM.BusinessInformation.Email#getContact <em>Contact</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.BusinessInformation.BusinessInformationPackage#getEmail()
 * @model
 * @generated
 */
public interface Email extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Email Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email Address</em>' attribute.
	 * @see #setEmailAddress(String)
	 * @see CWM.BusinessInformation.BusinessInformationPackage#getEmail_EmailAddress()
	 * @model unique="false" dataType="CWM.Core.String" required="true" ordered="false"
	 * @generated
	 */
	String getEmailAddress();

	/**
	 * Sets the value of the '{@link CWM.BusinessInformation.Email#getEmailAddress <em>Email Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email Address</em>' attribute.
	 * @see #getEmailAddress()
	 * @generated
	 */
	void setEmailAddress(String value);

	/**
	 * Returns the value of the '<em><b>Email Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email Type</em>' attribute.
	 * @see #setEmailType(String)
	 * @see CWM.BusinessInformation.BusinessInformationPackage#getEmail_EmailType()
	 * @model unique="false" dataType="CWM.Core.String" required="true" ordered="false"
	 * @generated
	 */
	String getEmailType();

	/**
	 * Sets the value of the '{@link CWM.BusinessInformation.Email#getEmailType <em>Email Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email Type</em>' attribute.
	 * @see #getEmailType()
	 * @generated
	 */
	void setEmailType(String value);

	/**
	 * Returns the value of the '<em><b>Contact</b></em>' reference list.
	 * The list contents are of type {@link CWM.BusinessInformation.Contact}.
	 * It is bidirectional and its opposite is '{@link CWM.BusinessInformation.Contact#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact</em>' reference list.
	 * @see CWM.BusinessInformation.BusinessInformationPackage#getEmail_Contact()
	 * @see CWM.BusinessInformation.Contact#getEmail
	 * @model opposite="email" ordered="false"
	 * @generated
	 */
	EList<Contact> getContact();

} // Email

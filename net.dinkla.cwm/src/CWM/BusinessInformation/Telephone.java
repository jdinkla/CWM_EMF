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
 * A representation of the model object '<em><b>Telephone</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.BusinessInformation.Telephone#getPhoneNumber <em>Phone Number</em>}</li>
 *   <li>{@link CWM.BusinessInformation.Telephone#getPhoneType <em>Phone Type</em>}</li>
 *   <li>{@link CWM.BusinessInformation.Telephone#getContact <em>Contact</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.BusinessInformation.BusinessInformationPackage#getTelephone()
 * @model
 * @generated
 */
public interface Telephone extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phone Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phone Number</em>' attribute.
	 * @see #setPhoneNumber(String)
	 * @see CWM.BusinessInformation.BusinessInformationPackage#getTelephone_PhoneNumber()
	 * @model unique="false" dataType="CWM.Core.String" required="true" ordered="false"
	 * @generated
	 */
	String getPhoneNumber();

	/**
	 * Sets the value of the '{@link CWM.BusinessInformation.Telephone#getPhoneNumber <em>Phone Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phone Number</em>' attribute.
	 * @see #getPhoneNumber()
	 * @generated
	 */
	void setPhoneNumber(String value);

	/**
	 * Returns the value of the '<em><b>Phone Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phone Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phone Type</em>' attribute.
	 * @see #setPhoneType(String)
	 * @see CWM.BusinessInformation.BusinessInformationPackage#getTelephone_PhoneType()
	 * @model unique="false" dataType="CWM.Core.String" required="true" ordered="false"
	 * @generated
	 */
	String getPhoneType();

	/**
	 * Sets the value of the '{@link CWM.BusinessInformation.Telephone#getPhoneType <em>Phone Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phone Type</em>' attribute.
	 * @see #getPhoneType()
	 * @generated
	 */
	void setPhoneType(String value);

	/**
	 * Returns the value of the '<em><b>Contact</b></em>' reference list.
	 * The list contents are of type {@link CWM.BusinessInformation.Contact}.
	 * It is bidirectional and its opposite is '{@link CWM.BusinessInformation.Contact#getTelephone <em>Telephone</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact</em>' reference list.
	 * @see CWM.BusinessInformation.BusinessInformationPackage#getTelephone_Contact()
	 * @see CWM.BusinessInformation.Contact#getTelephone
	 * @model opposite="telephone" ordered="false"
	 * @generated
	 */
	EList<Contact> getContact();

} // Telephone

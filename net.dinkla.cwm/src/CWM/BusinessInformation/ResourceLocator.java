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
 * A representation of the model object '<em><b>Resource Locator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.BusinessInformation.ResourceLocator#getUrl <em>Url</em>}</li>
 *   <li>{@link CWM.BusinessInformation.ResourceLocator#getContact <em>Contact</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.BusinessInformation.BusinessInformationPackage#getResourceLocator()
 * @model
 * @generated
 */
public interface ResourceLocator extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see CWM.BusinessInformation.BusinessInformationPackage#getResourceLocator_Url()
	 * @model unique="false" dataType="CWM.Core.String" required="true" ordered="false"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link CWM.BusinessInformation.ResourceLocator#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Contact</b></em>' reference list.
	 * The list contents are of type {@link CWM.BusinessInformation.Contact}.
	 * It is bidirectional and its opposite is '{@link CWM.BusinessInformation.Contact#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact</em>' reference list.
	 * @see CWM.BusinessInformation.BusinessInformationPackage#getResourceLocator_Contact()
	 * @see CWM.BusinessInformation.Contact#getUrl
	 * @model opposite="url" ordered="false"
	 * @generated
	 */
	EList<Contact> getContact();

} // ResourceLocator

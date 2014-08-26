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
 * A representation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.BusinessInformation.Location#getLocationType <em>Location Type</em>}</li>
 *   <li>{@link CWM.BusinessInformation.Location#getAddress <em>Address</em>}</li>
 *   <li>{@link CWM.BusinessInformation.Location#getCity <em>City</em>}</li>
 *   <li>{@link CWM.BusinessInformation.Location#getPostCode <em>Post Code</em>}</li>
 *   <li>{@link CWM.BusinessInformation.Location#getArea <em>Area</em>}</li>
 *   <li>{@link CWM.BusinessInformation.Location#getCountry <em>Country</em>}</li>
 *   <li>{@link CWM.BusinessInformation.Location#getContact <em>Contact</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.BusinessInformation.BusinessInformationPackage#getLocation()
 * @model
 * @generated
 */
public interface Location extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Location Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location Type</em>' attribute.
	 * @see #setLocationType(String)
	 * @see CWM.BusinessInformation.BusinessInformationPackage#getLocation_LocationType()
	 * @model unique="false" dataType="CWM.Core.String" required="true" ordered="false"
	 * @generated
	 */
	String getLocationType();

	/**
	 * Sets the value of the '{@link CWM.BusinessInformation.Location#getLocationType <em>Location Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Type</em>' attribute.
	 * @see #getLocationType()
	 * @generated
	 */
	void setLocationType(String value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see CWM.BusinessInformation.BusinessInformationPackage#getLocation_Address()
	 * @model unique="false" dataType="CWM.Core.String" required="true" ordered="false"
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link CWM.BusinessInformation.Location#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>City</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City</em>' attribute.
	 * @see #setCity(String)
	 * @see CWM.BusinessInformation.BusinessInformationPackage#getLocation_City()
	 * @model unique="false" dataType="CWM.Core.String" required="true" ordered="false"
	 * @generated
	 */
	String getCity();

	/**
	 * Sets the value of the '{@link CWM.BusinessInformation.Location#getCity <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' attribute.
	 * @see #getCity()
	 * @generated
	 */
	void setCity(String value);

	/**
	 * Returns the value of the '<em><b>Post Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post Code</em>' attribute.
	 * @see #setPostCode(String)
	 * @see CWM.BusinessInformation.BusinessInformationPackage#getLocation_PostCode()
	 * @model unique="false" dataType="CWM.Core.String" required="true" ordered="false"
	 * @generated
	 */
	String getPostCode();

	/**
	 * Sets the value of the '{@link CWM.BusinessInformation.Location#getPostCode <em>Post Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Code</em>' attribute.
	 * @see #getPostCode()
	 * @generated
	 */
	void setPostCode(String value);

	/**
	 * Returns the value of the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Area</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Area</em>' attribute.
	 * @see #setArea(String)
	 * @see CWM.BusinessInformation.BusinessInformationPackage#getLocation_Area()
	 * @model unique="false" dataType="CWM.Core.String" required="true" ordered="false"
	 * @generated
	 */
	String getArea();

	/**
	 * Sets the value of the '{@link CWM.BusinessInformation.Location#getArea <em>Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Area</em>' attribute.
	 * @see #getArea()
	 * @generated
	 */
	void setArea(String value);

	/**
	 * Returns the value of the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' attribute.
	 * @see #setCountry(String)
	 * @see CWM.BusinessInformation.BusinessInformationPackage#getLocation_Country()
	 * @model unique="false" dataType="CWM.Core.String" required="true" ordered="false"
	 * @generated
	 */
	String getCountry();

	/**
	 * Sets the value of the '{@link CWM.BusinessInformation.Location#getCountry <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' attribute.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(String value);

	/**
	 * Returns the value of the '<em><b>Contact</b></em>' reference list.
	 * The list contents are of type {@link CWM.BusinessInformation.Contact}.
	 * It is bidirectional and its opposite is '{@link CWM.BusinessInformation.Contact#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact</em>' reference list.
	 * @see CWM.BusinessInformation.BusinessInformationPackage#getLocation_Contact()
	 * @see CWM.BusinessInformation.Contact#getLocation
	 * @model opposite="location" ordered="false"
	 * @generated
	 */
	EList<Contact> getContact();

} // Location

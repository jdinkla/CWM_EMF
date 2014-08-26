/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.BusinessInformation;

import CWM.Core.ModelElement;
import CWM.Core.Namespace;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.BusinessInformation.Description#getBody <em>Body</em>}</li>
 *   <li>{@link CWM.BusinessInformation.Description#getLanguage <em>Language</em>}</li>
 *   <li>{@link CWM.BusinessInformation.Description#getType <em>Type</em>}</li>
 *   <li>{@link CWM.BusinessInformation.Description#getModelElement <em>Model Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.BusinessInformation.BusinessInformationPackage#getDescription()
 * @model
 * @generated
 */
public interface Description extends Namespace {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see CWM.BusinessInformation.BusinessInformationPackage#getDescription_Body()
	 * @model unique="false" dataType="CWM.Core.String" required="true" ordered="false"
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link CWM.BusinessInformation.Description#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see CWM.BusinessInformation.BusinessInformationPackage#getDescription_Language()
	 * @model unique="false" dataType="CWM.Core.Name" required="true" ordered="false"
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link CWM.BusinessInformation.Description#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see CWM.BusinessInformation.BusinessInformationPackage#getDescription_Type()
	 * @model unique="false" dataType="CWM.Core.String" required="true" ordered="false"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link CWM.BusinessInformation.Description#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Model Element</b></em>' reference list.
	 * The list contents are of type {@link CWM.Core.ModelElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Element</em>' reference list.
	 * @see CWM.BusinessInformation.BusinessInformationPackage#getDescription_ModelElement()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ModelElement> getModelElement();

} // Description

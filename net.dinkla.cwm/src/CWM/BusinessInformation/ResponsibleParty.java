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
 * A representation of the model object '<em><b>Responsible Party</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.BusinessInformation.ResponsibleParty#getResponsibility <em>Responsibility</em>}</li>
 *   <li>{@link CWM.BusinessInformation.ResponsibleParty#getContact <em>Contact</em>}</li>
 *   <li>{@link CWM.BusinessInformation.ResponsibleParty#getModelElement <em>Model Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.BusinessInformation.BusinessInformationPackage#getResponsibleParty()
 * @model
 * @generated
 */
public interface ResponsibleParty extends Namespace {
	/**
	 * Returns the value of the '<em><b>Responsibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsibility</em>' attribute.
	 * @see #setResponsibility(String)
	 * @see CWM.BusinessInformation.BusinessInformationPackage#getResponsibleParty_Responsibility()
	 * @model unique="false" dataType="CWM.Core.String" required="true" ordered="false"
	 * @generated
	 */
	String getResponsibility();

	/**
	 * Sets the value of the '{@link CWM.BusinessInformation.ResponsibleParty#getResponsibility <em>Responsibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsibility</em>' attribute.
	 * @see #getResponsibility()
	 * @generated
	 */
	void setResponsibility(String value);

	/**
	 * Returns the value of the '<em><b>Contact</b></em>' reference list.
	 * The list contents are of type {@link CWM.BusinessInformation.Contact}.
	 * It is bidirectional and its opposite is '{@link CWM.BusinessInformation.Contact#getResponsibleParty <em>Responsible Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact</em>' reference list.
	 * @see CWM.BusinessInformation.BusinessInformationPackage#getResponsibleParty_Contact()
	 * @see CWM.BusinessInformation.Contact#getResponsibleParty
	 * @model opposite="responsibleParty"
	 * @generated
	 */
	EList<Contact> getContact();

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
	 * @see CWM.BusinessInformation.BusinessInformationPackage#getResponsibleParty_ModelElement()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ModelElement> getModelElement();

} // ResponsibleParty

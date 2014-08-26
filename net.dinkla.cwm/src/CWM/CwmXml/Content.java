/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.CwmXml;

import CWM.Core.ModelElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.CwmXml.Content#getType <em>Type</em>}</li>
 *   <li>{@link CWM.CwmXml.Content#getOccurrence <em>Occurrence</em>}</li>
 *   <li>{@link CWM.CwmXml.Content#getElementType <em>Element Type</em>}</li>
 *   <li>{@link CWM.CwmXml.Content#getOwnedElementType <em>Owned Element Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.CwmXml.CwmXmlPackage#getContent()
 * @model
 * @generated
 */
public interface Content extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link CWM.CwmXml.ContentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see CWM.CwmXml.ContentType
	 * @see #setType(ContentType)
	 * @see CWM.CwmXml.CwmXmlPackage#getContent_Type()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	ContentType getType();

	/**
	 * Sets the value of the '{@link CWM.CwmXml.Content#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see CWM.CwmXml.ContentType
	 * @see #getType()
	 * @generated
	 */
	void setType(ContentType value);

	/**
	 * Returns the value of the '<em><b>Occurrence</b></em>' attribute.
	 * The literals are from the enumeration {@link CWM.CwmXml.OccurrenceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occurrence</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occurrence</em>' attribute.
	 * @see CWM.CwmXml.OccurrenceType
	 * @see #setOccurrence(OccurrenceType)
	 * @see CWM.CwmXml.CwmXmlPackage#getContent_Occurrence()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	OccurrenceType getOccurrence();

	/**
	 * Sets the value of the '{@link CWM.CwmXml.Content#getOccurrence <em>Occurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurrence</em>' attribute.
	 * @see CWM.CwmXml.OccurrenceType
	 * @see #getOccurrence()
	 * @generated
	 */
	void setOccurrence(OccurrenceType value);

	/**
	 * Returns the value of the '<em><b>Element Type</b></em>' reference list.
	 * The list contents are of type {@link CWM.CwmXml.ElementType}.
	 * It is bidirectional and its opposite is '{@link CWM.CwmXml.ElementType#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Type</em>' reference list.
	 * @see CWM.CwmXml.CwmXmlPackage#getContent_ElementType()
	 * @see CWM.CwmXml.ElementType#getContent
	 * @model opposite="content" ordered="false"
	 * @generated
	 */
	EList<ElementType> getElementType();

	/**
	 * Returns the value of the '<em><b>Owned Element Type</b></em>' reference list.
	 * The list contents are of type {@link CWM.CwmXml.ElementTypeReference}.
	 * It is bidirectional and its opposite is '{@link CWM.CwmXml.ElementTypeReference#getOwnerContent <em>Owner Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Element Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Element Type</em>' reference list.
	 * @see CWM.CwmXml.CwmXmlPackage#getContent_OwnedElementType()
	 * @see CWM.CwmXml.ElementTypeReference#getOwnerContent
	 * @model opposite="ownerContent" ordered="false"
	 * @generated
	 */
	EList<ElementTypeReference> getOwnedElementType();

} // Content

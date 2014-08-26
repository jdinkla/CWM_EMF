/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.CwmXml;

import CWM.Core.Attribute;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Type Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.CwmXml.ElementTypeReference#getOccurrence <em>Occurrence</em>}</li>
 *   <li>{@link CWM.CwmXml.ElementTypeReference#getOwnerContent <em>Owner Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.CwmXml.CwmXmlPackage#getElementTypeReference()
 * @model
 * @generated
 */
public interface ElementTypeReference extends Attribute {
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
	 * @see CWM.CwmXml.CwmXmlPackage#getElementTypeReference_Occurrence()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	OccurrenceType getOccurrence();

	/**
	 * Sets the value of the '{@link CWM.CwmXml.ElementTypeReference#getOccurrence <em>Occurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurrence</em>' attribute.
	 * @see CWM.CwmXml.OccurrenceType
	 * @see #getOccurrence()
	 * @generated
	 */
	void setOccurrence(OccurrenceType value);

	/**
	 * Returns the value of the '<em><b>Owner Content</b></em>' reference list.
	 * The list contents are of type {@link CWM.CwmXml.Content}.
	 * It is bidirectional and its opposite is '{@link CWM.CwmXml.Content#getOwnedElementType <em>Owned Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner Content</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner Content</em>' reference list.
	 * @see CWM.CwmXml.CwmXmlPackage#getElementTypeReference_OwnerContent()
	 * @see CWM.CwmXml.Content#getOwnedElementType
	 * @model opposite="ownedElementType" ordered="false"
	 * @generated
	 */
	EList<Content> getOwnerContent();

} // ElementTypeReference

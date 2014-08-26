/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.CwmXml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XML container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.CwmXml.XML_container#getSchema <em>Schema</em>}</li>
 *   <li>{@link CWM.CwmXml.XML_container#getElementType <em>Element Type</em>}</li>
 *   <li>{@link CWM.CwmXml.XML_container#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link CWM.CwmXml.XML_container#getContent <em>Content</em>}</li>
 *   <li>{@link CWM.CwmXml.XML_container#getElementContent <em>Element Content</em>}</li>
 *   <li>{@link CWM.CwmXml.XML_container#getMixedContent <em>Mixed Content</em>}</li>
 *   <li>{@link CWM.CwmXml.XML_container#getElementTypeReference <em>Element Type Reference</em>}</li>
 *   <li>{@link CWM.CwmXml.XML_container#getText <em>Text</em>}</li>
 *   <li>{@link CWM.CwmXml.XML_container#getElement <em>Element</em>}</li>
 *   <li>{@link CWM.CwmXml.XML_container#getDocument <em>Document</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.CwmXml.CwmXmlPackage#getXML_container()
 * @model
 * @generated
 */
public interface XML_container extends EObject {
	/**
	 * Returns the value of the '<em><b>Schema</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.CwmXml.Schema}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' containment reference list.
	 * @see CWM.CwmXml.CwmXmlPackage#getXML_container_Schema()
	 * @model containment="true"
	 * @generated
	 */
	EList<Schema> getSchema();

	/**
	 * Returns the value of the '<em><b>Element Type</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.CwmXml.ElementType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Type</em>' containment reference list.
	 * @see CWM.CwmXml.CwmXmlPackage#getXML_container_ElementType()
	 * @model containment="true"
	 * @generated
	 */
	EList<ElementType> getElementType();

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.CwmXml.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see CWM.CwmXml.CwmXmlPackage#getXML_container_Attribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttribute();

	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.CwmXml.Content}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference list.
	 * @see CWM.CwmXml.CwmXmlPackage#getXML_container_Content()
	 * @model containment="true"
	 * @generated
	 */
	EList<Content> getContent();

	/**
	 * Returns the value of the '<em><b>Element Content</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.CwmXml.ElementContent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Content</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Content</em>' containment reference list.
	 * @see CWM.CwmXml.CwmXmlPackage#getXML_container_ElementContent()
	 * @model containment="true"
	 * @generated
	 */
	EList<ElementContent> getElementContent();

	/**
	 * Returns the value of the '<em><b>Mixed Content</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.CwmXml.MixedContent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed Content</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed Content</em>' containment reference list.
	 * @see CWM.CwmXml.CwmXmlPackage#getXML_container_MixedContent()
	 * @model containment="true"
	 * @generated
	 */
	EList<MixedContent> getMixedContent();

	/**
	 * Returns the value of the '<em><b>Element Type Reference</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.CwmXml.ElementTypeReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Type Reference</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Type Reference</em>' containment reference list.
	 * @see CWM.CwmXml.CwmXmlPackage#getXML_container_ElementTypeReference()
	 * @model containment="true"
	 * @generated
	 */
	EList<ElementTypeReference> getElementTypeReference();

	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.CwmXml.Text}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' containment reference list.
	 * @see CWM.CwmXml.CwmXmlPackage#getXML_container_Text()
	 * @model containment="true"
	 * @generated
	 */
	EList<Text> getText();

	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.CwmXml.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference list.
	 * @see CWM.CwmXml.CwmXmlPackage#getXML_container_Element()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getElement();

	/**
	 * Returns the value of the '<em><b>Document</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.CwmXml.Document}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document</em>' containment reference list.
	 * @see CWM.CwmXml.CwmXmlPackage#getXML_container_Document()
	 * @model containment="true"
	 * @generated
	 */
	EList<Document> getDocument();

} // XML_container

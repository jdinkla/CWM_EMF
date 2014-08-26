/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.CwmXml;

import CWM.Core.Feature;
import CWM.Core.Namespace;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.CwmXml.ElementType#getSchema <em>Schema</em>}</li>
 *   <li>{@link CWM.CwmXml.ElementType#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link CWM.CwmXml.ElementType#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.CwmXml.CwmXmlPackage#getElementType()
 * @model
 * @generated
 */
public interface ElementType extends CWM.Core.Class {
	/**
	 * Returns the value of the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' reference.
	 * @see #setSchema(Namespace)
	 * @see CWM.CwmXml.CwmXmlPackage#getElementType_Schema()
	 * @model ordered="false"
	 * @generated
	 */
	Namespace getSchema();

	/**
	 * Sets the value of the '{@link CWM.CwmXml.ElementType#getSchema <em>Schema</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema</em>' reference.
	 * @see #getSchema()
	 * @generated
	 */
	void setSchema(Namespace value);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Core.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see CWM.CwmXml.CwmXmlPackage#getElementType_Attribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<Feature> getAttribute();

	/**
	 * Returns the value of the '<em><b>Content</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CWM.CwmXml.Content#getElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' reference.
	 * @see #setContent(Content)
	 * @see CWM.CwmXml.CwmXmlPackage#getElementType_Content()
	 * @see CWM.CwmXml.Content#getElementType
	 * @model opposite="elementType" ordered="false"
	 * @generated
	 */
	Content getContent();

	/**
	 * Sets the value of the '{@link CWM.CwmXml.ElementType#getContent <em>Content</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(Content value);

} // ElementType

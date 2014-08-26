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
 * A representation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.CwmXml.Schema#getVersion <em>Version</em>}</li>
 *   <li>{@link CWM.CwmXml.Schema#getXmlNamespace <em>Xml Namespace</em>}</li>
 *   <li>{@link CWM.CwmXml.Schema#getElementType <em>Element Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.CwmXml.CwmXmlPackage#getSchema()
 * @model
 * @generated
 */
public interface Schema extends CWM.Core.Package {
	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see CWM.CwmXml.CwmXmlPackage#getSchema_Version()
	 * @model unique="false" dataType="CWM.Core.String" required="true" ordered="false"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link CWM.CwmXml.Schema#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Xml Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xml Namespace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xml Namespace</em>' attribute.
	 * @see #setXmlNamespace(String)
	 * @see CWM.CwmXml.CwmXmlPackage#getSchema_XmlNamespace()
	 * @model unique="false" dataType="CWM.Core.String" required="true" ordered="false"
	 * @generated
	 */
	String getXmlNamespace();

	/**
	 * Sets the value of the '{@link CWM.CwmXml.Schema#getXmlNamespace <em>Xml Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xml Namespace</em>' attribute.
	 * @see #getXmlNamespace()
	 * @generated
	 */
	void setXmlNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Element Type</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Core.ModelElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Type</em>' containment reference list.
	 * @see CWM.CwmXml.CwmXmlPackage#getSchema_ElementType()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ModelElement> getElementType();

} // Schema

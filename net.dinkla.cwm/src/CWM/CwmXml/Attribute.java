/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.CwmXml;

import CWM.Core.Classifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.CwmXml.Attribute#getDefaultKind <em>Default Kind</em>}</li>
 *   <li>{@link CWM.CwmXml.Attribute#getElementType <em>Element Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.CwmXml.CwmXmlPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends CWM.Core.Attribute {
	/**
	 * Returns the value of the '<em><b>Default Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CWM.CwmXml.AttributeDefault}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Kind</em>' attribute.
	 * @see CWM.CwmXml.AttributeDefault
	 * @see #setDefaultKind(AttributeDefault)
	 * @see CWM.CwmXml.CwmXmlPackage#getAttribute_DefaultKind()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	AttributeDefault getDefaultKind();

	/**
	 * Sets the value of the '{@link CWM.CwmXml.Attribute#getDefaultKind <em>Default Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Kind</em>' attribute.
	 * @see CWM.CwmXml.AttributeDefault
	 * @see #getDefaultKind()
	 * @generated
	 */
	void setDefaultKind(AttributeDefault value);

	/**
	 * Returns the value of the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Type</em>' reference.
	 * @see #setElementType(Classifier)
	 * @see CWM.CwmXml.CwmXmlPackage#getAttribute_ElementType()
	 * @model ordered="false"
	 * @generated
	 */
	Classifier getElementType();

	/**
	 * Sets the value of the '{@link CWM.CwmXml.Attribute#getElementType <em>Element Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Type</em>' reference.
	 * @see #getElementType()
	 * @generated
	 */
	void setElementType(Classifier value);

} // Attribute

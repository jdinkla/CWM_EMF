/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.CwmXml;

import CWM.Core.Attribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.CwmXml.Text#getOwnerContent <em>Owner Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.CwmXml.CwmXmlPackage#getText()
 * @model
 * @generated
 */
public interface Text extends Attribute {
	/**
	 * Returns the value of the '<em><b>Owner Content</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link CWM.CwmXml.MixedContent#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner Content</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner Content</em>' container reference.
	 * @see #setOwnerContent(MixedContent)
	 * @see CWM.CwmXml.CwmXmlPackage#getText_OwnerContent()
	 * @see CWM.CwmXml.MixedContent#getText
	 * @model opposite="text" required="true" transient="false" ordered="false"
	 * @generated
	 */
	MixedContent getOwnerContent();

	/**
	 * Sets the value of the '{@link CWM.CwmXml.Text#getOwnerContent <em>Owner Content</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner Content</em>' container reference.
	 * @see #getOwnerContent()
	 * @generated
	 */
	void setOwnerContent(MixedContent value);

} // Text

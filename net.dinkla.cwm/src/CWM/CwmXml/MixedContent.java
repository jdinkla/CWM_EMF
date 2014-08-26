/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.CwmXml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mixed Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.CwmXml.MixedContent#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.CwmXml.CwmXmlPackage#getMixedContent()
 * @model
 * @generated
 */
public interface MixedContent extends Content {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link CWM.CwmXml.Text#getOwnerContent <em>Owner Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' containment reference.
	 * @see #setText(Text)
	 * @see CWM.CwmXml.CwmXmlPackage#getMixedContent_Text()
	 * @see CWM.CwmXml.Text#getOwnerContent
	 * @model opposite="ownerContent" containment="true" required="true" ordered="false"
	 * @generated
	 */
	Text getText();

	/**
	 * Sets the value of the '{@link CWM.CwmXml.MixedContent#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(Text value);

} // MixedContent

/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.CwmXml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.CwmXml.ElementContent#getOrder <em>Order</em>}</li>
 *   <li>{@link CWM.CwmXml.ElementContent#getOwnedContent <em>Owned Content</em>}</li>
 *   <li>{@link CWM.CwmXml.ElementContent#getOwnerContent <em>Owner Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.CwmXml.CwmXmlPackage#getElementContent()
 * @model
 * @generated
 */
public interface ElementContent extends Content {
	/**
	 * Returns the value of the '<em><b>Order</b></em>' attribute.
	 * The literals are from the enumeration {@link CWM.CwmXml.ElementOrderType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' attribute.
	 * @see CWM.CwmXml.ElementOrderType
	 * @see #setOrder(ElementOrderType)
	 * @see CWM.CwmXml.CwmXmlPackage#getElementContent_Order()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	ElementOrderType getOrder();

	/**
	 * Sets the value of the '{@link CWM.CwmXml.ElementContent#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' attribute.
	 * @see CWM.CwmXml.ElementOrderType
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(ElementOrderType value);

	/**
	 * Returns the value of the '<em><b>Owned Content</b></em>' reference list.
	 * The list contents are of type {@link CWM.CwmXml.ElementContent}.
	 * It is bidirectional and its opposite is '{@link CWM.CwmXml.ElementContent#getOwnerContent <em>Owner Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Content</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Content</em>' reference list.
	 * @see CWM.CwmXml.CwmXmlPackage#getElementContent_OwnedContent()
	 * @see CWM.CwmXml.ElementContent#getOwnerContent
	 * @model opposite="ownerContent" ordered="false"
	 * @generated
	 */
	EList<ElementContent> getOwnedContent();

	/**
	 * Returns the value of the '<em><b>Owner Content</b></em>' reference list.
	 * The list contents are of type {@link CWM.CwmXml.ElementContent}.
	 * It is bidirectional and its opposite is '{@link CWM.CwmXml.ElementContent#getOwnedContent <em>Owned Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner Content</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner Content</em>' reference list.
	 * @see CWM.CwmXml.CwmXmlPackage#getElementContent_OwnerContent()
	 * @see CWM.CwmXml.ElementContent#getOwnedContent
	 * @model opposite="ownedContent" ordered="false"
	 * @generated
	 */
	EList<ElementContent> getOwnerContent();

} // ElementContent

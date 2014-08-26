/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tagged Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Core.TaggedValue#getTag <em>Tag</em>}</li>
 *   <li>{@link CWM.Core.TaggedValue#getValue <em>Value</em>}</li>
 *   <li>{@link CWM.Core.TaggedValue#getModelElement <em>Model Element</em>}</li>
 *   <li>{@link CWM.Core.TaggedValue#getStereotype <em>Stereotype</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Core.CorePackage#getTaggedValue()
 * @model
 * @generated
 */
public interface TaggedValue extends Element {
	/**
	 * Returns the value of the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag</em>' attribute.
	 * @see #setTag(String)
	 * @see CWM.Core.CorePackage#getTaggedValue_Tag()
	 * @model unique="false" dataType="CWM.Core.Name" required="true" ordered="false"
	 * @generated
	 */
	String getTag();

	/**
	 * Sets the value of the '{@link CWM.Core.TaggedValue#getTag <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag</em>' attribute.
	 * @see #getTag()
	 * @generated
	 */
	void setTag(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see CWM.Core.CorePackage#getTaggedValue_Value()
	 * @model unique="false" dataType="CWM.Core.String" required="true" ordered="false"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link CWM.Core.TaggedValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Model Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link CWM.Core.ModelElement#getTaggedValue <em>Tagged Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Element</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Element</em>' container reference.
	 * @see #setModelElement(ModelElement)
	 * @see CWM.Core.CorePackage#getTaggedValue_ModelElement()
	 * @see CWM.Core.ModelElement#getTaggedValue
	 * @model opposite="taggedValue" transient="false" ordered="false"
	 * @generated
	 */
	ModelElement getModelElement();

	/**
	 * Sets the value of the '{@link CWM.Core.TaggedValue#getModelElement <em>Model Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Element</em>' container reference.
	 * @see #getModelElement()
	 * @generated
	 */
	void setModelElement(ModelElement value);

	/**
	 * Returns the value of the '<em><b>Stereotype</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link CWM.Core.Stereotype#getRequiredTag <em>Required Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stereotype</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stereotype</em>' container reference.
	 * @see #setStereotype(Stereotype)
	 * @see CWM.Core.CorePackage#getTaggedValue_Stereotype()
	 * @see CWM.Core.Stereotype#getRequiredTag
	 * @model opposite="requiredTag" transient="false" ordered="false"
	 * @generated
	 */
	Stereotype getStereotype();

	/**
	 * Sets the value of the '{@link CWM.Core.TaggedValue#getStereotype <em>Stereotype</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stereotype</em>' container reference.
	 * @see #getStereotype()
	 * @generated
	 */
	void setStereotype(Stereotype value);

} // TaggedValue

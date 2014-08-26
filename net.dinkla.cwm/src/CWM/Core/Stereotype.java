/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stereotype</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Core.Stereotype#getBaseClass <em>Base Class</em>}</li>
 *   <li>{@link CWM.Core.Stereotype#getExtendedElement <em>Extended Element</em>}</li>
 *   <li>{@link CWM.Core.Stereotype#getRequiredTag <em>Required Tag</em>}</li>
 *   <li>{@link CWM.Core.Stereotype#getStereotypeConstraint <em>Stereotype Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Core.CorePackage#getStereotype()
 * @model
 * @generated
 */
public interface Stereotype extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Base Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Class</em>' attribute.
	 * @see #setBaseClass(String)
	 * @see CWM.Core.CorePackage#getStereotype_BaseClass()
	 * @model unique="false" dataType="CWM.Core.Name" required="true" ordered="false"
	 * @generated
	 */
	String getBaseClass();

	/**
	 * Sets the value of the '{@link CWM.Core.Stereotype#getBaseClass <em>Base Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' attribute.
	 * @see #getBaseClass()
	 * @generated
	 */
	void setBaseClass(String value);

	/**
	 * Returns the value of the '<em><b>Extended Element</b></em>' reference list.
	 * The list contents are of type {@link CWM.Core.ModelElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extended Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended Element</em>' reference list.
	 * @see CWM.Core.CorePackage#getStereotype_ExtendedElement()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ModelElement> getExtendedElement();

	/**
	 * Returns the value of the '<em><b>Required Tag</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Core.TaggedValue}.
	 * It is bidirectional and its opposite is '{@link CWM.Core.TaggedValue#getStereotype <em>Stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Tag</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Tag</em>' containment reference list.
	 * @see CWM.Core.CorePackage#getStereotype_RequiredTag()
	 * @see CWM.Core.TaggedValue#getStereotype
	 * @model opposite="stereotype" containment="true" ordered="false"
	 * @generated
	 */
	EList<TaggedValue> getRequiredTag();

	/**
	 * Returns the value of the '<em><b>Stereotype Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Core.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stereotype Constraint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stereotype Constraint</em>' containment reference list.
	 * @see CWM.Core.CorePackage#getStereotype_StereotypeConstraint()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Constraint> getStereotypeConstraint();

} // Stereotype

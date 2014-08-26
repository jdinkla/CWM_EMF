/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Behavioral;

import CWM.Core.Classifier;
import CWM.Core.Expression;
import CWM.Core.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Behavioral.Parameter#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link CWM.Behavioral.Parameter#getKind <em>Kind</em>}</li>
 *   <li>{@link CWM.Behavioral.Parameter#getBehavioralFeature <em>Behavioral Feature</em>}</li>
 *   <li>{@link CWM.Behavioral.Parameter#getEvent <em>Event</em>}</li>
 *   <li>{@link CWM.Behavioral.Parameter#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Behavioral.BehavioralPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' containment reference.
	 * @see #setDefaultValue(Expression)
	 * @see CWM.Behavioral.BehavioralPackage#getParameter_DefaultValue()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Expression getDefaultValue();

	/**
	 * Sets the value of the '{@link CWM.Behavioral.Parameter#getDefaultValue <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' containment reference.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(Expression value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CWM.Behavioral.ParameterDirectionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see CWM.Behavioral.ParameterDirectionKind
	 * @see #setKind(ParameterDirectionKind)
	 * @see CWM.Behavioral.BehavioralPackage#getParameter_Kind()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	ParameterDirectionKind getKind();

	/**
	 * Sets the value of the '{@link CWM.Behavioral.Parameter#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see CWM.Behavioral.ParameterDirectionKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ParameterDirectionKind value);

	/**
	 * Returns the value of the '<em><b>Behavioral Feature</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link CWM.Behavioral.BehavioralFeature#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavioral Feature</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavioral Feature</em>' container reference.
	 * @see #setBehavioralFeature(BehavioralFeature)
	 * @see CWM.Behavioral.BehavioralPackage#getParameter_BehavioralFeature()
	 * @see CWM.Behavioral.BehavioralFeature#getParameter
	 * @model opposite="parameter" transient="false" ordered="false"
	 * @generated
	 */
	BehavioralFeature getBehavioralFeature();

	/**
	 * Sets the value of the '{@link CWM.Behavioral.Parameter#getBehavioralFeature <em>Behavioral Feature</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavioral Feature</em>' container reference.
	 * @see #getBehavioralFeature()
	 * @generated
	 */
	void setBehavioralFeature(BehavioralFeature value);

	/**
	 * Returns the value of the '<em><b>Event</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link CWM.Behavioral.Event#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' container reference.
	 * @see #setEvent(Event)
	 * @see CWM.Behavioral.BehavioralPackage#getParameter_Event()
	 * @see CWM.Behavioral.Event#getParameter
	 * @model opposite="parameter" transient="false" ordered="false"
	 * @generated
	 */
	Event getEvent();

	/**
	 * Sets the value of the '{@link CWM.Behavioral.Parameter#getEvent <em>Event</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' container reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(Event value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Classifier)
	 * @see CWM.Behavioral.BehavioralPackage#getParameter_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Classifier getType();

	/**
	 * Sets the value of the '{@link CWM.Behavioral.Parameter#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Classifier value);

} // Parameter

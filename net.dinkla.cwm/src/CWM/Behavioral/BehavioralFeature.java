/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Behavioral;

import CWM.Core.Feature;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Behavioral.BehavioralFeature#getIsQuery <em>Is Query</em>}</li>
 *   <li>{@link CWM.Behavioral.BehavioralFeature#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Behavioral.BehavioralPackage#getBehavioralFeature()
 * @model abstract="true"
 * @generated
 */
public interface BehavioralFeature extends Feature {
	/**
	 * Returns the value of the '<em><b>Is Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Query</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Query</em>' attribute.
	 * @see #setIsQuery(Boolean)
	 * @see CWM.Behavioral.BehavioralPackage#getBehavioralFeature_IsQuery()
	 * @model unique="false" dataType="CWM.Core.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsQuery();

	/**
	 * Sets the value of the '{@link CWM.Behavioral.BehavioralFeature#getIsQuery <em>Is Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Query</em>' attribute.
	 * @see #getIsQuery()
	 * @generated
	 */
	void setIsQuery(Boolean value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Behavioral.Parameter}.
	 * It is bidirectional and its opposite is '{@link CWM.Behavioral.Parameter#getBehavioralFeature <em>Behavioral Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see CWM.Behavioral.BehavioralPackage#getBehavioralFeature_Parameter()
	 * @see CWM.Behavioral.Parameter#getBehavioralFeature
	 * @model opposite="behavioralFeature" containment="true"
	 * @generated
	 */
	EList<Parameter> getParameter();

} // BehavioralFeature

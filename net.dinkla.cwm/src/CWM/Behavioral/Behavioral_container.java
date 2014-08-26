/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Behavioral;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavioral container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Behavioral.Behavioral_container#getArgument <em>Argument</em>}</li>
 *   <li>{@link CWM.Behavioral.Behavioral_container#getBehavioralFeature <em>Behavioral Feature</em>}</li>
 *   <li>{@link CWM.Behavioral.Behavioral_container#getCallAction <em>Call Action</em>}</li>
 *   <li>{@link CWM.Behavioral.Behavioral_container#getEvent <em>Event</em>}</li>
 *   <li>{@link CWM.Behavioral.Behavioral_container#getInterface <em>Interface</em>}</li>
 *   <li>{@link CWM.Behavioral.Behavioral_container#getMethod <em>Method</em>}</li>
 *   <li>{@link CWM.Behavioral.Behavioral_container#getOperation <em>Operation</em>}</li>
 *   <li>{@link CWM.Behavioral.Behavioral_container#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Behavioral.BehavioralPackage#getBehavioral_container()
 * @model
 * @generated
 */
public interface Behavioral_container extends EObject {
	/**
	 * Returns the value of the '<em><b>Argument</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Behavioral.Argument}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument</em>' containment reference list.
	 * @see CWM.Behavioral.BehavioralPackage#getBehavioral_container_Argument()
	 * @model containment="true"
	 * @generated
	 */
	EList<Argument> getArgument();

	/**
	 * Returns the value of the '<em><b>Behavioral Feature</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Behavioral.BehavioralFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavioral Feature</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavioral Feature</em>' containment reference list.
	 * @see CWM.Behavioral.BehavioralPackage#getBehavioral_container_BehavioralFeature()
	 * @model containment="true"
	 * @generated
	 */
	EList<BehavioralFeature> getBehavioralFeature();

	/**
	 * Returns the value of the '<em><b>Call Action</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Behavioral.CallAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Call Action</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call Action</em>' containment reference list.
	 * @see CWM.Behavioral.BehavioralPackage#getBehavioral_container_CallAction()
	 * @model containment="true"
	 * @generated
	 */
	EList<CallAction> getCallAction();

	/**
	 * Returns the value of the '<em><b>Event</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Behavioral.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' containment reference list.
	 * @see CWM.Behavioral.BehavioralPackage#getBehavioral_container_Event()
	 * @model containment="true"
	 * @generated
	 */
	EList<Event> getEvent();

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Behavioral.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' containment reference list.
	 * @see CWM.Behavioral.BehavioralPackage#getBehavioral_container_Interface()
	 * @model containment="true"
	 * @generated
	 */
	EList<Interface> getInterface();

	/**
	 * Returns the value of the '<em><b>Method</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Behavioral.Method}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' containment reference list.
	 * @see CWM.Behavioral.BehavioralPackage#getBehavioral_container_Method()
	 * @model containment="true"
	 * @generated
	 */
	EList<Method> getMethod();

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Behavioral.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference list.
	 * @see CWM.Behavioral.BehavioralPackage#getBehavioral_container_Operation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Operation> getOperation();

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Behavioral.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see CWM.Behavioral.BehavioralPackage#getBehavioral_container_Parameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameter();

} // Behavioral_container

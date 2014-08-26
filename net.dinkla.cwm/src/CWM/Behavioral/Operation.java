/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Behavioral;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Behavioral.Operation#getIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link CWM.Behavioral.Operation#getMethod <em>Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Behavioral.BehavioralPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends BehavioralFeature {
	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(Boolean)
	 * @see CWM.Behavioral.BehavioralPackage#getOperation_IsAbstract()
	 * @model unique="false" dataType="CWM.Core.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsAbstract();

	/**
	 * Sets the value of the '{@link CWM.Behavioral.Operation#getIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #getIsAbstract()
	 * @generated
	 */
	void setIsAbstract(Boolean value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' reference list.
	 * The list contents are of type {@link CWM.Behavioral.Method}.
	 * It is bidirectional and its opposite is '{@link CWM.Behavioral.Method#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' reference list.
	 * @see CWM.Behavioral.BehavioralPackage#getOperation_Method()
	 * @see CWM.Behavioral.Method#getSpecification
	 * @model opposite="specification" ordered="false"
	 * @generated
	 */
	EList<Method> getMethod();

} // Operation

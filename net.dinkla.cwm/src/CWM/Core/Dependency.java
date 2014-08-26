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
 * A representation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Core.Dependency#getKind <em>Kind</em>}</li>
 *   <li>{@link CWM.Core.Dependency#getClient <em>Client</em>}</li>
 *   <li>{@link CWM.Core.Dependency#getSupplier <em>Supplier</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Core.CorePackage#getDependency()
 * @model
 * @generated
 */
public interface Dependency extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see #setKind(String)
	 * @see CWM.Core.CorePackage#getDependency_Kind()
	 * @model unique="false" dataType="CWM.Core.String" ordered="false"
	 * @generated
	 */
	String getKind();

	/**
	 * Sets the value of the '{@link CWM.Core.Dependency#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see #getKind()
	 * @generated
	 */
	void setKind(String value);

	/**
	 * Returns the value of the '<em><b>Client</b></em>' reference list.
	 * The list contents are of type {@link CWM.Core.ModelElement}.
	 * It is bidirectional and its opposite is '{@link CWM.Core.ModelElement#getClientDependency <em>Client Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client</em>' reference list.
	 * @see CWM.Core.CorePackage#getDependency_Client()
	 * @see CWM.Core.ModelElement#getClientDependency
	 * @model opposite="clientDependency" required="true" ordered="false"
	 * @generated
	 */
	EList<ModelElement> getClient();

	/**
	 * Returns the value of the '<em><b>Supplier</b></em>' reference list.
	 * The list contents are of type {@link CWM.Core.ModelElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplier</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplier</em>' reference list.
	 * @see CWM.Core.CorePackage#getDependency_Supplier()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<ModelElement> getSupplier();

} // Dependency

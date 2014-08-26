/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.SoftwareDeployment;

import CWM.Core.Subsystem;

import CWM.TypeMapping.TypeSystem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Software System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.SoftwareDeployment.SoftwareSystem#getType <em>Type</em>}</li>
 *   <li>{@link CWM.SoftwareDeployment.SoftwareSystem#getSubtype <em>Subtype</em>}</li>
 *   <li>{@link CWM.SoftwareDeployment.SoftwareSystem#getSupplier <em>Supplier</em>}</li>
 *   <li>{@link CWM.SoftwareDeployment.SoftwareSystem#getVersion <em>Version</em>}</li>
 *   <li>{@link CWM.SoftwareDeployment.SoftwareSystem#getTypespace <em>Typespace</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.SoftwareDeployment.SoftwareDeploymentPackage#getSoftwareSystem()
 * @model
 * @generated
 */
public interface SoftwareSystem extends Subsystem {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see CWM.SoftwareDeployment.SoftwareDeploymentPackage#getSoftwareSystem_Type()
	 * @model unique="false" dataType="CWM.Core.String" ordered="false"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link CWM.SoftwareDeployment.SoftwareSystem#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subtype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtype</em>' attribute.
	 * @see #setSubtype(String)
	 * @see CWM.SoftwareDeployment.SoftwareDeploymentPackage#getSoftwareSystem_Subtype()
	 * @model unique="false" dataType="CWM.Core.String" ordered="false"
	 * @generated
	 */
	String getSubtype();

	/**
	 * Sets the value of the '{@link CWM.SoftwareDeployment.SoftwareSystem#getSubtype <em>Subtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subtype</em>' attribute.
	 * @see #getSubtype()
	 * @generated
	 */
	void setSubtype(String value);

	/**
	 * Returns the value of the '<em><b>Supplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplier</em>' attribute.
	 * @see #setSupplier(String)
	 * @see CWM.SoftwareDeployment.SoftwareDeploymentPackage#getSoftwareSystem_Supplier()
	 * @model unique="false" dataType="CWM.Core.String" ordered="false"
	 * @generated
	 */
	String getSupplier();

	/**
	 * Sets the value of the '{@link CWM.SoftwareDeployment.SoftwareSystem#getSupplier <em>Supplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplier</em>' attribute.
	 * @see #getSupplier()
	 * @generated
	 */
	void setSupplier(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see CWM.SoftwareDeployment.SoftwareDeploymentPackage#getSoftwareSystem_Version()
	 * @model unique="false" dataType="CWM.Core.String" ordered="false"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link CWM.SoftwareDeployment.SoftwareSystem#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Typespace</b></em>' reference list.
	 * The list contents are of type {@link CWM.TypeMapping.TypeSystem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Typespace</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typespace</em>' reference list.
	 * @see CWM.SoftwareDeployment.SoftwareDeploymentPackage#getSoftwareSystem_Typespace()
	 * @model ordered="false"
	 * @generated
	 */
	EList<TypeSystem> getTypespace();

} // SoftwareSystem

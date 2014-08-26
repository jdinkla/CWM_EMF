/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Relational;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Relational.Table#getIsTemporary <em>Is Temporary</em>}</li>
 *   <li>{@link CWM.Relational.Table#getTemporaryScope <em>Temporary Scope</em>}</li>
 *   <li>{@link CWM.Relational.Table#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link CWM.Relational.Table#getIsSystem <em>Is System</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Relational.RelationalPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends NamedColumnSet {
	/**
	 * Returns the value of the '<em><b>Is Temporary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Temporary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Temporary</em>' attribute.
	 * @see #setIsTemporary(Boolean)
	 * @see CWM.Relational.RelationalPackage#getTable_IsTemporary()
	 * @model unique="false" dataType="CWM.Core.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsTemporary();

	/**
	 * Sets the value of the '{@link CWM.Relational.Table#getIsTemporary <em>Is Temporary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Temporary</em>' attribute.
	 * @see #getIsTemporary()
	 * @generated
	 */
	void setIsTemporary(Boolean value);

	/**
	 * Returns the value of the '<em><b>Temporary Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temporary Scope</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temporary Scope</em>' attribute.
	 * @see #setTemporaryScope(String)
	 * @see CWM.Relational.RelationalPackage#getTable_TemporaryScope()
	 * @model unique="false" dataType="CWM.Core.String" ordered="false"
	 * @generated
	 */
	String getTemporaryScope();

	/**
	 * Sets the value of the '{@link CWM.Relational.Table#getTemporaryScope <em>Temporary Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temporary Scope</em>' attribute.
	 * @see #getTemporaryScope()
	 * @generated
	 */
	void setTemporaryScope(String value);

	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' reference list.
	 * The list contents are of type {@link CWM.Relational.Trigger}.
	 * It is bidirectional and its opposite is '{@link CWM.Relational.Trigger#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' reference list.
	 * @see CWM.Relational.RelationalPackage#getTable_Trigger()
	 * @see CWM.Relational.Trigger#getTable
	 * @model opposite="table"
	 * @generated
	 */
	EList<Trigger> getTrigger();

	/**
	 * Returns the value of the '<em><b>Is System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is System</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is System</em>' attribute.
	 * @see #setIsSystem(Boolean)
	 * @see CWM.Relational.RelationalPackage#getTable_IsSystem()
	 * @model unique="false" dataType="CWM.Core.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsSystem();

	/**
	 * Sets the value of the '{@link CWM.Relational.Table#getIsSystem <em>Is System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is System</em>' attribute.
	 * @see #getIsSystem()
	 * @generated
	 */
	void setIsSystem(Boolean value);

} // Table

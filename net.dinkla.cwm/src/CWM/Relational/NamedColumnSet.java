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
 * A representation of the model object '<em><b>Named Column Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Relational.NamedColumnSet#getOptionScopeColumn <em>Option Scope Column</em>}</li>
 *   <li>{@link CWM.Relational.NamedColumnSet#getType <em>Type</em>}</li>
 *   <li>{@link CWM.Relational.NamedColumnSet#getUsingTrigger <em>Using Trigger</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Relational.RelationalPackage#getNamedColumnSet()
 * @model
 * @generated
 */
public interface NamedColumnSet extends ColumnSet {
	/**
	 * Returns the value of the '<em><b>Option Scope Column</b></em>' reference list.
	 * The list contents are of type {@link CWM.Relational.Column}.
	 * It is bidirectional and its opposite is '{@link CWM.Relational.Column#getOptionScopeColumnSet <em>Option Scope Column Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Option Scope Column</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option Scope Column</em>' reference list.
	 * @see CWM.Relational.RelationalPackage#getNamedColumnSet_OptionScopeColumn()
	 * @see CWM.Relational.Column#getOptionScopeColumnSet
	 * @model opposite="optionScopeColumnSet" ordered="false"
	 * @generated
	 */
	EList<Column> getOptionScopeColumn();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CWM.Relational.SQLStructuredType#getColumnSet <em>Column Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(SQLStructuredType)
	 * @see CWM.Relational.RelationalPackage#getNamedColumnSet_Type()
	 * @see CWM.Relational.SQLStructuredType#getColumnSet
	 * @model opposite="columnSet" ordered="false"
	 * @generated
	 */
	SQLStructuredType getType();

	/**
	 * Sets the value of the '{@link CWM.Relational.NamedColumnSet#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(SQLStructuredType value);

	/**
	 * Returns the value of the '<em><b>Using Trigger</b></em>' reference list.
	 * The list contents are of type {@link CWM.Relational.Trigger}.
	 * It is bidirectional and its opposite is '{@link CWM.Relational.Trigger#getUsedColumnSet <em>Used Column Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Using Trigger</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Using Trigger</em>' reference list.
	 * @see CWM.Relational.RelationalPackage#getNamedColumnSet_UsingTrigger()
	 * @see CWM.Relational.Trigger#getUsedColumnSet
	 * @model opposite="usedColumnSet" ordered="false"
	 * @generated
	 */
	EList<Trigger> getUsingTrigger();

} // NamedColumnSet

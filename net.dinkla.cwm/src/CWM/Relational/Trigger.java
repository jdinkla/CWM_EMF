/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Relational;

import CWM.Core.BooleanExpression;
import CWM.Core.ModelElement;
import CWM.Core.ProcedureExpression;

import CWM.Relational.Enumerations.ActionOrientationType;
import CWM.Relational.Enumerations.ConditionTimingType;
import CWM.Relational.Enumerations.EventManipulationType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Relational.Trigger#getEventManipulation <em>Event Manipulation</em>}</li>
 *   <li>{@link CWM.Relational.Trigger#getActionCondition <em>Action Condition</em>}</li>
 *   <li>{@link CWM.Relational.Trigger#getActionStatement <em>Action Statement</em>}</li>
 *   <li>{@link CWM.Relational.Trigger#getActionOrientation <em>Action Orientation</em>}</li>
 *   <li>{@link CWM.Relational.Trigger#getConditionTiming <em>Condition Timing</em>}</li>
 *   <li>{@link CWM.Relational.Trigger#getConditionReferenceNewTable <em>Condition Reference New Table</em>}</li>
 *   <li>{@link CWM.Relational.Trigger#getConditionReferenceOldTable <em>Condition Reference Old Table</em>}</li>
 *   <li>{@link CWM.Relational.Trigger#getTable <em>Table</em>}</li>
 *   <li>{@link CWM.Relational.Trigger#getUsedColumnSet <em>Used Column Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Relational.RelationalPackage#getTrigger()
 * @model
 * @generated
 */
public interface Trigger extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Event Manipulation</b></em>' attribute.
	 * The literals are from the enumeration {@link CWM.Relational.Enumerations.EventManipulationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Manipulation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Manipulation</em>' attribute.
	 * @see CWM.Relational.Enumerations.EventManipulationType
	 * @see #setEventManipulation(EventManipulationType)
	 * @see CWM.Relational.RelationalPackage#getTrigger_EventManipulation()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	EventManipulationType getEventManipulation();

	/**
	 * Sets the value of the '{@link CWM.Relational.Trigger#getEventManipulation <em>Event Manipulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Manipulation</em>' attribute.
	 * @see CWM.Relational.Enumerations.EventManipulationType
	 * @see #getEventManipulation()
	 * @generated
	 */
	void setEventManipulation(EventManipulationType value);

	/**
	 * Returns the value of the '<em><b>Action Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Condition</em>' containment reference.
	 * @see #setActionCondition(BooleanExpression)
	 * @see CWM.Relational.RelationalPackage#getTrigger_ActionCondition()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	BooleanExpression getActionCondition();

	/**
	 * Sets the value of the '{@link CWM.Relational.Trigger#getActionCondition <em>Action Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Condition</em>' containment reference.
	 * @see #getActionCondition()
	 * @generated
	 */
	void setActionCondition(BooleanExpression value);

	/**
	 * Returns the value of the '<em><b>Action Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Statement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Statement</em>' containment reference.
	 * @see #setActionStatement(ProcedureExpression)
	 * @see CWM.Relational.RelationalPackage#getTrigger_ActionStatement()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ProcedureExpression getActionStatement();

	/**
	 * Sets the value of the '{@link CWM.Relational.Trigger#getActionStatement <em>Action Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Statement</em>' containment reference.
	 * @see #getActionStatement()
	 * @generated
	 */
	void setActionStatement(ProcedureExpression value);

	/**
	 * Returns the value of the '<em><b>Action Orientation</b></em>' attribute.
	 * The literals are from the enumeration {@link CWM.Relational.Enumerations.ActionOrientationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Orientation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Orientation</em>' attribute.
	 * @see CWM.Relational.Enumerations.ActionOrientationType
	 * @see #setActionOrientation(ActionOrientationType)
	 * @see CWM.Relational.RelationalPackage#getTrigger_ActionOrientation()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	ActionOrientationType getActionOrientation();

	/**
	 * Sets the value of the '{@link CWM.Relational.Trigger#getActionOrientation <em>Action Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Orientation</em>' attribute.
	 * @see CWM.Relational.Enumerations.ActionOrientationType
	 * @see #getActionOrientation()
	 * @generated
	 */
	void setActionOrientation(ActionOrientationType value);

	/**
	 * Returns the value of the '<em><b>Condition Timing</b></em>' attribute.
	 * The literals are from the enumeration {@link CWM.Relational.Enumerations.ConditionTimingType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition Timing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Timing</em>' attribute.
	 * @see CWM.Relational.Enumerations.ConditionTimingType
	 * @see #setConditionTiming(ConditionTimingType)
	 * @see CWM.Relational.RelationalPackage#getTrigger_ConditionTiming()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	ConditionTimingType getConditionTiming();

	/**
	 * Sets the value of the '{@link CWM.Relational.Trigger#getConditionTiming <em>Condition Timing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition Timing</em>' attribute.
	 * @see CWM.Relational.Enumerations.ConditionTimingType
	 * @see #getConditionTiming()
	 * @generated
	 */
	void setConditionTiming(ConditionTimingType value);

	/**
	 * Returns the value of the '<em><b>Condition Reference New Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition Reference New Table</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Reference New Table</em>' attribute.
	 * @see #setConditionReferenceNewTable(String)
	 * @see CWM.Relational.RelationalPackage#getTrigger_ConditionReferenceNewTable()
	 * @model unique="false" dataType="CWM.Core.String" required="true" ordered="false"
	 * @generated
	 */
	String getConditionReferenceNewTable();

	/**
	 * Sets the value of the '{@link CWM.Relational.Trigger#getConditionReferenceNewTable <em>Condition Reference New Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition Reference New Table</em>' attribute.
	 * @see #getConditionReferenceNewTable()
	 * @generated
	 */
	void setConditionReferenceNewTable(String value);

	/**
	 * Returns the value of the '<em><b>Condition Reference Old Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition Reference Old Table</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Reference Old Table</em>' attribute.
	 * @see #setConditionReferenceOldTable(String)
	 * @see CWM.Relational.RelationalPackage#getTrigger_ConditionReferenceOldTable()
	 * @model unique="false" dataType="CWM.Core.String" required="true" ordered="false"
	 * @generated
	 */
	String getConditionReferenceOldTable();

	/**
	 * Sets the value of the '{@link CWM.Relational.Trigger#getConditionReferenceOldTable <em>Condition Reference Old Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition Reference Old Table</em>' attribute.
	 * @see #getConditionReferenceOldTable()
	 * @generated
	 */
	void setConditionReferenceOldTable(String value);

	/**
	 * Returns the value of the '<em><b>Table</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CWM.Relational.Table#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' reference.
	 * @see #setTable(Table)
	 * @see CWM.Relational.RelationalPackage#getTrigger_Table()
	 * @see CWM.Relational.Table#getTrigger
	 * @model opposite="trigger" required="true" ordered="false"
	 * @generated
	 */
	Table getTable();

	/**
	 * Sets the value of the '{@link CWM.Relational.Trigger#getTable <em>Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' reference.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(Table value);

	/**
	 * Returns the value of the '<em><b>Used Column Set</b></em>' reference list.
	 * The list contents are of type {@link CWM.Relational.NamedColumnSet}.
	 * It is bidirectional and its opposite is '{@link CWM.Relational.NamedColumnSet#getUsingTrigger <em>Using Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used Column Set</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used Column Set</em>' reference list.
	 * @see CWM.Relational.RelationalPackage#getTrigger_UsedColumnSet()
	 * @see CWM.Relational.NamedColumnSet#getUsingTrigger
	 * @model opposite="usingTrigger" ordered="false"
	 * @generated
	 */
	EList<NamedColumnSet> getUsedColumnSet();

} // Trigger

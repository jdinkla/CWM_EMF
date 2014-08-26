/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Record;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Record container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Record.Record_container#getField <em>Field</em>}</li>
 *   <li>{@link CWM.Record.Record_container#getRecordDef <em>Record Def</em>}</li>
 *   <li>{@link CWM.Record.Record_container#getFixedOffsetField <em>Fixed Offset Field</em>}</li>
 *   <li>{@link CWM.Record.Record_container#getRecordFile <em>Record File</em>}</li>
 *   <li>{@link CWM.Record.Record_container#getFieldValue <em>Field Value</em>}</li>
 *   <li>{@link CWM.Record.Record_container#getRecord <em>Record</em>}</li>
 *   <li>{@link CWM.Record.Record_container#getRecordSet <em>Record Set</em>}</li>
 *   <li>{@link CWM.Record.Record_container#getGroup <em>Group</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Record.RecordPackage#getRecord_container()
 * @model
 * @generated
 */
public interface Record_container extends EObject {
	/**
	 * Returns the value of the '<em><b>Field</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Record.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' containment reference list.
	 * @see CWM.Record.RecordPackage#getRecord_container_Field()
	 * @model containment="true"
	 * @generated
	 */
	EList<Field> getField();

	/**
	 * Returns the value of the '<em><b>Record Def</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Record.RecordDef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Record Def</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Record Def</em>' containment reference list.
	 * @see CWM.Record.RecordPackage#getRecord_container_RecordDef()
	 * @model containment="true"
	 * @generated
	 */
	EList<RecordDef> getRecordDef();

	/**
	 * Returns the value of the '<em><b>Fixed Offset Field</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Record.FixedOffsetField}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Offset Field</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Offset Field</em>' containment reference list.
	 * @see CWM.Record.RecordPackage#getRecord_container_FixedOffsetField()
	 * @model containment="true"
	 * @generated
	 */
	EList<FixedOffsetField> getFixedOffsetField();

	/**
	 * Returns the value of the '<em><b>Record File</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Record.RecordFile}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Record File</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Record File</em>' containment reference list.
	 * @see CWM.Record.RecordPackage#getRecord_container_RecordFile()
	 * @model containment="true"
	 * @generated
	 */
	EList<RecordFile> getRecordFile();

	/**
	 * Returns the value of the '<em><b>Field Value</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Record.FieldValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Value</em>' containment reference list.
	 * @see CWM.Record.RecordPackage#getRecord_container_FieldValue()
	 * @model containment="true"
	 * @generated
	 */
	EList<FieldValue> getFieldValue();

	/**
	 * Returns the value of the '<em><b>Record</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Record.Record}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Record</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Record</em>' containment reference list.
	 * @see CWM.Record.RecordPackage#getRecord_container_Record()
	 * @model containment="true"
	 * @generated
	 */
	EList<Record> getRecord();

	/**
	 * Returns the value of the '<em><b>Record Set</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Record.RecordSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Record Set</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Record Set</em>' containment reference list.
	 * @see CWM.Record.RecordPackage#getRecord_container_RecordSet()
	 * @model containment="true"
	 * @generated
	 */
	EList<RecordSet> getRecordSet();

	/**
	 * Returns the value of the '<em><b>Group</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Record.Group}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' containment reference list.
	 * @see CWM.Record.RecordPackage#getRecord_container_Group()
	 * @model containment="true"
	 * @generated
	 */
	EList<Group> getGroup();

} // Record_container

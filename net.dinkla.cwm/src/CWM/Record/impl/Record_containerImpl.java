/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Record.impl;

import CWM.Record.Field;
import CWM.Record.FieldValue;
import CWM.Record.FixedOffsetField;
import CWM.Record.Group;
import CWM.Record.Record;
import CWM.Record.RecordDef;
import CWM.Record.RecordFile;
import CWM.Record.RecordPackage;
import CWM.Record.RecordSet;
import CWM.Record.Record_container;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Record container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.Record.impl.Record_containerImpl#getField <em>Field</em>}</li>
 *   <li>{@link CWM.Record.impl.Record_containerImpl#getRecordDef <em>Record Def</em>}</li>
 *   <li>{@link CWM.Record.impl.Record_containerImpl#getFixedOffsetField <em>Fixed Offset Field</em>}</li>
 *   <li>{@link CWM.Record.impl.Record_containerImpl#getRecordFile <em>Record File</em>}</li>
 *   <li>{@link CWM.Record.impl.Record_containerImpl#getFieldValue <em>Field Value</em>}</li>
 *   <li>{@link CWM.Record.impl.Record_containerImpl#getRecord <em>Record</em>}</li>
 *   <li>{@link CWM.Record.impl.Record_containerImpl#getRecordSet <em>Record Set</em>}</li>
 *   <li>{@link CWM.Record.impl.Record_containerImpl#getGroup <em>Group</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Record_containerImpl extends EObjectImpl implements Record_container {
	/**
	 * The cached value of the '{@link #getField() <em>Field</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getField()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> field;

	/**
	 * The cached value of the '{@link #getRecordDef() <em>Record Def</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordDef()
	 * @generated
	 * @ordered
	 */
	protected EList<RecordDef> recordDef;

	/**
	 * The cached value of the '{@link #getFixedOffsetField() <em>Fixed Offset Field</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedOffsetField()
	 * @generated
	 * @ordered
	 */
	protected EList<FixedOffsetField> fixedOffsetField;

	/**
	 * The cached value of the '{@link #getRecordFile() <em>Record File</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordFile()
	 * @generated
	 * @ordered
	 */
	protected EList<RecordFile> recordFile;

	/**
	 * The cached value of the '{@link #getFieldValue() <em>Field Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldValue()
	 * @generated
	 * @ordered
	 */
	protected EList<FieldValue> fieldValue;

	/**
	 * The cached value of the '{@link #getRecord() <em>Record</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecord()
	 * @generated
	 * @ordered
	 */
	protected EList<Record> record;

	/**
	 * The cached value of the '{@link #getRecordSet() <em>Record Set</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordSet()
	 * @generated
	 * @ordered
	 */
	protected EList<RecordSet> recordSet;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<Group> group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Record_containerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RecordPackage.Literals.RECORD_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getField() {
		if (field == null) {
			field = new EObjectContainmentEList<Field>(Field.class, this, RecordPackage.RECORD_CONTAINER__FIELD);
		}
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RecordDef> getRecordDef() {
		if (recordDef == null) {
			recordDef = new EObjectContainmentEList<RecordDef>(RecordDef.class, this, RecordPackage.RECORD_CONTAINER__RECORD_DEF);
		}
		return recordDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FixedOffsetField> getFixedOffsetField() {
		if (fixedOffsetField == null) {
			fixedOffsetField = new EObjectContainmentEList<FixedOffsetField>(FixedOffsetField.class, this, RecordPackage.RECORD_CONTAINER__FIXED_OFFSET_FIELD);
		}
		return fixedOffsetField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RecordFile> getRecordFile() {
		if (recordFile == null) {
			recordFile = new EObjectContainmentEList<RecordFile>(RecordFile.class, this, RecordPackage.RECORD_CONTAINER__RECORD_FILE);
		}
		return recordFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FieldValue> getFieldValue() {
		if (fieldValue == null) {
			fieldValue = new EObjectContainmentEList<FieldValue>(FieldValue.class, this, RecordPackage.RECORD_CONTAINER__FIELD_VALUE);
		}
		return fieldValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Record> getRecord() {
		if (record == null) {
			record = new EObjectContainmentEList<Record>(Record.class, this, RecordPackage.RECORD_CONTAINER__RECORD);
		}
		return record;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RecordSet> getRecordSet() {
		if (recordSet == null) {
			recordSet = new EObjectContainmentEList<RecordSet>(RecordSet.class, this, RecordPackage.RECORD_CONTAINER__RECORD_SET);
		}
		return recordSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Group> getGroup() {
		if (group == null) {
			group = new EObjectContainmentEList<Group>(Group.class, this, RecordPackage.RECORD_CONTAINER__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RecordPackage.RECORD_CONTAINER__FIELD:
				return ((InternalEList<?>)getField()).basicRemove(otherEnd, msgs);
			case RecordPackage.RECORD_CONTAINER__RECORD_DEF:
				return ((InternalEList<?>)getRecordDef()).basicRemove(otherEnd, msgs);
			case RecordPackage.RECORD_CONTAINER__FIXED_OFFSET_FIELD:
				return ((InternalEList<?>)getFixedOffsetField()).basicRemove(otherEnd, msgs);
			case RecordPackage.RECORD_CONTAINER__RECORD_FILE:
				return ((InternalEList<?>)getRecordFile()).basicRemove(otherEnd, msgs);
			case RecordPackage.RECORD_CONTAINER__FIELD_VALUE:
				return ((InternalEList<?>)getFieldValue()).basicRemove(otherEnd, msgs);
			case RecordPackage.RECORD_CONTAINER__RECORD:
				return ((InternalEList<?>)getRecord()).basicRemove(otherEnd, msgs);
			case RecordPackage.RECORD_CONTAINER__RECORD_SET:
				return ((InternalEList<?>)getRecordSet()).basicRemove(otherEnd, msgs);
			case RecordPackage.RECORD_CONTAINER__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RecordPackage.RECORD_CONTAINER__FIELD:
				return getField();
			case RecordPackage.RECORD_CONTAINER__RECORD_DEF:
				return getRecordDef();
			case RecordPackage.RECORD_CONTAINER__FIXED_OFFSET_FIELD:
				return getFixedOffsetField();
			case RecordPackage.RECORD_CONTAINER__RECORD_FILE:
				return getRecordFile();
			case RecordPackage.RECORD_CONTAINER__FIELD_VALUE:
				return getFieldValue();
			case RecordPackage.RECORD_CONTAINER__RECORD:
				return getRecord();
			case RecordPackage.RECORD_CONTAINER__RECORD_SET:
				return getRecordSet();
			case RecordPackage.RECORD_CONTAINER__GROUP:
				return getGroup();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RecordPackage.RECORD_CONTAINER__FIELD:
				getField().clear();
				getField().addAll((Collection<? extends Field>)newValue);
				return;
			case RecordPackage.RECORD_CONTAINER__RECORD_DEF:
				getRecordDef().clear();
				getRecordDef().addAll((Collection<? extends RecordDef>)newValue);
				return;
			case RecordPackage.RECORD_CONTAINER__FIXED_OFFSET_FIELD:
				getFixedOffsetField().clear();
				getFixedOffsetField().addAll((Collection<? extends FixedOffsetField>)newValue);
				return;
			case RecordPackage.RECORD_CONTAINER__RECORD_FILE:
				getRecordFile().clear();
				getRecordFile().addAll((Collection<? extends RecordFile>)newValue);
				return;
			case RecordPackage.RECORD_CONTAINER__FIELD_VALUE:
				getFieldValue().clear();
				getFieldValue().addAll((Collection<? extends FieldValue>)newValue);
				return;
			case RecordPackage.RECORD_CONTAINER__RECORD:
				getRecord().clear();
				getRecord().addAll((Collection<? extends Record>)newValue);
				return;
			case RecordPackage.RECORD_CONTAINER__RECORD_SET:
				getRecordSet().clear();
				getRecordSet().addAll((Collection<? extends RecordSet>)newValue);
				return;
			case RecordPackage.RECORD_CONTAINER__GROUP:
				getGroup().clear();
				getGroup().addAll((Collection<? extends Group>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RecordPackage.RECORD_CONTAINER__FIELD:
				getField().clear();
				return;
			case RecordPackage.RECORD_CONTAINER__RECORD_DEF:
				getRecordDef().clear();
				return;
			case RecordPackage.RECORD_CONTAINER__FIXED_OFFSET_FIELD:
				getFixedOffsetField().clear();
				return;
			case RecordPackage.RECORD_CONTAINER__RECORD_FILE:
				getRecordFile().clear();
				return;
			case RecordPackage.RECORD_CONTAINER__FIELD_VALUE:
				getFieldValue().clear();
				return;
			case RecordPackage.RECORD_CONTAINER__RECORD:
				getRecord().clear();
				return;
			case RecordPackage.RECORD_CONTAINER__RECORD_SET:
				getRecordSet().clear();
				return;
			case RecordPackage.RECORD_CONTAINER__GROUP:
				getGroup().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RecordPackage.RECORD_CONTAINER__FIELD:
				return field != null && !field.isEmpty();
			case RecordPackage.RECORD_CONTAINER__RECORD_DEF:
				return recordDef != null && !recordDef.isEmpty();
			case RecordPackage.RECORD_CONTAINER__FIXED_OFFSET_FIELD:
				return fixedOffsetField != null && !fixedOffsetField.isEmpty();
			case RecordPackage.RECORD_CONTAINER__RECORD_FILE:
				return recordFile != null && !recordFile.isEmpty();
			case RecordPackage.RECORD_CONTAINER__FIELD_VALUE:
				return fieldValue != null && !fieldValue.isEmpty();
			case RecordPackage.RECORD_CONTAINER__RECORD:
				return record != null && !record.isEmpty();
			case RecordPackage.RECORD_CONTAINER__RECORD_SET:
				return recordSet != null && !recordSet.isEmpty();
			case RecordPackage.RECORD_CONTAINER__GROUP:
				return group != null && !group.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Record_containerImpl

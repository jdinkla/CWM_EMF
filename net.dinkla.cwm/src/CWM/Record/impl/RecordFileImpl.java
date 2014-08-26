/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Record.impl;

import CWM.Core.impl.PackageImpl;

import CWM.Record.RecordDef;
import CWM.Record.RecordFile;
import CWM.Record.RecordPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.Record.impl.RecordFileImpl#getIsSelfDescribing <em>Is Self Describing</em>}</li>
 *   <li>{@link CWM.Record.impl.RecordFileImpl#getRecordDelimiter <em>Record Delimiter</em>}</li>
 *   <li>{@link CWM.Record.impl.RecordFileImpl#getSkipRecords <em>Skip Records</em>}</li>
 *   <li>{@link CWM.Record.impl.RecordFileImpl#getRecord <em>Record</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RecordFileImpl extends PackageImpl implements RecordFile {
	/**
	 * The default value of the '{@link #getIsSelfDescribing() <em>Is Self Describing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSelfDescribing()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_SELF_DESCRIBING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsSelfDescribing() <em>Is Self Describing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSelfDescribing()
	 * @generated
	 * @ordered
	 */
	protected Boolean isSelfDescribing = IS_SELF_DESCRIBING_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecordDelimiter() <em>Record Delimiter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordDelimiter()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RECORD_DELIMITER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecordDelimiter() <em>Record Delimiter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordDelimiter()
	 * @generated
	 * @ordered
	 */
	protected Integer recordDelimiter = RECORD_DELIMITER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSkipRecords() <em>Skip Records</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkipRecords()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SKIP_RECORDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSkipRecords() <em>Skip Records</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkipRecords()
	 * @generated
	 * @ordered
	 */
	protected Integer skipRecords = SKIP_RECORDS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRecord() <em>Record</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecord()
	 * @generated
	 * @ordered
	 */
	protected EList<RecordDef> record;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecordFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RecordPackage.Literals.RECORD_FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsSelfDescribing() {
		return isSelfDescribing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSelfDescribing(Boolean newIsSelfDescribing) {
		Boolean oldIsSelfDescribing = isSelfDescribing;
		isSelfDescribing = newIsSelfDescribing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecordPackage.RECORD_FILE__IS_SELF_DESCRIBING, oldIsSelfDescribing, isSelfDescribing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getRecordDelimiter() {
		return recordDelimiter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecordDelimiter(Integer newRecordDelimiter) {
		Integer oldRecordDelimiter = recordDelimiter;
		recordDelimiter = newRecordDelimiter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecordPackage.RECORD_FILE__RECORD_DELIMITER, oldRecordDelimiter, recordDelimiter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getSkipRecords() {
		return skipRecords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSkipRecords(Integer newSkipRecords) {
		Integer oldSkipRecords = skipRecords;
		skipRecords = newSkipRecords;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecordPackage.RECORD_FILE__SKIP_RECORDS, oldSkipRecords, skipRecords));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RecordDef> getRecord() {
		if (record == null) {
			record = new EObjectWithInverseResolvingEList.ManyInverse<RecordDef>(RecordDef.class, this, RecordPackage.RECORD_FILE__RECORD, RecordPackage.RECORD_DEF__FILE);
		}
		return record;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RecordPackage.RECORD_FILE__RECORD:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRecord()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RecordPackage.RECORD_FILE__RECORD:
				return ((InternalEList<?>)getRecord()).basicRemove(otherEnd, msgs);
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
			case RecordPackage.RECORD_FILE__IS_SELF_DESCRIBING:
				return getIsSelfDescribing();
			case RecordPackage.RECORD_FILE__RECORD_DELIMITER:
				return getRecordDelimiter();
			case RecordPackage.RECORD_FILE__SKIP_RECORDS:
				return getSkipRecords();
			case RecordPackage.RECORD_FILE__RECORD:
				return getRecord();
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
			case RecordPackage.RECORD_FILE__IS_SELF_DESCRIBING:
				setIsSelfDescribing((Boolean)newValue);
				return;
			case RecordPackage.RECORD_FILE__RECORD_DELIMITER:
				setRecordDelimiter((Integer)newValue);
				return;
			case RecordPackage.RECORD_FILE__SKIP_RECORDS:
				setSkipRecords((Integer)newValue);
				return;
			case RecordPackage.RECORD_FILE__RECORD:
				getRecord().clear();
				getRecord().addAll((Collection<? extends RecordDef>)newValue);
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
			case RecordPackage.RECORD_FILE__IS_SELF_DESCRIBING:
				setIsSelfDescribing(IS_SELF_DESCRIBING_EDEFAULT);
				return;
			case RecordPackage.RECORD_FILE__RECORD_DELIMITER:
				setRecordDelimiter(RECORD_DELIMITER_EDEFAULT);
				return;
			case RecordPackage.RECORD_FILE__SKIP_RECORDS:
				setSkipRecords(SKIP_RECORDS_EDEFAULT);
				return;
			case RecordPackage.RECORD_FILE__RECORD:
				getRecord().clear();
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
			case RecordPackage.RECORD_FILE__IS_SELF_DESCRIBING:
				return IS_SELF_DESCRIBING_EDEFAULT == null ? isSelfDescribing != null : !IS_SELF_DESCRIBING_EDEFAULT.equals(isSelfDescribing);
			case RecordPackage.RECORD_FILE__RECORD_DELIMITER:
				return RECORD_DELIMITER_EDEFAULT == null ? recordDelimiter != null : !RECORD_DELIMITER_EDEFAULT.equals(recordDelimiter);
			case RecordPackage.RECORD_FILE__SKIP_RECORDS:
				return SKIP_RECORDS_EDEFAULT == null ? skipRecords != null : !SKIP_RECORDS_EDEFAULT.equals(skipRecords);
			case RecordPackage.RECORD_FILE__RECORD:
				return record != null && !record.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isSelfDescribing: ");
		result.append(isSelfDescribing);
		result.append(", recordDelimiter: ");
		result.append(recordDelimiter);
		result.append(", skipRecords: ");
		result.append(skipRecords);
		result.append(')');
		return result.toString();
	}

} //RecordFileImpl

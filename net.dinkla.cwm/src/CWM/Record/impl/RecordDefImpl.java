/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Record.impl;

import CWM.Core.impl.ClassImpl;

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
 * An implementation of the model object '<em><b>Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.Record.impl.RecordDefImpl#getFieldDelimiter <em>Field Delimiter</em>}</li>
 *   <li>{@link CWM.Record.impl.RecordDefImpl#getIsFixedWidth <em>Is Fixed Width</em>}</li>
 *   <li>{@link CWM.Record.impl.RecordDefImpl#getTextDelimiter <em>Text Delimiter</em>}</li>
 *   <li>{@link CWM.Record.impl.RecordDefImpl#getFile <em>File</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RecordDefImpl extends ClassImpl implements RecordDef {
	/**
	 * The default value of the '{@link #getFieldDelimiter() <em>Field Delimiter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldDelimiter()
	 * @generated
	 * @ordered
	 */
	protected static final String FIELD_DELIMITER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFieldDelimiter() <em>Field Delimiter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldDelimiter()
	 * @generated
	 * @ordered
	 */
	protected String fieldDelimiter = FIELD_DELIMITER_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsFixedWidth() <em>Is Fixed Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsFixedWidth()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_FIXED_WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsFixedWidth() <em>Is Fixed Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsFixedWidth()
	 * @generated
	 * @ordered
	 */
	protected Boolean isFixedWidth = IS_FIXED_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextDelimiter() <em>Text Delimiter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextDelimiter()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_DELIMITER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextDelimiter() <em>Text Delimiter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextDelimiter()
	 * @generated
	 * @ordered
	 */
	protected String textDelimiter = TEXT_DELIMITER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFile() <em>File</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
	protected EList<RecordFile> file;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecordDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RecordPackage.Literals.RECORD_DEF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFieldDelimiter() {
		return fieldDelimiter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFieldDelimiter(String newFieldDelimiter) {
		String oldFieldDelimiter = fieldDelimiter;
		fieldDelimiter = newFieldDelimiter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecordPackage.RECORD_DEF__FIELD_DELIMITER, oldFieldDelimiter, fieldDelimiter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsFixedWidth() {
		return isFixedWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsFixedWidth(Boolean newIsFixedWidth) {
		Boolean oldIsFixedWidth = isFixedWidth;
		isFixedWidth = newIsFixedWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecordPackage.RECORD_DEF__IS_FIXED_WIDTH, oldIsFixedWidth, isFixedWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextDelimiter() {
		return textDelimiter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextDelimiter(String newTextDelimiter) {
		String oldTextDelimiter = textDelimiter;
		textDelimiter = newTextDelimiter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecordPackage.RECORD_DEF__TEXT_DELIMITER, oldTextDelimiter, textDelimiter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RecordFile> getFile() {
		if (file == null) {
			file = new EObjectWithInverseResolvingEList.ManyInverse<RecordFile>(RecordFile.class, this, RecordPackage.RECORD_DEF__FILE, RecordPackage.RECORD_FILE__RECORD);
		}
		return file;
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
			case RecordPackage.RECORD_DEF__FILE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFile()).basicAdd(otherEnd, msgs);
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
			case RecordPackage.RECORD_DEF__FILE:
				return ((InternalEList<?>)getFile()).basicRemove(otherEnd, msgs);
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
			case RecordPackage.RECORD_DEF__FIELD_DELIMITER:
				return getFieldDelimiter();
			case RecordPackage.RECORD_DEF__IS_FIXED_WIDTH:
				return getIsFixedWidth();
			case RecordPackage.RECORD_DEF__TEXT_DELIMITER:
				return getTextDelimiter();
			case RecordPackage.RECORD_DEF__FILE:
				return getFile();
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
			case RecordPackage.RECORD_DEF__FIELD_DELIMITER:
				setFieldDelimiter((String)newValue);
				return;
			case RecordPackage.RECORD_DEF__IS_FIXED_WIDTH:
				setIsFixedWidth((Boolean)newValue);
				return;
			case RecordPackage.RECORD_DEF__TEXT_DELIMITER:
				setTextDelimiter((String)newValue);
				return;
			case RecordPackage.RECORD_DEF__FILE:
				getFile().clear();
				getFile().addAll((Collection<? extends RecordFile>)newValue);
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
			case RecordPackage.RECORD_DEF__FIELD_DELIMITER:
				setFieldDelimiter(FIELD_DELIMITER_EDEFAULT);
				return;
			case RecordPackage.RECORD_DEF__IS_FIXED_WIDTH:
				setIsFixedWidth(IS_FIXED_WIDTH_EDEFAULT);
				return;
			case RecordPackage.RECORD_DEF__TEXT_DELIMITER:
				setTextDelimiter(TEXT_DELIMITER_EDEFAULT);
				return;
			case RecordPackage.RECORD_DEF__FILE:
				getFile().clear();
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
			case RecordPackage.RECORD_DEF__FIELD_DELIMITER:
				return FIELD_DELIMITER_EDEFAULT == null ? fieldDelimiter != null : !FIELD_DELIMITER_EDEFAULT.equals(fieldDelimiter);
			case RecordPackage.RECORD_DEF__IS_FIXED_WIDTH:
				return IS_FIXED_WIDTH_EDEFAULT == null ? isFixedWidth != null : !IS_FIXED_WIDTH_EDEFAULT.equals(isFixedWidth);
			case RecordPackage.RECORD_DEF__TEXT_DELIMITER:
				return TEXT_DELIMITER_EDEFAULT == null ? textDelimiter != null : !TEXT_DELIMITER_EDEFAULT.equals(textDelimiter);
			case RecordPackage.RECORD_DEF__FILE:
				return file != null && !file.isEmpty();
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
		result.append(" (fieldDelimiter: ");
		result.append(fieldDelimiter);
		result.append(", isFixedWidth: ");
		result.append(isFixedWidth);
		result.append(", textDelimiter: ");
		result.append(textDelimiter);
		result.append(')');
		return result.toString();
	}

} //RecordDefImpl

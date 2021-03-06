/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Relational.impl;

import CWM.Core.impl.AttributeImpl;

import CWM.Relational.Column;

import CWM.Relational.Enumerations.NullableType;

import CWM.Relational.NamedColumnSet;
import CWM.Relational.RelationalPackage;
import CWM.Relational.SQLStructuredType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.Relational.impl.ColumnImpl#getPrecision <em>Precision</em>}</li>
 *   <li>{@link CWM.Relational.impl.ColumnImpl#getScale <em>Scale</em>}</li>
 *   <li>{@link CWM.Relational.impl.ColumnImpl#getIsNullable <em>Is Nullable</em>}</li>
 *   <li>{@link CWM.Relational.impl.ColumnImpl#getLength <em>Length</em>}</li>
 *   <li>{@link CWM.Relational.impl.ColumnImpl#getCollationName <em>Collation Name</em>}</li>
 *   <li>{@link CWM.Relational.impl.ColumnImpl#getCharacterSetName <em>Character Set Name</em>}</li>
 *   <li>{@link CWM.Relational.impl.ColumnImpl#getOptionScopeColumnSet <em>Option Scope Column Set</em>}</li>
 *   <li>{@link CWM.Relational.impl.ColumnImpl#getReferencedTableType <em>Referenced Table Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ColumnImpl extends AttributeImpl implements Column {
	/**
	 * The default value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PRECISION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected Integer precision = PRECISION_EDEFAULT;

	/**
	 * The default value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SCALE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected Integer scale = SCALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsNullable() <em>Is Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsNullable()
	 * @generated
	 * @ordered
	 */
	protected static final NullableType IS_NULLABLE_EDEFAULT = NullableType.COLUMN_NO_NULLS;

	/**
	 * The cached value of the '{@link #getIsNullable() <em>Is Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsNullable()
	 * @generated
	 * @ordered
	 */
	protected NullableType isNullable = IS_NULLABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected Integer length = LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getCollationName() <em>Collation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollationName()
	 * @generated
	 * @ordered
	 */
	protected static final String COLLATION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCollationName() <em>Collation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollationName()
	 * @generated
	 * @ordered
	 */
	protected String collationName = COLLATION_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCharacterSetName() <em>Character Set Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacterSetName()
	 * @generated
	 * @ordered
	 */
	protected static final String CHARACTER_SET_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCharacterSetName() <em>Character Set Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacterSetName()
	 * @generated
	 * @ordered
	 */
	protected String characterSetName = CHARACTER_SET_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOptionScopeColumnSet() <em>Option Scope Column Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionScopeColumnSet()
	 * @generated
	 * @ordered
	 */
	protected NamedColumnSet optionScopeColumnSet;

	/**
	 * The cached value of the '{@link #getReferencedTableType() <em>Referenced Table Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedTableType()
	 * @generated
	 * @ordered
	 */
	protected SQLStructuredType referencedTableType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RelationalPackage.Literals.COLUMN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getPrecision() {
		return precision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecision(Integer newPrecision) {
		Integer oldPrecision = precision;
		precision = newPrecision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalPackage.COLUMN__PRECISION, oldPrecision, precision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getScale() {
		return scale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScale(Integer newScale) {
		Integer oldScale = scale;
		scale = newScale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalPackage.COLUMN__SCALE, oldScale, scale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NullableType getIsNullable() {
		return isNullable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsNullable(NullableType newIsNullable) {
		NullableType oldIsNullable = isNullable;
		isNullable = newIsNullable == null ? IS_NULLABLE_EDEFAULT : newIsNullable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalPackage.COLUMN__IS_NULLABLE, oldIsNullable, isNullable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(Integer newLength) {
		Integer oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalPackage.COLUMN__LENGTH, oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCollationName() {
		return collationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollationName(String newCollationName) {
		String oldCollationName = collationName;
		collationName = newCollationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalPackage.COLUMN__COLLATION_NAME, oldCollationName, collationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCharacterSetName() {
		return characterSetName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCharacterSetName(String newCharacterSetName) {
		String oldCharacterSetName = characterSetName;
		characterSetName = newCharacterSetName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalPackage.COLUMN__CHARACTER_SET_NAME, oldCharacterSetName, characterSetName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedColumnSet getOptionScopeColumnSet() {
		if (optionScopeColumnSet != null && optionScopeColumnSet.eIsProxy()) {
			InternalEObject oldOptionScopeColumnSet = (InternalEObject)optionScopeColumnSet;
			optionScopeColumnSet = (NamedColumnSet)eResolveProxy(oldOptionScopeColumnSet);
			if (optionScopeColumnSet != oldOptionScopeColumnSet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RelationalPackage.COLUMN__OPTION_SCOPE_COLUMN_SET, oldOptionScopeColumnSet, optionScopeColumnSet));
			}
		}
		return optionScopeColumnSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedColumnSet basicGetOptionScopeColumnSet() {
		return optionScopeColumnSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOptionScopeColumnSet(NamedColumnSet newOptionScopeColumnSet, NotificationChain msgs) {
		NamedColumnSet oldOptionScopeColumnSet = optionScopeColumnSet;
		optionScopeColumnSet = newOptionScopeColumnSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RelationalPackage.COLUMN__OPTION_SCOPE_COLUMN_SET, oldOptionScopeColumnSet, newOptionScopeColumnSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptionScopeColumnSet(NamedColumnSet newOptionScopeColumnSet) {
		if (newOptionScopeColumnSet != optionScopeColumnSet) {
			NotificationChain msgs = null;
			if (optionScopeColumnSet != null)
				msgs = ((InternalEObject)optionScopeColumnSet).eInverseRemove(this, RelationalPackage.NAMED_COLUMN_SET__OPTION_SCOPE_COLUMN, NamedColumnSet.class, msgs);
			if (newOptionScopeColumnSet != null)
				msgs = ((InternalEObject)newOptionScopeColumnSet).eInverseAdd(this, RelationalPackage.NAMED_COLUMN_SET__OPTION_SCOPE_COLUMN, NamedColumnSet.class, msgs);
			msgs = basicSetOptionScopeColumnSet(newOptionScopeColumnSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalPackage.COLUMN__OPTION_SCOPE_COLUMN_SET, newOptionScopeColumnSet, newOptionScopeColumnSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SQLStructuredType getReferencedTableType() {
		if (referencedTableType != null && referencedTableType.eIsProxy()) {
			InternalEObject oldReferencedTableType = (InternalEObject)referencedTableType;
			referencedTableType = (SQLStructuredType)eResolveProxy(oldReferencedTableType);
			if (referencedTableType != oldReferencedTableType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RelationalPackage.COLUMN__REFERENCED_TABLE_TYPE, oldReferencedTableType, referencedTableType));
			}
		}
		return referencedTableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SQLStructuredType basicGetReferencedTableType() {
		return referencedTableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferencedTableType(SQLStructuredType newReferencedTableType, NotificationChain msgs) {
		SQLStructuredType oldReferencedTableType = referencedTableType;
		referencedTableType = newReferencedTableType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RelationalPackage.COLUMN__REFERENCED_TABLE_TYPE, oldReferencedTableType, newReferencedTableType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedTableType(SQLStructuredType newReferencedTableType) {
		if (newReferencedTableType != referencedTableType) {
			NotificationChain msgs = null;
			if (referencedTableType != null)
				msgs = ((InternalEObject)referencedTableType).eInverseRemove(this, RelationalPackage.SQL_STRUCTURED_TYPE__REFERENCING_COLUMN, SQLStructuredType.class, msgs);
			if (newReferencedTableType != null)
				msgs = ((InternalEObject)newReferencedTableType).eInverseAdd(this, RelationalPackage.SQL_STRUCTURED_TYPE__REFERENCING_COLUMN, SQLStructuredType.class, msgs);
			msgs = basicSetReferencedTableType(newReferencedTableType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalPackage.COLUMN__REFERENCED_TABLE_TYPE, newReferencedTableType, newReferencedTableType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RelationalPackage.COLUMN__OPTION_SCOPE_COLUMN_SET:
				if (optionScopeColumnSet != null)
					msgs = ((InternalEObject)optionScopeColumnSet).eInverseRemove(this, RelationalPackage.NAMED_COLUMN_SET__OPTION_SCOPE_COLUMN, NamedColumnSet.class, msgs);
				return basicSetOptionScopeColumnSet((NamedColumnSet)otherEnd, msgs);
			case RelationalPackage.COLUMN__REFERENCED_TABLE_TYPE:
				if (referencedTableType != null)
					msgs = ((InternalEObject)referencedTableType).eInverseRemove(this, RelationalPackage.SQL_STRUCTURED_TYPE__REFERENCING_COLUMN, SQLStructuredType.class, msgs);
				return basicSetReferencedTableType((SQLStructuredType)otherEnd, msgs);
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
			case RelationalPackage.COLUMN__OPTION_SCOPE_COLUMN_SET:
				return basicSetOptionScopeColumnSet(null, msgs);
			case RelationalPackage.COLUMN__REFERENCED_TABLE_TYPE:
				return basicSetReferencedTableType(null, msgs);
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
			case RelationalPackage.COLUMN__PRECISION:
				return getPrecision();
			case RelationalPackage.COLUMN__SCALE:
				return getScale();
			case RelationalPackage.COLUMN__IS_NULLABLE:
				return getIsNullable();
			case RelationalPackage.COLUMN__LENGTH:
				return getLength();
			case RelationalPackage.COLUMN__COLLATION_NAME:
				return getCollationName();
			case RelationalPackage.COLUMN__CHARACTER_SET_NAME:
				return getCharacterSetName();
			case RelationalPackage.COLUMN__OPTION_SCOPE_COLUMN_SET:
				if (resolve) return getOptionScopeColumnSet();
				return basicGetOptionScopeColumnSet();
			case RelationalPackage.COLUMN__REFERENCED_TABLE_TYPE:
				if (resolve) return getReferencedTableType();
				return basicGetReferencedTableType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RelationalPackage.COLUMN__PRECISION:
				setPrecision((Integer)newValue);
				return;
			case RelationalPackage.COLUMN__SCALE:
				setScale((Integer)newValue);
				return;
			case RelationalPackage.COLUMN__IS_NULLABLE:
				setIsNullable((NullableType)newValue);
				return;
			case RelationalPackage.COLUMN__LENGTH:
				setLength((Integer)newValue);
				return;
			case RelationalPackage.COLUMN__COLLATION_NAME:
				setCollationName((String)newValue);
				return;
			case RelationalPackage.COLUMN__CHARACTER_SET_NAME:
				setCharacterSetName((String)newValue);
				return;
			case RelationalPackage.COLUMN__OPTION_SCOPE_COLUMN_SET:
				setOptionScopeColumnSet((NamedColumnSet)newValue);
				return;
			case RelationalPackage.COLUMN__REFERENCED_TABLE_TYPE:
				setReferencedTableType((SQLStructuredType)newValue);
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
			case RelationalPackage.COLUMN__PRECISION:
				setPrecision(PRECISION_EDEFAULT);
				return;
			case RelationalPackage.COLUMN__SCALE:
				setScale(SCALE_EDEFAULT);
				return;
			case RelationalPackage.COLUMN__IS_NULLABLE:
				setIsNullable(IS_NULLABLE_EDEFAULT);
				return;
			case RelationalPackage.COLUMN__LENGTH:
				setLength(LENGTH_EDEFAULT);
				return;
			case RelationalPackage.COLUMN__COLLATION_NAME:
				setCollationName(COLLATION_NAME_EDEFAULT);
				return;
			case RelationalPackage.COLUMN__CHARACTER_SET_NAME:
				setCharacterSetName(CHARACTER_SET_NAME_EDEFAULT);
				return;
			case RelationalPackage.COLUMN__OPTION_SCOPE_COLUMN_SET:
				setOptionScopeColumnSet((NamedColumnSet)null);
				return;
			case RelationalPackage.COLUMN__REFERENCED_TABLE_TYPE:
				setReferencedTableType((SQLStructuredType)null);
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
			case RelationalPackage.COLUMN__PRECISION:
				return PRECISION_EDEFAULT == null ? precision != null : !PRECISION_EDEFAULT.equals(precision);
			case RelationalPackage.COLUMN__SCALE:
				return SCALE_EDEFAULT == null ? scale != null : !SCALE_EDEFAULT.equals(scale);
			case RelationalPackage.COLUMN__IS_NULLABLE:
				return isNullable != IS_NULLABLE_EDEFAULT;
			case RelationalPackage.COLUMN__LENGTH:
				return LENGTH_EDEFAULT == null ? length != null : !LENGTH_EDEFAULT.equals(length);
			case RelationalPackage.COLUMN__COLLATION_NAME:
				return COLLATION_NAME_EDEFAULT == null ? collationName != null : !COLLATION_NAME_EDEFAULT.equals(collationName);
			case RelationalPackage.COLUMN__CHARACTER_SET_NAME:
				return CHARACTER_SET_NAME_EDEFAULT == null ? characterSetName != null : !CHARACTER_SET_NAME_EDEFAULT.equals(characterSetName);
			case RelationalPackage.COLUMN__OPTION_SCOPE_COLUMN_SET:
				return optionScopeColumnSet != null;
			case RelationalPackage.COLUMN__REFERENCED_TABLE_TYPE:
				return referencedTableType != null;
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
		result.append(" (precision: ");
		result.append(precision);
		result.append(", scale: ");
		result.append(scale);
		result.append(", isNullable: ");
		result.append(isNullable);
		result.append(", length: ");
		result.append(length);
		result.append(", collationName: ");
		result.append(collationName);
		result.append(", characterSetName: ");
		result.append(characterSetName);
		result.append(')');
		return result.toString();
	}

} //ColumnImpl

/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Relational.impl;

import CWM.Relational.RelationalPackage;
import CWM.Relational.SQLSimpleType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SQL Simple Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.Relational.impl.SQLSimpleTypeImpl#getCharacterMaximumLength <em>Character Maximum Length</em>}</li>
 *   <li>{@link CWM.Relational.impl.SQLSimpleTypeImpl#getCharacterOctetLength <em>Character Octet Length</em>}</li>
 *   <li>{@link CWM.Relational.impl.SQLSimpleTypeImpl#getNumericPrecision <em>Numeric Precision</em>}</li>
 *   <li>{@link CWM.Relational.impl.SQLSimpleTypeImpl#getNumericPrecisionRadix <em>Numeric Precision Radix</em>}</li>
 *   <li>{@link CWM.Relational.impl.SQLSimpleTypeImpl#getNumericScale <em>Numeric Scale</em>}</li>
 *   <li>{@link CWM.Relational.impl.SQLSimpleTypeImpl#getDateTimePrecision <em>Date Time Precision</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SQLSimpleTypeImpl extends SQLDataTypeImpl implements SQLSimpleType {
	/**
	 * The default value of the '{@link #getCharacterMaximumLength() <em>Character Maximum Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacterMaximumLength()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CHARACTER_MAXIMUM_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCharacterMaximumLength() <em>Character Maximum Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacterMaximumLength()
	 * @generated
	 * @ordered
	 */
	protected Integer characterMaximumLength = CHARACTER_MAXIMUM_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getCharacterOctetLength() <em>Character Octet Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacterOctetLength()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CHARACTER_OCTET_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCharacterOctetLength() <em>Character Octet Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacterOctetLength()
	 * @generated
	 * @ordered
	 */
	protected Integer characterOctetLength = CHARACTER_OCTET_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumericPrecision() <em>Numeric Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumericPrecision()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NUMERIC_PRECISION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumericPrecision() <em>Numeric Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumericPrecision()
	 * @generated
	 * @ordered
	 */
	protected Integer numericPrecision = NUMERIC_PRECISION_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumericPrecisionRadix() <em>Numeric Precision Radix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumericPrecisionRadix()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NUMERIC_PRECISION_RADIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumericPrecisionRadix() <em>Numeric Precision Radix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumericPrecisionRadix()
	 * @generated
	 * @ordered
	 */
	protected Integer numericPrecisionRadix = NUMERIC_PRECISION_RADIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumericScale() <em>Numeric Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumericScale()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NUMERIC_SCALE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumericScale() <em>Numeric Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumericScale()
	 * @generated
	 * @ordered
	 */
	protected Integer numericScale = NUMERIC_SCALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateTimePrecision() <em>Date Time Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTimePrecision()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DATE_TIME_PRECISION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateTimePrecision() <em>Date Time Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTimePrecision()
	 * @generated
	 * @ordered
	 */
	protected Integer dateTimePrecision = DATE_TIME_PRECISION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SQLSimpleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RelationalPackage.Literals.SQL_SIMPLE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getCharacterMaximumLength() {
		return characterMaximumLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCharacterMaximumLength(Integer newCharacterMaximumLength) {
		Integer oldCharacterMaximumLength = characterMaximumLength;
		characterMaximumLength = newCharacterMaximumLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalPackage.SQL_SIMPLE_TYPE__CHARACTER_MAXIMUM_LENGTH, oldCharacterMaximumLength, characterMaximumLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getCharacterOctetLength() {
		return characterOctetLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCharacterOctetLength(Integer newCharacterOctetLength) {
		Integer oldCharacterOctetLength = characterOctetLength;
		characterOctetLength = newCharacterOctetLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalPackage.SQL_SIMPLE_TYPE__CHARACTER_OCTET_LENGTH, oldCharacterOctetLength, characterOctetLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getNumericPrecision() {
		return numericPrecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumericPrecision(Integer newNumericPrecision) {
		Integer oldNumericPrecision = numericPrecision;
		numericPrecision = newNumericPrecision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalPackage.SQL_SIMPLE_TYPE__NUMERIC_PRECISION, oldNumericPrecision, numericPrecision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getNumericPrecisionRadix() {
		return numericPrecisionRadix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumericPrecisionRadix(Integer newNumericPrecisionRadix) {
		Integer oldNumericPrecisionRadix = numericPrecisionRadix;
		numericPrecisionRadix = newNumericPrecisionRadix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalPackage.SQL_SIMPLE_TYPE__NUMERIC_PRECISION_RADIX, oldNumericPrecisionRadix, numericPrecisionRadix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getNumericScale() {
		return numericScale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumericScale(Integer newNumericScale) {
		Integer oldNumericScale = numericScale;
		numericScale = newNumericScale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalPackage.SQL_SIMPLE_TYPE__NUMERIC_SCALE, oldNumericScale, numericScale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getDateTimePrecision() {
		return dateTimePrecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateTimePrecision(Integer newDateTimePrecision) {
		Integer oldDateTimePrecision = dateTimePrecision;
		dateTimePrecision = newDateTimePrecision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalPackage.SQL_SIMPLE_TYPE__DATE_TIME_PRECISION, oldDateTimePrecision, dateTimePrecision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RelationalPackage.SQL_SIMPLE_TYPE__CHARACTER_MAXIMUM_LENGTH:
				return getCharacterMaximumLength();
			case RelationalPackage.SQL_SIMPLE_TYPE__CHARACTER_OCTET_LENGTH:
				return getCharacterOctetLength();
			case RelationalPackage.SQL_SIMPLE_TYPE__NUMERIC_PRECISION:
				return getNumericPrecision();
			case RelationalPackage.SQL_SIMPLE_TYPE__NUMERIC_PRECISION_RADIX:
				return getNumericPrecisionRadix();
			case RelationalPackage.SQL_SIMPLE_TYPE__NUMERIC_SCALE:
				return getNumericScale();
			case RelationalPackage.SQL_SIMPLE_TYPE__DATE_TIME_PRECISION:
				return getDateTimePrecision();
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
			case RelationalPackage.SQL_SIMPLE_TYPE__CHARACTER_MAXIMUM_LENGTH:
				setCharacterMaximumLength((Integer)newValue);
				return;
			case RelationalPackage.SQL_SIMPLE_TYPE__CHARACTER_OCTET_LENGTH:
				setCharacterOctetLength((Integer)newValue);
				return;
			case RelationalPackage.SQL_SIMPLE_TYPE__NUMERIC_PRECISION:
				setNumericPrecision((Integer)newValue);
				return;
			case RelationalPackage.SQL_SIMPLE_TYPE__NUMERIC_PRECISION_RADIX:
				setNumericPrecisionRadix((Integer)newValue);
				return;
			case RelationalPackage.SQL_SIMPLE_TYPE__NUMERIC_SCALE:
				setNumericScale((Integer)newValue);
				return;
			case RelationalPackage.SQL_SIMPLE_TYPE__DATE_TIME_PRECISION:
				setDateTimePrecision((Integer)newValue);
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
			case RelationalPackage.SQL_SIMPLE_TYPE__CHARACTER_MAXIMUM_LENGTH:
				setCharacterMaximumLength(CHARACTER_MAXIMUM_LENGTH_EDEFAULT);
				return;
			case RelationalPackage.SQL_SIMPLE_TYPE__CHARACTER_OCTET_LENGTH:
				setCharacterOctetLength(CHARACTER_OCTET_LENGTH_EDEFAULT);
				return;
			case RelationalPackage.SQL_SIMPLE_TYPE__NUMERIC_PRECISION:
				setNumericPrecision(NUMERIC_PRECISION_EDEFAULT);
				return;
			case RelationalPackage.SQL_SIMPLE_TYPE__NUMERIC_PRECISION_RADIX:
				setNumericPrecisionRadix(NUMERIC_PRECISION_RADIX_EDEFAULT);
				return;
			case RelationalPackage.SQL_SIMPLE_TYPE__NUMERIC_SCALE:
				setNumericScale(NUMERIC_SCALE_EDEFAULT);
				return;
			case RelationalPackage.SQL_SIMPLE_TYPE__DATE_TIME_PRECISION:
				setDateTimePrecision(DATE_TIME_PRECISION_EDEFAULT);
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
			case RelationalPackage.SQL_SIMPLE_TYPE__CHARACTER_MAXIMUM_LENGTH:
				return CHARACTER_MAXIMUM_LENGTH_EDEFAULT == null ? characterMaximumLength != null : !CHARACTER_MAXIMUM_LENGTH_EDEFAULT.equals(characterMaximumLength);
			case RelationalPackage.SQL_SIMPLE_TYPE__CHARACTER_OCTET_LENGTH:
				return CHARACTER_OCTET_LENGTH_EDEFAULT == null ? characterOctetLength != null : !CHARACTER_OCTET_LENGTH_EDEFAULT.equals(characterOctetLength);
			case RelationalPackage.SQL_SIMPLE_TYPE__NUMERIC_PRECISION:
				return NUMERIC_PRECISION_EDEFAULT == null ? numericPrecision != null : !NUMERIC_PRECISION_EDEFAULT.equals(numericPrecision);
			case RelationalPackage.SQL_SIMPLE_TYPE__NUMERIC_PRECISION_RADIX:
				return NUMERIC_PRECISION_RADIX_EDEFAULT == null ? numericPrecisionRadix != null : !NUMERIC_PRECISION_RADIX_EDEFAULT.equals(numericPrecisionRadix);
			case RelationalPackage.SQL_SIMPLE_TYPE__NUMERIC_SCALE:
				return NUMERIC_SCALE_EDEFAULT == null ? numericScale != null : !NUMERIC_SCALE_EDEFAULT.equals(numericScale);
			case RelationalPackage.SQL_SIMPLE_TYPE__DATE_TIME_PRECISION:
				return DATE_TIME_PRECISION_EDEFAULT == null ? dateTimePrecision != null : !DATE_TIME_PRECISION_EDEFAULT.equals(dateTimePrecision);
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
		result.append(" (characterMaximumLength: ");
		result.append(characterMaximumLength);
		result.append(", characterOctetLength: ");
		result.append(characterOctetLength);
		result.append(", numericPrecision: ");
		result.append(numericPrecision);
		result.append(", numericPrecisionRadix: ");
		result.append(numericPrecisionRadix);
		result.append(", numericScale: ");
		result.append(numericScale);
		result.append(", dateTimePrecision: ");
		result.append(dateTimePrecision);
		result.append(')');
		return result.toString();
	}

} //SQLSimpleTypeImpl

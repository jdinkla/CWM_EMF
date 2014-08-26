/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Relational.impl;

import CWM.Core.Classifier;
import CWM.Core.DataType;

import CWM.DataTypes.DataTypesPackage;
import CWM.DataTypes.TypeAlias;

import CWM.Relational.RelationalPackage;
import CWM.Relational.SQLDistinctType;
import CWM.Relational.SQLSimpleType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SQL Distinct Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.Relational.impl.SQLDistinctTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link CWM.Relational.impl.SQLDistinctTypeImpl#getLength <em>Length</em>}</li>
 *   <li>{@link CWM.Relational.impl.SQLDistinctTypeImpl#getPrecision <em>Precision</em>}</li>
 *   <li>{@link CWM.Relational.impl.SQLDistinctTypeImpl#getScale <em>Scale</em>}</li>
 *   <li>{@link CWM.Relational.impl.SQLDistinctTypeImpl#getSqlSimpleType <em>Sql Simple Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SQLDistinctTypeImpl extends SQLDataTypeImpl implements SQLDistinctType {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Classifier type;

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
	 * The cached value of the '{@link #getSqlSimpleType() <em>Sql Simple Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSqlSimpleType()
	 * @generated
	 * @ordered
	 */
	protected SQLSimpleType sqlSimpleType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SQLDistinctTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RelationalPackage.Literals.SQL_DISTINCT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Classifier)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RelationalPackage.SQL_DISTINCT_TYPE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Classifier newType) {
		Classifier oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalPackage.SQL_DISTINCT_TYPE__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalPackage.SQL_DISTINCT_TYPE__LENGTH, oldLength, length));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalPackage.SQL_DISTINCT_TYPE__PRECISION, oldPrecision, precision));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalPackage.SQL_DISTINCT_TYPE__SCALE, oldScale, scale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SQLSimpleType getSqlSimpleType() {
		if (sqlSimpleType != null && sqlSimpleType.eIsProxy()) {
			InternalEObject oldSqlSimpleType = (InternalEObject)sqlSimpleType;
			sqlSimpleType = (SQLSimpleType)eResolveProxy(oldSqlSimpleType);
			if (sqlSimpleType != oldSqlSimpleType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RelationalPackage.SQL_DISTINCT_TYPE__SQL_SIMPLE_TYPE, oldSqlSimpleType, sqlSimpleType));
			}
		}
		return sqlSimpleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SQLSimpleType basicGetSqlSimpleType() {
		return sqlSimpleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSqlSimpleType(SQLSimpleType newSqlSimpleType) {
		SQLSimpleType oldSqlSimpleType = sqlSimpleType;
		sqlSimpleType = newSqlSimpleType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalPackage.SQL_DISTINCT_TYPE__SQL_SIMPLE_TYPE, oldSqlSimpleType, sqlSimpleType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RelationalPackage.SQL_DISTINCT_TYPE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case RelationalPackage.SQL_DISTINCT_TYPE__LENGTH:
				return getLength();
			case RelationalPackage.SQL_DISTINCT_TYPE__PRECISION:
				return getPrecision();
			case RelationalPackage.SQL_DISTINCT_TYPE__SCALE:
				return getScale();
			case RelationalPackage.SQL_DISTINCT_TYPE__SQL_SIMPLE_TYPE:
				if (resolve) return getSqlSimpleType();
				return basicGetSqlSimpleType();
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
			case RelationalPackage.SQL_DISTINCT_TYPE__TYPE:
				setType((Classifier)newValue);
				return;
			case RelationalPackage.SQL_DISTINCT_TYPE__LENGTH:
				setLength((Integer)newValue);
				return;
			case RelationalPackage.SQL_DISTINCT_TYPE__PRECISION:
				setPrecision((Integer)newValue);
				return;
			case RelationalPackage.SQL_DISTINCT_TYPE__SCALE:
				setScale((Integer)newValue);
				return;
			case RelationalPackage.SQL_DISTINCT_TYPE__SQL_SIMPLE_TYPE:
				setSqlSimpleType((SQLSimpleType)newValue);
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
			case RelationalPackage.SQL_DISTINCT_TYPE__TYPE:
				setType((Classifier)null);
				return;
			case RelationalPackage.SQL_DISTINCT_TYPE__LENGTH:
				setLength(LENGTH_EDEFAULT);
				return;
			case RelationalPackage.SQL_DISTINCT_TYPE__PRECISION:
				setPrecision(PRECISION_EDEFAULT);
				return;
			case RelationalPackage.SQL_DISTINCT_TYPE__SCALE:
				setScale(SCALE_EDEFAULT);
				return;
			case RelationalPackage.SQL_DISTINCT_TYPE__SQL_SIMPLE_TYPE:
				setSqlSimpleType((SQLSimpleType)null);
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
			case RelationalPackage.SQL_DISTINCT_TYPE__TYPE:
				return type != null;
			case RelationalPackage.SQL_DISTINCT_TYPE__LENGTH:
				return LENGTH_EDEFAULT == null ? length != null : !LENGTH_EDEFAULT.equals(length);
			case RelationalPackage.SQL_DISTINCT_TYPE__PRECISION:
				return PRECISION_EDEFAULT == null ? precision != null : !PRECISION_EDEFAULT.equals(precision);
			case RelationalPackage.SQL_DISTINCT_TYPE__SCALE:
				return SCALE_EDEFAULT == null ? scale != null : !SCALE_EDEFAULT.equals(scale);
			case RelationalPackage.SQL_DISTINCT_TYPE__SQL_SIMPLE_TYPE:
				return sqlSimpleType != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == DataType.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == TypeAlias.class) {
			switch (derivedFeatureID) {
				case RelationalPackage.SQL_DISTINCT_TYPE__TYPE: return DataTypesPackage.TYPE_ALIAS__TYPE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == DataType.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == TypeAlias.class) {
			switch (baseFeatureID) {
				case DataTypesPackage.TYPE_ALIAS__TYPE: return RelationalPackage.SQL_DISTINCT_TYPE__TYPE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (length: ");
		result.append(length);
		result.append(", precision: ");
		result.append(precision);
		result.append(", scale: ");
		result.append(scale);
		result.append(')');
		return result.toString();
	}

} //SQLDistinctTypeImpl

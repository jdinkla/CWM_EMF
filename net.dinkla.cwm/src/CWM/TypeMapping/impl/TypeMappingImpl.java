/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.TypeMapping.impl;

import CWM.Core.Classifier;

import CWM.Core.impl.ModelElementImpl;

import CWM.TypeMapping.TypeMapping;
import CWM.TypeMapping.TypeMappingPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.TypeMapping.impl.TypeMappingImpl#getIsBestMatch <em>Is Best Match</em>}</li>
 *   <li>{@link CWM.TypeMapping.impl.TypeMappingImpl#getIsLossy <em>Is Lossy</em>}</li>
 *   <li>{@link CWM.TypeMapping.impl.TypeMappingImpl#getSourceType <em>Source Type</em>}</li>
 *   <li>{@link CWM.TypeMapping.impl.TypeMappingImpl#getTargetType <em>Target Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeMappingImpl extends ModelElementImpl implements TypeMapping {
	/**
	 * The default value of the '{@link #getIsBestMatch() <em>Is Best Match</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsBestMatch()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_BEST_MATCH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsBestMatch() <em>Is Best Match</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsBestMatch()
	 * @generated
	 * @ordered
	 */
	protected Boolean isBestMatch = IS_BEST_MATCH_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsLossy() <em>Is Lossy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsLossy()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_LOSSY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsLossy() <em>Is Lossy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsLossy()
	 * @generated
	 * @ordered
	 */
	protected Boolean isLossy = IS_LOSSY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSourceType() <em>Source Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceType()
	 * @generated
	 * @ordered
	 */
	protected Classifier sourceType;

	/**
	 * The cached value of the '{@link #getTargetType() <em>Target Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetType()
	 * @generated
	 * @ordered
	 */
	protected Classifier targetType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypeMappingPackage.Literals.TYPE_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsBestMatch() {
		return isBestMatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsBestMatch(Boolean newIsBestMatch) {
		Boolean oldIsBestMatch = isBestMatch;
		isBestMatch = newIsBestMatch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypeMappingPackage.TYPE_MAPPING__IS_BEST_MATCH, oldIsBestMatch, isBestMatch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsLossy() {
		return isLossy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLossy(Boolean newIsLossy) {
		Boolean oldIsLossy = isLossy;
		isLossy = newIsLossy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypeMappingPackage.TYPE_MAPPING__IS_LOSSY, oldIsLossy, isLossy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getSourceType() {
		if (sourceType != null && sourceType.eIsProxy()) {
			InternalEObject oldSourceType = (InternalEObject)sourceType;
			sourceType = (Classifier)eResolveProxy(oldSourceType);
			if (sourceType != oldSourceType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypeMappingPackage.TYPE_MAPPING__SOURCE_TYPE, oldSourceType, sourceType));
			}
		}
		return sourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier basicGetSourceType() {
		return sourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceType(Classifier newSourceType) {
		Classifier oldSourceType = sourceType;
		sourceType = newSourceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypeMappingPackage.TYPE_MAPPING__SOURCE_TYPE, oldSourceType, sourceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getTargetType() {
		if (targetType != null && targetType.eIsProxy()) {
			InternalEObject oldTargetType = (InternalEObject)targetType;
			targetType = (Classifier)eResolveProxy(oldTargetType);
			if (targetType != oldTargetType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypeMappingPackage.TYPE_MAPPING__TARGET_TYPE, oldTargetType, targetType));
			}
		}
		return targetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier basicGetTargetType() {
		return targetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetType(Classifier newTargetType) {
		Classifier oldTargetType = targetType;
		targetType = newTargetType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypeMappingPackage.TYPE_MAPPING__TARGET_TYPE, oldTargetType, targetType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypeMappingPackage.TYPE_MAPPING__IS_BEST_MATCH:
				return getIsBestMatch();
			case TypeMappingPackage.TYPE_MAPPING__IS_LOSSY:
				return getIsLossy();
			case TypeMappingPackage.TYPE_MAPPING__SOURCE_TYPE:
				if (resolve) return getSourceType();
				return basicGetSourceType();
			case TypeMappingPackage.TYPE_MAPPING__TARGET_TYPE:
				if (resolve) return getTargetType();
				return basicGetTargetType();
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
			case TypeMappingPackage.TYPE_MAPPING__IS_BEST_MATCH:
				setIsBestMatch((Boolean)newValue);
				return;
			case TypeMappingPackage.TYPE_MAPPING__IS_LOSSY:
				setIsLossy((Boolean)newValue);
				return;
			case TypeMappingPackage.TYPE_MAPPING__SOURCE_TYPE:
				setSourceType((Classifier)newValue);
				return;
			case TypeMappingPackage.TYPE_MAPPING__TARGET_TYPE:
				setTargetType((Classifier)newValue);
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
			case TypeMappingPackage.TYPE_MAPPING__IS_BEST_MATCH:
				setIsBestMatch(IS_BEST_MATCH_EDEFAULT);
				return;
			case TypeMappingPackage.TYPE_MAPPING__IS_LOSSY:
				setIsLossy(IS_LOSSY_EDEFAULT);
				return;
			case TypeMappingPackage.TYPE_MAPPING__SOURCE_TYPE:
				setSourceType((Classifier)null);
				return;
			case TypeMappingPackage.TYPE_MAPPING__TARGET_TYPE:
				setTargetType((Classifier)null);
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
			case TypeMappingPackage.TYPE_MAPPING__IS_BEST_MATCH:
				return IS_BEST_MATCH_EDEFAULT == null ? isBestMatch != null : !IS_BEST_MATCH_EDEFAULT.equals(isBestMatch);
			case TypeMappingPackage.TYPE_MAPPING__IS_LOSSY:
				return IS_LOSSY_EDEFAULT == null ? isLossy != null : !IS_LOSSY_EDEFAULT.equals(isLossy);
			case TypeMappingPackage.TYPE_MAPPING__SOURCE_TYPE:
				return sourceType != null;
			case TypeMappingPackage.TYPE_MAPPING__TARGET_TYPE:
				return targetType != null;
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
		result.append(" (isBestMatch: ");
		result.append(isBestMatch);
		result.append(", isLossy: ");
		result.append(isLossy);
		result.append(')');
		return result.toString();
	}

} //TypeMappingImpl

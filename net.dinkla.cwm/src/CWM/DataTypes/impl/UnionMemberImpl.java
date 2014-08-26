/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.DataTypes.impl;

import CWM.Core.Expression;

import CWM.Core.impl.AttributeImpl;

import CWM.DataTypes.DataTypesPackage;
import CWM.DataTypes.UnionMember;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Union Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.DataTypes.impl.UnionMemberImpl#getMemberCase <em>Member Case</em>}</li>
 *   <li>{@link CWM.DataTypes.impl.UnionMemberImpl#getIsDefault <em>Is Default</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnionMemberImpl extends AttributeImpl implements UnionMember {
	/**
	 * The cached value of the '{@link #getMemberCase() <em>Member Case</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberCase()
	 * @generated
	 * @ordered
	 */
	protected Expression memberCase;

	/**
	 * The default value of the '{@link #getIsDefault() <em>Is Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDefault()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_DEFAULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsDefault() <em>Is Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDefault()
	 * @generated
	 * @ordered
	 */
	protected Boolean isDefault = IS_DEFAULT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnionMemberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataTypesPackage.Literals.UNION_MEMBER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getMemberCase() {
		return memberCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMemberCase(Expression newMemberCase, NotificationChain msgs) {
		Expression oldMemberCase = memberCase;
		memberCase = newMemberCase;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.UNION_MEMBER__MEMBER_CASE, oldMemberCase, newMemberCase);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemberCase(Expression newMemberCase) {
		if (newMemberCase != memberCase) {
			NotificationChain msgs = null;
			if (memberCase != null)
				msgs = ((InternalEObject)memberCase).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.UNION_MEMBER__MEMBER_CASE, null, msgs);
			if (newMemberCase != null)
				msgs = ((InternalEObject)newMemberCase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.UNION_MEMBER__MEMBER_CASE, null, msgs);
			msgs = basicSetMemberCase(newMemberCase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.UNION_MEMBER__MEMBER_CASE, newMemberCase, newMemberCase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsDefault() {
		return isDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDefault(Boolean newIsDefault) {
		Boolean oldIsDefault = isDefault;
		isDefault = newIsDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.UNION_MEMBER__IS_DEFAULT, oldIsDefault, isDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataTypesPackage.UNION_MEMBER__MEMBER_CASE:
				return basicSetMemberCase(null, msgs);
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
			case DataTypesPackage.UNION_MEMBER__MEMBER_CASE:
				return getMemberCase();
			case DataTypesPackage.UNION_MEMBER__IS_DEFAULT:
				return getIsDefault();
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
			case DataTypesPackage.UNION_MEMBER__MEMBER_CASE:
				setMemberCase((Expression)newValue);
				return;
			case DataTypesPackage.UNION_MEMBER__IS_DEFAULT:
				setIsDefault((Boolean)newValue);
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
			case DataTypesPackage.UNION_MEMBER__MEMBER_CASE:
				setMemberCase((Expression)null);
				return;
			case DataTypesPackage.UNION_MEMBER__IS_DEFAULT:
				setIsDefault(IS_DEFAULT_EDEFAULT);
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
			case DataTypesPackage.UNION_MEMBER__MEMBER_CASE:
				return memberCase != null;
			case DataTypesPackage.UNION_MEMBER__IS_DEFAULT:
				return IS_DEFAULT_EDEFAULT == null ? isDefault != null : !IS_DEFAULT_EDEFAULT.equals(isDefault);
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
		result.append(" (isDefault: ");
		result.append(isDefault);
		result.append(')');
		return result.toString();
	}

} //UnionMemberImpl

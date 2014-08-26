/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningData.impl;

import CWM.Core.Attribute;

import CWM.MiningCore.MiningData.MiningDataPackage;
import CWM.MiningCore.MiningData.SetAttributeAssignment;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Attribute Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.MiningCore.MiningData.impl.SetAttributeAssignmentImpl#getSetIdAttribute <em>Set Id Attribute</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.impl.SetAttributeAssignmentImpl#getMemberAttribute <em>Member Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SetAttributeAssignmentImpl extends AttributeAssignmentImpl implements SetAttributeAssignment {
	/**
	 * The cached value of the '{@link #getSetIdAttribute() <em>Set Id Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetIdAttribute()
	 * @generated
	 * @ordered
	 */
	protected Attribute setIdAttribute;

	/**
	 * The cached value of the '{@link #getMemberAttribute() <em>Member Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberAttribute()
	 * @generated
	 * @ordered
	 */
	protected Attribute memberAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetAttributeAssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MiningDataPackage.Literals.SET_ATTRIBUTE_ASSIGNMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getSetIdAttribute() {
		if (setIdAttribute != null && setIdAttribute.eIsProxy()) {
			InternalEObject oldSetIdAttribute = (InternalEObject)setIdAttribute;
			setIdAttribute = (Attribute)eResolveProxy(oldSetIdAttribute);
			if (setIdAttribute != oldSetIdAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MiningDataPackage.SET_ATTRIBUTE_ASSIGNMENT__SET_ID_ATTRIBUTE, oldSetIdAttribute, setIdAttribute));
			}
		}
		return setIdAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetSetIdAttribute() {
		return setIdAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetIdAttribute(Attribute newSetIdAttribute) {
		Attribute oldSetIdAttribute = setIdAttribute;
		setIdAttribute = newSetIdAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiningDataPackage.SET_ATTRIBUTE_ASSIGNMENT__SET_ID_ATTRIBUTE, oldSetIdAttribute, setIdAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getMemberAttribute() {
		if (memberAttribute != null && memberAttribute.eIsProxy()) {
			InternalEObject oldMemberAttribute = (InternalEObject)memberAttribute;
			memberAttribute = (Attribute)eResolveProxy(oldMemberAttribute);
			if (memberAttribute != oldMemberAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MiningDataPackage.SET_ATTRIBUTE_ASSIGNMENT__MEMBER_ATTRIBUTE, oldMemberAttribute, memberAttribute));
			}
		}
		return memberAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetMemberAttribute() {
		return memberAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemberAttribute(Attribute newMemberAttribute) {
		Attribute oldMemberAttribute = memberAttribute;
		memberAttribute = newMemberAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiningDataPackage.SET_ATTRIBUTE_ASSIGNMENT__MEMBER_ATTRIBUTE, oldMemberAttribute, memberAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MiningDataPackage.SET_ATTRIBUTE_ASSIGNMENT__SET_ID_ATTRIBUTE:
				if (resolve) return getSetIdAttribute();
				return basicGetSetIdAttribute();
			case MiningDataPackage.SET_ATTRIBUTE_ASSIGNMENT__MEMBER_ATTRIBUTE:
				if (resolve) return getMemberAttribute();
				return basicGetMemberAttribute();
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
			case MiningDataPackage.SET_ATTRIBUTE_ASSIGNMENT__SET_ID_ATTRIBUTE:
				setSetIdAttribute((Attribute)newValue);
				return;
			case MiningDataPackage.SET_ATTRIBUTE_ASSIGNMENT__MEMBER_ATTRIBUTE:
				setMemberAttribute((Attribute)newValue);
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
			case MiningDataPackage.SET_ATTRIBUTE_ASSIGNMENT__SET_ID_ATTRIBUTE:
				setSetIdAttribute((Attribute)null);
				return;
			case MiningDataPackage.SET_ATTRIBUTE_ASSIGNMENT__MEMBER_ATTRIBUTE:
				setMemberAttribute((Attribute)null);
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
			case MiningDataPackage.SET_ATTRIBUTE_ASSIGNMENT__SET_ID_ATTRIBUTE:
				return setIdAttribute != null;
			case MiningDataPackage.SET_ATTRIBUTE_ASSIGNMENT__MEMBER_ATTRIBUTE:
				return memberAttribute != null;
		}
		return super.eIsSet(featureID);
	}

} //SetAttributeAssignmentImpl

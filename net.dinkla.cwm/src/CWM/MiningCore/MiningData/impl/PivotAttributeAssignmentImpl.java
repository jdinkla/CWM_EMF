/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningData.impl;

import CWM.Core.Attribute;

import CWM.MiningCore.MiningData.MiningDataPackage;
import CWM.MiningCore.MiningData.PivotAttributeAssignment;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pivot Attribute Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.MiningCore.MiningData.impl.PivotAttributeAssignmentImpl#getSetIdAttribute <em>Set Id Attribute</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.impl.PivotAttributeAssignmentImpl#getNameAttribute <em>Name Attribute</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.impl.PivotAttributeAssignmentImpl#getValueAttribute <em>Value Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PivotAttributeAssignmentImpl extends AttributeAssignmentImpl implements PivotAttributeAssignment {
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
	 * The cached value of the '{@link #getNameAttribute() <em>Name Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameAttribute()
	 * @generated
	 * @ordered
	 */
	protected Attribute nameAttribute;

	/**
	 * The cached value of the '{@link #getValueAttribute() <em>Value Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueAttribute()
	 * @generated
	 * @ordered
	 */
	protected Attribute valueAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PivotAttributeAssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MiningDataPackage.Literals.PIVOT_ATTRIBUTE_ASSIGNMENT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MiningDataPackage.PIVOT_ATTRIBUTE_ASSIGNMENT__SET_ID_ATTRIBUTE, oldSetIdAttribute, setIdAttribute));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MiningDataPackage.PIVOT_ATTRIBUTE_ASSIGNMENT__SET_ID_ATTRIBUTE, oldSetIdAttribute, setIdAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getNameAttribute() {
		if (nameAttribute != null && nameAttribute.eIsProxy()) {
			InternalEObject oldNameAttribute = (InternalEObject)nameAttribute;
			nameAttribute = (Attribute)eResolveProxy(oldNameAttribute);
			if (nameAttribute != oldNameAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MiningDataPackage.PIVOT_ATTRIBUTE_ASSIGNMENT__NAME_ATTRIBUTE, oldNameAttribute, nameAttribute));
			}
		}
		return nameAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetNameAttribute() {
		return nameAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameAttribute(Attribute newNameAttribute) {
		Attribute oldNameAttribute = nameAttribute;
		nameAttribute = newNameAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiningDataPackage.PIVOT_ATTRIBUTE_ASSIGNMENT__NAME_ATTRIBUTE, oldNameAttribute, nameAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getValueAttribute() {
		if (valueAttribute != null && valueAttribute.eIsProxy()) {
			InternalEObject oldValueAttribute = (InternalEObject)valueAttribute;
			valueAttribute = (Attribute)eResolveProxy(oldValueAttribute);
			if (valueAttribute != oldValueAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MiningDataPackage.PIVOT_ATTRIBUTE_ASSIGNMENT__VALUE_ATTRIBUTE, oldValueAttribute, valueAttribute));
			}
		}
		return valueAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetValueAttribute() {
		return valueAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueAttribute(Attribute newValueAttribute) {
		Attribute oldValueAttribute = valueAttribute;
		valueAttribute = newValueAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiningDataPackage.PIVOT_ATTRIBUTE_ASSIGNMENT__VALUE_ATTRIBUTE, oldValueAttribute, valueAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MiningDataPackage.PIVOT_ATTRIBUTE_ASSIGNMENT__SET_ID_ATTRIBUTE:
				if (resolve) return getSetIdAttribute();
				return basicGetSetIdAttribute();
			case MiningDataPackage.PIVOT_ATTRIBUTE_ASSIGNMENT__NAME_ATTRIBUTE:
				if (resolve) return getNameAttribute();
				return basicGetNameAttribute();
			case MiningDataPackage.PIVOT_ATTRIBUTE_ASSIGNMENT__VALUE_ATTRIBUTE:
				if (resolve) return getValueAttribute();
				return basicGetValueAttribute();
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
			case MiningDataPackage.PIVOT_ATTRIBUTE_ASSIGNMENT__SET_ID_ATTRIBUTE:
				setSetIdAttribute((Attribute)newValue);
				return;
			case MiningDataPackage.PIVOT_ATTRIBUTE_ASSIGNMENT__NAME_ATTRIBUTE:
				setNameAttribute((Attribute)newValue);
				return;
			case MiningDataPackage.PIVOT_ATTRIBUTE_ASSIGNMENT__VALUE_ATTRIBUTE:
				setValueAttribute((Attribute)newValue);
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
			case MiningDataPackage.PIVOT_ATTRIBUTE_ASSIGNMENT__SET_ID_ATTRIBUTE:
				setSetIdAttribute((Attribute)null);
				return;
			case MiningDataPackage.PIVOT_ATTRIBUTE_ASSIGNMENT__NAME_ATTRIBUTE:
				setNameAttribute((Attribute)null);
				return;
			case MiningDataPackage.PIVOT_ATTRIBUTE_ASSIGNMENT__VALUE_ATTRIBUTE:
				setValueAttribute((Attribute)null);
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
			case MiningDataPackage.PIVOT_ATTRIBUTE_ASSIGNMENT__SET_ID_ATTRIBUTE:
				return setIdAttribute != null;
			case MiningDataPackage.PIVOT_ATTRIBUTE_ASSIGNMENT__NAME_ATTRIBUTE:
				return nameAttribute != null;
			case MiningDataPackage.PIVOT_ATTRIBUTE_ASSIGNMENT__VALUE_ATTRIBUTE:
				return valueAttribute != null;
		}
		return super.eIsSet(featureID);
	}

} //PivotAttributeAssignmentImpl

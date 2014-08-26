/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningData.impl;

import CWM.MiningCore.MiningData.CategoricalAttributeProperties;
import CWM.MiningCore.MiningData.LogicalAttribute;
import CWM.MiningCore.MiningData.MiningDataPackage;
import CWM.MiningCore.MiningData.NumericalAttributeProperties;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.MiningCore.MiningData.impl.LogicalAttributeImpl#getIsSetValued <em>Is Set Valued</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.impl.LogicalAttributeImpl#getCategoricalProperties <em>Categorical Properties</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.impl.LogicalAttributeImpl#getNumericalProperties <em>Numerical Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LogicalAttributeImpl extends MiningAttributeImpl implements LogicalAttribute {
	/**
	 * The default value of the '{@link #getIsSetValued() <em>Is Set Valued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSetValued()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_SET_VALUED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsSetValued() <em>Is Set Valued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSetValued()
	 * @generated
	 * @ordered
	 */
	protected Boolean isSetValued = IS_SET_VALUED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCategoricalProperties() <em>Categorical Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoricalProperties()
	 * @generated
	 * @ordered
	 */
	protected CategoricalAttributeProperties categoricalProperties;

	/**
	 * The cached value of the '{@link #getNumericalProperties() <em>Numerical Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumericalProperties()
	 * @generated
	 * @ordered
	 */
	protected NumericalAttributeProperties numericalProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MiningDataPackage.Literals.LOGICAL_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsSetValued() {
		return isSetValued;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSetValued(Boolean newIsSetValued) {
		Boolean oldIsSetValued = isSetValued;
		isSetValued = newIsSetValued;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiningDataPackage.LOGICAL_ATTRIBUTE__IS_SET_VALUED, oldIsSetValued, isSetValued));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategoricalAttributeProperties getCategoricalProperties() {
		return categoricalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCategoricalProperties(CategoricalAttributeProperties newCategoricalProperties, NotificationChain msgs) {
		CategoricalAttributeProperties oldCategoricalProperties = categoricalProperties;
		categoricalProperties = newCategoricalProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MiningDataPackage.LOGICAL_ATTRIBUTE__CATEGORICAL_PROPERTIES, oldCategoricalProperties, newCategoricalProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategoricalProperties(CategoricalAttributeProperties newCategoricalProperties) {
		if (newCategoricalProperties != categoricalProperties) {
			NotificationChain msgs = null;
			if (categoricalProperties != null)
				msgs = ((InternalEObject)categoricalProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MiningDataPackage.LOGICAL_ATTRIBUTE__CATEGORICAL_PROPERTIES, null, msgs);
			if (newCategoricalProperties != null)
				msgs = ((InternalEObject)newCategoricalProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MiningDataPackage.LOGICAL_ATTRIBUTE__CATEGORICAL_PROPERTIES, null, msgs);
			msgs = basicSetCategoricalProperties(newCategoricalProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiningDataPackage.LOGICAL_ATTRIBUTE__CATEGORICAL_PROPERTIES, newCategoricalProperties, newCategoricalProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericalAttributeProperties getNumericalProperties() {
		return numericalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumericalProperties(NumericalAttributeProperties newNumericalProperties, NotificationChain msgs) {
		NumericalAttributeProperties oldNumericalProperties = numericalProperties;
		numericalProperties = newNumericalProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MiningDataPackage.LOGICAL_ATTRIBUTE__NUMERICAL_PROPERTIES, oldNumericalProperties, newNumericalProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumericalProperties(NumericalAttributeProperties newNumericalProperties) {
		if (newNumericalProperties != numericalProperties) {
			NotificationChain msgs = null;
			if (numericalProperties != null)
				msgs = ((InternalEObject)numericalProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MiningDataPackage.LOGICAL_ATTRIBUTE__NUMERICAL_PROPERTIES, null, msgs);
			if (newNumericalProperties != null)
				msgs = ((InternalEObject)newNumericalProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MiningDataPackage.LOGICAL_ATTRIBUTE__NUMERICAL_PROPERTIES, null, msgs);
			msgs = basicSetNumericalProperties(newNumericalProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiningDataPackage.LOGICAL_ATTRIBUTE__NUMERICAL_PROPERTIES, newNumericalProperties, newNumericalProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MiningDataPackage.LOGICAL_ATTRIBUTE__CATEGORICAL_PROPERTIES:
				return basicSetCategoricalProperties(null, msgs);
			case MiningDataPackage.LOGICAL_ATTRIBUTE__NUMERICAL_PROPERTIES:
				return basicSetNumericalProperties(null, msgs);
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
			case MiningDataPackage.LOGICAL_ATTRIBUTE__IS_SET_VALUED:
				return getIsSetValued();
			case MiningDataPackage.LOGICAL_ATTRIBUTE__CATEGORICAL_PROPERTIES:
				return getCategoricalProperties();
			case MiningDataPackage.LOGICAL_ATTRIBUTE__NUMERICAL_PROPERTIES:
				return getNumericalProperties();
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
			case MiningDataPackage.LOGICAL_ATTRIBUTE__IS_SET_VALUED:
				setIsSetValued((Boolean)newValue);
				return;
			case MiningDataPackage.LOGICAL_ATTRIBUTE__CATEGORICAL_PROPERTIES:
				setCategoricalProperties((CategoricalAttributeProperties)newValue);
				return;
			case MiningDataPackage.LOGICAL_ATTRIBUTE__NUMERICAL_PROPERTIES:
				setNumericalProperties((NumericalAttributeProperties)newValue);
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
			case MiningDataPackage.LOGICAL_ATTRIBUTE__IS_SET_VALUED:
				setIsSetValued(IS_SET_VALUED_EDEFAULT);
				return;
			case MiningDataPackage.LOGICAL_ATTRIBUTE__CATEGORICAL_PROPERTIES:
				setCategoricalProperties((CategoricalAttributeProperties)null);
				return;
			case MiningDataPackage.LOGICAL_ATTRIBUTE__NUMERICAL_PROPERTIES:
				setNumericalProperties((NumericalAttributeProperties)null);
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
			case MiningDataPackage.LOGICAL_ATTRIBUTE__IS_SET_VALUED:
				return IS_SET_VALUED_EDEFAULT == null ? isSetValued != null : !IS_SET_VALUED_EDEFAULT.equals(isSetValued);
			case MiningDataPackage.LOGICAL_ATTRIBUTE__CATEGORICAL_PROPERTIES:
				return categoricalProperties != null;
			case MiningDataPackage.LOGICAL_ATTRIBUTE__NUMERICAL_PROPERTIES:
				return numericalProperties != null;
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
		result.append(" (isSetValued: ");
		result.append(isSetValued);
		result.append(')');
		return result.toString();
	}

} //LogicalAttributeImpl

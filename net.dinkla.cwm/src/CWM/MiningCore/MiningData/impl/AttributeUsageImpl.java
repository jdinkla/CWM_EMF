/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningData.impl;

import CWM.Core.impl.FeatureImpl;

import CWM.MiningCore.MiningData.AttributeUsage;
import CWM.MiningCore.MiningData.LogicalAttribute;
import CWM.MiningCore.MiningData.MiningDataPackage;
import CWM.MiningCore.MiningData.UsageOption;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.MiningCore.MiningData.impl.AttributeUsageImpl#getUsage <em>Usage</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.impl.AttributeUsageImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.impl.AttributeUsageImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.impl.AttributeUsageImpl#getSuppressDiscretization <em>Suppress Discretization</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.impl.AttributeUsageImpl#getSuppressNormalization <em>Suppress Normalization</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeUsageImpl extends FeatureImpl implements AttributeUsage {
	/**
	 * The default value of the '{@link #getUsage() <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected static final UsageOption USAGE_EDEFAULT = UsageOption.ACTIVE;

	/**
	 * The cached value of the '{@link #getUsage() <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected UsageOption usage = USAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected static final Double WEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected Double weight = WEIGHT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalAttribute> attribute;

	/**
	 * The default value of the '{@link #getSuppressDiscretization() <em>Suppress Discretization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuppressDiscretization()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SUPPRESS_DISCRETIZATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSuppressDiscretization() <em>Suppress Discretization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuppressDiscretization()
	 * @generated
	 * @ordered
	 */
	protected Boolean suppressDiscretization = SUPPRESS_DISCRETIZATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSuppressNormalization() <em>Suppress Normalization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuppressNormalization()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SUPPRESS_NORMALIZATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSuppressNormalization() <em>Suppress Normalization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuppressNormalization()
	 * @generated
	 * @ordered
	 */
	protected Boolean suppressNormalization = SUPPRESS_NORMALIZATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MiningDataPackage.Literals.ATTRIBUTE_USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageOption getUsage() {
		return usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsage(UsageOption newUsage) {
		UsageOption oldUsage = usage;
		usage = newUsage == null ? USAGE_EDEFAULT : newUsage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiningDataPackage.ATTRIBUTE_USAGE__USAGE, oldUsage, usage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeight(Double newWeight) {
		Double oldWeight = weight;
		weight = newWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiningDataPackage.ATTRIBUTE_USAGE__WEIGHT, oldWeight, weight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogicalAttribute> getAttribute() {
		if (attribute == null) {
			attribute = new EObjectResolvingEList<LogicalAttribute>(LogicalAttribute.class, this, MiningDataPackage.ATTRIBUTE_USAGE__ATTRIBUTE);
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getSuppressDiscretization() {
		return suppressDiscretization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuppressDiscretization(Boolean newSuppressDiscretization) {
		Boolean oldSuppressDiscretization = suppressDiscretization;
		suppressDiscretization = newSuppressDiscretization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiningDataPackage.ATTRIBUTE_USAGE__SUPPRESS_DISCRETIZATION, oldSuppressDiscretization, suppressDiscretization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getSuppressNormalization() {
		return suppressNormalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuppressNormalization(Boolean newSuppressNormalization) {
		Boolean oldSuppressNormalization = suppressNormalization;
		suppressNormalization = newSuppressNormalization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiningDataPackage.ATTRIBUTE_USAGE__SUPPRESS_NORMALIZATION, oldSuppressNormalization, suppressNormalization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MiningDataPackage.ATTRIBUTE_USAGE__USAGE:
				return getUsage();
			case MiningDataPackage.ATTRIBUTE_USAGE__WEIGHT:
				return getWeight();
			case MiningDataPackage.ATTRIBUTE_USAGE__ATTRIBUTE:
				return getAttribute();
			case MiningDataPackage.ATTRIBUTE_USAGE__SUPPRESS_DISCRETIZATION:
				return getSuppressDiscretization();
			case MiningDataPackage.ATTRIBUTE_USAGE__SUPPRESS_NORMALIZATION:
				return getSuppressNormalization();
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
			case MiningDataPackage.ATTRIBUTE_USAGE__USAGE:
				setUsage((UsageOption)newValue);
				return;
			case MiningDataPackage.ATTRIBUTE_USAGE__WEIGHT:
				setWeight((Double)newValue);
				return;
			case MiningDataPackage.ATTRIBUTE_USAGE__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection<? extends LogicalAttribute>)newValue);
				return;
			case MiningDataPackage.ATTRIBUTE_USAGE__SUPPRESS_DISCRETIZATION:
				setSuppressDiscretization((Boolean)newValue);
				return;
			case MiningDataPackage.ATTRIBUTE_USAGE__SUPPRESS_NORMALIZATION:
				setSuppressNormalization((Boolean)newValue);
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
			case MiningDataPackage.ATTRIBUTE_USAGE__USAGE:
				setUsage(USAGE_EDEFAULT);
				return;
			case MiningDataPackage.ATTRIBUTE_USAGE__WEIGHT:
				setWeight(WEIGHT_EDEFAULT);
				return;
			case MiningDataPackage.ATTRIBUTE_USAGE__ATTRIBUTE:
				getAttribute().clear();
				return;
			case MiningDataPackage.ATTRIBUTE_USAGE__SUPPRESS_DISCRETIZATION:
				setSuppressDiscretization(SUPPRESS_DISCRETIZATION_EDEFAULT);
				return;
			case MiningDataPackage.ATTRIBUTE_USAGE__SUPPRESS_NORMALIZATION:
				setSuppressNormalization(SUPPRESS_NORMALIZATION_EDEFAULT);
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
			case MiningDataPackage.ATTRIBUTE_USAGE__USAGE:
				return usage != USAGE_EDEFAULT;
			case MiningDataPackage.ATTRIBUTE_USAGE__WEIGHT:
				return WEIGHT_EDEFAULT == null ? weight != null : !WEIGHT_EDEFAULT.equals(weight);
			case MiningDataPackage.ATTRIBUTE_USAGE__ATTRIBUTE:
				return attribute != null && !attribute.isEmpty();
			case MiningDataPackage.ATTRIBUTE_USAGE__SUPPRESS_DISCRETIZATION:
				return SUPPRESS_DISCRETIZATION_EDEFAULT == null ? suppressDiscretization != null : !SUPPRESS_DISCRETIZATION_EDEFAULT.equals(suppressDiscretization);
			case MiningDataPackage.ATTRIBUTE_USAGE__SUPPRESS_NORMALIZATION:
				return SUPPRESS_NORMALIZATION_EDEFAULT == null ? suppressNormalization != null : !SUPPRESS_NORMALIZATION_EDEFAULT.equals(suppressNormalization);
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
		result.append(" (usage: ");
		result.append(usage);
		result.append(", weight: ");
		result.append(weight);
		result.append(", suppressDiscretization: ");
		result.append(suppressDiscretization);
		result.append(", suppressNormalization: ");
		result.append(suppressNormalization);
		result.append(')');
		return result.toString();
	}

} //AttributeUsageImpl

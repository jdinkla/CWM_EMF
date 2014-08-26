/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningModel.impl;

import CWM.MiningCore.MiningData.UsageOption;

import CWM.MiningCore.MiningData.impl.MiningAttributeImpl;

import CWM.MiningCore.MiningModel.MiningModelPackage;
import CWM.MiningCore.MiningModel.SignatureAttribute;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signature Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.MiningCore.MiningModel.impl.SignatureAttributeImpl#getUsageOption <em>Usage Option</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SignatureAttributeImpl extends MiningAttributeImpl implements SignatureAttribute {
	/**
	 * The default value of the '{@link #getUsageOption() <em>Usage Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageOption()
	 * @generated
	 * @ordered
	 */
	protected static final UsageOption USAGE_OPTION_EDEFAULT = UsageOption.ACTIVE;

	/**
	 * The cached value of the '{@link #getUsageOption() <em>Usage Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageOption()
	 * @generated
	 * @ordered
	 */
	protected UsageOption usageOption = USAGE_OPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignatureAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MiningModelPackage.Literals.SIGNATURE_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageOption getUsageOption() {
		return usageOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsageOption(UsageOption newUsageOption) {
		UsageOption oldUsageOption = usageOption;
		usageOption = newUsageOption == null ? USAGE_OPTION_EDEFAULT : newUsageOption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiningModelPackage.SIGNATURE_ATTRIBUTE__USAGE_OPTION, oldUsageOption, usageOption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MiningModelPackage.SIGNATURE_ATTRIBUTE__USAGE_OPTION:
				return getUsageOption();
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
			case MiningModelPackage.SIGNATURE_ATTRIBUTE__USAGE_OPTION:
				setUsageOption((UsageOption)newValue);
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
			case MiningModelPackage.SIGNATURE_ATTRIBUTE__USAGE_OPTION:
				setUsageOption(USAGE_OPTION_EDEFAULT);
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
			case MiningModelPackage.SIGNATURE_ATTRIBUTE__USAGE_OPTION:
				return usageOption != USAGE_OPTION_EDEFAULT;
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
		result.append(" (usageOption: ");
		result.append(usageOption);
		result.append(')');
		return result.toString();
	}

} //SignatureAttributeImpl

/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.AssociationRules.impl;

import CWM.AssociationRules.AssociationRulesFunctionSettings;
import CWM.AssociationRules.AssociationRulesPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.AssociationRules.impl.AssociationRulesFunctionSettingsImpl#getMinimumConfidence <em>Minimum Confidence</em>}</li>
 *   <li>{@link CWM.AssociationRules.impl.AssociationRulesFunctionSettingsImpl#getMaximumRuleLength <em>Maximum Rule Length</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssociationRulesFunctionSettingsImpl extends FrequentItemSetFunctionSettingsImpl implements AssociationRulesFunctionSettings {
	/**
	 * The default value of the '{@link #getMinimumConfidence() <em>Minimum Confidence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumConfidence()
	 * @generated
	 * @ordered
	 */
	protected static final Double MINIMUM_CONFIDENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinimumConfidence() <em>Minimum Confidence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumConfidence()
	 * @generated
	 * @ordered
	 */
	protected Double minimumConfidence = MINIMUM_CONFIDENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumRuleLength() <em>Maximum Rule Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumRuleLength()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAXIMUM_RULE_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaximumRuleLength() <em>Maximum Rule Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumRuleLength()
	 * @generated
	 * @ordered
	 */
	protected Integer maximumRuleLength = MAXIMUM_RULE_LENGTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationRulesFunctionSettingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssociationRulesPackage.Literals.ASSOCIATION_RULES_FUNCTION_SETTINGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMinimumConfidence() {
		return minimumConfidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumConfidence(Double newMinimumConfidence) {
		Double oldMinimumConfidence = minimumConfidence;
		minimumConfidence = newMinimumConfidence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssociationRulesPackage.ASSOCIATION_RULES_FUNCTION_SETTINGS__MINIMUM_CONFIDENCE, oldMinimumConfidence, minimumConfidence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMaximumRuleLength() {
		return maximumRuleLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumRuleLength(Integer newMaximumRuleLength) {
		Integer oldMaximumRuleLength = maximumRuleLength;
		maximumRuleLength = newMaximumRuleLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssociationRulesPackage.ASSOCIATION_RULES_FUNCTION_SETTINGS__MAXIMUM_RULE_LENGTH, oldMaximumRuleLength, maximumRuleLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AssociationRulesPackage.ASSOCIATION_RULES_FUNCTION_SETTINGS__MINIMUM_CONFIDENCE:
				return getMinimumConfidence();
			case AssociationRulesPackage.ASSOCIATION_RULES_FUNCTION_SETTINGS__MAXIMUM_RULE_LENGTH:
				return getMaximumRuleLength();
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
			case AssociationRulesPackage.ASSOCIATION_RULES_FUNCTION_SETTINGS__MINIMUM_CONFIDENCE:
				setMinimumConfidence((Double)newValue);
				return;
			case AssociationRulesPackage.ASSOCIATION_RULES_FUNCTION_SETTINGS__MAXIMUM_RULE_LENGTH:
				setMaximumRuleLength((Integer)newValue);
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
			case AssociationRulesPackage.ASSOCIATION_RULES_FUNCTION_SETTINGS__MINIMUM_CONFIDENCE:
				setMinimumConfidence(MINIMUM_CONFIDENCE_EDEFAULT);
				return;
			case AssociationRulesPackage.ASSOCIATION_RULES_FUNCTION_SETTINGS__MAXIMUM_RULE_LENGTH:
				setMaximumRuleLength(MAXIMUM_RULE_LENGTH_EDEFAULT);
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
			case AssociationRulesPackage.ASSOCIATION_RULES_FUNCTION_SETTINGS__MINIMUM_CONFIDENCE:
				return MINIMUM_CONFIDENCE_EDEFAULT == null ? minimumConfidence != null : !MINIMUM_CONFIDENCE_EDEFAULT.equals(minimumConfidence);
			case AssociationRulesPackage.ASSOCIATION_RULES_FUNCTION_SETTINGS__MAXIMUM_RULE_LENGTH:
				return MAXIMUM_RULE_LENGTH_EDEFAULT == null ? maximumRuleLength != null : !MAXIMUM_RULE_LENGTH_EDEFAULT.equals(maximumRuleLength);
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
		result.append(" (minimumConfidence: ");
		result.append(minimumConfidence);
		result.append(", maximumRuleLength: ");
		result.append(maximumRuleLength);
		result.append(')');
		return result.toString();
	}

} //AssociationRulesFunctionSettingsImpl

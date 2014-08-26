/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.AssociationRules.impl;

import CWM.AssociationRules.AssociationRulesPackage;
import CWM.AssociationRules.FrequentItemSetFunctionSettings;

import CWM.MiningCore.MiningData.Category;

import CWM.MiningCore.MiningFunctionSettings.impl.MiningFunctionSettingsImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Frequent Item Set Function Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.AssociationRules.impl.FrequentItemSetFunctionSettingsImpl#getMinimumSupport <em>Minimum Support</em>}</li>
 *   <li>{@link CWM.AssociationRules.impl.FrequentItemSetFunctionSettingsImpl#getExclusion <em>Exclusion</em>}</li>
 *   <li>{@link CWM.AssociationRules.impl.FrequentItemSetFunctionSettingsImpl#getMaximumSetSize <em>Maximum Set Size</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FrequentItemSetFunctionSettingsImpl extends MiningFunctionSettingsImpl implements FrequentItemSetFunctionSettings {
	/**
	 * The default value of the '{@link #getMinimumSupport() <em>Minimum Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumSupport()
	 * @generated
	 * @ordered
	 */
	protected static final Double MINIMUM_SUPPORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinimumSupport() <em>Minimum Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumSupport()
	 * @generated
	 * @ordered
	 */
	protected Double minimumSupport = MINIMUM_SUPPORT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExclusion() <em>Exclusion</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclusion()
	 * @generated
	 * @ordered
	 */
	protected EList<Category> exclusion;

	/**
	 * The default value of the '{@link #getMaximumSetSize() <em>Maximum Set Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumSetSize()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAXIMUM_SET_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaximumSetSize() <em>Maximum Set Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumSetSize()
	 * @generated
	 * @ordered
	 */
	protected Integer maximumSetSize = MAXIMUM_SET_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FrequentItemSetFunctionSettingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssociationRulesPackage.Literals.FREQUENT_ITEM_SET_FUNCTION_SETTINGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMinimumSupport() {
		return minimumSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumSupport(Double newMinimumSupport) {
		Double oldMinimumSupport = minimumSupport;
		minimumSupport = newMinimumSupport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssociationRulesPackage.FREQUENT_ITEM_SET_FUNCTION_SETTINGS__MINIMUM_SUPPORT, oldMinimumSupport, minimumSupport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Category> getExclusion() {
		if (exclusion == null) {
			exclusion = new EObjectResolvingEList<Category>(Category.class, this, AssociationRulesPackage.FREQUENT_ITEM_SET_FUNCTION_SETTINGS__EXCLUSION);
		}
		return exclusion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMaximumSetSize() {
		return maximumSetSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumSetSize(Integer newMaximumSetSize) {
		Integer oldMaximumSetSize = maximumSetSize;
		maximumSetSize = newMaximumSetSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssociationRulesPackage.FREQUENT_ITEM_SET_FUNCTION_SETTINGS__MAXIMUM_SET_SIZE, oldMaximumSetSize, maximumSetSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AssociationRulesPackage.FREQUENT_ITEM_SET_FUNCTION_SETTINGS__MINIMUM_SUPPORT:
				return getMinimumSupport();
			case AssociationRulesPackage.FREQUENT_ITEM_SET_FUNCTION_SETTINGS__EXCLUSION:
				return getExclusion();
			case AssociationRulesPackage.FREQUENT_ITEM_SET_FUNCTION_SETTINGS__MAXIMUM_SET_SIZE:
				return getMaximumSetSize();
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
			case AssociationRulesPackage.FREQUENT_ITEM_SET_FUNCTION_SETTINGS__MINIMUM_SUPPORT:
				setMinimumSupport((Double)newValue);
				return;
			case AssociationRulesPackage.FREQUENT_ITEM_SET_FUNCTION_SETTINGS__EXCLUSION:
				getExclusion().clear();
				getExclusion().addAll((Collection<? extends Category>)newValue);
				return;
			case AssociationRulesPackage.FREQUENT_ITEM_SET_FUNCTION_SETTINGS__MAXIMUM_SET_SIZE:
				setMaximumSetSize((Integer)newValue);
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
			case AssociationRulesPackage.FREQUENT_ITEM_SET_FUNCTION_SETTINGS__MINIMUM_SUPPORT:
				setMinimumSupport(MINIMUM_SUPPORT_EDEFAULT);
				return;
			case AssociationRulesPackage.FREQUENT_ITEM_SET_FUNCTION_SETTINGS__EXCLUSION:
				getExclusion().clear();
				return;
			case AssociationRulesPackage.FREQUENT_ITEM_SET_FUNCTION_SETTINGS__MAXIMUM_SET_SIZE:
				setMaximumSetSize(MAXIMUM_SET_SIZE_EDEFAULT);
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
			case AssociationRulesPackage.FREQUENT_ITEM_SET_FUNCTION_SETTINGS__MINIMUM_SUPPORT:
				return MINIMUM_SUPPORT_EDEFAULT == null ? minimumSupport != null : !MINIMUM_SUPPORT_EDEFAULT.equals(minimumSupport);
			case AssociationRulesPackage.FREQUENT_ITEM_SET_FUNCTION_SETTINGS__EXCLUSION:
				return exclusion != null && !exclusion.isEmpty();
			case AssociationRulesPackage.FREQUENT_ITEM_SET_FUNCTION_SETTINGS__MAXIMUM_SET_SIZE:
				return MAXIMUM_SET_SIZE_EDEFAULT == null ? maximumSetSize != null : !MAXIMUM_SET_SIZE_EDEFAULT.equals(maximumSetSize);
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
		result.append(" (minimumSupport: ");
		result.append(minimumSupport);
		result.append(", maximumSetSize: ");
		result.append(maximumSetSize);
		result.append(')');
		return result.toString();
	}

} //FrequentItemSetFunctionSettingsImpl

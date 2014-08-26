/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.AssociationRules.impl;

import CWM.AssociationRules.AssociationRulesFunctionSettings;
import CWM.AssociationRules.AssociationRulesPackage;
import CWM.AssociationRules.AssociationRules_container;
import CWM.AssociationRules.FrequentItemSetFunctionSettings;
import CWM.AssociationRules.SequenceFunctionSettings;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association Rules container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.AssociationRules.impl.AssociationRules_containerImpl#getAssociationRulesFunctionSettings <em>Association Rules Function Settings</em>}</li>
 *   <li>{@link CWM.AssociationRules.impl.AssociationRules_containerImpl#getFrequentItemSetFunctionSettings <em>Frequent Item Set Function Settings</em>}</li>
 *   <li>{@link CWM.AssociationRules.impl.AssociationRules_containerImpl#getSequenceFunctionSettings <em>Sequence Function Settings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssociationRules_containerImpl extends EObjectImpl implements AssociationRules_container {
	/**
	 * The cached value of the '{@link #getAssociationRulesFunctionSettings() <em>Association Rules Function Settings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationRulesFunctionSettings()
	 * @generated
	 * @ordered
	 */
	protected EList<AssociationRulesFunctionSettings> associationRulesFunctionSettings;

	/**
	 * The cached value of the '{@link #getFrequentItemSetFunctionSettings() <em>Frequent Item Set Function Settings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequentItemSetFunctionSettings()
	 * @generated
	 * @ordered
	 */
	protected EList<FrequentItemSetFunctionSettings> frequentItemSetFunctionSettings;

	/**
	 * The cached value of the '{@link #getSequenceFunctionSettings() <em>Sequence Function Settings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceFunctionSettings()
	 * @generated
	 * @ordered
	 */
	protected EList<SequenceFunctionSettings> sequenceFunctionSettings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationRules_containerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssociationRulesPackage.Literals.ASSOCIATION_RULES_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssociationRulesFunctionSettings> getAssociationRulesFunctionSettings() {
		if (associationRulesFunctionSettings == null) {
			associationRulesFunctionSettings = new EObjectContainmentEList<AssociationRulesFunctionSettings>(AssociationRulesFunctionSettings.class, this, AssociationRulesPackage.ASSOCIATION_RULES_CONTAINER__ASSOCIATION_RULES_FUNCTION_SETTINGS);
		}
		return associationRulesFunctionSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FrequentItemSetFunctionSettings> getFrequentItemSetFunctionSettings() {
		if (frequentItemSetFunctionSettings == null) {
			frequentItemSetFunctionSettings = new EObjectContainmentEList<FrequentItemSetFunctionSettings>(FrequentItemSetFunctionSettings.class, this, AssociationRulesPackage.ASSOCIATION_RULES_CONTAINER__FREQUENT_ITEM_SET_FUNCTION_SETTINGS);
		}
		return frequentItemSetFunctionSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SequenceFunctionSettings> getSequenceFunctionSettings() {
		if (sequenceFunctionSettings == null) {
			sequenceFunctionSettings = new EObjectContainmentEList<SequenceFunctionSettings>(SequenceFunctionSettings.class, this, AssociationRulesPackage.ASSOCIATION_RULES_CONTAINER__SEQUENCE_FUNCTION_SETTINGS);
		}
		return sequenceFunctionSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssociationRulesPackage.ASSOCIATION_RULES_CONTAINER__ASSOCIATION_RULES_FUNCTION_SETTINGS:
				return ((InternalEList<?>)getAssociationRulesFunctionSettings()).basicRemove(otherEnd, msgs);
			case AssociationRulesPackage.ASSOCIATION_RULES_CONTAINER__FREQUENT_ITEM_SET_FUNCTION_SETTINGS:
				return ((InternalEList<?>)getFrequentItemSetFunctionSettings()).basicRemove(otherEnd, msgs);
			case AssociationRulesPackage.ASSOCIATION_RULES_CONTAINER__SEQUENCE_FUNCTION_SETTINGS:
				return ((InternalEList<?>)getSequenceFunctionSettings()).basicRemove(otherEnd, msgs);
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
			case AssociationRulesPackage.ASSOCIATION_RULES_CONTAINER__ASSOCIATION_RULES_FUNCTION_SETTINGS:
				return getAssociationRulesFunctionSettings();
			case AssociationRulesPackage.ASSOCIATION_RULES_CONTAINER__FREQUENT_ITEM_SET_FUNCTION_SETTINGS:
				return getFrequentItemSetFunctionSettings();
			case AssociationRulesPackage.ASSOCIATION_RULES_CONTAINER__SEQUENCE_FUNCTION_SETTINGS:
				return getSequenceFunctionSettings();
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
			case AssociationRulesPackage.ASSOCIATION_RULES_CONTAINER__ASSOCIATION_RULES_FUNCTION_SETTINGS:
				getAssociationRulesFunctionSettings().clear();
				getAssociationRulesFunctionSettings().addAll((Collection<? extends AssociationRulesFunctionSettings>)newValue);
				return;
			case AssociationRulesPackage.ASSOCIATION_RULES_CONTAINER__FREQUENT_ITEM_SET_FUNCTION_SETTINGS:
				getFrequentItemSetFunctionSettings().clear();
				getFrequentItemSetFunctionSettings().addAll((Collection<? extends FrequentItemSetFunctionSettings>)newValue);
				return;
			case AssociationRulesPackage.ASSOCIATION_RULES_CONTAINER__SEQUENCE_FUNCTION_SETTINGS:
				getSequenceFunctionSettings().clear();
				getSequenceFunctionSettings().addAll((Collection<? extends SequenceFunctionSettings>)newValue);
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
			case AssociationRulesPackage.ASSOCIATION_RULES_CONTAINER__ASSOCIATION_RULES_FUNCTION_SETTINGS:
				getAssociationRulesFunctionSettings().clear();
				return;
			case AssociationRulesPackage.ASSOCIATION_RULES_CONTAINER__FREQUENT_ITEM_SET_FUNCTION_SETTINGS:
				getFrequentItemSetFunctionSettings().clear();
				return;
			case AssociationRulesPackage.ASSOCIATION_RULES_CONTAINER__SEQUENCE_FUNCTION_SETTINGS:
				getSequenceFunctionSettings().clear();
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
			case AssociationRulesPackage.ASSOCIATION_RULES_CONTAINER__ASSOCIATION_RULES_FUNCTION_SETTINGS:
				return associationRulesFunctionSettings != null && !associationRulesFunctionSettings.isEmpty();
			case AssociationRulesPackage.ASSOCIATION_RULES_CONTAINER__FREQUENT_ITEM_SET_FUNCTION_SETTINGS:
				return frequentItemSetFunctionSettings != null && !frequentItemSetFunctionSettings.isEmpty();
			case AssociationRulesPackage.ASSOCIATION_RULES_CONTAINER__SEQUENCE_FUNCTION_SETTINGS:
				return sequenceFunctionSettings != null && !sequenceFunctionSettings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AssociationRules_containerImpl

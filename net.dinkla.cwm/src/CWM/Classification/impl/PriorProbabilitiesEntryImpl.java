/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Classification.impl;

import CWM.Classification.ClassificationPackage;
import CWM.Classification.PriorProbabilitiesEntry;

import CWM.Core.impl.ModelElementImpl;

import CWM.MiningCore.MiningData.Category;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prior Probabilities Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.Classification.impl.PriorProbabilitiesEntryImpl#getTargetValue <em>Target Value</em>}</li>
 *   <li>{@link CWM.Classification.impl.PriorProbabilitiesEntryImpl#getPriorProbability <em>Prior Probability</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PriorProbabilitiesEntryImpl extends ModelElementImpl implements PriorProbabilitiesEntry {
	/**
	 * The cached value of the '{@link #getTargetValue() <em>Target Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetValue()
	 * @generated
	 * @ordered
	 */
	protected Category targetValue;

	/**
	 * The default value of the '{@link #getPriorProbability() <em>Prior Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorProbability()
	 * @generated
	 * @ordered
	 */
	protected static final Double PRIOR_PROBABILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPriorProbability() <em>Prior Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorProbability()
	 * @generated
	 * @ordered
	 */
	protected Double priorProbability = PRIOR_PROBABILITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PriorProbabilitiesEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassificationPackage.Literals.PRIOR_PROBABILITIES_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category getTargetValue() {
		if (targetValue != null && targetValue.eIsProxy()) {
			InternalEObject oldTargetValue = (InternalEObject)targetValue;
			targetValue = (Category)eResolveProxy(oldTargetValue);
			if (targetValue != oldTargetValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassificationPackage.PRIOR_PROBABILITIES_ENTRY__TARGET_VALUE, oldTargetValue, targetValue));
			}
		}
		return targetValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category basicGetTargetValue() {
		return targetValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetValue(Category newTargetValue) {
		Category oldTargetValue = targetValue;
		targetValue = newTargetValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassificationPackage.PRIOR_PROBABILITIES_ENTRY__TARGET_VALUE, oldTargetValue, targetValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getPriorProbability() {
		return priorProbability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriorProbability(Double newPriorProbability) {
		Double oldPriorProbability = priorProbability;
		priorProbability = newPriorProbability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassificationPackage.PRIOR_PROBABILITIES_ENTRY__PRIOR_PROBABILITY, oldPriorProbability, priorProbability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassificationPackage.PRIOR_PROBABILITIES_ENTRY__TARGET_VALUE:
				if (resolve) return getTargetValue();
				return basicGetTargetValue();
			case ClassificationPackage.PRIOR_PROBABILITIES_ENTRY__PRIOR_PROBABILITY:
				return getPriorProbability();
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
			case ClassificationPackage.PRIOR_PROBABILITIES_ENTRY__TARGET_VALUE:
				setTargetValue((Category)newValue);
				return;
			case ClassificationPackage.PRIOR_PROBABILITIES_ENTRY__PRIOR_PROBABILITY:
				setPriorProbability((Double)newValue);
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
			case ClassificationPackage.PRIOR_PROBABILITIES_ENTRY__TARGET_VALUE:
				setTargetValue((Category)null);
				return;
			case ClassificationPackage.PRIOR_PROBABILITIES_ENTRY__PRIOR_PROBABILITY:
				setPriorProbability(PRIOR_PROBABILITY_EDEFAULT);
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
			case ClassificationPackage.PRIOR_PROBABILITIES_ENTRY__TARGET_VALUE:
				return targetValue != null;
			case ClassificationPackage.PRIOR_PROBABILITIES_ENTRY__PRIOR_PROBABILITY:
				return PRIOR_PROBABILITY_EDEFAULT == null ? priorProbability != null : !PRIOR_PROBABILITY_EDEFAULT.equals(priorProbability);
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
		result.append(" (priorProbability: ");
		result.append(priorProbability);
		result.append(')');
		return result.toString();
	}

} //PriorProbabilitiesEntryImpl

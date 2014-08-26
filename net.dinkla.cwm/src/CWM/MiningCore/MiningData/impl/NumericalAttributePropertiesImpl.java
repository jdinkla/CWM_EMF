/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningData.impl;

import CWM.Core.impl.ModelElementImpl;

import CWM.MiningCore.MiningData.MiningDataPackage;
import CWM.MiningCore.MiningData.NumericalAttributeProperties;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Numerical Attribute Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.MiningCore.MiningData.impl.NumericalAttributePropertiesImpl#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.impl.NumericalAttributePropertiesImpl#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.impl.NumericalAttributePropertiesImpl#getIsDiscrete <em>Is Discrete</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.impl.NumericalAttributePropertiesImpl#getIsCyclic <em>Is Cyclic</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.impl.NumericalAttributePropertiesImpl#getAnchor <em>Anchor</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.impl.NumericalAttributePropertiesImpl#getCycleBegin <em>Cycle Begin</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.impl.NumericalAttributePropertiesImpl#getCycleEnd <em>Cycle End</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.impl.NumericalAttributePropertiesImpl#getDiscreteStepSize <em>Discrete Step Size</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NumericalAttributePropertiesImpl extends ModelElementImpl implements NumericalAttributeProperties {
	/**
	 * The default value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected static final Double LOWER_BOUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected Double lowerBound = LOWER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected static final Double UPPER_BOUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected Double upperBound = UPPER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsDiscrete() <em>Is Discrete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDiscrete()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_DISCRETE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsDiscrete() <em>Is Discrete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDiscrete()
	 * @generated
	 * @ordered
	 */
	protected Boolean isDiscrete = IS_DISCRETE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsCyclic() <em>Is Cyclic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsCyclic()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_CYCLIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsCyclic() <em>Is Cyclic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsCyclic()
	 * @generated
	 * @ordered
	 */
	protected Boolean isCyclic = IS_CYCLIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getAnchor() <em>Anchor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnchor()
	 * @generated
	 * @ordered
	 */
	protected static final Double ANCHOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnchor() <em>Anchor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnchor()
	 * @generated
	 * @ordered
	 */
	protected Double anchor = ANCHOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getCycleBegin() <em>Cycle Begin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCycleBegin()
	 * @generated
	 * @ordered
	 */
	protected static final Double CYCLE_BEGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCycleBegin() <em>Cycle Begin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCycleBegin()
	 * @generated
	 * @ordered
	 */
	protected Double cycleBegin = CYCLE_BEGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getCycleEnd() <em>Cycle End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCycleEnd()
	 * @generated
	 * @ordered
	 */
	protected static final Double CYCLE_END_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCycleEnd() <em>Cycle End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCycleEnd()
	 * @generated
	 * @ordered
	 */
	protected Double cycleEnd = CYCLE_END_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiscreteStepSize() <em>Discrete Step Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscreteStepSize()
	 * @generated
	 * @ordered
	 */
	protected static final Double DISCRETE_STEP_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiscreteStepSize() <em>Discrete Step Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscreteStepSize()
	 * @generated
	 * @ordered
	 */
	protected Double discreteStepSize = DISCRETE_STEP_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumericalAttributePropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MiningDataPackage.Literals.NUMERICAL_ATTRIBUTE_PROPERTIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getLowerBound() {
		return lowerBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerBound(Double newLowerBound) {
		Double oldLowerBound = lowerBound;
		lowerBound = newLowerBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiningDataPackage.NUMERICAL_ATTRIBUTE_PROPERTIES__LOWER_BOUND, oldLowerBound, lowerBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getUpperBound() {
		return upperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperBound(Double newUpperBound) {
		Double oldUpperBound = upperBound;
		upperBound = newUpperBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiningDataPackage.NUMERICAL_ATTRIBUTE_PROPERTIES__UPPER_BOUND, oldUpperBound, upperBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsDiscrete() {
		return isDiscrete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDiscrete(Boolean newIsDiscrete) {
		Boolean oldIsDiscrete = isDiscrete;
		isDiscrete = newIsDiscrete;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiningDataPackage.NUMERICAL_ATTRIBUTE_PROPERTIES__IS_DISCRETE, oldIsDiscrete, isDiscrete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsCyclic() {
		return isCyclic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCyclic(Boolean newIsCyclic) {
		Boolean oldIsCyclic = isCyclic;
		isCyclic = newIsCyclic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiningDataPackage.NUMERICAL_ATTRIBUTE_PROPERTIES__IS_CYCLIC, oldIsCyclic, isCyclic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getAnchor() {
		return anchor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnchor(Double newAnchor) {
		Double oldAnchor = anchor;
		anchor = newAnchor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiningDataPackage.NUMERICAL_ATTRIBUTE_PROPERTIES__ANCHOR, oldAnchor, anchor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getCycleBegin() {
		return cycleBegin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCycleBegin(Double newCycleBegin) {
		Double oldCycleBegin = cycleBegin;
		cycleBegin = newCycleBegin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiningDataPackage.NUMERICAL_ATTRIBUTE_PROPERTIES__CYCLE_BEGIN, oldCycleBegin, cycleBegin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getCycleEnd() {
		return cycleEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCycleEnd(Double newCycleEnd) {
		Double oldCycleEnd = cycleEnd;
		cycleEnd = newCycleEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiningDataPackage.NUMERICAL_ATTRIBUTE_PROPERTIES__CYCLE_END, oldCycleEnd, cycleEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getDiscreteStepSize() {
		return discreteStepSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscreteStepSize(Double newDiscreteStepSize) {
		Double oldDiscreteStepSize = discreteStepSize;
		discreteStepSize = newDiscreteStepSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiningDataPackage.NUMERICAL_ATTRIBUTE_PROPERTIES__DISCRETE_STEP_SIZE, oldDiscreteStepSize, discreteStepSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MiningDataPackage.NUMERICAL_ATTRIBUTE_PROPERTIES__LOWER_BOUND:
				return getLowerBound();
			case MiningDataPackage.NUMERICAL_ATTRIBUTE_PROPERTIES__UPPER_BOUND:
				return getUpperBound();
			case MiningDataPackage.NUMERICAL_ATTRIBUTE_PROPERTIES__IS_DISCRETE:
				return getIsDiscrete();
			case MiningDataPackage.NUMERICAL_ATTRIBUTE_PROPERTIES__IS_CYCLIC:
				return getIsCyclic();
			case MiningDataPackage.NUMERICAL_ATTRIBUTE_PROPERTIES__ANCHOR:
				return getAnchor();
			case MiningDataPackage.NUMERICAL_ATTRIBUTE_PROPERTIES__CYCLE_BEGIN:
				return getCycleBegin();
			case MiningDataPackage.NUMERICAL_ATTRIBUTE_PROPERTIES__CYCLE_END:
				return getCycleEnd();
			case MiningDataPackage.NUMERICAL_ATTRIBUTE_PROPERTIES__DISCRETE_STEP_SIZE:
				return getDiscreteStepSize();
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
			case MiningDataPackage.NUMERICAL_ATTRIBUTE_PROPERTIES__LOWER_BOUND:
				setLowerBound((Double)newValue);
				return;
			case MiningDataPackage.NUMERICAL_ATTRIBUTE_PROPERTIES__UPPER_BOUND:
				setUpperBound((Double)newValue);
				return;
			case MiningDataPackage.NUMERICAL_ATTRIBUTE_PROPERTIES__IS_DISCRETE:
				setIsDiscrete((Boolean)newValue);
				return;
			case MiningDataPackage.NUMERICAL_ATTRIBUTE_PROPERTIES__IS_CYCLIC:
				setIsCyclic((Boolean)newValue);
				return;
			case MiningDataPackage.NUMERICAL_ATTRIBUTE_PROPERTIES__ANCHOR:
				setAnchor((Double)newValue);
				return;
			case MiningDataPackage.NUMERICAL_ATTRIBUTE_PROPERTIES__CYCLE_BEGIN:
				setCycleBegin((Double)newValue);
				return;
			case MiningDataPackage.NUMERICAL_ATTRIBUTE_PROPERTIES__CYCLE_END:
				setCycleEnd((Double)newValue);
				return;
			case MiningDataPackage.NUMERICAL_ATTRIBUTE_PROPERTIES__DISCRETE_STEP_SIZE:
				setDiscreteStepSize((Double)newValue);
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
			case MiningDataPackage.NUMERICAL_ATTRIBUTE_PROPERTIES__LOWER_BOUND:
				setLowerBound(LOWER_BOUND_EDEFAULT);
				return;
			case MiningDataPackage.NUMERICAL_ATTRIBUTE_PROPERTIES__UPPER_BOUND:
				setUpperBound(UPPER_BOUND_EDEFAULT);
				return;
			case MiningDataPackage.NUMERICAL_ATTRIBUTE_PROPERTIES__IS_DISCRETE:
				setIsDiscrete(IS_DISCRETE_EDEFAULT);
				return;
			case MiningDataPackage.NUMERICAL_ATTRIBUTE_PROPERTIES__IS_CYCLIC:
				setIsCyclic(IS_CYCLIC_EDEFAULT);
				return;
			case MiningDataPackage.NUMERICAL_ATTRIBUTE_PROPERTIES__ANCHOR:
				setAnchor(ANCHOR_EDEFAULT);
				return;
			case MiningDataPackage.NUMERICAL_ATTRIBUTE_PROPERTIES__CYCLE_BEGIN:
				setCycleBegin(CYCLE_BEGIN_EDEFAULT);
				return;
			case MiningDataPackage.NUMERICAL_ATTRIBUTE_PROPERTIES__CYCLE_END:
				setCycleEnd(CYCLE_END_EDEFAULT);
				return;
			case MiningDataPackage.NUMERICAL_ATTRIBUTE_PROPERTIES__DISCRETE_STEP_SIZE:
				setDiscreteStepSize(DISCRETE_STEP_SIZE_EDEFAULT);
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
			case MiningDataPackage.NUMERICAL_ATTRIBUTE_PROPERTIES__LOWER_BOUND:
				return LOWER_BOUND_EDEFAULT == null ? lowerBound != null : !LOWER_BOUND_EDEFAULT.equals(lowerBound);
			case MiningDataPackage.NUMERICAL_ATTRIBUTE_PROPERTIES__UPPER_BOUND:
				return UPPER_BOUND_EDEFAULT == null ? upperBound != null : !UPPER_BOUND_EDEFAULT.equals(upperBound);
			case MiningDataPackage.NUMERICAL_ATTRIBUTE_PROPERTIES__IS_DISCRETE:
				return IS_DISCRETE_EDEFAULT == null ? isDiscrete != null : !IS_DISCRETE_EDEFAULT.equals(isDiscrete);
			case MiningDataPackage.NUMERICAL_ATTRIBUTE_PROPERTIES__IS_CYCLIC:
				return IS_CYCLIC_EDEFAULT == null ? isCyclic != null : !IS_CYCLIC_EDEFAULT.equals(isCyclic);
			case MiningDataPackage.NUMERICAL_ATTRIBUTE_PROPERTIES__ANCHOR:
				return ANCHOR_EDEFAULT == null ? anchor != null : !ANCHOR_EDEFAULT.equals(anchor);
			case MiningDataPackage.NUMERICAL_ATTRIBUTE_PROPERTIES__CYCLE_BEGIN:
				return CYCLE_BEGIN_EDEFAULT == null ? cycleBegin != null : !CYCLE_BEGIN_EDEFAULT.equals(cycleBegin);
			case MiningDataPackage.NUMERICAL_ATTRIBUTE_PROPERTIES__CYCLE_END:
				return CYCLE_END_EDEFAULT == null ? cycleEnd != null : !CYCLE_END_EDEFAULT.equals(cycleEnd);
			case MiningDataPackage.NUMERICAL_ATTRIBUTE_PROPERTIES__DISCRETE_STEP_SIZE:
				return DISCRETE_STEP_SIZE_EDEFAULT == null ? discreteStepSize != null : !DISCRETE_STEP_SIZE_EDEFAULT.equals(discreteStepSize);
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
		result.append(" (lowerBound: ");
		result.append(lowerBound);
		result.append(", upperBound: ");
		result.append(upperBound);
		result.append(", isDiscrete: ");
		result.append(isDiscrete);
		result.append(", isCyclic: ");
		result.append(isCyclic);
		result.append(", anchor: ");
		result.append(anchor);
		result.append(", cycleBegin: ");
		result.append(cycleBegin);
		result.append(", cycleEnd: ");
		result.append(cycleEnd);
		result.append(", discreteStepSize: ");
		result.append(discreteStepSize);
		result.append(')');
		return result.toString();
	}

} //NumericalAttributePropertiesImpl

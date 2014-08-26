/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Supervised.impl;

import CWM.Core.impl.ModelElementImpl;

import CWM.Supervised.LiftAnalysisPoint;
import CWM.Supervised.SupervisedPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lift Analysis Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.Supervised.impl.LiftAnalysisPointImpl#getSubsetOfRecords <em>Subset Of Records</em>}</li>
 *   <li>{@link CWM.Supervised.impl.LiftAnalysisPointImpl#getAggregateTarget <em>Aggregate Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LiftAnalysisPointImpl extends ModelElementImpl implements LiftAnalysisPoint {
	/**
	 * The default value of the '{@link #getSubsetOfRecords() <em>Subset Of Records</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsetOfRecords()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SUBSET_OF_RECORDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubsetOfRecords() <em>Subset Of Records</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsetOfRecords()
	 * @generated
	 * @ordered
	 */
	protected Integer subsetOfRecords = SUBSET_OF_RECORDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAggregateTarget() <em>Aggregate Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregateTarget()
	 * @generated
	 * @ordered
	 */
	protected static final Double AGGREGATE_TARGET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAggregateTarget() <em>Aggregate Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregateTarget()
	 * @generated
	 * @ordered
	 */
	protected Double aggregateTarget = AGGREGATE_TARGET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiftAnalysisPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SupervisedPackage.Literals.LIFT_ANALYSIS_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getSubsetOfRecords() {
		return subsetOfRecords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubsetOfRecords(Integer newSubsetOfRecords) {
		Integer oldSubsetOfRecords = subsetOfRecords;
		subsetOfRecords = newSubsetOfRecords;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SupervisedPackage.LIFT_ANALYSIS_POINT__SUBSET_OF_RECORDS, oldSubsetOfRecords, subsetOfRecords));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getAggregateTarget() {
		return aggregateTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAggregateTarget(Double newAggregateTarget) {
		Double oldAggregateTarget = aggregateTarget;
		aggregateTarget = newAggregateTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SupervisedPackage.LIFT_ANALYSIS_POINT__AGGREGATE_TARGET, oldAggregateTarget, aggregateTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SupervisedPackage.LIFT_ANALYSIS_POINT__SUBSET_OF_RECORDS:
				return getSubsetOfRecords();
			case SupervisedPackage.LIFT_ANALYSIS_POINT__AGGREGATE_TARGET:
				return getAggregateTarget();
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
			case SupervisedPackage.LIFT_ANALYSIS_POINT__SUBSET_OF_RECORDS:
				setSubsetOfRecords((Integer)newValue);
				return;
			case SupervisedPackage.LIFT_ANALYSIS_POINT__AGGREGATE_TARGET:
				setAggregateTarget((Double)newValue);
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
			case SupervisedPackage.LIFT_ANALYSIS_POINT__SUBSET_OF_RECORDS:
				setSubsetOfRecords(SUBSET_OF_RECORDS_EDEFAULT);
				return;
			case SupervisedPackage.LIFT_ANALYSIS_POINT__AGGREGATE_TARGET:
				setAggregateTarget(AGGREGATE_TARGET_EDEFAULT);
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
			case SupervisedPackage.LIFT_ANALYSIS_POINT__SUBSET_OF_RECORDS:
				return SUBSET_OF_RECORDS_EDEFAULT == null ? subsetOfRecords != null : !SUBSET_OF_RECORDS_EDEFAULT.equals(subsetOfRecords);
			case SupervisedPackage.LIFT_ANALYSIS_POINT__AGGREGATE_TARGET:
				return AGGREGATE_TARGET_EDEFAULT == null ? aggregateTarget != null : !AGGREGATE_TARGET_EDEFAULT.equals(aggregateTarget);
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
		result.append(" (subsetOfRecords: ");
		result.append(subsetOfRecords);
		result.append(", aggregateTarget: ");
		result.append(aggregateTarget);
		result.append(')');
		return result.toString();
	}

} //LiftAnalysisPointImpl

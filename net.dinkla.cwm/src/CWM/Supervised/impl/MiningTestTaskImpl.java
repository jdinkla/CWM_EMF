/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Supervised.impl;

import CWM.MiningCore.MiningData.Category;

import CWM.MiningCore.MiningTask.impl.MiningTaskImpl;

import CWM.Supervised.MiningTestTask;
import CWM.Supervised.SupervisedPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mining Test Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.Supervised.impl.MiningTestTaskImpl#getComputeLift <em>Compute Lift</em>}</li>
 *   <li>{@link CWM.Supervised.impl.MiningTestTaskImpl#getPositiveTargetCategory <em>Positive Target Category</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MiningTestTaskImpl extends MiningTaskImpl implements MiningTestTask {
	/**
	 * The default value of the '{@link #getComputeLift() <em>Compute Lift</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputeLift()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean COMPUTE_LIFT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComputeLift() <em>Compute Lift</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputeLift()
	 * @generated
	 * @ordered
	 */
	protected Boolean computeLift = COMPUTE_LIFT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPositiveTargetCategory() <em>Positive Target Category</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositiveTargetCategory()
	 * @generated
	 * @ordered
	 */
	protected EList<Category> positiveTargetCategory;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MiningTestTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SupervisedPackage.Literals.MINING_TEST_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getComputeLift() {
		return computeLift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComputeLift(Boolean newComputeLift) {
		Boolean oldComputeLift = computeLift;
		computeLift = newComputeLift;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SupervisedPackage.MINING_TEST_TASK__COMPUTE_LIFT, oldComputeLift, computeLift));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Category> getPositiveTargetCategory() {
		if (positiveTargetCategory == null) {
			positiveTargetCategory = new EObjectResolvingEList<Category>(Category.class, this, SupervisedPackage.MINING_TEST_TASK__POSITIVE_TARGET_CATEGORY);
		}
		return positiveTargetCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SupervisedPackage.MINING_TEST_TASK__COMPUTE_LIFT:
				return getComputeLift();
			case SupervisedPackage.MINING_TEST_TASK__POSITIVE_TARGET_CATEGORY:
				return getPositiveTargetCategory();
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
			case SupervisedPackage.MINING_TEST_TASK__COMPUTE_LIFT:
				setComputeLift((Boolean)newValue);
				return;
			case SupervisedPackage.MINING_TEST_TASK__POSITIVE_TARGET_CATEGORY:
				getPositiveTargetCategory().clear();
				getPositiveTargetCategory().addAll((Collection<? extends Category>)newValue);
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
			case SupervisedPackage.MINING_TEST_TASK__COMPUTE_LIFT:
				setComputeLift(COMPUTE_LIFT_EDEFAULT);
				return;
			case SupervisedPackage.MINING_TEST_TASK__POSITIVE_TARGET_CATEGORY:
				getPositiveTargetCategory().clear();
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
			case SupervisedPackage.MINING_TEST_TASK__COMPUTE_LIFT:
				return COMPUTE_LIFT_EDEFAULT == null ? computeLift != null : !COMPUTE_LIFT_EDEFAULT.equals(computeLift);
			case SupervisedPackage.MINING_TEST_TASK__POSITIVE_TARGET_CATEGORY:
				return positiveTargetCategory != null && !positiveTargetCategory.isEmpty();
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
		result.append(" (computeLift: ");
		result.append(computeLift);
		result.append(')');
		return result.toString();
	}

} //MiningTestTaskImpl

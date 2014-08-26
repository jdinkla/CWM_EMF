/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Supervised.impl;

import CWM.Core.impl.ModelElementImpl;

import CWM.MiningCore.MiningData.Category;

import CWM.Supervised.LiftAnalysis;
import CWM.Supervised.LiftAnalysisPoint;
import CWM.Supervised.SupervisedPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lift Analysis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.Supervised.impl.LiftAnalysisImpl#getPoint <em>Point</em>}</li>
 *   <li>{@link CWM.Supervised.impl.LiftAnalysisImpl#getTargetAttributeName <em>Target Attribute Name</em>}</li>
 *   <li>{@link CWM.Supervised.impl.LiftAnalysisImpl#getPositiveTargetCategory <em>Positive Target Category</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LiftAnalysisImpl extends ModelElementImpl implements LiftAnalysis {
	/**
	 * The cached value of the '{@link #getPoint() <em>Point</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoint()
	 * @generated
	 * @ordered
	 */
	protected EList<LiftAnalysisPoint> point;

	/**
	 * The default value of the '{@link #getTargetAttributeName() <em>Target Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetAttributeName()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_ATTRIBUTE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetAttributeName() <em>Target Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetAttributeName()
	 * @generated
	 * @ordered
	 */
	protected String targetAttributeName = TARGET_ATTRIBUTE_NAME_EDEFAULT;

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
	protected LiftAnalysisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SupervisedPackage.Literals.LIFT_ANALYSIS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LiftAnalysisPoint> getPoint() {
		if (point == null) {
			point = new EObjectContainmentEList<LiftAnalysisPoint>(LiftAnalysisPoint.class, this, SupervisedPackage.LIFT_ANALYSIS__POINT);
		}
		return point;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetAttributeName() {
		return targetAttributeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetAttributeName(String newTargetAttributeName) {
		String oldTargetAttributeName = targetAttributeName;
		targetAttributeName = newTargetAttributeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SupervisedPackage.LIFT_ANALYSIS__TARGET_ATTRIBUTE_NAME, oldTargetAttributeName, targetAttributeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Category> getPositiveTargetCategory() {
		if (positiveTargetCategory == null) {
			positiveTargetCategory = new EObjectResolvingEList<Category>(Category.class, this, SupervisedPackage.LIFT_ANALYSIS__POSITIVE_TARGET_CATEGORY);
		}
		return positiveTargetCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SupervisedPackage.LIFT_ANALYSIS__POINT:
				return ((InternalEList<?>)getPoint()).basicRemove(otherEnd, msgs);
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
			case SupervisedPackage.LIFT_ANALYSIS__POINT:
				return getPoint();
			case SupervisedPackage.LIFT_ANALYSIS__TARGET_ATTRIBUTE_NAME:
				return getTargetAttributeName();
			case SupervisedPackage.LIFT_ANALYSIS__POSITIVE_TARGET_CATEGORY:
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
			case SupervisedPackage.LIFT_ANALYSIS__POINT:
				getPoint().clear();
				getPoint().addAll((Collection<? extends LiftAnalysisPoint>)newValue);
				return;
			case SupervisedPackage.LIFT_ANALYSIS__TARGET_ATTRIBUTE_NAME:
				setTargetAttributeName((String)newValue);
				return;
			case SupervisedPackage.LIFT_ANALYSIS__POSITIVE_TARGET_CATEGORY:
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
			case SupervisedPackage.LIFT_ANALYSIS__POINT:
				getPoint().clear();
				return;
			case SupervisedPackage.LIFT_ANALYSIS__TARGET_ATTRIBUTE_NAME:
				setTargetAttributeName(TARGET_ATTRIBUTE_NAME_EDEFAULT);
				return;
			case SupervisedPackage.LIFT_ANALYSIS__POSITIVE_TARGET_CATEGORY:
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
			case SupervisedPackage.LIFT_ANALYSIS__POINT:
				return point != null && !point.isEmpty();
			case SupervisedPackage.LIFT_ANALYSIS__TARGET_ATTRIBUTE_NAME:
				return TARGET_ATTRIBUTE_NAME_EDEFAULT == null ? targetAttributeName != null : !TARGET_ATTRIBUTE_NAME_EDEFAULT.equals(targetAttributeName);
			case SupervisedPackage.LIFT_ANALYSIS__POSITIVE_TARGET_CATEGORY:
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
		result.append(" (targetAttributeName: ");
		result.append(targetAttributeName);
		result.append(')');
		return result.toString();
	}

} //LiftAnalysisImpl

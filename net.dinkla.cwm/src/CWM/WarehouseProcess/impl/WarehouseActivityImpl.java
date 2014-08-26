/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.WarehouseProcess.impl;

import CWM.CwmTransformation.TransformationActivity;

import CWM.WarehouseProcess.WarehouseActivity;
import CWM.WarehouseProcess.WarehouseProcessPackage;
import CWM.WarehouseProcess.WarehouseStep;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Warehouse Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.WarehouseProcess.impl.WarehouseActivityImpl#getTransformationActivity <em>Transformation Activity</em>}</li>
 *   <li>{@link CWM.WarehouseProcess.impl.WarehouseActivityImpl#getWarehouseStep <em>Warehouse Step</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WarehouseActivityImpl extends WarehouseProcessImpl implements WarehouseActivity {
	/**
	 * The cached value of the '{@link #getTransformationActivity() <em>Transformation Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformationActivity()
	 * @generated
	 * @ordered
	 */
	protected TransformationActivity transformationActivity;

	/**
	 * The cached value of the '{@link #getWarehouseStep() <em>Warehouse Step</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarehouseStep()
	 * @generated
	 * @ordered
	 */
	protected EList<WarehouseStep> warehouseStep;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WarehouseActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WarehouseProcessPackage.Literals.WAREHOUSE_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationActivity getTransformationActivity() {
		if (transformationActivity != null && transformationActivity.eIsProxy()) {
			InternalEObject oldTransformationActivity = (InternalEObject)transformationActivity;
			transformationActivity = (TransformationActivity)eResolveProxy(oldTransformationActivity);
			if (transformationActivity != oldTransformationActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WarehouseProcessPackage.WAREHOUSE_ACTIVITY__TRANSFORMATION_ACTIVITY, oldTransformationActivity, transformationActivity));
			}
		}
		return transformationActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationActivity basicGetTransformationActivity() {
		return transformationActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformationActivity(TransformationActivity newTransformationActivity) {
		TransformationActivity oldTransformationActivity = transformationActivity;
		transformationActivity = newTransformationActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WarehouseProcessPackage.WAREHOUSE_ACTIVITY__TRANSFORMATION_ACTIVITY, oldTransformationActivity, transformationActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WarehouseStep> getWarehouseStep() {
		if (warehouseStep == null) {
			warehouseStep = new EObjectContainmentWithInverseEList<WarehouseStep>(WarehouseStep.class, this, WarehouseProcessPackage.WAREHOUSE_ACTIVITY__WAREHOUSE_STEP, WarehouseProcessPackage.WAREHOUSE_STEP__WAREHOUSE_ACTIVITY);
		}
		return warehouseStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WarehouseProcessPackage.WAREHOUSE_ACTIVITY__WAREHOUSE_STEP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWarehouseStep()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WarehouseProcessPackage.WAREHOUSE_ACTIVITY__WAREHOUSE_STEP:
				return ((InternalEList<?>)getWarehouseStep()).basicRemove(otherEnd, msgs);
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
			case WarehouseProcessPackage.WAREHOUSE_ACTIVITY__TRANSFORMATION_ACTIVITY:
				if (resolve) return getTransformationActivity();
				return basicGetTransformationActivity();
			case WarehouseProcessPackage.WAREHOUSE_ACTIVITY__WAREHOUSE_STEP:
				return getWarehouseStep();
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
			case WarehouseProcessPackage.WAREHOUSE_ACTIVITY__TRANSFORMATION_ACTIVITY:
				setTransformationActivity((TransformationActivity)newValue);
				return;
			case WarehouseProcessPackage.WAREHOUSE_ACTIVITY__WAREHOUSE_STEP:
				getWarehouseStep().clear();
				getWarehouseStep().addAll((Collection<? extends WarehouseStep>)newValue);
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
			case WarehouseProcessPackage.WAREHOUSE_ACTIVITY__TRANSFORMATION_ACTIVITY:
				setTransformationActivity((TransformationActivity)null);
				return;
			case WarehouseProcessPackage.WAREHOUSE_ACTIVITY__WAREHOUSE_STEP:
				getWarehouseStep().clear();
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
			case WarehouseProcessPackage.WAREHOUSE_ACTIVITY__TRANSFORMATION_ACTIVITY:
				return transformationActivity != null;
			case WarehouseProcessPackage.WAREHOUSE_ACTIVITY__WAREHOUSE_STEP:
				return warehouseStep != null && !warehouseStep.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WarehouseActivityImpl

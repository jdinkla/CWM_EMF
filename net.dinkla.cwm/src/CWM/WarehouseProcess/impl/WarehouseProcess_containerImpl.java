/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.WarehouseProcess.impl;

import CWM.WarehouseProcess.ProcessPackage;
import CWM.WarehouseProcess.WarehouseActivity;
import CWM.WarehouseProcess.WarehouseProcess;
import CWM.WarehouseProcess.WarehouseProcessPackage;
import CWM.WarehouseProcess.WarehouseProcess_container;
import CWM.WarehouseProcess.WarehouseStep;

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
 * An implementation of the model object '<em><b>Warehouse Process container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.WarehouseProcess.impl.WarehouseProcess_containerImpl#getWarehouseProcess <em>Warehouse Process</em>}</li>
 *   <li>{@link CWM.WarehouseProcess.impl.WarehouseProcess_containerImpl#getWarehouseStep <em>Warehouse Step</em>}</li>
 *   <li>{@link CWM.WarehouseProcess.impl.WarehouseProcess_containerImpl#getProcessPackage <em>Process Package</em>}</li>
 *   <li>{@link CWM.WarehouseProcess.impl.WarehouseProcess_containerImpl#getWarehouseActivity <em>Warehouse Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WarehouseProcess_containerImpl extends EObjectImpl implements WarehouseProcess_container {
	/**
	 * The cached value of the '{@link #getWarehouseProcess() <em>Warehouse Process</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarehouseProcess()
	 * @generated
	 * @ordered
	 */
	protected EList<WarehouseProcess> warehouseProcess;

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
	 * The cached value of the '{@link #getProcessPackage() <em>Process Package</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessPackage> processPackage;

	/**
	 * The cached value of the '{@link #getWarehouseActivity() <em>Warehouse Activity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarehouseActivity()
	 * @generated
	 * @ordered
	 */
	protected EList<WarehouseActivity> warehouseActivity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WarehouseProcess_containerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WarehouseProcessPackage.Literals.WAREHOUSE_PROCESS_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WarehouseProcess> getWarehouseProcess() {
		if (warehouseProcess == null) {
			warehouseProcess = new EObjectContainmentEList<WarehouseProcess>(WarehouseProcess.class, this, WarehouseProcessPackage.WAREHOUSE_PROCESS_CONTAINER__WAREHOUSE_PROCESS);
		}
		return warehouseProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WarehouseStep> getWarehouseStep() {
		if (warehouseStep == null) {
			warehouseStep = new EObjectContainmentEList<WarehouseStep>(WarehouseStep.class, this, WarehouseProcessPackage.WAREHOUSE_PROCESS_CONTAINER__WAREHOUSE_STEP);
		}
		return warehouseStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcessPackage> getProcessPackage() {
		if (processPackage == null) {
			processPackage = new EObjectContainmentEList<ProcessPackage>(ProcessPackage.class, this, WarehouseProcessPackage.WAREHOUSE_PROCESS_CONTAINER__PROCESS_PACKAGE);
		}
		return processPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WarehouseActivity> getWarehouseActivity() {
		if (warehouseActivity == null) {
			warehouseActivity = new EObjectContainmentEList<WarehouseActivity>(WarehouseActivity.class, this, WarehouseProcessPackage.WAREHOUSE_PROCESS_CONTAINER__WAREHOUSE_ACTIVITY);
		}
		return warehouseActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WarehouseProcessPackage.WAREHOUSE_PROCESS_CONTAINER__WAREHOUSE_PROCESS:
				return ((InternalEList<?>)getWarehouseProcess()).basicRemove(otherEnd, msgs);
			case WarehouseProcessPackage.WAREHOUSE_PROCESS_CONTAINER__WAREHOUSE_STEP:
				return ((InternalEList<?>)getWarehouseStep()).basicRemove(otherEnd, msgs);
			case WarehouseProcessPackage.WAREHOUSE_PROCESS_CONTAINER__PROCESS_PACKAGE:
				return ((InternalEList<?>)getProcessPackage()).basicRemove(otherEnd, msgs);
			case WarehouseProcessPackage.WAREHOUSE_PROCESS_CONTAINER__WAREHOUSE_ACTIVITY:
				return ((InternalEList<?>)getWarehouseActivity()).basicRemove(otherEnd, msgs);
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
			case WarehouseProcessPackage.WAREHOUSE_PROCESS_CONTAINER__WAREHOUSE_PROCESS:
				return getWarehouseProcess();
			case WarehouseProcessPackage.WAREHOUSE_PROCESS_CONTAINER__WAREHOUSE_STEP:
				return getWarehouseStep();
			case WarehouseProcessPackage.WAREHOUSE_PROCESS_CONTAINER__PROCESS_PACKAGE:
				return getProcessPackage();
			case WarehouseProcessPackage.WAREHOUSE_PROCESS_CONTAINER__WAREHOUSE_ACTIVITY:
				return getWarehouseActivity();
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
			case WarehouseProcessPackage.WAREHOUSE_PROCESS_CONTAINER__WAREHOUSE_PROCESS:
				getWarehouseProcess().clear();
				getWarehouseProcess().addAll((Collection<? extends WarehouseProcess>)newValue);
				return;
			case WarehouseProcessPackage.WAREHOUSE_PROCESS_CONTAINER__WAREHOUSE_STEP:
				getWarehouseStep().clear();
				getWarehouseStep().addAll((Collection<? extends WarehouseStep>)newValue);
				return;
			case WarehouseProcessPackage.WAREHOUSE_PROCESS_CONTAINER__PROCESS_PACKAGE:
				getProcessPackage().clear();
				getProcessPackage().addAll((Collection<? extends ProcessPackage>)newValue);
				return;
			case WarehouseProcessPackage.WAREHOUSE_PROCESS_CONTAINER__WAREHOUSE_ACTIVITY:
				getWarehouseActivity().clear();
				getWarehouseActivity().addAll((Collection<? extends WarehouseActivity>)newValue);
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
			case WarehouseProcessPackage.WAREHOUSE_PROCESS_CONTAINER__WAREHOUSE_PROCESS:
				getWarehouseProcess().clear();
				return;
			case WarehouseProcessPackage.WAREHOUSE_PROCESS_CONTAINER__WAREHOUSE_STEP:
				getWarehouseStep().clear();
				return;
			case WarehouseProcessPackage.WAREHOUSE_PROCESS_CONTAINER__PROCESS_PACKAGE:
				getProcessPackage().clear();
				return;
			case WarehouseProcessPackage.WAREHOUSE_PROCESS_CONTAINER__WAREHOUSE_ACTIVITY:
				getWarehouseActivity().clear();
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
			case WarehouseProcessPackage.WAREHOUSE_PROCESS_CONTAINER__WAREHOUSE_PROCESS:
				return warehouseProcess != null && !warehouseProcess.isEmpty();
			case WarehouseProcessPackage.WAREHOUSE_PROCESS_CONTAINER__WAREHOUSE_STEP:
				return warehouseStep != null && !warehouseStep.isEmpty();
			case WarehouseProcessPackage.WAREHOUSE_PROCESS_CONTAINER__PROCESS_PACKAGE:
				return processPackage != null && !processPackage.isEmpty();
			case WarehouseProcessPackage.WAREHOUSE_PROCESS_CONTAINER__WAREHOUSE_ACTIVITY:
				return warehouseActivity != null && !warehouseActivity.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WarehouseProcess_containerImpl

/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Supervised.impl;

import CWM.Supervised.LiftAnalysis;
import CWM.Supervised.LiftAnalysisPoint;
import CWM.Supervised.MiningTestResult;
import CWM.Supervised.MiningTestTask;
import CWM.Supervised.SupervisedFunctionSettings;
import CWM.Supervised.SupervisedPackage;
import CWM.Supervised.Supervised_container;

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
 * An implementation of the model object '<em><b>Supervised container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.Supervised.impl.Supervised_containerImpl#getLiftAnalysisPoint <em>Lift Analysis Point</em>}</li>
 *   <li>{@link CWM.Supervised.impl.Supervised_containerImpl#getLiftAnalysis <em>Lift Analysis</em>}</li>
 *   <li>{@link CWM.Supervised.impl.Supervised_containerImpl#getMiningTestTask <em>Mining Test Task</em>}</li>
 *   <li>{@link CWM.Supervised.impl.Supervised_containerImpl#getSupervisedFunctionSettings <em>Supervised Function Settings</em>}</li>
 *   <li>{@link CWM.Supervised.impl.Supervised_containerImpl#getMiningTestResult <em>Mining Test Result</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Supervised_containerImpl extends EObjectImpl implements Supervised_container {
	/**
	 * The cached value of the '{@link #getLiftAnalysisPoint() <em>Lift Analysis Point</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiftAnalysisPoint()
	 * @generated
	 * @ordered
	 */
	protected EList<LiftAnalysisPoint> liftAnalysisPoint;

	/**
	 * The cached value of the '{@link #getLiftAnalysis() <em>Lift Analysis</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiftAnalysis()
	 * @generated
	 * @ordered
	 */
	protected EList<LiftAnalysis> liftAnalysis;

	/**
	 * The cached value of the '{@link #getMiningTestTask() <em>Mining Test Task</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiningTestTask()
	 * @generated
	 * @ordered
	 */
	protected EList<MiningTestTask> miningTestTask;

	/**
	 * The cached value of the '{@link #getSupervisedFunctionSettings() <em>Supervised Function Settings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupervisedFunctionSettings()
	 * @generated
	 * @ordered
	 */
	protected EList<SupervisedFunctionSettings> supervisedFunctionSettings;

	/**
	 * The cached value of the '{@link #getMiningTestResult() <em>Mining Test Result</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiningTestResult()
	 * @generated
	 * @ordered
	 */
	protected EList<MiningTestResult> miningTestResult;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Supervised_containerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SupervisedPackage.Literals.SUPERVISED_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LiftAnalysisPoint> getLiftAnalysisPoint() {
		if (liftAnalysisPoint == null) {
			liftAnalysisPoint = new EObjectContainmentEList<LiftAnalysisPoint>(LiftAnalysisPoint.class, this, SupervisedPackage.SUPERVISED_CONTAINER__LIFT_ANALYSIS_POINT);
		}
		return liftAnalysisPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LiftAnalysis> getLiftAnalysis() {
		if (liftAnalysis == null) {
			liftAnalysis = new EObjectContainmentEList<LiftAnalysis>(LiftAnalysis.class, this, SupervisedPackage.SUPERVISED_CONTAINER__LIFT_ANALYSIS);
		}
		return liftAnalysis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MiningTestTask> getMiningTestTask() {
		if (miningTestTask == null) {
			miningTestTask = new EObjectContainmentEList<MiningTestTask>(MiningTestTask.class, this, SupervisedPackage.SUPERVISED_CONTAINER__MINING_TEST_TASK);
		}
		return miningTestTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SupervisedFunctionSettings> getSupervisedFunctionSettings() {
		if (supervisedFunctionSettings == null) {
			supervisedFunctionSettings = new EObjectContainmentEList<SupervisedFunctionSettings>(SupervisedFunctionSettings.class, this, SupervisedPackage.SUPERVISED_CONTAINER__SUPERVISED_FUNCTION_SETTINGS);
		}
		return supervisedFunctionSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MiningTestResult> getMiningTestResult() {
		if (miningTestResult == null) {
			miningTestResult = new EObjectContainmentEList<MiningTestResult>(MiningTestResult.class, this, SupervisedPackage.SUPERVISED_CONTAINER__MINING_TEST_RESULT);
		}
		return miningTestResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SupervisedPackage.SUPERVISED_CONTAINER__LIFT_ANALYSIS_POINT:
				return ((InternalEList<?>)getLiftAnalysisPoint()).basicRemove(otherEnd, msgs);
			case SupervisedPackage.SUPERVISED_CONTAINER__LIFT_ANALYSIS:
				return ((InternalEList<?>)getLiftAnalysis()).basicRemove(otherEnd, msgs);
			case SupervisedPackage.SUPERVISED_CONTAINER__MINING_TEST_TASK:
				return ((InternalEList<?>)getMiningTestTask()).basicRemove(otherEnd, msgs);
			case SupervisedPackage.SUPERVISED_CONTAINER__SUPERVISED_FUNCTION_SETTINGS:
				return ((InternalEList<?>)getSupervisedFunctionSettings()).basicRemove(otherEnd, msgs);
			case SupervisedPackage.SUPERVISED_CONTAINER__MINING_TEST_RESULT:
				return ((InternalEList<?>)getMiningTestResult()).basicRemove(otherEnd, msgs);
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
			case SupervisedPackage.SUPERVISED_CONTAINER__LIFT_ANALYSIS_POINT:
				return getLiftAnalysisPoint();
			case SupervisedPackage.SUPERVISED_CONTAINER__LIFT_ANALYSIS:
				return getLiftAnalysis();
			case SupervisedPackage.SUPERVISED_CONTAINER__MINING_TEST_TASK:
				return getMiningTestTask();
			case SupervisedPackage.SUPERVISED_CONTAINER__SUPERVISED_FUNCTION_SETTINGS:
				return getSupervisedFunctionSettings();
			case SupervisedPackage.SUPERVISED_CONTAINER__MINING_TEST_RESULT:
				return getMiningTestResult();
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
			case SupervisedPackage.SUPERVISED_CONTAINER__LIFT_ANALYSIS_POINT:
				getLiftAnalysisPoint().clear();
				getLiftAnalysisPoint().addAll((Collection<? extends LiftAnalysisPoint>)newValue);
				return;
			case SupervisedPackage.SUPERVISED_CONTAINER__LIFT_ANALYSIS:
				getLiftAnalysis().clear();
				getLiftAnalysis().addAll((Collection<? extends LiftAnalysis>)newValue);
				return;
			case SupervisedPackage.SUPERVISED_CONTAINER__MINING_TEST_TASK:
				getMiningTestTask().clear();
				getMiningTestTask().addAll((Collection<? extends MiningTestTask>)newValue);
				return;
			case SupervisedPackage.SUPERVISED_CONTAINER__SUPERVISED_FUNCTION_SETTINGS:
				getSupervisedFunctionSettings().clear();
				getSupervisedFunctionSettings().addAll((Collection<? extends SupervisedFunctionSettings>)newValue);
				return;
			case SupervisedPackage.SUPERVISED_CONTAINER__MINING_TEST_RESULT:
				getMiningTestResult().clear();
				getMiningTestResult().addAll((Collection<? extends MiningTestResult>)newValue);
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
			case SupervisedPackage.SUPERVISED_CONTAINER__LIFT_ANALYSIS_POINT:
				getLiftAnalysisPoint().clear();
				return;
			case SupervisedPackage.SUPERVISED_CONTAINER__LIFT_ANALYSIS:
				getLiftAnalysis().clear();
				return;
			case SupervisedPackage.SUPERVISED_CONTAINER__MINING_TEST_TASK:
				getMiningTestTask().clear();
				return;
			case SupervisedPackage.SUPERVISED_CONTAINER__SUPERVISED_FUNCTION_SETTINGS:
				getSupervisedFunctionSettings().clear();
				return;
			case SupervisedPackage.SUPERVISED_CONTAINER__MINING_TEST_RESULT:
				getMiningTestResult().clear();
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
			case SupervisedPackage.SUPERVISED_CONTAINER__LIFT_ANALYSIS_POINT:
				return liftAnalysisPoint != null && !liftAnalysisPoint.isEmpty();
			case SupervisedPackage.SUPERVISED_CONTAINER__LIFT_ANALYSIS:
				return liftAnalysis != null && !liftAnalysis.isEmpty();
			case SupervisedPackage.SUPERVISED_CONTAINER__MINING_TEST_TASK:
				return miningTestTask != null && !miningTestTask.isEmpty();
			case SupervisedPackage.SUPERVISED_CONTAINER__SUPERVISED_FUNCTION_SETTINGS:
				return supervisedFunctionSettings != null && !supervisedFunctionSettings.isEmpty();
			case SupervisedPackage.SUPERVISED_CONTAINER__MINING_TEST_RESULT:
				return miningTestResult != null && !miningTestResult.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Supervised_containerImpl

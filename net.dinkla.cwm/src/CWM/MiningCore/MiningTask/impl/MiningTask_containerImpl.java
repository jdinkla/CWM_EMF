/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningTask.impl;

import CWM.MiningCore.MiningTask.ApplyContentItem;
import CWM.MiningCore.MiningTask.ApplyOutputItem;
import CWM.MiningCore.MiningTask.ApplyProbabilityItem;
import CWM.MiningCore.MiningTask.ApplyRuleIdItem;
import CWM.MiningCore.MiningTask.ApplyScoreItem;
import CWM.MiningCore.MiningTask.ApplySourceItem;
import CWM.MiningCore.MiningTask.MiningApplyOutput;
import CWM.MiningCore.MiningTask.MiningApplyTask;
import CWM.MiningCore.MiningTask.MiningBuildTask;
import CWM.MiningCore.MiningTask.MiningTask;
import CWM.MiningCore.MiningTask.MiningTaskPackage;
import CWM.MiningCore.MiningTask.MiningTask_container;
import CWM.MiningCore.MiningTask.MiningTransformation;

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
 * An implementation of the model object '<em><b>Mining Task container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.MiningCore.MiningTask.impl.MiningTask_containerImpl#getApplyContentItem <em>Apply Content Item</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningTask.impl.MiningTask_containerImpl#getApplyOutputItem <em>Apply Output Item</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningTask.impl.MiningTask_containerImpl#getApplyProbabilityItem <em>Apply Probability Item</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningTask.impl.MiningTask_containerImpl#getApplyRuleIdItem <em>Apply Rule Id Item</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningTask.impl.MiningTask_containerImpl#getApplyScoreItem <em>Apply Score Item</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningTask.impl.MiningTask_containerImpl#getApplySourceItem <em>Apply Source Item</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningTask.impl.MiningTask_containerImpl#getMiningApplyOutput <em>Mining Apply Output</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningTask.impl.MiningTask_containerImpl#getMiningApplyTask <em>Mining Apply Task</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningTask.impl.MiningTask_containerImpl#getMiningBuildTask <em>Mining Build Task</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningTask.impl.MiningTask_containerImpl#getMiningTask <em>Mining Task</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningTask.impl.MiningTask_containerImpl#getMiningTransformation <em>Mining Transformation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MiningTask_containerImpl extends EObjectImpl implements MiningTask_container {
	/**
	 * The cached value of the '{@link #getApplyContentItem() <em>Apply Content Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplyContentItem()
	 * @generated
	 * @ordered
	 */
	protected EList<ApplyContentItem> applyContentItem;

	/**
	 * The cached value of the '{@link #getApplyOutputItem() <em>Apply Output Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplyOutputItem()
	 * @generated
	 * @ordered
	 */
	protected EList<ApplyOutputItem> applyOutputItem;

	/**
	 * The cached value of the '{@link #getApplyProbabilityItem() <em>Apply Probability Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplyProbabilityItem()
	 * @generated
	 * @ordered
	 */
	protected EList<ApplyProbabilityItem> applyProbabilityItem;

	/**
	 * The cached value of the '{@link #getApplyRuleIdItem() <em>Apply Rule Id Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplyRuleIdItem()
	 * @generated
	 * @ordered
	 */
	protected EList<ApplyRuleIdItem> applyRuleIdItem;

	/**
	 * The cached value of the '{@link #getApplyScoreItem() <em>Apply Score Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplyScoreItem()
	 * @generated
	 * @ordered
	 */
	protected EList<ApplyScoreItem> applyScoreItem;

	/**
	 * The cached value of the '{@link #getApplySourceItem() <em>Apply Source Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplySourceItem()
	 * @generated
	 * @ordered
	 */
	protected EList<ApplySourceItem> applySourceItem;

	/**
	 * The cached value of the '{@link #getMiningApplyOutput() <em>Mining Apply Output</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiningApplyOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<MiningApplyOutput> miningApplyOutput;

	/**
	 * The cached value of the '{@link #getMiningApplyTask() <em>Mining Apply Task</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiningApplyTask()
	 * @generated
	 * @ordered
	 */
	protected EList<MiningApplyTask> miningApplyTask;

	/**
	 * The cached value of the '{@link #getMiningBuildTask() <em>Mining Build Task</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiningBuildTask()
	 * @generated
	 * @ordered
	 */
	protected EList<MiningBuildTask> miningBuildTask;

	/**
	 * The cached value of the '{@link #getMiningTask() <em>Mining Task</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiningTask()
	 * @generated
	 * @ordered
	 */
	protected EList<MiningTask> miningTask;

	/**
	 * The cached value of the '{@link #getMiningTransformation() <em>Mining Transformation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiningTransformation()
	 * @generated
	 * @ordered
	 */
	protected EList<MiningTransformation> miningTransformation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MiningTask_containerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MiningTaskPackage.Literals.MINING_TASK_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ApplyContentItem> getApplyContentItem() {
		if (applyContentItem == null) {
			applyContentItem = new EObjectContainmentEList<ApplyContentItem>(ApplyContentItem.class, this, MiningTaskPackage.MINING_TASK_CONTAINER__APPLY_CONTENT_ITEM);
		}
		return applyContentItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ApplyOutputItem> getApplyOutputItem() {
		if (applyOutputItem == null) {
			applyOutputItem = new EObjectContainmentEList<ApplyOutputItem>(ApplyOutputItem.class, this, MiningTaskPackage.MINING_TASK_CONTAINER__APPLY_OUTPUT_ITEM);
		}
		return applyOutputItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ApplyProbabilityItem> getApplyProbabilityItem() {
		if (applyProbabilityItem == null) {
			applyProbabilityItem = new EObjectContainmentEList<ApplyProbabilityItem>(ApplyProbabilityItem.class, this, MiningTaskPackage.MINING_TASK_CONTAINER__APPLY_PROBABILITY_ITEM);
		}
		return applyProbabilityItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ApplyRuleIdItem> getApplyRuleIdItem() {
		if (applyRuleIdItem == null) {
			applyRuleIdItem = new EObjectContainmentEList<ApplyRuleIdItem>(ApplyRuleIdItem.class, this, MiningTaskPackage.MINING_TASK_CONTAINER__APPLY_RULE_ID_ITEM);
		}
		return applyRuleIdItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ApplyScoreItem> getApplyScoreItem() {
		if (applyScoreItem == null) {
			applyScoreItem = new EObjectContainmentEList<ApplyScoreItem>(ApplyScoreItem.class, this, MiningTaskPackage.MINING_TASK_CONTAINER__APPLY_SCORE_ITEM);
		}
		return applyScoreItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ApplySourceItem> getApplySourceItem() {
		if (applySourceItem == null) {
			applySourceItem = new EObjectContainmentEList<ApplySourceItem>(ApplySourceItem.class, this, MiningTaskPackage.MINING_TASK_CONTAINER__APPLY_SOURCE_ITEM);
		}
		return applySourceItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MiningApplyOutput> getMiningApplyOutput() {
		if (miningApplyOutput == null) {
			miningApplyOutput = new EObjectContainmentEList<MiningApplyOutput>(MiningApplyOutput.class, this, MiningTaskPackage.MINING_TASK_CONTAINER__MINING_APPLY_OUTPUT);
		}
		return miningApplyOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MiningApplyTask> getMiningApplyTask() {
		if (miningApplyTask == null) {
			miningApplyTask = new EObjectContainmentEList<MiningApplyTask>(MiningApplyTask.class, this, MiningTaskPackage.MINING_TASK_CONTAINER__MINING_APPLY_TASK);
		}
		return miningApplyTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MiningBuildTask> getMiningBuildTask() {
		if (miningBuildTask == null) {
			miningBuildTask = new EObjectContainmentEList<MiningBuildTask>(MiningBuildTask.class, this, MiningTaskPackage.MINING_TASK_CONTAINER__MINING_BUILD_TASK);
		}
		return miningBuildTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MiningTask> getMiningTask() {
		if (miningTask == null) {
			miningTask = new EObjectContainmentEList<MiningTask>(MiningTask.class, this, MiningTaskPackage.MINING_TASK_CONTAINER__MINING_TASK);
		}
		return miningTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MiningTransformation> getMiningTransformation() {
		if (miningTransformation == null) {
			miningTransformation = new EObjectContainmentEList<MiningTransformation>(MiningTransformation.class, this, MiningTaskPackage.MINING_TASK_CONTAINER__MINING_TRANSFORMATION);
		}
		return miningTransformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MiningTaskPackage.MINING_TASK_CONTAINER__APPLY_CONTENT_ITEM:
				return ((InternalEList<?>)getApplyContentItem()).basicRemove(otherEnd, msgs);
			case MiningTaskPackage.MINING_TASK_CONTAINER__APPLY_OUTPUT_ITEM:
				return ((InternalEList<?>)getApplyOutputItem()).basicRemove(otherEnd, msgs);
			case MiningTaskPackage.MINING_TASK_CONTAINER__APPLY_PROBABILITY_ITEM:
				return ((InternalEList<?>)getApplyProbabilityItem()).basicRemove(otherEnd, msgs);
			case MiningTaskPackage.MINING_TASK_CONTAINER__APPLY_RULE_ID_ITEM:
				return ((InternalEList<?>)getApplyRuleIdItem()).basicRemove(otherEnd, msgs);
			case MiningTaskPackage.MINING_TASK_CONTAINER__APPLY_SCORE_ITEM:
				return ((InternalEList<?>)getApplyScoreItem()).basicRemove(otherEnd, msgs);
			case MiningTaskPackage.MINING_TASK_CONTAINER__APPLY_SOURCE_ITEM:
				return ((InternalEList<?>)getApplySourceItem()).basicRemove(otherEnd, msgs);
			case MiningTaskPackage.MINING_TASK_CONTAINER__MINING_APPLY_OUTPUT:
				return ((InternalEList<?>)getMiningApplyOutput()).basicRemove(otherEnd, msgs);
			case MiningTaskPackage.MINING_TASK_CONTAINER__MINING_APPLY_TASK:
				return ((InternalEList<?>)getMiningApplyTask()).basicRemove(otherEnd, msgs);
			case MiningTaskPackage.MINING_TASK_CONTAINER__MINING_BUILD_TASK:
				return ((InternalEList<?>)getMiningBuildTask()).basicRemove(otherEnd, msgs);
			case MiningTaskPackage.MINING_TASK_CONTAINER__MINING_TASK:
				return ((InternalEList<?>)getMiningTask()).basicRemove(otherEnd, msgs);
			case MiningTaskPackage.MINING_TASK_CONTAINER__MINING_TRANSFORMATION:
				return ((InternalEList<?>)getMiningTransformation()).basicRemove(otherEnd, msgs);
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
			case MiningTaskPackage.MINING_TASK_CONTAINER__APPLY_CONTENT_ITEM:
				return getApplyContentItem();
			case MiningTaskPackage.MINING_TASK_CONTAINER__APPLY_OUTPUT_ITEM:
				return getApplyOutputItem();
			case MiningTaskPackage.MINING_TASK_CONTAINER__APPLY_PROBABILITY_ITEM:
				return getApplyProbabilityItem();
			case MiningTaskPackage.MINING_TASK_CONTAINER__APPLY_RULE_ID_ITEM:
				return getApplyRuleIdItem();
			case MiningTaskPackage.MINING_TASK_CONTAINER__APPLY_SCORE_ITEM:
				return getApplyScoreItem();
			case MiningTaskPackage.MINING_TASK_CONTAINER__APPLY_SOURCE_ITEM:
				return getApplySourceItem();
			case MiningTaskPackage.MINING_TASK_CONTAINER__MINING_APPLY_OUTPUT:
				return getMiningApplyOutput();
			case MiningTaskPackage.MINING_TASK_CONTAINER__MINING_APPLY_TASK:
				return getMiningApplyTask();
			case MiningTaskPackage.MINING_TASK_CONTAINER__MINING_BUILD_TASK:
				return getMiningBuildTask();
			case MiningTaskPackage.MINING_TASK_CONTAINER__MINING_TASK:
				return getMiningTask();
			case MiningTaskPackage.MINING_TASK_CONTAINER__MINING_TRANSFORMATION:
				return getMiningTransformation();
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
			case MiningTaskPackage.MINING_TASK_CONTAINER__APPLY_CONTENT_ITEM:
				getApplyContentItem().clear();
				getApplyContentItem().addAll((Collection<? extends ApplyContentItem>)newValue);
				return;
			case MiningTaskPackage.MINING_TASK_CONTAINER__APPLY_OUTPUT_ITEM:
				getApplyOutputItem().clear();
				getApplyOutputItem().addAll((Collection<? extends ApplyOutputItem>)newValue);
				return;
			case MiningTaskPackage.MINING_TASK_CONTAINER__APPLY_PROBABILITY_ITEM:
				getApplyProbabilityItem().clear();
				getApplyProbabilityItem().addAll((Collection<? extends ApplyProbabilityItem>)newValue);
				return;
			case MiningTaskPackage.MINING_TASK_CONTAINER__APPLY_RULE_ID_ITEM:
				getApplyRuleIdItem().clear();
				getApplyRuleIdItem().addAll((Collection<? extends ApplyRuleIdItem>)newValue);
				return;
			case MiningTaskPackage.MINING_TASK_CONTAINER__APPLY_SCORE_ITEM:
				getApplyScoreItem().clear();
				getApplyScoreItem().addAll((Collection<? extends ApplyScoreItem>)newValue);
				return;
			case MiningTaskPackage.MINING_TASK_CONTAINER__APPLY_SOURCE_ITEM:
				getApplySourceItem().clear();
				getApplySourceItem().addAll((Collection<? extends ApplySourceItem>)newValue);
				return;
			case MiningTaskPackage.MINING_TASK_CONTAINER__MINING_APPLY_OUTPUT:
				getMiningApplyOutput().clear();
				getMiningApplyOutput().addAll((Collection<? extends MiningApplyOutput>)newValue);
				return;
			case MiningTaskPackage.MINING_TASK_CONTAINER__MINING_APPLY_TASK:
				getMiningApplyTask().clear();
				getMiningApplyTask().addAll((Collection<? extends MiningApplyTask>)newValue);
				return;
			case MiningTaskPackage.MINING_TASK_CONTAINER__MINING_BUILD_TASK:
				getMiningBuildTask().clear();
				getMiningBuildTask().addAll((Collection<? extends MiningBuildTask>)newValue);
				return;
			case MiningTaskPackage.MINING_TASK_CONTAINER__MINING_TASK:
				getMiningTask().clear();
				getMiningTask().addAll((Collection<? extends MiningTask>)newValue);
				return;
			case MiningTaskPackage.MINING_TASK_CONTAINER__MINING_TRANSFORMATION:
				getMiningTransformation().clear();
				getMiningTransformation().addAll((Collection<? extends MiningTransformation>)newValue);
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
			case MiningTaskPackage.MINING_TASK_CONTAINER__APPLY_CONTENT_ITEM:
				getApplyContentItem().clear();
				return;
			case MiningTaskPackage.MINING_TASK_CONTAINER__APPLY_OUTPUT_ITEM:
				getApplyOutputItem().clear();
				return;
			case MiningTaskPackage.MINING_TASK_CONTAINER__APPLY_PROBABILITY_ITEM:
				getApplyProbabilityItem().clear();
				return;
			case MiningTaskPackage.MINING_TASK_CONTAINER__APPLY_RULE_ID_ITEM:
				getApplyRuleIdItem().clear();
				return;
			case MiningTaskPackage.MINING_TASK_CONTAINER__APPLY_SCORE_ITEM:
				getApplyScoreItem().clear();
				return;
			case MiningTaskPackage.MINING_TASK_CONTAINER__APPLY_SOURCE_ITEM:
				getApplySourceItem().clear();
				return;
			case MiningTaskPackage.MINING_TASK_CONTAINER__MINING_APPLY_OUTPUT:
				getMiningApplyOutput().clear();
				return;
			case MiningTaskPackage.MINING_TASK_CONTAINER__MINING_APPLY_TASK:
				getMiningApplyTask().clear();
				return;
			case MiningTaskPackage.MINING_TASK_CONTAINER__MINING_BUILD_TASK:
				getMiningBuildTask().clear();
				return;
			case MiningTaskPackage.MINING_TASK_CONTAINER__MINING_TASK:
				getMiningTask().clear();
				return;
			case MiningTaskPackage.MINING_TASK_CONTAINER__MINING_TRANSFORMATION:
				getMiningTransformation().clear();
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
			case MiningTaskPackage.MINING_TASK_CONTAINER__APPLY_CONTENT_ITEM:
				return applyContentItem != null && !applyContentItem.isEmpty();
			case MiningTaskPackage.MINING_TASK_CONTAINER__APPLY_OUTPUT_ITEM:
				return applyOutputItem != null && !applyOutputItem.isEmpty();
			case MiningTaskPackage.MINING_TASK_CONTAINER__APPLY_PROBABILITY_ITEM:
				return applyProbabilityItem != null && !applyProbabilityItem.isEmpty();
			case MiningTaskPackage.MINING_TASK_CONTAINER__APPLY_RULE_ID_ITEM:
				return applyRuleIdItem != null && !applyRuleIdItem.isEmpty();
			case MiningTaskPackage.MINING_TASK_CONTAINER__APPLY_SCORE_ITEM:
				return applyScoreItem != null && !applyScoreItem.isEmpty();
			case MiningTaskPackage.MINING_TASK_CONTAINER__APPLY_SOURCE_ITEM:
				return applySourceItem != null && !applySourceItem.isEmpty();
			case MiningTaskPackage.MINING_TASK_CONTAINER__MINING_APPLY_OUTPUT:
				return miningApplyOutput != null && !miningApplyOutput.isEmpty();
			case MiningTaskPackage.MINING_TASK_CONTAINER__MINING_APPLY_TASK:
				return miningApplyTask != null && !miningApplyTask.isEmpty();
			case MiningTaskPackage.MINING_TASK_CONTAINER__MINING_BUILD_TASK:
				return miningBuildTask != null && !miningBuildTask.isEmpty();
			case MiningTaskPackage.MINING_TASK_CONTAINER__MINING_TASK:
				return miningTask != null && !miningTask.isEmpty();
			case MiningTaskPackage.MINING_TASK_CONTAINER__MINING_TRANSFORMATION:
				return miningTransformation != null && !miningTransformation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MiningTask_containerImpl

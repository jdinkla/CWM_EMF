/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Classification.impl;

import CWM.Classification.ApplyTargetValueItem;
import CWM.Classification.ClassificationAttributeUsage;
import CWM.Classification.ClassificationFunctionSettings;
import CWM.Classification.ClassificationPackage;
import CWM.Classification.ClassificationTestResult;
import CWM.Classification.ClassificationTestTask;
import CWM.Classification.Classification_container;
import CWM.Classification.PriorProbabilities;
import CWM.Classification.PriorProbabilitiesEntry;

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
 * An implementation of the model object '<em><b>Classification container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.Classification.impl.Classification_containerImpl#getApplyTargetValueItem <em>Apply Target Value Item</em>}</li>
 *   <li>{@link CWM.Classification.impl.Classification_containerImpl#getClassificationAttributeUsage <em>Classification Attribute Usage</em>}</li>
 *   <li>{@link CWM.Classification.impl.Classification_containerImpl#getClassificationFunctionSettings <em>Classification Function Settings</em>}</li>
 *   <li>{@link CWM.Classification.impl.Classification_containerImpl#getClassificationTestResult <em>Classification Test Result</em>}</li>
 *   <li>{@link CWM.Classification.impl.Classification_containerImpl#getClassificationTestTask <em>Classification Test Task</em>}</li>
 *   <li>{@link CWM.Classification.impl.Classification_containerImpl#getPriorProbabilities <em>Prior Probabilities</em>}</li>
 *   <li>{@link CWM.Classification.impl.Classification_containerImpl#getPriorProbabilitiesEntry <em>Prior Probabilities Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Classification_containerImpl extends EObjectImpl implements Classification_container {
	/**
	 * The cached value of the '{@link #getApplyTargetValueItem() <em>Apply Target Value Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplyTargetValueItem()
	 * @generated
	 * @ordered
	 */
	protected EList<ApplyTargetValueItem> applyTargetValueItem;

	/**
	 * The cached value of the '{@link #getClassificationAttributeUsage() <em>Classification Attribute Usage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassificationAttributeUsage()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassificationAttributeUsage> classificationAttributeUsage;

	/**
	 * The cached value of the '{@link #getClassificationFunctionSettings() <em>Classification Function Settings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassificationFunctionSettings()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassificationFunctionSettings> classificationFunctionSettings;

	/**
	 * The cached value of the '{@link #getClassificationTestResult() <em>Classification Test Result</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassificationTestResult()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassificationTestResult> classificationTestResult;

	/**
	 * The cached value of the '{@link #getClassificationTestTask() <em>Classification Test Task</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassificationTestTask()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassificationTestTask> classificationTestTask;

	/**
	 * The cached value of the '{@link #getPriorProbabilities() <em>Prior Probabilities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorProbabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<PriorProbabilities> priorProbabilities;

	/**
	 * The cached value of the '{@link #getPriorProbabilitiesEntry() <em>Prior Probabilities Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorProbabilitiesEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<PriorProbabilitiesEntry> priorProbabilitiesEntry;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Classification_containerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassificationPackage.Literals.CLASSIFICATION_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ApplyTargetValueItem> getApplyTargetValueItem() {
		if (applyTargetValueItem == null) {
			applyTargetValueItem = new EObjectContainmentEList<ApplyTargetValueItem>(ApplyTargetValueItem.class, this, ClassificationPackage.CLASSIFICATION_CONTAINER__APPLY_TARGET_VALUE_ITEM);
		}
		return applyTargetValueItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassificationAttributeUsage> getClassificationAttributeUsage() {
		if (classificationAttributeUsage == null) {
			classificationAttributeUsage = new EObjectContainmentEList<ClassificationAttributeUsage>(ClassificationAttributeUsage.class, this, ClassificationPackage.CLASSIFICATION_CONTAINER__CLASSIFICATION_ATTRIBUTE_USAGE);
		}
		return classificationAttributeUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassificationFunctionSettings> getClassificationFunctionSettings() {
		if (classificationFunctionSettings == null) {
			classificationFunctionSettings = new EObjectContainmentEList<ClassificationFunctionSettings>(ClassificationFunctionSettings.class, this, ClassificationPackage.CLASSIFICATION_CONTAINER__CLASSIFICATION_FUNCTION_SETTINGS);
		}
		return classificationFunctionSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassificationTestResult> getClassificationTestResult() {
		if (classificationTestResult == null) {
			classificationTestResult = new EObjectContainmentEList<ClassificationTestResult>(ClassificationTestResult.class, this, ClassificationPackage.CLASSIFICATION_CONTAINER__CLASSIFICATION_TEST_RESULT);
		}
		return classificationTestResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassificationTestTask> getClassificationTestTask() {
		if (classificationTestTask == null) {
			classificationTestTask = new EObjectContainmentEList<ClassificationTestTask>(ClassificationTestTask.class, this, ClassificationPackage.CLASSIFICATION_CONTAINER__CLASSIFICATION_TEST_TASK);
		}
		return classificationTestTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PriorProbabilities> getPriorProbabilities() {
		if (priorProbabilities == null) {
			priorProbabilities = new EObjectContainmentEList<PriorProbabilities>(PriorProbabilities.class, this, ClassificationPackage.CLASSIFICATION_CONTAINER__PRIOR_PROBABILITIES);
		}
		return priorProbabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PriorProbabilitiesEntry> getPriorProbabilitiesEntry() {
		if (priorProbabilitiesEntry == null) {
			priorProbabilitiesEntry = new EObjectContainmentEList<PriorProbabilitiesEntry>(PriorProbabilitiesEntry.class, this, ClassificationPackage.CLASSIFICATION_CONTAINER__PRIOR_PROBABILITIES_ENTRY);
		}
		return priorProbabilitiesEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ClassificationPackage.CLASSIFICATION_CONTAINER__APPLY_TARGET_VALUE_ITEM:
				return ((InternalEList<?>)getApplyTargetValueItem()).basicRemove(otherEnd, msgs);
			case ClassificationPackage.CLASSIFICATION_CONTAINER__CLASSIFICATION_ATTRIBUTE_USAGE:
				return ((InternalEList<?>)getClassificationAttributeUsage()).basicRemove(otherEnd, msgs);
			case ClassificationPackage.CLASSIFICATION_CONTAINER__CLASSIFICATION_FUNCTION_SETTINGS:
				return ((InternalEList<?>)getClassificationFunctionSettings()).basicRemove(otherEnd, msgs);
			case ClassificationPackage.CLASSIFICATION_CONTAINER__CLASSIFICATION_TEST_RESULT:
				return ((InternalEList<?>)getClassificationTestResult()).basicRemove(otherEnd, msgs);
			case ClassificationPackage.CLASSIFICATION_CONTAINER__CLASSIFICATION_TEST_TASK:
				return ((InternalEList<?>)getClassificationTestTask()).basicRemove(otherEnd, msgs);
			case ClassificationPackage.CLASSIFICATION_CONTAINER__PRIOR_PROBABILITIES:
				return ((InternalEList<?>)getPriorProbabilities()).basicRemove(otherEnd, msgs);
			case ClassificationPackage.CLASSIFICATION_CONTAINER__PRIOR_PROBABILITIES_ENTRY:
				return ((InternalEList<?>)getPriorProbabilitiesEntry()).basicRemove(otherEnd, msgs);
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
			case ClassificationPackage.CLASSIFICATION_CONTAINER__APPLY_TARGET_VALUE_ITEM:
				return getApplyTargetValueItem();
			case ClassificationPackage.CLASSIFICATION_CONTAINER__CLASSIFICATION_ATTRIBUTE_USAGE:
				return getClassificationAttributeUsage();
			case ClassificationPackage.CLASSIFICATION_CONTAINER__CLASSIFICATION_FUNCTION_SETTINGS:
				return getClassificationFunctionSettings();
			case ClassificationPackage.CLASSIFICATION_CONTAINER__CLASSIFICATION_TEST_RESULT:
				return getClassificationTestResult();
			case ClassificationPackage.CLASSIFICATION_CONTAINER__CLASSIFICATION_TEST_TASK:
				return getClassificationTestTask();
			case ClassificationPackage.CLASSIFICATION_CONTAINER__PRIOR_PROBABILITIES:
				return getPriorProbabilities();
			case ClassificationPackage.CLASSIFICATION_CONTAINER__PRIOR_PROBABILITIES_ENTRY:
				return getPriorProbabilitiesEntry();
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
			case ClassificationPackage.CLASSIFICATION_CONTAINER__APPLY_TARGET_VALUE_ITEM:
				getApplyTargetValueItem().clear();
				getApplyTargetValueItem().addAll((Collection<? extends ApplyTargetValueItem>)newValue);
				return;
			case ClassificationPackage.CLASSIFICATION_CONTAINER__CLASSIFICATION_ATTRIBUTE_USAGE:
				getClassificationAttributeUsage().clear();
				getClassificationAttributeUsage().addAll((Collection<? extends ClassificationAttributeUsage>)newValue);
				return;
			case ClassificationPackage.CLASSIFICATION_CONTAINER__CLASSIFICATION_FUNCTION_SETTINGS:
				getClassificationFunctionSettings().clear();
				getClassificationFunctionSettings().addAll((Collection<? extends ClassificationFunctionSettings>)newValue);
				return;
			case ClassificationPackage.CLASSIFICATION_CONTAINER__CLASSIFICATION_TEST_RESULT:
				getClassificationTestResult().clear();
				getClassificationTestResult().addAll((Collection<? extends ClassificationTestResult>)newValue);
				return;
			case ClassificationPackage.CLASSIFICATION_CONTAINER__CLASSIFICATION_TEST_TASK:
				getClassificationTestTask().clear();
				getClassificationTestTask().addAll((Collection<? extends ClassificationTestTask>)newValue);
				return;
			case ClassificationPackage.CLASSIFICATION_CONTAINER__PRIOR_PROBABILITIES:
				getPriorProbabilities().clear();
				getPriorProbabilities().addAll((Collection<? extends PriorProbabilities>)newValue);
				return;
			case ClassificationPackage.CLASSIFICATION_CONTAINER__PRIOR_PROBABILITIES_ENTRY:
				getPriorProbabilitiesEntry().clear();
				getPriorProbabilitiesEntry().addAll((Collection<? extends PriorProbabilitiesEntry>)newValue);
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
			case ClassificationPackage.CLASSIFICATION_CONTAINER__APPLY_TARGET_VALUE_ITEM:
				getApplyTargetValueItem().clear();
				return;
			case ClassificationPackage.CLASSIFICATION_CONTAINER__CLASSIFICATION_ATTRIBUTE_USAGE:
				getClassificationAttributeUsage().clear();
				return;
			case ClassificationPackage.CLASSIFICATION_CONTAINER__CLASSIFICATION_FUNCTION_SETTINGS:
				getClassificationFunctionSettings().clear();
				return;
			case ClassificationPackage.CLASSIFICATION_CONTAINER__CLASSIFICATION_TEST_RESULT:
				getClassificationTestResult().clear();
				return;
			case ClassificationPackage.CLASSIFICATION_CONTAINER__CLASSIFICATION_TEST_TASK:
				getClassificationTestTask().clear();
				return;
			case ClassificationPackage.CLASSIFICATION_CONTAINER__PRIOR_PROBABILITIES:
				getPriorProbabilities().clear();
				return;
			case ClassificationPackage.CLASSIFICATION_CONTAINER__PRIOR_PROBABILITIES_ENTRY:
				getPriorProbabilitiesEntry().clear();
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
			case ClassificationPackage.CLASSIFICATION_CONTAINER__APPLY_TARGET_VALUE_ITEM:
				return applyTargetValueItem != null && !applyTargetValueItem.isEmpty();
			case ClassificationPackage.CLASSIFICATION_CONTAINER__CLASSIFICATION_ATTRIBUTE_USAGE:
				return classificationAttributeUsage != null && !classificationAttributeUsage.isEmpty();
			case ClassificationPackage.CLASSIFICATION_CONTAINER__CLASSIFICATION_FUNCTION_SETTINGS:
				return classificationFunctionSettings != null && !classificationFunctionSettings.isEmpty();
			case ClassificationPackage.CLASSIFICATION_CONTAINER__CLASSIFICATION_TEST_RESULT:
				return classificationTestResult != null && !classificationTestResult.isEmpty();
			case ClassificationPackage.CLASSIFICATION_CONTAINER__CLASSIFICATION_TEST_TASK:
				return classificationTestTask != null && !classificationTestTask.isEmpty();
			case ClassificationPackage.CLASSIFICATION_CONTAINER__PRIOR_PROBABILITIES:
				return priorProbabilities != null && !priorProbabilities.isEmpty();
			case ClassificationPackage.CLASSIFICATION_CONTAINER__PRIOR_PROBABILITIES_ENTRY:
				return priorProbabilitiesEntry != null && !priorProbabilitiesEntry.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Classification_containerImpl

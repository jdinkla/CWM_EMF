/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.CwmTransformation.impl;

import CWM.CwmTransformation.ClassifierFeatureMap;
import CWM.CwmTransformation.ClassifierMap;
import CWM.CwmTransformation.CwmTransformationPackage;
import CWM.CwmTransformation.DataObjectSet;
import CWM.CwmTransformation.FeatureMap;
import CWM.CwmTransformation.PrecedenceConstraint;
import CWM.CwmTransformation.StepPrecedence;
import CWM.CwmTransformation.Transformation;
import CWM.CwmTransformation.TransformationActivity;
import CWM.CwmTransformation.TransformationMap;
import CWM.CwmTransformation.TransformationStep;
import CWM.CwmTransformation.TransformationTask;
import CWM.CwmTransformation.TransformationTree;
import CWM.CwmTransformation.TransformationUse;
import CWM.CwmTransformation.Transformation_container;

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
 * An implementation of the model object '<em><b>Transformation container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.CwmTransformation.impl.Transformation_containerImpl#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link CWM.CwmTransformation.impl.Transformation_containerImpl#getDataObjectSet <em>Data Object Set</em>}</li>
 *   <li>{@link CWM.CwmTransformation.impl.Transformation_containerImpl#getTransformationTask <em>Transformation Task</em>}</li>
 *   <li>{@link CWM.CwmTransformation.impl.Transformation_containerImpl#getTransformationStep <em>Transformation Step</em>}</li>
 *   <li>{@link CWM.CwmTransformation.impl.Transformation_containerImpl#getTransformationActivity <em>Transformation Activity</em>}</li>
 *   <li>{@link CWM.CwmTransformation.impl.Transformation_containerImpl#getPrecedenceConstraint <em>Precedence Constraint</em>}</li>
 *   <li>{@link CWM.CwmTransformation.impl.Transformation_containerImpl#getTransformationUse <em>Transformation Use</em>}</li>
 *   <li>{@link CWM.CwmTransformation.impl.Transformation_containerImpl#getTransformationMap <em>Transformation Map</em>}</li>
 *   <li>{@link CWM.CwmTransformation.impl.Transformation_containerImpl#getTransformationTree <em>Transformation Tree</em>}</li>
 *   <li>{@link CWM.CwmTransformation.impl.Transformation_containerImpl#getClassifierMap <em>Classifier Map</em>}</li>
 *   <li>{@link CWM.CwmTransformation.impl.Transformation_containerImpl#getFeatureMap <em>Feature Map</em>}</li>
 *   <li>{@link CWM.CwmTransformation.impl.Transformation_containerImpl#getStepPrecedence <em>Step Precedence</em>}</li>
 *   <li>{@link CWM.CwmTransformation.impl.Transformation_containerImpl#getClassifierFeatureMap <em>Classifier Feature Map</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Transformation_containerImpl extends EObjectImpl implements Transformation_container {
	/**
	 * The cached value of the '{@link #getTransformation() <em>Transformation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformation()
	 * @generated
	 * @ordered
	 */
	protected EList<Transformation> transformation;

	/**
	 * The cached value of the '{@link #getDataObjectSet() <em>Data Object Set</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataObjectSet()
	 * @generated
	 * @ordered
	 */
	protected EList<DataObjectSet> dataObjectSet;

	/**
	 * The cached value of the '{@link #getTransformationTask() <em>Transformation Task</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformationTask()
	 * @generated
	 * @ordered
	 */
	protected EList<TransformationTask> transformationTask;

	/**
	 * The cached value of the '{@link #getTransformationStep() <em>Transformation Step</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformationStep()
	 * @generated
	 * @ordered
	 */
	protected EList<TransformationStep> transformationStep;

	/**
	 * The cached value of the '{@link #getTransformationActivity() <em>Transformation Activity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformationActivity()
	 * @generated
	 * @ordered
	 */
	protected EList<TransformationActivity> transformationActivity;

	/**
	 * The cached value of the '{@link #getPrecedenceConstraint() <em>Precedence Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecedenceConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<PrecedenceConstraint> precedenceConstraint;

	/**
	 * The cached value of the '{@link #getTransformationUse() <em>Transformation Use</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformationUse()
	 * @generated
	 * @ordered
	 */
	protected EList<TransformationUse> transformationUse;

	/**
	 * The cached value of the '{@link #getTransformationMap() <em>Transformation Map</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformationMap()
	 * @generated
	 * @ordered
	 */
	protected EList<TransformationMap> transformationMap;

	/**
	 * The cached value of the '{@link #getTransformationTree() <em>Transformation Tree</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformationTree()
	 * @generated
	 * @ordered
	 */
	protected EList<TransformationTree> transformationTree;

	/**
	 * The cached value of the '{@link #getClassifierMap() <em>Classifier Map</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifierMap()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassifierMap> classifierMap;

	/**
	 * The cached value of the '{@link #getFeatureMap() <em>Feature Map</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureMap()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureMap> featureMap;

	/**
	 * The cached value of the '{@link #getStepPrecedence() <em>Step Precedence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepPrecedence()
	 * @generated
	 * @ordered
	 */
	protected EList<StepPrecedence> stepPrecedence;

	/**
	 * The cached value of the '{@link #getClassifierFeatureMap() <em>Classifier Feature Map</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifierFeatureMap()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassifierFeatureMap> classifierFeatureMap;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Transformation_containerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CwmTransformationPackage.Literals.TRANSFORMATION_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transformation> getTransformation() {
		if (transformation == null) {
			transformation = new EObjectContainmentEList<Transformation>(Transformation.class, this, CwmTransformationPackage.TRANSFORMATION_CONTAINER__TRANSFORMATION);
		}
		return transformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataObjectSet> getDataObjectSet() {
		if (dataObjectSet == null) {
			dataObjectSet = new EObjectContainmentEList<DataObjectSet>(DataObjectSet.class, this, CwmTransformationPackage.TRANSFORMATION_CONTAINER__DATA_OBJECT_SET);
		}
		return dataObjectSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransformationTask> getTransformationTask() {
		if (transformationTask == null) {
			transformationTask = new EObjectContainmentEList<TransformationTask>(TransformationTask.class, this, CwmTransformationPackage.TRANSFORMATION_CONTAINER__TRANSFORMATION_TASK);
		}
		return transformationTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransformationStep> getTransformationStep() {
		if (transformationStep == null) {
			transformationStep = new EObjectContainmentEList<TransformationStep>(TransformationStep.class, this, CwmTransformationPackage.TRANSFORMATION_CONTAINER__TRANSFORMATION_STEP);
		}
		return transformationStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransformationActivity> getTransformationActivity() {
		if (transformationActivity == null) {
			transformationActivity = new EObjectContainmentEList<TransformationActivity>(TransformationActivity.class, this, CwmTransformationPackage.TRANSFORMATION_CONTAINER__TRANSFORMATION_ACTIVITY);
		}
		return transformationActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrecedenceConstraint> getPrecedenceConstraint() {
		if (precedenceConstraint == null) {
			precedenceConstraint = new EObjectContainmentEList<PrecedenceConstraint>(PrecedenceConstraint.class, this, CwmTransformationPackage.TRANSFORMATION_CONTAINER__PRECEDENCE_CONSTRAINT);
		}
		return precedenceConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransformationUse> getTransformationUse() {
		if (transformationUse == null) {
			transformationUse = new EObjectContainmentEList<TransformationUse>(TransformationUse.class, this, CwmTransformationPackage.TRANSFORMATION_CONTAINER__TRANSFORMATION_USE);
		}
		return transformationUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransformationMap> getTransformationMap() {
		if (transformationMap == null) {
			transformationMap = new EObjectContainmentEList<TransformationMap>(TransformationMap.class, this, CwmTransformationPackage.TRANSFORMATION_CONTAINER__TRANSFORMATION_MAP);
		}
		return transformationMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransformationTree> getTransformationTree() {
		if (transformationTree == null) {
			transformationTree = new EObjectContainmentEList<TransformationTree>(TransformationTree.class, this, CwmTransformationPackage.TRANSFORMATION_CONTAINER__TRANSFORMATION_TREE);
		}
		return transformationTree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassifierMap> getClassifierMap() {
		if (classifierMap == null) {
			classifierMap = new EObjectContainmentEList<ClassifierMap>(ClassifierMap.class, this, CwmTransformationPackage.TRANSFORMATION_CONTAINER__CLASSIFIER_MAP);
		}
		return classifierMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureMap> getFeatureMap() {
		if (featureMap == null) {
			featureMap = new EObjectContainmentEList<FeatureMap>(FeatureMap.class, this, CwmTransformationPackage.TRANSFORMATION_CONTAINER__FEATURE_MAP);
		}
		return featureMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StepPrecedence> getStepPrecedence() {
		if (stepPrecedence == null) {
			stepPrecedence = new EObjectContainmentEList<StepPrecedence>(StepPrecedence.class, this, CwmTransformationPackage.TRANSFORMATION_CONTAINER__STEP_PRECEDENCE);
		}
		return stepPrecedence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassifierFeatureMap> getClassifierFeatureMap() {
		if (classifierFeatureMap == null) {
			classifierFeatureMap = new EObjectContainmentEList<ClassifierFeatureMap>(ClassifierFeatureMap.class, this, CwmTransformationPackage.TRANSFORMATION_CONTAINER__CLASSIFIER_FEATURE_MAP);
		}
		return classifierFeatureMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__TRANSFORMATION:
				return ((InternalEList<?>)getTransformation()).basicRemove(otherEnd, msgs);
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__DATA_OBJECT_SET:
				return ((InternalEList<?>)getDataObjectSet()).basicRemove(otherEnd, msgs);
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__TRANSFORMATION_TASK:
				return ((InternalEList<?>)getTransformationTask()).basicRemove(otherEnd, msgs);
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__TRANSFORMATION_STEP:
				return ((InternalEList<?>)getTransformationStep()).basicRemove(otherEnd, msgs);
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__TRANSFORMATION_ACTIVITY:
				return ((InternalEList<?>)getTransformationActivity()).basicRemove(otherEnd, msgs);
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__PRECEDENCE_CONSTRAINT:
				return ((InternalEList<?>)getPrecedenceConstraint()).basicRemove(otherEnd, msgs);
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__TRANSFORMATION_USE:
				return ((InternalEList<?>)getTransformationUse()).basicRemove(otherEnd, msgs);
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__TRANSFORMATION_MAP:
				return ((InternalEList<?>)getTransformationMap()).basicRemove(otherEnd, msgs);
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__TRANSFORMATION_TREE:
				return ((InternalEList<?>)getTransformationTree()).basicRemove(otherEnd, msgs);
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__CLASSIFIER_MAP:
				return ((InternalEList<?>)getClassifierMap()).basicRemove(otherEnd, msgs);
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__FEATURE_MAP:
				return ((InternalEList<?>)getFeatureMap()).basicRemove(otherEnd, msgs);
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__STEP_PRECEDENCE:
				return ((InternalEList<?>)getStepPrecedence()).basicRemove(otherEnd, msgs);
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__CLASSIFIER_FEATURE_MAP:
				return ((InternalEList<?>)getClassifierFeatureMap()).basicRemove(otherEnd, msgs);
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
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__TRANSFORMATION:
				return getTransformation();
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__DATA_OBJECT_SET:
				return getDataObjectSet();
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__TRANSFORMATION_TASK:
				return getTransformationTask();
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__TRANSFORMATION_STEP:
				return getTransformationStep();
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__TRANSFORMATION_ACTIVITY:
				return getTransformationActivity();
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__PRECEDENCE_CONSTRAINT:
				return getPrecedenceConstraint();
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__TRANSFORMATION_USE:
				return getTransformationUse();
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__TRANSFORMATION_MAP:
				return getTransformationMap();
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__TRANSFORMATION_TREE:
				return getTransformationTree();
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__CLASSIFIER_MAP:
				return getClassifierMap();
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__FEATURE_MAP:
				return getFeatureMap();
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__STEP_PRECEDENCE:
				return getStepPrecedence();
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__CLASSIFIER_FEATURE_MAP:
				return getClassifierFeatureMap();
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
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__TRANSFORMATION:
				getTransformation().clear();
				getTransformation().addAll((Collection<? extends Transformation>)newValue);
				return;
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__DATA_OBJECT_SET:
				getDataObjectSet().clear();
				getDataObjectSet().addAll((Collection<? extends DataObjectSet>)newValue);
				return;
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__TRANSFORMATION_TASK:
				getTransformationTask().clear();
				getTransformationTask().addAll((Collection<? extends TransformationTask>)newValue);
				return;
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__TRANSFORMATION_STEP:
				getTransformationStep().clear();
				getTransformationStep().addAll((Collection<? extends TransformationStep>)newValue);
				return;
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__TRANSFORMATION_ACTIVITY:
				getTransformationActivity().clear();
				getTransformationActivity().addAll((Collection<? extends TransformationActivity>)newValue);
				return;
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__PRECEDENCE_CONSTRAINT:
				getPrecedenceConstraint().clear();
				getPrecedenceConstraint().addAll((Collection<? extends PrecedenceConstraint>)newValue);
				return;
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__TRANSFORMATION_USE:
				getTransformationUse().clear();
				getTransformationUse().addAll((Collection<? extends TransformationUse>)newValue);
				return;
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__TRANSFORMATION_MAP:
				getTransformationMap().clear();
				getTransformationMap().addAll((Collection<? extends TransformationMap>)newValue);
				return;
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__TRANSFORMATION_TREE:
				getTransformationTree().clear();
				getTransformationTree().addAll((Collection<? extends TransformationTree>)newValue);
				return;
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__CLASSIFIER_MAP:
				getClassifierMap().clear();
				getClassifierMap().addAll((Collection<? extends ClassifierMap>)newValue);
				return;
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__FEATURE_MAP:
				getFeatureMap().clear();
				getFeatureMap().addAll((Collection<? extends FeatureMap>)newValue);
				return;
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__STEP_PRECEDENCE:
				getStepPrecedence().clear();
				getStepPrecedence().addAll((Collection<? extends StepPrecedence>)newValue);
				return;
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__CLASSIFIER_FEATURE_MAP:
				getClassifierFeatureMap().clear();
				getClassifierFeatureMap().addAll((Collection<? extends ClassifierFeatureMap>)newValue);
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
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__TRANSFORMATION:
				getTransformation().clear();
				return;
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__DATA_OBJECT_SET:
				getDataObjectSet().clear();
				return;
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__TRANSFORMATION_TASK:
				getTransformationTask().clear();
				return;
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__TRANSFORMATION_STEP:
				getTransformationStep().clear();
				return;
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__TRANSFORMATION_ACTIVITY:
				getTransformationActivity().clear();
				return;
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__PRECEDENCE_CONSTRAINT:
				getPrecedenceConstraint().clear();
				return;
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__TRANSFORMATION_USE:
				getTransformationUse().clear();
				return;
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__TRANSFORMATION_MAP:
				getTransformationMap().clear();
				return;
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__TRANSFORMATION_TREE:
				getTransformationTree().clear();
				return;
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__CLASSIFIER_MAP:
				getClassifierMap().clear();
				return;
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__FEATURE_MAP:
				getFeatureMap().clear();
				return;
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__STEP_PRECEDENCE:
				getStepPrecedence().clear();
				return;
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__CLASSIFIER_FEATURE_MAP:
				getClassifierFeatureMap().clear();
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
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__TRANSFORMATION:
				return transformation != null && !transformation.isEmpty();
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__DATA_OBJECT_SET:
				return dataObjectSet != null && !dataObjectSet.isEmpty();
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__TRANSFORMATION_TASK:
				return transformationTask != null && !transformationTask.isEmpty();
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__TRANSFORMATION_STEP:
				return transformationStep != null && !transformationStep.isEmpty();
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__TRANSFORMATION_ACTIVITY:
				return transformationActivity != null && !transformationActivity.isEmpty();
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__PRECEDENCE_CONSTRAINT:
				return precedenceConstraint != null && !precedenceConstraint.isEmpty();
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__TRANSFORMATION_USE:
				return transformationUse != null && !transformationUse.isEmpty();
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__TRANSFORMATION_MAP:
				return transformationMap != null && !transformationMap.isEmpty();
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__TRANSFORMATION_TREE:
				return transformationTree != null && !transformationTree.isEmpty();
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__CLASSIFIER_MAP:
				return classifierMap != null && !classifierMap.isEmpty();
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__FEATURE_MAP:
				return featureMap != null && !featureMap.isEmpty();
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__STEP_PRECEDENCE:
				return stepPrecedence != null && !stepPrecedence.isEmpty();
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__CLASSIFIER_FEATURE_MAP:
				return classifierFeatureMap != null && !classifierFeatureMap.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Transformation_containerImpl

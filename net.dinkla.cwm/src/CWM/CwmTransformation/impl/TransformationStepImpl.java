/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.CwmTransformation.impl;

import CWM.Core.Constraint;
import CWM.Core.Dependency;
import CWM.Core.Namespace;

import CWM.Core.impl.ModelElementImpl;

import CWM.CwmTransformation.CwmTransformationPackage;
import CWM.CwmTransformation.TransformationStep;
import CWM.CwmTransformation.TransformationTask;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformation Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.CwmTransformation.impl.TransformationStepImpl#getTask <em>Task</em>}</li>
 *   <li>{@link CWM.CwmTransformation.impl.TransformationStepImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link CWM.CwmTransformation.impl.TransformationStepImpl#getPrecedence <em>Precedence</em>}</li>
 *   <li>{@link CWM.CwmTransformation.impl.TransformationStepImpl#getPrecedingStep <em>Preceding Step</em>}</li>
 *   <li>{@link CWM.CwmTransformation.impl.TransformationStepImpl#getSucceedingStep <em>Succeeding Step</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransformationStepImpl extends ModelElementImpl implements TransformationStep {
	/**
	 * The cached value of the '{@link #getTask() <em>Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTask()
	 * @generated
	 * @ordered
	 */
	protected TransformationTask task;

	/**
	 * The cached value of the '{@link #getActivity() <em>Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected Namespace activity;

	/**
	 * The cached value of the '{@link #getPrecedence() <em>Precedence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecedence()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> precedence;

	/**
	 * The cached value of the '{@link #getPrecedingStep() <em>Preceding Step</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecedingStep()
	 * @generated
	 * @ordered
	 */
	protected EList<Dependency> precedingStep;

	/**
	 * The cached value of the '{@link #getSucceedingStep() <em>Succeeding Step</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSucceedingStep()
	 * @generated
	 * @ordered
	 */
	protected EList<Dependency> succeedingStep;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformationStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CwmTransformationPackage.Literals.TRANSFORMATION_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationTask getTask() {
		if (task != null && task.eIsProxy()) {
			InternalEObject oldTask = (InternalEObject)task;
			task = (TransformationTask)eResolveProxy(oldTask);
			if (task != oldTask) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CwmTransformationPackage.TRANSFORMATION_STEP__TASK, oldTask, task));
			}
		}
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationTask basicGetTask() {
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTask(TransformationTask newTask) {
		TransformationTask oldTask = task;
		task = newTask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CwmTransformationPackage.TRANSFORMATION_STEP__TASK, oldTask, task));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace getActivity() {
		if (activity != null && activity.eIsProxy()) {
			InternalEObject oldActivity = (InternalEObject)activity;
			activity = (Namespace)eResolveProxy(oldActivity);
			if (activity != oldActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CwmTransformationPackage.TRANSFORMATION_STEP__ACTIVITY, oldActivity, activity));
			}
		}
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace basicGetActivity() {
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivity(Namespace newActivity) {
		Namespace oldActivity = activity;
		activity = newActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CwmTransformationPackage.TRANSFORMATION_STEP__ACTIVITY, oldActivity, activity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getPrecedence() {
		if (precedence == null) {
			precedence = new EObjectResolvingEList<Constraint>(Constraint.class, this, CwmTransformationPackage.TRANSFORMATION_STEP__PRECEDENCE);
		}
		return precedence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dependency> getPrecedingStep() {
		if (precedingStep == null) {
			precedingStep = new EObjectResolvingEList<Dependency>(Dependency.class, this, CwmTransformationPackage.TRANSFORMATION_STEP__PRECEDING_STEP);
		}
		return precedingStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dependency> getSucceedingStep() {
		if (succeedingStep == null) {
			succeedingStep = new EObjectResolvingEList<Dependency>(Dependency.class, this, CwmTransformationPackage.TRANSFORMATION_STEP__SUCCEEDING_STEP);
		}
		return succeedingStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CwmTransformationPackage.TRANSFORMATION_STEP__TASK:
				if (resolve) return getTask();
				return basicGetTask();
			case CwmTransformationPackage.TRANSFORMATION_STEP__ACTIVITY:
				if (resolve) return getActivity();
				return basicGetActivity();
			case CwmTransformationPackage.TRANSFORMATION_STEP__PRECEDENCE:
				return getPrecedence();
			case CwmTransformationPackage.TRANSFORMATION_STEP__PRECEDING_STEP:
				return getPrecedingStep();
			case CwmTransformationPackage.TRANSFORMATION_STEP__SUCCEEDING_STEP:
				return getSucceedingStep();
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
			case CwmTransformationPackage.TRANSFORMATION_STEP__TASK:
				setTask((TransformationTask)newValue);
				return;
			case CwmTransformationPackage.TRANSFORMATION_STEP__ACTIVITY:
				setActivity((Namespace)newValue);
				return;
			case CwmTransformationPackage.TRANSFORMATION_STEP__PRECEDENCE:
				getPrecedence().clear();
				getPrecedence().addAll((Collection<? extends Constraint>)newValue);
				return;
			case CwmTransformationPackage.TRANSFORMATION_STEP__PRECEDING_STEP:
				getPrecedingStep().clear();
				getPrecedingStep().addAll((Collection<? extends Dependency>)newValue);
				return;
			case CwmTransformationPackage.TRANSFORMATION_STEP__SUCCEEDING_STEP:
				getSucceedingStep().clear();
				getSucceedingStep().addAll((Collection<? extends Dependency>)newValue);
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
			case CwmTransformationPackage.TRANSFORMATION_STEP__TASK:
				setTask((TransformationTask)null);
				return;
			case CwmTransformationPackage.TRANSFORMATION_STEP__ACTIVITY:
				setActivity((Namespace)null);
				return;
			case CwmTransformationPackage.TRANSFORMATION_STEP__PRECEDENCE:
				getPrecedence().clear();
				return;
			case CwmTransformationPackage.TRANSFORMATION_STEP__PRECEDING_STEP:
				getPrecedingStep().clear();
				return;
			case CwmTransformationPackage.TRANSFORMATION_STEP__SUCCEEDING_STEP:
				getSucceedingStep().clear();
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
			case CwmTransformationPackage.TRANSFORMATION_STEP__TASK:
				return task != null;
			case CwmTransformationPackage.TRANSFORMATION_STEP__ACTIVITY:
				return activity != null;
			case CwmTransformationPackage.TRANSFORMATION_STEP__PRECEDENCE:
				return precedence != null && !precedence.isEmpty();
			case CwmTransformationPackage.TRANSFORMATION_STEP__PRECEDING_STEP:
				return precedingStep != null && !precedingStep.isEmpty();
			case CwmTransformationPackage.TRANSFORMATION_STEP__SUCCEEDING_STEP:
				return succeedingStep != null && !succeedingStep.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TransformationStepImpl

/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.CwmTransformation.impl;

import CWM.CwmTransformation.CwmTransformationPackage;
import CWM.CwmTransformation.Transformation;
import CWM.CwmTransformation.TransformationTask;

import CWM.SoftwareDeployment.impl.ComponentImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformation Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.CwmTransformation.impl.TransformationTaskImpl#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link CWM.CwmTransformation.impl.TransformationTaskImpl#getInverseTask <em>Inverse Task</em>}</li>
 *   <li>{@link CWM.CwmTransformation.impl.TransformationTaskImpl#getOriginalTask <em>Original Task</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransformationTaskImpl extends ComponentImpl implements TransformationTask {
	/**
	 * The cached value of the '{@link #getTransformation() <em>Transformation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformation()
	 * @generated
	 * @ordered
	 */
	protected EList<Transformation> transformation;

	/**
	 * The cached value of the '{@link #getInverseTask() <em>Inverse Task</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInverseTask()
	 * @generated
	 * @ordered
	 */
	protected EList<TransformationTask> inverseTask;

	/**
	 * The cached value of the '{@link #getOriginalTask() <em>Original Task</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalTask()
	 * @generated
	 * @ordered
	 */
	protected EList<TransformationTask> originalTask;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformationTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CwmTransformationPackage.Literals.TRANSFORMATION_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transformation> getTransformation() {
		if (transformation == null) {
			transformation = new EObjectResolvingEList<Transformation>(Transformation.class, this, CwmTransformationPackage.TRANSFORMATION_TASK__TRANSFORMATION);
		}
		return transformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransformationTask> getInverseTask() {
		if (inverseTask == null) {
			inverseTask = new EObjectWithInverseResolvingEList.ManyInverse<TransformationTask>(TransformationTask.class, this, CwmTransformationPackage.TRANSFORMATION_TASK__INVERSE_TASK, CwmTransformationPackage.TRANSFORMATION_TASK__ORIGINAL_TASK);
		}
		return inverseTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransformationTask> getOriginalTask() {
		if (originalTask == null) {
			originalTask = new EObjectWithInverseResolvingEList.ManyInverse<TransformationTask>(TransformationTask.class, this, CwmTransformationPackage.TRANSFORMATION_TASK__ORIGINAL_TASK, CwmTransformationPackage.TRANSFORMATION_TASK__INVERSE_TASK);
		}
		return originalTask;
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
			case CwmTransformationPackage.TRANSFORMATION_TASK__INVERSE_TASK:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInverseTask()).basicAdd(otherEnd, msgs);
			case CwmTransformationPackage.TRANSFORMATION_TASK__ORIGINAL_TASK:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOriginalTask()).basicAdd(otherEnd, msgs);
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
			case CwmTransformationPackage.TRANSFORMATION_TASK__INVERSE_TASK:
				return ((InternalEList<?>)getInverseTask()).basicRemove(otherEnd, msgs);
			case CwmTransformationPackage.TRANSFORMATION_TASK__ORIGINAL_TASK:
				return ((InternalEList<?>)getOriginalTask()).basicRemove(otherEnd, msgs);
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
			case CwmTransformationPackage.TRANSFORMATION_TASK__TRANSFORMATION:
				return getTransformation();
			case CwmTransformationPackage.TRANSFORMATION_TASK__INVERSE_TASK:
				return getInverseTask();
			case CwmTransformationPackage.TRANSFORMATION_TASK__ORIGINAL_TASK:
				return getOriginalTask();
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
			case CwmTransformationPackage.TRANSFORMATION_TASK__TRANSFORMATION:
				getTransformation().clear();
				getTransformation().addAll((Collection<? extends Transformation>)newValue);
				return;
			case CwmTransformationPackage.TRANSFORMATION_TASK__INVERSE_TASK:
				getInverseTask().clear();
				getInverseTask().addAll((Collection<? extends TransformationTask>)newValue);
				return;
			case CwmTransformationPackage.TRANSFORMATION_TASK__ORIGINAL_TASK:
				getOriginalTask().clear();
				getOriginalTask().addAll((Collection<? extends TransformationTask>)newValue);
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
			case CwmTransformationPackage.TRANSFORMATION_TASK__TRANSFORMATION:
				getTransformation().clear();
				return;
			case CwmTransformationPackage.TRANSFORMATION_TASK__INVERSE_TASK:
				getInverseTask().clear();
				return;
			case CwmTransformationPackage.TRANSFORMATION_TASK__ORIGINAL_TASK:
				getOriginalTask().clear();
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
			case CwmTransformationPackage.TRANSFORMATION_TASK__TRANSFORMATION:
				return transformation != null && !transformation.isEmpty();
			case CwmTransformationPackage.TRANSFORMATION_TASK__INVERSE_TASK:
				return inverseTask != null && !inverseTask.isEmpty();
			case CwmTransformationPackage.TRANSFORMATION_TASK__ORIGINAL_TASK:
				return originalTask != null && !originalTask.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TransformationTaskImpl

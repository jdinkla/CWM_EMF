/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.CwmTransformation.impl;

import CWM.Core.ModelElement;

import CWM.Core.impl.DependencyImpl;

import CWM.CwmTransformation.CwmTransformationPackage;
import CWM.CwmTransformation.StepPrecedence;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Step Precedence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.CwmTransformation.impl.StepPrecedenceImpl#getPrecedingStep <em>Preceding Step</em>}</li>
 *   <li>{@link CWM.CwmTransformation.impl.StepPrecedenceImpl#getSucceedingStep <em>Succeeding Step</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StepPrecedenceImpl extends DependencyImpl implements StepPrecedence {
	/**
	 * The cached value of the '{@link #getPrecedingStep() <em>Preceding Step</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecedingStep()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelElement> precedingStep;

	/**
	 * The cached value of the '{@link #getSucceedingStep() <em>Succeeding Step</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSucceedingStep()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelElement> succeedingStep;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StepPrecedenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CwmTransformationPackage.Literals.STEP_PRECEDENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelElement> getPrecedingStep() {
		if (precedingStep == null) {
			precedingStep = new EObjectResolvingEList<ModelElement>(ModelElement.class, this, CwmTransformationPackage.STEP_PRECEDENCE__PRECEDING_STEP);
		}
		return precedingStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelElement> getSucceedingStep() {
		if (succeedingStep == null) {
			succeedingStep = new EObjectResolvingEList<ModelElement>(ModelElement.class, this, CwmTransformationPackage.STEP_PRECEDENCE__SUCCEEDING_STEP);
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
			case CwmTransformationPackage.STEP_PRECEDENCE__PRECEDING_STEP:
				return getPrecedingStep();
			case CwmTransformationPackage.STEP_PRECEDENCE__SUCCEEDING_STEP:
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
			case CwmTransformationPackage.STEP_PRECEDENCE__PRECEDING_STEP:
				getPrecedingStep().clear();
				getPrecedingStep().addAll((Collection<? extends ModelElement>)newValue);
				return;
			case CwmTransformationPackage.STEP_PRECEDENCE__SUCCEEDING_STEP:
				getSucceedingStep().clear();
				getSucceedingStep().addAll((Collection<? extends ModelElement>)newValue);
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
			case CwmTransformationPackage.STEP_PRECEDENCE__PRECEDING_STEP:
				getPrecedingStep().clear();
				return;
			case CwmTransformationPackage.STEP_PRECEDENCE__SUCCEEDING_STEP:
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
			case CwmTransformationPackage.STEP_PRECEDENCE__PRECEDING_STEP:
				return precedingStep != null && !precedingStep.isEmpty();
			case CwmTransformationPackage.STEP_PRECEDENCE__SUCCEEDING_STEP:
				return succeedingStep != null && !succeedingStep.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StepPrecedenceImpl

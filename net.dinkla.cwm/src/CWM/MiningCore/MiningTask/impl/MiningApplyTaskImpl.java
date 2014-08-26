/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningTask.impl;

import CWM.MiningCore.MiningData.AttributeAssignmentSet;

import CWM.MiningCore.MiningTask.ApplyOutputOption;
import CWM.MiningCore.MiningTask.MiningApplyOutput;
import CWM.MiningCore.MiningTask.MiningApplyTask;
import CWM.MiningCore.MiningTask.MiningTaskPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mining Apply Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.MiningCore.MiningTask.impl.MiningApplyTaskImpl#getApplyOutput <em>Apply Output</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningTask.impl.MiningApplyTaskImpl#getOutputAssignment <em>Output Assignment</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningTask.impl.MiningApplyTaskImpl#getOutputOption <em>Output Option</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MiningApplyTaskImpl extends MiningTaskImpl implements MiningApplyTask {
	/**
	 * The cached value of the '{@link #getApplyOutput() <em>Apply Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplyOutput()
	 * @generated
	 * @ordered
	 */
	protected MiningApplyOutput applyOutput;

	/**
	 * The cached value of the '{@link #getOutputAssignment() <em>Output Assignment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputAssignment()
	 * @generated
	 * @ordered
	 */
	protected AttributeAssignmentSet outputAssignment;

	/**
	 * The default value of the '{@link #getOutputOption() <em>Output Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputOption()
	 * @generated
	 * @ordered
	 */
	protected static final ApplyOutputOption OUTPUT_OPTION_EDEFAULT = ApplyOutputOption.APPEND_TO_EXISTING;

	/**
	 * The cached value of the '{@link #getOutputOption() <em>Output Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputOption()
	 * @generated
	 * @ordered
	 */
	protected ApplyOutputOption outputOption = OUTPUT_OPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MiningApplyTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MiningTaskPackage.Literals.MINING_APPLY_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiningApplyOutput getApplyOutput() {
		if (applyOutput != null && applyOutput.eIsProxy()) {
			InternalEObject oldApplyOutput = (InternalEObject)applyOutput;
			applyOutput = (MiningApplyOutput)eResolveProxy(oldApplyOutput);
			if (applyOutput != oldApplyOutput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MiningTaskPackage.MINING_APPLY_TASK__APPLY_OUTPUT, oldApplyOutput, applyOutput));
			}
		}
		return applyOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiningApplyOutput basicGetApplyOutput() {
		return applyOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplyOutput(MiningApplyOutput newApplyOutput) {
		MiningApplyOutput oldApplyOutput = applyOutput;
		applyOutput = newApplyOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiningTaskPackage.MINING_APPLY_TASK__APPLY_OUTPUT, oldApplyOutput, applyOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeAssignmentSet getOutputAssignment() {
		if (outputAssignment != null && outputAssignment.eIsProxy()) {
			InternalEObject oldOutputAssignment = (InternalEObject)outputAssignment;
			outputAssignment = (AttributeAssignmentSet)eResolveProxy(oldOutputAssignment);
			if (outputAssignment != oldOutputAssignment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MiningTaskPackage.MINING_APPLY_TASK__OUTPUT_ASSIGNMENT, oldOutputAssignment, outputAssignment));
			}
		}
		return outputAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeAssignmentSet basicGetOutputAssignment() {
		return outputAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputAssignment(AttributeAssignmentSet newOutputAssignment) {
		AttributeAssignmentSet oldOutputAssignment = outputAssignment;
		outputAssignment = newOutputAssignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiningTaskPackage.MINING_APPLY_TASK__OUTPUT_ASSIGNMENT, oldOutputAssignment, outputAssignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplyOutputOption getOutputOption() {
		return outputOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputOption(ApplyOutputOption newOutputOption) {
		ApplyOutputOption oldOutputOption = outputOption;
		outputOption = newOutputOption == null ? OUTPUT_OPTION_EDEFAULT : newOutputOption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiningTaskPackage.MINING_APPLY_TASK__OUTPUT_OPTION, oldOutputOption, outputOption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MiningTaskPackage.MINING_APPLY_TASK__APPLY_OUTPUT:
				if (resolve) return getApplyOutput();
				return basicGetApplyOutput();
			case MiningTaskPackage.MINING_APPLY_TASK__OUTPUT_ASSIGNMENT:
				if (resolve) return getOutputAssignment();
				return basicGetOutputAssignment();
			case MiningTaskPackage.MINING_APPLY_TASK__OUTPUT_OPTION:
				return getOutputOption();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MiningTaskPackage.MINING_APPLY_TASK__APPLY_OUTPUT:
				setApplyOutput((MiningApplyOutput)newValue);
				return;
			case MiningTaskPackage.MINING_APPLY_TASK__OUTPUT_ASSIGNMENT:
				setOutputAssignment((AttributeAssignmentSet)newValue);
				return;
			case MiningTaskPackage.MINING_APPLY_TASK__OUTPUT_OPTION:
				setOutputOption((ApplyOutputOption)newValue);
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
			case MiningTaskPackage.MINING_APPLY_TASK__APPLY_OUTPUT:
				setApplyOutput((MiningApplyOutput)null);
				return;
			case MiningTaskPackage.MINING_APPLY_TASK__OUTPUT_ASSIGNMENT:
				setOutputAssignment((AttributeAssignmentSet)null);
				return;
			case MiningTaskPackage.MINING_APPLY_TASK__OUTPUT_OPTION:
				setOutputOption(OUTPUT_OPTION_EDEFAULT);
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
			case MiningTaskPackage.MINING_APPLY_TASK__APPLY_OUTPUT:
				return applyOutput != null;
			case MiningTaskPackage.MINING_APPLY_TASK__OUTPUT_ASSIGNMENT:
				return outputAssignment != null;
			case MiningTaskPackage.MINING_APPLY_TASK__OUTPUT_OPTION:
				return outputOption != OUTPUT_OPTION_EDEFAULT;
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
		result.append(" (outputOption: ");
		result.append(outputOption);
		result.append(')');
		return result.toString();
	}

} //MiningApplyTaskImpl

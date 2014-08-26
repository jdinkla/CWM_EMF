/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningTask.impl;

import CWM.MiningCore.MiningTask.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MiningTaskFactoryImpl extends EFactoryImpl implements MiningTaskFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MiningTaskFactory init() {
		try {
			MiningTaskFactory theMiningTaskFactory = (MiningTaskFactory)EPackage.Registry.INSTANCE.getEFactory("MiningTask"); 
			if (theMiningTaskFactory != null) {
				return theMiningTaskFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MiningTaskFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiningTaskFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MiningTaskPackage.APPLY_OUTPUT_ITEM: return createApplyOutputItem();
			case MiningTaskPackage.APPLY_PROBABILITY_ITEM: return createApplyProbabilityItem();
			case MiningTaskPackage.APPLY_RULE_ID_ITEM: return createApplyRuleIdItem();
			case MiningTaskPackage.APPLY_SCORE_ITEM: return createApplyScoreItem();
			case MiningTaskPackage.APPLY_SOURCE_ITEM: return createApplySourceItem();
			case MiningTaskPackage.MINING_APPLY_OUTPUT: return createMiningApplyOutput();
			case MiningTaskPackage.MINING_APPLY_TASK: return createMiningApplyTask();
			case MiningTaskPackage.MINING_BUILD_TASK: return createMiningBuildTask();
			case MiningTaskPackage.MINING_TRANSFORMATION: return createMiningTransformation();
			case MiningTaskPackage.MINING_TASK_CONTAINER: return createMiningTask_container();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case MiningTaskPackage.APPLY_OUTPUT_OPTION:
				return createApplyOutputOptionFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case MiningTaskPackage.APPLY_OUTPUT_OPTION:
				return convertApplyOutputOptionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplyOutputItem createApplyOutputItem() {
		ApplyOutputItemImpl applyOutputItem = new ApplyOutputItemImpl();
		return applyOutputItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplyProbabilityItem createApplyProbabilityItem() {
		ApplyProbabilityItemImpl applyProbabilityItem = new ApplyProbabilityItemImpl();
		return applyProbabilityItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplyRuleIdItem createApplyRuleIdItem() {
		ApplyRuleIdItemImpl applyRuleIdItem = new ApplyRuleIdItemImpl();
		return applyRuleIdItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplyScoreItem createApplyScoreItem() {
		ApplyScoreItemImpl applyScoreItem = new ApplyScoreItemImpl();
		return applyScoreItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplySourceItem createApplySourceItem() {
		ApplySourceItemImpl applySourceItem = new ApplySourceItemImpl();
		return applySourceItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiningApplyOutput createMiningApplyOutput() {
		MiningApplyOutputImpl miningApplyOutput = new MiningApplyOutputImpl();
		return miningApplyOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiningApplyTask createMiningApplyTask() {
		MiningApplyTaskImpl miningApplyTask = new MiningApplyTaskImpl();
		return miningApplyTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiningBuildTask createMiningBuildTask() {
		MiningBuildTaskImpl miningBuildTask = new MiningBuildTaskImpl();
		return miningBuildTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiningTransformation createMiningTransformation() {
		MiningTransformationImpl miningTransformation = new MiningTransformationImpl();
		return miningTransformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiningTask_container createMiningTask_container() {
		MiningTask_containerImpl miningTask_container = new MiningTask_containerImpl();
		return miningTask_container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplyOutputOption createApplyOutputOptionFromString(EDataType eDataType, String initialValue) {
		ApplyOutputOption result = ApplyOutputOption.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertApplyOutputOptionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiningTaskPackage getMiningTaskPackage() {
		return (MiningTaskPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MiningTaskPackage getPackage() {
		return MiningTaskPackage.eINSTANCE;
	}

} //MiningTaskFactoryImpl

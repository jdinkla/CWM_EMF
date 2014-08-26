/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Supervised.impl;

import CWM.Supervised.*;

import org.eclipse.emf.ecore.EClass;
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
public class SupervisedFactoryImpl extends EFactoryImpl implements SupervisedFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SupervisedFactory init() {
		try {
			SupervisedFactory theSupervisedFactory = (SupervisedFactory)EPackage.Registry.INSTANCE.getEFactory("Supervised"); 
			if (theSupervisedFactory != null) {
				return theSupervisedFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SupervisedFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupervisedFactoryImpl() {
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
			case SupervisedPackage.LIFT_ANALYSIS_POINT: return createLiftAnalysisPoint();
			case SupervisedPackage.LIFT_ANALYSIS: return createLiftAnalysis();
			case SupervisedPackage.MINING_TEST_TASK: return createMiningTestTask();
			case SupervisedPackage.SUPERVISED_FUNCTION_SETTINGS: return createSupervisedFunctionSettings();
			case SupervisedPackage.MINING_TEST_RESULT: return createMiningTestResult();
			case SupervisedPackage.SUPERVISED_CONTAINER: return createSupervised_container();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiftAnalysisPoint createLiftAnalysisPoint() {
		LiftAnalysisPointImpl liftAnalysisPoint = new LiftAnalysisPointImpl();
		return liftAnalysisPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiftAnalysis createLiftAnalysis() {
		LiftAnalysisImpl liftAnalysis = new LiftAnalysisImpl();
		return liftAnalysis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiningTestTask createMiningTestTask() {
		MiningTestTaskImpl miningTestTask = new MiningTestTaskImpl();
		return miningTestTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupervisedFunctionSettings createSupervisedFunctionSettings() {
		SupervisedFunctionSettingsImpl supervisedFunctionSettings = new SupervisedFunctionSettingsImpl();
		return supervisedFunctionSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiningTestResult createMiningTestResult() {
		MiningTestResultImpl miningTestResult = new MiningTestResultImpl();
		return miningTestResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Supervised_container createSupervised_container() {
		Supervised_containerImpl supervised_container = new Supervised_containerImpl();
		return supervised_container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupervisedPackage getSupervisedPackage() {
		return (SupervisedPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SupervisedPackage getPackage() {
		return SupervisedPackage.eINSTANCE;
	}

} //SupervisedFactoryImpl

/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Approximation.impl;

import CWM.Approximation.*;

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
public class ApproximationFactoryImpl extends EFactoryImpl implements ApproximationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApproximationFactory init() {
		try {
			ApproximationFactory theApproximationFactory = (ApproximationFactory)EPackage.Registry.INSTANCE.getEFactory("Approximation"); 
			if (theApproximationFactory != null) {
				return theApproximationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApproximationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApproximationFactoryImpl() {
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
			case ApproximationPackage.APPROXIMATION_FUNCTION_SETTINGS: return createApproximationFunctionSettings();
			case ApproximationPackage.APPROXIMATION_TEST_RESULT: return createApproximationTestResult();
			case ApproximationPackage.APPROXIMATION_TEST_TASK: return createApproximationTestTask();
			case ApproximationPackage.APPROXIMATION_CONTAINER: return createApproximation_container();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApproximationFunctionSettings createApproximationFunctionSettings() {
		ApproximationFunctionSettingsImpl approximationFunctionSettings = new ApproximationFunctionSettingsImpl();
		return approximationFunctionSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApproximationTestResult createApproximationTestResult() {
		ApproximationTestResultImpl approximationTestResult = new ApproximationTestResultImpl();
		return approximationTestResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApproximationTestTask createApproximationTestTask() {
		ApproximationTestTaskImpl approximationTestTask = new ApproximationTestTaskImpl();
		return approximationTestTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Approximation_container createApproximation_container() {
		Approximation_containerImpl approximation_container = new Approximation_containerImpl();
		return approximation_container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApproximationPackage getApproximationPackage() {
		return (ApproximationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApproximationPackage getPackage() {
		return ApproximationPackage.eINSTANCE;
	}

} //ApproximationFactoryImpl

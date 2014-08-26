/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Classification.impl;

import CWM.Classification.*;

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
public class ClassificationFactoryImpl extends EFactoryImpl implements ClassificationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ClassificationFactory init() {
		try {
			ClassificationFactory theClassificationFactory = (ClassificationFactory)EPackage.Registry.INSTANCE.getEFactory("Classification"); 
			if (theClassificationFactory != null) {
				return theClassificationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ClassificationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassificationFactoryImpl() {
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
			case ClassificationPackage.APPLY_TARGET_VALUE_ITEM: return createApplyTargetValueItem();
			case ClassificationPackage.CLASSIFICATION_ATTRIBUTE_USAGE: return createClassificationAttributeUsage();
			case ClassificationPackage.CLASSIFICATION_FUNCTION_SETTINGS: return createClassificationFunctionSettings();
			case ClassificationPackage.CLASSIFICATION_TEST_RESULT: return createClassificationTestResult();
			case ClassificationPackage.CLASSIFICATION_TEST_TASK: return createClassificationTestTask();
			case ClassificationPackage.PRIOR_PROBABILITIES: return createPriorProbabilities();
			case ClassificationPackage.PRIOR_PROBABILITIES_ENTRY: return createPriorProbabilitiesEntry();
			case ClassificationPackage.CLASSIFICATION_CONTAINER: return createClassification_container();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplyTargetValueItem createApplyTargetValueItem() {
		ApplyTargetValueItemImpl applyTargetValueItem = new ApplyTargetValueItemImpl();
		return applyTargetValueItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassificationAttributeUsage createClassificationAttributeUsage() {
		ClassificationAttributeUsageImpl classificationAttributeUsage = new ClassificationAttributeUsageImpl();
		return classificationAttributeUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassificationFunctionSettings createClassificationFunctionSettings() {
		ClassificationFunctionSettingsImpl classificationFunctionSettings = new ClassificationFunctionSettingsImpl();
		return classificationFunctionSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassificationTestResult createClassificationTestResult() {
		ClassificationTestResultImpl classificationTestResult = new ClassificationTestResultImpl();
		return classificationTestResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassificationTestTask createClassificationTestTask() {
		ClassificationTestTaskImpl classificationTestTask = new ClassificationTestTaskImpl();
		return classificationTestTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriorProbabilities createPriorProbabilities() {
		PriorProbabilitiesImpl priorProbabilities = new PriorProbabilitiesImpl();
		return priorProbabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriorProbabilitiesEntry createPriorProbabilitiesEntry() {
		PriorProbabilitiesEntryImpl priorProbabilitiesEntry = new PriorProbabilitiesEntryImpl();
		return priorProbabilitiesEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classification_container createClassification_container() {
		Classification_containerImpl classification_container = new Classification_containerImpl();
		return classification_container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassificationPackage getClassificationPackage() {
		return (ClassificationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ClassificationPackage getPackage() {
		return ClassificationPackage.eINSTANCE;
	}

} //ClassificationFactoryImpl

/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.CwmTransformation.impl;

import CWM.CwmTransformation.*;

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
public class CwmTransformationFactoryImpl extends EFactoryImpl implements CwmTransformationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CwmTransformationFactory init() {
		try {
			CwmTransformationFactory theCwmTransformationFactory = (CwmTransformationFactory)EPackage.Registry.INSTANCE.getEFactory("CwmTransformation"); 
			if (theCwmTransformationFactory != null) {
				return theCwmTransformationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CwmTransformationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CwmTransformationFactoryImpl() {
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
			case CwmTransformationPackage.TRANSFORMATION: return createTransformation();
			case CwmTransformationPackage.DATA_OBJECT_SET: return createDataObjectSet();
			case CwmTransformationPackage.TRANSFORMATION_TASK: return createTransformationTask();
			case CwmTransformationPackage.TRANSFORMATION_STEP: return createTransformationStep();
			case CwmTransformationPackage.TRANSFORMATION_ACTIVITY: return createTransformationActivity();
			case CwmTransformationPackage.PRECEDENCE_CONSTRAINT: return createPrecedenceConstraint();
			case CwmTransformationPackage.TRANSFORMATION_USE: return createTransformationUse();
			case CwmTransformationPackage.TRANSFORMATION_MAP: return createTransformationMap();
			case CwmTransformationPackage.TRANSFORMATION_TREE: return createTransformationTree();
			case CwmTransformationPackage.CLASSIFIER_MAP: return createClassifierMap();
			case CwmTransformationPackage.FEATURE_MAP: return createFeatureMap();
			case CwmTransformationPackage.STEP_PRECEDENCE: return createStepPrecedence();
			case CwmTransformationPackage.CLASSIFIER_FEATURE_MAP: return createClassifierFeatureMap();
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER: return createTransformation_container();
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
			case CwmTransformationPackage.TREE_TYPE:
				return createTreeTypeFromString(eDataType, initialValue);
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
			case CwmTransformationPackage.TREE_TYPE:
				return convertTreeTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transformation createTransformation() {
		TransformationImpl transformation = new TransformationImpl();
		return transformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataObjectSet createDataObjectSet() {
		DataObjectSetImpl dataObjectSet = new DataObjectSetImpl();
		return dataObjectSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationTask createTransformationTask() {
		TransformationTaskImpl transformationTask = new TransformationTaskImpl();
		return transformationTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationStep createTransformationStep() {
		TransformationStepImpl transformationStep = new TransformationStepImpl();
		return transformationStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationActivity createTransformationActivity() {
		TransformationActivityImpl transformationActivity = new TransformationActivityImpl();
		return transformationActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrecedenceConstraint createPrecedenceConstraint() {
		PrecedenceConstraintImpl precedenceConstraint = new PrecedenceConstraintImpl();
		return precedenceConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationUse createTransformationUse() {
		TransformationUseImpl transformationUse = new TransformationUseImpl();
		return transformationUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationMap createTransformationMap() {
		TransformationMapImpl transformationMap = new TransformationMapImpl();
		return transformationMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationTree createTransformationTree() {
		TransformationTreeImpl transformationTree = new TransformationTreeImpl();
		return transformationTree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassifierMap createClassifierMap() {
		ClassifierMapImpl classifierMap = new ClassifierMapImpl();
		return classifierMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap createFeatureMap() {
		FeatureMapImpl featureMap = new FeatureMapImpl();
		return featureMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepPrecedence createStepPrecedence() {
		StepPrecedenceImpl stepPrecedence = new StepPrecedenceImpl();
		return stepPrecedence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassifierFeatureMap createClassifierFeatureMap() {
		ClassifierFeatureMapImpl classifierFeatureMap = new ClassifierFeatureMapImpl();
		return classifierFeatureMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transformation_container createTransformation_container() {
		Transformation_containerImpl transformation_container = new Transformation_containerImpl();
		return transformation_container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TreeType createTreeTypeFromString(EDataType eDataType, String initialValue) {
		TreeType result = TreeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTreeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CwmTransformationPackage getCwmTransformationPackage() {
		return (CwmTransformationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CwmTransformationPackage getPackage() {
		return CwmTransformationPackage.eINSTANCE;
	}

} //CwmTransformationFactoryImpl

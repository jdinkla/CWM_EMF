/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.CwmTransformation.util;

import CWM.Core.Classifier;
import CWM.Core.Constraint;
import CWM.Core.Dependency;
import CWM.Core.Element;
import CWM.Core.ModelElement;
import CWM.Core.Namespace;
import CWM.Core.Subsystem;

import CWM.CwmTransformation.*;

import CWM.SoftwareDeployment.Component;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see CWM.CwmTransformation.CwmTransformationPackage
 * @generated
 */
public class CwmTransformationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CwmTransformationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CwmTransformationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CwmTransformationPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch the delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CwmTransformationSwitch<Adapter> modelSwitch =
		new CwmTransformationSwitch<Adapter>() {
			@Override
			public Adapter caseTransformation(Transformation object) {
				return createTransformationAdapter();
			}
			@Override
			public Adapter caseDataObjectSet(DataObjectSet object) {
				return createDataObjectSetAdapter();
			}
			@Override
			public Adapter caseTransformationTask(TransformationTask object) {
				return createTransformationTaskAdapter();
			}
			@Override
			public Adapter caseTransformationStep(TransformationStep object) {
				return createTransformationStepAdapter();
			}
			@Override
			public Adapter caseTransformationActivity(TransformationActivity object) {
				return createTransformationActivityAdapter();
			}
			@Override
			public Adapter casePrecedenceConstraint(PrecedenceConstraint object) {
				return createPrecedenceConstraintAdapter();
			}
			@Override
			public Adapter caseTransformationUse(TransformationUse object) {
				return createTransformationUseAdapter();
			}
			@Override
			public Adapter caseTransformationMap(TransformationMap object) {
				return createTransformationMapAdapter();
			}
			@Override
			public Adapter caseTransformationTree(TransformationTree object) {
				return createTransformationTreeAdapter();
			}
			@Override
			public Adapter caseClassifierMap(ClassifierMap object) {
				return createClassifierMapAdapter();
			}
			@Override
			public Adapter caseFeatureMap(FeatureMap object) {
				return createFeatureMapAdapter();
			}
			@Override
			public Adapter caseStepPrecedence(StepPrecedence object) {
				return createStepPrecedenceAdapter();
			}
			@Override
			public Adapter caseClassifierFeatureMap(ClassifierFeatureMap object) {
				return createClassifierFeatureMapAdapter();
			}
			@Override
			public Adapter caseTransformation_container(Transformation_container object) {
				return createTransformation_containerAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseModelElement(ModelElement object) {
				return createModelElementAdapter();
			}
			@Override
			public Adapter caseNamespace(Namespace object) {
				return createNamespaceAdapter();
			}
			@Override
			public Adapter caseClassifier(Classifier object) {
				return createClassifierAdapter();
			}
			@Override
			public Adapter caseComponent(Component object) {
				return createComponentAdapter();
			}
			@Override
			public Adapter casePackage(CWM.Core.Package object) {
				return createPackageAdapter();
			}
			@Override
			public Adapter caseSubsystem(Subsystem object) {
				return createSubsystemAdapter();
			}
			@Override
			public Adapter caseConstraint(Constraint object) {
				return createConstraintAdapter();
			}
			@Override
			public Adapter caseDependency(Dependency object) {
				return createDependencyAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link CWM.CwmTransformation.Transformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.CwmTransformation.Transformation
	 * @generated
	 */
	public Adapter createTransformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.CwmTransformation.DataObjectSet <em>Data Object Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.CwmTransformation.DataObjectSet
	 * @generated
	 */
	public Adapter createDataObjectSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.CwmTransformation.TransformationTask <em>Transformation Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.CwmTransformation.TransformationTask
	 * @generated
	 */
	public Adapter createTransformationTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.CwmTransformation.TransformationStep <em>Transformation Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.CwmTransformation.TransformationStep
	 * @generated
	 */
	public Adapter createTransformationStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.CwmTransformation.TransformationActivity <em>Transformation Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.CwmTransformation.TransformationActivity
	 * @generated
	 */
	public Adapter createTransformationActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.CwmTransformation.PrecedenceConstraint <em>Precedence Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.CwmTransformation.PrecedenceConstraint
	 * @generated
	 */
	public Adapter createPrecedenceConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.CwmTransformation.TransformationUse <em>Transformation Use</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.CwmTransformation.TransformationUse
	 * @generated
	 */
	public Adapter createTransformationUseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.CwmTransformation.TransformationMap <em>Transformation Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.CwmTransformation.TransformationMap
	 * @generated
	 */
	public Adapter createTransformationMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.CwmTransformation.TransformationTree <em>Transformation Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.CwmTransformation.TransformationTree
	 * @generated
	 */
	public Adapter createTransformationTreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.CwmTransformation.ClassifierMap <em>Classifier Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.CwmTransformation.ClassifierMap
	 * @generated
	 */
	public Adapter createClassifierMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.CwmTransformation.FeatureMap <em>Feature Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.CwmTransformation.FeatureMap
	 * @generated
	 */
	public Adapter createFeatureMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.CwmTransformation.StepPrecedence <em>Step Precedence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.CwmTransformation.StepPrecedence
	 * @generated
	 */
	public Adapter createStepPrecedenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.CwmTransformation.ClassifierFeatureMap <em>Classifier Feature Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.CwmTransformation.ClassifierFeatureMap
	 * @generated
	 */
	public Adapter createClassifierFeatureMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.CwmTransformation.Transformation_container <em>Transformation container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.CwmTransformation.Transformation_container
	 * @generated
	 */
	public Adapter createTransformation_containerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.Core.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.Core.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.Core.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.Core.ModelElement
	 * @generated
	 */
	public Adapter createModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.Core.Namespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.Core.Namespace
	 * @generated
	 */
	public Adapter createNamespaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.Core.Classifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.Core.Classifier
	 * @generated
	 */
	public Adapter createClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.SoftwareDeployment.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.SoftwareDeployment.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.Core.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.Core.Package
	 * @generated
	 */
	public Adapter createPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.Core.Subsystem <em>Subsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.Core.Subsystem
	 * @generated
	 */
	public Adapter createSubsystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.Core.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.Core.Constraint
	 * @generated
	 */
	public Adapter createConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.Core.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.Core.Dependency
	 * @generated
	 */
	public Adapter createDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CwmTransformationAdapterFactory

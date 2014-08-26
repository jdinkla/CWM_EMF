/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Olap.util;

import CWM.Core.Attribute;
import CWM.Core.Classifier;
import CWM.Core.Element;
import CWM.Core.Feature;
import CWM.Core.ModelElement;
import CWM.Core.Namespace;
import CWM.Core.StructuralFeature;

import CWM.CwmTransformation.Transformation;
import CWM.CwmTransformation.TransformationMap;

import CWM.Olap.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see CWM.Olap.OlapPackage
 * @generated
 */
public class OlapAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OlapPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OlapAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OlapPackage.eINSTANCE;
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
	protected OlapSwitch<Adapter> modelSwitch =
		new OlapSwitch<Adapter>() {
			@Override
			public Adapter caseContentMap(ContentMap object) {
				return createContentMapAdapter();
			}
			@Override
			public Adapter caseCube(Cube object) {
				return createCubeAdapter();
			}
			@Override
			public Adapter caseCubeDeployment(CubeDeployment object) {
				return createCubeDeploymentAdapter();
			}
			@Override
			public Adapter caseCubeDimensionAssociation(CubeDimensionAssociation object) {
				return createCubeDimensionAssociationAdapter();
			}
			@Override
			public Adapter caseCubeRegion(CubeRegion object) {
				return createCubeRegionAdapter();
			}
			@Override
			public Adapter caseDeploymentGroup(DeploymentGroup object) {
				return createDeploymentGroupAdapter();
			}
			@Override
			public Adapter caseDimension(Dimension object) {
				return createDimensionAdapter();
			}
			@Override
			public Adapter caseDimensionDeployment(DimensionDeployment object) {
				return createDimensionDeploymentAdapter();
			}
			@Override
			public Adapter caseHierarchy(Hierarchy object) {
				return createHierarchyAdapter();
			}
			@Override
			public Adapter caseHierarchyLevelAssociation(HierarchyLevelAssociation object) {
				return createHierarchyLevelAssociationAdapter();
			}
			@Override
			public Adapter caseLevelBasedHierarchy(LevelBasedHierarchy object) {
				return createLevelBasedHierarchyAdapter();
			}
			@Override
			public Adapter caseMemberSelectionGroup(MemberSelectionGroup object) {
				return createMemberSelectionGroupAdapter();
			}
			@Override
			public Adapter caseMemberSelection(MemberSelection object) {
				return createMemberSelectionAdapter();
			}
			@Override
			public Adapter caseSchema(Schema object) {
				return createSchemaAdapter();
			}
			@Override
			public Adapter caseValueBasedHierarchy(ValueBasedHierarchy object) {
				return createValueBasedHierarchyAdapter();
			}
			@Override
			public Adapter caseLevel(Level object) {
				return createLevelAdapter();
			}
			@Override
			public Adapter caseCodedLevel(CodedLevel object) {
				return createCodedLevelAdapter();
			}
			@Override
			public Adapter caseMeasure(Measure object) {
				return createMeasureAdapter();
			}
			@Override
			public Adapter caseStructureMap(StructureMap object) {
				return createStructureMapAdapter();
			}
			@Override
			public Adapter caseHierarchyMemberSelectionGroup(HierarchyMemberSelectionGroup object) {
				return createHierarchyMemberSelectionGroupAdapter();
			}
			@Override
			public Adapter caseOlap_container(Olap_container object) {
				return createOlap_containerAdapter();
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
			public Adapter caseTransformation(Transformation object) {
				return createTransformationAdapter();
			}
			@Override
			public Adapter caseTransformationMap(TransformationMap object) {
				return createTransformationMapAdapter();
			}
			@Override
			public Adapter caseClassifier(Classifier object) {
				return createClassifierAdapter();
			}
			@Override
			public Adapter caseClass(CWM.Core.Class object) {
				return createClassAdapter();
			}
			@Override
			public Adapter casePackage(CWM.Core.Package object) {
				return createPackageAdapter();
			}
			@Override
			public Adapter caseFeature(Feature object) {
				return createFeatureAdapter();
			}
			@Override
			public Adapter caseStructuralFeature(StructuralFeature object) {
				return createStructuralFeatureAdapter();
			}
			@Override
			public Adapter caseAttribute(Attribute object) {
				return createAttributeAdapter();
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
	 * Creates a new adapter for an object of class '{@link CWM.Olap.ContentMap <em>Content Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.Olap.ContentMap
	 * @generated
	 */
	public Adapter createContentMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.Olap.Cube <em>Cube</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.Olap.Cube
	 * @generated
	 */
	public Adapter createCubeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.Olap.CubeDeployment <em>Cube Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.Olap.CubeDeployment
	 * @generated
	 */
	public Adapter createCubeDeploymentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.Olap.CubeDimensionAssociation <em>Cube Dimension Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.Olap.CubeDimensionAssociation
	 * @generated
	 */
	public Adapter createCubeDimensionAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.Olap.CubeRegion <em>Cube Region</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.Olap.CubeRegion
	 * @generated
	 */
	public Adapter createCubeRegionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.Olap.DeploymentGroup <em>Deployment Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.Olap.DeploymentGroup
	 * @generated
	 */
	public Adapter createDeploymentGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.Olap.Dimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.Olap.Dimension
	 * @generated
	 */
	public Adapter createDimensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.Olap.DimensionDeployment <em>Dimension Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.Olap.DimensionDeployment
	 * @generated
	 */
	public Adapter createDimensionDeploymentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.Olap.Hierarchy <em>Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.Olap.Hierarchy
	 * @generated
	 */
	public Adapter createHierarchyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.Olap.HierarchyLevelAssociation <em>Hierarchy Level Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.Olap.HierarchyLevelAssociation
	 * @generated
	 */
	public Adapter createHierarchyLevelAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.Olap.LevelBasedHierarchy <em>Level Based Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.Olap.LevelBasedHierarchy
	 * @generated
	 */
	public Adapter createLevelBasedHierarchyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.Olap.MemberSelectionGroup <em>Member Selection Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.Olap.MemberSelectionGroup
	 * @generated
	 */
	public Adapter createMemberSelectionGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.Olap.MemberSelection <em>Member Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.Olap.MemberSelection
	 * @generated
	 */
	public Adapter createMemberSelectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.Olap.Schema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.Olap.Schema
	 * @generated
	 */
	public Adapter createSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.Olap.ValueBasedHierarchy <em>Value Based Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.Olap.ValueBasedHierarchy
	 * @generated
	 */
	public Adapter createValueBasedHierarchyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.Olap.Level <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.Olap.Level
	 * @generated
	 */
	public Adapter createLevelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.Olap.CodedLevel <em>Coded Level</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.Olap.CodedLevel
	 * @generated
	 */
	public Adapter createCodedLevelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.Olap.Measure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.Olap.Measure
	 * @generated
	 */
	public Adapter createMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.Olap.StructureMap <em>Structure Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.Olap.StructureMap
	 * @generated
	 */
	public Adapter createStructureMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.Olap.HierarchyMemberSelectionGroup <em>Hierarchy Member Selection Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.Olap.HierarchyMemberSelectionGroup
	 * @generated
	 */
	public Adapter createHierarchyMemberSelectionGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.Olap.Olap_container <em>Olap container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.Olap.Olap_container
	 * @generated
	 */
	public Adapter createOlap_containerAdapter() {
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
	 * Creates a new adapter for an object of class '{@link CWM.Core.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.Core.Class
	 * @generated
	 */
	public Adapter createClassAdapter() {
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
	 * Creates a new adapter for an object of class '{@link CWM.Core.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.Core.Feature
	 * @generated
	 */
	public Adapter createFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.Core.StructuralFeature <em>Structural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.Core.StructuralFeature
	 * @generated
	 */
	public Adapter createStructuralFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.Core.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.Core.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
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

} //OlapAdapterFactory

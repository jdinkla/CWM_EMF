/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningData.util;

import CWM.Core.Attribute;
import CWM.Core.Classifier;
import CWM.Core.Element;
import CWM.Core.Feature;
import CWM.Core.ModelElement;
import CWM.Core.Namespace;
import CWM.Core.StructuralFeature;

import CWM.MiningCore.MiningData.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see CWM.MiningCore.MiningData.MiningDataPackage
 * @generated
 */
public class MiningDataAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MiningDataPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiningDataAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MiningDataPackage.eINSTANCE;
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
	protected MiningDataSwitch<Adapter> modelSwitch =
		new MiningDataSwitch<Adapter>() {
			@Override
			public Adapter caseAttributeAssignment(AttributeAssignment object) {
				return createAttributeAssignmentAdapter();
			}
			@Override
			public Adapter caseAttributeAssignmentSet(AttributeAssignmentSet object) {
				return createAttributeAssignmentSetAdapter();
			}
			@Override
			public Adapter caseAttributeUsage(AttributeUsage object) {
				return createAttributeUsageAdapter();
			}
			@Override
			public Adapter caseAttributeUsageSet(AttributeUsageSet object) {
				return createAttributeUsageSetAdapter();
			}
			@Override
			public Adapter caseCategoricalAttributeProperties(CategoricalAttributeProperties object) {
				return createCategoricalAttributePropertiesAdapter();
			}
			@Override
			public Adapter caseDirectAttributeAssignment(DirectAttributeAssignment object) {
				return createDirectAttributeAssignmentAdapter();
			}
			@Override
			public Adapter caseLogicalAttribute(LogicalAttribute object) {
				return createLogicalAttributeAdapter();
			}
			@Override
			public Adapter caseLogicalData(LogicalData object) {
				return createLogicalDataAdapter();
			}
			@Override
			public Adapter caseMiningAttribute(MiningAttribute object) {
				return createMiningAttributeAdapter();
			}
			@Override
			public Adapter caseNumericalAttributeProperties(NumericalAttributeProperties object) {
				return createNumericalAttributePropertiesAdapter();
			}
			@Override
			public Adapter caseOrdinalAttributeProperties(OrdinalAttributeProperties object) {
				return createOrdinalAttributePropertiesAdapter();
			}
			@Override
			public Adapter casePhysicalData(PhysicalData object) {
				return createPhysicalDataAdapter();
			}
			@Override
			public Adapter casePivotAttributeAssignment(PivotAttributeAssignment object) {
				return createPivotAttributeAssignmentAdapter();
			}
			@Override
			public Adapter caseReversePivotAttributeAssignment(ReversePivotAttributeAssignment object) {
				return createReversePivotAttributeAssignmentAdapter();
			}
			@Override
			public Adapter caseSetAttributeAssignment(SetAttributeAssignment object) {
				return createSetAttributeAssignmentAdapter();
			}
			@Override
			public Adapter caseCategory(Category object) {
				return createCategoryAdapter();
			}
			@Override
			public Adapter caseCategoryMap(CategoryMap object) {
				return createCategoryMapAdapter();
			}
			@Override
			public Adapter caseCategoryMapObject(CategoryMapObject object) {
				return createCategoryMapObjectAdapter();
			}
			@Override
			public Adapter caseCategoryMapObjectEntry(CategoryMapObjectEntry object) {
				return createCategoryMapObjectEntryAdapter();
			}
			@Override
			public Adapter caseCategoryMapTable(CategoryMapTable object) {
				return createCategoryMapTableAdapter();
			}
			@Override
			public Adapter caseCategoryMatrix(CategoryMatrix object) {
				return createCategoryMatrixAdapter();
			}
			@Override
			public Adapter caseCategoryMatrixEntry(CategoryMatrixEntry object) {
				return createCategoryMatrixEntryAdapter();
			}
			@Override
			public Adapter caseCategoryMatrixObject(CategoryMatrixObject object) {
				return createCategoryMatrixObjectAdapter();
			}
			@Override
			public Adapter caseCategoryMatrixTable(CategoryMatrixTable object) {
				return createCategoryMatrixTableAdapter();
			}
			@Override
			public Adapter caseCategoryTaxonomy(CategoryTaxonomy object) {
				return createCategoryTaxonomyAdapter();
			}
			@Override
			public Adapter caseMiningData_container(MiningData_container object) {
				return createMiningData_containerAdapter();
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
			public Adapter caseFeature(Feature object) {
				return createFeatureAdapter();
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
			public Adapter caseClass(CWM.Core.Class object) {
				return createClassAdapter();
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
	 * Creates a new adapter for an object of class '{@link CWM.MiningCore.MiningData.AttributeAssignment <em>Attribute Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.MiningCore.MiningData.AttributeAssignment
	 * @generated
	 */
	public Adapter createAttributeAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.MiningCore.MiningData.AttributeAssignmentSet <em>Attribute Assignment Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.MiningCore.MiningData.AttributeAssignmentSet
	 * @generated
	 */
	public Adapter createAttributeAssignmentSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.MiningCore.MiningData.AttributeUsage <em>Attribute Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.MiningCore.MiningData.AttributeUsage
	 * @generated
	 */
	public Adapter createAttributeUsageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.MiningCore.MiningData.AttributeUsageSet <em>Attribute Usage Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.MiningCore.MiningData.AttributeUsageSet
	 * @generated
	 */
	public Adapter createAttributeUsageSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.MiningCore.MiningData.CategoricalAttributeProperties <em>Categorical Attribute Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.MiningCore.MiningData.CategoricalAttributeProperties
	 * @generated
	 */
	public Adapter createCategoricalAttributePropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.MiningCore.MiningData.DirectAttributeAssignment <em>Direct Attribute Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.MiningCore.MiningData.DirectAttributeAssignment
	 * @generated
	 */
	public Adapter createDirectAttributeAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.MiningCore.MiningData.LogicalAttribute <em>Logical Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.MiningCore.MiningData.LogicalAttribute
	 * @generated
	 */
	public Adapter createLogicalAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.MiningCore.MiningData.LogicalData <em>Logical Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.MiningCore.MiningData.LogicalData
	 * @generated
	 */
	public Adapter createLogicalDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.MiningCore.MiningData.MiningAttribute <em>Mining Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.MiningCore.MiningData.MiningAttribute
	 * @generated
	 */
	public Adapter createMiningAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.MiningCore.MiningData.NumericalAttributeProperties <em>Numerical Attribute Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.MiningCore.MiningData.NumericalAttributeProperties
	 * @generated
	 */
	public Adapter createNumericalAttributePropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.MiningCore.MiningData.OrdinalAttributeProperties <em>Ordinal Attribute Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.MiningCore.MiningData.OrdinalAttributeProperties
	 * @generated
	 */
	public Adapter createOrdinalAttributePropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.MiningCore.MiningData.PhysicalData <em>Physical Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.MiningCore.MiningData.PhysicalData
	 * @generated
	 */
	public Adapter createPhysicalDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.MiningCore.MiningData.PivotAttributeAssignment <em>Pivot Attribute Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.MiningCore.MiningData.PivotAttributeAssignment
	 * @generated
	 */
	public Adapter createPivotAttributeAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.MiningCore.MiningData.ReversePivotAttributeAssignment <em>Reverse Pivot Attribute Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.MiningCore.MiningData.ReversePivotAttributeAssignment
	 * @generated
	 */
	public Adapter createReversePivotAttributeAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.MiningCore.MiningData.SetAttributeAssignment <em>Set Attribute Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.MiningCore.MiningData.SetAttributeAssignment
	 * @generated
	 */
	public Adapter createSetAttributeAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.MiningCore.MiningData.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.MiningCore.MiningData.Category
	 * @generated
	 */
	public Adapter createCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.MiningCore.MiningData.CategoryMap <em>Category Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.MiningCore.MiningData.CategoryMap
	 * @generated
	 */
	public Adapter createCategoryMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.MiningCore.MiningData.CategoryMapObject <em>Category Map Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.MiningCore.MiningData.CategoryMapObject
	 * @generated
	 */
	public Adapter createCategoryMapObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.MiningCore.MiningData.CategoryMapObjectEntry <em>Category Map Object Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.MiningCore.MiningData.CategoryMapObjectEntry
	 * @generated
	 */
	public Adapter createCategoryMapObjectEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.MiningCore.MiningData.CategoryMapTable <em>Category Map Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.MiningCore.MiningData.CategoryMapTable
	 * @generated
	 */
	public Adapter createCategoryMapTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.MiningCore.MiningData.CategoryMatrix <em>Category Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.MiningCore.MiningData.CategoryMatrix
	 * @generated
	 */
	public Adapter createCategoryMatrixAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.MiningCore.MiningData.CategoryMatrixEntry <em>Category Matrix Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.MiningCore.MiningData.CategoryMatrixEntry
	 * @generated
	 */
	public Adapter createCategoryMatrixEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.MiningCore.MiningData.CategoryMatrixObject <em>Category Matrix Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.MiningCore.MiningData.CategoryMatrixObject
	 * @generated
	 */
	public Adapter createCategoryMatrixObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.MiningCore.MiningData.CategoryMatrixTable <em>Category Matrix Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.MiningCore.MiningData.CategoryMatrixTable
	 * @generated
	 */
	public Adapter createCategoryMatrixTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.MiningCore.MiningData.CategoryTaxonomy <em>Category Taxonomy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.MiningCore.MiningData.CategoryTaxonomy
	 * @generated
	 */
	public Adapter createCategoryTaxonomyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CWM.MiningCore.MiningData.MiningData_container <em>Mining Data container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CWM.MiningCore.MiningData.MiningData_container
	 * @generated
	 */
	public Adapter createMiningData_containerAdapter() {
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

} //MiningDataAdapterFactory

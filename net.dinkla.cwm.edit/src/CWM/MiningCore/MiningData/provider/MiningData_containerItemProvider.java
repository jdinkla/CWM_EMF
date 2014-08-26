/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningData.provider;


import CWM.Classification.ClassificationFactory;

import CWM.Clustering.ClusteringFactory;

import CWM.MiningCore.MiningData.MiningDataFactory;
import CWM.MiningCore.MiningData.MiningDataPackage;
import CWM.MiningCore.MiningData.MiningData_container;

import CWM.MiningCore.MiningModel.MiningModelFactory;

import CWM.MiningCore.MiningTask.MiningTaskFactory;

import CWM.provider.CwmEditPlugin;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link CWM.MiningCore.MiningData.MiningData_container} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MiningData_containerItemProvider
	extends ItemProviderAdapter
	implements	
		IEditingDomainItemProvider,	
		IStructuredItemContentProvider,	
		ITreeItemContentProvider,	
		IItemLabelProvider,	
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiningData_containerItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(MiningDataPackage.Literals.MINING_DATA_CONTAINER__ATTRIBUTE_ASSIGNMENT);
			childrenFeatures.add(MiningDataPackage.Literals.MINING_DATA_CONTAINER__ATTRIBUTE_ASSIGNMENT_SET);
			childrenFeatures.add(MiningDataPackage.Literals.MINING_DATA_CONTAINER__ATTRIBUTE_USAGE);
			childrenFeatures.add(MiningDataPackage.Literals.MINING_DATA_CONTAINER__ATTRIBUTE_USAGE_SET);
			childrenFeatures.add(MiningDataPackage.Literals.MINING_DATA_CONTAINER__CATEGORICAL_ATTRIBUTE_PROPERTIES);
			childrenFeatures.add(MiningDataPackage.Literals.MINING_DATA_CONTAINER__DIRECT_ATTRIBUTE_ASSIGNMENT);
			childrenFeatures.add(MiningDataPackage.Literals.MINING_DATA_CONTAINER__LOGICAL_ATTRIBUTE);
			childrenFeatures.add(MiningDataPackage.Literals.MINING_DATA_CONTAINER__LOGICAL_DATA);
			childrenFeatures.add(MiningDataPackage.Literals.MINING_DATA_CONTAINER__MINING_ATTRIBUTE);
			childrenFeatures.add(MiningDataPackage.Literals.MINING_DATA_CONTAINER__NUMERICAL_ATTRIBUTE_PROPERTIES);
			childrenFeatures.add(MiningDataPackage.Literals.MINING_DATA_CONTAINER__ORDINAL_ATTRIBUTE_PROPERTIES);
			childrenFeatures.add(MiningDataPackage.Literals.MINING_DATA_CONTAINER__PHYSICAL_DATA);
			childrenFeatures.add(MiningDataPackage.Literals.MINING_DATA_CONTAINER__PIVOT_ATTRIBUTE_ASSIGNMENT);
			childrenFeatures.add(MiningDataPackage.Literals.MINING_DATA_CONTAINER__REVERSE_PIVOT_ATTRIBUTE_ASSIGNMENT);
			childrenFeatures.add(MiningDataPackage.Literals.MINING_DATA_CONTAINER__SET_ATTRIBUTE_ASSIGNMENT);
			childrenFeatures.add(MiningDataPackage.Literals.MINING_DATA_CONTAINER__CATEGORY);
			childrenFeatures.add(MiningDataPackage.Literals.MINING_DATA_CONTAINER__CATEGORY_MAP);
			childrenFeatures.add(MiningDataPackage.Literals.MINING_DATA_CONTAINER__CATEGORY_MAP_OBJECT);
			childrenFeatures.add(MiningDataPackage.Literals.MINING_DATA_CONTAINER__CATEGORY_MAP_OBJECT_ENTRY);
			childrenFeatures.add(MiningDataPackage.Literals.MINING_DATA_CONTAINER__CATEGORY_MAP_TABLE);
			childrenFeatures.add(MiningDataPackage.Literals.MINING_DATA_CONTAINER__CATEGORY_MATRIX);
			childrenFeatures.add(MiningDataPackage.Literals.MINING_DATA_CONTAINER__CATEGORY_MATRIX_ENTRY);
			childrenFeatures.add(MiningDataPackage.Literals.MINING_DATA_CONTAINER__CATEGORY_MATRIX_OBJECT);
			childrenFeatures.add(MiningDataPackage.Literals.MINING_DATA_CONTAINER__CATEGORY_MATRIX_TABLE);
			childrenFeatures.add(MiningDataPackage.Literals.MINING_DATA_CONTAINER__CATEGORY_TAXONOMY);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns MiningData_container.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MiningData_container"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_MiningData_container_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(MiningData_container.class)) {
			case MiningDataPackage.MINING_DATA_CONTAINER__ATTRIBUTE_ASSIGNMENT:
			case MiningDataPackage.MINING_DATA_CONTAINER__ATTRIBUTE_ASSIGNMENT_SET:
			case MiningDataPackage.MINING_DATA_CONTAINER__ATTRIBUTE_USAGE:
			case MiningDataPackage.MINING_DATA_CONTAINER__ATTRIBUTE_USAGE_SET:
			case MiningDataPackage.MINING_DATA_CONTAINER__CATEGORICAL_ATTRIBUTE_PROPERTIES:
			case MiningDataPackage.MINING_DATA_CONTAINER__DIRECT_ATTRIBUTE_ASSIGNMENT:
			case MiningDataPackage.MINING_DATA_CONTAINER__LOGICAL_ATTRIBUTE:
			case MiningDataPackage.MINING_DATA_CONTAINER__LOGICAL_DATA:
			case MiningDataPackage.MINING_DATA_CONTAINER__MINING_ATTRIBUTE:
			case MiningDataPackage.MINING_DATA_CONTAINER__NUMERICAL_ATTRIBUTE_PROPERTIES:
			case MiningDataPackage.MINING_DATA_CONTAINER__ORDINAL_ATTRIBUTE_PROPERTIES:
			case MiningDataPackage.MINING_DATA_CONTAINER__PHYSICAL_DATA:
			case MiningDataPackage.MINING_DATA_CONTAINER__PIVOT_ATTRIBUTE_ASSIGNMENT:
			case MiningDataPackage.MINING_DATA_CONTAINER__REVERSE_PIVOT_ATTRIBUTE_ASSIGNMENT:
			case MiningDataPackage.MINING_DATA_CONTAINER__SET_ATTRIBUTE_ASSIGNMENT:
			case MiningDataPackage.MINING_DATA_CONTAINER__CATEGORY:
			case MiningDataPackage.MINING_DATA_CONTAINER__CATEGORY_MAP:
			case MiningDataPackage.MINING_DATA_CONTAINER__CATEGORY_MAP_OBJECT:
			case MiningDataPackage.MINING_DATA_CONTAINER__CATEGORY_MAP_OBJECT_ENTRY:
			case MiningDataPackage.MINING_DATA_CONTAINER__CATEGORY_MAP_TABLE:
			case MiningDataPackage.MINING_DATA_CONTAINER__CATEGORY_MATRIX:
			case MiningDataPackage.MINING_DATA_CONTAINER__CATEGORY_MATRIX_ENTRY:
			case MiningDataPackage.MINING_DATA_CONTAINER__CATEGORY_MATRIX_OBJECT:
			case MiningDataPackage.MINING_DATA_CONTAINER__CATEGORY_MATRIX_TABLE:
			case MiningDataPackage.MINING_DATA_CONTAINER__CATEGORY_TAXONOMY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(MiningDataPackage.Literals.MINING_DATA_CONTAINER__ATTRIBUTE_ASSIGNMENT,
				 MiningDataFactory.eINSTANCE.createAttributeAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(MiningDataPackage.Literals.MINING_DATA_CONTAINER__ATTRIBUTE_ASSIGNMENT,
				 MiningDataFactory.eINSTANCE.createDirectAttributeAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(MiningDataPackage.Literals.MINING_DATA_CONTAINER__ATTRIBUTE_ASSIGNMENT,
				 MiningDataFactory.eINSTANCE.createPivotAttributeAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(MiningDataPackage.Literals.MINING_DATA_CONTAINER__ATTRIBUTE_ASSIGNMENT,
				 MiningDataFactory.eINSTANCE.createReversePivotAttributeAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(MiningDataPackage.Literals.MINING_DATA_CONTAINER__ATTRIBUTE_ASSIGNMENT,
				 MiningDataFactory.eINSTANCE.createSetAttributeAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(MiningDataPackage.Literals.MINING_DATA_CONTAINER__ATTRIBUTE_ASSIGNMENT_SET,
				 MiningDataFactory.eINSTANCE.createAttributeAssignmentSet()));

		newChildDescriptors.add
			(createChildParameter
				(MiningDataPackage.Literals.MINING_DATA_CONTAINER__ATTRIBUTE_USAGE,
				 MiningDataFactory.eINSTANCE.createAttributeUsage()));

		newChildDescriptors.add
			(createChildParameter
				(MiningDataPackage.Literals.MINING_DATA_CONTAINER__ATTRIBUTE_USAGE,
				 ClusteringFactory.eINSTANCE.createClusteringAttributeUsage()));

		newChildDescriptors.add
			(createChildParameter
				(MiningDataPackage.Literals.MINING_DATA_CONTAINER__ATTRIBUTE_USAGE,
				 ClassificationFactory.eINSTANCE.createClassificationAttributeUsage()));

		newChildDescriptors.add
			(createChildParameter
				(MiningDataPackage.Literals.MINING_DATA_CONTAINER__ATTRIBUTE_USAGE_SET,
				 MiningDataFactory.eINSTANCE.createAttributeUsageSet()));

		newChildDescriptors.add
			(createChildParameter
				(MiningDataPackage.Literals.MINING_DATA_CONTAINER__CATEGORICAL_ATTRIBUTE_PROPERTIES,
				 MiningDataFactory.eINSTANCE.createCategoricalAttributeProperties()));

		newChildDescriptors.add
			(createChildParameter
				(MiningDataPackage.Literals.MINING_DATA_CONTAINER__CATEGORICAL_ATTRIBUTE_PROPERTIES,
				 MiningDataFactory.eINSTANCE.createOrdinalAttributeProperties()));

		newChildDescriptors.add
			(createChildParameter
				(MiningDataPackage.Literals.MINING_DATA_CONTAINER__DIRECT_ATTRIBUTE_ASSIGNMENT,
				 MiningDataFactory.eINSTANCE.createDirectAttributeAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(MiningDataPackage.Literals.MINING_DATA_CONTAINER__LOGICAL_ATTRIBUTE,
				 MiningDataFactory.eINSTANCE.createLogicalAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(MiningDataPackage.Literals.MINING_DATA_CONTAINER__LOGICAL_DATA,
				 MiningDataFactory.eINSTANCE.createLogicalData()));

		newChildDescriptors.add
			(createChildParameter
				(MiningDataPackage.Literals.MINING_DATA_CONTAINER__MINING_ATTRIBUTE,
				 MiningDataFactory.eINSTANCE.createLogicalAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(MiningDataPackage.Literals.MINING_DATA_CONTAINER__MINING_ATTRIBUTE,
				 MiningModelFactory.eINSTANCE.createSignatureAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(MiningDataPackage.Literals.MINING_DATA_CONTAINER__MINING_ATTRIBUTE,
				 MiningTaskFactory.eINSTANCE.createApplyOutputItem()));

		newChildDescriptors.add
			(createChildParameter
				(MiningDataPackage.Literals.MINING_DATA_CONTAINER__MINING_ATTRIBUTE,
				 MiningTaskFactory.eINSTANCE.createApplyProbabilityItem()));

		newChildDescriptors.add
			(createChildParameter
				(MiningDataPackage.Literals.MINING_DATA_CONTAINER__MINING_ATTRIBUTE,
				 MiningTaskFactory.eINSTANCE.createApplyRuleIdItem()));

		newChildDescriptors.add
			(createChildParameter
				(MiningDataPackage.Literals.MINING_DATA_CONTAINER__MINING_ATTRIBUTE,
				 MiningTaskFactory.eINSTANCE.createApplyScoreItem()));

		newChildDescriptors.add
			(createChildParameter
				(MiningDataPackage.Literals.MINING_DATA_CONTAINER__MINING_ATTRIBUTE,
				 MiningTaskFactory.eINSTANCE.createApplySourceItem()));

		newChildDescriptors.add
			(createChildParameter
				(MiningDataPackage.Literals.MINING_DATA_CONTAINER__MINING_ATTRIBUTE,
				 ClassificationFactory.eINSTANCE.createApplyTargetValueItem()));

		newChildDescriptors.add
			(createChildParameter
				(MiningDataPackage.Literals.MINING_DATA_CONTAINER__NUMERICAL_ATTRIBUTE_PROPERTIES,
				 MiningDataFactory.eINSTANCE.createNumericalAttributeProperties()));

		newChildDescriptors.add
			(createChildParameter
				(MiningDataPackage.Literals.MINING_DATA_CONTAINER__ORDINAL_ATTRIBUTE_PROPERTIES,
				 MiningDataFactory.eINSTANCE.createOrdinalAttributeProperties()));

		newChildDescriptors.add
			(createChildParameter
				(MiningDataPackage.Literals.MINING_DATA_CONTAINER__PHYSICAL_DATA,
				 MiningDataFactory.eINSTANCE.createPhysicalData()));

		newChildDescriptors.add
			(createChildParameter
				(MiningDataPackage.Literals.MINING_DATA_CONTAINER__PIVOT_ATTRIBUTE_ASSIGNMENT,
				 MiningDataFactory.eINSTANCE.createPivotAttributeAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(MiningDataPackage.Literals.MINING_DATA_CONTAINER__REVERSE_PIVOT_ATTRIBUTE_ASSIGNMENT,
				 MiningDataFactory.eINSTANCE.createReversePivotAttributeAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(MiningDataPackage.Literals.MINING_DATA_CONTAINER__SET_ATTRIBUTE_ASSIGNMENT,
				 MiningDataFactory.eINSTANCE.createSetAttributeAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(MiningDataPackage.Literals.MINING_DATA_CONTAINER__CATEGORY,
				 MiningDataFactory.eINSTANCE.createCategory()));

		newChildDescriptors.add
			(createChildParameter
				(MiningDataPackage.Literals.MINING_DATA_CONTAINER__CATEGORY_MAP,
				 MiningDataFactory.eINSTANCE.createCategoryMap()));

		newChildDescriptors.add
			(createChildParameter
				(MiningDataPackage.Literals.MINING_DATA_CONTAINER__CATEGORY_MAP,
				 MiningDataFactory.eINSTANCE.createCategoryMapObject()));

		newChildDescriptors.add
			(createChildParameter
				(MiningDataPackage.Literals.MINING_DATA_CONTAINER__CATEGORY_MAP,
				 MiningDataFactory.eINSTANCE.createCategoryMapTable()));

		newChildDescriptors.add
			(createChildParameter
				(MiningDataPackage.Literals.MINING_DATA_CONTAINER__CATEGORY_MAP_OBJECT,
				 MiningDataFactory.eINSTANCE.createCategoryMapObject()));

		newChildDescriptors.add
			(createChildParameter
				(MiningDataPackage.Literals.MINING_DATA_CONTAINER__CATEGORY_MAP_OBJECT_ENTRY,
				 MiningDataFactory.eINSTANCE.createCategoryMapObjectEntry()));

		newChildDescriptors.add
			(createChildParameter
				(MiningDataPackage.Literals.MINING_DATA_CONTAINER__CATEGORY_MAP_TABLE,
				 MiningDataFactory.eINSTANCE.createCategoryMapTable()));

		newChildDescriptors.add
			(createChildParameter
				(MiningDataPackage.Literals.MINING_DATA_CONTAINER__CATEGORY_MATRIX,
				 MiningDataFactory.eINSTANCE.createCategoryMatrix()));

		newChildDescriptors.add
			(createChildParameter
				(MiningDataPackage.Literals.MINING_DATA_CONTAINER__CATEGORY_MATRIX,
				 MiningDataFactory.eINSTANCE.createCategoryMatrixObject()));

		newChildDescriptors.add
			(createChildParameter
				(MiningDataPackage.Literals.MINING_DATA_CONTAINER__CATEGORY_MATRIX,
				 MiningDataFactory.eINSTANCE.createCategoryMatrixTable()));

		newChildDescriptors.add
			(createChildParameter
				(MiningDataPackage.Literals.MINING_DATA_CONTAINER__CATEGORY_MATRIX_ENTRY,
				 MiningDataFactory.eINSTANCE.createCategoryMatrixEntry()));

		newChildDescriptors.add
			(createChildParameter
				(MiningDataPackage.Literals.MINING_DATA_CONTAINER__CATEGORY_MATRIX_OBJECT,
				 MiningDataFactory.eINSTANCE.createCategoryMatrixObject()));

		newChildDescriptors.add
			(createChildParameter
				(MiningDataPackage.Literals.MINING_DATA_CONTAINER__CATEGORY_MATRIX_TABLE,
				 MiningDataFactory.eINSTANCE.createCategoryMatrixTable()));

		newChildDescriptors.add
			(createChildParameter
				(MiningDataPackage.Literals.MINING_DATA_CONTAINER__CATEGORY_TAXONOMY,
				 MiningDataFactory.eINSTANCE.createCategoryTaxonomy()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == MiningDataPackage.Literals.MINING_DATA_CONTAINER__ATTRIBUTE_ASSIGNMENT ||
			childFeature == MiningDataPackage.Literals.MINING_DATA_CONTAINER__DIRECT_ATTRIBUTE_ASSIGNMENT ||
			childFeature == MiningDataPackage.Literals.MINING_DATA_CONTAINER__PIVOT_ATTRIBUTE_ASSIGNMENT ||
			childFeature == MiningDataPackage.Literals.MINING_DATA_CONTAINER__REVERSE_PIVOT_ATTRIBUTE_ASSIGNMENT ||
			childFeature == MiningDataPackage.Literals.MINING_DATA_CONTAINER__SET_ATTRIBUTE_ASSIGNMENT ||
			childFeature == MiningDataPackage.Literals.MINING_DATA_CONTAINER__CATEGORICAL_ATTRIBUTE_PROPERTIES ||
			childFeature == MiningDataPackage.Literals.MINING_DATA_CONTAINER__ORDINAL_ATTRIBUTE_PROPERTIES ||
			childFeature == MiningDataPackage.Literals.MINING_DATA_CONTAINER__LOGICAL_ATTRIBUTE ||
			childFeature == MiningDataPackage.Literals.MINING_DATA_CONTAINER__MINING_ATTRIBUTE ||
			childFeature == MiningDataPackage.Literals.MINING_DATA_CONTAINER__CATEGORY_MAP ||
			childFeature == MiningDataPackage.Literals.MINING_DATA_CONTAINER__CATEGORY_MAP_OBJECT ||
			childFeature == MiningDataPackage.Literals.MINING_DATA_CONTAINER__CATEGORY_MAP_TABLE ||
			childFeature == MiningDataPackage.Literals.MINING_DATA_CONTAINER__CATEGORY_MATRIX ||
			childFeature == MiningDataPackage.Literals.MINING_DATA_CONTAINER__CATEGORY_MATRIX_OBJECT ||
			childFeature == MiningDataPackage.Literals.MINING_DATA_CONTAINER__CATEGORY_MATRIX_TABLE;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return CwmEditPlugin.INSTANCE;
	}

}

/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.EntryPoint.provider;


import CWM.Approximation.ApproximationFactory;

import CWM.AssociationRules.AssociationRulesFactory;

import CWM.AttributeImportance.AttributeImportanceFactory;

import CWM.Classification.ClassificationFactory;

import CWM.Clustering.ClusteringFactory;

import CWM.Core.CorePackage;

import CWM.Core.provider.NamespaceItemProvider;

import CWM.MiningCore.EntryPoint.EntryPointFactory;
import CWM.MiningCore.EntryPoint.EntryPointPackage;
import CWM.MiningCore.EntryPoint.Schema;

import CWM.MiningCore.MiningData.MiningDataFactory;

import CWM.MiningCore.MiningModel.MiningModelFactory;

import CWM.MiningCore.MiningTask.MiningTaskFactory;

import CWM.Supervised.SupervisedFactory;

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
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link CWM.MiningCore.EntryPoint.Schema} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SchemaItemProvider
	extends NamespaceItemProvider
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
	public SchemaItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(EntryPointPackage.Literals.SCHEMA__LOGICAL_DATA);
			childrenFeatures.add(EntryPointPackage.Literals.SCHEMA__CATEGORY_MATRIX);
			childrenFeatures.add(EntryPointPackage.Literals.SCHEMA__MINING_MODEL);
			childrenFeatures.add(EntryPointPackage.Literals.SCHEMA__MINING_FUNCTION_SETTINGS);
			childrenFeatures.add(EntryPointPackage.Literals.SCHEMA__TAXONOMY);
			childrenFeatures.add(EntryPointPackage.Literals.SCHEMA__MINING_TASK);
			childrenFeatures.add(EntryPointPackage.Literals.SCHEMA__RESULT);
			childrenFeatures.add(EntryPointPackage.Literals.SCHEMA__AUX_OBJECTS);
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
	 * This returns Schema.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Schema"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Schema)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Schema_type") :
			getString("_UI_Schema_type") + " " + label;
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

		switch (notification.getFeatureID(Schema.class)) {
			case EntryPointPackage.SCHEMA__LOGICAL_DATA:
			case EntryPointPackage.SCHEMA__CATEGORY_MATRIX:
			case EntryPointPackage.SCHEMA__MINING_MODEL:
			case EntryPointPackage.SCHEMA__MINING_FUNCTION_SETTINGS:
			case EntryPointPackage.SCHEMA__TAXONOMY:
			case EntryPointPackage.SCHEMA__MINING_TASK:
			case EntryPointPackage.SCHEMA__RESULT:
			case EntryPointPackage.SCHEMA__AUX_OBJECTS:
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
				(EntryPointPackage.Literals.SCHEMA__LOGICAL_DATA,
				 MiningDataFactory.eINSTANCE.createLogicalData()));

		newChildDescriptors.add
			(createChildParameter
				(EntryPointPackage.Literals.SCHEMA__CATEGORY_MATRIX,
				 MiningDataFactory.eINSTANCE.createCategoryMatrix()));

		newChildDescriptors.add
			(createChildParameter
				(EntryPointPackage.Literals.SCHEMA__CATEGORY_MATRIX,
				 MiningDataFactory.eINSTANCE.createCategoryMatrixObject()));

		newChildDescriptors.add
			(createChildParameter
				(EntryPointPackage.Literals.SCHEMA__CATEGORY_MATRIX,
				 MiningDataFactory.eINSTANCE.createCategoryMatrixTable()));

		newChildDescriptors.add
			(createChildParameter
				(EntryPointPackage.Literals.SCHEMA__MINING_MODEL,
				 MiningModelFactory.eINSTANCE.createMiningModel()));

		newChildDescriptors.add
			(createChildParameter
				(EntryPointPackage.Literals.SCHEMA__MINING_FUNCTION_SETTINGS,
				 ClusteringFactory.eINSTANCE.createClusteringFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(EntryPointPackage.Literals.SCHEMA__MINING_FUNCTION_SETTINGS,
				 AssociationRulesFactory.eINSTANCE.createFrequentItemSetFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(EntryPointPackage.Literals.SCHEMA__MINING_FUNCTION_SETTINGS,
				 AssociationRulesFactory.eINSTANCE.createAssociationRulesFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(EntryPointPackage.Literals.SCHEMA__MINING_FUNCTION_SETTINGS,
				 AssociationRulesFactory.eINSTANCE.createSequenceFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(EntryPointPackage.Literals.SCHEMA__MINING_FUNCTION_SETTINGS,
				 SupervisedFactory.eINSTANCE.createSupervisedFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(EntryPointPackage.Literals.SCHEMA__MINING_FUNCTION_SETTINGS,
				 ClassificationFactory.eINSTANCE.createClassificationFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(EntryPointPackage.Literals.SCHEMA__MINING_FUNCTION_SETTINGS,
				 ApproximationFactory.eINSTANCE.createApproximationFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(EntryPointPackage.Literals.SCHEMA__MINING_FUNCTION_SETTINGS,
				 AttributeImportanceFactory.eINSTANCE.createAttributeImportanceSettings()));

		newChildDescriptors.add
			(createChildParameter
				(EntryPointPackage.Literals.SCHEMA__TAXONOMY,
				 MiningDataFactory.eINSTANCE.createCategoryTaxonomy()));

		newChildDescriptors.add
			(createChildParameter
				(EntryPointPackage.Literals.SCHEMA__MINING_TASK,
				 MiningTaskFactory.eINSTANCE.createMiningApplyTask()));

		newChildDescriptors.add
			(createChildParameter
				(EntryPointPackage.Literals.SCHEMA__MINING_TASK,
				 MiningTaskFactory.eINSTANCE.createMiningBuildTask()));

		newChildDescriptors.add
			(createChildParameter
				(EntryPointPackage.Literals.SCHEMA__MINING_TASK,
				 SupervisedFactory.eINSTANCE.createMiningTestTask()));

		newChildDescriptors.add
			(createChildParameter
				(EntryPointPackage.Literals.SCHEMA__MINING_TASK,
				 ClassificationFactory.eINSTANCE.createClassificationTestTask()));

		newChildDescriptors.add
			(createChildParameter
				(EntryPointPackage.Literals.SCHEMA__MINING_TASK,
				 ApproximationFactory.eINSTANCE.createApproximationTestTask()));

		newChildDescriptors.add
			(createChildParameter
				(EntryPointPackage.Literals.SCHEMA__RESULT,
				 SupervisedFactory.eINSTANCE.createMiningTestResult()));

		newChildDescriptors.add
			(createChildParameter
				(EntryPointPackage.Literals.SCHEMA__RESULT,
				 ClassificationFactory.eINSTANCE.createClassificationTestResult()));

		newChildDescriptors.add
			(createChildParameter
				(EntryPointPackage.Literals.SCHEMA__RESULT,
				 ApproximationFactory.eINSTANCE.createApproximationTestResult()));

		newChildDescriptors.add
			(createChildParameter
				(EntryPointPackage.Literals.SCHEMA__AUX_OBJECTS,
				 EntryPointFactory.eINSTANCE.createAuxiliaryObject()));
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
			childFeature == CorePackage.Literals.NAMESPACE__OWNED_ELEMENT ||
			childFeature == EntryPointPackage.Literals.SCHEMA__AUX_OBJECTS ||
			childFeature == EntryPointPackage.Literals.SCHEMA__LOGICAL_DATA ||
			childFeature == EntryPointPackage.Literals.SCHEMA__CATEGORY_MATRIX ||
			childFeature == EntryPointPackage.Literals.SCHEMA__TAXONOMY ||
			childFeature == EntryPointPackage.Literals.SCHEMA__MINING_MODEL ||
			childFeature == EntryPointPackage.Literals.SCHEMA__MINING_TASK ||
			childFeature == EntryPointPackage.Literals.SCHEMA__MINING_FUNCTION_SETTINGS ||
			childFeature == EntryPointPackage.Literals.SCHEMA__RESULT;

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

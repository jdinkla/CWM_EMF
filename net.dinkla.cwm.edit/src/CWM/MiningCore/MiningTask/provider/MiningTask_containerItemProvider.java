/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningTask.provider;


import CWM.Approximation.ApproximationFactory;

import CWM.Classification.ClassificationFactory;

import CWM.MiningCore.MiningTask.MiningTaskFactory;
import CWM.MiningCore.MiningTask.MiningTaskPackage;
import CWM.MiningCore.MiningTask.MiningTask_container;

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
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link CWM.MiningCore.MiningTask.MiningTask_container} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MiningTask_containerItemProvider
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
	public MiningTask_containerItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(MiningTaskPackage.Literals.MINING_TASK_CONTAINER__APPLY_CONTENT_ITEM);
			childrenFeatures.add(MiningTaskPackage.Literals.MINING_TASK_CONTAINER__APPLY_OUTPUT_ITEM);
			childrenFeatures.add(MiningTaskPackage.Literals.MINING_TASK_CONTAINER__APPLY_PROBABILITY_ITEM);
			childrenFeatures.add(MiningTaskPackage.Literals.MINING_TASK_CONTAINER__APPLY_RULE_ID_ITEM);
			childrenFeatures.add(MiningTaskPackage.Literals.MINING_TASK_CONTAINER__APPLY_SCORE_ITEM);
			childrenFeatures.add(MiningTaskPackage.Literals.MINING_TASK_CONTAINER__APPLY_SOURCE_ITEM);
			childrenFeatures.add(MiningTaskPackage.Literals.MINING_TASK_CONTAINER__MINING_APPLY_OUTPUT);
			childrenFeatures.add(MiningTaskPackage.Literals.MINING_TASK_CONTAINER__MINING_APPLY_TASK);
			childrenFeatures.add(MiningTaskPackage.Literals.MINING_TASK_CONTAINER__MINING_BUILD_TASK);
			childrenFeatures.add(MiningTaskPackage.Literals.MINING_TASK_CONTAINER__MINING_TASK);
			childrenFeatures.add(MiningTaskPackage.Literals.MINING_TASK_CONTAINER__MINING_TRANSFORMATION);
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
	 * This returns MiningTask_container.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MiningTask_container"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_MiningTask_container_type");
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

		switch (notification.getFeatureID(MiningTask_container.class)) {
			case MiningTaskPackage.MINING_TASK_CONTAINER__APPLY_CONTENT_ITEM:
			case MiningTaskPackage.MINING_TASK_CONTAINER__APPLY_OUTPUT_ITEM:
			case MiningTaskPackage.MINING_TASK_CONTAINER__APPLY_PROBABILITY_ITEM:
			case MiningTaskPackage.MINING_TASK_CONTAINER__APPLY_RULE_ID_ITEM:
			case MiningTaskPackage.MINING_TASK_CONTAINER__APPLY_SCORE_ITEM:
			case MiningTaskPackage.MINING_TASK_CONTAINER__APPLY_SOURCE_ITEM:
			case MiningTaskPackage.MINING_TASK_CONTAINER__MINING_APPLY_OUTPUT:
			case MiningTaskPackage.MINING_TASK_CONTAINER__MINING_APPLY_TASK:
			case MiningTaskPackage.MINING_TASK_CONTAINER__MINING_BUILD_TASK:
			case MiningTaskPackage.MINING_TASK_CONTAINER__MINING_TASK:
			case MiningTaskPackage.MINING_TASK_CONTAINER__MINING_TRANSFORMATION:
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
				(MiningTaskPackage.Literals.MINING_TASK_CONTAINER__APPLY_CONTENT_ITEM,
				 MiningTaskFactory.eINSTANCE.createApplyProbabilityItem()));

		newChildDescriptors.add
			(createChildParameter
				(MiningTaskPackage.Literals.MINING_TASK_CONTAINER__APPLY_CONTENT_ITEM,
				 MiningTaskFactory.eINSTANCE.createApplyRuleIdItem()));

		newChildDescriptors.add
			(createChildParameter
				(MiningTaskPackage.Literals.MINING_TASK_CONTAINER__APPLY_CONTENT_ITEM,
				 MiningTaskFactory.eINSTANCE.createApplyScoreItem()));

		newChildDescriptors.add
			(createChildParameter
				(MiningTaskPackage.Literals.MINING_TASK_CONTAINER__APPLY_OUTPUT_ITEM,
				 MiningTaskFactory.eINSTANCE.createApplyOutputItem()));

		newChildDescriptors.add
			(createChildParameter
				(MiningTaskPackage.Literals.MINING_TASK_CONTAINER__APPLY_OUTPUT_ITEM,
				 MiningTaskFactory.eINSTANCE.createApplyProbabilityItem()));

		newChildDescriptors.add
			(createChildParameter
				(MiningTaskPackage.Literals.MINING_TASK_CONTAINER__APPLY_OUTPUT_ITEM,
				 MiningTaskFactory.eINSTANCE.createApplyRuleIdItem()));

		newChildDescriptors.add
			(createChildParameter
				(MiningTaskPackage.Literals.MINING_TASK_CONTAINER__APPLY_OUTPUT_ITEM,
				 MiningTaskFactory.eINSTANCE.createApplyScoreItem()));

		newChildDescriptors.add
			(createChildParameter
				(MiningTaskPackage.Literals.MINING_TASK_CONTAINER__APPLY_OUTPUT_ITEM,
				 MiningTaskFactory.eINSTANCE.createApplySourceItem()));

		newChildDescriptors.add
			(createChildParameter
				(MiningTaskPackage.Literals.MINING_TASK_CONTAINER__APPLY_OUTPUT_ITEM,
				 ClassificationFactory.eINSTANCE.createApplyTargetValueItem()));

		newChildDescriptors.add
			(createChildParameter
				(MiningTaskPackage.Literals.MINING_TASK_CONTAINER__APPLY_PROBABILITY_ITEM,
				 MiningTaskFactory.eINSTANCE.createApplyProbabilityItem()));

		newChildDescriptors.add
			(createChildParameter
				(MiningTaskPackage.Literals.MINING_TASK_CONTAINER__APPLY_RULE_ID_ITEM,
				 MiningTaskFactory.eINSTANCE.createApplyRuleIdItem()));

		newChildDescriptors.add
			(createChildParameter
				(MiningTaskPackage.Literals.MINING_TASK_CONTAINER__APPLY_SCORE_ITEM,
				 MiningTaskFactory.eINSTANCE.createApplyScoreItem()));

		newChildDescriptors.add
			(createChildParameter
				(MiningTaskPackage.Literals.MINING_TASK_CONTAINER__APPLY_SOURCE_ITEM,
				 MiningTaskFactory.eINSTANCE.createApplySourceItem()));

		newChildDescriptors.add
			(createChildParameter
				(MiningTaskPackage.Literals.MINING_TASK_CONTAINER__MINING_APPLY_OUTPUT,
				 MiningTaskFactory.eINSTANCE.createMiningApplyOutput()));

		newChildDescriptors.add
			(createChildParameter
				(MiningTaskPackage.Literals.MINING_TASK_CONTAINER__MINING_APPLY_TASK,
				 MiningTaskFactory.eINSTANCE.createMiningApplyTask()));

		newChildDescriptors.add
			(createChildParameter
				(MiningTaskPackage.Literals.MINING_TASK_CONTAINER__MINING_BUILD_TASK,
				 MiningTaskFactory.eINSTANCE.createMiningBuildTask()));

		newChildDescriptors.add
			(createChildParameter
				(MiningTaskPackage.Literals.MINING_TASK_CONTAINER__MINING_TASK,
				 MiningTaskFactory.eINSTANCE.createMiningApplyTask()));

		newChildDescriptors.add
			(createChildParameter
				(MiningTaskPackage.Literals.MINING_TASK_CONTAINER__MINING_TASK,
				 MiningTaskFactory.eINSTANCE.createMiningBuildTask()));

		newChildDescriptors.add
			(createChildParameter
				(MiningTaskPackage.Literals.MINING_TASK_CONTAINER__MINING_TASK,
				 SupervisedFactory.eINSTANCE.createMiningTestTask()));

		newChildDescriptors.add
			(createChildParameter
				(MiningTaskPackage.Literals.MINING_TASK_CONTAINER__MINING_TASK,
				 ClassificationFactory.eINSTANCE.createClassificationTestTask()));

		newChildDescriptors.add
			(createChildParameter
				(MiningTaskPackage.Literals.MINING_TASK_CONTAINER__MINING_TASK,
				 ApproximationFactory.eINSTANCE.createApproximationTestTask()));

		newChildDescriptors.add
			(createChildParameter
				(MiningTaskPackage.Literals.MINING_TASK_CONTAINER__MINING_TRANSFORMATION,
				 MiningTaskFactory.eINSTANCE.createMiningTransformation()));
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
			childFeature == MiningTaskPackage.Literals.MINING_TASK_CONTAINER__APPLY_CONTENT_ITEM ||
			childFeature == MiningTaskPackage.Literals.MINING_TASK_CONTAINER__APPLY_OUTPUT_ITEM ||
			childFeature == MiningTaskPackage.Literals.MINING_TASK_CONTAINER__APPLY_PROBABILITY_ITEM ||
			childFeature == MiningTaskPackage.Literals.MINING_TASK_CONTAINER__APPLY_RULE_ID_ITEM ||
			childFeature == MiningTaskPackage.Literals.MINING_TASK_CONTAINER__APPLY_SCORE_ITEM ||
			childFeature == MiningTaskPackage.Literals.MINING_TASK_CONTAINER__APPLY_SOURCE_ITEM ||
			childFeature == MiningTaskPackage.Literals.MINING_TASK_CONTAINER__MINING_APPLY_TASK ||
			childFeature == MiningTaskPackage.Literals.MINING_TASK_CONTAINER__MINING_TASK ||
			childFeature == MiningTaskPackage.Literals.MINING_TASK_CONTAINER__MINING_BUILD_TASK;

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

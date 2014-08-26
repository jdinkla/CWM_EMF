/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.CwmTransformation.provider;


import CWM.CwmTransformation.CwmTransformationFactory;
import CWM.CwmTransformation.CwmTransformationPackage;
import CWM.CwmTransformation.Transformation_container;

import CWM.MiningCore.MiningTask.MiningTaskFactory;

import CWM.Olap.OlapFactory;

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
 * This is the item provider adapter for a {@link CWM.CwmTransformation.Transformation_container} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Transformation_containerItemProvider
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
	public Transformation_containerItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(CwmTransformationPackage.Literals.TRANSFORMATION_CONTAINER__TRANSFORMATION);
			childrenFeatures.add(CwmTransformationPackage.Literals.TRANSFORMATION_CONTAINER__DATA_OBJECT_SET);
			childrenFeatures.add(CwmTransformationPackage.Literals.TRANSFORMATION_CONTAINER__TRANSFORMATION_TASK);
			childrenFeatures.add(CwmTransformationPackage.Literals.TRANSFORMATION_CONTAINER__TRANSFORMATION_STEP);
			childrenFeatures.add(CwmTransformationPackage.Literals.TRANSFORMATION_CONTAINER__TRANSFORMATION_ACTIVITY);
			childrenFeatures.add(CwmTransformationPackage.Literals.TRANSFORMATION_CONTAINER__PRECEDENCE_CONSTRAINT);
			childrenFeatures.add(CwmTransformationPackage.Literals.TRANSFORMATION_CONTAINER__TRANSFORMATION_USE);
			childrenFeatures.add(CwmTransformationPackage.Literals.TRANSFORMATION_CONTAINER__TRANSFORMATION_MAP);
			childrenFeatures.add(CwmTransformationPackage.Literals.TRANSFORMATION_CONTAINER__TRANSFORMATION_TREE);
			childrenFeatures.add(CwmTransformationPackage.Literals.TRANSFORMATION_CONTAINER__CLASSIFIER_MAP);
			childrenFeatures.add(CwmTransformationPackage.Literals.TRANSFORMATION_CONTAINER__FEATURE_MAP);
			childrenFeatures.add(CwmTransformationPackage.Literals.TRANSFORMATION_CONTAINER__STEP_PRECEDENCE);
			childrenFeatures.add(CwmTransformationPackage.Literals.TRANSFORMATION_CONTAINER__CLASSIFIER_FEATURE_MAP);
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
	 * This returns Transformation_container.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Transformation_container"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Transformation_container_type");
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

		switch (notification.getFeatureID(Transformation_container.class)) {
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__TRANSFORMATION:
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__DATA_OBJECT_SET:
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__TRANSFORMATION_TASK:
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__TRANSFORMATION_STEP:
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__TRANSFORMATION_ACTIVITY:
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__PRECEDENCE_CONSTRAINT:
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__TRANSFORMATION_USE:
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__TRANSFORMATION_MAP:
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__TRANSFORMATION_TREE:
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__CLASSIFIER_MAP:
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__FEATURE_MAP:
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__STEP_PRECEDENCE:
			case CwmTransformationPackage.TRANSFORMATION_CONTAINER__CLASSIFIER_FEATURE_MAP:
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
				(CwmTransformationPackage.Literals.TRANSFORMATION_CONTAINER__TRANSFORMATION,
				 CwmTransformationFactory.eINSTANCE.createTransformation()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_CONTAINER__TRANSFORMATION,
				 CwmTransformationFactory.eINSTANCE.createTransformationMap()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_CONTAINER__TRANSFORMATION,
				 CwmTransformationFactory.eINSTANCE.createTransformationTree()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_CONTAINER__TRANSFORMATION,
				 OlapFactory.eINSTANCE.createContentMap()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_CONTAINER__TRANSFORMATION,
				 OlapFactory.eINSTANCE.createStructureMap()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_CONTAINER__TRANSFORMATION,
				 MiningTaskFactory.eINSTANCE.createMiningTransformation()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_CONTAINER__DATA_OBJECT_SET,
				 CwmTransformationFactory.eINSTANCE.createDataObjectSet()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_CONTAINER__TRANSFORMATION_TASK,
				 CwmTransformationFactory.eINSTANCE.createTransformationTask()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_CONTAINER__TRANSFORMATION_STEP,
				 CwmTransformationFactory.eINSTANCE.createTransformationStep()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_CONTAINER__TRANSFORMATION_ACTIVITY,
				 CwmTransformationFactory.eINSTANCE.createTransformationActivity()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_CONTAINER__PRECEDENCE_CONSTRAINT,
				 CwmTransformationFactory.eINSTANCE.createPrecedenceConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_CONTAINER__TRANSFORMATION_USE,
				 CwmTransformationFactory.eINSTANCE.createTransformationUse()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_CONTAINER__TRANSFORMATION_MAP,
				 CwmTransformationFactory.eINSTANCE.createTransformationMap()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_CONTAINER__TRANSFORMATION_MAP,
				 OlapFactory.eINSTANCE.createContentMap()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_CONTAINER__TRANSFORMATION_MAP,
				 OlapFactory.eINSTANCE.createStructureMap()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_CONTAINER__TRANSFORMATION_TREE,
				 CwmTransformationFactory.eINSTANCE.createTransformationTree()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_CONTAINER__CLASSIFIER_MAP,
				 CwmTransformationFactory.eINSTANCE.createClassifierMap()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_CONTAINER__FEATURE_MAP,
				 CwmTransformationFactory.eINSTANCE.createFeatureMap()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_CONTAINER__STEP_PRECEDENCE,
				 CwmTransformationFactory.eINSTANCE.createStepPrecedence()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_CONTAINER__CLASSIFIER_FEATURE_MAP,
				 CwmTransformationFactory.eINSTANCE.createClassifierFeatureMap()));
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
			childFeature == CwmTransformationPackage.Literals.TRANSFORMATION_CONTAINER__TRANSFORMATION ||
			childFeature == CwmTransformationPackage.Literals.TRANSFORMATION_CONTAINER__TRANSFORMATION_MAP ||
			childFeature == CwmTransformationPackage.Literals.TRANSFORMATION_CONTAINER__TRANSFORMATION_TREE;

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

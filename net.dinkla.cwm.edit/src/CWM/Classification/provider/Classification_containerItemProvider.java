/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Classification.provider;


import CWM.Classification.ClassificationFactory;
import CWM.Classification.ClassificationPackage;
import CWM.Classification.Classification_container;

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
 * This is the item provider adapter for a {@link CWM.Classification.Classification_container} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Classification_containerItemProvider
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
	public Classification_containerItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(ClassificationPackage.Literals.CLASSIFICATION_CONTAINER__APPLY_TARGET_VALUE_ITEM);
			childrenFeatures.add(ClassificationPackage.Literals.CLASSIFICATION_CONTAINER__CLASSIFICATION_ATTRIBUTE_USAGE);
			childrenFeatures.add(ClassificationPackage.Literals.CLASSIFICATION_CONTAINER__CLASSIFICATION_FUNCTION_SETTINGS);
			childrenFeatures.add(ClassificationPackage.Literals.CLASSIFICATION_CONTAINER__CLASSIFICATION_TEST_RESULT);
			childrenFeatures.add(ClassificationPackage.Literals.CLASSIFICATION_CONTAINER__CLASSIFICATION_TEST_TASK);
			childrenFeatures.add(ClassificationPackage.Literals.CLASSIFICATION_CONTAINER__PRIOR_PROBABILITIES);
			childrenFeatures.add(ClassificationPackage.Literals.CLASSIFICATION_CONTAINER__PRIOR_PROBABILITIES_ENTRY);
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
	 * This returns Classification_container.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Classification_container"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Classification_container_type");
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

		switch (notification.getFeatureID(Classification_container.class)) {
			case ClassificationPackage.CLASSIFICATION_CONTAINER__APPLY_TARGET_VALUE_ITEM:
			case ClassificationPackage.CLASSIFICATION_CONTAINER__CLASSIFICATION_ATTRIBUTE_USAGE:
			case ClassificationPackage.CLASSIFICATION_CONTAINER__CLASSIFICATION_FUNCTION_SETTINGS:
			case ClassificationPackage.CLASSIFICATION_CONTAINER__CLASSIFICATION_TEST_RESULT:
			case ClassificationPackage.CLASSIFICATION_CONTAINER__CLASSIFICATION_TEST_TASK:
			case ClassificationPackage.CLASSIFICATION_CONTAINER__PRIOR_PROBABILITIES:
			case ClassificationPackage.CLASSIFICATION_CONTAINER__PRIOR_PROBABILITIES_ENTRY:
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
				(ClassificationPackage.Literals.CLASSIFICATION_CONTAINER__APPLY_TARGET_VALUE_ITEM,
				 ClassificationFactory.eINSTANCE.createApplyTargetValueItem()));

		newChildDescriptors.add
			(createChildParameter
				(ClassificationPackage.Literals.CLASSIFICATION_CONTAINER__CLASSIFICATION_ATTRIBUTE_USAGE,
				 ClassificationFactory.eINSTANCE.createClassificationAttributeUsage()));

		newChildDescriptors.add
			(createChildParameter
				(ClassificationPackage.Literals.CLASSIFICATION_CONTAINER__CLASSIFICATION_FUNCTION_SETTINGS,
				 ClassificationFactory.eINSTANCE.createClassificationFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(ClassificationPackage.Literals.CLASSIFICATION_CONTAINER__CLASSIFICATION_TEST_RESULT,
				 ClassificationFactory.eINSTANCE.createClassificationTestResult()));

		newChildDescriptors.add
			(createChildParameter
				(ClassificationPackage.Literals.CLASSIFICATION_CONTAINER__CLASSIFICATION_TEST_TASK,
				 ClassificationFactory.eINSTANCE.createClassificationTestTask()));

		newChildDescriptors.add
			(createChildParameter
				(ClassificationPackage.Literals.CLASSIFICATION_CONTAINER__PRIOR_PROBABILITIES,
				 ClassificationFactory.eINSTANCE.createPriorProbabilities()));

		newChildDescriptors.add
			(createChildParameter
				(ClassificationPackage.Literals.CLASSIFICATION_CONTAINER__PRIOR_PROBABILITIES_ENTRY,
				 ClassificationFactory.eINSTANCE.createPriorProbabilitiesEntry()));
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

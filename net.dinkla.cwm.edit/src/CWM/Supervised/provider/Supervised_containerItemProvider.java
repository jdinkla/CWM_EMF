/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Supervised.provider;


import CWM.Approximation.ApproximationFactory;

import CWM.AttributeImportance.AttributeImportanceFactory;

import CWM.Classification.ClassificationFactory;

import CWM.Supervised.SupervisedFactory;
import CWM.Supervised.SupervisedPackage;
import CWM.Supervised.Supervised_container;

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
 * This is the item provider adapter for a {@link CWM.Supervised.Supervised_container} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Supervised_containerItemProvider
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
	public Supervised_containerItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(SupervisedPackage.Literals.SUPERVISED_CONTAINER__LIFT_ANALYSIS_POINT);
			childrenFeatures.add(SupervisedPackage.Literals.SUPERVISED_CONTAINER__LIFT_ANALYSIS);
			childrenFeatures.add(SupervisedPackage.Literals.SUPERVISED_CONTAINER__MINING_TEST_TASK);
			childrenFeatures.add(SupervisedPackage.Literals.SUPERVISED_CONTAINER__SUPERVISED_FUNCTION_SETTINGS);
			childrenFeatures.add(SupervisedPackage.Literals.SUPERVISED_CONTAINER__MINING_TEST_RESULT);
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
	 * This returns Supervised_container.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Supervised_container"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Supervised_container_type");
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

		switch (notification.getFeatureID(Supervised_container.class)) {
			case SupervisedPackage.SUPERVISED_CONTAINER__LIFT_ANALYSIS_POINT:
			case SupervisedPackage.SUPERVISED_CONTAINER__LIFT_ANALYSIS:
			case SupervisedPackage.SUPERVISED_CONTAINER__MINING_TEST_TASK:
			case SupervisedPackage.SUPERVISED_CONTAINER__SUPERVISED_FUNCTION_SETTINGS:
			case SupervisedPackage.SUPERVISED_CONTAINER__MINING_TEST_RESULT:
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
				(SupervisedPackage.Literals.SUPERVISED_CONTAINER__LIFT_ANALYSIS_POINT,
				 SupervisedFactory.eINSTANCE.createLiftAnalysisPoint()));

		newChildDescriptors.add
			(createChildParameter
				(SupervisedPackage.Literals.SUPERVISED_CONTAINER__LIFT_ANALYSIS,
				 SupervisedFactory.eINSTANCE.createLiftAnalysis()));

		newChildDescriptors.add
			(createChildParameter
				(SupervisedPackage.Literals.SUPERVISED_CONTAINER__MINING_TEST_TASK,
				 SupervisedFactory.eINSTANCE.createMiningTestTask()));

		newChildDescriptors.add
			(createChildParameter
				(SupervisedPackage.Literals.SUPERVISED_CONTAINER__MINING_TEST_TASK,
				 ClassificationFactory.eINSTANCE.createClassificationTestTask()));

		newChildDescriptors.add
			(createChildParameter
				(SupervisedPackage.Literals.SUPERVISED_CONTAINER__MINING_TEST_TASK,
				 ApproximationFactory.eINSTANCE.createApproximationTestTask()));

		newChildDescriptors.add
			(createChildParameter
				(SupervisedPackage.Literals.SUPERVISED_CONTAINER__SUPERVISED_FUNCTION_SETTINGS,
				 SupervisedFactory.eINSTANCE.createSupervisedFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(SupervisedPackage.Literals.SUPERVISED_CONTAINER__SUPERVISED_FUNCTION_SETTINGS,
				 ClassificationFactory.eINSTANCE.createClassificationFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(SupervisedPackage.Literals.SUPERVISED_CONTAINER__SUPERVISED_FUNCTION_SETTINGS,
				 ApproximationFactory.eINSTANCE.createApproximationFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(SupervisedPackage.Literals.SUPERVISED_CONTAINER__SUPERVISED_FUNCTION_SETTINGS,
				 AttributeImportanceFactory.eINSTANCE.createAttributeImportanceSettings()));

		newChildDescriptors.add
			(createChildParameter
				(SupervisedPackage.Literals.SUPERVISED_CONTAINER__MINING_TEST_RESULT,
				 SupervisedFactory.eINSTANCE.createMiningTestResult()));

		newChildDescriptors.add
			(createChildParameter
				(SupervisedPackage.Literals.SUPERVISED_CONTAINER__MINING_TEST_RESULT,
				 ClassificationFactory.eINSTANCE.createClassificationTestResult()));

		newChildDescriptors.add
			(createChildParameter
				(SupervisedPackage.Literals.SUPERVISED_CONTAINER__MINING_TEST_RESULT,
				 ApproximationFactory.eINSTANCE.createApproximationTestResult()));
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

/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.SoftwareDeployment.provider;


import CWM.CwmTransformation.CwmTransformationFactory;

import CWM.SoftwareDeployment.SoftwareDeploymentFactory;
import CWM.SoftwareDeployment.SoftwareDeploymentPackage;
import CWM.SoftwareDeployment.SoftwareDeployment_container;

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
 * This is the item provider adapter for a {@link CWM.SoftwareDeployment.SoftwareDeployment_container} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SoftwareDeployment_containerItemProvider
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
	public SoftwareDeployment_containerItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(SoftwareDeploymentPackage.Literals.SOFTWARE_DEPLOYMENT_CONTAINER__SITE);
			childrenFeatures.add(SoftwareDeploymentPackage.Literals.SOFTWARE_DEPLOYMENT_CONTAINER__MACHINE);
			childrenFeatures.add(SoftwareDeploymentPackage.Literals.SOFTWARE_DEPLOYMENT_CONTAINER__SOFTWARE_SYSTEM);
			childrenFeatures.add(SoftwareDeploymentPackage.Literals.SOFTWARE_DEPLOYMENT_CONTAINER__DEPLOYED_COMPONENT);
			childrenFeatures.add(SoftwareDeploymentPackage.Literals.SOFTWARE_DEPLOYMENT_CONTAINER__DEPLOYED_SOFTWARE_SYSTEM);
			childrenFeatures.add(SoftwareDeploymentPackage.Literals.SOFTWARE_DEPLOYMENT_CONTAINER__DATA_MANAGER);
			childrenFeatures.add(SoftwareDeploymentPackage.Literals.SOFTWARE_DEPLOYMENT_CONTAINER__DATA_PROVIDER);
			childrenFeatures.add(SoftwareDeploymentPackage.Literals.SOFTWARE_DEPLOYMENT_CONTAINER__PROVIDER_CONNECTION);
			childrenFeatures.add(SoftwareDeploymentPackage.Literals.SOFTWARE_DEPLOYMENT_CONTAINER__COMPONENT);
			childrenFeatures.add(SoftwareDeploymentPackage.Literals.SOFTWARE_DEPLOYMENT_CONTAINER__PACKAGE_USAGE);
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
	 * This returns SoftwareDeployment_container.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SoftwareDeployment_container"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_SoftwareDeployment_container_type");
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

		switch (notification.getFeatureID(SoftwareDeployment_container.class)) {
			case SoftwareDeploymentPackage.SOFTWARE_DEPLOYMENT_CONTAINER__SITE:
			case SoftwareDeploymentPackage.SOFTWARE_DEPLOYMENT_CONTAINER__MACHINE:
			case SoftwareDeploymentPackage.SOFTWARE_DEPLOYMENT_CONTAINER__SOFTWARE_SYSTEM:
			case SoftwareDeploymentPackage.SOFTWARE_DEPLOYMENT_CONTAINER__DEPLOYED_COMPONENT:
			case SoftwareDeploymentPackage.SOFTWARE_DEPLOYMENT_CONTAINER__DEPLOYED_SOFTWARE_SYSTEM:
			case SoftwareDeploymentPackage.SOFTWARE_DEPLOYMENT_CONTAINER__DATA_MANAGER:
			case SoftwareDeploymentPackage.SOFTWARE_DEPLOYMENT_CONTAINER__DATA_PROVIDER:
			case SoftwareDeploymentPackage.SOFTWARE_DEPLOYMENT_CONTAINER__PROVIDER_CONNECTION:
			case SoftwareDeploymentPackage.SOFTWARE_DEPLOYMENT_CONTAINER__COMPONENT:
			case SoftwareDeploymentPackage.SOFTWARE_DEPLOYMENT_CONTAINER__PACKAGE_USAGE:
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
				(SoftwareDeploymentPackage.Literals.SOFTWARE_DEPLOYMENT_CONTAINER__SITE,
				 SoftwareDeploymentFactory.eINSTANCE.createSite()));

		newChildDescriptors.add
			(createChildParameter
				(SoftwareDeploymentPackage.Literals.SOFTWARE_DEPLOYMENT_CONTAINER__MACHINE,
				 SoftwareDeploymentFactory.eINSTANCE.createMachine()));

		newChildDescriptors.add
			(createChildParameter
				(SoftwareDeploymentPackage.Literals.SOFTWARE_DEPLOYMENT_CONTAINER__SOFTWARE_SYSTEM,
				 SoftwareDeploymentFactory.eINSTANCE.createSoftwareSystem()));

		newChildDescriptors.add
			(createChildParameter
				(SoftwareDeploymentPackage.Literals.SOFTWARE_DEPLOYMENT_CONTAINER__DEPLOYED_COMPONENT,
				 SoftwareDeploymentFactory.eINSTANCE.createDeployedComponent()));

		newChildDescriptors.add
			(createChildParameter
				(SoftwareDeploymentPackage.Literals.SOFTWARE_DEPLOYMENT_CONTAINER__DEPLOYED_COMPONENT,
				 SoftwareDeploymentFactory.eINSTANCE.createDataManager()));

		newChildDescriptors.add
			(createChildParameter
				(SoftwareDeploymentPackage.Literals.SOFTWARE_DEPLOYMENT_CONTAINER__DEPLOYED_COMPONENT,
				 SoftwareDeploymentFactory.eINSTANCE.createDataProvider()));

		newChildDescriptors.add
			(createChildParameter
				(SoftwareDeploymentPackage.Literals.SOFTWARE_DEPLOYMENT_CONTAINER__DEPLOYED_SOFTWARE_SYSTEM,
				 SoftwareDeploymentFactory.eINSTANCE.createDeployedSoftwareSystem()));

		newChildDescriptors.add
			(createChildParameter
				(SoftwareDeploymentPackage.Literals.SOFTWARE_DEPLOYMENT_CONTAINER__DATA_MANAGER,
				 SoftwareDeploymentFactory.eINSTANCE.createDataManager()));

		newChildDescriptors.add
			(createChildParameter
				(SoftwareDeploymentPackage.Literals.SOFTWARE_DEPLOYMENT_CONTAINER__DATA_MANAGER,
				 SoftwareDeploymentFactory.eINSTANCE.createDataProvider()));

		newChildDescriptors.add
			(createChildParameter
				(SoftwareDeploymentPackage.Literals.SOFTWARE_DEPLOYMENT_CONTAINER__DATA_PROVIDER,
				 SoftwareDeploymentFactory.eINSTANCE.createDataProvider()));

		newChildDescriptors.add
			(createChildParameter
				(SoftwareDeploymentPackage.Literals.SOFTWARE_DEPLOYMENT_CONTAINER__PROVIDER_CONNECTION,
				 SoftwareDeploymentFactory.eINSTANCE.createProviderConnection()));

		newChildDescriptors.add
			(createChildParameter
				(SoftwareDeploymentPackage.Literals.SOFTWARE_DEPLOYMENT_CONTAINER__COMPONENT,
				 SoftwareDeploymentFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(SoftwareDeploymentPackage.Literals.SOFTWARE_DEPLOYMENT_CONTAINER__COMPONENT,
				 CwmTransformationFactory.eINSTANCE.createTransformationTask()));

		newChildDescriptors.add
			(createChildParameter
				(SoftwareDeploymentPackage.Literals.SOFTWARE_DEPLOYMENT_CONTAINER__PACKAGE_USAGE,
				 SoftwareDeploymentFactory.eINSTANCE.createPackageUsage()));
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
			childFeature == SoftwareDeploymentPackage.Literals.SOFTWARE_DEPLOYMENT_CONTAINER__DEPLOYED_COMPONENT ||
			childFeature == SoftwareDeploymentPackage.Literals.SOFTWARE_DEPLOYMENT_CONTAINER__DATA_MANAGER ||
			childFeature == SoftwareDeploymentPackage.Literals.SOFTWARE_DEPLOYMENT_CONTAINER__DATA_PROVIDER;

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

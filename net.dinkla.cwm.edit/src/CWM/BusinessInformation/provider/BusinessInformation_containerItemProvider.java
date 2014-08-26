/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.BusinessInformation.provider;


import CWM.BusinessInformation.BusinessInformationFactory;
import CWM.BusinessInformation.BusinessInformationPackage;
import CWM.BusinessInformation.BusinessInformation_container;

import CWM.SoftwareDeployment.SoftwareDeploymentFactory;

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
 * This is the item provider adapter for a {@link CWM.BusinessInformation.BusinessInformation_container} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BusinessInformation_containerItemProvider
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
	public BusinessInformation_containerItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(BusinessInformationPackage.Literals.BUSINESS_INFORMATION_CONTAINER__RESPONSIBLE_PARTY);
			childrenFeatures.add(BusinessInformationPackage.Literals.BUSINESS_INFORMATION_CONTAINER__TELEPHONE);
			childrenFeatures.add(BusinessInformationPackage.Literals.BUSINESS_INFORMATION_CONTAINER__EMAIL);
			childrenFeatures.add(BusinessInformationPackage.Literals.BUSINESS_INFORMATION_CONTAINER__LOCATION);
			childrenFeatures.add(BusinessInformationPackage.Literals.BUSINESS_INFORMATION_CONTAINER__CONTACT);
			childrenFeatures.add(BusinessInformationPackage.Literals.BUSINESS_INFORMATION_CONTAINER__DESCRIPTION);
			childrenFeatures.add(BusinessInformationPackage.Literals.BUSINESS_INFORMATION_CONTAINER__DOCUMENT);
			childrenFeatures.add(BusinessInformationPackage.Literals.BUSINESS_INFORMATION_CONTAINER__RESOURCE_LOCATOR);
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
	 * This returns BusinessInformation_container.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BusinessInformation_container"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_BusinessInformation_container_type");
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

		switch (notification.getFeatureID(BusinessInformation_container.class)) {
			case BusinessInformationPackage.BUSINESS_INFORMATION_CONTAINER__RESPONSIBLE_PARTY:
			case BusinessInformationPackage.BUSINESS_INFORMATION_CONTAINER__TELEPHONE:
			case BusinessInformationPackage.BUSINESS_INFORMATION_CONTAINER__EMAIL:
			case BusinessInformationPackage.BUSINESS_INFORMATION_CONTAINER__LOCATION:
			case BusinessInformationPackage.BUSINESS_INFORMATION_CONTAINER__CONTACT:
			case BusinessInformationPackage.BUSINESS_INFORMATION_CONTAINER__DESCRIPTION:
			case BusinessInformationPackage.BUSINESS_INFORMATION_CONTAINER__DOCUMENT:
			case BusinessInformationPackage.BUSINESS_INFORMATION_CONTAINER__RESOURCE_LOCATOR:
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
				(BusinessInformationPackage.Literals.BUSINESS_INFORMATION_CONTAINER__RESPONSIBLE_PARTY,
				 BusinessInformationFactory.eINSTANCE.createResponsibleParty()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessInformationPackage.Literals.BUSINESS_INFORMATION_CONTAINER__TELEPHONE,
				 BusinessInformationFactory.eINSTANCE.createTelephone()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessInformationPackage.Literals.BUSINESS_INFORMATION_CONTAINER__EMAIL,
				 BusinessInformationFactory.eINSTANCE.createEmail()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessInformationPackage.Literals.BUSINESS_INFORMATION_CONTAINER__LOCATION,
				 BusinessInformationFactory.eINSTANCE.createLocation()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessInformationPackage.Literals.BUSINESS_INFORMATION_CONTAINER__LOCATION,
				 SoftwareDeploymentFactory.eINSTANCE.createSite()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessInformationPackage.Literals.BUSINESS_INFORMATION_CONTAINER__CONTACT,
				 BusinessInformationFactory.eINSTANCE.createContact()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessInformationPackage.Literals.BUSINESS_INFORMATION_CONTAINER__DESCRIPTION,
				 BusinessInformationFactory.eINSTANCE.createDescription()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessInformationPackage.Literals.BUSINESS_INFORMATION_CONTAINER__DOCUMENT,
				 BusinessInformationFactory.eINSTANCE.createDocument()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessInformationPackage.Literals.BUSINESS_INFORMATION_CONTAINER__RESOURCE_LOCATOR,
				 BusinessInformationFactory.eINSTANCE.createResourceLocator()));
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

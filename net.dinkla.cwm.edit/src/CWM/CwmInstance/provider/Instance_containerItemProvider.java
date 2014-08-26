/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.CwmInstance.provider;


import CWM.CwmInstance.CwmInstanceFactory;
import CWM.CwmInstance.CwmInstancePackage;
import CWM.CwmInstance.Instance_container;

import CWM.CwmXml.CwmXmlFactory;

import CWM.Multidimensional.MultidimensionalFactory;

import CWM.Record.RecordFactory;

import CWM.Relational.RelationalFactory;

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
 * This is the item provider adapter for a {@link CWM.CwmInstance.Instance_container} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Instance_containerItemProvider
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
	public Instance_containerItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(CwmInstancePackage.Literals.INSTANCE_CONTAINER__DATA_SLOT);
			childrenFeatures.add(CwmInstancePackage.Literals.INSTANCE_CONTAINER__DATA_VALUE);
			childrenFeatures.add(CwmInstancePackage.Literals.INSTANCE_CONTAINER__EXTENT);
			childrenFeatures.add(CwmInstancePackage.Literals.INSTANCE_CONTAINER__INSTANCE);
			childrenFeatures.add(CwmInstancePackage.Literals.INSTANCE_CONTAINER__OBJECT);
			childrenFeatures.add(CwmInstancePackage.Literals.INSTANCE_CONTAINER__SLOT);
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
	 * This returns Instance_container.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Instance_container"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Instance_container_type");
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

		switch (notification.getFeatureID(Instance_container.class)) {
			case CwmInstancePackage.INSTANCE_CONTAINER__DATA_SLOT:
			case CwmInstancePackage.INSTANCE_CONTAINER__DATA_VALUE:
			case CwmInstancePackage.INSTANCE_CONTAINER__EXTENT:
			case CwmInstancePackage.INSTANCE_CONTAINER__INSTANCE:
			case CwmInstancePackage.INSTANCE_CONTAINER__OBJECT:
			case CwmInstancePackage.INSTANCE_CONTAINER__SLOT:
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
				(CwmInstancePackage.Literals.INSTANCE_CONTAINER__DATA_SLOT,
				 CwmInstanceFactory.eINSTANCE.createDataSlot()));

		newChildDescriptors.add
			(createChildParameter
				(CwmInstancePackage.Literals.INSTANCE_CONTAINER__DATA_VALUE,
				 CwmInstanceFactory.eINSTANCE.createDataValue()));

		newChildDescriptors.add
			(createChildParameter
				(CwmInstancePackage.Literals.INSTANCE_CONTAINER__DATA_VALUE,
				 RelationalFactory.eINSTANCE.createColumnValue()));

		newChildDescriptors.add
			(createChildParameter
				(CwmInstancePackage.Literals.INSTANCE_CONTAINER__DATA_VALUE,
				 RecordFactory.eINSTANCE.createFieldValue()));

		newChildDescriptors.add
			(createChildParameter
				(CwmInstancePackage.Literals.INSTANCE_CONTAINER__DATA_VALUE,
				 MultidimensionalFactory.eINSTANCE.createMemberValue()));

		newChildDescriptors.add
			(createChildParameter
				(CwmInstancePackage.Literals.INSTANCE_CONTAINER__EXTENT,
				 CwmInstanceFactory.eINSTANCE.createExtent()));

		newChildDescriptors.add
			(createChildParameter
				(CwmInstancePackage.Literals.INSTANCE_CONTAINER__EXTENT,
				 RelationalFactory.eINSTANCE.createRowSet()));

		newChildDescriptors.add
			(createChildParameter
				(CwmInstancePackage.Literals.INSTANCE_CONTAINER__EXTENT,
				 RecordFactory.eINSTANCE.createRecordSet()));

		newChildDescriptors.add
			(createChildParameter
				(CwmInstancePackage.Literals.INSTANCE_CONTAINER__EXTENT,
				 MultidimensionalFactory.eINSTANCE.createMemberSet()));

		newChildDescriptors.add
			(createChildParameter
				(CwmInstancePackage.Literals.INSTANCE_CONTAINER__EXTENT,
				 CwmXmlFactory.eINSTANCE.createDocument()));

		newChildDescriptors.add
			(createChildParameter
				(CwmInstancePackage.Literals.INSTANCE_CONTAINER__INSTANCE,
				 CwmInstanceFactory.eINSTANCE.createDataValue()));

		newChildDescriptors.add
			(createChildParameter
				(CwmInstancePackage.Literals.INSTANCE_CONTAINER__INSTANCE,
				 CwmInstanceFactory.eINSTANCE.createObject()));

		newChildDescriptors.add
			(createChildParameter
				(CwmInstancePackage.Literals.INSTANCE_CONTAINER__INSTANCE,
				 RelationalFactory.eINSTANCE.createRow()));

		newChildDescriptors.add
			(createChildParameter
				(CwmInstancePackage.Literals.INSTANCE_CONTAINER__INSTANCE,
				 RelationalFactory.eINSTANCE.createColumnValue()));

		newChildDescriptors.add
			(createChildParameter
				(CwmInstancePackage.Literals.INSTANCE_CONTAINER__INSTANCE,
				 RecordFactory.eINSTANCE.createFieldValue()));

		newChildDescriptors.add
			(createChildParameter
				(CwmInstancePackage.Literals.INSTANCE_CONTAINER__INSTANCE,
				 RecordFactory.eINSTANCE.createRecord()));

		newChildDescriptors.add
			(createChildParameter
				(CwmInstancePackage.Literals.INSTANCE_CONTAINER__INSTANCE,
				 MultidimensionalFactory.eINSTANCE.createMember()));

		newChildDescriptors.add
			(createChildParameter
				(CwmInstancePackage.Literals.INSTANCE_CONTAINER__INSTANCE,
				 MultidimensionalFactory.eINSTANCE.createMemberValue()));

		newChildDescriptors.add
			(createChildParameter
				(CwmInstancePackage.Literals.INSTANCE_CONTAINER__INSTANCE,
				 CwmXmlFactory.eINSTANCE.createElement()));

		newChildDescriptors.add
			(createChildParameter
				(CwmInstancePackage.Literals.INSTANCE_CONTAINER__OBJECT,
				 CwmInstanceFactory.eINSTANCE.createObject()));

		newChildDescriptors.add
			(createChildParameter
				(CwmInstancePackage.Literals.INSTANCE_CONTAINER__OBJECT,
				 RelationalFactory.eINSTANCE.createRow()));

		newChildDescriptors.add
			(createChildParameter
				(CwmInstancePackage.Literals.INSTANCE_CONTAINER__OBJECT,
				 RecordFactory.eINSTANCE.createRecord()));

		newChildDescriptors.add
			(createChildParameter
				(CwmInstancePackage.Literals.INSTANCE_CONTAINER__OBJECT,
				 MultidimensionalFactory.eINSTANCE.createMember()));

		newChildDescriptors.add
			(createChildParameter
				(CwmInstancePackage.Literals.INSTANCE_CONTAINER__OBJECT,
				 CwmXmlFactory.eINSTANCE.createElement()));

		newChildDescriptors.add
			(createChildParameter
				(CwmInstancePackage.Literals.INSTANCE_CONTAINER__SLOT,
				 CwmInstanceFactory.eINSTANCE.createSlot()));

		newChildDescriptors.add
			(createChildParameter
				(CwmInstancePackage.Literals.INSTANCE_CONTAINER__SLOT,
				 CwmInstanceFactory.eINSTANCE.createDataSlot()));
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
			childFeature == CwmInstancePackage.Literals.INSTANCE_CONTAINER__DATA_SLOT ||
			childFeature == CwmInstancePackage.Literals.INSTANCE_CONTAINER__SLOT ||
			childFeature == CwmInstancePackage.Literals.INSTANCE_CONTAINER__DATA_VALUE ||
			childFeature == CwmInstancePackage.Literals.INSTANCE_CONTAINER__INSTANCE ||
			childFeature == CwmInstancePackage.Literals.INSTANCE_CONTAINER__OBJECT;

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

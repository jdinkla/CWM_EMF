/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Record.provider;


import CWM.Record.RecordFactory;
import CWM.Record.RecordPackage;
import CWM.Record.Record_container;

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
 * This is the item provider adapter for a {@link CWM.Record.Record_container} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Record_containerItemProvider
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
	public Record_containerItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(RecordPackage.Literals.RECORD_CONTAINER__FIELD);
			childrenFeatures.add(RecordPackage.Literals.RECORD_CONTAINER__RECORD_DEF);
			childrenFeatures.add(RecordPackage.Literals.RECORD_CONTAINER__FIXED_OFFSET_FIELD);
			childrenFeatures.add(RecordPackage.Literals.RECORD_CONTAINER__RECORD_FILE);
			childrenFeatures.add(RecordPackage.Literals.RECORD_CONTAINER__FIELD_VALUE);
			childrenFeatures.add(RecordPackage.Literals.RECORD_CONTAINER__RECORD);
			childrenFeatures.add(RecordPackage.Literals.RECORD_CONTAINER__RECORD_SET);
			childrenFeatures.add(RecordPackage.Literals.RECORD_CONTAINER__GROUP);
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
	 * This returns Record_container.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Record_container"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Record_container_type");
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

		switch (notification.getFeatureID(Record_container.class)) {
			case RecordPackage.RECORD_CONTAINER__FIELD:
			case RecordPackage.RECORD_CONTAINER__RECORD_DEF:
			case RecordPackage.RECORD_CONTAINER__FIXED_OFFSET_FIELD:
			case RecordPackage.RECORD_CONTAINER__RECORD_FILE:
			case RecordPackage.RECORD_CONTAINER__FIELD_VALUE:
			case RecordPackage.RECORD_CONTAINER__RECORD:
			case RecordPackage.RECORD_CONTAINER__RECORD_SET:
			case RecordPackage.RECORD_CONTAINER__GROUP:
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
				(RecordPackage.Literals.RECORD_CONTAINER__FIELD,
				 RecordFactory.eINSTANCE.createField()));

		newChildDescriptors.add
			(createChildParameter
				(RecordPackage.Literals.RECORD_CONTAINER__FIELD,
				 RecordFactory.eINSTANCE.createFixedOffsetField()));

		newChildDescriptors.add
			(createChildParameter
				(RecordPackage.Literals.RECORD_CONTAINER__RECORD_DEF,
				 RecordFactory.eINSTANCE.createRecordDef()));

		newChildDescriptors.add
			(createChildParameter
				(RecordPackage.Literals.RECORD_CONTAINER__FIXED_OFFSET_FIELD,
				 RecordFactory.eINSTANCE.createFixedOffsetField()));

		newChildDescriptors.add
			(createChildParameter
				(RecordPackage.Literals.RECORD_CONTAINER__RECORD_FILE,
				 RecordFactory.eINSTANCE.createRecordFile()));

		newChildDescriptors.add
			(createChildParameter
				(RecordPackage.Literals.RECORD_CONTAINER__FIELD_VALUE,
				 RecordFactory.eINSTANCE.createFieldValue()));

		newChildDescriptors.add
			(createChildParameter
				(RecordPackage.Literals.RECORD_CONTAINER__RECORD,
				 RecordFactory.eINSTANCE.createRecord()));

		newChildDescriptors.add
			(createChildParameter
				(RecordPackage.Literals.RECORD_CONTAINER__RECORD_SET,
				 RecordFactory.eINSTANCE.createRecordSet()));

		newChildDescriptors.add
			(createChildParameter
				(RecordPackage.Literals.RECORD_CONTAINER__GROUP,
				 RecordFactory.eINSTANCE.createGroup()));
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
			childFeature == RecordPackage.Literals.RECORD_CONTAINER__FIELD ||
			childFeature == RecordPackage.Literals.RECORD_CONTAINER__FIXED_OFFSET_FIELD;

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

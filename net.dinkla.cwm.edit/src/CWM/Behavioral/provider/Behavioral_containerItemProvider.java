/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Behavioral.provider;


import CWM.Behavioral.BehavioralFactory;
import CWM.Behavioral.BehavioralPackage;
import CWM.Behavioral.Behavioral_container;

import CWM.Relational.RelationalFactory;

import CWM.WarehouseProcess.Events.EventsFactory;

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
 * This is the item provider adapter for a {@link CWM.Behavioral.Behavioral_container} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Behavioral_containerItemProvider
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
	public Behavioral_containerItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(BehavioralPackage.Literals.BEHAVIORAL_CONTAINER__ARGUMENT);
			childrenFeatures.add(BehavioralPackage.Literals.BEHAVIORAL_CONTAINER__BEHAVIORAL_FEATURE);
			childrenFeatures.add(BehavioralPackage.Literals.BEHAVIORAL_CONTAINER__CALL_ACTION);
			childrenFeatures.add(BehavioralPackage.Literals.BEHAVIORAL_CONTAINER__EVENT);
			childrenFeatures.add(BehavioralPackage.Literals.BEHAVIORAL_CONTAINER__INTERFACE);
			childrenFeatures.add(BehavioralPackage.Literals.BEHAVIORAL_CONTAINER__METHOD);
			childrenFeatures.add(BehavioralPackage.Literals.BEHAVIORAL_CONTAINER__OPERATION);
			childrenFeatures.add(BehavioralPackage.Literals.BEHAVIORAL_CONTAINER__PARAMETER);
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
	 * This returns Behavioral_container.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Behavioral_container"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Behavioral_container_type");
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

		switch (notification.getFeatureID(Behavioral_container.class)) {
			case BehavioralPackage.BEHAVIORAL_CONTAINER__ARGUMENT:
			case BehavioralPackage.BEHAVIORAL_CONTAINER__BEHAVIORAL_FEATURE:
			case BehavioralPackage.BEHAVIORAL_CONTAINER__CALL_ACTION:
			case BehavioralPackage.BEHAVIORAL_CONTAINER__EVENT:
			case BehavioralPackage.BEHAVIORAL_CONTAINER__INTERFACE:
			case BehavioralPackage.BEHAVIORAL_CONTAINER__METHOD:
			case BehavioralPackage.BEHAVIORAL_CONTAINER__OPERATION:
			case BehavioralPackage.BEHAVIORAL_CONTAINER__PARAMETER:
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
				(BehavioralPackage.Literals.BEHAVIORAL_CONTAINER__ARGUMENT,
				 BehavioralFactory.eINSTANCE.createArgument()));

		newChildDescriptors.add
			(createChildParameter
				(BehavioralPackage.Literals.BEHAVIORAL_CONTAINER__BEHAVIORAL_FEATURE,
				 BehavioralFactory.eINSTANCE.createMethod()));

		newChildDescriptors.add
			(createChildParameter
				(BehavioralPackage.Literals.BEHAVIORAL_CONTAINER__BEHAVIORAL_FEATURE,
				 BehavioralFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(BehavioralPackage.Literals.BEHAVIORAL_CONTAINER__BEHAVIORAL_FEATURE,
				 RelationalFactory.eINSTANCE.createProcedure()));

		newChildDescriptors.add
			(createChildParameter
				(BehavioralPackage.Literals.BEHAVIORAL_CONTAINER__CALL_ACTION,
				 BehavioralFactory.eINSTANCE.createCallAction()));

		newChildDescriptors.add
			(createChildParameter
				(BehavioralPackage.Literals.BEHAVIORAL_CONTAINER__EVENT,
				 BehavioralFactory.eINSTANCE.createEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BehavioralPackage.Literals.BEHAVIORAL_CONTAINER__EVENT,
				 EventsFactory.eINSTANCE.createPointInTimeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BehavioralPackage.Literals.BEHAVIORAL_CONTAINER__EVENT,
				 EventsFactory.eINSTANCE.createCustomCalendarEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BehavioralPackage.Literals.BEHAVIORAL_CONTAINER__EVENT,
				 EventsFactory.eINSTANCE.createIntervalEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BehavioralPackage.Literals.BEHAVIORAL_CONTAINER__EVENT,
				 EventsFactory.eINSTANCE.createExternalEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BehavioralPackage.Literals.BEHAVIORAL_CONTAINER__EVENT,
				 EventsFactory.eINSTANCE.createInternalEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BehavioralPackage.Literals.BEHAVIORAL_CONTAINER__EVENT,
				 EventsFactory.eINSTANCE.createCascadeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BehavioralPackage.Literals.BEHAVIORAL_CONTAINER__EVENT,
				 EventsFactory.eINSTANCE.createRetryEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BehavioralPackage.Literals.BEHAVIORAL_CONTAINER__EVENT,
				 EventsFactory.eINSTANCE.createRecurringPointInTimeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BehavioralPackage.Literals.BEHAVIORAL_CONTAINER__INTERFACE,
				 BehavioralFactory.eINSTANCE.createInterface()));

		newChildDescriptors.add
			(createChildParameter
				(BehavioralPackage.Literals.BEHAVIORAL_CONTAINER__METHOD,
				 BehavioralFactory.eINSTANCE.createMethod()));

		newChildDescriptors.add
			(createChildParameter
				(BehavioralPackage.Literals.BEHAVIORAL_CONTAINER__METHOD,
				 RelationalFactory.eINSTANCE.createProcedure()));

		newChildDescriptors.add
			(createChildParameter
				(BehavioralPackage.Literals.BEHAVIORAL_CONTAINER__OPERATION,
				 BehavioralFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(BehavioralPackage.Literals.BEHAVIORAL_CONTAINER__PARAMETER,
				 BehavioralFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(BehavioralPackage.Literals.BEHAVIORAL_CONTAINER__PARAMETER,
				 RelationalFactory.eINSTANCE.createSQLParameter()));
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
			childFeature == BehavioralPackage.Literals.BEHAVIORAL_CONTAINER__BEHAVIORAL_FEATURE ||
			childFeature == BehavioralPackage.Literals.BEHAVIORAL_CONTAINER__METHOD ||
			childFeature == BehavioralPackage.Literals.BEHAVIORAL_CONTAINER__OPERATION;

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

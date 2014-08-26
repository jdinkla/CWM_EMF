/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.AssociationRules.provider;


import CWM.AssociationRules.AssociationRulesFactory;
import CWM.AssociationRules.AssociationRulesPackage;
import CWM.AssociationRules.AssociationRules_container;

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
 * This is the item provider adapter for a {@link CWM.AssociationRules.AssociationRules_container} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AssociationRules_containerItemProvider
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
	public AssociationRules_containerItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(AssociationRulesPackage.Literals.ASSOCIATION_RULES_CONTAINER__ASSOCIATION_RULES_FUNCTION_SETTINGS);
			childrenFeatures.add(AssociationRulesPackage.Literals.ASSOCIATION_RULES_CONTAINER__FREQUENT_ITEM_SET_FUNCTION_SETTINGS);
			childrenFeatures.add(AssociationRulesPackage.Literals.ASSOCIATION_RULES_CONTAINER__SEQUENCE_FUNCTION_SETTINGS);
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
	 * This returns AssociationRules_container.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AssociationRules_container"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_AssociationRules_container_type");
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

		switch (notification.getFeatureID(AssociationRules_container.class)) {
			case AssociationRulesPackage.ASSOCIATION_RULES_CONTAINER__ASSOCIATION_RULES_FUNCTION_SETTINGS:
			case AssociationRulesPackage.ASSOCIATION_RULES_CONTAINER__FREQUENT_ITEM_SET_FUNCTION_SETTINGS:
			case AssociationRulesPackage.ASSOCIATION_RULES_CONTAINER__SEQUENCE_FUNCTION_SETTINGS:
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
				(AssociationRulesPackage.Literals.ASSOCIATION_RULES_CONTAINER__ASSOCIATION_RULES_FUNCTION_SETTINGS,
				 AssociationRulesFactory.eINSTANCE.createAssociationRulesFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(AssociationRulesPackage.Literals.ASSOCIATION_RULES_CONTAINER__FREQUENT_ITEM_SET_FUNCTION_SETTINGS,
				 AssociationRulesFactory.eINSTANCE.createFrequentItemSetFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(AssociationRulesPackage.Literals.ASSOCIATION_RULES_CONTAINER__FREQUENT_ITEM_SET_FUNCTION_SETTINGS,
				 AssociationRulesFactory.eINSTANCE.createAssociationRulesFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(AssociationRulesPackage.Literals.ASSOCIATION_RULES_CONTAINER__FREQUENT_ITEM_SET_FUNCTION_SETTINGS,
				 AssociationRulesFactory.eINSTANCE.createSequenceFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(AssociationRulesPackage.Literals.ASSOCIATION_RULES_CONTAINER__SEQUENCE_FUNCTION_SETTINGS,
				 AssociationRulesFactory.eINSTANCE.createSequenceFunctionSettings()));
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
			childFeature == AssociationRulesPackage.Literals.ASSOCIATION_RULES_CONTAINER__ASSOCIATION_RULES_FUNCTION_SETTINGS ||
			childFeature == AssociationRulesPackage.Literals.ASSOCIATION_RULES_CONTAINER__FREQUENT_ITEM_SET_FUNCTION_SETTINGS ||
			childFeature == AssociationRulesPackage.Literals.ASSOCIATION_RULES_CONTAINER__SEQUENCE_FUNCTION_SETTINGS;

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

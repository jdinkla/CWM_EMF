/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningData.provider;


import CWM.Core.provider.ModelElementItemProvider;

import CWM.MiningCore.MiningData.MiningDataPackage;
import CWM.MiningCore.MiningData.NumericalAttributeProperties;

import CWM.provider.CwmEditPlugin;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link CWM.MiningCore.MiningData.NumericalAttributeProperties} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NumericalAttributePropertiesItemProvider
	extends ModelElementItemProvider
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
	public NumericalAttributePropertiesItemProvider(AdapterFactory adapterFactory) {
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

			addLowerBoundPropertyDescriptor(object);
			addUpperBoundPropertyDescriptor(object);
			addIsDiscretePropertyDescriptor(object);
			addIsCyclicPropertyDescriptor(object);
			addAnchorPropertyDescriptor(object);
			addCycleBeginPropertyDescriptor(object);
			addCycleEndPropertyDescriptor(object);
			addDiscreteStepSizePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Lower Bound feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLowerBoundPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NumericalAttributeProperties_lowerBound_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NumericalAttributeProperties_lowerBound_feature", "_UI_NumericalAttributeProperties_type"),
				 MiningDataPackage.Literals.NUMERICAL_ATTRIBUTE_PROPERTIES__LOWER_BOUND,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Upper Bound feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUpperBoundPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NumericalAttributeProperties_upperBound_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NumericalAttributeProperties_upperBound_feature", "_UI_NumericalAttributeProperties_type"),
				 MiningDataPackage.Literals.NUMERICAL_ATTRIBUTE_PROPERTIES__UPPER_BOUND,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Discrete feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsDiscretePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NumericalAttributeProperties_isDiscrete_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NumericalAttributeProperties_isDiscrete_feature", "_UI_NumericalAttributeProperties_type"),
				 MiningDataPackage.Literals.NUMERICAL_ATTRIBUTE_PROPERTIES__IS_DISCRETE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Cyclic feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsCyclicPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NumericalAttributeProperties_isCyclic_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NumericalAttributeProperties_isCyclic_feature", "_UI_NumericalAttributeProperties_type"),
				 MiningDataPackage.Literals.NUMERICAL_ATTRIBUTE_PROPERTIES__IS_CYCLIC,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Anchor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAnchorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NumericalAttributeProperties_anchor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NumericalAttributeProperties_anchor_feature", "_UI_NumericalAttributeProperties_type"),
				 MiningDataPackage.Literals.NUMERICAL_ATTRIBUTE_PROPERTIES__ANCHOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cycle Begin feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCycleBeginPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NumericalAttributeProperties_cycleBegin_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NumericalAttributeProperties_cycleBegin_feature", "_UI_NumericalAttributeProperties_type"),
				 MiningDataPackage.Literals.NUMERICAL_ATTRIBUTE_PROPERTIES__CYCLE_BEGIN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cycle End feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCycleEndPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NumericalAttributeProperties_cycleEnd_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NumericalAttributeProperties_cycleEnd_feature", "_UI_NumericalAttributeProperties_type"),
				 MiningDataPackage.Literals.NUMERICAL_ATTRIBUTE_PROPERTIES__CYCLE_END,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Discrete Step Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDiscreteStepSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NumericalAttributeProperties_discreteStepSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NumericalAttributeProperties_discreteStepSize_feature", "_UI_NumericalAttributeProperties_type"),
				 MiningDataPackage.Literals.NUMERICAL_ATTRIBUTE_PROPERTIES__DISCRETE_STEP_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns NumericalAttributeProperties.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/NumericalAttributeProperties"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((NumericalAttributeProperties)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_NumericalAttributeProperties_type") :
			getString("_UI_NumericalAttributeProperties_type") + " " + label;
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

		switch (notification.getFeatureID(NumericalAttributeProperties.class)) {
			case MiningDataPackage.NUMERICAL_ATTRIBUTE_PROPERTIES__LOWER_BOUND:
			case MiningDataPackage.NUMERICAL_ATTRIBUTE_PROPERTIES__UPPER_BOUND:
			case MiningDataPackage.NUMERICAL_ATTRIBUTE_PROPERTIES__IS_DISCRETE:
			case MiningDataPackage.NUMERICAL_ATTRIBUTE_PROPERTIES__IS_CYCLIC:
			case MiningDataPackage.NUMERICAL_ATTRIBUTE_PROPERTIES__ANCHOR:
			case MiningDataPackage.NUMERICAL_ATTRIBUTE_PROPERTIES__CYCLE_BEGIN:
			case MiningDataPackage.NUMERICAL_ATTRIBUTE_PROPERTIES__CYCLE_END:
			case MiningDataPackage.NUMERICAL_ATTRIBUTE_PROPERTIES__DISCRETE_STEP_SIZE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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

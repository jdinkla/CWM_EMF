/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Core.provider;


import CWM.Behavioral.BehavioralFactory;

import CWM.Classification.ClassificationFactory;

import CWM.Clustering.ClusteringFactory;

import CWM.Core.CoreFactory;
import CWM.Core.CorePackage;
import CWM.Core.Subsystem;

import CWM.CwmXml.CwmXmlFactory;

import CWM.DataTypes.DataTypesFactory;

import CWM.InformationVisualization.InformationVisualizationFactory;

import CWM.MiningCore.MiningData.MiningDataFactory;

import CWM.MiningCore.MiningModel.MiningModelFactory;

import CWM.MiningCore.MiningTask.MiningTaskFactory;

import CWM.Multidimensional.MultidimensionalFactory;

import CWM.Olap.OlapFactory;

import CWM.Record.RecordFactory;

import CWM.Relational.RelationalFactory;

import CWM.Relationships.RelationshipsFactory;

import CWM.provider.CwmEditPlugin;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

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
 * This is the item provider adapter for a {@link CWM.Core.Subsystem} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SubsystemItemProvider
	extends PackageItemProvider
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
	public SubsystemItemProvider(AdapterFactory adapterFactory) {
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

			addIsAbstractPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Is Abstract feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsAbstractPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Classifier_isAbstract_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Classifier_isAbstract_feature", "_UI_Classifier_type"),
				 CorePackage.Literals.CLASSIFIER__IS_ABSTRACT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
			childrenFeatures.add(CorePackage.Literals.CLASSIFIER__FEATURE);
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
	 * This returns Subsystem.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Subsystem"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Subsystem)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Subsystem_type") :
			getString("_UI_Subsystem_type") + " " + label;
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

		switch (notification.getFeatureID(Subsystem.class)) {
			case CorePackage.SUBSYSTEM__IS_ABSTRACT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CorePackage.SUBSYSTEM__FEATURE:
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
				(CorePackage.Literals.CLASSIFIER__FEATURE,
				 CoreFactory.eINSTANCE.createAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CLASSIFIER__FEATURE,
				 BehavioralFactory.eINSTANCE.createMethod()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CLASSIFIER__FEATURE,
				 BehavioralFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CLASSIFIER__FEATURE,
				 RelationshipsFactory.eINSTANCE.createAssociationEnd()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CLASSIFIER__FEATURE,
				 DataTypesFactory.eINSTANCE.createUnionMember()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CLASSIFIER__FEATURE,
				 RelationalFactory.eINSTANCE.createColumn()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CLASSIFIER__FEATURE,
				 RelationalFactory.eINSTANCE.createProcedure()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CLASSIFIER__FEATURE,
				 RecordFactory.eINSTANCE.createField()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CLASSIFIER__FEATURE,
				 RecordFactory.eINSTANCE.createFixedOffsetField()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CLASSIFIER__FEATURE,
				 MultidimensionalFactory.eINSTANCE.createDimensionedObject()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CLASSIFIER__FEATURE,
				 CwmXmlFactory.eINSTANCE.createAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CLASSIFIER__FEATURE,
				 CwmXmlFactory.eINSTANCE.createElementTypeReference()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CLASSIFIER__FEATURE,
				 CwmXmlFactory.eINSTANCE.createText()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CLASSIFIER__FEATURE,
				 OlapFactory.eINSTANCE.createMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CLASSIFIER__FEATURE,
				 MiningDataFactory.eINSTANCE.createAttributeUsage()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CLASSIFIER__FEATURE,
				 MiningDataFactory.eINSTANCE.createLogicalAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CLASSIFIER__FEATURE,
				 MiningModelFactory.eINSTANCE.createSignatureAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CLASSIFIER__FEATURE,
				 MiningTaskFactory.eINSTANCE.createApplyOutputItem()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CLASSIFIER__FEATURE,
				 MiningTaskFactory.eINSTANCE.createApplyProbabilityItem()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CLASSIFIER__FEATURE,
				 MiningTaskFactory.eINSTANCE.createApplyRuleIdItem()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CLASSIFIER__FEATURE,
				 MiningTaskFactory.eINSTANCE.createApplyScoreItem()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CLASSIFIER__FEATURE,
				 MiningTaskFactory.eINSTANCE.createApplySourceItem()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CLASSIFIER__FEATURE,
				 ClusteringFactory.eINSTANCE.createClusteringAttributeUsage()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CLASSIFIER__FEATURE,
				 ClassificationFactory.eINSTANCE.createApplyTargetValueItem()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CLASSIFIER__FEATURE,
				 ClassificationFactory.eINSTANCE.createClassificationAttributeUsage()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CLASSIFIER__FEATURE,
				 InformationVisualizationFactory.eINSTANCE.createRendering()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CLASSIFIER__FEATURE,
				 InformationVisualizationFactory.eINSTANCE.createXSLRendering()));
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
			childFeature == CorePackage.Literals.NAMESPACE__OWNED_ELEMENT ||
			childFeature == CorePackage.Literals.CLASSIFIER__FEATURE;

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

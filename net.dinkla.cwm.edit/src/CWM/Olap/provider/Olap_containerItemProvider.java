/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Olap.provider;


import CWM.Olap.OlapFactory;
import CWM.Olap.OlapPackage;
import CWM.Olap.Olap_container;

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
 * This is the item provider adapter for a {@link CWM.Olap.Olap_container} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Olap_containerItemProvider
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
	public Olap_containerItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(OlapPackage.Literals.OLAP_CONTAINER__CONTENT_MAP);
			childrenFeatures.add(OlapPackage.Literals.OLAP_CONTAINER__CUBE);
			childrenFeatures.add(OlapPackage.Literals.OLAP_CONTAINER__CUBE_DEPLOYMENT);
			childrenFeatures.add(OlapPackage.Literals.OLAP_CONTAINER__CUBE_DIMENSION_ASSOCIATION);
			childrenFeatures.add(OlapPackage.Literals.OLAP_CONTAINER__CUBE_REGION);
			childrenFeatures.add(OlapPackage.Literals.OLAP_CONTAINER__DEPLOYMENT_GROUP);
			childrenFeatures.add(OlapPackage.Literals.OLAP_CONTAINER__DIMENSION);
			childrenFeatures.add(OlapPackage.Literals.OLAP_CONTAINER__DIMENSION_DEPLOYMENT);
			childrenFeatures.add(OlapPackage.Literals.OLAP_CONTAINER__HIERARCHY);
			childrenFeatures.add(OlapPackage.Literals.OLAP_CONTAINER__HIERARCHY_LEVEL_ASSOCIATION);
			childrenFeatures.add(OlapPackage.Literals.OLAP_CONTAINER__LEVEL_BASED_HIERARCHY);
			childrenFeatures.add(OlapPackage.Literals.OLAP_CONTAINER__MEMBER_SELECTION_GROUP);
			childrenFeatures.add(OlapPackage.Literals.OLAP_CONTAINER__MEMBER_SELECTION);
			childrenFeatures.add(OlapPackage.Literals.OLAP_CONTAINER__SCHEMA);
			childrenFeatures.add(OlapPackage.Literals.OLAP_CONTAINER__VALUE_BASED_HIERARCHY);
			childrenFeatures.add(OlapPackage.Literals.OLAP_CONTAINER__LEVEL);
			childrenFeatures.add(OlapPackage.Literals.OLAP_CONTAINER__CODED_LEVEL);
			childrenFeatures.add(OlapPackage.Literals.OLAP_CONTAINER__MEASURE);
			childrenFeatures.add(OlapPackage.Literals.OLAP_CONTAINER__STRUCTURE_MAP);
			childrenFeatures.add(OlapPackage.Literals.OLAP_CONTAINER__HIERARCHY_MEMBER_SELECTION_GROUP);
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
	 * This returns Olap_container.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Olap_container"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Olap_container_type");
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

		switch (notification.getFeatureID(Olap_container.class)) {
			case OlapPackage.OLAP_CONTAINER__CONTENT_MAP:
			case OlapPackage.OLAP_CONTAINER__CUBE:
			case OlapPackage.OLAP_CONTAINER__CUBE_DEPLOYMENT:
			case OlapPackage.OLAP_CONTAINER__CUBE_DIMENSION_ASSOCIATION:
			case OlapPackage.OLAP_CONTAINER__CUBE_REGION:
			case OlapPackage.OLAP_CONTAINER__DEPLOYMENT_GROUP:
			case OlapPackage.OLAP_CONTAINER__DIMENSION:
			case OlapPackage.OLAP_CONTAINER__DIMENSION_DEPLOYMENT:
			case OlapPackage.OLAP_CONTAINER__HIERARCHY:
			case OlapPackage.OLAP_CONTAINER__HIERARCHY_LEVEL_ASSOCIATION:
			case OlapPackage.OLAP_CONTAINER__LEVEL_BASED_HIERARCHY:
			case OlapPackage.OLAP_CONTAINER__MEMBER_SELECTION_GROUP:
			case OlapPackage.OLAP_CONTAINER__MEMBER_SELECTION:
			case OlapPackage.OLAP_CONTAINER__SCHEMA:
			case OlapPackage.OLAP_CONTAINER__VALUE_BASED_HIERARCHY:
			case OlapPackage.OLAP_CONTAINER__LEVEL:
			case OlapPackage.OLAP_CONTAINER__CODED_LEVEL:
			case OlapPackage.OLAP_CONTAINER__MEASURE:
			case OlapPackage.OLAP_CONTAINER__STRUCTURE_MAP:
			case OlapPackage.OLAP_CONTAINER__HIERARCHY_MEMBER_SELECTION_GROUP:
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
				(OlapPackage.Literals.OLAP_CONTAINER__CONTENT_MAP,
				 OlapFactory.eINSTANCE.createContentMap()));

		newChildDescriptors.add
			(createChildParameter
				(OlapPackage.Literals.OLAP_CONTAINER__CUBE,
				 OlapFactory.eINSTANCE.createCube()));

		newChildDescriptors.add
			(createChildParameter
				(OlapPackage.Literals.OLAP_CONTAINER__CUBE_DEPLOYMENT,
				 OlapFactory.eINSTANCE.createCubeDeployment()));

		newChildDescriptors.add
			(createChildParameter
				(OlapPackage.Literals.OLAP_CONTAINER__CUBE_DIMENSION_ASSOCIATION,
				 OlapFactory.eINSTANCE.createCubeDimensionAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(OlapPackage.Literals.OLAP_CONTAINER__CUBE_REGION,
				 OlapFactory.eINSTANCE.createCubeRegion()));

		newChildDescriptors.add
			(createChildParameter
				(OlapPackage.Literals.OLAP_CONTAINER__DEPLOYMENT_GROUP,
				 OlapFactory.eINSTANCE.createDeploymentGroup()));

		newChildDescriptors.add
			(createChildParameter
				(OlapPackage.Literals.OLAP_CONTAINER__DIMENSION,
				 OlapFactory.eINSTANCE.createDimension()));

		newChildDescriptors.add
			(createChildParameter
				(OlapPackage.Literals.OLAP_CONTAINER__DIMENSION_DEPLOYMENT,
				 OlapFactory.eINSTANCE.createDimensionDeployment()));

		newChildDescriptors.add
			(createChildParameter
				(OlapPackage.Literals.OLAP_CONTAINER__HIERARCHY,
				 OlapFactory.eINSTANCE.createLevelBasedHierarchy()));

		newChildDescriptors.add
			(createChildParameter
				(OlapPackage.Literals.OLAP_CONTAINER__HIERARCHY,
				 OlapFactory.eINSTANCE.createValueBasedHierarchy()));

		newChildDescriptors.add
			(createChildParameter
				(OlapPackage.Literals.OLAP_CONTAINER__HIERARCHY_LEVEL_ASSOCIATION,
				 OlapFactory.eINSTANCE.createHierarchyLevelAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(OlapPackage.Literals.OLAP_CONTAINER__LEVEL_BASED_HIERARCHY,
				 OlapFactory.eINSTANCE.createLevelBasedHierarchy()));

		newChildDescriptors.add
			(createChildParameter
				(OlapPackage.Literals.OLAP_CONTAINER__MEMBER_SELECTION_GROUP,
				 OlapFactory.eINSTANCE.createMemberSelectionGroup()));

		newChildDescriptors.add
			(createChildParameter
				(OlapPackage.Literals.OLAP_CONTAINER__MEMBER_SELECTION_GROUP,
				 OlapFactory.eINSTANCE.createHierarchyMemberSelectionGroup()));

		newChildDescriptors.add
			(createChildParameter
				(OlapPackage.Literals.OLAP_CONTAINER__MEMBER_SELECTION,
				 OlapFactory.eINSTANCE.createMemberSelection()));

		newChildDescriptors.add
			(createChildParameter
				(OlapPackage.Literals.OLAP_CONTAINER__MEMBER_SELECTION,
				 OlapFactory.eINSTANCE.createLevel()));

		newChildDescriptors.add
			(createChildParameter
				(OlapPackage.Literals.OLAP_CONTAINER__MEMBER_SELECTION,
				 OlapFactory.eINSTANCE.createCodedLevel()));

		newChildDescriptors.add
			(createChildParameter
				(OlapPackage.Literals.OLAP_CONTAINER__SCHEMA,
				 OlapFactory.eINSTANCE.createSchema()));

		newChildDescriptors.add
			(createChildParameter
				(OlapPackage.Literals.OLAP_CONTAINER__VALUE_BASED_HIERARCHY,
				 OlapFactory.eINSTANCE.createValueBasedHierarchy()));

		newChildDescriptors.add
			(createChildParameter
				(OlapPackage.Literals.OLAP_CONTAINER__LEVEL,
				 OlapFactory.eINSTANCE.createLevel()));

		newChildDescriptors.add
			(createChildParameter
				(OlapPackage.Literals.OLAP_CONTAINER__LEVEL,
				 OlapFactory.eINSTANCE.createCodedLevel()));

		newChildDescriptors.add
			(createChildParameter
				(OlapPackage.Literals.OLAP_CONTAINER__CODED_LEVEL,
				 OlapFactory.eINSTANCE.createCodedLevel()));

		newChildDescriptors.add
			(createChildParameter
				(OlapPackage.Literals.OLAP_CONTAINER__MEASURE,
				 OlapFactory.eINSTANCE.createMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(OlapPackage.Literals.OLAP_CONTAINER__STRUCTURE_MAP,
				 OlapFactory.eINSTANCE.createStructureMap()));

		newChildDescriptors.add
			(createChildParameter
				(OlapPackage.Literals.OLAP_CONTAINER__HIERARCHY_MEMBER_SELECTION_GROUP,
				 OlapFactory.eINSTANCE.createHierarchyMemberSelectionGroup()));
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
			childFeature == OlapPackage.Literals.OLAP_CONTAINER__HIERARCHY ||
			childFeature == OlapPackage.Literals.OLAP_CONTAINER__LEVEL_BASED_HIERARCHY ||
			childFeature == OlapPackage.Literals.OLAP_CONTAINER__VALUE_BASED_HIERARCHY ||
			childFeature == OlapPackage.Literals.OLAP_CONTAINER__MEMBER_SELECTION_GROUP ||
			childFeature == OlapPackage.Literals.OLAP_CONTAINER__HIERARCHY_MEMBER_SELECTION_GROUP ||
			childFeature == OlapPackage.Literals.OLAP_CONTAINER__MEMBER_SELECTION ||
			childFeature == OlapPackage.Literals.OLAP_CONTAINER__LEVEL ||
			childFeature == OlapPackage.Literals.OLAP_CONTAINER__CODED_LEVEL;

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

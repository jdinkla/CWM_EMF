/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.CwmXml.provider;


import CWM.CwmXml.CwmXmlFactory;
import CWM.CwmXml.CwmXmlPackage;
import CWM.CwmXml.XML_container;

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
 * This is the item provider adapter for a {@link CWM.CwmXml.XML_container} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class XML_containerItemProvider
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
	public XML_containerItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(CwmXmlPackage.Literals.XML_CONTAINER__SCHEMA);
			childrenFeatures.add(CwmXmlPackage.Literals.XML_CONTAINER__ELEMENT_TYPE);
			childrenFeatures.add(CwmXmlPackage.Literals.XML_CONTAINER__ATTRIBUTE);
			childrenFeatures.add(CwmXmlPackage.Literals.XML_CONTAINER__CONTENT);
			childrenFeatures.add(CwmXmlPackage.Literals.XML_CONTAINER__ELEMENT_CONTENT);
			childrenFeatures.add(CwmXmlPackage.Literals.XML_CONTAINER__MIXED_CONTENT);
			childrenFeatures.add(CwmXmlPackage.Literals.XML_CONTAINER__ELEMENT_TYPE_REFERENCE);
			childrenFeatures.add(CwmXmlPackage.Literals.XML_CONTAINER__TEXT);
			childrenFeatures.add(CwmXmlPackage.Literals.XML_CONTAINER__ELEMENT);
			childrenFeatures.add(CwmXmlPackage.Literals.XML_CONTAINER__DOCUMENT);
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
	 * This returns XML_container.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/XML_container"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_XML_container_type");
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

		switch (notification.getFeatureID(XML_container.class)) {
			case CwmXmlPackage.XML_CONTAINER__SCHEMA:
			case CwmXmlPackage.XML_CONTAINER__ELEMENT_TYPE:
			case CwmXmlPackage.XML_CONTAINER__ATTRIBUTE:
			case CwmXmlPackage.XML_CONTAINER__CONTENT:
			case CwmXmlPackage.XML_CONTAINER__ELEMENT_CONTENT:
			case CwmXmlPackage.XML_CONTAINER__MIXED_CONTENT:
			case CwmXmlPackage.XML_CONTAINER__ELEMENT_TYPE_REFERENCE:
			case CwmXmlPackage.XML_CONTAINER__TEXT:
			case CwmXmlPackage.XML_CONTAINER__ELEMENT:
			case CwmXmlPackage.XML_CONTAINER__DOCUMENT:
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
				(CwmXmlPackage.Literals.XML_CONTAINER__SCHEMA,
				 CwmXmlFactory.eINSTANCE.createSchema()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.XML_CONTAINER__ELEMENT_TYPE,
				 CwmXmlFactory.eINSTANCE.createElementType()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.XML_CONTAINER__ATTRIBUTE,
				 CwmXmlFactory.eINSTANCE.createAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.XML_CONTAINER__CONTENT,
				 CwmXmlFactory.eINSTANCE.createContent()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.XML_CONTAINER__CONTENT,
				 CwmXmlFactory.eINSTANCE.createElementContent()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.XML_CONTAINER__CONTENT,
				 CwmXmlFactory.eINSTANCE.createMixedContent()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.XML_CONTAINER__ELEMENT_CONTENT,
				 CwmXmlFactory.eINSTANCE.createElementContent()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.XML_CONTAINER__MIXED_CONTENT,
				 CwmXmlFactory.eINSTANCE.createMixedContent()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.XML_CONTAINER__ELEMENT_TYPE_REFERENCE,
				 CwmXmlFactory.eINSTANCE.createElementTypeReference()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.XML_CONTAINER__TEXT,
				 CwmXmlFactory.eINSTANCE.createText()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.XML_CONTAINER__ELEMENT,
				 CwmXmlFactory.eINSTANCE.createElement()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.XML_CONTAINER__DOCUMENT,
				 CwmXmlFactory.eINSTANCE.createDocument()));
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
			childFeature == CwmXmlPackage.Literals.XML_CONTAINER__CONTENT ||
			childFeature == CwmXmlPackage.Literals.XML_CONTAINER__ELEMENT_CONTENT ||
			childFeature == CwmXmlPackage.Literals.XML_CONTAINER__MIXED_CONTENT;

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

/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.BusinessNomenclature.provider;


import CWM.BusinessNomenclature.BusinessNomenclatureFactory;
import CWM.BusinessNomenclature.BusinessNomenclaturePackage;
import CWM.BusinessNomenclature.BusinessNomenclature_container;

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
 * This is the item provider adapter for a {@link CWM.BusinessNomenclature.BusinessNomenclature_container} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BusinessNomenclature_containerItemProvider
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
	public BusinessNomenclature_containerItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(BusinessNomenclaturePackage.Literals.BUSINESS_NOMENCLATURE_CONTAINER__VOCABULARY_ELEMENT);
			childrenFeatures.add(BusinessNomenclaturePackage.Literals.BUSINESS_NOMENCLATURE_CONTAINER__NOMENCLATURE);
			childrenFeatures.add(BusinessNomenclaturePackage.Literals.BUSINESS_NOMENCLATURE_CONTAINER__TAXONOMY);
			childrenFeatures.add(BusinessNomenclaturePackage.Literals.BUSINESS_NOMENCLATURE_CONTAINER__GLOSSARY);
			childrenFeatures.add(BusinessNomenclaturePackage.Literals.BUSINESS_NOMENCLATURE_CONTAINER__BUSINESS_DOMAIN);
			childrenFeatures.add(BusinessNomenclaturePackage.Literals.BUSINESS_NOMENCLATURE_CONTAINER__CONCEPT);
			childrenFeatures.add(BusinessNomenclaturePackage.Literals.BUSINESS_NOMENCLATURE_CONTAINER__TERM);
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
	 * This returns BusinessNomenclature_container.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BusinessNomenclature_container"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_BusinessNomenclature_container_type");
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

		switch (notification.getFeatureID(BusinessNomenclature_container.class)) {
			case BusinessNomenclaturePackage.BUSINESS_NOMENCLATURE_CONTAINER__VOCABULARY_ELEMENT:
			case BusinessNomenclaturePackage.BUSINESS_NOMENCLATURE_CONTAINER__NOMENCLATURE:
			case BusinessNomenclaturePackage.BUSINESS_NOMENCLATURE_CONTAINER__TAXONOMY:
			case BusinessNomenclaturePackage.BUSINESS_NOMENCLATURE_CONTAINER__GLOSSARY:
			case BusinessNomenclaturePackage.BUSINESS_NOMENCLATURE_CONTAINER__BUSINESS_DOMAIN:
			case BusinessNomenclaturePackage.BUSINESS_NOMENCLATURE_CONTAINER__CONCEPT:
			case BusinessNomenclaturePackage.BUSINESS_NOMENCLATURE_CONTAINER__TERM:
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
				(BusinessNomenclaturePackage.Literals.BUSINESS_NOMENCLATURE_CONTAINER__VOCABULARY_ELEMENT,
				 BusinessNomenclatureFactory.eINSTANCE.createVocabularyElement()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_NOMENCLATURE_CONTAINER__VOCABULARY_ELEMENT,
				 BusinessNomenclatureFactory.eINSTANCE.createConcept()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_NOMENCLATURE_CONTAINER__VOCABULARY_ELEMENT,
				 BusinessNomenclatureFactory.eINSTANCE.createTerm()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_NOMENCLATURE_CONTAINER__NOMENCLATURE,
				 BusinessNomenclatureFactory.eINSTANCE.createNomenclature()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_NOMENCLATURE_CONTAINER__NOMENCLATURE,
				 BusinessNomenclatureFactory.eINSTANCE.createTaxonomy()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_NOMENCLATURE_CONTAINER__NOMENCLATURE,
				 BusinessNomenclatureFactory.eINSTANCE.createGlossary()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_NOMENCLATURE_CONTAINER__TAXONOMY,
				 BusinessNomenclatureFactory.eINSTANCE.createTaxonomy()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_NOMENCLATURE_CONTAINER__GLOSSARY,
				 BusinessNomenclatureFactory.eINSTANCE.createGlossary()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_NOMENCLATURE_CONTAINER__BUSINESS_DOMAIN,
				 BusinessNomenclatureFactory.eINSTANCE.createBusinessDomain()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_NOMENCLATURE_CONTAINER__CONCEPT,
				 BusinessNomenclatureFactory.eINSTANCE.createConcept()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_NOMENCLATURE_CONTAINER__TERM,
				 BusinessNomenclatureFactory.eINSTANCE.createTerm()));
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
			childFeature == BusinessNomenclaturePackage.Literals.BUSINESS_NOMENCLATURE_CONTAINER__VOCABULARY_ELEMENT ||
			childFeature == BusinessNomenclaturePackage.Literals.BUSINESS_NOMENCLATURE_CONTAINER__CONCEPT ||
			childFeature == BusinessNomenclaturePackage.Literals.BUSINESS_NOMENCLATURE_CONTAINER__TERM ||
			childFeature == BusinessNomenclaturePackage.Literals.BUSINESS_NOMENCLATURE_CONTAINER__NOMENCLATURE ||
			childFeature == BusinessNomenclaturePackage.Literals.BUSINESS_NOMENCLATURE_CONTAINER__TAXONOMY ||
			childFeature == BusinessNomenclaturePackage.Literals.BUSINESS_NOMENCLATURE_CONTAINER__GLOSSARY;

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

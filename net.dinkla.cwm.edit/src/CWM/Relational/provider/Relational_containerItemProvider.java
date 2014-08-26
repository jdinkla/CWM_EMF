/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Relational.provider;


import CWM.Relational.RelationalFactory;
import CWM.Relational.RelationalPackage;
import CWM.Relational.Relational_container;

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
 * This is the item provider adapter for a {@link CWM.Relational.Relational_container} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Relational_containerItemProvider
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
	public Relational_containerItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(RelationalPackage.Literals.RELATIONAL_CONTAINER__CATALOG);
			childrenFeatures.add(RelationalPackage.Literals.RELATIONAL_CONTAINER__SCHEMA);
			childrenFeatures.add(RelationalPackage.Literals.RELATIONAL_CONTAINER__COLUMN_SET);
			childrenFeatures.add(RelationalPackage.Literals.RELATIONAL_CONTAINER__NAMED_COLUMN_SET);
			childrenFeatures.add(RelationalPackage.Literals.RELATIONAL_CONTAINER__TABLE);
			childrenFeatures.add(RelationalPackage.Literals.RELATIONAL_CONTAINER__VIEW);
			childrenFeatures.add(RelationalPackage.Literals.RELATIONAL_CONTAINER__QUERY_COLUMN_SET);
			childrenFeatures.add(RelationalPackage.Literals.RELATIONAL_CONTAINER__SQL_DATA_TYPE);
			childrenFeatures.add(RelationalPackage.Literals.RELATIONAL_CONTAINER__SQL_DISTINCT_TYPE);
			childrenFeatures.add(RelationalPackage.Literals.RELATIONAL_CONTAINER__SQL_SIMPLE_TYPE);
			childrenFeatures.add(RelationalPackage.Literals.RELATIONAL_CONTAINER__SQL_STRUCTURED_TYPE);
			childrenFeatures.add(RelationalPackage.Literals.RELATIONAL_CONTAINER__COLUMN);
			childrenFeatures.add(RelationalPackage.Literals.RELATIONAL_CONTAINER__PROCEDURE);
			childrenFeatures.add(RelationalPackage.Literals.RELATIONAL_CONTAINER__TRIGGER);
			childrenFeatures.add(RelationalPackage.Literals.RELATIONAL_CONTAINER__SQL_INDEX);
			childrenFeatures.add(RelationalPackage.Literals.RELATIONAL_CONTAINER__UNIQUE_CONSTRAINT);
			childrenFeatures.add(RelationalPackage.Literals.RELATIONAL_CONTAINER__FOREIGN_KEY);
			childrenFeatures.add(RelationalPackage.Literals.RELATIONAL_CONTAINER__SQL_INDEX_COLUMN);
			childrenFeatures.add(RelationalPackage.Literals.RELATIONAL_CONTAINER__PRIMARY_KEY);
			childrenFeatures.add(RelationalPackage.Literals.RELATIONAL_CONTAINER__ROW);
			childrenFeatures.add(RelationalPackage.Literals.RELATIONAL_CONTAINER__COLUMN_VALUE);
			childrenFeatures.add(RelationalPackage.Literals.RELATIONAL_CONTAINER__CHECK_CONSTRAINT);
			childrenFeatures.add(RelationalPackage.Literals.RELATIONAL_CONTAINER__ROW_SET);
			childrenFeatures.add(RelationalPackage.Literals.RELATIONAL_CONTAINER__SQL_PARAMETER);
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
	 * This returns Relational_container.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Relational_container"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Relational_container_type");
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

		switch (notification.getFeatureID(Relational_container.class)) {
			case RelationalPackage.RELATIONAL_CONTAINER__CATALOG:
			case RelationalPackage.RELATIONAL_CONTAINER__SCHEMA:
			case RelationalPackage.RELATIONAL_CONTAINER__COLUMN_SET:
			case RelationalPackage.RELATIONAL_CONTAINER__NAMED_COLUMN_SET:
			case RelationalPackage.RELATIONAL_CONTAINER__TABLE:
			case RelationalPackage.RELATIONAL_CONTAINER__VIEW:
			case RelationalPackage.RELATIONAL_CONTAINER__QUERY_COLUMN_SET:
			case RelationalPackage.RELATIONAL_CONTAINER__SQL_DATA_TYPE:
			case RelationalPackage.RELATIONAL_CONTAINER__SQL_DISTINCT_TYPE:
			case RelationalPackage.RELATIONAL_CONTAINER__SQL_SIMPLE_TYPE:
			case RelationalPackage.RELATIONAL_CONTAINER__SQL_STRUCTURED_TYPE:
			case RelationalPackage.RELATIONAL_CONTAINER__COLUMN:
			case RelationalPackage.RELATIONAL_CONTAINER__PROCEDURE:
			case RelationalPackage.RELATIONAL_CONTAINER__TRIGGER:
			case RelationalPackage.RELATIONAL_CONTAINER__SQL_INDEX:
			case RelationalPackage.RELATIONAL_CONTAINER__UNIQUE_CONSTRAINT:
			case RelationalPackage.RELATIONAL_CONTAINER__FOREIGN_KEY:
			case RelationalPackage.RELATIONAL_CONTAINER__SQL_INDEX_COLUMN:
			case RelationalPackage.RELATIONAL_CONTAINER__PRIMARY_KEY:
			case RelationalPackage.RELATIONAL_CONTAINER__ROW:
			case RelationalPackage.RELATIONAL_CONTAINER__COLUMN_VALUE:
			case RelationalPackage.RELATIONAL_CONTAINER__CHECK_CONSTRAINT:
			case RelationalPackage.RELATIONAL_CONTAINER__ROW_SET:
			case RelationalPackage.RELATIONAL_CONTAINER__SQL_PARAMETER:
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
				(RelationalPackage.Literals.RELATIONAL_CONTAINER__CATALOG,
				 RelationalFactory.eINSTANCE.createCatalog()));

		newChildDescriptors.add
			(createChildParameter
				(RelationalPackage.Literals.RELATIONAL_CONTAINER__SCHEMA,
				 RelationalFactory.eINSTANCE.createSchema()));

		newChildDescriptors.add
			(createChildParameter
				(RelationalPackage.Literals.RELATIONAL_CONTAINER__COLUMN_SET,
				 RelationalFactory.eINSTANCE.createColumnSet()));

		newChildDescriptors.add
			(createChildParameter
				(RelationalPackage.Literals.RELATIONAL_CONTAINER__COLUMN_SET,
				 RelationalFactory.eINSTANCE.createNamedColumnSet()));

		newChildDescriptors.add
			(createChildParameter
				(RelationalPackage.Literals.RELATIONAL_CONTAINER__COLUMN_SET,
				 RelationalFactory.eINSTANCE.createTable()));

		newChildDescriptors.add
			(createChildParameter
				(RelationalPackage.Literals.RELATIONAL_CONTAINER__COLUMN_SET,
				 RelationalFactory.eINSTANCE.createView()));

		newChildDescriptors.add
			(createChildParameter
				(RelationalPackage.Literals.RELATIONAL_CONTAINER__COLUMN_SET,
				 RelationalFactory.eINSTANCE.createQueryColumnSet()));

		newChildDescriptors.add
			(createChildParameter
				(RelationalPackage.Literals.RELATIONAL_CONTAINER__NAMED_COLUMN_SET,
				 RelationalFactory.eINSTANCE.createNamedColumnSet()));

		newChildDescriptors.add
			(createChildParameter
				(RelationalPackage.Literals.RELATIONAL_CONTAINER__NAMED_COLUMN_SET,
				 RelationalFactory.eINSTANCE.createTable()));

		newChildDescriptors.add
			(createChildParameter
				(RelationalPackage.Literals.RELATIONAL_CONTAINER__NAMED_COLUMN_SET,
				 RelationalFactory.eINSTANCE.createView()));

		newChildDescriptors.add
			(createChildParameter
				(RelationalPackage.Literals.RELATIONAL_CONTAINER__TABLE,
				 RelationalFactory.eINSTANCE.createTable()));

		newChildDescriptors.add
			(createChildParameter
				(RelationalPackage.Literals.RELATIONAL_CONTAINER__VIEW,
				 RelationalFactory.eINSTANCE.createView()));

		newChildDescriptors.add
			(createChildParameter
				(RelationalPackage.Literals.RELATIONAL_CONTAINER__QUERY_COLUMN_SET,
				 RelationalFactory.eINSTANCE.createQueryColumnSet()));

		newChildDescriptors.add
			(createChildParameter
				(RelationalPackage.Literals.RELATIONAL_CONTAINER__SQL_DATA_TYPE,
				 RelationalFactory.eINSTANCE.createSQLDistinctType()));

		newChildDescriptors.add
			(createChildParameter
				(RelationalPackage.Literals.RELATIONAL_CONTAINER__SQL_DATA_TYPE,
				 RelationalFactory.eINSTANCE.createSQLSimpleType()));

		newChildDescriptors.add
			(createChildParameter
				(RelationalPackage.Literals.RELATIONAL_CONTAINER__SQL_DATA_TYPE,
				 RelationalFactory.eINSTANCE.createSQLStructuredType()));

		newChildDescriptors.add
			(createChildParameter
				(RelationalPackage.Literals.RELATIONAL_CONTAINER__SQL_DISTINCT_TYPE,
				 RelationalFactory.eINSTANCE.createSQLDistinctType()));

		newChildDescriptors.add
			(createChildParameter
				(RelationalPackage.Literals.RELATIONAL_CONTAINER__SQL_SIMPLE_TYPE,
				 RelationalFactory.eINSTANCE.createSQLSimpleType()));

		newChildDescriptors.add
			(createChildParameter
				(RelationalPackage.Literals.RELATIONAL_CONTAINER__SQL_STRUCTURED_TYPE,
				 RelationalFactory.eINSTANCE.createSQLStructuredType()));

		newChildDescriptors.add
			(createChildParameter
				(RelationalPackage.Literals.RELATIONAL_CONTAINER__COLUMN,
				 RelationalFactory.eINSTANCE.createColumn()));

		newChildDescriptors.add
			(createChildParameter
				(RelationalPackage.Literals.RELATIONAL_CONTAINER__PROCEDURE,
				 RelationalFactory.eINSTANCE.createProcedure()));

		newChildDescriptors.add
			(createChildParameter
				(RelationalPackage.Literals.RELATIONAL_CONTAINER__TRIGGER,
				 RelationalFactory.eINSTANCE.createTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(RelationalPackage.Literals.RELATIONAL_CONTAINER__SQL_INDEX,
				 RelationalFactory.eINSTANCE.createSQLIndex()));

		newChildDescriptors.add
			(createChildParameter
				(RelationalPackage.Literals.RELATIONAL_CONTAINER__UNIQUE_CONSTRAINT,
				 RelationalFactory.eINSTANCE.createUniqueConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(RelationalPackage.Literals.RELATIONAL_CONTAINER__UNIQUE_CONSTRAINT,
				 RelationalFactory.eINSTANCE.createPrimaryKey()));

		newChildDescriptors.add
			(createChildParameter
				(RelationalPackage.Literals.RELATIONAL_CONTAINER__FOREIGN_KEY,
				 RelationalFactory.eINSTANCE.createForeignKey()));

		newChildDescriptors.add
			(createChildParameter
				(RelationalPackage.Literals.RELATIONAL_CONTAINER__SQL_INDEX_COLUMN,
				 RelationalFactory.eINSTANCE.createSQLIndexColumn()));

		newChildDescriptors.add
			(createChildParameter
				(RelationalPackage.Literals.RELATIONAL_CONTAINER__PRIMARY_KEY,
				 RelationalFactory.eINSTANCE.createPrimaryKey()));

		newChildDescriptors.add
			(createChildParameter
				(RelationalPackage.Literals.RELATIONAL_CONTAINER__ROW,
				 RelationalFactory.eINSTANCE.createRow()));

		newChildDescriptors.add
			(createChildParameter
				(RelationalPackage.Literals.RELATIONAL_CONTAINER__COLUMN_VALUE,
				 RelationalFactory.eINSTANCE.createColumnValue()));

		newChildDescriptors.add
			(createChildParameter
				(RelationalPackage.Literals.RELATIONAL_CONTAINER__CHECK_CONSTRAINT,
				 RelationalFactory.eINSTANCE.createCheckConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(RelationalPackage.Literals.RELATIONAL_CONTAINER__ROW_SET,
				 RelationalFactory.eINSTANCE.createRowSet()));

		newChildDescriptors.add
			(createChildParameter
				(RelationalPackage.Literals.RELATIONAL_CONTAINER__SQL_PARAMETER,
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
			childFeature == RelationalPackage.Literals.RELATIONAL_CONTAINER__COLUMN_SET ||
			childFeature == RelationalPackage.Literals.RELATIONAL_CONTAINER__NAMED_COLUMN_SET ||
			childFeature == RelationalPackage.Literals.RELATIONAL_CONTAINER__TABLE ||
			childFeature == RelationalPackage.Literals.RELATIONAL_CONTAINER__VIEW ||
			childFeature == RelationalPackage.Literals.RELATIONAL_CONTAINER__QUERY_COLUMN_SET ||
			childFeature == RelationalPackage.Literals.RELATIONAL_CONTAINER__SQL_DATA_TYPE ||
			childFeature == RelationalPackage.Literals.RELATIONAL_CONTAINER__SQL_DISTINCT_TYPE ||
			childFeature == RelationalPackage.Literals.RELATIONAL_CONTAINER__SQL_SIMPLE_TYPE ||
			childFeature == RelationalPackage.Literals.RELATIONAL_CONTAINER__SQL_STRUCTURED_TYPE ||
			childFeature == RelationalPackage.Literals.RELATIONAL_CONTAINER__UNIQUE_CONSTRAINT ||
			childFeature == RelationalPackage.Literals.RELATIONAL_CONTAINER__PRIMARY_KEY;

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

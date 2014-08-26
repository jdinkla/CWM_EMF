/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.CwmXml.provider;


import CWM.Approximation.ApproximationFactory;

import CWM.AssociationRules.AssociationRulesFactory;

import CWM.AttributeImportance.AttributeImportanceFactory;

import CWM.Behavioral.BehavioralFactory;

import CWM.BusinessInformation.BusinessInformationFactory;

import CWM.BusinessNomenclature.BusinessNomenclatureFactory;

import CWM.Classification.ClassificationFactory;

import CWM.Clustering.ClusteringFactory;

import CWM.Core.CoreFactory;
import CWM.Core.CorePackage;

import CWM.Core.provider.PackageItemProvider;

import CWM.CwmInstance.CwmInstanceFactory;

import CWM.CwmTransformation.CwmTransformationFactory;

import CWM.CwmXml.CwmXmlFactory;
import CWM.CwmXml.CwmXmlPackage;
import CWM.CwmXml.Schema;

import CWM.DataTypes.DataTypesFactory;

import CWM.InformationVisualization.InformationVisualizationFactory;

import CWM.KeysIndexes.KeysIndexesFactory;

import CWM.MiningCore.EntryPoint.EntryPointFactory;

import CWM.MiningCore.MiningData.MiningDataFactory;

import CWM.MiningCore.MiningModel.MiningModelFactory;

import CWM.MiningCore.MiningTask.MiningTaskFactory;

import CWM.Multidimensional.MultidimensionalFactory;

import CWM.Olap.OlapFactory;

import CWM.Record.RecordFactory;

import CWM.Relational.RelationalFactory;

import CWM.Relationships.RelationshipsFactory;

import CWM.SoftwareDeployment.SoftwareDeploymentFactory;

import CWM.Supervised.SupervisedFactory;

import CWM.TypeMapping.TypeMappingFactory;

import CWM.WarehouseOperation.WarehouseOperationFactory;

import CWM.WarehouseProcess.Events.EventsFactory;

import CWM.WarehouseProcess.WarehouseProcessFactory;

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
 * This is the item provider adapter for a {@link CWM.CwmXml.Schema} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SchemaItemProvider
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
	public SchemaItemProvider(AdapterFactory adapterFactory) {
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

			addVersionPropertyDescriptor(object);
			addXmlNamespacePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Schema_version_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Schema_version_feature", "_UI_Schema_type"),
				 CwmXmlPackage.Literals.SCHEMA__VERSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Xml Namespace feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addXmlNamespacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Schema_xmlNamespace_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Schema_xmlNamespace_feature", "_UI_Schema_type"),
				 CwmXmlPackage.Literals.SCHEMA__XML_NAMESPACE,
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
			childrenFeatures.add(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE);
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
	 * This returns Schema.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Schema"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Schema)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Schema_type") :
			getString("_UI_Schema_type") + " " + label;
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

		switch (notification.getFeatureID(Schema.class)) {
			case CwmXmlPackage.SCHEMA__VERSION:
			case CwmXmlPackage.SCHEMA__XML_NAMESPACE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CwmXmlPackage.SCHEMA__ELEMENT_TYPE:
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
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 CwmXmlFactory.eINSTANCE.createSchema()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 CwmXmlFactory.eINSTANCE.createElementType()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 CwmXmlFactory.eINSTANCE.createAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 CwmXmlFactory.eINSTANCE.createContent()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 CwmXmlFactory.eINSTANCE.createElementContent()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 CwmXmlFactory.eINSTANCE.createMixedContent()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 CwmXmlFactory.eINSTANCE.createElementTypeReference()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 CwmXmlFactory.eINSTANCE.createText()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 CwmXmlFactory.eINSTANCE.createElement()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 CwmXmlFactory.eINSTANCE.createDocument()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 CoreFactory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 CoreFactory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 CoreFactory.eINSTANCE.createPackage()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 CoreFactory.eINSTANCE.createSubsystem()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 CoreFactory.eINSTANCE.createModel()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 CoreFactory.eINSTANCE.createAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 CoreFactory.eINSTANCE.createConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 CoreFactory.eINSTANCE.createDependency()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 CoreFactory.eINSTANCE.createStereotype()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 BehavioralFactory.eINSTANCE.createArgument()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 BehavioralFactory.eINSTANCE.createCallAction()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 BehavioralFactory.eINSTANCE.createEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 BehavioralFactory.eINSTANCE.createInterface()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 BehavioralFactory.eINSTANCE.createMethod()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 BehavioralFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 BehavioralFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 RelationshipsFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 RelationshipsFactory.eINSTANCE.createAssociationEnd()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 RelationshipsFactory.eINSTANCE.createGeneralization()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 CwmInstanceFactory.eINSTANCE.createSlot()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 CwmInstanceFactory.eINSTANCE.createDataSlot()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 CwmInstanceFactory.eINSTANCE.createDataValue()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 CwmInstanceFactory.eINSTANCE.createExtent()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 CwmInstanceFactory.eINSTANCE.createObject()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 BusinessInformationFactory.eINSTANCE.createResponsibleParty()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 BusinessInformationFactory.eINSTANCE.createTelephone()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 BusinessInformationFactory.eINSTANCE.createEmail()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 BusinessInformationFactory.eINSTANCE.createLocation()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 BusinessInformationFactory.eINSTANCE.createContact()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 BusinessInformationFactory.eINSTANCE.createDescription()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 BusinessInformationFactory.eINSTANCE.createDocument()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 BusinessInformationFactory.eINSTANCE.createResourceLocator()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 DataTypesFactory.eINSTANCE.createEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 DataTypesFactory.eINSTANCE.createEnumerationLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 DataTypesFactory.eINSTANCE.createTypeAlias()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 DataTypesFactory.eINSTANCE.createUnion()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 DataTypesFactory.eINSTANCE.createUnionMember()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 KeysIndexesFactory.eINSTANCE.createUniqueKey()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 KeysIndexesFactory.eINSTANCE.createIndex()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 KeysIndexesFactory.eINSTANCE.createKeyRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 KeysIndexesFactory.eINSTANCE.createIndexedFeature()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 SoftwareDeploymentFactory.eINSTANCE.createSite()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 SoftwareDeploymentFactory.eINSTANCE.createMachine()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 SoftwareDeploymentFactory.eINSTANCE.createSoftwareSystem()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 SoftwareDeploymentFactory.eINSTANCE.createDeployedComponent()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 SoftwareDeploymentFactory.eINSTANCE.createDeployedSoftwareSystem()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 SoftwareDeploymentFactory.eINSTANCE.createDataManager()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 SoftwareDeploymentFactory.eINSTANCE.createDataProvider()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 SoftwareDeploymentFactory.eINSTANCE.createProviderConnection()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 SoftwareDeploymentFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 SoftwareDeploymentFactory.eINSTANCE.createPackageUsage()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 TypeMappingFactory.eINSTANCE.createTypeMapping()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 TypeMappingFactory.eINSTANCE.createTypeSystem()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 RelationalFactory.eINSTANCE.createCatalog()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 RelationalFactory.eINSTANCE.createSchema()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 RelationalFactory.eINSTANCE.createColumnSet()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 RelationalFactory.eINSTANCE.createNamedColumnSet()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 RelationalFactory.eINSTANCE.createTable()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 RelationalFactory.eINSTANCE.createView()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 RelationalFactory.eINSTANCE.createQueryColumnSet()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 RelationalFactory.eINSTANCE.createSQLDistinctType()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 RelationalFactory.eINSTANCE.createSQLSimpleType()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 RelationalFactory.eINSTANCE.createSQLStructuredType()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 RelationalFactory.eINSTANCE.createColumn()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 RelationalFactory.eINSTANCE.createProcedure()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 RelationalFactory.eINSTANCE.createTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 RelationalFactory.eINSTANCE.createSQLIndex()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 RelationalFactory.eINSTANCE.createUniqueConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 RelationalFactory.eINSTANCE.createForeignKey()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 RelationalFactory.eINSTANCE.createSQLIndexColumn()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 RelationalFactory.eINSTANCE.createPrimaryKey()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 RelationalFactory.eINSTANCE.createRow()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 RelationalFactory.eINSTANCE.createColumnValue()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 RelationalFactory.eINSTANCE.createCheckConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 RelationalFactory.eINSTANCE.createRowSet()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 RelationalFactory.eINSTANCE.createSQLParameter()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 RecordFactory.eINSTANCE.createField()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 RecordFactory.eINSTANCE.createRecordDef()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 RecordFactory.eINSTANCE.createFixedOffsetField()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 RecordFactory.eINSTANCE.createRecordFile()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 RecordFactory.eINSTANCE.createFieldValue()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 RecordFactory.eINSTANCE.createRecord()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 RecordFactory.eINSTANCE.createRecordSet()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 RecordFactory.eINSTANCE.createGroup()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 MultidimensionalFactory.eINSTANCE.createDimension()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 MultidimensionalFactory.eINSTANCE.createDimensionedObject()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 MultidimensionalFactory.eINSTANCE.createMember()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 MultidimensionalFactory.eINSTANCE.createMemberSet()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 MultidimensionalFactory.eINSTANCE.createMemberValue()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 MultidimensionalFactory.eINSTANCE.createSchema()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 CwmTransformationFactory.eINSTANCE.createTransformation()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 CwmTransformationFactory.eINSTANCE.createDataObjectSet()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 CwmTransformationFactory.eINSTANCE.createTransformationTask()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 CwmTransformationFactory.eINSTANCE.createTransformationStep()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 CwmTransformationFactory.eINSTANCE.createTransformationActivity()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 CwmTransformationFactory.eINSTANCE.createPrecedenceConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 CwmTransformationFactory.eINSTANCE.createTransformationUse()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 CwmTransformationFactory.eINSTANCE.createTransformationMap()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 CwmTransformationFactory.eINSTANCE.createTransformationTree()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 CwmTransformationFactory.eINSTANCE.createClassifierMap()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 CwmTransformationFactory.eINSTANCE.createFeatureMap()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 CwmTransformationFactory.eINSTANCE.createStepPrecedence()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 CwmTransformationFactory.eINSTANCE.createClassifierFeatureMap()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 OlapFactory.eINSTANCE.createContentMap()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 OlapFactory.eINSTANCE.createCube()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 OlapFactory.eINSTANCE.createCubeDeployment()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 OlapFactory.eINSTANCE.createCubeDimensionAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 OlapFactory.eINSTANCE.createCubeRegion()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 OlapFactory.eINSTANCE.createDeploymentGroup()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 OlapFactory.eINSTANCE.createDimension()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 OlapFactory.eINSTANCE.createDimensionDeployment()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 OlapFactory.eINSTANCE.createHierarchyLevelAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 OlapFactory.eINSTANCE.createLevelBasedHierarchy()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 OlapFactory.eINSTANCE.createMemberSelectionGroup()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 OlapFactory.eINSTANCE.createMemberSelection()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 OlapFactory.eINSTANCE.createSchema()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 OlapFactory.eINSTANCE.createValueBasedHierarchy()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 OlapFactory.eINSTANCE.createLevel()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 OlapFactory.eINSTANCE.createCodedLevel()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 OlapFactory.eINSTANCE.createMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 OlapFactory.eINSTANCE.createStructureMap()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 OlapFactory.eINSTANCE.createHierarchyMemberSelectionGroup()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 MiningDataFactory.eINSTANCE.createAttributeAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 MiningDataFactory.eINSTANCE.createAttributeAssignmentSet()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 MiningDataFactory.eINSTANCE.createAttributeUsage()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 MiningDataFactory.eINSTANCE.createAttributeUsageSet()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 MiningDataFactory.eINSTANCE.createCategoricalAttributeProperties()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 MiningDataFactory.eINSTANCE.createDirectAttributeAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 MiningDataFactory.eINSTANCE.createLogicalAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 MiningDataFactory.eINSTANCE.createLogicalData()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 MiningDataFactory.eINSTANCE.createNumericalAttributeProperties()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 MiningDataFactory.eINSTANCE.createOrdinalAttributeProperties()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 MiningDataFactory.eINSTANCE.createPhysicalData()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 MiningDataFactory.eINSTANCE.createPivotAttributeAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 MiningDataFactory.eINSTANCE.createReversePivotAttributeAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 MiningDataFactory.eINSTANCE.createSetAttributeAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 MiningDataFactory.eINSTANCE.createCategory()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 MiningDataFactory.eINSTANCE.createCategoryMap()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 MiningDataFactory.eINSTANCE.createCategoryMapObject()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 MiningDataFactory.eINSTANCE.createCategoryMapObjectEntry()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 MiningDataFactory.eINSTANCE.createCategoryMapTable()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 MiningDataFactory.eINSTANCE.createCategoryMatrix()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 MiningDataFactory.eINSTANCE.createCategoryMatrixEntry()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 MiningDataFactory.eINSTANCE.createCategoryMatrixObject()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 MiningDataFactory.eINSTANCE.createCategoryMatrixTable()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 MiningDataFactory.eINSTANCE.createCategoryTaxonomy()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 MiningModelFactory.eINSTANCE.createMiningModel()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 MiningModelFactory.eINSTANCE.createModelSignature()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 MiningModelFactory.eINSTANCE.createSignatureAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 MiningTaskFactory.eINSTANCE.createApplyOutputItem()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 MiningTaskFactory.eINSTANCE.createApplyProbabilityItem()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 MiningTaskFactory.eINSTANCE.createApplyRuleIdItem()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 MiningTaskFactory.eINSTANCE.createApplyScoreItem()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 MiningTaskFactory.eINSTANCE.createApplySourceItem()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 MiningTaskFactory.eINSTANCE.createMiningApplyOutput()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 MiningTaskFactory.eINSTANCE.createMiningApplyTask()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 MiningTaskFactory.eINSTANCE.createMiningBuildTask()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 MiningTaskFactory.eINSTANCE.createMiningTransformation()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 EntryPointFactory.eINSTANCE.createAuxiliaryObject()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 EntryPointFactory.eINSTANCE.createCatalog()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 EntryPointFactory.eINSTANCE.createSchema()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 ClusteringFactory.eINSTANCE.createClusteringAttributeUsage()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 ClusteringFactory.eINSTANCE.createClusteringFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 AssociationRulesFactory.eINSTANCE.createFrequentItemSetFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 AssociationRulesFactory.eINSTANCE.createAssociationRulesFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 AssociationRulesFactory.eINSTANCE.createSequenceFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 SupervisedFactory.eINSTANCE.createLiftAnalysisPoint()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 SupervisedFactory.eINSTANCE.createLiftAnalysis()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 SupervisedFactory.eINSTANCE.createMiningTestTask()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 SupervisedFactory.eINSTANCE.createSupervisedFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 SupervisedFactory.eINSTANCE.createMiningTestResult()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 ClassificationFactory.eINSTANCE.createApplyTargetValueItem()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 ClassificationFactory.eINSTANCE.createClassificationAttributeUsage()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 ClassificationFactory.eINSTANCE.createClassificationFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 ClassificationFactory.eINSTANCE.createClassificationTestResult()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 ClassificationFactory.eINSTANCE.createClassificationTestTask()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 ClassificationFactory.eINSTANCE.createPriorProbabilities()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 ClassificationFactory.eINSTANCE.createPriorProbabilitiesEntry()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 ApproximationFactory.eINSTANCE.createApproximationFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 ApproximationFactory.eINSTANCE.createApproximationTestResult()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 ApproximationFactory.eINSTANCE.createApproximationTestTask()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 AttributeImportanceFactory.eINSTANCE.createAttributeImportanceSettings()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 InformationVisualizationFactory.eINSTANCE.createRenderedObject()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 InformationVisualizationFactory.eINSTANCE.createRenderedObjectSet()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 InformationVisualizationFactory.eINSTANCE.createRendering()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 InformationVisualizationFactory.eINSTANCE.createXSLRendering()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 BusinessNomenclatureFactory.eINSTANCE.createVocabularyElement()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 BusinessNomenclatureFactory.eINSTANCE.createNomenclature()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 BusinessNomenclatureFactory.eINSTANCE.createTaxonomy()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 BusinessNomenclatureFactory.eINSTANCE.createGlossary()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 BusinessNomenclatureFactory.eINSTANCE.createBusinessDomain()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 BusinessNomenclatureFactory.eINSTANCE.createConcept()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 BusinessNomenclatureFactory.eINSTANCE.createTerm()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 WarehouseProcessFactory.eINSTANCE.createWarehouseStep()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 WarehouseProcessFactory.eINSTANCE.createProcessPackage()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 WarehouseProcessFactory.eINSTANCE.createWarehouseActivity()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 EventsFactory.eINSTANCE.createPointInTimeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 EventsFactory.eINSTANCE.createCustomCalendarEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 EventsFactory.eINSTANCE.createCustomCalendar()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 EventsFactory.eINSTANCE.createCalendarDate()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 EventsFactory.eINSTANCE.createIntervalEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 EventsFactory.eINSTANCE.createExternalEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 EventsFactory.eINSTANCE.createInternalEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 EventsFactory.eINSTANCE.createCascadeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 EventsFactory.eINSTANCE.createRetryEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 EventsFactory.eINSTANCE.createRecurringPointInTimeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 WarehouseOperationFactory.eINSTANCE.createMeasurement()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 WarehouseOperationFactory.eINSTANCE.createChangeRequest()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 WarehouseOperationFactory.eINSTANCE.createTransformationExecution()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 WarehouseOperationFactory.eINSTANCE.createActivityExecution()));

		newChildDescriptors.add
			(createChildParameter
				(CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE,
				 WarehouseOperationFactory.eINSTANCE.createStepExecution()));
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
			childFeature == CwmXmlPackage.Literals.SCHEMA__ELEMENT_TYPE;

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

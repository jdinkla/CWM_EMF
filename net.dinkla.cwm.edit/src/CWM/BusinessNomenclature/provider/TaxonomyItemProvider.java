/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.BusinessNomenclature.provider;


import CWM.Approximation.ApproximationFactory;

import CWM.AssociationRules.AssociationRulesFactory;

import CWM.AttributeImportance.AttributeImportanceFactory;

import CWM.Behavioral.BehavioralFactory;

import CWM.BusinessInformation.BusinessInformationFactory;

import CWM.BusinessNomenclature.BusinessNomenclatureFactory;
import CWM.BusinessNomenclature.BusinessNomenclaturePackage;
import CWM.BusinessNomenclature.Taxonomy;

import CWM.Classification.ClassificationFactory;

import CWM.Clustering.ClusteringFactory;

import CWM.Core.CoreFactory;
import CWM.Core.CorePackage;

import CWM.CwmInstance.CwmInstanceFactory;

import CWM.CwmTransformation.CwmTransformationFactory;

import CWM.CwmXml.CwmXmlFactory;

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
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link CWM.BusinessNomenclature.Taxonomy} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TaxonomyItemProvider
	extends NomenclatureItemProvider
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
	public TaxonomyItemProvider(AdapterFactory adapterFactory) {
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

			addDomainPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Domain feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Taxonomy_domain_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Taxonomy_domain_feature", "_UI_Taxonomy_type"),
				 BusinessNomenclaturePackage.Literals.TAXONOMY__DOMAIN,
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT);
			childrenFeatures.add(BusinessNomenclaturePackage.Literals.TAXONOMY__SUBTAXONOMY);
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
	 * This returns Taxonomy.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Taxonomy"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Taxonomy)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Taxonomy_type") :
			getString("_UI_Taxonomy_type") + " " + label;
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

		switch (notification.getFeatureID(Taxonomy.class)) {
			case BusinessNomenclaturePackage.TAXONOMY__CONCEPT:
			case BusinessNomenclaturePackage.TAXONOMY__SUBTAXONOMY:
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
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 BusinessNomenclatureFactory.eINSTANCE.createVocabularyElement()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 BusinessNomenclatureFactory.eINSTANCE.createNomenclature()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 BusinessNomenclatureFactory.eINSTANCE.createTaxonomy()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 BusinessNomenclatureFactory.eINSTANCE.createGlossary()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 BusinessNomenclatureFactory.eINSTANCE.createBusinessDomain()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 BusinessNomenclatureFactory.eINSTANCE.createConcept()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 BusinessNomenclatureFactory.eINSTANCE.createTerm()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 CoreFactory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 CoreFactory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 CoreFactory.eINSTANCE.createPackage()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 CoreFactory.eINSTANCE.createSubsystem()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 CoreFactory.eINSTANCE.createModel()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 CoreFactory.eINSTANCE.createAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 CoreFactory.eINSTANCE.createConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 CoreFactory.eINSTANCE.createDependency()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 CoreFactory.eINSTANCE.createStereotype()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 BehavioralFactory.eINSTANCE.createArgument()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 BehavioralFactory.eINSTANCE.createCallAction()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 BehavioralFactory.eINSTANCE.createEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 BehavioralFactory.eINSTANCE.createInterface()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 BehavioralFactory.eINSTANCE.createMethod()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 BehavioralFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 BehavioralFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 RelationshipsFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 RelationshipsFactory.eINSTANCE.createAssociationEnd()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 RelationshipsFactory.eINSTANCE.createGeneralization()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 CwmInstanceFactory.eINSTANCE.createSlot()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 CwmInstanceFactory.eINSTANCE.createDataSlot()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 CwmInstanceFactory.eINSTANCE.createDataValue()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 CwmInstanceFactory.eINSTANCE.createExtent()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 CwmInstanceFactory.eINSTANCE.createObject()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 BusinessInformationFactory.eINSTANCE.createResponsibleParty()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 BusinessInformationFactory.eINSTANCE.createTelephone()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 BusinessInformationFactory.eINSTANCE.createEmail()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 BusinessInformationFactory.eINSTANCE.createLocation()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 BusinessInformationFactory.eINSTANCE.createContact()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 BusinessInformationFactory.eINSTANCE.createDescription()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 BusinessInformationFactory.eINSTANCE.createDocument()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 BusinessInformationFactory.eINSTANCE.createResourceLocator()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 DataTypesFactory.eINSTANCE.createEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 DataTypesFactory.eINSTANCE.createEnumerationLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 DataTypesFactory.eINSTANCE.createTypeAlias()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 DataTypesFactory.eINSTANCE.createUnion()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 DataTypesFactory.eINSTANCE.createUnionMember()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 KeysIndexesFactory.eINSTANCE.createUniqueKey()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 KeysIndexesFactory.eINSTANCE.createIndex()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 KeysIndexesFactory.eINSTANCE.createKeyRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 KeysIndexesFactory.eINSTANCE.createIndexedFeature()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 SoftwareDeploymentFactory.eINSTANCE.createSite()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 SoftwareDeploymentFactory.eINSTANCE.createMachine()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 SoftwareDeploymentFactory.eINSTANCE.createSoftwareSystem()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 SoftwareDeploymentFactory.eINSTANCE.createDeployedComponent()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 SoftwareDeploymentFactory.eINSTANCE.createDeployedSoftwareSystem()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 SoftwareDeploymentFactory.eINSTANCE.createDataManager()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 SoftwareDeploymentFactory.eINSTANCE.createDataProvider()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 SoftwareDeploymentFactory.eINSTANCE.createProviderConnection()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 SoftwareDeploymentFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 SoftwareDeploymentFactory.eINSTANCE.createPackageUsage()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 TypeMappingFactory.eINSTANCE.createTypeMapping()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 TypeMappingFactory.eINSTANCE.createTypeSystem()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 RelationalFactory.eINSTANCE.createCatalog()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 RelationalFactory.eINSTANCE.createSchema()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 RelationalFactory.eINSTANCE.createColumnSet()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 RelationalFactory.eINSTANCE.createNamedColumnSet()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 RelationalFactory.eINSTANCE.createTable()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 RelationalFactory.eINSTANCE.createView()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 RelationalFactory.eINSTANCE.createQueryColumnSet()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 RelationalFactory.eINSTANCE.createSQLDistinctType()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 RelationalFactory.eINSTANCE.createSQLSimpleType()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 RelationalFactory.eINSTANCE.createSQLStructuredType()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 RelationalFactory.eINSTANCE.createColumn()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 RelationalFactory.eINSTANCE.createProcedure()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 RelationalFactory.eINSTANCE.createTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 RelationalFactory.eINSTANCE.createSQLIndex()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 RelationalFactory.eINSTANCE.createUniqueConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 RelationalFactory.eINSTANCE.createForeignKey()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 RelationalFactory.eINSTANCE.createSQLIndexColumn()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 RelationalFactory.eINSTANCE.createPrimaryKey()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 RelationalFactory.eINSTANCE.createRow()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 RelationalFactory.eINSTANCE.createColumnValue()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 RelationalFactory.eINSTANCE.createCheckConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 RelationalFactory.eINSTANCE.createRowSet()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 RelationalFactory.eINSTANCE.createSQLParameter()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 RecordFactory.eINSTANCE.createField()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 RecordFactory.eINSTANCE.createRecordDef()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 RecordFactory.eINSTANCE.createFixedOffsetField()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 RecordFactory.eINSTANCE.createRecordFile()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 RecordFactory.eINSTANCE.createFieldValue()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 RecordFactory.eINSTANCE.createRecord()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 RecordFactory.eINSTANCE.createRecordSet()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 RecordFactory.eINSTANCE.createGroup()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 MultidimensionalFactory.eINSTANCE.createDimension()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 MultidimensionalFactory.eINSTANCE.createDimensionedObject()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 MultidimensionalFactory.eINSTANCE.createMember()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 MultidimensionalFactory.eINSTANCE.createMemberSet()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 MultidimensionalFactory.eINSTANCE.createMemberValue()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 MultidimensionalFactory.eINSTANCE.createSchema()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 CwmXmlFactory.eINSTANCE.createSchema()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 CwmXmlFactory.eINSTANCE.createElementType()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 CwmXmlFactory.eINSTANCE.createAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 CwmXmlFactory.eINSTANCE.createContent()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 CwmXmlFactory.eINSTANCE.createElementContent()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 CwmXmlFactory.eINSTANCE.createMixedContent()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 CwmXmlFactory.eINSTANCE.createElementTypeReference()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 CwmXmlFactory.eINSTANCE.createText()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 CwmXmlFactory.eINSTANCE.createElement()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 CwmXmlFactory.eINSTANCE.createDocument()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 CwmTransformationFactory.eINSTANCE.createTransformation()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 CwmTransformationFactory.eINSTANCE.createDataObjectSet()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 CwmTransformationFactory.eINSTANCE.createTransformationTask()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 CwmTransformationFactory.eINSTANCE.createTransformationStep()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 CwmTransformationFactory.eINSTANCE.createTransformationActivity()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 CwmTransformationFactory.eINSTANCE.createPrecedenceConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 CwmTransformationFactory.eINSTANCE.createTransformationUse()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 CwmTransformationFactory.eINSTANCE.createTransformationMap()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 CwmTransformationFactory.eINSTANCE.createTransformationTree()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 CwmTransformationFactory.eINSTANCE.createClassifierMap()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 CwmTransformationFactory.eINSTANCE.createFeatureMap()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 CwmTransformationFactory.eINSTANCE.createStepPrecedence()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 CwmTransformationFactory.eINSTANCE.createClassifierFeatureMap()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 OlapFactory.eINSTANCE.createContentMap()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 OlapFactory.eINSTANCE.createCube()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 OlapFactory.eINSTANCE.createCubeDeployment()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 OlapFactory.eINSTANCE.createCubeDimensionAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 OlapFactory.eINSTANCE.createCubeRegion()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 OlapFactory.eINSTANCE.createDeploymentGroup()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 OlapFactory.eINSTANCE.createDimension()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 OlapFactory.eINSTANCE.createDimensionDeployment()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 OlapFactory.eINSTANCE.createHierarchyLevelAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 OlapFactory.eINSTANCE.createLevelBasedHierarchy()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 OlapFactory.eINSTANCE.createMemberSelectionGroup()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 OlapFactory.eINSTANCE.createMemberSelection()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 OlapFactory.eINSTANCE.createSchema()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 OlapFactory.eINSTANCE.createValueBasedHierarchy()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 OlapFactory.eINSTANCE.createLevel()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 OlapFactory.eINSTANCE.createCodedLevel()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 OlapFactory.eINSTANCE.createMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 OlapFactory.eINSTANCE.createStructureMap()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 OlapFactory.eINSTANCE.createHierarchyMemberSelectionGroup()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 MiningDataFactory.eINSTANCE.createAttributeAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 MiningDataFactory.eINSTANCE.createAttributeAssignmentSet()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 MiningDataFactory.eINSTANCE.createAttributeUsage()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 MiningDataFactory.eINSTANCE.createAttributeUsageSet()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 MiningDataFactory.eINSTANCE.createCategoricalAttributeProperties()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 MiningDataFactory.eINSTANCE.createDirectAttributeAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 MiningDataFactory.eINSTANCE.createLogicalAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 MiningDataFactory.eINSTANCE.createLogicalData()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 MiningDataFactory.eINSTANCE.createNumericalAttributeProperties()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 MiningDataFactory.eINSTANCE.createOrdinalAttributeProperties()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 MiningDataFactory.eINSTANCE.createPhysicalData()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 MiningDataFactory.eINSTANCE.createPivotAttributeAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 MiningDataFactory.eINSTANCE.createReversePivotAttributeAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 MiningDataFactory.eINSTANCE.createSetAttributeAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 MiningDataFactory.eINSTANCE.createCategory()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 MiningDataFactory.eINSTANCE.createCategoryMap()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 MiningDataFactory.eINSTANCE.createCategoryMapObject()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 MiningDataFactory.eINSTANCE.createCategoryMapObjectEntry()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 MiningDataFactory.eINSTANCE.createCategoryMapTable()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 MiningDataFactory.eINSTANCE.createCategoryMatrix()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 MiningDataFactory.eINSTANCE.createCategoryMatrixEntry()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 MiningDataFactory.eINSTANCE.createCategoryMatrixObject()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 MiningDataFactory.eINSTANCE.createCategoryMatrixTable()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 MiningDataFactory.eINSTANCE.createCategoryTaxonomy()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 MiningModelFactory.eINSTANCE.createMiningModel()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 MiningModelFactory.eINSTANCE.createModelSignature()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 MiningModelFactory.eINSTANCE.createSignatureAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 MiningTaskFactory.eINSTANCE.createApplyOutputItem()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 MiningTaskFactory.eINSTANCE.createApplyProbabilityItem()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 MiningTaskFactory.eINSTANCE.createApplyRuleIdItem()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 MiningTaskFactory.eINSTANCE.createApplyScoreItem()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 MiningTaskFactory.eINSTANCE.createApplySourceItem()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 MiningTaskFactory.eINSTANCE.createMiningApplyOutput()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 MiningTaskFactory.eINSTANCE.createMiningApplyTask()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 MiningTaskFactory.eINSTANCE.createMiningBuildTask()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 MiningTaskFactory.eINSTANCE.createMiningTransformation()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 EntryPointFactory.eINSTANCE.createAuxiliaryObject()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 EntryPointFactory.eINSTANCE.createCatalog()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 EntryPointFactory.eINSTANCE.createSchema()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 ClusteringFactory.eINSTANCE.createClusteringAttributeUsage()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 ClusteringFactory.eINSTANCE.createClusteringFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 AssociationRulesFactory.eINSTANCE.createFrequentItemSetFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 AssociationRulesFactory.eINSTANCE.createAssociationRulesFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 AssociationRulesFactory.eINSTANCE.createSequenceFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 SupervisedFactory.eINSTANCE.createLiftAnalysisPoint()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 SupervisedFactory.eINSTANCE.createLiftAnalysis()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 SupervisedFactory.eINSTANCE.createMiningTestTask()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 SupervisedFactory.eINSTANCE.createSupervisedFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 SupervisedFactory.eINSTANCE.createMiningTestResult()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 ClassificationFactory.eINSTANCE.createApplyTargetValueItem()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 ClassificationFactory.eINSTANCE.createClassificationAttributeUsage()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 ClassificationFactory.eINSTANCE.createClassificationFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 ClassificationFactory.eINSTANCE.createClassificationTestResult()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 ClassificationFactory.eINSTANCE.createClassificationTestTask()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 ClassificationFactory.eINSTANCE.createPriorProbabilities()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 ClassificationFactory.eINSTANCE.createPriorProbabilitiesEntry()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 ApproximationFactory.eINSTANCE.createApproximationFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 ApproximationFactory.eINSTANCE.createApproximationTestResult()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 ApproximationFactory.eINSTANCE.createApproximationTestTask()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 AttributeImportanceFactory.eINSTANCE.createAttributeImportanceSettings()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 InformationVisualizationFactory.eINSTANCE.createRenderedObject()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 InformationVisualizationFactory.eINSTANCE.createRenderedObjectSet()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 InformationVisualizationFactory.eINSTANCE.createRendering()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 InformationVisualizationFactory.eINSTANCE.createXSLRendering()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 WarehouseProcessFactory.eINSTANCE.createWarehouseStep()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 WarehouseProcessFactory.eINSTANCE.createProcessPackage()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 WarehouseProcessFactory.eINSTANCE.createWarehouseActivity()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 EventsFactory.eINSTANCE.createPointInTimeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 EventsFactory.eINSTANCE.createCustomCalendarEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 EventsFactory.eINSTANCE.createCustomCalendar()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 EventsFactory.eINSTANCE.createCalendarDate()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 EventsFactory.eINSTANCE.createIntervalEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 EventsFactory.eINSTANCE.createExternalEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 EventsFactory.eINSTANCE.createInternalEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 EventsFactory.eINSTANCE.createCascadeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 EventsFactory.eINSTANCE.createRetryEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 EventsFactory.eINSTANCE.createRecurringPointInTimeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 WarehouseOperationFactory.eINSTANCE.createMeasurement()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 WarehouseOperationFactory.eINSTANCE.createChangeRequest()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 WarehouseOperationFactory.eINSTANCE.createTransformationExecution()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 WarehouseOperationFactory.eINSTANCE.createActivityExecution()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT,
				 WarehouseOperationFactory.eINSTANCE.createStepExecution()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__SUBTAXONOMY,
				 BusinessNomenclatureFactory.eINSTANCE.createNomenclature()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__SUBTAXONOMY,
				 BusinessNomenclatureFactory.eINSTANCE.createTaxonomy()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.TAXONOMY__SUBTAXONOMY,
				 BusinessNomenclatureFactory.eINSTANCE.createGlossary()));
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
			childFeature == BusinessNomenclaturePackage.Literals.TAXONOMY__CONCEPT ||
			childFeature == BusinessNomenclaturePackage.Literals.TAXONOMY__SUBTAXONOMY;

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

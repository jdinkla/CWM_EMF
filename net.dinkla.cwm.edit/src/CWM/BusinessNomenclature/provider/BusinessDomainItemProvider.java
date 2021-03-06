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

import CWM.BusinessNomenclature.BusinessDomain;
import CWM.BusinessNomenclature.BusinessNomenclatureFactory;
import CWM.BusinessNomenclature.BusinessNomenclaturePackage;

import CWM.Classification.ClassificationFactory;

import CWM.Clustering.ClusteringFactory;

import CWM.Core.CoreFactory;
import CWM.Core.CorePackage;

import CWM.Core.provider.PackageItemProvider;

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

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link CWM.BusinessNomenclature.BusinessDomain} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BusinessDomainItemProvider
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
	public BusinessDomainItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY);
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
	 * This returns BusinessDomain.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BusinessDomain"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((BusinessDomain)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_BusinessDomain_type") :
			getString("_UI_BusinessDomain_type") + " " + label;
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

		switch (notification.getFeatureID(BusinessDomain.class)) {
			case BusinessNomenclaturePackage.BUSINESS_DOMAIN__TAXONOMY:
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
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 BusinessNomenclatureFactory.eINSTANCE.createVocabularyElement()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 BusinessNomenclatureFactory.eINSTANCE.createNomenclature()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 BusinessNomenclatureFactory.eINSTANCE.createTaxonomy()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 BusinessNomenclatureFactory.eINSTANCE.createGlossary()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 BusinessNomenclatureFactory.eINSTANCE.createBusinessDomain()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 BusinessNomenclatureFactory.eINSTANCE.createConcept()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 BusinessNomenclatureFactory.eINSTANCE.createTerm()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 CoreFactory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 CoreFactory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 CoreFactory.eINSTANCE.createPackage()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 CoreFactory.eINSTANCE.createSubsystem()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 CoreFactory.eINSTANCE.createModel()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 CoreFactory.eINSTANCE.createAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 CoreFactory.eINSTANCE.createConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 CoreFactory.eINSTANCE.createDependency()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 CoreFactory.eINSTANCE.createStereotype()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 BehavioralFactory.eINSTANCE.createArgument()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 BehavioralFactory.eINSTANCE.createCallAction()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 BehavioralFactory.eINSTANCE.createEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 BehavioralFactory.eINSTANCE.createInterface()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 BehavioralFactory.eINSTANCE.createMethod()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 BehavioralFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 BehavioralFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 RelationshipsFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 RelationshipsFactory.eINSTANCE.createAssociationEnd()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 RelationshipsFactory.eINSTANCE.createGeneralization()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 CwmInstanceFactory.eINSTANCE.createSlot()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 CwmInstanceFactory.eINSTANCE.createDataSlot()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 CwmInstanceFactory.eINSTANCE.createDataValue()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 CwmInstanceFactory.eINSTANCE.createExtent()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 CwmInstanceFactory.eINSTANCE.createObject()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 BusinessInformationFactory.eINSTANCE.createResponsibleParty()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 BusinessInformationFactory.eINSTANCE.createTelephone()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 BusinessInformationFactory.eINSTANCE.createEmail()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 BusinessInformationFactory.eINSTANCE.createLocation()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 BusinessInformationFactory.eINSTANCE.createContact()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 BusinessInformationFactory.eINSTANCE.createDescription()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 BusinessInformationFactory.eINSTANCE.createDocument()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 BusinessInformationFactory.eINSTANCE.createResourceLocator()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 DataTypesFactory.eINSTANCE.createEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 DataTypesFactory.eINSTANCE.createEnumerationLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 DataTypesFactory.eINSTANCE.createTypeAlias()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 DataTypesFactory.eINSTANCE.createUnion()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 DataTypesFactory.eINSTANCE.createUnionMember()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 KeysIndexesFactory.eINSTANCE.createUniqueKey()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 KeysIndexesFactory.eINSTANCE.createIndex()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 KeysIndexesFactory.eINSTANCE.createKeyRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 KeysIndexesFactory.eINSTANCE.createIndexedFeature()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 SoftwareDeploymentFactory.eINSTANCE.createSite()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 SoftwareDeploymentFactory.eINSTANCE.createMachine()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 SoftwareDeploymentFactory.eINSTANCE.createSoftwareSystem()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 SoftwareDeploymentFactory.eINSTANCE.createDeployedComponent()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 SoftwareDeploymentFactory.eINSTANCE.createDeployedSoftwareSystem()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 SoftwareDeploymentFactory.eINSTANCE.createDataManager()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 SoftwareDeploymentFactory.eINSTANCE.createDataProvider()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 SoftwareDeploymentFactory.eINSTANCE.createProviderConnection()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 SoftwareDeploymentFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 SoftwareDeploymentFactory.eINSTANCE.createPackageUsage()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 TypeMappingFactory.eINSTANCE.createTypeMapping()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 TypeMappingFactory.eINSTANCE.createTypeSystem()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 RelationalFactory.eINSTANCE.createCatalog()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 RelationalFactory.eINSTANCE.createSchema()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 RelationalFactory.eINSTANCE.createColumnSet()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 RelationalFactory.eINSTANCE.createNamedColumnSet()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 RelationalFactory.eINSTANCE.createTable()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 RelationalFactory.eINSTANCE.createView()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 RelationalFactory.eINSTANCE.createQueryColumnSet()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 RelationalFactory.eINSTANCE.createSQLDistinctType()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 RelationalFactory.eINSTANCE.createSQLSimpleType()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 RelationalFactory.eINSTANCE.createSQLStructuredType()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 RelationalFactory.eINSTANCE.createColumn()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 RelationalFactory.eINSTANCE.createProcedure()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 RelationalFactory.eINSTANCE.createTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 RelationalFactory.eINSTANCE.createSQLIndex()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 RelationalFactory.eINSTANCE.createUniqueConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 RelationalFactory.eINSTANCE.createForeignKey()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 RelationalFactory.eINSTANCE.createSQLIndexColumn()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 RelationalFactory.eINSTANCE.createPrimaryKey()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 RelationalFactory.eINSTANCE.createRow()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 RelationalFactory.eINSTANCE.createColumnValue()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 RelationalFactory.eINSTANCE.createCheckConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 RelationalFactory.eINSTANCE.createRowSet()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 RelationalFactory.eINSTANCE.createSQLParameter()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 RecordFactory.eINSTANCE.createField()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 RecordFactory.eINSTANCE.createRecordDef()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 RecordFactory.eINSTANCE.createFixedOffsetField()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 RecordFactory.eINSTANCE.createRecordFile()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 RecordFactory.eINSTANCE.createFieldValue()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 RecordFactory.eINSTANCE.createRecord()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 RecordFactory.eINSTANCE.createRecordSet()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 RecordFactory.eINSTANCE.createGroup()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 MultidimensionalFactory.eINSTANCE.createDimension()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 MultidimensionalFactory.eINSTANCE.createDimensionedObject()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 MultidimensionalFactory.eINSTANCE.createMember()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 MultidimensionalFactory.eINSTANCE.createMemberSet()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 MultidimensionalFactory.eINSTANCE.createMemberValue()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 MultidimensionalFactory.eINSTANCE.createSchema()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 CwmXmlFactory.eINSTANCE.createSchema()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 CwmXmlFactory.eINSTANCE.createElementType()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 CwmXmlFactory.eINSTANCE.createAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 CwmXmlFactory.eINSTANCE.createContent()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 CwmXmlFactory.eINSTANCE.createElementContent()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 CwmXmlFactory.eINSTANCE.createMixedContent()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 CwmXmlFactory.eINSTANCE.createElementTypeReference()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 CwmXmlFactory.eINSTANCE.createText()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 CwmXmlFactory.eINSTANCE.createElement()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 CwmXmlFactory.eINSTANCE.createDocument()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 CwmTransformationFactory.eINSTANCE.createTransformation()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 CwmTransformationFactory.eINSTANCE.createDataObjectSet()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 CwmTransformationFactory.eINSTANCE.createTransformationTask()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 CwmTransformationFactory.eINSTANCE.createTransformationStep()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 CwmTransformationFactory.eINSTANCE.createTransformationActivity()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 CwmTransformationFactory.eINSTANCE.createPrecedenceConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 CwmTransformationFactory.eINSTANCE.createTransformationUse()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 CwmTransformationFactory.eINSTANCE.createTransformationMap()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 CwmTransformationFactory.eINSTANCE.createTransformationTree()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 CwmTransformationFactory.eINSTANCE.createClassifierMap()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 CwmTransformationFactory.eINSTANCE.createFeatureMap()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 CwmTransformationFactory.eINSTANCE.createStepPrecedence()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 CwmTransformationFactory.eINSTANCE.createClassifierFeatureMap()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 OlapFactory.eINSTANCE.createContentMap()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 OlapFactory.eINSTANCE.createCube()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 OlapFactory.eINSTANCE.createCubeDeployment()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 OlapFactory.eINSTANCE.createCubeDimensionAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 OlapFactory.eINSTANCE.createCubeRegion()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 OlapFactory.eINSTANCE.createDeploymentGroup()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 OlapFactory.eINSTANCE.createDimension()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 OlapFactory.eINSTANCE.createDimensionDeployment()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 OlapFactory.eINSTANCE.createHierarchyLevelAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 OlapFactory.eINSTANCE.createLevelBasedHierarchy()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 OlapFactory.eINSTANCE.createMemberSelectionGroup()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 OlapFactory.eINSTANCE.createMemberSelection()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 OlapFactory.eINSTANCE.createSchema()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 OlapFactory.eINSTANCE.createValueBasedHierarchy()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 OlapFactory.eINSTANCE.createLevel()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 OlapFactory.eINSTANCE.createCodedLevel()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 OlapFactory.eINSTANCE.createMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 OlapFactory.eINSTANCE.createStructureMap()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 OlapFactory.eINSTANCE.createHierarchyMemberSelectionGroup()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 MiningDataFactory.eINSTANCE.createAttributeAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 MiningDataFactory.eINSTANCE.createAttributeAssignmentSet()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 MiningDataFactory.eINSTANCE.createAttributeUsage()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 MiningDataFactory.eINSTANCE.createAttributeUsageSet()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 MiningDataFactory.eINSTANCE.createCategoricalAttributeProperties()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 MiningDataFactory.eINSTANCE.createDirectAttributeAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 MiningDataFactory.eINSTANCE.createLogicalAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 MiningDataFactory.eINSTANCE.createLogicalData()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 MiningDataFactory.eINSTANCE.createNumericalAttributeProperties()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 MiningDataFactory.eINSTANCE.createOrdinalAttributeProperties()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 MiningDataFactory.eINSTANCE.createPhysicalData()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 MiningDataFactory.eINSTANCE.createPivotAttributeAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 MiningDataFactory.eINSTANCE.createReversePivotAttributeAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 MiningDataFactory.eINSTANCE.createSetAttributeAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 MiningDataFactory.eINSTANCE.createCategory()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 MiningDataFactory.eINSTANCE.createCategoryMap()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 MiningDataFactory.eINSTANCE.createCategoryMapObject()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 MiningDataFactory.eINSTANCE.createCategoryMapObjectEntry()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 MiningDataFactory.eINSTANCE.createCategoryMapTable()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 MiningDataFactory.eINSTANCE.createCategoryMatrix()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 MiningDataFactory.eINSTANCE.createCategoryMatrixEntry()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 MiningDataFactory.eINSTANCE.createCategoryMatrixObject()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 MiningDataFactory.eINSTANCE.createCategoryMatrixTable()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 MiningDataFactory.eINSTANCE.createCategoryTaxonomy()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 MiningModelFactory.eINSTANCE.createMiningModel()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 MiningModelFactory.eINSTANCE.createModelSignature()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 MiningModelFactory.eINSTANCE.createSignatureAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 MiningTaskFactory.eINSTANCE.createApplyOutputItem()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 MiningTaskFactory.eINSTANCE.createApplyProbabilityItem()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 MiningTaskFactory.eINSTANCE.createApplyRuleIdItem()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 MiningTaskFactory.eINSTANCE.createApplyScoreItem()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 MiningTaskFactory.eINSTANCE.createApplySourceItem()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 MiningTaskFactory.eINSTANCE.createMiningApplyOutput()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 MiningTaskFactory.eINSTANCE.createMiningApplyTask()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 MiningTaskFactory.eINSTANCE.createMiningBuildTask()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 MiningTaskFactory.eINSTANCE.createMiningTransformation()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 EntryPointFactory.eINSTANCE.createAuxiliaryObject()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 EntryPointFactory.eINSTANCE.createCatalog()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 EntryPointFactory.eINSTANCE.createSchema()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 ClusteringFactory.eINSTANCE.createClusteringAttributeUsage()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 ClusteringFactory.eINSTANCE.createClusteringFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 AssociationRulesFactory.eINSTANCE.createFrequentItemSetFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 AssociationRulesFactory.eINSTANCE.createAssociationRulesFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 AssociationRulesFactory.eINSTANCE.createSequenceFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 SupervisedFactory.eINSTANCE.createLiftAnalysisPoint()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 SupervisedFactory.eINSTANCE.createLiftAnalysis()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 SupervisedFactory.eINSTANCE.createMiningTestTask()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 SupervisedFactory.eINSTANCE.createSupervisedFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 SupervisedFactory.eINSTANCE.createMiningTestResult()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 ClassificationFactory.eINSTANCE.createApplyTargetValueItem()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 ClassificationFactory.eINSTANCE.createClassificationAttributeUsage()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 ClassificationFactory.eINSTANCE.createClassificationFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 ClassificationFactory.eINSTANCE.createClassificationTestResult()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 ClassificationFactory.eINSTANCE.createClassificationTestTask()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 ClassificationFactory.eINSTANCE.createPriorProbabilities()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 ClassificationFactory.eINSTANCE.createPriorProbabilitiesEntry()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 ApproximationFactory.eINSTANCE.createApproximationFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 ApproximationFactory.eINSTANCE.createApproximationTestResult()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 ApproximationFactory.eINSTANCE.createApproximationTestTask()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 AttributeImportanceFactory.eINSTANCE.createAttributeImportanceSettings()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 InformationVisualizationFactory.eINSTANCE.createRenderedObject()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 InformationVisualizationFactory.eINSTANCE.createRenderedObjectSet()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 InformationVisualizationFactory.eINSTANCE.createRendering()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 InformationVisualizationFactory.eINSTANCE.createXSLRendering()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 WarehouseProcessFactory.eINSTANCE.createWarehouseStep()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 WarehouseProcessFactory.eINSTANCE.createProcessPackage()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 WarehouseProcessFactory.eINSTANCE.createWarehouseActivity()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 EventsFactory.eINSTANCE.createPointInTimeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 EventsFactory.eINSTANCE.createCustomCalendarEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 EventsFactory.eINSTANCE.createCustomCalendar()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 EventsFactory.eINSTANCE.createCalendarDate()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 EventsFactory.eINSTANCE.createIntervalEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 EventsFactory.eINSTANCE.createExternalEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 EventsFactory.eINSTANCE.createInternalEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 EventsFactory.eINSTANCE.createCascadeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 EventsFactory.eINSTANCE.createRetryEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 EventsFactory.eINSTANCE.createRecurringPointInTimeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 WarehouseOperationFactory.eINSTANCE.createMeasurement()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 WarehouseOperationFactory.eINSTANCE.createChangeRequest()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 WarehouseOperationFactory.eINSTANCE.createTransformationExecution()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
				 WarehouseOperationFactory.eINSTANCE.createActivityExecution()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY,
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
			childFeature == BusinessNomenclaturePackage.Literals.BUSINESS_DOMAIN__TAXONOMY;

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

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
import CWM.BusinessNomenclature.Glossary;

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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link CWM.BusinessNomenclature.Glossary} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GlossaryItemProvider
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
	public GlossaryItemProvider(AdapterFactory adapterFactory) {
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

			addLanguagePropertyDescriptor(object);
			addTaxonomyPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Language feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLanguagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Glossary_language_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Glossary_language_feature", "_UI_Glossary_type"),
				 BusinessNomenclaturePackage.Literals.GLOSSARY__LANGUAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Taxonomy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTaxonomyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Glossary_taxonomy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Glossary_taxonomy_feature", "_UI_Glossary_type"),
				 BusinessNomenclaturePackage.Literals.GLOSSARY__TAXONOMY,
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
			childrenFeatures.add(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM);
			childrenFeatures.add(BusinessNomenclaturePackage.Literals.GLOSSARY__SUBGLOSSARY);
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
	 * This returns Glossary.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Glossary"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Glossary)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Glossary_type") :
			getString("_UI_Glossary_type") + " " + label;
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

		switch (notification.getFeatureID(Glossary.class)) {
			case BusinessNomenclaturePackage.GLOSSARY__LANGUAGE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case BusinessNomenclaturePackage.GLOSSARY__TERM:
			case BusinessNomenclaturePackage.GLOSSARY__SUBGLOSSARY:
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
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 BusinessNomenclatureFactory.eINSTANCE.createVocabularyElement()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 BusinessNomenclatureFactory.eINSTANCE.createNomenclature()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 BusinessNomenclatureFactory.eINSTANCE.createTaxonomy()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 BusinessNomenclatureFactory.eINSTANCE.createGlossary()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 BusinessNomenclatureFactory.eINSTANCE.createBusinessDomain()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 BusinessNomenclatureFactory.eINSTANCE.createConcept()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 BusinessNomenclatureFactory.eINSTANCE.createTerm()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 CoreFactory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 CoreFactory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 CoreFactory.eINSTANCE.createPackage()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 CoreFactory.eINSTANCE.createSubsystem()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 CoreFactory.eINSTANCE.createModel()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 CoreFactory.eINSTANCE.createAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 CoreFactory.eINSTANCE.createConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 CoreFactory.eINSTANCE.createDependency()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 CoreFactory.eINSTANCE.createStereotype()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 BehavioralFactory.eINSTANCE.createArgument()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 BehavioralFactory.eINSTANCE.createCallAction()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 BehavioralFactory.eINSTANCE.createEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 BehavioralFactory.eINSTANCE.createInterface()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 BehavioralFactory.eINSTANCE.createMethod()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 BehavioralFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 BehavioralFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 RelationshipsFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 RelationshipsFactory.eINSTANCE.createAssociationEnd()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 RelationshipsFactory.eINSTANCE.createGeneralization()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 CwmInstanceFactory.eINSTANCE.createSlot()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 CwmInstanceFactory.eINSTANCE.createDataSlot()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 CwmInstanceFactory.eINSTANCE.createDataValue()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 CwmInstanceFactory.eINSTANCE.createExtent()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 CwmInstanceFactory.eINSTANCE.createObject()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 BusinessInformationFactory.eINSTANCE.createResponsibleParty()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 BusinessInformationFactory.eINSTANCE.createTelephone()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 BusinessInformationFactory.eINSTANCE.createEmail()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 BusinessInformationFactory.eINSTANCE.createLocation()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 BusinessInformationFactory.eINSTANCE.createContact()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 BusinessInformationFactory.eINSTANCE.createDescription()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 BusinessInformationFactory.eINSTANCE.createDocument()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 BusinessInformationFactory.eINSTANCE.createResourceLocator()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 DataTypesFactory.eINSTANCE.createEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 DataTypesFactory.eINSTANCE.createEnumerationLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 DataTypesFactory.eINSTANCE.createTypeAlias()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 DataTypesFactory.eINSTANCE.createUnion()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 DataTypesFactory.eINSTANCE.createUnionMember()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 KeysIndexesFactory.eINSTANCE.createUniqueKey()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 KeysIndexesFactory.eINSTANCE.createIndex()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 KeysIndexesFactory.eINSTANCE.createKeyRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 KeysIndexesFactory.eINSTANCE.createIndexedFeature()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 SoftwareDeploymentFactory.eINSTANCE.createSite()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 SoftwareDeploymentFactory.eINSTANCE.createMachine()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 SoftwareDeploymentFactory.eINSTANCE.createSoftwareSystem()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 SoftwareDeploymentFactory.eINSTANCE.createDeployedComponent()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 SoftwareDeploymentFactory.eINSTANCE.createDeployedSoftwareSystem()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 SoftwareDeploymentFactory.eINSTANCE.createDataManager()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 SoftwareDeploymentFactory.eINSTANCE.createDataProvider()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 SoftwareDeploymentFactory.eINSTANCE.createProviderConnection()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 SoftwareDeploymentFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 SoftwareDeploymentFactory.eINSTANCE.createPackageUsage()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 TypeMappingFactory.eINSTANCE.createTypeMapping()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 TypeMappingFactory.eINSTANCE.createTypeSystem()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 RelationalFactory.eINSTANCE.createCatalog()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 RelationalFactory.eINSTANCE.createSchema()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 RelationalFactory.eINSTANCE.createColumnSet()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 RelationalFactory.eINSTANCE.createNamedColumnSet()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 RelationalFactory.eINSTANCE.createTable()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 RelationalFactory.eINSTANCE.createView()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 RelationalFactory.eINSTANCE.createQueryColumnSet()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 RelationalFactory.eINSTANCE.createSQLDistinctType()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 RelationalFactory.eINSTANCE.createSQLSimpleType()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 RelationalFactory.eINSTANCE.createSQLStructuredType()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 RelationalFactory.eINSTANCE.createColumn()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 RelationalFactory.eINSTANCE.createProcedure()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 RelationalFactory.eINSTANCE.createTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 RelationalFactory.eINSTANCE.createSQLIndex()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 RelationalFactory.eINSTANCE.createUniqueConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 RelationalFactory.eINSTANCE.createForeignKey()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 RelationalFactory.eINSTANCE.createSQLIndexColumn()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 RelationalFactory.eINSTANCE.createPrimaryKey()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 RelationalFactory.eINSTANCE.createRow()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 RelationalFactory.eINSTANCE.createColumnValue()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 RelationalFactory.eINSTANCE.createCheckConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 RelationalFactory.eINSTANCE.createRowSet()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 RelationalFactory.eINSTANCE.createSQLParameter()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 RecordFactory.eINSTANCE.createField()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 RecordFactory.eINSTANCE.createRecordDef()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 RecordFactory.eINSTANCE.createFixedOffsetField()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 RecordFactory.eINSTANCE.createRecordFile()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 RecordFactory.eINSTANCE.createFieldValue()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 RecordFactory.eINSTANCE.createRecord()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 RecordFactory.eINSTANCE.createRecordSet()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 RecordFactory.eINSTANCE.createGroup()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 MultidimensionalFactory.eINSTANCE.createDimension()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 MultidimensionalFactory.eINSTANCE.createDimensionedObject()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 MultidimensionalFactory.eINSTANCE.createMember()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 MultidimensionalFactory.eINSTANCE.createMemberSet()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 MultidimensionalFactory.eINSTANCE.createMemberValue()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 MultidimensionalFactory.eINSTANCE.createSchema()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 CwmXmlFactory.eINSTANCE.createSchema()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 CwmXmlFactory.eINSTANCE.createElementType()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 CwmXmlFactory.eINSTANCE.createAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 CwmXmlFactory.eINSTANCE.createContent()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 CwmXmlFactory.eINSTANCE.createElementContent()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 CwmXmlFactory.eINSTANCE.createMixedContent()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 CwmXmlFactory.eINSTANCE.createElementTypeReference()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 CwmXmlFactory.eINSTANCE.createText()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 CwmXmlFactory.eINSTANCE.createElement()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 CwmXmlFactory.eINSTANCE.createDocument()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 CwmTransformationFactory.eINSTANCE.createTransformation()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 CwmTransformationFactory.eINSTANCE.createDataObjectSet()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 CwmTransformationFactory.eINSTANCE.createTransformationTask()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 CwmTransformationFactory.eINSTANCE.createTransformationStep()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 CwmTransformationFactory.eINSTANCE.createTransformationActivity()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 CwmTransformationFactory.eINSTANCE.createPrecedenceConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 CwmTransformationFactory.eINSTANCE.createTransformationUse()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 CwmTransformationFactory.eINSTANCE.createTransformationMap()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 CwmTransformationFactory.eINSTANCE.createTransformationTree()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 CwmTransformationFactory.eINSTANCE.createClassifierMap()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 CwmTransformationFactory.eINSTANCE.createFeatureMap()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 CwmTransformationFactory.eINSTANCE.createStepPrecedence()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 CwmTransformationFactory.eINSTANCE.createClassifierFeatureMap()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 OlapFactory.eINSTANCE.createContentMap()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 OlapFactory.eINSTANCE.createCube()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 OlapFactory.eINSTANCE.createCubeDeployment()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 OlapFactory.eINSTANCE.createCubeDimensionAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 OlapFactory.eINSTANCE.createCubeRegion()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 OlapFactory.eINSTANCE.createDeploymentGroup()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 OlapFactory.eINSTANCE.createDimension()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 OlapFactory.eINSTANCE.createDimensionDeployment()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 OlapFactory.eINSTANCE.createHierarchyLevelAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 OlapFactory.eINSTANCE.createLevelBasedHierarchy()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 OlapFactory.eINSTANCE.createMemberSelectionGroup()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 OlapFactory.eINSTANCE.createMemberSelection()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 OlapFactory.eINSTANCE.createSchema()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 OlapFactory.eINSTANCE.createValueBasedHierarchy()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 OlapFactory.eINSTANCE.createLevel()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 OlapFactory.eINSTANCE.createCodedLevel()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 OlapFactory.eINSTANCE.createMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 OlapFactory.eINSTANCE.createStructureMap()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 OlapFactory.eINSTANCE.createHierarchyMemberSelectionGroup()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 MiningDataFactory.eINSTANCE.createAttributeAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 MiningDataFactory.eINSTANCE.createAttributeAssignmentSet()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 MiningDataFactory.eINSTANCE.createAttributeUsage()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 MiningDataFactory.eINSTANCE.createAttributeUsageSet()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 MiningDataFactory.eINSTANCE.createCategoricalAttributeProperties()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 MiningDataFactory.eINSTANCE.createDirectAttributeAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 MiningDataFactory.eINSTANCE.createLogicalAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 MiningDataFactory.eINSTANCE.createLogicalData()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 MiningDataFactory.eINSTANCE.createNumericalAttributeProperties()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 MiningDataFactory.eINSTANCE.createOrdinalAttributeProperties()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 MiningDataFactory.eINSTANCE.createPhysicalData()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 MiningDataFactory.eINSTANCE.createPivotAttributeAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 MiningDataFactory.eINSTANCE.createReversePivotAttributeAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 MiningDataFactory.eINSTANCE.createSetAttributeAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 MiningDataFactory.eINSTANCE.createCategory()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 MiningDataFactory.eINSTANCE.createCategoryMap()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 MiningDataFactory.eINSTANCE.createCategoryMapObject()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 MiningDataFactory.eINSTANCE.createCategoryMapObjectEntry()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 MiningDataFactory.eINSTANCE.createCategoryMapTable()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 MiningDataFactory.eINSTANCE.createCategoryMatrix()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 MiningDataFactory.eINSTANCE.createCategoryMatrixEntry()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 MiningDataFactory.eINSTANCE.createCategoryMatrixObject()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 MiningDataFactory.eINSTANCE.createCategoryMatrixTable()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 MiningDataFactory.eINSTANCE.createCategoryTaxonomy()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 MiningModelFactory.eINSTANCE.createMiningModel()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 MiningModelFactory.eINSTANCE.createModelSignature()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 MiningModelFactory.eINSTANCE.createSignatureAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 MiningTaskFactory.eINSTANCE.createApplyOutputItem()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 MiningTaskFactory.eINSTANCE.createApplyProbabilityItem()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 MiningTaskFactory.eINSTANCE.createApplyRuleIdItem()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 MiningTaskFactory.eINSTANCE.createApplyScoreItem()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 MiningTaskFactory.eINSTANCE.createApplySourceItem()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 MiningTaskFactory.eINSTANCE.createMiningApplyOutput()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 MiningTaskFactory.eINSTANCE.createMiningApplyTask()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 MiningTaskFactory.eINSTANCE.createMiningBuildTask()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 MiningTaskFactory.eINSTANCE.createMiningTransformation()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 EntryPointFactory.eINSTANCE.createAuxiliaryObject()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 EntryPointFactory.eINSTANCE.createCatalog()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 EntryPointFactory.eINSTANCE.createSchema()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 ClusteringFactory.eINSTANCE.createClusteringAttributeUsage()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 ClusteringFactory.eINSTANCE.createClusteringFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 AssociationRulesFactory.eINSTANCE.createFrequentItemSetFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 AssociationRulesFactory.eINSTANCE.createAssociationRulesFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 AssociationRulesFactory.eINSTANCE.createSequenceFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 SupervisedFactory.eINSTANCE.createLiftAnalysisPoint()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 SupervisedFactory.eINSTANCE.createLiftAnalysis()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 SupervisedFactory.eINSTANCE.createMiningTestTask()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 SupervisedFactory.eINSTANCE.createSupervisedFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 SupervisedFactory.eINSTANCE.createMiningTestResult()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 ClassificationFactory.eINSTANCE.createApplyTargetValueItem()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 ClassificationFactory.eINSTANCE.createClassificationAttributeUsage()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 ClassificationFactory.eINSTANCE.createClassificationFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 ClassificationFactory.eINSTANCE.createClassificationTestResult()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 ClassificationFactory.eINSTANCE.createClassificationTestTask()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 ClassificationFactory.eINSTANCE.createPriorProbabilities()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 ClassificationFactory.eINSTANCE.createPriorProbabilitiesEntry()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 ApproximationFactory.eINSTANCE.createApproximationFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 ApproximationFactory.eINSTANCE.createApproximationTestResult()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 ApproximationFactory.eINSTANCE.createApproximationTestTask()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 AttributeImportanceFactory.eINSTANCE.createAttributeImportanceSettings()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 InformationVisualizationFactory.eINSTANCE.createRenderedObject()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 InformationVisualizationFactory.eINSTANCE.createRenderedObjectSet()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 InformationVisualizationFactory.eINSTANCE.createRendering()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 InformationVisualizationFactory.eINSTANCE.createXSLRendering()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 WarehouseProcessFactory.eINSTANCE.createWarehouseStep()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 WarehouseProcessFactory.eINSTANCE.createProcessPackage()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 WarehouseProcessFactory.eINSTANCE.createWarehouseActivity()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 EventsFactory.eINSTANCE.createPointInTimeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 EventsFactory.eINSTANCE.createCustomCalendarEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 EventsFactory.eINSTANCE.createCustomCalendar()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 EventsFactory.eINSTANCE.createCalendarDate()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 EventsFactory.eINSTANCE.createIntervalEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 EventsFactory.eINSTANCE.createExternalEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 EventsFactory.eINSTANCE.createInternalEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 EventsFactory.eINSTANCE.createCascadeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 EventsFactory.eINSTANCE.createRetryEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 EventsFactory.eINSTANCE.createRecurringPointInTimeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 WarehouseOperationFactory.eINSTANCE.createMeasurement()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 WarehouseOperationFactory.eINSTANCE.createChangeRequest()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 WarehouseOperationFactory.eINSTANCE.createTransformationExecution()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 WarehouseOperationFactory.eINSTANCE.createActivityExecution()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__TERM,
				 WarehouseOperationFactory.eINSTANCE.createStepExecution()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__SUBGLOSSARY,
				 BusinessNomenclatureFactory.eINSTANCE.createNomenclature()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__SUBGLOSSARY,
				 BusinessNomenclatureFactory.eINSTANCE.createTaxonomy()));

		newChildDescriptors.add
			(createChildParameter
				(BusinessNomenclaturePackage.Literals.GLOSSARY__SUBGLOSSARY,
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
			childFeature == BusinessNomenclaturePackage.Literals.GLOSSARY__TERM ||
			childFeature == BusinessNomenclaturePackage.Literals.GLOSSARY__SUBGLOSSARY;

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

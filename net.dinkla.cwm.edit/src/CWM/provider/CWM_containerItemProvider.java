/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.provider;


import CWM.Approximation.ApproximationFactory;

import CWM.AssociationRules.AssociationRulesFactory;

import CWM.AttributeImportance.AttributeImportanceFactory;

import CWM.Behavioral.BehavioralFactory;

import CWM.BusinessInformation.BusinessInformationFactory;

import CWM.BusinessNomenclature.BusinessNomenclatureFactory;

import CWM.CWMComplete.CWMCompleteFactory;

import CWM.CWMPackage;
import CWM.CWM_container;

import CWM.Classification.ClassificationFactory;

import CWM.Clustering.ClusteringFactory;

import CWM.Core.CoreFactory;

import CWM.CwmInstance.CwmInstanceFactory;

import CWM.CwmTransformation.CwmTransformationFactory;

import CWM.CwmXml.CwmXmlFactory;

import CWM.DataTypes.DataTypesFactory;

import CWM.Expressions.ExpressionsFactory;

import CWM.InformationVisualization.InformationVisualizationFactory;

import CWM.KeysIndexes.KeysIndexesFactory;

import CWM.MiningCore.EntryPoint.EntryPointFactory;

import CWM.MiningCore.MiningCoreFactory;

import CWM.MiningCore.MiningData.MiningDataFactory;

import CWM.MiningCore.MiningFunctionSettings.MiningFunctionSettingsFactory;

import CWM.MiningCore.MiningModel.MiningModelFactory;

import CWM.MiningCore.MiningResult.MiningResultFactory;

import CWM.MiningCore.MiningTask.MiningTaskFactory;

import CWM.Multidimensional.MultidimensionalFactory;

import CWM.Olap.OlapFactory;

import CWM.Record.RecordFactory;

import CWM.Relational.Enumerations.EnumerationsFactory;

import CWM.Relational.RelationalFactory;

import CWM.Relationships.RelationshipsFactory;

import CWM.SoftwareDeployment.SoftwareDeploymentFactory;

import CWM.Supervised.SupervisedFactory;

import CWM.TypeMapping.TypeMappingFactory;

import CWM.WarehouseOperation.WarehouseOperationFactory;

import CWM.WarehouseProcess.DataType.DataTypeFactory;

import CWM.WarehouseProcess.Events.EventsFactory;

import CWM.WarehouseProcess.WarehouseProcessFactory;

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
 * This is the item provider adapter for a {@link CWM.CWM_container} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CWM_containerItemProvider
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
	public CWM_containerItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(CWMPackage.Literals.CWM_CONTAINER__CORE);
			childrenFeatures.add(CWMPackage.Literals.CWM_CONTAINER__BEHAVIORAL);
			childrenFeatures.add(CWMPackage.Literals.CWM_CONTAINER__RELATIONSHIPS);
			childrenFeatures.add(CWMPackage.Literals.CWM_CONTAINER__INSTANCE);
			childrenFeatures.add(CWMPackage.Literals.CWM_CONTAINER__BUSINESS_INFORMATION);
			childrenFeatures.add(CWMPackage.Literals.CWM_CONTAINER__DATA_TYPES);
			childrenFeatures.add(CWMPackage.Literals.CWM_CONTAINER__EXPRESSIONS);
			childrenFeatures.add(CWMPackage.Literals.CWM_CONTAINER__KEYS_INDEXES);
			childrenFeatures.add(CWMPackage.Literals.CWM_CONTAINER__SOFTWARE_DEPLOYMENT);
			childrenFeatures.add(CWMPackage.Literals.CWM_CONTAINER__TYPE_MAPPING);
			childrenFeatures.add(CWMPackage.Literals.CWM_CONTAINER__RELATIONAL);
			childrenFeatures.add(CWMPackage.Literals.CWM_CONTAINER__ENUMERATIONS);
			childrenFeatures.add(CWMPackage.Literals.CWM_CONTAINER__RECORD);
			childrenFeatures.add(CWMPackage.Literals.CWM_CONTAINER__MULTIDIMENSIONAL);
			childrenFeatures.add(CWMPackage.Literals.CWM_CONTAINER__XML);
			childrenFeatures.add(CWMPackage.Literals.CWM_CONTAINER__TRANSFORMATION);
			childrenFeatures.add(CWMPackage.Literals.CWM_CONTAINER__OLAP);
			childrenFeatures.add(CWMPackage.Literals.CWM_CONTAINER__MINING_CORE);
			childrenFeatures.add(CWMPackage.Literals.CWM_CONTAINER__MINING_DATA);
			childrenFeatures.add(CWMPackage.Literals.CWM_CONTAINER__MINING_FUNCTION_SETTINGS);
			childrenFeatures.add(CWMPackage.Literals.CWM_CONTAINER__MINING_MODEL);
			childrenFeatures.add(CWMPackage.Literals.CWM_CONTAINER__MINING_RESULT);
			childrenFeatures.add(CWMPackage.Literals.CWM_CONTAINER__MINING_TASK);
			childrenFeatures.add(CWMPackage.Literals.CWM_CONTAINER__ENTRY_POINT);
			childrenFeatures.add(CWMPackage.Literals.CWM_CONTAINER__CLUSTERING);
			childrenFeatures.add(CWMPackage.Literals.CWM_CONTAINER__ASSOCIATION_RULES);
			childrenFeatures.add(CWMPackage.Literals.CWM_CONTAINER__SUPERVISED);
			childrenFeatures.add(CWMPackage.Literals.CWM_CONTAINER__CLASSIFICATION);
			childrenFeatures.add(CWMPackage.Literals.CWM_CONTAINER__APPROXIMATION);
			childrenFeatures.add(CWMPackage.Literals.CWM_CONTAINER__ATTRIBUTE_IMPORTANCE);
			childrenFeatures.add(CWMPackage.Literals.CWM_CONTAINER__INFORMATION_VISUALIZATION);
			childrenFeatures.add(CWMPackage.Literals.CWM_CONTAINER__BUSINESS_NOMENCLATURE);
			childrenFeatures.add(CWMPackage.Literals.CWM_CONTAINER__WAREHOUSE_PROCESS);
			childrenFeatures.add(CWMPackage.Literals.CWM_CONTAINER__DATA_TYPE);
			childrenFeatures.add(CWMPackage.Literals.CWM_CONTAINER__EVENTS);
			childrenFeatures.add(CWMPackage.Literals.CWM_CONTAINER__WAREHOUSE_OPERATION);
			childrenFeatures.add(CWMPackage.Literals.CWM_CONTAINER__CWM_COMPLETE);
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
	 * This returns CWM_container.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CWM_container"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_CWM_container_type");
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

		switch (notification.getFeatureID(CWM_container.class)) {
			case CWMPackage.CWM_CONTAINER__CORE:
			case CWMPackage.CWM_CONTAINER__BEHAVIORAL:
			case CWMPackage.CWM_CONTAINER__RELATIONSHIPS:
			case CWMPackage.CWM_CONTAINER__INSTANCE:
			case CWMPackage.CWM_CONTAINER__BUSINESS_INFORMATION:
			case CWMPackage.CWM_CONTAINER__DATA_TYPES:
			case CWMPackage.CWM_CONTAINER__EXPRESSIONS:
			case CWMPackage.CWM_CONTAINER__KEYS_INDEXES:
			case CWMPackage.CWM_CONTAINER__SOFTWARE_DEPLOYMENT:
			case CWMPackage.CWM_CONTAINER__TYPE_MAPPING:
			case CWMPackage.CWM_CONTAINER__RELATIONAL:
			case CWMPackage.CWM_CONTAINER__ENUMERATIONS:
			case CWMPackage.CWM_CONTAINER__RECORD:
			case CWMPackage.CWM_CONTAINER__MULTIDIMENSIONAL:
			case CWMPackage.CWM_CONTAINER__XML:
			case CWMPackage.CWM_CONTAINER__TRANSFORMATION:
			case CWMPackage.CWM_CONTAINER__OLAP:
			case CWMPackage.CWM_CONTAINER__MINING_CORE:
			case CWMPackage.CWM_CONTAINER__MINING_DATA:
			case CWMPackage.CWM_CONTAINER__MINING_FUNCTION_SETTINGS:
			case CWMPackage.CWM_CONTAINER__MINING_MODEL:
			case CWMPackage.CWM_CONTAINER__MINING_RESULT:
			case CWMPackage.CWM_CONTAINER__MINING_TASK:
			case CWMPackage.CWM_CONTAINER__ENTRY_POINT:
			case CWMPackage.CWM_CONTAINER__CLUSTERING:
			case CWMPackage.CWM_CONTAINER__ASSOCIATION_RULES:
			case CWMPackage.CWM_CONTAINER__SUPERVISED:
			case CWMPackage.CWM_CONTAINER__CLASSIFICATION:
			case CWMPackage.CWM_CONTAINER__APPROXIMATION:
			case CWMPackage.CWM_CONTAINER__ATTRIBUTE_IMPORTANCE:
			case CWMPackage.CWM_CONTAINER__INFORMATION_VISUALIZATION:
			case CWMPackage.CWM_CONTAINER__BUSINESS_NOMENCLATURE:
			case CWMPackage.CWM_CONTAINER__WAREHOUSE_PROCESS:
			case CWMPackage.CWM_CONTAINER__DATA_TYPE:
			case CWMPackage.CWM_CONTAINER__EVENTS:
			case CWMPackage.CWM_CONTAINER__WAREHOUSE_OPERATION:
			case CWMPackage.CWM_CONTAINER__CWM_COMPLETE:
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
				(CWMPackage.Literals.CWM_CONTAINER__CORE,
				 CoreFactory.eINSTANCE.createCore_container()));

		newChildDescriptors.add
			(createChildParameter
				(CWMPackage.Literals.CWM_CONTAINER__BEHAVIORAL,
				 BehavioralFactory.eINSTANCE.createBehavioral_container()));

		newChildDescriptors.add
			(createChildParameter
				(CWMPackage.Literals.CWM_CONTAINER__RELATIONSHIPS,
				 RelationshipsFactory.eINSTANCE.createRelationships_container()));

		newChildDescriptors.add
			(createChildParameter
				(CWMPackage.Literals.CWM_CONTAINER__INSTANCE,
				 CwmInstanceFactory.eINSTANCE.createInstance_container()));

		newChildDescriptors.add
			(createChildParameter
				(CWMPackage.Literals.CWM_CONTAINER__BUSINESS_INFORMATION,
				 BusinessInformationFactory.eINSTANCE.createBusinessInformation_container()));

		newChildDescriptors.add
			(createChildParameter
				(CWMPackage.Literals.CWM_CONTAINER__DATA_TYPES,
				 DataTypesFactory.eINSTANCE.createDataTypes_container()));

		newChildDescriptors.add
			(createChildParameter
				(CWMPackage.Literals.CWM_CONTAINER__EXPRESSIONS,
				 ExpressionsFactory.eINSTANCE.createExpressions_container()));

		newChildDescriptors.add
			(createChildParameter
				(CWMPackage.Literals.CWM_CONTAINER__KEYS_INDEXES,
				 KeysIndexesFactory.eINSTANCE.createKeysIndexes_container()));

		newChildDescriptors.add
			(createChildParameter
				(CWMPackage.Literals.CWM_CONTAINER__SOFTWARE_DEPLOYMENT,
				 SoftwareDeploymentFactory.eINSTANCE.createSoftwareDeployment_container()));

		newChildDescriptors.add
			(createChildParameter
				(CWMPackage.Literals.CWM_CONTAINER__TYPE_MAPPING,
				 TypeMappingFactory.eINSTANCE.createTypeMapping_container()));

		newChildDescriptors.add
			(createChildParameter
				(CWMPackage.Literals.CWM_CONTAINER__RELATIONAL,
				 RelationalFactory.eINSTANCE.createRelational_container()));

		newChildDescriptors.add
			(createChildParameter
				(CWMPackage.Literals.CWM_CONTAINER__ENUMERATIONS,
				 EnumerationsFactory.eINSTANCE.createEnumerations_container()));

		newChildDescriptors.add
			(createChildParameter
				(CWMPackage.Literals.CWM_CONTAINER__RECORD,
				 RecordFactory.eINSTANCE.createRecord_container()));

		newChildDescriptors.add
			(createChildParameter
				(CWMPackage.Literals.CWM_CONTAINER__MULTIDIMENSIONAL,
				 MultidimensionalFactory.eINSTANCE.createMultidimensional_container()));

		newChildDescriptors.add
			(createChildParameter
				(CWMPackage.Literals.CWM_CONTAINER__XML,
				 CwmXmlFactory.eINSTANCE.createXML_container()));

		newChildDescriptors.add
			(createChildParameter
				(CWMPackage.Literals.CWM_CONTAINER__TRANSFORMATION,
				 CwmTransformationFactory.eINSTANCE.createTransformation_container()));

		newChildDescriptors.add
			(createChildParameter
				(CWMPackage.Literals.CWM_CONTAINER__OLAP,
				 OlapFactory.eINSTANCE.createOlap_container()));

		newChildDescriptors.add
			(createChildParameter
				(CWMPackage.Literals.CWM_CONTAINER__MINING_CORE,
				 MiningCoreFactory.eINSTANCE.createMiningCore_container()));

		newChildDescriptors.add
			(createChildParameter
				(CWMPackage.Literals.CWM_CONTAINER__MINING_DATA,
				 MiningDataFactory.eINSTANCE.createMiningData_container()));

		newChildDescriptors.add
			(createChildParameter
				(CWMPackage.Literals.CWM_CONTAINER__MINING_FUNCTION_SETTINGS,
				 MiningFunctionSettingsFactory.eINSTANCE.createMiningFunctionSettings_container()));

		newChildDescriptors.add
			(createChildParameter
				(CWMPackage.Literals.CWM_CONTAINER__MINING_MODEL,
				 MiningModelFactory.eINSTANCE.createMiningModel_container()));

		newChildDescriptors.add
			(createChildParameter
				(CWMPackage.Literals.CWM_CONTAINER__MINING_RESULT,
				 MiningResultFactory.eINSTANCE.createMiningResult_container()));

		newChildDescriptors.add
			(createChildParameter
				(CWMPackage.Literals.CWM_CONTAINER__MINING_TASK,
				 MiningTaskFactory.eINSTANCE.createMiningTask_container()));

		newChildDescriptors.add
			(createChildParameter
				(CWMPackage.Literals.CWM_CONTAINER__ENTRY_POINT,
				 EntryPointFactory.eINSTANCE.createEntryPoint_container()));

		newChildDescriptors.add
			(createChildParameter
				(CWMPackage.Literals.CWM_CONTAINER__CLUSTERING,
				 ClusteringFactory.eINSTANCE.createClustering_container()));

		newChildDescriptors.add
			(createChildParameter
				(CWMPackage.Literals.CWM_CONTAINER__ASSOCIATION_RULES,
				 AssociationRulesFactory.eINSTANCE.createAssociationRules_container()));

		newChildDescriptors.add
			(createChildParameter
				(CWMPackage.Literals.CWM_CONTAINER__SUPERVISED,
				 SupervisedFactory.eINSTANCE.createSupervised_container()));

		newChildDescriptors.add
			(createChildParameter
				(CWMPackage.Literals.CWM_CONTAINER__CLASSIFICATION,
				 ClassificationFactory.eINSTANCE.createClassification_container()));

		newChildDescriptors.add
			(createChildParameter
				(CWMPackage.Literals.CWM_CONTAINER__APPROXIMATION,
				 ApproximationFactory.eINSTANCE.createApproximation_container()));

		newChildDescriptors.add
			(createChildParameter
				(CWMPackage.Literals.CWM_CONTAINER__ATTRIBUTE_IMPORTANCE,
				 AttributeImportanceFactory.eINSTANCE.createAttributeImportance_container()));

		newChildDescriptors.add
			(createChildParameter
				(CWMPackage.Literals.CWM_CONTAINER__INFORMATION_VISUALIZATION,
				 InformationVisualizationFactory.eINSTANCE.createInformationVisualization_container()));

		newChildDescriptors.add
			(createChildParameter
				(CWMPackage.Literals.CWM_CONTAINER__BUSINESS_NOMENCLATURE,
				 BusinessNomenclatureFactory.eINSTANCE.createBusinessNomenclature_container()));

		newChildDescriptors.add
			(createChildParameter
				(CWMPackage.Literals.CWM_CONTAINER__WAREHOUSE_PROCESS,
				 WarehouseProcessFactory.eINSTANCE.createWarehouseProcess_container()));

		newChildDescriptors.add
			(createChildParameter
				(CWMPackage.Literals.CWM_CONTAINER__DATA_TYPE,
				 DataTypeFactory.eINSTANCE.createDataType_container()));

		newChildDescriptors.add
			(createChildParameter
				(CWMPackage.Literals.CWM_CONTAINER__EVENTS,
				 EventsFactory.eINSTANCE.createEvents_container()));

		newChildDescriptors.add
			(createChildParameter
				(CWMPackage.Literals.CWM_CONTAINER__WAREHOUSE_OPERATION,
				 WarehouseOperationFactory.eINSTANCE.createWarehouseOperation_container()));

		newChildDescriptors.add
			(createChildParameter
				(CWMPackage.Literals.CWM_CONTAINER__CWM_COMPLETE,
				 CWMCompleteFactory.eINSTANCE.createCWMComplete_container()));
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

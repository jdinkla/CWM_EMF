/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Core.provider;


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
import CWM.Core.Core_container;

import CWM.CwmInstance.CwmInstanceFactory;

import CWM.CwmTransformation.CwmTransformationFactory;

import CWM.CwmXml.CwmXmlFactory;

import CWM.DataTypes.DataTypesFactory;

import CWM.Expressions.ExpressionsFactory;

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
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link CWM.Core.Core_container} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Core_containerItemProvider
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
	public Core_containerItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(CorePackage.Literals.CORE_CONTAINER__ELEMENT);
			childrenFeatures.add(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT);
			childrenFeatures.add(CorePackage.Literals.CORE_CONTAINER__NAMESPACE);
			childrenFeatures.add(CorePackage.Literals.CORE_CONTAINER__CLASSIFIER);
			childrenFeatures.add(CorePackage.Literals.CORE_CONTAINER__CLASS);
			childrenFeatures.add(CorePackage.Literals.CORE_CONTAINER__DATA_TYPE);
			childrenFeatures.add(CorePackage.Literals.CORE_CONTAINER__PACKAGE);
			childrenFeatures.add(CorePackage.Literals.CORE_CONTAINER__SUBSYSTEM);
			childrenFeatures.add(CorePackage.Literals.CORE_CONTAINER__MODEL);
			childrenFeatures.add(CorePackage.Literals.CORE_CONTAINER__FEATURE);
			childrenFeatures.add(CorePackage.Literals.CORE_CONTAINER__STRUCTURAL_FEATURE);
			childrenFeatures.add(CorePackage.Literals.CORE_CONTAINER__ATTRIBUTE);
			childrenFeatures.add(CorePackage.Literals.CORE_CONTAINER__CONSTRAINT);
			childrenFeatures.add(CorePackage.Literals.CORE_CONTAINER__DEPENDENCY);
			childrenFeatures.add(CorePackage.Literals.CORE_CONTAINER__EXPRESSION);
			childrenFeatures.add(CorePackage.Literals.CORE_CONTAINER__BOOLEAN_EXPRESSION);
			childrenFeatures.add(CorePackage.Literals.CORE_CONTAINER__PROCEDURE_EXPRESSION);
			childrenFeatures.add(CorePackage.Literals.CORE_CONTAINER__MULTIPLICITY);
			childrenFeatures.add(CorePackage.Literals.CORE_CONTAINER__MULTIPLICITY_RANGE);
			childrenFeatures.add(CorePackage.Literals.CORE_CONTAINER__STEREOTYPE);
			childrenFeatures.add(CorePackage.Literals.CORE_CONTAINER__TAGGED_VALUE);
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
	 * This returns Core_container.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Core_container"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Core_container_type");
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

		switch (notification.getFeatureID(Core_container.class)) {
			case CorePackage.CORE_CONTAINER__ELEMENT:
			case CorePackage.CORE_CONTAINER__MODEL_ELEMENT:
			case CorePackage.CORE_CONTAINER__NAMESPACE:
			case CorePackage.CORE_CONTAINER__CLASSIFIER:
			case CorePackage.CORE_CONTAINER__CLASS:
			case CorePackage.CORE_CONTAINER__DATA_TYPE:
			case CorePackage.CORE_CONTAINER__PACKAGE:
			case CorePackage.CORE_CONTAINER__SUBSYSTEM:
			case CorePackage.CORE_CONTAINER__MODEL:
			case CorePackage.CORE_CONTAINER__FEATURE:
			case CorePackage.CORE_CONTAINER__STRUCTURAL_FEATURE:
			case CorePackage.CORE_CONTAINER__ATTRIBUTE:
			case CorePackage.CORE_CONTAINER__CONSTRAINT:
			case CorePackage.CORE_CONTAINER__DEPENDENCY:
			case CorePackage.CORE_CONTAINER__EXPRESSION:
			case CorePackage.CORE_CONTAINER__BOOLEAN_EXPRESSION:
			case CorePackage.CORE_CONTAINER__PROCEDURE_EXPRESSION:
			case CorePackage.CORE_CONTAINER__MULTIPLICITY:
			case CorePackage.CORE_CONTAINER__MULTIPLICITY_RANGE:
			case CorePackage.CORE_CONTAINER__STEREOTYPE:
			case CorePackage.CORE_CONTAINER__TAGGED_VALUE:
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
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 CoreFactory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 CoreFactory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 CoreFactory.eINSTANCE.createPackage()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 CoreFactory.eINSTANCE.createSubsystem()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 CoreFactory.eINSTANCE.createModel()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 CoreFactory.eINSTANCE.createAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 CoreFactory.eINSTANCE.createConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 CoreFactory.eINSTANCE.createDependency()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 CoreFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 CoreFactory.eINSTANCE.createBooleanExpression()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 CoreFactory.eINSTANCE.createProcedureExpression()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 CoreFactory.eINSTANCE.createMultiplicity()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 CoreFactory.eINSTANCE.createMultiplicityRange()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 CoreFactory.eINSTANCE.createStereotype()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 CoreFactory.eINSTANCE.createTaggedValue()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 BehavioralFactory.eINSTANCE.createArgument()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 BehavioralFactory.eINSTANCE.createCallAction()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 BehavioralFactory.eINSTANCE.createEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 BehavioralFactory.eINSTANCE.createInterface()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 BehavioralFactory.eINSTANCE.createMethod()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 BehavioralFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 BehavioralFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 RelationshipsFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 RelationshipsFactory.eINSTANCE.createAssociationEnd()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 RelationshipsFactory.eINSTANCE.createGeneralization()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 CwmInstanceFactory.eINSTANCE.createSlot()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 CwmInstanceFactory.eINSTANCE.createDataSlot()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 CwmInstanceFactory.eINSTANCE.createDataValue()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 CwmInstanceFactory.eINSTANCE.createExtent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 CwmInstanceFactory.eINSTANCE.createObject()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 BusinessInformationFactory.eINSTANCE.createResponsibleParty()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 BusinessInformationFactory.eINSTANCE.createTelephone()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 BusinessInformationFactory.eINSTANCE.createEmail()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 BusinessInformationFactory.eINSTANCE.createLocation()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 BusinessInformationFactory.eINSTANCE.createContact()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 BusinessInformationFactory.eINSTANCE.createDescription()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 BusinessInformationFactory.eINSTANCE.createDocument()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 BusinessInformationFactory.eINSTANCE.createResourceLocator()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 DataTypesFactory.eINSTANCE.createEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 DataTypesFactory.eINSTANCE.createEnumerationLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 DataTypesFactory.eINSTANCE.createQueryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 DataTypesFactory.eINSTANCE.createTypeAlias()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 DataTypesFactory.eINSTANCE.createUnion()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 DataTypesFactory.eINSTANCE.createUnionMember()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 ExpressionsFactory.eINSTANCE.createExpressionNode()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 ExpressionsFactory.eINSTANCE.createConstantNode()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 ExpressionsFactory.eINSTANCE.createElementNode()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 ExpressionsFactory.eINSTANCE.createFeatureNode()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 KeysIndexesFactory.eINSTANCE.createUniqueKey()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 KeysIndexesFactory.eINSTANCE.createIndex()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 KeysIndexesFactory.eINSTANCE.createKeyRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 KeysIndexesFactory.eINSTANCE.createIndexedFeature()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 SoftwareDeploymentFactory.eINSTANCE.createSite()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 SoftwareDeploymentFactory.eINSTANCE.createMachine()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 SoftwareDeploymentFactory.eINSTANCE.createSoftwareSystem()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 SoftwareDeploymentFactory.eINSTANCE.createDeployedComponent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 SoftwareDeploymentFactory.eINSTANCE.createDeployedSoftwareSystem()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 SoftwareDeploymentFactory.eINSTANCE.createDataManager()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 SoftwareDeploymentFactory.eINSTANCE.createDataProvider()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 SoftwareDeploymentFactory.eINSTANCE.createProviderConnection()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 SoftwareDeploymentFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 SoftwareDeploymentFactory.eINSTANCE.createPackageUsage()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 TypeMappingFactory.eINSTANCE.createTypeMapping()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 TypeMappingFactory.eINSTANCE.createTypeSystem()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 RelationalFactory.eINSTANCE.createCatalog()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 RelationalFactory.eINSTANCE.createSchema()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 RelationalFactory.eINSTANCE.createColumnSet()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 RelationalFactory.eINSTANCE.createNamedColumnSet()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 RelationalFactory.eINSTANCE.createTable()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 RelationalFactory.eINSTANCE.createView()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 RelationalFactory.eINSTANCE.createQueryColumnSet()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 RelationalFactory.eINSTANCE.createSQLDistinctType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 RelationalFactory.eINSTANCE.createSQLSimpleType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 RelationalFactory.eINSTANCE.createSQLStructuredType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 RelationalFactory.eINSTANCE.createColumn()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 RelationalFactory.eINSTANCE.createProcedure()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 RelationalFactory.eINSTANCE.createTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 RelationalFactory.eINSTANCE.createSQLIndex()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 RelationalFactory.eINSTANCE.createUniqueConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 RelationalFactory.eINSTANCE.createForeignKey()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 RelationalFactory.eINSTANCE.createSQLIndexColumn()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 RelationalFactory.eINSTANCE.createPrimaryKey()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 RelationalFactory.eINSTANCE.createRow()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 RelationalFactory.eINSTANCE.createColumnValue()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 RelationalFactory.eINSTANCE.createCheckConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 RelationalFactory.eINSTANCE.createRowSet()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 RelationalFactory.eINSTANCE.createSQLParameter()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 RecordFactory.eINSTANCE.createField()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 RecordFactory.eINSTANCE.createRecordDef()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 RecordFactory.eINSTANCE.createFixedOffsetField()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 RecordFactory.eINSTANCE.createRecordFile()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 RecordFactory.eINSTANCE.createFieldValue()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 RecordFactory.eINSTANCE.createRecord()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 RecordFactory.eINSTANCE.createRecordSet()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 RecordFactory.eINSTANCE.createGroup()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 MultidimensionalFactory.eINSTANCE.createDimension()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 MultidimensionalFactory.eINSTANCE.createDimensionedObject()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 MultidimensionalFactory.eINSTANCE.createMember()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 MultidimensionalFactory.eINSTANCE.createMemberSet()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 MultidimensionalFactory.eINSTANCE.createMemberValue()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 MultidimensionalFactory.eINSTANCE.createSchema()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 CwmXmlFactory.eINSTANCE.createSchema()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 CwmXmlFactory.eINSTANCE.createElementType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 CwmXmlFactory.eINSTANCE.createAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 CwmXmlFactory.eINSTANCE.createContent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 CwmXmlFactory.eINSTANCE.createElementContent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 CwmXmlFactory.eINSTANCE.createMixedContent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 CwmXmlFactory.eINSTANCE.createElementTypeReference()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 CwmXmlFactory.eINSTANCE.createText()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 CwmXmlFactory.eINSTANCE.createElement()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 CwmXmlFactory.eINSTANCE.createDocument()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 CwmTransformationFactory.eINSTANCE.createTransformation()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 CwmTransformationFactory.eINSTANCE.createDataObjectSet()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 CwmTransformationFactory.eINSTANCE.createTransformationTask()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 CwmTransformationFactory.eINSTANCE.createTransformationStep()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 CwmTransformationFactory.eINSTANCE.createTransformationActivity()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 CwmTransformationFactory.eINSTANCE.createPrecedenceConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 CwmTransformationFactory.eINSTANCE.createTransformationUse()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 CwmTransformationFactory.eINSTANCE.createTransformationMap()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 CwmTransformationFactory.eINSTANCE.createTransformationTree()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 CwmTransformationFactory.eINSTANCE.createClassifierMap()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 CwmTransformationFactory.eINSTANCE.createFeatureMap()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 CwmTransformationFactory.eINSTANCE.createStepPrecedence()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 CwmTransformationFactory.eINSTANCE.createClassifierFeatureMap()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 OlapFactory.eINSTANCE.createContentMap()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 OlapFactory.eINSTANCE.createCube()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 OlapFactory.eINSTANCE.createCubeDeployment()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 OlapFactory.eINSTANCE.createCubeDimensionAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 OlapFactory.eINSTANCE.createCubeRegion()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 OlapFactory.eINSTANCE.createDeploymentGroup()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 OlapFactory.eINSTANCE.createDimension()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 OlapFactory.eINSTANCE.createDimensionDeployment()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 OlapFactory.eINSTANCE.createHierarchyLevelAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 OlapFactory.eINSTANCE.createLevelBasedHierarchy()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 OlapFactory.eINSTANCE.createMemberSelectionGroup()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 OlapFactory.eINSTANCE.createMemberSelection()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 OlapFactory.eINSTANCE.createSchema()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 OlapFactory.eINSTANCE.createValueBasedHierarchy()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 OlapFactory.eINSTANCE.createLevel()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 OlapFactory.eINSTANCE.createCodedLevel()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 OlapFactory.eINSTANCE.createMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 OlapFactory.eINSTANCE.createStructureMap()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 OlapFactory.eINSTANCE.createHierarchyMemberSelectionGroup()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 MiningDataFactory.eINSTANCE.createAttributeAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 MiningDataFactory.eINSTANCE.createAttributeAssignmentSet()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 MiningDataFactory.eINSTANCE.createAttributeUsage()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 MiningDataFactory.eINSTANCE.createAttributeUsageSet()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 MiningDataFactory.eINSTANCE.createCategoricalAttributeProperties()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 MiningDataFactory.eINSTANCE.createDirectAttributeAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 MiningDataFactory.eINSTANCE.createLogicalAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 MiningDataFactory.eINSTANCE.createLogicalData()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 MiningDataFactory.eINSTANCE.createNumericalAttributeProperties()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 MiningDataFactory.eINSTANCE.createOrdinalAttributeProperties()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 MiningDataFactory.eINSTANCE.createPhysicalData()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 MiningDataFactory.eINSTANCE.createPivotAttributeAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 MiningDataFactory.eINSTANCE.createReversePivotAttributeAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 MiningDataFactory.eINSTANCE.createSetAttributeAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 MiningDataFactory.eINSTANCE.createCategory()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 MiningDataFactory.eINSTANCE.createCategoryMap()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 MiningDataFactory.eINSTANCE.createCategoryMapObject()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 MiningDataFactory.eINSTANCE.createCategoryMapObjectEntry()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 MiningDataFactory.eINSTANCE.createCategoryMapTable()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 MiningDataFactory.eINSTANCE.createCategoryMatrix()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 MiningDataFactory.eINSTANCE.createCategoryMatrixEntry()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 MiningDataFactory.eINSTANCE.createCategoryMatrixObject()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 MiningDataFactory.eINSTANCE.createCategoryMatrixTable()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 MiningDataFactory.eINSTANCE.createCategoryTaxonomy()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 MiningModelFactory.eINSTANCE.createMiningModel()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 MiningModelFactory.eINSTANCE.createModelSignature()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 MiningModelFactory.eINSTANCE.createSignatureAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 MiningTaskFactory.eINSTANCE.createApplyOutputItem()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 MiningTaskFactory.eINSTANCE.createApplyProbabilityItem()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 MiningTaskFactory.eINSTANCE.createApplyRuleIdItem()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 MiningTaskFactory.eINSTANCE.createApplyScoreItem()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 MiningTaskFactory.eINSTANCE.createApplySourceItem()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 MiningTaskFactory.eINSTANCE.createMiningApplyOutput()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 MiningTaskFactory.eINSTANCE.createMiningApplyTask()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 MiningTaskFactory.eINSTANCE.createMiningBuildTask()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 MiningTaskFactory.eINSTANCE.createMiningTransformation()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 EntryPointFactory.eINSTANCE.createAuxiliaryObject()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 EntryPointFactory.eINSTANCE.createCatalog()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 EntryPointFactory.eINSTANCE.createSchema()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 ClusteringFactory.eINSTANCE.createClusteringAttributeUsage()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 ClusteringFactory.eINSTANCE.createClusteringFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 AssociationRulesFactory.eINSTANCE.createFrequentItemSetFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 AssociationRulesFactory.eINSTANCE.createAssociationRulesFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 AssociationRulesFactory.eINSTANCE.createSequenceFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 SupervisedFactory.eINSTANCE.createLiftAnalysisPoint()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 SupervisedFactory.eINSTANCE.createLiftAnalysis()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 SupervisedFactory.eINSTANCE.createMiningTestTask()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 SupervisedFactory.eINSTANCE.createSupervisedFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 SupervisedFactory.eINSTANCE.createMiningTestResult()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 ClassificationFactory.eINSTANCE.createApplyTargetValueItem()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 ClassificationFactory.eINSTANCE.createClassificationAttributeUsage()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 ClassificationFactory.eINSTANCE.createClassificationFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 ClassificationFactory.eINSTANCE.createClassificationTestResult()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 ClassificationFactory.eINSTANCE.createClassificationTestTask()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 ClassificationFactory.eINSTANCE.createPriorProbabilities()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 ClassificationFactory.eINSTANCE.createPriorProbabilitiesEntry()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 ApproximationFactory.eINSTANCE.createApproximationFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 ApproximationFactory.eINSTANCE.createApproximationTestResult()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 ApproximationFactory.eINSTANCE.createApproximationTestTask()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 AttributeImportanceFactory.eINSTANCE.createAttributeImportanceSettings()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 InformationVisualizationFactory.eINSTANCE.createRenderedObject()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 InformationVisualizationFactory.eINSTANCE.createRenderedObjectSet()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 InformationVisualizationFactory.eINSTANCE.createRendering()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 InformationVisualizationFactory.eINSTANCE.createXSLRendering()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 BusinessNomenclatureFactory.eINSTANCE.createVocabularyElement()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 BusinessNomenclatureFactory.eINSTANCE.createNomenclature()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 BusinessNomenclatureFactory.eINSTANCE.createTaxonomy()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 BusinessNomenclatureFactory.eINSTANCE.createGlossary()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 BusinessNomenclatureFactory.eINSTANCE.createBusinessDomain()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 BusinessNomenclatureFactory.eINSTANCE.createConcept()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 BusinessNomenclatureFactory.eINSTANCE.createTerm()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 WarehouseProcessFactory.eINSTANCE.createWarehouseStep()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 WarehouseProcessFactory.eINSTANCE.createProcessPackage()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 WarehouseProcessFactory.eINSTANCE.createWarehouseActivity()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 EventsFactory.eINSTANCE.createPointInTimeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 EventsFactory.eINSTANCE.createCustomCalendarEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 EventsFactory.eINSTANCE.createCustomCalendar()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 EventsFactory.eINSTANCE.createCalendarDate()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 EventsFactory.eINSTANCE.createIntervalEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 EventsFactory.eINSTANCE.createExternalEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 EventsFactory.eINSTANCE.createInternalEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 EventsFactory.eINSTANCE.createCascadeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 EventsFactory.eINSTANCE.createRetryEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 EventsFactory.eINSTANCE.createRecurringPointInTimeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 WarehouseOperationFactory.eINSTANCE.createMeasurement()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 WarehouseOperationFactory.eINSTANCE.createChangeRequest()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 WarehouseOperationFactory.eINSTANCE.createTransformationExecution()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 WarehouseOperationFactory.eINSTANCE.createActivityExecution()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ELEMENT,
				 WarehouseOperationFactory.eINSTANCE.createStepExecution()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 CoreFactory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 CoreFactory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 CoreFactory.eINSTANCE.createPackage()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 CoreFactory.eINSTANCE.createSubsystem()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 CoreFactory.eINSTANCE.createModel()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 CoreFactory.eINSTANCE.createAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 CoreFactory.eINSTANCE.createConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 CoreFactory.eINSTANCE.createDependency()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 CoreFactory.eINSTANCE.createStereotype()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 BehavioralFactory.eINSTANCE.createArgument()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 BehavioralFactory.eINSTANCE.createCallAction()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 BehavioralFactory.eINSTANCE.createEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 BehavioralFactory.eINSTANCE.createInterface()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 BehavioralFactory.eINSTANCE.createMethod()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 BehavioralFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 BehavioralFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 RelationshipsFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 RelationshipsFactory.eINSTANCE.createAssociationEnd()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 RelationshipsFactory.eINSTANCE.createGeneralization()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 CwmInstanceFactory.eINSTANCE.createSlot()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 CwmInstanceFactory.eINSTANCE.createDataSlot()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 CwmInstanceFactory.eINSTANCE.createDataValue()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 CwmInstanceFactory.eINSTANCE.createExtent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 CwmInstanceFactory.eINSTANCE.createObject()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 BusinessInformationFactory.eINSTANCE.createResponsibleParty()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 BusinessInformationFactory.eINSTANCE.createTelephone()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 BusinessInformationFactory.eINSTANCE.createEmail()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 BusinessInformationFactory.eINSTANCE.createLocation()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 BusinessInformationFactory.eINSTANCE.createContact()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 BusinessInformationFactory.eINSTANCE.createDescription()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 BusinessInformationFactory.eINSTANCE.createDocument()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 BusinessInformationFactory.eINSTANCE.createResourceLocator()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 DataTypesFactory.eINSTANCE.createEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 DataTypesFactory.eINSTANCE.createEnumerationLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 DataTypesFactory.eINSTANCE.createTypeAlias()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 DataTypesFactory.eINSTANCE.createUnion()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 DataTypesFactory.eINSTANCE.createUnionMember()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 KeysIndexesFactory.eINSTANCE.createUniqueKey()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 KeysIndexesFactory.eINSTANCE.createIndex()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 KeysIndexesFactory.eINSTANCE.createKeyRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 KeysIndexesFactory.eINSTANCE.createIndexedFeature()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 SoftwareDeploymentFactory.eINSTANCE.createSite()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 SoftwareDeploymentFactory.eINSTANCE.createMachine()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 SoftwareDeploymentFactory.eINSTANCE.createSoftwareSystem()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 SoftwareDeploymentFactory.eINSTANCE.createDeployedComponent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 SoftwareDeploymentFactory.eINSTANCE.createDeployedSoftwareSystem()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 SoftwareDeploymentFactory.eINSTANCE.createDataManager()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 SoftwareDeploymentFactory.eINSTANCE.createDataProvider()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 SoftwareDeploymentFactory.eINSTANCE.createProviderConnection()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 SoftwareDeploymentFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 SoftwareDeploymentFactory.eINSTANCE.createPackageUsage()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 TypeMappingFactory.eINSTANCE.createTypeMapping()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 TypeMappingFactory.eINSTANCE.createTypeSystem()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 RelationalFactory.eINSTANCE.createCatalog()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 RelationalFactory.eINSTANCE.createSchema()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 RelationalFactory.eINSTANCE.createColumnSet()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 RelationalFactory.eINSTANCE.createNamedColumnSet()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 RelationalFactory.eINSTANCE.createTable()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 RelationalFactory.eINSTANCE.createView()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 RelationalFactory.eINSTANCE.createQueryColumnSet()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 RelationalFactory.eINSTANCE.createSQLDistinctType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 RelationalFactory.eINSTANCE.createSQLSimpleType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 RelationalFactory.eINSTANCE.createSQLStructuredType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 RelationalFactory.eINSTANCE.createColumn()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 RelationalFactory.eINSTANCE.createProcedure()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 RelationalFactory.eINSTANCE.createTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 RelationalFactory.eINSTANCE.createSQLIndex()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 RelationalFactory.eINSTANCE.createUniqueConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 RelationalFactory.eINSTANCE.createForeignKey()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 RelationalFactory.eINSTANCE.createSQLIndexColumn()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 RelationalFactory.eINSTANCE.createPrimaryKey()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 RelationalFactory.eINSTANCE.createRow()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 RelationalFactory.eINSTANCE.createColumnValue()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 RelationalFactory.eINSTANCE.createCheckConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 RelationalFactory.eINSTANCE.createRowSet()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 RelationalFactory.eINSTANCE.createSQLParameter()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 RecordFactory.eINSTANCE.createField()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 RecordFactory.eINSTANCE.createRecordDef()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 RecordFactory.eINSTANCE.createFixedOffsetField()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 RecordFactory.eINSTANCE.createRecordFile()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 RecordFactory.eINSTANCE.createFieldValue()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 RecordFactory.eINSTANCE.createRecord()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 RecordFactory.eINSTANCE.createRecordSet()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 RecordFactory.eINSTANCE.createGroup()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 MultidimensionalFactory.eINSTANCE.createDimension()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 MultidimensionalFactory.eINSTANCE.createDimensionedObject()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 MultidimensionalFactory.eINSTANCE.createMember()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 MultidimensionalFactory.eINSTANCE.createMemberSet()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 MultidimensionalFactory.eINSTANCE.createMemberValue()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 MultidimensionalFactory.eINSTANCE.createSchema()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 CwmXmlFactory.eINSTANCE.createSchema()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 CwmXmlFactory.eINSTANCE.createElementType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 CwmXmlFactory.eINSTANCE.createAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 CwmXmlFactory.eINSTANCE.createContent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 CwmXmlFactory.eINSTANCE.createElementContent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 CwmXmlFactory.eINSTANCE.createMixedContent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 CwmXmlFactory.eINSTANCE.createElementTypeReference()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 CwmXmlFactory.eINSTANCE.createText()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 CwmXmlFactory.eINSTANCE.createElement()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 CwmXmlFactory.eINSTANCE.createDocument()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 CwmTransformationFactory.eINSTANCE.createTransformation()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 CwmTransformationFactory.eINSTANCE.createDataObjectSet()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 CwmTransformationFactory.eINSTANCE.createTransformationTask()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 CwmTransformationFactory.eINSTANCE.createTransformationStep()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 CwmTransformationFactory.eINSTANCE.createTransformationActivity()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 CwmTransformationFactory.eINSTANCE.createPrecedenceConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 CwmTransformationFactory.eINSTANCE.createTransformationUse()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 CwmTransformationFactory.eINSTANCE.createTransformationMap()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 CwmTransformationFactory.eINSTANCE.createTransformationTree()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 CwmTransformationFactory.eINSTANCE.createClassifierMap()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 CwmTransformationFactory.eINSTANCE.createFeatureMap()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 CwmTransformationFactory.eINSTANCE.createStepPrecedence()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 CwmTransformationFactory.eINSTANCE.createClassifierFeatureMap()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 OlapFactory.eINSTANCE.createContentMap()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 OlapFactory.eINSTANCE.createCube()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 OlapFactory.eINSTANCE.createCubeDeployment()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 OlapFactory.eINSTANCE.createCubeDimensionAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 OlapFactory.eINSTANCE.createCubeRegion()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 OlapFactory.eINSTANCE.createDeploymentGroup()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 OlapFactory.eINSTANCE.createDimension()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 OlapFactory.eINSTANCE.createDimensionDeployment()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 OlapFactory.eINSTANCE.createHierarchyLevelAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 OlapFactory.eINSTANCE.createLevelBasedHierarchy()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 OlapFactory.eINSTANCE.createMemberSelectionGroup()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 OlapFactory.eINSTANCE.createMemberSelection()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 OlapFactory.eINSTANCE.createSchema()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 OlapFactory.eINSTANCE.createValueBasedHierarchy()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 OlapFactory.eINSTANCE.createLevel()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 OlapFactory.eINSTANCE.createCodedLevel()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 OlapFactory.eINSTANCE.createMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 OlapFactory.eINSTANCE.createStructureMap()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 OlapFactory.eINSTANCE.createHierarchyMemberSelectionGroup()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 MiningDataFactory.eINSTANCE.createAttributeAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 MiningDataFactory.eINSTANCE.createAttributeAssignmentSet()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 MiningDataFactory.eINSTANCE.createAttributeUsage()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 MiningDataFactory.eINSTANCE.createAttributeUsageSet()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 MiningDataFactory.eINSTANCE.createCategoricalAttributeProperties()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 MiningDataFactory.eINSTANCE.createDirectAttributeAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 MiningDataFactory.eINSTANCE.createLogicalAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 MiningDataFactory.eINSTANCE.createLogicalData()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 MiningDataFactory.eINSTANCE.createNumericalAttributeProperties()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 MiningDataFactory.eINSTANCE.createOrdinalAttributeProperties()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 MiningDataFactory.eINSTANCE.createPhysicalData()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 MiningDataFactory.eINSTANCE.createPivotAttributeAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 MiningDataFactory.eINSTANCE.createReversePivotAttributeAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 MiningDataFactory.eINSTANCE.createSetAttributeAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 MiningDataFactory.eINSTANCE.createCategory()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 MiningDataFactory.eINSTANCE.createCategoryMap()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 MiningDataFactory.eINSTANCE.createCategoryMapObject()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 MiningDataFactory.eINSTANCE.createCategoryMapObjectEntry()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 MiningDataFactory.eINSTANCE.createCategoryMapTable()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 MiningDataFactory.eINSTANCE.createCategoryMatrix()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 MiningDataFactory.eINSTANCE.createCategoryMatrixEntry()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 MiningDataFactory.eINSTANCE.createCategoryMatrixObject()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 MiningDataFactory.eINSTANCE.createCategoryMatrixTable()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 MiningDataFactory.eINSTANCE.createCategoryTaxonomy()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 MiningModelFactory.eINSTANCE.createMiningModel()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 MiningModelFactory.eINSTANCE.createModelSignature()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 MiningModelFactory.eINSTANCE.createSignatureAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 MiningTaskFactory.eINSTANCE.createApplyOutputItem()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 MiningTaskFactory.eINSTANCE.createApplyProbabilityItem()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 MiningTaskFactory.eINSTANCE.createApplyRuleIdItem()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 MiningTaskFactory.eINSTANCE.createApplyScoreItem()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 MiningTaskFactory.eINSTANCE.createApplySourceItem()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 MiningTaskFactory.eINSTANCE.createMiningApplyOutput()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 MiningTaskFactory.eINSTANCE.createMiningApplyTask()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 MiningTaskFactory.eINSTANCE.createMiningBuildTask()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 MiningTaskFactory.eINSTANCE.createMiningTransformation()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 EntryPointFactory.eINSTANCE.createAuxiliaryObject()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 EntryPointFactory.eINSTANCE.createCatalog()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 EntryPointFactory.eINSTANCE.createSchema()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 ClusteringFactory.eINSTANCE.createClusteringAttributeUsage()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 ClusteringFactory.eINSTANCE.createClusteringFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 AssociationRulesFactory.eINSTANCE.createFrequentItemSetFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 AssociationRulesFactory.eINSTANCE.createAssociationRulesFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 AssociationRulesFactory.eINSTANCE.createSequenceFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 SupervisedFactory.eINSTANCE.createLiftAnalysisPoint()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 SupervisedFactory.eINSTANCE.createLiftAnalysis()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 SupervisedFactory.eINSTANCE.createMiningTestTask()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 SupervisedFactory.eINSTANCE.createSupervisedFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 SupervisedFactory.eINSTANCE.createMiningTestResult()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 ClassificationFactory.eINSTANCE.createApplyTargetValueItem()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 ClassificationFactory.eINSTANCE.createClassificationAttributeUsage()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 ClassificationFactory.eINSTANCE.createClassificationFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 ClassificationFactory.eINSTANCE.createClassificationTestResult()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 ClassificationFactory.eINSTANCE.createClassificationTestTask()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 ClassificationFactory.eINSTANCE.createPriorProbabilities()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 ClassificationFactory.eINSTANCE.createPriorProbabilitiesEntry()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 ApproximationFactory.eINSTANCE.createApproximationFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 ApproximationFactory.eINSTANCE.createApproximationTestResult()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 ApproximationFactory.eINSTANCE.createApproximationTestTask()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 AttributeImportanceFactory.eINSTANCE.createAttributeImportanceSettings()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 InformationVisualizationFactory.eINSTANCE.createRenderedObject()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 InformationVisualizationFactory.eINSTANCE.createRenderedObjectSet()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 InformationVisualizationFactory.eINSTANCE.createRendering()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 InformationVisualizationFactory.eINSTANCE.createXSLRendering()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 BusinessNomenclatureFactory.eINSTANCE.createVocabularyElement()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 BusinessNomenclatureFactory.eINSTANCE.createNomenclature()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 BusinessNomenclatureFactory.eINSTANCE.createTaxonomy()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 BusinessNomenclatureFactory.eINSTANCE.createGlossary()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 BusinessNomenclatureFactory.eINSTANCE.createBusinessDomain()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 BusinessNomenclatureFactory.eINSTANCE.createConcept()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 BusinessNomenclatureFactory.eINSTANCE.createTerm()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 WarehouseProcessFactory.eINSTANCE.createWarehouseStep()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 WarehouseProcessFactory.eINSTANCE.createProcessPackage()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 WarehouseProcessFactory.eINSTANCE.createWarehouseActivity()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 EventsFactory.eINSTANCE.createPointInTimeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 EventsFactory.eINSTANCE.createCustomCalendarEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 EventsFactory.eINSTANCE.createCustomCalendar()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 EventsFactory.eINSTANCE.createCalendarDate()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 EventsFactory.eINSTANCE.createIntervalEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 EventsFactory.eINSTANCE.createExternalEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 EventsFactory.eINSTANCE.createInternalEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 EventsFactory.eINSTANCE.createCascadeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 EventsFactory.eINSTANCE.createRetryEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 EventsFactory.eINSTANCE.createRecurringPointInTimeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 WarehouseOperationFactory.eINSTANCE.createMeasurement()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 WarehouseOperationFactory.eINSTANCE.createChangeRequest()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 WarehouseOperationFactory.eINSTANCE.createTransformationExecution()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 WarehouseOperationFactory.eINSTANCE.createActivityExecution()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT,
				 WarehouseOperationFactory.eINSTANCE.createStepExecution()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 CoreFactory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 CoreFactory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 CoreFactory.eINSTANCE.createPackage()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 CoreFactory.eINSTANCE.createSubsystem()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 CoreFactory.eINSTANCE.createModel()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 BehavioralFactory.eINSTANCE.createInterface()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 RelationshipsFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 CwmInstanceFactory.eINSTANCE.createExtent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 BusinessInformationFactory.eINSTANCE.createResponsibleParty()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 BusinessInformationFactory.eINSTANCE.createDescription()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 BusinessInformationFactory.eINSTANCE.createDocument()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 DataTypesFactory.eINSTANCE.createEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 DataTypesFactory.eINSTANCE.createTypeAlias()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 DataTypesFactory.eINSTANCE.createUnion()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 SoftwareDeploymentFactory.eINSTANCE.createMachine()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 SoftwareDeploymentFactory.eINSTANCE.createSoftwareSystem()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 SoftwareDeploymentFactory.eINSTANCE.createDeployedComponent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 SoftwareDeploymentFactory.eINSTANCE.createDeployedSoftwareSystem()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 SoftwareDeploymentFactory.eINSTANCE.createDataManager()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 SoftwareDeploymentFactory.eINSTANCE.createDataProvider()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 SoftwareDeploymentFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 TypeMappingFactory.eINSTANCE.createTypeSystem()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 RelationalFactory.eINSTANCE.createCatalog()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 RelationalFactory.eINSTANCE.createSchema()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 RelationalFactory.eINSTANCE.createColumnSet()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 RelationalFactory.eINSTANCE.createNamedColumnSet()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 RelationalFactory.eINSTANCE.createTable()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 RelationalFactory.eINSTANCE.createView()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 RelationalFactory.eINSTANCE.createQueryColumnSet()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 RelationalFactory.eINSTANCE.createSQLDistinctType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 RelationalFactory.eINSTANCE.createSQLSimpleType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 RelationalFactory.eINSTANCE.createSQLStructuredType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 RelationalFactory.eINSTANCE.createRowSet()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 RecordFactory.eINSTANCE.createRecordDef()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 RecordFactory.eINSTANCE.createRecordFile()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 RecordFactory.eINSTANCE.createRecordSet()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 RecordFactory.eINSTANCE.createGroup()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 MultidimensionalFactory.eINSTANCE.createDimension()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 MultidimensionalFactory.eINSTANCE.createMemberSet()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 MultidimensionalFactory.eINSTANCE.createSchema()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 CwmXmlFactory.eINSTANCE.createSchema()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 CwmXmlFactory.eINSTANCE.createElementType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 CwmXmlFactory.eINSTANCE.createDocument()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 CwmTransformationFactory.eINSTANCE.createTransformation()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 CwmTransformationFactory.eINSTANCE.createTransformationTask()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 CwmTransformationFactory.eINSTANCE.createTransformationActivity()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 CwmTransformationFactory.eINSTANCE.createTransformationMap()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 CwmTransformationFactory.eINSTANCE.createTransformationTree()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 CwmTransformationFactory.eINSTANCE.createClassifierMap()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 OlapFactory.eINSTANCE.createContentMap()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 OlapFactory.eINSTANCE.createCube()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 OlapFactory.eINSTANCE.createCubeDeployment()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 OlapFactory.eINSTANCE.createCubeDimensionAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 OlapFactory.eINSTANCE.createCubeRegion()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 OlapFactory.eINSTANCE.createDeploymentGroup()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 OlapFactory.eINSTANCE.createDimension()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 OlapFactory.eINSTANCE.createDimensionDeployment()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 OlapFactory.eINSTANCE.createHierarchyLevelAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 OlapFactory.eINSTANCE.createLevelBasedHierarchy()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 OlapFactory.eINSTANCE.createMemberSelectionGroup()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 OlapFactory.eINSTANCE.createMemberSelection()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 OlapFactory.eINSTANCE.createSchema()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 OlapFactory.eINSTANCE.createValueBasedHierarchy()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 OlapFactory.eINSTANCE.createLevel()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 OlapFactory.eINSTANCE.createCodedLevel()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 OlapFactory.eINSTANCE.createStructureMap()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 OlapFactory.eINSTANCE.createHierarchyMemberSelectionGroup()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 MiningDataFactory.eINSTANCE.createAttributeUsageSet()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 MiningDataFactory.eINSTANCE.createLogicalData()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 MiningModelFactory.eINSTANCE.createModelSignature()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 MiningTaskFactory.eINSTANCE.createMiningTransformation()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 EntryPointFactory.eINSTANCE.createCatalog()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 EntryPointFactory.eINSTANCE.createSchema()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 InformationVisualizationFactory.eINSTANCE.createRenderedObject()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 InformationVisualizationFactory.eINSTANCE.createRenderedObjectSet()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 BusinessNomenclatureFactory.eINSTANCE.createNomenclature()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 BusinessNomenclatureFactory.eINSTANCE.createTaxonomy()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 BusinessNomenclatureFactory.eINSTANCE.createGlossary()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 BusinessNomenclatureFactory.eINSTANCE.createBusinessDomain()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 WarehouseProcessFactory.eINSTANCE.createProcessPackage()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__NAMESPACE,
				 EventsFactory.eINSTANCE.createCustomCalendar()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__CLASSIFIER,
				 CoreFactory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__CLASSIFIER,
				 CoreFactory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__CLASSIFIER,
				 CoreFactory.eINSTANCE.createSubsystem()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__CLASSIFIER,
				 BehavioralFactory.eINSTANCE.createInterface()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__CLASSIFIER,
				 RelationshipsFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__CLASSIFIER,
				 DataTypesFactory.eINSTANCE.createEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__CLASSIFIER,
				 DataTypesFactory.eINSTANCE.createTypeAlias()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__CLASSIFIER,
				 DataTypesFactory.eINSTANCE.createUnion()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__CLASSIFIER,
				 SoftwareDeploymentFactory.eINSTANCE.createSoftwareSystem()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__CLASSIFIER,
				 SoftwareDeploymentFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__CLASSIFIER,
				 RelationalFactory.eINSTANCE.createColumnSet()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__CLASSIFIER,
				 RelationalFactory.eINSTANCE.createNamedColumnSet()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__CLASSIFIER,
				 RelationalFactory.eINSTANCE.createTable()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__CLASSIFIER,
				 RelationalFactory.eINSTANCE.createView()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__CLASSIFIER,
				 RelationalFactory.eINSTANCE.createQueryColumnSet()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__CLASSIFIER,
				 RelationalFactory.eINSTANCE.createSQLDistinctType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__CLASSIFIER,
				 RelationalFactory.eINSTANCE.createSQLSimpleType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__CLASSIFIER,
				 RelationalFactory.eINSTANCE.createSQLStructuredType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__CLASSIFIER,
				 RecordFactory.eINSTANCE.createRecordDef()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__CLASSIFIER,
				 RecordFactory.eINSTANCE.createGroup()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__CLASSIFIER,
				 MultidimensionalFactory.eINSTANCE.createDimension()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__CLASSIFIER,
				 CwmXmlFactory.eINSTANCE.createElementType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__CLASSIFIER,
				 CwmTransformationFactory.eINSTANCE.createTransformationTask()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__CLASSIFIER,
				 CwmTransformationFactory.eINSTANCE.createTransformationActivity()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__CLASSIFIER,
				 OlapFactory.eINSTANCE.createCube()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__CLASSIFIER,
				 OlapFactory.eINSTANCE.createCubeDeployment()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__CLASSIFIER,
				 OlapFactory.eINSTANCE.createCubeDimensionAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__CLASSIFIER,
				 OlapFactory.eINSTANCE.createCubeRegion()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__CLASSIFIER,
				 OlapFactory.eINSTANCE.createDimension()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__CLASSIFIER,
				 OlapFactory.eINSTANCE.createDimensionDeployment()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__CLASSIFIER,
				 OlapFactory.eINSTANCE.createHierarchyLevelAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__CLASSIFIER,
				 OlapFactory.eINSTANCE.createLevelBasedHierarchy()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__CLASSIFIER,
				 OlapFactory.eINSTANCE.createMemberSelectionGroup()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__CLASSIFIER,
				 OlapFactory.eINSTANCE.createMemberSelection()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__CLASSIFIER,
				 OlapFactory.eINSTANCE.createValueBasedHierarchy()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__CLASSIFIER,
				 OlapFactory.eINSTANCE.createLevel()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__CLASSIFIER,
				 OlapFactory.eINSTANCE.createCodedLevel()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__CLASSIFIER,
				 OlapFactory.eINSTANCE.createHierarchyMemberSelectionGroup()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__CLASSIFIER,
				 MiningDataFactory.eINSTANCE.createAttributeUsageSet()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__CLASSIFIER,
				 MiningDataFactory.eINSTANCE.createLogicalData()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__CLASSIFIER,
				 MiningModelFactory.eINSTANCE.createModelSignature()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__CLASSIFIER,
				 InformationVisualizationFactory.eINSTANCE.createRenderedObject()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__CLASS,
				 CoreFactory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__CLASS,
				 RelationshipsFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__CLASS,
				 RelationalFactory.eINSTANCE.createColumnSet()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__CLASS,
				 RelationalFactory.eINSTANCE.createNamedColumnSet()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__CLASS,
				 RelationalFactory.eINSTANCE.createTable()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__CLASS,
				 RelationalFactory.eINSTANCE.createView()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__CLASS,
				 RelationalFactory.eINSTANCE.createQueryColumnSet()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__CLASS,
				 RelationalFactory.eINSTANCE.createSQLStructuredType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__CLASS,
				 RecordFactory.eINSTANCE.createRecordDef()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__CLASS,
				 MultidimensionalFactory.eINSTANCE.createDimension()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__CLASS,
				 CwmXmlFactory.eINSTANCE.createElementType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__CLASS,
				 OlapFactory.eINSTANCE.createCube()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__CLASS,
				 OlapFactory.eINSTANCE.createCubeDeployment()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__CLASS,
				 OlapFactory.eINSTANCE.createCubeDimensionAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__CLASS,
				 OlapFactory.eINSTANCE.createCubeRegion()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__CLASS,
				 OlapFactory.eINSTANCE.createDimension()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__CLASS,
				 OlapFactory.eINSTANCE.createDimensionDeployment()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__CLASS,
				 OlapFactory.eINSTANCE.createHierarchyLevelAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__CLASS,
				 OlapFactory.eINSTANCE.createLevelBasedHierarchy()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__CLASS,
				 OlapFactory.eINSTANCE.createMemberSelectionGroup()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__CLASS,
				 OlapFactory.eINSTANCE.createMemberSelection()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__CLASS,
				 OlapFactory.eINSTANCE.createValueBasedHierarchy()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__CLASS,
				 OlapFactory.eINSTANCE.createLevel()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__CLASS,
				 OlapFactory.eINSTANCE.createCodedLevel()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__CLASS,
				 OlapFactory.eINSTANCE.createHierarchyMemberSelectionGroup()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__CLASS,
				 MiningDataFactory.eINSTANCE.createAttributeUsageSet()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__CLASS,
				 MiningDataFactory.eINSTANCE.createLogicalData()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__CLASS,
				 MiningModelFactory.eINSTANCE.createModelSignature()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__DATA_TYPE,
				 CoreFactory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__DATA_TYPE,
				 DataTypesFactory.eINSTANCE.createEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__DATA_TYPE,
				 DataTypesFactory.eINSTANCE.createTypeAlias()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__DATA_TYPE,
				 RelationalFactory.eINSTANCE.createSQLDistinctType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__DATA_TYPE,
				 RelationalFactory.eINSTANCE.createSQLSimpleType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__PACKAGE,
				 CoreFactory.eINSTANCE.createPackage()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__PACKAGE,
				 CoreFactory.eINSTANCE.createSubsystem()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__PACKAGE,
				 CoreFactory.eINSTANCE.createModel()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__PACKAGE,
				 CwmInstanceFactory.eINSTANCE.createExtent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__PACKAGE,
				 SoftwareDeploymentFactory.eINSTANCE.createSoftwareSystem()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__PACKAGE,
				 SoftwareDeploymentFactory.eINSTANCE.createDeployedComponent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__PACKAGE,
				 SoftwareDeploymentFactory.eINSTANCE.createDeployedSoftwareSystem()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__PACKAGE,
				 SoftwareDeploymentFactory.eINSTANCE.createDataManager()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__PACKAGE,
				 SoftwareDeploymentFactory.eINSTANCE.createDataProvider()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__PACKAGE,
				 TypeMappingFactory.eINSTANCE.createTypeSystem()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__PACKAGE,
				 RelationalFactory.eINSTANCE.createCatalog()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__PACKAGE,
				 RelationalFactory.eINSTANCE.createSchema()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__PACKAGE,
				 RelationalFactory.eINSTANCE.createRowSet()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__PACKAGE,
				 RecordFactory.eINSTANCE.createRecordFile()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__PACKAGE,
				 RecordFactory.eINSTANCE.createRecordSet()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__PACKAGE,
				 MultidimensionalFactory.eINSTANCE.createMemberSet()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__PACKAGE,
				 MultidimensionalFactory.eINSTANCE.createSchema()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__PACKAGE,
				 CwmXmlFactory.eINSTANCE.createSchema()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__PACKAGE,
				 CwmXmlFactory.eINSTANCE.createDocument()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__PACKAGE,
				 CwmTransformationFactory.eINSTANCE.createTransformationActivity()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__PACKAGE,
				 OlapFactory.eINSTANCE.createDeploymentGroup()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__PACKAGE,
				 OlapFactory.eINSTANCE.createSchema()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__PACKAGE,
				 EntryPointFactory.eINSTANCE.createCatalog()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__PACKAGE,
				 InformationVisualizationFactory.eINSTANCE.createRenderedObjectSet()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__PACKAGE,
				 BusinessNomenclatureFactory.eINSTANCE.createNomenclature()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__PACKAGE,
				 BusinessNomenclatureFactory.eINSTANCE.createTaxonomy()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__PACKAGE,
				 BusinessNomenclatureFactory.eINSTANCE.createGlossary()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__PACKAGE,
				 BusinessNomenclatureFactory.eINSTANCE.createBusinessDomain()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__PACKAGE,
				 WarehouseProcessFactory.eINSTANCE.createProcessPackage()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__PACKAGE,
				 EventsFactory.eINSTANCE.createCustomCalendar()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__SUBSYSTEM,
				 CoreFactory.eINSTANCE.createSubsystem()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__SUBSYSTEM,
				 SoftwareDeploymentFactory.eINSTANCE.createSoftwareSystem()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__SUBSYSTEM,
				 CwmTransformationFactory.eINSTANCE.createTransformationActivity()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MODEL,
				 CoreFactory.eINSTANCE.createModel()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__FEATURE,
				 CoreFactory.eINSTANCE.createAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__FEATURE,
				 BehavioralFactory.eINSTANCE.createMethod()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__FEATURE,
				 BehavioralFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__FEATURE,
				 RelationshipsFactory.eINSTANCE.createAssociationEnd()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__FEATURE,
				 DataTypesFactory.eINSTANCE.createUnionMember()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__FEATURE,
				 RelationalFactory.eINSTANCE.createColumn()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__FEATURE,
				 RelationalFactory.eINSTANCE.createProcedure()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__FEATURE,
				 RecordFactory.eINSTANCE.createField()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__FEATURE,
				 RecordFactory.eINSTANCE.createFixedOffsetField()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__FEATURE,
				 MultidimensionalFactory.eINSTANCE.createDimensionedObject()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__FEATURE,
				 CwmXmlFactory.eINSTANCE.createAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__FEATURE,
				 CwmXmlFactory.eINSTANCE.createElementTypeReference()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__FEATURE,
				 CwmXmlFactory.eINSTANCE.createText()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__FEATURE,
				 OlapFactory.eINSTANCE.createMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__FEATURE,
				 MiningDataFactory.eINSTANCE.createAttributeUsage()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__FEATURE,
				 MiningDataFactory.eINSTANCE.createLogicalAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__FEATURE,
				 MiningModelFactory.eINSTANCE.createSignatureAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__FEATURE,
				 MiningTaskFactory.eINSTANCE.createApplyOutputItem()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__FEATURE,
				 MiningTaskFactory.eINSTANCE.createApplyProbabilityItem()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__FEATURE,
				 MiningTaskFactory.eINSTANCE.createApplyRuleIdItem()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__FEATURE,
				 MiningTaskFactory.eINSTANCE.createApplyScoreItem()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__FEATURE,
				 MiningTaskFactory.eINSTANCE.createApplySourceItem()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__FEATURE,
				 ClusteringFactory.eINSTANCE.createClusteringAttributeUsage()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__FEATURE,
				 ClassificationFactory.eINSTANCE.createApplyTargetValueItem()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__FEATURE,
				 ClassificationFactory.eINSTANCE.createClassificationAttributeUsage()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__FEATURE,
				 InformationVisualizationFactory.eINSTANCE.createRendering()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__FEATURE,
				 InformationVisualizationFactory.eINSTANCE.createXSLRendering()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__STRUCTURAL_FEATURE,
				 CoreFactory.eINSTANCE.createAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__STRUCTURAL_FEATURE,
				 RelationshipsFactory.eINSTANCE.createAssociationEnd()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__STRUCTURAL_FEATURE,
				 DataTypesFactory.eINSTANCE.createUnionMember()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__STRUCTURAL_FEATURE,
				 RelationalFactory.eINSTANCE.createColumn()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__STRUCTURAL_FEATURE,
				 RecordFactory.eINSTANCE.createField()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__STRUCTURAL_FEATURE,
				 RecordFactory.eINSTANCE.createFixedOffsetField()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__STRUCTURAL_FEATURE,
				 MultidimensionalFactory.eINSTANCE.createDimensionedObject()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__STRUCTURAL_FEATURE,
				 CwmXmlFactory.eINSTANCE.createAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__STRUCTURAL_FEATURE,
				 CwmXmlFactory.eINSTANCE.createElementTypeReference()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__STRUCTURAL_FEATURE,
				 CwmXmlFactory.eINSTANCE.createText()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__STRUCTURAL_FEATURE,
				 OlapFactory.eINSTANCE.createMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__STRUCTURAL_FEATURE,
				 MiningDataFactory.eINSTANCE.createLogicalAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__STRUCTURAL_FEATURE,
				 MiningModelFactory.eINSTANCE.createSignatureAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__STRUCTURAL_FEATURE,
				 MiningTaskFactory.eINSTANCE.createApplyOutputItem()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__STRUCTURAL_FEATURE,
				 MiningTaskFactory.eINSTANCE.createApplyProbabilityItem()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__STRUCTURAL_FEATURE,
				 MiningTaskFactory.eINSTANCE.createApplyRuleIdItem()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__STRUCTURAL_FEATURE,
				 MiningTaskFactory.eINSTANCE.createApplyScoreItem()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__STRUCTURAL_FEATURE,
				 MiningTaskFactory.eINSTANCE.createApplySourceItem()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__STRUCTURAL_FEATURE,
				 ClassificationFactory.eINSTANCE.createApplyTargetValueItem()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ATTRIBUTE,
				 CoreFactory.eINSTANCE.createAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ATTRIBUTE,
				 DataTypesFactory.eINSTANCE.createUnionMember()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ATTRIBUTE,
				 RelationalFactory.eINSTANCE.createColumn()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ATTRIBUTE,
				 RecordFactory.eINSTANCE.createField()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ATTRIBUTE,
				 RecordFactory.eINSTANCE.createFixedOffsetField()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ATTRIBUTE,
				 MultidimensionalFactory.eINSTANCE.createDimensionedObject()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ATTRIBUTE,
				 CwmXmlFactory.eINSTANCE.createAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ATTRIBUTE,
				 CwmXmlFactory.eINSTANCE.createElementTypeReference()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ATTRIBUTE,
				 CwmXmlFactory.eINSTANCE.createText()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ATTRIBUTE,
				 OlapFactory.eINSTANCE.createMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ATTRIBUTE,
				 MiningDataFactory.eINSTANCE.createLogicalAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ATTRIBUTE,
				 MiningModelFactory.eINSTANCE.createSignatureAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ATTRIBUTE,
				 MiningTaskFactory.eINSTANCE.createApplyOutputItem()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ATTRIBUTE,
				 MiningTaskFactory.eINSTANCE.createApplyProbabilityItem()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ATTRIBUTE,
				 MiningTaskFactory.eINSTANCE.createApplyRuleIdItem()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ATTRIBUTE,
				 MiningTaskFactory.eINSTANCE.createApplyScoreItem()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ATTRIBUTE,
				 MiningTaskFactory.eINSTANCE.createApplySourceItem()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__ATTRIBUTE,
				 ClassificationFactory.eINSTANCE.createApplyTargetValueItem()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__CONSTRAINT,
				 CoreFactory.eINSTANCE.createConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__CONSTRAINT,
				 RelationalFactory.eINSTANCE.createCheckConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__CONSTRAINT,
				 CwmTransformationFactory.eINSTANCE.createPrecedenceConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__DEPENDENCY,
				 CoreFactory.eINSTANCE.createDependency()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__DEPENDENCY,
				 SoftwareDeploymentFactory.eINSTANCE.createPackageUsage()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__DEPENDENCY,
				 CwmTransformationFactory.eINSTANCE.createTransformationUse()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__DEPENDENCY,
				 CwmTransformationFactory.eINSTANCE.createStepPrecedence()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__EXPRESSION,
				 CoreFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__EXPRESSION,
				 CoreFactory.eINSTANCE.createBooleanExpression()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__EXPRESSION,
				 CoreFactory.eINSTANCE.createProcedureExpression()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__EXPRESSION,
				 DataTypesFactory.eINSTANCE.createQueryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__BOOLEAN_EXPRESSION,
				 CoreFactory.eINSTANCE.createBooleanExpression()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__PROCEDURE_EXPRESSION,
				 CoreFactory.eINSTANCE.createProcedureExpression()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__PROCEDURE_EXPRESSION,
				 DataTypesFactory.eINSTANCE.createQueryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MULTIPLICITY,
				 CoreFactory.eINSTANCE.createMultiplicity()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__MULTIPLICITY_RANGE,
				 CoreFactory.eINSTANCE.createMultiplicityRange()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__STEREOTYPE,
				 CoreFactory.eINSTANCE.createStereotype()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.CORE_CONTAINER__TAGGED_VALUE,
				 CoreFactory.eINSTANCE.createTaggedValue()));
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
			childFeature == CorePackage.Literals.CORE_CONTAINER__ELEMENT ||
			childFeature == CorePackage.Literals.CORE_CONTAINER__MODEL_ELEMENT ||
			childFeature == CorePackage.Literals.CORE_CONTAINER__NAMESPACE ||
			childFeature == CorePackage.Literals.CORE_CONTAINER__CLASSIFIER ||
			childFeature == CorePackage.Literals.CORE_CONTAINER__CLASS ||
			childFeature == CorePackage.Literals.CORE_CONTAINER__DATA_TYPE ||
			childFeature == CorePackage.Literals.CORE_CONTAINER__PACKAGE ||
			childFeature == CorePackage.Literals.CORE_CONTAINER__SUBSYSTEM ||
			childFeature == CorePackage.Literals.CORE_CONTAINER__MODEL ||
			childFeature == CorePackage.Literals.CORE_CONTAINER__FEATURE ||
			childFeature == CorePackage.Literals.CORE_CONTAINER__STRUCTURAL_FEATURE ||
			childFeature == CorePackage.Literals.CORE_CONTAINER__ATTRIBUTE ||
			childFeature == CorePackage.Literals.CORE_CONTAINER__CONSTRAINT ||
			childFeature == CorePackage.Literals.CORE_CONTAINER__DEPENDENCY ||
			childFeature == CorePackage.Literals.CORE_CONTAINER__EXPRESSION ||
			childFeature == CorePackage.Literals.CORE_CONTAINER__BOOLEAN_EXPRESSION ||
			childFeature == CorePackage.Literals.CORE_CONTAINER__PROCEDURE_EXPRESSION ||
			childFeature == CorePackage.Literals.CORE_CONTAINER__MULTIPLICITY ||
			childFeature == CorePackage.Literals.CORE_CONTAINER__MULTIPLICITY_RANGE ||
			childFeature == CorePackage.Literals.CORE_CONTAINER__STEREOTYPE ||
			childFeature == CorePackage.Literals.CORE_CONTAINER__TAGGED_VALUE;

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

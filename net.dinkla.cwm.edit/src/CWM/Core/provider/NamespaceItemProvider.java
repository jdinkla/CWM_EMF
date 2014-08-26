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
import CWM.Core.Namespace;

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
 * This is the item provider adapter for a {@link CWM.Core.Namespace} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NamespaceItemProvider
	extends ModelElementItemProvider
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
	public NamespaceItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Namespace)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Namespace_type") :
			getString("_UI_Namespace_type") + " " + label;
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

		switch (notification.getFeatureID(Namespace.class)) {
			case CorePackage.NAMESPACE__OWNED_ELEMENT:
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
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 CoreFactory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 CoreFactory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 CoreFactory.eINSTANCE.createPackage()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 CoreFactory.eINSTANCE.createSubsystem()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 CoreFactory.eINSTANCE.createModel()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 CoreFactory.eINSTANCE.createAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 CoreFactory.eINSTANCE.createConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 CoreFactory.eINSTANCE.createDependency()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 CoreFactory.eINSTANCE.createStereotype()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 BehavioralFactory.eINSTANCE.createArgument()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 BehavioralFactory.eINSTANCE.createCallAction()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 BehavioralFactory.eINSTANCE.createEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 BehavioralFactory.eINSTANCE.createInterface()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 BehavioralFactory.eINSTANCE.createMethod()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 BehavioralFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 BehavioralFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 RelationshipsFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 RelationshipsFactory.eINSTANCE.createAssociationEnd()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 RelationshipsFactory.eINSTANCE.createGeneralization()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 CwmInstanceFactory.eINSTANCE.createSlot()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 CwmInstanceFactory.eINSTANCE.createDataSlot()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 CwmInstanceFactory.eINSTANCE.createDataValue()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 CwmInstanceFactory.eINSTANCE.createExtent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 CwmInstanceFactory.eINSTANCE.createObject()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 BusinessInformationFactory.eINSTANCE.createResponsibleParty()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 BusinessInformationFactory.eINSTANCE.createTelephone()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 BusinessInformationFactory.eINSTANCE.createEmail()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 BusinessInformationFactory.eINSTANCE.createLocation()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 BusinessInformationFactory.eINSTANCE.createContact()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 BusinessInformationFactory.eINSTANCE.createDescription()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 BusinessInformationFactory.eINSTANCE.createDocument()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 BusinessInformationFactory.eINSTANCE.createResourceLocator()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 DataTypesFactory.eINSTANCE.createEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 DataTypesFactory.eINSTANCE.createEnumerationLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 DataTypesFactory.eINSTANCE.createTypeAlias()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 DataTypesFactory.eINSTANCE.createUnion()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 DataTypesFactory.eINSTANCE.createUnionMember()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 KeysIndexesFactory.eINSTANCE.createUniqueKey()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 KeysIndexesFactory.eINSTANCE.createIndex()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 KeysIndexesFactory.eINSTANCE.createKeyRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 KeysIndexesFactory.eINSTANCE.createIndexedFeature()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 SoftwareDeploymentFactory.eINSTANCE.createSite()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 SoftwareDeploymentFactory.eINSTANCE.createMachine()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 SoftwareDeploymentFactory.eINSTANCE.createSoftwareSystem()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 SoftwareDeploymentFactory.eINSTANCE.createDeployedComponent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 SoftwareDeploymentFactory.eINSTANCE.createDeployedSoftwareSystem()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 SoftwareDeploymentFactory.eINSTANCE.createDataManager()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 SoftwareDeploymentFactory.eINSTANCE.createDataProvider()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 SoftwareDeploymentFactory.eINSTANCE.createProviderConnection()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 SoftwareDeploymentFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 SoftwareDeploymentFactory.eINSTANCE.createPackageUsage()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 TypeMappingFactory.eINSTANCE.createTypeMapping()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 TypeMappingFactory.eINSTANCE.createTypeSystem()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 RelationalFactory.eINSTANCE.createCatalog()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 RelationalFactory.eINSTANCE.createSchema()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 RelationalFactory.eINSTANCE.createColumnSet()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 RelationalFactory.eINSTANCE.createNamedColumnSet()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 RelationalFactory.eINSTANCE.createTable()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 RelationalFactory.eINSTANCE.createView()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 RelationalFactory.eINSTANCE.createQueryColumnSet()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 RelationalFactory.eINSTANCE.createSQLDistinctType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 RelationalFactory.eINSTANCE.createSQLSimpleType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 RelationalFactory.eINSTANCE.createSQLStructuredType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 RelationalFactory.eINSTANCE.createColumn()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 RelationalFactory.eINSTANCE.createProcedure()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 RelationalFactory.eINSTANCE.createTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 RelationalFactory.eINSTANCE.createSQLIndex()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 RelationalFactory.eINSTANCE.createUniqueConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 RelationalFactory.eINSTANCE.createForeignKey()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 RelationalFactory.eINSTANCE.createSQLIndexColumn()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 RelationalFactory.eINSTANCE.createPrimaryKey()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 RelationalFactory.eINSTANCE.createRow()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 RelationalFactory.eINSTANCE.createColumnValue()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 RelationalFactory.eINSTANCE.createCheckConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 RelationalFactory.eINSTANCE.createRowSet()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 RelationalFactory.eINSTANCE.createSQLParameter()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 RecordFactory.eINSTANCE.createField()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 RecordFactory.eINSTANCE.createRecordDef()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 RecordFactory.eINSTANCE.createFixedOffsetField()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 RecordFactory.eINSTANCE.createRecordFile()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 RecordFactory.eINSTANCE.createFieldValue()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 RecordFactory.eINSTANCE.createRecord()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 RecordFactory.eINSTANCE.createRecordSet()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 RecordFactory.eINSTANCE.createGroup()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 MultidimensionalFactory.eINSTANCE.createDimension()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 MultidimensionalFactory.eINSTANCE.createDimensionedObject()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 MultidimensionalFactory.eINSTANCE.createMember()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 MultidimensionalFactory.eINSTANCE.createMemberSet()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 MultidimensionalFactory.eINSTANCE.createMemberValue()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 MultidimensionalFactory.eINSTANCE.createSchema()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 CwmXmlFactory.eINSTANCE.createSchema()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 CwmXmlFactory.eINSTANCE.createElementType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 CwmXmlFactory.eINSTANCE.createAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 CwmXmlFactory.eINSTANCE.createContent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 CwmXmlFactory.eINSTANCE.createElementContent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 CwmXmlFactory.eINSTANCE.createMixedContent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 CwmXmlFactory.eINSTANCE.createElementTypeReference()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 CwmXmlFactory.eINSTANCE.createText()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 CwmXmlFactory.eINSTANCE.createElement()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 CwmXmlFactory.eINSTANCE.createDocument()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 CwmTransformationFactory.eINSTANCE.createTransformation()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 CwmTransformationFactory.eINSTANCE.createDataObjectSet()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 CwmTransformationFactory.eINSTANCE.createTransformationTask()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 CwmTransformationFactory.eINSTANCE.createTransformationStep()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 CwmTransformationFactory.eINSTANCE.createTransformationActivity()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 CwmTransformationFactory.eINSTANCE.createPrecedenceConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 CwmTransformationFactory.eINSTANCE.createTransformationUse()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 CwmTransformationFactory.eINSTANCE.createTransformationMap()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 CwmTransformationFactory.eINSTANCE.createTransformationTree()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 CwmTransformationFactory.eINSTANCE.createClassifierMap()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 CwmTransformationFactory.eINSTANCE.createFeatureMap()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 CwmTransformationFactory.eINSTANCE.createStepPrecedence()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 CwmTransformationFactory.eINSTANCE.createClassifierFeatureMap()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 OlapFactory.eINSTANCE.createContentMap()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 OlapFactory.eINSTANCE.createCube()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 OlapFactory.eINSTANCE.createCubeDeployment()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 OlapFactory.eINSTANCE.createCubeDimensionAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 OlapFactory.eINSTANCE.createCubeRegion()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 OlapFactory.eINSTANCE.createDeploymentGroup()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 OlapFactory.eINSTANCE.createDimension()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 OlapFactory.eINSTANCE.createDimensionDeployment()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 OlapFactory.eINSTANCE.createHierarchyLevelAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 OlapFactory.eINSTANCE.createLevelBasedHierarchy()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 OlapFactory.eINSTANCE.createMemberSelectionGroup()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 OlapFactory.eINSTANCE.createMemberSelection()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 OlapFactory.eINSTANCE.createSchema()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 OlapFactory.eINSTANCE.createValueBasedHierarchy()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 OlapFactory.eINSTANCE.createLevel()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 OlapFactory.eINSTANCE.createCodedLevel()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 OlapFactory.eINSTANCE.createMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 OlapFactory.eINSTANCE.createStructureMap()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 OlapFactory.eINSTANCE.createHierarchyMemberSelectionGroup()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 MiningDataFactory.eINSTANCE.createAttributeAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 MiningDataFactory.eINSTANCE.createAttributeAssignmentSet()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 MiningDataFactory.eINSTANCE.createAttributeUsage()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 MiningDataFactory.eINSTANCE.createAttributeUsageSet()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 MiningDataFactory.eINSTANCE.createCategoricalAttributeProperties()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 MiningDataFactory.eINSTANCE.createDirectAttributeAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 MiningDataFactory.eINSTANCE.createLogicalAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 MiningDataFactory.eINSTANCE.createLogicalData()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 MiningDataFactory.eINSTANCE.createNumericalAttributeProperties()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 MiningDataFactory.eINSTANCE.createOrdinalAttributeProperties()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 MiningDataFactory.eINSTANCE.createPhysicalData()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 MiningDataFactory.eINSTANCE.createPivotAttributeAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 MiningDataFactory.eINSTANCE.createReversePivotAttributeAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 MiningDataFactory.eINSTANCE.createSetAttributeAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 MiningDataFactory.eINSTANCE.createCategory()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 MiningDataFactory.eINSTANCE.createCategoryMap()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 MiningDataFactory.eINSTANCE.createCategoryMapObject()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 MiningDataFactory.eINSTANCE.createCategoryMapObjectEntry()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 MiningDataFactory.eINSTANCE.createCategoryMapTable()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 MiningDataFactory.eINSTANCE.createCategoryMatrix()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 MiningDataFactory.eINSTANCE.createCategoryMatrixEntry()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 MiningDataFactory.eINSTANCE.createCategoryMatrixObject()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 MiningDataFactory.eINSTANCE.createCategoryMatrixTable()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 MiningDataFactory.eINSTANCE.createCategoryTaxonomy()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 MiningModelFactory.eINSTANCE.createMiningModel()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 MiningModelFactory.eINSTANCE.createModelSignature()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 MiningModelFactory.eINSTANCE.createSignatureAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 MiningTaskFactory.eINSTANCE.createApplyOutputItem()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 MiningTaskFactory.eINSTANCE.createApplyProbabilityItem()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 MiningTaskFactory.eINSTANCE.createApplyRuleIdItem()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 MiningTaskFactory.eINSTANCE.createApplyScoreItem()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 MiningTaskFactory.eINSTANCE.createApplySourceItem()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 MiningTaskFactory.eINSTANCE.createMiningApplyOutput()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 MiningTaskFactory.eINSTANCE.createMiningApplyTask()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 MiningTaskFactory.eINSTANCE.createMiningBuildTask()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 MiningTaskFactory.eINSTANCE.createMiningTransformation()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 EntryPointFactory.eINSTANCE.createAuxiliaryObject()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 EntryPointFactory.eINSTANCE.createCatalog()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 EntryPointFactory.eINSTANCE.createSchema()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 ClusteringFactory.eINSTANCE.createClusteringAttributeUsage()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 ClusteringFactory.eINSTANCE.createClusteringFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 AssociationRulesFactory.eINSTANCE.createFrequentItemSetFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 AssociationRulesFactory.eINSTANCE.createAssociationRulesFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 AssociationRulesFactory.eINSTANCE.createSequenceFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 SupervisedFactory.eINSTANCE.createLiftAnalysisPoint()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 SupervisedFactory.eINSTANCE.createLiftAnalysis()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 SupervisedFactory.eINSTANCE.createMiningTestTask()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 SupervisedFactory.eINSTANCE.createSupervisedFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 SupervisedFactory.eINSTANCE.createMiningTestResult()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 ClassificationFactory.eINSTANCE.createApplyTargetValueItem()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 ClassificationFactory.eINSTANCE.createClassificationAttributeUsage()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 ClassificationFactory.eINSTANCE.createClassificationFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 ClassificationFactory.eINSTANCE.createClassificationTestResult()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 ClassificationFactory.eINSTANCE.createClassificationTestTask()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 ClassificationFactory.eINSTANCE.createPriorProbabilities()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 ClassificationFactory.eINSTANCE.createPriorProbabilitiesEntry()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 ApproximationFactory.eINSTANCE.createApproximationFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 ApproximationFactory.eINSTANCE.createApproximationTestResult()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 ApproximationFactory.eINSTANCE.createApproximationTestTask()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 AttributeImportanceFactory.eINSTANCE.createAttributeImportanceSettings()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 InformationVisualizationFactory.eINSTANCE.createRenderedObject()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 InformationVisualizationFactory.eINSTANCE.createRenderedObjectSet()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 InformationVisualizationFactory.eINSTANCE.createRendering()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 InformationVisualizationFactory.eINSTANCE.createXSLRendering()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 BusinessNomenclatureFactory.eINSTANCE.createVocabularyElement()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 BusinessNomenclatureFactory.eINSTANCE.createNomenclature()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 BusinessNomenclatureFactory.eINSTANCE.createTaxonomy()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 BusinessNomenclatureFactory.eINSTANCE.createGlossary()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 BusinessNomenclatureFactory.eINSTANCE.createBusinessDomain()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 BusinessNomenclatureFactory.eINSTANCE.createConcept()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 BusinessNomenclatureFactory.eINSTANCE.createTerm()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 WarehouseProcessFactory.eINSTANCE.createWarehouseStep()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 WarehouseProcessFactory.eINSTANCE.createProcessPackage()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 WarehouseProcessFactory.eINSTANCE.createWarehouseActivity()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 EventsFactory.eINSTANCE.createPointInTimeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 EventsFactory.eINSTANCE.createCustomCalendarEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 EventsFactory.eINSTANCE.createCustomCalendar()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 EventsFactory.eINSTANCE.createCalendarDate()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 EventsFactory.eINSTANCE.createIntervalEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 EventsFactory.eINSTANCE.createExternalEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 EventsFactory.eINSTANCE.createInternalEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 EventsFactory.eINSTANCE.createCascadeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 EventsFactory.eINSTANCE.createRetryEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 EventsFactory.eINSTANCE.createRecurringPointInTimeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 WarehouseOperationFactory.eINSTANCE.createMeasurement()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 WarehouseOperationFactory.eINSTANCE.createChangeRequest()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 WarehouseOperationFactory.eINSTANCE.createTransformationExecution()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 WarehouseOperationFactory.eINSTANCE.createActivityExecution()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
				 WarehouseOperationFactory.eINSTANCE.createStepExecution()));
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

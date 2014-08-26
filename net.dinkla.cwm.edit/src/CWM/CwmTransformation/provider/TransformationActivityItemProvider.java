/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.CwmTransformation.provider;


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

import CWM.Core.provider.SubsystemItemProvider;

import CWM.CwmInstance.CwmInstanceFactory;

import CWM.CwmTransformation.CwmTransformationFactory;
import CWM.CwmTransformation.CwmTransformationPackage;
import CWM.CwmTransformation.TransformationActivity;

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
 * This is the item provider adapter for a {@link CWM.CwmTransformation.TransformationActivity} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TransformationActivityItemProvider
	extends SubsystemItemProvider
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
	public TransformationActivityItemProvider(AdapterFactory adapterFactory) {
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

			addCreationDatePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Creation Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCreationDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TransformationActivity_creationDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TransformationActivity_creationDate_feature", "_UI_TransformationActivity_type"),
				 CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__CREATION_DATE,
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
			childrenFeatures.add(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP);
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
	 * This returns TransformationActivity.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TransformationActivity"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TransformationActivity)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_TransformationActivity_type") :
			getString("_UI_TransformationActivity_type") + " " + label;
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

		switch (notification.getFeatureID(TransformationActivity.class)) {
			case CwmTransformationPackage.TRANSFORMATION_ACTIVITY__CREATION_DATE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CwmTransformationPackage.TRANSFORMATION_ACTIVITY__STEP:
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
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 CwmTransformationFactory.eINSTANCE.createTransformation()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 CwmTransformationFactory.eINSTANCE.createDataObjectSet()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 CwmTransformationFactory.eINSTANCE.createTransformationTask()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 CwmTransformationFactory.eINSTANCE.createTransformationStep()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 CwmTransformationFactory.eINSTANCE.createTransformationActivity()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 CwmTransformationFactory.eINSTANCE.createPrecedenceConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 CwmTransformationFactory.eINSTANCE.createTransformationUse()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 CwmTransformationFactory.eINSTANCE.createTransformationMap()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 CwmTransformationFactory.eINSTANCE.createTransformationTree()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 CwmTransformationFactory.eINSTANCE.createClassifierMap()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 CwmTransformationFactory.eINSTANCE.createFeatureMap()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 CwmTransformationFactory.eINSTANCE.createStepPrecedence()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 CwmTransformationFactory.eINSTANCE.createClassifierFeatureMap()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 CoreFactory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 CoreFactory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 CoreFactory.eINSTANCE.createPackage()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 CoreFactory.eINSTANCE.createSubsystem()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 CoreFactory.eINSTANCE.createModel()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 CoreFactory.eINSTANCE.createAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 CoreFactory.eINSTANCE.createConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 CoreFactory.eINSTANCE.createDependency()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 CoreFactory.eINSTANCE.createStereotype()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 BehavioralFactory.eINSTANCE.createArgument()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 BehavioralFactory.eINSTANCE.createCallAction()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 BehavioralFactory.eINSTANCE.createEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 BehavioralFactory.eINSTANCE.createInterface()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 BehavioralFactory.eINSTANCE.createMethod()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 BehavioralFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 BehavioralFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 RelationshipsFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 RelationshipsFactory.eINSTANCE.createAssociationEnd()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 RelationshipsFactory.eINSTANCE.createGeneralization()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 CwmInstanceFactory.eINSTANCE.createSlot()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 CwmInstanceFactory.eINSTANCE.createDataSlot()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 CwmInstanceFactory.eINSTANCE.createDataValue()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 CwmInstanceFactory.eINSTANCE.createExtent()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 CwmInstanceFactory.eINSTANCE.createObject()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 BusinessInformationFactory.eINSTANCE.createResponsibleParty()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 BusinessInformationFactory.eINSTANCE.createTelephone()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 BusinessInformationFactory.eINSTANCE.createEmail()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 BusinessInformationFactory.eINSTANCE.createLocation()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 BusinessInformationFactory.eINSTANCE.createContact()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 BusinessInformationFactory.eINSTANCE.createDescription()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 BusinessInformationFactory.eINSTANCE.createDocument()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 BusinessInformationFactory.eINSTANCE.createResourceLocator()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 DataTypesFactory.eINSTANCE.createEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 DataTypesFactory.eINSTANCE.createEnumerationLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 DataTypesFactory.eINSTANCE.createTypeAlias()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 DataTypesFactory.eINSTANCE.createUnion()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 DataTypesFactory.eINSTANCE.createUnionMember()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 KeysIndexesFactory.eINSTANCE.createUniqueKey()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 KeysIndexesFactory.eINSTANCE.createIndex()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 KeysIndexesFactory.eINSTANCE.createKeyRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 KeysIndexesFactory.eINSTANCE.createIndexedFeature()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 SoftwareDeploymentFactory.eINSTANCE.createSite()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 SoftwareDeploymentFactory.eINSTANCE.createMachine()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 SoftwareDeploymentFactory.eINSTANCE.createSoftwareSystem()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 SoftwareDeploymentFactory.eINSTANCE.createDeployedComponent()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 SoftwareDeploymentFactory.eINSTANCE.createDeployedSoftwareSystem()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 SoftwareDeploymentFactory.eINSTANCE.createDataManager()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 SoftwareDeploymentFactory.eINSTANCE.createDataProvider()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 SoftwareDeploymentFactory.eINSTANCE.createProviderConnection()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 SoftwareDeploymentFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 SoftwareDeploymentFactory.eINSTANCE.createPackageUsage()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 TypeMappingFactory.eINSTANCE.createTypeMapping()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 TypeMappingFactory.eINSTANCE.createTypeSystem()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 RelationalFactory.eINSTANCE.createCatalog()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 RelationalFactory.eINSTANCE.createSchema()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 RelationalFactory.eINSTANCE.createColumnSet()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 RelationalFactory.eINSTANCE.createNamedColumnSet()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 RelationalFactory.eINSTANCE.createTable()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 RelationalFactory.eINSTANCE.createView()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 RelationalFactory.eINSTANCE.createQueryColumnSet()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 RelationalFactory.eINSTANCE.createSQLDistinctType()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 RelationalFactory.eINSTANCE.createSQLSimpleType()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 RelationalFactory.eINSTANCE.createSQLStructuredType()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 RelationalFactory.eINSTANCE.createColumn()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 RelationalFactory.eINSTANCE.createProcedure()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 RelationalFactory.eINSTANCE.createTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 RelationalFactory.eINSTANCE.createSQLIndex()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 RelationalFactory.eINSTANCE.createUniqueConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 RelationalFactory.eINSTANCE.createForeignKey()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 RelationalFactory.eINSTANCE.createSQLIndexColumn()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 RelationalFactory.eINSTANCE.createPrimaryKey()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 RelationalFactory.eINSTANCE.createRow()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 RelationalFactory.eINSTANCE.createColumnValue()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 RelationalFactory.eINSTANCE.createCheckConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 RelationalFactory.eINSTANCE.createRowSet()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 RelationalFactory.eINSTANCE.createSQLParameter()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 RecordFactory.eINSTANCE.createField()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 RecordFactory.eINSTANCE.createRecordDef()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 RecordFactory.eINSTANCE.createFixedOffsetField()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 RecordFactory.eINSTANCE.createRecordFile()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 RecordFactory.eINSTANCE.createFieldValue()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 RecordFactory.eINSTANCE.createRecord()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 RecordFactory.eINSTANCE.createRecordSet()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 RecordFactory.eINSTANCE.createGroup()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 MultidimensionalFactory.eINSTANCE.createDimension()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 MultidimensionalFactory.eINSTANCE.createDimensionedObject()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 MultidimensionalFactory.eINSTANCE.createMember()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 MultidimensionalFactory.eINSTANCE.createMemberSet()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 MultidimensionalFactory.eINSTANCE.createMemberValue()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 MultidimensionalFactory.eINSTANCE.createSchema()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 CwmXmlFactory.eINSTANCE.createSchema()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 CwmXmlFactory.eINSTANCE.createElementType()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 CwmXmlFactory.eINSTANCE.createAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 CwmXmlFactory.eINSTANCE.createContent()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 CwmXmlFactory.eINSTANCE.createElementContent()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 CwmXmlFactory.eINSTANCE.createMixedContent()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 CwmXmlFactory.eINSTANCE.createElementTypeReference()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 CwmXmlFactory.eINSTANCE.createText()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 CwmXmlFactory.eINSTANCE.createElement()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 CwmXmlFactory.eINSTANCE.createDocument()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 OlapFactory.eINSTANCE.createContentMap()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 OlapFactory.eINSTANCE.createCube()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 OlapFactory.eINSTANCE.createCubeDeployment()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 OlapFactory.eINSTANCE.createCubeDimensionAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 OlapFactory.eINSTANCE.createCubeRegion()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 OlapFactory.eINSTANCE.createDeploymentGroup()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 OlapFactory.eINSTANCE.createDimension()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 OlapFactory.eINSTANCE.createDimensionDeployment()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 OlapFactory.eINSTANCE.createHierarchyLevelAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 OlapFactory.eINSTANCE.createLevelBasedHierarchy()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 OlapFactory.eINSTANCE.createMemberSelectionGroup()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 OlapFactory.eINSTANCE.createMemberSelection()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 OlapFactory.eINSTANCE.createSchema()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 OlapFactory.eINSTANCE.createValueBasedHierarchy()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 OlapFactory.eINSTANCE.createLevel()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 OlapFactory.eINSTANCE.createCodedLevel()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 OlapFactory.eINSTANCE.createMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 OlapFactory.eINSTANCE.createStructureMap()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 OlapFactory.eINSTANCE.createHierarchyMemberSelectionGroup()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 MiningDataFactory.eINSTANCE.createAttributeAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 MiningDataFactory.eINSTANCE.createAttributeAssignmentSet()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 MiningDataFactory.eINSTANCE.createAttributeUsage()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 MiningDataFactory.eINSTANCE.createAttributeUsageSet()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 MiningDataFactory.eINSTANCE.createCategoricalAttributeProperties()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 MiningDataFactory.eINSTANCE.createDirectAttributeAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 MiningDataFactory.eINSTANCE.createLogicalAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 MiningDataFactory.eINSTANCE.createLogicalData()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 MiningDataFactory.eINSTANCE.createNumericalAttributeProperties()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 MiningDataFactory.eINSTANCE.createOrdinalAttributeProperties()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 MiningDataFactory.eINSTANCE.createPhysicalData()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 MiningDataFactory.eINSTANCE.createPivotAttributeAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 MiningDataFactory.eINSTANCE.createReversePivotAttributeAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 MiningDataFactory.eINSTANCE.createSetAttributeAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 MiningDataFactory.eINSTANCE.createCategory()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 MiningDataFactory.eINSTANCE.createCategoryMap()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 MiningDataFactory.eINSTANCE.createCategoryMapObject()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 MiningDataFactory.eINSTANCE.createCategoryMapObjectEntry()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 MiningDataFactory.eINSTANCE.createCategoryMapTable()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 MiningDataFactory.eINSTANCE.createCategoryMatrix()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 MiningDataFactory.eINSTANCE.createCategoryMatrixEntry()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 MiningDataFactory.eINSTANCE.createCategoryMatrixObject()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 MiningDataFactory.eINSTANCE.createCategoryMatrixTable()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 MiningDataFactory.eINSTANCE.createCategoryTaxonomy()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 MiningModelFactory.eINSTANCE.createMiningModel()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 MiningModelFactory.eINSTANCE.createModelSignature()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 MiningModelFactory.eINSTANCE.createSignatureAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 MiningTaskFactory.eINSTANCE.createApplyOutputItem()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 MiningTaskFactory.eINSTANCE.createApplyProbabilityItem()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 MiningTaskFactory.eINSTANCE.createApplyRuleIdItem()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 MiningTaskFactory.eINSTANCE.createApplyScoreItem()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 MiningTaskFactory.eINSTANCE.createApplySourceItem()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 MiningTaskFactory.eINSTANCE.createMiningApplyOutput()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 MiningTaskFactory.eINSTANCE.createMiningApplyTask()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 MiningTaskFactory.eINSTANCE.createMiningBuildTask()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 MiningTaskFactory.eINSTANCE.createMiningTransformation()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 EntryPointFactory.eINSTANCE.createAuxiliaryObject()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 EntryPointFactory.eINSTANCE.createCatalog()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 EntryPointFactory.eINSTANCE.createSchema()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 ClusteringFactory.eINSTANCE.createClusteringAttributeUsage()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 ClusteringFactory.eINSTANCE.createClusteringFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 AssociationRulesFactory.eINSTANCE.createFrequentItemSetFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 AssociationRulesFactory.eINSTANCE.createAssociationRulesFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 AssociationRulesFactory.eINSTANCE.createSequenceFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 SupervisedFactory.eINSTANCE.createLiftAnalysisPoint()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 SupervisedFactory.eINSTANCE.createLiftAnalysis()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 SupervisedFactory.eINSTANCE.createMiningTestTask()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 SupervisedFactory.eINSTANCE.createSupervisedFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 SupervisedFactory.eINSTANCE.createMiningTestResult()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 ClassificationFactory.eINSTANCE.createApplyTargetValueItem()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 ClassificationFactory.eINSTANCE.createClassificationAttributeUsage()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 ClassificationFactory.eINSTANCE.createClassificationFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 ClassificationFactory.eINSTANCE.createClassificationTestResult()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 ClassificationFactory.eINSTANCE.createClassificationTestTask()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 ClassificationFactory.eINSTANCE.createPriorProbabilities()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 ClassificationFactory.eINSTANCE.createPriorProbabilitiesEntry()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 ApproximationFactory.eINSTANCE.createApproximationFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 ApproximationFactory.eINSTANCE.createApproximationTestResult()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 ApproximationFactory.eINSTANCE.createApproximationTestTask()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 AttributeImportanceFactory.eINSTANCE.createAttributeImportanceSettings()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 InformationVisualizationFactory.eINSTANCE.createRenderedObject()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 InformationVisualizationFactory.eINSTANCE.createRenderedObjectSet()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 InformationVisualizationFactory.eINSTANCE.createRendering()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 InformationVisualizationFactory.eINSTANCE.createXSLRendering()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 BusinessNomenclatureFactory.eINSTANCE.createVocabularyElement()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 BusinessNomenclatureFactory.eINSTANCE.createNomenclature()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 BusinessNomenclatureFactory.eINSTANCE.createTaxonomy()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 BusinessNomenclatureFactory.eINSTANCE.createGlossary()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 BusinessNomenclatureFactory.eINSTANCE.createBusinessDomain()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 BusinessNomenclatureFactory.eINSTANCE.createConcept()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 BusinessNomenclatureFactory.eINSTANCE.createTerm()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 WarehouseProcessFactory.eINSTANCE.createWarehouseStep()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 WarehouseProcessFactory.eINSTANCE.createProcessPackage()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 WarehouseProcessFactory.eINSTANCE.createWarehouseActivity()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 EventsFactory.eINSTANCE.createPointInTimeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 EventsFactory.eINSTANCE.createCustomCalendarEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 EventsFactory.eINSTANCE.createCustomCalendar()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 EventsFactory.eINSTANCE.createCalendarDate()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 EventsFactory.eINSTANCE.createIntervalEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 EventsFactory.eINSTANCE.createExternalEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 EventsFactory.eINSTANCE.createInternalEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 EventsFactory.eINSTANCE.createCascadeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 EventsFactory.eINSTANCE.createRetryEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 EventsFactory.eINSTANCE.createRecurringPointInTimeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 WarehouseOperationFactory.eINSTANCE.createMeasurement()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 WarehouseOperationFactory.eINSTANCE.createChangeRequest()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 WarehouseOperationFactory.eINSTANCE.createTransformationExecution()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
				 WarehouseOperationFactory.eINSTANCE.createActivityExecution()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP,
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
			childFeature == CwmTransformationPackage.Literals.TRANSFORMATION_ACTIVITY__STEP ||
			childFeature == CorePackage.Literals.CLASSIFIER__FEATURE;

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

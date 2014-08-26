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

import CWM.CwmInstance.CwmInstanceFactory;

import CWM.CwmTransformation.CwmTransformationFactory;
import CWM.CwmTransformation.CwmTransformationPackage;
import CWM.CwmTransformation.TransformationMap;

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
 * This is the item provider adapter for a {@link CWM.CwmTransformation.TransformationMap} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TransformationMapItemProvider
	extends TransformationItemProvider
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
	public TransformationMapItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP);
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
	 * This returns TransformationMap.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TransformationMap"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TransformationMap)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_TransformationMap_type") :
			getString("_UI_TransformationMap_type") + " " + label;
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

		switch (notification.getFeatureID(TransformationMap.class)) {
			case CwmTransformationPackage.TRANSFORMATION_MAP__CLASSIFIER_MAP:
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
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 CwmTransformationFactory.eINSTANCE.createTransformation()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 CwmTransformationFactory.eINSTANCE.createDataObjectSet()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 CwmTransformationFactory.eINSTANCE.createTransformationTask()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 CwmTransformationFactory.eINSTANCE.createTransformationStep()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 CwmTransformationFactory.eINSTANCE.createTransformationActivity()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 CwmTransformationFactory.eINSTANCE.createPrecedenceConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 CwmTransformationFactory.eINSTANCE.createTransformationUse()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 CwmTransformationFactory.eINSTANCE.createTransformationMap()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 CwmTransformationFactory.eINSTANCE.createTransformationTree()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 CwmTransformationFactory.eINSTANCE.createClassifierMap()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 CwmTransformationFactory.eINSTANCE.createFeatureMap()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 CwmTransformationFactory.eINSTANCE.createStepPrecedence()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 CwmTransformationFactory.eINSTANCE.createClassifierFeatureMap()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 CoreFactory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 CoreFactory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 CoreFactory.eINSTANCE.createPackage()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 CoreFactory.eINSTANCE.createSubsystem()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 CoreFactory.eINSTANCE.createModel()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 CoreFactory.eINSTANCE.createAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 CoreFactory.eINSTANCE.createConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 CoreFactory.eINSTANCE.createDependency()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 CoreFactory.eINSTANCE.createStereotype()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 BehavioralFactory.eINSTANCE.createArgument()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 BehavioralFactory.eINSTANCE.createCallAction()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 BehavioralFactory.eINSTANCE.createEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 BehavioralFactory.eINSTANCE.createInterface()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 BehavioralFactory.eINSTANCE.createMethod()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 BehavioralFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 BehavioralFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 RelationshipsFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 RelationshipsFactory.eINSTANCE.createAssociationEnd()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 RelationshipsFactory.eINSTANCE.createGeneralization()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 CwmInstanceFactory.eINSTANCE.createSlot()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 CwmInstanceFactory.eINSTANCE.createDataSlot()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 CwmInstanceFactory.eINSTANCE.createDataValue()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 CwmInstanceFactory.eINSTANCE.createExtent()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 CwmInstanceFactory.eINSTANCE.createObject()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 BusinessInformationFactory.eINSTANCE.createResponsibleParty()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 BusinessInformationFactory.eINSTANCE.createTelephone()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 BusinessInformationFactory.eINSTANCE.createEmail()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 BusinessInformationFactory.eINSTANCE.createLocation()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 BusinessInformationFactory.eINSTANCE.createContact()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 BusinessInformationFactory.eINSTANCE.createDescription()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 BusinessInformationFactory.eINSTANCE.createDocument()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 BusinessInformationFactory.eINSTANCE.createResourceLocator()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 DataTypesFactory.eINSTANCE.createEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 DataTypesFactory.eINSTANCE.createEnumerationLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 DataTypesFactory.eINSTANCE.createTypeAlias()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 DataTypesFactory.eINSTANCE.createUnion()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 DataTypesFactory.eINSTANCE.createUnionMember()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 KeysIndexesFactory.eINSTANCE.createUniqueKey()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 KeysIndexesFactory.eINSTANCE.createIndex()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 KeysIndexesFactory.eINSTANCE.createKeyRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 KeysIndexesFactory.eINSTANCE.createIndexedFeature()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 SoftwareDeploymentFactory.eINSTANCE.createSite()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 SoftwareDeploymentFactory.eINSTANCE.createMachine()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 SoftwareDeploymentFactory.eINSTANCE.createSoftwareSystem()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 SoftwareDeploymentFactory.eINSTANCE.createDeployedComponent()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 SoftwareDeploymentFactory.eINSTANCE.createDeployedSoftwareSystem()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 SoftwareDeploymentFactory.eINSTANCE.createDataManager()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 SoftwareDeploymentFactory.eINSTANCE.createDataProvider()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 SoftwareDeploymentFactory.eINSTANCE.createProviderConnection()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 SoftwareDeploymentFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 SoftwareDeploymentFactory.eINSTANCE.createPackageUsage()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 TypeMappingFactory.eINSTANCE.createTypeMapping()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 TypeMappingFactory.eINSTANCE.createTypeSystem()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 RelationalFactory.eINSTANCE.createCatalog()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 RelationalFactory.eINSTANCE.createSchema()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 RelationalFactory.eINSTANCE.createColumnSet()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 RelationalFactory.eINSTANCE.createNamedColumnSet()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 RelationalFactory.eINSTANCE.createTable()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 RelationalFactory.eINSTANCE.createView()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 RelationalFactory.eINSTANCE.createQueryColumnSet()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 RelationalFactory.eINSTANCE.createSQLDistinctType()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 RelationalFactory.eINSTANCE.createSQLSimpleType()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 RelationalFactory.eINSTANCE.createSQLStructuredType()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 RelationalFactory.eINSTANCE.createColumn()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 RelationalFactory.eINSTANCE.createProcedure()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 RelationalFactory.eINSTANCE.createTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 RelationalFactory.eINSTANCE.createSQLIndex()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 RelationalFactory.eINSTANCE.createUniqueConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 RelationalFactory.eINSTANCE.createForeignKey()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 RelationalFactory.eINSTANCE.createSQLIndexColumn()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 RelationalFactory.eINSTANCE.createPrimaryKey()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 RelationalFactory.eINSTANCE.createRow()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 RelationalFactory.eINSTANCE.createColumnValue()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 RelationalFactory.eINSTANCE.createCheckConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 RelationalFactory.eINSTANCE.createRowSet()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 RelationalFactory.eINSTANCE.createSQLParameter()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 RecordFactory.eINSTANCE.createField()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 RecordFactory.eINSTANCE.createRecordDef()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 RecordFactory.eINSTANCE.createFixedOffsetField()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 RecordFactory.eINSTANCE.createRecordFile()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 RecordFactory.eINSTANCE.createFieldValue()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 RecordFactory.eINSTANCE.createRecord()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 RecordFactory.eINSTANCE.createRecordSet()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 RecordFactory.eINSTANCE.createGroup()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 MultidimensionalFactory.eINSTANCE.createDimension()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 MultidimensionalFactory.eINSTANCE.createDimensionedObject()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 MultidimensionalFactory.eINSTANCE.createMember()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 MultidimensionalFactory.eINSTANCE.createMemberSet()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 MultidimensionalFactory.eINSTANCE.createMemberValue()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 MultidimensionalFactory.eINSTANCE.createSchema()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 CwmXmlFactory.eINSTANCE.createSchema()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 CwmXmlFactory.eINSTANCE.createElementType()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 CwmXmlFactory.eINSTANCE.createAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 CwmXmlFactory.eINSTANCE.createContent()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 CwmXmlFactory.eINSTANCE.createElementContent()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 CwmXmlFactory.eINSTANCE.createMixedContent()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 CwmXmlFactory.eINSTANCE.createElementTypeReference()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 CwmXmlFactory.eINSTANCE.createText()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 CwmXmlFactory.eINSTANCE.createElement()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 CwmXmlFactory.eINSTANCE.createDocument()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 OlapFactory.eINSTANCE.createContentMap()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 OlapFactory.eINSTANCE.createCube()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 OlapFactory.eINSTANCE.createCubeDeployment()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 OlapFactory.eINSTANCE.createCubeDimensionAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 OlapFactory.eINSTANCE.createCubeRegion()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 OlapFactory.eINSTANCE.createDeploymentGroup()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 OlapFactory.eINSTANCE.createDimension()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 OlapFactory.eINSTANCE.createDimensionDeployment()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 OlapFactory.eINSTANCE.createHierarchyLevelAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 OlapFactory.eINSTANCE.createLevelBasedHierarchy()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 OlapFactory.eINSTANCE.createMemberSelectionGroup()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 OlapFactory.eINSTANCE.createMemberSelection()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 OlapFactory.eINSTANCE.createSchema()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 OlapFactory.eINSTANCE.createValueBasedHierarchy()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 OlapFactory.eINSTANCE.createLevel()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 OlapFactory.eINSTANCE.createCodedLevel()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 OlapFactory.eINSTANCE.createMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 OlapFactory.eINSTANCE.createStructureMap()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 OlapFactory.eINSTANCE.createHierarchyMemberSelectionGroup()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 MiningDataFactory.eINSTANCE.createAttributeAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 MiningDataFactory.eINSTANCE.createAttributeAssignmentSet()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 MiningDataFactory.eINSTANCE.createAttributeUsage()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 MiningDataFactory.eINSTANCE.createAttributeUsageSet()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 MiningDataFactory.eINSTANCE.createCategoricalAttributeProperties()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 MiningDataFactory.eINSTANCE.createDirectAttributeAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 MiningDataFactory.eINSTANCE.createLogicalAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 MiningDataFactory.eINSTANCE.createLogicalData()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 MiningDataFactory.eINSTANCE.createNumericalAttributeProperties()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 MiningDataFactory.eINSTANCE.createOrdinalAttributeProperties()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 MiningDataFactory.eINSTANCE.createPhysicalData()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 MiningDataFactory.eINSTANCE.createPivotAttributeAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 MiningDataFactory.eINSTANCE.createReversePivotAttributeAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 MiningDataFactory.eINSTANCE.createSetAttributeAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 MiningDataFactory.eINSTANCE.createCategory()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 MiningDataFactory.eINSTANCE.createCategoryMap()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 MiningDataFactory.eINSTANCE.createCategoryMapObject()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 MiningDataFactory.eINSTANCE.createCategoryMapObjectEntry()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 MiningDataFactory.eINSTANCE.createCategoryMapTable()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 MiningDataFactory.eINSTANCE.createCategoryMatrix()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 MiningDataFactory.eINSTANCE.createCategoryMatrixEntry()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 MiningDataFactory.eINSTANCE.createCategoryMatrixObject()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 MiningDataFactory.eINSTANCE.createCategoryMatrixTable()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 MiningDataFactory.eINSTANCE.createCategoryTaxonomy()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 MiningModelFactory.eINSTANCE.createMiningModel()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 MiningModelFactory.eINSTANCE.createModelSignature()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 MiningModelFactory.eINSTANCE.createSignatureAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 MiningTaskFactory.eINSTANCE.createApplyOutputItem()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 MiningTaskFactory.eINSTANCE.createApplyProbabilityItem()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 MiningTaskFactory.eINSTANCE.createApplyRuleIdItem()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 MiningTaskFactory.eINSTANCE.createApplyScoreItem()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 MiningTaskFactory.eINSTANCE.createApplySourceItem()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 MiningTaskFactory.eINSTANCE.createMiningApplyOutput()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 MiningTaskFactory.eINSTANCE.createMiningApplyTask()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 MiningTaskFactory.eINSTANCE.createMiningBuildTask()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 MiningTaskFactory.eINSTANCE.createMiningTransformation()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 EntryPointFactory.eINSTANCE.createAuxiliaryObject()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 EntryPointFactory.eINSTANCE.createCatalog()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 EntryPointFactory.eINSTANCE.createSchema()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 ClusteringFactory.eINSTANCE.createClusteringAttributeUsage()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 ClusteringFactory.eINSTANCE.createClusteringFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 AssociationRulesFactory.eINSTANCE.createFrequentItemSetFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 AssociationRulesFactory.eINSTANCE.createAssociationRulesFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 AssociationRulesFactory.eINSTANCE.createSequenceFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 SupervisedFactory.eINSTANCE.createLiftAnalysisPoint()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 SupervisedFactory.eINSTANCE.createLiftAnalysis()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 SupervisedFactory.eINSTANCE.createMiningTestTask()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 SupervisedFactory.eINSTANCE.createSupervisedFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 SupervisedFactory.eINSTANCE.createMiningTestResult()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 ClassificationFactory.eINSTANCE.createApplyTargetValueItem()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 ClassificationFactory.eINSTANCE.createClassificationAttributeUsage()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 ClassificationFactory.eINSTANCE.createClassificationFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 ClassificationFactory.eINSTANCE.createClassificationTestResult()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 ClassificationFactory.eINSTANCE.createClassificationTestTask()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 ClassificationFactory.eINSTANCE.createPriorProbabilities()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 ClassificationFactory.eINSTANCE.createPriorProbabilitiesEntry()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 ApproximationFactory.eINSTANCE.createApproximationFunctionSettings()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 ApproximationFactory.eINSTANCE.createApproximationTestResult()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 ApproximationFactory.eINSTANCE.createApproximationTestTask()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 AttributeImportanceFactory.eINSTANCE.createAttributeImportanceSettings()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 InformationVisualizationFactory.eINSTANCE.createRenderedObject()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 InformationVisualizationFactory.eINSTANCE.createRenderedObjectSet()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 InformationVisualizationFactory.eINSTANCE.createRendering()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 InformationVisualizationFactory.eINSTANCE.createXSLRendering()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 BusinessNomenclatureFactory.eINSTANCE.createVocabularyElement()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 BusinessNomenclatureFactory.eINSTANCE.createNomenclature()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 BusinessNomenclatureFactory.eINSTANCE.createTaxonomy()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 BusinessNomenclatureFactory.eINSTANCE.createGlossary()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 BusinessNomenclatureFactory.eINSTANCE.createBusinessDomain()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 BusinessNomenclatureFactory.eINSTANCE.createConcept()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 BusinessNomenclatureFactory.eINSTANCE.createTerm()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 WarehouseProcessFactory.eINSTANCE.createWarehouseStep()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 WarehouseProcessFactory.eINSTANCE.createProcessPackage()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 WarehouseProcessFactory.eINSTANCE.createWarehouseActivity()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 EventsFactory.eINSTANCE.createPointInTimeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 EventsFactory.eINSTANCE.createCustomCalendarEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 EventsFactory.eINSTANCE.createCustomCalendar()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 EventsFactory.eINSTANCE.createCalendarDate()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 EventsFactory.eINSTANCE.createIntervalEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 EventsFactory.eINSTANCE.createExternalEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 EventsFactory.eINSTANCE.createInternalEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 EventsFactory.eINSTANCE.createCascadeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 EventsFactory.eINSTANCE.createRetryEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 EventsFactory.eINSTANCE.createRecurringPointInTimeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 WarehouseOperationFactory.eINSTANCE.createMeasurement()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 WarehouseOperationFactory.eINSTANCE.createChangeRequest()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 WarehouseOperationFactory.eINSTANCE.createTransformationExecution()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
				 WarehouseOperationFactory.eINSTANCE.createActivityExecution()));

		newChildDescriptors.add
			(createChildParameter
				(CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP,
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
			childFeature == CwmTransformationPackage.Literals.TRANSFORMATION_MAP__CLASSIFIER_MAP;

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

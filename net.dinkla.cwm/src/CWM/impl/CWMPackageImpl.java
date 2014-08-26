/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.impl;

import CWM.Approximation.ApproximationPackage;

import CWM.Approximation.impl.ApproximationPackageImpl;

import CWM.AssociationRules.AssociationRulesPackage;

import CWM.AssociationRules.impl.AssociationRulesPackageImpl;

import CWM.AttributeImportance.AttributeImportancePackage;

import CWM.AttributeImportance.impl.AttributeImportancePackageImpl;

import CWM.Behavioral.BehavioralPackage;

import CWM.Behavioral.impl.BehavioralPackageImpl;

import CWM.BusinessInformation.BusinessInformationPackage;

import CWM.BusinessInformation.impl.BusinessInformationPackageImpl;

import CWM.BusinessNomenclature.BusinessNomenclaturePackage;

import CWM.BusinessNomenclature.impl.BusinessNomenclaturePackageImpl;

import CWM.CWMComplete.CWMCompletePackage;

import CWM.CWMComplete.impl.CWMCompletePackageImpl;

import CWM.CWMFactory;
import CWM.CWMPackage;
import CWM.CWM_container;

import CWM.Classification.ClassificationPackage;

import CWM.Classification.impl.ClassificationPackageImpl;

import CWM.Clustering.ClusteringPackage;

import CWM.Clustering.impl.ClusteringPackageImpl;

import CWM.Core.CorePackage;

import CWM.Core.impl.CorePackageImpl;

import CWM.CwmInstance.CwmInstancePackage;

import CWM.CwmInstance.impl.CwmInstancePackageImpl;

import CWM.CwmTransformation.CwmTransformationPackage;

import CWM.CwmTransformation.impl.CwmTransformationPackageImpl;

import CWM.CwmXml.CwmXmlPackage;

import CWM.CwmXml.impl.CwmXmlPackageImpl;

import CWM.DataTypes.DataTypesPackage;

import CWM.DataTypes.impl.DataTypesPackageImpl;

import CWM.Expressions.ExpressionsPackage;

import CWM.Expressions.impl.ExpressionsPackageImpl;

import CWM.InformationVisualization.InformationVisualizationPackage;

import CWM.InformationVisualization.impl.InformationVisualizationPackageImpl;

import CWM.KeysIndexes.KeysIndexesPackage;

import CWM.KeysIndexes.impl.KeysIndexesPackageImpl;

import CWM.MiningCore.EntryPoint.EntryPointPackage;

import CWM.MiningCore.EntryPoint.impl.EntryPointPackageImpl;

import CWM.MiningCore.MiningCorePackage;

import CWM.MiningCore.MiningData.MiningDataPackage;

import CWM.MiningCore.MiningData.impl.MiningDataPackageImpl;

import CWM.MiningCore.MiningFunctionSettings.MiningFunctionSettingsPackage;

import CWM.MiningCore.MiningFunctionSettings.impl.MiningFunctionSettingsPackageImpl;

import CWM.MiningCore.MiningModel.MiningModelPackage;

import CWM.MiningCore.MiningModel.impl.MiningModelPackageImpl;

import CWM.MiningCore.MiningResult.MiningResultPackage;

import CWM.MiningCore.MiningResult.impl.MiningResultPackageImpl;

import CWM.MiningCore.MiningTask.MiningTaskPackage;

import CWM.MiningCore.MiningTask.impl.MiningTaskPackageImpl;

import CWM.MiningCore.impl.MiningCorePackageImpl;

import CWM.Multidimensional.MultidimensionalPackage;

import CWM.Multidimensional.impl.MultidimensionalPackageImpl;

import CWM.Olap.OlapPackage;

import CWM.Olap.impl.OlapPackageImpl;

import CWM.Record.RecordPackage;

import CWM.Record.impl.RecordPackageImpl;

import CWM.Relational.Enumerations.EnumerationsPackage;

import CWM.Relational.Enumerations.impl.EnumerationsPackageImpl;

import CWM.Relational.RelationalPackage;

import CWM.Relational.impl.RelationalPackageImpl;

import CWM.Relationships.RelationshipsPackage;

import CWM.Relationships.impl.RelationshipsPackageImpl;

import CWM.SoftwareDeployment.SoftwareDeploymentPackage;

import CWM.SoftwareDeployment.impl.SoftwareDeploymentPackageImpl;

import CWM.Supervised.SupervisedPackage;

import CWM.Supervised.impl.SupervisedPackageImpl;

import CWM.TypeMapping.TypeMappingPackage;

import CWM.TypeMapping.impl.TypeMappingPackageImpl;

import CWM.WarehouseOperation.WarehouseOperationPackage;

import CWM.WarehouseOperation.impl.WarehouseOperationPackageImpl;

import CWM.WarehouseProcess.DataType.DataTypePackage;

import CWM.WarehouseProcess.DataType.impl.DataTypePackageImpl;

import CWM.WarehouseProcess.Events.EventsPackage;

import CWM.WarehouseProcess.Events.impl.EventsPackageImpl;

import CWM.WarehouseProcess.WarehouseProcessPackage;

import CWM.WarehouseProcess.impl.WarehouseProcessPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CWMPackageImpl extends EPackageImpl implements CWMPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cwM_containerEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see CWM.CWMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CWMPackageImpl() {
		super(eNS_URI, CWMFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CWMPackage init() {
		if (isInited) return (CWMPackage)EPackage.Registry.INSTANCE.getEPackage(CWMPackage.eNS_URI);

		// Obtain or create and register package
		CWMPackageImpl theCWMPackage = (CWMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof CWMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new CWMPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		BehavioralPackageImpl theBehavioralPackage = (BehavioralPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehavioralPackage.eNS_URI) instanceof BehavioralPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehavioralPackage.eNS_URI) : BehavioralPackage.eINSTANCE);
		RelationshipsPackageImpl theRelationshipsPackage = (RelationshipsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RelationshipsPackage.eNS_URI) instanceof RelationshipsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RelationshipsPackage.eNS_URI) : RelationshipsPackage.eINSTANCE);
		CwmInstancePackageImpl theCwmInstancePackage = (CwmInstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CwmInstancePackage.eNS_URI) instanceof CwmInstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CwmInstancePackage.eNS_URI) : CwmInstancePackage.eINSTANCE);
		BusinessInformationPackageImpl theBusinessInformationPackage = (BusinessInformationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BusinessInformationPackage.eNS_URI) instanceof BusinessInformationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BusinessInformationPackage.eNS_URI) : BusinessInformationPackage.eINSTANCE);
		DataTypesPackageImpl theDataTypesPackage = (DataTypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataTypesPackage.eNS_URI) instanceof DataTypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataTypesPackage.eNS_URI) : DataTypesPackage.eINSTANCE);
		ExpressionsPackageImpl theExpressionsPackage = (ExpressionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI) instanceof ExpressionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI) : ExpressionsPackage.eINSTANCE);
		KeysIndexesPackageImpl theKeysIndexesPackage = (KeysIndexesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(KeysIndexesPackage.eNS_URI) instanceof KeysIndexesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(KeysIndexesPackage.eNS_URI) : KeysIndexesPackage.eINSTANCE);
		SoftwareDeploymentPackageImpl theSoftwareDeploymentPackage = (SoftwareDeploymentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SoftwareDeploymentPackage.eNS_URI) instanceof SoftwareDeploymentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SoftwareDeploymentPackage.eNS_URI) : SoftwareDeploymentPackage.eINSTANCE);
		TypeMappingPackageImpl theTypeMappingPackage = (TypeMappingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypeMappingPackage.eNS_URI) instanceof TypeMappingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypeMappingPackage.eNS_URI) : TypeMappingPackage.eINSTANCE);
		RelationalPackageImpl theRelationalPackage = (RelationalPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RelationalPackage.eNS_URI) instanceof RelationalPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RelationalPackage.eNS_URI) : RelationalPackage.eINSTANCE);
		EnumerationsPackageImpl theEnumerationsPackage = (EnumerationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EnumerationsPackage.eNS_URI) instanceof EnumerationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EnumerationsPackage.eNS_URI) : EnumerationsPackage.eINSTANCE);
		RecordPackageImpl theRecordPackage = (RecordPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RecordPackage.eNS_URI) instanceof RecordPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RecordPackage.eNS_URI) : RecordPackage.eINSTANCE);
		MultidimensionalPackageImpl theMultidimensionalPackage = (MultidimensionalPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MultidimensionalPackage.eNS_URI) instanceof MultidimensionalPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MultidimensionalPackage.eNS_URI) : MultidimensionalPackage.eINSTANCE);
		CwmXmlPackageImpl theCwmXmlPackage = (CwmXmlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CwmXmlPackage.eNS_URI) instanceof CwmXmlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CwmXmlPackage.eNS_URI) : CwmXmlPackage.eINSTANCE);
		CwmTransformationPackageImpl theCwmTransformationPackage = (CwmTransformationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CwmTransformationPackage.eNS_URI) instanceof CwmTransformationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CwmTransformationPackage.eNS_URI) : CwmTransformationPackage.eINSTANCE);
		OlapPackageImpl theOlapPackage = (OlapPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OlapPackage.eNS_URI) instanceof OlapPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OlapPackage.eNS_URI) : OlapPackage.eINSTANCE);
		MiningCorePackageImpl theMiningCorePackage = (MiningCorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MiningCorePackage.eNS_URI) instanceof MiningCorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MiningCorePackage.eNS_URI) : MiningCorePackage.eINSTANCE);
		MiningDataPackageImpl theMiningDataPackage = (MiningDataPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MiningDataPackage.eNS_URI) instanceof MiningDataPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MiningDataPackage.eNS_URI) : MiningDataPackage.eINSTANCE);
		MiningFunctionSettingsPackageImpl theMiningFunctionSettingsPackage = (MiningFunctionSettingsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MiningFunctionSettingsPackage.eNS_URI) instanceof MiningFunctionSettingsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MiningFunctionSettingsPackage.eNS_URI) : MiningFunctionSettingsPackage.eINSTANCE);
		MiningModelPackageImpl theMiningModelPackage = (MiningModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MiningModelPackage.eNS_URI) instanceof MiningModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MiningModelPackage.eNS_URI) : MiningModelPackage.eINSTANCE);
		MiningResultPackageImpl theMiningResultPackage = (MiningResultPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MiningResultPackage.eNS_URI) instanceof MiningResultPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MiningResultPackage.eNS_URI) : MiningResultPackage.eINSTANCE);
		MiningTaskPackageImpl theMiningTaskPackage = (MiningTaskPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MiningTaskPackage.eNS_URI) instanceof MiningTaskPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MiningTaskPackage.eNS_URI) : MiningTaskPackage.eINSTANCE);
		EntryPointPackageImpl theEntryPointPackage = (EntryPointPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EntryPointPackage.eNS_URI) instanceof EntryPointPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EntryPointPackage.eNS_URI) : EntryPointPackage.eINSTANCE);
		ClusteringPackageImpl theClusteringPackage = (ClusteringPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ClusteringPackage.eNS_URI) instanceof ClusteringPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ClusteringPackage.eNS_URI) : ClusteringPackage.eINSTANCE);
		AssociationRulesPackageImpl theAssociationRulesPackage = (AssociationRulesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AssociationRulesPackage.eNS_URI) instanceof AssociationRulesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AssociationRulesPackage.eNS_URI) : AssociationRulesPackage.eINSTANCE);
		SupervisedPackageImpl theSupervisedPackage = (SupervisedPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SupervisedPackage.eNS_URI) instanceof SupervisedPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SupervisedPackage.eNS_URI) : SupervisedPackage.eINSTANCE);
		ClassificationPackageImpl theClassificationPackage = (ClassificationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ClassificationPackage.eNS_URI) instanceof ClassificationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ClassificationPackage.eNS_URI) : ClassificationPackage.eINSTANCE);
		ApproximationPackageImpl theApproximationPackage = (ApproximationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ApproximationPackage.eNS_URI) instanceof ApproximationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ApproximationPackage.eNS_URI) : ApproximationPackage.eINSTANCE);
		AttributeImportancePackageImpl theAttributeImportancePackage = (AttributeImportancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AttributeImportancePackage.eNS_URI) instanceof AttributeImportancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AttributeImportancePackage.eNS_URI) : AttributeImportancePackage.eINSTANCE);
		InformationVisualizationPackageImpl theInformationVisualizationPackage = (InformationVisualizationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InformationVisualizationPackage.eNS_URI) instanceof InformationVisualizationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InformationVisualizationPackage.eNS_URI) : InformationVisualizationPackage.eINSTANCE);
		BusinessNomenclaturePackageImpl theBusinessNomenclaturePackage = (BusinessNomenclaturePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BusinessNomenclaturePackage.eNS_URI) instanceof BusinessNomenclaturePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BusinessNomenclaturePackage.eNS_URI) : BusinessNomenclaturePackage.eINSTANCE);
		WarehouseProcessPackageImpl theWarehouseProcessPackage = (WarehouseProcessPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(WarehouseProcessPackage.eNS_URI) instanceof WarehouseProcessPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(WarehouseProcessPackage.eNS_URI) : WarehouseProcessPackage.eINSTANCE);
		DataTypePackageImpl theDataTypePackage = (DataTypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataTypePackage.eNS_URI) instanceof DataTypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataTypePackage.eNS_URI) : DataTypePackage.eINSTANCE);
		EventsPackageImpl theEventsPackage = (EventsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EventsPackage.eNS_URI) instanceof EventsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EventsPackage.eNS_URI) : EventsPackage.eINSTANCE);
		WarehouseOperationPackageImpl theWarehouseOperationPackage = (WarehouseOperationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(WarehouseOperationPackage.eNS_URI) instanceof WarehouseOperationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(WarehouseOperationPackage.eNS_URI) : WarehouseOperationPackage.eINSTANCE);
		CWMCompletePackageImpl theCWMCompletePackage = (CWMCompletePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CWMCompletePackage.eNS_URI) instanceof CWMCompletePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CWMCompletePackage.eNS_URI) : CWMCompletePackage.eINSTANCE);

		// Create package meta-data objects
		theCWMPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theBehavioralPackage.createPackageContents();
		theRelationshipsPackage.createPackageContents();
		theCwmInstancePackage.createPackageContents();
		theBusinessInformationPackage.createPackageContents();
		theDataTypesPackage.createPackageContents();
		theExpressionsPackage.createPackageContents();
		theKeysIndexesPackage.createPackageContents();
		theSoftwareDeploymentPackage.createPackageContents();
		theTypeMappingPackage.createPackageContents();
		theRelationalPackage.createPackageContents();
		theEnumerationsPackage.createPackageContents();
		theRecordPackage.createPackageContents();
		theMultidimensionalPackage.createPackageContents();
		theCwmXmlPackage.createPackageContents();
		theCwmTransformationPackage.createPackageContents();
		theOlapPackage.createPackageContents();
		theMiningCorePackage.createPackageContents();
		theMiningDataPackage.createPackageContents();
		theMiningFunctionSettingsPackage.createPackageContents();
		theMiningModelPackage.createPackageContents();
		theMiningResultPackage.createPackageContents();
		theMiningTaskPackage.createPackageContents();
		theEntryPointPackage.createPackageContents();
		theClusteringPackage.createPackageContents();
		theAssociationRulesPackage.createPackageContents();
		theSupervisedPackage.createPackageContents();
		theClassificationPackage.createPackageContents();
		theApproximationPackage.createPackageContents();
		theAttributeImportancePackage.createPackageContents();
		theInformationVisualizationPackage.createPackageContents();
		theBusinessNomenclaturePackage.createPackageContents();
		theWarehouseProcessPackage.createPackageContents();
		theDataTypePackage.createPackageContents();
		theEventsPackage.createPackageContents();
		theWarehouseOperationPackage.createPackageContents();
		theCWMCompletePackage.createPackageContents();

		// Initialize created meta-data
		theCWMPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theBehavioralPackage.initializePackageContents();
		theRelationshipsPackage.initializePackageContents();
		theCwmInstancePackage.initializePackageContents();
		theBusinessInformationPackage.initializePackageContents();
		theDataTypesPackage.initializePackageContents();
		theExpressionsPackage.initializePackageContents();
		theKeysIndexesPackage.initializePackageContents();
		theSoftwareDeploymentPackage.initializePackageContents();
		theTypeMappingPackage.initializePackageContents();
		theRelationalPackage.initializePackageContents();
		theEnumerationsPackage.initializePackageContents();
		theRecordPackage.initializePackageContents();
		theMultidimensionalPackage.initializePackageContents();
		theCwmXmlPackage.initializePackageContents();
		theCwmTransformationPackage.initializePackageContents();
		theOlapPackage.initializePackageContents();
		theMiningCorePackage.initializePackageContents();
		theMiningDataPackage.initializePackageContents();
		theMiningFunctionSettingsPackage.initializePackageContents();
		theMiningModelPackage.initializePackageContents();
		theMiningResultPackage.initializePackageContents();
		theMiningTaskPackage.initializePackageContents();
		theEntryPointPackage.initializePackageContents();
		theClusteringPackage.initializePackageContents();
		theAssociationRulesPackage.initializePackageContents();
		theSupervisedPackage.initializePackageContents();
		theClassificationPackage.initializePackageContents();
		theApproximationPackage.initializePackageContents();
		theAttributeImportancePackage.initializePackageContents();
		theInformationVisualizationPackage.initializePackageContents();
		theBusinessNomenclaturePackage.initializePackageContents();
		theWarehouseProcessPackage.initializePackageContents();
		theDataTypePackage.initializePackageContents();
		theEventsPackage.initializePackageContents();
		theWarehouseOperationPackage.initializePackageContents();
		theCWMCompletePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCWMPackage.freeze();

		return theCWMPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCWM_container() {
		return cwM_containerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCWM_container_Core() {
		return (EReference)cwM_containerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCWM_container_Behavioral() {
		return (EReference)cwM_containerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCWM_container_Relationships() {
		return (EReference)cwM_containerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCWM_container_Instance() {
		return (EReference)cwM_containerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCWM_container_BusinessInformation() {
		return (EReference)cwM_containerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCWM_container_DataTypes() {
		return (EReference)cwM_containerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCWM_container_Expressions() {
		return (EReference)cwM_containerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCWM_container_KeysIndexes() {
		return (EReference)cwM_containerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCWM_container_SoftwareDeployment() {
		return (EReference)cwM_containerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCWM_container_TypeMapping() {
		return (EReference)cwM_containerEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCWM_container_Relational() {
		return (EReference)cwM_containerEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCWM_container_Enumerations() {
		return (EReference)cwM_containerEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCWM_container_Record() {
		return (EReference)cwM_containerEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCWM_container_Multidimensional() {
		return (EReference)cwM_containerEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCWM_container_XML() {
		return (EReference)cwM_containerEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCWM_container_Transformation() {
		return (EReference)cwM_containerEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCWM_container_Olap() {
		return (EReference)cwM_containerEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCWM_container_MiningCore() {
		return (EReference)cwM_containerEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCWM_container_MiningData() {
		return (EReference)cwM_containerEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCWM_container_MiningFunctionSettings() {
		return (EReference)cwM_containerEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCWM_container_MiningModel() {
		return (EReference)cwM_containerEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCWM_container_MiningResult() {
		return (EReference)cwM_containerEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCWM_container_MiningTask() {
		return (EReference)cwM_containerEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCWM_container_EntryPoint() {
		return (EReference)cwM_containerEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCWM_container_Clustering() {
		return (EReference)cwM_containerEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCWM_container_AssociationRules() {
		return (EReference)cwM_containerEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCWM_container_Supervised() {
		return (EReference)cwM_containerEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCWM_container_Classification() {
		return (EReference)cwM_containerEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCWM_container_Approximation() {
		return (EReference)cwM_containerEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCWM_container_AttributeImportance() {
		return (EReference)cwM_containerEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCWM_container_InformationVisualization() {
		return (EReference)cwM_containerEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCWM_container_BusinessNomenclature() {
		return (EReference)cwM_containerEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCWM_container_WarehouseProcess() {
		return (EReference)cwM_containerEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCWM_container_DataType() {
		return (EReference)cwM_containerEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCWM_container_Events() {
		return (EReference)cwM_containerEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCWM_container_WarehouseOperation() {
		return (EReference)cwM_containerEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCWM_container_CWMComplete() {
		return (EReference)cwM_containerEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CWMFactory getCWMFactory() {
		return (CWMFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		cwM_containerEClass = createEClass(CWM_CONTAINER);
		createEReference(cwM_containerEClass, CWM_CONTAINER__CORE);
		createEReference(cwM_containerEClass, CWM_CONTAINER__BEHAVIORAL);
		createEReference(cwM_containerEClass, CWM_CONTAINER__RELATIONSHIPS);
		createEReference(cwM_containerEClass, CWM_CONTAINER__INSTANCE);
		createEReference(cwM_containerEClass, CWM_CONTAINER__BUSINESS_INFORMATION);
		createEReference(cwM_containerEClass, CWM_CONTAINER__DATA_TYPES);
		createEReference(cwM_containerEClass, CWM_CONTAINER__EXPRESSIONS);
		createEReference(cwM_containerEClass, CWM_CONTAINER__KEYS_INDEXES);
		createEReference(cwM_containerEClass, CWM_CONTAINER__SOFTWARE_DEPLOYMENT);
		createEReference(cwM_containerEClass, CWM_CONTAINER__TYPE_MAPPING);
		createEReference(cwM_containerEClass, CWM_CONTAINER__RELATIONAL);
		createEReference(cwM_containerEClass, CWM_CONTAINER__ENUMERATIONS);
		createEReference(cwM_containerEClass, CWM_CONTAINER__RECORD);
		createEReference(cwM_containerEClass, CWM_CONTAINER__MULTIDIMENSIONAL);
		createEReference(cwM_containerEClass, CWM_CONTAINER__XML);
		createEReference(cwM_containerEClass, CWM_CONTAINER__TRANSFORMATION);
		createEReference(cwM_containerEClass, CWM_CONTAINER__OLAP);
		createEReference(cwM_containerEClass, CWM_CONTAINER__MINING_CORE);
		createEReference(cwM_containerEClass, CWM_CONTAINER__MINING_DATA);
		createEReference(cwM_containerEClass, CWM_CONTAINER__MINING_FUNCTION_SETTINGS);
		createEReference(cwM_containerEClass, CWM_CONTAINER__MINING_MODEL);
		createEReference(cwM_containerEClass, CWM_CONTAINER__MINING_RESULT);
		createEReference(cwM_containerEClass, CWM_CONTAINER__MINING_TASK);
		createEReference(cwM_containerEClass, CWM_CONTAINER__ENTRY_POINT);
		createEReference(cwM_containerEClass, CWM_CONTAINER__CLUSTERING);
		createEReference(cwM_containerEClass, CWM_CONTAINER__ASSOCIATION_RULES);
		createEReference(cwM_containerEClass, CWM_CONTAINER__SUPERVISED);
		createEReference(cwM_containerEClass, CWM_CONTAINER__CLASSIFICATION);
		createEReference(cwM_containerEClass, CWM_CONTAINER__APPROXIMATION);
		createEReference(cwM_containerEClass, CWM_CONTAINER__ATTRIBUTE_IMPORTANCE);
		createEReference(cwM_containerEClass, CWM_CONTAINER__INFORMATION_VISUALIZATION);
		createEReference(cwM_containerEClass, CWM_CONTAINER__BUSINESS_NOMENCLATURE);
		createEReference(cwM_containerEClass, CWM_CONTAINER__WAREHOUSE_PROCESS);
		createEReference(cwM_containerEClass, CWM_CONTAINER__DATA_TYPE);
		createEReference(cwM_containerEClass, CWM_CONTAINER__EVENTS);
		createEReference(cwM_containerEClass, CWM_CONTAINER__WAREHOUSE_OPERATION);
		createEReference(cwM_containerEClass, CWM_CONTAINER__CWM_COMPLETE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		BehavioralPackage theBehavioralPackage = (BehavioralPackage)EPackage.Registry.INSTANCE.getEPackage(BehavioralPackage.eNS_URI);
		RelationshipsPackage theRelationshipsPackage = (RelationshipsPackage)EPackage.Registry.INSTANCE.getEPackage(RelationshipsPackage.eNS_URI);
		CwmInstancePackage theCwmInstancePackage = (CwmInstancePackage)EPackage.Registry.INSTANCE.getEPackage(CwmInstancePackage.eNS_URI);
		BusinessInformationPackage theBusinessInformationPackage = (BusinessInformationPackage)EPackage.Registry.INSTANCE.getEPackage(BusinessInformationPackage.eNS_URI);
		DataTypesPackage theDataTypesPackage = (DataTypesPackage)EPackage.Registry.INSTANCE.getEPackage(DataTypesPackage.eNS_URI);
		ExpressionsPackage theExpressionsPackage = (ExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI);
		KeysIndexesPackage theKeysIndexesPackage = (KeysIndexesPackage)EPackage.Registry.INSTANCE.getEPackage(KeysIndexesPackage.eNS_URI);
		SoftwareDeploymentPackage theSoftwareDeploymentPackage = (SoftwareDeploymentPackage)EPackage.Registry.INSTANCE.getEPackage(SoftwareDeploymentPackage.eNS_URI);
		TypeMappingPackage theTypeMappingPackage = (TypeMappingPackage)EPackage.Registry.INSTANCE.getEPackage(TypeMappingPackage.eNS_URI);
		RelationalPackage theRelationalPackage = (RelationalPackage)EPackage.Registry.INSTANCE.getEPackage(RelationalPackage.eNS_URI);
		RecordPackage theRecordPackage = (RecordPackage)EPackage.Registry.INSTANCE.getEPackage(RecordPackage.eNS_URI);
		MultidimensionalPackage theMultidimensionalPackage = (MultidimensionalPackage)EPackage.Registry.INSTANCE.getEPackage(MultidimensionalPackage.eNS_URI);
		CwmXmlPackage theCwmXmlPackage = (CwmXmlPackage)EPackage.Registry.INSTANCE.getEPackage(CwmXmlPackage.eNS_URI);
		CwmTransformationPackage theCwmTransformationPackage = (CwmTransformationPackage)EPackage.Registry.INSTANCE.getEPackage(CwmTransformationPackage.eNS_URI);
		OlapPackage theOlapPackage = (OlapPackage)EPackage.Registry.INSTANCE.getEPackage(OlapPackage.eNS_URI);
		MiningCorePackage theMiningCorePackage = (MiningCorePackage)EPackage.Registry.INSTANCE.getEPackage(MiningCorePackage.eNS_URI);
		ClusteringPackage theClusteringPackage = (ClusteringPackage)EPackage.Registry.INSTANCE.getEPackage(ClusteringPackage.eNS_URI);
		AssociationRulesPackage theAssociationRulesPackage = (AssociationRulesPackage)EPackage.Registry.INSTANCE.getEPackage(AssociationRulesPackage.eNS_URI);
		SupervisedPackage theSupervisedPackage = (SupervisedPackage)EPackage.Registry.INSTANCE.getEPackage(SupervisedPackage.eNS_URI);
		ClassificationPackage theClassificationPackage = (ClassificationPackage)EPackage.Registry.INSTANCE.getEPackage(ClassificationPackage.eNS_URI);
		ApproximationPackage theApproximationPackage = (ApproximationPackage)EPackage.Registry.INSTANCE.getEPackage(ApproximationPackage.eNS_URI);
		AttributeImportancePackage theAttributeImportancePackage = (AttributeImportancePackage)EPackage.Registry.INSTANCE.getEPackage(AttributeImportancePackage.eNS_URI);
		InformationVisualizationPackage theInformationVisualizationPackage = (InformationVisualizationPackage)EPackage.Registry.INSTANCE.getEPackage(InformationVisualizationPackage.eNS_URI);
		BusinessNomenclaturePackage theBusinessNomenclaturePackage = (BusinessNomenclaturePackage)EPackage.Registry.INSTANCE.getEPackage(BusinessNomenclaturePackage.eNS_URI);
		WarehouseProcessPackage theWarehouseProcessPackage = (WarehouseProcessPackage)EPackage.Registry.INSTANCE.getEPackage(WarehouseProcessPackage.eNS_URI);
		WarehouseOperationPackage theWarehouseOperationPackage = (WarehouseOperationPackage)EPackage.Registry.INSTANCE.getEPackage(WarehouseOperationPackage.eNS_URI);
		CWMCompletePackage theCWMCompletePackage = (CWMCompletePackage)EPackage.Registry.INSTANCE.getEPackage(CWMCompletePackage.eNS_URI);
		EnumerationsPackage theEnumerationsPackage = (EnumerationsPackage)EPackage.Registry.INSTANCE.getEPackage(EnumerationsPackage.eNS_URI);
		MiningDataPackage theMiningDataPackage = (MiningDataPackage)EPackage.Registry.INSTANCE.getEPackage(MiningDataPackage.eNS_URI);
		MiningFunctionSettingsPackage theMiningFunctionSettingsPackage = (MiningFunctionSettingsPackage)EPackage.Registry.INSTANCE.getEPackage(MiningFunctionSettingsPackage.eNS_URI);
		MiningModelPackage theMiningModelPackage = (MiningModelPackage)EPackage.Registry.INSTANCE.getEPackage(MiningModelPackage.eNS_URI);
		MiningResultPackage theMiningResultPackage = (MiningResultPackage)EPackage.Registry.INSTANCE.getEPackage(MiningResultPackage.eNS_URI);
		MiningTaskPackage theMiningTaskPackage = (MiningTaskPackage)EPackage.Registry.INSTANCE.getEPackage(MiningTaskPackage.eNS_URI);
		EntryPointPackage theEntryPointPackage = (EntryPointPackage)EPackage.Registry.INSTANCE.getEPackage(EntryPointPackage.eNS_URI);
		DataTypePackage theDataTypePackage = (DataTypePackage)EPackage.Registry.INSTANCE.getEPackage(DataTypePackage.eNS_URI);
		EventsPackage theEventsPackage = (EventsPackage)EPackage.Registry.INSTANCE.getEPackage(EventsPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theCorePackage);
		getESubpackages().add(theBehavioralPackage);
		getESubpackages().add(theRelationshipsPackage);
		getESubpackages().add(theCwmInstancePackage);
		getESubpackages().add(theBusinessInformationPackage);
		getESubpackages().add(theDataTypesPackage);
		getESubpackages().add(theExpressionsPackage);
		getESubpackages().add(theKeysIndexesPackage);
		getESubpackages().add(theSoftwareDeploymentPackage);
		getESubpackages().add(theTypeMappingPackage);
		getESubpackages().add(theRelationalPackage);
		getESubpackages().add(theRecordPackage);
		getESubpackages().add(theMultidimensionalPackage);
		getESubpackages().add(theCwmXmlPackage);
		getESubpackages().add(theCwmTransformationPackage);
		getESubpackages().add(theOlapPackage);
		getESubpackages().add(theMiningCorePackage);
		getESubpackages().add(theClusteringPackage);
		getESubpackages().add(theAssociationRulesPackage);
		getESubpackages().add(theSupervisedPackage);
		getESubpackages().add(theClassificationPackage);
		getESubpackages().add(theApproximationPackage);
		getESubpackages().add(theAttributeImportancePackage);
		getESubpackages().add(theInformationVisualizationPackage);
		getESubpackages().add(theBusinessNomenclaturePackage);
		getESubpackages().add(theWarehouseProcessPackage);
		getESubpackages().add(theWarehouseOperationPackage);
		getESubpackages().add(theCWMCompletePackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(cwM_containerEClass, CWM_container.class, "CWM_container", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCWM_container_Core(), theCorePackage.getCore_container(), null, "Core", null, 0, 1, CWM_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCWM_container_Behavioral(), theBehavioralPackage.getBehavioral_container(), null, "Behavioral", null, 0, 1, CWM_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCWM_container_Relationships(), theRelationshipsPackage.getRelationships_container(), null, "Relationships", null, 0, 1, CWM_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCWM_container_Instance(), theCwmInstancePackage.getInstance_container(), null, "Instance", null, 0, 1, CWM_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCWM_container_BusinessInformation(), theBusinessInformationPackage.getBusinessInformation_container(), null, "BusinessInformation", null, 0, 1, CWM_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCWM_container_DataTypes(), theDataTypesPackage.getDataTypes_container(), null, "DataTypes", null, 0, 1, CWM_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCWM_container_Expressions(), theExpressionsPackage.getExpressions_container(), null, "Expressions", null, 0, 1, CWM_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCWM_container_KeysIndexes(), theKeysIndexesPackage.getKeysIndexes_container(), null, "KeysIndexes", null, 0, 1, CWM_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCWM_container_SoftwareDeployment(), theSoftwareDeploymentPackage.getSoftwareDeployment_container(), null, "SoftwareDeployment", null, 0, 1, CWM_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCWM_container_TypeMapping(), theTypeMappingPackage.getTypeMapping_container(), null, "TypeMapping", null, 0, 1, CWM_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCWM_container_Relational(), theRelationalPackage.getRelational_container(), null, "Relational", null, 0, 1, CWM_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCWM_container_Enumerations(), theEnumerationsPackage.getEnumerations_container(), null, "Enumerations", null, 0, 1, CWM_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCWM_container_Record(), theRecordPackage.getRecord_container(), null, "Record", null, 0, 1, CWM_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCWM_container_Multidimensional(), theMultidimensionalPackage.getMultidimensional_container(), null, "Multidimensional", null, 0, 1, CWM_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCWM_container_XML(), theCwmXmlPackage.getXML_container(), null, "XML", null, 0, 1, CWM_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCWM_container_Transformation(), theCwmTransformationPackage.getTransformation_container(), null, "Transformation", null, 0, 1, CWM_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCWM_container_Olap(), theOlapPackage.getOlap_container(), null, "Olap", null, 0, 1, CWM_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCWM_container_MiningCore(), theMiningCorePackage.getMiningCore_container(), null, "MiningCore", null, 0, 1, CWM_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCWM_container_MiningData(), theMiningDataPackage.getMiningData_container(), null, "MiningData", null, 0, 1, CWM_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCWM_container_MiningFunctionSettings(), theMiningFunctionSettingsPackage.getMiningFunctionSettings_container(), null, "MiningFunctionSettings", null, 0, 1, CWM_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCWM_container_MiningModel(), theMiningModelPackage.getMiningModel_container(), null, "MiningModel", null, 0, 1, CWM_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCWM_container_MiningResult(), theMiningResultPackage.getMiningResult_container(), null, "MiningResult", null, 0, 1, CWM_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCWM_container_MiningTask(), theMiningTaskPackage.getMiningTask_container(), null, "MiningTask", null, 0, 1, CWM_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCWM_container_EntryPoint(), theEntryPointPackage.getEntryPoint_container(), null, "EntryPoint", null, 0, 1, CWM_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCWM_container_Clustering(), theClusteringPackage.getClustering_container(), null, "Clustering", null, 0, 1, CWM_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCWM_container_AssociationRules(), theAssociationRulesPackage.getAssociationRules_container(), null, "AssociationRules", null, 0, 1, CWM_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCWM_container_Supervised(), theSupervisedPackage.getSupervised_container(), null, "Supervised", null, 0, 1, CWM_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCWM_container_Classification(), theClassificationPackage.getClassification_container(), null, "Classification", null, 0, 1, CWM_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCWM_container_Approximation(), theApproximationPackage.getApproximation_container(), null, "Approximation", null, 0, 1, CWM_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCWM_container_AttributeImportance(), theAttributeImportancePackage.getAttributeImportance_container(), null, "AttributeImportance", null, 0, 1, CWM_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCWM_container_InformationVisualization(), theInformationVisualizationPackage.getInformationVisualization_container(), null, "InformationVisualization", null, 0, 1, CWM_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCWM_container_BusinessNomenclature(), theBusinessNomenclaturePackage.getBusinessNomenclature_container(), null, "BusinessNomenclature", null, 0, 1, CWM_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCWM_container_WarehouseProcess(), theWarehouseProcessPackage.getWarehouseProcess_container(), null, "WarehouseProcess", null, 0, 1, CWM_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCWM_container_DataType(), theDataTypePackage.getDataType_container(), null, "DataType", null, 0, 1, CWM_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCWM_container_Events(), theEventsPackage.getEvents_container(), null, "Events", null, 0, 1, CWM_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCWM_container_WarehouseOperation(), theWarehouseOperationPackage.getWarehouseOperation_container(), null, "WarehouseOperation", null, 0, 1, CWM_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCWM_container_CWMComplete(), theCWMCompletePackage.getCWMComplete_container(), null, "CWMComplete", null, 0, 1, CWM_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //CWMPackageImpl

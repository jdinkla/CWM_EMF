/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningTask.impl;

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

import CWM.CWMPackage;

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

import CWM.MiningCore.MiningTask.ApplyContentItem;
import CWM.MiningCore.MiningTask.ApplyOutputItem;
import CWM.MiningCore.MiningTask.ApplyOutputOption;
import CWM.MiningCore.MiningTask.ApplyProbabilityItem;
import CWM.MiningCore.MiningTask.ApplyRuleIdItem;
import CWM.MiningCore.MiningTask.ApplyScoreItem;
import CWM.MiningCore.MiningTask.ApplySourceItem;
import CWM.MiningCore.MiningTask.MiningApplyOutput;
import CWM.MiningCore.MiningTask.MiningApplyTask;
import CWM.MiningCore.MiningTask.MiningBuildTask;
import CWM.MiningCore.MiningTask.MiningTask;
import CWM.MiningCore.MiningTask.MiningTaskFactory;
import CWM.MiningCore.MiningTask.MiningTaskPackage;
import CWM.MiningCore.MiningTask.MiningTask_container;
import CWM.MiningCore.MiningTask.MiningTransformation;

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

import CWM.impl.CWMPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MiningTaskPackageImpl extends EPackageImpl implements MiningTaskPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applyContentItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applyOutputItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applyProbabilityItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applyRuleIdItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applyScoreItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applySourceItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass miningApplyOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass miningApplyTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass miningBuildTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass miningTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass miningTransformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass miningTask_containerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum applyOutputOptionEEnum = null;

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
	 * @see CWM.MiningCore.MiningTask.MiningTaskPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MiningTaskPackageImpl() {
		super(eNS_URI, MiningTaskFactory.eINSTANCE);
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
	public static MiningTaskPackage init() {
		if (isInited) return (MiningTaskPackage)EPackage.Registry.INSTANCE.getEPackage(MiningTaskPackage.eNS_URI);

		// Obtain or create and register package
		MiningTaskPackageImpl theMiningTaskPackage = (MiningTaskPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof MiningTaskPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new MiningTaskPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CWMPackageImpl theCWMPackage = (CWMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CWMPackage.eNS_URI) instanceof CWMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CWMPackage.eNS_URI) : CWMPackage.eINSTANCE);
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
		theMiningTaskPackage.createPackageContents();
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
		theMiningTaskPackage.initializePackageContents();
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
		theMiningTaskPackage.freeze();

		return theMiningTaskPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplyContentItem() {
		return applyContentItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplyContentItem_TopNthIndex() {
		return (EAttribute)applyContentItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplyOutputItem() {
		return applyOutputItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplyProbabilityItem() {
		return applyProbabilityItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplyRuleIdItem() {
		return applyRuleIdItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplyScoreItem() {
		return applyScoreItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplySourceItem() {
		return applySourceItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMiningApplyOutput() {
		return miningApplyOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMiningApplyOutput_Item() {
		return (EReference)miningApplyOutputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMiningApplyTask() {
		return miningApplyTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMiningApplyTask_ApplyOutput() {
		return (EReference)miningApplyTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMiningApplyTask_OutputAssignment() {
		return (EReference)miningApplyTaskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMiningApplyTask_OutputOption() {
		return (EAttribute)miningApplyTaskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMiningBuildTask() {
		return miningBuildTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMiningBuildTask_MiningSettings() {
		return (EReference)miningBuildTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMiningBuildTask_SettingsAssignment() {
		return (EReference)miningBuildTaskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMiningBuildTask_ValidationData() {
		return (EReference)miningBuildTaskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMiningBuildTask_ValidationAssignment() {
		return (EReference)miningBuildTaskEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMiningBuildTask_ResultModel() {
		return (EReference)miningBuildTaskEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMiningTask() {
		return miningTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMiningTask_InputData() {
		return (EReference)miningTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMiningTask_ModelAssignment() {
		return (EReference)miningTaskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMiningTask_InputModel() {
		return (EReference)miningTaskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMiningTransformation() {
		return miningTransformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMiningTransformation_Procedure() {
		return (EReference)miningTransformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMiningTask_container() {
		return miningTask_containerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMiningTask_container_ApplyContentItem() {
		return (EReference)miningTask_containerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMiningTask_container_ApplyOutputItem() {
		return (EReference)miningTask_containerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMiningTask_container_ApplyProbabilityItem() {
		return (EReference)miningTask_containerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMiningTask_container_ApplyRuleIdItem() {
		return (EReference)miningTask_containerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMiningTask_container_ApplyScoreItem() {
		return (EReference)miningTask_containerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMiningTask_container_ApplySourceItem() {
		return (EReference)miningTask_containerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMiningTask_container_MiningApplyOutput() {
		return (EReference)miningTask_containerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMiningTask_container_MiningApplyTask() {
		return (EReference)miningTask_containerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMiningTask_container_MiningBuildTask() {
		return (EReference)miningTask_containerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMiningTask_container_MiningTask() {
		return (EReference)miningTask_containerEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMiningTask_container_MiningTransformation() {
		return (EReference)miningTask_containerEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getApplyOutputOption() {
		return applyOutputOptionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiningTaskFactory getMiningTaskFactory() {
		return (MiningTaskFactory)getEFactoryInstance();
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
		applyContentItemEClass = createEClass(APPLY_CONTENT_ITEM);
		createEAttribute(applyContentItemEClass, APPLY_CONTENT_ITEM__TOP_NTH_INDEX);

		applyOutputItemEClass = createEClass(APPLY_OUTPUT_ITEM);

		applyProbabilityItemEClass = createEClass(APPLY_PROBABILITY_ITEM);

		applyRuleIdItemEClass = createEClass(APPLY_RULE_ID_ITEM);

		applyScoreItemEClass = createEClass(APPLY_SCORE_ITEM);

		applySourceItemEClass = createEClass(APPLY_SOURCE_ITEM);

		miningApplyOutputEClass = createEClass(MINING_APPLY_OUTPUT);
		createEReference(miningApplyOutputEClass, MINING_APPLY_OUTPUT__ITEM);

		miningApplyTaskEClass = createEClass(MINING_APPLY_TASK);
		createEReference(miningApplyTaskEClass, MINING_APPLY_TASK__APPLY_OUTPUT);
		createEReference(miningApplyTaskEClass, MINING_APPLY_TASK__OUTPUT_ASSIGNMENT);
		createEAttribute(miningApplyTaskEClass, MINING_APPLY_TASK__OUTPUT_OPTION);

		miningBuildTaskEClass = createEClass(MINING_BUILD_TASK);
		createEReference(miningBuildTaskEClass, MINING_BUILD_TASK__MINING_SETTINGS);
		createEReference(miningBuildTaskEClass, MINING_BUILD_TASK__SETTINGS_ASSIGNMENT);
		createEReference(miningBuildTaskEClass, MINING_BUILD_TASK__VALIDATION_DATA);
		createEReference(miningBuildTaskEClass, MINING_BUILD_TASK__VALIDATION_ASSIGNMENT);
		createEReference(miningBuildTaskEClass, MINING_BUILD_TASK__RESULT_MODEL);

		miningTaskEClass = createEClass(MINING_TASK);
		createEReference(miningTaskEClass, MINING_TASK__INPUT_DATA);
		createEReference(miningTaskEClass, MINING_TASK__MODEL_ASSIGNMENT);
		createEReference(miningTaskEClass, MINING_TASK__INPUT_MODEL);

		miningTransformationEClass = createEClass(MINING_TRANSFORMATION);
		createEReference(miningTransformationEClass, MINING_TRANSFORMATION__PROCEDURE);

		miningTask_containerEClass = createEClass(MINING_TASK_CONTAINER);
		createEReference(miningTask_containerEClass, MINING_TASK_CONTAINER__APPLY_CONTENT_ITEM);
		createEReference(miningTask_containerEClass, MINING_TASK_CONTAINER__APPLY_OUTPUT_ITEM);
		createEReference(miningTask_containerEClass, MINING_TASK_CONTAINER__APPLY_PROBABILITY_ITEM);
		createEReference(miningTask_containerEClass, MINING_TASK_CONTAINER__APPLY_RULE_ID_ITEM);
		createEReference(miningTask_containerEClass, MINING_TASK_CONTAINER__APPLY_SCORE_ITEM);
		createEReference(miningTask_containerEClass, MINING_TASK_CONTAINER__APPLY_SOURCE_ITEM);
		createEReference(miningTask_containerEClass, MINING_TASK_CONTAINER__MINING_APPLY_OUTPUT);
		createEReference(miningTask_containerEClass, MINING_TASK_CONTAINER__MINING_APPLY_TASK);
		createEReference(miningTask_containerEClass, MINING_TASK_CONTAINER__MINING_BUILD_TASK);
		createEReference(miningTask_containerEClass, MINING_TASK_CONTAINER__MINING_TASK);
		createEReference(miningTask_containerEClass, MINING_TASK_CONTAINER__MINING_TRANSFORMATION);

		// Create enums
		applyOutputOptionEEnum = createEEnum(APPLY_OUTPUT_OPTION);
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
		MiningDataPackage theMiningDataPackage = (MiningDataPackage)EPackage.Registry.INSTANCE.getEPackage(MiningDataPackage.eNS_URI);
		MiningFunctionSettingsPackage theMiningFunctionSettingsPackage = (MiningFunctionSettingsPackage)EPackage.Registry.INSTANCE.getEPackage(MiningFunctionSettingsPackage.eNS_URI);
		MiningModelPackage theMiningModelPackage = (MiningModelPackage)EPackage.Registry.INSTANCE.getEPackage(MiningModelPackage.eNS_URI);
		CwmTransformationPackage theCwmTransformationPackage = (CwmTransformationPackage)EPackage.Registry.INSTANCE.getEPackage(CwmTransformationPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		applyContentItemEClass.getESuperTypes().add(this.getApplyOutputItem());
		applyOutputItemEClass.getESuperTypes().add(theMiningDataPackage.getMiningAttribute());
		applyProbabilityItemEClass.getESuperTypes().add(this.getApplyContentItem());
		applyRuleIdItemEClass.getESuperTypes().add(this.getApplyContentItem());
		applyScoreItemEClass.getESuperTypes().add(this.getApplyContentItem());
		applySourceItemEClass.getESuperTypes().add(this.getApplyOutputItem());
		miningApplyOutputEClass.getESuperTypes().add(theCorePackage.getModelElement());
		miningApplyTaskEClass.getESuperTypes().add(this.getMiningTask());
		miningBuildTaskEClass.getESuperTypes().add(this.getMiningTask());
		miningTaskEClass.getESuperTypes().add(theCorePackage.getModelElement());
		miningTransformationEClass.getESuperTypes().add(theCwmTransformationPackage.getTransformation());

		// Initialize classes and features; add operations and parameters
		initEClass(applyContentItemEClass, ApplyContentItem.class, "ApplyContentItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApplyContentItem_TopNthIndex(), theCorePackage.getInteger(), "topNthIndex", null, 1, 1, ApplyContentItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(applyOutputItemEClass, ApplyOutputItem.class, "ApplyOutputItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(applyProbabilityItemEClass, ApplyProbabilityItem.class, "ApplyProbabilityItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(applyRuleIdItemEClass, ApplyRuleIdItem.class, "ApplyRuleIdItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(applyScoreItemEClass, ApplyScoreItem.class, "ApplyScoreItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(applySourceItemEClass, ApplySourceItem.class, "ApplySourceItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(miningApplyOutputEClass, MiningApplyOutput.class, "MiningApplyOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMiningApplyOutput_Item(), this.getApplyOutputItem(), null, "item", null, 1, -1, MiningApplyOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(miningApplyTaskEClass, MiningApplyTask.class, "MiningApplyTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMiningApplyTask_ApplyOutput(), this.getMiningApplyOutput(), null, "applyOutput", null, 1, 1, MiningApplyTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMiningApplyTask_OutputAssignment(), theMiningDataPackage.getAttributeAssignmentSet(), null, "outputAssignment", null, 1, 1, MiningApplyTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMiningApplyTask_OutputOption(), this.getApplyOutputOption(), "outputOption", null, 1, 1, MiningApplyTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(miningBuildTaskEClass, MiningBuildTask.class, "MiningBuildTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMiningBuildTask_MiningSettings(), theMiningFunctionSettingsPackage.getMiningFunctionSettings(), null, "miningSettings", null, 1, 1, MiningBuildTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMiningBuildTask_SettingsAssignment(), theMiningDataPackage.getAttributeAssignmentSet(), null, "settingsAssignment", null, 0, 1, MiningBuildTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMiningBuildTask_ValidationData(), theMiningDataPackage.getPhysicalData(), null, "validationData", null, 0, 1, MiningBuildTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMiningBuildTask_ValidationAssignment(), theMiningDataPackage.getAttributeAssignmentSet(), null, "validationAssignment", null, 0, 1, MiningBuildTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMiningBuildTask_ResultModel(), theMiningModelPackage.getMiningModel(), null, "resultModel", null, 0, 1, MiningBuildTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(miningTaskEClass, MiningTask.class, "MiningTask", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMiningTask_InputData(), theMiningDataPackage.getPhysicalData(), null, "inputData", null, 1, 1, MiningTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMiningTask_ModelAssignment(), theMiningDataPackage.getAttributeAssignmentSet(), null, "modelAssignment", null, 0, 1, MiningTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMiningTask_InputModel(), theMiningModelPackage.getMiningModel(), null, "inputModel", null, 0, 1, MiningTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(miningTransformationEClass, MiningTransformation.class, "MiningTransformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMiningTransformation_Procedure(), this.getMiningTask(), null, "procedure", null, 1, 1, MiningTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(miningTask_containerEClass, MiningTask_container.class, "MiningTask_container", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMiningTask_container_ApplyContentItem(), this.getApplyContentItem(), null, "ApplyContentItem", null, 0, -1, MiningTask_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMiningTask_container_ApplyOutputItem(), this.getApplyOutputItem(), null, "ApplyOutputItem", null, 0, -1, MiningTask_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMiningTask_container_ApplyProbabilityItem(), this.getApplyProbabilityItem(), null, "ApplyProbabilityItem", null, 0, -1, MiningTask_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMiningTask_container_ApplyRuleIdItem(), this.getApplyRuleIdItem(), null, "ApplyRuleIdItem", null, 0, -1, MiningTask_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMiningTask_container_ApplyScoreItem(), this.getApplyScoreItem(), null, "ApplyScoreItem", null, 0, -1, MiningTask_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMiningTask_container_ApplySourceItem(), this.getApplySourceItem(), null, "ApplySourceItem", null, 0, -1, MiningTask_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMiningTask_container_MiningApplyOutput(), this.getMiningApplyOutput(), null, "MiningApplyOutput", null, 0, -1, MiningTask_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMiningTask_container_MiningApplyTask(), this.getMiningApplyTask(), null, "MiningApplyTask", null, 0, -1, MiningTask_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMiningTask_container_MiningBuildTask(), this.getMiningBuildTask(), null, "MiningBuildTask", null, 0, -1, MiningTask_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMiningTask_container_MiningTask(), this.getMiningTask(), null, "MiningTask", null, 0, -1, MiningTask_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMiningTask_container_MiningTransformation(), this.getMiningTransformation(), null, "MiningTransformation", null, 0, -1, MiningTask_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(applyOutputOptionEEnum, ApplyOutputOption.class, "ApplyOutputOption");
		addEEnumLiteral(applyOutputOptionEEnum, ApplyOutputOption.APPEND_TO_EXISTING);
		addEEnumLiteral(applyOutputOptionEEnum, ApplyOutputOption.CREATE_NEW);
	}

} //MiningTaskPackageImpl

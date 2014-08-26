/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Olap.impl;

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

import CWM.MiningCore.MiningTask.MiningTaskPackage;

import CWM.MiningCore.MiningTask.impl.MiningTaskPackageImpl;

import CWM.MiningCore.impl.MiningCorePackageImpl;

import CWM.Multidimensional.MultidimensionalPackage;

import CWM.Multidimensional.impl.MultidimensionalPackageImpl;

import CWM.Olap.CodedLevel;
import CWM.Olap.ContentMap;
import CWM.Olap.Cube;
import CWM.Olap.CubeDeployment;
import CWM.Olap.CubeDimensionAssociation;
import CWM.Olap.CubeRegion;
import CWM.Olap.DeploymentGroup;
import CWM.Olap.Dimension;
import CWM.Olap.DimensionDeployment;
import CWM.Olap.Hierarchy;
import CWM.Olap.HierarchyLevelAssociation;
import CWM.Olap.HierarchyMemberSelectionGroup;
import CWM.Olap.Level;
import CWM.Olap.LevelBasedHierarchy;
import CWM.Olap.Measure;
import CWM.Olap.MemberSelection;
import CWM.Olap.MemberSelectionGroup;
import CWM.Olap.OlapFactory;
import CWM.Olap.OlapPackage;
import CWM.Olap.Olap_container;
import CWM.Olap.Schema;
import CWM.Olap.StructureMap;
import CWM.Olap.ValueBasedHierarchy;

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
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OlapPackageImpl extends EPackageImpl implements OlapPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cubeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cubeDeploymentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cubeDimensionAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cubeRegionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dimensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dimensionDeploymentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hierarchyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hierarchyLevelAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass levelBasedHierarchyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memberSelectionGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memberSelectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueBasedHierarchyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass levelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codedLevelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hierarchyMemberSelectionGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass olap_containerEClass = null;

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
	 * @see CWM.Olap.OlapPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OlapPackageImpl() {
		super(eNS_URI, OlapFactory.eINSTANCE);
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
	public static OlapPackage init() {
		if (isInited) return (OlapPackage)EPackage.Registry.INSTANCE.getEPackage(OlapPackage.eNS_URI);

		// Obtain or create and register package
		OlapPackageImpl theOlapPackage = (OlapPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof OlapPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new OlapPackageImpl());

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
		theOlapPackage.createPackageContents();
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
		theOlapPackage.initializePackageContents();
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
		theOlapPackage.freeze();

		return theOlapPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContentMap() {
		return contentMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContentMap_CubeDeployment() {
		return (EReference)contentMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCube() {
		return cubeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCube_IsVirtual() {
		return (EAttribute)cubeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCube_CubeDimensionAssociation() {
		return (EReference)cubeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCube_CubeRegion() {
		return (EReference)cubeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCube_Schema() {
		return (EReference)cubeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCubeDeployment() {
		return cubeDeploymentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCubeDeployment_CubeRegion() {
		return (EReference)cubeDeploymentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCubeDeployment_DeploymentGroup() {
		return (EReference)cubeDeploymentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCubeDeployment_ContentMap() {
		return (EReference)cubeDeploymentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCubeDimensionAssociation() {
		return cubeDimensionAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCubeDimensionAssociation_Dimension() {
		return (EReference)cubeDimensionAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCubeDimensionAssociation_Cube() {
		return (EReference)cubeDimensionAssociationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCubeDimensionAssociation_CalcHierarchy() {
		return (EReference)cubeDimensionAssociationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCubeRegion() {
		return cubeRegionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCubeRegion_IsReadOnly() {
		return (EAttribute)cubeRegionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCubeRegion_IsFullyRealized() {
		return (EAttribute)cubeRegionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCubeRegion_MemberSelectionGroup() {
		return (EReference)cubeRegionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCubeRegion_Cube() {
		return (EReference)cubeRegionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCubeRegion_CubeDeployment() {
		return (EReference)cubeRegionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeploymentGroup() {
		return deploymentGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentGroup_Schema() {
		return (EReference)deploymentGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentGroup_CubeDeployment() {
		return (EReference)deploymentGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentGroup_DimensionDeployment() {
		return (EReference)deploymentGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDimension() {
		return dimensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDimension_IsTime() {
		return (EAttribute)dimensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDimension_IsMeasure() {
		return (EAttribute)dimensionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDimension_Hierarchy() {
		return (EReference)dimensionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDimension_MemberSelection() {
		return (EReference)dimensionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDimension_CubeDimensionAssociation() {
		return (EReference)dimensionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDimension_DisplayDefault() {
		return (EReference)dimensionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDimension_Schema() {
		return (EReference)dimensionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDimensionDeployment() {
		return dimensionDeploymentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDimensionDeployment_HierarchyLevelAssociation() {
		return (EReference)dimensionDeploymentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDimensionDeployment_ValueBasedHierarchy() {
		return (EReference)dimensionDeploymentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDimensionDeployment_StructureMap() {
		return (EReference)dimensionDeploymentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDimensionDeployment_ListOfValues() {
		return (EReference)dimensionDeploymentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDimensionDeployment_ImmediateParent() {
		return (EReference)dimensionDeploymentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDimensionDeployment_DeploymentGroup() {
		return (EReference)dimensionDeploymentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHierarchy() {
		return hierarchyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHierarchy_Dimension() {
		return (EReference)hierarchyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHierarchy_CubeDimensionAssociation() {
		return (EReference)hierarchyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHierarchy_DefaultedDimension() {
		return (EReference)hierarchyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHierarchy_HierarchyMemberSelectionGroup() {
		return (EReference)hierarchyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHierarchyLevelAssociation() {
		return hierarchyLevelAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHierarchyLevelAssociation_LevelBasedHierarchy() {
		return (EReference)hierarchyLevelAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHierarchyLevelAssociation_CurrentLevel() {
		return (EReference)hierarchyLevelAssociationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHierarchyLevelAssociation_DimensionDeployment() {
		return (EReference)hierarchyLevelAssociationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLevelBasedHierarchy() {
		return levelBasedHierarchyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLevelBasedHierarchy_HierarchyLevelAssociation() {
		return (EReference)levelBasedHierarchyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemberSelectionGroup() {
		return memberSelectionGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemberSelectionGroup_MemberSelection() {
		return (EReference)memberSelectionGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemberSelectionGroup_CubeRegion() {
		return (EReference)memberSelectionGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemberSelection() {
		return memberSelectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemberSelection_Dimension() {
		return (EReference)memberSelectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemberSelection_MemberSelectionGroup() {
		return (EReference)memberSelectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchema() {
		return schemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchema_Cube() {
		return (EReference)schemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchema_Dimension() {
		return (EReference)schemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchema_DeploymentGroup() {
		return (EReference)schemaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueBasedHierarchy() {
		return valueBasedHierarchyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueBasedHierarchy_DimensionDeployment() {
		return (EReference)valueBasedHierarchyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLevel() {
		return levelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLevel_HierarchyLevelAssociation() {
		return (EReference)levelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodedLevel() {
		return codedLevelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodedLevel_Encoding() {
		return (EReference)codedLevelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasure() {
		return measureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructureMap() {
		return structureMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureMap_DimensionDeployment() {
		return (EReference)structureMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureMap_DimensionDeploymentLV() {
		return (EReference)structureMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureMap_DimensionDeploymentIP() {
		return (EReference)structureMapEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHierarchyMemberSelectionGroup() {
		return hierarchyMemberSelectionGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHierarchyMemberSelectionGroup_Hierarchy() {
		return (EReference)hierarchyMemberSelectionGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOlap_container() {
		return olap_containerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOlap_container_ContentMap() {
		return (EReference)olap_containerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOlap_container_Cube() {
		return (EReference)olap_containerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOlap_container_CubeDeployment() {
		return (EReference)olap_containerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOlap_container_CubeDimensionAssociation() {
		return (EReference)olap_containerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOlap_container_CubeRegion() {
		return (EReference)olap_containerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOlap_container_DeploymentGroup() {
		return (EReference)olap_containerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOlap_container_Dimension() {
		return (EReference)olap_containerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOlap_container_DimensionDeployment() {
		return (EReference)olap_containerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOlap_container_Hierarchy() {
		return (EReference)olap_containerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOlap_container_HierarchyLevelAssociation() {
		return (EReference)olap_containerEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOlap_container_LevelBasedHierarchy() {
		return (EReference)olap_containerEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOlap_container_MemberSelectionGroup() {
		return (EReference)olap_containerEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOlap_container_MemberSelection() {
		return (EReference)olap_containerEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOlap_container_Schema() {
		return (EReference)olap_containerEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOlap_container_ValueBasedHierarchy() {
		return (EReference)olap_containerEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOlap_container_Level() {
		return (EReference)olap_containerEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOlap_container_CodedLevel() {
		return (EReference)olap_containerEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOlap_container_Measure() {
		return (EReference)olap_containerEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOlap_container_StructureMap() {
		return (EReference)olap_containerEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOlap_container_HierarchyMemberSelectionGroup() {
		return (EReference)olap_containerEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OlapFactory getOlapFactory() {
		return (OlapFactory)getEFactoryInstance();
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
		contentMapEClass = createEClass(CONTENT_MAP);
		createEReference(contentMapEClass, CONTENT_MAP__CUBE_DEPLOYMENT);

		cubeEClass = createEClass(CUBE);
		createEAttribute(cubeEClass, CUBE__IS_VIRTUAL);
		createEReference(cubeEClass, CUBE__CUBE_DIMENSION_ASSOCIATION);
		createEReference(cubeEClass, CUBE__CUBE_REGION);
		createEReference(cubeEClass, CUBE__SCHEMA);

		cubeDeploymentEClass = createEClass(CUBE_DEPLOYMENT);
		createEReference(cubeDeploymentEClass, CUBE_DEPLOYMENT__CUBE_REGION);
		createEReference(cubeDeploymentEClass, CUBE_DEPLOYMENT__DEPLOYMENT_GROUP);
		createEReference(cubeDeploymentEClass, CUBE_DEPLOYMENT__CONTENT_MAP);

		cubeDimensionAssociationEClass = createEClass(CUBE_DIMENSION_ASSOCIATION);
		createEReference(cubeDimensionAssociationEClass, CUBE_DIMENSION_ASSOCIATION__DIMENSION);
		createEReference(cubeDimensionAssociationEClass, CUBE_DIMENSION_ASSOCIATION__CUBE);
		createEReference(cubeDimensionAssociationEClass, CUBE_DIMENSION_ASSOCIATION__CALC_HIERARCHY);

		cubeRegionEClass = createEClass(CUBE_REGION);
		createEAttribute(cubeRegionEClass, CUBE_REGION__IS_READ_ONLY);
		createEAttribute(cubeRegionEClass, CUBE_REGION__IS_FULLY_REALIZED);
		createEReference(cubeRegionEClass, CUBE_REGION__MEMBER_SELECTION_GROUP);
		createEReference(cubeRegionEClass, CUBE_REGION__CUBE);
		createEReference(cubeRegionEClass, CUBE_REGION__CUBE_DEPLOYMENT);

		deploymentGroupEClass = createEClass(DEPLOYMENT_GROUP);
		createEReference(deploymentGroupEClass, DEPLOYMENT_GROUP__SCHEMA);
		createEReference(deploymentGroupEClass, DEPLOYMENT_GROUP__CUBE_DEPLOYMENT);
		createEReference(deploymentGroupEClass, DEPLOYMENT_GROUP__DIMENSION_DEPLOYMENT);

		dimensionEClass = createEClass(DIMENSION);
		createEAttribute(dimensionEClass, DIMENSION__IS_TIME);
		createEAttribute(dimensionEClass, DIMENSION__IS_MEASURE);
		createEReference(dimensionEClass, DIMENSION__HIERARCHY);
		createEReference(dimensionEClass, DIMENSION__MEMBER_SELECTION);
		createEReference(dimensionEClass, DIMENSION__CUBE_DIMENSION_ASSOCIATION);
		createEReference(dimensionEClass, DIMENSION__DISPLAY_DEFAULT);
		createEReference(dimensionEClass, DIMENSION__SCHEMA);

		dimensionDeploymentEClass = createEClass(DIMENSION_DEPLOYMENT);
		createEReference(dimensionDeploymentEClass, DIMENSION_DEPLOYMENT__HIERARCHY_LEVEL_ASSOCIATION);
		createEReference(dimensionDeploymentEClass, DIMENSION_DEPLOYMENT__VALUE_BASED_HIERARCHY);
		createEReference(dimensionDeploymentEClass, DIMENSION_DEPLOYMENT__STRUCTURE_MAP);
		createEReference(dimensionDeploymentEClass, DIMENSION_DEPLOYMENT__LIST_OF_VALUES);
		createEReference(dimensionDeploymentEClass, DIMENSION_DEPLOYMENT__IMMEDIATE_PARENT);
		createEReference(dimensionDeploymentEClass, DIMENSION_DEPLOYMENT__DEPLOYMENT_GROUP);

		hierarchyEClass = createEClass(HIERARCHY);
		createEReference(hierarchyEClass, HIERARCHY__DIMENSION);
		createEReference(hierarchyEClass, HIERARCHY__CUBE_DIMENSION_ASSOCIATION);
		createEReference(hierarchyEClass, HIERARCHY__DEFAULTED_DIMENSION);
		createEReference(hierarchyEClass, HIERARCHY__HIERARCHY_MEMBER_SELECTION_GROUP);

		hierarchyLevelAssociationEClass = createEClass(HIERARCHY_LEVEL_ASSOCIATION);
		createEReference(hierarchyLevelAssociationEClass, HIERARCHY_LEVEL_ASSOCIATION__LEVEL_BASED_HIERARCHY);
		createEReference(hierarchyLevelAssociationEClass, HIERARCHY_LEVEL_ASSOCIATION__CURRENT_LEVEL);
		createEReference(hierarchyLevelAssociationEClass, HIERARCHY_LEVEL_ASSOCIATION__DIMENSION_DEPLOYMENT);

		levelBasedHierarchyEClass = createEClass(LEVEL_BASED_HIERARCHY);
		createEReference(levelBasedHierarchyEClass, LEVEL_BASED_HIERARCHY__HIERARCHY_LEVEL_ASSOCIATION);

		memberSelectionGroupEClass = createEClass(MEMBER_SELECTION_GROUP);
		createEReference(memberSelectionGroupEClass, MEMBER_SELECTION_GROUP__MEMBER_SELECTION);
		createEReference(memberSelectionGroupEClass, MEMBER_SELECTION_GROUP__CUBE_REGION);

		memberSelectionEClass = createEClass(MEMBER_SELECTION);
		createEReference(memberSelectionEClass, MEMBER_SELECTION__DIMENSION);
		createEReference(memberSelectionEClass, MEMBER_SELECTION__MEMBER_SELECTION_GROUP);

		schemaEClass = createEClass(SCHEMA);
		createEReference(schemaEClass, SCHEMA__CUBE);
		createEReference(schemaEClass, SCHEMA__DIMENSION);
		createEReference(schemaEClass, SCHEMA__DEPLOYMENT_GROUP);

		valueBasedHierarchyEClass = createEClass(VALUE_BASED_HIERARCHY);
		createEReference(valueBasedHierarchyEClass, VALUE_BASED_HIERARCHY__DIMENSION_DEPLOYMENT);

		levelEClass = createEClass(LEVEL);
		createEReference(levelEClass, LEVEL__HIERARCHY_LEVEL_ASSOCIATION);

		codedLevelEClass = createEClass(CODED_LEVEL);
		createEReference(codedLevelEClass, CODED_LEVEL__ENCODING);

		measureEClass = createEClass(MEASURE);

		structureMapEClass = createEClass(STRUCTURE_MAP);
		createEReference(structureMapEClass, STRUCTURE_MAP__DIMENSION_DEPLOYMENT);
		createEReference(structureMapEClass, STRUCTURE_MAP__DIMENSION_DEPLOYMENT_LV);
		createEReference(structureMapEClass, STRUCTURE_MAP__DIMENSION_DEPLOYMENT_IP);

		hierarchyMemberSelectionGroupEClass = createEClass(HIERARCHY_MEMBER_SELECTION_GROUP);
		createEReference(hierarchyMemberSelectionGroupEClass, HIERARCHY_MEMBER_SELECTION_GROUP__HIERARCHY);

		olap_containerEClass = createEClass(OLAP_CONTAINER);
		createEReference(olap_containerEClass, OLAP_CONTAINER__CONTENT_MAP);
		createEReference(olap_containerEClass, OLAP_CONTAINER__CUBE);
		createEReference(olap_containerEClass, OLAP_CONTAINER__CUBE_DEPLOYMENT);
		createEReference(olap_containerEClass, OLAP_CONTAINER__CUBE_DIMENSION_ASSOCIATION);
		createEReference(olap_containerEClass, OLAP_CONTAINER__CUBE_REGION);
		createEReference(olap_containerEClass, OLAP_CONTAINER__DEPLOYMENT_GROUP);
		createEReference(olap_containerEClass, OLAP_CONTAINER__DIMENSION);
		createEReference(olap_containerEClass, OLAP_CONTAINER__DIMENSION_DEPLOYMENT);
		createEReference(olap_containerEClass, OLAP_CONTAINER__HIERARCHY);
		createEReference(olap_containerEClass, OLAP_CONTAINER__HIERARCHY_LEVEL_ASSOCIATION);
		createEReference(olap_containerEClass, OLAP_CONTAINER__LEVEL_BASED_HIERARCHY);
		createEReference(olap_containerEClass, OLAP_CONTAINER__MEMBER_SELECTION_GROUP);
		createEReference(olap_containerEClass, OLAP_CONTAINER__MEMBER_SELECTION);
		createEReference(olap_containerEClass, OLAP_CONTAINER__SCHEMA);
		createEReference(olap_containerEClass, OLAP_CONTAINER__VALUE_BASED_HIERARCHY);
		createEReference(olap_containerEClass, OLAP_CONTAINER__LEVEL);
		createEReference(olap_containerEClass, OLAP_CONTAINER__CODED_LEVEL);
		createEReference(olap_containerEClass, OLAP_CONTAINER__MEASURE);
		createEReference(olap_containerEClass, OLAP_CONTAINER__STRUCTURE_MAP);
		createEReference(olap_containerEClass, OLAP_CONTAINER__HIERARCHY_MEMBER_SELECTION_GROUP);
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
		CwmTransformationPackage theCwmTransformationPackage = (CwmTransformationPackage)EPackage.Registry.INSTANCE.getEPackage(CwmTransformationPackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		ExpressionsPackage theExpressionsPackage = (ExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		contentMapEClass.getESuperTypes().add(theCwmTransformationPackage.getTransformationMap());
		cubeEClass.getESuperTypes().add(theCorePackage.getClass_());
		cubeDeploymentEClass.getESuperTypes().add(theCorePackage.getClass_());
		cubeDimensionAssociationEClass.getESuperTypes().add(theCorePackage.getClass_());
		cubeRegionEClass.getESuperTypes().add(theCorePackage.getClass_());
		deploymentGroupEClass.getESuperTypes().add(theCorePackage.getPackage());
		dimensionEClass.getESuperTypes().add(theCorePackage.getClass_());
		dimensionDeploymentEClass.getESuperTypes().add(theCorePackage.getClass_());
		hierarchyEClass.getESuperTypes().add(theCorePackage.getClass_());
		hierarchyLevelAssociationEClass.getESuperTypes().add(theCorePackage.getClass_());
		levelBasedHierarchyEClass.getESuperTypes().add(this.getHierarchy());
		memberSelectionGroupEClass.getESuperTypes().add(theCorePackage.getClass_());
		memberSelectionEClass.getESuperTypes().add(theCorePackage.getClass_());
		schemaEClass.getESuperTypes().add(theCorePackage.getPackage());
		valueBasedHierarchyEClass.getESuperTypes().add(this.getHierarchy());
		levelEClass.getESuperTypes().add(this.getMemberSelection());
		codedLevelEClass.getESuperTypes().add(this.getLevel());
		measureEClass.getESuperTypes().add(theCorePackage.getAttribute());
		structureMapEClass.getESuperTypes().add(theCwmTransformationPackage.getTransformationMap());
		hierarchyMemberSelectionGroupEClass.getESuperTypes().add(this.getMemberSelectionGroup());

		// Initialize classes and features; add operations and parameters
		initEClass(contentMapEClass, ContentMap.class, "ContentMap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContentMap_CubeDeployment(), this.getCubeDeployment(), this.getCubeDeployment_ContentMap(), "cubeDeployment", null, 1, 1, ContentMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(cubeEClass, Cube.class, "Cube", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCube_IsVirtual(), theCorePackage.getBoolean(), "isVirtual", null, 1, 1, Cube.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCube_CubeDimensionAssociation(), this.getCubeDimensionAssociation(), this.getCubeDimensionAssociation_Cube(), "cubeDimensionAssociation", null, 0, -1, Cube.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCube_CubeRegion(), this.getCubeRegion(), this.getCubeRegion_Cube(), "cubeRegion", null, 0, -1, Cube.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCube_Schema(), this.getSchema(), this.getSchema_Cube(), "schema", null, 1, 1, Cube.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(cubeDeploymentEClass, CubeDeployment.class, "CubeDeployment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCubeDeployment_CubeRegion(), this.getCubeRegion(), this.getCubeRegion_CubeDeployment(), "cubeRegion", null, 1, 1, CubeDeployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCubeDeployment_DeploymentGroup(), this.getDeploymentGroup(), this.getDeploymentGroup_CubeDeployment(), "deploymentGroup", null, 1, 1, CubeDeployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCubeDeployment_ContentMap(), this.getContentMap(), this.getContentMap_CubeDeployment(), "contentMap", null, 0, -1, CubeDeployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(cubeDimensionAssociationEClass, CubeDimensionAssociation.class, "CubeDimensionAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCubeDimensionAssociation_Dimension(), this.getDimension(), this.getDimension_CubeDimensionAssociation(), "dimension", null, 1, 1, CubeDimensionAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCubeDimensionAssociation_Cube(), this.getCube(), this.getCube_CubeDimensionAssociation(), "cube", null, 1, 1, CubeDimensionAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCubeDimensionAssociation_CalcHierarchy(), this.getHierarchy(), this.getHierarchy_CubeDimensionAssociation(), "calcHierarchy", null, 0, 1, CubeDimensionAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(cubeRegionEClass, CubeRegion.class, "CubeRegion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCubeRegion_IsReadOnly(), theCorePackage.getBoolean(), "isReadOnly", null, 1, 1, CubeRegion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCubeRegion_IsFullyRealized(), theCorePackage.getBoolean(), "isFullyRealized", null, 1, 1, CubeRegion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCubeRegion_MemberSelectionGroup(), this.getMemberSelectionGroup(), this.getMemberSelectionGroup_CubeRegion(), "memberSelectionGroup", null, 0, -1, CubeRegion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCubeRegion_Cube(), this.getCube(), this.getCube_CubeRegion(), "cube", null, 1, 1, CubeRegion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCubeRegion_CubeDeployment(), this.getCubeDeployment(), this.getCubeDeployment_CubeRegion(), "cubeDeployment", null, 0, -1, CubeRegion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deploymentGroupEClass, DeploymentGroup.class, "DeploymentGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeploymentGroup_Schema(), this.getSchema(), this.getSchema_DeploymentGroup(), "schema", null, 1, 1, DeploymentGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDeploymentGroup_CubeDeployment(), this.getCubeDeployment(), this.getCubeDeployment_DeploymentGroup(), "cubeDeployment", null, 0, -1, DeploymentGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDeploymentGroup_DimensionDeployment(), this.getDimensionDeployment(), this.getDimensionDeployment_DeploymentGroup(), "dimensionDeployment", null, 0, -1, DeploymentGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dimensionEClass, Dimension.class, "Dimension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDimension_IsTime(), theCorePackage.getBoolean(), "isTime", null, 1, 1, Dimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDimension_IsMeasure(), theCorePackage.getBoolean(), "isMeasure", null, 1, 1, Dimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDimension_Hierarchy(), this.getHierarchy(), this.getHierarchy_Dimension(), "hierarchy", null, 0, -1, Dimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDimension_MemberSelection(), this.getMemberSelection(), this.getMemberSelection_Dimension(), "memberSelection", null, 0, -1, Dimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDimension_CubeDimensionAssociation(), this.getCubeDimensionAssociation(), this.getCubeDimensionAssociation_Dimension(), "cubeDimensionAssociation", null, 0, -1, Dimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDimension_DisplayDefault(), this.getHierarchy(), this.getHierarchy_DefaultedDimension(), "displayDefault", null, 0, 1, Dimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDimension_Schema(), this.getSchema(), this.getSchema_Dimension(), "schema", null, 1, 1, Dimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dimensionDeploymentEClass, DimensionDeployment.class, "DimensionDeployment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDimensionDeployment_HierarchyLevelAssociation(), this.getHierarchyLevelAssociation(), this.getHierarchyLevelAssociation_DimensionDeployment(), "hierarchyLevelAssociation", null, 0, 1, DimensionDeployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDimensionDeployment_ValueBasedHierarchy(), this.getValueBasedHierarchy(), this.getValueBasedHierarchy_DimensionDeployment(), "valueBasedHierarchy", null, 0, 1, DimensionDeployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDimensionDeployment_StructureMap(), this.getStructureMap(), this.getStructureMap_DimensionDeployment(), "structureMap", null, 0, -1, DimensionDeployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDimensionDeployment_ListOfValues(), this.getStructureMap(), this.getStructureMap_DimensionDeploymentLV(), "listOfValues", null, 0, 1, DimensionDeployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDimensionDeployment_ImmediateParent(), this.getStructureMap(), this.getStructureMap_DimensionDeploymentIP(), "immediateParent", null, 0, 1, DimensionDeployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDimensionDeployment_DeploymentGroup(), this.getDeploymentGroup(), this.getDeploymentGroup_DimensionDeployment(), "deploymentGroup", null, 1, 1, DimensionDeployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(hierarchyEClass, Hierarchy.class, "Hierarchy", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHierarchy_Dimension(), this.getDimension(), this.getDimension_Hierarchy(), "dimension", null, 1, 1, Hierarchy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHierarchy_CubeDimensionAssociation(), this.getCubeDimensionAssociation(), this.getCubeDimensionAssociation_CalcHierarchy(), "cubeDimensionAssociation", null, 0, -1, Hierarchy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHierarchy_DefaultedDimension(), this.getDimension(), this.getDimension_DisplayDefault(), "defaultedDimension", null, 0, 1, Hierarchy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHierarchy_HierarchyMemberSelectionGroup(), this.getHierarchyMemberSelectionGroup(), this.getHierarchyMemberSelectionGroup_Hierarchy(), "hierarchyMemberSelectionGroup", null, 0, -1, Hierarchy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(hierarchyLevelAssociationEClass, HierarchyLevelAssociation.class, "HierarchyLevelAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHierarchyLevelAssociation_LevelBasedHierarchy(), this.getLevelBasedHierarchy(), this.getLevelBasedHierarchy_HierarchyLevelAssociation(), "levelBasedHierarchy", null, 1, 1, HierarchyLevelAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHierarchyLevelAssociation_CurrentLevel(), this.getLevel(), this.getLevel_HierarchyLevelAssociation(), "currentLevel", null, 1, 1, HierarchyLevelAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHierarchyLevelAssociation_DimensionDeployment(), this.getDimensionDeployment(), this.getDimensionDeployment_HierarchyLevelAssociation(), "dimensionDeployment", null, 0, -1, HierarchyLevelAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(levelBasedHierarchyEClass, LevelBasedHierarchy.class, "LevelBasedHierarchy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLevelBasedHierarchy_HierarchyLevelAssociation(), this.getHierarchyLevelAssociation(), this.getHierarchyLevelAssociation_LevelBasedHierarchy(), "hierarchyLevelAssociation", null, 0, -1, LevelBasedHierarchy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memberSelectionGroupEClass, MemberSelectionGroup.class, "MemberSelectionGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMemberSelectionGroup_MemberSelection(), this.getMemberSelection(), this.getMemberSelection_MemberSelectionGroup(), "memberSelection", null, 1, -1, MemberSelectionGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMemberSelectionGroup_CubeRegion(), this.getCubeRegion(), this.getCubeRegion_MemberSelectionGroup(), "cubeRegion", null, 1, 1, MemberSelectionGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(memberSelectionEClass, MemberSelection.class, "MemberSelection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMemberSelection_Dimension(), this.getDimension(), this.getDimension_MemberSelection(), "dimension", null, 1, 1, MemberSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMemberSelection_MemberSelectionGroup(), this.getMemberSelectionGroup(), this.getMemberSelectionGroup_MemberSelection(), "memberSelectionGroup", null, 0, -1, MemberSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(schemaEClass, Schema.class, "Schema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSchema_Cube(), this.getCube(), this.getCube_Schema(), "cube", null, 0, -1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSchema_Dimension(), this.getDimension(), this.getDimension_Schema(), "dimension", null, 0, -1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSchema_DeploymentGroup(), this.getDeploymentGroup(), this.getDeploymentGroup_Schema(), "deploymentGroup", null, 0, -1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(valueBasedHierarchyEClass, ValueBasedHierarchy.class, "ValueBasedHierarchy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueBasedHierarchy_DimensionDeployment(), this.getDimensionDeployment(), this.getDimensionDeployment_ValueBasedHierarchy(), "dimensionDeployment", null, 0, -1, ValueBasedHierarchy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(levelEClass, Level.class, "Level", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLevel_HierarchyLevelAssociation(), this.getHierarchyLevelAssociation(), this.getHierarchyLevelAssociation_CurrentLevel(), "hierarchyLevelAssociation", null, 0, -1, Level.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(codedLevelEClass, CodedLevel.class, "CodedLevel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCodedLevel_Encoding(), theExpressionsPackage.getExpressionNode(), null, "encoding", null, 1, 1, CodedLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(measureEClass, Measure.class, "Measure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(structureMapEClass, StructureMap.class, "StructureMap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructureMap_DimensionDeployment(), this.getDimensionDeployment(), this.getDimensionDeployment_StructureMap(), "dimensionDeployment", null, 1, 1, StructureMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStructureMap_DimensionDeploymentLV(), this.getDimensionDeployment(), this.getDimensionDeployment_ListOfValues(), "dimensionDeploymentLV", null, 0, 1, StructureMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStructureMap_DimensionDeploymentIP(), this.getDimensionDeployment(), this.getDimensionDeployment_ImmediateParent(), "dimensionDeploymentIP", null, 0, 1, StructureMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(hierarchyMemberSelectionGroupEClass, HierarchyMemberSelectionGroup.class, "HierarchyMemberSelectionGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHierarchyMemberSelectionGroup_Hierarchy(), this.getHierarchy(), this.getHierarchy_HierarchyMemberSelectionGroup(), "hierarchy", null, 1, -1, HierarchyMemberSelectionGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(olap_containerEClass, Olap_container.class, "Olap_container", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOlap_container_ContentMap(), this.getContentMap(), null, "ContentMap", null, 0, -1, Olap_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOlap_container_Cube(), this.getCube(), null, "Cube", null, 0, -1, Olap_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOlap_container_CubeDeployment(), this.getCubeDeployment(), null, "CubeDeployment", null, 0, -1, Olap_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOlap_container_CubeDimensionAssociation(), this.getCubeDimensionAssociation(), null, "CubeDimensionAssociation", null, 0, -1, Olap_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOlap_container_CubeRegion(), this.getCubeRegion(), null, "CubeRegion", null, 0, -1, Olap_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOlap_container_DeploymentGroup(), this.getDeploymentGroup(), null, "DeploymentGroup", null, 0, -1, Olap_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOlap_container_Dimension(), this.getDimension(), null, "Dimension", null, 0, -1, Olap_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOlap_container_DimensionDeployment(), this.getDimensionDeployment(), null, "DimensionDeployment", null, 0, -1, Olap_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOlap_container_Hierarchy(), this.getHierarchy(), null, "Hierarchy", null, 0, -1, Olap_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOlap_container_HierarchyLevelAssociation(), this.getHierarchyLevelAssociation(), null, "HierarchyLevelAssociation", null, 0, -1, Olap_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOlap_container_LevelBasedHierarchy(), this.getLevelBasedHierarchy(), null, "LevelBasedHierarchy", null, 0, -1, Olap_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOlap_container_MemberSelectionGroup(), this.getMemberSelectionGroup(), null, "MemberSelectionGroup", null, 0, -1, Olap_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOlap_container_MemberSelection(), this.getMemberSelection(), null, "MemberSelection", null, 0, -1, Olap_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOlap_container_Schema(), this.getSchema(), null, "Schema", null, 0, -1, Olap_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOlap_container_ValueBasedHierarchy(), this.getValueBasedHierarchy(), null, "ValueBasedHierarchy", null, 0, -1, Olap_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOlap_container_Level(), this.getLevel(), null, "Level", null, 0, -1, Olap_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOlap_container_CodedLevel(), this.getCodedLevel(), null, "CodedLevel", null, 0, -1, Olap_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOlap_container_Measure(), this.getMeasure(), null, "Measure", null, 0, -1, Olap_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOlap_container_StructureMap(), this.getStructureMap(), null, "StructureMap", null, 0, -1, Olap_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOlap_container_HierarchyMemberSelectionGroup(), this.getHierarchyMemberSelectionGroup(), null, "HierarchyMemberSelectionGroup", null, 0, -1, Olap_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //OlapPackageImpl

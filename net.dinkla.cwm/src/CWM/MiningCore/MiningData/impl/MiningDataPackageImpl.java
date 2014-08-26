/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningData.impl;

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

import CWM.MiningCore.MiningData.AttributeAssignment;
import CWM.MiningCore.MiningData.AttributeAssignmentSet;
import CWM.MiningCore.MiningData.AttributeSelectionFunction;
import CWM.MiningCore.MiningData.AttributeType;
import CWM.MiningCore.MiningData.AttributeUsage;
import CWM.MiningCore.MiningData.AttributeUsageSet;
import CWM.MiningCore.MiningData.CategoricalAttributeProperties;
import CWM.MiningCore.MiningData.Category;
import CWM.MiningCore.MiningData.CategoryMap;
import CWM.MiningCore.MiningData.CategoryMapObject;
import CWM.MiningCore.MiningData.CategoryMapObjectEntry;
import CWM.MiningCore.MiningData.CategoryMapTable;
import CWM.MiningCore.MiningData.CategoryMatrix;
import CWM.MiningCore.MiningData.CategoryMatrixEntry;
import CWM.MiningCore.MiningData.CategoryMatrixObject;
import CWM.MiningCore.MiningData.CategoryMatrixTable;
import CWM.MiningCore.MiningData.CategoryProperty;
import CWM.MiningCore.MiningData.CategoryTaxonomy;
import CWM.MiningCore.MiningData.DirectAttributeAssignment;
import CWM.MiningCore.MiningData.LogicalAttribute;
import CWM.MiningCore.MiningData.LogicalData;
import CWM.MiningCore.MiningData.MatrixProperty;
import CWM.MiningCore.MiningData.MiningAttribute;
import CWM.MiningCore.MiningData.MiningDataFactory;
import CWM.MiningCore.MiningData.MiningDataPackage;
import CWM.MiningCore.MiningData.MiningData_container;
import CWM.MiningCore.MiningData.NumericalAttributeProperties;
import CWM.MiningCore.MiningData.OrderType;
import CWM.MiningCore.MiningData.OrdinalAttributeProperties;
import CWM.MiningCore.MiningData.PhysicalData;
import CWM.MiningCore.MiningData.PivotAttributeAssignment;
import CWM.MiningCore.MiningData.ReversePivotAttributeAssignment;
import CWM.MiningCore.MiningData.SetAttributeAssignment;
import CWM.MiningCore.MiningData.UsageOption;
import CWM.MiningCore.MiningData.ValueSelectionFunction;

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

import CWM.impl.CWMPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class MiningDataPackageImpl extends EPackageImpl implements MiningDataPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeAssignmentSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeUsageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeUsageSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categoricalAttributePropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directAttributeAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass miningAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numericalAttributePropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ordinalAttributePropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pivotAttributeAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reversePivotAttributeAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setAttributeAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categoryMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categoryMapObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categoryMapObjectEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categoryMapTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categoryMatrixEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categoryMatrixEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categoryMatrixObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categoryMatrixTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categoryTaxonomyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass miningData_containerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum attributeSelectionFunctionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum attributeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum orderTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum usageOptionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum valueSelectionFunctionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum categoryPropertyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum matrixPropertyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType doubleEDataType = null;

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
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MiningDataPackageImpl() {
		super(eNS_URI, MiningDataFactory.eINSTANCE);
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
	public static MiningDataPackage init() {
		if (isInited) return (MiningDataPackage)EPackage.Registry.INSTANCE.getEPackage(MiningDataPackage.eNS_URI);

		// Obtain or create and register package
		MiningDataPackageImpl theMiningDataPackage = (MiningDataPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof MiningDataPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new MiningDataPackageImpl());

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
		theMiningDataPackage.createPackageContents();
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
		theMiningDataPackage.initializePackageContents();
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
		theMiningDataPackage.freeze();

		return theMiningDataPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeAssignment() {
		return attributeAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeAssignment_OrderIdAttribute() {
		return (EReference)attributeAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeAssignment_LogicalAttribute() {
		return (EReference)attributeAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeAssignmentSet() {
		return attributeAssignmentSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeAssignmentSet_Assignment() {
		return (EReference)attributeAssignmentSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeUsage() {
		return attributeUsageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeUsage_Usage() {
		return (EAttribute)attributeUsageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeUsage_Weight() {
		return (EAttribute)attributeUsageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeUsage_Attribute() {
		return (EReference)attributeUsageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeUsage_SuppressDiscretization() {
		return (EAttribute)attributeUsageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeUsage_SuppressNormalization() {
		return (EAttribute)attributeUsageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeUsageSet() {
		return attributeUsageSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategoricalAttributeProperties() {
		return categoricalAttributePropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategoricalAttributeProperties_Category() {
		return (EReference)categoricalAttributePropertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategoricalAttributeProperties_Taxonomy() {
		return (EReference)categoricalAttributePropertiesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirectAttributeAssignment() {
		return directAttributeAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDirectAttributeAssignment_Attribute() {
		return (EReference)directAttributeAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicalAttribute() {
		return logicalAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicalAttribute_IsSetValued() {
		return (EAttribute)logicalAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalAttribute_CategoricalProperties() {
		return (EReference)logicalAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalAttribute_NumericalProperties() {
		return (EReference)logicalAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicalData() {
		return logicalDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMiningAttribute() {
		return miningAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMiningAttribute_DisplayName() {
		return (EAttribute)miningAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMiningAttribute_AttributeType() {
		return (EAttribute)miningAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumericalAttributeProperties() {
		return numericalAttributePropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumericalAttributeProperties_LowerBound() {
		return (EAttribute)numericalAttributePropertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumericalAttributeProperties_UpperBound() {
		return (EAttribute)numericalAttributePropertiesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumericalAttributeProperties_IsDiscrete() {
		return (EAttribute)numericalAttributePropertiesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumericalAttributeProperties_IsCyclic() {
		return (EAttribute)numericalAttributePropertiesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumericalAttributeProperties_Anchor() {
		return (EAttribute)numericalAttributePropertiesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumericalAttributeProperties_CycleBegin() {
		return (EAttribute)numericalAttributePropertiesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumericalAttributeProperties_CycleEnd() {
		return (EAttribute)numericalAttributePropertiesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumericalAttributeProperties_DiscreteStepSize() {
		return (EAttribute)numericalAttributePropertiesEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrdinalAttributeProperties() {
		return ordinalAttributePropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrdinalAttributeProperties_OrderType() {
		return (EAttribute)ordinalAttributePropertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrdinalAttributeProperties_IsCyclic() {
		return (EAttribute)ordinalAttributePropertiesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalData() {
		return physicalDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalData_Source() {
		return (EReference)physicalDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPivotAttributeAssignment() {
		return pivotAttributeAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPivotAttributeAssignment_SetIdAttribute() {
		return (EReference)pivotAttributeAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPivotAttributeAssignment_NameAttribute() {
		return (EReference)pivotAttributeAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPivotAttributeAssignment_ValueAttribute() {
		return (EReference)pivotAttributeAssignmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReversePivotAttributeAssignment() {
		return reversePivotAttributeAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReversePivotAttributeAssignment_SelectorAttribute() {
		return (EReference)reversePivotAttributeAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReversePivotAttributeAssignment_AttributeSelectionFunction() {
		return (EAttribute)reversePivotAttributeAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReversePivotAttributeAssignment_ValueSelectionFunction() {
		return (EAttribute)reversePivotAttributeAssignmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetAttributeAssignment() {
		return setAttributeAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetAttributeAssignment_SetIdAttribute() {
		return (EReference)setAttributeAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetAttributeAssignment_MemberAttribute() {
		return (EReference)setAttributeAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategory() {
		return categoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCategory_Value() {
		return (EAttribute)categoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCategory_IsNullCategory() {
		return (EAttribute)categoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCategory_DisplayName() {
		return (EAttribute)categoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCategory_Property() {
		return (EAttribute)categoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCategory_Prior() {
		return (EAttribute)categoryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategoryMap() {
		return categoryMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCategoryMap_IsMultiLevel() {
		return (EAttribute)categoryMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCategoryMap_IsItemMap() {
		return (EAttribute)categoryMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategoryMapObject() {
		return categoryMapObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategoryMapObject_Entry() {
		return (EReference)categoryMapObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategoryMapObjectEntry() {
		return categoryMapObjectEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategoryMapObjectEntry_Child() {
		return (EReference)categoryMapObjectEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategoryMapObjectEntry_Parent() {
		return (EReference)categoryMapObjectEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCategoryMapObjectEntry_GraphId() {
		return (EAttribute)categoryMapObjectEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategoryMapTable() {
		return categoryMapTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategoryMapTable_ChildAttribute() {
		return (EReference)categoryMapTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategoryMapTable_ParentAttribute() {
		return (EReference)categoryMapTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategoryMapTable_GraphIdAttribute() {
		return (EReference)categoryMapTableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategoryMapTable_Table() {
		return (EReference)categoryMapTableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategoryMatrix() {
		return categoryMatrixEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCategoryMatrix_DiagonalDefault() {
		return (EAttribute)categoryMatrixEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCategoryMatrix_OffDiagonalDefault() {
		return (EAttribute)categoryMatrixEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCategoryMatrix_Kind() {
		return (EAttribute)categoryMatrixEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategoryMatrix_Category() {
		return (EReference)categoryMatrixEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategoryMatrixEntry() {
		return categoryMatrixEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategoryMatrixEntry_RowIndex() {
		return (EReference)categoryMatrixEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategoryMatrixEntry_ColumnIndex() {
		return (EReference)categoryMatrixEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCategoryMatrixEntry_Value() {
		return (EAttribute)categoryMatrixEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategoryMatrixObject() {
		return categoryMatrixObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategoryMatrixObject_Entry() {
		return (EReference)categoryMatrixObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategoryMatrixTable() {
		return categoryMatrixTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategoryMatrixTable_RowAttribute() {
		return (EReference)categoryMatrixTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategoryMatrixTable_ColumnAttribute() {
		return (EReference)categoryMatrixTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategoryMatrixTable_ValueAttribute() {
		return (EReference)categoryMatrixTableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategoryMatrixTable_Source() {
		return (EReference)categoryMatrixTableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategoryTaxonomy() {
		return categoryTaxonomyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategoryTaxonomy_CategoryMap() {
		return (EReference)categoryTaxonomyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategoryTaxonomy_RootCategory() {
		return (EReference)categoryTaxonomyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMiningData_container() {
		return miningData_containerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMiningData_container_AttributeAssignment() {
		return (EReference)miningData_containerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMiningData_container_AttributeAssignmentSet() {
		return (EReference)miningData_containerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMiningData_container_AttributeUsage() {
		return (EReference)miningData_containerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMiningData_container_AttributeUsageSet() {
		return (EReference)miningData_containerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMiningData_container_CategoricalAttributeProperties() {
		return (EReference)miningData_containerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMiningData_container_DirectAttributeAssignment() {
		return (EReference)miningData_containerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMiningData_container_LogicalAttribute() {
		return (EReference)miningData_containerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMiningData_container_LogicalData() {
		return (EReference)miningData_containerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMiningData_container_MiningAttribute() {
		return (EReference)miningData_containerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMiningData_container_NumericalAttributeProperties() {
		return (EReference)miningData_containerEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMiningData_container_OrdinalAttributeProperties() {
		return (EReference)miningData_containerEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMiningData_container_PhysicalData() {
		return (EReference)miningData_containerEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMiningData_container_PivotAttributeAssignment() {
		return (EReference)miningData_containerEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMiningData_container_ReversePivotAttributeAssignment() {
		return (EReference)miningData_containerEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMiningData_container_SetAttributeAssignment() {
		return (EReference)miningData_containerEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMiningData_container_Category() {
		return (EReference)miningData_containerEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMiningData_container_CategoryMap() {
		return (EReference)miningData_containerEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMiningData_container_CategoryMapObject() {
		return (EReference)miningData_containerEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMiningData_container_CategoryMapObjectEntry() {
		return (EReference)miningData_containerEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMiningData_container_CategoryMapTable() {
		return (EReference)miningData_containerEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMiningData_container_CategoryMatrix() {
		return (EReference)miningData_containerEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMiningData_container_CategoryMatrixEntry() {
		return (EReference)miningData_containerEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMiningData_container_CategoryMatrixObject() {
		return (EReference)miningData_containerEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMiningData_container_CategoryMatrixTable() {
		return (EReference)miningData_containerEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMiningData_container_CategoryTaxonomy() {
		return (EReference)miningData_containerEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAttributeSelectionFunction() {
		return attributeSelectionFunctionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAttributeType() {
		return attributeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOrderType() {
		return orderTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUsageOption() {
		return usageOptionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getValueSelectionFunction() {
		return valueSelectionFunctionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCategoryProperty() {
		return categoryPropertyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMatrixProperty() {
		return matrixPropertyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDouble() {
		return doubleEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiningDataFactory getMiningDataFactory() {
		return (MiningDataFactory)getEFactoryInstance();
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
		attributeAssignmentEClass = createEClass(ATTRIBUTE_ASSIGNMENT);
		createEReference(attributeAssignmentEClass, ATTRIBUTE_ASSIGNMENT__ORDER_ID_ATTRIBUTE);
		createEReference(attributeAssignmentEClass, ATTRIBUTE_ASSIGNMENT__LOGICAL_ATTRIBUTE);

		attributeAssignmentSetEClass = createEClass(ATTRIBUTE_ASSIGNMENT_SET);
		createEReference(attributeAssignmentSetEClass, ATTRIBUTE_ASSIGNMENT_SET__ASSIGNMENT);

		attributeUsageEClass = createEClass(ATTRIBUTE_USAGE);
		createEAttribute(attributeUsageEClass, ATTRIBUTE_USAGE__USAGE);
		createEAttribute(attributeUsageEClass, ATTRIBUTE_USAGE__WEIGHT);
		createEReference(attributeUsageEClass, ATTRIBUTE_USAGE__ATTRIBUTE);
		createEAttribute(attributeUsageEClass, ATTRIBUTE_USAGE__SUPPRESS_DISCRETIZATION);
		createEAttribute(attributeUsageEClass, ATTRIBUTE_USAGE__SUPPRESS_NORMALIZATION);

		attributeUsageSetEClass = createEClass(ATTRIBUTE_USAGE_SET);

		categoricalAttributePropertiesEClass = createEClass(CATEGORICAL_ATTRIBUTE_PROPERTIES);
		createEReference(categoricalAttributePropertiesEClass, CATEGORICAL_ATTRIBUTE_PROPERTIES__CATEGORY);
		createEReference(categoricalAttributePropertiesEClass, CATEGORICAL_ATTRIBUTE_PROPERTIES__TAXONOMY);

		directAttributeAssignmentEClass = createEClass(DIRECT_ATTRIBUTE_ASSIGNMENT);
		createEReference(directAttributeAssignmentEClass, DIRECT_ATTRIBUTE_ASSIGNMENT__ATTRIBUTE);

		logicalAttributeEClass = createEClass(LOGICAL_ATTRIBUTE);
		createEAttribute(logicalAttributeEClass, LOGICAL_ATTRIBUTE__IS_SET_VALUED);
		createEReference(logicalAttributeEClass, LOGICAL_ATTRIBUTE__CATEGORICAL_PROPERTIES);
		createEReference(logicalAttributeEClass, LOGICAL_ATTRIBUTE__NUMERICAL_PROPERTIES);

		logicalDataEClass = createEClass(LOGICAL_DATA);

		miningAttributeEClass = createEClass(MINING_ATTRIBUTE);
		createEAttribute(miningAttributeEClass, MINING_ATTRIBUTE__DISPLAY_NAME);
		createEAttribute(miningAttributeEClass, MINING_ATTRIBUTE__ATTRIBUTE_TYPE);

		numericalAttributePropertiesEClass = createEClass(NUMERICAL_ATTRIBUTE_PROPERTIES);
		createEAttribute(numericalAttributePropertiesEClass, NUMERICAL_ATTRIBUTE_PROPERTIES__LOWER_BOUND);
		createEAttribute(numericalAttributePropertiesEClass, NUMERICAL_ATTRIBUTE_PROPERTIES__UPPER_BOUND);
		createEAttribute(numericalAttributePropertiesEClass, NUMERICAL_ATTRIBUTE_PROPERTIES__IS_DISCRETE);
		createEAttribute(numericalAttributePropertiesEClass, NUMERICAL_ATTRIBUTE_PROPERTIES__IS_CYCLIC);
		createEAttribute(numericalAttributePropertiesEClass, NUMERICAL_ATTRIBUTE_PROPERTIES__ANCHOR);
		createEAttribute(numericalAttributePropertiesEClass, NUMERICAL_ATTRIBUTE_PROPERTIES__CYCLE_BEGIN);
		createEAttribute(numericalAttributePropertiesEClass, NUMERICAL_ATTRIBUTE_PROPERTIES__CYCLE_END);
		createEAttribute(numericalAttributePropertiesEClass, NUMERICAL_ATTRIBUTE_PROPERTIES__DISCRETE_STEP_SIZE);

		ordinalAttributePropertiesEClass = createEClass(ORDINAL_ATTRIBUTE_PROPERTIES);
		createEAttribute(ordinalAttributePropertiesEClass, ORDINAL_ATTRIBUTE_PROPERTIES__ORDER_TYPE);
		createEAttribute(ordinalAttributePropertiesEClass, ORDINAL_ATTRIBUTE_PROPERTIES__IS_CYCLIC);

		physicalDataEClass = createEClass(PHYSICAL_DATA);
		createEReference(physicalDataEClass, PHYSICAL_DATA__SOURCE);

		pivotAttributeAssignmentEClass = createEClass(PIVOT_ATTRIBUTE_ASSIGNMENT);
		createEReference(pivotAttributeAssignmentEClass, PIVOT_ATTRIBUTE_ASSIGNMENT__SET_ID_ATTRIBUTE);
		createEReference(pivotAttributeAssignmentEClass, PIVOT_ATTRIBUTE_ASSIGNMENT__NAME_ATTRIBUTE);
		createEReference(pivotAttributeAssignmentEClass, PIVOT_ATTRIBUTE_ASSIGNMENT__VALUE_ATTRIBUTE);

		reversePivotAttributeAssignmentEClass = createEClass(REVERSE_PIVOT_ATTRIBUTE_ASSIGNMENT);
		createEReference(reversePivotAttributeAssignmentEClass, REVERSE_PIVOT_ATTRIBUTE_ASSIGNMENT__SELECTOR_ATTRIBUTE);
		createEAttribute(reversePivotAttributeAssignmentEClass, REVERSE_PIVOT_ATTRIBUTE_ASSIGNMENT__ATTRIBUTE_SELECTION_FUNCTION);
		createEAttribute(reversePivotAttributeAssignmentEClass, REVERSE_PIVOT_ATTRIBUTE_ASSIGNMENT__VALUE_SELECTION_FUNCTION);

		setAttributeAssignmentEClass = createEClass(SET_ATTRIBUTE_ASSIGNMENT);
		createEReference(setAttributeAssignmentEClass, SET_ATTRIBUTE_ASSIGNMENT__SET_ID_ATTRIBUTE);
		createEReference(setAttributeAssignmentEClass, SET_ATTRIBUTE_ASSIGNMENT__MEMBER_ATTRIBUTE);

		categoryEClass = createEClass(CATEGORY);
		createEAttribute(categoryEClass, CATEGORY__VALUE);
		createEAttribute(categoryEClass, CATEGORY__IS_NULL_CATEGORY);
		createEAttribute(categoryEClass, CATEGORY__DISPLAY_NAME);
		createEAttribute(categoryEClass, CATEGORY__PROPERTY);
		createEAttribute(categoryEClass, CATEGORY__PRIOR);

		categoryMapEClass = createEClass(CATEGORY_MAP);
		createEAttribute(categoryMapEClass, CATEGORY_MAP__IS_MULTI_LEVEL);
		createEAttribute(categoryMapEClass, CATEGORY_MAP__IS_ITEM_MAP);

		categoryMapObjectEClass = createEClass(CATEGORY_MAP_OBJECT);
		createEReference(categoryMapObjectEClass, CATEGORY_MAP_OBJECT__ENTRY);

		categoryMapObjectEntryEClass = createEClass(CATEGORY_MAP_OBJECT_ENTRY);
		createEReference(categoryMapObjectEntryEClass, CATEGORY_MAP_OBJECT_ENTRY__CHILD);
		createEReference(categoryMapObjectEntryEClass, CATEGORY_MAP_OBJECT_ENTRY__PARENT);
		createEAttribute(categoryMapObjectEntryEClass, CATEGORY_MAP_OBJECT_ENTRY__GRAPH_ID);

		categoryMapTableEClass = createEClass(CATEGORY_MAP_TABLE);
		createEReference(categoryMapTableEClass, CATEGORY_MAP_TABLE__CHILD_ATTRIBUTE);
		createEReference(categoryMapTableEClass, CATEGORY_MAP_TABLE__PARENT_ATTRIBUTE);
		createEReference(categoryMapTableEClass, CATEGORY_MAP_TABLE__GRAPH_ID_ATTRIBUTE);
		createEReference(categoryMapTableEClass, CATEGORY_MAP_TABLE__TABLE);

		categoryMatrixEClass = createEClass(CATEGORY_MATRIX);
		createEAttribute(categoryMatrixEClass, CATEGORY_MATRIX__DIAGONAL_DEFAULT);
		createEAttribute(categoryMatrixEClass, CATEGORY_MATRIX__OFF_DIAGONAL_DEFAULT);
		createEAttribute(categoryMatrixEClass, CATEGORY_MATRIX__KIND);
		createEReference(categoryMatrixEClass, CATEGORY_MATRIX__CATEGORY);

		categoryMatrixEntryEClass = createEClass(CATEGORY_MATRIX_ENTRY);
		createEReference(categoryMatrixEntryEClass, CATEGORY_MATRIX_ENTRY__ROW_INDEX);
		createEReference(categoryMatrixEntryEClass, CATEGORY_MATRIX_ENTRY__COLUMN_INDEX);
		createEAttribute(categoryMatrixEntryEClass, CATEGORY_MATRIX_ENTRY__VALUE);

		categoryMatrixObjectEClass = createEClass(CATEGORY_MATRIX_OBJECT);
		createEReference(categoryMatrixObjectEClass, CATEGORY_MATRIX_OBJECT__ENTRY);

		categoryMatrixTableEClass = createEClass(CATEGORY_MATRIX_TABLE);
		createEReference(categoryMatrixTableEClass, CATEGORY_MATRIX_TABLE__ROW_ATTRIBUTE);
		createEReference(categoryMatrixTableEClass, CATEGORY_MATRIX_TABLE__COLUMN_ATTRIBUTE);
		createEReference(categoryMatrixTableEClass, CATEGORY_MATRIX_TABLE__VALUE_ATTRIBUTE);
		createEReference(categoryMatrixTableEClass, CATEGORY_MATRIX_TABLE__SOURCE);

		categoryTaxonomyEClass = createEClass(CATEGORY_TAXONOMY);
		createEReference(categoryTaxonomyEClass, CATEGORY_TAXONOMY__CATEGORY_MAP);
		createEReference(categoryTaxonomyEClass, CATEGORY_TAXONOMY__ROOT_CATEGORY);

		miningData_containerEClass = createEClass(MINING_DATA_CONTAINER);
		createEReference(miningData_containerEClass, MINING_DATA_CONTAINER__ATTRIBUTE_ASSIGNMENT);
		createEReference(miningData_containerEClass, MINING_DATA_CONTAINER__ATTRIBUTE_ASSIGNMENT_SET);
		createEReference(miningData_containerEClass, MINING_DATA_CONTAINER__ATTRIBUTE_USAGE);
		createEReference(miningData_containerEClass, MINING_DATA_CONTAINER__ATTRIBUTE_USAGE_SET);
		createEReference(miningData_containerEClass, MINING_DATA_CONTAINER__CATEGORICAL_ATTRIBUTE_PROPERTIES);
		createEReference(miningData_containerEClass, MINING_DATA_CONTAINER__DIRECT_ATTRIBUTE_ASSIGNMENT);
		createEReference(miningData_containerEClass, MINING_DATA_CONTAINER__LOGICAL_ATTRIBUTE);
		createEReference(miningData_containerEClass, MINING_DATA_CONTAINER__LOGICAL_DATA);
		createEReference(miningData_containerEClass, MINING_DATA_CONTAINER__MINING_ATTRIBUTE);
		createEReference(miningData_containerEClass, MINING_DATA_CONTAINER__NUMERICAL_ATTRIBUTE_PROPERTIES);
		createEReference(miningData_containerEClass, MINING_DATA_CONTAINER__ORDINAL_ATTRIBUTE_PROPERTIES);
		createEReference(miningData_containerEClass, MINING_DATA_CONTAINER__PHYSICAL_DATA);
		createEReference(miningData_containerEClass, MINING_DATA_CONTAINER__PIVOT_ATTRIBUTE_ASSIGNMENT);
		createEReference(miningData_containerEClass, MINING_DATA_CONTAINER__REVERSE_PIVOT_ATTRIBUTE_ASSIGNMENT);
		createEReference(miningData_containerEClass, MINING_DATA_CONTAINER__SET_ATTRIBUTE_ASSIGNMENT);
		createEReference(miningData_containerEClass, MINING_DATA_CONTAINER__CATEGORY);
		createEReference(miningData_containerEClass, MINING_DATA_CONTAINER__CATEGORY_MAP);
		createEReference(miningData_containerEClass, MINING_DATA_CONTAINER__CATEGORY_MAP_OBJECT);
		createEReference(miningData_containerEClass, MINING_DATA_CONTAINER__CATEGORY_MAP_OBJECT_ENTRY);
		createEReference(miningData_containerEClass, MINING_DATA_CONTAINER__CATEGORY_MAP_TABLE);
		createEReference(miningData_containerEClass, MINING_DATA_CONTAINER__CATEGORY_MATRIX);
		createEReference(miningData_containerEClass, MINING_DATA_CONTAINER__CATEGORY_MATRIX_ENTRY);
		createEReference(miningData_containerEClass, MINING_DATA_CONTAINER__CATEGORY_MATRIX_OBJECT);
		createEReference(miningData_containerEClass, MINING_DATA_CONTAINER__CATEGORY_MATRIX_TABLE);
		createEReference(miningData_containerEClass, MINING_DATA_CONTAINER__CATEGORY_TAXONOMY);

		// Create enums
		attributeSelectionFunctionEEnum = createEEnum(ATTRIBUTE_SELECTION_FUNCTION);
		attributeTypeEEnum = createEEnum(ATTRIBUTE_TYPE);
		orderTypeEEnum = createEEnum(ORDER_TYPE);
		usageOptionEEnum = createEEnum(USAGE_OPTION);
		valueSelectionFunctionEEnum = createEEnum(VALUE_SELECTION_FUNCTION);
		categoryPropertyEEnum = createEEnum(CATEGORY_PROPERTY);
		matrixPropertyEEnum = createEEnum(MATRIX_PROPERTY);

		// Create data types
		doubleEDataType = createEDataType(DOUBLE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		attributeAssignmentEClass.getESuperTypes().add(theCorePackage.getModelElement());
		attributeAssignmentSetEClass.getESuperTypes().add(theCorePackage.getModelElement());
		attributeUsageEClass.getESuperTypes().add(theCorePackage.getFeature());
		attributeUsageSetEClass.getESuperTypes().add(theCorePackage.getClass_());
		categoricalAttributePropertiesEClass.getESuperTypes().add(theCorePackage.getModelElement());
		directAttributeAssignmentEClass.getESuperTypes().add(this.getAttributeAssignment());
		logicalAttributeEClass.getESuperTypes().add(this.getMiningAttribute());
		logicalDataEClass.getESuperTypes().add(theCorePackage.getClass_());
		miningAttributeEClass.getESuperTypes().add(theCorePackage.getAttribute());
		numericalAttributePropertiesEClass.getESuperTypes().add(theCorePackage.getModelElement());
		ordinalAttributePropertiesEClass.getESuperTypes().add(this.getCategoricalAttributeProperties());
		physicalDataEClass.getESuperTypes().add(theCorePackage.getModelElement());
		pivotAttributeAssignmentEClass.getESuperTypes().add(this.getAttributeAssignment());
		reversePivotAttributeAssignmentEClass.getESuperTypes().add(this.getAttributeAssignment());
		setAttributeAssignmentEClass.getESuperTypes().add(this.getAttributeAssignment());
		categoryEClass.getESuperTypes().add(theCorePackage.getModelElement());
		categoryMapEClass.getESuperTypes().add(theCorePackage.getModelElement());
		categoryMapObjectEClass.getESuperTypes().add(theCorePackage.getModelElement());
		categoryMapObjectEClass.getESuperTypes().add(this.getCategoryMap());
		categoryMapObjectEntryEClass.getESuperTypes().add(theCorePackage.getModelElement());
		categoryMapTableEClass.getESuperTypes().add(theCorePackage.getModelElement());
		categoryMapTableEClass.getESuperTypes().add(this.getCategoryMap());
		categoryMatrixEClass.getESuperTypes().add(theCorePackage.getModelElement());
		categoryMatrixEntryEClass.getESuperTypes().add(theCorePackage.getModelElement());
		categoryMatrixObjectEClass.getESuperTypes().add(this.getCategoryMatrix());
		categoryMatrixTableEClass.getESuperTypes().add(this.getCategoryMatrix());
		categoryTaxonomyEClass.getESuperTypes().add(theCorePackage.getModelElement());

		// Initialize classes and features; add operations and parameters
		initEClass(attributeAssignmentEClass, AttributeAssignment.class, "AttributeAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeAssignment_OrderIdAttribute(), theCorePackage.getAttribute(), null, "orderIdAttribute", null, 0, -1, AttributeAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeAssignment_LogicalAttribute(), this.getMiningAttribute(), null, "logicalAttribute", null, 1, -1, AttributeAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(attributeAssignmentSetEClass, AttributeAssignmentSet.class, "AttributeAssignmentSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeAssignmentSet_Assignment(), this.getAttributeAssignment(), null, "assignment", null, 1, -1, AttributeAssignmentSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(attributeUsageEClass, AttributeUsage.class, "AttributeUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeUsage_Usage(), this.getUsageOption(), "usage", null, 1, 1, AttributeUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAttributeUsage_Weight(), this.getDouble(), "weight", null, 1, 1, AttributeUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAttributeUsage_Attribute(), this.getLogicalAttribute(), null, "attribute", null, 1, -1, AttributeUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAttributeUsage_SuppressDiscretization(), theCorePackage.getBoolean(), "suppressDiscretization", null, 1, 1, AttributeUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAttributeUsage_SuppressNormalization(), theCorePackage.getBoolean(), "suppressNormalization", null, 1, 1, AttributeUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(attributeUsageSetEClass, AttributeUsageSet.class, "AttributeUsageSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(categoricalAttributePropertiesEClass, CategoricalAttributeProperties.class, "CategoricalAttributeProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCategoricalAttributeProperties_Category(), this.getCategory(), null, "category", null, 0, -1, CategoricalAttributeProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCategoricalAttributeProperties_Taxonomy(), this.getCategoryTaxonomy(), null, "taxonomy", null, 0, 1, CategoricalAttributeProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(directAttributeAssignmentEClass, DirectAttributeAssignment.class, "DirectAttributeAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDirectAttributeAssignment_Attribute(), theCorePackage.getAttribute(), null, "attribute", null, 1, 1, DirectAttributeAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(logicalAttributeEClass, LogicalAttribute.class, "LogicalAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLogicalAttribute_IsSetValued(), theCorePackage.getBoolean(), "isSetValued", null, 0, 1, LogicalAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLogicalAttribute_CategoricalProperties(), this.getCategoricalAttributeProperties(), null, "categoricalProperties", null, 0, 1, LogicalAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLogicalAttribute_NumericalProperties(), this.getNumericalAttributeProperties(), null, "numericalProperties", null, 0, 1, LogicalAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(logicalDataEClass, LogicalData.class, "LogicalData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(miningAttributeEClass, MiningAttribute.class, "MiningAttribute", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMiningAttribute_DisplayName(), theCorePackage.getString(), "displayName", null, 1, 1, MiningAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMiningAttribute_AttributeType(), this.getAttributeType(), "attributeType", null, 1, 1, MiningAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(numericalAttributePropertiesEClass, NumericalAttributeProperties.class, "NumericalAttributeProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumericalAttributeProperties_LowerBound(), this.getDouble(), "lowerBound", null, 1, 1, NumericalAttributeProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getNumericalAttributeProperties_UpperBound(), this.getDouble(), "upperBound", null, 1, 1, NumericalAttributeProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getNumericalAttributeProperties_IsDiscrete(), theCorePackage.getBoolean(), "isDiscrete", null, 1, 1, NumericalAttributeProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getNumericalAttributeProperties_IsCyclic(), theCorePackage.getBoolean(), "isCyclic", null, 0, 1, NumericalAttributeProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getNumericalAttributeProperties_Anchor(), this.getDouble(), "anchor", null, 0, 1, NumericalAttributeProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getNumericalAttributeProperties_CycleBegin(), this.getDouble(), "cycleBegin", null, 0, 1, NumericalAttributeProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getNumericalAttributeProperties_CycleEnd(), this.getDouble(), "cycleEnd", null, 0, 1, NumericalAttributeProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getNumericalAttributeProperties_DiscreteStepSize(), this.getDouble(), "discreteStepSize", null, 0, 1, NumericalAttributeProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ordinalAttributePropertiesEClass, OrdinalAttributeProperties.class, "OrdinalAttributeProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrdinalAttributeProperties_OrderType(), this.getOrderType(), "orderType", null, 1, 1, OrdinalAttributeProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOrdinalAttributeProperties_IsCyclic(), theCorePackage.getBoolean(), "isCyclic", null, 0, 1, OrdinalAttributeProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(physicalDataEClass, PhysicalData.class, "PhysicalData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPhysicalData_Source(), theCorePackage.getClass_(), null, "source", null, 1, 1, PhysicalData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(pivotAttributeAssignmentEClass, PivotAttributeAssignment.class, "PivotAttributeAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPivotAttributeAssignment_SetIdAttribute(), theCorePackage.getAttribute(), null, "setIdAttribute", null, 1, 1, PivotAttributeAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPivotAttributeAssignment_NameAttribute(), theCorePackage.getAttribute(), null, "nameAttribute", null, 1, 1, PivotAttributeAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPivotAttributeAssignment_ValueAttribute(), theCorePackage.getAttribute(), null, "valueAttribute", null, 1, 1, PivotAttributeAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(reversePivotAttributeAssignmentEClass, ReversePivotAttributeAssignment.class, "ReversePivotAttributeAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReversePivotAttributeAssignment_SelectorAttribute(), theCorePackage.getAttribute(), null, "selectorAttribute", null, 1, -1, ReversePivotAttributeAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getReversePivotAttributeAssignment_AttributeSelectionFunction(), this.getAttributeSelectionFunction(), "attributeSelectionFunction", null, 1, 1, ReversePivotAttributeAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getReversePivotAttributeAssignment_ValueSelectionFunction(), this.getValueSelectionFunction(), "valueSelectionFunction", null, 1, 1, ReversePivotAttributeAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(setAttributeAssignmentEClass, SetAttributeAssignment.class, "SetAttributeAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSetAttributeAssignment_SetIdAttribute(), theCorePackage.getAttribute(), null, "setIdAttribute", null, 1, 1, SetAttributeAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSetAttributeAssignment_MemberAttribute(), theCorePackage.getAttribute(), null, "memberAttribute", null, 1, 1, SetAttributeAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(categoryEClass, Category.class, "Category", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCategory_Value(), theCorePackage.getAny(), "value", null, 1, 1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCategory_IsNullCategory(), theCorePackage.getBoolean(), "isNullCategory", null, 0, 1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCategory_DisplayName(), theCorePackage.getString(), "displayName", null, 0, 1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCategory_Property(), this.getCategoryProperty(), "property", null, 1, 1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCategory_Prior(), this.getDouble(), "prior", null, 1, 1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(categoryMapEClass, CategoryMap.class, "CategoryMap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCategoryMap_IsMultiLevel(), theCorePackage.getBoolean(), "isMultiLevel", null, 1, 1, CategoryMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCategoryMap_IsItemMap(), theCorePackage.getBoolean(), "isItemMap", null, 1, 1, CategoryMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(categoryMapObjectEClass, CategoryMapObject.class, "CategoryMapObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCategoryMapObject_Entry(), this.getCategoryMapObjectEntry(), null, "entry", null, 0, -1, CategoryMapObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(categoryMapObjectEntryEClass, CategoryMapObjectEntry.class, "CategoryMapObjectEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCategoryMapObjectEntry_Child(), this.getCategory(), null, "child", null, 1, 1, CategoryMapObjectEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCategoryMapObjectEntry_Parent(), this.getCategory(), null, "parent", null, 1, -1, CategoryMapObjectEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCategoryMapObjectEntry_GraphId(), theCorePackage.getAny(), "graphId", null, 1, 1, CategoryMapObjectEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(categoryMapTableEClass, CategoryMapTable.class, "CategoryMapTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCategoryMapTable_ChildAttribute(), theCorePackage.getAttribute(), null, "childAttribute", null, 1, 1, CategoryMapTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCategoryMapTable_ParentAttribute(), theCorePackage.getAttribute(), null, "parentAttribute", null, 1, 1, CategoryMapTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCategoryMapTable_GraphIdAttribute(), theCorePackage.getAttribute(), null, "graphIdAttribute", null, 0, 1, CategoryMapTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCategoryMapTable_Table(), theCorePackage.getClass_(), null, "table", null, 1, 1, CategoryMapTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(categoryMatrixEClass, CategoryMatrix.class, "CategoryMatrix", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCategoryMatrix_DiagonalDefault(), this.getDouble(), "diagonalDefault", null, 1, 1, CategoryMatrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCategoryMatrix_OffDiagonalDefault(), this.getDouble(), "offDiagonalDefault", null, 1, 1, CategoryMatrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCategoryMatrix_Kind(), this.getMatrixProperty(), "kind", null, 1, 1, CategoryMatrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCategoryMatrix_Category(), this.getCategory(), null, "category", null, 2, -1, CategoryMatrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(categoryMatrixEntryEClass, CategoryMatrixEntry.class, "CategoryMatrixEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCategoryMatrixEntry_RowIndex(), this.getCategory(), null, "rowIndex", null, 1, 1, CategoryMatrixEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCategoryMatrixEntry_ColumnIndex(), this.getCategory(), null, "columnIndex", null, 1, 1, CategoryMatrixEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCategoryMatrixEntry_Value(), this.getDouble(), "value", null, 1, 1, CategoryMatrixEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(categoryMatrixObjectEClass, CategoryMatrixObject.class, "CategoryMatrixObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCategoryMatrixObject_Entry(), this.getCategoryMatrixEntry(), null, "entry", null, 0, -1, CategoryMatrixObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(categoryMatrixTableEClass, CategoryMatrixTable.class, "CategoryMatrixTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCategoryMatrixTable_RowAttribute(), theCorePackage.getAttribute(), null, "rowAttribute", null, 1, 1, CategoryMatrixTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCategoryMatrixTable_ColumnAttribute(), theCorePackage.getAttribute(), null, "columnAttribute", null, 1, 1, CategoryMatrixTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCategoryMatrixTable_ValueAttribute(), theCorePackage.getAttribute(), null, "valueAttribute", null, 1, 1, CategoryMatrixTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCategoryMatrixTable_Source(), theCorePackage.getClass_(), null, "source", null, 0, -1, CategoryMatrixTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(categoryTaxonomyEClass, CategoryTaxonomy.class, "CategoryTaxonomy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCategoryTaxonomy_CategoryMap(), this.getCategoryMap(), null, "categoryMap", null, 0, -1, CategoryTaxonomy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCategoryTaxonomy_RootCategory(), this.getCategory(), null, "rootCategory", null, 0, -1, CategoryTaxonomy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(miningData_containerEClass, MiningData_container.class, "MiningData_container", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMiningData_container_AttributeAssignment(), this.getAttributeAssignment(), null, "AttributeAssignment", null, 0, -1, MiningData_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMiningData_container_AttributeAssignmentSet(), this.getAttributeAssignmentSet(), null, "AttributeAssignmentSet", null, 0, -1, MiningData_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMiningData_container_AttributeUsage(), this.getAttributeUsage(), null, "AttributeUsage", null, 0, -1, MiningData_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMiningData_container_AttributeUsageSet(), this.getAttributeUsageSet(), null, "AttributeUsageSet", null, 0, -1, MiningData_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMiningData_container_CategoricalAttributeProperties(), this.getCategoricalAttributeProperties(), null, "CategoricalAttributeProperties", null, 0, -1, MiningData_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMiningData_container_DirectAttributeAssignment(), this.getDirectAttributeAssignment(), null, "DirectAttributeAssignment", null, 0, -1, MiningData_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMiningData_container_LogicalAttribute(), this.getLogicalAttribute(), null, "LogicalAttribute", null, 0, -1, MiningData_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMiningData_container_LogicalData(), this.getLogicalData(), null, "LogicalData", null, 0, -1, MiningData_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMiningData_container_MiningAttribute(), this.getMiningAttribute(), null, "MiningAttribute", null, 0, -1, MiningData_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMiningData_container_NumericalAttributeProperties(), this.getNumericalAttributeProperties(), null, "NumericalAttributeProperties", null, 0, -1, MiningData_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMiningData_container_OrdinalAttributeProperties(), this.getOrdinalAttributeProperties(), null, "OrdinalAttributeProperties", null, 0, -1, MiningData_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMiningData_container_PhysicalData(), this.getPhysicalData(), null, "PhysicalData", null, 0, -1, MiningData_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMiningData_container_PivotAttributeAssignment(), this.getPivotAttributeAssignment(), null, "PivotAttributeAssignment", null, 0, -1, MiningData_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMiningData_container_ReversePivotAttributeAssignment(), this.getReversePivotAttributeAssignment(), null, "ReversePivotAttributeAssignment", null, 0, -1, MiningData_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMiningData_container_SetAttributeAssignment(), this.getSetAttributeAssignment(), null, "SetAttributeAssignment", null, 0, -1, MiningData_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMiningData_container_Category(), this.getCategory(), null, "Category", null, 0, -1, MiningData_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMiningData_container_CategoryMap(), this.getCategoryMap(), null, "CategoryMap", null, 0, -1, MiningData_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMiningData_container_CategoryMapObject(), this.getCategoryMapObject(), null, "CategoryMapObject", null, 0, -1, MiningData_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMiningData_container_CategoryMapObjectEntry(), this.getCategoryMapObjectEntry(), null, "CategoryMapObjectEntry", null, 0, -1, MiningData_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMiningData_container_CategoryMapTable(), this.getCategoryMapTable(), null, "CategoryMapTable", null, 0, -1, MiningData_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMiningData_container_CategoryMatrix(), this.getCategoryMatrix(), null, "CategoryMatrix", null, 0, -1, MiningData_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMiningData_container_CategoryMatrixEntry(), this.getCategoryMatrixEntry(), null, "CategoryMatrixEntry", null, 0, -1, MiningData_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMiningData_container_CategoryMatrixObject(), this.getCategoryMatrixObject(), null, "CategoryMatrixObject", null, 0, -1, MiningData_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMiningData_container_CategoryMatrixTable(), this.getCategoryMatrixTable(), null, "CategoryMatrixTable", null, 0, -1, MiningData_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMiningData_container_CategoryTaxonomy(), this.getCategoryTaxonomy(), null, "CategoryTaxonomy", null, 0, -1, MiningData_container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(attributeSelectionFunctionEEnum, AttributeSelectionFunction.class, "AttributeSelectionFunction");
		addEEnumLiteral(attributeSelectionFunctionEEnum, AttributeSelectionFunction.IS_NOT_NULL);
		addEEnumLiteral(attributeSelectionFunctionEEnum, AttributeSelectionFunction.IS_NULL);
		addEEnumLiteral(attributeSelectionFunctionEEnum, AttributeSelectionFunction.IS_ONE);
		addEEnumLiteral(attributeSelectionFunctionEEnum, AttributeSelectionFunction.IS_ZERO);
		addEEnumLiteral(attributeSelectionFunctionEEnum, AttributeSelectionFunction.IS_TRUE);
		addEEnumLiteral(attributeSelectionFunctionEEnum, AttributeSelectionFunction.IS_FALSE);

		initEEnum(attributeTypeEEnum, AttributeType.class, "AttributeType");
		addEEnumLiteral(attributeTypeEEnum, AttributeType.CATEGORICAL);
		addEEnumLiteral(attributeTypeEEnum, AttributeType.ORDINAL);
		addEEnumLiteral(attributeTypeEEnum, AttributeType.NUMERICAL);
		addEEnumLiteral(attributeTypeEEnum, AttributeType.NOT_SPECIFIED);

		initEEnum(orderTypeEEnum, OrderType.class, "OrderType");
		addEEnumLiteral(orderTypeEEnum, OrderType.AS_IS);
		addEEnumLiteral(orderTypeEEnum, OrderType.ALPHABETICAL);
		addEEnumLiteral(orderTypeEEnum, OrderType.NUMERIC);
		addEEnumLiteral(orderTypeEEnum, OrderType.DATE);

		initEEnum(usageOptionEEnum, UsageOption.class, "UsageOption");
		addEEnumLiteral(usageOptionEEnum, UsageOption.ACTIVE);
		addEEnumLiteral(usageOptionEEnum, UsageOption.SUPPLEMENTARY);
		addEEnumLiteral(usageOptionEEnum, UsageOption.TARGET);

		initEEnum(valueSelectionFunctionEEnum, ValueSelectionFunction.class, "ValueSelectionFunction");
		addEEnumLiteral(valueSelectionFunctionEEnum, ValueSelectionFunction.VSF_VALUE);
		addEEnumLiteral(valueSelectionFunctionEEnum, ValueSelectionFunction.VSF_ATTRIBUTE);

		initEEnum(categoryPropertyEEnum, CategoryProperty.class, "CategoryProperty");
		addEEnumLiteral(categoryPropertyEEnum, CategoryProperty.VALID);
		addEEnumLiteral(categoryPropertyEEnum, CategoryProperty.INVALID);
		addEEnumLiteral(categoryPropertyEEnum, CategoryProperty.MISSING);

		initEEnum(matrixPropertyEEnum, MatrixProperty.class, "MatrixProperty");
		addEEnumLiteral(matrixPropertyEEnum, MatrixProperty.MP_SYMMETRIC);
		addEEnumLiteral(matrixPropertyEEnum, MatrixProperty.MP_DIAGONAL);
		addEEnumLiteral(matrixPropertyEEnum, MatrixProperty.MP_ANY);

		// Initialize data types
		initEDataType(doubleEDataType, Double.class, "Double", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
	}

} //MiningDataPackageImpl

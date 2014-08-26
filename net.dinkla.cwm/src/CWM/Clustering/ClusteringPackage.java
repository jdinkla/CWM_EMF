/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Clustering;

import CWM.MiningCore.MiningData.MiningDataPackage;

import CWM.MiningCore.MiningFunctionSettings.MiningFunctionSettingsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see CWM.Clustering.ClusteringFactory
 * @model kind="package"
 * @generated
 */
public interface ClusteringPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Clustering";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "Clustering";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Clustering";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ClusteringPackage eINSTANCE = CWM.Clustering.impl.ClusteringPackageImpl.init();

	/**
	 * The meta object id for the '{@link CWM.Clustering.impl.ClusteringAttributeUsageImpl <em>Attribute Usage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Clustering.impl.ClusteringAttributeUsageImpl
	 * @see CWM.Clustering.impl.ClusteringPackageImpl#getClusteringAttributeUsage()
	 * @generated
	 */
	int CLUSTERING_ATTRIBUTE_USAGE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERING_ATTRIBUTE_USAGE__NAME = MiningDataPackage.ATTRIBUTE_USAGE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERING_ATTRIBUTE_USAGE__VISIBILITY = MiningDataPackage.ATTRIBUTE_USAGE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERING_ATTRIBUTE_USAGE__CLIENT_DEPENDENCY = MiningDataPackage.ATTRIBUTE_USAGE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERING_ATTRIBUTE_USAGE__CONSTRAINT = MiningDataPackage.ATTRIBUTE_USAGE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERING_ATTRIBUTE_USAGE__IMPORTER = MiningDataPackage.ATTRIBUTE_USAGE__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERING_ATTRIBUTE_USAGE__NAMESPACE = MiningDataPackage.ATTRIBUTE_USAGE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERING_ATTRIBUTE_USAGE__TAGGED_VALUE = MiningDataPackage.ATTRIBUTE_USAGE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owner Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERING_ATTRIBUTE_USAGE__OWNER_SCOPE = MiningDataPackage.ATTRIBUTE_USAGE__OWNER_SCOPE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERING_ATTRIBUTE_USAGE__OWNER = MiningDataPackage.ATTRIBUTE_USAGE__OWNER;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERING_ATTRIBUTE_USAGE__USAGE = MiningDataPackage.ATTRIBUTE_USAGE__USAGE;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERING_ATTRIBUTE_USAGE__WEIGHT = MiningDataPackage.ATTRIBUTE_USAGE__WEIGHT;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERING_ATTRIBUTE_USAGE__ATTRIBUTE = MiningDataPackage.ATTRIBUTE_USAGE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Suppress Discretization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERING_ATTRIBUTE_USAGE__SUPPRESS_DISCRETIZATION = MiningDataPackage.ATTRIBUTE_USAGE__SUPPRESS_DISCRETIZATION;

	/**
	 * The feature id for the '<em><b>Suppress Normalization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERING_ATTRIBUTE_USAGE__SUPPRESS_NORMALIZATION = MiningDataPackage.ATTRIBUTE_USAGE__SUPPRESS_NORMALIZATION;

	/**
	 * The feature id for the '<em><b>Attribute Comparison Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERING_ATTRIBUTE_USAGE__ATTRIBUTE_COMPARISON_FUNCTION = MiningDataPackage.ATTRIBUTE_USAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Similarity Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERING_ATTRIBUTE_USAGE__SIMILARITY_SCALE = MiningDataPackage.ATTRIBUTE_USAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Comparison Matrix</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERING_ATTRIBUTE_USAGE__COMPARISON_MATRIX = MiningDataPackage.ATTRIBUTE_USAGE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Attribute Usage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERING_ATTRIBUTE_USAGE_FEATURE_COUNT = MiningDataPackage.ATTRIBUTE_USAGE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link CWM.Clustering.impl.ClusteringFunctionSettingsImpl <em>Function Settings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Clustering.impl.ClusteringFunctionSettingsImpl
	 * @see CWM.Clustering.impl.ClusteringPackageImpl#getClusteringFunctionSettings()
	 * @generated
	 */
	int CLUSTERING_FUNCTION_SETTINGS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERING_FUNCTION_SETTINGS__NAME = MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERING_FUNCTION_SETTINGS__VISIBILITY = MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERING_FUNCTION_SETTINGS__CLIENT_DEPENDENCY = MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERING_FUNCTION_SETTINGS__CONSTRAINT = MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERING_FUNCTION_SETTINGS__IMPORTER = MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERING_FUNCTION_SETTINGS__NAMESPACE = MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERING_FUNCTION_SETTINGS__TAGGED_VALUE = MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Algorithm Settings</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERING_FUNCTION_SETTINGS__ALGORITHM_SETTINGS = MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS__ALGORITHM_SETTINGS;

	/**
	 * The feature id for the '<em><b>Desired Execution Time In Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERING_FUNCTION_SETTINGS__DESIRED_EXECUTION_TIME_IN_MINUTES = MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS__DESIRED_EXECUTION_TIME_IN_MINUTES;

	/**
	 * The feature id for the '<em><b>Attribute Usage Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERING_FUNCTION_SETTINGS__ATTRIBUTE_USAGE_SET = MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS__ATTRIBUTE_USAGE_SET;

	/**
	 * The feature id for the '<em><b>Logical Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERING_FUNCTION_SETTINGS__LOGICAL_DATA = MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS__LOGICAL_DATA;

	/**
	 * The feature id for the '<em><b>Max Number Of Clusters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERING_FUNCTION_SETTINGS__MAX_NUMBER_OF_CLUSTERS = MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Cluster Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERING_FUNCTION_SETTINGS__MIN_CLUSTER_SIZE = MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Aggregation Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERING_FUNCTION_SETTINGS__AGGREGATION_FUNCTION = MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Function Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERING_FUNCTION_SETTINGS_FEATURE_COUNT = MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link CWM.Clustering.impl.Clustering_containerImpl <em>Clustering container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Clustering.impl.Clustering_containerImpl
	 * @see CWM.Clustering.impl.ClusteringPackageImpl#getClustering_container()
	 * @generated
	 */
	int CLUSTERING_CONTAINER = 2;

	/**
	 * The feature id for the '<em><b>Clustering Attribute Usage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERING_CONTAINER__CLUSTERING_ATTRIBUTE_USAGE = 0;

	/**
	 * The feature id for the '<em><b>Clustering Function Settings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERING_CONTAINER__CLUSTERING_FUNCTION_SETTINGS = 1;

	/**
	 * The number of structural features of the '<em>Clustering container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERING_CONTAINER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link CWM.Clustering.AggregationFunction <em>Aggregation Function</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Clustering.AggregationFunction
	 * @see CWM.Clustering.impl.ClusteringPackageImpl#getAggregationFunction()
	 * @generated
	 */
	int AGGREGATION_FUNCTION = 3;

	/**
	 * The meta object id for the '{@link CWM.Clustering.AttributeComparisonFunction <em>Attribute Comparison Function</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Clustering.AttributeComparisonFunction
	 * @see CWM.Clustering.impl.ClusteringPackageImpl#getAttributeComparisonFunction()
	 * @generated
	 */
	int ATTRIBUTE_COMPARISON_FUNCTION = 4;

	/**
	 * The meta object id for the '{@link CWM.Clustering.ClusteringModelCBasis <em>Model CBasis</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Clustering.ClusteringModelCBasis
	 * @see CWM.Clustering.impl.ClusteringPackageImpl#getClusteringModelCBasis()
	 * @generated
	 */
	int CLUSTERING_MODEL_CBASIS = 5;


	/**
	 * Returns the meta object for class '{@link CWM.Clustering.ClusteringAttributeUsage <em>Attribute Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Usage</em>'.
	 * @see CWM.Clustering.ClusteringAttributeUsage
	 * @generated
	 */
	EClass getClusteringAttributeUsage();

	/**
	 * Returns the meta object for the attribute '{@link CWM.Clustering.ClusteringAttributeUsage#getAttributeComparisonFunction <em>Attribute Comparison Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute Comparison Function</em>'.
	 * @see CWM.Clustering.ClusteringAttributeUsage#getAttributeComparisonFunction()
	 * @see #getClusteringAttributeUsage()
	 * @generated
	 */
	EAttribute getClusteringAttributeUsage_AttributeComparisonFunction();

	/**
	 * Returns the meta object for the attribute '{@link CWM.Clustering.ClusteringAttributeUsage#getSimilarityScale <em>Similarity Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Similarity Scale</em>'.
	 * @see CWM.Clustering.ClusteringAttributeUsage#getSimilarityScale()
	 * @see #getClusteringAttributeUsage()
	 * @generated
	 */
	EAttribute getClusteringAttributeUsage_SimilarityScale();

	/**
	 * Returns the meta object for the reference '{@link CWM.Clustering.ClusteringAttributeUsage#getComparisonMatrix <em>Comparison Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Comparison Matrix</em>'.
	 * @see CWM.Clustering.ClusteringAttributeUsage#getComparisonMatrix()
	 * @see #getClusteringAttributeUsage()
	 * @generated
	 */
	EReference getClusteringAttributeUsage_ComparisonMatrix();

	/**
	 * Returns the meta object for class '{@link CWM.Clustering.ClusteringFunctionSettings <em>Function Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Settings</em>'.
	 * @see CWM.Clustering.ClusteringFunctionSettings
	 * @generated
	 */
	EClass getClusteringFunctionSettings();

	/**
	 * Returns the meta object for the attribute '{@link CWM.Clustering.ClusteringFunctionSettings#getMaxNumberOfClusters <em>Max Number Of Clusters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Number Of Clusters</em>'.
	 * @see CWM.Clustering.ClusteringFunctionSettings#getMaxNumberOfClusters()
	 * @see #getClusteringFunctionSettings()
	 * @generated
	 */
	EAttribute getClusteringFunctionSettings_MaxNumberOfClusters();

	/**
	 * Returns the meta object for the attribute '{@link CWM.Clustering.ClusteringFunctionSettings#getMinClusterSize <em>Min Cluster Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Cluster Size</em>'.
	 * @see CWM.Clustering.ClusteringFunctionSettings#getMinClusterSize()
	 * @see #getClusteringFunctionSettings()
	 * @generated
	 */
	EAttribute getClusteringFunctionSettings_MinClusterSize();

	/**
	 * Returns the meta object for the attribute '{@link CWM.Clustering.ClusteringFunctionSettings#getAggregationFunction <em>Aggregation Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aggregation Function</em>'.
	 * @see CWM.Clustering.ClusteringFunctionSettings#getAggregationFunction()
	 * @see #getClusteringFunctionSettings()
	 * @generated
	 */
	EAttribute getClusteringFunctionSettings_AggregationFunction();

	/**
	 * Returns the meta object for class '{@link CWM.Clustering.Clustering_container <em>Clustering container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clustering container</em>'.
	 * @see CWM.Clustering.Clustering_container
	 * @generated
	 */
	EClass getClustering_container();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Clustering.Clustering_container#getClusteringAttributeUsage <em>Clustering Attribute Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clustering Attribute Usage</em>'.
	 * @see CWM.Clustering.Clustering_container#getClusteringAttributeUsage()
	 * @see #getClustering_container()
	 * @generated
	 */
	EReference getClustering_container_ClusteringAttributeUsage();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Clustering.Clustering_container#getClusteringFunctionSettings <em>Clustering Function Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clustering Function Settings</em>'.
	 * @see CWM.Clustering.Clustering_container#getClusteringFunctionSettings()
	 * @see #getClustering_container()
	 * @generated
	 */
	EReference getClustering_container_ClusteringFunctionSettings();

	/**
	 * Returns the meta object for enum '{@link CWM.Clustering.AggregationFunction <em>Aggregation Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Aggregation Function</em>'.
	 * @see CWM.Clustering.AggregationFunction
	 * @generated
	 */
	EEnum getAggregationFunction();

	/**
	 * Returns the meta object for enum '{@link CWM.Clustering.AttributeComparisonFunction <em>Attribute Comparison Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Attribute Comparison Function</em>'.
	 * @see CWM.Clustering.AttributeComparisonFunction
	 * @generated
	 */
	EEnum getAttributeComparisonFunction();

	/**
	 * Returns the meta object for enum '{@link CWM.Clustering.ClusteringModelCBasis <em>Model CBasis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Model CBasis</em>'.
	 * @see CWM.Clustering.ClusteringModelCBasis
	 * @generated
	 */
	EEnum getClusteringModelCBasis();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ClusteringFactory getClusteringFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link CWM.Clustering.impl.ClusteringAttributeUsageImpl <em>Attribute Usage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Clustering.impl.ClusteringAttributeUsageImpl
		 * @see CWM.Clustering.impl.ClusteringPackageImpl#getClusteringAttributeUsage()
		 * @generated
		 */
		EClass CLUSTERING_ATTRIBUTE_USAGE = eINSTANCE.getClusteringAttributeUsage();

		/**
		 * The meta object literal for the '<em><b>Attribute Comparison Function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLUSTERING_ATTRIBUTE_USAGE__ATTRIBUTE_COMPARISON_FUNCTION = eINSTANCE.getClusteringAttributeUsage_AttributeComparisonFunction();

		/**
		 * The meta object literal for the '<em><b>Similarity Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLUSTERING_ATTRIBUTE_USAGE__SIMILARITY_SCALE = eINSTANCE.getClusteringAttributeUsage_SimilarityScale();

		/**
		 * The meta object literal for the '<em><b>Comparison Matrix</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLUSTERING_ATTRIBUTE_USAGE__COMPARISON_MATRIX = eINSTANCE.getClusteringAttributeUsage_ComparisonMatrix();

		/**
		 * The meta object literal for the '{@link CWM.Clustering.impl.ClusteringFunctionSettingsImpl <em>Function Settings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Clustering.impl.ClusteringFunctionSettingsImpl
		 * @see CWM.Clustering.impl.ClusteringPackageImpl#getClusteringFunctionSettings()
		 * @generated
		 */
		EClass CLUSTERING_FUNCTION_SETTINGS = eINSTANCE.getClusteringFunctionSettings();

		/**
		 * The meta object literal for the '<em><b>Max Number Of Clusters</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLUSTERING_FUNCTION_SETTINGS__MAX_NUMBER_OF_CLUSTERS = eINSTANCE.getClusteringFunctionSettings_MaxNumberOfClusters();

		/**
		 * The meta object literal for the '<em><b>Min Cluster Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLUSTERING_FUNCTION_SETTINGS__MIN_CLUSTER_SIZE = eINSTANCE.getClusteringFunctionSettings_MinClusterSize();

		/**
		 * The meta object literal for the '<em><b>Aggregation Function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLUSTERING_FUNCTION_SETTINGS__AGGREGATION_FUNCTION = eINSTANCE.getClusteringFunctionSettings_AggregationFunction();

		/**
		 * The meta object literal for the '{@link CWM.Clustering.impl.Clustering_containerImpl <em>Clustering container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Clustering.impl.Clustering_containerImpl
		 * @see CWM.Clustering.impl.ClusteringPackageImpl#getClustering_container()
		 * @generated
		 */
		EClass CLUSTERING_CONTAINER = eINSTANCE.getClustering_container();

		/**
		 * The meta object literal for the '<em><b>Clustering Attribute Usage</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLUSTERING_CONTAINER__CLUSTERING_ATTRIBUTE_USAGE = eINSTANCE.getClustering_container_ClusteringAttributeUsage();

		/**
		 * The meta object literal for the '<em><b>Clustering Function Settings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLUSTERING_CONTAINER__CLUSTERING_FUNCTION_SETTINGS = eINSTANCE.getClustering_container_ClusteringFunctionSettings();

		/**
		 * The meta object literal for the '{@link CWM.Clustering.AggregationFunction <em>Aggregation Function</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Clustering.AggregationFunction
		 * @see CWM.Clustering.impl.ClusteringPackageImpl#getAggregationFunction()
		 * @generated
		 */
		EEnum AGGREGATION_FUNCTION = eINSTANCE.getAggregationFunction();

		/**
		 * The meta object literal for the '{@link CWM.Clustering.AttributeComparisonFunction <em>Attribute Comparison Function</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Clustering.AttributeComparisonFunction
		 * @see CWM.Clustering.impl.ClusteringPackageImpl#getAttributeComparisonFunction()
		 * @generated
		 */
		EEnum ATTRIBUTE_COMPARISON_FUNCTION = eINSTANCE.getAttributeComparisonFunction();

		/**
		 * The meta object literal for the '{@link CWM.Clustering.ClusteringModelCBasis <em>Model CBasis</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Clustering.ClusteringModelCBasis
		 * @see CWM.Clustering.impl.ClusteringPackageImpl#getClusteringModelCBasis()
		 * @generated
		 */
		EEnum CLUSTERING_MODEL_CBASIS = eINSTANCE.getClusteringModelCBasis();

	}

} //ClusteringPackage

/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM;

import org.eclipse.emf.ecore.EClass;
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
 * @see CWM.CWMFactory
 * @model kind="package"
 * @generated
 */
public interface CWMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "CWM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "CWM";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "CWM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CWMPackage eINSTANCE = CWM.impl.CWMPackageImpl.init();

	/**
	 * The meta object id for the '{@link CWM.impl.CWM_containerImpl <em>CWM container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.impl.CWM_containerImpl
	 * @see CWM.impl.CWMPackageImpl#getCWM_container()
	 * @generated
	 */
	int CWM_CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWM_CONTAINER__CORE = 0;

	/**
	 * The feature id for the '<em><b>Behavioral</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWM_CONTAINER__BEHAVIORAL = 1;

	/**
	 * The feature id for the '<em><b>Relationships</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWM_CONTAINER__RELATIONSHIPS = 2;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWM_CONTAINER__INSTANCE = 3;

	/**
	 * The feature id for the '<em><b>Business Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWM_CONTAINER__BUSINESS_INFORMATION = 4;

	/**
	 * The feature id for the '<em><b>Data Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWM_CONTAINER__DATA_TYPES = 5;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWM_CONTAINER__EXPRESSIONS = 6;

	/**
	 * The feature id for the '<em><b>Keys Indexes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWM_CONTAINER__KEYS_INDEXES = 7;

	/**
	 * The feature id for the '<em><b>Software Deployment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWM_CONTAINER__SOFTWARE_DEPLOYMENT = 8;

	/**
	 * The feature id for the '<em><b>Type Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWM_CONTAINER__TYPE_MAPPING = 9;

	/**
	 * The feature id for the '<em><b>Relational</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWM_CONTAINER__RELATIONAL = 10;

	/**
	 * The feature id for the '<em><b>Enumerations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWM_CONTAINER__ENUMERATIONS = 11;

	/**
	 * The feature id for the '<em><b>Record</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWM_CONTAINER__RECORD = 12;

	/**
	 * The feature id for the '<em><b>Multidimensional</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWM_CONTAINER__MULTIDIMENSIONAL = 13;

	/**
	 * The feature id for the '<em><b>XML</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWM_CONTAINER__XML = 14;

	/**
	 * The feature id for the '<em><b>Transformation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWM_CONTAINER__TRANSFORMATION = 15;

	/**
	 * The feature id for the '<em><b>Olap</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWM_CONTAINER__OLAP = 16;

	/**
	 * The feature id for the '<em><b>Mining Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWM_CONTAINER__MINING_CORE = 17;

	/**
	 * The feature id for the '<em><b>Mining Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWM_CONTAINER__MINING_DATA = 18;

	/**
	 * The feature id for the '<em><b>Mining Function Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWM_CONTAINER__MINING_FUNCTION_SETTINGS = 19;

	/**
	 * The feature id for the '<em><b>Mining Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWM_CONTAINER__MINING_MODEL = 20;

	/**
	 * The feature id for the '<em><b>Mining Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWM_CONTAINER__MINING_RESULT = 21;

	/**
	 * The feature id for the '<em><b>Mining Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWM_CONTAINER__MINING_TASK = 22;

	/**
	 * The feature id for the '<em><b>Entry Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWM_CONTAINER__ENTRY_POINT = 23;

	/**
	 * The feature id for the '<em><b>Clustering</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWM_CONTAINER__CLUSTERING = 24;

	/**
	 * The feature id for the '<em><b>Association Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWM_CONTAINER__ASSOCIATION_RULES = 25;

	/**
	 * The feature id for the '<em><b>Supervised</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWM_CONTAINER__SUPERVISED = 26;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWM_CONTAINER__CLASSIFICATION = 27;

	/**
	 * The feature id for the '<em><b>Approximation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWM_CONTAINER__APPROXIMATION = 28;

	/**
	 * The feature id for the '<em><b>Attribute Importance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWM_CONTAINER__ATTRIBUTE_IMPORTANCE = 29;

	/**
	 * The feature id for the '<em><b>Information Visualization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWM_CONTAINER__INFORMATION_VISUALIZATION = 30;

	/**
	 * The feature id for the '<em><b>Business Nomenclature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWM_CONTAINER__BUSINESS_NOMENCLATURE = 31;

	/**
	 * The feature id for the '<em><b>Warehouse Process</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWM_CONTAINER__WAREHOUSE_PROCESS = 32;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWM_CONTAINER__DATA_TYPE = 33;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWM_CONTAINER__EVENTS = 34;

	/**
	 * The feature id for the '<em><b>Warehouse Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWM_CONTAINER__WAREHOUSE_OPERATION = 35;

	/**
	 * The feature id for the '<em><b>CWM Complete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWM_CONTAINER__CWM_COMPLETE = 36;

	/**
	 * The number of structural features of the '<em>CWM container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWM_CONTAINER_FEATURE_COUNT = 37;


	/**
	 * Returns the meta object for class '{@link CWM.CWM_container <em>CWM container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CWM container</em>'.
	 * @see CWM.CWM_container
	 * @generated
	 */
	EClass getCWM_container();

	/**
	 * Returns the meta object for the containment reference '{@link CWM.CWM_container#getCore <em>Core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Core</em>'.
	 * @see CWM.CWM_container#getCore()
	 * @see #getCWM_container()
	 * @generated
	 */
	EReference getCWM_container_Core();

	/**
	 * Returns the meta object for the containment reference '{@link CWM.CWM_container#getBehavioral <em>Behavioral</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Behavioral</em>'.
	 * @see CWM.CWM_container#getBehavioral()
	 * @see #getCWM_container()
	 * @generated
	 */
	EReference getCWM_container_Behavioral();

	/**
	 * Returns the meta object for the containment reference '{@link CWM.CWM_container#getRelationships <em>Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relationships</em>'.
	 * @see CWM.CWM_container#getRelationships()
	 * @see #getCWM_container()
	 * @generated
	 */
	EReference getCWM_container_Relationships();

	/**
	 * Returns the meta object for the containment reference '{@link CWM.CWM_container#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Instance</em>'.
	 * @see CWM.CWM_container#getInstance()
	 * @see #getCWM_container()
	 * @generated
	 */
	EReference getCWM_container_Instance();

	/**
	 * Returns the meta object for the containment reference '{@link CWM.CWM_container#getBusinessInformation <em>Business Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Business Information</em>'.
	 * @see CWM.CWM_container#getBusinessInformation()
	 * @see #getCWM_container()
	 * @generated
	 */
	EReference getCWM_container_BusinessInformation();

	/**
	 * Returns the meta object for the containment reference '{@link CWM.CWM_container#getDataTypes <em>Data Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Types</em>'.
	 * @see CWM.CWM_container#getDataTypes()
	 * @see #getCWM_container()
	 * @generated
	 */
	EReference getCWM_container_DataTypes();

	/**
	 * Returns the meta object for the containment reference '{@link CWM.CWM_container#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expressions</em>'.
	 * @see CWM.CWM_container#getExpressions()
	 * @see #getCWM_container()
	 * @generated
	 */
	EReference getCWM_container_Expressions();

	/**
	 * Returns the meta object for the containment reference '{@link CWM.CWM_container#getKeysIndexes <em>Keys Indexes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Keys Indexes</em>'.
	 * @see CWM.CWM_container#getKeysIndexes()
	 * @see #getCWM_container()
	 * @generated
	 */
	EReference getCWM_container_KeysIndexes();

	/**
	 * Returns the meta object for the containment reference '{@link CWM.CWM_container#getSoftwareDeployment <em>Software Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Software Deployment</em>'.
	 * @see CWM.CWM_container#getSoftwareDeployment()
	 * @see #getCWM_container()
	 * @generated
	 */
	EReference getCWM_container_SoftwareDeployment();

	/**
	 * Returns the meta object for the containment reference '{@link CWM.CWM_container#getTypeMapping <em>Type Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Mapping</em>'.
	 * @see CWM.CWM_container#getTypeMapping()
	 * @see #getCWM_container()
	 * @generated
	 */
	EReference getCWM_container_TypeMapping();

	/**
	 * Returns the meta object for the containment reference '{@link CWM.CWM_container#getRelational <em>Relational</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relational</em>'.
	 * @see CWM.CWM_container#getRelational()
	 * @see #getCWM_container()
	 * @generated
	 */
	EReference getCWM_container_Relational();

	/**
	 * Returns the meta object for the containment reference '{@link CWM.CWM_container#getEnumerations <em>Enumerations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Enumerations</em>'.
	 * @see CWM.CWM_container#getEnumerations()
	 * @see #getCWM_container()
	 * @generated
	 */
	EReference getCWM_container_Enumerations();

	/**
	 * Returns the meta object for the containment reference '{@link CWM.CWM_container#getRecord <em>Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Record</em>'.
	 * @see CWM.CWM_container#getRecord()
	 * @see #getCWM_container()
	 * @generated
	 */
	EReference getCWM_container_Record();

	/**
	 * Returns the meta object for the containment reference '{@link CWM.CWM_container#getMultidimensional <em>Multidimensional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Multidimensional</em>'.
	 * @see CWM.CWM_container#getMultidimensional()
	 * @see #getCWM_container()
	 * @generated
	 */
	EReference getCWM_container_Multidimensional();

	/**
	 * Returns the meta object for the containment reference '{@link CWM.CWM_container#getXML <em>XML</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XML</em>'.
	 * @see CWM.CWM_container#getXML()
	 * @see #getCWM_container()
	 * @generated
	 */
	EReference getCWM_container_XML();

	/**
	 * Returns the meta object for the containment reference '{@link CWM.CWM_container#getTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transformation</em>'.
	 * @see CWM.CWM_container#getTransformation()
	 * @see #getCWM_container()
	 * @generated
	 */
	EReference getCWM_container_Transformation();

	/**
	 * Returns the meta object for the containment reference '{@link CWM.CWM_container#getOlap <em>Olap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Olap</em>'.
	 * @see CWM.CWM_container#getOlap()
	 * @see #getCWM_container()
	 * @generated
	 */
	EReference getCWM_container_Olap();

	/**
	 * Returns the meta object for the containment reference '{@link CWM.CWM_container#getMiningCore <em>Mining Core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mining Core</em>'.
	 * @see CWM.CWM_container#getMiningCore()
	 * @see #getCWM_container()
	 * @generated
	 */
	EReference getCWM_container_MiningCore();

	/**
	 * Returns the meta object for the containment reference '{@link CWM.CWM_container#getMiningData <em>Mining Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mining Data</em>'.
	 * @see CWM.CWM_container#getMiningData()
	 * @see #getCWM_container()
	 * @generated
	 */
	EReference getCWM_container_MiningData();

	/**
	 * Returns the meta object for the containment reference '{@link CWM.CWM_container#getMiningFunctionSettings <em>Mining Function Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mining Function Settings</em>'.
	 * @see CWM.CWM_container#getMiningFunctionSettings()
	 * @see #getCWM_container()
	 * @generated
	 */
	EReference getCWM_container_MiningFunctionSettings();

	/**
	 * Returns the meta object for the containment reference '{@link CWM.CWM_container#getMiningModel <em>Mining Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mining Model</em>'.
	 * @see CWM.CWM_container#getMiningModel()
	 * @see #getCWM_container()
	 * @generated
	 */
	EReference getCWM_container_MiningModel();

	/**
	 * Returns the meta object for the containment reference '{@link CWM.CWM_container#getMiningResult <em>Mining Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mining Result</em>'.
	 * @see CWM.CWM_container#getMiningResult()
	 * @see #getCWM_container()
	 * @generated
	 */
	EReference getCWM_container_MiningResult();

	/**
	 * Returns the meta object for the containment reference '{@link CWM.CWM_container#getMiningTask <em>Mining Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mining Task</em>'.
	 * @see CWM.CWM_container#getMiningTask()
	 * @see #getCWM_container()
	 * @generated
	 */
	EReference getCWM_container_MiningTask();

	/**
	 * Returns the meta object for the containment reference '{@link CWM.CWM_container#getEntryPoint <em>Entry Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entry Point</em>'.
	 * @see CWM.CWM_container#getEntryPoint()
	 * @see #getCWM_container()
	 * @generated
	 */
	EReference getCWM_container_EntryPoint();

	/**
	 * Returns the meta object for the containment reference '{@link CWM.CWM_container#getClustering <em>Clustering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Clustering</em>'.
	 * @see CWM.CWM_container#getClustering()
	 * @see #getCWM_container()
	 * @generated
	 */
	EReference getCWM_container_Clustering();

	/**
	 * Returns the meta object for the containment reference '{@link CWM.CWM_container#getAssociationRules <em>Association Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Association Rules</em>'.
	 * @see CWM.CWM_container#getAssociationRules()
	 * @see #getCWM_container()
	 * @generated
	 */
	EReference getCWM_container_AssociationRules();

	/**
	 * Returns the meta object for the containment reference '{@link CWM.CWM_container#getSupervised <em>Supervised</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Supervised</em>'.
	 * @see CWM.CWM_container#getSupervised()
	 * @see #getCWM_container()
	 * @generated
	 */
	EReference getCWM_container_Supervised();

	/**
	 * Returns the meta object for the containment reference '{@link CWM.CWM_container#getClassification <em>Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classification</em>'.
	 * @see CWM.CWM_container#getClassification()
	 * @see #getCWM_container()
	 * @generated
	 */
	EReference getCWM_container_Classification();

	/**
	 * Returns the meta object for the containment reference '{@link CWM.CWM_container#getApproximation <em>Approximation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Approximation</em>'.
	 * @see CWM.CWM_container#getApproximation()
	 * @see #getCWM_container()
	 * @generated
	 */
	EReference getCWM_container_Approximation();

	/**
	 * Returns the meta object for the containment reference '{@link CWM.CWM_container#getAttributeImportance <em>Attribute Importance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attribute Importance</em>'.
	 * @see CWM.CWM_container#getAttributeImportance()
	 * @see #getCWM_container()
	 * @generated
	 */
	EReference getCWM_container_AttributeImportance();

	/**
	 * Returns the meta object for the containment reference '{@link CWM.CWM_container#getInformationVisualization <em>Information Visualization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Information Visualization</em>'.
	 * @see CWM.CWM_container#getInformationVisualization()
	 * @see #getCWM_container()
	 * @generated
	 */
	EReference getCWM_container_InformationVisualization();

	/**
	 * Returns the meta object for the containment reference '{@link CWM.CWM_container#getBusinessNomenclature <em>Business Nomenclature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Business Nomenclature</em>'.
	 * @see CWM.CWM_container#getBusinessNomenclature()
	 * @see #getCWM_container()
	 * @generated
	 */
	EReference getCWM_container_BusinessNomenclature();

	/**
	 * Returns the meta object for the containment reference '{@link CWM.CWM_container#getWarehouseProcess <em>Warehouse Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Warehouse Process</em>'.
	 * @see CWM.CWM_container#getWarehouseProcess()
	 * @see #getCWM_container()
	 * @generated
	 */
	EReference getCWM_container_WarehouseProcess();

	/**
	 * Returns the meta object for the containment reference '{@link CWM.CWM_container#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Type</em>'.
	 * @see CWM.CWM_container#getDataType()
	 * @see #getCWM_container()
	 * @generated
	 */
	EReference getCWM_container_DataType();

	/**
	 * Returns the meta object for the containment reference '{@link CWM.CWM_container#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Events</em>'.
	 * @see CWM.CWM_container#getEvents()
	 * @see #getCWM_container()
	 * @generated
	 */
	EReference getCWM_container_Events();

	/**
	 * Returns the meta object for the containment reference '{@link CWM.CWM_container#getWarehouseOperation <em>Warehouse Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Warehouse Operation</em>'.
	 * @see CWM.CWM_container#getWarehouseOperation()
	 * @see #getCWM_container()
	 * @generated
	 */
	EReference getCWM_container_WarehouseOperation();

	/**
	 * Returns the meta object for the containment reference '{@link CWM.CWM_container#getCWMComplete <em>CWM Complete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>CWM Complete</em>'.
	 * @see CWM.CWM_container#getCWMComplete()
	 * @see #getCWM_container()
	 * @generated
	 */
	EReference getCWM_container_CWMComplete();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CWMFactory getCWMFactory();

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
		 * The meta object literal for the '{@link CWM.impl.CWM_containerImpl <em>CWM container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.impl.CWM_containerImpl
		 * @see CWM.impl.CWMPackageImpl#getCWM_container()
		 * @generated
		 */
		EClass CWM_CONTAINER = eINSTANCE.getCWM_container();

		/**
		 * The meta object literal for the '<em><b>Core</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CWM_CONTAINER__CORE = eINSTANCE.getCWM_container_Core();

		/**
		 * The meta object literal for the '<em><b>Behavioral</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CWM_CONTAINER__BEHAVIORAL = eINSTANCE.getCWM_container_Behavioral();

		/**
		 * The meta object literal for the '<em><b>Relationships</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CWM_CONTAINER__RELATIONSHIPS = eINSTANCE.getCWM_container_Relationships();

		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CWM_CONTAINER__INSTANCE = eINSTANCE.getCWM_container_Instance();

		/**
		 * The meta object literal for the '<em><b>Business Information</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CWM_CONTAINER__BUSINESS_INFORMATION = eINSTANCE.getCWM_container_BusinessInformation();

		/**
		 * The meta object literal for the '<em><b>Data Types</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CWM_CONTAINER__DATA_TYPES = eINSTANCE.getCWM_container_DataTypes();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CWM_CONTAINER__EXPRESSIONS = eINSTANCE.getCWM_container_Expressions();

		/**
		 * The meta object literal for the '<em><b>Keys Indexes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CWM_CONTAINER__KEYS_INDEXES = eINSTANCE.getCWM_container_KeysIndexes();

		/**
		 * The meta object literal for the '<em><b>Software Deployment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CWM_CONTAINER__SOFTWARE_DEPLOYMENT = eINSTANCE.getCWM_container_SoftwareDeployment();

		/**
		 * The meta object literal for the '<em><b>Type Mapping</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CWM_CONTAINER__TYPE_MAPPING = eINSTANCE.getCWM_container_TypeMapping();

		/**
		 * The meta object literal for the '<em><b>Relational</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CWM_CONTAINER__RELATIONAL = eINSTANCE.getCWM_container_Relational();

		/**
		 * The meta object literal for the '<em><b>Enumerations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CWM_CONTAINER__ENUMERATIONS = eINSTANCE.getCWM_container_Enumerations();

		/**
		 * The meta object literal for the '<em><b>Record</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CWM_CONTAINER__RECORD = eINSTANCE.getCWM_container_Record();

		/**
		 * The meta object literal for the '<em><b>Multidimensional</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CWM_CONTAINER__MULTIDIMENSIONAL = eINSTANCE.getCWM_container_Multidimensional();

		/**
		 * The meta object literal for the '<em><b>XML</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CWM_CONTAINER__XML = eINSTANCE.getCWM_container_XML();

		/**
		 * The meta object literal for the '<em><b>Transformation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CWM_CONTAINER__TRANSFORMATION = eINSTANCE.getCWM_container_Transformation();

		/**
		 * The meta object literal for the '<em><b>Olap</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CWM_CONTAINER__OLAP = eINSTANCE.getCWM_container_Olap();

		/**
		 * The meta object literal for the '<em><b>Mining Core</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CWM_CONTAINER__MINING_CORE = eINSTANCE.getCWM_container_MiningCore();

		/**
		 * The meta object literal for the '<em><b>Mining Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CWM_CONTAINER__MINING_DATA = eINSTANCE.getCWM_container_MiningData();

		/**
		 * The meta object literal for the '<em><b>Mining Function Settings</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CWM_CONTAINER__MINING_FUNCTION_SETTINGS = eINSTANCE.getCWM_container_MiningFunctionSettings();

		/**
		 * The meta object literal for the '<em><b>Mining Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CWM_CONTAINER__MINING_MODEL = eINSTANCE.getCWM_container_MiningModel();

		/**
		 * The meta object literal for the '<em><b>Mining Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CWM_CONTAINER__MINING_RESULT = eINSTANCE.getCWM_container_MiningResult();

		/**
		 * The meta object literal for the '<em><b>Mining Task</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CWM_CONTAINER__MINING_TASK = eINSTANCE.getCWM_container_MiningTask();

		/**
		 * The meta object literal for the '<em><b>Entry Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CWM_CONTAINER__ENTRY_POINT = eINSTANCE.getCWM_container_EntryPoint();

		/**
		 * The meta object literal for the '<em><b>Clustering</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CWM_CONTAINER__CLUSTERING = eINSTANCE.getCWM_container_Clustering();

		/**
		 * The meta object literal for the '<em><b>Association Rules</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CWM_CONTAINER__ASSOCIATION_RULES = eINSTANCE.getCWM_container_AssociationRules();

		/**
		 * The meta object literal for the '<em><b>Supervised</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CWM_CONTAINER__SUPERVISED = eINSTANCE.getCWM_container_Supervised();

		/**
		 * The meta object literal for the '<em><b>Classification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CWM_CONTAINER__CLASSIFICATION = eINSTANCE.getCWM_container_Classification();

		/**
		 * The meta object literal for the '<em><b>Approximation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CWM_CONTAINER__APPROXIMATION = eINSTANCE.getCWM_container_Approximation();

		/**
		 * The meta object literal for the '<em><b>Attribute Importance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CWM_CONTAINER__ATTRIBUTE_IMPORTANCE = eINSTANCE.getCWM_container_AttributeImportance();

		/**
		 * The meta object literal for the '<em><b>Information Visualization</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CWM_CONTAINER__INFORMATION_VISUALIZATION = eINSTANCE.getCWM_container_InformationVisualization();

		/**
		 * The meta object literal for the '<em><b>Business Nomenclature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CWM_CONTAINER__BUSINESS_NOMENCLATURE = eINSTANCE.getCWM_container_BusinessNomenclature();

		/**
		 * The meta object literal for the '<em><b>Warehouse Process</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CWM_CONTAINER__WAREHOUSE_PROCESS = eINSTANCE.getCWM_container_WarehouseProcess();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CWM_CONTAINER__DATA_TYPE = eINSTANCE.getCWM_container_DataType();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CWM_CONTAINER__EVENTS = eINSTANCE.getCWM_container_Events();

		/**
		 * The meta object literal for the '<em><b>Warehouse Operation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CWM_CONTAINER__WAREHOUSE_OPERATION = eINSTANCE.getCWM_container_WarehouseOperation();

		/**
		 * The meta object literal for the '<em><b>CWM Complete</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CWM_CONTAINER__CWM_COMPLETE = eINSTANCE.getCWM_container_CWMComplete();

	}

} //CWMPackage

/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.EntryPoint;

import CWM.Core.CorePackage;

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
 * @see CWM.MiningCore.EntryPoint.EntryPointFactory
 * @model kind="package"
 * @generated
 */
public interface EntryPointPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "EntryPoint";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "EntryPoint";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "EntryPoint";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EntryPointPackage eINSTANCE = CWM.MiningCore.EntryPoint.impl.EntryPointPackageImpl.init();

	/**
	 * The meta object id for the '{@link CWM.MiningCore.EntryPoint.impl.AuxiliaryObjectImpl <em>Auxiliary Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.MiningCore.EntryPoint.impl.AuxiliaryObjectImpl
	 * @see CWM.MiningCore.EntryPoint.impl.EntryPointPackageImpl#getAuxiliaryObject()
	 * @generated
	 */
	int AUXILIARY_OBJECT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_OBJECT__NAME = CorePackage.MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_OBJECT__VISIBILITY = CorePackage.MODEL_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_OBJECT__CLIENT_DEPENDENCY = CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_OBJECT__CONSTRAINT = CorePackage.MODEL_ELEMENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_OBJECT__IMPORTER = CorePackage.MODEL_ELEMENT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_OBJECT__NAMESPACE = CorePackage.MODEL_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_OBJECT__TAGGED_VALUE = CorePackage.MODEL_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Attribute Assignment Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_OBJECT__ATTRIBUTE_ASSIGNMENT_SET = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Auxiliary Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_OBJECT_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CWM.MiningCore.EntryPoint.impl.CatalogImpl <em>Catalog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.MiningCore.EntryPoint.impl.CatalogImpl
	 * @see CWM.MiningCore.EntryPoint.impl.EntryPointPackageImpl#getCatalog()
	 * @generated
	 */
	int CATALOG = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__NAME = CorePackage.PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__VISIBILITY = CorePackage.PACKAGE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__CLIENT_DEPENDENCY = CorePackage.PACKAGE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__CONSTRAINT = CorePackage.PACKAGE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__IMPORTER = CorePackage.PACKAGE__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__NAMESPACE = CorePackage.PACKAGE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__TAGGED_VALUE = CorePackage.PACKAGE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__OWNED_ELEMENT = CorePackage.PACKAGE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Imported Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__IMPORTED_ELEMENT = CorePackage.PACKAGE__IMPORTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__SCHEMA = CorePackage.PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Catalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_FEATURE_COUNT = CorePackage.PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CWM.MiningCore.EntryPoint.impl.SchemaImpl <em>Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.MiningCore.EntryPoint.impl.SchemaImpl
	 * @see CWM.MiningCore.EntryPoint.impl.EntryPointPackageImpl#getSchema()
	 * @generated
	 */
	int SCHEMA = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__NAME = CorePackage.NAMESPACE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__VISIBILITY = CorePackage.NAMESPACE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__CLIENT_DEPENDENCY = CorePackage.NAMESPACE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__CONSTRAINT = CorePackage.NAMESPACE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__IMPORTER = CorePackage.NAMESPACE__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__NAMESPACE = CorePackage.NAMESPACE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__TAGGED_VALUE = CorePackage.NAMESPACE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__OWNED_ELEMENT = CorePackage.NAMESPACE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Logical Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__LOGICAL_DATA = CorePackage.NAMESPACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Category Matrix</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__CATEGORY_MATRIX = CorePackage.NAMESPACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mining Model</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__MINING_MODEL = CorePackage.NAMESPACE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Mining Function Settings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__MINING_FUNCTION_SETTINGS = CorePackage.NAMESPACE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Taxonomy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__TAXONOMY = CorePackage.NAMESPACE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Mining Task</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__MINING_TASK = CorePackage.NAMESPACE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__RESULT = CorePackage.NAMESPACE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Aux Objects</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__AUX_OBJECTS = CorePackage.NAMESPACE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_FEATURE_COUNT = CorePackage.NAMESPACE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link CWM.MiningCore.EntryPoint.impl.EntryPoint_containerImpl <em>Entry Point container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.MiningCore.EntryPoint.impl.EntryPoint_containerImpl
	 * @see CWM.MiningCore.EntryPoint.impl.EntryPointPackageImpl#getEntryPoint_container()
	 * @generated
	 */
	int ENTRY_POINT_CONTAINER = 3;

	/**
	 * The feature id for the '<em><b>Auxiliary Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT_CONTAINER__AUXILIARY_OBJECT = 0;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT_CONTAINER__CATALOG = 1;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT_CONTAINER__SCHEMA = 2;

	/**
	 * The number of structural features of the '<em>Entry Point container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT_CONTAINER_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link CWM.MiningCore.EntryPoint.AuxiliaryObject <em>Auxiliary Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auxiliary Object</em>'.
	 * @see CWM.MiningCore.EntryPoint.AuxiliaryObject
	 * @generated
	 */
	EClass getAuxiliaryObject();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.MiningCore.EntryPoint.AuxiliaryObject#getAttributeAssignmentSet <em>Attribute Assignment Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute Assignment Set</em>'.
	 * @see CWM.MiningCore.EntryPoint.AuxiliaryObject#getAttributeAssignmentSet()
	 * @see #getAuxiliaryObject()
	 * @generated
	 */
	EReference getAuxiliaryObject_AttributeAssignmentSet();

	/**
	 * Returns the meta object for class '{@link CWM.MiningCore.EntryPoint.Catalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catalog</em>'.
	 * @see CWM.MiningCore.EntryPoint.Catalog
	 * @generated
	 */
	EClass getCatalog();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.MiningCore.EntryPoint.Catalog#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Schema</em>'.
	 * @see CWM.MiningCore.EntryPoint.Catalog#getSchema()
	 * @see #getCatalog()
	 * @generated
	 */
	EReference getCatalog_Schema();

	/**
	 * Returns the meta object for class '{@link CWM.MiningCore.EntryPoint.Schema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema</em>'.
	 * @see CWM.MiningCore.EntryPoint.Schema
	 * @generated
	 */
	EClass getSchema();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.MiningCore.EntryPoint.Schema#getLogicalData <em>Logical Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Logical Data</em>'.
	 * @see CWM.MiningCore.EntryPoint.Schema#getLogicalData()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_LogicalData();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.MiningCore.EntryPoint.Schema#getCategoryMatrix <em>Category Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Category Matrix</em>'.
	 * @see CWM.MiningCore.EntryPoint.Schema#getCategoryMatrix()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_CategoryMatrix();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.MiningCore.EntryPoint.Schema#getMiningModel <em>Mining Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mining Model</em>'.
	 * @see CWM.MiningCore.EntryPoint.Schema#getMiningModel()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_MiningModel();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.MiningCore.EntryPoint.Schema#getMiningFunctionSettings <em>Mining Function Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mining Function Settings</em>'.
	 * @see CWM.MiningCore.EntryPoint.Schema#getMiningFunctionSettings()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_MiningFunctionSettings();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.MiningCore.EntryPoint.Schema#getTaxonomy <em>Taxonomy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Taxonomy</em>'.
	 * @see CWM.MiningCore.EntryPoint.Schema#getTaxonomy()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Taxonomy();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.MiningCore.EntryPoint.Schema#getMiningTask <em>Mining Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mining Task</em>'.
	 * @see CWM.MiningCore.EntryPoint.Schema#getMiningTask()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_MiningTask();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.MiningCore.EntryPoint.Schema#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Result</em>'.
	 * @see CWM.MiningCore.EntryPoint.Schema#getResult()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Result();

	/**
	 * Returns the meta object for the containment reference '{@link CWM.MiningCore.EntryPoint.Schema#getAuxObjects <em>Aux Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aux Objects</em>'.
	 * @see CWM.MiningCore.EntryPoint.Schema#getAuxObjects()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_AuxObjects();

	/**
	 * Returns the meta object for class '{@link CWM.MiningCore.EntryPoint.EntryPoint_container <em>Entry Point container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Point container</em>'.
	 * @see CWM.MiningCore.EntryPoint.EntryPoint_container
	 * @generated
	 */
	EClass getEntryPoint_container();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.MiningCore.EntryPoint.EntryPoint_container#getAuxiliaryObject <em>Auxiliary Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Auxiliary Object</em>'.
	 * @see CWM.MiningCore.EntryPoint.EntryPoint_container#getAuxiliaryObject()
	 * @see #getEntryPoint_container()
	 * @generated
	 */
	EReference getEntryPoint_container_AuxiliaryObject();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.MiningCore.EntryPoint.EntryPoint_container#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Catalog</em>'.
	 * @see CWM.MiningCore.EntryPoint.EntryPoint_container#getCatalog()
	 * @see #getEntryPoint_container()
	 * @generated
	 */
	EReference getEntryPoint_container_Catalog();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.MiningCore.EntryPoint.EntryPoint_container#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Schema</em>'.
	 * @see CWM.MiningCore.EntryPoint.EntryPoint_container#getSchema()
	 * @see #getEntryPoint_container()
	 * @generated
	 */
	EReference getEntryPoint_container_Schema();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EntryPointFactory getEntryPointFactory();

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
		 * The meta object literal for the '{@link CWM.MiningCore.EntryPoint.impl.AuxiliaryObjectImpl <em>Auxiliary Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.MiningCore.EntryPoint.impl.AuxiliaryObjectImpl
		 * @see CWM.MiningCore.EntryPoint.impl.EntryPointPackageImpl#getAuxiliaryObject()
		 * @generated
		 */
		EClass AUXILIARY_OBJECT = eINSTANCE.getAuxiliaryObject();

		/**
		 * The meta object literal for the '<em><b>Attribute Assignment Set</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUXILIARY_OBJECT__ATTRIBUTE_ASSIGNMENT_SET = eINSTANCE.getAuxiliaryObject_AttributeAssignmentSet();

		/**
		 * The meta object literal for the '{@link CWM.MiningCore.EntryPoint.impl.CatalogImpl <em>Catalog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.MiningCore.EntryPoint.impl.CatalogImpl
		 * @see CWM.MiningCore.EntryPoint.impl.EntryPointPackageImpl#getCatalog()
		 * @generated
		 */
		EClass CATALOG = eINSTANCE.getCatalog();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG__SCHEMA = eINSTANCE.getCatalog_Schema();

		/**
		 * The meta object literal for the '{@link CWM.MiningCore.EntryPoint.impl.SchemaImpl <em>Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.MiningCore.EntryPoint.impl.SchemaImpl
		 * @see CWM.MiningCore.EntryPoint.impl.EntryPointPackageImpl#getSchema()
		 * @generated
		 */
		EClass SCHEMA = eINSTANCE.getSchema();

		/**
		 * The meta object literal for the '<em><b>Logical Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__LOGICAL_DATA = eINSTANCE.getSchema_LogicalData();

		/**
		 * The meta object literal for the '<em><b>Category Matrix</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__CATEGORY_MATRIX = eINSTANCE.getSchema_CategoryMatrix();

		/**
		 * The meta object literal for the '<em><b>Mining Model</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__MINING_MODEL = eINSTANCE.getSchema_MiningModel();

		/**
		 * The meta object literal for the '<em><b>Mining Function Settings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__MINING_FUNCTION_SETTINGS = eINSTANCE.getSchema_MiningFunctionSettings();

		/**
		 * The meta object literal for the '<em><b>Taxonomy</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__TAXONOMY = eINSTANCE.getSchema_Taxonomy();

		/**
		 * The meta object literal for the '<em><b>Mining Task</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__MINING_TASK = eINSTANCE.getSchema_MiningTask();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__RESULT = eINSTANCE.getSchema_Result();

		/**
		 * The meta object literal for the '<em><b>Aux Objects</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__AUX_OBJECTS = eINSTANCE.getSchema_AuxObjects();

		/**
		 * The meta object literal for the '{@link CWM.MiningCore.EntryPoint.impl.EntryPoint_containerImpl <em>Entry Point container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.MiningCore.EntryPoint.impl.EntryPoint_containerImpl
		 * @see CWM.MiningCore.EntryPoint.impl.EntryPointPackageImpl#getEntryPoint_container()
		 * @generated
		 */
		EClass ENTRY_POINT_CONTAINER = eINSTANCE.getEntryPoint_container();

		/**
		 * The meta object literal for the '<em><b>Auxiliary Object</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_POINT_CONTAINER__AUXILIARY_OBJECT = eINSTANCE.getEntryPoint_container_AuxiliaryObject();

		/**
		 * The meta object literal for the '<em><b>Catalog</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_POINT_CONTAINER__CATALOG = eINSTANCE.getEntryPoint_container_Catalog();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_POINT_CONTAINER__SCHEMA = eINSTANCE.getEntryPoint_container_Schema();

	}

} //EntryPointPackage

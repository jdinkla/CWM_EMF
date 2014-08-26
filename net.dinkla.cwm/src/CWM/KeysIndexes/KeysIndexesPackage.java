/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.KeysIndexes;

import CWM.Core.CorePackage;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see CWM.KeysIndexes.KeysIndexesFactory
 * @model kind="package"
 * @generated
 */
public interface KeysIndexesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "KeysIndexes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "KeysIndexes";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "KeysIndexes";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KeysIndexesPackage eINSTANCE = CWM.KeysIndexes.impl.KeysIndexesPackageImpl.init();

	/**
	 * The meta object id for the '{@link CWM.KeysIndexes.impl.UniqueKeyImpl <em>Unique Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.KeysIndexes.impl.UniqueKeyImpl
	 * @see CWM.KeysIndexes.impl.KeysIndexesPackageImpl#getUniqueKey()
	 * @generated
	 */
	int UNIQUE_KEY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_KEY__NAME = CorePackage.MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_KEY__VISIBILITY = CorePackage.MODEL_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_KEY__CLIENT_DEPENDENCY = CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_KEY__CONSTRAINT = CorePackage.MODEL_ELEMENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_KEY__IMPORTER = CorePackage.MODEL_ELEMENT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_KEY__NAMESPACE = CorePackage.MODEL_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_KEY__TAGGED_VALUE = CorePackage.MODEL_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_KEY__FEATURE = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Key Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_KEY__KEY_RELATIONSHIP = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unique Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_KEY_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link CWM.KeysIndexes.impl.IndexImpl <em>Index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.KeysIndexes.impl.IndexImpl
	 * @see CWM.KeysIndexes.impl.KeysIndexesPackageImpl#getIndex()
	 * @generated
	 */
	int INDEX = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__NAME = CorePackage.MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__VISIBILITY = CorePackage.MODEL_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__CLIENT_DEPENDENCY = CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__CONSTRAINT = CorePackage.MODEL_ELEMENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__IMPORTER = CorePackage.MODEL_ELEMENT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__NAMESPACE = CorePackage.MODEL_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__TAGGED_VALUE = CorePackage.MODEL_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Is Partitioning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__IS_PARTITIONING = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Sorted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__IS_SORTED = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__IS_UNIQUE = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Indexed Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__INDEXED_FEATURE = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Spanned Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__SPANNED_CLASS = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link CWM.KeysIndexes.impl.KeyRelationshipImpl <em>Key Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.KeysIndexes.impl.KeyRelationshipImpl
	 * @see CWM.KeysIndexes.impl.KeysIndexesPackageImpl#getKeyRelationship()
	 * @generated
	 */
	int KEY_RELATIONSHIP = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_RELATIONSHIP__NAME = CorePackage.MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_RELATIONSHIP__VISIBILITY = CorePackage.MODEL_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_RELATIONSHIP__CLIENT_DEPENDENCY = CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_RELATIONSHIP__CONSTRAINT = CorePackage.MODEL_ELEMENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_RELATIONSHIP__IMPORTER = CorePackage.MODEL_ELEMENT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_RELATIONSHIP__NAMESPACE = CorePackage.MODEL_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_RELATIONSHIP__TAGGED_VALUE = CorePackage.MODEL_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_RELATIONSHIP__FEATURE = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unique Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_RELATIONSHIP__UNIQUE_KEY = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Key Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_RELATIONSHIP_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link CWM.KeysIndexes.impl.IndexedFeatureImpl <em>Indexed Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.KeysIndexes.impl.IndexedFeatureImpl
	 * @see CWM.KeysIndexes.impl.KeysIndexesPackageImpl#getIndexedFeature()
	 * @generated
	 */
	int INDEXED_FEATURE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEXED_FEATURE__NAME = CorePackage.MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEXED_FEATURE__VISIBILITY = CorePackage.MODEL_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEXED_FEATURE__CLIENT_DEPENDENCY = CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEXED_FEATURE__CONSTRAINT = CorePackage.MODEL_ELEMENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEXED_FEATURE__IMPORTER = CorePackage.MODEL_ELEMENT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEXED_FEATURE__NAMESPACE = CorePackage.MODEL_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEXED_FEATURE__TAGGED_VALUE = CorePackage.MODEL_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Is Ascending</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEXED_FEATURE__IS_ASCENDING = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEXED_FEATURE__FEATURE = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Index</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEXED_FEATURE__INDEX = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Indexed Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEXED_FEATURE_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link CWM.KeysIndexes.impl.KeysIndexes_containerImpl <em>Keys Indexes container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.KeysIndexes.impl.KeysIndexes_containerImpl
	 * @see CWM.KeysIndexes.impl.KeysIndexesPackageImpl#getKeysIndexes_container()
	 * @generated
	 */
	int KEYS_INDEXES_CONTAINER = 4;

	/**
	 * The feature id for the '<em><b>Unique Key</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYS_INDEXES_CONTAINER__UNIQUE_KEY = 0;

	/**
	 * The feature id for the '<em><b>Index</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYS_INDEXES_CONTAINER__INDEX = 1;

	/**
	 * The feature id for the '<em><b>Key Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYS_INDEXES_CONTAINER__KEY_RELATIONSHIP = 2;

	/**
	 * The feature id for the '<em><b>Indexed Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYS_INDEXES_CONTAINER__INDEXED_FEATURE = 3;

	/**
	 * The number of structural features of the '<em>Keys Indexes container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYS_INDEXES_CONTAINER_FEATURE_COUNT = 4;


	/**
	 * Returns the meta object for class '{@link CWM.KeysIndexes.UniqueKey <em>Unique Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unique Key</em>'.
	 * @see CWM.KeysIndexes.UniqueKey
	 * @generated
	 */
	EClass getUniqueKey();

	/**
	 * Returns the meta object for the reference list '{@link CWM.KeysIndexes.UniqueKey#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Feature</em>'.
	 * @see CWM.KeysIndexes.UniqueKey#getFeature()
	 * @see #getUniqueKey()
	 * @generated
	 */
	EReference getUniqueKey_Feature();

	/**
	 * Returns the meta object for the reference list '{@link CWM.KeysIndexes.UniqueKey#getKeyRelationship <em>Key Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Key Relationship</em>'.
	 * @see CWM.KeysIndexes.UniqueKey#getKeyRelationship()
	 * @see #getUniqueKey()
	 * @generated
	 */
	EReference getUniqueKey_KeyRelationship();

	/**
	 * Returns the meta object for class '{@link CWM.KeysIndexes.Index <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index</em>'.
	 * @see CWM.KeysIndexes.Index
	 * @generated
	 */
	EClass getIndex();

	/**
	 * Returns the meta object for the attribute '{@link CWM.KeysIndexes.Index#getIsPartitioning <em>Is Partitioning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Partitioning</em>'.
	 * @see CWM.KeysIndexes.Index#getIsPartitioning()
	 * @see #getIndex()
	 * @generated
	 */
	EAttribute getIndex_IsPartitioning();

	/**
	 * Returns the meta object for the attribute '{@link CWM.KeysIndexes.Index#getIsSorted <em>Is Sorted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Sorted</em>'.
	 * @see CWM.KeysIndexes.Index#getIsSorted()
	 * @see #getIndex()
	 * @generated
	 */
	EAttribute getIndex_IsSorted();

	/**
	 * Returns the meta object for the attribute '{@link CWM.KeysIndexes.Index#getIsUnique <em>Is Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Unique</em>'.
	 * @see CWM.KeysIndexes.Index#getIsUnique()
	 * @see #getIndex()
	 * @generated
	 */
	EAttribute getIndex_IsUnique();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.KeysIndexes.Index#getIndexedFeature <em>Indexed Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Indexed Feature</em>'.
	 * @see CWM.KeysIndexes.Index#getIndexedFeature()
	 * @see #getIndex()
	 * @generated
	 */
	EReference getIndex_IndexedFeature();

	/**
	 * Returns the meta object for the reference '{@link CWM.KeysIndexes.Index#getSpannedClass <em>Spanned Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Spanned Class</em>'.
	 * @see CWM.KeysIndexes.Index#getSpannedClass()
	 * @see #getIndex()
	 * @generated
	 */
	EReference getIndex_SpannedClass();

	/**
	 * Returns the meta object for class '{@link CWM.KeysIndexes.KeyRelationship <em>Key Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Relationship</em>'.
	 * @see CWM.KeysIndexes.KeyRelationship
	 * @generated
	 */
	EClass getKeyRelationship();

	/**
	 * Returns the meta object for the reference list '{@link CWM.KeysIndexes.KeyRelationship#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Feature</em>'.
	 * @see CWM.KeysIndexes.KeyRelationship#getFeature()
	 * @see #getKeyRelationship()
	 * @generated
	 */
	EReference getKeyRelationship_Feature();

	/**
	 * Returns the meta object for the reference '{@link CWM.KeysIndexes.KeyRelationship#getUniqueKey <em>Unique Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Unique Key</em>'.
	 * @see CWM.KeysIndexes.KeyRelationship#getUniqueKey()
	 * @see #getKeyRelationship()
	 * @generated
	 */
	EReference getKeyRelationship_UniqueKey();

	/**
	 * Returns the meta object for class '{@link CWM.KeysIndexes.IndexedFeature <em>Indexed Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Indexed Feature</em>'.
	 * @see CWM.KeysIndexes.IndexedFeature
	 * @generated
	 */
	EClass getIndexedFeature();

	/**
	 * Returns the meta object for the attribute '{@link CWM.KeysIndexes.IndexedFeature#getIsAscending <em>Is Ascending</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Ascending</em>'.
	 * @see CWM.KeysIndexes.IndexedFeature#getIsAscending()
	 * @see #getIndexedFeature()
	 * @generated
	 */
	EAttribute getIndexedFeature_IsAscending();

	/**
	 * Returns the meta object for the reference '{@link CWM.KeysIndexes.IndexedFeature#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see CWM.KeysIndexes.IndexedFeature#getFeature()
	 * @see #getIndexedFeature()
	 * @generated
	 */
	EReference getIndexedFeature_Feature();

	/**
	 * Returns the meta object for the container reference '{@link CWM.KeysIndexes.IndexedFeature#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Index</em>'.
	 * @see CWM.KeysIndexes.IndexedFeature#getIndex()
	 * @see #getIndexedFeature()
	 * @generated
	 */
	EReference getIndexedFeature_Index();

	/**
	 * Returns the meta object for class '{@link CWM.KeysIndexes.KeysIndexes_container <em>Keys Indexes container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Keys Indexes container</em>'.
	 * @see CWM.KeysIndexes.KeysIndexes_container
	 * @generated
	 */
	EClass getKeysIndexes_container();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.KeysIndexes.KeysIndexes_container#getUniqueKey <em>Unique Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unique Key</em>'.
	 * @see CWM.KeysIndexes.KeysIndexes_container#getUniqueKey()
	 * @see #getKeysIndexes_container()
	 * @generated
	 */
	EReference getKeysIndexes_container_UniqueKey();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.KeysIndexes.KeysIndexes_container#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Index</em>'.
	 * @see CWM.KeysIndexes.KeysIndexes_container#getIndex()
	 * @see #getKeysIndexes_container()
	 * @generated
	 */
	EReference getKeysIndexes_container_Index();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.KeysIndexes.KeysIndexes_container#getKeyRelationship <em>Key Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Key Relationship</em>'.
	 * @see CWM.KeysIndexes.KeysIndexes_container#getKeyRelationship()
	 * @see #getKeysIndexes_container()
	 * @generated
	 */
	EReference getKeysIndexes_container_KeyRelationship();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.KeysIndexes.KeysIndexes_container#getIndexedFeature <em>Indexed Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Indexed Feature</em>'.
	 * @see CWM.KeysIndexes.KeysIndexes_container#getIndexedFeature()
	 * @see #getKeysIndexes_container()
	 * @generated
	 */
	EReference getKeysIndexes_container_IndexedFeature();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	KeysIndexesFactory getKeysIndexesFactory();

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
		 * The meta object literal for the '{@link CWM.KeysIndexes.impl.UniqueKeyImpl <em>Unique Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.KeysIndexes.impl.UniqueKeyImpl
		 * @see CWM.KeysIndexes.impl.KeysIndexesPackageImpl#getUniqueKey()
		 * @generated
		 */
		EClass UNIQUE_KEY = eINSTANCE.getUniqueKey();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIQUE_KEY__FEATURE = eINSTANCE.getUniqueKey_Feature();

		/**
		 * The meta object literal for the '<em><b>Key Relationship</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIQUE_KEY__KEY_RELATIONSHIP = eINSTANCE.getUniqueKey_KeyRelationship();

		/**
		 * The meta object literal for the '{@link CWM.KeysIndexes.impl.IndexImpl <em>Index</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.KeysIndexes.impl.IndexImpl
		 * @see CWM.KeysIndexes.impl.KeysIndexesPackageImpl#getIndex()
		 * @generated
		 */
		EClass INDEX = eINSTANCE.getIndex();

		/**
		 * The meta object literal for the '<em><b>Is Partitioning</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX__IS_PARTITIONING = eINSTANCE.getIndex_IsPartitioning();

		/**
		 * The meta object literal for the '<em><b>Is Sorted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX__IS_SORTED = eINSTANCE.getIndex_IsSorted();

		/**
		 * The meta object literal for the '<em><b>Is Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX__IS_UNIQUE = eINSTANCE.getIndex_IsUnique();

		/**
		 * The meta object literal for the '<em><b>Indexed Feature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDEX__INDEXED_FEATURE = eINSTANCE.getIndex_IndexedFeature();

		/**
		 * The meta object literal for the '<em><b>Spanned Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDEX__SPANNED_CLASS = eINSTANCE.getIndex_SpannedClass();

		/**
		 * The meta object literal for the '{@link CWM.KeysIndexes.impl.KeyRelationshipImpl <em>Key Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.KeysIndexes.impl.KeyRelationshipImpl
		 * @see CWM.KeysIndexes.impl.KeysIndexesPackageImpl#getKeyRelationship()
		 * @generated
		 */
		EClass KEY_RELATIONSHIP = eINSTANCE.getKeyRelationship();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY_RELATIONSHIP__FEATURE = eINSTANCE.getKeyRelationship_Feature();

		/**
		 * The meta object literal for the '<em><b>Unique Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY_RELATIONSHIP__UNIQUE_KEY = eINSTANCE.getKeyRelationship_UniqueKey();

		/**
		 * The meta object literal for the '{@link CWM.KeysIndexes.impl.IndexedFeatureImpl <em>Indexed Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.KeysIndexes.impl.IndexedFeatureImpl
		 * @see CWM.KeysIndexes.impl.KeysIndexesPackageImpl#getIndexedFeature()
		 * @generated
		 */
		EClass INDEXED_FEATURE = eINSTANCE.getIndexedFeature();

		/**
		 * The meta object literal for the '<em><b>Is Ascending</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEXED_FEATURE__IS_ASCENDING = eINSTANCE.getIndexedFeature_IsAscending();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDEXED_FEATURE__FEATURE = eINSTANCE.getIndexedFeature_Feature();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDEXED_FEATURE__INDEX = eINSTANCE.getIndexedFeature_Index();

		/**
		 * The meta object literal for the '{@link CWM.KeysIndexes.impl.KeysIndexes_containerImpl <em>Keys Indexes container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.KeysIndexes.impl.KeysIndexes_containerImpl
		 * @see CWM.KeysIndexes.impl.KeysIndexesPackageImpl#getKeysIndexes_container()
		 * @generated
		 */
		EClass KEYS_INDEXES_CONTAINER = eINSTANCE.getKeysIndexes_container();

		/**
		 * The meta object literal for the '<em><b>Unique Key</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEYS_INDEXES_CONTAINER__UNIQUE_KEY = eINSTANCE.getKeysIndexes_container_UniqueKey();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEYS_INDEXES_CONTAINER__INDEX = eINSTANCE.getKeysIndexes_container_Index();

		/**
		 * The meta object literal for the '<em><b>Key Relationship</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEYS_INDEXES_CONTAINER__KEY_RELATIONSHIP = eINSTANCE.getKeysIndexes_container_KeyRelationship();

		/**
		 * The meta object literal for the '<em><b>Indexed Feature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEYS_INDEXES_CONTAINER__INDEXED_FEATURE = eINSTANCE.getKeysIndexes_container_IndexedFeature();

	}

} //KeysIndexesPackage

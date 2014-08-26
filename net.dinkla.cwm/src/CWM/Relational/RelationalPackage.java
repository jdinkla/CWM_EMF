/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Relational;

import CWM.Behavioral.BehavioralPackage;

import CWM.Core.CorePackage;

import CWM.CwmInstance.CwmInstancePackage;

import CWM.KeysIndexes.KeysIndexesPackage;

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
 * @see CWM.Relational.RelationalFactory
 * @model kind="package"
 * @generated
 */
public interface RelationalPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Relational";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "Relational";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Relational";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RelationalPackage eINSTANCE = CWM.Relational.impl.RelationalPackageImpl.init();

	/**
	 * The meta object id for the '{@link CWM.Relational.impl.CatalogImpl <em>Catalog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Relational.impl.CatalogImpl
	 * @see CWM.Relational.impl.RelationalPackageImpl#getCatalog()
	 * @generated
	 */
	int CATALOG = 0;

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
	 * The feature id for the '<em><b>Default Character Set Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__DEFAULT_CHARACTER_SET_NAME = CorePackage.PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Collation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__DEFAULT_COLLATION_NAME = CorePackage.PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Catalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_FEATURE_COUNT = CorePackage.PACKAGE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link CWM.Relational.impl.SchemaImpl <em>Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Relational.impl.SchemaImpl
	 * @see CWM.Relational.impl.RelationalPackageImpl#getSchema()
	 * @generated
	 */
	int SCHEMA = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__NAME = CorePackage.PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__VISIBILITY = CorePackage.PACKAGE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__CLIENT_DEPENDENCY = CorePackage.PACKAGE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__CONSTRAINT = CorePackage.PACKAGE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__IMPORTER = CorePackage.PACKAGE__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__NAMESPACE = CorePackage.PACKAGE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__TAGGED_VALUE = CorePackage.PACKAGE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__OWNED_ELEMENT = CorePackage.PACKAGE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Imported Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__IMPORTED_ELEMENT = CorePackage.PACKAGE__IMPORTED_ELEMENT;

	/**
	 * The number of structural features of the '<em>Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_FEATURE_COUNT = CorePackage.PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CWM.Relational.impl.ColumnSetImpl <em>Column Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Relational.impl.ColumnSetImpl
	 * @see CWM.Relational.impl.RelationalPackageImpl#getColumnSet()
	 * @generated
	 */
	int COLUMN_SET = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_SET__NAME = CorePackage.CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_SET__VISIBILITY = CorePackage.CLASS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_SET__CLIENT_DEPENDENCY = CorePackage.CLASS__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_SET__CONSTRAINT = CorePackage.CLASS__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_SET__IMPORTER = CorePackage.CLASS__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_SET__NAMESPACE = CorePackage.CLASS__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_SET__TAGGED_VALUE = CorePackage.CLASS__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_SET__OWNED_ELEMENT = CorePackage.CLASS__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_SET__IS_ABSTRACT = CorePackage.CLASS__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_SET__FEATURE = CorePackage.CLASS__FEATURE;

	/**
	 * The number of structural features of the '<em>Column Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_SET_FEATURE_COUNT = CorePackage.CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CWM.Relational.impl.NamedColumnSetImpl <em>Named Column Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Relational.impl.NamedColumnSetImpl
	 * @see CWM.Relational.impl.RelationalPackageImpl#getNamedColumnSet()
	 * @generated
	 */
	int NAMED_COLUMN_SET = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_COLUMN_SET__NAME = COLUMN_SET__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_COLUMN_SET__VISIBILITY = COLUMN_SET__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_COLUMN_SET__CLIENT_DEPENDENCY = COLUMN_SET__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_COLUMN_SET__CONSTRAINT = COLUMN_SET__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_COLUMN_SET__IMPORTER = COLUMN_SET__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_COLUMN_SET__NAMESPACE = COLUMN_SET__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_COLUMN_SET__TAGGED_VALUE = COLUMN_SET__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_COLUMN_SET__OWNED_ELEMENT = COLUMN_SET__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_COLUMN_SET__IS_ABSTRACT = COLUMN_SET__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_COLUMN_SET__FEATURE = COLUMN_SET__FEATURE;

	/**
	 * The feature id for the '<em><b>Option Scope Column</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_COLUMN_SET__OPTION_SCOPE_COLUMN = COLUMN_SET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_COLUMN_SET__TYPE = COLUMN_SET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Using Trigger</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_COLUMN_SET__USING_TRIGGER = COLUMN_SET_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Named Column Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_COLUMN_SET_FEATURE_COUNT = COLUMN_SET_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link CWM.Relational.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Relational.impl.TableImpl
	 * @see CWM.Relational.impl.RelationalPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NAME = NAMED_COLUMN_SET__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__VISIBILITY = NAMED_COLUMN_SET__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__CLIENT_DEPENDENCY = NAMED_COLUMN_SET__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__CONSTRAINT = NAMED_COLUMN_SET__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__IMPORTER = NAMED_COLUMN_SET__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NAMESPACE = NAMED_COLUMN_SET__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TAGGED_VALUE = NAMED_COLUMN_SET__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__OWNED_ELEMENT = NAMED_COLUMN_SET__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__IS_ABSTRACT = NAMED_COLUMN_SET__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__FEATURE = NAMED_COLUMN_SET__FEATURE;

	/**
	 * The feature id for the '<em><b>Option Scope Column</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__OPTION_SCOPE_COLUMN = NAMED_COLUMN_SET__OPTION_SCOPE_COLUMN;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TYPE = NAMED_COLUMN_SET__TYPE;

	/**
	 * The feature id for the '<em><b>Using Trigger</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__USING_TRIGGER = NAMED_COLUMN_SET__USING_TRIGGER;

	/**
	 * The feature id for the '<em><b>Is Temporary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__IS_TEMPORARY = NAMED_COLUMN_SET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Temporary Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TEMPORARY_SCOPE = NAMED_COLUMN_SET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TRIGGER = NAMED_COLUMN_SET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__IS_SYSTEM = NAMED_COLUMN_SET_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = NAMED_COLUMN_SET_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link CWM.Relational.impl.ViewImpl <em>View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Relational.impl.ViewImpl
	 * @see CWM.Relational.impl.RelationalPackageImpl#getView()
	 * @generated
	 */
	int VIEW = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__NAME = NAMED_COLUMN_SET__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__VISIBILITY = NAMED_COLUMN_SET__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__CLIENT_DEPENDENCY = NAMED_COLUMN_SET__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__CONSTRAINT = NAMED_COLUMN_SET__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__IMPORTER = NAMED_COLUMN_SET__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__NAMESPACE = NAMED_COLUMN_SET__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__TAGGED_VALUE = NAMED_COLUMN_SET__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__OWNED_ELEMENT = NAMED_COLUMN_SET__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__IS_ABSTRACT = NAMED_COLUMN_SET__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__FEATURE = NAMED_COLUMN_SET__FEATURE;

	/**
	 * The feature id for the '<em><b>Option Scope Column</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__OPTION_SCOPE_COLUMN = NAMED_COLUMN_SET__OPTION_SCOPE_COLUMN;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__TYPE = NAMED_COLUMN_SET__TYPE;

	/**
	 * The feature id for the '<em><b>Using Trigger</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__USING_TRIGGER = NAMED_COLUMN_SET__USING_TRIGGER;

	/**
	 * The feature id for the '<em><b>Is Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__IS_READ_ONLY = NAMED_COLUMN_SET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Check Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__CHECK_OPTION = NAMED_COLUMN_SET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Query Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__QUERY_EXPRESSION = NAMED_COLUMN_SET_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE_COUNT = NAMED_COLUMN_SET_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link CWM.Relational.impl.QueryColumnSetImpl <em>Query Column Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Relational.impl.QueryColumnSetImpl
	 * @see CWM.Relational.impl.RelationalPackageImpl#getQueryColumnSet()
	 * @generated
	 */
	int QUERY_COLUMN_SET = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_COLUMN_SET__NAME = COLUMN_SET__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_COLUMN_SET__VISIBILITY = COLUMN_SET__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_COLUMN_SET__CLIENT_DEPENDENCY = COLUMN_SET__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_COLUMN_SET__CONSTRAINT = COLUMN_SET__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_COLUMN_SET__IMPORTER = COLUMN_SET__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_COLUMN_SET__NAMESPACE = COLUMN_SET__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_COLUMN_SET__TAGGED_VALUE = COLUMN_SET__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_COLUMN_SET__OWNED_ELEMENT = COLUMN_SET__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_COLUMN_SET__IS_ABSTRACT = COLUMN_SET__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_COLUMN_SET__FEATURE = COLUMN_SET__FEATURE;

	/**
	 * The feature id for the '<em><b>Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_COLUMN_SET__QUERY = COLUMN_SET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Query Column Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_COLUMN_SET_FEATURE_COUNT = COLUMN_SET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CWM.Relational.impl.SQLDataTypeImpl <em>SQL Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Relational.impl.SQLDataTypeImpl
	 * @see CWM.Relational.impl.RelationalPackageImpl#getSQLDataType()
	 * @generated
	 */
	int SQL_DATA_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_DATA_TYPE__NAME = CorePackage.CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_DATA_TYPE__VISIBILITY = CorePackage.CLASSIFIER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_DATA_TYPE__CLIENT_DEPENDENCY = CorePackage.CLASSIFIER__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_DATA_TYPE__CONSTRAINT = CorePackage.CLASSIFIER__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_DATA_TYPE__IMPORTER = CorePackage.CLASSIFIER__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_DATA_TYPE__NAMESPACE = CorePackage.CLASSIFIER__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_DATA_TYPE__TAGGED_VALUE = CorePackage.CLASSIFIER__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_DATA_TYPE__OWNED_ELEMENT = CorePackage.CLASSIFIER__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_DATA_TYPE__IS_ABSTRACT = CorePackage.CLASSIFIER__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_DATA_TYPE__FEATURE = CorePackage.CLASSIFIER__FEATURE;

	/**
	 * The feature id for the '<em><b>Type Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_DATA_TYPE__TYPE_NUMBER = CorePackage.CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SQL Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_DATA_TYPE_FEATURE_COUNT = CorePackage.CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CWM.Relational.impl.SQLDistinctTypeImpl <em>SQL Distinct Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Relational.impl.SQLDistinctTypeImpl
	 * @see CWM.Relational.impl.RelationalPackageImpl#getSQLDistinctType()
	 * @generated
	 */
	int SQL_DISTINCT_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_DISTINCT_TYPE__NAME = SQL_DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_DISTINCT_TYPE__VISIBILITY = SQL_DATA_TYPE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_DISTINCT_TYPE__CLIENT_DEPENDENCY = SQL_DATA_TYPE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_DISTINCT_TYPE__CONSTRAINT = SQL_DATA_TYPE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_DISTINCT_TYPE__IMPORTER = SQL_DATA_TYPE__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_DISTINCT_TYPE__NAMESPACE = SQL_DATA_TYPE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_DISTINCT_TYPE__TAGGED_VALUE = SQL_DATA_TYPE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_DISTINCT_TYPE__OWNED_ELEMENT = SQL_DATA_TYPE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_DISTINCT_TYPE__IS_ABSTRACT = SQL_DATA_TYPE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_DISTINCT_TYPE__FEATURE = SQL_DATA_TYPE__FEATURE;

	/**
	 * The feature id for the '<em><b>Type Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_DISTINCT_TYPE__TYPE_NUMBER = SQL_DATA_TYPE__TYPE_NUMBER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_DISTINCT_TYPE__TYPE = SQL_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_DISTINCT_TYPE__LENGTH = SQL_DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_DISTINCT_TYPE__PRECISION = SQL_DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_DISTINCT_TYPE__SCALE = SQL_DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sql Simple Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_DISTINCT_TYPE__SQL_SIMPLE_TYPE = SQL_DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>SQL Distinct Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_DISTINCT_TYPE_FEATURE_COUNT = SQL_DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link CWM.Relational.impl.SQLSimpleTypeImpl <em>SQL Simple Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Relational.impl.SQLSimpleTypeImpl
	 * @see CWM.Relational.impl.RelationalPackageImpl#getSQLSimpleType()
	 * @generated
	 */
	int SQL_SIMPLE_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_SIMPLE_TYPE__NAME = SQL_DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_SIMPLE_TYPE__VISIBILITY = SQL_DATA_TYPE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_SIMPLE_TYPE__CLIENT_DEPENDENCY = SQL_DATA_TYPE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_SIMPLE_TYPE__CONSTRAINT = SQL_DATA_TYPE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_SIMPLE_TYPE__IMPORTER = SQL_DATA_TYPE__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_SIMPLE_TYPE__NAMESPACE = SQL_DATA_TYPE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_SIMPLE_TYPE__TAGGED_VALUE = SQL_DATA_TYPE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_SIMPLE_TYPE__OWNED_ELEMENT = SQL_DATA_TYPE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_SIMPLE_TYPE__IS_ABSTRACT = SQL_DATA_TYPE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_SIMPLE_TYPE__FEATURE = SQL_DATA_TYPE__FEATURE;

	/**
	 * The feature id for the '<em><b>Type Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_SIMPLE_TYPE__TYPE_NUMBER = SQL_DATA_TYPE__TYPE_NUMBER;

	/**
	 * The feature id for the '<em><b>Character Maximum Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_SIMPLE_TYPE__CHARACTER_MAXIMUM_LENGTH = SQL_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Character Octet Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_SIMPLE_TYPE__CHARACTER_OCTET_LENGTH = SQL_DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Numeric Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_SIMPLE_TYPE__NUMERIC_PRECISION = SQL_DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Numeric Precision Radix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_SIMPLE_TYPE__NUMERIC_PRECISION_RADIX = SQL_DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Numeric Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_SIMPLE_TYPE__NUMERIC_SCALE = SQL_DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Date Time Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_SIMPLE_TYPE__DATE_TIME_PRECISION = SQL_DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>SQL Simple Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_SIMPLE_TYPE_FEATURE_COUNT = SQL_DATA_TYPE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link CWM.Relational.impl.SQLStructuredTypeImpl <em>SQL Structured Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Relational.impl.SQLStructuredTypeImpl
	 * @see CWM.Relational.impl.RelationalPackageImpl#getSQLStructuredType()
	 * @generated
	 */
	int SQL_STRUCTURED_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_STRUCTURED_TYPE__NAME = SQL_DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_STRUCTURED_TYPE__VISIBILITY = SQL_DATA_TYPE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_STRUCTURED_TYPE__CLIENT_DEPENDENCY = SQL_DATA_TYPE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_STRUCTURED_TYPE__CONSTRAINT = SQL_DATA_TYPE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_STRUCTURED_TYPE__IMPORTER = SQL_DATA_TYPE__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_STRUCTURED_TYPE__NAMESPACE = SQL_DATA_TYPE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_STRUCTURED_TYPE__TAGGED_VALUE = SQL_DATA_TYPE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_STRUCTURED_TYPE__OWNED_ELEMENT = SQL_DATA_TYPE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_STRUCTURED_TYPE__IS_ABSTRACT = SQL_DATA_TYPE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_STRUCTURED_TYPE__FEATURE = SQL_DATA_TYPE__FEATURE;

	/**
	 * The feature id for the '<em><b>Type Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_STRUCTURED_TYPE__TYPE_NUMBER = SQL_DATA_TYPE__TYPE_NUMBER;

	/**
	 * The feature id for the '<em><b>Referencing Column</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_STRUCTURED_TYPE__REFERENCING_COLUMN = SQL_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Column Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_STRUCTURED_TYPE__COLUMN_SET = SQL_DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>SQL Structured Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_STRUCTURED_TYPE_FEATURE_COUNT = SQL_DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link CWM.Relational.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Relational.impl.ColumnImpl
	 * @see CWM.Relational.impl.RelationalPackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__NAME = CorePackage.ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__VISIBILITY = CorePackage.ATTRIBUTE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__CLIENT_DEPENDENCY = CorePackage.ATTRIBUTE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__CONSTRAINT = CorePackage.ATTRIBUTE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__IMPORTER = CorePackage.ATTRIBUTE__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__NAMESPACE = CorePackage.ATTRIBUTE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__TAGGED_VALUE = CorePackage.ATTRIBUTE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owner Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__OWNER_SCOPE = CorePackage.ATTRIBUTE__OWNER_SCOPE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__OWNER = CorePackage.ATTRIBUTE__OWNER;

	/**
	 * The feature id for the '<em><b>Changeability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__CHANGEABILITY = CorePackage.ATTRIBUTE__CHANGEABILITY;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__MULTIPLICITY = CorePackage.ATTRIBUTE__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__ORDERING = CorePackage.ATTRIBUTE__ORDERING;

	/**
	 * The feature id for the '<em><b>Target Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__TARGET_SCOPE = CorePackage.ATTRIBUTE__TARGET_SCOPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__TYPE = CorePackage.ATTRIBUTE__TYPE;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__INITIAL_VALUE = CorePackage.ATTRIBUTE__INITIAL_VALUE;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__PRECISION = CorePackage.ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__SCALE = CorePackage.ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__IS_NULLABLE = CorePackage.ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__LENGTH = CorePackage.ATTRIBUTE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Collation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__COLLATION_NAME = CorePackage.ATTRIBUTE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Character Set Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__CHARACTER_SET_NAME = CorePackage.ATTRIBUTE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Option Scope Column Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__OPTION_SCOPE_COLUMN_SET = CorePackage.ATTRIBUTE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Referenced Table Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__REFERENCED_TABLE_TYPE = CorePackage.ATTRIBUTE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = CorePackage.ATTRIBUTE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link CWM.Relational.impl.ProcedureImpl <em>Procedure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Relational.impl.ProcedureImpl
	 * @see CWM.Relational.impl.RelationalPackageImpl#getProcedure()
	 * @generated
	 */
	int PROCEDURE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__NAME = BehavioralPackage.METHOD__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__VISIBILITY = BehavioralPackage.METHOD__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__CLIENT_DEPENDENCY = BehavioralPackage.METHOD__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__CONSTRAINT = BehavioralPackage.METHOD__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__IMPORTER = BehavioralPackage.METHOD__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__NAMESPACE = BehavioralPackage.METHOD__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__TAGGED_VALUE = BehavioralPackage.METHOD__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owner Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__OWNER_SCOPE = BehavioralPackage.METHOD__OWNER_SCOPE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__OWNER = BehavioralPackage.METHOD__OWNER;

	/**
	 * The feature id for the '<em><b>Is Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__IS_QUERY = BehavioralPackage.METHOD__IS_QUERY;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__PARAMETER = BehavioralPackage.METHOD__PARAMETER;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__BODY = BehavioralPackage.METHOD__BODY;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__SPECIFICATION = BehavioralPackage.METHOD__SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__TYPE = BehavioralPackage.METHOD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Procedure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_FEATURE_COUNT = BehavioralPackage.METHOD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CWM.Relational.impl.TriggerImpl <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Relational.impl.TriggerImpl
	 * @see CWM.Relational.impl.RelationalPackageImpl#getTrigger()
	 * @generated
	 */
	int TRIGGER = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__NAME = CorePackage.MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__VISIBILITY = CorePackage.MODEL_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__CLIENT_DEPENDENCY = CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__CONSTRAINT = CorePackage.MODEL_ELEMENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__IMPORTER = CorePackage.MODEL_ELEMENT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__NAMESPACE = CorePackage.MODEL_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__TAGGED_VALUE = CorePackage.MODEL_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Event Manipulation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__EVENT_MANIPULATION = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Action Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__ACTION_CONDITION = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Action Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__ACTION_STATEMENT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Action Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__ACTION_ORIENTATION = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Condition Timing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__CONDITION_TIMING = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Condition Reference New Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__CONDITION_REFERENCE_NEW_TABLE = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Condition Reference Old Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__CONDITION_REFERENCE_OLD_TABLE = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__TABLE = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Used Column Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__USED_COLUMN_SET = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link CWM.Relational.impl.SQLIndexImpl <em>SQL Index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Relational.impl.SQLIndexImpl
	 * @see CWM.Relational.impl.RelationalPackageImpl#getSQLIndex()
	 * @generated
	 */
	int SQL_INDEX = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_INDEX__NAME = KeysIndexesPackage.INDEX__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_INDEX__VISIBILITY = KeysIndexesPackage.INDEX__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_INDEX__CLIENT_DEPENDENCY = KeysIndexesPackage.INDEX__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_INDEX__CONSTRAINT = KeysIndexesPackage.INDEX__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_INDEX__IMPORTER = KeysIndexesPackage.INDEX__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_INDEX__NAMESPACE = KeysIndexesPackage.INDEX__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_INDEX__TAGGED_VALUE = KeysIndexesPackage.INDEX__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Is Partitioning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_INDEX__IS_PARTITIONING = KeysIndexesPackage.INDEX__IS_PARTITIONING;

	/**
	 * The feature id for the '<em><b>Is Sorted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_INDEX__IS_SORTED = KeysIndexesPackage.INDEX__IS_SORTED;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_INDEX__IS_UNIQUE = KeysIndexesPackage.INDEX__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Indexed Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_INDEX__INDEXED_FEATURE = KeysIndexesPackage.INDEX__INDEXED_FEATURE;

	/**
	 * The feature id for the '<em><b>Spanned Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_INDEX__SPANNED_CLASS = KeysIndexesPackage.INDEX__SPANNED_CLASS;

	/**
	 * The feature id for the '<em><b>Filter Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_INDEX__FILTER_CONDITION = KeysIndexesPackage.INDEX_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_INDEX__IS_NULLABLE = KeysIndexesPackage.INDEX_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Auto Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_INDEX__AUTO_UPDATE = KeysIndexesPackage.INDEX_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>SQL Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_INDEX_FEATURE_COUNT = KeysIndexesPackage.INDEX_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link CWM.Relational.impl.UniqueConstraintImpl <em>Unique Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Relational.impl.UniqueConstraintImpl
	 * @see CWM.Relational.impl.RelationalPackageImpl#getUniqueConstraint()
	 * @generated
	 */
	int UNIQUE_CONSTRAINT = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_CONSTRAINT__NAME = KeysIndexesPackage.UNIQUE_KEY__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_CONSTRAINT__VISIBILITY = KeysIndexesPackage.UNIQUE_KEY__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_CONSTRAINT__CLIENT_DEPENDENCY = KeysIndexesPackage.UNIQUE_KEY__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_CONSTRAINT__CONSTRAINT = KeysIndexesPackage.UNIQUE_KEY__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_CONSTRAINT__IMPORTER = KeysIndexesPackage.UNIQUE_KEY__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_CONSTRAINT__NAMESPACE = KeysIndexesPackage.UNIQUE_KEY__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_CONSTRAINT__TAGGED_VALUE = KeysIndexesPackage.UNIQUE_KEY__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_CONSTRAINT__FEATURE = KeysIndexesPackage.UNIQUE_KEY__FEATURE;

	/**
	 * The feature id for the '<em><b>Key Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_CONSTRAINT__KEY_RELATIONSHIP = KeysIndexesPackage.UNIQUE_KEY__KEY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Deferrability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_CONSTRAINT__DEFERRABILITY = KeysIndexesPackage.UNIQUE_KEY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unique Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_CONSTRAINT_FEATURE_COUNT = KeysIndexesPackage.UNIQUE_KEY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CWM.Relational.impl.ForeignKeyImpl <em>Foreign Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Relational.impl.ForeignKeyImpl
	 * @see CWM.Relational.impl.RelationalPackageImpl#getForeignKey()
	 * @generated
	 */
	int FOREIGN_KEY = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__NAME = KeysIndexesPackage.KEY_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__VISIBILITY = KeysIndexesPackage.KEY_RELATIONSHIP__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__CLIENT_DEPENDENCY = KeysIndexesPackage.KEY_RELATIONSHIP__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__CONSTRAINT = KeysIndexesPackage.KEY_RELATIONSHIP__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__IMPORTER = KeysIndexesPackage.KEY_RELATIONSHIP__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__NAMESPACE = KeysIndexesPackage.KEY_RELATIONSHIP__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__TAGGED_VALUE = KeysIndexesPackage.KEY_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__FEATURE = KeysIndexesPackage.KEY_RELATIONSHIP__FEATURE;

	/**
	 * The feature id for the '<em><b>Unique Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__UNIQUE_KEY = KeysIndexesPackage.KEY_RELATIONSHIP__UNIQUE_KEY;

	/**
	 * The feature id for the '<em><b>Delete Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__DELETE_RULE = KeysIndexesPackage.KEY_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Update Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__UPDATE_RULE = KeysIndexesPackage.KEY_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Deferrability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__DEFERRABILITY = KeysIndexesPackage.KEY_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Foreign Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_FEATURE_COUNT = KeysIndexesPackage.KEY_RELATIONSHIP_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link CWM.Relational.impl.SQLIndexColumnImpl <em>SQL Index Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Relational.impl.SQLIndexColumnImpl
	 * @see CWM.Relational.impl.RelationalPackageImpl#getSQLIndexColumn()
	 * @generated
	 */
	int SQL_INDEX_COLUMN = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_INDEX_COLUMN__NAME = KeysIndexesPackage.INDEXED_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_INDEX_COLUMN__VISIBILITY = KeysIndexesPackage.INDEXED_FEATURE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_INDEX_COLUMN__CLIENT_DEPENDENCY = KeysIndexesPackage.INDEXED_FEATURE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_INDEX_COLUMN__CONSTRAINT = KeysIndexesPackage.INDEXED_FEATURE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_INDEX_COLUMN__IMPORTER = KeysIndexesPackage.INDEXED_FEATURE__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_INDEX_COLUMN__NAMESPACE = KeysIndexesPackage.INDEXED_FEATURE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_INDEX_COLUMN__TAGGED_VALUE = KeysIndexesPackage.INDEXED_FEATURE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Is Ascending</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_INDEX_COLUMN__IS_ASCENDING = KeysIndexesPackage.INDEXED_FEATURE__IS_ASCENDING;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_INDEX_COLUMN__FEATURE = KeysIndexesPackage.INDEXED_FEATURE__FEATURE;

	/**
	 * The feature id for the '<em><b>Index</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_INDEX_COLUMN__INDEX = KeysIndexesPackage.INDEXED_FEATURE__INDEX;

	/**
	 * The number of structural features of the '<em>SQL Index Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_INDEX_COLUMN_FEATURE_COUNT = KeysIndexesPackage.INDEXED_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CWM.Relational.impl.PrimaryKeyImpl <em>Primary Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Relational.impl.PrimaryKeyImpl
	 * @see CWM.Relational.impl.RelationalPackageImpl#getPrimaryKey()
	 * @generated
	 */
	int PRIMARY_KEY = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__NAME = UNIQUE_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__VISIBILITY = UNIQUE_CONSTRAINT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__CLIENT_DEPENDENCY = UNIQUE_CONSTRAINT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__CONSTRAINT = UNIQUE_CONSTRAINT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__IMPORTER = UNIQUE_CONSTRAINT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__NAMESPACE = UNIQUE_CONSTRAINT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__TAGGED_VALUE = UNIQUE_CONSTRAINT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__FEATURE = UNIQUE_CONSTRAINT__FEATURE;

	/**
	 * The feature id for the '<em><b>Key Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__KEY_RELATIONSHIP = UNIQUE_CONSTRAINT__KEY_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Deferrability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__DEFERRABILITY = UNIQUE_CONSTRAINT__DEFERRABILITY;

	/**
	 * The number of structural features of the '<em>Primary Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_FEATURE_COUNT = UNIQUE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CWM.Relational.impl.RowImpl <em>Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Relational.impl.RowImpl
	 * @see CWM.Relational.impl.RelationalPackageImpl#getRow()
	 * @generated
	 */
	int ROW = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__NAME = CwmInstancePackage.OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__VISIBILITY = CwmInstancePackage.OBJECT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__CLIENT_DEPENDENCY = CwmInstancePackage.OBJECT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__CONSTRAINT = CwmInstancePackage.OBJECT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__IMPORTER = CwmInstancePackage.OBJECT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__NAMESPACE = CwmInstancePackage.OBJECT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__TAGGED_VALUE = CwmInstancePackage.OBJECT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__CLASSIFIER = CwmInstancePackage.OBJECT__CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__SLOT = CwmInstancePackage.OBJECT__SLOT;

	/**
	 * The number of structural features of the '<em>Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_FEATURE_COUNT = CwmInstancePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CWM.Relational.impl.ColumnValueImpl <em>Column Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Relational.impl.ColumnValueImpl
	 * @see CWM.Relational.impl.RelationalPackageImpl#getColumnValue()
	 * @generated
	 */
	int COLUMN_VALUE = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_VALUE__NAME = CwmInstancePackage.DATA_VALUE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_VALUE__VISIBILITY = CwmInstancePackage.DATA_VALUE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_VALUE__CLIENT_DEPENDENCY = CwmInstancePackage.DATA_VALUE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_VALUE__CONSTRAINT = CwmInstancePackage.DATA_VALUE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_VALUE__IMPORTER = CwmInstancePackage.DATA_VALUE__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_VALUE__NAMESPACE = CwmInstancePackage.DATA_VALUE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_VALUE__TAGGED_VALUE = CwmInstancePackage.DATA_VALUE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_VALUE__CLASSIFIER = CwmInstancePackage.DATA_VALUE__CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_VALUE__VALUE = CwmInstancePackage.DATA_VALUE__VALUE;

	/**
	 * The number of structural features of the '<em>Column Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_VALUE_FEATURE_COUNT = CwmInstancePackage.DATA_VALUE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CWM.Relational.impl.CheckConstraintImpl <em>Check Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Relational.impl.CheckConstraintImpl
	 * @see CWM.Relational.impl.RelationalPackageImpl#getCheckConstraint()
	 * @generated
	 */
	int CHECK_CONSTRAINT = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_CONSTRAINT__NAME = CorePackage.CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_CONSTRAINT__VISIBILITY = CorePackage.CONSTRAINT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_CONSTRAINT__CLIENT_DEPENDENCY = CorePackage.CONSTRAINT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_CONSTRAINT__CONSTRAINT = CorePackage.CONSTRAINT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_CONSTRAINT__IMPORTER = CorePackage.CONSTRAINT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_CONSTRAINT__NAMESPACE = CorePackage.CONSTRAINT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_CONSTRAINT__TAGGED_VALUE = CorePackage.CONSTRAINT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_CONSTRAINT__BODY = CorePackage.CONSTRAINT__BODY;

	/**
	 * The feature id for the '<em><b>Constrained Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_CONSTRAINT__CONSTRAINED_ELEMENT = CorePackage.CONSTRAINT__CONSTRAINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Deferrability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_CONSTRAINT__DEFERRABILITY = CorePackage.CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Check Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_CONSTRAINT_FEATURE_COUNT = CorePackage.CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CWM.Relational.impl.RowSetImpl <em>Row Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Relational.impl.RowSetImpl
	 * @see CWM.Relational.impl.RelationalPackageImpl#getRowSet()
	 * @generated
	 */
	int ROW_SET = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_SET__NAME = CwmInstancePackage.EXTENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_SET__VISIBILITY = CwmInstancePackage.EXTENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_SET__CLIENT_DEPENDENCY = CwmInstancePackage.EXTENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_SET__CONSTRAINT = CwmInstancePackage.EXTENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_SET__IMPORTER = CwmInstancePackage.EXTENT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_SET__NAMESPACE = CwmInstancePackage.EXTENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_SET__TAGGED_VALUE = CwmInstancePackage.EXTENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_SET__OWNED_ELEMENT = CwmInstancePackage.EXTENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Imported Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_SET__IMPORTED_ELEMENT = CwmInstancePackage.EXTENT__IMPORTED_ELEMENT;

	/**
	 * The number of structural features of the '<em>Row Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_SET_FEATURE_COUNT = CwmInstancePackage.EXTENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CWM.Relational.impl.SQLParameterImpl <em>SQL Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Relational.impl.SQLParameterImpl
	 * @see CWM.Relational.impl.RelationalPackageImpl#getSQLParameter()
	 * @generated
	 */
	int SQL_PARAMETER = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_PARAMETER__NAME = BehavioralPackage.PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_PARAMETER__VISIBILITY = BehavioralPackage.PARAMETER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_PARAMETER__CLIENT_DEPENDENCY = BehavioralPackage.PARAMETER__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_PARAMETER__CONSTRAINT = BehavioralPackage.PARAMETER__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_PARAMETER__IMPORTER = BehavioralPackage.PARAMETER__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_PARAMETER__NAMESPACE = BehavioralPackage.PARAMETER__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_PARAMETER__TAGGED_VALUE = BehavioralPackage.PARAMETER__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_PARAMETER__DEFAULT_VALUE = BehavioralPackage.PARAMETER__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_PARAMETER__KIND = BehavioralPackage.PARAMETER__KIND;

	/**
	 * The feature id for the '<em><b>Behavioral Feature</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_PARAMETER__BEHAVIORAL_FEATURE = BehavioralPackage.PARAMETER__BEHAVIORAL_FEATURE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_PARAMETER__EVENT = BehavioralPackage.PARAMETER__EVENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_PARAMETER__TYPE = BehavioralPackage.PARAMETER__TYPE;

	/**
	 * The number of structural features of the '<em>SQL Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_PARAMETER_FEATURE_COUNT = BehavioralPackage.PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CWM.Relational.impl.Relational_containerImpl <em>Relational container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Relational.impl.Relational_containerImpl
	 * @see CWM.Relational.impl.RelationalPackageImpl#getRelational_container()
	 * @generated
	 */
	int RELATIONAL_CONTAINER = 24;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_CONTAINER__CATALOG = 0;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_CONTAINER__SCHEMA = 1;

	/**
	 * The feature id for the '<em><b>Column Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_CONTAINER__COLUMN_SET = 2;

	/**
	 * The feature id for the '<em><b>Named Column Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_CONTAINER__NAMED_COLUMN_SET = 3;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_CONTAINER__TABLE = 4;

	/**
	 * The feature id for the '<em><b>View</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_CONTAINER__VIEW = 5;

	/**
	 * The feature id for the '<em><b>Query Column Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_CONTAINER__QUERY_COLUMN_SET = 6;

	/**
	 * The feature id for the '<em><b>SQL Data Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_CONTAINER__SQL_DATA_TYPE = 7;

	/**
	 * The feature id for the '<em><b>SQL Distinct Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_CONTAINER__SQL_DISTINCT_TYPE = 8;

	/**
	 * The feature id for the '<em><b>SQL Simple Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_CONTAINER__SQL_SIMPLE_TYPE = 9;

	/**
	 * The feature id for the '<em><b>SQL Structured Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_CONTAINER__SQL_STRUCTURED_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_CONTAINER__COLUMN = 11;

	/**
	 * The feature id for the '<em><b>Procedure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_CONTAINER__PROCEDURE = 12;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_CONTAINER__TRIGGER = 13;

	/**
	 * The feature id for the '<em><b>SQL Index</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_CONTAINER__SQL_INDEX = 14;

	/**
	 * The feature id for the '<em><b>Unique Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_CONTAINER__UNIQUE_CONSTRAINT = 15;

	/**
	 * The feature id for the '<em><b>Foreign Key</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_CONTAINER__FOREIGN_KEY = 16;

	/**
	 * The feature id for the '<em><b>SQL Index Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_CONTAINER__SQL_INDEX_COLUMN = 17;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_CONTAINER__PRIMARY_KEY = 18;

	/**
	 * The feature id for the '<em><b>Row</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_CONTAINER__ROW = 19;

	/**
	 * The feature id for the '<em><b>Column Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_CONTAINER__COLUMN_VALUE = 20;

	/**
	 * The feature id for the '<em><b>Check Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_CONTAINER__CHECK_CONSTRAINT = 21;

	/**
	 * The feature id for the '<em><b>Row Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_CONTAINER__ROW_SET = 22;

	/**
	 * The feature id for the '<em><b>SQL Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_CONTAINER__SQL_PARAMETER = 23;

	/**
	 * The number of structural features of the '<em>Relational container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_CONTAINER_FEATURE_COUNT = 24;


	/**
	 * Returns the meta object for class '{@link CWM.Relational.Catalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catalog</em>'.
	 * @see CWM.Relational.Catalog
	 * @generated
	 */
	EClass getCatalog();

	/**
	 * Returns the meta object for the attribute '{@link CWM.Relational.Catalog#getDefaultCharacterSetName <em>Default Character Set Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Character Set Name</em>'.
	 * @see CWM.Relational.Catalog#getDefaultCharacterSetName()
	 * @see #getCatalog()
	 * @generated
	 */
	EAttribute getCatalog_DefaultCharacterSetName();

	/**
	 * Returns the meta object for the attribute '{@link CWM.Relational.Catalog#getDefaultCollationName <em>Default Collation Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Collation Name</em>'.
	 * @see CWM.Relational.Catalog#getDefaultCollationName()
	 * @see #getCatalog()
	 * @generated
	 */
	EAttribute getCatalog_DefaultCollationName();

	/**
	 * Returns the meta object for class '{@link CWM.Relational.Schema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema</em>'.
	 * @see CWM.Relational.Schema
	 * @generated
	 */
	EClass getSchema();

	/**
	 * Returns the meta object for class '{@link CWM.Relational.ColumnSet <em>Column Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column Set</em>'.
	 * @see CWM.Relational.ColumnSet
	 * @generated
	 */
	EClass getColumnSet();

	/**
	 * Returns the meta object for class '{@link CWM.Relational.NamedColumnSet <em>Named Column Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Column Set</em>'.
	 * @see CWM.Relational.NamedColumnSet
	 * @generated
	 */
	EClass getNamedColumnSet();

	/**
	 * Returns the meta object for the reference list '{@link CWM.Relational.NamedColumnSet#getOptionScopeColumn <em>Option Scope Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Option Scope Column</em>'.
	 * @see CWM.Relational.NamedColumnSet#getOptionScopeColumn()
	 * @see #getNamedColumnSet()
	 * @generated
	 */
	EReference getNamedColumnSet_OptionScopeColumn();

	/**
	 * Returns the meta object for the reference '{@link CWM.Relational.NamedColumnSet#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see CWM.Relational.NamedColumnSet#getType()
	 * @see #getNamedColumnSet()
	 * @generated
	 */
	EReference getNamedColumnSet_Type();

	/**
	 * Returns the meta object for the reference list '{@link CWM.Relational.NamedColumnSet#getUsingTrigger <em>Using Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Using Trigger</em>'.
	 * @see CWM.Relational.NamedColumnSet#getUsingTrigger()
	 * @see #getNamedColumnSet()
	 * @generated
	 */
	EReference getNamedColumnSet_UsingTrigger();

	/**
	 * Returns the meta object for class '{@link CWM.Relational.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see CWM.Relational.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the attribute '{@link CWM.Relational.Table#getIsTemporary <em>Is Temporary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Temporary</em>'.
	 * @see CWM.Relational.Table#getIsTemporary()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_IsTemporary();

	/**
	 * Returns the meta object for the attribute '{@link CWM.Relational.Table#getTemporaryScope <em>Temporary Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temporary Scope</em>'.
	 * @see CWM.Relational.Table#getTemporaryScope()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_TemporaryScope();

	/**
	 * Returns the meta object for the reference list '{@link CWM.Relational.Table#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Trigger</em>'.
	 * @see CWM.Relational.Table#getTrigger()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Trigger();

	/**
	 * Returns the meta object for the attribute '{@link CWM.Relational.Table#getIsSystem <em>Is System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is System</em>'.
	 * @see CWM.Relational.Table#getIsSystem()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_IsSystem();

	/**
	 * Returns the meta object for class '{@link CWM.Relational.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View</em>'.
	 * @see CWM.Relational.View
	 * @generated
	 */
	EClass getView();

	/**
	 * Returns the meta object for the attribute '{@link CWM.Relational.View#getIsReadOnly <em>Is Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Read Only</em>'.
	 * @see CWM.Relational.View#getIsReadOnly()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_IsReadOnly();

	/**
	 * Returns the meta object for the attribute '{@link CWM.Relational.View#getCheckOption <em>Check Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check Option</em>'.
	 * @see CWM.Relational.View#getCheckOption()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_CheckOption();

	/**
	 * Returns the meta object for the containment reference '{@link CWM.Relational.View#getQueryExpression <em>Query Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Query Expression</em>'.
	 * @see CWM.Relational.View#getQueryExpression()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_QueryExpression();

	/**
	 * Returns the meta object for class '{@link CWM.Relational.QueryColumnSet <em>Query Column Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Column Set</em>'.
	 * @see CWM.Relational.QueryColumnSet
	 * @generated
	 */
	EClass getQueryColumnSet();

	/**
	 * Returns the meta object for the containment reference '{@link CWM.Relational.QueryColumnSet#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Query</em>'.
	 * @see CWM.Relational.QueryColumnSet#getQuery()
	 * @see #getQueryColumnSet()
	 * @generated
	 */
	EReference getQueryColumnSet_Query();

	/**
	 * Returns the meta object for class '{@link CWM.Relational.SQLDataType <em>SQL Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SQL Data Type</em>'.
	 * @see CWM.Relational.SQLDataType
	 * @generated
	 */
	EClass getSQLDataType();

	/**
	 * Returns the meta object for the attribute '{@link CWM.Relational.SQLDataType#getTypeNumber <em>Type Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Number</em>'.
	 * @see CWM.Relational.SQLDataType#getTypeNumber()
	 * @see #getSQLDataType()
	 * @generated
	 */
	EAttribute getSQLDataType_TypeNumber();

	/**
	 * Returns the meta object for class '{@link CWM.Relational.SQLDistinctType <em>SQL Distinct Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SQL Distinct Type</em>'.
	 * @see CWM.Relational.SQLDistinctType
	 * @generated
	 */
	EClass getSQLDistinctType();

	/**
	 * Returns the meta object for the attribute '{@link CWM.Relational.SQLDistinctType#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see CWM.Relational.SQLDistinctType#getLength()
	 * @see #getSQLDistinctType()
	 * @generated
	 */
	EAttribute getSQLDistinctType_Length();

	/**
	 * Returns the meta object for the attribute '{@link CWM.Relational.SQLDistinctType#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see CWM.Relational.SQLDistinctType#getPrecision()
	 * @see #getSQLDistinctType()
	 * @generated
	 */
	EAttribute getSQLDistinctType_Precision();

	/**
	 * Returns the meta object for the attribute '{@link CWM.Relational.SQLDistinctType#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see CWM.Relational.SQLDistinctType#getScale()
	 * @see #getSQLDistinctType()
	 * @generated
	 */
	EAttribute getSQLDistinctType_Scale();

	/**
	 * Returns the meta object for the reference '{@link CWM.Relational.SQLDistinctType#getSqlSimpleType <em>Sql Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sql Simple Type</em>'.
	 * @see CWM.Relational.SQLDistinctType#getSqlSimpleType()
	 * @see #getSQLDistinctType()
	 * @generated
	 */
	EReference getSQLDistinctType_SqlSimpleType();

	/**
	 * Returns the meta object for class '{@link CWM.Relational.SQLSimpleType <em>SQL Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SQL Simple Type</em>'.
	 * @see CWM.Relational.SQLSimpleType
	 * @generated
	 */
	EClass getSQLSimpleType();

	/**
	 * Returns the meta object for the attribute '{@link CWM.Relational.SQLSimpleType#getCharacterMaximumLength <em>Character Maximum Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Character Maximum Length</em>'.
	 * @see CWM.Relational.SQLSimpleType#getCharacterMaximumLength()
	 * @see #getSQLSimpleType()
	 * @generated
	 */
	EAttribute getSQLSimpleType_CharacterMaximumLength();

	/**
	 * Returns the meta object for the attribute '{@link CWM.Relational.SQLSimpleType#getCharacterOctetLength <em>Character Octet Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Character Octet Length</em>'.
	 * @see CWM.Relational.SQLSimpleType#getCharacterOctetLength()
	 * @see #getSQLSimpleType()
	 * @generated
	 */
	EAttribute getSQLSimpleType_CharacterOctetLength();

	/**
	 * Returns the meta object for the attribute '{@link CWM.Relational.SQLSimpleType#getNumericPrecision <em>Numeric Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numeric Precision</em>'.
	 * @see CWM.Relational.SQLSimpleType#getNumericPrecision()
	 * @see #getSQLSimpleType()
	 * @generated
	 */
	EAttribute getSQLSimpleType_NumericPrecision();

	/**
	 * Returns the meta object for the attribute '{@link CWM.Relational.SQLSimpleType#getNumericPrecisionRadix <em>Numeric Precision Radix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numeric Precision Radix</em>'.
	 * @see CWM.Relational.SQLSimpleType#getNumericPrecisionRadix()
	 * @see #getSQLSimpleType()
	 * @generated
	 */
	EAttribute getSQLSimpleType_NumericPrecisionRadix();

	/**
	 * Returns the meta object for the attribute '{@link CWM.Relational.SQLSimpleType#getNumericScale <em>Numeric Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numeric Scale</em>'.
	 * @see CWM.Relational.SQLSimpleType#getNumericScale()
	 * @see #getSQLSimpleType()
	 * @generated
	 */
	EAttribute getSQLSimpleType_NumericScale();

	/**
	 * Returns the meta object for the attribute '{@link CWM.Relational.SQLSimpleType#getDateTimePrecision <em>Date Time Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Time Precision</em>'.
	 * @see CWM.Relational.SQLSimpleType#getDateTimePrecision()
	 * @see #getSQLSimpleType()
	 * @generated
	 */
	EAttribute getSQLSimpleType_DateTimePrecision();

	/**
	 * Returns the meta object for class '{@link CWM.Relational.SQLStructuredType <em>SQL Structured Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SQL Structured Type</em>'.
	 * @see CWM.Relational.SQLStructuredType
	 * @generated
	 */
	EClass getSQLStructuredType();

	/**
	 * Returns the meta object for the reference list '{@link CWM.Relational.SQLStructuredType#getReferencingColumn <em>Referencing Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referencing Column</em>'.
	 * @see CWM.Relational.SQLStructuredType#getReferencingColumn()
	 * @see #getSQLStructuredType()
	 * @generated
	 */
	EReference getSQLStructuredType_ReferencingColumn();

	/**
	 * Returns the meta object for the reference list '{@link CWM.Relational.SQLStructuredType#getColumnSet <em>Column Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Column Set</em>'.
	 * @see CWM.Relational.SQLStructuredType#getColumnSet()
	 * @see #getSQLStructuredType()
	 * @generated
	 */
	EReference getSQLStructuredType_ColumnSet();

	/**
	 * Returns the meta object for class '{@link CWM.Relational.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see CWM.Relational.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the attribute '{@link CWM.Relational.Column#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see CWM.Relational.Column#getPrecision()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Precision();

	/**
	 * Returns the meta object for the attribute '{@link CWM.Relational.Column#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see CWM.Relational.Column#getScale()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Scale();

	/**
	 * Returns the meta object for the attribute '{@link CWM.Relational.Column#getIsNullable <em>Is Nullable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Nullable</em>'.
	 * @see CWM.Relational.Column#getIsNullable()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_IsNullable();

	/**
	 * Returns the meta object for the attribute '{@link CWM.Relational.Column#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see CWM.Relational.Column#getLength()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Length();

	/**
	 * Returns the meta object for the attribute '{@link CWM.Relational.Column#getCollationName <em>Collation Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collation Name</em>'.
	 * @see CWM.Relational.Column#getCollationName()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_CollationName();

	/**
	 * Returns the meta object for the attribute '{@link CWM.Relational.Column#getCharacterSetName <em>Character Set Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Character Set Name</em>'.
	 * @see CWM.Relational.Column#getCharacterSetName()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_CharacterSetName();

	/**
	 * Returns the meta object for the reference '{@link CWM.Relational.Column#getOptionScopeColumnSet <em>Option Scope Column Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Option Scope Column Set</em>'.
	 * @see CWM.Relational.Column#getOptionScopeColumnSet()
	 * @see #getColumn()
	 * @generated
	 */
	EReference getColumn_OptionScopeColumnSet();

	/**
	 * Returns the meta object for the reference '{@link CWM.Relational.Column#getReferencedTableType <em>Referenced Table Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Table Type</em>'.
	 * @see CWM.Relational.Column#getReferencedTableType()
	 * @see #getColumn()
	 * @generated
	 */
	EReference getColumn_ReferencedTableType();

	/**
	 * Returns the meta object for class '{@link CWM.Relational.Procedure <em>Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Procedure</em>'.
	 * @see CWM.Relational.Procedure
	 * @generated
	 */
	EClass getProcedure();

	/**
	 * Returns the meta object for the attribute '{@link CWM.Relational.Procedure#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see CWM.Relational.Procedure#getType()
	 * @see #getProcedure()
	 * @generated
	 */
	EAttribute getProcedure_Type();

	/**
	 * Returns the meta object for class '{@link CWM.Relational.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger</em>'.
	 * @see CWM.Relational.Trigger
	 * @generated
	 */
	EClass getTrigger();

	/**
	 * Returns the meta object for the attribute '{@link CWM.Relational.Trigger#getEventManipulation <em>Event Manipulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Manipulation</em>'.
	 * @see CWM.Relational.Trigger#getEventManipulation()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_EventManipulation();

	/**
	 * Returns the meta object for the containment reference '{@link CWM.Relational.Trigger#getActionCondition <em>Action Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action Condition</em>'.
	 * @see CWM.Relational.Trigger#getActionCondition()
	 * @see #getTrigger()
	 * @generated
	 */
	EReference getTrigger_ActionCondition();

	/**
	 * Returns the meta object for the containment reference '{@link CWM.Relational.Trigger#getActionStatement <em>Action Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action Statement</em>'.
	 * @see CWM.Relational.Trigger#getActionStatement()
	 * @see #getTrigger()
	 * @generated
	 */
	EReference getTrigger_ActionStatement();

	/**
	 * Returns the meta object for the attribute '{@link CWM.Relational.Trigger#getActionOrientation <em>Action Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Orientation</em>'.
	 * @see CWM.Relational.Trigger#getActionOrientation()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_ActionOrientation();

	/**
	 * Returns the meta object for the attribute '{@link CWM.Relational.Trigger#getConditionTiming <em>Condition Timing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition Timing</em>'.
	 * @see CWM.Relational.Trigger#getConditionTiming()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_ConditionTiming();

	/**
	 * Returns the meta object for the attribute '{@link CWM.Relational.Trigger#getConditionReferenceNewTable <em>Condition Reference New Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition Reference New Table</em>'.
	 * @see CWM.Relational.Trigger#getConditionReferenceNewTable()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_ConditionReferenceNewTable();

	/**
	 * Returns the meta object for the attribute '{@link CWM.Relational.Trigger#getConditionReferenceOldTable <em>Condition Reference Old Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition Reference Old Table</em>'.
	 * @see CWM.Relational.Trigger#getConditionReferenceOldTable()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_ConditionReferenceOldTable();

	/**
	 * Returns the meta object for the reference '{@link CWM.Relational.Trigger#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Table</em>'.
	 * @see CWM.Relational.Trigger#getTable()
	 * @see #getTrigger()
	 * @generated
	 */
	EReference getTrigger_Table();

	/**
	 * Returns the meta object for the reference list '{@link CWM.Relational.Trigger#getUsedColumnSet <em>Used Column Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Used Column Set</em>'.
	 * @see CWM.Relational.Trigger#getUsedColumnSet()
	 * @see #getTrigger()
	 * @generated
	 */
	EReference getTrigger_UsedColumnSet();

	/**
	 * Returns the meta object for class '{@link CWM.Relational.SQLIndex <em>SQL Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SQL Index</em>'.
	 * @see CWM.Relational.SQLIndex
	 * @generated
	 */
	EClass getSQLIndex();

	/**
	 * Returns the meta object for the attribute '{@link CWM.Relational.SQLIndex#getFilterCondition <em>Filter Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter Condition</em>'.
	 * @see CWM.Relational.SQLIndex#getFilterCondition()
	 * @see #getSQLIndex()
	 * @generated
	 */
	EAttribute getSQLIndex_FilterCondition();

	/**
	 * Returns the meta object for the attribute '{@link CWM.Relational.SQLIndex#getIsNullable <em>Is Nullable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Nullable</em>'.
	 * @see CWM.Relational.SQLIndex#getIsNullable()
	 * @see #getSQLIndex()
	 * @generated
	 */
	EAttribute getSQLIndex_IsNullable();

	/**
	 * Returns the meta object for the attribute '{@link CWM.Relational.SQLIndex#getAutoUpdate <em>Auto Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Update</em>'.
	 * @see CWM.Relational.SQLIndex#getAutoUpdate()
	 * @see #getSQLIndex()
	 * @generated
	 */
	EAttribute getSQLIndex_AutoUpdate();

	/**
	 * Returns the meta object for class '{@link CWM.Relational.UniqueConstraint <em>Unique Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unique Constraint</em>'.
	 * @see CWM.Relational.UniqueConstraint
	 * @generated
	 */
	EClass getUniqueConstraint();

	/**
	 * Returns the meta object for the attribute '{@link CWM.Relational.UniqueConstraint#getDeferrability <em>Deferrability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deferrability</em>'.
	 * @see CWM.Relational.UniqueConstraint#getDeferrability()
	 * @see #getUniqueConstraint()
	 * @generated
	 */
	EAttribute getUniqueConstraint_Deferrability();

	/**
	 * Returns the meta object for class '{@link CWM.Relational.ForeignKey <em>Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Foreign Key</em>'.
	 * @see CWM.Relational.ForeignKey
	 * @generated
	 */
	EClass getForeignKey();

	/**
	 * Returns the meta object for the attribute '{@link CWM.Relational.ForeignKey#getDeleteRule <em>Delete Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delete Rule</em>'.
	 * @see CWM.Relational.ForeignKey#getDeleteRule()
	 * @see #getForeignKey()
	 * @generated
	 */
	EAttribute getForeignKey_DeleteRule();

	/**
	 * Returns the meta object for the attribute '{@link CWM.Relational.ForeignKey#getUpdateRule <em>Update Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update Rule</em>'.
	 * @see CWM.Relational.ForeignKey#getUpdateRule()
	 * @see #getForeignKey()
	 * @generated
	 */
	EAttribute getForeignKey_UpdateRule();

	/**
	 * Returns the meta object for the attribute '{@link CWM.Relational.ForeignKey#getDeferrability <em>Deferrability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deferrability</em>'.
	 * @see CWM.Relational.ForeignKey#getDeferrability()
	 * @see #getForeignKey()
	 * @generated
	 */
	EAttribute getForeignKey_Deferrability();

	/**
	 * Returns the meta object for class '{@link CWM.Relational.SQLIndexColumn <em>SQL Index Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SQL Index Column</em>'.
	 * @see CWM.Relational.SQLIndexColumn
	 * @generated
	 */
	EClass getSQLIndexColumn();

	/**
	 * Returns the meta object for class '{@link CWM.Relational.PrimaryKey <em>Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primary Key</em>'.
	 * @see CWM.Relational.PrimaryKey
	 * @generated
	 */
	EClass getPrimaryKey();

	/**
	 * Returns the meta object for class '{@link CWM.Relational.Row <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Row</em>'.
	 * @see CWM.Relational.Row
	 * @generated
	 */
	EClass getRow();

	/**
	 * Returns the meta object for class '{@link CWM.Relational.ColumnValue <em>Column Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column Value</em>'.
	 * @see CWM.Relational.ColumnValue
	 * @generated
	 */
	EClass getColumnValue();

	/**
	 * Returns the meta object for class '{@link CWM.Relational.CheckConstraint <em>Check Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check Constraint</em>'.
	 * @see CWM.Relational.CheckConstraint
	 * @generated
	 */
	EClass getCheckConstraint();

	/**
	 * Returns the meta object for the attribute '{@link CWM.Relational.CheckConstraint#getDeferrability <em>Deferrability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deferrability</em>'.
	 * @see CWM.Relational.CheckConstraint#getDeferrability()
	 * @see #getCheckConstraint()
	 * @generated
	 */
	EAttribute getCheckConstraint_Deferrability();

	/**
	 * Returns the meta object for class '{@link CWM.Relational.RowSet <em>Row Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Row Set</em>'.
	 * @see CWM.Relational.RowSet
	 * @generated
	 */
	EClass getRowSet();

	/**
	 * Returns the meta object for class '{@link CWM.Relational.SQLParameter <em>SQL Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SQL Parameter</em>'.
	 * @see CWM.Relational.SQLParameter
	 * @generated
	 */
	EClass getSQLParameter();

	/**
	 * Returns the meta object for class '{@link CWM.Relational.Relational_container <em>Relational container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational container</em>'.
	 * @see CWM.Relational.Relational_container
	 * @generated
	 */
	EClass getRelational_container();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Relational.Relational_container#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Catalog</em>'.
	 * @see CWM.Relational.Relational_container#getCatalog()
	 * @see #getRelational_container()
	 * @generated
	 */
	EReference getRelational_container_Catalog();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Relational.Relational_container#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Schema</em>'.
	 * @see CWM.Relational.Relational_container#getSchema()
	 * @see #getRelational_container()
	 * @generated
	 */
	EReference getRelational_container_Schema();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Relational.Relational_container#getColumnSet <em>Column Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Column Set</em>'.
	 * @see CWM.Relational.Relational_container#getColumnSet()
	 * @see #getRelational_container()
	 * @generated
	 */
	EReference getRelational_container_ColumnSet();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Relational.Relational_container#getNamedColumnSet <em>Named Column Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Named Column Set</em>'.
	 * @see CWM.Relational.Relational_container#getNamedColumnSet()
	 * @see #getRelational_container()
	 * @generated
	 */
	EReference getRelational_container_NamedColumnSet();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Relational.Relational_container#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table</em>'.
	 * @see CWM.Relational.Relational_container#getTable()
	 * @see #getRelational_container()
	 * @generated
	 */
	EReference getRelational_container_Table();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Relational.Relational_container#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>View</em>'.
	 * @see CWM.Relational.Relational_container#getView()
	 * @see #getRelational_container()
	 * @generated
	 */
	EReference getRelational_container_View();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Relational.Relational_container#getQueryColumnSet <em>Query Column Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Query Column Set</em>'.
	 * @see CWM.Relational.Relational_container#getQueryColumnSet()
	 * @see #getRelational_container()
	 * @generated
	 */
	EReference getRelational_container_QueryColumnSet();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Relational.Relational_container#getSQLDataType <em>SQL Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SQL Data Type</em>'.
	 * @see CWM.Relational.Relational_container#getSQLDataType()
	 * @see #getRelational_container()
	 * @generated
	 */
	EReference getRelational_container_SQLDataType();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Relational.Relational_container#getSQLDistinctType <em>SQL Distinct Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SQL Distinct Type</em>'.
	 * @see CWM.Relational.Relational_container#getSQLDistinctType()
	 * @see #getRelational_container()
	 * @generated
	 */
	EReference getRelational_container_SQLDistinctType();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Relational.Relational_container#getSQLSimpleType <em>SQL Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SQL Simple Type</em>'.
	 * @see CWM.Relational.Relational_container#getSQLSimpleType()
	 * @see #getRelational_container()
	 * @generated
	 */
	EReference getRelational_container_SQLSimpleType();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Relational.Relational_container#getSQLStructuredType <em>SQL Structured Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SQL Structured Type</em>'.
	 * @see CWM.Relational.Relational_container#getSQLStructuredType()
	 * @see #getRelational_container()
	 * @generated
	 */
	EReference getRelational_container_SQLStructuredType();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Relational.Relational_container#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Column</em>'.
	 * @see CWM.Relational.Relational_container#getColumn()
	 * @see #getRelational_container()
	 * @generated
	 */
	EReference getRelational_container_Column();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Relational.Relational_container#getProcedure <em>Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Procedure</em>'.
	 * @see CWM.Relational.Relational_container#getProcedure()
	 * @see #getRelational_container()
	 * @generated
	 */
	EReference getRelational_container_Procedure();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Relational.Relational_container#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trigger</em>'.
	 * @see CWM.Relational.Relational_container#getTrigger()
	 * @see #getRelational_container()
	 * @generated
	 */
	EReference getRelational_container_Trigger();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Relational.Relational_container#getSQLIndex <em>SQL Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SQL Index</em>'.
	 * @see CWM.Relational.Relational_container#getSQLIndex()
	 * @see #getRelational_container()
	 * @generated
	 */
	EReference getRelational_container_SQLIndex();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Relational.Relational_container#getUniqueConstraint <em>Unique Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unique Constraint</em>'.
	 * @see CWM.Relational.Relational_container#getUniqueConstraint()
	 * @see #getRelational_container()
	 * @generated
	 */
	EReference getRelational_container_UniqueConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Relational.Relational_container#getForeignKey <em>Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Foreign Key</em>'.
	 * @see CWM.Relational.Relational_container#getForeignKey()
	 * @see #getRelational_container()
	 * @generated
	 */
	EReference getRelational_container_ForeignKey();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Relational.Relational_container#getSQLIndexColumn <em>SQL Index Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SQL Index Column</em>'.
	 * @see CWM.Relational.Relational_container#getSQLIndexColumn()
	 * @see #getRelational_container()
	 * @generated
	 */
	EReference getRelational_container_SQLIndexColumn();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Relational.Relational_container#getPrimaryKey <em>Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Primary Key</em>'.
	 * @see CWM.Relational.Relational_container#getPrimaryKey()
	 * @see #getRelational_container()
	 * @generated
	 */
	EReference getRelational_container_PrimaryKey();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Relational.Relational_container#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Row</em>'.
	 * @see CWM.Relational.Relational_container#getRow()
	 * @see #getRelational_container()
	 * @generated
	 */
	EReference getRelational_container_Row();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Relational.Relational_container#getColumnValue <em>Column Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Column Value</em>'.
	 * @see CWM.Relational.Relational_container#getColumnValue()
	 * @see #getRelational_container()
	 * @generated
	 */
	EReference getRelational_container_ColumnValue();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Relational.Relational_container#getCheckConstraint <em>Check Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Check Constraint</em>'.
	 * @see CWM.Relational.Relational_container#getCheckConstraint()
	 * @see #getRelational_container()
	 * @generated
	 */
	EReference getRelational_container_CheckConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Relational.Relational_container#getRowSet <em>Row Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Row Set</em>'.
	 * @see CWM.Relational.Relational_container#getRowSet()
	 * @see #getRelational_container()
	 * @generated
	 */
	EReference getRelational_container_RowSet();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Relational.Relational_container#getSQLParameter <em>SQL Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SQL Parameter</em>'.
	 * @see CWM.Relational.Relational_container#getSQLParameter()
	 * @see #getRelational_container()
	 * @generated
	 */
	EReference getRelational_container_SQLParameter();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RelationalFactory getRelationalFactory();

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
		 * The meta object literal for the '{@link CWM.Relational.impl.CatalogImpl <em>Catalog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Relational.impl.CatalogImpl
		 * @see CWM.Relational.impl.RelationalPackageImpl#getCatalog()
		 * @generated
		 */
		EClass CATALOG = eINSTANCE.getCatalog();

		/**
		 * The meta object literal for the '<em><b>Default Character Set Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG__DEFAULT_CHARACTER_SET_NAME = eINSTANCE.getCatalog_DefaultCharacterSetName();

		/**
		 * The meta object literal for the '<em><b>Default Collation Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG__DEFAULT_COLLATION_NAME = eINSTANCE.getCatalog_DefaultCollationName();

		/**
		 * The meta object literal for the '{@link CWM.Relational.impl.SchemaImpl <em>Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Relational.impl.SchemaImpl
		 * @see CWM.Relational.impl.RelationalPackageImpl#getSchema()
		 * @generated
		 */
		EClass SCHEMA = eINSTANCE.getSchema();

		/**
		 * The meta object literal for the '{@link CWM.Relational.impl.ColumnSetImpl <em>Column Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Relational.impl.ColumnSetImpl
		 * @see CWM.Relational.impl.RelationalPackageImpl#getColumnSet()
		 * @generated
		 */
		EClass COLUMN_SET = eINSTANCE.getColumnSet();

		/**
		 * The meta object literal for the '{@link CWM.Relational.impl.NamedColumnSetImpl <em>Named Column Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Relational.impl.NamedColumnSetImpl
		 * @see CWM.Relational.impl.RelationalPackageImpl#getNamedColumnSet()
		 * @generated
		 */
		EClass NAMED_COLUMN_SET = eINSTANCE.getNamedColumnSet();

		/**
		 * The meta object literal for the '<em><b>Option Scope Column</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_COLUMN_SET__OPTION_SCOPE_COLUMN = eINSTANCE.getNamedColumnSet_OptionScopeColumn();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_COLUMN_SET__TYPE = eINSTANCE.getNamedColumnSet_Type();

		/**
		 * The meta object literal for the '<em><b>Using Trigger</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_COLUMN_SET__USING_TRIGGER = eINSTANCE.getNamedColumnSet_UsingTrigger();

		/**
		 * The meta object literal for the '{@link CWM.Relational.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Relational.impl.TableImpl
		 * @see CWM.Relational.impl.RelationalPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Is Temporary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__IS_TEMPORARY = eINSTANCE.getTable_IsTemporary();

		/**
		 * The meta object literal for the '<em><b>Temporary Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__TEMPORARY_SCOPE = eINSTANCE.getTable_TemporaryScope();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__TRIGGER = eINSTANCE.getTable_Trigger();

		/**
		 * The meta object literal for the '<em><b>Is System</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__IS_SYSTEM = eINSTANCE.getTable_IsSystem();

		/**
		 * The meta object literal for the '{@link CWM.Relational.impl.ViewImpl <em>View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Relational.impl.ViewImpl
		 * @see CWM.Relational.impl.RelationalPackageImpl#getView()
		 * @generated
		 */
		EClass VIEW = eINSTANCE.getView();

		/**
		 * The meta object literal for the '<em><b>Is Read Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW__IS_READ_ONLY = eINSTANCE.getView_IsReadOnly();

		/**
		 * The meta object literal for the '<em><b>Check Option</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW__CHECK_OPTION = eINSTANCE.getView_CheckOption();

		/**
		 * The meta object literal for the '<em><b>Query Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__QUERY_EXPRESSION = eINSTANCE.getView_QueryExpression();

		/**
		 * The meta object literal for the '{@link CWM.Relational.impl.QueryColumnSetImpl <em>Query Column Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Relational.impl.QueryColumnSetImpl
		 * @see CWM.Relational.impl.RelationalPackageImpl#getQueryColumnSet()
		 * @generated
		 */
		EClass QUERY_COLUMN_SET = eINSTANCE.getQueryColumnSet();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_COLUMN_SET__QUERY = eINSTANCE.getQueryColumnSet_Query();

		/**
		 * The meta object literal for the '{@link CWM.Relational.impl.SQLDataTypeImpl <em>SQL Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Relational.impl.SQLDataTypeImpl
		 * @see CWM.Relational.impl.RelationalPackageImpl#getSQLDataType()
		 * @generated
		 */
		EClass SQL_DATA_TYPE = eINSTANCE.getSQLDataType();

		/**
		 * The meta object literal for the '<em><b>Type Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQL_DATA_TYPE__TYPE_NUMBER = eINSTANCE.getSQLDataType_TypeNumber();

		/**
		 * The meta object literal for the '{@link CWM.Relational.impl.SQLDistinctTypeImpl <em>SQL Distinct Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Relational.impl.SQLDistinctTypeImpl
		 * @see CWM.Relational.impl.RelationalPackageImpl#getSQLDistinctType()
		 * @generated
		 */
		EClass SQL_DISTINCT_TYPE = eINSTANCE.getSQLDistinctType();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQL_DISTINCT_TYPE__LENGTH = eINSTANCE.getSQLDistinctType_Length();

		/**
		 * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQL_DISTINCT_TYPE__PRECISION = eINSTANCE.getSQLDistinctType_Precision();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQL_DISTINCT_TYPE__SCALE = eINSTANCE.getSQLDistinctType_Scale();

		/**
		 * The meta object literal for the '<em><b>Sql Simple Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQL_DISTINCT_TYPE__SQL_SIMPLE_TYPE = eINSTANCE.getSQLDistinctType_SqlSimpleType();

		/**
		 * The meta object literal for the '{@link CWM.Relational.impl.SQLSimpleTypeImpl <em>SQL Simple Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Relational.impl.SQLSimpleTypeImpl
		 * @see CWM.Relational.impl.RelationalPackageImpl#getSQLSimpleType()
		 * @generated
		 */
		EClass SQL_SIMPLE_TYPE = eINSTANCE.getSQLSimpleType();

		/**
		 * The meta object literal for the '<em><b>Character Maximum Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQL_SIMPLE_TYPE__CHARACTER_MAXIMUM_LENGTH = eINSTANCE.getSQLSimpleType_CharacterMaximumLength();

		/**
		 * The meta object literal for the '<em><b>Character Octet Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQL_SIMPLE_TYPE__CHARACTER_OCTET_LENGTH = eINSTANCE.getSQLSimpleType_CharacterOctetLength();

		/**
		 * The meta object literal for the '<em><b>Numeric Precision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQL_SIMPLE_TYPE__NUMERIC_PRECISION = eINSTANCE.getSQLSimpleType_NumericPrecision();

		/**
		 * The meta object literal for the '<em><b>Numeric Precision Radix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQL_SIMPLE_TYPE__NUMERIC_PRECISION_RADIX = eINSTANCE.getSQLSimpleType_NumericPrecisionRadix();

		/**
		 * The meta object literal for the '<em><b>Numeric Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQL_SIMPLE_TYPE__NUMERIC_SCALE = eINSTANCE.getSQLSimpleType_NumericScale();

		/**
		 * The meta object literal for the '<em><b>Date Time Precision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQL_SIMPLE_TYPE__DATE_TIME_PRECISION = eINSTANCE.getSQLSimpleType_DateTimePrecision();

		/**
		 * The meta object literal for the '{@link CWM.Relational.impl.SQLStructuredTypeImpl <em>SQL Structured Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Relational.impl.SQLStructuredTypeImpl
		 * @see CWM.Relational.impl.RelationalPackageImpl#getSQLStructuredType()
		 * @generated
		 */
		EClass SQL_STRUCTURED_TYPE = eINSTANCE.getSQLStructuredType();

		/**
		 * The meta object literal for the '<em><b>Referencing Column</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQL_STRUCTURED_TYPE__REFERENCING_COLUMN = eINSTANCE.getSQLStructuredType_ReferencingColumn();

		/**
		 * The meta object literal for the '<em><b>Column Set</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQL_STRUCTURED_TYPE__COLUMN_SET = eINSTANCE.getSQLStructuredType_ColumnSet();

		/**
		 * The meta object literal for the '{@link CWM.Relational.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Relational.impl.ColumnImpl
		 * @see CWM.Relational.impl.RelationalPackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__PRECISION = eINSTANCE.getColumn_Precision();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__SCALE = eINSTANCE.getColumn_Scale();

		/**
		 * The meta object literal for the '<em><b>Is Nullable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__IS_NULLABLE = eINSTANCE.getColumn_IsNullable();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__LENGTH = eINSTANCE.getColumn_Length();

		/**
		 * The meta object literal for the '<em><b>Collation Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__COLLATION_NAME = eINSTANCE.getColumn_CollationName();

		/**
		 * The meta object literal for the '<em><b>Character Set Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__CHARACTER_SET_NAME = eINSTANCE.getColumn_CharacterSetName();

		/**
		 * The meta object literal for the '<em><b>Option Scope Column Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN__OPTION_SCOPE_COLUMN_SET = eINSTANCE.getColumn_OptionScopeColumnSet();

		/**
		 * The meta object literal for the '<em><b>Referenced Table Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN__REFERENCED_TABLE_TYPE = eINSTANCE.getColumn_ReferencedTableType();

		/**
		 * The meta object literal for the '{@link CWM.Relational.impl.ProcedureImpl <em>Procedure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Relational.impl.ProcedureImpl
		 * @see CWM.Relational.impl.RelationalPackageImpl#getProcedure()
		 * @generated
		 */
		EClass PROCEDURE = eINSTANCE.getProcedure();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCEDURE__TYPE = eINSTANCE.getProcedure_Type();

		/**
		 * The meta object literal for the '{@link CWM.Relational.impl.TriggerImpl <em>Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Relational.impl.TriggerImpl
		 * @see CWM.Relational.impl.RelationalPackageImpl#getTrigger()
		 * @generated
		 */
		EClass TRIGGER = eINSTANCE.getTrigger();

		/**
		 * The meta object literal for the '<em><b>Event Manipulation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__EVENT_MANIPULATION = eINSTANCE.getTrigger_EventManipulation();

		/**
		 * The meta object literal for the '<em><b>Action Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER__ACTION_CONDITION = eINSTANCE.getTrigger_ActionCondition();

		/**
		 * The meta object literal for the '<em><b>Action Statement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER__ACTION_STATEMENT = eINSTANCE.getTrigger_ActionStatement();

		/**
		 * The meta object literal for the '<em><b>Action Orientation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__ACTION_ORIENTATION = eINSTANCE.getTrigger_ActionOrientation();

		/**
		 * The meta object literal for the '<em><b>Condition Timing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__CONDITION_TIMING = eINSTANCE.getTrigger_ConditionTiming();

		/**
		 * The meta object literal for the '<em><b>Condition Reference New Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__CONDITION_REFERENCE_NEW_TABLE = eINSTANCE.getTrigger_ConditionReferenceNewTable();

		/**
		 * The meta object literal for the '<em><b>Condition Reference Old Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__CONDITION_REFERENCE_OLD_TABLE = eINSTANCE.getTrigger_ConditionReferenceOldTable();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER__TABLE = eINSTANCE.getTrigger_Table();

		/**
		 * The meta object literal for the '<em><b>Used Column Set</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER__USED_COLUMN_SET = eINSTANCE.getTrigger_UsedColumnSet();

		/**
		 * The meta object literal for the '{@link CWM.Relational.impl.SQLIndexImpl <em>SQL Index</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Relational.impl.SQLIndexImpl
		 * @see CWM.Relational.impl.RelationalPackageImpl#getSQLIndex()
		 * @generated
		 */
		EClass SQL_INDEX = eINSTANCE.getSQLIndex();

		/**
		 * The meta object literal for the '<em><b>Filter Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQL_INDEX__FILTER_CONDITION = eINSTANCE.getSQLIndex_FilterCondition();

		/**
		 * The meta object literal for the '<em><b>Is Nullable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQL_INDEX__IS_NULLABLE = eINSTANCE.getSQLIndex_IsNullable();

		/**
		 * The meta object literal for the '<em><b>Auto Update</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQL_INDEX__AUTO_UPDATE = eINSTANCE.getSQLIndex_AutoUpdate();

		/**
		 * The meta object literal for the '{@link CWM.Relational.impl.UniqueConstraintImpl <em>Unique Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Relational.impl.UniqueConstraintImpl
		 * @see CWM.Relational.impl.RelationalPackageImpl#getUniqueConstraint()
		 * @generated
		 */
		EClass UNIQUE_CONSTRAINT = eINSTANCE.getUniqueConstraint();

		/**
		 * The meta object literal for the '<em><b>Deferrability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIQUE_CONSTRAINT__DEFERRABILITY = eINSTANCE.getUniqueConstraint_Deferrability();

		/**
		 * The meta object literal for the '{@link CWM.Relational.impl.ForeignKeyImpl <em>Foreign Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Relational.impl.ForeignKeyImpl
		 * @see CWM.Relational.impl.RelationalPackageImpl#getForeignKey()
		 * @generated
		 */
		EClass FOREIGN_KEY = eINSTANCE.getForeignKey();

		/**
		 * The meta object literal for the '<em><b>Delete Rule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOREIGN_KEY__DELETE_RULE = eINSTANCE.getForeignKey_DeleteRule();

		/**
		 * The meta object literal for the '<em><b>Update Rule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOREIGN_KEY__UPDATE_RULE = eINSTANCE.getForeignKey_UpdateRule();

		/**
		 * The meta object literal for the '<em><b>Deferrability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOREIGN_KEY__DEFERRABILITY = eINSTANCE.getForeignKey_Deferrability();

		/**
		 * The meta object literal for the '{@link CWM.Relational.impl.SQLIndexColumnImpl <em>SQL Index Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Relational.impl.SQLIndexColumnImpl
		 * @see CWM.Relational.impl.RelationalPackageImpl#getSQLIndexColumn()
		 * @generated
		 */
		EClass SQL_INDEX_COLUMN = eINSTANCE.getSQLIndexColumn();

		/**
		 * The meta object literal for the '{@link CWM.Relational.impl.PrimaryKeyImpl <em>Primary Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Relational.impl.PrimaryKeyImpl
		 * @see CWM.Relational.impl.RelationalPackageImpl#getPrimaryKey()
		 * @generated
		 */
		EClass PRIMARY_KEY = eINSTANCE.getPrimaryKey();

		/**
		 * The meta object literal for the '{@link CWM.Relational.impl.RowImpl <em>Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Relational.impl.RowImpl
		 * @see CWM.Relational.impl.RelationalPackageImpl#getRow()
		 * @generated
		 */
		EClass ROW = eINSTANCE.getRow();

		/**
		 * The meta object literal for the '{@link CWM.Relational.impl.ColumnValueImpl <em>Column Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Relational.impl.ColumnValueImpl
		 * @see CWM.Relational.impl.RelationalPackageImpl#getColumnValue()
		 * @generated
		 */
		EClass COLUMN_VALUE = eINSTANCE.getColumnValue();

		/**
		 * The meta object literal for the '{@link CWM.Relational.impl.CheckConstraintImpl <em>Check Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Relational.impl.CheckConstraintImpl
		 * @see CWM.Relational.impl.RelationalPackageImpl#getCheckConstraint()
		 * @generated
		 */
		EClass CHECK_CONSTRAINT = eINSTANCE.getCheckConstraint();

		/**
		 * The meta object literal for the '<em><b>Deferrability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK_CONSTRAINT__DEFERRABILITY = eINSTANCE.getCheckConstraint_Deferrability();

		/**
		 * The meta object literal for the '{@link CWM.Relational.impl.RowSetImpl <em>Row Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Relational.impl.RowSetImpl
		 * @see CWM.Relational.impl.RelationalPackageImpl#getRowSet()
		 * @generated
		 */
		EClass ROW_SET = eINSTANCE.getRowSet();

		/**
		 * The meta object literal for the '{@link CWM.Relational.impl.SQLParameterImpl <em>SQL Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Relational.impl.SQLParameterImpl
		 * @see CWM.Relational.impl.RelationalPackageImpl#getSQLParameter()
		 * @generated
		 */
		EClass SQL_PARAMETER = eINSTANCE.getSQLParameter();

		/**
		 * The meta object literal for the '{@link CWM.Relational.impl.Relational_containerImpl <em>Relational container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Relational.impl.Relational_containerImpl
		 * @see CWM.Relational.impl.RelationalPackageImpl#getRelational_container()
		 * @generated
		 */
		EClass RELATIONAL_CONTAINER = eINSTANCE.getRelational_container();

		/**
		 * The meta object literal for the '<em><b>Catalog</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_CONTAINER__CATALOG = eINSTANCE.getRelational_container_Catalog();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_CONTAINER__SCHEMA = eINSTANCE.getRelational_container_Schema();

		/**
		 * The meta object literal for the '<em><b>Column Set</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_CONTAINER__COLUMN_SET = eINSTANCE.getRelational_container_ColumnSet();

		/**
		 * The meta object literal for the '<em><b>Named Column Set</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_CONTAINER__NAMED_COLUMN_SET = eINSTANCE.getRelational_container_NamedColumnSet();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_CONTAINER__TABLE = eINSTANCE.getRelational_container_Table();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_CONTAINER__VIEW = eINSTANCE.getRelational_container_View();

		/**
		 * The meta object literal for the '<em><b>Query Column Set</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_CONTAINER__QUERY_COLUMN_SET = eINSTANCE.getRelational_container_QueryColumnSet();

		/**
		 * The meta object literal for the '<em><b>SQL Data Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_CONTAINER__SQL_DATA_TYPE = eINSTANCE.getRelational_container_SQLDataType();

		/**
		 * The meta object literal for the '<em><b>SQL Distinct Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_CONTAINER__SQL_DISTINCT_TYPE = eINSTANCE.getRelational_container_SQLDistinctType();

		/**
		 * The meta object literal for the '<em><b>SQL Simple Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_CONTAINER__SQL_SIMPLE_TYPE = eINSTANCE.getRelational_container_SQLSimpleType();

		/**
		 * The meta object literal for the '<em><b>SQL Structured Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_CONTAINER__SQL_STRUCTURED_TYPE = eINSTANCE.getRelational_container_SQLStructuredType();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_CONTAINER__COLUMN = eINSTANCE.getRelational_container_Column();

		/**
		 * The meta object literal for the '<em><b>Procedure</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_CONTAINER__PROCEDURE = eINSTANCE.getRelational_container_Procedure();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_CONTAINER__TRIGGER = eINSTANCE.getRelational_container_Trigger();

		/**
		 * The meta object literal for the '<em><b>SQL Index</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_CONTAINER__SQL_INDEX = eINSTANCE.getRelational_container_SQLIndex();

		/**
		 * The meta object literal for the '<em><b>Unique Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_CONTAINER__UNIQUE_CONSTRAINT = eINSTANCE.getRelational_container_UniqueConstraint();

		/**
		 * The meta object literal for the '<em><b>Foreign Key</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_CONTAINER__FOREIGN_KEY = eINSTANCE.getRelational_container_ForeignKey();

		/**
		 * The meta object literal for the '<em><b>SQL Index Column</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_CONTAINER__SQL_INDEX_COLUMN = eINSTANCE.getRelational_container_SQLIndexColumn();

		/**
		 * The meta object literal for the '<em><b>Primary Key</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_CONTAINER__PRIMARY_KEY = eINSTANCE.getRelational_container_PrimaryKey();

		/**
		 * The meta object literal for the '<em><b>Row</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_CONTAINER__ROW = eINSTANCE.getRelational_container_Row();

		/**
		 * The meta object literal for the '<em><b>Column Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_CONTAINER__COLUMN_VALUE = eINSTANCE.getRelational_container_ColumnValue();

		/**
		 * The meta object literal for the '<em><b>Check Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_CONTAINER__CHECK_CONSTRAINT = eINSTANCE.getRelational_container_CheckConstraint();

		/**
		 * The meta object literal for the '<em><b>Row Set</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_CONTAINER__ROW_SET = eINSTANCE.getRelational_container_RowSet();

		/**
		 * The meta object literal for the '<em><b>SQL Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_CONTAINER__SQL_PARAMETER = eINSTANCE.getRelational_container_SQLParameter();

	}

} //RelationalPackage

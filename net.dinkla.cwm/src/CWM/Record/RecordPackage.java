/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Record;

import CWM.Core.CorePackage;

import CWM.CwmInstance.CwmInstancePackage;

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
 * @see CWM.Record.RecordFactory
 * @model kind="package"
 * @generated
 */
public interface RecordPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Record";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "Record";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Record";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RecordPackage eINSTANCE = CWM.Record.impl.RecordPackageImpl.init();

	/**
	 * The meta object id for the '{@link CWM.Record.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Record.impl.FieldImpl
	 * @see CWM.Record.impl.RecordPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NAME = CorePackage.ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__VISIBILITY = CorePackage.ATTRIBUTE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__CLIENT_DEPENDENCY = CorePackage.ATTRIBUTE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__CONSTRAINT = CorePackage.ATTRIBUTE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__IMPORTER = CorePackage.ATTRIBUTE__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NAMESPACE = CorePackage.ATTRIBUTE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__TAGGED_VALUE = CorePackage.ATTRIBUTE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owner Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__OWNER_SCOPE = CorePackage.ATTRIBUTE__OWNER_SCOPE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__OWNER = CorePackage.ATTRIBUTE__OWNER;

	/**
	 * The feature id for the '<em><b>Changeability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__CHANGEABILITY = CorePackage.ATTRIBUTE__CHANGEABILITY;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__MULTIPLICITY = CorePackage.ATTRIBUTE__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__ORDERING = CorePackage.ATTRIBUTE__ORDERING;

	/**
	 * The feature id for the '<em><b>Target Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__TARGET_SCOPE = CorePackage.ATTRIBUTE__TARGET_SCOPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__TYPE = CorePackage.ATTRIBUTE__TYPE;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__INITIAL_VALUE = CorePackage.ATTRIBUTE__INITIAL_VALUE;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__LENGTH = CorePackage.ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__PRECISION = CorePackage.ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__SCALE = CorePackage.ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = CorePackage.ATTRIBUTE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link CWM.Record.impl.RecordDefImpl <em>Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Record.impl.RecordDefImpl
	 * @see CWM.Record.impl.RecordPackageImpl#getRecordDef()
	 * @generated
	 */
	int RECORD_DEF = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_DEF__NAME = CorePackage.CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_DEF__VISIBILITY = CorePackage.CLASS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_DEF__CLIENT_DEPENDENCY = CorePackage.CLASS__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_DEF__CONSTRAINT = CorePackage.CLASS__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_DEF__IMPORTER = CorePackage.CLASS__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_DEF__NAMESPACE = CorePackage.CLASS__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_DEF__TAGGED_VALUE = CorePackage.CLASS__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_DEF__OWNED_ELEMENT = CorePackage.CLASS__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_DEF__IS_ABSTRACT = CorePackage.CLASS__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_DEF__FEATURE = CorePackage.CLASS__FEATURE;

	/**
	 * The feature id for the '<em><b>Field Delimiter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_DEF__FIELD_DELIMITER = CorePackage.CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Fixed Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_DEF__IS_FIXED_WIDTH = CorePackage.CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Text Delimiter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_DEF__TEXT_DELIMITER = CorePackage.CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_DEF__FILE = CorePackage.CLASS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_DEF_FEATURE_COUNT = CorePackage.CLASS_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link CWM.Record.impl.FixedOffsetFieldImpl <em>Fixed Offset Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Record.impl.FixedOffsetFieldImpl
	 * @see CWM.Record.impl.RecordPackageImpl#getFixedOffsetField()
	 * @generated
	 */
	int FIXED_OFFSET_FIELD = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_OFFSET_FIELD__NAME = FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_OFFSET_FIELD__VISIBILITY = FIELD__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_OFFSET_FIELD__CLIENT_DEPENDENCY = FIELD__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_OFFSET_FIELD__CONSTRAINT = FIELD__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_OFFSET_FIELD__IMPORTER = FIELD__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_OFFSET_FIELD__NAMESPACE = FIELD__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_OFFSET_FIELD__TAGGED_VALUE = FIELD__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owner Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_OFFSET_FIELD__OWNER_SCOPE = FIELD__OWNER_SCOPE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_OFFSET_FIELD__OWNER = FIELD__OWNER;

	/**
	 * The feature id for the '<em><b>Changeability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_OFFSET_FIELD__CHANGEABILITY = FIELD__CHANGEABILITY;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_OFFSET_FIELD__MULTIPLICITY = FIELD__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_OFFSET_FIELD__ORDERING = FIELD__ORDERING;

	/**
	 * The feature id for the '<em><b>Target Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_OFFSET_FIELD__TARGET_SCOPE = FIELD__TARGET_SCOPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_OFFSET_FIELD__TYPE = FIELD__TYPE;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_OFFSET_FIELD__INITIAL_VALUE = FIELD__INITIAL_VALUE;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_OFFSET_FIELD__LENGTH = FIELD__LENGTH;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_OFFSET_FIELD__PRECISION = FIELD__PRECISION;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_OFFSET_FIELD__SCALE = FIELD__SCALE;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_OFFSET_FIELD__OFFSET = FIELD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Offset Unit Bits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_OFFSET_FIELD__OFFSET_UNIT_BITS = FIELD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Fixed Offset Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_OFFSET_FIELD_FEATURE_COUNT = FIELD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link CWM.Record.impl.RecordFileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Record.impl.RecordFileImpl
	 * @see CWM.Record.impl.RecordPackageImpl#getRecordFile()
	 * @generated
	 */
	int RECORD_FILE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_FILE__NAME = CorePackage.PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_FILE__VISIBILITY = CorePackage.PACKAGE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_FILE__CLIENT_DEPENDENCY = CorePackage.PACKAGE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_FILE__CONSTRAINT = CorePackage.PACKAGE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_FILE__IMPORTER = CorePackage.PACKAGE__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_FILE__NAMESPACE = CorePackage.PACKAGE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_FILE__TAGGED_VALUE = CorePackage.PACKAGE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_FILE__OWNED_ELEMENT = CorePackage.PACKAGE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Imported Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_FILE__IMPORTED_ELEMENT = CorePackage.PACKAGE__IMPORTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Is Self Describing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_FILE__IS_SELF_DESCRIBING = CorePackage.PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Record Delimiter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_FILE__RECORD_DELIMITER = CorePackage.PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Skip Records</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_FILE__SKIP_RECORDS = CorePackage.PACKAGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Record</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_FILE__RECORD = CorePackage.PACKAGE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_FILE_FEATURE_COUNT = CorePackage.PACKAGE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link CWM.Record.impl.FieldValueImpl <em>Field Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Record.impl.FieldValueImpl
	 * @see CWM.Record.impl.RecordPackageImpl#getFieldValue()
	 * @generated
	 */
	int FIELD_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_VALUE__NAME = CwmInstancePackage.DATA_VALUE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_VALUE__VISIBILITY = CwmInstancePackage.DATA_VALUE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_VALUE__CLIENT_DEPENDENCY = CwmInstancePackage.DATA_VALUE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_VALUE__CONSTRAINT = CwmInstancePackage.DATA_VALUE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_VALUE__IMPORTER = CwmInstancePackage.DATA_VALUE__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_VALUE__NAMESPACE = CwmInstancePackage.DATA_VALUE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_VALUE__TAGGED_VALUE = CwmInstancePackage.DATA_VALUE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_VALUE__CLASSIFIER = CwmInstancePackage.DATA_VALUE__CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_VALUE__VALUE = CwmInstancePackage.DATA_VALUE__VALUE;

	/**
	 * The number of structural features of the '<em>Field Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_VALUE_FEATURE_COUNT = CwmInstancePackage.DATA_VALUE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CWM.Record.impl.RecordImpl <em>Record</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Record.impl.RecordImpl
	 * @see CWM.Record.impl.RecordPackageImpl#getRecord()
	 * @generated
	 */
	int RECORD = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__NAME = CwmInstancePackage.OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__VISIBILITY = CwmInstancePackage.OBJECT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__CLIENT_DEPENDENCY = CwmInstancePackage.OBJECT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__CONSTRAINT = CwmInstancePackage.OBJECT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__IMPORTER = CwmInstancePackage.OBJECT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__NAMESPACE = CwmInstancePackage.OBJECT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__TAGGED_VALUE = CwmInstancePackage.OBJECT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__CLASSIFIER = CwmInstancePackage.OBJECT__CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__SLOT = CwmInstancePackage.OBJECT__SLOT;

	/**
	 * The number of structural features of the '<em>Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_FEATURE_COUNT = CwmInstancePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CWM.Record.impl.RecordSetImpl <em>Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Record.impl.RecordSetImpl
	 * @see CWM.Record.impl.RecordPackageImpl#getRecordSet()
	 * @generated
	 */
	int RECORD_SET = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_SET__NAME = CwmInstancePackage.EXTENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_SET__VISIBILITY = CwmInstancePackage.EXTENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_SET__CLIENT_DEPENDENCY = CwmInstancePackage.EXTENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_SET__CONSTRAINT = CwmInstancePackage.EXTENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_SET__IMPORTER = CwmInstancePackage.EXTENT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_SET__NAMESPACE = CwmInstancePackage.EXTENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_SET__TAGGED_VALUE = CwmInstancePackage.EXTENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_SET__OWNED_ELEMENT = CwmInstancePackage.EXTENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Imported Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_SET__IMPORTED_ELEMENT = CwmInstancePackage.EXTENT__IMPORTED_ELEMENT;

	/**
	 * The number of structural features of the '<em>Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_SET_FEATURE_COUNT = CwmInstancePackage.EXTENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CWM.Record.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Record.impl.GroupImpl
	 * @see CWM.Record.impl.RecordPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__NAME = CorePackage.CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__VISIBILITY = CorePackage.CLASSIFIER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__CLIENT_DEPENDENCY = CorePackage.CLASSIFIER__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__CONSTRAINT = CorePackage.CLASSIFIER__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__IMPORTER = CorePackage.CLASSIFIER__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__NAMESPACE = CorePackage.CLASSIFIER__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__TAGGED_VALUE = CorePackage.CLASSIFIER__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__OWNED_ELEMENT = CorePackage.CLASSIFIER__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__IS_ABSTRACT = CorePackage.CLASSIFIER__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__FEATURE = CorePackage.CLASSIFIER__FEATURE;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = CorePackage.CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CWM.Record.impl.Record_containerImpl <em>Record container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Record.impl.Record_containerImpl
	 * @see CWM.Record.impl.RecordPackageImpl#getRecord_container()
	 * @generated
	 */
	int RECORD_CONTAINER = 8;

	/**
	 * The feature id for the '<em><b>Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_CONTAINER__FIELD = 0;

	/**
	 * The feature id for the '<em><b>Record Def</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_CONTAINER__RECORD_DEF = 1;

	/**
	 * The feature id for the '<em><b>Fixed Offset Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_CONTAINER__FIXED_OFFSET_FIELD = 2;

	/**
	 * The feature id for the '<em><b>Record File</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_CONTAINER__RECORD_FILE = 3;

	/**
	 * The feature id for the '<em><b>Field Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_CONTAINER__FIELD_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Record</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_CONTAINER__RECORD = 5;

	/**
	 * The feature id for the '<em><b>Record Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_CONTAINER__RECORD_SET = 6;

	/**
	 * The feature id for the '<em><b>Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_CONTAINER__GROUP = 7;

	/**
	 * The number of structural features of the '<em>Record container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_CONTAINER_FEATURE_COUNT = 8;


	/**
	 * Returns the meta object for class '{@link CWM.Record.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see CWM.Record.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the attribute '{@link CWM.Record.Field#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see CWM.Record.Field#getLength()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Length();

	/**
	 * Returns the meta object for the attribute '{@link CWM.Record.Field#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see CWM.Record.Field#getPrecision()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Precision();

	/**
	 * Returns the meta object for the attribute '{@link CWM.Record.Field#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see CWM.Record.Field#getScale()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Scale();

	/**
	 * Returns the meta object for class '{@link CWM.Record.RecordDef <em>Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Def</em>'.
	 * @see CWM.Record.RecordDef
	 * @generated
	 */
	EClass getRecordDef();

	/**
	 * Returns the meta object for the attribute '{@link CWM.Record.RecordDef#getFieldDelimiter <em>Field Delimiter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Delimiter</em>'.
	 * @see CWM.Record.RecordDef#getFieldDelimiter()
	 * @see #getRecordDef()
	 * @generated
	 */
	EAttribute getRecordDef_FieldDelimiter();

	/**
	 * Returns the meta object for the attribute '{@link CWM.Record.RecordDef#getIsFixedWidth <em>Is Fixed Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Fixed Width</em>'.
	 * @see CWM.Record.RecordDef#getIsFixedWidth()
	 * @see #getRecordDef()
	 * @generated
	 */
	EAttribute getRecordDef_IsFixedWidth();

	/**
	 * Returns the meta object for the attribute '{@link CWM.Record.RecordDef#getTextDelimiter <em>Text Delimiter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Delimiter</em>'.
	 * @see CWM.Record.RecordDef#getTextDelimiter()
	 * @see #getRecordDef()
	 * @generated
	 */
	EAttribute getRecordDef_TextDelimiter();

	/**
	 * Returns the meta object for the reference list '{@link CWM.Record.RecordDef#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>File</em>'.
	 * @see CWM.Record.RecordDef#getFile()
	 * @see #getRecordDef()
	 * @generated
	 */
	EReference getRecordDef_File();

	/**
	 * Returns the meta object for class '{@link CWM.Record.FixedOffsetField <em>Fixed Offset Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixed Offset Field</em>'.
	 * @see CWM.Record.FixedOffsetField
	 * @generated
	 */
	EClass getFixedOffsetField();

	/**
	 * Returns the meta object for the attribute '{@link CWM.Record.FixedOffsetField#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see CWM.Record.FixedOffsetField#getOffset()
	 * @see #getFixedOffsetField()
	 * @generated
	 */
	EAttribute getFixedOffsetField_Offset();

	/**
	 * Returns the meta object for the attribute '{@link CWM.Record.FixedOffsetField#getOffsetUnitBits <em>Offset Unit Bits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset Unit Bits</em>'.
	 * @see CWM.Record.FixedOffsetField#getOffsetUnitBits()
	 * @see #getFixedOffsetField()
	 * @generated
	 */
	EAttribute getFixedOffsetField_OffsetUnitBits();

	/**
	 * Returns the meta object for class '{@link CWM.Record.RecordFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see CWM.Record.RecordFile
	 * @generated
	 */
	EClass getRecordFile();

	/**
	 * Returns the meta object for the attribute '{@link CWM.Record.RecordFile#getIsSelfDescribing <em>Is Self Describing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Self Describing</em>'.
	 * @see CWM.Record.RecordFile#getIsSelfDescribing()
	 * @see #getRecordFile()
	 * @generated
	 */
	EAttribute getRecordFile_IsSelfDescribing();

	/**
	 * Returns the meta object for the attribute '{@link CWM.Record.RecordFile#getRecordDelimiter <em>Record Delimiter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Record Delimiter</em>'.
	 * @see CWM.Record.RecordFile#getRecordDelimiter()
	 * @see #getRecordFile()
	 * @generated
	 */
	EAttribute getRecordFile_RecordDelimiter();

	/**
	 * Returns the meta object for the attribute '{@link CWM.Record.RecordFile#getSkipRecords <em>Skip Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Skip Records</em>'.
	 * @see CWM.Record.RecordFile#getSkipRecords()
	 * @see #getRecordFile()
	 * @generated
	 */
	EAttribute getRecordFile_SkipRecords();

	/**
	 * Returns the meta object for the reference list '{@link CWM.Record.RecordFile#getRecord <em>Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Record</em>'.
	 * @see CWM.Record.RecordFile#getRecord()
	 * @see #getRecordFile()
	 * @generated
	 */
	EReference getRecordFile_Record();

	/**
	 * Returns the meta object for class '{@link CWM.Record.FieldValue <em>Field Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Value</em>'.
	 * @see CWM.Record.FieldValue
	 * @generated
	 */
	EClass getFieldValue();

	/**
	 * Returns the meta object for class '{@link CWM.Record.Record <em>Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Record</em>'.
	 * @see CWM.Record.Record
	 * @generated
	 */
	EClass getRecord();

	/**
	 * Returns the meta object for class '{@link CWM.Record.RecordSet <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set</em>'.
	 * @see CWM.Record.RecordSet
	 * @generated
	 */
	EClass getRecordSet();

	/**
	 * Returns the meta object for class '{@link CWM.Record.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see CWM.Record.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for class '{@link CWM.Record.Record_container <em>Record container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Record container</em>'.
	 * @see CWM.Record.Record_container
	 * @generated
	 */
	EClass getRecord_container();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Record.Record_container#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Field</em>'.
	 * @see CWM.Record.Record_container#getField()
	 * @see #getRecord_container()
	 * @generated
	 */
	EReference getRecord_container_Field();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Record.Record_container#getRecordDef <em>Record Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Record Def</em>'.
	 * @see CWM.Record.Record_container#getRecordDef()
	 * @see #getRecord_container()
	 * @generated
	 */
	EReference getRecord_container_RecordDef();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Record.Record_container#getFixedOffsetField <em>Fixed Offset Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fixed Offset Field</em>'.
	 * @see CWM.Record.Record_container#getFixedOffsetField()
	 * @see #getRecord_container()
	 * @generated
	 */
	EReference getRecord_container_FixedOffsetField();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Record.Record_container#getRecordFile <em>Record File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Record File</em>'.
	 * @see CWM.Record.Record_container#getRecordFile()
	 * @see #getRecord_container()
	 * @generated
	 */
	EReference getRecord_container_RecordFile();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Record.Record_container#getFieldValue <em>Field Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Field Value</em>'.
	 * @see CWM.Record.Record_container#getFieldValue()
	 * @see #getRecord_container()
	 * @generated
	 */
	EReference getRecord_container_FieldValue();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Record.Record_container#getRecord <em>Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Record</em>'.
	 * @see CWM.Record.Record_container#getRecord()
	 * @see #getRecord_container()
	 * @generated
	 */
	EReference getRecord_container_Record();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Record.Record_container#getRecordSet <em>Record Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Record Set</em>'.
	 * @see CWM.Record.Record_container#getRecordSet()
	 * @see #getRecord_container()
	 * @generated
	 */
	EReference getRecord_container_RecordSet();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Record.Record_container#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Group</em>'.
	 * @see CWM.Record.Record_container#getGroup()
	 * @see #getRecord_container()
	 * @generated
	 */
	EReference getRecord_container_Group();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RecordFactory getRecordFactory();

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
		 * The meta object literal for the '{@link CWM.Record.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Record.impl.FieldImpl
		 * @see CWM.Record.impl.RecordPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__LENGTH = eINSTANCE.getField_Length();

		/**
		 * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__PRECISION = eINSTANCE.getField_Precision();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__SCALE = eINSTANCE.getField_Scale();

		/**
		 * The meta object literal for the '{@link CWM.Record.impl.RecordDefImpl <em>Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Record.impl.RecordDefImpl
		 * @see CWM.Record.impl.RecordPackageImpl#getRecordDef()
		 * @generated
		 */
		EClass RECORD_DEF = eINSTANCE.getRecordDef();

		/**
		 * The meta object literal for the '<em><b>Field Delimiter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORD_DEF__FIELD_DELIMITER = eINSTANCE.getRecordDef_FieldDelimiter();

		/**
		 * The meta object literal for the '<em><b>Is Fixed Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORD_DEF__IS_FIXED_WIDTH = eINSTANCE.getRecordDef_IsFixedWidth();

		/**
		 * The meta object literal for the '<em><b>Text Delimiter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORD_DEF__TEXT_DELIMITER = eINSTANCE.getRecordDef_TextDelimiter();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECORD_DEF__FILE = eINSTANCE.getRecordDef_File();

		/**
		 * The meta object literal for the '{@link CWM.Record.impl.FixedOffsetFieldImpl <em>Fixed Offset Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Record.impl.FixedOffsetFieldImpl
		 * @see CWM.Record.impl.RecordPackageImpl#getFixedOffsetField()
		 * @generated
		 */
		EClass FIXED_OFFSET_FIELD = eINSTANCE.getFixedOffsetField();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_OFFSET_FIELD__OFFSET = eINSTANCE.getFixedOffsetField_Offset();

		/**
		 * The meta object literal for the '<em><b>Offset Unit Bits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_OFFSET_FIELD__OFFSET_UNIT_BITS = eINSTANCE.getFixedOffsetField_OffsetUnitBits();

		/**
		 * The meta object literal for the '{@link CWM.Record.impl.RecordFileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Record.impl.RecordFileImpl
		 * @see CWM.Record.impl.RecordPackageImpl#getRecordFile()
		 * @generated
		 */
		EClass RECORD_FILE = eINSTANCE.getRecordFile();

		/**
		 * The meta object literal for the '<em><b>Is Self Describing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORD_FILE__IS_SELF_DESCRIBING = eINSTANCE.getRecordFile_IsSelfDescribing();

		/**
		 * The meta object literal for the '<em><b>Record Delimiter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORD_FILE__RECORD_DELIMITER = eINSTANCE.getRecordFile_RecordDelimiter();

		/**
		 * The meta object literal for the '<em><b>Skip Records</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORD_FILE__SKIP_RECORDS = eINSTANCE.getRecordFile_SkipRecords();

		/**
		 * The meta object literal for the '<em><b>Record</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECORD_FILE__RECORD = eINSTANCE.getRecordFile_Record();

		/**
		 * The meta object literal for the '{@link CWM.Record.impl.FieldValueImpl <em>Field Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Record.impl.FieldValueImpl
		 * @see CWM.Record.impl.RecordPackageImpl#getFieldValue()
		 * @generated
		 */
		EClass FIELD_VALUE = eINSTANCE.getFieldValue();

		/**
		 * The meta object literal for the '{@link CWM.Record.impl.RecordImpl <em>Record</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Record.impl.RecordImpl
		 * @see CWM.Record.impl.RecordPackageImpl#getRecord()
		 * @generated
		 */
		EClass RECORD = eINSTANCE.getRecord();

		/**
		 * The meta object literal for the '{@link CWM.Record.impl.RecordSetImpl <em>Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Record.impl.RecordSetImpl
		 * @see CWM.Record.impl.RecordPackageImpl#getRecordSet()
		 * @generated
		 */
		EClass RECORD_SET = eINSTANCE.getRecordSet();

		/**
		 * The meta object literal for the '{@link CWM.Record.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Record.impl.GroupImpl
		 * @see CWM.Record.impl.RecordPackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '{@link CWM.Record.impl.Record_containerImpl <em>Record container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Record.impl.Record_containerImpl
		 * @see CWM.Record.impl.RecordPackageImpl#getRecord_container()
		 * @generated
		 */
		EClass RECORD_CONTAINER = eINSTANCE.getRecord_container();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECORD_CONTAINER__FIELD = eINSTANCE.getRecord_container_Field();

		/**
		 * The meta object literal for the '<em><b>Record Def</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECORD_CONTAINER__RECORD_DEF = eINSTANCE.getRecord_container_RecordDef();

		/**
		 * The meta object literal for the '<em><b>Fixed Offset Field</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECORD_CONTAINER__FIXED_OFFSET_FIELD = eINSTANCE.getRecord_container_FixedOffsetField();

		/**
		 * The meta object literal for the '<em><b>Record File</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECORD_CONTAINER__RECORD_FILE = eINSTANCE.getRecord_container_RecordFile();

		/**
		 * The meta object literal for the '<em><b>Field Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECORD_CONTAINER__FIELD_VALUE = eINSTANCE.getRecord_container_FieldValue();

		/**
		 * The meta object literal for the '<em><b>Record</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECORD_CONTAINER__RECORD = eINSTANCE.getRecord_container_Record();

		/**
		 * The meta object literal for the '<em><b>Record Set</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECORD_CONTAINER__RECORD_SET = eINSTANCE.getRecord_container_RecordSet();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECORD_CONTAINER__GROUP = eINSTANCE.getRecord_container_Group();

	}

} //RecordPackage

/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Multidimensional;

import CWM.Core.CorePackage;

import CWM.CwmInstance.CwmInstancePackage;

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
 * @see CWM.Multidimensional.MultidimensionalFactory
 * @model kind="package"
 * @generated
 */
public interface MultidimensionalPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Multidimensional";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "Multidimensional";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Multidimensional";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MultidimensionalPackage eINSTANCE = CWM.Multidimensional.impl.MultidimensionalPackageImpl.init();

	/**
	 * The meta object id for the '{@link CWM.Multidimensional.impl.DimensionImpl <em>Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Multidimensional.impl.DimensionImpl
	 * @see CWM.Multidimensional.impl.MultidimensionalPackageImpl#getDimension()
	 * @generated
	 */
	int DIMENSION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__NAME = CorePackage.CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__VISIBILITY = CorePackage.CLASS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__CLIENT_DEPENDENCY = CorePackage.CLASS__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__CONSTRAINT = CorePackage.CLASS__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__IMPORTER = CorePackage.CLASS__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__NAMESPACE = CorePackage.CLASS__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__TAGGED_VALUE = CorePackage.CLASS__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__OWNED_ELEMENT = CorePackage.CLASS__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__IS_ABSTRACT = CorePackage.CLASS__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__FEATURE = CorePackage.CLASS__FEATURE;

	/**
	 * The feature id for the '<em><b>Dimensioned Object</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__DIMENSIONED_OBJECT = CorePackage.CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__COMPONENT = CorePackage.CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Composite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__COMPOSITE = CorePackage.CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Member Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__MEMBER_SET = CorePackage.CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__SCHEMA = CorePackage.CLASS_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_FEATURE_COUNT = CorePackage.CLASS_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link CWM.Multidimensional.impl.DimensionedObjectImpl <em>Dimensioned Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Multidimensional.impl.DimensionedObjectImpl
	 * @see CWM.Multidimensional.impl.MultidimensionalPackageImpl#getDimensionedObject()
	 * @generated
	 */
	int DIMENSIONED_OBJECT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONED_OBJECT__NAME = CorePackage.ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONED_OBJECT__VISIBILITY = CorePackage.ATTRIBUTE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONED_OBJECT__CLIENT_DEPENDENCY = CorePackage.ATTRIBUTE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONED_OBJECT__CONSTRAINT = CorePackage.ATTRIBUTE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONED_OBJECT__IMPORTER = CorePackage.ATTRIBUTE__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONED_OBJECT__NAMESPACE = CorePackage.ATTRIBUTE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONED_OBJECT__TAGGED_VALUE = CorePackage.ATTRIBUTE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owner Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONED_OBJECT__OWNER_SCOPE = CorePackage.ATTRIBUTE__OWNER_SCOPE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONED_OBJECT__OWNER = CorePackage.ATTRIBUTE__OWNER;

	/**
	 * The feature id for the '<em><b>Changeability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONED_OBJECT__CHANGEABILITY = CorePackage.ATTRIBUTE__CHANGEABILITY;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONED_OBJECT__MULTIPLICITY = CorePackage.ATTRIBUTE__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONED_OBJECT__ORDERING = CorePackage.ATTRIBUTE__ORDERING;

	/**
	 * The feature id for the '<em><b>Target Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONED_OBJECT__TARGET_SCOPE = CorePackage.ATTRIBUTE__TARGET_SCOPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONED_OBJECT__TYPE = CorePackage.ATTRIBUTE__TYPE;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONED_OBJECT__INITIAL_VALUE = CorePackage.ATTRIBUTE__INITIAL_VALUE;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONED_OBJECT__DIMENSION = CorePackage.ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONED_OBJECT__SCHEMA = CorePackage.ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dimensioned Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONED_OBJECT_FEATURE_COUNT = CorePackage.ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link CWM.Multidimensional.impl.MemberImpl <em>Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Multidimensional.impl.MemberImpl
	 * @see CWM.Multidimensional.impl.MultidimensionalPackageImpl#getMember()
	 * @generated
	 */
	int MEMBER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__NAME = CwmInstancePackage.OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__VISIBILITY = CwmInstancePackage.OBJECT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__CLIENT_DEPENDENCY = CwmInstancePackage.OBJECT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__CONSTRAINT = CwmInstancePackage.OBJECT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__IMPORTER = CwmInstancePackage.OBJECT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__NAMESPACE = CwmInstancePackage.OBJECT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__TAGGED_VALUE = CwmInstancePackage.OBJECT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__CLASSIFIER = CwmInstancePackage.OBJECT__CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__SLOT = CwmInstancePackage.OBJECT__SLOT;

	/**
	 * The number of structural features of the '<em>Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_FEATURE_COUNT = CwmInstancePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CWM.Multidimensional.impl.MemberSetImpl <em>Member Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Multidimensional.impl.MemberSetImpl
	 * @see CWM.Multidimensional.impl.MultidimensionalPackageImpl#getMemberSet()
	 * @generated
	 */
	int MEMBER_SET = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_SET__NAME = CwmInstancePackage.EXTENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_SET__VISIBILITY = CwmInstancePackage.EXTENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_SET__CLIENT_DEPENDENCY = CwmInstancePackage.EXTENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_SET__CONSTRAINT = CwmInstancePackage.EXTENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_SET__IMPORTER = CwmInstancePackage.EXTENT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_SET__NAMESPACE = CwmInstancePackage.EXTENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_SET__TAGGED_VALUE = CwmInstancePackage.EXTENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_SET__OWNED_ELEMENT = CwmInstancePackage.EXTENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Imported Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_SET__IMPORTED_ELEMENT = CwmInstancePackage.EXTENT__IMPORTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_SET__DIMENSION = CwmInstancePackage.EXTENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Member Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_SET_FEATURE_COUNT = CwmInstancePackage.EXTENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CWM.Multidimensional.impl.MemberValueImpl <em>Member Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Multidimensional.impl.MemberValueImpl
	 * @see CWM.Multidimensional.impl.MultidimensionalPackageImpl#getMemberValue()
	 * @generated
	 */
	int MEMBER_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_VALUE__NAME = CwmInstancePackage.DATA_VALUE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_VALUE__VISIBILITY = CwmInstancePackage.DATA_VALUE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_VALUE__CLIENT_DEPENDENCY = CwmInstancePackage.DATA_VALUE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_VALUE__CONSTRAINT = CwmInstancePackage.DATA_VALUE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_VALUE__IMPORTER = CwmInstancePackage.DATA_VALUE__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_VALUE__NAMESPACE = CwmInstancePackage.DATA_VALUE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_VALUE__TAGGED_VALUE = CwmInstancePackage.DATA_VALUE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_VALUE__CLASSIFIER = CwmInstancePackage.DATA_VALUE__CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_VALUE__VALUE = CwmInstancePackage.DATA_VALUE__VALUE;

	/**
	 * The number of structural features of the '<em>Member Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_VALUE_FEATURE_COUNT = CwmInstancePackage.DATA_VALUE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CWM.Multidimensional.impl.SchemaImpl <em>Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Multidimensional.impl.SchemaImpl
	 * @see CWM.Multidimensional.impl.MultidimensionalPackageImpl#getSchema()
	 * @generated
	 */
	int SCHEMA = 5;

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
	 * The feature id for the '<em><b>Dimensioned Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__DIMENSIONED_OBJECT = CorePackage.PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__DIMENSION = CorePackage.PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_FEATURE_COUNT = CorePackage.PACKAGE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link CWM.Multidimensional.impl.Multidimensional_containerImpl <em>Multidimensional container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Multidimensional.impl.Multidimensional_containerImpl
	 * @see CWM.Multidimensional.impl.MultidimensionalPackageImpl#getMultidimensional_container()
	 * @generated
	 */
	int MULTIDIMENSIONAL_CONTAINER = 6;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIDIMENSIONAL_CONTAINER__DIMENSION = 0;

	/**
	 * The feature id for the '<em><b>Dimensioned Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIDIMENSIONAL_CONTAINER__DIMENSIONED_OBJECT = 1;

	/**
	 * The feature id for the '<em><b>Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIDIMENSIONAL_CONTAINER__MEMBER = 2;

	/**
	 * The feature id for the '<em><b>Member Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIDIMENSIONAL_CONTAINER__MEMBER_SET = 3;

	/**
	 * The feature id for the '<em><b>Member Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIDIMENSIONAL_CONTAINER__MEMBER_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIDIMENSIONAL_CONTAINER__SCHEMA = 5;

	/**
	 * The number of structural features of the '<em>Multidimensional container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIDIMENSIONAL_CONTAINER_FEATURE_COUNT = 6;


	/**
	 * Returns the meta object for class '{@link CWM.Multidimensional.Dimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimension</em>'.
	 * @see CWM.Multidimensional.Dimension
	 * @generated
	 */
	EClass getDimension();

	/**
	 * Returns the meta object for the reference list '{@link CWM.Multidimensional.Dimension#getDimensionedObject <em>Dimensioned Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dimensioned Object</em>'.
	 * @see CWM.Multidimensional.Dimension#getDimensionedObject()
	 * @see #getDimension()
	 * @generated
	 */
	EReference getDimension_DimensionedObject();

	/**
	 * Returns the meta object for the reference list '{@link CWM.Multidimensional.Dimension#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Component</em>'.
	 * @see CWM.Multidimensional.Dimension#getComponent()
	 * @see #getDimension()
	 * @generated
	 */
	EReference getDimension_Component();

	/**
	 * Returns the meta object for the reference list '{@link CWM.Multidimensional.Dimension#getComposite <em>Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Composite</em>'.
	 * @see CWM.Multidimensional.Dimension#getComposite()
	 * @see #getDimension()
	 * @generated
	 */
	EReference getDimension_Composite();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Multidimensional.Dimension#getMemberSet <em>Member Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Member Set</em>'.
	 * @see CWM.Multidimensional.Dimension#getMemberSet()
	 * @see #getDimension()
	 * @generated
	 */
	EReference getDimension_MemberSet();

	/**
	 * Returns the meta object for the container reference '{@link CWM.Multidimensional.Dimension#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Schema</em>'.
	 * @see CWM.Multidimensional.Dimension#getSchema()
	 * @see #getDimension()
	 * @generated
	 */
	EReference getDimension_Schema();

	/**
	 * Returns the meta object for class '{@link CWM.Multidimensional.DimensionedObject <em>Dimensioned Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimensioned Object</em>'.
	 * @see CWM.Multidimensional.DimensionedObject
	 * @generated
	 */
	EClass getDimensionedObject();

	/**
	 * Returns the meta object for the reference list '{@link CWM.Multidimensional.DimensionedObject#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dimension</em>'.
	 * @see CWM.Multidimensional.DimensionedObject#getDimension()
	 * @see #getDimensionedObject()
	 * @generated
	 */
	EReference getDimensionedObject_Dimension();

	/**
	 * Returns the meta object for the container reference '{@link CWM.Multidimensional.DimensionedObject#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Schema</em>'.
	 * @see CWM.Multidimensional.DimensionedObject#getSchema()
	 * @see #getDimensionedObject()
	 * @generated
	 */
	EReference getDimensionedObject_Schema();

	/**
	 * Returns the meta object for class '{@link CWM.Multidimensional.Member <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Member</em>'.
	 * @see CWM.Multidimensional.Member
	 * @generated
	 */
	EClass getMember();

	/**
	 * Returns the meta object for class '{@link CWM.Multidimensional.MemberSet <em>Member Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Member Set</em>'.
	 * @see CWM.Multidimensional.MemberSet
	 * @generated
	 */
	EClass getMemberSet();

	/**
	 * Returns the meta object for the container reference '{@link CWM.Multidimensional.MemberSet#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Dimension</em>'.
	 * @see CWM.Multidimensional.MemberSet#getDimension()
	 * @see #getMemberSet()
	 * @generated
	 */
	EReference getMemberSet_Dimension();

	/**
	 * Returns the meta object for class '{@link CWM.Multidimensional.MemberValue <em>Member Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Member Value</em>'.
	 * @see CWM.Multidimensional.MemberValue
	 * @generated
	 */
	EClass getMemberValue();

	/**
	 * Returns the meta object for class '{@link CWM.Multidimensional.Schema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema</em>'.
	 * @see CWM.Multidimensional.Schema
	 * @generated
	 */
	EClass getSchema();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Multidimensional.Schema#getDimensionedObject <em>Dimensioned Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dimensioned Object</em>'.
	 * @see CWM.Multidimensional.Schema#getDimensionedObject()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_DimensionedObject();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Multidimensional.Schema#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dimension</em>'.
	 * @see CWM.Multidimensional.Schema#getDimension()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Dimension();

	/**
	 * Returns the meta object for class '{@link CWM.Multidimensional.Multidimensional_container <em>Multidimensional container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multidimensional container</em>'.
	 * @see CWM.Multidimensional.Multidimensional_container
	 * @generated
	 */
	EClass getMultidimensional_container();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Multidimensional.Multidimensional_container#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dimension</em>'.
	 * @see CWM.Multidimensional.Multidimensional_container#getDimension()
	 * @see #getMultidimensional_container()
	 * @generated
	 */
	EReference getMultidimensional_container_Dimension();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Multidimensional.Multidimensional_container#getDimensionedObject <em>Dimensioned Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dimensioned Object</em>'.
	 * @see CWM.Multidimensional.Multidimensional_container#getDimensionedObject()
	 * @see #getMultidimensional_container()
	 * @generated
	 */
	EReference getMultidimensional_container_DimensionedObject();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Multidimensional.Multidimensional_container#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Member</em>'.
	 * @see CWM.Multidimensional.Multidimensional_container#getMember()
	 * @see #getMultidimensional_container()
	 * @generated
	 */
	EReference getMultidimensional_container_Member();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Multidimensional.Multidimensional_container#getMemberSet <em>Member Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Member Set</em>'.
	 * @see CWM.Multidimensional.Multidimensional_container#getMemberSet()
	 * @see #getMultidimensional_container()
	 * @generated
	 */
	EReference getMultidimensional_container_MemberSet();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Multidimensional.Multidimensional_container#getMemberValue <em>Member Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Member Value</em>'.
	 * @see CWM.Multidimensional.Multidimensional_container#getMemberValue()
	 * @see #getMultidimensional_container()
	 * @generated
	 */
	EReference getMultidimensional_container_MemberValue();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.Multidimensional.Multidimensional_container#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Schema</em>'.
	 * @see CWM.Multidimensional.Multidimensional_container#getSchema()
	 * @see #getMultidimensional_container()
	 * @generated
	 */
	EReference getMultidimensional_container_Schema();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MultidimensionalFactory getMultidimensionalFactory();

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
		 * The meta object literal for the '{@link CWM.Multidimensional.impl.DimensionImpl <em>Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Multidimensional.impl.DimensionImpl
		 * @see CWM.Multidimensional.impl.MultidimensionalPackageImpl#getDimension()
		 * @generated
		 */
		EClass DIMENSION = eINSTANCE.getDimension();

		/**
		 * The meta object literal for the '<em><b>Dimensioned Object</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIMENSION__DIMENSIONED_OBJECT = eINSTANCE.getDimension_DimensionedObject();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIMENSION__COMPONENT = eINSTANCE.getDimension_Component();

		/**
		 * The meta object literal for the '<em><b>Composite</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIMENSION__COMPOSITE = eINSTANCE.getDimension_Composite();

		/**
		 * The meta object literal for the '<em><b>Member Set</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIMENSION__MEMBER_SET = eINSTANCE.getDimension_MemberSet();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIMENSION__SCHEMA = eINSTANCE.getDimension_Schema();

		/**
		 * The meta object literal for the '{@link CWM.Multidimensional.impl.DimensionedObjectImpl <em>Dimensioned Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Multidimensional.impl.DimensionedObjectImpl
		 * @see CWM.Multidimensional.impl.MultidimensionalPackageImpl#getDimensionedObject()
		 * @generated
		 */
		EClass DIMENSIONED_OBJECT = eINSTANCE.getDimensionedObject();

		/**
		 * The meta object literal for the '<em><b>Dimension</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIMENSIONED_OBJECT__DIMENSION = eINSTANCE.getDimensionedObject_Dimension();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIMENSIONED_OBJECT__SCHEMA = eINSTANCE.getDimensionedObject_Schema();

		/**
		 * The meta object literal for the '{@link CWM.Multidimensional.impl.MemberImpl <em>Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Multidimensional.impl.MemberImpl
		 * @see CWM.Multidimensional.impl.MultidimensionalPackageImpl#getMember()
		 * @generated
		 */
		EClass MEMBER = eINSTANCE.getMember();

		/**
		 * The meta object literal for the '{@link CWM.Multidimensional.impl.MemberSetImpl <em>Member Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Multidimensional.impl.MemberSetImpl
		 * @see CWM.Multidimensional.impl.MultidimensionalPackageImpl#getMemberSet()
		 * @generated
		 */
		EClass MEMBER_SET = eINSTANCE.getMemberSet();

		/**
		 * The meta object literal for the '<em><b>Dimension</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBER_SET__DIMENSION = eINSTANCE.getMemberSet_Dimension();

		/**
		 * The meta object literal for the '{@link CWM.Multidimensional.impl.MemberValueImpl <em>Member Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Multidimensional.impl.MemberValueImpl
		 * @see CWM.Multidimensional.impl.MultidimensionalPackageImpl#getMemberValue()
		 * @generated
		 */
		EClass MEMBER_VALUE = eINSTANCE.getMemberValue();

		/**
		 * The meta object literal for the '{@link CWM.Multidimensional.impl.SchemaImpl <em>Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Multidimensional.impl.SchemaImpl
		 * @see CWM.Multidimensional.impl.MultidimensionalPackageImpl#getSchema()
		 * @generated
		 */
		EClass SCHEMA = eINSTANCE.getSchema();

		/**
		 * The meta object literal for the '<em><b>Dimensioned Object</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__DIMENSIONED_OBJECT = eINSTANCE.getSchema_DimensionedObject();

		/**
		 * The meta object literal for the '<em><b>Dimension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__DIMENSION = eINSTANCE.getSchema_Dimension();

		/**
		 * The meta object literal for the '{@link CWM.Multidimensional.impl.Multidimensional_containerImpl <em>Multidimensional container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Multidimensional.impl.Multidimensional_containerImpl
		 * @see CWM.Multidimensional.impl.MultidimensionalPackageImpl#getMultidimensional_container()
		 * @generated
		 */
		EClass MULTIDIMENSIONAL_CONTAINER = eINSTANCE.getMultidimensional_container();

		/**
		 * The meta object literal for the '<em><b>Dimension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIDIMENSIONAL_CONTAINER__DIMENSION = eINSTANCE.getMultidimensional_container_Dimension();

		/**
		 * The meta object literal for the '<em><b>Dimensioned Object</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIDIMENSIONAL_CONTAINER__DIMENSIONED_OBJECT = eINSTANCE.getMultidimensional_container_DimensionedObject();

		/**
		 * The meta object literal for the '<em><b>Member</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIDIMENSIONAL_CONTAINER__MEMBER = eINSTANCE.getMultidimensional_container_Member();

		/**
		 * The meta object literal for the '<em><b>Member Set</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIDIMENSIONAL_CONTAINER__MEMBER_SET = eINSTANCE.getMultidimensional_container_MemberSet();

		/**
		 * The meta object literal for the '<em><b>Member Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIDIMENSIONAL_CONTAINER__MEMBER_VALUE = eINSTANCE.getMultidimensional_container_MemberValue();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIDIMENSIONAL_CONTAINER__SCHEMA = eINSTANCE.getMultidimensional_container_Schema();

	}

} //MultidimensionalPackage

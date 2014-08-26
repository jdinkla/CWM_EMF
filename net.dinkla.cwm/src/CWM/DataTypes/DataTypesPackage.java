/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.DataTypes;

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
 * @see CWM.DataTypes.DataTypesFactory
 * @model kind="package"
 * @generated
 */
public interface DataTypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "DataTypes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "DataTypes";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "DataTypes";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataTypesPackage eINSTANCE = CWM.DataTypes.impl.DataTypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link CWM.DataTypes.impl.EnumerationImpl <em>Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.DataTypes.impl.EnumerationImpl
	 * @see CWM.DataTypes.impl.DataTypesPackageImpl#getEnumeration()
	 * @generated
	 */
	int ENUMERATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__NAME = CorePackage.DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__VISIBILITY = CorePackage.DATA_TYPE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__CLIENT_DEPENDENCY = CorePackage.DATA_TYPE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__CONSTRAINT = CorePackage.DATA_TYPE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__IMPORTER = CorePackage.DATA_TYPE__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__NAMESPACE = CorePackage.DATA_TYPE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__TAGGED_VALUE = CorePackage.DATA_TYPE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__OWNED_ELEMENT = CorePackage.DATA_TYPE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__IS_ABSTRACT = CorePackage.DATA_TYPE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__FEATURE = CorePackage.DATA_TYPE__FEATURE;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__IS_ORDERED = CorePackage.DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__LITERAL = CorePackage.DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_FEATURE_COUNT = CorePackage.DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link CWM.DataTypes.impl.EnumerationLiteralImpl <em>Enumeration Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.DataTypes.impl.EnumerationLiteralImpl
	 * @see CWM.DataTypes.impl.DataTypesPackageImpl#getEnumerationLiteral()
	 * @generated
	 */
	int ENUMERATION_LITERAL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__NAME = CorePackage.MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__VISIBILITY = CorePackage.MODEL_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__CLIENT_DEPENDENCY = CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__CONSTRAINT = CorePackage.MODEL_ELEMENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__IMPORTER = CorePackage.MODEL_ELEMENT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__NAMESPACE = CorePackage.MODEL_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__TAGGED_VALUE = CorePackage.MODEL_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__VALUE = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Enumeration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__ENUMERATION = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Enumeration Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link CWM.DataTypes.impl.QueryExpressionImpl <em>Query Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.DataTypes.impl.QueryExpressionImpl
	 * @see CWM.DataTypes.impl.DataTypesPackageImpl#getQueryExpression()
	 * @generated
	 */
	int QUERY_EXPRESSION = 2;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_EXPRESSION__BODY = CorePackage.PROCEDURE_EXPRESSION__BODY;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_EXPRESSION__LANGUAGE = CorePackage.PROCEDURE_EXPRESSION__LANGUAGE;

	/**
	 * The number of structural features of the '<em>Query Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_EXPRESSION_FEATURE_COUNT = CorePackage.PROCEDURE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CWM.DataTypes.impl.TypeAliasImpl <em>Type Alias</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.DataTypes.impl.TypeAliasImpl
	 * @see CWM.DataTypes.impl.DataTypesPackageImpl#getTypeAlias()
	 * @generated
	 */
	int TYPE_ALIAS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ALIAS__NAME = CorePackage.DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ALIAS__VISIBILITY = CorePackage.DATA_TYPE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ALIAS__CLIENT_DEPENDENCY = CorePackage.DATA_TYPE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ALIAS__CONSTRAINT = CorePackage.DATA_TYPE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ALIAS__IMPORTER = CorePackage.DATA_TYPE__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ALIAS__NAMESPACE = CorePackage.DATA_TYPE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ALIAS__TAGGED_VALUE = CorePackage.DATA_TYPE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ALIAS__OWNED_ELEMENT = CorePackage.DATA_TYPE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ALIAS__IS_ABSTRACT = CorePackage.DATA_TYPE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ALIAS__FEATURE = CorePackage.DATA_TYPE__FEATURE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ALIAS__TYPE = CorePackage.DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type Alias</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ALIAS_FEATURE_COUNT = CorePackage.DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CWM.DataTypes.impl.UnionImpl <em>Union</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.DataTypes.impl.UnionImpl
	 * @see CWM.DataTypes.impl.DataTypesPackageImpl#getUnion()
	 * @generated
	 */
	int UNION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION__NAME = CorePackage.CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION__VISIBILITY = CorePackage.CLASSIFIER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION__CLIENT_DEPENDENCY = CorePackage.CLASSIFIER__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION__CONSTRAINT = CorePackage.CLASSIFIER__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION__IMPORTER = CorePackage.CLASSIFIER__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION__NAMESPACE = CorePackage.CLASSIFIER__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION__TAGGED_VALUE = CorePackage.CLASSIFIER__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION__OWNED_ELEMENT = CorePackage.CLASSIFIER__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION__IS_ABSTRACT = CorePackage.CLASSIFIER__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION__FEATURE = CorePackage.CLASSIFIER__FEATURE;

	/**
	 * The feature id for the '<em><b>Discriminator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION__DISCRIMINATOR = CorePackage.CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Union</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_FEATURE_COUNT = CorePackage.CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CWM.DataTypes.impl.UnionMemberImpl <em>Union Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.DataTypes.impl.UnionMemberImpl
	 * @see CWM.DataTypes.impl.DataTypesPackageImpl#getUnionMember()
	 * @generated
	 */
	int UNION_MEMBER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_MEMBER__NAME = CorePackage.ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_MEMBER__VISIBILITY = CorePackage.ATTRIBUTE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_MEMBER__CLIENT_DEPENDENCY = CorePackage.ATTRIBUTE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_MEMBER__CONSTRAINT = CorePackage.ATTRIBUTE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_MEMBER__IMPORTER = CorePackage.ATTRIBUTE__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_MEMBER__NAMESPACE = CorePackage.ATTRIBUTE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_MEMBER__TAGGED_VALUE = CorePackage.ATTRIBUTE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owner Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_MEMBER__OWNER_SCOPE = CorePackage.ATTRIBUTE__OWNER_SCOPE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_MEMBER__OWNER = CorePackage.ATTRIBUTE__OWNER;

	/**
	 * The feature id for the '<em><b>Changeability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_MEMBER__CHANGEABILITY = CorePackage.ATTRIBUTE__CHANGEABILITY;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_MEMBER__MULTIPLICITY = CorePackage.ATTRIBUTE__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_MEMBER__ORDERING = CorePackage.ATTRIBUTE__ORDERING;

	/**
	 * The feature id for the '<em><b>Target Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_MEMBER__TARGET_SCOPE = CorePackage.ATTRIBUTE__TARGET_SCOPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_MEMBER__TYPE = CorePackage.ATTRIBUTE__TYPE;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_MEMBER__INITIAL_VALUE = CorePackage.ATTRIBUTE__INITIAL_VALUE;

	/**
	 * The feature id for the '<em><b>Member Case</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_MEMBER__MEMBER_CASE = CorePackage.ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_MEMBER__IS_DEFAULT = CorePackage.ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Union Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_MEMBER_FEATURE_COUNT = CorePackage.ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link CWM.DataTypes.impl.DataTypes_containerImpl <em>Data Types container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.DataTypes.impl.DataTypes_containerImpl
	 * @see CWM.DataTypes.impl.DataTypesPackageImpl#getDataTypes_container()
	 * @generated
	 */
	int DATA_TYPES_CONTAINER = 6;

	/**
	 * The feature id for the '<em><b>Enumeration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPES_CONTAINER__ENUMERATION = 0;

	/**
	 * The feature id for the '<em><b>Enumeration Literal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPES_CONTAINER__ENUMERATION_LITERAL = 1;

	/**
	 * The feature id for the '<em><b>Query Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPES_CONTAINER__QUERY_EXPRESSION = 2;

	/**
	 * The feature id for the '<em><b>Type Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPES_CONTAINER__TYPE_ALIAS = 3;

	/**
	 * The feature id for the '<em><b>Union</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPES_CONTAINER__UNION = 4;

	/**
	 * The feature id for the '<em><b>Union Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPES_CONTAINER__UNION_MEMBER = 5;

	/**
	 * The number of structural features of the '<em>Data Types container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPES_CONTAINER_FEATURE_COUNT = 6;


	/**
	 * Returns the meta object for class '{@link CWM.DataTypes.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration</em>'.
	 * @see CWM.DataTypes.Enumeration
	 * @generated
	 */
	EClass getEnumeration();

	/**
	 * Returns the meta object for the attribute '{@link CWM.DataTypes.Enumeration#getIsOrdered <em>Is Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Ordered</em>'.
	 * @see CWM.DataTypes.Enumeration#getIsOrdered()
	 * @see #getEnumeration()
	 * @generated
	 */
	EAttribute getEnumeration_IsOrdered();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.DataTypes.Enumeration#getLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Literal</em>'.
	 * @see CWM.DataTypes.Enumeration#getLiteral()
	 * @see #getEnumeration()
	 * @generated
	 */
	EReference getEnumeration_Literal();

	/**
	 * Returns the meta object for class '{@link CWM.DataTypes.EnumerationLiteral <em>Enumeration Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Literal</em>'.
	 * @see CWM.DataTypes.EnumerationLiteral
	 * @generated
	 */
	EClass getEnumerationLiteral();

	/**
	 * Returns the meta object for the containment reference '{@link CWM.DataTypes.EnumerationLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see CWM.DataTypes.EnumerationLiteral#getValue()
	 * @see #getEnumerationLiteral()
	 * @generated
	 */
	EReference getEnumerationLiteral_Value();

	/**
	 * Returns the meta object for the container reference '{@link CWM.DataTypes.EnumerationLiteral#getEnumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Enumeration</em>'.
	 * @see CWM.DataTypes.EnumerationLiteral#getEnumeration()
	 * @see #getEnumerationLiteral()
	 * @generated
	 */
	EReference getEnumerationLiteral_Enumeration();

	/**
	 * Returns the meta object for class '{@link CWM.DataTypes.QueryExpression <em>Query Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Expression</em>'.
	 * @see CWM.DataTypes.QueryExpression
	 * @generated
	 */
	EClass getQueryExpression();

	/**
	 * Returns the meta object for class '{@link CWM.DataTypes.TypeAlias <em>Type Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Alias</em>'.
	 * @see CWM.DataTypes.TypeAlias
	 * @generated
	 */
	EClass getTypeAlias();

	/**
	 * Returns the meta object for the reference '{@link CWM.DataTypes.TypeAlias#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see CWM.DataTypes.TypeAlias#getType()
	 * @see #getTypeAlias()
	 * @generated
	 */
	EReference getTypeAlias_Type();

	/**
	 * Returns the meta object for class '{@link CWM.DataTypes.Union <em>Union</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Union</em>'.
	 * @see CWM.DataTypes.Union
	 * @generated
	 */
	EClass getUnion();

	/**
	 * Returns the meta object for the reference '{@link CWM.DataTypes.Union#getDiscriminator <em>Discriminator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Discriminator</em>'.
	 * @see CWM.DataTypes.Union#getDiscriminator()
	 * @see #getUnion()
	 * @generated
	 */
	EReference getUnion_Discriminator();

	/**
	 * Returns the meta object for class '{@link CWM.DataTypes.UnionMember <em>Union Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Union Member</em>'.
	 * @see CWM.DataTypes.UnionMember
	 * @generated
	 */
	EClass getUnionMember();

	/**
	 * Returns the meta object for the containment reference '{@link CWM.DataTypes.UnionMember#getMemberCase <em>Member Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Member Case</em>'.
	 * @see CWM.DataTypes.UnionMember#getMemberCase()
	 * @see #getUnionMember()
	 * @generated
	 */
	EReference getUnionMember_MemberCase();

	/**
	 * Returns the meta object for the attribute '{@link CWM.DataTypes.UnionMember#getIsDefault <em>Is Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Default</em>'.
	 * @see CWM.DataTypes.UnionMember#getIsDefault()
	 * @see #getUnionMember()
	 * @generated
	 */
	EAttribute getUnionMember_IsDefault();

	/**
	 * Returns the meta object for class '{@link CWM.DataTypes.DataTypes_container <em>Data Types container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Types container</em>'.
	 * @see CWM.DataTypes.DataTypes_container
	 * @generated
	 */
	EClass getDataTypes_container();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.DataTypes.DataTypes_container#getEnumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enumeration</em>'.
	 * @see CWM.DataTypes.DataTypes_container#getEnumeration()
	 * @see #getDataTypes_container()
	 * @generated
	 */
	EReference getDataTypes_container_Enumeration();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.DataTypes.DataTypes_container#getEnumerationLiteral <em>Enumeration Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enumeration Literal</em>'.
	 * @see CWM.DataTypes.DataTypes_container#getEnumerationLiteral()
	 * @see #getDataTypes_container()
	 * @generated
	 */
	EReference getDataTypes_container_EnumerationLiteral();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.DataTypes.DataTypes_container#getQueryExpression <em>Query Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Query Expression</em>'.
	 * @see CWM.DataTypes.DataTypes_container#getQueryExpression()
	 * @see #getDataTypes_container()
	 * @generated
	 */
	EReference getDataTypes_container_QueryExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.DataTypes.DataTypes_container#getTypeAlias <em>Type Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type Alias</em>'.
	 * @see CWM.DataTypes.DataTypes_container#getTypeAlias()
	 * @see #getDataTypes_container()
	 * @generated
	 */
	EReference getDataTypes_container_TypeAlias();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.DataTypes.DataTypes_container#getUnion <em>Union</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Union</em>'.
	 * @see CWM.DataTypes.DataTypes_container#getUnion()
	 * @see #getDataTypes_container()
	 * @generated
	 */
	EReference getDataTypes_container_Union();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.DataTypes.DataTypes_container#getUnionMember <em>Union Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Union Member</em>'.
	 * @see CWM.DataTypes.DataTypes_container#getUnionMember()
	 * @see #getDataTypes_container()
	 * @generated
	 */
	EReference getDataTypes_container_UnionMember();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DataTypesFactory getDataTypesFactory();

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
		 * The meta object literal for the '{@link CWM.DataTypes.impl.EnumerationImpl <em>Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.DataTypes.impl.EnumerationImpl
		 * @see CWM.DataTypes.impl.DataTypesPackageImpl#getEnumeration()
		 * @generated
		 */
		EClass ENUMERATION = eINSTANCE.getEnumeration();

		/**
		 * The meta object literal for the '<em><b>Is Ordered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATION__IS_ORDERED = eINSTANCE.getEnumeration_IsOrdered();

		/**
		 * The meta object literal for the '<em><b>Literal</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION__LITERAL = eINSTANCE.getEnumeration_Literal();

		/**
		 * The meta object literal for the '{@link CWM.DataTypes.impl.EnumerationLiteralImpl <em>Enumeration Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.DataTypes.impl.EnumerationLiteralImpl
		 * @see CWM.DataTypes.impl.DataTypesPackageImpl#getEnumerationLiteral()
		 * @generated
		 */
		EClass ENUMERATION_LITERAL = eINSTANCE.getEnumerationLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION_LITERAL__VALUE = eINSTANCE.getEnumerationLiteral_Value();

		/**
		 * The meta object literal for the '<em><b>Enumeration</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION_LITERAL__ENUMERATION = eINSTANCE.getEnumerationLiteral_Enumeration();

		/**
		 * The meta object literal for the '{@link CWM.DataTypes.impl.QueryExpressionImpl <em>Query Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.DataTypes.impl.QueryExpressionImpl
		 * @see CWM.DataTypes.impl.DataTypesPackageImpl#getQueryExpression()
		 * @generated
		 */
		EClass QUERY_EXPRESSION = eINSTANCE.getQueryExpression();

		/**
		 * The meta object literal for the '{@link CWM.DataTypes.impl.TypeAliasImpl <em>Type Alias</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.DataTypes.impl.TypeAliasImpl
		 * @see CWM.DataTypes.impl.DataTypesPackageImpl#getTypeAlias()
		 * @generated
		 */
		EClass TYPE_ALIAS = eINSTANCE.getTypeAlias();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_ALIAS__TYPE = eINSTANCE.getTypeAlias_Type();

		/**
		 * The meta object literal for the '{@link CWM.DataTypes.impl.UnionImpl <em>Union</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.DataTypes.impl.UnionImpl
		 * @see CWM.DataTypes.impl.DataTypesPackageImpl#getUnion()
		 * @generated
		 */
		EClass UNION = eINSTANCE.getUnion();

		/**
		 * The meta object literal for the '<em><b>Discriminator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNION__DISCRIMINATOR = eINSTANCE.getUnion_Discriminator();

		/**
		 * The meta object literal for the '{@link CWM.DataTypes.impl.UnionMemberImpl <em>Union Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.DataTypes.impl.UnionMemberImpl
		 * @see CWM.DataTypes.impl.DataTypesPackageImpl#getUnionMember()
		 * @generated
		 */
		EClass UNION_MEMBER = eINSTANCE.getUnionMember();

		/**
		 * The meta object literal for the '<em><b>Member Case</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNION_MEMBER__MEMBER_CASE = eINSTANCE.getUnionMember_MemberCase();

		/**
		 * The meta object literal for the '<em><b>Is Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNION_MEMBER__IS_DEFAULT = eINSTANCE.getUnionMember_IsDefault();

		/**
		 * The meta object literal for the '{@link CWM.DataTypes.impl.DataTypes_containerImpl <em>Data Types container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.DataTypes.impl.DataTypes_containerImpl
		 * @see CWM.DataTypes.impl.DataTypesPackageImpl#getDataTypes_container()
		 * @generated
		 */
		EClass DATA_TYPES_CONTAINER = eINSTANCE.getDataTypes_container();

		/**
		 * The meta object literal for the '<em><b>Enumeration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPES_CONTAINER__ENUMERATION = eINSTANCE.getDataTypes_container_Enumeration();

		/**
		 * The meta object literal for the '<em><b>Enumeration Literal</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPES_CONTAINER__ENUMERATION_LITERAL = eINSTANCE.getDataTypes_container_EnumerationLiteral();

		/**
		 * The meta object literal for the '<em><b>Query Expression</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPES_CONTAINER__QUERY_EXPRESSION = eINSTANCE.getDataTypes_container_QueryExpression();

		/**
		 * The meta object literal for the '<em><b>Type Alias</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPES_CONTAINER__TYPE_ALIAS = eINSTANCE.getDataTypes_container_TypeAlias();

		/**
		 * The meta object literal for the '<em><b>Union</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPES_CONTAINER__UNION = eINSTANCE.getDataTypes_container_Union();

		/**
		 * The meta object literal for the '<em><b>Union Member</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPES_CONTAINER__UNION_MEMBER = eINSTANCE.getDataTypes_container_UnionMember();

	}

} //DataTypesPackage

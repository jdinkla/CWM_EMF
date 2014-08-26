/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.CwmXml;

import CWM.Core.CorePackage;

import CWM.CwmInstance.CwmInstancePackage;

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
 * @see CWM.CwmXml.CwmXmlFactory
 * @model kind="package"
 * @generated
 */
public interface CwmXmlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "CwmXml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "CwmXml";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "CwmXml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CwmXmlPackage eINSTANCE = CWM.CwmXml.impl.CwmXmlPackageImpl.init();

	/**
	 * The meta object id for the '{@link CWM.CwmXml.impl.SchemaImpl <em>Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.CwmXml.impl.SchemaImpl
	 * @see CWM.CwmXml.impl.CwmXmlPackageImpl#getSchema()
	 * @generated
	 */
	int SCHEMA = 0;

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
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__VERSION = CorePackage.PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Xml Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__XML_NAMESPACE = CorePackage.PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__ELEMENT_TYPE = CorePackage.PACKAGE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_FEATURE_COUNT = CorePackage.PACKAGE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link CWM.CwmXml.impl.ElementTypeImpl <em>Element Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.CwmXml.impl.ElementTypeImpl
	 * @see CWM.CwmXml.impl.CwmXmlPackageImpl#getElementType()
	 * @generated
	 */
	int ELEMENT_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE__NAME = CorePackage.CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE__VISIBILITY = CorePackage.CLASS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE__CLIENT_DEPENDENCY = CorePackage.CLASS__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE__CONSTRAINT = CorePackage.CLASS__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE__IMPORTER = CorePackage.CLASS__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE__NAMESPACE = CorePackage.CLASS__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE__TAGGED_VALUE = CorePackage.CLASS__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE__OWNED_ELEMENT = CorePackage.CLASS__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE__IS_ABSTRACT = CorePackage.CLASS__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE__FEATURE = CorePackage.CLASS__FEATURE;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE__SCHEMA = CorePackage.CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE__ATTRIBUTE = CorePackage.CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE__CONTENT = CorePackage.CLASS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE_FEATURE_COUNT = CorePackage.CLASS_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link CWM.CwmXml.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.CwmXml.impl.AttributeImpl
	 * @see CWM.CwmXml.impl.CwmXmlPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = CorePackage.ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__VISIBILITY = CorePackage.ATTRIBUTE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__CLIENT_DEPENDENCY = CorePackage.ATTRIBUTE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__CONSTRAINT = CorePackage.ATTRIBUTE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IMPORTER = CorePackage.ATTRIBUTE__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAMESPACE = CorePackage.ATTRIBUTE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TAGGED_VALUE = CorePackage.ATTRIBUTE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owner Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__OWNER_SCOPE = CorePackage.ATTRIBUTE__OWNER_SCOPE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__OWNER = CorePackage.ATTRIBUTE__OWNER;

	/**
	 * The feature id for the '<em><b>Changeability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__CHANGEABILITY = CorePackage.ATTRIBUTE__CHANGEABILITY;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__MULTIPLICITY = CorePackage.ATTRIBUTE__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ORDERING = CorePackage.ATTRIBUTE__ORDERING;

	/**
	 * The feature id for the '<em><b>Target Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TARGET_SCOPE = CorePackage.ATTRIBUTE__TARGET_SCOPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = CorePackage.ATTRIBUTE__TYPE;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__INITIAL_VALUE = CorePackage.ATTRIBUTE__INITIAL_VALUE;

	/**
	 * The feature id for the '<em><b>Default Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DEFAULT_KIND = CorePackage.ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ELEMENT_TYPE = CorePackage.ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = CorePackage.ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link CWM.CwmXml.impl.ContentImpl <em>Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.CwmXml.impl.ContentImpl
	 * @see CWM.CwmXml.impl.CwmXmlPackageImpl#getContent()
	 * @generated
	 */
	int CONTENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__NAME = CorePackage.MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__VISIBILITY = CorePackage.MODEL_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__CLIENT_DEPENDENCY = CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__CONSTRAINT = CorePackage.MODEL_ELEMENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__IMPORTER = CorePackage.MODEL_ELEMENT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__NAMESPACE = CorePackage.MODEL_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__TAGGED_VALUE = CorePackage.MODEL_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__TYPE = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Occurrence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__OCCURRENCE = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__ELEMENT_TYPE = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Element Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__OWNED_ELEMENT_TYPE = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link CWM.CwmXml.impl.ElementContentImpl <em>Element Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.CwmXml.impl.ElementContentImpl
	 * @see CWM.CwmXml.impl.CwmXmlPackageImpl#getElementContent()
	 * @generated
	 */
	int ELEMENT_CONTENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_CONTENT__NAME = CONTENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_CONTENT__VISIBILITY = CONTENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_CONTENT__CLIENT_DEPENDENCY = CONTENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_CONTENT__CONSTRAINT = CONTENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_CONTENT__IMPORTER = CONTENT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_CONTENT__NAMESPACE = CONTENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_CONTENT__TAGGED_VALUE = CONTENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_CONTENT__TYPE = CONTENT__TYPE;

	/**
	 * The feature id for the '<em><b>Occurrence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_CONTENT__OCCURRENCE = CONTENT__OCCURRENCE;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_CONTENT__ELEMENT_TYPE = CONTENT__ELEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Owned Element Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_CONTENT__OWNED_ELEMENT_TYPE = CONTENT__OWNED_ELEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_CONTENT__ORDER = CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Content</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_CONTENT__OWNED_CONTENT = CONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owner Content</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_CONTENT__OWNER_CONTENT = CONTENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Element Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_CONTENT_FEATURE_COUNT = CONTENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link CWM.CwmXml.impl.MixedContentImpl <em>Mixed Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.CwmXml.impl.MixedContentImpl
	 * @see CWM.CwmXml.impl.CwmXmlPackageImpl#getMixedContent()
	 * @generated
	 */
	int MIXED_CONTENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXED_CONTENT__NAME = CONTENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXED_CONTENT__VISIBILITY = CONTENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXED_CONTENT__CLIENT_DEPENDENCY = CONTENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXED_CONTENT__CONSTRAINT = CONTENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXED_CONTENT__IMPORTER = CONTENT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXED_CONTENT__NAMESPACE = CONTENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXED_CONTENT__TAGGED_VALUE = CONTENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXED_CONTENT__TYPE = CONTENT__TYPE;

	/**
	 * The feature id for the '<em><b>Occurrence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXED_CONTENT__OCCURRENCE = CONTENT__OCCURRENCE;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXED_CONTENT__ELEMENT_TYPE = CONTENT__ELEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Owned Element Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXED_CONTENT__OWNED_ELEMENT_TYPE = CONTENT__OWNED_ELEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXED_CONTENT__TEXT = CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mixed Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXED_CONTENT_FEATURE_COUNT = CONTENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CWM.CwmXml.impl.ElementTypeReferenceImpl <em>Element Type Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.CwmXml.impl.ElementTypeReferenceImpl
	 * @see CWM.CwmXml.impl.CwmXmlPackageImpl#getElementTypeReference()
	 * @generated
	 */
	int ELEMENT_TYPE_REFERENCE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE_REFERENCE__NAME = CorePackage.ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE_REFERENCE__VISIBILITY = CorePackage.ATTRIBUTE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE_REFERENCE__CLIENT_DEPENDENCY = CorePackage.ATTRIBUTE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE_REFERENCE__CONSTRAINT = CorePackage.ATTRIBUTE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE_REFERENCE__IMPORTER = CorePackage.ATTRIBUTE__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE_REFERENCE__NAMESPACE = CorePackage.ATTRIBUTE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE_REFERENCE__TAGGED_VALUE = CorePackage.ATTRIBUTE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owner Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE_REFERENCE__OWNER_SCOPE = CorePackage.ATTRIBUTE__OWNER_SCOPE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE_REFERENCE__OWNER = CorePackage.ATTRIBUTE__OWNER;

	/**
	 * The feature id for the '<em><b>Changeability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE_REFERENCE__CHANGEABILITY = CorePackage.ATTRIBUTE__CHANGEABILITY;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE_REFERENCE__MULTIPLICITY = CorePackage.ATTRIBUTE__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE_REFERENCE__ORDERING = CorePackage.ATTRIBUTE__ORDERING;

	/**
	 * The feature id for the '<em><b>Target Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE_REFERENCE__TARGET_SCOPE = CorePackage.ATTRIBUTE__TARGET_SCOPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE_REFERENCE__TYPE = CorePackage.ATTRIBUTE__TYPE;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE_REFERENCE__INITIAL_VALUE = CorePackage.ATTRIBUTE__INITIAL_VALUE;

	/**
	 * The feature id for the '<em><b>Occurrence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE_REFERENCE__OCCURRENCE = CorePackage.ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owner Content</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE_REFERENCE__OWNER_CONTENT = CorePackage.ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Element Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE_REFERENCE_FEATURE_COUNT = CorePackage.ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link CWM.CwmXml.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.CwmXml.impl.TextImpl
	 * @see CWM.CwmXml.impl.CwmXmlPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__NAME = CorePackage.ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__VISIBILITY = CorePackage.ATTRIBUTE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__CLIENT_DEPENDENCY = CorePackage.ATTRIBUTE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__CONSTRAINT = CorePackage.ATTRIBUTE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__IMPORTER = CorePackage.ATTRIBUTE__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__NAMESPACE = CorePackage.ATTRIBUTE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__TAGGED_VALUE = CorePackage.ATTRIBUTE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owner Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__OWNER_SCOPE = CorePackage.ATTRIBUTE__OWNER_SCOPE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__OWNER = CorePackage.ATTRIBUTE__OWNER;

	/**
	 * The feature id for the '<em><b>Changeability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__CHANGEABILITY = CorePackage.ATTRIBUTE__CHANGEABILITY;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__MULTIPLICITY = CorePackage.ATTRIBUTE__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__ORDERING = CorePackage.ATTRIBUTE__ORDERING;

	/**
	 * The feature id for the '<em><b>Target Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__TARGET_SCOPE = CorePackage.ATTRIBUTE__TARGET_SCOPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__TYPE = CorePackage.ATTRIBUTE__TYPE;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__INITIAL_VALUE = CorePackage.ATTRIBUTE__INITIAL_VALUE;

	/**
	 * The feature id for the '<em><b>Owner Content</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__OWNER_CONTENT = CorePackage.ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = CorePackage.ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CWM.CwmXml.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.CwmXml.impl.ElementImpl
	 * @see CWM.CwmXml.impl.CwmXmlPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = CwmInstancePackage.OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__VISIBILITY = CwmInstancePackage.OBJECT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__CLIENT_DEPENDENCY = CwmInstancePackage.OBJECT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__CONSTRAINT = CwmInstancePackage.OBJECT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__IMPORTER = CwmInstancePackage.OBJECT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAMESPACE = CwmInstancePackage.OBJECT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__TAGGED_VALUE = CwmInstancePackage.OBJECT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__CLASSIFIER = CwmInstancePackage.OBJECT__CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__SLOT = CwmInstancePackage.OBJECT__SLOT;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = CwmInstancePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CWM.CwmXml.impl.DocumentImpl <em>Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.CwmXml.impl.DocumentImpl
	 * @see CWM.CwmXml.impl.CwmXmlPackageImpl#getDocument()
	 * @generated
	 */
	int DOCUMENT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__NAME = CwmInstancePackage.EXTENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__VISIBILITY = CwmInstancePackage.EXTENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__CLIENT_DEPENDENCY = CwmInstancePackage.EXTENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__CONSTRAINT = CwmInstancePackage.EXTENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__IMPORTER = CwmInstancePackage.EXTENT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__NAMESPACE = CwmInstancePackage.EXTENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__TAGGED_VALUE = CwmInstancePackage.EXTENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__OWNED_ELEMENT = CwmInstancePackage.EXTENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Imported Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__IMPORTED_ELEMENT = CwmInstancePackage.EXTENT__IMPORTED_ELEMENT;

	/**
	 * The number of structural features of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_FEATURE_COUNT = CwmInstancePackage.EXTENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CWM.CwmXml.impl.XML_containerImpl <em>XML container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.CwmXml.impl.XML_containerImpl
	 * @see CWM.CwmXml.impl.CwmXmlPackageImpl#getXML_container()
	 * @generated
	 */
	int XML_CONTAINER = 10;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_CONTAINER__SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_CONTAINER__ELEMENT_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_CONTAINER__ATTRIBUTE = 2;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_CONTAINER__CONTENT = 3;

	/**
	 * The feature id for the '<em><b>Element Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_CONTAINER__ELEMENT_CONTENT = 4;

	/**
	 * The feature id for the '<em><b>Mixed Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_CONTAINER__MIXED_CONTENT = 5;

	/**
	 * The feature id for the '<em><b>Element Type Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_CONTAINER__ELEMENT_TYPE_REFERENCE = 6;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_CONTAINER__TEXT = 7;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_CONTAINER__ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Document</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_CONTAINER__DOCUMENT = 9;

	/**
	 * The number of structural features of the '<em>XML container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_CONTAINER_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link CWM.CwmXml.AttributeDefault <em>Attribute Default</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.CwmXml.AttributeDefault
	 * @see CWM.CwmXml.impl.CwmXmlPackageImpl#getAttributeDefault()
	 * @generated
	 */
	int ATTRIBUTE_DEFAULT = 11;

	/**
	 * The meta object id for the '{@link CWM.CwmXml.ContentType <em>Content Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.CwmXml.ContentType
	 * @see CWM.CwmXml.impl.CwmXmlPackageImpl#getContentType()
	 * @generated
	 */
	int CONTENT_TYPE = 12;

	/**
	 * The meta object id for the '{@link CWM.CwmXml.OccurrenceType <em>Occurrence Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.CwmXml.OccurrenceType
	 * @see CWM.CwmXml.impl.CwmXmlPackageImpl#getOccurrenceType()
	 * @generated
	 */
	int OCCURRENCE_TYPE = 13;

	/**
	 * The meta object id for the '{@link CWM.CwmXml.ElementOrderType <em>Element Order Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.CwmXml.ElementOrderType
	 * @see CWM.CwmXml.impl.CwmXmlPackageImpl#getElementOrderType()
	 * @generated
	 */
	int ELEMENT_ORDER_TYPE = 14;


	/**
	 * Returns the meta object for class '{@link CWM.CwmXml.Schema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema</em>'.
	 * @see CWM.CwmXml.Schema
	 * @generated
	 */
	EClass getSchema();

	/**
	 * Returns the meta object for the attribute '{@link CWM.CwmXml.Schema#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see CWM.CwmXml.Schema#getVersion()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_Version();

	/**
	 * Returns the meta object for the attribute '{@link CWM.CwmXml.Schema#getXmlNamespace <em>Xml Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xml Namespace</em>'.
	 * @see CWM.CwmXml.Schema#getXmlNamespace()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_XmlNamespace();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.CwmXml.Schema#getElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element Type</em>'.
	 * @see CWM.CwmXml.Schema#getElementType()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_ElementType();

	/**
	 * Returns the meta object for class '{@link CWM.CwmXml.ElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Type</em>'.
	 * @see CWM.CwmXml.ElementType
	 * @generated
	 */
	EClass getElementType();

	/**
	 * Returns the meta object for the reference '{@link CWM.CwmXml.ElementType#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Schema</em>'.
	 * @see CWM.CwmXml.ElementType#getSchema()
	 * @see #getElementType()
	 * @generated
	 */
	EReference getElementType_Schema();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.CwmXml.ElementType#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see CWM.CwmXml.ElementType#getAttribute()
	 * @see #getElementType()
	 * @generated
	 */
	EReference getElementType_Attribute();

	/**
	 * Returns the meta object for the reference '{@link CWM.CwmXml.ElementType#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see CWM.CwmXml.ElementType#getContent()
	 * @see #getElementType()
	 * @generated
	 */
	EReference getElementType_Content();

	/**
	 * Returns the meta object for class '{@link CWM.CwmXml.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see CWM.CwmXml.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link CWM.CwmXml.Attribute#getDefaultKind <em>Default Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Kind</em>'.
	 * @see CWM.CwmXml.Attribute#getDefaultKind()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_DefaultKind();

	/**
	 * Returns the meta object for the reference '{@link CWM.CwmXml.Attribute#getElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element Type</em>'.
	 * @see CWM.CwmXml.Attribute#getElementType()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_ElementType();

	/**
	 * Returns the meta object for class '{@link CWM.CwmXml.Content <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content</em>'.
	 * @see CWM.CwmXml.Content
	 * @generated
	 */
	EClass getContent();

	/**
	 * Returns the meta object for the attribute '{@link CWM.CwmXml.Content#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see CWM.CwmXml.Content#getType()
	 * @see #getContent()
	 * @generated
	 */
	EAttribute getContent_Type();

	/**
	 * Returns the meta object for the attribute '{@link CWM.CwmXml.Content#getOccurrence <em>Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occurrence</em>'.
	 * @see CWM.CwmXml.Content#getOccurrence()
	 * @see #getContent()
	 * @generated
	 */
	EAttribute getContent_Occurrence();

	/**
	 * Returns the meta object for the reference list '{@link CWM.CwmXml.Content#getElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Element Type</em>'.
	 * @see CWM.CwmXml.Content#getElementType()
	 * @see #getContent()
	 * @generated
	 */
	EReference getContent_ElementType();

	/**
	 * Returns the meta object for the reference list '{@link CWM.CwmXml.Content#getOwnedElementType <em>Owned Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Element Type</em>'.
	 * @see CWM.CwmXml.Content#getOwnedElementType()
	 * @see #getContent()
	 * @generated
	 */
	EReference getContent_OwnedElementType();

	/**
	 * Returns the meta object for class '{@link CWM.CwmXml.ElementContent <em>Element Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Content</em>'.
	 * @see CWM.CwmXml.ElementContent
	 * @generated
	 */
	EClass getElementContent();

	/**
	 * Returns the meta object for the attribute '{@link CWM.CwmXml.ElementContent#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see CWM.CwmXml.ElementContent#getOrder()
	 * @see #getElementContent()
	 * @generated
	 */
	EAttribute getElementContent_Order();

	/**
	 * Returns the meta object for the reference list '{@link CWM.CwmXml.ElementContent#getOwnedContent <em>Owned Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Content</em>'.
	 * @see CWM.CwmXml.ElementContent#getOwnedContent()
	 * @see #getElementContent()
	 * @generated
	 */
	EReference getElementContent_OwnedContent();

	/**
	 * Returns the meta object for the reference list '{@link CWM.CwmXml.ElementContent#getOwnerContent <em>Owner Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owner Content</em>'.
	 * @see CWM.CwmXml.ElementContent#getOwnerContent()
	 * @see #getElementContent()
	 * @generated
	 */
	EReference getElementContent_OwnerContent();

	/**
	 * Returns the meta object for class '{@link CWM.CwmXml.MixedContent <em>Mixed Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mixed Content</em>'.
	 * @see CWM.CwmXml.MixedContent
	 * @generated
	 */
	EClass getMixedContent();

	/**
	 * Returns the meta object for the containment reference '{@link CWM.CwmXml.MixedContent#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see CWM.CwmXml.MixedContent#getText()
	 * @see #getMixedContent()
	 * @generated
	 */
	EReference getMixedContent_Text();

	/**
	 * Returns the meta object for class '{@link CWM.CwmXml.ElementTypeReference <em>Element Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Type Reference</em>'.
	 * @see CWM.CwmXml.ElementTypeReference
	 * @generated
	 */
	EClass getElementTypeReference();

	/**
	 * Returns the meta object for the attribute '{@link CWM.CwmXml.ElementTypeReference#getOccurrence <em>Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occurrence</em>'.
	 * @see CWM.CwmXml.ElementTypeReference#getOccurrence()
	 * @see #getElementTypeReference()
	 * @generated
	 */
	EAttribute getElementTypeReference_Occurrence();

	/**
	 * Returns the meta object for the reference list '{@link CWM.CwmXml.ElementTypeReference#getOwnerContent <em>Owner Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owner Content</em>'.
	 * @see CWM.CwmXml.ElementTypeReference#getOwnerContent()
	 * @see #getElementTypeReference()
	 * @generated
	 */
	EReference getElementTypeReference_OwnerContent();

	/**
	 * Returns the meta object for class '{@link CWM.CwmXml.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see CWM.CwmXml.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for the container reference '{@link CWM.CwmXml.Text#getOwnerContent <em>Owner Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner Content</em>'.
	 * @see CWM.CwmXml.Text#getOwnerContent()
	 * @see #getText()
	 * @generated
	 */
	EReference getText_OwnerContent();

	/**
	 * Returns the meta object for class '{@link CWM.CwmXml.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see CWM.CwmXml.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for class '{@link CWM.CwmXml.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document</em>'.
	 * @see CWM.CwmXml.Document
	 * @generated
	 */
	EClass getDocument();

	/**
	 * Returns the meta object for class '{@link CWM.CwmXml.XML_container <em>XML container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XML container</em>'.
	 * @see CWM.CwmXml.XML_container
	 * @generated
	 */
	EClass getXML_container();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.CwmXml.XML_container#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Schema</em>'.
	 * @see CWM.CwmXml.XML_container#getSchema()
	 * @see #getXML_container()
	 * @generated
	 */
	EReference getXML_container_Schema();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.CwmXml.XML_container#getElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element Type</em>'.
	 * @see CWM.CwmXml.XML_container#getElementType()
	 * @see #getXML_container()
	 * @generated
	 */
	EReference getXML_container_ElementType();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.CwmXml.XML_container#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see CWM.CwmXml.XML_container#getAttribute()
	 * @see #getXML_container()
	 * @generated
	 */
	EReference getXML_container_Attribute();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.CwmXml.XML_container#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content</em>'.
	 * @see CWM.CwmXml.XML_container#getContent()
	 * @see #getXML_container()
	 * @generated
	 */
	EReference getXML_container_Content();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.CwmXml.XML_container#getElementContent <em>Element Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element Content</em>'.
	 * @see CWM.CwmXml.XML_container#getElementContent()
	 * @see #getXML_container()
	 * @generated
	 */
	EReference getXML_container_ElementContent();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.CwmXml.XML_container#getMixedContent <em>Mixed Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mixed Content</em>'.
	 * @see CWM.CwmXml.XML_container#getMixedContent()
	 * @see #getXML_container()
	 * @generated
	 */
	EReference getXML_container_MixedContent();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.CwmXml.XML_container#getElementTypeReference <em>Element Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element Type Reference</em>'.
	 * @see CWM.CwmXml.XML_container#getElementTypeReference()
	 * @see #getXML_container()
	 * @generated
	 */
	EReference getXML_container_ElementTypeReference();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.CwmXml.XML_container#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Text</em>'.
	 * @see CWM.CwmXml.XML_container#getText()
	 * @see #getXML_container()
	 * @generated
	 */
	EReference getXML_container_Text();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.CwmXml.XML_container#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element</em>'.
	 * @see CWM.CwmXml.XML_container#getElement()
	 * @see #getXML_container()
	 * @generated
	 */
	EReference getXML_container_Element();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.CwmXml.XML_container#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Document</em>'.
	 * @see CWM.CwmXml.XML_container#getDocument()
	 * @see #getXML_container()
	 * @generated
	 */
	EReference getXML_container_Document();

	/**
	 * Returns the meta object for enum '{@link CWM.CwmXml.AttributeDefault <em>Attribute Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Attribute Default</em>'.
	 * @see CWM.CwmXml.AttributeDefault
	 * @generated
	 */
	EEnum getAttributeDefault();

	/**
	 * Returns the meta object for enum '{@link CWM.CwmXml.ContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Content Type</em>'.
	 * @see CWM.CwmXml.ContentType
	 * @generated
	 */
	EEnum getContentType();

	/**
	 * Returns the meta object for enum '{@link CWM.CwmXml.OccurrenceType <em>Occurrence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Occurrence Type</em>'.
	 * @see CWM.CwmXml.OccurrenceType
	 * @generated
	 */
	EEnum getOccurrenceType();

	/**
	 * Returns the meta object for enum '{@link CWM.CwmXml.ElementOrderType <em>Element Order Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Element Order Type</em>'.
	 * @see CWM.CwmXml.ElementOrderType
	 * @generated
	 */
	EEnum getElementOrderType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CwmXmlFactory getCwmXmlFactory();

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
		 * The meta object literal for the '{@link CWM.CwmXml.impl.SchemaImpl <em>Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.CwmXml.impl.SchemaImpl
		 * @see CWM.CwmXml.impl.CwmXmlPackageImpl#getSchema()
		 * @generated
		 */
		EClass SCHEMA = eINSTANCE.getSchema();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__VERSION = eINSTANCE.getSchema_Version();

		/**
		 * The meta object literal for the '<em><b>Xml Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__XML_NAMESPACE = eINSTANCE.getSchema_XmlNamespace();

		/**
		 * The meta object literal for the '<em><b>Element Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__ELEMENT_TYPE = eINSTANCE.getSchema_ElementType();

		/**
		 * The meta object literal for the '{@link CWM.CwmXml.impl.ElementTypeImpl <em>Element Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.CwmXml.impl.ElementTypeImpl
		 * @see CWM.CwmXml.impl.CwmXmlPackageImpl#getElementType()
		 * @generated
		 */
		EClass ELEMENT_TYPE = eINSTANCE.getElementType();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_TYPE__SCHEMA = eINSTANCE.getElementType_Schema();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_TYPE__ATTRIBUTE = eINSTANCE.getElementType_Attribute();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_TYPE__CONTENT = eINSTANCE.getElementType_Content();

		/**
		 * The meta object literal for the '{@link CWM.CwmXml.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.CwmXml.impl.AttributeImpl
		 * @see CWM.CwmXml.impl.CwmXmlPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Default Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__DEFAULT_KIND = eINSTANCE.getAttribute_DefaultKind();

		/**
		 * The meta object literal for the '<em><b>Element Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__ELEMENT_TYPE = eINSTANCE.getAttribute_ElementType();

		/**
		 * The meta object literal for the '{@link CWM.CwmXml.impl.ContentImpl <em>Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.CwmXml.impl.ContentImpl
		 * @see CWM.CwmXml.impl.CwmXmlPackageImpl#getContent()
		 * @generated
		 */
		EClass CONTENT = eINSTANCE.getContent();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT__TYPE = eINSTANCE.getContent_Type();

		/**
		 * The meta object literal for the '<em><b>Occurrence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT__OCCURRENCE = eINSTANCE.getContent_Occurrence();

		/**
		 * The meta object literal for the '<em><b>Element Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT__ELEMENT_TYPE = eINSTANCE.getContent_ElementType();

		/**
		 * The meta object literal for the '<em><b>Owned Element Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT__OWNED_ELEMENT_TYPE = eINSTANCE.getContent_OwnedElementType();

		/**
		 * The meta object literal for the '{@link CWM.CwmXml.impl.ElementContentImpl <em>Element Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.CwmXml.impl.ElementContentImpl
		 * @see CWM.CwmXml.impl.CwmXmlPackageImpl#getElementContent()
		 * @generated
		 */
		EClass ELEMENT_CONTENT = eINSTANCE.getElementContent();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_CONTENT__ORDER = eINSTANCE.getElementContent_Order();

		/**
		 * The meta object literal for the '<em><b>Owned Content</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_CONTENT__OWNED_CONTENT = eINSTANCE.getElementContent_OwnedContent();

		/**
		 * The meta object literal for the '<em><b>Owner Content</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_CONTENT__OWNER_CONTENT = eINSTANCE.getElementContent_OwnerContent();

		/**
		 * The meta object literal for the '{@link CWM.CwmXml.impl.MixedContentImpl <em>Mixed Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.CwmXml.impl.MixedContentImpl
		 * @see CWM.CwmXml.impl.CwmXmlPackageImpl#getMixedContent()
		 * @generated
		 */
		EClass MIXED_CONTENT = eINSTANCE.getMixedContent();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIXED_CONTENT__TEXT = eINSTANCE.getMixedContent_Text();

		/**
		 * The meta object literal for the '{@link CWM.CwmXml.impl.ElementTypeReferenceImpl <em>Element Type Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.CwmXml.impl.ElementTypeReferenceImpl
		 * @see CWM.CwmXml.impl.CwmXmlPackageImpl#getElementTypeReference()
		 * @generated
		 */
		EClass ELEMENT_TYPE_REFERENCE = eINSTANCE.getElementTypeReference();

		/**
		 * The meta object literal for the '<em><b>Occurrence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_TYPE_REFERENCE__OCCURRENCE = eINSTANCE.getElementTypeReference_Occurrence();

		/**
		 * The meta object literal for the '<em><b>Owner Content</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_TYPE_REFERENCE__OWNER_CONTENT = eINSTANCE.getElementTypeReference_OwnerContent();

		/**
		 * The meta object literal for the '{@link CWM.CwmXml.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.CwmXml.impl.TextImpl
		 * @see CWM.CwmXml.impl.CwmXmlPackageImpl#getText()
		 * @generated
		 */
		EClass TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '<em><b>Owner Content</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT__OWNER_CONTENT = eINSTANCE.getText_OwnerContent();

		/**
		 * The meta object literal for the '{@link CWM.CwmXml.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.CwmXml.impl.ElementImpl
		 * @see CWM.CwmXml.impl.CwmXmlPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '{@link CWM.CwmXml.impl.DocumentImpl <em>Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.CwmXml.impl.DocumentImpl
		 * @see CWM.CwmXml.impl.CwmXmlPackageImpl#getDocument()
		 * @generated
		 */
		EClass DOCUMENT = eINSTANCE.getDocument();

		/**
		 * The meta object literal for the '{@link CWM.CwmXml.impl.XML_containerImpl <em>XML container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.CwmXml.impl.XML_containerImpl
		 * @see CWM.CwmXml.impl.CwmXmlPackageImpl#getXML_container()
		 * @generated
		 */
		EClass XML_CONTAINER = eINSTANCE.getXML_container();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_CONTAINER__SCHEMA = eINSTANCE.getXML_container_Schema();

		/**
		 * The meta object literal for the '<em><b>Element Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_CONTAINER__ELEMENT_TYPE = eINSTANCE.getXML_container_ElementType();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_CONTAINER__ATTRIBUTE = eINSTANCE.getXML_container_Attribute();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_CONTAINER__CONTENT = eINSTANCE.getXML_container_Content();

		/**
		 * The meta object literal for the '<em><b>Element Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_CONTAINER__ELEMENT_CONTENT = eINSTANCE.getXML_container_ElementContent();

		/**
		 * The meta object literal for the '<em><b>Mixed Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_CONTAINER__MIXED_CONTENT = eINSTANCE.getXML_container_MixedContent();

		/**
		 * The meta object literal for the '<em><b>Element Type Reference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_CONTAINER__ELEMENT_TYPE_REFERENCE = eINSTANCE.getXML_container_ElementTypeReference();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_CONTAINER__TEXT = eINSTANCE.getXML_container_Text();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_CONTAINER__ELEMENT = eINSTANCE.getXML_container_Element();

		/**
		 * The meta object literal for the '<em><b>Document</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_CONTAINER__DOCUMENT = eINSTANCE.getXML_container_Document();

		/**
		 * The meta object literal for the '{@link CWM.CwmXml.AttributeDefault <em>Attribute Default</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.CwmXml.AttributeDefault
		 * @see CWM.CwmXml.impl.CwmXmlPackageImpl#getAttributeDefault()
		 * @generated
		 */
		EEnum ATTRIBUTE_DEFAULT = eINSTANCE.getAttributeDefault();

		/**
		 * The meta object literal for the '{@link CWM.CwmXml.ContentType <em>Content Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.CwmXml.ContentType
		 * @see CWM.CwmXml.impl.CwmXmlPackageImpl#getContentType()
		 * @generated
		 */
		EEnum CONTENT_TYPE = eINSTANCE.getContentType();

		/**
		 * The meta object literal for the '{@link CWM.CwmXml.OccurrenceType <em>Occurrence Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.CwmXml.OccurrenceType
		 * @see CWM.CwmXml.impl.CwmXmlPackageImpl#getOccurrenceType()
		 * @generated
		 */
		EEnum OCCURRENCE_TYPE = eINSTANCE.getOccurrenceType();

		/**
		 * The meta object literal for the '{@link CWM.CwmXml.ElementOrderType <em>Element Order Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.CwmXml.ElementOrderType
		 * @see CWM.CwmXml.impl.CwmXmlPackageImpl#getElementOrderType()
		 * @generated
		 */
		EEnum ELEMENT_ORDER_TYPE = eINSTANCE.getElementOrderType();

	}

} //CwmXmlPackage

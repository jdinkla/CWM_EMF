/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningData;

import CWM.Core.CorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see CWM.MiningCore.MiningData.MiningDataFactory
 * @model kind="package"
 * @generated
 */
public interface MiningDataPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "MiningData";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "MiningData";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "MiningData";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MiningDataPackage eINSTANCE = CWM.MiningCore.MiningData.impl.MiningDataPackageImpl.init();

	/**
	 * The meta object id for the '{@link CWM.MiningCore.MiningData.impl.AttributeAssignmentImpl <em>Attribute Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.MiningCore.MiningData.impl.AttributeAssignmentImpl
	 * @see CWM.MiningCore.MiningData.impl.MiningDataPackageImpl#getAttributeAssignment()
	 * @generated
	 */
	int ATTRIBUTE_ASSIGNMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ASSIGNMENT__NAME = CorePackage.MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ASSIGNMENT__VISIBILITY = CorePackage.MODEL_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ASSIGNMENT__CLIENT_DEPENDENCY = CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ASSIGNMENT__CONSTRAINT = CorePackage.MODEL_ELEMENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ASSIGNMENT__IMPORTER = CorePackage.MODEL_ELEMENT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ASSIGNMENT__NAMESPACE = CorePackage.MODEL_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ASSIGNMENT__TAGGED_VALUE = CorePackage.MODEL_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Order Id Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ASSIGNMENT__ORDER_ID_ATTRIBUTE = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Logical Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ASSIGNMENT__LOGICAL_ATTRIBUTE = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ASSIGNMENT_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link CWM.MiningCore.MiningData.impl.AttributeAssignmentSetImpl <em>Attribute Assignment Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.MiningCore.MiningData.impl.AttributeAssignmentSetImpl
	 * @see CWM.MiningCore.MiningData.impl.MiningDataPackageImpl#getAttributeAssignmentSet()
	 * @generated
	 */
	int ATTRIBUTE_ASSIGNMENT_SET = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ASSIGNMENT_SET__NAME = CorePackage.MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ASSIGNMENT_SET__VISIBILITY = CorePackage.MODEL_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ASSIGNMENT_SET__CLIENT_DEPENDENCY = CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ASSIGNMENT_SET__CONSTRAINT = CorePackage.MODEL_ELEMENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ASSIGNMENT_SET__IMPORTER = CorePackage.MODEL_ELEMENT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ASSIGNMENT_SET__NAMESPACE = CorePackage.MODEL_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ASSIGNMENT_SET__TAGGED_VALUE = CorePackage.MODEL_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Assignment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ASSIGNMENT_SET__ASSIGNMENT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute Assignment Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_ASSIGNMENT_SET_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CWM.MiningCore.MiningData.impl.AttributeUsageImpl <em>Attribute Usage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.MiningCore.MiningData.impl.AttributeUsageImpl
	 * @see CWM.MiningCore.MiningData.impl.MiningDataPackageImpl#getAttributeUsage()
	 * @generated
	 */
	int ATTRIBUTE_USAGE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_USAGE__NAME = CorePackage.FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_USAGE__VISIBILITY = CorePackage.FEATURE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_USAGE__CLIENT_DEPENDENCY = CorePackage.FEATURE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_USAGE__CONSTRAINT = CorePackage.FEATURE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_USAGE__IMPORTER = CorePackage.FEATURE__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_USAGE__NAMESPACE = CorePackage.FEATURE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_USAGE__TAGGED_VALUE = CorePackage.FEATURE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owner Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_USAGE__OWNER_SCOPE = CorePackage.FEATURE__OWNER_SCOPE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_USAGE__OWNER = CorePackage.FEATURE__OWNER;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_USAGE__USAGE = CorePackage.FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_USAGE__WEIGHT = CorePackage.FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_USAGE__ATTRIBUTE = CorePackage.FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Suppress Discretization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_USAGE__SUPPRESS_DISCRETIZATION = CorePackage.FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Suppress Normalization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_USAGE__SUPPRESS_NORMALIZATION = CorePackage.FEATURE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Attribute Usage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_USAGE_FEATURE_COUNT = CorePackage.FEATURE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link CWM.MiningCore.MiningData.impl.AttributeUsageSetImpl <em>Attribute Usage Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.MiningCore.MiningData.impl.AttributeUsageSetImpl
	 * @see CWM.MiningCore.MiningData.impl.MiningDataPackageImpl#getAttributeUsageSet()
	 * @generated
	 */
	int ATTRIBUTE_USAGE_SET = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_USAGE_SET__NAME = CorePackage.CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_USAGE_SET__VISIBILITY = CorePackage.CLASS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_USAGE_SET__CLIENT_DEPENDENCY = CorePackage.CLASS__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_USAGE_SET__CONSTRAINT = CorePackage.CLASS__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_USAGE_SET__IMPORTER = CorePackage.CLASS__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_USAGE_SET__NAMESPACE = CorePackage.CLASS__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_USAGE_SET__TAGGED_VALUE = CorePackage.CLASS__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_USAGE_SET__OWNED_ELEMENT = CorePackage.CLASS__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_USAGE_SET__IS_ABSTRACT = CorePackage.CLASS__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_USAGE_SET__FEATURE = CorePackage.CLASS__FEATURE;

	/**
	 * The number of structural features of the '<em>Attribute Usage Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_USAGE_SET_FEATURE_COUNT = CorePackage.CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CWM.MiningCore.MiningData.impl.CategoricalAttributePropertiesImpl <em>Categorical Attribute Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.MiningCore.MiningData.impl.CategoricalAttributePropertiesImpl
	 * @see CWM.MiningCore.MiningData.impl.MiningDataPackageImpl#getCategoricalAttributeProperties()
	 * @generated
	 */
	int CATEGORICAL_ATTRIBUTE_PROPERTIES = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORICAL_ATTRIBUTE_PROPERTIES__NAME = CorePackage.MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORICAL_ATTRIBUTE_PROPERTIES__VISIBILITY = CorePackage.MODEL_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORICAL_ATTRIBUTE_PROPERTIES__CLIENT_DEPENDENCY = CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORICAL_ATTRIBUTE_PROPERTIES__CONSTRAINT = CorePackage.MODEL_ELEMENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORICAL_ATTRIBUTE_PROPERTIES__IMPORTER = CorePackage.MODEL_ELEMENT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORICAL_ATTRIBUTE_PROPERTIES__NAMESPACE = CorePackage.MODEL_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORICAL_ATTRIBUTE_PROPERTIES__TAGGED_VALUE = CorePackage.MODEL_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORICAL_ATTRIBUTE_PROPERTIES__CATEGORY = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Taxonomy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORICAL_ATTRIBUTE_PROPERTIES__TAXONOMY = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Categorical Attribute Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORICAL_ATTRIBUTE_PROPERTIES_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link CWM.MiningCore.MiningData.impl.DirectAttributeAssignmentImpl <em>Direct Attribute Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.MiningCore.MiningData.impl.DirectAttributeAssignmentImpl
	 * @see CWM.MiningCore.MiningData.impl.MiningDataPackageImpl#getDirectAttributeAssignment()
	 * @generated
	 */
	int DIRECT_ATTRIBUTE_ASSIGNMENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_ATTRIBUTE_ASSIGNMENT__NAME = ATTRIBUTE_ASSIGNMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_ATTRIBUTE_ASSIGNMENT__VISIBILITY = ATTRIBUTE_ASSIGNMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_ATTRIBUTE_ASSIGNMENT__CLIENT_DEPENDENCY = ATTRIBUTE_ASSIGNMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_ATTRIBUTE_ASSIGNMENT__CONSTRAINT = ATTRIBUTE_ASSIGNMENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_ATTRIBUTE_ASSIGNMENT__IMPORTER = ATTRIBUTE_ASSIGNMENT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_ATTRIBUTE_ASSIGNMENT__NAMESPACE = ATTRIBUTE_ASSIGNMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_ATTRIBUTE_ASSIGNMENT__TAGGED_VALUE = ATTRIBUTE_ASSIGNMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Order Id Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_ATTRIBUTE_ASSIGNMENT__ORDER_ID_ATTRIBUTE = ATTRIBUTE_ASSIGNMENT__ORDER_ID_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Logical Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_ATTRIBUTE_ASSIGNMENT__LOGICAL_ATTRIBUTE = ATTRIBUTE_ASSIGNMENT__LOGICAL_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_ATTRIBUTE_ASSIGNMENT__ATTRIBUTE = ATTRIBUTE_ASSIGNMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Direct Attribute Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_ATTRIBUTE_ASSIGNMENT_FEATURE_COUNT = ATTRIBUTE_ASSIGNMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CWM.MiningCore.MiningData.impl.MiningAttributeImpl <em>Mining Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.MiningCore.MiningData.impl.MiningAttributeImpl
	 * @see CWM.MiningCore.MiningData.impl.MiningDataPackageImpl#getMiningAttribute()
	 * @generated
	 */
	int MINING_ATTRIBUTE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_ATTRIBUTE__NAME = CorePackage.ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_ATTRIBUTE__VISIBILITY = CorePackage.ATTRIBUTE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_ATTRIBUTE__CLIENT_DEPENDENCY = CorePackage.ATTRIBUTE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_ATTRIBUTE__CONSTRAINT = CorePackage.ATTRIBUTE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_ATTRIBUTE__IMPORTER = CorePackage.ATTRIBUTE__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_ATTRIBUTE__NAMESPACE = CorePackage.ATTRIBUTE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_ATTRIBUTE__TAGGED_VALUE = CorePackage.ATTRIBUTE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owner Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_ATTRIBUTE__OWNER_SCOPE = CorePackage.ATTRIBUTE__OWNER_SCOPE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_ATTRIBUTE__OWNER = CorePackage.ATTRIBUTE__OWNER;

	/**
	 * The feature id for the '<em><b>Changeability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_ATTRIBUTE__CHANGEABILITY = CorePackage.ATTRIBUTE__CHANGEABILITY;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_ATTRIBUTE__MULTIPLICITY = CorePackage.ATTRIBUTE__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_ATTRIBUTE__ORDERING = CorePackage.ATTRIBUTE__ORDERING;

	/**
	 * The feature id for the '<em><b>Target Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_ATTRIBUTE__TARGET_SCOPE = CorePackage.ATTRIBUTE__TARGET_SCOPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_ATTRIBUTE__TYPE = CorePackage.ATTRIBUTE__TYPE;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_ATTRIBUTE__INITIAL_VALUE = CorePackage.ATTRIBUTE__INITIAL_VALUE;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_ATTRIBUTE__DISPLAY_NAME = CorePackage.ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attribute Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_ATTRIBUTE__ATTRIBUTE_TYPE = CorePackage.ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Mining Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_ATTRIBUTE_FEATURE_COUNT = CorePackage.ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link CWM.MiningCore.MiningData.impl.LogicalAttributeImpl <em>Logical Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.MiningCore.MiningData.impl.LogicalAttributeImpl
	 * @see CWM.MiningCore.MiningData.impl.MiningDataPackageImpl#getLogicalAttribute()
	 * @generated
	 */
	int LOGICAL_ATTRIBUTE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ATTRIBUTE__NAME = MINING_ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ATTRIBUTE__VISIBILITY = MINING_ATTRIBUTE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ATTRIBUTE__CLIENT_DEPENDENCY = MINING_ATTRIBUTE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ATTRIBUTE__CONSTRAINT = MINING_ATTRIBUTE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ATTRIBUTE__IMPORTER = MINING_ATTRIBUTE__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ATTRIBUTE__NAMESPACE = MINING_ATTRIBUTE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ATTRIBUTE__TAGGED_VALUE = MINING_ATTRIBUTE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owner Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ATTRIBUTE__OWNER_SCOPE = MINING_ATTRIBUTE__OWNER_SCOPE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ATTRIBUTE__OWNER = MINING_ATTRIBUTE__OWNER;

	/**
	 * The feature id for the '<em><b>Changeability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ATTRIBUTE__CHANGEABILITY = MINING_ATTRIBUTE__CHANGEABILITY;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ATTRIBUTE__MULTIPLICITY = MINING_ATTRIBUTE__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ATTRIBUTE__ORDERING = MINING_ATTRIBUTE__ORDERING;

	/**
	 * The feature id for the '<em><b>Target Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ATTRIBUTE__TARGET_SCOPE = MINING_ATTRIBUTE__TARGET_SCOPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ATTRIBUTE__TYPE = MINING_ATTRIBUTE__TYPE;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ATTRIBUTE__INITIAL_VALUE = MINING_ATTRIBUTE__INITIAL_VALUE;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ATTRIBUTE__DISPLAY_NAME = MINING_ATTRIBUTE__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Attribute Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ATTRIBUTE__ATTRIBUTE_TYPE = MINING_ATTRIBUTE__ATTRIBUTE_TYPE;

	/**
	 * The feature id for the '<em><b>Is Set Valued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ATTRIBUTE__IS_SET_VALUED = MINING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Categorical Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ATTRIBUTE__CATEGORICAL_PROPERTIES = MINING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Numerical Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ATTRIBUTE__NUMERICAL_PROPERTIES = MINING_ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Logical Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ATTRIBUTE_FEATURE_COUNT = MINING_ATTRIBUTE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link CWM.MiningCore.MiningData.impl.LogicalDataImpl <em>Logical Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.MiningCore.MiningData.impl.LogicalDataImpl
	 * @see CWM.MiningCore.MiningData.impl.MiningDataPackageImpl#getLogicalData()
	 * @generated
	 */
	int LOGICAL_DATA = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DATA__NAME = CorePackage.CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DATA__VISIBILITY = CorePackage.CLASS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DATA__CLIENT_DEPENDENCY = CorePackage.CLASS__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DATA__CONSTRAINT = CorePackage.CLASS__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DATA__IMPORTER = CorePackage.CLASS__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DATA__NAMESPACE = CorePackage.CLASS__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DATA__TAGGED_VALUE = CorePackage.CLASS__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DATA__OWNED_ELEMENT = CorePackage.CLASS__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DATA__IS_ABSTRACT = CorePackage.CLASS__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DATA__FEATURE = CorePackage.CLASS__FEATURE;

	/**
	 * The number of structural features of the '<em>Logical Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DATA_FEATURE_COUNT = CorePackage.CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CWM.MiningCore.MiningData.impl.NumericalAttributePropertiesImpl <em>Numerical Attribute Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.MiningCore.MiningData.impl.NumericalAttributePropertiesImpl
	 * @see CWM.MiningCore.MiningData.impl.MiningDataPackageImpl#getNumericalAttributeProperties()
	 * @generated
	 */
	int NUMERICAL_ATTRIBUTE_PROPERTIES = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_ATTRIBUTE_PROPERTIES__NAME = CorePackage.MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_ATTRIBUTE_PROPERTIES__VISIBILITY = CorePackage.MODEL_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_ATTRIBUTE_PROPERTIES__CLIENT_DEPENDENCY = CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_ATTRIBUTE_PROPERTIES__CONSTRAINT = CorePackage.MODEL_ELEMENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_ATTRIBUTE_PROPERTIES__IMPORTER = CorePackage.MODEL_ELEMENT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_ATTRIBUTE_PROPERTIES__NAMESPACE = CorePackage.MODEL_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_ATTRIBUTE_PROPERTIES__TAGGED_VALUE = CorePackage.MODEL_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_ATTRIBUTE_PROPERTIES__LOWER_BOUND = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_ATTRIBUTE_PROPERTIES__UPPER_BOUND = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Discrete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_ATTRIBUTE_PROPERTIES__IS_DISCRETE = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Cyclic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_ATTRIBUTE_PROPERTIES__IS_CYCLIC = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Anchor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_ATTRIBUTE_PROPERTIES__ANCHOR = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Cycle Begin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_ATTRIBUTE_PROPERTIES__CYCLE_BEGIN = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Cycle End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_ATTRIBUTE_PROPERTIES__CYCLE_END = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Discrete Step Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_ATTRIBUTE_PROPERTIES__DISCRETE_STEP_SIZE = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Numerical Attribute Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_ATTRIBUTE_PROPERTIES_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link CWM.MiningCore.MiningData.impl.OrdinalAttributePropertiesImpl <em>Ordinal Attribute Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.MiningCore.MiningData.impl.OrdinalAttributePropertiesImpl
	 * @see CWM.MiningCore.MiningData.impl.MiningDataPackageImpl#getOrdinalAttributeProperties()
	 * @generated
	 */
	int ORDINAL_ATTRIBUTE_PROPERTIES = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDINAL_ATTRIBUTE_PROPERTIES__NAME = CATEGORICAL_ATTRIBUTE_PROPERTIES__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDINAL_ATTRIBUTE_PROPERTIES__VISIBILITY = CATEGORICAL_ATTRIBUTE_PROPERTIES__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDINAL_ATTRIBUTE_PROPERTIES__CLIENT_DEPENDENCY = CATEGORICAL_ATTRIBUTE_PROPERTIES__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDINAL_ATTRIBUTE_PROPERTIES__CONSTRAINT = CATEGORICAL_ATTRIBUTE_PROPERTIES__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDINAL_ATTRIBUTE_PROPERTIES__IMPORTER = CATEGORICAL_ATTRIBUTE_PROPERTIES__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDINAL_ATTRIBUTE_PROPERTIES__NAMESPACE = CATEGORICAL_ATTRIBUTE_PROPERTIES__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDINAL_ATTRIBUTE_PROPERTIES__TAGGED_VALUE = CATEGORICAL_ATTRIBUTE_PROPERTIES__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDINAL_ATTRIBUTE_PROPERTIES__CATEGORY = CATEGORICAL_ATTRIBUTE_PROPERTIES__CATEGORY;

	/**
	 * The feature id for the '<em><b>Taxonomy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDINAL_ATTRIBUTE_PROPERTIES__TAXONOMY = CATEGORICAL_ATTRIBUTE_PROPERTIES__TAXONOMY;

	/**
	 * The feature id for the '<em><b>Order Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDINAL_ATTRIBUTE_PROPERTIES__ORDER_TYPE = CATEGORICAL_ATTRIBUTE_PROPERTIES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Cyclic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDINAL_ATTRIBUTE_PROPERTIES__IS_CYCLIC = CATEGORICAL_ATTRIBUTE_PROPERTIES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ordinal Attribute Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDINAL_ATTRIBUTE_PROPERTIES_FEATURE_COUNT = CATEGORICAL_ATTRIBUTE_PROPERTIES_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link CWM.MiningCore.MiningData.impl.PhysicalDataImpl <em>Physical Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.MiningCore.MiningData.impl.PhysicalDataImpl
	 * @see CWM.MiningCore.MiningData.impl.MiningDataPackageImpl#getPhysicalData()
	 * @generated
	 */
	int PHYSICAL_DATA = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DATA__NAME = CorePackage.MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DATA__VISIBILITY = CorePackage.MODEL_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DATA__CLIENT_DEPENDENCY = CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DATA__CONSTRAINT = CorePackage.MODEL_ELEMENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DATA__IMPORTER = CorePackage.MODEL_ELEMENT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DATA__NAMESPACE = CorePackage.MODEL_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DATA__TAGGED_VALUE = CorePackage.MODEL_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DATA__SOURCE = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Physical Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DATA_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CWM.MiningCore.MiningData.impl.PivotAttributeAssignmentImpl <em>Pivot Attribute Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.MiningCore.MiningData.impl.PivotAttributeAssignmentImpl
	 * @see CWM.MiningCore.MiningData.impl.MiningDataPackageImpl#getPivotAttributeAssignment()
	 * @generated
	 */
	int PIVOT_ATTRIBUTE_ASSIGNMENT = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIVOT_ATTRIBUTE_ASSIGNMENT__NAME = ATTRIBUTE_ASSIGNMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIVOT_ATTRIBUTE_ASSIGNMENT__VISIBILITY = ATTRIBUTE_ASSIGNMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIVOT_ATTRIBUTE_ASSIGNMENT__CLIENT_DEPENDENCY = ATTRIBUTE_ASSIGNMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIVOT_ATTRIBUTE_ASSIGNMENT__CONSTRAINT = ATTRIBUTE_ASSIGNMENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIVOT_ATTRIBUTE_ASSIGNMENT__IMPORTER = ATTRIBUTE_ASSIGNMENT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIVOT_ATTRIBUTE_ASSIGNMENT__NAMESPACE = ATTRIBUTE_ASSIGNMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIVOT_ATTRIBUTE_ASSIGNMENT__TAGGED_VALUE = ATTRIBUTE_ASSIGNMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Order Id Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIVOT_ATTRIBUTE_ASSIGNMENT__ORDER_ID_ATTRIBUTE = ATTRIBUTE_ASSIGNMENT__ORDER_ID_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Logical Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIVOT_ATTRIBUTE_ASSIGNMENT__LOGICAL_ATTRIBUTE = ATTRIBUTE_ASSIGNMENT__LOGICAL_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Set Id Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIVOT_ATTRIBUTE_ASSIGNMENT__SET_ID_ATTRIBUTE = ATTRIBUTE_ASSIGNMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIVOT_ATTRIBUTE_ASSIGNMENT__NAME_ATTRIBUTE = ATTRIBUTE_ASSIGNMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIVOT_ATTRIBUTE_ASSIGNMENT__VALUE_ATTRIBUTE = ATTRIBUTE_ASSIGNMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pivot Attribute Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIVOT_ATTRIBUTE_ASSIGNMENT_FEATURE_COUNT = ATTRIBUTE_ASSIGNMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link CWM.MiningCore.MiningData.impl.ReversePivotAttributeAssignmentImpl <em>Reverse Pivot Attribute Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.MiningCore.MiningData.impl.ReversePivotAttributeAssignmentImpl
	 * @see CWM.MiningCore.MiningData.impl.MiningDataPackageImpl#getReversePivotAttributeAssignment()
	 * @generated
	 */
	int REVERSE_PIVOT_ATTRIBUTE_ASSIGNMENT = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVERSE_PIVOT_ATTRIBUTE_ASSIGNMENT__NAME = ATTRIBUTE_ASSIGNMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVERSE_PIVOT_ATTRIBUTE_ASSIGNMENT__VISIBILITY = ATTRIBUTE_ASSIGNMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVERSE_PIVOT_ATTRIBUTE_ASSIGNMENT__CLIENT_DEPENDENCY = ATTRIBUTE_ASSIGNMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVERSE_PIVOT_ATTRIBUTE_ASSIGNMENT__CONSTRAINT = ATTRIBUTE_ASSIGNMENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVERSE_PIVOT_ATTRIBUTE_ASSIGNMENT__IMPORTER = ATTRIBUTE_ASSIGNMENT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVERSE_PIVOT_ATTRIBUTE_ASSIGNMENT__NAMESPACE = ATTRIBUTE_ASSIGNMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVERSE_PIVOT_ATTRIBUTE_ASSIGNMENT__TAGGED_VALUE = ATTRIBUTE_ASSIGNMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Order Id Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVERSE_PIVOT_ATTRIBUTE_ASSIGNMENT__ORDER_ID_ATTRIBUTE = ATTRIBUTE_ASSIGNMENT__ORDER_ID_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Logical Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVERSE_PIVOT_ATTRIBUTE_ASSIGNMENT__LOGICAL_ATTRIBUTE = ATTRIBUTE_ASSIGNMENT__LOGICAL_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Selector Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVERSE_PIVOT_ATTRIBUTE_ASSIGNMENT__SELECTOR_ATTRIBUTE = ATTRIBUTE_ASSIGNMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attribute Selection Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVERSE_PIVOT_ATTRIBUTE_ASSIGNMENT__ATTRIBUTE_SELECTION_FUNCTION = ATTRIBUTE_ASSIGNMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value Selection Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVERSE_PIVOT_ATTRIBUTE_ASSIGNMENT__VALUE_SELECTION_FUNCTION = ATTRIBUTE_ASSIGNMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Reverse Pivot Attribute Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVERSE_PIVOT_ATTRIBUTE_ASSIGNMENT_FEATURE_COUNT = ATTRIBUTE_ASSIGNMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link CWM.MiningCore.MiningData.impl.SetAttributeAssignmentImpl <em>Set Attribute Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.MiningCore.MiningData.impl.SetAttributeAssignmentImpl
	 * @see CWM.MiningCore.MiningData.impl.MiningDataPackageImpl#getSetAttributeAssignment()
	 * @generated
	 */
	int SET_ATTRIBUTE_ASSIGNMENT = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ATTRIBUTE_ASSIGNMENT__NAME = ATTRIBUTE_ASSIGNMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ATTRIBUTE_ASSIGNMENT__VISIBILITY = ATTRIBUTE_ASSIGNMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ATTRIBUTE_ASSIGNMENT__CLIENT_DEPENDENCY = ATTRIBUTE_ASSIGNMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ATTRIBUTE_ASSIGNMENT__CONSTRAINT = ATTRIBUTE_ASSIGNMENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ATTRIBUTE_ASSIGNMENT__IMPORTER = ATTRIBUTE_ASSIGNMENT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ATTRIBUTE_ASSIGNMENT__NAMESPACE = ATTRIBUTE_ASSIGNMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ATTRIBUTE_ASSIGNMENT__TAGGED_VALUE = ATTRIBUTE_ASSIGNMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Order Id Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ATTRIBUTE_ASSIGNMENT__ORDER_ID_ATTRIBUTE = ATTRIBUTE_ASSIGNMENT__ORDER_ID_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Logical Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ATTRIBUTE_ASSIGNMENT__LOGICAL_ATTRIBUTE = ATTRIBUTE_ASSIGNMENT__LOGICAL_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Set Id Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ATTRIBUTE_ASSIGNMENT__SET_ID_ATTRIBUTE = ATTRIBUTE_ASSIGNMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Member Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ATTRIBUTE_ASSIGNMENT__MEMBER_ATTRIBUTE = ATTRIBUTE_ASSIGNMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Set Attribute Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ATTRIBUTE_ASSIGNMENT_FEATURE_COUNT = ATTRIBUTE_ASSIGNMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link CWM.MiningCore.MiningData.impl.CategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.MiningCore.MiningData.impl.CategoryImpl
	 * @see CWM.MiningCore.MiningData.impl.MiningDataPackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__NAME = CorePackage.MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__VISIBILITY = CorePackage.MODEL_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__CLIENT_DEPENDENCY = CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__CONSTRAINT = CorePackage.MODEL_ELEMENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__IMPORTER = CorePackage.MODEL_ELEMENT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__NAMESPACE = CorePackage.MODEL_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__TAGGED_VALUE = CorePackage.MODEL_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__VALUE = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Null Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__IS_NULL_CATEGORY = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__DISPLAY_NAME = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__PROPERTY = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Prior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__PRIOR = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link CWM.MiningCore.MiningData.impl.CategoryMapImpl <em>Category Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.MiningCore.MiningData.impl.CategoryMapImpl
	 * @see CWM.MiningCore.MiningData.impl.MiningDataPackageImpl#getCategoryMap()
	 * @generated
	 */
	int CATEGORY_MAP = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MAP__NAME = CorePackage.MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MAP__VISIBILITY = CorePackage.MODEL_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MAP__CLIENT_DEPENDENCY = CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MAP__CONSTRAINT = CorePackage.MODEL_ELEMENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MAP__IMPORTER = CorePackage.MODEL_ELEMENT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MAP__NAMESPACE = CorePackage.MODEL_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MAP__TAGGED_VALUE = CorePackage.MODEL_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Is Multi Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MAP__IS_MULTI_LEVEL = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Item Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MAP__IS_ITEM_MAP = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Category Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MAP_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link CWM.MiningCore.MiningData.impl.CategoryMapObjectImpl <em>Category Map Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.MiningCore.MiningData.impl.CategoryMapObjectImpl
	 * @see CWM.MiningCore.MiningData.impl.MiningDataPackageImpl#getCategoryMapObject()
	 * @generated
	 */
	int CATEGORY_MAP_OBJECT = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MAP_OBJECT__NAME = CorePackage.MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MAP_OBJECT__VISIBILITY = CorePackage.MODEL_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MAP_OBJECT__CLIENT_DEPENDENCY = CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MAP_OBJECT__CONSTRAINT = CorePackage.MODEL_ELEMENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MAP_OBJECT__IMPORTER = CorePackage.MODEL_ELEMENT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MAP_OBJECT__NAMESPACE = CorePackage.MODEL_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MAP_OBJECT__TAGGED_VALUE = CorePackage.MODEL_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Is Multi Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MAP_OBJECT__IS_MULTI_LEVEL = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Item Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MAP_OBJECT__IS_ITEM_MAP = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MAP_OBJECT__ENTRY = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Category Map Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MAP_OBJECT_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link CWM.MiningCore.MiningData.impl.CategoryMapObjectEntryImpl <em>Category Map Object Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.MiningCore.MiningData.impl.CategoryMapObjectEntryImpl
	 * @see CWM.MiningCore.MiningData.impl.MiningDataPackageImpl#getCategoryMapObjectEntry()
	 * @generated
	 */
	int CATEGORY_MAP_OBJECT_ENTRY = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MAP_OBJECT_ENTRY__NAME = CorePackage.MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MAP_OBJECT_ENTRY__VISIBILITY = CorePackage.MODEL_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MAP_OBJECT_ENTRY__CLIENT_DEPENDENCY = CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MAP_OBJECT_ENTRY__CONSTRAINT = CorePackage.MODEL_ELEMENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MAP_OBJECT_ENTRY__IMPORTER = CorePackage.MODEL_ELEMENT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MAP_OBJECT_ENTRY__NAMESPACE = CorePackage.MODEL_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MAP_OBJECT_ENTRY__TAGGED_VALUE = CorePackage.MODEL_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MAP_OBJECT_ENTRY__CHILD = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MAP_OBJECT_ENTRY__PARENT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Graph Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MAP_OBJECT_ENTRY__GRAPH_ID = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Category Map Object Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MAP_OBJECT_ENTRY_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link CWM.MiningCore.MiningData.impl.CategoryMapTableImpl <em>Category Map Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.MiningCore.MiningData.impl.CategoryMapTableImpl
	 * @see CWM.MiningCore.MiningData.impl.MiningDataPackageImpl#getCategoryMapTable()
	 * @generated
	 */
	int CATEGORY_MAP_TABLE = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MAP_TABLE__NAME = CorePackage.MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MAP_TABLE__VISIBILITY = CorePackage.MODEL_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MAP_TABLE__CLIENT_DEPENDENCY = CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MAP_TABLE__CONSTRAINT = CorePackage.MODEL_ELEMENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MAP_TABLE__IMPORTER = CorePackage.MODEL_ELEMENT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MAP_TABLE__NAMESPACE = CorePackage.MODEL_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MAP_TABLE__TAGGED_VALUE = CorePackage.MODEL_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Is Multi Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MAP_TABLE__IS_MULTI_LEVEL = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Item Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MAP_TABLE__IS_ITEM_MAP = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Child Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MAP_TABLE__CHILD_ATTRIBUTE = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MAP_TABLE__PARENT_ATTRIBUTE = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Graph Id Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MAP_TABLE__GRAPH_ID_ATTRIBUTE = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MAP_TABLE__TABLE = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Category Map Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MAP_TABLE_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link CWM.MiningCore.MiningData.impl.CategoryMatrixImpl <em>Category Matrix</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.MiningCore.MiningData.impl.CategoryMatrixImpl
	 * @see CWM.MiningCore.MiningData.impl.MiningDataPackageImpl#getCategoryMatrix()
	 * @generated
	 */
	int CATEGORY_MATRIX = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MATRIX__NAME = CorePackage.MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MATRIX__VISIBILITY = CorePackage.MODEL_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MATRIX__CLIENT_DEPENDENCY = CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MATRIX__CONSTRAINT = CorePackage.MODEL_ELEMENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MATRIX__IMPORTER = CorePackage.MODEL_ELEMENT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MATRIX__NAMESPACE = CorePackage.MODEL_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MATRIX__TAGGED_VALUE = CorePackage.MODEL_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Diagonal Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MATRIX__DIAGONAL_DEFAULT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Off Diagonal Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MATRIX__OFF_DIAGONAL_DEFAULT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MATRIX__KIND = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MATRIX__CATEGORY = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Category Matrix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MATRIX_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link CWM.MiningCore.MiningData.impl.CategoryMatrixEntryImpl <em>Category Matrix Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.MiningCore.MiningData.impl.CategoryMatrixEntryImpl
	 * @see CWM.MiningCore.MiningData.impl.MiningDataPackageImpl#getCategoryMatrixEntry()
	 * @generated
	 */
	int CATEGORY_MATRIX_ENTRY = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MATRIX_ENTRY__NAME = CorePackage.MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MATRIX_ENTRY__VISIBILITY = CorePackage.MODEL_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MATRIX_ENTRY__CLIENT_DEPENDENCY = CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MATRIX_ENTRY__CONSTRAINT = CorePackage.MODEL_ELEMENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MATRIX_ENTRY__IMPORTER = CorePackage.MODEL_ELEMENT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MATRIX_ENTRY__NAMESPACE = CorePackage.MODEL_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MATRIX_ENTRY__TAGGED_VALUE = CorePackage.MODEL_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Row Index</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MATRIX_ENTRY__ROW_INDEX = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Column Index</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MATRIX_ENTRY__COLUMN_INDEX = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MATRIX_ENTRY__VALUE = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Category Matrix Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MATRIX_ENTRY_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link CWM.MiningCore.MiningData.impl.CategoryMatrixObjectImpl <em>Category Matrix Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.MiningCore.MiningData.impl.CategoryMatrixObjectImpl
	 * @see CWM.MiningCore.MiningData.impl.MiningDataPackageImpl#getCategoryMatrixObject()
	 * @generated
	 */
	int CATEGORY_MATRIX_OBJECT = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MATRIX_OBJECT__NAME = CATEGORY_MATRIX__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MATRIX_OBJECT__VISIBILITY = CATEGORY_MATRIX__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MATRIX_OBJECT__CLIENT_DEPENDENCY = CATEGORY_MATRIX__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MATRIX_OBJECT__CONSTRAINT = CATEGORY_MATRIX__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MATRIX_OBJECT__IMPORTER = CATEGORY_MATRIX__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MATRIX_OBJECT__NAMESPACE = CATEGORY_MATRIX__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MATRIX_OBJECT__TAGGED_VALUE = CATEGORY_MATRIX__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Diagonal Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MATRIX_OBJECT__DIAGONAL_DEFAULT = CATEGORY_MATRIX__DIAGONAL_DEFAULT;

	/**
	 * The feature id for the '<em><b>Off Diagonal Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MATRIX_OBJECT__OFF_DIAGONAL_DEFAULT = CATEGORY_MATRIX__OFF_DIAGONAL_DEFAULT;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MATRIX_OBJECT__KIND = CATEGORY_MATRIX__KIND;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MATRIX_OBJECT__CATEGORY = CATEGORY_MATRIX__CATEGORY;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MATRIX_OBJECT__ENTRY = CATEGORY_MATRIX_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Category Matrix Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MATRIX_OBJECT_FEATURE_COUNT = CATEGORY_MATRIX_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CWM.MiningCore.MiningData.impl.CategoryMatrixTableImpl <em>Category Matrix Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.MiningCore.MiningData.impl.CategoryMatrixTableImpl
	 * @see CWM.MiningCore.MiningData.impl.MiningDataPackageImpl#getCategoryMatrixTable()
	 * @generated
	 */
	int CATEGORY_MATRIX_TABLE = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MATRIX_TABLE__NAME = CATEGORY_MATRIX__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MATRIX_TABLE__VISIBILITY = CATEGORY_MATRIX__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MATRIX_TABLE__CLIENT_DEPENDENCY = CATEGORY_MATRIX__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MATRIX_TABLE__CONSTRAINT = CATEGORY_MATRIX__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MATRIX_TABLE__IMPORTER = CATEGORY_MATRIX__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MATRIX_TABLE__NAMESPACE = CATEGORY_MATRIX__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MATRIX_TABLE__TAGGED_VALUE = CATEGORY_MATRIX__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Diagonal Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MATRIX_TABLE__DIAGONAL_DEFAULT = CATEGORY_MATRIX__DIAGONAL_DEFAULT;

	/**
	 * The feature id for the '<em><b>Off Diagonal Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MATRIX_TABLE__OFF_DIAGONAL_DEFAULT = CATEGORY_MATRIX__OFF_DIAGONAL_DEFAULT;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MATRIX_TABLE__KIND = CATEGORY_MATRIX__KIND;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MATRIX_TABLE__CATEGORY = CATEGORY_MATRIX__CATEGORY;

	/**
	 * The feature id for the '<em><b>Row Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MATRIX_TABLE__ROW_ATTRIBUTE = CATEGORY_MATRIX_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Column Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MATRIX_TABLE__COLUMN_ATTRIBUTE = CATEGORY_MATRIX_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MATRIX_TABLE__VALUE_ATTRIBUTE = CATEGORY_MATRIX_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MATRIX_TABLE__SOURCE = CATEGORY_MATRIX_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Category Matrix Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_MATRIX_TABLE_FEATURE_COUNT = CATEGORY_MATRIX_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link CWM.MiningCore.MiningData.impl.CategoryTaxonomyImpl <em>Category Taxonomy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.MiningCore.MiningData.impl.CategoryTaxonomyImpl
	 * @see CWM.MiningCore.MiningData.impl.MiningDataPackageImpl#getCategoryTaxonomy()
	 * @generated
	 */
	int CATEGORY_TAXONOMY = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_TAXONOMY__NAME = CorePackage.MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_TAXONOMY__VISIBILITY = CorePackage.MODEL_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_TAXONOMY__CLIENT_DEPENDENCY = CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_TAXONOMY__CONSTRAINT = CorePackage.MODEL_ELEMENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_TAXONOMY__IMPORTER = CorePackage.MODEL_ELEMENT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_TAXONOMY__NAMESPACE = CorePackage.MODEL_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_TAXONOMY__TAGGED_VALUE = CorePackage.MODEL_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Category Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_TAXONOMY__CATEGORY_MAP = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Root Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_TAXONOMY__ROOT_CATEGORY = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Category Taxonomy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_TAXONOMY_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link CWM.MiningCore.MiningData.impl.MiningData_containerImpl <em>Mining Data container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.MiningCore.MiningData.impl.MiningData_containerImpl
	 * @see CWM.MiningCore.MiningData.impl.MiningDataPackageImpl#getMiningData_container()
	 * @generated
	 */
	int MINING_DATA_CONTAINER = 25;

	/**
	 * The feature id for the '<em><b>Attribute Assignment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_DATA_CONTAINER__ATTRIBUTE_ASSIGNMENT = 0;

	/**
	 * The feature id for the '<em><b>Attribute Assignment Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_DATA_CONTAINER__ATTRIBUTE_ASSIGNMENT_SET = 1;

	/**
	 * The feature id for the '<em><b>Attribute Usage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_DATA_CONTAINER__ATTRIBUTE_USAGE = 2;

	/**
	 * The feature id for the '<em><b>Attribute Usage Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_DATA_CONTAINER__ATTRIBUTE_USAGE_SET = 3;

	/**
	 * The feature id for the '<em><b>Categorical Attribute Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_DATA_CONTAINER__CATEGORICAL_ATTRIBUTE_PROPERTIES = 4;

	/**
	 * The feature id for the '<em><b>Direct Attribute Assignment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_DATA_CONTAINER__DIRECT_ATTRIBUTE_ASSIGNMENT = 5;

	/**
	 * The feature id for the '<em><b>Logical Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_DATA_CONTAINER__LOGICAL_ATTRIBUTE = 6;

	/**
	 * The feature id for the '<em><b>Logical Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_DATA_CONTAINER__LOGICAL_DATA = 7;

	/**
	 * The feature id for the '<em><b>Mining Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_DATA_CONTAINER__MINING_ATTRIBUTE = 8;

	/**
	 * The feature id for the '<em><b>Numerical Attribute Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_DATA_CONTAINER__NUMERICAL_ATTRIBUTE_PROPERTIES = 9;

	/**
	 * The feature id for the '<em><b>Ordinal Attribute Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_DATA_CONTAINER__ORDINAL_ATTRIBUTE_PROPERTIES = 10;

	/**
	 * The feature id for the '<em><b>Physical Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_DATA_CONTAINER__PHYSICAL_DATA = 11;

	/**
	 * The feature id for the '<em><b>Pivot Attribute Assignment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_DATA_CONTAINER__PIVOT_ATTRIBUTE_ASSIGNMENT = 12;

	/**
	 * The feature id for the '<em><b>Reverse Pivot Attribute Assignment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_DATA_CONTAINER__REVERSE_PIVOT_ATTRIBUTE_ASSIGNMENT = 13;

	/**
	 * The feature id for the '<em><b>Set Attribute Assignment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_DATA_CONTAINER__SET_ATTRIBUTE_ASSIGNMENT = 14;

	/**
	 * The feature id for the '<em><b>Category</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_DATA_CONTAINER__CATEGORY = 15;

	/**
	 * The feature id for the '<em><b>Category Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_DATA_CONTAINER__CATEGORY_MAP = 16;

	/**
	 * The feature id for the '<em><b>Category Map Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_DATA_CONTAINER__CATEGORY_MAP_OBJECT = 17;

	/**
	 * The feature id for the '<em><b>Category Map Object Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_DATA_CONTAINER__CATEGORY_MAP_OBJECT_ENTRY = 18;

	/**
	 * The feature id for the '<em><b>Category Map Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_DATA_CONTAINER__CATEGORY_MAP_TABLE = 19;

	/**
	 * The feature id for the '<em><b>Category Matrix</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_DATA_CONTAINER__CATEGORY_MATRIX = 20;

	/**
	 * The feature id for the '<em><b>Category Matrix Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_DATA_CONTAINER__CATEGORY_MATRIX_ENTRY = 21;

	/**
	 * The feature id for the '<em><b>Category Matrix Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_DATA_CONTAINER__CATEGORY_MATRIX_OBJECT = 22;

	/**
	 * The feature id for the '<em><b>Category Matrix Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_DATA_CONTAINER__CATEGORY_MATRIX_TABLE = 23;

	/**
	 * The feature id for the '<em><b>Category Taxonomy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_DATA_CONTAINER__CATEGORY_TAXONOMY = 24;

	/**
	 * The number of structural features of the '<em>Mining Data container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_DATA_CONTAINER_FEATURE_COUNT = 25;

	/**
	 * The meta object id for the '{@link CWM.MiningCore.MiningData.AttributeSelectionFunction <em>Attribute Selection Function</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.MiningCore.MiningData.AttributeSelectionFunction
	 * @see CWM.MiningCore.MiningData.impl.MiningDataPackageImpl#getAttributeSelectionFunction()
	 * @generated
	 */
	int ATTRIBUTE_SELECTION_FUNCTION = 26;

	/**
	 * The meta object id for the '{@link CWM.MiningCore.MiningData.AttributeType <em>Attribute Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.MiningCore.MiningData.AttributeType
	 * @see CWM.MiningCore.MiningData.impl.MiningDataPackageImpl#getAttributeType()
	 * @generated
	 */
	int ATTRIBUTE_TYPE = 27;

	/**
	 * The meta object id for the '{@link CWM.MiningCore.MiningData.OrderType <em>Order Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.MiningCore.MiningData.OrderType
	 * @see CWM.MiningCore.MiningData.impl.MiningDataPackageImpl#getOrderType()
	 * @generated
	 */
	int ORDER_TYPE = 28;

	/**
	 * The meta object id for the '{@link CWM.MiningCore.MiningData.UsageOption <em>Usage Option</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.MiningCore.MiningData.UsageOption
	 * @see CWM.MiningCore.MiningData.impl.MiningDataPackageImpl#getUsageOption()
	 * @generated
	 */
	int USAGE_OPTION = 29;

	/**
	 * The meta object id for the '{@link CWM.MiningCore.MiningData.ValueSelectionFunction <em>Value Selection Function</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.MiningCore.MiningData.ValueSelectionFunction
	 * @see CWM.MiningCore.MiningData.impl.MiningDataPackageImpl#getValueSelectionFunction()
	 * @generated
	 */
	int VALUE_SELECTION_FUNCTION = 30;

	/**
	 * The meta object id for the '{@link CWM.MiningCore.MiningData.CategoryProperty <em>Category Property</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.MiningCore.MiningData.CategoryProperty
	 * @see CWM.MiningCore.MiningData.impl.MiningDataPackageImpl#getCategoryProperty()
	 * @generated
	 */
	int CATEGORY_PROPERTY = 31;

	/**
	 * The meta object id for the '{@link CWM.MiningCore.MiningData.MatrixProperty <em>Matrix Property</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.MiningCore.MiningData.MatrixProperty
	 * @see CWM.MiningCore.MiningData.impl.MiningDataPackageImpl#getMatrixProperty()
	 * @generated
	 */
	int MATRIX_PROPERTY = 32;

	/**
	 * The meta object id for the '<em>Double</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see CWM.MiningCore.MiningData.impl.MiningDataPackageImpl#getDouble()
	 * @generated
	 */
	int DOUBLE = 33;


	/**
	 * Returns the meta object for class '{@link CWM.MiningCore.MiningData.AttributeAssignment <em>Attribute Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Assignment</em>'.
	 * @see CWM.MiningCore.MiningData.AttributeAssignment
	 * @generated
	 */
	EClass getAttributeAssignment();

	/**
	 * Returns the meta object for the reference list '{@link CWM.MiningCore.MiningData.AttributeAssignment#getOrderIdAttribute <em>Order Id Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Order Id Attribute</em>'.
	 * @see CWM.MiningCore.MiningData.AttributeAssignment#getOrderIdAttribute()
	 * @see #getAttributeAssignment()
	 * @generated
	 */
	EReference getAttributeAssignment_OrderIdAttribute();

	/**
	 * Returns the meta object for the reference list '{@link CWM.MiningCore.MiningData.AttributeAssignment#getLogicalAttribute <em>Logical Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Logical Attribute</em>'.
	 * @see CWM.MiningCore.MiningData.AttributeAssignment#getLogicalAttribute()
	 * @see #getAttributeAssignment()
	 * @generated
	 */
	EReference getAttributeAssignment_LogicalAttribute();

	/**
	 * Returns the meta object for class '{@link CWM.MiningCore.MiningData.AttributeAssignmentSet <em>Attribute Assignment Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Assignment Set</em>'.
	 * @see CWM.MiningCore.MiningData.AttributeAssignmentSet
	 * @generated
	 */
	EClass getAttributeAssignmentSet();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.MiningCore.MiningData.AttributeAssignmentSet#getAssignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assignment</em>'.
	 * @see CWM.MiningCore.MiningData.AttributeAssignmentSet#getAssignment()
	 * @see #getAttributeAssignmentSet()
	 * @generated
	 */
	EReference getAttributeAssignmentSet_Assignment();

	/**
	 * Returns the meta object for class '{@link CWM.MiningCore.MiningData.AttributeUsage <em>Attribute Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Usage</em>'.
	 * @see CWM.MiningCore.MiningData.AttributeUsage
	 * @generated
	 */
	EClass getAttributeUsage();

	/**
	 * Returns the meta object for the attribute '{@link CWM.MiningCore.MiningData.AttributeUsage#getUsage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage</em>'.
	 * @see CWM.MiningCore.MiningData.AttributeUsage#getUsage()
	 * @see #getAttributeUsage()
	 * @generated
	 */
	EAttribute getAttributeUsage_Usage();

	/**
	 * Returns the meta object for the attribute '{@link CWM.MiningCore.MiningData.AttributeUsage#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see CWM.MiningCore.MiningData.AttributeUsage#getWeight()
	 * @see #getAttributeUsage()
	 * @generated
	 */
	EAttribute getAttributeUsage_Weight();

	/**
	 * Returns the meta object for the reference list '{@link CWM.MiningCore.MiningData.AttributeUsage#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attribute</em>'.
	 * @see CWM.MiningCore.MiningData.AttributeUsage#getAttribute()
	 * @see #getAttributeUsage()
	 * @generated
	 */
	EReference getAttributeUsage_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link CWM.MiningCore.MiningData.AttributeUsage#getSuppressDiscretization <em>Suppress Discretization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suppress Discretization</em>'.
	 * @see CWM.MiningCore.MiningData.AttributeUsage#getSuppressDiscretization()
	 * @see #getAttributeUsage()
	 * @generated
	 */
	EAttribute getAttributeUsage_SuppressDiscretization();

	/**
	 * Returns the meta object for the attribute '{@link CWM.MiningCore.MiningData.AttributeUsage#getSuppressNormalization <em>Suppress Normalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suppress Normalization</em>'.
	 * @see CWM.MiningCore.MiningData.AttributeUsage#getSuppressNormalization()
	 * @see #getAttributeUsage()
	 * @generated
	 */
	EAttribute getAttributeUsage_SuppressNormalization();

	/**
	 * Returns the meta object for class '{@link CWM.MiningCore.MiningData.AttributeUsageSet <em>Attribute Usage Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Usage Set</em>'.
	 * @see CWM.MiningCore.MiningData.AttributeUsageSet
	 * @generated
	 */
	EClass getAttributeUsageSet();

	/**
	 * Returns the meta object for class '{@link CWM.MiningCore.MiningData.CategoricalAttributeProperties <em>Categorical Attribute Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Categorical Attribute Properties</em>'.
	 * @see CWM.MiningCore.MiningData.CategoricalAttributeProperties
	 * @generated
	 */
	EClass getCategoricalAttributeProperties();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.MiningCore.MiningData.CategoricalAttributeProperties#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Category</em>'.
	 * @see CWM.MiningCore.MiningData.CategoricalAttributeProperties#getCategory()
	 * @see #getCategoricalAttributeProperties()
	 * @generated
	 */
	EReference getCategoricalAttributeProperties_Category();

	/**
	 * Returns the meta object for the reference '{@link CWM.MiningCore.MiningData.CategoricalAttributeProperties#getTaxonomy <em>Taxonomy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Taxonomy</em>'.
	 * @see CWM.MiningCore.MiningData.CategoricalAttributeProperties#getTaxonomy()
	 * @see #getCategoricalAttributeProperties()
	 * @generated
	 */
	EReference getCategoricalAttributeProperties_Taxonomy();

	/**
	 * Returns the meta object for class '{@link CWM.MiningCore.MiningData.DirectAttributeAssignment <em>Direct Attribute Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Direct Attribute Assignment</em>'.
	 * @see CWM.MiningCore.MiningData.DirectAttributeAssignment
	 * @generated
	 */
	EClass getDirectAttributeAssignment();

	/**
	 * Returns the meta object for the reference '{@link CWM.MiningCore.MiningData.DirectAttributeAssignment#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see CWM.MiningCore.MiningData.DirectAttributeAssignment#getAttribute()
	 * @see #getDirectAttributeAssignment()
	 * @generated
	 */
	EReference getDirectAttributeAssignment_Attribute();

	/**
	 * Returns the meta object for class '{@link CWM.MiningCore.MiningData.LogicalAttribute <em>Logical Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Attribute</em>'.
	 * @see CWM.MiningCore.MiningData.LogicalAttribute
	 * @generated
	 */
	EClass getLogicalAttribute();

	/**
	 * Returns the meta object for the attribute '{@link CWM.MiningCore.MiningData.LogicalAttribute#getIsSetValued <em>Is Set Valued</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Set Valued</em>'.
	 * @see CWM.MiningCore.MiningData.LogicalAttribute#getIsSetValued()
	 * @see #getLogicalAttribute()
	 * @generated
	 */
	EAttribute getLogicalAttribute_IsSetValued();

	/**
	 * Returns the meta object for the containment reference '{@link CWM.MiningCore.MiningData.LogicalAttribute#getCategoricalProperties <em>Categorical Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Categorical Properties</em>'.
	 * @see CWM.MiningCore.MiningData.LogicalAttribute#getCategoricalProperties()
	 * @see #getLogicalAttribute()
	 * @generated
	 */
	EReference getLogicalAttribute_CategoricalProperties();

	/**
	 * Returns the meta object for the containment reference '{@link CWM.MiningCore.MiningData.LogicalAttribute#getNumericalProperties <em>Numerical Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Numerical Properties</em>'.
	 * @see CWM.MiningCore.MiningData.LogicalAttribute#getNumericalProperties()
	 * @see #getLogicalAttribute()
	 * @generated
	 */
	EReference getLogicalAttribute_NumericalProperties();

	/**
	 * Returns the meta object for class '{@link CWM.MiningCore.MiningData.LogicalData <em>Logical Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Data</em>'.
	 * @see CWM.MiningCore.MiningData.LogicalData
	 * @generated
	 */
	EClass getLogicalData();

	/**
	 * Returns the meta object for class '{@link CWM.MiningCore.MiningData.MiningAttribute <em>Mining Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mining Attribute</em>'.
	 * @see CWM.MiningCore.MiningData.MiningAttribute
	 * @generated
	 */
	EClass getMiningAttribute();

	/**
	 * Returns the meta object for the attribute '{@link CWM.MiningCore.MiningData.MiningAttribute#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see CWM.MiningCore.MiningData.MiningAttribute#getDisplayName()
	 * @see #getMiningAttribute()
	 * @generated
	 */
	EAttribute getMiningAttribute_DisplayName();

	/**
	 * Returns the meta object for the attribute '{@link CWM.MiningCore.MiningData.MiningAttribute#getAttributeType <em>Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute Type</em>'.
	 * @see CWM.MiningCore.MiningData.MiningAttribute#getAttributeType()
	 * @see #getMiningAttribute()
	 * @generated
	 */
	EAttribute getMiningAttribute_AttributeType();

	/**
	 * Returns the meta object for class '{@link CWM.MiningCore.MiningData.NumericalAttributeProperties <em>Numerical Attribute Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numerical Attribute Properties</em>'.
	 * @see CWM.MiningCore.MiningData.NumericalAttributeProperties
	 * @generated
	 */
	EClass getNumericalAttributeProperties();

	/**
	 * Returns the meta object for the attribute '{@link CWM.MiningCore.MiningData.NumericalAttributeProperties#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see CWM.MiningCore.MiningData.NumericalAttributeProperties#getLowerBound()
	 * @see #getNumericalAttributeProperties()
	 * @generated
	 */
	EAttribute getNumericalAttributeProperties_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link CWM.MiningCore.MiningData.NumericalAttributeProperties#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see CWM.MiningCore.MiningData.NumericalAttributeProperties#getUpperBound()
	 * @see #getNumericalAttributeProperties()
	 * @generated
	 */
	EAttribute getNumericalAttributeProperties_UpperBound();

	/**
	 * Returns the meta object for the attribute '{@link CWM.MiningCore.MiningData.NumericalAttributeProperties#getIsDiscrete <em>Is Discrete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Discrete</em>'.
	 * @see CWM.MiningCore.MiningData.NumericalAttributeProperties#getIsDiscrete()
	 * @see #getNumericalAttributeProperties()
	 * @generated
	 */
	EAttribute getNumericalAttributeProperties_IsDiscrete();

	/**
	 * Returns the meta object for the attribute '{@link CWM.MiningCore.MiningData.NumericalAttributeProperties#getIsCyclic <em>Is Cyclic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Cyclic</em>'.
	 * @see CWM.MiningCore.MiningData.NumericalAttributeProperties#getIsCyclic()
	 * @see #getNumericalAttributeProperties()
	 * @generated
	 */
	EAttribute getNumericalAttributeProperties_IsCyclic();

	/**
	 * Returns the meta object for the attribute '{@link CWM.MiningCore.MiningData.NumericalAttributeProperties#getAnchor <em>Anchor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anchor</em>'.
	 * @see CWM.MiningCore.MiningData.NumericalAttributeProperties#getAnchor()
	 * @see #getNumericalAttributeProperties()
	 * @generated
	 */
	EAttribute getNumericalAttributeProperties_Anchor();

	/**
	 * Returns the meta object for the attribute '{@link CWM.MiningCore.MiningData.NumericalAttributeProperties#getCycleBegin <em>Cycle Begin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cycle Begin</em>'.
	 * @see CWM.MiningCore.MiningData.NumericalAttributeProperties#getCycleBegin()
	 * @see #getNumericalAttributeProperties()
	 * @generated
	 */
	EAttribute getNumericalAttributeProperties_CycleBegin();

	/**
	 * Returns the meta object for the attribute '{@link CWM.MiningCore.MiningData.NumericalAttributeProperties#getCycleEnd <em>Cycle End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cycle End</em>'.
	 * @see CWM.MiningCore.MiningData.NumericalAttributeProperties#getCycleEnd()
	 * @see #getNumericalAttributeProperties()
	 * @generated
	 */
	EAttribute getNumericalAttributeProperties_CycleEnd();

	/**
	 * Returns the meta object for the attribute '{@link CWM.MiningCore.MiningData.NumericalAttributeProperties#getDiscreteStepSize <em>Discrete Step Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discrete Step Size</em>'.
	 * @see CWM.MiningCore.MiningData.NumericalAttributeProperties#getDiscreteStepSize()
	 * @see #getNumericalAttributeProperties()
	 * @generated
	 */
	EAttribute getNumericalAttributeProperties_DiscreteStepSize();

	/**
	 * Returns the meta object for class '{@link CWM.MiningCore.MiningData.OrdinalAttributeProperties <em>Ordinal Attribute Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ordinal Attribute Properties</em>'.
	 * @see CWM.MiningCore.MiningData.OrdinalAttributeProperties
	 * @generated
	 */
	EClass getOrdinalAttributeProperties();

	/**
	 * Returns the meta object for the attribute '{@link CWM.MiningCore.MiningData.OrdinalAttributeProperties#getOrderType <em>Order Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Type</em>'.
	 * @see CWM.MiningCore.MiningData.OrdinalAttributeProperties#getOrderType()
	 * @see #getOrdinalAttributeProperties()
	 * @generated
	 */
	EAttribute getOrdinalAttributeProperties_OrderType();

	/**
	 * Returns the meta object for the attribute '{@link CWM.MiningCore.MiningData.OrdinalAttributeProperties#getIsCyclic <em>Is Cyclic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Cyclic</em>'.
	 * @see CWM.MiningCore.MiningData.OrdinalAttributeProperties#getIsCyclic()
	 * @see #getOrdinalAttributeProperties()
	 * @generated
	 */
	EAttribute getOrdinalAttributeProperties_IsCyclic();

	/**
	 * Returns the meta object for class '{@link CWM.MiningCore.MiningData.PhysicalData <em>Physical Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Data</em>'.
	 * @see CWM.MiningCore.MiningData.PhysicalData
	 * @generated
	 */
	EClass getPhysicalData();

	/**
	 * Returns the meta object for the reference '{@link CWM.MiningCore.MiningData.PhysicalData#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see CWM.MiningCore.MiningData.PhysicalData#getSource()
	 * @see #getPhysicalData()
	 * @generated
	 */
	EReference getPhysicalData_Source();

	/**
	 * Returns the meta object for class '{@link CWM.MiningCore.MiningData.PivotAttributeAssignment <em>Pivot Attribute Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pivot Attribute Assignment</em>'.
	 * @see CWM.MiningCore.MiningData.PivotAttributeAssignment
	 * @generated
	 */
	EClass getPivotAttributeAssignment();

	/**
	 * Returns the meta object for the reference '{@link CWM.MiningCore.MiningData.PivotAttributeAssignment#getSetIdAttribute <em>Set Id Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Set Id Attribute</em>'.
	 * @see CWM.MiningCore.MiningData.PivotAttributeAssignment#getSetIdAttribute()
	 * @see #getPivotAttributeAssignment()
	 * @generated
	 */
	EReference getPivotAttributeAssignment_SetIdAttribute();

	/**
	 * Returns the meta object for the reference '{@link CWM.MiningCore.MiningData.PivotAttributeAssignment#getNameAttribute <em>Name Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Name Attribute</em>'.
	 * @see CWM.MiningCore.MiningData.PivotAttributeAssignment#getNameAttribute()
	 * @see #getPivotAttributeAssignment()
	 * @generated
	 */
	EReference getPivotAttributeAssignment_NameAttribute();

	/**
	 * Returns the meta object for the reference '{@link CWM.MiningCore.MiningData.PivotAttributeAssignment#getValueAttribute <em>Value Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value Attribute</em>'.
	 * @see CWM.MiningCore.MiningData.PivotAttributeAssignment#getValueAttribute()
	 * @see #getPivotAttributeAssignment()
	 * @generated
	 */
	EReference getPivotAttributeAssignment_ValueAttribute();

	/**
	 * Returns the meta object for class '{@link CWM.MiningCore.MiningData.ReversePivotAttributeAssignment <em>Reverse Pivot Attribute Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reverse Pivot Attribute Assignment</em>'.
	 * @see CWM.MiningCore.MiningData.ReversePivotAttributeAssignment
	 * @generated
	 */
	EClass getReversePivotAttributeAssignment();

	/**
	 * Returns the meta object for the reference list '{@link CWM.MiningCore.MiningData.ReversePivotAttributeAssignment#getSelectorAttribute <em>Selector Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Selector Attribute</em>'.
	 * @see CWM.MiningCore.MiningData.ReversePivotAttributeAssignment#getSelectorAttribute()
	 * @see #getReversePivotAttributeAssignment()
	 * @generated
	 */
	EReference getReversePivotAttributeAssignment_SelectorAttribute();

	/**
	 * Returns the meta object for the attribute '{@link CWM.MiningCore.MiningData.ReversePivotAttributeAssignment#getAttributeSelectionFunction <em>Attribute Selection Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute Selection Function</em>'.
	 * @see CWM.MiningCore.MiningData.ReversePivotAttributeAssignment#getAttributeSelectionFunction()
	 * @see #getReversePivotAttributeAssignment()
	 * @generated
	 */
	EAttribute getReversePivotAttributeAssignment_AttributeSelectionFunction();

	/**
	 * Returns the meta object for the attribute '{@link CWM.MiningCore.MiningData.ReversePivotAttributeAssignment#getValueSelectionFunction <em>Value Selection Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Selection Function</em>'.
	 * @see CWM.MiningCore.MiningData.ReversePivotAttributeAssignment#getValueSelectionFunction()
	 * @see #getReversePivotAttributeAssignment()
	 * @generated
	 */
	EAttribute getReversePivotAttributeAssignment_ValueSelectionFunction();

	/**
	 * Returns the meta object for class '{@link CWM.MiningCore.MiningData.SetAttributeAssignment <em>Set Attribute Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Attribute Assignment</em>'.
	 * @see CWM.MiningCore.MiningData.SetAttributeAssignment
	 * @generated
	 */
	EClass getSetAttributeAssignment();

	/**
	 * Returns the meta object for the reference '{@link CWM.MiningCore.MiningData.SetAttributeAssignment#getSetIdAttribute <em>Set Id Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Set Id Attribute</em>'.
	 * @see CWM.MiningCore.MiningData.SetAttributeAssignment#getSetIdAttribute()
	 * @see #getSetAttributeAssignment()
	 * @generated
	 */
	EReference getSetAttributeAssignment_SetIdAttribute();

	/**
	 * Returns the meta object for the reference '{@link CWM.MiningCore.MiningData.SetAttributeAssignment#getMemberAttribute <em>Member Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Member Attribute</em>'.
	 * @see CWM.MiningCore.MiningData.SetAttributeAssignment#getMemberAttribute()
	 * @see #getSetAttributeAssignment()
	 * @generated
	 */
	EReference getSetAttributeAssignment_MemberAttribute();

	/**
	 * Returns the meta object for class '{@link CWM.MiningCore.MiningData.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see CWM.MiningCore.MiningData.Category
	 * @generated
	 */
	EClass getCategory();

	/**
	 * Returns the meta object for the attribute '{@link CWM.MiningCore.MiningData.Category#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see CWM.MiningCore.MiningData.Category#getValue()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_Value();

	/**
	 * Returns the meta object for the attribute '{@link CWM.MiningCore.MiningData.Category#getIsNullCategory <em>Is Null Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Null Category</em>'.
	 * @see CWM.MiningCore.MiningData.Category#getIsNullCategory()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_IsNullCategory();

	/**
	 * Returns the meta object for the attribute '{@link CWM.MiningCore.MiningData.Category#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see CWM.MiningCore.MiningData.Category#getDisplayName()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_DisplayName();

	/**
	 * Returns the meta object for the attribute '{@link CWM.MiningCore.MiningData.Category#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property</em>'.
	 * @see CWM.MiningCore.MiningData.Category#getProperty()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_Property();

	/**
	 * Returns the meta object for the attribute '{@link CWM.MiningCore.MiningData.Category#getPrior <em>Prior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prior</em>'.
	 * @see CWM.MiningCore.MiningData.Category#getPrior()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_Prior();

	/**
	 * Returns the meta object for class '{@link CWM.MiningCore.MiningData.CategoryMap <em>Category Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category Map</em>'.
	 * @see CWM.MiningCore.MiningData.CategoryMap
	 * @generated
	 */
	EClass getCategoryMap();

	/**
	 * Returns the meta object for the attribute '{@link CWM.MiningCore.MiningData.CategoryMap#getIsMultiLevel <em>Is Multi Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Multi Level</em>'.
	 * @see CWM.MiningCore.MiningData.CategoryMap#getIsMultiLevel()
	 * @see #getCategoryMap()
	 * @generated
	 */
	EAttribute getCategoryMap_IsMultiLevel();

	/**
	 * Returns the meta object for the attribute '{@link CWM.MiningCore.MiningData.CategoryMap#getIsItemMap <em>Is Item Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Item Map</em>'.
	 * @see CWM.MiningCore.MiningData.CategoryMap#getIsItemMap()
	 * @see #getCategoryMap()
	 * @generated
	 */
	EAttribute getCategoryMap_IsItemMap();

	/**
	 * Returns the meta object for class '{@link CWM.MiningCore.MiningData.CategoryMapObject <em>Category Map Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category Map Object</em>'.
	 * @see CWM.MiningCore.MiningData.CategoryMapObject
	 * @generated
	 */
	EClass getCategoryMapObject();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.MiningCore.MiningData.CategoryMapObject#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entry</em>'.
	 * @see CWM.MiningCore.MiningData.CategoryMapObject#getEntry()
	 * @see #getCategoryMapObject()
	 * @generated
	 */
	EReference getCategoryMapObject_Entry();

	/**
	 * Returns the meta object for class '{@link CWM.MiningCore.MiningData.CategoryMapObjectEntry <em>Category Map Object Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category Map Object Entry</em>'.
	 * @see CWM.MiningCore.MiningData.CategoryMapObjectEntry
	 * @generated
	 */
	EClass getCategoryMapObjectEntry();

	/**
	 * Returns the meta object for the reference '{@link CWM.MiningCore.MiningData.CategoryMapObjectEntry#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Child</em>'.
	 * @see CWM.MiningCore.MiningData.CategoryMapObjectEntry#getChild()
	 * @see #getCategoryMapObjectEntry()
	 * @generated
	 */
	EReference getCategoryMapObjectEntry_Child();

	/**
	 * Returns the meta object for the reference list '{@link CWM.MiningCore.MiningData.CategoryMapObjectEntry#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parent</em>'.
	 * @see CWM.MiningCore.MiningData.CategoryMapObjectEntry#getParent()
	 * @see #getCategoryMapObjectEntry()
	 * @generated
	 */
	EReference getCategoryMapObjectEntry_Parent();

	/**
	 * Returns the meta object for the attribute '{@link CWM.MiningCore.MiningData.CategoryMapObjectEntry#getGraphId <em>Graph Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Graph Id</em>'.
	 * @see CWM.MiningCore.MiningData.CategoryMapObjectEntry#getGraphId()
	 * @see #getCategoryMapObjectEntry()
	 * @generated
	 */
	EAttribute getCategoryMapObjectEntry_GraphId();

	/**
	 * Returns the meta object for class '{@link CWM.MiningCore.MiningData.CategoryMapTable <em>Category Map Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category Map Table</em>'.
	 * @see CWM.MiningCore.MiningData.CategoryMapTable
	 * @generated
	 */
	EClass getCategoryMapTable();

	/**
	 * Returns the meta object for the reference '{@link CWM.MiningCore.MiningData.CategoryMapTable#getChildAttribute <em>Child Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Child Attribute</em>'.
	 * @see CWM.MiningCore.MiningData.CategoryMapTable#getChildAttribute()
	 * @see #getCategoryMapTable()
	 * @generated
	 */
	EReference getCategoryMapTable_ChildAttribute();

	/**
	 * Returns the meta object for the reference '{@link CWM.MiningCore.MiningData.CategoryMapTable#getParentAttribute <em>Parent Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Attribute</em>'.
	 * @see CWM.MiningCore.MiningData.CategoryMapTable#getParentAttribute()
	 * @see #getCategoryMapTable()
	 * @generated
	 */
	EReference getCategoryMapTable_ParentAttribute();

	/**
	 * Returns the meta object for the reference '{@link CWM.MiningCore.MiningData.CategoryMapTable#getGraphIdAttribute <em>Graph Id Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Graph Id Attribute</em>'.
	 * @see CWM.MiningCore.MiningData.CategoryMapTable#getGraphIdAttribute()
	 * @see #getCategoryMapTable()
	 * @generated
	 */
	EReference getCategoryMapTable_GraphIdAttribute();

	/**
	 * Returns the meta object for the reference '{@link CWM.MiningCore.MiningData.CategoryMapTable#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Table</em>'.
	 * @see CWM.MiningCore.MiningData.CategoryMapTable#getTable()
	 * @see #getCategoryMapTable()
	 * @generated
	 */
	EReference getCategoryMapTable_Table();

	/**
	 * Returns the meta object for class '{@link CWM.MiningCore.MiningData.CategoryMatrix <em>Category Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category Matrix</em>'.
	 * @see CWM.MiningCore.MiningData.CategoryMatrix
	 * @generated
	 */
	EClass getCategoryMatrix();

	/**
	 * Returns the meta object for the attribute '{@link CWM.MiningCore.MiningData.CategoryMatrix#getDiagonalDefault <em>Diagonal Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diagonal Default</em>'.
	 * @see CWM.MiningCore.MiningData.CategoryMatrix#getDiagonalDefault()
	 * @see #getCategoryMatrix()
	 * @generated
	 */
	EAttribute getCategoryMatrix_DiagonalDefault();

	/**
	 * Returns the meta object for the attribute '{@link CWM.MiningCore.MiningData.CategoryMatrix#getOffDiagonalDefault <em>Off Diagonal Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Off Diagonal Default</em>'.
	 * @see CWM.MiningCore.MiningData.CategoryMatrix#getOffDiagonalDefault()
	 * @see #getCategoryMatrix()
	 * @generated
	 */
	EAttribute getCategoryMatrix_OffDiagonalDefault();

	/**
	 * Returns the meta object for the attribute '{@link CWM.MiningCore.MiningData.CategoryMatrix#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see CWM.MiningCore.MiningData.CategoryMatrix#getKind()
	 * @see #getCategoryMatrix()
	 * @generated
	 */
	EAttribute getCategoryMatrix_Kind();

	/**
	 * Returns the meta object for the reference list '{@link CWM.MiningCore.MiningData.CategoryMatrix#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Category</em>'.
	 * @see CWM.MiningCore.MiningData.CategoryMatrix#getCategory()
	 * @see #getCategoryMatrix()
	 * @generated
	 */
	EReference getCategoryMatrix_Category();

	/**
	 * Returns the meta object for class '{@link CWM.MiningCore.MiningData.CategoryMatrixEntry <em>Category Matrix Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category Matrix Entry</em>'.
	 * @see CWM.MiningCore.MiningData.CategoryMatrixEntry
	 * @generated
	 */
	EClass getCategoryMatrixEntry();

	/**
	 * Returns the meta object for the reference '{@link CWM.MiningCore.MiningData.CategoryMatrixEntry#getRowIndex <em>Row Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Row Index</em>'.
	 * @see CWM.MiningCore.MiningData.CategoryMatrixEntry#getRowIndex()
	 * @see #getCategoryMatrixEntry()
	 * @generated
	 */
	EReference getCategoryMatrixEntry_RowIndex();

	/**
	 * Returns the meta object for the reference '{@link CWM.MiningCore.MiningData.CategoryMatrixEntry#getColumnIndex <em>Column Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Column Index</em>'.
	 * @see CWM.MiningCore.MiningData.CategoryMatrixEntry#getColumnIndex()
	 * @see #getCategoryMatrixEntry()
	 * @generated
	 */
	EReference getCategoryMatrixEntry_ColumnIndex();

	/**
	 * Returns the meta object for the attribute '{@link CWM.MiningCore.MiningData.CategoryMatrixEntry#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see CWM.MiningCore.MiningData.CategoryMatrixEntry#getValue()
	 * @see #getCategoryMatrixEntry()
	 * @generated
	 */
	EAttribute getCategoryMatrixEntry_Value();

	/**
	 * Returns the meta object for class '{@link CWM.MiningCore.MiningData.CategoryMatrixObject <em>Category Matrix Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category Matrix Object</em>'.
	 * @see CWM.MiningCore.MiningData.CategoryMatrixObject
	 * @generated
	 */
	EClass getCategoryMatrixObject();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.MiningCore.MiningData.CategoryMatrixObject#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entry</em>'.
	 * @see CWM.MiningCore.MiningData.CategoryMatrixObject#getEntry()
	 * @see #getCategoryMatrixObject()
	 * @generated
	 */
	EReference getCategoryMatrixObject_Entry();

	/**
	 * Returns the meta object for class '{@link CWM.MiningCore.MiningData.CategoryMatrixTable <em>Category Matrix Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category Matrix Table</em>'.
	 * @see CWM.MiningCore.MiningData.CategoryMatrixTable
	 * @generated
	 */
	EClass getCategoryMatrixTable();

	/**
	 * Returns the meta object for the reference '{@link CWM.MiningCore.MiningData.CategoryMatrixTable#getRowAttribute <em>Row Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Row Attribute</em>'.
	 * @see CWM.MiningCore.MiningData.CategoryMatrixTable#getRowAttribute()
	 * @see #getCategoryMatrixTable()
	 * @generated
	 */
	EReference getCategoryMatrixTable_RowAttribute();

	/**
	 * Returns the meta object for the reference '{@link CWM.MiningCore.MiningData.CategoryMatrixTable#getColumnAttribute <em>Column Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Column Attribute</em>'.
	 * @see CWM.MiningCore.MiningData.CategoryMatrixTable#getColumnAttribute()
	 * @see #getCategoryMatrixTable()
	 * @generated
	 */
	EReference getCategoryMatrixTable_ColumnAttribute();

	/**
	 * Returns the meta object for the reference '{@link CWM.MiningCore.MiningData.CategoryMatrixTable#getValueAttribute <em>Value Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value Attribute</em>'.
	 * @see CWM.MiningCore.MiningData.CategoryMatrixTable#getValueAttribute()
	 * @see #getCategoryMatrixTable()
	 * @generated
	 */
	EReference getCategoryMatrixTable_ValueAttribute();

	/**
	 * Returns the meta object for the reference list '{@link CWM.MiningCore.MiningData.CategoryMatrixTable#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source</em>'.
	 * @see CWM.MiningCore.MiningData.CategoryMatrixTable#getSource()
	 * @see #getCategoryMatrixTable()
	 * @generated
	 */
	EReference getCategoryMatrixTable_Source();

	/**
	 * Returns the meta object for class '{@link CWM.MiningCore.MiningData.CategoryTaxonomy <em>Category Taxonomy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category Taxonomy</em>'.
	 * @see CWM.MiningCore.MiningData.CategoryTaxonomy
	 * @generated
	 */
	EClass getCategoryTaxonomy();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.MiningCore.MiningData.CategoryTaxonomy#getCategoryMap <em>Category Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Category Map</em>'.
	 * @see CWM.MiningCore.MiningData.CategoryTaxonomy#getCategoryMap()
	 * @see #getCategoryTaxonomy()
	 * @generated
	 */
	EReference getCategoryTaxonomy_CategoryMap();

	/**
	 * Returns the meta object for the reference list '{@link CWM.MiningCore.MiningData.CategoryTaxonomy#getRootCategory <em>Root Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Root Category</em>'.
	 * @see CWM.MiningCore.MiningData.CategoryTaxonomy#getRootCategory()
	 * @see #getCategoryTaxonomy()
	 * @generated
	 */
	EReference getCategoryTaxonomy_RootCategory();

	/**
	 * Returns the meta object for class '{@link CWM.MiningCore.MiningData.MiningData_container <em>Mining Data container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mining Data container</em>'.
	 * @see CWM.MiningCore.MiningData.MiningData_container
	 * @generated
	 */
	EClass getMiningData_container();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.MiningCore.MiningData.MiningData_container#getAttributeAssignment <em>Attribute Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute Assignment</em>'.
	 * @see CWM.MiningCore.MiningData.MiningData_container#getAttributeAssignment()
	 * @see #getMiningData_container()
	 * @generated
	 */
	EReference getMiningData_container_AttributeAssignment();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.MiningCore.MiningData.MiningData_container#getAttributeAssignmentSet <em>Attribute Assignment Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute Assignment Set</em>'.
	 * @see CWM.MiningCore.MiningData.MiningData_container#getAttributeAssignmentSet()
	 * @see #getMiningData_container()
	 * @generated
	 */
	EReference getMiningData_container_AttributeAssignmentSet();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.MiningCore.MiningData.MiningData_container#getAttributeUsage <em>Attribute Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute Usage</em>'.
	 * @see CWM.MiningCore.MiningData.MiningData_container#getAttributeUsage()
	 * @see #getMiningData_container()
	 * @generated
	 */
	EReference getMiningData_container_AttributeUsage();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.MiningCore.MiningData.MiningData_container#getAttributeUsageSet <em>Attribute Usage Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute Usage Set</em>'.
	 * @see CWM.MiningCore.MiningData.MiningData_container#getAttributeUsageSet()
	 * @see #getMiningData_container()
	 * @generated
	 */
	EReference getMiningData_container_AttributeUsageSet();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.MiningCore.MiningData.MiningData_container#getCategoricalAttributeProperties <em>Categorical Attribute Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Categorical Attribute Properties</em>'.
	 * @see CWM.MiningCore.MiningData.MiningData_container#getCategoricalAttributeProperties()
	 * @see #getMiningData_container()
	 * @generated
	 */
	EReference getMiningData_container_CategoricalAttributeProperties();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.MiningCore.MiningData.MiningData_container#getDirectAttributeAssignment <em>Direct Attribute Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Direct Attribute Assignment</em>'.
	 * @see CWM.MiningCore.MiningData.MiningData_container#getDirectAttributeAssignment()
	 * @see #getMiningData_container()
	 * @generated
	 */
	EReference getMiningData_container_DirectAttributeAssignment();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.MiningCore.MiningData.MiningData_container#getLogicalAttribute <em>Logical Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Logical Attribute</em>'.
	 * @see CWM.MiningCore.MiningData.MiningData_container#getLogicalAttribute()
	 * @see #getMiningData_container()
	 * @generated
	 */
	EReference getMiningData_container_LogicalAttribute();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.MiningCore.MiningData.MiningData_container#getLogicalData <em>Logical Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Logical Data</em>'.
	 * @see CWM.MiningCore.MiningData.MiningData_container#getLogicalData()
	 * @see #getMiningData_container()
	 * @generated
	 */
	EReference getMiningData_container_LogicalData();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.MiningCore.MiningData.MiningData_container#getMiningAttribute <em>Mining Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mining Attribute</em>'.
	 * @see CWM.MiningCore.MiningData.MiningData_container#getMiningAttribute()
	 * @see #getMiningData_container()
	 * @generated
	 */
	EReference getMiningData_container_MiningAttribute();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.MiningCore.MiningData.MiningData_container#getNumericalAttributeProperties <em>Numerical Attribute Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Numerical Attribute Properties</em>'.
	 * @see CWM.MiningCore.MiningData.MiningData_container#getNumericalAttributeProperties()
	 * @see #getMiningData_container()
	 * @generated
	 */
	EReference getMiningData_container_NumericalAttributeProperties();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.MiningCore.MiningData.MiningData_container#getOrdinalAttributeProperties <em>Ordinal Attribute Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ordinal Attribute Properties</em>'.
	 * @see CWM.MiningCore.MiningData.MiningData_container#getOrdinalAttributeProperties()
	 * @see #getMiningData_container()
	 * @generated
	 */
	EReference getMiningData_container_OrdinalAttributeProperties();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.MiningCore.MiningData.MiningData_container#getPhysicalData <em>Physical Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Physical Data</em>'.
	 * @see CWM.MiningCore.MiningData.MiningData_container#getPhysicalData()
	 * @see #getMiningData_container()
	 * @generated
	 */
	EReference getMiningData_container_PhysicalData();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.MiningCore.MiningData.MiningData_container#getPivotAttributeAssignment <em>Pivot Attribute Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pivot Attribute Assignment</em>'.
	 * @see CWM.MiningCore.MiningData.MiningData_container#getPivotAttributeAssignment()
	 * @see #getMiningData_container()
	 * @generated
	 */
	EReference getMiningData_container_PivotAttributeAssignment();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.MiningCore.MiningData.MiningData_container#getReversePivotAttributeAssignment <em>Reverse Pivot Attribute Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reverse Pivot Attribute Assignment</em>'.
	 * @see CWM.MiningCore.MiningData.MiningData_container#getReversePivotAttributeAssignment()
	 * @see #getMiningData_container()
	 * @generated
	 */
	EReference getMiningData_container_ReversePivotAttributeAssignment();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.MiningCore.MiningData.MiningData_container#getSetAttributeAssignment <em>Set Attribute Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Set Attribute Assignment</em>'.
	 * @see CWM.MiningCore.MiningData.MiningData_container#getSetAttributeAssignment()
	 * @see #getMiningData_container()
	 * @generated
	 */
	EReference getMiningData_container_SetAttributeAssignment();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.MiningCore.MiningData.MiningData_container#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Category</em>'.
	 * @see CWM.MiningCore.MiningData.MiningData_container#getCategory()
	 * @see #getMiningData_container()
	 * @generated
	 */
	EReference getMiningData_container_Category();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.MiningCore.MiningData.MiningData_container#getCategoryMap <em>Category Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Category Map</em>'.
	 * @see CWM.MiningCore.MiningData.MiningData_container#getCategoryMap()
	 * @see #getMiningData_container()
	 * @generated
	 */
	EReference getMiningData_container_CategoryMap();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.MiningCore.MiningData.MiningData_container#getCategoryMapObject <em>Category Map Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Category Map Object</em>'.
	 * @see CWM.MiningCore.MiningData.MiningData_container#getCategoryMapObject()
	 * @see #getMiningData_container()
	 * @generated
	 */
	EReference getMiningData_container_CategoryMapObject();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.MiningCore.MiningData.MiningData_container#getCategoryMapObjectEntry <em>Category Map Object Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Category Map Object Entry</em>'.
	 * @see CWM.MiningCore.MiningData.MiningData_container#getCategoryMapObjectEntry()
	 * @see #getMiningData_container()
	 * @generated
	 */
	EReference getMiningData_container_CategoryMapObjectEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.MiningCore.MiningData.MiningData_container#getCategoryMapTable <em>Category Map Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Category Map Table</em>'.
	 * @see CWM.MiningCore.MiningData.MiningData_container#getCategoryMapTable()
	 * @see #getMiningData_container()
	 * @generated
	 */
	EReference getMiningData_container_CategoryMapTable();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.MiningCore.MiningData.MiningData_container#getCategoryMatrix <em>Category Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Category Matrix</em>'.
	 * @see CWM.MiningCore.MiningData.MiningData_container#getCategoryMatrix()
	 * @see #getMiningData_container()
	 * @generated
	 */
	EReference getMiningData_container_CategoryMatrix();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.MiningCore.MiningData.MiningData_container#getCategoryMatrixEntry <em>Category Matrix Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Category Matrix Entry</em>'.
	 * @see CWM.MiningCore.MiningData.MiningData_container#getCategoryMatrixEntry()
	 * @see #getMiningData_container()
	 * @generated
	 */
	EReference getMiningData_container_CategoryMatrixEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.MiningCore.MiningData.MiningData_container#getCategoryMatrixObject <em>Category Matrix Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Category Matrix Object</em>'.
	 * @see CWM.MiningCore.MiningData.MiningData_container#getCategoryMatrixObject()
	 * @see #getMiningData_container()
	 * @generated
	 */
	EReference getMiningData_container_CategoryMatrixObject();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.MiningCore.MiningData.MiningData_container#getCategoryMatrixTable <em>Category Matrix Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Category Matrix Table</em>'.
	 * @see CWM.MiningCore.MiningData.MiningData_container#getCategoryMatrixTable()
	 * @see #getMiningData_container()
	 * @generated
	 */
	EReference getMiningData_container_CategoryMatrixTable();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.MiningCore.MiningData.MiningData_container#getCategoryTaxonomy <em>Category Taxonomy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Category Taxonomy</em>'.
	 * @see CWM.MiningCore.MiningData.MiningData_container#getCategoryTaxonomy()
	 * @see #getMiningData_container()
	 * @generated
	 */
	EReference getMiningData_container_CategoryTaxonomy();

	/**
	 * Returns the meta object for enum '{@link CWM.MiningCore.MiningData.AttributeSelectionFunction <em>Attribute Selection Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Attribute Selection Function</em>'.
	 * @see CWM.MiningCore.MiningData.AttributeSelectionFunction
	 * @generated
	 */
	EEnum getAttributeSelectionFunction();

	/**
	 * Returns the meta object for enum '{@link CWM.MiningCore.MiningData.AttributeType <em>Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Attribute Type</em>'.
	 * @see CWM.MiningCore.MiningData.AttributeType
	 * @generated
	 */
	EEnum getAttributeType();

	/**
	 * Returns the meta object for enum '{@link CWM.MiningCore.MiningData.OrderType <em>Order Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Order Type</em>'.
	 * @see CWM.MiningCore.MiningData.OrderType
	 * @generated
	 */
	EEnum getOrderType();

	/**
	 * Returns the meta object for enum '{@link CWM.MiningCore.MiningData.UsageOption <em>Usage Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Usage Option</em>'.
	 * @see CWM.MiningCore.MiningData.UsageOption
	 * @generated
	 */
	EEnum getUsageOption();

	/**
	 * Returns the meta object for enum '{@link CWM.MiningCore.MiningData.ValueSelectionFunction <em>Value Selection Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Value Selection Function</em>'.
	 * @see CWM.MiningCore.MiningData.ValueSelectionFunction
	 * @generated
	 */
	EEnum getValueSelectionFunction();

	/**
	 * Returns the meta object for enum '{@link CWM.MiningCore.MiningData.CategoryProperty <em>Category Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Category Property</em>'.
	 * @see CWM.MiningCore.MiningData.CategoryProperty
	 * @generated
	 */
	EEnum getCategoryProperty();

	/**
	 * Returns the meta object for enum '{@link CWM.MiningCore.MiningData.MatrixProperty <em>Matrix Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Matrix Property</em>'.
	 * @see CWM.MiningCore.MiningData.MatrixProperty
	 * @generated
	 */
	EEnum getMatrixProperty();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Double</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 * @generated
	 */
	EDataType getDouble();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MiningDataFactory getMiningDataFactory();

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
		 * The meta object literal for the '{@link CWM.MiningCore.MiningData.impl.AttributeAssignmentImpl <em>Attribute Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.MiningCore.MiningData.impl.AttributeAssignmentImpl
		 * @see CWM.MiningCore.MiningData.impl.MiningDataPackageImpl#getAttributeAssignment()
		 * @generated
		 */
		EClass ATTRIBUTE_ASSIGNMENT = eINSTANCE.getAttributeAssignment();

		/**
		 * The meta object literal for the '<em><b>Order Id Attribute</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_ASSIGNMENT__ORDER_ID_ATTRIBUTE = eINSTANCE.getAttributeAssignment_OrderIdAttribute();

		/**
		 * The meta object literal for the '<em><b>Logical Attribute</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_ASSIGNMENT__LOGICAL_ATTRIBUTE = eINSTANCE.getAttributeAssignment_LogicalAttribute();

		/**
		 * The meta object literal for the '{@link CWM.MiningCore.MiningData.impl.AttributeAssignmentSetImpl <em>Attribute Assignment Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.MiningCore.MiningData.impl.AttributeAssignmentSetImpl
		 * @see CWM.MiningCore.MiningData.impl.MiningDataPackageImpl#getAttributeAssignmentSet()
		 * @generated
		 */
		EClass ATTRIBUTE_ASSIGNMENT_SET = eINSTANCE.getAttributeAssignmentSet();

		/**
		 * The meta object literal for the '<em><b>Assignment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_ASSIGNMENT_SET__ASSIGNMENT = eINSTANCE.getAttributeAssignmentSet_Assignment();

		/**
		 * The meta object literal for the '{@link CWM.MiningCore.MiningData.impl.AttributeUsageImpl <em>Attribute Usage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.MiningCore.MiningData.impl.AttributeUsageImpl
		 * @see CWM.MiningCore.MiningData.impl.MiningDataPackageImpl#getAttributeUsage()
		 * @generated
		 */
		EClass ATTRIBUTE_USAGE = eINSTANCE.getAttributeUsage();

		/**
		 * The meta object literal for the '<em><b>Usage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_USAGE__USAGE = eINSTANCE.getAttributeUsage_Usage();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_USAGE__WEIGHT = eINSTANCE.getAttributeUsage_Weight();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_USAGE__ATTRIBUTE = eINSTANCE.getAttributeUsage_Attribute();

		/**
		 * The meta object literal for the '<em><b>Suppress Discretization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_USAGE__SUPPRESS_DISCRETIZATION = eINSTANCE.getAttributeUsage_SuppressDiscretization();

		/**
		 * The meta object literal for the '<em><b>Suppress Normalization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_USAGE__SUPPRESS_NORMALIZATION = eINSTANCE.getAttributeUsage_SuppressNormalization();

		/**
		 * The meta object literal for the '{@link CWM.MiningCore.MiningData.impl.AttributeUsageSetImpl <em>Attribute Usage Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.MiningCore.MiningData.impl.AttributeUsageSetImpl
		 * @see CWM.MiningCore.MiningData.impl.MiningDataPackageImpl#getAttributeUsageSet()
		 * @generated
		 */
		EClass ATTRIBUTE_USAGE_SET = eINSTANCE.getAttributeUsageSet();

		/**
		 * The meta object literal for the '{@link CWM.MiningCore.MiningData.impl.CategoricalAttributePropertiesImpl <em>Categorical Attribute Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.MiningCore.MiningData.impl.CategoricalAttributePropertiesImpl
		 * @see CWM.MiningCore.MiningData.impl.MiningDataPackageImpl#getCategoricalAttributeProperties()
		 * @generated
		 */
		EClass CATEGORICAL_ATTRIBUTE_PROPERTIES = eINSTANCE.getCategoricalAttributeProperties();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORICAL_ATTRIBUTE_PROPERTIES__CATEGORY = eINSTANCE.getCategoricalAttributeProperties_Category();

		/**
		 * The meta object literal for the '<em><b>Taxonomy</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORICAL_ATTRIBUTE_PROPERTIES__TAXONOMY = eINSTANCE.getCategoricalAttributeProperties_Taxonomy();

		/**
		 * The meta object literal for the '{@link CWM.MiningCore.MiningData.impl.DirectAttributeAssignmentImpl <em>Direct Attribute Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.MiningCore.MiningData.impl.DirectAttributeAssignmentImpl
		 * @see CWM.MiningCore.MiningData.impl.MiningDataPackageImpl#getDirectAttributeAssignment()
		 * @generated
		 */
		EClass DIRECT_ATTRIBUTE_ASSIGNMENT = eINSTANCE.getDirectAttributeAssignment();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECT_ATTRIBUTE_ASSIGNMENT__ATTRIBUTE = eINSTANCE.getDirectAttributeAssignment_Attribute();

		/**
		 * The meta object literal for the '{@link CWM.MiningCore.MiningData.impl.LogicalAttributeImpl <em>Logical Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.MiningCore.MiningData.impl.LogicalAttributeImpl
		 * @see CWM.MiningCore.MiningData.impl.MiningDataPackageImpl#getLogicalAttribute()
		 * @generated
		 */
		EClass LOGICAL_ATTRIBUTE = eINSTANCE.getLogicalAttribute();

		/**
		 * The meta object literal for the '<em><b>Is Set Valued</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGICAL_ATTRIBUTE__IS_SET_VALUED = eINSTANCE.getLogicalAttribute_IsSetValued();

		/**
		 * The meta object literal for the '<em><b>Categorical Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_ATTRIBUTE__CATEGORICAL_PROPERTIES = eINSTANCE.getLogicalAttribute_CategoricalProperties();

		/**
		 * The meta object literal for the '<em><b>Numerical Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_ATTRIBUTE__NUMERICAL_PROPERTIES = eINSTANCE.getLogicalAttribute_NumericalProperties();

		/**
		 * The meta object literal for the '{@link CWM.MiningCore.MiningData.impl.LogicalDataImpl <em>Logical Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.MiningCore.MiningData.impl.LogicalDataImpl
		 * @see CWM.MiningCore.MiningData.impl.MiningDataPackageImpl#getLogicalData()
		 * @generated
		 */
		EClass LOGICAL_DATA = eINSTANCE.getLogicalData();

		/**
		 * The meta object literal for the '{@link CWM.MiningCore.MiningData.impl.MiningAttributeImpl <em>Mining Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.MiningCore.MiningData.impl.MiningAttributeImpl
		 * @see CWM.MiningCore.MiningData.impl.MiningDataPackageImpl#getMiningAttribute()
		 * @generated
		 */
		EClass MINING_ATTRIBUTE = eINSTANCE.getMiningAttribute();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MINING_ATTRIBUTE__DISPLAY_NAME = eINSTANCE.getMiningAttribute_DisplayName();

		/**
		 * The meta object literal for the '<em><b>Attribute Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MINING_ATTRIBUTE__ATTRIBUTE_TYPE = eINSTANCE.getMiningAttribute_AttributeType();

		/**
		 * The meta object literal for the '{@link CWM.MiningCore.MiningData.impl.NumericalAttributePropertiesImpl <em>Numerical Attribute Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.MiningCore.MiningData.impl.NumericalAttributePropertiesImpl
		 * @see CWM.MiningCore.MiningData.impl.MiningDataPackageImpl#getNumericalAttributeProperties()
		 * @generated
		 */
		EClass NUMERICAL_ATTRIBUTE_PROPERTIES = eINSTANCE.getNumericalAttributeProperties();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERICAL_ATTRIBUTE_PROPERTIES__LOWER_BOUND = eINSTANCE.getNumericalAttributeProperties_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERICAL_ATTRIBUTE_PROPERTIES__UPPER_BOUND = eINSTANCE.getNumericalAttributeProperties_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Is Discrete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERICAL_ATTRIBUTE_PROPERTIES__IS_DISCRETE = eINSTANCE.getNumericalAttributeProperties_IsDiscrete();

		/**
		 * The meta object literal for the '<em><b>Is Cyclic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERICAL_ATTRIBUTE_PROPERTIES__IS_CYCLIC = eINSTANCE.getNumericalAttributeProperties_IsCyclic();

		/**
		 * The meta object literal for the '<em><b>Anchor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERICAL_ATTRIBUTE_PROPERTIES__ANCHOR = eINSTANCE.getNumericalAttributeProperties_Anchor();

		/**
		 * The meta object literal for the '<em><b>Cycle Begin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERICAL_ATTRIBUTE_PROPERTIES__CYCLE_BEGIN = eINSTANCE.getNumericalAttributeProperties_CycleBegin();

		/**
		 * The meta object literal for the '<em><b>Cycle End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERICAL_ATTRIBUTE_PROPERTIES__CYCLE_END = eINSTANCE.getNumericalAttributeProperties_CycleEnd();

		/**
		 * The meta object literal for the '<em><b>Discrete Step Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERICAL_ATTRIBUTE_PROPERTIES__DISCRETE_STEP_SIZE = eINSTANCE.getNumericalAttributeProperties_DiscreteStepSize();

		/**
		 * The meta object literal for the '{@link CWM.MiningCore.MiningData.impl.OrdinalAttributePropertiesImpl <em>Ordinal Attribute Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.MiningCore.MiningData.impl.OrdinalAttributePropertiesImpl
		 * @see CWM.MiningCore.MiningData.impl.MiningDataPackageImpl#getOrdinalAttributeProperties()
		 * @generated
		 */
		EClass ORDINAL_ATTRIBUTE_PROPERTIES = eINSTANCE.getOrdinalAttributeProperties();

		/**
		 * The meta object literal for the '<em><b>Order Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDINAL_ATTRIBUTE_PROPERTIES__ORDER_TYPE = eINSTANCE.getOrdinalAttributeProperties_OrderType();

		/**
		 * The meta object literal for the '<em><b>Is Cyclic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDINAL_ATTRIBUTE_PROPERTIES__IS_CYCLIC = eINSTANCE.getOrdinalAttributeProperties_IsCyclic();

		/**
		 * The meta object literal for the '{@link CWM.MiningCore.MiningData.impl.PhysicalDataImpl <em>Physical Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.MiningCore.MiningData.impl.PhysicalDataImpl
		 * @see CWM.MiningCore.MiningData.impl.MiningDataPackageImpl#getPhysicalData()
		 * @generated
		 */
		EClass PHYSICAL_DATA = eINSTANCE.getPhysicalData();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_DATA__SOURCE = eINSTANCE.getPhysicalData_Source();

		/**
		 * The meta object literal for the '{@link CWM.MiningCore.MiningData.impl.PivotAttributeAssignmentImpl <em>Pivot Attribute Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.MiningCore.MiningData.impl.PivotAttributeAssignmentImpl
		 * @see CWM.MiningCore.MiningData.impl.MiningDataPackageImpl#getPivotAttributeAssignment()
		 * @generated
		 */
		EClass PIVOT_ATTRIBUTE_ASSIGNMENT = eINSTANCE.getPivotAttributeAssignment();

		/**
		 * The meta object literal for the '<em><b>Set Id Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIVOT_ATTRIBUTE_ASSIGNMENT__SET_ID_ATTRIBUTE = eINSTANCE.getPivotAttributeAssignment_SetIdAttribute();

		/**
		 * The meta object literal for the '<em><b>Name Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIVOT_ATTRIBUTE_ASSIGNMENT__NAME_ATTRIBUTE = eINSTANCE.getPivotAttributeAssignment_NameAttribute();

		/**
		 * The meta object literal for the '<em><b>Value Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIVOT_ATTRIBUTE_ASSIGNMENT__VALUE_ATTRIBUTE = eINSTANCE.getPivotAttributeAssignment_ValueAttribute();

		/**
		 * The meta object literal for the '{@link CWM.MiningCore.MiningData.impl.ReversePivotAttributeAssignmentImpl <em>Reverse Pivot Attribute Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.MiningCore.MiningData.impl.ReversePivotAttributeAssignmentImpl
		 * @see CWM.MiningCore.MiningData.impl.MiningDataPackageImpl#getReversePivotAttributeAssignment()
		 * @generated
		 */
		EClass REVERSE_PIVOT_ATTRIBUTE_ASSIGNMENT = eINSTANCE.getReversePivotAttributeAssignment();

		/**
		 * The meta object literal for the '<em><b>Selector Attribute</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REVERSE_PIVOT_ATTRIBUTE_ASSIGNMENT__SELECTOR_ATTRIBUTE = eINSTANCE.getReversePivotAttributeAssignment_SelectorAttribute();

		/**
		 * The meta object literal for the '<em><b>Attribute Selection Function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REVERSE_PIVOT_ATTRIBUTE_ASSIGNMENT__ATTRIBUTE_SELECTION_FUNCTION = eINSTANCE.getReversePivotAttributeAssignment_AttributeSelectionFunction();

		/**
		 * The meta object literal for the '<em><b>Value Selection Function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REVERSE_PIVOT_ATTRIBUTE_ASSIGNMENT__VALUE_SELECTION_FUNCTION = eINSTANCE.getReversePivotAttributeAssignment_ValueSelectionFunction();

		/**
		 * The meta object literal for the '{@link CWM.MiningCore.MiningData.impl.SetAttributeAssignmentImpl <em>Set Attribute Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.MiningCore.MiningData.impl.SetAttributeAssignmentImpl
		 * @see CWM.MiningCore.MiningData.impl.MiningDataPackageImpl#getSetAttributeAssignment()
		 * @generated
		 */
		EClass SET_ATTRIBUTE_ASSIGNMENT = eINSTANCE.getSetAttributeAssignment();

		/**
		 * The meta object literal for the '<em><b>Set Id Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_ATTRIBUTE_ASSIGNMENT__SET_ID_ATTRIBUTE = eINSTANCE.getSetAttributeAssignment_SetIdAttribute();

		/**
		 * The meta object literal for the '<em><b>Member Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_ATTRIBUTE_ASSIGNMENT__MEMBER_ATTRIBUTE = eINSTANCE.getSetAttributeAssignment_MemberAttribute();

		/**
		 * The meta object literal for the '{@link CWM.MiningCore.MiningData.impl.CategoryImpl <em>Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.MiningCore.MiningData.impl.CategoryImpl
		 * @see CWM.MiningCore.MiningData.impl.MiningDataPackageImpl#getCategory()
		 * @generated
		 */
		EClass CATEGORY = eINSTANCE.getCategory();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__VALUE = eINSTANCE.getCategory_Value();

		/**
		 * The meta object literal for the '<em><b>Is Null Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__IS_NULL_CATEGORY = eINSTANCE.getCategory_IsNullCategory();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__DISPLAY_NAME = eINSTANCE.getCategory_DisplayName();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__PROPERTY = eINSTANCE.getCategory_Property();

		/**
		 * The meta object literal for the '<em><b>Prior</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__PRIOR = eINSTANCE.getCategory_Prior();

		/**
		 * The meta object literal for the '{@link CWM.MiningCore.MiningData.impl.CategoryMapImpl <em>Category Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.MiningCore.MiningData.impl.CategoryMapImpl
		 * @see CWM.MiningCore.MiningData.impl.MiningDataPackageImpl#getCategoryMap()
		 * @generated
		 */
		EClass CATEGORY_MAP = eINSTANCE.getCategoryMap();

		/**
		 * The meta object literal for the '<em><b>Is Multi Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY_MAP__IS_MULTI_LEVEL = eINSTANCE.getCategoryMap_IsMultiLevel();

		/**
		 * The meta object literal for the '<em><b>Is Item Map</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY_MAP__IS_ITEM_MAP = eINSTANCE.getCategoryMap_IsItemMap();

		/**
		 * The meta object literal for the '{@link CWM.MiningCore.MiningData.impl.CategoryMapObjectImpl <em>Category Map Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.MiningCore.MiningData.impl.CategoryMapObjectImpl
		 * @see CWM.MiningCore.MiningData.impl.MiningDataPackageImpl#getCategoryMapObject()
		 * @generated
		 */
		EClass CATEGORY_MAP_OBJECT = eINSTANCE.getCategoryMapObject();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY_MAP_OBJECT__ENTRY = eINSTANCE.getCategoryMapObject_Entry();

		/**
		 * The meta object literal for the '{@link CWM.MiningCore.MiningData.impl.CategoryMapObjectEntryImpl <em>Category Map Object Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.MiningCore.MiningData.impl.CategoryMapObjectEntryImpl
		 * @see CWM.MiningCore.MiningData.impl.MiningDataPackageImpl#getCategoryMapObjectEntry()
		 * @generated
		 */
		EClass CATEGORY_MAP_OBJECT_ENTRY = eINSTANCE.getCategoryMapObjectEntry();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY_MAP_OBJECT_ENTRY__CHILD = eINSTANCE.getCategoryMapObjectEntry_Child();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY_MAP_OBJECT_ENTRY__PARENT = eINSTANCE.getCategoryMapObjectEntry_Parent();

		/**
		 * The meta object literal for the '<em><b>Graph Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY_MAP_OBJECT_ENTRY__GRAPH_ID = eINSTANCE.getCategoryMapObjectEntry_GraphId();

		/**
		 * The meta object literal for the '{@link CWM.MiningCore.MiningData.impl.CategoryMapTableImpl <em>Category Map Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.MiningCore.MiningData.impl.CategoryMapTableImpl
		 * @see CWM.MiningCore.MiningData.impl.MiningDataPackageImpl#getCategoryMapTable()
		 * @generated
		 */
		EClass CATEGORY_MAP_TABLE = eINSTANCE.getCategoryMapTable();

		/**
		 * The meta object literal for the '<em><b>Child Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY_MAP_TABLE__CHILD_ATTRIBUTE = eINSTANCE.getCategoryMapTable_ChildAttribute();

		/**
		 * The meta object literal for the '<em><b>Parent Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY_MAP_TABLE__PARENT_ATTRIBUTE = eINSTANCE.getCategoryMapTable_ParentAttribute();

		/**
		 * The meta object literal for the '<em><b>Graph Id Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY_MAP_TABLE__GRAPH_ID_ATTRIBUTE = eINSTANCE.getCategoryMapTable_GraphIdAttribute();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY_MAP_TABLE__TABLE = eINSTANCE.getCategoryMapTable_Table();

		/**
		 * The meta object literal for the '{@link CWM.MiningCore.MiningData.impl.CategoryMatrixImpl <em>Category Matrix</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.MiningCore.MiningData.impl.CategoryMatrixImpl
		 * @see CWM.MiningCore.MiningData.impl.MiningDataPackageImpl#getCategoryMatrix()
		 * @generated
		 */
		EClass CATEGORY_MATRIX = eINSTANCE.getCategoryMatrix();

		/**
		 * The meta object literal for the '<em><b>Diagonal Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY_MATRIX__DIAGONAL_DEFAULT = eINSTANCE.getCategoryMatrix_DiagonalDefault();

		/**
		 * The meta object literal for the '<em><b>Off Diagonal Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY_MATRIX__OFF_DIAGONAL_DEFAULT = eINSTANCE.getCategoryMatrix_OffDiagonalDefault();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY_MATRIX__KIND = eINSTANCE.getCategoryMatrix_Kind();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY_MATRIX__CATEGORY = eINSTANCE.getCategoryMatrix_Category();

		/**
		 * The meta object literal for the '{@link CWM.MiningCore.MiningData.impl.CategoryMatrixEntryImpl <em>Category Matrix Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.MiningCore.MiningData.impl.CategoryMatrixEntryImpl
		 * @see CWM.MiningCore.MiningData.impl.MiningDataPackageImpl#getCategoryMatrixEntry()
		 * @generated
		 */
		EClass CATEGORY_MATRIX_ENTRY = eINSTANCE.getCategoryMatrixEntry();

		/**
		 * The meta object literal for the '<em><b>Row Index</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY_MATRIX_ENTRY__ROW_INDEX = eINSTANCE.getCategoryMatrixEntry_RowIndex();

		/**
		 * The meta object literal for the '<em><b>Column Index</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY_MATRIX_ENTRY__COLUMN_INDEX = eINSTANCE.getCategoryMatrixEntry_ColumnIndex();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY_MATRIX_ENTRY__VALUE = eINSTANCE.getCategoryMatrixEntry_Value();

		/**
		 * The meta object literal for the '{@link CWM.MiningCore.MiningData.impl.CategoryMatrixObjectImpl <em>Category Matrix Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.MiningCore.MiningData.impl.CategoryMatrixObjectImpl
		 * @see CWM.MiningCore.MiningData.impl.MiningDataPackageImpl#getCategoryMatrixObject()
		 * @generated
		 */
		EClass CATEGORY_MATRIX_OBJECT = eINSTANCE.getCategoryMatrixObject();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY_MATRIX_OBJECT__ENTRY = eINSTANCE.getCategoryMatrixObject_Entry();

		/**
		 * The meta object literal for the '{@link CWM.MiningCore.MiningData.impl.CategoryMatrixTableImpl <em>Category Matrix Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.MiningCore.MiningData.impl.CategoryMatrixTableImpl
		 * @see CWM.MiningCore.MiningData.impl.MiningDataPackageImpl#getCategoryMatrixTable()
		 * @generated
		 */
		EClass CATEGORY_MATRIX_TABLE = eINSTANCE.getCategoryMatrixTable();

		/**
		 * The meta object literal for the '<em><b>Row Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY_MATRIX_TABLE__ROW_ATTRIBUTE = eINSTANCE.getCategoryMatrixTable_RowAttribute();

		/**
		 * The meta object literal for the '<em><b>Column Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY_MATRIX_TABLE__COLUMN_ATTRIBUTE = eINSTANCE.getCategoryMatrixTable_ColumnAttribute();

		/**
		 * The meta object literal for the '<em><b>Value Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY_MATRIX_TABLE__VALUE_ATTRIBUTE = eINSTANCE.getCategoryMatrixTable_ValueAttribute();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY_MATRIX_TABLE__SOURCE = eINSTANCE.getCategoryMatrixTable_Source();

		/**
		 * The meta object literal for the '{@link CWM.MiningCore.MiningData.impl.CategoryTaxonomyImpl <em>Category Taxonomy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.MiningCore.MiningData.impl.CategoryTaxonomyImpl
		 * @see CWM.MiningCore.MiningData.impl.MiningDataPackageImpl#getCategoryTaxonomy()
		 * @generated
		 */
		EClass CATEGORY_TAXONOMY = eINSTANCE.getCategoryTaxonomy();

		/**
		 * The meta object literal for the '<em><b>Category Map</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY_TAXONOMY__CATEGORY_MAP = eINSTANCE.getCategoryTaxonomy_CategoryMap();

		/**
		 * The meta object literal for the '<em><b>Root Category</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY_TAXONOMY__ROOT_CATEGORY = eINSTANCE.getCategoryTaxonomy_RootCategory();

		/**
		 * The meta object literal for the '{@link CWM.MiningCore.MiningData.impl.MiningData_containerImpl <em>Mining Data container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.MiningCore.MiningData.impl.MiningData_containerImpl
		 * @see CWM.MiningCore.MiningData.impl.MiningDataPackageImpl#getMiningData_container()
		 * @generated
		 */
		EClass MINING_DATA_CONTAINER = eINSTANCE.getMiningData_container();

		/**
		 * The meta object literal for the '<em><b>Attribute Assignment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINING_DATA_CONTAINER__ATTRIBUTE_ASSIGNMENT = eINSTANCE.getMiningData_container_AttributeAssignment();

		/**
		 * The meta object literal for the '<em><b>Attribute Assignment Set</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINING_DATA_CONTAINER__ATTRIBUTE_ASSIGNMENT_SET = eINSTANCE.getMiningData_container_AttributeAssignmentSet();

		/**
		 * The meta object literal for the '<em><b>Attribute Usage</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINING_DATA_CONTAINER__ATTRIBUTE_USAGE = eINSTANCE.getMiningData_container_AttributeUsage();

		/**
		 * The meta object literal for the '<em><b>Attribute Usage Set</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINING_DATA_CONTAINER__ATTRIBUTE_USAGE_SET = eINSTANCE.getMiningData_container_AttributeUsageSet();

		/**
		 * The meta object literal for the '<em><b>Categorical Attribute Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINING_DATA_CONTAINER__CATEGORICAL_ATTRIBUTE_PROPERTIES = eINSTANCE.getMiningData_container_CategoricalAttributeProperties();

		/**
		 * The meta object literal for the '<em><b>Direct Attribute Assignment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINING_DATA_CONTAINER__DIRECT_ATTRIBUTE_ASSIGNMENT = eINSTANCE.getMiningData_container_DirectAttributeAssignment();

		/**
		 * The meta object literal for the '<em><b>Logical Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINING_DATA_CONTAINER__LOGICAL_ATTRIBUTE = eINSTANCE.getMiningData_container_LogicalAttribute();

		/**
		 * The meta object literal for the '<em><b>Logical Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINING_DATA_CONTAINER__LOGICAL_DATA = eINSTANCE.getMiningData_container_LogicalData();

		/**
		 * The meta object literal for the '<em><b>Mining Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINING_DATA_CONTAINER__MINING_ATTRIBUTE = eINSTANCE.getMiningData_container_MiningAttribute();

		/**
		 * The meta object literal for the '<em><b>Numerical Attribute Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINING_DATA_CONTAINER__NUMERICAL_ATTRIBUTE_PROPERTIES = eINSTANCE.getMiningData_container_NumericalAttributeProperties();

		/**
		 * The meta object literal for the '<em><b>Ordinal Attribute Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINING_DATA_CONTAINER__ORDINAL_ATTRIBUTE_PROPERTIES = eINSTANCE.getMiningData_container_OrdinalAttributeProperties();

		/**
		 * The meta object literal for the '<em><b>Physical Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINING_DATA_CONTAINER__PHYSICAL_DATA = eINSTANCE.getMiningData_container_PhysicalData();

		/**
		 * The meta object literal for the '<em><b>Pivot Attribute Assignment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINING_DATA_CONTAINER__PIVOT_ATTRIBUTE_ASSIGNMENT = eINSTANCE.getMiningData_container_PivotAttributeAssignment();

		/**
		 * The meta object literal for the '<em><b>Reverse Pivot Attribute Assignment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINING_DATA_CONTAINER__REVERSE_PIVOT_ATTRIBUTE_ASSIGNMENT = eINSTANCE.getMiningData_container_ReversePivotAttributeAssignment();

		/**
		 * The meta object literal for the '<em><b>Set Attribute Assignment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINING_DATA_CONTAINER__SET_ATTRIBUTE_ASSIGNMENT = eINSTANCE.getMiningData_container_SetAttributeAssignment();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINING_DATA_CONTAINER__CATEGORY = eINSTANCE.getMiningData_container_Category();

		/**
		 * The meta object literal for the '<em><b>Category Map</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINING_DATA_CONTAINER__CATEGORY_MAP = eINSTANCE.getMiningData_container_CategoryMap();

		/**
		 * The meta object literal for the '<em><b>Category Map Object</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINING_DATA_CONTAINER__CATEGORY_MAP_OBJECT = eINSTANCE.getMiningData_container_CategoryMapObject();

		/**
		 * The meta object literal for the '<em><b>Category Map Object Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINING_DATA_CONTAINER__CATEGORY_MAP_OBJECT_ENTRY = eINSTANCE.getMiningData_container_CategoryMapObjectEntry();

		/**
		 * The meta object literal for the '<em><b>Category Map Table</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINING_DATA_CONTAINER__CATEGORY_MAP_TABLE = eINSTANCE.getMiningData_container_CategoryMapTable();

		/**
		 * The meta object literal for the '<em><b>Category Matrix</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINING_DATA_CONTAINER__CATEGORY_MATRIX = eINSTANCE.getMiningData_container_CategoryMatrix();

		/**
		 * The meta object literal for the '<em><b>Category Matrix Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINING_DATA_CONTAINER__CATEGORY_MATRIX_ENTRY = eINSTANCE.getMiningData_container_CategoryMatrixEntry();

		/**
		 * The meta object literal for the '<em><b>Category Matrix Object</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINING_DATA_CONTAINER__CATEGORY_MATRIX_OBJECT = eINSTANCE.getMiningData_container_CategoryMatrixObject();

		/**
		 * The meta object literal for the '<em><b>Category Matrix Table</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINING_DATA_CONTAINER__CATEGORY_MATRIX_TABLE = eINSTANCE.getMiningData_container_CategoryMatrixTable();

		/**
		 * The meta object literal for the '<em><b>Category Taxonomy</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINING_DATA_CONTAINER__CATEGORY_TAXONOMY = eINSTANCE.getMiningData_container_CategoryTaxonomy();

		/**
		 * The meta object literal for the '{@link CWM.MiningCore.MiningData.AttributeSelectionFunction <em>Attribute Selection Function</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.MiningCore.MiningData.AttributeSelectionFunction
		 * @see CWM.MiningCore.MiningData.impl.MiningDataPackageImpl#getAttributeSelectionFunction()
		 * @generated
		 */
		EEnum ATTRIBUTE_SELECTION_FUNCTION = eINSTANCE.getAttributeSelectionFunction();

		/**
		 * The meta object literal for the '{@link CWM.MiningCore.MiningData.AttributeType <em>Attribute Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.MiningCore.MiningData.AttributeType
		 * @see CWM.MiningCore.MiningData.impl.MiningDataPackageImpl#getAttributeType()
		 * @generated
		 */
		EEnum ATTRIBUTE_TYPE = eINSTANCE.getAttributeType();

		/**
		 * The meta object literal for the '{@link CWM.MiningCore.MiningData.OrderType <em>Order Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.MiningCore.MiningData.OrderType
		 * @see CWM.MiningCore.MiningData.impl.MiningDataPackageImpl#getOrderType()
		 * @generated
		 */
		EEnum ORDER_TYPE = eINSTANCE.getOrderType();

		/**
		 * The meta object literal for the '{@link CWM.MiningCore.MiningData.UsageOption <em>Usage Option</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.MiningCore.MiningData.UsageOption
		 * @see CWM.MiningCore.MiningData.impl.MiningDataPackageImpl#getUsageOption()
		 * @generated
		 */
		EEnum USAGE_OPTION = eINSTANCE.getUsageOption();

		/**
		 * The meta object literal for the '{@link CWM.MiningCore.MiningData.ValueSelectionFunction <em>Value Selection Function</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.MiningCore.MiningData.ValueSelectionFunction
		 * @see CWM.MiningCore.MiningData.impl.MiningDataPackageImpl#getValueSelectionFunction()
		 * @generated
		 */
		EEnum VALUE_SELECTION_FUNCTION = eINSTANCE.getValueSelectionFunction();

		/**
		 * The meta object literal for the '{@link CWM.MiningCore.MiningData.CategoryProperty <em>Category Property</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.MiningCore.MiningData.CategoryProperty
		 * @see CWM.MiningCore.MiningData.impl.MiningDataPackageImpl#getCategoryProperty()
		 * @generated
		 */
		EEnum CATEGORY_PROPERTY = eINSTANCE.getCategoryProperty();

		/**
		 * The meta object literal for the '{@link CWM.MiningCore.MiningData.MatrixProperty <em>Matrix Property</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.MiningCore.MiningData.MatrixProperty
		 * @see CWM.MiningCore.MiningData.impl.MiningDataPackageImpl#getMatrixProperty()
		 * @generated
		 */
		EEnum MATRIX_PROPERTY = eINSTANCE.getMatrixProperty();

		/**
		 * The meta object literal for the '<em>Double</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see CWM.MiningCore.MiningData.impl.MiningDataPackageImpl#getDouble()
		 * @generated
		 */
		EDataType DOUBLE = eINSTANCE.getDouble();

	}

} //MiningDataPackage

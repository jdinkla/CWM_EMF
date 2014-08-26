/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningTask;

import CWM.Core.CorePackage;

import CWM.CwmTransformation.CwmTransformationPackage;

import CWM.MiningCore.MiningData.MiningDataPackage;

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
 * @see CWM.MiningCore.MiningTask.MiningTaskFactory
 * @model kind="package"
 * @generated
 */
public interface MiningTaskPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "MiningTask";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "MiningTask";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "MiningTask";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MiningTaskPackage eINSTANCE = CWM.MiningCore.MiningTask.impl.MiningTaskPackageImpl.init();

	/**
	 * The meta object id for the '{@link CWM.MiningCore.MiningTask.impl.ApplyOutputItemImpl <em>Apply Output Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.MiningCore.MiningTask.impl.ApplyOutputItemImpl
	 * @see CWM.MiningCore.MiningTask.impl.MiningTaskPackageImpl#getApplyOutputItem()
	 * @generated
	 */
	int APPLY_OUTPUT_ITEM = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_OUTPUT_ITEM__NAME = MiningDataPackage.MINING_ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_OUTPUT_ITEM__VISIBILITY = MiningDataPackage.MINING_ATTRIBUTE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_OUTPUT_ITEM__CLIENT_DEPENDENCY = MiningDataPackage.MINING_ATTRIBUTE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_OUTPUT_ITEM__CONSTRAINT = MiningDataPackage.MINING_ATTRIBUTE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_OUTPUT_ITEM__IMPORTER = MiningDataPackage.MINING_ATTRIBUTE__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_OUTPUT_ITEM__NAMESPACE = MiningDataPackage.MINING_ATTRIBUTE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_OUTPUT_ITEM__TAGGED_VALUE = MiningDataPackage.MINING_ATTRIBUTE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owner Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_OUTPUT_ITEM__OWNER_SCOPE = MiningDataPackage.MINING_ATTRIBUTE__OWNER_SCOPE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_OUTPUT_ITEM__OWNER = MiningDataPackage.MINING_ATTRIBUTE__OWNER;

	/**
	 * The feature id for the '<em><b>Changeability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_OUTPUT_ITEM__CHANGEABILITY = MiningDataPackage.MINING_ATTRIBUTE__CHANGEABILITY;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_OUTPUT_ITEM__MULTIPLICITY = MiningDataPackage.MINING_ATTRIBUTE__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_OUTPUT_ITEM__ORDERING = MiningDataPackage.MINING_ATTRIBUTE__ORDERING;

	/**
	 * The feature id for the '<em><b>Target Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_OUTPUT_ITEM__TARGET_SCOPE = MiningDataPackage.MINING_ATTRIBUTE__TARGET_SCOPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_OUTPUT_ITEM__TYPE = MiningDataPackage.MINING_ATTRIBUTE__TYPE;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_OUTPUT_ITEM__INITIAL_VALUE = MiningDataPackage.MINING_ATTRIBUTE__INITIAL_VALUE;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_OUTPUT_ITEM__DISPLAY_NAME = MiningDataPackage.MINING_ATTRIBUTE__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Attribute Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_OUTPUT_ITEM__ATTRIBUTE_TYPE = MiningDataPackage.MINING_ATTRIBUTE__ATTRIBUTE_TYPE;

	/**
	 * The number of structural features of the '<em>Apply Output Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_OUTPUT_ITEM_FEATURE_COUNT = MiningDataPackage.MINING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CWM.MiningCore.MiningTask.impl.ApplyContentItemImpl <em>Apply Content Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.MiningCore.MiningTask.impl.ApplyContentItemImpl
	 * @see CWM.MiningCore.MiningTask.impl.MiningTaskPackageImpl#getApplyContentItem()
	 * @generated
	 */
	int APPLY_CONTENT_ITEM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_CONTENT_ITEM__NAME = APPLY_OUTPUT_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_CONTENT_ITEM__VISIBILITY = APPLY_OUTPUT_ITEM__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_CONTENT_ITEM__CLIENT_DEPENDENCY = APPLY_OUTPUT_ITEM__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_CONTENT_ITEM__CONSTRAINT = APPLY_OUTPUT_ITEM__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_CONTENT_ITEM__IMPORTER = APPLY_OUTPUT_ITEM__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_CONTENT_ITEM__NAMESPACE = APPLY_OUTPUT_ITEM__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_CONTENT_ITEM__TAGGED_VALUE = APPLY_OUTPUT_ITEM__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owner Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_CONTENT_ITEM__OWNER_SCOPE = APPLY_OUTPUT_ITEM__OWNER_SCOPE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_CONTENT_ITEM__OWNER = APPLY_OUTPUT_ITEM__OWNER;

	/**
	 * The feature id for the '<em><b>Changeability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_CONTENT_ITEM__CHANGEABILITY = APPLY_OUTPUT_ITEM__CHANGEABILITY;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_CONTENT_ITEM__MULTIPLICITY = APPLY_OUTPUT_ITEM__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_CONTENT_ITEM__ORDERING = APPLY_OUTPUT_ITEM__ORDERING;

	/**
	 * The feature id for the '<em><b>Target Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_CONTENT_ITEM__TARGET_SCOPE = APPLY_OUTPUT_ITEM__TARGET_SCOPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_CONTENT_ITEM__TYPE = APPLY_OUTPUT_ITEM__TYPE;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_CONTENT_ITEM__INITIAL_VALUE = APPLY_OUTPUT_ITEM__INITIAL_VALUE;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_CONTENT_ITEM__DISPLAY_NAME = APPLY_OUTPUT_ITEM__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Attribute Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_CONTENT_ITEM__ATTRIBUTE_TYPE = APPLY_OUTPUT_ITEM__ATTRIBUTE_TYPE;

	/**
	 * The feature id for the '<em><b>Top Nth Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_CONTENT_ITEM__TOP_NTH_INDEX = APPLY_OUTPUT_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Apply Content Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_CONTENT_ITEM_FEATURE_COUNT = APPLY_OUTPUT_ITEM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CWM.MiningCore.MiningTask.impl.ApplyProbabilityItemImpl <em>Apply Probability Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.MiningCore.MiningTask.impl.ApplyProbabilityItemImpl
	 * @see CWM.MiningCore.MiningTask.impl.MiningTaskPackageImpl#getApplyProbabilityItem()
	 * @generated
	 */
	int APPLY_PROBABILITY_ITEM = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_PROBABILITY_ITEM__NAME = APPLY_CONTENT_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_PROBABILITY_ITEM__VISIBILITY = APPLY_CONTENT_ITEM__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_PROBABILITY_ITEM__CLIENT_DEPENDENCY = APPLY_CONTENT_ITEM__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_PROBABILITY_ITEM__CONSTRAINT = APPLY_CONTENT_ITEM__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_PROBABILITY_ITEM__IMPORTER = APPLY_CONTENT_ITEM__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_PROBABILITY_ITEM__NAMESPACE = APPLY_CONTENT_ITEM__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_PROBABILITY_ITEM__TAGGED_VALUE = APPLY_CONTENT_ITEM__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owner Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_PROBABILITY_ITEM__OWNER_SCOPE = APPLY_CONTENT_ITEM__OWNER_SCOPE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_PROBABILITY_ITEM__OWNER = APPLY_CONTENT_ITEM__OWNER;

	/**
	 * The feature id for the '<em><b>Changeability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_PROBABILITY_ITEM__CHANGEABILITY = APPLY_CONTENT_ITEM__CHANGEABILITY;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_PROBABILITY_ITEM__MULTIPLICITY = APPLY_CONTENT_ITEM__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_PROBABILITY_ITEM__ORDERING = APPLY_CONTENT_ITEM__ORDERING;

	/**
	 * The feature id for the '<em><b>Target Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_PROBABILITY_ITEM__TARGET_SCOPE = APPLY_CONTENT_ITEM__TARGET_SCOPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_PROBABILITY_ITEM__TYPE = APPLY_CONTENT_ITEM__TYPE;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_PROBABILITY_ITEM__INITIAL_VALUE = APPLY_CONTENT_ITEM__INITIAL_VALUE;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_PROBABILITY_ITEM__DISPLAY_NAME = APPLY_CONTENT_ITEM__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Attribute Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_PROBABILITY_ITEM__ATTRIBUTE_TYPE = APPLY_CONTENT_ITEM__ATTRIBUTE_TYPE;

	/**
	 * The feature id for the '<em><b>Top Nth Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_PROBABILITY_ITEM__TOP_NTH_INDEX = APPLY_CONTENT_ITEM__TOP_NTH_INDEX;

	/**
	 * The number of structural features of the '<em>Apply Probability Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_PROBABILITY_ITEM_FEATURE_COUNT = APPLY_CONTENT_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CWM.MiningCore.MiningTask.impl.ApplyRuleIdItemImpl <em>Apply Rule Id Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.MiningCore.MiningTask.impl.ApplyRuleIdItemImpl
	 * @see CWM.MiningCore.MiningTask.impl.MiningTaskPackageImpl#getApplyRuleIdItem()
	 * @generated
	 */
	int APPLY_RULE_ID_ITEM = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_RULE_ID_ITEM__NAME = APPLY_CONTENT_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_RULE_ID_ITEM__VISIBILITY = APPLY_CONTENT_ITEM__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_RULE_ID_ITEM__CLIENT_DEPENDENCY = APPLY_CONTENT_ITEM__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_RULE_ID_ITEM__CONSTRAINT = APPLY_CONTENT_ITEM__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_RULE_ID_ITEM__IMPORTER = APPLY_CONTENT_ITEM__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_RULE_ID_ITEM__NAMESPACE = APPLY_CONTENT_ITEM__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_RULE_ID_ITEM__TAGGED_VALUE = APPLY_CONTENT_ITEM__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owner Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_RULE_ID_ITEM__OWNER_SCOPE = APPLY_CONTENT_ITEM__OWNER_SCOPE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_RULE_ID_ITEM__OWNER = APPLY_CONTENT_ITEM__OWNER;

	/**
	 * The feature id for the '<em><b>Changeability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_RULE_ID_ITEM__CHANGEABILITY = APPLY_CONTENT_ITEM__CHANGEABILITY;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_RULE_ID_ITEM__MULTIPLICITY = APPLY_CONTENT_ITEM__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_RULE_ID_ITEM__ORDERING = APPLY_CONTENT_ITEM__ORDERING;

	/**
	 * The feature id for the '<em><b>Target Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_RULE_ID_ITEM__TARGET_SCOPE = APPLY_CONTENT_ITEM__TARGET_SCOPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_RULE_ID_ITEM__TYPE = APPLY_CONTENT_ITEM__TYPE;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_RULE_ID_ITEM__INITIAL_VALUE = APPLY_CONTENT_ITEM__INITIAL_VALUE;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_RULE_ID_ITEM__DISPLAY_NAME = APPLY_CONTENT_ITEM__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Attribute Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_RULE_ID_ITEM__ATTRIBUTE_TYPE = APPLY_CONTENT_ITEM__ATTRIBUTE_TYPE;

	/**
	 * The feature id for the '<em><b>Top Nth Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_RULE_ID_ITEM__TOP_NTH_INDEX = APPLY_CONTENT_ITEM__TOP_NTH_INDEX;

	/**
	 * The number of structural features of the '<em>Apply Rule Id Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_RULE_ID_ITEM_FEATURE_COUNT = APPLY_CONTENT_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CWM.MiningCore.MiningTask.impl.ApplyScoreItemImpl <em>Apply Score Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.MiningCore.MiningTask.impl.ApplyScoreItemImpl
	 * @see CWM.MiningCore.MiningTask.impl.MiningTaskPackageImpl#getApplyScoreItem()
	 * @generated
	 */
	int APPLY_SCORE_ITEM = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_SCORE_ITEM__NAME = APPLY_CONTENT_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_SCORE_ITEM__VISIBILITY = APPLY_CONTENT_ITEM__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_SCORE_ITEM__CLIENT_DEPENDENCY = APPLY_CONTENT_ITEM__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_SCORE_ITEM__CONSTRAINT = APPLY_CONTENT_ITEM__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_SCORE_ITEM__IMPORTER = APPLY_CONTENT_ITEM__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_SCORE_ITEM__NAMESPACE = APPLY_CONTENT_ITEM__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_SCORE_ITEM__TAGGED_VALUE = APPLY_CONTENT_ITEM__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owner Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_SCORE_ITEM__OWNER_SCOPE = APPLY_CONTENT_ITEM__OWNER_SCOPE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_SCORE_ITEM__OWNER = APPLY_CONTENT_ITEM__OWNER;

	/**
	 * The feature id for the '<em><b>Changeability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_SCORE_ITEM__CHANGEABILITY = APPLY_CONTENT_ITEM__CHANGEABILITY;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_SCORE_ITEM__MULTIPLICITY = APPLY_CONTENT_ITEM__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_SCORE_ITEM__ORDERING = APPLY_CONTENT_ITEM__ORDERING;

	/**
	 * The feature id for the '<em><b>Target Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_SCORE_ITEM__TARGET_SCOPE = APPLY_CONTENT_ITEM__TARGET_SCOPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_SCORE_ITEM__TYPE = APPLY_CONTENT_ITEM__TYPE;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_SCORE_ITEM__INITIAL_VALUE = APPLY_CONTENT_ITEM__INITIAL_VALUE;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_SCORE_ITEM__DISPLAY_NAME = APPLY_CONTENT_ITEM__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Attribute Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_SCORE_ITEM__ATTRIBUTE_TYPE = APPLY_CONTENT_ITEM__ATTRIBUTE_TYPE;

	/**
	 * The feature id for the '<em><b>Top Nth Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_SCORE_ITEM__TOP_NTH_INDEX = APPLY_CONTENT_ITEM__TOP_NTH_INDEX;

	/**
	 * The number of structural features of the '<em>Apply Score Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_SCORE_ITEM_FEATURE_COUNT = APPLY_CONTENT_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CWM.MiningCore.MiningTask.impl.ApplySourceItemImpl <em>Apply Source Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.MiningCore.MiningTask.impl.ApplySourceItemImpl
	 * @see CWM.MiningCore.MiningTask.impl.MiningTaskPackageImpl#getApplySourceItem()
	 * @generated
	 */
	int APPLY_SOURCE_ITEM = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_SOURCE_ITEM__NAME = APPLY_OUTPUT_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_SOURCE_ITEM__VISIBILITY = APPLY_OUTPUT_ITEM__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_SOURCE_ITEM__CLIENT_DEPENDENCY = APPLY_OUTPUT_ITEM__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_SOURCE_ITEM__CONSTRAINT = APPLY_OUTPUT_ITEM__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_SOURCE_ITEM__IMPORTER = APPLY_OUTPUT_ITEM__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_SOURCE_ITEM__NAMESPACE = APPLY_OUTPUT_ITEM__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_SOURCE_ITEM__TAGGED_VALUE = APPLY_OUTPUT_ITEM__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owner Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_SOURCE_ITEM__OWNER_SCOPE = APPLY_OUTPUT_ITEM__OWNER_SCOPE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_SOURCE_ITEM__OWNER = APPLY_OUTPUT_ITEM__OWNER;

	/**
	 * The feature id for the '<em><b>Changeability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_SOURCE_ITEM__CHANGEABILITY = APPLY_OUTPUT_ITEM__CHANGEABILITY;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_SOURCE_ITEM__MULTIPLICITY = APPLY_OUTPUT_ITEM__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_SOURCE_ITEM__ORDERING = APPLY_OUTPUT_ITEM__ORDERING;

	/**
	 * The feature id for the '<em><b>Target Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_SOURCE_ITEM__TARGET_SCOPE = APPLY_OUTPUT_ITEM__TARGET_SCOPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_SOURCE_ITEM__TYPE = APPLY_OUTPUT_ITEM__TYPE;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_SOURCE_ITEM__INITIAL_VALUE = APPLY_OUTPUT_ITEM__INITIAL_VALUE;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_SOURCE_ITEM__DISPLAY_NAME = APPLY_OUTPUT_ITEM__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Attribute Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_SOURCE_ITEM__ATTRIBUTE_TYPE = APPLY_OUTPUT_ITEM__ATTRIBUTE_TYPE;

	/**
	 * The number of structural features of the '<em>Apply Source Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLY_SOURCE_ITEM_FEATURE_COUNT = APPLY_OUTPUT_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CWM.MiningCore.MiningTask.impl.MiningApplyOutputImpl <em>Mining Apply Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.MiningCore.MiningTask.impl.MiningApplyOutputImpl
	 * @see CWM.MiningCore.MiningTask.impl.MiningTaskPackageImpl#getMiningApplyOutput()
	 * @generated
	 */
	int MINING_APPLY_OUTPUT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_APPLY_OUTPUT__NAME = CorePackage.MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_APPLY_OUTPUT__VISIBILITY = CorePackage.MODEL_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_APPLY_OUTPUT__CLIENT_DEPENDENCY = CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_APPLY_OUTPUT__CONSTRAINT = CorePackage.MODEL_ELEMENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_APPLY_OUTPUT__IMPORTER = CorePackage.MODEL_ELEMENT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_APPLY_OUTPUT__NAMESPACE = CorePackage.MODEL_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_APPLY_OUTPUT__TAGGED_VALUE = CorePackage.MODEL_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_APPLY_OUTPUT__ITEM = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mining Apply Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_APPLY_OUTPUT_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CWM.MiningCore.MiningTask.impl.MiningTaskImpl <em>Mining Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.MiningCore.MiningTask.impl.MiningTaskImpl
	 * @see CWM.MiningCore.MiningTask.impl.MiningTaskPackageImpl#getMiningTask()
	 * @generated
	 */
	int MINING_TASK = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_TASK__NAME = CorePackage.MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_TASK__VISIBILITY = CorePackage.MODEL_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_TASK__CLIENT_DEPENDENCY = CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_TASK__CONSTRAINT = CorePackage.MODEL_ELEMENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_TASK__IMPORTER = CorePackage.MODEL_ELEMENT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_TASK__NAMESPACE = CorePackage.MODEL_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_TASK__TAGGED_VALUE = CorePackage.MODEL_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Input Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_TASK__INPUT_DATA = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Assignment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_TASK__MODEL_ASSIGNMENT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_TASK__INPUT_MODEL = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Mining Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_TASK_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link CWM.MiningCore.MiningTask.impl.MiningApplyTaskImpl <em>Mining Apply Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.MiningCore.MiningTask.impl.MiningApplyTaskImpl
	 * @see CWM.MiningCore.MiningTask.impl.MiningTaskPackageImpl#getMiningApplyTask()
	 * @generated
	 */
	int MINING_APPLY_TASK = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_APPLY_TASK__NAME = MINING_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_APPLY_TASK__VISIBILITY = MINING_TASK__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_APPLY_TASK__CLIENT_DEPENDENCY = MINING_TASK__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_APPLY_TASK__CONSTRAINT = MINING_TASK__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_APPLY_TASK__IMPORTER = MINING_TASK__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_APPLY_TASK__NAMESPACE = MINING_TASK__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_APPLY_TASK__TAGGED_VALUE = MINING_TASK__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Input Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_APPLY_TASK__INPUT_DATA = MINING_TASK__INPUT_DATA;

	/**
	 * The feature id for the '<em><b>Model Assignment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_APPLY_TASK__MODEL_ASSIGNMENT = MINING_TASK__MODEL_ASSIGNMENT;

	/**
	 * The feature id for the '<em><b>Input Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_APPLY_TASK__INPUT_MODEL = MINING_TASK__INPUT_MODEL;

	/**
	 * The feature id for the '<em><b>Apply Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_APPLY_TASK__APPLY_OUTPUT = MINING_TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output Assignment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_APPLY_TASK__OUTPUT_ASSIGNMENT = MINING_TASK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_APPLY_TASK__OUTPUT_OPTION = MINING_TASK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Mining Apply Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_APPLY_TASK_FEATURE_COUNT = MINING_TASK_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link CWM.MiningCore.MiningTask.impl.MiningBuildTaskImpl <em>Mining Build Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.MiningCore.MiningTask.impl.MiningBuildTaskImpl
	 * @see CWM.MiningCore.MiningTask.impl.MiningTaskPackageImpl#getMiningBuildTask()
	 * @generated
	 */
	int MINING_BUILD_TASK = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_BUILD_TASK__NAME = MINING_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_BUILD_TASK__VISIBILITY = MINING_TASK__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_BUILD_TASK__CLIENT_DEPENDENCY = MINING_TASK__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_BUILD_TASK__CONSTRAINT = MINING_TASK__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_BUILD_TASK__IMPORTER = MINING_TASK__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_BUILD_TASK__NAMESPACE = MINING_TASK__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_BUILD_TASK__TAGGED_VALUE = MINING_TASK__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Input Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_BUILD_TASK__INPUT_DATA = MINING_TASK__INPUT_DATA;

	/**
	 * The feature id for the '<em><b>Model Assignment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_BUILD_TASK__MODEL_ASSIGNMENT = MINING_TASK__MODEL_ASSIGNMENT;

	/**
	 * The feature id for the '<em><b>Input Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_BUILD_TASK__INPUT_MODEL = MINING_TASK__INPUT_MODEL;

	/**
	 * The feature id for the '<em><b>Mining Settings</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_BUILD_TASK__MINING_SETTINGS = MINING_TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Settings Assignment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_BUILD_TASK__SETTINGS_ASSIGNMENT = MINING_TASK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Validation Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_BUILD_TASK__VALIDATION_DATA = MINING_TASK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Validation Assignment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_BUILD_TASK__VALIDATION_ASSIGNMENT = MINING_TASK_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Result Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_BUILD_TASK__RESULT_MODEL = MINING_TASK_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Mining Build Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_BUILD_TASK_FEATURE_COUNT = MINING_TASK_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link CWM.MiningCore.MiningTask.impl.MiningTransformationImpl <em>Mining Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.MiningCore.MiningTask.impl.MiningTransformationImpl
	 * @see CWM.MiningCore.MiningTask.impl.MiningTaskPackageImpl#getMiningTransformation()
	 * @generated
	 */
	int MINING_TRANSFORMATION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_TRANSFORMATION__NAME = CwmTransformationPackage.TRANSFORMATION__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_TRANSFORMATION__VISIBILITY = CwmTransformationPackage.TRANSFORMATION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_TRANSFORMATION__CLIENT_DEPENDENCY = CwmTransformationPackage.TRANSFORMATION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_TRANSFORMATION__CONSTRAINT = CwmTransformationPackage.TRANSFORMATION__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_TRANSFORMATION__IMPORTER = CwmTransformationPackage.TRANSFORMATION__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_TRANSFORMATION__NAMESPACE = CwmTransformationPackage.TRANSFORMATION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_TRANSFORMATION__TAGGED_VALUE = CwmTransformationPackage.TRANSFORMATION__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_TRANSFORMATION__OWNED_ELEMENT = CwmTransformationPackage.TRANSFORMATION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_TRANSFORMATION__FUNCTION = CwmTransformationPackage.TRANSFORMATION__FUNCTION;

	/**
	 * The feature id for the '<em><b>Function Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_TRANSFORMATION__FUNCTION_DESCRIPTION = CwmTransformationPackage.TRANSFORMATION__FUNCTION_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Primary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_TRANSFORMATION__IS_PRIMARY = CwmTransformationPackage.TRANSFORMATION__IS_PRIMARY;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_TRANSFORMATION__SOURCE = CwmTransformationPackage.TRANSFORMATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_TRANSFORMATION__TARGET = CwmTransformationPackage.TRANSFORMATION__TARGET;

	/**
	 * The feature id for the '<em><b>Use</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_TRANSFORMATION__USE = CwmTransformationPackage.TRANSFORMATION__USE;

	/**
	 * The feature id for the '<em><b>Procedure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_TRANSFORMATION__PROCEDURE = CwmTransformationPackage.TRANSFORMATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mining Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_TRANSFORMATION_FEATURE_COUNT = CwmTransformationPackage.TRANSFORMATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CWM.MiningCore.MiningTask.impl.MiningTask_containerImpl <em>Mining Task container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.MiningCore.MiningTask.impl.MiningTask_containerImpl
	 * @see CWM.MiningCore.MiningTask.impl.MiningTaskPackageImpl#getMiningTask_container()
	 * @generated
	 */
	int MINING_TASK_CONTAINER = 11;

	/**
	 * The feature id for the '<em><b>Apply Content Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_TASK_CONTAINER__APPLY_CONTENT_ITEM = 0;

	/**
	 * The feature id for the '<em><b>Apply Output Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_TASK_CONTAINER__APPLY_OUTPUT_ITEM = 1;

	/**
	 * The feature id for the '<em><b>Apply Probability Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_TASK_CONTAINER__APPLY_PROBABILITY_ITEM = 2;

	/**
	 * The feature id for the '<em><b>Apply Rule Id Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_TASK_CONTAINER__APPLY_RULE_ID_ITEM = 3;

	/**
	 * The feature id for the '<em><b>Apply Score Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_TASK_CONTAINER__APPLY_SCORE_ITEM = 4;

	/**
	 * The feature id for the '<em><b>Apply Source Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_TASK_CONTAINER__APPLY_SOURCE_ITEM = 5;

	/**
	 * The feature id for the '<em><b>Mining Apply Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_TASK_CONTAINER__MINING_APPLY_OUTPUT = 6;

	/**
	 * The feature id for the '<em><b>Mining Apply Task</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_TASK_CONTAINER__MINING_APPLY_TASK = 7;

	/**
	 * The feature id for the '<em><b>Mining Build Task</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_TASK_CONTAINER__MINING_BUILD_TASK = 8;

	/**
	 * The feature id for the '<em><b>Mining Task</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_TASK_CONTAINER__MINING_TASK = 9;

	/**
	 * The feature id for the '<em><b>Mining Transformation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_TASK_CONTAINER__MINING_TRANSFORMATION = 10;

	/**
	 * The number of structural features of the '<em>Mining Task container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_TASK_CONTAINER_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link CWM.MiningCore.MiningTask.ApplyOutputOption <em>Apply Output Option</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.MiningCore.MiningTask.ApplyOutputOption
	 * @see CWM.MiningCore.MiningTask.impl.MiningTaskPackageImpl#getApplyOutputOption()
	 * @generated
	 */
	int APPLY_OUTPUT_OPTION = 12;


	/**
	 * Returns the meta object for class '{@link CWM.MiningCore.MiningTask.ApplyContentItem <em>Apply Content Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Apply Content Item</em>'.
	 * @see CWM.MiningCore.MiningTask.ApplyContentItem
	 * @generated
	 */
	EClass getApplyContentItem();

	/**
	 * Returns the meta object for the attribute '{@link CWM.MiningCore.MiningTask.ApplyContentItem#getTopNthIndex <em>Top Nth Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Top Nth Index</em>'.
	 * @see CWM.MiningCore.MiningTask.ApplyContentItem#getTopNthIndex()
	 * @see #getApplyContentItem()
	 * @generated
	 */
	EAttribute getApplyContentItem_TopNthIndex();

	/**
	 * Returns the meta object for class '{@link CWM.MiningCore.MiningTask.ApplyOutputItem <em>Apply Output Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Apply Output Item</em>'.
	 * @see CWM.MiningCore.MiningTask.ApplyOutputItem
	 * @generated
	 */
	EClass getApplyOutputItem();

	/**
	 * Returns the meta object for class '{@link CWM.MiningCore.MiningTask.ApplyProbabilityItem <em>Apply Probability Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Apply Probability Item</em>'.
	 * @see CWM.MiningCore.MiningTask.ApplyProbabilityItem
	 * @generated
	 */
	EClass getApplyProbabilityItem();

	/**
	 * Returns the meta object for class '{@link CWM.MiningCore.MiningTask.ApplyRuleIdItem <em>Apply Rule Id Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Apply Rule Id Item</em>'.
	 * @see CWM.MiningCore.MiningTask.ApplyRuleIdItem
	 * @generated
	 */
	EClass getApplyRuleIdItem();

	/**
	 * Returns the meta object for class '{@link CWM.MiningCore.MiningTask.ApplyScoreItem <em>Apply Score Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Apply Score Item</em>'.
	 * @see CWM.MiningCore.MiningTask.ApplyScoreItem
	 * @generated
	 */
	EClass getApplyScoreItem();

	/**
	 * Returns the meta object for class '{@link CWM.MiningCore.MiningTask.ApplySourceItem <em>Apply Source Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Apply Source Item</em>'.
	 * @see CWM.MiningCore.MiningTask.ApplySourceItem
	 * @generated
	 */
	EClass getApplySourceItem();

	/**
	 * Returns the meta object for class '{@link CWM.MiningCore.MiningTask.MiningApplyOutput <em>Mining Apply Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mining Apply Output</em>'.
	 * @see CWM.MiningCore.MiningTask.MiningApplyOutput
	 * @generated
	 */
	EClass getMiningApplyOutput();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.MiningCore.MiningTask.MiningApplyOutput#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item</em>'.
	 * @see CWM.MiningCore.MiningTask.MiningApplyOutput#getItem()
	 * @see #getMiningApplyOutput()
	 * @generated
	 */
	EReference getMiningApplyOutput_Item();

	/**
	 * Returns the meta object for class '{@link CWM.MiningCore.MiningTask.MiningApplyTask <em>Mining Apply Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mining Apply Task</em>'.
	 * @see CWM.MiningCore.MiningTask.MiningApplyTask
	 * @generated
	 */
	EClass getMiningApplyTask();

	/**
	 * Returns the meta object for the reference '{@link CWM.MiningCore.MiningTask.MiningApplyTask#getApplyOutput <em>Apply Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Apply Output</em>'.
	 * @see CWM.MiningCore.MiningTask.MiningApplyTask#getApplyOutput()
	 * @see #getMiningApplyTask()
	 * @generated
	 */
	EReference getMiningApplyTask_ApplyOutput();

	/**
	 * Returns the meta object for the reference '{@link CWM.MiningCore.MiningTask.MiningApplyTask#getOutputAssignment <em>Output Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output Assignment</em>'.
	 * @see CWM.MiningCore.MiningTask.MiningApplyTask#getOutputAssignment()
	 * @see #getMiningApplyTask()
	 * @generated
	 */
	EReference getMiningApplyTask_OutputAssignment();

	/**
	 * Returns the meta object for the attribute '{@link CWM.MiningCore.MiningTask.MiningApplyTask#getOutputOption <em>Output Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Option</em>'.
	 * @see CWM.MiningCore.MiningTask.MiningApplyTask#getOutputOption()
	 * @see #getMiningApplyTask()
	 * @generated
	 */
	EAttribute getMiningApplyTask_OutputOption();

	/**
	 * Returns the meta object for class '{@link CWM.MiningCore.MiningTask.MiningBuildTask <em>Mining Build Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mining Build Task</em>'.
	 * @see CWM.MiningCore.MiningTask.MiningBuildTask
	 * @generated
	 */
	EClass getMiningBuildTask();

	/**
	 * Returns the meta object for the reference '{@link CWM.MiningCore.MiningTask.MiningBuildTask#getMiningSettings <em>Mining Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mining Settings</em>'.
	 * @see CWM.MiningCore.MiningTask.MiningBuildTask#getMiningSettings()
	 * @see #getMiningBuildTask()
	 * @generated
	 */
	EReference getMiningBuildTask_MiningSettings();

	/**
	 * Returns the meta object for the reference '{@link CWM.MiningCore.MiningTask.MiningBuildTask#getSettingsAssignment <em>Settings Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Settings Assignment</em>'.
	 * @see CWM.MiningCore.MiningTask.MiningBuildTask#getSettingsAssignment()
	 * @see #getMiningBuildTask()
	 * @generated
	 */
	EReference getMiningBuildTask_SettingsAssignment();

	/**
	 * Returns the meta object for the reference '{@link CWM.MiningCore.MiningTask.MiningBuildTask#getValidationData <em>Validation Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Validation Data</em>'.
	 * @see CWM.MiningCore.MiningTask.MiningBuildTask#getValidationData()
	 * @see #getMiningBuildTask()
	 * @generated
	 */
	EReference getMiningBuildTask_ValidationData();

	/**
	 * Returns the meta object for the reference '{@link CWM.MiningCore.MiningTask.MiningBuildTask#getValidationAssignment <em>Validation Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Validation Assignment</em>'.
	 * @see CWM.MiningCore.MiningTask.MiningBuildTask#getValidationAssignment()
	 * @see #getMiningBuildTask()
	 * @generated
	 */
	EReference getMiningBuildTask_ValidationAssignment();

	/**
	 * Returns the meta object for the reference '{@link CWM.MiningCore.MiningTask.MiningBuildTask#getResultModel <em>Result Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Result Model</em>'.
	 * @see CWM.MiningCore.MiningTask.MiningBuildTask#getResultModel()
	 * @see #getMiningBuildTask()
	 * @generated
	 */
	EReference getMiningBuildTask_ResultModel();

	/**
	 * Returns the meta object for class '{@link CWM.MiningCore.MiningTask.MiningTask <em>Mining Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mining Task</em>'.
	 * @see CWM.MiningCore.MiningTask.MiningTask
	 * @generated
	 */
	EClass getMiningTask();

	/**
	 * Returns the meta object for the reference '{@link CWM.MiningCore.MiningTask.MiningTask#getInputData <em>Input Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input Data</em>'.
	 * @see CWM.MiningCore.MiningTask.MiningTask#getInputData()
	 * @see #getMiningTask()
	 * @generated
	 */
	EReference getMiningTask_InputData();

	/**
	 * Returns the meta object for the reference '{@link CWM.MiningCore.MiningTask.MiningTask#getModelAssignment <em>Model Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model Assignment</em>'.
	 * @see CWM.MiningCore.MiningTask.MiningTask#getModelAssignment()
	 * @see #getMiningTask()
	 * @generated
	 */
	EReference getMiningTask_ModelAssignment();

	/**
	 * Returns the meta object for the reference '{@link CWM.MiningCore.MiningTask.MiningTask#getInputModel <em>Input Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input Model</em>'.
	 * @see CWM.MiningCore.MiningTask.MiningTask#getInputModel()
	 * @see #getMiningTask()
	 * @generated
	 */
	EReference getMiningTask_InputModel();

	/**
	 * Returns the meta object for class '{@link CWM.MiningCore.MiningTask.MiningTransformation <em>Mining Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mining Transformation</em>'.
	 * @see CWM.MiningCore.MiningTask.MiningTransformation
	 * @generated
	 */
	EClass getMiningTransformation();

	/**
	 * Returns the meta object for the reference '{@link CWM.MiningCore.MiningTask.MiningTransformation#getProcedure <em>Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Procedure</em>'.
	 * @see CWM.MiningCore.MiningTask.MiningTransformation#getProcedure()
	 * @see #getMiningTransformation()
	 * @generated
	 */
	EReference getMiningTransformation_Procedure();

	/**
	 * Returns the meta object for class '{@link CWM.MiningCore.MiningTask.MiningTask_container <em>Mining Task container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mining Task container</em>'.
	 * @see CWM.MiningCore.MiningTask.MiningTask_container
	 * @generated
	 */
	EClass getMiningTask_container();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.MiningCore.MiningTask.MiningTask_container#getApplyContentItem <em>Apply Content Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Apply Content Item</em>'.
	 * @see CWM.MiningCore.MiningTask.MiningTask_container#getApplyContentItem()
	 * @see #getMiningTask_container()
	 * @generated
	 */
	EReference getMiningTask_container_ApplyContentItem();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.MiningCore.MiningTask.MiningTask_container#getApplyOutputItem <em>Apply Output Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Apply Output Item</em>'.
	 * @see CWM.MiningCore.MiningTask.MiningTask_container#getApplyOutputItem()
	 * @see #getMiningTask_container()
	 * @generated
	 */
	EReference getMiningTask_container_ApplyOutputItem();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.MiningCore.MiningTask.MiningTask_container#getApplyProbabilityItem <em>Apply Probability Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Apply Probability Item</em>'.
	 * @see CWM.MiningCore.MiningTask.MiningTask_container#getApplyProbabilityItem()
	 * @see #getMiningTask_container()
	 * @generated
	 */
	EReference getMiningTask_container_ApplyProbabilityItem();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.MiningCore.MiningTask.MiningTask_container#getApplyRuleIdItem <em>Apply Rule Id Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Apply Rule Id Item</em>'.
	 * @see CWM.MiningCore.MiningTask.MiningTask_container#getApplyRuleIdItem()
	 * @see #getMiningTask_container()
	 * @generated
	 */
	EReference getMiningTask_container_ApplyRuleIdItem();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.MiningCore.MiningTask.MiningTask_container#getApplyScoreItem <em>Apply Score Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Apply Score Item</em>'.
	 * @see CWM.MiningCore.MiningTask.MiningTask_container#getApplyScoreItem()
	 * @see #getMiningTask_container()
	 * @generated
	 */
	EReference getMiningTask_container_ApplyScoreItem();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.MiningCore.MiningTask.MiningTask_container#getApplySourceItem <em>Apply Source Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Apply Source Item</em>'.
	 * @see CWM.MiningCore.MiningTask.MiningTask_container#getApplySourceItem()
	 * @see #getMiningTask_container()
	 * @generated
	 */
	EReference getMiningTask_container_ApplySourceItem();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.MiningCore.MiningTask.MiningTask_container#getMiningApplyOutput <em>Mining Apply Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mining Apply Output</em>'.
	 * @see CWM.MiningCore.MiningTask.MiningTask_container#getMiningApplyOutput()
	 * @see #getMiningTask_container()
	 * @generated
	 */
	EReference getMiningTask_container_MiningApplyOutput();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.MiningCore.MiningTask.MiningTask_container#getMiningApplyTask <em>Mining Apply Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mining Apply Task</em>'.
	 * @see CWM.MiningCore.MiningTask.MiningTask_container#getMiningApplyTask()
	 * @see #getMiningTask_container()
	 * @generated
	 */
	EReference getMiningTask_container_MiningApplyTask();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.MiningCore.MiningTask.MiningTask_container#getMiningBuildTask <em>Mining Build Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mining Build Task</em>'.
	 * @see CWM.MiningCore.MiningTask.MiningTask_container#getMiningBuildTask()
	 * @see #getMiningTask_container()
	 * @generated
	 */
	EReference getMiningTask_container_MiningBuildTask();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.MiningCore.MiningTask.MiningTask_container#getMiningTask <em>Mining Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mining Task</em>'.
	 * @see CWM.MiningCore.MiningTask.MiningTask_container#getMiningTask()
	 * @see #getMiningTask_container()
	 * @generated
	 */
	EReference getMiningTask_container_MiningTask();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.MiningCore.MiningTask.MiningTask_container#getMiningTransformation <em>Mining Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mining Transformation</em>'.
	 * @see CWM.MiningCore.MiningTask.MiningTask_container#getMiningTransformation()
	 * @see #getMiningTask_container()
	 * @generated
	 */
	EReference getMiningTask_container_MiningTransformation();

	/**
	 * Returns the meta object for enum '{@link CWM.MiningCore.MiningTask.ApplyOutputOption <em>Apply Output Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Apply Output Option</em>'.
	 * @see CWM.MiningCore.MiningTask.ApplyOutputOption
	 * @generated
	 */
	EEnum getApplyOutputOption();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MiningTaskFactory getMiningTaskFactory();

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
		 * The meta object literal for the '{@link CWM.MiningCore.MiningTask.impl.ApplyContentItemImpl <em>Apply Content Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.MiningCore.MiningTask.impl.ApplyContentItemImpl
		 * @see CWM.MiningCore.MiningTask.impl.MiningTaskPackageImpl#getApplyContentItem()
		 * @generated
		 */
		EClass APPLY_CONTENT_ITEM = eINSTANCE.getApplyContentItem();

		/**
		 * The meta object literal for the '<em><b>Top Nth Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLY_CONTENT_ITEM__TOP_NTH_INDEX = eINSTANCE.getApplyContentItem_TopNthIndex();

		/**
		 * The meta object literal for the '{@link CWM.MiningCore.MiningTask.impl.ApplyOutputItemImpl <em>Apply Output Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.MiningCore.MiningTask.impl.ApplyOutputItemImpl
		 * @see CWM.MiningCore.MiningTask.impl.MiningTaskPackageImpl#getApplyOutputItem()
		 * @generated
		 */
		EClass APPLY_OUTPUT_ITEM = eINSTANCE.getApplyOutputItem();

		/**
		 * The meta object literal for the '{@link CWM.MiningCore.MiningTask.impl.ApplyProbabilityItemImpl <em>Apply Probability Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.MiningCore.MiningTask.impl.ApplyProbabilityItemImpl
		 * @see CWM.MiningCore.MiningTask.impl.MiningTaskPackageImpl#getApplyProbabilityItem()
		 * @generated
		 */
		EClass APPLY_PROBABILITY_ITEM = eINSTANCE.getApplyProbabilityItem();

		/**
		 * The meta object literal for the '{@link CWM.MiningCore.MiningTask.impl.ApplyRuleIdItemImpl <em>Apply Rule Id Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.MiningCore.MiningTask.impl.ApplyRuleIdItemImpl
		 * @see CWM.MiningCore.MiningTask.impl.MiningTaskPackageImpl#getApplyRuleIdItem()
		 * @generated
		 */
		EClass APPLY_RULE_ID_ITEM = eINSTANCE.getApplyRuleIdItem();

		/**
		 * The meta object literal for the '{@link CWM.MiningCore.MiningTask.impl.ApplyScoreItemImpl <em>Apply Score Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.MiningCore.MiningTask.impl.ApplyScoreItemImpl
		 * @see CWM.MiningCore.MiningTask.impl.MiningTaskPackageImpl#getApplyScoreItem()
		 * @generated
		 */
		EClass APPLY_SCORE_ITEM = eINSTANCE.getApplyScoreItem();

		/**
		 * The meta object literal for the '{@link CWM.MiningCore.MiningTask.impl.ApplySourceItemImpl <em>Apply Source Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.MiningCore.MiningTask.impl.ApplySourceItemImpl
		 * @see CWM.MiningCore.MiningTask.impl.MiningTaskPackageImpl#getApplySourceItem()
		 * @generated
		 */
		EClass APPLY_SOURCE_ITEM = eINSTANCE.getApplySourceItem();

		/**
		 * The meta object literal for the '{@link CWM.MiningCore.MiningTask.impl.MiningApplyOutputImpl <em>Mining Apply Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.MiningCore.MiningTask.impl.MiningApplyOutputImpl
		 * @see CWM.MiningCore.MiningTask.impl.MiningTaskPackageImpl#getMiningApplyOutput()
		 * @generated
		 */
		EClass MINING_APPLY_OUTPUT = eINSTANCE.getMiningApplyOutput();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINING_APPLY_OUTPUT__ITEM = eINSTANCE.getMiningApplyOutput_Item();

		/**
		 * The meta object literal for the '{@link CWM.MiningCore.MiningTask.impl.MiningApplyTaskImpl <em>Mining Apply Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.MiningCore.MiningTask.impl.MiningApplyTaskImpl
		 * @see CWM.MiningCore.MiningTask.impl.MiningTaskPackageImpl#getMiningApplyTask()
		 * @generated
		 */
		EClass MINING_APPLY_TASK = eINSTANCE.getMiningApplyTask();

		/**
		 * The meta object literal for the '<em><b>Apply Output</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINING_APPLY_TASK__APPLY_OUTPUT = eINSTANCE.getMiningApplyTask_ApplyOutput();

		/**
		 * The meta object literal for the '<em><b>Output Assignment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINING_APPLY_TASK__OUTPUT_ASSIGNMENT = eINSTANCE.getMiningApplyTask_OutputAssignment();

		/**
		 * The meta object literal for the '<em><b>Output Option</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MINING_APPLY_TASK__OUTPUT_OPTION = eINSTANCE.getMiningApplyTask_OutputOption();

		/**
		 * The meta object literal for the '{@link CWM.MiningCore.MiningTask.impl.MiningBuildTaskImpl <em>Mining Build Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.MiningCore.MiningTask.impl.MiningBuildTaskImpl
		 * @see CWM.MiningCore.MiningTask.impl.MiningTaskPackageImpl#getMiningBuildTask()
		 * @generated
		 */
		EClass MINING_BUILD_TASK = eINSTANCE.getMiningBuildTask();

		/**
		 * The meta object literal for the '<em><b>Mining Settings</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINING_BUILD_TASK__MINING_SETTINGS = eINSTANCE.getMiningBuildTask_MiningSettings();

		/**
		 * The meta object literal for the '<em><b>Settings Assignment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINING_BUILD_TASK__SETTINGS_ASSIGNMENT = eINSTANCE.getMiningBuildTask_SettingsAssignment();

		/**
		 * The meta object literal for the '<em><b>Validation Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINING_BUILD_TASK__VALIDATION_DATA = eINSTANCE.getMiningBuildTask_ValidationData();

		/**
		 * The meta object literal for the '<em><b>Validation Assignment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINING_BUILD_TASK__VALIDATION_ASSIGNMENT = eINSTANCE.getMiningBuildTask_ValidationAssignment();

		/**
		 * The meta object literal for the '<em><b>Result Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINING_BUILD_TASK__RESULT_MODEL = eINSTANCE.getMiningBuildTask_ResultModel();

		/**
		 * The meta object literal for the '{@link CWM.MiningCore.MiningTask.impl.MiningTaskImpl <em>Mining Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.MiningCore.MiningTask.impl.MiningTaskImpl
		 * @see CWM.MiningCore.MiningTask.impl.MiningTaskPackageImpl#getMiningTask()
		 * @generated
		 */
		EClass MINING_TASK = eINSTANCE.getMiningTask();

		/**
		 * The meta object literal for the '<em><b>Input Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINING_TASK__INPUT_DATA = eINSTANCE.getMiningTask_InputData();

		/**
		 * The meta object literal for the '<em><b>Model Assignment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINING_TASK__MODEL_ASSIGNMENT = eINSTANCE.getMiningTask_ModelAssignment();

		/**
		 * The meta object literal for the '<em><b>Input Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINING_TASK__INPUT_MODEL = eINSTANCE.getMiningTask_InputModel();

		/**
		 * The meta object literal for the '{@link CWM.MiningCore.MiningTask.impl.MiningTransformationImpl <em>Mining Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.MiningCore.MiningTask.impl.MiningTransformationImpl
		 * @see CWM.MiningCore.MiningTask.impl.MiningTaskPackageImpl#getMiningTransformation()
		 * @generated
		 */
		EClass MINING_TRANSFORMATION = eINSTANCE.getMiningTransformation();

		/**
		 * The meta object literal for the '<em><b>Procedure</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINING_TRANSFORMATION__PROCEDURE = eINSTANCE.getMiningTransformation_Procedure();

		/**
		 * The meta object literal for the '{@link CWM.MiningCore.MiningTask.impl.MiningTask_containerImpl <em>Mining Task container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.MiningCore.MiningTask.impl.MiningTask_containerImpl
		 * @see CWM.MiningCore.MiningTask.impl.MiningTaskPackageImpl#getMiningTask_container()
		 * @generated
		 */
		EClass MINING_TASK_CONTAINER = eINSTANCE.getMiningTask_container();

		/**
		 * The meta object literal for the '<em><b>Apply Content Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINING_TASK_CONTAINER__APPLY_CONTENT_ITEM = eINSTANCE.getMiningTask_container_ApplyContentItem();

		/**
		 * The meta object literal for the '<em><b>Apply Output Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINING_TASK_CONTAINER__APPLY_OUTPUT_ITEM = eINSTANCE.getMiningTask_container_ApplyOutputItem();

		/**
		 * The meta object literal for the '<em><b>Apply Probability Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINING_TASK_CONTAINER__APPLY_PROBABILITY_ITEM = eINSTANCE.getMiningTask_container_ApplyProbabilityItem();

		/**
		 * The meta object literal for the '<em><b>Apply Rule Id Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINING_TASK_CONTAINER__APPLY_RULE_ID_ITEM = eINSTANCE.getMiningTask_container_ApplyRuleIdItem();

		/**
		 * The meta object literal for the '<em><b>Apply Score Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINING_TASK_CONTAINER__APPLY_SCORE_ITEM = eINSTANCE.getMiningTask_container_ApplyScoreItem();

		/**
		 * The meta object literal for the '<em><b>Apply Source Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINING_TASK_CONTAINER__APPLY_SOURCE_ITEM = eINSTANCE.getMiningTask_container_ApplySourceItem();

		/**
		 * The meta object literal for the '<em><b>Mining Apply Output</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINING_TASK_CONTAINER__MINING_APPLY_OUTPUT = eINSTANCE.getMiningTask_container_MiningApplyOutput();

		/**
		 * The meta object literal for the '<em><b>Mining Apply Task</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINING_TASK_CONTAINER__MINING_APPLY_TASK = eINSTANCE.getMiningTask_container_MiningApplyTask();

		/**
		 * The meta object literal for the '<em><b>Mining Build Task</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINING_TASK_CONTAINER__MINING_BUILD_TASK = eINSTANCE.getMiningTask_container_MiningBuildTask();

		/**
		 * The meta object literal for the '<em><b>Mining Task</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINING_TASK_CONTAINER__MINING_TASK = eINSTANCE.getMiningTask_container_MiningTask();

		/**
		 * The meta object literal for the '<em><b>Mining Transformation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINING_TASK_CONTAINER__MINING_TRANSFORMATION = eINSTANCE.getMiningTask_container_MiningTransformation();

		/**
		 * The meta object literal for the '{@link CWM.MiningCore.MiningTask.ApplyOutputOption <em>Apply Output Option</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.MiningCore.MiningTask.ApplyOutputOption
		 * @see CWM.MiningCore.MiningTask.impl.MiningTaskPackageImpl#getApplyOutputOption()
		 * @generated
		 */
		EEnum APPLY_OUTPUT_OPTION = eINSTANCE.getApplyOutputOption();

	}

} //MiningTaskPackage

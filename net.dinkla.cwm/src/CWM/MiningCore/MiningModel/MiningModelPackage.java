/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningModel;

import CWM.Core.CorePackage;

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
 * @see CWM.MiningCore.MiningModel.MiningModelFactory
 * @model kind="package"
 * @generated
 */
public interface MiningModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "MiningModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "MiningModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "MiningModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MiningModelPackage eINSTANCE = CWM.MiningCore.MiningModel.impl.MiningModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link CWM.MiningCore.MiningModel.impl.MiningModelImpl <em>Mining Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.MiningCore.MiningModel.impl.MiningModelImpl
	 * @see CWM.MiningCore.MiningModel.impl.MiningModelPackageImpl#getMiningModel()
	 * @generated
	 */
	int MINING_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_MODEL__NAME = CorePackage.MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_MODEL__VISIBILITY = CorePackage.MODEL_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_MODEL__CLIENT_DEPENDENCY = CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_MODEL__CONSTRAINT = CorePackage.MODEL_ELEMENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_MODEL__IMPORTER = CorePackage.MODEL_ELEMENT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_MODEL__NAMESPACE = CorePackage.MODEL_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_MODEL__TAGGED_VALUE = CorePackage.MODEL_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_MODEL__FUNCTION = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Algorithm Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_MODEL__ALGORITHM_NAME = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Settings</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_MODEL__SETTINGS = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Model Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_MODEL__MODEL_SIGNATURE = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Model Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_MODEL__MODEL_LOCATION = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Key Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_MODEL__KEY_ATTRIBUTE = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Key Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_MODEL__KEY_VALUE = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Mining Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_MODEL_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link CWM.MiningCore.MiningModel.impl.ModelSignatureImpl <em>Model Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.MiningCore.MiningModel.impl.ModelSignatureImpl
	 * @see CWM.MiningCore.MiningModel.impl.MiningModelPackageImpl#getModelSignature()
	 * @generated
	 */
	int MODEL_SIGNATURE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_SIGNATURE__NAME = CorePackage.CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_SIGNATURE__VISIBILITY = CorePackage.CLASS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_SIGNATURE__CLIENT_DEPENDENCY = CorePackage.CLASS__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_SIGNATURE__CONSTRAINT = CorePackage.CLASS__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_SIGNATURE__IMPORTER = CorePackage.CLASS__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_SIGNATURE__NAMESPACE = CorePackage.CLASS__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_SIGNATURE__TAGGED_VALUE = CorePackage.CLASS__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_SIGNATURE__OWNED_ELEMENT = CorePackage.CLASS__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_SIGNATURE__IS_ABSTRACT = CorePackage.CLASS__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_SIGNATURE__FEATURE = CorePackage.CLASS__FEATURE;

	/**
	 * The number of structural features of the '<em>Model Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_SIGNATURE_FEATURE_COUNT = CorePackage.CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CWM.MiningCore.MiningModel.impl.SignatureAttributeImpl <em>Signature Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.MiningCore.MiningModel.impl.SignatureAttributeImpl
	 * @see CWM.MiningCore.MiningModel.impl.MiningModelPackageImpl#getSignatureAttribute()
	 * @generated
	 */
	int SIGNATURE_ATTRIBUTE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_ATTRIBUTE__NAME = MiningDataPackage.MINING_ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_ATTRIBUTE__VISIBILITY = MiningDataPackage.MINING_ATTRIBUTE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_ATTRIBUTE__CLIENT_DEPENDENCY = MiningDataPackage.MINING_ATTRIBUTE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_ATTRIBUTE__CONSTRAINT = MiningDataPackage.MINING_ATTRIBUTE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_ATTRIBUTE__IMPORTER = MiningDataPackage.MINING_ATTRIBUTE__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_ATTRIBUTE__NAMESPACE = MiningDataPackage.MINING_ATTRIBUTE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_ATTRIBUTE__TAGGED_VALUE = MiningDataPackage.MINING_ATTRIBUTE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owner Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_ATTRIBUTE__OWNER_SCOPE = MiningDataPackage.MINING_ATTRIBUTE__OWNER_SCOPE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_ATTRIBUTE__OWNER = MiningDataPackage.MINING_ATTRIBUTE__OWNER;

	/**
	 * The feature id for the '<em><b>Changeability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_ATTRIBUTE__CHANGEABILITY = MiningDataPackage.MINING_ATTRIBUTE__CHANGEABILITY;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_ATTRIBUTE__MULTIPLICITY = MiningDataPackage.MINING_ATTRIBUTE__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_ATTRIBUTE__ORDERING = MiningDataPackage.MINING_ATTRIBUTE__ORDERING;

	/**
	 * The feature id for the '<em><b>Target Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_ATTRIBUTE__TARGET_SCOPE = MiningDataPackage.MINING_ATTRIBUTE__TARGET_SCOPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_ATTRIBUTE__TYPE = MiningDataPackage.MINING_ATTRIBUTE__TYPE;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_ATTRIBUTE__INITIAL_VALUE = MiningDataPackage.MINING_ATTRIBUTE__INITIAL_VALUE;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_ATTRIBUTE__DISPLAY_NAME = MiningDataPackage.MINING_ATTRIBUTE__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Attribute Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_ATTRIBUTE__ATTRIBUTE_TYPE = MiningDataPackage.MINING_ATTRIBUTE__ATTRIBUTE_TYPE;

	/**
	 * The feature id for the '<em><b>Usage Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_ATTRIBUTE__USAGE_OPTION = MiningDataPackage.MINING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Signature Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_ATTRIBUTE_FEATURE_COUNT = MiningDataPackage.MINING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CWM.MiningCore.MiningModel.impl.MiningModel_containerImpl <em>Mining Model container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.MiningCore.MiningModel.impl.MiningModel_containerImpl
	 * @see CWM.MiningCore.MiningModel.impl.MiningModelPackageImpl#getMiningModel_container()
	 * @generated
	 */
	int MINING_MODEL_CONTAINER = 3;

	/**
	 * The feature id for the '<em><b>Mining Model</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_MODEL_CONTAINER__MINING_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Model Signature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_MODEL_CONTAINER__MODEL_SIGNATURE = 1;

	/**
	 * The feature id for the '<em><b>Signature Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_MODEL_CONTAINER__SIGNATURE_ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>Mining Model container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_MODEL_CONTAINER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link CWM.MiningCore.MiningModel.MiningFunction <em>Mining Function</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.MiningCore.MiningModel.MiningFunction
	 * @see CWM.MiningCore.MiningModel.impl.MiningModelPackageImpl#getMiningFunction()
	 * @generated
	 */
	int MINING_FUNCTION = 4;


	/**
	 * Returns the meta object for class '{@link CWM.MiningCore.MiningModel.MiningModel <em>Mining Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mining Model</em>'.
	 * @see CWM.MiningCore.MiningModel.MiningModel
	 * @generated
	 */
	EClass getMiningModel();

	/**
	 * Returns the meta object for the attribute '{@link CWM.MiningCore.MiningModel.MiningModel#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function</em>'.
	 * @see CWM.MiningCore.MiningModel.MiningModel#getFunction()
	 * @see #getMiningModel()
	 * @generated
	 */
	EAttribute getMiningModel_Function();

	/**
	 * Returns the meta object for the attribute '{@link CWM.MiningCore.MiningModel.MiningModel#getAlgorithmName <em>Algorithm Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Algorithm Name</em>'.
	 * @see CWM.MiningCore.MiningModel.MiningModel#getAlgorithmName()
	 * @see #getMiningModel()
	 * @generated
	 */
	EAttribute getMiningModel_AlgorithmName();

	/**
	 * Returns the meta object for the reference '{@link CWM.MiningCore.MiningModel.MiningModel#getSettings <em>Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Settings</em>'.
	 * @see CWM.MiningCore.MiningModel.MiningModel#getSettings()
	 * @see #getMiningModel()
	 * @generated
	 */
	EReference getMiningModel_Settings();

	/**
	 * Returns the meta object for the containment reference '{@link CWM.MiningCore.MiningModel.MiningModel#getModelSignature <em>Model Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Model Signature</em>'.
	 * @see CWM.MiningCore.MiningModel.MiningModel#getModelSignature()
	 * @see #getMiningModel()
	 * @generated
	 */
	EReference getMiningModel_ModelSignature();

	/**
	 * Returns the meta object for the reference '{@link CWM.MiningCore.MiningModel.MiningModel#getModelLocation <em>Model Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model Location</em>'.
	 * @see CWM.MiningCore.MiningModel.MiningModel#getModelLocation()
	 * @see #getMiningModel()
	 * @generated
	 */
	EReference getMiningModel_ModelLocation();

	/**
	 * Returns the meta object for the reference '{@link CWM.MiningCore.MiningModel.MiningModel#getKeyAttribute <em>Key Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key Attribute</em>'.
	 * @see CWM.MiningCore.MiningModel.MiningModel#getKeyAttribute()
	 * @see #getMiningModel()
	 * @generated
	 */
	EReference getMiningModel_KeyAttribute();

	/**
	 * Returns the meta object for the attribute '{@link CWM.MiningCore.MiningModel.MiningModel#getKeyValue <em>Key Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Value</em>'.
	 * @see CWM.MiningCore.MiningModel.MiningModel#getKeyValue()
	 * @see #getMiningModel()
	 * @generated
	 */
	EAttribute getMiningModel_KeyValue();

	/**
	 * Returns the meta object for class '{@link CWM.MiningCore.MiningModel.ModelSignature <em>Model Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Signature</em>'.
	 * @see CWM.MiningCore.MiningModel.ModelSignature
	 * @generated
	 */
	EClass getModelSignature();

	/**
	 * Returns the meta object for class '{@link CWM.MiningCore.MiningModel.SignatureAttribute <em>Signature Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signature Attribute</em>'.
	 * @see CWM.MiningCore.MiningModel.SignatureAttribute
	 * @generated
	 */
	EClass getSignatureAttribute();

	/**
	 * Returns the meta object for the attribute '{@link CWM.MiningCore.MiningModel.SignatureAttribute#getUsageOption <em>Usage Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage Option</em>'.
	 * @see CWM.MiningCore.MiningModel.SignatureAttribute#getUsageOption()
	 * @see #getSignatureAttribute()
	 * @generated
	 */
	EAttribute getSignatureAttribute_UsageOption();

	/**
	 * Returns the meta object for class '{@link CWM.MiningCore.MiningModel.MiningModel_container <em>Mining Model container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mining Model container</em>'.
	 * @see CWM.MiningCore.MiningModel.MiningModel_container
	 * @generated
	 */
	EClass getMiningModel_container();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.MiningCore.MiningModel.MiningModel_container#getMiningModel <em>Mining Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mining Model</em>'.
	 * @see CWM.MiningCore.MiningModel.MiningModel_container#getMiningModel()
	 * @see #getMiningModel_container()
	 * @generated
	 */
	EReference getMiningModel_container_MiningModel();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.MiningCore.MiningModel.MiningModel_container#getModelSignature <em>Model Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Model Signature</em>'.
	 * @see CWM.MiningCore.MiningModel.MiningModel_container#getModelSignature()
	 * @see #getMiningModel_container()
	 * @generated
	 */
	EReference getMiningModel_container_ModelSignature();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.MiningCore.MiningModel.MiningModel_container#getSignatureAttribute <em>Signature Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signature Attribute</em>'.
	 * @see CWM.MiningCore.MiningModel.MiningModel_container#getSignatureAttribute()
	 * @see #getMiningModel_container()
	 * @generated
	 */
	EReference getMiningModel_container_SignatureAttribute();

	/**
	 * Returns the meta object for enum '{@link CWM.MiningCore.MiningModel.MiningFunction <em>Mining Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mining Function</em>'.
	 * @see CWM.MiningCore.MiningModel.MiningFunction
	 * @generated
	 */
	EEnum getMiningFunction();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MiningModelFactory getMiningModelFactory();

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
		 * The meta object literal for the '{@link CWM.MiningCore.MiningModel.impl.MiningModelImpl <em>Mining Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.MiningCore.MiningModel.impl.MiningModelImpl
		 * @see CWM.MiningCore.MiningModel.impl.MiningModelPackageImpl#getMiningModel()
		 * @generated
		 */
		EClass MINING_MODEL = eINSTANCE.getMiningModel();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MINING_MODEL__FUNCTION = eINSTANCE.getMiningModel_Function();

		/**
		 * The meta object literal for the '<em><b>Algorithm Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MINING_MODEL__ALGORITHM_NAME = eINSTANCE.getMiningModel_AlgorithmName();

		/**
		 * The meta object literal for the '<em><b>Settings</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINING_MODEL__SETTINGS = eINSTANCE.getMiningModel_Settings();

		/**
		 * The meta object literal for the '<em><b>Model Signature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINING_MODEL__MODEL_SIGNATURE = eINSTANCE.getMiningModel_ModelSignature();

		/**
		 * The meta object literal for the '<em><b>Model Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINING_MODEL__MODEL_LOCATION = eINSTANCE.getMiningModel_ModelLocation();

		/**
		 * The meta object literal for the '<em><b>Key Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINING_MODEL__KEY_ATTRIBUTE = eINSTANCE.getMiningModel_KeyAttribute();

		/**
		 * The meta object literal for the '<em><b>Key Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MINING_MODEL__KEY_VALUE = eINSTANCE.getMiningModel_KeyValue();

		/**
		 * The meta object literal for the '{@link CWM.MiningCore.MiningModel.impl.ModelSignatureImpl <em>Model Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.MiningCore.MiningModel.impl.ModelSignatureImpl
		 * @see CWM.MiningCore.MiningModel.impl.MiningModelPackageImpl#getModelSignature()
		 * @generated
		 */
		EClass MODEL_SIGNATURE = eINSTANCE.getModelSignature();

		/**
		 * The meta object literal for the '{@link CWM.MiningCore.MiningModel.impl.SignatureAttributeImpl <em>Signature Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.MiningCore.MiningModel.impl.SignatureAttributeImpl
		 * @see CWM.MiningCore.MiningModel.impl.MiningModelPackageImpl#getSignatureAttribute()
		 * @generated
		 */
		EClass SIGNATURE_ATTRIBUTE = eINSTANCE.getSignatureAttribute();

		/**
		 * The meta object literal for the '<em><b>Usage Option</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNATURE_ATTRIBUTE__USAGE_OPTION = eINSTANCE.getSignatureAttribute_UsageOption();

		/**
		 * The meta object literal for the '{@link CWM.MiningCore.MiningModel.impl.MiningModel_containerImpl <em>Mining Model container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.MiningCore.MiningModel.impl.MiningModel_containerImpl
		 * @see CWM.MiningCore.MiningModel.impl.MiningModelPackageImpl#getMiningModel_container()
		 * @generated
		 */
		EClass MINING_MODEL_CONTAINER = eINSTANCE.getMiningModel_container();

		/**
		 * The meta object literal for the '<em><b>Mining Model</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINING_MODEL_CONTAINER__MINING_MODEL = eINSTANCE.getMiningModel_container_MiningModel();

		/**
		 * The meta object literal for the '<em><b>Model Signature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINING_MODEL_CONTAINER__MODEL_SIGNATURE = eINSTANCE.getMiningModel_container_ModelSignature();

		/**
		 * The meta object literal for the '<em><b>Signature Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINING_MODEL_CONTAINER__SIGNATURE_ATTRIBUTE = eINSTANCE.getMiningModel_container_SignatureAttribute();

		/**
		 * The meta object literal for the '{@link CWM.MiningCore.MiningModel.MiningFunction <em>Mining Function</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.MiningCore.MiningModel.MiningFunction
		 * @see CWM.MiningCore.MiningModel.impl.MiningModelPackageImpl#getMiningFunction()
		 * @generated
		 */
		EEnum MINING_FUNCTION = eINSTANCE.getMiningFunction();

	}

} //MiningModelPackage

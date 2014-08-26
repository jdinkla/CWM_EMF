/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.CwmTransformation;

import CWM.Core.CorePackage;

import CWM.SoftwareDeployment.SoftwareDeploymentPackage;

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
 * @see CWM.CwmTransformation.CwmTransformationFactory
 * @model kind="package"
 * @generated
 */
public interface CwmTransformationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "CwmTransformation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "CwmTransformation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "CwmTransformation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CwmTransformationPackage eINSTANCE = CWM.CwmTransformation.impl.CwmTransformationPackageImpl.init();

	/**
	 * The meta object id for the '{@link CWM.CwmTransformation.impl.TransformationImpl <em>Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.CwmTransformation.impl.TransformationImpl
	 * @see CWM.CwmTransformation.impl.CwmTransformationPackageImpl#getTransformation()
	 * @generated
	 */
	int TRANSFORMATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__NAME = CorePackage.NAMESPACE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__VISIBILITY = CorePackage.NAMESPACE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__CLIENT_DEPENDENCY = CorePackage.NAMESPACE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__CONSTRAINT = CorePackage.NAMESPACE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__IMPORTER = CorePackage.NAMESPACE__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__NAMESPACE = CorePackage.NAMESPACE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__TAGGED_VALUE = CorePackage.NAMESPACE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__OWNED_ELEMENT = CorePackage.NAMESPACE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__FUNCTION = CorePackage.NAMESPACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Function Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__FUNCTION_DESCRIPTION = CorePackage.NAMESPACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Primary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__IS_PRIMARY = CorePackage.NAMESPACE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__SOURCE = CorePackage.NAMESPACE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__TARGET = CorePackage.NAMESPACE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Use</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__USE = CorePackage.NAMESPACE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_FEATURE_COUNT = CorePackage.NAMESPACE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link CWM.CwmTransformation.impl.DataObjectSetImpl <em>Data Object Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.CwmTransformation.impl.DataObjectSetImpl
	 * @see CWM.CwmTransformation.impl.CwmTransformationPackageImpl#getDataObjectSet()
	 * @generated
	 */
	int DATA_OBJECT_SET = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT_SET__NAME = CorePackage.MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT_SET__VISIBILITY = CorePackage.MODEL_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT_SET__CLIENT_DEPENDENCY = CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT_SET__CONSTRAINT = CorePackage.MODEL_ELEMENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT_SET__IMPORTER = CorePackage.MODEL_ELEMENT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT_SET__NAMESPACE = CorePackage.MODEL_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT_SET__TAGGED_VALUE = CorePackage.MODEL_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT_SET__ELEMENT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Transformation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT_SET__SOURCE_TRANSFORMATION = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Transformation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT_SET__TARGET_TRANSFORMATION = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Object Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT_SET_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link CWM.CwmTransformation.impl.TransformationTaskImpl <em>Transformation Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.CwmTransformation.impl.TransformationTaskImpl
	 * @see CWM.CwmTransformation.impl.CwmTransformationPackageImpl#getTransformationTask()
	 * @generated
	 */
	int TRANSFORMATION_TASK = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_TASK__NAME = SoftwareDeploymentPackage.COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_TASK__VISIBILITY = SoftwareDeploymentPackage.COMPONENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_TASK__CLIENT_DEPENDENCY = SoftwareDeploymentPackage.COMPONENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_TASK__CONSTRAINT = SoftwareDeploymentPackage.COMPONENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_TASK__IMPORTER = SoftwareDeploymentPackage.COMPONENT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_TASK__NAMESPACE = SoftwareDeploymentPackage.COMPONENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_TASK__TAGGED_VALUE = SoftwareDeploymentPackage.COMPONENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_TASK__OWNED_ELEMENT = SoftwareDeploymentPackage.COMPONENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_TASK__IS_ABSTRACT = SoftwareDeploymentPackage.COMPONENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_TASK__FEATURE = SoftwareDeploymentPackage.COMPONENT__FEATURE;

	/**
	 * The feature id for the '<em><b>Design Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_TASK__DESIGN_PACKAGE = SoftwareDeploymentPackage.COMPONENT__DESIGN_PACKAGE;

	/**
	 * The feature id for the '<em><b>Transformation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_TASK__TRANSFORMATION = SoftwareDeploymentPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inverse Task</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_TASK__INVERSE_TASK = SoftwareDeploymentPackage.COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Original Task</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_TASK__ORIGINAL_TASK = SoftwareDeploymentPackage.COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Transformation Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_TASK_FEATURE_COUNT = SoftwareDeploymentPackage.COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link CWM.CwmTransformation.impl.TransformationStepImpl <em>Transformation Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.CwmTransformation.impl.TransformationStepImpl
	 * @see CWM.CwmTransformation.impl.CwmTransformationPackageImpl#getTransformationStep()
	 * @generated
	 */
	int TRANSFORMATION_STEP = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_STEP__NAME = CorePackage.MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_STEP__VISIBILITY = CorePackage.MODEL_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_STEP__CLIENT_DEPENDENCY = CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_STEP__CONSTRAINT = CorePackage.MODEL_ELEMENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_STEP__IMPORTER = CorePackage.MODEL_ELEMENT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_STEP__NAMESPACE = CorePackage.MODEL_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_STEP__TAGGED_VALUE = CorePackage.MODEL_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_STEP__TASK = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_STEP__ACTIVITY = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Precedence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_STEP__PRECEDENCE = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Preceding Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_STEP__PRECEDING_STEP = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Succeeding Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_STEP__SUCCEEDING_STEP = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Transformation Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_STEP_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link CWM.CwmTransformation.impl.TransformationActivityImpl <em>Transformation Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.CwmTransformation.impl.TransformationActivityImpl
	 * @see CWM.CwmTransformation.impl.CwmTransformationPackageImpl#getTransformationActivity()
	 * @generated
	 */
	int TRANSFORMATION_ACTIVITY = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_ACTIVITY__NAME = CorePackage.SUBSYSTEM__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_ACTIVITY__VISIBILITY = CorePackage.SUBSYSTEM__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_ACTIVITY__CLIENT_DEPENDENCY = CorePackage.SUBSYSTEM__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_ACTIVITY__CONSTRAINT = CorePackage.SUBSYSTEM__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_ACTIVITY__IMPORTER = CorePackage.SUBSYSTEM__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_ACTIVITY__NAMESPACE = CorePackage.SUBSYSTEM__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_ACTIVITY__TAGGED_VALUE = CorePackage.SUBSYSTEM__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_ACTIVITY__OWNED_ELEMENT = CorePackage.SUBSYSTEM__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Imported Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_ACTIVITY__IMPORTED_ELEMENT = CorePackage.SUBSYSTEM__IMPORTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_ACTIVITY__IS_ABSTRACT = CorePackage.SUBSYSTEM__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_ACTIVITY__FEATURE = CorePackage.SUBSYSTEM__FEATURE;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_ACTIVITY__CREATION_DATE = CorePackage.SUBSYSTEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_ACTIVITY__STEP = CorePackage.SUBSYSTEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Transformation Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_ACTIVITY_FEATURE_COUNT = CorePackage.SUBSYSTEM_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link CWM.CwmTransformation.impl.PrecedenceConstraintImpl <em>Precedence Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.CwmTransformation.impl.PrecedenceConstraintImpl
	 * @see CWM.CwmTransformation.impl.CwmTransformationPackageImpl#getPrecedenceConstraint()
	 * @generated
	 */
	int PRECEDENCE_CONSTRAINT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_CONSTRAINT__NAME = CorePackage.CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_CONSTRAINT__VISIBILITY = CorePackage.CONSTRAINT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_CONSTRAINT__CLIENT_DEPENDENCY = CorePackage.CONSTRAINT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_CONSTRAINT__CONSTRAINT = CorePackage.CONSTRAINT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_CONSTRAINT__IMPORTER = CorePackage.CONSTRAINT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_CONSTRAINT__NAMESPACE = CorePackage.CONSTRAINT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_CONSTRAINT__TAGGED_VALUE = CorePackage.CONSTRAINT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_CONSTRAINT__BODY = CorePackage.CONSTRAINT__BODY;

	/**
	 * The feature id for the '<em><b>Constrained Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_CONSTRAINT__CONSTRAINED_ELEMENT = CorePackage.CONSTRAINT__CONSTRAINED_ELEMENT;

	/**
	 * The number of structural features of the '<em>Precedence Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_CONSTRAINT_FEATURE_COUNT = CorePackage.CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CWM.CwmTransformation.impl.TransformationUseImpl <em>Transformation Use</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.CwmTransformation.impl.TransformationUseImpl
	 * @see CWM.CwmTransformation.impl.CwmTransformationPackageImpl#getTransformationUse()
	 * @generated
	 */
	int TRANSFORMATION_USE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_USE__NAME = CorePackage.DEPENDENCY__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_USE__VISIBILITY = CorePackage.DEPENDENCY__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_USE__CLIENT_DEPENDENCY = CorePackage.DEPENDENCY__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_USE__CONSTRAINT = CorePackage.DEPENDENCY__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_USE__IMPORTER = CorePackage.DEPENDENCY__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_USE__NAMESPACE = CorePackage.DEPENDENCY__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_USE__TAGGED_VALUE = CorePackage.DEPENDENCY__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_USE__KIND = CorePackage.DEPENDENCY__KIND;

	/**
	 * The feature id for the '<em><b>Client</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_USE__CLIENT = CorePackage.DEPENDENCY__CLIENT;

	/**
	 * The feature id for the '<em><b>Supplier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_USE__SUPPLIER = CorePackage.DEPENDENCY__SUPPLIER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_USE__TYPE = CorePackage.DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transformation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_USE__TRANSFORMATION = CorePackage.DEPENDENCY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_USE__OPERATION = CorePackage.DEPENDENCY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Transformation Use</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_USE_FEATURE_COUNT = CorePackage.DEPENDENCY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link CWM.CwmTransformation.impl.TransformationMapImpl <em>Transformation Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.CwmTransformation.impl.TransformationMapImpl
	 * @see CWM.CwmTransformation.impl.CwmTransformationPackageImpl#getTransformationMap()
	 * @generated
	 */
	int TRANSFORMATION_MAP = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_MAP__NAME = TRANSFORMATION__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_MAP__VISIBILITY = TRANSFORMATION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_MAP__CLIENT_DEPENDENCY = TRANSFORMATION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_MAP__CONSTRAINT = TRANSFORMATION__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_MAP__IMPORTER = TRANSFORMATION__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_MAP__NAMESPACE = TRANSFORMATION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_MAP__TAGGED_VALUE = TRANSFORMATION__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_MAP__OWNED_ELEMENT = TRANSFORMATION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_MAP__FUNCTION = TRANSFORMATION__FUNCTION;

	/**
	 * The feature id for the '<em><b>Function Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_MAP__FUNCTION_DESCRIPTION = TRANSFORMATION__FUNCTION_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Primary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_MAP__IS_PRIMARY = TRANSFORMATION__IS_PRIMARY;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_MAP__SOURCE = TRANSFORMATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_MAP__TARGET = TRANSFORMATION__TARGET;

	/**
	 * The feature id for the '<em><b>Use</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_MAP__USE = TRANSFORMATION__USE;

	/**
	 * The feature id for the '<em><b>Classifier Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_MAP__CLASSIFIER_MAP = TRANSFORMATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Transformation Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_MAP_FEATURE_COUNT = TRANSFORMATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CWM.CwmTransformation.impl.TransformationTreeImpl <em>Transformation Tree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.CwmTransformation.impl.TransformationTreeImpl
	 * @see CWM.CwmTransformation.impl.CwmTransformationPackageImpl#getTransformationTree()
	 * @generated
	 */
	int TRANSFORMATION_TREE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_TREE__NAME = TRANSFORMATION__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_TREE__VISIBILITY = TRANSFORMATION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_TREE__CLIENT_DEPENDENCY = TRANSFORMATION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_TREE__CONSTRAINT = TRANSFORMATION__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_TREE__IMPORTER = TRANSFORMATION__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_TREE__NAMESPACE = TRANSFORMATION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_TREE__TAGGED_VALUE = TRANSFORMATION__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_TREE__OWNED_ELEMENT = TRANSFORMATION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_TREE__FUNCTION = TRANSFORMATION__FUNCTION;

	/**
	 * The feature id for the '<em><b>Function Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_TREE__FUNCTION_DESCRIPTION = TRANSFORMATION__FUNCTION_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Primary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_TREE__IS_PRIMARY = TRANSFORMATION__IS_PRIMARY;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_TREE__SOURCE = TRANSFORMATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_TREE__TARGET = TRANSFORMATION__TARGET;

	/**
	 * The feature id for the '<em><b>Use</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_TREE__USE = TRANSFORMATION__USE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_TREE__TYPE = TRANSFORMATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_TREE__BODY = TRANSFORMATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Transformation Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_TREE_FEATURE_COUNT = TRANSFORMATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link CWM.CwmTransformation.impl.ClassifierMapImpl <em>Classifier Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.CwmTransformation.impl.ClassifierMapImpl
	 * @see CWM.CwmTransformation.impl.CwmTransformationPackageImpl#getClassifierMap()
	 * @generated
	 */
	int CLASSIFIER_MAP = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_MAP__NAME = CorePackage.NAMESPACE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_MAP__VISIBILITY = CorePackage.NAMESPACE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_MAP__CLIENT_DEPENDENCY = CorePackage.NAMESPACE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_MAP__CONSTRAINT = CorePackage.NAMESPACE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_MAP__IMPORTER = CorePackage.NAMESPACE__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_MAP__NAMESPACE = CorePackage.NAMESPACE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_MAP__TAGGED_VALUE = CorePackage.NAMESPACE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_MAP__OWNED_ELEMENT = CorePackage.NAMESPACE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_MAP__FUNCTION = CorePackage.NAMESPACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Function Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_MAP__FUNCTION_DESCRIPTION = CorePackage.NAMESPACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_MAP__SOURCE = CorePackage.NAMESPACE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_MAP__TARGET = CorePackage.NAMESPACE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Transformation Map</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_MAP__TRANSFORMATION_MAP = CorePackage.NAMESPACE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Feature Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_MAP__FEATURE_MAP = CorePackage.NAMESPACE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Cf Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_MAP__CF_MAP = CorePackage.NAMESPACE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Classifier Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_MAP_FEATURE_COUNT = CorePackage.NAMESPACE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link CWM.CwmTransformation.impl.FeatureMapImpl <em>Feature Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.CwmTransformation.impl.FeatureMapImpl
	 * @see CWM.CwmTransformation.impl.CwmTransformationPackageImpl#getFeatureMap()
	 * @generated
	 */
	int FEATURE_MAP = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MAP__NAME = CorePackage.MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MAP__VISIBILITY = CorePackage.MODEL_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MAP__CLIENT_DEPENDENCY = CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MAP__CONSTRAINT = CorePackage.MODEL_ELEMENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MAP__IMPORTER = CorePackage.MODEL_ELEMENT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MAP__NAMESPACE = CorePackage.MODEL_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MAP__TAGGED_VALUE = CorePackage.MODEL_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MAP__FUNCTION = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Function Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MAP__FUNCTION_DESCRIPTION = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MAP__SOURCE = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MAP__TARGET = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Classifier Map</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MAP__CLASSIFIER_MAP = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Feature Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MAP_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link CWM.CwmTransformation.impl.StepPrecedenceImpl <em>Step Precedence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.CwmTransformation.impl.StepPrecedenceImpl
	 * @see CWM.CwmTransformation.impl.CwmTransformationPackageImpl#getStepPrecedence()
	 * @generated
	 */
	int STEP_PRECEDENCE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_PRECEDENCE__NAME = CorePackage.DEPENDENCY__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_PRECEDENCE__VISIBILITY = CorePackage.DEPENDENCY__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_PRECEDENCE__CLIENT_DEPENDENCY = CorePackage.DEPENDENCY__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_PRECEDENCE__CONSTRAINT = CorePackage.DEPENDENCY__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_PRECEDENCE__IMPORTER = CorePackage.DEPENDENCY__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_PRECEDENCE__NAMESPACE = CorePackage.DEPENDENCY__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_PRECEDENCE__TAGGED_VALUE = CorePackage.DEPENDENCY__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_PRECEDENCE__KIND = CorePackage.DEPENDENCY__KIND;

	/**
	 * The feature id for the '<em><b>Client</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_PRECEDENCE__CLIENT = CorePackage.DEPENDENCY__CLIENT;

	/**
	 * The feature id for the '<em><b>Supplier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_PRECEDENCE__SUPPLIER = CorePackage.DEPENDENCY__SUPPLIER;

	/**
	 * The feature id for the '<em><b>Preceding Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_PRECEDENCE__PRECEDING_STEP = CorePackage.DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Succeeding Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_PRECEDENCE__SUCCEEDING_STEP = CorePackage.DEPENDENCY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Step Precedence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_PRECEDENCE_FEATURE_COUNT = CorePackage.DEPENDENCY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link CWM.CwmTransformation.impl.ClassifierFeatureMapImpl <em>Classifier Feature Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.CwmTransformation.impl.ClassifierFeatureMapImpl
	 * @see CWM.CwmTransformation.impl.CwmTransformationPackageImpl#getClassifierFeatureMap()
	 * @generated
	 */
	int CLASSIFIER_FEATURE_MAP = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_FEATURE_MAP__NAME = CorePackage.MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_FEATURE_MAP__VISIBILITY = CorePackage.MODEL_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_FEATURE_MAP__CLIENT_DEPENDENCY = CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_FEATURE_MAP__CONSTRAINT = CorePackage.MODEL_ELEMENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_FEATURE_MAP__IMPORTER = CorePackage.MODEL_ELEMENT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_FEATURE_MAP__NAMESPACE = CorePackage.MODEL_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_FEATURE_MAP__TAGGED_VALUE = CorePackage.MODEL_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_FEATURE_MAP__FUNCTION = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Function Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_FEATURE_MAP__FUNCTION_DESCRIPTION = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Classifier To Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_FEATURE_MAP__CLASSIFIER_TO_FEATURE = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_FEATURE_MAP__CLASSIFIER = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_FEATURE_MAP__FEATURE = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Classifier Map</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_FEATURE_MAP__CLASSIFIER_MAP = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Classifier Feature Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_FEATURE_MAP_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link CWM.CwmTransformation.impl.Transformation_containerImpl <em>Transformation container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.CwmTransformation.impl.Transformation_containerImpl
	 * @see CWM.CwmTransformation.impl.CwmTransformationPackageImpl#getTransformation_container()
	 * @generated
	 */
	int TRANSFORMATION_CONTAINER = 13;

	/**
	 * The feature id for the '<em><b>Transformation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_CONTAINER__TRANSFORMATION = 0;

	/**
	 * The feature id for the '<em><b>Data Object Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_CONTAINER__DATA_OBJECT_SET = 1;

	/**
	 * The feature id for the '<em><b>Transformation Task</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_CONTAINER__TRANSFORMATION_TASK = 2;

	/**
	 * The feature id for the '<em><b>Transformation Step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_CONTAINER__TRANSFORMATION_STEP = 3;

	/**
	 * The feature id for the '<em><b>Transformation Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_CONTAINER__TRANSFORMATION_ACTIVITY = 4;

	/**
	 * The feature id for the '<em><b>Precedence Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_CONTAINER__PRECEDENCE_CONSTRAINT = 5;

	/**
	 * The feature id for the '<em><b>Transformation Use</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_CONTAINER__TRANSFORMATION_USE = 6;

	/**
	 * The feature id for the '<em><b>Transformation Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_CONTAINER__TRANSFORMATION_MAP = 7;

	/**
	 * The feature id for the '<em><b>Transformation Tree</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_CONTAINER__TRANSFORMATION_TREE = 8;

	/**
	 * The feature id for the '<em><b>Classifier Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_CONTAINER__CLASSIFIER_MAP = 9;

	/**
	 * The feature id for the '<em><b>Feature Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_CONTAINER__FEATURE_MAP = 10;

	/**
	 * The feature id for the '<em><b>Step Precedence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_CONTAINER__STEP_PRECEDENCE = 11;

	/**
	 * The feature id for the '<em><b>Classifier Feature Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_CONTAINER__CLASSIFIER_FEATURE_MAP = 12;

	/**
	 * The number of structural features of the '<em>Transformation container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_CONTAINER_FEATURE_COUNT = 13;

	/**
	 * The meta object id for the '{@link CWM.CwmTransformation.TreeType <em>Tree Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.CwmTransformation.TreeType
	 * @see CWM.CwmTransformation.impl.CwmTransformationPackageImpl#getTreeType()
	 * @generated
	 */
	int TREE_TYPE = 14;


	/**
	 * Returns the meta object for class '{@link CWM.CwmTransformation.Transformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation</em>'.
	 * @see CWM.CwmTransformation.Transformation
	 * @generated
	 */
	EClass getTransformation();

	/**
	 * Returns the meta object for the containment reference '{@link CWM.CwmTransformation.Transformation#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Function</em>'.
	 * @see CWM.CwmTransformation.Transformation#getFunction()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_Function();

	/**
	 * Returns the meta object for the attribute '{@link CWM.CwmTransformation.Transformation#getFunctionDescription <em>Function Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function Description</em>'.
	 * @see CWM.CwmTransformation.Transformation#getFunctionDescription()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_FunctionDescription();

	/**
	 * Returns the meta object for the attribute '{@link CWM.CwmTransformation.Transformation#getIsPrimary <em>Is Primary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Primary</em>'.
	 * @see CWM.CwmTransformation.Transformation#getIsPrimary()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_IsPrimary();

	/**
	 * Returns the meta object for the reference list '{@link CWM.CwmTransformation.Transformation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source</em>'.
	 * @see CWM.CwmTransformation.Transformation#getSource()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_Source();

	/**
	 * Returns the meta object for the reference list '{@link CWM.CwmTransformation.Transformation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see CWM.CwmTransformation.Transformation#getTarget()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_Target();

	/**
	 * Returns the meta object for the reference list '{@link CWM.CwmTransformation.Transformation#getUse <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Use</em>'.
	 * @see CWM.CwmTransformation.Transformation#getUse()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_Use();

	/**
	 * Returns the meta object for class '{@link CWM.CwmTransformation.DataObjectSet <em>Data Object Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Object Set</em>'.
	 * @see CWM.CwmTransformation.DataObjectSet
	 * @generated
	 */
	EClass getDataObjectSet();

	/**
	 * Returns the meta object for the reference list '{@link CWM.CwmTransformation.DataObjectSet#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Element</em>'.
	 * @see CWM.CwmTransformation.DataObjectSet#getElement()
	 * @see #getDataObjectSet()
	 * @generated
	 */
	EReference getDataObjectSet_Element();

	/**
	 * Returns the meta object for the reference list '{@link CWM.CwmTransformation.DataObjectSet#getSourceTransformation <em>Source Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source Transformation</em>'.
	 * @see CWM.CwmTransformation.DataObjectSet#getSourceTransformation()
	 * @see #getDataObjectSet()
	 * @generated
	 */
	EReference getDataObjectSet_SourceTransformation();

	/**
	 * Returns the meta object for the reference list '{@link CWM.CwmTransformation.DataObjectSet#getTargetTransformation <em>Target Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target Transformation</em>'.
	 * @see CWM.CwmTransformation.DataObjectSet#getTargetTransformation()
	 * @see #getDataObjectSet()
	 * @generated
	 */
	EReference getDataObjectSet_TargetTransformation();

	/**
	 * Returns the meta object for class '{@link CWM.CwmTransformation.TransformationTask <em>Transformation Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation Task</em>'.
	 * @see CWM.CwmTransformation.TransformationTask
	 * @generated
	 */
	EClass getTransformationTask();

	/**
	 * Returns the meta object for the reference list '{@link CWM.CwmTransformation.TransformationTask#getTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transformation</em>'.
	 * @see CWM.CwmTransformation.TransformationTask#getTransformation()
	 * @see #getTransformationTask()
	 * @generated
	 */
	EReference getTransformationTask_Transformation();

	/**
	 * Returns the meta object for the reference list '{@link CWM.CwmTransformation.TransformationTask#getInverseTask <em>Inverse Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inverse Task</em>'.
	 * @see CWM.CwmTransformation.TransformationTask#getInverseTask()
	 * @see #getTransformationTask()
	 * @generated
	 */
	EReference getTransformationTask_InverseTask();

	/**
	 * Returns the meta object for the reference list '{@link CWM.CwmTransformation.TransformationTask#getOriginalTask <em>Original Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Original Task</em>'.
	 * @see CWM.CwmTransformation.TransformationTask#getOriginalTask()
	 * @see #getTransformationTask()
	 * @generated
	 */
	EReference getTransformationTask_OriginalTask();

	/**
	 * Returns the meta object for class '{@link CWM.CwmTransformation.TransformationStep <em>Transformation Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation Step</em>'.
	 * @see CWM.CwmTransformation.TransformationStep
	 * @generated
	 */
	EClass getTransformationStep();

	/**
	 * Returns the meta object for the reference '{@link CWM.CwmTransformation.TransformationStep#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task</em>'.
	 * @see CWM.CwmTransformation.TransformationStep#getTask()
	 * @see #getTransformationStep()
	 * @generated
	 */
	EReference getTransformationStep_Task();

	/**
	 * Returns the meta object for the reference '{@link CWM.CwmTransformation.TransformationStep#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activity</em>'.
	 * @see CWM.CwmTransformation.TransformationStep#getActivity()
	 * @see #getTransformationStep()
	 * @generated
	 */
	EReference getTransformationStep_Activity();

	/**
	 * Returns the meta object for the reference list '{@link CWM.CwmTransformation.TransformationStep#getPrecedence <em>Precedence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Precedence</em>'.
	 * @see CWM.CwmTransformation.TransformationStep#getPrecedence()
	 * @see #getTransformationStep()
	 * @generated
	 */
	EReference getTransformationStep_Precedence();

	/**
	 * Returns the meta object for the reference list '{@link CWM.CwmTransformation.TransformationStep#getPrecedingStep <em>Preceding Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Preceding Step</em>'.
	 * @see CWM.CwmTransformation.TransformationStep#getPrecedingStep()
	 * @see #getTransformationStep()
	 * @generated
	 */
	EReference getTransformationStep_PrecedingStep();

	/**
	 * Returns the meta object for the reference list '{@link CWM.CwmTransformation.TransformationStep#getSucceedingStep <em>Succeeding Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Succeeding Step</em>'.
	 * @see CWM.CwmTransformation.TransformationStep#getSucceedingStep()
	 * @see #getTransformationStep()
	 * @generated
	 */
	EReference getTransformationStep_SucceedingStep();

	/**
	 * Returns the meta object for class '{@link CWM.CwmTransformation.TransformationActivity <em>Transformation Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation Activity</em>'.
	 * @see CWM.CwmTransformation.TransformationActivity
	 * @generated
	 */
	EClass getTransformationActivity();

	/**
	 * Returns the meta object for the attribute '{@link CWM.CwmTransformation.TransformationActivity#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see CWM.CwmTransformation.TransformationActivity#getCreationDate()
	 * @see #getTransformationActivity()
	 * @generated
	 */
	EAttribute getTransformationActivity_CreationDate();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.CwmTransformation.TransformationActivity#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Step</em>'.
	 * @see CWM.CwmTransformation.TransformationActivity#getStep()
	 * @see #getTransformationActivity()
	 * @generated
	 */
	EReference getTransformationActivity_Step();

	/**
	 * Returns the meta object for class '{@link CWM.CwmTransformation.PrecedenceConstraint <em>Precedence Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Precedence Constraint</em>'.
	 * @see CWM.CwmTransformation.PrecedenceConstraint
	 * @generated
	 */
	EClass getPrecedenceConstraint();

	/**
	 * Returns the meta object for class '{@link CWM.CwmTransformation.TransformationUse <em>Transformation Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation Use</em>'.
	 * @see CWM.CwmTransformation.TransformationUse
	 * @generated
	 */
	EClass getTransformationUse();

	/**
	 * Returns the meta object for the attribute '{@link CWM.CwmTransformation.TransformationUse#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see CWM.CwmTransformation.TransformationUse#getType()
	 * @see #getTransformationUse()
	 * @generated
	 */
	EAttribute getTransformationUse_Type();

	/**
	 * Returns the meta object for the reference list '{@link CWM.CwmTransformation.TransformationUse#getTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transformation</em>'.
	 * @see CWM.CwmTransformation.TransformationUse#getTransformation()
	 * @see #getTransformationUse()
	 * @generated
	 */
	EReference getTransformationUse_Transformation();

	/**
	 * Returns the meta object for the reference list '{@link CWM.CwmTransformation.TransformationUse#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Operation</em>'.
	 * @see CWM.CwmTransformation.TransformationUse#getOperation()
	 * @see #getTransformationUse()
	 * @generated
	 */
	EReference getTransformationUse_Operation();

	/**
	 * Returns the meta object for class '{@link CWM.CwmTransformation.TransformationMap <em>Transformation Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation Map</em>'.
	 * @see CWM.CwmTransformation.TransformationMap
	 * @generated
	 */
	EClass getTransformationMap();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.CwmTransformation.TransformationMap#getClassifierMap <em>Classifier Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classifier Map</em>'.
	 * @see CWM.CwmTransformation.TransformationMap#getClassifierMap()
	 * @see #getTransformationMap()
	 * @generated
	 */
	EReference getTransformationMap_ClassifierMap();

	/**
	 * Returns the meta object for class '{@link CWM.CwmTransformation.TransformationTree <em>Transformation Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation Tree</em>'.
	 * @see CWM.CwmTransformation.TransformationTree
	 * @generated
	 */
	EClass getTransformationTree();

	/**
	 * Returns the meta object for the attribute '{@link CWM.CwmTransformation.TransformationTree#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see CWM.CwmTransformation.TransformationTree#getType()
	 * @see #getTransformationTree()
	 * @generated
	 */
	EAttribute getTransformationTree_Type();

	/**
	 * Returns the meta object for the containment reference '{@link CWM.CwmTransformation.TransformationTree#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see CWM.CwmTransformation.TransformationTree#getBody()
	 * @see #getTransformationTree()
	 * @generated
	 */
	EReference getTransformationTree_Body();

	/**
	 * Returns the meta object for class '{@link CWM.CwmTransformation.ClassifierMap <em>Classifier Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classifier Map</em>'.
	 * @see CWM.CwmTransformation.ClassifierMap
	 * @generated
	 */
	EClass getClassifierMap();

	/**
	 * Returns the meta object for the containment reference '{@link CWM.CwmTransformation.ClassifierMap#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Function</em>'.
	 * @see CWM.CwmTransformation.ClassifierMap#getFunction()
	 * @see #getClassifierMap()
	 * @generated
	 */
	EReference getClassifierMap_Function();

	/**
	 * Returns the meta object for the attribute '{@link CWM.CwmTransformation.ClassifierMap#getFunctionDescription <em>Function Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function Description</em>'.
	 * @see CWM.CwmTransformation.ClassifierMap#getFunctionDescription()
	 * @see #getClassifierMap()
	 * @generated
	 */
	EAttribute getClassifierMap_FunctionDescription();

	/**
	 * Returns the meta object for the reference list '{@link CWM.CwmTransformation.ClassifierMap#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source</em>'.
	 * @see CWM.CwmTransformation.ClassifierMap#getSource()
	 * @see #getClassifierMap()
	 * @generated
	 */
	EReference getClassifierMap_Source();

	/**
	 * Returns the meta object for the reference list '{@link CWM.CwmTransformation.ClassifierMap#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see CWM.CwmTransformation.ClassifierMap#getTarget()
	 * @see #getClassifierMap()
	 * @generated
	 */
	EReference getClassifierMap_Target();

	/**
	 * Returns the meta object for the reference '{@link CWM.CwmTransformation.ClassifierMap#getTransformationMap <em>Transformation Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transformation Map</em>'.
	 * @see CWM.CwmTransformation.ClassifierMap#getTransformationMap()
	 * @see #getClassifierMap()
	 * @generated
	 */
	EReference getClassifierMap_TransformationMap();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.CwmTransformation.ClassifierMap#getFeatureMap <em>Feature Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature Map</em>'.
	 * @see CWM.CwmTransformation.ClassifierMap#getFeatureMap()
	 * @see #getClassifierMap()
	 * @generated
	 */
	EReference getClassifierMap_FeatureMap();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.CwmTransformation.ClassifierMap#getCfMap <em>Cf Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cf Map</em>'.
	 * @see CWM.CwmTransformation.ClassifierMap#getCfMap()
	 * @see #getClassifierMap()
	 * @generated
	 */
	EReference getClassifierMap_CfMap();

	/**
	 * Returns the meta object for class '{@link CWM.CwmTransformation.FeatureMap <em>Feature Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Map</em>'.
	 * @see CWM.CwmTransformation.FeatureMap
	 * @generated
	 */
	EClass getFeatureMap();

	/**
	 * Returns the meta object for the containment reference '{@link CWM.CwmTransformation.FeatureMap#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Function</em>'.
	 * @see CWM.CwmTransformation.FeatureMap#getFunction()
	 * @see #getFeatureMap()
	 * @generated
	 */
	EReference getFeatureMap_Function();

	/**
	 * Returns the meta object for the attribute '{@link CWM.CwmTransformation.FeatureMap#getFunctionDescription <em>Function Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function Description</em>'.
	 * @see CWM.CwmTransformation.FeatureMap#getFunctionDescription()
	 * @see #getFeatureMap()
	 * @generated
	 */
	EAttribute getFeatureMap_FunctionDescription();

	/**
	 * Returns the meta object for the reference list '{@link CWM.CwmTransformation.FeatureMap#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source</em>'.
	 * @see CWM.CwmTransformation.FeatureMap#getSource()
	 * @see #getFeatureMap()
	 * @generated
	 */
	EReference getFeatureMap_Source();

	/**
	 * Returns the meta object for the reference list '{@link CWM.CwmTransformation.FeatureMap#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see CWM.CwmTransformation.FeatureMap#getTarget()
	 * @see #getFeatureMap()
	 * @generated
	 */
	EReference getFeatureMap_Target();

	/**
	 * Returns the meta object for the container reference '{@link CWM.CwmTransformation.FeatureMap#getClassifierMap <em>Classifier Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Classifier Map</em>'.
	 * @see CWM.CwmTransformation.FeatureMap#getClassifierMap()
	 * @see #getFeatureMap()
	 * @generated
	 */
	EReference getFeatureMap_ClassifierMap();

	/**
	 * Returns the meta object for class '{@link CWM.CwmTransformation.StepPrecedence <em>Step Precedence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step Precedence</em>'.
	 * @see CWM.CwmTransformation.StepPrecedence
	 * @generated
	 */
	EClass getStepPrecedence();

	/**
	 * Returns the meta object for the reference list '{@link CWM.CwmTransformation.StepPrecedence#getPrecedingStep <em>Preceding Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Preceding Step</em>'.
	 * @see CWM.CwmTransformation.StepPrecedence#getPrecedingStep()
	 * @see #getStepPrecedence()
	 * @generated
	 */
	EReference getStepPrecedence_PrecedingStep();

	/**
	 * Returns the meta object for the reference list '{@link CWM.CwmTransformation.StepPrecedence#getSucceedingStep <em>Succeeding Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Succeeding Step</em>'.
	 * @see CWM.CwmTransformation.StepPrecedence#getSucceedingStep()
	 * @see #getStepPrecedence()
	 * @generated
	 */
	EReference getStepPrecedence_SucceedingStep();

	/**
	 * Returns the meta object for class '{@link CWM.CwmTransformation.ClassifierFeatureMap <em>Classifier Feature Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classifier Feature Map</em>'.
	 * @see CWM.CwmTransformation.ClassifierFeatureMap
	 * @generated
	 */
	EClass getClassifierFeatureMap();

	/**
	 * Returns the meta object for the containment reference '{@link CWM.CwmTransformation.ClassifierFeatureMap#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Function</em>'.
	 * @see CWM.CwmTransformation.ClassifierFeatureMap#getFunction()
	 * @see #getClassifierFeatureMap()
	 * @generated
	 */
	EReference getClassifierFeatureMap_Function();

	/**
	 * Returns the meta object for the attribute '{@link CWM.CwmTransformation.ClassifierFeatureMap#getFunctionDescription <em>Function Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function Description</em>'.
	 * @see CWM.CwmTransformation.ClassifierFeatureMap#getFunctionDescription()
	 * @see #getClassifierFeatureMap()
	 * @generated
	 */
	EAttribute getClassifierFeatureMap_FunctionDescription();

	/**
	 * Returns the meta object for the attribute '{@link CWM.CwmTransformation.ClassifierFeatureMap#getClassifierToFeature <em>Classifier To Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classifier To Feature</em>'.
	 * @see CWM.CwmTransformation.ClassifierFeatureMap#getClassifierToFeature()
	 * @see #getClassifierFeatureMap()
	 * @generated
	 */
	EAttribute getClassifierFeatureMap_ClassifierToFeature();

	/**
	 * Returns the meta object for the reference list '{@link CWM.CwmTransformation.ClassifierFeatureMap#getClassifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Classifier</em>'.
	 * @see CWM.CwmTransformation.ClassifierFeatureMap#getClassifier()
	 * @see #getClassifierFeatureMap()
	 * @generated
	 */
	EReference getClassifierFeatureMap_Classifier();

	/**
	 * Returns the meta object for the reference list '{@link CWM.CwmTransformation.ClassifierFeatureMap#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Feature</em>'.
	 * @see CWM.CwmTransformation.ClassifierFeatureMap#getFeature()
	 * @see #getClassifierFeatureMap()
	 * @generated
	 */
	EReference getClassifierFeatureMap_Feature();

	/**
	 * Returns the meta object for the container reference '{@link CWM.CwmTransformation.ClassifierFeatureMap#getClassifierMap <em>Classifier Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Classifier Map</em>'.
	 * @see CWM.CwmTransformation.ClassifierFeatureMap#getClassifierMap()
	 * @see #getClassifierFeatureMap()
	 * @generated
	 */
	EReference getClassifierFeatureMap_ClassifierMap();

	/**
	 * Returns the meta object for class '{@link CWM.CwmTransformation.Transformation_container <em>Transformation container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation container</em>'.
	 * @see CWM.CwmTransformation.Transformation_container
	 * @generated
	 */
	EClass getTransformation_container();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.CwmTransformation.Transformation_container#getTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transformation</em>'.
	 * @see CWM.CwmTransformation.Transformation_container#getTransformation()
	 * @see #getTransformation_container()
	 * @generated
	 */
	EReference getTransformation_container_Transformation();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.CwmTransformation.Transformation_container#getDataObjectSet <em>Data Object Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Object Set</em>'.
	 * @see CWM.CwmTransformation.Transformation_container#getDataObjectSet()
	 * @see #getTransformation_container()
	 * @generated
	 */
	EReference getTransformation_container_DataObjectSet();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.CwmTransformation.Transformation_container#getTransformationTask <em>Transformation Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transformation Task</em>'.
	 * @see CWM.CwmTransformation.Transformation_container#getTransformationTask()
	 * @see #getTransformation_container()
	 * @generated
	 */
	EReference getTransformation_container_TransformationTask();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.CwmTransformation.Transformation_container#getTransformationStep <em>Transformation Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transformation Step</em>'.
	 * @see CWM.CwmTransformation.Transformation_container#getTransformationStep()
	 * @see #getTransformation_container()
	 * @generated
	 */
	EReference getTransformation_container_TransformationStep();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.CwmTransformation.Transformation_container#getTransformationActivity <em>Transformation Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transformation Activity</em>'.
	 * @see CWM.CwmTransformation.Transformation_container#getTransformationActivity()
	 * @see #getTransformation_container()
	 * @generated
	 */
	EReference getTransformation_container_TransformationActivity();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.CwmTransformation.Transformation_container#getPrecedenceConstraint <em>Precedence Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Precedence Constraint</em>'.
	 * @see CWM.CwmTransformation.Transformation_container#getPrecedenceConstraint()
	 * @see #getTransformation_container()
	 * @generated
	 */
	EReference getTransformation_container_PrecedenceConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.CwmTransformation.Transformation_container#getTransformationUse <em>Transformation Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transformation Use</em>'.
	 * @see CWM.CwmTransformation.Transformation_container#getTransformationUse()
	 * @see #getTransformation_container()
	 * @generated
	 */
	EReference getTransformation_container_TransformationUse();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.CwmTransformation.Transformation_container#getTransformationMap <em>Transformation Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transformation Map</em>'.
	 * @see CWM.CwmTransformation.Transformation_container#getTransformationMap()
	 * @see #getTransformation_container()
	 * @generated
	 */
	EReference getTransformation_container_TransformationMap();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.CwmTransformation.Transformation_container#getTransformationTree <em>Transformation Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transformation Tree</em>'.
	 * @see CWM.CwmTransformation.Transformation_container#getTransformationTree()
	 * @see #getTransformation_container()
	 * @generated
	 */
	EReference getTransformation_container_TransformationTree();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.CwmTransformation.Transformation_container#getClassifierMap <em>Classifier Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classifier Map</em>'.
	 * @see CWM.CwmTransformation.Transformation_container#getClassifierMap()
	 * @see #getTransformation_container()
	 * @generated
	 */
	EReference getTransformation_container_ClassifierMap();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.CwmTransformation.Transformation_container#getFeatureMap <em>Feature Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature Map</em>'.
	 * @see CWM.CwmTransformation.Transformation_container#getFeatureMap()
	 * @see #getTransformation_container()
	 * @generated
	 */
	EReference getTransformation_container_FeatureMap();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.CwmTransformation.Transformation_container#getStepPrecedence <em>Step Precedence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Step Precedence</em>'.
	 * @see CWM.CwmTransformation.Transformation_container#getStepPrecedence()
	 * @see #getTransformation_container()
	 * @generated
	 */
	EReference getTransformation_container_StepPrecedence();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.CwmTransformation.Transformation_container#getClassifierFeatureMap <em>Classifier Feature Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classifier Feature Map</em>'.
	 * @see CWM.CwmTransformation.Transformation_container#getClassifierFeatureMap()
	 * @see #getTransformation_container()
	 * @generated
	 */
	EReference getTransformation_container_ClassifierFeatureMap();

	/**
	 * Returns the meta object for enum '{@link CWM.CwmTransformation.TreeType <em>Tree Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tree Type</em>'.
	 * @see CWM.CwmTransformation.TreeType
	 * @generated
	 */
	EEnum getTreeType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CwmTransformationFactory getCwmTransformationFactory();

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
		 * The meta object literal for the '{@link CWM.CwmTransformation.impl.TransformationImpl <em>Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.CwmTransformation.impl.TransformationImpl
		 * @see CWM.CwmTransformation.impl.CwmTransformationPackageImpl#getTransformation()
		 * @generated
		 */
		EClass TRANSFORMATION = eINSTANCE.getTransformation();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__FUNCTION = eINSTANCE.getTransformation_Function();

		/**
		 * The meta object literal for the '<em><b>Function Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__FUNCTION_DESCRIPTION = eINSTANCE.getTransformation_FunctionDescription();

		/**
		 * The meta object literal for the '<em><b>Is Primary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__IS_PRIMARY = eINSTANCE.getTransformation_IsPrimary();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__SOURCE = eINSTANCE.getTransformation_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__TARGET = eINSTANCE.getTransformation_Target();

		/**
		 * The meta object literal for the '<em><b>Use</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__USE = eINSTANCE.getTransformation_Use();

		/**
		 * The meta object literal for the '{@link CWM.CwmTransformation.impl.DataObjectSetImpl <em>Data Object Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.CwmTransformation.impl.DataObjectSetImpl
		 * @see CWM.CwmTransformation.impl.CwmTransformationPackageImpl#getDataObjectSet()
		 * @generated
		 */
		EClass DATA_OBJECT_SET = eINSTANCE.getDataObjectSet();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_OBJECT_SET__ELEMENT = eINSTANCE.getDataObjectSet_Element();

		/**
		 * The meta object literal for the '<em><b>Source Transformation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_OBJECT_SET__SOURCE_TRANSFORMATION = eINSTANCE.getDataObjectSet_SourceTransformation();

		/**
		 * The meta object literal for the '<em><b>Target Transformation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_OBJECT_SET__TARGET_TRANSFORMATION = eINSTANCE.getDataObjectSet_TargetTransformation();

		/**
		 * The meta object literal for the '{@link CWM.CwmTransformation.impl.TransformationTaskImpl <em>Transformation Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.CwmTransformation.impl.TransformationTaskImpl
		 * @see CWM.CwmTransformation.impl.CwmTransformationPackageImpl#getTransformationTask()
		 * @generated
		 */
		EClass TRANSFORMATION_TASK = eINSTANCE.getTransformationTask();

		/**
		 * The meta object literal for the '<em><b>Transformation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_TASK__TRANSFORMATION = eINSTANCE.getTransformationTask_Transformation();

		/**
		 * The meta object literal for the '<em><b>Inverse Task</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_TASK__INVERSE_TASK = eINSTANCE.getTransformationTask_InverseTask();

		/**
		 * The meta object literal for the '<em><b>Original Task</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_TASK__ORIGINAL_TASK = eINSTANCE.getTransformationTask_OriginalTask();

		/**
		 * The meta object literal for the '{@link CWM.CwmTransformation.impl.TransformationStepImpl <em>Transformation Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.CwmTransformation.impl.TransformationStepImpl
		 * @see CWM.CwmTransformation.impl.CwmTransformationPackageImpl#getTransformationStep()
		 * @generated
		 */
		EClass TRANSFORMATION_STEP = eINSTANCE.getTransformationStep();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_STEP__TASK = eINSTANCE.getTransformationStep_Task();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_STEP__ACTIVITY = eINSTANCE.getTransformationStep_Activity();

		/**
		 * The meta object literal for the '<em><b>Precedence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_STEP__PRECEDENCE = eINSTANCE.getTransformationStep_Precedence();

		/**
		 * The meta object literal for the '<em><b>Preceding Step</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_STEP__PRECEDING_STEP = eINSTANCE.getTransformationStep_PrecedingStep();

		/**
		 * The meta object literal for the '<em><b>Succeeding Step</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_STEP__SUCCEEDING_STEP = eINSTANCE.getTransformationStep_SucceedingStep();

		/**
		 * The meta object literal for the '{@link CWM.CwmTransformation.impl.TransformationActivityImpl <em>Transformation Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.CwmTransformation.impl.TransformationActivityImpl
		 * @see CWM.CwmTransformation.impl.CwmTransformationPackageImpl#getTransformationActivity()
		 * @generated
		 */
		EClass TRANSFORMATION_ACTIVITY = eINSTANCE.getTransformationActivity();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION_ACTIVITY__CREATION_DATE = eINSTANCE.getTransformationActivity_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_ACTIVITY__STEP = eINSTANCE.getTransformationActivity_Step();

		/**
		 * The meta object literal for the '{@link CWM.CwmTransformation.impl.PrecedenceConstraintImpl <em>Precedence Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.CwmTransformation.impl.PrecedenceConstraintImpl
		 * @see CWM.CwmTransformation.impl.CwmTransformationPackageImpl#getPrecedenceConstraint()
		 * @generated
		 */
		EClass PRECEDENCE_CONSTRAINT = eINSTANCE.getPrecedenceConstraint();

		/**
		 * The meta object literal for the '{@link CWM.CwmTransformation.impl.TransformationUseImpl <em>Transformation Use</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.CwmTransformation.impl.TransformationUseImpl
		 * @see CWM.CwmTransformation.impl.CwmTransformationPackageImpl#getTransformationUse()
		 * @generated
		 */
		EClass TRANSFORMATION_USE = eINSTANCE.getTransformationUse();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION_USE__TYPE = eINSTANCE.getTransformationUse_Type();

		/**
		 * The meta object literal for the '<em><b>Transformation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_USE__TRANSFORMATION = eINSTANCE.getTransformationUse_Transformation();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_USE__OPERATION = eINSTANCE.getTransformationUse_Operation();

		/**
		 * The meta object literal for the '{@link CWM.CwmTransformation.impl.TransformationMapImpl <em>Transformation Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.CwmTransformation.impl.TransformationMapImpl
		 * @see CWM.CwmTransformation.impl.CwmTransformationPackageImpl#getTransformationMap()
		 * @generated
		 */
		EClass TRANSFORMATION_MAP = eINSTANCE.getTransformationMap();

		/**
		 * The meta object literal for the '<em><b>Classifier Map</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_MAP__CLASSIFIER_MAP = eINSTANCE.getTransformationMap_ClassifierMap();

		/**
		 * The meta object literal for the '{@link CWM.CwmTransformation.impl.TransformationTreeImpl <em>Transformation Tree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.CwmTransformation.impl.TransformationTreeImpl
		 * @see CWM.CwmTransformation.impl.CwmTransformationPackageImpl#getTransformationTree()
		 * @generated
		 */
		EClass TRANSFORMATION_TREE = eINSTANCE.getTransformationTree();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION_TREE__TYPE = eINSTANCE.getTransformationTree_Type();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_TREE__BODY = eINSTANCE.getTransformationTree_Body();

		/**
		 * The meta object literal for the '{@link CWM.CwmTransformation.impl.ClassifierMapImpl <em>Classifier Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.CwmTransformation.impl.ClassifierMapImpl
		 * @see CWM.CwmTransformation.impl.CwmTransformationPackageImpl#getClassifierMap()
		 * @generated
		 */
		EClass CLASSIFIER_MAP = eINSTANCE.getClassifierMap();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER_MAP__FUNCTION = eINSTANCE.getClassifierMap_Function();

		/**
		 * The meta object literal for the '<em><b>Function Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFIER_MAP__FUNCTION_DESCRIPTION = eINSTANCE.getClassifierMap_FunctionDescription();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER_MAP__SOURCE = eINSTANCE.getClassifierMap_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER_MAP__TARGET = eINSTANCE.getClassifierMap_Target();

		/**
		 * The meta object literal for the '<em><b>Transformation Map</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER_MAP__TRANSFORMATION_MAP = eINSTANCE.getClassifierMap_TransformationMap();

		/**
		 * The meta object literal for the '<em><b>Feature Map</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER_MAP__FEATURE_MAP = eINSTANCE.getClassifierMap_FeatureMap();

		/**
		 * The meta object literal for the '<em><b>Cf Map</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER_MAP__CF_MAP = eINSTANCE.getClassifierMap_CfMap();

		/**
		 * The meta object literal for the '{@link CWM.CwmTransformation.impl.FeatureMapImpl <em>Feature Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.CwmTransformation.impl.FeatureMapImpl
		 * @see CWM.CwmTransformation.impl.CwmTransformationPackageImpl#getFeatureMap()
		 * @generated
		 */
		EClass FEATURE_MAP = eINSTANCE.getFeatureMap();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_MAP__FUNCTION = eINSTANCE.getFeatureMap_Function();

		/**
		 * The meta object literal for the '<em><b>Function Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_MAP__FUNCTION_DESCRIPTION = eINSTANCE.getFeatureMap_FunctionDescription();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_MAP__SOURCE = eINSTANCE.getFeatureMap_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_MAP__TARGET = eINSTANCE.getFeatureMap_Target();

		/**
		 * The meta object literal for the '<em><b>Classifier Map</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_MAP__CLASSIFIER_MAP = eINSTANCE.getFeatureMap_ClassifierMap();

		/**
		 * The meta object literal for the '{@link CWM.CwmTransformation.impl.StepPrecedenceImpl <em>Step Precedence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.CwmTransformation.impl.StepPrecedenceImpl
		 * @see CWM.CwmTransformation.impl.CwmTransformationPackageImpl#getStepPrecedence()
		 * @generated
		 */
		EClass STEP_PRECEDENCE = eINSTANCE.getStepPrecedence();

		/**
		 * The meta object literal for the '<em><b>Preceding Step</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP_PRECEDENCE__PRECEDING_STEP = eINSTANCE.getStepPrecedence_PrecedingStep();

		/**
		 * The meta object literal for the '<em><b>Succeeding Step</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP_PRECEDENCE__SUCCEEDING_STEP = eINSTANCE.getStepPrecedence_SucceedingStep();

		/**
		 * The meta object literal for the '{@link CWM.CwmTransformation.impl.ClassifierFeatureMapImpl <em>Classifier Feature Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.CwmTransformation.impl.ClassifierFeatureMapImpl
		 * @see CWM.CwmTransformation.impl.CwmTransformationPackageImpl#getClassifierFeatureMap()
		 * @generated
		 */
		EClass CLASSIFIER_FEATURE_MAP = eINSTANCE.getClassifierFeatureMap();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER_FEATURE_MAP__FUNCTION = eINSTANCE.getClassifierFeatureMap_Function();

		/**
		 * The meta object literal for the '<em><b>Function Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFIER_FEATURE_MAP__FUNCTION_DESCRIPTION = eINSTANCE.getClassifierFeatureMap_FunctionDescription();

		/**
		 * The meta object literal for the '<em><b>Classifier To Feature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFIER_FEATURE_MAP__CLASSIFIER_TO_FEATURE = eINSTANCE.getClassifierFeatureMap_ClassifierToFeature();

		/**
		 * The meta object literal for the '<em><b>Classifier</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER_FEATURE_MAP__CLASSIFIER = eINSTANCE.getClassifierFeatureMap_Classifier();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER_FEATURE_MAP__FEATURE = eINSTANCE.getClassifierFeatureMap_Feature();

		/**
		 * The meta object literal for the '<em><b>Classifier Map</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER_FEATURE_MAP__CLASSIFIER_MAP = eINSTANCE.getClassifierFeatureMap_ClassifierMap();

		/**
		 * The meta object literal for the '{@link CWM.CwmTransformation.impl.Transformation_containerImpl <em>Transformation container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.CwmTransformation.impl.Transformation_containerImpl
		 * @see CWM.CwmTransformation.impl.CwmTransformationPackageImpl#getTransformation_container()
		 * @generated
		 */
		EClass TRANSFORMATION_CONTAINER = eINSTANCE.getTransformation_container();

		/**
		 * The meta object literal for the '<em><b>Transformation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_CONTAINER__TRANSFORMATION = eINSTANCE.getTransformation_container_Transformation();

		/**
		 * The meta object literal for the '<em><b>Data Object Set</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_CONTAINER__DATA_OBJECT_SET = eINSTANCE.getTransformation_container_DataObjectSet();

		/**
		 * The meta object literal for the '<em><b>Transformation Task</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_CONTAINER__TRANSFORMATION_TASK = eINSTANCE.getTransformation_container_TransformationTask();

		/**
		 * The meta object literal for the '<em><b>Transformation Step</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_CONTAINER__TRANSFORMATION_STEP = eINSTANCE.getTransformation_container_TransformationStep();

		/**
		 * The meta object literal for the '<em><b>Transformation Activity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_CONTAINER__TRANSFORMATION_ACTIVITY = eINSTANCE.getTransformation_container_TransformationActivity();

		/**
		 * The meta object literal for the '<em><b>Precedence Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_CONTAINER__PRECEDENCE_CONSTRAINT = eINSTANCE.getTransformation_container_PrecedenceConstraint();

		/**
		 * The meta object literal for the '<em><b>Transformation Use</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_CONTAINER__TRANSFORMATION_USE = eINSTANCE.getTransformation_container_TransformationUse();

		/**
		 * The meta object literal for the '<em><b>Transformation Map</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_CONTAINER__TRANSFORMATION_MAP = eINSTANCE.getTransformation_container_TransformationMap();

		/**
		 * The meta object literal for the '<em><b>Transformation Tree</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_CONTAINER__TRANSFORMATION_TREE = eINSTANCE.getTransformation_container_TransformationTree();

		/**
		 * The meta object literal for the '<em><b>Classifier Map</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_CONTAINER__CLASSIFIER_MAP = eINSTANCE.getTransformation_container_ClassifierMap();

		/**
		 * The meta object literal for the '<em><b>Feature Map</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_CONTAINER__FEATURE_MAP = eINSTANCE.getTransformation_container_FeatureMap();

		/**
		 * The meta object literal for the '<em><b>Step Precedence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_CONTAINER__STEP_PRECEDENCE = eINSTANCE.getTransformation_container_StepPrecedence();

		/**
		 * The meta object literal for the '<em><b>Classifier Feature Map</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_CONTAINER__CLASSIFIER_FEATURE_MAP = eINSTANCE.getTransformation_container_ClassifierFeatureMap();

		/**
		 * The meta object literal for the '{@link CWM.CwmTransformation.TreeType <em>Tree Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.CwmTransformation.TreeType
		 * @see CWM.CwmTransformation.impl.CwmTransformationPackageImpl#getTreeType()
		 * @generated
		 */
		EEnum TREE_TYPE = eINSTANCE.getTreeType();

	}

} //CwmTransformationPackage

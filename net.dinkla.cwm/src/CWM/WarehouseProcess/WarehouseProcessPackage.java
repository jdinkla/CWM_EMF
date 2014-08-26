/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.WarehouseProcess;

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
 * @see CWM.WarehouseProcess.WarehouseProcessFactory
 * @model kind="package"
 * @generated
 */
public interface WarehouseProcessPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "WarehouseProcess";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "WarehouseProcess";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "WarehouseProcess";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WarehouseProcessPackage eINSTANCE = CWM.WarehouseProcess.impl.WarehouseProcessPackageImpl.init();

	/**
	 * The meta object id for the '{@link CWM.WarehouseProcess.impl.WarehouseProcessImpl <em>Warehouse Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.WarehouseProcess.impl.WarehouseProcessImpl
	 * @see CWM.WarehouseProcess.impl.WarehouseProcessPackageImpl#getWarehouseProcess()
	 * @generated
	 */
	int WAREHOUSE_PROCESS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE_PROCESS__NAME = CorePackage.MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE_PROCESS__VISIBILITY = CorePackage.MODEL_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE_PROCESS__CLIENT_DEPENDENCY = CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE_PROCESS__CONSTRAINT = CorePackage.MODEL_ELEMENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE_PROCESS__IMPORTER = CorePackage.MODEL_ELEMENT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE_PROCESS__NAMESPACE = CorePackage.MODEL_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE_PROCESS__TAGGED_VALUE = CorePackage.MODEL_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Static Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE_PROCESS__STATIC_DEFINITION = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Sequential</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE_PROCESS__IS_SEQUENTIAL = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Warehouse Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE_PROCESS__WAREHOUSE_EVENT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Internal Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE_PROCESS__INTERNAL_EVENT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Warehouse Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE_PROCESS_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link CWM.WarehouseProcess.impl.WarehouseStepImpl <em>Warehouse Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.WarehouseProcess.impl.WarehouseStepImpl
	 * @see CWM.WarehouseProcess.impl.WarehouseProcessPackageImpl#getWarehouseStep()
	 * @generated
	 */
	int WAREHOUSE_STEP = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE_STEP__NAME = WAREHOUSE_PROCESS__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE_STEP__VISIBILITY = WAREHOUSE_PROCESS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE_STEP__CLIENT_DEPENDENCY = WAREHOUSE_PROCESS__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE_STEP__CONSTRAINT = WAREHOUSE_PROCESS__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE_STEP__IMPORTER = WAREHOUSE_PROCESS__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE_STEP__NAMESPACE = WAREHOUSE_PROCESS__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE_STEP__TAGGED_VALUE = WAREHOUSE_PROCESS__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Static Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE_STEP__STATIC_DEFINITION = WAREHOUSE_PROCESS__STATIC_DEFINITION;

	/**
	 * The feature id for the '<em><b>Is Sequential</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE_STEP__IS_SEQUENTIAL = WAREHOUSE_PROCESS__IS_SEQUENTIAL;

	/**
	 * The feature id for the '<em><b>Warehouse Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE_STEP__WAREHOUSE_EVENT = WAREHOUSE_PROCESS__WAREHOUSE_EVENT;

	/**
	 * The feature id for the '<em><b>Internal Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE_STEP__INTERNAL_EVENT = WAREHOUSE_PROCESS__INTERNAL_EVENT;

	/**
	 * The feature id for the '<em><b>Transformation Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE_STEP__TRANSFORMATION_STEP = WAREHOUSE_PROCESS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Warehouse Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE_STEP__WAREHOUSE_ACTIVITY = WAREHOUSE_PROCESS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Warehouse Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE_STEP_FEATURE_COUNT = WAREHOUSE_PROCESS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link CWM.WarehouseProcess.impl.ProcessPackageImpl <em>Process Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.WarehouseProcess.impl.ProcessPackageImpl
	 * @see CWM.WarehouseProcess.impl.WarehouseProcessPackageImpl#getProcessPackage()
	 * @generated
	 */
	int PROCESS_PACKAGE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PACKAGE__NAME = CorePackage.PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PACKAGE__VISIBILITY = CorePackage.PACKAGE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PACKAGE__CLIENT_DEPENDENCY = CorePackage.PACKAGE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PACKAGE__CONSTRAINT = CorePackage.PACKAGE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PACKAGE__IMPORTER = CorePackage.PACKAGE__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PACKAGE__NAMESPACE = CorePackage.PACKAGE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PACKAGE__TAGGED_VALUE = CorePackage.PACKAGE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PACKAGE__OWNED_ELEMENT = CorePackage.PACKAGE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Imported Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PACKAGE__IMPORTED_ELEMENT = CorePackage.PACKAGE__IMPORTED_ELEMENT;

	/**
	 * The number of structural features of the '<em>Process Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PACKAGE_FEATURE_COUNT = CorePackage.PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CWM.WarehouseProcess.impl.WarehouseActivityImpl <em>Warehouse Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.WarehouseProcess.impl.WarehouseActivityImpl
	 * @see CWM.WarehouseProcess.impl.WarehouseProcessPackageImpl#getWarehouseActivity()
	 * @generated
	 */
	int WAREHOUSE_ACTIVITY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE_ACTIVITY__NAME = WAREHOUSE_PROCESS__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE_ACTIVITY__VISIBILITY = WAREHOUSE_PROCESS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE_ACTIVITY__CLIENT_DEPENDENCY = WAREHOUSE_PROCESS__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE_ACTIVITY__CONSTRAINT = WAREHOUSE_PROCESS__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE_ACTIVITY__IMPORTER = WAREHOUSE_PROCESS__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE_ACTIVITY__NAMESPACE = WAREHOUSE_PROCESS__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE_ACTIVITY__TAGGED_VALUE = WAREHOUSE_PROCESS__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Static Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE_ACTIVITY__STATIC_DEFINITION = WAREHOUSE_PROCESS__STATIC_DEFINITION;

	/**
	 * The feature id for the '<em><b>Is Sequential</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE_ACTIVITY__IS_SEQUENTIAL = WAREHOUSE_PROCESS__IS_SEQUENTIAL;

	/**
	 * The feature id for the '<em><b>Warehouse Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE_ACTIVITY__WAREHOUSE_EVENT = WAREHOUSE_PROCESS__WAREHOUSE_EVENT;

	/**
	 * The feature id for the '<em><b>Internal Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE_ACTIVITY__INTERNAL_EVENT = WAREHOUSE_PROCESS__INTERNAL_EVENT;

	/**
	 * The feature id for the '<em><b>Transformation Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE_ACTIVITY__TRANSFORMATION_ACTIVITY = WAREHOUSE_PROCESS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Warehouse Step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE_ACTIVITY__WAREHOUSE_STEP = WAREHOUSE_PROCESS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Warehouse Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE_ACTIVITY_FEATURE_COUNT = WAREHOUSE_PROCESS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link CWM.WarehouseProcess.impl.WarehouseProcess_containerImpl <em>Warehouse Process container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.WarehouseProcess.impl.WarehouseProcess_containerImpl
	 * @see CWM.WarehouseProcess.impl.WarehouseProcessPackageImpl#getWarehouseProcess_container()
	 * @generated
	 */
	int WAREHOUSE_PROCESS_CONTAINER = 4;

	/**
	 * The feature id for the '<em><b>Warehouse Process</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE_PROCESS_CONTAINER__WAREHOUSE_PROCESS = 0;

	/**
	 * The feature id for the '<em><b>Warehouse Step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE_PROCESS_CONTAINER__WAREHOUSE_STEP = 1;

	/**
	 * The feature id for the '<em><b>Process Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE_PROCESS_CONTAINER__PROCESS_PACKAGE = 2;

	/**
	 * The feature id for the '<em><b>Warehouse Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE_PROCESS_CONTAINER__WAREHOUSE_ACTIVITY = 3;

	/**
	 * The number of structural features of the '<em>Warehouse Process container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE_PROCESS_CONTAINER_FEATURE_COUNT = 4;


	/**
	 * Returns the meta object for class '{@link CWM.WarehouseProcess.WarehouseProcess <em>Warehouse Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Warehouse Process</em>'.
	 * @see CWM.WarehouseProcess.WarehouseProcess
	 * @generated
	 */
	EClass getWarehouseProcess();

	/**
	 * Returns the meta object for the attribute '{@link CWM.WarehouseProcess.WarehouseProcess#getStaticDefinition <em>Static Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Static Definition</em>'.
	 * @see CWM.WarehouseProcess.WarehouseProcess#getStaticDefinition()
	 * @see #getWarehouseProcess()
	 * @generated
	 */
	EAttribute getWarehouseProcess_StaticDefinition();

	/**
	 * Returns the meta object for the attribute '{@link CWM.WarehouseProcess.WarehouseProcess#getIsSequential <em>Is Sequential</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Sequential</em>'.
	 * @see CWM.WarehouseProcess.WarehouseProcess#getIsSequential()
	 * @see #getWarehouseProcess()
	 * @generated
	 */
	EAttribute getWarehouseProcess_IsSequential();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.WarehouseProcess.WarehouseProcess#getWarehouseEvent <em>Warehouse Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Warehouse Event</em>'.
	 * @see CWM.WarehouseProcess.WarehouseProcess#getWarehouseEvent()
	 * @see #getWarehouseProcess()
	 * @generated
	 */
	EReference getWarehouseProcess_WarehouseEvent();

	/**
	 * Returns the meta object for the reference list '{@link CWM.WarehouseProcess.WarehouseProcess#getInternalEvent <em>Internal Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Internal Event</em>'.
	 * @see CWM.WarehouseProcess.WarehouseProcess#getInternalEvent()
	 * @see #getWarehouseProcess()
	 * @generated
	 */
	EReference getWarehouseProcess_InternalEvent();

	/**
	 * Returns the meta object for class '{@link CWM.WarehouseProcess.WarehouseStep <em>Warehouse Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Warehouse Step</em>'.
	 * @see CWM.WarehouseProcess.WarehouseStep
	 * @generated
	 */
	EClass getWarehouseStep();

	/**
	 * Returns the meta object for the reference '{@link CWM.WarehouseProcess.WarehouseStep#getTransformationStep <em>Transformation Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transformation Step</em>'.
	 * @see CWM.WarehouseProcess.WarehouseStep#getTransformationStep()
	 * @see #getWarehouseStep()
	 * @generated
	 */
	EReference getWarehouseStep_TransformationStep();

	/**
	 * Returns the meta object for the container reference '{@link CWM.WarehouseProcess.WarehouseStep#getWarehouseActivity <em>Warehouse Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Warehouse Activity</em>'.
	 * @see CWM.WarehouseProcess.WarehouseStep#getWarehouseActivity()
	 * @see #getWarehouseStep()
	 * @generated
	 */
	EReference getWarehouseStep_WarehouseActivity();

	/**
	 * Returns the meta object for class '{@link CWM.WarehouseProcess.ProcessPackage <em>Process Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Package</em>'.
	 * @see CWM.WarehouseProcess.ProcessPackage
	 * @generated
	 */
	EClass getProcessPackage();

	/**
	 * Returns the meta object for class '{@link CWM.WarehouseProcess.WarehouseActivity <em>Warehouse Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Warehouse Activity</em>'.
	 * @see CWM.WarehouseProcess.WarehouseActivity
	 * @generated
	 */
	EClass getWarehouseActivity();

	/**
	 * Returns the meta object for the reference '{@link CWM.WarehouseProcess.WarehouseActivity#getTransformationActivity <em>Transformation Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transformation Activity</em>'.
	 * @see CWM.WarehouseProcess.WarehouseActivity#getTransformationActivity()
	 * @see #getWarehouseActivity()
	 * @generated
	 */
	EReference getWarehouseActivity_TransformationActivity();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.WarehouseProcess.WarehouseActivity#getWarehouseStep <em>Warehouse Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Warehouse Step</em>'.
	 * @see CWM.WarehouseProcess.WarehouseActivity#getWarehouseStep()
	 * @see #getWarehouseActivity()
	 * @generated
	 */
	EReference getWarehouseActivity_WarehouseStep();

	/**
	 * Returns the meta object for class '{@link CWM.WarehouseProcess.WarehouseProcess_container <em>Warehouse Process container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Warehouse Process container</em>'.
	 * @see CWM.WarehouseProcess.WarehouseProcess_container
	 * @generated
	 */
	EClass getWarehouseProcess_container();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.WarehouseProcess.WarehouseProcess_container#getWarehouseProcess <em>Warehouse Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Warehouse Process</em>'.
	 * @see CWM.WarehouseProcess.WarehouseProcess_container#getWarehouseProcess()
	 * @see #getWarehouseProcess_container()
	 * @generated
	 */
	EReference getWarehouseProcess_container_WarehouseProcess();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.WarehouseProcess.WarehouseProcess_container#getWarehouseStep <em>Warehouse Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Warehouse Step</em>'.
	 * @see CWM.WarehouseProcess.WarehouseProcess_container#getWarehouseStep()
	 * @see #getWarehouseProcess_container()
	 * @generated
	 */
	EReference getWarehouseProcess_container_WarehouseStep();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.WarehouseProcess.WarehouseProcess_container#getProcessPackage <em>Process Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Process Package</em>'.
	 * @see CWM.WarehouseProcess.WarehouseProcess_container#getProcessPackage()
	 * @see #getWarehouseProcess_container()
	 * @generated
	 */
	EReference getWarehouseProcess_container_ProcessPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.WarehouseProcess.WarehouseProcess_container#getWarehouseActivity <em>Warehouse Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Warehouse Activity</em>'.
	 * @see CWM.WarehouseProcess.WarehouseProcess_container#getWarehouseActivity()
	 * @see #getWarehouseProcess_container()
	 * @generated
	 */
	EReference getWarehouseProcess_container_WarehouseActivity();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WarehouseProcessFactory getWarehouseProcessFactory();

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
		 * The meta object literal for the '{@link CWM.WarehouseProcess.impl.WarehouseProcessImpl <em>Warehouse Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.WarehouseProcess.impl.WarehouseProcessImpl
		 * @see CWM.WarehouseProcess.impl.WarehouseProcessPackageImpl#getWarehouseProcess()
		 * @generated
		 */
		EClass WAREHOUSE_PROCESS = eINSTANCE.getWarehouseProcess();

		/**
		 * The meta object literal for the '<em><b>Static Definition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAREHOUSE_PROCESS__STATIC_DEFINITION = eINSTANCE.getWarehouseProcess_StaticDefinition();

		/**
		 * The meta object literal for the '<em><b>Is Sequential</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAREHOUSE_PROCESS__IS_SEQUENTIAL = eINSTANCE.getWarehouseProcess_IsSequential();

		/**
		 * The meta object literal for the '<em><b>Warehouse Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WAREHOUSE_PROCESS__WAREHOUSE_EVENT = eINSTANCE.getWarehouseProcess_WarehouseEvent();

		/**
		 * The meta object literal for the '<em><b>Internal Event</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WAREHOUSE_PROCESS__INTERNAL_EVENT = eINSTANCE.getWarehouseProcess_InternalEvent();

		/**
		 * The meta object literal for the '{@link CWM.WarehouseProcess.impl.WarehouseStepImpl <em>Warehouse Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.WarehouseProcess.impl.WarehouseStepImpl
		 * @see CWM.WarehouseProcess.impl.WarehouseProcessPackageImpl#getWarehouseStep()
		 * @generated
		 */
		EClass WAREHOUSE_STEP = eINSTANCE.getWarehouseStep();

		/**
		 * The meta object literal for the '<em><b>Transformation Step</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WAREHOUSE_STEP__TRANSFORMATION_STEP = eINSTANCE.getWarehouseStep_TransformationStep();

		/**
		 * The meta object literal for the '<em><b>Warehouse Activity</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WAREHOUSE_STEP__WAREHOUSE_ACTIVITY = eINSTANCE.getWarehouseStep_WarehouseActivity();

		/**
		 * The meta object literal for the '{@link CWM.WarehouseProcess.impl.ProcessPackageImpl <em>Process Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.WarehouseProcess.impl.ProcessPackageImpl
		 * @see CWM.WarehouseProcess.impl.WarehouseProcessPackageImpl#getProcessPackage()
		 * @generated
		 */
		EClass PROCESS_PACKAGE = eINSTANCE.getProcessPackage();

		/**
		 * The meta object literal for the '{@link CWM.WarehouseProcess.impl.WarehouseActivityImpl <em>Warehouse Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.WarehouseProcess.impl.WarehouseActivityImpl
		 * @see CWM.WarehouseProcess.impl.WarehouseProcessPackageImpl#getWarehouseActivity()
		 * @generated
		 */
		EClass WAREHOUSE_ACTIVITY = eINSTANCE.getWarehouseActivity();

		/**
		 * The meta object literal for the '<em><b>Transformation Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WAREHOUSE_ACTIVITY__TRANSFORMATION_ACTIVITY = eINSTANCE.getWarehouseActivity_TransformationActivity();

		/**
		 * The meta object literal for the '<em><b>Warehouse Step</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WAREHOUSE_ACTIVITY__WAREHOUSE_STEP = eINSTANCE.getWarehouseActivity_WarehouseStep();

		/**
		 * The meta object literal for the '{@link CWM.WarehouseProcess.impl.WarehouseProcess_containerImpl <em>Warehouse Process container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.WarehouseProcess.impl.WarehouseProcess_containerImpl
		 * @see CWM.WarehouseProcess.impl.WarehouseProcessPackageImpl#getWarehouseProcess_container()
		 * @generated
		 */
		EClass WAREHOUSE_PROCESS_CONTAINER = eINSTANCE.getWarehouseProcess_container();

		/**
		 * The meta object literal for the '<em><b>Warehouse Process</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WAREHOUSE_PROCESS_CONTAINER__WAREHOUSE_PROCESS = eINSTANCE.getWarehouseProcess_container_WarehouseProcess();

		/**
		 * The meta object literal for the '<em><b>Warehouse Step</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WAREHOUSE_PROCESS_CONTAINER__WAREHOUSE_STEP = eINSTANCE.getWarehouseProcess_container_WarehouseStep();

		/**
		 * The meta object literal for the '<em><b>Process Package</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WAREHOUSE_PROCESS_CONTAINER__PROCESS_PACKAGE = eINSTANCE.getWarehouseProcess_container_ProcessPackage();

		/**
		 * The meta object literal for the '<em><b>Warehouse Activity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WAREHOUSE_PROCESS_CONTAINER__WAREHOUSE_ACTIVITY = eINSTANCE.getWarehouseProcess_container_WarehouseActivity();

	}

} //WarehouseProcessPackage

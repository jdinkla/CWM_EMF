/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningResult;

import CWM.Core.CorePackage;

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
 * @see CWM.MiningCore.MiningResult.MiningResultFactory
 * @model kind="package"
 * @generated
 */
public interface MiningResultPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "MiningResult";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "MiningResult";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "MiningResult";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MiningResultPackage eINSTANCE = CWM.MiningCore.MiningResult.impl.MiningResultPackageImpl.init();

	/**
	 * The meta object id for the '{@link CWM.MiningCore.MiningResult.impl.MiningResultImpl <em>Mining Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.MiningCore.MiningResult.impl.MiningResultImpl
	 * @see CWM.MiningCore.MiningResult.impl.MiningResultPackageImpl#getMiningResult()
	 * @generated
	 */
	int MINING_RESULT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_RESULT__NAME = CorePackage.MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_RESULT__VISIBILITY = CorePackage.MODEL_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_RESULT__CLIENT_DEPENDENCY = CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_RESULT__CONSTRAINT = CorePackage.MODEL_ELEMENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_RESULT__IMPORTER = CorePackage.MODEL_ELEMENT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_RESULT__NAMESPACE = CorePackage.MODEL_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_RESULT__TAGGED_VALUE = CorePackage.MODEL_ELEMENT__TAGGED_VALUE;

	/**
	 * The number of structural features of the '<em>Mining Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_RESULT_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CWM.MiningCore.MiningResult.impl.MiningResult_containerImpl <em>Mining Result container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.MiningCore.MiningResult.impl.MiningResult_containerImpl
	 * @see CWM.MiningCore.MiningResult.impl.MiningResultPackageImpl#getMiningResult_container()
	 * @generated
	 */
	int MINING_RESULT_CONTAINER = 1;

	/**
	 * The feature id for the '<em><b>Mining Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_RESULT_CONTAINER__MINING_RESULT = 0;

	/**
	 * The number of structural features of the '<em>Mining Result container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_RESULT_CONTAINER_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link CWM.MiningCore.MiningResult.MiningResult <em>Mining Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mining Result</em>'.
	 * @see CWM.MiningCore.MiningResult.MiningResult
	 * @generated
	 */
	EClass getMiningResult();

	/**
	 * Returns the meta object for class '{@link CWM.MiningCore.MiningResult.MiningResult_container <em>Mining Result container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mining Result container</em>'.
	 * @see CWM.MiningCore.MiningResult.MiningResult_container
	 * @generated
	 */
	EClass getMiningResult_container();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.MiningCore.MiningResult.MiningResult_container#getMiningResult <em>Mining Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mining Result</em>'.
	 * @see CWM.MiningCore.MiningResult.MiningResult_container#getMiningResult()
	 * @see #getMiningResult_container()
	 * @generated
	 */
	EReference getMiningResult_container_MiningResult();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MiningResultFactory getMiningResultFactory();

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
		 * The meta object literal for the '{@link CWM.MiningCore.MiningResult.impl.MiningResultImpl <em>Mining Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.MiningCore.MiningResult.impl.MiningResultImpl
		 * @see CWM.MiningCore.MiningResult.impl.MiningResultPackageImpl#getMiningResult()
		 * @generated
		 */
		EClass MINING_RESULT = eINSTANCE.getMiningResult();

		/**
		 * The meta object literal for the '{@link CWM.MiningCore.MiningResult.impl.MiningResult_containerImpl <em>Mining Result container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.MiningCore.MiningResult.impl.MiningResult_containerImpl
		 * @see CWM.MiningCore.MiningResult.impl.MiningResultPackageImpl#getMiningResult_container()
		 * @generated
		 */
		EClass MINING_RESULT_CONTAINER = eINSTANCE.getMiningResult_container();

		/**
		 * The meta object literal for the '<em><b>Mining Result</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINING_RESULT_CONTAINER__MINING_RESULT = eINSTANCE.getMiningResult_container_MiningResult();

	}

} //MiningResultPackage

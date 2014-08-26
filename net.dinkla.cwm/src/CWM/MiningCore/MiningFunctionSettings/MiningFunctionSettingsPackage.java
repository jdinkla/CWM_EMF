/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningFunctionSettings;

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
 * @see CWM.MiningCore.MiningFunctionSettings.MiningFunctionSettingsFactory
 * @model kind="package"
 * @generated
 */
public interface MiningFunctionSettingsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "MiningFunctionSettings";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "MiningFunctionSettings";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "MiningFunctionSettings";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MiningFunctionSettingsPackage eINSTANCE = CWM.MiningCore.MiningFunctionSettings.impl.MiningFunctionSettingsPackageImpl.init();

	/**
	 * The meta object id for the '{@link CWM.MiningCore.MiningFunctionSettings.impl.MiningAlgorithmSettingsImpl <em>Mining Algorithm Settings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.MiningCore.MiningFunctionSettings.impl.MiningAlgorithmSettingsImpl
	 * @see CWM.MiningCore.MiningFunctionSettings.impl.MiningFunctionSettingsPackageImpl#getMiningAlgorithmSettings()
	 * @generated
	 */
	int MINING_ALGORITHM_SETTINGS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_ALGORITHM_SETTINGS__NAME = CorePackage.MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_ALGORITHM_SETTINGS__VISIBILITY = CorePackage.MODEL_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_ALGORITHM_SETTINGS__CLIENT_DEPENDENCY = CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_ALGORITHM_SETTINGS__CONSTRAINT = CorePackage.MODEL_ELEMENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_ALGORITHM_SETTINGS__IMPORTER = CorePackage.MODEL_ELEMENT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_ALGORITHM_SETTINGS__NAMESPACE = CorePackage.MODEL_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_ALGORITHM_SETTINGS__TAGGED_VALUE = CorePackage.MODEL_ELEMENT__TAGGED_VALUE;

	/**
	 * The number of structural features of the '<em>Mining Algorithm Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_ALGORITHM_SETTINGS_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CWM.MiningCore.MiningFunctionSettings.impl.MiningFunctionSettingsImpl <em>Mining Function Settings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.MiningCore.MiningFunctionSettings.impl.MiningFunctionSettingsImpl
	 * @see CWM.MiningCore.MiningFunctionSettings.impl.MiningFunctionSettingsPackageImpl#getMiningFunctionSettings()
	 * @generated
	 */
	int MINING_FUNCTION_SETTINGS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_FUNCTION_SETTINGS__NAME = CorePackage.MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_FUNCTION_SETTINGS__VISIBILITY = CorePackage.MODEL_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_FUNCTION_SETTINGS__CLIENT_DEPENDENCY = CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_FUNCTION_SETTINGS__CONSTRAINT = CorePackage.MODEL_ELEMENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_FUNCTION_SETTINGS__IMPORTER = CorePackage.MODEL_ELEMENT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_FUNCTION_SETTINGS__NAMESPACE = CorePackage.MODEL_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_FUNCTION_SETTINGS__TAGGED_VALUE = CorePackage.MODEL_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Algorithm Settings</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_FUNCTION_SETTINGS__ALGORITHM_SETTINGS = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Desired Execution Time In Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_FUNCTION_SETTINGS__DESIRED_EXECUTION_TIME_IN_MINUTES = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attribute Usage Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_FUNCTION_SETTINGS__ATTRIBUTE_USAGE_SET = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Logical Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_FUNCTION_SETTINGS__LOGICAL_DATA = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Mining Function Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_FUNCTION_SETTINGS_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link CWM.MiningCore.MiningFunctionSettings.impl.MiningFunctionSettings_containerImpl <em>Mining Function Settings container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.MiningCore.MiningFunctionSettings.impl.MiningFunctionSettings_containerImpl
	 * @see CWM.MiningCore.MiningFunctionSettings.impl.MiningFunctionSettingsPackageImpl#getMiningFunctionSettings_container()
	 * @generated
	 */
	int MINING_FUNCTION_SETTINGS_CONTAINER = 2;

	/**
	 * The feature id for the '<em><b>Mining Algorithm Settings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_FUNCTION_SETTINGS_CONTAINER__MINING_ALGORITHM_SETTINGS = 0;

	/**
	 * The feature id for the '<em><b>Mining Function Settings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_FUNCTION_SETTINGS_CONTAINER__MINING_FUNCTION_SETTINGS = 1;

	/**
	 * The number of structural features of the '<em>Mining Function Settings container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_FUNCTION_SETTINGS_CONTAINER_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link CWM.MiningCore.MiningFunctionSettings.MiningAlgorithmSettings <em>Mining Algorithm Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mining Algorithm Settings</em>'.
	 * @see CWM.MiningCore.MiningFunctionSettings.MiningAlgorithmSettings
	 * @generated
	 */
	EClass getMiningAlgorithmSettings();

	/**
	 * Returns the meta object for class '{@link CWM.MiningCore.MiningFunctionSettings.MiningFunctionSettings <em>Mining Function Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mining Function Settings</em>'.
	 * @see CWM.MiningCore.MiningFunctionSettings.MiningFunctionSettings
	 * @generated
	 */
	EClass getMiningFunctionSettings();

	/**
	 * Returns the meta object for the reference '{@link CWM.MiningCore.MiningFunctionSettings.MiningFunctionSettings#getAlgorithmSettings <em>Algorithm Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Algorithm Settings</em>'.
	 * @see CWM.MiningCore.MiningFunctionSettings.MiningFunctionSettings#getAlgorithmSettings()
	 * @see #getMiningFunctionSettings()
	 * @generated
	 */
	EReference getMiningFunctionSettings_AlgorithmSettings();

	/**
	 * Returns the meta object for the attribute '{@link CWM.MiningCore.MiningFunctionSettings.MiningFunctionSettings#getDesiredExecutionTimeInMinutes <em>Desired Execution Time In Minutes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desired Execution Time In Minutes</em>'.
	 * @see CWM.MiningCore.MiningFunctionSettings.MiningFunctionSettings#getDesiredExecutionTimeInMinutes()
	 * @see #getMiningFunctionSettings()
	 * @generated
	 */
	EAttribute getMiningFunctionSettings_DesiredExecutionTimeInMinutes();

	/**
	 * Returns the meta object for the containment reference '{@link CWM.MiningCore.MiningFunctionSettings.MiningFunctionSettings#getAttributeUsageSet <em>Attribute Usage Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attribute Usage Set</em>'.
	 * @see CWM.MiningCore.MiningFunctionSettings.MiningFunctionSettings#getAttributeUsageSet()
	 * @see #getMiningFunctionSettings()
	 * @generated
	 */
	EReference getMiningFunctionSettings_AttributeUsageSet();

	/**
	 * Returns the meta object for the reference '{@link CWM.MiningCore.MiningFunctionSettings.MiningFunctionSettings#getLogicalData <em>Logical Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Logical Data</em>'.
	 * @see CWM.MiningCore.MiningFunctionSettings.MiningFunctionSettings#getLogicalData()
	 * @see #getMiningFunctionSettings()
	 * @generated
	 */
	EReference getMiningFunctionSettings_LogicalData();

	/**
	 * Returns the meta object for class '{@link CWM.MiningCore.MiningFunctionSettings.MiningFunctionSettings_container <em>Mining Function Settings container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mining Function Settings container</em>'.
	 * @see CWM.MiningCore.MiningFunctionSettings.MiningFunctionSettings_container
	 * @generated
	 */
	EClass getMiningFunctionSettings_container();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.MiningCore.MiningFunctionSettings.MiningFunctionSettings_container#getMiningAlgorithmSettings <em>Mining Algorithm Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mining Algorithm Settings</em>'.
	 * @see CWM.MiningCore.MiningFunctionSettings.MiningFunctionSettings_container#getMiningAlgorithmSettings()
	 * @see #getMiningFunctionSettings_container()
	 * @generated
	 */
	EReference getMiningFunctionSettings_container_MiningAlgorithmSettings();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.MiningCore.MiningFunctionSettings.MiningFunctionSettings_container#getMiningFunctionSettings <em>Mining Function Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mining Function Settings</em>'.
	 * @see CWM.MiningCore.MiningFunctionSettings.MiningFunctionSettings_container#getMiningFunctionSettings()
	 * @see #getMiningFunctionSettings_container()
	 * @generated
	 */
	EReference getMiningFunctionSettings_container_MiningFunctionSettings();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MiningFunctionSettingsFactory getMiningFunctionSettingsFactory();

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
		 * The meta object literal for the '{@link CWM.MiningCore.MiningFunctionSettings.impl.MiningAlgorithmSettingsImpl <em>Mining Algorithm Settings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.MiningCore.MiningFunctionSettings.impl.MiningAlgorithmSettingsImpl
		 * @see CWM.MiningCore.MiningFunctionSettings.impl.MiningFunctionSettingsPackageImpl#getMiningAlgorithmSettings()
		 * @generated
		 */
		EClass MINING_ALGORITHM_SETTINGS = eINSTANCE.getMiningAlgorithmSettings();

		/**
		 * The meta object literal for the '{@link CWM.MiningCore.MiningFunctionSettings.impl.MiningFunctionSettingsImpl <em>Mining Function Settings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.MiningCore.MiningFunctionSettings.impl.MiningFunctionSettingsImpl
		 * @see CWM.MiningCore.MiningFunctionSettings.impl.MiningFunctionSettingsPackageImpl#getMiningFunctionSettings()
		 * @generated
		 */
		EClass MINING_FUNCTION_SETTINGS = eINSTANCE.getMiningFunctionSettings();

		/**
		 * The meta object literal for the '<em><b>Algorithm Settings</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINING_FUNCTION_SETTINGS__ALGORITHM_SETTINGS = eINSTANCE.getMiningFunctionSettings_AlgorithmSettings();

		/**
		 * The meta object literal for the '<em><b>Desired Execution Time In Minutes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MINING_FUNCTION_SETTINGS__DESIRED_EXECUTION_TIME_IN_MINUTES = eINSTANCE.getMiningFunctionSettings_DesiredExecutionTimeInMinutes();

		/**
		 * The meta object literal for the '<em><b>Attribute Usage Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINING_FUNCTION_SETTINGS__ATTRIBUTE_USAGE_SET = eINSTANCE.getMiningFunctionSettings_AttributeUsageSet();

		/**
		 * The meta object literal for the '<em><b>Logical Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINING_FUNCTION_SETTINGS__LOGICAL_DATA = eINSTANCE.getMiningFunctionSettings_LogicalData();

		/**
		 * The meta object literal for the '{@link CWM.MiningCore.MiningFunctionSettings.impl.MiningFunctionSettings_containerImpl <em>Mining Function Settings container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.MiningCore.MiningFunctionSettings.impl.MiningFunctionSettings_containerImpl
		 * @see CWM.MiningCore.MiningFunctionSettings.impl.MiningFunctionSettingsPackageImpl#getMiningFunctionSettings_container()
		 * @generated
		 */
		EClass MINING_FUNCTION_SETTINGS_CONTAINER = eINSTANCE.getMiningFunctionSettings_container();

		/**
		 * The meta object literal for the '<em><b>Mining Algorithm Settings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINING_FUNCTION_SETTINGS_CONTAINER__MINING_ALGORITHM_SETTINGS = eINSTANCE.getMiningFunctionSettings_container_MiningAlgorithmSettings();

		/**
		 * The meta object literal for the '<em><b>Mining Function Settings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINING_FUNCTION_SETTINGS_CONTAINER__MINING_FUNCTION_SETTINGS = eINSTANCE.getMiningFunctionSettings_container_MiningFunctionSettings();

	}

} //MiningFunctionSettingsPackage

/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.AttributeImportance;

import CWM.Supervised.SupervisedPackage;

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
 * @see CWM.AttributeImportance.AttributeImportanceFactory
 * @model kind="package"
 * @generated
 */
public interface AttributeImportancePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "AttributeImportance";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "AttributeImportance";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "AttributeImportance";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AttributeImportancePackage eINSTANCE = CWM.AttributeImportance.impl.AttributeImportancePackageImpl.init();

	/**
	 * The meta object id for the '{@link CWM.AttributeImportance.impl.AttributeImportanceSettingsImpl <em>Settings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.AttributeImportance.impl.AttributeImportanceSettingsImpl
	 * @see CWM.AttributeImportance.impl.AttributeImportancePackageImpl#getAttributeImportanceSettings()
	 * @generated
	 */
	int ATTRIBUTE_IMPORTANCE_SETTINGS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_IMPORTANCE_SETTINGS__NAME = SupervisedPackage.SUPERVISED_FUNCTION_SETTINGS__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_IMPORTANCE_SETTINGS__VISIBILITY = SupervisedPackage.SUPERVISED_FUNCTION_SETTINGS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_IMPORTANCE_SETTINGS__CLIENT_DEPENDENCY = SupervisedPackage.SUPERVISED_FUNCTION_SETTINGS__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_IMPORTANCE_SETTINGS__CONSTRAINT = SupervisedPackage.SUPERVISED_FUNCTION_SETTINGS__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_IMPORTANCE_SETTINGS__IMPORTER = SupervisedPackage.SUPERVISED_FUNCTION_SETTINGS__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_IMPORTANCE_SETTINGS__NAMESPACE = SupervisedPackage.SUPERVISED_FUNCTION_SETTINGS__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_IMPORTANCE_SETTINGS__TAGGED_VALUE = SupervisedPackage.SUPERVISED_FUNCTION_SETTINGS__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Algorithm Settings</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_IMPORTANCE_SETTINGS__ALGORITHM_SETTINGS = SupervisedPackage.SUPERVISED_FUNCTION_SETTINGS__ALGORITHM_SETTINGS;

	/**
	 * The feature id for the '<em><b>Desired Execution Time In Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_IMPORTANCE_SETTINGS__DESIRED_EXECUTION_TIME_IN_MINUTES = SupervisedPackage.SUPERVISED_FUNCTION_SETTINGS__DESIRED_EXECUTION_TIME_IN_MINUTES;

	/**
	 * The feature id for the '<em><b>Attribute Usage Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_IMPORTANCE_SETTINGS__ATTRIBUTE_USAGE_SET = SupervisedPackage.SUPERVISED_FUNCTION_SETTINGS__ATTRIBUTE_USAGE_SET;

	/**
	 * The feature id for the '<em><b>Logical Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_IMPORTANCE_SETTINGS__LOGICAL_DATA = SupervisedPackage.SUPERVISED_FUNCTION_SETTINGS__LOGICAL_DATA;

	/**
	 * The feature id for the '<em><b>Maximum Result Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_IMPORTANCE_SETTINGS__MAXIMUM_RESULT_SIZE = SupervisedPackage.SUPERVISED_FUNCTION_SETTINGS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Return Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_IMPORTANCE_SETTINGS__RETURN_TOP = SupervisedPackage.SUPERVISED_FUNCTION_SETTINGS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_IMPORTANCE_SETTINGS_FEATURE_COUNT = SupervisedPackage.SUPERVISED_FUNCTION_SETTINGS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link CWM.AttributeImportance.impl.AttributeImportance_containerImpl <em>Attribute Importance container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.AttributeImportance.impl.AttributeImportance_containerImpl
	 * @see CWM.AttributeImportance.impl.AttributeImportancePackageImpl#getAttributeImportance_container()
	 * @generated
	 */
	int ATTRIBUTE_IMPORTANCE_CONTAINER = 1;

	/**
	 * The feature id for the '<em><b>Attribute Importance Settings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_IMPORTANCE_CONTAINER__ATTRIBUTE_IMPORTANCE_SETTINGS = 0;

	/**
	 * The number of structural features of the '<em>Attribute Importance container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_IMPORTANCE_CONTAINER_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link CWM.AttributeImportance.AttributeImportanceSettings <em>Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Settings</em>'.
	 * @see CWM.AttributeImportance.AttributeImportanceSettings
	 * @generated
	 */
	EClass getAttributeImportanceSettings();

	/**
	 * Returns the meta object for the attribute '{@link CWM.AttributeImportance.AttributeImportanceSettings#getMaximumResultSize <em>Maximum Result Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Result Size</em>'.
	 * @see CWM.AttributeImportance.AttributeImportanceSettings#getMaximumResultSize()
	 * @see #getAttributeImportanceSettings()
	 * @generated
	 */
	EAttribute getAttributeImportanceSettings_MaximumResultSize();

	/**
	 * Returns the meta object for the attribute '{@link CWM.AttributeImportance.AttributeImportanceSettings#getReturnTop <em>Return Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Top</em>'.
	 * @see CWM.AttributeImportance.AttributeImportanceSettings#getReturnTop()
	 * @see #getAttributeImportanceSettings()
	 * @generated
	 */
	EAttribute getAttributeImportanceSettings_ReturnTop();

	/**
	 * Returns the meta object for class '{@link CWM.AttributeImportance.AttributeImportance_container <em>Attribute Importance container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Importance container</em>'.
	 * @see CWM.AttributeImportance.AttributeImportance_container
	 * @generated
	 */
	EClass getAttributeImportance_container();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.AttributeImportance.AttributeImportance_container#getAttributeImportanceSettings <em>Attribute Importance Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute Importance Settings</em>'.
	 * @see CWM.AttributeImportance.AttributeImportance_container#getAttributeImportanceSettings()
	 * @see #getAttributeImportance_container()
	 * @generated
	 */
	EReference getAttributeImportance_container_AttributeImportanceSettings();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AttributeImportanceFactory getAttributeImportanceFactory();

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
		 * The meta object literal for the '{@link CWM.AttributeImportance.impl.AttributeImportanceSettingsImpl <em>Settings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.AttributeImportance.impl.AttributeImportanceSettingsImpl
		 * @see CWM.AttributeImportance.impl.AttributeImportancePackageImpl#getAttributeImportanceSettings()
		 * @generated
		 */
		EClass ATTRIBUTE_IMPORTANCE_SETTINGS = eINSTANCE.getAttributeImportanceSettings();

		/**
		 * The meta object literal for the '<em><b>Maximum Result Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_IMPORTANCE_SETTINGS__MAXIMUM_RESULT_SIZE = eINSTANCE.getAttributeImportanceSettings_MaximumResultSize();

		/**
		 * The meta object literal for the '<em><b>Return Top</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_IMPORTANCE_SETTINGS__RETURN_TOP = eINSTANCE.getAttributeImportanceSettings_ReturnTop();

		/**
		 * The meta object literal for the '{@link CWM.AttributeImportance.impl.AttributeImportance_containerImpl <em>Attribute Importance container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.AttributeImportance.impl.AttributeImportance_containerImpl
		 * @see CWM.AttributeImportance.impl.AttributeImportancePackageImpl#getAttributeImportance_container()
		 * @generated
		 */
		EClass ATTRIBUTE_IMPORTANCE_CONTAINER = eINSTANCE.getAttributeImportance_container();

		/**
		 * The meta object literal for the '<em><b>Attribute Importance Settings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_IMPORTANCE_CONTAINER__ATTRIBUTE_IMPORTANCE_SETTINGS = eINSTANCE.getAttributeImportance_container_AttributeImportanceSettings();

	}

} //AttributeImportancePackage

/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.TypeMapping;

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
 * @see CWM.TypeMapping.TypeMappingFactory
 * @model kind="package"
 * @generated
 */
public interface TypeMappingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "TypeMapping";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "TypeMapping";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "TypeMapping";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TypeMappingPackage eINSTANCE = CWM.TypeMapping.impl.TypeMappingPackageImpl.init();

	/**
	 * The meta object id for the '{@link CWM.TypeMapping.impl.TypeMappingImpl <em>Type Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.TypeMapping.impl.TypeMappingImpl
	 * @see CWM.TypeMapping.impl.TypeMappingPackageImpl#getTypeMapping()
	 * @generated
	 */
	int TYPE_MAPPING = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MAPPING__NAME = CorePackage.MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MAPPING__VISIBILITY = CorePackage.MODEL_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MAPPING__CLIENT_DEPENDENCY = CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MAPPING__CONSTRAINT = CorePackage.MODEL_ELEMENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MAPPING__IMPORTER = CorePackage.MODEL_ELEMENT__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MAPPING__NAMESPACE = CorePackage.MODEL_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MAPPING__TAGGED_VALUE = CorePackage.MODEL_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Is Best Match</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MAPPING__IS_BEST_MATCH = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Lossy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MAPPING__IS_LOSSY = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MAPPING__SOURCE_TYPE = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MAPPING__TARGET_TYPE = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Type Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MAPPING_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link CWM.TypeMapping.impl.TypeSystemImpl <em>Type System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.TypeMapping.impl.TypeSystemImpl
	 * @see CWM.TypeMapping.impl.TypeMappingPackageImpl#getTypeSystem()
	 * @generated
	 */
	int TYPE_SYSTEM = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SYSTEM__NAME = CorePackage.PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SYSTEM__VISIBILITY = CorePackage.PACKAGE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SYSTEM__CLIENT_DEPENDENCY = CorePackage.PACKAGE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SYSTEM__CONSTRAINT = CorePackage.PACKAGE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Importer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SYSTEM__IMPORTER = CorePackage.PACKAGE__IMPORTER;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SYSTEM__NAMESPACE = CorePackage.PACKAGE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SYSTEM__TAGGED_VALUE = CorePackage.PACKAGE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SYSTEM__OWNED_ELEMENT = CorePackage.PACKAGE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Imported Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SYSTEM__IMPORTED_ELEMENT = CorePackage.PACKAGE__IMPORTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SYSTEM__VERSION = CorePackage.PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SYSTEM_FEATURE_COUNT = CorePackage.PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link CWM.TypeMapping.impl.TypeMapping_containerImpl <em>Type Mapping container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.TypeMapping.impl.TypeMapping_containerImpl
	 * @see CWM.TypeMapping.impl.TypeMappingPackageImpl#getTypeMapping_container()
	 * @generated
	 */
	int TYPE_MAPPING_CONTAINER = 2;

	/**
	 * The feature id for the '<em><b>Type Mapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MAPPING_CONTAINER__TYPE_MAPPING = 0;

	/**
	 * The feature id for the '<em><b>Type System</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MAPPING_CONTAINER__TYPE_SYSTEM = 1;

	/**
	 * The number of structural features of the '<em>Type Mapping container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MAPPING_CONTAINER_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link CWM.TypeMapping.TypeMapping <em>Type Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Mapping</em>'.
	 * @see CWM.TypeMapping.TypeMapping
	 * @generated
	 */
	EClass getTypeMapping();

	/**
	 * Returns the meta object for the attribute '{@link CWM.TypeMapping.TypeMapping#getIsBestMatch <em>Is Best Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Best Match</em>'.
	 * @see CWM.TypeMapping.TypeMapping#getIsBestMatch()
	 * @see #getTypeMapping()
	 * @generated
	 */
	EAttribute getTypeMapping_IsBestMatch();

	/**
	 * Returns the meta object for the attribute '{@link CWM.TypeMapping.TypeMapping#getIsLossy <em>Is Lossy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Lossy</em>'.
	 * @see CWM.TypeMapping.TypeMapping#getIsLossy()
	 * @see #getTypeMapping()
	 * @generated
	 */
	EAttribute getTypeMapping_IsLossy();

	/**
	 * Returns the meta object for the reference '{@link CWM.TypeMapping.TypeMapping#getSourceType <em>Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Type</em>'.
	 * @see CWM.TypeMapping.TypeMapping#getSourceType()
	 * @see #getTypeMapping()
	 * @generated
	 */
	EReference getTypeMapping_SourceType();

	/**
	 * Returns the meta object for the reference '{@link CWM.TypeMapping.TypeMapping#getTargetType <em>Target Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Type</em>'.
	 * @see CWM.TypeMapping.TypeMapping#getTargetType()
	 * @see #getTypeMapping()
	 * @generated
	 */
	EReference getTypeMapping_TargetType();

	/**
	 * Returns the meta object for class '{@link CWM.TypeMapping.TypeSystem <em>Type System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type System</em>'.
	 * @see CWM.TypeMapping.TypeSystem
	 * @generated
	 */
	EClass getTypeSystem();

	/**
	 * Returns the meta object for the attribute '{@link CWM.TypeMapping.TypeSystem#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see CWM.TypeMapping.TypeSystem#getVersion()
	 * @see #getTypeSystem()
	 * @generated
	 */
	EAttribute getTypeSystem_Version();

	/**
	 * Returns the meta object for class '{@link CWM.TypeMapping.TypeMapping_container <em>Type Mapping container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Mapping container</em>'.
	 * @see CWM.TypeMapping.TypeMapping_container
	 * @generated
	 */
	EClass getTypeMapping_container();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.TypeMapping.TypeMapping_container#getTypeMapping <em>Type Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type Mapping</em>'.
	 * @see CWM.TypeMapping.TypeMapping_container#getTypeMapping()
	 * @see #getTypeMapping_container()
	 * @generated
	 */
	EReference getTypeMapping_container_TypeMapping();

	/**
	 * Returns the meta object for the containment reference list '{@link CWM.TypeMapping.TypeMapping_container#getTypeSystem <em>Type System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type System</em>'.
	 * @see CWM.TypeMapping.TypeMapping_container#getTypeSystem()
	 * @see #getTypeMapping_container()
	 * @generated
	 */
	EReference getTypeMapping_container_TypeSystem();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TypeMappingFactory getTypeMappingFactory();

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
		 * The meta object literal for the '{@link CWM.TypeMapping.impl.TypeMappingImpl <em>Type Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.TypeMapping.impl.TypeMappingImpl
		 * @see CWM.TypeMapping.impl.TypeMappingPackageImpl#getTypeMapping()
		 * @generated
		 */
		EClass TYPE_MAPPING = eINSTANCE.getTypeMapping();

		/**
		 * The meta object literal for the '<em><b>Is Best Match</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_MAPPING__IS_BEST_MATCH = eINSTANCE.getTypeMapping_IsBestMatch();

		/**
		 * The meta object literal for the '<em><b>Is Lossy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_MAPPING__IS_LOSSY = eINSTANCE.getTypeMapping_IsLossy();

		/**
		 * The meta object literal for the '<em><b>Source Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_MAPPING__SOURCE_TYPE = eINSTANCE.getTypeMapping_SourceType();

		/**
		 * The meta object literal for the '<em><b>Target Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_MAPPING__TARGET_TYPE = eINSTANCE.getTypeMapping_TargetType();

		/**
		 * The meta object literal for the '{@link CWM.TypeMapping.impl.TypeSystemImpl <em>Type System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.TypeMapping.impl.TypeSystemImpl
		 * @see CWM.TypeMapping.impl.TypeMappingPackageImpl#getTypeSystem()
		 * @generated
		 */
		EClass TYPE_SYSTEM = eINSTANCE.getTypeSystem();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_SYSTEM__VERSION = eINSTANCE.getTypeSystem_Version();

		/**
		 * The meta object literal for the '{@link CWM.TypeMapping.impl.TypeMapping_containerImpl <em>Type Mapping container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.TypeMapping.impl.TypeMapping_containerImpl
		 * @see CWM.TypeMapping.impl.TypeMappingPackageImpl#getTypeMapping_container()
		 * @generated
		 */
		EClass TYPE_MAPPING_CONTAINER = eINSTANCE.getTypeMapping_container();

		/**
		 * The meta object literal for the '<em><b>Type Mapping</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_MAPPING_CONTAINER__TYPE_MAPPING = eINSTANCE.getTypeMapping_container_TypeMapping();

		/**
		 * The meta object literal for the '<em><b>Type System</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_MAPPING_CONTAINER__TYPE_SYSTEM = eINSTANCE.getTypeMapping_container_TypeSystem();

	}

} //TypeMappingPackage

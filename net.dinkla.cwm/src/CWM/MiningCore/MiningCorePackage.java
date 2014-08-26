/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see CWM.MiningCore.MiningCoreFactory
 * @model kind="package"
 * @generated
 */
public interface MiningCorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "MiningCore";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "MiningCore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "MiningCore";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MiningCorePackage eINSTANCE = CWM.MiningCore.impl.MiningCorePackageImpl.init();

	/**
	 * The meta object id for the '{@link CWM.MiningCore.impl.MiningCore_containerImpl <em>Mining Core container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.MiningCore.impl.MiningCore_containerImpl
	 * @see CWM.MiningCore.impl.MiningCorePackageImpl#getMiningCore_container()
	 * @generated
	 */
	int MINING_CORE_CONTAINER = 0;

	/**
	 * The number of structural features of the '<em>Mining Core container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINING_CORE_CONTAINER_FEATURE_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link CWM.MiningCore.MiningCore_container <em>Mining Core container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mining Core container</em>'.
	 * @see CWM.MiningCore.MiningCore_container
	 * @generated
	 */
	EClass getMiningCore_container();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MiningCoreFactory getMiningCoreFactory();

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
		 * The meta object literal for the '{@link CWM.MiningCore.impl.MiningCore_containerImpl <em>Mining Core container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.MiningCore.impl.MiningCore_containerImpl
		 * @see CWM.MiningCore.impl.MiningCorePackageImpl#getMiningCore_container()
		 * @generated
		 */
		EClass MINING_CORE_CONTAINER = eINSTANCE.getMiningCore_container();

	}

} //MiningCorePackage

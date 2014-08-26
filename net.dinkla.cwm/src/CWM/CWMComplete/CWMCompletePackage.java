/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.CWMComplete;

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
 * @see CWM.CWMComplete.CWMCompleteFactory
 * @model kind="package"
 * @generated
 */
public interface CWMCompletePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "CWMComplete";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "CWMComplete";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "CWMComplete";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CWMCompletePackage eINSTANCE = CWM.CWMComplete.impl.CWMCompletePackageImpl.init();

	/**
	 * The meta object id for the '{@link CWM.CWMComplete.impl.CWMComplete_containerImpl <em>CWM Complete container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.CWMComplete.impl.CWMComplete_containerImpl
	 * @see CWM.CWMComplete.impl.CWMCompletePackageImpl#getCWMComplete_container()
	 * @generated
	 */
	int CWM_COMPLETE_CONTAINER = 0;

	/**
	 * The number of structural features of the '<em>CWM Complete container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CWM_COMPLETE_CONTAINER_FEATURE_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link CWM.CWMComplete.CWMComplete_container <em>CWM Complete container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CWM Complete container</em>'.
	 * @see CWM.CWMComplete.CWMComplete_container
	 * @generated
	 */
	EClass getCWMComplete_container();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CWMCompleteFactory getCWMCompleteFactory();

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
		 * The meta object literal for the '{@link CWM.CWMComplete.impl.CWMComplete_containerImpl <em>CWM Complete container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.CWMComplete.impl.CWMComplete_containerImpl
		 * @see CWM.CWMComplete.impl.CWMCompletePackageImpl#getCWMComplete_container()
		 * @generated
		 */
		EClass CWM_COMPLETE_CONTAINER = eINSTANCE.getCWMComplete_container();

	}

} //CWMCompletePackage

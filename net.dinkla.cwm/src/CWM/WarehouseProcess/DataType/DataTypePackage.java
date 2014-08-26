/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.WarehouseProcess.DataType;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see CWM.WarehouseProcess.DataType.DataTypeFactory
 * @model kind="package"
 * @generated
 */
public interface DataTypePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "DataType";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "DataType";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "DataType";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataTypePackage eINSTANCE = CWM.WarehouseProcess.DataType.impl.DataTypePackageImpl.init();

	/**
	 * The meta object id for the '{@link CWM.WarehouseProcess.DataType.impl.DataType_containerImpl <em>Data Type container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.WarehouseProcess.DataType.impl.DataType_containerImpl
	 * @see CWM.WarehouseProcess.DataType.impl.DataTypePackageImpl#getDataType_container()
	 * @generated
	 */
	int DATA_TYPE_CONTAINER = 0;

	/**
	 * The number of structural features of the '<em>Data Type container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_CONTAINER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link CWM.WarehouseProcess.DataType.RecurringType <em>Recurring Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.WarehouseProcess.DataType.RecurringType
	 * @see CWM.WarehouseProcess.DataType.impl.DataTypePackageImpl#getRecurringType()
	 * @generated
	 */
	int RECURRING_TYPE = 1;

	/**
	 * The meta object id for the '{@link CWM.WarehouseProcess.DataType.DayOfWeek <em>Day Of Week</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.WarehouseProcess.DataType.DayOfWeek
	 * @see CWM.WarehouseProcess.DataType.impl.DataTypePackageImpl#getDayOfWeek()
	 * @generated
	 */
	int DAY_OF_WEEK = 2;

	/**
	 * The meta object id for the '{@link CWM.WarehouseProcess.DataType.WaitRuleType <em>Wait Rule Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.WarehouseProcess.DataType.WaitRuleType
	 * @see CWM.WarehouseProcess.DataType.impl.DataTypePackageImpl#getWaitRuleType()
	 * @generated
	 */
	int WAIT_RULE_TYPE = 3;


	/**
	 * Returns the meta object for class '{@link CWM.WarehouseProcess.DataType.DataType_container <em>Data Type container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type container</em>'.
	 * @see CWM.WarehouseProcess.DataType.DataType_container
	 * @generated
	 */
	EClass getDataType_container();

	/**
	 * Returns the meta object for enum '{@link CWM.WarehouseProcess.DataType.RecurringType <em>Recurring Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Recurring Type</em>'.
	 * @see CWM.WarehouseProcess.DataType.RecurringType
	 * @generated
	 */
	EEnum getRecurringType();

	/**
	 * Returns the meta object for enum '{@link CWM.WarehouseProcess.DataType.DayOfWeek <em>Day Of Week</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Day Of Week</em>'.
	 * @see CWM.WarehouseProcess.DataType.DayOfWeek
	 * @generated
	 */
	EEnum getDayOfWeek();

	/**
	 * Returns the meta object for enum '{@link CWM.WarehouseProcess.DataType.WaitRuleType <em>Wait Rule Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Wait Rule Type</em>'.
	 * @see CWM.WarehouseProcess.DataType.WaitRuleType
	 * @generated
	 */
	EEnum getWaitRuleType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DataTypeFactory getDataTypeFactory();

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
		 * The meta object literal for the '{@link CWM.WarehouseProcess.DataType.impl.DataType_containerImpl <em>Data Type container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.WarehouseProcess.DataType.impl.DataType_containerImpl
		 * @see CWM.WarehouseProcess.DataType.impl.DataTypePackageImpl#getDataType_container()
		 * @generated
		 */
		EClass DATA_TYPE_CONTAINER = eINSTANCE.getDataType_container();

		/**
		 * The meta object literal for the '{@link CWM.WarehouseProcess.DataType.RecurringType <em>Recurring Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.WarehouseProcess.DataType.RecurringType
		 * @see CWM.WarehouseProcess.DataType.impl.DataTypePackageImpl#getRecurringType()
		 * @generated
		 */
		EEnum RECURRING_TYPE = eINSTANCE.getRecurringType();

		/**
		 * The meta object literal for the '{@link CWM.WarehouseProcess.DataType.DayOfWeek <em>Day Of Week</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.WarehouseProcess.DataType.DayOfWeek
		 * @see CWM.WarehouseProcess.DataType.impl.DataTypePackageImpl#getDayOfWeek()
		 * @generated
		 */
		EEnum DAY_OF_WEEK = eINSTANCE.getDayOfWeek();

		/**
		 * The meta object literal for the '{@link CWM.WarehouseProcess.DataType.WaitRuleType <em>Wait Rule Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.WarehouseProcess.DataType.WaitRuleType
		 * @see CWM.WarehouseProcess.DataType.impl.DataTypePackageImpl#getWaitRuleType()
		 * @generated
		 */
		EEnum WAIT_RULE_TYPE = eINSTANCE.getWaitRuleType();

	}

} //DataTypePackage

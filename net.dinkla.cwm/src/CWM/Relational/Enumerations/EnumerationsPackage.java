/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Relational.Enumerations;

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
 * @see CWM.Relational.Enumerations.EnumerationsFactory
 * @model kind="package"
 * @generated
 */
public interface EnumerationsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Enumerations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "Enumerations";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Enumerations";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EnumerationsPackage eINSTANCE = CWM.Relational.Enumerations.impl.EnumerationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link CWM.Relational.Enumerations.impl.Enumerations_containerImpl <em>Enumerations container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Relational.Enumerations.impl.Enumerations_containerImpl
	 * @see CWM.Relational.Enumerations.impl.EnumerationsPackageImpl#getEnumerations_container()
	 * @generated
	 */
	int ENUMERATIONS_CONTAINER = 0;

	/**
	 * The number of structural features of the '<em>Enumerations container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATIONS_CONTAINER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link CWM.Relational.Enumerations.ActionOrientationType <em>Action Orientation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Relational.Enumerations.ActionOrientationType
	 * @see CWM.Relational.Enumerations.impl.EnumerationsPackageImpl#getActionOrientationType()
	 * @generated
	 */
	int ACTION_ORIENTATION_TYPE = 1;

	/**
	 * The meta object id for the '{@link CWM.Relational.Enumerations.ConditionTimingType <em>Condition Timing Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Relational.Enumerations.ConditionTimingType
	 * @see CWM.Relational.Enumerations.impl.EnumerationsPackageImpl#getConditionTimingType()
	 * @generated
	 */
	int CONDITION_TIMING_TYPE = 2;

	/**
	 * The meta object id for the '{@link CWM.Relational.Enumerations.DeferrabilityType <em>Deferrability Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Relational.Enumerations.DeferrabilityType
	 * @see CWM.Relational.Enumerations.impl.EnumerationsPackageImpl#getDeferrabilityType()
	 * @generated
	 */
	int DEFERRABILITY_TYPE = 3;

	/**
	 * The meta object id for the '{@link CWM.Relational.Enumerations.EventManipulationType <em>Event Manipulation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Relational.Enumerations.EventManipulationType
	 * @see CWM.Relational.Enumerations.impl.EnumerationsPackageImpl#getEventManipulationType()
	 * @generated
	 */
	int EVENT_MANIPULATION_TYPE = 4;

	/**
	 * The meta object id for the '{@link CWM.Relational.Enumerations.NullableType <em>Nullable Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Relational.Enumerations.NullableType
	 * @see CWM.Relational.Enumerations.impl.EnumerationsPackageImpl#getNullableType()
	 * @generated
	 */
	int NULLABLE_TYPE = 5;

	/**
	 * The meta object id for the '{@link CWM.Relational.Enumerations.ProcedureType <em>Procedure Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Relational.Enumerations.ProcedureType
	 * @see CWM.Relational.Enumerations.impl.EnumerationsPackageImpl#getProcedureType()
	 * @generated
	 */
	int PROCEDURE_TYPE = 6;

	/**
	 * The meta object id for the '{@link CWM.Relational.Enumerations.ReferentialRuleType <em>Referential Rule Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CWM.Relational.Enumerations.ReferentialRuleType
	 * @see CWM.Relational.Enumerations.impl.EnumerationsPackageImpl#getReferentialRuleType()
	 * @generated
	 */
	int REFERENTIAL_RULE_TYPE = 7;


	/**
	 * Returns the meta object for class '{@link CWM.Relational.Enumerations.Enumerations_container <em>Enumerations container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumerations container</em>'.
	 * @see CWM.Relational.Enumerations.Enumerations_container
	 * @generated
	 */
	EClass getEnumerations_container();

	/**
	 * Returns the meta object for enum '{@link CWM.Relational.Enumerations.ActionOrientationType <em>Action Orientation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action Orientation Type</em>'.
	 * @see CWM.Relational.Enumerations.ActionOrientationType
	 * @generated
	 */
	EEnum getActionOrientationType();

	/**
	 * Returns the meta object for enum '{@link CWM.Relational.Enumerations.ConditionTimingType <em>Condition Timing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Condition Timing Type</em>'.
	 * @see CWM.Relational.Enumerations.ConditionTimingType
	 * @generated
	 */
	EEnum getConditionTimingType();

	/**
	 * Returns the meta object for enum '{@link CWM.Relational.Enumerations.DeferrabilityType <em>Deferrability Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Deferrability Type</em>'.
	 * @see CWM.Relational.Enumerations.DeferrabilityType
	 * @generated
	 */
	EEnum getDeferrabilityType();

	/**
	 * Returns the meta object for enum '{@link CWM.Relational.Enumerations.EventManipulationType <em>Event Manipulation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Event Manipulation Type</em>'.
	 * @see CWM.Relational.Enumerations.EventManipulationType
	 * @generated
	 */
	EEnum getEventManipulationType();

	/**
	 * Returns the meta object for enum '{@link CWM.Relational.Enumerations.NullableType <em>Nullable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Nullable Type</em>'.
	 * @see CWM.Relational.Enumerations.NullableType
	 * @generated
	 */
	EEnum getNullableType();

	/**
	 * Returns the meta object for enum '{@link CWM.Relational.Enumerations.ProcedureType <em>Procedure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Procedure Type</em>'.
	 * @see CWM.Relational.Enumerations.ProcedureType
	 * @generated
	 */
	EEnum getProcedureType();

	/**
	 * Returns the meta object for enum '{@link CWM.Relational.Enumerations.ReferentialRuleType <em>Referential Rule Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Referential Rule Type</em>'.
	 * @see CWM.Relational.Enumerations.ReferentialRuleType
	 * @generated
	 */
	EEnum getReferentialRuleType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EnumerationsFactory getEnumerationsFactory();

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
		 * The meta object literal for the '{@link CWM.Relational.Enumerations.impl.Enumerations_containerImpl <em>Enumerations container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Relational.Enumerations.impl.Enumerations_containerImpl
		 * @see CWM.Relational.Enumerations.impl.EnumerationsPackageImpl#getEnumerations_container()
		 * @generated
		 */
		EClass ENUMERATIONS_CONTAINER = eINSTANCE.getEnumerations_container();

		/**
		 * The meta object literal for the '{@link CWM.Relational.Enumerations.ActionOrientationType <em>Action Orientation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Relational.Enumerations.ActionOrientationType
		 * @see CWM.Relational.Enumerations.impl.EnumerationsPackageImpl#getActionOrientationType()
		 * @generated
		 */
		EEnum ACTION_ORIENTATION_TYPE = eINSTANCE.getActionOrientationType();

		/**
		 * The meta object literal for the '{@link CWM.Relational.Enumerations.ConditionTimingType <em>Condition Timing Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Relational.Enumerations.ConditionTimingType
		 * @see CWM.Relational.Enumerations.impl.EnumerationsPackageImpl#getConditionTimingType()
		 * @generated
		 */
		EEnum CONDITION_TIMING_TYPE = eINSTANCE.getConditionTimingType();

		/**
		 * The meta object literal for the '{@link CWM.Relational.Enumerations.DeferrabilityType <em>Deferrability Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Relational.Enumerations.DeferrabilityType
		 * @see CWM.Relational.Enumerations.impl.EnumerationsPackageImpl#getDeferrabilityType()
		 * @generated
		 */
		EEnum DEFERRABILITY_TYPE = eINSTANCE.getDeferrabilityType();

		/**
		 * The meta object literal for the '{@link CWM.Relational.Enumerations.EventManipulationType <em>Event Manipulation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Relational.Enumerations.EventManipulationType
		 * @see CWM.Relational.Enumerations.impl.EnumerationsPackageImpl#getEventManipulationType()
		 * @generated
		 */
		EEnum EVENT_MANIPULATION_TYPE = eINSTANCE.getEventManipulationType();

		/**
		 * The meta object literal for the '{@link CWM.Relational.Enumerations.NullableType <em>Nullable Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Relational.Enumerations.NullableType
		 * @see CWM.Relational.Enumerations.impl.EnumerationsPackageImpl#getNullableType()
		 * @generated
		 */
		EEnum NULLABLE_TYPE = eINSTANCE.getNullableType();

		/**
		 * The meta object literal for the '{@link CWM.Relational.Enumerations.ProcedureType <em>Procedure Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Relational.Enumerations.ProcedureType
		 * @see CWM.Relational.Enumerations.impl.EnumerationsPackageImpl#getProcedureType()
		 * @generated
		 */
		EEnum PROCEDURE_TYPE = eINSTANCE.getProcedureType();

		/**
		 * The meta object literal for the '{@link CWM.Relational.Enumerations.ReferentialRuleType <em>Referential Rule Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CWM.Relational.Enumerations.ReferentialRuleType
		 * @see CWM.Relational.Enumerations.impl.EnumerationsPackageImpl#getReferentialRuleType()
		 * @generated
		 */
		EEnum REFERENTIAL_RULE_TYPE = eINSTANCE.getReferentialRuleType();

	}

} //EnumerationsPackage

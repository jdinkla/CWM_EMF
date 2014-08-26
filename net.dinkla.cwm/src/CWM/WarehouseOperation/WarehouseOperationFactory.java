/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.WarehouseOperation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see CWM.WarehouseOperation.WarehouseOperationPackage
 * @generated
 */
public interface WarehouseOperationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WarehouseOperationFactory eINSTANCE = CWM.WarehouseOperation.impl.WarehouseOperationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measurement</em>'.
	 * @generated
	 */
	Measurement createMeasurement();

	/**
	 * Returns a new object of class '<em>Change Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change Request</em>'.
	 * @generated
	 */
	ChangeRequest createChangeRequest();

	/**
	 * Returns a new object of class '<em>Transformation Execution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transformation Execution</em>'.
	 * @generated
	 */
	TransformationExecution createTransformationExecution();

	/**
	 * Returns a new object of class '<em>Activity Execution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity Execution</em>'.
	 * @generated
	 */
	ActivityExecution createActivityExecution();

	/**
	 * Returns a new object of class '<em>Step Execution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Step Execution</em>'.
	 * @generated
	 */
	StepExecution createStepExecution();

	/**
	 * Returns a new object of class '<em>Warehouse Operation container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Warehouse Operation container</em>'.
	 * @generated
	 */
	WarehouseOperation_container createWarehouseOperation_container();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	WarehouseOperationPackage getWarehouseOperationPackage();

} //WarehouseOperationFactory

/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.WarehouseProcess;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see CWM.WarehouseProcess.WarehouseProcessPackage
 * @generated
 */
public interface WarehouseProcessFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WarehouseProcessFactory eINSTANCE = CWM.WarehouseProcess.impl.WarehouseProcessFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Warehouse Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Warehouse Step</em>'.
	 * @generated
	 */
	WarehouseStep createWarehouseStep();

	/**
	 * Returns a new object of class '<em>Process Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process Package</em>'.
	 * @generated
	 */
	ProcessPackage createProcessPackage();

	/**
	 * Returns a new object of class '<em>Warehouse Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Warehouse Activity</em>'.
	 * @generated
	 */
	WarehouseActivity createWarehouseActivity();

	/**
	 * Returns a new object of class '<em>Warehouse Process container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Warehouse Process container</em>'.
	 * @generated
	 */
	WarehouseProcess_container createWarehouseProcess_container();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	WarehouseProcessPackage getWarehouseProcessPackage();

} //WarehouseProcessFactory

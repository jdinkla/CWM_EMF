/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Approximation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see CWM.Approximation.ApproximationPackage
 * @generated
 */
public interface ApproximationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApproximationFactory eINSTANCE = CWM.Approximation.impl.ApproximationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Function Settings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Settings</em>'.
	 * @generated
	 */
	ApproximationFunctionSettings createApproximationFunctionSettings();

	/**
	 * Returns a new object of class '<em>Test Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Result</em>'.
	 * @generated
	 */
	ApproximationTestResult createApproximationTestResult();

	/**
	 * Returns a new object of class '<em>Test Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Task</em>'.
	 * @generated
	 */
	ApproximationTestTask createApproximationTestTask();

	/**
	 * Returns a new object of class '<em>Approximation container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Approximation container</em>'.
	 * @generated
	 */
	Approximation_container createApproximation_container();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApproximationPackage getApproximationPackage();

} //ApproximationFactory

/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Supervised;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see CWM.Supervised.SupervisedPackage
 * @generated
 */
public interface SupervisedFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SupervisedFactory eINSTANCE = CWM.Supervised.impl.SupervisedFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Lift Analysis Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lift Analysis Point</em>'.
	 * @generated
	 */
	LiftAnalysisPoint createLiftAnalysisPoint();

	/**
	 * Returns a new object of class '<em>Lift Analysis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lift Analysis</em>'.
	 * @generated
	 */
	LiftAnalysis createLiftAnalysis();

	/**
	 * Returns a new object of class '<em>Mining Test Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mining Test Task</em>'.
	 * @generated
	 */
	MiningTestTask createMiningTestTask();

	/**
	 * Returns a new object of class '<em>Function Settings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Settings</em>'.
	 * @generated
	 */
	SupervisedFunctionSettings createSupervisedFunctionSettings();

	/**
	 * Returns a new object of class '<em>Mining Test Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mining Test Result</em>'.
	 * @generated
	 */
	MiningTestResult createMiningTestResult();

	/**
	 * Returns a new object of class '<em>Supervised container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Supervised container</em>'.
	 * @generated
	 */
	Supervised_container createSupervised_container();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SupervisedPackage getSupervisedPackage();

} //SupervisedFactory

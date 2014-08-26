/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningTask;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see CWM.MiningCore.MiningTask.MiningTaskPackage
 * @generated
 */
public interface MiningTaskFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MiningTaskFactory eINSTANCE = CWM.MiningCore.MiningTask.impl.MiningTaskFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Apply Output Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Apply Output Item</em>'.
	 * @generated
	 */
	ApplyOutputItem createApplyOutputItem();

	/**
	 * Returns a new object of class '<em>Apply Probability Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Apply Probability Item</em>'.
	 * @generated
	 */
	ApplyProbabilityItem createApplyProbabilityItem();

	/**
	 * Returns a new object of class '<em>Apply Rule Id Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Apply Rule Id Item</em>'.
	 * @generated
	 */
	ApplyRuleIdItem createApplyRuleIdItem();

	/**
	 * Returns a new object of class '<em>Apply Score Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Apply Score Item</em>'.
	 * @generated
	 */
	ApplyScoreItem createApplyScoreItem();

	/**
	 * Returns a new object of class '<em>Apply Source Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Apply Source Item</em>'.
	 * @generated
	 */
	ApplySourceItem createApplySourceItem();

	/**
	 * Returns a new object of class '<em>Mining Apply Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mining Apply Output</em>'.
	 * @generated
	 */
	MiningApplyOutput createMiningApplyOutput();

	/**
	 * Returns a new object of class '<em>Mining Apply Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mining Apply Task</em>'.
	 * @generated
	 */
	MiningApplyTask createMiningApplyTask();

	/**
	 * Returns a new object of class '<em>Mining Build Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mining Build Task</em>'.
	 * @generated
	 */
	MiningBuildTask createMiningBuildTask();

	/**
	 * Returns a new object of class '<em>Mining Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mining Transformation</em>'.
	 * @generated
	 */
	MiningTransformation createMiningTransformation();

	/**
	 * Returns a new object of class '<em>Mining Task container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mining Task container</em>'.
	 * @generated
	 */
	MiningTask_container createMiningTask_container();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MiningTaskPackage getMiningTaskPackage();

} //MiningTaskFactory

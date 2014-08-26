/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Classification;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see CWM.Classification.ClassificationPackage
 * @generated
 */
public interface ClassificationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ClassificationFactory eINSTANCE = CWM.Classification.impl.ClassificationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Apply Target Value Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Apply Target Value Item</em>'.
	 * @generated
	 */
	ApplyTargetValueItem createApplyTargetValueItem();

	/**
	 * Returns a new object of class '<em>Attribute Usage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Usage</em>'.
	 * @generated
	 */
	ClassificationAttributeUsage createClassificationAttributeUsage();

	/**
	 * Returns a new object of class '<em>Function Settings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Settings</em>'.
	 * @generated
	 */
	ClassificationFunctionSettings createClassificationFunctionSettings();

	/**
	 * Returns a new object of class '<em>Test Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Result</em>'.
	 * @generated
	 */
	ClassificationTestResult createClassificationTestResult();

	/**
	 * Returns a new object of class '<em>Test Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Task</em>'.
	 * @generated
	 */
	ClassificationTestTask createClassificationTestTask();

	/**
	 * Returns a new object of class '<em>Prior Probabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prior Probabilities</em>'.
	 * @generated
	 */
	PriorProbabilities createPriorProbabilities();

	/**
	 * Returns a new object of class '<em>Prior Probabilities Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prior Probabilities Entry</em>'.
	 * @generated
	 */
	PriorProbabilitiesEntry createPriorProbabilitiesEntry();

	/**
	 * Returns a new object of class '<em>Classification container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Classification container</em>'.
	 * @generated
	 */
	Classification_container createClassification_container();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ClassificationPackage getClassificationPackage();

} //ClassificationFactory

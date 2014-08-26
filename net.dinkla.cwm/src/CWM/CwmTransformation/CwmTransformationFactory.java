/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.CwmTransformation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see CWM.CwmTransformation.CwmTransformationPackage
 * @generated
 */
public interface CwmTransformationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CwmTransformationFactory eINSTANCE = CWM.CwmTransformation.impl.CwmTransformationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transformation</em>'.
	 * @generated
	 */
	Transformation createTransformation();

	/**
	 * Returns a new object of class '<em>Data Object Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Object Set</em>'.
	 * @generated
	 */
	DataObjectSet createDataObjectSet();

	/**
	 * Returns a new object of class '<em>Transformation Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transformation Task</em>'.
	 * @generated
	 */
	TransformationTask createTransformationTask();

	/**
	 * Returns a new object of class '<em>Transformation Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transformation Step</em>'.
	 * @generated
	 */
	TransformationStep createTransformationStep();

	/**
	 * Returns a new object of class '<em>Transformation Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transformation Activity</em>'.
	 * @generated
	 */
	TransformationActivity createTransformationActivity();

	/**
	 * Returns a new object of class '<em>Precedence Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Precedence Constraint</em>'.
	 * @generated
	 */
	PrecedenceConstraint createPrecedenceConstraint();

	/**
	 * Returns a new object of class '<em>Transformation Use</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transformation Use</em>'.
	 * @generated
	 */
	TransformationUse createTransformationUse();

	/**
	 * Returns a new object of class '<em>Transformation Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transformation Map</em>'.
	 * @generated
	 */
	TransformationMap createTransformationMap();

	/**
	 * Returns a new object of class '<em>Transformation Tree</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transformation Tree</em>'.
	 * @generated
	 */
	TransformationTree createTransformationTree();

	/**
	 * Returns a new object of class '<em>Classifier Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Classifier Map</em>'.
	 * @generated
	 */
	ClassifierMap createClassifierMap();

	/**
	 * Returns a new object of class '<em>Feature Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Map</em>'.
	 * @generated
	 */
	FeatureMap createFeatureMap();

	/**
	 * Returns a new object of class '<em>Step Precedence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Step Precedence</em>'.
	 * @generated
	 */
	StepPrecedence createStepPrecedence();

	/**
	 * Returns a new object of class '<em>Classifier Feature Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Classifier Feature Map</em>'.
	 * @generated
	 */
	ClassifierFeatureMap createClassifierFeatureMap();

	/**
	 * Returns a new object of class '<em>Transformation container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transformation container</em>'.
	 * @generated
	 */
	Transformation_container createTransformation_container();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CwmTransformationPackage getCwmTransformationPackage();

} //CwmTransformationFactory

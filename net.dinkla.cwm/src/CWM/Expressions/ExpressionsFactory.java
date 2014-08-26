/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Expressions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see CWM.Expressions.ExpressionsPackage
 * @generated
 */
public interface ExpressionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExpressionsFactory eINSTANCE = CWM.Expressions.impl.ExpressionsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Expression Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Node</em>'.
	 * @generated
	 */
	ExpressionNode createExpressionNode();

	/**
	 * Returns a new object of class '<em>Constant Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constant Node</em>'.
	 * @generated
	 */
	ConstantNode createConstantNode();

	/**
	 * Returns a new object of class '<em>Element Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Node</em>'.
	 * @generated
	 */
	ElementNode createElementNode();

	/**
	 * Returns a new object of class '<em>Feature Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Node</em>'.
	 * @generated
	 */
	FeatureNode createFeatureNode();

	/**
	 * Returns a new object of class '<em>Expressions container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expressions container</em>'.
	 * @generated
	 */
	Expressions_container createExpressions_container();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ExpressionsPackage getExpressionsPackage();

} //ExpressionsFactory

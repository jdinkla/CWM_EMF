/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.CWMComplete;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see CWM.CWMComplete.CWMCompletePackage
 * @generated
 */
public interface CWMCompleteFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CWMCompleteFactory eINSTANCE = CWM.CWMComplete.impl.CWMCompleteFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>CWM Complete container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CWM Complete container</em>'.
	 * @generated
	 */
	CWMComplete_container createCWMComplete_container();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CWMCompletePackage getCWMCompletePackage();

} //CWMCompleteFactory

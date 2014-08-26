/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Relational.Enumerations;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see CWM.Relational.Enumerations.EnumerationsPackage
 * @generated
 */
public interface EnumerationsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EnumerationsFactory eINSTANCE = CWM.Relational.Enumerations.impl.EnumerationsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Enumerations container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumerations container</em>'.
	 * @generated
	 */
	Enumerations_container createEnumerations_container();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EnumerationsPackage getEnumerationsPackage();

} //EnumerationsFactory

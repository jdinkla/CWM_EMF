/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see CWM.MiningCore.MiningCorePackage
 * @generated
 */
public interface MiningCoreFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MiningCoreFactory eINSTANCE = CWM.MiningCore.impl.MiningCoreFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Mining Core container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mining Core container</em>'.
	 * @generated
	 */
	MiningCore_container createMiningCore_container();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MiningCorePackage getMiningCorePackage();

} //MiningCoreFactory

/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningResult;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see CWM.MiningCore.MiningResult.MiningResultPackage
 * @generated
 */
public interface MiningResultFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MiningResultFactory eINSTANCE = CWM.MiningCore.MiningResult.impl.MiningResultFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Mining Result container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mining Result container</em>'.
	 * @generated
	 */
	MiningResult_container createMiningResult_container();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MiningResultPackage getMiningResultPackage();

} //MiningResultFactory

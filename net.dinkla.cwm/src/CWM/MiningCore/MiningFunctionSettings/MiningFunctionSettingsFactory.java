/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningFunctionSettings;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see CWM.MiningCore.MiningFunctionSettings.MiningFunctionSettingsPackage
 * @generated
 */
public interface MiningFunctionSettingsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MiningFunctionSettingsFactory eINSTANCE = CWM.MiningCore.MiningFunctionSettings.impl.MiningFunctionSettingsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Mining Function Settings container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mining Function Settings container</em>'.
	 * @generated
	 */
	MiningFunctionSettings_container createMiningFunctionSettings_container();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MiningFunctionSettingsPackage getMiningFunctionSettingsPackage();

} //MiningFunctionSettingsFactory

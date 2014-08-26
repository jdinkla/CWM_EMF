/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningFunctionSettings.impl;

import CWM.MiningCore.MiningFunctionSettings.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MiningFunctionSettingsFactoryImpl extends EFactoryImpl implements MiningFunctionSettingsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MiningFunctionSettingsFactory init() {
		try {
			MiningFunctionSettingsFactory theMiningFunctionSettingsFactory = (MiningFunctionSettingsFactory)EPackage.Registry.INSTANCE.getEFactory("MiningFunctionSettings"); 
			if (theMiningFunctionSettingsFactory != null) {
				return theMiningFunctionSettingsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MiningFunctionSettingsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiningFunctionSettingsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MiningFunctionSettingsPackage.MINING_FUNCTION_SETTINGS_CONTAINER: return createMiningFunctionSettings_container();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiningFunctionSettings_container createMiningFunctionSettings_container() {
		MiningFunctionSettings_containerImpl miningFunctionSettings_container = new MiningFunctionSettings_containerImpl();
		return miningFunctionSettings_container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiningFunctionSettingsPackage getMiningFunctionSettingsPackage() {
		return (MiningFunctionSettingsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MiningFunctionSettingsPackage getPackage() {
		return MiningFunctionSettingsPackage.eINSTANCE;
	}

} //MiningFunctionSettingsFactoryImpl

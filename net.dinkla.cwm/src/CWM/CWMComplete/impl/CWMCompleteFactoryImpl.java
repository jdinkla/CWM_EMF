/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.CWMComplete.impl;

import CWM.CWMComplete.*;

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
public class CWMCompleteFactoryImpl extends EFactoryImpl implements CWMCompleteFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CWMCompleteFactory init() {
		try {
			CWMCompleteFactory theCWMCompleteFactory = (CWMCompleteFactory)EPackage.Registry.INSTANCE.getEFactory("CWMComplete"); 
			if (theCWMCompleteFactory != null) {
				return theCWMCompleteFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CWMCompleteFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CWMCompleteFactoryImpl() {
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
			case CWMCompletePackage.CWM_COMPLETE_CONTAINER: return createCWMComplete_container();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CWMComplete_container createCWMComplete_container() {
		CWMComplete_containerImpl cwmComplete_container = new CWMComplete_containerImpl();
		return cwmComplete_container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CWMCompletePackage getCWMCompletePackage() {
		return (CWMCompletePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CWMCompletePackage getPackage() {
		return CWMCompletePackage.eINSTANCE;
	}

} //CWMCompleteFactoryImpl

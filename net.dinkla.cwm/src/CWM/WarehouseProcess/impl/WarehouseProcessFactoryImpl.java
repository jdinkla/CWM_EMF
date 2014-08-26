/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.WarehouseProcess.impl;

import CWM.WarehouseProcess.*;

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
public class WarehouseProcessFactoryImpl extends EFactoryImpl implements WarehouseProcessFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WarehouseProcessFactory init() {
		try {
			WarehouseProcessFactory theWarehouseProcessFactory = (WarehouseProcessFactory)EPackage.Registry.INSTANCE.getEFactory("WarehouseProcess"); 
			if (theWarehouseProcessFactory != null) {
				return theWarehouseProcessFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WarehouseProcessFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WarehouseProcessFactoryImpl() {
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
			case WarehouseProcessPackage.WAREHOUSE_STEP: return createWarehouseStep();
			case WarehouseProcessPackage.PROCESS_PACKAGE: return createProcessPackage();
			case WarehouseProcessPackage.WAREHOUSE_ACTIVITY: return createWarehouseActivity();
			case WarehouseProcessPackage.WAREHOUSE_PROCESS_CONTAINER: return createWarehouseProcess_container();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WarehouseStep createWarehouseStep() {
		WarehouseStepImpl warehouseStep = new WarehouseStepImpl();
		return warehouseStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessPackage createProcessPackage() {
		ProcessPackageImpl processPackage = new ProcessPackageImpl();
		return processPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WarehouseActivity createWarehouseActivity() {
		WarehouseActivityImpl warehouseActivity = new WarehouseActivityImpl();
		return warehouseActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WarehouseProcess_container createWarehouseProcess_container() {
		WarehouseProcess_containerImpl warehouseProcess_container = new WarehouseProcess_containerImpl();
		return warehouseProcess_container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WarehouseProcessPackage getWarehouseProcessPackage() {
		return (WarehouseProcessPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WarehouseProcessPackage getPackage() {
		return WarehouseProcessPackage.eINSTANCE;
	}

} //WarehouseProcessFactoryImpl

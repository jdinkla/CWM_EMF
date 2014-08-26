/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.CwmInstance.impl;

import CWM.CwmInstance.CwmInstanceFactory;
import CWM.CwmInstance.CwmInstancePackage;
import CWM.CwmInstance.DataSlot;
import CWM.CwmInstance.DataValue;
import CWM.CwmInstance.Extent;
import CWM.CwmInstance.Instance_container;
import CWM.CwmInstance.Slot;

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
public class CwmInstanceFactoryImpl extends EFactoryImpl implements CwmInstanceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CwmInstanceFactory init() {
		try {
			CwmInstanceFactory theCwmInstanceFactory = (CwmInstanceFactory)EPackage.Registry.INSTANCE.getEFactory("CwmInstance"); 
			if (theCwmInstanceFactory != null) {
				return theCwmInstanceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CwmInstanceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CwmInstanceFactoryImpl() {
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
			case CwmInstancePackage.DATA_SLOT: return createDataSlot();
			case CwmInstancePackage.DATA_VALUE: return createDataValue();
			case CwmInstancePackage.EXTENT: return createExtent();
			case CwmInstancePackage.OBJECT: return createObject();
			case CwmInstancePackage.SLOT: return createSlot();
			case CwmInstancePackage.INSTANCE_CONTAINER: return createInstance_container();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSlot createDataSlot() {
		DataSlotImpl dataSlot = new DataSlotImpl();
		return dataSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataValue createDataValue() {
		DataValueImpl dataValue = new DataValueImpl();
		return dataValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extent createExtent() {
		ExtentImpl extent = new ExtentImpl();
		return extent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CWM.CwmInstance.Object createObject() {
		ObjectImpl object = new ObjectImpl();
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Slot createSlot() {
		SlotImpl slot = new SlotImpl();
		return slot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instance_container createInstance_container() {
		Instance_containerImpl instance_container = new Instance_containerImpl();
		return instance_container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CwmInstancePackage getCwmInstancePackage() {
		return (CwmInstancePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CwmInstancePackage getPackage() {
		return CwmInstancePackage.eINSTANCE;
	}

} //CwmInstanceFactoryImpl

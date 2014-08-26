/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.WarehouseOperation.impl;

import CWM.WarehouseOperation.*;

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
public class WarehouseOperationFactoryImpl extends EFactoryImpl implements WarehouseOperationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WarehouseOperationFactory init() {
		try {
			WarehouseOperationFactory theWarehouseOperationFactory = (WarehouseOperationFactory)EPackage.Registry.INSTANCE.getEFactory("WarehouseOperation"); 
			if (theWarehouseOperationFactory != null) {
				return theWarehouseOperationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WarehouseOperationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WarehouseOperationFactoryImpl() {
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
			case WarehouseOperationPackage.MEASUREMENT: return createMeasurement();
			case WarehouseOperationPackage.CHANGE_REQUEST: return createChangeRequest();
			case WarehouseOperationPackage.TRANSFORMATION_EXECUTION: return createTransformationExecution();
			case WarehouseOperationPackage.ACTIVITY_EXECUTION: return createActivityExecution();
			case WarehouseOperationPackage.STEP_EXECUTION: return createStepExecution();
			case WarehouseOperationPackage.WAREHOUSE_OPERATION_CONTAINER: return createWarehouseOperation_container();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measurement createMeasurement() {
		MeasurementImpl measurement = new MeasurementImpl();
		return measurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeRequest createChangeRequest() {
		ChangeRequestImpl changeRequest = new ChangeRequestImpl();
		return changeRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationExecution createTransformationExecution() {
		TransformationExecutionImpl transformationExecution = new TransformationExecutionImpl();
		return transformationExecution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityExecution createActivityExecution() {
		ActivityExecutionImpl activityExecution = new ActivityExecutionImpl();
		return activityExecution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepExecution createStepExecution() {
		StepExecutionImpl stepExecution = new StepExecutionImpl();
		return stepExecution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WarehouseOperation_container createWarehouseOperation_container() {
		WarehouseOperation_containerImpl warehouseOperation_container = new WarehouseOperation_containerImpl();
		return warehouseOperation_container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WarehouseOperationPackage getWarehouseOperationPackage() {
		return (WarehouseOperationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WarehouseOperationPackage getPackage() {
		return WarehouseOperationPackage.eINSTANCE;
	}

} //WarehouseOperationFactoryImpl

/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.WarehouseProcess;

import CWM.CwmTransformation.TransformationStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Warehouse Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.WarehouseProcess.WarehouseStep#getTransformationStep <em>Transformation Step</em>}</li>
 *   <li>{@link CWM.WarehouseProcess.WarehouseStep#getWarehouseActivity <em>Warehouse Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.WarehouseProcess.WarehouseProcessPackage#getWarehouseStep()
 * @model
 * @generated
 */
public interface WarehouseStep extends WarehouseProcess {
	/**
	 * Returns the value of the '<em><b>Transformation Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformation Step</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation Step</em>' reference.
	 * @see #setTransformationStep(TransformationStep)
	 * @see CWM.WarehouseProcess.WarehouseProcessPackage#getWarehouseStep_TransformationStep()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	TransformationStep getTransformationStep();

	/**
	 * Sets the value of the '{@link CWM.WarehouseProcess.WarehouseStep#getTransformationStep <em>Transformation Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation Step</em>' reference.
	 * @see #getTransformationStep()
	 * @generated
	 */
	void setTransformationStep(TransformationStep value);

	/**
	 * Returns the value of the '<em><b>Warehouse Activity</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link CWM.WarehouseProcess.WarehouseActivity#getWarehouseStep <em>Warehouse Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Warehouse Activity</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Warehouse Activity</em>' container reference.
	 * @see #setWarehouseActivity(WarehouseActivity)
	 * @see CWM.WarehouseProcess.WarehouseProcessPackage#getWarehouseStep_WarehouseActivity()
	 * @see CWM.WarehouseProcess.WarehouseActivity#getWarehouseStep
	 * @model opposite="warehouseStep" required="true" transient="false" ordered="false"
	 * @generated
	 */
	WarehouseActivity getWarehouseActivity();

	/**
	 * Sets the value of the '{@link CWM.WarehouseProcess.WarehouseStep#getWarehouseActivity <em>Warehouse Activity</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Warehouse Activity</em>' container reference.
	 * @see #getWarehouseActivity()
	 * @generated
	 */
	void setWarehouseActivity(WarehouseActivity value);

} // WarehouseStep

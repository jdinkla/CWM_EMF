/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.WarehouseProcess;

import CWM.CwmTransformation.TransformationActivity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Warehouse Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.WarehouseProcess.WarehouseActivity#getTransformationActivity <em>Transformation Activity</em>}</li>
 *   <li>{@link CWM.WarehouseProcess.WarehouseActivity#getWarehouseStep <em>Warehouse Step</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.WarehouseProcess.WarehouseProcessPackage#getWarehouseActivity()
 * @model
 * @generated
 */
public interface WarehouseActivity extends WarehouseProcess {
	/**
	 * Returns the value of the '<em><b>Transformation Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformation Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation Activity</em>' reference.
	 * @see #setTransformationActivity(TransformationActivity)
	 * @see CWM.WarehouseProcess.WarehouseProcessPackage#getWarehouseActivity_TransformationActivity()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	TransformationActivity getTransformationActivity();

	/**
	 * Sets the value of the '{@link CWM.WarehouseProcess.WarehouseActivity#getTransformationActivity <em>Transformation Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation Activity</em>' reference.
	 * @see #getTransformationActivity()
	 * @generated
	 */
	void setTransformationActivity(TransformationActivity value);

	/**
	 * Returns the value of the '<em><b>Warehouse Step</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.WarehouseProcess.WarehouseStep}.
	 * It is bidirectional and its opposite is '{@link CWM.WarehouseProcess.WarehouseStep#getWarehouseActivity <em>Warehouse Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Warehouse Step</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Warehouse Step</em>' containment reference list.
	 * @see CWM.WarehouseProcess.WarehouseProcessPackage#getWarehouseActivity_WarehouseStep()
	 * @see CWM.WarehouseProcess.WarehouseStep#getWarehouseActivity
	 * @model opposite="warehouseActivity" containment="true"
	 * @generated
	 */
	EList<WarehouseStep> getWarehouseStep();

} // WarehouseActivity

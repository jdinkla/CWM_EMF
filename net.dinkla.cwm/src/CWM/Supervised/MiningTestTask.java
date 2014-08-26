/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Supervised;

import CWM.MiningCore.MiningData.Category;

import CWM.MiningCore.MiningTask.MiningTask;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mining Test Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Supervised.MiningTestTask#getComputeLift <em>Compute Lift</em>}</li>
 *   <li>{@link CWM.Supervised.MiningTestTask#getPositiveTargetCategory <em>Positive Target Category</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Supervised.SupervisedPackage#getMiningTestTask()
 * @model
 * @generated
 */
public interface MiningTestTask extends MiningTask {
	/**
	 * Returns the value of the '<em><b>Compute Lift</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compute Lift</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compute Lift</em>' attribute.
	 * @see #setComputeLift(Boolean)
	 * @see CWM.Supervised.SupervisedPackage#getMiningTestTask_ComputeLift()
	 * @model unique="false" dataType="CWM.Core.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getComputeLift();

	/**
	 * Sets the value of the '{@link CWM.Supervised.MiningTestTask#getComputeLift <em>Compute Lift</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compute Lift</em>' attribute.
	 * @see #getComputeLift()
	 * @generated
	 */
	void setComputeLift(Boolean value);

	/**
	 * Returns the value of the '<em><b>Positive Target Category</b></em>' reference list.
	 * The list contents are of type {@link CWM.MiningCore.MiningData.Category}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Positive Target Category</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Positive Target Category</em>' reference list.
	 * @see CWM.Supervised.SupervisedPackage#getMiningTestTask_PositiveTargetCategory()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Category> getPositiveTargetCategory();

} // MiningTestTask

/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningTask;

import CWM.CwmTransformation.Transformation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mining Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.MiningCore.MiningTask.MiningTransformation#getProcedure <em>Procedure</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.MiningCore.MiningTask.MiningTaskPackage#getMiningTransformation()
 * @model
 * @generated
 */
public interface MiningTransformation extends Transformation {
	/**
	 * Returns the value of the '<em><b>Procedure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedure</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedure</em>' reference.
	 * @see #setProcedure(MiningTask)
	 * @see CWM.MiningCore.MiningTask.MiningTaskPackage#getMiningTransformation_Procedure()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	MiningTask getProcedure();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.MiningTask.MiningTransformation#getProcedure <em>Procedure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Procedure</em>' reference.
	 * @see #getProcedure()
	 * @generated
	 */
	void setProcedure(MiningTask value);

} // MiningTransformation

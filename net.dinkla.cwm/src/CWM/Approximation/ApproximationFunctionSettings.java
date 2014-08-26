/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Approximation;

import CWM.Supervised.SupervisedFunctionSettings;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Approximation.ApproximationFunctionSettings#getToleratedError <em>Tolerated Error</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Approximation.ApproximationPackage#getApproximationFunctionSettings()
 * @model
 * @generated
 */
public interface ApproximationFunctionSettings extends SupervisedFunctionSettings {
	/**
	 * Returns the value of the '<em><b>Tolerated Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tolerated Error</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tolerated Error</em>' attribute.
	 * @see #setToleratedError(Double)
	 * @see CWM.Approximation.ApproximationPackage#getApproximationFunctionSettings_ToleratedError()
	 * @model unique="false" dataType="CWM.MiningCore.MiningData.Double" ordered="false"
	 * @generated
	 */
	Double getToleratedError();

	/**
	 * Sets the value of the '{@link CWM.Approximation.ApproximationFunctionSettings#getToleratedError <em>Tolerated Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tolerated Error</em>' attribute.
	 * @see #getToleratedError()
	 * @generated
	 */
	void setToleratedError(Double value);

} // ApproximationFunctionSettings

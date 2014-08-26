/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Classification;

import CWM.MiningCore.MiningData.CategoryMatrix;

import CWM.Supervised.SupervisedFunctionSettings;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Classification.ClassificationFunctionSettings#getCostMatrix <em>Cost Matrix</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Classification.ClassificationPackage#getClassificationFunctionSettings()
 * @model
 * @generated
 */
public interface ClassificationFunctionSettings extends SupervisedFunctionSettings {
	/**
	 * Returns the value of the '<em><b>Cost Matrix</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost Matrix</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Matrix</em>' reference.
	 * @see #setCostMatrix(CategoryMatrix)
	 * @see CWM.Classification.ClassificationPackage#getClassificationFunctionSettings_CostMatrix()
	 * @model ordered="false"
	 * @generated
	 */
	CategoryMatrix getCostMatrix();

	/**
	 * Sets the value of the '{@link CWM.Classification.ClassificationFunctionSettings#getCostMatrix <em>Cost Matrix</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Matrix</em>' reference.
	 * @see #getCostMatrix()
	 * @generated
	 */
	void setCostMatrix(CategoryMatrix value);

} // ClassificationFunctionSettings

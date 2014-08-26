/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningData;

import CWM.Core.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Numerical Attribute Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.MiningCore.MiningData.NumericalAttributeProperties#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.NumericalAttributeProperties#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.NumericalAttributeProperties#getIsDiscrete <em>Is Discrete</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.NumericalAttributeProperties#getIsCyclic <em>Is Cyclic</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.NumericalAttributeProperties#getAnchor <em>Anchor</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.NumericalAttributeProperties#getCycleBegin <em>Cycle Begin</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.NumericalAttributeProperties#getCycleEnd <em>Cycle End</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.NumericalAttributeProperties#getDiscreteStepSize <em>Discrete Step Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.MiningCore.MiningData.MiningDataPackage#getNumericalAttributeProperties()
 * @model
 * @generated
 */
public interface NumericalAttributeProperties extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound</em>' attribute.
	 * @see #setLowerBound(Double)
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getNumericalAttributeProperties_LowerBound()
	 * @model unique="false" dataType="CWM.MiningCore.MiningData.Double" required="true" ordered="false"
	 * @generated
	 */
	Double getLowerBound();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.MiningData.NumericalAttributeProperties#getLowerBound <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' attribute.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(Double value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' attribute.
	 * @see #setUpperBound(Double)
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getNumericalAttributeProperties_UpperBound()
	 * @model unique="false" dataType="CWM.MiningCore.MiningData.Double" required="true" ordered="false"
	 * @generated
	 */
	Double getUpperBound();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.MiningData.NumericalAttributeProperties#getUpperBound <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' attribute.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(Double value);

	/**
	 * Returns the value of the '<em><b>Is Discrete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Discrete</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Discrete</em>' attribute.
	 * @see #setIsDiscrete(Boolean)
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getNumericalAttributeProperties_IsDiscrete()
	 * @model unique="false" dataType="CWM.Core.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsDiscrete();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.MiningData.NumericalAttributeProperties#getIsDiscrete <em>Is Discrete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Discrete</em>' attribute.
	 * @see #getIsDiscrete()
	 * @generated
	 */
	void setIsDiscrete(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Cyclic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Cyclic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Cyclic</em>' attribute.
	 * @see #setIsCyclic(Boolean)
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getNumericalAttributeProperties_IsCyclic()
	 * @model unique="false" dataType="CWM.Core.Boolean" ordered="false"
	 * @generated
	 */
	Boolean getIsCyclic();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.MiningData.NumericalAttributeProperties#getIsCyclic <em>Is Cyclic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Cyclic</em>' attribute.
	 * @see #getIsCyclic()
	 * @generated
	 */
	void setIsCyclic(Boolean value);

	/**
	 * Returns the value of the '<em><b>Anchor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anchor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anchor</em>' attribute.
	 * @see #setAnchor(Double)
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getNumericalAttributeProperties_Anchor()
	 * @model unique="false" dataType="CWM.MiningCore.MiningData.Double" ordered="false"
	 * @generated
	 */
	Double getAnchor();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.MiningData.NumericalAttributeProperties#getAnchor <em>Anchor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anchor</em>' attribute.
	 * @see #getAnchor()
	 * @generated
	 */
	void setAnchor(Double value);

	/**
	 * Returns the value of the '<em><b>Cycle Begin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cycle Begin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cycle Begin</em>' attribute.
	 * @see #setCycleBegin(Double)
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getNumericalAttributeProperties_CycleBegin()
	 * @model unique="false" dataType="CWM.MiningCore.MiningData.Double" ordered="false"
	 * @generated
	 */
	Double getCycleBegin();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.MiningData.NumericalAttributeProperties#getCycleBegin <em>Cycle Begin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cycle Begin</em>' attribute.
	 * @see #getCycleBegin()
	 * @generated
	 */
	void setCycleBegin(Double value);

	/**
	 * Returns the value of the '<em><b>Cycle End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cycle End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cycle End</em>' attribute.
	 * @see #setCycleEnd(Double)
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getNumericalAttributeProperties_CycleEnd()
	 * @model unique="false" dataType="CWM.MiningCore.MiningData.Double" ordered="false"
	 * @generated
	 */
	Double getCycleEnd();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.MiningData.NumericalAttributeProperties#getCycleEnd <em>Cycle End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cycle End</em>' attribute.
	 * @see #getCycleEnd()
	 * @generated
	 */
	void setCycleEnd(Double value);

	/**
	 * Returns the value of the '<em><b>Discrete Step Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discrete Step Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discrete Step Size</em>' attribute.
	 * @see #setDiscreteStepSize(Double)
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getNumericalAttributeProperties_DiscreteStepSize()
	 * @model unique="false" dataType="CWM.MiningCore.MiningData.Double" ordered="false"
	 * @generated
	 */
	Double getDiscreteStepSize();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.MiningData.NumericalAttributeProperties#getDiscreteStepSize <em>Discrete Step Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discrete Step Size</em>' attribute.
	 * @see #getDiscreteStepSize()
	 * @generated
	 */
	void setDiscreteStepSize(Double value);

} // NumericalAttributeProperties

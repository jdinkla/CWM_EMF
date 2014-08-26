/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningData;

import CWM.Core.Attribute;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reverse Pivot Attribute Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.MiningCore.MiningData.ReversePivotAttributeAssignment#getSelectorAttribute <em>Selector Attribute</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.ReversePivotAttributeAssignment#getAttributeSelectionFunction <em>Attribute Selection Function</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.ReversePivotAttributeAssignment#getValueSelectionFunction <em>Value Selection Function</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.MiningCore.MiningData.MiningDataPackage#getReversePivotAttributeAssignment()
 * @model
 * @generated
 */
public interface ReversePivotAttributeAssignment extends AttributeAssignment {
	/**
	 * Returns the value of the '<em><b>Selector Attribute</b></em>' reference list.
	 * The list contents are of type {@link CWM.Core.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selector Attribute</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selector Attribute</em>' reference list.
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getReversePivotAttributeAssignment_SelectorAttribute()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Attribute> getSelectorAttribute();

	/**
	 * Returns the value of the '<em><b>Attribute Selection Function</b></em>' attribute.
	 * The literals are from the enumeration {@link CWM.MiningCore.MiningData.AttributeSelectionFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Selection Function</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Selection Function</em>' attribute.
	 * @see CWM.MiningCore.MiningData.AttributeSelectionFunction
	 * @see #setAttributeSelectionFunction(AttributeSelectionFunction)
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getReversePivotAttributeAssignment_AttributeSelectionFunction()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	AttributeSelectionFunction getAttributeSelectionFunction();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.MiningData.ReversePivotAttributeAssignment#getAttributeSelectionFunction <em>Attribute Selection Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Selection Function</em>' attribute.
	 * @see CWM.MiningCore.MiningData.AttributeSelectionFunction
	 * @see #getAttributeSelectionFunction()
	 * @generated
	 */
	void setAttributeSelectionFunction(AttributeSelectionFunction value);

	/**
	 * Returns the value of the '<em><b>Value Selection Function</b></em>' attribute.
	 * The literals are from the enumeration {@link CWM.MiningCore.MiningData.ValueSelectionFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Selection Function</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Selection Function</em>' attribute.
	 * @see CWM.MiningCore.MiningData.ValueSelectionFunction
	 * @see #setValueSelectionFunction(ValueSelectionFunction)
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getReversePivotAttributeAssignment_ValueSelectionFunction()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	ValueSelectionFunction getValueSelectionFunction();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.MiningData.ReversePivotAttributeAssignment#getValueSelectionFunction <em>Value Selection Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Selection Function</em>' attribute.
	 * @see CWM.MiningCore.MiningData.ValueSelectionFunction
	 * @see #getValueSelectionFunction()
	 * @generated
	 */
	void setValueSelectionFunction(ValueSelectionFunction value);

} // ReversePivotAttributeAssignment

/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningData;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.MiningCore.MiningData.LogicalAttribute#getIsSetValued <em>Is Set Valued</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.LogicalAttribute#getCategoricalProperties <em>Categorical Properties</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.LogicalAttribute#getNumericalProperties <em>Numerical Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.MiningCore.MiningData.MiningDataPackage#getLogicalAttribute()
 * @model
 * @generated
 */
public interface LogicalAttribute extends MiningAttribute {
	/**
	 * Returns the value of the '<em><b>Is Set Valued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Set Valued</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Set Valued</em>' attribute.
	 * @see #setIsSetValued(Boolean)
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getLogicalAttribute_IsSetValued()
	 * @model unique="false" dataType="CWM.Core.Boolean" ordered="false"
	 * @generated
	 */
	Boolean getIsSetValued();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.MiningData.LogicalAttribute#getIsSetValued <em>Is Set Valued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Set Valued</em>' attribute.
	 * @see #getIsSetValued()
	 * @generated
	 */
	void setIsSetValued(Boolean value);

	/**
	 * Returns the value of the '<em><b>Categorical Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorical Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorical Properties</em>' containment reference.
	 * @see #setCategoricalProperties(CategoricalAttributeProperties)
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getLogicalAttribute_CategoricalProperties()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	CategoricalAttributeProperties getCategoricalProperties();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.MiningData.LogicalAttribute#getCategoricalProperties <em>Categorical Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorical Properties</em>' containment reference.
	 * @see #getCategoricalProperties()
	 * @generated
	 */
	void setCategoricalProperties(CategoricalAttributeProperties value);

	/**
	 * Returns the value of the '<em><b>Numerical Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numerical Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numerical Properties</em>' containment reference.
	 * @see #setNumericalProperties(NumericalAttributeProperties)
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getLogicalAttribute_NumericalProperties()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	NumericalAttributeProperties getNumericalProperties();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.MiningData.LogicalAttribute#getNumericalProperties <em>Numerical Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numerical Properties</em>' containment reference.
	 * @see #getNumericalProperties()
	 * @generated
	 */
	void setNumericalProperties(NumericalAttributeProperties value);

} // LogicalAttribute

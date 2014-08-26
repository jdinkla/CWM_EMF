/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningData;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ordinal Attribute Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.MiningCore.MiningData.OrdinalAttributeProperties#getOrderType <em>Order Type</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.OrdinalAttributeProperties#getIsCyclic <em>Is Cyclic</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.MiningCore.MiningData.MiningDataPackage#getOrdinalAttributeProperties()
 * @model
 * @generated
 */
public interface OrdinalAttributeProperties extends CategoricalAttributeProperties {
	/**
	 * Returns the value of the '<em><b>Order Type</b></em>' attribute.
	 * The literals are from the enumeration {@link CWM.MiningCore.MiningData.OrderType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Type</em>' attribute.
	 * @see CWM.MiningCore.MiningData.OrderType
	 * @see #setOrderType(OrderType)
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getOrdinalAttributeProperties_OrderType()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	OrderType getOrderType();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.MiningData.OrdinalAttributeProperties#getOrderType <em>Order Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Type</em>' attribute.
	 * @see CWM.MiningCore.MiningData.OrderType
	 * @see #getOrderType()
	 * @generated
	 */
	void setOrderType(OrderType value);

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
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getOrdinalAttributeProperties_IsCyclic()
	 * @model unique="false" dataType="CWM.Core.Boolean" ordered="false"
	 * @generated
	 */
	Boolean getIsCyclic();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.MiningData.OrdinalAttributeProperties#getIsCyclic <em>Is Cyclic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Cyclic</em>' attribute.
	 * @see #getIsCyclic()
	 * @generated
	 */
	void setIsCyclic(Boolean value);

} // OrdinalAttributeProperties

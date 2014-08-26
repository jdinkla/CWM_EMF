/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.WarehouseOperation;

import CWM.Core.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measurement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.WarehouseOperation.Measurement#getValue <em>Value</em>}</li>
 *   <li>{@link CWM.WarehouseOperation.Measurement#getUnit <em>Unit</em>}</li>
 *   <li>{@link CWM.WarehouseOperation.Measurement#getType <em>Type</em>}</li>
 *   <li>{@link CWM.WarehouseOperation.Measurement#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link CWM.WarehouseOperation.Measurement#getEffectiveDate <em>Effective Date</em>}</li>
 *   <li>{@link CWM.WarehouseOperation.Measurement#getModelElement <em>Model Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.WarehouseOperation.WarehouseOperationPackage#getMeasurement()
 * @model
 * @generated
 */
public interface Measurement extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Float)
	 * @see CWM.WarehouseOperation.WarehouseOperationPackage#getMeasurement_Value()
	 * @model unique="false" dataType="CWM.Core.Float" required="true" ordered="false"
	 * @generated
	 */
	Float getValue();

	/**
	 * Sets the value of the '{@link CWM.WarehouseOperation.Measurement#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Float value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(String)
	 * @see CWM.WarehouseOperation.WarehouseOperationPackage#getMeasurement_Unit()
	 * @model unique="false" dataType="CWM.Core.String" required="true" ordered="false"
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link CWM.WarehouseOperation.Measurement#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see CWM.WarehouseOperation.WarehouseOperationPackage#getMeasurement_Type()
	 * @model unique="false" dataType="CWM.Core.String" required="true" ordered="false"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link CWM.WarehouseOperation.Measurement#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Date</em>' attribute.
	 * @see #setCreationDate(String)
	 * @see CWM.WarehouseOperation.WarehouseOperationPackage#getMeasurement_CreationDate()
	 * @model unique="false" dataType="CWM.Core.Time" required="true" ordered="false"
	 * @generated
	 */
	String getCreationDate();

	/**
	 * Sets the value of the '{@link CWM.WarehouseOperation.Measurement#getCreationDate <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(String value);

	/**
	 * Returns the value of the '<em><b>Effective Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effective Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effective Date</em>' attribute.
	 * @see #setEffectiveDate(String)
	 * @see CWM.WarehouseOperation.WarehouseOperationPackage#getMeasurement_EffectiveDate()
	 * @model unique="false" dataType="CWM.Core.Time" required="true" ordered="false"
	 * @generated
	 */
	String getEffectiveDate();

	/**
	 * Sets the value of the '{@link CWM.WarehouseOperation.Measurement#getEffectiveDate <em>Effective Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effective Date</em>' attribute.
	 * @see #getEffectiveDate()
	 * @generated
	 */
	void setEffectiveDate(String value);

	/**
	 * Returns the value of the '<em><b>Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Element</em>' reference.
	 * @see #setModelElement(ModelElement)
	 * @see CWM.WarehouseOperation.WarehouseOperationPackage#getMeasurement_ModelElement()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ModelElement getModelElement();

	/**
	 * Sets the value of the '{@link CWM.WarehouseOperation.Measurement#getModelElement <em>Model Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Element</em>' reference.
	 * @see #getModelElement()
	 * @generated
	 */
	void setModelElement(ModelElement value);

} // Measurement

/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningData;

import CWM.Core.Feature;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.MiningCore.MiningData.AttributeUsage#getUsage <em>Usage</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.AttributeUsage#getWeight <em>Weight</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.AttributeUsage#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.AttributeUsage#getSuppressDiscretization <em>Suppress Discretization</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.AttributeUsage#getSuppressNormalization <em>Suppress Normalization</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.MiningCore.MiningData.MiningDataPackage#getAttributeUsage()
 * @model
 * @generated
 */
public interface AttributeUsage extends Feature {
	/**
	 * Returns the value of the '<em><b>Usage</b></em>' attribute.
	 * The literals are from the enumeration {@link CWM.MiningCore.MiningData.UsageOption}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage</em>' attribute.
	 * @see CWM.MiningCore.MiningData.UsageOption
	 * @see #setUsage(UsageOption)
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getAttributeUsage_Usage()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	UsageOption getUsage();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.MiningData.AttributeUsage#getUsage <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage</em>' attribute.
	 * @see CWM.MiningCore.MiningData.UsageOption
	 * @see #getUsage()
	 * @generated
	 */
	void setUsage(UsageOption value);

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(Double)
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getAttributeUsage_Weight()
	 * @model unique="false" dataType="CWM.MiningCore.MiningData.Double" required="true" ordered="false"
	 * @generated
	 */
	Double getWeight();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.MiningData.AttributeUsage#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(Double value);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference list.
	 * The list contents are of type {@link CWM.MiningCore.MiningData.LogicalAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference list.
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getAttributeUsage_Attribute()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<LogicalAttribute> getAttribute();

	/**
	 * Returns the value of the '<em><b>Suppress Discretization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suppress Discretization</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suppress Discretization</em>' attribute.
	 * @see #setSuppressDiscretization(Boolean)
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getAttributeUsage_SuppressDiscretization()
	 * @model unique="false" dataType="CWM.Core.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getSuppressDiscretization();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.MiningData.AttributeUsage#getSuppressDiscretization <em>Suppress Discretization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suppress Discretization</em>' attribute.
	 * @see #getSuppressDiscretization()
	 * @generated
	 */
	void setSuppressDiscretization(Boolean value);

	/**
	 * Returns the value of the '<em><b>Suppress Normalization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suppress Normalization</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suppress Normalization</em>' attribute.
	 * @see #setSuppressNormalization(Boolean)
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getAttributeUsage_SuppressNormalization()
	 * @model unique="false" dataType="CWM.Core.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getSuppressNormalization();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.MiningData.AttributeUsage#getSuppressNormalization <em>Suppress Normalization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suppress Normalization</em>' attribute.
	 * @see #getSuppressNormalization()
	 * @generated
	 */
	void setSuppressNormalization(Boolean value);

} // AttributeUsage

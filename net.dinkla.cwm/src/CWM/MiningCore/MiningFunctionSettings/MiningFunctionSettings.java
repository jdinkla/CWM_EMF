/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningFunctionSettings;

import CWM.Core.ModelElement;

import CWM.MiningCore.MiningData.AttributeUsageSet;
import CWM.MiningCore.MiningData.LogicalData;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mining Function Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.MiningCore.MiningFunctionSettings.MiningFunctionSettings#getAlgorithmSettings <em>Algorithm Settings</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningFunctionSettings.MiningFunctionSettings#getDesiredExecutionTimeInMinutes <em>Desired Execution Time In Minutes</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningFunctionSettings.MiningFunctionSettings#getAttributeUsageSet <em>Attribute Usage Set</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningFunctionSettings.MiningFunctionSettings#getLogicalData <em>Logical Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.MiningCore.MiningFunctionSettings.MiningFunctionSettingsPackage#getMiningFunctionSettings()
 * @model abstract="true"
 * @generated
 */
public interface MiningFunctionSettings extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Algorithm Settings</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Algorithm Settings</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithm Settings</em>' reference.
	 * @see #setAlgorithmSettings(MiningAlgorithmSettings)
	 * @see CWM.MiningCore.MiningFunctionSettings.MiningFunctionSettingsPackage#getMiningFunctionSettings_AlgorithmSettings()
	 * @model ordered="false"
	 * @generated
	 */
	MiningAlgorithmSettings getAlgorithmSettings();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.MiningFunctionSettings.MiningFunctionSettings#getAlgorithmSettings <em>Algorithm Settings</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithm Settings</em>' reference.
	 * @see #getAlgorithmSettings()
	 * @generated
	 */
	void setAlgorithmSettings(MiningAlgorithmSettings value);

	/**
	 * Returns the value of the '<em><b>Desired Execution Time In Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Desired Execution Time In Minutes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Desired Execution Time In Minutes</em>' attribute.
	 * @see #setDesiredExecutionTimeInMinutes(Integer)
	 * @see CWM.MiningCore.MiningFunctionSettings.MiningFunctionSettingsPackage#getMiningFunctionSettings_DesiredExecutionTimeInMinutes()
	 * @model unique="false" dataType="CWM.Core.Integer" required="true" ordered="false"
	 * @generated
	 */
	Integer getDesiredExecutionTimeInMinutes();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.MiningFunctionSettings.MiningFunctionSettings#getDesiredExecutionTimeInMinutes <em>Desired Execution Time In Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Desired Execution Time In Minutes</em>' attribute.
	 * @see #getDesiredExecutionTimeInMinutes()
	 * @generated
	 */
	void setDesiredExecutionTimeInMinutes(Integer value);

	/**
	 * Returns the value of the '<em><b>Attribute Usage Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Usage Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Usage Set</em>' containment reference.
	 * @see #setAttributeUsageSet(AttributeUsageSet)
	 * @see CWM.MiningCore.MiningFunctionSettings.MiningFunctionSettingsPackage#getMiningFunctionSettings_AttributeUsageSet()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	AttributeUsageSet getAttributeUsageSet();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.MiningFunctionSettings.MiningFunctionSettings#getAttributeUsageSet <em>Attribute Usage Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Usage Set</em>' containment reference.
	 * @see #getAttributeUsageSet()
	 * @generated
	 */
	void setAttributeUsageSet(AttributeUsageSet value);

	/**
	 * Returns the value of the '<em><b>Logical Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logical Data</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical Data</em>' reference.
	 * @see #setLogicalData(LogicalData)
	 * @see CWM.MiningCore.MiningFunctionSettings.MiningFunctionSettingsPackage#getMiningFunctionSettings_LogicalData()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	LogicalData getLogicalData();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.MiningFunctionSettings.MiningFunctionSettings#getLogicalData <em>Logical Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical Data</em>' reference.
	 * @see #getLogicalData()
	 * @generated
	 */
	void setLogicalData(LogicalData value);

} // MiningFunctionSettings

/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningModel;

import CWM.Core.Attribute;
import CWM.Core.ModelElement;

import CWM.MiningCore.MiningFunctionSettings.MiningFunctionSettings;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mining Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.MiningCore.MiningModel.MiningModel#getFunction <em>Function</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningModel.MiningModel#getAlgorithmName <em>Algorithm Name</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningModel.MiningModel#getSettings <em>Settings</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningModel.MiningModel#getModelSignature <em>Model Signature</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningModel.MiningModel#getModelLocation <em>Model Location</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningModel.MiningModel#getKeyAttribute <em>Key Attribute</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningModel.MiningModel#getKeyValue <em>Key Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.MiningCore.MiningModel.MiningModelPackage#getMiningModel()
 * @model
 * @generated
 */
public interface MiningModel extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Function</b></em>' attribute.
	 * The literals are from the enumeration {@link CWM.MiningCore.MiningModel.MiningFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' attribute.
	 * @see CWM.MiningCore.MiningModel.MiningFunction
	 * @see #setFunction(MiningFunction)
	 * @see CWM.MiningCore.MiningModel.MiningModelPackage#getMiningModel_Function()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	MiningFunction getFunction();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.MiningModel.MiningModel#getFunction <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' attribute.
	 * @see CWM.MiningCore.MiningModel.MiningFunction
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(MiningFunction value);

	/**
	 * Returns the value of the '<em><b>Algorithm Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Algorithm Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithm Name</em>' attribute.
	 * @see #setAlgorithmName(String)
	 * @see CWM.MiningCore.MiningModel.MiningModelPackage#getMiningModel_AlgorithmName()
	 * @model unique="false" dataType="CWM.Core.String" required="true" ordered="false"
	 * @generated
	 */
	String getAlgorithmName();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.MiningModel.MiningModel#getAlgorithmName <em>Algorithm Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithm Name</em>' attribute.
	 * @see #getAlgorithmName()
	 * @generated
	 */
	void setAlgorithmName(String value);

	/**
	 * Returns the value of the '<em><b>Settings</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Settings</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Settings</em>' reference.
	 * @see #setSettings(MiningFunctionSettings)
	 * @see CWM.MiningCore.MiningModel.MiningModelPackage#getMiningModel_Settings()
	 * @model ordered="false"
	 * @generated
	 */
	MiningFunctionSettings getSettings();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.MiningModel.MiningModel#getSettings <em>Settings</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Settings</em>' reference.
	 * @see #getSettings()
	 * @generated
	 */
	void setSettings(MiningFunctionSettings value);

	/**
	 * Returns the value of the '<em><b>Model Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Signature</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Signature</em>' containment reference.
	 * @see #setModelSignature(ModelSignature)
	 * @see CWM.MiningCore.MiningModel.MiningModelPackage#getMiningModel_ModelSignature()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	ModelSignature getModelSignature();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.MiningModel.MiningModel#getModelSignature <em>Model Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Signature</em>' containment reference.
	 * @see #getModelSignature()
	 * @generated
	 */
	void setModelSignature(ModelSignature value);

	/**
	 * Returns the value of the '<em><b>Model Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Location</em>' reference.
	 * @see #setModelLocation(CWM.Core.Class)
	 * @see CWM.MiningCore.MiningModel.MiningModelPackage#getMiningModel_ModelLocation()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	CWM.Core.Class getModelLocation();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.MiningModel.MiningModel#getModelLocation <em>Model Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Location</em>' reference.
	 * @see #getModelLocation()
	 * @generated
	 */
	void setModelLocation(CWM.Core.Class value);

	/**
	 * Returns the value of the '<em><b>Key Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Attribute</em>' reference.
	 * @see #setKeyAttribute(Attribute)
	 * @see CWM.MiningCore.MiningModel.MiningModelPackage#getMiningModel_KeyAttribute()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Attribute getKeyAttribute();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.MiningModel.MiningModel#getKeyAttribute <em>Key Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Attribute</em>' reference.
	 * @see #getKeyAttribute()
	 * @generated
	 */
	void setKeyAttribute(Attribute value);

	/**
	 * Returns the value of the '<em><b>Key Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Value</em>' attribute.
	 * @see #setKeyValue(Object)
	 * @see CWM.MiningCore.MiningModel.MiningModelPackage#getMiningModel_KeyValue()
	 * @model unique="false" dataType="CWM.Core.Any" required="true" ordered="false"
	 * @generated
	 */
	Object getKeyValue();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.MiningModel.MiningModel#getKeyValue <em>Key Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Value</em>' attribute.
	 * @see #getKeyValue()
	 * @generated
	 */
	void setKeyValue(Object value);

} // MiningModel

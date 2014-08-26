/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.AssociationRules;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Function Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.AssociationRules.SequenceFunctionSettings#getWindowSize <em>Window Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.AssociationRules.AssociationRulesPackage#getSequenceFunctionSettings()
 * @model
 * @generated
 */
public interface SequenceFunctionSettings extends FrequentItemSetFunctionSettings {
	/**
	 * Returns the value of the '<em><b>Window Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Window Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Window Size</em>' attribute.
	 * @see #setWindowSize(Integer)
	 * @see CWM.AssociationRules.AssociationRulesPackage#getSequenceFunctionSettings_WindowSize()
	 * @model unique="false" dataType="CWM.Core.Integer" required="true" ordered="false"
	 * @generated
	 */
	Integer getWindowSize();

	/**
	 * Sets the value of the '{@link CWM.AssociationRules.SequenceFunctionSettings#getWindowSize <em>Window Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Window Size</em>' attribute.
	 * @see #getWindowSize()
	 * @generated
	 */
	void setWindowSize(Integer value);

} // SequenceFunctionSettings

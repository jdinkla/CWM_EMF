/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.AssociationRules;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.AssociationRules.AssociationRulesFunctionSettings#getMinimumConfidence <em>Minimum Confidence</em>}</li>
 *   <li>{@link CWM.AssociationRules.AssociationRulesFunctionSettings#getMaximumRuleLength <em>Maximum Rule Length</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.AssociationRules.AssociationRulesPackage#getAssociationRulesFunctionSettings()
 * @model
 * @generated
 */
public interface AssociationRulesFunctionSettings extends FrequentItemSetFunctionSettings {
	/**
	 * Returns the value of the '<em><b>Minimum Confidence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Confidence</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Confidence</em>' attribute.
	 * @see #setMinimumConfidence(Double)
	 * @see CWM.AssociationRules.AssociationRulesPackage#getAssociationRulesFunctionSettings_MinimumConfidence()
	 * @model unique="false" dataType="CWM.MiningCore.MiningData.Double" required="true" ordered="false"
	 * @generated
	 */
	Double getMinimumConfidence();

	/**
	 * Sets the value of the '{@link CWM.AssociationRules.AssociationRulesFunctionSettings#getMinimumConfidence <em>Minimum Confidence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Confidence</em>' attribute.
	 * @see #getMinimumConfidence()
	 * @generated
	 */
	void setMinimumConfidence(Double value);

	/**
	 * Returns the value of the '<em><b>Maximum Rule Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Rule Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Rule Length</em>' attribute.
	 * @see #setMaximumRuleLength(Integer)
	 * @see CWM.AssociationRules.AssociationRulesPackage#getAssociationRulesFunctionSettings_MaximumRuleLength()
	 * @model unique="false" dataType="CWM.Core.Integer" required="true" ordered="false"
	 * @generated
	 */
	Integer getMaximumRuleLength();

	/**
	 * Sets the value of the '{@link CWM.AssociationRules.AssociationRulesFunctionSettings#getMaximumRuleLength <em>Maximum Rule Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Rule Length</em>' attribute.
	 * @see #getMaximumRuleLength()
	 * @generated
	 */
	void setMaximumRuleLength(Integer value);

} // AssociationRulesFunctionSettings

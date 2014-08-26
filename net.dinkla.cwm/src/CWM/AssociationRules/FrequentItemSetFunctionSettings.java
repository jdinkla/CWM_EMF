/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.AssociationRules;

import CWM.MiningCore.MiningData.Category;

import CWM.MiningCore.MiningFunctionSettings.MiningFunctionSettings;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Frequent Item Set Function Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.AssociationRules.FrequentItemSetFunctionSettings#getMinimumSupport <em>Minimum Support</em>}</li>
 *   <li>{@link CWM.AssociationRules.FrequentItemSetFunctionSettings#getExclusion <em>Exclusion</em>}</li>
 *   <li>{@link CWM.AssociationRules.FrequentItemSetFunctionSettings#getMaximumSetSize <em>Maximum Set Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.AssociationRules.AssociationRulesPackage#getFrequentItemSetFunctionSettings()
 * @model
 * @generated
 */
public interface FrequentItemSetFunctionSettings extends MiningFunctionSettings {
	/**
	 * Returns the value of the '<em><b>Minimum Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Support</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Support</em>' attribute.
	 * @see #setMinimumSupport(Double)
	 * @see CWM.AssociationRules.AssociationRulesPackage#getFrequentItemSetFunctionSettings_MinimumSupport()
	 * @model unique="false" dataType="CWM.MiningCore.MiningData.Double" required="true" ordered="false"
	 * @generated
	 */
	Double getMinimumSupport();

	/**
	 * Sets the value of the '{@link CWM.AssociationRules.FrequentItemSetFunctionSettings#getMinimumSupport <em>Minimum Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Support</em>' attribute.
	 * @see #getMinimumSupport()
	 * @generated
	 */
	void setMinimumSupport(Double value);

	/**
	 * Returns the value of the '<em><b>Exclusion</b></em>' reference list.
	 * The list contents are of type {@link CWM.MiningCore.MiningData.Category}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exclusion</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclusion</em>' reference list.
	 * @see CWM.AssociationRules.AssociationRulesPackage#getFrequentItemSetFunctionSettings_Exclusion()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Category> getExclusion();

	/**
	 * Returns the value of the '<em><b>Maximum Set Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Set Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Set Size</em>' attribute.
	 * @see #setMaximumSetSize(Integer)
	 * @see CWM.AssociationRules.AssociationRulesPackage#getFrequentItemSetFunctionSettings_MaximumSetSize()
	 * @model unique="false" dataType="CWM.Core.Integer" required="true" ordered="false"
	 * @generated
	 */
	Integer getMaximumSetSize();

	/**
	 * Sets the value of the '{@link CWM.AssociationRules.FrequentItemSetFunctionSettings#getMaximumSetSize <em>Maximum Set Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Set Size</em>' attribute.
	 * @see #getMaximumSetSize()
	 * @generated
	 */
	void setMaximumSetSize(Integer value);

} // FrequentItemSetFunctionSettings

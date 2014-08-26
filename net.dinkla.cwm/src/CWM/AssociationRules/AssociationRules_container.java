/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.AssociationRules;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association Rules container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.AssociationRules.AssociationRules_container#getAssociationRulesFunctionSettings <em>Association Rules Function Settings</em>}</li>
 *   <li>{@link CWM.AssociationRules.AssociationRules_container#getFrequentItemSetFunctionSettings <em>Frequent Item Set Function Settings</em>}</li>
 *   <li>{@link CWM.AssociationRules.AssociationRules_container#getSequenceFunctionSettings <em>Sequence Function Settings</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.AssociationRules.AssociationRulesPackage#getAssociationRules_container()
 * @model
 * @generated
 */
public interface AssociationRules_container extends EObject {
	/**
	 * Returns the value of the '<em><b>Association Rules Function Settings</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.AssociationRules.AssociationRulesFunctionSettings}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Rules Function Settings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Rules Function Settings</em>' containment reference list.
	 * @see CWM.AssociationRules.AssociationRulesPackage#getAssociationRules_container_AssociationRulesFunctionSettings()
	 * @model containment="true"
	 * @generated
	 */
	EList<AssociationRulesFunctionSettings> getAssociationRulesFunctionSettings();

	/**
	 * Returns the value of the '<em><b>Frequent Item Set Function Settings</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.AssociationRules.FrequentItemSetFunctionSettings}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frequent Item Set Function Settings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequent Item Set Function Settings</em>' containment reference list.
	 * @see CWM.AssociationRules.AssociationRulesPackage#getAssociationRules_container_FrequentItemSetFunctionSettings()
	 * @model containment="true"
	 * @generated
	 */
	EList<FrequentItemSetFunctionSettings> getFrequentItemSetFunctionSettings();

	/**
	 * Returns the value of the '<em><b>Sequence Function Settings</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.AssociationRules.SequenceFunctionSettings}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Function Settings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Function Settings</em>' containment reference list.
	 * @see CWM.AssociationRules.AssociationRulesPackage#getAssociationRules_container_SequenceFunctionSettings()
	 * @model containment="true"
	 * @generated
	 */
	EList<SequenceFunctionSettings> getSequenceFunctionSettings();

} // AssociationRules_container

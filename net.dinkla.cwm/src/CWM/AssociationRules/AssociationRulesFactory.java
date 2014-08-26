/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.AssociationRules;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see CWM.AssociationRules.AssociationRulesPackage
 * @generated
 */
public interface AssociationRulesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AssociationRulesFactory eINSTANCE = CWM.AssociationRules.impl.AssociationRulesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Function Settings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Settings</em>'.
	 * @generated
	 */
	AssociationRulesFunctionSettings createAssociationRulesFunctionSettings();

	/**
	 * Returns a new object of class '<em>Frequent Item Set Function Settings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Frequent Item Set Function Settings</em>'.
	 * @generated
	 */
	FrequentItemSetFunctionSettings createFrequentItemSetFunctionSettings();

	/**
	 * Returns a new object of class '<em>Sequence Function Settings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence Function Settings</em>'.
	 * @generated
	 */
	SequenceFunctionSettings createSequenceFunctionSettings();

	/**
	 * Returns a new object of class '<em>Association Rules container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Association Rules container</em>'.
	 * @generated
	 */
	AssociationRules_container createAssociationRules_container();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AssociationRulesPackage getAssociationRulesPackage();

} //AssociationRulesFactory

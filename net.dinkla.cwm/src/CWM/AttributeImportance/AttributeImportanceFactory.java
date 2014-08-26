/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.AttributeImportance;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see CWM.AttributeImportance.AttributeImportancePackage
 * @generated
 */
public interface AttributeImportanceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AttributeImportanceFactory eINSTANCE = CWM.AttributeImportance.impl.AttributeImportanceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Settings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Settings</em>'.
	 * @generated
	 */
	AttributeImportanceSettings createAttributeImportanceSettings();

	/**
	 * Returns a new object of class '<em>Attribute Importance container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Importance container</em>'.
	 * @generated
	 */
	AttributeImportance_container createAttributeImportance_container();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AttributeImportancePackage getAttributeImportancePackage();

} //AttributeImportanceFactory

/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.TypeMapping;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see CWM.TypeMapping.TypeMappingPackage
 * @generated
 */
public interface TypeMappingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TypeMappingFactory eINSTANCE = CWM.TypeMapping.impl.TypeMappingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Type Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Mapping</em>'.
	 * @generated
	 */
	TypeMapping createTypeMapping();

	/**
	 * Returns a new object of class '<em>Type System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type System</em>'.
	 * @generated
	 */
	TypeSystem createTypeSystem();

	/**
	 * Returns a new object of class '<em>Type Mapping container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Mapping container</em>'.
	 * @generated
	 */
	TypeMapping_container createTypeMapping_container();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TypeMappingPackage getTypeMappingPackage();

} //TypeMappingFactory

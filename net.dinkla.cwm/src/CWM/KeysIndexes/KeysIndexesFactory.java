/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.KeysIndexes;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see CWM.KeysIndexes.KeysIndexesPackage
 * @generated
 */
public interface KeysIndexesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KeysIndexesFactory eINSTANCE = CWM.KeysIndexes.impl.KeysIndexesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Unique Key</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unique Key</em>'.
	 * @generated
	 */
	UniqueKey createUniqueKey();

	/**
	 * Returns a new object of class '<em>Index</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Index</em>'.
	 * @generated
	 */
	Index createIndex();

	/**
	 * Returns a new object of class '<em>Key Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Key Relationship</em>'.
	 * @generated
	 */
	KeyRelationship createKeyRelationship();

	/**
	 * Returns a new object of class '<em>Indexed Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Indexed Feature</em>'.
	 * @generated
	 */
	IndexedFeature createIndexedFeature();

	/**
	 * Returns a new object of class '<em>Keys Indexes container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Keys Indexes container</em>'.
	 * @generated
	 */
	KeysIndexes_container createKeysIndexes_container();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	KeysIndexesPackage getKeysIndexesPackage();

} //KeysIndexesFactory

/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see CWM.MiningCore.MiningModel.MiningModelPackage
 * @generated
 */
public interface MiningModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MiningModelFactory eINSTANCE = CWM.MiningCore.MiningModel.impl.MiningModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Mining Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mining Model</em>'.
	 * @generated
	 */
	MiningModel createMiningModel();

	/**
	 * Returns a new object of class '<em>Model Signature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Signature</em>'.
	 * @generated
	 */
	ModelSignature createModelSignature();

	/**
	 * Returns a new object of class '<em>Signature Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signature Attribute</em>'.
	 * @generated
	 */
	SignatureAttribute createSignatureAttribute();

	/**
	 * Returns a new object of class '<em>Mining Model container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mining Model container</em>'.
	 * @generated
	 */
	MiningModel_container createMiningModel_container();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MiningModelPackage getMiningModelPackage();

} //MiningModelFactory

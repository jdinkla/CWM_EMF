/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mining Model container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.MiningCore.MiningModel.MiningModel_container#getMiningModel <em>Mining Model</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningModel.MiningModel_container#getModelSignature <em>Model Signature</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningModel.MiningModel_container#getSignatureAttribute <em>Signature Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.MiningCore.MiningModel.MiningModelPackage#getMiningModel_container()
 * @model
 * @generated
 */
public interface MiningModel_container extends EObject {
	/**
	 * Returns the value of the '<em><b>Mining Model</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.MiningCore.MiningModel.MiningModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mining Model</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mining Model</em>' containment reference list.
	 * @see CWM.MiningCore.MiningModel.MiningModelPackage#getMiningModel_container_MiningModel()
	 * @model containment="true"
	 * @generated
	 */
	EList<MiningModel> getMiningModel();

	/**
	 * Returns the value of the '<em><b>Model Signature</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.MiningCore.MiningModel.ModelSignature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Signature</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Signature</em>' containment reference list.
	 * @see CWM.MiningCore.MiningModel.MiningModelPackage#getMiningModel_container_ModelSignature()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModelSignature> getModelSignature();

	/**
	 * Returns the value of the '<em><b>Signature Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.MiningCore.MiningModel.SignatureAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature Attribute</em>' containment reference list.
	 * @see CWM.MiningCore.MiningModel.MiningModelPackage#getMiningModel_container_SignatureAttribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<SignatureAttribute> getSignatureAttribute();

} // MiningModel_container

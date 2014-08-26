/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningModel.impl;

import CWM.MiningCore.MiningModel.MiningModel;
import CWM.MiningCore.MiningModel.MiningModelPackage;
import CWM.MiningCore.MiningModel.MiningModel_container;
import CWM.MiningCore.MiningModel.ModelSignature;
import CWM.MiningCore.MiningModel.SignatureAttribute;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mining Model container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.MiningCore.MiningModel.impl.MiningModel_containerImpl#getMiningModel <em>Mining Model</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningModel.impl.MiningModel_containerImpl#getModelSignature <em>Model Signature</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningModel.impl.MiningModel_containerImpl#getSignatureAttribute <em>Signature Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MiningModel_containerImpl extends EObjectImpl implements MiningModel_container {
	/**
	 * The cached value of the '{@link #getMiningModel() <em>Mining Model</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiningModel()
	 * @generated
	 * @ordered
	 */
	protected EList<MiningModel> miningModel;

	/**
	 * The cached value of the '{@link #getModelSignature() <em>Model Signature</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelSignature()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelSignature> modelSignature;

	/**
	 * The cached value of the '{@link #getSignatureAttribute() <em>Signature Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignatureAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<SignatureAttribute> signatureAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MiningModel_containerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MiningModelPackage.Literals.MINING_MODEL_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MiningModel> getMiningModel() {
		if (miningModel == null) {
			miningModel = new EObjectContainmentEList<MiningModel>(MiningModel.class, this, MiningModelPackage.MINING_MODEL_CONTAINER__MINING_MODEL);
		}
		return miningModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelSignature> getModelSignature() {
		if (modelSignature == null) {
			modelSignature = new EObjectContainmentEList<ModelSignature>(ModelSignature.class, this, MiningModelPackage.MINING_MODEL_CONTAINER__MODEL_SIGNATURE);
		}
		return modelSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SignatureAttribute> getSignatureAttribute() {
		if (signatureAttribute == null) {
			signatureAttribute = new EObjectContainmentEList<SignatureAttribute>(SignatureAttribute.class, this, MiningModelPackage.MINING_MODEL_CONTAINER__SIGNATURE_ATTRIBUTE);
		}
		return signatureAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MiningModelPackage.MINING_MODEL_CONTAINER__MINING_MODEL:
				return ((InternalEList<?>)getMiningModel()).basicRemove(otherEnd, msgs);
			case MiningModelPackage.MINING_MODEL_CONTAINER__MODEL_SIGNATURE:
				return ((InternalEList<?>)getModelSignature()).basicRemove(otherEnd, msgs);
			case MiningModelPackage.MINING_MODEL_CONTAINER__SIGNATURE_ATTRIBUTE:
				return ((InternalEList<?>)getSignatureAttribute()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MiningModelPackage.MINING_MODEL_CONTAINER__MINING_MODEL:
				return getMiningModel();
			case MiningModelPackage.MINING_MODEL_CONTAINER__MODEL_SIGNATURE:
				return getModelSignature();
			case MiningModelPackage.MINING_MODEL_CONTAINER__SIGNATURE_ATTRIBUTE:
				return getSignatureAttribute();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MiningModelPackage.MINING_MODEL_CONTAINER__MINING_MODEL:
				getMiningModel().clear();
				getMiningModel().addAll((Collection<? extends MiningModel>)newValue);
				return;
			case MiningModelPackage.MINING_MODEL_CONTAINER__MODEL_SIGNATURE:
				getModelSignature().clear();
				getModelSignature().addAll((Collection<? extends ModelSignature>)newValue);
				return;
			case MiningModelPackage.MINING_MODEL_CONTAINER__SIGNATURE_ATTRIBUTE:
				getSignatureAttribute().clear();
				getSignatureAttribute().addAll((Collection<? extends SignatureAttribute>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MiningModelPackage.MINING_MODEL_CONTAINER__MINING_MODEL:
				getMiningModel().clear();
				return;
			case MiningModelPackage.MINING_MODEL_CONTAINER__MODEL_SIGNATURE:
				getModelSignature().clear();
				return;
			case MiningModelPackage.MINING_MODEL_CONTAINER__SIGNATURE_ATTRIBUTE:
				getSignatureAttribute().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MiningModelPackage.MINING_MODEL_CONTAINER__MINING_MODEL:
				return miningModel != null && !miningModel.isEmpty();
			case MiningModelPackage.MINING_MODEL_CONTAINER__MODEL_SIGNATURE:
				return modelSignature != null && !modelSignature.isEmpty();
			case MiningModelPackage.MINING_MODEL_CONTAINER__SIGNATURE_ATTRIBUTE:
				return signatureAttribute != null && !signatureAttribute.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MiningModel_containerImpl

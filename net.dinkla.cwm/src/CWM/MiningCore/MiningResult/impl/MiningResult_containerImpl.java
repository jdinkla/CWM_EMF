/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningResult.impl;

import CWM.MiningCore.MiningResult.MiningResult;
import CWM.MiningCore.MiningResult.MiningResultPackage;
import CWM.MiningCore.MiningResult.MiningResult_container;

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
 * An implementation of the model object '<em><b>Mining Result container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.MiningCore.MiningResult.impl.MiningResult_containerImpl#getMiningResult <em>Mining Result</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MiningResult_containerImpl extends EObjectImpl implements MiningResult_container {
	/**
	 * The cached value of the '{@link #getMiningResult() <em>Mining Result</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiningResult()
	 * @generated
	 * @ordered
	 */
	protected EList<MiningResult> miningResult;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MiningResult_containerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MiningResultPackage.Literals.MINING_RESULT_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MiningResult> getMiningResult() {
		if (miningResult == null) {
			miningResult = new EObjectContainmentEList<MiningResult>(MiningResult.class, this, MiningResultPackage.MINING_RESULT_CONTAINER__MINING_RESULT);
		}
		return miningResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MiningResultPackage.MINING_RESULT_CONTAINER__MINING_RESULT:
				return ((InternalEList<?>)getMiningResult()).basicRemove(otherEnd, msgs);
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
			case MiningResultPackage.MINING_RESULT_CONTAINER__MINING_RESULT:
				return getMiningResult();
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
			case MiningResultPackage.MINING_RESULT_CONTAINER__MINING_RESULT:
				getMiningResult().clear();
				getMiningResult().addAll((Collection<? extends MiningResult>)newValue);
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
			case MiningResultPackage.MINING_RESULT_CONTAINER__MINING_RESULT:
				getMiningResult().clear();
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
			case MiningResultPackage.MINING_RESULT_CONTAINER__MINING_RESULT:
				return miningResult != null && !miningResult.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MiningResult_containerImpl

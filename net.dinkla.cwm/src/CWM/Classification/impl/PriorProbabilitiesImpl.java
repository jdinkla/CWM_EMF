/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Classification.impl;

import CWM.Classification.ClassificationPackage;
import CWM.Classification.PriorProbabilities;
import CWM.Classification.PriorProbabilitiesEntry;

import CWM.Core.impl.ModelElementImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prior Probabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.Classification.impl.PriorProbabilitiesImpl#getPrior <em>Prior</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PriorProbabilitiesImpl extends ModelElementImpl implements PriorProbabilities {
	/**
	 * The cached value of the '{@link #getPrior() <em>Prior</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrior()
	 * @generated
	 * @ordered
	 */
	protected EList<PriorProbabilitiesEntry> prior;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PriorProbabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassificationPackage.Literals.PRIOR_PROBABILITIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PriorProbabilitiesEntry> getPrior() {
		if (prior == null) {
			prior = new EObjectContainmentEList<PriorProbabilitiesEntry>(PriorProbabilitiesEntry.class, this, ClassificationPackage.PRIOR_PROBABILITIES__PRIOR);
		}
		return prior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ClassificationPackage.PRIOR_PROBABILITIES__PRIOR:
				return ((InternalEList<?>)getPrior()).basicRemove(otherEnd, msgs);
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
			case ClassificationPackage.PRIOR_PROBABILITIES__PRIOR:
				return getPrior();
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
			case ClassificationPackage.PRIOR_PROBABILITIES__PRIOR:
				getPrior().clear();
				getPrior().addAll((Collection<? extends PriorProbabilitiesEntry>)newValue);
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
			case ClassificationPackage.PRIOR_PROBABILITIES__PRIOR:
				getPrior().clear();
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
			case ClassificationPackage.PRIOR_PROBABILITIES__PRIOR:
				return prior != null && !prior.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PriorProbabilitiesImpl

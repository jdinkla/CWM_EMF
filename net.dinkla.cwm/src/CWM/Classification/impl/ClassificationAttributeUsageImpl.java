/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Classification.impl;

import CWM.Classification.ClassificationAttributeUsage;
import CWM.Classification.ClassificationPackage;
import CWM.Classification.PriorProbabilities;

import CWM.MiningCore.MiningData.Category;

import CWM.MiningCore.MiningData.impl.AttributeUsageImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.Classification.impl.ClassificationAttributeUsageImpl#getPositiveCategory <em>Positive Category</em>}</li>
 *   <li>{@link CWM.Classification.impl.ClassificationAttributeUsageImpl#getPriors <em>Priors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassificationAttributeUsageImpl extends AttributeUsageImpl implements ClassificationAttributeUsage {
	/**
	 * The cached value of the '{@link #getPositiveCategory() <em>Positive Category</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositiveCategory()
	 * @generated
	 * @ordered
	 */
	protected EList<Category> positiveCategory;

	/**
	 * The cached value of the '{@link #getPriors() <em>Priors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriors()
	 * @generated
	 * @ordered
	 */
	protected PriorProbabilities priors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassificationAttributeUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassificationPackage.Literals.CLASSIFICATION_ATTRIBUTE_USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Category> getPositiveCategory() {
		if (positiveCategory == null) {
			positiveCategory = new EObjectResolvingEList<Category>(Category.class, this, ClassificationPackage.CLASSIFICATION_ATTRIBUTE_USAGE__POSITIVE_CATEGORY);
		}
		return positiveCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriorProbabilities getPriors() {
		return priors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPriors(PriorProbabilities newPriors, NotificationChain msgs) {
		PriorProbabilities oldPriors = priors;
		priors = newPriors;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ClassificationPackage.CLASSIFICATION_ATTRIBUTE_USAGE__PRIORS, oldPriors, newPriors);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriors(PriorProbabilities newPriors) {
		if (newPriors != priors) {
			NotificationChain msgs = null;
			if (priors != null)
				msgs = ((InternalEObject)priors).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ClassificationPackage.CLASSIFICATION_ATTRIBUTE_USAGE__PRIORS, null, msgs);
			if (newPriors != null)
				msgs = ((InternalEObject)newPriors).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ClassificationPackage.CLASSIFICATION_ATTRIBUTE_USAGE__PRIORS, null, msgs);
			msgs = basicSetPriors(newPriors, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassificationPackage.CLASSIFICATION_ATTRIBUTE_USAGE__PRIORS, newPriors, newPriors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ClassificationPackage.CLASSIFICATION_ATTRIBUTE_USAGE__PRIORS:
				return basicSetPriors(null, msgs);
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
			case ClassificationPackage.CLASSIFICATION_ATTRIBUTE_USAGE__POSITIVE_CATEGORY:
				return getPositiveCategory();
			case ClassificationPackage.CLASSIFICATION_ATTRIBUTE_USAGE__PRIORS:
				return getPriors();
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
			case ClassificationPackage.CLASSIFICATION_ATTRIBUTE_USAGE__POSITIVE_CATEGORY:
				getPositiveCategory().clear();
				getPositiveCategory().addAll((Collection<? extends Category>)newValue);
				return;
			case ClassificationPackage.CLASSIFICATION_ATTRIBUTE_USAGE__PRIORS:
				setPriors((PriorProbabilities)newValue);
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
			case ClassificationPackage.CLASSIFICATION_ATTRIBUTE_USAGE__POSITIVE_CATEGORY:
				getPositiveCategory().clear();
				return;
			case ClassificationPackage.CLASSIFICATION_ATTRIBUTE_USAGE__PRIORS:
				setPriors((PriorProbabilities)null);
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
			case ClassificationPackage.CLASSIFICATION_ATTRIBUTE_USAGE__POSITIVE_CATEGORY:
				return positiveCategory != null && !positiveCategory.isEmpty();
			case ClassificationPackage.CLASSIFICATION_ATTRIBUTE_USAGE__PRIORS:
				return priors != null;
		}
		return super.eIsSet(featureID);
	}

} //ClassificationAttributeUsageImpl

/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningData.impl;

import CWM.Core.impl.ModelElementImpl;

import CWM.MiningCore.MiningData.CategoricalAttributeProperties;
import CWM.MiningCore.MiningData.Category;
import CWM.MiningCore.MiningData.CategoryTaxonomy;
import CWM.MiningCore.MiningData.MiningDataPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Categorical Attribute Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.MiningCore.MiningData.impl.CategoricalAttributePropertiesImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.impl.CategoricalAttributePropertiesImpl#getTaxonomy <em>Taxonomy</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CategoricalAttributePropertiesImpl extends ModelElementImpl implements CategoricalAttributeProperties {
	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected EList<Category> category;

	/**
	 * The cached value of the '{@link #getTaxonomy() <em>Taxonomy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxonomy()
	 * @generated
	 * @ordered
	 */
	protected CategoryTaxonomy taxonomy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CategoricalAttributePropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MiningDataPackage.Literals.CATEGORICAL_ATTRIBUTE_PROPERTIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Category> getCategory() {
		if (category == null) {
			category = new EObjectContainmentEList<Category>(Category.class, this, MiningDataPackage.CATEGORICAL_ATTRIBUTE_PROPERTIES__CATEGORY);
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategoryTaxonomy getTaxonomy() {
		if (taxonomy != null && taxonomy.eIsProxy()) {
			InternalEObject oldTaxonomy = (InternalEObject)taxonomy;
			taxonomy = (CategoryTaxonomy)eResolveProxy(oldTaxonomy);
			if (taxonomy != oldTaxonomy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MiningDataPackage.CATEGORICAL_ATTRIBUTE_PROPERTIES__TAXONOMY, oldTaxonomy, taxonomy));
			}
		}
		return taxonomy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategoryTaxonomy basicGetTaxonomy() {
		return taxonomy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaxonomy(CategoryTaxonomy newTaxonomy) {
		CategoryTaxonomy oldTaxonomy = taxonomy;
		taxonomy = newTaxonomy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiningDataPackage.CATEGORICAL_ATTRIBUTE_PROPERTIES__TAXONOMY, oldTaxonomy, taxonomy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MiningDataPackage.CATEGORICAL_ATTRIBUTE_PROPERTIES__CATEGORY:
				return ((InternalEList<?>)getCategory()).basicRemove(otherEnd, msgs);
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
			case MiningDataPackage.CATEGORICAL_ATTRIBUTE_PROPERTIES__CATEGORY:
				return getCategory();
			case MiningDataPackage.CATEGORICAL_ATTRIBUTE_PROPERTIES__TAXONOMY:
				if (resolve) return getTaxonomy();
				return basicGetTaxonomy();
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
			case MiningDataPackage.CATEGORICAL_ATTRIBUTE_PROPERTIES__CATEGORY:
				getCategory().clear();
				getCategory().addAll((Collection<? extends Category>)newValue);
				return;
			case MiningDataPackage.CATEGORICAL_ATTRIBUTE_PROPERTIES__TAXONOMY:
				setTaxonomy((CategoryTaxonomy)newValue);
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
			case MiningDataPackage.CATEGORICAL_ATTRIBUTE_PROPERTIES__CATEGORY:
				getCategory().clear();
				return;
			case MiningDataPackage.CATEGORICAL_ATTRIBUTE_PROPERTIES__TAXONOMY:
				setTaxonomy((CategoryTaxonomy)null);
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
			case MiningDataPackage.CATEGORICAL_ATTRIBUTE_PROPERTIES__CATEGORY:
				return category != null && !category.isEmpty();
			case MiningDataPackage.CATEGORICAL_ATTRIBUTE_PROPERTIES__TAXONOMY:
				return taxonomy != null;
		}
		return super.eIsSet(featureID);
	}

} //CategoricalAttributePropertiesImpl

/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningData.impl;

import CWM.Core.impl.ModelElementImpl;

import CWM.MiningCore.MiningData.Category;
import CWM.MiningCore.MiningData.CategoryMap;
import CWM.MiningCore.MiningData.CategoryTaxonomy;
import CWM.MiningCore.MiningData.MiningDataPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Category Taxonomy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.MiningCore.MiningData.impl.CategoryTaxonomyImpl#getCategoryMap <em>Category Map</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.impl.CategoryTaxonomyImpl#getRootCategory <em>Root Category</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CategoryTaxonomyImpl extends ModelElementImpl implements CategoryTaxonomy {
	/**
	 * The cached value of the '{@link #getCategoryMap() <em>Category Map</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoryMap()
	 * @generated
	 * @ordered
	 */
	protected EList<CategoryMap> categoryMap;

	/**
	 * The cached value of the '{@link #getRootCategory() <em>Root Category</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootCategory()
	 * @generated
	 * @ordered
	 */
	protected EList<Category> rootCategory;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CategoryTaxonomyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MiningDataPackage.Literals.CATEGORY_TAXONOMY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CategoryMap> getCategoryMap() {
		if (categoryMap == null) {
			categoryMap = new EObjectContainmentEList<CategoryMap>(CategoryMap.class, this, MiningDataPackage.CATEGORY_TAXONOMY__CATEGORY_MAP);
		}
		return categoryMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Category> getRootCategory() {
		if (rootCategory == null) {
			rootCategory = new EObjectResolvingEList<Category>(Category.class, this, MiningDataPackage.CATEGORY_TAXONOMY__ROOT_CATEGORY);
		}
		return rootCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MiningDataPackage.CATEGORY_TAXONOMY__CATEGORY_MAP:
				return ((InternalEList<?>)getCategoryMap()).basicRemove(otherEnd, msgs);
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
			case MiningDataPackage.CATEGORY_TAXONOMY__CATEGORY_MAP:
				return getCategoryMap();
			case MiningDataPackage.CATEGORY_TAXONOMY__ROOT_CATEGORY:
				return getRootCategory();
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
			case MiningDataPackage.CATEGORY_TAXONOMY__CATEGORY_MAP:
				getCategoryMap().clear();
				getCategoryMap().addAll((Collection<? extends CategoryMap>)newValue);
				return;
			case MiningDataPackage.CATEGORY_TAXONOMY__ROOT_CATEGORY:
				getRootCategory().clear();
				getRootCategory().addAll((Collection<? extends Category>)newValue);
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
			case MiningDataPackage.CATEGORY_TAXONOMY__CATEGORY_MAP:
				getCategoryMap().clear();
				return;
			case MiningDataPackage.CATEGORY_TAXONOMY__ROOT_CATEGORY:
				getRootCategory().clear();
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
			case MiningDataPackage.CATEGORY_TAXONOMY__CATEGORY_MAP:
				return categoryMap != null && !categoryMap.isEmpty();
			case MiningDataPackage.CATEGORY_TAXONOMY__ROOT_CATEGORY:
				return rootCategory != null && !rootCategory.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CategoryTaxonomyImpl

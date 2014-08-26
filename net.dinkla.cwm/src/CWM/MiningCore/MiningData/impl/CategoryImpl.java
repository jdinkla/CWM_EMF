/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningData.impl;

import CWM.Core.impl.ModelElementImpl;

import CWM.MiningCore.MiningData.Category;
import CWM.MiningCore.MiningData.CategoryProperty;
import CWM.MiningCore.MiningData.MiningDataPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.MiningCore.MiningData.impl.CategoryImpl#getValue <em>Value</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.impl.CategoryImpl#getIsNullCategory <em>Is Null Category</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.impl.CategoryImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.impl.CategoryImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.impl.CategoryImpl#getPrior <em>Prior</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CategoryImpl extends ModelElementImpl implements Category {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final Object VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Object value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsNullCategory() <em>Is Null Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsNullCategory()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_NULL_CATEGORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsNullCategory() <em>Is Null Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsNullCategory()
	 * @generated
	 * @ordered
	 */
	protected Boolean isNullCategory = IS_NULL_CATEGORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected String displayName = DISPLAY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getProperty() <em>Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected static final CategoryProperty PROPERTY_EDEFAULT = CategoryProperty.VALID;

	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected CategoryProperty property = PROPERTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrior() <em>Prior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrior()
	 * @generated
	 * @ordered
	 */
	protected static final Double PRIOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrior() <em>Prior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrior()
	 * @generated
	 * @ordered
	 */
	protected Double prior = PRIOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CategoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MiningDataPackage.Literals.CATEGORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Object newValue) {
		Object oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiningDataPackage.CATEGORY__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsNullCategory() {
		return isNullCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsNullCategory(Boolean newIsNullCategory) {
		Boolean oldIsNullCategory = isNullCategory;
		isNullCategory = newIsNullCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiningDataPackage.CATEGORY__IS_NULL_CATEGORY, oldIsNullCategory, isNullCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayName(String newDisplayName) {
		String oldDisplayName = displayName;
		displayName = newDisplayName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiningDataPackage.CATEGORY__DISPLAY_NAME, oldDisplayName, displayName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategoryProperty getProperty() {
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperty(CategoryProperty newProperty) {
		CategoryProperty oldProperty = property;
		property = newProperty == null ? PROPERTY_EDEFAULT : newProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiningDataPackage.CATEGORY__PROPERTY, oldProperty, property));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getPrior() {
		return prior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrior(Double newPrior) {
		Double oldPrior = prior;
		prior = newPrior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiningDataPackage.CATEGORY__PRIOR, oldPrior, prior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MiningDataPackage.CATEGORY__VALUE:
				return getValue();
			case MiningDataPackage.CATEGORY__IS_NULL_CATEGORY:
				return getIsNullCategory();
			case MiningDataPackage.CATEGORY__DISPLAY_NAME:
				return getDisplayName();
			case MiningDataPackage.CATEGORY__PROPERTY:
				return getProperty();
			case MiningDataPackage.CATEGORY__PRIOR:
				return getPrior();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MiningDataPackage.CATEGORY__VALUE:
				setValue(newValue);
				return;
			case MiningDataPackage.CATEGORY__IS_NULL_CATEGORY:
				setIsNullCategory((Boolean)newValue);
				return;
			case MiningDataPackage.CATEGORY__DISPLAY_NAME:
				setDisplayName((String)newValue);
				return;
			case MiningDataPackage.CATEGORY__PROPERTY:
				setProperty((CategoryProperty)newValue);
				return;
			case MiningDataPackage.CATEGORY__PRIOR:
				setPrior((Double)newValue);
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
			case MiningDataPackage.CATEGORY__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case MiningDataPackage.CATEGORY__IS_NULL_CATEGORY:
				setIsNullCategory(IS_NULL_CATEGORY_EDEFAULT);
				return;
			case MiningDataPackage.CATEGORY__DISPLAY_NAME:
				setDisplayName(DISPLAY_NAME_EDEFAULT);
				return;
			case MiningDataPackage.CATEGORY__PROPERTY:
				setProperty(PROPERTY_EDEFAULT);
				return;
			case MiningDataPackage.CATEGORY__PRIOR:
				setPrior(PRIOR_EDEFAULT);
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
			case MiningDataPackage.CATEGORY__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case MiningDataPackage.CATEGORY__IS_NULL_CATEGORY:
				return IS_NULL_CATEGORY_EDEFAULT == null ? isNullCategory != null : !IS_NULL_CATEGORY_EDEFAULT.equals(isNullCategory);
			case MiningDataPackage.CATEGORY__DISPLAY_NAME:
				return DISPLAY_NAME_EDEFAULT == null ? displayName != null : !DISPLAY_NAME_EDEFAULT.equals(displayName);
			case MiningDataPackage.CATEGORY__PROPERTY:
				return property != PROPERTY_EDEFAULT;
			case MiningDataPackage.CATEGORY__PRIOR:
				return PRIOR_EDEFAULT == null ? prior != null : !PRIOR_EDEFAULT.equals(prior);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (value: ");
		result.append(value);
		result.append(", isNullCategory: ");
		result.append(isNullCategory);
		result.append(", displayName: ");
		result.append(displayName);
		result.append(", property: ");
		result.append(property);
		result.append(", prior: ");
		result.append(prior);
		result.append(')');
		return result.toString();
	}

} //CategoryImpl

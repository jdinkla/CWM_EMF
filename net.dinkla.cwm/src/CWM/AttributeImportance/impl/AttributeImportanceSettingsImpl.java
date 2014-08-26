/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.AttributeImportance.impl;

import CWM.AttributeImportance.AttributeImportancePackage;
import CWM.AttributeImportance.AttributeImportanceSettings;

import CWM.Supervised.impl.SupervisedFunctionSettingsImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.AttributeImportance.impl.AttributeImportanceSettingsImpl#getMaximumResultSize <em>Maximum Result Size</em>}</li>
 *   <li>{@link CWM.AttributeImportance.impl.AttributeImportanceSettingsImpl#getReturnTop <em>Return Top</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeImportanceSettingsImpl extends SupervisedFunctionSettingsImpl implements AttributeImportanceSettings {
	/**
	 * The default value of the '{@link #getMaximumResultSize() <em>Maximum Result Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumResultSize()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAXIMUM_RESULT_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaximumResultSize() <em>Maximum Result Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumResultSize()
	 * @generated
	 * @ordered
	 */
	protected Integer maximumResultSize = MAXIMUM_RESULT_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getReturnTop() <em>Return Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnTop()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean RETURN_TOP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReturnTop() <em>Return Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnTop()
	 * @generated
	 * @ordered
	 */
	protected Boolean returnTop = RETURN_TOP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeImportanceSettingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AttributeImportancePackage.Literals.ATTRIBUTE_IMPORTANCE_SETTINGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMaximumResultSize() {
		return maximumResultSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumResultSize(Integer newMaximumResultSize) {
		Integer oldMaximumResultSize = maximumResultSize;
		maximumResultSize = newMaximumResultSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AttributeImportancePackage.ATTRIBUTE_IMPORTANCE_SETTINGS__MAXIMUM_RESULT_SIZE, oldMaximumResultSize, maximumResultSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getReturnTop() {
		return returnTop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnTop(Boolean newReturnTop) {
		Boolean oldReturnTop = returnTop;
		returnTop = newReturnTop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AttributeImportancePackage.ATTRIBUTE_IMPORTANCE_SETTINGS__RETURN_TOP, oldReturnTop, returnTop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AttributeImportancePackage.ATTRIBUTE_IMPORTANCE_SETTINGS__MAXIMUM_RESULT_SIZE:
				return getMaximumResultSize();
			case AttributeImportancePackage.ATTRIBUTE_IMPORTANCE_SETTINGS__RETURN_TOP:
				return getReturnTop();
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
			case AttributeImportancePackage.ATTRIBUTE_IMPORTANCE_SETTINGS__MAXIMUM_RESULT_SIZE:
				setMaximumResultSize((Integer)newValue);
				return;
			case AttributeImportancePackage.ATTRIBUTE_IMPORTANCE_SETTINGS__RETURN_TOP:
				setReturnTop((Boolean)newValue);
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
			case AttributeImportancePackage.ATTRIBUTE_IMPORTANCE_SETTINGS__MAXIMUM_RESULT_SIZE:
				setMaximumResultSize(MAXIMUM_RESULT_SIZE_EDEFAULT);
				return;
			case AttributeImportancePackage.ATTRIBUTE_IMPORTANCE_SETTINGS__RETURN_TOP:
				setReturnTop(RETURN_TOP_EDEFAULT);
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
			case AttributeImportancePackage.ATTRIBUTE_IMPORTANCE_SETTINGS__MAXIMUM_RESULT_SIZE:
				return MAXIMUM_RESULT_SIZE_EDEFAULT == null ? maximumResultSize != null : !MAXIMUM_RESULT_SIZE_EDEFAULT.equals(maximumResultSize);
			case AttributeImportancePackage.ATTRIBUTE_IMPORTANCE_SETTINGS__RETURN_TOP:
				return RETURN_TOP_EDEFAULT == null ? returnTop != null : !RETURN_TOP_EDEFAULT.equals(returnTop);
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
		result.append(" (maximumResultSize: ");
		result.append(maximumResultSize);
		result.append(", returnTop: ");
		result.append(returnTop);
		result.append(')');
		return result.toString();
	}

} //AttributeImportanceSettingsImpl

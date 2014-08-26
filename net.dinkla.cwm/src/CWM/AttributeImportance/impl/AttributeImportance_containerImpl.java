/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.AttributeImportance.impl;

import CWM.AttributeImportance.AttributeImportancePackage;
import CWM.AttributeImportance.AttributeImportanceSettings;
import CWM.AttributeImportance.AttributeImportance_container;

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
 * An implementation of the model object '<em><b>Attribute Importance container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.AttributeImportance.impl.AttributeImportance_containerImpl#getAttributeImportanceSettings <em>Attribute Importance Settings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeImportance_containerImpl extends EObjectImpl implements AttributeImportance_container {
	/**
	 * The cached value of the '{@link #getAttributeImportanceSettings() <em>Attribute Importance Settings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeImportanceSettings()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeImportanceSettings> attributeImportanceSettings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeImportance_containerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AttributeImportancePackage.Literals.ATTRIBUTE_IMPORTANCE_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeImportanceSettings> getAttributeImportanceSettings() {
		if (attributeImportanceSettings == null) {
			attributeImportanceSettings = new EObjectContainmentEList<AttributeImportanceSettings>(AttributeImportanceSettings.class, this, AttributeImportancePackage.ATTRIBUTE_IMPORTANCE_CONTAINER__ATTRIBUTE_IMPORTANCE_SETTINGS);
		}
		return attributeImportanceSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AttributeImportancePackage.ATTRIBUTE_IMPORTANCE_CONTAINER__ATTRIBUTE_IMPORTANCE_SETTINGS:
				return ((InternalEList<?>)getAttributeImportanceSettings()).basicRemove(otherEnd, msgs);
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
			case AttributeImportancePackage.ATTRIBUTE_IMPORTANCE_CONTAINER__ATTRIBUTE_IMPORTANCE_SETTINGS:
				return getAttributeImportanceSettings();
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
			case AttributeImportancePackage.ATTRIBUTE_IMPORTANCE_CONTAINER__ATTRIBUTE_IMPORTANCE_SETTINGS:
				getAttributeImportanceSettings().clear();
				getAttributeImportanceSettings().addAll((Collection<? extends AttributeImportanceSettings>)newValue);
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
			case AttributeImportancePackage.ATTRIBUTE_IMPORTANCE_CONTAINER__ATTRIBUTE_IMPORTANCE_SETTINGS:
				getAttributeImportanceSettings().clear();
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
			case AttributeImportancePackage.ATTRIBUTE_IMPORTANCE_CONTAINER__ATTRIBUTE_IMPORTANCE_SETTINGS:
				return attributeImportanceSettings != null && !attributeImportanceSettings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AttributeImportance_containerImpl

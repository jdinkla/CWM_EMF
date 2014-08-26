/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.TypeMapping.impl;

import CWM.TypeMapping.TypeMapping;
import CWM.TypeMapping.TypeMappingPackage;
import CWM.TypeMapping.TypeMapping_container;
import CWM.TypeMapping.TypeSystem;

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
 * An implementation of the model object '<em><b>Type Mapping container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.TypeMapping.impl.TypeMapping_containerImpl#getTypeMapping <em>Type Mapping</em>}</li>
 *   <li>{@link CWM.TypeMapping.impl.TypeMapping_containerImpl#getTypeSystem <em>Type System</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeMapping_containerImpl extends EObjectImpl implements TypeMapping_container {
	/**
	 * The cached value of the '{@link #getTypeMapping() <em>Type Mapping</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeMapping()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeMapping> typeMapping;

	/**
	 * The cached value of the '{@link #getTypeSystem() <em>Type System</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeSystem()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeSystem> typeSystem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeMapping_containerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypeMappingPackage.Literals.TYPE_MAPPING_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeMapping> getTypeMapping() {
		if (typeMapping == null) {
			typeMapping = new EObjectContainmentEList<TypeMapping>(TypeMapping.class, this, TypeMappingPackage.TYPE_MAPPING_CONTAINER__TYPE_MAPPING);
		}
		return typeMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeSystem> getTypeSystem() {
		if (typeSystem == null) {
			typeSystem = new EObjectContainmentEList<TypeSystem>(TypeSystem.class, this, TypeMappingPackage.TYPE_MAPPING_CONTAINER__TYPE_SYSTEM);
		}
		return typeSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypeMappingPackage.TYPE_MAPPING_CONTAINER__TYPE_MAPPING:
				return ((InternalEList<?>)getTypeMapping()).basicRemove(otherEnd, msgs);
			case TypeMappingPackage.TYPE_MAPPING_CONTAINER__TYPE_SYSTEM:
				return ((InternalEList<?>)getTypeSystem()).basicRemove(otherEnd, msgs);
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
			case TypeMappingPackage.TYPE_MAPPING_CONTAINER__TYPE_MAPPING:
				return getTypeMapping();
			case TypeMappingPackage.TYPE_MAPPING_CONTAINER__TYPE_SYSTEM:
				return getTypeSystem();
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
			case TypeMappingPackage.TYPE_MAPPING_CONTAINER__TYPE_MAPPING:
				getTypeMapping().clear();
				getTypeMapping().addAll((Collection<? extends TypeMapping>)newValue);
				return;
			case TypeMappingPackage.TYPE_MAPPING_CONTAINER__TYPE_SYSTEM:
				getTypeSystem().clear();
				getTypeSystem().addAll((Collection<? extends TypeSystem>)newValue);
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
			case TypeMappingPackage.TYPE_MAPPING_CONTAINER__TYPE_MAPPING:
				getTypeMapping().clear();
				return;
			case TypeMappingPackage.TYPE_MAPPING_CONTAINER__TYPE_SYSTEM:
				getTypeSystem().clear();
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
			case TypeMappingPackage.TYPE_MAPPING_CONTAINER__TYPE_MAPPING:
				return typeMapping != null && !typeMapping.isEmpty();
			case TypeMappingPackage.TYPE_MAPPING_CONTAINER__TYPE_SYSTEM:
				return typeSystem != null && !typeSystem.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TypeMapping_containerImpl

/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.EntryPoint.impl;

import CWM.MiningCore.EntryPoint.AuxiliaryObject;
import CWM.MiningCore.EntryPoint.Catalog;
import CWM.MiningCore.EntryPoint.EntryPointPackage;
import CWM.MiningCore.EntryPoint.EntryPoint_container;
import CWM.MiningCore.EntryPoint.Schema;

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
 * An implementation of the model object '<em><b>Entry Point container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.MiningCore.EntryPoint.impl.EntryPoint_containerImpl#getAuxiliaryObject <em>Auxiliary Object</em>}</li>
 *   <li>{@link CWM.MiningCore.EntryPoint.impl.EntryPoint_containerImpl#getCatalog <em>Catalog</em>}</li>
 *   <li>{@link CWM.MiningCore.EntryPoint.impl.EntryPoint_containerImpl#getSchema <em>Schema</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntryPoint_containerImpl extends EObjectImpl implements EntryPoint_container {
	/**
	 * The cached value of the '{@link #getAuxiliaryObject() <em>Auxiliary Object</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuxiliaryObject()
	 * @generated
	 * @ordered
	 */
	protected EList<AuxiliaryObject> auxiliaryObject;

	/**
	 * The cached value of the '{@link #getCatalog() <em>Catalog</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatalog()
	 * @generated
	 * @ordered
	 */
	protected EList<Catalog> catalog;

	/**
	 * The cached value of the '{@link #getSchema() <em>Schema</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchema()
	 * @generated
	 * @ordered
	 */
	protected EList<Schema> schema;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntryPoint_containerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntryPointPackage.Literals.ENTRY_POINT_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AuxiliaryObject> getAuxiliaryObject() {
		if (auxiliaryObject == null) {
			auxiliaryObject = new EObjectContainmentEList<AuxiliaryObject>(AuxiliaryObject.class, this, EntryPointPackage.ENTRY_POINT_CONTAINER__AUXILIARY_OBJECT);
		}
		return auxiliaryObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Catalog> getCatalog() {
		if (catalog == null) {
			catalog = new EObjectContainmentEList<Catalog>(Catalog.class, this, EntryPointPackage.ENTRY_POINT_CONTAINER__CATALOG);
		}
		return catalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Schema> getSchema() {
		if (schema == null) {
			schema = new EObjectContainmentEList<Schema>(Schema.class, this, EntryPointPackage.ENTRY_POINT_CONTAINER__SCHEMA);
		}
		return schema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EntryPointPackage.ENTRY_POINT_CONTAINER__AUXILIARY_OBJECT:
				return ((InternalEList<?>)getAuxiliaryObject()).basicRemove(otherEnd, msgs);
			case EntryPointPackage.ENTRY_POINT_CONTAINER__CATALOG:
				return ((InternalEList<?>)getCatalog()).basicRemove(otherEnd, msgs);
			case EntryPointPackage.ENTRY_POINT_CONTAINER__SCHEMA:
				return ((InternalEList<?>)getSchema()).basicRemove(otherEnd, msgs);
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
			case EntryPointPackage.ENTRY_POINT_CONTAINER__AUXILIARY_OBJECT:
				return getAuxiliaryObject();
			case EntryPointPackage.ENTRY_POINT_CONTAINER__CATALOG:
				return getCatalog();
			case EntryPointPackage.ENTRY_POINT_CONTAINER__SCHEMA:
				return getSchema();
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
			case EntryPointPackage.ENTRY_POINT_CONTAINER__AUXILIARY_OBJECT:
				getAuxiliaryObject().clear();
				getAuxiliaryObject().addAll((Collection<? extends AuxiliaryObject>)newValue);
				return;
			case EntryPointPackage.ENTRY_POINT_CONTAINER__CATALOG:
				getCatalog().clear();
				getCatalog().addAll((Collection<? extends Catalog>)newValue);
				return;
			case EntryPointPackage.ENTRY_POINT_CONTAINER__SCHEMA:
				getSchema().clear();
				getSchema().addAll((Collection<? extends Schema>)newValue);
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
			case EntryPointPackage.ENTRY_POINT_CONTAINER__AUXILIARY_OBJECT:
				getAuxiliaryObject().clear();
				return;
			case EntryPointPackage.ENTRY_POINT_CONTAINER__CATALOG:
				getCatalog().clear();
				return;
			case EntryPointPackage.ENTRY_POINT_CONTAINER__SCHEMA:
				getSchema().clear();
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
			case EntryPointPackage.ENTRY_POINT_CONTAINER__AUXILIARY_OBJECT:
				return auxiliaryObject != null && !auxiliaryObject.isEmpty();
			case EntryPointPackage.ENTRY_POINT_CONTAINER__CATALOG:
				return catalog != null && !catalog.isEmpty();
			case EntryPointPackage.ENTRY_POINT_CONTAINER__SCHEMA:
				return schema != null && !schema.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EntryPoint_containerImpl

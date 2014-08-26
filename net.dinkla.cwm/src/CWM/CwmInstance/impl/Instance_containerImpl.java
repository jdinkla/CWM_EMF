/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.CwmInstance.impl;

import CWM.CwmInstance.CwmInstancePackage;
import CWM.CwmInstance.DataSlot;
import CWM.CwmInstance.DataValue;
import CWM.CwmInstance.Extent;
import CWM.CwmInstance.Instance;
import CWM.CwmInstance.Instance_container;
import CWM.CwmInstance.Slot;

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
 * An implementation of the model object '<em><b>Instance container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.CwmInstance.impl.Instance_containerImpl#getDataSlot <em>Data Slot</em>}</li>
 *   <li>{@link CWM.CwmInstance.impl.Instance_containerImpl#getDataValue <em>Data Value</em>}</li>
 *   <li>{@link CWM.CwmInstance.impl.Instance_containerImpl#getExtent <em>Extent</em>}</li>
 *   <li>{@link CWM.CwmInstance.impl.Instance_containerImpl#getInstance <em>Instance</em>}</li>
 *   <li>{@link CWM.CwmInstance.impl.Instance_containerImpl#getObject <em>Object</em>}</li>
 *   <li>{@link CWM.CwmInstance.impl.Instance_containerImpl#getSlot <em>Slot</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Instance_containerImpl extends EObjectImpl implements Instance_container {
	/**
	 * The cached value of the '{@link #getDataSlot() <em>Data Slot</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSlot()
	 * @generated
	 * @ordered
	 */
	protected EList<DataSlot> dataSlot;

	/**
	 * The cached value of the '{@link #getDataValue() <em>Data Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataValue()
	 * @generated
	 * @ordered
	 */
	protected EList<DataValue> dataValue;

	/**
	 * The cached value of the '{@link #getExtent() <em>Extent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtent()
	 * @generated
	 * @ordered
	 */
	protected EList<Extent> extent;

	/**
	 * The cached value of the '{@link #getInstance() <em>Instance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstance()
	 * @generated
	 * @ordered
	 */
	protected EList<Instance> instance;

	/**
	 * The cached value of the '{@link #getObject() <em>Object</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected EList<CWM.CwmInstance.Object> object;

	/**
	 * The cached value of the '{@link #getSlot() <em>Slot</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlot()
	 * @generated
	 * @ordered
	 */
	protected EList<Slot> slot;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Instance_containerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CwmInstancePackage.Literals.INSTANCE_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataSlot> getDataSlot() {
		if (dataSlot == null) {
			dataSlot = new EObjectContainmentEList<DataSlot>(DataSlot.class, this, CwmInstancePackage.INSTANCE_CONTAINER__DATA_SLOT);
		}
		return dataSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataValue> getDataValue() {
		if (dataValue == null) {
			dataValue = new EObjectContainmentEList<DataValue>(DataValue.class, this, CwmInstancePackage.INSTANCE_CONTAINER__DATA_VALUE);
		}
		return dataValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Extent> getExtent() {
		if (extent == null) {
			extent = new EObjectContainmentEList<Extent>(Extent.class, this, CwmInstancePackage.INSTANCE_CONTAINER__EXTENT);
		}
		return extent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Instance> getInstance() {
		if (instance == null) {
			instance = new EObjectContainmentEList<Instance>(Instance.class, this, CwmInstancePackage.INSTANCE_CONTAINER__INSTANCE);
		}
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CWM.CwmInstance.Object> getObject() {
		if (object == null) {
			object = new EObjectContainmentEList<CWM.CwmInstance.Object>(CWM.CwmInstance.Object.class, this, CwmInstancePackage.INSTANCE_CONTAINER__OBJECT);
		}
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Slot> getSlot() {
		if (slot == null) {
			slot = new EObjectContainmentEList<Slot>(Slot.class, this, CwmInstancePackage.INSTANCE_CONTAINER__SLOT);
		}
		return slot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CwmInstancePackage.INSTANCE_CONTAINER__DATA_SLOT:
				return ((InternalEList<?>)getDataSlot()).basicRemove(otherEnd, msgs);
			case CwmInstancePackage.INSTANCE_CONTAINER__DATA_VALUE:
				return ((InternalEList<?>)getDataValue()).basicRemove(otherEnd, msgs);
			case CwmInstancePackage.INSTANCE_CONTAINER__EXTENT:
				return ((InternalEList<?>)getExtent()).basicRemove(otherEnd, msgs);
			case CwmInstancePackage.INSTANCE_CONTAINER__INSTANCE:
				return ((InternalEList<?>)getInstance()).basicRemove(otherEnd, msgs);
			case CwmInstancePackage.INSTANCE_CONTAINER__OBJECT:
				return ((InternalEList<?>)getObject()).basicRemove(otherEnd, msgs);
			case CwmInstancePackage.INSTANCE_CONTAINER__SLOT:
				return ((InternalEList<?>)getSlot()).basicRemove(otherEnd, msgs);
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
			case CwmInstancePackage.INSTANCE_CONTAINER__DATA_SLOT:
				return getDataSlot();
			case CwmInstancePackage.INSTANCE_CONTAINER__DATA_VALUE:
				return getDataValue();
			case CwmInstancePackage.INSTANCE_CONTAINER__EXTENT:
				return getExtent();
			case CwmInstancePackage.INSTANCE_CONTAINER__INSTANCE:
				return getInstance();
			case CwmInstancePackage.INSTANCE_CONTAINER__OBJECT:
				return getObject();
			case CwmInstancePackage.INSTANCE_CONTAINER__SLOT:
				return getSlot();
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
			case CwmInstancePackage.INSTANCE_CONTAINER__DATA_SLOT:
				getDataSlot().clear();
				getDataSlot().addAll((Collection<? extends DataSlot>)newValue);
				return;
			case CwmInstancePackage.INSTANCE_CONTAINER__DATA_VALUE:
				getDataValue().clear();
				getDataValue().addAll((Collection<? extends DataValue>)newValue);
				return;
			case CwmInstancePackage.INSTANCE_CONTAINER__EXTENT:
				getExtent().clear();
				getExtent().addAll((Collection<? extends Extent>)newValue);
				return;
			case CwmInstancePackage.INSTANCE_CONTAINER__INSTANCE:
				getInstance().clear();
				getInstance().addAll((Collection<? extends Instance>)newValue);
				return;
			case CwmInstancePackage.INSTANCE_CONTAINER__OBJECT:
				getObject().clear();
				getObject().addAll((Collection<? extends CWM.CwmInstance.Object>)newValue);
				return;
			case CwmInstancePackage.INSTANCE_CONTAINER__SLOT:
				getSlot().clear();
				getSlot().addAll((Collection<? extends Slot>)newValue);
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
			case CwmInstancePackage.INSTANCE_CONTAINER__DATA_SLOT:
				getDataSlot().clear();
				return;
			case CwmInstancePackage.INSTANCE_CONTAINER__DATA_VALUE:
				getDataValue().clear();
				return;
			case CwmInstancePackage.INSTANCE_CONTAINER__EXTENT:
				getExtent().clear();
				return;
			case CwmInstancePackage.INSTANCE_CONTAINER__INSTANCE:
				getInstance().clear();
				return;
			case CwmInstancePackage.INSTANCE_CONTAINER__OBJECT:
				getObject().clear();
				return;
			case CwmInstancePackage.INSTANCE_CONTAINER__SLOT:
				getSlot().clear();
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
			case CwmInstancePackage.INSTANCE_CONTAINER__DATA_SLOT:
				return dataSlot != null && !dataSlot.isEmpty();
			case CwmInstancePackage.INSTANCE_CONTAINER__DATA_VALUE:
				return dataValue != null && !dataValue.isEmpty();
			case CwmInstancePackage.INSTANCE_CONTAINER__EXTENT:
				return extent != null && !extent.isEmpty();
			case CwmInstancePackage.INSTANCE_CONTAINER__INSTANCE:
				return instance != null && !instance.isEmpty();
			case CwmInstancePackage.INSTANCE_CONTAINER__OBJECT:
				return object != null && !object.isEmpty();
			case CwmInstancePackage.INSTANCE_CONTAINER__SLOT:
				return slot != null && !slot.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Instance_containerImpl

/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningData.impl;

import CWM.MiningCore.MiningData.MiningDataPackage;
import CWM.MiningCore.MiningData.OrderType;
import CWM.MiningCore.MiningData.OrdinalAttributeProperties;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ordinal Attribute Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.MiningCore.MiningData.impl.OrdinalAttributePropertiesImpl#getOrderType <em>Order Type</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.impl.OrdinalAttributePropertiesImpl#getIsCyclic <em>Is Cyclic</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrdinalAttributePropertiesImpl extends CategoricalAttributePropertiesImpl implements OrdinalAttributeProperties {
	/**
	 * The default value of the '{@link #getOrderType() <em>Order Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderType()
	 * @generated
	 * @ordered
	 */
	protected static final OrderType ORDER_TYPE_EDEFAULT = OrderType.AS_IS;

	/**
	 * The cached value of the '{@link #getOrderType() <em>Order Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderType()
	 * @generated
	 * @ordered
	 */
	protected OrderType orderType = ORDER_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsCyclic() <em>Is Cyclic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsCyclic()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_CYCLIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsCyclic() <em>Is Cyclic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsCyclic()
	 * @generated
	 * @ordered
	 */
	protected Boolean isCyclic = IS_CYCLIC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrdinalAttributePropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MiningDataPackage.Literals.ORDINAL_ATTRIBUTE_PROPERTIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderType getOrderType() {
		return orderType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrderType(OrderType newOrderType) {
		OrderType oldOrderType = orderType;
		orderType = newOrderType == null ? ORDER_TYPE_EDEFAULT : newOrderType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiningDataPackage.ORDINAL_ATTRIBUTE_PROPERTIES__ORDER_TYPE, oldOrderType, orderType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsCyclic() {
		return isCyclic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCyclic(Boolean newIsCyclic) {
		Boolean oldIsCyclic = isCyclic;
		isCyclic = newIsCyclic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiningDataPackage.ORDINAL_ATTRIBUTE_PROPERTIES__IS_CYCLIC, oldIsCyclic, isCyclic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MiningDataPackage.ORDINAL_ATTRIBUTE_PROPERTIES__ORDER_TYPE:
				return getOrderType();
			case MiningDataPackage.ORDINAL_ATTRIBUTE_PROPERTIES__IS_CYCLIC:
				return getIsCyclic();
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
			case MiningDataPackage.ORDINAL_ATTRIBUTE_PROPERTIES__ORDER_TYPE:
				setOrderType((OrderType)newValue);
				return;
			case MiningDataPackage.ORDINAL_ATTRIBUTE_PROPERTIES__IS_CYCLIC:
				setIsCyclic((Boolean)newValue);
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
			case MiningDataPackage.ORDINAL_ATTRIBUTE_PROPERTIES__ORDER_TYPE:
				setOrderType(ORDER_TYPE_EDEFAULT);
				return;
			case MiningDataPackage.ORDINAL_ATTRIBUTE_PROPERTIES__IS_CYCLIC:
				setIsCyclic(IS_CYCLIC_EDEFAULT);
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
			case MiningDataPackage.ORDINAL_ATTRIBUTE_PROPERTIES__ORDER_TYPE:
				return orderType != ORDER_TYPE_EDEFAULT;
			case MiningDataPackage.ORDINAL_ATTRIBUTE_PROPERTIES__IS_CYCLIC:
				return IS_CYCLIC_EDEFAULT == null ? isCyclic != null : !IS_CYCLIC_EDEFAULT.equals(isCyclic);
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
		result.append(" (orderType: ");
		result.append(orderType);
		result.append(", isCyclic: ");
		result.append(isCyclic);
		result.append(')');
		return result.toString();
	}

} //OrdinalAttributePropertiesImpl

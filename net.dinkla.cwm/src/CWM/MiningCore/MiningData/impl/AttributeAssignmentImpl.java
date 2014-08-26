/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningData.impl;

import CWM.Core.Attribute;

import CWM.Core.impl.ModelElementImpl;

import CWM.MiningCore.MiningData.AttributeAssignment;
import CWM.MiningCore.MiningData.MiningAttribute;
import CWM.MiningCore.MiningData.MiningDataPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.MiningCore.MiningData.impl.AttributeAssignmentImpl#getOrderIdAttribute <em>Order Id Attribute</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.impl.AttributeAssignmentImpl#getLogicalAttribute <em>Logical Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeAssignmentImpl extends ModelElementImpl implements AttributeAssignment {
	/**
	 * The cached value of the '{@link #getOrderIdAttribute() <em>Order Id Attribute</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderIdAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> orderIdAttribute;

	/**
	 * The cached value of the '{@link #getLogicalAttribute() <em>Logical Attribute</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<MiningAttribute> logicalAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeAssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MiningDataPackage.Literals.ATTRIBUTE_ASSIGNMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getOrderIdAttribute() {
		if (orderIdAttribute == null) {
			orderIdAttribute = new EObjectResolvingEList<Attribute>(Attribute.class, this, MiningDataPackage.ATTRIBUTE_ASSIGNMENT__ORDER_ID_ATTRIBUTE);
		}
		return orderIdAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MiningAttribute> getLogicalAttribute() {
		if (logicalAttribute == null) {
			logicalAttribute = new EObjectResolvingEList<MiningAttribute>(MiningAttribute.class, this, MiningDataPackage.ATTRIBUTE_ASSIGNMENT__LOGICAL_ATTRIBUTE);
		}
		return logicalAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MiningDataPackage.ATTRIBUTE_ASSIGNMENT__ORDER_ID_ATTRIBUTE:
				return getOrderIdAttribute();
			case MiningDataPackage.ATTRIBUTE_ASSIGNMENT__LOGICAL_ATTRIBUTE:
				return getLogicalAttribute();
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
			case MiningDataPackage.ATTRIBUTE_ASSIGNMENT__ORDER_ID_ATTRIBUTE:
				getOrderIdAttribute().clear();
				getOrderIdAttribute().addAll((Collection<? extends Attribute>)newValue);
				return;
			case MiningDataPackage.ATTRIBUTE_ASSIGNMENT__LOGICAL_ATTRIBUTE:
				getLogicalAttribute().clear();
				getLogicalAttribute().addAll((Collection<? extends MiningAttribute>)newValue);
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
			case MiningDataPackage.ATTRIBUTE_ASSIGNMENT__ORDER_ID_ATTRIBUTE:
				getOrderIdAttribute().clear();
				return;
			case MiningDataPackage.ATTRIBUTE_ASSIGNMENT__LOGICAL_ATTRIBUTE:
				getLogicalAttribute().clear();
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
			case MiningDataPackage.ATTRIBUTE_ASSIGNMENT__ORDER_ID_ATTRIBUTE:
				return orderIdAttribute != null && !orderIdAttribute.isEmpty();
			case MiningDataPackage.ATTRIBUTE_ASSIGNMENT__LOGICAL_ATTRIBUTE:
				return logicalAttribute != null && !logicalAttribute.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AttributeAssignmentImpl

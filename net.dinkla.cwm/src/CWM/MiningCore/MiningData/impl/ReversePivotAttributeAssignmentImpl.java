/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningData.impl;

import CWM.Core.Attribute;

import CWM.MiningCore.MiningData.AttributeSelectionFunction;
import CWM.MiningCore.MiningData.MiningDataPackage;
import CWM.MiningCore.MiningData.ReversePivotAttributeAssignment;
import CWM.MiningCore.MiningData.ValueSelectionFunction;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reverse Pivot Attribute Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.MiningCore.MiningData.impl.ReversePivotAttributeAssignmentImpl#getSelectorAttribute <em>Selector Attribute</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.impl.ReversePivotAttributeAssignmentImpl#getAttributeSelectionFunction <em>Attribute Selection Function</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.impl.ReversePivotAttributeAssignmentImpl#getValueSelectionFunction <em>Value Selection Function</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReversePivotAttributeAssignmentImpl extends AttributeAssignmentImpl implements ReversePivotAttributeAssignment {
	/**
	 * The cached value of the '{@link #getSelectorAttribute() <em>Selector Attribute</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectorAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> selectorAttribute;

	/**
	 * The default value of the '{@link #getAttributeSelectionFunction() <em>Attribute Selection Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeSelectionFunction()
	 * @generated
	 * @ordered
	 */
	protected static final AttributeSelectionFunction ATTRIBUTE_SELECTION_FUNCTION_EDEFAULT = AttributeSelectionFunction.IS_NOT_NULL;

	/**
	 * The cached value of the '{@link #getAttributeSelectionFunction() <em>Attribute Selection Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeSelectionFunction()
	 * @generated
	 * @ordered
	 */
	protected AttributeSelectionFunction attributeSelectionFunction = ATTRIBUTE_SELECTION_FUNCTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueSelectionFunction() <em>Value Selection Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSelectionFunction()
	 * @generated
	 * @ordered
	 */
	protected static final ValueSelectionFunction VALUE_SELECTION_FUNCTION_EDEFAULT = ValueSelectionFunction.VSF_VALUE;

	/**
	 * The cached value of the '{@link #getValueSelectionFunction() <em>Value Selection Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSelectionFunction()
	 * @generated
	 * @ordered
	 */
	protected ValueSelectionFunction valueSelectionFunction = VALUE_SELECTION_FUNCTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReversePivotAttributeAssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MiningDataPackage.Literals.REVERSE_PIVOT_ATTRIBUTE_ASSIGNMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getSelectorAttribute() {
		if (selectorAttribute == null) {
			selectorAttribute = new EObjectResolvingEList<Attribute>(Attribute.class, this, MiningDataPackage.REVERSE_PIVOT_ATTRIBUTE_ASSIGNMENT__SELECTOR_ATTRIBUTE);
		}
		return selectorAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeSelectionFunction getAttributeSelectionFunction() {
		return attributeSelectionFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeSelectionFunction(AttributeSelectionFunction newAttributeSelectionFunction) {
		AttributeSelectionFunction oldAttributeSelectionFunction = attributeSelectionFunction;
		attributeSelectionFunction = newAttributeSelectionFunction == null ? ATTRIBUTE_SELECTION_FUNCTION_EDEFAULT : newAttributeSelectionFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiningDataPackage.REVERSE_PIVOT_ATTRIBUTE_ASSIGNMENT__ATTRIBUTE_SELECTION_FUNCTION, oldAttributeSelectionFunction, attributeSelectionFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSelectionFunction getValueSelectionFunction() {
		return valueSelectionFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueSelectionFunction(ValueSelectionFunction newValueSelectionFunction) {
		ValueSelectionFunction oldValueSelectionFunction = valueSelectionFunction;
		valueSelectionFunction = newValueSelectionFunction == null ? VALUE_SELECTION_FUNCTION_EDEFAULT : newValueSelectionFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiningDataPackage.REVERSE_PIVOT_ATTRIBUTE_ASSIGNMENT__VALUE_SELECTION_FUNCTION, oldValueSelectionFunction, valueSelectionFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MiningDataPackage.REVERSE_PIVOT_ATTRIBUTE_ASSIGNMENT__SELECTOR_ATTRIBUTE:
				return getSelectorAttribute();
			case MiningDataPackage.REVERSE_PIVOT_ATTRIBUTE_ASSIGNMENT__ATTRIBUTE_SELECTION_FUNCTION:
				return getAttributeSelectionFunction();
			case MiningDataPackage.REVERSE_PIVOT_ATTRIBUTE_ASSIGNMENT__VALUE_SELECTION_FUNCTION:
				return getValueSelectionFunction();
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
			case MiningDataPackage.REVERSE_PIVOT_ATTRIBUTE_ASSIGNMENT__SELECTOR_ATTRIBUTE:
				getSelectorAttribute().clear();
				getSelectorAttribute().addAll((Collection<? extends Attribute>)newValue);
				return;
			case MiningDataPackage.REVERSE_PIVOT_ATTRIBUTE_ASSIGNMENT__ATTRIBUTE_SELECTION_FUNCTION:
				setAttributeSelectionFunction((AttributeSelectionFunction)newValue);
				return;
			case MiningDataPackage.REVERSE_PIVOT_ATTRIBUTE_ASSIGNMENT__VALUE_SELECTION_FUNCTION:
				setValueSelectionFunction((ValueSelectionFunction)newValue);
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
			case MiningDataPackage.REVERSE_PIVOT_ATTRIBUTE_ASSIGNMENT__SELECTOR_ATTRIBUTE:
				getSelectorAttribute().clear();
				return;
			case MiningDataPackage.REVERSE_PIVOT_ATTRIBUTE_ASSIGNMENT__ATTRIBUTE_SELECTION_FUNCTION:
				setAttributeSelectionFunction(ATTRIBUTE_SELECTION_FUNCTION_EDEFAULT);
				return;
			case MiningDataPackage.REVERSE_PIVOT_ATTRIBUTE_ASSIGNMENT__VALUE_SELECTION_FUNCTION:
				setValueSelectionFunction(VALUE_SELECTION_FUNCTION_EDEFAULT);
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
			case MiningDataPackage.REVERSE_PIVOT_ATTRIBUTE_ASSIGNMENT__SELECTOR_ATTRIBUTE:
				return selectorAttribute != null && !selectorAttribute.isEmpty();
			case MiningDataPackage.REVERSE_PIVOT_ATTRIBUTE_ASSIGNMENT__ATTRIBUTE_SELECTION_FUNCTION:
				return attributeSelectionFunction != ATTRIBUTE_SELECTION_FUNCTION_EDEFAULT;
			case MiningDataPackage.REVERSE_PIVOT_ATTRIBUTE_ASSIGNMENT__VALUE_SELECTION_FUNCTION:
				return valueSelectionFunction != VALUE_SELECTION_FUNCTION_EDEFAULT;
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
		result.append(" (attributeSelectionFunction: ");
		result.append(attributeSelectionFunction);
		result.append(", valueSelectionFunction: ");
		result.append(valueSelectionFunction);
		result.append(')');
		return result.toString();
	}

} //ReversePivotAttributeAssignmentImpl

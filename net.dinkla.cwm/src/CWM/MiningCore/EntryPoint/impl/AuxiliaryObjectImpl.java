/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.EntryPoint.impl;

import CWM.Core.impl.ModelElementImpl;

import CWM.MiningCore.EntryPoint.AuxiliaryObject;
import CWM.MiningCore.EntryPoint.EntryPointPackage;

import CWM.MiningCore.MiningData.AttributeAssignmentSet;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Auxiliary Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.MiningCore.EntryPoint.impl.AuxiliaryObjectImpl#getAttributeAssignmentSet <em>Attribute Assignment Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AuxiliaryObjectImpl extends ModelElementImpl implements AuxiliaryObject {
	/**
	 * The cached value of the '{@link #getAttributeAssignmentSet() <em>Attribute Assignment Set</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeAssignmentSet()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeAssignmentSet> attributeAssignmentSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuxiliaryObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntryPointPackage.Literals.AUXILIARY_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeAssignmentSet> getAttributeAssignmentSet() {
		if (attributeAssignmentSet == null) {
			attributeAssignmentSet = new EObjectContainmentEList<AttributeAssignmentSet>(AttributeAssignmentSet.class, this, EntryPointPackage.AUXILIARY_OBJECT__ATTRIBUTE_ASSIGNMENT_SET);
		}
		return attributeAssignmentSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EntryPointPackage.AUXILIARY_OBJECT__ATTRIBUTE_ASSIGNMENT_SET:
				return ((InternalEList<?>)getAttributeAssignmentSet()).basicRemove(otherEnd, msgs);
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
			case EntryPointPackage.AUXILIARY_OBJECT__ATTRIBUTE_ASSIGNMENT_SET:
				return getAttributeAssignmentSet();
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
			case EntryPointPackage.AUXILIARY_OBJECT__ATTRIBUTE_ASSIGNMENT_SET:
				getAttributeAssignmentSet().clear();
				getAttributeAssignmentSet().addAll((Collection<? extends AttributeAssignmentSet>)newValue);
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
			case EntryPointPackage.AUXILIARY_OBJECT__ATTRIBUTE_ASSIGNMENT_SET:
				getAttributeAssignmentSet().clear();
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
			case EntryPointPackage.AUXILIARY_OBJECT__ATTRIBUTE_ASSIGNMENT_SET:
				return attributeAssignmentSet != null && !attributeAssignmentSet.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AuxiliaryObjectImpl

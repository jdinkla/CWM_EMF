/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Behavioral.impl;

import CWM.Behavioral.Argument;
import CWM.Behavioral.BehavioralPackage;
import CWM.Behavioral.CallAction;
import CWM.Behavioral.Operation;

import CWM.Core.impl.ModelElementImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.Behavioral.impl.CallActionImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link CWM.Behavioral.impl.CallActionImpl#getActualArgument <em>Actual Argument</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CallActionImpl extends ModelElementImpl implements CallAction {
	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected Operation operation;

	/**
	 * The cached value of the '{@link #getActualArgument() <em>Actual Argument</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualArgument()
	 * @generated
	 * @ordered
	 */
	protected EList<Argument> actualArgument;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehavioralPackage.Literals.CALL_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getOperation() {
		if (operation != null && operation.eIsProxy()) {
			InternalEObject oldOperation = (InternalEObject)operation;
			operation = (Operation)eResolveProxy(oldOperation);
			if (operation != oldOperation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehavioralPackage.CALL_ACTION__OPERATION, oldOperation, operation));
			}
		}
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetOperation() {
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperation(Operation newOperation) {
		Operation oldOperation = operation;
		operation = newOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehavioralPackage.CALL_ACTION__OPERATION, oldOperation, operation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Argument> getActualArgument() {
		if (actualArgument == null) {
			actualArgument = new EObjectContainmentWithInverseEList<Argument>(Argument.class, this, BehavioralPackage.CALL_ACTION__ACTUAL_ARGUMENT, BehavioralPackage.ARGUMENT__CALL_ACTION);
		}
		return actualArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehavioralPackage.CALL_ACTION__ACTUAL_ARGUMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActualArgument()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehavioralPackage.CALL_ACTION__ACTUAL_ARGUMENT:
				return ((InternalEList<?>)getActualArgument()).basicRemove(otherEnd, msgs);
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
			case BehavioralPackage.CALL_ACTION__OPERATION:
				if (resolve) return getOperation();
				return basicGetOperation();
			case BehavioralPackage.CALL_ACTION__ACTUAL_ARGUMENT:
				return getActualArgument();
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
			case BehavioralPackage.CALL_ACTION__OPERATION:
				setOperation((Operation)newValue);
				return;
			case BehavioralPackage.CALL_ACTION__ACTUAL_ARGUMENT:
				getActualArgument().clear();
				getActualArgument().addAll((Collection<? extends Argument>)newValue);
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
			case BehavioralPackage.CALL_ACTION__OPERATION:
				setOperation((Operation)null);
				return;
			case BehavioralPackage.CALL_ACTION__ACTUAL_ARGUMENT:
				getActualArgument().clear();
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
			case BehavioralPackage.CALL_ACTION__OPERATION:
				return operation != null;
			case BehavioralPackage.CALL_ACTION__ACTUAL_ARGUMENT:
				return actualArgument != null && !actualArgument.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CallActionImpl

/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Behavioral.impl;

import CWM.Behavioral.Argument;
import CWM.Behavioral.BehavioralFeature;
import CWM.Behavioral.BehavioralPackage;
import CWM.Behavioral.Behavioral_container;
import CWM.Behavioral.CallAction;
import CWM.Behavioral.Event;
import CWM.Behavioral.Interface;
import CWM.Behavioral.Method;
import CWM.Behavioral.Operation;
import CWM.Behavioral.Parameter;

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
 * An implementation of the model object '<em><b>Behavioral container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.Behavioral.impl.Behavioral_containerImpl#getArgument <em>Argument</em>}</li>
 *   <li>{@link CWM.Behavioral.impl.Behavioral_containerImpl#getBehavioralFeature <em>Behavioral Feature</em>}</li>
 *   <li>{@link CWM.Behavioral.impl.Behavioral_containerImpl#getCallAction <em>Call Action</em>}</li>
 *   <li>{@link CWM.Behavioral.impl.Behavioral_containerImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link CWM.Behavioral.impl.Behavioral_containerImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link CWM.Behavioral.impl.Behavioral_containerImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link CWM.Behavioral.impl.Behavioral_containerImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link CWM.Behavioral.impl.Behavioral_containerImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Behavioral_containerImpl extends EObjectImpl implements Behavioral_container {
	/**
	 * The cached value of the '{@link #getArgument() <em>Argument</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgument()
	 * @generated
	 * @ordered
	 */
	protected EList<Argument> argument;

	/**
	 * The cached value of the '{@link #getBehavioralFeature() <em>Behavioral Feature</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavioralFeature()
	 * @generated
	 * @ordered
	 */
	protected EList<BehavioralFeature> behavioralFeature;

	/**
	 * The cached value of the '{@link #getCallAction() <em>Call Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallAction()
	 * @generated
	 * @ordered
	 */
	protected EList<CallAction> callAction;

	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> event;

	/**
	 * The cached value of the '{@link #getInterface() <em>Interface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> interface_;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected EList<Method> method;

	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> operation;

	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Behavioral_containerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehavioralPackage.Literals.BEHAVIORAL_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Argument> getArgument() {
		if (argument == null) {
			argument = new EObjectContainmentEList<Argument>(Argument.class, this, BehavioralPackage.BEHAVIORAL_CONTAINER__ARGUMENT);
		}
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BehavioralFeature> getBehavioralFeature() {
		if (behavioralFeature == null) {
			behavioralFeature = new EObjectContainmentEList<BehavioralFeature>(BehavioralFeature.class, this, BehavioralPackage.BEHAVIORAL_CONTAINER__BEHAVIORAL_FEATURE);
		}
		return behavioralFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CallAction> getCallAction() {
		if (callAction == null) {
			callAction = new EObjectContainmentEList<CallAction>(CallAction.class, this, BehavioralPackage.BEHAVIORAL_CONTAINER__CALL_ACTION);
		}
		return callAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getEvent() {
		if (event == null) {
			event = new EObjectContainmentEList<Event>(Event.class, this, BehavioralPackage.BEHAVIORAL_CONTAINER__EVENT);
		}
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getInterface() {
		if (interface_ == null) {
			interface_ = new EObjectContainmentEList<Interface>(Interface.class, this, BehavioralPackage.BEHAVIORAL_CONTAINER__INTERFACE);
		}
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Method> getMethod() {
		if (method == null) {
			method = new EObjectContainmentEList<Method>(Method.class, this, BehavioralPackage.BEHAVIORAL_CONTAINER__METHOD);
		}
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOperation() {
		if (operation == null) {
			operation = new EObjectContainmentEList<Operation>(Operation.class, this, BehavioralPackage.BEHAVIORAL_CONTAINER__OPERATION);
		}
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameter() {
		if (parameter == null) {
			parameter = new EObjectContainmentEList<Parameter>(Parameter.class, this, BehavioralPackage.BEHAVIORAL_CONTAINER__PARAMETER);
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehavioralPackage.BEHAVIORAL_CONTAINER__ARGUMENT:
				return ((InternalEList<?>)getArgument()).basicRemove(otherEnd, msgs);
			case BehavioralPackage.BEHAVIORAL_CONTAINER__BEHAVIORAL_FEATURE:
				return ((InternalEList<?>)getBehavioralFeature()).basicRemove(otherEnd, msgs);
			case BehavioralPackage.BEHAVIORAL_CONTAINER__CALL_ACTION:
				return ((InternalEList<?>)getCallAction()).basicRemove(otherEnd, msgs);
			case BehavioralPackage.BEHAVIORAL_CONTAINER__EVENT:
				return ((InternalEList<?>)getEvent()).basicRemove(otherEnd, msgs);
			case BehavioralPackage.BEHAVIORAL_CONTAINER__INTERFACE:
				return ((InternalEList<?>)getInterface()).basicRemove(otherEnd, msgs);
			case BehavioralPackage.BEHAVIORAL_CONTAINER__METHOD:
				return ((InternalEList<?>)getMethod()).basicRemove(otherEnd, msgs);
			case BehavioralPackage.BEHAVIORAL_CONTAINER__OPERATION:
				return ((InternalEList<?>)getOperation()).basicRemove(otherEnd, msgs);
			case BehavioralPackage.BEHAVIORAL_CONTAINER__PARAMETER:
				return ((InternalEList<?>)getParameter()).basicRemove(otherEnd, msgs);
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
			case BehavioralPackage.BEHAVIORAL_CONTAINER__ARGUMENT:
				return getArgument();
			case BehavioralPackage.BEHAVIORAL_CONTAINER__BEHAVIORAL_FEATURE:
				return getBehavioralFeature();
			case BehavioralPackage.BEHAVIORAL_CONTAINER__CALL_ACTION:
				return getCallAction();
			case BehavioralPackage.BEHAVIORAL_CONTAINER__EVENT:
				return getEvent();
			case BehavioralPackage.BEHAVIORAL_CONTAINER__INTERFACE:
				return getInterface();
			case BehavioralPackage.BEHAVIORAL_CONTAINER__METHOD:
				return getMethod();
			case BehavioralPackage.BEHAVIORAL_CONTAINER__OPERATION:
				return getOperation();
			case BehavioralPackage.BEHAVIORAL_CONTAINER__PARAMETER:
				return getParameter();
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
			case BehavioralPackage.BEHAVIORAL_CONTAINER__ARGUMENT:
				getArgument().clear();
				getArgument().addAll((Collection<? extends Argument>)newValue);
				return;
			case BehavioralPackage.BEHAVIORAL_CONTAINER__BEHAVIORAL_FEATURE:
				getBehavioralFeature().clear();
				getBehavioralFeature().addAll((Collection<? extends BehavioralFeature>)newValue);
				return;
			case BehavioralPackage.BEHAVIORAL_CONTAINER__CALL_ACTION:
				getCallAction().clear();
				getCallAction().addAll((Collection<? extends CallAction>)newValue);
				return;
			case BehavioralPackage.BEHAVIORAL_CONTAINER__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends Event>)newValue);
				return;
			case BehavioralPackage.BEHAVIORAL_CONTAINER__INTERFACE:
				getInterface().clear();
				getInterface().addAll((Collection<? extends Interface>)newValue);
				return;
			case BehavioralPackage.BEHAVIORAL_CONTAINER__METHOD:
				getMethod().clear();
				getMethod().addAll((Collection<? extends Method>)newValue);
				return;
			case BehavioralPackage.BEHAVIORAL_CONTAINER__OPERATION:
				getOperation().clear();
				getOperation().addAll((Collection<? extends Operation>)newValue);
				return;
			case BehavioralPackage.BEHAVIORAL_CONTAINER__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends Parameter>)newValue);
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
			case BehavioralPackage.BEHAVIORAL_CONTAINER__ARGUMENT:
				getArgument().clear();
				return;
			case BehavioralPackage.BEHAVIORAL_CONTAINER__BEHAVIORAL_FEATURE:
				getBehavioralFeature().clear();
				return;
			case BehavioralPackage.BEHAVIORAL_CONTAINER__CALL_ACTION:
				getCallAction().clear();
				return;
			case BehavioralPackage.BEHAVIORAL_CONTAINER__EVENT:
				getEvent().clear();
				return;
			case BehavioralPackage.BEHAVIORAL_CONTAINER__INTERFACE:
				getInterface().clear();
				return;
			case BehavioralPackage.BEHAVIORAL_CONTAINER__METHOD:
				getMethod().clear();
				return;
			case BehavioralPackage.BEHAVIORAL_CONTAINER__OPERATION:
				getOperation().clear();
				return;
			case BehavioralPackage.BEHAVIORAL_CONTAINER__PARAMETER:
				getParameter().clear();
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
			case BehavioralPackage.BEHAVIORAL_CONTAINER__ARGUMENT:
				return argument != null && !argument.isEmpty();
			case BehavioralPackage.BEHAVIORAL_CONTAINER__BEHAVIORAL_FEATURE:
				return behavioralFeature != null && !behavioralFeature.isEmpty();
			case BehavioralPackage.BEHAVIORAL_CONTAINER__CALL_ACTION:
				return callAction != null && !callAction.isEmpty();
			case BehavioralPackage.BEHAVIORAL_CONTAINER__EVENT:
				return event != null && !event.isEmpty();
			case BehavioralPackage.BEHAVIORAL_CONTAINER__INTERFACE:
				return interface_ != null && !interface_.isEmpty();
			case BehavioralPackage.BEHAVIORAL_CONTAINER__METHOD:
				return method != null && !method.isEmpty();
			case BehavioralPackage.BEHAVIORAL_CONTAINER__OPERATION:
				return operation != null && !operation.isEmpty();
			case BehavioralPackage.BEHAVIORAL_CONTAINER__PARAMETER:
				return parameter != null && !parameter.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Behavioral_containerImpl

/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Relational.impl;

import CWM.Relational.RelationalPackage;
import CWM.Relational.Table;
import CWM.Relational.Trigger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.Relational.impl.TableImpl#getIsTemporary <em>Is Temporary</em>}</li>
 *   <li>{@link CWM.Relational.impl.TableImpl#getTemporaryScope <em>Temporary Scope</em>}</li>
 *   <li>{@link CWM.Relational.impl.TableImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link CWM.Relational.impl.TableImpl#getIsSystem <em>Is System</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TableImpl extends NamedColumnSetImpl implements Table {
	/**
	 * The default value of the '{@link #getIsTemporary() <em>Is Temporary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsTemporary()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_TEMPORARY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsTemporary() <em>Is Temporary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsTemporary()
	 * @generated
	 * @ordered
	 */
	protected Boolean isTemporary = IS_TEMPORARY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTemporaryScope() <em>Temporary Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemporaryScope()
	 * @generated
	 * @ordered
	 */
	protected static final String TEMPORARY_SCOPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTemporaryScope() <em>Temporary Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemporaryScope()
	 * @generated
	 * @ordered
	 */
	protected String temporaryScope = TEMPORARY_SCOPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected EList<Trigger> trigger;

	/**
	 * The default value of the '{@link #getIsSystem() <em>Is System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSystem()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_SYSTEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsSystem() <em>Is System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSystem()
	 * @generated
	 * @ordered
	 */
	protected Boolean isSystem = IS_SYSTEM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RelationalPackage.Literals.TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsTemporary() {
		return isTemporary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsTemporary(Boolean newIsTemporary) {
		Boolean oldIsTemporary = isTemporary;
		isTemporary = newIsTemporary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalPackage.TABLE__IS_TEMPORARY, oldIsTemporary, isTemporary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTemporaryScope() {
		return temporaryScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemporaryScope(String newTemporaryScope) {
		String oldTemporaryScope = temporaryScope;
		temporaryScope = newTemporaryScope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalPackage.TABLE__TEMPORARY_SCOPE, oldTemporaryScope, temporaryScope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trigger> getTrigger() {
		if (trigger == null) {
			trigger = new EObjectWithInverseResolvingEList<Trigger>(Trigger.class, this, RelationalPackage.TABLE__TRIGGER, RelationalPackage.TRIGGER__TABLE);
		}
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsSystem() {
		return isSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSystem(Boolean newIsSystem) {
		Boolean oldIsSystem = isSystem;
		isSystem = newIsSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalPackage.TABLE__IS_SYSTEM, oldIsSystem, isSystem));
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
			case RelationalPackage.TABLE__TRIGGER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTrigger()).basicAdd(otherEnd, msgs);
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
			case RelationalPackage.TABLE__TRIGGER:
				return ((InternalEList<?>)getTrigger()).basicRemove(otherEnd, msgs);
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
			case RelationalPackage.TABLE__IS_TEMPORARY:
				return getIsTemporary();
			case RelationalPackage.TABLE__TEMPORARY_SCOPE:
				return getTemporaryScope();
			case RelationalPackage.TABLE__TRIGGER:
				return getTrigger();
			case RelationalPackage.TABLE__IS_SYSTEM:
				return getIsSystem();
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
			case RelationalPackage.TABLE__IS_TEMPORARY:
				setIsTemporary((Boolean)newValue);
				return;
			case RelationalPackage.TABLE__TEMPORARY_SCOPE:
				setTemporaryScope((String)newValue);
				return;
			case RelationalPackage.TABLE__TRIGGER:
				getTrigger().clear();
				getTrigger().addAll((Collection<? extends Trigger>)newValue);
				return;
			case RelationalPackage.TABLE__IS_SYSTEM:
				setIsSystem((Boolean)newValue);
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
			case RelationalPackage.TABLE__IS_TEMPORARY:
				setIsTemporary(IS_TEMPORARY_EDEFAULT);
				return;
			case RelationalPackage.TABLE__TEMPORARY_SCOPE:
				setTemporaryScope(TEMPORARY_SCOPE_EDEFAULT);
				return;
			case RelationalPackage.TABLE__TRIGGER:
				getTrigger().clear();
				return;
			case RelationalPackage.TABLE__IS_SYSTEM:
				setIsSystem(IS_SYSTEM_EDEFAULT);
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
			case RelationalPackage.TABLE__IS_TEMPORARY:
				return IS_TEMPORARY_EDEFAULT == null ? isTemporary != null : !IS_TEMPORARY_EDEFAULT.equals(isTemporary);
			case RelationalPackage.TABLE__TEMPORARY_SCOPE:
				return TEMPORARY_SCOPE_EDEFAULT == null ? temporaryScope != null : !TEMPORARY_SCOPE_EDEFAULT.equals(temporaryScope);
			case RelationalPackage.TABLE__TRIGGER:
				return trigger != null && !trigger.isEmpty();
			case RelationalPackage.TABLE__IS_SYSTEM:
				return IS_SYSTEM_EDEFAULT == null ? isSystem != null : !IS_SYSTEM_EDEFAULT.equals(isSystem);
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
		result.append(" (isTemporary: ");
		result.append(isTemporary);
		result.append(", temporaryScope: ");
		result.append(temporaryScope);
		result.append(", isSystem: ");
		result.append(isSystem);
		result.append(')');
		return result.toString();
	}

} //TableImpl

/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Core.impl;

import CWM.Core.ChangeableKind;
import CWM.Core.Classifier;
import CWM.Core.CorePackage;
import CWM.Core.Multiplicity;
import CWM.Core.OrderingKind;
import CWM.Core.ScopeKind;
import CWM.Core.StructuralFeature;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structural Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.Core.impl.StructuralFeatureImpl#getChangeability <em>Changeability</em>}</li>
 *   <li>{@link CWM.Core.impl.StructuralFeatureImpl#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link CWM.Core.impl.StructuralFeatureImpl#getOrdering <em>Ordering</em>}</li>
 *   <li>{@link CWM.Core.impl.StructuralFeatureImpl#getTargetScope <em>Target Scope</em>}</li>
 *   <li>{@link CWM.Core.impl.StructuralFeatureImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class StructuralFeatureImpl extends FeatureImpl implements StructuralFeature {
	/**
	 * The default value of the '{@link #getChangeability() <em>Changeability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeability()
	 * @generated
	 * @ordered
	 */
	protected static final ChangeableKind CHANGEABILITY_EDEFAULT = ChangeableKind.CK_CHANGEABLE;

	/**
	 * The cached value of the '{@link #getChangeability() <em>Changeability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeability()
	 * @generated
	 * @ordered
	 */
	protected ChangeableKind changeability = CHANGEABILITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected Multiplicity multiplicity;

	/**
	 * The default value of the '{@link #getOrdering() <em>Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrdering()
	 * @generated
	 * @ordered
	 */
	protected static final OrderingKind ORDERING_EDEFAULT = OrderingKind.OK_UNORDERED;

	/**
	 * The cached value of the '{@link #getOrdering() <em>Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrdering()
	 * @generated
	 * @ordered
	 */
	protected OrderingKind ordering = ORDERING_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetScope() <em>Target Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetScope()
	 * @generated
	 * @ordered
	 */
	protected static final ScopeKind TARGET_SCOPE_EDEFAULT = ScopeKind.SK_INSTANCE;

	/**
	 * The cached value of the '{@link #getTargetScope() <em>Target Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetScope()
	 * @generated
	 * @ordered
	 */
	protected ScopeKind targetScope = TARGET_SCOPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Classifier type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuralFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.STRUCTURAL_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeableKind getChangeability() {
		return changeability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeability(ChangeableKind newChangeability) {
		ChangeableKind oldChangeability = changeability;
		changeability = newChangeability == null ? CHANGEABILITY_EDEFAULT : newChangeability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.STRUCTURAL_FEATURE__CHANGEABILITY, oldChangeability, changeability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiplicity getMultiplicity() {
		return multiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiplicity(Multiplicity newMultiplicity, NotificationChain msgs) {
		Multiplicity oldMultiplicity = multiplicity;
		multiplicity = newMultiplicity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.STRUCTURAL_FEATURE__MULTIPLICITY, oldMultiplicity, newMultiplicity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicity(Multiplicity newMultiplicity) {
		if (newMultiplicity != multiplicity) {
			NotificationChain msgs = null;
			if (multiplicity != null)
				msgs = ((InternalEObject)multiplicity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.STRUCTURAL_FEATURE__MULTIPLICITY, null, msgs);
			if (newMultiplicity != null)
				msgs = ((InternalEObject)newMultiplicity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.STRUCTURAL_FEATURE__MULTIPLICITY, null, msgs);
			msgs = basicSetMultiplicity(newMultiplicity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.STRUCTURAL_FEATURE__MULTIPLICITY, newMultiplicity, newMultiplicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderingKind getOrdering() {
		return ordering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrdering(OrderingKind newOrdering) {
		OrderingKind oldOrdering = ordering;
		ordering = newOrdering == null ? ORDERING_EDEFAULT : newOrdering;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.STRUCTURAL_FEATURE__ORDERING, oldOrdering, ordering));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopeKind getTargetScope() {
		return targetScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetScope(ScopeKind newTargetScope) {
		ScopeKind oldTargetScope = targetScope;
		targetScope = newTargetScope == null ? TARGET_SCOPE_EDEFAULT : newTargetScope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.STRUCTURAL_FEATURE__TARGET_SCOPE, oldTargetScope, targetScope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Classifier)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.STRUCTURAL_FEATURE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Classifier newType) {
		Classifier oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.STRUCTURAL_FEATURE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.STRUCTURAL_FEATURE__MULTIPLICITY:
				return basicSetMultiplicity(null, msgs);
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
			case CorePackage.STRUCTURAL_FEATURE__CHANGEABILITY:
				return getChangeability();
			case CorePackage.STRUCTURAL_FEATURE__MULTIPLICITY:
				return getMultiplicity();
			case CorePackage.STRUCTURAL_FEATURE__ORDERING:
				return getOrdering();
			case CorePackage.STRUCTURAL_FEATURE__TARGET_SCOPE:
				return getTargetScope();
			case CorePackage.STRUCTURAL_FEATURE__TYPE:
				if (resolve) return getType();
				return basicGetType();
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
			case CorePackage.STRUCTURAL_FEATURE__CHANGEABILITY:
				setChangeability((ChangeableKind)newValue);
				return;
			case CorePackage.STRUCTURAL_FEATURE__MULTIPLICITY:
				setMultiplicity((Multiplicity)newValue);
				return;
			case CorePackage.STRUCTURAL_FEATURE__ORDERING:
				setOrdering((OrderingKind)newValue);
				return;
			case CorePackage.STRUCTURAL_FEATURE__TARGET_SCOPE:
				setTargetScope((ScopeKind)newValue);
				return;
			case CorePackage.STRUCTURAL_FEATURE__TYPE:
				setType((Classifier)newValue);
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
			case CorePackage.STRUCTURAL_FEATURE__CHANGEABILITY:
				setChangeability(CHANGEABILITY_EDEFAULT);
				return;
			case CorePackage.STRUCTURAL_FEATURE__MULTIPLICITY:
				setMultiplicity((Multiplicity)null);
				return;
			case CorePackage.STRUCTURAL_FEATURE__ORDERING:
				setOrdering(ORDERING_EDEFAULT);
				return;
			case CorePackage.STRUCTURAL_FEATURE__TARGET_SCOPE:
				setTargetScope(TARGET_SCOPE_EDEFAULT);
				return;
			case CorePackage.STRUCTURAL_FEATURE__TYPE:
				setType((Classifier)null);
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
			case CorePackage.STRUCTURAL_FEATURE__CHANGEABILITY:
				return changeability != CHANGEABILITY_EDEFAULT;
			case CorePackage.STRUCTURAL_FEATURE__MULTIPLICITY:
				return multiplicity != null;
			case CorePackage.STRUCTURAL_FEATURE__ORDERING:
				return ordering != ORDERING_EDEFAULT;
			case CorePackage.STRUCTURAL_FEATURE__TARGET_SCOPE:
				return targetScope != TARGET_SCOPE_EDEFAULT;
			case CorePackage.STRUCTURAL_FEATURE__TYPE:
				return type != null;
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
		result.append(" (changeability: ");
		result.append(changeability);
		result.append(", ordering: ");
		result.append(ordering);
		result.append(", targetScope: ");
		result.append(targetScope);
		result.append(')');
		return result.toString();
	}

} //StructuralFeatureImpl

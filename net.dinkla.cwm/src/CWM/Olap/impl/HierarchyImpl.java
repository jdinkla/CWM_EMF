/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Olap.impl;

import CWM.Core.impl.ClassImpl;

import CWM.Olap.CubeDimensionAssociation;
import CWM.Olap.Dimension;
import CWM.Olap.Hierarchy;
import CWM.Olap.HierarchyMemberSelectionGroup;
import CWM.Olap.OlapPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hierarchy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.Olap.impl.HierarchyImpl#getDimension <em>Dimension</em>}</li>
 *   <li>{@link CWM.Olap.impl.HierarchyImpl#getCubeDimensionAssociation <em>Cube Dimension Association</em>}</li>
 *   <li>{@link CWM.Olap.impl.HierarchyImpl#getDefaultedDimension <em>Defaulted Dimension</em>}</li>
 *   <li>{@link CWM.Olap.impl.HierarchyImpl#getHierarchyMemberSelectionGroup <em>Hierarchy Member Selection Group</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class HierarchyImpl extends ClassImpl implements Hierarchy {
	/**
	 * The cached value of the '{@link #getCubeDimensionAssociation() <em>Cube Dimension Association</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCubeDimensionAssociation()
	 * @generated
	 * @ordered
	 */
	protected EList<CubeDimensionAssociation> cubeDimensionAssociation;

	/**
	 * The cached value of the '{@link #getDefaultedDimension() <em>Defaulted Dimension</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultedDimension()
	 * @generated
	 * @ordered
	 */
	protected Dimension defaultedDimension;

	/**
	 * The cached value of the '{@link #getHierarchyMemberSelectionGroup() <em>Hierarchy Member Selection Group</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHierarchyMemberSelectionGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<HierarchyMemberSelectionGroup> hierarchyMemberSelectionGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HierarchyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OlapPackage.Literals.HIERARCHY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dimension getDimension() {
		if (eContainerFeatureID != OlapPackage.HIERARCHY__DIMENSION) return null;
		return (Dimension)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDimension(Dimension newDimension, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDimension, OlapPackage.HIERARCHY__DIMENSION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDimension(Dimension newDimension) {
		if (newDimension != eInternalContainer() || (eContainerFeatureID != OlapPackage.HIERARCHY__DIMENSION && newDimension != null)) {
			if (EcoreUtil.isAncestor(this, newDimension))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDimension != null)
				msgs = ((InternalEObject)newDimension).eInverseAdd(this, OlapPackage.DIMENSION__HIERARCHY, Dimension.class, msgs);
			msgs = basicSetDimension(newDimension, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OlapPackage.HIERARCHY__DIMENSION, newDimension, newDimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CubeDimensionAssociation> getCubeDimensionAssociation() {
		if (cubeDimensionAssociation == null) {
			cubeDimensionAssociation = new EObjectWithInverseResolvingEList<CubeDimensionAssociation>(CubeDimensionAssociation.class, this, OlapPackage.HIERARCHY__CUBE_DIMENSION_ASSOCIATION, OlapPackage.CUBE_DIMENSION_ASSOCIATION__CALC_HIERARCHY);
		}
		return cubeDimensionAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dimension getDefaultedDimension() {
		if (defaultedDimension != null && defaultedDimension.eIsProxy()) {
			InternalEObject oldDefaultedDimension = (InternalEObject)defaultedDimension;
			defaultedDimension = (Dimension)eResolveProxy(oldDefaultedDimension);
			if (defaultedDimension != oldDefaultedDimension) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OlapPackage.HIERARCHY__DEFAULTED_DIMENSION, oldDefaultedDimension, defaultedDimension));
			}
		}
		return defaultedDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dimension basicGetDefaultedDimension() {
		return defaultedDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultedDimension(Dimension newDefaultedDimension, NotificationChain msgs) {
		Dimension oldDefaultedDimension = defaultedDimension;
		defaultedDimension = newDefaultedDimension;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OlapPackage.HIERARCHY__DEFAULTED_DIMENSION, oldDefaultedDimension, newDefaultedDimension);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultedDimension(Dimension newDefaultedDimension) {
		if (newDefaultedDimension != defaultedDimension) {
			NotificationChain msgs = null;
			if (defaultedDimension != null)
				msgs = ((InternalEObject)defaultedDimension).eInverseRemove(this, OlapPackage.DIMENSION__DISPLAY_DEFAULT, Dimension.class, msgs);
			if (newDefaultedDimension != null)
				msgs = ((InternalEObject)newDefaultedDimension).eInverseAdd(this, OlapPackage.DIMENSION__DISPLAY_DEFAULT, Dimension.class, msgs);
			msgs = basicSetDefaultedDimension(newDefaultedDimension, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OlapPackage.HIERARCHY__DEFAULTED_DIMENSION, newDefaultedDimension, newDefaultedDimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HierarchyMemberSelectionGroup> getHierarchyMemberSelectionGroup() {
		if (hierarchyMemberSelectionGroup == null) {
			hierarchyMemberSelectionGroup = new EObjectWithInverseResolvingEList.ManyInverse<HierarchyMemberSelectionGroup>(HierarchyMemberSelectionGroup.class, this, OlapPackage.HIERARCHY__HIERARCHY_MEMBER_SELECTION_GROUP, OlapPackage.HIERARCHY_MEMBER_SELECTION_GROUP__HIERARCHY);
		}
		return hierarchyMemberSelectionGroup;
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
			case OlapPackage.HIERARCHY__DIMENSION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDimension((Dimension)otherEnd, msgs);
			case OlapPackage.HIERARCHY__CUBE_DIMENSION_ASSOCIATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCubeDimensionAssociation()).basicAdd(otherEnd, msgs);
			case OlapPackage.HIERARCHY__DEFAULTED_DIMENSION:
				if (defaultedDimension != null)
					msgs = ((InternalEObject)defaultedDimension).eInverseRemove(this, OlapPackage.DIMENSION__DISPLAY_DEFAULT, Dimension.class, msgs);
				return basicSetDefaultedDimension((Dimension)otherEnd, msgs);
			case OlapPackage.HIERARCHY__HIERARCHY_MEMBER_SELECTION_GROUP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHierarchyMemberSelectionGroup()).basicAdd(otherEnd, msgs);
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
			case OlapPackage.HIERARCHY__DIMENSION:
				return basicSetDimension(null, msgs);
			case OlapPackage.HIERARCHY__CUBE_DIMENSION_ASSOCIATION:
				return ((InternalEList<?>)getCubeDimensionAssociation()).basicRemove(otherEnd, msgs);
			case OlapPackage.HIERARCHY__DEFAULTED_DIMENSION:
				return basicSetDefaultedDimension(null, msgs);
			case OlapPackage.HIERARCHY__HIERARCHY_MEMBER_SELECTION_GROUP:
				return ((InternalEList<?>)getHierarchyMemberSelectionGroup()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case OlapPackage.HIERARCHY__DIMENSION:
				return eInternalContainer().eInverseRemove(this, OlapPackage.DIMENSION__HIERARCHY, Dimension.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OlapPackage.HIERARCHY__DIMENSION:
				return getDimension();
			case OlapPackage.HIERARCHY__CUBE_DIMENSION_ASSOCIATION:
				return getCubeDimensionAssociation();
			case OlapPackage.HIERARCHY__DEFAULTED_DIMENSION:
				if (resolve) return getDefaultedDimension();
				return basicGetDefaultedDimension();
			case OlapPackage.HIERARCHY__HIERARCHY_MEMBER_SELECTION_GROUP:
				return getHierarchyMemberSelectionGroup();
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
			case OlapPackage.HIERARCHY__DIMENSION:
				setDimension((Dimension)newValue);
				return;
			case OlapPackage.HIERARCHY__CUBE_DIMENSION_ASSOCIATION:
				getCubeDimensionAssociation().clear();
				getCubeDimensionAssociation().addAll((Collection<? extends CubeDimensionAssociation>)newValue);
				return;
			case OlapPackage.HIERARCHY__DEFAULTED_DIMENSION:
				setDefaultedDimension((Dimension)newValue);
				return;
			case OlapPackage.HIERARCHY__HIERARCHY_MEMBER_SELECTION_GROUP:
				getHierarchyMemberSelectionGroup().clear();
				getHierarchyMemberSelectionGroup().addAll((Collection<? extends HierarchyMemberSelectionGroup>)newValue);
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
			case OlapPackage.HIERARCHY__DIMENSION:
				setDimension((Dimension)null);
				return;
			case OlapPackage.HIERARCHY__CUBE_DIMENSION_ASSOCIATION:
				getCubeDimensionAssociation().clear();
				return;
			case OlapPackage.HIERARCHY__DEFAULTED_DIMENSION:
				setDefaultedDimension((Dimension)null);
				return;
			case OlapPackage.HIERARCHY__HIERARCHY_MEMBER_SELECTION_GROUP:
				getHierarchyMemberSelectionGroup().clear();
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
			case OlapPackage.HIERARCHY__DIMENSION:
				return getDimension() != null;
			case OlapPackage.HIERARCHY__CUBE_DIMENSION_ASSOCIATION:
				return cubeDimensionAssociation != null && !cubeDimensionAssociation.isEmpty();
			case OlapPackage.HIERARCHY__DEFAULTED_DIMENSION:
				return defaultedDimension != null;
			case OlapPackage.HIERARCHY__HIERARCHY_MEMBER_SELECTION_GROUP:
				return hierarchyMemberSelectionGroup != null && !hierarchyMemberSelectionGroup.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HierarchyImpl

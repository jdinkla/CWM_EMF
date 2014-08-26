/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Olap.impl;

import CWM.Olap.Hierarchy;
import CWM.Olap.HierarchyMemberSelectionGroup;
import CWM.Olap.OlapPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hierarchy Member Selection Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.Olap.impl.HierarchyMemberSelectionGroupImpl#getHierarchy <em>Hierarchy</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HierarchyMemberSelectionGroupImpl extends MemberSelectionGroupImpl implements HierarchyMemberSelectionGroup {
	/**
	 * The cached value of the '{@link #getHierarchy() <em>Hierarchy</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHierarchy()
	 * @generated
	 * @ordered
	 */
	protected EList<Hierarchy> hierarchy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HierarchyMemberSelectionGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OlapPackage.Literals.HIERARCHY_MEMBER_SELECTION_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Hierarchy> getHierarchy() {
		if (hierarchy == null) {
			hierarchy = new EObjectWithInverseResolvingEList.ManyInverse<Hierarchy>(Hierarchy.class, this, OlapPackage.HIERARCHY_MEMBER_SELECTION_GROUP__HIERARCHY, OlapPackage.HIERARCHY__HIERARCHY_MEMBER_SELECTION_GROUP);
		}
		return hierarchy;
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
			case OlapPackage.HIERARCHY_MEMBER_SELECTION_GROUP__HIERARCHY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHierarchy()).basicAdd(otherEnd, msgs);
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
			case OlapPackage.HIERARCHY_MEMBER_SELECTION_GROUP__HIERARCHY:
				return ((InternalEList<?>)getHierarchy()).basicRemove(otherEnd, msgs);
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
			case OlapPackage.HIERARCHY_MEMBER_SELECTION_GROUP__HIERARCHY:
				return getHierarchy();
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
			case OlapPackage.HIERARCHY_MEMBER_SELECTION_GROUP__HIERARCHY:
				getHierarchy().clear();
				getHierarchy().addAll((Collection<? extends Hierarchy>)newValue);
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
			case OlapPackage.HIERARCHY_MEMBER_SELECTION_GROUP__HIERARCHY:
				getHierarchy().clear();
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
			case OlapPackage.HIERARCHY_MEMBER_SELECTION_GROUP__HIERARCHY:
				return hierarchy != null && !hierarchy.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HierarchyMemberSelectionGroupImpl

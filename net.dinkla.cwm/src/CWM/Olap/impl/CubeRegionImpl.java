/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Olap.impl;

import CWM.Core.impl.ClassImpl;

import CWM.Olap.Cube;
import CWM.Olap.CubeDeployment;
import CWM.Olap.CubeRegion;
import CWM.Olap.MemberSelectionGroup;
import CWM.Olap.OlapPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cube Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.Olap.impl.CubeRegionImpl#getIsReadOnly <em>Is Read Only</em>}</li>
 *   <li>{@link CWM.Olap.impl.CubeRegionImpl#getIsFullyRealized <em>Is Fully Realized</em>}</li>
 *   <li>{@link CWM.Olap.impl.CubeRegionImpl#getMemberSelectionGroup <em>Member Selection Group</em>}</li>
 *   <li>{@link CWM.Olap.impl.CubeRegionImpl#getCube <em>Cube</em>}</li>
 *   <li>{@link CWM.Olap.impl.CubeRegionImpl#getCubeDeployment <em>Cube Deployment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CubeRegionImpl extends ClassImpl implements CubeRegion {
	/**
	 * The default value of the '{@link #getIsReadOnly() <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_READ_ONLY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsReadOnly() <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsReadOnly()
	 * @generated
	 * @ordered
	 */
	protected Boolean isReadOnly = IS_READ_ONLY_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsFullyRealized() <em>Is Fully Realized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsFullyRealized()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_FULLY_REALIZED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsFullyRealized() <em>Is Fully Realized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsFullyRealized()
	 * @generated
	 * @ordered
	 */
	protected Boolean isFullyRealized = IS_FULLY_REALIZED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMemberSelectionGroup() <em>Member Selection Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberSelectionGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<MemberSelectionGroup> memberSelectionGroup;

	/**
	 * The cached value of the '{@link #getCubeDeployment() <em>Cube Deployment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCubeDeployment()
	 * @generated
	 * @ordered
	 */
	protected EList<CubeDeployment> cubeDeployment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CubeRegionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OlapPackage.Literals.CUBE_REGION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsReadOnly() {
		return isReadOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsReadOnly(Boolean newIsReadOnly) {
		Boolean oldIsReadOnly = isReadOnly;
		isReadOnly = newIsReadOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OlapPackage.CUBE_REGION__IS_READ_ONLY, oldIsReadOnly, isReadOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsFullyRealized() {
		return isFullyRealized;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsFullyRealized(Boolean newIsFullyRealized) {
		Boolean oldIsFullyRealized = isFullyRealized;
		isFullyRealized = newIsFullyRealized;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OlapPackage.CUBE_REGION__IS_FULLY_REALIZED, oldIsFullyRealized, isFullyRealized));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MemberSelectionGroup> getMemberSelectionGroup() {
		if (memberSelectionGroup == null) {
			memberSelectionGroup = new EObjectContainmentWithInverseEList<MemberSelectionGroup>(MemberSelectionGroup.class, this, OlapPackage.CUBE_REGION__MEMBER_SELECTION_GROUP, OlapPackage.MEMBER_SELECTION_GROUP__CUBE_REGION);
		}
		return memberSelectionGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cube getCube() {
		if (eContainerFeatureID != OlapPackage.CUBE_REGION__CUBE) return null;
		return (Cube)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCube(Cube newCube, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCube, OlapPackage.CUBE_REGION__CUBE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCube(Cube newCube) {
		if (newCube != eInternalContainer() || (eContainerFeatureID != OlapPackage.CUBE_REGION__CUBE && newCube != null)) {
			if (EcoreUtil.isAncestor(this, newCube))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCube != null)
				msgs = ((InternalEObject)newCube).eInverseAdd(this, OlapPackage.CUBE__CUBE_REGION, Cube.class, msgs);
			msgs = basicSetCube(newCube, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OlapPackage.CUBE_REGION__CUBE, newCube, newCube));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CubeDeployment> getCubeDeployment() {
		if (cubeDeployment == null) {
			cubeDeployment = new EObjectContainmentWithInverseEList<CubeDeployment>(CubeDeployment.class, this, OlapPackage.CUBE_REGION__CUBE_DEPLOYMENT, OlapPackage.CUBE_DEPLOYMENT__CUBE_REGION);
		}
		return cubeDeployment;
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
			case OlapPackage.CUBE_REGION__MEMBER_SELECTION_GROUP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMemberSelectionGroup()).basicAdd(otherEnd, msgs);
			case OlapPackage.CUBE_REGION__CUBE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCube((Cube)otherEnd, msgs);
			case OlapPackage.CUBE_REGION__CUBE_DEPLOYMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCubeDeployment()).basicAdd(otherEnd, msgs);
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
			case OlapPackage.CUBE_REGION__MEMBER_SELECTION_GROUP:
				return ((InternalEList<?>)getMemberSelectionGroup()).basicRemove(otherEnd, msgs);
			case OlapPackage.CUBE_REGION__CUBE:
				return basicSetCube(null, msgs);
			case OlapPackage.CUBE_REGION__CUBE_DEPLOYMENT:
				return ((InternalEList<?>)getCubeDeployment()).basicRemove(otherEnd, msgs);
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
			case OlapPackage.CUBE_REGION__CUBE:
				return eInternalContainer().eInverseRemove(this, OlapPackage.CUBE__CUBE_REGION, Cube.class, msgs);
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
			case OlapPackage.CUBE_REGION__IS_READ_ONLY:
				return getIsReadOnly();
			case OlapPackage.CUBE_REGION__IS_FULLY_REALIZED:
				return getIsFullyRealized();
			case OlapPackage.CUBE_REGION__MEMBER_SELECTION_GROUP:
				return getMemberSelectionGroup();
			case OlapPackage.CUBE_REGION__CUBE:
				return getCube();
			case OlapPackage.CUBE_REGION__CUBE_DEPLOYMENT:
				return getCubeDeployment();
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
			case OlapPackage.CUBE_REGION__IS_READ_ONLY:
				setIsReadOnly((Boolean)newValue);
				return;
			case OlapPackage.CUBE_REGION__IS_FULLY_REALIZED:
				setIsFullyRealized((Boolean)newValue);
				return;
			case OlapPackage.CUBE_REGION__MEMBER_SELECTION_GROUP:
				getMemberSelectionGroup().clear();
				getMemberSelectionGroup().addAll((Collection<? extends MemberSelectionGroup>)newValue);
				return;
			case OlapPackage.CUBE_REGION__CUBE:
				setCube((Cube)newValue);
				return;
			case OlapPackage.CUBE_REGION__CUBE_DEPLOYMENT:
				getCubeDeployment().clear();
				getCubeDeployment().addAll((Collection<? extends CubeDeployment>)newValue);
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
			case OlapPackage.CUBE_REGION__IS_READ_ONLY:
				setIsReadOnly(IS_READ_ONLY_EDEFAULT);
				return;
			case OlapPackage.CUBE_REGION__IS_FULLY_REALIZED:
				setIsFullyRealized(IS_FULLY_REALIZED_EDEFAULT);
				return;
			case OlapPackage.CUBE_REGION__MEMBER_SELECTION_GROUP:
				getMemberSelectionGroup().clear();
				return;
			case OlapPackage.CUBE_REGION__CUBE:
				setCube((Cube)null);
				return;
			case OlapPackage.CUBE_REGION__CUBE_DEPLOYMENT:
				getCubeDeployment().clear();
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
			case OlapPackage.CUBE_REGION__IS_READ_ONLY:
				return IS_READ_ONLY_EDEFAULT == null ? isReadOnly != null : !IS_READ_ONLY_EDEFAULT.equals(isReadOnly);
			case OlapPackage.CUBE_REGION__IS_FULLY_REALIZED:
				return IS_FULLY_REALIZED_EDEFAULT == null ? isFullyRealized != null : !IS_FULLY_REALIZED_EDEFAULT.equals(isFullyRealized);
			case OlapPackage.CUBE_REGION__MEMBER_SELECTION_GROUP:
				return memberSelectionGroup != null && !memberSelectionGroup.isEmpty();
			case OlapPackage.CUBE_REGION__CUBE:
				return getCube() != null;
			case OlapPackage.CUBE_REGION__CUBE_DEPLOYMENT:
				return cubeDeployment != null && !cubeDeployment.isEmpty();
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
		result.append(" (isReadOnly: ");
		result.append(isReadOnly);
		result.append(", isFullyRealized: ");
		result.append(isFullyRealized);
		result.append(')');
		return result.toString();
	}

} //CubeRegionImpl

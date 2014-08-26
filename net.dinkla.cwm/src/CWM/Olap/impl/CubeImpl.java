/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Olap.impl;

import CWM.Core.impl.ClassImpl;

import CWM.Olap.Cube;
import CWM.Olap.CubeDimensionAssociation;
import CWM.Olap.CubeRegion;
import CWM.Olap.OlapPackage;
import CWM.Olap.Schema;

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
 * An implementation of the model object '<em><b>Cube</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.Olap.impl.CubeImpl#getIsVirtual <em>Is Virtual</em>}</li>
 *   <li>{@link CWM.Olap.impl.CubeImpl#getCubeDimensionAssociation <em>Cube Dimension Association</em>}</li>
 *   <li>{@link CWM.Olap.impl.CubeImpl#getCubeRegion <em>Cube Region</em>}</li>
 *   <li>{@link CWM.Olap.impl.CubeImpl#getSchema <em>Schema</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CubeImpl extends ClassImpl implements Cube {
	/**
	 * The default value of the '{@link #getIsVirtual() <em>Is Virtual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsVirtual()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_VIRTUAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsVirtual() <em>Is Virtual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsVirtual()
	 * @generated
	 * @ordered
	 */
	protected Boolean isVirtual = IS_VIRTUAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCubeDimensionAssociation() <em>Cube Dimension Association</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCubeDimensionAssociation()
	 * @generated
	 * @ordered
	 */
	protected EList<CubeDimensionAssociation> cubeDimensionAssociation;

	/**
	 * The cached value of the '{@link #getCubeRegion() <em>Cube Region</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCubeRegion()
	 * @generated
	 * @ordered
	 */
	protected EList<CubeRegion> cubeRegion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CubeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OlapPackage.Literals.CUBE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsVirtual() {
		return isVirtual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsVirtual(Boolean newIsVirtual) {
		Boolean oldIsVirtual = isVirtual;
		isVirtual = newIsVirtual;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OlapPackage.CUBE__IS_VIRTUAL, oldIsVirtual, isVirtual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CubeDimensionAssociation> getCubeDimensionAssociation() {
		if (cubeDimensionAssociation == null) {
			cubeDimensionAssociation = new EObjectContainmentWithInverseEList<CubeDimensionAssociation>(CubeDimensionAssociation.class, this, OlapPackage.CUBE__CUBE_DIMENSION_ASSOCIATION, OlapPackage.CUBE_DIMENSION_ASSOCIATION__CUBE);
		}
		return cubeDimensionAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CubeRegion> getCubeRegion() {
		if (cubeRegion == null) {
			cubeRegion = new EObjectContainmentWithInverseEList<CubeRegion>(CubeRegion.class, this, OlapPackage.CUBE__CUBE_REGION, OlapPackage.CUBE_REGION__CUBE);
		}
		return cubeRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema getSchema() {
		if (eContainerFeatureID != OlapPackage.CUBE__SCHEMA) return null;
		return (Schema)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchema(Schema newSchema, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSchema, OlapPackage.CUBE__SCHEMA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchema(Schema newSchema) {
		if (newSchema != eInternalContainer() || (eContainerFeatureID != OlapPackage.CUBE__SCHEMA && newSchema != null)) {
			if (EcoreUtil.isAncestor(this, newSchema))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSchema != null)
				msgs = ((InternalEObject)newSchema).eInverseAdd(this, OlapPackage.SCHEMA__CUBE, Schema.class, msgs);
			msgs = basicSetSchema(newSchema, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OlapPackage.CUBE__SCHEMA, newSchema, newSchema));
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
			case OlapPackage.CUBE__CUBE_DIMENSION_ASSOCIATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCubeDimensionAssociation()).basicAdd(otherEnd, msgs);
			case OlapPackage.CUBE__CUBE_REGION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCubeRegion()).basicAdd(otherEnd, msgs);
			case OlapPackage.CUBE__SCHEMA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSchema((Schema)otherEnd, msgs);
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
			case OlapPackage.CUBE__CUBE_DIMENSION_ASSOCIATION:
				return ((InternalEList<?>)getCubeDimensionAssociation()).basicRemove(otherEnd, msgs);
			case OlapPackage.CUBE__CUBE_REGION:
				return ((InternalEList<?>)getCubeRegion()).basicRemove(otherEnd, msgs);
			case OlapPackage.CUBE__SCHEMA:
				return basicSetSchema(null, msgs);
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
			case OlapPackage.CUBE__SCHEMA:
				return eInternalContainer().eInverseRemove(this, OlapPackage.SCHEMA__CUBE, Schema.class, msgs);
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
			case OlapPackage.CUBE__IS_VIRTUAL:
				return getIsVirtual();
			case OlapPackage.CUBE__CUBE_DIMENSION_ASSOCIATION:
				return getCubeDimensionAssociation();
			case OlapPackage.CUBE__CUBE_REGION:
				return getCubeRegion();
			case OlapPackage.CUBE__SCHEMA:
				return getSchema();
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
			case OlapPackage.CUBE__IS_VIRTUAL:
				setIsVirtual((Boolean)newValue);
				return;
			case OlapPackage.CUBE__CUBE_DIMENSION_ASSOCIATION:
				getCubeDimensionAssociation().clear();
				getCubeDimensionAssociation().addAll((Collection<? extends CubeDimensionAssociation>)newValue);
				return;
			case OlapPackage.CUBE__CUBE_REGION:
				getCubeRegion().clear();
				getCubeRegion().addAll((Collection<? extends CubeRegion>)newValue);
				return;
			case OlapPackage.CUBE__SCHEMA:
				setSchema((Schema)newValue);
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
			case OlapPackage.CUBE__IS_VIRTUAL:
				setIsVirtual(IS_VIRTUAL_EDEFAULT);
				return;
			case OlapPackage.CUBE__CUBE_DIMENSION_ASSOCIATION:
				getCubeDimensionAssociation().clear();
				return;
			case OlapPackage.CUBE__CUBE_REGION:
				getCubeRegion().clear();
				return;
			case OlapPackage.CUBE__SCHEMA:
				setSchema((Schema)null);
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
			case OlapPackage.CUBE__IS_VIRTUAL:
				return IS_VIRTUAL_EDEFAULT == null ? isVirtual != null : !IS_VIRTUAL_EDEFAULT.equals(isVirtual);
			case OlapPackage.CUBE__CUBE_DIMENSION_ASSOCIATION:
				return cubeDimensionAssociation != null && !cubeDimensionAssociation.isEmpty();
			case OlapPackage.CUBE__CUBE_REGION:
				return cubeRegion != null && !cubeRegion.isEmpty();
			case OlapPackage.CUBE__SCHEMA:
				return getSchema() != null;
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
		result.append(" (isVirtual: ");
		result.append(isVirtual);
		result.append(')');
		return result.toString();
	}

} //CubeImpl

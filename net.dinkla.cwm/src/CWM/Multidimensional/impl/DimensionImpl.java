/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Multidimensional.impl;

import CWM.Core.impl.ClassImpl;

import CWM.Multidimensional.Dimension;
import CWM.Multidimensional.DimensionedObject;
import CWM.Multidimensional.MemberSet;
import CWM.Multidimensional.MultidimensionalPackage;
import CWM.Multidimensional.Schema;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dimension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.Multidimensional.impl.DimensionImpl#getDimensionedObject <em>Dimensioned Object</em>}</li>
 *   <li>{@link CWM.Multidimensional.impl.DimensionImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link CWM.Multidimensional.impl.DimensionImpl#getComposite <em>Composite</em>}</li>
 *   <li>{@link CWM.Multidimensional.impl.DimensionImpl#getMemberSet <em>Member Set</em>}</li>
 *   <li>{@link CWM.Multidimensional.impl.DimensionImpl#getSchema <em>Schema</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DimensionImpl extends ClassImpl implements Dimension {
	/**
	 * The cached value of the '{@link #getDimensionedObject() <em>Dimensioned Object</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensionedObject()
	 * @generated
	 * @ordered
	 */
	protected EList<DimensionedObject> dimensionedObject;

	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<Dimension> component;

	/**
	 * The cached value of the '{@link #getComposite() <em>Composite</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposite()
	 * @generated
	 * @ordered
	 */
	protected EList<Dimension> composite;

	/**
	 * The cached value of the '{@link #getMemberSet() <em>Member Set</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberSet()
	 * @generated
	 * @ordered
	 */
	protected EList<MemberSet> memberSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DimensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MultidimensionalPackage.Literals.DIMENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DimensionedObject> getDimensionedObject() {
		if (dimensionedObject == null) {
			dimensionedObject = new EObjectWithInverseResolvingEList.ManyInverse<DimensionedObject>(DimensionedObject.class, this, MultidimensionalPackage.DIMENSION__DIMENSIONED_OBJECT, MultidimensionalPackage.DIMENSIONED_OBJECT__DIMENSION);
		}
		return dimensionedObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dimension> getComponent() {
		if (component == null) {
			component = new EObjectWithInverseResolvingEList.ManyInverse<Dimension>(Dimension.class, this, MultidimensionalPackage.DIMENSION__COMPONENT, MultidimensionalPackage.DIMENSION__COMPOSITE);
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dimension> getComposite() {
		if (composite == null) {
			composite = new EObjectWithInverseResolvingEList.ManyInverse<Dimension>(Dimension.class, this, MultidimensionalPackage.DIMENSION__COMPOSITE, MultidimensionalPackage.DIMENSION__COMPONENT);
		}
		return composite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MemberSet> getMemberSet() {
		if (memberSet == null) {
			memberSet = new EObjectContainmentWithInverseEList<MemberSet>(MemberSet.class, this, MultidimensionalPackage.DIMENSION__MEMBER_SET, MultidimensionalPackage.MEMBER_SET__DIMENSION);
		}
		return memberSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema getSchema() {
		if (eContainerFeatureID != MultidimensionalPackage.DIMENSION__SCHEMA) return null;
		return (Schema)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchema(Schema newSchema, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSchema, MultidimensionalPackage.DIMENSION__SCHEMA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchema(Schema newSchema) {
		if (newSchema != eInternalContainer() || (eContainerFeatureID != MultidimensionalPackage.DIMENSION__SCHEMA && newSchema != null)) {
			if (EcoreUtil.isAncestor(this, newSchema))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSchema != null)
				msgs = ((InternalEObject)newSchema).eInverseAdd(this, MultidimensionalPackage.SCHEMA__DIMENSION, Schema.class, msgs);
			msgs = basicSetSchema(newSchema, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MultidimensionalPackage.DIMENSION__SCHEMA, newSchema, newSchema));
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
			case MultidimensionalPackage.DIMENSION__DIMENSIONED_OBJECT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDimensionedObject()).basicAdd(otherEnd, msgs);
			case MultidimensionalPackage.DIMENSION__COMPONENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getComponent()).basicAdd(otherEnd, msgs);
			case MultidimensionalPackage.DIMENSION__COMPOSITE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getComposite()).basicAdd(otherEnd, msgs);
			case MultidimensionalPackage.DIMENSION__MEMBER_SET:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMemberSet()).basicAdd(otherEnd, msgs);
			case MultidimensionalPackage.DIMENSION__SCHEMA:
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
			case MultidimensionalPackage.DIMENSION__DIMENSIONED_OBJECT:
				return ((InternalEList<?>)getDimensionedObject()).basicRemove(otherEnd, msgs);
			case MultidimensionalPackage.DIMENSION__COMPONENT:
				return ((InternalEList<?>)getComponent()).basicRemove(otherEnd, msgs);
			case MultidimensionalPackage.DIMENSION__COMPOSITE:
				return ((InternalEList<?>)getComposite()).basicRemove(otherEnd, msgs);
			case MultidimensionalPackage.DIMENSION__MEMBER_SET:
				return ((InternalEList<?>)getMemberSet()).basicRemove(otherEnd, msgs);
			case MultidimensionalPackage.DIMENSION__SCHEMA:
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
			case MultidimensionalPackage.DIMENSION__SCHEMA:
				return eInternalContainer().eInverseRemove(this, MultidimensionalPackage.SCHEMA__DIMENSION, Schema.class, msgs);
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
			case MultidimensionalPackage.DIMENSION__DIMENSIONED_OBJECT:
				return getDimensionedObject();
			case MultidimensionalPackage.DIMENSION__COMPONENT:
				return getComponent();
			case MultidimensionalPackage.DIMENSION__COMPOSITE:
				return getComposite();
			case MultidimensionalPackage.DIMENSION__MEMBER_SET:
				return getMemberSet();
			case MultidimensionalPackage.DIMENSION__SCHEMA:
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
			case MultidimensionalPackage.DIMENSION__DIMENSIONED_OBJECT:
				getDimensionedObject().clear();
				getDimensionedObject().addAll((Collection<? extends DimensionedObject>)newValue);
				return;
			case MultidimensionalPackage.DIMENSION__COMPONENT:
				getComponent().clear();
				getComponent().addAll((Collection<? extends Dimension>)newValue);
				return;
			case MultidimensionalPackage.DIMENSION__COMPOSITE:
				getComposite().clear();
				getComposite().addAll((Collection<? extends Dimension>)newValue);
				return;
			case MultidimensionalPackage.DIMENSION__MEMBER_SET:
				getMemberSet().clear();
				getMemberSet().addAll((Collection<? extends MemberSet>)newValue);
				return;
			case MultidimensionalPackage.DIMENSION__SCHEMA:
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
			case MultidimensionalPackage.DIMENSION__DIMENSIONED_OBJECT:
				getDimensionedObject().clear();
				return;
			case MultidimensionalPackage.DIMENSION__COMPONENT:
				getComponent().clear();
				return;
			case MultidimensionalPackage.DIMENSION__COMPOSITE:
				getComposite().clear();
				return;
			case MultidimensionalPackage.DIMENSION__MEMBER_SET:
				getMemberSet().clear();
				return;
			case MultidimensionalPackage.DIMENSION__SCHEMA:
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
			case MultidimensionalPackage.DIMENSION__DIMENSIONED_OBJECT:
				return dimensionedObject != null && !dimensionedObject.isEmpty();
			case MultidimensionalPackage.DIMENSION__COMPONENT:
				return component != null && !component.isEmpty();
			case MultidimensionalPackage.DIMENSION__COMPOSITE:
				return composite != null && !composite.isEmpty();
			case MultidimensionalPackage.DIMENSION__MEMBER_SET:
				return memberSet != null && !memberSet.isEmpty();
			case MultidimensionalPackage.DIMENSION__SCHEMA:
				return getSchema() != null;
		}
		return super.eIsSet(featureID);
	}

} //DimensionImpl

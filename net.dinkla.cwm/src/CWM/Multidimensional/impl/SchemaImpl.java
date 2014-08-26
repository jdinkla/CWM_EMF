/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Multidimensional.impl;

import CWM.Core.impl.PackageImpl;

import CWM.Multidimensional.Dimension;
import CWM.Multidimensional.DimensionedObject;
import CWM.Multidimensional.MultidimensionalPackage;
import CWM.Multidimensional.Schema;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.Multidimensional.impl.SchemaImpl#getDimensionedObject <em>Dimensioned Object</em>}</li>
 *   <li>{@link CWM.Multidimensional.impl.SchemaImpl#getDimension <em>Dimension</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SchemaImpl extends PackageImpl implements Schema {
	/**
	 * The cached value of the '{@link #getDimensionedObject() <em>Dimensioned Object</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensionedObject()
	 * @generated
	 * @ordered
	 */
	protected EList<DimensionedObject> dimensionedObject;

	/**
	 * The cached value of the '{@link #getDimension() <em>Dimension</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimension()
	 * @generated
	 * @ordered
	 */
	protected EList<Dimension> dimension;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchemaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MultidimensionalPackage.Literals.SCHEMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DimensionedObject> getDimensionedObject() {
		if (dimensionedObject == null) {
			dimensionedObject = new EObjectContainmentWithInverseEList<DimensionedObject>(DimensionedObject.class, this, MultidimensionalPackage.SCHEMA__DIMENSIONED_OBJECT, MultidimensionalPackage.DIMENSIONED_OBJECT__SCHEMA);
		}
		return dimensionedObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dimension> getDimension() {
		if (dimension == null) {
			dimension = new EObjectContainmentWithInverseEList<Dimension>(Dimension.class, this, MultidimensionalPackage.SCHEMA__DIMENSION, MultidimensionalPackage.DIMENSION__SCHEMA);
		}
		return dimension;
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
			case MultidimensionalPackage.SCHEMA__DIMENSIONED_OBJECT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDimensionedObject()).basicAdd(otherEnd, msgs);
			case MultidimensionalPackage.SCHEMA__DIMENSION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDimension()).basicAdd(otherEnd, msgs);
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
			case MultidimensionalPackage.SCHEMA__DIMENSIONED_OBJECT:
				return ((InternalEList<?>)getDimensionedObject()).basicRemove(otherEnd, msgs);
			case MultidimensionalPackage.SCHEMA__DIMENSION:
				return ((InternalEList<?>)getDimension()).basicRemove(otherEnd, msgs);
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
			case MultidimensionalPackage.SCHEMA__DIMENSIONED_OBJECT:
				return getDimensionedObject();
			case MultidimensionalPackage.SCHEMA__DIMENSION:
				return getDimension();
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
			case MultidimensionalPackage.SCHEMA__DIMENSIONED_OBJECT:
				getDimensionedObject().clear();
				getDimensionedObject().addAll((Collection<? extends DimensionedObject>)newValue);
				return;
			case MultidimensionalPackage.SCHEMA__DIMENSION:
				getDimension().clear();
				getDimension().addAll((Collection<? extends Dimension>)newValue);
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
			case MultidimensionalPackage.SCHEMA__DIMENSIONED_OBJECT:
				getDimensionedObject().clear();
				return;
			case MultidimensionalPackage.SCHEMA__DIMENSION:
				getDimension().clear();
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
			case MultidimensionalPackage.SCHEMA__DIMENSIONED_OBJECT:
				return dimensionedObject != null && !dimensionedObject.isEmpty();
			case MultidimensionalPackage.SCHEMA__DIMENSION:
				return dimension != null && !dimension.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SchemaImpl

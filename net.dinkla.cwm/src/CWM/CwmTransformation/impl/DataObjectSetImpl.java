/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.CwmTransformation.impl;

import CWM.Core.ModelElement;

import CWM.Core.impl.ModelElementImpl;

import CWM.CwmTransformation.CwmTransformationPackage;
import CWM.CwmTransformation.DataObjectSet;
import CWM.CwmTransformation.Transformation;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Object Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.CwmTransformation.impl.DataObjectSetImpl#getElement <em>Element</em>}</li>
 *   <li>{@link CWM.CwmTransformation.impl.DataObjectSetImpl#getSourceTransformation <em>Source Transformation</em>}</li>
 *   <li>{@link CWM.CwmTransformation.impl.DataObjectSetImpl#getTargetTransformation <em>Target Transformation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataObjectSetImpl extends ModelElementImpl implements DataObjectSet {
	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelElement> element;

	/**
	 * The cached value of the '{@link #getSourceTransformation() <em>Source Transformation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceTransformation()
	 * @generated
	 * @ordered
	 */
	protected EList<Transformation> sourceTransformation;

	/**
	 * The cached value of the '{@link #getTargetTransformation() <em>Target Transformation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetTransformation()
	 * @generated
	 * @ordered
	 */
	protected EList<Transformation> targetTransformation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataObjectSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CwmTransformationPackage.Literals.DATA_OBJECT_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelElement> getElement() {
		if (element == null) {
			element = new EObjectResolvingEList<ModelElement>(ModelElement.class, this, CwmTransformationPackage.DATA_OBJECT_SET__ELEMENT);
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transformation> getSourceTransformation() {
		if (sourceTransformation == null) {
			sourceTransformation = new EObjectWithInverseResolvingEList.ManyInverse<Transformation>(Transformation.class, this, CwmTransformationPackage.DATA_OBJECT_SET__SOURCE_TRANSFORMATION, CwmTransformationPackage.TRANSFORMATION__SOURCE);
		}
		return sourceTransformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transformation> getTargetTransformation() {
		if (targetTransformation == null) {
			targetTransformation = new EObjectWithInverseResolvingEList.ManyInverse<Transformation>(Transformation.class, this, CwmTransformationPackage.DATA_OBJECT_SET__TARGET_TRANSFORMATION, CwmTransformationPackage.TRANSFORMATION__TARGET);
		}
		return targetTransformation;
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
			case CwmTransformationPackage.DATA_OBJECT_SET__SOURCE_TRANSFORMATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSourceTransformation()).basicAdd(otherEnd, msgs);
			case CwmTransformationPackage.DATA_OBJECT_SET__TARGET_TRANSFORMATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTargetTransformation()).basicAdd(otherEnd, msgs);
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
			case CwmTransformationPackage.DATA_OBJECT_SET__SOURCE_TRANSFORMATION:
				return ((InternalEList<?>)getSourceTransformation()).basicRemove(otherEnd, msgs);
			case CwmTransformationPackage.DATA_OBJECT_SET__TARGET_TRANSFORMATION:
				return ((InternalEList<?>)getTargetTransformation()).basicRemove(otherEnd, msgs);
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
			case CwmTransformationPackage.DATA_OBJECT_SET__ELEMENT:
				return getElement();
			case CwmTransformationPackage.DATA_OBJECT_SET__SOURCE_TRANSFORMATION:
				return getSourceTransformation();
			case CwmTransformationPackage.DATA_OBJECT_SET__TARGET_TRANSFORMATION:
				return getTargetTransformation();
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
			case CwmTransformationPackage.DATA_OBJECT_SET__ELEMENT:
				getElement().clear();
				getElement().addAll((Collection<? extends ModelElement>)newValue);
				return;
			case CwmTransformationPackage.DATA_OBJECT_SET__SOURCE_TRANSFORMATION:
				getSourceTransformation().clear();
				getSourceTransformation().addAll((Collection<? extends Transformation>)newValue);
				return;
			case CwmTransformationPackage.DATA_OBJECT_SET__TARGET_TRANSFORMATION:
				getTargetTransformation().clear();
				getTargetTransformation().addAll((Collection<? extends Transformation>)newValue);
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
			case CwmTransformationPackage.DATA_OBJECT_SET__ELEMENT:
				getElement().clear();
				return;
			case CwmTransformationPackage.DATA_OBJECT_SET__SOURCE_TRANSFORMATION:
				getSourceTransformation().clear();
				return;
			case CwmTransformationPackage.DATA_OBJECT_SET__TARGET_TRANSFORMATION:
				getTargetTransformation().clear();
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
			case CwmTransformationPackage.DATA_OBJECT_SET__ELEMENT:
				return element != null && !element.isEmpty();
			case CwmTransformationPackage.DATA_OBJECT_SET__SOURCE_TRANSFORMATION:
				return sourceTransformation != null && !sourceTransformation.isEmpty();
			case CwmTransformationPackage.DATA_OBJECT_SET__TARGET_TRANSFORMATION:
				return targetTransformation != null && !targetTransformation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataObjectSetImpl

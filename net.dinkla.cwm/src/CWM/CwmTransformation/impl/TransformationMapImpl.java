/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.CwmTransformation.impl;

import CWM.Core.ModelElement;

import CWM.CwmTransformation.CwmTransformationPackage;
import CWM.CwmTransformation.TransformationMap;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformation Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.CwmTransformation.impl.TransformationMapImpl#getClassifierMap <em>Classifier Map</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransformationMapImpl extends TransformationImpl implements TransformationMap {
	/**
	 * The cached value of the '{@link #getClassifierMap() <em>Classifier Map</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifierMap()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelElement> classifierMap;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformationMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CwmTransformationPackage.Literals.TRANSFORMATION_MAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelElement> getClassifierMap() {
		if (classifierMap == null) {
			classifierMap = new EObjectContainmentEList<ModelElement>(ModelElement.class, this, CwmTransformationPackage.TRANSFORMATION_MAP__CLASSIFIER_MAP);
		}
		return classifierMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CwmTransformationPackage.TRANSFORMATION_MAP__CLASSIFIER_MAP:
				return ((InternalEList<?>)getClassifierMap()).basicRemove(otherEnd, msgs);
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
			case CwmTransformationPackage.TRANSFORMATION_MAP__CLASSIFIER_MAP:
				return getClassifierMap();
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
			case CwmTransformationPackage.TRANSFORMATION_MAP__CLASSIFIER_MAP:
				getClassifierMap().clear();
				getClassifierMap().addAll((Collection<? extends ModelElement>)newValue);
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
			case CwmTransformationPackage.TRANSFORMATION_MAP__CLASSIFIER_MAP:
				getClassifierMap().clear();
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
			case CwmTransformationPackage.TRANSFORMATION_MAP__CLASSIFIER_MAP:
				return classifierMap != null && !classifierMap.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TransformationMapImpl

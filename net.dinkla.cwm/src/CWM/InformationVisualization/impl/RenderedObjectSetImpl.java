/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.InformationVisualization.impl;

import CWM.Core.impl.PackageImpl;

import CWM.InformationVisualization.InformationVisualizationPackage;
import CWM.InformationVisualization.RenderedObject;
import CWM.InformationVisualization.RenderedObjectSet;
import CWM.InformationVisualization.Rendering;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rendered Object Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.InformationVisualization.impl.RenderedObjectSetImpl#getRenderedObject <em>Rendered Object</em>}</li>
 *   <li>{@link CWM.InformationVisualization.impl.RenderedObjectSetImpl#getRendering <em>Rendering</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RenderedObjectSetImpl extends PackageImpl implements RenderedObjectSet {
	/**
	 * The cached value of the '{@link #getRenderedObject() <em>Rendered Object</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRenderedObject()
	 * @generated
	 * @ordered
	 */
	protected EList<RenderedObject> renderedObject;

	/**
	 * The cached value of the '{@link #getRendering() <em>Rendering</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRendering()
	 * @generated
	 * @ordered
	 */
	protected EList<Rendering> rendering;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RenderedObjectSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InformationVisualizationPackage.Literals.RENDERED_OBJECT_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RenderedObject> getRenderedObject() {
		if (renderedObject == null) {
			renderedObject = new EObjectContainmentWithInverseEList<RenderedObject>(RenderedObject.class, this, InformationVisualizationPackage.RENDERED_OBJECT_SET__RENDERED_OBJECT, InformationVisualizationPackage.RENDERED_OBJECT__RENDERED_OBJECT_SET);
		}
		return renderedObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rendering> getRendering() {
		if (rendering == null) {
			rendering = new EObjectContainmentWithInverseEList<Rendering>(Rendering.class, this, InformationVisualizationPackage.RENDERED_OBJECT_SET__RENDERING, InformationVisualizationPackage.RENDERING__RENDERED_OBJECT_SET);
		}
		return rendering;
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
			case InformationVisualizationPackage.RENDERED_OBJECT_SET__RENDERED_OBJECT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRenderedObject()).basicAdd(otherEnd, msgs);
			case InformationVisualizationPackage.RENDERED_OBJECT_SET__RENDERING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRendering()).basicAdd(otherEnd, msgs);
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
			case InformationVisualizationPackage.RENDERED_OBJECT_SET__RENDERED_OBJECT:
				return ((InternalEList<?>)getRenderedObject()).basicRemove(otherEnd, msgs);
			case InformationVisualizationPackage.RENDERED_OBJECT_SET__RENDERING:
				return ((InternalEList<?>)getRendering()).basicRemove(otherEnd, msgs);
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
			case InformationVisualizationPackage.RENDERED_OBJECT_SET__RENDERED_OBJECT:
				return getRenderedObject();
			case InformationVisualizationPackage.RENDERED_OBJECT_SET__RENDERING:
				return getRendering();
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
			case InformationVisualizationPackage.RENDERED_OBJECT_SET__RENDERED_OBJECT:
				getRenderedObject().clear();
				getRenderedObject().addAll((Collection<? extends RenderedObject>)newValue);
				return;
			case InformationVisualizationPackage.RENDERED_OBJECT_SET__RENDERING:
				getRendering().clear();
				getRendering().addAll((Collection<? extends Rendering>)newValue);
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
			case InformationVisualizationPackage.RENDERED_OBJECT_SET__RENDERED_OBJECT:
				getRenderedObject().clear();
				return;
			case InformationVisualizationPackage.RENDERED_OBJECT_SET__RENDERING:
				getRendering().clear();
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
			case InformationVisualizationPackage.RENDERED_OBJECT_SET__RENDERED_OBJECT:
				return renderedObject != null && !renderedObject.isEmpty();
			case InformationVisualizationPackage.RENDERED_OBJECT_SET__RENDERING:
				return rendering != null && !rendering.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RenderedObjectSetImpl

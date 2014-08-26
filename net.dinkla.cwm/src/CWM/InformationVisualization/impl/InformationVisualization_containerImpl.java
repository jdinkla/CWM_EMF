/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.InformationVisualization.impl;

import CWM.InformationVisualization.InformationVisualizationPackage;
import CWM.InformationVisualization.InformationVisualization_container;
import CWM.InformationVisualization.RenderedObject;
import CWM.InformationVisualization.RenderedObjectSet;
import CWM.InformationVisualization.Rendering;
import CWM.InformationVisualization.XSLRendering;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Information Visualization container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.InformationVisualization.impl.InformationVisualization_containerImpl#getRenderedObject <em>Rendered Object</em>}</li>
 *   <li>{@link CWM.InformationVisualization.impl.InformationVisualization_containerImpl#getRenderedObjectSet <em>Rendered Object Set</em>}</li>
 *   <li>{@link CWM.InformationVisualization.impl.InformationVisualization_containerImpl#getRendering <em>Rendering</em>}</li>
 *   <li>{@link CWM.InformationVisualization.impl.InformationVisualization_containerImpl#getXSLRendering <em>XSL Rendering</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InformationVisualization_containerImpl extends EObjectImpl implements InformationVisualization_container {
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
	 * The cached value of the '{@link #getRenderedObjectSet() <em>Rendered Object Set</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRenderedObjectSet()
	 * @generated
	 * @ordered
	 */
	protected EList<RenderedObjectSet> renderedObjectSet;

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
	 * The cached value of the '{@link #getXSLRendering() <em>XSL Rendering</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSLRendering()
	 * @generated
	 * @ordered
	 */
	protected EList<XSLRendering> xslRendering;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InformationVisualization_containerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InformationVisualizationPackage.Literals.INFORMATION_VISUALIZATION_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RenderedObject> getRenderedObject() {
		if (renderedObject == null) {
			renderedObject = new EObjectContainmentEList<RenderedObject>(RenderedObject.class, this, InformationVisualizationPackage.INFORMATION_VISUALIZATION_CONTAINER__RENDERED_OBJECT);
		}
		return renderedObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RenderedObjectSet> getRenderedObjectSet() {
		if (renderedObjectSet == null) {
			renderedObjectSet = new EObjectContainmentEList<RenderedObjectSet>(RenderedObjectSet.class, this, InformationVisualizationPackage.INFORMATION_VISUALIZATION_CONTAINER__RENDERED_OBJECT_SET);
		}
		return renderedObjectSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rendering> getRendering() {
		if (rendering == null) {
			rendering = new EObjectContainmentEList<Rendering>(Rendering.class, this, InformationVisualizationPackage.INFORMATION_VISUALIZATION_CONTAINER__RENDERING);
		}
		return rendering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XSLRendering> getXSLRendering() {
		if (xslRendering == null) {
			xslRendering = new EObjectContainmentEList<XSLRendering>(XSLRendering.class, this, InformationVisualizationPackage.INFORMATION_VISUALIZATION_CONTAINER__XSL_RENDERING);
		}
		return xslRendering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InformationVisualizationPackage.INFORMATION_VISUALIZATION_CONTAINER__RENDERED_OBJECT:
				return ((InternalEList<?>)getRenderedObject()).basicRemove(otherEnd, msgs);
			case InformationVisualizationPackage.INFORMATION_VISUALIZATION_CONTAINER__RENDERED_OBJECT_SET:
				return ((InternalEList<?>)getRenderedObjectSet()).basicRemove(otherEnd, msgs);
			case InformationVisualizationPackage.INFORMATION_VISUALIZATION_CONTAINER__RENDERING:
				return ((InternalEList<?>)getRendering()).basicRemove(otherEnd, msgs);
			case InformationVisualizationPackage.INFORMATION_VISUALIZATION_CONTAINER__XSL_RENDERING:
				return ((InternalEList<?>)getXSLRendering()).basicRemove(otherEnd, msgs);
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
			case InformationVisualizationPackage.INFORMATION_VISUALIZATION_CONTAINER__RENDERED_OBJECT:
				return getRenderedObject();
			case InformationVisualizationPackage.INFORMATION_VISUALIZATION_CONTAINER__RENDERED_OBJECT_SET:
				return getRenderedObjectSet();
			case InformationVisualizationPackage.INFORMATION_VISUALIZATION_CONTAINER__RENDERING:
				return getRendering();
			case InformationVisualizationPackage.INFORMATION_VISUALIZATION_CONTAINER__XSL_RENDERING:
				return getXSLRendering();
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
			case InformationVisualizationPackage.INFORMATION_VISUALIZATION_CONTAINER__RENDERED_OBJECT:
				getRenderedObject().clear();
				getRenderedObject().addAll((Collection<? extends RenderedObject>)newValue);
				return;
			case InformationVisualizationPackage.INFORMATION_VISUALIZATION_CONTAINER__RENDERED_OBJECT_SET:
				getRenderedObjectSet().clear();
				getRenderedObjectSet().addAll((Collection<? extends RenderedObjectSet>)newValue);
				return;
			case InformationVisualizationPackage.INFORMATION_VISUALIZATION_CONTAINER__RENDERING:
				getRendering().clear();
				getRendering().addAll((Collection<? extends Rendering>)newValue);
				return;
			case InformationVisualizationPackage.INFORMATION_VISUALIZATION_CONTAINER__XSL_RENDERING:
				getXSLRendering().clear();
				getXSLRendering().addAll((Collection<? extends XSLRendering>)newValue);
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
			case InformationVisualizationPackage.INFORMATION_VISUALIZATION_CONTAINER__RENDERED_OBJECT:
				getRenderedObject().clear();
				return;
			case InformationVisualizationPackage.INFORMATION_VISUALIZATION_CONTAINER__RENDERED_OBJECT_SET:
				getRenderedObjectSet().clear();
				return;
			case InformationVisualizationPackage.INFORMATION_VISUALIZATION_CONTAINER__RENDERING:
				getRendering().clear();
				return;
			case InformationVisualizationPackage.INFORMATION_VISUALIZATION_CONTAINER__XSL_RENDERING:
				getXSLRendering().clear();
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
			case InformationVisualizationPackage.INFORMATION_VISUALIZATION_CONTAINER__RENDERED_OBJECT:
				return renderedObject != null && !renderedObject.isEmpty();
			case InformationVisualizationPackage.INFORMATION_VISUALIZATION_CONTAINER__RENDERED_OBJECT_SET:
				return renderedObjectSet != null && !renderedObjectSet.isEmpty();
			case InformationVisualizationPackage.INFORMATION_VISUALIZATION_CONTAINER__RENDERING:
				return rendering != null && !rendering.isEmpty();
			case InformationVisualizationPackage.INFORMATION_VISUALIZATION_CONTAINER__XSL_RENDERING:
				return xslRendering != null && !xslRendering.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InformationVisualization_containerImpl

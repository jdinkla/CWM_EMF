/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.InformationVisualization.impl;

import CWM.Core.ModelElement;

import CWM.Core.impl.ClassifierImpl;

import CWM.Expressions.ExpressionNode;

import CWM.InformationVisualization.InformationVisualizationPackage;
import CWM.InformationVisualization.RenderedObject;
import CWM.InformationVisualization.RenderedObjectSet;
import CWM.InformationVisualization.Rendering;

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
 * An implementation of the model object '<em><b>Rendered Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.InformationVisualization.impl.RenderedObjectImpl#getFormula <em>Formula</em>}</li>
 *   <li>{@link CWM.InformationVisualization.impl.RenderedObjectImpl#getAction <em>Action</em>}</li>
 *   <li>{@link CWM.InformationVisualization.impl.RenderedObjectImpl#getFileName <em>File Name</em>}</li>
 *   <li>{@link CWM.InformationVisualization.impl.RenderedObjectImpl#getType <em>Type</em>}</li>
 *   <li>{@link CWM.InformationVisualization.impl.RenderedObjectImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link CWM.InformationVisualization.impl.RenderedObjectImpl#getRendering <em>Rendering</em>}</li>
 *   <li>{@link CWM.InformationVisualization.impl.RenderedObjectImpl#getDefaultRendering <em>Default Rendering</em>}</li>
 *   <li>{@link CWM.InformationVisualization.impl.RenderedObjectImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link CWM.InformationVisualization.impl.RenderedObjectImpl#getComposite <em>Composite</em>}</li>
 *   <li>{@link CWM.InformationVisualization.impl.RenderedObjectImpl#getNeighbor <em>Neighbor</em>}</li>
 *   <li>{@link CWM.InformationVisualization.impl.RenderedObjectImpl#getReferencingNeighbor <em>Referencing Neighbor</em>}</li>
 *   <li>{@link CWM.InformationVisualization.impl.RenderedObjectImpl#getModelElement <em>Model Element</em>}</li>
 *   <li>{@link CWM.InformationVisualization.impl.RenderedObjectImpl#getRenderedObjectSet <em>Rendered Object Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RenderedObjectImpl extends ClassifierImpl implements RenderedObject {
	/**
	 * The cached value of the '{@link #getFormula() <em>Formula</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormula()
	 * @generated
	 * @ordered
	 */
	protected ExpressionNode formula;

	/**
	 * The default value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected String action = ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected String fileName = FILE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRendering() <em>Rendering</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRendering()
	 * @generated
	 * @ordered
	 */
	protected EList<Rendering> rendering;

	/**
	 * The cached value of the '{@link #getDefaultRendering() <em>Default Rendering</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultRendering()
	 * @generated
	 * @ordered
	 */
	protected Rendering defaultRendering;

	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<RenderedObject> component;

	/**
	 * The cached value of the '{@link #getComposite() <em>Composite</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposite()
	 * @generated
	 * @ordered
	 */
	protected EList<RenderedObject> composite;

	/**
	 * The cached value of the '{@link #getNeighbor() <em>Neighbor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeighbor()
	 * @generated
	 * @ordered
	 */
	protected EList<RenderedObject> neighbor;

	/**
	 * The cached value of the '{@link #getReferencingNeighbor() <em>Referencing Neighbor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencingNeighbor()
	 * @generated
	 * @ordered
	 */
	protected EList<RenderedObject> referencingNeighbor;

	/**
	 * The cached value of the '{@link #getModelElement() <em>Model Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelElement()
	 * @generated
	 * @ordered
	 */
	protected ModelElement modelElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RenderedObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InformationVisualizationPackage.Literals.RENDERED_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionNode getFormula() {
		return formula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFormula(ExpressionNode newFormula, NotificationChain msgs) {
		ExpressionNode oldFormula = formula;
		formula = newFormula;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InformationVisualizationPackage.RENDERED_OBJECT__FORMULA, oldFormula, newFormula);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormula(ExpressionNode newFormula) {
		if (newFormula != formula) {
			NotificationChain msgs = null;
			if (formula != null)
				msgs = ((InternalEObject)formula).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InformationVisualizationPackage.RENDERED_OBJECT__FORMULA, null, msgs);
			if (newFormula != null)
				msgs = ((InternalEObject)newFormula).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InformationVisualizationPackage.RENDERED_OBJECT__FORMULA, null, msgs);
			msgs = basicSetFormula(newFormula, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InformationVisualizationPackage.RENDERED_OBJECT__FORMULA, newFormula, newFormula));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(String newAction) {
		String oldAction = action;
		action = newAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InformationVisualizationPackage.RENDERED_OBJECT__ACTION, oldAction, action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileName(String newFileName) {
		String oldFileName = fileName;
		fileName = newFileName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InformationVisualizationPackage.RENDERED_OBJECT__FILE_NAME, oldFileName, fileName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InformationVisualizationPackage.RENDERED_OBJECT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InformationVisualizationPackage.RENDERED_OBJECT__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rendering> getRendering() {
		if (rendering == null) {
			rendering = new EObjectWithInverseResolvingEList.ManyInverse<Rendering>(Rendering.class, this, InformationVisualizationPackage.RENDERED_OBJECT__RENDERING, InformationVisualizationPackage.RENDERING__RENDERED_OBJECT);
		}
		return rendering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rendering getDefaultRendering() {
		if (defaultRendering != null && defaultRendering.eIsProxy()) {
			InternalEObject oldDefaultRendering = (InternalEObject)defaultRendering;
			defaultRendering = (Rendering)eResolveProxy(oldDefaultRendering);
			if (defaultRendering != oldDefaultRendering) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InformationVisualizationPackage.RENDERED_OBJECT__DEFAULT_RENDERING, oldDefaultRendering, defaultRendering));
			}
		}
		return defaultRendering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rendering basicGetDefaultRendering() {
		return defaultRendering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultRendering(Rendering newDefaultRendering, NotificationChain msgs) {
		Rendering oldDefaultRendering = defaultRendering;
		defaultRendering = newDefaultRendering;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InformationVisualizationPackage.RENDERED_OBJECT__DEFAULT_RENDERING, oldDefaultRendering, newDefaultRendering);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultRendering(Rendering newDefaultRendering) {
		if (newDefaultRendering != defaultRendering) {
			NotificationChain msgs = null;
			if (defaultRendering != null)
				msgs = ((InternalEObject)defaultRendering).eInverseRemove(this, InformationVisualizationPackage.RENDERING__DEFAULTED_RENDERED_OBJECT, Rendering.class, msgs);
			if (newDefaultRendering != null)
				msgs = ((InternalEObject)newDefaultRendering).eInverseAdd(this, InformationVisualizationPackage.RENDERING__DEFAULTED_RENDERED_OBJECT, Rendering.class, msgs);
			msgs = basicSetDefaultRendering(newDefaultRendering, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InformationVisualizationPackage.RENDERED_OBJECT__DEFAULT_RENDERING, newDefaultRendering, newDefaultRendering));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RenderedObject> getComponent() {
		if (component == null) {
			component = new EObjectWithInverseResolvingEList.ManyInverse<RenderedObject>(RenderedObject.class, this, InformationVisualizationPackage.RENDERED_OBJECT__COMPONENT, InformationVisualizationPackage.RENDERED_OBJECT__COMPOSITE);
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RenderedObject> getComposite() {
		if (composite == null) {
			composite = new EObjectWithInverseResolvingEList.ManyInverse<RenderedObject>(RenderedObject.class, this, InformationVisualizationPackage.RENDERED_OBJECT__COMPOSITE, InformationVisualizationPackage.RENDERED_OBJECT__COMPONENT);
		}
		return composite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RenderedObject> getNeighbor() {
		if (neighbor == null) {
			neighbor = new EObjectWithInverseResolvingEList.ManyInverse<RenderedObject>(RenderedObject.class, this, InformationVisualizationPackage.RENDERED_OBJECT__NEIGHBOR, InformationVisualizationPackage.RENDERED_OBJECT__REFERENCING_NEIGHBOR);
		}
		return neighbor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RenderedObject> getReferencingNeighbor() {
		if (referencingNeighbor == null) {
			referencingNeighbor = new EObjectWithInverseResolvingEList.ManyInverse<RenderedObject>(RenderedObject.class, this, InformationVisualizationPackage.RENDERED_OBJECT__REFERENCING_NEIGHBOR, InformationVisualizationPackage.RENDERED_OBJECT__NEIGHBOR);
		}
		return referencingNeighbor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelElement getModelElement() {
		if (modelElement != null && modelElement.eIsProxy()) {
			InternalEObject oldModelElement = (InternalEObject)modelElement;
			modelElement = (ModelElement)eResolveProxy(oldModelElement);
			if (modelElement != oldModelElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InformationVisualizationPackage.RENDERED_OBJECT__MODEL_ELEMENT, oldModelElement, modelElement));
			}
		}
		return modelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelElement basicGetModelElement() {
		return modelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelElement(ModelElement newModelElement) {
		ModelElement oldModelElement = modelElement;
		modelElement = newModelElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InformationVisualizationPackage.RENDERED_OBJECT__MODEL_ELEMENT, oldModelElement, modelElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RenderedObjectSet getRenderedObjectSet() {
		if (eContainerFeatureID != InformationVisualizationPackage.RENDERED_OBJECT__RENDERED_OBJECT_SET) return null;
		return (RenderedObjectSet)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRenderedObjectSet(RenderedObjectSet newRenderedObjectSet, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRenderedObjectSet, InformationVisualizationPackage.RENDERED_OBJECT__RENDERED_OBJECT_SET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRenderedObjectSet(RenderedObjectSet newRenderedObjectSet) {
		if (newRenderedObjectSet != eInternalContainer() || (eContainerFeatureID != InformationVisualizationPackage.RENDERED_OBJECT__RENDERED_OBJECT_SET && newRenderedObjectSet != null)) {
			if (EcoreUtil.isAncestor(this, newRenderedObjectSet))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRenderedObjectSet != null)
				msgs = ((InternalEObject)newRenderedObjectSet).eInverseAdd(this, InformationVisualizationPackage.RENDERED_OBJECT_SET__RENDERED_OBJECT, RenderedObjectSet.class, msgs);
			msgs = basicSetRenderedObjectSet(newRenderedObjectSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InformationVisualizationPackage.RENDERED_OBJECT__RENDERED_OBJECT_SET, newRenderedObjectSet, newRenderedObjectSet));
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
			case InformationVisualizationPackage.RENDERED_OBJECT__RENDERING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRendering()).basicAdd(otherEnd, msgs);
			case InformationVisualizationPackage.RENDERED_OBJECT__DEFAULT_RENDERING:
				if (defaultRendering != null)
					msgs = ((InternalEObject)defaultRendering).eInverseRemove(this, InformationVisualizationPackage.RENDERING__DEFAULTED_RENDERED_OBJECT, Rendering.class, msgs);
				return basicSetDefaultRendering((Rendering)otherEnd, msgs);
			case InformationVisualizationPackage.RENDERED_OBJECT__COMPONENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getComponent()).basicAdd(otherEnd, msgs);
			case InformationVisualizationPackage.RENDERED_OBJECT__COMPOSITE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getComposite()).basicAdd(otherEnd, msgs);
			case InformationVisualizationPackage.RENDERED_OBJECT__NEIGHBOR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNeighbor()).basicAdd(otherEnd, msgs);
			case InformationVisualizationPackage.RENDERED_OBJECT__REFERENCING_NEIGHBOR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferencingNeighbor()).basicAdd(otherEnd, msgs);
			case InformationVisualizationPackage.RENDERED_OBJECT__RENDERED_OBJECT_SET:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRenderedObjectSet((RenderedObjectSet)otherEnd, msgs);
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
			case InformationVisualizationPackage.RENDERED_OBJECT__FORMULA:
				return basicSetFormula(null, msgs);
			case InformationVisualizationPackage.RENDERED_OBJECT__RENDERING:
				return ((InternalEList<?>)getRendering()).basicRemove(otherEnd, msgs);
			case InformationVisualizationPackage.RENDERED_OBJECT__DEFAULT_RENDERING:
				return basicSetDefaultRendering(null, msgs);
			case InformationVisualizationPackage.RENDERED_OBJECT__COMPONENT:
				return ((InternalEList<?>)getComponent()).basicRemove(otherEnd, msgs);
			case InformationVisualizationPackage.RENDERED_OBJECT__COMPOSITE:
				return ((InternalEList<?>)getComposite()).basicRemove(otherEnd, msgs);
			case InformationVisualizationPackage.RENDERED_OBJECT__NEIGHBOR:
				return ((InternalEList<?>)getNeighbor()).basicRemove(otherEnd, msgs);
			case InformationVisualizationPackage.RENDERED_OBJECT__REFERENCING_NEIGHBOR:
				return ((InternalEList<?>)getReferencingNeighbor()).basicRemove(otherEnd, msgs);
			case InformationVisualizationPackage.RENDERED_OBJECT__RENDERED_OBJECT_SET:
				return basicSetRenderedObjectSet(null, msgs);
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
			case InformationVisualizationPackage.RENDERED_OBJECT__RENDERED_OBJECT_SET:
				return eInternalContainer().eInverseRemove(this, InformationVisualizationPackage.RENDERED_OBJECT_SET__RENDERED_OBJECT, RenderedObjectSet.class, msgs);
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
			case InformationVisualizationPackage.RENDERED_OBJECT__FORMULA:
				return getFormula();
			case InformationVisualizationPackage.RENDERED_OBJECT__ACTION:
				return getAction();
			case InformationVisualizationPackage.RENDERED_OBJECT__FILE_NAME:
				return getFileName();
			case InformationVisualizationPackage.RENDERED_OBJECT__TYPE:
				return getType();
			case InformationVisualizationPackage.RENDERED_OBJECT__URL:
				return getUrl();
			case InformationVisualizationPackage.RENDERED_OBJECT__RENDERING:
				return getRendering();
			case InformationVisualizationPackage.RENDERED_OBJECT__DEFAULT_RENDERING:
				if (resolve) return getDefaultRendering();
				return basicGetDefaultRendering();
			case InformationVisualizationPackage.RENDERED_OBJECT__COMPONENT:
				return getComponent();
			case InformationVisualizationPackage.RENDERED_OBJECT__COMPOSITE:
				return getComposite();
			case InformationVisualizationPackage.RENDERED_OBJECT__NEIGHBOR:
				return getNeighbor();
			case InformationVisualizationPackage.RENDERED_OBJECT__REFERENCING_NEIGHBOR:
				return getReferencingNeighbor();
			case InformationVisualizationPackage.RENDERED_OBJECT__MODEL_ELEMENT:
				if (resolve) return getModelElement();
				return basicGetModelElement();
			case InformationVisualizationPackage.RENDERED_OBJECT__RENDERED_OBJECT_SET:
				return getRenderedObjectSet();
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
			case InformationVisualizationPackage.RENDERED_OBJECT__FORMULA:
				setFormula((ExpressionNode)newValue);
				return;
			case InformationVisualizationPackage.RENDERED_OBJECT__ACTION:
				setAction((String)newValue);
				return;
			case InformationVisualizationPackage.RENDERED_OBJECT__FILE_NAME:
				setFileName((String)newValue);
				return;
			case InformationVisualizationPackage.RENDERED_OBJECT__TYPE:
				setType((String)newValue);
				return;
			case InformationVisualizationPackage.RENDERED_OBJECT__URL:
				setUrl((String)newValue);
				return;
			case InformationVisualizationPackage.RENDERED_OBJECT__RENDERING:
				getRendering().clear();
				getRendering().addAll((Collection<? extends Rendering>)newValue);
				return;
			case InformationVisualizationPackage.RENDERED_OBJECT__DEFAULT_RENDERING:
				setDefaultRendering((Rendering)newValue);
				return;
			case InformationVisualizationPackage.RENDERED_OBJECT__COMPONENT:
				getComponent().clear();
				getComponent().addAll((Collection<? extends RenderedObject>)newValue);
				return;
			case InformationVisualizationPackage.RENDERED_OBJECT__COMPOSITE:
				getComposite().clear();
				getComposite().addAll((Collection<? extends RenderedObject>)newValue);
				return;
			case InformationVisualizationPackage.RENDERED_OBJECT__NEIGHBOR:
				getNeighbor().clear();
				getNeighbor().addAll((Collection<? extends RenderedObject>)newValue);
				return;
			case InformationVisualizationPackage.RENDERED_OBJECT__REFERENCING_NEIGHBOR:
				getReferencingNeighbor().clear();
				getReferencingNeighbor().addAll((Collection<? extends RenderedObject>)newValue);
				return;
			case InformationVisualizationPackage.RENDERED_OBJECT__MODEL_ELEMENT:
				setModelElement((ModelElement)newValue);
				return;
			case InformationVisualizationPackage.RENDERED_OBJECT__RENDERED_OBJECT_SET:
				setRenderedObjectSet((RenderedObjectSet)newValue);
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
			case InformationVisualizationPackage.RENDERED_OBJECT__FORMULA:
				setFormula((ExpressionNode)null);
				return;
			case InformationVisualizationPackage.RENDERED_OBJECT__ACTION:
				setAction(ACTION_EDEFAULT);
				return;
			case InformationVisualizationPackage.RENDERED_OBJECT__FILE_NAME:
				setFileName(FILE_NAME_EDEFAULT);
				return;
			case InformationVisualizationPackage.RENDERED_OBJECT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case InformationVisualizationPackage.RENDERED_OBJECT__URL:
				setUrl(URL_EDEFAULT);
				return;
			case InformationVisualizationPackage.RENDERED_OBJECT__RENDERING:
				getRendering().clear();
				return;
			case InformationVisualizationPackage.RENDERED_OBJECT__DEFAULT_RENDERING:
				setDefaultRendering((Rendering)null);
				return;
			case InformationVisualizationPackage.RENDERED_OBJECT__COMPONENT:
				getComponent().clear();
				return;
			case InformationVisualizationPackage.RENDERED_OBJECT__COMPOSITE:
				getComposite().clear();
				return;
			case InformationVisualizationPackage.RENDERED_OBJECT__NEIGHBOR:
				getNeighbor().clear();
				return;
			case InformationVisualizationPackage.RENDERED_OBJECT__REFERENCING_NEIGHBOR:
				getReferencingNeighbor().clear();
				return;
			case InformationVisualizationPackage.RENDERED_OBJECT__MODEL_ELEMENT:
				setModelElement((ModelElement)null);
				return;
			case InformationVisualizationPackage.RENDERED_OBJECT__RENDERED_OBJECT_SET:
				setRenderedObjectSet((RenderedObjectSet)null);
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
			case InformationVisualizationPackage.RENDERED_OBJECT__FORMULA:
				return formula != null;
			case InformationVisualizationPackage.RENDERED_OBJECT__ACTION:
				return ACTION_EDEFAULT == null ? action != null : !ACTION_EDEFAULT.equals(action);
			case InformationVisualizationPackage.RENDERED_OBJECT__FILE_NAME:
				return FILE_NAME_EDEFAULT == null ? fileName != null : !FILE_NAME_EDEFAULT.equals(fileName);
			case InformationVisualizationPackage.RENDERED_OBJECT__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case InformationVisualizationPackage.RENDERED_OBJECT__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case InformationVisualizationPackage.RENDERED_OBJECT__RENDERING:
				return rendering != null && !rendering.isEmpty();
			case InformationVisualizationPackage.RENDERED_OBJECT__DEFAULT_RENDERING:
				return defaultRendering != null;
			case InformationVisualizationPackage.RENDERED_OBJECT__COMPONENT:
				return component != null && !component.isEmpty();
			case InformationVisualizationPackage.RENDERED_OBJECT__COMPOSITE:
				return composite != null && !composite.isEmpty();
			case InformationVisualizationPackage.RENDERED_OBJECT__NEIGHBOR:
				return neighbor != null && !neighbor.isEmpty();
			case InformationVisualizationPackage.RENDERED_OBJECT__REFERENCING_NEIGHBOR:
				return referencingNeighbor != null && !referencingNeighbor.isEmpty();
			case InformationVisualizationPackage.RENDERED_OBJECT__MODEL_ELEMENT:
				return modelElement != null;
			case InformationVisualizationPackage.RENDERED_OBJECT__RENDERED_OBJECT_SET:
				return getRenderedObjectSet() != null;
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
		result.append(" (action: ");
		result.append(action);
		result.append(", fileName: ");
		result.append(fileName);
		result.append(", type: ");
		result.append(type);
		result.append(", url: ");
		result.append(url);
		result.append(')');
		return result.toString();
	}

} //RenderedObjectImpl

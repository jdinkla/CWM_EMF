/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Core.impl;

import CWM.Core.Constraint;
import CWM.Core.CorePackage;
import CWM.Core.Dependency;
import CWM.Core.ModelElement;
import CWM.Core.Namespace;
import CWM.Core.TaggedValue;
import CWM.Core.VisibilityKind;

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
 * An implementation of the model object '<em><b>Model Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.Core.impl.ModelElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link CWM.Core.impl.ModelElementImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link CWM.Core.impl.ModelElementImpl#getClientDependency <em>Client Dependency</em>}</li>
 *   <li>{@link CWM.Core.impl.ModelElementImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link CWM.Core.impl.ModelElementImpl#getImporter <em>Importer</em>}</li>
 *   <li>{@link CWM.Core.impl.ModelElementImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link CWM.Core.impl.ModelElementImpl#getTaggedValue <em>Tagged Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ModelElementImpl extends ElementImpl implements ModelElement {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final VisibilityKind VISIBILITY_EDEFAULT = VisibilityKind.VK_PUBLIC;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected VisibilityKind visibility = VISIBILITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClientDependency() <em>Client Dependency</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientDependency()
	 * @generated
	 * @ordered
	 */
	protected EList<Dependency> clientDependency;

	/**
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> constraint;

	/**
	 * The cached value of the '{@link #getImporter() <em>Importer</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImporter()
	 * @generated
	 * @ordered
	 */
	protected EList<CWM.Core.Package> importer;

	/**
	 * The cached value of the '{@link #getTaggedValue() <em>Tagged Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaggedValue()
	 * @generated
	 * @ordered
	 */
	protected EList<TaggedValue> taggedValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.MODEL_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.MODEL_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityKind getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(VisibilityKind newVisibility) {
		VisibilityKind oldVisibility = visibility;
		visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.MODEL_ELEMENT__VISIBILITY, oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dependency> getClientDependency() {
		if (clientDependency == null) {
			clientDependency = new EObjectWithInverseResolvingEList.ManyInverse<Dependency>(Dependency.class, this, CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY, CorePackage.DEPENDENCY__CLIENT);
		}
		return clientDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getConstraint() {
		if (constraint == null) {
			constraint = new EObjectWithInverseResolvingEList.ManyInverse<Constraint>(Constraint.class, this, CorePackage.MODEL_ELEMENT__CONSTRAINT, CorePackage.CONSTRAINT__CONSTRAINED_ELEMENT);
		}
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CWM.Core.Package> getImporter() {
		if (importer == null) {
			importer = new EObjectWithInverseResolvingEList.ManyInverse<CWM.Core.Package>(CWM.Core.Package.class, this, CorePackage.MODEL_ELEMENT__IMPORTER, CorePackage.PACKAGE__IMPORTED_ELEMENT);
		}
		return importer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace getNamespace() {
		if (eContainerFeatureID != CorePackage.MODEL_ELEMENT__NAMESPACE) return null;
		return (Namespace)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNamespace(Namespace newNamespace, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newNamespace, CorePackage.MODEL_ELEMENT__NAMESPACE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespace(Namespace newNamespace) {
		if (newNamespace != eInternalContainer() || (eContainerFeatureID != CorePackage.MODEL_ELEMENT__NAMESPACE && newNamespace != null)) {
			if (EcoreUtil.isAncestor(this, newNamespace))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newNamespace != null)
				msgs = ((InternalEObject)newNamespace).eInverseAdd(this, CorePackage.NAMESPACE__OWNED_ELEMENT, Namespace.class, msgs);
			msgs = basicSetNamespace(newNamespace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.MODEL_ELEMENT__NAMESPACE, newNamespace, newNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaggedValue> getTaggedValue() {
		if (taggedValue == null) {
			taggedValue = new EObjectContainmentWithInverseEList<TaggedValue>(TaggedValue.class, this, CorePackage.MODEL_ELEMENT__TAGGED_VALUE, CorePackage.TAGGED_VALUE__MODEL_ELEMENT);
		}
		return taggedValue;
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
			case CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getClientDependency()).basicAdd(otherEnd, msgs);
			case CorePackage.MODEL_ELEMENT__CONSTRAINT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConstraint()).basicAdd(otherEnd, msgs);
			case CorePackage.MODEL_ELEMENT__IMPORTER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getImporter()).basicAdd(otherEnd, msgs);
			case CorePackage.MODEL_ELEMENT__NAMESPACE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetNamespace((Namespace)otherEnd, msgs);
			case CorePackage.MODEL_ELEMENT__TAGGED_VALUE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTaggedValue()).basicAdd(otherEnd, msgs);
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
			case CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY:
				return ((InternalEList<?>)getClientDependency()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ELEMENT__CONSTRAINT:
				return ((InternalEList<?>)getConstraint()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ELEMENT__IMPORTER:
				return ((InternalEList<?>)getImporter()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ELEMENT__NAMESPACE:
				return basicSetNamespace(null, msgs);
			case CorePackage.MODEL_ELEMENT__TAGGED_VALUE:
				return ((InternalEList<?>)getTaggedValue()).basicRemove(otherEnd, msgs);
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
			case CorePackage.MODEL_ELEMENT__NAMESPACE:
				return eInternalContainer().eInverseRemove(this, CorePackage.NAMESPACE__OWNED_ELEMENT, Namespace.class, msgs);
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
			case CorePackage.MODEL_ELEMENT__NAME:
				return getName();
			case CorePackage.MODEL_ELEMENT__VISIBILITY:
				return getVisibility();
			case CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY:
				return getClientDependency();
			case CorePackage.MODEL_ELEMENT__CONSTRAINT:
				return getConstraint();
			case CorePackage.MODEL_ELEMENT__IMPORTER:
				return getImporter();
			case CorePackage.MODEL_ELEMENT__NAMESPACE:
				return getNamespace();
			case CorePackage.MODEL_ELEMENT__TAGGED_VALUE:
				return getTaggedValue();
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
			case CorePackage.MODEL_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case CorePackage.MODEL_ELEMENT__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY:
				getClientDependency().clear();
				getClientDependency().addAll((Collection<? extends Dependency>)newValue);
				return;
			case CorePackage.MODEL_ELEMENT__CONSTRAINT:
				getConstraint().clear();
				getConstraint().addAll((Collection<? extends Constraint>)newValue);
				return;
			case CorePackage.MODEL_ELEMENT__IMPORTER:
				getImporter().clear();
				getImporter().addAll((Collection<? extends CWM.Core.Package>)newValue);
				return;
			case CorePackage.MODEL_ELEMENT__NAMESPACE:
				setNamespace((Namespace)newValue);
				return;
			case CorePackage.MODEL_ELEMENT__TAGGED_VALUE:
				getTaggedValue().clear();
				getTaggedValue().addAll((Collection<? extends TaggedValue>)newValue);
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
			case CorePackage.MODEL_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CorePackage.MODEL_ELEMENT__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY:
				getClientDependency().clear();
				return;
			case CorePackage.MODEL_ELEMENT__CONSTRAINT:
				getConstraint().clear();
				return;
			case CorePackage.MODEL_ELEMENT__IMPORTER:
				getImporter().clear();
				return;
			case CorePackage.MODEL_ELEMENT__NAMESPACE:
				setNamespace((Namespace)null);
				return;
			case CorePackage.MODEL_ELEMENT__TAGGED_VALUE:
				getTaggedValue().clear();
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
			case CorePackage.MODEL_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CorePackage.MODEL_ELEMENT__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY:
				return clientDependency != null && !clientDependency.isEmpty();
			case CorePackage.MODEL_ELEMENT__CONSTRAINT:
				return constraint != null && !constraint.isEmpty();
			case CorePackage.MODEL_ELEMENT__IMPORTER:
				return importer != null && !importer.isEmpty();
			case CorePackage.MODEL_ELEMENT__NAMESPACE:
				return getNamespace() != null;
			case CorePackage.MODEL_ELEMENT__TAGGED_VALUE:
				return taggedValue != null && !taggedValue.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", visibility: ");
		result.append(visibility);
		result.append(')');
		return result.toString();
	}

} //ModelElementImpl

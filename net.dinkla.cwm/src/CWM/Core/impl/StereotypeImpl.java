/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Core.impl;

import CWM.Core.Constraint;
import CWM.Core.CorePackage;
import CWM.Core.ModelElement;
import CWM.Core.Stereotype;
import CWM.Core.TaggedValue;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stereotype</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.Core.impl.StereotypeImpl#getBaseClass <em>Base Class</em>}</li>
 *   <li>{@link CWM.Core.impl.StereotypeImpl#getExtendedElement <em>Extended Element</em>}</li>
 *   <li>{@link CWM.Core.impl.StereotypeImpl#getRequiredTag <em>Required Tag</em>}</li>
 *   <li>{@link CWM.Core.impl.StereotypeImpl#getStereotypeConstraint <em>Stereotype Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StereotypeImpl extends ModelElementImpl implements Stereotype {
	/**
	 * The default value of the '{@link #getBaseClass() <em>Base Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseClass()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBaseClass() <em>Base Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseClass()
	 * @generated
	 * @ordered
	 */
	protected String baseClass = BASE_CLASS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExtendedElement() <em>Extended Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedElement()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelElement> extendedElement;

	/**
	 * The cached value of the '{@link #getRequiredTag() <em>Required Tag</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredTag()
	 * @generated
	 * @ordered
	 */
	protected EList<TaggedValue> requiredTag;

	/**
	 * The cached value of the '{@link #getStereotypeConstraint() <em>Stereotype Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStereotypeConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> stereotypeConstraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StereotypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.STEREOTYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBaseClass() {
		return baseClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseClass(String newBaseClass) {
		String oldBaseClass = baseClass;
		baseClass = newBaseClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.STEREOTYPE__BASE_CLASS, oldBaseClass, baseClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelElement> getExtendedElement() {
		if (extendedElement == null) {
			extendedElement = new EObjectResolvingEList<ModelElement>(ModelElement.class, this, CorePackage.STEREOTYPE__EXTENDED_ELEMENT);
		}
		return extendedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaggedValue> getRequiredTag() {
		if (requiredTag == null) {
			requiredTag = new EObjectContainmentWithInverseEList<TaggedValue>(TaggedValue.class, this, CorePackage.STEREOTYPE__REQUIRED_TAG, CorePackage.TAGGED_VALUE__STEREOTYPE);
		}
		return requiredTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getStereotypeConstraint() {
		if (stereotypeConstraint == null) {
			stereotypeConstraint = new EObjectContainmentEList<Constraint>(Constraint.class, this, CorePackage.STEREOTYPE__STEREOTYPE_CONSTRAINT);
		}
		return stereotypeConstraint;
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
			case CorePackage.STEREOTYPE__REQUIRED_TAG:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRequiredTag()).basicAdd(otherEnd, msgs);
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
			case CorePackage.STEREOTYPE__REQUIRED_TAG:
				return ((InternalEList<?>)getRequiredTag()).basicRemove(otherEnd, msgs);
			case CorePackage.STEREOTYPE__STEREOTYPE_CONSTRAINT:
				return ((InternalEList<?>)getStereotypeConstraint()).basicRemove(otherEnd, msgs);
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
			case CorePackage.STEREOTYPE__BASE_CLASS:
				return getBaseClass();
			case CorePackage.STEREOTYPE__EXTENDED_ELEMENT:
				return getExtendedElement();
			case CorePackage.STEREOTYPE__REQUIRED_TAG:
				return getRequiredTag();
			case CorePackage.STEREOTYPE__STEREOTYPE_CONSTRAINT:
				return getStereotypeConstraint();
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
			case CorePackage.STEREOTYPE__BASE_CLASS:
				setBaseClass((String)newValue);
				return;
			case CorePackage.STEREOTYPE__EXTENDED_ELEMENT:
				getExtendedElement().clear();
				getExtendedElement().addAll((Collection<? extends ModelElement>)newValue);
				return;
			case CorePackage.STEREOTYPE__REQUIRED_TAG:
				getRequiredTag().clear();
				getRequiredTag().addAll((Collection<? extends TaggedValue>)newValue);
				return;
			case CorePackage.STEREOTYPE__STEREOTYPE_CONSTRAINT:
				getStereotypeConstraint().clear();
				getStereotypeConstraint().addAll((Collection<? extends Constraint>)newValue);
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
			case CorePackage.STEREOTYPE__BASE_CLASS:
				setBaseClass(BASE_CLASS_EDEFAULT);
				return;
			case CorePackage.STEREOTYPE__EXTENDED_ELEMENT:
				getExtendedElement().clear();
				return;
			case CorePackage.STEREOTYPE__REQUIRED_TAG:
				getRequiredTag().clear();
				return;
			case CorePackage.STEREOTYPE__STEREOTYPE_CONSTRAINT:
				getStereotypeConstraint().clear();
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
			case CorePackage.STEREOTYPE__BASE_CLASS:
				return BASE_CLASS_EDEFAULT == null ? baseClass != null : !BASE_CLASS_EDEFAULT.equals(baseClass);
			case CorePackage.STEREOTYPE__EXTENDED_ELEMENT:
				return extendedElement != null && !extendedElement.isEmpty();
			case CorePackage.STEREOTYPE__REQUIRED_TAG:
				return requiredTag != null && !requiredTag.isEmpty();
			case CorePackage.STEREOTYPE__STEREOTYPE_CONSTRAINT:
				return stereotypeConstraint != null && !stereotypeConstraint.isEmpty();
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
		result.append(" (baseClass: ");
		result.append(baseClass);
		result.append(')');
		return result.toString();
	}

} //StereotypeImpl

/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.CwmXml.impl;

import CWM.Core.impl.AttributeImpl;

import CWM.CwmXml.Content;
import CWM.CwmXml.CwmXmlPackage;
import CWM.CwmXml.ElementTypeReference;
import CWM.CwmXml.OccurrenceType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Type Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.CwmXml.impl.ElementTypeReferenceImpl#getOccurrence <em>Occurrence</em>}</li>
 *   <li>{@link CWM.CwmXml.impl.ElementTypeReferenceImpl#getOwnerContent <em>Owner Content</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElementTypeReferenceImpl extends AttributeImpl implements ElementTypeReference {
	/**
	 * The default value of the '{@link #getOccurrence() <em>Occurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrence()
	 * @generated
	 * @ordered
	 */
	protected static final OccurrenceType OCCURRENCE_EDEFAULT = OccurrenceType.XML_ONE;

	/**
	 * The cached value of the '{@link #getOccurrence() <em>Occurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrence()
	 * @generated
	 * @ordered
	 */
	protected OccurrenceType occurrence = OCCURRENCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnerContent() <em>Owner Content</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnerContent()
	 * @generated
	 * @ordered
	 */
	protected EList<Content> ownerContent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementTypeReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CwmXmlPackage.Literals.ELEMENT_TYPE_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccurrenceType getOccurrence() {
		return occurrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOccurrence(OccurrenceType newOccurrence) {
		OccurrenceType oldOccurrence = occurrence;
		occurrence = newOccurrence == null ? OCCURRENCE_EDEFAULT : newOccurrence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CwmXmlPackage.ELEMENT_TYPE_REFERENCE__OCCURRENCE, oldOccurrence, occurrence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Content> getOwnerContent() {
		if (ownerContent == null) {
			ownerContent = new EObjectWithInverseResolvingEList.ManyInverse<Content>(Content.class, this, CwmXmlPackage.ELEMENT_TYPE_REFERENCE__OWNER_CONTENT, CwmXmlPackage.CONTENT__OWNED_ELEMENT_TYPE);
		}
		return ownerContent;
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
			case CwmXmlPackage.ELEMENT_TYPE_REFERENCE__OWNER_CONTENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnerContent()).basicAdd(otherEnd, msgs);
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
			case CwmXmlPackage.ELEMENT_TYPE_REFERENCE__OWNER_CONTENT:
				return ((InternalEList<?>)getOwnerContent()).basicRemove(otherEnd, msgs);
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
			case CwmXmlPackage.ELEMENT_TYPE_REFERENCE__OCCURRENCE:
				return getOccurrence();
			case CwmXmlPackage.ELEMENT_TYPE_REFERENCE__OWNER_CONTENT:
				return getOwnerContent();
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
			case CwmXmlPackage.ELEMENT_TYPE_REFERENCE__OCCURRENCE:
				setOccurrence((OccurrenceType)newValue);
				return;
			case CwmXmlPackage.ELEMENT_TYPE_REFERENCE__OWNER_CONTENT:
				getOwnerContent().clear();
				getOwnerContent().addAll((Collection<? extends Content>)newValue);
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
			case CwmXmlPackage.ELEMENT_TYPE_REFERENCE__OCCURRENCE:
				setOccurrence(OCCURRENCE_EDEFAULT);
				return;
			case CwmXmlPackage.ELEMENT_TYPE_REFERENCE__OWNER_CONTENT:
				getOwnerContent().clear();
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
			case CwmXmlPackage.ELEMENT_TYPE_REFERENCE__OCCURRENCE:
				return occurrence != OCCURRENCE_EDEFAULT;
			case CwmXmlPackage.ELEMENT_TYPE_REFERENCE__OWNER_CONTENT:
				return ownerContent != null && !ownerContent.isEmpty();
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
		result.append(" (occurrence: ");
		result.append(occurrence);
		result.append(')');
		return result.toString();
	}

} //ElementTypeReferenceImpl

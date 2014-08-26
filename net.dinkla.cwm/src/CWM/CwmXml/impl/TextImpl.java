/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.CwmXml.impl;

import CWM.Core.impl.AttributeImpl;

import CWM.CwmXml.CwmXmlPackage;
import CWM.CwmXml.MixedContent;
import CWM.CwmXml.Text;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.CwmXml.impl.TextImpl#getOwnerContent <em>Owner Content</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextImpl extends AttributeImpl implements Text {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CwmXmlPackage.Literals.TEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MixedContent getOwnerContent() {
		if (eContainerFeatureID != CwmXmlPackage.TEXT__OWNER_CONTENT) return null;
		return (MixedContent)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnerContent(MixedContent newOwnerContent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnerContent, CwmXmlPackage.TEXT__OWNER_CONTENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnerContent(MixedContent newOwnerContent) {
		if (newOwnerContent != eInternalContainer() || (eContainerFeatureID != CwmXmlPackage.TEXT__OWNER_CONTENT && newOwnerContent != null)) {
			if (EcoreUtil.isAncestor(this, newOwnerContent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnerContent != null)
				msgs = ((InternalEObject)newOwnerContent).eInverseAdd(this, CwmXmlPackage.MIXED_CONTENT__TEXT, MixedContent.class, msgs);
			msgs = basicSetOwnerContent(newOwnerContent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CwmXmlPackage.TEXT__OWNER_CONTENT, newOwnerContent, newOwnerContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CwmXmlPackage.TEXT__OWNER_CONTENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnerContent((MixedContent)otherEnd, msgs);
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
			case CwmXmlPackage.TEXT__OWNER_CONTENT:
				return basicSetOwnerContent(null, msgs);
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
			case CwmXmlPackage.TEXT__OWNER_CONTENT:
				return eInternalContainer().eInverseRemove(this, CwmXmlPackage.MIXED_CONTENT__TEXT, MixedContent.class, msgs);
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
			case CwmXmlPackage.TEXT__OWNER_CONTENT:
				return getOwnerContent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CwmXmlPackage.TEXT__OWNER_CONTENT:
				setOwnerContent((MixedContent)newValue);
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
			case CwmXmlPackage.TEXT__OWNER_CONTENT:
				setOwnerContent((MixedContent)null);
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
			case CwmXmlPackage.TEXT__OWNER_CONTENT:
				return getOwnerContent() != null;
		}
		return super.eIsSet(featureID);
	}

} //TextImpl

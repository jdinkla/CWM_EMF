/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.CwmXml.impl;

import CWM.Core.ModelElement;

import CWM.Core.impl.PackageImpl;

import CWM.CwmXml.CwmXmlPackage;
import CWM.CwmXml.Schema;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.CwmXml.impl.SchemaImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link CWM.CwmXml.impl.SchemaImpl#getXmlNamespace <em>Xml Namespace</em>}</li>
 *   <li>{@link CWM.CwmXml.impl.SchemaImpl#getElementType <em>Element Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SchemaImpl extends PackageImpl implements Schema {
	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getXmlNamespace() <em>Xml Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmlNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String XML_NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXmlNamespace() <em>Xml Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmlNamespace()
	 * @generated
	 * @ordered
	 */
	protected String xmlNamespace = XML_NAMESPACE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElementType() <em>Element Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementType()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelElement> elementType;

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
		return CwmXmlPackage.Literals.SCHEMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CwmXmlPackage.SCHEMA__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXmlNamespace() {
		return xmlNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXmlNamespace(String newXmlNamespace) {
		String oldXmlNamespace = xmlNamespace;
		xmlNamespace = newXmlNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CwmXmlPackage.SCHEMA__XML_NAMESPACE, oldXmlNamespace, xmlNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelElement> getElementType() {
		if (elementType == null) {
			elementType = new EObjectContainmentEList<ModelElement>(ModelElement.class, this, CwmXmlPackage.SCHEMA__ELEMENT_TYPE);
		}
		return elementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CwmXmlPackage.SCHEMA__ELEMENT_TYPE:
				return ((InternalEList<?>)getElementType()).basicRemove(otherEnd, msgs);
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
			case CwmXmlPackage.SCHEMA__VERSION:
				return getVersion();
			case CwmXmlPackage.SCHEMA__XML_NAMESPACE:
				return getXmlNamespace();
			case CwmXmlPackage.SCHEMA__ELEMENT_TYPE:
				return getElementType();
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
			case CwmXmlPackage.SCHEMA__VERSION:
				setVersion((String)newValue);
				return;
			case CwmXmlPackage.SCHEMA__XML_NAMESPACE:
				setXmlNamespace((String)newValue);
				return;
			case CwmXmlPackage.SCHEMA__ELEMENT_TYPE:
				getElementType().clear();
				getElementType().addAll((Collection<? extends ModelElement>)newValue);
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
			case CwmXmlPackage.SCHEMA__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case CwmXmlPackage.SCHEMA__XML_NAMESPACE:
				setXmlNamespace(XML_NAMESPACE_EDEFAULT);
				return;
			case CwmXmlPackage.SCHEMA__ELEMENT_TYPE:
				getElementType().clear();
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
			case CwmXmlPackage.SCHEMA__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case CwmXmlPackage.SCHEMA__XML_NAMESPACE:
				return XML_NAMESPACE_EDEFAULT == null ? xmlNamespace != null : !XML_NAMESPACE_EDEFAULT.equals(xmlNamespace);
			case CwmXmlPackage.SCHEMA__ELEMENT_TYPE:
				return elementType != null && !elementType.isEmpty();
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
		result.append(" (version: ");
		result.append(version);
		result.append(", xmlNamespace: ");
		result.append(xmlNamespace);
		result.append(')');
		return result.toString();
	}

} //SchemaImpl

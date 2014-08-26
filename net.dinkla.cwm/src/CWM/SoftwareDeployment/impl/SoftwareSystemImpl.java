/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.SoftwareDeployment.impl;

import CWM.Core.impl.SubsystemImpl;

import CWM.SoftwareDeployment.SoftwareDeploymentPackage;
import CWM.SoftwareDeployment.SoftwareSystem;

import CWM.TypeMapping.TypeSystem;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Software System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.SoftwareDeployment.impl.SoftwareSystemImpl#getType <em>Type</em>}</li>
 *   <li>{@link CWM.SoftwareDeployment.impl.SoftwareSystemImpl#getSubtype <em>Subtype</em>}</li>
 *   <li>{@link CWM.SoftwareDeployment.impl.SoftwareSystemImpl#getSupplier <em>Supplier</em>}</li>
 *   <li>{@link CWM.SoftwareDeployment.impl.SoftwareSystemImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link CWM.SoftwareDeployment.impl.SoftwareSystemImpl#getTypespace <em>Typespace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SoftwareSystemImpl extends SubsystemImpl implements SoftwareSystem {
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
	 * The default value of the '{@link #getSubtype() <em>Subtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtype()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubtype() <em>Subtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtype()
	 * @generated
	 * @ordered
	 */
	protected String subtype = SUBTYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSupplier() <em>Supplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplier()
	 * @generated
	 * @ordered
	 */
	protected static final String SUPPLIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSupplier() <em>Supplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplier()
	 * @generated
	 * @ordered
	 */
	protected String supplier = SUPPLIER_EDEFAULT;

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
	 * The cached value of the '{@link #getTypespace() <em>Typespace</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypespace()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeSystem> typespace;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwareSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoftwareDeploymentPackage.Literals.SOFTWARE_SYSTEM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwareDeploymentPackage.SOFTWARE_SYSTEM__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubtype() {
		return subtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubtype(String newSubtype) {
		String oldSubtype = subtype;
		subtype = newSubtype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwareDeploymentPackage.SOFTWARE_SYSTEM__SUBTYPE, oldSubtype, subtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSupplier() {
		return supplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupplier(String newSupplier) {
		String oldSupplier = supplier;
		supplier = newSupplier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwareDeploymentPackage.SOFTWARE_SYSTEM__SUPPLIER, oldSupplier, supplier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwareDeploymentPackage.SOFTWARE_SYSTEM__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeSystem> getTypespace() {
		if (typespace == null) {
			typespace = new EObjectResolvingEList<TypeSystem>(TypeSystem.class, this, SoftwareDeploymentPackage.SOFTWARE_SYSTEM__TYPESPACE);
		}
		return typespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SoftwareDeploymentPackage.SOFTWARE_SYSTEM__TYPE:
				return getType();
			case SoftwareDeploymentPackage.SOFTWARE_SYSTEM__SUBTYPE:
				return getSubtype();
			case SoftwareDeploymentPackage.SOFTWARE_SYSTEM__SUPPLIER:
				return getSupplier();
			case SoftwareDeploymentPackage.SOFTWARE_SYSTEM__VERSION:
				return getVersion();
			case SoftwareDeploymentPackage.SOFTWARE_SYSTEM__TYPESPACE:
				return getTypespace();
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
			case SoftwareDeploymentPackage.SOFTWARE_SYSTEM__TYPE:
				setType((String)newValue);
				return;
			case SoftwareDeploymentPackage.SOFTWARE_SYSTEM__SUBTYPE:
				setSubtype((String)newValue);
				return;
			case SoftwareDeploymentPackage.SOFTWARE_SYSTEM__SUPPLIER:
				setSupplier((String)newValue);
				return;
			case SoftwareDeploymentPackage.SOFTWARE_SYSTEM__VERSION:
				setVersion((String)newValue);
				return;
			case SoftwareDeploymentPackage.SOFTWARE_SYSTEM__TYPESPACE:
				getTypespace().clear();
				getTypespace().addAll((Collection<? extends TypeSystem>)newValue);
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
			case SoftwareDeploymentPackage.SOFTWARE_SYSTEM__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case SoftwareDeploymentPackage.SOFTWARE_SYSTEM__SUBTYPE:
				setSubtype(SUBTYPE_EDEFAULT);
				return;
			case SoftwareDeploymentPackage.SOFTWARE_SYSTEM__SUPPLIER:
				setSupplier(SUPPLIER_EDEFAULT);
				return;
			case SoftwareDeploymentPackage.SOFTWARE_SYSTEM__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case SoftwareDeploymentPackage.SOFTWARE_SYSTEM__TYPESPACE:
				getTypespace().clear();
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
			case SoftwareDeploymentPackage.SOFTWARE_SYSTEM__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case SoftwareDeploymentPackage.SOFTWARE_SYSTEM__SUBTYPE:
				return SUBTYPE_EDEFAULT == null ? subtype != null : !SUBTYPE_EDEFAULT.equals(subtype);
			case SoftwareDeploymentPackage.SOFTWARE_SYSTEM__SUPPLIER:
				return SUPPLIER_EDEFAULT == null ? supplier != null : !SUPPLIER_EDEFAULT.equals(supplier);
			case SoftwareDeploymentPackage.SOFTWARE_SYSTEM__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case SoftwareDeploymentPackage.SOFTWARE_SYSTEM__TYPESPACE:
				return typespace != null && !typespace.isEmpty();
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
		result.append(" (type: ");
		result.append(type);
		result.append(", subtype: ");
		result.append(subtype);
		result.append(", supplier: ");
		result.append(supplier);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //SoftwareSystemImpl

/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.SoftwareDeployment.impl;

import CWM.SoftwareDeployment.DataManager;
import CWM.SoftwareDeployment.SoftwareDeploymentPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.SoftwareDeployment.impl.DataManagerImpl#getIsCaseSensitive <em>Is Case Sensitive</em>}</li>
 *   <li>{@link CWM.SoftwareDeployment.impl.DataManagerImpl#getDataPackage <em>Data Package</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataManagerImpl extends DeployedComponentImpl implements DataManager {
	/**
	 * The default value of the '{@link #getIsCaseSensitive() <em>Is Case Sensitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsCaseSensitive()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_CASE_SENSITIVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsCaseSensitive() <em>Is Case Sensitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsCaseSensitive()
	 * @generated
	 * @ordered
	 */
	protected Boolean isCaseSensitive = IS_CASE_SENSITIVE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDataPackage() <em>Data Package</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<CWM.Core.Package> dataPackage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoftwareDeploymentPackage.Literals.DATA_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsCaseSensitive() {
		return isCaseSensitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCaseSensitive(Boolean newIsCaseSensitive) {
		Boolean oldIsCaseSensitive = isCaseSensitive;
		isCaseSensitive = newIsCaseSensitive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwareDeploymentPackage.DATA_MANAGER__IS_CASE_SENSITIVE, oldIsCaseSensitive, isCaseSensitive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CWM.Core.Package> getDataPackage() {
		if (dataPackage == null) {
			dataPackage = new EObjectResolvingEList<CWM.Core.Package>(CWM.Core.Package.class, this, SoftwareDeploymentPackage.DATA_MANAGER__DATA_PACKAGE);
		}
		return dataPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SoftwareDeploymentPackage.DATA_MANAGER__IS_CASE_SENSITIVE:
				return getIsCaseSensitive();
			case SoftwareDeploymentPackage.DATA_MANAGER__DATA_PACKAGE:
				return getDataPackage();
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
			case SoftwareDeploymentPackage.DATA_MANAGER__IS_CASE_SENSITIVE:
				setIsCaseSensitive((Boolean)newValue);
				return;
			case SoftwareDeploymentPackage.DATA_MANAGER__DATA_PACKAGE:
				getDataPackage().clear();
				getDataPackage().addAll((Collection<? extends CWM.Core.Package>)newValue);
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
			case SoftwareDeploymentPackage.DATA_MANAGER__IS_CASE_SENSITIVE:
				setIsCaseSensitive(IS_CASE_SENSITIVE_EDEFAULT);
				return;
			case SoftwareDeploymentPackage.DATA_MANAGER__DATA_PACKAGE:
				getDataPackage().clear();
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
			case SoftwareDeploymentPackage.DATA_MANAGER__IS_CASE_SENSITIVE:
				return IS_CASE_SENSITIVE_EDEFAULT == null ? isCaseSensitive != null : !IS_CASE_SENSITIVE_EDEFAULT.equals(isCaseSensitive);
			case SoftwareDeploymentPackage.DATA_MANAGER__DATA_PACKAGE:
				return dataPackage != null && !dataPackage.isEmpty();
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
		result.append(" (isCaseSensitive: ");
		result.append(isCaseSensitive);
		result.append(')');
		return result.toString();
	}

} //DataManagerImpl

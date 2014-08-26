/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.SoftwareDeployment.impl;

import CWM.Core.impl.PackageImpl;

import CWM.SoftwareDeployment.DeployedSoftwareSystem;
import CWM.SoftwareDeployment.SoftwareDeploymentPackage;
import CWM.SoftwareDeployment.SoftwareSystem;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployed Software System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.SoftwareDeployment.impl.DeployedSoftwareSystemImpl#getFixLevel <em>Fix Level</em>}</li>
 *   <li>{@link CWM.SoftwareDeployment.impl.DeployedSoftwareSystemImpl#getSoftwareSystem <em>Software System</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeployedSoftwareSystemImpl extends PackageImpl implements DeployedSoftwareSystem {
	/**
	 * The default value of the '{@link #getFixLevel() <em>Fix Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String FIX_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFixLevel() <em>Fix Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixLevel()
	 * @generated
	 * @ordered
	 */
	protected String fixLevel = FIX_LEVEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSoftwareSystem() <em>Software System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwareSystem()
	 * @generated
	 * @ordered
	 */
	protected SoftwareSystem softwareSystem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeployedSoftwareSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoftwareDeploymentPackage.Literals.DEPLOYED_SOFTWARE_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFixLevel() {
		return fixLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixLevel(String newFixLevel) {
		String oldFixLevel = fixLevel;
		fixLevel = newFixLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwareDeploymentPackage.DEPLOYED_SOFTWARE_SYSTEM__FIX_LEVEL, oldFixLevel, fixLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareSystem getSoftwareSystem() {
		if (softwareSystem != null && softwareSystem.eIsProxy()) {
			InternalEObject oldSoftwareSystem = (InternalEObject)softwareSystem;
			softwareSystem = (SoftwareSystem)eResolveProxy(oldSoftwareSystem);
			if (softwareSystem != oldSoftwareSystem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SoftwareDeploymentPackage.DEPLOYED_SOFTWARE_SYSTEM__SOFTWARE_SYSTEM, oldSoftwareSystem, softwareSystem));
			}
		}
		return softwareSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareSystem basicGetSoftwareSystem() {
		return softwareSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoftwareSystem(SoftwareSystem newSoftwareSystem) {
		SoftwareSystem oldSoftwareSystem = softwareSystem;
		softwareSystem = newSoftwareSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwareDeploymentPackage.DEPLOYED_SOFTWARE_SYSTEM__SOFTWARE_SYSTEM, oldSoftwareSystem, softwareSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SoftwareDeploymentPackage.DEPLOYED_SOFTWARE_SYSTEM__FIX_LEVEL:
				return getFixLevel();
			case SoftwareDeploymentPackage.DEPLOYED_SOFTWARE_SYSTEM__SOFTWARE_SYSTEM:
				if (resolve) return getSoftwareSystem();
				return basicGetSoftwareSystem();
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
			case SoftwareDeploymentPackage.DEPLOYED_SOFTWARE_SYSTEM__FIX_LEVEL:
				setFixLevel((String)newValue);
				return;
			case SoftwareDeploymentPackage.DEPLOYED_SOFTWARE_SYSTEM__SOFTWARE_SYSTEM:
				setSoftwareSystem((SoftwareSystem)newValue);
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
			case SoftwareDeploymentPackage.DEPLOYED_SOFTWARE_SYSTEM__FIX_LEVEL:
				setFixLevel(FIX_LEVEL_EDEFAULT);
				return;
			case SoftwareDeploymentPackage.DEPLOYED_SOFTWARE_SYSTEM__SOFTWARE_SYSTEM:
				setSoftwareSystem((SoftwareSystem)null);
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
			case SoftwareDeploymentPackage.DEPLOYED_SOFTWARE_SYSTEM__FIX_LEVEL:
				return FIX_LEVEL_EDEFAULT == null ? fixLevel != null : !FIX_LEVEL_EDEFAULT.equals(fixLevel);
			case SoftwareDeploymentPackage.DEPLOYED_SOFTWARE_SYSTEM__SOFTWARE_SYSTEM:
				return softwareSystem != null;
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
		result.append(" (fixLevel: ");
		result.append(fixLevel);
		result.append(')');
		return result.toString();
	}

} //DeployedSoftwareSystemImpl

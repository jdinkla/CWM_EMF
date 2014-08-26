/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.SoftwareDeployment.impl;

import CWM.Core.impl.NamespaceImpl;

import CWM.SoftwareDeployment.DeployedComponent;
import CWM.SoftwareDeployment.Machine;
import CWM.SoftwareDeployment.Site;
import CWM.SoftwareDeployment.SoftwareDeploymentPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.SoftwareDeployment.impl.MachineImpl#getIpAddress <em>Ip Address</em>}</li>
 *   <li>{@link CWM.SoftwareDeployment.impl.MachineImpl#getHostName <em>Host Name</em>}</li>
 *   <li>{@link CWM.SoftwareDeployment.impl.MachineImpl#getMachineID <em>Machine ID</em>}</li>
 *   <li>{@link CWM.SoftwareDeployment.impl.MachineImpl#getSite <em>Site</em>}</li>
 *   <li>{@link CWM.SoftwareDeployment.impl.MachineImpl#getDeployedComponent <em>Deployed Component</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MachineImpl extends NamespaceImpl implements Machine {
	/**
	 * The cached value of the '{@link #getIpAddress() <em>Ip Address</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpAddress()
	 * @generated
	 * @ordered
	 */
	protected EList<String> ipAddress;

	/**
	 * The cached value of the '{@link #getHostName() <em>Host Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostName()
	 * @generated
	 * @ordered
	 */
	protected EList<String> hostName;

	/**
	 * The default value of the '{@link #getMachineID() <em>Machine ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachineID()
	 * @generated
	 * @ordered
	 */
	protected static final String MACHINE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMachineID() <em>Machine ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachineID()
	 * @generated
	 * @ordered
	 */
	protected String machineID = MACHINE_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSite() <em>Site</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSite()
	 * @generated
	 * @ordered
	 */
	protected Site site;

	/**
	 * The cached value of the '{@link #getDeployedComponent() <em>Deployed Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployedComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<DeployedComponent> deployedComponent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoftwareDeploymentPackage.Literals.MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getIpAddress() {
		if (ipAddress == null) {
			ipAddress = new EDataTypeEList<String>(String.class, this, SoftwareDeploymentPackage.MACHINE__IP_ADDRESS);
		}
		return ipAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getHostName() {
		if (hostName == null) {
			hostName = new EDataTypeEList<String>(String.class, this, SoftwareDeploymentPackage.MACHINE__HOST_NAME);
		}
		return hostName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMachineID() {
		return machineID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMachineID(String newMachineID) {
		String oldMachineID = machineID;
		machineID = newMachineID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwareDeploymentPackage.MACHINE__MACHINE_ID, oldMachineID, machineID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Site getSite() {
		if (site != null && site.eIsProxy()) {
			InternalEObject oldSite = (InternalEObject)site;
			site = (Site)eResolveProxy(oldSite);
			if (site != oldSite) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SoftwareDeploymentPackage.MACHINE__SITE, oldSite, site));
			}
		}
		return site;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Site basicGetSite() {
		return site;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSite(Site newSite) {
		Site oldSite = site;
		site = newSite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwareDeploymentPackage.MACHINE__SITE, oldSite, site));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeployedComponent> getDeployedComponent() {
		if (deployedComponent == null) {
			deployedComponent = new EObjectContainmentWithInverseEList<DeployedComponent>(DeployedComponent.class, this, SoftwareDeploymentPackage.MACHINE__DEPLOYED_COMPONENT, SoftwareDeploymentPackage.DEPLOYED_COMPONENT__MACHINE);
		}
		return deployedComponent;
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
			case SoftwareDeploymentPackage.MACHINE__DEPLOYED_COMPONENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDeployedComponent()).basicAdd(otherEnd, msgs);
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
			case SoftwareDeploymentPackage.MACHINE__DEPLOYED_COMPONENT:
				return ((InternalEList<?>)getDeployedComponent()).basicRemove(otherEnd, msgs);
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
			case SoftwareDeploymentPackage.MACHINE__IP_ADDRESS:
				return getIpAddress();
			case SoftwareDeploymentPackage.MACHINE__HOST_NAME:
				return getHostName();
			case SoftwareDeploymentPackage.MACHINE__MACHINE_ID:
				return getMachineID();
			case SoftwareDeploymentPackage.MACHINE__SITE:
				if (resolve) return getSite();
				return basicGetSite();
			case SoftwareDeploymentPackage.MACHINE__DEPLOYED_COMPONENT:
				return getDeployedComponent();
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
			case SoftwareDeploymentPackage.MACHINE__IP_ADDRESS:
				getIpAddress().clear();
				getIpAddress().addAll((Collection<? extends String>)newValue);
				return;
			case SoftwareDeploymentPackage.MACHINE__HOST_NAME:
				getHostName().clear();
				getHostName().addAll((Collection<? extends String>)newValue);
				return;
			case SoftwareDeploymentPackage.MACHINE__MACHINE_ID:
				setMachineID((String)newValue);
				return;
			case SoftwareDeploymentPackage.MACHINE__SITE:
				setSite((Site)newValue);
				return;
			case SoftwareDeploymentPackage.MACHINE__DEPLOYED_COMPONENT:
				getDeployedComponent().clear();
				getDeployedComponent().addAll((Collection<? extends DeployedComponent>)newValue);
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
			case SoftwareDeploymentPackage.MACHINE__IP_ADDRESS:
				getIpAddress().clear();
				return;
			case SoftwareDeploymentPackage.MACHINE__HOST_NAME:
				getHostName().clear();
				return;
			case SoftwareDeploymentPackage.MACHINE__MACHINE_ID:
				setMachineID(MACHINE_ID_EDEFAULT);
				return;
			case SoftwareDeploymentPackage.MACHINE__SITE:
				setSite((Site)null);
				return;
			case SoftwareDeploymentPackage.MACHINE__DEPLOYED_COMPONENT:
				getDeployedComponent().clear();
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
			case SoftwareDeploymentPackage.MACHINE__IP_ADDRESS:
				return ipAddress != null && !ipAddress.isEmpty();
			case SoftwareDeploymentPackage.MACHINE__HOST_NAME:
				return hostName != null && !hostName.isEmpty();
			case SoftwareDeploymentPackage.MACHINE__MACHINE_ID:
				return MACHINE_ID_EDEFAULT == null ? machineID != null : !MACHINE_ID_EDEFAULT.equals(machineID);
			case SoftwareDeploymentPackage.MACHINE__SITE:
				return site != null;
			case SoftwareDeploymentPackage.MACHINE__DEPLOYED_COMPONENT:
				return deployedComponent != null && !deployedComponent.isEmpty();
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
		result.append(" (ipAddress: ");
		result.append(ipAddress);
		result.append(", hostName: ");
		result.append(hostName);
		result.append(", machineID: ");
		result.append(machineID);
		result.append(')');
		return result.toString();
	}

} //MachineImpl

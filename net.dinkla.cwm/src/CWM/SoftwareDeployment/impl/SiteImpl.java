/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.SoftwareDeployment.impl;

import CWM.BusinessInformation.impl.LocationImpl;

import CWM.SoftwareDeployment.Site;
import CWM.SoftwareDeployment.SoftwareDeploymentPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Site</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.SoftwareDeployment.impl.SiteImpl#getContainingSite <em>Containing Site</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SiteImpl extends LocationImpl implements Site {
	/**
	 * The cached value of the '{@link #getContainingSite() <em>Containing Site</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainingSite()
	 * @generated
	 * @ordered
	 */
	protected EList<Site> containingSite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SiteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoftwareDeploymentPackage.Literals.SITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Site> getContainingSite() {
		if (containingSite == null) {
			containingSite = new EObjectResolvingEList<Site>(Site.class, this, SoftwareDeploymentPackage.SITE__CONTAINING_SITE);
		}
		return containingSite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SoftwareDeploymentPackage.SITE__CONTAINING_SITE:
				return getContainingSite();
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
			case SoftwareDeploymentPackage.SITE__CONTAINING_SITE:
				getContainingSite().clear();
				getContainingSite().addAll((Collection<? extends Site>)newValue);
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
			case SoftwareDeploymentPackage.SITE__CONTAINING_SITE:
				getContainingSite().clear();
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
			case SoftwareDeploymentPackage.SITE__CONTAINING_SITE:
				return containingSite != null && !containingSite.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SiteImpl

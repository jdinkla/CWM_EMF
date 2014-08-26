/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Clustering.impl;

import CWM.Clustering.ClusteringAttributeUsage;
import CWM.Clustering.ClusteringFunctionSettings;
import CWM.Clustering.ClusteringPackage;
import CWM.Clustering.Clustering_container;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clustering container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.Clustering.impl.Clustering_containerImpl#getClusteringAttributeUsage <em>Clustering Attribute Usage</em>}</li>
 *   <li>{@link CWM.Clustering.impl.Clustering_containerImpl#getClusteringFunctionSettings <em>Clustering Function Settings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Clustering_containerImpl extends EObjectImpl implements Clustering_container {
	/**
	 * The cached value of the '{@link #getClusteringAttributeUsage() <em>Clustering Attribute Usage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClusteringAttributeUsage()
	 * @generated
	 * @ordered
	 */
	protected EList<ClusteringAttributeUsage> clusteringAttributeUsage;

	/**
	 * The cached value of the '{@link #getClusteringFunctionSettings() <em>Clustering Function Settings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClusteringFunctionSettings()
	 * @generated
	 * @ordered
	 */
	protected EList<ClusteringFunctionSettings> clusteringFunctionSettings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Clustering_containerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClusteringPackage.Literals.CLUSTERING_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClusteringAttributeUsage> getClusteringAttributeUsage() {
		if (clusteringAttributeUsage == null) {
			clusteringAttributeUsage = new EObjectContainmentEList<ClusteringAttributeUsage>(ClusteringAttributeUsage.class, this, ClusteringPackage.CLUSTERING_CONTAINER__CLUSTERING_ATTRIBUTE_USAGE);
		}
		return clusteringAttributeUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClusteringFunctionSettings> getClusteringFunctionSettings() {
		if (clusteringFunctionSettings == null) {
			clusteringFunctionSettings = new EObjectContainmentEList<ClusteringFunctionSettings>(ClusteringFunctionSettings.class, this, ClusteringPackage.CLUSTERING_CONTAINER__CLUSTERING_FUNCTION_SETTINGS);
		}
		return clusteringFunctionSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ClusteringPackage.CLUSTERING_CONTAINER__CLUSTERING_ATTRIBUTE_USAGE:
				return ((InternalEList<?>)getClusteringAttributeUsage()).basicRemove(otherEnd, msgs);
			case ClusteringPackage.CLUSTERING_CONTAINER__CLUSTERING_FUNCTION_SETTINGS:
				return ((InternalEList<?>)getClusteringFunctionSettings()).basicRemove(otherEnd, msgs);
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
			case ClusteringPackage.CLUSTERING_CONTAINER__CLUSTERING_ATTRIBUTE_USAGE:
				return getClusteringAttributeUsage();
			case ClusteringPackage.CLUSTERING_CONTAINER__CLUSTERING_FUNCTION_SETTINGS:
				return getClusteringFunctionSettings();
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
			case ClusteringPackage.CLUSTERING_CONTAINER__CLUSTERING_ATTRIBUTE_USAGE:
				getClusteringAttributeUsage().clear();
				getClusteringAttributeUsage().addAll((Collection<? extends ClusteringAttributeUsage>)newValue);
				return;
			case ClusteringPackage.CLUSTERING_CONTAINER__CLUSTERING_FUNCTION_SETTINGS:
				getClusteringFunctionSettings().clear();
				getClusteringFunctionSettings().addAll((Collection<? extends ClusteringFunctionSettings>)newValue);
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
			case ClusteringPackage.CLUSTERING_CONTAINER__CLUSTERING_ATTRIBUTE_USAGE:
				getClusteringAttributeUsage().clear();
				return;
			case ClusteringPackage.CLUSTERING_CONTAINER__CLUSTERING_FUNCTION_SETTINGS:
				getClusteringFunctionSettings().clear();
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
			case ClusteringPackage.CLUSTERING_CONTAINER__CLUSTERING_ATTRIBUTE_USAGE:
				return clusteringAttributeUsage != null && !clusteringAttributeUsage.isEmpty();
			case ClusteringPackage.CLUSTERING_CONTAINER__CLUSTERING_FUNCTION_SETTINGS:
				return clusteringFunctionSettings != null && !clusteringFunctionSettings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Clustering_containerImpl

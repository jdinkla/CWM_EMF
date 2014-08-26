/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.KeysIndexes.impl;

import CWM.Core.impl.ModelElementImpl;

import CWM.KeysIndexes.Index;
import CWM.KeysIndexes.IndexedFeature;
import CWM.KeysIndexes.KeysIndexesPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Index</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.KeysIndexes.impl.IndexImpl#getIsPartitioning <em>Is Partitioning</em>}</li>
 *   <li>{@link CWM.KeysIndexes.impl.IndexImpl#getIsSorted <em>Is Sorted</em>}</li>
 *   <li>{@link CWM.KeysIndexes.impl.IndexImpl#getIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link CWM.KeysIndexes.impl.IndexImpl#getIndexedFeature <em>Indexed Feature</em>}</li>
 *   <li>{@link CWM.KeysIndexes.impl.IndexImpl#getSpannedClass <em>Spanned Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IndexImpl extends ModelElementImpl implements Index {
	/**
	 * The default value of the '{@link #getIsPartitioning() <em>Is Partitioning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsPartitioning()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_PARTITIONING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsPartitioning() <em>Is Partitioning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsPartitioning()
	 * @generated
	 * @ordered
	 */
	protected Boolean isPartitioning = IS_PARTITIONING_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsSorted() <em>Is Sorted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSorted()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_SORTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsSorted() <em>Is Sorted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSorted()
	 * @generated
	 * @ordered
	 */
	protected Boolean isSorted = IS_SORTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsUnique()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_UNIQUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsUnique()
	 * @generated
	 * @ordered
	 */
	protected Boolean isUnique = IS_UNIQUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIndexedFeature() <em>Indexed Feature</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexedFeature()
	 * @generated
	 * @ordered
	 */
	protected EList<IndexedFeature> indexedFeature;

	/**
	 * The cached value of the '{@link #getSpannedClass() <em>Spanned Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpannedClass()
	 * @generated
	 * @ordered
	 */
	protected CWM.Core.Class spannedClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndexImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KeysIndexesPackage.Literals.INDEX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsPartitioning() {
		return isPartitioning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPartitioning(Boolean newIsPartitioning) {
		Boolean oldIsPartitioning = isPartitioning;
		isPartitioning = newIsPartitioning;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KeysIndexesPackage.INDEX__IS_PARTITIONING, oldIsPartitioning, isPartitioning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsSorted() {
		return isSorted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSorted(Boolean newIsSorted) {
		Boolean oldIsSorted = isSorted;
		isSorted = newIsSorted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KeysIndexesPackage.INDEX__IS_SORTED, oldIsSorted, isSorted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsUnique() {
		return isUnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsUnique(Boolean newIsUnique) {
		Boolean oldIsUnique = isUnique;
		isUnique = newIsUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KeysIndexesPackage.INDEX__IS_UNIQUE, oldIsUnique, isUnique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IndexedFeature> getIndexedFeature() {
		if (indexedFeature == null) {
			indexedFeature = new EObjectContainmentWithInverseEList<IndexedFeature>(IndexedFeature.class, this, KeysIndexesPackage.INDEX__INDEXED_FEATURE, KeysIndexesPackage.INDEXED_FEATURE__INDEX);
		}
		return indexedFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CWM.Core.Class getSpannedClass() {
		if (spannedClass != null && spannedClass.eIsProxy()) {
			InternalEObject oldSpannedClass = (InternalEObject)spannedClass;
			spannedClass = (CWM.Core.Class)eResolveProxy(oldSpannedClass);
			if (spannedClass != oldSpannedClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KeysIndexesPackage.INDEX__SPANNED_CLASS, oldSpannedClass, spannedClass));
			}
		}
		return spannedClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CWM.Core.Class basicGetSpannedClass() {
		return spannedClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpannedClass(CWM.Core.Class newSpannedClass) {
		CWM.Core.Class oldSpannedClass = spannedClass;
		spannedClass = newSpannedClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KeysIndexesPackage.INDEX__SPANNED_CLASS, oldSpannedClass, spannedClass));
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
			case KeysIndexesPackage.INDEX__INDEXED_FEATURE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIndexedFeature()).basicAdd(otherEnd, msgs);
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
			case KeysIndexesPackage.INDEX__INDEXED_FEATURE:
				return ((InternalEList<?>)getIndexedFeature()).basicRemove(otherEnd, msgs);
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
			case KeysIndexesPackage.INDEX__IS_PARTITIONING:
				return getIsPartitioning();
			case KeysIndexesPackage.INDEX__IS_SORTED:
				return getIsSorted();
			case KeysIndexesPackage.INDEX__IS_UNIQUE:
				return getIsUnique();
			case KeysIndexesPackage.INDEX__INDEXED_FEATURE:
				return getIndexedFeature();
			case KeysIndexesPackage.INDEX__SPANNED_CLASS:
				if (resolve) return getSpannedClass();
				return basicGetSpannedClass();
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
			case KeysIndexesPackage.INDEX__IS_PARTITIONING:
				setIsPartitioning((Boolean)newValue);
				return;
			case KeysIndexesPackage.INDEX__IS_SORTED:
				setIsSorted((Boolean)newValue);
				return;
			case KeysIndexesPackage.INDEX__IS_UNIQUE:
				setIsUnique((Boolean)newValue);
				return;
			case KeysIndexesPackage.INDEX__INDEXED_FEATURE:
				getIndexedFeature().clear();
				getIndexedFeature().addAll((Collection<? extends IndexedFeature>)newValue);
				return;
			case KeysIndexesPackage.INDEX__SPANNED_CLASS:
				setSpannedClass((CWM.Core.Class)newValue);
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
			case KeysIndexesPackage.INDEX__IS_PARTITIONING:
				setIsPartitioning(IS_PARTITIONING_EDEFAULT);
				return;
			case KeysIndexesPackage.INDEX__IS_SORTED:
				setIsSorted(IS_SORTED_EDEFAULT);
				return;
			case KeysIndexesPackage.INDEX__IS_UNIQUE:
				setIsUnique(IS_UNIQUE_EDEFAULT);
				return;
			case KeysIndexesPackage.INDEX__INDEXED_FEATURE:
				getIndexedFeature().clear();
				return;
			case KeysIndexesPackage.INDEX__SPANNED_CLASS:
				setSpannedClass((CWM.Core.Class)null);
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
			case KeysIndexesPackage.INDEX__IS_PARTITIONING:
				return IS_PARTITIONING_EDEFAULT == null ? isPartitioning != null : !IS_PARTITIONING_EDEFAULT.equals(isPartitioning);
			case KeysIndexesPackage.INDEX__IS_SORTED:
				return IS_SORTED_EDEFAULT == null ? isSorted != null : !IS_SORTED_EDEFAULT.equals(isSorted);
			case KeysIndexesPackage.INDEX__IS_UNIQUE:
				return IS_UNIQUE_EDEFAULT == null ? isUnique != null : !IS_UNIQUE_EDEFAULT.equals(isUnique);
			case KeysIndexesPackage.INDEX__INDEXED_FEATURE:
				return indexedFeature != null && !indexedFeature.isEmpty();
			case KeysIndexesPackage.INDEX__SPANNED_CLASS:
				return spannedClass != null;
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
		result.append(" (isPartitioning: ");
		result.append(isPartitioning);
		result.append(", isSorted: ");
		result.append(isSorted);
		result.append(", isUnique: ");
		result.append(isUnique);
		result.append(')');
		return result.toString();
	}

} //IndexImpl

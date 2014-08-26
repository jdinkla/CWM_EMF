/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.KeysIndexes.impl;

import CWM.KeysIndexes.Index;
import CWM.KeysIndexes.IndexedFeature;
import CWM.KeysIndexes.KeyRelationship;
import CWM.KeysIndexes.KeysIndexesPackage;
import CWM.KeysIndexes.KeysIndexes_container;
import CWM.KeysIndexes.UniqueKey;

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
 * An implementation of the model object '<em><b>Keys Indexes container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.KeysIndexes.impl.KeysIndexes_containerImpl#getUniqueKey <em>Unique Key</em>}</li>
 *   <li>{@link CWM.KeysIndexes.impl.KeysIndexes_containerImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link CWM.KeysIndexes.impl.KeysIndexes_containerImpl#getKeyRelationship <em>Key Relationship</em>}</li>
 *   <li>{@link CWM.KeysIndexes.impl.KeysIndexes_containerImpl#getIndexedFeature <em>Indexed Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KeysIndexes_containerImpl extends EObjectImpl implements KeysIndexes_container {
	/**
	 * The cached value of the '{@link #getUniqueKey() <em>Unique Key</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueKey()
	 * @generated
	 * @ordered
	 */
	protected EList<UniqueKey> uniqueKey;

	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected EList<Index> index;

	/**
	 * The cached value of the '{@link #getKeyRelationship() <em>Key Relationship</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyRelationship()
	 * @generated
	 * @ordered
	 */
	protected EList<KeyRelationship> keyRelationship;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KeysIndexes_containerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KeysIndexesPackage.Literals.KEYS_INDEXES_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UniqueKey> getUniqueKey() {
		if (uniqueKey == null) {
			uniqueKey = new EObjectContainmentEList<UniqueKey>(UniqueKey.class, this, KeysIndexesPackage.KEYS_INDEXES_CONTAINER__UNIQUE_KEY);
		}
		return uniqueKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Index> getIndex() {
		if (index == null) {
			index = new EObjectContainmentEList<Index>(Index.class, this, KeysIndexesPackage.KEYS_INDEXES_CONTAINER__INDEX);
		}
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KeyRelationship> getKeyRelationship() {
		if (keyRelationship == null) {
			keyRelationship = new EObjectContainmentEList<KeyRelationship>(KeyRelationship.class, this, KeysIndexesPackage.KEYS_INDEXES_CONTAINER__KEY_RELATIONSHIP);
		}
		return keyRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IndexedFeature> getIndexedFeature() {
		if (indexedFeature == null) {
			indexedFeature = new EObjectContainmentEList<IndexedFeature>(IndexedFeature.class, this, KeysIndexesPackage.KEYS_INDEXES_CONTAINER__INDEXED_FEATURE);
		}
		return indexedFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KeysIndexesPackage.KEYS_INDEXES_CONTAINER__UNIQUE_KEY:
				return ((InternalEList<?>)getUniqueKey()).basicRemove(otherEnd, msgs);
			case KeysIndexesPackage.KEYS_INDEXES_CONTAINER__INDEX:
				return ((InternalEList<?>)getIndex()).basicRemove(otherEnd, msgs);
			case KeysIndexesPackage.KEYS_INDEXES_CONTAINER__KEY_RELATIONSHIP:
				return ((InternalEList<?>)getKeyRelationship()).basicRemove(otherEnd, msgs);
			case KeysIndexesPackage.KEYS_INDEXES_CONTAINER__INDEXED_FEATURE:
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
			case KeysIndexesPackage.KEYS_INDEXES_CONTAINER__UNIQUE_KEY:
				return getUniqueKey();
			case KeysIndexesPackage.KEYS_INDEXES_CONTAINER__INDEX:
				return getIndex();
			case KeysIndexesPackage.KEYS_INDEXES_CONTAINER__KEY_RELATIONSHIP:
				return getKeyRelationship();
			case KeysIndexesPackage.KEYS_INDEXES_CONTAINER__INDEXED_FEATURE:
				return getIndexedFeature();
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
			case KeysIndexesPackage.KEYS_INDEXES_CONTAINER__UNIQUE_KEY:
				getUniqueKey().clear();
				getUniqueKey().addAll((Collection<? extends UniqueKey>)newValue);
				return;
			case KeysIndexesPackage.KEYS_INDEXES_CONTAINER__INDEX:
				getIndex().clear();
				getIndex().addAll((Collection<? extends Index>)newValue);
				return;
			case KeysIndexesPackage.KEYS_INDEXES_CONTAINER__KEY_RELATIONSHIP:
				getKeyRelationship().clear();
				getKeyRelationship().addAll((Collection<? extends KeyRelationship>)newValue);
				return;
			case KeysIndexesPackage.KEYS_INDEXES_CONTAINER__INDEXED_FEATURE:
				getIndexedFeature().clear();
				getIndexedFeature().addAll((Collection<? extends IndexedFeature>)newValue);
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
			case KeysIndexesPackage.KEYS_INDEXES_CONTAINER__UNIQUE_KEY:
				getUniqueKey().clear();
				return;
			case KeysIndexesPackage.KEYS_INDEXES_CONTAINER__INDEX:
				getIndex().clear();
				return;
			case KeysIndexesPackage.KEYS_INDEXES_CONTAINER__KEY_RELATIONSHIP:
				getKeyRelationship().clear();
				return;
			case KeysIndexesPackage.KEYS_INDEXES_CONTAINER__INDEXED_FEATURE:
				getIndexedFeature().clear();
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
			case KeysIndexesPackage.KEYS_INDEXES_CONTAINER__UNIQUE_KEY:
				return uniqueKey != null && !uniqueKey.isEmpty();
			case KeysIndexesPackage.KEYS_INDEXES_CONTAINER__INDEX:
				return index != null && !index.isEmpty();
			case KeysIndexesPackage.KEYS_INDEXES_CONTAINER__KEY_RELATIONSHIP:
				return keyRelationship != null && !keyRelationship.isEmpty();
			case KeysIndexesPackage.KEYS_INDEXES_CONTAINER__INDEXED_FEATURE:
				return indexedFeature != null && !indexedFeature.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //KeysIndexes_containerImpl

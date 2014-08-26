/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningData.impl;

import CWM.Core.impl.ModelElementImpl;

import CWM.MiningCore.MiningData.Category;
import CWM.MiningCore.MiningData.CategoryMapObjectEntry;
import CWM.MiningCore.MiningData.MiningDataPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Category Map Object Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.MiningCore.MiningData.impl.CategoryMapObjectEntryImpl#getChild <em>Child</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.impl.CategoryMapObjectEntryImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.impl.CategoryMapObjectEntryImpl#getGraphId <em>Graph Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CategoryMapObjectEntryImpl extends ModelElementImpl implements CategoryMapObjectEntry {
	/**
	 * The cached value of the '{@link #getChild() <em>Child</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChild()
	 * @generated
	 * @ordered
	 */
	protected Category child;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected EList<Category> parent;

	/**
	 * The default value of the '{@link #getGraphId() <em>Graph Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphId()
	 * @generated
	 * @ordered
	 */
	protected static final Object GRAPH_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGraphId() <em>Graph Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphId()
	 * @generated
	 * @ordered
	 */
	protected Object graphId = GRAPH_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CategoryMapObjectEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MiningDataPackage.Literals.CATEGORY_MAP_OBJECT_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category getChild() {
		if (child != null && child.eIsProxy()) {
			InternalEObject oldChild = (InternalEObject)child;
			child = (Category)eResolveProxy(oldChild);
			if (child != oldChild) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MiningDataPackage.CATEGORY_MAP_OBJECT_ENTRY__CHILD, oldChild, child));
			}
		}
		return child;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category basicGetChild() {
		return child;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChild(Category newChild) {
		Category oldChild = child;
		child = newChild;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiningDataPackage.CATEGORY_MAP_OBJECT_ENTRY__CHILD, oldChild, child));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Category> getParent() {
		if (parent == null) {
			parent = new EObjectResolvingEList<Category>(Category.class, this, MiningDataPackage.CATEGORY_MAP_OBJECT_ENTRY__PARENT);
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getGraphId() {
		return graphId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGraphId(Object newGraphId) {
		Object oldGraphId = graphId;
		graphId = newGraphId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiningDataPackage.CATEGORY_MAP_OBJECT_ENTRY__GRAPH_ID, oldGraphId, graphId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MiningDataPackage.CATEGORY_MAP_OBJECT_ENTRY__CHILD:
				if (resolve) return getChild();
				return basicGetChild();
			case MiningDataPackage.CATEGORY_MAP_OBJECT_ENTRY__PARENT:
				return getParent();
			case MiningDataPackage.CATEGORY_MAP_OBJECT_ENTRY__GRAPH_ID:
				return getGraphId();
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
			case MiningDataPackage.CATEGORY_MAP_OBJECT_ENTRY__CHILD:
				setChild((Category)newValue);
				return;
			case MiningDataPackage.CATEGORY_MAP_OBJECT_ENTRY__PARENT:
				getParent().clear();
				getParent().addAll((Collection<? extends Category>)newValue);
				return;
			case MiningDataPackage.CATEGORY_MAP_OBJECT_ENTRY__GRAPH_ID:
				setGraphId(newValue);
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
			case MiningDataPackage.CATEGORY_MAP_OBJECT_ENTRY__CHILD:
				setChild((Category)null);
				return;
			case MiningDataPackage.CATEGORY_MAP_OBJECT_ENTRY__PARENT:
				getParent().clear();
				return;
			case MiningDataPackage.CATEGORY_MAP_OBJECT_ENTRY__GRAPH_ID:
				setGraphId(GRAPH_ID_EDEFAULT);
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
			case MiningDataPackage.CATEGORY_MAP_OBJECT_ENTRY__CHILD:
				return child != null;
			case MiningDataPackage.CATEGORY_MAP_OBJECT_ENTRY__PARENT:
				return parent != null && !parent.isEmpty();
			case MiningDataPackage.CATEGORY_MAP_OBJECT_ENTRY__GRAPH_ID:
				return GRAPH_ID_EDEFAULT == null ? graphId != null : !GRAPH_ID_EDEFAULT.equals(graphId);
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
		result.append(" (graphId: ");
		result.append(graphId);
		result.append(')');
		return result.toString();
	}

} //CategoryMapObjectEntryImpl

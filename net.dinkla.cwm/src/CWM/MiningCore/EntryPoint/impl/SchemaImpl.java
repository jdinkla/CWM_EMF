/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.EntryPoint.impl;

import CWM.Core.impl.NamespaceImpl;

import CWM.MiningCore.EntryPoint.AuxiliaryObject;
import CWM.MiningCore.EntryPoint.EntryPointPackage;
import CWM.MiningCore.EntryPoint.Schema;

import CWM.MiningCore.MiningData.CategoryMatrix;
import CWM.MiningCore.MiningData.CategoryTaxonomy;
import CWM.MiningCore.MiningData.LogicalData;

import CWM.MiningCore.MiningFunctionSettings.MiningFunctionSettings;

import CWM.MiningCore.MiningModel.MiningModel;

import CWM.MiningCore.MiningResult.MiningResult;

import CWM.MiningCore.MiningTask.MiningTask;

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
 *   <li>{@link CWM.MiningCore.EntryPoint.impl.SchemaImpl#getLogicalData <em>Logical Data</em>}</li>
 *   <li>{@link CWM.MiningCore.EntryPoint.impl.SchemaImpl#getCategoryMatrix <em>Category Matrix</em>}</li>
 *   <li>{@link CWM.MiningCore.EntryPoint.impl.SchemaImpl#getMiningModel <em>Mining Model</em>}</li>
 *   <li>{@link CWM.MiningCore.EntryPoint.impl.SchemaImpl#getMiningFunctionSettings <em>Mining Function Settings</em>}</li>
 *   <li>{@link CWM.MiningCore.EntryPoint.impl.SchemaImpl#getTaxonomy <em>Taxonomy</em>}</li>
 *   <li>{@link CWM.MiningCore.EntryPoint.impl.SchemaImpl#getMiningTask <em>Mining Task</em>}</li>
 *   <li>{@link CWM.MiningCore.EntryPoint.impl.SchemaImpl#getResult <em>Result</em>}</li>
 *   <li>{@link CWM.MiningCore.EntryPoint.impl.SchemaImpl#getAuxObjects <em>Aux Objects</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SchemaImpl extends NamespaceImpl implements Schema {
	/**
	 * The cached value of the '{@link #getLogicalData() <em>Logical Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalData()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalData> logicalData;

	/**
	 * The cached value of the '{@link #getCategoryMatrix() <em>Category Matrix</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoryMatrix()
	 * @generated
	 * @ordered
	 */
	protected EList<CategoryMatrix> categoryMatrix;

	/**
	 * The cached value of the '{@link #getMiningModel() <em>Mining Model</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiningModel()
	 * @generated
	 * @ordered
	 */
	protected EList<MiningModel> miningModel;

	/**
	 * The cached value of the '{@link #getMiningFunctionSettings() <em>Mining Function Settings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiningFunctionSettings()
	 * @generated
	 * @ordered
	 */
	protected EList<MiningFunctionSettings> miningFunctionSettings;

	/**
	 * The cached value of the '{@link #getTaxonomy() <em>Taxonomy</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxonomy()
	 * @generated
	 * @ordered
	 */
	protected EList<CategoryTaxonomy> taxonomy;

	/**
	 * The cached value of the '{@link #getMiningTask() <em>Mining Task</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiningTask()
	 * @generated
	 * @ordered
	 */
	protected EList<MiningTask> miningTask;

	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected EList<MiningResult> result;

	/**
	 * The cached value of the '{@link #getAuxObjects() <em>Aux Objects</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuxObjects()
	 * @generated
	 * @ordered
	 */
	protected AuxiliaryObject auxObjects;

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
		return EntryPointPackage.Literals.SCHEMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogicalData> getLogicalData() {
		if (logicalData == null) {
			logicalData = new EObjectContainmentEList<LogicalData>(LogicalData.class, this, EntryPointPackage.SCHEMA__LOGICAL_DATA);
		}
		return logicalData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CategoryMatrix> getCategoryMatrix() {
		if (categoryMatrix == null) {
			categoryMatrix = new EObjectContainmentEList<CategoryMatrix>(CategoryMatrix.class, this, EntryPointPackage.SCHEMA__CATEGORY_MATRIX);
		}
		return categoryMatrix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MiningModel> getMiningModel() {
		if (miningModel == null) {
			miningModel = new EObjectContainmentEList<MiningModel>(MiningModel.class, this, EntryPointPackage.SCHEMA__MINING_MODEL);
		}
		return miningModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MiningFunctionSettings> getMiningFunctionSettings() {
		if (miningFunctionSettings == null) {
			miningFunctionSettings = new EObjectContainmentEList<MiningFunctionSettings>(MiningFunctionSettings.class, this, EntryPointPackage.SCHEMA__MINING_FUNCTION_SETTINGS);
		}
		return miningFunctionSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CategoryTaxonomy> getTaxonomy() {
		if (taxonomy == null) {
			taxonomy = new EObjectContainmentEList<CategoryTaxonomy>(CategoryTaxonomy.class, this, EntryPointPackage.SCHEMA__TAXONOMY);
		}
		return taxonomy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MiningTask> getMiningTask() {
		if (miningTask == null) {
			miningTask = new EObjectContainmentEList<MiningTask>(MiningTask.class, this, EntryPointPackage.SCHEMA__MINING_TASK);
		}
		return miningTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MiningResult> getResult() {
		if (result == null) {
			result = new EObjectContainmentEList<MiningResult>(MiningResult.class, this, EntryPointPackage.SCHEMA__RESULT);
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuxiliaryObject getAuxObjects() {
		return auxObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuxObjects(AuxiliaryObject newAuxObjects, NotificationChain msgs) {
		AuxiliaryObject oldAuxObjects = auxObjects;
		auxObjects = newAuxObjects;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EntryPointPackage.SCHEMA__AUX_OBJECTS, oldAuxObjects, newAuxObjects);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuxObjects(AuxiliaryObject newAuxObjects) {
		if (newAuxObjects != auxObjects) {
			NotificationChain msgs = null;
			if (auxObjects != null)
				msgs = ((InternalEObject)auxObjects).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EntryPointPackage.SCHEMA__AUX_OBJECTS, null, msgs);
			if (newAuxObjects != null)
				msgs = ((InternalEObject)newAuxObjects).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EntryPointPackage.SCHEMA__AUX_OBJECTS, null, msgs);
			msgs = basicSetAuxObjects(newAuxObjects, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntryPointPackage.SCHEMA__AUX_OBJECTS, newAuxObjects, newAuxObjects));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EntryPointPackage.SCHEMA__LOGICAL_DATA:
				return ((InternalEList<?>)getLogicalData()).basicRemove(otherEnd, msgs);
			case EntryPointPackage.SCHEMA__CATEGORY_MATRIX:
				return ((InternalEList<?>)getCategoryMatrix()).basicRemove(otherEnd, msgs);
			case EntryPointPackage.SCHEMA__MINING_MODEL:
				return ((InternalEList<?>)getMiningModel()).basicRemove(otherEnd, msgs);
			case EntryPointPackage.SCHEMA__MINING_FUNCTION_SETTINGS:
				return ((InternalEList<?>)getMiningFunctionSettings()).basicRemove(otherEnd, msgs);
			case EntryPointPackage.SCHEMA__TAXONOMY:
				return ((InternalEList<?>)getTaxonomy()).basicRemove(otherEnd, msgs);
			case EntryPointPackage.SCHEMA__MINING_TASK:
				return ((InternalEList<?>)getMiningTask()).basicRemove(otherEnd, msgs);
			case EntryPointPackage.SCHEMA__RESULT:
				return ((InternalEList<?>)getResult()).basicRemove(otherEnd, msgs);
			case EntryPointPackage.SCHEMA__AUX_OBJECTS:
				return basicSetAuxObjects(null, msgs);
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
			case EntryPointPackage.SCHEMA__LOGICAL_DATA:
				return getLogicalData();
			case EntryPointPackage.SCHEMA__CATEGORY_MATRIX:
				return getCategoryMatrix();
			case EntryPointPackage.SCHEMA__MINING_MODEL:
				return getMiningModel();
			case EntryPointPackage.SCHEMA__MINING_FUNCTION_SETTINGS:
				return getMiningFunctionSettings();
			case EntryPointPackage.SCHEMA__TAXONOMY:
				return getTaxonomy();
			case EntryPointPackage.SCHEMA__MINING_TASK:
				return getMiningTask();
			case EntryPointPackage.SCHEMA__RESULT:
				return getResult();
			case EntryPointPackage.SCHEMA__AUX_OBJECTS:
				return getAuxObjects();
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
			case EntryPointPackage.SCHEMA__LOGICAL_DATA:
				getLogicalData().clear();
				getLogicalData().addAll((Collection<? extends LogicalData>)newValue);
				return;
			case EntryPointPackage.SCHEMA__CATEGORY_MATRIX:
				getCategoryMatrix().clear();
				getCategoryMatrix().addAll((Collection<? extends CategoryMatrix>)newValue);
				return;
			case EntryPointPackage.SCHEMA__MINING_MODEL:
				getMiningModel().clear();
				getMiningModel().addAll((Collection<? extends MiningModel>)newValue);
				return;
			case EntryPointPackage.SCHEMA__MINING_FUNCTION_SETTINGS:
				getMiningFunctionSettings().clear();
				getMiningFunctionSettings().addAll((Collection<? extends MiningFunctionSettings>)newValue);
				return;
			case EntryPointPackage.SCHEMA__TAXONOMY:
				getTaxonomy().clear();
				getTaxonomy().addAll((Collection<? extends CategoryTaxonomy>)newValue);
				return;
			case EntryPointPackage.SCHEMA__MINING_TASK:
				getMiningTask().clear();
				getMiningTask().addAll((Collection<? extends MiningTask>)newValue);
				return;
			case EntryPointPackage.SCHEMA__RESULT:
				getResult().clear();
				getResult().addAll((Collection<? extends MiningResult>)newValue);
				return;
			case EntryPointPackage.SCHEMA__AUX_OBJECTS:
				setAuxObjects((AuxiliaryObject)newValue);
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
			case EntryPointPackage.SCHEMA__LOGICAL_DATA:
				getLogicalData().clear();
				return;
			case EntryPointPackage.SCHEMA__CATEGORY_MATRIX:
				getCategoryMatrix().clear();
				return;
			case EntryPointPackage.SCHEMA__MINING_MODEL:
				getMiningModel().clear();
				return;
			case EntryPointPackage.SCHEMA__MINING_FUNCTION_SETTINGS:
				getMiningFunctionSettings().clear();
				return;
			case EntryPointPackage.SCHEMA__TAXONOMY:
				getTaxonomy().clear();
				return;
			case EntryPointPackage.SCHEMA__MINING_TASK:
				getMiningTask().clear();
				return;
			case EntryPointPackage.SCHEMA__RESULT:
				getResult().clear();
				return;
			case EntryPointPackage.SCHEMA__AUX_OBJECTS:
				setAuxObjects((AuxiliaryObject)null);
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
			case EntryPointPackage.SCHEMA__LOGICAL_DATA:
				return logicalData != null && !logicalData.isEmpty();
			case EntryPointPackage.SCHEMA__CATEGORY_MATRIX:
				return categoryMatrix != null && !categoryMatrix.isEmpty();
			case EntryPointPackage.SCHEMA__MINING_MODEL:
				return miningModel != null && !miningModel.isEmpty();
			case EntryPointPackage.SCHEMA__MINING_FUNCTION_SETTINGS:
				return miningFunctionSettings != null && !miningFunctionSettings.isEmpty();
			case EntryPointPackage.SCHEMA__TAXONOMY:
				return taxonomy != null && !taxonomy.isEmpty();
			case EntryPointPackage.SCHEMA__MINING_TASK:
				return miningTask != null && !miningTask.isEmpty();
			case EntryPointPackage.SCHEMA__RESULT:
				return result != null && !result.isEmpty();
			case EntryPointPackage.SCHEMA__AUX_OBJECTS:
				return auxObjects != null;
		}
		return super.eIsSet(featureID);
	}

} //SchemaImpl

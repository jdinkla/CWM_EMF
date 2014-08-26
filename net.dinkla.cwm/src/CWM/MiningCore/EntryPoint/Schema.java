/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.EntryPoint;

import CWM.Core.Namespace;

import CWM.MiningCore.MiningData.CategoryMatrix;
import CWM.MiningCore.MiningData.CategoryTaxonomy;
import CWM.MiningCore.MiningData.LogicalData;

import CWM.MiningCore.MiningFunctionSettings.MiningFunctionSettings;

import CWM.MiningCore.MiningModel.MiningModel;

import CWM.MiningCore.MiningResult.MiningResult;

import CWM.MiningCore.MiningTask.MiningTask;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.MiningCore.EntryPoint.Schema#getLogicalData <em>Logical Data</em>}</li>
 *   <li>{@link CWM.MiningCore.EntryPoint.Schema#getCategoryMatrix <em>Category Matrix</em>}</li>
 *   <li>{@link CWM.MiningCore.EntryPoint.Schema#getMiningModel <em>Mining Model</em>}</li>
 *   <li>{@link CWM.MiningCore.EntryPoint.Schema#getMiningFunctionSettings <em>Mining Function Settings</em>}</li>
 *   <li>{@link CWM.MiningCore.EntryPoint.Schema#getTaxonomy <em>Taxonomy</em>}</li>
 *   <li>{@link CWM.MiningCore.EntryPoint.Schema#getMiningTask <em>Mining Task</em>}</li>
 *   <li>{@link CWM.MiningCore.EntryPoint.Schema#getResult <em>Result</em>}</li>
 *   <li>{@link CWM.MiningCore.EntryPoint.Schema#getAuxObjects <em>Aux Objects</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.MiningCore.EntryPoint.EntryPointPackage#getSchema()
 * @model
 * @generated
 */
public interface Schema extends Namespace {
	/**
	 * Returns the value of the '<em><b>Logical Data</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.MiningCore.MiningData.LogicalData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logical Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical Data</em>' containment reference list.
	 * @see CWM.MiningCore.EntryPoint.EntryPointPackage#getSchema_LogicalData()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<LogicalData> getLogicalData();

	/**
	 * Returns the value of the '<em><b>Category Matrix</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.MiningCore.MiningData.CategoryMatrix}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category Matrix</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category Matrix</em>' containment reference list.
	 * @see CWM.MiningCore.EntryPoint.EntryPointPackage#getSchema_CategoryMatrix()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<CategoryMatrix> getCategoryMatrix();

	/**
	 * Returns the value of the '<em><b>Mining Model</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.MiningCore.MiningModel.MiningModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mining Model</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mining Model</em>' containment reference list.
	 * @see CWM.MiningCore.EntryPoint.EntryPointPackage#getSchema_MiningModel()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<MiningModel> getMiningModel();

	/**
	 * Returns the value of the '<em><b>Mining Function Settings</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.MiningCore.MiningFunctionSettings.MiningFunctionSettings}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mining Function Settings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mining Function Settings</em>' containment reference list.
	 * @see CWM.MiningCore.EntryPoint.EntryPointPackage#getSchema_MiningFunctionSettings()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<MiningFunctionSettings> getMiningFunctionSettings();

	/**
	 * Returns the value of the '<em><b>Taxonomy</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.MiningCore.MiningData.CategoryTaxonomy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Taxonomy</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Taxonomy</em>' containment reference list.
	 * @see CWM.MiningCore.EntryPoint.EntryPointPackage#getSchema_Taxonomy()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<CategoryTaxonomy> getTaxonomy();

	/**
	 * Returns the value of the '<em><b>Mining Task</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.MiningCore.MiningTask.MiningTask}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mining Task</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mining Task</em>' containment reference list.
	 * @see CWM.MiningCore.EntryPoint.EntryPointPackage#getSchema_MiningTask()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<MiningTask> getMiningTask();

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.MiningCore.MiningResult.MiningResult}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' containment reference list.
	 * @see CWM.MiningCore.EntryPoint.EntryPointPackage#getSchema_Result()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<MiningResult> getResult();

	/**
	 * Returns the value of the '<em><b>Aux Objects</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aux Objects</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aux Objects</em>' containment reference.
	 * @see #setAuxObjects(AuxiliaryObject)
	 * @see CWM.MiningCore.EntryPoint.EntryPointPackage#getSchema_AuxObjects()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	AuxiliaryObject getAuxObjects();

	/**
	 * Sets the value of the '{@link CWM.MiningCore.EntryPoint.Schema#getAuxObjects <em>Aux Objects</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aux Objects</em>' containment reference.
	 * @see #getAuxObjects()
	 * @generated
	 */
	void setAuxObjects(AuxiliaryObject value);

} // Schema

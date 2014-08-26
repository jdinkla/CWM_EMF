/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningData;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mining Data container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.MiningCore.MiningData.MiningData_container#getAttributeAssignment <em>Attribute Assignment</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.MiningData_container#getAttributeAssignmentSet <em>Attribute Assignment Set</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.MiningData_container#getAttributeUsage <em>Attribute Usage</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.MiningData_container#getAttributeUsageSet <em>Attribute Usage Set</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.MiningData_container#getCategoricalAttributeProperties <em>Categorical Attribute Properties</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.MiningData_container#getDirectAttributeAssignment <em>Direct Attribute Assignment</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.MiningData_container#getLogicalAttribute <em>Logical Attribute</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.MiningData_container#getLogicalData <em>Logical Data</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.MiningData_container#getMiningAttribute <em>Mining Attribute</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.MiningData_container#getNumericalAttributeProperties <em>Numerical Attribute Properties</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.MiningData_container#getOrdinalAttributeProperties <em>Ordinal Attribute Properties</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.MiningData_container#getPhysicalData <em>Physical Data</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.MiningData_container#getPivotAttributeAssignment <em>Pivot Attribute Assignment</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.MiningData_container#getReversePivotAttributeAssignment <em>Reverse Pivot Attribute Assignment</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.MiningData_container#getSetAttributeAssignment <em>Set Attribute Assignment</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.MiningData_container#getCategory <em>Category</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.MiningData_container#getCategoryMap <em>Category Map</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.MiningData_container#getCategoryMapObject <em>Category Map Object</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.MiningData_container#getCategoryMapObjectEntry <em>Category Map Object Entry</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.MiningData_container#getCategoryMapTable <em>Category Map Table</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.MiningData_container#getCategoryMatrix <em>Category Matrix</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.MiningData_container#getCategoryMatrixEntry <em>Category Matrix Entry</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.MiningData_container#getCategoryMatrixObject <em>Category Matrix Object</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.MiningData_container#getCategoryMatrixTable <em>Category Matrix Table</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.MiningData_container#getCategoryTaxonomy <em>Category Taxonomy</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.MiningCore.MiningData.MiningDataPackage#getMiningData_container()
 * @model
 * @generated
 */
public interface MiningData_container extends EObject {
	/**
	 * Returns the value of the '<em><b>Attribute Assignment</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.MiningCore.MiningData.AttributeAssignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Assignment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Assignment</em>' containment reference list.
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getMiningData_container_AttributeAssignment()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeAssignment> getAttributeAssignment();

	/**
	 * Returns the value of the '<em><b>Attribute Assignment Set</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.MiningCore.MiningData.AttributeAssignmentSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Assignment Set</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Assignment Set</em>' containment reference list.
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getMiningData_container_AttributeAssignmentSet()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeAssignmentSet> getAttributeAssignmentSet();

	/**
	 * Returns the value of the '<em><b>Attribute Usage</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.MiningCore.MiningData.AttributeUsage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Usage</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Usage</em>' containment reference list.
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getMiningData_container_AttributeUsage()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeUsage> getAttributeUsage();

	/**
	 * Returns the value of the '<em><b>Attribute Usage Set</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.MiningCore.MiningData.AttributeUsageSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Usage Set</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Usage Set</em>' containment reference list.
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getMiningData_container_AttributeUsageSet()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeUsageSet> getAttributeUsageSet();

	/**
	 * Returns the value of the '<em><b>Categorical Attribute Properties</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.MiningCore.MiningData.CategoricalAttributeProperties}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorical Attribute Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorical Attribute Properties</em>' containment reference list.
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getMiningData_container_CategoricalAttributeProperties()
	 * @model containment="true"
	 * @generated
	 */
	EList<CategoricalAttributeProperties> getCategoricalAttributeProperties();

	/**
	 * Returns the value of the '<em><b>Direct Attribute Assignment</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.MiningCore.MiningData.DirectAttributeAssignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direct Attribute Assignment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direct Attribute Assignment</em>' containment reference list.
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getMiningData_container_DirectAttributeAssignment()
	 * @model containment="true"
	 * @generated
	 */
	EList<DirectAttributeAssignment> getDirectAttributeAssignment();

	/**
	 * Returns the value of the '<em><b>Logical Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.MiningCore.MiningData.LogicalAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logical Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical Attribute</em>' containment reference list.
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getMiningData_container_LogicalAttribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<LogicalAttribute> getLogicalAttribute();

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
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getMiningData_container_LogicalData()
	 * @model containment="true"
	 * @generated
	 */
	EList<LogicalData> getLogicalData();

	/**
	 * Returns the value of the '<em><b>Mining Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.MiningCore.MiningData.MiningAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mining Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mining Attribute</em>' containment reference list.
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getMiningData_container_MiningAttribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<MiningAttribute> getMiningAttribute();

	/**
	 * Returns the value of the '<em><b>Numerical Attribute Properties</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.MiningCore.MiningData.NumericalAttributeProperties}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numerical Attribute Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numerical Attribute Properties</em>' containment reference list.
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getMiningData_container_NumericalAttributeProperties()
	 * @model containment="true"
	 * @generated
	 */
	EList<NumericalAttributeProperties> getNumericalAttributeProperties();

	/**
	 * Returns the value of the '<em><b>Ordinal Attribute Properties</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.MiningCore.MiningData.OrdinalAttributeProperties}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ordinal Attribute Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ordinal Attribute Properties</em>' containment reference list.
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getMiningData_container_OrdinalAttributeProperties()
	 * @model containment="true"
	 * @generated
	 */
	EList<OrdinalAttributeProperties> getOrdinalAttributeProperties();

	/**
	 * Returns the value of the '<em><b>Physical Data</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.MiningCore.MiningData.PhysicalData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Physical Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physical Data</em>' containment reference list.
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getMiningData_container_PhysicalData()
	 * @model containment="true"
	 * @generated
	 */
	EList<PhysicalData> getPhysicalData();

	/**
	 * Returns the value of the '<em><b>Pivot Attribute Assignment</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.MiningCore.MiningData.PivotAttributeAssignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pivot Attribute Assignment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pivot Attribute Assignment</em>' containment reference list.
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getMiningData_container_PivotAttributeAssignment()
	 * @model containment="true"
	 * @generated
	 */
	EList<PivotAttributeAssignment> getPivotAttributeAssignment();

	/**
	 * Returns the value of the '<em><b>Reverse Pivot Attribute Assignment</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.MiningCore.MiningData.ReversePivotAttributeAssignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reverse Pivot Attribute Assignment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reverse Pivot Attribute Assignment</em>' containment reference list.
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getMiningData_container_ReversePivotAttributeAssignment()
	 * @model containment="true"
	 * @generated
	 */
	EList<ReversePivotAttributeAssignment> getReversePivotAttributeAssignment();

	/**
	 * Returns the value of the '<em><b>Set Attribute Assignment</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.MiningCore.MiningData.SetAttributeAssignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Attribute Assignment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Attribute Assignment</em>' containment reference list.
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getMiningData_container_SetAttributeAssignment()
	 * @model containment="true"
	 * @generated
	 */
	EList<SetAttributeAssignment> getSetAttributeAssignment();

	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.MiningCore.MiningData.Category}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' containment reference list.
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getMiningData_container_Category()
	 * @model containment="true"
	 * @generated
	 */
	EList<Category> getCategory();

	/**
	 * Returns the value of the '<em><b>Category Map</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.MiningCore.MiningData.CategoryMap}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category Map</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category Map</em>' containment reference list.
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getMiningData_container_CategoryMap()
	 * @model containment="true"
	 * @generated
	 */
	EList<CategoryMap> getCategoryMap();

	/**
	 * Returns the value of the '<em><b>Category Map Object</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.MiningCore.MiningData.CategoryMapObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category Map Object</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category Map Object</em>' containment reference list.
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getMiningData_container_CategoryMapObject()
	 * @model containment="true"
	 * @generated
	 */
	EList<CategoryMapObject> getCategoryMapObject();

	/**
	 * Returns the value of the '<em><b>Category Map Object Entry</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.MiningCore.MiningData.CategoryMapObjectEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category Map Object Entry</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category Map Object Entry</em>' containment reference list.
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getMiningData_container_CategoryMapObjectEntry()
	 * @model containment="true"
	 * @generated
	 */
	EList<CategoryMapObjectEntry> getCategoryMapObjectEntry();

	/**
	 * Returns the value of the '<em><b>Category Map Table</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.MiningCore.MiningData.CategoryMapTable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category Map Table</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category Map Table</em>' containment reference list.
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getMiningData_container_CategoryMapTable()
	 * @model containment="true"
	 * @generated
	 */
	EList<CategoryMapTable> getCategoryMapTable();

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
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getMiningData_container_CategoryMatrix()
	 * @model containment="true"
	 * @generated
	 */
	EList<CategoryMatrix> getCategoryMatrix();

	/**
	 * Returns the value of the '<em><b>Category Matrix Entry</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.MiningCore.MiningData.CategoryMatrixEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category Matrix Entry</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category Matrix Entry</em>' containment reference list.
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getMiningData_container_CategoryMatrixEntry()
	 * @model containment="true"
	 * @generated
	 */
	EList<CategoryMatrixEntry> getCategoryMatrixEntry();

	/**
	 * Returns the value of the '<em><b>Category Matrix Object</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.MiningCore.MiningData.CategoryMatrixObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category Matrix Object</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category Matrix Object</em>' containment reference list.
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getMiningData_container_CategoryMatrixObject()
	 * @model containment="true"
	 * @generated
	 */
	EList<CategoryMatrixObject> getCategoryMatrixObject();

	/**
	 * Returns the value of the '<em><b>Category Matrix Table</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.MiningCore.MiningData.CategoryMatrixTable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category Matrix Table</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category Matrix Table</em>' containment reference list.
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getMiningData_container_CategoryMatrixTable()
	 * @model containment="true"
	 * @generated
	 */
	EList<CategoryMatrixTable> getCategoryMatrixTable();

	/**
	 * Returns the value of the '<em><b>Category Taxonomy</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.MiningCore.MiningData.CategoryTaxonomy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category Taxonomy</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category Taxonomy</em>' containment reference list.
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getMiningData_container_CategoryTaxonomy()
	 * @model containment="true"
	 * @generated
	 */
	EList<CategoryTaxonomy> getCategoryTaxonomy();

} // MiningData_container

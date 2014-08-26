/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningData;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see CWM.MiningCore.MiningData.MiningDataPackage
 * @generated
 */
public interface MiningDataFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MiningDataFactory eINSTANCE = CWM.MiningCore.MiningData.impl.MiningDataFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Attribute Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Assignment</em>'.
	 * @generated
	 */
	AttributeAssignment createAttributeAssignment();

	/**
	 * Returns a new object of class '<em>Attribute Assignment Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Assignment Set</em>'.
	 * @generated
	 */
	AttributeAssignmentSet createAttributeAssignmentSet();

	/**
	 * Returns a new object of class '<em>Attribute Usage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Usage</em>'.
	 * @generated
	 */
	AttributeUsage createAttributeUsage();

	/**
	 * Returns a new object of class '<em>Attribute Usage Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Usage Set</em>'.
	 * @generated
	 */
	AttributeUsageSet createAttributeUsageSet();

	/**
	 * Returns a new object of class '<em>Categorical Attribute Properties</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Categorical Attribute Properties</em>'.
	 * @generated
	 */
	CategoricalAttributeProperties createCategoricalAttributeProperties();

	/**
	 * Returns a new object of class '<em>Direct Attribute Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Direct Attribute Assignment</em>'.
	 * @generated
	 */
	DirectAttributeAssignment createDirectAttributeAssignment();

	/**
	 * Returns a new object of class '<em>Logical Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logical Attribute</em>'.
	 * @generated
	 */
	LogicalAttribute createLogicalAttribute();

	/**
	 * Returns a new object of class '<em>Logical Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logical Data</em>'.
	 * @generated
	 */
	LogicalData createLogicalData();

	/**
	 * Returns a new object of class '<em>Numerical Attribute Properties</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Numerical Attribute Properties</em>'.
	 * @generated
	 */
	NumericalAttributeProperties createNumericalAttributeProperties();

	/**
	 * Returns a new object of class '<em>Ordinal Attribute Properties</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ordinal Attribute Properties</em>'.
	 * @generated
	 */
	OrdinalAttributeProperties createOrdinalAttributeProperties();

	/**
	 * Returns a new object of class '<em>Physical Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Data</em>'.
	 * @generated
	 */
	PhysicalData createPhysicalData();

	/**
	 * Returns a new object of class '<em>Pivot Attribute Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pivot Attribute Assignment</em>'.
	 * @generated
	 */
	PivotAttributeAssignment createPivotAttributeAssignment();

	/**
	 * Returns a new object of class '<em>Reverse Pivot Attribute Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reverse Pivot Attribute Assignment</em>'.
	 * @generated
	 */
	ReversePivotAttributeAssignment createReversePivotAttributeAssignment();

	/**
	 * Returns a new object of class '<em>Set Attribute Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Attribute Assignment</em>'.
	 * @generated
	 */
	SetAttributeAssignment createSetAttributeAssignment();

	/**
	 * Returns a new object of class '<em>Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Category</em>'.
	 * @generated
	 */
	Category createCategory();

	/**
	 * Returns a new object of class '<em>Category Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Category Map</em>'.
	 * @generated
	 */
	CategoryMap createCategoryMap();

	/**
	 * Returns a new object of class '<em>Category Map Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Category Map Object</em>'.
	 * @generated
	 */
	CategoryMapObject createCategoryMapObject();

	/**
	 * Returns a new object of class '<em>Category Map Object Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Category Map Object Entry</em>'.
	 * @generated
	 */
	CategoryMapObjectEntry createCategoryMapObjectEntry();

	/**
	 * Returns a new object of class '<em>Category Map Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Category Map Table</em>'.
	 * @generated
	 */
	CategoryMapTable createCategoryMapTable();

	/**
	 * Returns a new object of class '<em>Category Matrix</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Category Matrix</em>'.
	 * @generated
	 */
	CategoryMatrix createCategoryMatrix();

	/**
	 * Returns a new object of class '<em>Category Matrix Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Category Matrix Entry</em>'.
	 * @generated
	 */
	CategoryMatrixEntry createCategoryMatrixEntry();

	/**
	 * Returns a new object of class '<em>Category Matrix Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Category Matrix Object</em>'.
	 * @generated
	 */
	CategoryMatrixObject createCategoryMatrixObject();

	/**
	 * Returns a new object of class '<em>Category Matrix Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Category Matrix Table</em>'.
	 * @generated
	 */
	CategoryMatrixTable createCategoryMatrixTable();

	/**
	 * Returns a new object of class '<em>Category Taxonomy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Category Taxonomy</em>'.
	 * @generated
	 */
	CategoryTaxonomy createCategoryTaxonomy();

	/**
	 * Returns a new object of class '<em>Mining Data container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mining Data container</em>'.
	 * @generated
	 */
	MiningData_container createMiningData_container();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MiningDataPackage getMiningDataPackage();

} //MiningDataFactory

/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningData.impl;

import CWM.MiningCore.MiningData.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MiningDataFactoryImpl extends EFactoryImpl implements MiningDataFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MiningDataFactory init() {
		try {
			MiningDataFactory theMiningDataFactory = (MiningDataFactory)EPackage.Registry.INSTANCE.getEFactory("MiningData"); 
			if (theMiningDataFactory != null) {
				return theMiningDataFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MiningDataFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiningDataFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MiningDataPackage.ATTRIBUTE_ASSIGNMENT: return createAttributeAssignment();
			case MiningDataPackage.ATTRIBUTE_ASSIGNMENT_SET: return createAttributeAssignmentSet();
			case MiningDataPackage.ATTRIBUTE_USAGE: return createAttributeUsage();
			case MiningDataPackage.ATTRIBUTE_USAGE_SET: return createAttributeUsageSet();
			case MiningDataPackage.CATEGORICAL_ATTRIBUTE_PROPERTIES: return createCategoricalAttributeProperties();
			case MiningDataPackage.DIRECT_ATTRIBUTE_ASSIGNMENT: return createDirectAttributeAssignment();
			case MiningDataPackage.LOGICAL_ATTRIBUTE: return createLogicalAttribute();
			case MiningDataPackage.LOGICAL_DATA: return createLogicalData();
			case MiningDataPackage.NUMERICAL_ATTRIBUTE_PROPERTIES: return createNumericalAttributeProperties();
			case MiningDataPackage.ORDINAL_ATTRIBUTE_PROPERTIES: return createOrdinalAttributeProperties();
			case MiningDataPackage.PHYSICAL_DATA: return createPhysicalData();
			case MiningDataPackage.PIVOT_ATTRIBUTE_ASSIGNMENT: return createPivotAttributeAssignment();
			case MiningDataPackage.REVERSE_PIVOT_ATTRIBUTE_ASSIGNMENT: return createReversePivotAttributeAssignment();
			case MiningDataPackage.SET_ATTRIBUTE_ASSIGNMENT: return createSetAttributeAssignment();
			case MiningDataPackage.CATEGORY: return createCategory();
			case MiningDataPackage.CATEGORY_MAP: return createCategoryMap();
			case MiningDataPackage.CATEGORY_MAP_OBJECT: return createCategoryMapObject();
			case MiningDataPackage.CATEGORY_MAP_OBJECT_ENTRY: return createCategoryMapObjectEntry();
			case MiningDataPackage.CATEGORY_MAP_TABLE: return createCategoryMapTable();
			case MiningDataPackage.CATEGORY_MATRIX: return createCategoryMatrix();
			case MiningDataPackage.CATEGORY_MATRIX_ENTRY: return createCategoryMatrixEntry();
			case MiningDataPackage.CATEGORY_MATRIX_OBJECT: return createCategoryMatrixObject();
			case MiningDataPackage.CATEGORY_MATRIX_TABLE: return createCategoryMatrixTable();
			case MiningDataPackage.CATEGORY_TAXONOMY: return createCategoryTaxonomy();
			case MiningDataPackage.MINING_DATA_CONTAINER: return createMiningData_container();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case MiningDataPackage.ATTRIBUTE_SELECTION_FUNCTION:
				return createAttributeSelectionFunctionFromString(eDataType, initialValue);
			case MiningDataPackage.ATTRIBUTE_TYPE:
				return createAttributeTypeFromString(eDataType, initialValue);
			case MiningDataPackage.ORDER_TYPE:
				return createOrderTypeFromString(eDataType, initialValue);
			case MiningDataPackage.USAGE_OPTION:
				return createUsageOptionFromString(eDataType, initialValue);
			case MiningDataPackage.VALUE_SELECTION_FUNCTION:
				return createValueSelectionFunctionFromString(eDataType, initialValue);
			case MiningDataPackage.CATEGORY_PROPERTY:
				return createCategoryPropertyFromString(eDataType, initialValue);
			case MiningDataPackage.MATRIX_PROPERTY:
				return createMatrixPropertyFromString(eDataType, initialValue);
			case MiningDataPackage.DOUBLE:
				return createDoubleFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case MiningDataPackage.ATTRIBUTE_SELECTION_FUNCTION:
				return convertAttributeSelectionFunctionToString(eDataType, instanceValue);
			case MiningDataPackage.ATTRIBUTE_TYPE:
				return convertAttributeTypeToString(eDataType, instanceValue);
			case MiningDataPackage.ORDER_TYPE:
				return convertOrderTypeToString(eDataType, instanceValue);
			case MiningDataPackage.USAGE_OPTION:
				return convertUsageOptionToString(eDataType, instanceValue);
			case MiningDataPackage.VALUE_SELECTION_FUNCTION:
				return convertValueSelectionFunctionToString(eDataType, instanceValue);
			case MiningDataPackage.CATEGORY_PROPERTY:
				return convertCategoryPropertyToString(eDataType, instanceValue);
			case MiningDataPackage.MATRIX_PROPERTY:
				return convertMatrixPropertyToString(eDataType, instanceValue);
			case MiningDataPackage.DOUBLE:
				return convertDoubleToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeAssignment createAttributeAssignment() {
		AttributeAssignmentImpl attributeAssignment = new AttributeAssignmentImpl();
		return attributeAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeAssignmentSet createAttributeAssignmentSet() {
		AttributeAssignmentSetImpl attributeAssignmentSet = new AttributeAssignmentSetImpl();
		return attributeAssignmentSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeUsage createAttributeUsage() {
		AttributeUsageImpl attributeUsage = new AttributeUsageImpl();
		return attributeUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeUsageSet createAttributeUsageSet() {
		AttributeUsageSetImpl attributeUsageSet = new AttributeUsageSetImpl();
		return attributeUsageSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategoricalAttributeProperties createCategoricalAttributeProperties() {
		CategoricalAttributePropertiesImpl categoricalAttributeProperties = new CategoricalAttributePropertiesImpl();
		return categoricalAttributeProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectAttributeAssignment createDirectAttributeAssignment() {
		DirectAttributeAssignmentImpl directAttributeAssignment = new DirectAttributeAssignmentImpl();
		return directAttributeAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalAttribute createLogicalAttribute() {
		LogicalAttributeImpl logicalAttribute = new LogicalAttributeImpl();
		return logicalAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalData createLogicalData() {
		LogicalDataImpl logicalData = new LogicalDataImpl();
		return logicalData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericalAttributeProperties createNumericalAttributeProperties() {
		NumericalAttributePropertiesImpl numericalAttributeProperties = new NumericalAttributePropertiesImpl();
		return numericalAttributeProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrdinalAttributeProperties createOrdinalAttributeProperties() {
		OrdinalAttributePropertiesImpl ordinalAttributeProperties = new OrdinalAttributePropertiesImpl();
		return ordinalAttributeProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalData createPhysicalData() {
		PhysicalDataImpl physicalData = new PhysicalDataImpl();
		return physicalData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PivotAttributeAssignment createPivotAttributeAssignment() {
		PivotAttributeAssignmentImpl pivotAttributeAssignment = new PivotAttributeAssignmentImpl();
		return pivotAttributeAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReversePivotAttributeAssignment createReversePivotAttributeAssignment() {
		ReversePivotAttributeAssignmentImpl reversePivotAttributeAssignment = new ReversePivotAttributeAssignmentImpl();
		return reversePivotAttributeAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetAttributeAssignment createSetAttributeAssignment() {
		SetAttributeAssignmentImpl setAttributeAssignment = new SetAttributeAssignmentImpl();
		return setAttributeAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category createCategory() {
		CategoryImpl category = new CategoryImpl();
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategoryMap createCategoryMap() {
		CategoryMapImpl categoryMap = new CategoryMapImpl();
		return categoryMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategoryMapObject createCategoryMapObject() {
		CategoryMapObjectImpl categoryMapObject = new CategoryMapObjectImpl();
		return categoryMapObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategoryMapObjectEntry createCategoryMapObjectEntry() {
		CategoryMapObjectEntryImpl categoryMapObjectEntry = new CategoryMapObjectEntryImpl();
		return categoryMapObjectEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategoryMapTable createCategoryMapTable() {
		CategoryMapTableImpl categoryMapTable = new CategoryMapTableImpl();
		return categoryMapTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategoryMatrix createCategoryMatrix() {
		CategoryMatrixImpl categoryMatrix = new CategoryMatrixImpl();
		return categoryMatrix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategoryMatrixEntry createCategoryMatrixEntry() {
		CategoryMatrixEntryImpl categoryMatrixEntry = new CategoryMatrixEntryImpl();
		return categoryMatrixEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategoryMatrixObject createCategoryMatrixObject() {
		CategoryMatrixObjectImpl categoryMatrixObject = new CategoryMatrixObjectImpl();
		return categoryMatrixObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategoryMatrixTable createCategoryMatrixTable() {
		CategoryMatrixTableImpl categoryMatrixTable = new CategoryMatrixTableImpl();
		return categoryMatrixTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategoryTaxonomy createCategoryTaxonomy() {
		CategoryTaxonomyImpl categoryTaxonomy = new CategoryTaxonomyImpl();
		return categoryTaxonomy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiningData_container createMiningData_container() {
		MiningData_containerImpl miningData_container = new MiningData_containerImpl();
		return miningData_container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeSelectionFunction createAttributeSelectionFunctionFromString(EDataType eDataType, String initialValue) {
		AttributeSelectionFunction result = AttributeSelectionFunction.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAttributeSelectionFunctionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeType createAttributeTypeFromString(EDataType eDataType, String initialValue) {
		AttributeType result = AttributeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAttributeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderType createOrderTypeFromString(EDataType eDataType, String initialValue) {
		OrderType result = OrderType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrderTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageOption createUsageOptionFromString(EDataType eDataType, String initialValue) {
		UsageOption result = UsageOption.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUsageOptionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSelectionFunction createValueSelectionFunctionFromString(EDataType eDataType, String initialValue) {
		ValueSelectionFunction result = ValueSelectionFunction.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValueSelectionFunctionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategoryProperty createCategoryPropertyFromString(EDataType eDataType, String initialValue) {
		CategoryProperty result = CategoryProperty.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCategoryPropertyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatrixProperty createMatrixPropertyFromString(EDataType eDataType, String initialValue) {
		MatrixProperty result = MatrixProperty.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMatrixPropertyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createDoubleFromString(EDataType eDataType, String initialValue) {
		return (Double)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDoubleToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiningDataPackage getMiningDataPackage() {
		return (MiningDataPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MiningDataPackage getPackage() {
		return MiningDataPackage.eINSTANCE;
	}

} //MiningDataFactoryImpl

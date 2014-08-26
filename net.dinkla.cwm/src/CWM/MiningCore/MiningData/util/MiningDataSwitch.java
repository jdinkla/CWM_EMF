/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningData.util;

import CWM.Core.Attribute;
import CWM.Core.Classifier;
import CWM.Core.Element;
import CWM.Core.Feature;
import CWM.Core.ModelElement;
import CWM.Core.Namespace;
import CWM.Core.StructuralFeature;

import CWM.MiningCore.MiningData.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see CWM.MiningCore.MiningData.MiningDataPackage
 * @generated
 */
public class MiningDataSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MiningDataPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiningDataSwitch() {
		if (modelPackage == null) {
			modelPackage = MiningDataPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MiningDataPackage.ATTRIBUTE_ASSIGNMENT: {
				AttributeAssignment attributeAssignment = (AttributeAssignment)theEObject;
				T result = caseAttributeAssignment(attributeAssignment);
				if (result == null) result = caseModelElement(attributeAssignment);
				if (result == null) result = caseElement(attributeAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MiningDataPackage.ATTRIBUTE_ASSIGNMENT_SET: {
				AttributeAssignmentSet attributeAssignmentSet = (AttributeAssignmentSet)theEObject;
				T result = caseAttributeAssignmentSet(attributeAssignmentSet);
				if (result == null) result = caseModelElement(attributeAssignmentSet);
				if (result == null) result = caseElement(attributeAssignmentSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MiningDataPackage.ATTRIBUTE_USAGE: {
				AttributeUsage attributeUsage = (AttributeUsage)theEObject;
				T result = caseAttributeUsage(attributeUsage);
				if (result == null) result = caseFeature(attributeUsage);
				if (result == null) result = caseModelElement(attributeUsage);
				if (result == null) result = caseElement(attributeUsage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MiningDataPackage.ATTRIBUTE_USAGE_SET: {
				AttributeUsageSet attributeUsageSet = (AttributeUsageSet)theEObject;
				T result = caseAttributeUsageSet(attributeUsageSet);
				if (result == null) result = caseClass(attributeUsageSet);
				if (result == null) result = caseClassifier(attributeUsageSet);
				if (result == null) result = caseNamespace(attributeUsageSet);
				if (result == null) result = caseModelElement(attributeUsageSet);
				if (result == null) result = caseElement(attributeUsageSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MiningDataPackage.CATEGORICAL_ATTRIBUTE_PROPERTIES: {
				CategoricalAttributeProperties categoricalAttributeProperties = (CategoricalAttributeProperties)theEObject;
				T result = caseCategoricalAttributeProperties(categoricalAttributeProperties);
				if (result == null) result = caseModelElement(categoricalAttributeProperties);
				if (result == null) result = caseElement(categoricalAttributeProperties);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MiningDataPackage.DIRECT_ATTRIBUTE_ASSIGNMENT: {
				DirectAttributeAssignment directAttributeAssignment = (DirectAttributeAssignment)theEObject;
				T result = caseDirectAttributeAssignment(directAttributeAssignment);
				if (result == null) result = caseAttributeAssignment(directAttributeAssignment);
				if (result == null) result = caseModelElement(directAttributeAssignment);
				if (result == null) result = caseElement(directAttributeAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MiningDataPackage.LOGICAL_ATTRIBUTE: {
				LogicalAttribute logicalAttribute = (LogicalAttribute)theEObject;
				T result = caseLogicalAttribute(logicalAttribute);
				if (result == null) result = caseMiningAttribute(logicalAttribute);
				if (result == null) result = caseAttribute(logicalAttribute);
				if (result == null) result = caseStructuralFeature(logicalAttribute);
				if (result == null) result = caseFeature(logicalAttribute);
				if (result == null) result = caseModelElement(logicalAttribute);
				if (result == null) result = caseElement(logicalAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MiningDataPackage.LOGICAL_DATA: {
				LogicalData logicalData = (LogicalData)theEObject;
				T result = caseLogicalData(logicalData);
				if (result == null) result = caseClass(logicalData);
				if (result == null) result = caseClassifier(logicalData);
				if (result == null) result = caseNamespace(logicalData);
				if (result == null) result = caseModelElement(logicalData);
				if (result == null) result = caseElement(logicalData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MiningDataPackage.MINING_ATTRIBUTE: {
				MiningAttribute miningAttribute = (MiningAttribute)theEObject;
				T result = caseMiningAttribute(miningAttribute);
				if (result == null) result = caseAttribute(miningAttribute);
				if (result == null) result = caseStructuralFeature(miningAttribute);
				if (result == null) result = caseFeature(miningAttribute);
				if (result == null) result = caseModelElement(miningAttribute);
				if (result == null) result = caseElement(miningAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MiningDataPackage.NUMERICAL_ATTRIBUTE_PROPERTIES: {
				NumericalAttributeProperties numericalAttributeProperties = (NumericalAttributeProperties)theEObject;
				T result = caseNumericalAttributeProperties(numericalAttributeProperties);
				if (result == null) result = caseModelElement(numericalAttributeProperties);
				if (result == null) result = caseElement(numericalAttributeProperties);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MiningDataPackage.ORDINAL_ATTRIBUTE_PROPERTIES: {
				OrdinalAttributeProperties ordinalAttributeProperties = (OrdinalAttributeProperties)theEObject;
				T result = caseOrdinalAttributeProperties(ordinalAttributeProperties);
				if (result == null) result = caseCategoricalAttributeProperties(ordinalAttributeProperties);
				if (result == null) result = caseModelElement(ordinalAttributeProperties);
				if (result == null) result = caseElement(ordinalAttributeProperties);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MiningDataPackage.PHYSICAL_DATA: {
				PhysicalData physicalData = (PhysicalData)theEObject;
				T result = casePhysicalData(physicalData);
				if (result == null) result = caseModelElement(physicalData);
				if (result == null) result = caseElement(physicalData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MiningDataPackage.PIVOT_ATTRIBUTE_ASSIGNMENT: {
				PivotAttributeAssignment pivotAttributeAssignment = (PivotAttributeAssignment)theEObject;
				T result = casePivotAttributeAssignment(pivotAttributeAssignment);
				if (result == null) result = caseAttributeAssignment(pivotAttributeAssignment);
				if (result == null) result = caseModelElement(pivotAttributeAssignment);
				if (result == null) result = caseElement(pivotAttributeAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MiningDataPackage.REVERSE_PIVOT_ATTRIBUTE_ASSIGNMENT: {
				ReversePivotAttributeAssignment reversePivotAttributeAssignment = (ReversePivotAttributeAssignment)theEObject;
				T result = caseReversePivotAttributeAssignment(reversePivotAttributeAssignment);
				if (result == null) result = caseAttributeAssignment(reversePivotAttributeAssignment);
				if (result == null) result = caseModelElement(reversePivotAttributeAssignment);
				if (result == null) result = caseElement(reversePivotAttributeAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MiningDataPackage.SET_ATTRIBUTE_ASSIGNMENT: {
				SetAttributeAssignment setAttributeAssignment = (SetAttributeAssignment)theEObject;
				T result = caseSetAttributeAssignment(setAttributeAssignment);
				if (result == null) result = caseAttributeAssignment(setAttributeAssignment);
				if (result == null) result = caseModelElement(setAttributeAssignment);
				if (result == null) result = caseElement(setAttributeAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MiningDataPackage.CATEGORY: {
				Category category = (Category)theEObject;
				T result = caseCategory(category);
				if (result == null) result = caseModelElement(category);
				if (result == null) result = caseElement(category);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MiningDataPackage.CATEGORY_MAP: {
				CategoryMap categoryMap = (CategoryMap)theEObject;
				T result = caseCategoryMap(categoryMap);
				if (result == null) result = caseModelElement(categoryMap);
				if (result == null) result = caseElement(categoryMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MiningDataPackage.CATEGORY_MAP_OBJECT: {
				CategoryMapObject categoryMapObject = (CategoryMapObject)theEObject;
				T result = caseCategoryMapObject(categoryMapObject);
				if (result == null) result = caseModelElement(categoryMapObject);
				if (result == null) result = caseCategoryMap(categoryMapObject);
				if (result == null) result = caseElement(categoryMapObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MiningDataPackage.CATEGORY_MAP_OBJECT_ENTRY: {
				CategoryMapObjectEntry categoryMapObjectEntry = (CategoryMapObjectEntry)theEObject;
				T result = caseCategoryMapObjectEntry(categoryMapObjectEntry);
				if (result == null) result = caseModelElement(categoryMapObjectEntry);
				if (result == null) result = caseElement(categoryMapObjectEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MiningDataPackage.CATEGORY_MAP_TABLE: {
				CategoryMapTable categoryMapTable = (CategoryMapTable)theEObject;
				T result = caseCategoryMapTable(categoryMapTable);
				if (result == null) result = caseModelElement(categoryMapTable);
				if (result == null) result = caseCategoryMap(categoryMapTable);
				if (result == null) result = caseElement(categoryMapTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MiningDataPackage.CATEGORY_MATRIX: {
				CategoryMatrix categoryMatrix = (CategoryMatrix)theEObject;
				T result = caseCategoryMatrix(categoryMatrix);
				if (result == null) result = caseModelElement(categoryMatrix);
				if (result == null) result = caseElement(categoryMatrix);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MiningDataPackage.CATEGORY_MATRIX_ENTRY: {
				CategoryMatrixEntry categoryMatrixEntry = (CategoryMatrixEntry)theEObject;
				T result = caseCategoryMatrixEntry(categoryMatrixEntry);
				if (result == null) result = caseModelElement(categoryMatrixEntry);
				if (result == null) result = caseElement(categoryMatrixEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MiningDataPackage.CATEGORY_MATRIX_OBJECT: {
				CategoryMatrixObject categoryMatrixObject = (CategoryMatrixObject)theEObject;
				T result = caseCategoryMatrixObject(categoryMatrixObject);
				if (result == null) result = caseCategoryMatrix(categoryMatrixObject);
				if (result == null) result = caseModelElement(categoryMatrixObject);
				if (result == null) result = caseElement(categoryMatrixObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MiningDataPackage.CATEGORY_MATRIX_TABLE: {
				CategoryMatrixTable categoryMatrixTable = (CategoryMatrixTable)theEObject;
				T result = caseCategoryMatrixTable(categoryMatrixTable);
				if (result == null) result = caseCategoryMatrix(categoryMatrixTable);
				if (result == null) result = caseModelElement(categoryMatrixTable);
				if (result == null) result = caseElement(categoryMatrixTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MiningDataPackage.CATEGORY_TAXONOMY: {
				CategoryTaxonomy categoryTaxonomy = (CategoryTaxonomy)theEObject;
				T result = caseCategoryTaxonomy(categoryTaxonomy);
				if (result == null) result = caseModelElement(categoryTaxonomy);
				if (result == null) result = caseElement(categoryTaxonomy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MiningDataPackage.MINING_DATA_CONTAINER: {
				MiningData_container miningData_container = (MiningData_container)theEObject;
				T result = caseMiningData_container(miningData_container);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeAssignment(AttributeAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Assignment Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Assignment Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeAssignmentSet(AttributeAssignmentSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Usage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Usage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeUsage(AttributeUsage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Usage Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Usage Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeUsageSet(AttributeUsageSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Categorical Attribute Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Categorical Attribute Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCategoricalAttributeProperties(CategoricalAttributeProperties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Direct Attribute Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Direct Attribute Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectAttributeAssignment(DirectAttributeAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicalAttribute(LogicalAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicalData(LogicalData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mining Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mining Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMiningAttribute(MiningAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numerical Attribute Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numerical Attribute Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumericalAttributeProperties(NumericalAttributeProperties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ordinal Attribute Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ordinal Attribute Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrdinalAttributeProperties(OrdinalAttributeProperties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicalData(PhysicalData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pivot Attribute Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pivot Attribute Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePivotAttributeAssignment(PivotAttributeAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reverse Pivot Attribute Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reverse Pivot Attribute Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReversePivotAttributeAssignment(ReversePivotAttributeAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Attribute Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Attribute Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetAttributeAssignment(SetAttributeAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCategory(Category object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Category Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Category Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCategoryMap(CategoryMap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Category Map Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Category Map Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCategoryMapObject(CategoryMapObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Category Map Object Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Category Map Object Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCategoryMapObjectEntry(CategoryMapObjectEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Category Map Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Category Map Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCategoryMapTable(CategoryMapTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Category Matrix</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Category Matrix</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCategoryMatrix(CategoryMatrix object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Category Matrix Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Category Matrix Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCategoryMatrixEntry(CategoryMatrixEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Category Matrix Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Category Matrix Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCategoryMatrixObject(CategoryMatrixObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Category Matrix Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Category Matrix Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCategoryMatrixTable(CategoryMatrixTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Category Taxonomy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Category Taxonomy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCategoryTaxonomy(CategoryTaxonomy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mining Data container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mining Data container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMiningData_container(MiningData_container object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeature(Feature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Namespace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamespace(Namespace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassifier(Classifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClass(CWM.Core.Class object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structural Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structural Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuralFeature(StructuralFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //MiningDataSwitch

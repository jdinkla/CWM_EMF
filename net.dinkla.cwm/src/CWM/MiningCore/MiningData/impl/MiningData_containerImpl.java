/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningData.impl;

import CWM.MiningCore.MiningData.AttributeAssignment;
import CWM.MiningCore.MiningData.AttributeAssignmentSet;
import CWM.MiningCore.MiningData.AttributeUsage;
import CWM.MiningCore.MiningData.AttributeUsageSet;
import CWM.MiningCore.MiningData.CategoricalAttributeProperties;
import CWM.MiningCore.MiningData.Category;
import CWM.MiningCore.MiningData.CategoryMap;
import CWM.MiningCore.MiningData.CategoryMapObject;
import CWM.MiningCore.MiningData.CategoryMapObjectEntry;
import CWM.MiningCore.MiningData.CategoryMapTable;
import CWM.MiningCore.MiningData.CategoryMatrix;
import CWM.MiningCore.MiningData.CategoryMatrixEntry;
import CWM.MiningCore.MiningData.CategoryMatrixObject;
import CWM.MiningCore.MiningData.CategoryMatrixTable;
import CWM.MiningCore.MiningData.CategoryTaxonomy;
import CWM.MiningCore.MiningData.DirectAttributeAssignment;
import CWM.MiningCore.MiningData.LogicalAttribute;
import CWM.MiningCore.MiningData.LogicalData;
import CWM.MiningCore.MiningData.MiningAttribute;
import CWM.MiningCore.MiningData.MiningDataPackage;
import CWM.MiningCore.MiningData.MiningData_container;
import CWM.MiningCore.MiningData.NumericalAttributeProperties;
import CWM.MiningCore.MiningData.OrdinalAttributeProperties;
import CWM.MiningCore.MiningData.PhysicalData;
import CWM.MiningCore.MiningData.PivotAttributeAssignment;
import CWM.MiningCore.MiningData.ReversePivotAttributeAssignment;
import CWM.MiningCore.MiningData.SetAttributeAssignment;

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
 * An implementation of the model object '<em><b>Mining Data container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.MiningCore.MiningData.impl.MiningData_containerImpl#getAttributeAssignment <em>Attribute Assignment</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.impl.MiningData_containerImpl#getAttributeAssignmentSet <em>Attribute Assignment Set</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.impl.MiningData_containerImpl#getAttributeUsage <em>Attribute Usage</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.impl.MiningData_containerImpl#getAttributeUsageSet <em>Attribute Usage Set</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.impl.MiningData_containerImpl#getCategoricalAttributeProperties <em>Categorical Attribute Properties</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.impl.MiningData_containerImpl#getDirectAttributeAssignment <em>Direct Attribute Assignment</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.impl.MiningData_containerImpl#getLogicalAttribute <em>Logical Attribute</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.impl.MiningData_containerImpl#getLogicalData <em>Logical Data</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.impl.MiningData_containerImpl#getMiningAttribute <em>Mining Attribute</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.impl.MiningData_containerImpl#getNumericalAttributeProperties <em>Numerical Attribute Properties</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.impl.MiningData_containerImpl#getOrdinalAttributeProperties <em>Ordinal Attribute Properties</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.impl.MiningData_containerImpl#getPhysicalData <em>Physical Data</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.impl.MiningData_containerImpl#getPivotAttributeAssignment <em>Pivot Attribute Assignment</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.impl.MiningData_containerImpl#getReversePivotAttributeAssignment <em>Reverse Pivot Attribute Assignment</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.impl.MiningData_containerImpl#getSetAttributeAssignment <em>Set Attribute Assignment</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.impl.MiningData_containerImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.impl.MiningData_containerImpl#getCategoryMap <em>Category Map</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.impl.MiningData_containerImpl#getCategoryMapObject <em>Category Map Object</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.impl.MiningData_containerImpl#getCategoryMapObjectEntry <em>Category Map Object Entry</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.impl.MiningData_containerImpl#getCategoryMapTable <em>Category Map Table</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.impl.MiningData_containerImpl#getCategoryMatrix <em>Category Matrix</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.impl.MiningData_containerImpl#getCategoryMatrixEntry <em>Category Matrix Entry</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.impl.MiningData_containerImpl#getCategoryMatrixObject <em>Category Matrix Object</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.impl.MiningData_containerImpl#getCategoryMatrixTable <em>Category Matrix Table</em>}</li>
 *   <li>{@link CWM.MiningCore.MiningData.impl.MiningData_containerImpl#getCategoryTaxonomy <em>Category Taxonomy</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MiningData_containerImpl extends EObjectImpl implements MiningData_container {
	/**
	 * The cached value of the '{@link #getAttributeAssignment() <em>Attribute Assignment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeAssignment()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeAssignment> attributeAssignment;

	/**
	 * The cached value of the '{@link #getAttributeAssignmentSet() <em>Attribute Assignment Set</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeAssignmentSet()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeAssignmentSet> attributeAssignmentSet;

	/**
	 * The cached value of the '{@link #getAttributeUsage() <em>Attribute Usage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeUsage()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeUsage> attributeUsage;

	/**
	 * The cached value of the '{@link #getAttributeUsageSet() <em>Attribute Usage Set</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeUsageSet()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeUsageSet> attributeUsageSet;

	/**
	 * The cached value of the '{@link #getCategoricalAttributeProperties() <em>Categorical Attribute Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoricalAttributeProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<CategoricalAttributeProperties> categoricalAttributeProperties;

	/**
	 * The cached value of the '{@link #getDirectAttributeAssignment() <em>Direct Attribute Assignment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectAttributeAssignment()
	 * @generated
	 * @ordered
	 */
	protected EList<DirectAttributeAssignment> directAttributeAssignment;

	/**
	 * The cached value of the '{@link #getLogicalAttribute() <em>Logical Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalAttribute> logicalAttribute;

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
	 * The cached value of the '{@link #getMiningAttribute() <em>Mining Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiningAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<MiningAttribute> miningAttribute;

	/**
	 * The cached value of the '{@link #getNumericalAttributeProperties() <em>Numerical Attribute Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumericalAttributeProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<NumericalAttributeProperties> numericalAttributeProperties;

	/**
	 * The cached value of the '{@link #getOrdinalAttributeProperties() <em>Ordinal Attribute Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrdinalAttributeProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<OrdinalAttributeProperties> ordinalAttributeProperties;

	/**
	 * The cached value of the '{@link #getPhysicalData() <em>Physical Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalData()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalData> physicalData;

	/**
	 * The cached value of the '{@link #getPivotAttributeAssignment() <em>Pivot Attribute Assignment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPivotAttributeAssignment()
	 * @generated
	 * @ordered
	 */
	protected EList<PivotAttributeAssignment> pivotAttributeAssignment;

	/**
	 * The cached value of the '{@link #getReversePivotAttributeAssignment() <em>Reverse Pivot Attribute Assignment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReversePivotAttributeAssignment()
	 * @generated
	 * @ordered
	 */
	protected EList<ReversePivotAttributeAssignment> reversePivotAttributeAssignment;

	/**
	 * The cached value of the '{@link #getSetAttributeAssignment() <em>Set Attribute Assignment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetAttributeAssignment()
	 * @generated
	 * @ordered
	 */
	protected EList<SetAttributeAssignment> setAttributeAssignment;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected EList<Category> category;

	/**
	 * The cached value of the '{@link #getCategoryMap() <em>Category Map</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoryMap()
	 * @generated
	 * @ordered
	 */
	protected EList<CategoryMap> categoryMap;

	/**
	 * The cached value of the '{@link #getCategoryMapObject() <em>Category Map Object</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoryMapObject()
	 * @generated
	 * @ordered
	 */
	protected EList<CategoryMapObject> categoryMapObject;

	/**
	 * The cached value of the '{@link #getCategoryMapObjectEntry() <em>Category Map Object Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoryMapObjectEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<CategoryMapObjectEntry> categoryMapObjectEntry;

	/**
	 * The cached value of the '{@link #getCategoryMapTable() <em>Category Map Table</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoryMapTable()
	 * @generated
	 * @ordered
	 */
	protected EList<CategoryMapTable> categoryMapTable;

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
	 * The cached value of the '{@link #getCategoryMatrixEntry() <em>Category Matrix Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoryMatrixEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<CategoryMatrixEntry> categoryMatrixEntry;

	/**
	 * The cached value of the '{@link #getCategoryMatrixObject() <em>Category Matrix Object</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoryMatrixObject()
	 * @generated
	 * @ordered
	 */
	protected EList<CategoryMatrixObject> categoryMatrixObject;

	/**
	 * The cached value of the '{@link #getCategoryMatrixTable() <em>Category Matrix Table</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoryMatrixTable()
	 * @generated
	 * @ordered
	 */
	protected EList<CategoryMatrixTable> categoryMatrixTable;

	/**
	 * The cached value of the '{@link #getCategoryTaxonomy() <em>Category Taxonomy</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoryTaxonomy()
	 * @generated
	 * @ordered
	 */
	protected EList<CategoryTaxonomy> categoryTaxonomy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MiningData_containerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MiningDataPackage.Literals.MINING_DATA_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeAssignment> getAttributeAssignment() {
		if (attributeAssignment == null) {
			attributeAssignment = new EObjectContainmentEList<AttributeAssignment>(AttributeAssignment.class, this, MiningDataPackage.MINING_DATA_CONTAINER__ATTRIBUTE_ASSIGNMENT);
		}
		return attributeAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeAssignmentSet> getAttributeAssignmentSet() {
		if (attributeAssignmentSet == null) {
			attributeAssignmentSet = new EObjectContainmentEList<AttributeAssignmentSet>(AttributeAssignmentSet.class, this, MiningDataPackage.MINING_DATA_CONTAINER__ATTRIBUTE_ASSIGNMENT_SET);
		}
		return attributeAssignmentSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeUsage> getAttributeUsage() {
		if (attributeUsage == null) {
			attributeUsage = new EObjectContainmentEList<AttributeUsage>(AttributeUsage.class, this, MiningDataPackage.MINING_DATA_CONTAINER__ATTRIBUTE_USAGE);
		}
		return attributeUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeUsageSet> getAttributeUsageSet() {
		if (attributeUsageSet == null) {
			attributeUsageSet = new EObjectContainmentEList<AttributeUsageSet>(AttributeUsageSet.class, this, MiningDataPackage.MINING_DATA_CONTAINER__ATTRIBUTE_USAGE_SET);
		}
		return attributeUsageSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CategoricalAttributeProperties> getCategoricalAttributeProperties() {
		if (categoricalAttributeProperties == null) {
			categoricalAttributeProperties = new EObjectContainmentEList<CategoricalAttributeProperties>(CategoricalAttributeProperties.class, this, MiningDataPackage.MINING_DATA_CONTAINER__CATEGORICAL_ATTRIBUTE_PROPERTIES);
		}
		return categoricalAttributeProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DirectAttributeAssignment> getDirectAttributeAssignment() {
		if (directAttributeAssignment == null) {
			directAttributeAssignment = new EObjectContainmentEList<DirectAttributeAssignment>(DirectAttributeAssignment.class, this, MiningDataPackage.MINING_DATA_CONTAINER__DIRECT_ATTRIBUTE_ASSIGNMENT);
		}
		return directAttributeAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogicalAttribute> getLogicalAttribute() {
		if (logicalAttribute == null) {
			logicalAttribute = new EObjectContainmentEList<LogicalAttribute>(LogicalAttribute.class, this, MiningDataPackage.MINING_DATA_CONTAINER__LOGICAL_ATTRIBUTE);
		}
		return logicalAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogicalData> getLogicalData() {
		if (logicalData == null) {
			logicalData = new EObjectContainmentEList<LogicalData>(LogicalData.class, this, MiningDataPackage.MINING_DATA_CONTAINER__LOGICAL_DATA);
		}
		return logicalData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MiningAttribute> getMiningAttribute() {
		if (miningAttribute == null) {
			miningAttribute = new EObjectContainmentEList<MiningAttribute>(MiningAttribute.class, this, MiningDataPackage.MINING_DATA_CONTAINER__MINING_ATTRIBUTE);
		}
		return miningAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NumericalAttributeProperties> getNumericalAttributeProperties() {
		if (numericalAttributeProperties == null) {
			numericalAttributeProperties = new EObjectContainmentEList<NumericalAttributeProperties>(NumericalAttributeProperties.class, this, MiningDataPackage.MINING_DATA_CONTAINER__NUMERICAL_ATTRIBUTE_PROPERTIES);
		}
		return numericalAttributeProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrdinalAttributeProperties> getOrdinalAttributeProperties() {
		if (ordinalAttributeProperties == null) {
			ordinalAttributeProperties = new EObjectContainmentEList<OrdinalAttributeProperties>(OrdinalAttributeProperties.class, this, MiningDataPackage.MINING_DATA_CONTAINER__ORDINAL_ATTRIBUTE_PROPERTIES);
		}
		return ordinalAttributeProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalData> getPhysicalData() {
		if (physicalData == null) {
			physicalData = new EObjectContainmentEList<PhysicalData>(PhysicalData.class, this, MiningDataPackage.MINING_DATA_CONTAINER__PHYSICAL_DATA);
		}
		return physicalData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PivotAttributeAssignment> getPivotAttributeAssignment() {
		if (pivotAttributeAssignment == null) {
			pivotAttributeAssignment = new EObjectContainmentEList<PivotAttributeAssignment>(PivotAttributeAssignment.class, this, MiningDataPackage.MINING_DATA_CONTAINER__PIVOT_ATTRIBUTE_ASSIGNMENT);
		}
		return pivotAttributeAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReversePivotAttributeAssignment> getReversePivotAttributeAssignment() {
		if (reversePivotAttributeAssignment == null) {
			reversePivotAttributeAssignment = new EObjectContainmentEList<ReversePivotAttributeAssignment>(ReversePivotAttributeAssignment.class, this, MiningDataPackage.MINING_DATA_CONTAINER__REVERSE_PIVOT_ATTRIBUTE_ASSIGNMENT);
		}
		return reversePivotAttributeAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SetAttributeAssignment> getSetAttributeAssignment() {
		if (setAttributeAssignment == null) {
			setAttributeAssignment = new EObjectContainmentEList<SetAttributeAssignment>(SetAttributeAssignment.class, this, MiningDataPackage.MINING_DATA_CONTAINER__SET_ATTRIBUTE_ASSIGNMENT);
		}
		return setAttributeAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Category> getCategory() {
		if (category == null) {
			category = new EObjectContainmentEList<Category>(Category.class, this, MiningDataPackage.MINING_DATA_CONTAINER__CATEGORY);
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CategoryMap> getCategoryMap() {
		if (categoryMap == null) {
			categoryMap = new EObjectContainmentEList<CategoryMap>(CategoryMap.class, this, MiningDataPackage.MINING_DATA_CONTAINER__CATEGORY_MAP);
		}
		return categoryMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CategoryMapObject> getCategoryMapObject() {
		if (categoryMapObject == null) {
			categoryMapObject = new EObjectContainmentEList<CategoryMapObject>(CategoryMapObject.class, this, MiningDataPackage.MINING_DATA_CONTAINER__CATEGORY_MAP_OBJECT);
		}
		return categoryMapObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CategoryMapObjectEntry> getCategoryMapObjectEntry() {
		if (categoryMapObjectEntry == null) {
			categoryMapObjectEntry = new EObjectContainmentEList<CategoryMapObjectEntry>(CategoryMapObjectEntry.class, this, MiningDataPackage.MINING_DATA_CONTAINER__CATEGORY_MAP_OBJECT_ENTRY);
		}
		return categoryMapObjectEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CategoryMapTable> getCategoryMapTable() {
		if (categoryMapTable == null) {
			categoryMapTable = new EObjectContainmentEList<CategoryMapTable>(CategoryMapTable.class, this, MiningDataPackage.MINING_DATA_CONTAINER__CATEGORY_MAP_TABLE);
		}
		return categoryMapTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CategoryMatrix> getCategoryMatrix() {
		if (categoryMatrix == null) {
			categoryMatrix = new EObjectContainmentEList<CategoryMatrix>(CategoryMatrix.class, this, MiningDataPackage.MINING_DATA_CONTAINER__CATEGORY_MATRIX);
		}
		return categoryMatrix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CategoryMatrixEntry> getCategoryMatrixEntry() {
		if (categoryMatrixEntry == null) {
			categoryMatrixEntry = new EObjectContainmentEList<CategoryMatrixEntry>(CategoryMatrixEntry.class, this, MiningDataPackage.MINING_DATA_CONTAINER__CATEGORY_MATRIX_ENTRY);
		}
		return categoryMatrixEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CategoryMatrixObject> getCategoryMatrixObject() {
		if (categoryMatrixObject == null) {
			categoryMatrixObject = new EObjectContainmentEList<CategoryMatrixObject>(CategoryMatrixObject.class, this, MiningDataPackage.MINING_DATA_CONTAINER__CATEGORY_MATRIX_OBJECT);
		}
		return categoryMatrixObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CategoryMatrixTable> getCategoryMatrixTable() {
		if (categoryMatrixTable == null) {
			categoryMatrixTable = new EObjectContainmentEList<CategoryMatrixTable>(CategoryMatrixTable.class, this, MiningDataPackage.MINING_DATA_CONTAINER__CATEGORY_MATRIX_TABLE);
		}
		return categoryMatrixTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CategoryTaxonomy> getCategoryTaxonomy() {
		if (categoryTaxonomy == null) {
			categoryTaxonomy = new EObjectContainmentEList<CategoryTaxonomy>(CategoryTaxonomy.class, this, MiningDataPackage.MINING_DATA_CONTAINER__CATEGORY_TAXONOMY);
		}
		return categoryTaxonomy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MiningDataPackage.MINING_DATA_CONTAINER__ATTRIBUTE_ASSIGNMENT:
				return ((InternalEList<?>)getAttributeAssignment()).basicRemove(otherEnd, msgs);
			case MiningDataPackage.MINING_DATA_CONTAINER__ATTRIBUTE_ASSIGNMENT_SET:
				return ((InternalEList<?>)getAttributeAssignmentSet()).basicRemove(otherEnd, msgs);
			case MiningDataPackage.MINING_DATA_CONTAINER__ATTRIBUTE_USAGE:
				return ((InternalEList<?>)getAttributeUsage()).basicRemove(otherEnd, msgs);
			case MiningDataPackage.MINING_DATA_CONTAINER__ATTRIBUTE_USAGE_SET:
				return ((InternalEList<?>)getAttributeUsageSet()).basicRemove(otherEnd, msgs);
			case MiningDataPackage.MINING_DATA_CONTAINER__CATEGORICAL_ATTRIBUTE_PROPERTIES:
				return ((InternalEList<?>)getCategoricalAttributeProperties()).basicRemove(otherEnd, msgs);
			case MiningDataPackage.MINING_DATA_CONTAINER__DIRECT_ATTRIBUTE_ASSIGNMENT:
				return ((InternalEList<?>)getDirectAttributeAssignment()).basicRemove(otherEnd, msgs);
			case MiningDataPackage.MINING_DATA_CONTAINER__LOGICAL_ATTRIBUTE:
				return ((InternalEList<?>)getLogicalAttribute()).basicRemove(otherEnd, msgs);
			case MiningDataPackage.MINING_DATA_CONTAINER__LOGICAL_DATA:
				return ((InternalEList<?>)getLogicalData()).basicRemove(otherEnd, msgs);
			case MiningDataPackage.MINING_DATA_CONTAINER__MINING_ATTRIBUTE:
				return ((InternalEList<?>)getMiningAttribute()).basicRemove(otherEnd, msgs);
			case MiningDataPackage.MINING_DATA_CONTAINER__NUMERICAL_ATTRIBUTE_PROPERTIES:
				return ((InternalEList<?>)getNumericalAttributeProperties()).basicRemove(otherEnd, msgs);
			case MiningDataPackage.MINING_DATA_CONTAINER__ORDINAL_ATTRIBUTE_PROPERTIES:
				return ((InternalEList<?>)getOrdinalAttributeProperties()).basicRemove(otherEnd, msgs);
			case MiningDataPackage.MINING_DATA_CONTAINER__PHYSICAL_DATA:
				return ((InternalEList<?>)getPhysicalData()).basicRemove(otherEnd, msgs);
			case MiningDataPackage.MINING_DATA_CONTAINER__PIVOT_ATTRIBUTE_ASSIGNMENT:
				return ((InternalEList<?>)getPivotAttributeAssignment()).basicRemove(otherEnd, msgs);
			case MiningDataPackage.MINING_DATA_CONTAINER__REVERSE_PIVOT_ATTRIBUTE_ASSIGNMENT:
				return ((InternalEList<?>)getReversePivotAttributeAssignment()).basicRemove(otherEnd, msgs);
			case MiningDataPackage.MINING_DATA_CONTAINER__SET_ATTRIBUTE_ASSIGNMENT:
				return ((InternalEList<?>)getSetAttributeAssignment()).basicRemove(otherEnd, msgs);
			case MiningDataPackage.MINING_DATA_CONTAINER__CATEGORY:
				return ((InternalEList<?>)getCategory()).basicRemove(otherEnd, msgs);
			case MiningDataPackage.MINING_DATA_CONTAINER__CATEGORY_MAP:
				return ((InternalEList<?>)getCategoryMap()).basicRemove(otherEnd, msgs);
			case MiningDataPackage.MINING_DATA_CONTAINER__CATEGORY_MAP_OBJECT:
				return ((InternalEList<?>)getCategoryMapObject()).basicRemove(otherEnd, msgs);
			case MiningDataPackage.MINING_DATA_CONTAINER__CATEGORY_MAP_OBJECT_ENTRY:
				return ((InternalEList<?>)getCategoryMapObjectEntry()).basicRemove(otherEnd, msgs);
			case MiningDataPackage.MINING_DATA_CONTAINER__CATEGORY_MAP_TABLE:
				return ((InternalEList<?>)getCategoryMapTable()).basicRemove(otherEnd, msgs);
			case MiningDataPackage.MINING_DATA_CONTAINER__CATEGORY_MATRIX:
				return ((InternalEList<?>)getCategoryMatrix()).basicRemove(otherEnd, msgs);
			case MiningDataPackage.MINING_DATA_CONTAINER__CATEGORY_MATRIX_ENTRY:
				return ((InternalEList<?>)getCategoryMatrixEntry()).basicRemove(otherEnd, msgs);
			case MiningDataPackage.MINING_DATA_CONTAINER__CATEGORY_MATRIX_OBJECT:
				return ((InternalEList<?>)getCategoryMatrixObject()).basicRemove(otherEnd, msgs);
			case MiningDataPackage.MINING_DATA_CONTAINER__CATEGORY_MATRIX_TABLE:
				return ((InternalEList<?>)getCategoryMatrixTable()).basicRemove(otherEnd, msgs);
			case MiningDataPackage.MINING_DATA_CONTAINER__CATEGORY_TAXONOMY:
				return ((InternalEList<?>)getCategoryTaxonomy()).basicRemove(otherEnd, msgs);
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
			case MiningDataPackage.MINING_DATA_CONTAINER__ATTRIBUTE_ASSIGNMENT:
				return getAttributeAssignment();
			case MiningDataPackage.MINING_DATA_CONTAINER__ATTRIBUTE_ASSIGNMENT_SET:
				return getAttributeAssignmentSet();
			case MiningDataPackage.MINING_DATA_CONTAINER__ATTRIBUTE_USAGE:
				return getAttributeUsage();
			case MiningDataPackage.MINING_DATA_CONTAINER__ATTRIBUTE_USAGE_SET:
				return getAttributeUsageSet();
			case MiningDataPackage.MINING_DATA_CONTAINER__CATEGORICAL_ATTRIBUTE_PROPERTIES:
				return getCategoricalAttributeProperties();
			case MiningDataPackage.MINING_DATA_CONTAINER__DIRECT_ATTRIBUTE_ASSIGNMENT:
				return getDirectAttributeAssignment();
			case MiningDataPackage.MINING_DATA_CONTAINER__LOGICAL_ATTRIBUTE:
				return getLogicalAttribute();
			case MiningDataPackage.MINING_DATA_CONTAINER__LOGICAL_DATA:
				return getLogicalData();
			case MiningDataPackage.MINING_DATA_CONTAINER__MINING_ATTRIBUTE:
				return getMiningAttribute();
			case MiningDataPackage.MINING_DATA_CONTAINER__NUMERICAL_ATTRIBUTE_PROPERTIES:
				return getNumericalAttributeProperties();
			case MiningDataPackage.MINING_DATA_CONTAINER__ORDINAL_ATTRIBUTE_PROPERTIES:
				return getOrdinalAttributeProperties();
			case MiningDataPackage.MINING_DATA_CONTAINER__PHYSICAL_DATA:
				return getPhysicalData();
			case MiningDataPackage.MINING_DATA_CONTAINER__PIVOT_ATTRIBUTE_ASSIGNMENT:
				return getPivotAttributeAssignment();
			case MiningDataPackage.MINING_DATA_CONTAINER__REVERSE_PIVOT_ATTRIBUTE_ASSIGNMENT:
				return getReversePivotAttributeAssignment();
			case MiningDataPackage.MINING_DATA_CONTAINER__SET_ATTRIBUTE_ASSIGNMENT:
				return getSetAttributeAssignment();
			case MiningDataPackage.MINING_DATA_CONTAINER__CATEGORY:
				return getCategory();
			case MiningDataPackage.MINING_DATA_CONTAINER__CATEGORY_MAP:
				return getCategoryMap();
			case MiningDataPackage.MINING_DATA_CONTAINER__CATEGORY_MAP_OBJECT:
				return getCategoryMapObject();
			case MiningDataPackage.MINING_DATA_CONTAINER__CATEGORY_MAP_OBJECT_ENTRY:
				return getCategoryMapObjectEntry();
			case MiningDataPackage.MINING_DATA_CONTAINER__CATEGORY_MAP_TABLE:
				return getCategoryMapTable();
			case MiningDataPackage.MINING_DATA_CONTAINER__CATEGORY_MATRIX:
				return getCategoryMatrix();
			case MiningDataPackage.MINING_DATA_CONTAINER__CATEGORY_MATRIX_ENTRY:
				return getCategoryMatrixEntry();
			case MiningDataPackage.MINING_DATA_CONTAINER__CATEGORY_MATRIX_OBJECT:
				return getCategoryMatrixObject();
			case MiningDataPackage.MINING_DATA_CONTAINER__CATEGORY_MATRIX_TABLE:
				return getCategoryMatrixTable();
			case MiningDataPackage.MINING_DATA_CONTAINER__CATEGORY_TAXONOMY:
				return getCategoryTaxonomy();
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
			case MiningDataPackage.MINING_DATA_CONTAINER__ATTRIBUTE_ASSIGNMENT:
				getAttributeAssignment().clear();
				getAttributeAssignment().addAll((Collection<? extends AttributeAssignment>)newValue);
				return;
			case MiningDataPackage.MINING_DATA_CONTAINER__ATTRIBUTE_ASSIGNMENT_SET:
				getAttributeAssignmentSet().clear();
				getAttributeAssignmentSet().addAll((Collection<? extends AttributeAssignmentSet>)newValue);
				return;
			case MiningDataPackage.MINING_DATA_CONTAINER__ATTRIBUTE_USAGE:
				getAttributeUsage().clear();
				getAttributeUsage().addAll((Collection<? extends AttributeUsage>)newValue);
				return;
			case MiningDataPackage.MINING_DATA_CONTAINER__ATTRIBUTE_USAGE_SET:
				getAttributeUsageSet().clear();
				getAttributeUsageSet().addAll((Collection<? extends AttributeUsageSet>)newValue);
				return;
			case MiningDataPackage.MINING_DATA_CONTAINER__CATEGORICAL_ATTRIBUTE_PROPERTIES:
				getCategoricalAttributeProperties().clear();
				getCategoricalAttributeProperties().addAll((Collection<? extends CategoricalAttributeProperties>)newValue);
				return;
			case MiningDataPackage.MINING_DATA_CONTAINER__DIRECT_ATTRIBUTE_ASSIGNMENT:
				getDirectAttributeAssignment().clear();
				getDirectAttributeAssignment().addAll((Collection<? extends DirectAttributeAssignment>)newValue);
				return;
			case MiningDataPackage.MINING_DATA_CONTAINER__LOGICAL_ATTRIBUTE:
				getLogicalAttribute().clear();
				getLogicalAttribute().addAll((Collection<? extends LogicalAttribute>)newValue);
				return;
			case MiningDataPackage.MINING_DATA_CONTAINER__LOGICAL_DATA:
				getLogicalData().clear();
				getLogicalData().addAll((Collection<? extends LogicalData>)newValue);
				return;
			case MiningDataPackage.MINING_DATA_CONTAINER__MINING_ATTRIBUTE:
				getMiningAttribute().clear();
				getMiningAttribute().addAll((Collection<? extends MiningAttribute>)newValue);
				return;
			case MiningDataPackage.MINING_DATA_CONTAINER__NUMERICAL_ATTRIBUTE_PROPERTIES:
				getNumericalAttributeProperties().clear();
				getNumericalAttributeProperties().addAll((Collection<? extends NumericalAttributeProperties>)newValue);
				return;
			case MiningDataPackage.MINING_DATA_CONTAINER__ORDINAL_ATTRIBUTE_PROPERTIES:
				getOrdinalAttributeProperties().clear();
				getOrdinalAttributeProperties().addAll((Collection<? extends OrdinalAttributeProperties>)newValue);
				return;
			case MiningDataPackage.MINING_DATA_CONTAINER__PHYSICAL_DATA:
				getPhysicalData().clear();
				getPhysicalData().addAll((Collection<? extends PhysicalData>)newValue);
				return;
			case MiningDataPackage.MINING_DATA_CONTAINER__PIVOT_ATTRIBUTE_ASSIGNMENT:
				getPivotAttributeAssignment().clear();
				getPivotAttributeAssignment().addAll((Collection<? extends PivotAttributeAssignment>)newValue);
				return;
			case MiningDataPackage.MINING_DATA_CONTAINER__REVERSE_PIVOT_ATTRIBUTE_ASSIGNMENT:
				getReversePivotAttributeAssignment().clear();
				getReversePivotAttributeAssignment().addAll((Collection<? extends ReversePivotAttributeAssignment>)newValue);
				return;
			case MiningDataPackage.MINING_DATA_CONTAINER__SET_ATTRIBUTE_ASSIGNMENT:
				getSetAttributeAssignment().clear();
				getSetAttributeAssignment().addAll((Collection<? extends SetAttributeAssignment>)newValue);
				return;
			case MiningDataPackage.MINING_DATA_CONTAINER__CATEGORY:
				getCategory().clear();
				getCategory().addAll((Collection<? extends Category>)newValue);
				return;
			case MiningDataPackage.MINING_DATA_CONTAINER__CATEGORY_MAP:
				getCategoryMap().clear();
				getCategoryMap().addAll((Collection<? extends CategoryMap>)newValue);
				return;
			case MiningDataPackage.MINING_DATA_CONTAINER__CATEGORY_MAP_OBJECT:
				getCategoryMapObject().clear();
				getCategoryMapObject().addAll((Collection<? extends CategoryMapObject>)newValue);
				return;
			case MiningDataPackage.MINING_DATA_CONTAINER__CATEGORY_MAP_OBJECT_ENTRY:
				getCategoryMapObjectEntry().clear();
				getCategoryMapObjectEntry().addAll((Collection<? extends CategoryMapObjectEntry>)newValue);
				return;
			case MiningDataPackage.MINING_DATA_CONTAINER__CATEGORY_MAP_TABLE:
				getCategoryMapTable().clear();
				getCategoryMapTable().addAll((Collection<? extends CategoryMapTable>)newValue);
				return;
			case MiningDataPackage.MINING_DATA_CONTAINER__CATEGORY_MATRIX:
				getCategoryMatrix().clear();
				getCategoryMatrix().addAll((Collection<? extends CategoryMatrix>)newValue);
				return;
			case MiningDataPackage.MINING_DATA_CONTAINER__CATEGORY_MATRIX_ENTRY:
				getCategoryMatrixEntry().clear();
				getCategoryMatrixEntry().addAll((Collection<? extends CategoryMatrixEntry>)newValue);
				return;
			case MiningDataPackage.MINING_DATA_CONTAINER__CATEGORY_MATRIX_OBJECT:
				getCategoryMatrixObject().clear();
				getCategoryMatrixObject().addAll((Collection<? extends CategoryMatrixObject>)newValue);
				return;
			case MiningDataPackage.MINING_DATA_CONTAINER__CATEGORY_MATRIX_TABLE:
				getCategoryMatrixTable().clear();
				getCategoryMatrixTable().addAll((Collection<? extends CategoryMatrixTable>)newValue);
				return;
			case MiningDataPackage.MINING_DATA_CONTAINER__CATEGORY_TAXONOMY:
				getCategoryTaxonomy().clear();
				getCategoryTaxonomy().addAll((Collection<? extends CategoryTaxonomy>)newValue);
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
			case MiningDataPackage.MINING_DATA_CONTAINER__ATTRIBUTE_ASSIGNMENT:
				getAttributeAssignment().clear();
				return;
			case MiningDataPackage.MINING_DATA_CONTAINER__ATTRIBUTE_ASSIGNMENT_SET:
				getAttributeAssignmentSet().clear();
				return;
			case MiningDataPackage.MINING_DATA_CONTAINER__ATTRIBUTE_USAGE:
				getAttributeUsage().clear();
				return;
			case MiningDataPackage.MINING_DATA_CONTAINER__ATTRIBUTE_USAGE_SET:
				getAttributeUsageSet().clear();
				return;
			case MiningDataPackage.MINING_DATA_CONTAINER__CATEGORICAL_ATTRIBUTE_PROPERTIES:
				getCategoricalAttributeProperties().clear();
				return;
			case MiningDataPackage.MINING_DATA_CONTAINER__DIRECT_ATTRIBUTE_ASSIGNMENT:
				getDirectAttributeAssignment().clear();
				return;
			case MiningDataPackage.MINING_DATA_CONTAINER__LOGICAL_ATTRIBUTE:
				getLogicalAttribute().clear();
				return;
			case MiningDataPackage.MINING_DATA_CONTAINER__LOGICAL_DATA:
				getLogicalData().clear();
				return;
			case MiningDataPackage.MINING_DATA_CONTAINER__MINING_ATTRIBUTE:
				getMiningAttribute().clear();
				return;
			case MiningDataPackage.MINING_DATA_CONTAINER__NUMERICAL_ATTRIBUTE_PROPERTIES:
				getNumericalAttributeProperties().clear();
				return;
			case MiningDataPackage.MINING_DATA_CONTAINER__ORDINAL_ATTRIBUTE_PROPERTIES:
				getOrdinalAttributeProperties().clear();
				return;
			case MiningDataPackage.MINING_DATA_CONTAINER__PHYSICAL_DATA:
				getPhysicalData().clear();
				return;
			case MiningDataPackage.MINING_DATA_CONTAINER__PIVOT_ATTRIBUTE_ASSIGNMENT:
				getPivotAttributeAssignment().clear();
				return;
			case MiningDataPackage.MINING_DATA_CONTAINER__REVERSE_PIVOT_ATTRIBUTE_ASSIGNMENT:
				getReversePivotAttributeAssignment().clear();
				return;
			case MiningDataPackage.MINING_DATA_CONTAINER__SET_ATTRIBUTE_ASSIGNMENT:
				getSetAttributeAssignment().clear();
				return;
			case MiningDataPackage.MINING_DATA_CONTAINER__CATEGORY:
				getCategory().clear();
				return;
			case MiningDataPackage.MINING_DATA_CONTAINER__CATEGORY_MAP:
				getCategoryMap().clear();
				return;
			case MiningDataPackage.MINING_DATA_CONTAINER__CATEGORY_MAP_OBJECT:
				getCategoryMapObject().clear();
				return;
			case MiningDataPackage.MINING_DATA_CONTAINER__CATEGORY_MAP_OBJECT_ENTRY:
				getCategoryMapObjectEntry().clear();
				return;
			case MiningDataPackage.MINING_DATA_CONTAINER__CATEGORY_MAP_TABLE:
				getCategoryMapTable().clear();
				return;
			case MiningDataPackage.MINING_DATA_CONTAINER__CATEGORY_MATRIX:
				getCategoryMatrix().clear();
				return;
			case MiningDataPackage.MINING_DATA_CONTAINER__CATEGORY_MATRIX_ENTRY:
				getCategoryMatrixEntry().clear();
				return;
			case MiningDataPackage.MINING_DATA_CONTAINER__CATEGORY_MATRIX_OBJECT:
				getCategoryMatrixObject().clear();
				return;
			case MiningDataPackage.MINING_DATA_CONTAINER__CATEGORY_MATRIX_TABLE:
				getCategoryMatrixTable().clear();
				return;
			case MiningDataPackage.MINING_DATA_CONTAINER__CATEGORY_TAXONOMY:
				getCategoryTaxonomy().clear();
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
			case MiningDataPackage.MINING_DATA_CONTAINER__ATTRIBUTE_ASSIGNMENT:
				return attributeAssignment != null && !attributeAssignment.isEmpty();
			case MiningDataPackage.MINING_DATA_CONTAINER__ATTRIBUTE_ASSIGNMENT_SET:
				return attributeAssignmentSet != null && !attributeAssignmentSet.isEmpty();
			case MiningDataPackage.MINING_DATA_CONTAINER__ATTRIBUTE_USAGE:
				return attributeUsage != null && !attributeUsage.isEmpty();
			case MiningDataPackage.MINING_DATA_CONTAINER__ATTRIBUTE_USAGE_SET:
				return attributeUsageSet != null && !attributeUsageSet.isEmpty();
			case MiningDataPackage.MINING_DATA_CONTAINER__CATEGORICAL_ATTRIBUTE_PROPERTIES:
				return categoricalAttributeProperties != null && !categoricalAttributeProperties.isEmpty();
			case MiningDataPackage.MINING_DATA_CONTAINER__DIRECT_ATTRIBUTE_ASSIGNMENT:
				return directAttributeAssignment != null && !directAttributeAssignment.isEmpty();
			case MiningDataPackage.MINING_DATA_CONTAINER__LOGICAL_ATTRIBUTE:
				return logicalAttribute != null && !logicalAttribute.isEmpty();
			case MiningDataPackage.MINING_DATA_CONTAINER__LOGICAL_DATA:
				return logicalData != null && !logicalData.isEmpty();
			case MiningDataPackage.MINING_DATA_CONTAINER__MINING_ATTRIBUTE:
				return miningAttribute != null && !miningAttribute.isEmpty();
			case MiningDataPackage.MINING_DATA_CONTAINER__NUMERICAL_ATTRIBUTE_PROPERTIES:
				return numericalAttributeProperties != null && !numericalAttributeProperties.isEmpty();
			case MiningDataPackage.MINING_DATA_CONTAINER__ORDINAL_ATTRIBUTE_PROPERTIES:
				return ordinalAttributeProperties != null && !ordinalAttributeProperties.isEmpty();
			case MiningDataPackage.MINING_DATA_CONTAINER__PHYSICAL_DATA:
				return physicalData != null && !physicalData.isEmpty();
			case MiningDataPackage.MINING_DATA_CONTAINER__PIVOT_ATTRIBUTE_ASSIGNMENT:
				return pivotAttributeAssignment != null && !pivotAttributeAssignment.isEmpty();
			case MiningDataPackage.MINING_DATA_CONTAINER__REVERSE_PIVOT_ATTRIBUTE_ASSIGNMENT:
				return reversePivotAttributeAssignment != null && !reversePivotAttributeAssignment.isEmpty();
			case MiningDataPackage.MINING_DATA_CONTAINER__SET_ATTRIBUTE_ASSIGNMENT:
				return setAttributeAssignment != null && !setAttributeAssignment.isEmpty();
			case MiningDataPackage.MINING_DATA_CONTAINER__CATEGORY:
				return category != null && !category.isEmpty();
			case MiningDataPackage.MINING_DATA_CONTAINER__CATEGORY_MAP:
				return categoryMap != null && !categoryMap.isEmpty();
			case MiningDataPackage.MINING_DATA_CONTAINER__CATEGORY_MAP_OBJECT:
				return categoryMapObject != null && !categoryMapObject.isEmpty();
			case MiningDataPackage.MINING_DATA_CONTAINER__CATEGORY_MAP_OBJECT_ENTRY:
				return categoryMapObjectEntry != null && !categoryMapObjectEntry.isEmpty();
			case MiningDataPackage.MINING_DATA_CONTAINER__CATEGORY_MAP_TABLE:
				return categoryMapTable != null && !categoryMapTable.isEmpty();
			case MiningDataPackage.MINING_DATA_CONTAINER__CATEGORY_MATRIX:
				return categoryMatrix != null && !categoryMatrix.isEmpty();
			case MiningDataPackage.MINING_DATA_CONTAINER__CATEGORY_MATRIX_ENTRY:
				return categoryMatrixEntry != null && !categoryMatrixEntry.isEmpty();
			case MiningDataPackage.MINING_DATA_CONTAINER__CATEGORY_MATRIX_OBJECT:
				return categoryMatrixObject != null && !categoryMatrixObject.isEmpty();
			case MiningDataPackage.MINING_DATA_CONTAINER__CATEGORY_MATRIX_TABLE:
				return categoryMatrixTable != null && !categoryMatrixTable.isEmpty();
			case MiningDataPackage.MINING_DATA_CONTAINER__CATEGORY_TAXONOMY:
				return categoryTaxonomy != null && !categoryTaxonomy.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MiningData_containerImpl

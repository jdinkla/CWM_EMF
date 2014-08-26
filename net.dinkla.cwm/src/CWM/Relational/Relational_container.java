/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Relational;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Relational.Relational_container#getCatalog <em>Catalog</em>}</li>
 *   <li>{@link CWM.Relational.Relational_container#getSchema <em>Schema</em>}</li>
 *   <li>{@link CWM.Relational.Relational_container#getColumnSet <em>Column Set</em>}</li>
 *   <li>{@link CWM.Relational.Relational_container#getNamedColumnSet <em>Named Column Set</em>}</li>
 *   <li>{@link CWM.Relational.Relational_container#getTable <em>Table</em>}</li>
 *   <li>{@link CWM.Relational.Relational_container#getView <em>View</em>}</li>
 *   <li>{@link CWM.Relational.Relational_container#getQueryColumnSet <em>Query Column Set</em>}</li>
 *   <li>{@link CWM.Relational.Relational_container#getSQLDataType <em>SQL Data Type</em>}</li>
 *   <li>{@link CWM.Relational.Relational_container#getSQLDistinctType <em>SQL Distinct Type</em>}</li>
 *   <li>{@link CWM.Relational.Relational_container#getSQLSimpleType <em>SQL Simple Type</em>}</li>
 *   <li>{@link CWM.Relational.Relational_container#getSQLStructuredType <em>SQL Structured Type</em>}</li>
 *   <li>{@link CWM.Relational.Relational_container#getColumn <em>Column</em>}</li>
 *   <li>{@link CWM.Relational.Relational_container#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link CWM.Relational.Relational_container#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link CWM.Relational.Relational_container#getSQLIndex <em>SQL Index</em>}</li>
 *   <li>{@link CWM.Relational.Relational_container#getUniqueConstraint <em>Unique Constraint</em>}</li>
 *   <li>{@link CWM.Relational.Relational_container#getForeignKey <em>Foreign Key</em>}</li>
 *   <li>{@link CWM.Relational.Relational_container#getSQLIndexColumn <em>SQL Index Column</em>}</li>
 *   <li>{@link CWM.Relational.Relational_container#getPrimaryKey <em>Primary Key</em>}</li>
 *   <li>{@link CWM.Relational.Relational_container#getRow <em>Row</em>}</li>
 *   <li>{@link CWM.Relational.Relational_container#getColumnValue <em>Column Value</em>}</li>
 *   <li>{@link CWM.Relational.Relational_container#getCheckConstraint <em>Check Constraint</em>}</li>
 *   <li>{@link CWM.Relational.Relational_container#getRowSet <em>Row Set</em>}</li>
 *   <li>{@link CWM.Relational.Relational_container#getSQLParameter <em>SQL Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Relational.RelationalPackage#getRelational_container()
 * @model
 * @generated
 */
public interface Relational_container extends EObject {
	/**
	 * Returns the value of the '<em><b>Catalog</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Relational.Catalog}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Catalog</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catalog</em>' containment reference list.
	 * @see CWM.Relational.RelationalPackage#getRelational_container_Catalog()
	 * @model containment="true"
	 * @generated
	 */
	EList<Catalog> getCatalog();

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Relational.Schema}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' containment reference list.
	 * @see CWM.Relational.RelationalPackage#getRelational_container_Schema()
	 * @model containment="true"
	 * @generated
	 */
	EList<Schema> getSchema();

	/**
	 * Returns the value of the '<em><b>Column Set</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Relational.ColumnSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Set</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Set</em>' containment reference list.
	 * @see CWM.Relational.RelationalPackage#getRelational_container_ColumnSet()
	 * @model containment="true"
	 * @generated
	 */
	EList<ColumnSet> getColumnSet();

	/**
	 * Returns the value of the '<em><b>Named Column Set</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Relational.NamedColumnSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Named Column Set</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Named Column Set</em>' containment reference list.
	 * @see CWM.Relational.RelationalPackage#getRelational_container_NamedColumnSet()
	 * @model containment="true"
	 * @generated
	 */
	EList<NamedColumnSet> getNamedColumnSet();

	/**
	 * Returns the value of the '<em><b>Table</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Relational.Table}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' containment reference list.
	 * @see CWM.Relational.RelationalPackage#getRelational_container_Table()
	 * @model containment="true"
	 * @generated
	 */
	EList<Table> getTable();

	/**
	 * Returns the value of the '<em><b>View</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Relational.View}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View</em>' containment reference list.
	 * @see CWM.Relational.RelationalPackage#getRelational_container_View()
	 * @model containment="true"
	 * @generated
	 */
	EList<View> getView();

	/**
	 * Returns the value of the '<em><b>Query Column Set</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Relational.QueryColumnSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query Column Set</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Column Set</em>' containment reference list.
	 * @see CWM.Relational.RelationalPackage#getRelational_container_QueryColumnSet()
	 * @model containment="true"
	 * @generated
	 */
	EList<QueryColumnSet> getQueryColumnSet();

	/**
	 * Returns the value of the '<em><b>SQL Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Relational.SQLDataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SQL Data Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SQL Data Type</em>' containment reference list.
	 * @see CWM.Relational.RelationalPackage#getRelational_container_SQLDataType()
	 * @model containment="true"
	 * @generated
	 */
	EList<SQLDataType> getSQLDataType();

	/**
	 * Returns the value of the '<em><b>SQL Distinct Type</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Relational.SQLDistinctType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SQL Distinct Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SQL Distinct Type</em>' containment reference list.
	 * @see CWM.Relational.RelationalPackage#getRelational_container_SQLDistinctType()
	 * @model containment="true"
	 * @generated
	 */
	EList<SQLDistinctType> getSQLDistinctType();

	/**
	 * Returns the value of the '<em><b>SQL Simple Type</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Relational.SQLSimpleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SQL Simple Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SQL Simple Type</em>' containment reference list.
	 * @see CWM.Relational.RelationalPackage#getRelational_container_SQLSimpleType()
	 * @model containment="true"
	 * @generated
	 */
	EList<SQLSimpleType> getSQLSimpleType();

	/**
	 * Returns the value of the '<em><b>SQL Structured Type</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Relational.SQLStructuredType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SQL Structured Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SQL Structured Type</em>' containment reference list.
	 * @see CWM.Relational.RelationalPackage#getRelational_container_SQLStructuredType()
	 * @model containment="true"
	 * @generated
	 */
	EList<SQLStructuredType> getSQLStructuredType();

	/**
	 * Returns the value of the '<em><b>Column</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Relational.Column}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' containment reference list.
	 * @see CWM.Relational.RelationalPackage#getRelational_container_Column()
	 * @model containment="true"
	 * @generated
	 */
	EList<Column> getColumn();

	/**
	 * Returns the value of the '<em><b>Procedure</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Relational.Procedure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedure</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedure</em>' containment reference list.
	 * @see CWM.Relational.RelationalPackage#getRelational_container_Procedure()
	 * @model containment="true"
	 * @generated
	 */
	EList<Procedure> getProcedure();

	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Relational.Trigger}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' containment reference list.
	 * @see CWM.Relational.RelationalPackage#getRelational_container_Trigger()
	 * @model containment="true"
	 * @generated
	 */
	EList<Trigger> getTrigger();

	/**
	 * Returns the value of the '<em><b>SQL Index</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Relational.SQLIndex}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SQL Index</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SQL Index</em>' containment reference list.
	 * @see CWM.Relational.RelationalPackage#getRelational_container_SQLIndex()
	 * @model containment="true"
	 * @generated
	 */
	EList<SQLIndex> getSQLIndex();

	/**
	 * Returns the value of the '<em><b>Unique Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Relational.UniqueConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unique Constraint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique Constraint</em>' containment reference list.
	 * @see CWM.Relational.RelationalPackage#getRelational_container_UniqueConstraint()
	 * @model containment="true"
	 * @generated
	 */
	EList<UniqueConstraint> getUniqueConstraint();

	/**
	 * Returns the value of the '<em><b>Foreign Key</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Relational.ForeignKey}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Foreign Key</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Key</em>' containment reference list.
	 * @see CWM.Relational.RelationalPackage#getRelational_container_ForeignKey()
	 * @model containment="true"
	 * @generated
	 */
	EList<ForeignKey> getForeignKey();

	/**
	 * Returns the value of the '<em><b>SQL Index Column</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Relational.SQLIndexColumn}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SQL Index Column</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SQL Index Column</em>' containment reference list.
	 * @see CWM.Relational.RelationalPackage#getRelational_container_SQLIndexColumn()
	 * @model containment="true"
	 * @generated
	 */
	EList<SQLIndexColumn> getSQLIndexColumn();

	/**
	 * Returns the value of the '<em><b>Primary Key</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Relational.PrimaryKey}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Key</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Key</em>' containment reference list.
	 * @see CWM.Relational.RelationalPackage#getRelational_container_PrimaryKey()
	 * @model containment="true"
	 * @generated
	 */
	EList<PrimaryKey> getPrimaryKey();

	/**
	 * Returns the value of the '<em><b>Row</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Relational.Row}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Row</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row</em>' containment reference list.
	 * @see CWM.Relational.RelationalPackage#getRelational_container_Row()
	 * @model containment="true"
	 * @generated
	 */
	EList<Row> getRow();

	/**
	 * Returns the value of the '<em><b>Column Value</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Relational.ColumnValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Value</em>' containment reference list.
	 * @see CWM.Relational.RelationalPackage#getRelational_container_ColumnValue()
	 * @model containment="true"
	 * @generated
	 */
	EList<ColumnValue> getColumnValue();

	/**
	 * Returns the value of the '<em><b>Check Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Relational.CheckConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Check Constraint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check Constraint</em>' containment reference list.
	 * @see CWM.Relational.RelationalPackage#getRelational_container_CheckConstraint()
	 * @model containment="true"
	 * @generated
	 */
	EList<CheckConstraint> getCheckConstraint();

	/**
	 * Returns the value of the '<em><b>Row Set</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Relational.RowSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Row Set</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row Set</em>' containment reference list.
	 * @see CWM.Relational.RelationalPackage#getRelational_container_RowSet()
	 * @model containment="true"
	 * @generated
	 */
	EList<RowSet> getRowSet();

	/**
	 * Returns the value of the '<em><b>SQL Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Relational.SQLParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SQL Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SQL Parameter</em>' containment reference list.
	 * @see CWM.Relational.RelationalPackage#getRelational_container_SQLParameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<SQLParameter> getSQLParameter();

} // Relational_container

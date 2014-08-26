/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Relational.impl;

import CWM.Relational.Catalog;
import CWM.Relational.CheckConstraint;
import CWM.Relational.Column;
import CWM.Relational.ColumnSet;
import CWM.Relational.ColumnValue;
import CWM.Relational.ForeignKey;
import CWM.Relational.NamedColumnSet;
import CWM.Relational.PrimaryKey;
import CWM.Relational.Procedure;
import CWM.Relational.QueryColumnSet;
import CWM.Relational.RelationalPackage;
import CWM.Relational.Relational_container;
import CWM.Relational.Row;
import CWM.Relational.RowSet;
import CWM.Relational.SQLDataType;
import CWM.Relational.SQLDistinctType;
import CWM.Relational.SQLIndex;
import CWM.Relational.SQLIndexColumn;
import CWM.Relational.SQLParameter;
import CWM.Relational.SQLSimpleType;
import CWM.Relational.SQLStructuredType;
import CWM.Relational.Schema;
import CWM.Relational.Table;
import CWM.Relational.Trigger;
import CWM.Relational.UniqueConstraint;
import CWM.Relational.View;

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
 * An implementation of the model object '<em><b>Relational container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.Relational.impl.Relational_containerImpl#getCatalog <em>Catalog</em>}</li>
 *   <li>{@link CWM.Relational.impl.Relational_containerImpl#getSchema <em>Schema</em>}</li>
 *   <li>{@link CWM.Relational.impl.Relational_containerImpl#getColumnSet <em>Column Set</em>}</li>
 *   <li>{@link CWM.Relational.impl.Relational_containerImpl#getNamedColumnSet <em>Named Column Set</em>}</li>
 *   <li>{@link CWM.Relational.impl.Relational_containerImpl#getTable <em>Table</em>}</li>
 *   <li>{@link CWM.Relational.impl.Relational_containerImpl#getView <em>View</em>}</li>
 *   <li>{@link CWM.Relational.impl.Relational_containerImpl#getQueryColumnSet <em>Query Column Set</em>}</li>
 *   <li>{@link CWM.Relational.impl.Relational_containerImpl#getSQLDataType <em>SQL Data Type</em>}</li>
 *   <li>{@link CWM.Relational.impl.Relational_containerImpl#getSQLDistinctType <em>SQL Distinct Type</em>}</li>
 *   <li>{@link CWM.Relational.impl.Relational_containerImpl#getSQLSimpleType <em>SQL Simple Type</em>}</li>
 *   <li>{@link CWM.Relational.impl.Relational_containerImpl#getSQLStructuredType <em>SQL Structured Type</em>}</li>
 *   <li>{@link CWM.Relational.impl.Relational_containerImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link CWM.Relational.impl.Relational_containerImpl#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link CWM.Relational.impl.Relational_containerImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link CWM.Relational.impl.Relational_containerImpl#getSQLIndex <em>SQL Index</em>}</li>
 *   <li>{@link CWM.Relational.impl.Relational_containerImpl#getUniqueConstraint <em>Unique Constraint</em>}</li>
 *   <li>{@link CWM.Relational.impl.Relational_containerImpl#getForeignKey <em>Foreign Key</em>}</li>
 *   <li>{@link CWM.Relational.impl.Relational_containerImpl#getSQLIndexColumn <em>SQL Index Column</em>}</li>
 *   <li>{@link CWM.Relational.impl.Relational_containerImpl#getPrimaryKey <em>Primary Key</em>}</li>
 *   <li>{@link CWM.Relational.impl.Relational_containerImpl#getRow <em>Row</em>}</li>
 *   <li>{@link CWM.Relational.impl.Relational_containerImpl#getColumnValue <em>Column Value</em>}</li>
 *   <li>{@link CWM.Relational.impl.Relational_containerImpl#getCheckConstraint <em>Check Constraint</em>}</li>
 *   <li>{@link CWM.Relational.impl.Relational_containerImpl#getRowSet <em>Row Set</em>}</li>
 *   <li>{@link CWM.Relational.impl.Relational_containerImpl#getSQLParameter <em>SQL Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Relational_containerImpl extends EObjectImpl implements Relational_container {
	/**
	 * The cached value of the '{@link #getCatalog() <em>Catalog</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatalog()
	 * @generated
	 * @ordered
	 */
	protected EList<Catalog> catalog;

	/**
	 * The cached value of the '{@link #getSchema() <em>Schema</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchema()
	 * @generated
	 * @ordered
	 */
	protected EList<Schema> schema;

	/**
	 * The cached value of the '{@link #getColumnSet() <em>Column Set</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnSet()
	 * @generated
	 * @ordered
	 */
	protected EList<ColumnSet> columnSet;

	/**
	 * The cached value of the '{@link #getNamedColumnSet() <em>Named Column Set</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamedColumnSet()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedColumnSet> namedColumnSet;

	/**
	 * The cached value of the '{@link #getTable() <em>Table</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTable()
	 * @generated
	 * @ordered
	 */
	protected EList<Table> table;

	/**
	 * The cached value of the '{@link #getView() <em>View</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getView()
	 * @generated
	 * @ordered
	 */
	protected EList<View> view;

	/**
	 * The cached value of the '{@link #getQueryColumnSet() <em>Query Column Set</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryColumnSet()
	 * @generated
	 * @ordered
	 */
	protected EList<QueryColumnSet> queryColumnSet;

	/**
	 * The cached value of the '{@link #getSQLDataType() <em>SQL Data Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSQLDataType()
	 * @generated
	 * @ordered
	 */
	protected EList<SQLDataType> sqlDataType;

	/**
	 * The cached value of the '{@link #getSQLDistinctType() <em>SQL Distinct Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSQLDistinctType()
	 * @generated
	 * @ordered
	 */
	protected EList<SQLDistinctType> sqlDistinctType;

	/**
	 * The cached value of the '{@link #getSQLSimpleType() <em>SQL Simple Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSQLSimpleType()
	 * @generated
	 * @ordered
	 */
	protected EList<SQLSimpleType> sqlSimpleType;

	/**
	 * The cached value of the '{@link #getSQLStructuredType() <em>SQL Structured Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSQLStructuredType()
	 * @generated
	 * @ordered
	 */
	protected EList<SQLStructuredType> sqlStructuredType;

	/**
	 * The cached value of the '{@link #getColumn() <em>Column</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> column;

	/**
	 * The cached value of the '{@link #getProcedure() <em>Procedure</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedure()
	 * @generated
	 * @ordered
	 */
	protected EList<Procedure> procedure;

	/**
	 * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected EList<Trigger> trigger;

	/**
	 * The cached value of the '{@link #getSQLIndex() <em>SQL Index</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSQLIndex()
	 * @generated
	 * @ordered
	 */
	protected EList<SQLIndex> sqlIndex;

	/**
	 * The cached value of the '{@link #getUniqueConstraint() <em>Unique Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<UniqueConstraint> uniqueConstraint;

	/**
	 * The cached value of the '{@link #getForeignKey() <em>Foreign Key</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignKey()
	 * @generated
	 * @ordered
	 */
	protected EList<ForeignKey> foreignKey;

	/**
	 * The cached value of the '{@link #getSQLIndexColumn() <em>SQL Index Column</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSQLIndexColumn()
	 * @generated
	 * @ordered
	 */
	protected EList<SQLIndexColumn> sqlIndexColumn;

	/**
	 * The cached value of the '{@link #getPrimaryKey() <em>Primary Key</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryKey()
	 * @generated
	 * @ordered
	 */
	protected EList<PrimaryKey> primaryKey;

	/**
	 * The cached value of the '{@link #getRow() <em>Row</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRow()
	 * @generated
	 * @ordered
	 */
	protected EList<Row> row;

	/**
	 * The cached value of the '{@link #getColumnValue() <em>Column Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnValue()
	 * @generated
	 * @ordered
	 */
	protected EList<ColumnValue> columnValue;

	/**
	 * The cached value of the '{@link #getCheckConstraint() <em>Check Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<CheckConstraint> checkConstraint;

	/**
	 * The cached value of the '{@link #getRowSet() <em>Row Set</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowSet()
	 * @generated
	 * @ordered
	 */
	protected EList<RowSet> rowSet;

	/**
	 * The cached value of the '{@link #getSQLParameter() <em>SQL Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSQLParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<SQLParameter> sqlParameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Relational_containerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RelationalPackage.Literals.RELATIONAL_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Catalog> getCatalog() {
		if (catalog == null) {
			catalog = new EObjectContainmentEList<Catalog>(Catalog.class, this, RelationalPackage.RELATIONAL_CONTAINER__CATALOG);
		}
		return catalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Schema> getSchema() {
		if (schema == null) {
			schema = new EObjectContainmentEList<Schema>(Schema.class, this, RelationalPackage.RELATIONAL_CONTAINER__SCHEMA);
		}
		return schema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ColumnSet> getColumnSet() {
		if (columnSet == null) {
			columnSet = new EObjectContainmentEList<ColumnSet>(ColumnSet.class, this, RelationalPackage.RELATIONAL_CONTAINER__COLUMN_SET);
		}
		return columnSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedColumnSet> getNamedColumnSet() {
		if (namedColumnSet == null) {
			namedColumnSet = new EObjectContainmentEList<NamedColumnSet>(NamedColumnSet.class, this, RelationalPackage.RELATIONAL_CONTAINER__NAMED_COLUMN_SET);
		}
		return namedColumnSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Table> getTable() {
		if (table == null) {
			table = new EObjectContainmentEList<Table>(Table.class, this, RelationalPackage.RELATIONAL_CONTAINER__TABLE);
		}
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<View> getView() {
		if (view == null) {
			view = new EObjectContainmentEList<View>(View.class, this, RelationalPackage.RELATIONAL_CONTAINER__VIEW);
		}
		return view;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QueryColumnSet> getQueryColumnSet() {
		if (queryColumnSet == null) {
			queryColumnSet = new EObjectContainmentEList<QueryColumnSet>(QueryColumnSet.class, this, RelationalPackage.RELATIONAL_CONTAINER__QUERY_COLUMN_SET);
		}
		return queryColumnSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SQLDataType> getSQLDataType() {
		if (sqlDataType == null) {
			sqlDataType = new EObjectContainmentEList<SQLDataType>(SQLDataType.class, this, RelationalPackage.RELATIONAL_CONTAINER__SQL_DATA_TYPE);
		}
		return sqlDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SQLDistinctType> getSQLDistinctType() {
		if (sqlDistinctType == null) {
			sqlDistinctType = new EObjectContainmentEList<SQLDistinctType>(SQLDistinctType.class, this, RelationalPackage.RELATIONAL_CONTAINER__SQL_DISTINCT_TYPE);
		}
		return sqlDistinctType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SQLSimpleType> getSQLSimpleType() {
		if (sqlSimpleType == null) {
			sqlSimpleType = new EObjectContainmentEList<SQLSimpleType>(SQLSimpleType.class, this, RelationalPackage.RELATIONAL_CONTAINER__SQL_SIMPLE_TYPE);
		}
		return sqlSimpleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SQLStructuredType> getSQLStructuredType() {
		if (sqlStructuredType == null) {
			sqlStructuredType = new EObjectContainmentEList<SQLStructuredType>(SQLStructuredType.class, this, RelationalPackage.RELATIONAL_CONTAINER__SQL_STRUCTURED_TYPE);
		}
		return sqlStructuredType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Column> getColumn() {
		if (column == null) {
			column = new EObjectContainmentEList<Column>(Column.class, this, RelationalPackage.RELATIONAL_CONTAINER__COLUMN);
		}
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Procedure> getProcedure() {
		if (procedure == null) {
			procedure = new EObjectContainmentEList<Procedure>(Procedure.class, this, RelationalPackage.RELATIONAL_CONTAINER__PROCEDURE);
		}
		return procedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trigger> getTrigger() {
		if (trigger == null) {
			trigger = new EObjectContainmentEList<Trigger>(Trigger.class, this, RelationalPackage.RELATIONAL_CONTAINER__TRIGGER);
		}
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SQLIndex> getSQLIndex() {
		if (sqlIndex == null) {
			sqlIndex = new EObjectContainmentEList<SQLIndex>(SQLIndex.class, this, RelationalPackage.RELATIONAL_CONTAINER__SQL_INDEX);
		}
		return sqlIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UniqueConstraint> getUniqueConstraint() {
		if (uniqueConstraint == null) {
			uniqueConstraint = new EObjectContainmentEList<UniqueConstraint>(UniqueConstraint.class, this, RelationalPackage.RELATIONAL_CONTAINER__UNIQUE_CONSTRAINT);
		}
		return uniqueConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ForeignKey> getForeignKey() {
		if (foreignKey == null) {
			foreignKey = new EObjectContainmentEList<ForeignKey>(ForeignKey.class, this, RelationalPackage.RELATIONAL_CONTAINER__FOREIGN_KEY);
		}
		return foreignKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SQLIndexColumn> getSQLIndexColumn() {
		if (sqlIndexColumn == null) {
			sqlIndexColumn = new EObjectContainmentEList<SQLIndexColumn>(SQLIndexColumn.class, this, RelationalPackage.RELATIONAL_CONTAINER__SQL_INDEX_COLUMN);
		}
		return sqlIndexColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrimaryKey> getPrimaryKey() {
		if (primaryKey == null) {
			primaryKey = new EObjectContainmentEList<PrimaryKey>(PrimaryKey.class, this, RelationalPackage.RELATIONAL_CONTAINER__PRIMARY_KEY);
		}
		return primaryKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Row> getRow() {
		if (row == null) {
			row = new EObjectContainmentEList<Row>(Row.class, this, RelationalPackage.RELATIONAL_CONTAINER__ROW);
		}
		return row;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ColumnValue> getColumnValue() {
		if (columnValue == null) {
			columnValue = new EObjectContainmentEList<ColumnValue>(ColumnValue.class, this, RelationalPackage.RELATIONAL_CONTAINER__COLUMN_VALUE);
		}
		return columnValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CheckConstraint> getCheckConstraint() {
		if (checkConstraint == null) {
			checkConstraint = new EObjectContainmentEList<CheckConstraint>(CheckConstraint.class, this, RelationalPackage.RELATIONAL_CONTAINER__CHECK_CONSTRAINT);
		}
		return checkConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RowSet> getRowSet() {
		if (rowSet == null) {
			rowSet = new EObjectContainmentEList<RowSet>(RowSet.class, this, RelationalPackage.RELATIONAL_CONTAINER__ROW_SET);
		}
		return rowSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SQLParameter> getSQLParameter() {
		if (sqlParameter == null) {
			sqlParameter = new EObjectContainmentEList<SQLParameter>(SQLParameter.class, this, RelationalPackage.RELATIONAL_CONTAINER__SQL_PARAMETER);
		}
		return sqlParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RelationalPackage.RELATIONAL_CONTAINER__CATALOG:
				return ((InternalEList<?>)getCatalog()).basicRemove(otherEnd, msgs);
			case RelationalPackage.RELATIONAL_CONTAINER__SCHEMA:
				return ((InternalEList<?>)getSchema()).basicRemove(otherEnd, msgs);
			case RelationalPackage.RELATIONAL_CONTAINER__COLUMN_SET:
				return ((InternalEList<?>)getColumnSet()).basicRemove(otherEnd, msgs);
			case RelationalPackage.RELATIONAL_CONTAINER__NAMED_COLUMN_SET:
				return ((InternalEList<?>)getNamedColumnSet()).basicRemove(otherEnd, msgs);
			case RelationalPackage.RELATIONAL_CONTAINER__TABLE:
				return ((InternalEList<?>)getTable()).basicRemove(otherEnd, msgs);
			case RelationalPackage.RELATIONAL_CONTAINER__VIEW:
				return ((InternalEList<?>)getView()).basicRemove(otherEnd, msgs);
			case RelationalPackage.RELATIONAL_CONTAINER__QUERY_COLUMN_SET:
				return ((InternalEList<?>)getQueryColumnSet()).basicRemove(otherEnd, msgs);
			case RelationalPackage.RELATIONAL_CONTAINER__SQL_DATA_TYPE:
				return ((InternalEList<?>)getSQLDataType()).basicRemove(otherEnd, msgs);
			case RelationalPackage.RELATIONAL_CONTAINER__SQL_DISTINCT_TYPE:
				return ((InternalEList<?>)getSQLDistinctType()).basicRemove(otherEnd, msgs);
			case RelationalPackage.RELATIONAL_CONTAINER__SQL_SIMPLE_TYPE:
				return ((InternalEList<?>)getSQLSimpleType()).basicRemove(otherEnd, msgs);
			case RelationalPackage.RELATIONAL_CONTAINER__SQL_STRUCTURED_TYPE:
				return ((InternalEList<?>)getSQLStructuredType()).basicRemove(otherEnd, msgs);
			case RelationalPackage.RELATIONAL_CONTAINER__COLUMN:
				return ((InternalEList<?>)getColumn()).basicRemove(otherEnd, msgs);
			case RelationalPackage.RELATIONAL_CONTAINER__PROCEDURE:
				return ((InternalEList<?>)getProcedure()).basicRemove(otherEnd, msgs);
			case RelationalPackage.RELATIONAL_CONTAINER__TRIGGER:
				return ((InternalEList<?>)getTrigger()).basicRemove(otherEnd, msgs);
			case RelationalPackage.RELATIONAL_CONTAINER__SQL_INDEX:
				return ((InternalEList<?>)getSQLIndex()).basicRemove(otherEnd, msgs);
			case RelationalPackage.RELATIONAL_CONTAINER__UNIQUE_CONSTRAINT:
				return ((InternalEList<?>)getUniqueConstraint()).basicRemove(otherEnd, msgs);
			case RelationalPackage.RELATIONAL_CONTAINER__FOREIGN_KEY:
				return ((InternalEList<?>)getForeignKey()).basicRemove(otherEnd, msgs);
			case RelationalPackage.RELATIONAL_CONTAINER__SQL_INDEX_COLUMN:
				return ((InternalEList<?>)getSQLIndexColumn()).basicRemove(otherEnd, msgs);
			case RelationalPackage.RELATIONAL_CONTAINER__PRIMARY_KEY:
				return ((InternalEList<?>)getPrimaryKey()).basicRemove(otherEnd, msgs);
			case RelationalPackage.RELATIONAL_CONTAINER__ROW:
				return ((InternalEList<?>)getRow()).basicRemove(otherEnd, msgs);
			case RelationalPackage.RELATIONAL_CONTAINER__COLUMN_VALUE:
				return ((InternalEList<?>)getColumnValue()).basicRemove(otherEnd, msgs);
			case RelationalPackage.RELATIONAL_CONTAINER__CHECK_CONSTRAINT:
				return ((InternalEList<?>)getCheckConstraint()).basicRemove(otherEnd, msgs);
			case RelationalPackage.RELATIONAL_CONTAINER__ROW_SET:
				return ((InternalEList<?>)getRowSet()).basicRemove(otherEnd, msgs);
			case RelationalPackage.RELATIONAL_CONTAINER__SQL_PARAMETER:
				return ((InternalEList<?>)getSQLParameter()).basicRemove(otherEnd, msgs);
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
			case RelationalPackage.RELATIONAL_CONTAINER__CATALOG:
				return getCatalog();
			case RelationalPackage.RELATIONAL_CONTAINER__SCHEMA:
				return getSchema();
			case RelationalPackage.RELATIONAL_CONTAINER__COLUMN_SET:
				return getColumnSet();
			case RelationalPackage.RELATIONAL_CONTAINER__NAMED_COLUMN_SET:
				return getNamedColumnSet();
			case RelationalPackage.RELATIONAL_CONTAINER__TABLE:
				return getTable();
			case RelationalPackage.RELATIONAL_CONTAINER__VIEW:
				return getView();
			case RelationalPackage.RELATIONAL_CONTAINER__QUERY_COLUMN_SET:
				return getQueryColumnSet();
			case RelationalPackage.RELATIONAL_CONTAINER__SQL_DATA_TYPE:
				return getSQLDataType();
			case RelationalPackage.RELATIONAL_CONTAINER__SQL_DISTINCT_TYPE:
				return getSQLDistinctType();
			case RelationalPackage.RELATIONAL_CONTAINER__SQL_SIMPLE_TYPE:
				return getSQLSimpleType();
			case RelationalPackage.RELATIONAL_CONTAINER__SQL_STRUCTURED_TYPE:
				return getSQLStructuredType();
			case RelationalPackage.RELATIONAL_CONTAINER__COLUMN:
				return getColumn();
			case RelationalPackage.RELATIONAL_CONTAINER__PROCEDURE:
				return getProcedure();
			case RelationalPackage.RELATIONAL_CONTAINER__TRIGGER:
				return getTrigger();
			case RelationalPackage.RELATIONAL_CONTAINER__SQL_INDEX:
				return getSQLIndex();
			case RelationalPackage.RELATIONAL_CONTAINER__UNIQUE_CONSTRAINT:
				return getUniqueConstraint();
			case RelationalPackage.RELATIONAL_CONTAINER__FOREIGN_KEY:
				return getForeignKey();
			case RelationalPackage.RELATIONAL_CONTAINER__SQL_INDEX_COLUMN:
				return getSQLIndexColumn();
			case RelationalPackage.RELATIONAL_CONTAINER__PRIMARY_KEY:
				return getPrimaryKey();
			case RelationalPackage.RELATIONAL_CONTAINER__ROW:
				return getRow();
			case RelationalPackage.RELATIONAL_CONTAINER__COLUMN_VALUE:
				return getColumnValue();
			case RelationalPackage.RELATIONAL_CONTAINER__CHECK_CONSTRAINT:
				return getCheckConstraint();
			case RelationalPackage.RELATIONAL_CONTAINER__ROW_SET:
				return getRowSet();
			case RelationalPackage.RELATIONAL_CONTAINER__SQL_PARAMETER:
				return getSQLParameter();
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
			case RelationalPackage.RELATIONAL_CONTAINER__CATALOG:
				getCatalog().clear();
				getCatalog().addAll((Collection<? extends Catalog>)newValue);
				return;
			case RelationalPackage.RELATIONAL_CONTAINER__SCHEMA:
				getSchema().clear();
				getSchema().addAll((Collection<? extends Schema>)newValue);
				return;
			case RelationalPackage.RELATIONAL_CONTAINER__COLUMN_SET:
				getColumnSet().clear();
				getColumnSet().addAll((Collection<? extends ColumnSet>)newValue);
				return;
			case RelationalPackage.RELATIONAL_CONTAINER__NAMED_COLUMN_SET:
				getNamedColumnSet().clear();
				getNamedColumnSet().addAll((Collection<? extends NamedColumnSet>)newValue);
				return;
			case RelationalPackage.RELATIONAL_CONTAINER__TABLE:
				getTable().clear();
				getTable().addAll((Collection<? extends Table>)newValue);
				return;
			case RelationalPackage.RELATIONAL_CONTAINER__VIEW:
				getView().clear();
				getView().addAll((Collection<? extends View>)newValue);
				return;
			case RelationalPackage.RELATIONAL_CONTAINER__QUERY_COLUMN_SET:
				getQueryColumnSet().clear();
				getQueryColumnSet().addAll((Collection<? extends QueryColumnSet>)newValue);
				return;
			case RelationalPackage.RELATIONAL_CONTAINER__SQL_DATA_TYPE:
				getSQLDataType().clear();
				getSQLDataType().addAll((Collection<? extends SQLDataType>)newValue);
				return;
			case RelationalPackage.RELATIONAL_CONTAINER__SQL_DISTINCT_TYPE:
				getSQLDistinctType().clear();
				getSQLDistinctType().addAll((Collection<? extends SQLDistinctType>)newValue);
				return;
			case RelationalPackage.RELATIONAL_CONTAINER__SQL_SIMPLE_TYPE:
				getSQLSimpleType().clear();
				getSQLSimpleType().addAll((Collection<? extends SQLSimpleType>)newValue);
				return;
			case RelationalPackage.RELATIONAL_CONTAINER__SQL_STRUCTURED_TYPE:
				getSQLStructuredType().clear();
				getSQLStructuredType().addAll((Collection<? extends SQLStructuredType>)newValue);
				return;
			case RelationalPackage.RELATIONAL_CONTAINER__COLUMN:
				getColumn().clear();
				getColumn().addAll((Collection<? extends Column>)newValue);
				return;
			case RelationalPackage.RELATIONAL_CONTAINER__PROCEDURE:
				getProcedure().clear();
				getProcedure().addAll((Collection<? extends Procedure>)newValue);
				return;
			case RelationalPackage.RELATIONAL_CONTAINER__TRIGGER:
				getTrigger().clear();
				getTrigger().addAll((Collection<? extends Trigger>)newValue);
				return;
			case RelationalPackage.RELATIONAL_CONTAINER__SQL_INDEX:
				getSQLIndex().clear();
				getSQLIndex().addAll((Collection<? extends SQLIndex>)newValue);
				return;
			case RelationalPackage.RELATIONAL_CONTAINER__UNIQUE_CONSTRAINT:
				getUniqueConstraint().clear();
				getUniqueConstraint().addAll((Collection<? extends UniqueConstraint>)newValue);
				return;
			case RelationalPackage.RELATIONAL_CONTAINER__FOREIGN_KEY:
				getForeignKey().clear();
				getForeignKey().addAll((Collection<? extends ForeignKey>)newValue);
				return;
			case RelationalPackage.RELATIONAL_CONTAINER__SQL_INDEX_COLUMN:
				getSQLIndexColumn().clear();
				getSQLIndexColumn().addAll((Collection<? extends SQLIndexColumn>)newValue);
				return;
			case RelationalPackage.RELATIONAL_CONTAINER__PRIMARY_KEY:
				getPrimaryKey().clear();
				getPrimaryKey().addAll((Collection<? extends PrimaryKey>)newValue);
				return;
			case RelationalPackage.RELATIONAL_CONTAINER__ROW:
				getRow().clear();
				getRow().addAll((Collection<? extends Row>)newValue);
				return;
			case RelationalPackage.RELATIONAL_CONTAINER__COLUMN_VALUE:
				getColumnValue().clear();
				getColumnValue().addAll((Collection<? extends ColumnValue>)newValue);
				return;
			case RelationalPackage.RELATIONAL_CONTAINER__CHECK_CONSTRAINT:
				getCheckConstraint().clear();
				getCheckConstraint().addAll((Collection<? extends CheckConstraint>)newValue);
				return;
			case RelationalPackage.RELATIONAL_CONTAINER__ROW_SET:
				getRowSet().clear();
				getRowSet().addAll((Collection<? extends RowSet>)newValue);
				return;
			case RelationalPackage.RELATIONAL_CONTAINER__SQL_PARAMETER:
				getSQLParameter().clear();
				getSQLParameter().addAll((Collection<? extends SQLParameter>)newValue);
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
			case RelationalPackage.RELATIONAL_CONTAINER__CATALOG:
				getCatalog().clear();
				return;
			case RelationalPackage.RELATIONAL_CONTAINER__SCHEMA:
				getSchema().clear();
				return;
			case RelationalPackage.RELATIONAL_CONTAINER__COLUMN_SET:
				getColumnSet().clear();
				return;
			case RelationalPackage.RELATIONAL_CONTAINER__NAMED_COLUMN_SET:
				getNamedColumnSet().clear();
				return;
			case RelationalPackage.RELATIONAL_CONTAINER__TABLE:
				getTable().clear();
				return;
			case RelationalPackage.RELATIONAL_CONTAINER__VIEW:
				getView().clear();
				return;
			case RelationalPackage.RELATIONAL_CONTAINER__QUERY_COLUMN_SET:
				getQueryColumnSet().clear();
				return;
			case RelationalPackage.RELATIONAL_CONTAINER__SQL_DATA_TYPE:
				getSQLDataType().clear();
				return;
			case RelationalPackage.RELATIONAL_CONTAINER__SQL_DISTINCT_TYPE:
				getSQLDistinctType().clear();
				return;
			case RelationalPackage.RELATIONAL_CONTAINER__SQL_SIMPLE_TYPE:
				getSQLSimpleType().clear();
				return;
			case RelationalPackage.RELATIONAL_CONTAINER__SQL_STRUCTURED_TYPE:
				getSQLStructuredType().clear();
				return;
			case RelationalPackage.RELATIONAL_CONTAINER__COLUMN:
				getColumn().clear();
				return;
			case RelationalPackage.RELATIONAL_CONTAINER__PROCEDURE:
				getProcedure().clear();
				return;
			case RelationalPackage.RELATIONAL_CONTAINER__TRIGGER:
				getTrigger().clear();
				return;
			case RelationalPackage.RELATIONAL_CONTAINER__SQL_INDEX:
				getSQLIndex().clear();
				return;
			case RelationalPackage.RELATIONAL_CONTAINER__UNIQUE_CONSTRAINT:
				getUniqueConstraint().clear();
				return;
			case RelationalPackage.RELATIONAL_CONTAINER__FOREIGN_KEY:
				getForeignKey().clear();
				return;
			case RelationalPackage.RELATIONAL_CONTAINER__SQL_INDEX_COLUMN:
				getSQLIndexColumn().clear();
				return;
			case RelationalPackage.RELATIONAL_CONTAINER__PRIMARY_KEY:
				getPrimaryKey().clear();
				return;
			case RelationalPackage.RELATIONAL_CONTAINER__ROW:
				getRow().clear();
				return;
			case RelationalPackage.RELATIONAL_CONTAINER__COLUMN_VALUE:
				getColumnValue().clear();
				return;
			case RelationalPackage.RELATIONAL_CONTAINER__CHECK_CONSTRAINT:
				getCheckConstraint().clear();
				return;
			case RelationalPackage.RELATIONAL_CONTAINER__ROW_SET:
				getRowSet().clear();
				return;
			case RelationalPackage.RELATIONAL_CONTAINER__SQL_PARAMETER:
				getSQLParameter().clear();
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
			case RelationalPackage.RELATIONAL_CONTAINER__CATALOG:
				return catalog != null && !catalog.isEmpty();
			case RelationalPackage.RELATIONAL_CONTAINER__SCHEMA:
				return schema != null && !schema.isEmpty();
			case RelationalPackage.RELATIONAL_CONTAINER__COLUMN_SET:
				return columnSet != null && !columnSet.isEmpty();
			case RelationalPackage.RELATIONAL_CONTAINER__NAMED_COLUMN_SET:
				return namedColumnSet != null && !namedColumnSet.isEmpty();
			case RelationalPackage.RELATIONAL_CONTAINER__TABLE:
				return table != null && !table.isEmpty();
			case RelationalPackage.RELATIONAL_CONTAINER__VIEW:
				return view != null && !view.isEmpty();
			case RelationalPackage.RELATIONAL_CONTAINER__QUERY_COLUMN_SET:
				return queryColumnSet != null && !queryColumnSet.isEmpty();
			case RelationalPackage.RELATIONAL_CONTAINER__SQL_DATA_TYPE:
				return sqlDataType != null && !sqlDataType.isEmpty();
			case RelationalPackage.RELATIONAL_CONTAINER__SQL_DISTINCT_TYPE:
				return sqlDistinctType != null && !sqlDistinctType.isEmpty();
			case RelationalPackage.RELATIONAL_CONTAINER__SQL_SIMPLE_TYPE:
				return sqlSimpleType != null && !sqlSimpleType.isEmpty();
			case RelationalPackage.RELATIONAL_CONTAINER__SQL_STRUCTURED_TYPE:
				return sqlStructuredType != null && !sqlStructuredType.isEmpty();
			case RelationalPackage.RELATIONAL_CONTAINER__COLUMN:
				return column != null && !column.isEmpty();
			case RelationalPackage.RELATIONAL_CONTAINER__PROCEDURE:
				return procedure != null && !procedure.isEmpty();
			case RelationalPackage.RELATIONAL_CONTAINER__TRIGGER:
				return trigger != null && !trigger.isEmpty();
			case RelationalPackage.RELATIONAL_CONTAINER__SQL_INDEX:
				return sqlIndex != null && !sqlIndex.isEmpty();
			case RelationalPackage.RELATIONAL_CONTAINER__UNIQUE_CONSTRAINT:
				return uniqueConstraint != null && !uniqueConstraint.isEmpty();
			case RelationalPackage.RELATIONAL_CONTAINER__FOREIGN_KEY:
				return foreignKey != null && !foreignKey.isEmpty();
			case RelationalPackage.RELATIONAL_CONTAINER__SQL_INDEX_COLUMN:
				return sqlIndexColumn != null && !sqlIndexColumn.isEmpty();
			case RelationalPackage.RELATIONAL_CONTAINER__PRIMARY_KEY:
				return primaryKey != null && !primaryKey.isEmpty();
			case RelationalPackage.RELATIONAL_CONTAINER__ROW:
				return row != null && !row.isEmpty();
			case RelationalPackage.RELATIONAL_CONTAINER__COLUMN_VALUE:
				return columnValue != null && !columnValue.isEmpty();
			case RelationalPackage.RELATIONAL_CONTAINER__CHECK_CONSTRAINT:
				return checkConstraint != null && !checkConstraint.isEmpty();
			case RelationalPackage.RELATIONAL_CONTAINER__ROW_SET:
				return rowSet != null && !rowSet.isEmpty();
			case RelationalPackage.RELATIONAL_CONTAINER__SQL_PARAMETER:
				return sqlParameter != null && !sqlParameter.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Relational_containerImpl

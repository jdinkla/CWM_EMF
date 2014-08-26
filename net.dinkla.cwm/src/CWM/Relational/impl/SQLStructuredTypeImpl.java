/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Relational.impl;

import CWM.Relational.Column;
import CWM.Relational.NamedColumnSet;
import CWM.Relational.RelationalPackage;
import CWM.Relational.SQLStructuredType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SQL Structured Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CWM.Relational.impl.SQLStructuredTypeImpl#getReferencingColumn <em>Referencing Column</em>}</li>
 *   <li>{@link CWM.Relational.impl.SQLStructuredTypeImpl#getColumnSet <em>Column Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SQLStructuredTypeImpl extends SQLDataTypeImpl implements SQLStructuredType {
	/**
	 * The cached value of the '{@link #getReferencingColumn() <em>Referencing Column</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencingColumn()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> referencingColumn;

	/**
	 * The cached value of the '{@link #getColumnSet() <em>Column Set</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnSet()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedColumnSet> columnSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SQLStructuredTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RelationalPackage.Literals.SQL_STRUCTURED_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Column> getReferencingColumn() {
		if (referencingColumn == null) {
			referencingColumn = new EObjectWithInverseResolvingEList<Column>(Column.class, this, RelationalPackage.SQL_STRUCTURED_TYPE__REFERENCING_COLUMN, RelationalPackage.COLUMN__REFERENCED_TABLE_TYPE);
		}
		return referencingColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedColumnSet> getColumnSet() {
		if (columnSet == null) {
			columnSet = new EObjectWithInverseResolvingEList<NamedColumnSet>(NamedColumnSet.class, this, RelationalPackage.SQL_STRUCTURED_TYPE__COLUMN_SET, RelationalPackage.NAMED_COLUMN_SET__TYPE);
		}
		return columnSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RelationalPackage.SQL_STRUCTURED_TYPE__REFERENCING_COLUMN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferencingColumn()).basicAdd(otherEnd, msgs);
			case RelationalPackage.SQL_STRUCTURED_TYPE__COLUMN_SET:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getColumnSet()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RelationalPackage.SQL_STRUCTURED_TYPE__REFERENCING_COLUMN:
				return ((InternalEList<?>)getReferencingColumn()).basicRemove(otherEnd, msgs);
			case RelationalPackage.SQL_STRUCTURED_TYPE__COLUMN_SET:
				return ((InternalEList<?>)getColumnSet()).basicRemove(otherEnd, msgs);
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
			case RelationalPackage.SQL_STRUCTURED_TYPE__REFERENCING_COLUMN:
				return getReferencingColumn();
			case RelationalPackage.SQL_STRUCTURED_TYPE__COLUMN_SET:
				return getColumnSet();
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
			case RelationalPackage.SQL_STRUCTURED_TYPE__REFERENCING_COLUMN:
				getReferencingColumn().clear();
				getReferencingColumn().addAll((Collection<? extends Column>)newValue);
				return;
			case RelationalPackage.SQL_STRUCTURED_TYPE__COLUMN_SET:
				getColumnSet().clear();
				getColumnSet().addAll((Collection<? extends NamedColumnSet>)newValue);
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
			case RelationalPackage.SQL_STRUCTURED_TYPE__REFERENCING_COLUMN:
				getReferencingColumn().clear();
				return;
			case RelationalPackage.SQL_STRUCTURED_TYPE__COLUMN_SET:
				getColumnSet().clear();
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
			case RelationalPackage.SQL_STRUCTURED_TYPE__REFERENCING_COLUMN:
				return referencingColumn != null && !referencingColumn.isEmpty();
			case RelationalPackage.SQL_STRUCTURED_TYPE__COLUMN_SET:
				return columnSet != null && !columnSet.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SQLStructuredTypeImpl

/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Relational;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SQL Structured Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Relational.SQLStructuredType#getReferencingColumn <em>Referencing Column</em>}</li>
 *   <li>{@link CWM.Relational.SQLStructuredType#getColumnSet <em>Column Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Relational.RelationalPackage#getSQLStructuredType()
 * @model
 * @generated
 */
public interface SQLStructuredType extends SQLDataType, CWM.Core.Class {
	/**
	 * Returns the value of the '<em><b>Referencing Column</b></em>' reference list.
	 * The list contents are of type {@link CWM.Relational.Column}.
	 * It is bidirectional and its opposite is '{@link CWM.Relational.Column#getReferencedTableType <em>Referenced Table Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referencing Column</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referencing Column</em>' reference list.
	 * @see CWM.Relational.RelationalPackage#getSQLStructuredType_ReferencingColumn()
	 * @see CWM.Relational.Column#getReferencedTableType
	 * @model opposite="referencedTableType" ordered="false"
	 * @generated
	 */
	EList<Column> getReferencingColumn();

	/**
	 * Returns the value of the '<em><b>Column Set</b></em>' reference list.
	 * The list contents are of type {@link CWM.Relational.NamedColumnSet}.
	 * It is bidirectional and its opposite is '{@link CWM.Relational.NamedColumnSet#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Set</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Set</em>' reference list.
	 * @see CWM.Relational.RelationalPackage#getSQLStructuredType_ColumnSet()
	 * @see CWM.Relational.NamedColumnSet#getType
	 * @model opposite="type" ordered="false"
	 * @generated
	 */
	EList<NamedColumnSet> getColumnSet();

} // SQLStructuredType

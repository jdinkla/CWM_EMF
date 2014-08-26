/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Relational;

import CWM.DataTypes.QueryExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Relational.View#getIsReadOnly <em>Is Read Only</em>}</li>
 *   <li>{@link CWM.Relational.View#getCheckOption <em>Check Option</em>}</li>
 *   <li>{@link CWM.Relational.View#getQueryExpression <em>Query Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Relational.RelationalPackage#getView()
 * @model
 * @generated
 */
public interface View extends NamedColumnSet {
	/**
	 * Returns the value of the '<em><b>Is Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Read Only</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Read Only</em>' attribute.
	 * @see #setIsReadOnly(Boolean)
	 * @see CWM.Relational.RelationalPackage#getView_IsReadOnly()
	 * @model unique="false" dataType="CWM.Core.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsReadOnly();

	/**
	 * Sets the value of the '{@link CWM.Relational.View#getIsReadOnly <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Read Only</em>' attribute.
	 * @see #getIsReadOnly()
	 * @generated
	 */
	void setIsReadOnly(Boolean value);

	/**
	 * Returns the value of the '<em><b>Check Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Check Option</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check Option</em>' attribute.
	 * @see #setCheckOption(Boolean)
	 * @see CWM.Relational.RelationalPackage#getView_CheckOption()
	 * @model unique="false" dataType="CWM.Core.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getCheckOption();

	/**
	 * Sets the value of the '{@link CWM.Relational.View#getCheckOption <em>Check Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check Option</em>' attribute.
	 * @see #getCheckOption()
	 * @generated
	 */
	void setCheckOption(Boolean value);

	/**
	 * Returns the value of the '<em><b>Query Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Expression</em>' containment reference.
	 * @see #setQueryExpression(QueryExpression)
	 * @see CWM.Relational.RelationalPackage#getView_QueryExpression()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	QueryExpression getQueryExpression();

	/**
	 * Sets the value of the '{@link CWM.Relational.View#getQueryExpression <em>Query Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Expression</em>' containment reference.
	 * @see #getQueryExpression()
	 * @generated
	 */
	void setQueryExpression(QueryExpression value);

} // View

/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Relational;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catalog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Relational.Catalog#getDefaultCharacterSetName <em>Default Character Set Name</em>}</li>
 *   <li>{@link CWM.Relational.Catalog#getDefaultCollationName <em>Default Collation Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Relational.RelationalPackage#getCatalog()
 * @model
 * @generated
 */
public interface Catalog extends CWM.Core.Package {
	/**
	 * Returns the value of the '<em><b>Default Character Set Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Character Set Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Character Set Name</em>' attribute.
	 * @see #setDefaultCharacterSetName(String)
	 * @see CWM.Relational.RelationalPackage#getCatalog_DefaultCharacterSetName()
	 * @model unique="false" dataType="CWM.Core.String" required="true" ordered="false"
	 * @generated
	 */
	String getDefaultCharacterSetName();

	/**
	 * Sets the value of the '{@link CWM.Relational.Catalog#getDefaultCharacterSetName <em>Default Character Set Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Character Set Name</em>' attribute.
	 * @see #getDefaultCharacterSetName()
	 * @generated
	 */
	void setDefaultCharacterSetName(String value);

	/**
	 * Returns the value of the '<em><b>Default Collation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Collation Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Collation Name</em>' attribute.
	 * @see #setDefaultCollationName(String)
	 * @see CWM.Relational.RelationalPackage#getCatalog_DefaultCollationName()
	 * @model unique="false" dataType="CWM.Core.String" required="true" ordered="false"
	 * @generated
	 */
	String getDefaultCollationName();

	/**
	 * Sets the value of the '{@link CWM.Relational.Catalog#getDefaultCollationName <em>Default Collation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Collation Name</em>' attribute.
	 * @see #getDefaultCollationName()
	 * @generated
	 */
	void setDefaultCollationName(String value);

} // Catalog

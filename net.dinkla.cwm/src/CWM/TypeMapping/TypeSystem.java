/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.TypeMapping;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.TypeMapping.TypeSystem#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.TypeMapping.TypeMappingPackage#getTypeSystem()
 * @model
 * @generated
 */
public interface TypeSystem extends CWM.Core.Package {
	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see CWM.TypeMapping.TypeMappingPackage#getTypeSystem_Version()
	 * @model unique="false" dataType="CWM.Core.String" required="true" ordered="false"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link CWM.TypeMapping.TypeSystem#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // TypeSystem

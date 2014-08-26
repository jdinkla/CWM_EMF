/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.EntryPoint;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catalog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.MiningCore.EntryPoint.Catalog#getSchema <em>Schema</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.MiningCore.EntryPoint.EntryPointPackage#getCatalog()
 * @model
 * @generated
 */
public interface Catalog extends CWM.Core.Package {
	/**
	 * Returns the value of the '<em><b>Schema</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.MiningCore.EntryPoint.Schema}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' containment reference list.
	 * @see CWM.MiningCore.EntryPoint.EntryPointPackage#getCatalog_Schema()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Schema> getSchema();

} // Catalog

/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningData;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category Matrix Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.MiningCore.MiningData.CategoryMatrixObject#getEntry <em>Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.MiningCore.MiningData.MiningDataPackage#getCategoryMatrixObject()
 * @model
 * @generated
 */
public interface CategoryMatrixObject extends CategoryMatrix {
	/**
	 * Returns the value of the '<em><b>Entry</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.MiningCore.MiningData.CategoryMatrixEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry</em>' containment reference list.
	 * @see CWM.MiningCore.MiningData.MiningDataPackage#getCategoryMatrixObject_Entry()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<CategoryMatrixEntry> getEntry();

} // CategoryMatrixObject

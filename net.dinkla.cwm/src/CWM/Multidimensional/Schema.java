/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Multidimensional;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Multidimensional.Schema#getDimensionedObject <em>Dimensioned Object</em>}</li>
 *   <li>{@link CWM.Multidimensional.Schema#getDimension <em>Dimension</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Multidimensional.MultidimensionalPackage#getSchema()
 * @model
 * @generated
 */
public interface Schema extends CWM.Core.Package {
	/**
	 * Returns the value of the '<em><b>Dimensioned Object</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Multidimensional.DimensionedObject}.
	 * It is bidirectional and its opposite is '{@link CWM.Multidimensional.DimensionedObject#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimensioned Object</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimensioned Object</em>' containment reference list.
	 * @see CWM.Multidimensional.MultidimensionalPackage#getSchema_DimensionedObject()
	 * @see CWM.Multidimensional.DimensionedObject#getSchema
	 * @model opposite="schema" containment="true" ordered="false"
	 * @generated
	 */
	EList<DimensionedObject> getDimensionedObject();

	/**
	 * Returns the value of the '<em><b>Dimension</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Multidimensional.Dimension}.
	 * It is bidirectional and its opposite is '{@link CWM.Multidimensional.Dimension#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimension</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension</em>' containment reference list.
	 * @see CWM.Multidimensional.MultidimensionalPackage#getSchema_Dimension()
	 * @see CWM.Multidimensional.Dimension#getSchema
	 * @model opposite="schema" containment="true" ordered="false"
	 * @generated
	 */
	EList<Dimension> getDimension();

} // Schema

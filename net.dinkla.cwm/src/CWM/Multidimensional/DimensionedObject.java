/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Multidimensional;

import CWM.Core.Attribute;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dimensioned Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Multidimensional.DimensionedObject#getDimension <em>Dimension</em>}</li>
 *   <li>{@link CWM.Multidimensional.DimensionedObject#getSchema <em>Schema</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Multidimensional.MultidimensionalPackage#getDimensionedObject()
 * @model
 * @generated
 */
public interface DimensionedObject extends Attribute {
	/**
	 * Returns the value of the '<em><b>Dimension</b></em>' reference list.
	 * The list contents are of type {@link CWM.Multidimensional.Dimension}.
	 * It is bidirectional and its opposite is '{@link CWM.Multidimensional.Dimension#getDimensionedObject <em>Dimensioned Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimension</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension</em>' reference list.
	 * @see CWM.Multidimensional.MultidimensionalPackage#getDimensionedObject_Dimension()
	 * @see CWM.Multidimensional.Dimension#getDimensionedObject
	 * @model opposite="dimensionedObject" ordered="false"
	 * @generated
	 */
	EList<Dimension> getDimension();

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link CWM.Multidimensional.Schema#getDimensionedObject <em>Dimensioned Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' container reference.
	 * @see #setSchema(Schema)
	 * @see CWM.Multidimensional.MultidimensionalPackage#getDimensionedObject_Schema()
	 * @see CWM.Multidimensional.Schema#getDimensionedObject
	 * @model opposite="dimensionedObject" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Schema getSchema();

	/**
	 * Sets the value of the '{@link CWM.Multidimensional.DimensionedObject#getSchema <em>Schema</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema</em>' container reference.
	 * @see #getSchema()
	 * @generated
	 */
	void setSchema(Schema value);

} // DimensionedObject

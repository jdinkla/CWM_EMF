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
 * A representation of the model object '<em><b>Dimension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Multidimensional.Dimension#getDimensionedObject <em>Dimensioned Object</em>}</li>
 *   <li>{@link CWM.Multidimensional.Dimension#getComponent <em>Component</em>}</li>
 *   <li>{@link CWM.Multidimensional.Dimension#getComposite <em>Composite</em>}</li>
 *   <li>{@link CWM.Multidimensional.Dimension#getMemberSet <em>Member Set</em>}</li>
 *   <li>{@link CWM.Multidimensional.Dimension#getSchema <em>Schema</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Multidimensional.MultidimensionalPackage#getDimension()
 * @model
 * @generated
 */
public interface Dimension extends CWM.Core.Class {
	/**
	 * Returns the value of the '<em><b>Dimensioned Object</b></em>' reference list.
	 * The list contents are of type {@link CWM.Multidimensional.DimensionedObject}.
	 * It is bidirectional and its opposite is '{@link CWM.Multidimensional.DimensionedObject#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimensioned Object</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimensioned Object</em>' reference list.
	 * @see CWM.Multidimensional.MultidimensionalPackage#getDimension_DimensionedObject()
	 * @see CWM.Multidimensional.DimensionedObject#getDimension
	 * @model opposite="dimension"
	 * @generated
	 */
	EList<DimensionedObject> getDimensionedObject();

	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference list.
	 * The list contents are of type {@link CWM.Multidimensional.Dimension}.
	 * It is bidirectional and its opposite is '{@link CWM.Multidimensional.Dimension#getComposite <em>Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' reference list.
	 * @see CWM.Multidimensional.MultidimensionalPackage#getDimension_Component()
	 * @see CWM.Multidimensional.Dimension#getComposite
	 * @model opposite="composite" ordered="false"
	 * @generated
	 */
	EList<Dimension> getComponent();

	/**
	 * Returns the value of the '<em><b>Composite</b></em>' reference list.
	 * The list contents are of type {@link CWM.Multidimensional.Dimension}.
	 * It is bidirectional and its opposite is '{@link CWM.Multidimensional.Dimension#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composite</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composite</em>' reference list.
	 * @see CWM.Multidimensional.MultidimensionalPackage#getDimension_Composite()
	 * @see CWM.Multidimensional.Dimension#getComponent
	 * @model opposite="component" ordered="false"
	 * @generated
	 */
	EList<Dimension> getComposite();

	/**
	 * Returns the value of the '<em><b>Member Set</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Multidimensional.MemberSet}.
	 * It is bidirectional and its opposite is '{@link CWM.Multidimensional.MemberSet#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member Set</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Set</em>' containment reference list.
	 * @see CWM.Multidimensional.MultidimensionalPackage#getDimension_MemberSet()
	 * @see CWM.Multidimensional.MemberSet#getDimension
	 * @model opposite="dimension" containment="true" ordered="false"
	 * @generated
	 */
	EList<MemberSet> getMemberSet();

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link CWM.Multidimensional.Schema#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' container reference.
	 * @see #setSchema(Schema)
	 * @see CWM.Multidimensional.MultidimensionalPackage#getDimension_Schema()
	 * @see CWM.Multidimensional.Schema#getDimension
	 * @model opposite="dimension" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Schema getSchema();

	/**
	 * Sets the value of the '{@link CWM.Multidimensional.Dimension#getSchema <em>Schema</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema</em>' container reference.
	 * @see #getSchema()
	 * @generated
	 */
	void setSchema(Schema value);

} // Dimension

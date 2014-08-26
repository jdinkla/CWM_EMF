/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Olap;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cube Dimension Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Olap.CubeDimensionAssociation#getDimension <em>Dimension</em>}</li>
 *   <li>{@link CWM.Olap.CubeDimensionAssociation#getCube <em>Cube</em>}</li>
 *   <li>{@link CWM.Olap.CubeDimensionAssociation#getCalcHierarchy <em>Calc Hierarchy</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Olap.OlapPackage#getCubeDimensionAssociation()
 * @model
 * @generated
 */
public interface CubeDimensionAssociation extends CWM.Core.Class {
	/**
	 * Returns the value of the '<em><b>Dimension</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CWM.Olap.Dimension#getCubeDimensionAssociation <em>Cube Dimension Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimension</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension</em>' reference.
	 * @see #setDimension(Dimension)
	 * @see CWM.Olap.OlapPackage#getCubeDimensionAssociation_Dimension()
	 * @see CWM.Olap.Dimension#getCubeDimensionAssociation
	 * @model opposite="cubeDimensionAssociation" required="true" ordered="false"
	 * @generated
	 */
	Dimension getDimension();

	/**
	 * Sets the value of the '{@link CWM.Olap.CubeDimensionAssociation#getDimension <em>Dimension</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimension</em>' reference.
	 * @see #getDimension()
	 * @generated
	 */
	void setDimension(Dimension value);

	/**
	 * Returns the value of the '<em><b>Cube</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link CWM.Olap.Cube#getCubeDimensionAssociation <em>Cube Dimension Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cube</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cube</em>' container reference.
	 * @see #setCube(Cube)
	 * @see CWM.Olap.OlapPackage#getCubeDimensionAssociation_Cube()
	 * @see CWM.Olap.Cube#getCubeDimensionAssociation
	 * @model opposite="cubeDimensionAssociation" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Cube getCube();

	/**
	 * Sets the value of the '{@link CWM.Olap.CubeDimensionAssociation#getCube <em>Cube</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cube</em>' container reference.
	 * @see #getCube()
	 * @generated
	 */
	void setCube(Cube value);

	/**
	 * Returns the value of the '<em><b>Calc Hierarchy</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CWM.Olap.Hierarchy#getCubeDimensionAssociation <em>Cube Dimension Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calc Hierarchy</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calc Hierarchy</em>' reference.
	 * @see #setCalcHierarchy(Hierarchy)
	 * @see CWM.Olap.OlapPackage#getCubeDimensionAssociation_CalcHierarchy()
	 * @see CWM.Olap.Hierarchy#getCubeDimensionAssociation
	 * @model opposite="cubeDimensionAssociation" ordered="false"
	 * @generated
	 */
	Hierarchy getCalcHierarchy();

	/**
	 * Sets the value of the '{@link CWM.Olap.CubeDimensionAssociation#getCalcHierarchy <em>Calc Hierarchy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calc Hierarchy</em>' reference.
	 * @see #getCalcHierarchy()
	 * @generated
	 */
	void setCalcHierarchy(Hierarchy value);

} // CubeDimensionAssociation

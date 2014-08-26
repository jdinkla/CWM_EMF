/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Olap;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cube</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Olap.Cube#getIsVirtual <em>Is Virtual</em>}</li>
 *   <li>{@link CWM.Olap.Cube#getCubeDimensionAssociation <em>Cube Dimension Association</em>}</li>
 *   <li>{@link CWM.Olap.Cube#getCubeRegion <em>Cube Region</em>}</li>
 *   <li>{@link CWM.Olap.Cube#getSchema <em>Schema</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Olap.OlapPackage#getCube()
 * @model
 * @generated
 */
public interface Cube extends CWM.Core.Class {
	/**
	 * Returns the value of the '<em><b>Is Virtual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Virtual</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Virtual</em>' attribute.
	 * @see #setIsVirtual(Boolean)
	 * @see CWM.Olap.OlapPackage#getCube_IsVirtual()
	 * @model unique="false" dataType="CWM.Core.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsVirtual();

	/**
	 * Sets the value of the '{@link CWM.Olap.Cube#getIsVirtual <em>Is Virtual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Virtual</em>' attribute.
	 * @see #getIsVirtual()
	 * @generated
	 */
	void setIsVirtual(Boolean value);

	/**
	 * Returns the value of the '<em><b>Cube Dimension Association</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Olap.CubeDimensionAssociation}.
	 * It is bidirectional and its opposite is '{@link CWM.Olap.CubeDimensionAssociation#getCube <em>Cube</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cube Dimension Association</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cube Dimension Association</em>' containment reference list.
	 * @see CWM.Olap.OlapPackage#getCube_CubeDimensionAssociation()
	 * @see CWM.Olap.CubeDimensionAssociation#getCube
	 * @model opposite="cube" containment="true" ordered="false"
	 * @generated
	 */
	EList<CubeDimensionAssociation> getCubeDimensionAssociation();

	/**
	 * Returns the value of the '<em><b>Cube Region</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Olap.CubeRegion}.
	 * It is bidirectional and its opposite is '{@link CWM.Olap.CubeRegion#getCube <em>Cube</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cube Region</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cube Region</em>' containment reference list.
	 * @see CWM.Olap.OlapPackage#getCube_CubeRegion()
	 * @see CWM.Olap.CubeRegion#getCube
	 * @model opposite="cube" containment="true" ordered="false"
	 * @generated
	 */
	EList<CubeRegion> getCubeRegion();

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link CWM.Olap.Schema#getCube <em>Cube</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' container reference.
	 * @see #setSchema(Schema)
	 * @see CWM.Olap.OlapPackage#getCube_Schema()
	 * @see CWM.Olap.Schema#getCube
	 * @model opposite="cube" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Schema getSchema();

	/**
	 * Sets the value of the '{@link CWM.Olap.Cube#getSchema <em>Schema</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema</em>' container reference.
	 * @see #getSchema()
	 * @generated
	 */
	void setSchema(Schema value);

} // Cube

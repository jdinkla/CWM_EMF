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
 * A representation of the model object '<em><b>Dimension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Olap.Dimension#getIsTime <em>Is Time</em>}</li>
 *   <li>{@link CWM.Olap.Dimension#getIsMeasure <em>Is Measure</em>}</li>
 *   <li>{@link CWM.Olap.Dimension#getHierarchy <em>Hierarchy</em>}</li>
 *   <li>{@link CWM.Olap.Dimension#getMemberSelection <em>Member Selection</em>}</li>
 *   <li>{@link CWM.Olap.Dimension#getCubeDimensionAssociation <em>Cube Dimension Association</em>}</li>
 *   <li>{@link CWM.Olap.Dimension#getDisplayDefault <em>Display Default</em>}</li>
 *   <li>{@link CWM.Olap.Dimension#getSchema <em>Schema</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Olap.OlapPackage#getDimension()
 * @model
 * @generated
 */
public interface Dimension extends CWM.Core.Class {
	/**
	 * Returns the value of the '<em><b>Is Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Time</em>' attribute.
	 * @see #setIsTime(Boolean)
	 * @see CWM.Olap.OlapPackage#getDimension_IsTime()
	 * @model unique="false" dataType="CWM.Core.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsTime();

	/**
	 * Sets the value of the '{@link CWM.Olap.Dimension#getIsTime <em>Is Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Time</em>' attribute.
	 * @see #getIsTime()
	 * @generated
	 */
	void setIsTime(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Measure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Measure</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Measure</em>' attribute.
	 * @see #setIsMeasure(Boolean)
	 * @see CWM.Olap.OlapPackage#getDimension_IsMeasure()
	 * @model unique="false" dataType="CWM.Core.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsMeasure();

	/**
	 * Sets the value of the '{@link CWM.Olap.Dimension#getIsMeasure <em>Is Measure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Measure</em>' attribute.
	 * @see #getIsMeasure()
	 * @generated
	 */
	void setIsMeasure(Boolean value);

	/**
	 * Returns the value of the '<em><b>Hierarchy</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Olap.Hierarchy}.
	 * It is bidirectional and its opposite is '{@link CWM.Olap.Hierarchy#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hierarchy</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hierarchy</em>' containment reference list.
	 * @see CWM.Olap.OlapPackage#getDimension_Hierarchy()
	 * @see CWM.Olap.Hierarchy#getDimension
	 * @model opposite="dimension" containment="true" ordered="false"
	 * @generated
	 */
	EList<Hierarchy> getHierarchy();

	/**
	 * Returns the value of the '<em><b>Member Selection</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Olap.MemberSelection}.
	 * It is bidirectional and its opposite is '{@link CWM.Olap.MemberSelection#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member Selection</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Selection</em>' containment reference list.
	 * @see CWM.Olap.OlapPackage#getDimension_MemberSelection()
	 * @see CWM.Olap.MemberSelection#getDimension
	 * @model opposite="dimension" containment="true" ordered="false"
	 * @generated
	 */
	EList<MemberSelection> getMemberSelection();

	/**
	 * Returns the value of the '<em><b>Cube Dimension Association</b></em>' reference list.
	 * The list contents are of type {@link CWM.Olap.CubeDimensionAssociation}.
	 * It is bidirectional and its opposite is '{@link CWM.Olap.CubeDimensionAssociation#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cube Dimension Association</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cube Dimension Association</em>' reference list.
	 * @see CWM.Olap.OlapPackage#getDimension_CubeDimensionAssociation()
	 * @see CWM.Olap.CubeDimensionAssociation#getDimension
	 * @model opposite="dimension" ordered="false"
	 * @generated
	 */
	EList<CubeDimensionAssociation> getCubeDimensionAssociation();

	/**
	 * Returns the value of the '<em><b>Display Default</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CWM.Olap.Hierarchy#getDefaultedDimension <em>Defaulted Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Default</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Default</em>' reference.
	 * @see #setDisplayDefault(Hierarchy)
	 * @see CWM.Olap.OlapPackage#getDimension_DisplayDefault()
	 * @see CWM.Olap.Hierarchy#getDefaultedDimension
	 * @model opposite="defaultedDimension" ordered="false"
	 * @generated
	 */
	Hierarchy getDisplayDefault();

	/**
	 * Sets the value of the '{@link CWM.Olap.Dimension#getDisplayDefault <em>Display Default</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Default</em>' reference.
	 * @see #getDisplayDefault()
	 * @generated
	 */
	void setDisplayDefault(Hierarchy value);

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link CWM.Olap.Schema#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' container reference.
	 * @see #setSchema(Schema)
	 * @see CWM.Olap.OlapPackage#getDimension_Schema()
	 * @see CWM.Olap.Schema#getDimension
	 * @model opposite="dimension" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Schema getSchema();

	/**
	 * Sets the value of the '{@link CWM.Olap.Dimension#getSchema <em>Schema</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema</em>' container reference.
	 * @see #getSchema()
	 * @generated
	 */
	void setSchema(Schema value);

} // Dimension
